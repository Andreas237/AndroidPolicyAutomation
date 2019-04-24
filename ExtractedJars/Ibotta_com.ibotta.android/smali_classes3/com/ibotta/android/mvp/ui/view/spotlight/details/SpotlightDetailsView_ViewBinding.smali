.class public Lcom/ibotta/android/mvp/ui/view/spotlight/details/SpotlightDetailsView_ViewBinding;
.super Ljava/lang/Object;
.source "SpotlightDetailsView_ViewBinding.java"

# interfaces
.implements Lbutterknife/Unbinder;


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation


# instance fields
.field private target:Lcom/ibotta/android/mvp/ui/view/spotlight/details/SpotlightDetailsView;

.field private view7f09021b:Landroid/view/View;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/view/spotlight/details/SpotlightDetailsView;)V
    .locals 0
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 26
    invoke-direct {p0, p1, p1}, Lcom/ibotta/android/mvp/ui/view/spotlight/details/SpotlightDetailsView_ViewBinding;-><init>(Lcom/ibotta/android/mvp/ui/view/spotlight/details/SpotlightDetailsView;Landroid/view/View;)V

    return-void
.end method

.method public constructor <init>(Lcom/ibotta/android/mvp/ui/view/spotlight/details/SpotlightDetailsView;Landroid/view/View;)V
    .locals 3
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/details/SpotlightDetailsView_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/view/spotlight/details/SpotlightDetailsView;

    const-string v0, "field \'tvDetails\'"

    .line 34
    const-class v1, Landroid/widget/TextView;

    const v2, 0x7f090518

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/view/spotlight/details/SpotlightDetailsView;->tvDetails:Landroid/widget/TextView;

    const-string v0, "field \'llBonus\'"

    .line 35
    const-class v1, Landroid/widget/LinearLayout;

    const v2, 0x7f0902ff

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/view/spotlight/details/SpotlightDetailsView;->llBonus:Landroid/widget/LinearLayout;

    const-string v0, "field \'civBonusIndicator\'"

    .line 36
    const-class v1, Lcom/ibotta/android/mvp/ui/view/indicator/CircularIndicatorView;

    const v2, 0x7f0900f4

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/view/indicator/CircularIndicatorView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/view/spotlight/details/SpotlightDetailsView;->civBonusIndicator:Lcom/ibotta/android/mvp/ui/view/indicator/CircularIndicatorView;

    const-string v0, "field \'llMultipleCombo\'"

    .line 37
    const-class v1, Landroid/widget/LinearLayout;

    const v2, 0x7f090319

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/view/spotlight/details/SpotlightDetailsView;->llMultipleCombo:Landroid/widget/LinearLayout;

    const-string v0, "field \'rivIndicator\'"

    .line 38
    const-class v1, Lcom/ibotta/android/mvp/ui/view/rebate/RebateIndicatorView;

    const v2, 0x7f0903ca

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/view/rebate/RebateIndicatorView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/view/spotlight/details/SpotlightDetailsView;->rivIndicator:Lcom/ibotta/android/mvp/ui/view/rebate/RebateIndicatorView;

    const-string v0, "field \'tvMultipleCombo\'"

    .line 39
    const-class v1, Landroid/widget/TextView;

    const v2, 0x7f09054a

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/view/spotlight/details/SpotlightDetailsView;->tvMultipleCombo:Landroid/widget/TextView;

    const-string v0, "field \'hbvCheckProduct\' and method \'onCheckProductClicked\'"

    const v1, 0x7f09021b

    .line 40
    invoke-static {p2, v1, v0}, Lbutterknife/internal/Utils;->findRequiredView(Landroid/view/View;ILjava/lang/String;)Landroid/view/View;

    move-result-object p2

    const-string v0, "field \'hbvCheckProduct\'"

    .line 41
    const-class v2, Lcom/ibotta/android/mvp/ui/view/button/HybridButtonView;

    invoke-static {p2, v1, v0, v2}, Lbutterknife/internal/Utils;->castView(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/view/button/HybridButtonView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/view/spotlight/details/SpotlightDetailsView;->hbvCheckProduct:Lcom/ibotta/android/mvp/ui/view/button/HybridButtonView;

    .line 42
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/details/SpotlightDetailsView_ViewBinding;->view7f09021b:Landroid/view/View;

    .line 43
    new-instance v0, Lcom/ibotta/android/mvp/ui/view/spotlight/details/SpotlightDetailsView_ViewBinding$1;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/mvp/ui/view/spotlight/details/SpotlightDetailsView_ViewBinding$1;-><init>(Lcom/ibotta/android/mvp/ui/view/spotlight/details/SpotlightDetailsView_ViewBinding;Lcom/ibotta/android/mvp/ui/view/spotlight/details/SpotlightDetailsView;)V

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

    .line 54
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/details/SpotlightDetailsView_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/view/spotlight/details/SpotlightDetailsView;

    if-eqz v0, :cond_1

    const/4 v1, 0x0

    .line 56
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/details/SpotlightDetailsView_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/view/spotlight/details/SpotlightDetailsView;

    .line 58
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/spotlight/details/SpotlightDetailsView;->tvDetails:Landroid/widget/TextView;

    .line 59
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/spotlight/details/SpotlightDetailsView;->llBonus:Landroid/widget/LinearLayout;

    .line 60
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/spotlight/details/SpotlightDetailsView;->civBonusIndicator:Lcom/ibotta/android/mvp/ui/view/indicator/CircularIndicatorView;

    .line 61
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/spotlight/details/SpotlightDetailsView;->llMultipleCombo:Landroid/widget/LinearLayout;

    .line 62
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/spotlight/details/SpotlightDetailsView;->rivIndicator:Lcom/ibotta/android/mvp/ui/view/rebate/RebateIndicatorView;

    .line 63
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/spotlight/details/SpotlightDetailsView;->tvMultipleCombo:Landroid/widget/TextView;

    .line 64
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/spotlight/details/SpotlightDetailsView;->hbvCheckProduct:Lcom/ibotta/android/mvp/ui/view/button/HybridButtonView;

    .line 66
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/details/SpotlightDetailsView_ViewBinding;->view7f09021b:Landroid/view/View;

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_0

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 67
    :goto_0
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/details/SpotlightDetailsView_ViewBinding;->view7f09021b:Landroid/view/View;

    return-void

    .line 55
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Bindings already cleared."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
