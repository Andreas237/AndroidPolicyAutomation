.class public final Lio/fotoapparat/preview/PreviewStream;
.super Ljava/lang/Object;
.source "PreviewStream.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nPreviewStream.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PreviewStream.kt\nio/fotoapparat/preview/PreviewStream\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,133:1\n1561#2,2:134\n*E\n*S KotlinDebug\n*F\n+ 1 PreviewStream.kt\nio/fotoapparat/preview/PreviewStream\n*L\n106#1,2:134\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0012\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0000\u0008\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J/\u0010\u0016\u001a\u00020\u00122%\u0010\u0017\u001a!\u0012\u0013\u0012\u00110\u000e\u00a2\u0006\u000c\u0008\u000f\u0012\u0008\u0008\u0010\u0012\u0004\u0008\u0008(\u0011\u0012\u0004\u0012\u00020\u00120\rj\u0002`\u0013H\u0002J\u0008\u0010\u0018\u001a\u00020\u0012H\u0002J\u0010\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0010\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u001bH\u0002J\u0008\u0010\u001e\u001a\u00020\u0015H\u0002J\u0010\u0010\u001f\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u000eH\u0002J\u0008\u0010 \u001a\u00020\u0012H\u0002J\u0008\u0010!\u001a\u00020\u0012H\u0002J1\u0010\"\u001a\u00020\u00122)\u0010#\u001a%\u0012\u0013\u0012\u00110\u000e\u00a2\u0006\u000c\u0008\u000f\u0012\u0008\u0008\u0010\u0012\u0004\u0008\u0008(\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\rj\u0004\u0018\u0001`\u0013J\u000c\u0010$\u001a\u00020\u0012*\u00020\u0003H\u0002J\u0010\u0010%\u001a\u00020\u001b*\u00060&R\u00020\u0003H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008\"\u0004\u0008\t\u0010\nR3\u0010\u000b\u001a\'\u0012#\u0012!\u0012\u0013\u0012\u00110\u000e\u00a2\u0006\u000c\u0008\u000f\u0012\u0008\u0008\u0010\u0012\u0004\u0008\u0008(\u0011\u0012\u0004\u0012\u00020\u00120\rj\u0002`\u00130\u000cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\'"
    }
    d2 = {
        "Lio/fotoapparat/preview/PreviewStream;",
        "",
        "camera",
        "Landroid/hardware/Camera;",
        "(Landroid/hardware/Camera;)V",
        "frameOrientation",
        "Lio/fotoapparat/hardware/orientation/Orientation;",
        "getFrameOrientation",
        "()Lio/fotoapparat/hardware/orientation/Orientation;",
        "setFrameOrientation",
        "(Lio/fotoapparat/hardware/orientation/Orientation;)V",
        "frameProcessors",
        "Ljava/util/LinkedHashSet;",
        "Lkotlin/Function1;",
        "Lio/fotoapparat/preview/Frame;",
        "Lkotlin/ParameterName;",
        "name",
        "frame",
        "",
        "Lio/fotoapparat/util/FrameProcessor;",
        "previewResolution",
        "Lio/fotoapparat/parameter/Resolution;",
        "addProcessor",
        "processor",
        "clearProcessors",
        "dispatchFrame",
        "image",
        "",
        "dispatchFrameOnBackgroundThread",
        "data",
        "ensurePreviewSizeAvailable",
        "returnFrameToBuffer",
        "start",
        "stop",
        "updateProcessorSafely",
        "frameProcessor",
        "addFrameToBuffer",
        "allocateBuffer",
        "Landroid/hardware/Camera$Parameters;",
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
.field private final camera:Landroid/hardware/Camera;

.field private frameOrientation:Lio/fotoapparat/hardware/orientation/Orientation;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final frameProcessors:Ljava/util/LinkedHashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedHashSet<",
            "Lkotlin/jvm/functions/Function1<",
            "Lio/fotoapparat/preview/Frame;",
            "Lkotlin/Unit;",
            ">;>;"
        }
    .end annotation
.end field

.field private previewResolution:Lio/fotoapparat/parameter/Resolution;


# direct methods
.method public constructor <init>(Landroid/hardware/Camera;)V
    .locals 1
    .param p1    # Landroid/hardware/Camera;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "camera"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/fotoapparat/preview/PreviewStream;->camera:Landroid/hardware/Camera;

    .line 18
    new-instance p1, Ljava/util/LinkedHashSet;

    invoke-direct {p1}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object p1, p0, Lio/fotoapparat/preview/PreviewStream;->frameProcessors:Ljava/util/LinkedHashSet;

    .line 25
    sget-object p1, Lio/fotoapparat/hardware/orientation/Orientation$Vertical$Portrait;->INSTANCE:Lio/fotoapparat/hardware/orientation/Orientation$Vertical$Portrait;

    check-cast p1, Lio/fotoapparat/hardware/orientation/Orientation;

    iput-object p1, p0, Lio/fotoapparat/preview/PreviewStream;->frameOrientation:Lio/fotoapparat/hardware/orientation/Orientation;

    return-void
.end method

.method public static final synthetic access$dispatchFrame(Lio/fotoapparat/preview/PreviewStream;[B)V
    .locals 0
    .param p1    # [B
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 16
    invoke-direct {p0, p1}, Lio/fotoapparat/preview/PreviewStream;->dispatchFrame([B)V

    return-void
.end method

.method public static final synthetic access$dispatchFrameOnBackgroundThread(Lio/fotoapparat/preview/PreviewStream;[B)V
    .locals 0
    .param p1    # [B
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 16
    invoke-direct {p0, p1}, Lio/fotoapparat/preview/PreviewStream;->dispatchFrameOnBackgroundThread([B)V

    return-void
.end method

.method public static final synthetic access$getFrameProcessors$p(Lio/fotoapparat/preview/PreviewStream;)Ljava/util/LinkedHashSet;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 16
    iget-object p0, p0, Lio/fotoapparat/preview/PreviewStream;->frameProcessors:Ljava/util/LinkedHashSet;

    return-object p0
.end method

.method private final addFrameToBuffer(Landroid/hardware/Camera;)V
    .locals 2
    .param p1    # Landroid/hardware/Camera;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 75
    invoke-virtual {p1}, Landroid/hardware/Camera;->getParameters()Landroid/hardware/Camera$Parameters;

    move-result-object v0

    const-string v1, "parameters"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, v0}, Lio/fotoapparat/preview/PreviewStream;->allocateBuffer(Landroid/hardware/Camera$Parameters;)[B

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/hardware/Camera;->addCallbackBuffer([B)V

    return-void
.end method

.method private final addProcessor(Lkotlin/jvm/functions/Function1;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lio/fotoapparat/preview/Frame;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 40
    iget-object v0, p0, Lio/fotoapparat/preview/PreviewStream;->frameProcessors:Ljava/util/LinkedHashSet;

    monitor-enter v0

    .line 41
    :try_start_0
    iget-object v1, p0, Lio/fotoapparat/preview/PreviewStream;->frameProcessors:Ljava/util/LinkedHashSet;

    invoke-virtual {v1, p1}, Ljava/util/LinkedHashSet;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 40
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0

    throw p1
.end method

.method private final allocateBuffer(Landroid/hardware/Camera$Parameters;)[B
    .locals 3
    .param p1    # Landroid/hardware/Camera$Parameters;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 79
    invoke-static {p1}, Lio/fotoapparat/preview/PreviewStreamKt;->access$ensureNv21Format(Landroid/hardware/Camera$Parameters;)V

    .line 81
    new-instance v0, Lio/fotoapparat/parameter/Resolution;

    .line 82
    invoke-virtual {p1}, Landroid/hardware/Camera$Parameters;->getPreviewSize()Landroid/hardware/Camera$Size;

    move-result-object v1

    iget v1, v1, Landroid/hardware/Camera$Size;->width:I

    .line 83
    invoke-virtual {p1}, Landroid/hardware/Camera$Parameters;->getPreviewSize()Landroid/hardware/Camera$Size;

    move-result-object v2

    iget v2, v2, Landroid/hardware/Camera$Size;->height:I

    .line 81
    invoke-direct {v0, v1, v2}, Lio/fotoapparat/parameter/Resolution;-><init>(II)V

    iput-object v0, p0, Lio/fotoapparat/preview/PreviewStream;->previewResolution:Lio/fotoapparat/parameter/Resolution;

    .line 86
    invoke-virtual {p1}, Landroid/hardware/Camera$Parameters;->getPreviewSize()Landroid/hardware/Camera$Size;

    move-result-object p1

    const-string v0, "previewSize"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lio/fotoapparat/preview/PreviewStreamKt;->access$bytesPerFrame(Landroid/hardware/Camera$Size;)I

    move-result p1

    new-array p1, p1, [B

    return-object p1
.end method

.method private final clearProcessors()V
    .locals 2

    .line 31
    iget-object v0, p0, Lio/fotoapparat/preview/PreviewStream;->frameProcessors:Ljava/util/LinkedHashSet;

    monitor-enter v0

    .line 32
    :try_start_0
    iget-object v1, p0, Lio/fotoapparat/preview/PreviewStream;->frameProcessors:Ljava/util/LinkedHashSet;

    invoke-virtual {v1}, Ljava/util/LinkedHashSet;->clear()V

    .line 33
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 31
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method private final dispatchFrame([B)V
    .locals 3

    .line 98
    invoke-direct {p0}, Lio/fotoapparat/preview/PreviewStream;->ensurePreviewSizeAvailable()Lio/fotoapparat/parameter/Resolution;

    move-result-object v0

    .line 100
    new-instance v1, Lio/fotoapparat/preview/Frame;

    .line 103
    iget-object v2, p0, Lio/fotoapparat/preview/PreviewStream;->frameOrientation:Lio/fotoapparat/hardware/orientation/Orientation;

    invoke-virtual {v2}, Lio/fotoapparat/hardware/orientation/Orientation;->getDegrees()I

    move-result v2

    .line 100
    invoke-direct {v1, v0, p1, v2}, Lio/fotoapparat/preview/Frame;-><init>(Lio/fotoapparat/parameter/Resolution;[BI)V

    .line 106
    iget-object p1, p0, Lio/fotoapparat/preview/PreviewStream;->frameProcessors:Ljava/util/LinkedHashSet;

    check-cast p1, Ljava/lang/Iterable;

    .line 134
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 107
    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 110
    :cond_0
    invoke-direct {p0, v1}, Lio/fotoapparat/preview/PreviewStream;->returnFrameToBuffer(Lio/fotoapparat/preview/Frame;)V

    return-void
.end method

.method private final dispatchFrameOnBackgroundThread([B)V
    .locals 2

    .line 90
    invoke-static {}, Lio/fotoapparat/hardware/ExecutorKt;->getFrameProcessingExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    new-instance v1, Lio/fotoapparat/preview/PreviewStream$dispatchFrameOnBackgroundThread$1;

    invoke-direct {v1, p0, p1}, Lio/fotoapparat/preview/PreviewStream$dispatchFrameOnBackgroundThread$1;-><init>(Lio/fotoapparat/preview/PreviewStream;[B)V

    check-cast v1, Ljava/lang/Runnable;

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method private final ensurePreviewSizeAvailable()Lio/fotoapparat/parameter/Resolution;
    .locals 2

    .line 114
    iget-object v0, p0, Lio/fotoapparat/preview/PreviewStream;->previewResolution:Lio/fotoapparat/parameter/Resolution;

    if-eqz v0, :cond_0

    return-object v0

    .line 115
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "previewSize is null. Frame was not added?"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Throwable;

    throw v0
.end method

.method private final returnFrameToBuffer(Lio/fotoapparat/preview/Frame;)V
    .locals 1

    .line 118
    iget-object v0, p0, Lio/fotoapparat/preview/PreviewStream;->camera:Landroid/hardware/Camera;

    .line 119
    invoke-virtual {p1}, Lio/fotoapparat/preview/Frame;->getImage()[B

    move-result-object p1

    .line 118
    invoke-virtual {v0, p1}, Landroid/hardware/Camera;->addCallbackBuffer([B)V

    return-void
.end method

.method private final start()V
    .locals 2

    .line 49
    iget-object v0, p0, Lio/fotoapparat/preview/PreviewStream;->camera:Landroid/hardware/Camera;

    invoke-direct {p0, v0}, Lio/fotoapparat/preview/PreviewStream;->addFrameToBuffer(Landroid/hardware/Camera;)V

    .line 51
    iget-object v0, p0, Lio/fotoapparat/preview/PreviewStream;->camera:Landroid/hardware/Camera;

    new-instance v1, Lio/fotoapparat/preview/PreviewStream$start$1;

    invoke-direct {v1, p0}, Lio/fotoapparat/preview/PreviewStream$start$1;-><init>(Lio/fotoapparat/preview/PreviewStream;)V

    check-cast v1, Landroid/hardware/Camera$PreviewCallback;

    invoke-virtual {v0, v1}, Landroid/hardware/Camera;->setPreviewCallbackWithBuffer(Landroid/hardware/Camera$PreviewCallback;)V

    return-void
.end method

.method private final stop()V
    .locals 2

    .line 58
    iget-object v0, p0, Lio/fotoapparat/preview/PreviewStream;->camera:Landroid/hardware/Camera;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/hardware/Camera;->setPreviewCallbackWithBuffer(Landroid/hardware/Camera$PreviewCallback;)V

    return-void
.end method


# virtual methods
.method public final getFrameOrientation()Lio/fotoapparat/hardware/orientation/Orientation;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 25
    iget-object v0, p0, Lio/fotoapparat/preview/PreviewStream;->frameOrientation:Lio/fotoapparat/hardware/orientation/Orientation;

    return-object v0
.end method

.method public final setFrameOrientation(Lio/fotoapparat/hardware/orientation/Orientation;)V
    .locals 1
    .param p1    # Lio/fotoapparat/hardware/orientation/Orientation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    iput-object p1, p0, Lio/fotoapparat/preview/PreviewStream;->frameOrientation:Lio/fotoapparat/hardware/orientation/Orientation;

    return-void
.end method

.method public final updateProcessorSafely(Lkotlin/jvm/functions/Function1;)V
    .locals 0
    .param p1    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lio/fotoapparat/preview/Frame;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 65
    invoke-direct {p0}, Lio/fotoapparat/preview/PreviewStream;->clearProcessors()V

    if-nez p1, :cond_0

    .line 67
    invoke-direct {p0}, Lio/fotoapparat/preview/PreviewStream;->stop()V

    goto :goto_0

    .line 69
    :cond_0
    invoke-direct {p0, p1}, Lio/fotoapparat/preview/PreviewStream;->addProcessor(Lkotlin/jvm/functions/Function1;)V

    .line 70
    invoke-direct {p0}, Lio/fotoapparat/preview/PreviewStream;->start()V

    :goto_0
    return-void
.end method
