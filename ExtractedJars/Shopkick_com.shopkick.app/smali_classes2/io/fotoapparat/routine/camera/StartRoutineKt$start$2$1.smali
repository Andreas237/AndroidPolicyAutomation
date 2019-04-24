.class final Lio/fotoapparat/routine/camera/StartRoutineKt$start$2$1;
.super Lkotlin/jvm/internal/Lambda;
.source "StartRoutine.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/fotoapparat/routine/camera/StartRoutineKt$start$2;->invoke(Lio/fotoapparat/hardware/metering/FocalRequest;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Lio/fotoapparat/result/FocusResult;",
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
        "\u0000\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\u0008\u0002"
    }
    d2 = {
        "<anonymous>",
        "Lio/fotoapparat/result/FocusResult;",
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
.field final synthetic $focalRequest:Lio/fotoapparat/hardware/metering/FocalRequest;

.field final synthetic this$0:Lio/fotoapparat/routine/camera/StartRoutineKt$start$2;


# direct methods
.method constructor <init>(Lio/fotoapparat/routine/camera/StartRoutineKt$start$2;Lio/fotoapparat/hardware/metering/FocalRequest;)V
    .locals 0

    iput-object p1, p0, Lio/fotoapparat/routine/camera/StartRoutineKt$start$2$1;->this$0:Lio/fotoapparat/routine/camera/StartRoutineKt$start$2;

    iput-object p2, p0, Lio/fotoapparat/routine/camera/StartRoutineKt$start$2$1;->$focalRequest:Lio/fotoapparat/hardware/metering/FocalRequest;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Lio/fotoapparat/result/FocusResult;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 64
    iget-object v0, p0, Lio/fotoapparat/routine/camera/StartRoutineKt$start$2$1;->this$0:Lio/fotoapparat/routine/camera/StartRoutineKt$start$2;

    iget-object v0, v0, Lio/fotoapparat/routine/camera/StartRoutineKt$start$2;->$this_start:Lio/fotoapparat/hardware/Device;

    iget-object v1, p0, Lio/fotoapparat/routine/camera/StartRoutineKt$start$2$1;->$focalRequest:Lio/fotoapparat/hardware/metering/FocalRequest;

    invoke-static {v0, v1}, Lio/fotoapparat/routine/focus/FocusOnPointRoutineKt;->focusOnPoint(Lio/fotoapparat/hardware/Device;Lio/fotoapparat/hardware/metering/FocalRequest;)Lio/fotoapparat/result/FocusResult;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lio/fotoapparat/routine/camera/StartRoutineKt$start$2$1;->invoke()Lio/fotoapparat/result/FocusResult;

    move-result-object v0

    return-object v0
.end method
