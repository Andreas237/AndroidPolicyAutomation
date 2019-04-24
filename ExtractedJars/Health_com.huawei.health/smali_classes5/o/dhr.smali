.class public Lo/dhr;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static c(Landroid/location/Location;Landroid/location/Location;)F
    .locals 7

    .line 75
    const/4 v4, 0x0

    .line 76
    if-eqz p0, :cond_0

    if-nez p1, :cond_1

    .line 77
    :cond_0
    return v4

    .line 80
    :cond_1
    new-instance v5, Lcom/amap/api/maps/model/LatLng;

    invoke-virtual {p0}, Landroid/location/Location;->getLatitude()D

    move-result-wide v0

    invoke-virtual {p0}, Landroid/location/Location;->getLongitude()D

    move-result-wide v2

    invoke-direct {v5, v0, v1, v2, v3}, Lcom/amap/api/maps/model/LatLng;-><init>(DD)V

    .line 81
    new-instance v6, Lcom/amap/api/maps/model/LatLng;

    invoke-virtual {p1}, Landroid/location/Location;->getLatitude()D

    move-result-wide v0

    invoke-virtual {p1}, Landroid/location/Location;->getLongitude()D

    move-result-wide v2

    invoke-direct {v6, v0, v1, v2, v3}, Lcom/amap/api/maps/model/LatLng;-><init>(DD)V

    .line 83
    invoke-static {v5, v6}, Lcom/amap/api/maps/AMapUtils;->calculateLineDistance(Lcom/amap/api/maps/model/LatLng;Lcom/amap/api/maps/model/LatLng;)F

    move-result v4

    .line 84
    return v4
.end method

.method public static c(I)I
    .locals 2

    .line 21
    const/4 v1, 0x0

    .line 22
    packed-switch p0, :pswitch_data_0

    goto :goto_0

    .line 24
    :pswitch_0
    const/4 v1, 0x0

    .line 25
    goto :goto_0

    .line 29
    :pswitch_1
    const/4 v1, 0x1

    .line 30
    goto :goto_0

    .line 32
    :pswitch_2
    const/4 v1, 0x2

    .line 33
    goto :goto_0

    .line 35
    :pswitch_3
    const/4 v1, 0x3

    .line 36
    goto :goto_0

    .line 38
    :pswitch_4
    const/4 v1, 0x4

    .line 39
    .line 44
    :goto_0
    return v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
    .end packed-switch
.end method

.method public static e(Landroid/content/Context;Landroid/location/Location;)Landroid/location/Location;
    .locals 7

    .line 94
    new-instance v5, Lcom/amap/api/maps/CoordinateConverter;

    invoke-direct {v5, p0}, Lcom/amap/api/maps/CoordinateConverter;-><init>(Landroid/content/Context;)V

    .line 95
    sget-object v0, Lcom/amap/api/maps/CoordinateConverter$CoordType;->GPS:Lcom/amap/api/maps/CoordinateConverter$CoordType;

    invoke-virtual {v5, v0}, Lcom/amap/api/maps/CoordinateConverter;->from(Lcom/amap/api/maps/CoordinateConverter$CoordType;)Lcom/amap/api/maps/CoordinateConverter;

    .line 96
    new-instance v0, Lcom/amap/api/maps/model/LatLng;

    invoke-virtual {p1}, Landroid/location/Location;->getLatitude()D

    move-result-wide v1

    .line 97
    invoke-virtual {p1}, Landroid/location/Location;->getLongitude()D

    move-result-wide v3

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/amap/api/maps/model/LatLng;-><init>(DD)V

    .line 96
    invoke-virtual {v5, v0}, Lcom/amap/api/maps/CoordinateConverter;->coord(Lcom/amap/api/maps/model/LatLng;)Lcom/amap/api/maps/CoordinateConverter;

    .line 99
    invoke-virtual {v5}, Lcom/amap/api/maps/CoordinateConverter;->convert()Lcom/amap/api/maps/model/LatLng;

    move-result-object v6

    .line 101
    if-eqz v6, :cond_0

    .line 102
    iget-wide v0, v6, Lcom/amap/api/maps/model/LatLng;->latitude:D

    invoke-virtual {p1, v0, v1}, Landroid/location/Location;->setLatitude(D)V

    .line 103
    iget-wide v0, v6, Lcom/amap/api/maps/model/LatLng;->longitude:D

    invoke-virtual {p1, v0, v1}, Landroid/location/Location;->setLongitude(D)V

    .line 106
    :cond_0
    return-object p1
.end method
