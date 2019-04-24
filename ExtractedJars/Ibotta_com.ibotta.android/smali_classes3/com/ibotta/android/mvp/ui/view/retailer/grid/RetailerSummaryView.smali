.class public Lcom/ibotta/android/mvp/ui/view/retailer/grid/RetailerSummaryView;
.super Landroid/widget/LinearLayout;
.source "RetailerSummaryView.java"


# instance fields
.field private rebateCount:I

.field protected tvRebateCount:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090565
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 27
    invoke-direct {p0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 28
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/retailer/grid/RetailerSummaryView;->initLayout()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 32
    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 33
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/retailer/grid/RetailerSummaryView;->initLayout()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 37
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 38
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/retailer/grid/RetailerSummaryView;->initLayout()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 0
    .annotation build Landroid/support/annotation/RequiresApi;
        api = 0x15
    .end annotation

    .line 43
    invoke-direct {p0, p1, p2, p3, p4}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 44
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/retailer/grid/RetailerSummaryView;->initLayout()V

    return-void
.end method

.method private initLayout()V
    .locals 3

    const/4 v0, 0x0

    .line 53
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/retailer/grid/RetailerSummaryView;->setOrientation(I)V

    const v0, 0x7f0801e9

    .line 54
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/retailer/grid/RetailerSummaryView;->setBackgroundResource(I)V

    .line 56
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/retailer/grid/RetailerSummaryView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f0c01bd

    const/4 v2, 0x1

    invoke-virtual {v0, v1, p0, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 57
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/view/View;)Lbutterknife/Unbinder;

    return-void
.end method

.method private onRetailerCountSet()V
    .locals 5

    .line 61
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/retailer/grid/RetailerSummaryView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    iget v1, p0, Lcom/ibotta/android/mvp/ui/view/retailer/grid/RetailerSummaryView;->rebateCount:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    .line 62
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const v3, 0x7f0f0005

    .line 61
    invoke-virtual {v0, v3, v1, v2}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 63
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/retailer/grid/RetailerSummaryView;->tvRebateCount:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method


# virtual methods
.method public setRebateCount(I)V
    .locals 0

    .line 48
    iput p1, p0, Lcom/ibotta/android/mvp/ui/view/retailer/grid/RetailerSummaryView;->rebateCount:I

    .line 49
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/retailer/grid/RetailerSummaryView;->onRetailerCountSet()V

    return-void
.end method
