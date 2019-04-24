.class public final enum Lcom/scandit/base/camera/SbICamera$CameraFacing;
.super Ljava/lang/Enum;
.source "SbICamera.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/scandit/base/camera/SbICamera;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "CameraFacing"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/scandit/base/camera/SbICamera$CameraFacing;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/scandit/base/camera/SbICamera$CameraFacing;

.field public static final enum BACK:Lcom/scandit/base/camera/SbICamera$CameraFacing;

.field public static final enum FRONT:Lcom/scandit/base/camera/SbICamera$CameraFacing;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 84
    new-instance v0, Lcom/scandit/base/camera/SbICamera$CameraFacing;

    const-string v1, "BACK"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/scandit/base/camera/SbICamera$CameraFacing;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/scandit/base/camera/SbICamera$CameraFacing;->BACK:Lcom/scandit/base/camera/SbICamera$CameraFacing;

    new-instance v0, Lcom/scandit/base/camera/SbICamera$CameraFacing;

    const-string v1, "FRONT"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/scandit/base/camera/SbICamera$CameraFacing;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/scandit/base/camera/SbICamera$CameraFacing;->FRONT:Lcom/scandit/base/camera/SbICamera$CameraFacing;

    const/4 v0, 0x2

    .line 83
    new-array v0, v0, [Lcom/scandit/base/camera/SbICamera$CameraFacing;

    sget-object v1, Lcom/scandit/base/camera/SbICamera$CameraFacing;->BACK:Lcom/scandit/base/camera/SbICamera$CameraFacing;

    aput-object v1, v0, v2

    sget-object v1, Lcom/scandit/base/camera/SbICamera$CameraFacing;->FRONT:Lcom/scandit/base/camera/SbICamera$CameraFacing;

    aput-object v1, v0, v3

    sput-object v0, Lcom/scandit/base/camera/SbICamera$CameraFacing;->$VALUES:[Lcom/scandit/base/camera/SbICamera$CameraFacing;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 83
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/scandit/base/camera/SbICamera$CameraFacing;
    .locals 1

    .line 83
    const-class v0, Lcom/scandit/base/camera/SbICamera$CameraFacing;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/scandit/base/camera/SbICamera$CameraFacing;

    return-object p0
.end method

.method public static values()[Lcom/scandit/base/camera/SbICamera$CameraFacing;
    .locals 1

    .line 83
    sget-object v0, Lcom/scandit/base/camera/SbICamera$CameraFacing;->$VALUES:[Lcom/scandit/base/camera/SbICamera$CameraFacing;

    invoke-virtual {v0}, [Lcom/scandit/base/camera/SbICamera$CameraFacing;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/scandit/base/camera/SbICamera$CameraFacing;

    return-object v0
.end method
