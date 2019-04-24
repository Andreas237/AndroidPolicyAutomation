.class public final Lio/fotoapparat/result/PendingResultKt;
.super Ljava/lang/Object;
.source "PendingResult.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0016\u0010\u0000\u001a\u00020\u00012\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0003H\u0002*\u0016\u0010\u0004\"\u0008\u0012\u0004\u0012\u00020\u00060\u00052\u0008\u0012\u0004\u0012\u00020\u00060\u0005*\u0016\u0010\u0007\"\u0008\u0012\u0004\u0012\u00020\u00080\u00052\u0008\u0012\u0004\u0012\u00020\u00080\u0005\u00a8\u0006\t"
    }
    d2 = {
        "notifyOnMainThread",
        "",
        "function",
        "Lkotlin/Function0;",
        "CapabilitiesResult",
        "Lio/fotoapparat/result/PendingResult;",
        "Lio/fotoapparat/capability/Capabilities;",
        "ParametersResult",
        "Lio/fotoapparat/parameter/camera/CameraParameters;",
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
.method public static final synthetic access$notifyOnMainThread(Lkotlin/jvm/functions/Function0;)V
    .locals 0
    .param p0    # Lkotlin/jvm/functions/Function0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    invoke-static {p0}, Lio/fotoapparat/result/PendingResultKt;->notifyOnMainThread(Lkotlin/jvm/functions/Function0;)V

    return-void
.end method

.method private static final notifyOnMainThread(Lkotlin/jvm/functions/Function0;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 121
    new-instance v0, Lio/fotoapparat/result/PendingResultKt$notifyOnMainThread$1;

    invoke-direct {v0, p0}, Lio/fotoapparat/result/PendingResultKt$notifyOnMainThread$1;-><init>(Lkotlin/jvm/functions/Function0;)V

    check-cast v0, Lkotlin/jvm/functions/Function0;

    invoke-static {v0}, Lio/fotoapparat/hardware/ExecutorKt;->executeMainThread(Lkotlin/jvm/functions/Function0;)Z

    return-void
.end method
