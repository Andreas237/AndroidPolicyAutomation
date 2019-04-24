.class public Lio/fotoapparat/hardware/orientation/OrientationSensor;
.super Ljava/lang/Object;
.source "OrientationSensor.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0010\u0018\u00002\u00020\u0001B\u0017\u0008\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006B\u0015\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\tJ\u001c\u0010\u0016\u001a\u00020\u00122\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00120\u0011H\u0016J\u0008\u0010\u0017\u001a\u00020\u0012H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u00020\u000bX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u000c\u0010\r\"\u0004\u0008\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0013\u001a\u0012\u0012\u0008\u0012\u00060\u0014j\u0002`\u0015\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"
    }
    d2 = {
        "Lio/fotoapparat/hardware/orientation/OrientationSensor;",
        "",
        "context",
        "Landroid/content/Context;",
        "device",
        "Lio/fotoapparat/hardware/Device;",
        "(Landroid/content/Context;Lio/fotoapparat/hardware/Device;)V",
        "rotationListener",
        "Lio/fotoapparat/hardware/orientation/RotationListener;",
        "(Lio/fotoapparat/hardware/orientation/RotationListener;Lio/fotoapparat/hardware/Device;)V",
        "lastKnownOrientationState",
        "Lio/fotoapparat/hardware/orientation/OrientationState;",
        "getLastKnownOrientationState",
        "()Lio/fotoapparat/hardware/orientation/OrientationState;",
        "setLastKnownOrientationState",
        "(Lio/fotoapparat/hardware/orientation/OrientationState;)V",
        "listener",
        "Lkotlin/Function1;",
        "",
        "onOrientationChanged",
        "",
        "Lio/fotoapparat/hardware/orientation/DeviceRotationDegrees;",
        "start",
        "stop",
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
.field private final device:Lio/fotoapparat/hardware/Device;

.field private lastKnownOrientationState:Lio/fotoapparat/hardware/orientation/OrientationState;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private listener:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lio/fotoapparat/hardware/orientation/OrientationState;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private final onOrientationChanged:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private final rotationListener:Lio/fotoapparat/hardware/orientation/RotationListener;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lio/fotoapparat/hardware/Device;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lio/fotoapparat/hardware/Device;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "device"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    new-instance v0, Lio/fotoapparat/hardware/orientation/RotationListener;

    invoke-direct {v0, p1}, Lio/fotoapparat/hardware/orientation/RotationListener;-><init>(Landroid/content/Context;)V

    .line 41
    invoke-direct {p0, v0, p2}, Lio/fotoapparat/hardware/orientation/OrientationSensor;-><init>(Lio/fotoapparat/hardware/orientation/RotationListener;Lio/fotoapparat/hardware/Device;)V

    return-void
.end method

.method public constructor <init>(Lio/fotoapparat/hardware/orientation/RotationListener;Lio/fotoapparat/hardware/Device;)V
    .locals 1
    .param p1    # Lio/fotoapparat/hardware/orientation/RotationListener;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lio/fotoapparat/hardware/Device;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "rotationListener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "device"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/fotoapparat/hardware/orientation/OrientationSensor;->rotationListener:Lio/fotoapparat/hardware/orientation/RotationListener;

    iput-object p2, p0, Lio/fotoapparat/hardware/orientation/OrientationSensor;->device:Lio/fotoapparat/hardware/Device;

    .line 16
    new-instance p1, Lio/fotoapparat/hardware/orientation/OrientationSensor$onOrientationChanged$1;

    invoke-direct {p1, p0}, Lio/fotoapparat/hardware/orientation/OrientationSensor$onOrientationChanged$1;-><init>(Lio/fotoapparat/hardware/orientation/OrientationSensor;)V

    check-cast p1, Lkotlin/jvm/functions/Function1;

    iput-object p1, p0, Lio/fotoapparat/hardware/orientation/OrientationSensor;->onOrientationChanged:Lkotlin/jvm/functions/Function1;

    .line 33
    new-instance p1, Lio/fotoapparat/hardware/orientation/OrientationState;

    .line 34
    sget-object p2, Lio/fotoapparat/hardware/orientation/Orientation$Vertical$Portrait;->INSTANCE:Lio/fotoapparat/hardware/orientation/Orientation$Vertical$Portrait;

    check-cast p2, Lio/fotoapparat/hardware/orientation/Orientation;

    .line 35
    iget-object v0, p0, Lio/fotoapparat/hardware/orientation/OrientationSensor;->device:Lio/fotoapparat/hardware/Device;

    invoke-virtual {v0}, Lio/fotoapparat/hardware/Device;->getScreenOrientation()Lio/fotoapparat/hardware/orientation/Orientation;

    move-result-object v0

    .line 33
    invoke-direct {p1, p2, v0}, Lio/fotoapparat/hardware/orientation/OrientationState;-><init>(Lio/fotoapparat/hardware/orientation/Orientation;Lio/fotoapparat/hardware/orientation/Orientation;)V

    iput-object p1, p0, Lio/fotoapparat/hardware/orientation/OrientationSensor;->lastKnownOrientationState:Lio/fotoapparat/hardware/orientation/OrientationState;

    .line 47
    iget-object p1, p0, Lio/fotoapparat/hardware/orientation/OrientationSensor;->rotationListener:Lio/fotoapparat/hardware/orientation/RotationListener;

    iget-object p2, p0, Lio/fotoapparat/hardware/orientation/OrientationSensor;->onOrientationChanged:Lkotlin/jvm/functions/Function1;

    invoke-virtual {p1, p2}, Lio/fotoapparat/hardware/orientation/RotationListener;->setOrientationChanged(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public static final synthetic access$getDevice$p(Lio/fotoapparat/hardware/orientation/OrientationSensor;)Lio/fotoapparat/hardware/Device;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 10
    iget-object p0, p0, Lio/fotoapparat/hardware/orientation/OrientationSensor;->device:Lio/fotoapparat/hardware/Device;

    return-object p0
.end method

.method public static final synthetic access$getListener$p(Lio/fotoapparat/hardware/orientation/OrientationSensor;)Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 10
    iget-object p0, p0, Lio/fotoapparat/hardware/orientation/OrientationSensor;->listener:Lkotlin/jvm/functions/Function1;

    if-nez p0, :cond_0

    const-string v0, "listener"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    :cond_0
    return-object p0
.end method

.method public static final synthetic access$setListener$p(Lio/fotoapparat/hardware/orientation/OrientationSensor;Lkotlin/jvm/functions/Function1;)V
    .locals 0
    .param p1    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 10
    iput-object p1, p0, Lio/fotoapparat/hardware/orientation/OrientationSensor;->listener:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public getLastKnownOrientationState()Lio/fotoapparat/hardware/orientation/OrientationState;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 33
    iget-object v0, p0, Lio/fotoapparat/hardware/orientation/OrientationSensor;->lastKnownOrientationState:Lio/fotoapparat/hardware/orientation/OrientationState;

    return-object v0
.end method

.method public setLastKnownOrientationState(Lio/fotoapparat/hardware/orientation/OrientationState;)V
    .locals 1
    .param p1    # Lio/fotoapparat/hardware/orientation/OrientationState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    iput-object p1, p0, Lio/fotoapparat/hardware/orientation/OrientationSensor;->lastKnownOrientationState:Lio/fotoapparat/hardware/orientation/OrientationState;

    return-void
.end method

.method public start(Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .param p1    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lio/fotoapparat/hardware/orientation/OrientationState;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "listener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 54
    iput-object p1, p0, Lio/fotoapparat/hardware/orientation/OrientationSensor;->listener:Lkotlin/jvm/functions/Function1;

    .line 55
    iget-object p1, p0, Lio/fotoapparat/hardware/orientation/OrientationSensor;->rotationListener:Lio/fotoapparat/hardware/orientation/RotationListener;

    invoke-virtual {p1}, Lio/fotoapparat/hardware/orientation/RotationListener;->enable()V

    return-void
.end method

.method public stop()V
    .locals 1

    .line 62
    iget-object v0, p0, Lio/fotoapparat/hardware/orientation/OrientationSensor;->rotationListener:Lio/fotoapparat/hardware/orientation/RotationListener;

    invoke-virtual {v0}, Lio/fotoapparat/hardware/orientation/RotationListener;->disable()V

    return-void
.end method
