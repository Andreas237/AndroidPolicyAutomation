.class public Lo/zy;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b(Ljavax/net/ssl/HttpsURLConnection;Landroid/content/Context;)V
    .locals 3

    .line 31
    :try_start_0
    invoke-static {p1}, Lo/zy;->c(Landroid/content/Context;)Lo/ecv;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljavax/net/ssl/HttpsURLConnection;->setSSLSocketFactory(Ljavax/net/ssl/SSLSocketFactory;)V

    .line 32
    sget-object v0, Lo/ecv;->e:Lorg/apache/http/conn/ssl/X509HostnameVerifier;

    invoke-virtual {p0, v0}, Ljavax/net/ssl/HttpsURLConnection;->setHostnameVerifier(Ljavax/net/ssl/HostnameVerifier;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/security/cert/CertificateException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/security/KeyStoreException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/security/UnrecoverableKeyException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/security/KeyManagementException; {:try_start_0 .. :try_end_0} :catch_5
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_6

    .line 33
    goto :goto_0

    :catch_0
    move-exception v2

    .line 34
    const-string v0, "IOException!"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/aap;->b(Ljava/lang/String;Z)V

    goto :goto_0

    .line 35
    :catch_1
    move-exception v2

    .line 36
    const-string v0, "NoSuchAlgorithmException!"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/aap;->b(Ljava/lang/String;Z)V

    goto :goto_0

    .line 37
    :catch_2
    move-exception v2

    .line 38
    const-string v0, "CertificateException!"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/aap;->b(Ljava/lang/String;Z)V

    goto :goto_0

    .line 39
    :catch_3
    move-exception v2

    .line 40
    const-string v0, "KeyStoreException!"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/aap;->b(Ljava/lang/String;Z)V

    goto :goto_0

    .line 41
    :catch_4
    move-exception v2

    .line 42
    const-string v0, "UnrecoverableKeyException!"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/aap;->b(Ljava/lang/String;Z)V

    goto :goto_0

    .line 43
    :catch_5
    move-exception v2

    .line 44
    const-string v0, "KeyManagementException!"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/aap;->b(Ljava/lang/String;Z)V

    goto :goto_0

    .line 45
    :catch_6
    move-exception v2

    .line 46
    const-string v0, "IllegalAccessException!"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/aap;->b(Ljava/lang/String;Z)V

    .line 48
    :goto_0
    return-void
.end method

.method private static c(Landroid/content/Context;)Lo/ecv;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/UnrecoverableKeyException;,
            Ljava/security/cert/CertificateException;,
            Ljava/security/NoSuchAlgorithmException;,
            Ljava/security/KeyStoreException;,
            Ljava/security/KeyManagementException;,
            Ljava/io/IOException;,
            Ljava/lang/IllegalAccessException;
        }
    .end annotation

    .line 54
    invoke-static {p0}, Lo/ecv;->e(Landroid/content/Context;)Lo/ecv;

    move-result-object v0

    return-object v0
.end method
