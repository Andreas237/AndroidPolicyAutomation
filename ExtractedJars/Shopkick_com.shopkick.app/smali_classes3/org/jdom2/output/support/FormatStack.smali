.class public final Lorg/jdom2/output/support/FormatStack;
.super Ljava/lang/Object;
.source "FormatStack.java"


# instance fields
.field private capacity:I

.field private final defaultMode:Lorg/jdom2/output/Format$TextMode;

.field private depth:I

.field private final encoding:Ljava/lang/String;

.field private escapeOutput:[Z

.field private final escapeStrategy:Lorg/jdom2/output/EscapeStrategy;

.field private final expandEmptyElements:Z

.field private ignoreTrAXEscapingPIs:[Z

.field private final indent:Ljava/lang/String;

.field private levelEOL:[Ljava/lang/String;

.field private levelEOLIndent:[Ljava/lang/String;

.field private levelIndent:[Ljava/lang/String;

.field private final lineSeparator:Ljava/lang/String;

.field private mode:[Lorg/jdom2/output/Format$TextMode;

.field private final omitDeclaration:Z

.field private final omitEncoding:Z

.field private final specifiedAttributesOnly:Z

.field private termEOLIndent:[Ljava/lang/String;


# direct methods
.method public constructor <init>(Lorg/jdom2/output/Format;)V
    .locals 4

    .line 164
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x10

    .line 81
    iput v0, p0, Lorg/jdom2/output/support/FormatStack;->capacity:I

    const/4 v0, 0x0

    .line 82
    iput v0, p0, Lorg/jdom2/output/support/FormatStack;->depth:I

    .line 135
    iget v0, p0, Lorg/jdom2/output/support/FormatStack;->capacity:I

    new-array v1, v0, [Ljava/lang/String;

    iput-object v1, p0, Lorg/jdom2/output/support/FormatStack;->levelIndent:[Ljava/lang/String;

    .line 138
    new-array v1, v0, [Ljava/lang/String;

    iput-object v1, p0, Lorg/jdom2/output/support/FormatStack;->levelEOL:[Ljava/lang/String;

    .line 141
    new-array v1, v0, [Ljava/lang/String;

    iput-object v1, p0, Lorg/jdom2/output/support/FormatStack;->levelEOLIndent:[Ljava/lang/String;

    .line 144
    new-array v1, v0, [Ljava/lang/String;

    iput-object v1, p0, Lorg/jdom2/output/support/FormatStack;->termEOLIndent:[Ljava/lang/String;

    .line 150
    new-array v1, v0, [Z

    iput-object v1, p0, Lorg/jdom2/output/support/FormatStack;->ignoreTrAXEscapingPIs:[Z

    .line 153
    new-array v1, v0, [Lorg/jdom2/output/Format$TextMode;

    iput-object v1, p0, Lorg/jdom2/output/support/FormatStack;->mode:[Lorg/jdom2/output/Format$TextMode;

    .line 156
    new-array v0, v0, [Z

    iput-object v0, p0, Lorg/jdom2/output/support/FormatStack;->escapeOutput:[Z

    .line 165
    invoke-virtual {p1}, Lorg/jdom2/output/Format;->getIndent()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lorg/jdom2/output/support/FormatStack;->indent:Ljava/lang/String;

    .line 166
    invoke-virtual {p1}, Lorg/jdom2/output/Format;->getLineSeparator()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lorg/jdom2/output/support/FormatStack;->lineSeparator:Ljava/lang/String;

    .line 168
    invoke-virtual {p1}, Lorg/jdom2/output/Format;->getEncoding()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lorg/jdom2/output/support/FormatStack;->encoding:Ljava/lang/String;

    .line 169
    invoke-virtual {p1}, Lorg/jdom2/output/Format;->getOmitDeclaration()Z

    move-result v0

    iput-boolean v0, p0, Lorg/jdom2/output/support/FormatStack;->omitDeclaration:Z

    .line 170
    invoke-virtual {p1}, Lorg/jdom2/output/Format;->getOmitEncoding()Z

    move-result v0

    iput-boolean v0, p0, Lorg/jdom2/output/support/FormatStack;->omitEncoding:Z

    .line 171
    invoke-virtual {p1}, Lorg/jdom2/output/Format;->getExpandEmptyElements()Z

    move-result v0

    iput-boolean v0, p0, Lorg/jdom2/output/support/FormatStack;->expandEmptyElements:Z

    .line 172
    invoke-virtual {p1}, Lorg/jdom2/output/Format;->getEscapeStrategy()Lorg/jdom2/output/EscapeStrategy;

    move-result-object v0

    iput-object v0, p0, Lorg/jdom2/output/support/FormatStack;->escapeStrategy:Lorg/jdom2/output/EscapeStrategy;

    .line 173
    invoke-virtual {p1}, Lorg/jdom2/output/Format;->getTextMode()Lorg/jdom2/output/Format$TextMode;

    move-result-object v0

    iput-object v0, p0, Lorg/jdom2/output/support/FormatStack;->defaultMode:Lorg/jdom2/output/Format$TextMode;

    .line 174
    invoke-virtual {p1}, Lorg/jdom2/output/Format;->isSpecifiedAttributesOnly()Z

    move-result v0

    iput-boolean v0, p0, Lorg/jdom2/output/support/FormatStack;->specifiedAttributesOnly:Z

    .line 176
    iget-object v0, p0, Lorg/jdom2/output/support/FormatStack;->mode:[Lorg/jdom2/output/Format$TextMode;

    iget v1, p0, Lorg/jdom2/output/support/FormatStack;->depth:I

    invoke-virtual {p1}, Lorg/jdom2/output/Format;->getTextMode()Lorg/jdom2/output/Format$TextMode;

    move-result-object v2

    aput-object v2, v0, v1

    .line 177
    iget-object v0, p0, Lorg/jdom2/output/support/FormatStack;->mode:[Lorg/jdom2/output/Format$TextMode;

    iget v1, p0, Lorg/jdom2/output/support/FormatStack;->depth:I

    aget-object v0, v0, v1

    sget-object v1, Lorg/jdom2/output/Format$TextMode;->PRESERVE:Lorg/jdom2/output/Format$TextMode;

    const/4 v2, 0x0

    if-ne v0, v1, :cond_0

    .line 179
    iget-object v0, p0, Lorg/jdom2/output/support/FormatStack;->levelIndent:[Ljava/lang/String;

    iget v1, p0, Lorg/jdom2/output/support/FormatStack;->depth:I

    aput-object v2, v0, v1

    .line 180
    iget-object v0, p0, Lorg/jdom2/output/support/FormatStack;->levelEOL:[Ljava/lang/String;

    aput-object v2, v0, v1

    .line 181
    iget-object v0, p0, Lorg/jdom2/output/support/FormatStack;->levelEOLIndent:[Ljava/lang/String;

    aput-object v2, v0, v1

    .line 182
    iget-object v0, p0, Lorg/jdom2/output/support/FormatStack;->termEOLIndent:[Ljava/lang/String;

    aput-object v2, v0, v1

    goto :goto_2

    .line 184
    :cond_0
    iget-object v0, p0, Lorg/jdom2/output/support/FormatStack;->levelIndent:[Ljava/lang/String;

    iget v1, p0, Lorg/jdom2/output/support/FormatStack;->depth:I

    invoke-virtual {p1}, Lorg/jdom2/output/Format;->getIndent()Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_1

    move-object v3, v2

    goto :goto_0

    :cond_1
    const-string v3, ""

    :goto_0
    aput-object v3, v0, v1

    .line 186
    iget-object v0, p0, Lorg/jdom2/output/support/FormatStack;->levelEOL:[Ljava/lang/String;

    iget v1, p0, Lorg/jdom2/output/support/FormatStack;->depth:I

    invoke-virtual {p1}, Lorg/jdom2/output/Format;->getLineSeparator()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v0, v1

    .line 187
    iget-object v0, p0, Lorg/jdom2/output/support/FormatStack;->levelEOLIndent:[Ljava/lang/String;

    iget v1, p0, Lorg/jdom2/output/support/FormatStack;->depth:I

    iget-object v3, p0, Lorg/jdom2/output/support/FormatStack;->levelIndent:[Ljava/lang/String;

    aget-object v3, v3, v1

    if-nez v3, :cond_2

    goto :goto_1

    :cond_2
    iget-object v2, p0, Lorg/jdom2/output/support/FormatStack;->levelEOL:[Ljava/lang/String;

    aget-object v2, v2, v1

    :goto_1
    aput-object v2, v0, v1

    .line 189
    iget-object v0, p0, Lorg/jdom2/output/support/FormatStack;->termEOLIndent:[Ljava/lang/String;

    iget v1, p0, Lorg/jdom2/output/support/FormatStack;->depth:I

    iget-object v2, p0, Lorg/jdom2/output/support/FormatStack;->levelEOLIndent:[Ljava/lang/String;

    aget-object v2, v2, v1

    aput-object v2, v0, v1

    .line 192
    :goto_2
    iget-object v0, p0, Lorg/jdom2/output/support/FormatStack;->ignoreTrAXEscapingPIs:[Z

    iget v1, p0, Lorg/jdom2/output/support/FormatStack;->depth:I

    invoke-virtual {p1}, Lorg/jdom2/output/Format;->getIgnoreTrAXEscapingPIs()Z

    move-result p1

    aput-boolean p1, v0, v1

    .line 193
    iget-object p1, p0, Lorg/jdom2/output/support/FormatStack;->escapeOutput:[Z

    iget v0, p0, Lorg/jdom2/output/support/FormatStack;->depth:I

    const/4 v1, 0x1

    aput-boolean v1, p1, v0

    return-void
.end method

.method private final resetReusableIndents()V
    .locals 3

    .line 201
    iget v0, p0, Lorg/jdom2/output/support/FormatStack;->depth:I

    add-int/lit8 v0, v0, 0x1

    .line 202
    :goto_0
    iget-object v1, p0, Lorg/jdom2/output/support/FormatStack;->levelIndent:[Ljava/lang/String;

    array-length v2, v1

    if-ge v0, v2, :cond_0

    aget-object v2, v1, v0

    if-eqz v2, :cond_0

    const/4 v2, 0x0

    .line 204
    aput-object v2, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method public getDefaultMode()Lorg/jdom2/output/Format$TextMode;
    .locals 1

    .line 314
    iget-object v0, p0, Lorg/jdom2/output/support/FormatStack;->defaultMode:Lorg/jdom2/output/Format$TextMode;

    return-object v0
.end method

.method public getEncoding()Ljava/lang/String;
    .locals 1

    .line 227
    iget-object v0, p0, Lorg/jdom2/output/support/FormatStack;->encoding:Ljava/lang/String;

    return-object v0
.end method

.method public getEscapeOutput()Z
    .locals 2

    .line 294
    iget-object v0, p0, Lorg/jdom2/output/support/FormatStack;->escapeOutput:[Z

    iget v1, p0, Lorg/jdom2/output/support/FormatStack;->depth:I

    aget-boolean v0, v0, v1

    return v0
.end method

.method public getEscapeStrategy()Lorg/jdom2/output/EscapeStrategy;
    .locals 1

    .line 266
    iget-object v0, p0, Lorg/jdom2/output/support/FormatStack;->escapeStrategy:Lorg/jdom2/output/EscapeStrategy;

    return-object v0
.end method

.method public getIndent()Ljava/lang/String;
    .locals 1

    .line 213
    iget-object v0, p0, Lorg/jdom2/output/support/FormatStack;->indent:Ljava/lang/String;

    return-object v0
.end method

.method public getLevelEOL()Ljava/lang/String;
    .locals 2

    .line 361
    iget-object v0, p0, Lorg/jdom2/output/support/FormatStack;->levelEOL:[Ljava/lang/String;

    iget v1, p0, Lorg/jdom2/output/support/FormatStack;->depth:I

    aget-object v0, v0, v1

    return-object v0
.end method

.method public getLevelIndent()Ljava/lang/String;
    .locals 2

    .line 321
    iget-object v0, p0, Lorg/jdom2/output/support/FormatStack;->levelIndent:[Ljava/lang/String;

    iget v1, p0, Lorg/jdom2/output/support/FormatStack;->depth:I

    aget-object v0, v0, v1

    return-object v0
.end method

.method public getLineSeparator()Ljava/lang/String;
    .locals 1

    .line 220
    iget-object v0, p0, Lorg/jdom2/output/support/FormatStack;->lineSeparator:Ljava/lang/String;

    return-object v0
.end method

.method public getPadBetween()Ljava/lang/String;
    .locals 2

    .line 331
    iget-object v0, p0, Lorg/jdom2/output/support/FormatStack;->levelEOLIndent:[Ljava/lang/String;

    iget v1, p0, Lorg/jdom2/output/support/FormatStack;->depth:I

    aget-object v0, v0, v1

    return-object v0
.end method

.method public getPadLast()Ljava/lang/String;
    .locals 2

    .line 341
    iget-object v0, p0, Lorg/jdom2/output/support/FormatStack;->termEOLIndent:[Ljava/lang/String;

    iget v1, p0, Lorg/jdom2/output/support/FormatStack;->depth:I

    aget-object v0, v0, v1

    return-object v0
.end method

.method public getTextMode()Lorg/jdom2/output/Format$TextMode;
    .locals 2

    .line 379
    iget-object v0, p0, Lorg/jdom2/output/support/FormatStack;->mode:[Lorg/jdom2/output/Format$TextMode;

    iget v1, p0, Lorg/jdom2/output/support/FormatStack;->depth:I

    aget-object v0, v0, v1

    return-object v0
.end method

.method public isExpandEmptyElements()Z
    .locals 1

    .line 259
    iget-boolean v0, p0, Lorg/jdom2/output/support/FormatStack;->expandEmptyElements:Z

    return v0
.end method

.method public isIgnoreTrAXEscapingPIs()Z
    .locals 2

    .line 273
    iget-object v0, p0, Lorg/jdom2/output/support/FormatStack;->ignoreTrAXEscapingPIs:[Z

    iget v1, p0, Lorg/jdom2/output/support/FormatStack;->depth:I

    aget-boolean v0, v0, v1

    return v0
.end method

.method public isOmitDeclaration()Z
    .locals 1

    .line 234
    iget-boolean v0, p0, Lorg/jdom2/output/support/FormatStack;->omitDeclaration:Z

    return v0
.end method

.method public isOmitEncoding()Z
    .locals 1

    .line 252
    iget-boolean v0, p0, Lorg/jdom2/output/support/FormatStack;->omitEncoding:Z

    return v0
.end method

.method public isSpecifiedAttributesOnly()Z
    .locals 1

    .line 245
    iget-boolean v0, p0, Lorg/jdom2/output/support/FormatStack;->specifiedAttributesOnly:Z

    return v0
.end method

.method public pop()V
    .locals 1

    .line 472
    iget v0, p0, Lorg/jdom2/output/support/FormatStack;->depth:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lorg/jdom2/output/support/FormatStack;->depth:I

    return-void
.end method

.method public push()V
    .locals 6

    .line 433
    iget v0, p0, Lorg/jdom2/output/support/FormatStack;->depth:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lorg/jdom2/output/support/FormatStack;->depth:I

    .line 434
    iget v1, p0, Lorg/jdom2/output/support/FormatStack;->depth:I

    iget v2, p0, Lorg/jdom2/output/support/FormatStack;->capacity:I

    if-lt v1, v2, :cond_0

    mul-int/lit8 v2, v2, 0x2

    .line 435
    iput v2, p0, Lorg/jdom2/output/support/FormatStack;->capacity:I

    .line 436
    iget-object v1, p0, Lorg/jdom2/output/support/FormatStack;->levelIndent:[Ljava/lang/String;

    iget v2, p0, Lorg/jdom2/output/support/FormatStack;->capacity:I

    invoke-static {v1, v2}, Lorg/jdom2/internal/ArrayCopy;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Ljava/lang/String;

    iput-object v1, p0, Lorg/jdom2/output/support/FormatStack;->levelIndent:[Ljava/lang/String;

    .line 437
    iget-object v1, p0, Lorg/jdom2/output/support/FormatStack;->levelEOL:[Ljava/lang/String;

    iget v2, p0, Lorg/jdom2/output/support/FormatStack;->capacity:I

    invoke-static {v1, v2}, Lorg/jdom2/internal/ArrayCopy;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Ljava/lang/String;

    iput-object v1, p0, Lorg/jdom2/output/support/FormatStack;->levelEOL:[Ljava/lang/String;

    .line 438
    iget-object v1, p0, Lorg/jdom2/output/support/FormatStack;->levelEOLIndent:[Ljava/lang/String;

    iget v2, p0, Lorg/jdom2/output/support/FormatStack;->capacity:I

    invoke-static {v1, v2}, Lorg/jdom2/internal/ArrayCopy;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Ljava/lang/String;

    iput-object v1, p0, Lorg/jdom2/output/support/FormatStack;->levelEOLIndent:[Ljava/lang/String;

    .line 439
    iget-object v1, p0, Lorg/jdom2/output/support/FormatStack;->termEOLIndent:[Ljava/lang/String;

    iget v2, p0, Lorg/jdom2/output/support/FormatStack;->capacity:I

    invoke-static {v1, v2}, Lorg/jdom2/internal/ArrayCopy;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Ljava/lang/String;

    iput-object v1, p0, Lorg/jdom2/output/support/FormatStack;->termEOLIndent:[Ljava/lang/String;

    .line 440
    iget-object v1, p0, Lorg/jdom2/output/support/FormatStack;->ignoreTrAXEscapingPIs:[Z

    iget v2, p0, Lorg/jdom2/output/support/FormatStack;->capacity:I

    invoke-static {v1, v2}, Lorg/jdom2/internal/ArrayCopy;->copyOf([ZI)[Z

    move-result-object v1

    iput-object v1, p0, Lorg/jdom2/output/support/FormatStack;->ignoreTrAXEscapingPIs:[Z

    .line 441
    iget-object v1, p0, Lorg/jdom2/output/support/FormatStack;->mode:[Lorg/jdom2/output/Format$TextMode;

    iget v2, p0, Lorg/jdom2/output/support/FormatStack;->capacity:I

    invoke-static {v1, v2}, Lorg/jdom2/internal/ArrayCopy;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Lorg/jdom2/output/Format$TextMode;

    iput-object v1, p0, Lorg/jdom2/output/support/FormatStack;->mode:[Lorg/jdom2/output/Format$TextMode;

    .line 442
    iget-object v1, p0, Lorg/jdom2/output/support/FormatStack;->escapeOutput:[Z

    iget v2, p0, Lorg/jdom2/output/support/FormatStack;->capacity:I

    invoke-static {v1, v2}, Lorg/jdom2/internal/ArrayCopy;->copyOf([ZI)[Z

    move-result-object v1

    iput-object v1, p0, Lorg/jdom2/output/support/FormatStack;->escapeOutput:[Z

    .line 445
    :cond_0
    iget-object v1, p0, Lorg/jdom2/output/support/FormatStack;->ignoreTrAXEscapingPIs:[Z

    iget v2, p0, Lorg/jdom2/output/support/FormatStack;->depth:I

    aget-boolean v3, v1, v0

    aput-boolean v3, v1, v2

    .line 446
    iget-object v1, p0, Lorg/jdom2/output/support/FormatStack;->mode:[Lorg/jdom2/output/Format$TextMode;

    aget-object v3, v1, v0

    aput-object v3, v1, v2

    .line 447
    iget-object v1, p0, Lorg/jdom2/output/support/FormatStack;->escapeOutput:[Z

    aget-boolean v3, v1, v0

    aput-boolean v3, v1, v2

    .line 449
    iget-object v1, p0, Lorg/jdom2/output/support/FormatStack;->levelIndent:[Ljava/lang/String;

    aget-object v3, v1, v0

    if-eqz v3, :cond_2

    iget-object v3, p0, Lorg/jdom2/output/support/FormatStack;->levelEOL:[Ljava/lang/String;

    aget-object v4, v3, v0

    if-nez v4, :cond_1

    goto :goto_0

    .line 454
    :cond_1
    aget-object v1, v1, v2

    if-nez v1, :cond_3

    .line 457
    aget-object v1, v3, v0

    aput-object v1, v3, v2

    .line 458
    iget-object v1, p0, Lorg/jdom2/output/support/FormatStack;->termEOLIndent:[Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v4, p0, Lorg/jdom2/output/support/FormatStack;->levelEOL:[Ljava/lang/String;

    iget v5, p0, Lorg/jdom2/output/support/FormatStack;->depth:I

    aget-object v4, v4, v5

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, p0, Lorg/jdom2/output/support/FormatStack;->levelIndent:[Ljava/lang/String;

    aget-object v4, v4, v0

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v1, v2

    .line 459
    iget-object v1, p0, Lorg/jdom2/output/support/FormatStack;->levelIndent:[Ljava/lang/String;

    iget v2, p0, Lorg/jdom2/output/support/FormatStack;->depth:I

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v4, p0, Lorg/jdom2/output/support/FormatStack;->levelIndent:[Ljava/lang/String;

    aget-object v0, v4, v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lorg/jdom2/output/support/FormatStack;->indent:Ljava/lang/String;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v1, v2

    .line 460
    iget-object v0, p0, Lorg/jdom2/output/support/FormatStack;->levelEOLIndent:[Ljava/lang/String;

    iget v1, p0, Lorg/jdom2/output/support/FormatStack;->depth:I

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lorg/jdom2/output/support/FormatStack;->levelEOL:[Ljava/lang/String;

    iget v4, p0, Lorg/jdom2/output/support/FormatStack;->depth:I

    aget-object v3, v3, v4

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lorg/jdom2/output/support/FormatStack;->levelIndent:[Ljava/lang/String;

    iget v4, p0, Lorg/jdom2/output/support/FormatStack;->depth:I

    aget-object v3, v3, v4

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    goto :goto_1

    .line 450
    :cond_2
    :goto_0
    iget-object v0, p0, Lorg/jdom2/output/support/FormatStack;->levelIndent:[Ljava/lang/String;

    iget v1, p0, Lorg/jdom2/output/support/FormatStack;->depth:I

    const/4 v2, 0x0

    aput-object v2, v0, v1

    .line 451
    iget-object v0, p0, Lorg/jdom2/output/support/FormatStack;->levelEOL:[Ljava/lang/String;

    aput-object v2, v0, v1

    .line 452
    iget-object v0, p0, Lorg/jdom2/output/support/FormatStack;->levelEOLIndent:[Ljava/lang/String;

    aput-object v2, v0, v1

    .line 453
    iget-object v0, p0, Lorg/jdom2/output/support/FormatStack;->termEOLIndent:[Ljava/lang/String;

    aput-object v2, v0, v1

    :cond_3
    :goto_1
    return-void
.end method

.method public setEscapeOutput(Z)V
    .locals 2

    .line 306
    iget-object v0, p0, Lorg/jdom2/output/support/FormatStack;->escapeOutput:[Z

    iget v1, p0, Lorg/jdom2/output/support/FormatStack;->depth:I

    aput-boolean p1, v0, v1

    return-void
.end method

.method public setIgnoreTrAXEscapingPIs(Z)V
    .locals 2

    .line 283
    iget-object v0, p0, Lorg/jdom2/output/support/FormatStack;->ignoreTrAXEscapingPIs:[Z

    iget v1, p0, Lorg/jdom2/output/support/FormatStack;->depth:I

    aput-boolean p1, v0, v1

    return-void
.end method

.method public setLevelEOL(Ljava/lang/String;)V
    .locals 2

    .line 371
    iget-object v0, p0, Lorg/jdom2/output/support/FormatStack;->levelEOL:[Ljava/lang/String;

    iget v1, p0, Lorg/jdom2/output/support/FormatStack;->depth:I

    aput-object p1, v0, v1

    .line 372
    invoke-direct {p0}, Lorg/jdom2/output/support/FormatStack;->resetReusableIndents()V

    return-void
.end method

.method public setLevelIndent(Ljava/lang/String;)V
    .locals 5

    .line 351
    iget-object v0, p0, Lorg/jdom2/output/support/FormatStack;->levelIndent:[Ljava/lang/String;

    iget v1, p0, Lorg/jdom2/output/support/FormatStack;->depth:I

    aput-object p1, v0, v1

    .line 352
    iget-object v0, p0, Lorg/jdom2/output/support/FormatStack;->levelEOLIndent:[Ljava/lang/String;

    if-eqz p1, :cond_1

    iget-object v2, p0, Lorg/jdom2/output/support/FormatStack;->levelEOL:[Ljava/lang/String;

    aget-object v2, v2, v1

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lorg/jdom2/output/support/FormatStack;->levelEOL:[Ljava/lang/String;

    iget v4, p0, Lorg/jdom2/output/support/FormatStack;->depth:I

    aget-object v3, v3, v4

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    :goto_1
    aput-object p1, v0, v1

    .line 354
    invoke-direct {p0}, Lorg/jdom2/output/support/FormatStack;->resetReusableIndents()V

    return-void
.end method

.method public setTextMode(Lorg/jdom2/output/Format$TextMode;)V
    .locals 4

    .line 389
    iget-object v0, p0, Lorg/jdom2/output/support/FormatStack;->mode:[Lorg/jdom2/output/Format$TextMode;

    iget v1, p0, Lorg/jdom2/output/support/FormatStack;->depth:I

    aget-object v2, v0, v1

    if-ne v2, p1, :cond_0

    return-void

    .line 392
    :cond_0
    aput-object p1, v0, v1

    .line 393
    sget-object v0, Lorg/jdom2/output/support/FormatStack$1;->$SwitchMap$org$jdom2$output$Format$TextMode:[I

    invoke-virtual {p1}, Lorg/jdom2/output/Format$TextMode;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eq p1, v0, :cond_5

    .line 401
    iget-object p1, p0, Lorg/jdom2/output/support/FormatStack;->levelEOL:[Ljava/lang/String;

    iget v2, p0, Lorg/jdom2/output/support/FormatStack;->depth:I

    iget-object v3, p0, Lorg/jdom2/output/support/FormatStack;->lineSeparator:Ljava/lang/String;

    aput-object v3, p1, v2

    .line 402
    iget-object p1, p0, Lorg/jdom2/output/support/FormatStack;->indent:Ljava/lang/String;

    if-eqz p1, :cond_4

    if-nez v3, :cond_1

    goto :goto_2

    :cond_1
    if-lez v2, :cond_3

    .line 407
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    iget v2, p0, Lorg/jdom2/output/support/FormatStack;->depth:I

    mul-int/2addr p1, v2

    invoke-direct {v1, p1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 408
    :goto_0
    iget p1, p0, Lorg/jdom2/output/support/FormatStack;->depth:I

    if-ge v0, p1, :cond_2

    .line 409
    iget-object p1, p0, Lorg/jdom2/output/support/FormatStack;->indent:Ljava/lang/String;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 413
    :cond_2
    iget-object v0, p0, Lorg/jdom2/output/support/FormatStack;->termEOLIndent:[Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lorg/jdom2/output/support/FormatStack;->lineSeparator:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, p1

    .line 415
    iget-object p1, p0, Lorg/jdom2/output/support/FormatStack;->indent:Ljava/lang/String;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 416
    iget-object p1, p0, Lorg/jdom2/output/support/FormatStack;->levelIndent:[Ljava/lang/String;

    iget v0, p0, Lorg/jdom2/output/support/FormatStack;->depth:I

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    aput-object v1, p1, v0

    goto :goto_1

    .line 418
    :cond_3
    iget-object p1, p0, Lorg/jdom2/output/support/FormatStack;->termEOLIndent:[Ljava/lang/String;

    aput-object v3, p1, v2

    .line 419
    iget-object p1, p0, Lorg/jdom2/output/support/FormatStack;->levelIndent:[Ljava/lang/String;

    const-string v0, ""

    aput-object v0, p1, v2

    .line 421
    :goto_1
    iget-object p1, p0, Lorg/jdom2/output/support/FormatStack;->levelEOLIndent:[Ljava/lang/String;

    iget v0, p0, Lorg/jdom2/output/support/FormatStack;->depth:I

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lorg/jdom2/output/support/FormatStack;->lineSeparator:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lorg/jdom2/output/support/FormatStack;->levelIndent:[Ljava/lang/String;

    iget v3, p0, Lorg/jdom2/output/support/FormatStack;->depth:I

    aget-object v2, v2, v3

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    aput-object v1, p1, v0

    goto :goto_3

    .line 403
    :cond_4
    :goto_2
    iget-object p1, p0, Lorg/jdom2/output/support/FormatStack;->levelEOLIndent:[Ljava/lang/String;

    iget v0, p0, Lorg/jdom2/output/support/FormatStack;->depth:I

    aput-object v1, p1, v0

    .line 404
    iget-object p1, p0, Lorg/jdom2/output/support/FormatStack;->termEOLIndent:[Ljava/lang/String;

    aput-object v1, p1, v0

    goto :goto_3

    .line 395
    :cond_5
    iget-object p1, p0, Lorg/jdom2/output/support/FormatStack;->levelEOL:[Ljava/lang/String;

    iget v0, p0, Lorg/jdom2/output/support/FormatStack;->depth:I

    aput-object v1, p1, v0

    .line 396
    iget-object p1, p0, Lorg/jdom2/output/support/FormatStack;->levelIndent:[Ljava/lang/String;

    aput-object v1, p1, v0

    .line 397
    iget-object p1, p0, Lorg/jdom2/output/support/FormatStack;->levelEOLIndent:[Ljava/lang/String;

    aput-object v1, p1, v0

    .line 398
    iget-object p1, p0, Lorg/jdom2/output/support/FormatStack;->termEOLIndent:[Ljava/lang/String;

    aput-object v1, p1, v0

    .line 424
    :goto_3
    invoke-direct {p0}, Lorg/jdom2/output/support/FormatStack;->resetReusableIndents()V

    return-void
.end method
