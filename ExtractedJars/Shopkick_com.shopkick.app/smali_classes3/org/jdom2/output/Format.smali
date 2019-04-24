.class public Lorg/jdom2/output/Format;
.super Ljava/lang/Object;
.source "Format.java"

# interfaces
.implements Ljava/lang/Cloneable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/jdom2/output/Format$TextMode;,
        Lorg/jdom2/output/Format$DefaultCharsetEscapeStrategy;,
        Lorg/jdom2/output/Format$EscapeStrategy7Bits;,
        Lorg/jdom2/output/Format$EscapeStrategy8Bits;,
        Lorg/jdom2/output/Format$EscapeStrategyUTF;
    }
.end annotation


# static fields
.field private static final Bits7EscapeStrategy:Lorg/jdom2/output/EscapeStrategy;

.field private static final Bits8EscapeStrategy:Lorg/jdom2/output/EscapeStrategy;

.field private static final DefaultEscapeStrategy:Lorg/jdom2/output/EscapeStrategy;

.field private static final STANDARD_ENCODING:Ljava/lang/String; = "UTF-8"

.field private static final STANDARD_INDENT:Ljava/lang/String; = "  "

.field private static final STANDARD_LINE_SEPARATOR:Ljava/lang/String;

.field private static final UTFEscapeStrategy:Lorg/jdom2/output/EscapeStrategy;


# instance fields
.field encoding:Ljava/lang/String;

.field escapeStrategy:Lorg/jdom2/output/EscapeStrategy;

.field expandEmptyElements:Z

.field ignoreTrAXEscapingPIs:Z

.field indent:Ljava/lang/String;

.field lineSeparator:Ljava/lang/String;

.field mode:Lorg/jdom2/output/Format$TextMode;

.field omitDeclaration:Z

.field omitEncoding:Z

.field specifiedAttributesOnly:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 109
    new-instance v0, Lorg/jdom2/output/Format$EscapeStrategyUTF;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lorg/jdom2/output/Format$EscapeStrategyUTF;-><init>(Lorg/jdom2/output/Format$1;)V

    sput-object v0, Lorg/jdom2/output/Format;->UTFEscapeStrategy:Lorg/jdom2/output/EscapeStrategy;

    .line 125
    new-instance v0, Lorg/jdom2/output/Format$EscapeStrategy8Bits;

    invoke-direct {v0, v1}, Lorg/jdom2/output/Format$EscapeStrategy8Bits;-><init>(Lorg/jdom2/output/Format$1;)V

    sput-object v0, Lorg/jdom2/output/Format;->Bits8EscapeStrategy:Lorg/jdom2/output/EscapeStrategy;

    .line 141
    new-instance v0, Lorg/jdom2/output/Format$EscapeStrategy7Bits;

    invoke-direct {v0, v1}, Lorg/jdom2/output/Format$EscapeStrategy7Bits;-><init>(Lorg/jdom2/output/Format$1;)V

    sput-object v0, Lorg/jdom2/output/Format;->Bits7EscapeStrategy:Lorg/jdom2/output/EscapeStrategy;

    .line 147
    new-instance v0, Lorg/jdom2/output/Format$1;

    invoke-direct {v0}, Lorg/jdom2/output/Format$1;-><init>()V

    sput-object v0, Lorg/jdom2/output/Format;->DefaultEscapeStrategy:Lorg/jdom2/output/EscapeStrategy;

    .line 569
    sget-object v0, Lorg/jdom2/output/LineSeparator;->DEFAULT:Lorg/jdom2/output/LineSeparator;

    invoke-virtual {v0}, Lorg/jdom2/output/LineSeparator;->value()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lorg/jdom2/output/Format;->STANDARD_LINE_SEPARATOR:Ljava/lang/String;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .line 613
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 576
    iput-object v0, p0, Lorg/jdom2/output/Format;->indent:Ljava/lang/String;

    .line 579
    sget-object v0, Lorg/jdom2/output/Format;->STANDARD_LINE_SEPARATOR:Ljava/lang/String;

    iput-object v0, p0, Lorg/jdom2/output/Format;->lineSeparator:Ljava/lang/String;

    const-string v0, "UTF-8"

    .line 582
    iput-object v0, p0, Lorg/jdom2/output/Format;->encoding:Ljava/lang/String;

    const/4 v0, 0x0

    .line 586
    iput-boolean v0, p0, Lorg/jdom2/output/Format;->omitDeclaration:Z

    .line 590
    iput-boolean v0, p0, Lorg/jdom2/output/Format;->omitEncoding:Z

    .line 594
    iput-boolean v0, p0, Lorg/jdom2/output/Format;->specifiedAttributesOnly:Z

    .line 598
    iput-boolean v0, p0, Lorg/jdom2/output/Format;->expandEmptyElements:Z

    .line 602
    iput-boolean v0, p0, Lorg/jdom2/output/Format;->ignoreTrAXEscapingPIs:Z

    .line 605
    sget-object v0, Lorg/jdom2/output/Format$TextMode;->PRESERVE:Lorg/jdom2/output/Format$TextMode;

    iput-object v0, p0, Lorg/jdom2/output/Format;->mode:Lorg/jdom2/output/Format$TextMode;

    .line 608
    sget-object v0, Lorg/jdom2/output/Format;->DefaultEscapeStrategy:Lorg/jdom2/output/EscapeStrategy;

    iput-object v0, p0, Lorg/jdom2/output/Format;->escapeStrategy:Lorg/jdom2/output/EscapeStrategy;

    const-string v0, "UTF-8"

    .line 614
    invoke-virtual {p0, v0}, Lorg/jdom2/output/Format;->setEncoding(Ljava/lang/String;)Lorg/jdom2/output/Format;

    return-void
.end method

.method private static final chooseStrategy(Ljava/lang/String;)Lorg/jdom2/output/EscapeStrategy;
    .locals 2

    const-string v0, "UTF-8"

    .line 540
    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_5

    const-string v0, "UTF-16"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_2

    .line 545
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v0

    const-string v1, "ISO-8859-"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_4

    const-string v0, "Latin1"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    const-string v0, "US-ASCII"

    .line 550
    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_3

    const-string v0, "ASCII"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_0

    .line 556
    :cond_2
    :try_start_0
    invoke-static {p0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object p0

    invoke-virtual {p0}, Ljava/nio/charset/Charset;->newEncoder()Ljava/nio/charset/CharsetEncoder;

    move-result-object p0

    .line 557
    new-instance v0, Lorg/jdom2/output/Format$DefaultCharsetEscapeStrategy;

    invoke-direct {v0, p0}, Lorg/jdom2/output/Format$DefaultCharsetEscapeStrategy;-><init>(Ljava/nio/charset/CharsetEncoder;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    .line 561
    :catch_0
    sget-object p0, Lorg/jdom2/output/Format;->DefaultEscapeStrategy:Lorg/jdom2/output/EscapeStrategy;

    return-object p0

    .line 552
    :cond_3
    :goto_0
    sget-object p0, Lorg/jdom2/output/Format;->Bits7EscapeStrategy:Lorg/jdom2/output/EscapeStrategy;

    return-object p0

    .line 547
    :cond_4
    :goto_1
    sget-object p0, Lorg/jdom2/output/Format;->Bits8EscapeStrategy:Lorg/jdom2/output/EscapeStrategy;

    return-object p0

    .line 542
    :cond_5
    :goto_2
    sget-object p0, Lorg/jdom2/output/Format;->UTFEscapeStrategy:Lorg/jdom2/output/EscapeStrategy;

    return-object p0
.end method

.method public static final compact(Ljava/lang/String;)Ljava/lang/String;
    .locals 8

    .line 235
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x1

    sub-int/2addr v0, v1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-gt v3, v0, :cond_0

    .line 237
    invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C

    move-result v4

    invoke-static {v4}, Lorg/jdom2/Verifier;->isXMLWhitespace(C)Z

    move-result v4

    if-eqz v4, :cond_0

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    :goto_1
    if-le v0, v3, :cond_1

    .line 241
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result v4

    invoke-static {v4}, Lorg/jdom2/Verifier;->isXMLWhitespace(C)Z

    move-result v4

    if-eqz v4, :cond_1

    add-int/lit8 v0, v0, -0x1

    goto :goto_1

    :cond_1
    if-le v3, v0, :cond_2

    const-string p0, ""

    return-object p0

    .line 251
    :cond_2
    new-instance v4, Ljava/lang/StringBuilder;

    sub-int v5, v0, v3

    add-int/2addr v5, v1

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(I)V

    move v5, v1

    :goto_2
    if-gt v3, v0, :cond_5

    .line 253
    invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C

    move-result v6

    .line 254
    invoke-static {v6}, Lorg/jdom2/Verifier;->isXMLWhitespace(C)Z

    move-result v7

    if-eqz v7, :cond_3

    if-eqz v5, :cond_4

    const/16 v5, 0x20

    .line 256
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move v5, v2

    goto :goto_3

    .line 260
    :cond_3
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move v5, v1

    :cond_4
    :goto_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    .line 265
    :cond_5
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final escapeAttribute(Lorg/jdom2/output/EscapeStrategy;Ljava/lang/String;)Ljava/lang/String;
    .locals 13

    .line 348
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    const/16 v3, 0x22

    const/16 v4, 0xd

    const/16 v5, 0x26

    const/16 v6, 0x3e

    const/16 v7, 0x3c

    if-ge v2, v0, :cond_1

    .line 352
    invoke-virtual {p1, v2}, Ljava/lang/String;->charAt(I)C

    move-result v8

    if-eq v8, v7, :cond_1

    if-eq v8, v6, :cond_1

    if-eq v8, v5, :cond_1

    if-eq v8, v4, :cond_1

    const/16 v9, 0xa

    if-eq v8, v9, :cond_1

    if-eq v8, v3, :cond_1

    const/16 v9, 0x9

    if-eq v8, v9, :cond_1

    .line 353
    invoke-interface {p0, v8}, Lorg/jdom2/output/EscapeStrategy;->shouldEscape(C)Z

    move-result v8

    if-eqz v8, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    if-ne v2, v0, :cond_2

    return-object p1

    .line 365
    :cond_2
    new-instance v8, Ljava/lang/StringBuilder;

    add-int/lit8 v9, v0, 0x5

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 366
    invoke-virtual {v8, p1, v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    move v9, v1

    :goto_2
    if-ge v2, v0, :cond_c

    add-int/lit8 v10, v2, 0x1

    .line 368
    invoke-virtual {p1, v2}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v11, 0x3b

    if-lez v9, :cond_4

    .line 370
    invoke-static {v2}, Lorg/jdom2/Verifier;->isLowSurrogate(C)Z

    move-result v12

    if-eqz v12, :cond_3

    .line 376
    invoke-static {v9, v2}, Lorg/jdom2/Verifier;->decodeSurrogatePair(CC)I

    move-result v2

    const-string v9, "&#x"

    .line 377
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 378
    invoke-static {v2}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 379
    invoke-virtual {v8, v11}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move v9, v1

    move v2, v10

    goto :goto_2

    .line 371
    :cond_3
    new-instance p0, Lorg/jdom2/IllegalDataException;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Could not decode surrogate pair 0x"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v9}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " / 0x"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v2}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lorg/jdom2/IllegalDataException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_4
    if-eq v2, v4, :cond_b

    if-eq v2, v3, :cond_a

    if-eq v2, v5, :cond_9

    if-eq v2, v7, :cond_8

    if-eq v2, v6, :cond_7

    packed-switch v2, :pswitch_data_0

    .line 407
    invoke-interface {p0, v2}, Lorg/jdom2/output/EscapeStrategy;->shouldEscape(C)Z

    move-result v12

    if-eqz v12, :cond_6

    .line 410
    invoke-static {v2}, Lorg/jdom2/Verifier;->isHighSurrogate(C)Z

    move-result v12

    if-eqz v12, :cond_5

    move v9, v2

    goto :goto_3

    :cond_5
    const-string v12, "&#x"

    .line 414
    invoke-virtual {v8, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 415
    invoke-static {v2}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 416
    invoke-virtual {v8, v11}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_3

    .line 419
    :cond_6
    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_3

    :pswitch_0
    const-string v2, "&#xA;"

    .line 403
    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_3

    :pswitch_1
    const-string v2, "&#x9;"

    .line 400
    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_3

    :cond_7
    const-string v2, "&gt;"

    .line 388
    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_3

    :cond_8
    const-string v2, "&lt;"

    .line 385
    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_3

    :cond_9
    const-string v2, "&amp;"

    .line 391
    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_3

    :cond_a
    const-string v2, "&quot;"

    .line 397
    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_3

    :cond_b
    const-string v2, "&#xD;"

    .line 394
    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_3
    move v2, v10

    goto/16 :goto_2

    :cond_c
    if-gtz v9, :cond_d

    .line 429
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 425
    :cond_d
    new-instance p0, Lorg/jdom2/IllegalDataException;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Surrogate pair 0x"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v9}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "truncated"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lorg/jdom2/IllegalDataException;-><init>(Ljava/lang/String;)V

    throw p0

    nop

    :pswitch_data_0
    .packed-switch 0x9
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static final escapeText(Lorg/jdom2/output/EscapeStrategy;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 13

    .line 457
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    const/16 v3, 0xd

    const/16 v4, 0x26

    const/16 v5, 0x3e

    const/16 v6, 0x3c

    const/16 v7, 0xa

    if-ge v2, v0, :cond_1

    .line 460
    invoke-virtual {p2, v2}, Ljava/lang/String;->charAt(I)C

    move-result v8

    if-eq v8, v6, :cond_1

    if-eq v8, v5, :cond_1

    if-eq v8, v4, :cond_1

    if-eq v8, v3, :cond_1

    if-eq v8, v7, :cond_1

    .line 461
    invoke-interface {p0, v8}, Lorg/jdom2/output/EscapeStrategy;->shouldEscape(C)Z

    move-result v8

    if-eqz v8, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    if-ne v2, v0, :cond_2

    return-object p2

    .line 473
    :cond_2
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    if-lez v2, :cond_3

    .line 475
    invoke-virtual {v8, p2, v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    :cond_3
    move v9, v1

    :goto_2
    if-ge v2, v0, :cond_e

    add-int/lit8 v10, v2, 0x1

    .line 479
    invoke-virtual {p2, v2}, Ljava/lang/String;->charAt(I)C

    move-result v2

    if-lez v9, :cond_5

    .line 481
    invoke-static {v2}, Lorg/jdom2/Verifier;->isLowSurrogate(C)Z

    move-result v11

    if-eqz v11, :cond_4

    .line 487
    invoke-static {v9, v2}, Lorg/jdom2/Verifier;->decodeSurrogatePair(CC)I

    move-result v2

    .line 488
    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "&#x"

    invoke-virtual {v9, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v2}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ";"

    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move v9, v1

    move v2, v10

    goto :goto_2

    .line 482
    :cond_4
    new-instance p0, Lorg/jdom2/IllegalDataException;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "Could not decode surrogate pair 0x"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v9}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, " / 0x"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v2}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lorg/jdom2/IllegalDataException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_5
    if-eq v2, v7, :cond_c

    if-eq v2, v3, :cond_b

    if-eq v2, v4, :cond_a

    if-eq v2, v6, :cond_9

    if-eq v2, v5, :cond_8

    .line 514
    invoke-interface {p0, v2}, Lorg/jdom2/output/EscapeStrategy;->shouldEscape(C)Z

    move-result v11

    if-eqz v11, :cond_7

    .line 517
    invoke-static {v2}, Lorg/jdom2/Verifier;->isHighSurrogate(C)Z

    move-result v11

    if-eqz v11, :cond_6

    move v9, v2

    goto :goto_3

    .line 521
    :cond_6
    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    const-string v12, "&#x"

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v2}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v11, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ";"

    invoke-virtual {v11, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_3

    .line 524
    :cond_7
    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_3

    :cond_8
    const-string v2, "&gt;"

    .line 497
    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_3

    :cond_9
    const-string v2, "&lt;"

    .line 494
    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_3

    :cond_a
    const-string v2, "&amp;"

    .line 500
    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_3

    :cond_b
    const-string v2, "&#xD;"

    .line 503
    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_3

    :cond_c
    if-eqz p1, :cond_d

    .line 507
    invoke-virtual {v8, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_3

    .line 509
    :cond_d
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :goto_3
    move v2, v10

    goto/16 :goto_2

    :cond_e
    if-gtz v9, :cond_f

    .line 534
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 530
    :cond_f
    new-instance p0, Lorg/jdom2/IllegalDataException;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "Surrogate pair 0x"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v9}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "truncated"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lorg/jdom2/IllegalDataException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static getCompactFormat()Lorg/jdom2/output/Format;
    .locals 2

    .line 221
    new-instance v0, Lorg/jdom2/output/Format;

    invoke-direct {v0}, Lorg/jdom2/output/Format;-><init>()V

    .line 222
    sget-object v1, Lorg/jdom2/output/Format$TextMode;->NORMALIZE:Lorg/jdom2/output/Format$TextMode;

    invoke-virtual {v0, v1}, Lorg/jdom2/output/Format;->setTextMode(Lorg/jdom2/output/Format$TextMode;)Lorg/jdom2/output/Format;

    return-object v0
.end method

.method public static getPrettyFormat()Lorg/jdom2/output/Format;
    .locals 2

    .line 205
    new-instance v0, Lorg/jdom2/output/Format;

    invoke-direct {v0}, Lorg/jdom2/output/Format;-><init>()V

    const-string v1, "  "

    .line 206
    invoke-virtual {v0, v1}, Lorg/jdom2/output/Format;->setIndent(Ljava/lang/String;)Lorg/jdom2/output/Format;

    .line 207
    sget-object v1, Lorg/jdom2/output/Format$TextMode;->TRIM:Lorg/jdom2/output/Format$TextMode;

    invoke-virtual {v0, v1}, Lorg/jdom2/output/Format;->setTextMode(Lorg/jdom2/output/Format$TextMode;)Lorg/jdom2/output/Format;

    return-object v0
.end method

.method public static getRawFormat()Lorg/jdom2/output/Format;
    .locals 1

    .line 191
    new-instance v0, Lorg/jdom2/output/Format;

    invoke-direct {v0}, Lorg/jdom2/output/Format;-><init>()V

    return-object v0
.end method

.method public static final trimBoth(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 314
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-lez v0, :cond_0

    .line 315
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result v1

    invoke-static {v1}, Lorg/jdom2/Verifier;->isXMLWhitespace(C)Z

    move-result v1

    if-eqz v1, :cond_0

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_1
    if-gt v1, v0, :cond_1

    .line 319
    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    invoke-static {v2}, Lorg/jdom2/Verifier;->isXMLWhitespace(C)Z

    move-result v2

    if-eqz v2, :cond_1

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_1
    if-le v1, v0, :cond_2

    const-string p0, ""

    return-object p0

    :cond_2
    add-int/lit8 v0, v0, 0x1

    .line 325
    invoke-virtual {p0, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final trimLeft(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 294
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    .line 296
    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    invoke-static {v2}, Lorg/jdom2/Verifier;->isXMLWhitespace(C)Z

    move-result v2

    if-eqz v2, :cond_0

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    if-lt v1, v0, :cond_1

    const-string p0, ""

    return-object p0

    .line 303
    :cond_1
    invoke-virtual {p0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final trimRight(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 276
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-ltz v0, :cond_0

    .line 277
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result v1

    invoke-static {v1}, Lorg/jdom2/Verifier;->isXMLWhitespace(C)Z

    move-result v1

    if-eqz v1, :cond_0

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_0
    if-gez v0, :cond_1

    const-string p0, ""

    return-object p0

    :cond_1
    const/4 v1, 0x0

    add-int/lit8 v0, v0, 0x1

    .line 283
    invoke-virtual {p0, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/CloneNotSupportedException;
        }
    .end annotation

    .line 93
    invoke-virtual {p0}, Lorg/jdom2/output/Format;->clone()Lorg/jdom2/output/Format;

    move-result-object v0

    return-object v0
.end method

.method public clone()Lorg/jdom2/output/Format;
    .locals 1

    .line 936
    :try_start_0
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/jdom2/output/Format;
    :try_end_0
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public getEncoding()Ljava/lang/String;
    .locals 1

    .line 907
    iget-object v0, p0, Lorg/jdom2/output/Format;->encoding:Ljava/lang/String;

    return-object v0
.end method

.method public getEscapeStrategy()Lorg/jdom2/output/EscapeStrategy;
    .locals 1

    .line 634
    iget-object v0, p0, Lorg/jdom2/output/Format;->escapeStrategy:Lorg/jdom2/output/EscapeStrategy;

    return-object v0
.end method

.method public getExpandEmptyElements()Z
    .locals 1

    .line 798
    iget-boolean v0, p0, Lorg/jdom2/output/Format;->expandEmptyElements:Z

    return v0
.end method

.method public getIgnoreTrAXEscapingPIs()Z
    .locals 1

    .line 839
    iget-boolean v0, p0, Lorg/jdom2/output/Format;->ignoreTrAXEscapingPIs:Z

    return v0
.end method

.method public getIndent()Ljava/lang/String;
    .locals 1

    .line 884
    iget-object v0, p0, Lorg/jdom2/output/Format;->indent:Ljava/lang/String;

    return-object v0
.end method

.method public getLineSeparator()Ljava/lang/String;
    .locals 1

    .line 726
    iget-object v0, p0, Lorg/jdom2/output/Format;->lineSeparator:Ljava/lang/String;

    return-object v0
.end method

.method public getOmitDeclaration()Z
    .locals 1

    .line 775
    iget-boolean v0, p0, Lorg/jdom2/output/Format;->omitDeclaration:Z

    return v0
.end method

.method public getOmitEncoding()Z
    .locals 1

    .line 751
    iget-boolean v0, p0, Lorg/jdom2/output/Format;->omitEncoding:Z

    return v0
.end method

.method public getTextMode()Lorg/jdom2/output/Format$TextMode;
    .locals 1

    .line 860
    iget-object v0, p0, Lorg/jdom2/output/Format;->mode:Lorg/jdom2/output/Format$TextMode;

    return-object v0
.end method

.method public isSpecifiedAttributesOnly()Z
    .locals 1

    .line 917
    iget-boolean v0, p0, Lorg/jdom2/output/Format;->specifiedAttributesOnly:Z

    return v0
.end method

.method public setEncoding(Ljava/lang/String;)Lorg/jdom2/output/Format;
    .locals 0

    .line 896
    iput-object p1, p0, Lorg/jdom2/output/Format;->encoding:Ljava/lang/String;

    .line 897
    invoke-static {p1}, Lorg/jdom2/output/Format;->chooseStrategy(Ljava/lang/String;)Lorg/jdom2/output/EscapeStrategy;

    move-result-object p1

    iput-object p1, p0, Lorg/jdom2/output/Format;->escapeStrategy:Lorg/jdom2/output/EscapeStrategy;

    return-object p0
.end method

.method public setEscapeStrategy(Lorg/jdom2/output/EscapeStrategy;)Lorg/jdom2/output/Format;
    .locals 0

    .line 624
    iput-object p1, p0, Lorg/jdom2/output/Format;->escapeStrategy:Lorg/jdom2/output/EscapeStrategy;

    return-object p0
.end method

.method public setExpandEmptyElements(Z)Lorg/jdom2/output/Format;
    .locals 0

    .line 788
    iput-boolean p1, p0, Lorg/jdom2/output/Format;->expandEmptyElements:Z

    return-object p0
.end method

.method public setIgnoreTrAXEscapingPIs(Z)V
    .locals 0

    .line 829
    iput-boolean p1, p0, Lorg/jdom2/output/Format;->ignoreTrAXEscapingPIs:Z

    return-void
.end method

.method public setIndent(Ljava/lang/String;)Lorg/jdom2/output/Format;
    .locals 0

    .line 874
    iput-object p1, p0, Lorg/jdom2/output/Format;->indent:Ljava/lang/String;

    return-object p0
.end method

.method public setLineSeparator(Ljava/lang/String;)Lorg/jdom2/output/Format;
    .locals 1

    const-string v0, ""

    .line 695
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    :cond_0
    iput-object p1, p0, Lorg/jdom2/output/Format;->lineSeparator:Ljava/lang/String;

    return-object p0
.end method

.method public setLineSeparator(Lorg/jdom2/output/LineSeparator;)Lorg/jdom2/output/Format;
    .locals 0

    if-nez p1, :cond_0

    .line 715
    sget-object p1, Lorg/jdom2/output/Format;->STANDARD_LINE_SEPARATOR:Ljava/lang/String;

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lorg/jdom2/output/LineSeparator;->value()Ljava/lang/String;

    move-result-object p1

    :goto_0
    invoke-virtual {p0, p1}, Lorg/jdom2/output/Format;->setLineSeparator(Ljava/lang/String;)Lorg/jdom2/output/Format;

    move-result-object p1

    return-object p1
.end method

.method public setOmitDeclaration(Z)Lorg/jdom2/output/Format;
    .locals 0

    .line 765
    iput-boolean p1, p0, Lorg/jdom2/output/Format;->omitDeclaration:Z

    return-object p0
.end method

.method public setOmitEncoding(Z)Lorg/jdom2/output/Format;
    .locals 0

    .line 741
    iput-boolean p1, p0, Lorg/jdom2/output/Format;->omitEncoding:Z

    return-object p0
.end method

.method public setSpecifiedAttributesOnly(Z)V
    .locals 0

    .line 928
    iput-boolean p1, p0, Lorg/jdom2/output/Format;->specifiedAttributesOnly:Z

    return-void
.end method

.method public setTextMode(Lorg/jdom2/output/Format$TextMode;)Lorg/jdom2/output/Format;
    .locals 0

    .line 850
    iput-object p1, p0, Lorg/jdom2/output/Format;->mode:Lorg/jdom2/output/Format$TextMode;

    return-object p0
.end method
