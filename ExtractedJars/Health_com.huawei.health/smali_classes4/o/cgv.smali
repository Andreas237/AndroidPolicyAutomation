.class public Lo/cgv;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/cgv$d;,
        Lo/cgv$c;,
        Lo/cgv$e;
    }
.end annotation


# instance fields
.field private a:D

.field private b:Lcom/amap/api/maps/AMap;

.field private c:J

.field private d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/cgu;>;"
        }
    .end annotation
.end field

.field private e:Lcom/amap/api/maps/model/Marker;

.field private f:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/util/List<Lcom/amap/api/maps/model/LatLng;>;>;"
        }
    .end annotation
.end field

.field private g:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/util/List<Ljava/util/List<Lcom/amap/api/maps/model/LatLng;>;>;>;"
        }
    .end annotation
.end field

.field private h:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/util/List<Ljava/lang/Long;>;>;"
        }
    .end annotation
.end field

.field private i:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/amap/api/maps/model/Polyline;>;"
        }
    .end annotation
.end field

.field private k:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/util/List<Lo/cgv$d;>;>;"
        }
    .end annotation
.end field

.field private l:Lo/cgv$e;

.field private m:Lo/cgv$c;

.field private n:Z

.field private o:I

.field private p:I


# direct methods
.method public constructor <init>(Lcom/amap/api/maps/AMap;Lcom/amap/api/maps/model/LatLng;)V
    .locals 4

    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/cgv;->d:Ljava/util/List;

    .line 32
    const-wide/16 v0, 0x1388

    iput-wide v0, p0, Lo/cgv;->c:J

    .line 35
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/cgv;->k:Ljava/util/List;

    .line 36
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/cgv;->i:Ljava/util/List;

    .line 37
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/cgv;->g:Ljava/util/List;

    .line 38
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/cgv;->h:Ljava/util/List;

    .line 39
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/cgv;->f:Ljava/util/List;

    .line 40
    const/4 v0, -0x1

    iput v0, p0, Lo/cgv;->o:I

    .line 42
    new-instance v0, Lo/cgv$e;

    invoke-direct {v0, p0}, Lo/cgv$e;-><init>(Lo/cgv;)V

    iput-object v0, p0, Lo/cgv;->l:Lo/cgv$e;

    .line 48
    iput-object p1, p0, Lo/cgv;->b:Lcom/amap/api/maps/AMap;

    .line 49
    iget-object v0, p0, Lo/cgv;->b:Lcom/amap/api/maps/AMap;

    new-instance v1, Lcom/amap/api/maps/model/MarkerOptions;

    invoke-direct {v1}, Lcom/amap/api/maps/model/MarkerOptions;-><init>()V

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lcom/amap/api/maps/model/MarkerOptions;->draggable(Z)Lcom/amap/api/maps/model/MarkerOptions;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lcom/amap/api/maps/model/MarkerOptions;->belowMaskLayer(Z)Lcom/amap/api/maps/model/MarkerOptions;

    move-result-object v1

    invoke-virtual {v1, p2}, Lcom/amap/api/maps/model/MarkerOptions;->position(Lcom/amap/api/maps/model/LatLng;)Lcom/amap/api/maps/model/MarkerOptions;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lcom/amap/api/maps/model/MarkerOptions;->icon(Lcom/amap/api/maps/model/BitmapDescriptor;)Lcom/amap/api/maps/model/MarkerOptions;

    move-result-object v1

    const-string v2, ""

    invoke-virtual {v1, v2}, Lcom/amap/api/maps/model/MarkerOptions;->title(Ljava/lang/String;)Lcom/amap/api/maps/model/MarkerOptions;

    move-result-object v1

    const/high16 v2, 0x3f000000    # 0.5f

    const/high16 v3, 0x3f000000    # 0.5f

    invoke-virtual {v1, v2, v3}, Lcom/amap/api/maps/model/MarkerOptions;->anchor(FF)Lcom/amap/api/maps/model/MarkerOptions;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lcom/amap/api/maps/model/MarkerOptions;->visible(Z)Lcom/amap/api/maps/model/MarkerOptions;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/amap/api/maps/AMap;->addMarker(Lcom/amap/api/maps/model/MarkerOptions;)Lcom/amap/api/maps/model/Marker;

    move-result-object v0

    iput-object v0, p0, Lo/cgv;->e:Lcom/amap/api/maps/model/Marker;

    .line 50
    return-void
.end method

.method private a(D)D
    .locals 4

    .line 487
    const-wide/high16 v0, 0x3fe0000000000000L    # 0.5

    sub-double v0, p1, v0

    const-wide/high16 v2, 0x4000000000000000L    # 2.0

    mul-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->acos(D)D

    move-result-wide v0

    const-wide v2, 0x401921fb54442d18L    # 6.283185307179586

    sub-double v0, v2, v0

    const-wide v2, 0x400921fb54442d18L    # Math.PI

    div-double/2addr v0, v2

    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    sub-double/2addr v0, v2

    double-to-float v0, v0

    float-to-double v0, v0

    return-wide v0
.end method

.method private a(Lcom/amap/api/maps/model/LatLng;Lcom/amap/api/maps/model/LatLng;D)Lcom/amap/api/maps/model/LatLng;
    .locals 10

    .line 361
    iget-wide v0, p1, Lcom/amap/api/maps/model/LatLng;->latitude:D

    iget-wide v2, p2, Lcom/amap/api/maps/model/LatLng;->latitude:D

    iget-wide v4, p1, Lcom/amap/api/maps/model/LatLng;->latitude:D

    sub-double/2addr v2, v4

    mul-double/2addr v2, p3

    add-double v6, v0, v2

    .line 362
    iget-wide v0, p1, Lcom/amap/api/maps/model/LatLng;->longitude:D

    iget-wide v2, p2, Lcom/amap/api/maps/model/LatLng;->longitude:D

    iget-wide v4, p1, Lcom/amap/api/maps/model/LatLng;->longitude:D

    sub-double/2addr v2, v4

    mul-double/2addr v2, p3

    add-double v8, v0, v2

    .line 363
    new-instance v0, Lcom/amap/api/maps/model/LatLng;

    invoke-direct {v0, v6, v7, v8, v9}, Lcom/amap/api/maps/model/LatLng;-><init>(DD)V

    return-object v0
.end method

.method static synthetic a(Lo/cgv;)Ljava/util/List;
    .locals 1

    .line 25
    iget-object v0, p0, Lo/cgv;->g:Ljava/util/List;

    return-object v0
.end method

.method private a(I)V
    .locals 4

    .line 400
    iget-object v0, p0, Lo/cgv;->h:Ljava/util/List;

    iget v1, p0, Lo/cgv;->o:I

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    iget v1, p0, Lo/cgv;->p:I

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    .line 401
    iget-object v0, p0, Lo/cgv;->l:Lo/cgv$e;

    invoke-virtual {v0, p1, v2, v3}, Lo/cgv$e;->sendEmptyMessageDelayed(IJ)Z

    .line 402
    return-void
.end method

.method private a(Lo/cgu;I)V
    .locals 26

    .line 254
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 255
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 256
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 257
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/cgv;->k:Ljava/util/List;

    move/from16 v1, p2

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Ljava/util/List;

    .line 258
    invoke-virtual/range {p1 .. p1}, Lo/cgu;->d()Ljava/util/List;

    move-result-object v9

    .line 259
    const/4 v10, 0x0

    :goto_0
    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-ge v10, v0, :cond_0

    .line 261
    invoke-interface {v8, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/cgv$d;

    move-object/from16 v1, p0

    invoke-direct {v1, v0}, Lo/cgv;->c(Lo/cgv$d;)D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-interface {v7, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 259
    add-int/lit8 v10, v10, 0x1

    goto :goto_0

    .line 264
    :cond_0
    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 265
    invoke-virtual/range {p1 .. p1}, Lo/cgu;->a()Ljava/util/List;

    move-result-object v11

    .line 266
    const/4 v0, 0x0

    invoke-interface {v11, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v10, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 267
    const-wide/high16 v12, -0x4010000000000000L    # -1.0

    .line 268
    new-instance v14, Ljava/util/ArrayList;

    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    .line 269
    const/4 v0, 0x0

    invoke-interface {v9, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v14, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 270
    const/4 v0, 0x0

    invoke-interface {v9, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v15, v0

    check-cast v15, Lcom/amap/api/maps/model/LatLng;

    .line 271
    const/4 v0, 0x0

    invoke-interface {v11, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v16

    .line 272
    const/16 v17, 0x0

    :goto_1
    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v0

    move/from16 v1, v17

    if-ge v1, v0, :cond_7

    .line 273
    move/from16 v0, v17

    invoke-interface {v7, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Double;

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v18

    .line 274
    add-int/lit8 v0, v17, 0x1

    invoke-interface {v11, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v20

    .line 275
    add-int/lit8 v0, v17, 0x1

    invoke-interface {v9, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v21, v0

    check-cast v21, Lcom/amap/api/maps/model/LatLng;

    .line 276
    const-wide/high16 v0, -0x4010000000000000L    # -1.0

    cmpl-double v0, v12, v0

    if-nez v0, :cond_3

    .line 277
    const-wide/high16 v0, 0x403e000000000000L    # 30.0

    cmpl-double v0, v18, v0

    if-lez v0, :cond_2

    .line 278
    const-wide/high16 v0, 0x403e000000000000L    # 30.0

    div-double v0, v18, v0

    double-to-int v0, v0

    add-int/lit8 v22, v0, 0x1

    .line 279
    const/16 v23, 0x1

    :goto_2
    move/from16 v0, v23

    move/from16 v1, v22

    if-gt v0, v1, :cond_1

    .line 280
    move/from16 v0, v17

    invoke-interface {v8, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/cgv$d;

    move-object/from16 v1, p0

    move/from16 v2, v23

    move/from16 v3, v22

    invoke-direct {v1, v2, v3, v0}, Lo/cgv;->d(IILo/cgv$d;)D

    move-result-wide v24

    .line 281
    move-object/from16 v0, p0

    move-object/from16 v1, v21

    move-wide/from16 v2, v24

    invoke-direct {v0, v15, v1, v2, v3}, Lo/cgv;->a(Lcom/amap/api/maps/model/LatLng;Lcom/amap/api/maps/model/LatLng;D)Lcom/amap/api/maps/model/LatLng;

    move-result-object v0

    invoke-interface {v14, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 282
    move-object/from16 v0, p0

    move/from16 v1, v16

    move/from16 v2, v20

    move-wide/from16 v3, v24

    invoke-direct {v0, v1, v2, v3, v4}, Lo/cgv;->d(IID)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v10, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 283
    invoke-interface {v6, v14}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 284
    move-wide/from16 v0, v18

    double-to-long v0, v0

    move/from16 v2, v22

    int-to-long v2, v2

    div-long/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {v5, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 285
    new-instance v14, Ljava/util/ArrayList;

    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    .line 279
    add-int/lit8 v23, v23, 0x1

    goto :goto_2

    .line 287
    :cond_1
    goto/16 :goto_4

    .line 288
    :cond_2
    move-object/from16 v0, v21

    invoke-interface {v14, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 289
    move-wide/from16 v12, v18

    .line 290
    invoke-static/range {v20 .. v20}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v10, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_4

    .line 293
    :cond_3
    const-wide/high16 v0, 0x403e000000000000L    # 30.0

    cmpl-double v0, v18, v0

    if-lez v0, :cond_5

    .line 294
    invoke-interface {v6, v14}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 295
    double-to-long v0, v12

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {v5, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 296
    const-wide/high16 v12, -0x4010000000000000L    # -1.0

    .line 297
    new-instance v14, Ljava/util/ArrayList;

    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    .line 298
    const-wide/high16 v0, 0x403e000000000000L    # 30.0

    div-double v0, v18, v0

    double-to-int v0, v0

    add-int/lit8 v22, v0, 0x1

    .line 299
    const/16 v23, 0x1

    :goto_3
    move/from16 v0, v23

    move/from16 v1, v22

    if-gt v0, v1, :cond_4

    .line 300
    move/from16 v0, v17

    invoke-interface {v8, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/cgv$d;

    move-object/from16 v1, p0

    move/from16 v2, v23

    move/from16 v3, v22

    invoke-direct {v1, v2, v3, v0}, Lo/cgv;->d(IILo/cgv$d;)D

    move-result-wide v24

    .line 301
    move-object/from16 v0, p0

    move-object/from16 v1, v21

    move-wide/from16 v2, v24

    invoke-direct {v0, v15, v1, v2, v3}, Lo/cgv;->a(Lcom/amap/api/maps/model/LatLng;Lcom/amap/api/maps/model/LatLng;D)Lcom/amap/api/maps/model/LatLng;

    move-result-object v0

    invoke-interface {v14, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 302
    move-object/from16 v0, p0

    move/from16 v1, v16

    move/from16 v2, v20

    move-wide/from16 v3, v24

    invoke-direct {v0, v1, v2, v3, v4}, Lo/cgv;->d(IID)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v10, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 303
    invoke-interface {v6, v14}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 304
    move-wide/from16 v0, v18

    double-to-long v0, v0

    move/from16 v2, v22

    int-to-long v2, v2

    div-long/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {v5, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 305
    new-instance v14, Ljava/util/ArrayList;

    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    .line 299
    add-int/lit8 v23, v23, 0x1

    goto :goto_3

    .line 307
    :cond_4
    goto :goto_4

    :cond_5
    add-double v0, v12, v18

    const-wide/high16 v2, 0x403e000000000000L    # 30.0

    cmpl-double v0, v0, v2

    if-lez v0, :cond_6

    .line 308
    invoke-interface {v6, v14}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 309
    double-to-long v0, v12

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {v5, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 310
    new-instance v14, Ljava/util/ArrayList;

    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    .line 311
    move-object/from16 v0, v21

    invoke-interface {v14, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 312
    move-wide/from16 v12, v18

    .line 313
    invoke-static/range {v20 .. v20}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v10, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_4

    .line 315
    :cond_6
    move-object/from16 v0, v21

    invoke-interface {v14, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 316
    add-double v12, v12, v18

    .line 317
    invoke-static/range {v20 .. v20}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v10, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 320
    :goto_4
    move-object/from16 v15, v21

    .line 321
    move/from16 v16, v20

    .line 272
    add-int/lit8 v17, v17, 0x1

    goto/16 :goto_1

    .line 324
    :cond_7
    const-wide/high16 v0, -0x4010000000000000L    # -1.0

    cmpl-double v0, v12, v0

    if-eqz v0, :cond_8

    .line 325
    invoke-interface {v6, v14}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 326
    double-to-long v0, v12

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {v5, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 328
    :cond_8
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/cgv;->i:Ljava/util/List;

    move/from16 v1, p2

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v17, v0

    check-cast v17, Lcom/amap/api/maps/model/Polyline;

    .line 329
    invoke-virtual/range {v17 .. v17}, Lcom/amap/api/maps/model/Polyline;->getOptions()Lcom/amap/api/maps/model/PolylineOptions;

    move-result-object v0

    invoke-virtual {v0, v10}, Lcom/amap/api/maps/model/PolylineOptions;->colorValues(Ljava/util/List;)Lcom/amap/api/maps/model/PolylineOptions;

    move-result-object v0

    move-object/from16 v1, v17

    invoke-virtual {v1, v0}, Lcom/amap/api/maps/model/Polyline;->setOptions(Lcom/amap/api/maps/model/PolylineOptions;)V

    .line 330
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/cgv;->h:Ljava/util/List;

    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 331
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/cgv;->g:Ljava/util/List;

    invoke-interface {v0, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 332
    return-void
.end method

.method static synthetic b(Lo/cgv;)Ljava/util/List;
    .locals 1

    .line 25
    iget-object v0, p0, Lo/cgv;->i:Ljava/util/List;

    return-object v0
.end method

.method private c(Lo/cgv$d;)D
    .locals 4

    .line 248
    iget-wide v0, p1, Lo/cgv$d;->a:D

    iget-wide v2, p0, Lo/cgv;->a:D

    div-double/2addr v0, v2

    invoke-direct {p0, v0, v1}, Lo/cgv;->a(D)D

    move-result-wide v0

    iget-wide v2, p0, Lo/cgv;->c:J

    long-to-double v2, v2

    mul-double/2addr v0, v2

    iput-wide v0, p1, Lo/cgv$d;->e:D

    .line 249
    iget-wide v0, p1, Lo/cgv$d;->a:D

    iget-wide v2, p1, Lo/cgv$d;->d:D

    add-double/2addr v0, v2

    iget-wide v2, p0, Lo/cgv;->a:D

    div-double/2addr v0, v2

    invoke-direct {p0, v0, v1}, Lo/cgv;->a(D)D

    move-result-wide v0

    iget-wide v2, p0, Lo/cgv;->c:J

    long-to-double v2, v2

    mul-double/2addr v0, v2

    iput-wide v0, p1, Lo/cgv$d;->b:D

    .line 250
    iget-wide v0, p1, Lo/cgv$d;->b:D

    iget-wide v2, p1, Lo/cgv$d;->e:D

    sub-double/2addr v0, v2

    return-wide v0
.end method

.method static synthetic c(Lo/cgv;)I
    .locals 1

    .line 25
    iget v0, p0, Lo/cgv;->p:I

    return v0
.end method

.method private c(DF)J
    .locals 6

    .line 134
    float-to-double v0, p3

    cmpg-double v0, p1, v0

    if-gez v0, :cond_0

    .line 135
    const-wide/16 v0, 0x5dc

    return-wide v0

    .line 138
    :cond_0
    float-to-double v0, p3

    div-double v4, p1, v0

    .line 139
    const-wide/high16 v0, 0x401c000000000000L    # 7.0

    cmpl-double v0, v4, v0

    if-lez v0, :cond_1

    .line 140
    const-wide/16 v0, 0x1d4c

    return-wide v0

    .line 142
    :cond_1
    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    sub-double v0, v4, v0

    const-wide v2, 0x408f400000000000L    # 1000.0

    mul-double/2addr v0, v2

    double-to-long v0, v0

    const-wide/16 v2, 0x5dc

    add-long/2addr v0, v2

    return-wide v0
.end method

.method private c(Lo/cgu;I)V
    .locals 15

    .line 218
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 219
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 220
    iget-object v0, p0, Lo/cgv;->k:Ljava/util/List;

    move/from16 v1, p2

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/util/List;

    .line 221
    invoke-virtual/range {p1 .. p1}, Lo/cgu;->d()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/amap/api/maps/model/LatLng;

    .line 222
    invoke-virtual/range {p1 .. p1}, Lo/cgu;->d()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/amap/api/maps/model/LatLng;

    .line 224
    const/4 v0, 0x0

    invoke-interface {v6, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lo/cgv$d;

    .line 225
    invoke-direct {p0, v9}, Lo/cgv;->c(Lo/cgv$d;)D

    move-result-wide v10

    .line 226
    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 227
    invoke-interface {v12, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 228
    const-wide/high16 v0, 0x403e000000000000L    # 30.0

    cmpg-double v0, v10, v0

    if-gtz v0, :cond_0

    .line 229
    invoke-interface {v12, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 230
    invoke-interface {v5, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 231
    double-to-long v0, v10

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 233
    :cond_0
    const-wide/high16 v0, 0x403e000000000000L    # 30.0

    div-double v0, v10, v0

    double-to-int v0, v0

    add-int/lit8 v13, v0, 0x1

    .line 234
    const/4 v14, 0x1

    :goto_0
    if-gt v14, v13, :cond_1

    .line 235
    invoke-direct {p0, v14, v13, v9}, Lo/cgv;->d(IILo/cgv$d;)D

    move-result-wide v0

    invoke-direct {p0, v7, v8, v0, v1}, Lo/cgv;->a(Lcom/amap/api/maps/model/LatLng;Lcom/amap/api/maps/model/LatLng;D)Lcom/amap/api/maps/model/LatLng;

    move-result-object v0

    invoke-interface {v12, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 236
    invoke-interface {v5, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 237
    double-to-long v0, v10

    int-to-long v2, v13

    div-long/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 238
    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 239
    invoke-interface {v12, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 234
    add-int/lit8 v14, v14, 0x1

    goto :goto_0

    .line 243
    :cond_1
    :goto_1
    iget-object v0, p0, Lo/cgv;->h:Ljava/util/List;

    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 244
    iget-object v0, p0, Lo/cgv;->g:Ljava/util/List;

    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 245
    return-void
.end method

.method private d(IILo/cgv$d;)D
    .locals 6

    .line 351
    if-ne p1, p2, :cond_0

    .line 352
    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    return-wide v0

    .line 354
    :cond_0
    iget-wide v0, p3, Lo/cgv$d;->d:D

    const-wide v2, 0x3e45798ee2308c3aL    # 1.0E-8

    cmpg-double v0, v0, v2

    if-gez v0, :cond_1

    .line 355
    int-to-double v0, p1

    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    mul-double/2addr v0, v2

    int-to-double v2, p2

    div-double/2addr v0, v2

    return-wide v0

    .line 357
    :cond_1
    iget-wide v0, p3, Lo/cgv$d;->e:D

    iget-wide v2, p3, Lo/cgv$d;->b:D

    iget-wide v4, p3, Lo/cgv$d;->e:D

    sub-double/2addr v2, v4

    int-to-double v4, p1

    mul-double/2addr v2, v4

    int-to-double v4, p2

    div-double/2addr v2, v4

    add-double/2addr v0, v2

    iget-wide v2, p0, Lo/cgv;->c:J

    long-to-double v2, v2

    div-double/2addr v0, v2

    invoke-direct {p0, v0, v1}, Lo/cgv;->e(D)D

    move-result-wide v0

    iget-wide v2, p0, Lo/cgv;->a:D

    mul-double/2addr v0, v2

    iget-wide v2, p3, Lo/cgv$d;->a:D

    sub-double/2addr v0, v2

    iget-wide v2, p3, Lo/cgv$d;->d:D

    div-double/2addr v0, v2

    return-wide v0
.end method

.method private d(IID)Ljava/lang/Integer;
    .locals 11

    .line 336
    shr-int/lit8 v0, p1, 0x18

    and-int/lit16 v3, v0, 0xff

    .line 337
    shr-int/lit8 v0, p1, 0x10

    and-int/lit16 v4, v0, 0xff

    .line 338
    shr-int/lit8 v0, p1, 0x8

    and-int/lit16 v5, v0, 0xff

    .line 339
    and-int/lit16 v6, p1, 0xff

    .line 340
    shr-int/lit8 v0, p2, 0x18

    and-int/lit16 v7, v0, 0xff

    .line 341
    shr-int/lit8 v0, p2, 0x10

    and-int/lit16 v8, v0, 0xff

    .line 342
    shr-int/lit8 v0, p2, 0x8

    and-int/lit16 v9, v0, 0xff

    .line 343
    and-int/lit16 v10, p2, 0xff

    .line 344
    sub-int v0, v7, v3

    int-to-double v0, v0

    mul-double/2addr v0, p3

    double-to-int v0, v0

    add-int/2addr v0, v3

    shl-int/lit8 v0, v0, 0x18

    sub-int v1, v8, v4

    int-to-double v1, v1

    mul-double/2addr v1, p3

    double-to-int v1, v1

    add-int/2addr v1, v4

    shl-int/lit8 v1, v1, 0x10

    or-int/2addr v0, v1

    sub-int v1, v9, v5

    int-to-double v1, v1

    mul-double/2addr v1, p3

    double-to-int v1, v1

    add-int/2addr v1, v5

    shl-int/lit8 v1, v1, 0x8

    or-int/2addr v0, v1

    sub-int v1, v10, v6

    int-to-double v1, v1

    mul-double/2addr v1, p3

    double-to-int v1, v1

    add-int/2addr v1, v6

    or-int/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method static synthetic d(Lo/cgv;)Z
    .locals 1

    .line 25
    iget-boolean v0, p0, Lo/cgv;->n:Z

    return v0
.end method

.method private e(D)D
    .locals 4

    .line 482
    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    add-double/2addr v0, p1

    const-wide v2, 0x400921fb54442d18L    # Math.PI

    mul-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->cos(D)D

    move-result-wide v0

    const-wide/high16 v2, 0x4000000000000000L    # 2.0

    div-double/2addr v0, v2

    double-to-float v0, v0

    const/high16 v1, 0x3f000000    # 0.5f

    add-float/2addr v0, v1

    float-to-double v0, v0

    return-wide v0
.end method

.method static synthetic e(Lo/cgv;)I
    .locals 1

    .line 25
    iget v0, p0, Lo/cgv;->o:I

    return v0
.end method

.method private e()V
    .locals 3

    .line 382
    const/4 v0, 0x0

    iput v0, p0, Lo/cgv;->p:I

    .line 383
    iget v0, p0, Lo/cgv;->o:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/cgv;->o:I

    .line 384
    iget v0, p0, Lo/cgv;->o:I

    iget-object v1, p0, Lo/cgv;->i:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-lt v0, v1, :cond_0

    .line 385
    iget-object v0, p0, Lo/cgv;->e:Lcom/amap/api/maps/model/Marker;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/amap/api/maps/model/Marker;->setVisible(Z)V

    .line 386
    iget-object v0, p0, Lo/cgv;->m:Lo/cgv$c;

    if-eqz v0, :cond_2

    .line 387
    iget-object v0, p0, Lo/cgv;->m:Lo/cgv$c;

    invoke-interface {v0}, Lo/cgv$c;->c()V

    goto :goto_0

    .line 390
    :cond_0
    iget-object v0, p0, Lo/cgv;->d:Ljava/util/List;

    iget v1, p0, Lo/cgv;->o:I

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lo/cgu;

    .line 391
    invoke-virtual {v2}, Lo/cgu;->b()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 392
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lo/cgv;->a(I)V

    goto :goto_0

    .line 394
    :cond_1
    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lo/cgv;->a(I)V

    .line 397
    :cond_2
    :goto_0
    return-void
.end method

.method private e(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/cgu;>;)V"
        }
    .end annotation

    .line 111
    const/4 v1, 0x0

    .line 112
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/cgu;

    .line 113
    invoke-virtual {v3}, Lo/cgu;->b()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto :goto_1

    .line 115
    :pswitch_0
    invoke-direct {p0, v3, v1}, Lo/cgv;->a(Lo/cgu;I)V

    .line 116
    add-int/lit8 v1, v1, 0x1

    .line 117
    goto :goto_1

    .line 119
    :pswitch_1
    invoke-direct {p0, v3, v1}, Lo/cgv;->c(Lo/cgu;I)V

    .line 120
    add-int/lit8 v1, v1, 0x1

    .line 121
    goto :goto_1

    .line 123
    :pswitch_2
    invoke-direct {p0, v3, v1}, Lo/cgv;->e(Lo/cgu;I)V

    .line 124
    add-int/lit8 v1, v1, 0x1

    .line 125
    .line 129
    :goto_1
    goto :goto_0

    .line 130
    :cond_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method private e(Lo/cgu;I)V
    .locals 19

    .line 147
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 148
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 149
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 150
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/cgv;->k:Ljava/util/List;

    move/from16 v1, p2

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ljava/util/List;

    .line 151
    invoke-virtual/range {p1 .. p1}, Lo/cgu;->d()Ljava/util/List;

    move-result-object v8

    .line 152
    const/4 v9, 0x0

    :goto_0
    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-ge v9, v0, :cond_0

    .line 154
    invoke-interface {v7, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/cgv$d;

    move-object/from16 v1, p0

    invoke-direct {v1, v0}, Lo/cgv;->c(Lo/cgv$d;)D

    move-result-wide v10

    .line 155
    invoke-static {v10, v11}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-interface {v6, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 152
    add-int/lit8 v9, v9, 0x1

    goto :goto_0

    .line 157
    :cond_0
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 158
    const/4 v0, 0x0

    invoke-interface {v8, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v9, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 159
    const/4 v0, 0x0

    invoke-interface {v8, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lcom/amap/api/maps/model/LatLng;

    .line 160
    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 161
    const-wide/16 v0, 0x1

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 162
    invoke-interface {v5, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_5

    .line 164
    :cond_1
    const-wide/high16 v11, -0x4010000000000000L    # -1.0

    .line 165
    const/4 v13, 0x0

    :goto_1
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    if-ge v13, v0, :cond_8

    .line 166
    invoke-interface {v6, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Double;

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v14

    .line 167
    add-int/lit8 v0, v13, 0x1

    invoke-interface {v8, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v16, v0

    check-cast v16, Lcom/amap/api/maps/model/LatLng;

    .line 168
    const-wide/high16 v0, -0x4010000000000000L    # -1.0

    cmpl-double v0, v11, v0

    if-nez v0, :cond_4

    .line 169
    const-wide/high16 v0, 0x403e000000000000L    # 30.0

    cmpl-double v0, v14, v0

    if-lez v0, :cond_3

    .line 170
    const-wide/high16 v0, 0x403e000000000000L    # 30.0

    div-double v0, v14, v0

    double-to-int v0, v0

    add-int/lit8 v17, v0, 0x1

    .line 171
    const/16 v18, 0x1

    :goto_2
    move/from16 v0, v18

    move/from16 v1, v17

    if-gt v0, v1, :cond_2

    .line 172
    invoke-interface {v7, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/cgv$d;

    move-object/from16 v1, p0

    move/from16 v2, v18

    move/from16 v3, v17

    invoke-direct {v1, v2, v3, v0}, Lo/cgv;->d(IILo/cgv$d;)D

    move-result-wide v0

    move-object/from16 v2, p0

    move-object/from16 v3, v16

    invoke-direct {v2, v10, v3, v0, v1}, Lo/cgv;->a(Lcom/amap/api/maps/model/LatLng;Lcom/amap/api/maps/model/LatLng;D)Lcom/amap/api/maps/model/LatLng;

    move-result-object v0

    invoke-interface {v9, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 173
    invoke-interface {v5, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 174
    double-to-long v0, v14

    move/from16 v2, v17

    int-to-long v2, v2

    div-long/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 175
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 171
    add-int/lit8 v18, v18, 0x1

    goto :goto_2

    .line 177
    :cond_2
    goto/16 :goto_4

    .line 178
    :cond_3
    move-object/from16 v0, v16

    invoke-interface {v9, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 179
    move-wide v11, v14

    goto/16 :goto_4

    .line 182
    :cond_4
    const-wide/high16 v0, 0x403e000000000000L    # 30.0

    cmpl-double v0, v14, v0

    if-lez v0, :cond_6

    .line 183
    invoke-interface {v5, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 184
    double-to-long v0, v11

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 185
    const-wide/high16 v11, -0x4010000000000000L    # -1.0

    .line 186
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 187
    const-wide/high16 v0, 0x403e000000000000L    # 30.0

    div-double v0, v14, v0

    double-to-int v0, v0

    add-int/lit8 v17, v0, 0x1

    .line 188
    const/16 v18, 0x1

    :goto_3
    move/from16 v0, v18

    move/from16 v1, v17

    if-gt v0, v1, :cond_5

    .line 189
    invoke-interface {v7, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/cgv$d;

    move-object/from16 v1, p0

    move/from16 v2, v18

    move/from16 v3, v17

    invoke-direct {v1, v2, v3, v0}, Lo/cgv;->d(IILo/cgv$d;)D

    move-result-wide v0

    move-object/from16 v2, p0

    move-object/from16 v3, v16

    invoke-direct {v2, v10, v3, v0, v1}, Lo/cgv;->a(Lcom/amap/api/maps/model/LatLng;Lcom/amap/api/maps/model/LatLng;D)Lcom/amap/api/maps/model/LatLng;

    move-result-object v0

    invoke-interface {v9, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 190
    invoke-interface {v5, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 191
    double-to-long v0, v14

    move/from16 v2, v17

    int-to-long v2, v2

    div-long/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 192
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 188
    add-int/lit8 v18, v18, 0x1

    goto :goto_3

    .line 194
    :cond_5
    goto :goto_4

    :cond_6
    add-double v0, v11, v14

    const-wide/high16 v2, 0x403e000000000000L    # 30.0

    cmpl-double v0, v0, v2

    if-lez v0, :cond_7

    .line 195
    invoke-interface {v5, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 196
    double-to-long v0, v11

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 197
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 198
    move-object/from16 v0, v16

    invoke-interface {v9, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 199
    move-wide v11, v14

    goto :goto_4

    .line 201
    :cond_7
    move-object/from16 v0, v16

    invoke-interface {v9, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 202
    add-double/2addr v11, v14

    .line 205
    :goto_4
    move-object/from16 v10, v16

    .line 165
    add-int/lit8 v13, v13, 0x1

    goto/16 :goto_1

    .line 208
    :cond_8
    const-wide/high16 v0, -0x4010000000000000L    # -1.0

    cmpl-double v0, v11, v0

    if-eqz v0, :cond_9

    .line 209
    invoke-interface {v5, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 210
    double-to-long v0, v11

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 213
    :cond_9
    :goto_5
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/cgv;->h:Ljava/util/List;

    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 214
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/cgv;->g:Ljava/util/List;

    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 215
    return-void
.end method

.method static synthetic e(Lo/cgv;I)V
    .locals 0

    .line 25
    invoke-direct {p0, p1}, Lo/cgv;->a(I)V

    return-void
.end method

.method static synthetic f(Lo/cgv;)V
    .locals 0

    .line 25
    invoke-direct {p0}, Lo/cgv;->e()V

    return-void
.end method

.method static synthetic g(Lo/cgv;)I
    .locals 2

    .line 25
    iget v0, p0, Lo/cgv;->p:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/cgv;->p:I

    return v0
.end method

.method static synthetic h(Lo/cgv;)Lcom/amap/api/maps/model/Marker;
    .locals 1

    .line 25
    iget-object v0, p0, Lo/cgv;->e:Lcom/amap/api/maps/model/Marker;

    return-object v0
.end method

.method static synthetic k(Lo/cgv;)Ljava/util/List;
    .locals 1

    .line 25
    iget-object v0, p0, Lo/cgv;->f:Ljava/util/List;

    return-object v0
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 454
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/cgv;->n:Z

    .line 455
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cgv;->m:Lo/cgv$c;

    .line 456
    iget-object v0, p0, Lo/cgv;->l:Lo/cgv$e;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/cgv$e;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 457
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cgv;->m:Lo/cgv$c;

    .line 458
    return-void
.end method

.method public a(Lcom/amap/api/maps/model/BitmapDescriptor;)V
    .locals 1

    .line 368
    iget-object v0, p0, Lo/cgv;->e:Lcom/amap/api/maps/model/Marker;

    invoke-virtual {v0, p1}, Lcom/amap/api/maps/model/Marker;->setIcon(Lcom/amap/api/maps/model/BitmapDescriptor;)V

    .line 369
    return-void
.end method

.method public a(Ljava/util/List;F)V
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/cgu;>;F)V"
        }
    .end annotation

    .line 53
    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 54
    :cond_0
    const-string v0, "Track_SmoothMarkerUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveData is Empty"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 55
    return-void

    .line 57
    :cond_1
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/cgv;->a:D

    .line 58
    iget-object v0, p0, Lo/cgv;->i:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 59
    iget-object v0, p0, Lo/cgv;->f:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 60
    iget-object v0, p0, Lo/cgv;->g:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 61
    iget-object v0, p0, Lo/cgv;->h:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 62
    iget-object v0, p0, Lo/cgv;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 63
    iget-object v0, p0, Lo/cgv;->k:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 65
    const/4 v4, 0x1

    .line 66
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/cgu;

    .line 67
    const/4 v7, 0x0

    .line 68
    invoke-virtual {v6}, Lo/cgu;->b()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto :goto_1

    .line 70
    :pswitch_0
    new-instance v0, Lcom/amap/api/maps/model/PolylineOptions;

    invoke-direct {v0}, Lcom/amap/api/maps/model/PolylineOptions;-><init>()V

    const/high16 v1, 0x41700000    # 15.0f

    invoke-virtual {v0, v1}, Lcom/amap/api/maps/model/PolylineOptions;->width(F)Lcom/amap/api/maps/model/PolylineOptions;

    move-result-object v0

    const/high16 v1, 0x41200000    # 10.0f

    invoke-virtual {v0, v1}, Lcom/amap/api/maps/model/PolylineOptions;->zIndex(F)Lcom/amap/api/maps/model/PolylineOptions;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/amap/api/maps/model/PolylineOptions;->visible(Z)Lcom/amap/api/maps/model/PolylineOptions;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/amap/api/maps/model/PolylineOptions;->useGradient(Z)Lcom/amap/api/maps/model/PolylineOptions;

    move-result-object v7

    .line 71
    goto :goto_1

    .line 73
    :pswitch_1
    new-instance v0, Lcom/amap/api/maps/model/PolylineOptions;

    invoke-direct {v0}, Lcom/amap/api/maps/model/PolylineOptions;-><init>()V

    sget v1, Lo/cdw;->b:I

    invoke-virtual {v0, v1}, Lcom/amap/api/maps/model/PolylineOptions;->color(I)Lcom/amap/api/maps/model/PolylineOptions;

    move-result-object v0

    const/high16 v1, 0x41700000    # 15.0f

    invoke-virtual {v0, v1}, Lcom/amap/api/maps/model/PolylineOptions;->width(F)Lcom/amap/api/maps/model/PolylineOptions;

    move-result-object v0

    .line 74
    const/high16 v1, 0x41200000    # 10.0f

    invoke-virtual {v0, v1}, Lcom/amap/api/maps/model/PolylineOptions;->zIndex(F)Lcom/amap/api/maps/model/PolylineOptions;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/amap/api/maps/model/PolylineOptions;->setDottedLine(Z)Lcom/amap/api/maps/model/PolylineOptions;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/amap/api/maps/model/PolylineOptions;->visible(Z)Lcom/amap/api/maps/model/PolylineOptions;

    move-result-object v7

    .line 75
    goto :goto_1

    .line 77
    :pswitch_2
    new-instance v0, Lcom/amap/api/maps/model/PolylineOptions;

    invoke-direct {v0}, Lcom/amap/api/maps/model/PolylineOptions;-><init>()V

    const/high16 v1, 0x41700000    # 15.0f

    invoke-virtual {v0, v1}, Lcom/amap/api/maps/model/PolylineOptions;->width(F)Lcom/amap/api/maps/model/PolylineOptions;

    move-result-object v0

    .line 78
    const/high16 v1, 0x41200000    # 10.0f

    invoke-virtual {v0, v1}, Lcom/amap/api/maps/model/PolylineOptions;->zIndex(F)Lcom/amap/api/maps/model/PolylineOptions;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/amap/api/maps/model/PolylineOptions;->visible(Z)Lcom/amap/api/maps/model/PolylineOptions;

    move-result-object v0

    invoke-virtual {v6}, Lo/cgu;->c()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/amap/api/maps/model/PolylineOptions;->color(I)Lcom/amap/api/maps/model/PolylineOptions;

    move-result-object v7

    .line 79
    .line 83
    :goto_1
    if-nez v7, :cond_2

    .line 84
    const-string v0, "Track_SmoothMarkerUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "wrong type"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 85
    goto/16 :goto_0

    .line 87
    :cond_2
    iget-object v0, p0, Lo/cgv;->d:Ljava/util/List;

    invoke-interface {v0, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 88
    iget-object v0, p0, Lo/cgv;->b:Lcom/amap/api/maps/AMap;

    invoke-virtual {v0, v7}, Lcom/amap/api/maps/AMap;->addPolyline(Lcom/amap/api/maps/model/PolylineOptions;)Lcom/amap/api/maps/model/Polyline;

    move-result-object v8

    .line 89
    iget-object v0, p0, Lo/cgv;->i:Ljava/util/List;

    invoke-interface {v0, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 90
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 91
    invoke-virtual {v6}, Lo/cgu;->d()Ljava/util/List;

    move-result-object v10

    .line 92
    const/4 v11, 0x0

    :goto_2
    invoke-interface {v10}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-ge v11, v0, :cond_3

    .line 93
    invoke-interface {v10, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/amap/api/maps/model/LatLng;

    add-int/lit8 v1, v11, 0x1

    invoke-interface {v10, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/amap/api/maps/model/LatLng;

    invoke-static {v0, v1}, Lcom/amap/api/maps/AMapUtils;->calculateLineDistance(Lcom/amap/api/maps/model/LatLng;Lcom/amap/api/maps/model/LatLng;)F

    move-result v0

    float-to-double v12, v0

    .line 94
    new-instance v0, Lo/cgv$d;

    iget-wide v1, p0, Lo/cgv;->a:D

    invoke-direct {v0, v1, v2, v12, v13}, Lo/cgv$d;-><init>(DD)V

    invoke-interface {v9, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 95
    iget-wide v0, p0, Lo/cgv;->a:D

    add-double/2addr v0, v12

    iput-wide v0, p0, Lo/cgv;->a:D

    .line 96
    add-int/lit8 v4, v4, 0x1

    .line 92
    add-int/lit8 v11, v11, 0x1

    goto :goto_2

    .line 98
    :cond_3
    iget-object v0, p0, Lo/cgv;->k:Ljava/util/List;

    invoke-interface {v0, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 99
    iget-object v0, p0, Lo/cgv;->f:Ljava/util/List;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 100
    goto/16 :goto_0

    .line 102
    :cond_4
    iget-wide v0, p0, Lo/cgv;->a:D

    const-wide/16 v2, 0x0

    cmpl-double v0, v0, v2

    if-nez v0, :cond_5

    .line 103
    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    iput-wide v0, p0, Lo/cgv;->a:D

    .line 105
    :cond_5
    iget-wide v0, p0, Lo/cgv;->a:D

    move/from16 v2, p2

    invoke-direct {p0, v0, v1, v2}, Lo/cgv;->c(DF)J

    move-result-wide v0

    iput-wide v0, p0, Lo/cgv;->c:J

    .line 107
    invoke-direct {p0, p1}, Lo/cgv;->e(Ljava/util/List;)V

    .line 108
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public b()V
    .locals 4

    .line 461
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/cgv;->n:Z

    .line 462
    iget-object v0, p0, Lo/cgv;->e:Lcom/amap/api/maps/model/Marker;

    invoke-virtual {v0}, Lcom/amap/api/maps/model/Marker;->remove()V

    .line 463
    iget-object v0, p0, Lo/cgv;->i:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/amap/api/maps/model/Polyline;

    .line 464
    invoke-virtual {v3}, Lcom/amap/api/maps/model/Polyline;->remove()V

    .line 465
    goto :goto_0

    .line 466
    :cond_0
    iget-object v0, p0, Lo/cgv;->l:Lo/cgv$e;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/cgv$e;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 467
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cgv;->m:Lo/cgv$c;

    .line 469
    return-void
.end method

.method public c()V
    .locals 4

    .line 372
    iget-object v0, p0, Lo/cgv;->d:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/cgv;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 373
    :cond_0
    const-string v0, "Track_SmoothMarkerUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startSmoothMove data is Empty"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 374
    return-void

    .line 376
    :cond_1
    iget-object v0, p0, Lo/cgv;->e:Lcom/amap/api/maps/model/Marker;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/amap/api/maps/model/Marker;->setVisible(Z)V

    .line 377
    const/4 v0, -0x1

    iput v0, p0, Lo/cgv;->o:I

    .line 378
    invoke-direct {p0}, Lo/cgv;->e()V

    .line 379
    return-void
.end method

.method public d(Lo/cgv$c;)V
    .locals 0

    .line 472
    iput-object p1, p0, Lo/cgv;->m:Lo/cgv$c;

    .line 473
    return-void
.end method
