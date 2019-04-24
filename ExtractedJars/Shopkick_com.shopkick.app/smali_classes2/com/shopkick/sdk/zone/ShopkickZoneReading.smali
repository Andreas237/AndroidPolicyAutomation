.class public Lcom/shopkick/sdk/zone/ShopkickZoneReading;
.super Ljava/lang/Object;
.source "ShopkickZoneReading.java"

# interfaces
.implements Lcom/shopkick/sdk/zone/ZoneReading;
.implements Landroid/os/Parcelable;
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/shopkick/sdk/zone/ZoneReading;",
        "Landroid/os/Parcelable;",
        "Ljava/lang/Comparable<",
        "Lcom/shopkick/sdk/zone/ShopkickZoneReading;",
        ">;"
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/shopkick/sdk/zone/ShopkickZoneReading;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final confidence:I

.field private final proximity:I

.field private final sensorData:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final signalStrength:I

.field private final timestamp:J

.field private final zone:Lcom/shopkick/sdk/zone/Zone;

.field private final zoneReadingId:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 125
    new-instance v0, Lcom/shopkick/sdk/zone/ShopkickZoneReading$1;

    invoke-direct {v0}, Lcom/shopkick/sdk/zone/ShopkickZoneReading$1;-><init>()V

    sput-object v0, Lcom/shopkick/sdk/zone/ShopkickZoneReading;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 2

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    const-class v0, Lcom/shopkick/sdk/zone/Zone;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/shopkick/sdk/zone/Zone;

    iput-object v0, p0, Lcom/shopkick/sdk/zone/ShopkickZoneReading;->zone:Lcom/shopkick/sdk/zone/Zone;

    .line 27
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/shopkick/sdk/zone/ShopkickZoneReading;->timestamp:J

    .line 28
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/shopkick/sdk/zone/ShopkickZoneReading;->confidence:I

    .line 29
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/shopkick/sdk/zone/ShopkickZoneReading;->proximity:I

    .line 30
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/shopkick/sdk/zone/ShopkickZoneReading;->signalStrength:I

    const/4 v0, 0x0

    .line 32
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readHashMap(Ljava/lang/ClassLoader;)Ljava/util/HashMap;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/sdk/zone/ShopkickZoneReading;->sensorData:Ljava/util/HashMap;

    .line 33
    invoke-direct {p0}, Lcom/shopkick/sdk/zone/ShopkickZoneReading;->generateZoneReadingId()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/sdk/zone/ShopkickZoneReading;->zoneReadingId:Ljava/lang/String;

    return-void
.end method

.method constructor <init>(Lcom/shopkick/sdk/zone/Zone;JII)V
    .locals 7

    const/high16 v6, -0x80000000

    move-object v0, p0

    move-object v1, p1

    move-wide v2, p2

    move v4, p4

    move v5, p5

    .line 37
    invoke-direct/range {v0 .. v6}, Lcom/shopkick/sdk/zone/ShopkickZoneReading;-><init>(Lcom/shopkick/sdk/zone/Zone;JIII)V

    return-void
.end method

.method constructor <init>(Lcom/shopkick/sdk/zone/Zone;JIII)V
    .locals 8

    .line 41
    new-instance v7, Ljava/util/HashMap;

    invoke-direct {v7}, Ljava/util/HashMap;-><init>()V

    move-object v0, p0

    move-object v1, p1

    move-wide v2, p2

    move v4, p4

    move v5, p5

    move v6, p6

    invoke-direct/range {v0 .. v7}, Lcom/shopkick/sdk/zone/ShopkickZoneReading;-><init>(Lcom/shopkick/sdk/zone/Zone;JIIILjava/util/HashMap;)V

    return-void
.end method

.method public constructor <init>(Lcom/shopkick/sdk/zone/Zone;JIIILjava/util/HashMap;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/shopkick/sdk/zone/Zone;",
            "JIII",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 50
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p7, :cond_0

    .line 52
    iput-object p1, p0, Lcom/shopkick/sdk/zone/ShopkickZoneReading;->zone:Lcom/shopkick/sdk/zone/Zone;

    .line 53
    iput-wide p2, p0, Lcom/shopkick/sdk/zone/ShopkickZoneReading;->timestamp:J

    .line 54
    iput p4, p0, Lcom/shopkick/sdk/zone/ShopkickZoneReading;->confidence:I

    .line 55
    iput p5, p0, Lcom/shopkick/sdk/zone/ShopkickZoneReading;->proximity:I

    .line 56
    iput p6, p0, Lcom/shopkick/sdk/zone/ShopkickZoneReading;->signalStrength:I

    .line 57
    iput-object p7, p0, Lcom/shopkick/sdk/zone/ShopkickZoneReading;->sensorData:Ljava/util/HashMap;

    .line 58
    invoke-direct {p0}, Lcom/shopkick/sdk/zone/ShopkickZoneReading;->generateZoneReadingId()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/sdk/zone/ShopkickZoneReading;->zoneReadingId:Ljava/lang/String;

    return-void

    .line 51
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "\'sensorData\' can not be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private generateZoneReadingId()Ljava/lang/String;
    .locals 4

    .line 63
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 64
    iget-object v1, p0, Lcom/shopkick/sdk/zone/ShopkickZoneReading;->zone:Lcom/shopkick/sdk/zone/Zone;

    if-eqz v1, :cond_0

    invoke-interface {v1}, Lcom/shopkick/sdk/zone/Zone;->getZoneId()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/shopkick/sdk/zone/ShopkickZoneReading;->zone:Lcom/shopkick/sdk/zone/Zone;

    invoke-interface {v1}, Lcom/shopkick/sdk/zone/Zone;->getZoneId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_0

    .line 65
    iget-object v1, p0, Lcom/shopkick/sdk/zone/ShopkickZoneReading;->zone:Lcom/shopkick/sdk/zone/Zone;

    invoke-interface {v1}, Lcom/shopkick/sdk/zone/Zone;->getZoneId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    :cond_0
    iget-wide v1, p0, Lcom/shopkick/sdk/zone/ShopkickZoneReading;->timestamp:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 68
    iget v1, p0, Lcom/shopkick/sdk/zone/ShopkickZoneReading;->confidence:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 69
    iget v1, p0, Lcom/shopkick/sdk/zone/ShopkickZoneReading;->proximity:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 70
    iget v1, p0, Lcom/shopkick/sdk/zone/ShopkickZoneReading;->signalStrength:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 71
    iget-object v1, p0, Lcom/shopkick/sdk/zone/ShopkickZoneReading;->sensorData:Ljava/util/HashMap;

    if-eqz v1, :cond_2

    .line 72
    invoke-virtual {v1}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-eqz v2, :cond_1

    .line 73
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v3

    if-lez v3, :cond_1

    .line 74
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    iget-object v3, p0, Lcom/shopkick/sdk/zone/ShopkickZoneReading;->sensorData:Ljava/util/HashMap;

    invoke-virtual {v3, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-eqz v2, :cond_1

    .line 76
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v3

    if-lez v3, :cond_1

    .line 77
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 82
    :cond_2
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public compareTo(Lcom/shopkick/sdk/zone/ShopkickZoneReading;)I
    .locals 1

    .line 160
    iget-object v0, p0, Lcom/shopkick/sdk/zone/ShopkickZoneReading;->zoneReadingId:Ljava/lang/String;

    iget-object p1, p1, Lcom/shopkick/sdk/zone/ShopkickZoneReading;->zoneReadingId:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result p1

    return p1
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 16
    check-cast p1, Lcom/shopkick/sdk/zone/ShopkickZoneReading;

    invoke-virtual {p0, p1}, Lcom/shopkick/sdk/zone/ShopkickZoneReading;->compareTo(Lcom/shopkick/sdk/zone/ShopkickZoneReading;)I

    move-result p1

    return p1
.end method

.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    const/4 v0, 0x0

    if-eqz p1, :cond_2

    .line 140
    instance-of v1, p1, Lcom/shopkick/sdk/zone/ShopkickZoneReading;

    if-nez v1, :cond_0

    goto :goto_0

    .line 143
    :cond_0
    invoke-virtual {p0}, Lcom/shopkick/sdk/zone/ShopkickZoneReading;->hashCode()I

    move-result v1

    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result p1

    if-ne v1, p1, :cond_1

    const/4 v0, 0x1

    :cond_1
    return v0

    :cond_2
    :goto_0
    return v0
.end method

.method public getConfidence()I
    .locals 1

    .line 97
    iget v0, p0, Lcom/shopkick/sdk/zone/ShopkickZoneReading;->confidence:I

    return v0
.end method

.method public getEnteredTimestamp()J
    .locals 2

    .line 92
    iget-wide v0, p0, Lcom/shopkick/sdk/zone/ShopkickZoneReading;->timestamp:J

    return-wide v0
.end method

.method public getProximity()I
    .locals 1

    .line 102
    iget v0, p0, Lcom/shopkick/sdk/zone/ShopkickZoneReading;->proximity:I

    return v0
.end method

.method public getSensorData()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 107
    iget-object v0, p0, Lcom/shopkick/sdk/zone/ShopkickZoneReading;->sensorData:Ljava/util/HashMap;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public getZone()Lcom/shopkick/sdk/zone/Zone;
    .locals 1

    .line 87
    iget-object v0, p0, Lcom/shopkick/sdk/zone/ShopkickZoneReading;->zone:Lcom/shopkick/sdk/zone/Zone;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    .line 148
    iget-object v0, p0, Lcom/shopkick/sdk/zone/ShopkickZoneReading;->zoneReadingId:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 154
    iget-object v0, p0, Lcom/shopkick/sdk/zone/ShopkickZoneReading;->zoneReadingId:Ljava/lang/String;

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    .line 117
    iget-object v0, p0, Lcom/shopkick/sdk/zone/ShopkickZoneReading;->zone:Lcom/shopkick/sdk/zone/Zone;

    check-cast v0, Lcom/shopkick/sdk/zone/ZoneParcelable;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 118
    iget-wide v0, p0, Lcom/shopkick/sdk/zone/ShopkickZoneReading;->timestamp:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 119
    iget p2, p0, Lcom/shopkick/sdk/zone/ShopkickZoneReading;->confidence:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 120
    iget p2, p0, Lcom/shopkick/sdk/zone/ShopkickZoneReading;->proximity:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 121
    iget p2, p0, Lcom/shopkick/sdk/zone/ShopkickZoneReading;->signalStrength:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 122
    iget-object p2, p0, Lcom/shopkick/sdk/zone/ShopkickZoneReading;->sensorData:Ljava/util/HashMap;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeMap(Ljava/util/Map;)V

    return-void
.end method
