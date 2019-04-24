.class public Lcom/ibotta/android/view/earnings/TxLedgerRowView;
.super Landroid/widget/LinearLayout;
.source "TxLedgerRowView.java"


# instance fields
.field protected ivTxIcon:Landroid/widget/ImageView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0902d0
    .end annotation
.end field

.field protected tvTxAmount:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090590
    .end annotation
.end field

.field protected tvTxTitle:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090591
    .end annotation
.end field

.field protected vIconPadding:Landroid/view/View;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0905b7
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 36
    invoke-direct {p0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 37
    invoke-direct {p0}, Lcom/ibotta/android/view/earnings/TxLedgerRowView;->initLayout()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 41
    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 42
    invoke-direct {p0}, Lcom/ibotta/android/view/earnings/TxLedgerRowView;->initLayout()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 46
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 47
    invoke-direct {p0}, Lcom/ibotta/android/view/earnings/TxLedgerRowView;->initLayout()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 0
    .annotation build Landroid/support/annotation/RequiresApi;
        api = 0x15
    .end annotation

    .line 52
    invoke-direct {p0, p1, p2, p3, p4}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 53
    invoke-direct {p0}, Lcom/ibotta/android/view/earnings/TxLedgerRowView;->initLayout()V

    return-void
.end method

.method private initLayout()V
    .locals 3

    const/4 v0, 0x0

    .line 57
    invoke-virtual {p0, v0}, Lcom/ibotta/android/view/earnings/TxLedgerRowView;->setOrientation(I)V

    const/high16 v0, 0x42c80000    # 100.0f

    .line 58
    invoke-virtual {p0, v0}, Lcom/ibotta/android/view/earnings/TxLedgerRowView;->setWeightSum(F)V

    .line 60
    invoke-virtual {p0}, Lcom/ibotta/android/view/earnings/TxLedgerRowView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f0c01ee

    const/4 v2, 0x1

    invoke-virtual {v0, v1, p0, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 61
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/view/View;)Lbutterknife/Unbinder;

    return-void
.end method


# virtual methods
.method protected getAmountTextColor()I
    .locals 1
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    .line 90
    iget-object v0, p0, Lcom/ibotta/android/view/earnings/TxLedgerRowView;->tvTxAmount:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getCurrentTextColor()I

    move-result v0

    return v0
.end method

.method protected getTitleText()Ljava/lang/String;
    .locals 1
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    .line 95
    iget-object v0, p0, Lcom/ibotta/android/view/earnings/TxLedgerRowView;->tvTxTitle:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected getTitleTextColor()I
    .locals 1
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    .line 85
    iget-object v0, p0, Lcom/ibotta/android/view/earnings/TxLedgerRowView;->tvTxTitle:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getCurrentTextColor()I

    move-result v0

    return v0
.end method

.method public setTextColor(I)V
    .locals 1

    .line 79
    iget-object v0, p0, Lcom/ibotta/android/view/earnings/TxLedgerRowView;->tvTxTitle:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 80
    iget-object v0, p0, Lcom/ibotta/android/view/earnings/TxLedgerRowView;->tvTxAmount:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    return-void
.end method

.method public setup(IILjava/lang/String;)V
    .locals 4

    const/16 v0, 0x8

    const/4 v1, 0x0

    if-lez p1, :cond_0

    .line 66
    iget-object v2, p0, Lcom/ibotta/android/view/earnings/TxLedgerRowView;->ivTxIcon:Landroid/widget/ImageView;

    invoke-virtual {p0}, Lcom/ibotta/android/view/earnings/TxLedgerRowView;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-static {v3, p1}, Landroid/support/v7/content/res/AppCompatResources;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {v2, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 67
    iget-object p1, p0, Lcom/ibotta/android/view/earnings/TxLedgerRowView;->ivTxIcon:Landroid/widget/ImageView;

    invoke-virtual {p1, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 68
    iget-object p1, p0, Lcom/ibotta/android/view/earnings/TxLedgerRowView;->vIconPadding:Landroid/view/View;

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    .line 70
    :cond_0
    iget-object p1, p0, Lcom/ibotta/android/view/earnings/TxLedgerRowView;->vIconPadding:Landroid/view/View;

    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 71
    iget-object p1, p0, Lcom/ibotta/android/view/earnings/TxLedgerRowView;->ivTxIcon:Landroid/widget/ImageView;

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 74
    :goto_0
    iget-object p1, p0, Lcom/ibotta/android/view/earnings/TxLedgerRowView;->tvTxTitle:Landroid/widget/TextView;

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(I)V

    .line 75
    iget-object p1, p0, Lcom/ibotta/android/view/earnings/TxLedgerRowView;->tvTxAmount:Landroid/widget/TextView;

    invoke-virtual {p1, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method
