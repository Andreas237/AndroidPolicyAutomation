.class public Lcom/ibotta/android/mvp/ui/view/engagement/row/JoustEngagementTableView;
.super Landroid/widget/TableLayout;
.source "JoustEngagementTableView.java"


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/mvp/ui/view/engagement/row/JoustEngagementTableView$JoustEngagementTableListener;
    }
.end annotation


# instance fields
.field private listener:Lcom/ibotta/android/mvp/ui/view/engagement/row/JoustEngagementTableView$JoustEngagementTableListener;

.field private optionModels:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/OptionModel;",
            ">;"
        }
    .end annotation
.end field

.field private optionsMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lcom/ibotta/api/model/OptionModel;",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 36
    invoke-direct {p0, p1}, Landroid/widget/TableLayout;-><init>(Landroid/content/Context;)V

    .line 29
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/engagement/row/JoustEngagementTableView;->optionsMap:Ljava/util/Map;

    .line 37
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/engagement/row/JoustEngagementTableView;->initLayout()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 41
    invoke-direct {p0, p1, p2}, Landroid/widget/TableLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 29
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/engagement/row/JoustEngagementTableView;->optionsMap:Ljava/util/Map;

    .line 42
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/engagement/row/JoustEngagementTableView;->initLayout()V

    return-void
.end method

.method private createCellLayoutParams(I)Landroid/widget/TableRow$LayoutParams;
    .locals 3

    .line 114
    new-instance v0, Landroid/widget/TableRow$LayoutParams;

    const/4 v1, 0x0

    const/4 v2, -0x2

    invoke-direct {v0, v1, v2}, Landroid/widget/TableRow$LayoutParams;-><init>(II)V

    const/16 v2, 0x31

    .line 115
    iput v2, v0, Landroid/widget/TableRow$LayoutParams;->gravity:I

    const/high16 v2, 0x42480000    # 50.0f

    .line 116
    iput v2, v0, Landroid/widget/TableRow$LayoutParams;->weight:F

    .line 118
    rem-int/lit8 p1, p1, 0x2

    if-nez p1, :cond_0

    const/4 v1, 0x1

    :cond_0
    const p1, 0x7f0701bb

    if-eqz v1, :cond_1

    .line 121
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/engagement/row/JoustEngagementTableView;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, p1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p1

    iput p1, v0, Landroid/widget/TableRow$LayoutParams;->rightMargin:I

    goto :goto_0

    .line 123
    :cond_1
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/engagement/row/JoustEngagementTableView;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, p1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p1

    iput p1, v0, Landroid/widget/TableRow$LayoutParams;->leftMargin:I

    :goto_0
    return-object v0
.end method

.method private createRow(Z)Landroid/widget/TableRow;
    .locals 3

    .line 97
    new-instance v0, Landroid/widget/TableLayout$LayoutParams;

    const/4 v1, -0x1

    const/4 v2, -0x2

    invoke-direct {v0, v1, v2}, Landroid/widget/TableLayout$LayoutParams;-><init>(II)V

    .line 99
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/engagement/row/JoustEngagementTableView;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f070165

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    iput v1, v0, Landroid/widget/TableLayout$LayoutParams;->leftMargin:I

    .line 100
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/engagement/row/JoustEngagementTableView;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    iput v1, v0, Landroid/widget/TableLayout$LayoutParams;->rightMargin:I

    if-eqz p1, :cond_0

    .line 103
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/engagement/row/JoustEngagementTableView;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const v1, 0x7f070190

    invoke-virtual {p1, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p1

    iput p1, v0, Landroid/widget/TableLayout$LayoutParams;->bottomMargin:I

    .line 106
    :cond_0
    new-instance p1, Landroid/widget/TableRow;

    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/engagement/row/JoustEngagementTableView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {p1, v1}, Landroid/widget/TableRow;-><init>(Landroid/content/Context;)V

    .line 107
    invoke-virtual {p1, v0}, Landroid/widget/TableRow;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    const/high16 v0, 0x42c80000    # 100.0f

    .line 108
    invoke-virtual {p1, v0}, Landroid/widget/TableRow;->setWeightSum(F)V

    return-object p1
.end method

.method private initLayout()V
    .locals 3

    const/4 v0, 0x1

    .line 59
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/engagement/row/JoustEngagementTableView;->setStretchAllColumns(Z)V

    .line 61
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/engagement/row/JoustEngagementTableView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    const v2, 0x7f0c016b

    invoke-virtual {v1, v2, p0, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 62
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/view/View;)Lbutterknife/Unbinder;

    .line 64
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/engagement/row/JoustEngagementTableView;->isInEditMode()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    .line 65
    invoke-static {p0, v0}, Lcom/ibotta/android/views/util/IbottaViewsUtilKt;->enableForegroundRipple(Landroid/view/View;Z)V

    :cond_0
    return-void
.end method

.method public static synthetic lambda$onOptionsSet$0(Lcom/ibotta/android/mvp/ui/view/engagement/row/JoustEngagementTableView;Lcom/ibotta/api/model/OptionModel;Landroid/view/View;)V
    .locals 0

    .line 88
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/view/engagement/row/JoustEngagementTableView;->onOptionSelected(Lcom/ibotta/api/model/OptionModel;)V

    return-void
.end method

.method private onOptionSelected(Lcom/ibotta/api/model/OptionModel;)V
    .locals 1

    .line 130
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/engagement/row/JoustEngagementTableView;->listener:Lcom/ibotta/android/mvp/ui/view/engagement/row/JoustEngagementTableView$JoustEngagementTableListener;

    if-eqz v0, :cond_0

    .line 131
    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/view/engagement/row/JoustEngagementTableView$JoustEngagementTableListener;->onOptionSelected(Lcom/ibotta/api/model/OptionModel;)V

    :cond_0
    return-void
.end method

.method private onOptionsSet()V
    .locals 7

    .line 70
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/engagement/row/JoustEngagementTableView;->optionsMap:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 71
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/engagement/row/JoustEngagementTableView;->removeAllViews()V

    const/4 v0, 0x0

    const/4 v1, 0x0

    move-object v2, v1

    const/4 v1, 0x0

    .line 75
    :goto_0
    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/view/engagement/row/JoustEngagementTableView;->optionModels:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-ge v1, v3, :cond_4

    .line 76
    rem-int/lit8 v3, v1, 0x2

    const/4 v4, 0x1

    if-nez v3, :cond_0

    const/4 v3, 0x1

    goto :goto_1

    :cond_0
    const/4 v3, 0x0

    :goto_1
    if-eqz v3, :cond_2

    .line 79
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/view/engagement/row/JoustEngagementTableView;->optionModels:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    sub-int/2addr v2, v1

    const/4 v3, 0x2

    if-le v2, v3, :cond_1

    goto :goto_2

    :cond_1
    const/4 v4, 0x0

    .line 80
    :goto_2
    invoke-direct {p0, v4}, Lcom/ibotta/android/mvp/ui/view/engagement/row/JoustEngagementTableView;->createRow(Z)Landroid/widget/TableRow;

    move-result-object v2

    .line 81
    invoke-virtual {p0, v2}, Lcom/ibotta/android/mvp/ui/view/engagement/row/JoustEngagementTableView;->addView(Landroid/view/View;)V

    .line 84
    :cond_2
    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/view/engagement/row/JoustEngagementTableView;->optionModels:Ljava/util/List;

    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/ibotta/api/model/OptionModel;

    .line 86
    new-instance v4, Lcom/ibotta/android/mvp/ui/view/engagement/row/JoustCellEngagementView;

    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/engagement/row/JoustEngagementTableView;->getContext()Landroid/content/Context;

    move-result-object v5

    invoke-direct {v4, v5}, Lcom/ibotta/android/mvp/ui/view/engagement/row/JoustCellEngagementView;-><init>(Landroid/content/Context;)V

    .line 87
    invoke-virtual {v4, v3}, Lcom/ibotta/android/mvp/ui/view/engagement/row/JoustCellEngagementView;->setOption(Lcom/ibotta/api/model/OptionModel;)V

    .line 88
    new-instance v5, Lcom/ibotta/android/mvp/ui/view/engagement/row/-$$Lambda$JoustEngagementTableView$EPQuGIvMRfuaUZIGqwr-CgHwbe4;

    invoke-direct {v5, p0, v3}, Lcom/ibotta/android/mvp/ui/view/engagement/row/-$$Lambda$JoustEngagementTableView$EPQuGIvMRfuaUZIGqwr-CgHwbe4;-><init>(Lcom/ibotta/android/mvp/ui/view/engagement/row/JoustEngagementTableView;Lcom/ibotta/api/model/OptionModel;)V

    instance-of v6, v4, Landroid/view/View;

    if-nez v6, :cond_3

    invoke-virtual {v4, v5}, Lcom/ibotta/android/mvp/ui/view/engagement/row/JoustCellEngagementView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_3

    :cond_3
    move-object v6, v4

    check-cast v6, Landroid/view/View;

    invoke-static {v6, v5}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 90
    :goto_3
    invoke-direct {p0, v1}, Lcom/ibotta/android/mvp/ui/view/engagement/row/JoustEngagementTableView;->createCellLayoutParams(I)Landroid/widget/TableRow$LayoutParams;

    move-result-object v5

    invoke-virtual {v2, v4, v5}, Landroid/widget/TableRow;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 92
    iget-object v5, p0, Lcom/ibotta/android/mvp/ui/view/engagement/row/JoustEngagementTableView;->optionsMap:Ljava/util/Map;

    invoke-interface {v5, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_4
    return-void
.end method


# virtual methods
.method public getOptionsMap()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Lcom/ibotta/api/model/OptionModel;",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation

    .line 55
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/engagement/row/JoustEngagementTableView;->optionsMap:Ljava/util/Map;

    return-object v0
.end method

.method public setListener(Lcom/ibotta/android/mvp/ui/view/engagement/row/JoustEngagementTableView$JoustEngagementTableListener;)V
    .locals 0

    .line 46
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/engagement/row/JoustEngagementTableView;->listener:Lcom/ibotta/android/mvp/ui/view/engagement/row/JoustEngagementTableView$JoustEngagementTableListener;

    return-void
.end method

.method public setOptions(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/OptionModel;",
            ">;)V"
        }
    .end annotation

    .line 50
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/engagement/row/JoustEngagementTableView;->optionModels:Ljava/util/List;

    .line 51
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/engagement/row/JoustEngagementTableView;->onOptionsSet()V

    return-void
.end method
