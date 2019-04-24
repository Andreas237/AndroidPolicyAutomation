.class Lcom/tencent/open/GameAppOperation$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tencent/open/GameAppOperation;->queryUnexchangePrize(Landroid/content/Context;Landroid/os/Bundle;Lcom/tencent/tauth/IUiListener;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/tencent/tauth/IUiListener;

.field final synthetic b:Landroid/os/Bundle;

.field final synthetic c:Landroid/content/Context;

.field final synthetic d:Lcom/tencent/open/GameAppOperation;


# direct methods
.method constructor <init>(Lcom/tencent/open/GameAppOperation;Lcom/tencent/tauth/IUiListener;Landroid/os/Bundle;Landroid/content/Context;)V
    .locals 0

    .line 842
    iput-object p1, p0, Lcom/tencent/open/GameAppOperation$2;->d:Lcom/tencent/open/GameAppOperation;

    iput-object p2, p0, Lcom/tencent/open/GameAppOperation$2;->a:Lcom/tencent/tauth/IUiListener;

    iput-object p3, p0, Lcom/tencent/open/GameAppOperation$2;->b:Landroid/os/Bundle;

    iput-object p4, p0, Lcom/tencent/open/GameAppOperation$2;->c:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 9

    .line 846
    iget-object v0, p0, Lcom/tencent/open/GameAppOperation$2;->d:Lcom/tencent/open/GameAppOperation;

    invoke-static {v0}, Lcom/tencent/open/GameAppOperation;->a(Lcom/tencent/open/GameAppOperation;)Landroid/os/Bundle;

    move-result-object v5

    .line 847
    const/4 v0, 0x0

    if-ne v0, v5, :cond_0

    .line 848
    const-string v6, "accesstoken or openid or appid is null, please login first!"

    .line 849
    const-string v0, "openSDK_LOG.GameAppOper"

    invoke-static {v0, v6}, Lcom/tencent/open/a/f;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 850
    iget-object v0, p0, Lcom/tencent/open/GameAppOperation$2;->a:Lcom/tencent/tauth/IUiListener;

    new-instance v1, Lcom/tencent/tauth/UiError;

    const-string v2, "\u4f20\u5165\u53c2\u6570\u6709\u8bef!"

    const/4 v3, -0x5

    invoke-direct {v1, v3, v2, v6}, Lcom/tencent/tauth/UiError;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Lcom/tencent/tauth/IUiListener;->onError(Lcom/tencent/tauth/UiError;)V

    .line 851
    return-void

    .line 853
    :cond_0
    iget-object v0, p0, Lcom/tencent/open/GameAppOperation$2;->b:Landroid/os/Bundle;

    invoke-virtual {v5, v0}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    .line 854
    const-string v6, "http://fusion.qq.com/cgi-bin/prize_sharing/query_unexchange_prize.cgi"

    .line 855
    const/4 v7, 0x0

    .line 857
    :try_start_0
    iget-object v0, p0, Lcom/tencent/open/GameAppOperation$2;->d:Lcom/tencent/open/GameAppOperation;

    invoke-static {v0}, Lcom/tencent/open/GameAppOperation;->d(Lcom/tencent/open/GameAppOperation;)Lcom/tencent/connect/auth/QQToken;

    move-result-object v0

    iget-object v1, p0, Lcom/tencent/open/GameAppOperation$2;->c:Landroid/content/Context;

    const-string v2, "GET"

    invoke-static {v0, v1, v6, v5, v2}, Lcom/tencent/open/utils/HttpUtils;->request(Lcom/tencent/connect/auth/QQToken;Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;)Lorg/json/JSONObject;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v7

    .line 863
    goto :goto_0

    .line 858
    :catch_0
    move-exception v8

    .line 859
    const-string v0, "openSDK_LOG.GameAppOper"

    const-string v1, "Exception occur in queryUnexchangePrize"

    invoke-static {v0, v1, v8}, Lcom/tencent/open/a/f;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 860
    iget-object v0, p0, Lcom/tencent/open/GameAppOperation$2;->a:Lcom/tencent/tauth/IUiListener;

    new-instance v1, Lcom/tencent/tauth/UiError;

    const-string v2, "\u7f51\u7edc\u8fde\u63a5\u5f02\u5e38\uff0c\u8bf7\u68c0\u67e5\u540e\u91cd\u8bd5!"

    invoke-virtual {v8}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    const/4 v4, -0x2

    invoke-direct {v1, v4, v2, v3}, Lcom/tencent/tauth/UiError;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Lcom/tencent/tauth/IUiListener;->onError(Lcom/tencent/tauth/UiError;)V

    .line 862
    return-void

    .line 865
    :goto_0
    iget-object v0, p0, Lcom/tencent/open/GameAppOperation$2;->a:Lcom/tencent/tauth/IUiListener;

    invoke-interface {v0, v7}, Lcom/tencent/tauth/IUiListener;->onComplete(Ljava/lang/Object;)V

    .line 866
    return-void
.end method
