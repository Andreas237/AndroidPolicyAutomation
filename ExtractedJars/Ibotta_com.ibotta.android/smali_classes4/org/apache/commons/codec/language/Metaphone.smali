.class public Lorg/apache/commons/codec/language/Metaphone;
.super Ljava/lang/Object;
.source "Metaphone.java"

# interfaces
.implements Lorg/apache/commons/codec/StringEncoder;


# static fields
.field private static final FRONTV:Ljava/lang/String; = "EIY"

.field private static final VARSON:Ljava/lang/String; = "CSPTG"

.field private static final VOWELS:Ljava/lang/String; = "AEIOU"


# instance fields
.field private maxCodeLen:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 69
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x4

    .line 63
    iput v0, p0, Lorg/apache/commons/codec/language/Metaphone;->maxCodeLen:I

    return-void
.end method

.method private isLastChar(II)Z
    .locals 1

    const/4 v0, 0x1

    add-int/2addr p2, v0

    if-ne p2, p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private isNextChar(Ljava/lang/StringBuffer;IC)Z
    .locals 3

    const/4 v0, 0x0

    if-ltz p2, :cond_0

    .line 332
    invoke-virtual {p1}, Ljava/lang/StringBuffer;->length()I

    move-result v1

    const/4 v2, 0x1

    sub-int/2addr v1, v2

    if-ge p2, v1, :cond_0

    add-int/2addr p2, v2

    .line 334
    invoke-virtual {p1, p2}, Ljava/lang/StringBuffer;->charAt(I)C

    move-result p1

    if-ne p1, p3, :cond_0

    const/4 v0, 0x1

    :cond_0
    return v0
.end method

.method private isPreviousChar(Ljava/lang/StringBuffer;IC)Z
    .locals 2

    const/4 v0, 0x0

    if-lez p2, :cond_0

    .line 323
    invoke-virtual {p1}, Ljava/lang/StringBuffer;->length()I

    move-result v1

    if-ge p2, v1, :cond_0

    const/4 v1, 0x1

    sub-int/2addr p2, v1

    .line 325
    invoke-virtual {p1, p2}, Ljava/lang/StringBuffer;->charAt(I)C

    move-result p1

    if-ne p1, p3, :cond_0

    const/4 v0, 0x1

    :cond_0
    return v0
.end method

.method private isVowel(Ljava/lang/StringBuffer;I)Z
    .locals 1

    const-string v0, "AEIOU"

    .line 318
    invoke-virtual {p1, p2}, Ljava/lang/StringBuffer;->charAt(I)C

    move-result p1

    invoke-virtual {v0, p1}, Ljava/lang/String;->indexOf(I)I

    move-result p1

    if-ltz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method private regionMatch(Ljava/lang/StringBuffer;ILjava/lang/String;)Z
    .locals 2

    if-ltz p2, :cond_0

    .line 341
    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result v0

    add-int/2addr v0, p2

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {p1}, Ljava/lang/StringBuffer;->length()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 343
    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result v0

    add-int/2addr v0, p2

    invoke-virtual {p1, p2, v0}, Ljava/lang/StringBuffer;->substring(II)Ljava/lang/String;

    move-result-object p1

    .line 344
    invoke-virtual {p1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method


# virtual methods
.method public encode(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/commons/codec/EncoderException;
        }
    .end annotation

    .line 367
    instance-of v0, p1, Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 370
    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lorg/apache/commons/codec/language/Metaphone;->metaphone(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 368
    :cond_0
    new-instance p1, Lorg/apache/commons/codec/EncoderException;

    const-string v0, "Parameter supplied to Metaphone encode is not of type java.lang.String"

    invoke-direct {p1, v0}, Lorg/apache/commons/codec/EncoderException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public encode(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 380
    invoke-virtual {p0, p1}, Lorg/apache/commons/codec/language/Metaphone;->metaphone(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public getMaxCodeLen()I
    .locals 1

    .line 399
    iget v0, p0, Lorg/apache/commons/codec/language/Metaphone;->maxCodeLen:I

    return v0
.end method

.method public isMetaphoneEqual(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 0

    .line 392
    invoke-virtual {p0, p1}, Lorg/apache/commons/codec/language/Metaphone;->metaphone(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p2}, Lorg/apache/commons/codec/language/Metaphone;->metaphone(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public metaphone(Ljava/lang/String;)Ljava/lang/String;
    .locals 14

    if-eqz p1, :cond_22

    .line 84
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_6

    .line 88
    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 89
    sget-object v0, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-virtual {p1, v0}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 92
    :cond_1
    sget-object v0, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-virtual {p1, v0}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->toCharArray()[C

    move-result-object p1

    .line 94
    new-instance v0, Ljava/lang/StringBuffer;

    const/16 v2, 0x28

    invoke-direct {v0, v2}, Ljava/lang/StringBuffer;-><init>(I)V

    .line 95
    new-instance v2, Ljava/lang/StringBuffer;

    const/16 v3, 0xa

    invoke-direct {v2, v3}, Ljava/lang/StringBuffer;-><init>(I)V

    const/4 v3, 0x0

    .line 97
    aget-char v4, p1, v3

    const/16 v5, 0x41

    const/16 v6, 0x47

    const/16 v7, 0x48

    const/16 v8, 0x53

    const/16 v9, 0x4b

    if-eq v4, v5, :cond_6

    if-eq v4, v6, :cond_4

    if-eq v4, v9, :cond_4

    const/16 v5, 0x50

    if-eq v4, v5, :cond_4

    packed-switch v4, :pswitch_data_0

    .line 131
    invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append([C)Ljava/lang/StringBuffer;

    goto :goto_0

    .line 127
    :pswitch_0
    aput-char v8, p1, v3

    .line 128
    invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append([C)Ljava/lang/StringBuffer;

    goto :goto_0

    .line 115
    :pswitch_1
    aget-char v4, p1, v1

    const/16 v5, 0x52

    if-ne v4, v5, :cond_2

    .line 116
    array-length v4, p1

    sub-int/2addr v4, v1

    invoke-virtual {v0, p1, v1, v4}, Ljava/lang/StringBuffer;->append([CII)Ljava/lang/StringBuffer;

    goto :goto_0

    .line 119
    :cond_2
    aget-char v4, p1, v1

    if-ne v4, v7, :cond_3

    .line 120
    array-length v4, p1

    sub-int/2addr v4, v1

    invoke-virtual {v0, p1, v1, v4}, Ljava/lang/StringBuffer;->append([CII)Ljava/lang/StringBuffer;

    const/16 p1, 0x57

    .line 121
    invoke-virtual {v0, v3, p1}, Ljava/lang/StringBuffer;->setCharAt(IC)V

    goto :goto_0

    .line 123
    :cond_3
    invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append([C)Ljava/lang/StringBuffer;

    goto :goto_0

    .line 101
    :cond_4
    aget-char v4, p1, v1

    const/16 v5, 0x4e

    if-ne v4, v5, :cond_5

    .line 102
    array-length v4, p1

    sub-int/2addr v4, v1

    invoke-virtual {v0, p1, v1, v4}, Ljava/lang/StringBuffer;->append([CII)Ljava/lang/StringBuffer;

    goto :goto_0

    .line 104
    :cond_5
    invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append([C)Ljava/lang/StringBuffer;

    goto :goto_0

    .line 108
    :cond_6
    aget-char v4, p1, v1

    const/16 v5, 0x45

    if-ne v4, v5, :cond_7

    .line 109
    array-length v4, p1

    sub-int/2addr v4, v1

    invoke-virtual {v0, p1, v1, v4}, Ljava/lang/StringBuffer;->append([CII)Ljava/lang/StringBuffer;

    goto :goto_0

    .line 111
    :cond_7
    invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append([C)Ljava/lang/StringBuffer;

    .line 134
    :goto_0
    invoke-virtual {v0}, Ljava/lang/StringBuffer;->length()I

    move-result p1

    .line 137
    :cond_8
    :goto_1
    invoke-virtual {v2}, Ljava/lang/StringBuffer;->length()I

    move-result v4

    invoke-virtual {p0}, Lorg/apache/commons/codec/language/Metaphone;->getMaxCodeLen()I

    move-result v5

    if-ge v4, v5, :cond_21

    if-ge v3, p1, :cond_21

    .line 139
    invoke-virtual {v0, v3}, Ljava/lang/StringBuffer;->charAt(I)C

    move-result v4

    const/16 v5, 0x43

    if-eq v4, v5, :cond_9

    .line 141
    invoke-direct {p0, v0, v3, v4}, Lorg/apache/commons/codec/language/Metaphone;->isPreviousChar(Ljava/lang/StringBuffer;IC)Z

    move-result v10

    if-eqz v10, :cond_9

    add-int/lit8 v3, v3, 0x1

    goto/16 :goto_5

    :cond_9
    const/16 v10, 0x4a

    const/16 v11, 0x54

    const/16 v12, 0x46

    const/16 v13, 0x58

    packed-switch v4, :pswitch_data_1

    goto/16 :goto_4

    .line 306
    :pswitch_2
    invoke-virtual {v2, v8}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    goto/16 :goto_4

    .line 303
    :pswitch_3
    invoke-virtual {v2, v9}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    invoke-virtual {v2, v8}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    goto/16 :goto_4

    .line 297
    :pswitch_4
    invoke-direct {p0, p1, v3}, Lorg/apache/commons/codec/language/Metaphone;->isLastChar(II)Z

    move-result v5

    if-nez v5, :cond_20

    add-int/lit8 v5, v3, 0x1

    invoke-direct {p0, v0, v5}, Lorg/apache/commons/codec/language/Metaphone;->isVowel(Ljava/lang/StringBuffer;I)Z

    move-result v5

    if-eqz v5, :cond_20

    .line 299
    invoke-virtual {v2, v4}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    goto/16 :goto_4

    .line 295
    :pswitch_5
    invoke-virtual {v2, v12}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    goto/16 :goto_4

    :pswitch_6
    const-string v4, "TIA"

    .line 278
    invoke-direct {p0, v0, v3, v4}, Lorg/apache/commons/codec/language/Metaphone;->regionMatch(Ljava/lang/StringBuffer;ILjava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_d

    const-string v4, "TIO"

    invoke-direct {p0, v0, v3, v4}, Lorg/apache/commons/codec/language/Metaphone;->regionMatch(Ljava/lang/StringBuffer;ILjava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_a

    goto :goto_2

    :cond_a
    const-string v4, "TCH"

    .line 283
    invoke-direct {p0, v0, v3, v4}, Lorg/apache/commons/codec/language/Metaphone;->regionMatch(Ljava/lang/StringBuffer;ILjava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_b

    goto/16 :goto_4

    :cond_b
    const-string v4, "TH"

    .line 288
    invoke-direct {p0, v0, v3, v4}, Lorg/apache/commons/codec/language/Metaphone;->regionMatch(Ljava/lang/StringBuffer;ILjava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_c

    const/16 v4, 0x30

    .line 289
    invoke-virtual {v2, v4}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    goto/16 :goto_4

    .line 291
    :cond_c
    invoke-virtual {v2, v11}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    goto/16 :goto_4

    .line 280
    :cond_d
    :goto_2
    invoke-virtual {v2, v13}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    goto/16 :goto_4

    :pswitch_7
    const-string v4, "SH"

    .line 269
    invoke-direct {p0, v0, v3, v4}, Lorg/apache/commons/codec/language/Metaphone;->regionMatch(Ljava/lang/StringBuffer;ILjava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_f

    const-string v4, "SIO"

    invoke-direct {p0, v0, v3, v4}, Lorg/apache/commons/codec/language/Metaphone;->regionMatch(Ljava/lang/StringBuffer;ILjava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_f

    const-string v4, "SIA"

    invoke-direct {p0, v0, v3, v4}, Lorg/apache/commons/codec/language/Metaphone;->regionMatch(Ljava/lang/StringBuffer;ILjava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_e

    goto :goto_3

    .line 274
    :cond_e
    invoke-virtual {v2, v8}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    goto/16 :goto_4

    .line 272
    :cond_f
    :goto_3
    invoke-virtual {v2, v13}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    goto/16 :goto_4

    .line 266
    :pswitch_8
    invoke-virtual {v2, v9}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    goto/16 :goto_4

    .line 258
    :pswitch_9
    invoke-direct {p0, v0, v3, v7}, Lorg/apache/commons/codec/language/Metaphone;->isNextChar(Ljava/lang/StringBuffer;IC)Z

    move-result v5

    if-eqz v5, :cond_10

    .line 260
    invoke-virtual {v2, v12}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    goto/16 :goto_4

    .line 262
    :cond_10
    invoke-virtual {v2, v4}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    goto/16 :goto_4

    :pswitch_a
    if-lez v3, :cond_11

    .line 250
    invoke-direct {p0, v0, v3, v5}, Lorg/apache/commons/codec/language/Metaphone;->isPreviousChar(Ljava/lang/StringBuffer;IC)Z

    move-result v5

    if-nez v5, :cond_20

    .line 251
    invoke-virtual {v2, v4}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    goto/16 :goto_4

    .line 254
    :cond_11
    invoke-virtual {v2, v4}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    goto/16 :goto_4

    .line 229
    :pswitch_b
    invoke-direct {p0, p1, v3}, Lorg/apache/commons/codec/language/Metaphone;->isLastChar(II)Z

    move-result v4

    if-eqz v4, :cond_12

    goto/16 :goto_4

    :cond_12
    if-lez v3, :cond_13

    const-string v4, "CSPTG"

    add-int/lit8 v5, v3, -0x1

    .line 232
    invoke-virtual {v0, v5}, Ljava/lang/StringBuffer;->charAt(I)C

    move-result v5

    invoke-virtual {v4, v5}, Ljava/lang/String;->indexOf(I)I

    move-result v4

    if-ltz v4, :cond_13

    goto/16 :goto_4

    :cond_13
    add-int/lit8 v4, v3, 0x1

    .line 236
    invoke-direct {p0, v0, v4}, Lorg/apache/commons/codec/language/Metaphone;->isVowel(Ljava/lang/StringBuffer;I)Z

    move-result v4

    if-eqz v4, :cond_20

    .line 237
    invoke-virtual {v2, v7}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    goto/16 :goto_4

    :pswitch_c
    add-int/lit8 v4, v3, 0x1

    .line 200
    invoke-direct {p0, p1, v4}, Lorg/apache/commons/codec/language/Metaphone;->isLastChar(II)Z

    move-result v5

    if-eqz v5, :cond_14

    invoke-direct {p0, v0, v3, v7}, Lorg/apache/commons/codec/language/Metaphone;->isNextChar(Ljava/lang/StringBuffer;IC)Z

    move-result v5

    if-eqz v5, :cond_14

    goto/16 :goto_4

    .line 204
    :cond_14
    invoke-direct {p0, p1, v4}, Lorg/apache/commons/codec/language/Metaphone;->isLastChar(II)Z

    move-result v5

    if-nez v5, :cond_15

    invoke-direct {p0, v0, v3, v7}, Lorg/apache/commons/codec/language/Metaphone;->isNextChar(Ljava/lang/StringBuffer;IC)Z

    move-result v5

    if-eqz v5, :cond_15

    add-int/lit8 v5, v3, 0x2

    invoke-direct {p0, v0, v5}, Lorg/apache/commons/codec/language/Metaphone;->isVowel(Ljava/lang/StringBuffer;I)Z

    move-result v5

    if-nez v5, :cond_15

    goto/16 :goto_4

    :cond_15
    if-lez v3, :cond_16

    const-string v5, "GN"

    .line 209
    invoke-direct {p0, v0, v3, v5}, Lorg/apache/commons/codec/language/Metaphone;->regionMatch(Ljava/lang/StringBuffer;ILjava/lang/String;)Z

    move-result v5

    if-nez v5, :cond_20

    const-string v5, "GNED"

    invoke-direct {p0, v0, v3, v5}, Lorg/apache/commons/codec/language/Metaphone;->regionMatch(Ljava/lang/StringBuffer;ILjava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_16

    goto/16 :goto_4

    .line 214
    :cond_16
    invoke-direct {p0, v0, v3, v6}, Lorg/apache/commons/codec/language/Metaphone;->isPreviousChar(Ljava/lang/StringBuffer;IC)Z

    move-result v5

    .line 220
    invoke-direct {p0, p1, v3}, Lorg/apache/commons/codec/language/Metaphone;->isLastChar(II)Z

    move-result v11

    if-nez v11, :cond_17

    const-string v11, "EIY"

    invoke-virtual {v0, v4}, Ljava/lang/StringBuffer;->charAt(I)C

    move-result v4

    invoke-virtual {v11, v4}, Ljava/lang/String;->indexOf(I)I

    move-result v4

    if-ltz v4, :cond_17

    if-nez v5, :cond_17

    .line 223
    invoke-virtual {v2, v10}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    goto/16 :goto_4

    .line 225
    :cond_17
    invoke-virtual {v2, v9}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    goto/16 :goto_4

    .line 246
    :pswitch_d
    invoke-virtual {v2, v4}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    goto/16 :goto_4

    :pswitch_e
    add-int/lit8 v4, v3, 0x1

    .line 191
    invoke-direct {p0, p1, v4}, Lorg/apache/commons/codec/language/Metaphone;->isLastChar(II)Z

    move-result v4

    if-nez v4, :cond_18

    invoke-direct {p0, v0, v3, v6}, Lorg/apache/commons/codec/language/Metaphone;->isNextChar(Ljava/lang/StringBuffer;IC)Z

    move-result v4

    if-eqz v4, :cond_18

    const-string v4, "EIY"

    add-int/lit8 v5, v3, 0x2

    invoke-virtual {v0, v5}, Ljava/lang/StringBuffer;->charAt(I)C

    move-result v12

    invoke-virtual {v4, v12}, Ljava/lang/String;->indexOf(I)I

    move-result v4

    if-ltz v4, :cond_18

    .line 194
    invoke-virtual {v2, v10}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    move v3, v5

    goto/16 :goto_4

    .line 196
    :cond_18
    invoke-virtual {v2, v11}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    goto/16 :goto_4

    .line 159
    :pswitch_f
    invoke-direct {p0, v0, v3, v8}, Lorg/apache/commons/codec/language/Metaphone;->isPreviousChar(Ljava/lang/StringBuffer;IC)Z

    move-result v4

    if-eqz v4, :cond_19

    invoke-direct {p0, p1, v3}, Lorg/apache/commons/codec/language/Metaphone;->isLastChar(II)Z

    move-result v4

    if-nez v4, :cond_19

    const-string v4, "EIY"

    add-int/lit8 v5, v3, 0x1

    invoke-virtual {v0, v5}, Ljava/lang/StringBuffer;->charAt(I)C

    move-result v5

    invoke-virtual {v4, v5}, Ljava/lang/String;->indexOf(I)I

    move-result v4

    if-ltz v4, :cond_19

    goto/16 :goto_4

    :cond_19
    const-string v4, "CIA"

    .line 164
    invoke-direct {p0, v0, v3, v4}, Lorg/apache/commons/codec/language/Metaphone;->regionMatch(Ljava/lang/StringBuffer;ILjava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_1a

    .line 165
    invoke-virtual {v2, v13}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    goto :goto_4

    .line 168
    :cond_1a
    invoke-direct {p0, p1, v3}, Lorg/apache/commons/codec/language/Metaphone;->isLastChar(II)Z

    move-result v4

    if-nez v4, :cond_1b

    const-string v4, "EIY"

    add-int/lit8 v5, v3, 0x1

    invoke-virtual {v0, v5}, Ljava/lang/StringBuffer;->charAt(I)C

    move-result v5

    invoke-virtual {v4, v5}, Ljava/lang/String;->indexOf(I)I

    move-result v4

    if-ltz v4, :cond_1b

    .line 170
    invoke-virtual {v2, v8}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    goto :goto_4

    .line 173
    :cond_1b
    invoke-direct {p0, v0, v3, v8}, Lorg/apache/commons/codec/language/Metaphone;->isPreviousChar(Ljava/lang/StringBuffer;IC)Z

    move-result v4

    if-eqz v4, :cond_1c

    invoke-direct {p0, v0, v3, v7}, Lorg/apache/commons/codec/language/Metaphone;->isNextChar(Ljava/lang/StringBuffer;IC)Z

    move-result v4

    if-eqz v4, :cond_1c

    .line 175
    invoke-virtual {v2, v9}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    goto :goto_4

    .line 178
    :cond_1c
    invoke-direct {p0, v0, v3, v7}, Lorg/apache/commons/codec/language/Metaphone;->isNextChar(Ljava/lang/StringBuffer;IC)Z

    move-result v4

    if-eqz v4, :cond_1e

    if-nez v3, :cond_1d

    const/4 v4, 0x3

    if-lt p1, v4, :cond_1d

    const/4 v4, 0x2

    .line 179
    invoke-direct {p0, v0, v4}, Lorg/apache/commons/codec/language/Metaphone;->isVowel(Ljava/lang/StringBuffer;I)Z

    move-result v4

    if-eqz v4, :cond_1d

    .line 182
    invoke-virtual {v2, v9}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    goto :goto_4

    .line 184
    :cond_1d
    invoke-virtual {v2, v13}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    goto :goto_4

    .line 187
    :cond_1e
    invoke-virtual {v2, v9}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    goto :goto_4

    :pswitch_10
    const/16 v5, 0x4d

    .line 151
    invoke-direct {p0, v0, v3, v5}, Lorg/apache/commons/codec/language/Metaphone;->isPreviousChar(Ljava/lang/StringBuffer;IC)Z

    move-result v5

    if-eqz v5, :cond_1f

    invoke-direct {p0, p1, v3}, Lorg/apache/commons/codec/language/Metaphone;->isLastChar(II)Z

    move-result v5

    if-eqz v5, :cond_1f

    goto :goto_4

    .line 155
    :cond_1f
    invoke-virtual {v2, v4}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    goto :goto_4

    :pswitch_11
    if-nez v3, :cond_20

    .line 147
    invoke-virtual {v2, v4}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    :cond_20
    :goto_4
    add-int/2addr v3, v1

    .line 310
    :goto_5
    invoke-virtual {v2}, Ljava/lang/StringBuffer;->length()I

    move-result v4

    invoke-virtual {p0}, Lorg/apache/commons/codec/language/Metaphone;->getMaxCodeLen()I

    move-result v5

    if-le v4, v5, :cond_8

    .line 311
    invoke-virtual {p0}, Lorg/apache/commons/codec/language/Metaphone;->getMaxCodeLen()I

    move-result v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuffer;->setLength(I)V

    goto/16 :goto_1

    .line 314
    :cond_21
    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_22
    :goto_6
    const-string p1, ""

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x57
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x41
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_11
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_11
        :pswitch_d
        :pswitch_a
        :pswitch_d
        :pswitch_d
        :pswitch_d
        :pswitch_11
        :pswitch_9
        :pswitch_8
        :pswitch_d
        :pswitch_7
        :pswitch_6
        :pswitch_11
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_4
        :pswitch_2
    .end packed-switch
.end method

.method public setMaxCodeLen(I)V
    .locals 0

    .line 405
    iput p1, p0, Lorg/apache/commons/codec/language/Metaphone;->maxCodeLen:I

    return-void
.end method
