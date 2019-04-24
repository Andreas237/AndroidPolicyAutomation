.class public Lo/ecv;
.super Ljavax/net/ssl/SSLSocketFactory;
.source "SourceFile"


# static fields
.field public static final a:Lorg/apache/http/conn/ssl/X509HostnameVerifier;

.field private static final b:[Ljava/lang/String;

.field private static volatile c:Lo/ecv;

.field private static d:[Ljava/lang/String;

.field public static final e:Lorg/apache/http/conn/ssl/X509HostnameVerifier;


# instance fields
.field private i:Landroid/content/Context;

.field private k:Ljavax/net/ssl/SSLContext;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 39
    new-instance v0, Lorg/apache/http/conn/ssl/BrowserCompatHostnameVerifier;

    invoke-direct {v0}, Lorg/apache/http/conn/ssl/BrowserCompatHostnameVerifier;-><init>()V

    sput-object v0, Lo/ecv;->e:Lorg/apache/http/conn/ssl/X509HostnameVerifier;

    .line 47
    new-instance v0, Lorg/apache/http/conn/ssl/StrictHostnameVerifier;

    invoke-direct {v0}, Lorg/apache/http/conn/ssl/StrictHostnameVerifier;-><init>()V

    sput-object v0, Lo/ecv;->a:Lorg/apache/http/conn/ssl/X509HostnameVerifier;

    .line 49
    const/16 v0, 0xe

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "TEA"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "SHA0"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, "MD2"

    const/4 v2, 0x2

    aput-object v1, v0, v2

    const-string v1, "MD4"

    const/4 v2, 0x3

    aput-object v1, v0, v2

    const-string v1, "RIPEMD"

    const/4 v2, 0x4

    aput-object v1, v0, v2

    const-string v1, "RC4"

    const/4 v2, 0x5

    aput-object v1, v0, v2

    const-string v1, "DES"

    const/4 v2, 0x6

    aput-object v1, v0, v2

    const-string v1, "DESX"

    const/4 v2, 0x7

    aput-object v1, v0, v2

    const-string v1, "DES40"

    const/16 v2, 0x8

    aput-object v1, v0, v2

    const-string v1, "RC2"

    const/16 v2, 0x9

    aput-object v1, v0, v2

    const-string v1, "MD5"

    const/16 v2, 0xa

    aput-object v1, v0, v2

    const-string v1, "ANON"

    const/16 v2, 0xb

    aput-object v1, v0, v2

    const-string v1, "NULL"

    const/16 v2, 0xc

    aput-object v1, v0, v2

    const-string v1, "TLS_EMPTY_RENEGOTIATION_INFO_SCSV"

    const/16 v2, 0xd

    aput-object v1, v0, v2

    sput-object v0, Lo/ecv;->b:[Ljava/lang/String;

    .line 52
    const/4 v0, 0x0

    sput-object v0, Lo/ecv;->c:Lo/ecv;

    .line 53
    const/4 v0, 0x0

    sput-object v0, Lo/ecv;->d:[Ljava/lang/String;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Ljava/security/NoSuchAlgorithmException;,
            Ljava/security/cert/CertificateException;,
            Ljava/security/KeyStoreException;,
            Ljava/security/KeyManagementException;,
            Ljava/lang/IllegalAccessException;
        }
    .end annotation

    .line 63
    invoke-direct {p0}, Ljavax/net/ssl/SSLSocketFactory;-><init>()V

    .line 54
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ecv;->k:Ljavax/net/ssl/SSLContext;

    .line 64
    iput-object p1, p0, Lo/ecv;->i:Landroid/content/Context;

    .line 65
    const-string v0, "TLS"

    invoke-static {v0}, Ljavax/net/ssl/SSLContext;->getInstance(Ljava/lang/String;)Ljavax/net/ssl/SSLContext;

    move-result-object v0

    iput-object v0, p0, Lo/ecv;->k:Ljavax/net/ssl/SSLContext;

    .line 66
    new-instance v4, Lo/ecu;

    iget-object v0, p0, Lo/ecv;->i:Landroid/content/Context;

    invoke-direct {v4, v0}, Lo/ecu;-><init>(Landroid/content/Context;)V

    .line 67
    iget-object v0, p0, Lo/ecv;->k:Ljavax/net/ssl/SSLContext;

    const/4 v1, 0x1

    new-array v1, v1, [Ljavax/net/ssl/X509TrustManager;

    const/4 v2, 0x0

    aput-object v4, v1, v2

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v1, v3}, Ljavax/net/ssl/SSLContext;->init([Ljavax/net/ssl/KeyManager;[Ljavax/net/ssl/TrustManager;Ljava/security/SecureRandom;)V

    .line 68
    return-void
.end method

.method private static b(Ljavax/net/ssl/SSLSocket;)V
    .locals 13

    .line 107
    if-nez p0, :cond_0

    .line 108
    return-void

    .line 110
    :cond_0
    invoke-virtual {p0}, Ljavax/net/ssl/SSLSocket;->getEnabledCipherSuites()[Ljava/lang/String;

    move-result-object v1

    .line 111
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 112
    const-string v3, ""

    .line 114
    move-object v4, v1

    array-length v5, v4

    const/4 v6, 0x0

    :goto_0
    if-ge v6, v5, :cond_4

    aget-object v7, v4, v6

    .line 115
    const/4 v8, 0x0

    .line 116
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {v7, v0}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v3

    .line 118
    sget-object v9, Lo/ecv;->b:[Ljava/lang/String;

    array-length v10, v9

    const/4 v11, 0x0

    :goto_1
    if-ge v11, v10, :cond_2

    aget-object v12, v9, v11

    .line 119
    invoke-virtual {v3, v12}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 120
    const/4 v8, 0x1

    .line 121
    goto :goto_2

    .line 118
    :cond_1
    add-int/lit8 v11, v11, 0x1

    goto :goto_1

    .line 124
    :cond_2
    :goto_2
    if-nez v8, :cond_3

    .line 125
    invoke-interface {v2, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 114
    :cond_3
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 128
    :cond_4
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v0

    new-array v0, v0, [Ljava/lang/String;

    invoke-interface {v2, v0}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    sput-object v0, Lo/ecv;->d:[Ljava/lang/String;

    .line 129
    sget-object v0, Lo/ecv;->d:[Ljava/lang/String;

    invoke-virtual {p0, v0}, Ljavax/net/ssl/SSLSocket;->setEnabledCipherSuites([Ljava/lang/String;)V

    .line 130
    return-void
.end method

.method private c(Ljava/net/Socket;)V
    .locals 1

    .line 136
    if-eqz p1, :cond_0

    instance-of v0, p1, Ljavax/net/ssl/SSLSocket;

    if-eqz v0, :cond_0

    .line 137
    move-object v0, p1

    check-cast v0, Ljavax/net/ssl/SSLSocket;

    invoke-direct {p0, v0}, Lo/ecv;->e(Ljavax/net/ssl/SSLSocket;)V

    .line 138
    move-object v0, p1

    check-cast v0, Ljavax/net/ssl/SSLSocket;

    invoke-static {v0}, Lo/ecv;->b(Ljavax/net/ssl/SSLSocket;)V

    .line 140
    :cond_0
    return-void
.end method

.method public static e(Landroid/content/Context;)Lo/ecv;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Ljava/security/NoSuchAlgorithmException;,
            Ljava/security/cert/CertificateException;,
            Ljava/security/KeyStoreException;,
            Ljava/lang/IllegalAccessException;,
            Ljava/security/KeyManagementException;
        }
    .end annotation

    .line 92
    sget-object v0, Lo/ecv;->c:Lo/ecv;

    if-nez v0, :cond_1

    .line 93
    const-class v1, Lo/ecv;

    monitor-enter v1

    .line 94
    :try_start_0
    sget-object v0, Lo/ecv;->c:Lo/ecv;

    if-nez v0, :cond_0

    .line 95
    new-instance v0, Lo/ecv;

    invoke-direct {v0, p0}, Lo/ecv;-><init>(Landroid/content/Context;)V

    sput-object v0, Lo/ecv;->c:Lo/ecv;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 97
    :cond_0
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2

    .line 99
    :cond_1
    :goto_0
    sget-object v0, Lo/ecv;->c:Lo/ecv;

    return-object v0
.end method

.method private e(Ljavax/net/ssl/SSLSocket;)V
    .locals 3

    .line 146
    if-eqz p1, :cond_0

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x10

    if-lt v0, v1, :cond_0

    .line 147
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "TLSv1.1"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "TLSv1.2"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    invoke-virtual {p1, v0}, Ljavax/net/ssl/SSLSocket;->setEnabledProtocols([Ljava/lang/String;)V

    .line 149
    :cond_0
    return-void
.end method


# virtual methods
.method public createSocket(Ljava/lang/String;I)Ljava/net/Socket;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Ljava/net/UnknownHostException;
        }
    .end annotation

    .line 174
    iget-object v0, p0, Lo/ecv;->k:Ljavax/net/ssl/SSLContext;

    invoke-virtual {v0}, Ljavax/net/ssl/SSLContext;->getSocketFactory()Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Ljavax/net/ssl/SSLSocketFactory;->createSocket(Ljava/lang/String;I)Ljava/net/Socket;

    move-result-object v1

    .line 175
    invoke-direct {p0, v1}, Lo/ecv;->c(Ljava/net/Socket;)V

    .line 176
    return-object v1
.end method

.method public createSocket(Ljava/lang/String;ILjava/net/InetAddress;I)Ljava/net/Socket;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Ljava/net/UnknownHostException;
        }
    .end annotation

    .line 193
    invoke-virtual {p0, p1, p2}, Lo/ecv;->createSocket(Ljava/lang/String;I)Ljava/net/Socket;

    move-result-object v0

    return-object v0
.end method

.method public createSocket(Ljava/net/InetAddress;I)Ljava/net/Socket;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 184
    invoke-virtual {p1}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0, p2}, Lo/ecv;->createSocket(Ljava/lang/String;I)Ljava/net/Socket;

    move-result-object v0

    return-object v0
.end method

.method public createSocket(Ljava/net/InetAddress;ILjava/net/InetAddress;I)Ljava/net/Socket;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 202
    invoke-virtual {p1}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0, p2}, Lo/ecv;->createSocket(Ljava/lang/String;I)Ljava/net/Socket;

    move-result-object v0

    return-object v0
.end method

.method public createSocket(Ljava/net/Socket;Ljava/lang/String;IZ)Ljava/net/Socket;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 211
    iget-object v0, p0, Lo/ecv;->k:Ljavax/net/ssl/SSLContext;

    invoke-virtual {v0}, Ljavax/net/ssl/SSLContext;->getSocketFactory()Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3, p4}, Ljavax/net/ssl/SSLSocketFactory;->createSocket(Ljava/net/Socket;Ljava/lang/String;IZ)Ljava/net/Socket;

    move-result-object v1

    .line 212
    invoke-direct {p0, v1}, Lo/ecv;->c(Ljava/net/Socket;)V

    .line 213
    return-object v1
.end method

.method public getDefaultCipherSuites()[Ljava/lang/String;
    .locals 1

    .line 156
    sget-object v0, Lo/ecv;->d:[Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 157
    sget-object v0, Lo/ecv;->d:[Ljava/lang/String;

    invoke-virtual {v0}, [Ljava/lang/String;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    return-object v0

    .line 159
    :cond_0
    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/String;

    return-object v0
.end method

.method public getSupportedCipherSuites()[Ljava/lang/String;
    .locals 1

    .line 165
    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/String;

    return-object v0
.end method
