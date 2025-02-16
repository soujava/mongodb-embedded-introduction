package org.soujava.demos.arangodb.document;

import jakarta.nosql.Column;
import jakarta.nosql.DiscriminatorValue;
import jakarta.nosql.Entity;
import net.datafaker.Faker;

import java.util.UUID;

@Entity
@DiscriminatorValue("AWS")
public class AWSCloudProvider extends CloudProvider {


    @Column
    private String accountId;

    public String getAccountId() {
        return accountId;
    }

    @Override
    public String toString() {
        return "AWSCloudProvider{" +
                "accountId='" + accountId + '\'' +
                ", id='" + id + '\'' +
                ", region='" + region + '\'' +
                '}';
    }

    public static AWSCloudProvider of(Faker faker) {
        var aws = faker.aws();
        var cloudProvider = new AWSCloudProvider();
        cloudProvider.region = aws.region();
        cloudProvider.region = aws.region();
        cloudProvider.id = UUID.randomUUID().toString();
        cloudProvider.accountId = aws.accountId();
        return cloudProvider;
    }


}
