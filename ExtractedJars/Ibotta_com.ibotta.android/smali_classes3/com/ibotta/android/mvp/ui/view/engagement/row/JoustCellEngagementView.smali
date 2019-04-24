.class public Lcom/ibotta/android/mvp/ui/view/engagement/row/JoustCellEngagementView;
.super Landroid/widget/LinearLayout;
.source "JoustCellEngagementView.java"


# instance fields
.field imageCache:Lcom/ibotta/android/images/ImageCache;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected ivProduct:Landroid/widget/ImageView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0902bc
    .end annotation
.end field

.field private optionModel:Lcom/ibotta/api/model/OptionModel;

.field protected tvOption:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090556
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 38
    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/view/engagement/row/JoustCellEngagementView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 42
    invoke-direct {p0, p1, p2, v0}, Lcom/ibotta/android/mvp/ui/view/engagement/row/JoustCellEngagementView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 46
    invoke-direct {p0, p1, p2, p3, v0}, Lcom/ibotta/android/mvp/ui/view/engagement/row/JoustCellEngagementView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 0

    .line 50
    invoke-direct {p0, p1, p2, p3, p4}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 51
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/engagement/row/JoustCellEngagementView;->initLayout()V

    return-void
.end method

.method private initLayout()V
    .locals 4

    .line 61
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/App;->getMainComponent()Lcom/ibotta/android/di/MainComponent;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/ibotta/android/di/MainComponent;->inject(Lcom/ibotta/android/mvp/ui/view/engagement/row/JoustCellEngagementView;)V

    const/4 v0, 0x1

    .line 63
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/engagement/row/JoustCellEngagementView;->setClickable(Z)V

    const/4 v1, 0x0

    .line 64
    invoke-virtual {p0, v1}, Lcom/ibotta/android/mvp/ui/view/engagement/row/JoustCellEngagementView;->setFocusable(Z)V

    .line 65
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/engagement/row/JoustCellEngagementView;->setOrientation(I)V

    .line 67
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/engagement/row/JoustCellEngagementView;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v2

    const v3, 0x7f0c016b

    invoke-virtual {v2, v3, p0, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 68
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/view/View;)Lbutterknife/Unbinder;

    .line 70
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/engagement/row/JoustCellEngagementView;->isInEditMode()Z

    move-result v0

    if-nez v0, :cond_0

    .line 71
    invoke-static {p0, v1}, Lcom/ibotta/android/views/util/IbottaViewsUtilKt;->enableForegroundRipple(Landroid/view/View;Z)V

    :cond_0
    return-void
.end method

.method private initOptionImage()V
    .locals 5

    .line 81
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/engagement/row/JoustCellEngagementView;->imageCache:Lcom/ibotta/android/images/ImageCache;

    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/engagement/row/JoustCellEngagementView;->getContext()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/view/engagement/row/JoustCellEngagementView;->optionModel:Lcom/ibotta/api/model/OptionModel;

    invoke-interface {v2}, Lcom/ibotta/api/model/OptionModel;->getUrl()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/view/engagement/row/JoustCellEngagementView;->ivProduct:Landroid/widget/ImageView;

    sget-object v4, Lcom/ibotta/android/views/images/Sizes;->OFFER_HALF_WIDTH:Lcom/ibotta/android/views/images/Sizes;

    invoke-interface {v0, v1, v2, v3, v4}, Lcom/ibotta/android/images/ImageCache;->load(Landroid/content/Context;Ljava/lang/String;Landroid/widget/ImageView;Lcom/ibotta/android/images/ImageCache$Size;)Lcom/ibotta/android/images/ImageLoadJob;

    return-void
.end method

.method private initOptionText()V
    .locals 2

    .line 85
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/engagement/row/JoustCellEngagementView;->tvOption:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/engagement/row/JoustCellEngagementView;->optionModel:Lcom/ibotta/api/model/OptionModel;

    invoke-interface {v1}, Lcom/ibotta/api/model/OptionModel;->getContent()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private onOptionSet()V
    .locals 0

    .line 76
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/engagement/row/JoustCellEngagementView;->initOptionImage()V

    .line 77
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/engagement/row/JoustCellEngagementView;->initOptionText()V

    return-void
.end method


# virtual methods
.method public setOption(Lcom/ibotta/api/model/OptionModel;)V
    .locals 0

    .line 55
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/engagement/row/JoustCellEngagementView;->optionModel:Lcom/ibotta/api/model/OptionModel;

    .line 57
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/engagement/row/JoustCellEngagementView;->onOptionSet()V

    return-void
.end method
