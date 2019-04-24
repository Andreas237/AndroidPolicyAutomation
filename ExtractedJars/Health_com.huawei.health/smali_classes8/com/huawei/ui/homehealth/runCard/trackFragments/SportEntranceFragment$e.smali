.class Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$e;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "e"
.end annotation


# instance fields
.field private a:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lcom/amap/api/maps/model/BitmapDescriptor;>;"
        }
    .end annotation
.end field

.field private b:I

.field private c:Lcom/amap/api/maps/model/LatLng;

.field private d:I

.field final synthetic e:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;

.field private h:Ljava/lang/Runnable;


# direct methods
.method public constructor <init>(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;)V
    .locals 2

    .line 1396
    iput-object p1, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$e;->e:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 1391
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$e;->d:I

    .line 1424
    new-instance v0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$e$3;

    invoke-direct {v0, p0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$e$3;-><init>(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$e;)V

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$e;->h:Ljava/lang/Runnable;

    .line 1397
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$e;->a:Ljava/util/ArrayList;

    .line 1398
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$e;->a:Ljava/util/ArrayList;

    sget v1, Lcom/huawei/ui/homehealth/R$drawable;->track_setting_sport_map_marker_00:I

    invoke-static {v1}, Lcom/amap/api/maps/model/BitmapDescriptorFactory;->fromResource(I)Lcom/amap/api/maps/model/BitmapDescriptor;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1399
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$e;->a:Ljava/util/ArrayList;

    sget v1, Lcom/huawei/ui/homehealth/R$drawable;->track_setting_sport_map_marker_00:I

    invoke-static {v1}, Lcom/amap/api/maps/model/BitmapDescriptorFactory;->fromResource(I)Lcom/amap/api/maps/model/BitmapDescriptor;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1400
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$e;->a:Ljava/util/ArrayList;

    sget v1, Lcom/huawei/ui/homehealth/R$drawable;->track_setting_sport_map_marker_00:I

    invoke-static {v1}, Lcom/amap/api/maps/model/BitmapDescriptorFactory;->fromResource(I)Lcom/amap/api/maps/model/BitmapDescriptor;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1401
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$e;->a:Ljava/util/ArrayList;

    sget v1, Lcom/huawei/ui/homehealth/R$drawable;->track_setting_sport_map_marker_00:I

    invoke-static {v1}, Lcom/amap/api/maps/model/BitmapDescriptorFactory;->fromResource(I)Lcom/amap/api/maps/model/BitmapDescriptor;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1402
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$e;->a:Ljava/util/ArrayList;

    sget v1, Lcom/huawei/ui/homehealth/R$drawable;->track_setting_sport_map_marker_00:I

    invoke-static {v1}, Lcom/amap/api/maps/model/BitmapDescriptorFactory;->fromResource(I)Lcom/amap/api/maps/model/BitmapDescriptor;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1403
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$e;->a:Ljava/util/ArrayList;

    sget v1, Lcom/huawei/ui/homehealth/R$drawable;->track_setting_sport_map_marker_00:I

    invoke-static {v1}, Lcom/amap/api/maps/model/BitmapDescriptorFactory;->fromResource(I)Lcom/amap/api/maps/model/BitmapDescriptor;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1404
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$e;->a:Ljava/util/ArrayList;

    sget v1, Lcom/huawei/ui/homehealth/R$drawable;->track_setting_sport_map_marker_00:I

    invoke-static {v1}, Lcom/amap/api/maps/model/BitmapDescriptorFactory;->fromResource(I)Lcom/amap/api/maps/model/BitmapDescriptor;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1405
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$e;->a:Ljava/util/ArrayList;

    sget v1, Lcom/huawei/ui/homehealth/R$drawable;->track_setting_sport_map_marker_00:I

    invoke-static {v1}, Lcom/amap/api/maps/model/BitmapDescriptorFactory;->fromResource(I)Lcom/amap/api/maps/model/BitmapDescriptor;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1406
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$e;->a:Ljava/util/ArrayList;

    sget v1, Lcom/huawei/ui/homehealth/R$drawable;->track_setting_sport_map_marker_00:I

    invoke-static {v1}, Lcom/amap/api/maps/model/BitmapDescriptorFactory;->fromResource(I)Lcom/amap/api/maps/model/BitmapDescriptor;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1407
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$e;->a:Ljava/util/ArrayList;

    sget v1, Lcom/huawei/ui/homehealth/R$drawable;->track_setting_sport_map_marker_00:I

    invoke-static {v1}, Lcom/amap/api/maps/model/BitmapDescriptorFactory;->fromResource(I)Lcom/amap/api/maps/model/BitmapDescriptor;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1408
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$e;->a:Ljava/util/ArrayList;

    sget v1, Lcom/huawei/ui/homehealth/R$drawable;->track_setting_sport_map_marker_00:I

    invoke-static {v1}, Lcom/amap/api/maps/model/BitmapDescriptorFactory;->fromResource(I)Lcom/amap/api/maps/model/BitmapDescriptor;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1409
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$e;->a:Ljava/util/ArrayList;

    sget v1, Lcom/huawei/ui/homehealth/R$drawable;->track_setting_sport_map_marker_22:I

    invoke-static {v1}, Lcom/amap/api/maps/model/BitmapDescriptorFactory;->fromResource(I)Lcom/amap/api/maps/model/BitmapDescriptor;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1410
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$e;->a:Ljava/util/ArrayList;

    sget v1, Lcom/huawei/ui/homehealth/R$drawable;->track_setting_sport_map_marker_23:I

    invoke-static {v1}, Lcom/amap/api/maps/model/BitmapDescriptorFactory;->fromResource(I)Lcom/amap/api/maps/model/BitmapDescriptor;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1411
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$e;->a:Ljava/util/ArrayList;

    sget v1, Lcom/huawei/ui/homehealth/R$drawable;->track_setting_sport_map_marker_24:I

    invoke-static {v1}, Lcom/amap/api/maps/model/BitmapDescriptorFactory;->fromResource(I)Lcom/amap/api/maps/model/BitmapDescriptor;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1412
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$e;->a:Ljava/util/ArrayList;

    sget v1, Lcom/huawei/ui/homehealth/R$drawable;->track_setting_sport_map_marker_25:I

    invoke-static {v1}, Lcom/amap/api/maps/model/BitmapDescriptorFactory;->fromResource(I)Lcom/amap/api/maps/model/BitmapDescriptor;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1413
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$e;->a:Ljava/util/ArrayList;

    sget v1, Lcom/huawei/ui/homehealth/R$drawable;->track_setting_sport_map_marker_26:I

    invoke-static {v1}, Lcom/amap/api/maps/model/BitmapDescriptorFactory;->fromResource(I)Lcom/amap/api/maps/model/BitmapDescriptor;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1414
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$e;->a:Ljava/util/ArrayList;

    sget v1, Lcom/huawei/ui/homehealth/R$drawable;->track_setting_sport_map_marker_28:I

    invoke-static {v1}, Lcom/amap/api/maps/model/BitmapDescriptorFactory;->fromResource(I)Lcom/amap/api/maps/model/BitmapDescriptor;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1415
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$e;->a:Ljava/util/ArrayList;

    sget v1, Lcom/huawei/ui/homehealth/R$drawable;->track_setting_sport_map_marker_29:I

    invoke-static {v1}, Lcom/amap/api/maps/model/BitmapDescriptorFactory;->fromResource(I)Lcom/amap/api/maps/model/BitmapDescriptor;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1416
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$e;->a:Ljava/util/ArrayList;

    sget v1, Lcom/huawei/ui/homehealth/R$drawable;->track_setting_sport_map_marker_30:I

    invoke-static {v1}, Lcom/amap/api/maps/model/BitmapDescriptorFactory;->fromResource(I)Lcom/amap/api/maps/model/BitmapDescriptor;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1417
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$e;->a:Ljava/util/ArrayList;

    sget v1, Lcom/huawei/ui/homehealth/R$drawable;->track_setting_sport_map_marker_31:I

    invoke-static {v1}, Lcom/amap/api/maps/model/BitmapDescriptorFactory;->fromResource(I)Lcom/amap/api/maps/model/BitmapDescriptor;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1418
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$e;->a:Ljava/util/ArrayList;

    sget v1, Lcom/huawei/ui/homehealth/R$drawable;->track_setting_sport_map_marker_32:I

    invoke-static {v1}, Lcom/amap/api/maps/model/BitmapDescriptorFactory;->fromResource(I)Lcom/amap/api/maps/model/BitmapDescriptor;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1419
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$e;->a:Ljava/util/ArrayList;

    sget v1, Lcom/huawei/ui/homehealth/R$drawable;->track_setting_sport_map_marker_33:I

    invoke-static {v1}, Lcom/amap/api/maps/model/BitmapDescriptorFactory;->fromResource(I)Lcom/amap/api/maps/model/BitmapDescriptor;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1420
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$e;->a:Ljava/util/ArrayList;

    sget v1, Lcom/huawei/ui/homehealth/R$drawable;->track_setting_sport_map_marker_00:I

    invoke-static {v1}, Lcom/amap/api/maps/model/BitmapDescriptorFactory;->fromResource(I)Lcom/amap/api/maps/model/BitmapDescriptor;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1421
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$e;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$e;->b:I

    .line 1422
    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$e;)Ljava/util/ArrayList;
    .locals 1

    .line 1388
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$e;->a:Ljava/util/ArrayList;

    return-object v0
.end method

.method static synthetic b(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$e;)I
    .locals 1

    .line 1388
    iget v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$e;->d:I

    return v0
.end method

.method static synthetic d(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$e;)Lcom/amap/api/maps/model/LatLng;
    .locals 1

    .line 1388
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$e;->c:Lcom/amap/api/maps/model/LatLng;

    return-object v0
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 4

    .line 1441
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 1442
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    .line 1444
    :sswitch_0
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lcom/amap/api/maps/model/LatLng;

    .line 1445
    if-eqz v3, :cond_2

    .line 1446
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$e;->c:Lcom/amap/api/maps/model/LatLng;

    if-nez v0, :cond_0

    .line 1448
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$e;->sendEmptyMessage(I)Z

    .line 1450
    :cond_0
    iput-object v3, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$e;->c:Lcom/amap/api/maps/model/LatLng;

    goto :goto_0

    .line 1454
    :sswitch_1
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$e;->e:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->p(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;)Landroid/app/Activity;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$e;->e:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->l(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;)Lcom/amap/api/maps/AMap;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$e;->e:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;

    invoke-virtual {v0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->isAdded()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1455
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$e;->e:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->p(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;)Landroid/app/Activity;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$e;->h:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 1457
    :cond_1
    iget v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$e;->d:I

    add-int/lit8 v0, v0, 0x1

    iget v1, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$e;->b:I

    rem-int/2addr v0, v1

    iput v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$e;->d:I

    .line 1458
    const/4 v0, 0x1

    const-wide/16 v1, 0x78

    invoke-virtual {p0, v0, v1, v2}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$e;->sendEmptyMessageDelayed(IJ)Z

    .line 1459
    .line 1463
    :cond_2
    :goto_0
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x1 -> :sswitch_1
    .end sparse-switch
.end method
