.class public interface abstract Lcom/microblink/BitmapResult;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/microblink/RecognizerResult;
.implements Lcom/microblink/StatsTimer;


# virtual methods
.method public abstract bitmap()Landroid/graphics/Bitmap;
.end method

.method public abstract blurScore()I
.end method

.method public abstract copy()Landroid/graphics/Bitmap;
.end method

.method public abstract creationDateTime()J
.end method

.method public abstract edgeDetection()Lcom/microblink/EdgeDetection;
.end method

.method public abstract frameId()J
.end method

.method public abstract orientation()Lcom/microblink/CameraOrientation;
.end method

.method public abstract setEdgeDetection(Lcom/microblink/EdgeDetection;)V
.end method
