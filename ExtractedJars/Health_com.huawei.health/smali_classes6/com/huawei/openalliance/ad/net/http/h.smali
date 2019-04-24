.class public final Lcom/huawei/openalliance/ad/net/http/h;
.super Ljavax/net/ssl/SSLSocketFactory;


# static fields
.field private static final a:Ljava/lang/String;

.field private static c:Ljavax/net/ssl/SSLSocketFactory;

.field private static final d:[B


# instance fields
.field private final b:Ljavax/net/ssl/SSLContext;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lcom/huawei/openalliance/ad/net/http/h;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/openalliance/ad/net/http/h;->a:Ljava/lang/String;

    const/4 v0, 0x0

    new-array v0, v0, [B

    sput-object v0, Lcom/huawei/openalliance/ad/net/http/h;->d:[B

    return-void
.end method

.method private constructor <init>()V
    .locals 4

    invoke-direct {p0}, Ljavax/net/ssl/SSLSocketFactory;-><init>()V

    const-string v0, "TLS"

    invoke-static {v0}, Ljavax/net/ssl/SSLContext;->getInstance(Ljava/lang/String;)Ljavax/net/ssl/SSLContext;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/net/http/h;->b:Ljavax/net/ssl/SSLContext;

    invoke-static {}, Lcom/huawei/openalliance/ad/net/http/HttpsConfig;->a()[Ljavax/net/ssl/TrustManager;

    move-result-object v3

    array-length v0, v3

    if-nez v0, :cond_0

    const/4 v3, 0x0

    :cond_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/net/http/h;->b:Ljavax/net/ssl/SSLContext;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v3, v2}, Ljavax/net/ssl/SSLContext;->init([Ljavax/net/ssl/KeyManager;[Ljavax/net/ssl/TrustManager;Ljava/security/SecureRandom;)V

    return-void
.end method

.method public static a()Ljavax/net/ssl/SSLSocketFactory;
    .locals 5

    sget-object v2, Lcom/huawei/openalliance/ad/net/http/h;->d:[B

    monitor-enter v2

    :try_start_0
    sget-object v0, Lcom/huawei/openalliance/ad/net/http/h;->c:Ljavax/net/ssl/SSLSocketFactory;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    new-instance v0, Lcom/huawei/openalliance/ad/net/http/h;

    invoke-direct {v0}, Lcom/huawei/openalliance/ad/net/http/h;-><init>()V

    sput-object v0, Lcom/huawei/openalliance/ad/net/http/h;->c:Ljavax/net/ssl/SSLSocketFactory;

    :cond_0
    sget-object v0, Lcom/huawei/openalliance/ad/net/http/h;->c:Ljavax/net/ssl/SSLSocketFactory;
    :try_end_0
    .catch Ljava/security/KeyManagementException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/security/KeyStoreException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_4
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    return-object v0

    :catch_0
    move-exception v3

    :try_start_1
    sget-object v0, Lcom/huawei/openalliance/ad/net/http/h;->a:Ljava/lang/String;

    const-string v1, "Failed to new SSLSocketFactory instance. KeyManagementException"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :catch_1
    move-exception v3

    sget-object v0, Lcom/huawei/openalliance/ad/net/http/h;->a:Ljava/lang/String;

    const-string v1, "Failed to new SSLSocketFactory instance. NoSuchAlgorithmException"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :catch_2
    move-exception v3

    sget-object v0, Lcom/huawei/openalliance/ad/net/http/h;->a:Ljava/lang/String;

    const-string v1, "Failed to new SSLSocketFactory instance. KeyStoreException"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :catch_3
    move-exception v3

    sget-object v0, Lcom/huawei/openalliance/ad/net/http/h;->a:Ljava/lang/String;

    const-string v1, "Failed to new SSLSocketFactory instance. GeneralSecurityException"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :catch_4
    move-exception v3

    sget-object v0, Lcom/huawei/openalliance/ad/net/http/h;->a:Ljava/lang/String;

    const-string v1, "Failed to new SSLSocketFactory instance. IOException"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_0
    monitor-exit v2

    const/4 v0, 0x0

    return-object v0

    :catchall_0
    move-exception v4

    monitor-exit v2

    throw v4
.end method

.method private a(Ljava/net/Socket;)V
    .locals 1

    instance-of v0, p1, Ljavax/net/ssl/SSLSocket;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Ljavax/net/ssl/SSLSocket;

    invoke-direct {p0, v0}, Lcom/huawei/openalliance/ad/net/http/h;->a(Ljavax/net/ssl/SSLSocket;)V

    move-object v0, p1

    check-cast v0, Ljavax/net/ssl/SSLSocket;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/net/http/h;->b(Ljavax/net/ssl/SSLSocket;)V

    :cond_0
    return-void
.end method

.method private a(Ljavax/net/ssl/SSLSocket;)V
    .locals 3

    if-eqz p1, :cond_0

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x10

    if-lt v0, v1, :cond_0

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "TLSv1.1"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "TLSv1.2"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    invoke-virtual {p1, v0}, Ljavax/net/ssl/SSLSocket;->setEnabledProtocols([Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method private static b(Ljavax/net/ssl/SSLSocket;)V
    .locals 5

    invoke-virtual {p0}, Ljavax/net/ssl/SSLSocket;->getEnabledCipherSuites()[Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    array-length v0, v1

    if-nez v0, :cond_1

    :cond_0
    return-void

    :cond_1
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    const/4 v3, 0x0

    :goto_0
    array-length v0, v1

    if-ge v3, v0, :cond_3

    aget-object v4, v1, v3

    invoke-static {v4}, Lcom/huawei/openalliance/ad/utils/y;->a(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-interface {v2, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_3
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v0

    new-array v0, v0, [Ljava/lang/String;

    invoke-interface {v2, v0}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, [Ljava/lang/String;

    invoke-virtual {p0, v3}, Ljavax/net/ssl/SSLSocket;->setEnabledCipherSuites([Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public createSocket(Ljava/lang/String;I)Ljava/net/Socket;
    .locals 2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/net/http/h;->b:Ljavax/net/ssl/SSLContext;

    invoke-virtual {v0}, Ljavax/net/ssl/SSLContext;->getSocketFactory()Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Ljavax/net/ssl/SSLSocketFactory;->createSocket(Ljava/lang/String;I)Ljava/net/Socket;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/huawei/openalliance/ad/net/http/h;->a(Ljava/net/Socket;)V

    return-object v1
.end method

.method public createSocket(Ljava/lang/String;ILjava/net/InetAddress;I)Ljava/net/Socket;
    .locals 2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/net/http/h;->b:Ljavax/net/ssl/SSLContext;

    invoke-virtual {v0}, Ljavax/net/ssl/SSLContext;->getSocketFactory()Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3, p4}, Ljavax/net/ssl/SSLSocketFactory;->createSocket(Ljava/lang/String;ILjava/net/InetAddress;I)Ljava/net/Socket;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/huawei/openalliance/ad/net/http/h;->a(Ljava/net/Socket;)V

    return-object v1
.end method

.method public createSocket(Ljava/net/InetAddress;I)Ljava/net/Socket;
    .locals 2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/net/http/h;->b:Ljavax/net/ssl/SSLContext;

    invoke-virtual {v0}, Ljavax/net/ssl/SSLContext;->getSocketFactory()Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Ljavax/net/ssl/SSLSocketFactory;->createSocket(Ljava/net/InetAddress;I)Ljava/net/Socket;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/huawei/openalliance/ad/net/http/h;->a(Ljava/net/Socket;)V

    return-object v1
.end method

.method public createSocket(Ljava/net/InetAddress;ILjava/net/InetAddress;I)Ljava/net/Socket;
    .locals 2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/net/http/h;->b:Ljavax/net/ssl/SSLContext;

    invoke-virtual {v0}, Ljavax/net/ssl/SSLContext;->getSocketFactory()Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3, p4}, Ljavax/net/ssl/SSLSocketFactory;->createSocket(Ljava/net/InetAddress;ILjava/net/InetAddress;I)Ljava/net/Socket;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/huawei/openalliance/ad/net/http/h;->a(Ljava/net/Socket;)V

    return-object v1
.end method

.method public createSocket(Ljava/net/Socket;Ljava/lang/String;IZ)Ljava/net/Socket;
    .locals 2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/net/http/h;->b:Ljavax/net/ssl/SSLContext;

    invoke-virtual {v0}, Ljavax/net/ssl/SSLContext;->getSocketFactory()Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3, p4}, Ljavax/net/ssl/SSLSocketFactory;->createSocket(Ljava/net/Socket;Ljava/lang/String;IZ)Ljava/net/Socket;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/huawei/openalliance/ad/net/http/h;->a(Ljava/net/Socket;)V

    return-object v1
.end method

.method public getDefaultCipherSuites()[Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/String;

    return-object v0
.end method

.method public getSupportedCipherSuites()[Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/String;

    return-object v0
.end method
