.class public Lcom/huawei/qrcode/logic/bi/BiAnalyticsManager;
.super Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static notAllowReportBI(Landroid/content/Context;)Z
    .locals 1

    invoke-static {p0}, Lcom/huawei/qrcode/util/SettingUtil;->hasUserExperienceConfig(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p0}, Lcom/huawei/qrcode/util/SettingUtil;->isAgreeUserExperience(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public static onEvent(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    invoke-static {p0}, Lcom/huawei/qrcode/logic/bi/BiAnalyticsManager;->notAllowReportBI(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    return-void
.end method

.method public static onReport(Landroid/content/Context;)V
    .locals 1

    invoke-static {p0}, Lcom/huawei/qrcode/logic/bi/BiAnalyticsManager;->notAllowReportBI(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    return-void
.end method

.method public static setRecordExpireTimeOut(J)V
    .locals 0

    return-void
.end method
