.class public Lcom/scandit/barcodepicker/internal/gui/view/SearchBar;
.super Landroid/widget/RelativeLayout;
.source "SearchBar.java"


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "ViewConstructor"
    }
.end annotation


# static fields
.field private static final STATE_SEARCH_NORMAL:Ljava/lang/String; = "normal"


# instance fields
.field private mOnClickListener:Landroid/view/View$OnClickListener;

.field private mSearchButton:Lcom/scandit/base/view/SbImageButton;

.field private mSearchEditText:Landroid/widget/EditText;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 39
    invoke-direct {p0, p1, v0}, Lcom/scandit/barcodepicker/internal/gui/view/SearchBar;-><init>(Landroid/content/Context;Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/view/View$OnClickListener;)V
    .locals 4

    .line 43
    invoke-direct {p0, p1}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    const/4 v0, 0x0

    .line 35
    iput-object v0, p0, Lcom/scandit/barcodepicker/internal/gui/view/SearchBar;->mOnClickListener:Landroid/view/View$OnClickListener;

    .line 45
    iput-object p2, p0, Lcom/scandit/barcodepicker/internal/gui/view/SearchBar;->mOnClickListener:Landroid/view/View$OnClickListener;

    .line 49
    new-instance p2, Lcom/scandit/base/view/SbImageButton;

    invoke-virtual {p0}, Lcom/scandit/barcodepicker/internal/gui/view/SearchBar;->getContext()Landroid/content/Context;

    move-result-object v0

    new-instance v1, Lcom/scandit/base/geometry/SbRectangle;

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v1, v2, v2, v3, v3}, Lcom/scandit/base/geometry/SbRectangle;-><init>(FFII)V

    invoke-direct {p2, v0, v1}, Lcom/scandit/base/view/SbImageButton;-><init>(Landroid/content/Context;Lcom/scandit/base/geometry/SbRectangle;)V

    iput-object p2, p0, Lcom/scandit/barcodepicker/internal/gui/view/SearchBar;->mSearchButton:Lcom/scandit/base/view/SbImageButton;

    .line 50
    iget-object p2, p0, Lcom/scandit/barcodepicker/internal/gui/view/SearchBar;->mSearchButton:Lcom/scandit/base/view/SbImageButton;

    const-string v0, "normal"

    const-string v1, "ic_btn_search"

    const-string v2, "raw"

    .line 51
    invoke-static {p1, v1, v2}, Lcom/scandit/base/system/SbResourceUtils;->getResIdentifier(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)I

    move-result p1

    .line 50
    invoke-virtual {p2, v0, p1}, Lcom/scandit/base/view/SbImageButton;->setResourceIdForState(Ljava/lang/String;I)V

    .line 52
    iget-object p1, p0, Lcom/scandit/barcodepicker/internal/gui/view/SearchBar;->mSearchButton:Lcom/scandit/base/view/SbImageButton;

    const-string p2, "normal"

    invoke-virtual {p1, p2}, Lcom/scandit/base/view/SbImageButton;->setState(Ljava/lang/String;)V

    .line 53
    new-instance p1, Landroid/widget/RelativeLayout$LayoutParams;

    const/4 p2, -0x2

    invoke-direct {p1, v3, p2}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    const/16 v0, 0xb

    .line 54
    invoke-virtual {p1, v0}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 55
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/gui/view/SearchBar;->mSearchButton:Lcom/scandit/base/view/SbImageButton;

    invoke-virtual {p0, v0, p1}, Lcom/scandit/barcodepicker/internal/gui/view/SearchBar;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 56
    iget-object p1, p0, Lcom/scandit/barcodepicker/internal/gui/view/SearchBar;->mSearchButton:Lcom/scandit/base/view/SbImageButton;

    const/16 v0, 0x4d2

    invoke-virtual {p1, v0}, Lcom/scandit/base/view/SbImageButton;->setId(I)V

    .line 57
    iget-object p1, p0, Lcom/scandit/barcodepicker/internal/gui/view/SearchBar;->mSearchButton:Lcom/scandit/base/view/SbImageButton;

    new-instance v0, Lcom/scandit/barcodepicker/internal/gui/view/SearchBar$1;

    invoke-direct {v0, p0}, Lcom/scandit/barcodepicker/internal/gui/view/SearchBar$1;-><init>(Lcom/scandit/barcodepicker/internal/gui/view/SearchBar;)V

    invoke-virtual {p1, v0}, Lcom/scandit/base/view/SbImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 64
    new-instance p1, Landroid/widget/EditText;

    invoke-virtual {p0}, Lcom/scandit/barcodepicker/internal/gui/view/SearchBar;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p1, v0}, Landroid/widget/EditText;-><init>(Landroid/content/Context;)V

    iput-object p1, p0, Lcom/scandit/barcodepicker/internal/gui/view/SearchBar;->mSearchEditText:Landroid/widget/EditText;

    .line 65
    iget-object p1, p0, Lcom/scandit/barcodepicker/internal/gui/view/SearchBar;->mSearchEditText:Landroid/widget/EditText;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroid/widget/EditText;->setLines(I)V

    .line 66
    iget-object p1, p0, Lcom/scandit/barcodepicker/internal/gui/view/SearchBar;->mSearchEditText:Landroid/widget/EditText;

    sget-object v0, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    invoke-virtual {p1, v0}, Landroid/widget/EditText;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 67
    iget-object p1, p0, Lcom/scandit/barcodepicker/internal/gui/view/SearchBar;->mSearchEditText:Landroid/widget/EditText;

    const/4 v0, 0x2

    invoke-virtual {p1, v0}, Landroid/widget/EditText;->setInputType(I)V

    .line 68
    new-instance p1, Landroid/widget/RelativeLayout$LayoutParams;

    invoke-direct {p1, p2, p2}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    const/16 p2, 0x9

    .line 70
    invoke-virtual {p1, p2}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 71
    iget-object p2, p0, Lcom/scandit/barcodepicker/internal/gui/view/SearchBar;->mSearchButton:Lcom/scandit/base/view/SbImageButton;

    invoke-virtual {p2}, Lcom/scandit/base/view/SbImageButton;->getId()I

    move-result p2

    invoke-virtual {p1, v3, p2}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 72
    iget-object p2, p0, Lcom/scandit/barcodepicker/internal/gui/view/SearchBar;->mSearchEditText:Landroid/widget/EditText;

    invoke-virtual {p0, p2, p1}, Lcom/scandit/barcodepicker/internal/gui/view/SearchBar;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 73
    iget-object p1, p0, Lcom/scandit/barcodepicker/internal/gui/view/SearchBar;->mSearchEditText:Landroid/widget/EditText;

    new-instance p2, Lcom/scandit/barcodepicker/internal/gui/view/SearchBar$2;

    invoke-direct {p2, p0}, Lcom/scandit/barcodepicker/internal/gui/view/SearchBar$2;-><init>(Lcom/scandit/barcodepicker/internal/gui/view/SearchBar;)V

    invoke-virtual {p1, p2}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 94
    iget-object p1, p0, Lcom/scandit/barcodepicker/internal/gui/view/SearchBar;->mSearchEditText:Landroid/widget/EditText;

    new-instance p2, Lcom/scandit/barcodepicker/internal/gui/view/SearchBar$3;

    invoke-direct {p2, p0}, Lcom/scandit/barcodepicker/internal/gui/view/SearchBar$3;-><init>(Lcom/scandit/barcodepicker/internal/gui/view/SearchBar;)V

    invoke-virtual {p1, p2}, Landroid/widget/EditText;->setOnKeyListener(Landroid/view/View$OnKeyListener;)V

    return-void
.end method

.method static synthetic access$000(Lcom/scandit/barcodepicker/internal/gui/view/SearchBar;)V
    .locals 0

    .line 29
    invoke-direct {p0}, Lcom/scandit/barcodepicker/internal/gui/view/SearchBar;->onButtonClicked()V

    return-void
.end method

.method static synthetic access$100(Lcom/scandit/barcodepicker/internal/gui/view/SearchBar;)Lcom/scandit/base/view/SbImageButton;
    .locals 0

    .line 29
    iget-object p0, p0, Lcom/scandit/barcodepicker/internal/gui/view/SearchBar;->mSearchButton:Lcom/scandit/base/view/SbImageButton;

    return-object p0
.end method

.method static synthetic access$200(Lcom/scandit/barcodepicker/internal/gui/view/SearchBar;)Landroid/widget/EditText;
    .locals 0

    .line 29
    iget-object p0, p0, Lcom/scandit/barcodepicker/internal/gui/view/SearchBar;->mSearchEditText:Landroid/widget/EditText;

    return-object p0
.end method

.method private onButtonClicked()V
    .locals 3

    .line 109
    invoke-virtual {p0}, Lcom/scandit/barcodepicker/internal/gui/view/SearchBar;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "input_method"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    .line 111
    iget-object v1, p0, Lcom/scandit/barcodepicker/internal/gui/view/SearchBar;->mSearchEditText:Landroid/widget/EditText;

    .line 112
    invoke-virtual {v1}, Landroid/widget/EditText;->getApplicationWindowToken()Landroid/os/IBinder;

    move-result-object v1

    const/4 v2, 0x0

    .line 111
    invoke-virtual {v0, v1, v2}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    .line 114
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/gui/view/SearchBar;->mOnClickListener:Landroid/view/View$OnClickListener;

    if-eqz v0, :cond_0

    .line 115
    iget-object v1, p0, Lcom/scandit/barcodepicker/internal/gui/view/SearchBar;->mSearchButton:Lcom/scandit/base/view/SbImageButton;

    invoke-interface {v0, v1}, Landroid/view/View$OnClickListener;->onClick(Landroid/view/View;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public clear()V
    .locals 2

    .line 131
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/gui/view/SearchBar;->mSearchEditText:Landroid/widget/EditText;

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public getText()Ljava/lang/String;
    .locals 1

    .line 128
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/gui/view/SearchBar;->mSearchEditText:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public setHint(Ljava/lang/String;)V
    .locals 1

    .line 120
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/gui/view/SearchBar;->mSearchEditText:Landroid/widget/EditText;

    invoke-virtual {v0, p1}, Landroid/widget/EditText;->setHint(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public setInputType(I)V
    .locals 1

    .line 124
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/gui/view/SearchBar;->mSearchEditText:Landroid/widget/EditText;

    invoke-virtual {v0, p1}, Landroid/widget/EditText;->setInputType(I)V

    return-void
.end method
