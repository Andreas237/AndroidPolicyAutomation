.class final Lio/fotoapparat/routine/orientation/StartOrientationRoutineKt$startOrientationMonitoring$1$1;
.super Lkotlin/jvm/internal/Lambda;
.source "StartOrientationRoutine.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/fotoapparat/routine/orientation/StartOrientationRoutineKt$startOrientationMonitoring$1;->invoke(Lio/fotoapparat/hardware/orientation/OrientationState;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\u0008\u0002"
    }
    d2 = {
        "<anonymous>",
        "",
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
.field final synthetic $orientationState:Lio/fotoapparat/hardware/orientation/OrientationState;

.field final synthetic this$0:Lio/fotoapparat/routine/orientation/StartOrientationRoutineKt$startOrientationMonitoring$1;


# direct methods
.method constructor <init>(Lio/fotoapparat/routine/orientation/StartOrientationRoutineKt$startOrientationMonitoring$1;Lio/fotoapparat/hardware/orientation/OrientationState;)V
    .locals 0

    iput-object p1, p0, Lio/fotoapparat/routine/orientation/StartOrientationRoutineKt$startOrientationMonitoring$1$1;->this$0:Lio/fotoapparat/routine/orientation/StartOrientationRoutineKt$startOrientationMonitoring$1;

    iput-object p2, p0, Lio/fotoapparat/routine/orientation/StartOrientationRoutineKt$startOrientationMonitoring$1$1;->$orientationState:Lio/fotoapparat/hardware/orientation/OrientationState;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lio/fotoapparat/routine/orientation/StartOrientationRoutineKt$startOrientationMonitoring$1$1;->invoke()V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public final invoke()V
    .locals 2

    .line 16
    iget-object v0, p0, Lio/fotoapparat/routine/orientation/StartOrientationRoutineKt$startOrientationMonitoring$1$1;->this$0:Lio/fotoapparat/routine/orientation/StartOrientationRoutineKt$startOrientationMonitoring$1;

    iget-object v0, v0, Lio/fotoapparat/routine/orientation/StartOrientationRoutineKt$startOrientationMonitoring$1;->$this_startOrientationMonitoring:Lio/fotoapparat/hardware/Device;

    invoke-virtual {v0}, Lio/fotoapparat/hardware/Device;->getSelectedCamera()Lio/fotoapparat/hardware/CameraDevice;

    move-result-object v0

    .line 17
    iget-object v1, p0, Lio/fotoapparat/routine/orientation/StartOrientationRoutineKt$startOrientationMonitoring$1$1;->$orientationState:Lio/fotoapparat/hardware/orientation/OrientationState;

    invoke-virtual {v0, v1}, Lio/fotoapparat/hardware/CameraDevice;->setDisplayOrientation(Lio/fotoapparat/hardware/orientation/OrientationState;)V

    return-void
.end method
