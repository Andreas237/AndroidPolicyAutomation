.class public Lo/dqo;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b(Landroid/content/Context;)Ljava/lang/String;
    .locals 6
    .annotation build Landroid/annotation/TargetApi;
        value = 0x18
    .end annotation

    .line 55
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 56
    const-string v0, "SimCardInfo"

    const-string v1, "Get imsi failed, context is null."

    invoke-static {v0, v1}, Lo/dsc;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 57
    const/4 v0, 0x0

    return-object v0

    .line 59
    :cond_0
    const-string v0, "android.permission.READ_PHONE_STATE"

    invoke-static {v0, p0}, Lo/dqx;->c(Ljava/lang/String;Landroid/content/Context;)Z

    move-result v2

    .line 60
    if-nez v2, :cond_1

    .line 61
    const-string v0, "SimCardInfo"

    const-string v1, "Get imsi failed, do not has READ_PHONE_STATE permission."

    invoke-static {v0, v1}, Lo/dsc;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 62
    const/4 v0, 0x0

    return-object v0

    .line 64
    :cond_1
    invoke-static {p0}, Lo/dqo;->d(Landroid/content/Context;)I

    move-result v3

    .line 65
    const-string v0, "phone"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/telephony/TelephonyManager;

    .line 66
    invoke-virtual {v4, v3}, Landroid/telephony/TelephonyManager;->createForSubscriptionId(I)Landroid/telephony/TelephonyManager;

    move-result-object v5

    .line 67
    invoke-virtual {v5}, Landroid/telephony/TelephonyManager;->getSubscriberId()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static d(Landroid/content/Context;)I
    .locals 1
    .annotation build Landroid/annotation/TargetApi;
        value = 0x18
    .end annotation

    .line 46
    invoke-static {p0}, Landroid/telephony/SubscriptionManager;->from(Landroid/content/Context;)Landroid/telephony/SubscriptionManager;

    invoke-static {}, Landroid/telephony/SubscriptionManager;->getDefaultDataSubscriptionId()I

    move-result v0

    return v0
.end method
