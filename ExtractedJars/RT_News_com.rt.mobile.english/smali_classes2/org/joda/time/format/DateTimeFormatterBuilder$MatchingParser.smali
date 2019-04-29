.class Lorg/joda/time/format/DateTimeFormatterBuilder$MatchingParser;
.super Ljava/lang/Object;
.source "DateTimeFormatterBuilder.java"

# interfaces
.implements Lorg/joda/time/format/InternalParser;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/joda/time/format/DateTimeFormatterBuilder;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "MatchingParser"
.end annotation


# instance fields
.field private final iParsedLengthEstimate:I

.field private final iParsers:[Lorg/joda/time/format/InternalParser;


# direct methods
.method constructor <init>([Lorg/joda/time/format/InternalParser;)V
    .locals 3

    .line 2515
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2516
    iput-object p1, p0, Lorg/joda/time/format/DateTimeFormatterBuilder$MatchingParser;->iParsers:[Lorg/joda/time/format/InternalParser;

    const/4 v0, 0x0

    .line 2518
    array-length v1, p1

    :cond_0
    :goto_0
    add-int/lit8 v1, v1, -0x1

    if-ltz v1, :cond_1

    .line 2519
    aget-object v2, p1, v1

    if-eqz v2, :cond_0

    .line 2521
    invoke-interface {v2}, Lorg/joda/time/format/InternalParser;->estimateParsedLength()I

    move-result v2

    if-le v2, v0, :cond_0

    move v0, v2

    goto :goto_0

    .line 2527
    :cond_1
    iput v0, p0, Lorg/joda/time/format/DateTimeFormatterBuilder$MatchingParser;->iParsedLengthEstimate:I

    return-void
.end method


# virtual methods
.method public estimateParsedLength()I
    .locals 1

    .line 2531
    iget v0, p0, Lorg/joda/time/format/DateTimeFormatterBuilder$MatchingParser;->iParsedLengthEstimate:I

    return v0
.end method

.method public parseInto(Lorg/joda/time/format/DateTimeParserBucket;Ljava/lang/CharSequence;I)I
    .locals 9

    .line 2535
    iget-object v0, p0, Lorg/joda/time/format/DateTimeFormatterBuilder$MatchingParser;->iParsers:[Lorg/joda/time/format/InternalParser;

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 2536
    array-length v3, v0

    .line 2538
    invoke-virtual {p1}, Lorg/joda/time/format/DateTimeParserBucket;->saveState()Ljava/lang/Object;

    move-result-object v4

    move v5, p3

    move v7, v5

    move-object v6, v2

    move v2, v1

    :goto_0
    if-ge v2, v3, :cond_6

    .line 2547
    aget-object v8, v0, v2

    if-nez v8, :cond_1

    if-gt v5, p3, :cond_0

    return p3

    :cond_0
    const/4 v1, 0x1

    goto :goto_3

    .line 2556
    :cond_1
    invoke-interface {v8, p1, p2, p3}, Lorg/joda/time/format/InternalParser;->parseInto(Lorg/joda/time/format/DateTimeParserBucket;Ljava/lang/CharSequence;I)I

    move-result v8

    if-lt v8, p3, :cond_4

    if-le v8, v5, :cond_5

    .line 2559
    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result v5

    if-ge v8, v5, :cond_3

    add-int/lit8 v5, v2, 0x1

    if-ge v5, v3, :cond_3

    aget-object v5, v0, v5

    if-nez v5, :cond_2

    goto :goto_1

    .line 2567
    :cond_2
    invoke-virtual {p1}, Lorg/joda/time/format/DateTimeParserBucket;->saveState()Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    move v5, v8

    goto :goto_2

    :cond_3
    :goto_1
    return v8

    :cond_4
    if-gez v8, :cond_5

    xor-int/lit8 v8, v8, -0x1

    if-le v8, v7, :cond_5

    move v7, v8

    .line 2577
    :cond_5
    :goto_2
    invoke-virtual {p1, v4}, Lorg/joda/time/format/DateTimeParserBucket;->restoreState(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_6
    :goto_3
    if-gt v5, p3, :cond_8

    if-ne v5, p3, :cond_7

    if-eqz v1, :cond_7

    goto :goto_4

    :cond_7
    xor-int/lit8 p1, v7, -0x1

    return p1

    :cond_8
    :goto_4
    if-eqz v6, :cond_9

    .line 2583
    invoke-virtual {p1, v6}, Lorg/joda/time/format/DateTimeParserBucket;->restoreState(Ljava/lang/Object;)Z

    :cond_9
    return v5
.end method
