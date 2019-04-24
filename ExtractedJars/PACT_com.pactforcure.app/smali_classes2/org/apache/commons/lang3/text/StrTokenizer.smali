.class public Lorg/apache/commons/lang3/text/StrTokenizer;
.super Ljava/lang/Object;
.source "StrTokenizer.java"

# interfaces
.implements Ljava/util/ListIterator;
.implements Ljava/lang/Cloneable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/ListIterator",
        "<",
        "Ljava/lang/String;",
        ">;",
        "Ljava/lang/Cloneable;"
    }
.end annotation


# static fields
.field private static final CSV_TOKENIZER_PROTOTYPE:Lorg/apache/commons/lang3/text/StrTokenizer;

.field private static final TSV_TOKENIZER_PROTOTYPE:Lorg/apache/commons/lang3/text/StrTokenizer;


# instance fields
.field private chars:[C

.field private delimMatcher:Lorg/apache/commons/lang3/text/StrMatcher;

.field private emptyAsNull:Z

.field private ignoreEmptyTokens:Z

.field private ignoredMatcher:Lorg/apache/commons/lang3/text/StrMatcher;

.field private quoteMatcher:Lorg/apache/commons/lang3/text/StrMatcher;

.field private tokenPos:I

.field private tokens:[Ljava/lang/String;

.field private trimmerMatcher:Lorg/apache/commons/lang3/text/StrMatcher;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 92
    new-instance v0, Lorg/apache/commons/lang3/text/StrTokenizer;

    invoke-direct {v0}, Lorg/apache/commons/lang3/text/StrTokenizer;-><init>()V

    sput-object v0, Lorg/apache/commons/lang3/text/StrTokenizer;->CSV_TOKENIZER_PROTOTYPE:Lorg/apache/commons/lang3/text/StrTokenizer;

    .line 93
    sget-object v0, Lorg/apache/commons/lang3/text/StrTokenizer;->CSV_TOKENIZER_PROTOTYPE:Lorg/apache/commons/lang3/text/StrTokenizer;

    invoke-static {}, Lorg/apache/commons/lang3/text/StrMatcher;->commaMatcher()Lorg/apache/commons/lang3/text/StrMatcher;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/apache/commons/lang3/text/StrTokenizer;->setDelimiterMatcher(Lorg/apache/commons/lang3/text/StrMatcher;)Lorg/apache/commons/lang3/text/StrTokenizer;

    .line 94
    sget-object v0, Lorg/apache/commons/lang3/text/StrTokenizer;->CSV_TOKENIZER_PROTOTYPE:Lorg/apache/commons/lang3/text/StrTokenizer;

    invoke-static {}, Lorg/apache/commons/lang3/text/StrMatcher;->doubleQuoteMatcher()Lorg/apache/commons/lang3/text/StrMatcher;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/apache/commons/lang3/text/StrTokenizer;->setQuoteMatcher(Lorg/apache/commons/lang3/text/StrMatcher;)Lorg/apache/commons/lang3/text/StrTokenizer;

    .line 95
    sget-object v0, Lorg/apache/commons/lang3/text/StrTokenizer;->CSV_TOKENIZER_PROTOTYPE:Lorg/apache/commons/lang3/text/StrTokenizer;

    invoke-static {}, Lorg/apache/commons/lang3/text/StrMatcher;->noneMatcher()Lorg/apache/commons/lang3/text/StrMatcher;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/apache/commons/lang3/text/StrTokenizer;->setIgnoredMatcher(Lorg/apache/commons/lang3/text/StrMatcher;)Lorg/apache/commons/lang3/text/StrTokenizer;

    .line 96
    sget-object v0, Lorg/apache/commons/lang3/text/StrTokenizer;->CSV_TOKENIZER_PROTOTYPE:Lorg/apache/commons/lang3/text/StrTokenizer;

    invoke-static {}, Lorg/apache/commons/lang3/text/StrMatcher;->trimMatcher()Lorg/apache/commons/lang3/text/StrMatcher;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/apache/commons/lang3/text/StrTokenizer;->setTrimmerMatcher(Lorg/apache/commons/lang3/text/StrMatcher;)Lorg/apache/commons/lang3/text/StrTokenizer;

    .line 97
    sget-object v0, Lorg/apache/commons/lang3/text/StrTokenizer;->CSV_TOKENIZER_PROTOTYPE:Lorg/apache/commons/lang3/text/StrTokenizer;

    invoke-virtual {v0, v2}, Lorg/apache/commons/lang3/text/StrTokenizer;->setEmptyTokenAsNull(Z)Lorg/apache/commons/lang3/text/StrTokenizer;

    .line 98
    sget-object v0, Lorg/apache/commons/lang3/text/StrTokenizer;->CSV_TOKENIZER_PROTOTYPE:Lorg/apache/commons/lang3/text/StrTokenizer;

    invoke-virtual {v0, v2}, Lorg/apache/commons/lang3/text/StrTokenizer;->setIgnoreEmptyTokens(Z)Lorg/apache/commons/lang3/text/StrTokenizer;

    .line 100
    new-instance v0, Lorg/apache/commons/lang3/text/StrTokenizer;

    invoke-direct {v0}, Lorg/apache/commons/lang3/text/StrTokenizer;-><init>()V

    sput-object v0, Lorg/apache/commons/lang3/text/StrTokenizer;->TSV_TOKENIZER_PROTOTYPE:Lorg/apache/commons/lang3/text/StrTokenizer;

    .line 101
    sget-object v0, Lorg/apache/commons/lang3/text/StrTokenizer;->TSV_TOKENIZER_PROTOTYPE:Lorg/apache/commons/lang3/text/StrTokenizer;

    invoke-static {}, Lorg/apache/commons/lang3/text/StrMatcher;->tabMatcher()Lorg/apache/commons/lang3/text/StrMatcher;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/apache/commons/lang3/text/StrTokenizer;->setDelimiterMatcher(Lorg/apache/commons/lang3/text/StrMatcher;)Lorg/apache/commons/lang3/text/StrTokenizer;

    .line 102
    sget-object v0, Lorg/apache/commons/lang3/text/StrTokenizer;->TSV_TOKENIZER_PROTOTYPE:Lorg/apache/commons/lang3/text/StrTokenizer;

    invoke-static {}, Lorg/apache/commons/lang3/text/StrMatcher;->doubleQuoteMatcher()Lorg/apache/commons/lang3/text/StrMatcher;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/apache/commons/lang3/text/StrTokenizer;->setQuoteMatcher(Lorg/apache/commons/lang3/text/StrMatcher;)Lorg/apache/commons/lang3/text/StrTokenizer;

    .line 103
    sget-object v0, Lorg/apache/commons/lang3/text/StrTokenizer;->TSV_TOKENIZER_PROTOTYPE:Lorg/apache/commons/lang3/text/StrTokenizer;

    invoke-static {}, Lorg/apache/commons/lang3/text/StrMatcher;->noneMatcher()Lorg/apache/commons/lang3/text/StrMatcher;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/apache/commons/lang3/text/StrTokenizer;->setIgnoredMatcher(Lorg/apache/commons/lang3/text/StrMatcher;)Lorg/apache/commons/lang3/text/StrTokenizer;

    .line 104
    sget-object v0, Lorg/apache/commons/lang3/text/StrTokenizer;->TSV_TOKENIZER_PROTOTYPE:Lorg/apache/commons/lang3/text/StrTokenizer;

    invoke-static {}, Lorg/apache/commons/lang3/text/StrMatcher;->trimMatcher()Lorg/apache/commons/lang3/text/StrMatcher;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/apache/commons/lang3/text/StrTokenizer;->setTrimmerMatcher(Lorg/apache/commons/lang3/text/StrMatcher;)Lorg/apache/commons/lang3/text/StrTokenizer;

    .line 105
    sget-object v0, Lorg/apache/commons/lang3/text/StrTokenizer;->TSV_TOKENIZER_PROTOTYPE:Lorg/apache/commons/lang3/text/StrTokenizer;

    invoke-virtual {v0, v2}, Lorg/apache/commons/lang3/text/StrTokenizer;->setEmptyTokenAsNull(Z)Lorg/apache/commons/lang3/text/StrTokenizer;

    .line 106
    sget-object v0, Lorg/apache/commons/lang3/text/StrTokenizer;->TSV_TOKENIZER_PROTOTYPE:Lorg/apache/commons/lang3/text/StrTokenizer;

    invoke-virtual {v0, v2}, Lorg/apache/commons/lang3/text/StrTokenizer;->setIgnoreEmptyTokens(Z)Lorg/apache/commons/lang3/text/StrTokenizer;

    .line 107
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    .line 240
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 117
    invoke-static {}, Lorg/apache/commons/lang3/text/StrMatcher;->splitMatcher()Lorg/apache/commons/lang3/text/StrMatcher;

    move-result-object v0

    iput-object v0, p0, Lorg/apache/commons/lang3/text/StrTokenizer;->delimMatcher:Lorg/apache/commons/lang3/text/StrMatcher;

    .line 119
    invoke-static {}, Lorg/apache/commons/lang3/text/StrMatcher;->noneMatcher()Lorg/apache/commons/lang3/text/StrMatcher;

    move-result-object v0

    iput-object v0, p0, Lorg/apache/commons/lang3/text/StrTokenizer;->quoteMatcher:Lorg/apache/commons/lang3/text/StrMatcher;

    .line 121
    invoke-static {}, Lorg/apache/commons/lang3/text/StrMatcher;->noneMatcher()Lorg/apache/commons/lang3/text/StrMatcher;

    move-result-object v0

    iput-object v0, p0, Lorg/apache/commons/lang3/text/StrTokenizer;->ignoredMatcher:Lorg/apache/commons/lang3/text/StrMatcher;

    .line 123
    invoke-static {}, Lorg/apache/commons/lang3/text/StrMatcher;->noneMatcher()Lorg/apache/commons/lang3/text/StrMatcher;

    move-result-object v0

    iput-object v0, p0, Lorg/apache/commons/lang3/text/StrTokenizer;->trimmerMatcher:Lorg/apache/commons/lang3/text/StrMatcher;

    .line 126
    const/4 v0, 0x0

    iput-boolean v0, p0, Lorg/apache/commons/lang3/text/StrTokenizer;->emptyAsNull:Z

    .line 128
    const/4 v0, 0x1

    iput-boolean v0, p0, Lorg/apache/commons/lang3/text/StrTokenizer;->ignoreEmptyTokens:Z

    .line 241
    const/4 v0, 0x0

    iput-object v0, p0, Lorg/apache/commons/lang3/text/StrTokenizer;->chars:[C

    .line 242
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1
    .param p1, "input"    # Ljava/lang/String;

    .prologue
    .line 251
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 117
    invoke-static {}, Lorg/apache/commons/lang3/text/StrMatcher;->splitMatcher()Lorg/apache/commons/lang3/text/StrMatcher;

    move-result-object v0

    iput-object v0, p0, Lorg/apache/commons/lang3/text/StrTokenizer;->delimMatcher:Lorg/apache/commons/lang3/text/StrMatcher;

    .line 119
    invoke-static {}, Lorg/apache/commons/lang3/text/StrMatcher;->noneMatcher()Lorg/apache/commons/lang3/text/StrMatcher;

    move-result-object v0

    iput-object v0, p0, Lorg/apache/commons/lang3/text/StrTokenizer;->quoteMatcher:Lorg/apache/commons/lang3/text/StrMatcher;

    .line 121
    invoke-static {}, Lorg/apache/commons/lang3/text/StrMatcher;->noneMatcher()Lorg/apache/commons/lang3/text/StrMatcher;

    move-result-object v0

    iput-object v0, p0, Lorg/apache/commons/lang3/text/StrTokenizer;->ignoredMatcher:Lorg/apache/commons/lang3/text/StrMatcher;

    .line 123
    invoke-static {}, Lorg/apache/commons/lang3/text/StrMatcher;->noneMatcher()Lorg/apache/commons/lang3/text/StrMatcher;

    move-result-object v0

    iput-object v0, p0, Lorg/apache/commons/lang3/text/StrTokenizer;->trimmerMatcher:Lorg/apache/commons/lang3/text/StrMatcher;

    .line 126
    const/4 v0, 0x0

    iput-boolean v0, p0, Lorg/apache/commons/lang3/text/StrTokenizer;->emptyAsNull:Z

    .line 128
    const/4 v0, 0x1

    iput-boolean v0, p0, Lorg/apache/commons/lang3/text/StrTokenizer;->ignoreEmptyTokens:Z

    .line 252
    if-eqz p1, :cond_0

    .line 253
    invoke-virtual {p1}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    iput-object v0, p0, Lorg/apache/commons/lang3/text/StrTokenizer;->chars:[C

    .line 257
    :goto_0
    return-void

    .line 255
    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lorg/apache/commons/lang3/text/StrTokenizer;->chars:[C

    goto :goto_0
.end method

.method public constructor <init>(Ljava/lang/String;C)V
    .locals 0
    .param p1, "input"    # Ljava/lang/String;
    .param p2, "delim"    # C

    .prologue
    .line 266
    invoke-direct {p0, p1}, Lorg/apache/commons/lang3/text/StrTokenizer;-><init>(Ljava/lang/String;)V

    .line 267
    invoke-virtual {p0, p2}, Lorg/apache/commons/lang3/text/StrTokenizer;->setDelimiterChar(C)Lorg/apache/commons/lang3/text/StrTokenizer;

    .line 268
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;CC)V
    .locals 0
    .param p1, "input"    # Ljava/lang/String;
    .param p2, "delim"    # C
    .param p3, "quote"    # C

    .prologue
    .line 301
    invoke-direct {p0, p1, p2}, Lorg/apache/commons/lang3/text/StrTokenizer;-><init>(Ljava/lang/String;C)V

    .line 302
    invoke-virtual {p0, p3}, Lorg/apache/commons/lang3/text/StrTokenizer;->setQuoteChar(C)Lorg/apache/commons/lang3/text/StrTokenizer;

    .line 303
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0
    .param p1, "input"    # Ljava/lang/String;
    .param p2, "delim"    # Ljava/lang/String;

    .prologue
    .line 277
    invoke-direct {p0, p1}, Lorg/apache/commons/lang3/text/StrTokenizer;-><init>(Ljava/lang/String;)V

    .line 278
    invoke-virtual {p0, p2}, Lorg/apache/commons/lang3/text/StrTokenizer;->setDelimiterString(Ljava/lang/String;)Lorg/apache/commons/lang3/text/StrTokenizer;

    .line 279
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lorg/apache/commons/lang3/text/StrMatcher;)V
    .locals 0
    .param p1, "input"    # Ljava/lang/String;
    .param p2, "delim"    # Lorg/apache/commons/lang3/text/StrMatcher;

    .prologue
    .line 288
    invoke-direct {p0, p1}, Lorg/apache/commons/lang3/text/StrTokenizer;-><init>(Ljava/lang/String;)V

    .line 289
    invoke-virtual {p0, p2}, Lorg/apache/commons/lang3/text/StrTokenizer;->setDelimiterMatcher(Lorg/apache/commons/lang3/text/StrMatcher;)Lorg/apache/commons/lang3/text/StrTokenizer;

    .line 290
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lorg/apache/commons/lang3/text/StrMatcher;Lorg/apache/commons/lang3/text/StrMatcher;)V
    .locals 0
    .param p1, "input"    # Ljava/lang/String;
    .param p2, "delim"    # Lorg/apache/commons/lang3/text/StrMatcher;
    .param p3, "quote"    # Lorg/apache/commons/lang3/text/StrMatcher;

    .prologue
    .line 314
    invoke-direct {p0, p1, p2}, Lorg/apache/commons/lang3/text/StrTokenizer;-><init>(Ljava/lang/String;Lorg/apache/commons/lang3/text/StrMatcher;)V

    .line 315
    invoke-virtual {p0, p3}, Lorg/apache/commons/lang3/text/StrTokenizer;->setQuoteMatcher(Lorg/apache/commons/lang3/text/StrMatcher;)Lorg/apache/commons/lang3/text/StrTokenizer;

    .line 316
    return-void
.end method

.method public constructor <init>([C)V
    .locals 1
    .param p1, "input"    # [C

    .prologue
    .line 325
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 117
    invoke-static {}, Lorg/apache/commons/lang3/text/StrMatcher;->splitMatcher()Lorg/apache/commons/lang3/text/StrMatcher;

    move-result-object v0

    iput-object v0, p0, Lorg/apache/commons/lang3/text/StrTokenizer;->delimMatcher:Lorg/apache/commons/lang3/text/StrMatcher;

    .line 119
    invoke-static {}, Lorg/apache/commons/lang3/text/StrMatcher;->noneMatcher()Lorg/apache/commons/lang3/text/StrMatcher;

    move-result-object v0

    iput-object v0, p0, Lorg/apache/commons/lang3/text/StrTokenizer;->quoteMatcher:Lorg/apache/commons/lang3/text/StrMatcher;

    .line 121
    invoke-static {}, Lorg/apache/commons/lang3/text/StrMatcher;->noneMatcher()Lorg/apache/commons/lang3/text/StrMatcher;

    move-result-object v0

    iput-object v0, p0, Lorg/apache/commons/lang3/text/StrTokenizer;->ignoredMatcher:Lorg/apache/commons/lang3/text/StrMatcher;

    .line 123
    invoke-static {}, Lorg/apache/commons/lang3/text/StrMatcher;->noneMatcher()Lorg/apache/commons/lang3/text/StrMatcher;

    move-result-object v0

    iput-object v0, p0, Lorg/apache/commons/lang3/text/StrTokenizer;->trimmerMatcher:Lorg/apache/commons/lang3/text/StrMatcher;

    .line 126
    const/4 v0, 0x0

    iput-boolean v0, p0, Lorg/apache/commons/lang3/text/StrTokenizer;->emptyAsNull:Z

    .line 128
    const/4 v0, 0x1

    iput-boolean v0, p0, Lorg/apache/commons/lang3/text/StrTokenizer;->ignoreEmptyTokens:Z

    .line 326
    invoke-static {p1}, Lorg/apache/commons/lang3/ArrayUtils;->clone([C)[C

    move-result-object v0

    iput-object v0, p0, Lorg/apache/commons/lang3/text/StrTokenizer;->chars:[C

    .line 327
    return-void
.end method

.method public constructor <init>([CC)V
    .locals 0
    .param p1, "input"    # [C
    .param p2, "delim"    # C

    .prologue
    .line 336
    invoke-direct {p0, p1}, Lorg/apache/commons/lang3/text/StrTokenizer;-><init>([C)V

    .line 337
    invoke-virtual {p0, p2}, Lorg/apache/commons/lang3/text/StrTokenizer;->setDelimiterChar(C)Lorg/apache/commons/lang3/text/StrTokenizer;

    .line 338
    return-void
.end method

.method public constructor <init>([CCC)V
    .locals 0
    .param p1, "input"    # [C
    .param p2, "delim"    # C
    .param p3, "quote"    # C

    .prologue
    .line 371
    invoke-direct {p0, p1, p2}, Lorg/apache/commons/lang3/text/StrTokenizer;-><init>([CC)V

    .line 372
    invoke-virtual {p0, p3}, Lorg/apache/commons/lang3/text/StrTokenizer;->setQuoteChar(C)Lorg/apache/commons/lang3/text/StrTokenizer;

    .line 373
    return-void
.end method

.method public constructor <init>([CLjava/lang/String;)V
    .locals 0
    .param p1, "input"    # [C
    .param p2, "delim"    # Ljava/lang/String;

    .prologue
    .line 347
    invoke-direct {p0, p1}, Lorg/apache/commons/lang3/text/StrTokenizer;-><init>([C)V

    .line 348
    invoke-virtual {p0, p2}, Lorg/apache/commons/lang3/text/StrTokenizer;->setDelimiterString(Ljava/lang/String;)Lorg/apache/commons/lang3/text/StrTokenizer;

    .line 349
    return-void
.end method

.method public constructor <init>([CLorg/apache/commons/lang3/text/StrMatcher;)V
    .locals 0
    .param p1, "input"    # [C
    .param p2, "delim"    # Lorg/apache/commons/lang3/text/StrMatcher;

    .prologue
    .line 358
    invoke-direct {p0, p1}, Lorg/apache/commons/lang3/text/StrTokenizer;-><init>([C)V

    .line 359
    invoke-virtual {p0, p2}, Lorg/apache/commons/lang3/text/StrTokenizer;->setDelimiterMatcher(Lorg/apache/commons/lang3/text/StrMatcher;)Lorg/apache/commons/lang3/text/StrTokenizer;

    .line 360
    return-void
.end method

.method public constructor <init>([CLorg/apache/commons/lang3/text/StrMatcher;Lorg/apache/commons/lang3/text/StrMatcher;)V
    .locals 0
    .param p1, "input"    # [C
    .param p2, "delim"    # Lorg/apache/commons/lang3/text/StrMatcher;
    .param p3, "quote"    # Lorg/apache/commons/lang3/text/StrMatcher;

    .prologue
    .line 384
    invoke-direct {p0, p1, p2}, Lorg/apache/commons/lang3/text/StrTokenizer;-><init>([CLorg/apache/commons/lang3/text/StrMatcher;)V

    .line 385
    invoke-virtual {p0, p3}, Lorg/apache/commons/lang3/text/StrTokenizer;->setQuoteMatcher(Lorg/apache/commons/lang3/text/StrMatcher;)Lorg/apache/commons/lang3/text/StrTokenizer;

    .line 386
    return-void
.end method

.method private addToken(Ljava/util/List;Ljava/lang/String;)V
    .locals 1
    .param p2, "tok"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .prologue
    .line 653
    .local p1, "list":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    if-eqz p2, :cond_0

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_2

    .line 654
    :cond_0
    invoke-virtual {p0}, Lorg/apache/commons/lang3/text/StrTokenizer;->isIgnoreEmptyTokens()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 662
    :goto_0
    return-void

    .line 657
    :cond_1
    invoke-virtual {p0}, Lorg/apache/commons/lang3/text/StrTokenizer;->isEmptyTokenAsNull()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 658
    const/4 p2, 0x0

    .line 661
    :cond_2
    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0
.end method

.method private checkTokenized()V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 593
    iget-object v1, p0, Lorg/apache/commons/lang3/text/StrTokenizer;->tokens:[Ljava/lang/String;

    if-nez v1, :cond_0

    .line 594
    iget-object v1, p0, Lorg/apache/commons/lang3/text/StrTokenizer;->chars:[C

    if-nez v1, :cond_1

    .line 596
    const/4 v1, 0x0

    invoke-virtual {p0, v1, v3, v3}, Lorg/apache/commons/lang3/text/StrTokenizer;->tokenize([CII)Ljava/util/List;

    move-result-object v0

    .line 597
    .local v0, "split":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    new-array v1, v1, [Ljava/lang/String;

    invoke-interface {v0, v1}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Ljava/lang/String;

    iput-object v1, p0, Lorg/apache/commons/lang3/text/StrTokenizer;->tokens:[Ljava/lang/String;

    .line 603
    .end local v0    # "split":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    :cond_0
    :goto_0
    return-void

    .line 599
    :cond_1
    iget-object v1, p0, Lorg/apache/commons/lang3/text/StrTokenizer;->chars:[C

    iget-object v2, p0, Lorg/apache/commons/lang3/text/StrTokenizer;->chars:[C

    array-length v2, v2

    invoke-virtual {p0, v1, v3, v2}, Lorg/apache/commons/lang3/text/StrTokenizer;->tokenize([CII)Ljava/util/List;

    move-result-object v0

    .line 600
    .restart local v0    # "split":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    new-array v1, v1, [Ljava/lang/String;

    invoke-interface {v0, v1}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Ljava/lang/String;

    iput-object v1, p0, Lorg/apache/commons/lang3/text/StrTokenizer;->tokens:[Ljava/lang/String;

    goto :goto_0
.end method

.method private static getCSVClone()Lorg/apache/commons/lang3/text/StrTokenizer;
    .locals 1

    .prologue
    .line 138
    sget-object v0, Lorg/apache/commons/lang3/text/StrTokenizer;->CSV_TOKENIZER_PROTOTYPE:Lorg/apache/commons/lang3/text/StrTokenizer;

    invoke-virtual {v0}, Lorg/apache/commons/lang3/text/StrTokenizer;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/apache/commons/lang3/text/StrTokenizer;

    return-object v0
.end method

.method public static getCSVInstance()Lorg/apache/commons/lang3/text/StrTokenizer;
    .locals 1

    .prologue
    .line 151
    invoke-static {}, Lorg/apache/commons/lang3/text/StrTokenizer;->getCSVClone()Lorg/apache/commons/lang3/text/StrTokenizer;

    move-result-object v0

    return-object v0
.end method

.method public static getCSVInstance(Ljava/lang/String;)Lorg/apache/commons/lang3/text/StrTokenizer;
    .locals 1
    .param p0, "input"    # Ljava/lang/String;

    .prologue
    .line 164
    invoke-static {}, Lorg/apache/commons/lang3/text/StrTokenizer;->getCSVClone()Lorg/apache/commons/lang3/text/StrTokenizer;

    move-result-object v0

    .line 165
    .local v0, "tok":Lorg/apache/commons/lang3/text/StrTokenizer;
    invoke-virtual {v0, p0}, Lorg/apache/commons/lang3/text/StrTokenizer;->reset(Ljava/lang/String;)Lorg/apache/commons/lang3/text/StrTokenizer;

    .line 166
    return-object v0
.end method

.method public static getCSVInstance([C)Lorg/apache/commons/lang3/text/StrTokenizer;
    .locals 1
    .param p0, "input"    # [C

    .prologue
    .line 179
    invoke-static {}, Lorg/apache/commons/lang3/text/StrTokenizer;->getCSVClone()Lorg/apache/commons/lang3/text/StrTokenizer;

    move-result-object v0

    .line 180
    .local v0, "tok":Lorg/apache/commons/lang3/text/StrTokenizer;
    invoke-virtual {v0, p0}, Lorg/apache/commons/lang3/text/StrTokenizer;->reset([C)Lorg/apache/commons/lang3/text/StrTokenizer;

    .line 181
    return-object v0
.end method

.method private static getTSVClone()Lorg/apache/commons/lang3/text/StrTokenizer;
    .locals 1

    .prologue
    .line 190
    sget-object v0, Lorg/apache/commons/lang3/text/StrTokenizer;->TSV_TOKENIZER_PROTOTYPE:Lorg/apache/commons/lang3/text/StrTokenizer;

    invoke-virtual {v0}, Lorg/apache/commons/lang3/text/StrTokenizer;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/apache/commons/lang3/text/StrTokenizer;

    return-object v0
.end method

.method public static getTSVInstance()Lorg/apache/commons/lang3/text/StrTokenizer;
    .locals 1

    .prologue
    .line 203
    invoke-static {}, Lorg/apache/commons/lang3/text/StrTokenizer;->getTSVClone()Lorg/apache/commons/lang3/text/StrTokenizer;

    move-result-object v0

    return-object v0
.end method

.method public static getTSVInstance(Ljava/lang/String;)Lorg/apache/commons/lang3/text/StrTokenizer;
    .locals 1
    .param p0, "input"    # Ljava/lang/String;

    .prologue
    .line 214
    invoke-static {}, Lorg/apache/commons/lang3/text/StrTokenizer;->getTSVClone()Lorg/apache/commons/lang3/text/StrTokenizer;

    move-result-object v0

    .line 215
    .local v0, "tok":Lorg/apache/commons/lang3/text/StrTokenizer;
    invoke-virtual {v0, p0}, Lorg/apache/commons/lang3/text/StrTokenizer;->reset(Ljava/lang/String;)Lorg/apache/commons/lang3/text/StrTokenizer;

    .line 216
    return-object v0
.end method

.method public static getTSVInstance([C)Lorg/apache/commons/lang3/text/StrTokenizer;
    .locals 1
    .param p0, "input"    # [C

    .prologue
    .line 227
    invoke-static {}, Lorg/apache/commons/lang3/text/StrTokenizer;->getTSVClone()Lorg/apache/commons/lang3/text/StrTokenizer;

    move-result-object v0

    .line 228
    .local v0, "tok":Lorg/apache/commons/lang3/text/StrTokenizer;
    invoke-virtual {v0, p0}, Lorg/apache/commons/lang3/text/StrTokenizer;->reset([C)Lorg/apache/commons/lang3/text/StrTokenizer;

    .line 229
    return-object v0
.end method

.method private isQuote([CIIII)Z
    .locals 3
    .param p1, "chars"    # [C
    .param p2, "pos"    # I
    .param p3, "len"    # I
    .param p4, "quoteStart"    # I
    .param p5, "quoteLen"    # I

    .prologue
    .line 824
    const/4 v0, 0x0

    .local v0, "i":I
    :goto_0
    if-ge v0, p5, :cond_2

    .line 825
    add-int v1, p2, v0

    if-ge v1, p3, :cond_0

    add-int v1, p2, v0

    aget-char v1, p1, v1

    add-int v2, p4, v0

    aget-char v2, p1, v2

    if-eq v1, v2, :cond_1

    .line 826
    :cond_0
    const/4 v1, 0x0

    .line 829
    :goto_1
    return v1

    .line 824
    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 829
    :cond_2
    const/4 v1, 0x1

    goto :goto_1
.end method

.method private readNextToken([CIILorg/apache/commons/lang3/text/StrBuilder;Ljava/util/List;)I
    .locals 22
    .param p1, "chars"    # [C
    .param p2, "start"    # I
    .param p3, "len"    # I
    .param p4, "workArea"    # Lorg/apache/commons/lang3/text/StrBuilder;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([CII",
            "Lorg/apache/commons/lang3/text/StrBuilder;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;)I"
        }
    .end annotation

    .prologue
    .line 678
    .local p5, "tokens":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    :goto_0
    move/from16 v0, p2

    move/from16 v1, p3

    if-ge v0, v1, :cond_0

    .line 679
    invoke-virtual/range {p0 .. p0}, Lorg/apache/commons/lang3/text/StrTokenizer;->getIgnoredMatcher()Lorg/apache/commons/lang3/text/StrMatcher;

    move-result-object v4

    move-object/from16 v0, p1

    move/from16 v1, p2

    move/from16 v2, p2

    move/from16 v3, p3

    invoke-virtual {v4, v0, v1, v2, v3}, Lorg/apache/commons/lang3/text/StrMatcher;->isMatch([CIII)I

    move-result v4

    invoke-virtual/range {p0 .. p0}, Lorg/apache/commons/lang3/text/StrTokenizer;->getTrimmerMatcher()Lorg/apache/commons/lang3/text/StrMatcher;

    move-result-object v5

    move-object/from16 v0, p1

    move/from16 v1, p2

    move/from16 v2, p2

    move/from16 v3, p3

    invoke-virtual {v5, v0, v1, v2, v3}, Lorg/apache/commons/lang3/text/StrMatcher;->isMatch([CIII)I

    move-result v5

    invoke-static {v4, v5}, Ljava/lang/Math;->max(II)I

    move-result v21

    .line 682
    .local v21, "removeLen":I
    if-eqz v21, :cond_0

    invoke-virtual/range {p0 .. p0}, Lorg/apache/commons/lang3/text/StrTokenizer;->getDelimiterMatcher()Lorg/apache/commons/lang3/text/StrMatcher;

    move-result-object v4

    move-object/from16 v0, p1

    move/from16 v1, p2

    move/from16 v2, p2

    move/from16 v3, p3

    invoke-virtual {v4, v0, v1, v2, v3}, Lorg/apache/commons/lang3/text/StrMatcher;->isMatch([CIII)I

    move-result v4

    if-gtz v4, :cond_0

    invoke-virtual/range {p0 .. p0}, Lorg/apache/commons/lang3/text/StrTokenizer;->getQuoteMatcher()Lorg/apache/commons/lang3/text/StrMatcher;

    move-result-object v4

    move-object/from16 v0, p1

    move/from16 v1, p2

    move/from16 v2, p2

    move/from16 v3, p3

    invoke-virtual {v4, v0, v1, v2, v3}, Lorg/apache/commons/lang3/text/StrMatcher;->isMatch([CIII)I

    move-result v4

    if-lez v4, :cond_1

    .line 691
    .end local v21    # "removeLen":I
    :cond_0
    move/from16 v0, p2

    move/from16 v1, p3

    if-lt v0, v1, :cond_2

    .line 692
    const-string v4, ""

    move-object/from16 v0, p0

    move-object/from16 v1, p5

    invoke-direct {v0, v1, v4}, Lorg/apache/commons/lang3/text/StrTokenizer;->addToken(Ljava/util/List;Ljava/lang/String;)V

    .line 693
    const/4 v4, -0x1

    .line 708
    :goto_1
    return v4

    .line 687
    .restart local v21    # "removeLen":I
    :cond_1
    add-int p2, p2, v21

    .line 688
    goto :goto_0

    .line 697
    .end local v21    # "removeLen":I
    :cond_2
    invoke-virtual/range {p0 .. p0}, Lorg/apache/commons/lang3/text/StrTokenizer;->getDelimiterMatcher()Lorg/apache/commons/lang3/text/StrMatcher;

    move-result-object v4

    move-object/from16 v0, p1

    move/from16 v1, p2

    move/from16 v2, p2

    move/from16 v3, p3

    invoke-virtual {v4, v0, v1, v2, v3}, Lorg/apache/commons/lang3/text/StrMatcher;->isMatch([CIII)I

    move-result v20

    .line 698
    .local v20, "delimLen":I
    if-lez v20, :cond_3

    .line 699
    const-string v4, ""

    move-object/from16 v0, p0

    move-object/from16 v1, p5

    invoke-direct {v0, v1, v4}, Lorg/apache/commons/lang3/text/StrTokenizer;->addToken(Ljava/util/List;Ljava/lang/String;)V

    .line 700
    add-int v4, p2, v20

    goto :goto_1

    .line 704
    :cond_3
    invoke-virtual/range {p0 .. p0}, Lorg/apache/commons/lang3/text/StrTokenizer;->getQuoteMatcher()Lorg/apache/commons/lang3/text/StrMatcher;

    move-result-object v4

    move-object/from16 v0, p1

    move/from16 v1, p2

    move/from16 v2, p2

    move/from16 v3, p3

    invoke-virtual {v4, v0, v1, v2, v3}, Lorg/apache/commons/lang3/text/StrMatcher;->isMatch([CIII)I

    move-result v11

    .line 705
    .local v11, "quoteLen":I
    if-lez v11, :cond_4

    .line 706
    add-int v6, p2, v11

    move-object/from16 v4, p0

    move-object/from16 v5, p1

    move/from16 v7, p3

    move-object/from16 v8, p4

    move-object/from16 v9, p5

    move/from16 v10, p2

    invoke-direct/range {v4 .. v11}, Lorg/apache/commons/lang3/text/StrTokenizer;->readWithQuotes([CIILorg/apache/commons/lang3/text/StrBuilder;Ljava/util/List;II)I

    move-result v4

    goto :goto_1

    .line 708
    :cond_4
    const/16 v18, 0x0

    const/16 v19, 0x0

    move-object/from16 v12, p0

    move-object/from16 v13, p1

    move/from16 v14, p2

    move/from16 v15, p3

    move-object/from16 v16, p4

    move-object/from16 v17, p5

    invoke-direct/range {v12 .. v19}, Lorg/apache/commons/lang3/text/StrTokenizer;->readWithQuotes([CIILorg/apache/commons/lang3/text/StrBuilder;Ljava/util/List;II)I

    move-result v4

    goto :goto_1
.end method

.method private readWithQuotes([CIILorg/apache/commons/lang3/text/StrBuilder;Ljava/util/List;II)I
    .locals 18
    .param p1, "chars"    # [C
    .param p2, "start"    # I
    .param p3, "len"    # I
    .param p4, "workArea"    # Lorg/apache/commons/lang3/text/StrBuilder;
    .param p6, "quoteStart"    # I
    .param p7, "quoteLen"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([CII",
            "Lorg/apache/commons/lang3/text/StrBuilder;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;II)I"
        }
    .end annotation

    .prologue
    .line 729
    .local p5, "tokens":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    invoke-virtual/range {p4 .. p4}, Lorg/apache/commons/lang3/text/StrBuilder;->clear()Lorg/apache/commons/lang3/text/StrBuilder;

    .line 730
    move/from16 v5, p2

    .line 731
    .local v5, "pos":I
    if-lez p7, :cond_0

    const/4 v15, 0x1

    .line 732
    .local v15, "quoting":Z
    :goto_0
    const/16 v16, 0x0

    .line 734
    .local v16, "trimStart":I
    :goto_1
    move/from16 v0, p3

    if-ge v5, v0, :cond_8

    .line 738
    if-eqz v15, :cond_3

    move-object/from16 v3, p0

    move-object/from16 v4, p1

    move/from16 v6, p3

    move/from16 v7, p6

    move/from16 v8, p7

    .line 745
    invoke-direct/range {v3 .. v8}, Lorg/apache/commons/lang3/text/StrTokenizer;->isQuote([CIIII)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 746
    add-int v8, v5, p7

    move-object/from16 v6, p0

    move-object/from16 v7, p1

    move/from16 v9, p3

    move/from16 v10, p6

    move/from16 v11, p7

    invoke-direct/range {v6 .. v11}, Lorg/apache/commons/lang3/text/StrTokenizer;->isQuote([CIIII)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 748
    move-object/from16 v0, p4

    move-object/from16 v1, p1

    move/from16 v2, p7

    invoke-virtual {v0, v1, v5, v2}, Lorg/apache/commons/lang3/text/StrBuilder;->append([CII)Lorg/apache/commons/lang3/text/StrBuilder;

    .line 749
    mul-int/lit8 v3, p7, 0x2

    add-int/2addr v5, v3

    .line 750
    invoke-virtual/range {p4 .. p4}, Lorg/apache/commons/lang3/text/StrBuilder;->size()I

    move-result v16

    .line 751
    goto :goto_1

    .line 731
    .end local v15    # "quoting":Z
    .end local v16    # "trimStart":I
    :cond_0
    const/4 v15, 0x0

    goto :goto_0

    .line 755
    .restart local v15    # "quoting":Z
    .restart local v16    # "trimStart":I
    :cond_1
    const/4 v15, 0x0

    .line 756
    add-int v5, v5, p7

    .line 757
    goto :goto_1

    .line 761
    :cond_2
    add-int/lit8 v14, v5, 0x1

    .end local v5    # "pos":I
    .local v14, "pos":I
    aget-char v3, p1, v5

    move-object/from16 v0, p4

    invoke-virtual {v0, v3}, Lorg/apache/commons/lang3/text/StrBuilder;->append(C)Lorg/apache/commons/lang3/text/StrBuilder;

    .line 762
    invoke-virtual/range {p4 .. p4}, Lorg/apache/commons/lang3/text/StrBuilder;->size()I

    move-result v16

    move v5, v14

    .end local v14    # "pos":I
    .restart local v5    # "pos":I
    goto :goto_1

    .line 768
    :cond_3
    invoke-virtual/range {p0 .. p0}, Lorg/apache/commons/lang3/text/StrTokenizer;->getDelimiterMatcher()Lorg/apache/commons/lang3/text/StrMatcher;

    move-result-object v3

    move-object/from16 v0, p1

    move/from16 v1, p2

    move/from16 v2, p3

    invoke-virtual {v3, v0, v5, v1, v2}, Lorg/apache/commons/lang3/text/StrMatcher;->isMatch([CIII)I

    move-result v12

    .line 769
    .local v12, "delimLen":I
    if-lez v12, :cond_4

    .line 771
    const/4 v3, 0x0

    move-object/from16 v0, p4

    move/from16 v1, v16

    invoke-virtual {v0, v3, v1}, Lorg/apache/commons/lang3/text/StrBuilder;->substring(II)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v0, p0

    move-object/from16 v1, p5

    invoke-direct {v0, v1, v3}, Lorg/apache/commons/lang3/text/StrTokenizer;->addToken(Ljava/util/List;Ljava/lang/String;)V

    .line 772
    add-int v3, v5, v12

    .line 809
    .end local v12    # "delimLen":I
    :goto_2
    return v3

    .line 776
    .restart local v12    # "delimLen":I
    :cond_4
    if-lez p7, :cond_5

    move-object/from16 v3, p0

    move-object/from16 v4, p1

    move/from16 v6, p3

    move/from16 v7, p6

    move/from16 v8, p7

    .line 777
    invoke-direct/range {v3 .. v8}, Lorg/apache/commons/lang3/text/StrTokenizer;->isQuote([CIIII)Z

    move-result v3

    if-eqz v3, :cond_5

    .line 778
    const/4 v15, 0x1

    .line 779
    add-int v5, v5, p7

    .line 780
    goto/16 :goto_1

    .line 785
    :cond_5
    invoke-virtual/range {p0 .. p0}, Lorg/apache/commons/lang3/text/StrTokenizer;->getIgnoredMatcher()Lorg/apache/commons/lang3/text/StrMatcher;

    move-result-object v3

    move-object/from16 v0, p1

    move/from16 v1, p2

    move/from16 v2, p3

    invoke-virtual {v3, v0, v5, v1, v2}, Lorg/apache/commons/lang3/text/StrMatcher;->isMatch([CIII)I

    move-result v13

    .line 786
    .local v13, "ignoredLen":I
    if-lez v13, :cond_6

    .line 787
    add-int/2addr v5, v13

    .line 788
    goto/16 :goto_1

    .line 794
    :cond_6
    invoke-virtual/range {p0 .. p0}, Lorg/apache/commons/lang3/text/StrTokenizer;->getTrimmerMatcher()Lorg/apache/commons/lang3/text/StrMatcher;

    move-result-object v3

    move-object/from16 v0, p1

    move/from16 v1, p2

    move/from16 v2, p3

    invoke-virtual {v3, v0, v5, v1, v2}, Lorg/apache/commons/lang3/text/StrMatcher;->isMatch([CIII)I

    move-result v17

    .line 795
    .local v17, "trimmedLen":I
    if-lez v17, :cond_7

    .line 796
    move-object/from16 v0, p4

    move-object/from16 v1, p1

    move/from16 v2, v17

    invoke-virtual {v0, v1, v5, v2}, Lorg/apache/commons/lang3/text/StrBuilder;->append([CII)Lorg/apache/commons/lang3/text/StrBuilder;

    .line 797
    add-int v5, v5, v17

    .line 798
    goto/16 :goto_1

    .line 802
    :cond_7
    add-int/lit8 v14, v5, 0x1

    .end local v5    # "pos":I
    .restart local v14    # "pos":I
    aget-char v3, p1, v5

    move-object/from16 v0, p4

    invoke-virtual {v0, v3}, Lorg/apache/commons/lang3/text/StrBuilder;->append(C)Lorg/apache/commons/lang3/text/StrBuilder;

    .line 803
    invoke-virtual/range {p4 .. p4}, Lorg/apache/commons/lang3/text/StrBuilder;->size()I

    move-result v16

    move v5, v14

    .line 804
    .end local v14    # "pos":I
    .restart local v5    # "pos":I
    goto/16 :goto_1

    .line 808
    .end local v12    # "delimLen":I
    .end local v13    # "ignoredLen":I
    .end local v17    # "trimmedLen":I
    :cond_8
    const/4 v3, 0x0

    move-object/from16 v0, p4

    move/from16 v1, v16

    invoke-virtual {v0, v3, v1}, Lorg/apache/commons/lang3/text/StrBuilder;->substring(II)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v0, p0

    move-object/from16 v1, p5

    invoke-direct {v0, v1, v3}, Lorg/apache/commons/lang3/text/StrTokenizer;->addToken(Ljava/util/List;Ljava/lang/String;)V

    .line 809
    const/4 v3, -0x1

    goto :goto_2
.end method


# virtual methods
.method public bridge synthetic add(Ljava/lang/Object;)V
    .locals 0
    .param p1, "x0"    # Ljava/lang/Object;

    .prologue
    .line 87
    check-cast p1, Ljava/lang/String;

    .end local p1    # "x0":Ljava/lang/Object;
    invoke-virtual {p0, p1}, Lorg/apache/commons/lang3/text/StrTokenizer;->add(Ljava/lang/String;)V

    return-void
.end method

.method public add(Ljava/lang/String;)V
    .locals 2
    .param p1, "obj"    # Ljava/lang/String;

    .prologue
    .line 584
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "add() is unsupported"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public clone()Ljava/lang/Object;
    .locals 2

    .prologue
    .line 1069
    :try_start_0
    invoke-virtual {p0}, Lorg/apache/commons/lang3/text/StrTokenizer;->cloneReset()Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v1

    .line 1071
    :goto_0
    return-object v1

    .line 1070
    :catch_0
    move-exception v0

    .line 1071
    .local v0, "ex":Ljava/lang/CloneNotSupportedException;
    const/4 v1, 0x0

    goto :goto_0
.end method

.method cloneReset()Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/CloneNotSupportedException;
        }
    .end annotation

    .prologue
    .line 1084
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/apache/commons/lang3/text/StrTokenizer;

    .line 1085
    .local v0, "cloned":Lorg/apache/commons/lang3/text/StrTokenizer;
    iget-object v1, v0, Lorg/apache/commons/lang3/text/StrTokenizer;->chars:[C

    if-eqz v1, :cond_0

    .line 1086
    iget-object v1, v0, Lorg/apache/commons/lang3/text/StrTokenizer;->chars:[C

    invoke-virtual {v1}, [C->clone()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [C

    iput-object v1, v0, Lorg/apache/commons/lang3/text/StrTokenizer;->chars:[C

    .line 1088
    :cond_0
    invoke-virtual {v0}, Lorg/apache/commons/lang3/text/StrTokenizer;->reset()Lorg/apache/commons/lang3/text/StrTokenizer;

    .line 1089
    return-object v0
.end method

.method public getContent()Ljava/lang/String;
    .locals 2

    .prologue
    .line 1052
    iget-object v0, p0, Lorg/apache/commons/lang3/text/StrTokenizer;->chars:[C

    if-nez v0, :cond_0

    .line 1053
    const/4 v0, 0x0

    .line 1055
    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/String;

    iget-object v1, p0, Lorg/apache/commons/lang3/text/StrTokenizer;->chars:[C

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>([C)V

    goto :goto_0
.end method

.method public getDelimiterMatcher()Lorg/apache/commons/lang3/text/StrMatcher;
    .locals 1

    .prologue
    .line 840
    iget-object v0, p0, Lorg/apache/commons/lang3/text/StrTokenizer;->delimMatcher:Lorg/apache/commons/lang3/text/StrMatcher;

    return-object v0
.end method

.method public getIgnoredMatcher()Lorg/apache/commons/lang3/text/StrMatcher;
    .locals 1

    .prologue
    .line 936
    iget-object v0, p0, Lorg/apache/commons/lang3/text/StrTokenizer;->ignoredMatcher:Lorg/apache/commons/lang3/text/StrMatcher;

    return-object v0
.end method

.method public getQuoteMatcher()Lorg/apache/commons/lang3/text/StrMatcher;
    .locals 1

    .prologue
    .line 892
    iget-object v0, p0, Lorg/apache/commons/lang3/text/StrTokenizer;->quoteMatcher:Lorg/apache/commons/lang3/text/StrMatcher;

    return-object v0
.end method

.method public getTokenArray()[Ljava/lang/String;
    .locals 1

    .prologue
    .line 432
    invoke-direct {p0}, Lorg/apache/commons/lang3/text/StrTokenizer;->checkTokenized()V

    .line 433
    iget-object v0, p0, Lorg/apache/commons/lang3/text/StrTokenizer;->tokens:[Ljava/lang/String;

    invoke-virtual {v0}, [Ljava/lang/String;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    return-object v0
.end method

.method public getTokenList()Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 442
    invoke-direct {p0}, Lorg/apache/commons/lang3/text/StrTokenizer;->checkTokenized()V

    .line 443
    new-instance v4, Ljava/util/ArrayList;

    iget-object v5, p0, Lorg/apache/commons/lang3/text/StrTokenizer;->tokens:[Ljava/lang/String;

    array-length v5, v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 444
    .local v4, "list":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    iget-object v0, p0, Lorg/apache/commons/lang3/text/StrTokenizer;->tokens:[Ljava/lang/String;

    .local v0, "arr$":[Ljava/lang/String;
    array-length v3, v0

    .local v3, "len$":I
    const/4 v2, 0x0

    .local v2, "i$":I
    :goto_0
    if-ge v2, v3, :cond_0

    aget-object v1, v0, v2

    .line 445
    .local v1, "element":Ljava/lang/String;
    invoke-interface {v4, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 444
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 447
    .end local v1    # "element":Ljava/lang/String;
    :cond_0
    return-object v4
.end method

.method public getTrimmerMatcher()Lorg/apache/commons/lang3/text/StrMatcher;
    .locals 1

    .prologue
    .line 980
    iget-object v0, p0, Lorg/apache/commons/lang3/text/StrTokenizer;->trimmerMatcher:Lorg/apache/commons/lang3/text/StrMatcher;

    return-object v0
.end method

.method public hasNext()Z
    .locals 2

    .prologue
    .line 503
    invoke-direct {p0}, Lorg/apache/commons/lang3/text/StrTokenizer;->checkTokenized()V

    .line 504
    iget v0, p0, Lorg/apache/commons/lang3/text/StrTokenizer;->tokenPos:I

    iget-object v1, p0, Lorg/apache/commons/lang3/text/StrTokenizer;->tokens:[Ljava/lang/String;

    array-length v1, v1

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public hasPrevious()Z
    .locals 1

    .prologue
    .line 535
    invoke-direct {p0}, Lorg/apache/commons/lang3/text/StrTokenizer;->checkTokenized()V

    .line 536
    iget v0, p0, Lorg/apache/commons/lang3/text/StrTokenizer;->tokenPos:I

    if-lez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public isEmptyTokenAsNull()Z
    .locals 1

    .prologue
    .line 1007
    iget-boolean v0, p0, Lorg/apache/commons/lang3/text/StrTokenizer;->emptyAsNull:Z

    return v0
.end method

.method public isIgnoreEmptyTokens()Z
    .locals 1

    .prologue
    .line 1030
    iget-boolean v0, p0, Lorg/apache/commons/lang3/text/StrTokenizer;->ignoreEmptyTokens:Z

    return v0
.end method

.method public bridge synthetic next()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 87
    invoke-virtual {p0}, Lorg/apache/commons/lang3/text/StrTokenizer;->next()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public next()Ljava/lang/String;
    .locals 3

    .prologue
    .line 514
    invoke-virtual {p0}, Lorg/apache/commons/lang3/text/StrTokenizer;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 515
    iget-object v0, p0, Lorg/apache/commons/lang3/text/StrTokenizer;->tokens:[Ljava/lang/String;

    iget v1, p0, Lorg/apache/commons/lang3/text/StrTokenizer;->tokenPos:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lorg/apache/commons/lang3/text/StrTokenizer;->tokenPos:I

    aget-object v0, v0, v1

    return-object v0

    .line 517
    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public nextIndex()I
    .locals 1

    .prologue
    .line 526
    iget v0, p0, Lorg/apache/commons/lang3/text/StrTokenizer;->tokenPos:I

    return v0
.end method

.method public nextToken()Ljava/lang/String;
    .locals 3

    .prologue
    .line 408
    invoke-virtual {p0}, Lorg/apache/commons/lang3/text/StrTokenizer;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 409
    iget-object v0, p0, Lorg/apache/commons/lang3/text/StrTokenizer;->tokens:[Ljava/lang/String;

    iget v1, p0, Lorg/apache/commons/lang3/text/StrTokenizer;->tokenPos:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lorg/apache/commons/lang3/text/StrTokenizer;->tokenPos:I

    aget-object v0, v0, v1

    .line 411
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public bridge synthetic previous()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 87
    invoke-virtual {p0}, Lorg/apache/commons/lang3/text/StrTokenizer;->previous()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public previous()Ljava/lang/String;
    .locals 2

    .prologue
    .line 545
    invoke-virtual {p0}, Lorg/apache/commons/lang3/text/StrTokenizer;->hasPrevious()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 546
    iget-object v0, p0, Lorg/apache/commons/lang3/text/StrTokenizer;->tokens:[Ljava/lang/String;

    iget v1, p0, Lorg/apache/commons/lang3/text/StrTokenizer;->tokenPos:I

    add-int/lit8 v1, v1, -0x1

    iput v1, p0, Lorg/apache/commons/lang3/text/StrTokenizer;->tokenPos:I

    aget-object v0, v0, v1

    return-object v0

    .line 548
    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public previousIndex()I
    .locals 1

    .prologue
    .line 557
    iget v0, p0, Lorg/apache/commons/lang3/text/StrTokenizer;->tokenPos:I

    add-int/lit8 v0, v0, -0x1

    return v0
.end method

.method public previousToken()Ljava/lang/String;
    .locals 2

    .prologue
    .line 420
    invoke-virtual {p0}, Lorg/apache/commons/lang3/text/StrTokenizer;->hasPrevious()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 421
    iget-object v0, p0, Lorg/apache/commons/lang3/text/StrTokenizer;->tokens:[Ljava/lang/String;

    iget v1, p0, Lorg/apache/commons/lang3/text/StrTokenizer;->tokenPos:I

    add-int/lit8 v1, v1, -0x1

    iput v1, p0, Lorg/apache/commons/lang3/text/StrTokenizer;->tokenPos:I

    aget-object v0, v0, v1

    .line 423
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public remove()V
    .locals 2

    .prologue
    .line 566
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "remove() is unsupported"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public reset()Lorg/apache/commons/lang3/text/StrTokenizer;
    .locals 1

    .prologue
    .line 458
    const/4 v0, 0x0

    iput v0, p0, Lorg/apache/commons/lang3/text/StrTokenizer;->tokenPos:I

    .line 459
    const/4 v0, 0x0

    iput-object v0, p0, Lorg/apache/commons/lang3/text/StrTokenizer;->tokens:[Ljava/lang/String;

    .line 460
    return-object p0
.end method

.method public reset(Ljava/lang/String;)Lorg/apache/commons/lang3/text/StrTokenizer;
    .locals 1
    .param p1, "input"    # Ljava/lang/String;

    .prologue
    .line 472
    invoke-virtual {p0}, Lorg/apache/commons/lang3/text/StrTokenizer;->reset()Lorg/apache/commons/lang3/text/StrTokenizer;

    .line 473
    if-eqz p1, :cond_0

    .line 474
    invoke-virtual {p1}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    iput-object v0, p0, Lorg/apache/commons/lang3/text/StrTokenizer;->chars:[C

    .line 478
    :goto_0
    return-object p0

    .line 476
    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lorg/apache/commons/lang3/text/StrTokenizer;->chars:[C

    goto :goto_0
.end method

.method public reset([C)Lorg/apache/commons/lang3/text/StrTokenizer;
    .locals 1
    .param p1, "input"    # [C

    .prologue
    .line 490
    invoke-virtual {p0}, Lorg/apache/commons/lang3/text/StrTokenizer;->reset()Lorg/apache/commons/lang3/text/StrTokenizer;

    .line 491
    invoke-static {p1}, Lorg/apache/commons/lang3/ArrayUtils;->clone([C)[C

    move-result-object v0

    iput-object v0, p0, Lorg/apache/commons/lang3/text/StrTokenizer;->chars:[C

    .line 492
    return-object p0
.end method

.method public bridge synthetic set(Ljava/lang/Object;)V
    .locals 0
    .param p1, "x0"    # Ljava/lang/Object;

    .prologue
    .line 87
    check-cast p1, Ljava/lang/String;

    .end local p1    # "x0":Ljava/lang/Object;
    invoke-virtual {p0, p1}, Lorg/apache/commons/lang3/text/StrTokenizer;->set(Ljava/lang/String;)V

    return-void
.end method

.method public set(Ljava/lang/String;)V
    .locals 2
    .param p1, "obj"    # Ljava/lang/String;

    .prologue
    .line 575
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "set() is unsupported"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public setDelimiterChar(C)Lorg/apache/commons/lang3/text/StrTokenizer;
    .locals 1
    .param p1, "delim"    # C

    .prologue
    .line 867
    invoke-static {p1}, Lorg/apache/commons/lang3/text/StrMatcher;->charMatcher(C)Lorg/apache/commons/lang3/text/StrMatcher;

    move-result-object v0

    invoke-virtual {p0, v0}, Lorg/apache/commons/lang3/text/StrTokenizer;->setDelimiterMatcher(Lorg/apache/commons/lang3/text/StrMatcher;)Lorg/apache/commons/lang3/text/StrTokenizer;

    move-result-object v0

    return-object v0
.end method

.method public setDelimiterMatcher(Lorg/apache/commons/lang3/text/StrMatcher;)Lorg/apache/commons/lang3/text/StrTokenizer;
    .locals 1
    .param p1, "delim"    # Lorg/apache/commons/lang3/text/StrMatcher;

    .prologue
    .line 852
    if-nez p1, :cond_0

    .line 853
    invoke-static {}, Lorg/apache/commons/lang3/text/StrMatcher;->noneMatcher()Lorg/apache/commons/lang3/text/StrMatcher;

    move-result-object v0

    iput-object v0, p0, Lorg/apache/commons/lang3/text/StrTokenizer;->delimMatcher:Lorg/apache/commons/lang3/text/StrMatcher;

    .line 857
    :goto_0
    return-object p0

    .line 855
    :cond_0
    iput-object p1, p0, Lorg/apache/commons/lang3/text/StrTokenizer;->delimMatcher:Lorg/apache/commons/lang3/text/StrMatcher;

    goto :goto_0
.end method

.method public setDelimiterString(Ljava/lang/String;)Lorg/apache/commons/lang3/text/StrTokenizer;
    .locals 1
    .param p1, "delim"    # Ljava/lang/String;

    .prologue
    .line 877
    invoke-static {p1}, Lorg/apache/commons/lang3/text/StrMatcher;->stringMatcher(Ljava/lang/String;)Lorg/apache/commons/lang3/text/StrMatcher;

    move-result-object v0

    invoke-virtual {p0, v0}, Lorg/apache/commons/lang3/text/StrTokenizer;->setDelimiterMatcher(Lorg/apache/commons/lang3/text/StrMatcher;)Lorg/apache/commons/lang3/text/StrTokenizer;

    move-result-object v0

    return-object v0
.end method

.method public setEmptyTokenAsNull(Z)Lorg/apache/commons/lang3/text/StrTokenizer;
    .locals 0
    .param p1, "emptyAsNull"    # Z

    .prologue
    .line 1018
    iput-boolean p1, p0, Lorg/apache/commons/lang3/text/StrTokenizer;->emptyAsNull:Z

    .line 1019
    return-object p0
.end method

.method public setIgnoreEmptyTokens(Z)Lorg/apache/commons/lang3/text/StrTokenizer;
    .locals 0
    .param p1, "ignoreEmptyTokens"    # Z

    .prologue
    .line 1041
    iput-boolean p1, p0, Lorg/apache/commons/lang3/text/StrTokenizer;->ignoreEmptyTokens:Z

    .line 1042
    return-object p0
.end method

.method public setIgnoredChar(C)Lorg/apache/commons/lang3/text/StrTokenizer;
    .locals 1
    .param p1, "ignored"    # C

    .prologue
    .line 965
    invoke-static {p1}, Lorg/apache/commons/lang3/text/StrMatcher;->charMatcher(C)Lorg/apache/commons/lang3/text/StrMatcher;

    move-result-object v0

    invoke-virtual {p0, v0}, Lorg/apache/commons/lang3/text/StrTokenizer;->setIgnoredMatcher(Lorg/apache/commons/lang3/text/StrMatcher;)Lorg/apache/commons/lang3/text/StrTokenizer;

    move-result-object v0

    return-object v0
.end method

.method public setIgnoredMatcher(Lorg/apache/commons/lang3/text/StrMatcher;)Lorg/apache/commons/lang3/text/StrTokenizer;
    .locals 0
    .param p1, "ignored"    # Lorg/apache/commons/lang3/text/StrMatcher;

    .prologue
    .line 949
    if-eqz p1, :cond_0

    .line 950
    iput-object p1, p0, Lorg/apache/commons/lang3/text/StrTokenizer;->ignoredMatcher:Lorg/apache/commons/lang3/text/StrMatcher;

    .line 952
    :cond_0
    return-object p0
.end method

.method public setQuoteChar(C)Lorg/apache/commons/lang3/text/StrTokenizer;
    .locals 1
    .param p1, "quote"    # C

    .prologue
    .line 921
    invoke-static {p1}, Lorg/apache/commons/lang3/text/StrMatcher;->charMatcher(C)Lorg/apache/commons/lang3/text/StrMatcher;

    move-result-object v0

    invoke-virtual {p0, v0}, Lorg/apache/commons/lang3/text/StrTokenizer;->setQuoteMatcher(Lorg/apache/commons/lang3/text/StrMatcher;)Lorg/apache/commons/lang3/text/StrTokenizer;

    move-result-object v0

    return-object v0
.end method

.method public setQuoteMatcher(Lorg/apache/commons/lang3/text/StrMatcher;)Lorg/apache/commons/lang3/text/StrTokenizer;
    .locals 0
    .param p1, "quote"    # Lorg/apache/commons/lang3/text/StrMatcher;

    .prologue
    .line 905
    if-eqz p1, :cond_0

    .line 906
    iput-object p1, p0, Lorg/apache/commons/lang3/text/StrTokenizer;->quoteMatcher:Lorg/apache/commons/lang3/text/StrMatcher;

    .line 908
    :cond_0
    return-object p0
.end method

.method public setTrimmerMatcher(Lorg/apache/commons/lang3/text/StrMatcher;)Lorg/apache/commons/lang3/text/StrTokenizer;
    .locals 0
    .param p1, "trimmer"    # Lorg/apache/commons/lang3/text/StrMatcher;

    .prologue
    .line 993
    if-eqz p1, :cond_0

    .line 994
    iput-object p1, p0, Lorg/apache/commons/lang3/text/StrTokenizer;->trimmerMatcher:Lorg/apache/commons/lang3/text/StrMatcher;

    .line 996
    :cond_0
    return-object p0
.end method

.method public size()I
    .locals 1

    .prologue
    .line 396
    invoke-direct {p0}, Lorg/apache/commons/lang3/text/StrTokenizer;->checkTokenized()V

    .line 397
    iget-object v0, p0, Lorg/apache/commons/lang3/text/StrTokenizer;->tokens:[Ljava/lang/String;

    array-length v0, v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 1100
    iget-object v0, p0, Lorg/apache/commons/lang3/text/StrTokenizer;->tokens:[Ljava/lang/String;

    if-nez v0, :cond_0

    .line 1101
    const-string v0, "StrTokenizer[not tokenized yet]"

    .line 1103
    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "StrTokenizer"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lorg/apache/commons/lang3/text/StrTokenizer;->getTokenList()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method protected tokenize([CII)Ljava/util/List;
    .locals 6
    .param p1, "chars"    # [C
    .param p2, "offset"    # I
    .param p3, "count"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([CII)",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 626
    if-eqz p1, :cond_0

    if-nez p3, :cond_2

    .line 627
    :cond_0
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v5

    .line 643
    :cond_1
    return-object v5

    .line 629
    :cond_2
    new-instance v4, Lorg/apache/commons/lang3/text/StrBuilder;

    invoke-direct {v4}, Lorg/apache/commons/lang3/text/StrBuilder;-><init>()V

    .line 630
    .local v4, "buf":Lorg/apache/commons/lang3/text/StrBuilder;
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 631
    .local v5, "tokens":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    move v2, p2

    .line 634
    .local v2, "pos":I
    :cond_3
    :goto_0
    if-ltz v2, :cond_1

    if-ge v2, p3, :cond_1

    move-object v0, p0

    move-object v1, p1

    move v3, p3

    .line 636
    invoke-direct/range {v0 .. v5}, Lorg/apache/commons/lang3/text/StrTokenizer;->readNextToken([CIILorg/apache/commons/lang3/text/StrBuilder;Ljava/util/List;)I

    move-result v2

    .line 639
    if-lt v2, p3, :cond_3

    .line 640
    const-string v0, ""

    invoke-direct {p0, v5, v0}, Lorg/apache/commons/lang3/text/StrTokenizer;->addToken(Ljava/util/List;Ljava/lang/String;)V

    goto :goto_0
.end method
