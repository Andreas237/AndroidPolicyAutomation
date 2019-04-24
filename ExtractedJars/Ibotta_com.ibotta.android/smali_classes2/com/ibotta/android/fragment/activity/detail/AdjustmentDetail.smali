.class public Lcom/ibotta/android/fragment/activity/detail/AdjustmentDetail;
.super Lcom/ibotta/android/fragment/activity/detail/BaseActivityDetail;
.source "AdjustmentDetail.java"


# instance fields
.field private final formatting:Lcom/ibotta/android/util/Formatting;

.field protected tbvTitleBar:Lcom/ibotta/android/views/base/title/TitleBarView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f09044e
    .end annotation
.end field

.field private final titleBarReducer:Lcom/ibotta/android/title/TitleBarReducer;

.field protected tvTransactionAmount:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f09058d
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/title/TitleBarReducer;)V
    .locals 0

    .line 33
    invoke-direct {p0, p1, p2, p3}, Lcom/ibotta/android/fragment/activity/detail/BaseActivityDetail;-><init>(Landroid/content/Context;Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;Lcom/ibotta/android/util/Formatting;)V

    .line 34
    iput-object p3, p0, Lcom/ibotta/android/fragment/activity/detail/AdjustmentDetail;->formatting:Lcom/ibotta/android/util/Formatting;

    .line 35
    iput-object p4, p0, Lcom/ibotta/android/fragment/activity/detail/AdjustmentDetail;->titleBarReducer:Lcom/ibotta/android/title/TitleBarReducer;

    return-void
.end method


# virtual methods
.method public getActionBarTitle()Ljava/lang/String;
    .locals 2

    .line 60
    iget-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/AdjustmentDetail;->activity:Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;

    if-eqz v0, :cond_1

    .line 61
    iget-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/AdjustmentDetail;->activity:Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;

    invoke-virtual {v0}, Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;->getAmount()F

    move-result v0

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-ltz v0, :cond_0

    .line 62
    iget-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/AdjustmentDetail;->context:Landroid/content/Context;

    const v1, 0x7f110452

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 63
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/AdjustmentDetail;->context:Landroid/content/Context;

    const v1, 0x7f110454

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public getApiJobs()Ljava/util/Set;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lcom/ibotta/android/service/api/job/ApiJob;",
            ">;"
        }
    .end annotation

    .line 45
    new-instance v0, Ljava/util/HashSet;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(I)V

    return-object v0
.end method

.method public getLayout()I
    .locals 1

    const v0, 0x7f0c0124

    return v0
.end method

.method protected initView()V
    .locals 4

    .line 70
    iget-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/AdjustmentDetail;->v:Landroid/view/View;

    invoke-static {p0, v0}, Lbutterknife/ButterKnife;->bind(Ljava/lang/Object;Landroid/view/View;)Lbutterknife/Unbinder;

    .line 72
    iget-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/AdjustmentDetail;->activity:Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;

    invoke-virtual {v0}, Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;->getAmount()F

    move-result v0

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-ltz v0, :cond_0

    const v0, 0x7f110451

    goto :goto_0

    :cond_0
    const v0, 0x7f110453

    .line 74
    :goto_0
    iget-object v1, p0, Lcom/ibotta/android/fragment/activity/detail/AdjustmentDetail;->tbvTitleBar:Lcom/ibotta/android/views/base/title/TitleBarView;

    iget-object v2, p0, Lcom/ibotta/android/fragment/activity/detail/AdjustmentDetail;->titleBarReducer:Lcom/ibotta/android/title/TitleBarReducer;

    invoke-static {v0}, Lcom/ibotta/android/views/generic/ResValueKt;->createResValue(I)Lcom/ibotta/android/views/generic/ResValue;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/ibotta/android/title/TitleBarReducer;->create(Lcom/ibotta/android/views/generic/ResValue;)Lcom/ibotta/android/views/base/title/TitleBarViewState;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/ibotta/android/views/base/title/TitleBarView;->updateViewState(Lcom/ibotta/android/views/base/title/TitleBarViewState;)V

    .line 75
    iget-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/AdjustmentDetail;->tvTransactionAmount:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/ibotta/android/fragment/activity/detail/AdjustmentDetail;->formatting:Lcom/ibotta/android/util/Formatting;

    iget-object v2, p0, Lcom/ibotta/android/fragment/activity/detail/AdjustmentDetail;->activity:Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;

    invoke-virtual {v2}, Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;->getAmountAbsolute()F

    move-result v2

    float-to-double v2, v2

    invoke-interface {v1, v2, v3}, Lcom/ibotta/android/util/Formatting;->currencyNoDollarSign(D)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public isCustomContainer()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public onApiJobsFinished()V
    .locals 0

    return-void
.end method
