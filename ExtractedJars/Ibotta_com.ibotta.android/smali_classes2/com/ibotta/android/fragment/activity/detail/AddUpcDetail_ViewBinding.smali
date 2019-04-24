.class public Lcom/ibotta/android/fragment/activity/detail/AddUpcDetail_ViewBinding;
.super Ljava/lang/Object;
.source "AddUpcDetail_ViewBinding.java"

# interfaces
.implements Lbutterknife/Unbinder;


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation


# instance fields
.field private target:Lcom/ibotta/android/fragment/activity/detail/AddUpcDetail;

.field private view7f0900a5:Landroid/view/View;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/fragment/activity/detail/AddUpcDetail;Landroid/view/View;)V
    .locals 4
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    iput-object p1, p0, Lcom/ibotta/android/fragment/activity/detail/AddUpcDetail_ViewBinding;->target:Lcom/ibotta/android/fragment/activity/detail/AddUpcDetail;

    const-string v0, "field \'tbvTitleBar\'"

    .line 28
    const-class v1, Lcom/ibotta/android/views/base/title/TitleBarView;

    const v2, 0x7f09044e

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/views/base/title/TitleBarView;

    iput-object v0, p1, Lcom/ibotta/android/fragment/activity/detail/AddUpcDetail;->tbvTitleBar:Lcom/ibotta/android/views/base/title/TitleBarView;

    const-string v0, "field \'tvTitleDescription\'"

    .line 29
    const-class v1, Landroid/widget/TextView;

    const v2, 0x7f090588

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p1, Lcom/ibotta/android/fragment/activity/detail/AddUpcDetail;->tvTitleDescription:Landroid/widget/TextView;

    const-string v0, "field \'tvProductName\'"

    .line 30
    const-class v1, Landroid/widget/TextView;

    const v2, 0x7f09055e

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p1, Lcom/ibotta/android/fragment/activity/detail/AddUpcDetail;->tvProductName:Landroid/widget/TextView;

    const-string v0, "field \'tvProductDescription\'"

    .line 31
    const-class v1, Landroid/widget/TextView;

    const v2, 0x7f09055d

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p1, Lcom/ibotta/android/fragment/activity/detail/AddUpcDetail;->tvProductDescription:Landroid/widget/TextView;

    const-string v0, "field \'bSeeThisRebate\' and method \'onSeeThisRebate\'"

    const v1, 0x7f0900a5

    .line 32
    invoke-static {p2, v1, v0}, Lbutterknife/internal/Utils;->findRequiredView(Landroid/view/View;ILjava/lang/String;)Landroid/view/View;

    move-result-object v0

    const-string v2, "field \'bSeeThisRebate\'"

    .line 33
    const-class v3, Landroid/widget/Button;

    invoke-static {v0, v1, v2, v3}, Lbutterknife/internal/Utils;->castView(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/widget/Button;

    iput-object v1, p1, Lcom/ibotta/android/fragment/activity/detail/AddUpcDetail;->bSeeThisRebate:Landroid/widget/Button;

    .line 34
    iput-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/AddUpcDetail_ViewBinding;->view7f0900a5:Landroid/view/View;

    .line 35
    new-instance v1, Lcom/ibotta/android/fragment/activity/detail/AddUpcDetail_ViewBinding$1;

    invoke-direct {v1, p0, p1}, Lcom/ibotta/android/fragment/activity/detail/AddUpcDetail_ViewBinding$1;-><init>(Lcom/ibotta/android/fragment/activity/detail/AddUpcDetail_ViewBinding;Lcom/ibotta/android/fragment/activity/detail/AddUpcDetail;)V

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_0

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    :goto_0
    const v0, 0x7f090386

    const-string v1, "field \'ricvRebateImageCard\'"

    .line 41
    const-class v2, Lcom/ibotta/android/mvp/ui/view/rebate/OfferImageView;

    invoke-static {p2, v0, v1, v2}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/ibotta/android/mvp/ui/view/rebate/OfferImageView;

    iput-object p2, p1, Lcom/ibotta/android/fragment/activity/detail/AddUpcDetail;->ricvRebateImageCard:Lcom/ibotta/android/mvp/ui/view/rebate/OfferImageView;

    return-void
.end method


# virtual methods
.method public unbind()V
    .locals 3
    .annotation build Landroid/support/annotation/CallSuper;
    .end annotation

    .line 47
    iget-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/AddUpcDetail_ViewBinding;->target:Lcom/ibotta/android/fragment/activity/detail/AddUpcDetail;

    if-eqz v0, :cond_1

    const/4 v1, 0x0

    .line 49
    iput-object v1, p0, Lcom/ibotta/android/fragment/activity/detail/AddUpcDetail_ViewBinding;->target:Lcom/ibotta/android/fragment/activity/detail/AddUpcDetail;

    .line 51
    iput-object v1, v0, Lcom/ibotta/android/fragment/activity/detail/AddUpcDetail;->tbvTitleBar:Lcom/ibotta/android/views/base/title/TitleBarView;

    .line 52
    iput-object v1, v0, Lcom/ibotta/android/fragment/activity/detail/AddUpcDetail;->tvTitleDescription:Landroid/widget/TextView;

    .line 53
    iput-object v1, v0, Lcom/ibotta/android/fragment/activity/detail/AddUpcDetail;->tvProductName:Landroid/widget/TextView;

    .line 54
    iput-object v1, v0, Lcom/ibotta/android/fragment/activity/detail/AddUpcDetail;->tvProductDescription:Landroid/widget/TextView;

    .line 55
    iput-object v1, v0, Lcom/ibotta/android/fragment/activity/detail/AddUpcDetail;->bSeeThisRebate:Landroid/widget/Button;

    .line 56
    iput-object v1, v0, Lcom/ibotta/android/fragment/activity/detail/AddUpcDetail;->ricvRebateImageCard:Lcom/ibotta/android/mvp/ui/view/rebate/OfferImageView;

    .line 58
    iget-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/AddUpcDetail_ViewBinding;->view7f0900a5:Landroid/view/View;

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_0

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 59
    :goto_0
    iput-object v1, p0, Lcom/ibotta/android/fragment/activity/detail/AddUpcDetail_ViewBinding;->view7f0900a5:Landroid/view/View;

    return-void

    .line 48
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Bindings already cleared."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
