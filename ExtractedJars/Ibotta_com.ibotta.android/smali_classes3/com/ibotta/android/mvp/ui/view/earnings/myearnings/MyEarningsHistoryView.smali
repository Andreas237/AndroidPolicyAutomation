.class public Lcom/ibotta/android/mvp/ui/view/earnings/myearnings/MyEarningsHistoryView;
.super Landroid/widget/LinearLayout;
.source "MyEarningsHistoryView.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/view/earnings/EarningRowView$EarningRowViewListener;


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/mvp/ui/view/earnings/myearnings/MyEarningsHistoryView$MyEarningsHistoryListener;
    }
.end annotation


# instance fields
.field protected bViewAll:Landroid/widget/Button;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0900b1
    .end annotation
.end field

.field private listener:Lcom/ibotta/android/mvp/ui/view/earnings/myearnings/MyEarningsHistoryView$MyEarningsHistoryListener;

.field protected llEarningsContainer:Landroid/widget/LinearLayout;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090307
    .end annotation
.end field

.field tracker:Lcom/ibotta/android/tracking/Tracker;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 47
    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/view/earnings/myearnings/MyEarningsHistoryView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 51
    invoke-direct {p0, p1, p2, v0}, Lcom/ibotta/android/mvp/ui/view/earnings/myearnings/MyEarningsHistoryView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 55
    invoke-direct {p0, p1, p2, p3, v0}, Lcom/ibotta/android/mvp/ui/view/earnings/myearnings/MyEarningsHistoryView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 0

    .line 59
    invoke-direct {p0, p1, p2, p3, p4}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 60
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/earnings/myearnings/MyEarningsHistoryView;->initLayout()V

    return-void
.end method

.method private addDividerRow()V
    .locals 3

    .line 119
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    .line 120
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/earnings/myearnings/MyEarningsHistoryView;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f07015d

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    const/4 v2, -0x1

    invoke-direct {v0, v2, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 121
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/earnings/myearnings/MyEarningsHistoryView;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f07016d

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    iput v1, v0, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    .line 123
    new-instance v1, Landroid/view/View;

    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/earnings/myearnings/MyEarningsHistoryView;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    const v2, 0x7f0600fa

    .line 124
    invoke-virtual {v1, v2}, Landroid/view/View;->setBackgroundResource(I)V

    .line 126
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/view/earnings/myearnings/MyEarningsHistoryView;->llEarningsContainer:Landroid/widget/LinearLayout;

    invoke-virtual {v2, v1, v0}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method private addEarningsRow(Lcom/ibotta/api/model/earnings/Earning;)V
    .locals 3

    .line 108
    new-instance v0, Lcom/ibotta/android/mvp/ui/view/earnings/EarningRowView;

    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/earnings/myearnings/MyEarningsHistoryView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/view/earnings/EarningRowView;-><init>(Landroid/content/Context;)V

    .line 109
    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/view/earnings/EarningRowView;->setEarning(Lcom/ibotta/api/model/earnings/Earning;)V

    .line 110
    invoke-virtual {v0, p0}, Lcom/ibotta/android/mvp/ui/view/earnings/EarningRowView;->setListener(Lcom/ibotta/android/mvp/ui/view/earnings/EarningRowView$EarningRowViewListener;)V

    .line 112
    new-instance p1, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v1, -0x1

    const/4 v2, -0x2

    invoke-direct {p1, v1, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 113
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/earnings/myearnings/MyEarningsHistoryView;->llEarningsContainer:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v0, p1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 115
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/earnings/myearnings/MyEarningsHistoryView;->addDividerRow()V

    return-void
.end method

.method private initEarnings(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/earnings/Earning;",
            ">;)V"
        }
    .end annotation

    .line 89
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/earnings/myearnings/MyEarningsHistoryView;->llEarningsContainer:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->removeAllViews()V

    .line 91
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/api/model/earnings/Earning;

    .line 92
    sget-object v1, Lcom/ibotta/android/mvp/ui/view/earnings/myearnings/MyEarningsHistoryView$1;->$SwitchMap$com$ibotta$api$model$earnings$Earning$Type:[I

    invoke-virtual {v0}, Lcom/ibotta/api/model/earnings/Earning;->getEarningTypeEnum()Lcom/ibotta/api/model/earnings/Earning$Type;

    move-result-object v2

    invoke-virtual {v2}, Lcom/ibotta/api/model/earnings/Earning$Type;->ordinal()I

    move-result v2

    aget v1, v1, v2

    packed-switch v1, :pswitch_data_0

    goto :goto_0

    .line 96
    :pswitch_0
    invoke-direct {p0, v0}, Lcom/ibotta/android/mvp/ui/view/earnings/myearnings/MyEarningsHistoryView;->addEarningsRow(Lcom/ibotta/api/model/earnings/Earning;)V

    goto :goto_0

    :cond_0
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method private initLayout()V
    .locals 3

    .line 64
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/App;->getMainComponent()Lcom/ibotta/android/di/MainComponent;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/ibotta/android/di/MainComponent;->inject(Lcom/ibotta/android/mvp/ui/view/earnings/myearnings/MyEarningsHistoryView;)V

    const/4 v0, 0x1

    .line 66
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/earnings/myearnings/MyEarningsHistoryView;->setOrientation(I)V

    .line 68
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/earnings/myearnings/MyEarningsHistoryView;->isInEditMode()Z

    move-result v1

    if-nez v1, :cond_0

    .line 69
    invoke-static {p0, v0}, Lcom/ibotta/android/views/util/IbottaViewsUtilKt;->enableBackgroundRipple(Landroid/view/View;Z)V

    .line 72
    :cond_0
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/earnings/myearnings/MyEarningsHistoryView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    const v2, 0x7f0c017c

    invoke-virtual {v1, v2, p0, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 73
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/view/View;)Lbutterknife/Unbinder;

    .line 75
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/earnings/myearnings/MyEarningsHistoryView;->getContext()Landroid/content/Context;

    move-result-object v0

    const v1, 0x7f060171

    invoke-static {v0, v1}, Landroid/support/v4/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/earnings/myearnings/MyEarningsHistoryView;->setBackgroundColor(I)V

    return-void
.end method

.method private initViewAllButton()V
    .locals 3

    .line 103
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/earnings/myearnings/MyEarningsHistoryView;->bViewAll:Landroid/widget/Button;

    const v1, 0x7f11067a

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(I)V

    .line 104
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/earnings/myearnings/MyEarningsHistoryView;->bViewAll:Landroid/widget/Button;

    new-instance v1, Lcom/ibotta/android/mvp/ui/view/earnings/myearnings/-$$Lambda$MyEarningsHistoryView$aFqIxv4uwBr0N50kaVEYyP1k_h8;

    invoke-direct {v1, p0}, Lcom/ibotta/android/mvp/ui/view/earnings/myearnings/-$$Lambda$MyEarningsHistoryView$aFqIxv4uwBr0N50kaVEYyP1k_h8;-><init>(Lcom/ibotta/android/mvp/ui/view/earnings/myearnings/MyEarningsHistoryView;)V

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_0

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    :goto_0
    return-void
.end method

.method public static synthetic lambda$initViewAllButton$0(Lcom/ibotta/android/mvp/ui/view/earnings/myearnings/MyEarningsHistoryView;Landroid/view/View;)V
    .locals 0

    .line 104
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/earnings/myearnings/MyEarningsHistoryView;->onViewFullEarningsHistoryClicked()V

    return-void
.end method

.method private onViewFullEarningsHistoryClicked()V
    .locals 2

    .line 130
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/earnings/myearnings/MyEarningsHistoryView;->tracker:Lcom/ibotta/android/tracking/Tracker;

    const-string v1, "view_full_earnings_history_click"

    invoke-interface {v0, v1}, Lcom/ibotta/android/tracking/Tracker;->event(Ljava/lang/String;)V

    .line 132
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/earnings/myearnings/MyEarningsHistoryView;->listener:Lcom/ibotta/android/mvp/ui/view/earnings/myearnings/MyEarningsHistoryView$MyEarningsHistoryListener;

    if-eqz v0, :cond_0

    .line 133
    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/view/earnings/myearnings/MyEarningsHistoryView$MyEarningsHistoryListener;->onViewFullEarningsHistoryClicked()V

    :cond_0
    return-void
.end method


# virtual methods
.method public onEarningRowViewClicked(Lcom/ibotta/api/model/earnings/Earning;)V
    .locals 1

    .line 139
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/earnings/myearnings/MyEarningsHistoryView;->listener:Lcom/ibotta/android/mvp/ui/view/earnings/myearnings/MyEarningsHistoryView$MyEarningsHistoryListener;

    if-eqz v0, :cond_0

    .line 140
    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/view/earnings/myearnings/MyEarningsHistoryView$MyEarningsHistoryListener;->onEarningRowViewClicked(Lcom/ibotta/api/model/earnings/Earning;)V

    :cond_0
    return-void
.end method

.method public setListener(Lcom/ibotta/android/mvp/ui/view/earnings/myearnings/MyEarningsHistoryView$MyEarningsHistoryListener;)V
    .locals 0

    .line 84
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/earnings/myearnings/MyEarningsHistoryView;->listener:Lcom/ibotta/android/mvp/ui/view/earnings/myearnings/MyEarningsHistoryView$MyEarningsHistoryListener;

    return-void
.end method

.method public setup(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/earnings/Earning;",
            ">;)V"
        }
    .end annotation

    .line 79
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/view/earnings/myearnings/MyEarningsHistoryView;->initEarnings(Ljava/util/List;)V

    .line 80
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/earnings/myearnings/MyEarningsHistoryView;->initViewAllButton()V

    return-void
.end method
