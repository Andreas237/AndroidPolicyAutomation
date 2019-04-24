.class public Lcom/shopkick/sdk/zone/ZoneParcelable$TriggerParcelable;
.super Ljava/lang/Object;
.source "ZoneParcelable.java"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/sdk/zone/ZoneParcelable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "TriggerParcelable"
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/shopkick/sdk/zone/ZoneParcelable$TriggerParcelable;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final beaconId:Ljava/lang/Long;

.field private final btleDatas:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final latitude:Ljava/lang/Double;

.field private final longitude:Ljava/lang/Double;

.field private final radius:Ljava/lang/Integer;

.field private final signalDistanceMap:Ljava/util/TreeMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/TreeMap<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final triggerId:Ljava/lang/String;

.field private final triggers:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final type:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 386
    new-instance v0, Lcom/shopkick/sdk/zone/ZoneParcelable$TriggerParcelable$1;

    invoke-direct {v0}, Lcom/shopkick/sdk/zone/ZoneParcelable$TriggerParcelable$1;-><init>()V

    sput-object v0, Lcom/shopkick/sdk/zone/ZoneParcelable$TriggerParcelable;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .line 352
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 353
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/sdk/zone/ZoneParcelable$TriggerParcelable;->triggerId:Ljava/lang/String;

    .line 354
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/sdk/zone/ZoneParcelable$TriggerParcelable;->type:Ljava/lang/String;

    .line 356
    invoke-static {p1}, Lcom/shopkick/sdk/zone/ZoneParcelable;->access$100(Landroid/os/Parcel;)Ljava/lang/Double;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/sdk/zone/ZoneParcelable$TriggerParcelable;->latitude:Ljava/lang/Double;

    .line 357
    invoke-static {p1}, Lcom/shopkick/sdk/zone/ZoneParcelable;->access$100(Landroid/os/Parcel;)Ljava/lang/Double;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/sdk/zone/ZoneParcelable$TriggerParcelable;->longitude:Ljava/lang/Double;

    .line 358
    invoke-static {p1}, Lcom/shopkick/sdk/zone/ZoneParcelable;->access$200(Landroid/os/Parcel;)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/sdk/zone/ZoneParcelable$TriggerParcelable;->radius:Ljava/lang/Integer;

    .line 359
    invoke-static {p1}, Lcom/shopkick/sdk/zone/ZoneParcelable;->access$300(Landroid/os/Parcel;)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/sdk/zone/ZoneParcelable$TriggerParcelable;->beaconId:Ljava/lang/Long;

    .line 361
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/shopkick/sdk/zone/ZoneParcelable$TriggerParcelable;->btleDatas:Ljava/util/ArrayList;

    .line 362
    iget-object v0, p0, Lcom/shopkick/sdk/zone/ZoneParcelable$TriggerParcelable;->btleDatas:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readStringList(Ljava/util/List;)V

    .line 363
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/shopkick/sdk/zone/ZoneParcelable$TriggerParcelable;->triggers:Ljava/util/ArrayList;

    .line 364
    iget-object v0, p0, Lcom/shopkick/sdk/zone/ZoneParcelable$TriggerParcelable;->triggers:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readStringList(Ljava/util/List;)V

    .line 367
    invoke-virtual {p1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    move-result-object p1

    check-cast p1, Ljava/util/TreeMap;

    iput-object p1, p0, Lcom/shopkick/sdk/zone/ZoneParcelable$TriggerParcelable;->signalDistanceMap:Ljava/util/TreeMap;

    return-void
.end method

.method constructor <init>(Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$Trigger;)V
    .locals 3

    .line 331
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 332
    iget-object v0, p1, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$Trigger;->triggerId:Ljava/lang/String;

    if-nez v0, :cond_0

    const-string v0, ""

    goto :goto_0

    :cond_0
    iget-object v0, p1, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$Trigger;->triggerId:Ljava/lang/String;

    :goto_0
    iput-object v0, p0, Lcom/shopkick/sdk/zone/ZoneParcelable$TriggerParcelable;->triggerId:Ljava/lang/String;

    .line 333
    iget-object v0, p1, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$Trigger;->type:Ljava/lang/String;

    if-nez v0, :cond_1

    const-string v0, ""

    goto :goto_1

    :cond_1
    iget-object v0, p1, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$Trigger;->type:Ljava/lang/String;

    :goto_1
    iput-object v0, p0, Lcom/shopkick/sdk/zone/ZoneParcelable$TriggerParcelable;->type:Ljava/lang/String;

    .line 335
    iget-object v0, p1, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$Trigger;->latitude:Ljava/lang/Double;

    iput-object v0, p0, Lcom/shopkick/sdk/zone/ZoneParcelable$TriggerParcelable;->latitude:Ljava/lang/Double;

    .line 336
    iget-object v0, p1, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$Trigger;->longitude:Ljava/lang/Double;

    iput-object v0, p0, Lcom/shopkick/sdk/zone/ZoneParcelable$TriggerParcelable;->longitude:Ljava/lang/Double;

    .line 337
    iget-object v0, p1, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$Trigger;->radius:Ljava/lang/Integer;

    iput-object v0, p0, Lcom/shopkick/sdk/zone/ZoneParcelable$TriggerParcelable;->radius:Ljava/lang/Integer;

    .line 338
    iget-object v0, p1, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$Trigger;->beaconId:Ljava/lang/Long;

    iput-object v0, p0, Lcom/shopkick/sdk/zone/ZoneParcelable$TriggerParcelable;->beaconId:Ljava/lang/Long;

    .line 340
    iget-object v0, p1, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$Trigger;->beaconData:Ljava/util/ArrayList;

    if-nez v0, :cond_2

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    goto :goto_2

    :cond_2
    iget-object v0, p1, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$Trigger;->beaconData:Ljava/util/ArrayList;

    :goto_2
    iput-object v0, p0, Lcom/shopkick/sdk/zone/ZoneParcelable$TriggerParcelable;->btleDatas:Ljava/util/ArrayList;

    .line 341
    iget-object v0, p1, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$Trigger;->triggers:Ljava/util/ArrayList;

    if-nez v0, :cond_3

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    goto :goto_3

    :cond_3
    iget-object v0, p1, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$Trigger;->triggers:Ljava/util/ArrayList;

    :goto_3
    iput-object v0, p0, Lcom/shopkick/sdk/zone/ZoneParcelable$TriggerParcelable;->triggers:Ljava/util/ArrayList;

    .line 343
    new-instance v0, Ljava/util/TreeMap;

    invoke-direct {v0}, Ljava/util/TreeMap;-><init>()V

    iput-object v0, p0, Lcom/shopkick/sdk/zone/ZoneParcelable$TriggerParcelable;->signalDistanceMap:Ljava/util/TreeMap;

    .line 344
    iget-object v0, p1, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$Trigger;->signalRanges:Ljava/util/ArrayList;

    if-eqz v0, :cond_4

    .line 345
    iget-object p1, p1, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$Trigger;->signalRanges:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$SignalRangePoint;

    .line 346
    iget-object v1, p0, Lcom/shopkick/sdk/zone/ZoneParcelable$TriggerParcelable;->signalDistanceMap:Ljava/util/TreeMap;

    iget-object v2, v0, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$SignalRangePoint;->signalStrength:Ljava/lang/Double;

    invoke-virtual {v2}, Ljava/lang/Double;->intValue()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iget-object v0, v0, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$SignalRangePoint;->distance:Ljava/lang/Double;

    invoke-virtual {v0}, Ljava/lang/Double;->intValue()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v1, v2, v0}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_4

    :cond_4
    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public getBeaconId()Ljava/lang/Long;
    .locals 1

    .line 325
    iget-object v0, p0, Lcom/shopkick/sdk/zone/ZoneParcelable$TriggerParcelable;->beaconId:Ljava/lang/Long;

    return-object v0
.end method

.method public getBtleDatas()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 326
    iget-object v0, p0, Lcom/shopkick/sdk/zone/ZoneParcelable$TriggerParcelable;->btleDatas:Ljava/util/ArrayList;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getLatitude()Ljava/lang/Double;
    .locals 1

    .line 322
    iget-object v0, p0, Lcom/shopkick/sdk/zone/ZoneParcelable$TriggerParcelable;->latitude:Ljava/lang/Double;

    return-object v0
.end method

.method public getLongitude()Ljava/lang/Double;
    .locals 1

    .line 323
    iget-object v0, p0, Lcom/shopkick/sdk/zone/ZoneParcelable$TriggerParcelable;->longitude:Ljava/lang/Double;

    return-object v0
.end method

.method public getRadius()Ljava/lang/Integer;
    .locals 1

    .line 324
    iget-object v0, p0, Lcom/shopkick/sdk/zone/ZoneParcelable$TriggerParcelable;->radius:Ljava/lang/Integer;

    return-object v0
.end method

.method public getSignalDistanceMap()Ljava/util/Map;
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

    .line 328
    iget-object v0, p0, Lcom/shopkick/sdk/zone/ZoneParcelable$TriggerParcelable;->signalDistanceMap:Ljava/util/TreeMap;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public getTriggerId()Ljava/lang/String;
    .locals 1

    .line 320
    iget-object v0, p0, Lcom/shopkick/sdk/zone/ZoneParcelable$TriggerParcelable;->triggerId:Ljava/lang/String;

    return-object v0
.end method

.method public getTriggers()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 327
    iget-object v0, p0, Lcom/shopkick/sdk/zone/ZoneParcelable$TriggerParcelable;->triggers:Ljava/util/ArrayList;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getType()Ljava/lang/String;
    .locals 1

    .line 321
    iget-object v0, p0, Lcom/shopkick/sdk/zone/ZoneParcelable$TriggerParcelable;->type:Ljava/lang/String;

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    .line 372
    iget-object p2, p0, Lcom/shopkick/sdk/zone/ZoneParcelable$TriggerParcelable;->triggerId:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 373
    iget-object p2, p0, Lcom/shopkick/sdk/zone/ZoneParcelable$TriggerParcelable;->type:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 375
    iget-object p2, p0, Lcom/shopkick/sdk/zone/ZoneParcelable$TriggerParcelable;->latitude:Ljava/lang/Double;

    invoke-static {p1, p2}, Lcom/shopkick/sdk/zone/ZoneParcelable;->access$400(Landroid/os/Parcel;Ljava/lang/Double;)V

    .line 376
    iget-object p2, p0, Lcom/shopkick/sdk/zone/ZoneParcelable$TriggerParcelable;->longitude:Ljava/lang/Double;

    invoke-static {p1, p2}, Lcom/shopkick/sdk/zone/ZoneParcelable;->access$400(Landroid/os/Parcel;Ljava/lang/Double;)V

    .line 377
    iget-object p2, p0, Lcom/shopkick/sdk/zone/ZoneParcelable$TriggerParcelable;->radius:Ljava/lang/Integer;

    invoke-static {p1, p2}, Lcom/shopkick/sdk/zone/ZoneParcelable;->access$500(Landroid/os/Parcel;Ljava/lang/Integer;)V

    .line 378
    iget-object p2, p0, Lcom/shopkick/sdk/zone/ZoneParcelable$TriggerParcelable;->beaconId:Ljava/lang/Long;

    invoke-static {p1, p2}, Lcom/shopkick/sdk/zone/ZoneParcelable;->access$600(Landroid/os/Parcel;Ljava/lang/Long;)V

    .line 380
    iget-object p2, p0, Lcom/shopkick/sdk/zone/ZoneParcelable$TriggerParcelable;->btleDatas:Ljava/util/ArrayList;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeStringList(Ljava/util/List;)V

    .line 381
    iget-object p2, p0, Lcom/shopkick/sdk/zone/ZoneParcelable$TriggerParcelable;->triggers:Ljava/util/ArrayList;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeStringList(Ljava/util/List;)V

    .line 382
    iget-object p2, p0, Lcom/shopkick/sdk/zone/ZoneParcelable$TriggerParcelable;->signalDistanceMap:Ljava/util/TreeMap;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeSerializable(Ljava/io/Serializable;)V

    return-void
.end method
