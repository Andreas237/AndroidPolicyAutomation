.class public Lcom/shopkick/app/util/phoneNumber/PhoneNumberValidator;
.super Ljava/lang/Object;
.source "PhoneNumberValidator.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static convertNumberFromNetworkToGermanFormat(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    const/4 v0, 0x3

    const/4 v1, 0x0

    .line 106
    invoke-virtual {p0, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    const-string v2, "+49"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 107
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "0"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    return-object p0
.end method

.method private static convertNumberFromNetworkToUSFormat(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    const/4 v0, 0x0

    .line 98
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v1, 0x2b

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    .line 99
    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    return-object p0
.end method

.method private static convertNumberToGermanFormatForNetwork(Ljava/lang/String;)Ljava/lang/StringBuilder;
    .locals 7

    if-eqz p0, :cond_0

    .line 57
    invoke-static {p0}, Lcom/shopkick/app/util/phoneNumber/PhoneNumberValidator;->startsWithGermanPhonePrefix(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x3

    .line 58
    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    .line 61
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    .line 62
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v2, 0x0

    const/4 v3, 0x1

    move v4, v3

    move v3, v2

    :goto_0
    if-ge v3, v0, :cond_4

    .line 65
    invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C

    move-result v5

    .line 66
    invoke-static {v5}, Ljava/lang/Character;->isDigit(C)Z

    move-result v6

    if-eqz v6, :cond_3

    if-eqz v4, :cond_2

    const/16 v4, 0x30

    if-ne v5, v4, :cond_1

    const-string v4, "+49"

    .line 69
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 71
    :cond_1
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :goto_1
    move v4, v2

    goto :goto_2

    .line 75
    :cond_2
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_3
    :goto_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_4
    return-object v1
.end method

.method private static convertNumberToUSFormatForNetwork(Ljava/lang/String;)Ljava/lang/StringBuilder;
    .locals 7

    const/4 v0, 0x1

    if-eqz p0, :cond_1

    const-string v1, "01"

    .line 33
    invoke-virtual {p0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {p0}, Lcom/shopkick/app/util/phoneNumber/PhoneNumberValidator;->startsWithUSPhonePrefix(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 34
    :cond_0
    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    .line 36
    :cond_1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    .line 37
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v3, 0x0

    move v4, v0

    move v0, v3

    :goto_0
    if-ge v0, v1, :cond_5

    .line 40
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result v5

    .line 41
    invoke-static {v5}, Ljava/lang/Character;->isDigit(C)Z

    move-result v6

    if-eqz v6, :cond_4

    if-eqz v4, :cond_3

    const/16 v4, 0x31

    if-ne v5, v4, :cond_2

    const/16 v4, 0x2b

    .line 44
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_2
    const-string v4, "+1"

    .line 46
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_1
    move v4, v3

    .line 50
    :cond_3
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_4
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_5
    return-object v2
.end method

.method public static getValidationError(Ljava/lang/String;I)I
    .locals 3

    .line 130
    invoke-static {p0, p1}, Lcom/shopkick/app/util/phoneNumber/PhoneNumberValidator;->isValid(Ljava/lang/String;I)Z

    move-result v0

    const/4 v1, -0x1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x1

    const v2, 0x7f110199

    if-ne p1, v0, :cond_1

    return v2

    :cond_1
    const/16 v0, 0x3a

    if-ne p1, v0, :cond_3

    .line 134
    invoke-static {p0}, Lcom/shopkick/app/util/phoneNumber/PhoneNumberValidator;->startsWithGermanPhonePrefix(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_2

    invoke-static {p0}, Lcom/shopkick/app/util/phoneNumber/PhoneNumberValidator;->strip(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/shopkick/app/util/phoneNumber/PhoneNumberValidator;->startsWith0(Ljava/lang/String;)Z

    move-result p0

    if-nez p0, :cond_2

    const p0, 0x7f11019a

    return p0

    :cond_2
    return v2

    :cond_3
    return v1
.end method

.method public static isValid(Ljava/lang/String;I)Z
    .locals 2

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return v0

    .line 121
    :cond_0
    invoke-static {p0}, Lcom/shopkick/app/util/phoneNumber/PhoneNumberValidator;->strip(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    const/4 v1, 0x1

    if-ne p1, v1, :cond_2

    .line 123
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result p1

    invoke-static {p0}, Lcom/shopkick/app/util/phoneNumber/PhoneNumberValidator;->isValidUSNumber(Ljava/lang/String;)I

    move-result p0

    if-ne p1, p0, :cond_1

    move v0, v1

    :cond_1
    return v0

    .line 125
    :cond_2
    invoke-static {p0}, Lcom/shopkick/app/util/phoneNumber/PhoneNumberValidator;->isValidGermanNumber(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method private static isValidGermanNumber(Ljava/lang/String;)Z
    .locals 4

    const/4 v0, 0x1

    if-eqz p0, :cond_5

    .line 176
    invoke-static {p0}, Lcom/shopkick/app/util/phoneNumber/PhoneNumberValidator;->strip(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 177
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    const/4 v3, 0x4

    if-le v2, v3, :cond_4

    const-string v2, "0"

    .line 178
    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 179
    invoke-virtual {v1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    const-string v2, "+49"

    .line 180
    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v2, 0x3

    .line 181
    invoke-virtual {v1, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    .line 182
    :cond_1
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    const/16 v3, 0xb

    if-le v2, v3, :cond_2

    const-string v2, "49"

    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, 0x2

    .line 183
    invoke-virtual {v1, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    .line 187
    :cond_2
    :goto_0
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    const/16 v3, 0xa

    if-lt v2, v3, :cond_3

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    const/16 v2, 0x10

    if-gt v1, v2, :cond_3

    goto :goto_2

    .line 190
    :cond_3
    const-class v0, Lcom/shopkick/app/util/phoneNumber/PhoneNumberValidator;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "isValidGermanNumber() failed [bad length] "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v0, p0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_1

    .line 194
    :cond_4
    const-class v0, Lcom/shopkick/app/util/phoneNumber/PhoneNumberValidator;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "isValidGermanNumber() failed [too short] "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v0, p0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_5
    :goto_1
    const/4 v0, 0x0

    :goto_2
    return v0
.end method

.method private static isValidUSNumber(Ljava/lang/String;)I
    .locals 1

    .line 157
    invoke-static {p0}, Lcom/shopkick/app/util/phoneNumber/PhoneNumberValidator;->startsWithUSPhonePrefix(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/16 p0, 0xc

    return p0

    .line 159
    :cond_0
    invoke-static {p0}, Lcom/shopkick/app/util/phoneNumber/PhoneNumberValidator;->startsWith1(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_1

    const/16 p0, 0xb

    return p0

    :cond_1
    const/16 p0, 0xa

    return p0
.end method

.method public static numberFormattedForNetwork(Ljava/lang/String;I)Ljava/lang/String;
    .locals 2

    if-nez p0, :cond_0

    return-object p0

    :cond_0
    const-string v0, "+"

    .line 20
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_3

    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    .line 22
    invoke-static {p0}, Lcom/shopkick/app/util/phoneNumber/PhoneNumberValidator;->convertNumberToUSFormatForNetwork(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_1
    const/16 v0, 0x3a

    if-ne p1, v0, :cond_2

    .line 24
    invoke-static {p0}, Lcom/shopkick/app/util/phoneNumber/PhoneNumberValidator;->convertNumberToGermanFormatForNetwork(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_2
    const/4 p0, 0x0

    return-object p0

    .line 27
    :cond_3
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "+"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "[^0-9]"

    const-string v1, ""

    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static numberFromNetworkFormattedForDisplay(Ljava/lang/String;I)Ljava/lang/String;
    .locals 1

    if-eqz p0, :cond_3

    .line 86
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    .line 90
    invoke-static {p0}, Lcom/shopkick/app/util/phoneNumber/PhoneNumberValidator;->convertNumberFromNetworkToUSFormat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_1
    const/16 v0, 0x3a

    if-ne p1, v0, :cond_2

    .line 92
    invoke-static {p0}, Lcom/shopkick/app/util/phoneNumber/PhoneNumberValidator;->convertNumberFromNetworkToGermanFormat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_2
    const/4 p0, 0x0

    return-object p0

    :cond_3
    :goto_0
    return-object p0
.end method

.method private static startsWith0(Ljava/lang/String;)Z
    .locals 3

    .line 214
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-ge v0, v1, :cond_0

    return v2

    .line 217
    :cond_0
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    move-result p0

    const/16 v0, 0x30

    if-ne p0, v0, :cond_1

    goto :goto_0

    :cond_1
    move v1, v2

    :goto_0
    return v1
.end method

.method private static startsWith1(Ljava/lang/String;)Z
    .locals 3

    .line 207
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-ge v0, v1, :cond_0

    return v2

    .line 210
    :cond_0
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    move-result p0

    const/16 v0, 0x31

    if-ne p0, v0, :cond_1

    goto :goto_0

    :cond_1
    move v1, v2

    :goto_0
    return v1
.end method

.method public static startsWithGermanPhonePrefix(Ljava/lang/String;)Z
    .locals 2

    .line 228
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x3

    if-ge v0, v1, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    const-string v0, "+49"

    .line 231
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method public static startsWithUSPhonePrefix(Ljava/lang/String;)Z
    .locals 2

    .line 221
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x2

    if-ge v0, v1, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    const-string v0, "+1"

    .line 224
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method private static strip(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 144
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    .line 145
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_2

    .line 147
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v3

    .line 148
    invoke-static {v3}, Ljava/lang/Character;->isDigit(C)Z

    move-result v4

    if-nez v4, :cond_0

    const/16 v4, 0x2b

    if-ne v3, v4, :cond_1

    if-nez v2, :cond_1

    .line 149
    :cond_0
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 153
    :cond_2
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
