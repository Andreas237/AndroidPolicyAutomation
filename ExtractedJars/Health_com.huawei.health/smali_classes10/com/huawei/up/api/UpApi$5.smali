.class Lcom/huawei/up/api/UpApi$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/cloudservice/CloudRequestHandler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/up/api/UpApi;->updateUserInfoBySdk(Lcom/huawei/up/model/UserInfomation;Lcom/huawei/up/callback/CommonCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/up/api/UpApi;

.field final synthetic val$commonCallback:Lcom/huawei/up/callback/CommonCallback;


# direct methods
.method constructor <init>(Lcom/huawei/up/api/UpApi;Lcom/huawei/up/callback/CommonCallback;)V
    .locals 0

    .line 335
    iput-object p1, p0, Lcom/huawei/up/api/UpApi$5;->this$0:Lcom/huawei/up/api/UpApi;

    iput-object p2, p0, Lcom/huawei/up/api/UpApi$5;->val$commonCallback:Lcom/huawei/up/callback/CommonCallback;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onError(Lcom/huawei/hwid/core/helper/handler/ErrorStatus;)V
    .locals 4

    .line 348
    const-string v0, "PLGLOGIN_UpApi"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "updateUserInfoBySdk onError "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;->getErrorCode()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 349
    iget-object v0, p0, Lcom/huawei/up/api/UpApi$5;->val$commonCallback:Lcom/huawei/up/callback/CommonCallback;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 350
    const-string v0, "PLGLOGIN_UpApi"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updateUserInfoBySdk is fail"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 351
    iget-object v0, p0, Lcom/huawei/up/api/UpApi$5;->val$commonCallback:Lcom/huawei/up/callback/CommonCallback;

    invoke-virtual {p1}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;->getErrorCode()I

    move-result v1

    invoke-interface {v0, v1}, Lcom/huawei/up/callback/CommonCallback;->onFail(I)V

    .line 353
    :cond_0
    return-void
.end method

.method public onFinish(Landroid/os/Bundle;)V
    .locals 4

    .line 338
    const-string v0, "PLGLOGIN_UpApi"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updateUserInfoBySdk finish() "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 340
    iget-object v0, p0, Lcom/huawei/up/api/UpApi$5;->val$commonCallback:Lcom/huawei/up/callback/CommonCallback;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 341
    const-string v0, "method"

    const-string v1, "updateUserInfo"

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 342
    iget-object v0, p0, Lcom/huawei/up/api/UpApi$5;->val$commonCallback:Lcom/huawei/up/callback/CommonCallback;

    invoke-interface {v0, p1}, Lcom/huawei/up/callback/CommonCallback;->onSuccess(Landroid/os/Bundle;)V

    .line 344
    :cond_0
    return-void
.end method
