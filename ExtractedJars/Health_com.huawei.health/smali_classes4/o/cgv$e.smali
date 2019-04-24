.class Lo/cgv$e;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/cgv;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "e"
.end annotation


# instance fields
.field c:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lo/cgv;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lo/cgv;)V
    .locals 1

    .line 408
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {p0, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 409
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lo/cgv$e;->c:Ljava/lang/ref/WeakReference;

    .line 410
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 11

    .line 414
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 415
    iget-object v0, p0, Lo/cgv$e;->c:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/cgv;

    .line 416
    if-eqz v4, :cond_0

    invoke-static {v4}, Lo/cgv;->d(Lo/cgv;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 417
    :cond_0
    return-void

    .line 419
    :cond_1
    invoke-static {v4}, Lo/cgv;->b(Lo/cgv;)Ljava/util/List;

    move-result-object v0

    invoke-static {v4}, Lo/cgv;->e(Lo/cgv;)I

    move-result v1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/amap/api/maps/model/Polyline;

    .line 420
    invoke-static {v4}, Lo/cgv;->a(Lo/cgv;)Ljava/util/List;

    move-result-object v0

    invoke-static {v4}, Lo/cgv;->e(Lo/cgv;)I

    move-result v1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/util/List;

    .line 421
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v7

    .line 422
    invoke-static {v4}, Lo/cgv;->c(Lo/cgv;)I

    move-result v0

    invoke-interface {v6, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Ljava/util/List;

    .line 423
    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-interface {v8, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lcom/amap/api/maps/model/LatLng;

    .line 424
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    .line 426
    :sswitch_0
    invoke-static {v4}, Lo/cgv;->k(Lo/cgv;)Ljava/util/List;

    move-result-object v0

    invoke-static {v4}, Lo/cgv;->e(Lo/cgv;)I

    move-result v1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Ljava/util/List;

    .line 427
    invoke-interface {v10, v8}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 428
    invoke-virtual {v5, v10}, Lcom/amap/api/maps/model/Polyline;->setPoints(Ljava/util/List;)V

    .line 429
    invoke-static {v4}, Lo/cgv;->h(Lo/cgv;)Lcom/amap/api/maps/model/Marker;

    move-result-object v0

    invoke-virtual {v0, v9}, Lcom/amap/api/maps/model/Marker;->setPosition(Lcom/amap/api/maps/model/LatLng;)V

    .line 430
    invoke-static {v4}, Lo/cgv;->g(Lo/cgv;)I

    move-result v0

    if-lt v0, v7, :cond_2

    .line 431
    invoke-static {v4}, Lo/cgv;->f(Lo/cgv;)V

    goto :goto_1

    .line 433
    :cond_2
    const/4 v0, 0x2

    invoke-static {v4, v0}, Lo/cgv;->e(Lo/cgv;I)V

    .line 435
    goto :goto_1

    .line 437
    :sswitch_1
    invoke-virtual {v5, v8}, Lcom/amap/api/maps/model/Polyline;->setPoints(Ljava/util/List;)V

    .line 438
    invoke-static {v4}, Lo/cgv;->h(Lo/cgv;)Lcom/amap/api/maps/model/Marker;

    move-result-object v0

    invoke-virtual {v0, v9}, Lcom/amap/api/maps/model/Marker;->setPosition(Lcom/amap/api/maps/model/LatLng;)V

    .line 439
    invoke-static {v4}, Lo/cgv;->g(Lo/cgv;)I

    move-result v0

    if-lt v0, v7, :cond_3

    .line 440
    invoke-static {v4}, Lo/cgv;->f(Lo/cgv;)V

    goto :goto_1

    .line 442
    :cond_3
    const/4 v0, 0x1

    invoke-static {v4, v0}, Lo/cgv;->e(Lo/cgv;I)V

    .line 444
    goto :goto_1

    .line 446
    :goto_0
    const-string v0, "Track_SmoothMarkerUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "wrong handleMessage type"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 450
    :goto_1
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_1
        0x2 -> :sswitch_0
    .end sparse-switch
.end method
