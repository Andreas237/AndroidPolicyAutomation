.class public Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightAvailableAtView_ViewBinding;
.super Ljava/lang/Object;
.source "SpotlightAvailableAtView_ViewBinding.java"

# interfaces
.implements Lbutterknife/Unbinder;


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation


# instance fields
.field private target:Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightAvailableAtView;

.field private view7f090577:Landroid/view/View;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightAvailableAtView;)V
    .locals 0
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 26
    invoke-direct {p0, p1, p1}, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightAvailableAtView_ViewBinding;-><init>(Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightAvailableAtView;Landroid/view/View;)V

    return-void
.end method

.method public constructor <init>(Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightAvailableAtView;Landroid/view/View;)V
    .locals 4
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightAvailableAtView_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightAvailableAtView;

    const-string v0, "field \'tbvTitleBar\'"

    .line 34
    const-class v1, Lcom/ibotta/android/views/base/title/TitleBarView;

    const v2, 0x7f09044e

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/views/base/title/TitleBarView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightAvailableAtView;->tbvTitleBar:Lcom/ibotta/android/views/base/title/TitleBarView;

    const-string v0, "field \'bCantFindThisItem\'"

    .line 35
    const-class v1, Landroid/widget/Button;

    const v2, 0x7f090080

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightAvailableAtView;->bCantFindThisItem:Landroid/widget/Button;

    const-string v0, "field \'llAlsoAvalableAt\'"

    .line 36
    const-class v1, Landroid/widget/LinearLayout;

    const v2, 0x7f0902fc

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightAvailableAtView;->llAlsoAvalableAt:Landroid/widget/LinearLayout;

    const-string v0, "field \'tvAlsoAvailableAt\'"

    .line 37
    const-class v1, Landroid/widget/TextView;

    const v2, 0x7f0904ed

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightAvailableAtView;->tvAlsoAvailableAt:Landroid/widget/TextView;

    const-string v0, "field \'tvShowMore\' and method \'onToggleShowMore\'"

    const v1, 0x7f090577

    .line 38
    invoke-static {p2, v1, v0}, Lbutterknife/internal/Utils;->findRequiredView(Landroid/view/View;ILjava/lang/String;)Landroid/view/View;

    move-result-object v0

    const-string v2, "field \'tvShowMore\'"

    .line 39
    const-class v3, Landroid/widget/TextView;

    invoke-static {v0, v1, v2, v3}, Lbutterknife/internal/Utils;->castView(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, p1, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightAvailableAtView;->tvShowMore:Landroid/widget/TextView;

    .line 40
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightAvailableAtView_ViewBinding;->view7f090577:Landroid/view/View;

    .line 41
    new-instance v1, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightAvailableAtView_ViewBinding$1;

    invoke-direct {v1, p0, p1}, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightAvailableAtView_ViewBinding$1;-><init>(Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightAvailableAtView_ViewBinding;Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightAvailableAtView;)V

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_0

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    :goto_0
    const v0, 0x7f0903d4

    const-string v1, "field \'rsvRetailerSpread\'"

    .line 47
    const-class v2, Lcom/ibotta/android/mvp/ui/view/retailer/RetailerSpreadView;

    invoke-static {p2, v0, v1, v2}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/ibotta/android/mvp/ui/view/retailer/RetailerSpreadView;

    iput-object p2, p1, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightAvailableAtView;->rsvRetailerSpread:Lcom/ibotta/android/mvp/ui/view/retailer/RetailerSpreadView;

    return-void
.end method


# virtual methods
.method public unbind()V
    .locals 3
    .annotation build Landroid/support/annotation/CallSuper;
    .end annotation

    .line 53
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightAvailableAtView_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightAvailableAtView;

    if-eqz v0, :cond_1

    const/4 v1, 0x0

    .line 55
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightAvailableAtView_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightAvailableAtView;

    .line 57
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightAvailableAtView;->tbvTitleBar:Lcom/ibotta/android/views/base/title/TitleBarView;

    .line 58
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightAvailableAtView;->bCantFindThisItem:Landroid/widget/Button;

    .line 59
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightAvailableAtView;->llAlsoAvalableAt:Landroid/widget/LinearLayout;

    .line 60
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightAvailableAtView;->tvAlsoAvailableAt:Landroid/widget/TextView;

    .line 61
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightAvailableAtView;->tvShowMore:Landroid/widget/TextView;

    .line 62
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightAvailableAtView;->rsvRetailerSpread:Lcom/ibotta/android/mvp/ui/view/retailer/RetailerSpreadView;

    .line 64
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightAvailableAtView_ViewBinding;->view7f090577:Landroid/view/View;

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_0

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 65
    :goto_0
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightAvailableAtView_ViewBinding;->view7f090577:Landroid/view/View;

    return-void

    .line 54
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Bindings already cleared."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
