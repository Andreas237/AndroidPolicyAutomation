.class public Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsActivity_ViewBinding;
.super Ljava/lang/Object;
.source "RedeemReqsActivity_ViewBinding.java"

# interfaces
.implements Lbutterknife/Unbinder;


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation


# instance fields
.field private target:Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsActivity;

.field private view7f090084:Landroid/view/View;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsActivity;)V
    .locals 1
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 26
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsActivity_ViewBinding;-><init>(Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsActivity;Landroid/view/View;)V

    return-void
.end method

.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsActivity;Landroid/view/View;)V
    .locals 3
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsActivity_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsActivity;

    const-string v0, "field \'ivRedeemType\'"

    .line 34
    const-class v1, Landroid/widget/ImageView;

    const v2, 0x7f0902c0

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsActivity;->ivRedeemType:Landroid/widget/ImageView;

    const-string v0, "field \'tbvGeneralInstructionsTitle\'"

    .line 35
    const-class v1, Lcom/ibotta/android/views/base/title/TitleBarView;

    const v2, 0x7f090446

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/views/base/title/TitleBarView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsActivity;->tbvGeneralInstructionsTitle:Lcom/ibotta/android/views/base/title/TitleBarView;

    const-string v0, "field \'tvGenInstructions\'"

    .line 36
    const-class v1, Landroid/widget/TextView;

    const v2, 0x7f09052b

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsActivity;->tvGenInstructions:Landroid/widget/TextView;

    const-string v0, "field \'rivInstructions\'"

    .line 37
    const-class v1, Lcom/ibotta/android/view/redeem/RedeemInstructionsView;

    const v2, 0x7f0903cb

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/view/redeem/RedeemInstructionsView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsActivity;->rivInstructions:Lcom/ibotta/android/view/redeem/RedeemInstructionsView;

    const-string v0, "field \'bContinue\' and method \'onContinueClicked\'"

    const v1, 0x7f090084

    .line 38
    invoke-static {p2, v1, v0}, Lbutterknife/internal/Utils;->findRequiredView(Landroid/view/View;ILjava/lang/String;)Landroid/view/View;

    move-result-object p2

    const-string v0, "field \'bContinue\'"

    .line 39
    const-class v2, Landroid/widget/Button;

    invoke-static {p2, v1, v0, v2}, Lbutterknife/internal/Utils;->castView(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsActivity;->bContinue:Landroid/widget/Button;

    .line 40
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsActivity_ViewBinding;->view7f090084:Landroid/view/View;

    .line 41
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsActivity_ViewBinding$1;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsActivity_ViewBinding$1;-><init>(Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsActivity_ViewBinding;Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsActivity;)V

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

    .line 52
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsActivity_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsActivity;

    if-eqz v0, :cond_1

    const/4 v1, 0x0

    .line 54
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsActivity_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsActivity;

    .line 56
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsActivity;->ivRedeemType:Landroid/widget/ImageView;

    .line 57
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsActivity;->tbvGeneralInstructionsTitle:Lcom/ibotta/android/views/base/title/TitleBarView;

    .line 58
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsActivity;->tvGenInstructions:Landroid/widget/TextView;

    .line 59
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsActivity;->rivInstructions:Lcom/ibotta/android/view/redeem/RedeemInstructionsView;

    .line 60
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsActivity;->bContinue:Landroid/widget/Button;

    .line 62
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsActivity_ViewBinding;->view7f090084:Landroid/view/View;

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_0

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 63
    :goto_0
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsActivity_ViewBinding;->view7f090084:Landroid/view/View;

    return-void

    .line 53
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Bindings already cleared."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
