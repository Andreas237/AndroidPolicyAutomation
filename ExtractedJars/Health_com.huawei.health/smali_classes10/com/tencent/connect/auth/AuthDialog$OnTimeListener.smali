.class Lcom/tencent/connect/auth/AuthDialog$OnTimeListener;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/tencent/tauth/IUiListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/connect/auth/AuthDialog;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "OnTimeListener"
.end annotation


# instance fields
.field a:Ljava/lang/String;

.field b:Ljava/lang/String;

.field final synthetic c:Lcom/tencent/connect/auth/AuthDialog;

.field private d:Ljava/lang/String;

.field private e:Lcom/tencent/tauth/IUiListener;


# direct methods
.method public constructor <init>(Lcom/tencent/connect/auth/AuthDialog;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/tencent/tauth/IUiListener;)V
    .locals 0

    .line 202
    iput-object p1, p0, Lcom/tencent/connect/auth/AuthDialog$OnTimeListener;->c:Lcom/tencent/connect/auth/AuthDialog;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 203
    iput-object p2, p0, Lcom/tencent/connect/auth/AuthDialog$OnTimeListener;->d:Ljava/lang/String;

    .line 204
    iput-object p3, p0, Lcom/tencent/connect/auth/AuthDialog$OnTimeListener;->a:Ljava/lang/String;

    .line 205
    iput-object p4, p0, Lcom/tencent/connect/auth/AuthDialog$OnTimeListener;->b:Ljava/lang/String;

    .line 206
    iput-object p5, p0, Lcom/tencent/connect/auth/AuthDialog$OnTimeListener;->e:Lcom/tencent/tauth/IUiListener;

    .line 207
    return-void
.end method

.method static synthetic a(Lcom/tencent/connect/auth/AuthDialog$OnTimeListener;Ljava/lang/String;)V
    .locals 0

    .line 195
    invoke-direct {p0, p1}, Lcom/tencent/connect/auth/AuthDialog$OnTimeListener;->a(Ljava/lang/String;)V

    return-void
.end method

.method private a(Ljava/lang/String;)V
    .locals 4

    .line 211
    :try_start_0
    invoke-static {p1}, Lcom/tencent/open/utils/Util;->parseJson(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v3

    .line 212
    invoke-virtual {p0, v3}, Lcom/tencent/connect/auth/AuthDialog$OnTimeListener;->onComplete(Ljava/lang/Object;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 217
    goto :goto_0

    .line 213
    :catch_0
    move-exception v3

    .line 214
    invoke-virtual {v3}, Lorg/json/JSONException;->printStackTrace()V

    .line 215
    new-instance v0, Lcom/tencent/tauth/UiError;

    const-string v1, "\u670d\u52a1\u5668\u8fd4\u56de\u6570\u636e\u683c\u5f0f\u6709\u8bef!"

    const/4 v2, -0x4

    invoke-direct {v0, v2, v1, p1}, Lcom/tencent/tauth/UiError;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/tencent/connect/auth/AuthDialog$OnTimeListener;->onError(Lcom/tencent/tauth/UiError;)V

    .line 218
    :goto_0
    return-void
.end method


# virtual methods
.method public onCancel()V
    .locals 1

    .line 245
    iget-object v0, p0, Lcom/tencent/connect/auth/AuthDialog$OnTimeListener;->e:Lcom/tencent/tauth/IUiListener;

    if-eqz v0, :cond_0

    .line 246
    iget-object v0, p0, Lcom/tencent/connect/auth/AuthDialog$OnTimeListener;->e:Lcom/tencent/tauth/IUiListener;

    invoke-interface {v0}, Lcom/tencent/tauth/IUiListener;->onCancel()V

    .line 247
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/tencent/connect/auth/AuthDialog$OnTimeListener;->e:Lcom/tencent/tauth/IUiListener;

    .line 249
    :cond_0
    return-void
.end method

.method public onComplete(Ljava/lang/Object;)V
    .locals 12

    .line 222
    move-object v11, p1

    check-cast v11, Lorg/json/JSONObject;

    .line 223
    invoke-static {}, Lcom/tencent/open/b/g;->a()Lcom/tencent/open/b/g;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/tencent/connect/auth/AuthDialog$OnTimeListener;->d:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "_H5"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    const-string v4, "ret"

    const/4 v5, -0x6

    invoke-virtual {v11, v4, v5}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v8

    iget-object v9, p0, Lcom/tencent/connect/auth/AuthDialog$OnTimeListener;->a:Ljava/lang/String;

    const-wide/16 v4, 0x0

    const-wide/16 v6, 0x0

    const/4 v10, 0x0

    invoke-virtual/range {v0 .. v10}, Lcom/tencent/open/b/g;->a(Ljava/lang/String;JJJILjava/lang/String;Z)V

    .line 225
    iget-object v0, p0, Lcom/tencent/connect/auth/AuthDialog$OnTimeListener;->e:Lcom/tencent/tauth/IUiListener;

    if-eqz v0, :cond_0

    .line 226
    iget-object v0, p0, Lcom/tencent/connect/auth/AuthDialog$OnTimeListener;->e:Lcom/tencent/tauth/IUiListener;

    invoke-interface {v0, v11}, Lcom/tencent/tauth/IUiListener;->onComplete(Ljava/lang/Object;)V

    .line 227
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/tencent/connect/auth/AuthDialog$OnTimeListener;->e:Lcom/tencent/tauth/IUiListener;

    .line 229
    :cond_0
    return-void
.end method

.method public onError(Lcom/tencent/tauth/UiError;)V
    .locals 12

    .line 233
    iget-object v0, p1, Lcom/tencent/tauth/UiError;->errorMessage:Ljava/lang/String;

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p1, Lcom/tencent/tauth/UiError;->errorMessage:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/tencent/connect/auth/AuthDialog$OnTimeListener;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    goto :goto_0

    :cond_0
    iget-object v11, p0, Lcom/tencent/connect/auth/AuthDialog$OnTimeListener;->a:Ljava/lang/String;

    .line 234
    :goto_0
    invoke-static {}, Lcom/tencent/open/b/g;->a()Lcom/tencent/open/b/g;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/tencent/connect/auth/AuthDialog$OnTimeListener;->d:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "_H5"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    iget v8, p1, Lcom/tencent/tauth/UiError;->errorCode:I

    move-object v9, v11

    const-wide/16 v4, 0x0

    const-wide/16 v6, 0x0

    const/4 v10, 0x0

    invoke-virtual/range {v0 .. v10}, Lcom/tencent/open/b/g;->a(Ljava/lang/String;JJJILjava/lang/String;Z)V

    .line 236
    iget-object v0, p0, Lcom/tencent/connect/auth/AuthDialog$OnTimeListener;->c:Lcom/tencent/connect/auth/AuthDialog;

    invoke-static {v0, v11}, Lcom/tencent/connect/auth/AuthDialog;->a(Lcom/tencent/connect/auth/AuthDialog;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    .line 237
    iget-object v0, p0, Lcom/tencent/connect/auth/AuthDialog$OnTimeListener;->e:Lcom/tencent/tauth/IUiListener;

    if-eqz v0, :cond_1

    .line 238
    iget-object v0, p0, Lcom/tencent/connect/auth/AuthDialog$OnTimeListener;->e:Lcom/tencent/tauth/IUiListener;

    invoke-interface {v0, p1}, Lcom/tencent/tauth/IUiListener;->onError(Lcom/tencent/tauth/UiError;)V

    .line 239
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/tencent/connect/auth/AuthDialog$OnTimeListener;->e:Lcom/tencent/tauth/IUiListener;

    .line 241
    :cond_1
    return-void
.end method
