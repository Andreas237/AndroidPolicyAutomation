.class public Lcom/ibotta/android/mvp/ui/view/scan/ScanProductsView;
.super Landroid/widget/LinearLayout;
.source "ScanProductsView.java"


# instance fields
.field private countToDisplay:I

.field private countVerified:I

.field protected llProductRows:Landroid/widget/LinearLayout;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f09031f
    .end annotation
.end field

.field private productImageUrl:Ljava/lang/String;

.field private productName:Ljava/lang/String;

.field protected tvScanProgress:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f09056e
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 32
    invoke-direct {p0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 33
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/scan/ScanProductsView;->initLayout()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 37
    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 38
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/scan/ScanProductsView;->initLayout()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 42
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 43
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/scan/ScanProductsView;->initLayout()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 0
    .annotation build Landroid/support/annotation/RequiresApi;
        api = 0x15
    .end annotation

    .line 48
    invoke-direct {p0, p1, p2, p3, p4}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 49
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/scan/ScanProductsView;->initLayout()V

    return-void
.end method

.method private initLayout()V
    .locals 4

    const/4 v0, 0x1

    .line 62
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/scan/ScanProductsView;->setOrientation(I)V

    .line 64
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/scan/ScanProductsView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    const v2, 0x7f0c01c0

    invoke-virtual {v1, v2, p0, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 65
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/view/View;)Lbutterknife/Unbinder;

    .line 67
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/scan/ScanProductsView;->isInEditMode()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "Androidy Flakes"

    const/4 v1, 0x0

    const/4 v2, 0x4

    const/4 v3, 0x2

    .line 68
    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/ibotta/android/mvp/ui/view/scan/ScanProductsView;->setup(Ljava/lang/String;Ljava/lang/String;II)V

    :cond_0
    return-void
.end method

.method private initProductRows()V
    .locals 6

    .line 85
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/scan/ScanProductsView;->llProductRows:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->removeAllViews()V

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 87
    :goto_0
    iget v2, p0, Lcom/ibotta/android/mvp/ui/view/scan/ScanProductsView;->countToDisplay:I

    if-ge v1, v2, :cond_1

    .line 88
    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v3, -0x1

    const/4 v4, -0x2

    invoke-direct {v2, v3, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 91
    new-instance v3, Lcom/ibotta/android/mvp/ui/view/scan/ScanProductView;

    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/scan/ScanProductsView;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-direct {v3, v4}, Lcom/ibotta/android/mvp/ui/view/scan/ScanProductView;-><init>(Landroid/content/Context;)V

    .line 92
    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/view/scan/ScanProductsView;->llProductRows:Landroid/widget/LinearLayout;

    invoke-virtual {v4, v3, v2}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 94
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/view/scan/ScanProductsView;->productName:Ljava/lang/String;

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/view/scan/ScanProductsView;->productImageUrl:Ljava/lang/String;

    iget v5, p0, Lcom/ibotta/android/mvp/ui/view/scan/ScanProductsView;->countVerified:I

    if-ge v1, v5, :cond_0

    const/4 v5, 0x1

    goto :goto_1

    :cond_0
    const/4 v5, 0x0

    :goto_1
    invoke-virtual {v3, v2, v4, v5}, Lcom/ibotta/android/mvp/ui/view/scan/ScanProductView;->setup(Ljava/lang/String;Ljava/lang/String;Z)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method private initScanProgress()V
    .locals 6

    .line 80
    iget v0, p0, Lcom/ibotta/android/mvp/ui/view/scan/ScanProductsView;->countVerified:I

    iget v1, p0, Lcom/ibotta/android/mvp/ui/view/scan/ScanProductsView;->countToDisplay:I

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 81
    :goto_0
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/scan/ScanProductsView;->tvScanProgress:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/scan/ScanProductsView;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f1105b4

    const/4 v4, 0x2

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v4, v5

    iget v0, p0, Lcom/ibotta/android/mvp/ui/view/scan/ScanProductsView;->countToDisplay:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v5, 0x1

    aput-object v0, v4, v5

    invoke-virtual {v2, v3, v4}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private onSetup()V
    .locals 0

    .line 73
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/scan/ScanProductsView;->initScanProgress()V

    .line 74
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/scan/ScanProductsView;->initProductRows()V

    return-void
.end method


# virtual methods
.method public setup(Ljava/lang/String;Ljava/lang/String;II)V
    .locals 0

    .line 53
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/scan/ScanProductsView;->productName:Ljava/lang/String;

    .line 54
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/view/scan/ScanProductsView;->productImageUrl:Ljava/lang/String;

    .line 55
    iput p3, p0, Lcom/ibotta/android/mvp/ui/view/scan/ScanProductsView;->countToDisplay:I

    .line 56
    iput p4, p0, Lcom/ibotta/android/mvp/ui/view/scan/ScanProductsView;->countVerified:I

    .line 58
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/scan/ScanProductsView;->onSetup()V

    return-void
.end method
