.class public final Lorg/jdom2/Verifier;
.super Ljava/lang/Object;
.source "Verifier.java"


# static fields
.field private static final CHARCNT:I = 0x10000

.field private static final CHARFLAGS:[B

.field private static final LENCONST:[I

.field private static final MASKURICHAR:B = 0x40t

.field private static final MASKXMLCHARACTER:B = 0x1t

.field private static final MASKXMLCOMBINING:B = 0x20t

.field private static final MASKXMLDIGIT:B = 0x10t

.field private static final MASKXMLLETTER:B = 0x2t

.field private static final MASKXMLLETTERORDIGIT:B = 0x12t

.field private static final MASKXMLNAMECHAR:B = 0x8t

.field private static final MASKXMLSTARTCHAR:B = 0x4t

.field private static final VALCONST:[B


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/16 v0, 0x26e

    .line 137
    new-array v1, v0, [B

    fill-array-data v1, :array_0

    sput-object v1, Lorg/jdom2/Verifier;->VALCONST:[B

    .line 220
    new-array v0, v0, [I

    fill-array-data v0, :array_1

    sput-object v0, Lorg/jdom2/Verifier;->LENCONST:[I

    .line 310
    invoke-static {}, Lorg/jdom2/Verifier;->buildBitFlags()[B

    move-result-object v0

    sput-object v0, Lorg/jdom2/Verifier;->CHARFLAGS:[B

    return-void

    nop

    :array_0
    .array-data 1
        0x0t
        0x1t
        0x0t
        0x1t
        0x0t
        0x1t
        0x41t
        0x1t
        0x41t
        0x49t
        0x41t
        0x59t
        0x41t
        0x1t
        0x41t
        0x1t
        0x41t
        0x4ft
        0x1t
        0x4dt
        0x1t
        0x4ft
        0x1t
        0x41t
        0x1t
        0x9t
        0x1t
        0xft
        0x1t
        0xft
        0x1t
        0xft
        0x1t
        0xft
        0x1t
        0xft
        0x1t
        0xft
        0x1t
        0xft
        0x1t
        0xft
        0x1t
        0xft
        0x1t
        0xft
        0x1t
        0xft
        0x1t
        0xft
        0x1t
        0x9t
        0x1t
        0x29t
        0x1t
        0x29t
        0x1t
        0xft
        0x9t
        0xft
        0x1t
        0xft
        0x1t
        0xft
        0x1t
        0xft
        0x1t
        0xft
        0x1t
        0xft
        0x1t
        0xft
        0x1t
        0xft
        0x1t
        0xft
        0x1t
        0xft
        0x1t
        0xft
        0x1t
        0xft
        0x1t
        0xft
        0x1t
        0xft
        0x1t
        0x29t
        0x1t
        0xft
        0x1t
        0xft
        0x1t
        0xft
        0x1t
        0xft
        0x1t
        0xft
        0x1t
        0xft
        0x1t
        0xft
        0x1t
        0xft
        0x1t
        0xft
        0x1t
        0x29t
        0x1t
        0x29t
        0x1t
        0x29t
        0x1t
        0x29t
        0x1t
        0x29t
        0x1t
        0x29t
        0x1t
        0xft
        0x1t
        0xft
        0x1t
        0xft
        0x1t
        0x9t
        0xft
        0x29t
        0x1t
        0x19t
        0x1t
        0x29t
        0xft
        0x1t
        0xft
        0x1t
        0xft
        0x1t
        0xft
        0x1t
        0xft
        0x29t
        0xft
        0x29t
        0x1t
        0x29t
        0x1t
        0x19t
        0x1t
        0x29t
        0x1t
        0xft
        0x1t
        0x29t
        0xft
        0x29t
        0x1t
        0x29t
        0x1t
        0xft
        0x29t
        0x1t
        0x19t
        0x1t
        0x29t
        0x1t
        0xft
        0x1t
        0xft
        0x1t
        0xft
        0x1t
        0xft
        0x1t
        0xft
        0x1t
        0xft
        0x1t
        0x29t
        0x1t
        0x29t
        0x1t
        0x29t
        0x1t
        0x29t
        0x1t
        0x29t
        0x1t
        0xft
        0x1t
        0xft
        0x29t
        0x1t
        0x19t
        0xft
        0x1t
        0x29t
        0x1t
        0xft
        0x1t
        0xft
        0x1t
        0xft
        0x1t
        0xft
        0x1t
        0xft
        0x1t
        0xft
        0x1t
        0xft
        0x1t
        0x29t
        0x1t
        0x29t
        0x1t
        0x29t
        0x1t
        0x29t
        0x1t
        0xft
        0x1t
        0xft
        0x1t
        0x19t
        0x29t
        0xft
        0x1t
        0x29t
        0x1t
        0xft
        0x1t
        0xft
        0x1t
        0xft
        0x1t
        0xft
        0x1t
        0xft
        0x1t
        0xft
        0x1t
        0xft
        0x1t
        0x29t
        0xft
        0x29t
        0x1t
        0x29t
        0x1t
        0x29t
        0x1t
        0xft
        0x1t
        0x19t
        0x1t
        0x29t
        0x1t
        0xft
        0x1t
        0xft
        0x1t
        0xft
        0x1t
        0xft
        0x1t
        0xft
        0x1t
        0xft
        0x1t
        0x29t
        0xft
        0x29t
        0x1t
        0x29t
        0x1t
        0x29t
        0x1t
        0x29t
        0x1t
        0xft
        0x1t
        0xft
        0x1t
        0x19t
        0x1t
        0x29t
        0x1t
        0xft
        0x1t
        0xft
        0x1t
        0xft
        0x1t
        0xft
        0x1t
        0xft
        0x1t
        0xft
        0x1t
        0xft
        0x1t
        0xft
        0x1t
        0xft
        0x1t
        0xft
        0x1t
        0x29t
        0x1t
        0x29t
        0x1t
        0x29t
        0x1t
        0x29t
        0x1t
        0x19t
        0x1t
        0x29t
        0x1t
        0xft
        0x1t
        0xft
        0x1t
        0xft
        0x1t
        0xft
        0x1t
        0xft
        0x1t
        0x29t
        0x1t
        0x29t
        0x1t
        0x29t
        0x1t
        0x29t
        0x1t
        0xft
        0x1t
        0x19t
        0x1t
        0x29t
        0x1t
        0xft
        0x1t
        0xft
        0x1t
        0xft
        0x1t
        0xft
        0x1t
        0xft
        0x1t
        0x29t
        0x1t
        0x29t
        0x1t
        0x29t
        0x1t
        0x29t
        0x1t
        0xft
        0x1t
        0xft
        0x1t
        0x19t
        0x1t
        0x29t
        0x1t
        0xft
        0x1t
        0xft
        0x1t
        0xft
        0x1t
        0xft
        0x1t
        0x29t
        0x1t
        0x29t
        0x1t
        0x29t
        0x1t
        0x29t
        0x1t
        0xft
        0x1t
        0x19t
        0x1t
        0xft
        0x1t
        0xft
        0x29t
        0xft
        0x29t
        0x1t
        0xft
        0x9t
        0x29t
        0x1t
        0x19t
        0x1t
        0xft
        0x1t
        0xft
        0x1t
        0xft
        0x1t
        0xft
        0x1t
        0xft
        0x1t
        0xft
        0x1t
        0xft
        0x1t
        0xft
        0x1t
        0xft
        0x1t
        0xft
        0x1t
        0xft
        0x1t
        0xft
        0x1t
        0xft
        0x29t
        0xft
        0x29t
        0x1t
        0x29t
        0xft
        0x1t
        0xft
        0x1t
        0x9t
        0x1t
        0x29t
        0x1t
        0x19t
        0x1t
        0x29t
        0x1t
        0x19t
        0x1t
        0x29t
        0x1t
        0x29t
        0x1t
        0x29t
        0x1t
        0x29t
        0xft
        0x1t
        0xft
        0x1t
        0x29t
        0x1t
        0x29t
        0x1t
        0x29t
        0x1t
        0x29t
        0x1t
        0x29t
        0x1t
        0x29t
        0x1t
        0x29t
        0x1t
        0xft
        0x1t
        0xft
        0x1t
        0xft
        0x1t
        0xft
        0x1t
        0xft
        0x1t
        0xft
        0x1t
        0xft
        0x1t
        0xft
        0x1t
        0xft
        0x1t
        0xft
        0x1t
        0xft
        0x1t
        0xft
        0x1t
        0xft
        0x1t
        0xft
        0x1t
        0xft
        0x1t
        0xft
        0x1t
        0xft
        0x1t
        0xft
        0x1t
        0xft
        0x1t
        0xft
        0x1t
        0xft
        0x1t
        0xft
        0x1t
        0xft
        0x1t
        0xft
        0x1t
        0xft
        0x1t
        0xft
        0x1t
        0xft
        0x1t
        0xft
        0x1t
        0xft
        0x1t
        0xft
        0x1t
        0xft
        0x1t
        0xft
        0x1t
        0xft
        0x1t
        0xft
        0x1t
        0xft
        0x1t
        0xft
        0x1t
        0xft
        0x1t
        0xft
        0x1t
        0xft
        0x1t
        0xft
        0x1t
        0xft
        0x1t
        0xft
        0x1t
        0xft
        0x1t
        0xft
        0x1t
        0xft
        0x1t
        0xft
        0x1t
        0xft
        0x1t
        0xft
        0x1t
        0xft
        0x1t
        0xft
        0x1t
        0xft
        0x1t
        0xft
        0x1t
        0xft
        0x1t
        0xft
        0x1t
        0xft
        0x1t
        0x29t
        0x1t
        0x29t
        0x1t
        0xft
        0x1t
        0xft
        0x1t
        0xft
        0x1t
        0xft
        0x1t
        0x9t
        0x1t
        0xft
        0x1t
        0xft
        0x29t
        0x1t
        0x9t
        0x1t
        0xft
        0x1t
        0x29t
        0x1t
        0x9t
        0x1t
        0xft
        0x1t
        0x9t
        0x1t
        0xft
        0x1t
        0xft
        0x1t
        0xft
        0x1t
        0x0t
        0x1t
        0x0t
    .end array-data

    nop

    :array_1
    .array-data 4
        0x9
        0x2
        0x2
        0x1
        0x12
        0x1
        0x1
        0x2
        0x9
        0x2
        0x1
        0xa
        0x1
        0x2
        0x1
        0x1
        0x2
        0x1a
        0x4
        0x1
        0x1
        0x1a
        0x3
        0x1
        0x38
        0x1
        0x8
        0x17
        0x1
        0x1f
        0x1
        0x3a
        0x2
        0xb
        0x2
        0x8
        0x1
        0x35
        0x1
        0x44
        0x9
        0x24
        0x3
        0x2
        0x4
        0x1e
        0x38
        0x59
        0x12
        0x7
        0xe
        0x2
        0x2e
        0x46
        0x1a
        0x2
        0x24
        0x1
        0x1
        0x3
        0x1
        0x1
        0x1
        0x14
        0x1
        0x2c
        0x1
        0x7
        0x3
        0x1
        0x1
        0x1
        0x1
        0x1
        0x1
        0x1
        0x1
        0x12
        0xd
        0xc
        0x1
        0x42
        0x1
        0xc
        0x1
        0x24
        0x1
        0x4
        0x9
        0x35
        0x2
        0x2
        0x2
        0x2
        0x3
        0x1c
        0x2
        0x8
        0x2
        0x2
        0x37
        0x26
        0x2
        0x1
        0x7
        0x26
        0xa
        0x11
        0x1
        0x17
        0x1
        0x3
        0x1
        0x1
        0x1
        0x2
        0x1
        0x1
        0xb
        0x1b
        0x5
        0x3
        0x2e
        0x1a
        0x5
        0x1
        0xa
        0x8
        0xd
        0xa
        0x6
        0x1
        0x47
        0x2
        0x5
        0x1
        0xf
        0x1
        0x4
        0x1
        0x1
        0xf
        0x2
        0x2
        0x1
        0x4
        0x2
        0xa
        0x207
        0x3
        0x1
        0x35
        0x2
        0x1
        0x1
        0x10
        0x3
        0x4
        0x3
        0xa
        0x2
        0x2
        0xa
        0x11
        0x3
        0x1
        0x8
        0x2
        0x2
        0x2
        0x16
        0x1
        0x7
        0x1
        0x1
        0x3
        0x4
        0x2
        0x1
        0x1
        0x7
        0x2
        0x2
        0x2
        0x3
        0x9
        0x1
        0x4
        0x2
        0x1
        0x3
        0x2
        0x2
        0xa
        0x2
        0x10
        0x1
        0x2
        0x6
        0x4
        0x2
        0x2
        0x16
        0x1
        0x7
        0x1
        0x2
        0x1
        0x2
        0x1
        0x2
        0x2
        0x1
        0x1
        0x5
        0x4
        0x2
        0x2
        0x3
        0xb
        0x4
        0x1
        0x1
        0x7
        0xa
        0x2
        0x3
        0xc
        0x3
        0x1
        0x7
        0x1
        0x1
        0x1
        0x3
        0x1
        0x16
        0x1
        0x7
        0x1
        0x2
        0x1
        0x5
        0x2
        0x1
        0x1
        0x8
        0x1
        0x3
        0x1
        0x3
        0x12
        0x1
        0x5
        0xa
        0x11
        0x3
        0x1
        0x8
        0x2
        0x2
        0x2
        0x16
        0x1
        0x7
        0x1
        0x2
        0x2
        0x4
        0x2
        0x1
        0x1
        0x6
        0x3
        0x2
        0x2
        0x3
        0x8
        0x2
        0x4
        0x2
        0x1
        0x3
        0x4
        0xa
        0x12
        0x2
        0x1
        0x6
        0x3
        0x3
        0x1
        0x4
        0x3
        0x2
        0x1
        0x1
        0x1
        0x2
        0x3
        0x2
        0x3
        0x3
        0x3
        0x8
        0x1
        0x3
        0x4
        0x5
        0x3
        0x3
        0x1
        0x4
        0x9
        0x1
        0xf
        0x9
        0x11
        0x3
        0x1
        0x8
        0x1
        0x3
        0x1
        0x17
        0x1
        0xa
        0x1
        0x5
        0x4
        0x7
        0x1
        0x3
        0x1
        0x4
        0x7
        0x2
        0x9
        0x2
        0x4
        0xa
        0x12
        0x2
        0x1
        0x8
        0x1
        0x3
        0x1
        0x17
        0x1
        0xa
        0x1
        0x5
        0x4
        0x7
        0x1
        0x3
        0x1
        0x4
        0x7
        0x2
        0x7
        0x1
        0x1
        0x2
        0x4
        0xa
        0x12
        0x2
        0x1
        0x8
        0x1
        0x3
        0x1
        0x17
        0x1
        0x10
        0x4
        0x6
        0x2
        0x3
        0x1
        0x4
        0x9
        0x1
        0x8
        0x2
        0x4
        0xa
        0x91
        0x2e
        0x1
        0x1
        0x1
        0x2
        0x7
        0x5
        0x6
        0x1
        0x8
        0x1
        0xa
        0x27
        0x2
        0x1
        0x1
        0x2
        0x2
        0x1
        0x1
        0x2
        0x1
        0x6
        0x4
        0x1
        0x7
        0x1
        0x3
        0x1
        0x1
        0x1
        0x1
        0x2
        0x2
        0x1
        0x2
        0x1
        0x1
        0x1
        0x2
        0x6
        0x1
        0x2
        0x1
        0x2
        0x5
        0x1
        0x1
        0x1
        0x6
        0x2
        0xa
        0x3e
        0x2
        0x6
        0xa
        0xb
        0x1
        0x1
        0x1
        0x1
        0x1
        0x4
        0x2
        0x8
        0x1
        0x21
        0x7
        0x14
        0x1
        0x6
        0x4
        0x6
        0x1
        0x1
        0x1
        0x15
        0x3
        0x7
        0x1
        0x1
        0xe6
        0x26
        0xa
        0x27
        0x9
        0x1
        0x1
        0x2
        0x1
        0x3
        0x1
        0x1
        0x1
        0x2
        0x1
        0x5
        0x29
        0x1
        0x1
        0x1
        0x1
        0x1
        0xb
        0x1
        0x1
        0x1
        0x1
        0x1
        0x3
        0x2
        0x3
        0x1
        0x5
        0x3
        0x1
        0x1
        0x1
        0x1
        0x1
        0x1
        0x1
        0x1
        0x3
        0x2
        0x3
        0x2
        0x1
        0x1
        0x28
        0x1
        0x9
        0x1
        0x2
        0x1
        0x2
        0x2
        0x7
        0x2
        0x1
        0x1
        0x1
        0x7
        0x28
        0x1
        0x4
        0x1
        0x8
        0x1
        0xc06
        0x9c
        0x4
        0x5a
        0x6
        0x16
        0x2
        0x6
        0x2
        0x26
        0x2
        0x6
        0x2
        0x8
        0x1
        0x1
        0x1
        0x1
        0x1
        0x1
        0x1
        0x1f
        0x2
        0x35
        0x1
        0x7
        0x1
        0x1
        0x3
        0x3
        0x1
        0x7
        0x3
        0x4
        0x2
        0x6
        0x4
        0xd
        0x5
        0x3
        0x1
        0x7
        0xd3
        0xd
        0x4
        0x1
        0x44
        0x1
        0x3
        0x2
        0x2
        0x1
        0x51
        0x3
        0xe82
        0x1
        0x1
        0x1
        0x19
        0x9
        0x6
        0x1
        0x5
        0xb
        0x54
        0x4
        0x2
        0x2
        0x2
        0x2
        0x5a
        0x1
        0x3
        0x6
        0x28
        0x1cd3
        0x51a6
        0xc5a
        0x2ba4
        0x5c
        0x800
        0x1ffe
        0x2
    .end array-data
.end method

.method private constructor <init>()V
    .locals 0

    .line 353
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static final buildBitFlags()[B
    .locals 6

    const/high16 v0, 0x10000

    .line 317
    new-array v0, v0, [B

    const/4 v1, 0x0

    move v2, v1

    .line 319
    :goto_0
    sget-object v3, Lorg/jdom2/Verifier;->VALCONST:[B

    array-length v4, v3

    if-ge v1, v4, :cond_1

    .line 321
    aget-byte v3, v3, v1

    .line 324
    sget-object v4, Lorg/jdom2/Verifier;->LENCONST:[I

    aget v4, v4, v1

    :goto_1
    add-int/lit8 v4, v4, -0x1

    if-ltz v4, :cond_0

    add-int/lit8 v5, v2, 0x1

    .line 327
    aput-byte v3, v0, v2

    move v2, v5

    goto :goto_1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public static checkAttributeName(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const-string v0, "xmlns"

    .line 407
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string p0, "An Attribute name may not be \"xmlns\"; use the Namespace class to manage namespaces"

    return-object p0

    .line 412
    :cond_0
    invoke-static {p0}, Lorg/jdom2/Verifier;->checkJDOMName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static checkCDATASection(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 508
    invoke-static {p0}, Lorg/jdom2/Verifier;->checkCharacterData(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "]]>"

    .line 512
    invoke-virtual {p0, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result p0

    const/4 v0, -0x1

    if-eq p0, v0, :cond_1

    const-string p0, "CDATA cannot internally contain a CDATA ending delimiter (]]>)"

    return-object p0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method public static checkCharacterData(Ljava/lang/String;)Ljava/lang/String;
    .locals 7

    if-nez p0, :cond_0

    const-string p0, "A null is not a legal XML value"

    return-object p0

    .line 438
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    const/4 v3, 0x0

    if-ge v2, v0, :cond_7

    .line 450
    :cond_1
    sget-object v4, Lorg/jdom2/Verifier;->CHARFLAGS:[B

    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v5

    aget-byte v4, v4, v5

    if-eqz v4, :cond_2

    add-int/lit8 v2, v2, 0x1

    if-ne v2, v0, :cond_1

    return-object v3

    .line 461
    :cond_2
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v3

    invoke-static {v3}, Lorg/jdom2/Verifier;->isHighSurrogate(C)Z

    move-result v3

    const/4 v4, 0x1

    if-eqz v3, :cond_6

    add-int/lit8 v2, v2, 0x1

    if-lt v2, v0, :cond_3

    const-string v0, "Truncated Surrogate Pair 0x%04x????"

    .line 466
    new-array v3, v4, [Ljava/lang/Object;

    sub-int/2addr v2, v4

    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    aput-object p0, v3, v1

    invoke-static {v0, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 469
    :cond_3
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v3

    invoke-static {v3}, Lorg/jdom2/Verifier;->isLowSurrogate(C)Z

    move-result v3

    if-eqz v3, :cond_5

    add-int/lit8 v3, v2, -0x1

    .line 471
    invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C

    move-result v5

    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v6

    invoke-static {v5, v6}, Lorg/jdom2/Verifier;->decodeSurrogatePair(CC)I

    move-result v5

    invoke-static {v5}, Lorg/jdom2/Verifier;->isXMLCharacter(I)Z

    move-result v5

    if-nez v5, :cond_4

    const-string v0, "0x%06x is not a legal XML character"

    .line 476
    new-array v4, v4, [Ljava/lang/Object;

    invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C

    move-result v3

    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    move-result p0

    invoke-static {v3, p0}, Lorg/jdom2/Verifier;->decodeSurrogatePair(CC)I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    aput-object p0, v4, v1

    invoke-static {v0, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_4
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_5
    const-string v0, "Illegal Surrogate Pair 0x%04x%04x"

    const/4 v3, 0x2

    .line 482
    new-array v3, v3, [Ljava/lang/Object;

    add-int/lit8 v5, v2, -0x1

    invoke-virtual {p0, v5}, Ljava/lang/String;->charAt(I)C

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v3, v1

    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    aput-object p0, v3, v4

    invoke-static {v0, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_6
    const-string v0, "0x%04x is not a legal XML character"

    .line 489
    new-array v3, v4, [Ljava/lang/Object;

    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    aput-object p0, v3, v1

    invoke-static {v0, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_7
    return-object v3
.end method

.method public static checkCommentData(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 860
    invoke-static {p0}, Lorg/jdom2/Verifier;->checkCharacterData(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "--"

    .line 864
    invoke-virtual {p0, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_1

    const-string p0, "Comments cannot contain double hyphens (--)"

    return-object p0

    :cond_1
    const-string v0, "-"

    .line 867
    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_2

    const-string p0, "Comment data cannot end with a hyphen."

    return-object p0

    :cond_2
    const/4 p0, 0x0

    return-object p0
.end method

.method public static checkElementName(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 394
    invoke-static {p0}, Lorg/jdom2/Verifier;->checkJDOMName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static final checkJDOMName(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    if-nez p0, :cond_0

    const-string p0, "XML names cannot be null"

    return-object p0

    .line 363
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_1

    const-string p0, "XML names cannot be empty"

    return-object p0

    .line 368
    :cond_1
    sget-object v0, Lorg/jdom2/Verifier;->CHARFLAGS:[B

    const/4 v1, 0x0

    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    aget-byte v0, v0, v2

    and-int/lit8 v0, v0, 0x4

    if-nez v0, :cond_2

    .line 369
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "XML name \'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "\' cannot begin with the character \""

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    move-result p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string p0, "\""

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 374
    :cond_2
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x1

    sub-int/2addr v0, v1

    :goto_0
    if-lt v0, v1, :cond_4

    .line 375
    sget-object v2, Lorg/jdom2/Verifier;->CHARFLAGS:[B

    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result v3

    aget-byte v2, v2, v3

    and-int/lit8 v2, v2, 0x8

    int-to-byte v2, v2

    if-nez v2, :cond_3

    .line 376
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "XML name \'"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "\' cannot contain the character \""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string p0, "\""

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_3
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_4
    const/4 p0, 0x0

    return-object p0
.end method

.method public static checkNamespaceCollision(Lorg/jdom2/Attribute;Lorg/jdom2/Element;)Ljava/lang/String;
    .locals 1

    const/4 v0, -0x1

    .line 634
    invoke-static {p0, p1, v0}, Lorg/jdom2/Verifier;->checkNamespaceCollision(Lorg/jdom2/Attribute;Lorg/jdom2/Element;I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static checkNamespaceCollision(Lorg/jdom2/Attribute;Lorg/jdom2/Element;I)Ljava/lang/String;
    .locals 2

    .line 651
    invoke-virtual {p0}, Lorg/jdom2/Attribute;->getNamespace()Lorg/jdom2/Namespace;

    move-result-object p0

    .line 652
    invoke-virtual {p0}, Lorg/jdom2/Namespace;->getPrefix()Ljava/lang/String;

    move-result-object v0

    const-string v1, ""

    .line 653
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 657
    :cond_0
    invoke-static {p0, p1, p2}, Lorg/jdom2/Verifier;->checkNamespaceCollision(Lorg/jdom2/Namespace;Lorg/jdom2/Element;I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static checkNamespaceCollision(Lorg/jdom2/Namespace;Ljava/util/List;)Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/jdom2/Namespace;",
            "Ljava/util/List<",
            "*>;)",
            "Ljava/lang/String;"
        }
    .end annotation

    const/4 v0, -0x1

    .line 745
    invoke-static {p0, p1, v0}, Lorg/jdom2/Verifier;->checkNamespaceCollision(Lorg/jdom2/Namespace;Ljava/util/List;I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static checkNamespaceCollision(Lorg/jdom2/Namespace;Ljava/util/List;I)Ljava/lang/String;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/jdom2/Namespace;",
            "Ljava/util/List<",
            "*>;I)",
            "Ljava/lang/String;"
        }
    .end annotation

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    .line 767
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v1, -0x1

    :cond_1
    :goto_0
    if-nez v0, :cond_5

    .line 769
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    .line 770
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    add-int/lit8 v1, v1, 0x1

    .line 772
    instance-of v3, v2, Lorg/jdom2/Attribute;

    if-eqz v3, :cond_3

    if-ne v1, p2, :cond_2

    goto :goto_0

    .line 776
    :cond_2
    check-cast v2, Lorg/jdom2/Attribute;

    invoke-static {p0, v2}, Lorg/jdom2/Verifier;->checkNamespaceCollision(Lorg/jdom2/Namespace;Lorg/jdom2/Attribute;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 778
    :cond_3
    instance-of v3, v2, Lorg/jdom2/Element;

    if-eqz v3, :cond_4

    .line 779
    check-cast v2, Lorg/jdom2/Element;

    invoke-static {p0, v2}, Lorg/jdom2/Verifier;->checkNamespaceCollision(Lorg/jdom2/Namespace;Lorg/jdom2/Element;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 781
    :cond_4
    instance-of v3, v2, Lorg/jdom2/Namespace;

    if-eqz v3, :cond_1

    .line 782
    check-cast v2, Lorg/jdom2/Namespace;

    invoke-static {p0, v2}, Lorg/jdom2/Verifier;->checkNamespaceCollision(Lorg/jdom2/Namespace;Lorg/jdom2/Namespace;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 784
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " with an additional namespace declared by the element"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_5
    return-object v0
.end method

.method public static checkNamespaceCollision(Lorg/jdom2/Namespace;Lorg/jdom2/Attribute;)Ljava/lang/String;
    .locals 2

    .line 724
    invoke-virtual {p1}, Lorg/jdom2/Attribute;->getNamespace()Lorg/jdom2/Namespace;

    move-result-object v0

    sget-object v1, Lorg/jdom2/Namespace;->NO_NAMESPACE:Lorg/jdom2/Namespace;

    invoke-virtual {v0, v1}, Lorg/jdom2/Namespace;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 725
    invoke-virtual {p1}, Lorg/jdom2/Attribute;->getNamespace()Lorg/jdom2/Namespace;

    move-result-object p1

    invoke-static {p0, p1}, Lorg/jdom2/Verifier;->checkNamespaceCollision(Lorg/jdom2/Namespace;Lorg/jdom2/Namespace;)Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_1

    .line 728
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " with an attribute namespace prefix on the element"

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :cond_1
    :goto_0
    return-object p0
.end method

.method public static checkNamespaceCollision(Lorg/jdom2/Namespace;Lorg/jdom2/Element;)Ljava/lang/String;
    .locals 1

    const/4 v0, -0x1

    .line 671
    invoke-static {p0, p1, v0}, Lorg/jdom2/Verifier;->checkNamespaceCollision(Lorg/jdom2/Namespace;Lorg/jdom2/Element;I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static checkNamespaceCollision(Lorg/jdom2/Namespace;Lorg/jdom2/Element;I)Ljava/lang/String;
    .locals 1

    .line 688
    invoke-virtual {p1}, Lorg/jdom2/Element;->getNamespace()Lorg/jdom2/Namespace;

    move-result-object v0

    invoke-static {p0, v0}, Lorg/jdom2/Verifier;->checkNamespaceCollision(Lorg/jdom2/Namespace;Lorg/jdom2/Namespace;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 691
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " with the element namespace prefix"

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 694
    :cond_0
    invoke-virtual {p1}, Lorg/jdom2/Element;->hasAdditionalNamespaces()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 695
    invoke-virtual {p1}, Lorg/jdom2/Element;->getAdditionalNamespaces()Ljava/util/List;

    move-result-object v0

    invoke-static {p0, v0}, Lorg/jdom2/Verifier;->checkNamespaceCollision(Lorg/jdom2/Namespace;Ljava/util/List;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    return-object v0

    .line 702
    :cond_1
    invoke-virtual {p1}, Lorg/jdom2/Element;->hasAttributes()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 703
    invoke-virtual {p1}, Lorg/jdom2/Element;->getAttributes()Ljava/util/List;

    move-result-object p1

    invoke-static {p0, p1, p2}, Lorg/jdom2/Verifier;->checkNamespaceCollision(Lorg/jdom2/Namespace;Ljava/util/List;I)Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_2

    return-object p0

    :cond_2
    const/4 p0, 0x0

    return-object p0
.end method

.method public static checkNamespaceCollision(Lorg/jdom2/Namespace;Lorg/jdom2/Namespace;)Ljava/lang/String;
    .locals 2

    .line 613
    invoke-virtual {p0}, Lorg/jdom2/Namespace;->getPrefix()Ljava/lang/String;

    move-result-object v0

    .line 614
    invoke-virtual {p0}, Lorg/jdom2/Namespace;->getURI()Ljava/lang/String;

    move-result-object p0

    .line 615
    invoke-virtual {p1}, Lorg/jdom2/Namespace;->getPrefix()Ljava/lang/String;

    move-result-object v1

    .line 616
    invoke-virtual {p1}, Lorg/jdom2/Namespace;->getURI()Ljava/lang/String;

    move-result-object p1

    .line 617
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_0

    .line 618
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string p1, "The namespace prefix \""

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "\" collides"

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method

.method public static checkNamespacePrefix(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    const/4 v0, 0x0

    if-eqz p0, :cond_2

    const-string v1, ""

    .line 531
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    .line 535
    :cond_0
    invoke-static {p0}, Lorg/jdom2/Verifier;->checkJDOMName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 538
    invoke-static {p0}, Lorg/jdom2/Verifier;->checkJDOMName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_1
    return-object v0

    :cond_2
    :goto_0
    return-object v0
.end method

.method public static checkNamespaceURI(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    const/4 v0, 0x0

    if-eqz p0, :cond_5

    const-string v1, ""

    .line 573
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 578
    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    move-result p0

    .line 579
    invoke-static {p0}, Ljava/lang/Character;->isDigit(C)Z

    move-result v1

    if-eqz v1, :cond_1

    const-string p0, "Namespace URIs cannot begin with a number"

    return-object p0

    :cond_1
    const/16 v1, 0x24

    if-ne p0, v1, :cond_2

    const-string p0, "Namespace URIs cannot begin with a dollar sign ($)"

    return-object p0

    :cond_2
    const/16 v1, 0x2d

    if-ne p0, v1, :cond_3

    const-string p0, "Namespace URIs cannot begin with a hyphen (-)"

    return-object p0

    .line 592
    :cond_3
    invoke-static {p0}, Lorg/jdom2/Verifier;->isXMLWhitespace(C)Z

    move-result p0

    if-eqz p0, :cond_4

    const-string p0, "Namespace URIs cannot begin with white-space"

    return-object p0

    :cond_4
    return-object v0

    :cond_5
    :goto_0
    return-object v0
.end method

.method public static checkProcessingInstructionData(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 838
    invoke-static {p0}, Lorg/jdom2/Verifier;->checkCharacterData(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    const-string v1, "?>"

    .line 841
    invoke-virtual {p0, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result p0

    if-ltz p0, :cond_0

    const-string p0, "Processing instructions cannot contain the string \"?>\""

    return-object p0

    :cond_0
    return-object v0
.end method

.method public static checkProcessingInstructionTarget(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 803
    invoke-static {p0}, Lorg/jdom2/Verifier;->checkXMLName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, ":"

    .line 808
    invoke-virtual {p0, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_1

    const-string p0, "Processing instruction targets cannot contain colons"

    return-object p0

    :cond_1
    const-string v0, "xml"

    .line 813
    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_2

    const-string p0, "Processing instructions cannot have a target of \"xml\" in any combination of case. (Note that the \"<?xml ... ?>\" declaration at the beginning of a document is not a processing instruction and should not be added as one; it is written automatically during output, e.g. by XMLOutputter.)"

    return-object p0

    :cond_2
    const/4 p0, 0x0

    return-object p0
.end method

.method public static checkPublicID(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    :cond_0
    const/4 v1, 0x0

    .line 929
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    if-ge v1, v2, :cond_2

    .line 930
    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    .line 931
    invoke-static {v2}, Lorg/jdom2/Verifier;->isXMLPublicIDCharacter(C)Z

    move-result v3

    if-nez v3, :cond_1

    .line 932
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v0, " is not a legal character in public IDs"

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    return-object v0
.end method

.method public static checkSystemLiteral(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    const/16 v0, 0x27

    .line 955
    invoke-virtual {p0, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_1

    const/16 v0, 0x22

    invoke-virtual {p0, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    if-eq v0, v1, :cond_1

    const-string p0, "System literals cannot simultaneously contain both single and double quotes."

    goto :goto_0

    .line 961
    :cond_1
    invoke-static {p0}, Lorg/jdom2/Verifier;->checkCharacterData(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    :goto_0
    return-object p0
.end method

.method public static checkURI(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    const/4 v0, 0x0

    if-eqz p0, :cond_6

    const-string v1, ""

    .line 1015
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto/16 :goto_1

    :cond_0
    const/4 v1, 0x0

    .line 1019
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    if-ge v1, v2, :cond_5

    .line 1020
    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    .line 1021
    invoke-static {v2}, Lorg/jdom2/Verifier;->isURICharacter(C)Z

    move-result v3

    if-nez v3, :cond_2

    .line 1022
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "0x"

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v2}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const/16 v0, 0x9

    if-gt v2, v0, :cond_1

    .line 1023
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "0x0"

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v2}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    .line 1024
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "URIs cannot contain "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_2
    const/16 v3, 0x25

    if-ne v2, v3, :cond_4

    add-int/lit8 v2, v1, 0x1

    .line 1028
    :try_start_0
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v2

    add-int/lit8 v3, v1, 0x2

    .line 1029
    invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C

    move-result v3

    .line 1030
    invoke-static {v2}, Lorg/jdom2/Verifier;->isHexDigit(C)Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-static {v3}, Lorg/jdom2/Verifier;->isHexDigit(C)Z

    move-result v2

    if-nez v2, :cond_4

    :cond_3
    const-string p0, "Percent signs in URIs must be followed by exactly two hexadecimal digits."
    :try_end_0
    .catch Ljava/lang/StringIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    const-string p0, "Percent signs in URIs must be followed by exactly two hexadecimal digits."

    return-object p0

    :cond_4
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_5
    return-object v0

    :cond_6
    :goto_1
    return-object v0
.end method

.method public static checkXMLName(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    if-nez p0, :cond_0

    const-string p0, "XML names cannot be null"

    return-object p0

    .line 981
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_1

    const-string p0, "XML names cannot be empty"

    return-object p0

    :cond_1
    const/4 v1, 0x0

    .line 988
    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    invoke-static {v2}, Lorg/jdom2/Verifier;->isXMLNameStartCharacter(C)Z

    move-result v2

    if-nez v2, :cond_2

    .line 989
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "XML names cannot begin with the character \""

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    move-result p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string p0, "\""

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_2
    const/4 v1, 0x1

    :goto_0
    if-ge v1, v0, :cond_4

    .line 994
    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    invoke-static {v2}, Lorg/jdom2/Verifier;->isXMLNameCharacter(C)Z

    move-result v2

    if-nez v2, :cond_3

    .line 995
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "XML names cannot contain the character \""

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    move-result p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string p0, "\""

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_3
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_4
    const/4 p0, 0x0

    return-object p0
.end method

.method public static decodeSurrogatePair(CC)I
    .locals 1

    const v0, 0xd800

    sub-int/2addr p0, v0

    mul-int/lit16 p0, p0, 0x400

    const/high16 v0, 0x10000

    add-int/2addr p0, v0

    const v0, 0xdc00

    sub-int/2addr p1, v0

    add-int/2addr p0, p1

    return p0
.end method

.method public static final isAllXMLWhitespace(Ljava/lang/String;)Z
    .locals 2

    .line 1283
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    :cond_0
    add-int/lit8 v0, v0, -0x1

    if-ltz v0, :cond_1

    .line 1285
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result v1

    invoke-static {v1}, Lorg/jdom2/Verifier;->isXMLWhitespace(C)Z

    move-result v1

    if-nez v1, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_1
    const/4 p0, 0x1

    return p0
.end method

.method public static isHexDigit(C)Z
    .locals 2

    const/4 v0, 0x1

    const/16 v1, 0x30

    if-lt p0, v1, :cond_0

    const/16 v1, 0x39

    if-gt p0, v1, :cond_0

    return v0

    :cond_0
    const/16 v1, 0x41

    if-lt p0, v1, :cond_1

    const/16 v1, 0x46

    if-gt p0, v1, :cond_1

    return v0

    :cond_1
    const/16 v1, 0x61

    if-lt p0, v1, :cond_2

    const/16 v1, 0x66

    if-gt p0, v1, :cond_2

    return v0

    :cond_2
    const/4 p0, 0x0

    return p0
.end method

.method public static isHighSurrogate(C)Z
    .locals 1

    ushr-int/lit8 p0, p0, 0xa

    const/16 v0, 0x36

    if-ne v0, p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static isLowSurrogate(C)Z
    .locals 1

    ushr-int/lit8 p0, p0, 0xa

    const/16 v0, 0x37

    if-ne v0, p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static isURICharacter(C)Z
    .locals 1

    .line 1114
    sget-object v0, Lorg/jdom2/Verifier;->CHARFLAGS:[B

    aget-byte p0, v0, p0

    and-int/lit8 p0, p0, 0x40

    int-to-byte p0, p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static isXMLCharacter(I)Z
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x1

    const/high16 v2, 0x10000

    if-lt p0, v2, :cond_1

    const v2, 0x10ffff

    if-gt p0, v2, :cond_0

    move v0, v1

    :cond_0
    return v0

    .line 1130
    :cond_1
    sget-object v2, Lorg/jdom2/Verifier;->CHARFLAGS:[B

    aget-byte p0, v2, p0

    and-int/2addr p0, v1

    int-to-byte p0, p0

    if-eqz p0, :cond_2

    move v0, v1

    :cond_2
    return v0
.end method

.method public static isXMLCombiningChar(C)Z
    .locals 1

    .line 1196
    sget-object v0, Lorg/jdom2/Verifier;->CHARFLAGS:[B

    aget-byte p0, v0, p0

    and-int/lit8 p0, p0, 0x20

    int-to-byte p0, p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static isXMLDigit(C)Z
    .locals 1

    .line 1245
    sget-object v0, Lorg/jdom2/Verifier;->CHARFLAGS:[B

    aget-byte p0, v0, p0

    and-int/lit8 p0, p0, 0x10

    int-to-byte p0, p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static isXMLExtender(C)Z
    .locals 3

    const/4 v0, 0x0

    const/16 v1, 0xb6

    if-ge p0, v1, :cond_0

    return v0

    :cond_0
    const/16 v1, 0xb7

    const/4 v2, 0x1

    if-ne p0, v1, :cond_1

    return v2

    :cond_1
    const/16 v1, 0x2d0

    if-ne p0, v1, :cond_2

    return v2

    :cond_2
    const/16 v1, 0x2d1

    if-ne p0, v1, :cond_3

    return v2

    :cond_3
    const/16 v1, 0x387

    if-ne p0, v1, :cond_4

    return v2

    :cond_4
    const/16 v1, 0x640

    if-ne p0, v1, :cond_5

    return v2

    :cond_5
    const/16 v1, 0xe46

    if-ne p0, v1, :cond_6

    return v2

    :cond_6
    const/16 v1, 0xec6

    if-ne p0, v1, :cond_7

    return v2

    :cond_7
    const/16 v1, 0x3005

    if-ne p0, v1, :cond_8

    return v2

    :cond_8
    const/16 v1, 0x3031

    if-ge p0, v1, :cond_9

    return v0

    :cond_9
    const/16 v1, 0x3035

    if-gt p0, v1, :cond_a

    return v2

    :cond_a
    const/16 v1, 0x309d

    if-ge p0, v1, :cond_b

    return v0

    :cond_b
    const/16 v1, 0x309e

    if-gt p0, v1, :cond_c

    return v2

    :cond_c
    const/16 v1, 0x30fc

    if-ge p0, v1, :cond_d

    return v0

    :cond_d
    const/16 v1, 0x30fe

    if-gt p0, v1, :cond_e

    return v2

    :cond_e
    return v0
.end method

.method public static isXMLLetter(C)Z
    .locals 1

    .line 1183
    sget-object v0, Lorg/jdom2/Verifier;->CHARFLAGS:[B

    aget-byte p0, v0, p0

    and-int/lit8 p0, p0, 0x2

    int-to-byte p0, p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static isXMLLetterOrDigit(C)Z
    .locals 1

    .line 1172
    sget-object v0, Lorg/jdom2/Verifier;->CHARFLAGS:[B

    aget-byte p0, v0, p0

    and-int/lit8 p0, p0, 0x12

    int-to-byte p0, p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static isXMLNameCharacter(C)Z
    .locals 1

    .line 1144
    sget-object v0, Lorg/jdom2/Verifier;->CHARFLAGS:[B

    aget-byte v0, v0, p0

    and-int/lit8 v0, v0, 0x8

    int-to-byte v0, v0

    if-nez v0, :cond_1

    const/16 v0, 0x3a

    if-ne p0, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method

.method public static isXMLNameStartCharacter(C)Z
    .locals 1

    .line 1159
    sget-object v0, Lorg/jdom2/Verifier;->CHARFLAGS:[B

    aget-byte v0, v0, p0

    and-int/lit8 v0, v0, 0x4

    int-to-byte v0, v0

    if-nez v0, :cond_1

    const/16 v0, 0x3a

    if-ne p0, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method

.method public static isXMLPublicIDCharacter(C)Z
    .locals 2

    const/4 v0, 0x1

    const/16 v1, 0x61

    if-lt p0, v1, :cond_0

    const/16 v1, 0x7a

    if-gt p0, v1, :cond_0

    return v0

    :cond_0
    const/16 v1, 0x3f

    if-lt p0, v1, :cond_1

    const/16 v1, 0x5a

    if-gt p0, v1, :cond_1

    return v0

    :cond_1
    const/16 v1, 0x27

    if-lt p0, v1, :cond_2

    const/16 v1, 0x3b

    if-gt p0, v1, :cond_2

    return v0

    :cond_2
    const/16 v1, 0x20

    if-ne p0, v1, :cond_3

    return v0

    :cond_3
    const/16 v1, 0x21

    if-ne p0, v1, :cond_4

    return v0

    :cond_4
    const/16 v1, 0x3d

    if-ne p0, v1, :cond_5

    return v0

    :cond_5
    const/16 v1, 0x23

    if-ne p0, v1, :cond_6

    return v0

    :cond_6
    const/16 v1, 0x24

    if-ne p0, v1, :cond_7

    return v0

    :cond_7
    const/16 v1, 0x5f

    if-ne p0, v1, :cond_8

    return v0

    :cond_8
    const/16 v1, 0x25

    if-ne p0, v1, :cond_9

    return v0

    :cond_9
    const/16 v1, 0xa

    if-ne p0, v1, :cond_a

    return v0

    :cond_a
    const/16 v1, 0xd

    if-ne p0, v1, :cond_b

    return v0

    :cond_b
    const/16 v1, 0x9

    if-ne p0, v1, :cond_c

    return v0

    :cond_c
    const/4 p0, 0x0

    return p0
.end method

.method public static isXMLWhitespace(C)Z
    .locals 1

    const/16 v0, 0x20

    if-eq p0, v0, :cond_1

    const/16 v0, 0xa

    if-eq p0, v0, :cond_1

    const/16 v0, 0x9

    if-eq p0, v0, :cond_1

    const/16 v0, 0xd

    if-ne p0, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method
