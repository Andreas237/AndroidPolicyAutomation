.class public Lo/fgo;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private e:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    iput-object p1, p0, Lo/fgo;->e:Landroid/content/Context;

    .line 34
    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 2

    .line 72
    iget-object v0, p0, Lo/fgo;->e:Landroid/content/Context;

    invoke-static {v0}, Landroid/net/Proxy;->getHost(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    .line 73
    return-object v1
.end method

.method public b()I
    .locals 2

    .line 83
    iget-object v0, p0, Lo/fgo;->e:Landroid/content/Context;

    invoke-static {v0}, Landroid/net/Proxy;->getPort(Landroid/content/Context;)I

    move-result v1

    .line 84
    return v1
.end method

.method public e(Lorg/apache/http/HttpRequest;Lorg/apache/http/client/HttpClient;)V
    .locals 8

    .line 48
    invoke-virtual {p0}, Lo/fgo;->a()Ljava/lang/String;

    move-result-object v3

    .line 49
    invoke-virtual {p0}, Lo/fgo;->b()I

    move-result v4

    .line 50
    iget-object v0, p0, Lo/fgo;->e:Landroid/content/Context;

    const-string v1, "connectivity"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/net/ConnectivityManager;

    .line 52
    invoke-virtual {v5}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object v6

    .line 53
    if-eqz v6, :cond_0

    invoke-virtual {v6}, Landroid/net/NetworkInfo;->getType()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    .line 56
    if-eqz v3, :cond_0

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, -0x1

    if-eq v4, v0, :cond_0

    .line 58
    invoke-interface {p2}, Lorg/apache/http/client/HttpClient;->getParams()Lorg/apache/http/params/HttpParams;

    move-result-object v7

    .line 59
    new-instance v0, Lorg/apache/http/HttpHost;

    invoke-virtual {p0}, Lo/fgo;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lo/fgo;->b()I

    move-result v2

    invoke-direct {v0, v1, v2}, Lorg/apache/http/HttpHost;-><init>(Ljava/lang/String;I)V

    invoke-static {v7, v0}, Lorg/apache/http/conn/params/ConnRouteParams;->setDefaultProxy(Lorg/apache/http/params/HttpParams;Lorg/apache/http/HttpHost;)V

    .line 60
    invoke-interface {p1, v7}, Lorg/apache/http/HttpRequest;->setParams(Lorg/apache/http/params/HttpParams;)V

    .line 63
    :cond_0
    return-void
.end method
