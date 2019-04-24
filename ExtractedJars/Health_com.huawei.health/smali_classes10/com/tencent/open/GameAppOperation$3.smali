.class Lcom/tencent/open/GameAppOperation$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tencent/open/GameAppOperation;->exchangePrize(Landroid/content/Context;Landroid/os/Bundle;Lcom/tencent/tauth/IUiListener;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/tencent/tauth/IUiListener;

.field final synthetic b:Ljava/lang/StringBuffer;

.field final synthetic c:Landroid/content/Context;

.field final synthetic d:Lcom/tencent/open/GameAppOperation;


# direct methods
.method constructor <init>(Lcom/tencent/open/GameAppOperation;Lcom/tencent/tauth/IUiListener;Ljava/lang/StringBuffer;Landroid/content/Context;)V
    .locals 0

    .line 919
    iput-object p1, p0, Lcom/tencent/open/GameAppOperation$3;->d:Lcom/tencent/open/GameAppOperation;

    iput-object p2, p0, Lcom/tencent/open/GameAppOperation$3;->a:Lcom/tencent/tauth/IUiListener;

    iput-object p3, p0, Lcom/tencent/open/GameAppOperation$3;->b:Ljava/lang/StringBuffer;

    iput-object p4, p0, Lcom/tencent/open/GameAppOperation$3;->c:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 9

    .line 923
    iget-object v0, p0, Lcom/tencent/open/GameAppOperation$3;->d:Lcom/tencent/open/GameAppOperation;

    invoke-static {v0}, Lcom/tencent/open/GameAppOperation;->a(Lcom/tencent/open/GameAppOperation;)Landroid/os/Bundle;

    move-result-object v5

    .line 924
    const/4 v0, 0x0

    if-ne v0, v5, :cond_0

    .line 925
    const-string v6, "accesstoken or openid or appid is null, please login first!"

    .line 926
    const-string v0, "openSDK_LOG.GameAppOper"

    invoke-static {v0, v6}, Lcom/tencent/open/a/f;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 927
    iget-object v0, p0, Lcom/tencent/open/GameAppOperation$3;->a:Lcom/tencent/tauth/IUiListener;

    new-instance v1, Lcom/tencent/tauth/UiError;

    const-string v2, "\u4f20\u5165\u53c2\u6570\u6709\u8bef!"

    const/4 v3, -0x5

    invoke-direct {v1, v3, v2, v6}, Lcom/tencent/tauth/UiError;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Lcom/tencent/tauth/IUiListener;->onError(Lcom/tencent/tauth/UiError;)V

    .line 928
    return-void

    .line 930
    :cond_0
    const-string v0, "shareid"

    iget-object v1, p0, Lcom/tencent/open/GameAppOperation$3;->b:Ljava/lang/StringBuffer;

    invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 931
    const-string v0, "imei"

    invoke-static {}, Lcom/tencent/open/utils/Global;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/tencent/open/b/c;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 932
    const-string v6, "http://fusion.qq.com/cgi-bin/prize_sharing/exchange_prize.cgi"

    .line 933
    const/4 v7, 0x0

    .line 935
    :try_start_0
    iget-object v0, p0, Lcom/tencent/open/GameAppOperation$3;->d:Lcom/tencent/open/GameAppOperation;

    invoke-static {v0}, Lcom/tencent/open/GameAppOperation;->e(Lcom/tencent/open/GameAppOperation;)Lcom/tencent/connect/auth/QQToken;

    move-result-object v0

    iget-object v1, p0, Lcom/tencent/open/GameAppOperation$3;->c:Landroid/content/Context;

    const-string v2, "GET"

    invoke-static {v0, v1, v6, v5, v2}, Lcom/tencent/open/utils/HttpUtils;->request(Lcom/tencent/connect/auth/QQToken;Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;)Lorg/json/JSONObject;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v7

    .line 940
    goto :goto_0

    .line 936
    :catch_0
    move-exception v8

    .line 937
    const-string v0, "openSDK_LOG.GameAppOper"

    const-string v1, "Exception occur in exchangePrize"

    invoke-static {v0, v1, v8}, Lcom/tencent/open/a/f;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 938
    iget-object v0, p0, Lcom/tencent/open/GameAppOperation$3;->a:Lcom/tencent/tauth/IUiListener;

    new-instance v1, Lcom/tencent/tauth/UiError;

    const-string v2, "\u7f51\u7edc\u8fde\u63a5\u5f02\u5e38\uff0c\u8bf7\u68c0\u67e5\u540e\u91cd\u8bd5!"

    invoke-virtual {v8}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    const/4 v4, -0x2

    invoke-direct {v1, v4, v2, v3}, Lcom/tencent/tauth/UiError;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Lcom/tencent/tauth/IUiListener;->onError(Lcom/tencent/tauth/UiError;)V

    .line 939
    return-void

    .line 942
    :goto_0
    iget-object v0, p0, Lcom/tencent/open/GameAppOperation$3;->a:Lcom/tencent/tauth/IUiListener;

    invoke-interface {v0, v7}, Lcom/tencent/tauth/IUiListener;->onComplete(Ljava/lang/Object;)V

    .line 943
    return-void
.end method
