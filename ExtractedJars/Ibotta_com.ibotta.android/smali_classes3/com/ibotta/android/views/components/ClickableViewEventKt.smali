.class public final Lcom/ibotta/android/views/components/ClickableViewEventKt;
.super Ljava/lang/Object;
.source "ClickableViewEvent.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u00012\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "ClickableViewEvent",
        "Lcom/ibotta/android/views/components/ClickableViewEvent;",
        "function",
        "Lkotlin/Function0;",
        "",
        "ibotta-views_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# direct methods
.method public static final ClickableViewEvent(Lkotlin/jvm/functions/Function0;)Lcom/ibotta/android/views/components/ClickableViewEvent;
    .locals 1
    .param p0    # Lkotlin/jvm/functions/Function0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)",
            "Lcom/ibotta/android/views/components/ClickableViewEvent;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "function"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    new-instance v0, Lcom/ibotta/android/views/components/ClickableViewEventKt$ClickableViewEvent$1;

    invoke-direct {v0, p0}, Lcom/ibotta/android/views/components/ClickableViewEventKt$ClickableViewEvent$1;-><init>(Lkotlin/jvm/functions/Function0;)V

    check-cast v0, Lcom/ibotta/android/views/components/ClickableViewEvent;

    return-object v0
.end method
