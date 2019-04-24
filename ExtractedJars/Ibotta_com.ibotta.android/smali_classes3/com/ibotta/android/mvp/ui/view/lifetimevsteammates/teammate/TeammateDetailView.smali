.class public Lcom/ibotta/android/mvp/ui/view/lifetimevsteammates/teammate/TeammateDetailView;
.super Landroid/widget/ScrollView;
.source "TeammateDetailView.java"


# instance fields
.field formatting:Lcom/ibotta/android/util/Formatting;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected lgvLineGraph:Lcom/ibotta/android/view/graph/line/LineGraphView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0902ef
    .end annotation
.end field

.field protected llLifetimeEarningsTitleContainer:Landroid/widget/LinearLayout;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090312
    .end annotation
.end field

.field protected llMessage:Landroid/widget/LinearLayout;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090317
    .end annotation
.end field

.field protected tbvLifetimeEarningsName:Lcom/ibotta/android/views/base/title/TitleBarView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f09044a
    .end annotation
.end field

.field protected tvDate:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090512
    .end annotation
.end field

.field protected tvLineLifetimeEarningsAmount:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090540
    .end annotation
.end field

.field protected tvMessage:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090548
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 44
    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/view/lifetimevsteammates/teammate/TeammateDetailView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 48
    invoke-direct {p0, p1, p2, v0}, Lcom/ibotta/android/mvp/ui/view/lifetimevsteammates/teammate/TeammateDetailView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 52
    invoke-direct {p0, p1, p2, p3, v0}, Lcom/ibotta/android/mvp/ui/view/lifetimevsteammates/teammate/TeammateDetailView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 0

    .line 56
    invoke-direct {p0, p1, p2, p3, p4}, Landroid/widget/ScrollView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 57
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/lifetimevsteammates/teammate/TeammateDetailView;->initLayout()V

    return-void
.end method

.method private initFriendsLifeTimeEarningsAmount(Ljava/lang/String;)V
    .locals 1

    .line 79
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/lifetimevsteammates/teammate/TeammateDetailView;->tvLineLifetimeEarningsAmount:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 80
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/lifetimevsteammates/teammate/TeammateDetailView;->llLifetimeEarningsTitleContainer:Landroid/widget/LinearLayout;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/widget/LinearLayout;->setVisibility(I)V

    return-void
.end method

.method private initLayout()V
    .locals 3

    .line 61
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/App;->getMainComponent()Lcom/ibotta/android/di/MainComponent;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/ibotta/android/di/MainComponent;->inject(Lcom/ibotta/android/mvp/ui/view/lifetimevsteammates/teammate/TeammateDetailView;)V

    .line 63
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/lifetimevsteammates/teammate/TeammateDetailView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f0c01d8

    const/4 v2, 0x1

    invoke-virtual {v0, v1, p0, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 64
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/view/View;)Lbutterknife/Unbinder;

    return-void
.end method


# virtual methods
.method public setGraphDataSet(Lcom/ibotta/android/view/graph/GraphDataSet;)V
    .locals 1

    .line 74
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/lifetimevsteammates/teammate/TeammateDetailView;->lgvLineGraph:Lcom/ibotta/android/view/graph/line/LineGraphView;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/view/graph/line/LineGraphView;->setGraphDataSet(Lcom/ibotta/android/view/graph/GraphDataSet;)V

    .line 75
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/lifetimevsteammates/teammate/TeammateDetailView;->lgvLineGraph:Lcom/ibotta/android/view/graph/line/LineGraphView;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/ibotta/android/view/graph/line/LineGraphView;->setVisibility(I)V

    return-void
.end method

.method public setTeammate(Ljava/lang/String;Lcom/ibotta/android/views/base/title/TitleBarViewState;)V
    .locals 1

    .line 84
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/lifetimevsteammates/teammate/TeammateDetailView;->tbvLifetimeEarningsName:Lcom/ibotta/android/views/base/title/TitleBarView;

    invoke-virtual {v0, p2}, Lcom/ibotta/android/views/base/title/TitleBarView;->updateViewState(Lcom/ibotta/android/views/base/title/TitleBarViewState;)V

    .line 85
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/view/lifetimevsteammates/teammate/TeammateDetailView;->initFriendsLifeTimeEarningsAmount(Ljava/lang/String;)V

    return-void
.end method

.method public showMessage(Ljava/lang/String;Ljava/util/Date;)V
    .locals 1

    .line 68
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/lifetimevsteammates/teammate/TeammateDetailView;->tvMessage:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 69
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/lifetimevsteammates/teammate/TeammateDetailView;->tvDate:Landroid/widget/TextView;

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/lifetimevsteammates/teammate/TeammateDetailView;->formatting:Lcom/ibotta/android/util/Formatting;

    invoke-interface {v0, p2}, Lcom/ibotta/android/util/Formatting;->dateTime(Ljava/util/Date;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 70
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/lifetimevsteammates/teammate/TeammateDetailView;->llMessage:Landroid/widget/LinearLayout;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/widget/LinearLayout;->setVisibility(I)V

    return-void
.end method
