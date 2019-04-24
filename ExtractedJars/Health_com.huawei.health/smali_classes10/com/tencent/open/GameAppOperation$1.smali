.class Lcom/tencent/open/GameAppOperation$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tencent/open/GameAppOperation;->sharePrizeToQQ(Landroid/app/Activity;Landroid/os/Bundle;Lcom/tencent/tauth/IUiListener;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/tencent/tauth/IUiListener;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Landroid/app/Activity;

.field final synthetic d:Landroid/os/Bundle;

.field final synthetic e:Lcom/tencent/open/GameAppOperation;


# direct methods
.method constructor <init>(Lcom/tencent/open/GameAppOperation;Lcom/tencent/tauth/IUiListener;Ljava/lang/String;Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0

    .line 762
    iput-object p1, p0, Lcom/tencent/open/GameAppOperation$1;->e:Lcom/tencent/open/GameAppOperation;

    iput-object p2, p0, Lcom/tencent/open/GameAppOperation$1;->a:Lcom/tencent/tauth/IUiListener;

    iput-object p3, p0, Lcom/tencent/open/GameAppOperation$1;->b:Ljava/lang/String;

    iput-object p4, p0, Lcom/tencent/open/GameAppOperation$1;->c:Landroid/app/Activity;

    iput-object p5, p0, Lcom/tencent/open/GameAppOperation$1;->d:Landroid/os/Bundle;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 12

    .line 766
    iget-object v0, p0, Lcom/tencent/open/GameAppOperation$1;->e:Lcom/tencent/open/GameAppOperation;

    invoke-static {v0}, Lcom/tencent/open/GameAppOperation;->a(Lcom/tencent/open/GameAppOperation;)Landroid/os/Bundle;

    move-result-object v5

    .line 767
    const/4 v0, 0x0

    if-ne v0, v5, :cond_0

    .line 768
    const-string v6, "accesstoken or openid or appid is null, please login first!"

    .line 769
    const-string v0, "openSDK_LOG.GameAppOper"

    invoke-static {v0, v6}, Lcom/tencent/open/a/f;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 770
    iget-object v0, p0, Lcom/tencent/open/GameAppOperation$1;->a:Lcom/tencent/tauth/IUiListener;

    new-instance v1, Lcom/tencent/tauth/UiError;

    const-string v2, "\u4f20\u5165\u53c2\u6570\u6709\u8bef!"

    const/4 v3, -0x5

    invoke-direct {v1, v3, v2, v6}, Lcom/tencent/tauth/UiError;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Lcom/tencent/tauth/IUiListener;->onError(Lcom/tencent/tauth/UiError;)V

    .line 771
    return-void

    .line 773
    :cond_0
    const-string v0, "activityid"

    iget-object v1, p0, Lcom/tencent/open/GameAppOperation$1;->b:Ljava/lang/String;

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 774
    const-string v6, "http://fusion.qq.com/cgi-bin/prize_sharing/make_share_url.cgi"

    .line 775
    const/4 v7, 0x0

    .line 777
    :try_start_0
    iget-object v0, p0, Lcom/tencent/open/GameAppOperation$1;->e:Lcom/tencent/open/GameAppOperation;

    invoke-static {v0}, Lcom/tencent/open/GameAppOperation;->b(Lcom/tencent/open/GameAppOperation;)Lcom/tencent/connect/auth/QQToken;

    move-result-object v0

    iget-object v1, p0, Lcom/tencent/open/GameAppOperation$1;->c:Landroid/app/Activity;

    invoke-virtual {v1}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "GET"

    invoke-static {v0, v1, v6, v5, v2}, Lcom/tencent/open/utils/HttpUtils;->request(Lcom/tencent/connect/auth/QQToken;Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;)Lorg/json/JSONObject;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v7

    .line 783
    goto :goto_0

    .line 779
    :catch_0
    move-exception v8

    .line 780
    const-string v0, "openSDK_LOG.GameAppOper"

    const-string v1, "Exception occur in make_share_url"

    invoke-static {v0, v1, v8}, Lcom/tencent/open/a/f;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 781
    iget-object v0, p0, Lcom/tencent/open/GameAppOperation$1;->a:Lcom/tencent/tauth/IUiListener;

    new-instance v1, Lcom/tencent/tauth/UiError;

    const-string v2, "\u7f51\u7edc\u8fde\u63a5\u5f02\u5e38\uff0c\u8bf7\u68c0\u67e5\u540e\u91cd\u8bd5!"

    invoke-virtual {v8}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    const/4 v4, -0x2

    invoke-direct {v1, v4, v2, v3}, Lcom/tencent/tauth/UiError;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Lcom/tencent/tauth/IUiListener;->onError(Lcom/tencent/tauth/UiError;)V

    .line 782
    return-void

    .line 786
    :goto_0
    const-string v0, "ret"

    :try_start_1
    invoke-virtual {v7, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v8

    .line 787
    const-string v0, "subCode"

    invoke-virtual {v7, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v9

    .line 788
    if-nez v8, :cond_1

    if-nez v9, :cond_1

    .line 789
    const-string v0, "share_url"

    invoke-virtual {v7, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    .line 790
    iget-object v0, p0, Lcom/tencent/open/GameAppOperation$1;->d:Landroid/os/Bundle;

    const-string v1, "targetUrl"

    invoke-virtual {v0, v1, v10}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 791
    new-instance v11, Lcom/tencent/connect/share/QQShare;

    iget-object v0, p0, Lcom/tencent/open/GameAppOperation$1;->c:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/tencent/open/GameAppOperation$1;->e:Lcom/tencent/open/GameAppOperation;

    invoke-static {v1}, Lcom/tencent/open/GameAppOperation;->c(Lcom/tencent/open/GameAppOperation;)Lcom/tencent/connect/auth/QQToken;

    move-result-object v1

    invoke-direct {v11, v0, v1}, Lcom/tencent/connect/share/QQShare;-><init>(Landroid/content/Context;Lcom/tencent/connect/auth/QQToken;)V

    .line 792
    iget-object v0, p0, Lcom/tencent/open/GameAppOperation$1;->c:Landroid/app/Activity;

    iget-object v1, p0, Lcom/tencent/open/GameAppOperation$1;->d:Landroid/os/Bundle;

    iget-object v2, p0, Lcom/tencent/open/GameAppOperation$1;->a:Lcom/tencent/tauth/IUiListener;

    invoke-virtual {v11, v0, v1, v2}, Lcom/tencent/connect/share/QQShare;->shareToQQ(Landroid/app/Activity;Landroid/os/Bundle;Lcom/tencent/tauth/IUiListener;)V

    .line 793
    goto :goto_1

    .line 794
    :cond_1
    const-string v0, "msg"

    invoke-virtual {v7, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    .line 795
    iget-object v0, p0, Lcom/tencent/open/GameAppOperation$1;->a:Lcom/tencent/tauth/IUiListener;

    new-instance v1, Lcom/tencent/tauth/UiError;

    const-string v2, "make_share_url error."

    invoke-direct {v1, v8, v2, v10}, Lcom/tencent/tauth/UiError;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Lcom/tencent/tauth/IUiListener;->onError(Lcom/tencent/tauth/UiError;)V
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    .line 800
    :goto_1
    goto :goto_2

    .line 797
    :catch_1
    move-exception v8

    .line 798
    const-string v0, "openSDK_LOG.GameAppOper"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "JSONException occur in make_share_url, errorMsg: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v8}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 799
    iget-object v0, p0, Lcom/tencent/open/GameAppOperation$1;->a:Lcom/tencent/tauth/IUiListener;

    new-instance v1, Lcom/tencent/tauth/UiError;

    const-string v2, "\u670d\u52a1\u5668\u8fd4\u56de\u6570\u636e\u683c\u5f0f\u6709\u8bef!"

    const-string v3, ""

    const/4 v4, -0x4

    invoke-direct {v1, v4, v2, v3}, Lcom/tencent/tauth/UiError;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Lcom/tencent/tauth/IUiListener;->onError(Lcom/tencent/tauth/UiError;)V

    .line 801
    :goto_2
    return-void
.end method
