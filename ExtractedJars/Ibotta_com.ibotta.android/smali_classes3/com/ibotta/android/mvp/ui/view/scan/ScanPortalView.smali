.class public Lcom/ibotta/android/mvp/ui/view/scan/ScanPortalView;
.super Landroid/widget/LinearLayout;
.source "ScanPortalView.java"


# instance fields
.field protected tvScanTip:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f09056f
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 27
    invoke-direct {p0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 28
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/scan/ScanPortalView;->initLayout()V

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
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/scan/ScanPortalView;->initLayout()V

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
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/scan/ScanPortalView;->initLayout()V

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
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/scan/ScanPortalView;->initLayout()V

    return-void
.end method

.method private initLayout()V
    .locals 3

    const/4 v0, 0x1

    .line 53
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/scan/ScanPortalView;->setOrientation(I)V

    const/high16 v1, 0x42c80000    # 100.0f

    .line 54
    invoke-virtual {p0, v1}, Lcom/ibotta/android/mvp/ui/view/scan/ScanPortalView;->setWeightSum(F)V

    .line 56
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/scan/ScanPortalView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    const v2, 0x7f0c01be

    invoke-virtual {v1, v2, p0, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 57
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/view/View;)Lbutterknife/Unbinder;

    return-void
.end method


# virtual methods
.method public setScanTip(Ljava/lang/String;)V
    .locals 1

    .line 48
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/scan/ScanPortalView;->tvScanTip:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 49
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/scan/ScanPortalView;->tvScanTip:Landroid/widget/TextView;

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/16 p1, 0x8

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setVisibility(I)V

    return-void
.end method
