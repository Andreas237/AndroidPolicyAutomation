.class public interface abstract Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeViewEvents;
.super Ljava/lang/Object;
.source "PwiBarcodeViewEvents.kt"

# interfaces
.implements Lcom/ibotta/android/views/components/ViewEvents;


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008f\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0008\u0010\u0006\u001a\u00020\u0003H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0008\u0010\u0008\u001a\u00020\u0003H&J\u0008\u0010\t\u001a\u00020\u0003H&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeViewEvents;",
        "Lcom/ibotta/android/views/components/ViewEvents;",
        "onCopyBarcodeClick",
        "",
        "viewState",
        "Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeViewState;",
        "onDoneClick",
        "onRevealCardNumber",
        "onStartBarcodeLoading",
        "onStopBarcodeLoading",
        "onTermsOfUseClick",
        "onUpdateBalanceClick",
        "ibotta-views_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# virtual methods
.method public abstract onCopyBarcodeClick(Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeViewState;)V
    .param p1    # Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeViewState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract onDoneClick()V
.end method

.method public abstract onRevealCardNumber(Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeViewState;)V
    .param p1    # Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeViewState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract onStartBarcodeLoading()V
.end method

.method public abstract onStopBarcodeLoading()V
.end method

.method public abstract onTermsOfUseClick(Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeViewState;)V
    .param p1    # Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeViewState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract onUpdateBalanceClick(Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeViewState;)V
    .param p1    # Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeViewState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method
