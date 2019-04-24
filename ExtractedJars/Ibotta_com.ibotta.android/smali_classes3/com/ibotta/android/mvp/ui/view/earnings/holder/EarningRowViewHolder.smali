.class public Lcom/ibotta/android/mvp/ui/view/earnings/holder/EarningRowViewHolder;
.super Lcom/ibotta/android/mvp/ui/view/earnings/holder/AbstractEarningsViewHolder;
.source "EarningRowViewHolder.java"


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/ui/view/earnings/holder/AbstractEarningsViewHolder<",
        "Lcom/ibotta/android/mvp/ui/view/earnings/row/EarningRow;",
        ">;"
    }
.end annotation


# instance fields
.field private final ervEarningRow:Lcom/ibotta/android/mvp/ui/view/earnings/EarningRowView;

.field private listener:Lcom/ibotta/android/mvp/ui/view/earnings/EarningsRecyclerListener;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/view/earnings/EarningRowView;)V
    .locals 0

    .line 19
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/view/earnings/holder/AbstractEarningsViewHolder;-><init>(Landroid/view/View;)V

    .line 20
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/earnings/holder/EarningRowViewHolder;->ervEarningRow:Lcom/ibotta/android/mvp/ui/view/earnings/EarningRowView;

    return-void
.end method

.method public static synthetic lambda$bind$0(Lcom/ibotta/android/mvp/ui/view/earnings/holder/EarningRowViewHolder;Lcom/ibotta/android/mvp/ui/view/earnings/row/EarningRow;Landroid/view/View;)V
    .locals 0

    .line 28
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/view/earnings/holder/EarningRowViewHolder;->onEarningsClicked(Lcom/ibotta/android/mvp/ui/view/earnings/row/EarningRow;)V

    return-void
.end method

.method private onEarningsClicked(Lcom/ibotta/android/mvp/ui/view/earnings/row/EarningRow;)V
    .locals 1

    .line 32
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/earnings/holder/EarningRowViewHolder;->listener:Lcom/ibotta/android/mvp/ui/view/earnings/EarningsRecyclerListener;

    if-eqz v0, :cond_0

    .line 33
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/view/earnings/row/EarningRow;->getEarning()Lcom/ibotta/api/model/earnings/Earning;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/view/earnings/EarningsRecyclerListener;->onEarningRowClicked(Lcom/ibotta/api/model/earnings/Earning;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public bridge synthetic bind(Lcom/ibotta/android/mvp/ui/view/earnings/row/AbstractEarningsRow;Lcom/ibotta/android/mvp/ui/view/earnings/EarningsRecyclerListener;)V
    .locals 0

    .line 13
    check-cast p1, Lcom/ibotta/android/mvp/ui/view/earnings/row/EarningRow;

    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/view/earnings/holder/EarningRowViewHolder;->bind(Lcom/ibotta/android/mvp/ui/view/earnings/row/EarningRow;Lcom/ibotta/android/mvp/ui/view/earnings/EarningsRecyclerListener;)V

    return-void
.end method

.method public bind(Lcom/ibotta/android/mvp/ui/view/earnings/row/EarningRow;Lcom/ibotta/android/mvp/ui/view/earnings/EarningsRecyclerListener;)V
    .locals 1

    .line 25
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/view/earnings/holder/EarningRowViewHolder;->listener:Lcom/ibotta/android/mvp/ui/view/earnings/EarningsRecyclerListener;

    .line 27
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/view/earnings/holder/EarningRowViewHolder;->ervEarningRow:Lcom/ibotta/android/mvp/ui/view/earnings/EarningRowView;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/view/earnings/row/EarningRow;->getEarning()Lcom/ibotta/api/model/earnings/Earning;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/ibotta/android/mvp/ui/view/earnings/EarningRowView;->setEarning(Lcom/ibotta/api/model/earnings/Earning;)V

    .line 28
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/view/earnings/holder/EarningRowViewHolder;->ervEarningRow:Lcom/ibotta/android/mvp/ui/view/earnings/EarningRowView;

    new-instance v0, Lcom/ibotta/android/mvp/ui/view/earnings/holder/-$$Lambda$EarningRowViewHolder$FP4AUsKA9Yazqk6h0g33wfQeDyY;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/mvp/ui/view/earnings/holder/-$$Lambda$EarningRowViewHolder$FP4AUsKA9Yazqk6h0g33wfQeDyY;-><init>(Lcom/ibotta/android/mvp/ui/view/earnings/holder/EarningRowViewHolder;Lcom/ibotta/android/mvp/ui/view/earnings/row/EarningRow;)V

    instance-of p1, p2, Landroid/view/View;

    if-nez p1, :cond_0

    invoke-virtual {p2, v0}, Lcom/ibotta/android/mvp/ui/view/earnings/EarningRowView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    check-cast p2, Landroid/view/View;

    invoke-static {p2, v0}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    :goto_0
    return-void
.end method
