.class public Lo/cgy;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/chc;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/cgy$d;,
        Lo/cgy$e;
    }
.end annotation


# static fields
.field private static n:Ljava/lang/Boolean;


# instance fields
.field private A:Lcom/amap/api/maps/CameraUpdate;

.field private B:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Landroid/graphics/PointF;>;"
        }
    .end annotation
.end field

.field private C:Lcom/amap/api/maps/AMap$CancelableCallback;

.field private D:Lcom/amap/api/maps/CameraUpdate;

.field private E:Z

.field private F:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/cgu;>;"
        }
    .end annotation
.end field

.field private G:Lcom/amap/api/maps/model/LatLng;

.field private H:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/amap/api/maps/model/PolylineOptions;>;"
        }
    .end annotation
.end field

.field private I:Lcom/amap/api/maps/model/LatLng;

.field private J:Lo/chc$d;

.field private K:Z

.field private L:Z

.field private M:Z

.field private N:Lo/cgv;

.field private O:Landroid/os/Handler;

.field private P:Z

.field private S:Lcom/amap/api/maps/AMap$OnMapScreenShotListener;

.field private a:Lo/cbu;

.field private b:I

.field private c:Landroid/content/Context;

.field private d:Lcom/amap/api/maps/AMap;

.field private e:I

.field private f:Lcom/amap/api/maps/model/Marker;

.field private g:Lcom/amap/api/maps/model/PolylineOptions;

.field private h:Lcom/amap/api/maps/MapView;

.field private i:Lcom/amap/api/maps/model/Marker;

.field private j:J

.field private k:Lcom/amap/api/maps/model/Marker;

.field private l:Lcom/amap/api/maps/model/Polyline;

.field private m:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/amap/api/maps/model/LatLng;>;"
        }
    .end annotation
.end field

.field private o:Z

.field private p:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/amap/api/maps/model/LatLng;>;"
        }
    .end annotation
.end field

.field private q:Lcom/amap/api/maps/model/Polygon;

.field private r:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lcom/amap/api/maps/model/Marker;>;"
        }
    .end annotation
.end field

.field private s:Lcom/amap/api/maps/model/LatLng;

.field private t:J

.field private u:Z

.field private v:I

.field private w:I

.field private x:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lo/cgy$d;>;"
        }
    .end annotation
.end field

.field private y:Z

.field private z:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 76
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    sput-object v0, Lo/cgy;->n:Ljava/lang/Boolean;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/amap/api/maps/MapView;Z)V
    .locals 4

    .line 134
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 64
    const/16 v0, 0x6b

    const/16 v1, 0xed

    const/16 v2, 0xfe

    invoke-static {v0, v1, v2}, Landroid/graphics/Color;->rgb(III)I

    move-result v0

    iput v0, p0, Lo/cgy;->e:I

    .line 65
    const/16 v0, 0x42

    const/16 v1, 0x96

    const/16 v2, 0xf8

    invoke-static {v0, v1, v2}, Landroid/graphics/Color;->rgb(III)I

    move-result v0

    iput v0, p0, Lo/cgy;->b:I

    .line 70
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cgy;->i:Lcom/amap/api/maps/model/Marker;

    .line 77
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/cgy;->o:Z

    .line 78
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/cgy;->t:J

    .line 81
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/cgy;->u:Z

    .line 83
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cgy;->q:Lcom/amap/api/maps/model/Polygon;

    .line 84
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cgy;->s:Lcom/amap/api/maps/model/LatLng;

    .line 87
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/cgy;->r:Ljava/util/ArrayList;

    .line 88
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/cgy;->x:Ljava/util/ArrayList;

    .line 89
    const/4 v0, 0x0

    iput v0, p0, Lo/cgy;->v:I

    .line 90
    const/4 v0, 0x0

    iput v0, p0, Lo/cgy;->w:I

    .line 104
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/cgy;->y:Z

    .line 105
    const/4 v0, 0x0

    iput v0, p0, Lo/cgy;->z:I

    .line 107
    new-instance v0, Lo/cgy$3;

    invoke-direct {v0, p0}, Lo/cgy$3;-><init>(Lo/cgy;)V

    iput-object v0, p0, Lo/cgy;->C:Lcom/amap/api/maps/AMap$CancelableCallback;

    .line 123
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cgy;->A:Lcom/amap/api/maps/CameraUpdate;

    .line 872
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/cgy;->L:Z

    .line 1493
    new-instance v0, Lo/cgy$6;

    invoke-direct {v0, p0}, Lo/cgy$6;-><init>(Lo/cgy;)V

    iput-object v0, p0, Lo/cgy;->O:Landroid/os/Handler;

    .line 1570
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/cgy;->P:Z

    .line 135
    if-nez p1, :cond_0

    .line 136
    const-string v0, "Track_GaoDeMap"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "GaoDeMap context is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 137
    return-void

    .line 139
    :cond_0
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lo/cgy;->c:Landroid/content/Context;

    .line 140
    invoke-virtual {p2}, Lcom/amap/api/maps/MapView;->getMap()Lcom/amap/api/maps/AMap;

    move-result-object v0

    iput-object v0, p0, Lo/cgy;->d:Lcom/amap/api/maps/AMap;

    .line 141
    iget-object v0, p0, Lo/cgy;->d:Lcom/amap/api/maps/AMap;

    if-nez v0, :cond_1

    .line 142
    const-string v0, "Track_GaoDeMap"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mAmap is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 143
    return-void

    .line 145
    :cond_1
    if-eqz p3, :cond_2

    .line 148
    iget-object v0, p0, Lo/cgy;->d:Lcom/amap/api/maps/AMap;

    invoke-virtual {v0}, Lcom/amap/api/maps/AMap;->reloadMap()V

    .line 150
    :cond_2
    iput-object p2, p0, Lo/cgy;->h:Lcom/amap/api/maps/MapView;

    .line 151
    const-string v0, "Track_GaoDeMap"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "GaoDeMap instance hashcode: "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 152
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cbu;->c(Landroid/content/Context;)Lo/cbu;

    move-result-object v0

    iput-object v0, p0, Lo/cgy;->a:Lo/cbu;

    .line 153
    new-instance v0, Lcom/amap/api/maps/model/PolylineOptions;

    invoke-direct {v0}, Lcom/amap/api/maps/model/PolylineOptions;-><init>()V

    iput-object v0, p0, Lo/cgy;->g:Lcom/amap/api/maps/model/PolylineOptions;

    .line 154
    iget-object v0, p0, Lo/cgy;->g:Lcom/amap/api/maps/model/PolylineOptions;

    iget v1, p0, Lo/cgy;->b:I

    invoke-virtual {v0, v1}, Lcom/amap/api/maps/model/PolylineOptions;->color(I)Lcom/amap/api/maps/model/PolylineOptions;

    move-result-object v0

    .line 155
    const/high16 v1, 0x41700000    # 15.0f

    invoke-virtual {v0, v1}, Lcom/amap/api/maps/model/PolylineOptions;->width(F)Lcom/amap/api/maps/model/PolylineOptions;

    move-result-object v0

    .line 156
    const/high16 v1, 0x41200000    # 10.0f

    invoke-virtual {v0, v1}, Lcom/amap/api/maps/model/PolylineOptions;->zIndex(F)Lcom/amap/api/maps/model/PolylineOptions;

    move-result-object v0

    .line 157
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/amap/api/maps/model/PolylineOptions;->visible(Z)Lcom/amap/api/maps/model/PolylineOptions;

    .line 158
    iget-object v0, p0, Lo/cgy;->g:Lcom/amap/api/maps/model/PolylineOptions;

    invoke-direct {p0, v0}, Lo/cgy;->b(Lcom/amap/api/maps/model/PolylineOptions;)Lcom/amap/api/maps/model/Polyline;

    move-result-object v0

    iput-object v0, p0, Lo/cgy;->l:Lcom/amap/api/maps/model/Polyline;

    .line 160
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/cgy;->m:Ljava/util/List;

    .line 161
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/cgy;->p:Ljava/util/List;

    .line 162
    return-void
.end method

.method private a(Lcom/amap/api/maps/model/LatLng;)Landroid/graphics/PointF;
    .locals 4

    .line 1202
    new-instance v0, Landroid/graphics/PointF;

    iget-wide v1, p1, Lcom/amap/api/maps/model/LatLng;->longitude:D

    double-to-float v1, v1

    iget-wide v2, p1, Lcom/amap/api/maps/model/LatLng;->latitude:D

    double-to-float v2, v2

    invoke-direct {v0, v1, v2}, Landroid/graphics/PointF;-><init>(FF)V

    return-object v0
.end method

.method private a(ILjava/util/Map;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ILjava/util/Map<Ljava/lang/Integer;Ljava/lang/Float;>;)Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation

    .line 428
    invoke-direct {p0, p1, p2}, Lo/cgy;->d(ILjava/util/Map;)Ljava/util/List;

    move-result-object v0

    .line 430
    return-object v0
.end method

.method static synthetic a(Lo/cgy;)Lo/chc$d;
    .locals 1

    .line 56
    iget-object v0, p0, Lo/cgy;->J:Lo/chc$d;

    return-object v0
.end method

.method static synthetic b(Lo/cgy;Lcom/amap/api/maps/AMap$OnMapScreenShotListener;)Lcom/amap/api/maps/AMap$OnMapScreenShotListener;
    .locals 0

    .line 56
    iput-object p1, p0, Lo/cgy;->S:Lcom/amap/api/maps/AMap$OnMapScreenShotListener;

    return-object p1
.end method

.method static synthetic b(Lo/cgy;)Lcom/amap/api/maps/AMap;
    .locals 1

    .line 56
    iget-object v0, p0, Lo/cgy;->d:Lcom/amap/api/maps/AMap;

    return-object v0
.end method

.method private b(Lcom/amap/api/maps/model/PolylineOptions;)Lcom/amap/api/maps/model/Polyline;
    .locals 4

    .line 568
    iget-object v0, p0, Lo/cgy;->d:Lcom/amap/api/maps/AMap;

    if-nez v0, :cond_0

    .line 569
    const-string v0, "Track_GaoDeMap"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "drawLine drawLine is null sth exception"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 570
    const/4 v0, 0x0

    return-object v0

    .line 572
    :cond_0
    iget-object v0, p0, Lo/cgy;->d:Lcom/amap/api/maps/AMap;

    invoke-virtual {v0, p1}, Lcom/amap/api/maps/AMap;->addPolyline(Lcom/amap/api/maps/model/PolylineOptions;)Lcom/amap/api/maps/model/Polyline;

    move-result-object v0

    return-object v0
.end method

.method private b(I)V
    .locals 5

    .line 1517
    const-wide/16 v2, 0x384

    .line 1518
    sget-object v0, Lo/cgy;->n:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1520
    return-void

    .line 1522
    :cond_0
    iget-object v0, p0, Lo/cgy;->O:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 1523
    iget-object v0, p0, Lo/cgy;->O:Landroid/os/Handler;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 1524
    iget-object v0, p0, Lo/cgy;->O:Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v4

    .line 1525
    iput p1, v4, Landroid/os/Message;->what:I

    .line 1526
    iget-object v0, p0, Lo/cgy;->O:Landroid/os/Handler;

    invoke-virtual {v0, v4, v2, v3}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 1527
    return-void
.end method

.method private b(Lcom/amap/api/maps/model/LatLng;JLcom/amap/api/maps/AMap$CancelableCallback;)V
    .locals 5

    .line 196
    iget-object v0, p0, Lo/cgy;->d:Lcom/amap/api/maps/AMap;

    invoke-virtual {v0}, Lcom/amap/api/maps/AMap;->getCameraPosition()Lcom/amap/api/maps/model/CameraPosition;

    move-result-object v0

    iget v3, v0, Lcom/amap/api/maps/model/CameraPosition;->zoom:F

    .line 197
    const/high16 v0, 0x41200000    # 10.0f

    sub-float v0, v3, v0

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lo/cgy;->y:Z

    if-eqz v0, :cond_1

    .line 198
    :cond_0
    const/high16 v3, 0x41840000    # 16.5f

    .line 200
    :cond_1
    iget-boolean v0, p0, Lo/cgy;->y:Z

    if-eqz v0, :cond_2

    .line 201
    iget-object p4, p0, Lo/cgy;->C:Lcom/amap/api/maps/AMap$CancelableCallback;

    .line 203
    :cond_2
    new-instance v0, Lcom/amap/api/maps/model/CameraPosition;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {v0, p1, v3, v1, v2}, Lcom/amap/api/maps/model/CameraPosition;-><init>(Lcom/amap/api/maps/model/LatLng;FFF)V

    invoke-static {v0}, Lcom/amap/api/maps/CameraUpdateFactory;->newCameraPosition(Lcom/amap/api/maps/model/CameraPosition;)Lcom/amap/api/maps/CameraUpdate;

    move-result-object v4

    .line 204
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iput-wide v0, p0, Lo/cgy;->j:J

    .line 206
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/cgy;->o:Z

    .line 207
    iget-object v0, p0, Lo/cgy;->d:Lcom/amap/api/maps/AMap;

    invoke-virtual {v0, v4, p2, p3, p4}, Lcom/amap/api/maps/AMap;->animateCamera(Lcom/amap/api/maps/CameraUpdate;JLcom/amap/api/maps/AMap$CancelableCallback;)V

    .line 208
    return-void
.end method

.method static synthetic b(Lo/cgy;I)V
    .locals 0

    .line 56
    invoke-direct {p0, p1}, Lo/cgy;->b(I)V

    return-void
.end method

.method private b(Ljava/util/Map;)Z
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Float;>;)Z"
        }
    .end annotation

    .line 395
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v2

    .line 396
    const/4 v3, 0x1

    .line 397
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Ljava/util/Map$Entry;

    .line 398
    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-gtz v0, :cond_0

    .line 399
    const/4 v0, 0x1

    return v0

    .line 400
    :cond_0
    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const v1, 0x186a0

    rem-int/2addr v0, v1

    if-eqz v0, :cond_1

    .line 401
    const/4 v3, 0x0

    .line 403
    :cond_1
    goto :goto_0

    .line 404
    :cond_2
    return v3
.end method

.method static synthetic b(Lo/cgy;Z)Z
    .locals 0

    .line 56
    iput-boolean p1, p0, Lo/cgy;->y:Z

    return p1
.end method

.method private c(Ljava/util/Map;)I
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Float;>;)I"
        }
    .end annotation

    .line 413
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    .line 414
    const/4 v2, 0x0

    .line 416
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/util/Map$Entry;

    .line 418
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v2

    .line 419
    goto :goto_0

    .line 421
    :cond_0
    iget v0, p0, Lo/cgy;->z:I

    invoke-static {v2, v0}, Lo/cdr;->c(FI)I

    move-result v3

    .line 423
    return v3
.end method

.method static synthetic c(Lo/cgy;)Lcom/amap/api/maps/model/LatLng;
    .locals 1

    .line 56
    iget-object v0, p0, Lo/cgy;->I:Lcom/amap/api/maps/model/LatLng;

    return-object v0
.end method

.method private c(Lo/cgu;)Lcom/amap/api/maps/model/PolylineOptions;
    .locals 5

    .line 1092
    new-instance v4, Lcom/amap/api/maps/model/PolylineOptions;

    invoke-direct {v4}, Lcom/amap/api/maps/model/PolylineOptions;-><init>()V

    .line 1093
    invoke-virtual {p1}, Lo/cgu;->b()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_0

    .line 1095
    :pswitch_0
    const/high16 v0, 0x41700000    # 15.0f

    invoke-virtual {v4, v0}, Lcom/amap/api/maps/model/PolylineOptions;->width(F)Lcom/amap/api/maps/model/PolylineOptions;

    move-result-object v0

    .line 1096
    const/high16 v1, 0x41200000    # 10.0f

    invoke-virtual {v0, v1}, Lcom/amap/api/maps/model/PolylineOptions;->zIndex(F)Lcom/amap/api/maps/model/PolylineOptions;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/amap/api/maps/model/PolylineOptions;->visible(Z)Lcom/amap/api/maps/model/PolylineOptions;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/amap/api/maps/model/PolylineOptions;->useGradient(Z)Lcom/amap/api/maps/model/PolylineOptions;

    move-result-object v0

    .line 1097
    invoke-virtual {p1}, Lo/cgu;->a()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/amap/api/maps/model/PolylineOptions;->colorValues(Ljava/util/List;)Lcom/amap/api/maps/model/PolylineOptions;

    move-result-object v0

    invoke-virtual {p1}, Lo/cgu;->d()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/amap/api/maps/model/PolylineOptions;->addAll(Ljava/lang/Iterable;)Lcom/amap/api/maps/model/PolylineOptions;

    .line 1098
    goto :goto_1

    .line 1100
    :pswitch_1
    const/high16 v0, 0x41700000    # 15.0f

    invoke-virtual {v4, v0}, Lcom/amap/api/maps/model/PolylineOptions;->width(F)Lcom/amap/api/maps/model/PolylineOptions;

    move-result-object v0

    .line 1101
    const/high16 v1, 0x41200000    # 10.0f

    invoke-virtual {v0, v1}, Lcom/amap/api/maps/model/PolylineOptions;->zIndex(F)Lcom/amap/api/maps/model/PolylineOptions;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/amap/api/maps/model/PolylineOptions;->visible(Z)Lcom/amap/api/maps/model/PolylineOptions;

    move-result-object v0

    .line 1102
    invoke-virtual {p1}, Lo/cgu;->c()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/amap/api/maps/model/PolylineOptions;->color(I)Lcom/amap/api/maps/model/PolylineOptions;

    move-result-object v0

    invoke-virtual {p1}, Lo/cgu;->d()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/amap/api/maps/model/PolylineOptions;->addAll(Ljava/lang/Iterable;)Lcom/amap/api/maps/model/PolylineOptions;

    .line 1103
    goto :goto_1

    .line 1105
    :pswitch_2
    sget v0, Lo/cdw;->b:I

    invoke-virtual {v4, v0}, Lcom/amap/api/maps/model/PolylineOptions;->color(I)Lcom/amap/api/maps/model/PolylineOptions;

    move-result-object v0

    .line 1106
    const/high16 v1, 0x41700000    # 15.0f

    invoke-virtual {v0, v1}, Lcom/amap/api/maps/model/PolylineOptions;->width(F)Lcom/amap/api/maps/model/PolylineOptions;

    move-result-object v0

    .line 1107
    const/high16 v1, 0x41200000    # 10.0f

    invoke-virtual {v0, v1}, Lcom/amap/api/maps/model/PolylineOptions;->zIndex(F)Lcom/amap/api/maps/model/PolylineOptions;

    move-result-object v0

    .line 1108
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/amap/api/maps/model/PolylineOptions;->setDottedLine(Z)Lcom/amap/api/maps/model/PolylineOptions;

    move-result-object v0

    .line 1109
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/amap/api/maps/model/PolylineOptions;->visible(Z)Lcom/amap/api/maps/model/PolylineOptions;

    move-result-object v0

    .line 1110
    invoke-virtual {p1}, Lo/cgu;->d()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/amap/api/maps/model/PolylineOptions;->addAll(Ljava/lang/Iterable;)Lcom/amap/api/maps/model/PolylineOptions;

    .line 1111
    goto :goto_1

    .line 1113
    :goto_0
    const-string v0, "Track_GaoDeMap"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "makeLinePolylineOptions on errer type"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1116
    :goto_1
    return-object v4

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method private c(Ljava/util/Map;Ljava/util/List;Ljava/util/List;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Float;>;Ljava/util/List<Lcom/amap/api/maps/model/LatLng;>;Ljava/util/List<Lcom/amap/api/maps/model/LatLng;>;)V"
        }
    .end annotation

    .line 1165
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v4

    .line 1167
    const/4 v6, 0x0

    .line 1169
    const/4 v7, 0x0

    :goto_0
    if-ge v7, v4, :cond_2

    .line 1171
    invoke-interface {p2, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/amap/api/maps/model/LatLng;

    .line 1172
    invoke-static {v5}, Lo/cdr;->a(Lcom/amap/api/maps/model/LatLng;)Lo/cgk;

    move-result-object v0

    invoke-static {v0}, Lo/cdr;->d(Lo/cgk;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1177
    invoke-interface {p3}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 1179
    invoke-virtual {p0, v6, v7, p3, p1}, Lo/cgy;->b(IILjava/util/List;Ljava/util/Map;)V

    .line 1180
    invoke-interface {p3}, Ljava/util/List;->clear()V

    .line 1183
    :cond_0
    invoke-direct {p0, p2, v7}, Lo/cgy;->d(Ljava/util/List;I)V

    .line 1184
    add-int/lit8 v6, v7, 0x1

    goto :goto_1

    .line 1189
    :cond_1
    invoke-interface {p3, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1169
    :goto_1
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 1192
    :cond_2
    const-string v0, "Track_GaoDeMap"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "sportList SIZE:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1195
    invoke-interface {p3}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_3

    .line 1196
    invoke-virtual {p0, v6, v4, p3, p1}, Lo/cgy;->b(IILjava/util/List;Ljava/util/Map;)V

    .line 1199
    :cond_3
    return-void
.end method

.method static synthetic c(Lo/cgy;Z)Z
    .locals 0

    .line 56
    iput-boolean p1, p0, Lo/cgy;->K:Z

    return p1
.end method

.method static synthetic d(Lo/cgy;)Lcom/amap/api/maps/model/Marker;
    .locals 1

    .line 56
    iget-object v0, p0, Lo/cgy;->i:Lcom/amap/api/maps/model/Marker;

    return-object v0
.end method

.method private d(ILjava/util/Map;)Ljava/util/List;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ILjava/util/Map<Ljava/lang/Integer;Ljava/lang/Float;>;)Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation

    .line 449
    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v4

    .line 450
    invoke-interface {p2}, Ljava/util/Map;->size()I

    move-result v0

    new-array v5, v0, [F

    .line 451
    invoke-interface {p2}, Ljava/util/Map;->size()I

    move-result v0

    new-array v6, v0, [F

    .line 452
    invoke-interface {p2}, Ljava/util/Map;->size()I

    move-result v0

    new-array v7, v0, [Ljava/lang/Integer;

    .line 453
    const-string v0, "Track_GaoDeMap"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getColorByPaceList paces list:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 455
    const/4 v8, 0x0

    .line 456
    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_0
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Ljava/util/Map$Entry;

    .line 458
    invoke-interface {v10}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const v1, 0x186a0

    if-le v0, v1, :cond_0

    .line 460
    invoke-interface {v10}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const v1, 0x186a0

    rem-int/2addr v0, v1

    int-to-float v0, v0

    aput v0, v5, v8

    goto :goto_1

    .line 464
    :cond_0
    invoke-interface {v10}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    int-to-float v0, v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    aput v0, v5, v8

    .line 466
    :goto_1
    invoke-interface {v10}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    aput v0, v6, v8

    .line 468
    aget v0, v6, v8

    iget v1, p0, Lo/cgy;->z:I

    invoke-static {v0, v1}, Lo/cdr;->c(FI)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v7, v8

    .line 470
    add-int/lit8 v8, v8, 0x1

    .line 471
    goto/16 :goto_0

    .line 475
    :cond_1
    invoke-static {v5, v7}, Lo/cdr;->d([F[Ljava/lang/Integer;)Ljava/util/List;

    move-result-object v9

    .line 476
    const-string v0, "Track_GaoDeMap"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "colorList "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " pointSize "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 477
    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v10

    .line 478
    if-ge v10, p1, :cond_3

    .line 480
    if-nez v10, :cond_2

    .line 481
    iget v11, p0, Lo/cgy;->e:I

    goto :goto_2

    .line 483
    :cond_2
    add-int/lit8 v0, v10, -0x1

    invoke-interface {v9, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v11

    .line 485
    :goto_2
    const/4 v12, 0x0

    :goto_3
    sub-int v0, p1, v10

    if-ge v12, v0, :cond_3

    .line 486
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v9, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 485
    add-int/lit8 v12, v12, 0x1

    goto :goto_3

    .line 490
    :cond_3
    return-object v9
.end method

.method private d(Lcom/amap/api/maps/model/LatLng;DD)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/amap/api/maps/model/LatLng;DD)Ljava/util/List<Lcom/amap/api/maps/model/LatLng;>;"
        }
    .end annotation

    .line 1564
    const/4 v0, 0x5

    new-array v0, v0, [Lcom/amap/api/maps/model/LatLng;

    new-instance v1, Lcom/amap/api/maps/model/LatLng;

    iget-wide v2, p1, Lcom/amap/api/maps/model/LatLng;->latitude:D

    sub-double/2addr v2, p4

    iget-wide v4, p1, Lcom/amap/api/maps/model/LatLng;->longitude:D

    sub-double/2addr v4, p2

    invoke-direct {v1, v2, v3, v4, v5}, Lcom/amap/api/maps/model/LatLng;-><init>(DD)V

    const/4 v2, 0x0

    aput-object v1, v0, v2

    new-instance v1, Lcom/amap/api/maps/model/LatLng;

    iget-wide v2, p1, Lcom/amap/api/maps/model/LatLng;->latitude:D

    sub-double/2addr v2, p4

    iget-wide v4, p1, Lcom/amap/api/maps/model/LatLng;->longitude:D

    add-double/2addr v4, p2

    invoke-direct {v1, v2, v3, v4, v5}, Lcom/amap/api/maps/model/LatLng;-><init>(DD)V

    const/4 v2, 0x1

    aput-object v1, v0, v2

    new-instance v1, Lcom/amap/api/maps/model/LatLng;

    iget-wide v2, p1, Lcom/amap/api/maps/model/LatLng;->latitude:D

    add-double/2addr v2, p4

    iget-wide v4, p1, Lcom/amap/api/maps/model/LatLng;->longitude:D

    add-double/2addr v4, p2

    invoke-direct {v1, v2, v3, v4, v5}, Lcom/amap/api/maps/model/LatLng;-><init>(DD)V

    const/4 v2, 0x2

    aput-object v1, v0, v2

    new-instance v1, Lcom/amap/api/maps/model/LatLng;

    iget-wide v2, p1, Lcom/amap/api/maps/model/LatLng;->latitude:D

    add-double/2addr v2, p4

    iget-wide v4, p1, Lcom/amap/api/maps/model/LatLng;->longitude:D

    sub-double/2addr v4, p2

    invoke-direct {v1, v2, v3, v4, v5}, Lcom/amap/api/maps/model/LatLng;-><init>(DD)V

    const/4 v2, 0x3

    aput-object v1, v0, v2

    new-instance v1, Lcom/amap/api/maps/model/LatLng;

    iget-wide v2, p1, Lcom/amap/api/maps/model/LatLng;->latitude:D

    sub-double/2addr v2, p4

    iget-wide v4, p1, Lcom/amap/api/maps/model/LatLng;->longitude:D

    sub-double/2addr v4, p2

    invoke-direct {v1, v2, v3, v4, v5}, Lcom/amap/api/maps/model/LatLng;-><init>(DD)V

    const/4 v2, 0x4

    aput-object v1, v0, v2

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method private d(IILjava/util/List;Ljava/util/Map;)Lo/cgu;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IILjava/util/List<Lcom/amap/api/maps/model/LatLng;>;Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Float;>;)Lo/cgu;"
        }
    .end annotation

    .line 320
    new-instance v2, Lo/cgu;

    invoke-direct {v2}, Lo/cgu;-><init>()V

    .line 321
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 322
    if-eqz p4, :cond_0

    invoke-interface/range {p4 .. p4}, Ljava/util/Map;->size()I

    move-result v0

    if-eqz v0, :cond_0

    move-object/from16 v0, p4

    invoke-direct {p0, v0}, Lo/cgy;->b(Ljava/util/Map;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 323
    :cond_0
    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Lo/cgu;->d(I)V

    .line 324
    iget v0, p0, Lo/cgy;->e:I

    invoke-virtual {v2, v0}, Lo/cgu;->a(I)V

    goto :goto_0

    .line 325
    :cond_1
    invoke-interface/range {p4 .. p4}, Ljava/util/Map;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    .line 326
    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Lo/cgu;->d(I)V

    .line 327
    move-object/from16 v0, p4

    invoke-direct {p0, v0}, Lo/cgy;->c(Ljava/util/Map;)I

    move-result v0

    invoke-virtual {v2, v0}, Lo/cgu;->a(I)V

    goto :goto_0

    .line 329
    :cond_2
    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Lo/cgu;->d(I)V

    .line 330
    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result v0

    move-object/from16 v1, p4

    invoke-direct {p0, v0, v1}, Lo/cgy;->a(ILjava/util/Map;)Ljava/util/List;

    move-result-object v3

    .line 332
    :goto_0
    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result v4

    .line 333
    div-int/lit16 v5, v4, 0x9c4

    .line 334
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 335
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 336
    const/4 v0, 0x1

    if-le v5, v0, :cond_6

    .line 337
    const/4 v8, 0x0

    :goto_1
    if-ge v8, v4, :cond_5

    .line 338
    rem-int v0, v8, v5

    if-eqz v0, :cond_3

    add-int/lit8 v0, v4, -0x1

    if-ne v8, v0, :cond_4

    .line 339
    :cond_3
    invoke-interface {p3, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v7, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 340
    add-int v0, v8, p1

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_4

    .line 341
    add-int v0, v8, p1

    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v6, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 337
    :cond_4
    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    :cond_5
    goto :goto_3

    .line 346
    :cond_6
    move v8, p1

    :goto_2
    if-ge v8, p2, :cond_8

    .line 347
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v0

    if-ge v8, v0, :cond_7

    .line 348
    invoke-interface {v3, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v6, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 346
    :cond_7
    add-int/lit8 v8, v8, 0x1

    goto :goto_2

    .line 351
    :cond_8
    invoke-interface {v7, p3}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 353
    :goto_3
    invoke-interface {v7}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_9

    .line 354
    const/4 v0, 0x0

    return-object v0

    .line 355
    :cond_9
    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_b

    .line 356
    invoke-virtual {v2, v7}, Lo/cgu;->d(Ljava/util/List;)V

    .line 357
    invoke-virtual {v2}, Lo/cgu;->b()I

    move-result v0

    if-nez v0, :cond_10

    .line 358
    invoke-interface {v6}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_a

    .line 359
    iget v0, p0, Lo/cgy;->e:I

    invoke-virtual {v2, v0}, Lo/cgu;->a(I)V

    goto :goto_4

    .line 361
    :cond_a
    const/4 v0, 0x0

    invoke-interface {v6, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {v2, v0}, Lo/cgu;->a(I)V

    .line 363
    :goto_4
    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Lo/cgu;->d(I)V

    goto/16 :goto_9

    .line 366
    :cond_b
    invoke-virtual {v2, v7}, Lo/cgu;->d(Ljava/util/List;)V

    .line 367
    const/4 v8, 0x1

    .line 368
    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_5
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_d

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lcom/amap/api/maps/model/LatLng;

    .line 369
    if-eqz v8, :cond_c

    .line 370
    const/4 v8, 0x0

    goto :goto_6

    .line 372
    :cond_c
    iget-object v0, p0, Lo/cgy;->B:Ljava/util/List;

    invoke-direct {p0, v10}, Lo/cgy;->a(Lcom/amap/api/maps/model/LatLng;)Landroid/graphics/PointF;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 374
    :goto_6
    goto :goto_5

    .line 375
    :cond_d
    invoke-virtual {v2}, Lo/cgu;->b()I

    move-result v0

    if-nez v0, :cond_10

    .line 376
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v9

    .line 377
    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v0

    if-ge v9, v0, :cond_f

    .line 379
    if-nez v9, :cond_e

    .line 380
    iget v10, p0, Lo/cgy;->e:I

    goto :goto_7

    .line 382
    :cond_e
    add-int/lit8 v0, v9, -0x1

    invoke-interface {v6, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v10

    .line 384
    :goto_7
    const/4 v11, 0x0

    :goto_8
    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v0

    sub-int/2addr v0, v9

    if-ge v11, v0, :cond_f

    .line 385
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v6, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 384
    add-int/lit8 v11, v11, 0x1

    goto :goto_8

    .line 388
    :cond_f
    invoke-virtual {v2, v6}, Lo/cgu;->e(Ljava/util/List;)V

    .line 391
    :cond_10
    :goto_9
    return-object v2
.end method

.method public static d(Ljava/lang/Boolean;)V
    .locals 0

    .line 129
    sput-object p0, Lo/cgy;->n:Ljava/lang/Boolean;

    .line 130
    return-void
.end method

.method private d(Ljava/util/List;I)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/amap/api/maps/model/LatLng;>;I)V"
        }
    .end annotation

    .line 1249
    const/4 v3, 0x0

    .line 1250
    const/4 v4, 0x0

    .line 1252
    const/4 v0, 0x1

    if-lt p2, v0, :cond_0

    .line 1254
    add-int/lit8 v0, p2, -0x1

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/amap/api/maps/model/LatLng;

    .line 1257
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-ge p2, v0, :cond_1

    .line 1259
    add-int/lit8 v0, p2, 0x1

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/amap/api/maps/model/LatLng;

    .line 1262
    :cond_1
    const/4 v0, 0x0

    if-eq v0, v3, :cond_2

    const/4 v0, 0x0

    if-eq v0, v4, :cond_2

    .line 1264
    new-instance v0, Lcom/amap/api/maps/model/PolylineOptions;

    invoke-direct {v0}, Lcom/amap/api/maps/model/PolylineOptions;-><init>()V

    sget v1, Lo/cdw;->b:I

    invoke-virtual {v0, v1}, Lcom/amap/api/maps/model/PolylineOptions;->color(I)Lcom/amap/api/maps/model/PolylineOptions;

    move-result-object v0

    .line 1265
    const/high16 v1, 0x41700000    # 15.0f

    invoke-virtual {v0, v1}, Lcom/amap/api/maps/model/PolylineOptions;->width(F)Lcom/amap/api/maps/model/PolylineOptions;

    move-result-object v0

    .line 1266
    const/high16 v1, 0x41200000    # 10.0f

    invoke-virtual {v0, v1}, Lcom/amap/api/maps/model/PolylineOptions;->zIndex(F)Lcom/amap/api/maps/model/PolylineOptions;

    move-result-object v0

    .line 1267
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/amap/api/maps/model/PolylineOptions;->setDottedLine(Z)Lcom/amap/api/maps/model/PolylineOptions;

    move-result-object v0

    .line 1268
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/amap/api/maps/model/PolylineOptions;->visible(Z)Lcom/amap/api/maps/model/PolylineOptions;

    move-result-object v0

    const/4 v1, 0x2

    new-array v1, v1, [Lcom/amap/api/maps/model/LatLng;

    const/4 v2, 0x0

    aput-object v3, v1, v2

    const/4 v2, 0x1

    aput-object v4, v1, v2

    .line 1269
    invoke-virtual {v0, v1}, Lcom/amap/api/maps/model/PolylineOptions;->add([Lcom/amap/api/maps/model/LatLng;)Lcom/amap/api/maps/model/PolylineOptions;

    move-result-object v0

    .line 1264
    invoke-direct {p0, v0}, Lo/cgy;->b(Lcom/amap/api/maps/model/PolylineOptions;)Lcom/amap/api/maps/model/Polyline;

    .line 1272
    :cond_2
    return-void
.end method

.method private d(Ljava/util/List;Ljava/util/Map;)V
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/amap/api/maps/model/LatLng;>;Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Float;>;)V"
        }
    .end annotation

    .line 494
    invoke-interface/range {p2 .. p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v4

    .line 495
    invoke-interface/range {p2 .. p2}, Ljava/util/Map;->size()I

    move-result v5

    .line 496
    new-array v6, v5, [Ljava/lang/Integer;

    .line 497
    new-array v7, v5, [Ljava/lang/Integer;

    .line 499
    const/4 v8, 0x0

    .line 500
    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_0
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Ljava/util/Map$Entry;

    .line 502
    invoke-interface {v10}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v11

    .line 504
    invoke-static {v11}, Lo/cds;->g(I)Z

    move-result v0

    if-nez v0, :cond_0

    .line 505
    goto :goto_0

    .line 508
    :cond_0
    const v0, 0x186a0

    if-le v11, v0, :cond_1

    .line 511
    const v0, 0x186a0

    rem-int v0, v11, v0

    add-int/lit8 v0, v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v6, v8

    .line 512
    const v0, 0x186a0

    div-int v0, v11, v0

    div-int/lit8 v0, v0, 0x64

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v7, v8

    goto :goto_1

    .line 517
    :cond_1
    add-int/lit8 v0, v11, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v6, v8

    .line 518
    add-int/lit8 v0, v8, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v7, v8

    .line 520
    :goto_1
    add-int/lit8 v8, v8, 0x1

    .line 521
    goto :goto_0

    .line 523
    :cond_2
    const/4 v9, 0x0

    :goto_2
    if-ge v9, v8, :cond_7

    .line 525
    :try_start_0
    aget-object v0, v6, v9

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v10

    .line 527
    aget-object v0, v6, v9

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iget v1, p0, Lo/cgy;->w:I

    if-le v0, v1, :cond_3

    .line 529
    iget v0, p0, Lo/cgy;->w:I

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lcom/amap/api/maps/model/LatLng;

    .line 530
    iget v10, p0, Lo/cgy;->w:I

    goto :goto_3

    .line 531
    :cond_3
    aget-object v0, v6, v9

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iget v1, p0, Lo/cgy;->v:I

    if-ge v0, v1, :cond_4

    .line 532
    iget v0, p0, Lo/cgy;->v:I

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lcom/amap/api/maps/model/LatLng;

    .line 533
    iget v10, p0, Lo/cgy;->v:I

    goto :goto_3

    .line 535
    :cond_4
    invoke-interface {p1, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lcom/amap/api/maps/model/LatLng;

    .line 537
    :goto_3
    new-instance v12, Lo/cgy$d;

    invoke-direct {v12}, Lo/cgy$d;-><init>()V

    .line 538
    invoke-static {v12, v11}, Lo/cgy$d;->b(Lo/cgy$d;Lcom/amap/api/maps/model/LatLng;)Lcom/amap/api/maps/model/LatLng;

    .line 539
    const/4 v0, 0x1

    invoke-static {v12, v0}, Lo/cgy$d;->e(Lo/cgy$d;Z)Z

    .line 540
    aget-object v0, v7, v9

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {v12, v0}, Lo/cgy$d;->a(Lo/cgy$d;I)I

    .line 542
    iget-object v0, p0, Lo/cgy;->x:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_6

    .line 544
    iget-object v0, p0, Lo/cgy;->x:Ljava/util/ArrayList;

    iget-object v1, p0, Lo/cgy;->x:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Lo/cgy$d;

    .line 545
    invoke-static {v13}, Lo/cgy$d;->e(Lo/cgy$d;)Lcom/amap/api/maps/model/LatLng;

    move-result-object v0

    invoke-virtual {v0, v11}, Lcom/amap/api/maps/model/LatLng;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 550
    iget v0, p0, Lo/cgy;->w:I

    if-ne v10, v0, :cond_5

    .line 551
    const/4 v0, 0x0

    invoke-static {v12, v0}, Lo/cgy$d;->e(Lo/cgy$d;Z)Z

    goto :goto_4

    .line 553
    :cond_5
    const/4 v0, 0x0

    invoke-static {v13, v0}, Lo/cgy$d;->e(Lo/cgy$d;Z)Z

    .line 558
    :cond_6
    :goto_4
    iget-object v0, p0, Lo/cgy;->x:Ljava/util/ArrayList;

    invoke-virtual {v0, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    .line 561
    goto :goto_5

    .line 559
    :catch_0
    move-exception v10

    .line 560
    const-string v0, "Track_GaoDeMap"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setUpKmLatLngList "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v10}, Ljava/lang/IndexOutOfBoundsException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 523
    :goto_5
    add-int/lit8 v9, v9, 0x1

    goto/16 :goto_2

    .line 563
    :cond_7
    return-void
.end method

.method private d(Lo/cew;)V
    .locals 14

    .line 785
    invoke-virtual {p1}, Lo/cew;->b()Ljava/util/Map;

    move-result-object v5

    .line 786
    if-eqz v5, :cond_0

    invoke-interface {v5}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 787
    :cond_0
    return-void

    .line 789
    :cond_1
    invoke-virtual {p1}, Lo/cew;->d()Ljava/util/Map;

    move-result-object v6

    .line 790
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 791
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 793
    new-instance v9, Lcom/amap/api/maps/model/LatLngBounds$Builder;

    invoke-direct {v9}, Lcom/amap/api/maps/model/LatLngBounds$Builder;-><init>()V

    .line 795
    invoke-interface {v5}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_0
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Ljava/util/Map$Entry;

    .line 797
    new-instance v12, Lcom/amap/api/maps/model/LatLng;

    invoke-interface {v11}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [D

    const/4 v1, 0x0

    aget-wide v0, v0, v1

    invoke-interface {v11}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [D

    const/4 v3, 0x1

    aget-wide v2, v2, v3

    invoke-direct {v12, v0, v1, v2, v3}, Lcom/amap/api/maps/model/LatLng;-><init>(DD)V

    .line 798
    invoke-interface {v7}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_2

    .line 800
    invoke-interface {v7, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 802
    invoke-static {v12}, Lo/cdr;->a(Lcom/amap/api/maps/model/LatLng;)Lo/cgk;

    move-result-object v0

    invoke-static {v0}, Lo/cdr;->d(Lo/cgk;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 804
    invoke-virtual {v9, v12}, Lcom/amap/api/maps/model/LatLngBounds$Builder;->include(Lcom/amap/api/maps/model/LatLng;)Lcom/amap/api/maps/model/LatLngBounds$Builder;

    goto :goto_1

    .line 808
    :cond_2
    invoke-static {v12}, Lo/cdr;->a(Lcom/amap/api/maps/model/LatLng;)Lo/cgk;

    move-result-object v0

    invoke-static {v0}, Lo/cdr;->d(Lo/cgk;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 809
    invoke-interface {v7, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 811
    invoke-virtual {v9, v12}, Lcom/amap/api/maps/model/LatLngBounds$Builder;->include(Lcom/amap/api/maps/model/LatLng;)Lcom/amap/api/maps/model/LatLngBounds$Builder;

    .line 813
    new-instance v0, Lcom/amap/api/maps/model/LatLng;

    iget-wide v1, v12, Lcom/amap/api/maps/model/LatLng;->latitude:D

    iget-wide v3, v12, Lcom/amap/api/maps/model/LatLng;->longitude:D

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/amap/api/maps/model/LatLng;-><init>(DD)V

    iput-object v0, p0, Lo/cgy;->s:Lcom/amap/api/maps/model/LatLng;

    .line 816
    :cond_3
    :goto_1
    goto/16 :goto_0

    .line 818
    :cond_4
    const-string v0, "Track_GaoDeMap"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "list SIZE:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 821
    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v10

    .line 823
    const/4 v0, 0x3

    if-ge v10, v0, :cond_5

    sget-object v0, Lo/cgy;->n:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 824
    return-void

    .line 827
    :cond_5
    invoke-direct {p0, v6, v7, v8}, Lo/cgy;->c(Ljava/util/Map;Ljava/util/List;Ljava/util/List;)V

    .line 830
    const/4 v11, 0x0

    :goto_2
    if-ge v11, v10, :cond_7

    .line 831
    invoke-interface {v7, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Lcom/amap/api/maps/model/LatLng;

    .line 832
    invoke-static {v12}, Lo/cdr;->a(Lcom/amap/api/maps/model/LatLng;)Lo/cgk;

    move-result-object v0

    invoke-static {v0}, Lo/cdr;->d(Lo/cgk;)Z

    move-result v0

    if-nez v0, :cond_6

    .line 833
    iget v0, p0, Lo/cgy;->z:I

    invoke-virtual {p0, v12, v0}, Lo/cgy;->b(Lcom/amap/api/maps/model/LatLng;I)V

    .line 834
    iput v11, p0, Lo/cgy;->v:I

    .line 835
    const-string v0, "Track_GaoDeMap"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "addStartMarker"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 836
    goto :goto_3

    .line 830
    :cond_6
    add-int/lit8 v11, v11, 0x1

    goto :goto_2

    .line 840
    :cond_7
    :goto_3
    const/4 v11, 0x0

    .line 843
    add-int/lit8 v12, v10, -0x1

    :goto_4
    if-ltz v12, :cond_9

    .line 844
    invoke-interface {v7, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Lcom/amap/api/maps/model/LatLng;

    .line 845
    invoke-static {v13}, Lo/cdr;->a(Lcom/amap/api/maps/model/LatLng;)Lo/cgk;

    move-result-object v0

    invoke-static {v0}, Lo/cdr;->d(Lo/cgk;)Z

    move-result v0

    if-nez v0, :cond_8

    .line 846
    invoke-virtual {p0, v13}, Lo/cgy;->e(Lcom/amap/api/maps/model/LatLng;)V

    .line 847
    move-object v11, v13

    .line 848
    iput v12, p0, Lo/cgy;->w:I

    .line 849
    const-string v0, "Track_GaoDeMap"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "addEndMarker"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 850
    goto :goto_5

    .line 843
    :cond_8
    add-int/lit8 v12, v12, -0x1

    goto :goto_4

    .line 854
    :cond_9
    :goto_5
    invoke-virtual {v9}, Lcom/amap/api/maps/model/LatLngBounds$Builder;->build()Lcom/amap/api/maps/model/LatLngBounds;

    move-result-object v12

    .line 855
    if-nez v12, :cond_a

    .line 856
    const-string v0, "Track_GaoDeMap"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "show map bounds null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 857
    return-void

    .line 859
    :cond_a
    if-eqz v11, :cond_b

    .line 860
    iget-object v0, p0, Lo/cgy;->d:Lcom/amap/api/maps/AMap;

    invoke-static {v11}, Lcom/amap/api/maps/CameraUpdateFactory;->changeLatLng(Lcom/amap/api/maps/model/LatLng;)Lcom/amap/api/maps/CameraUpdate;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/amap/api/maps/AMap;->moveCamera(Lcom/amap/api/maps/CameraUpdate;)V

    .line 861
    iget-object v0, p0, Lo/cgy;->d:Lcom/amap/api/maps/AMap;

    const/high16 v1, 0x41840000    # 16.5f

    invoke-static {v1}, Lcom/amap/api/maps/CameraUpdateFactory;->zoomTo(F)Lcom/amap/api/maps/CameraUpdate;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/amap/api/maps/AMap;->moveCamera(Lcom/amap/api/maps/CameraUpdate;)V

    .line 863
    :cond_b
    return-void
.end method

.method private e(Ljava/util/Map;Ljava/util/List;Ljava/util/List;)Ljava/util/List;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Float;>;Ljava/util/List<Lcom/amap/api/maps/model/LatLng;>;Ljava/util/List<Lcom/amap/api/maps/model/LatLng;>;)Ljava/util/List<Lo/cgu;>;"
        }
    .end annotation

    .line 1206
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 1207
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/cgy;->B:Ljava/util/List;

    .line 1208
    iget-object v0, p0, Lo/cgy;->G:Lcom/amap/api/maps/model/LatLng;

    if-eqz v0, :cond_0

    .line 1209
    iget-object v0, p0, Lo/cgy;->B:Ljava/util/List;

    iget-object v1, p0, Lo/cgy;->G:Lcom/amap/api/maps/model/LatLng;

    invoke-direct {p0, v1}, Lo/cgy;->a(Lcom/amap/api/maps/model/LatLng;)Landroid/graphics/PointF;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1211
    :cond_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v5

    .line 1213
    const/4 v7, 0x0

    .line 1214
    const/4 v8, 0x0

    :goto_0
    if-ge v8, v5, :cond_5

    .line 1215
    invoke-interface {p2, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/amap/api/maps/model/LatLng;

    .line 1216
    invoke-static {v6}, Lo/cdr;->a(Lcom/amap/api/maps/model/LatLng;)Lo/cgk;

    move-result-object v0

    invoke-static {v0}, Lo/cdr;->d(Lo/cgk;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 1217
    invoke-interface {p3}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    .line 1218
    invoke-direct {p0, v7, v8, p3, p1}, Lo/cgy;->d(IILjava/util/List;Ljava/util/Map;)Lo/cgu;

    move-result-object v9

    .line 1219
    if-eqz v9, :cond_1

    .line 1220
    invoke-interface {v4, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1222
    :cond_1
    invoke-interface {p3}, Ljava/util/List;->clear()V

    .line 1224
    :cond_2
    invoke-direct {p0, p2, v8}, Lo/cgy;->e(Ljava/util/List;I)Lo/cgu;

    move-result-object v9

    .line 1225
    if-eqz v9, :cond_3

    .line 1226
    invoke-interface {v4, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1228
    :cond_3
    add-int/lit8 v7, v8, 0x1

    .line 1229
    goto :goto_1

    .line 1230
    :cond_4
    invoke-interface {p3, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1214
    :goto_1
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    .line 1233
    :cond_5
    const-string v0, "Track_GaoDeMap"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "sportList SIZE:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1234
    invoke-interface {p3}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_6

    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_6

    .line 1235
    invoke-direct {p0, v7, v5, p3, p1}, Lo/cgy;->d(IILjava/util/List;Ljava/util/Map;)Lo/cgu;

    move-result-object v8

    .line 1236
    if-eqz v8, :cond_6

    .line 1237
    invoke-interface {v4, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1240
    :cond_6
    return-object v4
.end method

.method private e(Ljava/util/List;I)Lo/cgu;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/amap/api/maps/model/LatLng;>;I)Lo/cgu;"
        }
    .end annotation

    .line 1275
    const/4 v2, 0x0

    .line 1276
    const/4 v3, 0x0

    .line 1278
    const/4 v0, 0x1

    if-lt p2, v0, :cond_0

    .line 1280
    add-int/lit8 v0, p2, -0x1

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/amap/api/maps/model/LatLng;

    .line 1283
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-ge p2, v0, :cond_1

    .line 1285
    add-int/lit8 v0, p2, 0x1

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/amap/api/maps/model/LatLng;

    .line 1288
    :cond_1
    const/4 v0, 0x0

    if-eq v0, v2, :cond_2

    const/4 v0, 0x0

    if-eq v0, v3, :cond_2

    .line 1290
    new-instance v4, Lo/cgu;

    invoke-direct {v4}, Lo/cgu;-><init>()V

    .line 1291
    const/4 v0, 0x2

    invoke-virtual {v4, v0}, Lo/cgu;->d(I)V

    .line 1292
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 1293
    invoke-interface {v5, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1294
    invoke-interface {v5, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1295
    invoke-virtual {v4, v5}, Lo/cgu;->d(Ljava/util/List;)V

    .line 1296
    iget-object v0, p0, Lo/cgy;->B:Ljava/util/List;

    invoke-direct {p0, v3}, Lo/cgy;->a(Lcom/amap/api/maps/model/LatLng;)Landroid/graphics/PointF;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1297
    return-object v4

    .line 1299
    :cond_2
    const/4 v0, 0x0

    return-object v0
.end method

.method static synthetic e(Lo/cgy;)Lo/cgv;
    .locals 1

    .line 56
    iget-object v0, p0, Lo/cgy;->N:Lo/cgv;

    return-object v0
.end method

.method private e(Lcom/amap/api/maps/model/PolylineOptions;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/amap/api/maps/model/PolylineOptions;Ljava/util/List<Ljava/lang/Integer;>;)V"
        }
    .end annotation

    .line 435
    invoke-virtual {p1, p2}, Lcom/amap/api/maps/model/PolylineOptions;->colorValues(Ljava/util/List;)Lcom/amap/api/maps/model/PolylineOptions;

    .line 438
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/amap/api/maps/model/PolylineOptions;->useGradient(Z)Lcom/amap/api/maps/model/PolylineOptions;

    .line 440
    sget-object v0, Lo/cgy;->n:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 442
    const/high16 v0, 0x41700000    # 15.0f

    invoke-virtual {p1, v0}, Lcom/amap/api/maps/model/PolylineOptions;->width(F)Lcom/amap/api/maps/model/PolylineOptions;

    .line 445
    :cond_0
    return-void
.end method

.method private e(Lo/cew;)V
    .locals 16

    .line 960
    invoke-virtual/range {p1 .. p1}, Lo/cew;->b()Ljava/util/Map;

    move-result-object v7

    .line 961
    if-eqz v7, :cond_0

    invoke-interface {v7}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 962
    :cond_0
    return-void

    .line 965
    :cond_1
    invoke-virtual/range {p1 .. p1}, Lo/cew;->d()Ljava/util/Map;

    move-result-object v8

    .line 966
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 967
    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 969
    new-instance v11, Lcom/amap/api/maps/model/LatLngBounds$Builder;

    invoke-direct {v11}, Lcom/amap/api/maps/model/LatLngBounds$Builder;-><init>()V

    .line 971
    invoke-interface {v7}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :goto_0
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Ljava/util/Map$Entry;

    .line 973
    if-nez v13, :cond_2

    .line 974
    const-string v0, "Track_GaoDeMap"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "entry is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 975
    goto :goto_0

    .line 977
    :cond_2
    invoke-interface {v13}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v14, v0

    check-cast v14, [D

    .line 978
    if-eqz v14, :cond_3

    array-length v0, v14

    const/4 v1, 0x2

    if-ge v0, v1, :cond_4

    .line 979
    :cond_3
    const-string v0, "Track_GaoDeMap"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "values is null or length < 2"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 980
    goto :goto_0

    .line 982
    :cond_4
    new-instance v0, Lcom/amap/api/maps/model/LatLng;

    const/4 v1, 0x0

    aget-wide v1, v14, v1

    const/4 v3, 0x1

    aget-wide v3, v14, v3

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/amap/api/maps/model/LatLng;-><init>(DD)V

    move-object v15, v0

    .line 983
    invoke-interface {v9}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_5

    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_5

    .line 985
    invoke-interface {v9, v15}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 987
    invoke-static {v15}, Lo/cdr;->a(Lcom/amap/api/maps/model/LatLng;)Lo/cgk;

    move-result-object v0

    invoke-static {v0}, Lo/cdr;->d(Lo/cgk;)Z

    move-result v0

    if-nez v0, :cond_6

    .line 989
    invoke-virtual {v11, v15}, Lcom/amap/api/maps/model/LatLngBounds$Builder;->include(Lcom/amap/api/maps/model/LatLng;)Lcom/amap/api/maps/model/LatLngBounds$Builder;

    goto :goto_1

    .line 993
    :cond_5
    invoke-static {v15}, Lo/cdr;->a(Lcom/amap/api/maps/model/LatLng;)Lo/cgk;

    move-result-object v0

    invoke-static {v0}, Lo/cdr;->d(Lo/cgk;)Z

    move-result v0

    if-nez v0, :cond_6

    .line 994
    invoke-interface {v9, v15}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 995
    invoke-virtual {v11, v15}, Lcom/amap/api/maps/model/LatLngBounds$Builder;->include(Lcom/amap/api/maps/model/LatLng;)Lcom/amap/api/maps/model/LatLngBounds$Builder;

    .line 996
    new-instance v0, Lcom/amap/api/maps/model/LatLng;

    iget-wide v1, v15, Lcom/amap/api/maps/model/LatLng;->latitude:D

    iget-wide v3, v15, Lcom/amap/api/maps/model/LatLng;->longitude:D

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/amap/api/maps/model/LatLng;-><init>(DD)V

    move-object/from16 v1, p0

    iput-object v0, v1, Lo/cgy;->s:Lcom/amap/api/maps/model/LatLng;

    .line 999
    :cond_6
    :goto_1
    goto/16 :goto_0

    .line 1001
    :cond_7
    const-string v0, "Track_GaoDeMap"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "list SIZE:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1004
    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v12

    .line 1005
    const/4 v0, 0x3

    if-ge v12, v0, :cond_8

    sget-object v0, Lo/cgy;->n:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_8

    .line 1006
    return-void

    .line 1009
    :cond_8
    const/4 v13, 0x0

    :goto_2
    if-ge v13, v12, :cond_a

    .line 1010
    invoke-interface {v9, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v14, v0

    check-cast v14, Lcom/amap/api/maps/model/LatLng;

    .line 1011
    invoke-static {v14}, Lo/cdr;->a(Lcom/amap/api/maps/model/LatLng;)Lo/cgk;

    move-result-object v0

    invoke-static {v0}, Lo/cdr;->d(Lo/cgk;)Z

    move-result v0

    if-nez v0, :cond_9

    .line 1012
    move-object/from16 v0, p0

    iput-object v14, v0, Lo/cgy;->G:Lcom/amap/api/maps/model/LatLng;

    .line 1013
    move-object/from16 v0, p0

    iput v13, v0, Lo/cgy;->v:I

    .line 1014
    goto :goto_3

    .line 1009
    :cond_9
    add-int/lit8 v13, v13, 0x1

    goto :goto_2

    .line 1017
    :cond_a
    :goto_3
    move-object/from16 v0, p0

    invoke-direct {v0, v8, v9, v10}, Lo/cgy;->e(Ljava/util/Map;Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    move-object/from16 v1, p0

    iput-object v0, v1, Lo/cgy;->F:Ljava/util/List;

    .line 1018
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/cgy;->F:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_b

    .line 1019
    const-string v0, "Track_GaoDeMap"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mAnimalLines is empty"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1020
    return-void

    .line 1022
    :cond_b
    invoke-direct/range {p0 .. p0}, Lo/cgy;->l()Ljava/util/List;

    move-result-object v0

    move-object/from16 v1, p0

    iput-object v0, v1, Lo/cgy;->H:Ljava/util/List;

    .line 1023
    add-int/lit8 v13, v12, -0x1

    :goto_4
    if-ltz v13, :cond_d

    .line 1024
    invoke-interface {v9, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v14, v0

    check-cast v14, Lcom/amap/api/maps/model/LatLng;

    .line 1025
    invoke-static {v14}, Lo/cdr;->a(Lcom/amap/api/maps/model/LatLng;)Lo/cgk;

    move-result-object v0

    invoke-static {v0}, Lo/cdr;->d(Lo/cgk;)Z

    move-result v0

    if-nez v0, :cond_c

    .line 1026
    move-object/from16 v0, p0

    iput-object v14, v0, Lo/cgy;->I:Lcom/amap/api/maps/model/LatLng;

    .line 1027
    move-object/from16 v0, p0

    iput v13, v0, Lo/cgy;->w:I

    .line 1028
    goto :goto_5

    .line 1023
    :cond_c
    add-int/lit8 v13, v13, -0x1

    goto :goto_4

    .line 1031
    :cond_d
    :goto_5
    invoke-virtual {v11}, Lcom/amap/api/maps/model/LatLngBounds$Builder;->build()Lcom/amap/api/maps/model/LatLngBounds;

    move-result-object v13

    .line 1032
    if-nez v13, :cond_e

    .line 1033
    const-string v0, "Track_GaoDeMap"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "show map bounds null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1034
    return-void

    .line 1036
    :cond_e
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/cgy;->d:Lcom/amap/api/maps/AMap;

    if-nez v0, :cond_f

    .line 1037
    return-void

    .line 1039
    :cond_f
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/cgy;->c:Landroid/content/Context;

    .line 1040
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$dimen;->detail_share_content_viewpager_width:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v0

    float-to-int v0, v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/cgy;->c:Landroid/content/Context;

    .line 1041
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/healthcloud/plugintrack/R$dimen;->detail_share_content_viewpager_height:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v1

    float-to-double v1, v1

    const-wide v3, 0x3fe6666666666666L    # 0.7

    mul-double/2addr v1, v3

    double-to-int v1, v1

    .line 1039
    const/16 v2, 0x14

    invoke-static {v13, v0, v1, v2}, Lcom/amap/api/maps/CameraUpdateFactory;->newLatLngBounds(Lcom/amap/api/maps/model/LatLngBounds;III)Lcom/amap/api/maps/CameraUpdate;

    move-result-object v0

    move-object/from16 v1, p0

    iput-object v0, v1, Lo/cgy;->A:Lcom/amap/api/maps/CameraUpdate;

    .line 1042
    new-instance v0, Lcom/amap/api/maps/model/LatLng;

    iget-object v1, v13, Lcom/amap/api/maps/model/LatLngBounds;->northeast:Lcom/amap/api/maps/model/LatLng;

    iget-wide v1, v1, Lcom/amap/api/maps/model/LatLng;->latitude:D

    iget-object v3, v13, Lcom/amap/api/maps/model/LatLngBounds;->southwest:Lcom/amap/api/maps/model/LatLng;

    iget-wide v3, v3, Lcom/amap/api/maps/model/LatLng;->latitude:D

    add-double/2addr v1, v3

    const-wide/high16 v3, 0x4000000000000000L    # 2.0

    div-double/2addr v1, v3

    iget-object v3, v13, Lcom/amap/api/maps/model/LatLngBounds;->northeast:Lcom/amap/api/maps/model/LatLng;

    iget-wide v3, v3, Lcom/amap/api/maps/model/LatLng;->longitude:D

    iget-object v5, v13, Lcom/amap/api/maps/model/LatLngBounds;->southwest:Lcom/amap/api/maps/model/LatLng;

    iget-wide v5, v5, Lcom/amap/api/maps/model/LatLng;->longitude:D

    add-double/2addr v3, v5

    const-wide/high16 v5, 0x4000000000000000L    # 2.0

    div-double/2addr v3, v5

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/amap/api/maps/model/LatLng;-><init>(DD)V

    invoke-static {v0}, Lcom/amap/api/maps/CameraUpdateFactory;->changeLatLng(Lcom/amap/api/maps/model/LatLng;)Lcom/amap/api/maps/CameraUpdate;

    move-result-object v0

    move-object/from16 v1, p0

    iput-object v0, v1, Lo/cgy;->D:Lcom/amap/api/maps/CameraUpdate;

    .line 1044
    new-instance v0, Lo/cgv;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/cgy;->d:Lcom/amap/api/maps/AMap;

    move-object/from16 v2, p0

    iget-object v2, v2, Lo/cgy;->G:Lcom/amap/api/maps/model/LatLng;

    invoke-direct {v0, v1, v2}, Lo/cgv;-><init>(Lcom/amap/api/maps/AMap;Lcom/amap/api/maps/model/LatLng;)V

    move-object/from16 v1, p0

    iput-object v0, v1, Lo/cgy;->N:Lo/cgv;

    .line 1045
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/cgy;->N:Lo/cgv;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$drawable;->track_detail_anim_marker:I

    invoke-static {v1}, Lcom/amap/api/maps/model/BitmapDescriptorFactory;->fromResource(I)Lcom/amap/api/maps/model/BitmapDescriptor;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/cgv;->a(Lcom/amap/api/maps/model/BitmapDescriptor;)V

    .line 1046
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/cgy;->N:Lo/cgv;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/cgy;->F:Ljava/util/List;

    iget-object v2, v13, Lcom/amap/api/maps/model/LatLngBounds;->northeast:Lcom/amap/api/maps/model/LatLng;

    iget-object v3, v13, Lcom/amap/api/maps/model/LatLngBounds;->southwest:Lcom/amap/api/maps/model/LatLng;

    invoke-static {v2, v3}, Lcom/amap/api/maps/AMapUtils;->calculateLineDistance(Lcom/amap/api/maps/model/LatLng;Lcom/amap/api/maps/model/LatLng;)F

    move-result v2

    invoke-virtual {v0, v1, v2}, Lo/cgv;->a(Ljava/util/List;F)V

    .line 1047
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/cgy;->N:Lo/cgv;

    new-instance v1, Lo/cgy$5;

    move-object/from16 v2, p0

    invoke-direct {v1, v2}, Lo/cgy$5;-><init>(Lo/cgy;)V

    invoke-virtual {v0, v1}, Lo/cgv;->d(Lo/cgv$c;)V

    .line 1071
    invoke-virtual/range {p0 .. p0}, Lo/cgy;->k()V

    .line 1072
    move-object/from16 v0, p0

    invoke-direct {v0, v9, v8}, Lo/cgy;->d(Ljava/util/List;Ljava/util/Map;)V

    .line 1073
    const/4 v0, 0x1

    move-object/from16 v1, p0

    iput-boolean v0, v1, Lo/cgy;->E:Z

    .line 1074
    move-object/from16 v0, p0

    iget-boolean v0, v0, Lo/cgy;->L:Z

    if-eqz v0, :cond_10

    .line 1075
    const/4 v0, 0x0

    move-object/from16 v1, p0

    iput-object v0, v1, Lo/cgy;->d:Lcom/amap/api/maps/AMap;

    .line 1077
    :cond_10
    return-void
.end method

.method static synthetic e(Lo/cgy;Z)Z
    .locals 0

    .line 56
    iput-boolean p1, p0, Lo/cgy;->M:Z

    return p1
.end method

.method static synthetic g(Lo/cgy;)Lcom/amap/api/maps/model/Marker;
    .locals 1

    .line 56
    iget-object v0, p0, Lo/cgy;->k:Lcom/amap/api/maps/model/Marker;

    return-object v0
.end method

.method static synthetic k(Lo/cgy;)Landroid/content/Context;
    .locals 1

    .line 56
    iget-object v0, p0, Lo/cgy;->c:Landroid/content/Context;

    return-object v0
.end method

.method private l()Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/amap/api/maps/model/PolylineOptions;>;"
        }
    .end annotation

    .line 1080
    iget-object v0, p0, Lo/cgy;->F:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/cgy;->F:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1081
    :cond_0
    const-string v0, "Track_GaoDeMap"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "countolylineOptions mAnimalLines is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1082
    const/4 v0, 0x0

    return-object v0

    .line 1084
    :cond_1
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 1085
    iget-object v0, p0, Lo/cgy;->F:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/cgu;

    .line 1086
    invoke-direct {p0, v6}, Lo/cgy;->c(Lo/cgu;)Lcom/amap/api/maps/model/PolylineOptions;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1087
    goto :goto_0

    .line 1088
    :cond_2
    return-object v4
.end method

.method private m()V
    .locals 10

    .line 1679
    const/4 v6, 0x1

    .line 1680
    const/4 v7, 0x0

    :goto_0
    iget-object v0, p0, Lo/cgy;->x:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v7, v0, :cond_1

    .line 1681
    iget-object v0, p0, Lo/cgy;->x:Ljava/util/ArrayList;

    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/cgy$d;

    invoke-static {v0}, Lo/cgy$d;->b(Lo/cgy$d;)Z

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 1682
    iget-object v0, p0, Lo/cgy;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    iget-object v1, p0, Lo/cgy;->x:Ljava/util/ArrayList;

    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/cgy$d;

    invoke-static {v1}, Lo/cgy$d;->e(Lo/cgy$d;)Lcom/amap/api/maps/model/LatLng;

    move-result-object v1

    iget-object v2, p0, Lo/cgy;->x:Ljava/util/ArrayList;

    .line 1683
    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo/cgy$d;

    invoke-static {v2}, Lo/cgy$d;->d(Lo/cgy$d;)I

    move-result v2

    int-to-double v2, v2

    const/4 v4, 0x1

    const/4 v5, 0x0

    invoke-static {v2, v3, v4, v5}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v2

    .line 1682
    invoke-static {v0, v1, v2}, Lo/cdr;->b(Landroid/content/res/Resources;Lcom/amap/api/maps/model/LatLng;Ljava/lang/String;)Lcom/amap/api/maps/model/MarkerOptions;

    move-result-object v8

    .line 1684
    iget-object v0, p0, Lo/cgy;->d:Lcom/amap/api/maps/AMap;

    invoke-virtual {v0, v8}, Lcom/amap/api/maps/AMap;->addMarker(Lcom/amap/api/maps/model/MarkerOptions;)Lcom/amap/api/maps/model/Marker;

    move-result-object v9

    .line 1685
    iget-object v0, p0, Lo/cgy;->r:Ljava/util/ArrayList;

    invoke-virtual {v0, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1680
    :cond_0
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 1688
    :cond_1
    const-string v0, "Track_GaoDeMap"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mMarkersList.size = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/cgy;->r:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1689
    return-void
.end method

.method private n()V
    .locals 3

    .line 1692
    iget-object v0, p0, Lo/cgy;->r:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/amap/api/maps/model/Marker;

    .line 1693
    invoke-virtual {v2}, Lcom/amap/api/maps/model/Marker;->destroy()V

    .line 1694
    goto :goto_0

    .line 1695
    :cond_0
    iget-object v0, p0, Lo/cgy;->r:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 1696
    return-void
.end method

.method private o()V
    .locals 4

    .line 1582
    iget-object v0, p0, Lo/cgy;->d:Lcom/amap/api/maps/AMap;

    if-nez v0, :cond_0

    .line 1583
    const-string v0, "Track_GaoDeMap"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mAMap is null!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1584
    return-void

    .line 1587
    :cond_0
    iget-object v0, p0, Lo/cgy;->d:Lcom/amap/api/maps/AMap;

    new-instance v1, Lo/cgy$9;

    invoke-direct {v1, p0}, Lo/cgy$9;-><init>(Lo/cgy;)V

    invoke-virtual {v0, v1}, Lcom/amap/api/maps/AMap;->setOnCameraChangeListener(Lcom/amap/api/maps/AMap$OnCameraChangeListener;)V

    .line 1624
    return-void
.end method

.method private p()Z
    .locals 4

    .line 213
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iget-wide v2, p0, Lo/cgy;->j:J

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x2710

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method


# virtual methods
.method public a()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Landroid/graphics/PointF;>;"
        }
    .end annotation

    .line 955
    iget-object v0, p0, Lo/cgy;->B:Ljava/util/List;

    return-object v0
.end method

.method public a(Landroid/os/Handler;)V
    .locals 0

    .line 1578
    invoke-direct {p0}, Lo/cgy;->o()V

    .line 1579
    return-void
.end method

.method public a(Z)V
    .locals 5

    .line 875
    iget-boolean v0, p0, Lo/cgy;->E:Z

    if-nez v0, :cond_1

    .line 876
    const-string v0, "Track_GaoDeMap"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startMapAnimal error "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 877
    iget-object v0, p0, Lo/cgy;->J:Lo/chc$d;

    if-eqz v0, :cond_0

    .line 878
    iget-object v0, p0, Lo/cgy;->J:Lo/chc$d;

    invoke-interface {v0}, Lo/chc$d;->b()V

    .line 880
    :cond_0
    return-void

    .line 883
    :cond_1
    iget-object v0, p0, Lo/cgy;->d:Lcom/amap/api/maps/AMap;

    if-nez v0, :cond_2

    .line 884
    return-void

    .line 887
    :cond_2
    if-nez p1, :cond_3

    .line 888
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/cgy;->M:Z

    .line 889
    invoke-virtual {p0}, Lo/cgy;->e()V

    .line 890
    return-void

    .line 893
    :cond_3
    iget-object v0, p0, Lo/cgy;->d:Lcom/amap/api/maps/AMap;

    new-instance v1, Lo/cgy$e;

    invoke-direct {v1, p0}, Lo/cgy$e;-><init>(Lo/cgy;)V

    invoke-virtual {v0, v1}, Lcom/amap/api/maps/AMap;->setOnMapTouchListener(Lcom/amap/api/maps/AMap$OnMapTouchListener;)V

    .line 896
    iget-object v0, p0, Lo/cgy;->G:Lcom/amap/api/maps/model/LatLng;

    iget v1, p0, Lo/cgy;->z:I

    invoke-virtual {p0, v0, v1}, Lo/cgy;->b(Lcom/amap/api/maps/model/LatLng;I)V

    .line 897
    new-instance v4, Lcom/amap/api/maps/model/animation/ScaleAnimation;

    const/4 v0, 0x0

    const/high16 v1, 0x3f800000    # 1.0f

    const/4 v2, 0x0

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-direct {v4, v0, v1, v2, v3}, Lcom/amap/api/maps/model/animation/ScaleAnimation;-><init>(FFFF)V

    .line 898
    const-wide/16 v0, 0x12c

    invoke-virtual {v4, v0, v1}, Lcom/amap/api/maps/model/animation/ScaleAnimation;->setDuration(J)V

    .line 899
    iget-object v0, p0, Lo/cgy;->f:Lcom/amap/api/maps/model/Marker;

    invoke-virtual {v0, v4}, Lcom/amap/api/maps/model/Marker;->setAnimation(Lcom/amap/api/maps/model/animation/Animation;)V

    .line 900
    iget-object v0, p0, Lo/cgy;->f:Lcom/amap/api/maps/model/Marker;

    invoke-virtual {v0}, Lcom/amap/api/maps/model/Marker;->startAnimation()Z

    .line 901
    iget-object v0, p0, Lo/cgy;->f:Lcom/amap/api/maps/model/Marker;

    new-instance v1, Lo/cgy$1;

    invoke-direct {v1, p0}, Lo/cgy$1;-><init>(Lo/cgy;)V

    invoke-virtual {v0, v1}, Lcom/amap/api/maps/model/Marker;->setAnimationListener(Lcom/amap/api/maps/model/animation/Animation$AnimationListener;)V

    .line 914
    return-void
.end method

.method public b()V
    .locals 2

    .line 619
    new-instance v0, Lcom/amap/api/maps/model/PolylineOptions;

    invoke-direct {v0}, Lcom/amap/api/maps/model/PolylineOptions;-><init>()V

    iput-object v0, p0, Lo/cgy;->g:Lcom/amap/api/maps/model/PolylineOptions;

    .line 620
    iget-object v0, p0, Lo/cgy;->g:Lcom/amap/api/maps/model/PolylineOptions;

    iget v1, p0, Lo/cgy;->b:I

    invoke-virtual {v0, v1}, Lcom/amap/api/maps/model/PolylineOptions;->color(I)Lcom/amap/api/maps/model/PolylineOptions;

    move-result-object v0

    .line 621
    const/high16 v1, 0x41700000    # 15.0f

    invoke-virtual {v0, v1}, Lcom/amap/api/maps/model/PolylineOptions;->width(F)Lcom/amap/api/maps/model/PolylineOptions;

    move-result-object v0

    .line 622
    const/high16 v1, 0x41200000    # 10.0f

    invoke-virtual {v0, v1}, Lcom/amap/api/maps/model/PolylineOptions;->zIndex(F)Lcom/amap/api/maps/model/PolylineOptions;

    move-result-object v0

    .line 623
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/amap/api/maps/model/PolylineOptions;->visible(Z)Lcom/amap/api/maps/model/PolylineOptions;

    .line 624
    iget-object v0, p0, Lo/cgy;->g:Lcom/amap/api/maps/model/PolylineOptions;

    invoke-direct {p0, v0}, Lo/cgy;->b(Lcom/amap/api/maps/model/PolylineOptions;)Lcom/amap/api/maps/model/Polyline;

    move-result-object v0

    iput-object v0, p0, Lo/cgy;->l:Lcom/amap/api/maps/model/Polyline;

    .line 625
    iget-object v0, p0, Lo/cgy;->m:Ljava/util/List;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lo/cgy;->m:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 626
    iget-object v0, p0, Lo/cgy;->m:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 628
    :cond_0
    iget-object v0, p0, Lo/cgy;->p:Ljava/util/List;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lo/cgy;->p:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 629
    iget-object v0, p0, Lo/cgy;->p:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 631
    :cond_1
    return-void
.end method

.method public b(IILjava/util/List;Ljava/util/Map;)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IILjava/util/List<Lcom/amap/api/maps/model/LatLng;>;Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Float;>;)V"
        }
    .end annotation

    .line 246
    new-instance v2, Lcom/amap/api/maps/model/PolylineOptions;

    invoke-direct {v2}, Lcom/amap/api/maps/model/PolylineOptions;-><init>()V

    .line 248
    const/high16 v0, 0x41700000    # 15.0f

    invoke-virtual {v2, v0}, Lcom/amap/api/maps/model/PolylineOptions;->width(F)Lcom/amap/api/maps/model/PolylineOptions;

    move-result-object v0

    .line 249
    const/high16 v1, 0x41200000    # 10.0f

    invoke-virtual {v0, v1}, Lcom/amap/api/maps/model/PolylineOptions;->zIndex(F)Lcom/amap/api/maps/model/PolylineOptions;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/amap/api/maps/model/PolylineOptions;->visible(Z)Lcom/amap/api/maps/model/PolylineOptions;

    .line 251
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 252
    iget-boolean v0, p0, Lo/cgy;->P:Z

    if-eqz v0, :cond_3

    .line 253
    if-eqz p4, :cond_0

    .line 254
    invoke-interface {p4}, Ljava/util/Map;->size()I

    move-result v0

    if-eqz v0, :cond_0

    .line 255
    invoke-direct {p0, p4}, Lo/cgy;->b(Ljava/util/Map;)Z

    move-result v0

    if-nez v0, :cond_0

    iget v0, p0, Lo/cgy;->z:I

    const/16 v1, 0x10a

    if-ne v0, v1, :cond_1

    .line 258
    :cond_0
    iget v0, p0, Lo/cgy;->e:I

    invoke-virtual {v2, v0}, Lcom/amap/api/maps/model/PolylineOptions;->color(I)Lcom/amap/api/maps/model/PolylineOptions;

    goto :goto_0

    .line 259
    :cond_1
    invoke-interface {p4}, Ljava/util/Map;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    .line 260
    invoke-direct {p0, p4}, Lo/cgy;->c(Ljava/util/Map;)I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/amap/api/maps/model/PolylineOptions;->color(I)Lcom/amap/api/maps/model/PolylineOptions;

    move-result-object v0

    const/high16 v1, 0x41700000    # 15.0f

    invoke-virtual {v0, v1}, Lcom/amap/api/maps/model/PolylineOptions;->width(F)Lcom/amap/api/maps/model/PolylineOptions;

    goto :goto_0

    .line 263
    :cond_2
    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result v0

    invoke-direct {p0, v0, p4}, Lo/cgy;->a(ILjava/util/Map;)Ljava/util/List;

    move-result-object v3

    goto :goto_0

    .line 266
    :cond_3
    iget v0, p0, Lo/cgy;->b:I

    invoke-virtual {v2, v0}, Lcom/amap/api/maps/model/PolylineOptions;->color(I)Lcom/amap/api/maps/model/PolylineOptions;

    .line 269
    :goto_0
    move-object v4, p3

    .line 271
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v5

    .line 274
    div-int/lit16 v6, v5, 0x9c4

    .line 276
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 279
    const/4 v0, 0x1

    if-le v6, v0, :cond_7

    .line 280
    const/4 v8, 0x0

    :goto_1
    if-ge v8, v5, :cond_6

    .line 282
    rem-int v0, v8, v6

    if-eqz v0, :cond_4

    add-int/lit8 v0, v5, -0x1

    if-ne v8, v0, :cond_5

    .line 283
    :cond_4
    invoke-interface {v4, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/amap/api/maps/model/LatLng;

    invoke-virtual {v2, v0}, Lcom/amap/api/maps/model/PolylineOptions;->add(Lcom/amap/api/maps/model/LatLng;)Lcom/amap/api/maps/model/PolylineOptions;

    .line 286
    add-int v0, v8, p1

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_5

    .line 287
    add-int v0, v8, p1

    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v7, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 280
    :cond_5
    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    :cond_6
    goto :goto_3

    .line 292
    :cond_7
    move v8, p1

    :goto_2
    if-ge v8, p2, :cond_9

    .line 293
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v0

    if-ge v8, v0, :cond_8

    .line 294
    invoke-interface {v3, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v7, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 292
    :cond_8
    add-int/lit8 v8, v8, 0x1

    goto :goto_2

    .line 298
    :cond_9
    invoke-virtual {v2, v4}, Lcom/amap/api/maps/model/PolylineOptions;->addAll(Ljava/lang/Iterable;)Lcom/amap/api/maps/model/PolylineOptions;

    .line 300
    :goto_3
    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v8

    .line 301
    invoke-virtual {v2}, Lcom/amap/api/maps/model/PolylineOptions;->getPoints()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v8, v0, :cond_b

    .line 303
    if-nez v8, :cond_a

    .line 304
    iget v9, p0, Lo/cgy;->b:I

    goto :goto_4

    .line 306
    :cond_a
    add-int/lit8 v0, v8, -0x1

    invoke-interface {v7, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v9

    .line 308
    :goto_4
    const/4 v10, 0x0

    :goto_5
    invoke-virtual {v2}, Lcom/amap/api/maps/model/PolylineOptions;->getPoints()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    sub-int/2addr v0, v8

    if-ge v10, v0, :cond_b

    .line 309
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v7, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 308
    add-int/lit8 v10, v10, 0x1

    goto :goto_5

    .line 313
    :cond_b
    invoke-direct {p0, v2, v7}, Lo/cgy;->e(Lcom/amap/api/maps/model/PolylineOptions;Ljava/util/List;)V

    .line 314
    iget-object v0, p0, Lo/cgy;->d:Lcom/amap/api/maps/AMap;

    invoke-virtual {v0, v2}, Lcom/amap/api/maps/AMap;->addPolyline(Lcom/amap/api/maps/model/PolylineOptions;)Lcom/amap/api/maps/model/Polyline;

    .line 317
    return-void
.end method

.method public b(Lcom/amap/api/maps/model/LatLng;I)V
    .locals 4

    .line 715
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 717
    const-string v0, "Track_GaoDeMap"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "addStartMarker() latlng is null!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 718
    return-void

    .line 720
    :cond_0
    iget-object v0, p0, Lo/cgy;->f:Lcom/amap/api/maps/model/Marker;

    if-eqz v0, :cond_1

    .line 722
    iget-object v0, p0, Lo/cgy;->f:Lcom/amap/api/maps/model/Marker;

    invoke-virtual {v0}, Lcom/amap/api/maps/model/Marker;->remove()V

    .line 725
    :cond_1
    const-string v0, "Track_GaoDeMap"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "addStartMarker() GaoDeMap instance hashcode: "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 726
    iget-object v0, p0, Lo/cgy;->d:Lcom/amap/api/maps/AMap;

    invoke-static {p1}, Lo/cdr;->a(Lcom/amap/api/maps/model/LatLng;)Lo/cgk;

    move-result-object v1

    invoke-static {v0, v1, p2}, Lo/cdr;->e(Lcom/amap/api/maps/AMap;Lo/cgk;I)Lcom/amap/api/maps/model/Marker;

    move-result-object v0

    iput-object v0, p0, Lo/cgy;->f:Lcom/amap/api/maps/model/Marker;

    .line 727
    return-void
.end method

.method public b(Lcom/amap/api/maps/model/LatLng;Lcom/amap/api/maps/model/LatLng;)V
    .locals 5

    .line 579
    const-string v0, "Track_GaoDeMap"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "drawLine<>lastLatLng:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    const-string v2, " currentLatLng:"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 580
    const/4 v0, 0x0

    if-eq v0, p2, :cond_0

    .line 582
    invoke-virtual {p0, p2}, Lo/cgy;->e(Lcom/amap/api/maps/model/LatLng;)V

    .line 585
    :cond_0
    new-instance v4, Lcom/amap/api/maps/model/PolylineOptions;

    invoke-direct {v4}, Lcom/amap/api/maps/model/PolylineOptions;-><init>()V

    .line 586
    iget v0, p0, Lo/cgy;->b:I

    invoke-virtual {v4, v0}, Lcom/amap/api/maps/model/PolylineOptions;->color(I)Lcom/amap/api/maps/model/PolylineOptions;

    move-result-object v0

    .line 587
    const/high16 v1, 0x41700000    # 15.0f

    invoke-virtual {v0, v1}, Lcom/amap/api/maps/model/PolylineOptions;->width(F)Lcom/amap/api/maps/model/PolylineOptions;

    move-result-object v0

    .line 588
    const/high16 v1, 0x41200000    # 10.0f

    invoke-virtual {v0, v1}, Lcom/amap/api/maps/model/PolylineOptions;->zIndex(F)Lcom/amap/api/maps/model/PolylineOptions;

    move-result-object v0

    .line 589
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/amap/api/maps/model/PolylineOptions;->visible(Z)Lcom/amap/api/maps/model/PolylineOptions;

    move-result-object v0

    const/4 v1, 0x2

    new-array v1, v1, [Lcom/amap/api/maps/model/LatLng;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const/4 v2, 0x1

    aput-object p2, v1, v2

    .line 590
    invoke-virtual {v0, v1}, Lcom/amap/api/maps/model/PolylineOptions;->add([Lcom/amap/api/maps/model/LatLng;)Lcom/amap/api/maps/model/PolylineOptions;

    .line 592
    invoke-direct {p0, v4}, Lo/cgy;->b(Lcom/amap/api/maps/model/PolylineOptions;)Lcom/amap/api/maps/model/Polyline;

    .line 593
    return-void
.end method

.method public b(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/cgn;>;)V"
        }
    .end annotation

    .line 231
    iget-object v0, p0, Lo/cgy;->p:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/cgn;

    invoke-virtual {v1}, Lo/cgn;->d()Lo/cgk;

    move-result-object v1

    invoke-static {v1}, Lo/cdr;->b(Lo/cgk;)Lcom/amap/api/maps/model/LatLng;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 233
    iget-boolean v0, p0, Lo/cgy;->u:Z

    if-eqz v0, :cond_1

    .line 234
    iget-object v0, p0, Lo/cgy;->l:Lcom/amap/api/maps/model/Polyline;

    if-eqz v0, :cond_0

    .line 235
    iget-object v0, p0, Lo/cgy;->l:Lcom/amap/api/maps/model/Polyline;

    iget-object v1, p0, Lo/cgy;->p:Ljava/util/List;

    invoke-virtual {v0, v1}, Lcom/amap/api/maps/model/Polyline;->setPoints(Ljava/util/List;)V

    .line 237
    :cond_0
    iget-object v0, p0, Lo/cgy;->p:Ljava/util/List;

    iget-object v1, p0, Lo/cgy;->p:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/amap/api/maps/model/LatLng;

    invoke-virtual {p0, v0}, Lo/cgy;->e(Lcom/amap/api/maps/model/LatLng;)V

    .line 239
    iget-object v0, p0, Lo/cgy;->p:Ljava/util/List;

    iget-object v1, p0, Lo/cgy;->p:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/amap/api/maps/model/LatLng;

    const-wide/16 v1, 0x0

    const/4 v3, 0x0

    invoke-virtual {p0, v0, v1, v2, v3}, Lo/cgy;->d(Lcom/amap/api/maps/model/LatLng;JLcom/amap/api/maps/AMap$CancelableCallback;)V

    .line 242
    :cond_1
    return-void
.end method

.method public b(Z)V
    .locals 6

    .line 1406
    iget-object v0, p0, Lo/cgy;->d:Lcom/amap/api/maps/AMap;

    if-nez v0, :cond_0

    .line 1407
    const-string v0, "Track_GaoDeMap"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setPointToCenterWhole mAmap is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1408
    return-void

    .line 1410
    :cond_0
    iget-object v0, p0, Lo/cgy;->c:Landroid/content/Context;

    const-string v1, "window"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/view/WindowManager;

    .line 1411
    new-instance v5, Landroid/util/DisplayMetrics;

    invoke-direct {v5}, Landroid/util/DisplayMetrics;-><init>()V

    .line 1412
    invoke-interface {v4}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V

    .line 1413
    if-eqz p1, :cond_1

    .line 1414
    iget-object v0, p0, Lo/cgy;->d:Lcom/amap/api/maps/AMap;

    iget v1, v5, Landroid/util/DisplayMetrics;->widthPixels:I

    div-int/lit8 v1, v1, 0x2

    iget v2, v5, Landroid/util/DisplayMetrics;->heightPixels:I

    div-int/lit8 v2, v2, 0x4

    invoke-virtual {v0, v1, v2}, Lcom/amap/api/maps/AMap;->setPointToCenter(II)V

    goto :goto_0

    .line 1416
    :cond_1
    iget-object v0, p0, Lo/cgy;->d:Lcom/amap/api/maps/AMap;

    iget v1, v5, Landroid/util/DisplayMetrics;->widthPixels:I

    div-int/lit8 v1, v1, 0x2

    iget v2, v5, Landroid/util/DisplayMetrics;->heightPixels:I

    mul-int/lit8 v2, v2, 0x2

    div-int/lit8 v2, v2, 0x5

    invoke-virtual {v0, v1, v2}, Lcom/amap/api/maps/AMap;->setPointToCenter(II)V

    .line 1418
    :goto_0
    return-void
.end method

.method public c(Landroid/os/Bundle;ZZ)V
    .locals 4

    .line 1379
    const-string v0, "Track_GaoDeMap"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCreate():"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1380
    iget-object v0, p0, Lo/cgy;->d:Lcom/amap/api/maps/AMap;

    if-nez v0, :cond_0

    .line 1381
    const-string v0, "Track_GaoDeMap"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCreate mAmap is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1382
    return-void

    .line 1385
    :cond_0
    iget-object v0, p0, Lo/cgy;->d:Lcom/amap/api/maps/AMap;

    invoke-virtual {v0}, Lcom/amap/api/maps/AMap;->getUiSettings()Lcom/amap/api/maps/UiSettings;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/amap/api/maps/UiSettings;->setZoomControlsEnabled(Z)V

    .line 1387
    iget-object v0, p0, Lo/cgy;->d:Lcom/amap/api/maps/AMap;

    invoke-virtual {v0}, Lcom/amap/api/maps/AMap;->getUiSettings()Lcom/amap/api/maps/UiSettings;

    move-result-object v0

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lcom/amap/api/maps/UiSettings;->setLogoPosition(I)V

    .line 1389
    iget-object v0, p0, Lo/cgy;->d:Lcom/amap/api/maps/AMap;

    invoke-virtual {v0}, Lcom/amap/api/maps/AMap;->getUiSettings()Lcom/amap/api/maps/UiSettings;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/amap/api/maps/UiSettings;->setMyLocationButtonEnabled(Z)V

    .line 1390
    iget-object v0, p0, Lo/cgy;->d:Lcom/amap/api/maps/AMap;

    invoke-virtual {v0}, Lcom/amap/api/maps/AMap;->getUiSettings()Lcom/amap/api/maps/UiSettings;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/amap/api/maps/UiSettings;->setTiltGesturesEnabled(Z)V

    .line 1392
    if-eqz p2, :cond_1

    .line 1394
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lo/cgy;->b(Z)V

    .line 1400
    :cond_1
    iget-object v0, p0, Lo/cgy;->h:Lcom/amap/api/maps/MapView;

    invoke-virtual {v0, p1}, Lcom/amap/api/maps/MapView;->onCreate(Landroid/os/Bundle;)V

    .line 1401
    return-void
.end method

.method public c(Landroid/os/Handler;Lo/cew;)V
    .locals 2

    .line 1331
    new-instance v0, Lo/cgy$4;

    invoke-direct {v0, p0, p1}, Lo/cgy$4;-><init>(Lo/cgy;Landroid/os/Handler;)V

    iput-object v0, p0, Lo/cgy;->S:Lcom/amap/api/maps/AMap$OnMapScreenShotListener;

    .line 1347
    iget-object v0, p0, Lo/cgy;->d:Lcom/amap/api/maps/AMap;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 1348
    iget-object v0, p0, Lo/cgy;->d:Lcom/amap/api/maps/AMap;

    iget-object v1, p0, Lo/cgy;->S:Lcom/amap/api/maps/AMap$OnMapScreenShotListener;

    invoke-virtual {v0, v1}, Lcom/amap/api/maps/AMap;->getMapScreenShot(Lcom/amap/api/maps/AMap$OnMapScreenShotListener;)V

    .line 1350
    :cond_0
    return-void
.end method

.method public c(Landroid/os/Handler;Lo/cew;Z)V
    .locals 4

    .line 766
    if-nez p2, :cond_0

    .line 767
    const-string v0, "Track_GaoDeMap"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onMapLoaded motiondata is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 768
    return-void

    .line 772
    :cond_0
    invoke-virtual {p2}, Lo/cew;->o()I

    move-result v0

    iput v0, p0, Lo/cgy;->z:I

    .line 773
    iget v0, p0, Lo/cgy;->z:I

    const/16 v1, 0x10a

    if-ne v0, v1, :cond_1

    .line 774
    const/16 v0, 0x31

    const/16 v1, 0xdd

    const/16 v2, 0xfb

    invoke-static {v0, v1, v2}, Landroid/graphics/Color;->rgb(III)I

    move-result v0

    iput v0, p0, Lo/cgy;->e:I

    .line 777
    :cond_1
    if-eqz p3, :cond_2

    .line 778
    invoke-direct {p0, p2}, Lo/cgy;->e(Lo/cew;)V

    goto :goto_0

    .line 780
    :cond_2
    invoke-direct {p0, p2}, Lo/cgy;->d(Lo/cew;)V

    .line 782
    :goto_0
    return-void
.end method

.method public c(Z)V
    .locals 2

    .line 940
    if-eqz p1, :cond_0

    .line 941
    iget-object v0, p0, Lo/cgy;->d:Lcom/amap/api/maps/AMap;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lcom/amap/api/maps/AMap;->setMapType(I)V

    goto :goto_0

    .line 943
    :cond_0
    iget-object v0, p0, Lo/cgy;->d:Lcom/amap/api/maps/AMap;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/amap/api/maps/AMap;->setMapType(I)V

    .line 946
    :goto_0
    return-void
.end method

.method public c()Z
    .locals 1

    .line 918
    iget-boolean v0, p0, Lo/cgy;->K:Z

    return v0
.end method

.method public d()V
    .locals 2

    .line 1138
    iget-object v0, p0, Lo/cgy;->d:Lcom/amap/api/maps/AMap;

    new-instance v1, Lo/cgy$2;

    invoke-direct {v1, p0}, Lo/cgy$2;-><init>(Lo/cgy;)V

    invoke-virtual {v0, v1}, Lcom/amap/api/maps/AMap;->setOnMapLoadedListener(Lcom/amap/api/maps/AMap$OnMapLoadedListener;)V

    .line 1155
    return-void
.end method

.method public d(Lcom/amap/api/maps/model/LatLng;JLcom/amap/api/maps/AMap$CancelableCallback;)V
    .locals 6

    .line 174
    if-nez p1, :cond_0

    .line 175
    return-void

    .line 178
    :cond_0
    const-wide/16 v0, 0x0

    cmp-long v0, p2, v0

    if-nez v0, :cond_1

    .line 179
    const-wide/16 p2, 0x3e8

    .line 182
    :cond_1
    iget-object v0, p0, Lo/cgy;->d:Lcom/amap/api/maps/AMap;

    if-nez v0, :cond_2

    .line 183
    const-string v0, "Track_GaoDeMap"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "animateCamera: mAMap is null!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 184
    return-void

    .line 187
    :cond_2
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iget-wide v2, p0, Lo/cgy;->t:J

    sub-long v4, v0, v2

    .line 189
    iget-boolean v0, p0, Lo/cgy;->o:Z

    if-nez v0, :cond_3

    const-wide/16 v0, 0x7d0

    cmp-long v0, v4, v0

    if-gtz v0, :cond_4

    :cond_3
    invoke-direct {p0}, Lo/cgy;->p()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 190
    :cond_4
    invoke-direct {p0, p1, p2, p3, p4}, Lo/cgy;->b(Lcom/amap/api/maps/model/LatLng;JLcom/amap/api/maps/AMap$CancelableCallback;)V

    .line 192
    :cond_5
    return-void
.end method

.method public d(Z)V
    .locals 0

    .line 1422
    iput-boolean p1, p0, Lo/cgy;->u:Z

    .line 1425
    if-nez p1, :cond_0

    .line 1426
    return-void

    .line 1429
    :cond_0
    invoke-virtual {p0}, Lo/cgy;->f()V

    .line 1436
    return-void
.end method

.method public e()V
    .locals 4

    .line 923
    iget-boolean v0, p0, Lo/cgy;->M:Z

    if-eqz v0, :cond_1

    .line 924
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/cgy;->K:Z

    .line 925
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/cgy;->M:Z

    .line 926
    iget-object v0, p0, Lo/cgy;->N:Lo/cgv;

    invoke-virtual {v0}, Lo/cgv;->b()V

    .line 927
    iget-object v0, p0, Lo/cgy;->G:Lcom/amap/api/maps/model/LatLng;

    iget v1, p0, Lo/cgy;->z:I

    invoke-virtual {p0, v0, v1}, Lo/cgy;->b(Lcom/amap/api/maps/model/LatLng;I)V

    .line 928
    iget-object v0, p0, Lo/cgy;->I:Lcom/amap/api/maps/model/LatLng;

    invoke-virtual {p0, v0}, Lo/cgy;->e(Lcom/amap/api/maps/model/LatLng;)V

    .line 929
    iget-object v0, p0, Lo/cgy;->H:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/amap/api/maps/model/PolylineOptions;

    .line 930
    iget-object v0, p0, Lo/cgy;->d:Lcom/amap/api/maps/AMap;

    invoke-virtual {v0, v3}, Lcom/amap/api/maps/AMap;->addPolyline(Lcom/amap/api/maps/model/PolylineOptions;)Lcom/amap/api/maps/model/Polyline;

    .line 931
    goto :goto_0

    .line 932
    :cond_0
    iget-object v0, p0, Lo/cgy;->J:Lo/chc$d;

    if-eqz v0, :cond_1

    .line 933
    iget-object v0, p0, Lo/cgy;->J:Lo/chc$d;

    invoke-interface {v0}, Lo/chc$d;->b()V

    .line 936
    :cond_1
    return-void
.end method

.method public e(Lcom/amap/api/maps/model/LatLng;)V
    .locals 4

    .line 732
    iget-object v0, p0, Lo/cgy;->i:Lcom/amap/api/maps/model/Marker;

    if-nez v0, :cond_2

    const/4 v0, 0x0

    if-eq v0, p1, :cond_2

    .line 734
    iget-object v0, p0, Lo/cgy;->d:Lcom/amap/api/maps/AMap;

    invoke-static {p1}, Lo/cdr;->a(Lcom/amap/api/maps/model/LatLng;)Lo/cgk;

    move-result-object v1

    invoke-static {v0, v1}, Lo/cdr;->e(Lcom/amap/api/maps/AMap;Lo/cgk;)Lcom/amap/api/maps/model/Marker;

    move-result-object v0

    iput-object v0, p0, Lo/cgy;->k:Lcom/amap/api/maps/model/Marker;

    .line 735
    iget-object v0, p0, Lo/cgy;->k:Lcom/amap/api/maps/model/Marker;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 737
    return-void

    .line 739
    :cond_0
    sget-object v0, Lo/cgy;->n:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_1

    .line 741
    const-string v0, "Track_GaoDeMap"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "addEndMarker() GaoDeMap instance hashcode: "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 742
    iget-object v0, p0, Lo/cgy;->d:Lcom/amap/api/maps/AMap;

    invoke-static {p1}, Lo/cdr;->a(Lcom/amap/api/maps/model/LatLng;)Lo/cgk;

    move-result-object v1

    invoke-static {v0, v1}, Lo/cdr;->d(Lcom/amap/api/maps/AMap;Lo/cgk;)Lcom/amap/api/maps/model/Marker;

    move-result-object v0

    iput-object v0, p0, Lo/cgy;->i:Lcom/amap/api/maps/model/Marker;

    .line 743
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lo/cgy;->b(I)V

    goto :goto_0

    .line 747
    :cond_1
    iget-object v0, p0, Lo/cgy;->k:Lcom/amap/api/maps/model/Marker;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/amap/api/maps/model/Marker;->setVisible(Z)V

    .line 748
    iget-object v0, p0, Lo/cgy;->d:Lcom/amap/api/maps/AMap;

    new-instance v1, Lcom/amap/api/maps/model/MarkerOptions;

    invoke-direct {v1}, Lcom/amap/api/maps/model/MarkerOptions;-><init>()V

    .line 749
    invoke-virtual {v1, p1}, Lcom/amap/api/maps/model/MarkerOptions;->position(Lcom/amap/api/maps/model/LatLng;)Lcom/amap/api/maps/model/MarkerOptions;

    move-result-object v1

    .line 750
    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lcom/amap/api/maps/model/MarkerOptions;->draggable(Z)Lcom/amap/api/maps/model/MarkerOptions;

    move-result-object v1

    .line 751
    const/high16 v2, 0x3f000000    # 0.5f

    const v3, 0x3f666666    # 0.9f

    invoke-virtual {v1, v2, v3}, Lcom/amap/api/maps/model/MarkerOptions;->anchor(FF)Lcom/amap/api/maps/model/MarkerOptions;

    move-result-object v1

    sget v2, Lcom/huawei/healthcloud/plugintrack/R$drawable;->hw_show_map_ending:I

    .line 752
    invoke-static {v2}, Lcom/amap/api/maps/model/BitmapDescriptorFactory;->fromResource(I)Lcom/amap/api/maps/model/BitmapDescriptor;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/amap/api/maps/model/MarkerOptions;->icon(Lcom/amap/api/maps/model/BitmapDescriptor;)Lcom/amap/api/maps/model/MarkerOptions;

    move-result-object v1

    .line 749
    invoke-virtual {v0, v1}, Lcom/amap/api/maps/AMap;->addMarker(Lcom/amap/api/maps/model/MarkerOptions;)Lcom/amap/api/maps/model/Marker;

    move-result-object v0

    iput-object v0, p0, Lo/cgy;->i:Lcom/amap/api/maps/model/Marker;

    goto :goto_0

    .line 756
    :cond_2
    const/4 v0, 0x0

    if-eq v0, p1, :cond_3

    .line 758
    iget-object v0, p0, Lo/cgy;->i:Lcom/amap/api/maps/model/Marker;

    invoke-virtual {v0, p1}, Lcom/amap/api/maps/model/Marker;->setPosition(Lcom/amap/api/maps/model/LatLng;)V

    .line 759
    iget-object v0, p0, Lo/cgy;->k:Lcom/amap/api/maps/model/Marker;

    invoke-virtual {v0, p1}, Lcom/amap/api/maps/model/Marker;->setPosition(Lcom/amap/api/maps/model/LatLng;)V

    .line 761
    :cond_3
    :goto_0
    return-void
.end method

.method public e(Lcom/amap/api/maps/model/LatLng;Lcom/amap/api/maps/model/LatLng;)V
    .locals 5

    .line 599
    const-string v0, "Track_GaoDeMap"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "drawInterrupt<>lastLatLng:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    const-string v2, " currentLatLng:"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 600
    const/4 v0, 0x0

    if-eq v0, p2, :cond_0

    .line 602
    invoke-virtual {p0, p2}, Lo/cgy;->e(Lcom/amap/api/maps/model/LatLng;)V

    .line 605
    :cond_0
    new-instance v4, Lcom/amap/api/maps/model/PolylineOptions;

    invoke-direct {v4}, Lcom/amap/api/maps/model/PolylineOptions;-><init>()V

    .line 606
    sget v0, Lo/cdw;->b:I

    invoke-virtual {v4, v0}, Lcom/amap/api/maps/model/PolylineOptions;->color(I)Lcom/amap/api/maps/model/PolylineOptions;

    move-result-object v0

    .line 607
    const/high16 v1, 0x41700000    # 15.0f

    invoke-virtual {v0, v1}, Lcom/amap/api/maps/model/PolylineOptions;->width(F)Lcom/amap/api/maps/model/PolylineOptions;

    move-result-object v0

    .line 608
    const/high16 v1, 0x41200000    # 10.0f

    invoke-virtual {v0, v1}, Lcom/amap/api/maps/model/PolylineOptions;->zIndex(F)Lcom/amap/api/maps/model/PolylineOptions;

    move-result-object v0

    .line 609
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/amap/api/maps/model/PolylineOptions;->setDottedLine(Z)Lcom/amap/api/maps/model/PolylineOptions;

    move-result-object v0

    .line 610
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/amap/api/maps/model/PolylineOptions;->visible(Z)Lcom/amap/api/maps/model/PolylineOptions;

    move-result-object v0

    const/4 v1, 0x2

    new-array v1, v1, [Lcom/amap/api/maps/model/LatLng;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const/4 v2, 0x1

    aput-object p2, v1, v2

    .line 611
    invoke-virtual {v0, v1}, Lcom/amap/api/maps/model/PolylineOptions;->add([Lcom/amap/api/maps/model/LatLng;)Lcom/amap/api/maps/model/PolylineOptions;

    .line 613
    invoke-direct {p0, v4}, Lo/cgy;->b(Lcom/amap/api/maps/model/PolylineOptions;)Lcom/amap/api/maps/model/Polyline;

    .line 614
    return-void
.end method

.method public e(Lo/chc$d;)V
    .locals 0

    .line 950
    iput-object p1, p0, Lo/cgy;->J:Lo/chc$d;

    .line 951
    return-void
.end method

.method public e(Z)V
    .locals 8

    .line 1531
    iget-object v0, p0, Lo/cgy;->s:Lcom/amap/api/maps/model/LatLng;

    if-nez v0, :cond_0

    .line 1532
    const-string v0, "Track_GaoDeMap"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "No PolygonCenter, no latlng point!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1533
    return-void

    .line 1535
    :cond_0
    iget-object v0, p0, Lo/cgy;->q:Lcom/amap/api/maps/model/Polygon;

    if-eqz v0, :cond_1

    .line 1536
    iget-object v0, p0, Lo/cgy;->q:Lcom/amap/api/maps/model/Polygon;

    invoke-virtual {v0}, Lcom/amap/api/maps/model/Polygon;->remove()V

    .line 1538
    :cond_1
    iget-object v0, p0, Lo/cgy;->d:Lcom/amap/api/maps/AMap;

    if-nez v0, :cond_2

    .line 1539
    return-void

    .line 1541
    :cond_2
    if-eqz p1, :cond_3

    .line 1543
    iget-object v0, p0, Lo/cgy;->d:Lcom/amap/api/maps/AMap;

    new-instance v1, Lcom/amap/api/maps/model/PolygonOptions;

    invoke-direct {v1}, Lcom/amap/api/maps/model/PolygonOptions;-><init>()V

    move-object v2, p0

    iget-object v3, p0, Lo/cgy;->s:Lcom/amap/api/maps/model/LatLng;

    .line 1544
    const-wide/high16 v4, 0x4039000000000000L    # 25.0

    const-wide/high16 v6, 0x4039000000000000L    # 25.0

    invoke-direct/range {v2 .. v7}, Lo/cgy;->d(Lcom/amap/api/maps/model/LatLng;DD)Ljava/util/List;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/amap/api/maps/model/PolygonOptions;->addAll(Ljava/lang/Iterable;)Lcom/amap/api/maps/model/PolygonOptions;

    move-result-object v1

    .line 1545
    const/high16 v2, 0x41100000    # 9.0f

    invoke-virtual {v1, v2}, Lcom/amap/api/maps/model/PolygonOptions;->zIndex(F)Lcom/amap/api/maps/model/PolygonOptions;

    move-result-object v1

    iget-object v2, p0, Lo/cgy;->c:Landroid/content/Context;

    .line 1546
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/huawei/healthcloud/plugintrack/R$color;->hw_show_black_40alpha:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/amap/api/maps/model/PolygonOptions;->fillColor(I)Lcom/amap/api/maps/model/PolygonOptions;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lcom/amap/api/maps/model/PolygonOptions;->strokeColor(I)Lcom/amap/api/maps/model/PolygonOptions;

    move-result-object v1

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-virtual {v1, v2}, Lcom/amap/api/maps/model/PolygonOptions;->strokeWidth(F)Lcom/amap/api/maps/model/PolygonOptions;

    move-result-object v1

    .line 1543
    invoke-virtual {v0, v1}, Lcom/amap/api/maps/AMap;->addPolygon(Lcom/amap/api/maps/model/PolygonOptions;)Lcom/amap/api/maps/model/Polygon;

    move-result-object v0

    iput-object v0, p0, Lo/cgy;->q:Lcom/amap/api/maps/model/Polygon;

    goto :goto_0

    .line 1548
    :cond_3
    iget-object v0, p0, Lo/cgy;->d:Lcom/amap/api/maps/AMap;

    new-instance v1, Lcom/amap/api/maps/model/PolygonOptions;

    invoke-direct {v1}, Lcom/amap/api/maps/model/PolygonOptions;-><init>()V

    move-object v2, p0

    iget-object v3, p0, Lo/cgy;->s:Lcom/amap/api/maps/model/LatLng;

    .line 1549
    const-wide/high16 v4, 0x4039000000000000L    # 25.0

    const-wide/high16 v6, 0x4039000000000000L    # 25.0

    invoke-direct/range {v2 .. v7}, Lo/cgy;->d(Lcom/amap/api/maps/model/LatLng;DD)Ljava/util/List;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/amap/api/maps/model/PolygonOptions;->addAll(Ljava/lang/Iterable;)Lcom/amap/api/maps/model/PolygonOptions;

    move-result-object v1

    .line 1550
    const/high16 v2, 0x41100000    # 9.0f

    invoke-virtual {v1, v2}, Lcom/amap/api/maps/model/PolygonOptions;->zIndex(F)Lcom/amap/api/maps/model/PolygonOptions;

    move-result-object v1

    sget v2, Lo/cdw;->f:I

    .line 1551
    invoke-virtual {v1, v2}, Lcom/amap/api/maps/model/PolygonOptions;->fillColor(I)Lcom/amap/api/maps/model/PolygonOptions;

    move-result-object v1

    .line 1552
    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lcom/amap/api/maps/model/PolygonOptions;->strokeColor(I)Lcom/amap/api/maps/model/PolygonOptions;

    move-result-object v1

    .line 1553
    const/high16 v2, 0x3f800000    # 1.0f

    invoke-virtual {v1, v2}, Lcom/amap/api/maps/model/PolygonOptions;->strokeWidth(F)Lcom/amap/api/maps/model/PolygonOptions;

    move-result-object v1

    .line 1548
    invoke-virtual {v0, v1}, Lcom/amap/api/maps/AMap;->addPolygon(Lcom/amap/api/maps/model/PolygonOptions;)Lcom/amap/api/maps/model/Polygon;

    move-result-object v0

    iput-object v0, p0, Lo/cgy;->q:Lcom/amap/api/maps/model/Polygon;

    .line 1556
    :goto_0
    return-void
.end method

.method public f()V
    .locals 4

    .line 1636
    iget-object v0, p0, Lo/cgy;->p:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-gtz v0, :cond_0

    .line 1637
    return-void

    .line 1640
    :cond_0
    iget-object v0, p0, Lo/cgy;->l:Lcom/amap/api/maps/model/Polyline;

    if-eqz v0, :cond_1

    .line 1641
    iget-object v0, p0, Lo/cgy;->l:Lcom/amap/api/maps/model/Polyline;

    iget-object v1, p0, Lo/cgy;->p:Ljava/util/List;

    invoke-virtual {v0, v1}, Lcom/amap/api/maps/model/Polyline;->setPoints(Ljava/util/List;)V

    .line 1644
    :cond_1
    iget-object v0, p0, Lo/cgy;->p:Ljava/util/List;

    iget-object v1, p0, Lo/cgy;->p:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/amap/api/maps/model/LatLng;

    invoke-virtual {p0, v0}, Lo/cgy;->e(Lcom/amap/api/maps/model/LatLng;)V

    .line 1646
    iget-object v0, p0, Lo/cgy;->p:Ljava/util/List;

    iget-object v1, p0, Lo/cgy;->p:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/amap/api/maps/model/LatLng;

    const-wide/16 v1, 0x0

    const/4 v3, 0x0

    invoke-virtual {p0, v0, v1, v2, v3}, Lo/cgy;->d(Lcom/amap/api/maps/model/LatLng;JLcom/amap/api/maps/AMap$CancelableCallback;)V

    .line 1647
    return-void
.end method

.method public g()V
    .locals 2

    .line 1452
    iget-object v0, p0, Lo/cgy;->h:Lcom/amap/api/maps/MapView;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 1454
    iget-object v0, p0, Lo/cgy;->h:Lcom/amap/api/maps/MapView;

    invoke-virtual {v0}, Lcom/amap/api/maps/MapView;->onPause()V

    .line 1456
    :cond_0
    return-void
.end method

.method public h()V
    .locals 2

    .line 1471
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/cgy;->L:Z

    .line 1472
    iget-object v0, p0, Lo/cgy;->d:Lcom/amap/api/maps/AMap;

    if-eqz v0, :cond_1

    .line 1473
    iget-boolean v0, p0, Lo/cgy;->P:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lo/cgy;->E:Z

    if-eqz v0, :cond_1

    .line 1474
    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cgy;->d:Lcom/amap/api/maps/AMap;

    .line 1477
    :cond_1
    iget-object v0, p0, Lo/cgy;->N:Lo/cgv;

    if-eqz v0, :cond_2

    .line 1478
    iget-object v0, p0, Lo/cgy;->N:Lo/cgv;

    invoke-virtual {v0}, Lo/cgv;->a()V

    .line 1480
    :cond_2
    iget-object v0, p0, Lo/cgy;->h:Lcom/amap/api/maps/MapView;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 1483
    iget-object v0, p0, Lo/cgy;->h:Lcom/amap/api/maps/MapView;

    invoke-virtual {v0}, Lcom/amap/api/maps/MapView;->postInvalidate()V

    .line 1486
    iget-object v0, p0, Lo/cgy;->h:Lcom/amap/api/maps/MapView;

    invoke-virtual {v0}, Lcom/amap/api/maps/MapView;->onDestroy()V

    .line 1488
    :cond_3
    iget-object v0, p0, Lo/cgy;->a:Lo/cbu;

    if-eqz v0, :cond_4

    .line 1489
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cgy;->a:Lo/cbu;

    .line 1491
    :cond_4
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cgy;->J:Lo/chc$d;

    .line 1492
    return-void
.end method

.method public h(Z)V
    .locals 0

    .line 1573
    iput-boolean p1, p0, Lo/cgy;->P:Z

    .line 1574
    return-void
.end method

.method public i()V
    .locals 2

    .line 1442
    iget-object v0, p0, Lo/cgy;->h:Lcom/amap/api/maps/MapView;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 1444
    iget-object v0, p0, Lo/cgy;->h:Lcom/amap/api/maps/MapView;

    invoke-virtual {v0}, Lcom/amap/api/maps/MapView;->onResume()V

    .line 1446
    :cond_0
    return-void
.end method

.method public k()V
    .locals 2

    .line 1628
    iget-object v0, p0, Lo/cgy;->A:Lcom/amap/api/maps/CameraUpdate;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/cgy;->d:Lcom/amap/api/maps/AMap;

    if-eqz v0, :cond_0

    .line 1629
    iget-object v0, p0, Lo/cgy;->d:Lcom/amap/api/maps/AMap;

    iget-object v1, p0, Lo/cgy;->A:Lcom/amap/api/maps/CameraUpdate;

    invoke-virtual {v0, v1}, Lcom/amap/api/maps/AMap;->moveCamera(Lcom/amap/api/maps/CameraUpdate;)V

    .line 1630
    iget-object v0, p0, Lo/cgy;->d:Lcom/amap/api/maps/AMap;

    iget-object v1, p0, Lo/cgy;->D:Lcom/amap/api/maps/CameraUpdate;

    invoke-virtual {v0, v1}, Lcom/amap/api/maps/AMap;->moveCamera(Lcom/amap/api/maps/CameraUpdate;)V

    .line 1632
    :cond_0
    return-void
.end method

.method public k(Z)V
    .locals 0

    .line 1741
    if-eqz p1, :cond_0

    .line 1742
    invoke-direct {p0}, Lo/cgy;->m()V

    goto :goto_0

    .line 1744
    :cond_0
    invoke-direct {p0}, Lo/cgy;->n()V

    .line 1746
    :goto_0
    return-void
.end method
