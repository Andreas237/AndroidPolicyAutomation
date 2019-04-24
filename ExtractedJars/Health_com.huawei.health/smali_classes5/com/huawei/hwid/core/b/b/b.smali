.class public Lcom/huawei/hwid/core/b/b/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Lorg/apache/http/conn/ClientConnectionManager;

.field private static final b:Lorg/apache/http/conn/params/ConnPerRoute;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 44
    new-instance v0, Lcom/huawei/hwid/core/b/b/b$1;

    invoke-direct {v0}, Lcom/huawei/hwid/core/b/b/b$1;-><init>()V

    sput-object v0, Lcom/huawei/hwid/core/b/b/b;->b:Lorg/apache/http/conn/params/ConnPerRoute;

    return-void
.end method

.method public static a(Landroid/content/Context;)Lorg/apache/http/conn/ClientConnectionManager;
    .locals 8

    .line 69
    sget-object v0, Lcom/huawei/hwid/core/b/b/b;->a:Lorg/apache/http/conn/ClientConnectionManager;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_2

    .line 70
    new-instance v4, Lorg/apache/http/conn/scheme/SchemeRegistry;

    invoke-direct {v4}, Lorg/apache/http/conn/scheme/SchemeRegistry;-><init>()V

    .line 71
    const/4 v5, 0x0

    .line 72
    const/4 v6, 0x0

    .line 73
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x10

    if-lt v0, v1, :cond_0

    .line 74
    const/4 v6, 0x1

    .line 77
    :cond_0
    :try_start_0
    new-instance v0, Lcom/huawei/hwid/core/b/b/c;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0, v6}, Lcom/huawei/hwid/core/b/b/c;-><init>(Ljava/security/KeyStore;Landroid/content/Context;Z)V
    :try_end_0
    .catch Ljava/security/KeyManagementException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/security/KeyStoreException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/security/UnrecoverableKeyException; {:try_start_0 .. :try_end_0} :catch_3

    move-object v5, v0

    .line 86
    goto :goto_0

    .line 78
    :catch_0
    move-exception v7

    .line 79
    const-string v0, "HttpClientConnetManager"

    const-string v1, "getConnectionManager KeyManagementException"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 86
    goto :goto_0

    .line 80
    :catch_1
    move-exception v7

    .line 81
    const-string v0, "HttpClientConnetManager"

    const-string v1, "getConnectionManager NoSuchAlgorithmException"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 86
    goto :goto_0

    .line 82
    :catch_2
    move-exception v7

    .line 83
    const-string v0, "HttpClientConnetManager"

    const-string v1, "getConnectionManager KeyStoreException"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 86
    goto :goto_0

    .line 84
    :catch_3
    move-exception v7

    .line 85
    const-string v0, "HttpClientConnetManager"

    const-string v1, "getConnectionManager UnrecoverableKeyException"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 87
    :goto_0
    const/4 v0, 0x0

    if-eq v0, v5, :cond_1

    .line 88
    const-string v0, "HttpClientConnetManager"

    const-string v1, "mysslSocketFactory is not null"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 89
    sget-object v0, Lorg/apache/http/conn/ssl/SSLSocketFactory;->BROWSER_COMPATIBLE_HOSTNAME_VERIFIER:Lorg/apache/http/conn/ssl/X509HostnameVerifier;

    invoke-virtual {v5, v0}, Lcom/huawei/hwid/core/b/b/c;->setHostnameVerifier(Lorg/apache/http/conn/ssl/X509HostnameVerifier;)V

    .line 92
    new-instance v0, Lorg/apache/http/conn/scheme/Scheme;

    const-string v1, "https"

    const/16 v2, 0x1bb

    invoke-direct {v0, v1, v5, v2}, Lorg/apache/http/conn/scheme/Scheme;-><init>(Ljava/lang/String;Lorg/apache/http/conn/scheme/SocketFactory;I)V

    invoke-virtual {v4, v0}, Lorg/apache/http/conn/scheme/SchemeRegistry;->register(Lorg/apache/http/conn/scheme/Scheme;)Lorg/apache/http/conn/scheme/Scheme;

    .line 95
    :cond_1
    new-instance v0, Lorg/apache/http/conn/scheme/Scheme;

    const-string v1, "http"

    invoke-static {}, Lorg/apache/http/conn/scheme/PlainSocketFactory;->getSocketFactory()Lorg/apache/http/conn/scheme/PlainSocketFactory;

    move-result-object v2

    const/16 v3, 0x1f90

    invoke-direct {v0, v1, v2, v3}, Lorg/apache/http/conn/scheme/Scheme;-><init>(Ljava/lang/String;Lorg/apache/http/conn/scheme/SocketFactory;I)V

    invoke-virtual {v4, v0}, Lorg/apache/http/conn/scheme/SchemeRegistry;->register(Lorg/apache/http/conn/scheme/Scheme;)Lorg/apache/http/conn/scheme/Scheme;

    .line 97
    new-instance v7, Lorg/apache/http/params/BasicHttpParams;

    invoke-direct {v7}, Lorg/apache/http/params/BasicHttpParams;-><init>()V

    .line 98
    const-string v0, "http.conn-manager.max-total"

    const/16 v1, 0x19

    invoke-interface {v7, v0, v1}, Lorg/apache/http/params/HttpParams;->setIntParameter(Ljava/lang/String;I)Lorg/apache/http/params/HttpParams;

    .line 99
    const-string v0, "http.conn-manager.max-per-route"

    sget-object v1, Lcom/huawei/hwid/core/b/b/b;->b:Lorg/apache/http/conn/params/ConnPerRoute;

    invoke-interface {v7, v0, v1}, Lorg/apache/http/params/HttpParams;->setParameter(Ljava/lang/String;Ljava/lang/Object;)Lorg/apache/http/params/HttpParams;

    .line 102
    new-instance v0, Lorg/apache/http/impl/conn/tsccm/ThreadSafeClientConnManager;

    invoke-direct {v0, v7, v4}, Lorg/apache/http/impl/conn/tsccm/ThreadSafeClientConnManager;-><init>(Lorg/apache/http/params/HttpParams;Lorg/apache/http/conn/scheme/SchemeRegistry;)V

    invoke-static {v0}, Lcom/huawei/hwid/core/b/b/b;->a(Lorg/apache/http/conn/ClientConnectionManager;)V

    .line 104
    :cond_2
    sget-object v0, Lcom/huawei/hwid/core/b/b/b;->a:Lorg/apache/http/conn/ClientConnectionManager;

    return-object v0
.end method

.method public static a(Ljava/net/Socket;)V
    .locals 4

    .line 54
    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    instance-of v0, p0, Ljavax/net/ssl/SSLSocket;

    if-eqz v0, :cond_0

    .line 55
    move-object v2, p0

    check-cast v2, Ljavax/net/ssl/SSLSocket;

    .line 57
    const/4 v0, 0x1

    new-array v3, v0, [Ljava/lang/String;

    const-string v0, "TLSv1.2"

    const/4 v1, 0x0

    aput-object v0, v3, v1

    .line 58
    invoke-virtual {v2, v3}, Ljavax/net/ssl/SSLSocket;->setEnabledProtocols([Ljava/lang/String;)V

    .line 60
    :cond_0
    return-void
.end method

.method public static a(Ljavax/net/ssl/SSLSocket;)V
    .locals 8

    .line 119
    if-nez p0, :cond_0

    .line 120
    const-string v0, "HttpClientConnetManager"

    const-string v1, "setEnableSafeCipherSuites socket error"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 121
    return-void

    .line 123
    :cond_0
    const-string v0, "HttpClientConnetManager"

    const-string v1, "setEnableSafeCipherSuitesenter setEnableSafeCipherSuites"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 126
    invoke-virtual {p0}, Ljavax/net/ssl/SSLSocket;->getEnabledCipherSuites()[Ljava/lang/String;

    move-result-object v2

    .line 127
    const-string v0, "HttpClientConnetManager"

    const-string v1, " current EnabledCipherSuites size"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 129
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 137
    move-object v4, v2

    array-length v5, v4

    const/4 v6, 0x0

    :goto_0
    if-ge v6, v5, :cond_2

    aget-object v7, v4, v6

    .line 139
    const-string v0, "RC4"

    invoke-virtual {v7, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "DES"

    invoke-virtual {v7, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "3DES"

    invoke-virtual {v7, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "aNULL"

    invoke-virtual {v7, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "eNULL"

    .line 140
    invoke-virtual {v7, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "MD5"

    invoke-virtual {v7, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "TLS_DH_anon_WITH_AES_256_CBC_SHA"

    invoke-virtual {v7, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 141
    invoke-interface {v3, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 137
    :cond_1
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 145
    :cond_2
    const-string v0, "HttpClientConnetManager"

    const-string v1, "get safe EnabledCipherSuites list "

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 148
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v0

    new-array v0, v0, [Ljava/lang/String;

    invoke-interface {v3, v0}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, [Ljava/lang/String;

    .line 150
    const-string v0, "HttpClientConnetManager"

    const-string v1, "get safe EnabledCipherSuites Array "

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 152
    invoke-virtual {p0, v4}, Ljavax/net/ssl/SSLSocket;->setEnabledCipherSuites([Ljava/lang/String;)V

    .line 154
    return-void
.end method

.method private static declared-synchronized a(Lorg/apache/http/conn/ClientConnectionManager;)V
    .locals 1

    const-class v0, Lcom/huawei/hwid/core/b/b/b;

    monitor-enter v0

    .line 109
    :try_start_0
    sput-object p0, Lcom/huawei/hwid/core/b/b/b;->a:Lorg/apache/http/conn/ClientConnectionManager;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 110
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method
