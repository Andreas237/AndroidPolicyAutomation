.class final Lio/fotoapparat/Fotoapparat$getCurrentParameters$future$1;
.super Lkotlin/jvm/internal/FunctionReference;
.source "Fotoapparat.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/fotoapparat/Fotoapparat;->getCurrentParameters()Lio/fotoapparat/result/PendingResult;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/FunctionReference;",
        "Lkotlin/jvm/functions/Function0<",
        "Lio/fotoapparat/parameter/camera/CameraParameters;",
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
        "\u0000\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\u00a2\u0006\u0002\u0008\u0002"
    }
    d2 = {
        "<anonymous>",
        "Lio/fotoapparat/parameter/camera/CameraParameters;",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# direct methods
.method constructor <init>(Lio/fotoapparat/hardware/Device;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0, p1}, Lkotlin/jvm/internal/FunctionReference;-><init>(ILjava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final getName()Ljava/lang/String;
    .locals 1

    const-string v0, "getCurrentParameters"

    return-object v0
.end method

.method public final getOwner()Lkotlin/reflect/KDeclarationContainer;
    .locals 2

    const-class v0, Lio/fotoapparat/routine/parameter/GetParametersRoutineKt;

    const-string v1, "fotoapparat_release"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinPackage(Ljava/lang/Class;Ljava/lang/String;)Lkotlin/reflect/KDeclarationContainer;

    move-result-object v0

    return-object v0
.end method

.method public final getSignature()Ljava/lang/String;
    .locals 1

    const-string v0, "getCurrentParameters(Lio/fotoapparat/hardware/Device;)Lio/fotoapparat/parameter/camera/CameraParameters;"

    return-object v0
.end method

.method public final invoke()Lio/fotoapparat/parameter/camera/CameraParameters;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lio/fotoapparat/Fotoapparat$getCurrentParameters$future$1;->receiver:Ljava/lang/Object;

    check-cast v0, Lio/fotoapparat/hardware/Device;

    .line 151
    invoke-static {v0}, Lio/fotoapparat/routine/parameter/GetParametersRoutineKt;->getCurrentParameters(Lio/fotoapparat/hardware/Device;)Lio/fotoapparat/parameter/camera/CameraParameters;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 34
    invoke-virtual {p0}, Lio/fotoapparat/Fotoapparat$getCurrentParameters$future$1;->invoke()Lio/fotoapparat/parameter/camera/CameraParameters;

    move-result-object v0

    return-object v0
.end method
