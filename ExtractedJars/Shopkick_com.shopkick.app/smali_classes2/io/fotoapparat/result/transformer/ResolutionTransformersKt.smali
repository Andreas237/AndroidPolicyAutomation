.class public final Lio/fotoapparat/result/transformer/ResolutionTransformersKt;
.super Ljava/lang/Object;
.source "ResolutionTransformers.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0002\u001a\u0016\u0010\u0000\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001j\u0002`\u0003\u001a\u001e\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001j\u0002`\u00032\u0006\u0010\u0005\u001a\u00020\u0006*\"\u0010\u0007\"\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001\u00a8\u0006\u0008"
    }
    d2 = {
        "originalResolution",
        "Lkotlin/Function1;",
        "Lio/fotoapparat/parameter/Resolution;",
        "Lio/fotoapparat/result/transformer/ResolutionTransformer;",
        "scaled",
        "scaleFactor",
        "",
        "ResolutionTransformer",
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
.method public static final originalResolution()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1<",
            "Lio/fotoapparat/parameter/Resolution;",
            "Lio/fotoapparat/parameter/Resolution;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 10
    sget-object v0, Lio/fotoapparat/result/transformer/ResolutionTransformersKt$originalResolution$1;->INSTANCE:Lio/fotoapparat/result/transformer/ResolutionTransformersKt$originalResolution$1;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    return-object v0
.end method

.method public static final scaled(F)Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(F)",
            "Lkotlin/jvm/functions/Function1<",
            "Lio/fotoapparat/parameter/Resolution;",
            "Lio/fotoapparat/parameter/Resolution;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 16
    new-instance v0, Lio/fotoapparat/result/transformer/ResolutionTransformersKt$scaled$1;

    invoke-direct {v0, p0}, Lio/fotoapparat/result/transformer/ResolutionTransformersKt$scaled$1;-><init>(F)V

    check-cast v0, Lkotlin/jvm/functions/Function1;

    return-object v0
.end method
