.class public Lo/dse;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Lo/dse;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b()Lo/dse;
    .locals 2

    .line 55
    sget-object v0, Lo/dse;->a:Lo/dse;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 56
    new-instance v0, Lo/dse;

    invoke-direct {v0}, Lo/dse;-><init>()V

    sput-object v0, Lo/dse;->a:Lo/dse;

    .line 58
    :cond_0
    sget-object v0, Lo/dse;->a:Lo/dse;

    return-object v0
.end method

.method private static b(Ljava/io/Closeable;)V
    .locals 3

    .line 204
    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    .line 205
    :try_start_0
    invoke-interface {p0}, Ljava/io/Closeable;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 209
    :cond_0
    goto :goto_0

    .line 207
    :catch_0
    move-exception v2

    .line 208
    const-string v0, "HttpConnectionUtils"

    const-string v1, "closeStream->close error"

    invoke-static {v0, v1}, Lo/dsc;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 210
    :goto_0
    return-void
.end method

.method private c(Landroid/content/Context;Ljavax/net/ssl/HttpsURLConnection;)V
    .locals 11

    .line 136
    const/4 v4, 0x0

    .line 137
    const-string v0, "X.509"

    :try_start_0
    invoke-static {v0}, Ljava/security/cert/CertificateFactory;->getInstance(Ljava/lang/String;)Ljava/security/cert/CertificateFactory;

    move-result-object v4

    .line 138
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/multisimsdk/multidevicemanager/R$raw;->hpe_cert:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;
    :try_end_0
    .catch Ljava/security/cert/CertificateException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/security/KeyStoreException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/security/KeyManagementException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_4

    move-result-object v5

    .line 140
    :try_start_1
    invoke-virtual {v4, v5}, Ljava/security/cert/CertificateFactory;->generateCertificate(Ljava/io/InputStream;)Ljava/security/cert/Certificate;

    move-result-object v3

    .line 141
    sget-object v0, Lo/dsc;->a:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 142
    const-string v0, "HttpConnectionUtils"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "ca="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    move-object v2, v3

    check-cast v2, Ljava/security/cert/X509Certificate;

    invoke-virtual {v2}, Ljava/security/cert/X509Certificate;->getSubjectDN()Ljava/security/Principal;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dsc;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 143
    const-string v0, "HttpConnectionUtils"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "castr="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    move-object v2, v3

    check-cast v2, Ljava/security/cert/X509Certificate;

    invoke-virtual {v2}, Ljava/security/cert/X509Certificate;->getSubjectDN()Ljava/security/Principal;

    move-result-object v2

    invoke-interface {v2}, Ljava/security/Principal;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dsc;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 146
    :cond_0
    :try_start_2
    invoke-virtual {v5}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catch Ljava/security/cert/CertificateException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/security/KeyStoreException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/security/KeyManagementException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_4

    .line 147
    goto :goto_0

    .line 146
    :catchall_0
    move-exception v6

    :try_start_3
    invoke-virtual {v5}, Ljava/io/InputStream;->close()V

    throw v6

    .line 149
    :goto_0
    invoke-static {}, Ljava/security/KeyStore;->getDefaultType()Ljava/lang/String;

    move-result-object v6

    .line 150
    invoke-static {v6}, Ljava/security/KeyStore;->getInstance(Ljava/lang/String;)Ljava/security/KeyStore;

    move-result-object v7

    .line 151
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-virtual {v7, v0, v1}, Ljava/security/KeyStore;->load(Ljava/io/InputStream;[C)V

    .line 152
    const-string v0, "ca"

    invoke-virtual {v7, v0, v3}, Ljava/security/KeyStore;->setCertificateEntry(Ljava/lang/String;Ljava/security/cert/Certificate;)V

    .line 154
    invoke-static {}, Ljavax/net/ssl/TrustManagerFactory;->getDefaultAlgorithm()Ljava/lang/String;

    move-result-object v8

    .line 155
    invoke-static {v8}, Ljavax/net/ssl/TrustManagerFactory;->getInstance(Ljava/lang/String;)Ljavax/net/ssl/TrustManagerFactory;

    move-result-object v9

    .line 156
    invoke-virtual {v9, v7}, Ljavax/net/ssl/TrustManagerFactory;->init(Ljava/security/KeyStore;)V

    .line 158
    const-string v0, "TLS"

    invoke-static {v0}, Ljavax/net/ssl/SSLContext;->getInstance(Ljava/lang/String;)Ljavax/net/ssl/SSLContext;

    move-result-object v10

    .line 159
    invoke-virtual {v9}, Ljavax/net/ssl/TrustManagerFactory;->getTrustManagers()[Ljavax/net/ssl/TrustManager;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v10, v1, v0, v2}, Ljavax/net/ssl/SSLContext;->init([Ljavax/net/ssl/KeyManager;[Ljavax/net/ssl/TrustManager;Ljava/security/SecureRandom;)V

    .line 160
    new-instance v0, Lo/dsj;

    invoke-virtual {v10}, Ljavax/net/ssl/SSLContext;->getSocketFactory()Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/dsj;-><init>(Ljavax/net/ssl/SSLSocketFactory;)V

    invoke-virtual {p2, v0}, Ljavax/net/ssl/HttpsURLConnection;->setSSLSocketFactory(Ljavax/net/ssl/SSLSocketFactory;)V
    :try_end_3
    .catch Ljava/security/cert/CertificateException; {:try_start_3 .. :try_end_3} :catch_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/security/KeyStoreException; {:try_start_3 .. :try_end_3} :catch_2
    .catch Ljava/security/KeyManagementException; {:try_start_3 .. :try_end_3} :catch_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_4

    .line 171
    goto :goto_1

    .line 161
    :catch_0
    move-exception v3

    .line 162
    const-string v0, "HttpConnectionUtils"

    const-string v1, "doPostRequest->CertificateException"

    invoke-static {v0, v1}, Lo/dsc;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 171
    goto :goto_1

    .line 163
    :catch_1
    move-exception v3

    .line 164
    const-string v0, "HttpConnectionUtils"

    const-string v1, "doPostRequest->NoSuchAlgorithmException"

    invoke-static {v0, v1}, Lo/dsc;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 171
    goto :goto_1

    .line 165
    :catch_2
    move-exception v3

    .line 166
    const-string v0, "HttpConnectionUtils"

    const-string v1, "doPostRequest->KeyStoreException"

    invoke-static {v0, v1}, Lo/dsc;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 171
    goto :goto_1

    .line 167
    :catch_3
    move-exception v3

    .line 168
    const-string v0, "HttpConnectionUtils"

    const-string v1, "doPostRequest->KeyManagementException"

    invoke-static {v0, v1}, Lo/dsc;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 171
    goto :goto_1

    .line 169
    :catch_4
    move-exception v3

    .line 170
    const-string v0, "HttpConnectionUtils"

    const-string v1, "doPostRequest->IOException"

    invoke-static {v0, v1}, Lo/dsc;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 172
    :goto_1
    new-instance v0, Lo/dse$4;

    invoke-direct {v0, p0}, Lo/dse$4;-><init>(Lo/dse;)V

    invoke-virtual {p2, v0}, Ljavax/net/ssl/HttpsURLConnection;->setHostnameVerifier(Ljavax/net/ssl/HostnameVerifier;)V

    .line 183
    return-void
.end method

.method private static d(Ljava/net/HttpURLConnection;)Ljava/lang/String;
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 186
    const/4 v2, 0x0

    .line 187
    new-instance v3, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v3}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 189
    :try_start_0
    invoke-virtual {p0}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v0

    move-object v2, v0

    .line 190
    const/16 v0, 0x400

    new-array v4, v0, [B

    .line 191
    const/4 v5, 0x0

    .line 192
    :goto_0
    invoke-virtual {v2, v4}, Ljava/io/InputStream;->read([B)I

    move-result v0

    move v5, v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 193
    const/4 v0, 0x0

    invoke-virtual {v3, v4, v0, v5}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    goto :goto_0

    .line 195
    :cond_0
    const-string v0, "utf-8"

    invoke-virtual {v3, v0}, Ljava/io/ByteArrayOutputStream;->toString(Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v6

    .line 197
    invoke-static {v2}, Lo/dse;->b(Ljava/io/Closeable;)V

    .line 198
    invoke-static {v3}, Lo/dse;->b(Ljava/io/Closeable;)V

    return-object v6

    .line 197
    :catchall_0
    move-exception v7

    invoke-static {v2}, Lo/dse;->b(Ljava/io/Closeable;)V

    .line 198
    invoke-static {v3}, Lo/dse;->b(Ljava/io/Closeable;)V

    throw v7
.end method


# virtual methods
.method public e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 14
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/KeyManagementException;,
            Ljava/security/NoSuchAlgorithmException;
        }
    .end annotation

    .line 69
    const/4 v4, 0x0

    .line 70
    const/4 v5, 0x0

    .line 71
    const/4 v6, 0x0

    .line 72
    const/4 v7, 0x0

    .line 74
    :try_start_0
    new-instance v8, Ljava/net/URL;

    invoke-direct {v8, p1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 76
    sget-object v0, Lo/dsc;->a:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 77
    const-string v0, "HttpConnectionUtils"

    const-string v1, "doPostRequest->url=%s, urlParameters=%s"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v8, v2, v3

    const/4 v3, 0x1

    aput-object p2, v2, v3

    invoke-static {v0, v1, v2}, Lo/dsc;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I

    .line 79
    :cond_0
    invoke-virtual {v8}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Ljavax/net/ssl/HttpsURLConnection;

    .line 80
    invoke-static {}, Lo/drs;->b()Lo/drs;

    move-result-object v0

    invoke-virtual {v0}, Lo/drs;->e()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p0, v0, v9}, Lo/dse;->c(Landroid/content/Context;Ljavax/net/ssl/HttpsURLConnection;)V

    .line 81
    const/16 v0, 0x7530

    invoke-virtual {v9, v0}, Ljavax/net/ssl/HttpsURLConnection;->setConnectTimeout(I)V

    .line 82
    const/16 v0, 0x7530

    invoke-virtual {v9, v0}, Ljavax/net/ssl/HttpsURLConnection;->setReadTimeout(I)V

    .line 83
    const-string v0, "POST"

    invoke-virtual {v9, v0}, Ljavax/net/ssl/HttpsURLConnection;->setRequestMethod(Ljava/lang/String;)V

    .line 84
    const-string v0, "Connection"

    const-string v1, "Keep-Alive"

    invoke-virtual {v9, v0, v1}, Ljavax/net/ssl/HttpsURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 85
    const-string v0, "Content-Length"

    const-string v1, "utf-8"

    move-object/from16 v2, p2

    invoke-virtual {v2, v1}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v1

    array-length v1, v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v9, v0, v1}, Ljavax/net/ssl/HttpsURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 86
    const-string v0, "Content-Type"

    const-string v1, "application/json; charset=utf-8"

    invoke-virtual {v9, v0, v1}, Ljavax/net/ssl/HttpsURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 87
    const-string v0, "ES-Version"

    const-string v1, "1.0.7"

    invoke-virtual {v9, v0, v1}, Ljavax/net/ssl/HttpsURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 88
    const-string v0, "User-Agent"

    const-string v1, "3gpp-gba"

    invoke-virtual {v9, v0, v1}, Ljavax/net/ssl/HttpsURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 89
    const-string v0, "X-3GPP-Intended-IDENTITY"

    move-object/from16 v1, p5

    invoke-virtual {v9, v0, v1}, Ljavax/net/ssl/HttpsURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 90
    invoke-static/range {p4 .. p4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 91
    const-string v0, "Authorization"

    move-object/from16 v1, p4

    invoke-virtual {v9, v0, v1}, Ljavax/net/ssl/HttpsURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 93
    :cond_1
    const/4 v0, 0x0

    move-object/from16 v1, p3

    if-eq v0, v1, :cond_2

    .line 94
    const-string v0, "HttpConnectionUtils"

    const-string v1, "cookie is not null"

    invoke-static {v0, v1}, Lo/dsc;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 95
    const-string v0, "Cookie"

    move-object/from16 v1, p3

    invoke-virtual {v9, v0, v1}, Ljavax/net/ssl/HttpsURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 97
    :cond_2
    invoke-static {}, Lo/dru;->b()Ljava/util/HashMap;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 98
    invoke-static {}, Lo/dru;->b()Ljava/util/HashMap;

    move-result-object v0

    const-string v1, "appid"

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/lang/String;

    .line 99
    invoke-static {}, Lo/dru;->b()Ljava/util/HashMap;

    move-result-object v0

    const-string v1, "appkey"

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ljava/lang/String;

    .line 100
    const-string v0, "ES-APP-ID"

    invoke-virtual {v9, v0, v6}, Ljavax/net/ssl/HttpsURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 101
    const-string v0, "ES-APP-Key"

    invoke-virtual {v9, v0, v7}, Ljavax/net/ssl/HttpsURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 103
    :cond_3
    const-string v0, "ES-APP-ID"

    const-string v1, "00104605"

    invoke-virtual {v9, v0, v1}, Ljavax/net/ssl/HttpsURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 104
    const-string v0, "ES-APP-Key"

    const-string v1, "0C22D5E56878F9D3"

    invoke-virtual {v9, v0, v1}, Ljavax/net/ssl/HttpsURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 105
    invoke-virtual {v9}, Ljavax/net/ssl/HttpsURLConnection;->connect()V

    .line 106
    invoke-virtual {v9}, Ljavax/net/ssl/HttpsURLConnection;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v0

    move-object v4, v0

    .line 107
    const-string v0, "utf-8"

    move-object/from16 v1, p2

    invoke-virtual {v1, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/io/OutputStream;->write([B)V

    .line 108
    invoke-virtual {v4}, Ljava/io/OutputStream;->flush()V

    .line 109
    invoke-virtual {v9}, Ljavax/net/ssl/HttpsURLConnection;->getResponseCode()I

    move-result v10

    .line 110
    const/16 v0, 0xc8

    if-eq v0, v10, :cond_4

    .line 111
    const-string v0, "HttpConnectionUtils"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "doPostRequest->error responseCode= "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dsc;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 112
    invoke-static {v10}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v11

    .line 128
    invoke-static {v4}, Lo/dse;->b(Ljava/io/Closeable;)V

    return-object v11

    .line 114
    :cond_4
    :try_start_1
    invoke-static {v9}, Lo/dse;->d(Ljava/net/HttpURLConnection;)Ljava/lang/String;

    move-result-object v11

    .line 115
    sget-object v0, Lo/dsc;->a:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 116
    const-string v0, "HttpConnectionUtils"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "response: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dsc;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 118
    :cond_5
    move-object/from16 v0, p2

    invoke-static {v9, v0}, Lo/dsh;->a(Ljava/net/HttpURLConnection;Ljava/lang/String;)V

    .line 119
    invoke-virtual {v9}, Ljavax/net/ssl/HttpsURLConnection;->disconnect()V

    .line 120
    const-string v0, "HttpConnectionUtils"

    const-string v1, "doPostRequest->success."

    invoke-static {v0, v1}, Lo/dsc;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 121
    move-object v12, v11

    .line 128
    invoke-static {v4}, Lo/dse;->b(Ljava/io/Closeable;)V

    return-object v12

    .line 122
    :catch_0
    move-exception v8

    .line 123
    const-string v0, "HttpConnectionUtils"

    const-string v1, "doPostRequest->IOException"

    :try_start_2
    invoke-static {v0, v1}, Lo/dsc;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 124
    const/16 v0, 0x62

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move-result-object v9

    .line 128
    invoke-static {v4}, Lo/dse;->b(Ljava/io/Closeable;)V

    return-object v9

    .line 125
    :catch_1
    move-exception v8

    .line 126
    const-string v0, "HttpConnectionUtils"

    const-string v1, "doPostRequest->RuntimeException"

    :try_start_3
    invoke-static {v0, v1}, Lo/dsc;->a(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 128
    invoke-static {v4}, Lo/dse;->b(Ljava/io/Closeable;)V

    .line 129
    goto :goto_0

    .line 128
    :catchall_0
    move-exception v13

    invoke-static {v4}, Lo/dse;->b(Ljava/io/Closeable;)V

    throw v13

    .line 130
    :goto_0
    const/16 v0, 0x63

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
