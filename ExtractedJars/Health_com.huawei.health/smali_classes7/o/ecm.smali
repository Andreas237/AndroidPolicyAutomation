.class public Lo/ecm;
.super Lorg/apache/http/conn/ssl/SSLSocketFactory;
.source "SourceFile"


# static fields
.field private static volatile a:Lo/ecm;

.field public static final c:Lorg/apache/http/conn/ssl/X509HostnameVerifier;

.field public static final d:Lorg/apache/http/conn/ssl/X509HostnameVerifier;

.field private static final e:[Ljava/lang/String;


# instance fields
.field private b:Ljavax/net/ssl/SSLContext;

.field private i:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 36
    new-instance v0, Lorg/apache/http/conn/ssl/BrowserCompatHostnameVerifier;

    invoke-direct {v0}, Lorg/apache/http/conn/ssl/BrowserCompatHostnameVerifier;-><init>()V

    sput-object v0, Lo/ecm;->c:Lorg/apache/http/conn/ssl/X509HostnameVerifier;

    .line 43
    new-instance v0, Lorg/apache/http/conn/ssl/StrictHostnameVerifier;

    invoke-direct {v0}, Lorg/apache/http/conn/ssl/StrictHostnameVerifier;-><init>()V

    sput-object v0, Lo/ecm;->d:Lorg/apache/http/conn/ssl/X509HostnameVerifier;

    .line 46
    const/16 v0, 0x10

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

    const-string v1, "aNULL"

    const/4 v2, 0x5

    aput-object v1, v0, v2

    const-string v1, "eNULL"

    const/4 v2, 0x6

    aput-object v1, v0, v2

    const-string v1, "RC4"

    const/4 v2, 0x7

    aput-object v1, v0, v2

    const-string v1, "DES"

    const/16 v2, 0x8

    aput-object v1, v0, v2

    const-string v1, "DESX"

    const/16 v2, 0x9

    aput-object v1, v0, v2

    const-string v1, "DES40"

    const/16 v2, 0xa

    aput-object v1, v0, v2

    const-string v1, "RC2"

    const/16 v2, 0xb

    aput-object v1, v0, v2

    const-string v1, "MD5"

    const/16 v2, 0xc

    aput-object v1, v0, v2

    const-string v1, "ANON"

    const/16 v2, 0xd

    aput-object v1, v0, v2

    const-string v1, "NULL"

    const/16 v2, 0xe

    aput-object v1, v0, v2

    const-string v1, "TLS_EMPTY_RENEGOTIATION_INFO_SCSV"

    const/16 v2, 0xf

    aput-object v1, v0, v2

    sput-object v0, Lo/ecm;->e:[Ljava/lang/String;

    .line 52
    const/4 v0, 0x0

    sput-object v0, Lo/ecm;->a:Lo/ecm;

    return-void
.end method

.method private constructor <init>(Ljava/security/KeyStore;Landroid/content/Context;)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/NoSuchAlgorithmException;,
            Ljava/security/KeyManagementException;,
            Ljava/security/KeyStoreException;,
            Ljava/security/UnrecoverableKeyException;,
            Ljava/security/cert/CertificateException;,
            Ljava/io/IOException;,
            Ljava/lang/IllegalAccessException;
        }
    .end annotation

    .line 76
    invoke-direct {p0, p1}, Lorg/apache/http/conn/ssl/SSLSocketFactory;-><init>(Ljava/security/KeyStore;)V

    .line 77
    iput-object p2, p0, Lo/ecm;->i:Landroid/content/Context;

    .line 78
    const-string v0, "TLS"

    invoke-static {v0}, Ljavax/net/ssl/SSLContext;->getInstance(Ljava/lang/String;)Ljavax/net/ssl/SSLContext;

    move-result-object v0

    iput-object v0, p0, Lo/ecm;->b:Ljavax/net/ssl/SSLContext;

    .line 79
    new-instance v4, Lo/ecu;

    iget-object v0, p0, Lo/ecm;->i:Landroid/content/Context;

    invoke-direct {v4, v0}, Lo/ecu;-><init>(Landroid/content/Context;)V

    .line 80
    iget-object v0, p0, Lo/ecm;->b:Ljavax/net/ssl/SSLContext;

    const/4 v1, 0x1

    new-array v1, v1, [Ljavax/net/ssl/X509TrustManager;

    const/4 v2, 0x0

    aput-object v4, v1, v2

    new-instance v2, Ljava/security/SecureRandom;

    invoke-direct {v2}, Ljava/security/SecureRandom;-><init>()V

    const/4 v3, 0x0

    invoke-virtual {v0, v3, v1, v2}, Ljavax/net/ssl/SSLContext;->init([Ljavax/net/ssl/KeyManager;[Ljavax/net/ssl/TrustManager;Ljava/security/SecureRandom;)V

    .line 81
    return-void
.end method

.method private b(Ljavax/net/ssl/SSLSocket;)V
    .locals 3

    .line 193
    if-eqz p1, :cond_0

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x10

    if-lt v0, v1, :cond_0

    .line 194
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "TLSv1.1"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "TLSv1.2"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    invoke-virtual {p1, v0}, Ljavax/net/ssl/SSLSocket;->setEnabledProtocols([Ljava/lang/String;)V

    .line 196
    :cond_0
    return-void
.end method

.method private c(Ljava/net/Socket;)V
    .locals 1

    .line 183
    if-eqz p1, :cond_0

    instance-of v0, p1, Ljavax/net/ssl/SSLSocket;

    if-eqz v0, :cond_0

    .line 184
    move-object v0, p1

    check-cast v0, Ljavax/net/ssl/SSLSocket;

    invoke-direct {p0, v0}, Lo/ecm;->b(Ljavax/net/ssl/SSLSocket;)V

    .line 185
    move-object v0, p1

    check-cast v0, Ljavax/net/ssl/SSLSocket;

    invoke-static {v0}, Lo/ecm;->e(Ljavax/net/ssl/SSLSocket;)V

    .line 187
    :cond_0
    return-void
.end method

.method public static d(Ljava/security/KeyStore;Landroid/content/Context;)Lo/ecm;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/NoSuchAlgorithmException;,
            Ljava/security/KeyManagementException;,
            Ljava/security/KeyStoreException;,
            Ljava/security/UnrecoverableKeyException;,
            Ljava/security/cert/CertificateException;,
            Ljava/io/IOException;,
            Ljava/lang/IllegalAccessException;
        }
    .end annotation

    .line 118
    sget-object v0, Lo/ecm;->a:Lo/ecm;

    if-nez v0, :cond_1

    .line 119
    const-class v1, Lo/ecm;

    monitor-enter v1

    .line 120
    :try_start_0
    sget-object v0, Lo/ecm;->a:Lo/ecm;

    if-nez v0, :cond_0

    .line 121
    new-instance v0, Lo/ecm;

    invoke-direct {v0, p0, p1}, Lo/ecm;-><init>(Ljava/security/KeyStore;Landroid/content/Context;)V

    sput-object v0, Lo/ecm;->a:Lo/ecm;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 123
    :cond_0
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2

    .line 125
    :cond_1
    :goto_0
    sget-object v0, Lo/ecm;->a:Lo/ecm;

    return-object v0
.end method

.method private static e(Ljavax/net/ssl/SSLSocket;)V
    .locals 13

    .line 134
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 135
    return-void

    .line 138
    :cond_0
    invoke-virtual {p0}, Ljavax/net/ssl/SSLSocket;->getEnabledCipherSuites()[Ljava/lang/String;

    move-result-object v1

    .line 139
    const/4 v0, 0x0

    if-eq v0, v1, :cond_1

    array-length v0, v1

    if-nez v0, :cond_2

    .line 140
    :cond_1
    return-void

    .line 142
    :cond_2
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 143
    const-string v3, ""

    .line 144
    move-object v4, v1

    array-length v5, v4

    const/4 v6, 0x0

    :goto_0
    if-ge v6, v5, :cond_6

    aget-object v7, v4, v6

    .line 145
    const/4 v8, 0x0

    .line 146
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {v7, v0}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v3

    .line 150
    sget-object v9, Lo/ecm;->e:[Ljava/lang/String;

    array-length v10, v9

    const/4 v11, 0x0

    :goto_1
    if-ge v11, v10, :cond_4

    aget-object v12, v9, v11

    .line 151
    invoke-virtual {v3, v12}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 152
    const/4 v8, 0x1

    .line 153
    goto :goto_2

    .line 150
    :cond_3
    add-int/lit8 v11, v11, 0x1

    goto :goto_1

    .line 156
    :cond_4
    :goto_2
    if-nez v8, :cond_5

    .line 157
    invoke-interface {v2, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 144
    :cond_5
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 161
    :cond_6
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v0

    new-array v0, v0, [Ljava/lang/String;

    invoke-interface {v2, v0}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, [Ljava/lang/String;

    .line 162
    invoke-virtual {p0, v4}, Ljavax/net/ssl/SSLSocket;->setEnabledCipherSuites([Ljava/lang/String;)V

    .line 163
    return-void
.end method


# virtual methods
.method public createSocket()Ljava/net/Socket;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 174
    iget-object v0, p0, Lo/ecm;->b:Ljavax/net/ssl/SSLContext;

    invoke-virtual {v0}, Ljavax/net/ssl/SSLContext;->getSocketFactory()Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v0

    invoke-virtual {v0}, Ljavax/net/ssl/SSLSocketFactory;->createSocket()Ljava/net/Socket;

    move-result-object v1

    .line 175
    invoke-direct {p0, v1}, Lo/ecm;->c(Ljava/net/Socket;)V

    .line 176
    return-object v1
.end method

.method public createSocket(Ljava/net/Socket;Ljava/lang/String;IZ)Ljava/net/Socket;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 167
    iget-object v0, p0, Lo/ecm;->b:Ljavax/net/ssl/SSLContext;

    invoke-virtual {v0}, Ljavax/net/ssl/SSLContext;->getSocketFactory()Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3, p4}, Ljavax/net/ssl/SSLSocketFactory;->createSocket(Ljava/net/Socket;Ljava/lang/String;IZ)Ljava/net/Socket;

    move-result-object v1

    .line 168
    invoke-direct {p0, v1}, Lo/ecm;->c(Ljava/net/Socket;)V

    .line 169
    return-object v1
.end method
