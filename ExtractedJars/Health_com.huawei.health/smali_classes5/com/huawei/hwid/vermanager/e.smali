.class final Lcom/huawei/hwid/vermanager/e;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Ljavax/net/ssl/HttpsURLConnection;)V
    .locals 2

    .line 34
    invoke-static {}, Lcom/huawei/hwid/vermanager/f;->a()Ljavax/net/SocketFactory;

    move-result-object v1

    .line 36
    instance-of v0, v1, Ljavax/net/ssl/SSLSocketFactory;

    if-eqz v0, :cond_0

    .line 37
    move-object v0, v1

    check-cast v0, Ljavax/net/ssl/SSLSocketFactory;

    invoke-virtual {p0, v0}, Ljavax/net/ssl/HttpsURLConnection;->setSSLSocketFactory(Ljavax/net/ssl/SSLSocketFactory;)V

    .line 39
    :cond_0
    return-void
.end method
