.class public Lcom/ibotta/android/mvp/ui/activity/video/VideoActivity_ViewBinding;
.super Ljava/lang/Object;
.source "VideoActivity_ViewBinding.java"

# interfaces
.implements Lbutterknife/Unbinder;


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation


# instance fields
.field private target:Lcom/ibotta/android/mvp/ui/activity/video/VideoActivity;

.field private view7f09007f:Landroid/view/View;

.field private view7f0900a9:Landroid/view/View;

.field private view7f0902d4:Landroid/view/View;

.field private view7f090466:Landroid/view/View;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/video/VideoActivity;)V
    .locals 1
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 34
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/video/VideoActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/activity/video/VideoActivity_ViewBinding;-><init>(Lcom/ibotta/android/mvp/ui/activity/video/VideoActivity;Landroid/view/View;)V

    return-void
.end method

.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/video/VideoActivity;Landroid/view/View;)V
    .locals 4
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ClickableViewAccessibility"
        }
    .end annotation

    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/video/VideoActivity_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/activity/video/VideoActivity;

    const-string v0, "field \'flVideoContainer\'"

    .line 43
    const-class v1, Landroid/widget/FrameLayout;

    const v2, 0x7f0901fe

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/video/VideoActivity;->flVideoContainer:Landroid/widget/FrameLayout;

    const-string v0, "field \'vgLoading\'"

    .line 44
    const-class v1, Landroid/view/ViewGroup;

    const v2, 0x7f0903cd

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/video/VideoActivity;->vgLoading:Landroid/view/ViewGroup;

    const-string v0, "field \'ivvVideo\' and method \'onVideoTouched\'"

    const v1, 0x7f0902d4

    .line 45
    invoke-static {p2, v1, v0}, Lbutterknife/internal/Utils;->findRequiredView(Landroid/view/View;ILjava/lang/String;)Landroid/view/View;

    move-result-object v0

    const-string v2, "field \'ivvVideo\'"

    .line 46
    const-class v3, Lcom/ibotta/android/view/video/IbottaVideoView;

    invoke-static {v0, v1, v2, v3}, Lbutterknife/internal/Utils;->castView(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/android/view/video/IbottaVideoView;

    iput-object v1, p1, Lcom/ibotta/android/mvp/ui/activity/video/VideoActivity;->ivvVideo:Lcom/ibotta/android/view/video/IbottaVideoView;

    .line 47
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/video/VideoActivity_ViewBinding;->view7f0902d4:Landroid/view/View;

    .line 48
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/video/VideoActivity_ViewBinding$1;

    invoke-direct {v1, p0, p1}, Lcom/ibotta/android/mvp/ui/activity/video/VideoActivity_ViewBinding$1;-><init>(Lcom/ibotta/android/mvp/ui/activity/video/VideoActivity_ViewBinding;Lcom/ibotta/android/mvp/ui/activity/video/VideoActivity;)V

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_0

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    goto :goto_0

    :cond_0
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnTouchListener(Landroid/view/View;Landroid/view/View$OnTouchListener;)V

    :goto_0
    const-string v0, "field \'tibVideoPlay\' and method \'onVideoPlayClicked\'"

    const v1, 0x7f090466

    .line 54
    invoke-static {p2, v1, v0}, Lbutterknife/internal/Utils;->findRequiredView(Landroid/view/View;ILjava/lang/String;)Landroid/view/View;

    move-result-object v0

    const-string v2, "field \'tibVideoPlay\'"

    .line 55
    const-class v3, Lcom/ibotta/android/commons/view/TintableImageButton;

    invoke-static {v0, v1, v2, v3}, Lbutterknife/internal/Utils;->castView(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/android/commons/view/TintableImageButton;

    iput-object v1, p1, Lcom/ibotta/android/mvp/ui/activity/video/VideoActivity;->tibVideoPlay:Lcom/ibotta/android/commons/view/TintableImageButton;

    .line 56
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/video/VideoActivity_ViewBinding;->view7f090466:Landroid/view/View;

    .line 57
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/video/VideoActivity_ViewBinding$2;

    invoke-direct {v1, p0, p1}, Lcom/ibotta/android/mvp/ui/activity/video/VideoActivity_ViewBinding$2;-><init>(Lcom/ibotta/android/mvp/ui/activity/video/VideoActivity_ViewBinding;Lcom/ibotta/android/mvp/ui/activity/video/VideoActivity;)V

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_1

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_1

    :cond_1
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    :goto_1
    const-string v0, "field \'bSkip\' and method \'onSkipClicked\'"

    const v1, 0x7f0900a9

    .line 63
    invoke-static {p2, v1, v0}, Lbutterknife/internal/Utils;->findRequiredView(Landroid/view/View;ILjava/lang/String;)Landroid/view/View;

    move-result-object v0

    const-string v2, "field \'bSkip\'"

    .line 64
    const-class v3, Landroid/widget/Button;

    invoke-static {v0, v1, v2, v3}, Lbutterknife/internal/Utils;->castView(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/widget/Button;

    iput-object v1, p1, Lcom/ibotta/android/mvp/ui/activity/video/VideoActivity;->bSkip:Landroid/widget/Button;

    .line 65
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/video/VideoActivity_ViewBinding;->view7f0900a9:Landroid/view/View;

    .line 66
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/video/VideoActivity_ViewBinding$3;

    invoke-direct {v1, p0, p1}, Lcom/ibotta/android/mvp/ui/activity/video/VideoActivity_ViewBinding$3;-><init>(Lcom/ibotta/android/mvp/ui/activity/video/VideoActivity_ViewBinding;Lcom/ibotta/android/mvp/ui/activity/video/VideoActivity;)V

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_2

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_2

    :cond_2
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    :goto_2
    const v0, 0x7f09007f

    const-string v1, "method \'onCancelClicked\'"

    .line 72
    invoke-static {p2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredView(Landroid/view/View;ILjava/lang/String;)Landroid/view/View;

    move-result-object p2

    .line 73
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/video/VideoActivity_ViewBinding;->view7f09007f:Landroid/view/View;

    .line 74
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/video/VideoActivity_ViewBinding$4;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/mvp/ui/activity/video/VideoActivity_ViewBinding$4;-><init>(Lcom/ibotta/android/mvp/ui/activity/video/VideoActivity_ViewBinding;Lcom/ibotta/android/mvp/ui/activity/video/VideoActivity;)V

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

    .line 85
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/video/VideoActivity_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/activity/video/VideoActivity;

    if-eqz v0, :cond_4

    const/4 v1, 0x0

    .line 87
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/video/VideoActivity_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/activity/video/VideoActivity;

    .line 89
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/video/VideoActivity;->flVideoContainer:Landroid/widget/FrameLayout;

    .line 90
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/video/VideoActivity;->vgLoading:Landroid/view/ViewGroup;

    .line 91
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/video/VideoActivity;->ivvVideo:Lcom/ibotta/android/view/video/IbottaVideoView;

    .line 92
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/video/VideoActivity;->tibVideoPlay:Lcom/ibotta/android/commons/view/TintableImageButton;

    .line 93
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/video/VideoActivity;->bSkip:Landroid/widget/Button;

    .line 95
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/video/VideoActivity_ViewBinding;->view7f0902d4:Landroid/view/View;

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_0

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    goto :goto_0

    :cond_0
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnTouchListener(Landroid/view/View;Landroid/view/View$OnTouchListener;)V

    .line 96
    :goto_0
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/video/VideoActivity_ViewBinding;->view7f0902d4:Landroid/view/View;

    .line 97
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/video/VideoActivity_ViewBinding;->view7f090466:Landroid/view/View;

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_1

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_1

    :cond_1
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 98
    :goto_1
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/video/VideoActivity_ViewBinding;->view7f090466:Landroid/view/View;

    .line 99
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/video/VideoActivity_ViewBinding;->view7f0900a9:Landroid/view/View;

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_2

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_2

    :cond_2
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 100
    :goto_2
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/video/VideoActivity_ViewBinding;->view7f0900a9:Landroid/view/View;

    .line 101
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/video/VideoActivity_ViewBinding;->view7f09007f:Landroid/view/View;

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_3

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_3

    :cond_3
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 102
    :goto_3
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/video/VideoActivity_ViewBinding;->view7f09007f:Landroid/view/View;

    return-void

    .line 86
    :cond_4
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Bindings already cleared."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
