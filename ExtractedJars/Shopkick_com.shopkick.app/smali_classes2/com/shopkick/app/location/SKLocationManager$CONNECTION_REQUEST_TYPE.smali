.class public final enum Lcom/shopkick/app/location/SKLocationManager$CONNECTION_REQUEST_TYPE;
.super Ljava/lang/Enum;
.source "SKLocationManager.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/location/SKLocationManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "CONNECTION_REQUEST_TYPE"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/shopkick/app/location/SKLocationManager$CONNECTION_REQUEST_TYPE;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/shopkick/app/location/SKLocationManager$CONNECTION_REQUEST_TYPE;

.field public static final enum ADD_GEOFENCES:Lcom/shopkick/app/location/SKLocationManager$CONNECTION_REQUEST_TYPE;

.field public static final enum RESET_GEOFENCES:Lcom/shopkick/app/location/SKLocationManager$CONNECTION_REQUEST_TYPE;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 51
    new-instance v0, Lcom/shopkick/app/location/SKLocationManager$CONNECTION_REQUEST_TYPE;

    const-string v1, "ADD_GEOFENCES"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/shopkick/app/location/SKLocationManager$CONNECTION_REQUEST_TYPE;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/app/location/SKLocationManager$CONNECTION_REQUEST_TYPE;->ADD_GEOFENCES:Lcom/shopkick/app/location/SKLocationManager$CONNECTION_REQUEST_TYPE;

    .line 52
    new-instance v0, Lcom/shopkick/app/location/SKLocationManager$CONNECTION_REQUEST_TYPE;

    const-string v1, "RESET_GEOFENCES"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/shopkick/app/location/SKLocationManager$CONNECTION_REQUEST_TYPE;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/app/location/SKLocationManager$CONNECTION_REQUEST_TYPE;->RESET_GEOFENCES:Lcom/shopkick/app/location/SKLocationManager$CONNECTION_REQUEST_TYPE;

    const/4 v0, 0x2

    .line 50
    new-array v0, v0, [Lcom/shopkick/app/location/SKLocationManager$CONNECTION_REQUEST_TYPE;

    sget-object v1, Lcom/shopkick/app/location/SKLocationManager$CONNECTION_REQUEST_TYPE;->ADD_GEOFENCES:Lcom/shopkick/app/location/SKLocationManager$CONNECTION_REQUEST_TYPE;

    aput-object v1, v0, v2

    sget-object v1, Lcom/shopkick/app/location/SKLocationManager$CONNECTION_REQUEST_TYPE;->RESET_GEOFENCES:Lcom/shopkick/app/location/SKLocationManager$CONNECTION_REQUEST_TYPE;

    aput-object v1, v0, v3

    sput-object v0, Lcom/shopkick/app/location/SKLocationManager$CONNECTION_REQUEST_TYPE;->$VALUES:[Lcom/shopkick/app/location/SKLocationManager$CONNECTION_REQUEST_TYPE;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 50
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/shopkick/app/location/SKLocationManager$CONNECTION_REQUEST_TYPE;
    .locals 1

    .line 50
    const-class v0, Lcom/shopkick/app/location/SKLocationManager$CONNECTION_REQUEST_TYPE;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/shopkick/app/location/SKLocationManager$CONNECTION_REQUEST_TYPE;

    return-object p0
.end method

.method public static values()[Lcom/shopkick/app/location/SKLocationManager$CONNECTION_REQUEST_TYPE;
    .locals 1

    .line 50
    sget-object v0, Lcom/shopkick/app/location/SKLocationManager$CONNECTION_REQUEST_TYPE;->$VALUES:[Lcom/shopkick/app/location/SKLocationManager$CONNECTION_REQUEST_TYPE;

    invoke-virtual {v0}, [Lcom/shopkick/app/location/SKLocationManager$CONNECTION_REQUEST_TYPE;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/shopkick/app/location/SKLocationManager$CONNECTION_REQUEST_TYPE;

    return-object v0
.end method
