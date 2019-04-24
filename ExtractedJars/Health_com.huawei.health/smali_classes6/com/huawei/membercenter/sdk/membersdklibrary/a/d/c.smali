.class public final Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/c$a;
    }
.end annotation


# direct methods
.method public static a()V
    .locals 4

    .line 53
    const/4 v2, 0x0

    .line 55
    :try_start_0
    new-instance v0, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/c$a;

    invoke-direct {v0}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/c$a;-><init>()V
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    move-object v2, v0

    .line 60
    goto :goto_0

    .line 56
    :catch_0
    move-exception v3

    .line 57
    const-string v0, "HttpsUtils"

    const-string v1, "initHttpsConnection:: NoSuchAlgorithmException!"

    invoke-static {v0, v1}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/d;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 60
    goto :goto_0

    .line 58
    :catch_1
    move-exception v3

    .line 59
    const-string v0, "HttpsUtils"

    const-string v1, "initHttpsConnection:: exception"

    invoke-static {v0, v1}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/d;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 62
    :goto_0
    if-eqz v2, :cond_0

    .line 63
    invoke-static {v2}, Ljavax/net/ssl/HttpsURLConnection;->setDefaultSSLSocketFactory(Ljavax/net/ssl/SSLSocketFactory;)V

    .line 78
    :cond_0
    :try_start_1
    sget-object v3, Lorg/apache/http/conn/ssl/SSLSocketFactory;->BROWSER_COMPATIBLE_HOSTNAME_VERIFIER:Lorg/apache/http/conn/ssl/X509HostnameVerifier;

    .line 79
    invoke-static {v3}, Ljavax/net/ssl/HttpsURLConnection;->setDefaultHostnameVerifier(Ljavax/net/ssl/HostnameVerifier;)V
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_3

    .line 84
    goto :goto_1

    .line 80
    :catch_2
    move-exception v3

    .line 81
    const-string v0, "HttpsUtils"

    const-string v1, "initHttpsConnection:: IllegalArgumentException!"

    invoke-static {v0, v1}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/d;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 84
    goto :goto_1

    .line 82
    :catch_3
    move-exception v3

    .line 83
    const-string v0, "HttpsUtils"

    const-string v1, "Fail to set DefaultHostnameVerifier!"

    invoke-static {v0, v1}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/d;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 86
    :goto_1
    return-void
.end method
