.class public Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowActivity_ViewBinding;
.super Ljava/lang/Object;
.source "LoyaltyCardShowActivity_ViewBinding.java"

# interfaces
.implements Lbutterknife/Unbinder;


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation


# instance fields
.field private target:Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowActivity;

.field private view7f09007b:Landroid/view/View;

.field private view7f09009c:Landroid/view/View;

.field private view7f0900af:Landroid/view/View;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowActivity;)V
    .locals 1
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 33
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowActivity_ViewBinding;-><init>(Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowActivity;Landroid/view/View;)V

    return-void
.end method

.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowActivity;Landroid/view/View;)V
    .locals 4
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowActivity_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowActivity;

    const-string v0, "field \'srlSwipeRefresh\'"

    .line 41
    const-class v1, Lcom/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout;

    const v2, 0x7f090426

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowActivity;->srlSwipeRefresh:Lcom/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout;

    const-string v0, "field \'ivLogo\'"

    .line 42
    const-class v1, Landroid/widget/ImageView;

    const v2, 0x7f0902b4

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowActivity;->ivLogo:Landroid/widget/ImageView;

    const-string v0, "field \'ncvNotConnected\'"

    .line 43
    const-class v1, Lcom/ibotta/android/mvp/ui/view/loyalty/NotConnectedView;

    const v2, 0x7f090379

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/view/loyalty/NotConnectedView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowActivity;->ncvNotConnected:Lcom/ibotta/android/mvp/ui/view/loyalty/NotConnectedView;

    const-string v0, "field \'nlcvNumericCard\'"

    .line 44
    const-class v1, Lcom/ibotta/android/mvp/ui/view/loyalty/NumericLoyaltyCardView;

    const v2, 0x7f09037c

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/view/loyalty/NumericLoyaltyCardView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowActivity;->nlcvNumericCard:Lcom/ibotta/android/mvp/ui/view/loyalty/NumericLoyaltyCardView;

    const-string v0, "field \'blcvBarcodeCard\'"

    .line 45
    const-class v1, Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeLoyaltyCardView;

    const v2, 0x7f0900b9

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeLoyaltyCardView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowActivity;->blcvBarcodeCard:Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeLoyaltyCardView;

    const-string v0, "field \'livInstructions\'"

    .line 46
    const-class v1, Lcom/ibotta/android/mvp/ui/view/loyalty/LoyaltyInstructionsView;

    const v2, 0x7f0902f7

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/view/loyalty/LoyaltyInstructionsView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowActivity;->livInstructions:Lcom/ibotta/android/mvp/ui/view/loyalty/LoyaltyInstructionsView;

    const-string v0, "field \'llButtons\'"

    .line 47
    const-class v1, Landroid/widget/LinearLayout;

    const v2, 0x7f090300

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowActivity;->llButtons:Landroid/widget/LinearLayout;

    const-string v0, "field \'bAddCard\' and method \'onAddCardClicked\'"

    const v1, 0x7f09007b

    .line 48
    invoke-static {p2, v1, v0}, Lbutterknife/internal/Utils;->findRequiredView(Landroid/view/View;ILjava/lang/String;)Landroid/view/View;

    move-result-object v0

    const-string v2, "field \'bAddCard\'"

    .line 49
    const-class v3, Landroid/widget/Button;

    invoke-static {v0, v1, v2, v3}, Lbutterknife/internal/Utils;->castView(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/widget/Button;

    iput-object v1, p1, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowActivity;->bAddCard:Landroid/widget/Button;

    .line 50
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowActivity_ViewBinding;->view7f09007b:Landroid/view/View;

    .line 51
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowActivity_ViewBinding$1;

    invoke-direct {v1, p0, p1}, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowActivity_ViewBinding$1;-><init>(Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowActivity_ViewBinding;Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowActivity;)V

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_0

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    :goto_0
    const-string v0, "field \'bUseReceipt\' and method \'onUseReceiptClicked\'"

    const v1, 0x7f0900af

    .line 57
    invoke-static {p2, v1, v0}, Lbutterknife/internal/Utils;->findRequiredView(Landroid/view/View;ILjava/lang/String;)Landroid/view/View;

    move-result-object v0

    const-string v2, "field \'bUseReceipt\'"

    .line 58
    const-class v3, Landroid/widget/Button;

    invoke-static {v0, v1, v2, v3}, Lbutterknife/internal/Utils;->castView(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/widget/Button;

    iput-object v1, p1, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowActivity;->bUseReceipt:Landroid/widget/Button;

    .line 59
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowActivity_ViewBinding;->view7f0900af:Landroid/view/View;

    .line 60
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowActivity_ViewBinding$2;

    invoke-direct {v1, p0, p1}, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowActivity_ViewBinding$2;-><init>(Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowActivity_ViewBinding;Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowActivity;)V

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_1

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_1

    :cond_1
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    :goto_1
    const-string v0, "field \'bRemoveCard\' and method \'onRemoveCardClicked\'"

    const v1, 0x7f09009c

    .line 66
    invoke-static {p2, v1, v0}, Lbutterknife/internal/Utils;->findRequiredView(Landroid/view/View;ILjava/lang/String;)Landroid/view/View;

    move-result-object p2

    const-string v0, "field \'bRemoveCard\'"

    .line 67
    const-class v2, Landroid/widget/Button;

    invoke-static {p2, v1, v0, v2}, Lbutterknife/internal/Utils;->castView(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowActivity;->bRemoveCard:Landroid/widget/Button;

    .line 68
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowActivity_ViewBinding;->view7f09009c:Landroid/view/View;

    .line 69
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowActivity_ViewBinding$3;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowActivity_ViewBinding$3;-><init>(Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowActivity_ViewBinding;Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowActivity;)V

    instance-of p1, p2, Landroid/view/View;

    if-nez p1, :cond_2

    invoke-virtual {p2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_2

    :cond_2
    check-cast p2, Landroid/view/View;

    invoke-static {p2, v0}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    :goto_2
    return-void
.end method


# virtual methods
.method public unbind()V
    .locals 3
    .annotation build Landroid/support/annotation/CallSuper;
    .end annotation

    .line 80
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowActivity_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowActivity;

    if-eqz v0, :cond_3

    const/4 v1, 0x0

    .line 82
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowActivity_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowActivity;

    .line 84
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowActivity;->srlSwipeRefresh:Lcom/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout;

    .line 85
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowActivity;->ivLogo:Landroid/widget/ImageView;

    .line 86
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowActivity;->ncvNotConnected:Lcom/ibotta/android/mvp/ui/view/loyalty/NotConnectedView;

    .line 87
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowActivity;->nlcvNumericCard:Lcom/ibotta/android/mvp/ui/view/loyalty/NumericLoyaltyCardView;

    .line 88
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowActivity;->blcvBarcodeCard:Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeLoyaltyCardView;

    .line 89
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowActivity;->livInstructions:Lcom/ibotta/android/mvp/ui/view/loyalty/LoyaltyInstructionsView;

    .line 90
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowActivity;->llButtons:Landroid/widget/LinearLayout;

    .line 91
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowActivity;->bAddCard:Landroid/widget/Button;

    .line 92
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowActivity;->bUseReceipt:Landroid/widget/Button;

    .line 93
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowActivity;->bRemoveCard:Landroid/widget/Button;

    .line 95
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowActivity_ViewBinding;->view7f09007b:Landroid/view/View;

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_0

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 96
    :goto_0
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowActivity_ViewBinding;->view7f09007b:Landroid/view/View;

    .line 97
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowActivity_ViewBinding;->view7f0900af:Landroid/view/View;

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_1

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_1

    :cond_1
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 98
    :goto_1
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowActivity_ViewBinding;->view7f0900af:Landroid/view/View;

    .line 99
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowActivity_ViewBinding;->view7f09009c:Landroid/view/View;

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_2

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_2

    :cond_2
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 100
    :goto_2
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowActivity_ViewBinding;->view7f09009c:Landroid/view/View;

    return-void

    .line 81
    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Bindings already cleared."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
