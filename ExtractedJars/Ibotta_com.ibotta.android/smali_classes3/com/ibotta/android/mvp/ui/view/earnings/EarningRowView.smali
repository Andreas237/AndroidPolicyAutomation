.class public Lcom/ibotta/android/mvp/ui/view/earnings/EarningRowView;
.super Landroid/widget/LinearLayout;
.source "EarningRowView.java"


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/mvp/ui/view/earnings/EarningRowView$EarningRowViewListener;
    }
.end annotation


# instance fields
.field private earning:Lcom/ibotta/api/model/earnings/Earning;

.field formatting:Lcom/ibotta/android/util/Formatting;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field imageCache:Lcom/ibotta/android/images/ImageCache;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected ivIcon:Landroid/widget/ImageView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0902ac
    .end annotation
.end field

.field private listener:Lcom/ibotta/android/mvp/ui/view/earnings/EarningRowView$EarningRowViewListener;

.field protected tvAmountPending:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0904f3
    .end annotation
.end field

.field protected tvAmountPendingValue:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0904f4
    .end annotation
.end field

.field protected tvDate:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090512
    .end annotation
.end field

.field protected tvDateValue:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090513
    .end annotation
.end field

.field protected tvOtherRewards:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090558
    .end annotation
.end field

.field protected tvOtherRewardsValue:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090559
    .end annotation
.end field

.field protected tvTitle:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090587
    .end annotation
.end field

.field protected tvTotalEarnings:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f09058b
    .end annotation
.end field

.field protected tvTotalEarningsValue:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f09058c
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 59
    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/view/earnings/EarningRowView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 63
    invoke-direct {p0, p1, p2, v0}, Lcom/ibotta/android/mvp/ui/view/earnings/EarningRowView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 67
    invoke-direct {p0, p1, p2, p3, v0}, Lcom/ibotta/android/mvp/ui/view/earnings/EarningRowView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 0

    .line 71
    invoke-direct {p0, p1, p2, p3, p4}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 72
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/earnings/EarningRowView;->initLayout()V

    return-void
.end method

.method private initActivationDate()V
    .locals 3

    .line 161
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/earnings/EarningRowView;->earning:Lcom/ibotta/api/model/earnings/Earning;

    invoke-virtual {v0}, Lcom/ibotta/api/model/earnings/Earning;->getSubmittedTime()Ljava/util/Date;

    move-result-object v0

    .line 162
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/earnings/EarningRowView;->formatting:Lcom/ibotta/android/util/Formatting;

    invoke-interface {v1, v0}, Lcom/ibotta/android/util/Formatting;->date(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    .line 164
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/earnings/EarningRowView;->tvDate:Landroid/widget/TextView;

    const v2, 0x7f110049

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(I)V

    .line 165
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/earnings/EarningRowView;->tvDate:Landroid/widget/TextView;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 167
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/earnings/EarningRowView;->tvDateValue:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 168
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/earnings/EarningRowView;->tvDateValue:Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setVisibility(I)V

    return-void
.end method

.method private initAmountPending()V
    .locals 5

    .line 194
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/earnings/EarningRowView;->earning:Lcom/ibotta/api/model/earnings/Earning;

    invoke-virtual {v0}, Lcom/ibotta/api/model/earnings/Earning;->getEarningProcessingStateEnum()Lcom/ibotta/api/model/earnings/Earning$ProcessingState;

    move-result-object v0

    sget-object v1, Lcom/ibotta/api/model/earnings/Earning$ProcessingState;->PENDING_VERIFICATION:Lcom/ibotta/api/model/earnings/Earning$ProcessingState;

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/earnings/EarningRowView;->earning:Lcom/ibotta/api/model/earnings/Earning;

    .line 195
    invoke-virtual {v0}, Lcom/ibotta/api/model/earnings/Earning;->getEarningProcessingStateEnum()Lcom/ibotta/api/model/earnings/Earning$ProcessingState;

    move-result-object v0

    sget-object v1, Lcom/ibotta/api/model/earnings/Earning$ProcessingState;->PENDING:Lcom/ibotta/api/model/earnings/Earning$ProcessingState;

    if-eq v0, v1, :cond_0

    .line 196
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/earnings/EarningRowView;->tvAmountPending:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 197
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/earnings/EarningRowView;->tvAmountPendingValue:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    return-void

    .line 201
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/earnings/EarningRowView;->tvAmountPending:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 202
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/earnings/EarningRowView;->tvAmountPendingValue:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 204
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/earnings/EarningRowView;->tvAmountPending:Landroid/widget/TextView;

    const v1, 0x7f1100a2

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 205
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/earnings/EarningRowView;->earning:Lcom/ibotta/api/model/earnings/Earning;

    invoke-virtual {v0}, Lcom/ibotta/api/model/earnings/Earning;->isProcessing()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 206
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/earnings/EarningRowView;->tvAmountPendingValue:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getTypeface()Landroid/graphics/Typeface;

    move-result-object v1

    const/4 v2, 0x2

    invoke-virtual {v0, v1, v2}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 207
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/earnings/EarningRowView;->tvAmountPendingValue:Landroid/widget/TextView;

    const v1, 0x7f1101d7

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    goto :goto_0

    .line 209
    :cond_1
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/earnings/EarningRowView;->earning:Lcom/ibotta/api/model/earnings/Earning;

    invoke-virtual {v0}, Lcom/ibotta/api/model/earnings/Earning;->getPendingAmount()F

    move-result v0

    .line 210
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/earnings/EarningRowView;->tvAmountPendingValue:Landroid/widget/TextView;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/view/earnings/EarningRowView;->tvDateValue:Landroid/widget/TextView;

    invoke-virtual {v2}, Landroid/widget/TextView;->getTypeface()Landroid/graphics/Typeface;

    move-result-object v2

    const/4 v3, 0x1

    invoke-virtual {v1, v2, v3}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 211
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/earnings/EarningRowView;->tvAmountPendingValue:Landroid/widget/TextView;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/view/earnings/EarningRowView;->formatting:Lcom/ibotta/android/util/Formatting;

    float-to-double v3, v0

    invoke-interface {v2, v3, v4}, Lcom/ibotta/android/util/Formatting;->currencyLeadZero(D)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :goto_0
    return-void
.end method

.method private initDate()V
    .locals 2

    .line 134
    sget-object v0, Lcom/ibotta/android/mvp/ui/view/earnings/EarningRowView$1;->$SwitchMap$com$ibotta$api$model$earnings$Earning$Type:[I

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/earnings/EarningRowView;->earning:Lcom/ibotta/api/model/earnings/Earning;

    invoke-virtual {v1}, Lcom/ibotta/api/model/earnings/Earning;->getEarningTypeEnum()Lcom/ibotta/api/model/earnings/Earning$Type;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ibotta/api/model/earnings/Earning$Type;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 140
    :pswitch_0
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/earnings/EarningRowView;->initActivationDate()V

    goto :goto_0

    .line 137
    :pswitch_1
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/earnings/EarningRowView;->initPurchaseDate()V

    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private initIcon()V
    .locals 5

    .line 113
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/earnings/EarningRowView;->earning:Lcom/ibotta/api/model/earnings/Earning;

    invoke-virtual {v0}, Lcom/ibotta/api/model/earnings/Earning;->getImageUrl()Ljava/lang/String;

    move-result-object v0

    .line 115
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 116
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/earnings/EarningRowView;->ivIcon:Landroid/widget/ImageView;

    const v1, 0x7f0801f9

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_0

    .line 118
    :cond_0
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/earnings/EarningRowView;->imageCache:Lcom/ibotta/android/images/ImageCache;

    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/earnings/EarningRowView;->getContext()Landroid/content/Context;

    move-result-object v2

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/view/earnings/EarningRowView;->ivIcon:Landroid/widget/ImageView;

    sget-object v4, Lcom/ibotta/android/views/images/Sizes;->RETAILER_LOGO:Lcom/ibotta/android/views/images/Sizes;

    invoke-interface {v1, v2, v0, v3, v4}, Lcom/ibotta/android/images/ImageCache;->load(Landroid/content/Context;Ljava/lang/String;Landroid/widget/ImageView;Lcom/ibotta/android/images/ImageCache$Size;)Lcom/ibotta/android/images/ImageLoadJob;

    :goto_0
    return-void
.end method

.method private initLayout()V
    .locals 3

    .line 85
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/App;->getMainComponent()Lcom/ibotta/android/di/MainComponent;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/ibotta/android/di/MainComponent;->inject(Lcom/ibotta/android/mvp/ui/view/earnings/EarningRowView;)V

    const/4 v0, 0x0

    .line 87
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/earnings/EarningRowView;->setOrientation(I)V

    const/high16 v1, 0x42c80000    # 100.0f

    .line 88
    invoke-virtual {p0, v1}, Lcom/ibotta/android/mvp/ui/view/earnings/EarningRowView;->setWeightSum(F)V

    const/4 v1, 0x1

    .line 89
    invoke-virtual {p0, v1}, Lcom/ibotta/android/mvp/ui/view/earnings/EarningRowView;->setClickable(Z)V

    .line 90
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/earnings/EarningRowView;->setFocusable(Z)V

    .line 92
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/earnings/EarningRowView;->isInEditMode()Z

    move-result v2

    if-nez v2, :cond_0

    .line 93
    invoke-static {p0, v0}, Lcom/ibotta/android/views/util/IbottaViewsUtilKt;->enableBackgroundRipple(Landroid/view/View;Z)V

    .line 96
    :cond_0
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/earnings/EarningRowView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v2, 0x7f0c018c

    invoke-virtual {v0, v2, p0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 97
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/view/View;)Lbutterknife/Unbinder;

    .line 98
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/earnings/EarningRowView;->getContext()Landroid/content/Context;

    move-result-object v0

    const v1, 0x7f060171

    invoke-static {v0, v1}, Landroid/support/v4/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/earnings/EarningRowView;->setBackgroundColor(I)V

    .line 100
    new-instance v0, Lcom/ibotta/android/mvp/ui/view/earnings/-$$Lambda$EarningRowView$ywoHwz7cYiOxB2hyVih1w8nyHCA;

    invoke-direct {v0, p0}, Lcom/ibotta/android/mvp/ui/view/earnings/-$$Lambda$EarningRowView$ywoHwz7cYiOxB2hyVih1w8nyHCA;-><init>(Lcom/ibotta/android/mvp/ui/view/earnings/EarningRowView;)V

    instance-of v1, p0, Landroid/view/View;

    if-nez v1, :cond_1

    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/earnings/EarningRowView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_1
    move-object v1, p0

    check-cast v1, Landroid/view/View;

    invoke-static {v1, v0}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    :goto_0
    return-void
.end method

.method private initOtherRewards()V
    .locals 3

    .line 216
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/earnings/EarningRowView;->earning:Lcom/ibotta/api/model/earnings/Earning;

    invoke-virtual {v0}, Lcom/ibotta/api/model/earnings/Earning;->getAlternateText()Ljava/lang/String;

    move-result-object v0

    .line 218
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 219
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/earnings/EarningRowView;->tvOtherRewards:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 220
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/earnings/EarningRowView;->tvOtherRewardsValue:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0

    .line 222
    :cond_0
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/earnings/EarningRowView;->tvOtherRewards:Landroid/widget/TextView;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 223
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/earnings/EarningRowView;->tvOtherRewardsValue:Landroid/widget/TextView;

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 225
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/earnings/EarningRowView;->tvOtherRewards:Landroid/widget/TextView;

    const v2, 0x7f1104a2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(I)V

    .line 226
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/earnings/EarningRowView;->tvOtherRewardsValue:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :goto_0
    return-void
.end method

.method private initPurchaseDate()V
    .locals 4

    .line 146
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/earnings/EarningRowView;->earning:Lcom/ibotta/api/model/earnings/Earning;

    invoke-virtual {v0}, Lcom/ibotta/api/model/earnings/Earning;->getTime()Ljava/util/Date;

    move-result-object v0

    if-nez v0, :cond_0

    .line 148
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/earnings/EarningRowView;->earning:Lcom/ibotta/api/model/earnings/Earning;

    invoke-virtual {v0}, Lcom/ibotta/api/model/earnings/Earning;->getSubmittedTime()Ljava/util/Date;

    move-result-object v0

    .line 150
    :cond_0
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/earnings/EarningRowView;->formatting:Lcom/ibotta/android/util/Formatting;

    invoke-interface {v1, v0}, Lcom/ibotta/android/util/Formatting;->date(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    .line 152
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/earnings/EarningRowView;->tvDate:Landroid/widget/TextView;

    const v2, 0x7f1104c6

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(I)V

    .line 153
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/earnings/EarningRowView;->tvDate:Landroid/widget/TextView;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 155
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/earnings/EarningRowView;->tvDateValue:Landroid/widget/TextView;

    invoke-virtual {v1}, Landroid/widget/TextView;->getTypeface()Landroid/graphics/Typeface;

    move-result-object v3

    invoke-virtual {v1, v3, v2}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 156
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/earnings/EarningRowView;->tvDateValue:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 157
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/earnings/EarningRowView;->tvDateValue:Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setVisibility(I)V

    return-void
.end method

.method private initTitle()V
    .locals 3

    .line 123
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/earnings/EarningRowView;->earning:Lcom/ibotta/api/model/earnings/Earning;

    invoke-virtual {v0}, Lcom/ibotta/api/model/earnings/Earning;->getTitle()Ljava/lang/String;

    move-result-object v0

    .line 125
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 126
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/earnings/EarningRowView;->tvTitle:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0

    .line 128
    :cond_0
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/earnings/EarningRowView;->tvTitle:Landroid/widget/TextView;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 129
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/earnings/EarningRowView;->tvTitle:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :goto_0
    return-void
.end method

.method private initTotalEarnings()V
    .locals 5

    .line 172
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/earnings/EarningRowView;->earning:Lcom/ibotta/api/model/earnings/Earning;

    invoke-virtual {v0}, Lcom/ibotta/api/model/earnings/Earning;->getEarningProcessingStateEnum()Lcom/ibotta/api/model/earnings/Earning$ProcessingState;

    move-result-object v0

    sget-object v1, Lcom/ibotta/api/model/earnings/Earning$ProcessingState;->PENDING_VERIFICATION:Lcom/ibotta/api/model/earnings/Earning$ProcessingState;

    if-eq v0, v1, :cond_2

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/earnings/EarningRowView;->earning:Lcom/ibotta/api/model/earnings/Earning;

    .line 173
    invoke-virtual {v0}, Lcom/ibotta/api/model/earnings/Earning;->getEarningProcessingStateEnum()Lcom/ibotta/api/model/earnings/Earning$ProcessingState;

    move-result-object v0

    sget-object v1, Lcom/ibotta/api/model/earnings/Earning$ProcessingState;->PENDING:Lcom/ibotta/api/model/earnings/Earning$ProcessingState;

    if-ne v0, v1, :cond_0

    goto :goto_1

    .line 179
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/earnings/EarningRowView;->tvTotalEarnings:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 180
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/earnings/EarningRowView;->tvTotalEarningsValue:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 182
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/earnings/EarningRowView;->tvTotalEarnings:Landroid/widget/TextView;

    const v2, 0x7f110635

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(I)V

    .line 183
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/earnings/EarningRowView;->earning:Lcom/ibotta/api/model/earnings/Earning;

    invoke-virtual {v0}, Lcom/ibotta/api/model/earnings/Earning;->isProcessing()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 184
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/earnings/EarningRowView;->tvTotalEarningsValue:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getTypeface()Landroid/graphics/Typeface;

    move-result-object v1

    const/4 v2, 0x2

    invoke-virtual {v0, v1, v2}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 185
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/earnings/EarningRowView;->tvTotalEarningsValue:Landroid/widget/TextView;

    const v1, 0x7f1101d7

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    goto :goto_0

    .line 187
    :cond_1
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/earnings/EarningRowView;->earning:Lcom/ibotta/api/model/earnings/Earning;

    invoke-virtual {v0}, Lcom/ibotta/api/model/earnings/Earning;->getEarnedAmount()F

    move-result v0

    .line 188
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/view/earnings/EarningRowView;->tvTotalEarningsValue:Landroid/widget/TextView;

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/view/earnings/EarningRowView;->tvDateValue:Landroid/widget/TextView;

    invoke-virtual {v3}, Landroid/widget/TextView;->getTypeface()Landroid/graphics/Typeface;

    move-result-object v3

    invoke-virtual {v2, v3, v1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 189
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/earnings/EarningRowView;->tvTotalEarningsValue:Landroid/widget/TextView;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/view/earnings/EarningRowView;->formatting:Lcom/ibotta/android/util/Formatting;

    float-to-double v3, v0

    invoke-interface {v2, v3, v4}, Lcom/ibotta/android/util/Formatting;->currencyLeadZero(D)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :goto_0
    return-void

    .line 174
    :cond_2
    :goto_1
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/earnings/EarningRowView;->tvTotalEarnings:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 175
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/earnings/EarningRowView;->tvTotalEarningsValue:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    return-void
.end method

.method public static synthetic lambda$initLayout$0(Lcom/ibotta/android/mvp/ui/view/earnings/EarningRowView;Landroid/view/View;)V
    .locals 0

    .line 100
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/earnings/EarningRowView;->onEarningRowViewClicked()V

    return-void
.end method

.method private onEarningRowViewClicked()V
    .locals 2

    .line 231
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/earnings/EarningRowView;->listener:Lcom/ibotta/android/mvp/ui/view/earnings/EarningRowView$EarningRowViewListener;

    if-eqz v0, :cond_0

    .line 232
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/earnings/EarningRowView;->earning:Lcom/ibotta/api/model/earnings/Earning;

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/view/earnings/EarningRowView$EarningRowViewListener;->onEarningRowViewClicked(Lcom/ibotta/api/model/earnings/Earning;)V

    :cond_0
    return-void
.end method

.method private onEarningSet()V
    .locals 0

    .line 104
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/earnings/EarningRowView;->initIcon()V

    .line 105
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/earnings/EarningRowView;->initTitle()V

    .line 106
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/earnings/EarningRowView;->initDate()V

    .line 107
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/earnings/EarningRowView;->initTotalEarnings()V

    .line 108
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/earnings/EarningRowView;->initAmountPending()V

    .line 109
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/earnings/EarningRowView;->initOtherRewards()V

    return-void
.end method


# virtual methods
.method public setEarning(Lcom/ibotta/api/model/earnings/Earning;)V
    .locals 0

    .line 76
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/earnings/EarningRowView;->earning:Lcom/ibotta/api/model/earnings/Earning;

    .line 77
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/earnings/EarningRowView;->onEarningSet()V

    return-void
.end method

.method public setListener(Lcom/ibotta/android/mvp/ui/view/earnings/EarningRowView$EarningRowViewListener;)V
    .locals 0

    .line 81
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/earnings/EarningRowView;->listener:Lcom/ibotta/android/mvp/ui/view/earnings/EarningRowView$EarningRowViewListener;

    return-void
.end method
