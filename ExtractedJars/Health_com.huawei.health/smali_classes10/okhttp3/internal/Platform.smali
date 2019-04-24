.class public Lokhttp3/internal/Platform;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lokhttp3/internal/Platform$JettyNegoProvider;,
        Lokhttp3/internal/Platform$JdkWithJettyBootPlatform;,
        Lokhttp3/internal/Platform$Android;
    }
.end annotation


# static fields
.field private static final PLATFORM:Lokhttp3/internal/Platform;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 70
    invoke-static {}, Lokhttp3/internal/Platform;->findPlatform()Lokhttp3/internal/Platform;

    move-result-object v0

    sput-object v0, Lokhttp3/internal/Platform;->PLATFORM:Lokhttp3/internal/Platform;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 69
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 353
    return-void
.end method

.method static concatLengthPrefixed(Ljava/util/List;)[B
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lokhttp3/Protocol;>;)[B"
        }
    .end annotation

    .line 403
    new-instance v1, Lokio/Buffer;

    invoke-direct {v1}, Lokio/Buffer;-><init>()V

    .line 404
    const/4 v2, 0x0

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v3

    :goto_0
    if-ge v2, v3, :cond_1

    .line 405
    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lokhttp3/Protocol;

    .line 406
    sget-object v0, Lokhttp3/Protocol;->HTTP_1_0:Lokhttp3/Protocol;

    if-ne v4, v0, :cond_0

    goto :goto_1

    .line 407
    :cond_0
    invoke-virtual {v4}, Lokhttp3/Protocol;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    invoke-virtual {v1, v0}, Lokio/Buffer;->writeByte(I)Lokio/Buffer;

    .line 408
    invoke-virtual {v4}, Lokhttp3/Protocol;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lokio/Buffer;->writeUtf8(Ljava/lang/String;)Lokio/Buffer;

    .line 404
    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 410
    :cond_1
    invoke-virtual {v1}, Lokio/Buffer;->readByteArray()[B

    move-result-object v0

    return-object v0
.end method

.method private static findPlatform()Lokhttp3/internal/Platform;
    .locals 14

    .line 139
    const-string v0, "com.android.org.conscrypt.SSLParametersImpl"

    :try_start_0
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_2

    move-result-object v6

    .line 144
    goto :goto_0

    .line 140
    :catch_0
    move-exception v7

    .line 142
    const-string v0, "org.apache.harmony.xnet.provider.jsse.SSLParametersImpl"

    :try_start_1
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v6

    .line 146
    :goto_0
    new-instance v7, Lokhttp3/internal/OptionalMethod;

    const-string v0, "setUseSessionTickets"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Class;

    sget-object v2, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-direct {v7, v2, v0, v1}, Lokhttp3/internal/OptionalMethod;-><init>(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)V

    .line 148
    new-instance v8, Lokhttp3/internal/OptionalMethod;

    const-string v0, "setHostname"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Class;

    const-class v2, Ljava/lang/String;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-direct {v8, v2, v0, v1}, Lokhttp3/internal/OptionalMethod;-><init>(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)V
    :try_end_1
    .catch Ljava/lang/ClassNotFoundException; {:try_start_1 .. :try_end_1} :catch_2

    .line 150
    const/4 v9, 0x0

    .line 151
    const/4 v10, 0x0

    .line 155
    const-string v0, "android.net.Network"

    :try_start_2
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 156
    new-instance v0, Lokhttp3/internal/OptionalMethod;

    const-class v1, [B

    const-string v2, "getAlpnSelectedProtocol"

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Class;

    invoke-direct {v0, v1, v2, v3}, Lokhttp3/internal/OptionalMethod;-><init>(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)V

    move-object v9, v0

    .line 157
    new-instance v0, Lokhttp3/internal/OptionalMethod;

    const-string v1, "setAlpnProtocols"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Class;

    const-class v3, [B

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-direct {v0, v3, v1, v2}, Lokhttp3/internal/OptionalMethod;-><init>(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)V
    :try_end_2
    .catch Ljava/lang/ClassNotFoundException; {:try_start_2 .. :try_end_2} :catch_1

    move-object v10, v0

    .line 159
    goto :goto_1

    .line 158
    :catch_1
    move-exception v11

    .line 161
    :goto_1
    :try_start_3
    new-instance v0, Lokhttp3/internal/Platform$Android;

    move-object v1, v6

    move-object v2, v7

    move-object v3, v8

    move-object v4, v9

    move-object v5, v10

    invoke-direct/range {v0 .. v5}, Lokhttp3/internal/Platform$Android;-><init>(Ljava/lang/Class;Lokhttp3/internal/OptionalMethod;Lokhttp3/internal/OptionalMethod;Lokhttp3/internal/OptionalMethod;Lokhttp3/internal/OptionalMethod;)V
    :try_end_3
    .catch Ljava/lang/ClassNotFoundException; {:try_start_3 .. :try_end_3} :catch_2

    return-object v0

    .line 163
    :catch_2
    move-exception v6

    .line 169
    const-string v6, "org.eclipse.jetty.alpn.ALPN"

    .line 170
    :try_start_4
    invoke-static {v6}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v7

    .line 171
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "$Provider"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v8

    .line 172
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "$ClientProvider"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v9

    .line 173
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "$ServerProvider"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v10

    .line 174
    const-string v0, "put"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Class;

    const-class v2, Ljavax/net/ssl/SSLSocket;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v8, v1, v2

    invoke-virtual {v7, v0, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v11

    .line 175
    const-string v0, "get"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Class;

    const-class v2, Ljavax/net/ssl/SSLSocket;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v7, v0, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v12

    .line 176
    const-string v0, "remove"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Class;

    const-class v2, Ljavax/net/ssl/SSLSocket;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v7, v0, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v13

    .line 177
    new-instance v0, Lokhttp3/internal/Platform$JdkWithJettyBootPlatform;

    move-object v1, v11

    move-object v2, v12

    move-object v3, v13

    move-object v4, v9

    move-object v5, v10

    invoke-direct/range {v0 .. v5}, Lokhttp3/internal/Platform$JdkWithJettyBootPlatform;-><init>(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/Class;Ljava/lang/Class;)V
    :try_end_4
    .catch Ljava/lang/ClassNotFoundException; {:try_start_4 .. :try_end_4} :catch_3
    .catch Ljava/lang/NoSuchMethodException; {:try_start_4 .. :try_end_4} :catch_3

    return-object v0

    .line 179
    :catch_3
    move-exception v6

    .line 183
    new-instance v0, Lokhttp3/internal/Platform;

    invoke-direct {v0}, Lokhttp3/internal/Platform;-><init>()V

    return-object v0
.end method

.method public static get()Lokhttp3/internal/Platform;
    .locals 1

    .line 73
    sget-object v0, Lokhttp3/internal/Platform;->PLATFORM:Lokhttp3/internal/Platform;

    return-object v0
.end method

.method static readFieldOrNull(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:Ljava/lang/Object;>(Ljava/lang/Object;Ljava/lang/Class<TT;>;Ljava/lang/String;)TT;"
        }
    .end annotation

    .line 414
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    :goto_0
    const-class v0, Ljava/lang/Object;

    if-eq v2, v0, :cond_2

    .line 416
    :try_start_0
    invoke-virtual {v2, p2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v3

    .line 417
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    .line 418
    invoke-virtual {v3, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    .line 419
    if-eqz v4, :cond_0

    invoke-virtual {p1, v4}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 420
    :cond_1
    :try_start_1
    invoke-virtual {p1, v4}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/NoSuchFieldException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object v0

    return-object v0

    .line 421
    :catch_0
    move-exception v3

    .line 424
    goto :goto_1

    .line 422
    :catch_1
    move-exception v3

    .line 423
    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 414
    :goto_1
    invoke-virtual {v2}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v2

    goto :goto_0

    .line 428
    :cond_2
    const-string v0, "delegate"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 429
    const-class v0, Ljava/lang/Object;

    const-string v1, "delegate"

    invoke-static {p0, v0, v1}, Lokhttp3/internal/Platform;->readFieldOrNull(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    .line 430
    if-eqz v2, :cond_3

    invoke-static {v2, p1, p2}, Lokhttp3/internal/Platform;->readFieldOrNull(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    .line 433
    :cond_3
    const/4 v0, 0x0

    return-object v0
.end method


# virtual methods
.method public afterHandshake(Ljavax/net/ssl/SSLSocket;)V
    .locals 0

    .line 117
    return-void
.end method

.method public configureTlsExtensions(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List<Lokhttp3/Protocol;>;)V"
        }
    .end annotation

    .line 110
    return-void
.end method

.method public connectSocket(Ljava/net/Socket;Ljava/net/InetSocketAddress;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 126
    invoke-virtual {p1, p2, p3}, Ljava/net/Socket;->connect(Ljava/net/SocketAddress;I)V

    .line 127
    return-void
.end method

.method public getPrefix()Ljava/lang/String;
    .locals 1

    .line 78
    const-string v0, "OkHttp"

    return-object v0
.end method

.method public getSelectedProtocol(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;
    .locals 1

    .line 121
    const/4 v0, 0x0

    return-object v0
.end method

.method public log(Ljava/lang/String;)V
    .locals 1

    .line 130
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v0, p1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 131
    return-void
.end method

.method public logW(Ljava/lang/String;)V
    .locals 1

    .line 82
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v0, p1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 83
    return-void
.end method

.method public trustManager(Ljavax/net/ssl/SSLSocketFactory;)Ljavax/net/ssl/X509TrustManager;
    .locals 4

    .line 90
    const-string v0, "sun.security.ssl.SSLContextImpl"

    :try_start_0
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    .line 91
    const-string v0, "context"

    invoke-static {p1, v2, v0}, Lokhttp3/internal/Platform;->readFieldOrNull(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v3

    .line 92
    if-nez v3, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 93
    :cond_0
    :try_start_1
    const-class v0, Ljavax/net/ssl/X509TrustManager;

    const-string v1, "trustManager"

    invoke-static {v3, v0, v1}, Lokhttp3/internal/Platform;->readFieldOrNull(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljavax/net/ssl/X509TrustManager;
    :try_end_1
    .catch Ljava/lang/ClassNotFoundException; {:try_start_1 .. :try_end_1} :catch_0

    return-object v0

    .line 94
    :catch_0
    move-exception v2

    .line 95
    const/4 v0, 0x0

    return-object v0
.end method

.method public trustRootIndex(Ljavax/net/ssl/X509TrustManager;)Lokhttp3/internal/tls/TrustRootIndex;
    .locals 2

    .line 100
    new-instance v0, Lokhttp3/internal/tls/RealTrustRootIndex;

    invoke-interface {p1}, Ljavax/net/ssl/X509TrustManager;->getAcceptedIssuers()[Ljava/security/cert/X509Certificate;

    move-result-object v1

    invoke-direct {v0, v1}, Lokhttp3/internal/tls/RealTrustRootIndex;-><init>([Ljava/security/cert/X509Certificate;)V

    return-object v0
.end method
