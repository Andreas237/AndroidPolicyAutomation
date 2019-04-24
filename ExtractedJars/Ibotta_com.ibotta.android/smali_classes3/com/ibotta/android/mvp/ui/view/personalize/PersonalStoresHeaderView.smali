.class public Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoresHeaderView;
.super Landroid/widget/LinearLayout;
.source "PersonalStoresHeaderView.java"


# instance fields
.field protected tbvTitleBar:Lcom/ibotta/android/views/base/title/TitleBarView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f09044d
    .end annotation
.end field

.field protected tvPrompt:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f09055f
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 26
    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoresHeaderView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 30
    invoke-direct {p0, p1, p2, v0}, Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoresHeaderView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 34
    invoke-direct {p0, p1, p2, p3, v0}, Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoresHeaderView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 0

    .line 38
    invoke-direct {p0, p1, p2, p3, p4}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 39
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoresHeaderView;->initLayout()V

    return-void
.end method

.method private initLayout()V
    .locals 3

    const/4 v0, 0x1

    .line 48
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoresHeaderView;->setOrientation(I)V

    .line 49
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoresHeaderView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    const v2, 0x7f0c018f

    invoke-virtual {v1, v2, p0, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 50
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/view/View;)Lbutterknife/Unbinder;

    return-void
.end method

.method private initPrompt(Ljava/lang/String;)V
    .locals 1

    .line 58
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoresHeaderView;->tvPrompt:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private initTitle(Lcom/ibotta/android/views/base/title/TitleBarViewState;)V
    .locals 1

    .line 54
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoresHeaderView;->tbvTitleBar:Lcom/ibotta/android/views/base/title/TitleBarView;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/views/base/title/TitleBarView;->updateViewState(Lcom/ibotta/android/views/base/title/TitleBarViewState;)V

    return-void
.end method


# virtual methods
.method public setup(Lcom/ibotta/android/views/base/title/TitleBarViewState;Ljava/lang/String;)V
    .locals 0

    .line 43
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoresHeaderView;->initTitle(Lcom/ibotta/android/views/base/title/TitleBarViewState;)V

    .line 44
    invoke-direct {p0, p2}, Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoresHeaderView;->initPrompt(Ljava/lang/String;)V

    return-void
.end method
