.class public Lo/cdr;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lo/cgk;

.field private static final b:[D

.field private static final c:[I

.field private static final d:I

.field private static final e:I


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 47
    const/4 v0, 0x3

    new-array v0, v0, [D

    fill-array-data v0, :array_0

    sput-object v0, Lo/cdr;->b:[D

    .line 49
    new-instance v0, Lo/cgk;

    sget-object v1, Lo/cdr;->b:[D

    const/4 v2, 0x0

    aget-wide v1, v1, v2

    sget-object v3, Lo/cdr;->b:[D

    const/4 v4, 0x1

    aget-wide v3, v3, v4

    invoke-direct {v0, v1, v2, v3, v4}, Lo/cgk;-><init>(DD)V

    sput-object v0, Lo/cdr;->a:Lo/cgk;

    .line 71
    const/16 v0, 0x1ff

    new-array v0, v0, [I

    sput-object v0, Lo/cdr;->c:[I

    .line 72
    const/4 v5, 0x0

    .line 74
    const/4 v6, 0x0

    :goto_0
    const/16 v0, 0xff

    if-gt v6, v0, :cond_0

    .line 75
    sget-object v0, Lo/cdr;->c:[I

    move v1, v5

    add-int/lit8 v5, v5, 0x1

    const/16 v2, 0xff

    const/4 v3, 0x0

    invoke-static {v6, v2, v3}, Landroid/graphics/Color;->rgb(III)I

    move-result v2

    aput v2, v0, v1

    .line 74
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 78
    :cond_0
    const/16 v6, 0xfe

    :goto_1
    if-ltz v6, :cond_1

    .line 79
    sget-object v0, Lo/cdr;->c:[I

    move v1, v5

    add-int/lit8 v5, v5, 0x1

    const/16 v2, 0xff

    const/4 v3, 0x0

    invoke-static {v2, v6, v3}, Landroid/graphics/Color;->rgb(III)I

    move-result v2

    aput v2, v0, v1

    .line 78
    add-int/lit8 v6, v6, -0x1

    goto :goto_1

    .line 81
    :cond_1
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 82
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const/high16 v1, 0x41b80000    # 23.0f

    invoke-static {v0, v1}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v0

    sput v0, Lo/cdr;->d:I

    .line 83
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const/high16 v1, 0x41d00000    # 26.0f

    invoke-static {v0, v1}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v0

    sput v0, Lo/cdr;->e:I

    goto :goto_2

    .line 85
    :cond_2
    const/16 v0, 0x5a

    sput v0, Lo/cdr;->d:I

    .line 86
    const/16 v0, 0x69

    sput v0, Lo/cdr;->e:I

    .line 88
    :goto_2
    return-void

    nop

    :array_0
    .array-data 8
        0x4056800000000000L    # 90.0
        -0x3fac000000000000L    # -80.0
        0x0
    .end array-data
.end method

.method public constructor <init>()V
    .locals 0

    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Lcom/amap/api/maps/model/LatLng;)Lo/cgk;
    .locals 5

    .line 612
    iget-wide v1, p0, Lcom/amap/api/maps/model/LatLng;->latitude:D

    .line 613
    iget-wide v3, p0, Lcom/amap/api/maps/model/LatLng;->longitude:D

    .line 614
    new-instance v0, Lo/cgk;

    invoke-direct {v0, v1, v2, v3, v4}, Lo/cgk;-><init>(DD)V

    return-object v0
.end method

.method private static b(I)I
    .locals 5

    .line 446
    const/high16 v0, 0xff0000

    and-int/2addr v0, p0

    shr-int/lit8 v2, v0, 0x10

    .line 447
    const v0, 0xff00

    and-int/2addr v0, p0

    shr-int/lit8 v3, v0, 0x8

    .line 450
    sub-int v0, v2, v3

    add-int/lit16 v4, v0, 0xff

    .line 451
    if-ltz v4, :cond_0

    const/16 v0, 0x1ff

    if-ge v4, v0, :cond_0

    .line 452
    return v4

    .line 454
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public static b(Lo/cgk;)Lcom/amap/api/maps/model/LatLng;
    .locals 5

    .line 603
    iget-wide v1, p0, Lo/cgk;->d:D

    .line 604
    iget-wide v3, p0, Lo/cgk;->b:D

    .line 605
    new-instance v0, Lcom/amap/api/maps/model/LatLng;

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/amap/api/maps/model/LatLng;-><init>(DD)V

    return-object v0
.end method

.method public static b(Landroid/content/res/Resources;Lcom/amap/api/maps/model/LatLng;Ljava/lang/String;)Lcom/amap/api/maps/model/MarkerOptions;
    .locals 9

    .line 259
    if-nez p1, :cond_0

    .line 261
    const-string v0, "Track_DrawMapUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "addMarker latlng is null."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 262
    const/4 v0, 0x0

    return-object v0

    .line 265
    :cond_0
    new-instance v0, Lcom/amap/api/maps/model/MarkerOptions;

    invoke-direct {v0}, Lcom/amap/api/maps/model/MarkerOptions;-><init>()V

    invoke-virtual {v0, p1}, Lcom/amap/api/maps/model/MarkerOptions;->position(Lcom/amap/api/maps/model/LatLng;)Lcom/amap/api/maps/model/MarkerOptions;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/amap/api/maps/model/MarkerOptions;->draggable(Z)Lcom/amap/api/maps/model/MarkerOptions;

    move-result-object v0

    const/high16 v1, 0x3f000000    # 0.5f

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1, v2}, Lcom/amap/api/maps/model/MarkerOptions;->anchor(FF)Lcom/amap/api/maps/model/MarkerOptions;

    move-result-object v0

    const/high16 v1, 0x41200000    # 10.0f

    invoke-virtual {v0, v1}, Lcom/amap/api/maps/model/MarkerOptions;->zIndex(F)Lcom/amap/api/maps/model/MarkerOptions;

    move-result-object v4

    .line 266
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v0

    invoke-static {p0, v0}, Lo/cdr;->e(Landroid/content/res/Resources;I)Landroid/text/TextPaint;

    move-result-object v5

    .line 268
    new-instance v6, Landroid/graphics/Rect;

    invoke-direct {v6}, Landroid/graphics/Rect;-><init>()V

    .line 269
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    invoke-virtual {v5, p2, v1, v0, v6}, Landroid/text/TextPaint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 271
    .line 272
    invoke-static {p0}, Lo/cdr;->e(Landroid/content/res/Resources;)Landroid/graphics/Bitmap;

    move-result-object v7

    .line 274
    new-instance v8, Landroid/graphics/Canvas;

    invoke-direct {v8, v7}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 275
    invoke-virtual {v7}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    invoke-virtual {v7}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {v5}, Landroid/text/TextPaint;->getFontMetrics()Landroid/graphics/Paint$FontMetrics;

    move-result-object v2

    iget v2, v2, Landroid/graphics/Paint$FontMetrics;->top:F

    sub-float/2addr v1, v2

    invoke-virtual {v5}, Landroid/text/TextPaint;->getFontMetrics()Landroid/graphics/Paint$FontMetrics;

    move-result-object v2

    iget v2, v2, Landroid/graphics/Paint$FontMetrics;->bottom:F

    sub-float/2addr v1, v2

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    const/high16 v2, 0x40000000    # 2.0f

    invoke-static {p0, v2}, Lo/cdr;->d(Landroid/content/res/Resources;F)F

    move-result v2

    sub-float/2addr v1, v2

    invoke-virtual {v8, p2, v0, v1, v5}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 276
    invoke-static {v7}, Lcom/amap/api/maps/model/BitmapDescriptorFactory;->fromBitmap(Landroid/graphics/Bitmap;)Lcom/amap/api/maps/model/BitmapDescriptor;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/amap/api/maps/model/MarkerOptions;->icon(Lcom/amap/api/maps/model/BitmapDescriptor;)Lcom/amap/api/maps/model/MarkerOptions;

    .line 277
    return-object v4
.end method

.method public static b(Lcom/google/android/gms/maps/GoogleMap;Lo/cgk;)Lcom/google/android/gms/maps/model/Marker;
    .locals 4

    .line 203
    if-nez p0, :cond_0

    .line 204
    const-string v0, "Track_DrawMapUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "addGoogleEndMarker amap is null."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 205
    const/4 v0, 0x0

    return-object v0

    .line 208
    :cond_0
    if-nez p1, :cond_1

    .line 209
    const-string v0, "Track_DrawMapUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "addGoogleEndMarker latlng is null."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 210
    const/4 v0, 0x0

    return-object v0

    .line 213
    :cond_1
    new-instance v0, Lcom/google/android/gms/maps/model/MarkerOptions;

    invoke-direct {v0}, Lcom/google/android/gms/maps/model/MarkerOptions;-><init>()V

    invoke-static {p1}, Lo/cdr;->c(Lo/cgk;)Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/model/MarkerOptions;->position(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object v0

    .line 214
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/model/MarkerOptions;->draggable(Z)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object v0

    .line 215
    const/high16 v1, 0x3f000000    # 0.5f

    const/high16 v2, 0x3f000000    # 0.5f

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/maps/model/MarkerOptions;->anchor(FF)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$drawable;->hw_show_map_tracking_end_img:I

    .line 216
    invoke-static {v1}, Lcom/google/android/gms/maps/model/BitmapDescriptorFactory;->fromResource(I)Lcom/google/android/gms/maps/model/BitmapDescriptor;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/model/MarkerOptions;->icon(Lcom/google/android/gms/maps/model/BitmapDescriptor;)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object v0

    .line 213
    invoke-virtual {p0, v0}, Lcom/google/android/gms/maps/GoogleMap;->addMarker(Lcom/google/android/gms/maps/model/MarkerOptions;)Lcom/google/android/gms/maps/model/Marker;

    move-result-object v0

    return-object v0
.end method

.method public static b(Landroid/content/res/Resources;Lcom/google/android/gms/maps/model/LatLng;Ljava/lang/String;)Lcom/google/android/gms/maps/model/MarkerOptions;
    .locals 9

    .line 282
    if-nez p1, :cond_0

    .line 284
    const-string v0, "Track_DrawMapUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "addMarker latlng is null."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 285
    const/4 v0, 0x0

    return-object v0

    .line 288
    :cond_0
    new-instance v0, Lcom/google/android/gms/maps/model/MarkerOptions;

    invoke-direct {v0}, Lcom/google/android/gms/maps/model/MarkerOptions;-><init>()V

    .line 289
    invoke-virtual {v0, p1}, Lcom/google/android/gms/maps/model/MarkerOptions;->position(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/model/MarkerOptions;->draggable(Z)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object v0

    const/high16 v1, 0x3f000000    # 0.5f

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/maps/model/MarkerOptions;->anchor(FF)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object v0

    const/high16 v1, 0x41200000    # 10.0f

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/model/MarkerOptions;->zIndex(F)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object v4

    .line 291
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v0

    invoke-static {p0, v0}, Lo/cdr;->e(Landroid/content/res/Resources;I)Landroid/text/TextPaint;

    move-result-object v5

    .line 292
    new-instance v6, Landroid/graphics/Rect;

    invoke-direct {v6}, Landroid/graphics/Rect;-><init>()V

    .line 293
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    invoke-virtual {v5, p2, v1, v0, v6}, Landroid/text/TextPaint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 296
    .line 297
    invoke-static {p0}, Lo/cdr;->e(Landroid/content/res/Resources;)Landroid/graphics/Bitmap;

    move-result-object v7

    .line 299
    new-instance v8, Landroid/graphics/Canvas;

    invoke-direct {v8, v7}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 300
    invoke-virtual {v7}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    invoke-virtual {v7}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {v5}, Landroid/text/TextPaint;->getFontMetrics()Landroid/graphics/Paint$FontMetrics;

    move-result-object v2

    iget v2, v2, Landroid/graphics/Paint$FontMetrics;->top:F

    sub-float/2addr v1, v2

    invoke-virtual {v5}, Landroid/text/TextPaint;->getFontMetrics()Landroid/graphics/Paint$FontMetrics;

    move-result-object v2

    iget v2, v2, Landroid/graphics/Paint$FontMetrics;->bottom:F

    sub-float/2addr v1, v2

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    const/high16 v2, 0x40000000    # 2.0f

    invoke-static {p0, v2}, Lo/cdr;->d(Landroid/content/res/Resources;F)F

    move-result v2

    sub-float/2addr v1, v2

    invoke-virtual {v8, p2, v0, v1, v5}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 301
    invoke-static {v7}, Lcom/google/android/gms/maps/model/BitmapDescriptorFactory;->fromBitmap(Landroid/graphics/Bitmap;)Lcom/google/android/gms/maps/model/BitmapDescriptor;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/google/android/gms/maps/model/MarkerOptions;->icon(Lcom/google/android/gms/maps/model/BitmapDescriptor;)Lcom/google/android/gms/maps/model/MarkerOptions;

    .line 303
    return-object v4
.end method

.method public static b(DD)Z
    .locals 2

    .line 377
    new-instance v1, Lo/cgk;

    invoke-direct {v1, p0, p1, p2, p3}, Lo/cgk;-><init>(DD)V

    .line 378
    invoke-static {v1}, Lo/cdr;->d(Lo/cgk;)Z

    move-result v0

    return v0
.end method

.method public static b(Lo/cgk;Lo/cgk;)Z
    .locals 4

    .line 389
    iget-wide v0, p0, Lo/cgk;->d:D

    iget-wide v2, p1, Lo/cgk;->d:D

    sub-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(D)D

    move-result-wide v0

    const-wide v2, 0x3eb0c6f7a0b5ed8dL    # 1.0E-6

    cmpg-double v0, v0, v2

    if-gez v0, :cond_0

    iget-wide v0, p0, Lo/cgk;->b:D

    iget-wide v2, p1, Lo/cgk;->b:D

    sub-double/2addr v0, v2

    .line 391
    invoke-static {v0, v1}, Ljava/lang/Math;->abs(D)D

    move-result-wide v0

    const-wide v2, 0x3eb0c6f7a0b5ed8dL    # 1.0E-6

    cmpg-double v0, v0, v2

    if-gez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 389
    :goto_0
    return v0
.end method

.method public static b(Landroid/content/Context;Landroid/location/Location;)[D
    .locals 8

    .line 547
    if-eqz p0, :cond_0

    if-nez p1, :cond_1

    .line 548
    :cond_0
    const-string v0, "Track_DrawMapUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "context or location is null, please check"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 549
    const/4 v0, 0x2

    new-array v0, v0, [D

    fill-array-data v0, :array_0

    return-object v0

    .line 551
    :cond_1
    const/4 v5, 0x0

    .line 552
    new-instance v6, Lcom/amap/api/maps/CoordinateConverter;

    invoke-direct {v6, p0}, Lcom/amap/api/maps/CoordinateConverter;-><init>(Landroid/content/Context;)V

    .line 553
    sget-object v0, Lcom/amap/api/maps/CoordinateConverter$CoordType;->GPS:Lcom/amap/api/maps/CoordinateConverter$CoordType;

    invoke-virtual {v6, v0}, Lcom/amap/api/maps/CoordinateConverter;->from(Lcom/amap/api/maps/CoordinateConverter$CoordType;)Lcom/amap/api/maps/CoordinateConverter;

    .line 554
    new-instance v0, Lo/cgk;

    invoke-virtual {p1}, Landroid/location/Location;->getLatitude()D

    move-result-wide v1

    invoke-virtual {p1}, Landroid/location/Location;->getLongitude()D

    move-result-wide v3

    invoke-direct {v0, v1, v2, v3, v4}, Lo/cgk;-><init>(DD)V

    invoke-static {v0}, Lo/cdr;->b(Lo/cgk;)Lcom/amap/api/maps/model/LatLng;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/amap/api/maps/CoordinateConverter;->coord(Lcom/amap/api/maps/model/LatLng;)Lcom/amap/api/maps/CoordinateConverter;

    .line 555
    invoke-virtual {v6}, Lcom/amap/api/maps/CoordinateConverter;->convert()Lcom/amap/api/maps/model/LatLng;

    move-result-object v5

    .line 558
    const/4 v0, 0x2

    new-array v7, v0, [D

    .line 559
    if-eqz v5, :cond_2

    .line 560
    iget-wide v0, v5, Lcom/amap/api/maps/model/LatLng;->latitude:D

    const/4 v2, 0x0

    aput-wide v0, v7, v2

    .line 561
    iget-wide v0, v5, Lcom/amap/api/maps/model/LatLng;->longitude:D

    const/4 v2, 0x1

    aput-wide v0, v7, v2

    goto :goto_0

    .line 563
    :cond_2
    invoke-virtual {p1}, Landroid/location/Location;->getLatitude()D

    move-result-wide v0

    const/4 v2, 0x0

    aput-wide v0, v7, v2

    .line 564
    invoke-virtual {p1}, Landroid/location/Location;->getLongitude()D

    move-result-wide v0

    const/4 v2, 0x1

    aput-wide v0, v7, v2

    .line 566
    :goto_0
    return-object v7

    :array_0
    .array-data 8
        0x0
        0x0
    .end array-data
.end method

.method public static c(FI)I
    .locals 6

    .line 463
    const v0, 0x3a83126f    # 0.001f

    cmpg-float v0, p0, v0

    if-gtz v0, :cond_0

    .line 464
    sget v0, Lo/cdw;->a:I

    return v0

    .line 467
    :cond_0
    const/high16 v0, 0x447a0000    # 1000.0f

    div-float/2addr v0, p0

    const v1, 0x40666666    # 3.6f

    mul-float v3, v0, v1

    .line 472
    const/16 v0, 0x101

    if-ne v0, p1, :cond_1

    .line 474
    const/4 v4, 0x7

    .line 475
    const/4 v5, 0x4

    goto :goto_0

    .line 477
    :cond_1
    const/16 v0, 0x102

    if-eq v0, p1, :cond_2

    const/16 v0, 0x118

    if-ne v0, p1, :cond_3

    .line 479
    :cond_2
    const/16 v4, 0xc

    .line 480
    const/4 v5, 0x6

    goto :goto_0

    .line 482
    :cond_3
    const/16 v0, 0x104

    if-ne v0, p1, :cond_4

    .line 483
    const/4 v4, 0x7

    .line 484
    const/4 v5, 0x4

    goto :goto_0

    .line 488
    :cond_4
    const/16 v4, 0x1e

    .line 489
    const/16 v5, 0xa

    .line 493
    :goto_0
    int-to-float v0, v4

    int-to-float v1, v5

    invoke-static {v0, v1, v3}, Lo/cdr;->e(FFF)I

    move-result v2

    .line 494
    return v2
.end method

.method public static c(Lo/cgk;)Lcom/google/android/gms/maps/model/LatLng;
    .locals 5

    .line 621
    iget-wide v1, p0, Lo/cgk;->d:D

    .line 622
    iget-wide v3, p0, Lo/cgk;->b:D

    .line 623
    new-instance v0, Lcom/google/android/gms/maps/model/LatLng;

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    return-object v0
.end method

.method private static d(Landroid/content/res/Resources;F)F
    .locals 2

    .line 357
    invoke-virtual {p0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    mul-float/2addr v0, p1

    const/high16 v1, 0x3f000000    # 0.5f

    add-float/2addr v0, v1

    return v0
.end method

.method public static d(Landroid/content/Context;)Landroid/location/Location;
    .locals 6

    .line 636
    const-string v0, "location"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Landroid/location/LocationManager;

    .line 639
    new-instance v2, Landroid/location/Criteria;

    invoke-direct {v2}, Landroid/location/Criteria;-><init>()V

    .line 640
    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Landroid/location/Criteria;->setAccuracy(I)V

    .line 641
    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Landroid/location/Criteria;->setAltitudeRequired(Z)V

    .line 642
    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Landroid/location/Criteria;->setBearingRequired(Z)V

    .line 643
    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Landroid/location/Criteria;->setCostAllowed(Z)V

    .line 644
    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Landroid/location/Criteria;->setPowerRequirement(I)V

    .line 647
    const/4 v0, 0x1

    invoke-virtual {v1, v2, v0}, Landroid/location/LocationManager;->getBestProvider(Landroid/location/Criteria;Z)Ljava/lang/String;

    move-result-object v3

    .line 649
    invoke-virtual {v1}, Landroid/location/LocationManager;->getAllProviders()Ljava/util/List;

    move-result-object v4

    .line 651
    const/4 v5, 0x0

    .line 653
    if-nez v4, :cond_0

    .line 654
    const/4 v0, 0x0

    return-object v0

    .line 657
    :cond_0
    invoke-interface {v4, v3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 658
    invoke-virtual {v1, v3}, Landroid/location/LocationManager;->getLastKnownLocation(Ljava/lang/String;)Landroid/location/Location;

    move-result-object v5

    .line 661
    :cond_1
    if-nez v5, :cond_2

    const-string v0, "network"

    invoke-interface {v4, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 662
    const-string v0, "network"

    invoke-virtual {v1, v0}, Landroid/location/LocationManager;->getLastKnownLocation(Ljava/lang/String;)Landroid/location/Location;

    move-result-object v5

    .line 665
    :cond_2
    return-object v5
.end method

.method public static d(Lcom/amap/api/maps/AMap;Lo/cgk;)Lcom/amap/api/maps/model/Marker;
    .locals 4

    .line 183
    if-nez p0, :cond_0

    .line 185
    const-string v0, "Track_DrawMapUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "addMarker amap is null."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 186
    const/4 v0, 0x0

    return-object v0

    .line 189
    :cond_0
    if-nez p1, :cond_1

    .line 191
    const-string v0, "Track_DrawMapUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "addMarker latlng is null."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 192
    const/4 v0, 0x0

    return-object v0

    .line 195
    :cond_1
    new-instance v0, Lcom/amap/api/maps/model/MarkerOptions;

    invoke-direct {v0}, Lcom/amap/api/maps/model/MarkerOptions;-><init>()V

    invoke-static {p1}, Lo/cdr;->b(Lo/cgk;)Lcom/amap/api/maps/model/LatLng;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/amap/api/maps/model/MarkerOptions;->position(Lcom/amap/api/maps/model/LatLng;)Lcom/amap/api/maps/model/MarkerOptions;

    move-result-object v0

    .line 196
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/amap/api/maps/model/MarkerOptions;->draggable(Z)Lcom/amap/api/maps/model/MarkerOptions;

    move-result-object v0

    .line 197
    const/high16 v1, 0x3f000000    # 0.5f

    const/high16 v2, 0x3f000000    # 0.5f

    invoke-virtual {v0, v1, v2}, Lcom/amap/api/maps/model/MarkerOptions;->anchor(FF)Lcom/amap/api/maps/model/MarkerOptions;

    move-result-object v0

    .line 198
    const/high16 v1, 0x41200000    # 10.0f

    invoke-virtual {v0, v1}, Lcom/amap/api/maps/model/MarkerOptions;->zIndex(F)Lcom/amap/api/maps/model/MarkerOptions;

    move-result-object v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$drawable;->hw_show_map_tracking_end_img:I

    .line 199
    invoke-static {v1}, Lcom/amap/api/maps/model/BitmapDescriptorFactory;->fromResource(I)Lcom/amap/api/maps/model/BitmapDescriptor;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/amap/api/maps/model/MarkerOptions;->icon(Lcom/amap/api/maps/model/BitmapDescriptor;)Lcom/amap/api/maps/model/MarkerOptions;

    move-result-object v0

    .line 195
    invoke-virtual {p0, v0}, Lcom/amap/api/maps/AMap;->addMarker(Lcom/amap/api/maps/model/MarkerOptions;)Lcom/amap/api/maps/model/Marker;

    move-result-object v0

    return-object v0
.end method

.method public static d(Lcom/google/android/gms/maps/GoogleMap;Lo/cgk;)Lcom/google/android/gms/maps/model/Marker;
    .locals 5

    .line 237
    if-nez p0, :cond_0

    .line 238
    const-string v0, "Track_DrawMapUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "addMarker addGoogleEndMarkerBg is null."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 239
    const/4 v0, 0x0

    return-object v0

    .line 242
    :cond_0
    if-nez p1, :cond_1

    .line 243
    const-string v0, "Track_DrawMapUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "addMarker addGoogleEndMarkerBg is null."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 244
    const/4 v0, 0x0

    return-object v0

    .line 247
    :cond_1
    new-instance v0, Lcom/google/android/gms/maps/model/MarkerOptions;

    invoke-direct {v0}, Lcom/google/android/gms/maps/model/MarkerOptions;-><init>()V

    .line 248
    invoke-static {p1}, Lo/cdr;->c(Lo/cgk;)Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/model/MarkerOptions;->position(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object v0

    .line 249
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/model/MarkerOptions;->draggable(Z)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object v0

    .line 250
    const/high16 v1, 0x3f000000    # 0.5f

    const/high16 v2, 0x3f000000    # 0.5f

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/maps/model/MarkerOptions;->anchor(FF)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$drawable;->hw_show_map_tracking_end_bg:I

    .line 252
    invoke-static {v1}, Lcom/google/android/gms/maps/model/BitmapDescriptorFactory;->fromResource(I)Lcom/google/android/gms/maps/model/BitmapDescriptor;

    move-result-object v1

    .line 251
    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/model/MarkerOptions;->icon(Lcom/google/android/gms/maps/model/BitmapDescriptor;)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object v4

    .line 253
    invoke-virtual {p0, v4}, Lcom/google/android/gms/maps/GoogleMap;->addMarker(Lcom/google/android/gms/maps/model/MarkerOptions;)Lcom/google/android/gms/maps/model/Marker;

    move-result-object v0

    return-object v0
.end method

.method public static d(Lcom/google/android/gms/maps/GoogleMap;Lo/cgk;I)Lcom/google/android/gms/maps/model/Marker;
    .locals 5

    .line 141
    if-nez p0, :cond_0

    .line 142
    const-string v0, "Track_DrawMapUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "addGoogleStartMarker amap is null."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 143
    const/4 v0, 0x0

    return-object v0

    .line 146
    :cond_0
    if-nez p1, :cond_1

    .line 147
    const-string v0, "Track_DrawMapUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "addGoogleStartMarker latlng is null."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 148
    const/4 v0, 0x0

    return-object v0

    .line 151
    :cond_1
    new-instance v0, Lcom/google/android/gms/maps/model/MarkerOptions;

    invoke-direct {v0}, Lcom/google/android/gms/maps/model/MarkerOptions;-><init>()V

    .line 152
    invoke-static {p1}, Lo/cdr;->c(Lo/cgk;)Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/model/MarkerOptions;->position(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/model/MarkerOptions;->draggable(Z)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object v0

    const/high16 v1, 0x3f000000    # 0.5f

    const/high16 v2, 0x3f000000    # 0.5f

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/maps/model/MarkerOptions;->anchor(FF)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object v4

    .line 154
    sparse-switch p2, :sswitch_data_0

    goto :goto_0

    .line 158
    :sswitch_0
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$drawable;->hw_show_map_tracking_start_run_img:I

    invoke-static {v0}, Lcom/google/android/gms/maps/model/BitmapDescriptorFactory;->fromResource(I)Lcom/google/android/gms/maps/model/BitmapDescriptor;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/google/android/gms/maps/model/MarkerOptions;->icon(Lcom/google/android/gms/maps/model/BitmapDescriptor;)Lcom/google/android/gms/maps/model/MarkerOptions;

    .line 159
    goto :goto_1

    .line 161
    :sswitch_1
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$drawable;->hw_show_map_tracking_start_cross_race_img:I

    invoke-static {v0}, Lcom/google/android/gms/maps/model/BitmapDescriptorFactory;->fromResource(I)Lcom/google/android/gms/maps/model/BitmapDescriptor;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/google/android/gms/maps/model/MarkerOptions;->icon(Lcom/google/android/gms/maps/model/BitmapDescriptor;)Lcom/google/android/gms/maps/model/MarkerOptions;

    .line 162
    goto :goto_1

    .line 164
    :sswitch_2
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$drawable;->hw_show_map_tracking_start_climb_hill_img:I

    invoke-static {v0}, Lcom/google/android/gms/maps/model/BitmapDescriptorFactory;->fromResource(I)Lcom/google/android/gms/maps/model/BitmapDescriptor;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/google/android/gms/maps/model/MarkerOptions;->icon(Lcom/google/android/gms/maps/model/BitmapDescriptor;)Lcom/google/android/gms/maps/model/MarkerOptions;

    .line 165
    goto :goto_1

    .line 167
    :sswitch_3
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$drawable;->hw_show_map_tracking_start_bike_img:I

    invoke-static {v0}, Lcom/google/android/gms/maps/model/BitmapDescriptorFactory;->fromResource(I)Lcom/google/android/gms/maps/model/BitmapDescriptor;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/google/android/gms/maps/model/MarkerOptions;->icon(Lcom/google/android/gms/maps/model/BitmapDescriptor;)Lcom/google/android/gms/maps/model/MarkerOptions;

    .line 168
    goto :goto_1

    .line 170
    :sswitch_4
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$drawable;->hw_show_map_tracking_start_walk_img:I

    invoke-static {v0}, Lcom/google/android/gms/maps/model/BitmapDescriptorFactory;->fromResource(I)Lcom/google/android/gms/maps/model/BitmapDescriptor;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/google/android/gms/maps/model/MarkerOptions;->icon(Lcom/google/android/gms/maps/model/BitmapDescriptor;)Lcom/google/android/gms/maps/model/MarkerOptions;

    .line 171
    goto :goto_1

    .line 173
    :goto_0
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$drawable;->hw_show_map_tracking_start_walk_img:I

    invoke-static {v0}, Lcom/google/android/gms/maps/model/BitmapDescriptorFactory;->fromResource(I)Lcom/google/android/gms/maps/model/BitmapDescriptor;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/google/android/gms/maps/model/MarkerOptions;->icon(Lcom/google/android/gms/maps/model/BitmapDescriptor;)Lcom/google/android/gms/maps/model/MarkerOptions;

    .line 178
    :goto_1
    invoke-virtual {p0, v4}, Lcom/google/android/gms/maps/GoogleMap;->addMarker(Lcom/google/android/gms/maps/model/MarkerOptions;)Lcom/google/android/gms/maps/model/Marker;

    move-result-object v0

    return-object v0

    :sswitch_data_0
    .sparse-switch
        0x101 -> :sswitch_4
        0x102 -> :sswitch_0
        0x103 -> :sswitch_3
        0x104 -> :sswitch_2
        0x118 -> :sswitch_1
    .end sparse-switch
.end method

.method public static d([F[Ljava/lang/Integer;)Ljava/util/List;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([F[Ljava/lang/Integer;)Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation

    .line 399
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 401
    const/4 v3, 0x0

    :goto_0
    array-length v0, p0

    if-ge v3, v0, :cond_5

    .line 404
    const/4 v4, 0x0

    .line 405
    const/4 v5, 0x0

    .line 406
    const/4 v6, 0x0

    .line 407
    const/high16 v7, 0x3f800000    # 1.0f

    .line 408
    const/4 v8, 0x0

    .line 411
    if-lez v3, :cond_0

    array-length v0, p0

    if-ge v3, v0, :cond_0

    .line 417
    aget v0, p0, v3

    add-int/lit8 v1, v3, -0x1

    aget v1, p0, v1

    sub-float v4, v0, v1

    .line 418
    add-int/lit8 v0, v3, -0x1

    aget-object v0, p1, v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {v0}, Lo/cdr;->b(I)I

    move-result v5

    .line 419
    aget-object v0, p1, v3

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {v0}, Lo/cdr;->b(I)I

    move-result v6

    .line 422
    :cond_0
    if-nez v3, :cond_1

    const/4 v9, 0x0

    goto :goto_1

    :cond_1
    add-int/lit8 v0, v3, -0x1

    aget v0, p0, v0

    const/high16 v1, 0x3f800000    # 1.0f

    add-float v9, v0, v1

    :goto_1
    aget v0, p0, v3

    cmpg-float v0, v9, v0

    if-gez v0, :cond_4

    .line 424
    sub-int v0, v5, v6

    if-eqz v0, :cond_2

    const/4 v0, 0x0

    cmpl-float v0, v4, v0

    if-nez v0, :cond_3

    .line 428
    :cond_2
    aget-object v0, p1, v3

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 431
    :cond_3
    sub-int v0, v6, v5

    int-to-float v0, v0

    div-float v7, v0, v4

    .line 433
    sget-object v0, Lo/cdr;->c:[I

    int-to-float v1, v8

    mul-float/2addr v1, v7

    float-to-int v1, v1

    add-int/2addr v1, v5

    aget v0, v0, v1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 434
    add-int/lit8 v8, v8, 0x1

    .line 422
    :goto_2
    const/high16 v0, 0x3f800000    # 1.0f

    add-float/2addr v9, v0

    goto :goto_1

    .line 401
    :cond_4
    add-int/lit8 v3, v3, 0x1

    goto/16 :goto_0

    .line 441
    :cond_5
    return-object v2
.end method

.method public static d(Lo/cgk;)Z
    .locals 1

    .line 366
    sget-object v0, Lo/cdr;->a:Lo/cgk;

    invoke-static {v0, p0}, Lo/cdr;->b(Lo/cgk;Lo/cgk;)Z

    move-result v0

    return v0
.end method

.method public static d(Landroid/content/Context;[D)[D
    .locals 8

    .line 577
    if-eqz p0, :cond_0

    if-eqz p1, :cond_0

    array-length v0, p1

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    .line 578
    :cond_0
    const-string v0, "Track_DrawMapUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "context or location is null, please check"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 579
    const/4 v0, 0x2

    new-array v0, v0, [D

    fill-array-data v0, :array_0

    return-object v0

    .line 581
    :cond_1
    const/4 v5, 0x0

    .line 582
    new-instance v6, Lcom/amap/api/maps/CoordinateConverter;

    invoke-direct {v6, p0}, Lcom/amap/api/maps/CoordinateConverter;-><init>(Landroid/content/Context;)V

    .line 583
    sget-object v0, Lcom/amap/api/maps/CoordinateConverter$CoordType;->GPS:Lcom/amap/api/maps/CoordinateConverter$CoordType;

    invoke-virtual {v6, v0}, Lcom/amap/api/maps/CoordinateConverter;->from(Lcom/amap/api/maps/CoordinateConverter$CoordType;)Lcom/amap/api/maps/CoordinateConverter;

    .line 584
    new-instance v0, Lo/cgk;

    const/4 v1, 0x0

    aget-wide v1, p1, v1

    const/4 v3, 0x1

    aget-wide v3, p1, v3

    invoke-direct {v0, v1, v2, v3, v4}, Lo/cgk;-><init>(DD)V

    invoke-static {v0}, Lo/cdr;->b(Lo/cgk;)Lcom/amap/api/maps/model/LatLng;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/amap/api/maps/CoordinateConverter;->coord(Lcom/amap/api/maps/model/LatLng;)Lcom/amap/api/maps/CoordinateConverter;

    .line 585
    invoke-virtual {v6}, Lcom/amap/api/maps/CoordinateConverter;->convert()Lcom/amap/api/maps/model/LatLng;

    move-result-object v5

    .line 588
    const/4 v0, 0x2

    new-array v7, v0, [D

    .line 589
    if-eqz v5, :cond_2

    .line 590
    iget-wide v0, v5, Lcom/amap/api/maps/model/LatLng;->latitude:D

    const/4 v2, 0x0

    aput-wide v0, v7, v2

    .line 591
    iget-wide v0, v5, Lcom/amap/api/maps/model/LatLng;->longitude:D

    const/4 v2, 0x1

    aput-wide v0, v7, v2

    goto :goto_0

    .line 593
    :cond_2
    const/4 v0, 0x0

    aget-wide v0, p1, v0

    const/4 v2, 0x0

    aput-wide v0, v7, v2

    .line 594
    const/4 v0, 0x1

    aget-wide v0, p1, v0

    const/4 v2, 0x1

    aput-wide v0, v7, v2

    .line 596
    :goto_0
    return-object v7

    :array_0
    .array-data 8
        0x0
        0x0
    .end array-data
.end method

.method public static e(Lo/cgk;Lo/cgk;)F
    .locals 3

    .line 692
    const/4 v2, 0x0

    .line 693
    if-nez p0, :cond_0

    .line 695
    return v2

    .line 698
    :cond_0
    invoke-static {p0}, Lo/cdr;->b(Lo/cgk;)Lcom/amap/api/maps/model/LatLng;

    move-result-object v0

    invoke-static {p1}, Lo/cdr;->b(Lo/cgk;)Lcom/amap/api/maps/model/LatLng;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/amap/api/maps/AMapUtils;->calculateLineDistance(Lcom/amap/api/maps/model/LatLng;Lcom/amap/api/maps/model/LatLng;)F

    move-result v2

    .line 699
    return v2
.end method

.method public static e(FFF)I
    .locals 6

    .line 510
    const/16 v3, 0xff

    .line 512
    cmpl-float v0, p2, p0

    if-ltz v0, :cond_0

    .line 513
    sget v0, Lo/cdw;->a:I

    return v0

    .line 516
    :cond_0
    cmpg-float v0, p2, p1

    if-gtz v0, :cond_1

    .line 517
    sget v0, Lo/cdw;->d:I

    return v0

    .line 520
    :cond_1
    sub-float v4, p0, p1

    .line 521
    const/high16 v0, 0x40000000    # 2.0f

    div-float v0, v4, v0

    add-float/2addr v0, p1

    cmpg-float v0, p2, v0

    if-gez v0, :cond_2

    .line 524
    sub-float v0, p2, p1

    const/high16 v1, 0x437f0000    # 255.0f

    mul-float/2addr v0, v1

    const/high16 v1, 0x40000000    # 2.0f

    mul-float/2addr v0, v1

    div-float/2addr v0, v4

    float-to-int v5, v0

    .line 526
    const/4 v0, 0x0

    invoke-static {v5, v3, v0}, Landroid/graphics/Color;->rgb(III)I

    move-result v2

    .line 527
    goto :goto_0

    .line 531
    :cond_2
    sub-float v0, p2, p1

    const/high16 v1, 0x40000000    # 2.0f

    div-float v1, v4, v1

    sub-float/2addr v0, v1

    const/high16 v1, 0x437f0000    # 255.0f

    mul-float/2addr v0, v1

    const/high16 v1, 0x40000000    # 2.0f

    div-float v1, v4, v1

    div-float/2addr v0, v1

    const/high16 v1, 0x437f0000    # 255.0f

    sub-float v0, v1, v0

    float-to-int v5, v0

    .line 534
    const/4 v0, 0x0

    invoke-static {v3, v5, v0}, Landroid/graphics/Color;->rgb(III)I

    move-result v2

    .line 536
    :goto_0
    return v2
.end method

.method private static e(Landroid/content/res/Resources;)Landroid/graphics/Bitmap;
    .locals 7

    .line 339
    const/4 v4, 0x0

    .line 341
    if-eqz p0, :cond_1

    .line 342
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$drawable;->hw_show_map_tracking_km_img:I

    invoke-virtual {p0, v0}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v5

    .line 343
    sget v0, Lo/cdr;->d:I

    sget v1, Lo/cdr;->e:I

    sget-object v2, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v0, v1, v2}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v4

    .line 344
    if-eqz v5, :cond_0

    .line 345
    sget v0, Lo/cdr;->d:I

    sget v1, Lo/cdr;->e:I

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v5, v2, v3, v0, v1}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 346
    new-instance v6, Landroid/graphics/Canvas;

    invoke-direct {v6, v4}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 347
    invoke-virtual {v5, v6}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 348
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v6, v4, v1, v2, v0}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 350
    :cond_0
    goto :goto_0

    .line 351
    :cond_1
    sget v0, Lo/cdr;->d:I

    sget v1, Lo/cdr;->e:I

    sget-object v2, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v0, v1, v2}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v4

    .line 354
    :goto_0
    return-object v4
.end method

.method private static e(Landroid/content/res/Resources;I)Landroid/text/TextPaint;
    .locals 2

    .line 318
    new-instance v1, Landroid/text/TextPaint;

    invoke-direct {v1}, Landroid/text/TextPaint;-><init>()V

    .line 320
    sget-object v0, Landroid/graphics/Paint$Align;->CENTER:Landroid/graphics/Paint$Align;

    invoke-virtual {v1, v0}, Landroid/text/TextPaint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    .line 321
    if-eqz p0, :cond_2

    .line 322
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$color;->common_color_white:I

    invoke-virtual {p0, v0}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {v1, v0}, Landroid/text/TextPaint;->setColor(I)V

    .line 323
    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    .line 324
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$dimen;->hw_show_font_size_10:I

    invoke-virtual {p0, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {v1, v0}, Landroid/text/TextPaint;->setTextSize(F)V

    goto :goto_0

    .line 325
    :cond_0
    const/4 v0, 0x2

    if-ne p1, v0, :cond_1

    .line 326
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$dimen;->hw_show_font_size_10:I

    invoke-virtual {p0, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {v1, v0}, Landroid/text/TextPaint;->setTextSize(F)V

    goto :goto_0

    .line 328
    :cond_1
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$dimen;->hw_show_font_size_8:I

    invoke-virtual {p0, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {v1, v0}, Landroid/text/TextPaint;->setTextSize(F)V

    .line 332
    :cond_2
    :goto_0
    return-object v1
.end method

.method public static e(Lcom/amap/api/maps/AMap;Lo/cgk;)Lcom/amap/api/maps/model/Marker;
    .locals 4

    .line 221
    if-nez p1, :cond_0

    .line 223
    const-string v0, "Track_DrawMapUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "addMarker latlng is null."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 224
    const/4 v0, 0x0

    return-object v0

    .line 226
    :cond_0
    if-nez p0, :cond_1

    .line 228
    const-string v0, "Track_DrawMapUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "addMarker amap is null."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 229
    const/4 v0, 0x0

    return-object v0

    .line 231
    :cond_1
    new-instance v0, Lcom/amap/api/maps/model/MarkerOptions;

    invoke-direct {v0}, Lcom/amap/api/maps/model/MarkerOptions;-><init>()V

    invoke-static {p1}, Lo/cdr;->b(Lo/cgk;)Lcom/amap/api/maps/model/LatLng;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/amap/api/maps/model/MarkerOptions;->position(Lcom/amap/api/maps/model/LatLng;)Lcom/amap/api/maps/model/MarkerOptions;

    move-result-object v0

    .line 232
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/amap/api/maps/model/MarkerOptions;->draggable(Z)Lcom/amap/api/maps/model/MarkerOptions;

    move-result-object v0

    const/high16 v1, 0x3f000000    # 0.5f

    const/high16 v2, 0x3f000000    # 0.5f

    invoke-virtual {v0, v1, v2}, Lcom/amap/api/maps/model/MarkerOptions;->anchor(FF)Lcom/amap/api/maps/model/MarkerOptions;

    move-result-object v0

    const/high16 v1, 0x41200000    # 10.0f

    invoke-virtual {v0, v1}, Lcom/amap/api/maps/model/MarkerOptions;->zIndex(F)Lcom/amap/api/maps/model/MarkerOptions;

    move-result-object v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$drawable;->hw_show_map_tracking_end_bg:I

    .line 233
    invoke-static {v1}, Lcom/amap/api/maps/model/BitmapDescriptorFactory;->fromResource(I)Lcom/amap/api/maps/model/BitmapDescriptor;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/amap/api/maps/model/MarkerOptions;->icon(Lcom/amap/api/maps/model/BitmapDescriptor;)Lcom/amap/api/maps/model/MarkerOptions;

    move-result-object v0

    .line 231
    invoke-virtual {p0, v0}, Lcom/amap/api/maps/AMap;->addMarker(Lcom/amap/api/maps/model/MarkerOptions;)Lcom/amap/api/maps/model/Marker;

    move-result-object v0

    return-object v0
.end method

.method public static e(Lcom/amap/api/maps/AMap;Lo/cgk;I)Lcom/amap/api/maps/model/Marker;
    .locals 5

    .line 93
    if-nez p0, :cond_0

    .line 95
    const-string v0, "Track_DrawMapUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "addMarker amap is null."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 96
    const/4 v0, 0x0

    return-object v0

    .line 99
    :cond_0
    if-nez p1, :cond_1

    .line 101
    const-string v0, "Track_DrawMapUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "addMarker latlng is null."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 102
    const/4 v0, 0x0

    return-object v0

    .line 106
    :cond_1
    new-instance v0, Lcom/amap/api/maps/model/MarkerOptions;

    invoke-direct {v0}, Lcom/amap/api/maps/model/MarkerOptions;-><init>()V

    .line 107
    invoke-static {p1}, Lo/cdr;->b(Lo/cgk;)Lcom/amap/api/maps/model/LatLng;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/amap/api/maps/model/MarkerOptions;->position(Lcom/amap/api/maps/model/LatLng;)Lcom/amap/api/maps/model/MarkerOptions;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/amap/api/maps/model/MarkerOptions;->draggable(Z)Lcom/amap/api/maps/model/MarkerOptions;

    move-result-object v0

    const/high16 v1, 0x3f000000    # 0.5f

    const v2, 0x3f666666    # 0.9f

    invoke-virtual {v0, v1, v2}, Lcom/amap/api/maps/model/MarkerOptions;->anchor(FF)Lcom/amap/api/maps/model/MarkerOptions;

    move-result-object v0

    const/high16 v1, 0x41200000    # 10.0f

    invoke-virtual {v0, v1}, Lcom/amap/api/maps/model/MarkerOptions;->zIndex(F)Lcom/amap/api/maps/model/MarkerOptions;

    move-result-object v4

    .line 109
    sparse-switch p2, :sswitch_data_0

    goto/16 :goto_0

    .line 113
    :sswitch_0
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$drawable;->hw_show_map_tracking_start_run_img:I

    invoke-static {v0}, Lcom/amap/api/maps/model/BitmapDescriptorFactory;->fromResource(I)Lcom/amap/api/maps/model/BitmapDescriptor;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/amap/api/maps/model/MarkerOptions;->icon(Lcom/amap/api/maps/model/BitmapDescriptor;)Lcom/amap/api/maps/model/MarkerOptions;

    .line 114
    goto :goto_1

    .line 116
    :sswitch_1
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$drawable;->hw_show_map_tracking_start_cross_race_img:I

    invoke-static {v0}, Lcom/amap/api/maps/model/BitmapDescriptorFactory;->fromResource(I)Lcom/amap/api/maps/model/BitmapDescriptor;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/amap/api/maps/model/MarkerOptions;->icon(Lcom/amap/api/maps/model/BitmapDescriptor;)Lcom/amap/api/maps/model/MarkerOptions;

    .line 117
    goto :goto_1

    .line 119
    :sswitch_2
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$drawable;->hw_show_map_tracking_start_climb_hill_img:I

    invoke-static {v0}, Lcom/amap/api/maps/model/BitmapDescriptorFactory;->fromResource(I)Lcom/amap/api/maps/model/BitmapDescriptor;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/amap/api/maps/model/MarkerOptions;->icon(Lcom/amap/api/maps/model/BitmapDescriptor;)Lcom/amap/api/maps/model/MarkerOptions;

    .line 120
    goto :goto_1

    .line 122
    :sswitch_3
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$drawable;->hw_show_map_tracking_start_bike_img:I

    invoke-static {v0}, Lcom/amap/api/maps/model/BitmapDescriptorFactory;->fromResource(I)Lcom/amap/api/maps/model/BitmapDescriptor;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/amap/api/maps/model/MarkerOptions;->icon(Lcom/amap/api/maps/model/BitmapDescriptor;)Lcom/amap/api/maps/model/MarkerOptions;

    .line 123
    goto :goto_1

    .line 125
    :sswitch_4
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$drawable;->hw_show_map_tracking_start_walk_img:I

    invoke-static {v0}, Lcom/amap/api/maps/model/BitmapDescriptorFactory;->fromResource(I)Lcom/amap/api/maps/model/BitmapDescriptor;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/amap/api/maps/model/MarkerOptions;->icon(Lcom/amap/api/maps/model/BitmapDescriptor;)Lcom/amap/api/maps/model/MarkerOptions;

    .line 126
    goto :goto_1

    .line 129
    :sswitch_5
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$drawable;->hw_show_map_tracking_start_swim_img:I

    invoke-static {v0}, Lcom/amap/api/maps/model/BitmapDescriptorFactory;->fromResource(I)Lcom/amap/api/maps/model/BitmapDescriptor;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/amap/api/maps/model/MarkerOptions;->icon(Lcom/amap/api/maps/model/BitmapDescriptor;)Lcom/amap/api/maps/model/MarkerOptions;

    .line 130
    goto :goto_1

    .line 132
    :goto_0
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$drawable;->hw_show_map_tracking_start_run_img:I

    invoke-static {v0}, Lcom/amap/api/maps/model/BitmapDescriptorFactory;->fromResource(I)Lcom/amap/api/maps/model/BitmapDescriptor;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/amap/api/maps/model/MarkerOptions;->icon(Lcom/amap/api/maps/model/BitmapDescriptor;)Lcom/amap/api/maps/model/MarkerOptions;

    .line 137
    :goto_1
    invoke-virtual {p0, v4}, Lcom/amap/api/maps/AMap;->addMarker(Lcom/amap/api/maps/model/MarkerOptions;)Lcom/amap/api/maps/model/Marker;

    move-result-object v0

    return-object v0

    :sswitch_data_0
    .sparse-switch
        0x101 -> :sswitch_4
        0x102 -> :sswitch_0
        0x103 -> :sswitch_3
        0x104 -> :sswitch_2
        0x10a -> :sswitch_5
        0x118 -> :sswitch_1
    .end sparse-switch
.end method

.method public static e(Lcom/google/android/gms/maps/model/LatLng;)Lo/cgk;
    .locals 5

    .line 630
    iget-wide v1, p0, Lcom/google/android/gms/maps/model/LatLng;->latitude:D

    .line 631
    iget-wide v3, p0, Lcom/google/android/gms/maps/model/LatLng;->longitude:D

    .line 632
    new-instance v0, Lo/cgk;

    invoke-direct {v0, v1, v2, v3, v4}, Lo/cgk;-><init>(DD)V

    return-object v0
.end method
