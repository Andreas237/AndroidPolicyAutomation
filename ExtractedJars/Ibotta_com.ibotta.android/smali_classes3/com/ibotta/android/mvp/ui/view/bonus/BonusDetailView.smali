.class public Lcom/ibotta/android/mvp/ui/view/bonus/BonusDetailView;
.super Landroid/widget/LinearLayout;
.source "BonusDetailView.java"


# instance fields
.field protected appHelper:Lcom/ibotta/android/util/AppHelper;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field private bonusModel:Lcom/ibotta/api/model/BonusModel;

.field protected formatting:Lcom/ibotta/android/util/Formatting;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected rcQualifications:Landroid/support/v7/widget/RecyclerView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0903c1
    .end annotation
.end field

.field protected tbvBonusName:Lcom/ibotta/android/views/base/title/TitleBarView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090445
    .end annotation
.end field

.field protected tvDescription:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090515
    .end annotation
.end field

.field protected tvExpiration:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090520
    .end annotation
.end field

.field protected tvTerms:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090584
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 51
    invoke-direct {p0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 52
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/bonus/BonusDetailView;->initLayout()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 56
    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 57
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/bonus/BonusDetailView;->initLayout()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p3    # I
        .annotation build Landroid/support/annotation/AttrRes;
        .end annotation
    .end param

    .line 61
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 62
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/bonus/BonusDetailView;->initLayout()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p3    # I
        .annotation build Landroid/support/annotation/AttrRes;
        .end annotation
    .end param
    .param p4    # I
        .annotation build Landroid/support/annotation/StyleRes;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/RequiresApi;
        api = 0x15
    .end annotation

    .line 69
    invoke-direct {p0, p1, p2, p3, p4}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 70
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/bonus/BonusDetailView;->initLayout()V

    return-void
.end method

.method private initDescription()V
    .locals 2

    .line 111
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/bonus/BonusDetailView;->tvDescription:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/bonus/BonusDetailView;->bonusModel:Lcom/ibotta/api/model/BonusModel;

    invoke-interface {v1}, Lcom/ibotta/api/model/BonusModel;->getDescription()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private initExpirationDate()V
    .locals 2

    .line 115
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/bonus/BonusDetailView;->formatting:Lcom/ibotta/android/util/Formatting;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/bonus/BonusDetailView;->bonusModel:Lcom/ibotta/api/model/BonusModel;

    invoke-interface {v1}, Lcom/ibotta/api/model/BonusModel;->getExpiration()Ljava/util/Date;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/ibotta/android/util/Formatting;->getAppConfigExpiration(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    .line 116
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/bonus/BonusDetailView;->tvExpiration:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private initLayout()V
    .locals 3

    .line 79
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/App;->getMainComponent()Lcom/ibotta/android/di/MainComponent;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/ibotta/android/di/MainComponent;->inject(Lcom/ibotta/android/mvp/ui/view/bonus/BonusDetailView;)V

    const/4 v0, 0x1

    .line 81
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/bonus/BonusDetailView;->setOrientation(I)V

    .line 83
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/bonus/BonusDetailView;->isInEditMode()Z

    move-result v1

    if-nez v1, :cond_0

    const/4 v1, 0x0

    .line 84
    invoke-static {p0, v1}, Lcom/ibotta/android/views/util/IbottaViewsUtilKt;->enableBackgroundRipple(Landroid/view/View;Z)V

    .line 87
    :cond_0
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/bonus/BonusDetailView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    const v2, 0x7f0c0137

    invoke-virtual {v1, v2, p0, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 88
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/view/View;)Lbutterknife/Unbinder;

    .line 90
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/bonus/BonusDetailView;->rcQualifications:Landroid/support/v7/widget/RecyclerView;

    new-instance v1, Landroid/support/v7/widget/LinearLayoutManager;

    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/bonus/BonusDetailView;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/support/v7/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    .line 91
    new-instance v0, Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder;

    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/bonus/BonusDetailView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder;-><init>(Landroid/content/Context;)V

    const v1, 0x106000d

    .line 92
    invoke-virtual {v0, v1}, Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder;->colorResId(I)Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$Builder;

    move-result-object v0

    check-cast v0, Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder;

    const v1, 0x7f070170

    .line 93
    invoke-virtual {v0, v1}, Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder;->sizeResId(I)Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$Builder;

    move-result-object v0

    check-cast v0, Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder;

    .line 94
    invoke-virtual {v0}, Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder;->build()Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration;

    move-result-object v0

    .line 95
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/bonus/BonusDetailView;->rcQualifications:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v1, v0}, Landroid/support/v7/widget/RecyclerView;->addItemDecoration(Landroid/support/v7/widget/RecyclerView$ItemDecoration;)V

    return-void
.end method

.method private initName(Lcom/ibotta/android/views/base/title/TitleBarViewState;)V
    .locals 1

    .line 107
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/bonus/BonusDetailView;->tbvBonusName:Lcom/ibotta/android/views/base/title/TitleBarView;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/views/base/title/TitleBarView;->updateViewState(Lcom/ibotta/android/views/base/title/TitleBarViewState;)V

    return-void
.end method

.method private initQualifications()V
    .locals 2

    .line 120
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/bonus/BonusDetailView;->bonusModel:Lcom/ibotta/api/model/BonusModel;

    invoke-interface {v0}, Lcom/ibotta/api/model/BonusModel;->getBonusQualifications()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 121
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/bonus/BonusDetailView;->rcQualifications:Landroid/support/v7/widget/RecyclerView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setVisibility(I)V

    goto :goto_0

    .line 123
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/bonus/BonusDetailView;->rcQualifications:Landroid/support/v7/widget/RecyclerView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setVisibility(I)V

    .line 124
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/bonus/QualificationAdapter;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/bonus/BonusDetailView;->bonusModel:Lcom/ibotta/api/model/BonusModel;

    invoke-interface {v1}, Lcom/ibotta/api/model/BonusModel;->getBonusQualifications()Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/bonus/QualificationAdapter;-><init>(Ljava/util/List;)V

    .line 125
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/bonus/BonusDetailView;->rcQualifications:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v1, v0}, Landroid/support/v7/widget/RecyclerView;->setAdapter(Landroid/support/v7/widget/RecyclerView$Adapter;)V

    :goto_0
    return-void
.end method

.method private initTerms()V
    .locals 2

    .line 130
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/bonus/BonusDetailView;->bonusModel:Lcom/ibotta/api/model/BonusModel;

    invoke-interface {v0}, Lcom/ibotta/api/model/BonusModel;->getTerms()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 131
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/bonus/BonusDetailView;->tvTerms:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0

    .line 133
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/bonus/BonusDetailView;->tvTerms:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/bonus/BonusDetailView;->bonusModel:Lcom/ibotta/api/model/BonusModel;

    invoke-interface {v1}, Lcom/ibotta/api/model/BonusModel;->getTerms()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 134
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/bonus/BonusDetailView;->tvTerms:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    :goto_0
    return-void
.end method

.method private onBonusSet(Lcom/ibotta/android/views/base/title/TitleBarViewState;)V
    .locals 0

    .line 99
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/view/bonus/BonusDetailView;->initName(Lcom/ibotta/android/views/base/title/TitleBarViewState;)V

    .line 100
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/bonus/BonusDetailView;->initDescription()V

    .line 101
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/bonus/BonusDetailView;->initExpirationDate()V

    .line 102
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/bonus/BonusDetailView;->initQualifications()V

    .line 103
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/bonus/BonusDetailView;->initTerms()V

    return-void
.end method


# virtual methods
.method public setup(Lcom/ibotta/api/model/BonusModel;Lcom/ibotta/android/views/base/title/TitleBarViewState;)V
    .locals 0

    .line 74
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/bonus/BonusDetailView;->bonusModel:Lcom/ibotta/api/model/BonusModel;

    .line 75
    invoke-direct {p0, p2}, Lcom/ibotta/android/mvp/ui/view/bonus/BonusDetailView;->onBonusSet(Lcom/ibotta/android/views/base/title/TitleBarViewState;)V

    return-void
.end method
