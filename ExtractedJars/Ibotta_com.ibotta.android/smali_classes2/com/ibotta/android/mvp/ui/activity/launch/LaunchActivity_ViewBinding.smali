.class public Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity_ViewBinding;
.super Ljava/lang/Object;
.source "LaunchActivity_ViewBinding.java"

# interfaces
.implements Lbutterknife/Unbinder;


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation


# instance fields
.field private target:Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity;

.field private view7f09021f:Landroid/view/View;

.field private view7f090220:Landroid/view/View;

.field private view7f090221:Landroid/view/View;

.field private view7f090543:Landroid/view/View;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity;)V
    .locals 1
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 29
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity_ViewBinding;-><init>(Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity;Landroid/view/View;)V

    return-void
.end method

.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity;Landroid/view/View;)V
    .locals 3
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity;

    const-string v0, "field \'tvVideo\'"

    .line 37
    const-class v1, Landroid/view/TextureView;

    const v2, 0x7f090599

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/TextureView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity;->tvVideo:Landroid/view/TextureView;

    const-string v0, "field \'gLoading\'"

    .line 38
    const-class v1, Landroid/support/constraint/Group;

    const v2, 0x7f09020a

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/constraint/Group;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity;->gLoading:Landroid/support/constraint/Group;

    const-string v0, "field \'gControls\'"

    .line 39
    const-class v1, Landroid/support/constraint/Group;

    const v2, 0x7f090209

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/constraint/Group;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity;->gControls:Landroid/support/constraint/Group;

    const-string v0, "method \'onSignInFacebookClicked\'"

    const v1, 0x7f09021f

    .line 40
    invoke-static {p2, v1, v0}, Lbutterknife/internal/Utils;->findRequiredView(Landroid/view/View;ILjava/lang/String;)Landroid/view/View;

    move-result-object v0

    .line 41
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity_ViewBinding;->view7f09021f:Landroid/view/View;

    .line 42
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity_ViewBinding$1;

    invoke-direct {v1, p0, p1}, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity_ViewBinding$1;-><init>(Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity_ViewBinding;Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity;)V

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_0

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    :goto_0
    const v0, 0x7f090220

    const-string v1, "method \'onSignInGoogleClicked\'"

    .line 48
    invoke-static {p2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredView(Landroid/view/View;ILjava/lang/String;)Landroid/view/View;

    move-result-object v0

    .line 49
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity_ViewBinding;->view7f090220:Landroid/view/View;

    .line 50
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity_ViewBinding$2;

    invoke-direct {v1, p0, p1}, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity_ViewBinding$2;-><init>(Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity_ViewBinding;Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity;)V

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_1

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_1

    :cond_1
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    :goto_1
    const v0, 0x7f090221

    const-string v1, "method \'onSignUpEmailClicked\'"

    .line 56
    invoke-static {p2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredView(Landroid/view/View;ILjava/lang/String;)Landroid/view/View;

    move-result-object v0

    .line 57
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity_ViewBinding;->view7f090221:Landroid/view/View;

    .line 58
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity_ViewBinding$3;

    invoke-direct {v1, p0, p1}, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity_ViewBinding$3;-><init>(Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity_ViewBinding;Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity;)V

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_2

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_2

    :cond_2
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    :goto_2
    const v0, 0x7f090543

    const-string v1, "method \'onLogInClicked\'"

    .line 64
    invoke-static {p2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredView(Landroid/view/View;ILjava/lang/String;)Landroid/view/View;

    move-result-object p2

    .line 65
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity_ViewBinding;->view7f090543:Landroid/view/View;

    .line 66
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity_ViewBinding$4;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity_ViewBinding$4;-><init>(Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity_ViewBinding;Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity;)V

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

    .line 77
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity;

    if-eqz v0, :cond_4

    const/4 v1, 0x0

    .line 79
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity;

    .line 81
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity;->tvVideo:Landroid/view/TextureView;

    .line 82
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity;->gLoading:Landroid/support/constraint/Group;

    .line 83
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity;->gControls:Landroid/support/constraint/Group;

    .line 85
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity_ViewBinding;->view7f09021f:Landroid/view/View;

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_0

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 86
    :goto_0
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity_ViewBinding;->view7f09021f:Landroid/view/View;

    .line 87
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity_ViewBinding;->view7f090220:Landroid/view/View;

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_1

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_1

    :cond_1
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 88
    :goto_1
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity_ViewBinding;->view7f090220:Landroid/view/View;

    .line 89
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity_ViewBinding;->view7f090221:Landroid/view/View;

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_2

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_2

    :cond_2
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 90
    :goto_2
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity_ViewBinding;->view7f090221:Landroid/view/View;

    .line 91
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity_ViewBinding;->view7f090543:Landroid/view/View;

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_3

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_3

    :cond_3
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 92
    :goto_3
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity_ViewBinding;->view7f090543:Landroid/view/View;

    return-void

    .line 78
    :cond_4
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Bindings already cleared."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
