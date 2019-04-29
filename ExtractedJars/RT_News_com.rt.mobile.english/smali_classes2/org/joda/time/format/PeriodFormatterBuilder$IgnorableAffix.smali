.class abstract Lorg/joda/time/format/PeriodFormatterBuilder$IgnorableAffix;
.super Ljava/lang/Object;
.source "PeriodFormatterBuilder.java"

# interfaces
.implements Lorg/joda/time/format/PeriodFormatterBuilder$PeriodFieldAffix;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/joda/time/format/PeriodFormatterBuilder;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x408
    name = "IgnorableAffix"
.end annotation


# instance fields
.field private volatile iOtherAffixes:[Ljava/lang/String;


# direct methods
.method constructor <init>()V
    .locals 0

    .line 969
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public finish(Ljava/util/Set;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Lorg/joda/time/format/PeriodFormatterBuilder$PeriodFieldAffix;",
            ">;)V"
        }
    .end annotation

    .line 973
    iget-object v0, p0, Lorg/joda/time/format/PeriodFormatterBuilder$IgnorableAffix;->iOtherAffixes:[Ljava/lang/String;

    if-nez v0, :cond_5

    const v0, 0x7fffffff

    .line 976
    invoke-virtual {p0}, Lorg/joda/time/format/PeriodFormatterBuilder$IgnorableAffix;->getAffixes()[Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    array-length v3, v1

    move v4, v0

    move v0, v2

    :goto_0
    if-ge v0, v3, :cond_1

    aget-object v5, v1, v0

    .line 977
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v6

    if-ge v6, v4, :cond_0

    .line 978
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v4

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 984
    :cond_1
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 985
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/joda/time/format/PeriodFormatterBuilder$PeriodFieldAffix;

    if-eqz v1, :cond_2

    .line 987
    invoke-interface {v1}, Lorg/joda/time/format/PeriodFormatterBuilder$PeriodFieldAffix;->getAffixes()[Ljava/lang/String;

    move-result-object v1

    array-length v3, v1

    move v5, v2

    :goto_1
    if-ge v5, v3, :cond_2

    aget-object v6, v1, v5

    .line 988
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v7

    if-le v7, v4, :cond_3

    .line 989
    invoke-interface {v0, v6}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_3
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    .line 994
    :cond_4
    invoke-interface {v0}, Ljava/util/Set;->size()I

    move-result p1

    new-array p1, p1, [Ljava/lang/String;

    invoke-interface {v0, p1}, Ljava/util/Set;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljava/lang/String;

    iput-object p1, p0, Lorg/joda/time/format/PeriodFormatterBuilder$IgnorableAffix;->iOtherAffixes:[Ljava/lang/String;

    :cond_5
    return-void
.end method

.method protected matchesOtherAffix(ILjava/lang/String;I)Z
    .locals 10

    .line 1009
    iget-object v0, p0, Lorg/joda/time/format/PeriodFormatterBuilder$IgnorableAffix;->iOtherAffixes:[Ljava/lang/String;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    .line 1010
    iget-object v0, p0, Lorg/joda/time/format/PeriodFormatterBuilder$IgnorableAffix;->iOtherAffixes:[Ljava/lang/String;

    array-length v2, v0

    move v3, v1

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v7, v0, v3

    .line 1011
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v9

    if-ge p1, v9, :cond_0

    const/4 v5, 0x1

    const/4 v8, 0x0

    move-object v4, p2

    move v6, p3

    .line 1012
    invoke-virtual/range {v4 .. v9}, Ljava/lang/String;->regionMatches(ZILjava/lang/String;II)Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    return v1
.end method
