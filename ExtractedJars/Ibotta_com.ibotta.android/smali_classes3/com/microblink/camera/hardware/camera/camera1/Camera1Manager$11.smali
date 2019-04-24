.class Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$11;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic this$0:Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;

.field final synthetic val$areas:[Landroid/graphics/Rect;


# direct methods
.method constructor <init>(Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;[Landroid/graphics/Rect;)V
    .locals 0

    iput-object p1, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$11;->this$0:Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;

    iput-object p2, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$11;->val$areas:[Landroid/graphics/Rect;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$11;->this$0:Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;

    invoke-static {v0}, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->access$000(Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;)Lcom/microblink/camera/hardware/camera/camera1/focus/IFocusManager;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$11;->val$areas:[Landroid/graphics/Rect;

    invoke-interface {v0, v1}, Lcom/microblink/camera/hardware/camera/camera1/focus/IFocusManager;->setMeteringAreas([Landroid/graphics/Rect;)V

    :cond_0
    return-void
.end method
