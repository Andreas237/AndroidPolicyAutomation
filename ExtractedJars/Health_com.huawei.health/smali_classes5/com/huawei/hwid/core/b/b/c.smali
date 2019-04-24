.class Lcom/huawei/hwid/core/b/b/c;
.super Lorg/apache/http/conn/ssl/SSLSocketFactory;
.source "SourceFile"


# static fields
.field private static d:Ljava/lang/Object;


# instance fields
.field a:Ljavax/net/ssl/SSLContext;

.field b:Landroid/content/Context;

.field c:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 171
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/huawei/hwid/core/b/b/c;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/security/KeyStore;Landroid/content/Context;Z)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/KeyManagementException;,
            Ljava/security/NoSuchAlgorithmException;,
            Ljava/security/KeyStoreException;,
            Ljava/security/UnrecoverableKeyException;
        }
    .end annotation

    .line 180
    invoke-direct {p0, p1}, Lorg/apache/http/conn/ssl/SSLSocketFactory;-><init>(Ljava/security/KeyStore;)V

    .line 168
    const-string v0, "TLS"

    invoke-static {v0}, Ljavax/net/ssl/SSLContext;->getInstance(Ljava/lang/String;)Ljavax/net/ssl/SSLContext;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hwid/core/b/b/c;->a:Ljavax/net/ssl/SSLContext;

    .line 181
    iput-object p2, p0, Lcom/huawei/hwid/core/b/b/c;->b:Landroid/content/Context;

    .line 182
    iput-boolean p3, p0, Lcom/huawei/hwid/core/b/b/c;->c:Z

    .line 183
    const/4 v4, 0x0

    .line 185
    :try_start_0
    new-instance v0, Lcom/huawei/hwid/core/b/b/a;

    iget-object v1, p0, Lcom/huawei/hwid/core/b/b/c;->b:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/huawei/hwid/core/b/b/a;-><init>(Landroid/content/Context;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-object v4, v0

    .line 189
    goto :goto_0

    .line 187
    :catch_0
    move-exception v5

    .line 188
    const-string v0, "MySSLSocketFactory"

    const-string v1, "Initialize AccountX509TrustManager failed."

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 191
    :goto_0
    iget-object v0, p0, Lcom/huawei/hwid/core/b/b/c;->a:Ljavax/net/ssl/SSLContext;

    const/4 v1, 0x1

    new-array v1, v1, [Ljavax/net/ssl/TrustManager;

    const/4 v2, 0x0

    aput-object v4, v1, v2

    new-instance v2, Ljava/security/SecureRandom;

    invoke-direct {v2}, Ljava/security/SecureRandom;-><init>()V

    const/4 v3, 0x0

    invoke-virtual {v0, v3, v1, v2}, Ljavax/net/ssl/SSLContext;->init([Ljavax/net/ssl/KeyManager;[Ljavax/net/ssl/TrustManager;Ljava/security/SecureRandom;)V

    .line 192
    return-void
.end method


# virtual methods
.method public createSocket()Ljava/net/Socket;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 244
    const/4 v1, 0x0

    .line 245
    iget-object v0, p0, Lcom/huawei/hwid/core/b/b/c;->a:Ljavax/net/ssl/SSLContext;

    invoke-virtual {v0}, Ljavax/net/ssl/SSLContext;->getSocketFactory()Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v0

    invoke-virtual {v0}, Ljavax/net/ssl/SSLSocketFactory;->createSocket()Ljava/net/Socket;

    move-result-object v2

    .line 246
    instance-of v0, v2, Ljavax/net/ssl/SSLSocket;

    if-eqz v0, :cond_0

    .line 247
    move-object v1, v2

    check-cast v1, Ljavax/net/ssl/SSLSocket;

    .line 250
    :cond_0
    invoke-static {v1}, Lcom/huawei/hwid/core/b/b/b;->a(Ljavax/net/ssl/SSLSocket;)V

    .line 251
    iget-boolean v0, p0, Lcom/huawei/hwid/core/b/b/c;->c:Z

    if-eqz v0, :cond_1

    .line 252
    invoke-static {v1}, Lcom/huawei/hwid/core/b/b/b;->a(Ljava/net/Socket;)V

    .line 254
    :cond_1
    return-object v1
.end method

.method public createSocket(Ljava/net/Socket;Ljava/lang/String;IZ)Ljava/net/Socket;
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Ljava/net/UnknownHostException;
        }
    .end annotation

    .line 198
    const/4 v2, 0x0

    .line 199
    iget-object v0, p0, Lcom/huawei/hwid/core/b/b/c;->a:Ljavax/net/ssl/SSLContext;

    invoke-virtual {v0}, Ljavax/net/ssl/SSLContext;->getSocketFactory()Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3, p4}, Ljavax/net/ssl/SSLSocketFactory;->createSocket(Ljava/net/Socket;Ljava/lang/String;IZ)Ljava/net/Socket;

    move-result-object v3

    .line 200
    instance-of v0, v3, Ljavax/net/ssl/SSLSocket;

    if-eqz v0, :cond_0

    .line 201
    move-object v2, v3

    check-cast v2, Ljavax/net/ssl/SSLSocket;

    .line 205
    :cond_0
    invoke-static {v2}, Lcom/huawei/hwid/core/b/b/b;->a(Ljavax/net/ssl/SSLSocket;)V

    .line 206
    iget-boolean v0, p0, Lcom/huawei/hwid/core/b/b/c;->c:Z

    if-eqz v0, :cond_1

    .line 207
    invoke-static {v2}, Lcom/huawei/hwid/core/b/b/b;->a(Ljava/net/Socket;)V

    .line 211
    :cond_1
    const-string v0, "hicloud.com"

    invoke-virtual {p2, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 212
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x16

    if-ge v0, v1, :cond_2

    .line 213
    sget-object v4, Lcom/huawei/hwid/core/b/b/c;->d:Ljava/lang/Object;

    monitor-enter v4

    .line 215
    :try_start_0
    invoke-virtual {p0}, Lcom/huawei/hwid/core/b/b/c;->getHostnameVerifier()Lorg/apache/http/conn/ssl/X509HostnameVerifier;

    move-result-object v0

    invoke-interface {v0, p2, v2}, Lorg/apache/http/conn/ssl/X509HostnameVerifier;->verify(Ljava/lang/String;Ljavax/net/ssl/SSLSocket;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 216
    monitor-exit v4

    goto :goto_0

    :catchall_0
    move-exception v5

    monitor-exit v4

    throw v5

    :goto_0
    goto :goto_1

    .line 219
    :cond_2
    invoke-virtual {p0}, Lcom/huawei/hwid/core/b/b/c;->getHostnameVerifier()Lorg/apache/http/conn/ssl/X509HostnameVerifier;

    move-result-object v0

    invoke-interface {v0, p2, v2}, Lorg/apache/http/conn/ssl/X509HostnameVerifier;->verify(Ljava/lang/String;Ljavax/net/ssl/SSLSocket;)V

    .line 223
    :cond_3
    :goto_1
    return-object v2
.end method
