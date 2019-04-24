.class Lcom/tencent/connect/share/QQShare$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/tencent/open/utils/AsynLoadImgBack;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tencent/connect/share/QQShare;->a(Landroid/app/Activity;Landroid/os/Bundle;Lcom/tencent/tauth/IUiListener;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/os/Bundle;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Ljava/lang/String;

.field final synthetic d:Lcom/tencent/tauth/IUiListener;

.field final synthetic e:Landroid/app/Activity;

.field final synthetic f:Lcom/tencent/connect/share/QQShare;


# direct methods
.method constructor <init>(Lcom/tencent/connect/share/QQShare;Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;Lcom/tencent/tauth/IUiListener;Landroid/app/Activity;)V
    .locals 0

    .line 284
    iput-object p1, p0, Lcom/tencent/connect/share/QQShare$2;->f:Lcom/tencent/connect/share/QQShare;

    iput-object p2, p0, Lcom/tencent/connect/share/QQShare$2;->a:Landroid/os/Bundle;

    iput-object p3, p0, Lcom/tencent/connect/share/QQShare$2;->b:Ljava/lang/String;

    iput-object p4, p0, Lcom/tencent/connect/share/QQShare$2;->c:Ljava/lang/String;

    iput-object p5, p0, Lcom/tencent/connect/share/QQShare$2;->d:Lcom/tencent/tauth/IUiListener;

    iput-object p6, p0, Lcom/tencent/connect/share/QQShare$2;->e:Landroid/app/Activity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public batchSaved(ILjava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ILjava/util/ArrayList<Ljava/lang/String;>;)V"
        }
    .end annotation

    .line 309
    return-void
.end method

.method public saved(ILjava/lang/String;)V
    .locals 10

    .line 287
    if-nez p1, :cond_0

    .line 288
    iget-object v0, p0, Lcom/tencent/connect/share/QQShare$2;->a:Landroid/os/Bundle;

    const-string v1, "imageLocalUrl"

    invoke-virtual {v0, v1, p2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 290
    :cond_0
    iget-object v0, p0, Lcom/tencent/connect/share/QQShare$2;->b:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/tencent/connect/share/QQShare$2;->c:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 291
    iget-object v0, p0, Lcom/tencent/connect/share/QQShare$2;->d:Lcom/tencent/tauth/IUiListener;

    if-eqz v0, :cond_1

    .line 292
    iget-object v0, p0, Lcom/tencent/connect/share/QQShare$2;->d:Lcom/tencent/tauth/IUiListener;

    new-instance v1, Lcom/tencent/tauth/UiError;

    const-string v2, "\u83b7\u53d6\u5206\u4eab\u56fe\u7247\u5931\u8d25!"

    const/4 v3, -0x6

    const/4 v4, 0x0

    invoke-direct {v1, v3, v2, v4}, Lcom/tencent/tauth/UiError;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Lcom/tencent/tauth/IUiListener;->onError(Lcom/tencent/tauth/UiError;)V

    .line 294
    const-string v0, "openSDK_LOG.QQShare"

    const-string v1, "shareToMobileQQ -- error: \u83b7\u53d6\u5206\u4eab\u56fe\u7247\u5931\u8d25!"

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 296
    :cond_1
    invoke-static {}, Lcom/tencent/open/b/d;->a()Lcom/tencent/open/b/d;

    move-result-object v0

    const-string v2, "SHARE_CHECK_SDK"

    const-string v3, "1000"

    iget-object v1, p0, Lcom/tencent/connect/share/QQShare$2;->f:Lcom/tencent/connect/share/QQShare;

    invoke-static {v1}, Lcom/tencent/connect/share/QQShare;->b(Lcom/tencent/connect/share/QQShare;)Lcom/tencent/connect/auth/QQToken;

    move-result-object v1

    invoke-virtual {v1}, Lcom/tencent/connect/auth/QQToken;->getAppId()Ljava/lang/String;

    move-result-object v4

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v5

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    const-string v9, "\u83b7\u53d6\u5206\u4eab\u56fe\u7247\u5931\u8d25!"

    const/4 v1, 0x1

    const/4 v7, 0x0

    const/4 v8, 0x1

    invoke-virtual/range {v0 .. v9}, Lcom/tencent/open/b/d;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;IILjava/lang/String;)V

    .line 299
    return-void

    .line 302
    :cond_2
    :goto_0
    iget-object v0, p0, Lcom/tencent/connect/share/QQShare$2;->f:Lcom/tencent/connect/share/QQShare;

    iget-object v1, p0, Lcom/tencent/connect/share/QQShare$2;->e:Landroid/app/Activity;

    iget-object v2, p0, Lcom/tencent/connect/share/QQShare$2;->a:Landroid/os/Bundle;

    iget-object v3, p0, Lcom/tencent/connect/share/QQShare$2;->d:Lcom/tencent/tauth/IUiListener;

    invoke-static {v0, v1, v2, v3}, Lcom/tencent/connect/share/QQShare;->a(Lcom/tencent/connect/share/QQShare;Landroid/app/Activity;Landroid/os/Bundle;Lcom/tencent/tauth/IUiListener;)V

    .line 303
    return-void
.end method
