.class Lcom/tencent/open/GameAppOperation$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tencent/open/GameAppOperation;->isActivityAvailable(Landroid/app/Activity;Ljava/lang/String;Lcom/tencent/tauth/IUiListener;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/tencent/tauth/IUiListener;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Landroid/app/Activity;

.field final synthetic d:Lcom/tencent/open/GameAppOperation;


# direct methods
.method constructor <init>(Lcom/tencent/open/GameAppOperation;Lcom/tencent/tauth/IUiListener;Ljava/lang/String;Landroid/app/Activity;)V
    .locals 0

    .line 980
    iput-object p1, p0, Lcom/tencent/open/GameAppOperation$4;->d:Lcom/tencent/open/GameAppOperation;

    iput-object p2, p0, Lcom/tencent/open/GameAppOperation$4;->a:Lcom/tencent/tauth/IUiListener;

    iput-object p3, p0, Lcom/tencent/open/GameAppOperation$4;->b:Ljava/lang/String;

    iput-object p4, p0, Lcom/tencent/open/GameAppOperation$4;->c:Landroid/app/Activity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 9

    .line 984
    iget-object v0, p0, Lcom/tencent/open/GameAppOperation$4;->d:Lcom/tencent/open/GameAppOperation;

    invoke-static {v0}, Lcom/tencent/open/GameAppOperation;->a(Lcom/tencent/open/GameAppOperation;)Landroid/os/Bundle;

    move-result-object v5

    .line 985
    const/4 v0, 0x0

    if-ne v0, v5, :cond_0

    .line 986
    const-string v6, "accesstoken or openid or appid is null, please login first!"

    .line 987
    const-string v0, "openSDK_LOG.GameAppOper"

    invoke-static {v0, v6}, Lcom/tencent/open/a/f;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 988
    iget-object v0, p0, Lcom/tencent/open/GameAppOperation$4;->a:Lcom/tencent/tauth/IUiListener;

    new-instance v1, Lcom/tencent/tauth/UiError;

    const-string v2, "\u4f20\u5165\u53c2\u6570\u6709\u8bef!"

    const/4 v3, -0x5

    invoke-direct {v1, v3, v2, v6}, Lcom/tencent/tauth/UiError;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Lcom/tencent/tauth/IUiListener;->onError(Lcom/tencent/tauth/UiError;)V

    .line 989
    return-void

    .line 991
    :cond_0
    const-string v0, "activityid"

    iget-object v1, p0, Lcom/tencent/open/GameAppOperation$4;->b:Ljava/lang/String;

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 992
    const-string v6, "http://fusion.qq.com/cgi-bin/prize_sharing/get_activity_state.cgi"

    .line 993
    const/4 v7, 0x0

    .line 995
    :try_start_0
    iget-object v0, p0, Lcom/tencent/open/GameAppOperation$4;->d:Lcom/tencent/open/GameAppOperation;

    invoke-static {v0}, Lcom/tencent/open/GameAppOperation;->f(Lcom/tencent/open/GameAppOperation;)Lcom/tencent/connect/auth/QQToken;

    move-result-object v0

    iget-object v1, p0, Lcom/tencent/open/GameAppOperation$4;->c:Landroid/app/Activity;

    invoke-virtual {v1}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "GET"

    invoke-static {v0, v1, v6, v5, v2}, Lcom/tencent/open/utils/HttpUtils;->request(Lcom/tencent/connect/auth/QQToken;Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;)Lorg/json/JSONObject;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v7

    .line 1002
    goto :goto_0

    .line 997
    :catch_0
    move-exception v8

    .line 998
    const-string v0, "openSDK_LOG.GameAppOper"

    const-string v1, "Exception occur in make_share_url"

    invoke-static {v0, v1, v8}, Lcom/tencent/open/a/f;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 999
    iget-object v0, p0, Lcom/tencent/open/GameAppOperation$4;->a:Lcom/tencent/tauth/IUiListener;

    new-instance v1, Lcom/tencent/tauth/UiError;

    const-string v2, "Exception occur in make_share_url"

    invoke-virtual {v8}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    const/4 v4, -0x6

    invoke-direct {v1, v4, v2, v3}, Lcom/tencent/tauth/UiError;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Lcom/tencent/tauth/IUiListener;->onError(Lcom/tencent/tauth/UiError;)V

    .line 1001
    return-void

    .line 1004
    :goto_0
    iget-object v0, p0, Lcom/tencent/open/GameAppOperation$4;->a:Lcom/tencent/tauth/IUiListener;

    invoke-interface {v0, v7}, Lcom/tencent/tauth/IUiListener;->onComplete(Ljava/lang/Object;)V

    .line 1005
    return-void
.end method
