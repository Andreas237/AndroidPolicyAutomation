.class public Lcom/ibotta/android/fragment/activity/detail/EarningsReversedDetail;
.super Lcom/ibotta/android/fragment/activity/detail/BaseActivityDetail;
.source "EarningsReversedDetail.java"


# static fields
.field private static final KEY_AMOUNT:Ljava/lang/String; = "amount"

.field private static final KEY_MESSAGE:Ljava/lang/String; = "message"

.field private static final KEY_TITLE:Ljava/lang/String; = "title"


# instance fields
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

.field protected tvTransactionDetail:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f09058e
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/title/TitleBarReducer;)V
    .locals 0

    .line 39
    invoke-direct {p0, p1, p2, p3}, Lcom/ibotta/android/fragment/activity/detail/BaseActivityDetail;-><init>(Landroid/content/Context;Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;Lcom/ibotta/android/util/Formatting;)V

    .line 40
    iput-object p4, p0, Lcom/ibotta/android/fragment/activity/detail/EarningsReversedDetail;->titleBarReducer:Lcom/ibotta/android/title/TitleBarReducer;

    return-void
.end method


# virtual methods
.method public getActionBarTitle()Ljava/lang/String;
    .locals 2

    .line 64
    iget-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/EarningsReversedDetail;->context:Landroid/content/Context;

    const v1, 0x7f11045b

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

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

    .line 55
    new-instance v0, Ljava/util/HashSet;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(I)V

    return-object v0
.end method

.method public getLayout()I
    .locals 2

    .line 45
    invoke-super {p0}, Lcom/ibotta/android/fragment/activity/detail/BaseActivityDetail;->getLayout()I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    const v0, 0x7f0c0127

    :cond_0
    return v0
.end method

.method protected initView()V
    .locals 3

    .line 69
    iget-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/EarningsReversedDetail;->v:Landroid/view/View;

    invoke-static {p0, v0}, Lbutterknife/ButterKnife;->bind(Ljava/lang/Object;Landroid/view/View;)Lbutterknife/Unbinder;

    .line 72
    iget-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/EarningsReversedDetail;->activity:Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;

    invoke-virtual {v0}, Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;->getMessageData()Ljava/util/HashMap;

    move-result-object v0

    const-string v1, "title"

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 73
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 74
    iget-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/EarningsReversedDetail;->activity:Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;

    invoke-virtual {v0}, Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;->getAmount()F

    move-result v0

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-ltz v0, :cond_0

    const v0, 0x7f110451

    goto :goto_0

    :cond_0
    const v0, 0x7f110453

    .line 76
    :goto_0
    invoke-static {v0}, Lcom/ibotta/android/views/generic/ResValueKt;->createResValue(I)Lcom/ibotta/android/views/generic/ResValue;

    move-result-object v0

    goto :goto_1

    .line 78
    :cond_1
    invoke-static {v0}, Lcom/ibotta/android/views/generic/ResValueKt;->createResValue(Ljava/lang/String;)Lcom/ibotta/android/views/generic/ResValue;

    move-result-object v0

    .line 81
    :goto_1
    iget-object v1, p0, Lcom/ibotta/android/fragment/activity/detail/EarningsReversedDetail;->tbvTitleBar:Lcom/ibotta/android/views/base/title/TitleBarView;

    iget-object v2, p0, Lcom/ibotta/android/fragment/activity/detail/EarningsReversedDetail;->titleBarReducer:Lcom/ibotta/android/title/TitleBarReducer;

    invoke-virtual {v2, v0}, Lcom/ibotta/android/title/TitleBarReducer;->create(Lcom/ibotta/android/views/generic/ResValue;)Lcom/ibotta/android/views/base/title/TitleBarViewState;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/ibotta/android/views/base/title/TitleBarView;->updateViewState(Lcom/ibotta/android/views/base/title/TitleBarViewState;)V

    .line 82
    iget-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/EarningsReversedDetail;->tvTransactionAmount:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/ibotta/android/fragment/activity/detail/EarningsReversedDetail;->activity:Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;

    invoke-virtual {v1}, Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;->getMessageData()Ljava/util/HashMap;

    move-result-object v1

    const-string v2, "amount"

    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 83
    iget-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/EarningsReversedDetail;->tvTransactionDetail:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/ibotta/android/fragment/activity/detail/EarningsReversedDetail;->activity:Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;

    invoke-virtual {v1}, Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;->getMessageData()Ljava/util/HashMap;

    move-result-object v1

    const-string v2, "message"

    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public onApiJobsFinished()V
    .locals 0

    return-void
.end method
