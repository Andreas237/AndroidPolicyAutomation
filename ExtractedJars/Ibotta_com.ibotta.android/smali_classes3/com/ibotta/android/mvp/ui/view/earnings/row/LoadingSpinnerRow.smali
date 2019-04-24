.class public Lcom/ibotta/android/mvp/ui/view/earnings/row/LoadingSpinnerRow;
.super Lcom/ibotta/android/mvp/ui/view/earnings/row/AbstractEarningsRow;
.source "LoadingSpinnerRow.java"


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 9
    sget-object v0, Lcom/ibotta/android/mvp/ui/view/earnings/row/EarningsRowType;->LOADING_SPINNER:Lcom/ibotta/android/mvp/ui/view/earnings/row/EarningsRowType;

    invoke-direct {p0, v0}, Lcom/ibotta/android/mvp/ui/view/earnings/row/AbstractEarningsRow;-><init>(Lcom/ibotta/android/mvp/ui/view/earnings/row/EarningsRowType;)V

    return-void
.end method
