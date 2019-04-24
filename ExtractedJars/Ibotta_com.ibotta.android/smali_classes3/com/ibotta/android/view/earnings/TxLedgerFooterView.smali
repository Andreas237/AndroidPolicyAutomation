.class public Lcom/ibotta/android/view/earnings/TxLedgerFooterView;
.super Landroid/widget/LinearLayout;
.source "TxLedgerFooterView.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/view/earnings/TxLedgerFooterView$TxLedgerFooterListener;
    }
.end annotation


# instance fields
.field private listener:Lcom/ibotta/android/view/earnings/TxLedgerFooterView$TxLedgerFooterListener;

.field protected tvMessage:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090548
    .end annotation
.end field

.field private txLedgerData:Lcom/ibotta/android/earnings/TxLedgerData;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 37
    invoke-direct {p0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 38
    invoke-direct {p0}, Lcom/ibotta/android/view/earnings/TxLedgerFooterView;->initLayout()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 42
    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 43
    invoke-direct {p0}, Lcom/ibotta/android/view/earnings/TxLedgerFooterView;->initLayout()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 47
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 48
    invoke-direct {p0}, Lcom/ibotta/android/view/earnings/TxLedgerFooterView;->initLayout()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 0
    .annotation build Landroid/support/annotation/RequiresApi;
        api = 0x15
    .end annotation

    .line 53
    invoke-direct {p0, p1, p2, p3, p4}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 54
    invoke-direct {p0}, Lcom/ibotta/android/view/earnings/TxLedgerFooterView;->initLayout()V

    return-void
.end method

.method private initLayout()V
    .locals 3

    const/4 v0, 0x1

    .line 58
    invoke-virtual {p0, v0}, Lcom/ibotta/android/view/earnings/TxLedgerFooterView;->setOrientation(I)V

    const/high16 v1, 0x42c80000    # 100.0f

    .line 59
    invoke-virtual {p0, v1}, Lcom/ibotta/android/view/earnings/TxLedgerFooterView;->setWeightSum(F)V

    .line 61
    invoke-virtual {p0}, Lcom/ibotta/android/view/earnings/TxLedgerFooterView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    const v2, 0x7f0c01ed

    invoke-virtual {v1, v2, p0, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 62
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/view/View;)Lbutterknife/Unbinder;

    return-void
.end method

.method private initMessage()V
    .locals 7

    .line 79
    iget-object v0, p0, Lcom/ibotta/android/view/earnings/TxLedgerFooterView;->txLedgerData:Lcom/ibotta/android/earnings/TxLedgerData;

    invoke-virtual {v0}, Lcom/ibotta/android/earnings/TxLedgerData;->getTxState()Lcom/ibotta/android/earnings/TxLedgerData$TxState;

    move-result-object v0

    sget-object v1, Lcom/ibotta/android/earnings/TxLedgerData$TxState;->COMPLETE:Lcom/ibotta/android/earnings/TxLedgerData$TxState;

    const/16 v2, 0x8

    if-ne v0, v1, :cond_0

    .line 80
    iget-object v0, p0, Lcom/ibotta/android/view/earnings/TxLedgerFooterView;->tvMessage:Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setVisibility(I)V

    return-void

    .line 86
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/view/earnings/TxLedgerFooterView;->txLedgerData:Lcom/ibotta/android/earnings/TxLedgerData;

    invoke-virtual {v0}, Lcom/ibotta/android/earnings/TxLedgerData;->getTxState()Lcom/ibotta/android/earnings/TxLedgerData$TxState;

    move-result-object v0

    sget-object v1, Lcom/ibotta/android/earnings/TxLedgerData$TxState;->PENDING:Lcom/ibotta/android/earnings/TxLedgerData$TxState;

    if-ne v0, v1, :cond_2

    const-string v0, ""

    .line 88
    iget-object v1, p0, Lcom/ibotta/android/view/earnings/TxLedgerFooterView;->txLedgerData:Lcom/ibotta/android/earnings/TxLedgerData;

    invoke-virtual {v1}, Lcom/ibotta/android/earnings/TxLedgerData;->getPendingPeriod()Ljava/lang/String;

    move-result-object v1

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v1, :cond_1

    .line 89
    invoke-virtual {p0}, Lcom/ibotta/android/view/earnings/TxLedgerFooterView;->getContext()Landroid/content/Context;

    move-result-object v0

    const v1, 0x7f1100d0

    const/4 v5, 0x2

    new-array v5, v5, [Ljava/lang/Object;

    iget-object v6, p0, Lcom/ibotta/android/view/earnings/TxLedgerFooterView;->txLedgerData:Lcom/ibotta/android/earnings/TxLedgerData;

    .line 90
    invoke-virtual {v6}, Lcom/ibotta/android/earnings/TxLedgerData;->getRetailerName()Ljava/lang/String;

    move-result-object v6

    aput-object v6, v5, v3

    iget-object v6, p0, Lcom/ibotta/android/view/earnings/TxLedgerFooterView;->txLedgerData:Lcom/ibotta/android/earnings/TxLedgerData;

    invoke-virtual {v6}, Lcom/ibotta/android/earnings/TxLedgerData;->getPendingPeriod()Ljava/lang/String;

    move-result-object v6

    aput-object v6, v5, v4

    .line 89
    invoke-virtual {v0, v1, v5}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 92
    :cond_1
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ibotta/android/App;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v5, 0x7f1100d2

    new-array v4, v4, [Ljava/lang/Object;

    aput-object v0, v4, v3

    invoke-virtual {v1, v5, v4}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 95
    :cond_2
    iget-object v0, p0, Lcom/ibotta/android/view/earnings/TxLedgerFooterView;->txLedgerData:Lcom/ibotta/android/earnings/TxLedgerData;

    invoke-virtual {v0}, Lcom/ibotta/android/earnings/TxLedgerData;->getProcessingStateMessage()Ljava/lang/String;

    move-result-object v0

    .line 98
    :goto_0
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 99
    iget-object v1, p0, Lcom/ibotta/android/view/earnings/TxLedgerFooterView;->tvMessage:Landroid/widget/TextView;

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 101
    :cond_3
    iget-object v1, p0, Lcom/ibotta/android/view/earnings/TxLedgerFooterView;->tvMessage:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private onSetup()V
    .locals 0

    .line 75
    invoke-direct {p0}, Lcom/ibotta/android/view/earnings/TxLedgerFooterView;->initMessage()V

    return-void
.end method


# virtual methods
.method protected onNeedHelpClicked()V
    .locals 1
    .annotation runtime Lbutterknife/OnClick;
        value = {
            0x7f090093
        }
    .end annotation

    .line 106
    iget-object v0, p0, Lcom/ibotta/android/view/earnings/TxLedgerFooterView;->listener:Lcom/ibotta/android/view/earnings/TxLedgerFooterView$TxLedgerFooterListener;

    if-eqz v0, :cond_0

    .line 107
    invoke-interface {v0}, Lcom/ibotta/android/view/earnings/TxLedgerFooterView$TxLedgerFooterListener;->onNeedHelpClicked()V

    :cond_0
    return-void
.end method

.method public setListener(Lcom/ibotta/android/view/earnings/TxLedgerFooterView$TxLedgerFooterListener;)V
    .locals 0

    .line 71
    iput-object p1, p0, Lcom/ibotta/android/view/earnings/TxLedgerFooterView;->listener:Lcom/ibotta/android/view/earnings/TxLedgerFooterView$TxLedgerFooterListener;

    return-void
.end method

.method public setup(Lcom/ibotta/android/earnings/TxLedgerData;)V
    .locals 0

    .line 66
    iput-object p1, p0, Lcom/ibotta/android/view/earnings/TxLedgerFooterView;->txLedgerData:Lcom/ibotta/android/earnings/TxLedgerData;

    .line 67
    invoke-direct {p0}, Lcom/ibotta/android/view/earnings/TxLedgerFooterView;->onSetup()V

    return-void
.end method
