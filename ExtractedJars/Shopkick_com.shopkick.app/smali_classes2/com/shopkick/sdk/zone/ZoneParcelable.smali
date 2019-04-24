.class public Lcom/shopkick/sdk/zone/ZoneParcelable;
.super Ljava/lang/Object;
.source "ZoneParcelable.java"

# interfaces
.implements Lcom/shopkick/sdk/zone/Zone;
.implements Landroid/os/Parcelable;
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/sdk/zone/ZoneParcelable$TriggerParcelable;,
        Lcom/shopkick/sdk/zone/ZoneParcelable$ActionParcelable;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/shopkick/sdk/zone/Zone;",
        "Landroid/os/Parcelable;",
        "Ljava/lang/Comparable<",
        "Lcom/shopkick/sdk/zone/ZoneParcelable;",
        ">;"
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/shopkick/sdk/zone/ZoneParcelable;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final actions:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/shopkick/sdk/zone/ZoneParcelable$ActionParcelable;",
            ">;"
        }
    .end annotation
.end field

.field private final attributes:Ljava/util/TreeMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/TreeMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final parentZoneId:Ljava/lang/String;

.field private final triggers:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/shopkick/sdk/zone/ZoneParcelable$TriggerParcelable;",
            ">;"
        }
    .end annotation
.end field

.field private final zoneId:Ljava/lang/String;

.field private final zoneType:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 204
    new-instance v0, Lcom/shopkick/sdk/zone/ZoneParcelable$1;

    invoke-direct {v0}, Lcom/shopkick/sdk/zone/ZoneParcelable$1;-><init>()V

    sput-object v0, Lcom/shopkick/sdk/zone/ZoneParcelable;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .locals 2

    .line 55
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 56
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/sdk/zone/ZoneParcelable;->zoneId:Ljava/lang/String;

    .line 57
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/sdk/zone/ZoneParcelable;->parentZoneId:Ljava/lang/String;

    .line 58
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/sdk/zone/ZoneParcelable;->zoneType:Ljava/lang/String;

    .line 61
    new-instance v0, Ljava/util/TreeMap;

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->readHashMap(Ljava/lang/ClassLoader;)Ljava/util/HashMap;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/TreeMap;-><init>(Ljava/util/Map;)V

    iput-object v0, p0, Lcom/shopkick/sdk/zone/ZoneParcelable;->attributes:Ljava/util/TreeMap;

    .line 62
    sget-object v0, Lcom/shopkick/sdk/zone/ZoneParcelable$ActionParcelable;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->createTypedArrayList(Landroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/sdk/zone/ZoneParcelable;->actions:Ljava/util/ArrayList;

    .line 63
    sget-object v0, Lcom/shopkick/sdk/zone/ZoneParcelable$TriggerParcelable;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->createTypedArrayList(Landroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/sdk/zone/ZoneParcelable;->triggers:Ljava/util/ArrayList;

    return-void
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;Lcom/shopkick/sdk/zone/ZoneParcelable$1;)V
    .locals 0

    .line 17
    invoke-direct {p0, p1}, Lcom/shopkick/sdk/zone/ZoneParcelable;-><init>(Landroid/os/Parcel;)V

    return-void
.end method

.method constructor <init>(Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$ZoneV2;)V
    .locals 4

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    iget-object v0, p1, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$ZoneV2;->zoneId:Ljava/lang/String;

    if-nez v0, :cond_0

    const-string v0, ""

    goto :goto_0

    :cond_0
    iget-object v0, p1, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$ZoneV2;->zoneId:Ljava/lang/String;

    :goto_0
    iput-object v0, p0, Lcom/shopkick/sdk/zone/ZoneParcelable;->zoneId:Ljava/lang/String;

    .line 28
    iget-object v0, p1, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$ZoneV2;->parentZoneId:Ljava/lang/String;

    if-nez v0, :cond_1

    const-string v0, ""

    goto :goto_1

    :cond_1
    iget-object v0, p1, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$ZoneV2;->parentZoneId:Ljava/lang/String;

    :goto_1
    iput-object v0, p0, Lcom/shopkick/sdk/zone/ZoneParcelable;->parentZoneId:Ljava/lang/String;

    .line 29
    iget-object v0, p1, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$ZoneV2;->type:Ljava/lang/String;

    if-nez v0, :cond_2

    const-string v0, ""

    goto :goto_2

    :cond_2
    iget-object v0, p1, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$ZoneV2;->type:Ljava/lang/String;

    :goto_2
    iput-object v0, p0, Lcom/shopkick/sdk/zone/ZoneParcelable;->zoneType:Ljava/lang/String;

    .line 32
    iget-object v0, p1, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$ZoneV2;->attributes:Ljava/util/HashMap;

    if-eqz v0, :cond_3

    .line 33
    new-instance v0, Ljava/util/TreeMap;

    iget-object v1, p1, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$ZoneV2;->attributes:Ljava/util/HashMap;

    invoke-direct {v0, v1}, Ljava/util/TreeMap;-><init>(Ljava/util/Map;)V

    iput-object v0, p0, Lcom/shopkick/sdk/zone/ZoneParcelable;->attributes:Ljava/util/TreeMap;

    goto :goto_3

    .line 35
    :cond_3
    new-instance v0, Ljava/util/TreeMap;

    invoke-direct {v0}, Ljava/util/TreeMap;-><init>()V

    iput-object v0, p0, Lcom/shopkick/sdk/zone/ZoneParcelable;->attributes:Ljava/util/TreeMap;

    .line 39
    :goto_3
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/shopkick/sdk/zone/ZoneParcelable;->actions:Ljava/util/ArrayList;

    .line 40
    iget-object v0, p1, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$ZoneV2;->actions:Ljava/util/ArrayList;

    if-eqz v0, :cond_4

    .line 41
    iget-object v0, p1, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$ZoneV2;->actions:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$Action;

    .line 42
    iget-object v2, p0, Lcom/shopkick/sdk/zone/ZoneParcelable;->actions:Ljava/util/ArrayList;

    new-instance v3, Lcom/shopkick/sdk/zone/ZoneParcelable$ActionParcelable;

    invoke-direct {v3, v1}, Lcom/shopkick/sdk/zone/ZoneParcelable$ActionParcelable;-><init>(Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$Action;)V

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_4

    .line 47
    :cond_4
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/shopkick/sdk/zone/ZoneParcelable;->triggers:Ljava/util/ArrayList;

    .line 48
    iget-object v0, p1, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$ZoneV2;->triggers:Ljava/util/ArrayList;

    if-eqz v0, :cond_5

    .line 49
    iget-object p1, p1, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$ZoneV2;->triggers:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$Trigger;

    .line 50
    iget-object v1, p0, Lcom/shopkick/sdk/zone/ZoneParcelable;->triggers:Ljava/util/ArrayList;

    new-instance v2, Lcom/shopkick/sdk/zone/ZoneParcelable$TriggerParcelable;

    invoke-direct {v2, v0}, Lcom/shopkick/sdk/zone/ZoneParcelable$TriggerParcelable;-><init>(Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$Trigger;)V

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_5

    :cond_5
    return-void
.end method

.method static synthetic access$100(Landroid/os/Parcel;)Ljava/lang/Double;
    .locals 0

    .line 17
    invoke-static {p0}, Lcom/shopkick/sdk/zone/ZoneParcelable;->readNullableDouble(Landroid/os/Parcel;)Ljava/lang/Double;

    move-result-object p0

    return-object p0
.end method

.method static synthetic access$200(Landroid/os/Parcel;)Ljava/lang/Integer;
    .locals 0

    .line 17
    invoke-static {p0}, Lcom/shopkick/sdk/zone/ZoneParcelable;->readNullableInteger(Landroid/os/Parcel;)Ljava/lang/Integer;

    move-result-object p0

    return-object p0
.end method

.method static synthetic access$300(Landroid/os/Parcel;)Ljava/lang/Long;
    .locals 0

    .line 17
    invoke-static {p0}, Lcom/shopkick/sdk/zone/ZoneParcelable;->readNullableLong(Landroid/os/Parcel;)Ljava/lang/Long;

    move-result-object p0

    return-object p0
.end method

.method static synthetic access$400(Landroid/os/Parcel;Ljava/lang/Double;)V
    .locals 0

    .line 17
    invoke-static {p0, p1}, Lcom/shopkick/sdk/zone/ZoneParcelable;->writeNullableDouble(Landroid/os/Parcel;Ljava/lang/Double;)V

    return-void
.end method

.method static synthetic access$500(Landroid/os/Parcel;Ljava/lang/Integer;)V
    .locals 0

    .line 17
    invoke-static {p0, p1}, Lcom/shopkick/sdk/zone/ZoneParcelable;->writeNullableInteger(Landroid/os/Parcel;Ljava/lang/Integer;)V

    return-void
.end method

.method static synthetic access$600(Landroid/os/Parcel;Ljava/lang/Long;)V
    .locals 0

    .line 17
    invoke-static {p0, p1}, Lcom/shopkick/sdk/zone/ZoneParcelable;->writeNullableLong(Landroid/os/Parcel;Ljava/lang/Long;)V

    return-void
.end method

.method private getShopkickBeaconDetectTrigger()Lcom/shopkick/sdk/zone/ZoneParcelable$TriggerParcelable;
    .locals 6

    .line 131
    iget-object v0, p0, Lcom/shopkick/sdk/zone/ZoneParcelable;->actions:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/sdk/zone/ZoneParcelable$ActionParcelable;

    const-string v3, "detect"

    .line 132
    invoke-virtual {v1}, Lcom/shopkick/sdk/zone/ZoneParcelable$ActionParcelable;->getType()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 133
    invoke-virtual {v1}, Lcom/shopkick/sdk/zone/ZoneParcelable$ActionParcelable;->getTriggerId()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_1
    move-object v0, v2

    .line 139
    :goto_0
    iget-object v1, p0, Lcom/shopkick/sdk/zone/ZoneParcelable;->triggers:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/shopkick/sdk/zone/ZoneParcelable$TriggerParcelable;

    .line 140
    invoke-virtual {v3}, Lcom/shopkick/sdk/zone/ZoneParcelable$TriggerParcelable;->getTriggerId()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    const-string/jumbo v4, "shopkick_beacon"

    .line 141
    invoke-virtual {v3}, Lcom/shopkick/sdk/zone/ZoneParcelable$TriggerParcelable;->getType()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    move-object v2, v3

    goto :goto_1

    :cond_3
    return-object v2
.end method

.method private static readNullableDouble(Landroid/os/Parcel;)Ljava/lang/Double;
    .locals 4

    .line 458
    invoke-virtual {p0}, Landroid/os/Parcel;->readDouble()D

    move-result-wide v0

    const-wide/16 v2, 0x1

    cmpl-double p0, v0, v2

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 460
    :cond_0
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p0

    return-object p0
.end method

.method private static readNullableInteger(Landroid/os/Parcel;)Ljava/lang/Integer;
    .locals 1

    .line 410
    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result p0

    const/high16 v0, -0x80000000

    if-ne p0, v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 412
    :cond_0
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    return-object p0
.end method

.method private static readNullableLong(Landroid/os/Parcel;)Ljava/lang/Long;
    .locals 4

    .line 434
    invoke-virtual {p0}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    const-wide/high16 v2, -0x8000000000000000L

    cmp-long p0, v0, v2

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 436
    :cond_0
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p0

    return-object p0
.end method

.method private static writeNullableDouble(Landroid/os/Parcel;Ljava/lang/Double;)V
    .locals 2

    if-nez p1, :cond_0

    const-wide/16 v0, 0x1

    .line 470
    invoke-virtual {p0, v0, v1}, Landroid/os/Parcel;->writeDouble(D)V

    goto :goto_0

    .line 472
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Landroid/os/Parcel;->writeDouble(D)V

    :goto_0
    return-void
.end method

.method private static writeNullableInteger(Landroid/os/Parcel;Ljava/lang/Integer;)V
    .locals 0

    if-nez p1, :cond_0

    const/high16 p1, -0x80000000

    .line 422
    invoke-virtual {p0, p1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_0

    .line 424
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {p0, p1}, Landroid/os/Parcel;->writeInt(I)V

    :goto_0
    return-void
.end method

.method private static writeNullableLong(Landroid/os/Parcel;Ljava/lang/Long;)V
    .locals 2

    if-nez p1, :cond_0

    const-wide/high16 v0, -0x8000000000000000L

    .line 446
    invoke-virtual {p0, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    goto :goto_0

    .line 448
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    :goto_0
    return-void
.end method


# virtual methods
.method public compareTo(Lcom/shopkick/sdk/zone/ZoneParcelable;)I
    .locals 1

    .line 240
    iget-object v0, p0, Lcom/shopkick/sdk/zone/ZoneParcelable;->zoneId:Ljava/lang/String;

    iget-object p1, p1, Lcom/shopkick/sdk/zone/ZoneParcelable;->zoneId:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result p1

    return p1
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 17
    check-cast p1, Lcom/shopkick/sdk/zone/ZoneParcelable;

    invoke-virtual {p0, p1}, Lcom/shopkick/sdk/zone/ZoneParcelable;->compareTo(Lcom/shopkick/sdk/zone/ZoneParcelable;)I

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

    .line 219
    instance-of v1, p1, Lcom/shopkick/sdk/zone/ZoneParcelable;

    if-nez v1, :cond_0

    goto :goto_0

    .line 222
    :cond_0
    invoke-virtual {p0}, Lcom/shopkick/sdk/zone/ZoneParcelable;->hashCode()I

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

.method public getActions()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Lcom/shopkick/sdk/zone/ZoneParcelable$ActionParcelable;",
            ">;"
        }
    .end annotation

    .line 167
    iget-object v0, p0, Lcom/shopkick/sdk/zone/ZoneParcelable;->actions:Ljava/util/ArrayList;

    return-object v0
.end method

.method public bridge synthetic getActions()Ljava/util/List;
    .locals 1

    .line 17
    invoke-virtual {p0}, Lcom/shopkick/sdk/zone/ZoneParcelable;->getActions()Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method

.method public getAttribute(Ljava/lang/String;)Ljava/lang/Object;
    .locals 1

    .line 177
    iget-object v0, p0, Lcom/shopkick/sdk/zone/ZoneParcelable;->attributes:Ljava/util/TreeMap;

    invoke-virtual {v0, p1}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public getAttributeNames()Ljava/util/Set;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 184
    iget-object v0, p0, Lcom/shopkick/sdk/zone/ZoneParcelable;->attributes:Ljava/util/TreeMap;

    invoke-virtual {v0}, Ljava/util/TreeMap;->keySet()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public getParentZoneId()Ljava/lang/String;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 158
    iget-object v0, p0, Lcom/shopkick/sdk/zone/ZoneParcelable;->parentZoneId:Ljava/lang/String;

    return-object v0
.end method

.method public getShopkickBeaconBtleData()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 95
    invoke-direct {p0}, Lcom/shopkick/sdk/zone/ZoneParcelable;->getShopkickBeaconDetectTrigger()Lcom/shopkick/sdk/zone/ZoneParcelable$TriggerParcelable;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 97
    invoke-virtual {v0}, Lcom/shopkick/sdk/zone/ZoneParcelable$TriggerParcelable;->getBtleDatas()Ljava/util/List;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public getShopkickBeaconId()Ljava/lang/Long;
    .locals 1

    .line 77
    invoke-direct {p0}, Lcom/shopkick/sdk/zone/ZoneParcelable;->getShopkickBeaconDetectTrigger()Lcom/shopkick/sdk/zone/ZoneParcelable$TriggerParcelable;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 79
    invoke-virtual {v0}, Lcom/shopkick/sdk/zone/ZoneParcelable$TriggerParcelable;->getBeaconId()Ljava/lang/Long;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public getShopkickBeaconSignalDistanceMap()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 113
    invoke-direct {p0}, Lcom/shopkick/sdk/zone/ZoneParcelable;->getShopkickBeaconDetectTrigger()Lcom/shopkick/sdk/zone/ZoneParcelable$TriggerParcelable;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 115
    invoke-virtual {v0}, Lcom/shopkick/sdk/zone/ZoneParcelable$TriggerParcelable;->getSignalDistanceMap()Ljava/util/Map;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public getTriggers()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Lcom/shopkick/sdk/zone/ZoneParcelable$TriggerParcelable;",
            ">;"
        }
    .end annotation

    .line 171
    iget-object v0, p0, Lcom/shopkick/sdk/zone/ZoneParcelable;->triggers:Ljava/util/ArrayList;

    return-object v0
.end method

.method public bridge synthetic getTriggers()Ljava/util/List;
    .locals 1

    .line 17
    invoke-virtual {p0}, Lcom/shopkick/sdk/zone/ZoneParcelable;->getTriggers()Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method

.method public getZoneId()Ljava/lang/String;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 153
    iget-object v0, p0, Lcom/shopkick/sdk/zone/ZoneParcelable;->zoneId:Ljava/lang/String;

    return-object v0
.end method

.method public getZoneType()Ljava/lang/String;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 163
    iget-object v0, p0, Lcom/shopkick/sdk/zone/ZoneParcelable;->zoneType:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    .line 228
    iget-object v0, p0, Lcom/shopkick/sdk/zone/ZoneParcelable;->zoneId:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 234
    iget-object v0, p0, Lcom/shopkick/sdk/zone/ZoneParcelable;->zoneId:Ljava/lang/String;

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    .line 196
    iget-object p2, p0, Lcom/shopkick/sdk/zone/ZoneParcelable;->zoneId:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 197
    iget-object p2, p0, Lcom/shopkick/sdk/zone/ZoneParcelable;->parentZoneId:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 198
    iget-object p2, p0, Lcom/shopkick/sdk/zone/ZoneParcelable;->zoneType:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 199
    iget-object p2, p0, Lcom/shopkick/sdk/zone/ZoneParcelable;->attributes:Ljava/util/TreeMap;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeMap(Ljava/util/Map;)V

    .line 200
    iget-object p2, p0, Lcom/shopkick/sdk/zone/ZoneParcelable;->actions:Ljava/util/ArrayList;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeTypedList(Ljava/util/List;)V

    .line 201
    iget-object p2, p0, Lcom/shopkick/sdk/zone/ZoneParcelable;->triggers:Ljava/util/ArrayList;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeTypedList(Ljava/util/List;)V

    return-void
.end method
