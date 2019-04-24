.class public final Lio/fotoapparat/view/PreviewKt;
.super Ljava/lang/Object;
.source "Preview.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u000c\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\u000c\u0010\u0000\u001a\u00020\u0003*\u00020\u0004H\u0000\u00a8\u0006\u0005"
    }
    d2 = {
        "toPreview",
        "Lio/fotoapparat/view/Preview$Texture;",
        "Landroid/graphics/SurfaceTexture;",
        "Lio/fotoapparat/view/Preview$Surface;",
        "Landroid/view/SurfaceHolder;",
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
.method public static final toPreview(Landroid/view/SurfaceHolder;)Lio/fotoapparat/view/Preview$Surface;
    .locals 1
    .param p0    # Landroid/view/SurfaceHolder;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "receiver$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    new-instance v0, Lio/fotoapparat/view/Preview$Surface;

    invoke-direct {v0, p0}, Lio/fotoapparat/view/Preview$Surface;-><init>(Landroid/view/SurfaceHolder;)V

    return-object v0
.end method

.method public static final toPreview(Landroid/graphics/SurfaceTexture;)Lio/fotoapparat/view/Preview$Texture;
    .locals 1
    .param p0    # Landroid/graphics/SurfaceTexture;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "receiver$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    new-instance v0, Lio/fotoapparat/view/Preview$Texture;

    invoke-direct {v0, p0}, Lio/fotoapparat/view/Preview$Texture;-><init>(Landroid/graphics/SurfaceTexture;)V

    return-object v0
.end method
