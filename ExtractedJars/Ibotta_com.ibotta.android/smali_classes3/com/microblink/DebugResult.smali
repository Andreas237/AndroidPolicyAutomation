.class public final Lcom/microblink/DebugResult;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/microblink/RecognizerResult;


# instance fields
.field private blinkStats:Lcom/microblink/StatsResults;

.field private blurScore:I

.field private edgeDetection:Lcom/microblink/EdgeDetection;

.field private edgeDetectionStats:Lcom/microblink/StatsResults;

.field private frameId:J

.field private isCaptured:Z

.field private ocrStats:Lcom/microblink/StatsResults;

.field private processingStats:Lcom/microblink/StatsResults;


# direct methods
.method public constructor <init>(J)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Lcom/microblink/DebugResult;->blurScore:I

    iput-wide p1, p0, Lcom/microblink/DebugResult;->frameId:J

    return-void
.end method


# virtual methods
.method public final blinkStats()Lcom/microblink/StatsResults;
    .locals 1

    iget-object v0, p0, Lcom/microblink/DebugResult;->blinkStats:Lcom/microblink/StatsResults;

    return-object v0
.end method

.method public final blinkStats(Lcom/microblink/StatsResults;)V
    .locals 0

    iput-object p1, p0, Lcom/microblink/DebugResult;->blinkStats:Lcom/microblink/StatsResults;

    return-void
.end method

.method public final blurScore()I
    .locals 1

    iget v0, p0, Lcom/microblink/DebugResult;->blurScore:I

    return v0
.end method

.method public final blurScore(I)V
    .locals 0

    iput p1, p0, Lcom/microblink/DebugResult;->blurScore:I

    return-void
.end method

.method public final captured(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/microblink/DebugResult;->isCaptured:Z

    return-void
.end method

.method public final captured()Z
    .locals 1

    iget-boolean v0, p0, Lcom/microblink/DebugResult;->isCaptured:Z

    return v0
.end method

.method public final edgeDetection()Lcom/microblink/EdgeDetection;
    .locals 1

    iget-object v0, p0, Lcom/microblink/DebugResult;->edgeDetection:Lcom/microblink/EdgeDetection;

    return-object v0
.end method

.method public final edgeDetection(Lcom/microblink/EdgeDetection;)V
    .locals 0

    iput-object p1, p0, Lcom/microblink/DebugResult;->edgeDetection:Lcom/microblink/EdgeDetection;

    return-void
.end method

.method public final edgeDetectionStats()Lcom/microblink/StatsResults;
    .locals 1

    iget-object v0, p0, Lcom/microblink/DebugResult;->edgeDetectionStats:Lcom/microblink/StatsResults;

    return-object v0
.end method

.method public final edgeDetectionStats(Lcom/microblink/StatsResults;)V
    .locals 0

    iput-object p1, p0, Lcom/microblink/DebugResult;->edgeDetectionStats:Lcom/microblink/StatsResults;

    return-void
.end method

.method public final frameId()J
    .locals 2

    iget-wide v0, p0, Lcom/microblink/DebugResult;->frameId:J

    return-wide v0
.end method

.method public final ocrStats()Lcom/microblink/StatsResults;
    .locals 1

    iget-object v0, p0, Lcom/microblink/DebugResult;->ocrStats:Lcom/microblink/StatsResults;

    return-object v0
.end method

.method public final ocrStats(Lcom/microblink/StatsResults;)V
    .locals 0

    iput-object p1, p0, Lcom/microblink/DebugResult;->ocrStats:Lcom/microblink/StatsResults;

    return-void
.end method

.method public final processingStats()Lcom/microblink/StatsResults;
    .locals 1

    iget-object v0, p0, Lcom/microblink/DebugResult;->processingStats:Lcom/microblink/StatsResults;

    return-object v0
.end method

.method public final processingStats(Lcom/microblink/StatsResults;)V
    .locals 0

    iput-object p1, p0, Lcom/microblink/DebugResult;->processingStats:Lcom/microblink/StatsResults;

    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "DebugResult{frameId="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v1, p0, Lcom/microblink/DebugResult;->frameId:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", edgeDetectionStats="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/microblink/DebugResult;->edgeDetectionStats:Lcom/microblink/StatsResults;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", ocrStats="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/microblink/DebugResult;->ocrStats:Lcom/microblink/StatsResults;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", blinkStats="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/microblink/DebugResult;->blinkStats:Lcom/microblink/StatsResults;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", processingStats="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/microblink/DebugResult;->processingStats:Lcom/microblink/StatsResults;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", edgeDetection="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/microblink/DebugResult;->edgeDetection:Lcom/microblink/EdgeDetection;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", blurScore="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/microblink/DebugResult;->blurScore:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", isCaptured="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/microblink/DebugResult;->isCaptured:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
