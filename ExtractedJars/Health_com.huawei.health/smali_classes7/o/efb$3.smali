.class Lo/efb$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/opengl/GLSurfaceView$Renderer;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/efb;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lo/efb;


# direct methods
.method constructor <init>(Lo/efb;)V
    .locals 0

    .line 75
    iput-object p1, p0, Lo/efb$3;->e:Lo/efb;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onDrawFrame(Ljavax/microedition/khronos/opengles/GL10;)V
    .locals 1

    .line 89
    iget-object v0, p0, Lo/efb$3;->e:Lo/efb;

    iget-object v0, v0, Lo/efb;->d:Lo/efd;

    invoke-virtual {v0}, Lo/efd;->i()V

    .line 90
    return-void
.end method

.method public onSurfaceChanged(Ljavax/microedition/khronos/opengles/GL10;II)V
    .locals 1

    .line 84
    iget-object v0, p0, Lo/efb$3;->e:Lo/efb;

    iget-object v0, v0, Lo/efb;->d:Lo/efd;

    invoke-virtual {v0, p2, p3}, Lo/efd;->d(II)V

    .line 85
    return-void
.end method

.method public onSurfaceCreated(Ljavax/microedition/khronos/opengles/GL10;Ljavax/microedition/khronos/egl/EGLConfig;)V
    .locals 1

    .line 79
    iget-object v0, p0, Lo/efb$3;->e:Lo/efb;

    iget-object v0, v0, Lo/efb;->d:Lo/efd;

    invoke-virtual {v0}, Lo/efd;->f()V

    .line 80
    return-void
.end method
