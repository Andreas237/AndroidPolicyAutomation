.class public Lcom/ibotta/android/mvp/ui/view/engagement/SimpleEngagementView;
.super Lcom/ibotta/android/mvp/ui/view/engagement/AbstractEngagementView;
.source "SimpleEngagementView.java"


# static fields
.field private static final JOIN_THE_CLUB_OPT_YES_RESPONSE:Ljava/lang/String; = "Yes"

.field private static final SHAREABLE:[Lcom/ibotta/api/model/TaskModel$Type;


# instance fields
.field protected bNoThanks:Landroid/widget/Button;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090096
    .end annotation
.end field

.field protected bSubmit:Landroid/widget/Button;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0900ab
    .end annotation
.end field

.field imageCache:Lcom/ibotta/android/images/ImageCache;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected ivBanner:Landroid/widget/ImageView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090292
    .end annotation
.end field

.field protected tvContent:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f09050e
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const/4 v0, 0x7

    .line 29
    new-array v0, v0, [Lcom/ibotta/api/model/TaskModel$Type;

    sget-object v1, Lcom/ibotta/api/model/TaskModel$Type;->FACT:Lcom/ibotta/api/model/TaskModel$Type;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/api/model/TaskModel$Type;->RECIPE:Lcom/ibotta/api/model/TaskModel$Type;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/api/model/TaskModel$Type;->HOW_TO:Lcom/ibotta/api/model/TaskModel$Type;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/api/model/TaskModel$Type;->DO_GOODER:Lcom/ibotta/api/model/TaskModel$Type;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/api/model/TaskModel$Type;->SEAL_OF_APPROVAL:Lcom/ibotta/api/model/TaskModel$Type;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/api/model/TaskModel$Type;->MOVIE_REVIEW:Lcom/ibotta/api/model/TaskModel$Type;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/api/model/TaskModel$Type;->NUTRITION:Lcom/ibotta/api/model/TaskModel$Type;

    const/4 v2, 0x6

    aput-object v1, v0, v2

    sput-object v0, Lcom/ibotta/android/mvp/ui/view/engagement/SimpleEngagementView;->SHAREABLE:[Lcom/ibotta/api/model/TaskModel$Type;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 49
    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/view/engagement/SimpleEngagementView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    .line 53
    invoke-direct {p0, p1, p2, v0}, Lcom/ibotta/android/mvp/ui/view/engagement/SimpleEngagementView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    const/4 v0, 0x0

    .line 57
    invoke-direct {p0, p1, p2, p3, v0}, Lcom/ibotta/android/mvp/ui/view/engagement/SimpleEngagementView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 0

    .line 61
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/ibotta/android/mvp/ui/view/engagement/AbstractEngagementView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    return-void
.end method

.method private initBanner()V
    .locals 5

    .line 87
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/engagement/SimpleEngagementView;->taskModel:Lcom/ibotta/api/model/TaskModel;

    invoke-interface {v0}, Lcom/ibotta/api/model/TaskModel;->getUrl()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 88
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/engagement/SimpleEngagementView;->ivBanner:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 89
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/engagement/SimpleEngagementView;->imageCache:Lcom/ibotta/android/images/ImageCache;

    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/engagement/SimpleEngagementView;->getContext()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/view/engagement/SimpleEngagementView;->taskModel:Lcom/ibotta/api/model/TaskModel;

    invoke-interface {v2}, Lcom/ibotta/api/model/TaskModel;->getUrl()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/view/engagement/SimpleEngagementView;->ivBanner:Landroid/widget/ImageView;

    sget-object v4, Lcom/ibotta/android/views/images/Sizes;->NATURAL:Lcom/ibotta/android/views/images/Sizes;

    invoke-interface {v0, v1, v2, v3, v4}, Lcom/ibotta/android/images/ImageCache;->load(Landroid/content/Context;Ljava/lang/String;Landroid/widget/ImageView;Lcom/ibotta/android/images/ImageCache$Size;)Lcom/ibotta/android/images/ImageLoadJob;

    goto :goto_0

    .line 91
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/engagement/SimpleEngagementView;->ivBanner:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    :goto_0
    return-void
.end method

.method private initContent()V
    .locals 2

    .line 96
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/engagement/SimpleEngagementView;->tvContent:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/engagement/SimpleEngagementView;->taskModel:Lcom/ibotta/api/model/TaskModel;

    invoke-interface {v1}, Lcom/ibotta/api/model/TaskModel;->getContent()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private initNoThanksButton()V
    .locals 3

    .line 109
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/engagement/SimpleEngagementView;->bNoThanks:Landroid/widget/Button;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/engagement/SimpleEngagementView;->taskModel:Lcom/ibotta/api/model/TaskModel;

    invoke-interface {v1}, Lcom/ibotta/api/model/TaskModel;->getTypeEnum()Lcom/ibotta/api/model/TaskModel$Type;

    move-result-object v1

    sget-object v2, Lcom/ibotta/api/model/TaskModel$Type;->JOIN_THE_CLUB_OPT:Lcom/ibotta/api/model/TaskModel$Type;

    if-ne v1, v2, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    const/16 v1, 0x8

    :goto_0
    invoke-virtual {v0, v1}, Landroid/widget/Button;->setVisibility(I)V

    return-void
.end method

.method private initSubmitButton()V
    .locals 6

    .line 100
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/engagement/SimpleEngagementView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const/4 v1, 0x1

    new-array v2, v1, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/view/engagement/SimpleEngagementView;->currentValue:Ljava/lang/String;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const v3, 0x7f11028f

    invoke-virtual {v0, v3, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 101
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/view/engagement/SimpleEngagementView;->taskModel:Lcom/ibotta/api/model/TaskModel;

    invoke-interface {v2}, Lcom/ibotta/api/model/TaskModel;->getTypeEnum()Lcom/ibotta/api/model/TaskModel$Type;

    move-result-object v2

    sget-object v3, Lcom/ibotta/api/model/TaskModel$Type;->JOIN_THE_CLUB_OPT:Lcom/ibotta/api/model/TaskModel$Type;

    if-ne v2, v3, :cond_0

    .line 102
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/view/engagement/SimpleEngagementView;->bSubmit:Landroid/widget/Button;

    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/engagement/SimpleEngagementView;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v5, 0x7f110301

    new-array v1, v1, [Ljava/lang/Object;

    aput-object v0, v1, v4

    invoke-virtual {v3, v5, v1}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 104
    :cond_0
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/engagement/SimpleEngagementView;->bSubmit:Landroid/widget/Button;

    invoke-virtual {v1, v0}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    :goto_0
    return-void
.end method


# virtual methods
.method protected getEmailContent()Ljava/lang/String;
    .locals 4

    .line 125
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/engagement/SimpleEngagementView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    .line 126
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/engagement/SimpleEngagementView;->getTitle()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/view/engagement/SimpleEngagementView;->taskModel:Lcom/ibotta/api/model/TaskModel;

    invoke-interface {v2}, Lcom/ibotta/api/model/TaskModel;->getContent()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const v2, 0x7f110295

    .line 125
    invoke-virtual {v0, v2, v1}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected getEmailSubject()Ljava/lang/String;
    .locals 4

    .line 119
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/engagement/SimpleEngagementView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    .line 120
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/engagement/SimpleEngagementView;->getTitle()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/view/engagement/SimpleEngagementView;->name:Ljava/lang/String;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const v2, 0x7f110296

    .line 119
    invoke-virtual {v0, v2, v1}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected getLayoutId()I
    .locals 1

    const v0, 0x7f0c01c7

    return v0
.end method

.method protected initLayout()V
    .locals 0

    return-void
.end method

.method protected injectThis()V
    .locals 1

    .line 66
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/App;->getMainComponent()Lcom/ibotta/android/di/MainComponent;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/ibotta/android/di/MainComponent;->inject(Lcom/ibotta/android/mvp/ui/view/engagement/SimpleEngagementView;)V

    return-void
.end method

.method protected isShareable()Z
    .locals 2

    .line 114
    sget-object v0, Lcom/ibotta/android/mvp/ui/view/engagement/SimpleEngagementView;->SHAREABLE:[Lcom/ibotta/api/model/TaskModel$Type;

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/engagement/SimpleEngagementView;->taskModel:Lcom/ibotta/api/model/TaskModel;

    invoke-interface {v1}, Lcom/ibotta/api/model/TaskModel;->getTypeEnum()Lcom/ibotta/api/model/TaskModel$Type;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method protected onNoThanksClicked()V
    .locals 2
    .annotation runtime Lbutterknife/OnClick;
        value = {
            0x7f090096
        }
    .end annotation

    .line 140
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/engagement/SimpleEngagementView;->engagementHost:Lcom/ibotta/android/mvp/ui/view/engagement/EngagementHost;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/view/engagement/EngagementHost;->notifySuccess(Ljava/lang/String;)V

    return-void
.end method

.method protected onSetup()V
    .locals 0

    .line 80
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/engagement/SimpleEngagementView;->initBanner()V

    .line 81
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/engagement/SimpleEngagementView;->initContent()V

    .line 82
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/engagement/SimpleEngagementView;->initSubmitButton()V

    .line 83
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/engagement/SimpleEngagementView;->initNoThanksButton()V

    return-void
.end method

.method protected onSubmitClicked()V
    .locals 2
    .annotation runtime Lbutterknife/OnClick;
        value = {
            0x7f0900ab
        }
    .end annotation

    .line 131
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/engagement/SimpleEngagementView;->taskModel:Lcom/ibotta/api/model/TaskModel;

    invoke-interface {v0}, Lcom/ibotta/api/model/TaskModel;->getTypeEnum()Lcom/ibotta/api/model/TaskModel$Type;

    move-result-object v0

    sget-object v1, Lcom/ibotta/api/model/TaskModel$Type;->JOIN_THE_CLUB_OPT:Lcom/ibotta/api/model/TaskModel$Type;

    if-ne v0, v1, :cond_0

    .line 132
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/engagement/SimpleEngagementView;->engagementHost:Lcom/ibotta/android/mvp/ui/view/engagement/EngagementHost;

    const-string v1, "Yes"

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/view/engagement/EngagementHost;->notifySuccess(Ljava/lang/String;)V

    goto :goto_0

    .line 134
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/engagement/SimpleEngagementView;->engagementHost:Lcom/ibotta/android/mvp/ui/view/engagement/EngagementHost;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/view/engagement/EngagementHost;->notifySuccess(Ljava/lang/String;)V

    :goto_0
    return-void
.end method
