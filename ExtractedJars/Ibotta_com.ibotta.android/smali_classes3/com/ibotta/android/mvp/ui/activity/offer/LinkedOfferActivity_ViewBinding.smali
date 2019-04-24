.class public Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferActivity_ViewBinding;
.super Ljava/lang/Object;
.source "LinkedOfferActivity_ViewBinding.java"

# interfaces
.implements Lbutterknife/Unbinder;


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation


# instance fields
.field private target:Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferActivity;

.field private view7f090096:Landroid/view/View;

.field private view7f0900b2:Landroid/view/View;

.field private view7f090231:Landroid/view/View;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferActivity;)V
    .locals 1
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 28
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferActivity_ViewBinding;-><init>(Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferActivity;Landroid/view/View;)V

    return-void
.end method

.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferActivity;Landroid/view/View;)V
    .locals 4
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferActivity_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferActivity;

    const-string v0, "field \'ibClose\' and method \'onCloseClicked\'"

    const v1, 0x7f090231

    .line 36
    invoke-static {p2, v1, v0}, Lbutterknife/internal/Utils;->findRequiredView(Landroid/view/View;ILjava/lang/String;)Landroid/view/View;

    move-result-object v0

    const-string v2, "field \'ibClose\'"

    .line 37
    const-class v3, Landroid/widget/ImageButton;

    invoke-static {v0, v1, v2, v3}, Lbutterknife/internal/Utils;->castView(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageButton;

    iput-object v1, p1, Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferActivity;->ibClose:Landroid/widget/ImageButton;

    .line 38
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferActivity_ViewBinding;->view7f090231:Landroid/view/View;

    .line 39
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferActivity_ViewBinding$1;

    invoke-direct {v1, p0, p1}, Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferActivity_ViewBinding$1;-><init>(Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferActivity_ViewBinding;Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferActivity;)V

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_0

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    :goto_0
    const v0, 0x7f09039c

    const-string v1, "field \'pfivProduct\'"

    .line 45
    const-class v2, Lcom/ibotta/android/commons/view/PerfectFitImageView;

    invoke-static {p2, v0, v1, v2}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/commons/view/PerfectFitImageView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferActivity;->pfivProduct:Lcom/ibotta/android/commons/view/PerfectFitImageView;

    const v0, 0x7f09051b

    const-string v1, "field \'tvEarn\'"

    .line 46
    const-class v2, Landroid/widget/TextView;

    invoke-static {p2, v0, v1, v2}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferActivity;->tvEarn:Landroid/widget/TextView;

    const v0, 0x7f09054d

    const-string v1, "field \'tvName\'"

    .line 47
    const-class v2, Landroid/widget/TextView;

    invoke-static {p2, v0, v1, v2}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferActivity;->tvName:Landroid/widget/TextView;

    const v0, 0x7f090518

    const-string v1, "field \'tvDetails\'"

    .line 48
    const-class v2, Landroid/widget/TextView;

    invoke-static {p2, v0, v1, v2}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferActivity;->tvDetails:Landroid/widget/TextView;

    const v0, 0x7f0900b2

    const-string v1, "method \'onViewRebateClicked\'"

    .line 49
    invoke-static {p2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredView(Landroid/view/View;ILjava/lang/String;)Landroid/view/View;

    move-result-object v0

    .line 50
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferActivity_ViewBinding;->view7f0900b2:Landroid/view/View;

    .line 51
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferActivity_ViewBinding$2;

    invoke-direct {v1, p0, p1}, Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferActivity_ViewBinding$2;-><init>(Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferActivity_ViewBinding;Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferActivity;)V

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_1

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_1

    :cond_1
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    :goto_1
    const v0, 0x7f090096

    const-string v1, "method \'onNoThanksClicked\'"

    .line 57
    invoke-static {p2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredView(Landroid/view/View;ILjava/lang/String;)Landroid/view/View;

    move-result-object p2

    .line 58
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferActivity_ViewBinding;->view7f090096:Landroid/view/View;

    .line 59
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferActivity_ViewBinding$3;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferActivity_ViewBinding$3;-><init>(Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferActivity_ViewBinding;Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferActivity;)V

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

    .line 70
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferActivity_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferActivity;

    if-eqz v0, :cond_3

    const/4 v1, 0x0

    .line 72
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferActivity_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferActivity;

    .line 74
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferActivity;->ibClose:Landroid/widget/ImageButton;

    .line 75
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferActivity;->pfivProduct:Lcom/ibotta/android/commons/view/PerfectFitImageView;

    .line 76
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferActivity;->tvEarn:Landroid/widget/TextView;

    .line 77
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferActivity;->tvName:Landroid/widget/TextView;

    .line 78
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferActivity;->tvDetails:Landroid/widget/TextView;

    .line 80
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferActivity_ViewBinding;->view7f090231:Landroid/view/View;

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_0

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 81
    :goto_0
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferActivity_ViewBinding;->view7f090231:Landroid/view/View;

    .line 82
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferActivity_ViewBinding;->view7f0900b2:Landroid/view/View;

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_1

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_1

    :cond_1
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 83
    :goto_1
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferActivity_ViewBinding;->view7f0900b2:Landroid/view/View;

    .line 84
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferActivity_ViewBinding;->view7f090096:Landroid/view/View;

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_2

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_2

    :cond_2
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 85
    :goto_2
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferActivity_ViewBinding;->view7f090096:Landroid/view/View;

    return-void

    .line 71
    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Bindings already cleared."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
