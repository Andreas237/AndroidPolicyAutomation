.class public Lcom/shopkick/app/location/StoreNearbyNotifier$WalkinAreaMappedValue;
.super Ljava/lang/Object;
.source "StoreNearbyNotifier.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/location/StoreNearbyNotifier;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4
    name = "WalkinAreaMappedValue"
.end annotation


# instance fields
.field private closestLocationToWalkinArea:Landroid/location/Location;

.field private confidenceValue:D

.field final synthetic this$0:Lcom/shopkick/app/location/StoreNearbyNotifier;


# direct methods
.method protected constructor <init>(Lcom/shopkick/app/location/StoreNearbyNotifier;DLandroid/location/Location;)V
    .locals 0

    .line 718
    iput-object p1, p0, Lcom/shopkick/app/location/StoreNearbyNotifier$WalkinAreaMappedValue;->this$0:Lcom/shopkick/app/location/StoreNearbyNotifier;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 719
    iput-wide p2, p0, Lcom/shopkick/app/location/StoreNearbyNotifier$WalkinAreaMappedValue;->confidenceValue:D

    .line 720
    iput-object p4, p0, Lcom/shopkick/app/location/StoreNearbyNotifier$WalkinAreaMappedValue;->closestLocationToWalkinArea:Landroid/location/Location;

    return-void
.end method

.method static synthetic access$200(Lcom/shopkick/app/location/StoreNearbyNotifier$WalkinAreaMappedValue;)Landroid/location/Location;
    .locals 0

    .line 714
    iget-object p0, p0, Lcom/shopkick/app/location/StoreNearbyNotifier$WalkinAreaMappedValue;->closestLocationToWalkinArea:Landroid/location/Location;

    return-object p0
.end method

.method static synthetic access$202(Lcom/shopkick/app/location/StoreNearbyNotifier$WalkinAreaMappedValue;Landroid/location/Location;)Landroid/location/Location;
    .locals 0

    .line 714
    iput-object p1, p0, Lcom/shopkick/app/location/StoreNearbyNotifier$WalkinAreaMappedValue;->closestLocationToWalkinArea:Landroid/location/Location;

    return-object p1
.end method

.method static synthetic access$300(Lcom/shopkick/app/location/StoreNearbyNotifier$WalkinAreaMappedValue;)D
    .locals 2

    .line 714
    iget-wide v0, p0, Lcom/shopkick/app/location/StoreNearbyNotifier$WalkinAreaMappedValue;->confidenceValue:D

    return-wide v0
.end method

.method static synthetic access$302(Lcom/shopkick/app/location/StoreNearbyNotifier$WalkinAreaMappedValue;D)D
    .locals 0

    .line 714
    iput-wide p1, p0, Lcom/shopkick/app/location/StoreNearbyNotifier$WalkinAreaMappedValue;->confidenceValue:D

    return-wide p1
.end method
