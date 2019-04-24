.class public final enum Lcom/microblink/camera/view/BaseCameraView$CameraViewState;
.super Ljava/lang/Enum;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/microblink/camera/view/BaseCameraView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "CameraViewState"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/microblink/camera/view/BaseCameraView$CameraViewState;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/microblink/camera/view/BaseCameraView$CameraViewState;

.field public static final enum CREATED:Lcom/microblink/camera/view/BaseCameraView$CameraViewState;

.field public static final enum DESTROYED:Lcom/microblink/camera/view/BaseCameraView$CameraViewState;

.field public static final enum RESUMED:Lcom/microblink/camera/view/BaseCameraView$CameraViewState;

.field public static final enum STARTED:Lcom/microblink/camera/view/BaseCameraView$CameraViewState;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lcom/microblink/camera/view/BaseCameraView$CameraViewState;

    const-string v1, "DESTROYED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/microblink/camera/view/BaseCameraView$CameraViewState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/microblink/camera/view/BaseCameraView$CameraViewState;->DESTROYED:Lcom/microblink/camera/view/BaseCameraView$CameraViewState;

    new-instance v0, Lcom/microblink/camera/view/BaseCameraView$CameraViewState;

    const-string v1, "CREATED"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/microblink/camera/view/BaseCameraView$CameraViewState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/microblink/camera/view/BaseCameraView$CameraViewState;->CREATED:Lcom/microblink/camera/view/BaseCameraView$CameraViewState;

    new-instance v0, Lcom/microblink/camera/view/BaseCameraView$CameraViewState;

    const-string v1, "STARTED"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Lcom/microblink/camera/view/BaseCameraView$CameraViewState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/microblink/camera/view/BaseCameraView$CameraViewState;->STARTED:Lcom/microblink/camera/view/BaseCameraView$CameraViewState;

    new-instance v0, Lcom/microblink/camera/view/BaseCameraView$CameraViewState;

    const-string v1, "RESUMED"

    const/4 v5, 0x3

    invoke-direct {v0, v1, v5}, Lcom/microblink/camera/view/BaseCameraView$CameraViewState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/microblink/camera/view/BaseCameraView$CameraViewState;->RESUMED:Lcom/microblink/camera/view/BaseCameraView$CameraViewState;

    const/4 v0, 0x4

    new-array v0, v0, [Lcom/microblink/camera/view/BaseCameraView$CameraViewState;

    sget-object v1, Lcom/microblink/camera/view/BaseCameraView$CameraViewState;->DESTROYED:Lcom/microblink/camera/view/BaseCameraView$CameraViewState;

    aput-object v1, v0, v2

    sget-object v1, Lcom/microblink/camera/view/BaseCameraView$CameraViewState;->CREATED:Lcom/microblink/camera/view/BaseCameraView$CameraViewState;

    aput-object v1, v0, v3

    sget-object v1, Lcom/microblink/camera/view/BaseCameraView$CameraViewState;->STARTED:Lcom/microblink/camera/view/BaseCameraView$CameraViewState;

    aput-object v1, v0, v4

    sget-object v1, Lcom/microblink/camera/view/BaseCameraView$CameraViewState;->RESUMED:Lcom/microblink/camera/view/BaseCameraView$CameraViewState;

    aput-object v1, v0, v5

    sput-object v0, Lcom/microblink/camera/view/BaseCameraView$CameraViewState;->$VALUES:[Lcom/microblink/camera/view/BaseCameraView$CameraViewState;

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

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/microblink/camera/view/BaseCameraView$CameraViewState;
    .locals 1

    const-class v0, Lcom/microblink/camera/view/BaseCameraView$CameraViewState;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/microblink/camera/view/BaseCameraView$CameraViewState;

    return-object p0
.end method

.method public static values()[Lcom/microblink/camera/view/BaseCameraView$CameraViewState;
    .locals 1

    sget-object v0, Lcom/microblink/camera/view/BaseCameraView$CameraViewState;->$VALUES:[Lcom/microblink/camera/view/BaseCameraView$CameraViewState;

    invoke-virtual {v0}, [Lcom/microblink/camera/view/BaseCameraView$CameraViewState;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/microblink/camera/view/BaseCameraView$CameraViewState;

    return-object v0
.end method
