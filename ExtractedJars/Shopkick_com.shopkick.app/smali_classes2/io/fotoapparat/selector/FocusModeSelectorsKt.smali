.class public final Lio/fotoapparat/selector/FocusModeSelectorsKt;
.super Ljava/lang/Object;
.source "FocusModeSelectors.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u001a#\u0010\u0000\u001a\u001f\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001j\u0002`\u0004\u00a2\u0006\u0002\u0008\u0005\u001a#\u0010\u0006\u001a\u001f\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001j\u0002`\u0004\u00a2\u0006\u0002\u0008\u0005\u001a#\u0010\u0007\u001a\u001f\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001j\u0002`\u0004\u00a2\u0006\u0002\u0008\u0005\u001a#\u0010\u0008\u001a\u001f\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001j\u0002`\u0004\u00a2\u0006\u0002\u0008\u0005\u001a#\u0010\t\u001a\u001f\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001j\u0002`\u0004\u00a2\u0006\u0002\u0008\u0005\u001a#\u0010\n\u001a\u001f\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001j\u0002`\u0004\u00a2\u0006\u0002\u0008\u0005\u001a#\u0010\u000b\u001a\u001f\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001j\u0002`\u0004\u00a2\u0006\u0002\u0008\u0005*<\u0010\u000c\"\u001b\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001\u00a2\u0006\u0002\u0008\u00052\u001b\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001\u00a2\u0006\u0002\u0008\u0005\u00a8\u0006\r"
    }
    d2 = {
        "autoFocus",
        "Lkotlin/Function1;",
        "",
        "Lio/fotoapparat/parameter/FocusMode;",
        "Lio/fotoapparat/selector/FocusModeSelector;",
        "Lkotlin/ExtensionFunctionType;",
        "continuousFocusPicture",
        "continuousFocusVideo",
        "edof",
        "fixed",
        "infinity",
        "macro",
        "FocusModeSelector",
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
.method public static final autoFocus()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/Iterable<",
            "+",
            "Lio/fotoapparat/parameter/FocusMode;",
            ">;",
            "Lio/fotoapparat/parameter/FocusMode;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 29
    sget-object v0, Lio/fotoapparat/parameter/FocusMode$Auto;->INSTANCE:Lio/fotoapparat/parameter/FocusMode$Auto;

    invoke-static {v0}, Lio/fotoapparat/selector/SelectorsKt;->single(Ljava/lang/Object;)Lkotlin/jvm/functions/Function1;

    move-result-object v0

    return-object v0
.end method

.method public static final continuousFocusPicture()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/Iterable<",
            "+",
            "Lio/fotoapparat/parameter/FocusMode;",
            ">;",
            "Lio/fotoapparat/parameter/FocusMode;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 36
    sget-object v0, Lio/fotoapparat/parameter/FocusMode$ContinuousFocusPicture;->INSTANCE:Lio/fotoapparat/parameter/FocusMode$ContinuousFocusPicture;

    invoke-static {v0}, Lio/fotoapparat/selector/SelectorsKt;->single(Ljava/lang/Object;)Lkotlin/jvm/functions/Function1;

    move-result-object v0

    return-object v0
.end method

.method public static final continuousFocusVideo()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/Iterable<",
            "+",
            "Lio/fotoapparat/parameter/FocusMode;",
            ">;",
            "Lio/fotoapparat/parameter/FocusMode;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 43
    sget-object v0, Lio/fotoapparat/parameter/FocusMode$ContinuousFocusVideo;->INSTANCE:Lio/fotoapparat/parameter/FocusMode$ContinuousFocusVideo;

    invoke-static {v0}, Lio/fotoapparat/selector/SelectorsKt;->single(Ljava/lang/Object;)Lkotlin/jvm/functions/Function1;

    move-result-object v0

    return-object v0
.end method

.method public static final edof()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/Iterable<",
            "+",
            "Lio/fotoapparat/parameter/FocusMode;",
            ">;",
            "Lio/fotoapparat/parameter/FocusMode;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 50
    sget-object v0, Lio/fotoapparat/parameter/FocusMode$Edof;->INSTANCE:Lio/fotoapparat/parameter/FocusMode$Edof;

    invoke-static {v0}, Lio/fotoapparat/selector/SelectorsKt;->single(Ljava/lang/Object;)Lkotlin/jvm/functions/Function1;

    move-result-object v0

    return-object v0
.end method

.method public static final fixed()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/Iterable<",
            "+",
            "Lio/fotoapparat/parameter/FocusMode;",
            ">;",
            "Lio/fotoapparat/parameter/FocusMode;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 11
    sget-object v0, Lio/fotoapparat/parameter/FocusMode$Fixed;->INSTANCE:Lio/fotoapparat/parameter/FocusMode$Fixed;

    invoke-static {v0}, Lio/fotoapparat/selector/SelectorsKt;->single(Ljava/lang/Object;)Lkotlin/jvm/functions/Function1;

    move-result-object v0

    return-object v0
.end method

.method public static final infinity()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/Iterable<",
            "+",
            "Lio/fotoapparat/parameter/FocusMode;",
            ">;",
            "Lio/fotoapparat/parameter/FocusMode;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 17
    sget-object v0, Lio/fotoapparat/parameter/FocusMode$Infinity;->INSTANCE:Lio/fotoapparat/parameter/FocusMode$Infinity;

    invoke-static {v0}, Lio/fotoapparat/selector/SelectorsKt;->single(Ljava/lang/Object;)Lkotlin/jvm/functions/Function1;

    move-result-object v0

    return-object v0
.end method

.method public static final macro()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/Iterable<",
            "+",
            "Lio/fotoapparat/parameter/FocusMode;",
            ">;",
            "Lio/fotoapparat/parameter/FocusMode;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 23
    sget-object v0, Lio/fotoapparat/parameter/FocusMode$Macro;->INSTANCE:Lio/fotoapparat/parameter/FocusMode$Macro;

    invoke-static {v0}, Lio/fotoapparat/selector/SelectorsKt;->single(Ljava/lang/Object;)Lkotlin/jvm/functions/Function1;

    move-result-object v0

    return-object v0
.end method
