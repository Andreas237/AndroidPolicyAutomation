.class public Lcom/huawei/nfc/carrera/server/card/model/CaptureMethod;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final CAMERA_MODE:Ljava/lang/String; = "camera"

.field private static final MANUAL_MODE:Ljava/lang/String; = "manual"

.field private static MODE:Ljava/lang/String; = null

.field private static final UNKNOWL_MODE:Ljava/lang/String; = "unknow"


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 21
    const-string v0, "unknow"

    sput-object v0, Lcom/huawei/nfc/carrera/server/card/model/CaptureMethod;->MODE:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getMode()Ljava/lang/String;
    .locals 1

    .line 51
    sget-object v0, Lcom/huawei/nfc/carrera/server/card/model/CaptureMethod;->MODE:Ljava/lang/String;

    return-object v0
.end method

.method public static setCameraMode()V
    .locals 1

    .line 28
    const-string v0, "camera"

    sput-object v0, Lcom/huawei/nfc/carrera/server/card/model/CaptureMethod;->MODE:Ljava/lang/String;

    .line 29
    return-void
.end method

.method public static setMunalMode()V
    .locals 1

    .line 35
    const-string v0, "manual"

    sput-object v0, Lcom/huawei/nfc/carrera/server/card/model/CaptureMethod;->MODE:Ljava/lang/String;

    .line 36
    return-void
.end method

.method public static setUnKnownMode()V
    .locals 1

    .line 43
    const-string v0, "unknow"

    sput-object v0, Lcom/huawei/nfc/carrera/server/card/model/CaptureMethod;->MODE:Ljava/lang/String;

    .line 44
    return-void
.end method
