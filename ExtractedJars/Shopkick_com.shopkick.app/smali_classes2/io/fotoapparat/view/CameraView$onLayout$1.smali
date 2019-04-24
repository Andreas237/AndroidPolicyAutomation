.class final Lio/fotoapparat/view/CameraView$onLayout$1;
.super Lkotlin/jvm/internal/MutablePropertyReference0;
.source "CameraView.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    k = 0x3
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# direct methods
.method constructor <init>(Lio/fotoapparat/view/CameraView;)V
    .locals 0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/MutablePropertyReference0;-><init>(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public get()Ljava/lang/Object;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lio/fotoapparat/view/CameraView$onLayout$1;->receiver:Ljava/lang/Object;

    check-cast v0, Lio/fotoapparat/view/CameraView;

    .line 58
    invoke-static {v0}, Lio/fotoapparat/view/CameraView;->access$getPreviewResolution$p(Lio/fotoapparat/view/CameraView;)Lio/fotoapparat/parameter/Resolution;

    move-result-object v0

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    const-string v0, "previewResolution"

    return-object v0
.end method

.method public getOwner()Lkotlin/reflect/KDeclarationContainer;
    .locals 1

    const-class v0, Lio/fotoapparat/view/CameraView;

    invoke-static {v0}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v0

    return-object v0
.end method

.method public getSignature()Ljava/lang/String;
    .locals 1

    const-string v0, "getPreviewResolution()Lio/fotoapparat/parameter/Resolution;"

    return-object v0
.end method

.method public set(Ljava/lang/Object;)V
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    iget-object v0, p0, Lio/fotoapparat/view/CameraView$onLayout$1;->receiver:Ljava/lang/Object;

    check-cast v0, Lio/fotoapparat/view/CameraView;

    .line 58
    check-cast p1, Lio/fotoapparat/parameter/Resolution;

    invoke-static {v0, p1}, Lio/fotoapparat/view/CameraView;->access$setPreviewResolution$p(Lio/fotoapparat/view/CameraView;Lio/fotoapparat/parameter/Resolution;)V

    return-void
.end method
