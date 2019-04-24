.class public Lcom/huawei/ui/homehealth/HomeFragment;
.super Landroid/support/v4/app/Fragment;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/ui/homehealth/HomeFragment$e;,
        Lcom/huawei/ui/homehealth/HomeFragment$c;,
        Lcom/huawei/ui/homehealth/HomeFragment$k;,
        Lcom/huawei/ui/homehealth/HomeFragment$d;,
        Lcom/huawei/ui/homehealth/HomeFragment$h;,
        Lcom/huawei/ui/homehealth/HomeFragment$b;,
        Lcom/huawei/ui/homehealth/HomeFragment$a;
    }
.end annotation


# static fields
.field private static Q:Z

.field private static b:Z


# instance fields
.field private A:J

.field private B:Lo/esh;

.field private C:Lcom/huawei/ui/homehealth/HomeFragment$c;

.field private D:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;"
        }
    .end annotation
.end field

.field private E:Z

.field private final F:Landroid/content/BroadcastReceiver;

.field private G:Z

.field private H:Lcom/huawei/ui/homehealth/HomeFragment$e;

.field private I:Lo/dqi;

.field private final J:Landroid/content/BroadcastReceiver;

.field private final K:Landroid/content/BroadcastReceiver;

.field private final L:Landroid/content/BroadcastReceiver;

.field private final M:Landroid/content/BroadcastReceiver;

.field private N:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

.field private O:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

.field public a:Z

.field c:Z

.field public d:Lo/epe;

.field private e:Landroid/os/Handler;

.field private f:Landroid/content/Context;

.field private g:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lo/eqv;>;"
        }
    .end annotation
.end field

.field private h:Lo/eog;

.field private i:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lo/eqv;>;"
        }
    .end annotation
.end field

.field private j:Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;

.field private k:Landroid/support/v7/widget/RecyclerView;

.field private l:Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;

.field private m:Lo/eqt;

.field private n:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field private o:Lo/esv;

.field private p:Lo/epf;

.field private q:Lo/epv;

.field private r:Lo/etm;

.field private s:Lo/etd;

.field private t:Lo/eqy;

.field private u:Lo/esm;

.field private v:Z

.field private w:Lo/eqx;

.field private x:Ljava/util/concurrent/ExecutorService;

.field private y:Lo/esl;

.field private z:Lo/etm;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 182
    const/4 v0, 0x0

    sput-boolean v0, Lcom/huawei/ui/homehealth/HomeFragment;->b:Z

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 149
    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    .line 212
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->p:Lo/epf;

    .line 213
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->o:Lo/esv;

    .line 214
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->m:Lo/eqt;

    .line 215
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->q:Lo/epv;

    .line 216
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->u:Lo/esm;

    .line 217
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->t:Lo/eqy;

    .line 218
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->s:Lo/etd;

    .line 219
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->r:Lo/etm;

    .line 220
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->z:Lo/etm;

    .line 221
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->y:Lo/esl;

    .line 222
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->w:Lo/eqx;

    .line 224
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->v:Z

    .line 225
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->D:Ljava/util/Map;

    .line 226
    const-wide/16 v0, 0x3e8

    iput-wide v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->A:J

    .line 234
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->E:Z

    .line 237
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->G:Z

    .line 240
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->a:Z

    .line 1058
    new-instance v0, Lcom/huawei/ui/homehealth/HomeFragment$2;

    invoke-direct {v0, p0}, Lcom/huawei/ui/homehealth/HomeFragment$2;-><init>(Lcom/huawei/ui/homehealth/HomeFragment;)V

    iput-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->F:Landroid/content/BroadcastReceiver;

    .line 1211
    new-instance v0, Lcom/huawei/ui/homehealth/HomeFragment$h;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/huawei/ui/homehealth/HomeFragment$h;-><init>(Lcom/huawei/ui/homehealth/HomeFragment$3;)V

    iput-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->L:Landroid/content/BroadcastReceiver;

    .line 1277
    new-instance v0, Lcom/huawei/ui/homehealth/HomeFragment$d;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/huawei/ui/homehealth/HomeFragment$d;-><init>(Lcom/huawei/ui/homehealth/HomeFragment$3;)V

    iput-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->K:Landroid/content/BroadcastReceiver;

    .line 1290
    new-instance v0, Lcom/huawei/ui/homehealth/HomeFragment$4;

    invoke-direct {v0, p0}, Lcom/huawei/ui/homehealth/HomeFragment$4;-><init>(Lcom/huawei/ui/homehealth/HomeFragment;)V

    iput-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->M:Landroid/content/BroadcastReceiver;

    .line 1347
    new-instance v0, Lcom/huawei/ui/homehealth/HomeFragment$8;

    invoke-direct {v0, p0}, Lcom/huawei/ui/homehealth/HomeFragment$8;-><init>(Lcom/huawei/ui/homehealth/HomeFragment;)V

    iput-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->J:Landroid/content/BroadcastReceiver;

    .line 1604
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->c:Z

    .line 1605
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->N:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    .line 1606
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->O:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    return-void
.end method

.method private A()V
    .locals 4

    .line 1465
    invoke-virtual {p0}, Lcom/huawei/ui/homehealth/HomeFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const-string v1, "android.permission.ACCESS_COARSE_LOCATION"

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentActivity;->checkSelfPermission(Ljava/lang/String;)I

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/huawei/ui/homehealth/HomeFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const-string v1, "android.permission.ACCESS_FINE_LOCATION"

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentActivity;->checkSelfPermission(Ljava/lang/String;)I

    move-result v0

    if-eqz v0, :cond_1

    .line 1466
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/ui/homehealth/HomeFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/String;

    const-string v2, "android.permission.ACCESS_COARSE_LOCATION"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "android.permission.ACCESS_FINE_LOCATION"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/16 v2, 0x65

    invoke-virtual {v0, v1, v2}, Landroid/support/v4/app/FragmentActivity;->requestPermissions([Ljava/lang/String;I)V

    .line 1468
    :cond_1
    return-void
.end method

.method private B()V
    .locals 4

    .line 1439
    const-string v0, "UIHLH_HomeFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter autoCheckBand"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1440
    invoke-static {}, Lo/czw;->e()Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    invoke-static {}, Lo/czw;->e()Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isOta_update()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1441
    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->f:Landroid/content/Context;

    invoke-static {v0}, Lo/eob;->c(Landroid/content/Context;)Lo/eob;

    move-result-object v0

    invoke-virtual {v0}, Lo/eob;->c()V

    goto :goto_0

    .line 1443
    :cond_0
    const-string v0, "UIHLH_HomeFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "autoCheckBandCheckVersionService not support"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1445
    :goto_0
    return-void
.end method

.method private C()V
    .locals 5

    .line 1508
    const-string v0, "UIHLH_HomeFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "outsideOpenActivityOrAddDevice enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1509
    invoke-direct {p0}, Lcom/huawei/ui/homehealth/HomeFragment;->H()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1510
    invoke-direct {p0}, Lcom/huawei/ui/homehealth/HomeFragment;->F()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1511
    const-string v0, "UIHLH_HomeFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "outsideOpenActivityOrAddDevice the device is leo"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 1513
    :cond_0
    const-string v0, "UIHLH_HomeFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "outsideOpenActivityOrAddDevice the device is not leo"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1514
    new-instance v4, Landroid/content/Intent;

    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->f:Landroid/content/Context;

    const-class v1, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;

    invoke-direct {v4, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 1515
    const-string v0, "com.huawei.ui.device.activity.adddevice.AddDeviceChildActivity"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 1516
    const-string v0, "KEY_OUTSIDE_OPEN_ACTIVITY_FLAG"

    const/4 v1, 0x1

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 1517
    invoke-virtual {p0, v4}, Lcom/huawei/ui/homehealth/HomeFragment;->startActivity(Landroid/content/Intent;)V

    .line 1518
    const-string v0, "UIHLH_HomeFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "cheange istoEsimOrWallet false"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1519
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->G:Z

    .line 1522
    :cond_1
    :goto_0
    return-void
.end method

.method private D()V
    .locals 4

    .line 1448
    const-string v0, "UIHLH_HomeFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkGpsSwitch"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1449
    invoke-static {}, Lcom/huawei/hwfitnessmgr/receiver/SyncFitnessDetailDataBroadcastReceiver;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1450
    invoke-direct {p0}, Lcom/huawei/ui/homehealth/HomeFragment;->j()V

    .line 1452
    :cond_0
    return-void
.end method

.method private E()Ljava/lang/String;
    .locals 2

    .line 1872
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dde;->d(Landroid/content/Context;)Lo/dde;

    move-result-object v0

    invoke-virtual {v0}, Lo/dde;->e()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v1

    .line 1873
    const/4 v0, 0x0

    if-eq v0, v1, :cond_0

    .line 1874
    invoke-virtual {v1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 1876
    :cond_0
    const-string v0, ""

    return-object v0
.end method

.method private F()Z
    .locals 9

    .line 1533
    new-instance v4, Lo/fcb;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-direct {v4, v0}, Lo/fcb;-><init>(Landroid/content/Context;)V

    .line 1534
    invoke-virtual {v4}, Lo/fcb;->c()Ljava/lang/String;

    move-result-object v5

    .line 1535
    invoke-static {}, Lo/etq;->d()Lo/etq;

    move-result-object v0

    invoke-virtual {v0}, Lo/etq;->b()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->N:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    .line 1536
    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->N:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_6

    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->N:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v0

    const/16 v1, 0xa

    if-ne v1, v0, :cond_6

    .line 1537
    const-string v0, "UIHLH_HomeFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "outsideOpenActivity producttype: "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/ui/homehealth/HomeFragment;->N:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    invoke-virtual {v2}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1538
    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->N:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceConnectState()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->c:Z

    .line 1539
    const-string v0, "UIHLH_HomeFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "outsideOpenActivity isConnected: "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-boolean v2, p0, Lcom/huawei/ui/homehealth/HomeFragment;->c:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1540
    iget-boolean v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->c:Z

    if-eqz v0, :cond_5

    .line 1541
    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->f:Landroid/content/Context;

    invoke-static {v0}, Lo/enz;->b(Landroid/content/Context;)Lo/enz;

    move-result-object v0

    invoke-virtual {v0}, Lo/enz;->b()Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->O:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    .line 1542
    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->O:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    .line 1543
    const-string v0, "UIHLH_HomeFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "outsideOpenActivity isSuppport ESim: "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/ui/homehealth/HomeFragment;->O:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    invoke-virtual {v2}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportEsim()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1545
    const/4 v6, 0x0

    .line 1546
    move-object v7, v5

    const/4 v8, -0x1

    invoke-virtual {v7}, Ljava/lang/String;->hashCode()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto :goto_1

    :sswitch_0
    const-string v0, "com.huawei.sim.multisim.MultiSimAuth"

    invoke-virtual {v7, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v8, 0x0

    goto :goto_1

    :sswitch_1
    const-string v0, "com.huawei.sim.esim.view.WirelessManagerAcitivity"

    invoke-virtual {v7, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v8, 0x1

    goto :goto_1

    :sswitch_2
    const-string v0, "com.huawei.wallet.ui.cardholder.CardHolderActivity"

    invoke-virtual {v7, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v8, 0x2

    :cond_1
    :goto_1
    packed-switch v8, :pswitch_data_0

    goto :goto_2

    .line 1548
    :pswitch_0
    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->O:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportMultiSim()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1549
    const/4 v6, 0x1

    goto :goto_3

    .line 1553
    :pswitch_1
    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->O:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportEsim()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1554
    const/4 v6, 0x1

    goto :goto_3

    .line 1558
    :pswitch_2
    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->O:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportPay()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1559
    const/4 v6, 0x1

    goto :goto_3

    .line 1563
    :goto_2
    const/4 v6, 0x0

    .line 1567
    :cond_2
    :goto_3
    if-eqz v6, :cond_3

    .line 1568
    invoke-direct {p0, v5}, Lcom/huawei/ui/homehealth/HomeFragment;->a(Ljava/lang/String;)V

    .line 1570
    :cond_3
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Lo/fcb;->e(Ljava/lang/String;)V

    .line 1571
    goto :goto_4

    .line 1572
    :cond_4
    const-string v0, "UIHLH_HomeFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "outsideOpenActivity null ==deviceCapability "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1575
    :cond_5
    :goto_4
    const/4 v0, 0x1

    return v0

    .line 1577
    :cond_6
    const/4 v0, 0x0

    return v0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x4edd485d -> :sswitch_1
        0x55046a65 -> :sswitch_0
        0x6fd82b1e -> :sswitch_2
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method private G()V
    .locals 5

    .line 1582
    const-string v0, "UIHLH_HomeFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "openActivity enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1583
    new-instance v4, Lo/fcb;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-direct {v4, v0}, Lo/fcb;-><init>(Landroid/content/Context;)V

    .line 1584
    const-string v0, "UIHLH_HomeFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "openActivity openActivity:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Lo/fcb;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1585
    invoke-direct {p0}, Lcom/huawei/ui/homehealth/HomeFragment;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1586
    invoke-direct {p0}, Lcom/huawei/ui/homehealth/HomeFragment;->F()Z

    .line 1588
    :cond_0
    return-void
.end method

.method private H()Z
    .locals 6

    .line 1525
    const-string v0, "UIHLH_HomeFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "outsideOpenActivityOrAddDevice enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1526
    new-instance v4, Lo/fcb;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-direct {v4, v0}, Lo/fcb;-><init>(Landroid/content/Context;)V

    .line 1527
    invoke-virtual {v4}, Lo/fcb;->c()Ljava/lang/String;

    move-result-object v5

    .line 1528
    const-string v0, "UIHLH_HomeFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "outsideOpenActivityOrAddDevice openSim:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v5, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1529
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private I()V
    .locals 2

    .line 1882
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dbf;->o(Landroid/content/Context;)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 1883
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dde;->d(Landroid/content/Context;)Lo/dde;

    move-result-object v0

    invoke-virtual {v0}, Lo/dde;->r()V

    .line 1885
    :cond_0
    return-void
.end method

.method private a(Landroid/content/Context;)V
    .locals 8

    .line 1664
    invoke-static {}, Lo/ajq;->e()Ljava/util/ArrayList;

    move-result-object v4

    .line 1665
    if-eqz v4, :cond_0

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-gtz v0, :cond_1

    .line 1666
    :cond_0
    const-string v0, "UIHLH_HomeFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getAllWifiWeightData wiFiDeviceList is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1667
    return-void

    .line 1669
    :cond_1
    const/4 v5, 0x0

    :goto_0
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v5, v0, :cond_2

    .line 1671
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/aja;

    invoke-virtual {v0}, Lo/aja;->f()J

    move-result-wide v6

    .line 1672
    invoke-direct {p0, p1, v6, v7}, Lcom/huawei/ui/homehealth/HomeFragment;->c(Landroid/content/Context;J)V

    .line 1669
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 1675
    :cond_2
    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/homehealth/HomeFragment;)V
    .locals 0

    .line 149
    invoke-direct {p0}, Lcom/huawei/ui/homehealth/HomeFragment;->l()V

    return-void
.end method

.method private a(Ljava/lang/String;)V
    .locals 5

    .line 1594
    new-instance v4, Landroid/content/Intent;

    invoke-direct {v4}, Landroid/content/Intent;-><init>()V

    .line 1595
    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->f:Landroid/content/Context;

    invoke-virtual {v4, v0, p1}, Landroid/content/Intent;->setClassName(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    .line 1596
    const-string v0, "com.huawei.sim.multisim.MultiSimAuth"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1597
    const-string v0, "com.huawei.sim.multisim.MultiSimAuth"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 1598
    const-string v0, "UIHLH_HomeFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "gotoEsim:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1600
    :cond_0
    const-string v0, "UIHLH_HomeFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "gotoActivity:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1601
    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->f:Landroid/content/Context;

    invoke-virtual {v0, v4}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 1602
    return-void
.end method

.method private a(I)Z
    .locals 5

    .line 1609
    const/4 v4, 0x0

    .line 1610
    const/4 v0, 0x3

    if-eq v0, p1, :cond_0

    const/16 v0, 0xa

    if-ne v0, p1, :cond_1

    .line 1611
    :cond_0
    const/4 v4, 0x1

    .line 1613
    :cond_1
    const-string v0, "UIHLH_HomeFragment"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter isWatch type:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " res:"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1614
    return v4
.end method

.method static synthetic a(Z)Z
    .locals 0

    .line 149
    sput-boolean p0, Lcom/huawei/ui/homehealth/HomeFragment;->b:Z

    return p0
.end method

.method static synthetic b(Lcom/huawei/ui/homehealth/HomeFragment;)Landroid/content/Context;
    .locals 1

    .line 149
    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->f:Landroid/content/Context;

    return-object v0
.end method

.method public static b(Landroid/content/Context;Lo/egg;)V
    .locals 2

    .line 1637
    invoke-static {p0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    new-instance v1, Lcom/huawei/ui/homehealth/HomeFragment$9;

    invoke-direct {v1, p1}, Lcom/huawei/ui/homehealth/HomeFragment$9;-><init>(Lo/egg;)V

    invoke-interface {v0, v1}, Lo/clt;->a(Lo/clz;)V

    .line 1657
    return-void
.end method

.method private c(Landroid/content/Context;J)V
    .locals 15

    .line 1679
    const-string v0, "UIHLH_HomeFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "deviceCode is:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-wide/from16 v3, p2

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1680
    const/4 v5, 0x0

    .line 1682
    const/4 v0, 0x0

    move-object/from16 v1, p1

    if-eq v0, v1, :cond_0

    const-wide/16 v0, 0x0

    cmp-long v0, p2, v0

    if-nez v0, :cond_1

    .line 1683
    :cond_0
    const-string v0, "UIHLH_HomeFragment"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getWifiWeightData error, context="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    const-string v2, "|deviceCode="

    const/4 v3, 0x2

    aput-object v2, v1, v3

    .line 1684
    invoke-static/range {p2 .. p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    .line 1683
    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1685
    return-void

    .line 1688
    :cond_1
    new-instance v6, Lcom/huawei/hwcloudmodel/model/userprofile/GetBindDeviceReq;

    invoke-direct {v6}, Lcom/huawei/hwcloudmodel/model/userprofile/GetBindDeviceReq;-><init>()V

    .line 1689
    invoke-static/range {p2 .. p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/hwcloudmodel/model/userprofile/GetBindDeviceReq;->setDeviceCode(Ljava/lang/Long;)V

    .line 1690
    invoke-static/range {p1 .. p1}, Lo/czg;->e(Landroid/content/Context;)Lo/czg;

    move-result-object v0

    invoke-virtual {v0, v6}, Lo/czg;->c(Lcom/huawei/hwcloudmodel/model/userprofile/GetBindDeviceReq;)Lcom/huawei/hwcloudmodel/model/userprofile/GetBindDeviceRsp;

    move-result-object v7

    .line 1692
    const/4 v0, 0x1

    :try_start_0
    invoke-static {v7, v0}, Lo/csn;->e(Lcom/huawei/hwcloudmodel/model/CloudCommonReponse;Z)Z

    move-result v0

    if-nez v0, :cond_2

    .line 1693
    const-string v0, "UIHLH_HomeFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkCloudRsp Errorr"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Lo/csq; {:try_start_0 .. :try_end_0} :catch_0

    .line 1694
    return-void

    .line 1696
    :cond_2
    :try_start_1
    invoke-virtual {v7}, Lcom/huawei/hwcloudmodel/model/userprofile/GetBindDeviceRsp;->getDeviceInfos()Ljava/util/List;

    move-result-object v8

    .line 1697
    if-eqz v8, :cond_3

    invoke-interface {v8}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 1698
    :cond_3
    const-string v0, "UIHLH_HomeFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "deviceInfos is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catch Lo/csq; {:try_start_1 .. :try_end_1} :catch_0

    .line 1699
    return-void

    .line 1701
    :cond_4
    const/4 v0, 0x0

    :try_start_2
    invoke-interface {v8, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lcom/huawei/hwcloudmodel/model/userprofile/DeviceInfo;

    .line 1702
    invoke-virtual {v9}, Lcom/huawei/hwcloudmodel/model/userprofile/DeviceInfo;->getUniqueId()Ljava/lang/String;

    move-result-object v5

    .line 1703
    const-string v0, "UIHLH_HomeFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "deviceUUID is:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v5, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catch Lo/csq; {:try_start_2 .. :try_end_2} :catch_0

    .line 1707
    goto :goto_0

    .line 1704
    :catch_0
    move-exception v8

    .line 1705
    const-string v0, "UIHLH_HomeFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getWifiWeightData Sync data error:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v8}, Lo/csq;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1706
    return-void

    .line 1710
    :goto_0
    const/4 v0, 0x0

    if-ne v0, v5, :cond_5

    .line 1711
    const-string v0, "UIHLH_HomeFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getWifiWeightData error, deviceUUID is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1712
    return-void

    .line 1715
    :cond_5
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v8

    .line 1716
    const-wide/16 v10, 0x0

    .line 1717
    const-string v0, "UIHLH_HomeFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "endTime:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1720
    const/4 v12, 0x1

    new-array v12, v12, [I

    fill-array-data v12, :array_0

    .line 1721
    const/4 v0, 0x1

    new-array v13, v0, [Ljava/lang/String;

    const-string v0, "test"

    const/4 v1, 0x0

    aput-object v0, v13, v1

    .line 1722
    new-instance v14, Lcom/huawei/hihealth/HiAggregateOption;

    invoke-direct {v14}, Lcom/huawei/hihealth/HiAggregateOption;-><init>()V

    .line 1723
    invoke-static {v10, v11}, Lo/cnk;->d(J)J

    move-result-wide v0

    invoke-static {v8, v9}, Lo/cnk;->i(J)J

    move-result-wide v2

    invoke-virtual {v14, v0, v1, v2, v3}, Lcom/huawei/hihealth/HiAggregateOption;->setTimeRange(JJ)V

    .line 1724
    invoke-virtual {v14, v10, v11, v8, v9}, Lcom/huawei/hihealth/HiAggregateOption;->setTimeRange(JJ)V

    .line 1725
    invoke-virtual {v14, v12}, Lcom/huawei/hihealth/HiAggregateOption;->setType([I)V

    .line 1726
    const/4 v0, 0x0

    invoke-virtual {v14, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setGroupUnitType(I)V

    .line 1727
    const/4 v0, 0x1

    invoke-virtual {v14, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setAggregateType(I)V

    .line 1728
    const/4 v0, 0x1

    invoke-virtual {v14, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setSortOrder(I)V

    .line 1729
    const-string v0, ""

    invoke-virtual {v14, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setFilter(Ljava/lang/String;)V

    .line 1730
    invoke-virtual {v14, v13}, Lcom/huawei/hihealth/HiAggregateOption;->setConstantsKey([Ljava/lang/String;)V

    .line 1731
    const/4 v0, 0x1

    invoke-virtual {v14, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setCount(I)V

    .line 1732
    invoke-virtual {v14, v5}, Lcom/huawei/hihealth/HiAggregateOption;->setDeviceUUID(Ljava/lang/String;)V

    .line 1734
    invoke-static/range {p1 .. p1}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    new-instance v1, Lcom/huawei/ui/homehealth/HomeFragment$7;

    move-object/from16 v2, p1

    invoke-direct {v1, p0, v2}, Lcom/huawei/ui/homehealth/HomeFragment$7;-><init>(Lcom/huawei/ui/homehealth/HomeFragment;Landroid/content/Context;)V

    invoke-interface {v0, v14, v1}, Lo/clt;->b(Lcom/huawei/hihealth/HiAggregateOption;Lo/cly;)V

    .line 1840
    return-void

    :array_0
    .array-data 4
        0x2716
    .end array-data
.end method

.method private c(Landroid/view/View;)V
    .locals 8

    .line 268
    sget v0, Lcom/huawei/ui/homehealth/R$id;->statusbar_panel:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    .line 269
    invoke-virtual {p0}, Lcom/huawei/ui/homehealth/HomeFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v5

    .line 270
    const/4 v0, 0x0

    if-ne v0, v5, :cond_0

    .line 271
    const-string v0, "UIHLH_HomeFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setStatusBarHeight null == arguments"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 272
    return-void

    .line 274
    :cond_0
    const-string v0, "statusBarHeight"

    invoke-virtual {v5, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v6

    .line 275
    const-string v0, "UIHLH_HomeFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "setStatusBarHeight statusBarHeight"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 276
    const/4 v0, 0x0

    if-eq v0, v6, :cond_1

    .line 277
    new-instance v7, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v0, -0x1

    invoke-direct {v7, v0, v6}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 278
    invoke-virtual {v4, v7}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 279
    goto :goto_0

    .line 280
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->f:Landroid/content/Context;

    const/high16 v1, 0x41b00000    # 22.0f

    invoke-static {v0, v1}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v6

    .line 281
    new-instance v7, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v0, -0x1

    invoke-direct {v7, v0, v6}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 282
    invoke-virtual {v4, v7}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 284
    :goto_0
    return-void
.end method

.method static synthetic c(Lcom/huawei/ui/homehealth/HomeFragment;)V
    .locals 0

    .line 149
    invoke-direct {p0}, Lcom/huawei/ui/homehealth/HomeFragment;->v()V

    return-void
.end method

.method static synthetic c()Z
    .locals 1

    .line 149
    sget-boolean v0, Lcom/huawei/ui/homehealth/HomeFragment;->Q:Z

    return v0
.end method

.method static synthetic c(Z)Z
    .locals 0

    .line 149
    sput-boolean p0, Lcom/huawei/ui/homehealth/HomeFragment;->Q:Z

    return p0
.end method

.method static synthetic d(Lcom/huawei/ui/homehealth/HomeFragment;Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;)Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;
    .locals 0

    .line 149
    iput-object p1, p0, Lcom/huawei/ui/homehealth/HomeFragment;->N:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    return-object p1
.end method

.method static synthetic d(Lcom/huawei/ui/homehealth/HomeFragment;)V
    .locals 0

    .line 149
    invoke-direct {p0}, Lcom/huawei/ui/homehealth/HomeFragment;->s()V

    return-void
.end method

.method static synthetic d()Z
    .locals 1

    .line 149
    sget-boolean v0, Lcom/huawei/ui/homehealth/HomeFragment;->b:Z

    return v0
.end method

.method static synthetic e(Lcom/huawei/ui/homehealth/HomeFragment;J)J
    .locals 0

    .line 149
    iput-wide p1, p0, Lcom/huawei/ui/homehealth/HomeFragment;->A:J

    return-wide p1
.end method

.method private e()V
    .locals 2

    .line 422
    const-string v0, "UIHLH_HomeFragment"

    const-string v1, "-initCardConstructor enter"

    invoke-static {v0, v1}, Lo/dbf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 423
    new-instance v0, Lo/esv;

    iget-object v1, p0, Lcom/huawei/ui/homehealth/HomeFragment;->f:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/esv;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->o:Lo/esv;

    .line 424
    new-instance v0, Lo/esm;

    iget-object v1, p0, Lcom/huawei/ui/homehealth/HomeFragment;->f:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/esm;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->u:Lo/esm;

    .line 425
    new-instance v0, Lo/epf;

    iget-object v1, p0, Lcom/huawei/ui/homehealth/HomeFragment;->f:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/epf;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->p:Lo/epf;

    .line 426
    new-instance v0, Lo/epv;

    iget-object v1, p0, Lcom/huawei/ui/homehealth/HomeFragment;->f:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/epv;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->q:Lo/epv;

    .line 427
    new-instance v0, Lo/eqx;

    iget-object v1, p0, Lcom/huawei/ui/homehealth/HomeFragment;->f:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/eqx;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->w:Lo/eqx;

    .line 428
    new-instance v0, Lo/eqy;

    iget-object v1, p0, Lcom/huawei/ui/homehealth/HomeFragment;->f:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/eqy;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->t:Lo/eqy;

    .line 429
    new-instance v0, Lo/etd;

    iget-object v1, p0, Lcom/huawei/ui/homehealth/HomeFragment;->f:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/etd;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->s:Lo/etd;

    .line 430
    new-instance v0, Lo/etn;

    iget-object v1, p0, Lcom/huawei/ui/homehealth/HomeFragment;->f:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/etn;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->r:Lo/etm;

    .line 431
    new-instance v0, Lo/etl;

    iget-object v1, p0, Lcom/huawei/ui/homehealth/HomeFragment;->f:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/etl;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->z:Lo/etm;

    .line 432
    new-instance v0, Lo/esl;

    iget-object v1, p0, Lcom/huawei/ui/homehealth/HomeFragment;->f:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/esl;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->y:Lo/esl;

    .line 433
    new-instance v0, Lo/eqt;

    iget-object v1, p0, Lcom/huawei/ui/homehealth/HomeFragment;->f:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/eqt;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->m:Lo/eqt;

    .line 434
    const-string v0, "UIHLH_HomeFragment"

    const-string v1, "-initCardConstructor end"

    invoke-static {v0, v1}, Lo/dbf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 435
    return-void
.end method

.method static synthetic e(Lcom/huawei/ui/homehealth/HomeFragment;)V
    .locals 0

    .line 149
    invoke-direct {p0}, Lcom/huawei/ui/homehealth/HomeFragment;->z()V

    return-void
.end method

.method static synthetic e(Lcom/huawei/ui/homehealth/HomeFragment;Landroid/content/Context;)V
    .locals 0

    .line 149
    invoke-direct {p0, p1}, Lcom/huawei/ui/homehealth/HomeFragment;->a(Landroid/content/Context;)V

    return-void
.end method

.method static synthetic e(Lcom/huawei/ui/homehealth/HomeFragment;I)Z
    .locals 1

    .line 149
    invoke-direct {p0, p1}, Lcom/huawei/ui/homehealth/HomeFragment;->a(I)Z

    move-result v0

    return v0
.end method

.method private f()V
    .locals 4

    .line 510
    const-string v0, "UIHLH_HomeFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "refreshWearSDKData"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 511
    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->n:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 512
    new-instance v0, Lcom/huawei/ui/homehealth/HomeFragment$a;

    invoke-direct {v0, p0}, Lcom/huawei/ui/homehealth/HomeFragment$a;-><init>(Lcom/huawei/ui/homehealth/HomeFragment;)V

    iput-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->n:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 514
    :cond_0
    invoke-static {}, Lo/etq;->d()Lo/etq;

    move-result-object v0

    invoke-virtual {v0}, Lo/etq;->k()V

    .line 515
    invoke-static {}, Lo/akv;->e()Lo/akv;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/homehealth/HomeFragment;->n:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Lo/akv;->c(ILcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 516
    return-void
.end method

.method static synthetic f(Lcom/huawei/ui/homehealth/HomeFragment;)V
    .locals 0

    .line 149
    invoke-direct {p0}, Lcom/huawei/ui/homehealth/HomeFragment;->h()V

    return-void
.end method

.method static synthetic g(Lcom/huawei/ui/homehealth/HomeFragment;)J
    .locals 2

    .line 149
    iget-wide v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->A:J

    return-wide v0
.end method

.method private g()V
    .locals 4

    .line 641
    new-instance v3, Lcom/huawei/ui/homehealth/HomeFragment$14;

    invoke-direct {v3, p0}, Lcom/huawei/ui/homehealth/HomeFragment$14;-><init>(Lcom/huawei/ui/homehealth/HomeFragment;)V

    .line 652
    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->e:Landroid/os/Handler;

    const-wide/16 v1, 0xa

    invoke-virtual {v0, v3, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 653
    return-void
.end method

.method static synthetic h(Lcom/huawei/ui/homehealth/HomeFragment;)Landroid/os/Handler;
    .locals 1

    .line 149
    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->e:Landroid/os/Handler;

    return-object v0
.end method

.method private h()V
    .locals 5

    .line 542
    invoke-direct {p0}, Lcom/huawei/ui/homehealth/HomeFragment;->E()Ljava/lang/String;

    move-result-object v4

    .line 543
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    const-string v0, ""

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 544
    :cond_0
    const-string v0, "UIHLH_HomeFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "push weather,device mac is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 545
    return-void

    .line 547
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->f:Landroid/content/Context;

    invoke-static {v0}, Lo/enz;->b(Landroid/content/Context;)Lo/enz;

    move-result-object v0

    invoke-virtual {v0, v4}, Lo/enz;->b(Ljava/lang/String;)Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->O:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    .line 549
    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->O:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->O:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isWeather_push()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 550
    const-string v0, "UIHLH_HomeFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isSupportWeatherPush : "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/ui/homehealth/HomeFragment;->O:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    invoke-virtual {v2}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isWeather_push()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 551
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dqi;->b(Landroid/content/Context;)Lo/dqi;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->I:Lo/dqi;

    .line 552
    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->I:Lo/dqi;

    const-string v1, "weather_switch_status"

    new-instance v2, Lcom/huawei/ui/homehealth/HomeFragment$11;

    invoke-direct {v2, p0}, Lcom/huawei/ui/homehealth/HomeFragment$11;-><init>(Lcom/huawei/ui/homehealth/HomeFragment;)V

    invoke-virtual {v0, v1, v2}, Lo/dqi;->a(Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    goto :goto_0

    .line 572
    :cond_2
    const-string v0, "UIHLH_HomeFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "pushWeatherData can not get deviceCapability."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 574
    :goto_0
    return-void
.end method

.method private i()V
    .locals 2

    .line 438
    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->l:Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;

    new-instance v1, Lcom/huawei/ui/homehealth/HomeFragment$15;

    invoke-direct {v1, p0}, Lcom/huawei/ui/homehealth/HomeFragment$15;-><init>(Lcom/huawei/ui/homehealth/HomeFragment;)V

    invoke-virtual {v0, v1}, Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;->setOnSwipeRecyclerViewListener(Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView$c;)V

    .line 457
    return-void
.end method

.method static synthetic i(Lcom/huawei/ui/homehealth/HomeFragment;)V
    .locals 0

    .line 149
    invoke-direct {p0}, Lcom/huawei/ui/homehealth/HomeFragment;->f()V

    return-void
.end method

.method private j()V
    .locals 4

    .line 1455
    const-string v0, "UIHLH_HomeFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "need show gps switch note"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1456
    const/4 v0, 0x0

    invoke-static {v0}, Lcom/huawei/hwfitnessmgr/receiver/SyncFitnessDetailDataBroadcastReceiver;->a(Z)V

    .line 1457
    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->f:Landroid/content/Context;

    invoke-static {v0}, Lo/dgo;->c(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1458
    sget v0, Lcom/huawei/ui/homehealth/R$string;->IDS_hw_show_sport_dialog_open_gps_content:I

    const/16 v1, 0x65

    invoke-virtual {p0, v0, v1}, Lcom/huawei/ui/homehealth/HomeFragment;->c(II)V

    goto :goto_0

    .line 1460
    :cond_0
    invoke-direct {p0}, Lcom/huawei/ui/homehealth/HomeFragment;->A()V

    .line 1462
    :goto_0
    return-void
.end method

.method private k()V
    .locals 6

    .line 520
    invoke-direct {p0}, Lcom/huawei/ui/homehealth/HomeFragment;->E()Ljava/lang/String;

    move-result-object v4

    .line 521
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    const-string v0, ""

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 522
    :cond_0
    const-string v0, "UIHLH_HomeFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "push press,device mac is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 523
    return-void

    .line 525
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->f:Landroid/content/Context;

    invoke-static {v0}, Lo/enz;->b(Landroid/content/Context;)Lo/enz;

    move-result-object v0

    invoke-virtual {v0, v4}, Lo/enz;->b(Ljava/lang/String;)Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->O:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    .line 526
    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->O:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    if-eqz v0, :cond_3

    .line 527
    const-string v0, "UIHLH_HomeFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isSupportAtmosphere : "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/ui/homehealth/HomeFragment;->O:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    invoke-virtual {v2}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportAtmosphere()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 528
    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->O:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportAtmosphere()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 529
    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->f:Landroid/content/Context;

    invoke-static {v0}, Lo/enz;->b(Landroid/content/Context;)Lo/enz;

    move-result-object v5

    .line 530
    invoke-virtual {v5}, Lo/enz;->e()V

    .line 531
    goto :goto_0

    .line 532
    :cond_2
    const-string v0, "UIHLH_HomeFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "This device do not support 5.15.3"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 535
    :cond_3
    const-string v0, "UIHLH_HomeFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "pushLocalPressInfo can not get deviceCapability."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 538
    :goto_0
    return-void
.end method

.method static synthetic k(Lcom/huawei/ui/homehealth/HomeFragment;)V
    .locals 0

    .line 149
    invoke-direct {p0}, Lcom/huawei/ui/homehealth/HomeFragment;->k()V

    return-void
.end method

.method static synthetic l(Lcom/huawei/ui/homehealth/HomeFragment;)Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;
    .locals 1

    .line 149
    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->j:Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;

    return-object v0
.end method

.method private l()V
    .locals 4

    .line 775
    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->f:Landroid/content/Context;

    const-string v1, "HiHealth_UUID"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v3

    .line 776
    const-string v0, "PHONE_UUID"

    const/4 v1, 0x0

    invoke-interface {v3, v0, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 777
    return-void

    .line 779
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->f:Landroid/content/Context;

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    new-instance v1, Lcom/huawei/ui/homehealth/HomeFragment$5;

    invoke-direct {v1, p0, v3}, Lcom/huawei/ui/homehealth/HomeFragment$5;-><init>(Lcom/huawei/ui/homehealth/HomeFragment;Landroid/content/SharedPreferences;)V

    invoke-interface {v0, v1}, Lo/clt;->e(Lo/cmc;)V

    .line 790
    return-void
.end method

.method static synthetic m(Lcom/huawei/ui/homehealth/HomeFragment;)Lo/esh;
    .locals 1

    .line 149
    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->B:Lo/esh;

    return-object v0
.end method

.method private m()V
    .locals 4

    .line 755
    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->f:Landroid/content/Context;

    invoke-static {v0}, Lo/dbf;->f(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 756
    const-string v0, "UIHLH_HomeFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "no net to RecommendCloud"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 757
    return-void

    .line 759
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->f:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/recommendcloud/RecommendCloud;->getInstance(Landroid/content/Context;)Lcom/huawei/ui/main/stories/recommendcloud/RecommendCloud;

    move-result-object v0

    new-instance v1, Lcom/huawei/ui/homehealth/HomeFragment$1;

    invoke-direct {v1, p0}, Lcom/huawei/ui/homehealth/HomeFragment$1;-><init>(Lcom/huawei/ui/homehealth/HomeFragment;)V

    invoke-virtual {v0, v1}, Lcom/huawei/ui/main/stories/recommendcloud/RecommendCloud;->doRefreshBatch(Lcom/huawei/ui/main/stories/recommendcloud/service/RecommendCloudCallBack;)V

    .line 772
    return-void
.end method

.method private n()V
    .locals 4

    .line 740
    const-string v0, "UIHLH_HomeFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "refreshServiceFW begin"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 741
    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->x:Ljava/util/concurrent/ExecutorService;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->x:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->isShutdown()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 742
    :cond_0
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->x:Ljava/util/concurrent/ExecutorService;

    .line 743
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->x:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/huawei/ui/homehealth/HomeFragment$18;

    invoke-direct {v1, p0}, Lcom/huawei/ui/homehealth/HomeFragment$18;-><init>(Lcom/huawei/ui/homehealth/HomeFragment;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 749
    return-void
.end method

.method static synthetic n(Lcom/huawei/ui/homehealth/HomeFragment;)V
    .locals 0

    .line 149
    invoke-direct {p0}, Lcom/huawei/ui/homehealth/HomeFragment;->q()V

    return-void
.end method

.method static synthetic o(Lcom/huawei/ui/homehealth/HomeFragment;)Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;
    .locals 1

    .line 149
    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->l:Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;

    return-object v0
.end method

.method private o()V
    .locals 4

    .line 728
    const-string v0, "UIHLH_HomeFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initServiceFW begin"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 729
    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->x:Ljava/util/concurrent/ExecutorService;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->x:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->isShutdown()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 730
    :cond_0
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->x:Ljava/util/concurrent/ExecutorService;

    .line 731
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->x:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/huawei/ui/homehealth/HomeFragment$16;

    invoke-direct {v1, p0}, Lcom/huawei/ui/homehealth/HomeFragment$16;-><init>(Lcom/huawei/ui/homehealth/HomeFragment;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 737
    return-void
.end method

.method private p()V
    .locals 4

    .line 698
    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->f:Landroid/content/Context;

    invoke-static {v0}, Lo/dbf;->f(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 699
    const-string v0, "UIHLH_HomeFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "no net to lightcloud"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 700
    return-void

    .line 702
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->f:Landroid/content/Context;

    invoke-static {v0}, Lo/ffr;->a(Landroid/content/Context;)Lo/ffr;

    move-result-object v0

    new-instance v1, Lcom/huawei/ui/homehealth/HomeFragment$17;

    invoke-direct {v1, p0}, Lcom/huawei/ui/homehealth/HomeFragment$17;-><init>(Lcom/huawei/ui/homehealth/HomeFragment;)V

    invoke-virtual {v0, v1}, Lo/ffr;->a(Lo/ffv;)V

    .line 725
    return-void
.end method

.method static synthetic p(Lcom/huawei/ui/homehealth/HomeFragment;)V
    .locals 0

    .line 149
    invoke-direct {p0}, Lcom/huawei/ui/homehealth/HomeFragment;->o()V

    return-void
.end method

.method private q()V
    .locals 3

    .line 892
    const-string v0, "UIHLH_HomeFragment-cardsResume enter"

    invoke-static {v0}, Lo/dbf;->d(Ljava/lang/String;)V

    .line 893
    invoke-static {}, Lo/erd;->a()I

    move-result v0

    const/4 v1, -0x2

    if-ne v0, v1, :cond_0

    .line 894
    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->f:Landroid/content/Context;

    const-string v1, "HomeCardRefreshIndex"

    const/4 v2, -0x2

    invoke-static {v0, v1, v2}, Lo/eqq;->e(Landroid/content/Context;Ljava/lang/String;I)I

    move-result v0

    invoke-static {v0}, Lo/erd;->e(I)V

    .line 895
    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->f:Landroid/content/Context;

    const-string v1, "HomeCardRefreshIndex"

    const/4 v2, -0x2

    invoke-static {v0, v1, v2}, Lo/eqq;->b(Landroid/content/Context;Ljava/lang/String;I)V

    .line 897
    :cond_0
    invoke-static {}, Lo/erd;->a()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 899
    :pswitch_0
    invoke-direct {p0}, Lcom/huawei/ui/homehealth/HomeFragment;->r()V

    .line 900
    goto :goto_0

    .line 902
    :pswitch_1
    goto :goto_0

    .line 904
    :pswitch_2
    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->o:Lo/esv;

    invoke-static {v0}, Lo/eoz;->a(Lo/eqv;)V

    .line 905
    .line 911
    :goto_0
    const/4 v0, -0x2

    invoke-static {v0}, Lo/erd;->e(I)V

    .line 912
    const-string v0, "UIHLH_HomeFragment-cardsResume end"

    invoke-static {v0}, Lo/dbf;->d(Ljava/lang/String;)V

    .line 913
    return-void

    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method static synthetic q(Lcom/huawei/ui/homehealth/HomeFragment;)V
    .locals 0

    .line 149
    invoke-direct {p0}, Lcom/huawei/ui/homehealth/HomeFragment;->y()V

    return-void
.end method

.method private r()V
    .locals 1

    .line 916
    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->o:Lo/esv;

    invoke-static {v0}, Lo/eoz;->a(Lo/eqv;)V

    .line 917
    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->u:Lo/esm;

    invoke-static {v0}, Lo/eoz;->a(Lo/eqv;)V

    .line 918
    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->p:Lo/epf;

    invoke-static {v0}, Lo/eoz;->a(Lo/eqv;)V

    .line 919
    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->q:Lo/epv;

    invoke-static {v0}, Lo/eoz;->a(Lo/eqv;)V

    .line 920
    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->w:Lo/eqx;

    invoke-static {v0}, Lo/eoz;->a(Lo/eqv;)V

    .line 921
    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->t:Lo/eqy;

    invoke-static {v0}, Lo/eoz;->a(Lo/eqv;)V

    .line 922
    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->s:Lo/etd;

    invoke-static {v0}, Lo/eoz;->a(Lo/eqv;)V

    .line 923
    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->y:Lo/esl;

    invoke-static {v0}, Lo/eoz;->a(Lo/eqv;)V

    .line 924
    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->m:Lo/eqt;

    invoke-static {v0}, Lo/eoz;->a(Lo/eqv;)V

    .line 925
    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->r:Lo/etm;

    invoke-static {v0}, Lo/eoz;->a(Lo/eqv;)V

    .line 926
    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->z:Lo/etm;

    invoke-static {v0}, Lo/eoz;->a(Lo/eqv;)V

    .line 928
    return-void
.end method

.method static synthetic r(Lcom/huawei/ui/homehealth/HomeFragment;)V
    .locals 0

    .line 149
    invoke-direct {p0}, Lcom/huawei/ui/homehealth/HomeFragment;->B()V

    return-void
.end method

.method static synthetic s(Lcom/huawei/ui/homehealth/HomeFragment;)Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;
    .locals 1

    .line 149
    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->N:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    return-object v0
.end method

.method private s()V
    .locals 5

    .line 1025
    const-string v0, "UIHLH_HomeFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "registerWearBroadcast"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1026
    new-instance v4, Landroid/content/IntentFilter;

    invoke-direct {v4}, Landroid/content/IntentFilter;-><init>()V

    .line 1028
    const-string v0, "com.huawei.bone.action.CONNECTION_STATE_CHANGED"

    invoke-virtual {v4, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 1029
    const-string v0, "com.huawei.bone.action.CORE_SLEEP_DATA_SYNC_COMPLETED"

    invoke-virtual {v4, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 1030
    const-string v0, "com.huawei.bone.action.language_changed"

    invoke-virtual {v4, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 1031
    const-string v0, "com.huawei.health.action.UPDATE_LANGUAGE_READY"

    invoke-virtual {v4, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 1032
    const-string v0, "com.huawei.bone.action.open_gps"

    invoke-virtual {v4, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 1033
    const/16 v0, 0x1f4

    invoke-virtual {v4, v0}, Landroid/content/IntentFilter;->setPriority(I)V

    .line 1035
    const-string v0, "com.huawei.bone.action.PHONE_SERVICE_BIND_SUCCESS"

    invoke-virtual {v4, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 1036
    const-string v0, "com.huawei.bone.action_band_psi_activated"

    invoke-virtual {v4, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 1037
    const-string v0, "com.huawei.bone.action.CORE_PERIOD_RRI_SYNC_COMPLETED"

    invoke-virtual {v4, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 1038
    const-string v0, "com.huawei.bone.action.CORE_DFX_BROADCAST"

    invoke-virtual {v4, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 1039
    const-string v0, "com.huawei.health.fitness_detail_sync_success"

    invoke-virtual {v4, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 1041
    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->f:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/ui/homehealth/HomeFragment;->F:Landroid/content/BroadcastReceiver;

    sget-object v2, Lo/dac;->a:Ljava/lang/String;

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v4, v2, v3}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Ljava/lang/String;Landroid/os/Handler;)Landroid/content/Intent;

    .line 1042
    return-void
.end method

.method static synthetic t(Lcom/huawei/ui/homehealth/HomeFragment;)Landroid/support/v7/widget/RecyclerView;
    .locals 1

    .line 149
    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->k:Landroid/support/v7/widget/RecyclerView;

    return-object v0
.end method

.method private t()V
    .locals 1

    .line 877
    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->o:Lo/esv;

    invoke-static {v0}, Lo/eoz;->b(Lo/eqv;)V

    .line 878
    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->u:Lo/esm;

    invoke-static {v0}, Lo/eoz;->b(Lo/eqv;)V

    .line 879
    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->p:Lo/epf;

    invoke-static {v0}, Lo/eoz;->b(Lo/eqv;)V

    .line 880
    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->q:Lo/epv;

    invoke-static {v0}, Lo/eoz;->b(Lo/eqv;)V

    .line 881
    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->w:Lo/eqx;

    invoke-static {v0}, Lo/eoz;->b(Lo/eqv;)V

    .line 882
    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->t:Lo/eqy;

    invoke-static {v0}, Lo/eoz;->b(Lo/eqv;)V

    .line 883
    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->s:Lo/etd;

    invoke-static {v0}, Lo/eoz;->b(Lo/eqv;)V

    .line 884
    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->y:Lo/esl;

    invoke-static {v0}, Lo/eoz;->b(Lo/eqv;)V

    .line 885
    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->m:Lo/eqt;

    invoke-static {v0}, Lo/eoz;->b(Lo/eqv;)V

    .line 886
    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->r:Lo/etm;

    invoke-static {v0}, Lo/eoz;->b(Lo/eqv;)V

    .line 887
    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->z:Lo/etm;

    invoke-static {v0}, Lo/eoz;->b(Lo/eqv;)V

    .line 888
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->E:Z

    .line 889
    return-void
.end method

.method private u()V
    .locals 5

    .line 1046
    const-string v0, "UIHLH_HomeFragment"

    const/4 v1, 0x1

    :try_start_0
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "unregisterWearBroadcast"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1047
    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->f:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/ui/homehealth/HomeFragment;->F:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 1052
    goto :goto_0

    .line 1048
    :catch_0
    move-exception v4

    .line 1049
    const-string v0, "UIHLH_HomeFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/lang/IllegalArgumentException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1052
    goto :goto_0

    .line 1050
    :catch_1
    move-exception v4

    .line 1051
    const-string v0, "UIHLH_HomeFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1053
    :goto_0
    return-void
.end method

.method static synthetic u(Lcom/huawei/ui/homehealth/HomeFragment;)V
    .locals 0

    .line 149
    invoke-direct {p0}, Lcom/huawei/ui/homehealth/HomeFragment;->j()V

    return-void
.end method

.method private v()V
    .locals 5

    .line 1258
    const-string v0, "UIHLH_HomeFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter registerAW70SyncFinshBrodcast"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1259
    new-instance v4, Landroid/content/IntentFilter;

    const-string v0, "com.huawei.health.action.AW70_FITNESS_DETAIL_SYNC_SUCCESS_ACTION"

    invoke-direct {v4, v0}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 1260
    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->f:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/ui/homehealth/HomeFragment;->K:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1, v4}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 1261
    return-void
.end method

.method private w()V
    .locals 5

    .line 1267
    const-string v0, "UIHLH_HomeFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter unRegisterAW70SyncFinshBrodcast"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1269
    :try_start_0
    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->f:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/ui/homehealth/HomeFragment;->K:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1

    .line 1274
    goto :goto_0

    .line 1270
    :catch_0
    move-exception v4

    .line 1271
    const-string v0, "UIHLH_HomeFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "unRegisterAW70SyncFinshBrodcast "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Ljava/lang/IllegalArgumentException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1274
    goto :goto_0

    .line 1272
    :catch_1
    move-exception v4

    .line 1273
    const-string v0, "UIHLH_HomeFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "unRegisterAW70SyncFinshBrodcast "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Ljava/lang/RuntimeException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1275
    :goto_0
    return-void
.end method

.method private x()V
    .locals 5

    .line 1183
    :try_start_0
    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->f:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/ui/homehealth/HomeFragment;->L:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1

    .line 1188
    goto :goto_0

    .line 1184
    :catch_0
    move-exception v4

    .line 1185
    const-string v0, "UIHLH_HomeFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "unRegisterBatteryBroadcast "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Ljava/lang/IllegalArgumentException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1188
    goto :goto_0

    .line 1186
    :catch_1
    move-exception v4

    .line 1187
    const-string v0, "UIHLH_HomeFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "unRegisterBatteryBroadcast "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Ljava/lang/RuntimeException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1189
    :goto_0
    return-void
.end method

.method private y()V
    .locals 4

    .line 1410
    const-string v0, "UIHLH_HomeFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getMaintWhenSyncSuccess()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1411
    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->h:Lo/eog;

    new-instance v1, Lcom/huawei/ui/homehealth/HomeFragment$k;

    iget-object v2, p0, Lcom/huawei/ui/homehealth/HomeFragment;->h:Lo/eog;

    invoke-direct {v1, v2}, Lcom/huawei/ui/homehealth/HomeFragment$k;-><init>(Lo/eog;)V

    invoke-virtual {v0, v1}, Lo/eog;->a(Lcom/huawei/hwdevicedfxmanager/callback/IDeviceDFXBaseResponseCallback;)V

    .line 1412
    return-void
.end method

.method static synthetic y(Lcom/huawei/ui/homehealth/HomeFragment;)V
    .locals 0

    .line 149
    invoke-direct {p0}, Lcom/huawei/ui/homehealth/HomeFragment;->G()V

    return-void
.end method

.method private z()V
    .locals 5

    .line 1172
    const-string v0, "UIHLH_HomeFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter registerBattery"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1173
    new-instance v4, Landroid/content/IntentFilter;

    const-string v0, "com.huawei.bone.action.BATTERY_LEVEL"

    invoke-direct {v4, v0}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 1174
    const-string v0, "com.huawei.bone.action.BATTERY_LEVEL"

    invoke-virtual {v4, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 1175
    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->f:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/ui/homehealth/HomeFragment;->L:Landroid/content/BroadcastReceiver;

    sget-object v2, Lo/dac;->a:Ljava/lang/String;

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v4, v2, v3}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Ljava/lang/String;Landroid/os/Handler;)Landroid/content/Intent;

    .line 1176
    return-void
.end method

.method static synthetic z(Lcom/huawei/ui/homehealth/HomeFragment;)Z
    .locals 1

    .line 149
    iget-boolean v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->G:Z

    return v0
.end method


# virtual methods
.method public a()Z
    .locals 1

    .line 243
    iget-boolean v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->E:Z

    return v0
.end method

.method public b()V
    .locals 5

    .line 577
    const-string v0, "UIHLH_HomeFragment"

    const-string v1, "-readConfig enter"

    invoke-static {v0, v1}, Lo/dbf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 579
    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->f:Landroid/content/Context;

    invoke-static {v0}, Lo/epa;->c(Landroid/content/Context;)Ljava/util/Map;

    move-result-object v4

    .line 580
    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->p:Lo/epf;

    sget-object v1, Lo/eqq$c;->e:Lo/eqq$c;

    invoke-virtual {v1}, Lo/eqq$c;->c()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v4, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v0, v1}, Lo/epf;->d(I)V

    .line 581
    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->u:Lo/esm;

    sget-object v1, Lo/eqq$c;->d:Lo/eqq$c;

    invoke-virtual {v1}, Lo/eqq$c;->c()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v4, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v0, v1}, Lo/esm;->d(I)V

    .line 582
    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->q:Lo/epv;

    sget-object v1, Lo/eqq$c;->b:Lo/eqq$c;

    invoke-virtual {v1}, Lo/eqq$c;->c()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v4, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v0, v1}, Lo/epv;->d(I)V

    .line 583
    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->w:Lo/eqx;

    sget-object v1, Lo/eqq$c;->f:Lo/eqq$c;

    invoke-virtual {v1}, Lo/eqq$c;->c()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v4, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v0, v1}, Lo/eqx;->d(I)V

    .line 584
    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->t:Lo/eqy;

    sget-object v1, Lo/eqq$c;->k:Lo/eqq$c;

    invoke-virtual {v1}, Lo/eqq$c;->c()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v4, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v0, v1}, Lo/eqy;->d(I)V

    .line 585
    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->s:Lo/etd;

    sget-object v1, Lo/eqq$c;->h:Lo/eqq$c;

    invoke-virtual {v1}, Lo/eqq$c;->c()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v4, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v0, v1}, Lo/etd;->d(I)V

    .line 586
    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->r:Lo/etm;

    sget-object v1, Lo/eqq$c;->n:Lo/eqq$c;

    invoke-virtual {v1}, Lo/eqq$c;->c()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v4, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v0, v1}, Lo/etm;->d(I)V

    .line 587
    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->z:Lo/etm;

    sget-object v1, Lo/eqq$c;->o:Lo/eqq$c;

    invoke-virtual {v1}, Lo/eqq$c;->c()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v4, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v0, v1}, Lo/etm;->d(I)V

    .line 588
    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->y:Lo/esl;

    sget-object v1, Lo/eqq$c;->m:Lo/eqq$c;

    invoke-virtual {v1}, Lo/eqq$c;->c()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v4, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v0, v1}, Lo/esl;->d(I)V

    .line 589
    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->m:Lo/eqt;

    sget-object v1, Lo/eqq$c;->l:Lo/eqq$c;

    invoke-virtual {v1}, Lo/eqq$c;->c()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v4, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v0, v1}, Lo/eqt;->d(I)V

    .line 590
    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->o:Lo/esv;

    sget-object v1, Lo/eqq$c;->c:Lo/eqq$c;

    invoke-virtual {v1}, Lo/eqq$c;->c()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v4, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v0, v1}, Lo/esv;->d(I)V

    .line 593
    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->g:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 594
    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->g:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/huawei/ui/homehealth/HomeFragment;->i:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 597
    const-string v0, "UIHLH_HomeFragment"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updateCardSort() mAdapter = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/ui/homehealth/HomeFragment;->d:Lo/epe;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " mRecyclerView = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/ui/homehealth/HomeFragment;->k:Landroid/support/v7/widget/RecyclerView;

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 598
    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->d:Lo/epe;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->k:Landroid/support/v7/widget/RecyclerView;

    if-eqz v0, :cond_0

    .line 599
    const-string v0, "UIHLH_HomeFragment"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updateCardSort() mAdapter = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/ui/homehealth/HomeFragment;->d:Lo/epe;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " mRecyclerView = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/ui/homehealth/HomeFragment;->k:Landroid/support/v7/widget/RecyclerView;

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, " mCardDatas.size = "

    const/4 v3, 0x4

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/ui/homehealth/HomeFragment;->g:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 600
    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->k:Landroid/support/v7/widget/RecyclerView;

    new-instance v1, Landroid/support/v7/widget/LinearLayoutManager;

    iget-object v2, p0, Lcom/huawei/ui/homehealth/HomeFragment;->f:Landroid/content/Context;

    invoke-direct {v1, v2}, Landroid/support/v7/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    .line 601
    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->d:Lo/epe;

    iget-object v1, p0, Lcom/huawei/ui/homehealth/HomeFragment;->g:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Lo/epe;->e(Ljava/util/ArrayList;)V

    .line 602
    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->k:Landroid/support/v7/widget/RecyclerView;

    iget-object v1, p0, Lcom/huawei/ui/homehealth/HomeFragment;->d:Lo/epe;

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setAdapter(Landroid/support/v7/widget/RecyclerView$Adapter;)V

    .line 603
    const-string v0, "UIHLH_HomeFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updateCardSort() end"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 605
    :cond_0
    const-string v0, "UIHLH_HomeFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updateCardSort() -readConfig end"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 606
    const-string v0, "UIHLH_HomeFragment"

    const-string v1, "-readConfig end"

    invoke-static {v0, v1}, Lo/dbf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 607
    return-void
.end method

.method public c(II)V
    .locals 5

    .line 1471
    new-instance v0, Lo/egv$b;

    iget-object v1, p0, Lcom/huawei/ui/homehealth/HomeFragment;->f:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/egv$b;-><init>(Landroid/content/Context;)V

    sget v1, Lcom/huawei/ui/homehealth/R$string;->IDS_device_replace_dialog_title_notification:I

    .line 1472
    invoke-virtual {v0, v1}, Lo/egv$b;->b(I)Lo/egv$b;

    move-result-object v0

    .line 1473
    invoke-virtual {v0, p1}, Lo/egv$b;->e(I)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$string;->IDS_settings_button_ok:I

    new-instance v2, Lcom/huawei/ui/homehealth/HomeFragment$10;

    invoke-direct {v2, p0, p2}, Lcom/huawei/ui/homehealth/HomeFragment$10;-><init>(Lcom/huawei/ui/homehealth/HomeFragment;I)V

    .line 1474
    invoke-virtual {v0, v1, v2}, Lo/egv$b;->e(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$string;->IDS_settings_button_cancal:I

    new-instance v2, Lcom/huawei/ui/homehealth/HomeFragment$6;

    invoke-direct {v2, p0}, Lcom/huawei/ui/homehealth/HomeFragment$6;-><init>(Lcom/huawei/ui/homehealth/HomeFragment;)V

    .line 1495
    invoke-virtual {v0, v1, v2}, Lo/egv$b;->b(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    move-result-object v3

    .line 1500
    invoke-virtual {v3}, Lo/egv$b;->b()Lo/egv;

    move-result-object v4

    .line 1501
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Lo/egv;->setCancelable(Z)V

    .line 1502
    invoke-virtual {v4}, Lo/egv;->isShowing()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/huawei/ui/homehealth/HomeFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 1503
    invoke-virtual {v4}, Lo/egv;->show()V

    .line 1505
    :cond_0
    return-void
.end method

.method public onActivityCreated(Landroid/os/Bundle;)V
    .locals 16

    .line 288
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-super {v0, v1}, Landroid/support/v4/app/Fragment;->onActivityCreated(Landroid/os/Bundle;)V

    .line 289
    const-string v0, "TimeEat_HomeFragment"

    const-string v1, "Enter onActivityCreated"

    invoke-static {v0, v1}, Lo/dbf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 291
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/ui/homehealth/HomeFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/huawei/ui/homehealth/HomeFragment;->f:Landroid/content/Context;

    .line 292
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homehealth/HomeFragment;->f:Landroid/content/Context;

    if-nez v0, :cond_0

    .line 293
    const-string v0, "UIHLH_HomeFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onActivityCreated mContext== null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 294
    return-void

    .line 296
    :cond_0
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/ui/homehealth/HomeFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    check-cast v0, Lcom/huawei/ui/homehealth/HomeFragment$c;

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/huawei/ui/homehealth/HomeFragment;->C:Lcom/huawei/ui/homehealth/HomeFragment$c;

    .line 297
    new-instance v0, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;

    invoke-virtual/range {p0 .. p0}, Lcom/huawei/ui/homehealth/HomeFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    move-object/from16 v2, p0

    iget-object v2, v2, Lcom/huawei/ui/homehealth/HomeFragment;->C:Lcom/huawei/ui/homehealth/HomeFragment$c;

    move-object/from16 v3, p0

    invoke-direct {v0, v1, v2, v3}, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;-><init>(Landroid/app/Activity;Lcom/huawei/ui/homehealth/HomeFragment$c;Lcom/huawei/ui/homehealth/HomeFragment;)V

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/huawei/ui/homehealth/HomeFragment;->j:Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;

    .line 298
    new-instance v0, Lo/esh;

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/ui/homehealth/HomeFragment;->f:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/esh;-><init>(Landroid/content/Context;)V

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/huawei/ui/homehealth/HomeFragment;->B:Lo/esh;

    .line 299
    new-instance v0, Lcom/huawei/ui/homehealth/HomeFragment$e;

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/ui/homehealth/HomeFragment;->f:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/huawei/ui/homehealth/HomeFragment$e;-><init>(Landroid/content/Context;)V

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/huawei/ui/homehealth/HomeFragment;->H:Lcom/huawei/ui/homehealth/HomeFragment$e;

    .line 303
    const-string v0, "UIHLH_HomeFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onActivityCreated mContext="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    move-object/from16 v2, p0

    iget-object v2, v2, Lcom/huawei/ui/homehealth/HomeFragment;->f:Landroid/content/Context;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 306
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homehealth/HomeFragment;->f:Landroid/content/Context;

    check-cast v0, Landroid/app/Activity;

    sget v1, Lcom/huawei/ui/homehealth/R$id;->swiperefreshlayout:I

    invoke-virtual {v0, v1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/huawei/ui/homehealth/HomeFragment;->l:Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;

    .line 307
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homehealth/HomeFragment;->l:Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;

    invoke-virtual {v0}, Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;->getRecyclerView()Landroid/support/v7/widget/RecyclerView;

    move-result-object v0

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/huawei/ui/homehealth/HomeFragment;->k:Landroid/support/v7/widget/RecyclerView;

    .line 309
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homehealth/HomeFragment;->k:Landroid/support/v7/widget/RecyclerView;

    if-nez v0, :cond_1

    .line 310
    const-string v0, "UIHLH_HomeFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initListView mRecyclerView == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 311
    return-void

    .line 313
    :cond_1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/huawei/ui/homehealth/HomeFragment;->g:Ljava/util/ArrayList;

    .line 314
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/huawei/ui/homehealth/HomeFragment;->i:Ljava/util/ArrayList;

    .line 315
    new-instance v0, Lo/epe;

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/ui/homehealth/HomeFragment;->f:Landroid/content/Context;

    move-object/from16 v2, p0

    iget-object v2, v2, Lcom/huawei/ui/homehealth/HomeFragment;->g:Ljava/util/ArrayList;

    invoke-direct {v0, v1, v2}, Lo/epe;-><init>(Landroid/content/Context;Ljava/util/List;)V

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/huawei/ui/homehealth/HomeFragment;->d:Lo/epe;

    .line 316
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homehealth/HomeFragment;->k:Landroid/support/v7/widget/RecyclerView;

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/ui/homehealth/HomeFragment;->f:Landroid/content/Context;

    move-object/from16 v2, p0

    iget-object v2, v2, Lcom/huawei/ui/homehealth/HomeFragment;->d:Lo/epe;

    invoke-static {v0, v1, v2}, Lo/epa;->e(Landroid/support/v7/widget/RecyclerView;Landroid/content/Context;Lo/epe;)V

    .line 317
    new-instance v0, Lcom/huawei/ui/homehealth/HomeFragment$b;

    move-object/from16 v1, p0

    invoke-direct {v0, v1}, Lcom/huawei/ui/homehealth/HomeFragment$b;-><init>(Lcom/huawei/ui/homehealth/HomeFragment;)V

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/huawei/ui/homehealth/HomeFragment;->e:Landroid/os/Handler;

    .line 319
    invoke-direct/range {p0 .. p0}, Lcom/huawei/ui/homehealth/HomeFragment;->e()V

    .line 320
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homehealth/HomeFragment;->f:Landroid/content/Context;

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/ui/homehealth/HomeFragment;->o:Lo/esv;

    move-object/from16 v2, p0

    iget-object v2, v2, Lcom/huawei/ui/homehealth/HomeFragment;->p:Lo/epf;

    move-object/from16 v3, p0

    iget-object v3, v3, Lcom/huawei/ui/homehealth/HomeFragment;->q:Lo/epv;

    move-object/from16 v4, p0

    iget-object v4, v4, Lcom/huawei/ui/homehealth/HomeFragment;->w:Lo/eqx;

    move-object/from16 v5, p0

    iget-object v5, v5, Lcom/huawei/ui/homehealth/HomeFragment;->t:Lo/eqy;

    move-object/from16 v6, p0

    iget-object v6, v6, Lcom/huawei/ui/homehealth/HomeFragment;->s:Lo/etd;

    move-object/from16 v7, p0

    iget-object v7, v7, Lcom/huawei/ui/homehealth/HomeFragment;->r:Lo/etm;

    move-object/from16 v8, p0

    iget-object v8, v8, Lcom/huawei/ui/homehealth/HomeFragment;->z:Lo/etm;

    move-object/from16 v9, p0

    iget-object v9, v9, Lcom/huawei/ui/homehealth/HomeFragment;->y:Lo/esl;

    move-object/from16 v10, p0

    iget-object v10, v10, Lcom/huawei/ui/homehealth/HomeFragment;->m:Lo/eqt;

    move-object/from16 v11, p0

    iget-object v11, v11, Lcom/huawei/ui/homehealth/HomeFragment;->i:Ljava/util/ArrayList;

    move-object/from16 v12, p0

    iget-object v12, v12, Lcom/huawei/ui/homehealth/HomeFragment;->g:Ljava/util/ArrayList;

    move-object/from16 v13, p0

    iget-object v13, v13, Lcom/huawei/ui/homehealth/HomeFragment;->k:Landroid/support/v7/widget/RecyclerView;

    move-object/from16 v14, p0

    iget-object v14, v14, Lcom/huawei/ui/homehealth/HomeFragment;->d:Lo/epe;

    move-object/from16 v15, p0

    iget-object v15, v15, Lcom/huawei/ui/homehealth/HomeFragment;->u:Lo/esm;

    invoke-static/range {v0 .. v15}, Lo/epa;->a(Landroid/content/Context;Lo/eqv;Lo/eqv;Lo/eqv;Lo/eqv;Lo/eqv;Lo/eqv;Lo/eqv;Lo/eqv;Lo/eqv;Lo/eqv;Ljava/util/ArrayList;Ljava/util/ArrayList;Landroid/support/v7/widget/RecyclerView;Lo/epe;Lo/eqv;)V

    .line 337
    const/4 v0, 0x1

    move-object/from16 v1, p0

    iput-boolean v0, v1, Lcom/huawei/ui/homehealth/HomeFragment;->E:Z

    .line 338
    invoke-direct/range {p0 .. p0}, Lcom/huawei/ui/homehealth/HomeFragment;->i()V

    .line 339
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/huawei/ui/homehealth/HomeFragment;->x:Ljava/util/concurrent/ExecutorService;

    .line 340
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homehealth/HomeFragment;->x:Ljava/util/concurrent/ExecutorService;

    if-eqz v0, :cond_2

    .line 341
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homehealth/HomeFragment;->x:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/huawei/ui/homehealth/HomeFragment$3;

    move-object/from16 v2, p0

    invoke-direct {v1, v2}, Lcom/huawei/ui/homehealth/HomeFragment$3;-><init>(Lcom/huawei/ui/homehealth/HomeFragment;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 363
    :cond_2
    invoke-static {}, Lo/akv;->e()Lo/akv;

    move-result-object v0

    new-instance v1, Lcom/huawei/ui/homehealth/HomeFragment$12;

    move-object/from16 v2, p0

    invoke-direct {v1, v2}, Lcom/huawei/ui/homehealth/HomeFragment$12;-><init>(Lcom/huawei/ui/homehealth/HomeFragment;)V

    invoke-virtual {v0, v1}, Lo/akv;->c(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 372
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homehealth/HomeFragment;->k:Landroid/support/v7/widget/RecyclerView;

    new-instance v1, Lcom/huawei/ui/homehealth/HomeFragment$13;

    move-object/from16 v2, p0

    invoke-direct {v1, v2}, Lcom/huawei/ui/homehealth/HomeFragment$13;-><init>(Lcom/huawei/ui/homehealth/HomeFragment;)V

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setOnScrollListener(Landroid/support/v7/widget/RecyclerView$OnScrollListener;)V

    .line 394
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homehealth/HomeFragment;->f:Landroid/content/Context;

    invoke-static {v0}, Lo/aeu;->e(Landroid/content/Context;)Lo/aeu;

    move-result-object v0

    invoke-virtual {v0}, Lo/aeu;->d()V

    .line 397
    invoke-static {}, Lo/dbf;->q()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 398
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homehealth/HomeFragment;->e:Landroid/os/Handler;

    const/16 v1, 0x9

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 399
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homehealth/HomeFragment;->e:Landroid/os/Handler;

    const/16 v1, 0x9

    const-wide/16 v2, 0xbb8

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 400
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homehealth/HomeFragment;->p:Lo/epf;

    invoke-virtual {v0}, Lo/epf;->k()V

    .line 403
    :cond_3
    new-instance v0, Lo/eog;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/eog;-><init>(Landroid/content/Context;)V

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/huawei/ui/homehealth/HomeFragment;->h:Lo/eog;

    .line 405
    const-string v0, "TimeEat_HomeFragment"

    const-string v1, "Leave onActivityCreated"

    invoke-static {v0, v1}, Lo/dbf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 406
    return-void
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 4

    .line 409
    const-string v0, "UIHLH_HomeFragment"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter onActivityResult requestcode:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ";resultcode:"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 410
    invoke-super {p0, p1, p2, p3}, Landroid/support/v4/app/Fragment;->onActivityResult(IILandroid/content/Intent;)V

    .line 411
    sparse-switch p1, :sswitch_data_0

    goto :goto_0

    .line 413
    :sswitch_0
    const-string v0, "UIHLH_HomeFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter checkGpsPermission"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 414
    invoke-direct {p0}, Lcom/huawei/ui/homehealth/HomeFragment;->A()V

    .line 415
    goto :goto_1

    .line 417
    :goto_0
    const-string v0, "UIHLH_HomeFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter onActivityResult default"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 419
    :goto_1
    return-void

    :sswitch_data_0
    .sparse-switch
        0x65 -> :sswitch_0
    .end sparse-switch
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 4

    .line 248
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onCreate(Landroid/os/Bundle;)V

    .line 249
    const-string v0, "UIHLH_HomeFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCreate "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p0, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 250
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 6

    .line 254
    const-string v0, "TimeEat_HomeFragment"

    const-string v1, "Enter onCreateView"

    invoke-static {v0, v1}, Lo/dbf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 255
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "KEY_ISCREAETDIAOG_KEY_ISCREAETDIAOG_TO_HOME"

    const-string v3, "100002"

    const/4 v4, 0x0

    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 259
    sget v0, Lcom/huawei/ui/homehealth/R$layout;->swipe_recycleview_layout:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v5

    .line 261
    invoke-direct {p0, v5}, Lcom/huawei/ui/homehealth/HomeFragment;->c(Landroid/view/View;)V

    .line 262
    invoke-direct {p0}, Lcom/huawei/ui/homehealth/HomeFragment;->I()V

    .line 263
    const-string v0, "TimeEat_HomeFragment"

    const-string v1, "Leave onCreateView"

    invoke-static {v0, v1}, Lo/dbf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 264
    return-object v5
.end method

.method public onDestroy()V
    .locals 5

    .line 800
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onDestroy()V

    .line 801
    const-string v0, "UIHLH_HomeFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onDestroy "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p0, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 802
    invoke-direct {p0}, Lcom/huawei/ui/homehealth/HomeFragment;->t()V

    .line 803
    invoke-direct {p0}, Lcom/huawei/ui/homehealth/HomeFragment;->w()V

    .line 808
    invoke-static {}, Lo/akv;->e()Lo/akv;

    move-result-object v0

    invoke-virtual {v0}, Lo/akv;->b()V

    .line 809
    invoke-static {}, Lo/dbf;->q()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 810
    invoke-direct {p0}, Lcom/huawei/ui/homehealth/HomeFragment;->u()V

    .line 811
    invoke-direct {p0}, Lcom/huawei/ui/homehealth/HomeFragment;->x()V

    .line 812
    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->e:Landroid/os/Handler;

    const/16 v1, 0x9

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 815
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->x:Ljava/util/concurrent/ExecutorService;

    if-eqz v0, :cond_1

    .line 816
    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->x:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 817
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->x:Ljava/util/concurrent/ExecutorService;

    .line 820
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->f:Landroid/content/Context;

    invoke-static {v0}, Lo/aeu;->e(Landroid/content/Context;)Lo/aeu;

    move-result-object v0

    invoke-virtual {v0}, Lo/aeu;->c()V

    .line 821
    new-instance v4, Lo/fcb;

    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->f:Landroid/content/Context;

    invoke-direct {v4, v0}, Lo/fcb;-><init>(Landroid/content/Context;)V

    .line 822
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Lo/fcb;->e(Ljava/lang/String;)V

    .line 823
    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->j:Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;

    if-eqz v0, :cond_2

    .line 824
    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->j:Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;

    invoke-virtual {v0}, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;->closeWindow()V

    .line 825
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->j:Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;

    .line 827
    :cond_2
    const-string v0, "UIHLH_HomeFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onDestroy mEventBusCallback "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/ui/homehealth/HomeFragment;->H:Lcom/huawei/ui/homehealth/HomeFragment$e;

    if-eqz v2, :cond_3

    const/4 v2, 0x1

    goto :goto_0

    :cond_3
    const/4 v2, 0x0

    :goto_0
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 832
    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->l:Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    .line 833
    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->l:Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;->setOnSwipeRecyclerViewListener(Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView$c;)V

    .line 834
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->l:Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;

    .line 837
    :cond_4
    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->k:Landroid/support/v7/widget/RecyclerView;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_5

    .line 838
    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->k:Landroid/support/v7/widget/RecyclerView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setOnScrollListener(Landroid/support/v7/widget/RecyclerView$OnScrollListener;)V

    .line 839
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->k:Landroid/support/v7/widget/RecyclerView;

    .line 842
    :cond_5
    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->f:Landroid/content/Context;

    invoke-static {v0}, Lo/etr;->a(Landroid/content/Context;)Lo/etr;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/etr;->c(Landroid/os/Handler;)V

    .line 844
    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->e:Landroid/os/Handler;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_6

    .line 845
    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->e:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 846
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->e:Landroid/os/Handler;

    .line 849
    :cond_6
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->f:Landroid/content/Context;

    .line 850
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->C:Lcom/huawei/ui/homehealth/HomeFragment$c;

    .line 851
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->w:Lo/eqx;

    .line 852
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->p:Lo/epf;

    .line 853
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->s:Lo/etd;

    .line 854
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->o:Lo/esv;

    .line 855
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->z:Lo/etm;

    .line 856
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->r:Lo/etm;

    .line 857
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->y:Lo/esl;

    .line 858
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->d:Lo/epe;

    .line 859
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->t:Lo/eqy;

    .line 860
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->u:Lo/esm;

    .line 861
    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->g:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 862
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->g:Ljava/util/ArrayList;

    .line 863
    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->i:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 864
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->i:Ljava/util/ArrayList;

    .line 865
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->m:Lo/eqt;

    .line 866
    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->D:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 867
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->D:Ljava/util/Map;

    .line 868
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->H:Lcom/huawei/ui/homehealth/HomeFragment$e;

    .line 869
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->n:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 870
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->q:Lo/epv;

    .line 872
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->h:Lo/eog;

    .line 873
    return-void
.end method

.method public onPause()V
    .locals 4

    .line 657
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onPause()V

    .line 658
    const-string v0, "UIHLH_HomeFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onPause "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p0, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 659
    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->o:Lo/esv;

    if-eqz v0, :cond_0

    .line 660
    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->o:Lo/esv;

    invoke-virtual {v0}, Lo/esv;->b()V

    .line 662
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->r:Lo/etm;

    if-eqz v0, :cond_1

    .line 663
    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->r:Lo/etm;

    check-cast v0, Lo/etn;

    invoke-virtual {v0}, Lo/etn;->k()V

    .line 665
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->f:Landroid/content/Context;

    invoke-static {v0}, Lo/aeu;->e(Landroid/content/Context;)Lo/aeu;

    move-result-object v0

    invoke-virtual {v0}, Lo/aeu;->b()V

    .line 666
    return-void
.end method

.method public onResume()V
    .locals 4

    .line 611
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onResume()V

    .line 612
    const-string v0, "UIHLH_HomeFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onResume"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p0, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 613
    const-string v0, "TimeEat_HomeFragment"

    const-string v1, "Enter onResume"

    invoke-static {v0, v1}, Lo/dbf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 614
    iget-boolean v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->v:Z

    if-nez v0, :cond_0

    .line 615
    const-string v0, "UIHLH_HomeFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "!isfirstcreate"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 616
    const/4 v0, -0x1

    invoke-static {v0}, Lo/erd;->e(I)V

    .line 617
    invoke-direct {p0}, Lcom/huawei/ui/homehealth/HomeFragment;->q()V

    goto :goto_0

    .line 619
    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->v:Z

    .line 621
    :goto_0
    invoke-direct {p0}, Lcom/huawei/ui/homehealth/HomeFragment;->C()V

    .line 622
    invoke-static {}, Lo/czu;->b()Z

    move-result v0

    if-nez v0, :cond_1

    .line 623
    invoke-direct {p0}, Lcom/huawei/ui/homehealth/HomeFragment;->p()V

    .line 624
    invoke-direct {p0}, Lcom/huawei/ui/homehealth/HomeFragment;->m()V

    .line 625
    invoke-direct {p0}, Lcom/huawei/ui/homehealth/HomeFragment;->n()V

    .line 629
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->f:Landroid/content/Context;

    invoke-static {v0}, Lo/etr;->a(Landroid/content/Context;)Lo/etr;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/homehealth/HomeFragment;->e:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Lo/etr;->c(Landroid/os/Handler;)V

    .line 630
    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->j:Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->j:Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;

    invoke-virtual {v0}, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;->isNeedRefresh()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 631
    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->j:Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;

    invoke-virtual {v0}, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;->fetchRedPacketInfo()V

    .line 632
    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->j:Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;->setNeedRefresh(Z)V

    .line 634
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->f:Landroid/content/Context;

    invoke-static {v0}, Lo/aeu;->e(Landroid/content/Context;)Lo/aeu;

    move-result-object v0

    invoke-virtual {v0}, Lo/aeu;->a()V

    .line 635
    invoke-direct {p0}, Lcom/huawei/ui/homehealth/HomeFragment;->D()V

    .line 636
    invoke-direct {p0}, Lcom/huawei/ui/homehealth/HomeFragment;->g()V

    .line 637
    const-string v0, "TimeEat_HomeFragment"

    const-string v1, "Leave onResume"

    invoke-static {v0, v1}, Lo/dbf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 638
    return-void
.end method

.method public onStop()V
    .locals 4

    .line 794
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onStop()V

    .line 795
    const-string v0, "UIHLH_HomeFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onStop "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p0, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 796
    return-void
.end method

.method public setUserVisibleHint(Z)V
    .locals 4

    .line 670
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->setUserVisibleHint(Z)V

    .line 671
    const-string v0, "UIHLH_HomeFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HomeFragment setUserVisibleHint:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 672
    iput-boolean p1, p0, Lcom/huawei/ui/homehealth/HomeFragment;->a:Z

    .line 673
    invoke-virtual {p0}, Lcom/huawei/ui/homehealth/HomeFragment;->isResumed()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 674
    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->f:Landroid/content/Context;

    invoke-static {v0}, Lo/aeu;->e(Landroid/content/Context;)Lo/aeu;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/aeu;->c(Z)V

    .line 676
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->j:Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;

    if-eqz v0, :cond_2

    .line 677
    if-eqz p1, :cond_1

    .line 678
    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->j:Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;

    invoke-virtual {v0}, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;->showWindow()V

    goto :goto_0

    .line 680
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->j:Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;

    invoke-virtual {v0}, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;->hintWindow()V

    .line 683
    :cond_2
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->p:Lo/epf;

    if-eqz v0, :cond_4

    if-eqz p1, :cond_4

    .line 684
    const-string v0, "UIHLH_HomeFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setUserVisibleHint mAchievementCardData != null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 686
    invoke-static {}, Lo/czu;->b()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 687
    const-string v0, "UIHLH_HomeFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showAchieveCardTips isOversea"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 688
    return-void

    .line 690
    :cond_3
    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->p:Lo/epf;

    invoke-virtual {v0, p1}, Lo/epf;->d(Z)V

    .line 691
    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->f:Landroid/content/Context;

    invoke-static {v0}, Lo/ets;->n(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 692
    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment;->p:Lo/epf;

    invoke-virtual {v0}, Lo/epf;->e()V

    .line 695
    :cond_4
    return-void
.end method
