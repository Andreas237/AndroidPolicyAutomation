.class public Lcom/huawei/hwid/core/b/b/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljavax/net/ssl/X509TrustManager;


# instance fields
.field protected a:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Ljavax/net/ssl/X509TrustManager;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 9

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/hwid/core/b/b/a;->a:Ljava/util/ArrayList;

    .line 36
    const/4 v2, 0x0

    .line 38
    const-string v0, "AccountX509TrustManager"

    const-string v1, "new AccountX509TrustManager start"

    :try_start_0
    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 40
    const-string v0, "X509"

    invoke-static {v0}, Ljavax/net/ssl/TrustManagerFactory;->getInstance(Ljava/lang/String;)Ljavax/net/ssl/TrustManagerFactory;

    move-result-object v3

    .line 43
    const-string v0, "bks"

    invoke-static {v0}, Ljava/security/KeyStore;->getInstance(Ljava/lang/String;)Ljava/security/KeyStore;

    move-result-object v4

    .line 44
    invoke-virtual {p1}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0

    const-string v1, "hicloudroot.bks"

    invoke-virtual {v0, v1}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v0

    move-object v2, v0

    .line 45
    invoke-virtual {v2}, Ljava/io/InputStream;->reset()V

    .line 46
    const-string v0, ""

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    invoke-virtual {v4, v2, v0}, Ljava/security/KeyStore;->load(Ljava/io/InputStream;[C)V

    .line 47
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V

    .line 48
    invoke-virtual {v3, v4}, Ljavax/net/ssl/TrustManagerFactory;->init(Ljava/security/KeyStore;)V

    .line 49
    invoke-virtual {v3}, Ljavax/net/ssl/TrustManagerFactory;->getTrustManagers()[Ljavax/net/ssl/TrustManager;

    move-result-object v5

    .line 50
    const/4 v6, 0x0

    :goto_0
    array-length v0, v5

    if-ge v6, v0, :cond_1

    .line 51
    aget-object v0, v5, v6

    instance-of v0, v0, Ljavax/net/ssl/X509TrustManager;

    if-eqz v0, :cond_0

    .line 52
    iget-object v0, p0, Lcom/huawei/hwid/core/b/b/a;->a:Ljava/util/ArrayList;

    aget-object v1, v5, v6

    check-cast v1, Ljavax/net/ssl/X509TrustManager;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 50
    :cond_0
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 56
    :cond_1
    iget-object v0, p0, Lcom/huawei/hwid/core/b/b/a;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 59
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Couldn\'t find a X509TrustManager!"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 61
    :cond_2
    const-string v0, "AccountX509TrustManager"

    const-string v1, "new AccountX509TrustManager end"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/security/cert/CertificateException; {:try_start_0 .. :try_end_0} :catch_5
    .catch Ljava/security/KeyStoreException; {:try_start_0 .. :try_end_0} :catch_7
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 74
    const/4 v0, 0x0

    if-eq v0, v2, :cond_4

    .line 76
    :try_start_1
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 79
    goto/16 :goto_2

    .line 77
    :catch_0
    move-exception v3

    .line 78
    const-string v0, "AccountX509TrustManager"

    const-string v1, "IOException"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 79
    goto/16 :goto_2

    .line 62
    :catch_1
    move-exception v3

    .line 63
    const-string v0, "AccountX509TrustManager"

    const-string v1, "IOException / "

    :try_start_2
    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 74
    const/4 v0, 0x0

    if-eq v0, v2, :cond_4

    .line 76
    :try_start_3
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    .line 79
    goto/16 :goto_2

    .line 77
    :catch_2
    move-exception v3

    .line 78
    const-string v0, "AccountX509TrustManager"

    const-string v1, "IOException"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 79
    goto :goto_2

    .line 64
    :catch_3
    move-exception v3

    .line 65
    const-string v0, "AccountX509TrustManager"

    const-string v1, "NoSuchAlgorithmException / "

    :try_start_4
    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 74
    const/4 v0, 0x0

    if-eq v0, v2, :cond_4

    .line 76
    :try_start_5
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_4

    .line 79
    goto :goto_2

    .line 77
    :catch_4
    move-exception v3

    .line 78
    const-string v0, "AccountX509TrustManager"

    const-string v1, "IOException"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 79
    goto :goto_2

    .line 66
    :catch_5
    move-exception v3

    .line 67
    const-string v0, "AccountX509TrustManager"

    const-string v1, "CertificateException / "

    :try_start_6
    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 74
    const/4 v0, 0x0

    if-eq v0, v2, :cond_4

    .line 76
    :try_start_7
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_6

    .line 79
    goto :goto_2

    .line 77
    :catch_6
    move-exception v3

    .line 78
    const-string v0, "AccountX509TrustManager"

    const-string v1, "IOException"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 79
    goto :goto_2

    .line 71
    :catch_7
    move-exception v3

    .line 72
    const-string v0, "AccountX509TrustManager"

    const-string v1, "KeyStoreException / "

    :try_start_8
    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 74
    const/4 v0, 0x0

    if-eq v0, v2, :cond_4

    .line 76
    :try_start_9
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_8

    .line 79
    goto :goto_2

    .line 77
    :catch_8
    move-exception v3

    .line 78
    const-string v0, "AccountX509TrustManager"

    const-string v1, "IOException"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 79
    goto :goto_2

    .line 74
    :catchall_0
    move-exception v7

    const/4 v0, 0x0

    if-eq v0, v2, :cond_3

    .line 76
    :try_start_a
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_a
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_9

    .line 79
    goto :goto_1

    .line 77
    :catch_9
    move-exception v8

    .line 78
    const-string v0, "AccountX509TrustManager"

    const-string v1, "IOException"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 79
    :cond_3
    :goto_1
    throw v7

    .line 88
    :cond_4
    :goto_2
    return-void
.end method


# virtual methods
.method public checkClientTrusted([Ljava/security/cert/X509Certificate;Ljava/lang/String;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/cert/CertificateException;
        }
    .end annotation

    .line 95
    const-string v0, "AccountX509TrustManager"

    const-string v1, "checkClientTrusted start"

    :try_start_0
    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 96
    iget-object v0, p0, Lcom/huawei/hwid/core/b/b/a;->a:Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljavax/net/ssl/X509TrustManager;

    .line 97
    invoke-interface {v2, p1, p2}, Ljavax/net/ssl/X509TrustManager;->checkClientTrusted([Ljava/security/cert/X509Certificate;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/security/cert/CertificateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 101
    goto :goto_0

    .line 98
    :catch_0
    move-exception v2

    .line 100
    const-string v0, "AccountX509TrustManager"

    const-string v1, "CertificateException:"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 102
    :goto_0
    return-void
.end method

.method public checkServerTrusted([Ljava/security/cert/X509Certificate;Ljava/lang/String;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/cert/CertificateException;
        }
    .end annotation

    .line 110
    iget-object v0, p0, Lcom/huawei/hwid/core/b/b/a;->a:Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljavax/net/ssl/X509TrustManager;

    .line 111
    invoke-interface {v2, p1, p2}, Ljavax/net/ssl/X509TrustManager;->checkServerTrusted([Ljava/security/cert/X509Certificate;Ljava/lang/String;)V

    .line 112
    const-string v0, "AccountX509TrustManager"

    const-string v1, "checkServerTrusted end "

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 113
    return-void
.end method

.method public getAcceptedIssuers()[Ljava/security/cert/X509Certificate;
    .locals 5

    .line 120
    const-string v0, "AccountX509TrustManager"

    const-string v1, "getAcceptedIssuers start"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 124
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 125
    iget-object v0, p0, Lcom/huawei/hwid/core/b/b/a;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljavax/net/ssl/X509TrustManager;

    .line 126
    invoke-interface {v4}, Ljavax/net/ssl/X509TrustManager;->getAcceptedIssuers()[Ljava/security/cert/X509Certificate;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 127
    goto :goto_0

    .line 128
    :cond_0
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v0

    new-array v0, v0, [Ljava/security/cert/X509Certificate;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/security/cert/X509Certificate;

    return-object v0
.end method
