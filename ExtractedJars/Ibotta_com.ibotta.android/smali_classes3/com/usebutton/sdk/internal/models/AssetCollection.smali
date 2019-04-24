.class public Lcom/usebutton/sdk/internal/models/AssetCollection;
.super Ljava/lang/Object;
.source "AssetCollection.java"


# static fields
.field private static final TAG:Ljava/lang/String; = "AssetCollection"


# instance fields
.field private final mAction:Lcom/usebutton/sdk/internal/models/AppAction;


# direct methods
.method public constructor <init>(Lcom/usebutton/sdk/internal/models/AppAction;)V
    .locals 0

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    iput-object p1, p0, Lcom/usebutton/sdk/internal/models/AssetCollection;->mAction:Lcom/usebutton/sdk/internal/models/AppAction;

    return-void
.end method

.method public static downloadToAsset(Lcom/usebutton/sdk/internal/util/StopWatch;Lcom/usebutton/sdk/internal/ImageLoader;Lcom/usebutton/sdk/internal/models/Asset;)Z
    .locals 6
    .param p0    # Lcom/usebutton/sdk/internal/util/StopWatch;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eqz p2, :cond_2

    .line 43
    invoke-virtual {p2}, Lcom/usebutton/sdk/internal/models/Asset;->getUrl()Landroid/net/Uri;

    move-result-object v2

    if-nez v2, :cond_0

    goto :goto_1

    .line 47
    :cond_0
    invoke-virtual {p2}, Lcom/usebutton/sdk/internal/models/Asset;->getUrl()Landroid/net/Uri;

    move-result-object v2

    .line 49
    :try_start_0
    invoke-virtual {p1, v2}, Lcom/usebutton/sdk/internal/ImageLoader;->getImageData(Landroid/net/Uri;)[B

    move-result-object p1

    .line 50
    invoke-virtual {p2, p1}, Lcom/usebutton/sdk/internal/models/Asset;->setData([B)V

    const-string v3, "AssetCollection"

    const-string v4, "Got image: %s"

    .line 51
    new-array v5, v1, [Ljava/lang/Object;

    invoke-static {p1}, Lcom/usebutton/sdk/internal/util/ButtonUtil;->imageSizeString([B)Ljava/lang/String;

    move-result-object p1

    aput-object p1, v5, v0

    invoke-static {v3, v4, v5}, Lcom/usebutton/sdk/internal/util/ButtonLog;->infoFormat(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Lcom/usebutton/sdk/internal/api/ButtonNetworkException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const-string v3, "AssetCollection"

    .line 55
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Out of memory while retrieving asset %s\n%s"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    new-array v1, v1, [Ljava/lang/Object;

    aput-object p1, v1, v0

    invoke-static {v3, v4, v1}, Lcom/usebutton/sdk/internal/util/ButtonLog;->infoFormat(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    :catch_1
    move-exception p1

    const-string v3, "AssetCollection"

    const-string v4, "Failed to get asset."

    .line 53
    new-array v1, v1, [Ljava/lang/Object;

    aput-object p1, v1, v0

    invoke-static {v3, v4, v1}, Lcom/usebutton/sdk/internal/util/ButtonLog;->infoFormat(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_0
    if-eqz p0, :cond_1

    .line 58
    invoke-virtual {v2}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/usebutton/sdk/internal/util/StopWatch;->lap(Ljava/lang/String;)V

    .line 60
    :cond_1
    invoke-static {p2}, Lcom/usebutton/sdk/internal/models/AssetCollection;->isValidAsset(Lcom/usebutton/sdk/internal/models/Asset;)Z

    move-result p0

    return p0

    :cond_2
    :goto_1
    const-string p0, "AssetCollection"

    const-string p1, "Skipped downloading asset: %s"

    .line 44
    new-array v2, v1, [Ljava/lang/Object;

    aput-object p2, v2, v0

    invoke-static {p0, p1, v2}, Lcom/usebutton/sdk/internal/util/ButtonLog;->infoFormat(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    return v1
.end method

.method public static isValidAsset(Lcom/usebutton/sdk/internal/models/Asset;)Z
    .locals 3

    const/4 v0, 0x1

    if-nez p0, :cond_0

    return v0

    .line 72
    :cond_0
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/models/Asset;->getData()[B

    move-result-object v1

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    .line 75
    :cond_1
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/models/Asset;->getData()[B

    move-result-object p0

    array-length p0, p0

    if-lez p0, :cond_2

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static setImageDensity(Landroid/graphics/Bitmap;D)V
    .locals 2
    .annotation build Landroid/annotation/TargetApi;
        value = 0x4
    .end annotation

    const-wide/high16 v0, 0x4064000000000000L    # 160.0

    mul-double p1, p1, v0

    double-to-int p1, p1

    .line 65
    invoke-virtual {p0, p1}, Landroid/graphics/Bitmap;->setDensity(I)V

    return-void
.end method


# virtual methods
.method public downloadToAsset(Lcom/usebutton/sdk/internal/ImageLoader;)V
    .locals 2
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    .line 31
    new-instance v0, Lcom/usebutton/sdk/internal/util/StopWatch;

    invoke-direct {v0}, Lcom/usebutton/sdk/internal/util/StopWatch;-><init>()V

    .line 32
    iget-object v1, p0, Lcom/usebutton/sdk/internal/models/AssetCollection;->mAction:Lcom/usebutton/sdk/internal/models/AppAction;

    invoke-virtual {v1}, Lcom/usebutton/sdk/internal/models/AppAction;->getPreview()Lcom/usebutton/sdk/internal/models/Preview;

    move-result-object v1

    invoke-virtual {v1}, Lcom/usebutton/sdk/internal/models/Preview;->getIcon()Lcom/usebutton/sdk/internal/models/Asset;

    move-result-object v1

    invoke-static {v0, p1, v1}, Lcom/usebutton/sdk/internal/models/AssetCollection;->downloadToAsset(Lcom/usebutton/sdk/internal/util/StopWatch;Lcom/usebutton/sdk/internal/ImageLoader;Lcom/usebutton/sdk/internal/models/Asset;)Z

    const-string p1, "Downloaded all assets"

    .line 33
    invoke-virtual {v0, p1}, Lcom/usebutton/sdk/internal/util/StopWatch;->stop(Ljava/lang/String;)V

    return-void
.end method
