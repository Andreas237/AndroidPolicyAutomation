.class public Lme/pushy/sdk/util/PushyEnterprise;
.super Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static isConfigured(Landroid/content/Context;)Z
    .locals 2

    const-string v0, "pushyEnterpriseAPIEndpoint"

    const/4 v1, 0x0

    invoke-static {v0, v1, p0}, Lme/pushy/sdk/util/PushyPreferences;->getString(Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;)Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method
