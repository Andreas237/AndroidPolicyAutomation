.class public Lcom/ibotta/android/mvp/ui/view/engagement/row/PollRowEngagementView;
.super Landroid/widget/LinearLayout;
.source "PollRowEngagementView.java"


# instance fields
.field private optionModel:Lcom/ibotta/api/model/OptionModel;

.field protected tvOption:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090556
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 29
    invoke-direct {p0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 30
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/engagement/row/PollRowEngagementView;->initLayout()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 34
    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 35
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/engagement/row/PollRowEngagementView;->initLayout()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 39
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 40
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/engagement/row/PollRowEngagementView;->initLayout()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 0
    .annotation build Landroid/support/annotation/RequiresApi;
        api = 0x15
    .end annotation

    .line 45
    invoke-direct {p0, p1, p2, p3, p4}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 46
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/engagement/row/PollRowEngagementView;->initLayout()V

    return-void
.end method

.method private initLayout()V
    .locals 4

    const/4 v0, 0x1

    .line 56
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/engagement/row/PollRowEngagementView;->setClickable(Z)V

    .line 57
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/engagement/row/PollRowEngagementView;->setFocusable(Z)V

    const/high16 v1, 0x42c80000    # 100.0f

    .line 58
    invoke-virtual {p0, v1}, Lcom/ibotta/android/mvp/ui/view/engagement/row/PollRowEngagementView;->setWeightSum(F)V

    const/4 v1, 0x0

    .line 59
    invoke-virtual {p0, v1}, Lcom/ibotta/android/mvp/ui/view/engagement/row/PollRowEngagementView;->setOrientation(I)V

    .line 61
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/engagement/row/PollRowEngagementView;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v2

    const v3, 0x7f0c0191

    invoke-virtual {v2, v3, p0, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 62
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/view/View;)Lbutterknife/Unbinder;

    .line 64
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/engagement/row/PollRowEngagementView;->isInEditMode()Z

    move-result v0

    if-nez v0, :cond_0

    .line 65
    invoke-static {p0, v1}, Lcom/ibotta/android/views/util/IbottaViewsUtilKt;->enableForegroundRipple(Landroid/view/View;Z)V

    :cond_0
    return-void
.end method

.method private onOptionSet()V
    .locals 2

    .line 70
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/engagement/row/PollRowEngagementView;->tvOption:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/engagement/row/PollRowEngagementView;->optionModel:Lcom/ibotta/api/model/OptionModel;

    invoke-interface {v1}, Lcom/ibotta/api/model/OptionModel;->getContent()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method


# virtual methods
.method public setOption(Lcom/ibotta/api/model/OptionModel;)V
    .locals 0

    .line 50
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/engagement/row/PollRowEngagementView;->optionModel:Lcom/ibotta/api/model/OptionModel;

    .line 52
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/engagement/row/PollRowEngagementView;->onOptionSet()V

    return-void
.end method
