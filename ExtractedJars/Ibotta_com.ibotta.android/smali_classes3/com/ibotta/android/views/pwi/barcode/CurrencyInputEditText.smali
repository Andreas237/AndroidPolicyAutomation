.class public final Lcom/ibotta/android/views/pwi/barcode/CurrencyInputEditText;
.super Landroid/support/v7/widget/AppCompatEditText;
.source "CurrencyInputEditText.kt"

# interfaces
.implements Lcom/ibotta/android/views/components/ViewComponent;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/support/v7/widget/AppCompatEditText;",
        "Lcom/ibotta/android/views/components/ViewComponent<",
        "Lcom/ibotta/android/views/components/NoViewState;",
        "Lcom/ibotta/android/views/components/NoViewEvents;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u000c\u0018\u00002\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002B%\u0008\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0004H\u0016J\u0008\u0010\u0017\u001a\u00020\u0015H\u0002J\u0008\u0010\u0018\u001a\u00020\u0015H\u0002J\u0008\u0010\u0019\u001a\u00020\u0015H\u0002J\u0018\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\nH\u0014J\u0010\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u0010H\u0002J\u0010\u0010\u001f\u001a\u00020\u00152\u0006\u0010 \u001a\u00020\u0003H\u0016R\u0016\u0010\u000c\u001a\n \u000e*\u0004\u0018\u00010\r0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"
    }
    d2 = {
        "Lcom/ibotta/android/views/pwi/barcode/CurrencyInputEditText;",
        "Landroid/support/v7/widget/AppCompatEditText;",
        "Lcom/ibotta/android/views/components/ViewComponent;",
        "Lcom/ibotta/android/views/components/NoViewState;",
        "Lcom/ibotta/android/views/components/NoViewEvents;",
        "context",
        "Landroid/content/Context;",
        "attrs",
        "Landroid/util/AttributeSet;",
        "defStyleAttr",
        "",
        "(Landroid/content/Context;Landroid/util/AttributeSet;I)V",
        "PATTERN",
        "Ljava/util/regex/Pattern;",
        "kotlin.jvm.PlatformType",
        "beforeChangedText",
        "",
        "currentChar",
        "",
        "rawCurrencyInputInCents",
        "bindViewEvents",
        "",
        "viewEvents",
        "initCurrencyBehavior",
        "initFilter",
        "initHintFilter",
        "onSelectionChanged",
        "selStart",
        "selEnd",
        "parseForValidInputAndSetAccordingly",
        "currentInput",
        "updateViewState",
        "viewState",
        "ibotta-views_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# instance fields
.field private final PATTERN:Ljava/util/regex/Pattern;

.field private _$_findViewCache:Ljava/util/HashMap;

.field private beforeChangedText:Ljava/lang/CharSequence;

.field private currentChar:Ljava/lang/String;

.field private rawCurrencyInputInCents:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 6
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x6

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    invoke-direct/range {v0 .. v5}, Lcom/ibotta/android/views/pwi/barcode/CurrencyInputEditText;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 6
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const/4 v3, 0x0

    const/4 v4, 0x4

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    invoke-direct/range {v0 .. v5}, Lcom/ibotta/android/views/pwi/barcode/CurrencyInputEditText;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    invoke-direct {p0, p1, p2, p3}, Landroid/support/v7/widget/AppCompatEditText;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const-string p1, "^(\\$\\s)?\\d{0,6}(\\.\\d{0,2})?"

    .line 21
    invoke-static {p1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/views/pwi/barcode/CurrencyInputEditText;->PATTERN:Ljava/util/regex/Pattern;

    const-string p1, ""

    .line 22
    check-cast p1, Ljava/lang/CharSequence;

    iput-object p1, p0, Lcom/ibotta/android/views/pwi/barcode/CurrencyInputEditText;->beforeChangedText:Ljava/lang/CharSequence;

    const-string p1, ""

    .line 23
    iput-object p1, p0, Lcom/ibotta/android/views/pwi/barcode/CurrencyInputEditText;->rawCurrencyInputInCents:Ljava/lang/String;

    const-string p1, ""

    .line 24
    iput-object p1, p0, Lcom/ibotta/android/views/pwi/barcode/CurrencyInputEditText;->currentChar:Ljava/lang/String;

    .line 27
    invoke-direct {p0}, Lcom/ibotta/android/views/pwi/barcode/CurrencyInputEditText;->initHintFilter()V

    .line 28
    invoke-direct {p0}, Lcom/ibotta/android/views/pwi/barcode/CurrencyInputEditText;->initCurrencyBehavior()V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    const/4 p2, 0x0

    .line 17
    check-cast p2, Landroid/util/AttributeSet;

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    .line 18
    sget p3, Landroid/support/design/R$attr;->editTextStyle:I

    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/ibotta/android/views/pwi/barcode/CurrencyInputEditText;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public static final synthetic access$getBeforeChangedText$p(Lcom/ibotta/android/views/pwi/barcode/CurrencyInputEditText;)Ljava/lang/CharSequence;
    .locals 0

    .line 15
    iget-object p0, p0, Lcom/ibotta/android/views/pwi/barcode/CurrencyInputEditText;->beforeChangedText:Ljava/lang/CharSequence;

    return-object p0
.end method

.method public static final synthetic access$getCurrentChar$p(Lcom/ibotta/android/views/pwi/barcode/CurrencyInputEditText;)Ljava/lang/String;
    .locals 0

    .line 15
    iget-object p0, p0, Lcom/ibotta/android/views/pwi/barcode/CurrencyInputEditText;->currentChar:Ljava/lang/String;

    return-object p0
.end method

.method public static final synthetic access$getRawCurrencyInputInCents$p(Lcom/ibotta/android/views/pwi/barcode/CurrencyInputEditText;)Ljava/lang/String;
    .locals 0

    .line 15
    iget-object p0, p0, Lcom/ibotta/android/views/pwi/barcode/CurrencyInputEditText;->rawCurrencyInputInCents:Ljava/lang/String;

    return-object p0
.end method

.method public static final synthetic access$initFilter(Lcom/ibotta/android/views/pwi/barcode/CurrencyInputEditText;)V
    .locals 0

    .line 15
    invoke-direct {p0}, Lcom/ibotta/android/views/pwi/barcode/CurrencyInputEditText;->initFilter()V

    return-void
.end method

.method public static final synthetic access$parseForValidInputAndSetAccordingly(Lcom/ibotta/android/views/pwi/barcode/CurrencyInputEditText;Ljava/lang/CharSequence;)V
    .locals 0

    .line 15
    invoke-direct {p0, p1}, Lcom/ibotta/android/views/pwi/barcode/CurrencyInputEditText;->parseForValidInputAndSetAccordingly(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public static final synthetic access$setBeforeChangedText$p(Lcom/ibotta/android/views/pwi/barcode/CurrencyInputEditText;Ljava/lang/CharSequence;)V
    .locals 0

    .line 15
    iput-object p1, p0, Lcom/ibotta/android/views/pwi/barcode/CurrencyInputEditText;->beforeChangedText:Ljava/lang/CharSequence;

    return-void
.end method

.method public static final synthetic access$setCurrentChar$p(Lcom/ibotta/android/views/pwi/barcode/CurrencyInputEditText;Ljava/lang/String;)V
    .locals 0

    .line 15
    iput-object p1, p0, Lcom/ibotta/android/views/pwi/barcode/CurrencyInputEditText;->currentChar:Ljava/lang/String;

    return-void
.end method

.method public static final synthetic access$setRawCurrencyInputInCents$p(Lcom/ibotta/android/views/pwi/barcode/CurrencyInputEditText;Ljava/lang/String;)V
    .locals 0

    .line 15
    iput-object p1, p0, Lcom/ibotta/android/views/pwi/barcode/CurrencyInputEditText;->rawCurrencyInputInCents:Ljava/lang/String;

    return-void
.end method

.method private final initCurrencyBehavior()V
    .locals 1

    const/4 v0, 0x2

    .line 41
    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/pwi/barcode/CurrencyInputEditText;->setInputType(I)V

    const/4 v0, 0x0

    .line 42
    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/pwi/barcode/CurrencyInputEditText;->setLongClickable(Z)V

    return-void
.end method

.method private final initFilter()V
    .locals 1

    .line 46
    new-instance v0, Lcom/ibotta/android/views/pwi/barcode/CurrencyInputEditText$initFilter$1;

    invoke-direct {v0, p0}, Lcom/ibotta/android/views/pwi/barcode/CurrencyInputEditText$initFilter$1;-><init>(Lcom/ibotta/android/views/pwi/barcode/CurrencyInputEditText;)V

    check-cast v0, Landroid/text/TextWatcher;

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/pwi/barcode/CurrencyInputEditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    return-void
.end method

.method private final initHintFilter()V
    .locals 1

    .line 34
    new-instance v0, Lcom/ibotta/android/views/pwi/barcode/CurrencyInputEditText$initHintFilter$1;

    invoke-direct {v0, p0}, Lcom/ibotta/android/views/pwi/barcode/CurrencyInputEditText$initHintFilter$1;-><init>(Lcom/ibotta/android/views/pwi/barcode/CurrencyInputEditText;)V

    check-cast v0, Landroid/view/View$OnFocusChangeListener;

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/pwi/barcode/CurrencyInputEditText;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    return-void
.end method

.method private final parseForValidInputAndSetAccordingly(Ljava/lang/CharSequence;)V
    .locals 2

    .line 76
    iget-object v0, p0, Lcom/ibotta/android/views/pwi/barcode/CurrencyInputEditText;->PATTERN:Ljava/util/regex/Pattern;

    invoke-virtual {v0, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    .line 78
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->matches()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/views/pwi/barcode/CurrencyInputEditText;->beforeChangedText:Ljava/lang/CharSequence;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_1

    .line 79
    iget-object p1, p0, Lcom/ibotta/android/views/pwi/barcode/CurrencyInputEditText;->beforeChangedText:Ljava/lang/CharSequence;

    .line 80
    invoke-virtual {p0, p1}, Lcom/ibotta/android/views/pwi/barcode/CurrencyInputEditText;->setText(Ljava/lang/CharSequence;)V

    .line 81
    invoke-virtual {p0}, Lcom/ibotta/android/views/pwi/barcode/CurrencyInputEditText;->getText()Landroid/text/Editable;

    move-result-object p1

    if-nez p1, :cond_0

    invoke-static {}, Lkotlin/jvm/internal/Intrinsics;->throwNpe()V

    :cond_0
    invoke-interface {p1}, Landroid/text/Editable;->length()I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/ibotta/android/views/pwi/barcode/CurrencyInputEditText;->setSelection(I)V

    goto :goto_0

    .line 83
    :cond_1
    iget-object v0, p0, Lcom/ibotta/android/views/pwi/barcode/CurrencyInputEditText;->rawCurrencyInputInCents:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lcom/ibotta/android/views/pwi/barcode/CurrencyInputEditText;->currentChar:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/views/pwi/barcode/CurrencyInputEditText;->rawCurrencyInputInCents:Ljava/lang/String;

    .line 84
    invoke-virtual {p0, p1}, Lcom/ibotta/android/views/pwi/barcode/CurrencyInputEditText;->setText(Ljava/lang/CharSequence;)V

    :goto_0
    return-void
.end method


# virtual methods
.method public _$_clearFindViewByIdCache()V
    .locals 1

    iget-object v0, p0, Lcom/ibotta/android/views/pwi/barcode/CurrencyInputEditText;->_$_findViewCache:Ljava/util/HashMap;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    :cond_0
    return-void
.end method

.method public _$_findCachedViewById(I)Landroid/view/View;
    .locals 2

    iget-object v0, p0, Lcom/ibotta/android/views/pwi/barcode/CurrencyInputEditText;->_$_findViewCache:Ljava/util/HashMap;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/views/pwi/barcode/CurrencyInputEditText;->_$_findViewCache:Ljava/util/HashMap;

    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/views/pwi/barcode/CurrencyInputEditText;->_$_findViewCache:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    if-nez v0, :cond_1

    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/views/pwi/barcode/CurrencyInputEditText;->_$_findViewCache:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v1, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-object v0
.end method

.method public bindViewEvents(Lcom/ibotta/android/views/components/NoViewEvents;)V
    .locals 1
    .param p1    # Lcom/ibotta/android/views/components/NoViewEvents;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "viewEvents"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic bindViewEvents(Lcom/ibotta/android/views/components/ViewEvents;)V
    .locals 0

    .line 15
    check-cast p1, Lcom/ibotta/android/views/components/NoViewEvents;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/views/pwi/barcode/CurrencyInputEditText;->bindViewEvents(Lcom/ibotta/android/views/components/NoViewEvents;)V

    return-void
.end method

.method protected onSelectionChanged(II)V
    .locals 0

    .line 88
    invoke-virtual {p0}, Lcom/ibotta/android/views/pwi/barcode/CurrencyInputEditText;->length()I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/ibotta/android/views/pwi/barcode/CurrencyInputEditText;->setSelection(I)V

    return-void
.end method

.method public updateViewState(Lcom/ibotta/android/views/components/NoViewState;)V
    .locals 1
    .param p1    # Lcom/ibotta/android/views/components/NoViewState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "viewState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic updateViewState(Lcom/ibotta/android/views/components/ViewState;)V
    .locals 0

    .line 15
    check-cast p1, Lcom/ibotta/android/views/components/NoViewState;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/views/pwi/barcode/CurrencyInputEditText;->updateViewState(Lcom/ibotta/android/views/components/NoViewState;)V

    return-void
.end method
