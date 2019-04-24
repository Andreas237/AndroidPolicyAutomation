.class final Lio/fotoapparat/routine/camera/StartRoutineKt$start$2;
.super Lkotlin/jvm/internal/Lambda;
.source "StartRoutine.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/fotoapparat/routine/camera/StartRoutineKt;->start(Lio/fotoapparat/hardware/Device;Lio/fotoapparat/hardware/orientation/OrientationSensor;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lio/fotoapparat/hardware/metering/FocalRequest;",
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
        "\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n\u00a2\u0006\u0002\u0008\u0004"
    }
    d2 = {
        "<anonymous>",
        "",
        "focalRequest",
        "Lio/fotoapparat/hardware/metering/FocalRequest;",
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
.field final synthetic $this_start:Lio/fotoapparat/hardware/Device;


# direct methods
.method constructor <init>(Lio/fotoapparat/hardware/Device;)V
    .locals 0

    iput-object p1, p0, Lio/fotoapparat/routine/camera/StartRoutineKt$start$2;->$this_start:Lio/fotoapparat/hardware/Device;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lio/fotoapparat/hardware/metering/FocalRequest;

    invoke-virtual {p0, p1}, Lio/fotoapparat/routine/camera/StartRoutineKt$start$2;->invoke(Lio/fotoapparat/hardware/metering/FocalRequest;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lio/fotoapparat/hardware/metering/FocalRequest;)V
    .locals 3
    .param p1    # Lio/fotoapparat/hardware/metering/FocalRequest;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "focalRequest"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 63
    iget-object v0, p0, Lio/fotoapparat/routine/camera/StartRoutineKt$start$2;->$this_start:Lio/fotoapparat/hardware/Device;

    invoke-virtual {v0}, Lio/fotoapparat/hardware/Device;->getExecutor$fotoapparat_release()Lio/fotoapparat/concurrent/CameraExecutor;

    move-result-object v0

    new-instance v1, Lio/fotoapparat/concurrent/CameraExecutor$Operation;

    new-instance v2, Lio/fotoapparat/routine/camera/StartRoutineKt$start$2$1;

    invoke-direct {v2, p0, p1}, Lio/fotoapparat/routine/camera/StartRoutineKt$start$2$1;-><init>(Lio/fotoapparat/routine/camera/StartRoutineKt$start$2;Lio/fotoapparat/hardware/metering/FocalRequest;)V

    check-cast v2, Lkotlin/jvm/functions/Function0;

    const/4 p1, 0x1

    invoke-direct {v1, p1, v2}, Lio/fotoapparat/concurrent/CameraExecutor$Operation;-><init>(ZLkotlin/jvm/functions/Function0;)V

    invoke-virtual {v0, v1}, Lio/fotoapparat/concurrent/CameraExecutor;->execute(Lio/fotoapparat/concurrent/CameraExecutor$Operation;)Ljava/util/concurrent/Future;

    return-void
.end method
