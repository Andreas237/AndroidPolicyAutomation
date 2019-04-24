.class public Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView_ViewBinding;
.super Ljava/lang/Object;
.source "RebateRowView_ViewBinding.java"

# interfaces
.implements Lbutterknife/Unbinder;


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation


# instance fields
.field private target:Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;

.field private view7f0900a7:Landroid/view/View;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;)V
    .locals 0
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 25
    invoke-direct {p0, p1, p1}, Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView_ViewBinding;-><init>(Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;Landroid/view/View;)V

    return-void
.end method

.method public constructor <init>(Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;Landroid/view/View;)V
    .locals 4
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;

    const-string v0, "field \'ivProduct\'"

    .line 33
    const-class v1, Landroid/widget/ImageView;

    const v2, 0x7f0902bc

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;->ivProduct:Landroid/widget/ImageView;

    const-string v0, "field \'ebvExpirationBanner\'"

    .line 34
    const-class v1, Lcom/ibotta/android/mvp/ui/view/rebate/ExpiringBannerView;

    const v2, 0x7f0901a8

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/view/rebate/ExpiringBannerView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;->ebvExpirationBanner:Lcom/ibotta/android/mvp/ui/view/rebate/ExpiringBannerView;

    const-string v0, "field \'oatvAmount\'"

    .line 35
    const-class v1, Lcom/ibotta/android/mvp/ui/view/rebate/OfferAmountTextView;

    const v2, 0x7f090385

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/view/rebate/OfferAmountTextView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;->oatvAmount:Lcom/ibotta/android/mvp/ui/view/rebate/OfferAmountTextView;

    const-string v0, "field \'tvName\'"

    .line 36
    const-class v1, Landroid/widget/TextView;

    const v2, 0x7f09054d

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;->tvName:Landroid/widget/TextView;

    const-string v0, "field \'tvCaption\'"

    .line 37
    const-class v1, Landroid/widget/TextView;

    const v2, 0x7f090503

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;->tvCaption:Landroid/widget/TextView;

    const-string v0, "field \'tvExpiration\'"

    .line 38
    const-class v1, Landroid/widget/TextView;

    const v2, 0x7f090520

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;->tvExpiration:Landroid/widget/TextView;

    const-string v0, "field \'iibIbottaImageButton\'"

    .line 39
    const-class v1, Lcom/ibotta/android/views/base/button/IbottaImageButton;

    const v2, 0x7f090246

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/views/base/button/IbottaImageButton;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;->iibIbottaImageButton:Lcom/ibotta/android/views/base/button/IbottaImageButton;

    const-string v0, "field \'bShop\' and method \'onShopClicked\'"

    const v1, 0x7f0900a7

    .line 40
    invoke-static {p2, v1, v0}, Lbutterknife/internal/Utils;->findRequiredView(Landroid/view/View;ILjava/lang/String;)Landroid/view/View;

    move-result-object v0

    const-string v2, "field \'bShop\'"

    .line 41
    const-class v3, Landroid/widget/Button;

    invoke-static {v0, v1, v2, v3}, Lbutterknife/internal/Utils;->castView(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/widget/Button;

    iput-object v1, p1, Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;->bShop:Landroid/widget/Button;

    .line 42
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView_ViewBinding;->view7f0900a7:Landroid/view/View;

    .line 43
    new-instance v1, Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView_ViewBinding$1;

    invoke-direct {v1, p0, p1}, Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView_ViewBinding$1;-><init>(Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView_ViewBinding;Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;)V

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_0

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    :goto_0
    const v0, 0x7f0903ca

    const-string v1, "field \'rivIndicator\'"

    .line 49
    const-class v2, Lcom/ibotta/android/mvp/ui/view/rebate/RebateIndicatorView;

    invoke-static {p2, v0, v1, v2}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/ibotta/android/mvp/ui/view/rebate/RebateIndicatorView;

    iput-object p2, p1, Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;->rivIndicator:Lcom/ibotta/android/mvp/ui/view/rebate/RebateIndicatorView;

    return-void
.end method


# virtual methods
.method public unbind()V
    .locals 3
    .annotation build Landroid/support/annotation/CallSuper;
    .end annotation

    .line 55
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;

    if-eqz v0, :cond_1

    const/4 v1, 0x0

    .line 57
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;

    .line 59
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;->ivProduct:Landroid/widget/ImageView;

    .line 60
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;->ebvExpirationBanner:Lcom/ibotta/android/mvp/ui/view/rebate/ExpiringBannerView;

    .line 61
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;->oatvAmount:Lcom/ibotta/android/mvp/ui/view/rebate/OfferAmountTextView;

    .line 62
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;->tvName:Landroid/widget/TextView;

    .line 63
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;->tvCaption:Landroid/widget/TextView;

    .line 64
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;->tvExpiration:Landroid/widget/TextView;

    .line 65
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;->iibIbottaImageButton:Lcom/ibotta/android/views/base/button/IbottaImageButton;

    .line 66
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;->bShop:Landroid/widget/Button;

    .line 67
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;->rivIndicator:Lcom/ibotta/android/mvp/ui/view/rebate/RebateIndicatorView;

    .line 69
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView_ViewBinding;->view7f0900a7:Landroid/view/View;

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_0

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 70
    :goto_0
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView_ViewBinding;->view7f0900a7:Landroid/view/View;

    return-void

    .line 56
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Bindings already cleared."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
