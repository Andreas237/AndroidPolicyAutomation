.class public final Lcom/microblink/internal/EdgeDetectionProcessor;
.super Ljava/lang/Object;


# instance fields
.field private final configuration:Lcom/microblink/EdgeDetectionConfiguration;

.field private frameCount:I

.field private framesAboveThreshold:I

.field private framesBelowThreshold:I


# direct methods
.method public constructor <init>(Lcom/microblink/EdgeDetectionConfiguration;)V
    .locals 0
    .param p1    # Lcom/microblink/EdgeDetectionConfiguration;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/microblink/internal/EdgeDetectionProcessor;->configuration:Lcom/microblink/EdgeDetectionConfiguration;

    return-void
.end method


# virtual methods
.method public final aboveThresholdCountAtLimit()Z
    .locals 2

    iget v0, p0, Lcom/microblink/internal/EdgeDetectionProcessor;->framesAboveThreshold:I

    iget-object v1, p0, Lcom/microblink/internal/EdgeDetectionProcessor;->configuration:Lcom/microblink/EdgeDetectionConfiguration;

    invoke-virtual {v1}, Lcom/microblink/EdgeDetectionConfiguration;->framesAboveThresholdLimit()I

    move-result v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final incrementFrameCount()V
    .locals 1

    iget v0, p0, Lcom/microblink/internal/EdgeDetectionProcessor;->frameCount:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/microblink/internal/EdgeDetectionProcessor;->frameCount:I

    return-void
.end method

.method public final isNthFrame()Z
    .locals 2

    iget v0, p0, Lcom/microblink/internal/EdgeDetectionProcessor;->frameCount:I

    iget-object v1, p0, Lcom/microblink/internal/EdgeDetectionProcessor;->configuration:Lcom/microblink/EdgeDetectionConfiguration;

    invoke-virtual {v1}, Lcom/microblink/EdgeDetectionConfiguration;->frameFrequency()I

    move-result v1

    rem-int/2addr v0, v1

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final minimumEdgeBlurScore()I
    .locals 1

    iget-object v0, p0, Lcom/microblink/internal/EdgeDetectionProcessor;->configuration:Lcom/microblink/EdgeDetectionConfiguration;

    invoke-virtual {v0}, Lcom/microblink/EdgeDetectionConfiguration;->minimumBlurScore()I

    move-result v0

    return v0
.end method

.method public final process(Lcom/microblink/EdgeDetection;)Lcom/microblink/EdgeDetectionResult;
    .locals 4
    .param p1    # Lcom/microblink/EdgeDetection;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    iget v0, p1, Lcom/microblink/EdgeDetection;->contentPercent:F

    iget-object v1, p0, Lcom/microblink/internal/EdgeDetectionProcessor;->configuration:Lcom/microblink/EdgeDetectionConfiguration;

    invoke-virtual {v1}, Lcom/microblink/EdgeDetectionConfiguration;->edgeContentThreshold()F

    move-result v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    cmpg-float v0, v0, v1

    if-gez v0, :cond_2

    iget v0, p0, Lcom/microblink/internal/EdgeDetectionProcessor;->framesBelowThreshold:I

    add-int/2addr v0, v2

    iput v0, p0, Lcom/microblink/internal/EdgeDetectionProcessor;->framesBelowThreshold:I

    invoke-virtual {p0}, Lcom/microblink/internal/EdgeDetectionProcessor;->aboveThresholdCountAtLimit()Z

    move-result v0

    if-nez v0, :cond_0

    iput v3, p0, Lcom/microblink/internal/EdgeDetectionProcessor;->framesAboveThreshold:I

    :cond_0
    iget v0, p0, Lcom/microblink/internal/EdgeDetectionProcessor;->framesBelowThreshold:I

    iget-object v1, p0, Lcom/microblink/internal/EdgeDetectionProcessor;->configuration:Lcom/microblink/EdgeDetectionConfiguration;

    invoke-virtual {v1}, Lcom/microblink/EdgeDetectionConfiguration;->framesWithNoEdgesLimit()I

    move-result v1

    if-ne v0, v1, :cond_1

    iput v3, p0, Lcom/microblink/internal/EdgeDetectionProcessor;->framesBelowThreshold:I

    new-instance v0, Lcom/microblink/EdgeDetectionState;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Lcom/microblink/EdgeDetectionState;-><init>(I)V

    :goto_0
    iget v1, p1, Lcom/microblink/EdgeDetection;->contentPercent:F

    iget-boolean v2, p1, Lcom/microblink/EdgeDetection;->foundTopEdge:Z

    iget-boolean p1, p1, Lcom/microblink/EdgeDetection;->foundBottomEdge:Z

    invoke-static {v0, v1, v2, p1}, Lcom/microblink/EdgeDetectionResult;->create(Lcom/microblink/EdgeDetectionState;FZZ)Lcom/microblink/EdgeDetectionResult;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance v0, Lcom/microblink/EdgeDetectionState;

    invoke-direct {v0, v2}, Lcom/microblink/EdgeDetectionState;-><init>(I)V

    goto :goto_0

    :cond_2
    iput v3, p0, Lcom/microblink/internal/EdgeDetectionProcessor;->framesBelowThreshold:I

    iget v0, p0, Lcom/microblink/internal/EdgeDetectionProcessor;->framesAboveThreshold:I

    add-int/2addr v0, v2

    iput v0, p0, Lcom/microblink/internal/EdgeDetectionProcessor;->framesAboveThreshold:I

    invoke-virtual {p0}, Lcom/microblink/internal/EdgeDetectionProcessor;->aboveThresholdCountAtLimit()Z

    move-result v0

    if-eqz v0, :cond_3

    new-instance v0, Lcom/microblink/EdgeDetectionState;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Lcom/microblink/EdgeDetectionState;-><init>(I)V

    goto :goto_0

    :cond_3
    new-instance v0, Lcom/microblink/EdgeDetectionState;

    invoke-direct {v0, v3}, Lcom/microblink/EdgeDetectionState;-><init>(I)V

    goto :goto_0
.end method

.method public final shouldRunEdgeDetection()Z
    .locals 1

    invoke-virtual {p0}, Lcom/microblink/internal/EdgeDetectionProcessor;->isNthFrame()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/microblink/internal/EdgeDetectionProcessor;->aboveThresholdCountAtLimit()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
