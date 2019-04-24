.class public final Lio/fotoapparat/exception/camera/UnsupportedLensException;
.super Lio/fotoapparat/exception/camera/CameraException;
.source "UnsupportedLensException.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"
    }
    d2 = {
        "Lio/fotoapparat/exception/camera/UnsupportedLensException;",
        "Lio/fotoapparat/exception/camera/CameraException;",
        "()V",
        "fotoapparat_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 3

    const-string v0, "Device has no camera for the desired lens position(s)."

    const/4 v1, 0x0

    const/4 v2, 0x2

    .line 6
    invoke-direct {p0, v0, v1, v2, v1}, Lio/fotoapparat/exception/camera/CameraException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method
