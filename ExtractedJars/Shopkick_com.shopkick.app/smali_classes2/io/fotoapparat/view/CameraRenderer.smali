.class public interface abstract Lio/fotoapparat/view/CameraRenderer;
.super Ljava/lang/Object;
.source "CameraRenderer.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\u0008f\u0018\u00002\u00020\u0001J\u0008\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\u0008\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH&\u00a8\u0006\u000b"
    }
    d2 = {
        "Lio/fotoapparat/view/CameraRenderer;",
        "",
        "getPreview",
        "Lio/fotoapparat/view/Preview;",
        "setPreviewResolution",
        "",
        "resolution",
        "Lio/fotoapparat/parameter/Resolution;",
        "setScaleType",
        "scaleType",
        "Lio/fotoapparat/parameter/ScaleType;",
        "fotoapparat_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# virtual methods
.method public abstract getPreview()Lio/fotoapparat/view/Preview;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract setPreviewResolution(Lio/fotoapparat/parameter/Resolution;)V
    .param p1    # Lio/fotoapparat/parameter/Resolution;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract setScaleType(Lio/fotoapparat/parameter/ScaleType;)V
    .param p1    # Lio/fotoapparat/parameter/ScaleType;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method
