.class Lcom/tencent/connect/auth/AuthAgent$CheckLoginListener;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/tencent/tauth/IUiListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/connect/auth/AuthAgent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "CheckLoginListener"
.end annotation


# instance fields
.field a:Lcom/tencent/tauth/IUiListener;

.field final synthetic b:Lcom/tencent/connect/auth/AuthAgent;


# direct methods
.method public constructor <init>(Lcom/tencent/connect/auth/AuthAgent;Lcom/tencent/tauth/IUiListener;)V
    .locals 0

    .line 428
    iput-object p1, p0, Lcom/tencent/connect/auth/AuthAgent$CheckLoginListener;->b:Lcom/tencent/connect/auth/AuthAgent;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 429
    iput-object p2, p0, Lcom/tencent/connect/auth/AuthAgent$CheckLoginListener;->a:Lcom/tencent/tauth/IUiListener;

    .line 430
    return-void
.end method


# virtual methods
.method public onCancel()V
    .locals 1

    .line 465
    iget-object v0, p0, Lcom/tencent/connect/auth/AuthAgent$CheckLoginListener;->a:Lcom/tencent/tauth/IUiListener;

    if-eqz v0, :cond_0

    .line 466
    iget-object v0, p0, Lcom/tencent/connect/auth/AuthAgent$CheckLoginListener;->a:Lcom/tencent/tauth/IUiListener;

    invoke-interface {v0}, Lcom/tencent/tauth/IUiListener;->onCancel()V

    .line 468
    :cond_0
    return-void
.end method

.method public onComplete(Ljava/lang/Object;)V
    .locals 7

    .line 434
    if-nez p1, :cond_0

    .line 435
    const-string v0, "CheckLoginListener"

    const-string v1, "response data is null"

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 436
    return-void

    .line 439
    :cond_0
    move-object v3, p1

    check-cast v3, Lorg/json/JSONObject;

    .line 444
    const-string v0, "ret"

    :try_start_0
    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v4

    .line 445
    if-nez v4, :cond_1

    const-string v5, "success"

    goto :goto_0

    :cond_1
    const-string v0, "msg"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 447
    :goto_0
    iget-object v0, p0, Lcom/tencent/connect/auth/AuthAgent$CheckLoginListener;->a:Lcom/tencent/tauth/IUiListener;

    if-eqz v0, :cond_2

    .line 448
    iget-object v0, p0, Lcom/tencent/connect/auth/AuthAgent$CheckLoginListener;->a:Lcom/tencent/tauth/IUiListener;

    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    const-string v2, "ret"

    invoke-virtual {v1, v2, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    move-result-object v1

    const-string v2, "msg"

    invoke-virtual {v1, v2, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/tencent/tauth/IUiListener;->onComplete(Ljava/lang/Object;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 453
    :cond_2
    goto :goto_1

    .line 450
    :catch_0
    move-exception v6

    .line 451
    invoke-virtual {v6}, Lorg/json/JSONException;->printStackTrace()V

    .line 452
    const-string v0, "CheckLoginListener"

    const-string v1, "response data format error"

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 454
    :goto_1
    return-void
.end method

.method public onError(Lcom/tencent/tauth/UiError;)V
    .locals 1

    .line 458
    iget-object v0, p0, Lcom/tencent/connect/auth/AuthAgent$CheckLoginListener;->a:Lcom/tencent/tauth/IUiListener;

    if-eqz v0, :cond_0

    .line 459
    iget-object v0, p0, Lcom/tencent/connect/auth/AuthAgent$CheckLoginListener;->a:Lcom/tencent/tauth/IUiListener;

    invoke-interface {v0, p1}, Lcom/tencent/tauth/IUiListener;->onError(Lcom/tencent/tauth/UiError;)V

    .line 461
    :cond_0
    return-void
.end method
