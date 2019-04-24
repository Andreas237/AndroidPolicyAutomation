.class public final Lcom/google/common/base/Splitter;
.super Ljava/lang/Object;
.source "Splitter.java"


# annotations
.annotation build Lcom/google/common/annotations/GwtCompatible;
    emulated = true
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/common/base/Splitter$SplittingIterator;,
        Lcom/google/common/base/Splitter$Strategy;,
        Lcom/google/common/base/Splitter$MapSplitter;
    }
.end annotation


# instance fields
.field private final limit:I

.field private final omitEmptyStrings:Z

.field private final strategy:Lcom/google/common/base/Splitter$Strategy;

.field private final trimmer:Lcom/google/common/base/CharMatcher;


# direct methods
.method private constructor <init>(Lcom/google/common/base/Splitter$Strategy;)V
    .locals 3

    .line 100
    invoke-static {}, Lcom/google/common/base/CharMatcher;->none()Lcom/google/common/base/CharMatcher;

    move-result-object v0

    const/4 v1, 0x0

    const v2, 0x7fffffff

    invoke-direct {p0, p1, v1, v0, v2}, Lcom/google/common/base/Splitter;-><init>(Lcom/google/common/base/Splitter$Strategy;ZLcom/google/common/base/CharMatcher;I)V

    return-void
.end method

.method private constructor <init>(Lcom/google/common/base/Splitter$Strategy;ZLcom/google/common/base/CharMatcher;I)V
    .locals 0

    .line 103
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 104
    iput-object p1, p0, Lcom/google/common/base/Splitter;->strategy:Lcom/google/common/base/Splitter$Strategy;

    .line 105
    iput-boolean p2, p0, Lcom/google/common/base/Splitter;->omitEmptyStrings:Z

    .line 106
    iput-object p3, p0, Lcom/google/common/base/Splitter;->trimmer:Lcom/google/common/base/CharMatcher;

    .line 107
    iput p4, p0, Lcom/google/common/base/Splitter;->limit:I

    return-void
.end method

.method static synthetic access$000(Lcom/google/common/base/Splitter;Ljava/lang/CharSequence;)Ljava/util/Iterator;
    .locals 0

    .line 93
    invoke-direct {p0, p1}, Lcom/google/common/base/Splitter;->splittingIterator(Ljava/lang/CharSequence;)Ljava/util/Iterator;

    move-result-object p0

    return-object p0
.end method

.method static synthetic access$200(Lcom/google/common/base/Splitter;)Lcom/google/common/base/CharMatcher;
    .locals 0

    .line 93
    iget-object p0, p0, Lcom/google/common/base/Splitter;->trimmer:Lcom/google/common/base/CharMatcher;

    return-object p0
.end method

.method static synthetic access$300(Lcom/google/common/base/Splitter;)Z
    .locals 0

    .line 93
    iget-boolean p0, p0, Lcom/google/common/base/Splitter;->omitEmptyStrings:Z

    return p0
.end method

.method static synthetic access$400(Lcom/google/common/base/Splitter;)I
    .locals 0

    .line 93
    iget p0, p0, Lcom/google/common/base/Splitter;->limit:I

    return p0
.end method

.method public static fixedLength(I)Lcom/google/common/base/Splitter;
    .locals 2

    if-lez p0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "The length may not be less than 1"

    .line 273
    invoke-static {v0, v1}, Lcom/google/common/base/Preconditions;->checkArgument(ZLjava/lang/Object;)V

    .line 275
    new-instance v0, Lcom/google/common/base/Splitter;

    new-instance v1, Lcom/google/common/base/Splitter$4;

    invoke-direct {v1, p0}, Lcom/google/common/base/Splitter$4;-><init>(I)V

    invoke-direct {v0, v1}, Lcom/google/common/base/Splitter;-><init>(Lcom/google/common/base/Splitter$Strategy;)V

    return-object v0
.end method

.method public static on(C)Lcom/google/common/base/Splitter;
    .locals 0

    .line 119
    invoke-static {p0}, Lcom/google/common/base/CharMatcher;->is(C)Lcom/google/common/base/CharMatcher;

    move-result-object p0

    invoke-static {p0}, Lcom/google/common/base/Splitter;->on(Lcom/google/common/base/CharMatcher;)Lcom/google/common/base/Splitter;

    move-result-object p0

    return-object p0
.end method

.method public static on(Lcom/google/common/base/CharMatcher;)Lcom/google/common/base/Splitter;
    .locals 2

    .line 133
    invoke-static {p0}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 135
    new-instance v0, Lcom/google/common/base/Splitter;

    new-instance v1, Lcom/google/common/base/Splitter$1;

    invoke-direct {v1, p0}, Lcom/google/common/base/Splitter$1;-><init>(Lcom/google/common/base/CharMatcher;)V

    invoke-direct {v0, v1}, Lcom/google/common/base/Splitter;-><init>(Lcom/google/common/base/Splitter$Strategy;)V

    return-object v0
.end method

.method private static on(Lcom/google/common/base/CommonPattern;)Lcom/google/common/base/Splitter;
    .locals 2

    const-string v0, ""

    .line 214
    invoke-virtual {p0, v0}, Lcom/google/common/base/CommonPattern;->matcher(Ljava/lang/CharSequence;)Lcom/google/common/base/CommonMatcher;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/base/CommonMatcher;->matches()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    const-string v1, "The pattern may not match the empty string: %s"

    .line 213
    invoke-static {v0, v1, p0}, Lcom/google/common/base/Preconditions;->checkArgument(ZLjava/lang/String;Ljava/lang/Object;)V

    .line 218
    new-instance v0, Lcom/google/common/base/Splitter;

    new-instance v1, Lcom/google/common/base/Splitter$3;

    invoke-direct {v1, p0}, Lcom/google/common/base/Splitter$3;-><init>(Lcom/google/common/base/CommonPattern;)V

    invoke-direct {v0, v1}, Lcom/google/common/base/Splitter;-><init>(Lcom/google/common/base/Splitter$Strategy;)V

    return-object v0
.end method

.method public static on(Ljava/lang/String;)Lcom/google/common/base/Splitter;
    .locals 4

    .line 163
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v3, "The separator may not be the empty string."

    invoke-static {v0, v3}, Lcom/google/common/base/Preconditions;->checkArgument(ZLjava/lang/Object;)V

    .line 164
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    if-ne v0, v1, :cond_1

    .line 165
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    move-result p0

    invoke-static {p0}, Lcom/google/common/base/Splitter;->on(C)Lcom/google/common/base/Splitter;

    move-result-object p0

    return-object p0

    .line 167
    :cond_1
    new-instance v0, Lcom/google/common/base/Splitter;

    new-instance v1, Lcom/google/common/base/Splitter$2;

    invoke-direct {v1, p0}, Lcom/google/common/base/Splitter$2;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v1}, Lcom/google/common/base/Splitter;-><init>(Lcom/google/common/base/Splitter$Strategy;)V

    return-object v0
.end method

.method public static on(Ljava/util/regex/Pattern;)Lcom/google/common/base/Splitter;
    .locals 1
    .annotation build Lcom/google/common/annotations/GwtIncompatible;
    .end annotation

    .line 209
    new-instance v0, Lcom/google/common/base/JdkPattern;

    invoke-direct {v0, p0}, Lcom/google/common/base/JdkPattern;-><init>(Ljava/util/regex/Pattern;)V

    invoke-static {v0}, Lcom/google/common/base/Splitter;->on(Lcom/google/common/base/CommonPattern;)Lcom/google/common/base/Splitter;

    move-result-object p0

    return-object p0
.end method

.method public static onPattern(Ljava/lang/String;)Lcom/google/common/base/Splitter;
    .locals 0
    .annotation build Lcom/google/common/annotations/GwtIncompatible;
    .end annotation

    .line 252
    invoke-static {p0}, Lcom/google/common/base/Platform;->compilePattern(Ljava/lang/String;)Lcom/google/common/base/CommonPattern;

    move-result-object p0

    invoke-static {p0}, Lcom/google/common/base/Splitter;->on(Lcom/google/common/base/CommonPattern;)Lcom/google/common/base/Splitter;

    move-result-object p0

    return-object p0
.end method

.method private splittingIterator(Ljava/lang/CharSequence;)Ljava/util/Iterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/CharSequence;",
            ")",
            "Ljava/util/Iterator<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 395
    iget-object v0, p0, Lcom/google/common/base/Splitter;->strategy:Lcom/google/common/base/Splitter$Strategy;

    invoke-interface {v0, p0, p1}, Lcom/google/common/base/Splitter$Strategy;->iterator(Lcom/google/common/base/Splitter;Ljava/lang/CharSequence;)Ljava/util/Iterator;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public limit(I)Lcom/google/common/base/Splitter;
    .locals 4

    if-lez p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "must be greater than zero: %s"

    .line 333
    invoke-static {v0, v1, p1}, Lcom/google/common/base/Preconditions;->checkArgument(ZLjava/lang/String;I)V

    .line 334
    new-instance v0, Lcom/google/common/base/Splitter;

    iget-object v1, p0, Lcom/google/common/base/Splitter;->strategy:Lcom/google/common/base/Splitter$Strategy;

    iget-boolean v2, p0, Lcom/google/common/base/Splitter;->omitEmptyStrings:Z

    iget-object v3, p0, Lcom/google/common/base/Splitter;->trimmer:Lcom/google/common/base/CharMatcher;

    invoke-direct {v0, v1, v2, v3, p1}, Lcom/google/common/base/Splitter;-><init>(Lcom/google/common/base/Splitter$Strategy;ZLcom/google/common/base/CharMatcher;I)V

    return-object v0
.end method

.method public omitEmptyStrings()Lcom/google/common/base/Splitter;
    .locals 5

    .line 312
    new-instance v0, Lcom/google/common/base/Splitter;

    iget-object v1, p0, Lcom/google/common/base/Splitter;->strategy:Lcom/google/common/base/Splitter$Strategy;

    iget-object v2, p0, Lcom/google/common/base/Splitter;->trimmer:Lcom/google/common/base/CharMatcher;

    iget v3, p0, Lcom/google/common/base/Splitter;->limit:I

    const/4 v4, 0x1

    invoke-direct {v0, v1, v4, v2, v3}, Lcom/google/common/base/Splitter;-><init>(Lcom/google/common/base/Splitter$Strategy;ZLcom/google/common/base/CharMatcher;I)V

    return-object v0
.end method

.method public split(Ljava/lang/CharSequence;)Ljava/lang/Iterable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/CharSequence;",
            ")",
            "Ljava/lang/Iterable<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 376
    invoke-static {p1}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 378
    new-instance v0, Lcom/google/common/base/Splitter$5;

    invoke-direct {v0, p0, p1}, Lcom/google/common/base/Splitter$5;-><init>(Lcom/google/common/base/Splitter;Ljava/lang/CharSequence;)V

    return-object v0
.end method

.method public splitToList(Ljava/lang/CharSequence;)Ljava/util/List;
    .locals 2
    .annotation build Lcom/google/common/annotations/Beta;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/CharSequence;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 408
    invoke-static {p1}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 410
    invoke-direct {p0, p1}, Lcom/google/common/base/Splitter;->splittingIterator(Ljava/lang/CharSequence;)Ljava/util/Iterator;

    move-result-object p1

    .line 411
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 413
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 414
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 417
    :cond_0
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public trimResults()Lcom/google/common/base/Splitter;
    .locals 1

    .line 347
    invoke-static {}, Lcom/google/common/base/CharMatcher;->whitespace()Lcom/google/common/base/CharMatcher;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/common/base/Splitter;->trimResults(Lcom/google/common/base/CharMatcher;)Lcom/google/common/base/Splitter;

    move-result-object v0

    return-object v0
.end method

.method public trimResults(Lcom/google/common/base/CharMatcher;)Lcom/google/common/base/Splitter;
    .locals 4

    .line 363
    invoke-static {p1}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 364
    new-instance v0, Lcom/google/common/base/Splitter;

    iget-object v1, p0, Lcom/google/common/base/Splitter;->strategy:Lcom/google/common/base/Splitter$Strategy;

    iget-boolean v2, p0, Lcom/google/common/base/Splitter;->omitEmptyStrings:Z

    iget v3, p0, Lcom/google/common/base/Splitter;->limit:I

    invoke-direct {v0, v1, v2, p1, v3}, Lcom/google/common/base/Splitter;-><init>(Lcom/google/common/base/Splitter$Strategy;ZLcom/google/common/base/CharMatcher;I)V

    return-object v0
.end method

.method public withKeyValueSeparator(C)Lcom/google/common/base/Splitter$MapSplitter;
    .locals 0
    .annotation build Lcom/google/common/annotations/Beta;
    .end annotation

    .line 439
    invoke-static {p1}, Lcom/google/common/base/Splitter;->on(C)Lcom/google/common/base/Splitter;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/google/common/base/Splitter;->withKeyValueSeparator(Lcom/google/common/base/Splitter;)Lcom/google/common/base/Splitter$MapSplitter;

    move-result-object p1

    return-object p1
.end method

.method public withKeyValueSeparator(Lcom/google/common/base/Splitter;)Lcom/google/common/base/Splitter$MapSplitter;
    .locals 2
    .annotation build Lcom/google/common/annotations/Beta;
    .end annotation

    .line 450
    new-instance v0, Lcom/google/common/base/Splitter$MapSplitter;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Lcom/google/common/base/Splitter$MapSplitter;-><init>(Lcom/google/common/base/Splitter;Lcom/google/common/base/Splitter;Lcom/google/common/base/Splitter$1;)V

    return-object v0
.end method

.method public withKeyValueSeparator(Ljava/lang/String;)Lcom/google/common/base/Splitter$MapSplitter;
    .locals 0
    .annotation build Lcom/google/common/annotations/Beta;
    .end annotation

    .line 428
    invoke-static {p1}, Lcom/google/common/base/Splitter;->on(Ljava/lang/String;)Lcom/google/common/base/Splitter;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/google/common/base/Splitter;->withKeyValueSeparator(Lcom/google/common/base/Splitter;)Lcom/google/common/base/Splitter$MapSplitter;

    move-result-object p1

    return-object p1
.end method
