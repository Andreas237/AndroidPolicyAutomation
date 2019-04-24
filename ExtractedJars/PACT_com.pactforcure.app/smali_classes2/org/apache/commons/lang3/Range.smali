.class public final Lorg/apache/commons/lang3/Range;
.super Ljava/lang/Object;
.source "Range.java"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/apache/commons/lang3/Range$ComparableComparator;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/io/Serializable;"
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = 0x1L


# instance fields
.field private final comparator:Ljava/util/Comparator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Comparator",
            "<TT;>;"
        }
    .end annotation
.end field

.field private transient hashCode:I

.field private final maximum:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field

.field private final minimum:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field

.field private transient toString:Ljava/lang/String;


# direct methods
.method private constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;TT;",
            "Ljava/util/Comparator",
            "<TT;>;)V"
        }
    .end annotation

    .prologue
    .line 146
    .local p0, "this":Lorg/apache/commons/lang3/Range;, "Lorg/apache/commons/lang3/Range<TT;>;"
    .local p1, "element1":Ljava/lang/Object;, "TT;"
    .local p2, "element2":Ljava/lang/Object;, "TT;"
    .local p3, "comparator":Ljava/util/Comparator;, "Ljava/util/Comparator<TT;>;"
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 147
    if-eqz p1, :cond_0

    if-nez p2, :cond_1

    .line 148
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Elements in a range must not be null: element1="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", element2="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 151
    :cond_1
    if-nez p3, :cond_2

    .line 152
    sget-object p3, Lorg/apache/commons/lang3/Range$ComparableComparator;->INSTANCE:Lorg/apache/commons/lang3/Range$ComparableComparator;

    .line 154
    :cond_2
    invoke-interface {p3, p1, p2}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v0

    const/4 v1, 0x1

    if-ge v0, v1, :cond_3

    .line 155
    iput-object p1, p0, Lorg/apache/commons/lang3/Range;->minimum:Ljava/lang/Object;

    .line 156
    iput-object p2, p0, Lorg/apache/commons/lang3/Range;->maximum:Ljava/lang/Object;

    .line 161
    :goto_0
    iput-object p3, p0, Lorg/apache/commons/lang3/Range;->comparator:Ljava/util/Comparator;

    .line 162
    return-void

    .line 158
    :cond_3
    iput-object p2, p0, Lorg/apache/commons/lang3/Range;->minimum:Ljava/lang/Object;

    .line 159
    iput-object p1, p0, Lorg/apache/commons/lang3/Range;->maximum:Ljava/lang/Object;

    goto :goto_0
.end method

.method public static between(Ljava/lang/Comparable;Ljava/lang/Comparable;)Lorg/apache/commons/lang3/Range;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Ljava/lang/Comparable",
            "<TT;>;>(TT;TT;)",
            "Lorg/apache/commons/lang3/Range",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 114
    .local p0, "fromInclusive":Ljava/lang/Comparable;, "TT;"
    .local p1, "toInclusive":Ljava/lang/Comparable;, "TT;"
    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Lorg/apache/commons/lang3/Range;->between(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lorg/apache/commons/lang3/Range;

    move-result-object v0

    return-object v0
.end method

.method public static between(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lorg/apache/commons/lang3/Range;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;TT;",
            "Ljava/util/Comparator",
            "<TT;>;)",
            "Lorg/apache/commons/lang3/Range",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 135
    .local p0, "fromInclusive":Ljava/lang/Object;, "TT;"
    .local p1, "toInclusive":Ljava/lang/Object;, "TT;"
    .local p2, "comparator":Ljava/util/Comparator;, "Ljava/util/Comparator<TT;>;"
    new-instance v0, Lorg/apache/commons/lang3/Range;

    invoke-direct {v0, p0, p1, p2}, Lorg/apache/commons/lang3/Range;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)V

    return-object v0
.end method

.method public static is(Ljava/lang/Comparable;)Lorg/apache/commons/lang3/Range;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Ljava/lang/Comparable",
            "<TT;>;>(TT;)",
            "Lorg/apache/commons/lang3/Range",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 76
    .local p0, "element":Ljava/lang/Comparable;, "TT;"
    const/4 v0, 0x0

    invoke-static {p0, p0, v0}, Lorg/apache/commons/lang3/Range;->between(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lorg/apache/commons/lang3/Range;

    move-result-object v0

    return-object v0
.end method

.method public static is(Ljava/lang/Object;Ljava/util/Comparator;)Lorg/apache/commons/lang3/Range;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;",
            "Ljava/util/Comparator",
            "<TT;>;)",
            "Lorg/apache/commons/lang3/Range",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 94
    .local p0, "element":Ljava/lang/Object;, "TT;"
    .local p1, "comparator":Ljava/util/Comparator;, "Ljava/util/Comparator<TT;>;"
    invoke-static {p0, p0, p1}, Lorg/apache/commons/lang3/Range;->between(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lorg/apache/commons/lang3/Range;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public contains(Ljava/lang/Object;)Z
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)Z"
        }
    .end annotation

    .prologue
    .local p0, "this":Lorg/apache/commons/lang3/Range;, "Lorg/apache/commons/lang3/Range<TT;>;"
    .local p1, "element":Ljava/lang/Object;, "TT;"
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 219
    if-nez p1, :cond_0

    .line 222
    :goto_0
    return v1

    :cond_0
    iget-object v2, p0, Lorg/apache/commons/lang3/Range;->comparator:Ljava/util/Comparator;

    iget-object v3, p0, Lorg/apache/commons/lang3/Range;->minimum:Ljava/lang/Object;

    invoke-interface {v2, p1, v3}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v2

    const/4 v3, -0x1

    if-le v2, v3, :cond_1

    iget-object v2, p0, Lorg/apache/commons/lang3/Range;->comparator:Ljava/util/Comparator;

    iget-object v3, p0, Lorg/apache/commons/lang3/Range;->maximum:Ljava/lang/Object;

    invoke-interface {v2, p1, v3}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v2

    if-ge v2, v0, :cond_1

    :goto_1
    move v1, v0

    goto :goto_0

    :cond_1
    move v0, v1

    goto :goto_1
.end method

.method public containsRange(Lorg/apache/commons/lang3/Range;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/apache/commons/lang3/Range",
            "<TT;>;)Z"
        }
    .end annotation

    .prologue
    .local p0, "this":Lorg/apache/commons/lang3/Range;, "Lorg/apache/commons/lang3/Range<TT;>;"
    .local p1, "otherRange":Lorg/apache/commons/lang3/Range;, "Lorg/apache/commons/lang3/Range<TT;>;"
    const/4 v0, 0x0

    .line 314
    if-nez p1, :cond_1

    .line 317
    :cond_0
    :goto_0
    return v0

    :cond_1
    iget-object v1, p1, Lorg/apache/commons/lang3/Range;->minimum:Ljava/lang/Object;

    invoke-virtual {p0, v1}, Lorg/apache/commons/lang3/Range;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p1, Lorg/apache/commons/lang3/Range;->maximum:Ljava/lang/Object;

    invoke-virtual {p0, v1}, Lorg/apache/commons/lang3/Range;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0
.end method

.method public elementCompareTo(Ljava/lang/Object;)I
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)I"
        }
    .end annotation

    .prologue
    .line 288
    .local p0, "this":Lorg/apache/commons/lang3/Range;, "Lorg/apache/commons/lang3/Range<TT;>;"
    .local p1, "element":Ljava/lang/Object;, "TT;"
    if-nez p1, :cond_0

    .line 290
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Element is null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 292
    :cond_0
    invoke-virtual {p0, p1}, Lorg/apache/commons/lang3/Range;->isAfter(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 293
    const/4 v0, -0x1

    .line 297
    :goto_0
    return v0

    .line 294
    :cond_1
    invoke-virtual {p0, p1}, Lorg/apache/commons/lang3/Range;->isBefore(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 295
    const/4 v0, 0x1

    goto :goto_0

    .line 297
    :cond_2
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 5
    .param p1, "obj"    # Ljava/lang/Object;

    .prologue
    .local p0, "this":Lorg/apache/commons/lang3/Range;, "Lorg/apache/commons/lang3/Range<TT;>;"
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 388
    if-ne p1, p0, :cond_1

    .line 395
    :cond_0
    :goto_0
    return v1

    .line 390
    :cond_1
    if-eqz p1, :cond_2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    if-eq v3, v4, :cond_3

    :cond_2
    move v1, v2

    .line 391
    goto :goto_0

    :cond_3
    move-object v0, p1

    .line 394
    check-cast v0, Lorg/apache/commons/lang3/Range;

    .line 395
    .local v0, "range":Lorg/apache/commons/lang3/Range;, "Lorg/apache/commons/lang3/Range<TT;>;"
    iget-object v3, p0, Lorg/apache/commons/lang3/Range;->minimum:Ljava/lang/Object;

    iget-object v4, v0, Lorg/apache/commons/lang3/Range;->minimum:Ljava/lang/Object;

    invoke-virtual {v3, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    iget-object v3, p0, Lorg/apache/commons/lang3/Range;->maximum:Ljava/lang/Object;

    iget-object v4, v0, Lorg/apache/commons/lang3/Range;->maximum:Ljava/lang/Object;

    invoke-virtual {v3, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    :cond_4
    move v1, v2

    goto :goto_0
.end method

.method public getComparator()Ljava/util/Comparator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Comparator",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 194
    .local p0, "this":Lorg/apache/commons/lang3/Range;, "Lorg/apache/commons/lang3/Range<TT;>;"
    iget-object v0, p0, Lorg/apache/commons/lang3/Range;->comparator:Ljava/util/Comparator;

    return-object v0
.end method

.method public getMaximum()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .prologue
    .line 182
    .local p0, "this":Lorg/apache/commons/lang3/Range;, "Lorg/apache/commons/lang3/Range<TT;>;"
    iget-object v0, p0, Lorg/apache/commons/lang3/Range;->maximum:Ljava/lang/Object;

    return-object v0
.end method

.method public getMinimum()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .prologue
    .line 173
    .local p0, "this":Lorg/apache/commons/lang3/Range;, "Lorg/apache/commons/lang3/Range<TT;>;"
    iget-object v0, p0, Lorg/apache/commons/lang3/Range;->minimum:Ljava/lang/Object;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    .prologue
    .line 407
    .local p0, "this":Lorg/apache/commons/lang3/Range;, "Lorg/apache/commons/lang3/Range<TT;>;"
    iget v0, p0, Lorg/apache/commons/lang3/Range;->hashCode:I

    .line 408
    .local v0, "result":I
    iget v1, p0, Lorg/apache/commons/lang3/Range;->hashCode:I

    if-nez v1, :cond_0

    .line 409
    const/16 v0, 0x11

    .line 410
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/lit16 v0, v1, 0x275

    .line 411
    mul-int/lit8 v1, v0, 0x25

    iget-object v2, p0, Lorg/apache/commons/lang3/Range;->minimum:Ljava/lang/Object;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int v0, v1, v2

    .line 412
    mul-int/lit8 v1, v0, 0x25

    iget-object v2, p0, Lorg/apache/commons/lang3/Range;->maximum:Ljava/lang/Object;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int v0, v1, v2

    .line 413
    iput v0, p0, Lorg/apache/commons/lang3/Range;->hashCode:I

    .line 415
    :cond_0
    return v0
.end method

.method public isAfter(Ljava/lang/Object;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)Z"
        }
    .end annotation

    .prologue
    .local p0, "this":Lorg/apache/commons/lang3/Range;, "Lorg/apache/commons/lang3/Range<TT;>;"
    .local p1, "element":Ljava/lang/Object;, "TT;"
    const/4 v0, 0x0

    .line 232
    if-nez p1, :cond_1

    .line 235
    :cond_0
    :goto_0
    return v0

    :cond_1
    iget-object v1, p0, Lorg/apache/commons/lang3/Range;->comparator:Ljava/util/Comparator;

    iget-object v2, p0, Lorg/apache/commons/lang3/Range;->minimum:Ljava/lang/Object;

    invoke-interface {v1, p1, v2}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v1

    if-gez v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0
.end method

.method public isAfterRange(Lorg/apache/commons/lang3/Range;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/apache/commons/lang3/Range",
            "<TT;>;)Z"
        }
    .end annotation

    .prologue
    .line 331
    .local p0, "this":Lorg/apache/commons/lang3/Range;, "Lorg/apache/commons/lang3/Range<TT;>;"
    .local p1, "otherRange":Lorg/apache/commons/lang3/Range;, "Lorg/apache/commons/lang3/Range<TT;>;"
    if-nez p1, :cond_0

    .line 332
    const/4 v0, 0x0

    .line 334
    :goto_0
    return v0

    :cond_0
    iget-object v0, p1, Lorg/apache/commons/lang3/Range;->maximum:Ljava/lang/Object;

    invoke-virtual {p0, v0}, Lorg/apache/commons/lang3/Range;->isAfter(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0
.end method

.method public isBefore(Ljava/lang/Object;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)Z"
        }
    .end annotation

    .prologue
    .local p0, "this":Lorg/apache/commons/lang3/Range;, "Lorg/apache/commons/lang3/Range<TT;>;"
    .local p1, "element":Ljava/lang/Object;, "TT;"
    const/4 v0, 0x0

    .line 271
    if-nez p1, :cond_1

    .line 274
    :cond_0
    :goto_0
    return v0

    :cond_1
    iget-object v1, p0, Lorg/apache/commons/lang3/Range;->comparator:Ljava/util/Comparator;

    iget-object v2, p0, Lorg/apache/commons/lang3/Range;->maximum:Ljava/lang/Object;

    invoke-interface {v1, p1, v2}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v1

    if-lez v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0
.end method

.method public isBeforeRange(Lorg/apache/commons/lang3/Range;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/apache/commons/lang3/Range",
            "<TT;>;)Z"
        }
    .end annotation

    .prologue
    .line 368
    .local p0, "this":Lorg/apache/commons/lang3/Range;, "Lorg/apache/commons/lang3/Range<TT;>;"
    .local p1, "otherRange":Lorg/apache/commons/lang3/Range;, "Lorg/apache/commons/lang3/Range<TT;>;"
    if-nez p1, :cond_0

    .line 369
    const/4 v0, 0x0

    .line 371
    :goto_0
    return v0

    :cond_0
    iget-object v0, p1, Lorg/apache/commons/lang3/Range;->minimum:Ljava/lang/Object;

    invoke-virtual {p0, v0}, Lorg/apache/commons/lang3/Range;->isBefore(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0
.end method

.method public isEndedBy(Ljava/lang/Object;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)Z"
        }
    .end annotation

    .prologue
    .local p0, "this":Lorg/apache/commons/lang3/Range;, "Lorg/apache/commons/lang3/Range<TT;>;"
    .local p1, "element":Ljava/lang/Object;, "TT;"
    const/4 v0, 0x0

    .line 258
    if-nez p1, :cond_1

    .line 261
    :cond_0
    :goto_0
    return v0

    :cond_1
    iget-object v1, p0, Lorg/apache/commons/lang3/Range;->comparator:Ljava/util/Comparator;

    iget-object v2, p0, Lorg/apache/commons/lang3/Range;->maximum:Ljava/lang/Object;

    invoke-interface {v1, p1, v2}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v1

    if-nez v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0
.end method

.method public isNaturalOrdering()Z
    .locals 2

    .prologue
    .line 206
    .local p0, "this":Lorg/apache/commons/lang3/Range;, "Lorg/apache/commons/lang3/Range<TT;>;"
    iget-object v0, p0, Lorg/apache/commons/lang3/Range;->comparator:Ljava/util/Comparator;

    sget-object v1, Lorg/apache/commons/lang3/Range$ComparableComparator;->INSTANCE:Lorg/apache/commons/lang3/Range$ComparableComparator;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public isOverlappedBy(Lorg/apache/commons/lang3/Range;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/apache/commons/lang3/Range",
            "<TT;>;)Z"
        }
    .end annotation

    .prologue
    .local p0, "this":Lorg/apache/commons/lang3/Range;, "Lorg/apache/commons/lang3/Range<TT;>;"
    .local p1, "otherRange":Lorg/apache/commons/lang3/Range;, "Lorg/apache/commons/lang3/Range<TT;>;"
    const/4 v0, 0x0

    .line 350
    if-nez p1, :cond_1

    .line 353
    :cond_0
    :goto_0
    return v0

    :cond_1
    iget-object v1, p0, Lorg/apache/commons/lang3/Range;->minimum:Ljava/lang/Object;

    invoke-virtual {p1, v1}, Lorg/apache/commons/lang3/Range;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    iget-object v1, p0, Lorg/apache/commons/lang3/Range;->maximum:Ljava/lang/Object;

    invoke-virtual {p1, v1}, Lorg/apache/commons/lang3/Range;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    iget-object v1, p1, Lorg/apache/commons/lang3/Range;->minimum:Ljava/lang/Object;

    invoke-virtual {p0, v1}, Lorg/apache/commons/lang3/Range;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    :cond_2
    const/4 v0, 0x1

    goto :goto_0
.end method

.method public isStartedBy(Ljava/lang/Object;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)Z"
        }
    .end annotation

    .prologue
    .local p0, "this":Lorg/apache/commons/lang3/Range;, "Lorg/apache/commons/lang3/Range<TT;>;"
    .local p1, "element":Ljava/lang/Object;, "TT;"
    const/4 v0, 0x0

    .line 245
    if-nez p1, :cond_1

    .line 248
    :cond_0
    :goto_0
    return v0

    :cond_1
    iget-object v1, p0, Lorg/apache/commons/lang3/Range;->comparator:Ljava/util/Comparator;

    iget-object v2, p0, Lorg/apache/commons/lang3/Range;->minimum:Ljava/lang/Object;

    invoke-interface {v1, p1, v2}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v1

    if-nez v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .prologue
    .line 427
    .local p0, "this":Lorg/apache/commons/lang3/Range;, "Lorg/apache/commons/lang3/Range<TT;>;"
    iget-object v1, p0, Lorg/apache/commons/lang3/Range;->toString:Ljava/lang/String;

    .line 428
    .local v1, "result":Ljava/lang/String;
    if-nez v1, :cond_0

    .line 429
    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v2, 0x20

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 430
    .local v0, "buf":Ljava/lang/StringBuilder;
    const/16 v2, 0x5b

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 431
    iget-object v2, p0, Lorg/apache/commons/lang3/Range;->minimum:Ljava/lang/Object;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 432
    const-string v2, ".."

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 433
    iget-object v2, p0, Lorg/apache/commons/lang3/Range;->maximum:Ljava/lang/Object;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 434
    const/16 v2, 0x5d

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 435
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 436
    iput-object v1, p0, Lorg/apache/commons/lang3/Range;->toString:Ljava/lang/String;

    .line 438
    .end local v0    # "buf":Ljava/lang/StringBuilder;
    :cond_0
    return-object v1
.end method

.method public toString(Ljava/lang/String;)Ljava/lang/String;
    .locals 3
    .param p1, "format"    # Ljava/lang/String;

    .prologue
    .line 454
    .local p0, "this":Lorg/apache/commons/lang3/Range;, "Lorg/apache/commons/lang3/Range<TT;>;"
    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget-object v2, p0, Lorg/apache/commons/lang3/Range;->minimum:Ljava/lang/Object;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    iget-object v2, p0, Lorg/apache/commons/lang3/Range;->maximum:Ljava/lang/Object;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    iget-object v2, p0, Lorg/apache/commons/lang3/Range;->comparator:Ljava/util/Comparator;

    aput-object v2, v0, v1

    invoke-static {p1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
