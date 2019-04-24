.class public interface abstract Lio/fotoapparat/view/FocalPointSelector;
.super Ljava/lang/Object;
.source "FocusPointSelector.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008f\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005H&\u00a8\u0006\u0007"
    }
    d2 = {
        "Lio/fotoapparat/view/FocalPointSelector;",
        "",
        "setFocalPointListener",
        "",
        "listener",
        "Lkotlin/Function1;",
        "Lio/fotoapparat/hardware/metering/FocalRequest;",
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
.method public abstract setFocalPointListener(Lkotlin/jvm/functions/Function1;)V
    .param p1    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lio/fotoapparat/hardware/metering/FocalRequest;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation
.end method
