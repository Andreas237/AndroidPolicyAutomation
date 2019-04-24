.class public Lcom/scandit/base/camera/resolution/SbHighDensityResolutionStrategy;
.super Lcom/scandit/base/camera/resolution/SbResolutionStrategy;
.source "SbHighDensityResolutionStrategy.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 20
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

    const/4 v2, 0x0

    const/4 v3, -0x1

    const/high16 v5, 0x3f800000    # 1.0f

    const/4 v6, 0x0

    .line 32
    :goto_1
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->size()I

    move-result v7

    if-ge v2, v7, :cond_8

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

    int-to-float v9, v7

    int-to-float v10, v8

    div-float/2addr v9, v10

    sub-float v9, v1, v9

    .line 37
    invoke-static {v9}, Ljava/lang/Math;->abs(F)F

    move-result v9

    .line 39
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lcom/scandit/base/camera/resolution/SbResolutionStrategy$Size;

    iget v10, v10, Lcom/scandit/base/camera/resolution/SbResolutionStrategy$Size;->width:I

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lcom/scandit/base/camera/resolution/SbResolutionStrategy$Size;

    iget v11, v11, Lcom/scandit/base/camera/resolution/SbResolutionStrategy$Size;->height:I

    mul-int v10, v10, v11

    const/16 v11, 0x780

    if-ne v7, v11, :cond_1

    cmpg-float v12, v9, v5

    if-ltz v12, :cond_3

    :cond_1
    float-to-double v12, v9

    const-wide v14, 0x3fd3333333333333L    # 0.3

    add-double/2addr v14, v12

    move-wide/from16 v16, v12

    float-to-double v11, v5

    cmpg-double v13, v14, v11

    if-ltz v13, :cond_2

    const-wide v13, 0x3fb999999999999aL    # 0.1

    add-double/2addr v11, v13

    cmpg-double v13, v16, v11

    if-gez v13, :cond_7

    if-le v10, v6, :cond_7

    :cond_2
    const/16 v11, 0x780

    if-gt v7, v11, :cond_7

    .line 58
    :cond_3
    sget-object v11, Landroid/os/Build;->MODEL:Ljava/lang/String;

    const-string v12, "XT890"

    invoke-virtual {v11, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_4

    const/16 v11, 0x400

    if-ne v7, v11, :cond_4

    goto :goto_2

    .line 59
    :cond_4
    sget-object v11, Landroid/os/Build;->MODEL:Ljava/lang/String;

    const-string v12, "HTC Desire"

    invoke-virtual {v11, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_5

    const/16 v11, 0x500

    if-ne v7, v11, :cond_5

    goto :goto_2

    .line 60
    :cond_5
    sget-object v7, Landroid/os/Build;->MODEL:Ljava/lang/String;

    const-string v11, "M100"

    invoke-virtual {v7, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_6

    const/16 v7, 0x440

    if-ne v8, v7, :cond_6

    goto :goto_2

    :cond_6
    move v3, v2

    move v5, v9

    move v6, v10

    :cond_7
    :goto_2
    add-int/lit8 v2, v2, 0x1

    goto/16 :goto_1

    :cond_8
    if-gez v3, :cond_9

    const/4 v3, 0x0

    :cond_9
    return v3
.end method
