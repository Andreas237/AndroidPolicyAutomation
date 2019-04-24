.class public abstract Lcom/huawei/openalliance/ad/net/http/HttpsConfig;
.super Ljava/lang/Object;


# annotations
.annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
.end annotation


# static fields
.field private static a:Ljavax/net/ssl/SSLSocketFactory;

.field private static b:Ljavax/net/ssl/X509TrustManager;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Lcom/huawei/okhttp3/OkHttpClient$Builder;)V
    .locals 12

    sget-object v2, Lcom/huawei/openalliance/ad/net/http/HttpsConfig;->a:Ljavax/net/ssl/SSLSocketFactory;

    sget-object v3, Lcom/huawei/openalliance/ad/net/http/HttpsConfig;->b:Ljavax/net/ssl/X509TrustManager;

    if-nez v2, :cond_0

    invoke-static {}, Lcom/huawei/openalliance/ad/net/http/h;->a()Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v2

    :cond_0
    if-nez v3, :cond_2

    invoke-static {}, Ljavax/net/ssl/TrustManagerFactory;->getDefaultAlgorithm()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljavax/net/ssl/TrustManagerFactory;->getInstance(Ljava/lang/String;)Ljavax/net/ssl/TrustManagerFactory;

    move-result-object v5

    invoke-static {}, Ljava/security/KeyStore;->getDefaultType()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ljava/security/KeyStore;->getInstance(Ljava/lang/String;)Ljava/security/KeyStore;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljavax/net/ssl/TrustManagerFactory;->init(Ljava/security/KeyStore;)V

    invoke-virtual {v5}, Ljavax/net/ssl/TrustManagerFactory;->getTrustManagers()[Ljavax/net/ssl/TrustManager;

    move-result-object v7

    move-object v8, v7

    array-length v9, v8

    const/4 v10, 0x0

    :goto_0
    if-ge v10, v9, :cond_2

    aget-object v11, v8, v10

    instance-of v0, v11, Ljavax/net/ssl/X509TrustManager;

    if-eqz v0, :cond_1

    move-object v3, v11

    check-cast v3, Ljavax/net/ssl/X509TrustManager;

    goto :goto_1

    :cond_1
    add-int/lit8 v10, v10, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    if-eqz v2, :cond_3

    if-eqz v3, :cond_3

    invoke-virtual {p0, v2, v3}, Lcom/huawei/okhttp3/OkHttpClient$Builder;->sslSocketFactory(Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/X509TrustManager;)Lcom/huawei/okhttp3/OkHttpClient$Builder;

    goto :goto_2

    :cond_3
    new-instance v0, Lcom/huawei/openalliance/ad/exception/c;

    const-string v1, "No ssl socket factory or trust manager set"

    invoke-direct {v0, v1}, Lcom/huawei/openalliance/ad/exception/c;-><init>(Ljava/lang/String;)V

    throw v0

    :goto_2
    return-void
.end method

.method public static a(Ljava/net/HttpURLConnection;)V
    .locals 4

    instance-of v0, p0, Ljavax/net/ssl/HttpsURLConnection;

    if-eqz v0, :cond_2

    move-object v2, p0

    check-cast v2, Ljavax/net/ssl/HttpsURLConnection;

    sget-object v3, Lcom/huawei/openalliance/ad/net/http/HttpsConfig;->a:Ljavax/net/ssl/SSLSocketFactory;

    if-nez v3, :cond_0

    invoke-static {}, Lcom/huawei/openalliance/ad/net/http/h;->a()Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v3

    :cond_0
    if-eqz v3, :cond_1

    invoke-virtual {v2, v3}, Ljavax/net/ssl/HttpsURLConnection;->setSSLSocketFactory(Ljavax/net/ssl/SSLSocketFactory;)V

    goto :goto_0

    :cond_1
    new-instance v0, Lcom/huawei/openalliance/ad/exception/c;

    const-string v1, "No ssl socket factory set"

    invoke-direct {v0, v1}, Lcom/huawei/openalliance/ad/exception/c;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    :goto_0
    return-void
.end method

.method public static a(Ljavax/net/ssl/SSLSocketFactory;)V
    .locals 0

    sput-object p0, Lcom/huawei/openalliance/ad/net/http/HttpsConfig;->a:Ljavax/net/ssl/SSLSocketFactory;

    return-void
.end method

.method public static a(Ljavax/net/ssl/X509TrustManager;)V
    .locals 0

    sput-object p0, Lcom/huawei/openalliance/ad/net/http/HttpsConfig;->b:Ljavax/net/ssl/X509TrustManager;

    return-void
.end method

.method public static a()[Ljavax/net/ssl/TrustManager;
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [Ljavax/net/ssl/TrustManager;

    return-object v0
.end method
