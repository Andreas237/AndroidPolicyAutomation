.class public final Lio/fotoapparat/selector/AntiBandingModeSelectorsKt;
.super Ljava/lang/Object;
.source "AntiBandingModeSelectors.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u001a#\u0010\u0000\u001a\u001f\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001j\u0002`\u0004\u00a2\u0006\u0002\u0008\u0005\u001a#\u0010\u0006\u001a\u001f\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001j\u0002`\u0004\u00a2\u0006\u0002\u0008\u0005\u001a#\u0010\u0007\u001a\u001f\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001j\u0002`\u0004\u00a2\u0006\u0002\u0008\u0005\u001a#\u0010\u0008\u001a\u001f\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001j\u0002`\u0004\u00a2\u0006\u0002\u0008\u0005*<\u0010\t\"\u001b\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001\u00a2\u0006\u0002\u0008\u00052\u001b\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001\u00a2\u0006\u0002\u0008\u0005\u00a8\u0006\n"
    }
    d2 = {
        "auto",
        "Lkotlin/Function1;",
        "",
        "Lio/fotoapparat/parameter/AntiBandingMode;",
        "Lio/fotoapparat/selector/AntiBandingModeSelector;",
        "Lkotlin/ExtensionFunctionType;",
        "hz50",
        "hz60",
        "none",
        "AntiBandingModeSelector",
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
.method public static final auto()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/Iterable<",
            "+",
            "Lio/fotoapparat/parameter/AntiBandingMode;",
            ">;",
            "Lio/fotoapparat/parameter/AntiBandingMode;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 11
    sget-object v0, Lio/fotoapparat/parameter/AntiBandingMode$Auto;->INSTANCE:Lio/fotoapparat/parameter/AntiBandingMode$Auto;

    invoke-static {v0}, Lio/fotoapparat/selector/SelectorsKt;->single(Ljava/lang/Object;)Lkotlin/jvm/functions/Function1;

    move-result-object v0

    return-object v0
.end method

.method public static final hz50()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/Iterable<",
            "+",
            "Lio/fotoapparat/parameter/AntiBandingMode;",
            ">;",
            "Lio/fotoapparat/parameter/AntiBandingMode;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 18
    sget-object v0, Lio/fotoapparat/parameter/AntiBandingMode$HZ50;->INSTANCE:Lio/fotoapparat/parameter/AntiBandingMode$HZ50;

    invoke-static {v0}, Lio/fotoapparat/selector/SelectorsKt;->single(Ljava/lang/Object;)Lkotlin/jvm/functions/Function1;

    move-result-object v0

    return-object v0
.end method

.method public static final hz60()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/Iterable<",
            "+",
            "Lio/fotoapparat/parameter/AntiBandingMode;",
            ">;",
            "Lio/fotoapparat/parameter/AntiBandingMode;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 24
    sget-object v0, Lio/fotoapparat/parameter/AntiBandingMode$HZ60;->INSTANCE:Lio/fotoapparat/parameter/AntiBandingMode$HZ60;

    invoke-static {v0}, Lio/fotoapparat/selector/SelectorsKt;->single(Ljava/lang/Object;)Lkotlin/jvm/functions/Function1;

    move-result-object v0

    return-object v0
.end method

.method public static final none()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/Iterable<",
            "+",
            "Lio/fotoapparat/parameter/AntiBandingMode;",
            ">;",
            "Lio/fotoapparat/parameter/AntiBandingMode;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 30
    sget-object v0, Lio/fotoapparat/parameter/AntiBandingMode$None;->INSTANCE:Lio/fotoapparat/parameter/AntiBandingMode$None;

    invoke-static {v0}, Lio/fotoapparat/selector/SelectorsKt;->single(Ljava/lang/Object;)Lkotlin/jvm/functions/Function1;

    move-result-object v0

    return-object v0
.end method
