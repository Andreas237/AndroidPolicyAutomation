.class public final Lretrofit/android/AndroidApacheClient;
.super Lretrofit/client/ApacheClient;
.source "AndroidApacheClient.java"


# direct methods
.method public constructor <init>()V
    .locals 1

    const-string v0, "Retrofit"

    .line 30
    invoke-static {v0}, Landroid/net/http/AndroidHttpClient;->newInstance(Ljava/lang/String;)Landroid/net/http/AndroidHttpClient;

    move-result-object v0

    invoke-direct {p0, v0}, Lretrofit/client/ApacheClient;-><init>(Lorg/apache/http/client/HttpClient;)V

    return-void
.end method
