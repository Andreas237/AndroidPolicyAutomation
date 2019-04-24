.class public Lcom/huawei/logupload/c/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/logupload/c/f$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()V
    .locals 5

    .line 23
    const/4 v0, 0x1

    new-array v2, v0, [Ljavax/net/ssl/TrustManager;

    .line 24
    new-instance v3, Lcom/huawei/logupload/c/f$a;

    invoke-direct {v3}, Lcom/huawei/logupload/c/f$a;-><init>()V

    .line 25
    const/4 v0, 0x0

    aput-object v3, v2, v0

    .line 26
    const-string v0, "SSL"

    invoke-static {v0}, Ljavax/net/ssl/SSLContext;->getInstance(Ljava/lang/String;)Ljavax/net/ssl/SSLContext;

    move-result-object v4

    .line 27
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v2, v1}, Ljavax/net/ssl/SSLContext;->init([Ljavax/net/ssl/KeyManager;[Ljavax/net/ssl/TrustManager;Ljava/security/SecureRandom;)V

    .line 28
    invoke-virtual {v4}, Ljavax/net/ssl/SSLContext;->getSocketFactory()Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v0

    invoke-static {v0}, Ljavax/net/ssl/HttpsURLConnection;->setDefaultSSLSocketFactory(Ljavax/net/ssl/SSLSocketFactory;)V

    .line 29
    return-void
.end method
