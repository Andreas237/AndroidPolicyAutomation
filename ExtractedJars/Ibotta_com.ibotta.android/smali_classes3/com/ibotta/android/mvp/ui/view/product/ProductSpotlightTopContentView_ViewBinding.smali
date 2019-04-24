.class public Lcom/ibotta/android/mvp/ui/view/product/ProductSpotlightTopContentView_ViewBinding;
.super Ljava/lang/Object;
.source "ProductSpotlightTopContentView_ViewBinding.java"

# interfaces
.implements Lbutterknife/Unbinder;


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation


# instance fields
.field private target:Lcom/ibotta/android/mvp/ui/view/product/ProductSpotlightTopContentView;

.field private view7f090246:Landroid/view/View;

.field private view7f0902ad:Landroid/view/View;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/view/product/ProductSpotlightTopContentView;)V
    .locals 0
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 28
    invoke-direct {p0, p1, p1}, Lcom/ibotta/android/mvp/ui/view/product/ProductSpotlightTopContentView_ViewBinding;-><init>(Lcom/ibotta/android/mvp/ui/view/product/ProductSpotlightTopContentView;Landroid/view/View;)V

    return-void
.end method

.method public constructor <init>(Lcom/ibotta/android/mvp/ui/view/product/ProductSpotlightTopContentView;Landroid/view/View;)V
    .locals 4
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/product/ProductSpotlightTopContentView_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/view/product/ProductSpotlightTopContentView;

    const-string v0, "field \'ivImage\' and method \'onImageClicked\'"

    const v1, 0x7f0902ad

    .line 37
    invoke-static {p2, v1, v0}, Lbutterknife/internal/Utils;->findRequiredView(Landroid/view/View;ILjava/lang/String;)Landroid/view/View;

    move-result-object v0

    const-string v2, "field \'ivImage\'"

    .line 38
    const-class v3, Landroid/widget/ImageView;

    invoke-static {v0, v1, v2, v3}, Lbutterknife/internal/Utils;->castView(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    iput-object v1, p1, Lcom/ibotta/android/mvp/ui/view/product/ProductSpotlightTopContentView;->ivImage:Landroid/widget/ImageView;

    .line 39
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/view/product/ProductSpotlightTopContentView_ViewBinding;->view7f0902ad:Landroid/view/View;

    .line 40
    new-instance v1, Lcom/ibotta/android/mvp/ui/view/product/ProductSpotlightTopContentView_ViewBinding$1;

    invoke-direct {v1, p0, p1}, Lcom/ibotta/android/mvp/ui/view/product/ProductSpotlightTopContentView_ViewBinding$1;-><init>(Lcom/ibotta/android/mvp/ui/view/product/ProductSpotlightTopContentView_ViewBinding;Lcom/ibotta/android/mvp/ui/view/product/ProductSpotlightTopContentView;)V

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_0

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    :goto_0
    const v0, 0x7f090592

    const-string v1, "field \'tvType\'"

    .line 46
    const-class v2, Landroid/widget/TextView;

    invoke-static {p2, v0, v1, v2}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/view/product/ProductSpotlightTopContentView;->tvType:Landroid/widget/TextView;

    const v0, 0x7f0904ee

    const-string v1, "field \'tvAmount\'"

    .line 47
    const-class v2, Landroid/widget/TextView;

    invoke-static {p2, v0, v1, v2}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/view/product/ProductSpotlightTopContentView;->tvAmount:Landroid/widget/TextView;

    const-string v0, "field \'iibIbottaImageButton\' and method \'onCtaClicked\'"

    const v1, 0x7f090246

    .line 48
    invoke-static {p2, v1, v0}, Lbutterknife/internal/Utils;->findRequiredView(Landroid/view/View;ILjava/lang/String;)Landroid/view/View;

    move-result-object v0

    const-string v2, "field \'iibIbottaImageButton\'"

    .line 49
    const-class v3, Lcom/ibotta/android/views/base/button/IbottaImageButton;

    invoke-static {v0, v1, v2, v3}, Lbutterknife/internal/Utils;->castView(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/android/views/base/button/IbottaImageButton;

    iput-object v1, p1, Lcom/ibotta/android/mvp/ui/view/product/ProductSpotlightTopContentView;->iibIbottaImageButton:Lcom/ibotta/android/views/base/button/IbottaImageButton;

    .line 50
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/view/product/ProductSpotlightTopContentView_ViewBinding;->view7f090246:Landroid/view/View;

    .line 51
    new-instance v1, Lcom/ibotta/android/mvp/ui/view/product/ProductSpotlightTopContentView_ViewBinding$2;

    invoke-direct {v1, p0, p1}, Lcom/ibotta/android/mvp/ui/view/product/ProductSpotlightTopContentView_ViewBinding$2;-><init>(Lcom/ibotta/android/mvp/ui/view/product/ProductSpotlightTopContentView_ViewBinding;Lcom/ibotta/android/mvp/ui/view/product/ProductSpotlightTopContentView;)V

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_1

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_1

    :cond_1
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    :goto_1
    const v0, 0x7f090515

    const-string v1, "field \'tvDescription\'"

    .line 57
    const-class v2, Landroid/widget/TextView;

    invoke-static {p2, v0, v1, v2}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/view/product/ProductSpotlightTopContentView;->tvDescription:Landroid/widget/TextView;

    const v0, 0x7f0900fb

    const-string v1, "field \'clWrapper\'"

    .line 58
    const-class v2, Landroid/support/constraint/ConstraintLayout;

    invoke-static {p2, v0, v1, v2}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/constraint/ConstraintLayout;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/view/product/ProductSpotlightTopContentView;->clWrapper:Landroid/support/constraint/ConstraintLayout;

    const v0, 0x7f0900de

    const-string v1, "field \'obvBadgeView\'"

    .line 59
    const-class v2, Lcom/ibotta/android/views/offer/badge/BadgeView;

    invoke-static {p2, v0, v1, v2}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/ibotta/android/views/offer/badge/BadgeView;

    iput-object p2, p1, Lcom/ibotta/android/mvp/ui/view/product/ProductSpotlightTopContentView;->obvBadgeView:Lcom/ibotta/android/views/offer/badge/BadgeView;

    return-void
.end method


# virtual methods
.method public unbind()V
    .locals 3
    .annotation build Landroid/support/annotation/CallSuper;
    .end annotation

    .line 65
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/product/ProductSpotlightTopContentView_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/view/product/ProductSpotlightTopContentView;

    if-eqz v0, :cond_2

    const/4 v1, 0x0

    .line 67
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/view/product/ProductSpotlightTopContentView_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/view/product/ProductSpotlightTopContentView;

    .line 69
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/product/ProductSpotlightTopContentView;->ivImage:Landroid/widget/ImageView;

    .line 70
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/product/ProductSpotlightTopContentView;->tvType:Landroid/widget/TextView;

    .line 71
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/product/ProductSpotlightTopContentView;->tvAmount:Landroid/widget/TextView;

    .line 72
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/product/ProductSpotlightTopContentView;->iibIbottaImageButton:Lcom/ibotta/android/views/base/button/IbottaImageButton;

    .line 73
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/product/ProductSpotlightTopContentView;->tvDescription:Landroid/widget/TextView;

    .line 74
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/product/ProductSpotlightTopContentView;->clWrapper:Landroid/support/constraint/ConstraintLayout;

    .line 75
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/product/ProductSpotlightTopContentView;->obvBadgeView:Lcom/ibotta/android/views/offer/badge/BadgeView;

    .line 77
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/product/ProductSpotlightTopContentView_ViewBinding;->view7f0902ad:Landroid/view/View;

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_0

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 78
    :goto_0
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/view/product/ProductSpotlightTopContentView_ViewBinding;->view7f0902ad:Landroid/view/View;

    .line 79
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/product/ProductSpotlightTopContentView_ViewBinding;->view7f090246:Landroid/view/View;

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_1

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_1

    :cond_1
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 80
    :goto_1
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/view/product/ProductSpotlightTopContentView_ViewBinding;->view7f090246:Landroid/view/View;

    return-void

    .line 66
    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Bindings already cleared."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
