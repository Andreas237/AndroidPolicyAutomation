.class public final Lcom/tencent/mm/opensdk/diffdev/a/d;
.super Landroid/os/AsyncTask;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/mm/opensdk/diffdev/a/d$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask<Ljava/lang/Void;Ljava/lang/Void;Lcom/tencent/mm/opensdk/diffdev/a/d$a;>;"
    }
.end annotation


# static fields
.field private static final h:Ljava/lang/String;

.field private static i:Ljava/lang/String;


# instance fields
.field private appId:Ljava/lang/String;

.field private j:Ljava/lang/String;

.field private k:Ljava/lang/String;

.field private l:Lcom/tencent/mm/opensdk/diffdev/OAuthListener;

.field private m:Lcom/tencent/mm/opensdk/diffdev/a/f;

.field private scope:Ljava/lang/String;

.field private signature:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/tencent/MicroMsg/oauth_qrcode.png"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/tencent/mm/opensdk/diffdev/a/d;->h:Ljava/lang/String;

    const/4 v0, 0x0

    sput-object v0, Lcom/tencent/mm/opensdk/diffdev/a/d;->i:Ljava/lang/String;

    const-string v0, "https://open.weixin.qq.com/connect/sdk/qrconnect?appid=%s&noncestr=%s&timestamp=%s&scope=%s&signature=%s"

    sput-object v0, Lcom/tencent/mm/opensdk/diffdev/a/d;->i:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/tencent/mm/opensdk/diffdev/OAuthListener;)V
    .locals 0

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    iput-object p1, p0, Lcom/tencent/mm/opensdk/diffdev/a/d;->appId:Ljava/lang/String;

    iput-object p2, p0, Lcom/tencent/mm/opensdk/diffdev/a/d;->scope:Ljava/lang/String;

    iput-object p3, p0, Lcom/tencent/mm/opensdk/diffdev/a/d;->j:Ljava/lang/String;

    iput-object p4, p0, Lcom/tencent/mm/opensdk/diffdev/a/d;->k:Ljava/lang/String;

    iput-object p5, p0, Lcom/tencent/mm/opensdk/diffdev/a/d;->signature:Ljava/lang/String;

    iput-object p6, p0, Lcom/tencent/mm/opensdk/diffdev/a/d;->l:Lcom/tencent/mm/opensdk/diffdev/OAuthListener;

    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 2

    const-string v0, "MicroMsg.SDK.GetQRCodeTask"

    const-string v1, "cancelTask"

    invoke-static {v0, v1}, Lcom/tencent/mm/opensdk/utils/Log;->i(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/tencent/mm/opensdk/diffdev/a/d;->m:Lcom/tencent/mm/opensdk/diffdev/a/f;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/tencent/mm/opensdk/diffdev/a/d;->cancel(Z)Z

    move-result v0

    return v0

    :cond_0
    iget-object v0, p0, Lcom/tencent/mm/opensdk/diffdev/a/d;->m:Lcom/tencent/mm/opensdk/diffdev/a/f;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/tencent/mm/opensdk/diffdev/a/f;->cancel(Z)Z

    move-result v0

    return v0
.end method

.method protected final synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    move-object p1, p0

    const-string v0, "MicroMsg.SDK.GetQRCodeTask"

    const-string v1, "external storage available = false"

    invoke-static {v0, v1}, Lcom/tencent/mm/opensdk/utils/Log;->i(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, Lcom/tencent/mm/opensdk/diffdev/a/d;->i:Ljava/lang/String;

    const/4 v1, 0x5

    new-array v1, v1, [Ljava/lang/Object;

    iget-object v2, p1, Lcom/tencent/mm/opensdk/diffdev/a/d;->appId:Ljava/lang/String;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p1, Lcom/tencent/mm/opensdk/diffdev/a/d;->j:Ljava/lang/String;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    iget-object v2, p1, Lcom/tencent/mm/opensdk/diffdev/a/d;->k:Ljava/lang/String;

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget-object v2, p1, Lcom/tencent/mm/opensdk/diffdev/a/d;->scope:Ljava/lang/String;

    const/4 v3, 0x3

    aput-object v2, v1, v3

    iget-object v2, p1, Lcom/tencent/mm/opensdk/diffdev/a/d;->signature:Ljava/lang/String;

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    invoke-static {p1}, Lcom/tencent/mm/opensdk/diffdev/a/e;->a(Ljava/lang/String;)[B

    move-result-object v5

    const-string v0, "MicroMsg.SDK.GetQRCodeTask"

    const-string v1, "doInBackground, url = %s, time consumed = %d(ms)"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    sub-long/2addr v3, v6

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tencent/mm/opensdk/utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v5}, Lcom/tencent/mm/opensdk/diffdev/a/d$a;->a([B)Lcom/tencent/mm/opensdk/diffdev/a/d$a;

    move-result-object v0

    return-object v0
.end method

.method protected final synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 6

    move-object v5, p1

    check-cast v5, Lcom/tencent/mm/opensdk/diffdev/a/d$a;

    move-object p1, p0

    iget-object v0, v5, Lcom/tencent/mm/opensdk/diffdev/a/d$a;->n:Lcom/tencent/mm/opensdk/diffdev/OAuthErrCode;

    sget-object v1, Lcom/tencent/mm/opensdk/diffdev/OAuthErrCode;->WechatAuth_Err_OK:Lcom/tencent/mm/opensdk/diffdev/OAuthErrCode;

    if-ne v0, v1, :cond_1

    const-string v0, "MicroMsg.SDK.GetQRCodeTask"

    const-string v1, "onPostExecute, get qrcode success"

    invoke-static {v0, v1}, Lcom/tencent/mm/opensdk/utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p1, Lcom/tencent/mm/opensdk/diffdev/a/d;->l:Lcom/tencent/mm/opensdk/diffdev/OAuthListener;

    iget-object v1, v5, Lcom/tencent/mm/opensdk/diffdev/a/d$a;->q:Ljava/lang/String;

    iget-object v2, v5, Lcom/tencent/mm/opensdk/diffdev/a/d$a;->t:[B

    invoke-interface {v0, v1, v2}, Lcom/tencent/mm/opensdk/diffdev/OAuthListener;->onAuthGotQrcode(Ljava/lang/String;[B)V

    new-instance v0, Lcom/tencent/mm/opensdk/diffdev/a/f;

    iget-object v1, v5, Lcom/tencent/mm/opensdk/diffdev/a/d$a;->o:Ljava/lang/String;

    iget-object v2, p1, Lcom/tencent/mm/opensdk/diffdev/a/d;->l:Lcom/tencent/mm/opensdk/diffdev/OAuthListener;

    invoke-direct {v0, v1, v2}, Lcom/tencent/mm/opensdk/diffdev/a/f;-><init>(Ljava/lang/String;Lcom/tencent/mm/opensdk/diffdev/OAuthListener;)V

    iput-object v0, p1, Lcom/tencent/mm/opensdk/diffdev/a/d;->m:Lcom/tencent/mm/opensdk/diffdev/a/f;

    iget-object p1, p1, Lcom/tencent/mm/opensdk/diffdev/a/d;->m:Lcom/tencent/mm/opensdk/diffdev/a/f;

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xb

    if-lt v0, v1, :cond_0

    sget-object v0, Landroid/os/AsyncTask;->THREAD_POOL_EXECUTOR:Ljava/util/concurrent/Executor;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Void;

    invoke-virtual {p1, v0, v1}, Lcom/tencent/mm/opensdk/diffdev/a/f;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    return-void

    :cond_0
    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Void;

    invoke-virtual {p1, v0}, Lcom/tencent/mm/opensdk/diffdev/a/f;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    return-void

    :cond_1
    const-string v0, "MicroMsg.SDK.GetQRCodeTask"

    const-string v1, "onPostExecute, get qrcode fail, OAuthErrCode = %s"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v3, v5, Lcom/tencent/mm/opensdk/diffdev/a/d$a;->n:Lcom/tencent/mm/opensdk/diffdev/OAuthErrCode;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tencent/mm/opensdk/utils/Log;->e(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p1, Lcom/tencent/mm/opensdk/diffdev/a/d;->l:Lcom/tencent/mm/opensdk/diffdev/OAuthListener;

    iget-object v1, v5, Lcom/tencent/mm/opensdk/diffdev/a/d$a;->n:Lcom/tencent/mm/opensdk/diffdev/OAuthErrCode;

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/tencent/mm/opensdk/diffdev/OAuthListener;->onAuthFinish(Lcom/tencent/mm/opensdk/diffdev/OAuthErrCode;Ljava/lang/String;)V

    return-void
.end method
