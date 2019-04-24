.class public Lcom/ibotta/android/view/PromptView;
.super Landroid/widget/RelativeLayout;
.source "PromptView.java"


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation


# instance fields
.field private etInput:Landroid/widget/EditText;

.field private llButtons:Landroid/widget/LinearLayout;

.field private tbvTitle:Lcom/ibotta/android/views/base/title/TitleBarView;

.field private tvMessage:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 34
    invoke-direct {p0, p1}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    .line 35
    invoke-direct {p0, p1}, Lcom/ibotta/android/view/PromptView;->inflateContent(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 29
    invoke-direct {p0, p1, p2}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 30
    invoke-direct {p0, p1}, Lcom/ibotta/android/view/PromptView;->inflateContent(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 24
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 25
    invoke-direct {p0, p1}, Lcom/ibotta/android/view/PromptView;->inflateContent(Landroid/content/Context;)V

    return-void
.end method

.method private inflateContent(Landroid/content/Context;)V
    .locals 1

    const-string v0, "layout_inflater"

    .line 72
    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/LayoutInflater;

    const v0, 0x7f0c0199

    .line 73
    invoke-virtual {p1, v0, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    const p1, 0x7f09044d

    .line 74
    invoke-virtual {p0, p1}, Lcom/ibotta/android/view/PromptView;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/views/base/title/TitleBarView;

    iput-object p1, p0, Lcom/ibotta/android/view/PromptView;->tbvTitle:Lcom/ibotta/android/views/base/title/TitleBarView;

    const p1, 0x7f090548

    .line 75
    invoke-virtual {p0, p1}, Lcom/ibotta/android/view/PromptView;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/ibotta/android/view/PromptView;->tvMessage:Landroid/widget/TextView;

    const p1, 0x7f0901cb

    .line 76
    invoke-virtual {p0, p1}, Lcom/ibotta/android/view/PromptView;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/EditText;

    iput-object p1, p0, Lcom/ibotta/android/view/PromptView;->etInput:Landroid/widget/EditText;

    const p1, 0x7f090300

    .line 77
    invoke-virtual {p0, p1}, Lcom/ibotta/android/view/PromptView;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/LinearLayout;

    iput-object p1, p0, Lcom/ibotta/android/view/PromptView;->llButtons:Landroid/widget/LinearLayout;

    return-void
.end method


# virtual methods
.method public addButton(ILandroid/view/View$OnClickListener;)V
    .locals 4

    .line 51
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v1, -0x1

    const/4 v2, -0x2

    invoke-direct {v0, v1, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    const/high16 v1, 0x3f800000    # 1.0f

    .line 53
    iput v1, v0, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    .line 54
    invoke-virtual {p0}, Lcom/ibotta/android/view/PromptView;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f070152

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    iput v1, v0, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    .line 55
    invoke-virtual {p0}, Lcom/ibotta/android/view/PromptView;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f070153

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    iput v1, v0, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    .line 57
    new-instance v1, Landroid/widget/Button;

    invoke-virtual {p0}, Lcom/ibotta/android/view/PromptView;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/widget/Button;-><init>(Landroid/content/Context;)V

    const v2, 0x7f080103

    .line 58
    invoke-virtual {v1, v2}, Landroid/widget/Button;->setBackgroundResource(I)V

    .line 59
    invoke-virtual {p0}, Lcom/ibotta/android/view/PromptView;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f060067

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/widget/Button;->setTextColor(I)V

    .line 60
    invoke-virtual {p0}, Lcom/ibotta/android/view/PromptView;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    .line 61
    invoke-virtual {p0}, Lcom/ibotta/android/view/PromptView;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f0700e4

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v2

    int-to-float v2, v2

    const/4 v3, 0x0

    invoke-virtual {v1, v3, v2}, Landroid/widget/Button;->setTextSize(IF)V

    .line 62
    invoke-virtual {v1}, Landroid/widget/Button;->getTypeface()Landroid/graphics/Typeface;

    move-result-object v2

    const/4 v3, 0x1

    invoke-virtual {v1, v2, v3}, Landroid/widget/Button;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 63
    invoke-virtual {v1, v3}, Landroid/widget/Button;->setLines(I)V

    .line 64
    instance-of v2, v1, Landroid/view/View;

    if-nez v2, :cond_0

    invoke-virtual {v1, p2}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    move-object v2, v1

    check-cast v2, Landroid/view/View;

    invoke-static {v2, p2}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 65
    :goto_0
    invoke-virtual {p0}, Lcom/ibotta/android/view/PromptView;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    const v2, 0x7f0701e3

    invoke-virtual {p2, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p2

    .line 66
    invoke-virtual {v1, p2, p2, p2, p2}, Landroid/widget/Button;->setPadding(IIII)V

    .line 67
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v1, p1}, Landroid/widget/Button;->setTag(Ljava/lang/Object;)V

    .line 68
    iget-object p1, p0, Lcom/ibotta/android/view/PromptView;->llButtons:Landroid/widget/LinearLayout;

    invoke-virtual {p1, v1, v0}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public getInput()Landroid/widget/EditText;
    .locals 1

    .line 47
    iget-object v0, p0, Lcom/ibotta/android/view/PromptView;->etInput:Landroid/widget/EditText;

    return-object v0
.end method

.method public getMessage()Landroid/widget/TextView;
    .locals 1

    .line 43
    iget-object v0, p0, Lcom/ibotta/android/view/PromptView;->tvMessage:Landroid/widget/TextView;

    return-object v0
.end method

.method public getTitle()Lcom/ibotta/android/views/base/title/TitleBarView;
    .locals 1

    .line 39
    iget-object v0, p0, Lcom/ibotta/android/view/PromptView;->tbvTitle:Lcom/ibotta/android/views/base/title/TitleBarView;

    return-object v0
.end method
