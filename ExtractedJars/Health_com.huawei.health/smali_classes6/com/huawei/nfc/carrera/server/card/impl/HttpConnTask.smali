.class public abstract Lcom/huawei/nfc/carrera/server/card/impl/HttpConnTask;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<Result:Ljava/lang/Object;RequestParams:Ljava/lang/Object;>Ljava/lang/Object;"
    }
.end annotation


# static fields
.field private static final CONTENT_TYPE_APP_JSON:Ljava/lang/String; = "application/json"

.field private static final DEFAULT_TIMEOUT:I = 0x7530

.field protected static final ERROR_CODE_CONNECTION_FAILED:I = -0x2

.field protected static final ERROR_CODE_NO_NETWORK:I = -0x1

.field protected static final ERROR_CODE_PARAMS_ERROR:I = -0x3

.field protected static final ERROR_CODE_SERVER_OVERLOAD:I = -0x4

.field private static final SERVER_OVERLOAD_ERRORCODE:I = 0x1f7

.field private static final TAG:Ljava/lang/String; = "HttpConnTask"


# instance fields
.field private mConnTimeout:I

.field protected mContext:Landroid/content/Context;

.field private mSocketTimeout:I

.field private final mUrl:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 1

    .line 101
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 88
    const/16 v0, 0x7530

    iput v0, p0, Lcom/huawei/nfc/carrera/server/card/impl/HttpConnTask;->mConnTimeout:I

    .line 93
    const/16 v0, 0x7530

    iput v0, p0, Lcom/huawei/nfc/carrera/server/card/impl/HttpConnTask;->mSocketTimeout:I

    .line 102
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/impl/HttpConnTask;->mContext:Landroid/content/Context;

    .line 103
    iput-object p2, p0, Lcom/huawei/nfc/carrera/server/card/impl/HttpConnTask;->mUrl:Ljava/lang/String;

    .line 104
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;II)V
    .locals 1

    .line 114
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 88
    const/16 v0, 0x7530

    iput v0, p0, Lcom/huawei/nfc/carrera/server/card/impl/HttpConnTask;->mConnTimeout:I

    .line 93
    const/16 v0, 0x7530

    iput v0, p0, Lcom/huawei/nfc/carrera/server/card/impl/HttpConnTask;->mSocketTimeout:I

    .line 115
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/impl/HttpConnTask;->mContext:Landroid/content/Context;

    .line 116
    iput-object p2, p0, Lcom/huawei/nfc/carrera/server/card/impl/HttpConnTask;->mUrl:Ljava/lang/String;

    .line 117
    iput p3, p0, Lcom/huawei/nfc/carrera/server/card/impl/HttpConnTask;->mConnTimeout:I

    .line 118
    iput p4, p0, Lcom/huawei/nfc/carrera/server/card/impl/HttpConnTask;->mSocketTimeout:I

    .line 119
    return-void
.end method

.method private closeStream(Ljava/io/DataOutputStream;Ljava/io/InputStream;Ljava/io/ByteArrayOutputStream;Ljava/net/HttpURLConnection;)V
    .locals 2

    .line 230
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    .line 232
    :try_start_0
    invoke-virtual {p1}, Ljava/io/DataOutputStream;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 235
    goto :goto_0

    .line 233
    :catch_0
    move-exception v1

    .line 234
    const-string v0, "processTask close stream error1."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 238
    :cond_0
    :goto_0
    const/4 v0, 0x0

    if-eq v0, p2, :cond_1

    .line 240
    :try_start_1
    invoke-virtual {p2}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    .line 243
    goto :goto_1

    .line 241
    :catch_1
    move-exception v1

    .line 242
    const-string v0, "processTask close stream error2."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 246
    :cond_1
    :goto_1
    const/4 v0, 0x0

    if-eq v0, p3, :cond_2

    .line 248
    :try_start_2
    invoke-virtual {p3}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2

    .line 251
    goto :goto_2

    .line 249
    :catch_2
    move-exception v1

    .line 250
    const-string v0, "processTask close stream error3."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 254
    :cond_2
    :goto_2
    const/4 v0, 0x0

    if-eq v0, p4, :cond_3

    .line 255
    invoke-virtual {p4}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 257
    :cond_3
    return-void
.end method

.method private initHttpsConnection(Ljavax/net/ssl/HttpsURLConnection;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/NoSuchAlgorithmException;,
            Ljava/security/KeyManagementException;
        }
    .end annotation

    .line 298
    new-instance v0, Lcom/huawei/wallet/utils/WalletSSLSocketFactory;

    new-instance v1, Lo/ect;

    iget-object v2, p0, Lcom/huawei/nfc/carrera/server/card/impl/HttpConnTask;->mContext:Landroid/content/Context;

    invoke-direct {v1, v2}, Lo/ect;-><init>(Landroid/content/Context;)V

    invoke-direct {v0, v1}, Lcom/huawei/wallet/utils/WalletSSLSocketFactory;-><init>(Ljavax/net/ssl/X509TrustManager;)V

    invoke-virtual {p1, v0}, Ljavax/net/ssl/HttpsURLConnection;->setSSLSocketFactory(Ljavax/net/ssl/SSLSocketFactory;)V

    .line 300
    new-instance v0, Lorg/apache/http/conn/ssl/StrictHostnameVerifier;

    invoke-direct {v0}, Lorg/apache/http/conn/ssl/StrictHostnameVerifier;-><init>()V

    invoke-virtual {p1, v0}, Ljavax/net/ssl/HttpsURLConnection;->setHostnameVerifier(Ljavax/net/ssl/HostnameVerifier;)V

    .line 301
    return-void
.end method

.method private openHttpConnection(Ljava/net/URL;)Ljava/net/HttpURLConnection;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 286
    invoke-virtual {p1}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ljava/net/HttpURLConnection;

    .line 287
    return-object v1
.end method

.method private openHttpsConnection(Ljava/net/URL;)Ljavax/net/ssl/HttpsURLConnection;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Ljava/security/NoSuchAlgorithmException;,
            Ljava/security/KeyManagementException;
        }
    .end annotation

    .line 270
    invoke-virtual {p1}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ljavax/net/ssl/HttpsURLConnection;

    .line 271
    invoke-direct {p0, v1}, Lcom/huawei/nfc/carrera/server/card/impl/HttpConnTask;->initHttpsConnection(Ljavax/net/ssl/HttpsURLConnection;)V

    .line 273
    return-object v1
.end method


# virtual methods
.method protected abstract prepareRequestStr(Ljava/lang/Object;)Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TRequestParams;)Ljava/lang/String;"
        }
    .end annotation
.end method

.method public processTask(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TRequestParams;)TResult;"
        }
    .end annotation

    .line 131
    const/4 v4, 0x0

    .line 133
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/nfc/carrera/server/card/impl/HttpConnTask;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lo/ecz;->a(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 134
    const-string v0, "processTask, no network."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 135
    move-object/from16 v0, p0

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/server/card/impl/HttpConnTask;->readErrorResponse(I)Ljava/lang/Object;

    move-result-object v4

    .line 136
    return-object v4

    .line 140
    :cond_0
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/server/card/impl/HttpConnTask;->prepareRequestStr(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    .line 141
    const/4 v0, 0x0

    if-ne v0, v5, :cond_1

    .line 142
    const-string v0, "processTask, invalid request params."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 143
    move-object/from16 v0, p0

    const/4 v1, -0x3

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/server/card/impl/HttpConnTask;->readErrorResponse(I)Ljava/lang/Object;

    move-result-object v4

    .line 144
    return-object v4

    .line 146
    :cond_1
    const-string v0, "HttpConnTask"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "processTask,requestStr."

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 148
    const/4 v6, 0x0

    .line 149
    const/4 v7, 0x0

    .line 150
    const/4 v8, 0x0

    .line 151
    const/4 v9, 0x0

    .line 154
    :try_start_0
    new-instance v10, Ljava/net/URL;

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/nfc/carrera/server/card/impl/HttpConnTask;->mUrl:Ljava/lang/String;

    invoke-direct {v10, v0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 155
    const-string v0, "HttpConnTask"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "processTask, check url."

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 156
    const-string v0, "https"

    invoke-virtual {v10}, Ljava/net/URL;->getProtocol()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 157
    move-object/from16 v0, p0

    invoke-direct {v0, v10}, Lcom/huawei/nfc/carrera/server/card/impl/HttpConnTask;->openHttpsConnection(Ljava/net/URL;)Ljavax/net/ssl/HttpsURLConnection;

    move-result-object v0

    move-object v6, v0

    goto :goto_0

    .line 159
    :cond_2
    move-object/from16 v0, p0

    invoke-direct {v0, v10}, Lcom/huawei/nfc/carrera/server/card/impl/HttpConnTask;->openHttpConnection(Ljava/net/URL;)Ljava/net/HttpURLConnection;

    move-result-object v0

    move-object v6, v0

    .line 162
    :goto_0
    move-object/from16 v0, p0

    iget v0, v0, Lcom/huawei/nfc/carrera/server/card/impl/HttpConnTask;->mConnTimeout:I

    invoke-virtual {v6, v0}, Ljava/net/HttpURLConnection;->setConnectTimeout(I)V

    .line 163
    move-object/from16 v0, p0

    iget v0, v0, Lcom/huawei/nfc/carrera/server/card/impl/HttpConnTask;->mSocketTimeout:I

    invoke-virtual {v6, v0}, Ljava/net/HttpURLConnection;->setReadTimeout(I)V

    .line 164
    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Ljava/net/HttpURLConnection;->setDoInput(Z)V

    .line 165
    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Ljava/net/HttpURLConnection;->setDoOutput(Z)V

    .line 166
    const/4 v0, 0x0

    invoke-virtual {v6, v0}, Ljava/net/HttpURLConnection;->setUseCaches(Z)V

    .line 167
    const-string v0, "POST"

    invoke-virtual {v6, v0}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    .line 168
    const-string v0, "Content-Type"

    const-string v1, "xml/json"

    invoke-virtual {v6, v0, v1}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 169
    const-string v0, "Charset"

    const-string v1, "UTF-8"

    invoke-virtual {v6, v0, v1}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 170
    invoke-virtual {v6}, Ljava/net/HttpURLConnection;->connect()V

    .line 172
    new-instance v0, Ljava/io/DataOutputStream;

    invoke-virtual {v6}, Ljava/net/HttpURLConnection;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V

    move-object v7, v0

    .line 174
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "processTask request string : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;Z)V

    .line 175
    const-string v0, "UTF-8"

    invoke-virtual {v5, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v7, v0}, Ljava/io/DataOutputStream;->write([B)V

    .line 176
    invoke-virtual {v7}, Ljava/io/DataOutputStream;->flush()V

    .line 178
    invoke-virtual {v6}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v11

    .line 179
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "processTask connection result code : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;Z)V

    .line 180
    const/16 v0, 0xc8

    if-ne v0, v11, :cond_4

    .line 181
    invoke-virtual {v6}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v0

    move-object v8, v0

    .line 183
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    move-object v9, v0

    .line 184
    const/16 v0, 0x400

    new-array v12, v0, [B

    .line 185
    const/4 v13, 0x0

    .line 186
    :goto_1
    invoke-virtual {v8, v12}, Ljava/io/InputStream;->read([B)I

    move-result v0

    move v13, v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_3

    .line 187
    const/4 v0, 0x0

    invoke-virtual {v9, v12, v0, v13}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    goto :goto_1

    .line 189
    :cond_3
    invoke-virtual {v9}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v14

    .line 190
    new-instance v0, Ljava/lang/String;

    move-object v1, v14

    const-string v2, "UTF-8"

    invoke-direct {v0, v1, v2}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    move-object v15, v0

    .line 191
    move-object/from16 v0, p0

    invoke-virtual {v0, v15}, Lcom/huawei/nfc/carrera/server/card/impl/HttpConnTask;->readSuccessResponse(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    .line 193
    const-string v0, "HttpConnTask"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "HttpStatus.SC_OK.json="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 194
    goto :goto_2

    :cond_4
    const/16 v0, 0x1f7

    if-ne v0, v11, :cond_5

    .line 197
    move-object/from16 v0, p0

    const/4 v1, -0x4

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/server/card/impl/HttpConnTask;->readErrorResponse(I)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    goto :goto_2

    .line 199
    :cond_5
    move-object/from16 v0, p0

    const/4 v1, -0x2

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/server/card/impl/HttpConnTask;->readErrorResponse(I)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/security/KeyManagementException; {:try_start_0 .. :try_end_0} :catch_3
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    move-object v4, v0

    .line 214
    :goto_2
    move-object/from16 v0, p0

    invoke-direct {v0, v7, v8, v9, v6}, Lcom/huawei/nfc/carrera/server/card/impl/HttpConnTask;->closeStream(Ljava/io/DataOutputStream;Ljava/io/InputStream;Ljava/io/ByteArrayOutputStream;Ljava/net/HttpURLConnection;)V

    .line 215
    goto/16 :goto_3

    .line 202
    :catch_0
    move-exception v10

    .line 203
    const-string v0, "HttpConnTask"

    const/4 v1, 0x1

    :try_start_1
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "MalformedURLException."

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v10}, Ljava/net/MalformedURLException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 204
    move-object/from16 v0, p0

    const/4 v1, -0x3

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/server/card/impl/HttpConnTask;->readErrorResponse(I)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-object v4

    .line 214
    move-object/from16 v0, p0

    invoke-direct {v0, v7, v8, v9, v6}, Lcom/huawei/nfc/carrera/server/card/impl/HttpConnTask;->closeStream(Ljava/io/DataOutputStream;Ljava/io/InputStream;Ljava/io/ByteArrayOutputStream;Ljava/net/HttpURLConnection;)V

    .line 215
    goto/16 :goto_3

    .line 205
    :catch_1
    move-exception v10

    .line 206
    const-string v0, "HttpConnTask"

    const/4 v1, 0x1

    :try_start_2
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "IOException."

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v10}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 207
    move-object/from16 v0, p0

    const/4 v1, -0x2

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/server/card/impl/HttpConnTask;->readErrorResponse(I)Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move-result-object v4

    .line 214
    move-object/from16 v0, p0

    invoke-direct {v0, v7, v8, v9, v6}, Lcom/huawei/nfc/carrera/server/card/impl/HttpConnTask;->closeStream(Ljava/io/DataOutputStream;Ljava/io/InputStream;Ljava/io/ByteArrayOutputStream;Ljava/net/HttpURLConnection;)V

    .line 215
    goto :goto_3

    .line 208
    :catch_2
    move-exception v10

    .line 209
    const-string v0, "HttpConnTask"

    const/4 v1, 0x1

    :try_start_3
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "NoSuchAlgorithmException."

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v10}, Ljava/security/NoSuchAlgorithmException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 214
    move-object/from16 v0, p0

    invoke-direct {v0, v7, v8, v9, v6}, Lcom/huawei/nfc/carrera/server/card/impl/HttpConnTask;->closeStream(Ljava/io/DataOutputStream;Ljava/io/InputStream;Ljava/io/ByteArrayOutputStream;Ljava/net/HttpURLConnection;)V

    .line 215
    goto :goto_3

    .line 210
    :catch_3
    move-exception v10

    .line 211
    const-string v0, "HttpConnTask"

    const/4 v1, 0x1

    :try_start_4
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "KeyManagementException."

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v10}, Ljava/security/KeyManagementException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 214
    move-object/from16 v0, p0

    invoke-direct {v0, v7, v8, v9, v6}, Lcom/huawei/nfc/carrera/server/card/impl/HttpConnTask;->closeStream(Ljava/io/DataOutputStream;Ljava/io/InputStream;Ljava/io/ByteArrayOutputStream;Ljava/net/HttpURLConnection;)V

    .line 215
    goto :goto_3

    .line 214
    :catchall_0
    move-exception v16

    move-object/from16 v0, p0

    invoke-direct {v0, v7, v8, v9, v6}, Lcom/huawei/nfc/carrera/server/card/impl/HttpConnTask;->closeStream(Ljava/io/DataOutputStream;Ljava/io/InputStream;Ljava/io/ByteArrayOutputStream;Ljava/net/HttpURLConnection;)V

    .line 215
    throw v16

    .line 217
    :goto_3
    return-object v4
.end method

.method protected abstract readErrorResponse(I)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TResult;"
        }
    .end annotation
.end method

.method protected abstract readSuccessResponse(Ljava/lang/String;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;)TResult;"
        }
    .end annotation
.end method
