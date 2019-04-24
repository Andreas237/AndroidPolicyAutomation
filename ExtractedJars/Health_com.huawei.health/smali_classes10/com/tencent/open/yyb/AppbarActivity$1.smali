.class Lcom/tencent/open/yyb/AppbarActivity$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/tencent/tauth/IUiListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tencent/open/yyb/AppbarActivity;->login()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/tencent/open/yyb/AppbarActivity;


# direct methods
.method constructor <init>(Lcom/tencent/open/yyb/AppbarActivity;)V
    .locals 0

    .line 460
    iput-object p1, p0, Lcom/tencent/open/yyb/AppbarActivity$1;->a:Lcom/tencent/open/yyb/AppbarActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCancel()V
    .locals 5

    .line 515
    const-string v0, "openSDK_LOG"

    const-string v1, "-->(AppbarJsBridge)openLoginActivity onCancel"

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 516
    iget-object v0, p0, Lcom/tencent/open/yyb/AppbarActivity$1;->a:Lcom/tencent/open/yyb/AppbarActivity;

    invoke-static {v0}, Lcom/tencent/open/yyb/AppbarActivity;->access$400(Lcom/tencent/open/yyb/AppbarActivity;)Lcom/tencent/open/yyb/AppbarJsBridge;

    move-result-object v0

    const-string v1, "loginCallback"

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, -0x2

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/tencent/open/yyb/AppbarJsBridge;->responseFail(Ljava/lang/String;ILjava/lang/String;I)V

    .line 517
    return-void
.end method

.method public onComplete(Ljava/lang/Object;)V
    .locals 13

    .line 470
    const-string v0, "openSDK_LOG"

    const-string v1, "-->(AppbarJsBridge)openLoginActivity onComplete"

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 471
    move-object v5, p1

    check-cast v5, Lorg/json/JSONObject;

    .line 472
    const-string v0, "ret"

    const/4 v1, -0x1

    invoke-virtual {v5, v0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v6

    .line 473
    if-eqz v6, :cond_0

    .line 474
    iget-object v0, p0, Lcom/tencent/open/yyb/AppbarActivity$1;->a:Lcom/tencent/open/yyb/AppbarActivity;

    invoke-static {v0}, Lcom/tencent/open/yyb/AppbarActivity;->access$400(Lcom/tencent/open/yyb/AppbarActivity;)Lcom/tencent/open/yyb/AppbarJsBridge;

    move-result-object v0

    const-string v1, "loginCallback"

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, -0x5

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/tencent/open/yyb/AppbarJsBridge;->responseFail(Ljava/lang/String;ILjava/lang/String;I)V

    .line 475
    return-void

    .line 477
    :cond_0
    const/4 v7, 0x0

    .line 478
    const/4 v8, 0x0

    .line 479
    const/4 v9, 0x0

    .line 480
    const/4 v10, 0x0

    .line 482
    const-string v0, "openid"

    :try_start_0
    invoke-virtual {v5, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 483
    const-string v0, "access_token"

    invoke-virtual {v5, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 484
    const-string v0, "expires_in"

    invoke-virtual {v5, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    .line 485
    iget-object v0, p0, Lcom/tencent/open/yyb/AppbarActivity$1;->a:Lcom/tencent/open/yyb/AppbarActivity;

    invoke-static {v0}, Lcom/tencent/open/yyb/AppbarActivity;->access$500(Lcom/tencent/open/yyb/AppbarActivity;)Lcom/tencent/connect/auth/QQToken;

    move-result-object v0

    invoke-virtual {v0}, Lcom/tencent/connect/auth/QQToken;->getAppId()Ljava/lang/String;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v9

    .line 490
    goto :goto_0

    .line 486
    :catch_0
    move-exception v11

    .line 487
    iget-object v0, p0, Lcom/tencent/open/yyb/AppbarActivity$1;->a:Lcom/tencent/open/yyb/AppbarActivity;

    invoke-static {v0}, Lcom/tencent/open/yyb/AppbarActivity;->access$400(Lcom/tencent/open/yyb/AppbarActivity;)Lcom/tencent/open/yyb/AppbarJsBridge;

    move-result-object v0

    const-string v1, "loginCallback"

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, -0x5

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/tencent/open/yyb/AppbarJsBridge;->responseFail(Ljava/lang/String;ILjava/lang/String;I)V

    .line 488
    const-string v0, "openSDK_LOG"

    const-string v1, "-->(AppbarJsBridge)openLoginActivity onComplete: get keys failed."

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 489
    return-void

    .line 492
    :goto_0
    iget-object v0, p0, Lcom/tencent/open/yyb/AppbarActivity$1;->a:Lcom/tencent/open/yyb/AppbarActivity;

    iget-object v1, p0, Lcom/tencent/open/yyb/AppbarActivity$1;->a:Lcom/tencent/open/yyb/AppbarActivity;

    invoke-static {v1}, Lcom/tencent/open/yyb/AppbarActivity;->access$600(Lcom/tencent/open/yyb/AppbarActivity;)Lcom/tencent/open/c/b;

    move-result-object v1

    invoke-virtual {v1}, Lcom/tencent/open/c/b;->getUrl()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, v7, v8, v9}, Lcom/tencent/open/yyb/a;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 493
    new-instance v11, Lorg/json/JSONObject;

    invoke-direct {v11}, Lorg/json/JSONObject;-><init>()V

    .line 495
    const-string v0, "logintype"

    const-string v1, "SSO"

    :try_start_1
    invoke-virtual {v11, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 496
    const-string v0, "openid"

    invoke-virtual {v11, v0, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 497
    const-string v0, "accesstoken"

    invoke-virtual {v11, v0, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    .line 502
    goto :goto_1

    .line 498
    :catch_1
    move-exception v12

    .line 499
    iget-object v0, p0, Lcom/tencent/open/yyb/AppbarActivity$1;->a:Lcom/tencent/open/yyb/AppbarActivity;

    invoke-static {v0}, Lcom/tencent/open/yyb/AppbarActivity;->access$400(Lcom/tencent/open/yyb/AppbarActivity;)Lcom/tencent/open/yyb/AppbarJsBridge;

    move-result-object v0

    const-string v1, "loginCallback"

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, -0x5

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/tencent/open/yyb/AppbarJsBridge;->responseFail(Ljava/lang/String;ILjava/lang/String;I)V

    .line 500
    const-string v0, "openSDK_LOG"

    const-string v1, "-->(AppbarJsBridge)openLoginActivity onComplete: put keys callback failed."

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 501
    return-void

    .line 503
    :goto_1
    iget-object v0, p0, Lcom/tencent/open/yyb/AppbarActivity$1;->a:Lcom/tencent/open/yyb/AppbarActivity;

    invoke-static {v0}, Lcom/tencent/open/yyb/AppbarActivity;->access$400(Lcom/tencent/open/yyb/AppbarActivity;)Lcom/tencent/open/yyb/AppbarJsBridge;

    move-result-object v0

    const-string v1, "loginCallback"

    invoke-virtual {v11}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual {v0, v1, v3, v4, v2}, Lcom/tencent/open/yyb/AppbarJsBridge;->response(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    .line 508
    new-instance v12, Landroid/content/Intent;

    invoke-direct {v12}, Landroid/content/Intent;-><init>()V

    .line 509
    const-string v0, "login_info"

    invoke-virtual {v5}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v12, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 510
    iget-object v0, p0, Lcom/tencent/open/yyb/AppbarActivity$1;->a:Lcom/tencent/open/yyb/AppbarActivity;

    const/16 v1, 0x2775

    invoke-virtual {v0, v1, v12}, Lcom/tencent/open/yyb/AppbarActivity;->setResult(ILandroid/content/Intent;)V

    .line 511
    return-void
.end method

.method public onError(Lcom/tencent/tauth/UiError;)V
    .locals 5

    .line 464
    const-string v0, "openSDK_LOG"

    const-string v1, "-->(AppbarJsBridge)openLoginActivity onError"

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 465
    iget-object v0, p0, Lcom/tencent/open/yyb/AppbarActivity$1;->a:Lcom/tencent/open/yyb/AppbarActivity;

    invoke-static {v0}, Lcom/tencent/open/yyb/AppbarActivity;->access$400(Lcom/tencent/open/yyb/AppbarActivity;)Lcom/tencent/open/yyb/AppbarJsBridge;

    move-result-object v0

    const-string v1, "loginCallback"

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, -0x5

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/tencent/open/yyb/AppbarJsBridge;->responseFail(Ljava/lang/String;ILjava/lang/String;I)V

    .line 466
    return-void
.end method
