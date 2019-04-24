.class public Lcom/scandit/base/gl/GLUtil;
.super Ljava/lang/Object;
.source "GLUtil.java"


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0x12
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static checkErrors(Ljava/lang/String;)V
    .locals 2

    .line 19
    invoke-static {}, Landroid/opengl/GLES30;->glGetError()I

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 21
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, ": glError 0x"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string v0, "GLUtil"

    .line 22
    invoke-static {v0, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 23
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static createComputeProgram(Ljava/lang/String;)I
    .locals 4
    .annotation build Landroid/annotation/TargetApi;
        value = 0x15
    .end annotation

    const v0, 0x91b9

    .line 51
    invoke-static {v0, p0}, Lcom/scandit/base/gl/GLUtil;->loadShader(ILjava/lang/String;)I

    move-result p0

    .line 53
    invoke-static {}, Landroid/opengl/GLES30;->glCreateProgram()I

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 55
    invoke-static {v0, p0}, Landroid/opengl/GLES30;->glAttachShader(II)V

    const-string p0, "glAttachShader"

    .line 56
    invoke-static {p0}, Lcom/scandit/base/gl/GLUtil;->checkErrors(Ljava/lang/String;)V

    .line 57
    invoke-static {v0}, Landroid/opengl/GLES30;->glLinkProgram(I)V

    const/4 p0, 0x1

    .line 58
    new-array v2, p0, [I

    const v3, 0x8b82

    .line 59
    invoke-static {v0, v3, v2, v1}, Landroid/opengl/GLES30;->glGetProgramiv(II[II)V

    .line 60
    aget v2, v2, v1

    if-eq v2, p0, :cond_0

    const-string p0, "GLUtil"

    const-string v2, "Could not link program: "

    .line 61
    invoke-static {p0, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 62
    invoke-static {v0}, Landroid/opengl/GLES30;->glGetProgramInfoLog(I)Ljava/lang/String;

    move-result-object p0

    const-string v2, "GLUtil"

    .line 63
    invoke-static {v2, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 64
    invoke-static {v0}, Landroid/opengl/GLES30;->glDeleteProgram(I)V

    move v0, v1

    :cond_0
    return v0
.end method

.method public static createProgram(Ljava/lang/String;Ljava/lang/String;)I
    .locals 3

    const v0, 0x8b31

    .line 27
    invoke-static {v0, p0}, Lcom/scandit/base/gl/GLUtil;->loadShader(ILjava/lang/String;)I

    move-result p0

    const v0, 0x8b30

    .line 28
    invoke-static {v0, p1}, Lcom/scandit/base/gl/GLUtil;->loadShader(ILjava/lang/String;)I

    move-result p1

    .line 30
    invoke-static {}, Landroid/opengl/GLES30;->glCreateProgram()I

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 32
    invoke-static {v0, p0}, Landroid/opengl/GLES30;->glAttachShader(II)V

    const-string p0, "glAttachShader"

    .line 33
    invoke-static {p0}, Lcom/scandit/base/gl/GLUtil;->checkErrors(Ljava/lang/String;)V

    .line 34
    invoke-static {v0, p1}, Landroid/opengl/GLES30;->glAttachShader(II)V

    const-string p0, "glAttachShader"

    .line 35
    invoke-static {p0}, Lcom/scandit/base/gl/GLUtil;->checkErrors(Ljava/lang/String;)V

    .line 36
    invoke-static {v0}, Landroid/opengl/GLES30;->glLinkProgram(I)V

    const/4 p0, 0x1

    .line 37
    new-array p1, p0, [I

    const v2, 0x8b82

    .line 38
    invoke-static {v0, v2, p1, v1}, Landroid/opengl/GLES30;->glGetProgramiv(II[II)V

    .line 39
    aget p1, p1, v1

    if-eq p1, p0, :cond_0

    const-string p0, "GLUtil"

    const-string p1, "Could not link program: "

    .line 40
    invoke-static {p0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    const-string p0, "GLUtil"

    .line 41
    invoke-static {v0}, Landroid/opengl/GLES30;->glGetProgramInfoLog(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 42
    invoke-static {v0}, Landroid/opengl/GLES30;->glDeleteProgram(I)V

    move v0, v1

    :cond_0
    return v0
.end method

.method private static loadShader(ILjava/lang/String;)I
    .locals 4

    .line 72
    invoke-static {p0}, Landroid/opengl/GLES30;->glCreateShader(I)I

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 74
    invoke-static {v0, p1}, Landroid/opengl/GLES30;->glShaderSource(ILjava/lang/String;)V

    .line 75
    invoke-static {v0}, Landroid/opengl/GLES30;->glCompileShader(I)V

    const/4 p1, 0x1

    .line 76
    new-array p1, p1, [I

    const v2, 0x8b81

    .line 77
    invoke-static {v0, v2, p1, v1}, Landroid/opengl/GLES30;->glGetShaderiv(II[II)V

    .line 78
    aget p1, p1, v1

    if-nez p1, :cond_0

    const-string p1, "GLUtil"

    .line 79
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Could not compile shader "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, ":"

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p1, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 80
    invoke-static {v0}, Landroid/opengl/GLES30;->glGetShaderInfoLog(I)Ljava/lang/String;

    move-result-object p0

    const-string p1, "GLUtil"

    .line 81
    invoke-static {p1, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 82
    invoke-static {v0}, Landroid/opengl/GLES30;->glDeleteShader(I)V

    move v0, v1

    :cond_0
    return v0
.end method
