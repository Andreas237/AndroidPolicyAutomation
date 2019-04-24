.class public Lcom/scandit/base/gl/EGLCore;
.super Ljava/lang/Object;
.source "EGLCore.java"


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0x11
.end annotation


# instance fields
.field private mConfig:Landroid/opengl/EGLConfig;

.field private mContext:Landroid/opengl/EGLContext;

.field private mDisplay:Landroid/opengl/EGLDisplay;


# direct methods
.method public constructor <init>()V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 25
    invoke-direct {p0, v0, v1}, Lcom/scandit/base/gl/EGLCore;-><init>(Landroid/opengl/EGLContext;I)V

    return-void
.end method

.method public constructor <init>(Landroid/opengl/EGLContext;I)V
    .locals 6

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    sget-object v0, Landroid/opengl/EGL14;->EGL_NO_CONTEXT:Landroid/opengl/EGLContext;

    iput-object v0, p0, Lcom/scandit/base/gl/EGLCore;->mContext:Landroid/opengl/EGLContext;

    const/4 v0, 0x0

    .line 22
    iput-object v0, p0, Lcom/scandit/base/gl/EGLCore;->mConfig:Landroid/opengl/EGLConfig;

    .line 23
    sget-object v1, Landroid/opengl/EGL14;->EGL_NO_DISPLAY:Landroid/opengl/EGLDisplay;

    iput-object v1, p0, Lcom/scandit/base/gl/EGLCore;->mDisplay:Landroid/opengl/EGLDisplay;

    if-nez p1, :cond_0

    .line 30
    sget-object p1, Landroid/opengl/EGL14;->EGL_NO_CONTEXT:Landroid/opengl/EGLContext;

    :cond_0
    const/4 v1, 0x0

    .line 32
    invoke-static {v1}, Landroid/opengl/EGL14;->eglGetDisplay(I)Landroid/opengl/EGLDisplay;

    move-result-object v2

    iput-object v2, p0, Lcom/scandit/base/gl/EGLCore;->mDisplay:Landroid/opengl/EGLDisplay;

    .line 33
    iget-object v2, p0, Lcom/scandit/base/gl/EGLCore;->mDisplay:Landroid/opengl/EGLDisplay;

    sget-object v3, Landroid/opengl/EGL14;->EGL_NO_DISPLAY:Landroid/opengl/EGLDisplay;

    if-eq v2, v3, :cond_3

    const/4 v2, 0x2

    .line 36
    new-array v3, v2, [I

    .line 37
    iget-object v4, p0, Lcom/scandit/base/gl/EGLCore;->mDisplay:Landroid/opengl/EGLDisplay;

    const/4 v5, 0x1

    invoke-static {v4, v3, v1, v3, v5}, Landroid/opengl/EGL14;->eglInitialize(Landroid/opengl/EGLDisplay;[II[II)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 44
    invoke-direct {p0, p2, v2}, Lcom/scandit/base/gl/EGLCore;->getConfig(II)Landroid/opengl/EGLConfig;

    move-result-object p2

    if-eqz p2, :cond_1

    const/4 v0, 0x3

    .line 48
    new-array v0, v0, [I

    fill-array-data v0, :array_0

    .line 52
    iget-object v2, p0, Lcom/scandit/base/gl/EGLCore;->mDisplay:Landroid/opengl/EGLDisplay;

    invoke-static {v2, p2, p1, v0, v1}, Landroid/opengl/EGL14;->eglCreateContext(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLConfig;Landroid/opengl/EGLContext;[II)Landroid/opengl/EGLContext;

    move-result-object p1

    const-string v0, "eglCreateContext"

    .line 54
    invoke-direct {p0, v0}, Lcom/scandit/base/gl/EGLCore;->checkEglError(Ljava/lang/String;)V

    .line 55
    iput-object p2, p0, Lcom/scandit/base/gl/EGLCore;->mConfig:Landroid/opengl/EGLConfig;

    .line 56
    iput-object p1, p0, Lcom/scandit/base/gl/EGLCore;->mContext:Landroid/opengl/EGLContext;

    .line 58
    new-array p1, v5, [I

    .line 59
    iget-object v0, p0, Lcom/scandit/base/gl/EGLCore;->mDisplay:Landroid/opengl/EGLDisplay;

    iget-object v2, p0, Lcom/scandit/base/gl/EGLCore;->mContext:Landroid/opengl/EGLContext;

    const/16 v3, 0x3098

    invoke-static {v0, v2, v3, p1, v1}, Landroid/opengl/EGL14;->eglQueryContext(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLContext;I[II)Z

    .line 63
    invoke-direct {p0, p2}, Lcom/scandit/base/gl/EGLCore;->printConfig(Landroid/opengl/EGLConfig;)V

    const-string p2, "EGL"

    .line 64
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "EGLContext created, client version "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    aget p1, p1, v1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    .line 46
    :cond_1
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "Unable to find a suitable EGLConfig"

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 38
    :cond_2
    iput-object v0, p0, Lcom/scandit/base/gl/EGLCore;->mDisplay:Landroid/opengl/EGLDisplay;

    .line 39
    new-instance p1, Ljava/lang/RuntimeException;

    const-string/jumbo p2, "unable to initialize EGL14"

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 34
    :cond_3
    new-instance p1, Ljava/lang/RuntimeException;

    const-string/jumbo p2, "unable to get EGL14 display"

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    nop

    :array_0
    .array-data 4
        0x3098
        0x3
        0x3038
    .end array-data
.end method

.method private checkEglError(Ljava/lang/String;)V
    .locals 3

    .line 142
    invoke-static {}, Landroid/opengl/EGL14;->eglGetError()I

    move-result v0

    const/16 v1, 0x3000

    if-ne v0, v1, :cond_0

    return-void

    .line 143
    :cond_0
    new-instance v1, Ljava/lang/RuntimeException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ": EGL error: 0x"

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method private getConfig(II)Landroid/opengl/EGLConfig;
    .locals 9

    const/16 p1, 0xf

    .line 92
    new-array v1, p1, [I

    fill-array-data v1, :array_0

    const/4 p1, 0x1

    .line 102
    new-array v8, p1, [Landroid/opengl/EGLConfig;

    .line 103
    new-array p1, p1, [I

    .line 104
    iget-object v0, p0, Lcom/scandit/base/gl/EGLCore;->mDisplay:Landroid/opengl/EGLDisplay;

    array-length v5, v8

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v7, 0x0

    move-object v3, v8

    move-object v6, p1

    invoke-static/range {v0 .. v7}, Landroid/opengl/EGL14;->eglChooseConfig(Landroid/opengl/EGLDisplay;[II[Landroid/opengl/EGLConfig;II[II)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const-string p1, "EGL"

    .line 106
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "unable to find RGB8888 / "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, " EGLConfig"

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-object v1

    :cond_0
    const/4 p2, 0x0

    .line 109
    aget v0, p1, p2

    if-nez v0, :cond_1

    return-object v1

    :cond_1
    const-string v0, "EGL"

    .line 112
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "num configs: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    aget v2, p1, p2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    move v0, p2

    .line 113
    :goto_0
    aget v1, p1, p2

    if-ge v0, v1, :cond_2

    .line 114
    aget-object v1, v8, v0

    invoke-direct {p0, v1}, Lcom/scandit/base/gl/EGLCore;->printConfig(Landroid/opengl/EGLConfig;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 116
    :cond_2
    aget-object p1, v8, p2

    return-object p1

    :array_0
    .array-data 4
        0x3025
        0x0
        0x3026
        0x0
        0x3024
        0x8
        0x3023
        0x8
        0x3022
        0x8
        0x3021
        0x0
        0x3040
        0x4
        0x3038
    .end array-data
.end method

.method private getConfigInt(Landroid/opengl/EGLConfig;I)I
    .locals 3

    const/4 v0, 0x1

    .line 119
    new-array v0, v0, [I

    .line 120
    iget-object v1, p0, Lcom/scandit/base/gl/EGLCore;->mDisplay:Landroid/opengl/EGLDisplay;

    const/4 v2, 0x0

    invoke-static {v1, p1, p2, v0, v2}, Landroid/opengl/EGL14;->eglGetConfigAttrib(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLConfig;I[II)Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, -0x1

    return p1

    .line 123
    :cond_0
    aget p1, v0, v2

    return p1
.end method

.method private printConfig(Landroid/opengl/EGLConfig;)V
    .locals 3

    const-string v0, "EGL"

    const-string v1, "--------------------------------------------------------------------"

    .line 127
    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    const-string v0, "EGL"

    .line 128
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "luminance size: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0x303d

    invoke-direct {p0, p1, v2}, Lcom/scandit/base/gl/EGLCore;->getConfigInt(Landroid/opengl/EGLConfig;I)I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    const-string v0, "EGL"

    .line 129
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "red size      : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0x3024

    invoke-direct {p0, p1, v2}, Lcom/scandit/base/gl/EGLCore;->getConfigInt(Landroid/opengl/EGLConfig;I)I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    const-string v0, "EGL"

    .line 130
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "blue size     : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0x3022

    invoke-direct {p0, p1, v2}, Lcom/scandit/base/gl/EGLCore;->getConfigInt(Landroid/opengl/EGLConfig;I)I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    const-string v0, "EGL"

    .line 131
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "green size    : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0x3023

    invoke-direct {p0, p1, v2}, Lcom/scandit/base/gl/EGLCore;->getConfigInt(Landroid/opengl/EGLConfig;I)I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    const-string v0, "EGL"

    .line 132
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "alpha size    : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0x3021

    invoke-direct {p0, p1, v2}, Lcom/scandit/base/gl/EGLCore;->getConfigInt(Landroid/opengl/EGLConfig;I)I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    const-string v0, "EGL"

    .line 133
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "depth size    : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0x3025

    invoke-direct {p0, p1, v2}, Lcom/scandit/base/gl/EGLCore;->getConfigInt(Landroid/opengl/EGLConfig;I)I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    const-string v0, "EGL"

    .line 134
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "stencil size  : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0x3026

    invoke-direct {p0, p1, v2}, Lcom/scandit/base/gl/EGLCore;->getConfigInt(Landroid/opengl/EGLConfig;I)I

    move-result p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method


# virtual methods
.method public createOffScreenSurface(II)Landroid/opengl/EGLSurface;
    .locals 3

    const/4 v0, 0x5

    .line 172
    new-array v0, v0, [I

    const/4 v1, 0x0

    const/16 v2, 0x3057

    aput v2, v0, v1

    const/4 v2, 0x1

    aput p1, v0, v2

    const/4 p1, 0x2

    const/16 v2, 0x3056

    aput v2, v0, p1

    const/4 p1, 0x3

    aput p2, v0, p1

    const/4 p1, 0x4

    const/16 p2, 0x3038

    aput p2, v0, p1

    .line 177
    iget-object p1, p0, Lcom/scandit/base/gl/EGLCore;->mDisplay:Landroid/opengl/EGLDisplay;

    iget-object p2, p0, Lcom/scandit/base/gl/EGLCore;->mConfig:Landroid/opengl/EGLConfig;

    invoke-static {p1, p2, v0, v1}, Landroid/opengl/EGL14;->eglCreatePbufferSurface(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLConfig;[II)Landroid/opengl/EGLSurface;

    move-result-object p1

    const-string p2, "eglCreatePbufferSurface"

    .line 179
    invoke-direct {p0, p2}, Lcom/scandit/base/gl/EGLCore;->checkEglError(Ljava/lang/String;)V

    if-eqz p1, :cond_0

    return-object p1

    .line 181
    :cond_0
    new-instance p1, Ljava/lang/RuntimeException;

    const-string/jumbo p2, "surface was null"

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public makeCurrent(Landroid/opengl/EGLSurface;)Z
    .locals 2

    .line 189
    iget-object v0, p0, Lcom/scandit/base/gl/EGLCore;->mDisplay:Landroid/opengl/EGLDisplay;

    sget-object v1, Landroid/opengl/EGL14;->EGL_NO_DISPLAY:Landroid/opengl/EGLDisplay;

    if-ne v0, v1, :cond_0

    const-string v0, "EGL"

    const-string v1, "NOTE: makeCurrent w/o display"

    .line 191
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 193
    :cond_0
    iget-object v0, p0, Lcom/scandit/base/gl/EGLCore;->mDisplay:Landroid/opengl/EGLDisplay;

    iget-object v1, p0, Lcom/scandit/base/gl/EGLCore;->mContext:Landroid/opengl/EGLContext;

    invoke-static {v0, p1, p1, v1}, Landroid/opengl/EGL14;->eglMakeCurrent(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLSurface;Landroid/opengl/EGLSurface;Landroid/opengl/EGLContext;)Z

    move-result p1

    if-nez p1, :cond_1

    const-string p1, "eglMakeCurrent"

    .line 194
    invoke-direct {p0, p1}, Lcom/scandit/base/gl/EGLCore;->checkEglError(Ljava/lang/String;)V

    const/4 p1, 0x0

    return p1

    :cond_1
    const/4 p1, 0x1

    return p1
.end method

.method public release()V
    .locals 4

    .line 153
    iget-object v0, p0, Lcom/scandit/base/gl/EGLCore;->mDisplay:Landroid/opengl/EGLDisplay;

    sget-object v1, Landroid/opengl/EGL14;->EGL_NO_DISPLAY:Landroid/opengl/EGLDisplay;

    if-eq v0, v1, :cond_0

    .line 156
    iget-object v0, p0, Lcom/scandit/base/gl/EGLCore;->mDisplay:Landroid/opengl/EGLDisplay;

    sget-object v1, Landroid/opengl/EGL14;->EGL_NO_SURFACE:Landroid/opengl/EGLSurface;

    sget-object v2, Landroid/opengl/EGL14;->EGL_NO_SURFACE:Landroid/opengl/EGLSurface;

    sget-object v3, Landroid/opengl/EGL14;->EGL_NO_CONTEXT:Landroid/opengl/EGLContext;

    invoke-static {v0, v1, v2, v3}, Landroid/opengl/EGL14;->eglMakeCurrent(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLSurface;Landroid/opengl/EGLSurface;Landroid/opengl/EGLContext;)Z

    .line 158
    iget-object v0, p0, Lcom/scandit/base/gl/EGLCore;->mDisplay:Landroid/opengl/EGLDisplay;

    iget-object v1, p0, Lcom/scandit/base/gl/EGLCore;->mContext:Landroid/opengl/EGLContext;

    invoke-static {v0, v1}, Landroid/opengl/EGL14;->eglDestroyContext(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLContext;)Z

    .line 159
    invoke-static {}, Landroid/opengl/EGL14;->eglReleaseThread()Z

    .line 160
    iget-object v0, p0, Lcom/scandit/base/gl/EGLCore;->mDisplay:Landroid/opengl/EGLDisplay;

    invoke-static {v0}, Landroid/opengl/EGL14;->eglTerminate(Landroid/opengl/EGLDisplay;)Z

    .line 163
    :cond_0
    sget-object v0, Landroid/opengl/EGL14;->EGL_NO_DISPLAY:Landroid/opengl/EGLDisplay;

    iput-object v0, p0, Lcom/scandit/base/gl/EGLCore;->mDisplay:Landroid/opengl/EGLDisplay;

    .line 164
    sget-object v0, Landroid/opengl/EGL14;->EGL_NO_CONTEXT:Landroid/opengl/EGLContext;

    iput-object v0, p0, Lcom/scandit/base/gl/EGLCore;->mContext:Landroid/opengl/EGLContext;

    const/4 v0, 0x0

    .line 165
    iput-object v0, p0, Lcom/scandit/base/gl/EGLCore;->mConfig:Landroid/opengl/EGLConfig;

    return-void
.end method
