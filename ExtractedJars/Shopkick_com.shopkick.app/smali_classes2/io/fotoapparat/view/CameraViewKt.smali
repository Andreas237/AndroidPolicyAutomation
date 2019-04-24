.class public final Lio/fotoapparat/view/CameraViewKt;
.super Ljava/lang/Object;
.source "CameraView.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nCameraView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CameraView.kt\nio/fotoapparat/view/CameraViewKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,142:1\n1561#2,2:143\n*E\n*S KotlinDebug\n*F\n+ 1 CameraView.kt\nio/fotoapparat/view/CameraViewKt\n*L\n133#1,2:143\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0002\u001a\u0014\u0010\u0005\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0002\u001a\u0014\u0010\u0006\u001a\u00020\u0001*\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0008H\u0002\u001a\'\u0010\t\u001a\u0004\u0018\u00010\u0001*\u00020\u00042\u0008\u0010\n\u001a\u0004\u0018\u00010\u00022\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u000cH\u0002\u00a2\u0006\u0002\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "centerCrop",
        "",
        "Lio/fotoapparat/parameter/Resolution;",
        "view",
        "Landroid/view/ViewGroup;",
        "centerInside",
        "layoutChildrenAt",
        "rect",
        "Landroid/graphics/Rect;",
        "layoutTextureView",
        "previewResolution",
        "scaleType",
        "Lio/fotoapparat/parameter/ScaleType;",
        "(Landroid/view/ViewGroup;Lio/fotoapparat/parameter/Resolution;Lio/fotoapparat/parameter/ScaleType;)Lkotlin/Unit;",
        "fotoapparat_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# direct methods
.method public static final synthetic access$layoutTextureView(Landroid/view/ViewGroup;Lio/fotoapparat/parameter/Resolution;Lio/fotoapparat/parameter/ScaleType;)Lkotlin/Unit;
    .locals 0
    .param p0    # Landroid/view/ViewGroup;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lio/fotoapparat/parameter/Resolution;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Lio/fotoapparat/parameter/ScaleType;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    invoke-static {p0, p1, p2}, Lio/fotoapparat/view/CameraViewKt;->layoutTextureView(Landroid/view/ViewGroup;Lio/fotoapparat/parameter/Resolution;Lio/fotoapparat/parameter/ScaleType;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method private static final centerCrop(Lio/fotoapparat/parameter/Resolution;Landroid/view/ViewGroup;)V
    .locals 6
    .param p0    # Lio/fotoapparat/parameter/Resolution;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 112
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getMeasuredWidth()I

    move-result v0

    int-to-float v0, v0

    iget v1, p0, Lio/fotoapparat/parameter/Resolution;->width:I

    int-to-float v1, v1

    div-float/2addr v0, v1

    .line 113
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getMeasuredHeight()I

    move-result v1

    int-to-float v1, v1

    iget v2, p0, Lio/fotoapparat/parameter/Resolution;->height:I

    int-to-float v2, v2

    div-float/2addr v1, v2

    .line 111
    invoke-static {v0, v1}, Ljava/lang/Math;->max(FF)F

    move-result v0

    .line 116
    iget v1, p0, Lio/fotoapparat/parameter/Resolution;->width:I

    int-to-float v1, v1

    mul-float/2addr v1, v0

    float-to-int v1, v1

    .line 117
    iget p0, p0, Lio/fotoapparat/parameter/Resolution;->height:I

    int-to-float p0, p0

    mul-float/2addr p0, v0

    float-to-int p0, p0

    .line 119
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getMeasuredWidth()I

    move-result v0

    sub-int v0, v1, v0

    const/4 v2, 0x0

    invoke-static {v2, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    .line 120
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getMeasuredHeight()I

    move-result v3

    sub-int v3, p0, v3

    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    move-result v2

    .line 122
    new-instance v3, Landroid/graphics/Rect;

    neg-int v4, v0

    .line 123
    div-int/lit8 v4, v4, 0x2

    neg-int v5, v2

    .line 124
    div-int/lit8 v5, v5, 0x2

    .line 125
    div-int/lit8 v0, v0, 0x2

    sub-int/2addr v1, v0

    .line 126
    div-int/lit8 v2, v2, 0x2

    sub-int/2addr p0, v2

    .line 122
    invoke-direct {v3, v4, v5, v1, p0}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 129
    invoke-static {p1, v3}, Lio/fotoapparat/view/CameraViewKt;->layoutChildrenAt(Landroid/view/ViewGroup;Landroid/graphics/Rect;)V

    return-void
.end method

.method private static final centerInside(Lio/fotoapparat/parameter/Resolution;Landroid/view/ViewGroup;)V
    .locals 4
    .param p0    # Lio/fotoapparat/parameter/Resolution;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 90
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getMeasuredWidth()I

    move-result v0

    int-to-float v0, v0

    iget v1, p0, Lio/fotoapparat/parameter/Resolution;->width:I

    int-to-float v1, v1

    div-float/2addr v0, v1

    .line 91
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getMeasuredHeight()I

    move-result v1

    int-to-float v1, v1

    iget v2, p0, Lio/fotoapparat/parameter/Resolution;->height:I

    int-to-float v2, v2

    div-float/2addr v1, v2

    .line 89
    invoke-static {v0, v1}, Ljava/lang/Math;->min(FF)F

    move-result v0

    .line 94
    iget v1, p0, Lio/fotoapparat/parameter/Resolution;->width:I

    int-to-float v1, v1

    mul-float/2addr v1, v0

    float-to-int v1, v1

    .line 95
    iget p0, p0, Lio/fotoapparat/parameter/Resolution;->height:I

    int-to-float p0, p0

    mul-float/2addr p0, v0

    float-to-int p0, p0

    .line 97
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getMeasuredWidth()I

    move-result v0

    sub-int/2addr v0, v1

    const/4 v2, 0x0

    invoke-static {v2, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    .line 98
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getMeasuredHeight()I

    move-result v3

    sub-int/2addr v3, p0

    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    move-result v2

    .line 100
    new-instance v3, Landroid/graphics/Rect;

    .line 101
    div-int/lit8 v0, v0, 0x2

    .line 102
    div-int/lit8 v2, v2, 0x2

    add-int/2addr v1, v0

    add-int/2addr p0, v2

    .line 100
    invoke-direct {v3, v0, v2, v1, p0}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 107
    invoke-static {p1, v3}, Lio/fotoapparat/view/CameraViewKt;->layoutChildrenAt(Landroid/view/ViewGroup;Landroid/graphics/Rect;)V

    return-void
.end method

.method private static final layoutChildrenAt(Landroid/view/ViewGroup;Landroid/graphics/Rect;)V
    .locals 6
    .param p0    # Landroid/view/ViewGroup;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 133
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    invoke-static {v1, v0}, Lkotlin/ranges/RangesKt;->until(II)Lkotlin/ranges/IntRange;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .line 143
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Lkotlin/collections/IntIterator;

    invoke-virtual {v1}, Lkotlin/collections/IntIterator;->nextInt()I

    move-result v1

    .line 134
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    .line 135
    iget v2, p1, Landroid/graphics/Rect;->left:I

    .line 136
    iget v3, p1, Landroid/graphics/Rect;->top:I

    .line 137
    iget v4, p1, Landroid/graphics/Rect;->right:I

    .line 138
    iget v5, p1, Landroid/graphics/Rect;->bottom:I

    .line 134
    invoke-virtual {v1, v2, v3, v4, v5}, Landroid/view/View;->layout(IIII)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method private static final layoutTextureView(Landroid/view/ViewGroup;Lio/fotoapparat/parameter/Resolution;Lio/fotoapparat/parameter/ScaleType;)Lkotlin/Unit;
    .locals 2
    .param p0    # Landroid/view/ViewGroup;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const/4 v0, 0x0

    if-nez p2, :cond_0

    goto :goto_0

    .line 82
    :cond_0
    sget-object v1, Lio/fotoapparat/view/CameraViewKt$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p2}, Lio/fotoapparat/parameter/ScaleType;->ordinal()I

    move-result p2

    aget p2, v1, p2

    packed-switch p2, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    if-eqz p1, :cond_1

    .line 84
    invoke-static {p1, p0}, Lio/fotoapparat/view/CameraViewKt;->centerCrop(Lio/fotoapparat/parameter/Resolution;Landroid/view/ViewGroup;)V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    goto :goto_0

    :pswitch_1
    if-eqz p1, :cond_1

    .line 83
    invoke-static {p1, p0}, Lio/fotoapparat/view/CameraViewKt;->centerInside(Lio/fotoapparat/parameter/Resolution;Landroid/view/ViewGroup;)V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    :cond_1
    :goto_0
    return-object v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
