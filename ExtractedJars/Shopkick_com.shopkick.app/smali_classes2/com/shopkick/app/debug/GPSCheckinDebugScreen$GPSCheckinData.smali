.class Lcom/shopkick/app/debug/GPSCheckinDebugScreen$GPSCheckinData;
.super Ljava/lang/Object;
.source "GPSCheckinDebugScreen.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/debug/GPSCheckinDebugScreen;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "GPSCheckinData"
.end annotation


# instance fields
.field checkinLocation:Lcom/shopkick/app/fetchers/api/skapi/CheckinLocation;

.field latitude:D

.field location:Landroid/location/Location;

.field locationId:Ljava/lang/String;

.field longitude:D

.field name:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;DD)V
    .locals 1

    .line 69
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 70
    iput-object p1, p0, Lcom/shopkick/app/debug/GPSCheckinDebugScreen$GPSCheckinData;->name:Ljava/lang/String;

    .line 71
    iput-object p2, p0, Lcom/shopkick/app/debug/GPSCheckinDebugScreen$GPSCheckinData;->locationId:Ljava/lang/String;

    .line 72
    iput-wide p3, p0, Lcom/shopkick/app/debug/GPSCheckinDebugScreen$GPSCheckinData;->latitude:D

    .line 73
    iput-wide p5, p0, Lcom/shopkick/app/debug/GPSCheckinDebugScreen$GPSCheckinData;->longitude:D

    .line 75
    new-instance p1, Lcom/shopkick/app/fetchers/api/skapi/CheckinLocation;

    invoke-direct {p1}, Lcom/shopkick/app/fetchers/api/skapi/CheckinLocation;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/debug/GPSCheckinDebugScreen$GPSCheckinData;->checkinLocation:Lcom/shopkick/app/fetchers/api/skapi/CheckinLocation;

    .line 76
    iget-object p1, p0, Lcom/shopkick/app/debug/GPSCheckinDebugScreen$GPSCheckinData;->checkinLocation:Lcom/shopkick/app/fetchers/api/skapi/CheckinLocation;

    invoke-static {p3, p4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    iput-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/CheckinLocation;->latitude:Ljava/lang/Double;

    .line 77
    iget-object p1, p0, Lcom/shopkick/app/debug/GPSCheckinDebugScreen$GPSCheckinData;->checkinLocation:Lcom/shopkick/app/fetchers/api/skapi/CheckinLocation;

    invoke-static {p5, p6}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    iput-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/CheckinLocation;->longitude:Ljava/lang/Double;

    .line 78
    iget-object p1, p0, Lcom/shopkick/app/debug/GPSCheckinDebugScreen$GPSCheckinData;->checkinLocation:Lcom/shopkick/app/fetchers/api/skapi/CheckinLocation;

    iput-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/CheckinLocation;->locationId:Ljava/lang/String;

    const/16 p2, 0xfa0

    .line 79
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    iput-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/CheckinLocation;->loiterTimeMs:Ljava/lang/Integer;

    .line 80
    iget-object p1, p0, Lcom/shopkick/app/debug/GPSCheckinDebugScreen$GPSCheckinData;->checkinLocation:Lcom/shopkick/app/fetchers/api/skapi/CheckinLocation;

    const p2, 0x98967f

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    iput-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/CheckinLocation;->loiterRadius:Ljava/lang/Integer;

    .line 82
    new-instance p1, Landroid/location/Location;

    const-string p2, "dummyprovider"

    invoke-direct {p1, p2}, Landroid/location/Location;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Lcom/shopkick/app/debug/GPSCheckinDebugScreen$GPSCheckinData;->location:Landroid/location/Location;

    .line 83
    iget-object p1, p0, Lcom/shopkick/app/debug/GPSCheckinDebugScreen$GPSCheckinData;->location:Landroid/location/Location;

    invoke-virtual {p1, p3, p4}, Landroid/location/Location;->setLatitude(D)V

    .line 84
    iget-object p1, p0, Lcom/shopkick/app/debug/GPSCheckinDebugScreen$GPSCheckinData;->location:Landroid/location/Location;

    invoke-virtual {p1, p5, p6}, Landroid/location/Location;->setLongitude(D)V

    .line 85
    iget-object p1, p0, Lcom/shopkick/app/debug/GPSCheckinDebugScreen$GPSCheckinData;->location:Landroid/location/Location;

    const/high16 p2, 0x41200000    # 10.0f

    invoke-virtual {p1, p2}, Landroid/location/Location;->setAccuracy(F)V

    return-void
.end method
