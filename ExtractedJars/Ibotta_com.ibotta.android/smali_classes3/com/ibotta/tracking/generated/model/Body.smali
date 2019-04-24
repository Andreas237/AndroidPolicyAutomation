.class public Lcom/ibotta/tracking/generated/model/Body;
.super Ljava/lang/Object;
.source "Body.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/tracking/generated/model/Body$PlatformEnum;
    }
.end annotation


# static fields
.field public static final SERIALIZED_NAME_ADID:Ljava/lang/String; = "adid"

.field public static final SERIALIZED_NAME_ANDROID_ID:Ljava/lang/String; = "android_id"

.field public static final SERIALIZED_NAME_APP_VERSION:Ljava/lang/String; = "app_version"

.field public static final SERIALIZED_NAME_CARRIER:Ljava/lang/String; = "carrier"

.field public static final SERIALIZED_NAME_CITY:Ljava/lang/String; = "city"

.field public static final SERIALIZED_NAME_COUNTRY:Ljava/lang/String; = "country"

.field public static final SERIALIZED_NAME_DEVICE_BRAND:Ljava/lang/String; = "device_brand"

.field public static final SERIALIZED_NAME_DEVICE_ID:Ljava/lang/String; = "device_id"

.field public static final SERIALIZED_NAME_DEVICE_MANUFACTURER:Ljava/lang/String; = "device_manufacturer"

.field public static final SERIALIZED_NAME_DEVICE_MODEL:Ljava/lang/String; = "device_model"

.field public static final SERIALIZED_NAME_DMA:Ljava/lang/String; = "dma"

.field public static final SERIALIZED_NAME_EVENT_ID:Ljava/lang/String; = "event_id"

.field public static final SERIALIZED_NAME_EVENT_PROPERTIES:Ljava/lang/String; = "event_properties"

.field public static final SERIALIZED_NAME_EVENT_TYPE:Ljava/lang/String; = "event_type"

.field public static final SERIALIZED_NAME_FAKE:Ljava/lang/String; = "fake"

.field public static final SERIALIZED_NAME_GROUPS:Ljava/lang/String; = "groups"

.field public static final SERIALIZED_NAME_IDFA:Ljava/lang/String; = "idfa"

.field public static final SERIALIZED_NAME_IDFV:Ljava/lang/String; = "idfv"

.field public static final SERIALIZED_NAME_INSERT_ID:Ljava/lang/String; = "insert_id"

.field public static final SERIALIZED_NAME_IP:Ljava/lang/String; = "ip"

.field public static final SERIALIZED_NAME_LANGUAGE:Ljava/lang/String; = "language"

.field public static final SERIALIZED_NAME_LOCATION_LAT:Ljava/lang/String; = "location_lat"

.field public static final SERIALIZED_NAME_LOCATION_LNG:Ljava/lang/String; = "location_lng"

.field public static final SERIALIZED_NAME_OS_NAME:Ljava/lang/String; = "os_name"

.field public static final SERIALIZED_NAME_OS_VERSION:Ljava/lang/String; = "os_version"

.field public static final SERIALIZED_NAME_PLATFORM:Ljava/lang/String; = "platform"

.field public static final SERIALIZED_NAME_PRICE:Ljava/lang/String; = "price"

.field public static final SERIALIZED_NAME_PRODUCT_ID:Ljava/lang/String; = "productId"

.field public static final SERIALIZED_NAME_QUANTITY:Ljava/lang/String; = "quantity"

.field public static final SERIALIZED_NAME_REGION:Ljava/lang/String; = "region"

.field public static final SERIALIZED_NAME_REVENUE:Ljava/lang/String; = "revenue"

.field public static final SERIALIZED_NAME_REVENUE_TYPE:Ljava/lang/String; = "revenueType"

.field public static final SERIALIZED_NAME_SESSION_ID:Ljava/lang/String; = "session_id"

.field public static final SERIALIZED_NAME_TIME:Ljava/lang/String; = "time"

.field public static final SERIALIZED_NAME_USER_ID:Ljava/lang/String; = "user_id"

.field public static final SERIALIZED_NAME_USER_PROPERTIES:Ljava/lang/String; = "user_properties"


# instance fields
.field private adid:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "adid"
    .end annotation
.end field

.field private androidId:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "android_id"
    .end annotation
.end field

.field private appVersion:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "app_version"
    .end annotation
.end field

.field private carrier:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "carrier"
    .end annotation
.end field

.field private city:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "city"
    .end annotation
.end field

.field private country:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "country"
    .end annotation
.end field

.field private deviceBrand:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "device_brand"
    .end annotation
.end field

.field private deviceId:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "device_id"
    .end annotation
.end field

.field private deviceManufacturer:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "device_manufacturer"
    .end annotation
.end field

.field private deviceModel:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "device_model"
    .end annotation
.end field

.field private dma:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "dma"
    .end annotation
.end field

.field private eventId:Ljava/lang/Integer;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "event_id"
    .end annotation
.end field

.field private eventProperties:Ljava/util/Map;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "event_properties"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private eventType:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "event_type"
    .end annotation
.end field

.field private fake:Ljava/lang/Boolean;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "fake"
    .end annotation
.end field

.field private groups:Ljava/util/Map;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "groups"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private idfa:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "idfa"
    .end annotation
.end field

.field private idfv:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "idfv"
    .end annotation
.end field

.field private insertId:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "insert_id"
    .end annotation
.end field

.field private ip:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "ip"
    .end annotation
.end field

.field private language:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "language"
    .end annotation
.end field

.field private locationLat:Ljava/lang/Float;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "location_lat"
    .end annotation
.end field

.field private locationLng:Ljava/lang/Float;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "location_lng"
    .end annotation
.end field

.field private osName:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "os_name"
    .end annotation
.end field

.field private osVersion:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "os_version"
    .end annotation
.end field

.field private platform:Lcom/ibotta/tracking/generated/model/Body$PlatformEnum;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "platform"
    .end annotation
.end field

.field private price:Ljava/lang/Float;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "price"
    .end annotation
.end field

.field private productId:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "productId"
    .end annotation
.end field

.field private quantity:Ljava/lang/Float;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "quantity"
    .end annotation
.end field

.field private region:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "region"
    .end annotation
.end field

.field private revenue:Ljava/lang/Float;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "revenue"
    .end annotation
.end field

.field private revenueType:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "revenueType"
    .end annotation
.end field

.field private sessionId:Ljava/lang/Long;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "session_id"
    .end annotation
.end field

.field private time:Ljava/lang/Long;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "time"
    .end annotation
.end field

.field private userId:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "user_id"
    .end annotation
.end field

.field private userProperties:Ljava/util/Map;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "user_properties"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 36
    iput-object v0, p0, Lcom/ibotta/tracking/generated/model/Body;->userId:Ljava/lang/String;

    .line 40
    iput-object v0, p0, Lcom/ibotta/tracking/generated/model/Body;->deviceId:Ljava/lang/String;

    .line 44
    iput-object v0, p0, Lcom/ibotta/tracking/generated/model/Body;->eventType:Ljava/lang/String;

    .line 48
    iput-object v0, p0, Lcom/ibotta/tracking/generated/model/Body;->time:Ljava/lang/Long;

    .line 52
    iput-object v0, p0, Lcom/ibotta/tracking/generated/model/Body;->eventProperties:Ljava/util/Map;

    .line 56
    iput-object v0, p0, Lcom/ibotta/tracking/generated/model/Body;->userProperties:Ljava/util/Map;

    .line 60
    iput-object v0, p0, Lcom/ibotta/tracking/generated/model/Body;->groups:Ljava/util/Map;

    .line 64
    iput-object v0, p0, Lcom/ibotta/tracking/generated/model/Body;->appVersion:Ljava/lang/String;

    .line 117
    iput-object v0, p0, Lcom/ibotta/tracking/generated/model/Body;->platform:Lcom/ibotta/tracking/generated/model/Body$PlatformEnum;

    .line 121
    iput-object v0, p0, Lcom/ibotta/tracking/generated/model/Body;->osName:Ljava/lang/String;

    .line 125
    iput-object v0, p0, Lcom/ibotta/tracking/generated/model/Body;->osVersion:Ljava/lang/String;

    .line 129
    iput-object v0, p0, Lcom/ibotta/tracking/generated/model/Body;->deviceBrand:Ljava/lang/String;

    .line 133
    iput-object v0, p0, Lcom/ibotta/tracking/generated/model/Body;->deviceManufacturer:Ljava/lang/String;

    .line 137
    iput-object v0, p0, Lcom/ibotta/tracking/generated/model/Body;->deviceModel:Ljava/lang/String;

    .line 141
    iput-object v0, p0, Lcom/ibotta/tracking/generated/model/Body;->carrier:Ljava/lang/String;

    .line 145
    iput-object v0, p0, Lcom/ibotta/tracking/generated/model/Body;->country:Ljava/lang/String;

    .line 149
    iput-object v0, p0, Lcom/ibotta/tracking/generated/model/Body;->region:Ljava/lang/String;

    .line 153
    iput-object v0, p0, Lcom/ibotta/tracking/generated/model/Body;->city:Ljava/lang/String;

    .line 157
    iput-object v0, p0, Lcom/ibotta/tracking/generated/model/Body;->dma:Ljava/lang/String;

    .line 161
    iput-object v0, p0, Lcom/ibotta/tracking/generated/model/Body;->language:Ljava/lang/String;

    .line 165
    iput-object v0, p0, Lcom/ibotta/tracking/generated/model/Body;->price:Ljava/lang/Float;

    .line 169
    iput-object v0, p0, Lcom/ibotta/tracking/generated/model/Body;->quantity:Ljava/lang/Float;

    .line 173
    iput-object v0, p0, Lcom/ibotta/tracking/generated/model/Body;->revenue:Ljava/lang/Float;

    .line 177
    iput-object v0, p0, Lcom/ibotta/tracking/generated/model/Body;->productId:Ljava/lang/String;

    .line 181
    iput-object v0, p0, Lcom/ibotta/tracking/generated/model/Body;->revenueType:Ljava/lang/String;

    .line 185
    iput-object v0, p0, Lcom/ibotta/tracking/generated/model/Body;->locationLat:Ljava/lang/Float;

    .line 189
    iput-object v0, p0, Lcom/ibotta/tracking/generated/model/Body;->locationLng:Ljava/lang/Float;

    .line 193
    iput-object v0, p0, Lcom/ibotta/tracking/generated/model/Body;->ip:Ljava/lang/String;

    .line 197
    iput-object v0, p0, Lcom/ibotta/tracking/generated/model/Body;->idfa:Ljava/lang/String;

    .line 201
    iput-object v0, p0, Lcom/ibotta/tracking/generated/model/Body;->idfv:Ljava/lang/String;

    .line 205
    iput-object v0, p0, Lcom/ibotta/tracking/generated/model/Body;->androidId:Ljava/lang/String;

    .line 209
    iput-object v0, p0, Lcom/ibotta/tracking/generated/model/Body;->adid:Ljava/lang/String;

    .line 213
    iput-object v0, p0, Lcom/ibotta/tracking/generated/model/Body;->eventId:Ljava/lang/Integer;

    .line 217
    iput-object v0, p0, Lcom/ibotta/tracking/generated/model/Body;->sessionId:Ljava/lang/Long;

    .line 221
    iput-object v0, p0, Lcom/ibotta/tracking/generated/model/Body;->insertId:Ljava/lang/String;

    .line 225
    iput-object v0, p0, Lcom/ibotta/tracking/generated/model/Body;->fake:Ljava/lang/Boolean;

    return-void
.end method

.method private toIndentedString(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    if-nez p1, :cond_0

    const-string p1, "null"

    return-object p1

    .line 1008
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "\n"

    const-string v1, "\n    "

    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public adid(Ljava/lang/String;)Lcom/ibotta/tracking/generated/model/Body;
    .locals 0

    .line 812
    iput-object p1, p0, Lcom/ibotta/tracking/generated/model/Body;->adid:Ljava/lang/String;

    return-object p0
.end method

.method public androidId(Ljava/lang/String;)Lcom/ibotta/tracking/generated/model/Body;
    .locals 0

    .line 794
    iput-object p1, p0, Lcom/ibotta/tracking/generated/model/Body;->androidId:Ljava/lang/String;

    return-object p0
.end method

.method public appVersion(Ljava/lang/String;)Lcom/ibotta/tracking/generated/model/Body;
    .locals 0

    .line 380
    iput-object p1, p0, Lcom/ibotta/tracking/generated/model/Body;->appVersion:Ljava/lang/String;

    return-object p0
.end method

.method public carrier(Ljava/lang/String;)Lcom/ibotta/tracking/generated/model/Body;
    .locals 0

    .line 506
    iput-object p1, p0, Lcom/ibotta/tracking/generated/model/Body;->carrier:Ljava/lang/String;

    return-object p0
.end method

.method public city(Ljava/lang/String;)Lcom/ibotta/tracking/generated/model/Body;
    .locals 0

    .line 560
    iput-object p1, p0, Lcom/ibotta/tracking/generated/model/Body;->city:Ljava/lang/String;

    return-object p0
.end method

.method public country(Ljava/lang/String;)Lcom/ibotta/tracking/generated/model/Body;
    .locals 0

    .line 524
    iput-object p1, p0, Lcom/ibotta/tracking/generated/model/Body;->country:Ljava/lang/String;

    return-object p0
.end method

.method public deviceBrand(Ljava/lang/String;)Lcom/ibotta/tracking/generated/model/Body;
    .locals 0

    .line 452
    iput-object p1, p0, Lcom/ibotta/tracking/generated/model/Body;->deviceBrand:Ljava/lang/String;

    return-object p0
.end method

.method public deviceId(Ljava/lang/String;)Lcom/ibotta/tracking/generated/model/Body;
    .locals 0

    .line 247
    iput-object p1, p0, Lcom/ibotta/tracking/generated/model/Body;->deviceId:Ljava/lang/String;

    return-object p0
.end method

.method public deviceManufacturer(Ljava/lang/String;)Lcom/ibotta/tracking/generated/model/Body;
    .locals 0

    .line 470
    iput-object p1, p0, Lcom/ibotta/tracking/generated/model/Body;->deviceManufacturer:Ljava/lang/String;

    return-object p0
.end method

.method public deviceModel(Ljava/lang/String;)Lcom/ibotta/tracking/generated/model/Body;
    .locals 0

    .line 488
    iput-object p1, p0, Lcom/ibotta/tracking/generated/model/Body;->deviceModel:Ljava/lang/String;

    return-object p0
.end method

.method public dma(Ljava/lang/String;)Lcom/ibotta/tracking/generated/model/Body;
    .locals 0

    .line 578
    iput-object p1, p0, Lcom/ibotta/tracking/generated/model/Body;->dma:Ljava/lang/String;

    return-object p0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_3

    .line 907
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto/16 :goto_1

    .line 910
    :cond_1
    check-cast p1, Lcom/ibotta/tracking/generated/model/Body;

    .line 911
    iget-object v2, p0, Lcom/ibotta/tracking/generated/model/Body;->userId:Ljava/lang/String;

    iget-object v3, p1, Lcom/ibotta/tracking/generated/model/Body;->userId:Ljava/lang/String;

    invoke-static {v2, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lcom/ibotta/tracking/generated/model/Body;->deviceId:Ljava/lang/String;

    iget-object v3, p1, Lcom/ibotta/tracking/generated/model/Body;->deviceId:Ljava/lang/String;

    .line 912
    invoke-static {v2, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lcom/ibotta/tracking/generated/model/Body;->eventType:Ljava/lang/String;

    iget-object v3, p1, Lcom/ibotta/tracking/generated/model/Body;->eventType:Ljava/lang/String;

    .line 913
    invoke-static {v2, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lcom/ibotta/tracking/generated/model/Body;->time:Ljava/lang/Long;

    iget-object v3, p1, Lcom/ibotta/tracking/generated/model/Body;->time:Ljava/lang/Long;

    .line 914
    invoke-static {v2, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lcom/ibotta/tracking/generated/model/Body;->eventProperties:Ljava/util/Map;

    iget-object v3, p1, Lcom/ibotta/tracking/generated/model/Body;->eventProperties:Ljava/util/Map;

    .line 915
    invoke-static {v2, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lcom/ibotta/tracking/generated/model/Body;->userProperties:Ljava/util/Map;

    iget-object v3, p1, Lcom/ibotta/tracking/generated/model/Body;->userProperties:Ljava/util/Map;

    .line 916
    invoke-static {v2, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lcom/ibotta/tracking/generated/model/Body;->groups:Ljava/util/Map;

    iget-object v3, p1, Lcom/ibotta/tracking/generated/model/Body;->groups:Ljava/util/Map;

    .line 917
    invoke-static {v2, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lcom/ibotta/tracking/generated/model/Body;->appVersion:Ljava/lang/String;

    iget-object v3, p1, Lcom/ibotta/tracking/generated/model/Body;->appVersion:Ljava/lang/String;

    .line 918
    invoke-static {v2, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lcom/ibotta/tracking/generated/model/Body;->platform:Lcom/ibotta/tracking/generated/model/Body$PlatformEnum;

    iget-object v3, p1, Lcom/ibotta/tracking/generated/model/Body;->platform:Lcom/ibotta/tracking/generated/model/Body$PlatformEnum;

    .line 919
    invoke-static {v2, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lcom/ibotta/tracking/generated/model/Body;->osName:Ljava/lang/String;

    iget-object v3, p1, Lcom/ibotta/tracking/generated/model/Body;->osName:Ljava/lang/String;

    .line 920
    invoke-static {v2, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lcom/ibotta/tracking/generated/model/Body;->osVersion:Ljava/lang/String;

    iget-object v3, p1, Lcom/ibotta/tracking/generated/model/Body;->osVersion:Ljava/lang/String;

    .line 921
    invoke-static {v2, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lcom/ibotta/tracking/generated/model/Body;->deviceBrand:Ljava/lang/String;

    iget-object v3, p1, Lcom/ibotta/tracking/generated/model/Body;->deviceBrand:Ljava/lang/String;

    .line 922
    invoke-static {v2, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lcom/ibotta/tracking/generated/model/Body;->deviceManufacturer:Ljava/lang/String;

    iget-object v3, p1, Lcom/ibotta/tracking/generated/model/Body;->deviceManufacturer:Ljava/lang/String;

    .line 923
    invoke-static {v2, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lcom/ibotta/tracking/generated/model/Body;->deviceModel:Ljava/lang/String;

    iget-object v3, p1, Lcom/ibotta/tracking/generated/model/Body;->deviceModel:Ljava/lang/String;

    .line 924
    invoke-static {v2, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lcom/ibotta/tracking/generated/model/Body;->carrier:Ljava/lang/String;

    iget-object v3, p1, Lcom/ibotta/tracking/generated/model/Body;->carrier:Ljava/lang/String;

    .line 925
    invoke-static {v2, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lcom/ibotta/tracking/generated/model/Body;->country:Ljava/lang/String;

    iget-object v3, p1, Lcom/ibotta/tracking/generated/model/Body;->country:Ljava/lang/String;

    .line 926
    invoke-static {v2, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lcom/ibotta/tracking/generated/model/Body;->region:Ljava/lang/String;

    iget-object v3, p1, Lcom/ibotta/tracking/generated/model/Body;->region:Ljava/lang/String;

    .line 927
    invoke-static {v2, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lcom/ibotta/tracking/generated/model/Body;->city:Ljava/lang/String;

    iget-object v3, p1, Lcom/ibotta/tracking/generated/model/Body;->city:Ljava/lang/String;

    .line 928
    invoke-static {v2, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lcom/ibotta/tracking/generated/model/Body;->dma:Ljava/lang/String;

    iget-object v3, p1, Lcom/ibotta/tracking/generated/model/Body;->dma:Ljava/lang/String;

    .line 929
    invoke-static {v2, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lcom/ibotta/tracking/generated/model/Body;->language:Ljava/lang/String;

    iget-object v3, p1, Lcom/ibotta/tracking/generated/model/Body;->language:Ljava/lang/String;

    .line 930
    invoke-static {v2, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lcom/ibotta/tracking/generated/model/Body;->price:Ljava/lang/Float;

    iget-object v3, p1, Lcom/ibotta/tracking/generated/model/Body;->price:Ljava/lang/Float;

    .line 931
    invoke-static {v2, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lcom/ibotta/tracking/generated/model/Body;->quantity:Ljava/lang/Float;

    iget-object v3, p1, Lcom/ibotta/tracking/generated/model/Body;->quantity:Ljava/lang/Float;

    .line 932
    invoke-static {v2, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lcom/ibotta/tracking/generated/model/Body;->revenue:Ljava/lang/Float;

    iget-object v3, p1, Lcom/ibotta/tracking/generated/model/Body;->revenue:Ljava/lang/Float;

    .line 933
    invoke-static {v2, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lcom/ibotta/tracking/generated/model/Body;->productId:Ljava/lang/String;

    iget-object v3, p1, Lcom/ibotta/tracking/generated/model/Body;->productId:Ljava/lang/String;

    .line 934
    invoke-static {v2, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lcom/ibotta/tracking/generated/model/Body;->revenueType:Ljava/lang/String;

    iget-object v3, p1, Lcom/ibotta/tracking/generated/model/Body;->revenueType:Ljava/lang/String;

    .line 935
    invoke-static {v2, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lcom/ibotta/tracking/generated/model/Body;->locationLat:Ljava/lang/Float;

    iget-object v3, p1, Lcom/ibotta/tracking/generated/model/Body;->locationLat:Ljava/lang/Float;

    .line 936
    invoke-static {v2, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lcom/ibotta/tracking/generated/model/Body;->locationLng:Ljava/lang/Float;

    iget-object v3, p1, Lcom/ibotta/tracking/generated/model/Body;->locationLng:Ljava/lang/Float;

    .line 937
    invoke-static {v2, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lcom/ibotta/tracking/generated/model/Body;->ip:Ljava/lang/String;

    iget-object v3, p1, Lcom/ibotta/tracking/generated/model/Body;->ip:Ljava/lang/String;

    .line 938
    invoke-static {v2, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lcom/ibotta/tracking/generated/model/Body;->idfa:Ljava/lang/String;

    iget-object v3, p1, Lcom/ibotta/tracking/generated/model/Body;->idfa:Ljava/lang/String;

    .line 939
    invoke-static {v2, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lcom/ibotta/tracking/generated/model/Body;->idfv:Ljava/lang/String;

    iget-object v3, p1, Lcom/ibotta/tracking/generated/model/Body;->idfv:Ljava/lang/String;

    .line 940
    invoke-static {v2, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lcom/ibotta/tracking/generated/model/Body;->androidId:Ljava/lang/String;

    iget-object v3, p1, Lcom/ibotta/tracking/generated/model/Body;->androidId:Ljava/lang/String;

    .line 941
    invoke-static {v2, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lcom/ibotta/tracking/generated/model/Body;->adid:Ljava/lang/String;

    iget-object v3, p1, Lcom/ibotta/tracking/generated/model/Body;->adid:Ljava/lang/String;

    .line 942
    invoke-static {v2, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lcom/ibotta/tracking/generated/model/Body;->eventId:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/ibotta/tracking/generated/model/Body;->eventId:Ljava/lang/Integer;

    .line 943
    invoke-static {v2, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lcom/ibotta/tracking/generated/model/Body;->sessionId:Ljava/lang/Long;

    iget-object v3, p1, Lcom/ibotta/tracking/generated/model/Body;->sessionId:Ljava/lang/Long;

    .line 944
    invoke-static {v2, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lcom/ibotta/tracking/generated/model/Body;->insertId:Ljava/lang/String;

    iget-object v3, p1, Lcom/ibotta/tracking/generated/model/Body;->insertId:Ljava/lang/String;

    .line 945
    invoke-static {v2, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lcom/ibotta/tracking/generated/model/Body;->fake:Ljava/lang/Boolean;

    iget-object p1, p1, Lcom/ibotta/tracking/generated/model/Body;->fake:Ljava/lang/Boolean;

    .line 946
    invoke-static {v2, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_3
    :goto_1
    return v1
.end method

.method public eventId(Ljava/lang/Integer;)Lcom/ibotta/tracking/generated/model/Body;
    .locals 0

    .line 830
    iput-object p1, p0, Lcom/ibotta/tracking/generated/model/Body;->eventId:Ljava/lang/Integer;

    return-object p0
.end method

.method public eventProperties(Ljava/util/Map;)Lcom/ibotta/tracking/generated/model/Body;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Lcom/ibotta/tracking/generated/model/Body;"
        }
    .end annotation

    .line 302
    iput-object p1, p0, Lcom/ibotta/tracking/generated/model/Body;->eventProperties:Ljava/util/Map;

    return-object p0
.end method

.method public eventType(Ljava/lang/String;)Lcom/ibotta/tracking/generated/model/Body;
    .locals 0

    .line 265
    iput-object p1, p0, Lcom/ibotta/tracking/generated/model/Body;->eventType:Ljava/lang/String;

    return-object p0
.end method

.method public fake(Ljava/lang/Boolean;)Lcom/ibotta/tracking/generated/model/Body;
    .locals 0

    .line 884
    iput-object p1, p0, Lcom/ibotta/tracking/generated/model/Body;->fake:Ljava/lang/Boolean;

    return-object p0
.end method

.method public getAdid()Ljava/lang/String;
    .locals 1
    .annotation runtime Lio/swagger/annotations/ApiModelProperty;
        value = "(Android) Google Play Services advertising ID (AdID)."
    .end annotation

    .line 822
    iget-object v0, p0, Lcom/ibotta/tracking/generated/model/Body;->adid:Ljava/lang/String;

    return-object v0
.end method

.method public getAndroidId()Ljava/lang/String;
    .locals 1
    .annotation runtime Lio/swagger/annotations/ApiModelProperty;
        value = "(Android) Android ID (not the advertising ID)."
    .end annotation

    .line 804
    iget-object v0, p0, Lcom/ibotta/tracking/generated/model/Body;->androidId:Ljava/lang/String;

    return-object v0
.end method

.method public getAppVersion()Ljava/lang/String;
    .locals 1
    .annotation runtime Lio/swagger/annotations/ApiModelProperty;
        value = "The version of your application the user is on."
    .end annotation

    .line 390
    iget-object v0, p0, Lcom/ibotta/tracking/generated/model/Body;->appVersion:Ljava/lang/String;

    return-object v0
.end method

.method public getCarrier()Ljava/lang/String;
    .locals 1
    .annotation runtime Lio/swagger/annotations/ApiModelProperty;
        value = "Carrier of the device."
    .end annotation

    .line 516
    iget-object v0, p0, Lcom/ibotta/tracking/generated/model/Body;->carrier:Ljava/lang/String;

    return-object v0
.end method

.method public getCity()Ljava/lang/String;
    .locals 1
    .annotation runtime Lio/swagger/annotations/ApiModelProperty;
        value = "What city the user is in."
    .end annotation

    .line 570
    iget-object v0, p0, Lcom/ibotta/tracking/generated/model/Body;->city:Ljava/lang/String;

    return-object v0
.end method

.method public getCountry()Ljava/lang/String;
    .locals 1
    .annotation runtime Lio/swagger/annotations/ApiModelProperty;
        value = "The country the user is in."
    .end annotation

    .line 534
    iget-object v0, p0, Lcom/ibotta/tracking/generated/model/Body;->country:Ljava/lang/String;

    return-object v0
.end method

.method public getDeviceBrand()Ljava/lang/String;
    .locals 1
    .annotation runtime Lio/swagger/annotations/ApiModelProperty;
        value = "The device brand the user is on."
    .end annotation

    .line 462
    iget-object v0, p0, Lcom/ibotta/tracking/generated/model/Body;->deviceBrand:Ljava/lang/String;

    return-object v0
.end method

.method public getDeviceId()Ljava/lang/String;
    .locals 1
    .annotation runtime Lio/swagger/annotations/ApiModelProperty;
        value = "A device specific identifier, such as the Identifier for Vendor on iOS. (one of device_id or user_id is required)"
    .end annotation

    .line 257
    iget-object v0, p0, Lcom/ibotta/tracking/generated/model/Body;->deviceId:Ljava/lang/String;

    return-object v0
.end method

.method public getDeviceManufacturer()Ljava/lang/String;
    .locals 1
    .annotation runtime Lio/swagger/annotations/ApiModelProperty;
        value = "The device manufacturer the user is on."
    .end annotation

    .line 480
    iget-object v0, p0, Lcom/ibotta/tracking/generated/model/Body;->deviceManufacturer:Ljava/lang/String;

    return-object v0
.end method

.method public getDeviceModel()Ljava/lang/String;
    .locals 1
    .annotation runtime Lio/swagger/annotations/ApiModelProperty;
        value = "The device model the user is on."
    .end annotation

    .line 498
    iget-object v0, p0, Lcom/ibotta/tracking/generated/model/Body;->deviceModel:Ljava/lang/String;

    return-object v0
.end method

.method public getDma()Ljava/lang/String;
    .locals 1
    .annotation runtime Lio/swagger/annotations/ApiModelProperty;
        value = "The Designated Market Area of the user."
    .end annotation

    .line 588
    iget-object v0, p0, Lcom/ibotta/tracking/generated/model/Body;->dma:Ljava/lang/String;

    return-object v0
.end method

.method public getEventId()Ljava/lang/Integer;
    .locals 1
    .annotation runtime Lio/swagger/annotations/ApiModelProperty;
        value = "An incrementing counter to distinguish events with the same user_id and timestamp from each other"
    .end annotation

    .line 840
    iget-object v0, p0, Lcom/ibotta/tracking/generated/model/Body;->eventId:Ljava/lang/Integer;

    return-object v0
.end method

.method public getEventProperties()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .annotation runtime Lio/swagger/annotations/ApiModelProperty;
        value = "A dictionary of key-value pairs that represent additional data to be sent along with the event."
    .end annotation

    .line 320
    iget-object v0, p0, Lcom/ibotta/tracking/generated/model/Body;->eventProperties:Ljava/util/Map;

    return-object v0
.end method

.method public getEventType()Ljava/lang/String;
    .locals 1
    .annotation runtime Lio/swagger/annotations/ApiModelProperty;
        value = "A unique identifier for your event."
    .end annotation

    .line 275
    iget-object v0, p0, Lcom/ibotta/tracking/generated/model/Body;->eventType:Ljava/lang/String;

    return-object v0
.end method

.method public getGroups()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .annotation runtime Lio/swagger/annotations/ApiModelProperty;
        value = "A dictionary of key-value pairs that represent groups of users to the event as an event-level group. See https://amplitude.zendesk.com/hc/en-us/articles/115001361248#setting-user-groups"
    .end annotation

    .line 372
    iget-object v0, p0, Lcom/ibotta/tracking/generated/model/Body;->groups:Ljava/util/Map;

    return-object v0
.end method

.method public getIdfa()Ljava/lang/String;
    .locals 1
    .annotation runtime Lio/swagger/annotations/ApiModelProperty;
        value = "(iOS) Identifier for Advertiser."
    .end annotation

    .line 768
    iget-object v0, p0, Lcom/ibotta/tracking/generated/model/Body;->idfa:Ljava/lang/String;

    return-object v0
.end method

.method public getIdfv()Ljava/lang/String;
    .locals 1
    .annotation runtime Lio/swagger/annotations/ApiModelProperty;
        value = "(iOS) Identifier for Vendor."
    .end annotation

    .line 786
    iget-object v0, p0, Lcom/ibotta/tracking/generated/model/Body;->idfv:Ljava/lang/String;

    return-object v0
.end method

.method public getInsertId()Ljava/lang/String;
    .locals 1
    .annotation runtime Lio/swagger/annotations/ApiModelProperty;
        value = "A unique identifier for the event being inserted; we will deduplicate subsequent events sent with an insert_id we have already seen before within the past 7 days."
    .end annotation

    .line 876
    iget-object v0, p0, Lcom/ibotta/tracking/generated/model/Body;->insertId:Ljava/lang/String;

    return-object v0
.end method

.method public getIp()Ljava/lang/String;
    .locals 1
    .annotation runtime Lio/swagger/annotations/ApiModelProperty;
        value = "IP address of the user."
    .end annotation

    .line 750
    iget-object v0, p0, Lcom/ibotta/tracking/generated/model/Body;->ip:Ljava/lang/String;

    return-object v0
.end method

.method public getLanguage()Ljava/lang/String;
    .locals 1
    .annotation runtime Lio/swagger/annotations/ApiModelProperty;
        value = "What language the user has set."
    .end annotation

    .line 606
    iget-object v0, p0, Lcom/ibotta/tracking/generated/model/Body;->language:Ljava/lang/String;

    return-object v0
.end method

.method public getLocationLat()Ljava/lang/Float;
    .locals 1
    .annotation runtime Lio/swagger/annotations/ApiModelProperty;
        value = "Latitude of the user."
    .end annotation

    .line 714
    iget-object v0, p0, Lcom/ibotta/tracking/generated/model/Body;->locationLat:Ljava/lang/Float;

    return-object v0
.end method

.method public getLocationLng()Ljava/lang/Float;
    .locals 1
    .annotation runtime Lio/swagger/annotations/ApiModelProperty;
        value = "Longitude of the user."
    .end annotation

    .line 732
    iget-object v0, p0, Lcom/ibotta/tracking/generated/model/Body;->locationLng:Ljava/lang/Float;

    return-object v0
.end method

.method public getOsName()Ljava/lang/String;
    .locals 1
    .annotation runtime Lio/swagger/annotations/ApiModelProperty;
        value = "The mobile operating system or browser the user is on."
    .end annotation

    .line 426
    iget-object v0, p0, Lcom/ibotta/tracking/generated/model/Body;->osName:Ljava/lang/String;

    return-object v0
.end method

.method public getOsVersion()Ljava/lang/String;
    .locals 1
    .annotation runtime Lio/swagger/annotations/ApiModelProperty;
        value = "The version of the mobile operating system or browser the user is on."
    .end annotation

    .line 444
    iget-object v0, p0, Lcom/ibotta/tracking/generated/model/Body;->osVersion:Ljava/lang/String;

    return-object v0
.end method

.method public getPlatform()Lcom/ibotta/tracking/generated/model/Body$PlatformEnum;
    .locals 1
    .annotation runtime Lio/swagger/annotations/ApiModelProperty;
        value = "Platform of the device."
    .end annotation

    .line 408
    iget-object v0, p0, Lcom/ibotta/tracking/generated/model/Body;->platform:Lcom/ibotta/tracking/generated/model/Body$PlatformEnum;

    return-object v0
.end method

.method public getPrice()Ljava/lang/Float;
    .locals 1
    .annotation runtime Lio/swagger/annotations/ApiModelProperty;
        value = "The price of the item purchased. You can use negative values to indicate refunds. (required for revenue data if revenue is not sent)"
    .end annotation

    .line 624
    iget-object v0, p0, Lcom/ibotta/tracking/generated/model/Body;->price:Ljava/lang/Float;

    return-object v0
.end method

.method public getProductId()Ljava/lang/String;
    .locals 1
    .annotation runtime Lio/swagger/annotations/ApiModelProperty;
        value = "An identifier for the product."
    .end annotation

    .line 678
    iget-object v0, p0, Lcom/ibotta/tracking/generated/model/Body;->productId:Ljava/lang/String;

    return-object v0
.end method

.method public getQuantity()Ljava/lang/Float;
    .locals 1
    .annotation runtime Lio/swagger/annotations/ApiModelProperty;
        value = "The quantity of the item purchased. (required for revenue data, defaults to 1 if not specified)"
    .end annotation

    .line 642
    iget-object v0, p0, Lcom/ibotta/tracking/generated/model/Body;->quantity:Ljava/lang/Float;

    return-object v0
.end method

.method public getRegion()Ljava/lang/String;
    .locals 1
    .annotation runtime Lio/swagger/annotations/ApiModelProperty;
        value = "The geographical region the user is in."
    .end annotation

    .line 552
    iget-object v0, p0, Lcom/ibotta/tracking/generated/model/Body;->region:Ljava/lang/String;

    return-object v0
.end method

.method public getRevenue()Ljava/lang/Float;
    .locals 1
    .annotation runtime Lio/swagger/annotations/ApiModelProperty;
        value = "revenue = price * quantity -- If you send all three fields of price, quantity, and revenue, then (price * quantity) will take precedence and be the revenue value. You can use negative values to indicate refunds."
    .end annotation

    .line 660
    iget-object v0, p0, Lcom/ibotta/tracking/generated/model/Body;->revenue:Ljava/lang/Float;

    return-object v0
.end method

.method public getRevenueType()Ljava/lang/String;
    .locals 1
    .annotation runtime Lio/swagger/annotations/ApiModelProperty;
        value = "Type of revenue."
    .end annotation

    .line 696
    iget-object v0, p0, Lcom/ibotta/tracking/generated/model/Body;->revenueType:Ljava/lang/String;

    return-object v0
.end method

.method public getSessionId()Ljava/lang/Long;
    .locals 1
    .annotation runtime Lio/swagger/annotations/ApiModelProperty;
        value = "The start time of the session in milliseconds since epoch"
    .end annotation

    .line 858
    iget-object v0, p0, Lcom/ibotta/tracking/generated/model/Body;->sessionId:Ljava/lang/Long;

    return-object v0
.end method

.method public getTime()Ljava/lang/Long;
    .locals 1
    .annotation runtime Lio/swagger/annotations/ApiModelProperty;
        value = "The timestamp of the event in milliseconds since epoch. It will be set to the upload time by default."
    .end annotation

    .line 294
    iget-object v0, p0, Lcom/ibotta/tracking/generated/model/Body;->time:Ljava/lang/Long;

    return-object v0
.end method

.method public getUserId()Ljava/lang/String;
    .locals 1
    .annotation runtime Lio/swagger/annotations/ApiModelProperty;
        value = "A readable ID specified by you. (one of device_id or user_id is required)"
    .end annotation

    .line 239
    iget-object v0, p0, Lcom/ibotta/tracking/generated/model/Body;->userId:Ljava/lang/String;

    return-object v0
.end method

.method public getUserProperties()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .annotation runtime Lio/swagger/annotations/ApiModelProperty;
        value = "A dictionary of key-value pairs that represent additional data tied to the user."
    .end annotation

    .line 346
    iget-object v0, p0, Lcom/ibotta/tracking/generated/model/Body;->userProperties:Ljava/util/Map;

    return-object v0
.end method

.method public groups(Ljava/util/Map;)Lcom/ibotta/tracking/generated/model/Body;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Lcom/ibotta/tracking/generated/model/Body;"
        }
    .end annotation

    .line 354
    iput-object p1, p0, Lcom/ibotta/tracking/generated/model/Body;->groups:Ljava/util/Map;

    return-object p0
.end method

.method public hashCode()I
    .locals 3

    const/16 v0, 0x24

    .line 951
    new-array v0, v0, [Ljava/lang/Object;

    iget-object v1, p0, Lcom/ibotta/tracking/generated/model/Body;->userId:Ljava/lang/String;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    iget-object v1, p0, Lcom/ibotta/tracking/generated/model/Body;->deviceId:Ljava/lang/String;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    iget-object v1, p0, Lcom/ibotta/tracking/generated/model/Body;->eventType:Ljava/lang/String;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    iget-object v1, p0, Lcom/ibotta/tracking/generated/model/Body;->time:Ljava/lang/Long;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    iget-object v1, p0, Lcom/ibotta/tracking/generated/model/Body;->eventProperties:Ljava/util/Map;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    iget-object v1, p0, Lcom/ibotta/tracking/generated/model/Body;->userProperties:Ljava/util/Map;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    iget-object v1, p0, Lcom/ibotta/tracking/generated/model/Body;->groups:Ljava/util/Map;

    const/4 v2, 0x6

    aput-object v1, v0, v2

    iget-object v1, p0, Lcom/ibotta/tracking/generated/model/Body;->appVersion:Ljava/lang/String;

    const/4 v2, 0x7

    aput-object v1, v0, v2

    iget-object v1, p0, Lcom/ibotta/tracking/generated/model/Body;->platform:Lcom/ibotta/tracking/generated/model/Body$PlatformEnum;

    const/16 v2, 0x8

    aput-object v1, v0, v2

    iget-object v1, p0, Lcom/ibotta/tracking/generated/model/Body;->osName:Ljava/lang/String;

    const/16 v2, 0x9

    aput-object v1, v0, v2

    iget-object v1, p0, Lcom/ibotta/tracking/generated/model/Body;->osVersion:Ljava/lang/String;

    const/16 v2, 0xa

    aput-object v1, v0, v2

    iget-object v1, p0, Lcom/ibotta/tracking/generated/model/Body;->deviceBrand:Ljava/lang/String;

    const/16 v2, 0xb

    aput-object v1, v0, v2

    iget-object v1, p0, Lcom/ibotta/tracking/generated/model/Body;->deviceManufacturer:Ljava/lang/String;

    const/16 v2, 0xc

    aput-object v1, v0, v2

    iget-object v1, p0, Lcom/ibotta/tracking/generated/model/Body;->deviceModel:Ljava/lang/String;

    const/16 v2, 0xd

    aput-object v1, v0, v2

    iget-object v1, p0, Lcom/ibotta/tracking/generated/model/Body;->carrier:Ljava/lang/String;

    const/16 v2, 0xe

    aput-object v1, v0, v2

    iget-object v1, p0, Lcom/ibotta/tracking/generated/model/Body;->country:Ljava/lang/String;

    const/16 v2, 0xf

    aput-object v1, v0, v2

    iget-object v1, p0, Lcom/ibotta/tracking/generated/model/Body;->region:Ljava/lang/String;

    const/16 v2, 0x10

    aput-object v1, v0, v2

    iget-object v1, p0, Lcom/ibotta/tracking/generated/model/Body;->city:Ljava/lang/String;

    const/16 v2, 0x11

    aput-object v1, v0, v2

    iget-object v1, p0, Lcom/ibotta/tracking/generated/model/Body;->dma:Ljava/lang/String;

    const/16 v2, 0x12

    aput-object v1, v0, v2

    iget-object v1, p0, Lcom/ibotta/tracking/generated/model/Body;->language:Ljava/lang/String;

    const/16 v2, 0x13

    aput-object v1, v0, v2

    iget-object v1, p0, Lcom/ibotta/tracking/generated/model/Body;->price:Ljava/lang/Float;

    const/16 v2, 0x14

    aput-object v1, v0, v2

    iget-object v1, p0, Lcom/ibotta/tracking/generated/model/Body;->quantity:Ljava/lang/Float;

    const/16 v2, 0x15

    aput-object v1, v0, v2

    iget-object v1, p0, Lcom/ibotta/tracking/generated/model/Body;->revenue:Ljava/lang/Float;

    const/16 v2, 0x16

    aput-object v1, v0, v2

    iget-object v1, p0, Lcom/ibotta/tracking/generated/model/Body;->productId:Ljava/lang/String;

    const/16 v2, 0x17

    aput-object v1, v0, v2

    iget-object v1, p0, Lcom/ibotta/tracking/generated/model/Body;->revenueType:Ljava/lang/String;

    const/16 v2, 0x18

    aput-object v1, v0, v2

    iget-object v1, p0, Lcom/ibotta/tracking/generated/model/Body;->locationLat:Ljava/lang/Float;

    const/16 v2, 0x19

    aput-object v1, v0, v2

    iget-object v1, p0, Lcom/ibotta/tracking/generated/model/Body;->locationLng:Ljava/lang/Float;

    const/16 v2, 0x1a

    aput-object v1, v0, v2

    iget-object v1, p0, Lcom/ibotta/tracking/generated/model/Body;->ip:Ljava/lang/String;

    const/16 v2, 0x1b

    aput-object v1, v0, v2

    iget-object v1, p0, Lcom/ibotta/tracking/generated/model/Body;->idfa:Ljava/lang/String;

    const/16 v2, 0x1c

    aput-object v1, v0, v2

    iget-object v1, p0, Lcom/ibotta/tracking/generated/model/Body;->idfv:Ljava/lang/String;

    const/16 v2, 0x1d

    aput-object v1, v0, v2

    iget-object v1, p0, Lcom/ibotta/tracking/generated/model/Body;->androidId:Ljava/lang/String;

    const/16 v2, 0x1e

    aput-object v1, v0, v2

    iget-object v1, p0, Lcom/ibotta/tracking/generated/model/Body;->adid:Ljava/lang/String;

    const/16 v2, 0x1f

    aput-object v1, v0, v2

    iget-object v1, p0, Lcom/ibotta/tracking/generated/model/Body;->eventId:Ljava/lang/Integer;

    const/16 v2, 0x20

    aput-object v1, v0, v2

    iget-object v1, p0, Lcom/ibotta/tracking/generated/model/Body;->sessionId:Ljava/lang/Long;

    const/16 v2, 0x21

    aput-object v1, v0, v2

    iget-object v1, p0, Lcom/ibotta/tracking/generated/model/Body;->insertId:Ljava/lang/String;

    const/16 v2, 0x22

    aput-object v1, v0, v2

    iget-object v1, p0, Lcom/ibotta/tracking/generated/model/Body;->fake:Ljava/lang/Boolean;

    const/16 v2, 0x23

    aput-object v1, v0, v2

    invoke-static {v0}, Ljava/util/Objects;->hash([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public idfa(Ljava/lang/String;)Lcom/ibotta/tracking/generated/model/Body;
    .locals 0

    .line 758
    iput-object p1, p0, Lcom/ibotta/tracking/generated/model/Body;->idfa:Ljava/lang/String;

    return-object p0
.end method

.method public idfv(Ljava/lang/String;)Lcom/ibotta/tracking/generated/model/Body;
    .locals 0

    .line 776
    iput-object p1, p0, Lcom/ibotta/tracking/generated/model/Body;->idfv:Ljava/lang/String;

    return-object p0
.end method

.method public insertId(Ljava/lang/String;)Lcom/ibotta/tracking/generated/model/Body;
    .locals 0

    .line 866
    iput-object p1, p0, Lcom/ibotta/tracking/generated/model/Body;->insertId:Ljava/lang/String;

    return-object p0
.end method

.method public ip(Ljava/lang/String;)Lcom/ibotta/tracking/generated/model/Body;
    .locals 0

    .line 740
    iput-object p1, p0, Lcom/ibotta/tracking/generated/model/Body;->ip:Ljava/lang/String;

    return-object p0
.end method

.method public isFake()Ljava/lang/Boolean;
    .locals 1
    .annotation runtime Lio/swagger/annotations/ApiModelProperty;
        value = "Ignore this event as a fake / test event"
    .end annotation

    .line 894
    iget-object v0, p0, Lcom/ibotta/tracking/generated/model/Body;->fake:Ljava/lang/Boolean;

    return-object v0
.end method

.method public language(Ljava/lang/String;)Lcom/ibotta/tracking/generated/model/Body;
    .locals 0

    .line 596
    iput-object p1, p0, Lcom/ibotta/tracking/generated/model/Body;->language:Ljava/lang/String;

    return-object p0
.end method

.method public locationLat(Ljava/lang/Float;)Lcom/ibotta/tracking/generated/model/Body;
    .locals 0

    .line 704
    iput-object p1, p0, Lcom/ibotta/tracking/generated/model/Body;->locationLat:Ljava/lang/Float;

    return-object p0
.end method

.method public locationLng(Ljava/lang/Float;)Lcom/ibotta/tracking/generated/model/Body;
    .locals 0

    .line 722
    iput-object p1, p0, Lcom/ibotta/tracking/generated/model/Body;->locationLng:Ljava/lang/Float;

    return-object p0
.end method

.method public osName(Ljava/lang/String;)Lcom/ibotta/tracking/generated/model/Body;
    .locals 0

    .line 416
    iput-object p1, p0, Lcom/ibotta/tracking/generated/model/Body;->osName:Ljava/lang/String;

    return-object p0
.end method

.method public osVersion(Ljava/lang/String;)Lcom/ibotta/tracking/generated/model/Body;
    .locals 0

    .line 434
    iput-object p1, p0, Lcom/ibotta/tracking/generated/model/Body;->osVersion:Ljava/lang/String;

    return-object p0
.end method

.method public platform(Lcom/ibotta/tracking/generated/model/Body$PlatformEnum;)Lcom/ibotta/tracking/generated/model/Body;
    .locals 0

    .line 398
    iput-object p1, p0, Lcom/ibotta/tracking/generated/model/Body;->platform:Lcom/ibotta/tracking/generated/model/Body$PlatformEnum;

    return-object p0
.end method

.method public price(Ljava/lang/Float;)Lcom/ibotta/tracking/generated/model/Body;
    .locals 0

    .line 614
    iput-object p1, p0, Lcom/ibotta/tracking/generated/model/Body;->price:Ljava/lang/Float;

    return-object p0
.end method

.method public productId(Ljava/lang/String;)Lcom/ibotta/tracking/generated/model/Body;
    .locals 0

    .line 668
    iput-object p1, p0, Lcom/ibotta/tracking/generated/model/Body;->productId:Ljava/lang/String;

    return-object p0
.end method

.method public putEventPropertiesItem(Ljava/lang/String;Ljava/lang/Object;)Lcom/ibotta/tracking/generated/model/Body;
    .locals 1

    .line 307
    iget-object v0, p0, Lcom/ibotta/tracking/generated/model/Body;->eventProperties:Ljava/util/Map;

    if-nez v0, :cond_0

    .line 308
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/ibotta/tracking/generated/model/Body;->eventProperties:Ljava/util/Map;

    .line 310
    :cond_0
    iget-object v0, p0, Lcom/ibotta/tracking/generated/model/Body;->eventProperties:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0
.end method

.method public putGroupsItem(Ljava/lang/String;Ljava/lang/Object;)Lcom/ibotta/tracking/generated/model/Body;
    .locals 1

    .line 359
    iget-object v0, p0, Lcom/ibotta/tracking/generated/model/Body;->groups:Ljava/util/Map;

    if-nez v0, :cond_0

    .line 360
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/ibotta/tracking/generated/model/Body;->groups:Ljava/util/Map;

    .line 362
    :cond_0
    iget-object v0, p0, Lcom/ibotta/tracking/generated/model/Body;->groups:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0
.end method

.method public putUserPropertiesItem(Ljava/lang/String;Ljava/lang/Object;)Lcom/ibotta/tracking/generated/model/Body;
    .locals 1

    .line 333
    iget-object v0, p0, Lcom/ibotta/tracking/generated/model/Body;->userProperties:Ljava/util/Map;

    if-nez v0, :cond_0

    .line 334
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/ibotta/tracking/generated/model/Body;->userProperties:Ljava/util/Map;

    .line 336
    :cond_0
    iget-object v0, p0, Lcom/ibotta/tracking/generated/model/Body;->userProperties:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0
.end method

.method public quantity(Ljava/lang/Float;)Lcom/ibotta/tracking/generated/model/Body;
    .locals 0

    .line 632
    iput-object p1, p0, Lcom/ibotta/tracking/generated/model/Body;->quantity:Ljava/lang/Float;

    return-object p0
.end method

.method public region(Ljava/lang/String;)Lcom/ibotta/tracking/generated/model/Body;
    .locals 0

    .line 542
    iput-object p1, p0, Lcom/ibotta/tracking/generated/model/Body;->region:Ljava/lang/String;

    return-object p0
.end method

.method public revenue(Ljava/lang/Float;)Lcom/ibotta/tracking/generated/model/Body;
    .locals 0

    .line 650
    iput-object p1, p0, Lcom/ibotta/tracking/generated/model/Body;->revenue:Ljava/lang/Float;

    return-object p0
.end method

.method public revenueType(Ljava/lang/String;)Lcom/ibotta/tracking/generated/model/Body;
    .locals 0

    .line 686
    iput-object p1, p0, Lcom/ibotta/tracking/generated/model/Body;->revenueType:Ljava/lang/String;

    return-object p0
.end method

.method public sessionId(Ljava/lang/Long;)Lcom/ibotta/tracking/generated/model/Body;
    .locals 0

    .line 848
    iput-object p1, p0, Lcom/ibotta/tracking/generated/model/Body;->sessionId:Ljava/lang/Long;

    return-object p0
.end method

.method public setAdid(Ljava/lang/String;)V
    .locals 0

    .line 826
    iput-object p1, p0, Lcom/ibotta/tracking/generated/model/Body;->adid:Ljava/lang/String;

    return-void
.end method

.method public setAndroidId(Ljava/lang/String;)V
    .locals 0

    .line 808
    iput-object p1, p0, Lcom/ibotta/tracking/generated/model/Body;->androidId:Ljava/lang/String;

    return-void
.end method

.method public setAppVersion(Ljava/lang/String;)V
    .locals 0

    .line 394
    iput-object p1, p0, Lcom/ibotta/tracking/generated/model/Body;->appVersion:Ljava/lang/String;

    return-void
.end method

.method public setCarrier(Ljava/lang/String;)V
    .locals 0

    .line 520
    iput-object p1, p0, Lcom/ibotta/tracking/generated/model/Body;->carrier:Ljava/lang/String;

    return-void
.end method

.method public setCity(Ljava/lang/String;)V
    .locals 0

    .line 574
    iput-object p1, p0, Lcom/ibotta/tracking/generated/model/Body;->city:Ljava/lang/String;

    return-void
.end method

.method public setCountry(Ljava/lang/String;)V
    .locals 0

    .line 538
    iput-object p1, p0, Lcom/ibotta/tracking/generated/model/Body;->country:Ljava/lang/String;

    return-void
.end method

.method public setDeviceBrand(Ljava/lang/String;)V
    .locals 0

    .line 466
    iput-object p1, p0, Lcom/ibotta/tracking/generated/model/Body;->deviceBrand:Ljava/lang/String;

    return-void
.end method

.method public setDeviceId(Ljava/lang/String;)V
    .locals 0

    .line 261
    iput-object p1, p0, Lcom/ibotta/tracking/generated/model/Body;->deviceId:Ljava/lang/String;

    return-void
.end method

.method public setDeviceManufacturer(Ljava/lang/String;)V
    .locals 0

    .line 484
    iput-object p1, p0, Lcom/ibotta/tracking/generated/model/Body;->deviceManufacturer:Ljava/lang/String;

    return-void
.end method

.method public setDeviceModel(Ljava/lang/String;)V
    .locals 0

    .line 502
    iput-object p1, p0, Lcom/ibotta/tracking/generated/model/Body;->deviceModel:Ljava/lang/String;

    return-void
.end method

.method public setDma(Ljava/lang/String;)V
    .locals 0

    .line 592
    iput-object p1, p0, Lcom/ibotta/tracking/generated/model/Body;->dma:Ljava/lang/String;

    return-void
.end method

.method public setEventId(Ljava/lang/Integer;)V
    .locals 0

    .line 844
    iput-object p1, p0, Lcom/ibotta/tracking/generated/model/Body;->eventId:Ljava/lang/Integer;

    return-void
.end method

.method public setEventProperties(Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 324
    iput-object p1, p0, Lcom/ibotta/tracking/generated/model/Body;->eventProperties:Ljava/util/Map;

    return-void
.end method

.method public setEventType(Ljava/lang/String;)V
    .locals 0

    .line 279
    iput-object p1, p0, Lcom/ibotta/tracking/generated/model/Body;->eventType:Ljava/lang/String;

    return-void
.end method

.method public setFake(Ljava/lang/Boolean;)V
    .locals 0

    .line 898
    iput-object p1, p0, Lcom/ibotta/tracking/generated/model/Body;->fake:Ljava/lang/Boolean;

    return-void
.end method

.method public setGroups(Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 376
    iput-object p1, p0, Lcom/ibotta/tracking/generated/model/Body;->groups:Ljava/util/Map;

    return-void
.end method

.method public setIdfa(Ljava/lang/String;)V
    .locals 0

    .line 772
    iput-object p1, p0, Lcom/ibotta/tracking/generated/model/Body;->idfa:Ljava/lang/String;

    return-void
.end method

.method public setIdfv(Ljava/lang/String;)V
    .locals 0

    .line 790
    iput-object p1, p0, Lcom/ibotta/tracking/generated/model/Body;->idfv:Ljava/lang/String;

    return-void
.end method

.method public setInsertId(Ljava/lang/String;)V
    .locals 0

    .line 880
    iput-object p1, p0, Lcom/ibotta/tracking/generated/model/Body;->insertId:Ljava/lang/String;

    return-void
.end method

.method public setIp(Ljava/lang/String;)V
    .locals 0

    .line 754
    iput-object p1, p0, Lcom/ibotta/tracking/generated/model/Body;->ip:Ljava/lang/String;

    return-void
.end method

.method public setLanguage(Ljava/lang/String;)V
    .locals 0

    .line 610
    iput-object p1, p0, Lcom/ibotta/tracking/generated/model/Body;->language:Ljava/lang/String;

    return-void
.end method

.method public setLocationLat(Ljava/lang/Float;)V
    .locals 0

    .line 718
    iput-object p1, p0, Lcom/ibotta/tracking/generated/model/Body;->locationLat:Ljava/lang/Float;

    return-void
.end method

.method public setLocationLng(Ljava/lang/Float;)V
    .locals 0

    .line 736
    iput-object p1, p0, Lcom/ibotta/tracking/generated/model/Body;->locationLng:Ljava/lang/Float;

    return-void
.end method

.method public setOsName(Ljava/lang/String;)V
    .locals 0

    .line 430
    iput-object p1, p0, Lcom/ibotta/tracking/generated/model/Body;->osName:Ljava/lang/String;

    return-void
.end method

.method public setOsVersion(Ljava/lang/String;)V
    .locals 0

    .line 448
    iput-object p1, p0, Lcom/ibotta/tracking/generated/model/Body;->osVersion:Ljava/lang/String;

    return-void
.end method

.method public setPlatform(Lcom/ibotta/tracking/generated/model/Body$PlatformEnum;)V
    .locals 0

    .line 412
    iput-object p1, p0, Lcom/ibotta/tracking/generated/model/Body;->platform:Lcom/ibotta/tracking/generated/model/Body$PlatformEnum;

    return-void
.end method

.method public setPrice(Ljava/lang/Float;)V
    .locals 0

    .line 628
    iput-object p1, p0, Lcom/ibotta/tracking/generated/model/Body;->price:Ljava/lang/Float;

    return-void
.end method

.method public setProductId(Ljava/lang/String;)V
    .locals 0

    .line 682
    iput-object p1, p0, Lcom/ibotta/tracking/generated/model/Body;->productId:Ljava/lang/String;

    return-void
.end method

.method public setQuantity(Ljava/lang/Float;)V
    .locals 0

    .line 646
    iput-object p1, p0, Lcom/ibotta/tracking/generated/model/Body;->quantity:Ljava/lang/Float;

    return-void
.end method

.method public setRegion(Ljava/lang/String;)V
    .locals 0

    .line 556
    iput-object p1, p0, Lcom/ibotta/tracking/generated/model/Body;->region:Ljava/lang/String;

    return-void
.end method

.method public setRevenue(Ljava/lang/Float;)V
    .locals 0

    .line 664
    iput-object p1, p0, Lcom/ibotta/tracking/generated/model/Body;->revenue:Ljava/lang/Float;

    return-void
.end method

.method public setRevenueType(Ljava/lang/String;)V
    .locals 0

    .line 700
    iput-object p1, p0, Lcom/ibotta/tracking/generated/model/Body;->revenueType:Ljava/lang/String;

    return-void
.end method

.method public setSessionId(Ljava/lang/Long;)V
    .locals 0

    .line 862
    iput-object p1, p0, Lcom/ibotta/tracking/generated/model/Body;->sessionId:Ljava/lang/Long;

    return-void
.end method

.method public setTime(Ljava/lang/Long;)V
    .locals 0

    .line 298
    iput-object p1, p0, Lcom/ibotta/tracking/generated/model/Body;->time:Ljava/lang/Long;

    return-void
.end method

.method public setUserId(Ljava/lang/String;)V
    .locals 0

    .line 243
    iput-object p1, p0, Lcom/ibotta/tracking/generated/model/Body;->userId:Ljava/lang/String;

    return-void
.end method

.method public setUserProperties(Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 350
    iput-object p1, p0, Lcom/ibotta/tracking/generated/model/Body;->userProperties:Ljava/util/Map;

    return-void
.end method

.method public time(Ljava/lang/Long;)Lcom/ibotta/tracking/generated/model/Body;
    .locals 0

    .line 283
    iput-object p1, p0, Lcom/ibotta/tracking/generated/model/Body;->time:Ljava/lang/Long;

    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 957
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "class Body {\n"

    .line 958
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "    userId: "

    .line 960
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/tracking/generated/model/Body;->userId:Ljava/lang/String;

    invoke-direct {p0, v1}, Lcom/ibotta/tracking/generated/model/Body;->toIndentedString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "    deviceId: "

    .line 961
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/tracking/generated/model/Body;->deviceId:Ljava/lang/String;

    invoke-direct {p0, v1}, Lcom/ibotta/tracking/generated/model/Body;->toIndentedString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "    eventType: "

    .line 962
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/tracking/generated/model/Body;->eventType:Ljava/lang/String;

    invoke-direct {p0, v1}, Lcom/ibotta/tracking/generated/model/Body;->toIndentedString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "    time: "

    .line 963
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/tracking/generated/model/Body;->time:Ljava/lang/Long;

    invoke-direct {p0, v1}, Lcom/ibotta/tracking/generated/model/Body;->toIndentedString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "    eventProperties: "

    .line 964
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/tracking/generated/model/Body;->eventProperties:Ljava/util/Map;

    invoke-direct {p0, v1}, Lcom/ibotta/tracking/generated/model/Body;->toIndentedString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "    userProperties: "

    .line 965
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/tracking/generated/model/Body;->userProperties:Ljava/util/Map;

    invoke-direct {p0, v1}, Lcom/ibotta/tracking/generated/model/Body;->toIndentedString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "    groups: "

    .line 966
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/tracking/generated/model/Body;->groups:Ljava/util/Map;

    invoke-direct {p0, v1}, Lcom/ibotta/tracking/generated/model/Body;->toIndentedString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "    appVersion: "

    .line 967
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/tracking/generated/model/Body;->appVersion:Ljava/lang/String;

    invoke-direct {p0, v1}, Lcom/ibotta/tracking/generated/model/Body;->toIndentedString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "    platform: "

    .line 968
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/tracking/generated/model/Body;->platform:Lcom/ibotta/tracking/generated/model/Body$PlatformEnum;

    invoke-direct {p0, v1}, Lcom/ibotta/tracking/generated/model/Body;->toIndentedString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "    osName: "

    .line 969
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/tracking/generated/model/Body;->osName:Ljava/lang/String;

    invoke-direct {p0, v1}, Lcom/ibotta/tracking/generated/model/Body;->toIndentedString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "    osVersion: "

    .line 970
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/tracking/generated/model/Body;->osVersion:Ljava/lang/String;

    invoke-direct {p0, v1}, Lcom/ibotta/tracking/generated/model/Body;->toIndentedString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "    deviceBrand: "

    .line 971
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/tracking/generated/model/Body;->deviceBrand:Ljava/lang/String;

    invoke-direct {p0, v1}, Lcom/ibotta/tracking/generated/model/Body;->toIndentedString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "    deviceManufacturer: "

    .line 972
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/tracking/generated/model/Body;->deviceManufacturer:Ljava/lang/String;

    invoke-direct {p0, v1}, Lcom/ibotta/tracking/generated/model/Body;->toIndentedString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "    deviceModel: "

    .line 973
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/tracking/generated/model/Body;->deviceModel:Ljava/lang/String;

    invoke-direct {p0, v1}, Lcom/ibotta/tracking/generated/model/Body;->toIndentedString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "    carrier: "

    .line 974
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/tracking/generated/model/Body;->carrier:Ljava/lang/String;

    invoke-direct {p0, v1}, Lcom/ibotta/tracking/generated/model/Body;->toIndentedString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "    country: "

    .line 975
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/tracking/generated/model/Body;->country:Ljava/lang/String;

    invoke-direct {p0, v1}, Lcom/ibotta/tracking/generated/model/Body;->toIndentedString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "    region: "

    .line 976
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/tracking/generated/model/Body;->region:Ljava/lang/String;

    invoke-direct {p0, v1}, Lcom/ibotta/tracking/generated/model/Body;->toIndentedString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "    city: "

    .line 977
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/tracking/generated/model/Body;->city:Ljava/lang/String;

    invoke-direct {p0, v1}, Lcom/ibotta/tracking/generated/model/Body;->toIndentedString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "    dma: "

    .line 978
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/tracking/generated/model/Body;->dma:Ljava/lang/String;

    invoke-direct {p0, v1}, Lcom/ibotta/tracking/generated/model/Body;->toIndentedString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "    language: "

    .line 979
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/tracking/generated/model/Body;->language:Ljava/lang/String;

    invoke-direct {p0, v1}, Lcom/ibotta/tracking/generated/model/Body;->toIndentedString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "    price: "

    .line 980
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/tracking/generated/model/Body;->price:Ljava/lang/Float;

    invoke-direct {p0, v1}, Lcom/ibotta/tracking/generated/model/Body;->toIndentedString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "    quantity: "

    .line 981
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/tracking/generated/model/Body;->quantity:Ljava/lang/Float;

    invoke-direct {p0, v1}, Lcom/ibotta/tracking/generated/model/Body;->toIndentedString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "    revenue: "

    .line 982
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/tracking/generated/model/Body;->revenue:Ljava/lang/Float;

    invoke-direct {p0, v1}, Lcom/ibotta/tracking/generated/model/Body;->toIndentedString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "    productId: "

    .line 983
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/tracking/generated/model/Body;->productId:Ljava/lang/String;

    invoke-direct {p0, v1}, Lcom/ibotta/tracking/generated/model/Body;->toIndentedString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "    revenueType: "

    .line 984
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/tracking/generated/model/Body;->revenueType:Ljava/lang/String;

    invoke-direct {p0, v1}, Lcom/ibotta/tracking/generated/model/Body;->toIndentedString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "    locationLat: "

    .line 985
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/tracking/generated/model/Body;->locationLat:Ljava/lang/Float;

    invoke-direct {p0, v1}, Lcom/ibotta/tracking/generated/model/Body;->toIndentedString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "    locationLng: "

    .line 986
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/tracking/generated/model/Body;->locationLng:Ljava/lang/Float;

    invoke-direct {p0, v1}, Lcom/ibotta/tracking/generated/model/Body;->toIndentedString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "    ip: "

    .line 987
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/tracking/generated/model/Body;->ip:Ljava/lang/String;

    invoke-direct {p0, v1}, Lcom/ibotta/tracking/generated/model/Body;->toIndentedString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "    idfa: "

    .line 988
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/tracking/generated/model/Body;->idfa:Ljava/lang/String;

    invoke-direct {p0, v1}, Lcom/ibotta/tracking/generated/model/Body;->toIndentedString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "    idfv: "

    .line 989
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/tracking/generated/model/Body;->idfv:Ljava/lang/String;

    invoke-direct {p0, v1}, Lcom/ibotta/tracking/generated/model/Body;->toIndentedString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "    androidId: "

    .line 990
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/tracking/generated/model/Body;->androidId:Ljava/lang/String;

    invoke-direct {p0, v1}, Lcom/ibotta/tracking/generated/model/Body;->toIndentedString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "    adid: "

    .line 991
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/tracking/generated/model/Body;->adid:Ljava/lang/String;

    invoke-direct {p0, v1}, Lcom/ibotta/tracking/generated/model/Body;->toIndentedString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "    eventId: "

    .line 992
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/tracking/generated/model/Body;->eventId:Ljava/lang/Integer;

    invoke-direct {p0, v1}, Lcom/ibotta/tracking/generated/model/Body;->toIndentedString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "    sessionId: "

    .line 993
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/tracking/generated/model/Body;->sessionId:Ljava/lang/Long;

    invoke-direct {p0, v1}, Lcom/ibotta/tracking/generated/model/Body;->toIndentedString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "    insertId: "

    .line 994
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/tracking/generated/model/Body;->insertId:Ljava/lang/String;

    invoke-direct {p0, v1}, Lcom/ibotta/tracking/generated/model/Body;->toIndentedString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "    fake: "

    .line 995
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/tracking/generated/model/Body;->fake:Ljava/lang/Boolean;

    invoke-direct {p0, v1}, Lcom/ibotta/tracking/generated/model/Body;->toIndentedString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    .line 996
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 997
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public userId(Ljava/lang/String;)Lcom/ibotta/tracking/generated/model/Body;
    .locals 0

    .line 229
    iput-object p1, p0, Lcom/ibotta/tracking/generated/model/Body;->userId:Ljava/lang/String;

    return-object p0
.end method

.method public userProperties(Ljava/util/Map;)Lcom/ibotta/tracking/generated/model/Body;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Lcom/ibotta/tracking/generated/model/Body;"
        }
    .end annotation

    .line 328
    iput-object p1, p0, Lcom/ibotta/tracking/generated/model/Body;->userProperties:Ljava/util/Map;

    return-object p0
.end method
