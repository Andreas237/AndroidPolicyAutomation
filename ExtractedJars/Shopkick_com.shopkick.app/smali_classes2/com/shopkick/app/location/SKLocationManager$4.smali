.class synthetic Lcom/shopkick/app/location/SKLocationManager$4;
.super Ljava/lang/Object;
.source "SKLocationManager.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/location/SKLocationManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1008
    name = null
.end annotation


# static fields
.field static final synthetic $SwitchMap$com$shopkick$app$location$SKLocationManager$CONNECTION_REQUEST_TYPE:[I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 321
    invoke-static {}, Lcom/shopkick/app/location/SKLocationManager$CONNECTION_REQUEST_TYPE;->values()[Lcom/shopkick/app/location/SKLocationManager$CONNECTION_REQUEST_TYPE;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    sput-object v0, Lcom/shopkick/app/location/SKLocationManager$4;->$SwitchMap$com$shopkick$app$location$SKLocationManager$CONNECTION_REQUEST_TYPE:[I

    :try_start_0
    sget-object v0, Lcom/shopkick/app/location/SKLocationManager$4;->$SwitchMap$com$shopkick$app$location$SKLocationManager$CONNECTION_REQUEST_TYPE:[I

    sget-object v1, Lcom/shopkick/app/location/SKLocationManager$CONNECTION_REQUEST_TYPE;->ADD_GEOFENCES:Lcom/shopkick/app/location/SKLocationManager$CONNECTION_REQUEST_TYPE;

    invoke-virtual {v1}, Lcom/shopkick/app/location/SKLocationManager$CONNECTION_REQUEST_TYPE;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    aput v2, v0, v1
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :try_start_1
    sget-object v0, Lcom/shopkick/app/location/SKLocationManager$4;->$SwitchMap$com$shopkick$app$location$SKLocationManager$CONNECTION_REQUEST_TYPE:[I

    sget-object v1, Lcom/shopkick/app/location/SKLocationManager$CONNECTION_REQUEST_TYPE;->RESET_GEOFENCES:Lcom/shopkick/app/location/SKLocationManager$CONNECTION_REQUEST_TYPE;

    invoke-virtual {v1}, Lcom/shopkick/app/location/SKLocationManager$CONNECTION_REQUEST_TYPE;->ordinal()I

    move-result v1

    const/4 v2, 0x2

    aput v2, v0, v1
    :try_end_1
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    return-void
.end method
