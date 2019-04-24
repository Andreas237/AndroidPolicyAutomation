.class public final Lcom/microblink/CameraFrameResult;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/microblink/BitmapResult;


# instance fields
.field private bitmap:Landroid/graphics/Bitmap;

.field private blurScore:I

.field private creationTimeStamp:J

.field private edgeDetection:Lcom/microblink/EdgeDetection;

.field private frame1080p:Landroid/graphics/Bitmap;

.field private frameId:J

.field private orientation:Lcom/microblink/CameraOrientation;

.field private stats:Lcom/microblink/StatsResults;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static create(ILandroid/graphics/Bitmap;Lcom/microblink/CameraOrientation;Lcom/microblink/StatsResults;J)Lcom/microblink/CameraFrameResult;
    .locals 8
    .param p2    # Lcom/microblink/CameraOrientation;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lcom/microblink/StatsResults;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const/4 v6, 0x0

    const/4 v7, 0x0

    move v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-wide v4, p4

    invoke-static/range {v0 .. v7}, Lcom/microblink/CameraFrameResult;->create(ILandroid/graphics/Bitmap;Lcom/microblink/CameraOrientation;Lcom/microblink/StatsResults;JLcom/microblink/EdgeDetection;Landroid/graphics/Bitmap;)Lcom/microblink/CameraFrameResult;

    move-result-object p0

    return-object p0
.end method

.method public static create(ILandroid/graphics/Bitmap;Lcom/microblink/CameraOrientation;Lcom/microblink/StatsResults;JLcom/microblink/EdgeDetection;Landroid/graphics/Bitmap;)Lcom/microblink/CameraFrameResult;
    .locals 1
    .param p2    # Lcom/microblink/CameraOrientation;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lcom/microblink/StatsResults;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p6    # Lcom/microblink/EdgeDetection;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    new-instance v0, Lcom/microblink/CameraFrameResult;

    invoke-direct {v0}, Lcom/microblink/CameraFrameResult;-><init>()V

    iput p0, v0, Lcom/microblink/CameraFrameResult;->blurScore:I

    iput-object p1, v0, Lcom/microblink/CameraFrameResult;->bitmap:Landroid/graphics/Bitmap;

    iput-object p2, v0, Lcom/microblink/CameraFrameResult;->orientation:Lcom/microblink/CameraOrientation;

    iput-object p3, v0, Lcom/microblink/CameraFrameResult;->stats:Lcom/microblink/StatsResults;

    iput-wide p4, v0, Lcom/microblink/CameraFrameResult;->frameId:J

    iput-object p6, v0, Lcom/microblink/CameraFrameResult;->edgeDetection:Lcom/microblink/EdgeDetection;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p0

    iput-wide p0, v0, Lcom/microblink/CameraFrameResult;->creationTimeStamp:J

    iput-object p7, v0, Lcom/microblink/CameraFrameResult;->frame1080p:Landroid/graphics/Bitmap;

    return-object v0
.end method

.method public static create(Landroid/graphics/Bitmap;Lcom/microblink/CameraOrientation;)Lcom/microblink/CameraFrameResult;
    .locals 8
    .param p0    # Landroid/graphics/Bitmap;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # Lcom/microblink/CameraOrientation;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    invoke-static {}, Lcom/microblink/StatsResults;->create()Lcom/microblink/StatsResults;

    move-result-object v3

    new-instance v0, Ljava/security/SecureRandom;

    invoke-direct {v0}, Ljava/security/SecureRandom;-><init>()V

    invoke-virtual {v0}, Ljava/security/SecureRandom;->nextLong()J

    move-result-wide v4

    const/4 v0, -0x1

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-static/range {v0 .. v7}, Lcom/microblink/CameraFrameResult;->create(ILandroid/graphics/Bitmap;Lcom/microblink/CameraOrientation;Lcom/microblink/StatsResults;JLcom/microblink/EdgeDetection;Landroid/graphics/Bitmap;)Lcom/microblink/CameraFrameResult;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final bitmap()Landroid/graphics/Bitmap;
    .locals 1

    iget-object v0, p0, Lcom/microblink/CameraFrameResult;->bitmap:Landroid/graphics/Bitmap;

    return-object v0
.end method

.method public final blurScore()I
    .locals 1

    iget v0, p0, Lcom/microblink/CameraFrameResult;->blurScore:I

    return v0
.end method

.method public final copy()Landroid/graphics/Bitmap;
    .locals 2

    iget-object v0, p0, Lcom/microblink/CameraFrameResult;->bitmap:Landroid/graphics/Bitmap;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/microblink/internal/BitmapUtils;->copy(Landroid/graphics/Bitmap;Z)Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0
.end method

.method public final creationDateTime()J
    .locals 2

    iget-wide v0, p0, Lcom/microblink/CameraFrameResult;->creationTimeStamp:J

    return-wide v0
.end method

.method public final duration()J
    .locals 2

    iget-object v0, p0, Lcom/microblink/CameraFrameResult;->stats:Lcom/microblink/StatsResults;

    invoke-virtual {v0}, Lcom/microblink/StatsResults;->duration()J

    move-result-wide v0

    return-wide v0
.end method

.method public final edgeDetection()Lcom/microblink/EdgeDetection;
    .locals 1

    iget-object v0, p0, Lcom/microblink/CameraFrameResult;->edgeDetection:Lcom/microblink/EdgeDetection;

    return-object v0
.end method

.method public final frame1080p()Landroid/graphics/Bitmap;
    .locals 1

    iget-object v0, p0, Lcom/microblink/CameraFrameResult;->frame1080p:Landroid/graphics/Bitmap;

    return-object v0
.end method

.method public final frame1080p(Landroid/graphics/Bitmap;)Lcom/microblink/CameraFrameResult;
    .locals 0

    iput-object p1, p0, Lcom/microblink/CameraFrameResult;->frame1080p:Landroid/graphics/Bitmap;

    return-object p0
.end method

.method public final frameId()J
    .locals 2

    iget-wide v0, p0, Lcom/microblink/CameraFrameResult;->frameId:J

    return-wide v0
.end method

.method public final orientation()Lcom/microblink/CameraOrientation;
    .locals 1

    iget-object v0, p0, Lcom/microblink/CameraFrameResult;->orientation:Lcom/microblink/CameraOrientation;

    return-object v0
.end method

.method public final setBitmap(Landroid/graphics/Bitmap;)V
    .locals 0

    iput-object p1, p0, Lcom/microblink/CameraFrameResult;->bitmap:Landroid/graphics/Bitmap;

    return-void
.end method

.method public final setBlurScore(I)V
    .locals 0

    iput p1, p0, Lcom/microblink/CameraFrameResult;->blurScore:I

    return-void
.end method

.method public final setEdgeDetection(Lcom/microblink/EdgeDetection;)V
    .locals 0

    iput-object p1, p0, Lcom/microblink/CameraFrameResult;->edgeDetection:Lcom/microblink/EdgeDetection;

    return-void
.end method

.method public final setOrientation(Lcom/microblink/CameraOrientation;)V
    .locals 0

    iput-object p1, p0, Lcom/microblink/CameraFrameResult;->orientation:Lcom/microblink/CameraOrientation;

    return-void
.end method

.method public final setStats(Lcom/microblink/StatsResults;)V
    .locals 0

    iput-object p1, p0, Lcom/microblink/CameraFrameResult;->stats:Lcom/microblink/StatsResults;

    return-void
.end method

.method public final start()V
    .locals 1

    iget-object v0, p0, Lcom/microblink/CameraFrameResult;->stats:Lcom/microblink/StatsResults;

    invoke-virtual {v0}, Lcom/microblink/StatsResults;->start()V

    return-void
.end method

.method public final stats()Lcom/microblink/StatsResults;
    .locals 1

    iget-object v0, p0, Lcom/microblink/CameraFrameResult;->stats:Lcom/microblink/StatsResults;

    return-object v0
.end method

.method public final stop()V
    .locals 1

    iget-object v0, p0, Lcom/microblink/CameraFrameResult;->stats:Lcom/microblink/StatsResults;

    invoke-virtual {v0}, Lcom/microblink/StatsResults;->end()V

    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "CameraFrameResult{blurScore="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Lcom/microblink/CameraFrameResult;->blurScore:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", bitmap="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/microblink/CameraFrameResult;->bitmap:Landroid/graphics/Bitmap;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", orientation="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/microblink/CameraFrameResult;->orientation:Lcom/microblink/CameraOrientation;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", stats="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/microblink/CameraFrameResult;->stats:Lcom/microblink/StatsResults;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", frameId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/microblink/CameraFrameResult;->frameId:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", edgeDetection="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/microblink/CameraFrameResult;->edgeDetection:Lcom/microblink/EdgeDetection;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
