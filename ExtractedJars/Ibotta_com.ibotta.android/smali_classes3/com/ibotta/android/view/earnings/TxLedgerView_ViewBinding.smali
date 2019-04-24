.class public Lcom/ibotta/android/view/earnings/TxLedgerView_ViewBinding;
.super Ljava/lang/Object;
.source "TxLedgerView_ViewBinding.java"

# interfaces
.implements Lbutterknife/Unbinder;


# instance fields
.field private target:Lcom/ibotta/android/view/earnings/TxLedgerView;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/view/earnings/TxLedgerView;)V
    .locals 0
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 21
    invoke-direct {p0, p1, p1}, Lcom/ibotta/android/view/earnings/TxLedgerView_ViewBinding;-><init>(Lcom/ibotta/android/view/earnings/TxLedgerView;Landroid/view/View;)V

    return-void
.end method

.method public constructor <init>(Lcom/ibotta/android/view/earnings/TxLedgerView;Landroid/view/View;)V
    .locals 3
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    iput-object p1, p0, Lcom/ibotta/android/view/earnings/TxLedgerView_ViewBinding;->target:Lcom/ibotta/android/view/earnings/TxLedgerView;

    const-string v0, "field \'tvTxTitle\'"

    .line 28
    const-class v1, Landroid/widget/TextView;

    const v2, 0x7f090591

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p1, Lcom/ibotta/android/view/earnings/TxLedgerView;->tvTxTitle:Landroid/widget/TextView;

    const-string v0, "field \'ivTxLogo\'"

    .line 29
    const-class v1, Landroid/widget/ImageView;

    const v2, 0x7f0902d1

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p1, Lcom/ibotta/android/view/earnings/TxLedgerView;->ivTxLogo:Landroid/widget/ImageView;

    const-string v0, "field \'tlrvPurchaseDate\'"

    .line 30
    const-class v1, Lcom/ibotta/android/view/earnings/TxLedgerRowView;

    const v2, 0x7f09048c

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/view/earnings/TxLedgerRowView;

    iput-object v0, p1, Lcom/ibotta/android/view/earnings/TxLedgerView;->tlrvPurchaseDate:Lcom/ibotta/android/view/earnings/TxLedgerRowView;

    const-string v0, "field \'tlrvPendingPeriod\'"

    .line 31
    const-class v1, Lcom/ibotta/android/view/earnings/TxLedgerRowView;

    const v2, 0x7f09048b

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/view/earnings/TxLedgerRowView;

    iput-object v0, p1, Lcom/ibotta/android/view/earnings/TxLedgerView;->tlrvPendingPeriod:Lcom/ibotta/android/view/earnings/TxLedgerRowView;

    const-string v0, "field \'vDivider1\'"

    const v1, 0x7f0905af

    .line 32
    invoke-static {p2, v1, v0}, Lbutterknife/internal/Utils;->findRequiredView(Landroid/view/View;ILjava/lang/String;)Landroid/view/View;

    move-result-object v0

    iput-object v0, p1, Lcom/ibotta/android/view/earnings/TxLedgerView;->vDivider1:Landroid/view/View;

    const-string v0, "field \'tlrvOffersMatched\'"

    .line 33
    const-class v1, Lcom/ibotta/android/view/earnings/TxLedgerRowView;

    const v2, 0x7f090489

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/view/earnings/TxLedgerRowView;

    iput-object v0, p1, Lcom/ibotta/android/view/earnings/TxLedgerView;->tlrvOffersMatched:Lcom/ibotta/android/view/earnings/TxLedgerRowView;

    const-string v0, "field \'tlrvOfferEarnings\'"

    .line 34
    const-class v1, Lcom/ibotta/android/view/earnings/TxLedgerRowView;

    const v2, 0x7f090488

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/view/earnings/TxLedgerRowView;

    iput-object v0, p1, Lcom/ibotta/android/view/earnings/TxLedgerView;->tlrvOfferEarnings:Lcom/ibotta/android/view/earnings/TxLedgerRowView;

    const-string v0, "field \'vDivider2\'"

    const v1, 0x7f0905b0

    .line 35
    invoke-static {p2, v1, v0}, Lbutterknife/internal/Utils;->findRequiredView(Landroid/view/View;ILjava/lang/String;)Landroid/view/View;

    move-result-object v0

    iput-object v0, p1, Lcom/ibotta/android/view/earnings/TxLedgerView;->vDivider2:Landroid/view/View;

    const-string v0, "field \'tlrvPendingEarnings\'"

    .line 36
    const-class v1, Lcom/ibotta/android/view/earnings/TxLedgerRowView;

    const v2, 0x7f09048a

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/view/earnings/TxLedgerRowView;

    iput-object v0, p1, Lcom/ibotta/android/view/earnings/TxLedgerView;->tlrvPendingEarnings:Lcom/ibotta/android/view/earnings/TxLedgerRowView;

    const-string v0, "field \'tlrvTotalEarnings\'"

    .line 37
    const-class v1, Lcom/ibotta/android/view/earnings/TxLedgerRowView;

    const v2, 0x7f09048d

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/view/earnings/TxLedgerRowView;

    iput-object v0, p1, Lcom/ibotta/android/view/earnings/TxLedgerView;->tlrvTotalEarnings:Lcom/ibotta/android/view/earnings/TxLedgerRowView;

    const-string v0, "field \'llOtherRewards\'"

    .line 38
    const-class v1, Landroid/widget/LinearLayout;

    const v2, 0x7f09031c

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p1, Lcom/ibotta/android/view/earnings/TxLedgerView;->llOtherRewards:Landroid/widget/LinearLayout;

    const-string v0, "field \'tvOtherRewardsValue\'"

    .line 39
    const-class v1, Landroid/widget/TextView;

    const v2, 0x7f090559

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/widget/TextView;

    iput-object p2, p1, Lcom/ibotta/android/view/earnings/TxLedgerView;->tvOtherRewardsValue:Landroid/widget/TextView;

    return-void
.end method


# virtual methods
.method public unbind()V
    .locals 2
    .annotation build Landroid/support/annotation/CallSuper;
    .end annotation

    .line 45
    iget-object v0, p0, Lcom/ibotta/android/view/earnings/TxLedgerView_ViewBinding;->target:Lcom/ibotta/android/view/earnings/TxLedgerView;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 47
    iput-object v1, p0, Lcom/ibotta/android/view/earnings/TxLedgerView_ViewBinding;->target:Lcom/ibotta/android/view/earnings/TxLedgerView;

    .line 49
    iput-object v1, v0, Lcom/ibotta/android/view/earnings/TxLedgerView;->tvTxTitle:Landroid/widget/TextView;

    .line 50
    iput-object v1, v0, Lcom/ibotta/android/view/earnings/TxLedgerView;->ivTxLogo:Landroid/widget/ImageView;

    .line 51
    iput-object v1, v0, Lcom/ibotta/android/view/earnings/TxLedgerView;->tlrvPurchaseDate:Lcom/ibotta/android/view/earnings/TxLedgerRowView;

    .line 52
    iput-object v1, v0, Lcom/ibotta/android/view/earnings/TxLedgerView;->tlrvPendingPeriod:Lcom/ibotta/android/view/earnings/TxLedgerRowView;

    .line 53
    iput-object v1, v0, Lcom/ibotta/android/view/earnings/TxLedgerView;->vDivider1:Landroid/view/View;

    .line 54
    iput-object v1, v0, Lcom/ibotta/android/view/earnings/TxLedgerView;->tlrvOffersMatched:Lcom/ibotta/android/view/earnings/TxLedgerRowView;

    .line 55
    iput-object v1, v0, Lcom/ibotta/android/view/earnings/TxLedgerView;->tlrvOfferEarnings:Lcom/ibotta/android/view/earnings/TxLedgerRowView;

    .line 56
    iput-object v1, v0, Lcom/ibotta/android/view/earnings/TxLedgerView;->vDivider2:Landroid/view/View;

    .line 57
    iput-object v1, v0, Lcom/ibotta/android/view/earnings/TxLedgerView;->tlrvPendingEarnings:Lcom/ibotta/android/view/earnings/TxLedgerRowView;

    .line 58
    iput-object v1, v0, Lcom/ibotta/android/view/earnings/TxLedgerView;->tlrvTotalEarnings:Lcom/ibotta/android/view/earnings/TxLedgerRowView;

    .line 59
    iput-object v1, v0, Lcom/ibotta/android/view/earnings/TxLedgerView;->llOtherRewards:Landroid/widget/LinearLayout;

    .line 60
    iput-object v1, v0, Lcom/ibotta/android/view/earnings/TxLedgerView;->tvOtherRewardsValue:Landroid/widget/TextView;

    return-void

    .line 46
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Bindings already cleared."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
