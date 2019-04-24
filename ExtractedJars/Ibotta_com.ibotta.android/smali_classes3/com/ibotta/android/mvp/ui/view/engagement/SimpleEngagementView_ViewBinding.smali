.class public Lcom/ibotta/android/mvp/ui/view/engagement/SimpleEngagementView_ViewBinding;
.super Ljava/lang/Object;
.source "SimpleEngagementView_ViewBinding.java"

# interfaces
.implements Lbutterknife/Unbinder;


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation


# instance fields
.field private target:Lcom/ibotta/android/mvp/ui/view/engagement/SimpleEngagementView;

.field private view7f090096:Landroid/view/View;

.field private view7f0900ab:Landroid/view/View;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/view/engagement/SimpleEngagementView;)V
    .locals 0
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 26
    invoke-direct {p0, p1, p1}, Lcom/ibotta/android/mvp/ui/view/engagement/SimpleEngagementView_ViewBinding;-><init>(Lcom/ibotta/android/mvp/ui/view/engagement/SimpleEngagementView;Landroid/view/View;)V

    return-void
.end method

.method public constructor <init>(Lcom/ibotta/android/mvp/ui/view/engagement/SimpleEngagementView;Landroid/view/View;)V
    .locals 4
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/engagement/SimpleEngagementView_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/view/engagement/SimpleEngagementView;

    const-string v0, "field \'ivBanner\'"

    .line 34
    const-class v1, Landroid/widget/ImageView;

    const v2, 0x7f090292

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/view/engagement/SimpleEngagementView;->ivBanner:Landroid/widget/ImageView;

    const-string v0, "field \'tvContent\'"

    .line 35
    const-class v1, Landroid/widget/TextView;

    const v2, 0x7f09050e

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/view/engagement/SimpleEngagementView;->tvContent:Landroid/widget/TextView;

    const-string v0, "field \'bSubmit\' and method \'onSubmitClicked\'"

    const v1, 0x7f0900ab

    .line 36
    invoke-static {p2, v1, v0}, Lbutterknife/internal/Utils;->findRequiredView(Landroid/view/View;ILjava/lang/String;)Landroid/view/View;

    move-result-object v0

    const-string v2, "field \'bSubmit\'"

    .line 37
    const-class v3, Landroid/widget/Button;

    invoke-static {v0, v1, v2, v3}, Lbutterknife/internal/Utils;->castView(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/widget/Button;

    iput-object v1, p1, Lcom/ibotta/android/mvp/ui/view/engagement/SimpleEngagementView;->bSubmit:Landroid/widget/Button;

    .line 38
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/view/engagement/SimpleEngagementView_ViewBinding;->view7f0900ab:Landroid/view/View;

    .line 39
    new-instance v1, Lcom/ibotta/android/mvp/ui/view/engagement/SimpleEngagementView_ViewBinding$1;

    invoke-direct {v1, p0, p1}, Lcom/ibotta/android/mvp/ui/view/engagement/SimpleEngagementView_ViewBinding$1;-><init>(Lcom/ibotta/android/mvp/ui/view/engagement/SimpleEngagementView_ViewBinding;Lcom/ibotta/android/mvp/ui/view/engagement/SimpleEngagementView;)V

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_0

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    :goto_0
    const-string v0, "field \'bNoThanks\' and method \'onNoThanksClicked\'"

    const v1, 0x7f090096

    .line 45
    invoke-static {p2, v1, v0}, Lbutterknife/internal/Utils;->findRequiredView(Landroid/view/View;ILjava/lang/String;)Landroid/view/View;

    move-result-object p2

    const-string v0, "field \'bNoThanks\'"

    .line 46
    const-class v2, Landroid/widget/Button;

    invoke-static {p2, v1, v0, v2}, Lbutterknife/internal/Utils;->castView(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/view/engagement/SimpleEngagementView;->bNoThanks:Landroid/widget/Button;

    .line 47
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/view/engagement/SimpleEngagementView_ViewBinding;->view7f090096:Landroid/view/View;

    .line 48
    new-instance v0, Lcom/ibotta/android/mvp/ui/view/engagement/SimpleEngagementView_ViewBinding$2;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/mvp/ui/view/engagement/SimpleEngagementView_ViewBinding$2;-><init>(Lcom/ibotta/android/mvp/ui/view/engagement/SimpleEngagementView_ViewBinding;Lcom/ibotta/android/mvp/ui/view/engagement/SimpleEngagementView;)V

    instance-of p1, p2, Landroid/view/View;

    if-nez p1, :cond_1

    invoke-virtual {p2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_1

    :cond_1
    check-cast p2, Landroid/view/View;

    invoke-static {p2, v0}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    :goto_1
    return-void
.end method


# virtual methods
.method public unbind()V
    .locals 3
    .annotation build Landroid/support/annotation/CallSuper;
    .end annotation

    .line 59
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/engagement/SimpleEngagementView_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/view/engagement/SimpleEngagementView;

    if-eqz v0, :cond_2

    const/4 v1, 0x0

    .line 61
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/view/engagement/SimpleEngagementView_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/view/engagement/SimpleEngagementView;

    .line 63
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/engagement/SimpleEngagementView;->ivBanner:Landroid/widget/ImageView;

    .line 64
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/engagement/SimpleEngagementView;->tvContent:Landroid/widget/TextView;

    .line 65
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/engagement/SimpleEngagementView;->bSubmit:Landroid/widget/Button;

    .line 66
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/engagement/SimpleEngagementView;->bNoThanks:Landroid/widget/Button;

    .line 68
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/engagement/SimpleEngagementView_ViewBinding;->view7f0900ab:Landroid/view/View;

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_0

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 69
    :goto_0
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/view/engagement/SimpleEngagementView_ViewBinding;->view7f0900ab:Landroid/view/View;

    .line 70
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/engagement/SimpleEngagementView_ViewBinding;->view7f090096:Landroid/view/View;

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_1

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_1

    :cond_1
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 71
    :goto_1
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/view/engagement/SimpleEngagementView_ViewBinding;->view7f090096:Landroid/view/View;

    return-void

    .line 60
    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Bindings already cleared."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
