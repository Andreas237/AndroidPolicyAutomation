.class public final Lio/fotoapparat/parameter/camera/convert/ResolutionConverterKt;
.super Ljava/lang/Object;
.source "ResolutionConverter.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u0001*\u00060\u0002R\u00020\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "toResolution",
        "Lio/fotoapparat/parameter/Resolution;",
        "Landroid/hardware/Camera$Size;",
        "Landroid/hardware/Camera;",
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
.method public static final toResolution(Landroid/hardware/Camera$Size;)Lio/fotoapparat/parameter/Resolution;
    .locals 2
    .param p0    # Landroid/hardware/Camera$Size;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "receiver$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    new-instance v0, Lio/fotoapparat/parameter/Resolution;

    iget v1, p0, Landroid/hardware/Camera$Size;->width:I

    iget p0, p0, Landroid/hardware/Camera$Size;->height:I

    invoke-direct {v0, v1, p0}, Lio/fotoapparat/parameter/Resolution;-><init>(II)V

    return-object v0
.end method
