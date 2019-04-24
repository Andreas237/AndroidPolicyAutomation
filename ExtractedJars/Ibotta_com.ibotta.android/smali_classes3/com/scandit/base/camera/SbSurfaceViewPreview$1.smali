.class Lcom/scandit/base/camera/SbSurfaceViewPreview$1;
.super Ljava/lang/Object;
.source "SbSurfaceViewPreview.java"

# interfaces
.implements Landroid/view/SurfaceHolder$Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/scandit/base/camera/SbSurfaceViewPreview;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/scandit/base/camera/SbSurfaceViewPreview;


# direct methods
.method constructor <init>(Lcom/scandit/base/camera/SbSurfaceViewPreview;)V
    .locals 0

    .line 22
    iput-object p1, p0, Lcom/scandit/base/camera/SbSurfaceViewPreview$1;->this$0:Lcom/scandit/base/camera/SbSurfaceViewPreview;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public surfaceChanged(Landroid/view/SurfaceHolder;III)V
    .locals 0

    .line 30
    iget-object p1, p0, Lcom/scandit/base/camera/SbSurfaceViewPreview$1;->this$0:Lcom/scandit/base/camera/SbSurfaceViewPreview;

    iget-object p1, p1, Lcom/scandit/base/camera/SbSurfaceViewPreview;->mCallback:Lcom/scandit/base/camera/SbIVideoPreview$Callback;

    iget-object p2, p0, Lcom/scandit/base/camera/SbSurfaceViewPreview$1;->this$0:Lcom/scandit/base/camera/SbSurfaceViewPreview;

    invoke-interface {p1, p2, p3, p4}, Lcom/scandit/base/camera/SbIVideoPreview$Callback;->changed(Lcom/scandit/base/camera/SbIVideoPreview;II)V

    return-void
.end method

.method public surfaceCreated(Landroid/view/SurfaceHolder;)V
    .locals 3

    .line 25
    iget-object p1, p0, Lcom/scandit/base/camera/SbSurfaceViewPreview$1;->this$0:Lcom/scandit/base/camera/SbSurfaceViewPreview;

    iget-object p1, p1, Lcom/scandit/base/camera/SbSurfaceViewPreview;->mCallback:Lcom/scandit/base/camera/SbIVideoPreview$Callback;

    iget-object v0, p0, Lcom/scandit/base/camera/SbSurfaceViewPreview$1;->this$0:Lcom/scandit/base/camera/SbSurfaceViewPreview;

    iget-object v1, v0, Lcom/scandit/base/camera/SbSurfaceViewPreview;->mView:Landroid/view/SurfaceView;

    invoke-virtual {v1}, Landroid/view/SurfaceView;->getWidth()I

    move-result v1

    iget-object v2, p0, Lcom/scandit/base/camera/SbSurfaceViewPreview$1;->this$0:Lcom/scandit/base/camera/SbSurfaceViewPreview;

    iget-object v2, v2, Lcom/scandit/base/camera/SbSurfaceViewPreview;->mView:Landroid/view/SurfaceView;

    invoke-virtual {v2}, Landroid/view/SurfaceView;->getHeight()I

    move-result v2

    invoke-interface {p1, v0, v1, v2}, Lcom/scandit/base/camera/SbIVideoPreview$Callback;->created(Lcom/scandit/base/camera/SbIVideoPreview;II)V

    return-void
.end method

.method public surfaceDestroyed(Landroid/view/SurfaceHolder;)V
    .locals 1

    .line 35
    iget-object p1, p0, Lcom/scandit/base/camera/SbSurfaceViewPreview$1;->this$0:Lcom/scandit/base/camera/SbSurfaceViewPreview;

    iget-object p1, p1, Lcom/scandit/base/camera/SbSurfaceViewPreview;->mCallback:Lcom/scandit/base/camera/SbIVideoPreview$Callback;

    iget-object v0, p0, Lcom/scandit/base/camera/SbSurfaceViewPreview$1;->this$0:Lcom/scandit/base/camera/SbSurfaceViewPreview;

    invoke-interface {p1, v0}, Lcom/scandit/base/camera/SbIVideoPreview$Callback;->destroyed(Lcom/scandit/base/camera/SbIVideoPreview;)V

    return-void
.end method
