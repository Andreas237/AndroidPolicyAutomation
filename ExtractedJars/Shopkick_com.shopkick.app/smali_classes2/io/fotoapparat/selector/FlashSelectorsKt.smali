.class public final Lio/fotoapparat/selector/FlashSelectorsKt;
.super Ljava/lang/Object;
.source "FlashSelectors.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a#\u0010\u0000\u001a\u001f\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001j\u0002`\u0004\u00a2\u0006\u0002\u0008\u0005\u001a#\u0010\u0006\u001a\u001f\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001j\u0002`\u0004\u00a2\u0006\u0002\u0008\u0005\u001a#\u0010\u0007\u001a\u001f\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001j\u0002`\u0004\u00a2\u0006\u0002\u0008\u0005\u001a#\u0010\u0008\u001a\u001f\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001j\u0002`\u0004\u00a2\u0006\u0002\u0008\u0005\u001a#\u0010\t\u001a\u001f\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001j\u0002`\u0004\u00a2\u0006\u0002\u0008\u0005*<\u0010\n\"\u001b\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001\u00a2\u0006\u0002\u0008\u00052\u001b\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001\u00a2\u0006\u0002\u0008\u0005\u00a8\u0006\u000b"
    }
    d2 = {
        "autoFlash",
        "Lkotlin/Function1;",
        "",
        "Lio/fotoapparat/parameter/Flash;",
        "Lio/fotoapparat/selector/FlashSelector;",
        "Lkotlin/ExtensionFunctionType;",
        "autoRedEye",
        "off",
        "on",
        "torch",
        "FlashSelector",
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
.method public static final autoFlash()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/Iterable<",
            "+",
            "Lio/fotoapparat/parameter/Flash;",
            ">;",
            "Lio/fotoapparat/parameter/Flash;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 23
    sget-object v0, Lio/fotoapparat/parameter/Flash$Auto;->INSTANCE:Lio/fotoapparat/parameter/Flash$Auto;

    invoke-static {v0}, Lio/fotoapparat/selector/SelectorsKt;->single(Ljava/lang/Object;)Lkotlin/jvm/functions/Function1;

    move-result-object v0

    return-object v0
.end method

.method public static final autoRedEye()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/Iterable<",
            "+",
            "Lio/fotoapparat/parameter/Flash;",
            ">;",
            "Lio/fotoapparat/parameter/Flash;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 30
    sget-object v0, Lio/fotoapparat/parameter/Flash$AutoRedEye;->INSTANCE:Lio/fotoapparat/parameter/Flash$AutoRedEye;

    invoke-static {v0}, Lio/fotoapparat/selector/SelectorsKt;->single(Ljava/lang/Object;)Lkotlin/jvm/functions/Function1;

    move-result-object v0

    return-object v0
.end method

.method public static final off()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/Iterable<",
            "+",
            "Lio/fotoapparat/parameter/Flash;",
            ">;",
            "Lio/fotoapparat/parameter/Flash;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 11
    sget-object v0, Lio/fotoapparat/parameter/Flash$Off;->INSTANCE:Lio/fotoapparat/parameter/Flash$Off;

    invoke-static {v0}, Lio/fotoapparat/selector/SelectorsKt;->single(Ljava/lang/Object;)Lkotlin/jvm/functions/Function1;

    move-result-object v0

    return-object v0
.end method

.method public static final on()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/Iterable<",
            "+",
            "Lio/fotoapparat/parameter/Flash;",
            ">;",
            "Lio/fotoapparat/parameter/Flash;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 17
    sget-object v0, Lio/fotoapparat/parameter/Flash$On;->INSTANCE:Lio/fotoapparat/parameter/Flash$On;

    invoke-static {v0}, Lio/fotoapparat/selector/SelectorsKt;->single(Ljava/lang/Object;)Lkotlin/jvm/functions/Function1;

    move-result-object v0

    return-object v0
.end method

.method public static final torch()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/Iterable<",
            "+",
            "Lio/fotoapparat/parameter/Flash;",
            ">;",
            "Lio/fotoapparat/parameter/Flash;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 37
    sget-object v0, Lio/fotoapparat/parameter/Flash$Torch;->INSTANCE:Lio/fotoapparat/parameter/Flash$Torch;

    invoke-static {v0}, Lio/fotoapparat/selector/SelectorsKt;->single(Ljava/lang/Object;)Lkotlin/jvm/functions/Function1;

    move-result-object v0

    return-object v0
.end method
