.class public Lcom/ibotta/android/mvp/ui/view/dialog/BottomSheetOptionView;
.super Landroid/widget/LinearLayout;
.source "BottomSheetOptionView.java"


# instance fields
.field private iconResId:I

.field protected ivIcon:Landroid/widget/ImageView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0902ac
    .end annotation
.end field

.field private optionText:Ljava/lang/String;

.field protected tvOption:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090556
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 34
    invoke-direct {p0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 35
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/dialog/BottomSheetOptionView;->initLayout()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 39
    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 40
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/dialog/BottomSheetOptionView;->initLayout()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 44
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 45
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/dialog/BottomSheetOptionView;->initLayout()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 0
    .annotation build Landroid/support/annotation/RequiresApi;
        api = 0x15
    .end annotation

    .line 50
    invoke-direct {p0, p1, p2, p3, p4}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 51
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/dialog/BottomSheetOptionView;->initLayout()V

    return-void
.end method

.method private initIcon()V
    .locals 2

    .line 82
    iget v0, p0, Lcom/ibotta/android/mvp/ui/view/dialog/BottomSheetOptionView;->iconResId:I

    if-lez v0, :cond_0

    .line 83
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/dialog/BottomSheetOptionView;->ivIcon:Landroid/widget/ImageView;

    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 84
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/dialog/BottomSheetOptionView;->ivIcon:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_0

    .line 86
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/dialog/BottomSheetOptionView;->ivIcon:Landroid/widget/ImageView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    :goto_0
    return-void
.end method

.method private initLayout()V
    .locals 3

    const/4 v0, 0x0

    .line 62
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/dialog/BottomSheetOptionView;->setOrientation(I)V

    const/high16 v1, 0x42c80000    # 100.0f

    .line 63
    invoke-virtual {p0, v1}, Lcom/ibotta/android/mvp/ui/view/dialog/BottomSheetOptionView;->setWeightSum(F)V

    const/4 v1, 0x1

    .line 64
    invoke-virtual {p0, v1}, Lcom/ibotta/android/mvp/ui/view/dialog/BottomSheetOptionView;->setClickable(Z)V

    .line 65
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/dialog/BottomSheetOptionView;->setFocusable(Z)V

    .line 66
    invoke-static {p0, v0}, Lcom/ibotta/android/views/util/IbottaViewsUtilKt;->enableForegroundRipple(Landroid/view/View;Z)V

    .line 68
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/dialog/BottomSheetOptionView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v2, 0x7f0c0122

    invoke-virtual {v0, v2, p0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 69
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/view/View;)Lbutterknife/Unbinder;

    .line 71
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/dialog/BottomSheetOptionView;->isInEditMode()Z

    move-result v0

    if-eqz v0, :cond_0

    const v0, 0x7f0800aa

    .line 72
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/dialog/BottomSheetOptionView;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f1101a9

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/ibotta/android/mvp/ui/view/dialog/BottomSheetOptionView;->setup(ILjava/lang/String;)V

    :cond_0
    return-void
.end method

.method private initOptionText()V
    .locals 2

    .line 91
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/dialog/BottomSheetOptionView;->tvOption:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/dialog/BottomSheetOptionView;->optionText:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private onSetup()V
    .locals 0

    .line 77
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/dialog/BottomSheetOptionView;->initIcon()V

    .line 78
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/dialog/BottomSheetOptionView;->initOptionText()V

    return-void
.end method


# virtual methods
.method public setup(ILjava/lang/String;)V
    .locals 0

    .line 55
    iput p1, p0, Lcom/ibotta/android/mvp/ui/view/dialog/BottomSheetOptionView;->iconResId:I

    .line 56
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/view/dialog/BottomSheetOptionView;->optionText:Ljava/lang/String;

    .line 58
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/dialog/BottomSheetOptionView;->onSetup()V

    return-void
.end method
