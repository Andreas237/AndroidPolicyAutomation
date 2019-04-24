.class Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/cloudservice/LoginHandler;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "c"
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;)V
    .locals 0

    .line 587
    iput-object p1, p0, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity$c;->d:Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 588
    return-void
.end method


# virtual methods
.method public onError(Lcom/huawei/hwid/core/helper/handler/ErrorStatus;)V
    .locals 4

    .line 634
    const-string v0, "Login_ThirdPartyLoginActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "CloudHandler onError"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 635
    return-void
.end method

.method public onFinish([Lcom/huawei/cloudservice/CloudAccount;)V
    .locals 0

    .line 631
    return-void
.end method

.method public onLogin([Lcom/huawei/cloudservice/CloudAccount;I)V
    .locals 8

    .line 591
    if-eqz p1, :cond_0

    array-length v0, p1

    if-gtz v0, :cond_1

    .line 592
    :cond_0
    return-void

    .line 595
    :cond_1
    const/4 v4, 0x0

    .line 596
    const/4 v0, -0x1

    if-eq p2, v0, :cond_2

    .line 597
    aget-object v4, p1, p2

    goto :goto_0

    .line 599
    :cond_2
    return-void

    .line 601
    :goto_0
    const/4 v0, 0x0

    if-ne v0, v4, :cond_3

    .line 602
    return-void

    .line 604
    :cond_3
    new-instance v5, Lo/eui;

    invoke-direct {v5}, Lo/eui;-><init>()V

    .line 605
    invoke-virtual {v4}, Lcom/huawei/cloudservice/CloudAccount;->getAccountInfo()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "userId"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 606
    invoke-virtual {v5, v6}, Lo/eui;->e(Ljava/lang/String;)V

    .line 607
    invoke-virtual {v4}, Lcom/huawei/cloudservice/CloudAccount;->getServiceToken()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lo/eui;->a(Ljava/lang/String;)V

    .line 608
    invoke-virtual {v4}, Lcom/huawei/cloudservice/CloudAccount;->getAccountInfo()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "siteId"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v5, v0}, Lo/eui;->d(I)V

    .line 609
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Lo/eui;->c(I)V

    .line 612
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/LoginInit;->getUsetId()Ljava/lang/String;

    move-result-object v7

    .line 613
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_4

    invoke-virtual {v7, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 614
    const-string v0, "Login_ThirdPartyLoginActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "userid is changed"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 615
    iget-object v0, p0, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity$c;->d:Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;

    new-instance v1, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity$c$2;

    invoke-direct {v1, p0, v5, v7}, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity$c$2;-><init>(Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity$c;Lo/eui;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    goto :goto_1

    .line 622
    :cond_4
    const-string v0, "Login_ThirdPartyLoginActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "userid is not changed"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 623
    iget-object v0, p0, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity$c;->d:Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;

    invoke-static {v0, v5}, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;->c(Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;Lo/eui;)V

    .line 625
    :goto_1
    return-void
.end method

.method public onLogout([Lcom/huawei/cloudservice/CloudAccount;I)V
    .locals 0

    .line 628
    return-void
.end method
