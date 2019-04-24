.class public Lcom/ibotta/android/mvp/ui/view/quests/QuestView;
.super Landroid/widget/RelativeLayout;
.source "QuestView.java"


# instance fields
.field protected bEnterQuest:Landroid/widget/Button;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090087
    .end annotation
.end field

.field private bonusModel:Lcom/ibotta/api/model/BonusModel;

.field protected flQuestImageContainer:Landroid/widget/FrameLayout;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0901f5
    .end annotation
.end field

.field formatting:Lcom/ibotta/android/util/Formatting;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field imageCache:Lcom/ibotta/android/images/ImageCache;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected ivBonusBackground:Landroid/widget/ImageView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090298
    .end annotation
.end field

.field private questAdapterListener:Lcom/ibotta/android/mvp/ui/adapter/quests/QuestAdapterListener;

.field protected tvAmount:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0904fe
    .end annotation
.end field

.field protected tvQuestDescription:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090515
    .end annotation
.end field

.field protected tvQuestTitle:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090587
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 46
    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/view/quests/QuestView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 50
    invoke-direct {p0, p1, p2, v0}, Lcom/ibotta/android/mvp/ui/view/quests/QuestView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 54
    invoke-direct {p0, p1, p2, p3, v0}, Lcom/ibotta/android/mvp/ui/view/quests/QuestView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 0

    .line 58
    invoke-direct {p0, p1, p2, p3, p4}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 59
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/quests/QuestView;->initLayout()V

    return-void
.end method

.method private initAmount()V
    .locals 5

    .line 80
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/quests/QuestView;->formatting:Lcom/ibotta/android/util/Formatting;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/quests/QuestView;->bonusModel:Lcom/ibotta/api/model/BonusModel;

    invoke-interface {v1}, Lcom/ibotta/api/model/BonusModel;->getAmount()F

    move-result v1

    float-to-double v1, v1

    invoke-interface {v0, v1, v2}, Lcom/ibotta/android/util/Formatting;->currencyLeadZero(D)Ljava/lang/String;

    move-result-object v0

    .line 81
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/quests/QuestView;->tvAmount:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/quests/QuestView;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v0, v3, v4

    const v0, 0x7f1100a0

    invoke-virtual {v2, v0, v3}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private initBackground()V
    .locals 5

    .line 85
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/quests/QuestView;->imageCache:Lcom/ibotta/android/images/ImageCache;

    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/quests/QuestView;->getContext()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/view/quests/QuestView;->bonusModel:Lcom/ibotta/api/model/BonusModel;

    invoke-interface {v2}, Lcom/ibotta/api/model/BonusModel;->getQuest()Lcom/ibotta/api/model/QuestModel;

    move-result-object v2

    invoke-interface {v2}, Lcom/ibotta/api/model/QuestModel;->getImageUrl()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/view/quests/QuestView;->ivBonusBackground:Landroid/widget/ImageView;

    sget-object v4, Lcom/ibotta/android/views/images/Sizes;->QUEST_FEATURE:Lcom/ibotta/android/views/images/Sizes;

    invoke-interface {v0, v1, v2, v3, v4}, Lcom/ibotta/android/images/ImageCache;->load(Landroid/content/Context;Ljava/lang/String;Landroid/widget/ImageView;Lcom/ibotta/android/images/ImageCache$Size;)Lcom/ibotta/android/images/ImageLoadJob;

    return-void
.end method

.method private initButton()V
    .locals 2

    .line 97
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/quests/QuestView;->bEnterQuest:Landroid/widget/Button;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/quests/QuestView;->bonusModel:Lcom/ibotta/api/model/BonusModel;

    invoke-interface {v1}, Lcom/ibotta/api/model/BonusModel;->getQuest()Lcom/ibotta/api/model/QuestModel;

    move-result-object v1

    invoke-interface {v1}, Lcom/ibotta/api/model/QuestModel;->getCta()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private initDescription()V
    .locals 2

    .line 93
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/quests/QuestView;->tvQuestDescription:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/quests/QuestView;->bonusModel:Lcom/ibotta/api/model/BonusModel;

    invoke-interface {v1}, Lcom/ibotta/api/model/BonusModel;->getQuest()Lcom/ibotta/api/model/QuestModel;

    move-result-object v1

    invoke-interface {v1}, Lcom/ibotta/api/model/QuestModel;->getDescription()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private initLayout()V
    .locals 3

    .line 101
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/App;->getMainComponent()Lcom/ibotta/android/di/MainComponent;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/ibotta/android/di/MainComponent;->inject(Lcom/ibotta/android/mvp/ui/view/quests/QuestView;)V

    .line 103
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/quests/QuestView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f0c01a5

    const/4 v2, 0x1

    invoke-virtual {v0, v1, p0, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 104
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/view/View;)Lbutterknife/Unbinder;

    return-void
.end method

.method private initTitle()V
    .locals 2

    .line 89
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/quests/QuestView;->tvQuestTitle:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/quests/QuestView;->bonusModel:Lcom/ibotta/api/model/BonusModel;

    invoke-interface {v1}, Lcom/ibotta/api/model/BonusModel;->getQuest()Lcom/ibotta/api/model/QuestModel;

    move-result-object v1

    invoke-interface {v1}, Lcom/ibotta/api/model/QuestModel;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private onSetup()V
    .locals 0

    .line 72
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/quests/QuestView;->initAmount()V

    .line 73
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/quests/QuestView;->initBackground()V

    .line 74
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/quests/QuestView;->initTitle()V

    .line 75
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/quests/QuestView;->initDescription()V

    .line 76
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/quests/QuestView;->initButton()V

    return-void
.end method


# virtual methods
.method protected questButtonClick()V
    .locals 2
    .annotation runtime Lbutterknife/OnClick;
        value = {
            0x7f090087
        }
    .end annotation

    .line 109
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/quests/QuestView;->questAdapterListener:Lcom/ibotta/android/mvp/ui/adapter/quests/QuestAdapterListener;

    if-eqz v0, :cond_0

    .line 110
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/quests/QuestView;->bonusModel:Lcom/ibotta/api/model/BonusModel;

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/adapter/quests/QuestAdapterListener;->onQuestClicked(Lcom/ibotta/api/model/BonusModel;)V

    :cond_0
    return-void
.end method

.method public setListener(Lcom/ibotta/android/mvp/ui/adapter/quests/QuestAdapterListener;)V
    .locals 0

    .line 63
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/quests/QuestView;->questAdapterListener:Lcom/ibotta/android/mvp/ui/adapter/quests/QuestAdapterListener;

    return-void
.end method

.method public setup(Lcom/ibotta/api/model/BonusModel;)V
    .locals 0

    .line 67
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/quests/QuestView;->bonusModel:Lcom/ibotta/api/model/BonusModel;

    .line 68
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/quests/QuestView;->onSetup()V

    return-void
.end method
