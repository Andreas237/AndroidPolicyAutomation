.class public Lcom/twitter/sdk/android/core/DefaultClient;
.super Ljava/lang/Object;
.source "DefaultClient.java"

# interfaces
.implements Lretrofit/client/Client;


# instance fields
.field final sslSocketFactory:Ljavax/net/ssl/SSLSocketFactory;

.field final wrappedClient:Lretrofit/client/Client;


# direct methods
.method public constructor <init>(Ljavax/net/ssl/SSLSocketFactory;)V
    .locals 0

    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 45
    iput-object p1, p0, Lcom/twitter/sdk/android/core/DefaultClient;->sslSocketFactory:Ljavax/net/ssl/SSLSocketFactory;

    .line 46
    invoke-direct {p0}, Lcom/twitter/sdk/android/core/DefaultClient;->hasOkHttpOnClasspath()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 47
    new-instance p1, Lcom/twitter/sdk/android/core/DefaultClient$1;

    invoke-direct {p1, p0}, Lcom/twitter/sdk/android/core/DefaultClient$1;-><init>(Lcom/twitter/sdk/android/core/DefaultClient;)V

    iput-object p1, p0, Lcom/twitter/sdk/android/core/DefaultClient;->wrappedClient:Lretrofit/client/Client;

    goto :goto_0

    .line 54
    :cond_0
    new-instance p1, Lcom/twitter/sdk/android/core/DefaultClient$2;

    invoke-direct {p1, p0}, Lcom/twitter/sdk/android/core/DefaultClient$2;-><init>(Lcom/twitter/sdk/android/core/DefaultClient;)V

    iput-object p1, p0, Lcom/twitter/sdk/android/core/DefaultClient;->wrappedClient:Lretrofit/client/Client;

    :goto_0
    return-void
.end method

.method private hasOkHttpOnClasspath()Z
    .locals 4

    const/4 v0, 0x1

    const/4 v1, 0x0

    :try_start_0
    const-string v2, "com.squareup.okhttp.OkUrlFactory"

    .line 73
    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v2, 0x1

    goto :goto_0

    :catch_0
    const/4 v2, 0x0

    :goto_0
    :try_start_1
    const-string v3, "com.squareup.okhttp.OkHttpClient"

    .line 80
    invoke-static {v3}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;
    :try_end_1
    .catch Ljava/lang/ClassNotFoundException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    const/4 v0, 0x0

    :goto_1
    if-eq v0, v2, :cond_0

    .line 86
    invoke-static {}, Lio/fabric/sdk/android/Fabric;->getLogger()Lio/fabric/sdk/android/Logger;

    move-result-object v0

    const-string v2, "Twitter"

    const-string v3, "Retrofit detected an unsupported OkHttp on the classpath.\nTo use OkHttp with this version of Retrofit, you\'ll need:\n1. com.squareup.okhttp:okhttp:1.6.0 (or newer)\n2. com.squareup.okhttp:okhttp-urlconnection:1.6.0 (or newer)\nNote that OkHttp 2.0.0+ is supported!"

    invoke-interface {v0, v2, v3}, Lio/fabric/sdk/android/Logger;->d(Ljava/lang/String;Ljava/lang/String;)V

    return v1

    :cond_0
    return v0
.end method


# virtual methods
.method public execute(Lretrofit/client/Request;)Lretrofit/client/Response;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 65
    iget-object v0, p0, Lcom/twitter/sdk/android/core/DefaultClient;->wrappedClient:Lretrofit/client/Client;

    invoke-interface {v0, p1}, Lretrofit/client/Client;->execute(Lretrofit/client/Request;)Lretrofit/client/Response;

    move-result-object p1

    return-object p1
.end method

.method openSslConnection(Ljava/net/HttpURLConnection;)Ljava/net/HttpURLConnection;
    .locals 2

    .line 99
    iget-object v0, p0, Lcom/twitter/sdk/android/core/DefaultClient;->sslSocketFactory:Ljavax/net/ssl/SSLSocketFactory;

    if-eqz v0, :cond_0

    instance-of v1, p1, Ljavax/net/ssl/HttpsURLConnection;

    if-eqz v1, :cond_0

    .line 100
    move-object v1, p1

    check-cast v1, Ljavax/net/ssl/HttpsURLConnection;

    invoke-virtual {v1, v0}, Ljavax/net/ssl/HttpsURLConnection;->setSSLSocketFactory(Ljavax/net/ssl/SSLSocketFactory;)V

    :cond_0
    return-object p1
.end method
