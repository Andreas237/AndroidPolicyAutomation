.class public Lorg/researchstack/backbone/ui/views/PinCodeLayout;
.super Landroid/widget/RelativeLayout;
.source "PinCodeLayout.java"


# instance fields
.field protected config:Lorg/researchstack/backbone/storage/file/PinCodeConfig;

.field protected editText:Landroid/widget/EditText;

.field protected imm:Landroid/view/inputmethod/InputMethodManager;

.field protected progress:Landroid/view/View;

.field protected summary:Landroid/widget/TextView;

.field protected title:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    .line 32
    invoke-direct {p0, p1}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    .line 33
    invoke-virtual {p0}, Lorg/researchstack/backbone/ui/views/PinCodeLayout;->init()V

    .line 34
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "attrs"    # Landroid/util/AttributeSet;

    .prologue
    .line 38
    invoke-direct {p0, p1, p2}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 39
    invoke-virtual {p0}, Lorg/researchstack/backbone/ui/views/PinCodeLayout;->init()V

    .line 40
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "attrs"    # Landroid/util/AttributeSet;
    .param p3, "defStyleAttr"    # I

    .prologue
    .line 44
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 45
    invoke-virtual {p0}, Lorg/researchstack/backbone/ui/views/PinCodeLayout;->init()V

    .line 46
    return-void
.end method


# virtual methods
.method protected init()V
    .locals 6
    .annotation build Landroid/support/annotation/CallSuper;
    .end annotation

    .prologue
    .line 51
    invoke-static {}, Lorg/researchstack/backbone/StorageAccess;->getInstance()Lorg/researchstack/backbone/StorageAccess;

    move-result-object v3

    invoke-virtual {v3}, Lorg/researchstack/backbone/StorageAccess;->getPinCodeConfig()Lorg/researchstack/backbone/storage/file/PinCodeConfig;

    move-result-object v3

    iput-object v3, p0, Lorg/researchstack/backbone/ui/views/PinCodeLayout;->config:Lorg/researchstack/backbone/storage/file/PinCodeConfig;

    .line 52
    invoke-virtual {p0}, Lorg/researchstack/backbone/ui/views/PinCodeLayout;->getContext()Landroid/content/Context;

    move-result-object v3

    const-string v4, "input_method"

    invoke-virtual {v3, v4}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/view/inputmethod/InputMethodManager;

    iput-object v3, p0, Lorg/researchstack/backbone/ui/views/PinCodeLayout;->imm:Landroid/view/inputmethod/InputMethodManager;

    .line 54
    invoke-virtual {p0}, Lorg/researchstack/backbone/ui/views/PinCodeLayout;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-static {v3}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v3

    sget v4, Lorg/researchstack/backbone/R$layout;->rsb_step_layout_pincode:I

    const/4 v5, 0x1

    invoke-virtual {v3, v4, p0, v5}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 56
    sget v3, Lorg/researchstack/backbone/R$id;->title:I

    invoke-virtual {p0, v3}, Lorg/researchstack/backbone/ui/views/PinCodeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    iput-object v3, p0, Lorg/researchstack/backbone/ui/views/PinCodeLayout;->title:Landroid/widget/TextView;

    .line 57
    iget-object v3, p0, Lorg/researchstack/backbone/ui/views/PinCodeLayout;->title:Landroid/widget/TextView;

    sget v4, Lorg/researchstack/backbone/R$string;->rsb_pincode_enter_title:I

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(I)V

    .line 59
    invoke-virtual {p0}, Lorg/researchstack/backbone/ui/views/PinCodeLayout;->resetSummaryText()V

    .line 61
    sget v3, Lorg/researchstack/backbone/R$id;->pincode:I

    invoke-virtual {p0, v3}, Lorg/researchstack/backbone/ui/views/PinCodeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/EditText;

    iput-object v3, p0, Lorg/researchstack/backbone/ui/views/PinCodeLayout;->editText:Landroid/widget/EditText;

    .line 62
    iget-object v3, p0, Lorg/researchstack/backbone/ui/views/PinCodeLayout;->editText:Landroid/widget/EditText;

    invoke-virtual {v3}, Landroid/widget/EditText;->requestFocus()Z

    .line 64
    iget-object v3, p0, Lorg/researchstack/backbone/ui/views/PinCodeLayout;->config:Lorg/researchstack/backbone/storage/file/PinCodeConfig;

    invoke-virtual {v3}, Lorg/researchstack/backbone/storage/file/PinCodeConfig;->getPinType()Lorg/researchstack/backbone/storage/file/PinCodeConfig$Type;

    move-result-object v2

    .line 65
    .local v2, "pinType":Lorg/researchstack/backbone/storage/file/PinCodeConfig$Type;
    iget-object v3, p0, Lorg/researchstack/backbone/ui/views/PinCodeLayout;->editText:Landroid/widget/EditText;

    invoke-interface {v2}, Lorg/researchstack/backbone/storage/file/PinCodeConfig$Type;->getInputType()I

    move-result v4

    const/4 v5, 0x0

    invoke-interface {v2, v5}, Lorg/researchstack/backbone/storage/file/PinCodeConfig$Type;->getVisibleVariationType(Z)I

    move-result v5

    or-int/2addr v4, v5

    invoke-virtual {v3, v4}, Landroid/widget/EditText;->setInputType(I)V

    .line 67
    iget-object v3, p0, Lorg/researchstack/backbone/ui/views/PinCodeLayout;->config:Lorg/researchstack/backbone/storage/file/PinCodeConfig;

    invoke-virtual {v3}, Lorg/researchstack/backbone/storage/file/PinCodeConfig;->getPinLength()I

    move-result v3

    new-array v0, v3, [C

    .line 68
    .local v0, "chars":[C
    const/16 v3, 0x25e6

    invoke-static {v0, v3}, Ljava/util/Arrays;->fill([CC)V

    .line 69
    iget-object v3, p0, Lorg/researchstack/backbone/ui/views/PinCodeLayout;->editText:Landroid/widget/EditText;

    new-instance v4, Ljava/lang/String;

    invoke-direct {v4, v0}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v3, v4}, Landroid/widget/EditText;->setHint(Ljava/lang/CharSequence;)V

    .line 71
    iget-object v3, p0, Lorg/researchstack/backbone/ui/views/PinCodeLayout;->editText:Landroid/widget/EditText;

    invoke-virtual {v3}, Landroid/widget/EditText;->getFilters()[Landroid/text/InputFilter;

    move-result-object v3

    new-instance v4, Landroid/text/InputFilter$LengthFilter;

    iget-object v5, p0, Lorg/researchstack/backbone/ui/views/PinCodeLayout;->config:Lorg/researchstack/backbone/storage/file/PinCodeConfig;

    .line 72
    invoke-virtual {v5}, Lorg/researchstack/backbone/storage/file/PinCodeConfig;->getPinLength()I

    move-result v5

    invoke-direct {v4, v5}, Landroid/text/InputFilter$LengthFilter;-><init>(I)V

    .line 71
    invoke-static {v3, v4}, Lorg/researchstack/backbone/utils/ViewUtils;->addFilter([Landroid/text/InputFilter;Landroid/text/InputFilter;)[Landroid/text/InputFilter;

    move-result-object v1

    .line 73
    .local v1, "filters":[Landroid/text/InputFilter;
    iget-object v3, p0, Lorg/researchstack/backbone/ui/views/PinCodeLayout;->config:Lorg/researchstack/backbone/storage/file/PinCodeConfig;

    invoke-virtual {v3}, Lorg/researchstack/backbone/storage/file/PinCodeConfig;->getPinType()Lorg/researchstack/backbone/storage/file/PinCodeConfig$Type;

    move-result-object v3

    invoke-interface {v3}, Lorg/researchstack/backbone/storage/file/PinCodeConfig$Type;->getInputFilter()Landroid/text/InputFilter;

    move-result-object v3

    invoke-static {v1, v3}, Lorg/researchstack/backbone/utils/ViewUtils;->addFilter([Landroid/text/InputFilter;Landroid/text/InputFilter;)[Landroid/text/InputFilter;

    move-result-object v1

    .line 74
    iget-object v3, p0, Lorg/researchstack/backbone/ui/views/PinCodeLayout;->editText:Landroid/widget/EditText;

    invoke-virtual {v3, v1}, Landroid/widget/EditText;->setFilters([Landroid/text/InputFilter;)V

    .line 76
    sget v3, Lorg/researchstack/backbone/R$id;->progress:I

    invoke-virtual {p0, v3}, Lorg/researchstack/backbone/ui/views/PinCodeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v3

    iput-object v3, p0, Lorg/researchstack/backbone/ui/views/PinCodeLayout;->progress:Landroid/view/View;

    .line 77
    return-void
.end method

.method public resetSummaryText()V
    .locals 7

    .prologue
    .line 81
    sget v2, Lorg/researchstack/backbone/R$id;->text:I

    invoke-virtual {p0, v2}, Lorg/researchstack/backbone/ui/views/PinCodeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    iput-object v2, p0, Lorg/researchstack/backbone/ui/views/PinCodeLayout;->summary:Landroid/widget/TextView;

    .line 82
    invoke-virtual {p0}, Lorg/researchstack/backbone/ui/views/PinCodeLayout;->getContext()Landroid/content/Context;

    move-result-object v2

    iget-object v3, p0, Lorg/researchstack/backbone/ui/views/PinCodeLayout;->config:Lorg/researchstack/backbone/storage/file/PinCodeConfig;

    invoke-virtual {v3}, Lorg/researchstack/backbone/storage/file/PinCodeConfig;->getPinType()Lorg/researchstack/backbone/storage/file/PinCodeConfig$Type;

    move-result-object v3

    invoke-interface {v3}, Lorg/researchstack/backbone/storage/file/PinCodeConfig$Type;->getInputTypeStringId()I

    move-result v3

    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 83
    .local v0, "characterType":Ljava/lang/String;
    invoke-virtual {p0}, Lorg/researchstack/backbone/ui/views/PinCodeLayout;->getContext()Landroid/content/Context;

    move-result-object v2

    sget v3, Lorg/researchstack/backbone/R$string;->rsb_pincode_enter_summary:I

    const/4 v4, 0x2

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    iget-object v6, p0, Lorg/researchstack/backbone/ui/views/PinCodeLayout;->config:Lorg/researchstack/backbone/storage/file/PinCodeConfig;

    .line 84
    invoke-virtual {v6}, Lorg/researchstack/backbone/storage/file/PinCodeConfig;->getPinLength()I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v4, v5

    const/4 v5, 0x1

    aput-object v0, v4, v5

    .line 83
    invoke-virtual {v2, v3, v4}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 86
    .local v1, "pinCodeInstructions":Ljava/lang/String;
    iget-object v2, p0, Lorg/researchstack/backbone/ui/views/PinCodeLayout;->summary:Landroid/widget/TextView;

    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 87
    return-void
.end method

.method public showProgress(Z)V
    .locals 2
    .param p1, "show"    # Z

    .prologue
    .line 91
    iget-object v1, p0, Lorg/researchstack/backbone/ui/views/PinCodeLayout;->progress:Landroid/view/View;

    if-eqz p1, :cond_0

    const/4 v0, 0x0

    :goto_0
    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 92
    return-void

    .line 91
    :cond_0
    const/16 v0, 0x8

    goto :goto_0
.end method
