.class public final enum Lcom/shopkick/sdk/sensor/LocationServicesSensor$PowerAndAccuracyProfile;
.super Ljava/lang/Enum;
.source "LocationServicesSensor.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/sdk/sensor/LocationServicesSensor;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "PowerAndAccuracyProfile"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/shopkick/sdk/sensor/LocationServicesSensor$PowerAndAccuracyProfile;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/shopkick/sdk/sensor/LocationServicesSensor$PowerAndAccuracyProfile;

.field public static final enum HIGH:Lcom/shopkick/sdk/sensor/LocationServicesSensor$PowerAndAccuracyProfile;

.field public static final enum LOW:Lcom/shopkick/sdk/sensor/LocationServicesSensor$PowerAndAccuracyProfile;

.field public static final enum MEDIUM:Lcom/shopkick/sdk/sensor/LocationServicesSensor$PowerAndAccuracyProfile;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 20
    new-instance v0, Lcom/shopkick/sdk/sensor/LocationServicesSensor$PowerAndAccuracyProfile;

    const-string v1, "HIGH"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/shopkick/sdk/sensor/LocationServicesSensor$PowerAndAccuracyProfile;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/sdk/sensor/LocationServicesSensor$PowerAndAccuracyProfile;->HIGH:Lcom/shopkick/sdk/sensor/LocationServicesSensor$PowerAndAccuracyProfile;

    .line 26
    new-instance v0, Lcom/shopkick/sdk/sensor/LocationServicesSensor$PowerAndAccuracyProfile;

    const-string v1, "MEDIUM"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/shopkick/sdk/sensor/LocationServicesSensor$PowerAndAccuracyProfile;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/sdk/sensor/LocationServicesSensor$PowerAndAccuracyProfile;->MEDIUM:Lcom/shopkick/sdk/sensor/LocationServicesSensor$PowerAndAccuracyProfile;

    .line 32
    new-instance v0, Lcom/shopkick/sdk/sensor/LocationServicesSensor$PowerAndAccuracyProfile;

    const-string v1, "LOW"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Lcom/shopkick/sdk/sensor/LocationServicesSensor$PowerAndAccuracyProfile;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/sdk/sensor/LocationServicesSensor$PowerAndAccuracyProfile;->LOW:Lcom/shopkick/sdk/sensor/LocationServicesSensor$PowerAndAccuracyProfile;

    const/4 v0, 0x3

    .line 14
    new-array v0, v0, [Lcom/shopkick/sdk/sensor/LocationServicesSensor$PowerAndAccuracyProfile;

    sget-object v1, Lcom/shopkick/sdk/sensor/LocationServicesSensor$PowerAndAccuracyProfile;->HIGH:Lcom/shopkick/sdk/sensor/LocationServicesSensor$PowerAndAccuracyProfile;

    aput-object v1, v0, v2

    sget-object v1, Lcom/shopkick/sdk/sensor/LocationServicesSensor$PowerAndAccuracyProfile;->MEDIUM:Lcom/shopkick/sdk/sensor/LocationServicesSensor$PowerAndAccuracyProfile;

    aput-object v1, v0, v3

    sget-object v1, Lcom/shopkick/sdk/sensor/LocationServicesSensor$PowerAndAccuracyProfile;->LOW:Lcom/shopkick/sdk/sensor/LocationServicesSensor$PowerAndAccuracyProfile;

    aput-object v1, v0, v4

    sput-object v0, Lcom/shopkick/sdk/sensor/LocationServicesSensor$PowerAndAccuracyProfile;->$VALUES:[Lcom/shopkick/sdk/sensor/LocationServicesSensor$PowerAndAccuracyProfile;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 14
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/shopkick/sdk/sensor/LocationServicesSensor$PowerAndAccuracyProfile;
    .locals 1

    .line 14
    const-class v0, Lcom/shopkick/sdk/sensor/LocationServicesSensor$PowerAndAccuracyProfile;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/shopkick/sdk/sensor/LocationServicesSensor$PowerAndAccuracyProfile;

    return-object p0
.end method

.method public static values()[Lcom/shopkick/sdk/sensor/LocationServicesSensor$PowerAndAccuracyProfile;
    .locals 1

    .line 14
    sget-object v0, Lcom/shopkick/sdk/sensor/LocationServicesSensor$PowerAndAccuracyProfile;->$VALUES:[Lcom/shopkick/sdk/sensor/LocationServicesSensor$PowerAndAccuracyProfile;

    invoke-virtual {v0}, [Lcom/shopkick/sdk/sensor/LocationServicesSensor$PowerAndAccuracyProfile;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/shopkick/sdk/sensor/LocationServicesSensor$PowerAndAccuracyProfile;

    return-object v0
.end method
