.class public abstract Lcom/ibotta/android/mvp/ui/view/engagement/AbstractEngagementView;
.super Landroid/widget/FrameLayout;
.source "AbstractEngagementView.java"


# instance fields
.field protected activated:Z

.field protected currentValue:Ljava/lang/String;

.field protected engagementHost:Lcom/ibotta/android/mvp/ui/view/engagement/EngagementHost;

.field protected name:Ljava/lang/String;

.field protected pixelTrackingManager:Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManager;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field private pixelTrackingViewOccurred:Z

.field protected retailerModel:Lcom/ibotta/api/model/RetailerModel;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field protected taskModel:Lcom/ibotta/api/model/TaskModel;

.field protected thumbUrl:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 48
    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/view/engagement/AbstractEngagementView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    .line 52
    invoke-direct {p0, p1, p2, v0}, Lcom/ibotta/android/mvp/ui/view/engagement/AbstractEngagementView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    const/4 v0, 0x0

    .line 56
    invoke-direct {p0, p1, p2, p3, v0}, Lcom/ibotta/android/mvp/ui/view/engagement/AbstractEngagementView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 0

    .line 60
    invoke-direct {p0, p1, p2, p3, p4}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 61
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/engagement/AbstractEngagementView;->injectThis()V

    .line 62
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/engagement/AbstractEngagementView;->loadLayout()V

    return-void
.end method

.method private loadLayout()V
    .locals 3
    .annotation build Lhugo/weaving/DebugLog;
    .end annotation

    const v0, 0x7f060171

    .line 77
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/engagement/AbstractEngagementView;->setBackgroundResource(I)V

    .line 79
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/engagement/AbstractEngagementView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/engagement/AbstractEngagementView;->getLayoutId()I

    move-result v1

    const/4 v2, 0x1

    invoke-virtual {v0, v1, p0, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 80
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/view/View;)Lbutterknife/Unbinder;

    .line 82
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/engagement/AbstractEngagementView;->initLayout()V

    .line 84
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/engagement/AbstractEngagementView;->isViewPixelTrackingEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/engagement/AbstractEngagementView;->taskModel:Lcom/ibotta/api/model/TaskModel;

    if-eqz v0, :cond_0

    iget-boolean v1, p0, Lcom/ibotta/android/mvp/ui/view/engagement/AbstractEngagementView;->pixelTrackingViewOccurred:Z

    if-nez v1, :cond_0

    .line 85
    iput-boolean v2, p0, Lcom/ibotta/android/mvp/ui/view/engagement/AbstractEngagementView;->pixelTrackingViewOccurred:Z

    .line 87
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/engagement/AbstractEngagementView;->pixelTrackingManager:Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManager;

    invoke-interface {v0}, Lcom/ibotta/api/model/TaskModel;->getTrackingImpressionUrl()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v0}, Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManager;->trackImpression(Ljava/lang/String;)V

    :cond_0
    return-void
.end method


# virtual methods
.method protected abstract getEmailContent()Ljava/lang/String;
.end method

.method protected abstract getEmailSubject()Ljava/lang/String;
.end method

.method protected abstract getLayoutId()I
.end method

.method protected getTitle()Ljava/lang/String;
    .locals 4

    .line 116
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/engagement/AbstractEngagementView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/view/engagement/AbstractEngagementView;->currentValue:Ljava/lang/String;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const v2, 0x7f110298

    invoke-virtual {v0, v2, v1}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected abstract initLayout()V
.end method

.method protected abstract injectThis()V
.end method

.method protected isClickPixelTrackingEnabled()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method protected abstract isShareable()Z
.end method

.method protected isViewPixelTrackingEnabled()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method protected notifySuccess(Ljava/lang/String;)V
    .locals 2
    .annotation build Lhugo/weaving/DebugLog;
    .end annotation

    .line 140
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/engagement/AbstractEngagementView;->isClickPixelTrackingEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/engagement/AbstractEngagementView;->taskModel:Lcom/ibotta/api/model/TaskModel;

    if-eqz v0, :cond_0

    .line 141
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/engagement/AbstractEngagementView;->pixelTrackingManager:Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManager;

    invoke-interface {v0}, Lcom/ibotta/api/model/TaskModel;->getTrackingClickUrl()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v0}, Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManager;->trackClick(Ljava/lang/String;)V

    .line 144
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/engagement/AbstractEngagementView;->engagementHost:Lcom/ibotta/android/mvp/ui/view/engagement/EngagementHost;

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/view/engagement/EngagementHost;->notifySuccess(Ljava/lang/String;)V

    return-void
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 0

    return-void
.end method

.method public onBackPressed()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public onDestroy()V
    .locals 0

    return-void
.end method

.method public onPause()V
    .locals 0

    return-void
.end method

.method protected abstract onSetup()V
.end method

.method public onShareClicked()V
    .locals 3

    .line 96
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/engagement/AbstractEngagementView;->getEmailSubject()Ljava/lang/String;

    move-result-object v0

    .line 97
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/engagement/AbstractEngagementView;->getEmailContent()Ljava/lang/String;

    move-result-object v1

    if-eqz v0, :cond_1

    if-nez v1, :cond_0

    goto :goto_0

    .line 104
    :cond_0
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/view/engagement/AbstractEngagementView;->engagementHost:Lcom/ibotta/android/mvp/ui/view/engagement/EngagementHost;

    invoke-interface {v2, v0, v1}, Lcom/ibotta/android/mvp/ui/view/engagement/EngagementHost;->requestShare(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_1
    :goto_0
    const-string v0, "Either subject or content is missing. Cannot share this engagement\'s content."

    const/4 v1, 0x0

    .line 100
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->w(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public setEngagementHost(Lcom/ibotta/android/mvp/ui/view/engagement/EngagementHost;)V
    .locals 0

    .line 92
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/engagement/AbstractEngagementView;->engagementHost:Lcom/ibotta/android/mvp/ui/view/engagement/EngagementHost;

    return-void
.end method

.method public setup(Lcom/ibotta/api/model/RetailerModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/ibotta/api/model/TaskModel;)V
    .locals 0
    .param p1    # Lcom/ibotta/api/model/RetailerModel;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 126
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/engagement/AbstractEngagementView;->retailerModel:Lcom/ibotta/api/model/RetailerModel;

    .line 127
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/view/engagement/AbstractEngagementView;->name:Ljava/lang/String;

    .line 128
    iput-object p3, p0, Lcom/ibotta/android/mvp/ui/view/engagement/AbstractEngagementView;->currentValue:Ljava/lang/String;

    .line 129
    iput-object p4, p0, Lcom/ibotta/android/mvp/ui/view/engagement/AbstractEngagementView;->thumbUrl:Ljava/lang/String;

    .line 130
    iput-boolean p5, p0, Lcom/ibotta/android/mvp/ui/view/engagement/AbstractEngagementView;->activated:Z

    .line 131
    iput-object p6, p0, Lcom/ibotta/android/mvp/ui/view/engagement/AbstractEngagementView;->taskModel:Lcom/ibotta/api/model/TaskModel;

    .line 134
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/engagement/AbstractEngagementView;->onSetup()V

    .line 135
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/engagement/AbstractEngagementView;->engagementHost:Lcom/ibotta/android/mvp/ui/view/engagement/EngagementHost;

    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/engagement/AbstractEngagementView;->getTitle()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/engagement/AbstractEngagementView;->isShareable()Z

    move-result p3

    invoke-interface {p1, p2, p3}, Lcom/ibotta/android/mvp/ui/view/engagement/EngagementHost;->declareEngagementRequirements(Ljava/lang/String;Z)V

    return-void
.end method
