.class public Lcom/scandit/base/camera/resolution/SbLegacyResolutionStrategy;
.super Lcom/scandit/base/camera/resolution/SbResolutionStrategy;
.source "SbLegacyResolutionStrategy.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 17
    invoke-direct {p0}, Lcom/scandit/base/camera/resolution/SbResolutionStrategy;-><init>()V

    return-void
.end method


# virtual methods
.method public getIndexOfBestFittingResolution(Ljava/util/List;II)I
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/scandit/base/camera/resolution/SbResolutionStrategy$Size;",
            ">;II)I"
        }
    .end annotation

    move-object/from16 v0, p1

    move/from16 v1, p2

    move/from16 v2, p3

    if-le v1, v2, :cond_0

    int-to-float v1, v1

    int-to-float v2, v2

    div-float/2addr v1, v2

    goto :goto_0

    :cond_0
    int-to-float v2, v2

    int-to-float v1, v1

    div-float v1, v2, v1

    :goto_0
    const/4 v2, -0x1

    const/high16 v3, 0x3f800000    # 1.0f

    const/4 v4, 0x0

    move v5, v3

    move v6, v4

    move v3, v2

    move v2, v6

    .line 31
    :goto_1
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->size()I

    move-result v7

    if-ge v2, v7, :cond_6

    .line 33
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/scandit/base/camera/resolution/SbResolutionStrategy$Size;

    iget v7, v7, Lcom/scandit/base/camera/resolution/SbResolutionStrategy$Size;->width:I

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/scandit/base/camera/resolution/SbResolutionStrategy$Size;

    iget v8, v8, Lcom/scandit/base/camera/resolution/SbResolutionStrategy$Size;->height:I

    invoke-static {v7, v8}, Ljava/lang/Math;->max(II)I

    move-result v7

    .line 34
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/scandit/base/camera/resolution/SbResolutionStrategy$Size;

    iget v8, v8, Lcom/scandit/base/camera/resolution/SbResolutionStrategy$Size;->width:I

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/scandit/base/camera/resolution/SbResolutionStrategy$Size;

    iget v9, v9, Lcom/scandit/base/camera/resolution/SbResolutionStrategy$Size;->height:I

    invoke-static {v8, v9}, Ljava/lang/Math;->min(II)I

    move-result v8

    .line 36
    sget-object v9, Landroid/os/Build;->MODEL:Ljava/lang/String;

    const-string v10, "S1000"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1

    const/16 v9, 0x280

    if-ne v7, v9, :cond_1

    const/16 v9, 0x1e0

    if-ne v8, v9, :cond_1

    return v2

    :cond_1
    int-to-float v9, v7

    int-to-float v10, v8

    div-float/2addr v9, v10

    sub-float v9, v1, v9

    .line 41
    invoke-static {v9}, Ljava/lang/Math;->abs(F)F

    move-result v9

    .line 43
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lcom/scandit/base/camera/resolution/SbResolutionStrategy$Size;

    iget v10, v10, Lcom/scandit/base/camera/resolution/SbResolutionStrategy$Size;->width:I

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lcom/scandit/base/camera/resolution/SbResolutionStrategy$Size;

    iget v11, v11, Lcom/scandit/base/camera/resolution/SbResolutionStrategy$Size;->height:I

    mul-int/2addr v10, v11

    const/16 v11, 0x500

    if-gt v7, v11, :cond_5

    const/16 v12, 0x2d0

    if-gt v8, v12, :cond_5

    float-to-double v12, v9

    const-wide v14, 0x3fd3333333333333L    # 0.3

    add-double/2addr v14, v12

    move-wide/from16 v16, v12

    float-to-double v11, v5

    cmpg-double v8, v14, v11

    if-ltz v8, :cond_2

    const-wide v13, 0x3fb999999999999aL    # 0.1

    add-double/2addr v11, v13

    cmpg-double v8, v16, v11

    if-gez v8, :cond_5

    if-le v10, v6, :cond_5

    .line 56
    :cond_2
    sget-object v8, Landroid/os/Build;->MODEL:Ljava/lang/String;

    const-string v11, "XT890"

    invoke-virtual {v8, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_3

    const/16 v8, 0x400

    if-ne v7, v8, :cond_3

    goto :goto_2

    .line 57
    :cond_3
    sget-object v8, Landroid/os/Build;->MODEL:Ljava/lang/String;

    const-string v11, "HTC Desire"

    invoke-virtual {v8, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_4

    const/16 v8, 0x500

    if-ne v7, v8, :cond_4

    goto :goto_2

    :cond_4
    move v3, v2

    move v5, v9

    move v6, v10

    :cond_5
    :goto_2
    add-int/lit8 v2, v2, 0x1

    goto/16 :goto_1

    :cond_6
    if-gez v3, :cond_7

    move v3, v4

    :cond_7
    return v3
.end method
