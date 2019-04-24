.class public Ljava9/util/DoubleSummaryStatistics;
.super Ljava/lang/Object;
.source "DoubleSummaryStatistics.java"

# interfaces
.implements Ljava9/util/function/DoubleConsumer;


# instance fields
.field private count:J

.field private max:D

.field private min:D

.field private simpleSum:D

.field private sum:D

.field private sumCompensation:D


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 76
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/high16 v0, 0x7ff0000000000000L    # Double.POSITIVE_INFINITY

    .line 68
    iput-wide v0, p0, Ljava9/util/DoubleSummaryStatistics;->min:D

    const-wide/high16 v0, -0x10000000000000L    # Double.NEGATIVE_INFINITY

    .line 69
    iput-wide v0, p0, Ljava9/util/DoubleSummaryStatistics;->max:D

    return-void
.end method

.method private sumWithCompensation(D)V
    .locals 4

    .line 175
    iget-wide v0, p0, Ljava9/util/DoubleSummaryStatistics;->sumCompensation:D

    sub-double/2addr p1, v0

    .line 176
    iget-wide v0, p0, Ljava9/util/DoubleSummaryStatistics;->sum:D

    add-double v2, v0, p1

    sub-double v0, v2, v0

    sub-double/2addr v0, p1

    .line 177
    iput-wide v0, p0, Ljava9/util/DoubleSummaryStatistics;->sumCompensation:D

    .line 178
    iput-wide v2, p0, Ljava9/util/DoubleSummaryStatistics;->sum:D

    return-void
.end method


# virtual methods
.method public accept(D)V
    .locals 4

    .line 147
    iget-wide v0, p0, Ljava9/util/DoubleSummaryStatistics;->count:J

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    iput-wide v0, p0, Ljava9/util/DoubleSummaryStatistics;->count:J

    .line 148
    iget-wide v0, p0, Ljava9/util/DoubleSummaryStatistics;->simpleSum:D

    add-double/2addr v0, p1

    iput-wide v0, p0, Ljava9/util/DoubleSummaryStatistics;->simpleSum:D

    .line 149
    invoke-direct {p0, p1, p2}, Ljava9/util/DoubleSummaryStatistics;->sumWithCompensation(D)V

    .line 150
    iget-wide v0, p0, Ljava9/util/DoubleSummaryStatistics;->min:D

    invoke-static {v0, v1, p1, p2}, Ljava/lang/Math;->min(DD)D

    move-result-wide v0

    iput-wide v0, p0, Ljava9/util/DoubleSummaryStatistics;->min:D

    .line 151
    iget-wide v0, p0, Ljava9/util/DoubleSummaryStatistics;->max:D

    invoke-static {v0, v1, p1, p2}, Ljava/lang/Math;->max(DD)D

    move-result-wide p1

    iput-wide p1, p0, Ljava9/util/DoubleSummaryStatistics;->max:D

    return-void
.end method

.method public synthetic andThen(Ljava9/util/function/DoubleConsumer;)Ljava9/util/function/DoubleConsumer;
    .locals 0

    invoke-static {p0, p1}, Ljava9/util/function/DoubleConsumer$-CC;->$default$andThen(Ljava9/util/function/DoubleConsumer;Ljava9/util/function/DoubleConsumer;)Ljava9/util/function/DoubleConsumer;

    move-result-object p1

    return-object p1
.end method

.method public combine(Ljava9/util/DoubleSummaryStatistics;)V
    .locals 4

    .line 162
    iget-wide v0, p0, Ljava9/util/DoubleSummaryStatistics;->count:J

    iget-wide v2, p1, Ljava9/util/DoubleSummaryStatistics;->count:J

    add-long/2addr v0, v2

    iput-wide v0, p0, Ljava9/util/DoubleSummaryStatistics;->count:J

    .line 163
    iget-wide v0, p0, Ljava9/util/DoubleSummaryStatistics;->simpleSum:D

    iget-wide v2, p1, Ljava9/util/DoubleSummaryStatistics;->simpleSum:D

    add-double/2addr v0, v2

    iput-wide v0, p0, Ljava9/util/DoubleSummaryStatistics;->simpleSum:D

    .line 164
    iget-wide v0, p1, Ljava9/util/DoubleSummaryStatistics;->sum:D

    invoke-direct {p0, v0, v1}, Ljava9/util/DoubleSummaryStatistics;->sumWithCompensation(D)V

    .line 165
    iget-wide v0, p1, Ljava9/util/DoubleSummaryStatistics;->sumCompensation:D

    invoke-direct {p0, v0, v1}, Ljava9/util/DoubleSummaryStatistics;->sumWithCompensation(D)V

    .line 166
    iget-wide v0, p0, Ljava9/util/DoubleSummaryStatistics;->min:D

    iget-wide v2, p1, Ljava9/util/DoubleSummaryStatistics;->min:D

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->min(DD)D

    move-result-wide v0

    iput-wide v0, p0, Ljava9/util/DoubleSummaryStatistics;->min:D

    .line 167
    iget-wide v0, p0, Ljava9/util/DoubleSummaryStatistics;->max:D

    iget-wide v2, p1, Ljava9/util/DoubleSummaryStatistics;->max:D

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->max(DD)D

    move-result-wide v0

    iput-wide v0, p0, Ljava9/util/DoubleSummaryStatistics;->max:D

    return-void
.end method

.method public final getAverage()D
    .locals 5

    .line 302
    invoke-virtual {p0}, Ljava9/util/DoubleSummaryStatistics;->getCount()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-lez v4, :cond_0

    invoke-virtual {p0}, Ljava9/util/DoubleSummaryStatistics;->getSum()D

    move-result-wide v0

    invoke-virtual {p0}, Ljava9/util/DoubleSummaryStatistics;->getCount()J

    move-result-wide v2

    long-to-double v2, v2

    div-double/2addr v0, v2

    goto :goto_0

    :cond_0
    const-wide/16 v0, 0x0

    :goto_0
    return-wide v0
.end method

.method public final getCount()J
    .locals 2

    .line 187
    iget-wide v0, p0, Ljava9/util/DoubleSummaryStatistics;->count:J

    return-wide v0
.end method

.method public final getMax()D
    .locals 2

    .line 285
    iget-wide v0, p0, Ljava9/util/DoubleSummaryStatistics;->max:D

    return-wide v0
.end method

.method public final getMin()D
    .locals 2

    .line 271
    iget-wide v0, p0, Ljava9/util/DoubleSummaryStatistics;->min:D

    return-wide v0
.end method

.method public final getSum()D
    .locals 4

    .line 249
    iget-wide v0, p0, Ljava9/util/DoubleSummaryStatistics;->sum:D

    iget-wide v2, p0, Ljava9/util/DoubleSummaryStatistics;->sumCompensation:D

    add-double/2addr v0, v2

    .line 250
    invoke-static {v0, v1}, Ljava/lang/Double;->isNaN(D)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-wide v2, p0, Ljava9/util/DoubleSummaryStatistics;->simpleSum:D

    invoke-static {v2, v3}, Ljava/lang/Double;->isInfinite(D)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 255
    iget-wide v0, p0, Ljava9/util/DoubleSummaryStatistics;->simpleSum:D

    return-wide v0

    :cond_0
    return-wide v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    const-string v0, "%s{count=%d, sum=%f, min=%f, average=%f, max=%f}"

    const/4 v1, 0x6

    .line 313
    new-array v1, v1, [Ljava/lang/Object;

    .line 315
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    .line 316
    invoke-virtual {p0}, Ljava9/util/DoubleSummaryStatistics;->getCount()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    .line 317
    invoke-virtual {p0}, Ljava9/util/DoubleSummaryStatistics;->getSum()D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    .line 318
    invoke-virtual {p0}, Ljava9/util/DoubleSummaryStatistics;->getMin()D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    .line 319
    invoke-virtual {p0}, Ljava9/util/DoubleSummaryStatistics;->getAverage()D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    const/4 v3, 0x4

    aput-object v2, v1, v3

    .line 320
    invoke-virtual {p0}, Ljava9/util/DoubleSummaryStatistics;->getMax()D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    .line 313
    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
