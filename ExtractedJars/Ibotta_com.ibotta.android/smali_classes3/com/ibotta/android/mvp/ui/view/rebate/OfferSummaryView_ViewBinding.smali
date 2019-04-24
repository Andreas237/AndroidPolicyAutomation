.class public Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView_ViewBinding;
.super Ljava/lang/Object;
.source "OfferSummaryView_ViewBinding.java"

# interfaces
.implements Lbutterknife/Unbinder;


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation


# instance fields
.field private target:Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView;

.field private view7f0900a7:Landroid/view/View;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView;)V
    .locals 0
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 24
    invoke-direct {p0, p1, p1}, Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView_ViewBinding;-><init>(Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView;Landroid/view/View;)V

    return-void
.end method

.method public constructor <init>(Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView;Landroid/view/View;)V
    .locals 3
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView;

    const-string v0, "field \'oatvAmount\'"

    .line 32
    const-class v1, Lcom/ibotta/android/mvp/ui/view/rebate/OfferAmountTextView;

    const v2, 0x7f090385

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/view/rebate/OfferAmountTextView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView;->oatvAmount:Lcom/ibotta/android/mvp/ui/view/rebate/OfferAmountTextView;

    const-string v0, "field \'tvDetails\'"

    .line 33
    const-class v1, Landroid/widget/TextView;

    const v2, 0x7f090518

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView;->tvDetails:Landroid/widget/TextView;

    const-string v0, "field \'tvCaption\'"

    .line 34
    const-class v1, Landroid/widget/TextView;

    const v2, 0x7f090503

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView;->tvCaption:Landroid/widget/TextView;

    const-string v0, "field \'tvExpiration\'"

    .line 35
    const-class v1, Landroid/widget/TextView;

    const v2, 0x7f090520

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView;->tvExpiration:Landroid/widget/TextView;

    const-string v0, "field \'iibIbottaImageButton\'"

    .line 36
    const-class v1, Lcom/ibotta/android/views/base/button/IbottaImageButton;

    const v2, 0x7f090246

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/views/base/button/IbottaImageButton;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView;->iibIbottaImageButton:Lcom/ibotta/android/views/base/button/IbottaImageButton;

    const-string v0, "field \'bShop\' and method \'onShopClicked\'"

    const v1, 0x7f0900a7

    .line 37
    invoke-static {p2, v1, v0}, Lbutterknife/internal/Utils;->findRequiredView(Landroid/view/View;ILjava/lang/String;)Landroid/view/View;

    move-result-object p2

    const-string v0, "field \'bShop\'"

    .line 38
    const-class v2, Landroid/widget/Button;

    invoke-static {p2, v1, v0, v2}, Lbutterknife/internal/Utils;->castView(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView;->bShop:Landroid/widget/Button;

    .line 39
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView_ViewBinding;->view7f0900a7:Landroid/view/View;

    .line 40
    new-instance v0, Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView_ViewBinding$1;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView_ViewBinding$1;-><init>(Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView_ViewBinding;Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView;)V

    instance-of p1, p2, Landroid/view/View;

    if-nez p1, :cond_0

    invoke-virtual {p2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    check-cast p2, Landroid/view/View;

    invoke-static {p2, v0}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    :goto_0
    return-void
.end method


# virtual methods
.method public unbind()V
    .locals 3
    .annotation build Landroid/support/annotation/CallSuper;
    .end annotation

    .line 51
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView;

    if-eqz v0, :cond_1

    const/4 v1, 0x0

    .line 53
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView;

    .line 55
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView;->oatvAmount:Lcom/ibotta/android/mvp/ui/view/rebate/OfferAmountTextView;

    .line 56
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView;->tvDetails:Landroid/widget/TextView;

    .line 57
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView;->tvCaption:Landroid/widget/TextView;

    .line 58
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView;->tvExpiration:Landroid/widget/TextView;

    .line 59
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView;->iibIbottaImageButton:Lcom/ibotta/android/views/base/button/IbottaImageButton;

    .line 60
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView;->bShop:Landroid/widget/Button;

    .line 62
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView_ViewBinding;->view7f0900a7:Landroid/view/View;

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_0

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 63
    :goto_0
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView_ViewBinding;->view7f0900a7:Landroid/view/View;

    return-void

    .line 52
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Bindings already cleared."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
