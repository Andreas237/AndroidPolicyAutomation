.class public abstract Lcom/ibotta/android/mvp/ui/activity/redeem/verify/holder/AbstractVerifiedRebatesViewHolder;
.super Landroid/support/v7/widget/RecyclerView$ViewHolder;
.source "AbstractVerifiedRebatesViewHolder.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<R:",
        "Lcom/ibotta/android/mvp/ui/activity/redeem/verify/row/AbstractVerifiedRebatesRow;",
        ">",
        "Landroid/support/v7/widget/RecyclerView$ViewHolder;"
    }
.end annotation


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 3

    .line 21
    invoke-direct {p0, p1}, Landroid/support/v7/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    .line 23
    new-instance v0, Landroid/support/v7/widget/RecyclerView$LayoutParams;

    const/4 v1, -0x1

    const/4 v2, -0x2

    invoke-direct {v0, v1, v2}, Landroid/support/v7/widget/RecyclerView$LayoutParams;-><init>(II)V

    .line 25
    invoke-virtual {p1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method


# virtual methods
.method public abstract bind(Lcom/ibotta/android/mvp/ui/activity/redeem/verify/row/AbstractVerifiedRebatesRow;Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesRecyclerAdapterListener;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TR;",
            "Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesRecyclerAdapterListener;",
            ")V"
        }
    .end annotation
.end method
