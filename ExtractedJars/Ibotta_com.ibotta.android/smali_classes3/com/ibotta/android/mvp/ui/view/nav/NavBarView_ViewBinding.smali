.class public Lcom/ibotta/android/mvp/ui/view/nav/NavBarView_ViewBinding;
.super Ljava/lang/Object;
.source "NavBarView_ViewBinding.java"

# interfaces
.implements Lbutterknife/Unbinder;


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation


# instance fields
.field private target:Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;

.field private view7f09036c:Landroid/view/View;

.field private view7f09036e:Landroid/view/View;

.field private view7f090370:Landroid/view/View;

.field private view7f090372:Landroid/view/View;

.field private view7f090377:Landroid/view/View;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;)V
    .locals 0
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 31
    invoke-direct {p0, p1, p1}, Lcom/ibotta/android/mvp/ui/view/nav/NavBarView_ViewBinding;-><init>(Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;Landroid/view/View;)V

    return-void
.end method

.method public constructor <init>(Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;Landroid/view/View;)V
    .locals 4
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/nav/NavBarView_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;

    const-string v0, "field \'nbvFeaturedContainer\'"

    .line 39
    const-class v1, Landroid/widget/FrameLayout;

    const v2, 0x7f09036f

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;->nbvFeaturedContainer:Landroid/widget/FrameLayout;

    const-string v0, "field \'nbvFindRebatesContainer\'"

    .line 40
    const-class v1, Landroid/widget/FrameLayout;

    const v2, 0x7f090371

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;->nbvFindRebatesContainer:Landroid/widget/FrameLayout;

    const-string v0, "field \'nbvRedeemContainer\'"

    .line 41
    const-class v1, Landroid/widget/FrameLayout;

    const v2, 0x7f090378

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;->nbvRedeemContainer:Landroid/widget/FrameLayout;

    const-string v0, "field \'nbvMyRebatesContainer\'"

    .line 42
    const-class v1, Landroid/widget/FrameLayout;

    const v2, 0x7f090373

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;->nbvMyRebatesContainer:Landroid/widget/FrameLayout;

    const-string v0, "field \'nbvAccountContainer\'"

    .line 43
    const-class v1, Landroid/widget/FrameLayout;

    const v2, 0x7f09036d

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;->nbvAccountContainer:Landroid/widget/FrameLayout;

    const-string v0, "field \'nbvFeatured\' and method \'onNbvOneClicked\'"

    const v1, 0x7f09036e

    .line 44
    invoke-static {p2, v1, v0}, Lbutterknife/internal/Utils;->findRequiredView(Landroid/view/View;ILjava/lang/String;)Landroid/view/View;

    move-result-object v0

    const-string v2, "field \'nbvFeatured\'"

    .line 45
    const-class v3, Lcom/ibotta/android/mvp/ui/view/nav/NavButtonView;

    invoke-static {v0, v1, v2, v3}, Lbutterknife/internal/Utils;->castView(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/android/mvp/ui/view/nav/NavButtonView;

    iput-object v1, p1, Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;->nbvFeatured:Lcom/ibotta/android/mvp/ui/view/nav/NavButtonView;

    .line 46
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/view/nav/NavBarView_ViewBinding;->view7f09036e:Landroid/view/View;

    .line 47
    new-instance v1, Lcom/ibotta/android/mvp/ui/view/nav/NavBarView_ViewBinding$1;

    invoke-direct {v1, p0, p1}, Lcom/ibotta/android/mvp/ui/view/nav/NavBarView_ViewBinding$1;-><init>(Lcom/ibotta/android/mvp/ui/view/nav/NavBarView_ViewBinding;Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;)V

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_0

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    :goto_0
    const-string v0, "field \'nbvFindRebates\' and method \'onNbvTwoClicked\'"

    const v1, 0x7f090370

    .line 53
    invoke-static {p2, v1, v0}, Lbutterknife/internal/Utils;->findRequiredView(Landroid/view/View;ILjava/lang/String;)Landroid/view/View;

    move-result-object v0

    const-string v2, "field \'nbvFindRebates\'"

    .line 54
    const-class v3, Lcom/ibotta/android/mvp/ui/view/nav/NavButtonView;

    invoke-static {v0, v1, v2, v3}, Lbutterknife/internal/Utils;->castView(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/android/mvp/ui/view/nav/NavButtonView;

    iput-object v1, p1, Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;->nbvFindRebates:Lcom/ibotta/android/mvp/ui/view/nav/NavButtonView;

    .line 55
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/view/nav/NavBarView_ViewBinding;->view7f090370:Landroid/view/View;

    .line 56
    new-instance v1, Lcom/ibotta/android/mvp/ui/view/nav/NavBarView_ViewBinding$2;

    invoke-direct {v1, p0, p1}, Lcom/ibotta/android/mvp/ui/view/nav/NavBarView_ViewBinding$2;-><init>(Lcom/ibotta/android/mvp/ui/view/nav/NavBarView_ViewBinding;Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;)V

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_1

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_1

    :cond_1
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    :goto_1
    const-string v0, "field \'nbvRedeem\' and method \'onNbvThreeClicked\'"

    const v1, 0x7f090377

    .line 62
    invoke-static {p2, v1, v0}, Lbutterknife/internal/Utils;->findRequiredView(Landroid/view/View;ILjava/lang/String;)Landroid/view/View;

    move-result-object v0

    const-string v2, "field \'nbvRedeem\'"

    .line 63
    const-class v3, Lcom/ibotta/android/mvp/ui/view/nav/NavButtonView;

    invoke-static {v0, v1, v2, v3}, Lbutterknife/internal/Utils;->castView(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/android/mvp/ui/view/nav/NavButtonView;

    iput-object v1, p1, Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;->nbvRedeem:Lcom/ibotta/android/mvp/ui/view/nav/NavButtonView;

    .line 64
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/view/nav/NavBarView_ViewBinding;->view7f090377:Landroid/view/View;

    .line 65
    new-instance v1, Lcom/ibotta/android/mvp/ui/view/nav/NavBarView_ViewBinding$3;

    invoke-direct {v1, p0, p1}, Lcom/ibotta/android/mvp/ui/view/nav/NavBarView_ViewBinding$3;-><init>(Lcom/ibotta/android/mvp/ui/view/nav/NavBarView_ViewBinding;Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;)V

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_2

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_2

    :cond_2
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    :goto_2
    const-string v0, "field \'nbvMyRebates\' and method \'onNbvFourClicked\'"

    const v1, 0x7f090372

    .line 71
    invoke-static {p2, v1, v0}, Lbutterknife/internal/Utils;->findRequiredView(Landroid/view/View;ILjava/lang/String;)Landroid/view/View;

    move-result-object v0

    const-string v2, "field \'nbvMyRebates\'"

    .line 72
    const-class v3, Lcom/ibotta/android/mvp/ui/view/nav/NavButtonView;

    invoke-static {v0, v1, v2, v3}, Lbutterknife/internal/Utils;->castView(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/android/mvp/ui/view/nav/NavButtonView;

    iput-object v1, p1, Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;->nbvMyRebates:Lcom/ibotta/android/mvp/ui/view/nav/NavButtonView;

    .line 73
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/view/nav/NavBarView_ViewBinding;->view7f090372:Landroid/view/View;

    .line 74
    new-instance v1, Lcom/ibotta/android/mvp/ui/view/nav/NavBarView_ViewBinding$4;

    invoke-direct {v1, p0, p1}, Lcom/ibotta/android/mvp/ui/view/nav/NavBarView_ViewBinding$4;-><init>(Lcom/ibotta/android/mvp/ui/view/nav/NavBarView_ViewBinding;Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;)V

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_3

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_3

    :cond_3
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    :goto_3
    const-string v0, "field \'nbvAccount\' and method \'onNbvFiveClicked\'"

    const v1, 0x7f09036c

    .line 80
    invoke-static {p2, v1, v0}, Lbutterknife/internal/Utils;->findRequiredView(Landroid/view/View;ILjava/lang/String;)Landroid/view/View;

    move-result-object v0

    const-string v2, "field \'nbvAccount\'"

    .line 81
    const-class v3, Lcom/ibotta/android/mvp/ui/view/nav/NavButtonView;

    invoke-static {v0, v1, v2, v3}, Lbutterknife/internal/Utils;->castView(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/android/mvp/ui/view/nav/NavButtonView;

    iput-object v1, p1, Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;->nbvAccount:Lcom/ibotta/android/mvp/ui/view/nav/NavButtonView;

    .line 82
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/view/nav/NavBarView_ViewBinding;->view7f09036c:Landroid/view/View;

    .line 83
    new-instance v1, Lcom/ibotta/android/mvp/ui/view/nav/NavBarView_ViewBinding$5;

    invoke-direct {v1, p0, p1}, Lcom/ibotta/android/mvp/ui/view/nav/NavBarView_ViewBinding$5;-><init>(Lcom/ibotta/android/mvp/ui/view/nav/NavBarView_ViewBinding;Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;)V

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_4

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_4

    :cond_4
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    :goto_4
    const v0, 0x7f0902e9

    const-string v1, "field \'lavMyRebatesAnim\'"

    .line 89
    const-class v2, Lcom/airbnb/lottie/LottieAnimationView;

    invoke-static {p2, v0, v1, v2}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/airbnb/lottie/LottieAnimationView;

    iput-object p2, p1, Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;->lavMyRebatesAnim:Lcom/airbnb/lottie/LottieAnimationView;

    return-void
.end method


# virtual methods
.method public unbind()V
    .locals 3
    .annotation build Landroid/support/annotation/CallSuper;
    .end annotation

    .line 95
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/nav/NavBarView_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;

    if-eqz v0, :cond_5

    const/4 v1, 0x0

    .line 97
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/view/nav/NavBarView_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;

    .line 99
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;->nbvFeaturedContainer:Landroid/widget/FrameLayout;

    .line 100
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;->nbvFindRebatesContainer:Landroid/widget/FrameLayout;

    .line 101
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;->nbvRedeemContainer:Landroid/widget/FrameLayout;

    .line 102
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;->nbvMyRebatesContainer:Landroid/widget/FrameLayout;

    .line 103
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;->nbvAccountContainer:Landroid/widget/FrameLayout;

    .line 104
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;->nbvFeatured:Lcom/ibotta/android/mvp/ui/view/nav/NavButtonView;

    .line 105
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;->nbvFindRebates:Lcom/ibotta/android/mvp/ui/view/nav/NavButtonView;

    .line 106
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;->nbvRedeem:Lcom/ibotta/android/mvp/ui/view/nav/NavButtonView;

    .line 107
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;->nbvMyRebates:Lcom/ibotta/android/mvp/ui/view/nav/NavButtonView;

    .line 108
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;->nbvAccount:Lcom/ibotta/android/mvp/ui/view/nav/NavButtonView;

    .line 109
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;->lavMyRebatesAnim:Lcom/airbnb/lottie/LottieAnimationView;

    .line 111
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/nav/NavBarView_ViewBinding;->view7f09036e:Landroid/view/View;

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_0

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 112
    :goto_0
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/view/nav/NavBarView_ViewBinding;->view7f09036e:Landroid/view/View;

    .line 113
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/nav/NavBarView_ViewBinding;->view7f090370:Landroid/view/View;

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_1

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_1

    :cond_1
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 114
    :goto_1
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/view/nav/NavBarView_ViewBinding;->view7f090370:Landroid/view/View;

    .line 115
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/nav/NavBarView_ViewBinding;->view7f090377:Landroid/view/View;

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_2

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_2

    :cond_2
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 116
    :goto_2
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/view/nav/NavBarView_ViewBinding;->view7f090377:Landroid/view/View;

    .line 117
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/nav/NavBarView_ViewBinding;->view7f090372:Landroid/view/View;

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_3

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_3

    :cond_3
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 118
    :goto_3
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/view/nav/NavBarView_ViewBinding;->view7f090372:Landroid/view/View;

    .line 119
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/nav/NavBarView_ViewBinding;->view7f09036c:Landroid/view/View;

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_4

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_4

    :cond_4
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 120
    :goto_4
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/view/nav/NavBarView_ViewBinding;->view7f09036c:Landroid/view/View;

    return-void

    .line 96
    :cond_5
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Bindings already cleared."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
