.class Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager$DistanceComparator;
.super Ljava/lang/Object;
.source "GeoFenceRegistrationManager.java"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "DistanceComparator"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator<",
        "Lcom/shopkick/sdk/sensor/GeoFence;",
        ">;"
    }
.end annotation


# instance fields
.field private final location:Landroid/location/Location;

.field final synthetic this$0:Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;


# direct methods
.method constructor <init>(Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;Landroid/location/Location;)V
    .locals 0

    .line 640
    iput-object p1, p0, Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager$DistanceComparator;->this$0:Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p2, :cond_0

    .line 642
    iput-object p2, p0, Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager$DistanceComparator;->location:Landroid/location/Location;

    return-void

    .line 641
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "\'location\' can not be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public compare(Lcom/shopkick/sdk/sensor/GeoFence;Lcom/shopkick/sdk/sensor/GeoFence;)I
    .locals 10

    .line 647
    iget-object v0, p0, Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager$DistanceComparator;->location:Landroid/location/Location;

    .line 648
    invoke-virtual {v0}, Landroid/location/Location;->getLatitude()D

    move-result-wide v1

    iget-object v0, p0, Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager$DistanceComparator;->location:Landroid/location/Location;

    .line 649
    invoke-virtual {v0}, Landroid/location/Location;->getLongitude()D

    move-result-wide v3

    iget-wide v5, p1, Lcom/shopkick/sdk/sensor/GeoFence;->latitude:D

    iget-wide v7, p1, Lcom/shopkick/sdk/sensor/GeoFence;->longitude:D

    .line 647
    invoke-static/range {v1 .. v8}, Lcom/shopkick/utilities/GeoUtilities;->distanceBetween(DDDD)D

    move-result-wide v0

    .line 652
    iget p1, p1, Lcom/shopkick/sdk/sensor/GeoFence;->radius:I

    int-to-double v2, p1

    sub-double/2addr v0, v2

    .line 653
    iget-object p1, p0, Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager$DistanceComparator;->location:Landroid/location/Location;

    .line 654
    invoke-virtual {p1}, Landroid/location/Location;->getLatitude()D

    move-result-wide v2

    iget-object p1, p0, Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager$DistanceComparator;->location:Landroid/location/Location;

    .line 655
    invoke-virtual {p1}, Landroid/location/Location;->getLongitude()D

    move-result-wide v4

    iget-wide v6, p2, Lcom/shopkick/sdk/sensor/GeoFence;->latitude:D

    iget-wide v8, p2, Lcom/shopkick/sdk/sensor/GeoFence;->longitude:D

    .line 653
    invoke-static/range {v2 .. v9}, Lcom/shopkick/utilities/GeoUtilities;->distanceBetween(DDDD)D

    move-result-wide v2

    .line 658
    iget p1, p2, Lcom/shopkick/sdk/sensor/GeoFence;->radius:I

    int-to-double p1, p1

    sub-double/2addr v2, p1

    .line 659
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Double;->compare(DD)I

    move-result p1

    return p1
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    .line 637
    check-cast p1, Lcom/shopkick/sdk/sensor/GeoFence;

    check-cast p2, Lcom/shopkick/sdk/sensor/GeoFence;

    invoke-virtual {p0, p1, p2}, Lcom/shopkick/sdk/sensor/GeoFenceRegistrationManager$DistanceComparator;->compare(Lcom/shopkick/sdk/sensor/GeoFence;Lcom/shopkick/sdk/sensor/GeoFence;)I

    move-result p1

    return p1
.end method
