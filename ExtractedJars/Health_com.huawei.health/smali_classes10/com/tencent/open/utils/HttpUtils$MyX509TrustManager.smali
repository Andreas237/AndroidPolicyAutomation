.class public Lcom/tencent/open/utils/HttpUtils$MyX509TrustManager;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljavax/net/ssl/X509TrustManager;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/open/utils/HttpUtils;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "MyX509TrustManager"
.end annotation


# instance fields
.field a:Ljavax/net/ssl/X509TrustManager;


# direct methods
.method constructor <init>()V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1026
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1028
    const/4 v2, 0x0

    .line 1030
    const-string v0, "JKS"

    :try_start_0
    invoke-static {v0}, Ljava/security/KeyStore;->getInstance(Ljava/lang/String;)Ljava/security/KeyStore;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v2, v0

    .line 1033
    goto :goto_0

    .line 1031
    :catch_0
    move-exception v3

    .line 1034
    :goto_0
    const/4 v0, 0x0

    new-array v3, v0, [Ljavax/net/ssl/TrustManager;

    .line 1035
    if-eqz v2, :cond_2

    .line 1036
    const/4 v4, 0x0

    .line 1038
    :try_start_1
    new-instance v0, Ljava/io/FileInputStream;

    const-string v1, "trustedCerts"

    invoke-direct {v0, v1}, Ljava/io/FileInputStream;-><init>(Ljava/lang/String;)V

    move-object v4, v0

    .line 1039
    const-string v0, "passphrase"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    invoke-virtual {v2, v4, v0}, Ljava/security/KeyStore;->load(Ljava/io/InputStream;[C)V

    .line 1040
    const-string v0, "SunX509"

    const-string v1, "SunJSSE"

    invoke-static {v0, v1}, Ljavax/net/ssl/TrustManagerFactory;->getInstance(Ljava/lang/String;Ljava/lang/String;)Ljavax/net/ssl/TrustManagerFactory;

    move-result-object v5

    .line 1041
    invoke-virtual {v5, v2}, Ljavax/net/ssl/TrustManagerFactory;->init(Ljava/security/KeyStore;)V

    .line 1042
    invoke-virtual {v5}, Ljavax/net/ssl/TrustManagerFactory;->getTrustManagers()[Ljavax/net/ssl/TrustManager;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-object v3

    .line 1044
    if-eqz v4, :cond_0

    .line 1045
    invoke-virtual {v4}, Ljava/io/FileInputStream;->close()V

    .line 1047
    :cond_0
    const/4 v4, 0x0

    .line 1048
    goto :goto_1

    .line 1044
    :catchall_0
    move-exception v6

    if-eqz v4, :cond_1

    .line 1045
    invoke-virtual {v4}, Ljava/io/FileInputStream;->close()V

    .line 1047
    :cond_1
    const/4 v4, 0x0

    throw v6

    .line 1049
    :goto_1
    goto :goto_2

    .line 1050
    :cond_2
    invoke-static {}, Ljavax/net/ssl/TrustManagerFactory;->getDefaultAlgorithm()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljavax/net/ssl/TrustManagerFactory;->getInstance(Ljava/lang/String;)Ljavax/net/ssl/TrustManagerFactory;

    move-result-object v4

    .line 1052
    const/4 v0, 0x0

    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Ljavax/net/ssl/TrustManagerFactory;->init(Ljava/security/KeyStore;)V

    .line 1053
    invoke-virtual {v4}, Ljavax/net/ssl/TrustManagerFactory;->getTrustManagers()[Ljavax/net/ssl/TrustManager;

    move-result-object v3

    .line 1056
    :goto_2
    const/4 v4, 0x0

    :goto_3
    array-length v0, v3

    if-ge v4, v0, :cond_4

    .line 1057
    aget-object v0, v3, v4

    instance-of v0, v0, Ljavax/net/ssl/X509TrustManager;

    if-eqz v0, :cond_3

    .line 1058
    aget-object v0, v3, v4

    check-cast v0, Ljavax/net/ssl/X509TrustManager;

    iput-object v0, p0, Lcom/tencent/open/utils/HttpUtils$MyX509TrustManager;->a:Ljavax/net/ssl/X509TrustManager;

    .line 1059
    return-void

    .line 1056
    :cond_3
    add-int/lit8 v4, v4, 0x1

    goto :goto_3

    .line 1062
    :cond_4
    new-instance v0, Ljava/lang/Exception;

    const-string v1, "Couldn\'t initialize"

    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public checkClientTrusted([Ljava/security/cert/X509Certificate;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/cert/CertificateException;
        }
    .end annotation

    .line 1068
    iget-object v0, p0, Lcom/tencent/open/utils/HttpUtils$MyX509TrustManager;->a:Ljavax/net/ssl/X509TrustManager;

    invoke-interface {v0, p1, p2}, Ljavax/net/ssl/X509TrustManager;->checkClientTrusted([Ljava/security/cert/X509Certificate;Ljava/lang/String;)V

    .line 1069
    return-void
.end method

.method public checkServerTrusted([Ljava/security/cert/X509Certificate;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/cert/CertificateException;
        }
    .end annotation

    .line 1074
    iget-object v0, p0, Lcom/tencent/open/utils/HttpUtils$MyX509TrustManager;->a:Ljavax/net/ssl/X509TrustManager;

    invoke-interface {v0, p1, p2}, Ljavax/net/ssl/X509TrustManager;->checkServerTrusted([Ljava/security/cert/X509Certificate;Ljava/lang/String;)V

    .line 1075
    return-void
.end method

.method public getAcceptedIssuers()[Ljava/security/cert/X509Certificate;
    .locals 1

    .line 1079
    iget-object v0, p0, Lcom/tencent/open/utils/HttpUtils$MyX509TrustManager;->a:Ljavax/net/ssl/X509TrustManager;

    invoke-interface {v0}, Ljavax/net/ssl/X509TrustManager;->getAcceptedIssuers()[Ljava/security/cert/X509Certificate;

    move-result-object v0

    return-object v0
.end method
