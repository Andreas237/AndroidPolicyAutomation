.class public Lcom/huawei/wallet/utils/WalletSSLSocketFactory;
.super Ljavax/net/ssl/SSLSocketFactory;
.source "SourceFile"


# static fields
.field private static c:[Ljava/lang/String;


# instance fields
.field private a:Ljavax/net/ssl/SSLContext;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 36
    const/4 v0, 0x0

    sput-object v0, Lcom/huawei/wallet/utils/WalletSSLSocketFactory;->c:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljavax/net/ssl/X509TrustManager;)V
    .locals 4

    .line 47
    invoke-direct {p0}, Ljavax/net/ssl/SSLSocketFactory;-><init>()V

    .line 38
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/wallet/utils/WalletSSLSocketFactory;->a:Ljavax/net/ssl/SSLContext;

    .line 51
    const-string v0, "TLS"

    :try_start_0
    invoke-static {v0}, Ljavax/net/ssl/SSLContext;->getInstance(Ljava/lang/String;)Ljavax/net/ssl/SSLContext;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/wallet/utils/WalletSSLSocketFactory;->a:Ljavax/net/ssl/SSLContext;

    .line 52
    const/4 v0, 0x1

    new-array v3, v0, [Ljavax/net/ssl/X509TrustManager;

    const/4 v0, 0x0

    aput-object p1, v3, v0

    .line 55
    iget-object v0, p0, Lcom/huawei/wallet/utils/WalletSSLSocketFactory;->a:Ljavax/net/ssl/SSLContext;

    new-instance v1, Ljava/security/SecureRandom;

    invoke-direct {v1}, Ljava/security/SecureRandom;-><init>()V

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v3, v1}, Ljavax/net/ssl/SSLContext;->init([Ljavax/net/ssl/KeyManager;[Ljavax/net/ssl/TrustManager;Ljava/security/SecureRandom;)V
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/security/KeyManagementException; {:try_start_0 .. :try_end_0} :catch_1

    .line 65
    goto :goto_0

    .line 58
    :catch_0
    move-exception v3

    .line 60
    const-string v0, "SSLContext init exception"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->e(Ljava/lang/String;Z)V

    .line 65
    goto :goto_0

    .line 62
    :catch_1
    move-exception v3

    .line 64
    const-string v0, "SSLContext init exception"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->e(Ljava/lang/String;Z)V

    .line 66
    :goto_0
    return-void
.end method

.method private static a(Ljavax/net/ssl/SSLSocket;)V
    .locals 8

    .line 95
    invoke-virtual {p0}, Ljavax/net/ssl/SSLSocket;->getEnabledCipherSuites()[Ljava/lang/String;

    move-result-object v1

    .line 97
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 98
    const-string v3, ""

    .line 99
    move-object v4, v1

    array-length v5, v4

    const/4 v6, 0x0

    :goto_0
    if-ge v6, v5, :cond_2

    aget-object v7, v4, v6

    .line 101
    sget-object v0, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-virtual {v7, v0}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v3

    .line 103
    const-string v0, "RC4"

    invoke-virtual {v3, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "DES"

    invoke-virtual {v3, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "MD5"

    .line 104
    invoke-virtual {v3, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "ANON"

    invoke-virtual {v3, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "NULL"

    .line 105
    invoke-virtual {v3, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "TLS_EMPTY_RENEGOTIATION_INFO_SCSV"

    .line 106
    invoke-virtual {v3, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 108
    goto :goto_1

    .line 110
    :cond_0
    invoke-interface {v2, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 99
    :cond_1
    :goto_1
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 114
    :cond_2
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v0

    new-array v0, v0, [Ljava/lang/String;

    invoke-interface {v2, v0}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    sput-object v0, Lcom/huawei/wallet/utils/WalletSSLSocketFactory;->c:[Ljava/lang/String;

    .line 115
    sget-object v0, Lcom/huawei/wallet/utils/WalletSSLSocketFactory;->c:[Ljava/lang/String;

    invoke-virtual {p0, v0}, Ljavax/net/ssl/SSLSocket;->setEnabledCipherSuites([Ljava/lang/String;)V

    .line 116
    return-void
.end method


# virtual methods
.method public createSocket(Ljava/lang/String;I)Ljava/net/Socket;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 145
    iget-object v0, p0, Lcom/huawei/wallet/utils/WalletSSLSocketFactory;->a:Ljavax/net/ssl/SSLContext;

    invoke-virtual {v0}, Ljavax/net/ssl/SSLContext;->getSocketFactory()Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Ljavax/net/ssl/SSLSocketFactory;->createSocket(Ljava/lang/String;I)Ljava/net/Socket;

    move-result-object v1

    .line 147
    if-eqz v1, :cond_0

    instance-of v0, v1, Ljavax/net/ssl/SSLSocket;

    if-eqz v0, :cond_0

    .line 149
    move-object v2, v1

    check-cast v2, Ljavax/net/ssl/SSLSocket;

    .line 150
    invoke-static {v2}, Lcom/huawei/wallet/utils/WalletSSLSocketFactory;->a(Ljavax/net/ssl/SSLSocket;)V

    .line 151
    return-object v2

    .line 155
    :cond_0
    return-object v1
.end method

.method public createSocket(Ljava/lang/String;ILjava/net/InetAddress;I)Ljava/net/Socket;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 185
    iget-object v0, p0, Lcom/huawei/wallet/utils/WalletSSLSocketFactory;->a:Ljavax/net/ssl/SSLContext;

    invoke-virtual {v0}, Ljavax/net/ssl/SSLContext;->getSocketFactory()Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3, p4}, Ljavax/net/ssl/SSLSocketFactory;->createSocket(Ljava/lang/String;ILjava/net/InetAddress;I)Ljava/net/Socket;

    move-result-object v1

    .line 187
    if-eqz v1, :cond_0

    instance-of v0, v1, Ljavax/net/ssl/SSLSocket;

    if-eqz v0, :cond_0

    .line 189
    move-object v2, v1

    check-cast v2, Ljavax/net/ssl/SSLSocket;

    .line 190
    invoke-static {v2}, Lcom/huawei/wallet/utils/WalletSSLSocketFactory;->a(Ljavax/net/ssl/SSLSocket;)V

    .line 191
    return-object v2

    .line 195
    :cond_0
    return-object v1
.end method

.method public createSocket(Ljava/net/InetAddress;I)Ljava/net/Socket;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 165
    iget-object v0, p0, Lcom/huawei/wallet/utils/WalletSSLSocketFactory;->a:Ljavax/net/ssl/SSLContext;

    invoke-virtual {v0}, Ljavax/net/ssl/SSLContext;->getSocketFactory()Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Ljavax/net/ssl/SSLSocketFactory;->createSocket(Ljava/net/InetAddress;I)Ljava/net/Socket;

    move-result-object v1

    .line 167
    if-eqz v1, :cond_0

    instance-of v0, v1, Ljavax/net/ssl/SSLSocket;

    if-eqz v0, :cond_0

    .line 169
    move-object v2, v1

    check-cast v2, Ljavax/net/ssl/SSLSocket;

    .line 170
    invoke-static {v2}, Lcom/huawei/wallet/utils/WalletSSLSocketFactory;->a(Ljavax/net/ssl/SSLSocket;)V

    .line 171
    return-object v2

    .line 175
    :cond_0
    return-object v1
.end method

.method public createSocket(Ljava/net/InetAddress;ILjava/net/InetAddress;I)Ljava/net/Socket;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 205
    iget-object v0, p0, Lcom/huawei/wallet/utils/WalletSSLSocketFactory;->a:Ljavax/net/ssl/SSLContext;

    invoke-virtual {v0}, Ljavax/net/ssl/SSLContext;->getSocketFactory()Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3, p4}, Ljavax/net/ssl/SSLSocketFactory;->createSocket(Ljava/net/InetAddress;ILjava/net/InetAddress;I)Ljava/net/Socket;

    move-result-object v1

    .line 207
    if-eqz v1, :cond_0

    instance-of v0, v1, Ljavax/net/ssl/SSLSocket;

    if-eqz v0, :cond_0

    .line 209
    move-object v2, v1

    check-cast v2, Ljavax/net/ssl/SSLSocket;

    .line 210
    invoke-static {v2}, Lcom/huawei/wallet/utils/WalletSSLSocketFactory;->a(Ljavax/net/ssl/SSLSocket;)V

    .line 211
    return-object v2

    .line 215
    :cond_0
    return-object v1
.end method

.method public createSocket(Ljava/net/Socket;Ljava/lang/String;IZ)Ljava/net/Socket;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 74
    iget-object v0, p0, Lcom/huawei/wallet/utils/WalletSSLSocketFactory;->a:Ljavax/net/ssl/SSLContext;

    invoke-virtual {v0}, Ljavax/net/ssl/SSLContext;->getSocketFactory()Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3, p4}, Ljavax/net/ssl/SSLSocketFactory;->createSocket(Ljava/net/Socket;Ljava/lang/String;IZ)Ljava/net/Socket;

    move-result-object v1

    .line 76
    if-eqz v1, :cond_0

    instance-of v0, v1, Ljavax/net/ssl/SSLSocket;

    if-eqz v0, :cond_0

    .line 78
    move-object v2, v1

    check-cast v2, Ljavax/net/ssl/SSLSocket;

    .line 79
    invoke-static {v2}, Lcom/huawei/wallet/utils/WalletSSLSocketFactory;->a(Ljavax/net/ssl/SSLSocket;)V

    .line 80
    return-object v2

    .line 84
    :cond_0
    return-object v1
.end method

.method public getDefaultCipherSuites()[Ljava/lang/String;
    .locals 1

    .line 124
    sget-object v0, Lcom/huawei/wallet/utils/WalletSSLSocketFactory;->c:[Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 127
    sget-object v0, Lcom/huawei/wallet/utils/WalletSSLSocketFactory;->c:[Ljava/lang/String;

    invoke-virtual {v0}, [Ljava/lang/String;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    return-object v0

    .line 129
    :cond_0
    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/String;

    return-object v0
.end method

.method public getSupportedCipherSuites()[Ljava/lang/String;
    .locals 1

    .line 136
    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/String;

    return-object v0
.end method
