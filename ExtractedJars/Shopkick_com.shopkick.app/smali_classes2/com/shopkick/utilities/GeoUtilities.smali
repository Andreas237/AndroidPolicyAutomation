.class public final Lcom/shopkick/utilities/GeoUtilities;
.super Ljava/lang/Object;
.source "GeoUtilities.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/utilities/GeoUtilities$CircleRelationship;
    }
.end annotation


# static fields
.field public static final DEFAULT_CLIENT_LOCATION_BUCKET_SIZE:D = 8046.72

.field public static final DEG_TO_RAD:D = 0.017453292519943295

.field private static final EARTHS_RADIUS_IN_METERS:D = 6371010.0

.field public static final METER_TO_DEG_LAT:D = 8.993216059187306E-6

.field public static final RAD_TO_DEG:D = 57.29577951308232


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static degreesToRadians(D)D
    .locals 2

    const-wide v0, 0x3f91df46a2529d39L    # 0.017453292519943295

    mul-double/2addr p0, v0

    return-wide p0
.end method

.method public static distanceBetween(DDDD)D
    .locals 4

    sub-double v0, p4, p0

    .line 89
    invoke-static {v0, v1}, Lcom/shopkick/utilities/GeoUtilities;->degreesToRadians(D)D

    move-result-wide v0

    sub-double/2addr p6, p2

    .line 90
    invoke-static {p6, p7}, Lcom/shopkick/utilities/GeoUtilities;->degreesToRadians(D)D

    move-result-wide p2

    const-wide/high16 p6, 0x4000000000000000L    # 2.0

    div-double/2addr v0, p6

    .line 92
    invoke-static {v0, v1}, Ljava/lang/Math;->sin(D)D

    move-result-wide v2

    .line 93
    invoke-static {v0, v1}, Ljava/lang/Math;->sin(D)D

    move-result-wide v0

    mul-double/2addr v2, v0

    .line 94
    invoke-static {p0, p1}, Lcom/shopkick/utilities/GeoUtilities;->degreesToRadians(D)D

    move-result-wide p0

    invoke-static {p0, p1}, Ljava/lang/Math;->cos(D)D

    move-result-wide p0

    .line 95
    invoke-static {p4, p5}, Lcom/shopkick/utilities/GeoUtilities;->degreesToRadians(D)D

    move-result-wide p4

    invoke-static {p4, p5}, Ljava/lang/Math;->cos(D)D

    move-result-wide p4

    mul-double/2addr p0, p4

    div-double/2addr p2, p6

    .line 96
    invoke-static {p2, p3}, Ljava/lang/Math;->sin(D)D

    move-result-wide p4

    mul-double/2addr p0, p4

    .line 97
    invoke-static {p2, p3}, Ljava/lang/Math;->sin(D)D

    move-result-wide p2

    mul-double/2addr p0, p2

    add-double/2addr v2, p0

    .line 98
    invoke-static {v2, v3}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide p0

    const-wide/high16 p2, 0x3ff0000000000000L    # 1.0

    sub-double/2addr p2, v2

    invoke-static {p2, p3}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide p2

    invoke-static {p0, p1, p2, p3}, Ljava/lang/Math;->atan2(DD)D

    move-result-wide p0

    mul-double/2addr p0, p6

    const-wide p2, 0x41584db080000000L    # 6371010.0

    mul-double/2addr p0, p2

    return-wide p0
.end method

.method public static getCircleRelationship(DDDDDD)Lcom/shopkick/utilities/GeoUtilities$CircleRelationship;
    .locals 8

    cmpl-double v0, p0, p6

    if-nez v0, :cond_0

    cmpl-double v0, p2, p8

    if-nez v0, :cond_0

    cmpl-double v0, p4, p10

    if-nez v0, :cond_0

    .line 56
    sget-object v0, Lcom/shopkick/utilities/GeoUtilities$CircleRelationship;->Equal:Lcom/shopkick/utilities/GeoUtilities$CircleRelationship;

    return-object v0

    :cond_0
    move-wide v0, p0

    move-wide v2, p2

    move-wide v4, p6

    move-wide/from16 v6, p8

    .line 60
    invoke-static/range {v0 .. v7}, Lcom/shopkick/utilities/GeoUtilities;->distanceBetween(DDDD)D

    move-result-wide v0

    add-double v2, p4, p10

    cmpl-double v2, v0, v2

    if-lez v2, :cond_1

    .line 64
    sget-object v0, Lcom/shopkick/utilities/GeoUtilities$CircleRelationship;->NoOverlap:Lcom/shopkick/utilities/GeoUtilities$CircleRelationship;

    return-object v0

    :cond_1
    sub-double v2, p4, p10

    .line 65
    invoke-static {v2, v3}, Ljava/lang/Math;->abs(D)D

    move-result-wide v2

    cmpg-double v0, v0, v2

    if-gtz v0, :cond_3

    cmpl-double v0, p4, p10

    if-ltz v0, :cond_2

    .line 70
    sget-object v0, Lcom/shopkick/utilities/GeoUtilities$CircleRelationship;->AContainsB:Lcom/shopkick/utilities/GeoUtilities$CircleRelationship;

    return-object v0

    .line 74
    :cond_2
    sget-object v0, Lcom/shopkick/utilities/GeoUtilities$CircleRelationship;->BContainsA:Lcom/shopkick/utilities/GeoUtilities$CircleRelationship;

    return-object v0

    .line 79
    :cond_3
    sget-object v0, Lcom/shopkick/utilities/GeoUtilities$CircleRelationship;->Overlap:Lcom/shopkick/utilities/GeoUtilities$CircleRelationship;

    return-object v0
.end method

.method public static radiansToDegrees(D)D
    .locals 2

    const-wide v0, 0x404ca5dc1a63c1f8L    # 57.29577951308232

    mul-double/2addr p0, v0

    return-wide p0
.end method

.method public static roundLatLonForBucketedCaching(Landroid/location/Location;D)V
    .locals 6

    if-eqz p0, :cond_0

    .line 130
    invoke-virtual {p0}, Landroid/location/Location;->getLatitude()D

    move-result-wide v0

    .line 131
    invoke-virtual {p0}, Landroid/location/Location;->getLongitude()D

    move-result-wide v2

    move-wide v4, p1

    .line 129
    invoke-static/range {v0 .. v5}, Lcom/shopkick/utilities/GeoUtilities;->roundLatLonForBucketedCaching(DDD)[D

    move-result-object p1

    const/4 p2, 0x0

    .line 135
    aget-wide v0, p1, p2

    invoke-virtual {p0, v0, v1}, Landroid/location/Location;->setLatitude(D)V

    const/4 p2, 0x1

    .line 136
    aget-wide v0, p1, p2

    invoke-virtual {p0, v0, v1}, Landroid/location/Location;->setLongitude(D)V

    return-void

    .line 125
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "\'location\' cannot be null"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static roundLatLonForBucketedCaching(DDD)[D
    .locals 9

    const-wide v0, -0x3fa9800000000000L    # -90.0

    cmpg-double v0, p0, v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ltz v0, :cond_2

    const-wide v3, 0x4056800000000000L    # 90.0

    cmpl-double v0, p0, v3

    if-gtz v0, :cond_2

    const-wide v5, -0x3f99800000000000L    # -180.0

    cmpg-double v0, p2, v5

    if-ltz v0, :cond_1

    const-wide v5, 0x4066800000000000L    # 180.0

    cmpl-double v0, p2, v5

    if-gtz v0, :cond_1

    const-wide/16 v7, 0x0

    cmpg-double v0, p4, v7

    if-lez v0, :cond_0

    const-wide v7, 0x3ee2dc32341a0960L    # 8.993216059187306E-6

    mul-double/2addr p4, v7

    add-double/2addr p0, v3

    div-double/2addr p0, p4

    double-to-int p0, p0

    int-to-double p0, p0

    mul-double/2addr p0, p4

    sub-double/2addr p0, v3

    const-wide v3, 0x3f91df46a2529d39L    # 0.017453292519943295

    mul-double/2addr v3, p0

    .line 165
    invoke-static {v3, v4}, Ljava/lang/Math;->cos(D)D

    move-result-wide v3

    div-double v3, p4, v3

    add-double/2addr p2, v5

    div-double/2addr p2, v3

    double-to-int p2, p2

    int-to-double p2, p2

    mul-double/2addr p2, v3

    sub-double/2addr p2, v5

    const/4 v0, 0x2

    .line 170
    new-array v0, v0, [D

    const-wide/high16 v5, 0x4000000000000000L    # 2.0

    div-double/2addr p4, v5

    add-double/2addr p0, p4

    aput-wide p0, v0, v1

    div-double/2addr v3, v5

    add-double/2addr p2, v3

    aput-wide p2, v0, v2

    return-object v0

    .line 159
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    sget-object p1, Ljava/util/Locale;->US:Ljava/util/Locale;

    new-array p2, v2, [Ljava/lang/Object;

    invoke-static {p4, p5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p3

    aput-object p3, p2, v1

    const-string p3, "Illegal bucketSizeInMeters value [%1$f]"

    invoke-static {p1, p3, p2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 156
    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    sget-object p1, Ljava/util/Locale;->US:Ljava/util/Locale;

    new-array p4, v2, [Ljava/lang/Object;

    invoke-static {p2, p3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p2

    aput-object p2, p4, v1

    const-string p2, "Illegal longitude value [%1$f]"

    invoke-static {p1, p2, p4}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 153
    :cond_2
    new-instance p2, Ljava/lang/IllegalArgumentException;

    sget-object p3, Ljava/util/Locale;->US:Ljava/util/Locale;

    new-array p4, v2, [Ljava/lang/Object;

    invoke-static {p0, p1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p0

    aput-object p0, p4, v1

    const-string p0, "Illegal latitude value [%1$f]"

    invoke-static {p3, p0, p4}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {p2, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method
