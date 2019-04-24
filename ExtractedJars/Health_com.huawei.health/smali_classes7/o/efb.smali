.class public Lo/efb;
.super Landroid/opengl/GLSurfaceView;
.source "SourceFile"


# instance fields
.field private b:Landroid/opengl/GLSurfaceView$EGLConfigChooser;

.field protected d:Lo/efd;

.field private e:Landroid/opengl/GLSurfaceView$Renderer;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 28
    invoke-direct {p0, p1}, Landroid/opengl/GLSurfaceView;-><init>(Landroid/content/Context;)V

    .line 75
    new-instance v0, Lo/efb$3;

    invoke-direct {v0, p0}, Lo/efb$3;-><init>(Lo/efb;)V

    iput-object v0, p0, Lo/efb;->e:Landroid/opengl/GLSurfaceView$Renderer;

    .line 29
    invoke-direct {p0, p1}, Lo/efb;->d(Landroid/content/Context;)V

    .line 30
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 33
    invoke-direct {p0, p1, p2}, Landroid/opengl/GLSurfaceView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 75
    new-instance v0, Lo/efb$3;

    invoke-direct {v0, p0}, Lo/efb$3;-><init>(Lo/efb;)V

    iput-object v0, p0, Lo/efb;->e:Landroid/opengl/GLSurfaceView$Renderer;

    .line 34
    invoke-direct {p0, p1}, Lo/efb;->d(Landroid/content/Context;)V

    .line 35
    return-void
.end method

.method private d(Landroid/content/Context;)V
    .locals 2

    .line 38
    new-instance v0, Lo/efd;

    invoke-direct {v0, p1}, Lo/efd;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/efb;->d:Lo/efd;

    .line 39
    iget-object v0, p0, Lo/efb;->d:Lo/efd;

    new-instance v1, Lo/efb$2;

    invoke-direct {v1, p0}, Lo/efb$2;-><init>(Lo/efb;)V

    invoke-virtual {v0, v1}, Lo/efd;->d(Lo/efi$b;)V

    .line 45
    const/4 v0, 0x2

    invoke-virtual {p0, v0}, Lo/efb;->setEGLContextClientVersion(I)V

    .line 46
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xb

    if-lt v0, v1, :cond_0

    .line 47
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lo/efb;->setPreserveEGLContextOnPause(Z)V

    .line 49
    :cond_0
    return-void
.end method


# virtual methods
.method public b()V
    .locals 1

    .line 112
    iget-object v0, p0, Lo/efb;->e:Landroid/opengl/GLSurfaceView$Renderer;

    if-eqz v0, :cond_0

    .line 113
    const/4 v0, 0x0

    iput-object v0, p0, Lo/efb;->e:Landroid/opengl/GLSurfaceView$Renderer;

    .line 115
    :cond_0
    iget-object v0, p0, Lo/efb;->d:Lo/efd;

    if-eqz v0, :cond_1

    .line 116
    iget-object v0, p0, Lo/efb;->d:Lo/efd;

    invoke-virtual {v0}, Lo/efd;->c()V

    .line 117
    invoke-super {p0}, Landroid/opengl/GLSurfaceView;->onDetachedFromWindow()V

    .line 118
    const/4 v0, 0x0

    iput-object v0, p0, Lo/efb;->d:Lo/efd;

    .line 120
    :cond_1
    return-void
.end method

.method public d()V
    .locals 1

    .line 58
    iget-object v0, p0, Lo/efb;->b:Landroid/opengl/GLSurfaceView$EGLConfigChooser;

    if-nez v0, :cond_0

    .line 59
    new-instance v0, Lo/efp;

    invoke-direct {v0}, Lo/efp;-><init>()V

    iput-object v0, p0, Lo/efb;->b:Landroid/opengl/GLSurfaceView$EGLConfigChooser;

    .line 61
    :cond_0
    iget-object v0, p0, Lo/efb;->e:Landroid/opengl/GLSurfaceView$Renderer;

    invoke-virtual {p0, v0}, Lo/efb;->setRenderer(Landroid/opengl/GLSurfaceView$Renderer;)V

    .line 62
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lo/efb;->setRenderMode(I)V

    .line 63
    return-void
.end method

.method public getStage()Lo/efd;
    .locals 1

    .line 71
    iget-object v0, p0, Lo/efb;->d:Lo/efd;

    return-object v0
.end method

.method protected onDetachedFromWindow()V
    .locals 0

    .line 107
    invoke-super {p0}, Landroid/opengl/GLSurfaceView;->onDetachedFromWindow()V

    .line 108
    invoke-virtual {p0}, Lo/efb;->b()V

    .line 109
    return-void
.end method

.method public onPause()V
    .locals 1

    .line 95
    invoke-super {p0}, Landroid/opengl/GLSurfaceView;->onPause()V

    .line 96
    iget-object v0, p0, Lo/efb;->d:Lo/efd;

    invoke-virtual {v0}, Lo/efd;->b()V

    .line 97
    return-void
.end method

.method public onResume()V
    .locals 1

    .line 101
    invoke-super {p0}, Landroid/opengl/GLSurfaceView;->onResume()V

    .line 102
    iget-object v0, p0, Lo/efb;->d:Lo/efd;

    invoke-virtual {v0}, Lo/efd;->a()V

    .line 103
    return-void
.end method

.method public setEGLConfigChooser(Landroid/opengl/GLSurfaceView$EGLConfigChooser;)V
    .locals 0

    .line 53
    invoke-super {p0, p1}, Landroid/opengl/GLSurfaceView;->setEGLConfigChooser(Landroid/opengl/GLSurfaceView$EGLConfigChooser;)V

    .line 54
    iput-object p1, p0, Lo/efb;->b:Landroid/opengl/GLSurfaceView$EGLConfigChooser;

    .line 55
    return-void
.end method

.method public setRenderMode(I)V
    .locals 0

    .line 67
    invoke-super {p0, p1}, Landroid/opengl/GLSurfaceView;->setRenderMode(I)V

    .line 68
    return-void
.end method

.method public setTranslucent()V
    .locals 7

    .line 123
    move-object v0, p0

    const/16 v1, 0x8

    const/16 v2, 0x8

    const/16 v3, 0x8

    const/16 v4, 0x8

    const/16 v5, 0x10

    const/4 v6, 0x0

    invoke-virtual/range {v0 .. v6}, Lo/efb;->setEGLConfigChooser(IIIIII)V

    .line 124
    invoke-virtual {p0}, Lo/efb;->getHolder()Landroid/view/SurfaceHolder;

    move-result-object v0

    const/4 v1, -0x3

    invoke-interface {v0, v1}, Landroid/view/SurfaceHolder;->setFormat(I)V

    .line 125
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lo/efb;->setZOrderOnTop(Z)V

    .line 126
    return-void
.end method

.method public setTranslucent(Landroid/opengl/GLSurfaceView$EGLConfigChooser;)V
    .locals 2

    .line 129
    invoke-virtual {p0, p1}, Lo/efb;->setEGLConfigChooser(Landroid/opengl/GLSurfaceView$EGLConfigChooser;)V

    .line 130
    invoke-virtual {p0}, Lo/efb;->getHolder()Landroid/view/SurfaceHolder;

    move-result-object v0

    const/4 v1, -0x3

    invoke-interface {v0, v1}, Landroid/view/SurfaceHolder;->setFormat(I)V

    .line 131
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lo/efb;->setZOrderOnTop(Z)V

    .line 132
    return-void
.end method
