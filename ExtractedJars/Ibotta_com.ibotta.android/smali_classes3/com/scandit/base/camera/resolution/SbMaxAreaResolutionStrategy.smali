.class public Lcom/scandit/base/camera/resolution/SbMaxAreaResolutionStrategy;
.super Lcom/scandit/base/camera/resolution/SbResolutionStrategy;
.source "SbMaxAreaResolutionStrategy.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 16
    invoke-direct {p0}, Lcom/scandit/base/camera/resolution/SbResolutionStrategy;-><init>()V

    return-void
.end method


# virtual methods
.method public getIndexOfBestFittingResolution(Ljava/util/List;II)I
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/scandit/base/camera/resolution/SbResolutionStrategy$Size;",
            ">;II)I"
        }
    .end annotation

    const/4 p2, 0x0

    const/4 p3, -0x1

    const/4 p3, 0x0

    const/4 v0, -0x1

    const/4 v1, 0x0

    .line 22
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    if-ge p3, v2, :cond_1

    .line 23
    invoke-interface {p1, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/scandit/base/camera/resolution/SbResolutionStrategy$Size;

    iget v2, v2, Lcom/scandit/base/camera/resolution/SbResolutionStrategy$Size;->width:I

    invoke-interface {p1, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/scandit/base/camera/resolution/SbResolutionStrategy$Size;

    iget v3, v3, Lcom/scandit/base/camera/resolution/SbResolutionStrategy$Size;->height:I

    mul-int v2, v2, v3

    if-le v2, v1, :cond_0

    move v0, p3

    move v1, v2

    :cond_0
    add-int/lit8 p3, p3, 0x1

    goto :goto_0

    :cond_1
    if-gez v0, :cond_2

    goto :goto_1

    :cond_2
    move p2, v0

    :goto_1
    return p2
.end method
