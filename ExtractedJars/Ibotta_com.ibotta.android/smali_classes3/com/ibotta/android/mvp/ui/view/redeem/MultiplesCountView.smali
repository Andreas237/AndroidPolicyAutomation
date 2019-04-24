.class public Lcom/ibotta/android/mvp/ui/view/redeem/MultiplesCountView;
.super Landroid/widget/LinearLayout;
.source "MultiplesCountView.java"


# instance fields
.field private count:I

.field protected tvCount:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f09050f
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 26
    invoke-direct {p0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 27
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/redeem/MultiplesCountView;->initLayout()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 31
    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 32
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/redeem/MultiplesCountView;->initLayout()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 36
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 37
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/redeem/MultiplesCountView;->initLayout()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 0
    .annotation build Landroid/support/annotation/RequiresApi;
        api = 0x15
    .end annotation

    .line 42
    invoke-direct {p0, p1, p2, p3, p4}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 43
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/redeem/MultiplesCountView;->initLayout()V

    return-void
.end method

.method private initBackground()V
    .locals 1

    const v0, 0x7f080103

    .line 69
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/redeem/MultiplesCountView;->setBackgroundResource(I)V

    return-void
.end method

.method private initLayout()V
    .locals 3

    const/4 v0, 0x0

    .line 53
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/redeem/MultiplesCountView;->setOrientation(I)V

    const/4 v1, 0x1

    .line 54
    invoke-virtual {p0, v1}, Lcom/ibotta/android/mvp/ui/view/redeem/MultiplesCountView;->setClickable(Z)V

    .line 55
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/redeem/MultiplesCountView;->setFocusable(Z)V

    .line 57
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/redeem/MultiplesCountView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v2, 0x7f0c017b

    invoke-virtual {v0, v2, p0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 58
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/view/View;)Lbutterknife/Unbinder;

    .line 60
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/redeem/MultiplesCountView;->initBackground()V

    .line 61
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/redeem/MultiplesCountView;->initPadding()V

    .line 63
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/redeem/MultiplesCountView;->isInEditMode()Z

    move-result v0

    if-eqz v0, :cond_0

    const/16 v0, 0x63

    .line 64
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/redeem/MultiplesCountView;->setCount(I)V

    :cond_0
    return-void
.end method

.method private initPadding()V
    .locals 3

    .line 73
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/redeem/MultiplesCountView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f0701b0

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    .line 74
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/redeem/MultiplesCountView;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0701c4

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    .line 76
    invoke-virtual {p0, v0, v1, v0, v1}, Lcom/ibotta/android/mvp/ui/view/redeem/MultiplesCountView;->setPadding(IIII)V

    return-void
.end method

.method private onCountSet()V
    .locals 2

    .line 80
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/redeem/MultiplesCountView;->tvCount:Landroid/widget/TextView;

    iget v1, p0, Lcom/ibotta/android/mvp/ui/view/redeem/MultiplesCountView;->count:I

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method


# virtual methods
.method public setCount(I)V
    .locals 0

    .line 47
    iput p1, p0, Lcom/ibotta/android/mvp/ui/view/redeem/MultiplesCountView;->count:I

    .line 49
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/redeem/MultiplesCountView;->onCountSet()V

    return-void
.end method
