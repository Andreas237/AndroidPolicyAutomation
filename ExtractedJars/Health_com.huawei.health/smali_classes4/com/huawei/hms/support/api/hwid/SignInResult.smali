.class public Lcom/huawei/hms/support/api/hwid/SignInResult;
.super Lcom/huawei/hms/support/api/client/Result;
.source "SourceFile"


# instance fields
.field private a:Lcom/huawei/hms/support/api/hwid/SignInHuaweiId;

.field private b:Landroid/content/Intent;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 27
    invoke-direct {p0}, Lcom/huawei/hms/support/api/client/Result;-><init>()V

    return-void
.end method

.method public constructor <init>(Lcom/huawei/hms/support/api/client/Status;)V
    .locals 0

    .line 33
    invoke-direct {p0}, Lcom/huawei/hms/support/api/client/Result;-><init>()V

    .line 34
    invoke-virtual {p0, p1}, Lcom/huawei/hms/support/api/hwid/SignInResult;->setStatus(Lcom/huawei/hms/support/api/client/Status;)V

    .line 35
    return-void
.end method


# virtual methods
.method public getData()Landroid/content/Intent;
    .locals 1

    .line 58
    iget-object v0, p0, Lcom/huawei/hms/support/api/hwid/SignInResult;->b:Landroid/content/Intent;

    return-object v0
.end method

.method public getSignInHuaweiId()Lcom/huawei/hms/support/api/hwid/SignInHuaweiId;
    .locals 1

    .line 18
    iget-object v0, p0, Lcom/huawei/hms/support/api/hwid/SignInResult;->a:Lcom/huawei/hms/support/api/hwid/SignInHuaweiId;

    return-object v0
.end method

.method public isSuccess()Z
    .locals 1

    .line 66
    invoke-virtual {p0}, Lcom/huawei/hms/support/api/hwid/SignInResult;->getStatus()Lcom/huawei/hms/support/api/client/Status;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hms/support/api/client/Status;->isSuccess()Z

    move-result v0

    return v0
.end method

.method public setData(Landroid/content/Intent;)V
    .locals 0

    .line 50
    iput-object p1, p0, Lcom/huawei/hms/support/api/hwid/SignInResult;->b:Landroid/content/Intent;

    .line 51
    return-void
.end method

.method public setSignInHuaweiId(Lcom/huawei/hms/support/api/hwid/SignInHuaweiId;)V
    .locals 0

    .line 42
    iput-object p1, p0, Lcom/huawei/hms/support/api/hwid/SignInResult;->a:Lcom/huawei/hms/support/api/hwid/SignInHuaweiId;

    .line 43
    return-void
.end method
