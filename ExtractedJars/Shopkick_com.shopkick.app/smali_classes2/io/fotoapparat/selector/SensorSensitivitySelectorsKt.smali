.class public final Lio/fotoapparat/selector/SensorSensitivitySelectorsKt;
.super Ljava/lang/Object;
.source "SensorSensitivitySelectors.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010\u0008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u001a#\u0010\u0000\u001a\u001f\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001j\u0002`\u0004\u00a2\u0006\u0002\u0008\u0005\u001a#\u0010\u0006\u001a\u001f\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001j\u0002`\u0004\u00a2\u0006\u0002\u0008\u0005\u001a+\u0010\u0007\u001a\u001f\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001j\u0002`\u0004\u00a2\u0006\u0002\u0008\u00052\u0006\u0010\u0008\u001a\u00020\u0003*<\u0010\t\"\u001b\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001\u00a2\u0006\u0002\u0008\u00052\u001b\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001\u00a2\u0006\u0002\u0008\u0005\u00a8\u0006\n"
    }
    d2 = {
        "highestSensorSensitivity",
        "Lkotlin/Function1;",
        "",
        "",
        "Lio/fotoapparat/selector/SensorSensitivitySelector;",
        "Lkotlin/ExtensionFunctionType;",
        "lowestSensorSensitivity",
        "manualSensorSensitivity",
        "iso",
        "SensorSensitivitySelector",
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
.method public static final highestSensorSensitivity()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/Iterable<",
            "Ljava/lang/Integer;",
            ">;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 15
    invoke-static {}, Lio/fotoapparat/selector/SelectorsKt;->highest()Lkotlin/jvm/functions/Function1;

    move-result-object v0

    return-object v0
.end method

.method public static final lowestSensorSensitivity()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/Iterable<",
            "Ljava/lang/Integer;",
            ">;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 20
    invoke-static {}, Lio/fotoapparat/selector/SelectorsKt;->lowest()Lkotlin/jvm/functions/Function1;

    move-result-object v0

    return-object v0
.end method

.method public static final manualSensorSensitivity(I)Lkotlin/jvm/functions/Function1;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/Iterable<",
            "Ljava/lang/Integer;",
            ">;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 10
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-static {p0}, Lio/fotoapparat/selector/SelectorsKt;->single(Ljava/lang/Object;)Lkotlin/jvm/functions/Function1;

    move-result-object p0

    return-object p0
.end method
