.class Lcom/scandit/base/camera/camera2/SbPostLollipopCamera$4;
.super Ljava/lang/Object;
.source "SbPostLollipopCamera.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;->handleAutoFocusEventInternal(Lcom/scandit/base/camera/SbFocusEvent;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;

.field final synthetic val$event:Lcom/scandit/base/camera/SbFocusEvent;


# direct methods
.method constructor <init>(Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;Lcom/scandit/base/camera/SbFocusEvent;)V
    .locals 0

    .line 379
    iput-object p1, p0, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera$4;->this$0:Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;

    iput-object p2, p0, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera$4;->val$event:Lcom/scandit/base/camera/SbFocusEvent;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 382
    iget-object v0, p0, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera$4;->this$0:Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;

    iget-object v1, p0, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera$4;->val$event:Lcom/scandit/base/camera/SbFocusEvent;

    invoke-static {v0, v1}, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;->access$200(Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;Lcom/scandit/base/camera/SbFocusEvent;)V

    return-void
.end method
