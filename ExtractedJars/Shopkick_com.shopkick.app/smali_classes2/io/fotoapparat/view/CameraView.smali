.class public final Lio/fotoapparat/view/CameraView;
.super Landroid/widget/FrameLayout;
.source "CameraView.kt"

# interfaces
.implements Lio/fotoapparat/view/CameraRenderer;


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nCameraView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CameraView.kt\nio/fotoapparat/view/CameraView\n*L\n1#1,142:1\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\t\u0018\u00002\u00020\u00012\u00020\u0002B%\u0008\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0002\u0010\tJ\u0008\u0010\u0014\u001a\u00020\u0015H\u0016J\u0008\u0010\u0016\u001a\u00020\u0017H\u0002J\u0008\u0010\u0018\u001a\u00020\u0019H\u0014J0\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00082\u0006\u0010\u001e\u001a\u00020\u00082\u0006\u0010\u001f\u001a\u00020\u00082\u0006\u0010 \u001a\u00020\u0008H\u0014J\u0010\u0010!\u001a\u00020\u00192\u0006\u0010\"\u001a\u00020\u000bH\u0016J\u0010\u0010#\u001a\u00020\u00192\u0006\u0010\u000c\u001a\u00020\rH\u0016J\u000e\u0010$\u001a\u0004\u0018\u00010\u000f*\u00020\u0013H\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000c\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006%"
    }
    d2 = {
        "Lio/fotoapparat/view/CameraView;",
        "Landroid/widget/FrameLayout;",
        "Lio/fotoapparat/view/CameraRenderer;",
        "context",
        "Landroid/content/Context;",
        "attrs",
        "Landroid/util/AttributeSet;",
        "defStyleAttr",
        "",
        "(Landroid/content/Context;Landroid/util/AttributeSet;I)V",
        "previewResolution",
        "Lio/fotoapparat/parameter/Resolution;",
        "scaleType",
        "Lio/fotoapparat/parameter/ScaleType;",
        "surfaceTexture",
        "Landroid/graphics/SurfaceTexture;",
        "textureLatch",
        "Ljava/util/concurrent/CountDownLatch;",
        "textureView",
        "Landroid/view/TextureView;",
        "getPreview",
        "Lio/fotoapparat/view/Preview;",
        "getPreviewAfterLatch",
        "Lio/fotoapparat/view/Preview$Texture;",
        "onDetachedFromWindow",
        "",
        "onLayout",
        "changed",
        "",
        "left",
        "top",
        "right",
        "bottom",
        "setPreviewResolution",
        "resolution",
        "setScaleType",
        "tryInitialize",
        "fotoapparat_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# instance fields
.field private previewResolution:Lio/fotoapparat/parameter/Resolution;

.field private scaleType:Lio/fotoapparat/parameter/ScaleType;

.field private surfaceTexture:Landroid/graphics/SurfaceTexture;

.field private final textureLatch:Ljava/util/concurrent/CountDownLatch;

.field private final textureView:Landroid/view/TextureView;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 6
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x6

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    invoke-direct/range {v0 .. v5}, Lio/fotoapparat/view/CameraView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 6
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const/4 v3, 0x0

    const/4 v4, 0x4

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    invoke-direct/range {v0 .. v5}, Lio/fotoapparat/view/CameraView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 25
    new-instance p2, Ljava/util/concurrent/CountDownLatch;

    const/4 p3, 0x1

    invoke-direct {p2, p3}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    iput-object p2, p0, Lio/fotoapparat/view/CameraView;->textureLatch:Ljava/util/concurrent/CountDownLatch;

    .line 26
    new-instance p2, Landroid/view/TextureView;

    invoke-direct {p2, p1}, Landroid/view/TextureView;-><init>(Landroid/content/Context;)V

    iput-object p2, p0, Lio/fotoapparat/view/CameraView;->textureView:Landroid/view/TextureView;

    .line 31
    iget-object p1, p0, Lio/fotoapparat/view/CameraView;->textureView:Landroid/view/TextureView;

    invoke-direct {p0, p1}, Lio/fotoapparat/view/CameraView;->tryInitialize(Landroid/view/TextureView;)Landroid/graphics/SurfaceTexture;

    move-result-object p1

    iput-object p1, p0, Lio/fotoapparat/view/CameraView;->surfaceTexture:Landroid/graphics/SurfaceTexture;

    .line 34
    iget-object p1, p0, Lio/fotoapparat/view/CameraView;->textureView:Landroid/view/TextureView;

    check-cast p1, Landroid/view/View;

    invoke-virtual {p0, p1}, Lio/fotoapparat/view/CameraView;->addView(Landroid/view/View;)V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    const/4 p2, 0x0

    .line 21
    check-cast p2, Landroid/util/AttributeSet;

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    const/4 p3, 0x0

    .line 22
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lio/fotoapparat/view/CameraView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public static final synthetic access$getPreviewResolution$p(Lio/fotoapparat/view/CameraView;)Lio/fotoapparat/parameter/Resolution;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 18
    iget-object p0, p0, Lio/fotoapparat/view/CameraView;->previewResolution:Lio/fotoapparat/parameter/Resolution;

    if-nez p0, :cond_0

    const-string v0, "previewResolution"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    :cond_0
    return-object p0
.end method

.method public static final synthetic access$getScaleType$p(Lio/fotoapparat/view/CameraView;)Lio/fotoapparat/parameter/ScaleType;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 18
    iget-object p0, p0, Lio/fotoapparat/view/CameraView;->scaleType:Lio/fotoapparat/parameter/ScaleType;

    if-nez p0, :cond_0

    const-string v0, "scaleType"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    :cond_0
    return-object p0
.end method

.method public static final synthetic access$getSurfaceTexture$p(Lio/fotoapparat/view/CameraView;)Landroid/graphics/SurfaceTexture;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 18
    iget-object p0, p0, Lio/fotoapparat/view/CameraView;->surfaceTexture:Landroid/graphics/SurfaceTexture;

    return-object p0
.end method

.method public static final synthetic access$getTextureLatch$p(Lio/fotoapparat/view/CameraView;)Ljava/util/concurrent/CountDownLatch;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 18
    iget-object p0, p0, Lio/fotoapparat/view/CameraView;->textureLatch:Ljava/util/concurrent/CountDownLatch;

    return-object p0
.end method

.method public static final synthetic access$setPreviewResolution$p(Lio/fotoapparat/view/CameraView;Lio/fotoapparat/parameter/Resolution;)V
    .locals 0
    .param p1    # Lio/fotoapparat/parameter/Resolution;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 18
    iput-object p1, p0, Lio/fotoapparat/view/CameraView;->previewResolution:Lio/fotoapparat/parameter/Resolution;

    return-void
.end method

.method public static final synthetic access$setScaleType$p(Lio/fotoapparat/view/CameraView;Lio/fotoapparat/parameter/ScaleType;)V
    .locals 0
    .param p1    # Lio/fotoapparat/parameter/ScaleType;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 18
    iput-object p1, p0, Lio/fotoapparat/view/CameraView;->scaleType:Lio/fotoapparat/parameter/ScaleType;

    return-void
.end method

.method public static final synthetic access$setSurfaceTexture$p(Lio/fotoapparat/view/CameraView;Landroid/graphics/SurfaceTexture;)V
    .locals 0
    .param p1    # Landroid/graphics/SurfaceTexture;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 18
    iput-object p1, p0, Lio/fotoapparat/view/CameraView;->surfaceTexture:Landroid/graphics/SurfaceTexture;

    return-void
.end method

.method private final getPreviewAfterLatch()Lio/fotoapparat/view/Preview$Texture;
    .locals 1

    .line 66
    iget-object v0, p0, Lio/fotoapparat/view/CameraView;->textureLatch:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->await()V

    .line 67
    iget-object v0, p0, Lio/fotoapparat/view/CameraView;->surfaceTexture:Landroid/graphics/SurfaceTexture;

    if-eqz v0, :cond_0

    invoke-static {v0}, Lio/fotoapparat/view/PreviewKt;->toPreview(Landroid/graphics/SurfaceTexture;)Lio/fotoapparat/view/Preview$Texture;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Lio/fotoapparat/exception/camera/UnavailableSurfaceException;

    invoke-direct {v0}, Lio/fotoapparat/exception/camera/UnavailableSurfaceException;-><init>()V

    check-cast v0, Ljava/lang/Throwable;

    throw v0
.end method

.method private final tryInitialize(Landroid/view/TextureView;)Landroid/graphics/SurfaceTexture;
    .locals 3
    .param p1    # Landroid/view/TextureView;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 70
    invoke-virtual {p1}, Landroid/view/TextureView;->getSurfaceTexture()Landroid/graphics/SurfaceTexture;

    move-result-object v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    move-object v1, v0

    check-cast v1, Ljava/lang/Void;

    .line 71
    new-instance v1, Lio/fotoapparat/view/TextureAvailabilityListener;

    new-instance v2, Lio/fotoapparat/view/CameraView$tryInitialize$$inlined$also$lambda$1;

    invoke-direct {v2, p0, p1}, Lio/fotoapparat/view/CameraView$tryInitialize$$inlined$also$lambda$1;-><init>(Lio/fotoapparat/view/CameraView;Landroid/view/TextureView;)V

    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-direct {v1, v2}, Lio/fotoapparat/view/TextureAvailabilityListener;-><init>(Lkotlin/jvm/functions/Function1;)V

    check-cast v1, Landroid/view/TextureView$SurfaceTextureListener;

    invoke-virtual {p1, v1}, Landroid/view/TextureView;->setSurfaceTextureListener(Landroid/view/TextureView$SurfaceTextureListener;)V

    .line 70
    check-cast v0, Landroid/graphics/SurfaceTexture;

    :goto_0
    return-object v0
.end method


# virtual methods
.method public getPreview()Lio/fotoapparat/view/Preview;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 54
    iget-object v0, p0, Lio/fotoapparat/view/CameraView;->surfaceTexture:Landroid/graphics/SurfaceTexture;

    if-eqz v0, :cond_0

    invoke-static {v0}, Lio/fotoapparat/view/PreviewKt;->toPreview(Landroid/graphics/SurfaceTexture;)Lio/fotoapparat/view/Preview$Texture;

    move-result-object v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-direct {p0}, Lio/fotoapparat/view/CameraView;->getPreviewAfterLatch()Lio/fotoapparat/view/Preview$Texture;

    move-result-object v0

    :goto_0
    check-cast v0, Lio/fotoapparat/view/Preview;

    return-object v0
.end method

.method protected onDetachedFromWindow()V
    .locals 1

    .line 38
    invoke-super {p0}, Landroid/widget/FrameLayout;->onDetachedFromWindow()V

    .line 39
    iget-object v0, p0, Lio/fotoapparat/view/CameraView;->textureLatch:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    return-void
.end method

.method protected onLayout(ZIIII)V
    .locals 2

    .line 58
    invoke-virtual {p0}, Lio/fotoapparat/view/CameraView;->isInEditMode()Z

    move-result v0

    if-nez v0, :cond_3

    move-object v0, p0

    check-cast v0, Lio/fotoapparat/view/CameraView;

    iget-object v1, v0, Lio/fotoapparat/view/CameraView;->previewResolution:Lio/fotoapparat/parameter/Resolution;

    if-eqz v1, :cond_3

    iget-object v0, v0, Lio/fotoapparat/view/CameraView;->scaleType:Lio/fotoapparat/parameter/ScaleType;

    if-nez v0, :cond_0

    goto :goto_0

    .line 61
    :cond_0
    iget-object p1, p0, Lio/fotoapparat/view/CameraView;->previewResolution:Lio/fotoapparat/parameter/Resolution;

    if-nez p1, :cond_1

    const-string p2, "previewResolution"

    invoke-static {p2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    :cond_1
    iget-object p2, p0, Lio/fotoapparat/view/CameraView;->scaleType:Lio/fotoapparat/parameter/ScaleType;

    if-nez p2, :cond_2

    const-string p3, "scaleType"

    invoke-static {p3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    :cond_2
    invoke-static {p0, p1, p2}, Lio/fotoapparat/view/CameraViewKt;->access$layoutTextureView(Landroid/view/ViewGroup;Lio/fotoapparat/parameter/Resolution;Lio/fotoapparat/parameter/ScaleType;)Lkotlin/Unit;

    goto :goto_1

    .line 59
    :cond_3
    :goto_0
    invoke-super/range {p0 .. p5}, Landroid/widget/FrameLayout;->onLayout(ZIIII)V

    :goto_1
    return-void
.end method

.method public setPreviewResolution(Lio/fotoapparat/parameter/Resolution;)V
    .locals 1
    .param p1    # Lio/fotoapparat/parameter/Resolution;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "resolution"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 47
    new-instance v0, Lio/fotoapparat/view/CameraView$setPreviewResolution$1;

    invoke-direct {v0, p0, p1}, Lio/fotoapparat/view/CameraView$setPreviewResolution$1;-><init>(Lio/fotoapparat/view/CameraView;Lio/fotoapparat/parameter/Resolution;)V

    check-cast v0, Ljava/lang/Runnable;

    invoke-virtual {p0, v0}, Lio/fotoapparat/view/CameraView;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public setScaleType(Lio/fotoapparat/parameter/ScaleType;)V
    .locals 1
    .param p1    # Lio/fotoapparat/parameter/ScaleType;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "scaleType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    iput-object p1, p0, Lio/fotoapparat/view/CameraView;->scaleType:Lio/fotoapparat/parameter/ScaleType;

    return-void
.end method
