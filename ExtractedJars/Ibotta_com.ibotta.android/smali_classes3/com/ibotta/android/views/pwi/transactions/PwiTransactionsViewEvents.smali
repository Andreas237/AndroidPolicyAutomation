.class public interface abstract Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsViewEvents;
.super Ljava/lang/Object;
.source "PwiTransactionsViewEvents.kt"

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
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008f\u0018\u00002\u00020\u0001J\u0008\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0008\u0010\u0007\u001a\u00020\u0003H&J\u0008\u0010\u0008\u001a\u00020\u0003H&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsViewEvents;",
        "Lcom/ibotta/android/views/components/ViewEvents;",
        "onManageAllTransactionsClick",
        "",
        "onRowTapped",
        "viewState",
        "Lcom/ibotta/android/views/pwi/transactions/PwiTransactionRowViewState;",
        "onShowPwiRetailersClick",
        "onSpentFilterClick",
        "onTransactionActionClick",
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
.method public abstract onManageAllTransactionsClick()V
.end method

.method public abstract onRowTapped(Lcom/ibotta/android/views/pwi/transactions/PwiTransactionRowViewState;)V
    .param p1    # Lcom/ibotta/android/views/pwi/transactions/PwiTransactionRowViewState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract onShowPwiRetailersClick()V
.end method

.method public abstract onSpentFilterClick()V
.end method

.method public abstract onTransactionActionClick(Lcom/ibotta/android/views/pwi/transactions/PwiTransactionRowViewState;)V
    .param p1    # Lcom/ibotta/android/views/pwi/transactions/PwiTransactionRowViewState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method
