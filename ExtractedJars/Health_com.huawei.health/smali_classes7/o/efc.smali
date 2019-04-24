.class public Lo/efc;
.super Lo/eew;
.source "SourceFile"


# instance fields
.field private A:Z

.field private B:[I

.field private n:Ljava/nio/FloatBuffer;

.field private q:I

.field private r:Ljava/nio/FloatBuffer;

.field private s:I

.field private t:Ljava/nio/FloatBuffer;

.field private u:I

.field private v:I

.field private w:I

.field private x:I

.field private y:I

.field private z:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 38
    invoke-direct {p0, p1}, Lo/eew;-><init>(Landroid/content/Context;)V

    .line 26
    const/4 v0, -0x1

    iput v0, p0, Lo/efc;->s:I

    .line 27
    const/4 v0, -0x1

    iput v0, p0, Lo/efc;->u:I

    .line 28
    const/4 v0, -0x1

    iput v0, p0, Lo/efc;->q:I

    .line 29
    const/4 v0, -0x1

    iput v0, p0, Lo/efc;->w:I

    .line 30
    const/4 v0, -0x1

    iput v0, p0, Lo/efc;->x:I

    .line 31
    const/4 v0, -0x1

    iput v0, p0, Lo/efc;->z:I

    .line 32
    const/4 v0, -0x1

    iput v0, p0, Lo/efc;->y:I

    .line 33
    const/4 v0, -0x1

    iput v0, p0, Lo/efc;->v:I

    .line 34
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/efc;->A:Z

    .line 35
    const/4 v0, 0x3

    new-array v0, v0, [I

    iput-object v0, p0, Lo/efc;->B:[I

    .line 39
    invoke-static {}, Lo/efq;->c()Lo/efq;

    move-result-object v0

    iput-object v0, p0, Lo/efc;->o:Lo/efq;

    .line 40
    const-string v0, "gles_engine_object3d/default_simple_object3d.mat"

    iput-object v0, p0, Lo/efc;->l:Ljava/lang/String;

    .line 41
    return-void
.end method

.method private d([F[F[F)V
    .locals 1

    .line 48
    invoke-virtual {p0, p1, p2, p3}, Lo/efc;->c([F[F[F)V

    .line 49
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/efc;->A:Z

    .line 50
    invoke-virtual {p0}, Lo/efc;->k()V

    .line 51
    return-void
.end method


# virtual methods
.method protected D()V
    .locals 0

    .line 211
    return-void
.end method

.method public c()V
    .locals 1

    .line 215
    iget-object v0, p0, Lo/efc;->n:Ljava/nio/FloatBuffer;

    if-eqz v0, :cond_0

    .line 216
    iget-object v0, p0, Lo/efc;->n:Ljava/nio/FloatBuffer;

    invoke-virtual {v0}, Ljava/nio/FloatBuffer;->clear()Ljava/nio/Buffer;

    .line 217
    const/4 v0, 0x0

    iput-object v0, p0, Lo/efc;->n:Ljava/nio/FloatBuffer;

    .line 219
    :cond_0
    iget-object v0, p0, Lo/efc;->r:Ljava/nio/FloatBuffer;

    if-eqz v0, :cond_1

    .line 220
    iget-object v0, p0, Lo/efc;->r:Ljava/nio/FloatBuffer;

    invoke-virtual {v0}, Ljava/nio/FloatBuffer;->clear()Ljava/nio/Buffer;

    .line 221
    const/4 v0, 0x0

    iput-object v0, p0, Lo/efc;->r:Ljava/nio/FloatBuffer;

    .line 223
    :cond_1
    iget-object v0, p0, Lo/efc;->t:Ljava/nio/FloatBuffer;

    if-eqz v0, :cond_2

    .line 224
    iget-object v0, p0, Lo/efc;->t:Ljava/nio/FloatBuffer;

    invoke-virtual {v0}, Ljava/nio/FloatBuffer;->clear()Ljava/nio/Buffer;

    .line 225
    const/4 v0, 0x0

    iput-object v0, p0, Lo/efc;->t:Ljava/nio/FloatBuffer;

    .line 227
    :cond_2
    invoke-super {p0}, Lo/eew;->c()V

    .line 228
    return-void
.end method

.method public c([F[F[F)V
    .locals 3

    .line 54
    const-string v0, "Object3D"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lo/eez;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "count vertices="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    array-length v2, p1

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " normals="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    array-length v2, p2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " texCoors="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    array-length v2, p3

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/eez;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 55
    array-length v0, p1

    div-int/lit8 v0, v0, 0x3

    iput v0, p0, Lo/efc;->f:I

    .line 56
    invoke-static {p1}, Lo/efx;->d([F)Ljava/nio/FloatBuffer;

    move-result-object v0

    iput-object v0, p0, Lo/efc;->n:Ljava/nio/FloatBuffer;

    .line 57
    invoke-static {p2}, Lo/efx;->d([F)Ljava/nio/FloatBuffer;

    move-result-object v0

    iput-object v0, p0, Lo/efc;->r:Ljava/nio/FloatBuffer;

    .line 58
    invoke-static {p3}, Lo/efx;->d([F)Ljava/nio/FloatBuffer;

    move-result-object v0

    iput-object v0, p0, Lo/efc;->t:Ljava/nio/FloatBuffer;

    .line 59
    return-void
.end method

.method protected d()V
    .locals 6

    .line 159
    invoke-super {p0}, Lo/eew;->d()V

    .line 160
    iget v0, p0, Lo/efc;->s:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 161
    iget v0, p0, Lo/efc;->s:I

    invoke-virtual {p0}, Lo/efc;->p()[F

    move-result-object v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static {v0, v2, v3, v1, v4}, Landroid/opengl/GLES20;->glUniformMatrix4fv(IIZ[FI)V

    .line 163
    :cond_0
    iget v0, p0, Lo/efc;->u:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_1

    .line 164
    iget v0, p0, Lo/efc;->u:I

    invoke-virtual {p0}, Lo/efc;->l()[F

    move-result-object v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static {v0, v2, v3, v1, v4}, Landroid/opengl/GLES20;->glUniformMatrix4fv(IIZ[FI)V

    .line 166
    :cond_1
    iget v0, p0, Lo/efc;->q:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_2

    .line 167
    iget v0, p0, Lo/efc;->q:I

    invoke-virtual {p0}, Lo/efc;->m()[F

    move-result-object v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static {v0, v2, v3, v1, v4}, Landroid/opengl/GLES20;->glUniformMatrix4fv(IIZ[FI)V

    .line 169
    :cond_2
    iget v0, p0, Lo/efc;->w:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_3

    .line 170
    iget v0, p0, Lo/efc;->w:I

    invoke-virtual {p0}, Lo/efc;->o()[F

    move-result-object v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static {v0, v2, v3, v1, v4}, Landroid/opengl/GLES20;->glUniformMatrix4fv(IIZ[FI)V

    .line 172
    :cond_3
    iget v0, p0, Lo/efc;->x:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_4

    .line 173
    iget-object v0, p0, Lo/efc;->B:[I

    const/4 v1, 0x0

    aget v0, v0, v1

    const v1, 0x8892

    invoke-static {v1, v0}, Landroid/opengl/GLES20;->glBindBuffer(II)V

    .line 174
    iget v0, p0, Lo/efc;->x:I

    const/4 v1, 0x3

    const/16 v2, 0x1406

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Landroid/opengl/GLES20;->glVertexAttribPointer(IIIZII)V

    .line 179
    iget v0, p0, Lo/efc;->x:I

    invoke-static {v0}, Landroid/opengl/GLES20;->glEnableVertexAttribArray(I)V

    .line 181
    :cond_4
    iget v0, p0, Lo/efc;->z:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_5

    .line 182
    iget-object v0, p0, Lo/efc;->B:[I

    const/4 v1, 0x1

    aget v0, v0, v1

    const v1, 0x8892

    invoke-static {v1, v0}, Landroid/opengl/GLES20;->glBindBuffer(II)V

    .line 183
    iget v0, p0, Lo/efc;->z:I

    const/4 v1, 0x3

    const/16 v2, 0x1406

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Landroid/opengl/GLES20;->glVertexAttribPointer(IIIZII)V

    .line 184
    iget v0, p0, Lo/efc;->z:I

    invoke-static {v0}, Landroid/opengl/GLES20;->glEnableVertexAttribArray(I)V

    .line 186
    :cond_5
    iget v0, p0, Lo/efc;->y:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_6

    .line 187
    iget-object v0, p0, Lo/efc;->B:[I

    const/4 v1, 0x2

    aget v0, v0, v1

    const v1, 0x8892

    invoke-static {v1, v0}, Landroid/opengl/GLES20;->glBindBuffer(II)V

    .line 188
    iget v0, p0, Lo/efc;->y:I

    const/4 v1, 0x2

    const/16 v2, 0x1406

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Landroid/opengl/GLES20;->glVertexAttribPointer(IIIZII)V

    .line 189
    iget v0, p0, Lo/efc;->y:I

    invoke-static {v0}, Landroid/opengl/GLES20;->glEnableVertexAttribArray(I)V

    .line 191
    :cond_6
    const v0, 0x8892

    const/4 v1, 0x0

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glBindBuffer(II)V

    .line 193
    invoke-virtual {p0}, Lo/efc;->v()V

    .line 194
    iget v0, p0, Lo/efc;->f:I

    const/4 v1, 0x4

    const/4 v2, 0x0

    invoke-static {v1, v2, v0}, Landroid/opengl/GLES20;->glDrawArrays(III)V

    .line 198
    invoke-virtual {p0}, Lo/efc;->D()V

    .line 199
    return-void
.end method

.method public d(II)V
    .locals 11

    .line 86
    invoke-super {p0, p1, p2}, Lo/eew;->d(II)V

    .line 87
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {v0, v1, p1, p2}, Landroid/opengl/GLES20;->glViewport(IIII)V

    .line 88
    int-to-float v0, p1

    int-to-float v1, p2

    div-float v10, v0, v1

    .line 89
    move-object v0, p0

    neg-float v1, v10

    move v2, v10

    const/high16 v3, -0x40800000    # -1.0f

    const/high16 v4, 0x3f800000    # 1.0f

    const/high16 v5, 0x40000000    # 2.0f

    const/high16 v6, 0x447a0000    # 1000.0f

    invoke-virtual/range {v0 .. v6}, Lo/efc;->d(FFFFFF)V

    .line 90
    move-object v0, p0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/high16 v3, 0x42480000    # 50.0f

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/high16 v8, 0x3f800000    # 1.0f

    const/4 v9, 0x0

    invoke-virtual/range {v0 .. v9}, Lo/efc;->b(FFFFFFFFF)V

    .line 91
    return-void
.end method

.method protected e()V
    .locals 3

    .line 95
    invoke-virtual {p0}, Lo/efc;->r()I

    move-result v0

    iput v0, p0, Lo/efc;->s:I

    .line 96
    invoke-virtual {p0}, Lo/efc;->q()I

    move-result v0

    iput v0, p0, Lo/efc;->u:I

    .line 97
    invoke-virtual {p0}, Lo/efc;->s()I

    move-result v0

    iput v0, p0, Lo/efc;->q:I

    .line 98
    invoke-virtual {p0}, Lo/efc;->u()I

    move-result v0

    iput v0, p0, Lo/efc;->w:I

    .line 99
    invoke-virtual {p0}, Lo/efc;->y()I

    move-result v0

    iput v0, p0, Lo/efc;->x:I

    .line 100
    invoke-virtual {p0}, Lo/efc;->w()I

    move-result v0

    iput v0, p0, Lo/efc;->z:I

    .line 101
    invoke-virtual {p0}, Lo/efc;->x()I

    move-result v0

    iput v0, p0, Lo/efc;->y:I

    .line 102
    invoke-virtual {p0}, Lo/efc;->z()I

    move-result v0

    iput v0, p0, Lo/efc;->v:I

    .line 103
    const-string v0, "Object3D"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lo/eez;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " muMVPMatrixHandle="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lo/efc;->s:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " muModelMatrixHandle="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lo/efc;->u:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " muViewMatrixHandle="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lo/efc;->q:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " muModelViewMatrixHandle="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lo/efc;->w:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " maPositionHandle="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lo/efc;->x:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " maNormalHandle="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lo/efc;->z:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " maTexCoorHandle="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lo/efc;->y:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " muTextureHandle="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lo/efc;->v:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/eez;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 111
    return-void
.end method

.method public e([F[F[F)V
    .locals 0

    .line 44
    invoke-direct {p0, p1, p2, p3}, Lo/efc;->d([F[F[F)V

    .line 45
    return-void
.end method

.method public f()V
    .locals 1

    .line 63
    invoke-super {p0}, Lo/eew;->f()V

    .line 64
    new-instance v0, Lo/efc$4;

    invoke-direct {v0, p0}, Lo/efc$4;-><init>(Lo/efc;)V

    invoke-virtual {p0, v0}, Lo/efc;->c(Ljava/lang/Runnable;)V

    .line 70
    return-void
.end method

.method public i()V
    .locals 1

    .line 147
    iget-boolean v0, p0, Lo/efc;->A:Z

    if-nez v0, :cond_0

    .line 148
    return-void

    .line 150
    :cond_0
    const/16 v0, 0xb71

    invoke-static {v0}, Landroid/opengl/GLES20;->glEnable(I)V

    .line 151
    const/16 v0, 0xb44

    invoke-static {v0}, Landroid/opengl/GLES20;->glEnable(I)V

    .line 152
    invoke-super {p0}, Lo/eew;->i()V

    .line 153
    const/16 v0, 0xb71

    invoke-static {v0}, Landroid/opengl/GLES20;->glDisable(I)V

    .line 154
    const/16 v0, 0xb44

    invoke-static {v0}, Landroid/opengl/GLES20;->glDisable(I)V

    .line 155
    return-void
.end method

.method protected q()I
    .locals 1

    .line 118
    const-string v0, "uModelMatrix"

    invoke-virtual {p0, v0}, Lo/efc;->b(Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method protected r()I
    .locals 1

    .line 114
    const-string v0, "uMVPMatrix"

    invoke-virtual {p0, v0}, Lo/efc;->b(Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method protected s()I
    .locals 1

    .line 122
    const-string v0, "uViewMatrix"

    invoke-virtual {p0, v0}, Lo/efc;->b(Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method protected t()V
    .locals 4

    .line 73
    iget-object v0, p0, Lo/efc;->B:[I

    const/4 v1, 0x3

    const/4 v2, 0x0

    invoke-static {v1, v0, v2}, Landroid/opengl/GLES20;->glGenBuffers(I[II)V

    .line 74
    iget-object v0, p0, Lo/efc;->B:[I

    const/4 v1, 0x0

    aget v0, v0, v1

    const v1, 0x8892

    invoke-static {v1, v0}, Landroid/opengl/GLES20;->glBindBuffer(II)V

    .line 75
    iget-object v0, p0, Lo/efc;->n:Ljava/nio/FloatBuffer;

    invoke-virtual {v0}, Ljava/nio/FloatBuffer;->capacity()I

    move-result v0

    mul-int/lit8 v0, v0, 0x4

    iget-object v1, p0, Lo/efc;->n:Ljava/nio/FloatBuffer;

    const v2, 0x8892

    const v3, 0x88e4

    invoke-static {v2, v0, v1, v3}, Landroid/opengl/GLES20;->glBufferData(IILjava/nio/Buffer;I)V

    .line 77
    iget-object v0, p0, Lo/efc;->B:[I

    const/4 v1, 0x1

    aget v0, v0, v1

    const v1, 0x8892

    invoke-static {v1, v0}, Landroid/opengl/GLES20;->glBindBuffer(II)V

    .line 78
    iget-object v0, p0, Lo/efc;->r:Ljava/nio/FloatBuffer;

    invoke-virtual {v0}, Ljava/nio/FloatBuffer;->capacity()I

    move-result v0

    mul-int/lit8 v0, v0, 0x4

    iget-object v1, p0, Lo/efc;->r:Ljava/nio/FloatBuffer;

    const v2, 0x8892

    const v3, 0x88e4

    invoke-static {v2, v0, v1, v3}, Landroid/opengl/GLES20;->glBufferData(IILjava/nio/Buffer;I)V

    .line 79
    iget-object v0, p0, Lo/efc;->B:[I

    const/4 v1, 0x2

    aget v0, v0, v1

    const v1, 0x8892

    invoke-static {v1, v0}, Landroid/opengl/GLES20;->glBindBuffer(II)V

    .line 80
    iget-object v0, p0, Lo/efc;->t:Ljava/nio/FloatBuffer;

    invoke-virtual {v0}, Ljava/nio/FloatBuffer;->capacity()I

    move-result v0

    mul-int/lit8 v0, v0, 0x4

    iget-object v1, p0, Lo/efc;->t:Ljava/nio/FloatBuffer;

    const v2, 0x8892

    const v3, 0x88e4

    invoke-static {v2, v0, v1, v3}, Landroid/opengl/GLES20;->glBufferData(IILjava/nio/Buffer;I)V

    .line 81
    const v0, 0x8892

    const/4 v1, 0x0

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glBindBuffer(II)V

    .line 82
    return-void
.end method

.method protected u()I
    .locals 1

    .line 126
    const-string v0, "uModelViewMatrix"

    invoke-virtual {p0, v0}, Lo/efc;->b(Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method protected v()V
    .locals 2

    .line 202
    iget v0, p0, Lo/efc;->v:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    iget v0, p0, Lo/efc;->p:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 203
    const v0, 0x84c0

    invoke-static {v0}, Landroid/opengl/GLES20;->glActiveTexture(I)V

    .line 204
    iget v0, p0, Lo/efc;->p:I

    const/16 v1, 0xde1

    invoke-static {v1, v0}, Landroid/opengl/GLES20;->glBindTexture(II)V

    .line 205
    iget v0, p0, Lo/efc;->v:I

    const/4 v1, 0x0

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glUniform1i(II)V

    .line 208
    :cond_0
    return-void
.end method

.method protected w()I
    .locals 1

    .line 134
    const-string v0, "aNormal"

    invoke-virtual {p0, v0}, Lo/efc;->b(Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method protected x()I
    .locals 1

    .line 138
    const-string v0, "aTexCoor"

    invoke-virtual {p0, v0}, Lo/efc;->b(Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method protected y()I
    .locals 1

    .line 130
    const-string v0, "aPosition"

    invoke-virtual {p0, v0}, Lo/efc;->b(Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method protected z()I
    .locals 1

    .line 142
    const-string v0, "uTexture"

    invoke-virtual {p0, v0}, Lo/efc;->b(Ljava/lang/String;)I

    move-result v0

    return v0
.end method
