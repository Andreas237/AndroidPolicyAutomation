.class final Lio/fotoapparat/error/ErrorCallbacksKt$onMainThread$1;
.super Lkotlin/jvm/internal/Lambda;
.source "ErrorCallbacks.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/fotoapparat/error/ErrorCallbacksKt;->onMainThread(Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lio/fotoapparat/exception/camera/CameraException;",
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
        "cameraException",
        "Lio/fotoapparat/exception/camera/CameraException;",
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
.field final synthetic $this_onMainThread:Lkotlin/jvm/functions/Function1;


# direct methods
.method constructor <init>(Lkotlin/jvm/functions/Function1;)V
    .locals 0

    iput-object p1, p0, Lio/fotoapparat/error/ErrorCallbacksKt$onMainThread$1;->$this_onMainThread:Lkotlin/jvm/functions/Function1;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lio/fotoapparat/exception/camera/CameraException;

    invoke-virtual {p0, p1}, Lio/fotoapparat/error/ErrorCallbacksKt$onMainThread$1;->invoke(Lio/fotoapparat/exception/camera/CameraException;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lio/fotoapparat/exception/camera/CameraException;)V
    .locals 2
    .param p1    # Lio/fotoapparat/exception/camera/CameraException;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "cameraException"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 14
    iget-object v0, p0, Lio/fotoapparat/error/ErrorCallbacksKt$onMainThread$1;->$this_onMainThread:Lkotlin/jvm/functions/Function1;

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 16
    :cond_0
    new-instance v0, Lio/fotoapparat/error/ErrorCallbacksKt$onMainThread$1$1;

    invoke-direct {v0, p0, p1}, Lio/fotoapparat/error/ErrorCallbacksKt$onMainThread$1$1;-><init>(Lio/fotoapparat/error/ErrorCallbacksKt$onMainThread$1;Lio/fotoapparat/exception/camera/CameraException;)V

    check-cast v0, Lkotlin/jvm/functions/Function0;

    invoke-static {v0}, Lio/fotoapparat/hardware/ExecutorKt;->executeMainThread(Lkotlin/jvm/functions/Function0;)Z

    :goto_0
    return-void
.end method
