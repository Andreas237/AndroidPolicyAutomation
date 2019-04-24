.class public final Lio/fotoapparat/parameter/camera/convert/FpsRangeConverterKt;
.super Ljava/lang/Object;
.source "FpsRangeConverter.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u000c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0000\u001a\u000c\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u00a8\u0006\u0003"
    }
    d2 = {
        "toFpsRange",
        "Lio/fotoapparat/parameter/FpsRange;",
        "",
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
.method public static final toFpsRange([I)Lio/fotoapparat/parameter/FpsRange;
    .locals 3
    .param p0    # [I
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "receiver$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    new-instance v0, Lio/fotoapparat/parameter/FpsRange;

    const/4 v1, 0x0

    .line 13
    aget v1, p0, v1

    const/4 v2, 0x1

    .line 14
    aget p0, p0, v2

    .line 12
    invoke-direct {v0, v1, p0}, Lio/fotoapparat/parameter/FpsRange;-><init>(II)V

    return-object v0
.end method
