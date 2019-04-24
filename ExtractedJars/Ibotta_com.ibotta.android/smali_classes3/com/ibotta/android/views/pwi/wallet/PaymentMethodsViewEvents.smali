.class public interface abstract Lcom/ibotta/android/views/pwi/wallet/PaymentMethodsViewEvents;
.super Ljava/lang/Object;
.source "PaymentMethodsViewEvents.kt"

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
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008f\u0018\u00002\u00020\u0001J\u0008\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\u0008"
    }
    d2 = {
        "Lcom/ibotta/android/views/pwi/wallet/PaymentMethodsViewEvents;",
        "Lcom/ibotta/android/views/components/ViewEvents;",
        "onAddNewPaymentMethodClicked",
        "",
        "onGooglePayRowClicked",
        "viewState",
        "Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowViewState;",
        "onPaymentMethodRowClicked",
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
.method public abstract onAddNewPaymentMethodClicked()V
.end method

.method public abstract onGooglePayRowClicked(Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowViewState;)V
    .param p1    # Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowViewState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract onPaymentMethodRowClicked(Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowViewState;)V
    .param p1    # Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowViewState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method
