.class public Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddActivity_ViewBinding;
.super Ljava/lang/Object;
.source "LoyaltyCardAddActivity_ViewBinding.java"

# interfaces
.implements Lbutterknife/Unbinder;


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation


# instance fields
.field private target:Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddActivity;

.field private view7f09007b:Landroid/view/View;

.field private view7f0900a4:Landroid/view/View;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddActivity;)V
    .locals 1
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 29
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddActivity_ViewBinding;-><init>(Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddActivity;Landroid/view/View;)V

    return-void
.end method

.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddActivity;Landroid/view/View;)V
    .locals 4
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddActivity_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddActivity;

    const-string v0, "field \'srlSwipeRefresh\'"

    .line 37
    const-class v1, Lcom/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout;

    const v2, 0x7f090426

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddActivity;->srlSwipeRefresh:Lcom/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout;

    const-string v0, "field \'ivLogo\'"

    .line 38
    const-class v1, Landroid/widget/ImageView;

    const v2, 0x7f0902b4

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddActivity;->ivLogo:Landroid/widget/ImageView;

    const-string v0, "field \'tilCardNumber\'"

    .line 39
    const-class v1, Landroid/support/design/widget/TextInputLayout;

    const v2, 0x7f09046d

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/design/widget/TextInputLayout;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddActivity;->tilCardNumber:Landroid/support/design/widget/TextInputLayout;

    const-string v0, "field \'etCardNumber\'"

    .line 40
    const-class v1, Landroid/widget/EditText;

    const v2, 0x7f0901c0

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddActivity;->etCardNumber:Landroid/widget/EditText;

    const-string v0, "field \'bScanCard\' and method \'onScanCardClicked\'"

    const v1, 0x7f0900a4

    .line 41
    invoke-static {p2, v1, v0}, Lbutterknife/internal/Utils;->findRequiredView(Landroid/view/View;ILjava/lang/String;)Landroid/view/View;

    move-result-object v0

    const-string v2, "field \'bScanCard\'"

    .line 42
    const-class v3, Landroid/widget/Button;

    invoke-static {v0, v1, v2, v3}, Lbutterknife/internal/Utils;->castView(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/widget/Button;

    iput-object v1, p1, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddActivity;->bScanCard:Landroid/widget/Button;

    .line 43
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddActivity_ViewBinding;->view7f0900a4:Landroid/view/View;

    .line 44
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddActivity_ViewBinding$1;

    invoke-direct {v1, p0, p1}, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddActivity_ViewBinding$1;-><init>(Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddActivity_ViewBinding;Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddActivity;)V

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_0

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    :goto_0
    const v0, 0x7f0902f7

    const-string v1, "field \'livInstructions\'"

    .line 50
    const-class v2, Lcom/ibotta/android/mvp/ui/view/loyalty/LoyaltyInstructionsView;

    invoke-static {p2, v0, v1, v2}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/view/loyalty/LoyaltyInstructionsView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddActivity;->livInstructions:Lcom/ibotta/android/mvp/ui/view/loyalty/LoyaltyInstructionsView;

    const-string v0, "field \'bAddCard\' and method \'onAddCardClicked\'"

    const v1, 0x7f09007b

    .line 51
    invoke-static {p2, v1, v0}, Lbutterknife/internal/Utils;->findRequiredView(Landroid/view/View;ILjava/lang/String;)Landroid/view/View;

    move-result-object p2

    const-string v0, "field \'bAddCard\'"

    .line 52
    const-class v2, Landroid/widget/Button;

    invoke-static {p2, v1, v0, v2}, Lbutterknife/internal/Utils;->castView(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddActivity;->bAddCard:Landroid/widget/Button;

    .line 53
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddActivity_ViewBinding;->view7f09007b:Landroid/view/View;

    .line 54
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddActivity_ViewBinding$2;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddActivity_ViewBinding$2;-><init>(Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddActivity_ViewBinding;Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddActivity;)V

    instance-of p1, p2, Landroid/view/View;

    if-nez p1, :cond_1

    invoke-virtual {p2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_1

    :cond_1
    check-cast p2, Landroid/view/View;

    invoke-static {p2, v0}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    :goto_1
    return-void
.end method


# virtual methods
.method public unbind()V
    .locals 3
    .annotation build Landroid/support/annotation/CallSuper;
    .end annotation

    .line 65
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddActivity_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddActivity;

    if-eqz v0, :cond_2

    const/4 v1, 0x0

    .line 67
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddActivity_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddActivity;

    .line 69
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddActivity;->srlSwipeRefresh:Lcom/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout;

    .line 70
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddActivity;->ivLogo:Landroid/widget/ImageView;

    .line 71
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddActivity;->tilCardNumber:Landroid/support/design/widget/TextInputLayout;

    .line 72
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddActivity;->etCardNumber:Landroid/widget/EditText;

    .line 73
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddActivity;->bScanCard:Landroid/widget/Button;

    .line 74
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddActivity;->livInstructions:Lcom/ibotta/android/mvp/ui/view/loyalty/LoyaltyInstructionsView;

    .line 75
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddActivity;->bAddCard:Landroid/widget/Button;

    .line 77
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddActivity_ViewBinding;->view7f0900a4:Landroid/view/View;

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_0

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 78
    :goto_0
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddActivity_ViewBinding;->view7f0900a4:Landroid/view/View;

    .line 79
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddActivity_ViewBinding;->view7f09007b:Landroid/view/View;

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_1

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_1

    :cond_1
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 80
    :goto_1
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddActivity_ViewBinding;->view7f09007b:Landroid/view/View;

    return-void

    .line 66
    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Bindings already cleared."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
