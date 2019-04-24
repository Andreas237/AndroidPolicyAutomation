.class public Lo/fgg;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:F

.field private b:F

.field private c:Landroid/graphics/Bitmap;

.field private e:I


# virtual methods
.method public a()F
    .locals 1

    .line 29
    iget v0, p0, Lo/fgg;->b:F

    return v0
.end method

.method public a(F)V
    .locals 0

    .line 41
    iput p1, p0, Lo/fgg;->a:F

    .line 42
    return-void
.end method

.method public b()I
    .locals 1

    .line 17
    iget v0, p0, Lo/fgg;->e:I

    return v0
.end method

.method public c()F
    .locals 1

    .line 37
    iget v0, p0, Lo/fgg;->a:F

    return v0
.end method

.method public c(F)V
    .locals 0

    .line 33
    iput p1, p0, Lo/fgg;->b:F

    .line 34
    return-void
.end method

.method public d(Landroid/graphics/Bitmap;)V
    .locals 0

    .line 25
    iput-object p1, p0, Lo/fgg;->c:Landroid/graphics/Bitmap;

    .line 26
    return-void
.end method

.method public e()Landroid/graphics/Bitmap;
    .locals 1

    .line 21
    iget-object v0, p0, Lo/fgg;->c:Landroid/graphics/Bitmap;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 46
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "CursorModel [mBmpId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/fgg;->e:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", mBitmap="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/fgg;->c:Landroid/graphics/Bitmap;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", mX="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/fgg;->b:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", mY="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/fgg;->a:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
