.class final Lcom/tencent/mm/opensdk/diffdev/a/f;
.super Landroid/os/AsyncTask;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/mm/opensdk/diffdev/a/f$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask<Ljava/lang/Void;Ljava/lang/Void;Lcom/tencent/mm/opensdk/diffdev/a/f$a;>;"
    }
.end annotation


# instance fields
.field private l:Lcom/tencent/mm/opensdk/diffdev/OAuthListener;

.field private o:Ljava/lang/String;

.field private u:I

.field private url:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/tencent/mm/opensdk/diffdev/OAuthListener;)V
    .locals 3

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    iput-object p1, p0, Lcom/tencent/mm/opensdk/diffdev/a/f;->o:Ljava/lang/String;

    iput-object p2, p0, Lcom/tencent/mm/opensdk/diffdev/a/f;->l:Lcom/tencent/mm/opensdk/diffdev/OAuthListener;

    const-string v0, "https://long.open.weixin.qq.com/connect/l/qrconnect?f=json&uuid=%s"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/tencent/mm/opensdk/diffdev/a/f;->url:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method protected final synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    move-object p1, p0

    iget-object v0, p0, Lcom/tencent/mm/opensdk/diffdev/a/f;->o:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p1, Lcom/tencent/mm/opensdk/diffdev/a/f;->o:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    const-string v0, "MicroMsg.SDK.NoopingTask"

    const-string v1, "run fail, uuid is null"

    invoke-static {v0, v1}, Lcom/tencent/mm/opensdk/utils/Log;->e(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v5, Lcom/tencent/mm/opensdk/diffdev/a/f$a;

    invoke-direct {v5}, Lcom/tencent/mm/opensdk/diffdev/a/f$a;-><init>()V

    sget-object v0, Lcom/tencent/mm/opensdk/diffdev/OAuthErrCode;->WechatAuth_Err_NormalErr:Lcom/tencent/mm/opensdk/diffdev/OAuthErrCode;

    iput-object v0, v5, Lcom/tencent/mm/opensdk/diffdev/a/f$a;->n:Lcom/tencent/mm/opensdk/diffdev/OAuthErrCode;

    return-object v5

    :cond_1
    :goto_0
    invoke-virtual {p1}, Lcom/tencent/mm/opensdk/diffdev/a/f;->isCancelled()Z

    move-result v0

    if-nez v0, :cond_8

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p1, Lcom/tencent/mm/opensdk/diffdev/a/f;->url:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p1, Lcom/tencent/mm/opensdk/diffdev/a/f;->u:I

    if-nez v1, :cond_2

    const-string v1, ""

    goto :goto_1

    :cond_2
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "&last="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v2, p1, Lcom/tencent/mm/opensdk/diffdev/a/f;->u:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    :goto_1
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v7

    invoke-static {v5}, Lcom/tencent/mm/opensdk/diffdev/a/e;->a(Ljava/lang/String;)[B

    move-result-object v6

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v9

    invoke-static {v6}, Lcom/tencent/mm/opensdk/diffdev/a/f$a;->b([B)Lcom/tencent/mm/opensdk/diffdev/a/f$a;

    move-result-object v6

    const-string v0, "MicroMsg.SDK.NoopingTask"

    const-string v1, "nooping, url = %s, errCode = %s, uuidStatusCode = %d, time consumed = %d(ms)"

    const/4 v2, 0x4

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v5, v2, v3

    iget-object v3, v6, Lcom/tencent/mm/opensdk/diffdev/a/f$a;->n:Lcom/tencent/mm/opensdk/diffdev/OAuthErrCode;

    invoke-virtual {v3}, Lcom/tencent/mm/opensdk/diffdev/OAuthErrCode;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    iget v3, v6, Lcom/tencent/mm/opensdk/diffdev/a/f$a;->w:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x2

    aput-object v3, v2, v4

    sub-long v3, v9, v7

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    const/4 v4, 0x3

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tencent/mm/opensdk/utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, v6, Lcom/tencent/mm/opensdk/diffdev/a/f$a;->n:Lcom/tencent/mm/opensdk/diffdev/OAuthErrCode;

    sget-object v1, Lcom/tencent/mm/opensdk/diffdev/OAuthErrCode;->WechatAuth_Err_OK:Lcom/tencent/mm/opensdk/diffdev/OAuthErrCode;

    if-ne v0, v1, :cond_6

    iget v0, v6, Lcom/tencent/mm/opensdk/diffdev/a/f$a;->w:I

    iput v0, p1, Lcom/tencent/mm/opensdk/diffdev/a/f;->u:I

    iget v0, v6, Lcom/tencent/mm/opensdk/diffdev/a/f$a;->w:I

    sget-object v1, Lcom/tencent/mm/opensdk/diffdev/a/g;->z:Lcom/tencent/mm/opensdk/diffdev/a/g;

    invoke-virtual {v1}, Lcom/tencent/mm/opensdk/diffdev/a/g;->getCode()I

    move-result v1

    if-ne v0, v1, :cond_3

    iget-object v0, p1, Lcom/tencent/mm/opensdk/diffdev/a/f;->l:Lcom/tencent/mm/opensdk/diffdev/OAuthListener;

    invoke-interface {v0}, Lcom/tencent/mm/opensdk/diffdev/OAuthListener;->onQrcodeScanned()V

    goto/16 :goto_0

    :cond_3
    iget v0, v6, Lcom/tencent/mm/opensdk/diffdev/a/f$a;->w:I

    sget-object v1, Lcom/tencent/mm/opensdk/diffdev/a/g;->B:Lcom/tencent/mm/opensdk/diffdev/a/g;

    invoke-virtual {v1}, Lcom/tencent/mm/opensdk/diffdev/a/g;->getCode()I

    move-result v1

    if-eq v0, v1, :cond_7

    iget v0, v6, Lcom/tencent/mm/opensdk/diffdev/a/f$a;->w:I

    sget-object v1, Lcom/tencent/mm/opensdk/diffdev/a/g;->A:Lcom/tencent/mm/opensdk/diffdev/a/g;

    invoke-virtual {v1}, Lcom/tencent/mm/opensdk/diffdev/a/g;->getCode()I

    move-result v1

    if-ne v0, v1, :cond_7

    iget-object v0, v6, Lcom/tencent/mm/opensdk/diffdev/a/f$a;->v:Ljava/lang/String;

    if-eqz v0, :cond_4

    iget-object v0, v6, Lcom/tencent/mm/opensdk/diffdev/a/f$a;->v:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_5

    :cond_4
    const-string v0, "MicroMsg.SDK.NoopingTask"

    const-string v1, "nooping fail, confirm with an empty code!!!"

    invoke-static {v0, v1}, Lcom/tencent/mm/opensdk/utils/Log;->e(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, Lcom/tencent/mm/opensdk/diffdev/OAuthErrCode;->WechatAuth_Err_NormalErr:Lcom/tencent/mm/opensdk/diffdev/OAuthErrCode;

    iput-object v0, v6, Lcom/tencent/mm/opensdk/diffdev/a/f$a;->n:Lcom/tencent/mm/opensdk/diffdev/OAuthErrCode;

    :cond_5
    return-object v6

    :cond_6
    const-string v0, "MicroMsg.SDK.NoopingTask"

    const-string v1, "nooping fail, errCode = %s, uuidStatusCode = %d"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v3, v6, Lcom/tencent/mm/opensdk/diffdev/a/f$a;->n:Lcom/tencent/mm/opensdk/diffdev/OAuthErrCode;

    invoke-virtual {v3}, Lcom/tencent/mm/opensdk/diffdev/OAuthErrCode;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    iget v3, v6, Lcom/tencent/mm/opensdk/diffdev/a/f$a;->w:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tencent/mm/opensdk/utils/Log;->e(Ljava/lang/String;Ljava/lang/String;)V

    return-object v6

    :cond_7
    goto/16 :goto_0

    :cond_8
    const-string v0, "MicroMsg.SDK.NoopingTask"

    const-string v1, "IDiffDevOAuth.stopAuth / detach invoked"

    invoke-static {v0, v1}, Lcom/tencent/mm/opensdk/utils/Log;->i(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v5, Lcom/tencent/mm/opensdk/diffdev/a/f$a;

    invoke-direct {v5}, Lcom/tencent/mm/opensdk/diffdev/a/f$a;-><init>()V

    sget-object v0, Lcom/tencent/mm/opensdk/diffdev/OAuthErrCode;->WechatAuth_Err_Auth_Stopped:Lcom/tencent/mm/opensdk/diffdev/OAuthErrCode;

    iput-object v0, v5, Lcom/tencent/mm/opensdk/diffdev/a/f$a;->n:Lcom/tencent/mm/opensdk/diffdev/OAuthErrCode;

    return-object v5
.end method

.method protected final synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 3

    check-cast p1, Lcom/tencent/mm/opensdk/diffdev/a/f$a;

    iget-object v0, p0, Lcom/tencent/mm/opensdk/diffdev/a/f;->l:Lcom/tencent/mm/opensdk/diffdev/OAuthListener;

    iget-object v1, p1, Lcom/tencent/mm/opensdk/diffdev/a/f$a;->n:Lcom/tencent/mm/opensdk/diffdev/OAuthErrCode;

    iget-object v2, p1, Lcom/tencent/mm/opensdk/diffdev/a/f$a;->v:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Lcom/tencent/mm/opensdk/diffdev/OAuthListener;->onAuthFinish(Lcom/tencent/mm/opensdk/diffdev/OAuthErrCode;Ljava/lang/String;)V

    return-void
.end method
