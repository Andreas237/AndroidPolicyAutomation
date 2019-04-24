.class public Lcom/huawei/wallet/utils/BaseLibUtil;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static c(Landroid/content/Context;)V
    .locals 3

    .line 41
    const/4 v0, 0x0

    if-eq v0, p0, :cond_1

    .line 46
    new-instance v2, Landroid/content/Intent;

    const-string v0, "android.settings.SETTINGS"

    invoke-direct {v2, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 48
    instance-of v0, p0, Landroid/app/Activity;

    if-nez v0, :cond_0

    .line 51
    const-string v0, "context is not Activity"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->c(Ljava/lang/String;Z)V

    .line 52
    const/high16 v0, 0x10000000

    invoke-virtual {v2, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 55
    :cond_0
    invoke-virtual {p0, v2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 56
    goto :goto_0

    .line 59
    :cond_1
    const-string v0, "jumpToSettings but context is null"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->b(Ljava/lang/String;Z)V

    .line 61
    :goto_0
    return-void
.end method
