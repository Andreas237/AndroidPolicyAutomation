.class public final enum Lcom/huawei/hihealth/device/open/HealthDevice$HEALTH_DEVICE_KIND;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hihealth/device/open/HealthDevice;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "HEALTH_DEVICE_KIND"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lcom/huawei/hihealth/device/open/HealthDevice$HEALTH_DEVICE_KIND;>;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/huawei/hihealth/device/open/HealthDevice$HEALTH_DEVICE_KIND;

.field public static final enum HDK_BLOOD_PRESSURE:Lcom/huawei/hihealth/device/open/HealthDevice$HEALTH_DEVICE_KIND;

.field public static final enum HDK_BLOOD_SUGAR:Lcom/huawei/hihealth/device/open/HealthDevice$HEALTH_DEVICE_KIND;

.field public static final enum HDK_ECG:Lcom/huawei/hihealth/device/open/HealthDevice$HEALTH_DEVICE_KIND;

.field public static final enum HDK_HEART_RATE:Lcom/huawei/hihealth/device/open/HealthDevice$HEALTH_DEVICE_KIND;

.field public static final enum HDK_HEIGHT:Lcom/huawei/hihealth/device/open/HealthDevice$HEALTH_DEVICE_KIND;

.field public static final enum HDK_STEPS:Lcom/huawei/hihealth/device/open/HealthDevice$HEALTH_DEVICE_KIND;

.field public static final enum HDK_UNKNOWN:Lcom/huawei/hihealth/device/open/HealthDevice$HEALTH_DEVICE_KIND;

.field public static final enum HDK_WEIGHT:Lcom/huawei/hihealth/device/open/HealthDevice$HEALTH_DEVICE_KIND;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 9
    new-instance v0, Lcom/huawei/hihealth/device/open/HealthDevice$HEALTH_DEVICE_KIND;

    const-string v1, "HDK_UNKNOWN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/huawei/hihealth/device/open/HealthDevice$HEALTH_DEVICE_KIND;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/huawei/hihealth/device/open/HealthDevice$HEALTH_DEVICE_KIND;->HDK_UNKNOWN:Lcom/huawei/hihealth/device/open/HealthDevice$HEALTH_DEVICE_KIND;

    .line 10
    new-instance v0, Lcom/huawei/hihealth/device/open/HealthDevice$HEALTH_DEVICE_KIND;

    const-string v1, "HDK_WEIGHT"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/huawei/hihealth/device/open/HealthDevice$HEALTH_DEVICE_KIND;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/huawei/hihealth/device/open/HealthDevice$HEALTH_DEVICE_KIND;->HDK_WEIGHT:Lcom/huawei/hihealth/device/open/HealthDevice$HEALTH_DEVICE_KIND;

    .line 11
    new-instance v0, Lcom/huawei/hihealth/device/open/HealthDevice$HEALTH_DEVICE_KIND;

    const-string v1, "HDK_HEIGHT"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/huawei/hihealth/device/open/HealthDevice$HEALTH_DEVICE_KIND;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/huawei/hihealth/device/open/HealthDevice$HEALTH_DEVICE_KIND;->HDK_HEIGHT:Lcom/huawei/hihealth/device/open/HealthDevice$HEALTH_DEVICE_KIND;

    .line 12
    new-instance v0, Lcom/huawei/hihealth/device/open/HealthDevice$HEALTH_DEVICE_KIND;

    const-string v1, "HDK_BLOOD_PRESSURE"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lcom/huawei/hihealth/device/open/HealthDevice$HEALTH_DEVICE_KIND;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/huawei/hihealth/device/open/HealthDevice$HEALTH_DEVICE_KIND;->HDK_BLOOD_PRESSURE:Lcom/huawei/hihealth/device/open/HealthDevice$HEALTH_DEVICE_KIND;

    .line 13
    new-instance v0, Lcom/huawei/hihealth/device/open/HealthDevice$HEALTH_DEVICE_KIND;

    const-string v1, "HDK_BLOOD_SUGAR"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lcom/huawei/hihealth/device/open/HealthDevice$HEALTH_DEVICE_KIND;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/huawei/hihealth/device/open/HealthDevice$HEALTH_DEVICE_KIND;->HDK_BLOOD_SUGAR:Lcom/huawei/hihealth/device/open/HealthDevice$HEALTH_DEVICE_KIND;

    .line 14
    new-instance v0, Lcom/huawei/hihealth/device/open/HealthDevice$HEALTH_DEVICE_KIND;

    const-string v1, "HDK_HEART_RATE"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lcom/huawei/hihealth/device/open/HealthDevice$HEALTH_DEVICE_KIND;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/huawei/hihealth/device/open/HealthDevice$HEALTH_DEVICE_KIND;->HDK_HEART_RATE:Lcom/huawei/hihealth/device/open/HealthDevice$HEALTH_DEVICE_KIND;

    .line 15
    new-instance v0, Lcom/huawei/hihealth/device/open/HealthDevice$HEALTH_DEVICE_KIND;

    const-string v1, "HDK_ECG"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lcom/huawei/hihealth/device/open/HealthDevice$HEALTH_DEVICE_KIND;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/huawei/hihealth/device/open/HealthDevice$HEALTH_DEVICE_KIND;->HDK_ECG:Lcom/huawei/hihealth/device/open/HealthDevice$HEALTH_DEVICE_KIND;

    .line 16
    new-instance v0, Lcom/huawei/hihealth/device/open/HealthDevice$HEALTH_DEVICE_KIND;

    const-string v1, "HDK_STEPS"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Lcom/huawei/hihealth/device/open/HealthDevice$HEALTH_DEVICE_KIND;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/huawei/hihealth/device/open/HealthDevice$HEALTH_DEVICE_KIND;->HDK_STEPS:Lcom/huawei/hihealth/device/open/HealthDevice$HEALTH_DEVICE_KIND;

    .line 8
    const/16 v0, 0x8

    new-array v0, v0, [Lcom/huawei/hihealth/device/open/HealthDevice$HEALTH_DEVICE_KIND;

    sget-object v1, Lcom/huawei/hihealth/device/open/HealthDevice$HEALTH_DEVICE_KIND;->HDK_UNKNOWN:Lcom/huawei/hihealth/device/open/HealthDevice$HEALTH_DEVICE_KIND;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lcom/huawei/hihealth/device/open/HealthDevice$HEALTH_DEVICE_KIND;->HDK_WEIGHT:Lcom/huawei/hihealth/device/open/HealthDevice$HEALTH_DEVICE_KIND;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lcom/huawei/hihealth/device/open/HealthDevice$HEALTH_DEVICE_KIND;->HDK_HEIGHT:Lcom/huawei/hihealth/device/open/HealthDevice$HEALTH_DEVICE_KIND;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lcom/huawei/hihealth/device/open/HealthDevice$HEALTH_DEVICE_KIND;->HDK_BLOOD_PRESSURE:Lcom/huawei/hihealth/device/open/HealthDevice$HEALTH_DEVICE_KIND;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Lcom/huawei/hihealth/device/open/HealthDevice$HEALTH_DEVICE_KIND;->HDK_BLOOD_SUGAR:Lcom/huawei/hihealth/device/open/HealthDevice$HEALTH_DEVICE_KIND;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sget-object v1, Lcom/huawei/hihealth/device/open/HealthDevice$HEALTH_DEVICE_KIND;->HDK_HEART_RATE:Lcom/huawei/hihealth/device/open/HealthDevice$HEALTH_DEVICE_KIND;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    sget-object v1, Lcom/huawei/hihealth/device/open/HealthDevice$HEALTH_DEVICE_KIND;->HDK_ECG:Lcom/huawei/hihealth/device/open/HealthDevice$HEALTH_DEVICE_KIND;

    const/4 v2, 0x6

    aput-object v1, v0, v2

    sget-object v1, Lcom/huawei/hihealth/device/open/HealthDevice$HEALTH_DEVICE_KIND;->HDK_STEPS:Lcom/huawei/hihealth/device/open/HealthDevice$HEALTH_DEVICE_KIND;

    const/4 v2, 0x7

    aput-object v1, v0, v2

    sput-object v0, Lcom/huawei/hihealth/device/open/HealthDevice$HEALTH_DEVICE_KIND;->$VALUES:[Lcom/huawei/hihealth/device/open/HealthDevice$HEALTH_DEVICE_KIND;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 8
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/huawei/hihealth/device/open/HealthDevice$HEALTH_DEVICE_KIND;
    .locals 1

    .line 8
    const-class v0, Lcom/huawei/hihealth/device/open/HealthDevice$HEALTH_DEVICE_KIND;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/device/open/HealthDevice$HEALTH_DEVICE_KIND;

    return-object v0
.end method

.method public static values()[Lcom/huawei/hihealth/device/open/HealthDevice$HEALTH_DEVICE_KIND;
    .locals 1

    .line 8
    sget-object v0, Lcom/huawei/hihealth/device/open/HealthDevice$HEALTH_DEVICE_KIND;->$VALUES:[Lcom/huawei/hihealth/device/open/HealthDevice$HEALTH_DEVICE_KIND;

    invoke-virtual {v0}, [Lcom/huawei/hihealth/device/open/HealthDevice$HEALTH_DEVICE_KIND;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/huawei/hihealth/device/open/HealthDevice$HEALTH_DEVICE_KIND;

    return-object v0
.end method
