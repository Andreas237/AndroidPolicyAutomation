.class public Lo/efl;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "NewApi"
    }
.end annotation


# static fields
.field private static final d:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 12
    const-class v0, Lo/efl;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lo/efl;->d:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static c(Landroid/graphics/Bitmap;Lo/efq;Z)I
    .locals 5

    .line 15
    sget-object v0, Lo/efl;->d:Ljava/lang/String;

    const-string v1, "initTextureID(Bitmap bitmap, TextureOptions options, boolean recycleBmp)"

    invoke-static {v0, v1}, Lo/eez;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 16
    if-nez p1, :cond_0

    .line 17
    invoke-static {}, Lo/efq;->e()Lo/efq;

    move-result-object p1

    .line 20
    :cond_0
    const/4 v0, 0x1

    new-array v4, v0, [I

    .line 21
    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-static {v0, v4, v1}, Landroid/opengl/GLES20;->glGenTextures(I[II)V

    .line 22
    const/4 v0, 0x0

    aget v3, v4, v0

    .line 23
    const/16 v0, 0xde1

    invoke-static {v0, v3}, Landroid/opengl/GLES20;->glBindTexture(II)V

    .line 24
    iget v0, p1, Lo/efq;->c:I

    int-to-float v0, v0

    const/16 v1, 0xde1

    const/16 v2, 0x2801

    invoke-static {v1, v2, v0}, Landroid/opengl/GLES20;->glTexParameterf(IIF)V

    .line 25
    iget v0, p1, Lo/efq;->b:I

    int-to-float v0, v0

    const/16 v1, 0xde1

    const/16 v2, 0x2800

    invoke-static {v1, v2, v0}, Landroid/opengl/GLES20;->glTexParameterf(IIF)V

    .line 26
    iget v0, p1, Lo/efq;->a:I

    int-to-float v0, v0

    const/16 v1, 0xde1

    const/16 v2, 0x2802

    invoke-static {v1, v2, v0}, Landroid/opengl/GLES20;->glTexParameterf(IIF)V

    .line 27
    iget v0, p1, Lo/efq;->e:I

    int-to-float v0, v0

    const/16 v1, 0xde1

    const/16 v2, 0x2803

    invoke-static {v1, v2, v0}, Landroid/opengl/GLES20;->glTexParameterf(IIF)V

    .line 28
    const/16 v0, 0xde1

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {v0, v1, p0, v2}, Landroid/opengl/GLUtils;->texImage2D(IILandroid/graphics/Bitmap;I)V

    .line 29
    iget-boolean v0, p1, Lo/efq;->d:Z

    if-eqz v0, :cond_1

    .line 30
    const/16 v0, 0xde1

    invoke-static {v0}, Landroid/opengl/GLES20;->glGenerateMipmap(I)V

    .line 32
    :cond_1
    if-eqz p2, :cond_2

    .line 33
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->recycle()V

    .line 35
    :cond_2
    return v3
.end method

.method public static d(Landroid/graphics/Bitmap;)V
    .locals 4

    .line 40
    const/16 v0, 0xde1

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3, p0}, Landroid/opengl/GLUtils;->texSubImage2D(IIIILandroid/graphics/Bitmap;)V

    .line 41
    return-void
.end method
