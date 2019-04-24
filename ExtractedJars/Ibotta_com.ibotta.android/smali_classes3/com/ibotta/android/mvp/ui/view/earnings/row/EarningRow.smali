.class public Lcom/ibotta/android/mvp/ui/view/earnings/row/EarningRow;
.super Lcom/ibotta/android/mvp/ui/view/earnings/row/AbstractEarningsRow;
.source "EarningRow.java"


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 10
    sget-object v0, Lcom/ibotta/android/mvp/ui/view/earnings/row/EarningsRowType;->EARNING:Lcom/ibotta/android/mvp/ui/view/earnings/row/EarningsRowType;

    invoke-direct {p0, v0}, Lcom/ibotta/android/mvp/ui/view/earnings/row/AbstractEarningsRow;-><init>(Lcom/ibotta/android/mvp/ui/view/earnings/row/EarningsRowType;)V

    return-void
.end method
