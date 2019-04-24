.class final Lcom/microblink/SummaryStats;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/microblink/StatsTimer;


# instance fields
.field private frameCount:I

.field private ocrTimer:Lcom/microblink/StatsResults;

.field private ocrTimingCount:I

.field private stats:Lcom/microblink/StatsResults;

.field private totalOcrTimings:J


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p0}, Lcom/microblink/SummaryStats;->reset()V

    return-void
.end method


# virtual methods
.method final averageOcrTime()J
    .locals 5

    iget v0, p0, Lcom/microblink/SummaryStats;->ocrTimingCount:I

    if-eqz v0, :cond_0

    iget-wide v1, p0, Lcom/microblink/SummaryStats;->totalOcrTimings:J

    int-to-long v3, v0

    div-long/2addr v1, v3

    return-wide v1

    :cond_0
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public final duration()J
    .locals 2

    iget-object v0, p0, Lcom/microblink/SummaryStats;->stats:Lcom/microblink/StatsResults;

    invoke-virtual {v0}, Lcom/microblink/StatsResults;->duration()J

    move-result-wide v0

    return-wide v0
.end method

.method final endOcrTimer()V
    .locals 4

    iget-object v0, p0, Lcom/microblink/SummaryStats;->ocrTimer:Lcom/microblink/StatsResults;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/microblink/StatsResults;->end()V

    iget-wide v0, p0, Lcom/microblink/SummaryStats;->totalOcrTimings:J

    iget-object v2, p0, Lcom/microblink/SummaryStats;->ocrTimer:Lcom/microblink/StatsResults;

    invoke-virtual {v2}, Lcom/microblink/StatsResults;->duration()J

    move-result-wide v2

    add-long/2addr v0, v2

    iput-wide v0, p0, Lcom/microblink/SummaryStats;->totalOcrTimings:J

    :cond_0
    const/4 v0, 0x0

    iput v0, p0, Lcom/microblink/SummaryStats;->ocrTimingCount:I

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/microblink/SummaryStats;->ocrTimer:Lcom/microblink/StatsResults;

    return-void
.end method

.method final frameCount()I
    .locals 1

    iget v0, p0, Lcom/microblink/SummaryStats;->frameCount:I

    return v0
.end method

.method final incrementFrameCount()V
    .locals 1

    iget v0, p0, Lcom/microblink/SummaryStats;->frameCount:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/microblink/SummaryStats;->frameCount:I

    return-void
.end method

.method final reset()V
    .locals 2

    const/4 v0, 0x0

    iput v0, p0, Lcom/microblink/SummaryStats;->frameCount:I

    invoke-static {}, Lcom/microblink/StatsResults;->create()Lcom/microblink/StatsResults;

    move-result-object v1

    iput-object v1, p0, Lcom/microblink/SummaryStats;->stats:Lcom/microblink/StatsResults;

    iput v0, p0, Lcom/microblink/SummaryStats;->ocrTimingCount:I

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/microblink/SummaryStats;->totalOcrTimings:J

    return-void
.end method

.method public final start()V
    .locals 1

    iget-object v0, p0, Lcom/microblink/SummaryStats;->stats:Lcom/microblink/StatsResults;

    invoke-virtual {v0}, Lcom/microblink/StatsResults;->start()V

    return-void
.end method

.method final startOcrTimer()V
    .locals 1

    iget-object v0, p0, Lcom/microblink/SummaryStats;->ocrTimer:Lcom/microblink/StatsResults;

    if-nez v0, :cond_0

    new-instance v0, Lcom/microblink/StatsResults;

    invoke-direct {v0}, Lcom/microblink/StatsResults;-><init>()V

    iput-object v0, p0, Lcom/microblink/SummaryStats;->ocrTimer:Lcom/microblink/StatsResults;

    :cond_0
    iget v0, p0, Lcom/microblink/SummaryStats;->ocrTimingCount:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/microblink/SummaryStats;->ocrTimingCount:I

    iget-object v0, p0, Lcom/microblink/SummaryStats;->ocrTimer:Lcom/microblink/StatsResults;

    invoke-virtual {v0}, Lcom/microblink/StatsResults;->start()V

    return-void
.end method

.method public final stop()V
    .locals 1

    iget-object v0, p0, Lcom/microblink/SummaryStats;->stats:Lcom/microblink/StatsResults;

    invoke-virtual {v0}, Lcom/microblink/StatsResults;->end()V

    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "SummaryStats{frameCount="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Lcom/microblink/SummaryStats;->frameCount:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", stats="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/microblink/SummaryStats;->stats:Lcom/microblink/StatsResults;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", totalOcrTimings="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/microblink/SummaryStats;->totalOcrTimings:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", ocrTimingCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/microblink/SummaryStats;->ocrTimingCount:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
