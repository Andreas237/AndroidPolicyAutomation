.class public Lcom/huawei/phoneserviceuni/common/b/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/phoneserviceuni/common/b/a$a;
    }
.end annotation


# static fields
.field private static final a:Ljava/lang/String; = "HttpsSetting"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()V
    .locals 4

    .line 42
    const/4 v2, 0x0

    .line 45
    :try_start_0
    new-instance v0, Lcom/huawei/phoneserviceuni/common/b/a$a;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lcom/huawei/phoneserviceuni/common/b/a$a;-><init>(Z)V
    :try_end_0
    .catch Ljava/security/KeyManagementException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/security/KeyStoreException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/security/UnrecoverableKeyException; {:try_start_0 .. :try_end_0} :catch_3

    move-object v2, v0

    .line 62
    goto :goto_0

    .line 47
    :catch_0
    move-exception v3

    .line 49
    const-string v0, "HttpsSetting"

    const-string v1, "SecureNetSSLSocketFactory KeyManagementException"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 62
    goto :goto_0

    .line 51
    :catch_1
    move-exception v3

    .line 53
    const-string v0, "HttpsSetting"

    const-string v1, "SecureNetSSLSocketFactory NoSuchAlgorithmException"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 62
    goto :goto_0

    .line 55
    :catch_2
    move-exception v3

    .line 57
    const-string v0, "HttpsSetting"

    const-string v1, "SecureNetSSLSocketFactory KeyStoreException"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 62
    goto :goto_0

    .line 59
    :catch_3
    move-exception v3

    .line 61
    const-string v0, "HttpsSetting"

    const-string v1, "SecureNetSSLSocketFactory UnrecoverableKeyException"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 64
    :goto_0
    if-eqz v2, :cond_0

    .line 66
    invoke-static {v2}, Ljavax/net/ssl/HttpsURLConnection;->setDefaultSSLSocketFactory(Ljavax/net/ssl/SSLSocketFactory;)V

    .line 70
    :cond_0
    :try_start_1
    sget-object v3, Lorg/apache/http/conn/ssl/SSLSocketFactory;->BROWSER_COMPATIBLE_HOSTNAME_VERIFIER:Lorg/apache/http/conn/ssl/X509HostnameVerifier;

    .line 71
    invoke-static {v3}, Ljavax/net/ssl/HttpsURLConnection;->setDefaultHostnameVerifier(Ljavax/net/ssl/HostnameVerifier;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_4

    .line 76
    goto :goto_1

    .line 73
    :catch_4
    move-exception v3

    .line 75
    const-string v0, "HttpsSetting"

    const-string v1, "Fail to set DefaultHostnameVerifier!"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 77
    :goto_1
    return-void
.end method

.method public static b()Lorg/apache/http/conn/ssl/X509HostnameVerifier;
    .locals 1

    .line 85
    sget-object v0, Lorg/apache/http/conn/ssl/SSLSocketFactory;->BROWSER_COMPATIBLE_HOSTNAME_VERIFIER:Lorg/apache/http/conn/ssl/X509HostnameVerifier;

    return-object v0
.end method

.method public static c()[Ljavax/net/ssl/TrustManager;
    .locals 1

    .line 93
    const/4 v0, 0x0

    new-array v0, v0, [Ljavax/net/ssl/TrustManager;

    return-object v0
.end method
