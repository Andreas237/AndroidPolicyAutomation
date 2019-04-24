.class public Lcom/huawei/cloudservice/CloudAccount;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Lcom/huawei/hwid/api/common/e;


# direct methods
.method public constructor <init>(Lcom/huawei/hwid/api/common/e;)V
    .locals 1

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/cloudservice/CloudAccount;->a:Lcom/huawei/hwid/api/common/e;

    .line 24
    iput-object p1, p0, Lcom/huawei/cloudservice/CloudAccount;->a:Lcom/huawei/hwid/api/common/e;

    .line 25
    return-void
.end method


# virtual methods
.method public getAccountData()Lcom/huawei/hwid/core/datatype/HwAccount;
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 33
    iget-object v0, p0, Lcom/huawei/cloudservice/CloudAccount;->a:Lcom/huawei/hwid/api/common/e;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 34
    new-instance v0, Lcom/huawei/hwid/api/common/e;

    invoke-direct {v0}, Lcom/huawei/hwid/api/common/e;-><init>()V

    iput-object v0, p0, Lcom/huawei/cloudservice/CloudAccount;->a:Lcom/huawei/hwid/api/common/e;

    .line 36
    :cond_0
    iget-object v0, p0, Lcom/huawei/cloudservice/CloudAccount;->a:Lcom/huawei/hwid/api/common/e;

    invoke-virtual {v0}, Lcom/huawei/hwid/api/common/e;->a()Lcom/huawei/hwid/core/datatype/HwAccount;

    move-result-object v0

    return-object v0
.end method

.method public getAccountInfo()Landroid/os/Bundle;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 215
    iget-object v0, p0, Lcom/huawei/cloudservice/CloudAccount;->a:Lcom/huawei/hwid/api/common/e;

    invoke-virtual {v0}, Lcom/huawei/hwid/api/common/e;->c()Landroid/os/Bundle;

    move-result-object v0

    return-object v0
.end method

.method public getAccountManagerDialog(Landroid/app/Activity;Ljava/lang/String;Landroid/os/Bundle;Lcom/huawei/cloudservice/CloudRequestHandler;)Landroid/app/AlertDialog;
    .locals 3

    .line 463
    if-eqz p1, :cond_0

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    if-nez p4, :cond_1

    .line 464
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 466
    :cond_1
    invoke-static {p1}, Lcom/huawei/hwid/api/common/o;->b(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 468
    const v0, 0x135c4c8

    invoke-static {p1, v0}, Lcom/huawei/hwid/api/common/o;->a(Landroid/content/Context;I)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 469
    new-instance v2, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;

    const-string v0, "hwid is low version"

    const/16 v1, 0x23

    invoke-direct {v2, v1, v0}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;-><init>(ILjava/lang/String;)V

    .line 470
    invoke-interface {p4, v2}, Lcom/huawei/cloudservice/CloudRequestHandler;->onError(Lcom/huawei/hwid/core/helper/handler/ErrorStatus;)V

    .line 471
    const/4 v0, 0x0

    return-object v0

    .line 474
    :cond_2
    iget-object v0, p0, Lcom/huawei/cloudservice/CloudAccount;->a:Lcom/huawei/hwid/api/common/e;

    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/huawei/hwid/api/common/e;->a(Landroid/app/Activity;Ljava/lang/String;Landroid/os/Bundle;Lcom/huawei/cloudservice/CloudRequestHandler;)Landroid/app/AlertDialog;

    move-result-object v0

    return-object v0

    .line 476
    :cond_3
    new-instance v2, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;

    const-string v0, "hwid is not exit"

    const/16 v1, 0x22

    invoke-direct {v2, v1, v0}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;-><init>(ILjava/lang/String;)V

    .line 477
    invoke-interface {p4, v2}, Lcom/huawei/cloudservice/CloudRequestHandler;->onError(Lcom/huawei/hwid/core/helper/handler/ErrorStatus;)V

    .line 478
    const/4 v0, 0x0

    return-object v0
.end method

.method public getAccountName()Ljava/lang/String;
    .locals 1

    .line 44
    invoke-virtual {p0}, Lcom/huawei/cloudservice/CloudAccount;->getAccountData()Lcom/huawei/hwid/core/datatype/HwAccount;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hwid/core/datatype/HwAccount;->b()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getAccountType()Ljava/lang/String;
    .locals 1

    .line 88
    invoke-virtual {p0}, Lcom/huawei/cloudservice/CloudAccount;->getAccountData()Lcom/huawei/hwid/core/datatype/HwAccount;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hwid/core/datatype/HwAccount;->h()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getAuthAppListIntent(Landroid/content/Context;Lcom/huawei/cloudservice/IntentResultHandler;)V
    .locals 2

    .line 699
    iget-object v0, p0, Lcom/huawei/cloudservice/CloudAccount;->a:Lcom/huawei/hwid/api/common/e;

    const-string v1, "AuthAppListIntent"

    invoke-virtual {v0, p1, v1, p2}, Lcom/huawei/hwid/api/common/e;->a(Landroid/content/Context;Ljava/lang/String;Lcom/huawei/cloudservice/IntentResultHandler;)V

    .line 700
    return-void
.end method

.method public getAuthToken()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 205
    iget-object v0, p0, Lcom/huawei/cloudservice/CloudAccount;->a:Lcom/huawei/hwid/api/common/e;

    invoke-virtual {v0}, Lcom/huawei/hwid/api/common/e;->b()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getCountryCode()Ljava/lang/String;
    .locals 1

    .line 109
    invoke-virtual {p0}, Lcom/huawei/cloudservice/CloudAccount;->getAccountData()Lcom/huawei/hwid/core/datatype/HwAccount;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hwid/core/datatype/HwAccount;->a()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getDeviceId()Ljava/lang/String;
    .locals 1

    .line 56
    invoke-virtual {p0}, Lcom/huawei/cloudservice/CloudAccount;->getAccountData()Lcom/huawei/hwid/core/datatype/HwAccount;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hwid/core/datatype/HwAccount;->i()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getDeviceType()Ljava/lang/String;
    .locals 1

    .line 68
    invoke-virtual {p0}, Lcom/huawei/cloudservice/CloudAccount;->getAccountData()Lcom/huawei/hwid/core/datatype/HwAccount;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hwid/core/datatype/HwAccount;->k()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getHomeCountryChangeIntent(Landroid/content/Context;Lcom/huawei/cloudservice/IntentResultHandler;)V
    .locals 2

    .line 559
    iget-object v0, p0, Lcom/huawei/cloudservice/CloudAccount;->a:Lcom/huawei/hwid/api/common/e;

    const-string v1, "serviceCountryChangeIntent"

    invoke-virtual {v0, p1, v1, p2}, Lcom/huawei/hwid/api/common/e;->a(Landroid/content/Context;Ljava/lang/String;Lcom/huawei/cloudservice/IntentResultHandler;)V

    .line 560
    return-void
.end method

.method public getLoginUserName()Ljava/lang/String;
    .locals 2

    .line 96
    invoke-virtual {p0}, Lcom/huawei/cloudservice/CloudAccount;->getAccountData()Lcom/huawei/hwid/core/datatype/HwAccount;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hwid/core/datatype/HwAccount;->l()Ljava/lang/String;

    move-result-object v1

    .line 97
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 98
    invoke-virtual {p0}, Lcom/huawei/cloudservice/CloudAccount;->getAccountName()Ljava/lang/String;

    move-result-object v1

    .line 100
    :cond_0
    return-object v1
.end method

.method public getRealNameInfo(Landroid/content/Context;Lcom/huawei/cloudservice/CloudRequestHandler;)V
    .locals 1

    .line 659
    iget-object v0, p0, Lcom/huawei/cloudservice/CloudAccount;->a:Lcom/huawei/hwid/api/common/e;

    invoke-virtual {v0, p1, p2}, Lcom/huawei/hwid/api/common/e;->c(Landroid/content/Context;Lcom/huawei/cloudservice/CloudRequestHandler;)V

    .line 660
    return-void
.end method

.method public getRealNameVerifyIntent(Landroid/content/Context;ILcom/huawei/cloudservice/IntentResultHandler;)V
    .locals 1

    .line 599
    iget-object v0, p0, Lcom/huawei/cloudservice/CloudAccount;->a:Lcom/huawei/hwid/api/common/e;

    invoke-virtual {v0, p1, p2, p3}, Lcom/huawei/hwid/api/common/e;->a(Landroid/content/Context;ILcom/huawei/cloudservice/IntentResultHandler;)V

    .line 600
    return-void
.end method

.method public getRemoteAccessAuthorizeIntent(Landroid/content/Context;Lcom/huawei/cloudservice/IntentResultHandler;)V
    .locals 2

    .line 519
    iget-object v0, p0, Lcom/huawei/cloudservice/CloudAccount;->a:Lcom/huawei/hwid/api/common/e;

    const-string v1, "remoteAuthIntent"

    invoke-virtual {v0, p1, v1, p2}, Lcom/huawei/hwid/api/common/e;->a(Landroid/content/Context;Ljava/lang/String;Lcom/huawei/cloudservice/IntentResultHandler;)V

    .line 520
    return-void
.end method

.method public getServiceCountryCode()Ljava/lang/String;
    .locals 1

    .line 118
    invoke-virtual {p0}, Lcom/huawei/cloudservice/CloudAccount;->getAccountData()Lcom/huawei/hwid/core/datatype/HwAccount;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hwid/core/datatype/HwAccount;->n()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getServiceToken()Ljava/lang/String;
    .locals 1

    .line 80
    invoke-virtual {p0}, Lcom/huawei/cloudservice/CloudAccount;->getAccountData()Lcom/huawei/hwid/core/datatype/HwAccount;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hwid/core/datatype/HwAccount;->g()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getSiteId()I
    .locals 1

    .line 72
    invoke-virtual {p0}, Lcom/huawei/cloudservice/CloudAccount;->getAccountData()Lcom/huawei/hwid/core/datatype/HwAccount;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hwid/core/datatype/HwAccount;->e()I

    move-result v0

    return v0
.end method

.method public getStStatus()Ljava/lang/String;
    .locals 1

    .line 129
    invoke-virtual {p0}, Lcom/huawei/cloudservice/CloudAccount;->getAccountData()Lcom/huawei/hwid/core/datatype/HwAccount;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hwid/core/datatype/HwAccount;->m()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getSubDeviceID()Ljava/lang/String;
    .locals 1

    .line 64
    invoke-virtual {p0}, Lcom/huawei/cloudservice/CloudAccount;->getAccountData()Lcom/huawei/hwid/core/datatype/HwAccount;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hwid/core/datatype/HwAccount;->j()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getUserId()Ljava/lang/String;
    .locals 1

    .line 52
    invoke-virtual {p0}, Lcom/huawei/cloudservice/CloudAccount;->getAccountData()Lcom/huawei/hwid/core/datatype/HwAccount;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hwid/core/datatype/HwAccount;->d()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getUserInfo(Landroid/content/Context;Ljava/lang/String;Lcom/huawei/cloudservice/CloudRequestHandler;)V
    .locals 1

    .line 320
    iget-object v0, p0, Lcom/huawei/cloudservice/CloudAccount;->a:Lcom/huawei/hwid/api/common/e;

    invoke-virtual {v0, p1, p2, p3}, Lcom/huawei/hwid/api/common/e;->a(Landroid/content/Context;Ljava/lang/String;Lcom/huawei/cloudservice/CloudRequestHandler;)V

    .line 321
    return-void
.end method

.method public logout(Landroid/content/Context;)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 231
    iget-object v0, p0, Lcom/huawei/cloudservice/CloudAccount;->a:Lcom/huawei/hwid/api/common/e;

    invoke-virtual {v0, p1}, Lcom/huawei/hwid/api/common/e;->d(Landroid/content/Context;)V

    .line 232
    return-void
.end method

.method public serviceTokenAuth(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ILcom/huawei/cloudservice/CloudRequestHandler;)V
    .locals 6

    .line 195
    iget-object v0, p0, Lcom/huawei/cloudservice/CloudAccount;->a:Lcom/huawei/hwid/api/common/e;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v4, p4

    move-object v5, p5

    invoke-virtual/range {v0 .. v5}, Lcom/huawei/hwid/api/common/e;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ILcom/huawei/cloudservice/CloudRequestHandler;)V

    .line 196
    return-void
.end method

.method public updateHeadPicture(Landroid/content/Context;Ljava/lang/String;Lcom/huawei/cloudservice/CloudRequestHandler;)Z
    .locals 1

    .line 418
    iget-object v0, p0, Lcom/huawei/cloudservice/CloudAccount;->a:Lcom/huawei/hwid/api/common/e;

    invoke-virtual {v0, p1, p2, p3}, Lcom/huawei/hwid/api/common/e;->b(Landroid/content/Context;Ljava/lang/String;Lcom/huawei/cloudservice/CloudRequestHandler;)Z

    move-result v0

    return v0
.end method

.method public updateUserInfo(Landroid/content/Context;Lcom/huawei/hwid/core/datatype/UserInfo;Lcom/huawei/cloudservice/CloudRequestHandler;)Z
    .locals 1

    .line 331
    iget-object v0, p0, Lcom/huawei/cloudservice/CloudAccount;->a:Lcom/huawei/hwid/api/common/e;

    invoke-virtual {v0, p1, p2, p3}, Lcom/huawei/hwid/api/common/e;->a(Landroid/content/Context;Lcom/huawei/hwid/core/datatype/UserInfo;Lcom/huawei/cloudservice/CloudRequestHandler;)Z

    move-result v0

    return v0
.end method
