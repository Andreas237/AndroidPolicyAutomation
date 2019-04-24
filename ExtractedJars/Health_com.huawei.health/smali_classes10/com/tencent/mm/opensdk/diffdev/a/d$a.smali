.class final Lcom/tencent/mm/opensdk/diffdev/a/d$a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/mm/opensdk/diffdev/a/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# instance fields
.field public n:Lcom/tencent/mm/opensdk/diffdev/OAuthErrCode;

.field public o:Ljava/lang/String;

.field public p:Ljava/lang/String;

.field public q:Ljava/lang/String;

.field public r:I

.field public s:Ljava/lang/String;

.field public t:[B


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a([B)Lcom/tencent/mm/opensdk/diffdev/a/d$a;
    .locals 7

    new-instance v5, Lcom/tencent/mm/opensdk/diffdev/a/d$a;

    invoke-direct {v5}, Lcom/tencent/mm/opensdk/diffdev/a/d$a;-><init>()V

    if-eqz p0, :cond_0

    array-length v0, p0

    if-nez v0, :cond_1

    :cond_0
    const-string v0, "MicroMsg.SDK.GetQRCodeResult"

    const-string v1, "parse fail, buf is null"

    invoke-static {v0, v1}, Lcom/tencent/mm/opensdk/utils/Log;->e(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, Lcom/tencent/mm/opensdk/diffdev/OAuthErrCode;->WechatAuth_Err_NetworkErr:Lcom/tencent/mm/opensdk/diffdev/OAuthErrCode;

    iput-object v0, v5, Lcom/tencent/mm/opensdk/diffdev/a/d$a;->n:Lcom/tencent/mm/opensdk/diffdev/OAuthErrCode;

    return-object v5

    :cond_1
    :try_start_0
    new-instance v0, Ljava/lang/String;

    const-string v1, "utf-8"

    invoke-direct {v0, p0, v1}, Ljava/lang/String;-><init>([BLjava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-object p0, v0

    goto :goto_0

    :catch_0
    move-exception p0

    const-string v0, "MicroMsg.SDK.GetQRCodeResult"

    const-string v1, "parse fail, build String fail, ex = %s"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {p0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tencent/mm/opensdk/utils/Log;->e(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, Lcom/tencent/mm/opensdk/diffdev/OAuthErrCode;->WechatAuth_Err_NormalErr:Lcom/tencent/mm/opensdk/diffdev/OAuthErrCode;

    iput-object v0, v5, Lcom/tencent/mm/opensdk/diffdev/a/d$a;->n:Lcom/tencent/mm/opensdk/diffdev/OAuthErrCode;

    return-object v5

    :goto_0
    :try_start_1
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    move-object p0, v0

    const-string v1, "errcode"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    move v6, v0

    if-eqz v0, :cond_2

    const-string v0, "MicroMsg.SDK.GetQRCodeResult"

    const-string v1, "resp errcode = %d"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tencent/mm/opensdk/utils/Log;->e(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, Lcom/tencent/mm/opensdk/diffdev/OAuthErrCode;->WechatAuth_Err_NormalErr:Lcom/tencent/mm/opensdk/diffdev/OAuthErrCode;

    iput-object v0, v5, Lcom/tencent/mm/opensdk/diffdev/a/d$a;->n:Lcom/tencent/mm/opensdk/diffdev/OAuthErrCode;

    iput v6, v5, Lcom/tencent/mm/opensdk/diffdev/a/d$a;->r:I

    const-string v0, "errmsg"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v5, Lcom/tencent/mm/opensdk/diffdev/a/d$a;->s:Ljava/lang/String;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    return-object v5

    :cond_2
    const-string v0, "qrcode"

    :try_start_2
    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "qrcodebase64"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    if-eqz v6, :cond_3

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_4

    :cond_3
    const-string v0, "MicroMsg.SDK.GetQRCodeResult"

    const-string v1, "parse fail, qrcodeBase64 is null"

    invoke-static {v0, v1}, Lcom/tencent/mm/opensdk/utils/Log;->e(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, Lcom/tencent/mm/opensdk/diffdev/OAuthErrCode;->WechatAuth_Err_JsonDecodeErr:Lcom/tencent/mm/opensdk/diffdev/OAuthErrCode;

    iput-object v0, v5, Lcom/tencent/mm/opensdk/diffdev/a/d$a;->n:Lcom/tencent/mm/opensdk/diffdev/OAuthErrCode;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    return-object v5

    :cond_4
    const/4 v0, 0x0

    :try_start_3
    invoke-static {v6, v0}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object v6

    if-eqz v6, :cond_5

    array-length v0, v6

    if-nez v0, :cond_6

    :cond_5
    const-string v0, "MicroMsg.SDK.GetQRCodeResult"

    const-string v1, "parse fail, qrcodeBuf is null"

    invoke-static {v0, v1}, Lcom/tencent/mm/opensdk/utils/Log;->e(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, Lcom/tencent/mm/opensdk/diffdev/OAuthErrCode;->WechatAuth_Err_JsonDecodeErr:Lcom/tencent/mm/opensdk/diffdev/OAuthErrCode;

    iput-object v0, v5, Lcom/tencent/mm/opensdk/diffdev/a/d$a;->n:Lcom/tencent/mm/opensdk/diffdev/OAuthErrCode;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    return-object v5

    :cond_6
    :try_start_4
    sget-object v0, Lcom/tencent/mm/opensdk/diffdev/OAuthErrCode;->WechatAuth_Err_OK:Lcom/tencent/mm/opensdk/diffdev/OAuthErrCode;

    iput-object v0, v5, Lcom/tencent/mm/opensdk/diffdev/a/d$a;->n:Lcom/tencent/mm/opensdk/diffdev/OAuthErrCode;

    iput-object v6, v5, Lcom/tencent/mm/opensdk/diffdev/a/d$a;->t:[B

    const-string v0, "uuid"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v5, Lcom/tencent/mm/opensdk/diffdev/a/d$a;->o:Ljava/lang/String;

    const-string v0, "appname"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v5, Lcom/tencent/mm/opensdk/diffdev/a/d$a;->p:Ljava/lang/String;

    const-string v0, "MicroMsg.SDK.GetQRCodeResult"

    const-string v1, "parse succ, save in memory, uuid = %s, appname = %s, imgBufLength = %d"

    const/4 v2, 0x3

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v3, v5, Lcom/tencent/mm/opensdk/diffdev/a/d$a;->o:Ljava/lang/String;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    iget-object v3, v5, Lcom/tencent/mm/opensdk/diffdev/a/d$a;->p:Ljava/lang/String;

    const/4 v4, 0x1

    aput-object v3, v2, v4

    iget-object v3, v5, Lcom/tencent/mm/opensdk/diffdev/a/d$a;->t:[B

    array-length v3, v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x2

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tencent/mm/opensdk/utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1

    return-object v5

    :catch_1
    move-exception v6

    const-string v0, "MicroMsg.SDK.GetQRCodeResult"

    const-string v1, "parse json fail, ex = %s"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v6}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tencent/mm/opensdk/utils/Log;->e(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, Lcom/tencent/mm/opensdk/diffdev/OAuthErrCode;->WechatAuth_Err_NormalErr:Lcom/tencent/mm/opensdk/diffdev/OAuthErrCode;

    iput-object v0, v5, Lcom/tencent/mm/opensdk/diffdev/a/d$a;->n:Lcom/tencent/mm/opensdk/diffdev/OAuthErrCode;

    return-object v5
.end method
