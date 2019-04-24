.class Lcom/huawei/hwid/api/common/apkimpl/DummyActivity$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/accounts/AccountManagerCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Landroid/accounts/AccountManagerCallback<Landroid/os/Bundle;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;


# direct methods
.method public constructor <init>(Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;)V
    .locals 0

    .line 366
    iput-object p1, p0, Lcom/huawei/hwid/api/common/apkimpl/DummyActivity$a;->a:Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 367
    return-void
.end method


# virtual methods
.method public run(Landroid/accounts/AccountManagerFuture;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/accounts/AccountManagerFuture<Landroid/os/Bundle;>;)V"
        }
    .end annotation

    .line 370
    const/4 v3, 0x0

    .line 371
    const/4 v4, 0x0

    .line 372
    const-string v5, ""

    .line 374
    const-string v0, "AuthTokenCallBack"

    const-string v1, "AuthTokenCallBack::run==>"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 378
    if-eqz p1, :cond_0

    .line 379
    :try_start_0
    invoke-interface {p1}, Landroid/accounts/AccountManagerFuture;->getResult()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Bundle;
    :try_end_0
    .catch Landroid/accounts/OperationCanceledException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Landroid/accounts/AuthenticatorException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2

    move-object v3, v0

    .line 393
    :cond_0
    goto :goto_0

    .line 381
    :catch_0
    move-exception v6

    .line 382
    const/16 v4, 0xbba

    .line 383
    const-string v5, "getAuthTokenByFeatures : OperationCanceledException occur"

    .line 384
    const-string v0, "AuthTokenCallBack"

    const-string v1, "AuthTokenCallBack OperationCanceledException:"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 393
    goto :goto_0

    .line 385
    :catch_1
    move-exception v6

    .line 386
    const/16 v4, 0xbbb

    .line 387
    const-string v5, "getAuthTokenByFeatures : AuthenticatorException occur"

    .line 388
    const-string v0, "AuthTokenCallBack"

    const-string v1, "AuthTokenCallBack AuthenticatorException:"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 393
    goto :goto_0

    .line 389
    :catch_2
    move-exception v6

    .line 390
    const/16 v4, 0xbbc

    .line 391
    const-string v5, "getAuthTokenByFeatures : IOException occur"

    .line 392
    const-string v0, "AuthTokenCallBack"

    const-string v1, "AuthTokenCallBack IOException:"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 396
    :goto_0
    if-eqz v4, :cond_1

    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_1
    const/4 v0, 0x0

    if-ne v0, v3, :cond_4

    .line 399
    :cond_2
    const/4 v0, 0x0

    if-ne v0, v3, :cond_3

    .line 400
    const-string v0, "AuthTokenCallBack"

    const-string v1, "AuthTokenCallBack:run bundle is null"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 401
    new-instance v6, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;

    const-string v0, "bundle is null"

    invoke-direct {v6, v4, v0}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;-><init>(ILjava/lang/String;)V

    goto :goto_1

    .line 403
    :cond_3
    const-string v0, "AuthTokenCallBack"

    const-string v1, "AuthTokenCallBack:error"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 404
    new-instance v6, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;

    invoke-direct {v6, v4, v5}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;-><init>(ILjava/lang/String;)V

    .line 406
    :goto_1
    new-instance v7, Landroid/content/Intent;

    invoke-direct {v7}, Landroid/content/Intent;-><init>()V

    .line 407
    iget-object v0, p0, Lcom/huawei/hwid/api/common/apkimpl/DummyActivity$a;->a:Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;

    invoke-virtual {v0}, Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 409
    const-string v0, "isUseSDK"

    const/4 v1, 0x0

    invoke-virtual {v7, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 410
    const-string v0, "parce"

    invoke-virtual {v7, v0, v6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 411
    iget-object v0, p0, Lcom/huawei/hwid/api/common/apkimpl/DummyActivity$a;->a:Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;

    invoke-static {v0, v7}, Lcom/huawei/hwid/core/d/c;->b(Landroid/content/Context;Landroid/content/Intent;)V

    .line 412
    iget-object v0, p0, Lcom/huawei/hwid/api/common/apkimpl/DummyActivity$a;->a:Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;

    invoke-virtual {v0}, Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;->finish()V

    .line 413
    return-void

    .line 416
    :cond_4
    iget-object v0, p0, Lcom/huawei/hwid/api/common/apkimpl/DummyActivity$a;->a:Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;

    const-string v1, "authAccount"

    invoke-virtual {v3, v1}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;->a(Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;Ljava/lang/String;)Ljava/lang/String;

    .line 417
    iget-object v0, p0, Lcom/huawei/hwid/api/common/apkimpl/DummyActivity$a;->a:Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;

    const-string v1, "accountType"

    invoke-virtual {v3, v1}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;->b(Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;Ljava/lang/String;)Ljava/lang/String;

    .line 418
    iget-object v0, p0, Lcom/huawei/hwid/api/common/apkimpl/DummyActivity$a;->a:Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;

    const-string v1, "authtoken"

    invoke-virtual {v3, v1}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;->c(Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;Ljava/lang/String;)Ljava/lang/String;

    .line 421
    iget-object v0, p0, Lcom/huawei/hwid/api/common/apkimpl/DummyActivity$a;->a:Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;

    iget-object v1, p0, Lcom/huawei/hwid/api/common/apkimpl/DummyActivity$a;->a:Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;

    invoke-static {v1}, Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;->a(Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/hwid/api/common/apkimpl/DummyActivity$a;->a:Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;

    invoke-static {v2}, Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;->b(Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2, v4, v3}, Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;->a(Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;Ljava/lang/String;Ljava/lang/String;ILandroid/os/Bundle;)V

    .line 422
    return-void
.end method
