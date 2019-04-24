.class public Lcom/stripe/android/view/PaymentUtils;
.super Ljava/lang/Object;
.source "PaymentUtils.java"


# direct methods
.method static formatPriceString(DLjava/util/Currency;)Ljava/lang/String;
    .locals 4
    .param p2    # Ljava/util/Currency;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 33
    invoke-virtual {p2}, Ljava/util/Currency;->getDefaultFractionDigits()I

    move-result v0

    int-to-double v0, v0

    const-wide/high16 v2, 0x4024000000000000L    # 10.0

    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v0

    div-double/2addr p0, v0

    .line 34
    invoke-static {}, Ljava/text/NumberFormat;->getCurrencyInstance()Ljava/text/NumberFormat;

    move-result-object v0

    .line 36
    :try_start_0
    move-object v1, v0

    check-cast v1, Ljava/text/DecimalFormat;

    .line 37
    invoke-virtual {v1}, Ljava/text/DecimalFormat;->getDecimalFormatSymbols()Ljava/text/DecimalFormatSymbols;

    move-result-object v1

    .line 38
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v2

    invoke-virtual {p2, v2}, Ljava/util/Currency;->getSymbol(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v1, p2}, Ljava/text/DecimalFormatSymbols;->setCurrencySymbol(Ljava/lang/String;)V

    .line 39
    move-object p2, v0

    check-cast p2, Ljava/text/DecimalFormat;

    .line 40
    invoke-virtual {p2, v1}, Ljava/text/DecimalFormat;->setDecimalFormatSymbols(Ljava/text/DecimalFormatSymbols;)V

    .line 41
    invoke-virtual {v0, p0, p1}, Ljava/text/NumberFormat;->format(D)Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    .line 43
    :catch_0
    invoke-virtual {v0, p0, p1}, Ljava/text/NumberFormat;->format(D)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method static formatPriceStringUsingFree(JLjava/util/Currency;Ljava/lang/String;)Ljava/lang/String;
    .locals 3
    .param p2    # Ljava/util/Currency;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const-wide/16 v0, 0x0

    cmp-long v2, p0, v0

    if-nez v2, :cond_0

    return-object p3

    .line 20
    :cond_0
    invoke-static {}, Ljava/text/NumberFormat;->getCurrencyInstance()Ljava/text/NumberFormat;

    move-result-object p3

    .line 21
    check-cast p3, Ljava/text/DecimalFormat;

    .line 22
    invoke-virtual {p3}, Ljava/text/DecimalFormat;->getDecimalFormatSymbols()Ljava/text/DecimalFormatSymbols;

    move-result-object v0

    .line 23
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v1

    invoke-virtual {p2, v1}, Ljava/util/Currency;->getSymbol(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/text/DecimalFormatSymbols;->setCurrencySymbol(Ljava/lang/String;)V

    .line 24
    invoke-virtual {p3, v0}, Ljava/text/DecimalFormat;->setDecimalFormatSymbols(Ljava/text/DecimalFormatSymbols;)V

    long-to-double p0, p0

    .line 26
    invoke-static {p0, p1, p2}, Lcom/stripe/android/view/PaymentUtils;->formatPriceString(DLjava/util/Currency;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
