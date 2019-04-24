.class Lcom/tencent/open/weiyun/RecordManager$6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/tencent/tauth/IUiListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tencent/open/weiyun/RecordManager;->checkRecord(Ljava/lang/String;Lcom/tencent/tauth/IUiListener;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/tencent/tauth/IUiListener;

.field final synthetic b:Lcom/tencent/open/weiyun/RecordManager;


# direct methods
.method constructor <init>(Lcom/tencent/open/weiyun/RecordManager;Lcom/tencent/tauth/IUiListener;)V
    .locals 0

    .line 272
    iput-object p1, p0, Lcom/tencent/open/weiyun/RecordManager$6;->b:Lcom/tencent/open/weiyun/RecordManager;

    iput-object p2, p0, Lcom/tencent/open/weiyun/RecordManager$6;->a:Lcom/tencent/tauth/IUiListener;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCancel()V
    .locals 1

    .line 294
    iget-object v0, p0, Lcom/tencent/open/weiyun/RecordManager$6;->a:Lcom/tencent/tauth/IUiListener;

    invoke-interface {v0}, Lcom/tencent/tauth/IUiListener;->onCancel()V

    .line 295
    return-void
.end method

.method public onComplete(Ljava/lang/Object;)V
    .locals 7

    .line 279
    move-object v5, p1

    check-cast v5, Lorg/json/JSONObject;

    .line 281
    const-string v0, "ret"

    :try_start_0
    invoke-virtual {v5, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v6

    .line 282
    if-nez v6, :cond_0

    .line 283
    iget-object v0, p0, Lcom/tencent/open/weiyun/RecordManager$6;->a:Lcom/tencent/tauth/IUiListener;

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {v0, v1}, Lcom/tencent/tauth/IUiListener;->onComplete(Ljava/lang/Object;)V

    goto :goto_0

    .line 285
    :cond_0
    iget-object v0, p0, Lcom/tencent/open/weiyun/RecordManager$6;->a:Lcom/tencent/tauth/IUiListener;

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {v0, v1}, Lcom/tencent/tauth/IUiListener;->onComplete(Ljava/lang/Object;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 289
    :goto_0
    goto :goto_1

    .line 287
    :catch_0
    move-exception v6

    .line 288
    iget-object v0, p0, Lcom/tencent/open/weiyun/RecordManager$6;->a:Lcom/tencent/tauth/IUiListener;

    new-instance v1, Lcom/tencent/tauth/UiError;

    invoke-virtual {v6}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, -0x4

    const/4 v4, 0x0

    invoke-direct {v1, v3, v2, v4}, Lcom/tencent/tauth/UiError;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Lcom/tencent/tauth/IUiListener;->onError(Lcom/tencent/tauth/UiError;)V

    .line 290
    :goto_1
    return-void
.end method

.method public onError(Lcom/tencent/tauth/UiError;)V
    .locals 1

    .line 275
    iget-object v0, p0, Lcom/tencent/open/weiyun/RecordManager$6;->a:Lcom/tencent/tauth/IUiListener;

    invoke-interface {v0, p1}, Lcom/tencent/tauth/IUiListener;->onError(Lcom/tencent/tauth/UiError;)V

    .line 276
    return-void
.end method
