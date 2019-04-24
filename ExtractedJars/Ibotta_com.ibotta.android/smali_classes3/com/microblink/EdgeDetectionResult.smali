.class public final Lcom/microblink/EdgeDetectionResult;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/microblink/RecognizerResult;


# instance fields
.field private final contentPercent:F

.field private final foundBottomEdge:Z

.field private final foundTopEdge:Z

.field private final state:Lcom/microblink/EdgeDetectionState;


# direct methods
.method private constructor <init>(Lcom/microblink/EdgeDetectionState;FZZ)V
    .locals 0
    .param p1    # Lcom/microblink/EdgeDetectionState;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/microblink/EdgeDetectionResult;->state:Lcom/microblink/EdgeDetectionState;

    iput p2, p0, Lcom/microblink/EdgeDetectionResult;->contentPercent:F

    iput-boolean p4, p0, Lcom/microblink/EdgeDetectionResult;->foundBottomEdge:Z

    iput-boolean p3, p0, Lcom/microblink/EdgeDetectionResult;->foundTopEdge:Z

    return-void
.end method

.method public static create(Lcom/microblink/EdgeDetectionState;FZZ)Lcom/microblink/EdgeDetectionResult;
    .locals 1
    .param p0    # Lcom/microblink/EdgeDetectionState;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    new-instance v0, Lcom/microblink/EdgeDetectionResult;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/microblink/EdgeDetectionResult;-><init>(Lcom/microblink/EdgeDetectionState;FZZ)V

    return-object v0
.end method


# virtual methods
.method public final contentPercent()F
    .locals 1

    iget v0, p0, Lcom/microblink/EdgeDetectionResult;->contentPercent:F

    return v0
.end method

.method public final foundBottomEdge()Z
    .locals 1

    iget-boolean v0, p0, Lcom/microblink/EdgeDetectionResult;->foundBottomEdge:Z

    return v0
.end method

.method public final foundTopEdge()Z
    .locals 1

    iget-boolean v0, p0, Lcom/microblink/EdgeDetectionResult;->foundTopEdge:Z

    return v0
.end method

.method public final state()Lcom/microblink/EdgeDetectionState;
    .locals 1

    iget-object v0, p0, Lcom/microblink/EdgeDetectionResult;->state:Lcom/microblink/EdgeDetectionState;

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "EdgeDetectionResult{state="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/microblink/EdgeDetectionResult;->state:Lcom/microblink/EdgeDetectionState;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", contentPercent="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/microblink/EdgeDetectionResult;->contentPercent:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", foundBottomEdge="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/microblink/EdgeDetectionResult;->foundBottomEdge:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", foundTopEdge="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/microblink/EdgeDetectionResult;->foundTopEdge:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
