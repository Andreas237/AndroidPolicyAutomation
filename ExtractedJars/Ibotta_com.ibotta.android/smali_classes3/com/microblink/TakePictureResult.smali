.class public final Lcom/microblink/TakePictureResult;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/microblink/BitmapResult;


# instance fields
.field private creationDateTime:J

.field private result:Lcom/microblink/CameraFrameResult;


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static create(Lcom/microblink/CameraFrameResult;)Lcom/microblink/TakePictureResult;
    .locals 3
    .param p0    # Lcom/microblink/CameraFrameResult;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    new-instance v0, Lcom/microblink/TakePictureResult;

    invoke-direct {v0}, Lcom/microblink/TakePictureResult;-><init>()V

    iput-object p0, v0, Lcom/microblink/TakePictureResult;->result:Lcom/microblink/CameraFrameResult;

    invoke-virtual {p0}, Lcom/microblink/CameraFrameResult;->creationDateTime()J

    move-result-wide v1

    iput-wide v1, v0, Lcom/microblink/TakePictureResult;->creationDateTime:J

    return-object v0
.end method


# virtual methods
.method public final bitmap()Landroid/graphics/Bitmap;
    .locals 1

    iget-object v0, p0, Lcom/microblink/TakePictureResult;->result:Lcom/microblink/CameraFrameResult;

    invoke-virtual {v0}, Lcom/microblink/CameraFrameResult;->bitmap()Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0
.end method

.method public final blurScore()I
    .locals 1

    iget-object v0, p0, Lcom/microblink/TakePictureResult;->result:Lcom/microblink/CameraFrameResult;

    invoke-virtual {v0}, Lcom/microblink/CameraFrameResult;->blurScore()I

    move-result v0

    return v0
.end method

.method public final copy()Landroid/graphics/Bitmap;
    .locals 1

    iget-object v0, p0, Lcom/microblink/TakePictureResult;->result:Lcom/microblink/CameraFrameResult;

    invoke-virtual {v0}, Lcom/microblink/CameraFrameResult;->copy()Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0
.end method

.method public final creationDateTime()J
    .locals 2

    iget-wide v0, p0, Lcom/microblink/TakePictureResult;->creationDateTime:J

    return-wide v0
.end method

.method public final duration()J
    .locals 2

    iget-object v0, p0, Lcom/microblink/TakePictureResult;->result:Lcom/microblink/CameraFrameResult;

    invoke-virtual {v0}, Lcom/microblink/CameraFrameResult;->duration()J

    move-result-wide v0

    return-wide v0
.end method

.method public final edgeDetection()Lcom/microblink/EdgeDetection;
    .locals 1

    iget-object v0, p0, Lcom/microblink/TakePictureResult;->result:Lcom/microblink/CameraFrameResult;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/microblink/CameraFrameResult;->edgeDetection()Lcom/microblink/EdgeDetection;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final frameId()J
    .locals 2

    iget-object v0, p0, Lcom/microblink/TakePictureResult;->result:Lcom/microblink/CameraFrameResult;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/microblink/CameraFrameResult;->frameId()J

    move-result-wide v0

    return-wide v0

    :cond_0
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    return-wide v0
.end method

.method public final getResult()Lcom/microblink/CameraFrameResult;
    .locals 1

    iget-object v0, p0, Lcom/microblink/TakePictureResult;->result:Lcom/microblink/CameraFrameResult;

    return-object v0
.end method

.method public final highResBitmap()Landroid/graphics/Bitmap;
    .locals 1

    iget-object v0, p0, Lcom/microblink/TakePictureResult;->result:Lcom/microblink/CameraFrameResult;

    invoke-virtual {v0}, Lcom/microblink/CameraFrameResult;->frame1080p()Landroid/graphics/Bitmap;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/microblink/TakePictureResult;->result:Lcom/microblink/CameraFrameResult;

    invoke-virtual {v0}, Lcom/microblink/CameraFrameResult;->frame1080p()Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/microblink/TakePictureResult;->result:Lcom/microblink/CameraFrameResult;

    invoke-virtual {v0}, Lcom/microblink/CameraFrameResult;->bitmap()Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0
.end method

.method public final orientation()Lcom/microblink/CameraOrientation;
    .locals 1

    iget-object v0, p0, Lcom/microblink/TakePictureResult;->result:Lcom/microblink/CameraFrameResult;

    invoke-virtual {v0}, Lcom/microblink/CameraFrameResult;->orientation()Lcom/microblink/CameraOrientation;

    move-result-object v0

    return-object v0
.end method

.method public final setEdgeDetection(Lcom/microblink/EdgeDetection;)V
    .locals 1

    iget-object v0, p0, Lcom/microblink/TakePictureResult;->result:Lcom/microblink/CameraFrameResult;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lcom/microblink/CameraFrameResult;->setEdgeDetection(Lcom/microblink/EdgeDetection;)V

    :cond_0
    return-void
.end method

.method public final start()V
    .locals 1

    iget-object v0, p0, Lcom/microblink/TakePictureResult;->result:Lcom/microblink/CameraFrameResult;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/microblink/CameraFrameResult;->stats()Lcom/microblink/StatsResults;

    move-result-object v0

    invoke-virtual {v0}, Lcom/microblink/StatsResults;->start()V

    :cond_0
    return-void
.end method

.method public final stop()V
    .locals 1

    iget-object v0, p0, Lcom/microblink/TakePictureResult;->result:Lcom/microblink/CameraFrameResult;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/microblink/CameraFrameResult;->stats()Lcom/microblink/StatsResults;

    move-result-object v0

    invoke-virtual {v0}, Lcom/microblink/StatsResults;->end()V

    :cond_0
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "TakePictureResult{result="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/microblink/TakePictureResult;->result:Lcom/microblink/CameraFrameResult;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
