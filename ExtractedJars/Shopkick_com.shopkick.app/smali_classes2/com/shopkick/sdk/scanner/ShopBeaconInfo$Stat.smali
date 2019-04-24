.class public Lcom/shopkick/sdk/scanner/ShopBeaconInfo$Stat;
.super Ljava/lang/Object;
.source "ShopBeaconInfo.java"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/sdk/scanner/ShopBeaconInfo;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Stat"
.end annotation


# instance fields
.field final entryTimestamp:J

.field public final inBackground:Z

.field final motion:Lcom/shopkick/sdk/zone/ble/Motion;

.field public final proximity:Lcom/shopkick/sdk/zone/ble/Proximity;

.field final signalStrength:I


# direct methods
.method constructor <init>(JZILcom/shopkick/sdk/zone/ble/Proximity;ILcom/shopkick/sdk/zone/ble/Motion;)V
    .locals 0

    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    iput-wide p1, p0, Lcom/shopkick/sdk/scanner/ShopBeaconInfo$Stat;->entryTimestamp:J

    .line 42
    iput-object p5, p0, Lcom/shopkick/sdk/scanner/ShopBeaconInfo$Stat;->proximity:Lcom/shopkick/sdk/zone/ble/Proximity;

    .line 43
    iput-boolean p3, p0, Lcom/shopkick/sdk/scanner/ShopBeaconInfo$Stat;->inBackground:Z

    .line 44
    iput p4, p0, Lcom/shopkick/sdk/scanner/ShopBeaconInfo$Stat;->signalStrength:I

    .line 45
    iput-object p7, p0, Lcom/shopkick/sdk/scanner/ShopBeaconInfo$Stat;->motion:Lcom/shopkick/sdk/zone/ble/Motion;

    return-void
.end method
