.class public Lcom/ibotta/android/mvp/ui/view/engagement/VideoEngagementView_ViewBinding;
.super Ljava/lang/Object;
.source "VideoEngagementView_ViewBinding.java"

# interfaces
.implements Lbutterknife/Unbinder;


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation


# instance fields
.field private target:Lcom/ibotta/android/mvp/ui/view/engagement/VideoEngagementView;

.field private view7f0900ab:Landroid/view/View;

.field private view7f0901f9:Landroid/view/View;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/view/engagement/VideoEngagementView;)V
    .locals 0
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 27
    invoke-direct {p0, p1, p1}, Lcom/ibotta/android/mvp/ui/view/engagement/VideoEngagementView_ViewBinding;-><init>(Lcom/ibotta/android/mvp/ui/view/engagement/VideoEngagementView;Landroid/view/View;)V

    return-void
.end method

.method public constructor <init>(Lcom/ibotta/android/mvp/ui/view/engagement/VideoEngagementView;Landroid/view/View;)V
    .locals 4
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/engagement/VideoEngagementView_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/view/engagement/VideoEngagementView;

    const-string v0, "field \'ivThumbnail\'"

    .line 35
    const-class v1, Landroid/widget/ImageView;

    const v2, 0x7f0902cf

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/view/engagement/VideoEngagementView;->ivThumbnail:Landroid/widget/ImageView;

    const-string v0, "field \'svnvNotice\'"

    .line 36
    const-class v1, Lcom/ibotta/android/mvp/ui/view/engagement/row/SponsoredVideoNoticeView;

    const v2, 0x7f090438

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/view/engagement/row/SponsoredVideoNoticeView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/view/engagement/VideoEngagementView;->svnvNotice:Lcom/ibotta/android/mvp/ui/view/engagement/row/SponsoredVideoNoticeView;

    const-string v0, "field \'tvContent\'"

    .line 37
    const-class v1, Landroid/widget/TextView;

    const v2, 0x7f09050e

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/view/engagement/VideoEngagementView;->tvContent:Landroid/widget/TextView;

    const-string v0, "field \'bSubmit\' and method \'onSubmitClicked\'"

    const v1, 0x7f0900ab

    .line 38
    invoke-static {p2, v1, v0}, Lbutterknife/internal/Utils;->findRequiredView(Landroid/view/View;ILjava/lang/String;)Landroid/view/View;

    move-result-object v0

    const-string v2, "field \'bSubmit\'"

    .line 39
    const-class v3, Landroid/widget/Button;

    invoke-static {v0, v1, v2, v3}, Lbutterknife/internal/Utils;->castView(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/widget/Button;

    iput-object v1, p1, Lcom/ibotta/android/mvp/ui/view/engagement/VideoEngagementView;->bSubmit:Landroid/widget/Button;

    .line 40
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/view/engagement/VideoEngagementView_ViewBinding;->view7f0900ab:Landroid/view/View;

    .line 41
    new-instance v1, Lcom/ibotta/android/mvp/ui/view/engagement/VideoEngagementView_ViewBinding$1;

    invoke-direct {v1, p0, p1}, Lcom/ibotta/android/mvp/ui/view/engagement/VideoEngagementView_ViewBinding$1;-><init>(Lcom/ibotta/android/mvp/ui/view/engagement/VideoEngagementView_ViewBinding;Lcom/ibotta/android/mvp/ui/view/engagement/VideoEngagementView;)V

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_0

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    :goto_0
    const v0, 0x7f0901f9

    const-string v1, "method \'onThumbnailClicked\'"

    .line 47
    invoke-static {p2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredView(Landroid/view/View;ILjava/lang/String;)Landroid/view/View;

    move-result-object p2

    .line 48
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/view/engagement/VideoEngagementView_ViewBinding;->view7f0901f9:Landroid/view/View;

    .line 49
    new-instance v0, Lcom/ibotta/android/mvp/ui/view/engagement/VideoEngagementView_ViewBinding$2;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/mvp/ui/view/engagement/VideoEngagementView_ViewBinding$2;-><init>(Lcom/ibotta/android/mvp/ui/view/engagement/VideoEngagementView_ViewBinding;Lcom/ibotta/android/mvp/ui/view/engagement/VideoEngagementView;)V

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

    .line 60
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/engagement/VideoEngagementView_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/view/engagement/VideoEngagementView;

    if-eqz v0, :cond_2

    const/4 v1, 0x0

    .line 62
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/view/engagement/VideoEngagementView_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/view/engagement/VideoEngagementView;

    .line 64
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/engagement/VideoEngagementView;->ivThumbnail:Landroid/widget/ImageView;

    .line 65
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/engagement/VideoEngagementView;->svnvNotice:Lcom/ibotta/android/mvp/ui/view/engagement/row/SponsoredVideoNoticeView;

    .line 66
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/engagement/VideoEngagementView;->tvContent:Landroid/widget/TextView;

    .line 67
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/engagement/VideoEngagementView;->bSubmit:Landroid/widget/Button;

    .line 69
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/engagement/VideoEngagementView_ViewBinding;->view7f0900ab:Landroid/view/View;

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_0

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 70
    :goto_0
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/view/engagement/VideoEngagementView_ViewBinding;->view7f0900ab:Landroid/view/View;

    .line 71
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/engagement/VideoEngagementView_ViewBinding;->view7f0901f9:Landroid/view/View;

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_1

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_1

    :cond_1
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 72
    :goto_1
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/view/engagement/VideoEngagementView_ViewBinding;->view7f0901f9:Landroid/view/View;

    return-void

    .line 61
    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Bindings already cleared."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
