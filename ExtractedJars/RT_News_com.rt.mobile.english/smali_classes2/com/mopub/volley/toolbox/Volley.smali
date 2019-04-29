.class public Lcom/mopub/volley/toolbox/Volley;
.super Ljava/lang/Object;
.source "Volley.java"


# static fields
.field private static final DEFAULT_CACHE_DIR:Ljava/lang/String; = "volley"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static newRequestQueue(Landroid/content/Context;)Lcom/mopub/volley/RequestQueue;
    .locals 1

    const/4 v0, 0x0

    .line 78
    invoke-static {p0, v0}, Lcom/mopub/volley/toolbox/Volley;->newRequestQueue(Landroid/content/Context;Lcom/mopub/volley/toolbox/HttpStack;)Lcom/mopub/volley/RequestQueue;

    move-result-object p0

    return-object p0
.end method

.method public static newRequestQueue(Landroid/content/Context;Lcom/mopub/volley/toolbox/HttpStack;)Lcom/mopub/volley/RequestQueue;
    .locals 4

    .line 43
    new-instance v0, Ljava/io/File;

    invoke-virtual {p0}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    move-result-object v1

    const-string v2, "volley"

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    const-string v1, "volley/0"

    .line 47
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    .line 48
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p0

    const/4 v3, 0x0

    invoke-virtual {p0, v2, v3}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object p0

    .line 49
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "/"

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p0, p0, Landroid/content/pm/PackageInfo;->versionCode:I

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-object p0, v1

    :goto_0
    if-nez p1, :cond_1

    .line 54
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x9

    if-lt p1, v1, :cond_0

    .line 55
    new-instance p1, Lcom/mopub/volley/toolbox/HurlStack;

    invoke-direct {p1}, Lcom/mopub/volley/toolbox/HurlStack;-><init>()V

    goto :goto_1

    .line 59
    :cond_0
    new-instance p1, Lcom/mopub/volley/toolbox/HttpClientStack;

    invoke-static {p0}, Landroid/net/http/AndroidHttpClient;->newInstance(Ljava/lang/String;)Landroid/net/http/AndroidHttpClient;

    move-result-object p0

    invoke-direct {p1, p0}, Lcom/mopub/volley/toolbox/HttpClientStack;-><init>(Lorg/apache/http/client/HttpClient;)V

    .line 63
    :cond_1
    :goto_1
    new-instance p0, Lcom/mopub/volley/toolbox/BasicNetwork;

    invoke-direct {p0, p1}, Lcom/mopub/volley/toolbox/BasicNetwork;-><init>(Lcom/mopub/volley/toolbox/HttpStack;)V

    .line 65
    new-instance p1, Lcom/mopub/volley/RequestQueue;

    new-instance v1, Lcom/mopub/volley/toolbox/DiskBasedCache;

    invoke-direct {v1, v0}, Lcom/mopub/volley/toolbox/DiskBasedCache;-><init>(Ljava/io/File;)V

    invoke-direct {p1, v1, p0}, Lcom/mopub/volley/RequestQueue;-><init>(Lcom/mopub/volley/Cache;Lcom/mopub/volley/Network;)V

    .line 66
    invoke-virtual {p1}, Lcom/mopub/volley/RequestQueue;->start()V

    return-object p1
.end method
