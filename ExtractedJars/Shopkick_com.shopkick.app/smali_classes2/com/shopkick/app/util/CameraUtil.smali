.class public Lcom/shopkick/app/util/CameraUtil;
.super Ljava/lang/Object;
.source "CameraUtil.java"


# static fields
.field private static final unsupportedCameras:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 19
    new-instance v0, Lcom/shopkick/app/util/CameraUtil$1;

    invoke-direct {v0}, Lcom/shopkick/app/util/CameraUtil$1;-><init>()V

    sput-object v0, Lcom/shopkick/app/util/CameraUtil;->unsupportedCameras:Ljava/util/HashSet;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static isDeviceCameraSupported()Z
    .locals 2

    .line 32
    sget-object v0, Lcom/shopkick/app/util/CameraUtil;->unsupportedCameras:Ljava/util/HashSet;

    sget-object v1, Landroid/os/Build;->MODEL:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method
