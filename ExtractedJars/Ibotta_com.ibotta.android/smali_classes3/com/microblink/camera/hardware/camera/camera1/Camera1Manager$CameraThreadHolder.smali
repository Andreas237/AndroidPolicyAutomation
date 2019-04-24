.class final enum Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$CameraThreadHolder;
.super Ljava/lang/Enum;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4018
    name = "CameraThreadHolder"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$CameraThreadHolder;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$CameraThreadHolder;

.field public static final enum INSTANCE:Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$CameraThreadHolder;


# instance fields
.field private mCameraQueue:Lcom/microblink/camera/util/IProcessingQueue;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$CameraThreadHolder;

    const-string v1, "INSTANCE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$CameraThreadHolder;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$CameraThreadHolder;->INSTANCE:Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$CameraThreadHolder;

    const/4 v0, 0x1

    new-array v0, v0, [Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$CameraThreadHolder;

    sget-object v1, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$CameraThreadHolder;->INSTANCE:Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$CameraThreadHolder;

    aput-object v1, v0, v2

    sput-object v0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$CameraThreadHolder;->$VALUES:[Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$CameraThreadHolder;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    new-instance p1, Lcom/microblink/camera/util/ProcessingQueue;

    const-string p2, "Camera1"

    invoke-direct {p1, p2}, Lcom/microblink/camera/util/ProcessingQueue;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/microblink/camera/util/ProcessingQueue;->start()V

    iput-object p1, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$CameraThreadHolder;->mCameraQueue:Lcom/microblink/camera/util/IProcessingQueue;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$CameraThreadHolder;
    .locals 1

    const-class v0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$CameraThreadHolder;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$CameraThreadHolder;

    return-object p0
.end method

.method public static values()[Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$CameraThreadHolder;
    .locals 1

    sget-object v0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$CameraThreadHolder;->$VALUES:[Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$CameraThreadHolder;

    invoke-virtual {v0}, [Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$CameraThreadHolder;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$CameraThreadHolder;

    return-object v0
.end method


# virtual methods
.method public final getCameraQueue()Lcom/microblink/camera/util/IProcessingQueue;
    .locals 1

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$CameraThreadHolder;->mCameraQueue:Lcom/microblink/camera/util/IProcessingQueue;

    return-object v0
.end method
