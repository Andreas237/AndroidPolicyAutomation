.class public Lcom/shopkick/sdk/sensor/SensorStatusError;
.super Ljava/lang/Object;
.source "SensorStatusError.java"


# static fields
.field private static final BLUETOOTH_ERROR_TYPE:I = 0x2

.field public static final BLUETOOTH_OFF:Lcom/shopkick/sdk/sensor/SensorStatusError;

.field public static final BLUETOOTH_UNAVAILABLE:Lcom/shopkick/sdk/sensor/SensorStatusError;

.field private static final GENERAL_ERROR_TYPE:I = 0x4

.field private static final GEOFENCE_ERROR_TYPE:I = 0x1

.field public static final GOOGLE_PLAY_SERVICES_CONNECTION_FAILED:Lcom/shopkick/sdk/sensor/SensorStatusError;

.field private static final LOCATION_ERROR_TYPE:I = 0x3

.field public static final PERMISSION_DENIED_COARSE_LOCATION:Lcom/shopkick/sdk/sensor/SensorStatusError;

.field public static final PERMISSION_DENIED_FINE_LOCATION:Lcom/shopkick/sdk/sensor/SensorStatusError;

.field public static final PERMISSION_DENIED_LOCATION:Lcom/shopkick/sdk/sensor/SensorStatusError;

.field public static final UNKNOWN_FAILURE:Lcom/shopkick/sdk/sensor/SensorStatusError;

.field private static final WIFI_ERROR_TYPE:I = 0x5

.field public static final WIFI_OFF:Lcom/shopkick/sdk/sensor/SensorStatusError;

.field public static final WIFI_UNAVAILABLE:Lcom/shopkick/sdk/sensor/SensorStatusError;


# instance fields
.field final errorCode:I

.field final errorMessage:Ljava/lang/String;

.field final errorType:I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 18
    new-instance v0, Lcom/shopkick/sdk/sensor/SensorStatusError;

    const-string v1, "WiFi is off"

    const/4 v2, 0x5

    const/16 v3, 0x1f4

    invoke-direct {v0, v2, v3, v1}, Lcom/shopkick/sdk/sensor/SensorStatusError;-><init>(IILjava/lang/String;)V

    sput-object v0, Lcom/shopkick/sdk/sensor/SensorStatusError;->WIFI_OFF:Lcom/shopkick/sdk/sensor/SensorStatusError;

    .line 23
    new-instance v0, Lcom/shopkick/sdk/sensor/SensorStatusError;

    const-string v1, "WiFi unavailable"

    const/16 v3, 0x1f5

    invoke-direct {v0, v2, v3, v1}, Lcom/shopkick/sdk/sensor/SensorStatusError;-><init>(IILjava/lang/String;)V

    sput-object v0, Lcom/shopkick/sdk/sensor/SensorStatusError;->WIFI_UNAVAILABLE:Lcom/shopkick/sdk/sensor/SensorStatusError;

    .line 28
    new-instance v0, Lcom/shopkick/sdk/sensor/SensorStatusError;

    const-string v1, "Unknown failure"

    const/4 v2, 0x4

    const/16 v3, 0x190

    invoke-direct {v0, v2, v3, v1}, Lcom/shopkick/sdk/sensor/SensorStatusError;-><init>(IILjava/lang/String;)V

    sput-object v0, Lcom/shopkick/sdk/sensor/SensorStatusError;->UNKNOWN_FAILURE:Lcom/shopkick/sdk/sensor/SensorStatusError;

    .line 33
    new-instance v0, Lcom/shopkick/sdk/sensor/SensorStatusError;

    const-string v1, "Bluetooth is off"

    const/4 v2, 0x2

    const/16 v3, 0xc8

    invoke-direct {v0, v2, v3, v1}, Lcom/shopkick/sdk/sensor/SensorStatusError;-><init>(IILjava/lang/String;)V

    sput-object v0, Lcom/shopkick/sdk/sensor/SensorStatusError;->BLUETOOTH_OFF:Lcom/shopkick/sdk/sensor/SensorStatusError;

    .line 38
    new-instance v0, Lcom/shopkick/sdk/sensor/SensorStatusError;

    const-string v1, "Bluetooth unavailable"

    const/16 v3, 0xc9

    invoke-direct {v0, v2, v3, v1}, Lcom/shopkick/sdk/sensor/SensorStatusError;-><init>(IILjava/lang/String;)V

    sput-object v0, Lcom/shopkick/sdk/sensor/SensorStatusError;->BLUETOOTH_UNAVAILABLE:Lcom/shopkick/sdk/sensor/SensorStatusError;

    .line 43
    new-instance v0, Lcom/shopkick/sdk/sensor/SensorStatusError;

    const-string v1, "ACCESS_FINE_LOCATION permission denied"

    const/4 v2, 0x1

    const/16 v3, 0x64

    invoke-direct {v0, v2, v3, v1}, Lcom/shopkick/sdk/sensor/SensorStatusError;-><init>(IILjava/lang/String;)V

    sput-object v0, Lcom/shopkick/sdk/sensor/SensorStatusError;->PERMISSION_DENIED_FINE_LOCATION:Lcom/shopkick/sdk/sensor/SensorStatusError;

    .line 48
    new-instance v0, Lcom/shopkick/sdk/sensor/SensorStatusError;

    const-string v1, "ACCESS_COARSE_LOCATION permission denied"

    const/4 v2, 0x3

    const/16 v3, 0x65

    invoke-direct {v0, v2, v3, v1}, Lcom/shopkick/sdk/sensor/SensorStatusError;-><init>(IILjava/lang/String;)V

    sput-object v0, Lcom/shopkick/sdk/sensor/SensorStatusError;->PERMISSION_DENIED_COARSE_LOCATION:Lcom/shopkick/sdk/sensor/SensorStatusError;

    .line 53
    new-instance v0, Lcom/shopkick/sdk/sensor/SensorStatusError;

    const-string v1, "ACCESS_COARSE_LOCATION and ACCESS_FINE_LOCATION permissions denied"

    const/16 v3, 0x67

    invoke-direct {v0, v2, v3, v1}, Lcom/shopkick/sdk/sensor/SensorStatusError;-><init>(IILjava/lang/String;)V

    sput-object v0, Lcom/shopkick/sdk/sensor/SensorStatusError;->PERMISSION_DENIED_LOCATION:Lcom/shopkick/sdk/sensor/SensorStatusError;

    .line 58
    new-instance v0, Lcom/shopkick/sdk/sensor/SensorStatusError;

    const-string v1, "Connecting to Google Play Services failed"

    const/16 v3, 0x12c

    invoke-direct {v0, v2, v3, v1}, Lcom/shopkick/sdk/sensor/SensorStatusError;-><init>(IILjava/lang/String;)V

    sput-object v0, Lcom/shopkick/sdk/sensor/SensorStatusError;->GOOGLE_PLAY_SERVICES_CONNECTION_FAILED:Lcom/shopkick/sdk/sensor/SensorStatusError;

    return-void
.end method

.method private constructor <init>(IILjava/lang/String;)V
    .locals 0

    .line 76
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 77
    iput p1, p0, Lcom/shopkick/sdk/sensor/SensorStatusError;->errorType:I

    .line 78
    iput p2, p0, Lcom/shopkick/sdk/sensor/SensorStatusError;->errorCode:I

    .line 79
    iput-object p3, p0, Lcom/shopkick/sdk/sensor/SensorStatusError;->errorMessage:Ljava/lang/String;

    return-void
.end method

.method public static geoSensorError(I)Lcom/shopkick/sdk/sensor/SensorStatusError;
    .locals 3

    .line 69
    new-instance v0, Lcom/shopkick/sdk/sensor/SensorStatusError;

    const-string v1, "Geofence error"

    const/4 v2, 0x1

    invoke-direct {v0, v2, p0, v1}, Lcom/shopkick/sdk/sensor/SensorStatusError;-><init>(IILjava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_3

    .line 110
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_1

    .line 112
    :cond_1
    check-cast p1, Lcom/shopkick/sdk/sensor/SensorStatusError;

    .line 114
    iget v2, p0, Lcom/shopkick/sdk/sensor/SensorStatusError;->errorCode:I

    iget p1, p1, Lcom/shopkick/sdk/sensor/SensorStatusError;->errorCode:I

    if-ne v2, p1, :cond_2

    goto :goto_0

    :cond_2
    move v0, v1

    :goto_0
    return v0

    :cond_3
    :goto_1
    return v1
.end method

.method public getErrorCode()I
    .locals 1

    .line 99
    iget v0, p0, Lcom/shopkick/sdk/sensor/SensorStatusError;->errorCode:I

    return v0
.end method

.method public getErrorType()I
    .locals 1

    .line 90
    iget v0, p0, Lcom/shopkick/sdk/sensor/SensorStatusError;->errorType:I

    return v0
.end method

.method public hashCode()I
    .locals 1

    .line 120
    iget v0, p0, Lcom/shopkick/sdk/sensor/SensorStatusError;->errorCode:I

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 104
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/shopkick/sdk/sensor/SensorStatusError;->errorMessage:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " ("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/shopkick/sdk/sensor/SensorStatusError;->errorCode:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
