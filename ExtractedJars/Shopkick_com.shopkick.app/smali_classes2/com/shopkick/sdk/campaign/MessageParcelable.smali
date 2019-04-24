.class public final Lcom/shopkick/sdk/campaign/MessageParcelable;
.super Ljava/lang/Object;
.source "MessageParcelable.java"

# interfaces
.implements Lcom/shopkick/sdk/campaign/Message;
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/shopkick/sdk/campaign/MessageParcelable;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final backgroundType:Lcom/shopkick/sdk/campaign/Message$MessageBackgroundType;

.field private final campaignId:Ljava/lang/String;

.field private final endTime:D

.field private final foregroundDeepLink:Ljava/lang/String;

.field private final foregroundType:Lcom/shopkick/sdk/campaign/Message$MessageForegroundType;

.field private final maxProximityInMeters:D

.field private final messageId:Ljava/lang/String;

.field private final notificationDeepLink:Ljava/lang/String;

.field private final notificationLogoImageUrl:Ljava/lang/String;

.field private final notificationOverlayImageUrl:Ljava/lang/String;

.field private final notificationOverlayText:Ljava/lang/String;

.field private final notificationText:Ljava/lang/String;

.field private final notificationTitle:Ljava/lang/String;

.field private final overlayImageUrl:Ljava/lang/String;

.field private final overlayLogoUrl:Ljava/lang/String;

.field private final overlayText:Ljava/lang/String;

.field private final startTime:D

.field private final zoneQuery:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 271
    new-instance v0, Lcom/shopkick/sdk/campaign/MessageParcelable$1;

    invoke-direct {v0}, Lcom/shopkick/sdk/campaign/MessageParcelable$1;-><init>()V

    sput-object v0, Lcom/shopkick/sdk/campaign/MessageParcelable;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .locals 2

    .line 49
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 50
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/sdk/campaign/MessageParcelable;->campaignId:Ljava/lang/String;

    .line 51
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/sdk/campaign/MessageParcelable;->messageId:Ljava/lang/String;

    .line 52
    invoke-static {}, Lcom/shopkick/sdk/campaign/Message$MessageBackgroundType;->values()[Lcom/shopkick/sdk/campaign/Message$MessageBackgroundType;

    move-result-object v0

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    aget-object v0, v0, v1

    iput-object v0, p0, Lcom/shopkick/sdk/campaign/MessageParcelable;->backgroundType:Lcom/shopkick/sdk/campaign/Message$MessageBackgroundType;

    .line 53
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/sdk/campaign/MessageParcelable;->notificationTitle:Ljava/lang/String;

    .line 54
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/sdk/campaign/MessageParcelable;->notificationText:Ljava/lang/String;

    .line 55
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/sdk/campaign/MessageParcelable;->notificationDeepLink:Ljava/lang/String;

    .line 56
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/sdk/campaign/MessageParcelable;->notificationLogoImageUrl:Ljava/lang/String;

    .line 57
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/sdk/campaign/MessageParcelable;->notificationOverlayImageUrl:Ljava/lang/String;

    .line 58
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/sdk/campaign/MessageParcelable;->notificationOverlayText:Ljava/lang/String;

    .line 59
    invoke-static {}, Lcom/shopkick/sdk/campaign/Message$MessageForegroundType;->values()[Lcom/shopkick/sdk/campaign/Message$MessageForegroundType;

    move-result-object v0

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    aget-object v0, v0, v1

    iput-object v0, p0, Lcom/shopkick/sdk/campaign/MessageParcelable;->foregroundType:Lcom/shopkick/sdk/campaign/Message$MessageForegroundType;

    .line 60
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/sdk/campaign/MessageParcelable;->overlayImageUrl:Ljava/lang/String;

    .line 61
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/sdk/campaign/MessageParcelable;->overlayLogoUrl:Ljava/lang/String;

    .line 62
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/sdk/campaign/MessageParcelable;->overlayText:Ljava/lang/String;

    .line 63
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/sdk/campaign/MessageParcelable;->foregroundDeepLink:Ljava/lang/String;

    .line 64
    invoke-virtual {p1}, Landroid/os/Parcel;->readDouble()D

    move-result-wide v0

    iput-wide v0, p0, Lcom/shopkick/sdk/campaign/MessageParcelable;->maxProximityInMeters:D

    .line 65
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/sdk/campaign/MessageParcelable;->zoneQuery:Ljava/lang/String;

    .line 66
    invoke-virtual {p1}, Landroid/os/Parcel;->readDouble()D

    move-result-wide v0

    iput-wide v0, p0, Lcom/shopkick/sdk/campaign/MessageParcelable;->startTime:D

    .line 67
    invoke-virtual {p1}, Landroid/os/Parcel;->readDouble()D

    move-result-wide v0

    iput-wide v0, p0, Lcom/shopkick/sdk/campaign/MessageParcelable;->endTime:D

    return-void
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;Lcom/shopkick/sdk/campaign/MessageParcelable$1;)V
    .locals 0

    .line 8
    invoke-direct {p0, p1}, Lcom/shopkick/sdk/campaign/MessageParcelable;-><init>(Landroid/os/Parcel;)V

    return-void
.end method

.method constructor <init>(Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$Message;)V
    .locals 2

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    iget-object v0, p1, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$Message;->campaignId:Ljava/lang/String;

    iput-object v0, p0, Lcom/shopkick/sdk/campaign/MessageParcelable;->campaignId:Ljava/lang/String;

    .line 30
    iget-object v0, p1, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$Message;->messageId:Ljava/lang/String;

    iput-object v0, p0, Lcom/shopkick/sdk/campaign/MessageParcelable;->messageId:Ljava/lang/String;

    .line 31
    iget-object v0, p1, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$Message;->backgroundType:Ljava/lang/Integer;

    invoke-static {v0}, Lcom/shopkick/sdk/campaign/Message$MessageBackgroundType;->translateBackgroundType(Ljava/lang/Integer;)Lcom/shopkick/sdk/campaign/Message$MessageBackgroundType;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/sdk/campaign/MessageParcelable;->backgroundType:Lcom/shopkick/sdk/campaign/Message$MessageBackgroundType;

    .line 32
    iget-object v0, p1, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$Message;->notificationTitle:Ljava/lang/String;

    iput-object v0, p0, Lcom/shopkick/sdk/campaign/MessageParcelable;->notificationTitle:Ljava/lang/String;

    .line 33
    iget-object v0, p1, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$Message;->notificationText:Ljava/lang/String;

    iput-object v0, p0, Lcom/shopkick/sdk/campaign/MessageParcelable;->notificationText:Ljava/lang/String;

    .line 34
    iget-object v0, p1, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$Message;->notificationDeepLink:Ljava/lang/String;

    iput-object v0, p0, Lcom/shopkick/sdk/campaign/MessageParcelable;->notificationDeepLink:Ljava/lang/String;

    .line 35
    iget-object v0, p1, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$Message;->notificationLogoImageUrl:Ljava/lang/String;

    iput-object v0, p0, Lcom/shopkick/sdk/campaign/MessageParcelable;->notificationLogoImageUrl:Ljava/lang/String;

    .line 36
    iget-object v0, p1, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$Message;->notificationOverlayImageUrl:Ljava/lang/String;

    iput-object v0, p0, Lcom/shopkick/sdk/campaign/MessageParcelable;->notificationOverlayImageUrl:Ljava/lang/String;

    .line 37
    iget-object v0, p1, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$Message;->notificationOverlayText:Ljava/lang/String;

    iput-object v0, p0, Lcom/shopkick/sdk/campaign/MessageParcelable;->notificationOverlayText:Ljava/lang/String;

    .line 38
    iget-object v0, p1, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$Message;->foregroundType:Ljava/lang/Integer;

    invoke-static {v0}, Lcom/shopkick/sdk/campaign/Message$MessageForegroundType;->translateForegroundType(Ljava/lang/Integer;)Lcom/shopkick/sdk/campaign/Message$MessageForegroundType;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/sdk/campaign/MessageParcelable;->foregroundType:Lcom/shopkick/sdk/campaign/Message$MessageForegroundType;

    .line 39
    iget-object v0, p1, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$Message;->overlayImageUrl:Ljava/lang/String;

    iput-object v0, p0, Lcom/shopkick/sdk/campaign/MessageParcelable;->overlayImageUrl:Ljava/lang/String;

    .line 40
    iget-object v0, p1, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$Message;->logoImageUrl:Ljava/lang/String;

    iput-object v0, p0, Lcom/shopkick/sdk/campaign/MessageParcelable;->overlayLogoUrl:Ljava/lang/String;

    .line 41
    iget-object v0, p1, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$Message;->overlayText:Ljava/lang/String;

    iput-object v0, p0, Lcom/shopkick/sdk/campaign/MessageParcelable;->overlayText:Ljava/lang/String;

    .line 42
    iget-object v0, p1, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$Message;->foregroundDeepLink:Ljava/lang/String;

    iput-object v0, p0, Lcom/shopkick/sdk/campaign/MessageParcelable;->foregroundDeepLink:Ljava/lang/String;

    .line 43
    iget-object v0, p1, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$Message;->maxProximityInMeters:Ljava/lang/Double;

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    iput-wide v0, p0, Lcom/shopkick/sdk/campaign/MessageParcelable;->maxProximityInMeters:D

    .line 44
    iget-object v0, p1, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$Message;->zoneQuery:Ljava/lang/String;

    iput-object v0, p0, Lcom/shopkick/sdk/campaign/MessageParcelable;->zoneQuery:Ljava/lang/String;

    .line 45
    iget-object v0, p1, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$Message;->start:Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    long-to-double v0, v0

    iput-wide v0, p0, Lcom/shopkick/sdk/campaign/MessageParcelable;->startTime:D

    .line 46
    iget-object p1, p1, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$Message;->end:Ljava/lang/Long;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    long-to-double v0, v0

    iput-wide v0, p0, Lcom/shopkick/sdk/campaign/MessageParcelable;->endTime:D

    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_7

    .line 228
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_3

    .line 230
    :cond_1
    check-cast p1, Lcom/shopkick/sdk/campaign/MessageParcelable;

    .line 232
    iget-object v2, p0, Lcom/shopkick/sdk/campaign/MessageParcelable;->messageId:Ljava/lang/String;

    if-eqz v2, :cond_2

    iget-object v3, p1, Lcom/shopkick/sdk/campaign/MessageParcelable;->messageId:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    goto :goto_0

    :cond_2
    iget-object v2, p1, Lcom/shopkick/sdk/campaign/MessageParcelable;->messageId:Ljava/lang/String;

    if-eqz v2, :cond_3

    :goto_0
    return v1

    .line 233
    :cond_3
    iget-object v2, p0, Lcom/shopkick/sdk/campaign/MessageParcelable;->campaignId:Ljava/lang/String;

    if-eqz v2, :cond_4

    iget-object p1, p1, Lcom/shopkick/sdk/campaign/MessageParcelable;->campaignId:Ljava/lang/String;

    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    goto :goto_1

    :cond_4
    iget-object p1, p1, Lcom/shopkick/sdk/campaign/MessageParcelable;->campaignId:Ljava/lang/String;

    if-nez p1, :cond_5

    goto :goto_2

    :cond_5
    :goto_1
    move v0, v1

    :cond_6
    :goto_2
    return v0

    :cond_7
    :goto_3
    return v1
.end method

.method public getBackgroundType()Lcom/shopkick/sdk/campaign/Message$MessageBackgroundType;
    .locals 1

    .line 95
    iget-object v0, p0, Lcom/shopkick/sdk/campaign/MessageParcelable;->backgroundType:Lcom/shopkick/sdk/campaign/Message$MessageBackgroundType;

    return-object v0
.end method

.method public getCampaignId()Ljava/lang/String;
    .locals 1

    .line 83
    iget-object v0, p0, Lcom/shopkick/sdk/campaign/MessageParcelable;->campaignId:Ljava/lang/String;

    return-object v0
.end method

.method public getEndTime()D
    .locals 2

    .line 207
    iget-wide v0, p0, Lcom/shopkick/sdk/campaign/MessageParcelable;->endTime:D

    return-wide v0
.end method

.method public getForegroundDeepLink()Ljava/lang/String;
    .locals 1

    .line 187
    iget-object v0, p0, Lcom/shopkick/sdk/campaign/MessageParcelable;->foregroundDeepLink:Ljava/lang/String;

    return-object v0
.end method

.method public getForegroundType()Lcom/shopkick/sdk/campaign/Message$MessageForegroundType;
    .locals 1

    .line 155
    iget-object v0, p0, Lcom/shopkick/sdk/campaign/MessageParcelable;->foregroundType:Lcom/shopkick/sdk/campaign/Message$MessageForegroundType;

    return-object v0
.end method

.method public getMaxProximityInMeters()D
    .locals 2

    .line 199
    iget-wide v0, p0, Lcom/shopkick/sdk/campaign/MessageParcelable;->maxProximityInMeters:D

    return-wide v0
.end method

.method public getMessageId()Ljava/lang/String;
    .locals 1

    .line 75
    iget-object v0, p0, Lcom/shopkick/sdk/campaign/MessageParcelable;->messageId:Ljava/lang/String;

    return-object v0
.end method

.method public getNotificationDeepLink()Ljava/lang/String;
    .locals 1

    .line 119
    iget-object v0, p0, Lcom/shopkick/sdk/campaign/MessageParcelable;->notificationDeepLink:Ljava/lang/String;

    return-object v0
.end method

.method public getNotificationLogoImageUrl()Ljava/lang/String;
    .locals 1

    .line 135
    iget-object v0, p0, Lcom/shopkick/sdk/campaign/MessageParcelable;->notificationLogoImageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getNotificationOverlayImageUrl()Ljava/lang/String;
    .locals 1

    .line 143
    iget-object v0, p0, Lcom/shopkick/sdk/campaign/MessageParcelable;->notificationOverlayImageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getNotificationOverlayText()Ljava/lang/String;
    .locals 1

    .line 127
    iget-object v0, p0, Lcom/shopkick/sdk/campaign/MessageParcelable;->notificationOverlayText:Ljava/lang/String;

    return-object v0
.end method

.method public getNotificationText()Ljava/lang/String;
    .locals 1

    .line 111
    iget-object v0, p0, Lcom/shopkick/sdk/campaign/MessageParcelable;->notificationText:Ljava/lang/String;

    return-object v0
.end method

.method public getNotificationTitle()Ljava/lang/String;
    .locals 1

    .line 103
    iget-object v0, p0, Lcom/shopkick/sdk/campaign/MessageParcelable;->notificationTitle:Ljava/lang/String;

    return-object v0
.end method

.method public getOverlayImageUrl()Ljava/lang/String;
    .locals 1

    .line 163
    iget-object v0, p0, Lcom/shopkick/sdk/campaign/MessageParcelable;->overlayImageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getOverlayLogoUrl()Ljava/lang/String;
    .locals 1

    .line 171
    iget-object v0, p0, Lcom/shopkick/sdk/campaign/MessageParcelable;->overlayLogoUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getOverlayText()Ljava/lang/String;
    .locals 1

    .line 179
    iget-object v0, p0, Lcom/shopkick/sdk/campaign/MessageParcelable;->overlayText:Ljava/lang/String;

    return-object v0
.end method

.method public getStartTime()D
    .locals 2

    .line 203
    iget-wide v0, p0, Lcom/shopkick/sdk/campaign/MessageParcelable;->startTime:D

    return-wide v0
.end method

.method public getZoneQuery()Ljava/lang/String;
    .locals 1

    .line 195
    iget-object v0, p0, Lcom/shopkick/sdk/campaign/MessageParcelable;->zoneQuery:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    .line 239
    iget-object v0, p0, Lcom/shopkick/sdk/campaign/MessageParcelable;->messageId:Ljava/lang/String;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    .line 240
    iget-object v2, p0, Lcom/shopkick/sdk/campaign/MessageParcelable;->campaignId:Ljava/lang/String;

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v1

    :cond_1
    add-int/2addr v0, v1

    return v0
.end method

.method public isCampaignActive()Z
    .locals 4

    .line 211
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    long-to-double v0, v0

    .line 212
    iget-wide v2, p0, Lcom/shopkick/sdk/campaign/MessageParcelable;->startTime:D

    cmpg-double v2, v2, v0

    if-gez v2, :cond_0

    iget-wide v2, p0, Lcom/shopkick/sdk/campaign/MessageParcelable;->endTime:D

    cmpg-double v0, v0, v2

    if-gez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 218
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "MessageParcelable{messageID=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/shopkick/sdk/campaign/MessageParcelable;->messageId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", notificationTitle=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/shopkick/sdk/campaign/MessageParcelable;->notificationTitle:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", overlayText=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/shopkick/sdk/campaign/MessageParcelable;->overlayText:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    .line 251
    iget-object p2, p0, Lcom/shopkick/sdk/campaign/MessageParcelable;->campaignId:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 252
    iget-object p2, p0, Lcom/shopkick/sdk/campaign/MessageParcelable;->messageId:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 253
    iget-object p2, p0, Lcom/shopkick/sdk/campaign/MessageParcelable;->backgroundType:Lcom/shopkick/sdk/campaign/Message$MessageBackgroundType;

    invoke-virtual {p2}, Lcom/shopkick/sdk/campaign/Message$MessageBackgroundType;->ordinal()I

    move-result p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 254
    iget-object p2, p0, Lcom/shopkick/sdk/campaign/MessageParcelable;->notificationTitle:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 255
    iget-object p2, p0, Lcom/shopkick/sdk/campaign/MessageParcelable;->notificationText:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 256
    iget-object p2, p0, Lcom/shopkick/sdk/campaign/MessageParcelable;->notificationDeepLink:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 257
    iget-object p2, p0, Lcom/shopkick/sdk/campaign/MessageParcelable;->notificationLogoImageUrl:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 258
    iget-object p2, p0, Lcom/shopkick/sdk/campaign/MessageParcelable;->notificationOverlayImageUrl:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 259
    iget-object p2, p0, Lcom/shopkick/sdk/campaign/MessageParcelable;->notificationOverlayText:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 260
    iget-object p2, p0, Lcom/shopkick/sdk/campaign/MessageParcelable;->foregroundType:Lcom/shopkick/sdk/campaign/Message$MessageForegroundType;

    invoke-virtual {p2}, Lcom/shopkick/sdk/campaign/Message$MessageForegroundType;->ordinal()I

    move-result p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 261
    iget-object p2, p0, Lcom/shopkick/sdk/campaign/MessageParcelable;->overlayImageUrl:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 262
    iget-object p2, p0, Lcom/shopkick/sdk/campaign/MessageParcelable;->overlayLogoUrl:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 263
    iget-object p2, p0, Lcom/shopkick/sdk/campaign/MessageParcelable;->overlayText:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 264
    iget-object p2, p0, Lcom/shopkick/sdk/campaign/MessageParcelable;->foregroundDeepLink:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 265
    iget-wide v0, p0, Lcom/shopkick/sdk/campaign/MessageParcelable;->maxProximityInMeters:D

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeDouble(D)V

    .line 266
    iget-object p2, p0, Lcom/shopkick/sdk/campaign/MessageParcelable;->zoneQuery:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 267
    iget-wide v0, p0, Lcom/shopkick/sdk/campaign/MessageParcelable;->startTime:D

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeDouble(D)V

    .line 268
    iget-wide v0, p0, Lcom/shopkick/sdk/campaign/MessageParcelable;->endTime:D

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeDouble(D)V

    return-void
.end method
