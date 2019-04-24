.class public Lo/czh;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final d:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/String;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 34
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lo/czh;->d:Ljava/util/HashMap;

    .line 36
    sget-object v0, Lo/czh;->d:Ljava/util/HashMap;

    const-string v1, "healthRecommendUrl"

    const-string v2, "healthcloud"

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    sget-object v0, Lo/czh;->d:Ljava/util/HashMap;

    const-string v1, "activityUrl"

    const-string v2, "healthcloud"

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    sget-object v0, Lo/czh;->d:Ljava/util/HashMap;

    const-string v1, "messageCenterUrl"

    const-string v2, "healthcloud"

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    sget-object v0, Lo/czh;->d:Ljava/util/HashMap;

    const-string v1, "sportSuggestUrl"

    const-string v2, "healthcloud"

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    sget-object v0, Lo/czh;->d:Ljava/util/HashMap;

    const-string v1, "achievementUrl"

    const-string v2, "healthcloud"

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    sget-object v0, Lo/czh;->d:Ljava/util/HashMap;

    const-string v1, "healthCloudUrl"

    const-string v2, "healthcloud"

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    sget-object v0, Lo/czh;->d:Ljava/util/HashMap;

    const-string v1, "socialCloudUrl"

    const-string v2, "healthcloud"

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    sget-object v0, Lo/czh;->d:Ljava/util/HashMap;

    const-string v1, "socialCloudProfileUrl"

    const-string v2, "healthcloud"

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    sget-object v0, Lo/czh;->d:Ljava/util/HashMap;

    const-string v1, "socialCloudRankUrl"

    const-string v2, "healthcloud"

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    sget-object v0, Lo/czh;->d:Ljava/util/HashMap;

    const-string v1, "healthDeviceUrl"

    const-string v2, "healthcloud"

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    sget-object v0, Lo/czh;->d:Ljava/util/HashMap;

    const-string v1, "healthAPPToDeviceUrl"

    const-string v2, "healthcloud"

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    sget-object v0, Lo/czh;->d:Ljava/util/HashMap;

    const-string v1, "agreementservice"

    const-string v2, "com.huawei.health"

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    sget-object v0, Lo/czh;->d:Ljava/util/HashMap;

    const-string v1, "biOperation"

    const-string v2, "com.huawei.health"

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    sget-object v0, Lo/czh;->d:Ljava/util/HashMap;

    const-string v1, "getLatestVersion"

    const-string v2, "com.huawei.health"

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    sget-object v0, Lo/czh;->d:Ljava/util/HashMap;

    const-string v1, "userInfoAgreement"

    const-string v2, "com.huawei.health"

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    sget-object v0, Lo/czh;->d:Ljava/util/HashMap;

    const-string v1, "newVersionUrl"

    const-string v2, "com.huawei.health"

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    sget-object v0, Lo/czh;->d:Ljava/util/HashMap;

    const-string v1, "getToken"

    const-string v2, "com.huawei.health"

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    sget-object v0, Lo/czh;->d:Ljava/util/HashMap;

    const-string v1, "getBatchPluginUrl"

    const-string v2, "com.huawei.health"

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static c(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 58
    sget-object v0, Lo/czh;->d:Ljava/util/HashMap;

    invoke-virtual {v0, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method
