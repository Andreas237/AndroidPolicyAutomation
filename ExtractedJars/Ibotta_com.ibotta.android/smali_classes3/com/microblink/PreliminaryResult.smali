.class public Lcom/microblink/PreliminaryResult;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/microblink/RecognizerResult;


# instance fields
.field private media:Lcom/microblink/Media;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private processing:Z

.field private results:Lcom/microblink/ScanResults;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/microblink/ScanResults;Lcom/microblink/Media;)V
    .locals 1
    .param p1    # Lcom/microblink/ScanResults;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/microblink/Media;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/microblink/PreliminaryResult;-><init>(Lcom/microblink/ScanResults;Lcom/microblink/Media;Z)V

    return-void
.end method

.method public constructor <init>(Lcom/microblink/ScanResults;Lcom/microblink/Media;Z)V
    .locals 0
    .param p1    # Lcom/microblink/ScanResults;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/microblink/Media;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/microblink/PreliminaryResult;->results:Lcom/microblink/ScanResults;

    iput-object p2, p0, Lcom/microblink/PreliminaryResult;->media:Lcom/microblink/Media;

    iput-boolean p3, p0, Lcom/microblink/PreliminaryResult;->processing:Z

    return-void
.end method


# virtual methods
.method public media()Lcom/microblink/Media;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lcom/microblink/PreliminaryResult;->media:Lcom/microblink/Media;

    return-object v0
.end method

.method public processing(Z)Lcom/microblink/PreliminaryResult;
    .locals 0

    iput-boolean p1, p0, Lcom/microblink/PreliminaryResult;->processing:Z

    return-object p0
.end method

.method public processing()Z
    .locals 1

    iget-boolean v0, p0, Lcom/microblink/PreliminaryResult;->processing:Z

    return v0
.end method

.method public results()Lcom/microblink/ScanResults;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lcom/microblink/PreliminaryResult;->results:Lcom/microblink/ScanResults;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "PreliminaryResult{results="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/microblink/PreliminaryResult;->results:Lcom/microblink/ScanResults;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", media="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/microblink/PreliminaryResult;->media:Lcom/microblink/Media;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", processing="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/microblink/PreliminaryResult;->processing:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
