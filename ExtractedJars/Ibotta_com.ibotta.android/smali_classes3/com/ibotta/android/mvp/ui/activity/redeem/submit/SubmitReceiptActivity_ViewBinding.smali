.class public Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptActivity_ViewBinding;
.super Ljava/lang/Object;
.source "SubmitReceiptActivity_ViewBinding.java"

# interfaces
.implements Lbutterknife/Unbinder;


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation


# instance fields
.field private target:Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptActivity;

.field private view7f09007f:Landroid/view/View;

.field private view7f090086:Landroid/view/View;

.field private view7f09009b:Landroid/view/View;

.field private view7f0900a1:Landroid/view/View;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptActivity;)V
    .locals 1
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 31
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptActivity_ViewBinding;-><init>(Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptActivity;Landroid/view/View;)V

    return-void
.end method

.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptActivity;Landroid/view/View;)V
    .locals 3
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptActivity_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptActivity;

    const-string v0, "field \'llSubmitting\'"

    .line 39
    const-class v1, Landroid/widget/LinearLayout;

    const v2, 0x7f09032c

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptActivity;->llSubmitting:Landroid/widget/LinearLayout;

    const-string v0, "field \'tvSubmitting\'"

    .line 40
    const-class v1, Landroid/widget/TextView;

    const v2, 0x7f09057b

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptActivity;->tvSubmitting:Landroid/widget/TextView;

    const-string v0, "field \'llSubmitted\'"

    .line 41
    const-class v1, Landroid/widget/LinearLayout;

    const v2, 0x7f09032b

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptActivity;->llSubmitted:Landroid/widget/LinearLayout;

    const-string v0, "field \'lavSubmitted\'"

    .line 42
    const-class v1, Lcom/airbnb/lottie/LottieAnimationView;

    const v2, 0x7f0902ea

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/airbnb/lottie/LottieAnimationView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptActivity;->lavSubmitted:Lcom/airbnb/lottie/LottieAnimationView;

    const-string v0, "field \'lavSubmittingOrFailed\'"

    .line 43
    const-class v1, Lcom/airbnb/lottie/LottieAnimationView;

    const v2, 0x7f0902eb

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/airbnb/lottie/LottieAnimationView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptActivity;->lavSubmittingOrFailed:Lcom/airbnb/lottie/LottieAnimationView;

    const-string v0, "field \'llSuccess\'"

    .line 44
    const-class v1, Landroid/widget/RelativeLayout;

    const v2, 0x7f09032d

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptActivity;->llSuccess:Landroid/widget/RelativeLayout;

    const-string v0, "field \'tvSuccessMessage\'"

    .line 45
    const-class v1, Landroid/widget/TextView;

    const v2, 0x7f090581

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptActivity;->tvSuccessMessage:Landroid/widget/TextView;

    const-string v0, "field \'llFailed\'"

    .line 46
    const-class v1, Landroid/widget/RelativeLayout;

    const v2, 0x7f09030a

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptActivity;->llFailed:Landroid/widget/RelativeLayout;

    const-string v0, "method \'onRedeemAnotherClicked\'"

    const v1, 0x7f09009b

    .line 47
    invoke-static {p2, v1, v0}, Lbutterknife/internal/Utils;->findRequiredView(Landroid/view/View;ILjava/lang/String;)Landroid/view/View;

    move-result-object v0

    .line 48
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptActivity_ViewBinding;->view7f09009b:Landroid/view/View;

    .line 49
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptActivity_ViewBinding$1;

    invoke-direct {v1, p0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptActivity_ViewBinding$1;-><init>(Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptActivity_ViewBinding;Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptActivity;)V

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_0

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    :goto_0
    const v0, 0x7f090086

    const-string v1, "method \'onDoneClicked\'"

    .line 55
    invoke-static {p2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredView(Landroid/view/View;ILjava/lang/String;)Landroid/view/View;

    move-result-object v0

    .line 56
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptActivity_ViewBinding;->view7f090086:Landroid/view/View;

    .line 57
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptActivity_ViewBinding$2;

    invoke-direct {v1, p0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptActivity_ViewBinding$2;-><init>(Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptActivity_ViewBinding;Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptActivity;)V

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_1

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_1

    :cond_1
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    :goto_1
    const v0, 0x7f09007f

    const-string v1, "method \'onCancelClicked\'"

    .line 63
    invoke-static {p2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredView(Landroid/view/View;ILjava/lang/String;)Landroid/view/View;

    move-result-object v0

    .line 64
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptActivity_ViewBinding;->view7f09007f:Landroid/view/View;

    .line 65
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptActivity_ViewBinding$3;

    invoke-direct {v1, p0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptActivity_ViewBinding$3;-><init>(Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptActivity_ViewBinding;Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptActivity;)V

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_2

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_2

    :cond_2
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    :goto_2
    const v0, 0x7f0900a1

    const-string v1, "method \'onRetryClicked\'"

    .line 71
    invoke-static {p2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredView(Landroid/view/View;ILjava/lang/String;)Landroid/view/View;

    move-result-object p2

    .line 72
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptActivity_ViewBinding;->view7f0900a1:Landroid/view/View;

    .line 73
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptActivity_ViewBinding$4;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptActivity_ViewBinding$4;-><init>(Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptActivity_ViewBinding;Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptActivity;)V

    instance-of p1, p2, Landroid/view/View;

    if-nez p1, :cond_3

    invoke-virtual {p2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_3

    :cond_3
    check-cast p2, Landroid/view/View;

    invoke-static {p2, v0}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    :goto_3
    return-void
.end method


# virtual methods
.method public unbind()V
    .locals 3
    .annotation build Landroid/support/annotation/CallSuper;
    .end annotation

    .line 84
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptActivity_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptActivity;

    if-eqz v0, :cond_4

    const/4 v1, 0x0

    .line 86
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptActivity_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptActivity;

    .line 88
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptActivity;->llSubmitting:Landroid/widget/LinearLayout;

    .line 89
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptActivity;->tvSubmitting:Landroid/widget/TextView;

    .line 90
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptActivity;->llSubmitted:Landroid/widget/LinearLayout;

    .line 91
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptActivity;->lavSubmitted:Lcom/airbnb/lottie/LottieAnimationView;

    .line 92
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptActivity;->lavSubmittingOrFailed:Lcom/airbnb/lottie/LottieAnimationView;

    .line 93
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptActivity;->llSuccess:Landroid/widget/RelativeLayout;

    .line 94
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptActivity;->tvSuccessMessage:Landroid/widget/TextView;

    .line 95
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptActivity;->llFailed:Landroid/widget/RelativeLayout;

    .line 97
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptActivity_ViewBinding;->view7f09009b:Landroid/view/View;

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_0

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 98
    :goto_0
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptActivity_ViewBinding;->view7f09009b:Landroid/view/View;

    .line 99
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptActivity_ViewBinding;->view7f090086:Landroid/view/View;

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_1

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_1

    :cond_1
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 100
    :goto_1
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptActivity_ViewBinding;->view7f090086:Landroid/view/View;

    .line 101
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptActivity_ViewBinding;->view7f09007f:Landroid/view/View;

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_2

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_2

    :cond_2
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 102
    :goto_2
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptActivity_ViewBinding;->view7f09007f:Landroid/view/View;

    .line 103
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptActivity_ViewBinding;->view7f0900a1:Landroid/view/View;

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_3

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_3

    :cond_3
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 104
    :goto_3
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptActivity_ViewBinding;->view7f0900a1:Landroid/view/View;

    return-void

    .line 85
    :cond_4
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Bindings already cleared."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
