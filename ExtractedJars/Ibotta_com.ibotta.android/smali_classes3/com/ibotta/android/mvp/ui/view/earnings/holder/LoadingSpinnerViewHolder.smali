.class public Lcom/ibotta/android/mvp/ui/view/earnings/holder/LoadingSpinnerViewHolder;
.super Lcom/ibotta/android/mvp/ui/view/earnings/holder/AbstractEarningsViewHolder;
.source "LoadingSpinnerViewHolder.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/ui/view/earnings/holder/AbstractEarningsViewHolder<",
        "Lcom/ibotta/android/mvp/ui/view/earnings/row/LoadingSpinnerRow;",
        ">;"
    }
.end annotation


# instance fields
.field private final lsvLoadingSpinner:Lcom/ibotta/android/mvp/ui/view/earnings/LoadingSpinnerView;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/view/earnings/LoadingSpinnerView;)V
    .locals 0

    .line 16
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/view/earnings/holder/AbstractEarningsViewHolder;-><init>(Landroid/view/View;)V

    .line 17
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/earnings/holder/LoadingSpinnerViewHolder;->lsvLoadingSpinner:Lcom/ibotta/android/mvp/ui/view/earnings/LoadingSpinnerView;

    return-void
.end method


# virtual methods
.method public bridge synthetic bind(Lcom/ibotta/android/mvp/ui/view/earnings/row/AbstractEarningsRow;Lcom/ibotta/android/mvp/ui/view/earnings/EarningsRecyclerListener;)V
    .locals 0

    .line 12
    check-cast p1, Lcom/ibotta/android/mvp/ui/view/earnings/row/LoadingSpinnerRow;

    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/view/earnings/holder/LoadingSpinnerViewHolder;->bind(Lcom/ibotta/android/mvp/ui/view/earnings/row/LoadingSpinnerRow;Lcom/ibotta/android/mvp/ui/view/earnings/EarningsRecyclerListener;)V

    return-void
.end method

.method public bind(Lcom/ibotta/android/mvp/ui/view/earnings/row/LoadingSpinnerRow;Lcom/ibotta/android/mvp/ui/view/earnings/EarningsRecyclerListener;)V
    .locals 0

    return-void
.end method
