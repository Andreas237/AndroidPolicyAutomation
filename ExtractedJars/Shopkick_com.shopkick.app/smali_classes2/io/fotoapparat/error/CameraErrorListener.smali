.class public interface abstract Lio/fotoapparat/error/CameraErrorListener;
.super Ljava/lang/Object;
.source "CameraErrorCallback.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008f\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"
    }
    d2 = {
        "Lio/fotoapparat/error/CameraErrorListener;",
        "",
        "onError",
        "",
        "e",
        "Lio/fotoapparat/exception/camera/CameraException;",
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
.method public abstract onError(Lio/fotoapparat/exception/camera/CameraException;)V
    .param p1    # Lio/fotoapparat/exception/camera/CameraException;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method
