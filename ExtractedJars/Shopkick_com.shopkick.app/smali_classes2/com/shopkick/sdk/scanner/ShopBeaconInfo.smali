.class public Lcom/shopkick/sdk/scanner/ShopBeaconInfo;
.super Ljava/lang/Object;
.source "ShopBeaconInfo.java"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/sdk/scanner/ShopBeaconInfo$Stat;
    }
.end annotation


# static fields
.field public static final SIGNAL_STRENGTH_PERCENTILE:I = 0x32


# instance fields
.field public final beaconData:Ljava/lang/String;

.field public deviceId:I

.field private final proximityPadding:I

.field final updatedStats:Ljava/util/Stack;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Stack<",
            "Lcom/shopkick/sdk/scanner/ShopBeaconInfo$Stat;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(ILcom/shopkick/sdk/scanner/Beacon;Z)V
    .locals 1

    .line 53
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 54
    new-instance v0, Ljava/util/Stack;

    invoke-direct {v0}, Ljava/util/Stack;-><init>()V

    iput-object v0, p0, Lcom/shopkick/sdk/scanner/ShopBeaconInfo;->updatedStats:Ljava/util/Stack;

    .line 56
    iput p1, p0, Lcom/shopkick/sdk/scanner/ShopBeaconInfo;->proximityPadding:I

    .line 57
    invoke-virtual {p2}, Lcom/shopkick/sdk/scanner/Beacon;->getHexData()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/sdk/scanner/ShopBeaconInfo;->beaconData:Ljava/lang/String;

    .line 59
    invoke-virtual {p0, p2, p3}, Lcom/shopkick/sdk/scanner/ShopBeaconInfo;->update(Lcom/shopkick/sdk/scanner/Beacon;Z)Lcom/shopkick/sdk/scanner/ShopBeaconInfo$Stat;

    return-void
.end method

.method private getBatteryLevel(I)I
    .locals 1

    const/16 v0, 0x64

    if-le p1, v0, :cond_0

    move p1, v0

    :cond_0
    return p1
.end method

.method private getMotion(Lcom/shopkick/sdk/zone/ble/Proximity;)Lcom/shopkick/sdk/zone/ble/Motion;
    .locals 3

    .line 158
    invoke-virtual {p0}, Lcom/shopkick/sdk/scanner/ShopBeaconInfo;->getLatestInfo()Lcom/shopkick/sdk/scanner/ShopBeaconInfo$Stat;

    move-result-object v0

    if-nez v0, :cond_0

    .line 160
    sget-object p1, Lcom/shopkick/sdk/zone/ble/Motion;->Unknown:Lcom/shopkick/sdk/zone/ble/Motion;

    return-object p1

    .line 162
    :cond_0
    iget-object v0, v0, Lcom/shopkick/sdk/scanner/ShopBeaconInfo$Stat;->proximity:Lcom/shopkick/sdk/zone/ble/Proximity;

    .line 163
    sget-object v1, Lcom/shopkick/sdk/scanner/ShopBeaconInfo$1;->$SwitchMap$com$shopkick$sdk$zone$ble$Proximity:[I

    invoke-virtual {v0}, Lcom/shopkick/sdk/zone/ble/Proximity;->ordinal()I

    move-result v2

    aget v1, v1, v2

    packed-switch v1, :pswitch_data_0

    if-ne v0, p1, :cond_1

    .line 170
    sget-object p1, Lcom/shopkick/sdk/zone/ble/Motion;->Stationary:Lcom/shopkick/sdk/zone/ble/Motion;

    return-object p1

    .line 167
    :pswitch_0
    sget-object p1, Lcom/shopkick/sdk/zone/ble/Motion;->Unknown:Lcom/shopkick/sdk/zone/ble/Motion;

    return-object p1

    .line 171
    :cond_1
    invoke-virtual {p1}, Lcom/shopkick/sdk/zone/ble/Proximity;->getMinThreshold()I

    move-result v1

    invoke-virtual {v0}, Lcom/shopkick/sdk/zone/ble/Proximity;->getMinThreshold()I

    move-result v2

    if-ge v1, v2, :cond_2

    .line 172
    sget-object p1, Lcom/shopkick/sdk/zone/ble/Motion;->MovingAway:Lcom/shopkick/sdk/zone/ble/Motion;

    return-object p1

    .line 173
    :cond_2
    invoke-virtual {p1}, Lcom/shopkick/sdk/zone/ble/Proximity;->getMinThreshold()I

    move-result p1

    invoke-virtual {v0}, Lcom/shopkick/sdk/zone/ble/Proximity;->getMinThreshold()I

    move-result v0

    if-le p1, v0, :cond_3

    .line 174
    sget-object p1, Lcom/shopkick/sdk/zone/ble/Motion;->MovingToward:Lcom/shopkick/sdk/zone/ble/Motion;

    return-object p1

    .line 176
    :cond_3
    sget-object p1, Lcom/shopkick/sdk/zone/ble/Motion;->Unknown:Lcom/shopkick/sdk/zone/ble/Motion;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method private inProximity(ILcom/shopkick/sdk/zone/ble/Proximity;Lcom/shopkick/sdk/zone/ble/Proximity;Lcom/shopkick/sdk/zone/ble/Proximity;Lcom/shopkick/sdk/zone/ble/Proximity;)Z
    .locals 2

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-nez p3, :cond_1

    .line 133
    invoke-virtual {p2}, Lcom/shopkick/sdk/zone/ble/Proximity;->getMinThreshold()I

    move-result p2

    if-lt p1, p2, :cond_0

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    return v0

    :cond_1
    if-ne p2, p3, :cond_3

    .line 135
    invoke-virtual {p3}, Lcom/shopkick/sdk/zone/ble/Proximity;->getMinThreshold()I

    move-result p2

    iget p3, p0, Lcom/shopkick/sdk/scanner/ShopBeaconInfo;->proximityPadding:I

    sub-int/2addr p2, p3

    if-le p1, p2, :cond_2

    .line 136
    invoke-virtual {p4}, Lcom/shopkick/sdk/zone/ble/Proximity;->getMinThreshold()I

    move-result p2

    iget p3, p0, Lcom/shopkick/sdk/scanner/ShopBeaconInfo;->proximityPadding:I

    add-int/2addr p2, p3

    if-ge p1, p2, :cond_2

    goto :goto_1

    :cond_2
    move v0, v1

    :goto_1
    return v0

    :cond_3
    if-ne p3, p4, :cond_5

    .line 138
    invoke-virtual {p2}, Lcom/shopkick/sdk/zone/ble/Proximity;->getMinThreshold()I

    move-result p2

    if-le p1, p2, :cond_4

    .line 139
    invoke-virtual {p4}, Lcom/shopkick/sdk/zone/ble/Proximity;->getMinThreshold()I

    move-result p2

    iget p3, p0, Lcom/shopkick/sdk/scanner/ShopBeaconInfo;->proximityPadding:I

    sub-int/2addr p2, p3

    if-ge p1, p2, :cond_4

    goto :goto_2

    :cond_4
    move v0, v1

    :goto_2
    return v0

    :cond_5
    if-ne p3, p5, :cond_7

    .line 141
    invoke-virtual {p2}, Lcom/shopkick/sdk/zone/ble/Proximity;->getMinThreshold()I

    move-result p2

    iget p3, p0, Lcom/shopkick/sdk/scanner/ShopBeaconInfo;->proximityPadding:I

    add-int/2addr p2, p3

    if-le p1, p2, :cond_6

    .line 142
    invoke-virtual {p4}, Lcom/shopkick/sdk/zone/ble/Proximity;->getMinThreshold()I

    move-result p2

    if-le p1, p2, :cond_6

    goto :goto_3

    :cond_6
    move v0, v1

    :goto_3
    return v0

    .line 144
    :cond_7
    invoke-virtual {p2}, Lcom/shopkick/sdk/zone/ble/Proximity;->getMinThreshold()I

    move-result p2

    if-lt p1, p2, :cond_8

    .line 145
    invoke-virtual {p4}, Lcom/shopkick/sdk/zone/ble/Proximity;->getMinThreshold()I

    move-result p2

    if-ge p1, p2, :cond_8

    goto :goto_4

    :cond_8
    move v0, v1

    :goto_4
    return v0
.end method

.method private roundToSeconds(J)J
    .locals 2

    const-wide/16 v0, 0x1f4

    add-long/2addr p1, v0

    const-wide/16 v0, 0x3e8

    .line 234
    div-long/2addr p1, v0

    return-wide p1
.end method


# virtual methods
.method public createLatestInfo(Lcom/shopkick/sdk/scanner/Beacon;Z)Lcom/shopkick/sdk/scanner/ShopBeaconInfo$Stat;
    .locals 10

    const-wide/high16 v0, 0x4049000000000000L    # 50.0

    .line 69
    invoke-virtual {p1, v0, v1}, Lcom/shopkick/sdk/scanner/Beacon;->getSignalStrength(D)I

    move-result v6

    .line 70
    invoke-virtual {p0, v6}, Lcom/shopkick/sdk/scanner/ShopBeaconInfo;->getProximity(I)Lcom/shopkick/sdk/zone/ble/Proximity;

    move-result-object v7

    .line 71
    invoke-virtual {p1}, Lcom/shopkick/sdk/scanner/Beacon;->getBatteryPercentage()I

    move-result p1

    invoke-direct {p0, p1}, Lcom/shopkick/sdk/scanner/ShopBeaconInfo;->getBatteryLevel(I)I

    move-result v8

    .line 72
    invoke-direct {p0, v7}, Lcom/shopkick/sdk/scanner/ShopBeaconInfo;->getMotion(Lcom/shopkick/sdk/zone/ble/Proximity;)Lcom/shopkick/sdk/zone/ble/Motion;

    move-result-object v9

    .line 73
    new-instance p1, Lcom/shopkick/sdk/scanner/ShopBeaconInfo$Stat;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    move-object v2, p1

    move v5, p2

    invoke-direct/range {v2 .. v9}, Lcom/shopkick/sdk/scanner/ShopBeaconInfo$Stat;-><init>(JZILcom/shopkick/sdk/zone/ble/Proximity;ILcom/shopkick/sdk/zone/ble/Motion;)V

    return-object p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    .line 243
    :cond_0
    instance-of v1, p1, Lcom/shopkick/sdk/scanner/ShopBeaconInfo;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    .line 245
    :cond_1
    check-cast p1, Lcom/shopkick/sdk/scanner/ShopBeaconInfo;

    .line 247
    iget v1, p0, Lcom/shopkick/sdk/scanner/ShopBeaconInfo;->deviceId:I

    iget p1, p1, Lcom/shopkick/sdk/scanner/ShopBeaconInfo;->deviceId:I

    if-ne v1, p1, :cond_2

    goto :goto_0

    :cond_2
    move v0, v2

    :goto_0
    return v0
.end method

.method public getDeviceId()I
    .locals 1

    .line 188
    iget v0, p0, Lcom/shopkick/sdk/scanner/ShopBeaconInfo;->deviceId:I

    return v0
.end method

.method public getDwellTimeForProximity(Lcom/shopkick/sdk/zone/ble/Proximity;)J
    .locals 9

    .line 223
    iget-object v0, p0, Lcom/shopkick/sdk/scanner/ShopBeaconInfo;->updatedStats:Ljava/util/Stack;

    invoke-virtual {v0}, Ljava/util/Stack;->firstElement()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/sdk/scanner/ShopBeaconInfo$Stat;

    .line 224
    iget-object v1, p0, Lcom/shopkick/sdk/scanner/ShopBeaconInfo;->updatedStats:Ljava/util/Stack;

    invoke-virtual {v1}, Ljava/util/Stack;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const-wide/16 v2, 0x0

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/shopkick/sdk/scanner/ShopBeaconInfo$Stat;

    .line 225
    iget-object v5, v0, Lcom/shopkick/sdk/scanner/ShopBeaconInfo$Stat;->proximity:Lcom/shopkick/sdk/zone/ble/Proximity;

    if-eq v5, p1, :cond_0

    sget-object v5, Lcom/shopkick/sdk/zone/ble/Proximity;->Combined:Lcom/shopkick/sdk/zone/ble/Proximity;

    if-ne p1, v5, :cond_1

    .line 226
    :cond_0
    iget-wide v5, v4, Lcom/shopkick/sdk/scanner/ShopBeaconInfo$Stat;->entryTimestamp:J

    iget-wide v7, v0, Lcom/shopkick/sdk/scanner/ShopBeaconInfo$Stat;->entryTimestamp:J

    sub-long/2addr v5, v7

    invoke-direct {p0, v5, v6}, Lcom/shopkick/sdk/scanner/ShopBeaconInfo;->roundToSeconds(J)J

    move-result-wide v5

    add-long/2addr v2, v5

    :cond_1
    move-object v0, v4

    goto :goto_0

    :cond_2
    return-wide v2
.end method

.method getLatestInfo()Lcom/shopkick/sdk/scanner/ShopBeaconInfo$Stat;
    .locals 2

    .line 154
    iget-object v0, p0, Lcom/shopkick/sdk/scanner/ShopBeaconInfo;->updatedStats:Ljava/util/Stack;

    invoke-virtual {v0}, Ljava/util/Stack;->size()I

    move-result v0

    if-lez v0, :cond_0

    iget-object v0, p0, Lcom/shopkick/sdk/scanner/ShopBeaconInfo;->updatedStats:Ljava/util/Stack;

    invoke-virtual {v0}, Ljava/util/Stack;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1}, Ljava/util/Stack;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/sdk/scanner/ShopBeaconInfo$Stat;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public getMotion()Lcom/shopkick/sdk/zone/ble/Motion;
    .locals 1

    .line 200
    invoke-virtual {p0}, Lcom/shopkick/sdk/scanner/ShopBeaconInfo;->getLatestInfo()Lcom/shopkick/sdk/scanner/ShopBeaconInfo$Stat;

    move-result-object v0

    iget-object v0, v0, Lcom/shopkick/sdk/scanner/ShopBeaconInfo$Stat;->motion:Lcom/shopkick/sdk/zone/ble/Motion;

    return-object v0
.end method

.method public getProximity()Lcom/shopkick/sdk/zone/ble/Proximity;
    .locals 1

    .line 196
    invoke-virtual {p0}, Lcom/shopkick/sdk/scanner/ShopBeaconInfo;->getLatestInfo()Lcom/shopkick/sdk/scanner/ShopBeaconInfo$Stat;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/shopkick/sdk/scanner/ShopBeaconInfo;->getLatestInfo()Lcom/shopkick/sdk/scanner/ShopBeaconInfo$Stat;

    move-result-object v0

    iget-object v0, v0, Lcom/shopkick/sdk/scanner/ShopBeaconInfo$Stat;->proximity:Lcom/shopkick/sdk/zone/ble/Proximity;

    :goto_0
    return-object v0
.end method

.method public getProximity(I)Lcom/shopkick/sdk/zone/ble/Proximity;
    .locals 7

    if-ltz p1, :cond_0

    .line 100
    sget-object p1, Lcom/shopkick/sdk/zone/ble/Proximity;->Expired:Lcom/shopkick/sdk/zone/ble/Proximity;

    return-object p1

    .line 103
    :cond_0
    invoke-virtual {p0}, Lcom/shopkick/sdk/scanner/ShopBeaconInfo;->getProximity()Lcom/shopkick/sdk/zone/ble/Proximity;

    move-result-object v6

    .line 105
    sget-object v2, Lcom/shopkick/sdk/zone/ble/Proximity;->Immediate:Lcom/shopkick/sdk/zone/ble/Proximity;

    sget-object v4, Lcom/shopkick/sdk/zone/ble/Proximity;->Expired:Lcom/shopkick/sdk/zone/ble/Proximity;

    sget-object v5, Lcom/shopkick/sdk/zone/ble/Proximity;->Smallest:Lcom/shopkick/sdk/zone/ble/Proximity;

    move-object v0, p0

    move v1, p1

    move-object v3, v6

    invoke-direct/range {v0 .. v5}, Lcom/shopkick/sdk/scanner/ShopBeaconInfo;->inProximity(ILcom/shopkick/sdk/zone/ble/Proximity;Lcom/shopkick/sdk/zone/ble/Proximity;Lcom/shopkick/sdk/zone/ble/Proximity;Lcom/shopkick/sdk/zone/ble/Proximity;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 107
    sget-object p1, Lcom/shopkick/sdk/zone/ble/Proximity;->Immediate:Lcom/shopkick/sdk/zone/ble/Proximity;

    return-object p1

    .line 108
    :cond_1
    sget-object v2, Lcom/shopkick/sdk/zone/ble/Proximity;->Smallest:Lcom/shopkick/sdk/zone/ble/Proximity;

    sget-object v4, Lcom/shopkick/sdk/zone/ble/Proximity;->Immediate:Lcom/shopkick/sdk/zone/ble/Proximity;

    sget-object v5, Lcom/shopkick/sdk/zone/ble/Proximity;->Small:Lcom/shopkick/sdk/zone/ble/Proximity;

    move-object v0, p0

    move v1, p1

    move-object v3, v6

    invoke-direct/range {v0 .. v5}, Lcom/shopkick/sdk/scanner/ShopBeaconInfo;->inProximity(ILcom/shopkick/sdk/zone/ble/Proximity;Lcom/shopkick/sdk/zone/ble/Proximity;Lcom/shopkick/sdk/zone/ble/Proximity;Lcom/shopkick/sdk/zone/ble/Proximity;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 111
    sget-object p1, Lcom/shopkick/sdk/zone/ble/Proximity;->Smallest:Lcom/shopkick/sdk/zone/ble/Proximity;

    return-object p1

    .line 112
    :cond_2
    sget-object v2, Lcom/shopkick/sdk/zone/ble/Proximity;->Small:Lcom/shopkick/sdk/zone/ble/Proximity;

    sget-object v4, Lcom/shopkick/sdk/zone/ble/Proximity;->Smallest:Lcom/shopkick/sdk/zone/ble/Proximity;

    sget-object v5, Lcom/shopkick/sdk/zone/ble/Proximity;->Default:Lcom/shopkick/sdk/zone/ble/Proximity;

    move-object v0, p0

    move v1, p1

    move-object v3, v6

    invoke-direct/range {v0 .. v5}, Lcom/shopkick/sdk/scanner/ShopBeaconInfo;->inProximity(ILcom/shopkick/sdk/zone/ble/Proximity;Lcom/shopkick/sdk/zone/ble/Proximity;Lcom/shopkick/sdk/zone/ble/Proximity;Lcom/shopkick/sdk/zone/ble/Proximity;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 114
    sget-object p1, Lcom/shopkick/sdk/zone/ble/Proximity;->Small:Lcom/shopkick/sdk/zone/ble/Proximity;

    return-object p1

    .line 115
    :cond_3
    sget-object v2, Lcom/shopkick/sdk/zone/ble/Proximity;->Default:Lcom/shopkick/sdk/zone/ble/Proximity;

    sget-object v4, Lcom/shopkick/sdk/zone/ble/Proximity;->Small:Lcom/shopkick/sdk/zone/ble/Proximity;

    sget-object v5, Lcom/shopkick/sdk/zone/ble/Proximity;->Large:Lcom/shopkick/sdk/zone/ble/Proximity;

    move-object v0, p0

    move v1, p1

    move-object v3, v6

    invoke-direct/range {v0 .. v5}, Lcom/shopkick/sdk/scanner/ShopBeaconInfo;->inProximity(ILcom/shopkick/sdk/zone/ble/Proximity;Lcom/shopkick/sdk/zone/ble/Proximity;Lcom/shopkick/sdk/zone/ble/Proximity;Lcom/shopkick/sdk/zone/ble/Proximity;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 117
    sget-object p1, Lcom/shopkick/sdk/zone/ble/Proximity;->Default:Lcom/shopkick/sdk/zone/ble/Proximity;

    return-object p1

    .line 118
    :cond_4
    sget-object v2, Lcom/shopkick/sdk/zone/ble/Proximity;->Large:Lcom/shopkick/sdk/zone/ble/Proximity;

    sget-object v4, Lcom/shopkick/sdk/zone/ble/Proximity;->Default:Lcom/shopkick/sdk/zone/ble/Proximity;

    sget-object v5, Lcom/shopkick/sdk/zone/ble/Proximity;->Largest:Lcom/shopkick/sdk/zone/ble/Proximity;

    move-object v0, p0

    move v1, p1

    move-object v3, v6

    invoke-direct/range {v0 .. v5}, Lcom/shopkick/sdk/scanner/ShopBeaconInfo;->inProximity(ILcom/shopkick/sdk/zone/ble/Proximity;Lcom/shopkick/sdk/zone/ble/Proximity;Lcom/shopkick/sdk/zone/ble/Proximity;Lcom/shopkick/sdk/zone/ble/Proximity;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 120
    sget-object p1, Lcom/shopkick/sdk/zone/ble/Proximity;->Large:Lcom/shopkick/sdk/zone/ble/Proximity;

    return-object p1

    .line 121
    :cond_5
    sget-object v2, Lcom/shopkick/sdk/zone/ble/Proximity;->Largest:Lcom/shopkick/sdk/zone/ble/Proximity;

    sget-object v4, Lcom/shopkick/sdk/zone/ble/Proximity;->Large:Lcom/shopkick/sdk/zone/ble/Proximity;

    sget-object v5, Lcom/shopkick/sdk/zone/ble/Proximity;->Everything:Lcom/shopkick/sdk/zone/ble/Proximity;

    move-object v0, p0

    move v1, p1

    move-object v3, v6

    invoke-direct/range {v0 .. v5}, Lcom/shopkick/sdk/scanner/ShopBeaconInfo;->inProximity(ILcom/shopkick/sdk/zone/ble/Proximity;Lcom/shopkick/sdk/zone/ble/Proximity;Lcom/shopkick/sdk/zone/ble/Proximity;Lcom/shopkick/sdk/zone/ble/Proximity;)Z

    move-result p1

    if-eqz p1, :cond_6

    .line 123
    sget-object p1, Lcom/shopkick/sdk/zone/ble/Proximity;->Largest:Lcom/shopkick/sdk/zone/ble/Proximity;

    return-object p1

    .line 125
    :cond_6
    sget-object p1, Lcom/shopkick/sdk/zone/ble/Proximity;->Everything:Lcom/shopkick/sdk/zone/ble/Proximity;

    return-object p1
.end method

.method public getSignalStrength()I
    .locals 1

    .line 208
    invoke-virtual {p0}, Lcom/shopkick/sdk/scanner/ShopBeaconInfo;->getLatestInfo()Lcom/shopkick/sdk/scanner/ShopBeaconInfo$Stat;

    move-result-object v0

    iget v0, v0, Lcom/shopkick/sdk/scanner/ShopBeaconInfo$Stat;->signalStrength:I

    return v0
.end method

.method public getTimeSinceLastSeen()I
    .locals 4

    .line 184
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {p0}, Lcom/shopkick/sdk/scanner/ShopBeaconInfo;->getLatestInfo()Lcom/shopkick/sdk/scanner/ShopBeaconInfo$Stat;

    move-result-object v2

    iget-wide v2, v2, Lcom/shopkick/sdk/scanner/ShopBeaconInfo$Stat;->entryTimestamp:J

    sub-long/2addr v0, v2

    long-to-int v0, v0

    div-int/lit16 v0, v0, 0x3e8

    return v0
.end method

.method public hashCode()I
    .locals 1

    .line 252
    iget v0, p0, Lcom/shopkick/sdk/scanner/ShopBeaconInfo;->deviceId:I

    return v0
.end method

.method public inBackground()Z
    .locals 1

    .line 204
    invoke-virtual {p0}, Lcom/shopkick/sdk/scanner/ShopBeaconInfo;->getLatestInfo()Lcom/shopkick/sdk/scanner/ShopBeaconInfo$Stat;

    move-result-object v0

    iget-boolean v0, v0, Lcom/shopkick/sdk/scanner/ShopBeaconInfo$Stat;->inBackground:Z

    return v0
.end method

.method public setDeviceId(I)V
    .locals 0

    .line 192
    iput p1, p0, Lcom/shopkick/sdk/scanner/ShopBeaconInfo;->deviceId:I

    return-void
.end method

.method public setToExpired(Lcom/shopkick/sdk/scanner/Beacon;Z)V
    .locals 10

    .line 80
    iget-object v0, p0, Lcom/shopkick/sdk/scanner/ShopBeaconInfo;->updatedStats:Ljava/util/Stack;

    new-instance v9, Lcom/shopkick/sdk/scanner/ShopBeaconInfo$Stat;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    sget-object v6, Lcom/shopkick/sdk/zone/ble/Proximity;->Expired:Lcom/shopkick/sdk/zone/ble/Proximity;

    .line 82
    invoke-virtual {p1}, Lcom/shopkick/sdk/scanner/Beacon;->getBatteryPercentage()I

    move-result p1

    invoke-direct {p0, p1}, Lcom/shopkick/sdk/scanner/ShopBeaconInfo;->getBatteryLevel(I)I

    move-result v7

    sget-object v8, Lcom/shopkick/sdk/zone/ble/Motion;->MovingAway:Lcom/shopkick/sdk/zone/ble/Motion;

    const/4 v5, 0x0

    move-object v1, v9

    move v4, p2

    invoke-direct/range {v1 .. v8}, Lcom/shopkick/sdk/scanner/ShopBeaconInfo$Stat;-><init>(JZILcom/shopkick/sdk/zone/ble/Proximity;ILcom/shopkick/sdk/zone/ble/Motion;)V

    .line 80
    invoke-virtual {v0, v9}, Ljava/util/Stack;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public update(Lcom/shopkick/sdk/scanner/Beacon;Z)Lcom/shopkick/sdk/scanner/ShopBeaconInfo$Stat;
    .locals 0

    .line 63
    invoke-virtual {p0, p1, p2}, Lcom/shopkick/sdk/scanner/ShopBeaconInfo;->createLatestInfo(Lcom/shopkick/sdk/scanner/Beacon;Z)Lcom/shopkick/sdk/scanner/ShopBeaconInfo$Stat;

    move-result-object p1

    .line 64
    iget-object p2, p0, Lcom/shopkick/sdk/scanner/ShopBeaconInfo;->updatedStats:Ljava/util/Stack;

    invoke-virtual {p2, p1}, Ljava/util/Stack;->add(Ljava/lang/Object;)Z

    return-object p1
.end method
