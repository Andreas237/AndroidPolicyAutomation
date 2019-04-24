.class Lcom/scandit/base/camera/camera2/SbCamera2$3;
.super Ljava/lang/Object;
.source "SbCamera2.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/scandit/base/camera/camera2/SbCamera2;->setViewAsync(Lcom/scandit/base/camera/SbTextureViewPreview;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/scandit/base/camera/camera2/SbCamera2;

.field final synthetic val$view:Lcom/scandit/base/camera/SbTextureViewPreview;


# direct methods
.method constructor <init>(Lcom/scandit/base/camera/camera2/SbCamera2;Lcom/scandit/base/camera/SbTextureViewPreview;)V
    .locals 0

    .line 412
    iput-object p1, p0, Lcom/scandit/base/camera/camera2/SbCamera2$3;->this$0:Lcom/scandit/base/camera/camera2/SbCamera2;

    iput-object p2, p0, Lcom/scandit/base/camera/camera2/SbCamera2$3;->val$view:Lcom/scandit/base/camera/SbTextureViewPreview;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 415
    iget-object v0, p0, Lcom/scandit/base/camera/camera2/SbCamera2$3;->this$0:Lcom/scandit/base/camera/camera2/SbCamera2;

    iget-object v1, p0, Lcom/scandit/base/camera/camera2/SbCamera2$3;->val$view:Lcom/scandit/base/camera/SbTextureViewPreview;

    invoke-static {v0, v1}, Lcom/scandit/base/camera/camera2/SbCamera2;->access$1302(Lcom/scandit/base/camera/camera2/SbCamera2;Lcom/scandit/base/camera/SbTextureViewPreview;)Lcom/scandit/base/camera/SbTextureViewPreview;

    .line 416
    iget-object v0, p0, Lcom/scandit/base/camera/camera2/SbCamera2$3;->this$0:Lcom/scandit/base/camera/camera2/SbCamera2;

    invoke-static {v0}, Lcom/scandit/base/camera/camera2/SbCamera2;->access$900(Lcom/scandit/base/camera/camera2/SbCamera2;)V

    return-void
.end method
