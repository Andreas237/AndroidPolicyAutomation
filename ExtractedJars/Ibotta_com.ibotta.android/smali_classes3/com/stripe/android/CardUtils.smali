.class public Lcom/stripe/android/CardUtils;
.super Ljava/lang/Object;
.source "CardUtils.java"


# direct methods
.method public static getPossibleCardType(Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .param p0    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    const/4 v0, 0x1

    .line 30
    invoke-static {p0, v0}, Lcom/stripe/android/CardUtils;->getPossibleCardType(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static getPossibleCardType(Ljava/lang/String;Z)Ljava/lang/String;
    .locals 1
    .param p0    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 124
    invoke-static {p0}, Lcom/stripe/android/StripeTextUtils;->isBlank(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string p0, "Unknown"

    return-object p0

    :cond_0
    if-eqz p1, :cond_1

    .line 130
    invoke-static {p0}, Lcom/stripe/android/StripeTextUtils;->removeSpacesAndHyphens(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 133
    :cond_1
    sget-object p1, Lcom/stripe/android/model/Card;->PREFIXES_AMERICAN_EXPRESS:[Ljava/lang/String;

    invoke-static {p0, p1}, Lcom/stripe/android/StripeTextUtils;->hasAnyPrefix(Ljava/lang/String;[Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_2

    const-string p0, "American Express"

    return-object p0

    .line 135
    :cond_2
    sget-object p1, Lcom/stripe/android/model/Card;->PREFIXES_DISCOVER:[Ljava/lang/String;

    invoke-static {p0, p1}, Lcom/stripe/android/StripeTextUtils;->hasAnyPrefix(Ljava/lang/String;[Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_3

    const-string p0, "Discover"

    return-object p0

    .line 137
    :cond_3
    sget-object p1, Lcom/stripe/android/model/Card;->PREFIXES_JCB:[Ljava/lang/String;

    invoke-static {p0, p1}, Lcom/stripe/android/StripeTextUtils;->hasAnyPrefix(Ljava/lang/String;[Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_4

    const-string p0, "JCB"

    return-object p0

    .line 139
    :cond_4
    sget-object p1, Lcom/stripe/android/model/Card;->PREFIXES_DINERS_CLUB:[Ljava/lang/String;

    invoke-static {p0, p1}, Lcom/stripe/android/StripeTextUtils;->hasAnyPrefix(Ljava/lang/String;[Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_5

    const-string p0, "Diners Club"

    return-object p0

    .line 141
    :cond_5
    sget-object p1, Lcom/stripe/android/model/Card;->PREFIXES_VISA:[Ljava/lang/String;

    invoke-static {p0, p1}, Lcom/stripe/android/StripeTextUtils;->hasAnyPrefix(Ljava/lang/String;[Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_6

    const-string p0, "Visa"

    return-object p0

    .line 143
    :cond_6
    sget-object p1, Lcom/stripe/android/model/Card;->PREFIXES_MASTERCARD:[Ljava/lang/String;

    invoke-static {p0, p1}, Lcom/stripe/android/StripeTextUtils;->hasAnyPrefix(Ljava/lang/String;[Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_7

    const-string p0, "MasterCard"

    return-object p0

    .line 145
    :cond_7
    sget-object p1, Lcom/stripe/android/model/Card;->PREFIXES_UNIONPAY:[Ljava/lang/String;

    invoke-static {p0, p1}, Lcom/stripe/android/StripeTextUtils;->hasAnyPrefix(Ljava/lang/String;[Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_8

    const-string p0, "UnionPay"

    return-object p0

    :cond_8
    const-string p0, "Unknown"

    return-object p0
.end method

.method static isValidCardLength(Ljava/lang/String;)Z
    .locals 2
    .param p0    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x0

    if-eqz p0, :cond_0

    .line 91
    invoke-static {p0, v0}, Lcom/stripe/android/CardUtils;->getPossibleCardType(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v1

    .line 90
    invoke-static {p0, v1}, Lcom/stripe/android/CardUtils;->isValidCardLength(Ljava/lang/String;Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 v0, 0x1

    :cond_0
    return v0
.end method

.method static isValidCardLength(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 5
    .param p0    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const/4 v0, 0x0

    if-eqz p0, :cond_7

    const-string v1, "Unknown"

    .line 105
    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_2

    .line 109
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result p0

    const/4 v1, -0x1

    .line 110
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v2

    const v3, -0x3b3bfd47

    const/4 v4, 0x1

    if-eq v2, v3, :cond_2

    const v3, -0x11ceb490

    if-eq v2, v3, :cond_1

    goto :goto_0

    :cond_1
    const-string v2, "American Express"

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    const/4 v1, 0x0

    goto :goto_0

    :cond_2
    const-string v2, "Diners Club"

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    const/4 v1, 0x1

    :cond_3
    :goto_0
    packed-switch v1, :pswitch_data_0

    const/16 p1, 0x10

    if-ne p0, p1, :cond_6

    const/4 v0, 0x1

    goto :goto_1

    :pswitch_0
    const/16 p1, 0xe

    if-ne p0, p1, :cond_4

    const/4 v0, 0x1

    :cond_4
    return v0

    :pswitch_1
    const/16 p1, 0xf

    if-ne p0, p1, :cond_5

    const/4 v0, 0x1

    :cond_5
    return v0

    :cond_6
    :goto_1
    return v0

    :cond_7
    :goto_2
    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static isValidCardNumber(Ljava/lang/String;)Z
    .locals 1
    .param p0    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 41
    invoke-static {p0}, Lcom/stripe/android/StripeTextUtils;->removeSpacesAndHyphens(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 42
    invoke-static {p0}, Lcom/stripe/android/CardUtils;->isValidLuhnNumber(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p0}, Lcom/stripe/android/CardUtils;->isValidCardLength(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method static isValidLuhnNumber(Ljava/lang/String;)Z
    .locals 7
    .param p0    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return v0

    .line 59
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x1

    sub-int/2addr v1, v2

    const/4 v3, 0x0

    const/4 v4, 0x1

    :goto_0
    if-ltz v1, :cond_4

    .line 60
    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v5

    .line 61
    invoke-static {v5}, Ljava/lang/Character;->isDigit(C)Z

    move-result v6

    if-nez v6, :cond_1

    return v0

    .line 65
    :cond_1
    invoke-static {v5}, Ljava/lang/Character;->getNumericValue(C)I

    move-result v5

    xor-int/2addr v4, v2

    if-eqz v4, :cond_2

    mul-int/lit8 v5, v5, 0x2

    :cond_2
    const/16 v6, 0x9

    if-le v5, v6, :cond_3

    add-int/lit8 v5, v5, -0x9

    :cond_3
    add-int/2addr v3, v5

    add-int/lit8 v1, v1, -0x1

    goto :goto_0

    .line 79
    :cond_4
    rem-int/lit8 v3, v3, 0xa

    if-nez v3, :cond_5

    const/4 v0, 0x1

    :cond_5
    return v0
.end method
