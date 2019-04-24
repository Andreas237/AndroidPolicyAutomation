.class public Lcom/ibotta/android/mvp/ui/view/gallery/SpotlightTopContentView_ViewBinding;
.super Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView_ViewBinding;
.source "SpotlightTopContentView_ViewBinding.java"


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation


# instance fields
.field private target:Lcom/ibotta/android/mvp/ui/view/gallery/SpotlightTopContentView;

.field private view7f0902ad:Landroid/view/View;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/view/gallery/SpotlightTopContentView;)V
    .locals 0
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 19
    invoke-direct {p0, p1, p1}, Lcom/ibotta/android/mvp/ui/view/gallery/SpotlightTopContentView_ViewBinding;-><init>(Lcom/ibotta/android/mvp/ui/view/gallery/SpotlightTopContentView;Landroid/view/View;)V

    return-void
.end method

.method public constructor <init>(Lcom/ibotta/android/mvp/ui/view/gallery/SpotlightTopContentView;Landroid/view/View;)V
    .locals 2
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 24
    invoke-direct {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView_ViewBinding;-><init>(Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView;Landroid/view/View;)V

    .line 26
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/gallery/SpotlightTopContentView_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/view/gallery/SpotlightTopContentView;

    const-string v0, "method \'onImageClicked\'"

    const v1, 0x7f0902ad

    .line 29
    invoke-static {p2, v1, v0}, Lbutterknife/internal/Utils;->findRequiredView(Landroid/view/View;ILjava/lang/String;)Landroid/view/View;

    move-result-object p2

    .line 30
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/view/gallery/SpotlightTopContentView_ViewBinding;->view7f0902ad:Landroid/view/View;

    .line 31
    new-instance v0, Lcom/ibotta/android/mvp/ui/view/gallery/SpotlightTopContentView_ViewBinding$1;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/mvp/ui/view/gallery/SpotlightTopContentView_ViewBinding$1;-><init>(Lcom/ibotta/android/mvp/ui/view/gallery/SpotlightTopContentView_ViewBinding;Lcom/ibotta/android/mvp/ui/view/gallery/SpotlightTopContentView;)V

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

    .line 41
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/gallery/SpotlightTopContentView_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/view/gallery/SpotlightTopContentView;

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    .line 42
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/view/gallery/SpotlightTopContentView_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/view/gallery/SpotlightTopContentView;

    .line 45
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/gallery/SpotlightTopContentView_ViewBinding;->view7f0902ad:Landroid/view/View;

    instance-of v2, v1, Landroid/view/View;

    if-nez v2, :cond_0

    invoke-virtual {v1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    check-cast v1, Landroid/view/View;

    invoke-static {v1, v0}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 46
    :goto_0
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/view/gallery/SpotlightTopContentView_ViewBinding;->view7f0902ad:Landroid/view/View;

    .line 48
    invoke-super {p0}, Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView_ViewBinding;->unbind()V

    return-void

    .line 41
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Bindings already cleared."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
