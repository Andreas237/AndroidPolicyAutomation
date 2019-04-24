.class public final Lcom/microblink/internal/DetectionUtils;
.super Ljava/lang/Object;


# static fields
.field private static final TAG:Ljava/lang/String; = "DetectionUtils"


# direct methods
.method static constructor <clinit>()V
    .locals 0

    invoke-static {}, Lcom/microblink/NativeLibraryLoader;->loadNativeLibrary()Z

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static native detectEdges(Landroid/graphics/Bitmap;)Lcom/microblink/EdgeDetection;
    .param p0    # Landroid/graphics/Bitmap;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
.end method

.method public static edgesToRect(Lcom/microblink/EdgeDetection;Landroid/graphics/Bitmap;)Landroid/graphics/Rect;
    .locals 2
    .param p0    # Lcom/microblink/EdgeDetection;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # Landroid/graphics/Bitmap;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iget v1, p0, Lcom/microblink/EdgeDetection;->y:F

    float-to-int v1, v1

    iput v1, v0, Landroid/graphics/Rect;->top:I

    iget v1, p0, Lcom/microblink/EdgeDetection;->x:F

    float-to-int v1, v1

    iput v1, v0, Landroid/graphics/Rect;->left:I

    iget v1, p0, Lcom/microblink/EdgeDetection;->height:F

    float-to-int v1, v1

    iput v1, v0, Landroid/graphics/Rect;->bottom:I

    iget p0, p0, Lcom/microblink/EdgeDetection;->width:F

    float-to-int p0, p0

    iput p0, v0, Landroid/graphics/Rect;->right:I

    iget p0, v0, Landroid/graphics/Rect;->right:I

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v1

    if-le p0, v1, :cond_0

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result p0

    iput p0, v0, Landroid/graphics/Rect;->right:I

    :cond_0
    iget p0, v0, Landroid/graphics/Rect;->bottom:I

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    if-le p0, v1, :cond_1

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result p0

    iput p0, v0, Landroid/graphics/Rect;->bottom:I

    :cond_1
    return-object v0
.end method

.method public static findEdges(Landroid/graphics/Bitmap;)Lcom/microblink/EdgeResult;
    .locals 7
    .param p0    # Landroid/graphics/Bitmap;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    new-instance v0, Lcom/microblink/StatsResults;

    invoke-direct {v0}, Lcom/microblink/StatsResults;-><init>()V

    invoke-virtual {v0}, Lcom/microblink/StatsResults;->start()V

    const/4 v1, 0x0

    :try_start_0
    invoke-static {p0}, Lcom/microblink/internal/DetectionUtils;->detectEdges(Landroid/graphics/Bitmap;)Lcom/microblink/EdgeDetection;

    move-result-object v2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v2

    const-string v3, "DetectionUtils"

    invoke-virtual {v2}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v4, 0x0

    new-array v4, v4, [Ljava/lang/Object;

    invoke-static {v3, v2, v4}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    move-object v2, v1

    :goto_0
    invoke-virtual {v0}, Lcom/microblink/StatsResults;->end()V

    if-eqz v2, :cond_0

    invoke-static {v2, p0}, Lcom/microblink/internal/DetectionUtils;->edgesToRect(Lcom/microblink/EdgeDetection;Landroid/graphics/Bitmap;)Landroid/graphics/Rect;

    move-result-object v1

    new-instance v3, Lcom/microblink/EdgeResult;

    iget v4, v1, Landroid/graphics/Rect;->left:I

    iget v5, v1, Landroid/graphics/Rect;->top:I

    iget v6, v1, Landroid/graphics/Rect;->right:I

    iget v1, v1, Landroid/graphics/Rect;->bottom:I

    invoke-static {p0, v4, v5, v6, v1}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;

    move-result-object p0

    invoke-direct {v3, p0, v2, v0}, Lcom/microblink/EdgeResult;-><init>(Landroid/graphics/Bitmap;Lcom/microblink/EdgeDetection;Lcom/microblink/StatsResults;)V

    return-object v3

    :cond_0
    return-object v1
.end method
