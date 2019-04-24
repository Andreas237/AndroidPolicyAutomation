.class public final Lcom/microblink/EdgeResult;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/microblink/RecognizerResult;


# instance fields
.field private final edgeDetection:Lcom/microblink/EdgeDetection;

.field private final resultBitmap:Landroid/graphics/Bitmap;

.field private final statsResults:Lcom/microblink/StatsResults;


# direct methods
.method public constructor <init>(Landroid/graphics/Bitmap;Lcom/microblink/EdgeDetection;Lcom/microblink/StatsResults;)V
    .locals 0
    .param p1    # Landroid/graphics/Bitmap;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/microblink/EdgeDetection;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lcom/microblink/StatsResults;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/microblink/EdgeResult;->resultBitmap:Landroid/graphics/Bitmap;

    iput-object p2, p0, Lcom/microblink/EdgeResult;->edgeDetection:Lcom/microblink/EdgeDetection;

    iput-object p3, p0, Lcom/microblink/EdgeResult;->statsResults:Lcom/microblink/StatsResults;

    return-void
.end method


# virtual methods
.method public final edgeDetection()Lcom/microblink/EdgeDetection;
    .locals 1

    iget-object v0, p0, Lcom/microblink/EdgeResult;->edgeDetection:Lcom/microblink/EdgeDetection;

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_7

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_2

    :cond_1
    check-cast p1, Lcom/microblink/EdgeResult;

    iget-object v2, p0, Lcom/microblink/EdgeResult;->resultBitmap:Landroid/graphics/Bitmap;

    if-eqz v2, :cond_2

    iget-object v3, p1, Lcom/microblink/EdgeResult;->resultBitmap:Landroid/graphics/Bitmap;

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    goto :goto_0

    :cond_2
    iget-object v2, p1, Lcom/microblink/EdgeResult;->resultBitmap:Landroid/graphics/Bitmap;

    if-eqz v2, :cond_3

    :goto_0
    return v1

    :cond_3
    iget-object v2, p0, Lcom/microblink/EdgeResult;->edgeDetection:Lcom/microblink/EdgeDetection;

    if-eqz v2, :cond_4

    iget-object v3, p1, Lcom/microblink/EdgeResult;->edgeDetection:Lcom/microblink/EdgeDetection;

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5

    goto :goto_1

    :cond_4
    iget-object v2, p1, Lcom/microblink/EdgeResult;->edgeDetection:Lcom/microblink/EdgeDetection;

    if-eqz v2, :cond_5

    :goto_1
    return v1

    :cond_5
    iget-object v2, p0, Lcom/microblink/EdgeResult;->statsResults:Lcom/microblink/StatsResults;

    if-eqz v2, :cond_6

    iget-object p1, p1, Lcom/microblink/EdgeResult;->statsResults:Lcom/microblink/StatsResults;

    invoke-virtual {v2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_6
    iget-object p1, p1, Lcom/microblink/EdgeResult;->statsResults:Lcom/microblink/StatsResults;

    if-nez p1, :cond_7

    return v0

    :cond_7
    :goto_2
    return v1
.end method

.method public final hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/microblink/EdgeResult;->resultBitmap:Landroid/graphics/Bitmap;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/microblink/EdgeResult;->edgeDetection:Lcom/microblink/EdgeDetection;

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/microblink/EdgeResult;->statsResults:Lcom/microblink/StatsResults;

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :cond_2
    add-int/2addr v0, v1

    return v0
.end method

.method public final resultBitmap()Landroid/graphics/Bitmap;
    .locals 1

    iget-object v0, p0, Lcom/microblink/EdgeResult;->resultBitmap:Landroid/graphics/Bitmap;

    return-object v0
.end method

.method public final stats()Lcom/microblink/StatsResults;
    .locals 1

    iget-object v0, p0, Lcom/microblink/EdgeResult;->statsResults:Lcom/microblink/StatsResults;

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "EdgeResult{resultBitmap="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/microblink/EdgeResult;->resultBitmap:Landroid/graphics/Bitmap;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", edgeDetection="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/microblink/EdgeResult;->edgeDetection:Lcom/microblink/EdgeDetection;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", statsResults="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/microblink/EdgeResult;->statsResults:Lcom/microblink/StatsResults;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
