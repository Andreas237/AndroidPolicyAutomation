.class public Lcom/ibotta/android/view/redeem/RedeemInstructionView;
.super Landroid/widget/LinearLayout;
.source "RedeemInstructionView.java"


# instance fields
.field private instructionHtml:Ljava/lang/String;

.field private number:I

.field protected tvInstruction:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090533
    .end annotation
.end field

.field protected tvNumber:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090552
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 30
    invoke-direct {p0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 31
    invoke-direct {p0}, Lcom/ibotta/android/view/redeem/RedeemInstructionView;->initLayout()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 35
    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 36
    invoke-direct {p0}, Lcom/ibotta/android/view/redeem/RedeemInstructionView;->initLayout()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 40
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 41
    invoke-direct {p0}, Lcom/ibotta/android/view/redeem/RedeemInstructionView;->initLayout()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 0
    .annotation build Landroid/support/annotation/RequiresApi;
        api = 0x15
    .end annotation

    .line 46
    invoke-direct {p0, p1, p2, p3, p4}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 47
    invoke-direct {p0}, Lcom/ibotta/android/view/redeem/RedeemInstructionView;->initLayout()V

    return-void
.end method

.method private initInstruction()V
    .locals 3

    .line 75
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x18

    if-lt v0, v1, :cond_0

    .line 76
    iget-object v0, p0, Lcom/ibotta/android/view/redeem/RedeemInstructionView;->tvInstruction:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/ibotta/android/view/redeem/RedeemInstructionView;->instructionHtml:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-static {v1, v2}, Landroid/text/Html;->fromHtml(Ljava/lang/String;I)Landroid/text/Spanned;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 78
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/view/redeem/RedeemInstructionView;->tvInstruction:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/ibotta/android/view/redeem/RedeemInstructionView;->instructionHtml:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/Html;->fromHtml(Ljava/lang/String;)Landroid/text/Spanned;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :goto_0
    return-void
.end method

.method private initLayout()V
    .locals 3

    const/4 v0, 0x0

    .line 58
    invoke-virtual {p0, v0}, Lcom/ibotta/android/view/redeem/RedeemInstructionView;->setOrientation(I)V

    const/high16 v0, 0x42c80000    # 100.0f

    .line 59
    invoke-virtual {p0, v0}, Lcom/ibotta/android/view/redeem/RedeemInstructionView;->setWeightSum(F)V

    .line 61
    invoke-virtual {p0}, Lcom/ibotta/android/view/redeem/RedeemInstructionView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f0c01b1

    const/4 v2, 0x1

    invoke-virtual {v0, v1, p0, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 62
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/view/View;)Lbutterknife/Unbinder;

    return-void
.end method

.method private initNumber()V
    .locals 2

    .line 71
    iget-object v0, p0, Lcom/ibotta/android/view/redeem/RedeemInstructionView;->tvNumber:Landroid/widget/TextView;

    iget v1, p0, Lcom/ibotta/android/view/redeem/RedeemInstructionView;->number:I

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private onSetup()V
    .locals 0

    .line 66
    invoke-direct {p0}, Lcom/ibotta/android/view/redeem/RedeemInstructionView;->initNumber()V

    .line 67
    invoke-direct {p0}, Lcom/ibotta/android/view/redeem/RedeemInstructionView;->initInstruction()V

    return-void
.end method


# virtual methods
.method public setup(ILjava/lang/String;)V
    .locals 0

    .line 51
    iput p1, p0, Lcom/ibotta/android/view/redeem/RedeemInstructionView;->number:I

    .line 52
    iput-object p2, p0, Lcom/ibotta/android/view/redeem/RedeemInstructionView;->instructionHtml:Ljava/lang/String;

    .line 54
    invoke-direct {p0}, Lcom/ibotta/android/view/redeem/RedeemInstructionView;->onSetup()V

    return-void
.end method
