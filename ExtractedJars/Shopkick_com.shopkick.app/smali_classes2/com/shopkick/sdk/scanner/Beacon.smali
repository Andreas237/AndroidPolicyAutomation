.class public Lcom/shopkick/sdk/scanner/Beacon;
.super Ljava/lang/Object;
.source "Beacon.java"

# interfaces
.implements Landroid/os/Parcelable;
.implements Ljava/io/Serializable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/shopkick/sdk/scanner/Beacon;",
            ">;"
        }
    .end annotation
.end field

.field private static final IBeaconPreamble:[B

.field private static final MIN_SIGNAL_STRENGTH:I = -0x3e8

.field private static final ShopBeaconPreamble:[B

.field private static final ShopkickPacketUUID:[B


# instance fields
.field private final address:Ljava/lang/String;

.field private batteryPercentage:I

.field private deviceGeneration:I

.field private firmwareVersion:I

.field private hexData:Ljava/lang/String;

.field private final iBeaconRssiList:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/Double;",
            ">;"
        }
    .end annotation
.end field

.field private isIBeacon:Z

.field private isShopBeacon:Z

.field private isShopBeaconOverride:Ljava/lang/Boolean;

.field private final rssiList:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/Double;",
            ">;"
        }
    .end annotation
.end field

.field private final shopBeaconRssiList:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/Double;",
            ">;"
        }
    .end annotation
.end field

.field private signalStrengthOverride:Ljava/lang/Integer;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x4

    .line 42
    new-array v0, v0, [B

    fill-array-data v0, :array_0

    sput-object v0, Lcom/shopkick/sdk/scanner/Beacon;->ShopBeaconPreamble:[B

    const/4 v0, 0x6

    .line 43
    new-array v0, v0, [B

    fill-array-data v0, :array_1

    sput-object v0, Lcom/shopkick/sdk/scanner/Beacon;->IBeaconPreamble:[B

    const/16 v0, 0x10

    .line 44
    new-array v0, v0, [B

    fill-array-data v0, :array_2

    sput-object v0, Lcom/shopkick/sdk/scanner/Beacon;->ShopkickPacketUUID:[B

    .line 255
    new-instance v0, Lcom/shopkick/sdk/scanner/Beacon$1;

    invoke-direct {v0}, Lcom/shopkick/sdk/scanner/Beacon$1;-><init>()V

    sput-object v0, Lcom/shopkick/sdk/scanner/Beacon;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void

    nop

    :array_0
    .array-data 1
        0x3t
        0x3t
        0x1t
        0x12t
    .end array-data

    :array_1
    .array-data 1
        0x1at
        -0x1t
        0x4ct
        0x0t
        0x2t
        0x15t
    .end array-data

    nop

    :array_2
    .array-data 1
        -0x62t
        -0x4dt
        0x53t
        -0x60t
        0x69t
        -0x4at
        0x49t
        0x47t
        -0x49t
        0x10t
        -0x46t
        -0x1at
        0x43t
        -0x38t
        -0x44t
        -0x5bt
    .end array-data
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 3

    .line 58
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/shopkick/sdk/scanner/Beacon;->shopBeaconRssiList:Ljava/util/ArrayList;

    .line 31
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/shopkick/sdk/scanner/Beacon;->iBeaconRssiList:Ljava/util/ArrayList;

    const/4 v0, 0x0

    .line 37
    iput-object v0, p0, Lcom/shopkick/sdk/scanner/Beacon;->signalStrengthOverride:Ljava/lang/Integer;

    .line 40
    iput-object v0, p0, Lcom/shopkick/sdk/scanner/Beacon;->isShopBeaconOverride:Ljava/lang/Boolean;

    .line 59
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/sdk/scanner/Beacon;->address:Ljava/lang/String;

    .line 60
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    iput-boolean v0, p0, Lcom/shopkick/sdk/scanner/Beacon;->isIBeacon:Z

    .line 61
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-ne v0, v2, :cond_1

    move v1, v2

    :cond_1
    iput-boolean v1, p0, Lcom/shopkick/sdk/scanner/Beacon;->isShopBeacon:Z

    .line 62
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/sdk/scanner/Beacon;->hexData:Ljava/lang/String;

    .line 63
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/shopkick/sdk/scanner/Beacon;->rssiList:Ljava/util/ArrayList;

    .line 64
    iget-object v0, p0, Lcom/shopkick/sdk/scanner/Beacon;->rssiList:Ljava/util/ArrayList;

    const-class v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->readList(Ljava/util/List;Ljava/lang/ClassLoader;)V

    .line 65
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/shopkick/sdk/scanner/Beacon;->firmwareVersion:I

    .line 66
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/shopkick/sdk/scanner/Beacon;->deviceGeneration:I

    .line 67
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p1

    iput p1, p0, Lcom/shopkick/sdk/scanner/Beacon;->batteryPercentage:I

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/shopkick/sdk/scanner/Beacon;->shopBeaconRssiList:Ljava/util/ArrayList;

    .line 31
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/shopkick/sdk/scanner/Beacon;->iBeaconRssiList:Ljava/util/ArrayList;

    const/4 v0, 0x0

    .line 37
    iput-object v0, p0, Lcom/shopkick/sdk/scanner/Beacon;->signalStrengthOverride:Ljava/lang/Integer;

    .line 40
    iput-object v0, p0, Lcom/shopkick/sdk/scanner/Beacon;->isShopBeaconOverride:Ljava/lang/Boolean;

    .line 48
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 51
    iput-object p1, p0, Lcom/shopkick/sdk/scanner/Beacon;->address:Ljava/lang/String;

    const/4 p1, 0x0

    .line 52
    iput-boolean p1, p0, Lcom/shopkick/sdk/scanner/Beacon;->isIBeacon:Z

    .line 53
    iput-boolean p1, p0, Lcom/shopkick/sdk/scanner/Beacon;->isShopBeacon:Z

    const-string p1, ""

    .line 54
    iput-object p1, p0, Lcom/shopkick/sdk/scanner/Beacon;->hexData:Ljava/lang/String;

    .line 55
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/shopkick/sdk/scanner/Beacon;->rssiList:Ljava/util/ArrayList;

    return-void

    .line 49
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "\'address\' can not be null"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private isIBeaconPacket([B)Z
    .locals 5

    const/4 v0, 0x0

    move v1, v0

    .line 133
    :goto_0
    sget-object v2, Lcom/shopkick/sdk/scanner/Beacon;->IBeaconPreamble:[B

    array-length v3, v2

    if-ge v1, v3, :cond_1

    .line 136
    aget-byte v2, v2, v1

    add-int/lit8 v3, v1, 0x3

    aget-byte v3, p1, v3

    if-eq v2, v3, :cond_0

    return v0

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    move v1, v0

    .line 140
    :goto_1
    sget-object v2, Lcom/shopkick/sdk/scanner/Beacon;->ShopkickPacketUUID:[B

    array-length v3, v2

    if-ge v1, v3, :cond_3

    .line 141
    aget-byte v2, v2, v1

    add-int/lit8 v3, v1, 0x3

    sget-object v4, Lcom/shopkick/sdk/scanner/Beacon;->IBeaconPreamble:[B

    array-length v4, v4

    add-int/2addr v3, v4

    aget-byte v3, p1, v3

    if-eq v2, v3, :cond_2

    return v0

    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_3
    const/4 p1, 0x1

    return p1
.end method

.method private isShopBeaconPacket([B)Z
    .locals 4

    const/4 v0, 0x0

    move v1, v0

    .line 116
    :goto_0
    sget-object v2, Lcom/shopkick/sdk/scanner/Beacon;->ShopBeaconPreamble:[B

    array-length v3, v2

    if-ge v1, v3, :cond_1

    .line 117
    aget-byte v2, v2, v1

    aget-byte v3, p1, v1

    if-eq v2, v3, :cond_0

    return v0

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x1

    return p1
.end method

.method private parseHexBeaconData([B)Ljava/lang/String;
    .locals 5

    const/4 v0, 0x0

    move v1, v0

    .line 99
    :goto_0
    array-length v2, p1

    add-int/lit8 v2, v2, -0x4

    const/16 v3, 0x13

    sub-int/2addr v2, v3

    if-ge v1, v2, :cond_1

    .line 100
    aget-byte v2, p1, v1

    const/16 v4, 0x16

    if-ne v2, v4, :cond_0

    add-int/lit8 v2, v1, 0x1

    aget-byte v2, p1, v2

    if-ne v2, v4, :cond_0

    add-int/lit8 v2, v1, 0x2

    aget-byte v2, p1, v2

    const/4 v4, 0x1

    if-ne v2, v4, :cond_0

    add-int/lit8 v2, v1, 0x3

    aget-byte v2, p1, v2

    const/16 v4, 0x12

    if-ne v2, v4, :cond_0

    .line 104
    new-array v2, v3, [B

    add-int/lit8 v1, v1, 0x4

    .line 105
    invoke-static {p1, v1, v2, v0, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 106
    invoke-static {v2}, Lcom/shopkick/sdk/scanner/Utils;->bytesToHex([B)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 109
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p1

    const-string v0, "Could not parse ShopBeaconData"

    invoke-static {p1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    const/4 p1, 0x0

    return-object p1
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

    .line 221
    :cond_0
    instance-of v1, p1, Lcom/shopkick/sdk/scanner/Beacon;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    .line 223
    :cond_1
    check-cast p1, Lcom/shopkick/sdk/scanner/Beacon;

    .line 225
    iget-boolean v1, p0, Lcom/shopkick/sdk/scanner/Beacon;->isIBeacon:Z

    iget-boolean v3, p1, Lcom/shopkick/sdk/scanner/Beacon;->isIBeacon:Z

    if-ne v1, v3, :cond_2

    iget-boolean v1, p0, Lcom/shopkick/sdk/scanner/Beacon;->isShopBeacon:Z

    iget-boolean v3, p1, Lcom/shopkick/sdk/scanner/Beacon;->isShopBeacon:Z

    if-ne v1, v3, :cond_2

    iget-object v1, p0, Lcom/shopkick/sdk/scanner/Beacon;->address:Ljava/lang/String;

    iget-object p1, p1, Lcom/shopkick/sdk/scanner/Beacon;->address:Ljava/lang/String;

    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    move v0, v2

    :goto_0
    return v0
.end method

.method public getAddress()Ljava/lang/String;
    .locals 1

    .line 171
    iget-object v0, p0, Lcom/shopkick/sdk/scanner/Beacon;->address:Ljava/lang/String;

    return-object v0
.end method

.method public getBatteryPercentage()I
    .locals 1

    .line 175
    iget v0, p0, Lcom/shopkick/sdk/scanner/Beacon;->batteryPercentage:I

    return v0
.end method

.method public getHexData()Ljava/lang/String;
    .locals 1

    .line 179
    iget-object v0, p0, Lcom/shopkick/sdk/scanner/Beacon;->hexData:Ljava/lang/String;

    return-object v0
.end method

.method public getIBeaconRssiList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;"
        }
    .end annotation

    .line 191
    iget-object v0, p0, Lcom/shopkick/sdk/scanner/Beacon;->iBeaconRssiList:Ljava/util/ArrayList;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getRssiList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;"
        }
    .end annotation

    .line 183
    iget-object v0, p0, Lcom/shopkick/sdk/scanner/Beacon;->rssiList:Ljava/util/ArrayList;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getShopBeaconRssiList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;"
        }
    .end annotation

    .line 187
    iget-object v0, p0, Lcom/shopkick/sdk/scanner/Beacon;->shopBeaconRssiList:Ljava/util/ArrayList;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getSignalStrength(D)I
    .locals 4

    .line 206
    iget-object v0, p0, Lcom/shopkick/sdk/scanner/Beacon;->signalStrengthOverride:Ljava/lang/Integer;

    if-eqz v0, :cond_0

    .line 207
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result p1

    return p1

    .line 211
    :cond_0
    iget-object v0, p0, Lcom/shopkick/sdk/scanner/Beacon;->rssiList:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    new-array v0, v0, [D

    const/4 v1, 0x0

    .line 212
    :goto_0
    array-length v2, v0

    if-ge v1, v2, :cond_1

    .line 213
    iget-object v2, p0, Lcom/shopkick/sdk/scanner/Beacon;->rssiList:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Double;

    invoke-virtual {v2}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v2

    aput-wide v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 215
    :cond_1
    new-instance v1, Lcom/shopkick/sdk/scanner/Percentile;

    invoke-direct {v1}, Lcom/shopkick/sdk/scanner/Percentile;-><init>()V

    invoke-virtual {v1, v0, p1, p2}, Lcom/shopkick/sdk/scanner/Percentile;->evaluate([DD)D

    move-result-wide p1

    const-wide v0, -0x3f70c00000000000L    # -1000.0

    invoke-static {p1, p2, v0, v1}, Ljava/lang/Math;->max(DD)D

    move-result-wide p1

    double-to-int p1, p1

    return p1
.end method

.method public hashCode()I
    .locals 2

    .line 232
    iget-object v0, p0, Lcom/shopkick/sdk/scanner/Beacon;->address:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    .line 233
    iget-boolean v1, p0, Lcom/shopkick/sdk/scanner/Beacon;->isIBeacon:Z

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 234
    iget-boolean v1, p0, Lcom/shopkick/sdk/scanner/Beacon;->isShopBeacon:Z

    add-int/2addr v0, v1

    return v0
.end method

.method public isIBeacon()Z
    .locals 1

    .line 150
    iget-boolean v0, p0, Lcom/shopkick/sdk/scanner/Beacon;->isIBeacon:Z

    return v0
.end method

.method public isShopBeacon()Z
    .locals 1

    .line 164
    iget-object v0, p0, Lcom/shopkick/sdk/scanner/Beacon;->isShopBeaconOverride:Ljava/lang/Boolean;

    if-eqz v0, :cond_0

    .line 165
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0

    .line 167
    :cond_0
    iget-boolean v0, p0, Lcom/shopkick/sdk/scanner/Beacon;->isShopBeacon:Z

    return v0
.end method

.method public overrideIsShopBeacon(Z)V
    .locals 0

    .line 159
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/sdk/scanner/Beacon;->isShopBeaconOverride:Ljava/lang/Boolean;

    return-void
.end method

.method public overrideSignalStrength(Ljava/lang/Integer;)V
    .locals 0

    .line 200
    iput-object p1, p0, Lcom/shopkick/sdk/scanner/Beacon;->signalStrengthOverride:Ljava/lang/Integer;

    return-void
.end method

.method public parse(I[B)V
    .locals 3

    .line 75
    iget-object v0, p0, Lcom/shopkick/sdk/scanner/Beacon;->rssiList:Ljava/util/ArrayList;

    int-to-double v1, p1

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 77
    invoke-direct {p0, p2}, Lcom/shopkick/sdk/scanner/Beacon;->isShopBeaconPacket([B)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 78
    iget-object p1, p0, Lcom/shopkick/sdk/scanner/Beacon;->shopBeaconRssiList:Ljava/util/ArrayList;

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 79
    :cond_0
    invoke-direct {p0, p2}, Lcom/shopkick/sdk/scanner/Beacon;->isIBeaconPacket([B)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 80
    iget-object p1, p0, Lcom/shopkick/sdk/scanner/Beacon;->iBeaconRssiList:Ljava/util/ArrayList;

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 83
    :cond_1
    :goto_0
    iget-boolean p1, p0, Lcom/shopkick/sdk/scanner/Beacon;->isShopBeacon:Z

    if-nez p1, :cond_5

    iget-boolean p1, p0, Lcom/shopkick/sdk/scanner/Beacon;->isIBeacon:Z

    if-eqz p1, :cond_2

    goto :goto_2

    .line 87
    :cond_2
    invoke-direct {p0, p2}, Lcom/shopkick/sdk/scanner/Beacon;->isShopBeaconPacket([B)Z

    move-result p1

    const/4 v0, 0x1

    if-eqz p1, :cond_3

    .line 88
    iput-boolean v0, p0, Lcom/shopkick/sdk/scanner/Beacon;->isShopBeacon:Z

    .line 89
    invoke-direct {p0, p2}, Lcom/shopkick/sdk/scanner/Beacon;->parseHexBeaconData([B)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/sdk/scanner/Beacon;->hexData:Ljava/lang/String;

    const/16 p1, 0x12

    .line 90
    aget-byte p1, p2, p1

    iput p1, p0, Lcom/shopkick/sdk/scanner/Beacon;->firmwareVersion:I

    const/16 p1, 0x13

    .line 91
    aget-byte p1, p2, p1

    iput p1, p0, Lcom/shopkick/sdk/scanner/Beacon;->deviceGeneration:I

    const/16 p1, 0x14

    .line 92
    aget-byte p1, p2, p1

    iput p1, p0, Lcom/shopkick/sdk/scanner/Beacon;->batteryPercentage:I

    goto :goto_1

    .line 93
    :cond_3
    invoke-direct {p0, p2}, Lcom/shopkick/sdk/scanner/Beacon;->isIBeaconPacket([B)Z

    move-result p1

    if-eqz p1, :cond_4

    .line 94
    iput-boolean v0, p0, Lcom/shopkick/sdk/scanner/Beacon;->isIBeacon:Z

    :cond_4
    :goto_1
    return-void

    :cond_5
    :goto_2
    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    .line 245
    iget-object p2, p0, Lcom/shopkick/sdk/scanner/Beacon;->address:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 246
    iget-boolean p2, p0, Lcom/shopkick/sdk/scanner/Beacon;->isIBeacon:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 247
    iget-boolean p2, p0, Lcom/shopkick/sdk/scanner/Beacon;->isShopBeacon:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 248
    iget-object p2, p0, Lcom/shopkick/sdk/scanner/Beacon;->hexData:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 249
    iget-object p2, p0, Lcom/shopkick/sdk/scanner/Beacon;->rssiList:Ljava/util/ArrayList;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeList(Ljava/util/List;)V

    .line 250
    iget p2, p0, Lcom/shopkick/sdk/scanner/Beacon;->firmwareVersion:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 251
    iget p2, p0, Lcom/shopkick/sdk/scanner/Beacon;->deviceGeneration:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 252
    iget p2, p0, Lcom/shopkick/sdk/scanner/Beacon;->batteryPercentage:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method
