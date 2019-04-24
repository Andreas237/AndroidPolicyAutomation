.class public final Lcom/ibotta/android/views/pwi/barcode/CurrencyInputEditText$initFilter$1;
.super Ljava/lang/Object;
.source "CurrencyInputEditText.kt"

# interfaces
.implements Landroid/text/TextWatcher;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/views/pwi/barcode/CurrencyInputEditText;->initFilter()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nCurrencyInputEditText.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CurrencyInputEditText.kt\ncom/ibotta/android/views/pwi/barcode/CurrencyInputEditText$initFilter$1\n*L\n1#1,93:1\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0005*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J(\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016J(\u0010\u000c\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016\u00a8\u0006\u000e"
    }
    d2 = {
        "com/ibotta/android/views/pwi/barcode/CurrencyInputEditText$initFilter$1",
        "Landroid/text/TextWatcher;",
        "afterTextChanged",
        "",
        "s",
        "Landroid/text/Editable;",
        "beforeTextChanged",
        "",
        "start",
        "",
        "count",
        "after",
        "onTextChanged",
        "before",
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
.field final synthetic this$0:Lcom/ibotta/android/views/pwi/barcode/CurrencyInputEditText;


# direct methods
.method constructor <init>(Lcom/ibotta/android/views/pwi/barcode/CurrencyInputEditText;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 46
    iput-object p1, p0, Lcom/ibotta/android/views/pwi/barcode/CurrencyInputEditText$initFilter$1;->this$0:Lcom/ibotta/android/views/pwi/barcode/CurrencyInputEditText;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public afterTextChanged(Landroid/text/Editable;)V
    .locals 1
    .param p1    # Landroid/text/Editable;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "s"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0
    .param p1    # Ljava/lang/CharSequence;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string p2, "s"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 48
    iget-object p2, p0, Lcom/ibotta/android/views/pwi/barcode/CurrencyInputEditText$initFilter$1;->this$0:Lcom/ibotta/android/views/pwi/barcode/CurrencyInputEditText;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    check-cast p1, Ljava/lang/CharSequence;

    invoke-static {p2, p1}, Lcom/ibotta/android/views/pwi/barcode/CurrencyInputEditText;->access$setBeforeChangedText$p(Lcom/ibotta/android/views/pwi/barcode/CurrencyInputEditText;Ljava/lang/CharSequence;)V

    return-void
.end method

.method public onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 4
    .param p1    # Ljava/lang/CharSequence;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string p3, "s"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 52
    iget-object p3, p0, Lcom/ibotta/android/views/pwi/barcode/CurrencyInputEditText$initFilter$1;->this$0:Lcom/ibotta/android/views/pwi/barcode/CurrencyInputEditText;

    add-int/2addr p4, p2

    invoke-interface {p1, p2, p4}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p3, p1}, Lcom/ibotta/android/views/pwi/barcode/CurrencyInputEditText;->access$setCurrentChar$p(Lcom/ibotta/android/views/pwi/barcode/CurrencyInputEditText;Ljava/lang/String;)V

    .line 53
    iget-object p1, p0, Lcom/ibotta/android/views/pwi/barcode/CurrencyInputEditText$initFilter$1;->this$0:Lcom/ibotta/android/views/pwi/barcode/CurrencyInputEditText;

    invoke-static {p1}, Lcom/ibotta/android/views/pwi/barcode/CurrencyInputEditText;->access$getCurrentChar$p(Lcom/ibotta/android/views/pwi/barcode/CurrencyInputEditText;)Ljava/lang/String;

    move-result-object p1

    check-cast p1, Ljava/lang/CharSequence;

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    const/4 p2, 0x0

    const/4 p3, 0x1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_3

    iget-object p1, p0, Lcom/ibotta/android/views/pwi/barcode/CurrencyInputEditText$initFilter$1;->this$0:Lcom/ibotta/android/views/pwi/barcode/CurrencyInputEditText;

    invoke-static {p1}, Lcom/ibotta/android/views/pwi/barcode/CurrencyInputEditText;->access$getRawCurrencyInputInCents$p(Lcom/ibotta/android/views/pwi/barcode/CurrencyInputEditText;)Ljava/lang/String;

    move-result-object p1

    check-cast p1, Ljava/lang/CharSequence;

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    if-nez p1, :cond_1

    const/4 p1, 0x1

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    :goto_1
    if-nez p1, :cond_3

    .line 54
    iget-object p1, p0, Lcom/ibotta/android/views/pwi/barcode/CurrencyInputEditText$initFilter$1;->this$0:Lcom/ibotta/android/views/pwi/barcode/CurrencyInputEditText;

    invoke-static {p1}, Lcom/ibotta/android/views/pwi/barcode/CurrencyInputEditText;->access$getRawCurrencyInputInCents$p(Lcom/ibotta/android/views/pwi/barcode/CurrencyInputEditText;)Ljava/lang/String;

    move-result-object p4

    iget-object v0, p0, Lcom/ibotta/android/views/pwi/barcode/CurrencyInputEditText$initFilter$1;->this$0:Lcom/ibotta/android/views/pwi/barcode/CurrencyInputEditText;

    invoke-static {v0}, Lcom/ibotta/android/views/pwi/barcode/CurrencyInputEditText;->access$getRawCurrencyInputInCents$p(Lcom/ibotta/android/views/pwi/barcode/CurrencyInputEditText;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    sub-int/2addr v0, p3

    if-eqz p4, :cond_2

    invoke-virtual {p4, p2, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p4

    const-string v0, "(this as java.lang.Strin\u2026ing(startIndex, endIndex)"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, p4}, Lcom/ibotta/android/views/pwi/barcode/CurrencyInputEditText;->access$setRawCurrencyInputInCents$p(Lcom/ibotta/android/views/pwi/barcode/CurrencyInputEditText;Ljava/lang/String;)V

    goto :goto_2

    :cond_2
    new-instance p1, Lkotlin/TypeCastException;

    const-string p2, "null cannot be cast to non-null type java.lang.String"

    invoke-direct {p1, p2}, Lkotlin/TypeCastException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 55
    :cond_3
    iget-object p1, p0, Lcom/ibotta/android/views/pwi/barcode/CurrencyInputEditText$initFilter$1;->this$0:Lcom/ibotta/android/views/pwi/barcode/CurrencyInputEditText;

    invoke-static {p1}, Lcom/ibotta/android/views/pwi/barcode/CurrencyInputEditText;->access$getCurrentChar$p(Lcom/ibotta/android/views/pwi/barcode/CurrencyInputEditText;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    if-le p1, p3, :cond_4

    return-void

    .line 59
    :cond_4
    :goto_2
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object p4, p0, Lcom/ibotta/android/views/pwi/barcode/CurrencyInputEditText$initFilter$1;->this$0:Lcom/ibotta/android/views/pwi/barcode/CurrencyInputEditText;

    invoke-static {p4}, Lcom/ibotta/android/views/pwi/barcode/CurrencyInputEditText;->access$getRawCurrencyInputInCents$p(Lcom/ibotta/android/views/pwi/barcode/CurrencyInputEditText;)Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p4, p0, Lcom/ibotta/android/views/pwi/barcode/CurrencyInputEditText$initFilter$1;->this$0:Lcom/ibotta/android/views/pwi/barcode/CurrencyInputEditText;

    invoke-static {p4}, Lcom/ibotta/android/views/pwi/barcode/CurrencyInputEditText;->access$getCurrentChar$p(Lcom/ibotta/android/views/pwi/barcode/CurrencyInputEditText;)Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    check-cast p1, Ljava/lang/CharSequence;

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    if-nez p1, :cond_5

    const/4 p1, 0x1

    goto :goto_3

    :cond_5
    const/4 p1, 0x0

    :goto_3
    if-ne p1, p3, :cond_6

    const-wide/16 v0, 0x0

    goto :goto_4

    :cond_6
    if-nez p1, :cond_7

    .line 61
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object p4, p0, Lcom/ibotta/android/views/pwi/barcode/CurrencyInputEditText$initFilter$1;->this$0:Lcom/ibotta/android/views/pwi/barcode/CurrencyInputEditText;

    invoke-static {p4}, Lcom/ibotta/android/views/pwi/barcode/CurrencyInputEditText;->access$getRawCurrencyInputInCents$p(Lcom/ibotta/android/views/pwi/barcode/CurrencyInputEditText;)Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p4, p0, Lcom/ibotta/android/views/pwi/barcode/CurrencyInputEditText$initFilter$1;->this$0:Lcom/ibotta/android/views/pwi/barcode/CurrencyInputEditText;

    invoke-static {p4}, Lcom/ibotta/android/views/pwi/barcode/CurrencyInputEditText;->access$getCurrentChar$p(Lcom/ibotta/android/views/pwi/barcode/CurrencyInputEditText;)Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v0

    const/16 p1, 0x64

    int-to-double v2, p1

    div-double/2addr v0, v2

    .line 64
    :goto_4
    iget-object p1, p0, Lcom/ibotta/android/views/pwi/barcode/CurrencyInputEditText$initFilter$1;->this$0:Lcom/ibotta/android/views/pwi/barcode/CurrencyInputEditText;

    invoke-virtual {p1}, Lcom/ibotta/android/views/pwi/barcode/CurrencyInputEditText;->getContext()Landroid/content/Context;

    move-result-object p4

    sget v2, Lcom/ibotta/views/R$string;->pwi_edit_currency_prepend:I

    new-array p3, p3, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    aput-object v0, p3, p2

    invoke-virtual {p4, v2, p3}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    const-string p3, "context.getString(R.stri\u2026currency_prepend, amount)"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Ljava/lang/CharSequence;

    invoke-static {p1, p2}, Lcom/ibotta/android/views/pwi/barcode/CurrencyInputEditText;->access$parseForValidInputAndSetAccordingly(Lcom/ibotta/android/views/pwi/barcode/CurrencyInputEditText;Ljava/lang/CharSequence;)V

    return-void

    .line 61
    :cond_7
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
