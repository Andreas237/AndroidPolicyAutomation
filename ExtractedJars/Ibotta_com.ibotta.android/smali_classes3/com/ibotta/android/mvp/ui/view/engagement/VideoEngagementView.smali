.class public Lcom/ibotta/android/mvp/ui/view/engagement/VideoEngagementView;
.super Lcom/ibotta/android/mvp/ui/view/engagement/AbstractEngagementView;
.source "VideoEngagementView.java"


# instance fields
.field protected bSubmit:Landroid/widget/Button;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0900ab
    .end annotation
.end field

.field imageCache:Lcom/ibotta/android/images/ImageCache;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected ivThumbnail:Landroid/widget/ImageView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0902cf
    .end annotation
.end field

.field protected svnvNotice:Lcom/ibotta/android/mvp/ui/view/engagement/row/SponsoredVideoNoticeView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090438
    .end annotation
.end field

.field protected tvContent:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f09050e
    .end annotation
.end field

.field private videoWatched:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 43
    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/view/engagement/VideoEngagementView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    .line 47
    invoke-direct {p0, p1, p2, v0}, Lcom/ibotta/android/mvp/ui/view/engagement/VideoEngagementView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    const/4 v0, 0x0

    .line 51
    invoke-direct {p0, p1, p2, p3, v0}, Lcom/ibotta/android/mvp/ui/view/engagement/VideoEngagementView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 0

    .line 55
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/ibotta/android/mvp/ui/view/engagement/AbstractEngagementView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    return-void
.end method

.method private initContent()V
    .locals 2

    .line 99
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/engagement/VideoEngagementView;->tvContent:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/engagement/VideoEngagementView;->taskModel:Lcom/ibotta/api/model/TaskModel;

    invoke-interface {v1}, Lcom/ibotta/api/model/TaskModel;->getContent()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private initNotice()V
    .locals 3

    .line 95
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/engagement/VideoEngagementView;->svnvNotice:Lcom/ibotta/android/mvp/ui/view/engagement/row/SponsoredVideoNoticeView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/engagement/VideoEngagementView;->taskModel:Lcom/ibotta/api/model/TaskModel;

    invoke-interface {v1}, Lcom/ibotta/api/model/TaskModel;->getTypeEnum()Lcom/ibotta/api/model/TaskModel$Type;

    move-result-object v1

    sget-object v2, Lcom/ibotta/api/model/TaskModel$Type;->VIDEO_AD:Lcom/ibotta/api/model/TaskModel$Type;

    if-ne v1, v2, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    const/16 v1, 0x8

    :goto_0
    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/view/engagement/row/SponsoredVideoNoticeView;->setVisibility(I)V

    return-void
.end method

.method private initSubmitButton()V
    .locals 4

    .line 103
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/engagement/VideoEngagementView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/view/engagement/VideoEngagementView;->currentValue:Ljava/lang/String;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const v2, 0x7f11028f

    invoke-virtual {v0, v2, v1}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 104
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/engagement/VideoEngagementView;->bSubmit:Landroid/widget/Button;

    invoke-virtual {v1, v0}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private initThumbnail()V
    .locals 5

    .line 86
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/engagement/VideoEngagementView;->taskModel:Lcom/ibotta/api/model/TaskModel;

    invoke-interface {v0}, Lcom/ibotta/api/model/TaskModel;->getThumb()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    .line 88
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/engagement/VideoEngagementView;->thumbUrl:Ljava/lang/String;

    .line 91
    :cond_0
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/engagement/VideoEngagementView;->imageCache:Lcom/ibotta/android/images/ImageCache;

    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/engagement/VideoEngagementView;->getContext()Landroid/content/Context;

    move-result-object v2

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/view/engagement/VideoEngagementView;->ivThumbnail:Landroid/widget/ImageView;

    sget-object v4, Lcom/ibotta/android/views/images/Sizes;->GAME_VIDEO_PREVIEW:Lcom/ibotta/android/views/images/Sizes;

    invoke-interface {v1, v2, v0, v3, v4}, Lcom/ibotta/android/images/ImageCache;->load(Landroid/content/Context;Ljava/lang/String;Landroid/widget/ImageView;Lcom/ibotta/android/images/ImageCache$Size;)Lcom/ibotta/android/images/ImageLoadJob;

    return-void
.end method

.method private startVideo()V
    .locals 5
    .annotation build Lhugo/weaving/DebugLog;
    .end annotation

    .line 134
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/engagement/VideoEngagementView;->taskModel:Lcom/ibotta/api/model/TaskModel;

    invoke-interface {v0}, Lcom/ibotta/api/model/TaskModel;->getTypeEnum()Lcom/ibotta/api/model/TaskModel$Type;

    move-result-object v0

    sget-object v1, Lcom/ibotta/api/model/TaskModel$Type;->VIDEO_AD:Lcom/ibotta/api/model/TaskModel$Type;

    const/4 v2, 0x1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 136
    :goto_0
    new-instance v1, Lcom/ibotta/android/routing/intent/VideoIntentCreator;

    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/engagement/VideoEngagementView;->getContext()Landroid/content/Context;

    move-result-object v3

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/view/engagement/VideoEngagementView;->taskModel:Lcom/ibotta/api/model/TaskModel;

    invoke-interface {v4}, Lcom/ibotta/api/model/TaskModel;->getUrl()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v1, v3, v4}, Lcom/ibotta/android/routing/intent/VideoIntentCreator;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 137
    invoke-virtual {v1, v0}, Lcom/ibotta/android/routing/intent/VideoIntentCreator;->urlIsAd(Z)Lcom/ibotta/android/routing/intent/VideoIntentCreator;

    move-result-object v0

    iget-boolean v1, p0, Lcom/ibotta/android/mvp/ui/view/engagement/VideoEngagementView;->activated:Z

    .line 138
    invoke-virtual {v0, v1}, Lcom/ibotta/android/routing/intent/VideoIntentCreator;->allowCancel(Z)Lcom/ibotta/android/routing/intent/VideoIntentCreator;

    move-result-object v0

    .line 139
    invoke-virtual {v0, v2}, Lcom/ibotta/android/routing/intent/VideoIntentCreator;->allowSkip(Z)Lcom/ibotta/android/routing/intent/VideoIntentCreator;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/engagement/VideoEngagementView;->taskModel:Lcom/ibotta/api/model/TaskModel;

    .line 140
    invoke-interface {v1}, Lcom/ibotta/api/model/TaskModel;->getTrackingImpressionUrl()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/routing/intent/VideoIntentCreator;->trackingImpressionUrl(Ljava/lang/String;)Lcom/ibotta/android/routing/intent/VideoIntentCreator;

    move-result-object v0

    .line 141
    invoke-virtual {v0}, Lcom/ibotta/android/routing/intent/VideoIntentCreator;->create()Landroid/content/Intent;

    move-result-object v0

    .line 143
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/engagement/VideoEngagementView;->engagementHost:Lcom/ibotta/android/mvp/ui/view/engagement/EngagementHost;

    const/16 v2, 0xf

    invoke-interface {v1, v0, v2}, Lcom/ibotta/android/mvp/ui/view/engagement/EngagementHost;->startActivityForResult(Landroid/content/Intent;I)V

    return-void
.end method


# virtual methods
.method protected getEmailContent()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method protected getEmailSubject()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method protected getLayoutId()I
    .locals 1

    const v0, 0x7f0c01f4

    return v0
.end method

.method protected initLayout()V
    .locals 0

    return-void
.end method

.method protected injectThis()V
    .locals 1

    .line 60
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/App;->getMainComponent()Lcom/ibotta/android/di/MainComponent;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/ibotta/android/di/MainComponent;->inject(Lcom/ibotta/android/mvp/ui/view/engagement/VideoEngagementView;)V

    return-void
.end method

.method protected isShareable()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 0

    .line 148
    invoke-super {p0, p1, p2, p3}, Lcom/ibotta/android/mvp/ui/view/engagement/AbstractEngagementView;->onActivityResult(IILandroid/content/Intent;)V

    const/16 p3, 0xf

    if-ne p1, p3, :cond_0

    const/4 p1, 0x1

    if-ne p2, p1, :cond_0

    .line 151
    iput-boolean p1, p0, Lcom/ibotta/android/mvp/ui/view/engagement/VideoEngagementView;->videoWatched:Z

    :cond_0
    return-void
.end method

.method protected onSetup()V
    .locals 2

    .line 74
    iget-boolean v0, p0, Lcom/ibotta/android/mvp/ui/view/engagement/VideoEngagementView;->videoWatched:Z

    if-eqz v0, :cond_0

    .line 75
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/engagement/VideoEngagementView;->engagementHost:Lcom/ibotta/android/mvp/ui/view/engagement/EngagementHost;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/view/engagement/EngagementHost;->notifySuccess(Ljava/lang/String;)V

    return-void

    .line 79
    :cond_0
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/engagement/VideoEngagementView;->initThumbnail()V

    .line 80
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/engagement/VideoEngagementView;->initNotice()V

    .line 81
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/engagement/VideoEngagementView;->initContent()V

    .line 82
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/engagement/VideoEngagementView;->initSubmitButton()V

    return-void
.end method

.method protected onSubmitClicked()V
    .locals 0
    .annotation runtime Lbutterknife/OnClick;
        value = {
            0x7f0900ab
        }
    .end annotation

    .line 129
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/engagement/VideoEngagementView;->startVideo()V

    return-void
.end method

.method protected onThumbnailClicked()V
    .locals 0
    .annotation runtime Lbutterknife/OnClick;
        value = {
            0x7f0901f9
        }
    .end annotation

    .line 124
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/engagement/VideoEngagementView;->startVideo()V

    return-void
.end method
