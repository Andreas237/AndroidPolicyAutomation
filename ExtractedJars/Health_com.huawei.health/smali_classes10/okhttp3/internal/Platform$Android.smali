.class Lokhttp3/internal/Platform$Android;
.super Lokhttp3/internal/Platform;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lokhttp3/internal/Platform;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "Android"
.end annotation


# static fields
.field private static final MAX_LOG_LENGTH:I = 0xfa0


# instance fields
.field private final getAlpnSelectedProtocol:Lokhttp3/internal/OptionalMethod;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lokhttp3/internal/OptionalMethod<Ljava/net/Socket;>;"
        }
    .end annotation
.end field

.field private final setAlpnProtocols:Lokhttp3/internal/OptionalMethod;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lokhttp3/internal/OptionalMethod<Ljava/net/Socket;>;"
        }
    .end annotation
.end field

.field private final setHostname:Lokhttp3/internal/OptionalMethod;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lokhttp3/internal/OptionalMethod<Ljava/net/Socket;>;"
        }
    .end annotation
.end field

.field private final setUseSessionTickets:Lokhttp3/internal/OptionalMethod;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lokhttp3/internal/OptionalMethod<Ljava/net/Socket;>;"
        }
    .end annotation
.end field

.field private final sslParametersClass:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<*>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/Class;Lokhttp3/internal/OptionalMethod;Lokhttp3/internal/OptionalMethod;Lokhttp3/internal/OptionalMethod;Lokhttp3/internal/OptionalMethod;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/Class<*>;Lokhttp3/internal/OptionalMethod<Ljava/net/Socket;>;Lokhttp3/internal/OptionalMethod<Ljava/net/Socket;>;Lokhttp3/internal/OptionalMethod<Ljava/net/Socket;>;Lokhttp3/internal/OptionalMethod<Ljava/net/Socket;>;)V"
        }
    .end annotation

    .line 200
    invoke-direct {p0}, Lokhttp3/internal/Platform;-><init>()V

    .line 201
    iput-object p1, p0, Lokhttp3/internal/Platform$Android;->sslParametersClass:Ljava/lang/Class;

    .line 202
    iput-object p2, p0, Lokhttp3/internal/Platform$Android;->setUseSessionTickets:Lokhttp3/internal/OptionalMethod;

    .line 203
    iput-object p3, p0, Lokhttp3/internal/Platform$Android;->setHostname:Lokhttp3/internal/OptionalMethod;

    .line 204
    iput-object p4, p0, Lokhttp3/internal/Platform$Android;->getAlpnSelectedProtocol:Lokhttp3/internal/OptionalMethod;

    .line 205
    iput-object p5, p0, Lokhttp3/internal/Platform$Android;->setAlpnProtocols:Lokhttp3/internal/OptionalMethod;

    .line 206
    return-void
.end method


# virtual methods
.method public configureTlsExtensions(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List<Lokhttp3/Protocol;>;)V"
        }
    .end annotation

    .line 255
    if-eqz p2, :cond_0

    .line 256
    iget-object v0, p0, Lokhttp3/internal/Platform$Android;->setUseSessionTickets:Lokhttp3/internal/OptionalMethod;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x1

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v0, p1, v1}, Lokhttp3/internal/OptionalMethod;->invokeOptionalWithoutCheckedException(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 257
    iget-object v0, p0, Lokhttp3/internal/Platform$Android;->setHostname:Lokhttp3/internal/OptionalMethod;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p2, v1, v2

    invoke-virtual {v0, p1, v1}, Lokhttp3/internal/OptionalMethod;->invokeOptionalWithoutCheckedException(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 261
    :cond_0
    iget-object v0, p0, Lokhttp3/internal/Platform$Android;->setAlpnProtocols:Lokhttp3/internal/OptionalMethod;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lokhttp3/internal/Platform$Android;->setAlpnProtocols:Lokhttp3/internal/OptionalMethod;

    invoke-virtual {v0, p1}, Lokhttp3/internal/OptionalMethod;->isSupported(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 262
    const/4 v0, 0x1

    new-array v4, v0, [Ljava/lang/Object;

    invoke-static {p3}, Lokhttp3/internal/Platform$Android;->concatLengthPrefixed(Ljava/util/List;)[B

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v4, v1

    .line 263
    iget-object v0, p0, Lokhttp3/internal/Platform$Android;->setAlpnProtocols:Lokhttp3/internal/OptionalMethod;

    invoke-virtual {v0, p1, v4}, Lokhttp3/internal/OptionalMethod;->invokeWithoutCheckedException(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 265
    :cond_1
    return-void
.end method

.method public connectSocket(Ljava/net/Socket;Ljava/net/InetSocketAddress;I)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 211
    :try_start_0
    invoke-virtual {p1, p2, p3}, Ljava/net/Socket;->connect(Ljava/net/SocketAddress;I)V
    :try_end_0
    .catch Ljava/lang/AssertionError; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_1

    .line 221
    goto :goto_0

    .line 212
    :catch_0
    move-exception v1

    .line 213
    invoke-static {v1}, Lokhttp3/internal/Util;->isAndroidGetsocknameError(Ljava/lang/AssertionError;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/io/IOException;

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    throw v0

    .line 214
    :cond_0
    throw v1

    .line 215
    :catch_1
    move-exception v1

    .line 218
    new-instance v2, Ljava/io/IOException;

    const-string v0, "Exception in connect"

    invoke-direct {v2, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 219
    invoke-virtual {v2, v1}, Ljava/io/IOException;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 220
    throw v2

    .line 222
    :goto_0
    return-void
.end method

.method public getSelectedProtocol(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;
    .locals 3

    .line 268
    iget-object v0, p0, Lokhttp3/internal/Platform$Android;->getAlpnSelectedProtocol:Lokhttp3/internal/OptionalMethod;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 269
    :cond_0
    iget-object v0, p0, Lokhttp3/internal/Platform$Android;->getAlpnSelectedProtocol:Lokhttp3/internal/OptionalMethod;

    invoke-virtual {v0, p1}, Lokhttp3/internal/OptionalMethod;->isSupported(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x0

    return-object v0

    .line 271
    :cond_1
    iget-object v0, p0, Lokhttp3/internal/Platform$Android;->getAlpnSelectedProtocol:Lokhttp3/internal/OptionalMethod;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v0, p1, v1}, Lokhttp3/internal/OptionalMethod;->invokeWithoutCheckedException(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    move-object v2, v0

    check-cast v2, [B

    .line 272
    if-eqz v2, :cond_2

    new-instance v0, Ljava/lang/String;

    sget-object v1, Lokhttp3/internal/Util;->UTF_8:Ljava/nio/charset/Charset;

    invoke-direct {v0, v2, v1}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public log(Ljava/lang/String;)V
    .locals 6

    .line 277
    const/4 v2, 0x0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v3

    :goto_0
    if-ge v2, v3, :cond_2

    .line 278
    const/16 v0, 0xa

    invoke-virtual {p1, v0, v2}, Ljava/lang/String;->indexOf(II)I

    move-result v4

    .line 279
    const/4 v0, -0x1

    if-eq v4, v0, :cond_0

    goto :goto_1

    :cond_0
    move v4, v3

    .line 281
    :cond_1
    :goto_1
    add-int/lit16 v0, v2, 0xfa0

    invoke-static {v4, v0}, Ljava/lang/Math;->min(II)I

    move-result v5

    .line 282
    const-string v0, "OkHttp"

    invoke-virtual {p1, v2, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 283
    move v2, v5

    .line 284
    if-lt v2, v4, :cond_1

    .line 277
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 286
    :cond_2
    return-void
.end method

.method public trustManager(Ljavax/net/ssl/SSLSocketFactory;)Ljavax/net/ssl/X509TrustManager;
    .locals 5

    .line 225
    iget-object v0, p0, Lokhttp3/internal/Platform$Android;->sslParametersClass:Ljava/lang/Class;

    const-string v1, "sslParameters"

    invoke-static {p1, v0, v1}, Lokhttp3/internal/Platform$Android;->readFieldOrNull(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    .line 226
    if-nez v3, :cond_0

    .line 230
    const-string v0, "com.google.android.gms.org.conscrypt.SSLParametersImpl"

    .line 232
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    .line 230
    const/4 v2, 0x0

    invoke-static {v0, v2, v1}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v4

    .line 233
    const-string v0, "sslParameters"

    invoke-static {p1, v4, v0}, Lokhttp3/internal/Platform$Android;->readFieldOrNull(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v3

    .line 236
    goto :goto_0

    .line 234
    :catch_0
    move-exception v4

    .line 235
    invoke-super {p0, p1}, Lokhttp3/internal/Platform;->trustManager(Ljavax/net/ssl/SSLSocketFactory;)Ljavax/net/ssl/X509TrustManager;

    move-result-object v0

    return-object v0

    .line 239
    :cond_0
    :goto_0
    const-class v0, Ljavax/net/ssl/X509TrustManager;

    const-string v1, "x509TrustManager"

    invoke-static {v3, v0, v1}, Lokhttp3/internal/Platform$Android;->readFieldOrNull(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljavax/net/ssl/X509TrustManager;

    .line 241
    if-eqz v4, :cond_1

    return-object v4

    .line 243
    :cond_1
    const-class v0, Ljavax/net/ssl/X509TrustManager;

    const-string v1, "trustManager"

    invoke-static {v3, v0, v1}, Lokhttp3/internal/Platform$Android;->readFieldOrNull(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljavax/net/ssl/X509TrustManager;

    return-object v0
.end method

.method public trustRootIndex(Ljavax/net/ssl/X509TrustManager;)Lokhttp3/internal/tls/TrustRootIndex;
    .locals 2

    .line 247
    invoke-static {p1}, Lokhttp3/internal/tls/AndroidTrustRootIndex;->get(Ljavax/net/ssl/X509TrustManager;)Lokhttp3/internal/tls/TrustRootIndex;

    move-result-object v1

    .line 248
    if-eqz v1, :cond_0

    return-object v1

    .line 249
    :cond_0
    invoke-super {p0, p1}, Lokhttp3/internal/Platform;->trustRootIndex(Ljavax/net/ssl/X509TrustManager;)Lokhttp3/internal/tls/TrustRootIndex;

    move-result-object v0

    return-object v0
.end method
