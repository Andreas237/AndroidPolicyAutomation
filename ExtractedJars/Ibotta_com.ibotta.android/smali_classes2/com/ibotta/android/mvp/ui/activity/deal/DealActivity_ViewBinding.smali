.class public Lcom/ibotta/android/mvp/ui/activity/deal/DealActivity_ViewBinding;
.super Ljava/lang/Object;
.source "DealActivity_ViewBinding.java"

# interfaces
.implements Lbutterknife/Unbinder;


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation


# instance fields
.field private target:Lcom/ibotta/android/mvp/ui/activity/deal/DealActivity;

.field private view7f0905bd:Landroid/view/View;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/deal/DealActivity;)V
    .locals 1
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 23
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/deal/DealActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/activity/deal/DealActivity_ViewBinding;-><init>(Lcom/ibotta/android/mvp/ui/activity/deal/DealActivity;Landroid/view/View;)V

    return-void
.end method

.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/deal/DealActivity;Landroid/view/View;)V
    .locals 3
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/deal/DealActivity_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/activity/deal/DealActivity;

    const-string v0, "field \'llContentContainer\'"

    .line 31
    const-class v1, Landroid/widget/LinearLayout;

    const v2, 0x7f090304

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/deal/DealActivity;->llContentContainer:Landroid/widget/LinearLayout;

    const-string v0, "field \'stcvTopContent\'"

    .line 32
    const-class v1, Lcom/ibotta/android/mvp/ui/view/gallery/SpotlightTopContentView;

    const v2, 0x7f09042f

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/view/gallery/SpotlightTopContentView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/deal/DealActivity;->stcvTopContent:Lcom/ibotta/android/mvp/ui/view/gallery/SpotlightTopContentView;

    const-string v0, "method \'onTopSpacingClicked\'"

    const v1, 0x7f0905bd

    .line 33
    invoke-static {p2, v1, v0}, Lbutterknife/internal/Utils;->findRequiredView(Landroid/view/View;ILjava/lang/String;)Landroid/view/View;

    move-result-object p2

    .line 34
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/deal/DealActivity_ViewBinding;->view7f0905bd:Landroid/view/View;

    .line 35
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/deal/DealActivity_ViewBinding$1;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/mvp/ui/activity/deal/DealActivity_ViewBinding$1;-><init>(Lcom/ibotta/android/mvp/ui/activity/deal/DealActivity_ViewBinding;Lcom/ibotta/android/mvp/ui/activity/deal/DealActivity;)V

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

    .line 46
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/deal/DealActivity_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/activity/deal/DealActivity;

    if-eqz v0, :cond_1

    const/4 v1, 0x0

    .line 48
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/deal/DealActivity_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/activity/deal/DealActivity;

    .line 50
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/deal/DealActivity;->llContentContainer:Landroid/widget/LinearLayout;

    .line 51
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/deal/DealActivity;->stcvTopContent:Lcom/ibotta/android/mvp/ui/view/gallery/SpotlightTopContentView;

    .line 53
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/deal/DealActivity_ViewBinding;->view7f0905bd:Landroid/view/View;

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_0

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 54
    :goto_0
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/deal/DealActivity_ViewBinding;->view7f0905bd:Landroid/view/View;

    return-void

    .line 47
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Bindings already cleared."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
