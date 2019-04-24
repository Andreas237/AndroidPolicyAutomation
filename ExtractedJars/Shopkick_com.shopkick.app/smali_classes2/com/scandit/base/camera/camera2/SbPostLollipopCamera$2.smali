.class Lcom/scandit/base/camera/camera2/SbPostLollipopCamera$2;
.super Ljava/lang/Object;
.source "SbPostLollipopCamera.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;->doContinuousFocus()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;


# direct methods
.method constructor <init>(Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;)V
    .locals 0

    .line 175
    iput-object p1, p0, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera$2;->this$0:Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 178
    iget-object v0, p0, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera$2;->this$0:Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;->access$2002(Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;Z)Z

    return-void
.end method
