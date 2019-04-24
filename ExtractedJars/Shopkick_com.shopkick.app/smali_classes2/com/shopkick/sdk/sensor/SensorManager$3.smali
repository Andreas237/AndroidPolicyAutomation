.class synthetic Lcom/shopkick/sdk/sensor/SensorManager$3;
.super Ljava/lang/Object;
.source "SensorManager.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/sdk/sensor/SensorManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1008
    name = null
.end annotation


# static fields
.field static final synthetic $SwitchMap$com$shopkick$sdk$sensor$LocationServicesSensor$PowerAndAccuracyProfile:[I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 360
    invoke-static {}, Lcom/shopkick/sdk/sensor/LocationServicesSensor$PowerAndAccuracyProfile;->values()[Lcom/shopkick/sdk/sensor/LocationServicesSensor$PowerAndAccuracyProfile;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    sput-object v0, Lcom/shopkick/sdk/sensor/SensorManager$3;->$SwitchMap$com$shopkick$sdk$sensor$LocationServicesSensor$PowerAndAccuracyProfile:[I

    :try_start_0
    sget-object v0, Lcom/shopkick/sdk/sensor/SensorManager$3;->$SwitchMap$com$shopkick$sdk$sensor$LocationServicesSensor$PowerAndAccuracyProfile:[I

    sget-object v1, Lcom/shopkick/sdk/sensor/LocationServicesSensor$PowerAndAccuracyProfile;->LOW:Lcom/shopkick/sdk/sensor/LocationServicesSensor$PowerAndAccuracyProfile;

    invoke-virtual {v1}, Lcom/shopkick/sdk/sensor/LocationServicesSensor$PowerAndAccuracyProfile;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    aput v2, v0, v1
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :try_start_1
    sget-object v0, Lcom/shopkick/sdk/sensor/SensorManager$3;->$SwitchMap$com$shopkick$sdk$sensor$LocationServicesSensor$PowerAndAccuracyProfile:[I

    sget-object v1, Lcom/shopkick/sdk/sensor/LocationServicesSensor$PowerAndAccuracyProfile;->MEDIUM:Lcom/shopkick/sdk/sensor/LocationServicesSensor$PowerAndAccuracyProfile;

    invoke-virtual {v1}, Lcom/shopkick/sdk/sensor/LocationServicesSensor$PowerAndAccuracyProfile;->ordinal()I

    move-result v1

    const/4 v2, 0x2

    aput v2, v0, v1
    :try_end_1
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    :try_start_2
    sget-object v0, Lcom/shopkick/sdk/sensor/SensorManager$3;->$SwitchMap$com$shopkick$sdk$sensor$LocationServicesSensor$PowerAndAccuracyProfile:[I

    sget-object v1, Lcom/shopkick/sdk/sensor/LocationServicesSensor$PowerAndAccuracyProfile;->HIGH:Lcom/shopkick/sdk/sensor/LocationServicesSensor$PowerAndAccuracyProfile;

    invoke-virtual {v1}, Lcom/shopkick/sdk/sensor/LocationServicesSensor$PowerAndAccuracyProfile;->ordinal()I

    move-result v1

    const/4 v2, 0x3

    aput v2, v0, v1
    :try_end_2
    .catch Ljava/lang/NoSuchFieldError; {:try_start_2 .. :try_end_2} :catch_2

    :catch_2
    return-void
.end method
