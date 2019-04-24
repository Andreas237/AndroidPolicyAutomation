.class Lcom/microblink/camera/hardware/camera/camera1/PhotoCamera1Manager$3;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/hardware/Camera$ShutterCallback;


# instance fields
.field final synthetic this$0:Lcom/microblink/camera/hardware/camera/camera1/PhotoCamera1Manager;


# direct methods
.method constructor <init>(Lcom/microblink/camera/hardware/camera/camera1/PhotoCamera1Manager;)V
    .locals 0

    iput-object p1, p0, Lcom/microblink/camera/hardware/camera/camera1/PhotoCamera1Manager$3;->this$0:Lcom/microblink/camera/hardware/camera/camera1/PhotoCamera1Manager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onShutter()V
    .locals 2

    const-string v0, "on shutter"

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p0, v0, v1}, Lcom/microblink/internal/Logger;->i(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method
