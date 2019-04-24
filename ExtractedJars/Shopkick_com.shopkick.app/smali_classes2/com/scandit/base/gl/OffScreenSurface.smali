.class public Lcom/scandit/base/gl/OffScreenSurface;
.super Ljava/lang/Object;
.source "OffScreenSurface.java"


# instance fields
.field mCore:Lcom/scandit/base/gl/EGLCore;

.field mSurface:Landroid/opengl/EGLSurface;


# direct methods
.method public constructor <init>(Lcom/scandit/base/gl/EGLCore;II)V
    .locals 0

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    iput-object p1, p0, Lcom/scandit/base/gl/OffScreenSurface;->mCore:Lcom/scandit/base/gl/EGLCore;

    .line 25
    iget-object p1, p0, Lcom/scandit/base/gl/OffScreenSurface;->mCore:Lcom/scandit/base/gl/EGLCore;

    invoke-virtual {p1, p2, p3}, Lcom/scandit/base/gl/EGLCore;->createOffScreenSurface(II)Landroid/opengl/EGLSurface;

    move-result-object p1

    iput-object p1, p0, Lcom/scandit/base/gl/OffScreenSurface;->mSurface:Landroid/opengl/EGLSurface;

    return-void
.end method


# virtual methods
.method public makeCurrent()Z
    .locals 2

    .line 29
    iget-object v0, p0, Lcom/scandit/base/gl/OffScreenSurface;->mCore:Lcom/scandit/base/gl/EGLCore;

    iget-object v1, p0, Lcom/scandit/base/gl/OffScreenSurface;->mSurface:Landroid/opengl/EGLSurface;

    invoke-virtual {v0, v1}, Lcom/scandit/base/gl/EGLCore;->makeCurrent(Landroid/opengl/EGLSurface;)Z

    move-result v0

    return v0
.end method
