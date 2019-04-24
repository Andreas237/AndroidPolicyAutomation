.class Lcom/scandit/base/camera/camera2/SbPostLollipopCamera$3;
.super Ljava/lang/Object;
.source "SbPostLollipopCamera.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;->setDisplayOrientation(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;

.field final synthetic val$context:Landroid/content/Context;


# direct methods
.method constructor <init>(Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;Landroid/content/Context;)V
    .locals 0

    .line 234
    iput-object p1, p0, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera$3;->this$0:Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;

    iput-object p2, p0, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera$3;->val$context:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 237
    iget-object v0, p0, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera$3;->this$0:Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;

    iget-object v1, p0, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera$3;->val$context:Landroid/content/Context;

    invoke-static {v0, v1}, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;->access$2100(Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;Landroid/content/Context;)V

    return-void
.end method
