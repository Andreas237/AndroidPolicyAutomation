.class final Lcom/huawei/hms/update/b/c;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Ljavax/net/ssl/HttpsURLConnection;)V
    .locals 2

    .line 33
    invoke-static {}, Lcom/huawei/hms/update/b/e;->a()Ljavax/net/SocketFactory;

    move-result-object v1

    .line 35
    instance-of v0, v1, Ljavax/net/ssl/SSLSocketFactory;

    if-eqz v0, :cond_0

    .line 36
    move-object v0, v1

    check-cast v0, Ljavax/net/ssl/SSLSocketFactory;

    invoke-virtual {p0, v0}, Ljavax/net/ssl/HttpsURLConnection;->setSSLSocketFactory(Ljavax/net/ssl/SSLSocketFactory;)V

    .line 38
    :cond_0
    return-void
.end method
