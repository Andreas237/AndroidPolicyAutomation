.class public Lcom/huawei/qrcode/server/query/HttpConnTask;
.super Ljava/lang/Object;


# static fields
.field private static final DEFAULT_TIMEOUT:I = 0x7530

.field private static final HTTP_METHOD:Ljava/lang/String; = "GET"

.field private static final HTTP_PROTOCOL:Ljava/lang/String; = "https"

.field private static final HTTP_REQUEST_SUCCESS:I = 0xc8


# instance fields
.field private mConnTimeout:I

.field protected mContext:Landroid/content/Context;

.field private mSocketTimeout:I

.field private mUrl:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x7530

    iput v0, p0, Lcom/huawei/qrcode/server/query/HttpConnTask;->mConnTimeout:I

    const/16 v0, 0x7530

    iput v0, p0, Lcom/huawei/qrcode/server/query/HttpConnTask;->mSocketTimeout:I

    iput-object p1, p0, Lcom/huawei/qrcode/server/query/HttpConnTask;->mContext:Landroid/content/Context;

    iput-object p2, p0, Lcom/huawei/qrcode/server/query/HttpConnTask;->mUrl:Ljava/lang/String;

    return-void
.end method

.method private closeStream(Ljava/io/DataOutputStream;Ljava/io/InputStream;Ljava/io/ByteArrayOutputStream;Ljava/net/HttpURLConnection;)V
    .locals 3

    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    :try_start_0
    invoke-virtual {p1}, Ljava/io/DataOutputStream;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v2

    const-string v0, "closeStream outStream IOException: "

    const/4 v1, 0x0

    invoke-static {v0, v2, v1}, Lcom/huawei/qrcode/util/LogX;->e(Ljava/lang/String;Ljava/lang/Throwable;Z)V

    :cond_0
    :goto_0
    const/4 v0, 0x0

    if-eq v0, p2, :cond_1

    :try_start_1
    invoke-virtual {p2}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    move-exception v2

    const-string v0, "closeStream is IOException: "

    const/4 v1, 0x0

    invoke-static {v0, v2, v1}, Lcom/huawei/qrcode/util/LogX;->e(Ljava/lang/String;Ljava/lang/Throwable;Z)V

    :cond_1
    :goto_1
    const/4 v0, 0x0

    if-eq v0, p3, :cond_2

    :try_start_2
    invoke-virtual {p3}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_2

    :catch_2
    move-exception v2

    const-string v0, "closeStream outputStream3 IOException: "

    const/4 v1, 0x0

    invoke-static {v0, v2, v1}, Lcom/huawei/qrcode/util/LogX;->e(Ljava/lang/String;Ljava/lang/Throwable;Z)V

    :cond_2
    :goto_2
    const/4 v0, 0x0

    if-eq v0, p4, :cond_3

    invoke-virtual {p4}, Ljava/net/HttpURLConnection;->disconnect()V

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

    new-instance v0, Lcom/huawei/qrcode/server/query/ScanCodeSSLSocketFactory;

    new-instance v1, Lcom/huawei/qrcode/server/query/ScanCodeX509TrustManager;

    iget-object v2, p0, Lcom/huawei/qrcode/server/query/HttpConnTask;->mContext:Landroid/content/Context;

    invoke-direct {v1, v2}, Lcom/huawei/qrcode/server/query/ScanCodeX509TrustManager;-><init>(Landroid/content/Context;)V

    invoke-direct {v0, v1}, Lcom/huawei/qrcode/server/query/ScanCodeSSLSocketFactory;-><init>(Ljavax/net/ssl/X509TrustManager;)V

    invoke-virtual {p1, v0}, Ljavax/net/ssl/HttpsURLConnection;->setSSLSocketFactory(Ljavax/net/ssl/SSLSocketFactory;)V

    sget-object v0, Lorg/apache/http/conn/ssl/SSLSocketFactory;->STRICT_HOSTNAME_VERIFIER:Lorg/apache/http/conn/ssl/X509HostnameVerifier;

    invoke-virtual {p1, v0}, Ljavax/net/ssl/HttpsURLConnection;->setHostnameVerifier(Ljavax/net/ssl/HostnameVerifier;)V

    return-void
.end method

.method private openHttpConnection(Ljava/net/URL;)Ljava/net/HttpURLConnection;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-virtual {p1}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ljava/net/HttpURLConnection;

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

    invoke-virtual {p1}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ljavax/net/ssl/HttpsURLConnection;

    invoke-direct {p0, v1}, Lcom/huawei/qrcode/server/query/HttpConnTask;->initHttpsConnection(Ljavax/net/ssl/HttpsURLConnection;)V

    return-object v1
.end method


# virtual methods
.method public processTask()Lcom/huawei/qrcode/server/query/ReturnInfo;
    .locals 14

    new-instance v2, Lcom/huawei/qrcode/server/query/ReturnInfo;

    invoke-direct {v2}, Lcom/huawei/qrcode/server/query/ReturnInfo;-><init>()V

    iget-object v0, p0, Lcom/huawei/qrcode/server/query/HttpConnTask;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/qrcode/util/Util;->isNetworkAvailable(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, -0x1

    invoke-virtual {v2, v0}, Lcom/huawei/qrcode/server/query/ReturnInfo;->setCode(I)V

    return-object v2

    :cond_0
    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    :try_start_0
    new-instance v7, Ljava/net/URL;

    iget-object v0, p0, Lcom/huawei/qrcode/server/query/HttpConnTask;->mUrl:Ljava/lang/String;

    invoke-direct {v7, v0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    const-string v0, "https"

    invoke-virtual {v7}, Ljava/net/URL;->getProtocol()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-direct {p0, v7}, Lcom/huawei/qrcode/server/query/HttpConnTask;->openHttpsConnection(Ljava/net/URL;)Ljavax/net/ssl/HttpsURLConnection;

    move-result-object v0

    move-object v3, v0

    goto :goto_0

    :cond_1
    invoke-direct {p0, v7}, Lcom/huawei/qrcode/server/query/HttpConnTask;->openHttpConnection(Ljava/net/URL;)Ljava/net/HttpURLConnection;

    move-result-object v0

    move-object v3, v0

    :goto_0
    iget v0, p0, Lcom/huawei/qrcode/server/query/HttpConnTask;->mConnTimeout:I

    invoke-virtual {v3, v0}, Ljava/net/HttpURLConnection;->setConnectTimeout(I)V

    iget v0, p0, Lcom/huawei/qrcode/server/query/HttpConnTask;->mSocketTimeout:I

    invoke-virtual {v3, v0}, Ljava/net/HttpURLConnection;->setReadTimeout(I)V

    const-string v0, "GET"

    invoke-virtual {v3, v0}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    invoke-virtual {v3}, Ljava/net/HttpURLConnection;->connect()V

    invoke-virtual {v3}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v8

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "HttpConnTask conn.getResponseCode() ----> "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v3}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->i(Ljava/lang/String;Z)V

    const/16 v0, 0xc8

    if-ne v0, v8, :cond_3

    invoke-virtual {v3}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v0

    move-object v5, v0

    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    move-object v6, v0

    const/16 v0, 0x400

    new-array v9, v0, [B

    const/4 v10, 0x0

    :goto_1
    invoke-virtual {v5, v9}, Ljava/io/InputStream;->read([B)I

    move-result v0

    move v10, v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_2

    const/4 v0, 0x0

    invoke-virtual {v6, v9, v0, v10}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    goto :goto_1

    :cond_2
    invoke-virtual {v6}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v11

    new-instance v12, Ljava/lang/String;

    const-string v0, "UTF-8"

    invoke-direct {v12, v11, v0}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    const/4 v0, 0x4

    invoke-virtual {v2, v0}, Lcom/huawei/qrcode/server/query/ReturnInfo;->setCode(I)V

    invoke-virtual {v2, v12}, Lcom/huawei/qrcode/server/query/ReturnInfo;->setResult(Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "HttpConnTask resp json ---> "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->i(Ljava/lang/String;Z)V

    goto :goto_2

    :cond_3
    const-string v0, "HttpConnTask resp fail."

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->i(Ljava/lang/String;Z)V

    const/4 v0, -0x2

    invoke-virtual {v2, v0}, Lcom/huawei/qrcode/server/query/ReturnInfo;->setCode(I)V
    :try_end_0
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/security/KeyManagementException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_3
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_2
    invoke-direct {p0, v4, v5, v6, v3}, Lcom/huawei/qrcode/server/query/HttpConnTask;->closeStream(Ljava/io/DataOutputStream;Ljava/io/InputStream;Ljava/io/ByteArrayOutputStream;Ljava/net/HttpURLConnection;)V

    goto/16 :goto_3

    :catch_0
    move-exception v7

    const-string v0, "MalformedURLException: "

    const/4 v1, 0x0

    :try_start_1
    invoke-static {v0, v7, v1}, Lcom/huawei/qrcode/util/LogX;->e(Ljava/lang/String;Ljava/lang/Throwable;Z)V

    const/4 v0, -0x3

    invoke-virtual {v2, v0}, Lcom/huawei/qrcode/server/query/ReturnInfo;->setCode(I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-direct {p0, v4, v5, v6, v3}, Lcom/huawei/qrcode/server/query/HttpConnTask;->closeStream(Ljava/io/DataOutputStream;Ljava/io/InputStream;Ljava/io/ByteArrayOutputStream;Ljava/net/HttpURLConnection;)V

    goto :goto_3

    :catch_1
    move-exception v7

    const-string v0, "NoSuchAlgorithmException: "

    const/4 v1, 0x0

    :try_start_2
    invoke-static {v0, v7, v1}, Lcom/huawei/qrcode/util/LogX;->e(Ljava/lang/String;Ljava/lang/Throwable;Z)V

    const/4 v0, -0x2

    invoke-virtual {v2, v0}, Lcom/huawei/qrcode/server/query/ReturnInfo;->setCode(I)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    invoke-direct {p0, v4, v5, v6, v3}, Lcom/huawei/qrcode/server/query/HttpConnTask;->closeStream(Ljava/io/DataOutputStream;Ljava/io/InputStream;Ljava/io/ByteArrayOutputStream;Ljava/net/HttpURLConnection;)V

    goto :goto_3

    :catch_2
    move-exception v7

    const-string v0, "KeyManagementException: "

    const/4 v1, 0x0

    :try_start_3
    invoke-static {v0, v7, v1}, Lcom/huawei/qrcode/util/LogX;->e(Ljava/lang/String;Ljava/lang/Throwable;Z)V

    const/4 v0, -0x2

    invoke-virtual {v2, v0}, Lcom/huawei/qrcode/server/query/ReturnInfo;->setCode(I)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    invoke-direct {p0, v4, v5, v6, v3}, Lcom/huawei/qrcode/server/query/HttpConnTask;->closeStream(Ljava/io/DataOutputStream;Ljava/io/InputStream;Ljava/io/ByteArrayOutputStream;Ljava/net/HttpURLConnection;)V

    goto :goto_3

    :catch_3
    move-exception v7

    const-string v0, "IOException: "

    const/4 v1, 0x0

    :try_start_4
    invoke-static {v0, v7, v1}, Lcom/huawei/qrcode/util/LogX;->e(Ljava/lang/String;Ljava/lang/Throwable;Z)V

    const/4 v0, -0x2

    invoke-virtual {v2, v0}, Lcom/huawei/qrcode/server/query/ReturnInfo;->setCode(I)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    invoke-direct {p0, v4, v5, v6, v3}, Lcom/huawei/qrcode/server/query/HttpConnTask;->closeStream(Ljava/io/DataOutputStream;Ljava/io/InputStream;Ljava/io/ByteArrayOutputStream;Ljava/net/HttpURLConnection;)V

    goto :goto_3

    :catchall_0
    move-exception v13

    invoke-direct {p0, v4, v5, v6, v3}, Lcom/huawei/qrcode/server/query/HttpConnTask;->closeStream(Ljava/io/DataOutputStream;Ljava/io/InputStream;Ljava/io/ByteArrayOutputStream;Ljava/net/HttpURLConnection;)V

    throw v13

    :goto_3
    return-object v2
.end method
