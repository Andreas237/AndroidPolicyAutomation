.class Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$c;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "c"
.end annotation


# instance fields
.field private a:I

.field private b:I

.field private c:Lcom/google/android/gms/maps/model/LatLng;

.field private d:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lcom/google/android/gms/maps/model/BitmapDescriptor;>;"
        }
    .end annotation
.end field

.field final synthetic e:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;


# direct methods
.method public constructor <init>(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;)V
    .locals 2

    .line 1317
    iput-object p1, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$c;->e:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 1312
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$c;->a:I

    .line 1318
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$c;->d:Ljava/util/ArrayList;

    .line 1319
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$c;->d:Ljava/util/ArrayList;

    sget v1, Lcom/huawei/ui/homehealth/R$drawable;->track_setting_sport_map_marker_00:I

    invoke-static {v1}, Lcom/google/android/gms/maps/model/BitmapDescriptorFactory;->fromResource(I)Lcom/google/android/gms/maps/model/BitmapDescriptor;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1320
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$c;->d:Ljava/util/ArrayList;

    sget v1, Lcom/huawei/ui/homehealth/R$drawable;->track_setting_sport_map_marker_00:I

    invoke-static {v1}, Lcom/google/android/gms/maps/model/BitmapDescriptorFactory;->fromResource(I)Lcom/google/android/gms/maps/model/BitmapDescriptor;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1321
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$c;->d:Ljava/util/ArrayList;

    sget v1, Lcom/huawei/ui/homehealth/R$drawable;->track_setting_sport_map_marker_00:I

    invoke-static {v1}, Lcom/google/android/gms/maps/model/BitmapDescriptorFactory;->fromResource(I)Lcom/google/android/gms/maps/model/BitmapDescriptor;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1322
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$c;->d:Ljava/util/ArrayList;

    sget v1, Lcom/huawei/ui/homehealth/R$drawable;->track_setting_sport_map_marker_00:I

    invoke-static {v1}, Lcom/google/android/gms/maps/model/BitmapDescriptorFactory;->fromResource(I)Lcom/google/android/gms/maps/model/BitmapDescriptor;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1323
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$c;->d:Ljava/util/ArrayList;

    sget v1, Lcom/huawei/ui/homehealth/R$drawable;->track_setting_sport_map_marker_00:I

    invoke-static {v1}, Lcom/google/android/gms/maps/model/BitmapDescriptorFactory;->fromResource(I)Lcom/google/android/gms/maps/model/BitmapDescriptor;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1324
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$c;->d:Ljava/util/ArrayList;

    sget v1, Lcom/huawei/ui/homehealth/R$drawable;->track_setting_sport_map_marker_00:I

    invoke-static {v1}, Lcom/google/android/gms/maps/model/BitmapDescriptorFactory;->fromResource(I)Lcom/google/android/gms/maps/model/BitmapDescriptor;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1325
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$c;->d:Ljava/util/ArrayList;

    sget v1, Lcom/huawei/ui/homehealth/R$drawable;->track_setting_sport_map_marker_00:I

    invoke-static {v1}, Lcom/google/android/gms/maps/model/BitmapDescriptorFactory;->fromResource(I)Lcom/google/android/gms/maps/model/BitmapDescriptor;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1326
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$c;->d:Ljava/util/ArrayList;

    sget v1, Lcom/huawei/ui/homehealth/R$drawable;->track_setting_sport_map_marker_00:I

    invoke-static {v1}, Lcom/google/android/gms/maps/model/BitmapDescriptorFactory;->fromResource(I)Lcom/google/android/gms/maps/model/BitmapDescriptor;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1327
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$c;->d:Ljava/util/ArrayList;

    sget v1, Lcom/huawei/ui/homehealth/R$drawable;->track_setting_sport_map_marker_00:I

    invoke-static {v1}, Lcom/google/android/gms/maps/model/BitmapDescriptorFactory;->fromResource(I)Lcom/google/android/gms/maps/model/BitmapDescriptor;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1328
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$c;->d:Ljava/util/ArrayList;

    sget v1, Lcom/huawei/ui/homehealth/R$drawable;->track_setting_sport_map_marker_00:I

    invoke-static {v1}, Lcom/google/android/gms/maps/model/BitmapDescriptorFactory;->fromResource(I)Lcom/google/android/gms/maps/model/BitmapDescriptor;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1329
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$c;->d:Ljava/util/ArrayList;

    sget v1, Lcom/huawei/ui/homehealth/R$drawable;->track_setting_sport_map_marker_00:I

    invoke-static {v1}, Lcom/google/android/gms/maps/model/BitmapDescriptorFactory;->fromResource(I)Lcom/google/android/gms/maps/model/BitmapDescriptor;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1330
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$c;->d:Ljava/util/ArrayList;

    sget v1, Lcom/huawei/ui/homehealth/R$drawable;->track_setting_sport_map_marker_22:I

    invoke-static {v1}, Lcom/google/android/gms/maps/model/BitmapDescriptorFactory;->fromResource(I)Lcom/google/android/gms/maps/model/BitmapDescriptor;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1331
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$c;->d:Ljava/util/ArrayList;

    sget v1, Lcom/huawei/ui/homehealth/R$drawable;->track_setting_sport_map_marker_23:I

    invoke-static {v1}, Lcom/google/android/gms/maps/model/BitmapDescriptorFactory;->fromResource(I)Lcom/google/android/gms/maps/model/BitmapDescriptor;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1332
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$c;->d:Ljava/util/ArrayList;

    sget v1, Lcom/huawei/ui/homehealth/R$drawable;->track_setting_sport_map_marker_24:I

    invoke-static {v1}, Lcom/google/android/gms/maps/model/BitmapDescriptorFactory;->fromResource(I)Lcom/google/android/gms/maps/model/BitmapDescriptor;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1333
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$c;->d:Ljava/util/ArrayList;

    sget v1, Lcom/huawei/ui/homehealth/R$drawable;->track_setting_sport_map_marker_25:I

    invoke-static {v1}, Lcom/google/android/gms/maps/model/BitmapDescriptorFactory;->fromResource(I)Lcom/google/android/gms/maps/model/BitmapDescriptor;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1334
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$c;->d:Ljava/util/ArrayList;

    sget v1, Lcom/huawei/ui/homehealth/R$drawable;->track_setting_sport_map_marker_26:I

    invoke-static {v1}, Lcom/google/android/gms/maps/model/BitmapDescriptorFactory;->fromResource(I)Lcom/google/android/gms/maps/model/BitmapDescriptor;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1335
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$c;->d:Ljava/util/ArrayList;

    sget v1, Lcom/huawei/ui/homehealth/R$drawable;->track_setting_sport_map_marker_27:I

    invoke-static {v1}, Lcom/google/android/gms/maps/model/BitmapDescriptorFactory;->fromResource(I)Lcom/google/android/gms/maps/model/BitmapDescriptor;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1336
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$c;->d:Ljava/util/ArrayList;

    sget v1, Lcom/huawei/ui/homehealth/R$drawable;->track_setting_sport_map_marker_28:I

    invoke-static {v1}, Lcom/google/android/gms/maps/model/BitmapDescriptorFactory;->fromResource(I)Lcom/google/android/gms/maps/model/BitmapDescriptor;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1337
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$c;->d:Ljava/util/ArrayList;

    sget v1, Lcom/huawei/ui/homehealth/R$drawable;->track_setting_sport_map_marker_29:I

    invoke-static {v1}, Lcom/google/android/gms/maps/model/BitmapDescriptorFactory;->fromResource(I)Lcom/google/android/gms/maps/model/BitmapDescriptor;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1338
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$c;->d:Ljava/util/ArrayList;

    sget v1, Lcom/huawei/ui/homehealth/R$drawable;->track_setting_sport_map_marker_30:I

    invoke-static {v1}, Lcom/google/android/gms/maps/model/BitmapDescriptorFactory;->fromResource(I)Lcom/google/android/gms/maps/model/BitmapDescriptor;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1339
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$c;->d:Ljava/util/ArrayList;

    sget v1, Lcom/huawei/ui/homehealth/R$drawable;->track_setting_sport_map_marker_31:I

    invoke-static {v1}, Lcom/google/android/gms/maps/model/BitmapDescriptorFactory;->fromResource(I)Lcom/google/android/gms/maps/model/BitmapDescriptor;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1340
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$c;->d:Ljava/util/ArrayList;

    sget v1, Lcom/huawei/ui/homehealth/R$drawable;->track_setting_sport_map_marker_32:I

    invoke-static {v1}, Lcom/google/android/gms/maps/model/BitmapDescriptorFactory;->fromResource(I)Lcom/google/android/gms/maps/model/BitmapDescriptor;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1341
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$c;->d:Ljava/util/ArrayList;

    sget v1, Lcom/huawei/ui/homehealth/R$drawable;->track_setting_sport_map_marker_33:I

    invoke-static {v1}, Lcom/google/android/gms/maps/model/BitmapDescriptorFactory;->fromResource(I)Lcom/google/android/gms/maps/model/BitmapDescriptor;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1343
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$c;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$c;->b:I

    .line 1344
    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$c;)Ljava/util/ArrayList;
    .locals 1

    .line 1309
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$c;->d:Ljava/util/ArrayList;

    return-object v0
.end method

.method static synthetic c(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$c;)I
    .locals 1

    .line 1309
    iget v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$c;->a:I

    return v0
.end method

.method static synthetic e(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$c;)Lcom/google/android/gms/maps/model/LatLng;
    .locals 1

    .line 1309
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$c;->c:Lcom/google/android/gms/maps/model/LatLng;

    return-object v0
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 4

    .line 1348
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 1349
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    .line 1351
    :sswitch_0
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lcom/google/android/gms/maps/model/LatLng;

    .line 1352
    if-eqz v3, :cond_2

    .line 1353
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$c;->c:Lcom/google/android/gms/maps/model/LatLng;

    if-nez v0, :cond_0

    .line 1355
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$c;->sendEmptyMessage(I)Z

    .line 1357
    :cond_0
    iput-object v3, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$c;->c:Lcom/google/android/gms/maps/model/LatLng;

    goto :goto_0

    .line 1361
    :sswitch_1
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$c;->e:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->p(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;)Landroid/app/Activity;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$c;->e:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->m(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;)Lcom/google/android/gms/maps/GoogleMap;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$c;->e:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;

    invoke-virtual {v0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->isAdded()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1362
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$c;->e:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->p(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;)Landroid/app/Activity;

    move-result-object v0

    new-instance v1, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$c$2;

    invoke-direct {v1, p0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$c$2;-><init>(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$c;)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 1378
    :cond_1
    iget v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$c;->a:I

    add-int/lit8 v0, v0, 0x1

    iget v1, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$c;->b:I

    rem-int/2addr v0, v1

    iput v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$c;->a:I

    .line 1379
    const/4 v0, 0x1

    const-wide/16 v1, 0x78

    invoke-virtual {p0, v0, v1, v2}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$c;->sendEmptyMessageDelayed(IJ)Z

    .line 1380
    .line 1385
    :cond_2
    :goto_0
    return-void

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x1 -> :sswitch_1
    .end sparse-switch
.end method
