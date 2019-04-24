.class final Lio/fotoapparat/hardware/orientation/OrientationSensor$onOrientationChanged$1;
.super Lkotlin/jvm/internal/Lambda;
.source "OrientationSensor.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/fotoapparat/hardware/orientation/OrientationSensor;-><init>(Lio/fotoapparat/hardware/orientation/RotationListener;Lio/fotoapparat/hardware/Device;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/lang/Integer;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nOrientationSensor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OrientationSensor.kt\nio/fotoapparat/hardware/orientation/OrientationSensor$onOrientationChanged$1\n*L\n1#1,66:1\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\n\u00a2\u0006\u0002\u0008\u0005"
    }
    d2 = {
        "<anonymous>",
        "",
        "deviceRotation",
        "",
        "Lio/fotoapparat/hardware/orientation/DeviceRotationDegrees;",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# instance fields
.field final synthetic this$0:Lio/fotoapparat/hardware/orientation/OrientationSensor;


# direct methods
.method constructor <init>(Lio/fotoapparat/hardware/orientation/OrientationSensor;)V
    .locals 0

    iput-object p1, p0, Lio/fotoapparat/hardware/orientation/OrientationSensor$onOrientationChanged$1;->this$0:Lio/fotoapparat/hardware/orientation/OrientationSensor;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 10
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-virtual {p0, p1}, Lio/fotoapparat/hardware/orientation/OrientationSensor$onOrientationChanged$1;->invoke(I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(I)V
    .locals 2

    .line 17
    invoke-static {p1}, Lio/fotoapparat/hardware/orientation/RotationKt;->toClosestRightAngle(I)I

    move-result p1

    .line 18
    invoke-static {p1}, Lio/fotoapparat/hardware/orientation/OrientationKt;->toOrientation(I)Lio/fotoapparat/hardware/orientation/Orientation;

    move-result-object p1

    .line 20
    iget-object v0, p0, Lio/fotoapparat/hardware/orientation/OrientationSensor$onOrientationChanged$1;->this$0:Lio/fotoapparat/hardware/orientation/OrientationSensor;

    invoke-static {v0}, Lio/fotoapparat/hardware/orientation/OrientationSensor;->access$getDevice$p(Lio/fotoapparat/hardware/orientation/OrientationSensor;)Lio/fotoapparat/hardware/Device;

    move-result-object v0

    invoke-virtual {v0}, Lio/fotoapparat/hardware/Device;->getScreenOrientation()Lio/fotoapparat/hardware/orientation/Orientation;

    move-result-object v0

    .line 22
    new-instance v1, Lio/fotoapparat/hardware/orientation/OrientationState;

    invoke-direct {v1, p1, v0}, Lio/fotoapparat/hardware/orientation/OrientationState;-><init>(Lio/fotoapparat/hardware/orientation/Orientation;Lio/fotoapparat/hardware/orientation/Orientation;)V

    .line 27
    iget-object p1, p0, Lio/fotoapparat/hardware/orientation/OrientationSensor$onOrientationChanged$1;->this$0:Lio/fotoapparat/hardware/orientation/OrientationSensor;

    invoke-virtual {p1}, Lio/fotoapparat/hardware/orientation/OrientationSensor;->getLastKnownOrientationState()Lio/fotoapparat/hardware/orientation/OrientationState;

    move-result-object p1

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    if-eqz p1, :cond_0

    .line 28
    iget-object p1, p0, Lio/fotoapparat/hardware/orientation/OrientationSensor$onOrientationChanged$1;->this$0:Lio/fotoapparat/hardware/orientation/OrientationSensor;

    invoke-virtual {p1, v1}, Lio/fotoapparat/hardware/orientation/OrientationSensor;->setLastKnownOrientationState(Lio/fotoapparat/hardware/orientation/OrientationState;)V

    .line 29
    iget-object p1, p0, Lio/fotoapparat/hardware/orientation/OrientationSensor$onOrientationChanged$1;->this$0:Lio/fotoapparat/hardware/orientation/OrientationSensor;

    invoke-static {p1}, Lio/fotoapparat/hardware/orientation/OrientationSensor;->access$getListener$p(Lio/fotoapparat/hardware/orientation/OrientationSensor;)Lkotlin/jvm/functions/Function1;

    move-result-object p1

    invoke-interface {p1, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method
