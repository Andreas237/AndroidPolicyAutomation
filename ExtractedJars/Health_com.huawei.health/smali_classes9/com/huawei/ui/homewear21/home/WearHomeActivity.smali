.class public Lcom/huawei/ui/homewear21/home/WearHomeActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"

# interfaces
.implements Landroid/support/v4/app/ActivityCompat$OnRequestPermissionsResultCallback;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/ui/homewear21/home/WearHomeActivity$b;,
        Lcom/huawei/ui/homewear21/home/WearHomeActivity$a;,
        Lcom/huawei/ui/homewear21/home/WearHomeActivity$d;
    }
.end annotation


# static fields
.field private static P:Lo/dde;

.field private static aC:Lcom/huawei/lcagent/client/LogCollectManager;

.field private static aE:Lcom/huawei/lcagent/client/LogMetricInfo;

.field private static aV:Lo/egv;

.field private static ai:Z

.field private static aj:[Ljava/lang/String;

.field private static ak:[Ljava/lang/String;

.field private static am:Ljava/util/concurrent/ExecutorService;

.field private static be:[Ljava/lang/String;

.field private static bh:[Ljava/lang/String;

.field private static e:I


# instance fields
.field private A:Lo/etu;

.field private B:Landroid/widget/ScrollView;

.field private C:Ljava/lang/String;

.field private D:Z

.field private E:Lo/ego;

.field private F:I

.field private G:Lo/ego$a;

.field private H:Ljava/lang/String;

.field private I:Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;

.field private J:Landroid/widget/RelativeLayout;

.field private K:Landroid/widget/RelativeLayout;

.field private L:Landroid/widget/RelativeLayout;

.field private M:Landroid/widget/RelativeLayout;

.field private N:Landroid/widget/RelativeLayout;

.field private O:Lo/fip;

.field private Q:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

.field private R:Lo/cxf;

.field private S:Landroid/widget/RelativeLayout;

.field private T:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

.field private U:Landroid/widget/ListView;

.field private V:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lo/eoq;>;"
        }
    .end annotation
.end field

.field private W:Lo/eos;

.field private X:Ljava/lang/String;

.field private Y:Lo/egv;

.field private Z:Lo/egv;

.field a:Lo/fhq;

.field private aA:Lo/eoi;

.field private aB:Lo/eog;

.field private aD:Lcom/huawei/ui/homewear21/home/WearHomeActivity$d;

.field private aF:Lo/dip;

.field private aG:Landroid/view/View$OnClickListener;

.field private aH:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field private aI:Landroid/widget/CompoundButton$OnCheckedChangeListener;

.field private aJ:Landroid/widget/CompoundButton$OnCheckedChangeListener;

.field private aK:Landroid/widget/CompoundButton$OnCheckedChangeListener;

.field private aL:Landroid/widget/AdapterView$OnItemClickListener;

.field private aM:Landroid/widget/CompoundButton$OnCheckedChangeListener;

.field private aN:Landroid/view/View$OnClickListener;

.field private aO:Landroid/widget/CompoundButton$OnCheckedChangeListener;

.field private aP:Landroid/widget/CompoundButton$OnCheckedChangeListener;

.field private aQ:Landroid/os/Handler;

.field private final aR:Landroid/content/BroadcastReceiver;

.field private final aS:Landroid/content/BroadcastReceiver;

.field private final aT:Landroid/content/BroadcastReceiver;

.field private aU:Ljava/lang/Runnable;

.field private aW:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field private final aX:Landroid/content/BroadcastReceiver;

.field private final aY:Landroid/content/BroadcastReceiver;

.field private final aZ:Landroid/content/BroadcastReceiver;

.field private aa:Lo/egv;

.field private ab:Lo/egn;

.field private ac:Lo/eoe;

.field private ad:Landroid/widget/LinearLayout;

.field private ae:J

.field private af:Lo/etw;

.field private ag:I

.field private ah:I

.field private al:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;>;"
        }
    .end annotation
.end field

.field private an:Landroid/view/View;

.field private ao:Lo/egy;

.field private ap:Ljava/lang/Object;

.field private aq:Ljava/lang/Object;

.field private ar:Lo/egv;

.field private as:Lo/ety;

.field private at:Landroid/widget/TextView;

.field private au:Landroid/widget/TextView;

.field private av:Landroid/widget/TextView;

.field private aw:Landroid/widget/TextView;

.field private ax:Lo/dqi;

.field private ay:Lo/emr;

.field private az:Z

.field private b:Lo/egd;

.field private ba:Landroid/content/BroadcastReceiver;

.field private bb:Lo/egv;

.field private bc:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/ui/homewear21/home/WearHomeActivity$b;>;"
        }
    .end annotation
.end field

.field private bd:Landroid/content/BroadcastReceiver;

.field private final bf:Landroid/content/BroadcastReceiver;

.field private bg:Z

.field private bi:Lo/egn;

.field private bj:Lo/egv;

.field private bk:Z

.field private bl:Lcom/huawei/hwdevicedfxmanager/callback/IDeviceDFXBaseResponseCallback;

.field private bm:Landroid/content/BroadcastReceiver;

.field private final bn:Landroid/content/BroadcastReceiver;

.field private bo:Lcom/huawei/hwdevicedfxmanager/callback/IDeviceDFXUploadCallback;

.field private bp:Landroid/widget/CompoundButton$OnCheckedChangeListener;

.field private br:Lo/egv;

.field private c:Landroid/widget/ImageView;

.field private d:Lhuawei/widget/HwProgressBar;

.field private f:Landroid/widget/LinearLayout;

.field private g:Landroid/widget/LinearLayout;

.field private h:Landroid/widget/ImageView;

.field private i:Landroid/widget/TextView;

.field private j:Lo/eoa;

.field private k:Landroid/widget/TextView;

.field private l:Lo/egb;

.field private m:Landroid/widget/RelativeLayout;

.field private n:Landroid/widget/LinearLayout;

.field private o:Lo/egb;

.field private p:Landroid/widget/RelativeLayout;

.field private q:Landroid/widget/RelativeLayout;

.field private r:Landroid/widget/ImageView;

.field private s:Landroid/support/v4/content/LocalBroadcastManager;

.field private t:Landroid/content/Context;

.field private u:Landroid/content/Context;

.field private v:Lo/egv;

.field private w:Lo/enz;

.field private x:Lcom/huawei/ui/homewear21/home/WearHomeActivity$a;

.field private y:Landroid/os/HandlerThread;

.field private z:Lo/fcb;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 235
    const/4 v0, 0x0

    sput v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->e:I

    .line 370
    const/4 v0, 0x0

    sput-object v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->P:Lo/dde;

    .line 417
    const/4 v0, 0x4

    invoke-static {v0}, Ljava/util/concurrent/Executors;->newFixedThreadPool(I)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    sput-object v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->am:Ljava/util/concurrent/ExecutorService;

    .line 418
    const/4 v0, 0x0

    sput-boolean v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->ai:Z

    .line 439
    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "android.permission.READ_PHONE_STATE"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "android.permission.READ_CONTACTS"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, "android.permission.CALL_PHONE"

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sput-object v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->aj:[Ljava/lang/String;

    .line 445
    const/4 v0, 0x5

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "android.permission.READ_PHONE_STATE"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "android.permission.READ_CONTACTS"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, "android.permission.ACCESS_COARSE_LOCATION"

    const/4 v2, 0x2

    aput-object v1, v0, v2

    const-string v1, "android.permission.ACCESS_FINE_LOCATION"

    const/4 v2, 0x3

    aput-object v1, v0, v2

    const-string v1, "android.permission.CALL_PHONE"

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sput-object v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->ak:[Ljava/lang/String;

    .line 494
    const/4 v0, 0x0

    sput-object v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->aC:Lcom/huawei/lcagent/client/LogCollectManager;

    .line 495
    const/4 v0, 0x0

    sput-object v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->aE:Lcom/huawei/lcagent/client/LogMetricInfo;

    .line 4289
    const/4 v0, 0x0

    sput-object v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->aV:Lo/egv;

    .line 5876
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "android.permission.ACCESS_COARSE_LOCATION"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "android.permission.ACCESS_FINE_LOCATION"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sput-object v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->be:[Ljava/lang/String;

    .line 6260
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "android.permission.READ_EXTERNAL_STORAGE"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "android.permission.WRITE_EXTERNAL_STORAGE"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sput-object v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->bh:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 232
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    .line 336
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->y:Landroid/os/HandlerThread;

    .line 337
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->x:Lcom/huawei/ui/homewear21/home/WearHomeActivity$a;

    .line 342
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->C:Ljava/lang/String;

    .line 344
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->D:Z

    .line 345
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->I:Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;

    .line 346
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->F:I

    .line 351
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->H:Ljava/lang/String;

    .line 365
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->R:Lo/cxf;

    .line 387
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->Q:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    .line 388
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->X:Ljava/lang/String;

    .line 393
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->a:Lo/fhq;

    .line 396
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->V:Ljava/util/ArrayList;

    .line 401
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->T:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    .line 408
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->ag:I

    .line 411
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->ah:I

    .line 412
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->ae:J

    .line 415
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->af:Lo/etw;

    .line 416
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->al:Ljava/util/List;

    .line 455
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->ar:Lo/egv;

    .line 457
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->aq:Ljava/lang/Object;

    .line 459
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->ap:Ljava/lang/Object;

    .line 463
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->ao:Lo/egy;

    .line 474
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->az:Z

    .line 616
    new-instance v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$1;

    invoke-direct {v0, p0, p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity$1;-><init>(Lcom/huawei/ui/homewear21/home/WearHomeActivity;Lcom/huawei/ui/homewear21/home/WearHomeActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->aD:Lcom/huawei/ui/homewear21/home/WearHomeActivity$d;

    .line 1146
    new-instance v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$84;

    invoke-direct {v0, p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity$84;-><init>(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->aG:Landroid/view/View$OnClickListener;

    .line 2430
    new-instance v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$17;

    invoke-direct {v0, p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity$17;-><init>(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->aL:Landroid/widget/AdapterView$OnItemClickListener;

    .line 2848
    new-instance v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$20;

    invoke-direct {v0, p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity$20;-><init>(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->aH:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 2979
    new-instance v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$21;

    invoke-direct {v0, p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity$21;-><init>(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->aI:Landroid/widget/CompoundButton$OnCheckedChangeListener;

    .line 3019
    new-instance v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$22;

    invoke-direct {v0, p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity$22;-><init>(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->aJ:Landroid/widget/CompoundButton$OnCheckedChangeListener;

    .line 3057
    new-instance v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$25;

    invoke-direct {v0, p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity$25;-><init>(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->aK:Landroid/widget/CompoundButton$OnCheckedChangeListener;

    .line 3097
    new-instance v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$24;

    invoke-direct {v0, p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity$24;-><init>(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->aP:Landroid/widget/CompoundButton$OnCheckedChangeListener;

    .line 3137
    new-instance v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$26;

    invoke-direct {v0, p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity$26;-><init>(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->aO:Landroid/widget/CompoundButton$OnCheckedChangeListener;

    .line 3177
    new-instance v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$29;

    invoke-direct {v0, p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity$29;-><init>(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->aM:Landroid/widget/CompoundButton$OnCheckedChangeListener;

    .line 3313
    new-instance v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$27;

    invoke-direct {v0, p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity$27;-><init>(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->aN:Landroid/view/View$OnClickListener;

    .line 3436
    new-instance v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$28;

    invoke-direct {v0, p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity$28;-><init>(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->aQ:Landroid/os/Handler;

    .line 3783
    new-instance v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$33;

    invoke-direct {v0, p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity$33;-><init>(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->aU:Ljava/lang/Runnable;

    .line 4496
    new-instance v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$37;

    invoke-direct {v0, p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity$37;-><init>(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->aR:Landroid/content/BroadcastReceiver;

    .line 4582
    new-instance v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$40;

    invoke-direct {v0, p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity$40;-><init>(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->aS:Landroid/content/BroadcastReceiver;

    .line 4617
    new-instance v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$45;

    invoke-direct {v0, p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity$45;-><init>(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->aT:Landroid/content/BroadcastReceiver;

    .line 5504
    new-instance v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$55;

    invoke-direct {v0, p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity$55;-><init>(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->ba:Landroid/content/BroadcastReceiver;

    .line 5570
    new-instance v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$53;

    invoke-direct {v0, p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity$53;-><init>(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->aW:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 5616
    new-instance v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$54;

    invoke-direct {v0, p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity$54;-><init>(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->aY:Landroid/content/BroadcastReceiver;

    .line 5634
    new-instance v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$51;

    invoke-direct {v0, p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity$51;-><init>(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->aZ:Landroid/content/BroadcastReceiver;

    .line 5652
    new-instance v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$58;

    invoke-direct {v0, p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity$58;-><init>(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->aX:Landroid/content/BroadcastReceiver;

    .line 5689
    new-instance v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$57;

    invoke-direct {v0, p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity$57;-><init>(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->bd:Landroid/content/BroadcastReceiver;

    .line 5927
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->bc:Ljava/util/List;

    .line 6166
    new-instance v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$63;

    invoke-direct {v0, p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity$63;-><init>(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->bf:Landroid/content/BroadcastReceiver;

    .line 6265
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->bg:Z

    .line 6266
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->bk:Z

    .line 6424
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->bi:Lo/egn;

    .line 6457
    new-instance v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$71;

    invoke-direct {v0, p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity$71;-><init>(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->bo:Lcom/huawei/hwdevicedfxmanager/callback/IDeviceDFXUploadCallback;

    .line 6472
    new-instance v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$75;

    invoke-direct {v0, p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity$75;-><init>(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->bl:Lcom/huawei/hwdevicedfxmanager/callback/IDeviceDFXBaseResponseCallback;

    .line 6580
    new-instance v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$74;

    invoke-direct {v0, p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity$74;-><init>(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->bn:Landroid/content/BroadcastReceiver;

    .line 6628
    new-instance v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$73;

    invoke-direct {v0, p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity$73;-><init>(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->bm:Landroid/content/BroadcastReceiver;

    .line 6680
    new-instance v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$72;

    invoke-direct {v0, p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity$72;-><init>(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->bp:Landroid/widget/CompoundButton$OnCheckedChangeListener;

    return-void
.end method

.method private A()V
    .locals 8

    .line 2658
    const-string v0, "market://details?id=com.plagh.heartstudy"

    :try_start_0
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v4

    .line 2659
    new-instance v5, Landroid/content/Intent;

    const-string v0, "android.intent.action.VIEW"

    invoke-direct {v5, v0, v4}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 2660
    const/high16 v0, 0x10000000

    invoke-virtual {v5, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 2662
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->u:Landroid/content/Context;

    const-string v1, "com.plagh.heartstudy"

    invoke-static {v0, v1}, Lo/fjj;->c(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2664
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->u:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v6

    .line 2665
    const-string v0, "com.plagh.heartstudy"

    invoke-virtual {v6, v0}, Landroid/content/pm/PackageManager;->getLaunchIntentForPackage(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v7

    .line 2666
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->u:Landroid/content/Context;

    invoke-virtual {v0, v7}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 2667
    goto :goto_0

    .line 2670
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->u:Landroid/content/Context;

    const-string v1, "com.huawei.appmarket"

    invoke-static {v0, v1}, Lo/fjj;->c(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2671
    const-string v0, "com.huawei.appmarket"

    invoke-virtual {v5, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 2672
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->u:Landroid/content/Context;

    invoke-virtual {v0, v5}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    goto :goto_0

    .line 2675
    :cond_1
    new-instance v6, Landroid/content/Intent;

    invoke-direct {v6}, Landroid/content/Intent;-><init>()V

    .line 2676
    const-string v0, "android.intent.action.VIEW"

    invoke-virtual {v6, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 2677
    const-string v0, "https://appgallery.cloud.huawei.com/marketshare/app/C100406325?locale=zh_CN&shareTo=com.huawei.works&shareFrom=appmarket"

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v7

    .line 2678
    invoke-virtual {v6, v7}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 2679
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->u:Landroid/content/Context;

    invoke-virtual {v0, v6}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 2684
    :goto_0
    goto :goto_1

    .line 2682
    :catch_0
    move-exception v4

    .line 2683
    const-string v0, "WearHomeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Exception: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2685
    :goto_1
    return-void
.end method

.method static synthetic A(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)V
    .locals 0

    .line 232
    invoke-direct {p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->aH()V

    return-void
.end method

.method private B()V
    .locals 7

    .line 2379
    const-string v0, "MainUI"

    const-string v1, "WearHomeActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "refreshSettingView() mGeneralList = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v4, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->V:Ljava/util/ArrayList;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2380
    sget v0, Lcom/huawei/ui/homewear21/R$id;->list_general_setting:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ListView;

    iput-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->U:Landroid/widget/ListView;

    .line 2381
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->U:Landroid/widget/ListView;

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/widget/ListView;->setLayerType(ILandroid/graphics/Paint;)V

    .line 2383
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->Q:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->Q:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v0

    invoke-static {v0}, Lo/dbh;->e(I)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 2384
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->w:Lo/enz;

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->X:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/enz;->b(Ljava/lang/String;)Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_6

    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->w:Lo/enz;

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->X:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/enz;->b(Ljava/lang/String;)Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isOta_update()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-static {}, Lo/dpa;->c()Lo/dpa;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->X:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/dpa;->d(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 2385
    const-string v0, "WearHomeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "refreshSettingView() AW70 is OTAing"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2386
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->V:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/eoq;

    .line 2387
    const/4 v0, 0x0

    invoke-virtual {v6, v0}, Lo/eoq;->a(Z)V

    .line 2388
    invoke-virtual {v6}, Lo/eoq;->c()I

    move-result v0

    const/16 v1, 0xd

    if-eq v0, v1, :cond_0

    .line 2389
    invoke-virtual {v6}, Lo/eoq;->c()I

    move-result v0

    const/16 v1, 0x11

    if-ne v0, v1, :cond_1

    .line 2390
    :cond_0
    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Lo/eoq;->a(Z)V

    .line 2392
    :cond_1
    goto :goto_0

    :cond_2
    goto :goto_2

    .line 2394
    :cond_3
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->w:Lo/enz;

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->X:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/enz;->b(Ljava/lang/String;)Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_6

    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->w:Lo/enz;

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->X:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/enz;->b(Ljava/lang/String;)Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isOta_update()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dpb;->b(Landroid/content/Context;)Lo/dpb;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->X:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/dpb;->g(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 2395
    const-string v0, "WearHomeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "refreshSettingView() wear device is OTAing"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2396
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->V:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/eoq;

    .line 2397
    const/4 v0, 0x0

    invoke-virtual {v6, v0}, Lo/eoq;->a(Z)V

    .line 2398
    invoke-virtual {v6}, Lo/eoq;->c()I

    move-result v0

    const/16 v1, 0xd

    if-eq v0, v1, :cond_4

    .line 2399
    invoke-virtual {v6}, Lo/eoq;->c()I

    move-result v0

    const/16 v1, 0x11

    if-ne v0, v1, :cond_5

    .line 2400
    :cond_4
    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Lo/eoq;->a(Z)V

    .line 2402
    :cond_5
    goto :goto_1

    .line 2404
    :cond_6
    :goto_2
    new-instance v0, Lo/eos;

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->u:Landroid/content/Context;

    iget-object v2, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->V:Ljava/util/ArrayList;

    invoke-direct {v0, v1, v2}, Lo/eos;-><init>(Landroid/content/Context;Ljava/util/List;)V

    iput-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->W:Lo/eos;

    .line 2405
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->U:Landroid/widget/ListView;

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->W:Lo/eos;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 2406
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->U:Landroid/widget/ListView;

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->W:Lo/eos;

    invoke-virtual {p0, v0, v1}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->c(Landroid/widget/ListView;Lo/eos;)V

    .line 2407
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->U:Landroid/widget/ListView;

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->aL:Landroid/widget/AdapterView$OnItemClickListener;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 2409
    invoke-virtual {p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->b()V

    .line 2410
    return-void
.end method

.method static synthetic B(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)Z
    .locals 1

    .line 232
    invoke-direct {p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->am()Z

    move-result v0

    return v0
.end method

.method private C()V
    .locals 5

    .line 2867
    const-string v0, "MainUI"

    const-string v1, "WearHomeActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Enter gotoMember"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2869
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->aQ:Landroid/os/Handler;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 2870
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->aQ:Landroid/os/Handler;

    const/16 v1, 0xc

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 2871
    invoke-virtual {p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->c()V

    goto :goto_0

    .line 2873
    :cond_0
    const-string v0, "WearHomeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handler is null!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2875
    :goto_0
    return-void
.end method

.method static synthetic C(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)V
    .locals 0

    .line 232
    invoke-direct {p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->D()V

    return-void
.end method

.method private D()V
    .locals 3

    .line 2716
    sget-object v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->P:Lo/dde;

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->X:Ljava/lang/String;

    iget-object v2, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->aH:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-virtual {v0, v1, v2}, Lo/dde;->e(Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 2717
    return-void
.end method

.method static synthetic D(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)V
    .locals 0

    .line 232
    invoke-direct {p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->J()V

    return-void
.end method

.method private E()V
    .locals 6

    .line 3328
    const-string v0, "MainUI"

    const-string v1, "WearHomeActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Enter gotoSimCard"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 3329
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->u:Landroid/content/Context;

    invoke-static {v0}, Lo/ecy;->c(Landroid/content/Context;)Lo/ecy;

    move-result-object v5

    .line 3330
    invoke-static {}, Lo/cvx;->b()Lo/cvx;

    move-result-object v0

    invoke-virtual {v5, v0}, Lo/ecy;->setAdapter(Lo/eab;)V

    .line 3332
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->u:Landroid/content/Context;

    invoke-virtual {v5, v0}, Lo/ecy;->e(Landroid/content/Context;)V

    .line 3333
    return-void
.end method

.method static synthetic E(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)V
    .locals 0

    .line 232
    invoke-direct {p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->N()V

    return-void
.end method

.method private F()V
    .locals 5

    .line 2929
    const-string v0, "MainUI"

    const-string v1, "WearHomeActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "notifyUpdateSettingList() mGeneralAdapter = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v4, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->V:Ljava/util/ArrayList;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2930
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->W:Lo/eos;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 2931
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->W:Lo/eos;

    invoke-virtual {v0}, Lo/eos;->notifyDataSetChanged()V

    .line 2933
    :cond_0
    return-void
.end method

.method static synthetic F(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)V
    .locals 0

    .line 232
    invoke-direct {p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->n()V

    return-void
.end method

.method static synthetic G(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)Landroid/widget/ImageView;
    .locals 1

    .line 232
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->h:Landroid/widget/ImageView;

    return-object v0
.end method

.method private G()V
    .locals 4

    .line 3375
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->w:Lo/enz;

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->X:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/enz;->b(Ljava/lang/String;)Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->T:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    .line 3376
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->T:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->T:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isMessage_alert()Z

    move-result v0

    if-nez v0, :cond_1

    .line 3377
    :cond_0
    return-void

    .line 3379
    :cond_1
    const-string v0, "WearHomeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Enter updateNotifyState:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->j:Lo/eoa;

    invoke-virtual {v3}, Lo/eoa;->c()Z

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3380
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->j:Lo/eoa;

    invoke-virtual {v0}, Lo/eoa;->c()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 3381
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->V:Ljava/util/ArrayList;

    const/4 v1, 0x6

    invoke-direct {p0, v0, v1}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->b(Ljava/util/ArrayList;I)Lo/eoq;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->t:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/homewear21/R$string;->IDS_status_enabled:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/eoq;->b(Ljava/lang/String;)V

    goto :goto_0

    .line 3383
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->V:Ljava/util/ArrayList;

    const/4 v1, 0x6

    invoke-direct {p0, v0, v1}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->b(Ljava/util/ArrayList;I)Lo/eoq;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->t:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/homewear21/R$string;->IDS_status_disabled:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/eoq;->b(Ljava/lang/String;)V

    .line 3385
    :goto_0
    invoke-direct {p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->F()V

    .line 3386
    return-void
.end method

.method static synthetic H(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)Landroid/widget/TextView;
    .locals 1

    .line 232
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->k:Landroid/widget/TextView;

    return-object v0
.end method

.method private H()V
    .locals 9

    .line 3392
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->Q:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->Q:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v0

    invoke-static {v0}, Lo/dbh;->e(I)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 3393
    invoke-static {}, Lo/dpa;->c()Lo/dpa;

    move-result-object v0

    invoke-virtual {v0}, Lo/dpa;->d()Z

    move-result v5

    .line 3394
    const-string v0, "MainUI"

    const-string v1, "WearHomeActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "updateNewRed haveNewAw70Version = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 3395
    iget-object v6, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->ap:Ljava/lang/Object;

    monitor-enter v6

    .line 3396
    if-eqz v5, :cond_0

    .line 3397
    const/4 v0, 0x1

    :try_start_0
    invoke-virtual {p0, v0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->c(Z)V

    goto :goto_0

    .line 3399
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->c(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3401
    :goto_0
    monitor-exit v6

    goto :goto_1

    :catchall_0
    move-exception v7

    monitor-exit v6

    throw v7

    .line 3402
    :goto_1
    goto :goto_3

    .line 3403
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->t:Landroid/content/Context;

    invoke-static {v0}, Lo/dpb;->b(Landroid/content/Context;)Lo/dpb;

    move-result-object v0

    invoke-virtual {v0}, Lo/dpb;->c()Z

    move-result v5

    .line 3404
    const-string v0, "MainUI"

    const-string v1, "WearHomeActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "updateNewRed isRedTip= "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 3405
    iget-object v6, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->ap:Ljava/lang/Object;

    monitor-enter v6

    .line 3406
    if-eqz v5, :cond_2

    .line 3407
    const/4 v0, 0x1

    :try_start_1
    invoke-virtual {p0, v0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->c(Z)V

    goto :goto_2

    .line 3409
    :cond_2
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->c(Z)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 3411
    :goto_2
    monitor-exit v6

    goto :goto_3

    :catchall_1
    move-exception v8

    monitor-exit v6

    throw v8

    .line 3413
    :goto_3
    return-void
.end method

.method private I()V
    .locals 7

    .line 3350
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->w:Lo/enz;

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->X:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/enz;->b(Ljava/lang/String;)Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->T:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    .line 3351
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->T:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->T:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportMusicControl()Z

    move-result v0

    if-nez v0, :cond_1

    .line 3352
    :cond_0
    return-void

    .line 3355
    :cond_1
    const-string v0, "WearHomeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Enter updateMusicState:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->j:Lo/eoa;

    invoke-virtual {v3}, Lo/eoa;->e()Z

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3356
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->j:Lo/eoa;

    invoke-virtual {v0}, Lo/eoa;->e()Z

    move-result v0

    if-nez v0, :cond_2

    .line 3357
    iget-object v4, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->aq:Ljava/lang/Object;

    monitor-enter v4

    .line 3358
    :try_start_0
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->V:Ljava/util/ArrayList;

    const/16 v1, 0x22

    invoke-direct {p0, v0, v1}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->b(Ljava/util/ArrayList;I)Lo/eoq;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/eoq;->e(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3359
    monitor-exit v4

    goto :goto_0

    :catchall_0
    move-exception v5

    monitor-exit v4

    throw v5

    .line 3361
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->t:Landroid/content/Context;

    invoke-static {v0}, Lo/dix;->d(Landroid/content/Context;)Lo/dix;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/dix;->d(Ljava/lang/Boolean;)V

    .line 3362
    const-string v0, "WearHomeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "end updateMusicState"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1

    .line 3364
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->t:Landroid/content/Context;

    invoke-static {v0}, Lo/dix;->d(Landroid/content/Context;)Lo/dix;

    move-result-object v0

    invoke-virtual {v0}, Lo/dix;->a()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 3365
    iget-object v4, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->aq:Ljava/lang/Object;

    monitor-enter v4

    .line 3366
    :try_start_1
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->V:Ljava/util/ArrayList;

    const/16 v1, 0x22

    invoke-direct {p0, v0, v1}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->b(Ljava/util/ArrayList;I)Lo/eoq;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/eoq;->e(Z)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 3367
    monitor-exit v4

    goto :goto_1

    :catchall_1
    move-exception v6

    monitor-exit v4

    throw v6

    .line 3370
    :cond_3
    :goto_1
    return-void
.end method

.method static synthetic I(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)V
    .locals 0

    .line 232
    invoke-direct {p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->z()V

    return-void
.end method

.method private J()V
    .locals 0

    .line 3974
    invoke-direct {p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->x()V

    .line 3975
    invoke-direct {p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->B()V

    .line 3976
    invoke-direct {p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->F()V

    .line 3977
    return-void
.end method

.method static synthetic J(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)V
    .locals 0

    .line 232
    invoke-direct {p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->M()V

    return-void
.end method

.method private K()V
    .locals 6

    .line 3715
    const-string v0, "MainUI"

    const-string v1, "WearHomeActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Enter clearMessageCenterLocalDeviceMessage"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 3717
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->u:Landroid/content/Context;

    invoke-static {v0}, Lo/eaa;->c(Landroid/content/Context;)Lo/eaa;

    move-result-object v5

    .line 3718
    const-string v0, "device"

    const-string v1, "device_type_connected"

    new-instance v2, Lcom/huawei/ui/homewear21/home/WearHomeActivity$30;

    invoke-direct {v2, p0, v5}, Lcom/huawei/ui/homewear21/home/WearHomeActivity$30;-><init>(Lcom/huawei/ui/homewear21/home/WearHomeActivity;Lo/eaa;)V

    invoke-virtual {v5, v0, v1, v2}, Lo/eaa;->d(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 3731
    const-string v0, "device"

    const-string v1, "device_ota"

    new-instance v2, Lcom/huawei/ui/homewear21/home/WearHomeActivity$31;

    invoke-direct {v2, p0, v5}, Lcom/huawei/ui/homewear21/home/WearHomeActivity$31;-><init>(Lcom/huawei/ui/homewear21/home/WearHomeActivity;Lo/eaa;)V

    invoke-virtual {v5, v0, v1, v2}, Lo/eaa;->d(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 3746
    invoke-virtual {p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->finish()V

    .line 3747
    return-void
.end method

.method static synthetic K(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)V
    .locals 0

    .line 232
    invoke-direct {p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->L()V

    return-void
.end method

.method private L()V
    .locals 7

    .line 3753
    invoke-static {}, Lo/etq;->d()Lo/etq;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->X:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/etq;->a(Ljava/lang/String;)Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->Q:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    .line 3754
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->Q:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 3755
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->Q:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getSecUUID()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->C:Ljava/lang/String;

    .line 3756
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->Q:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceConnectState()I

    move-result v5

    .line 3757
    const-string v0, "MainUI"

    const-string v1, "WearHomeActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "bluetooth status: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 3758
    const/4 v0, 0x2

    if-eq v0, v5, :cond_0

    const/4 v0, 0x1

    if-eq v0, v5, :cond_0

    .line 3759
    const-string v0, "MainUI"

    const-string v1, "WearHomeActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "begin connect in ui , name:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v4, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->Q:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 3761
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->Q:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    invoke-direct {p0, v0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->e(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;)V

    .line 3762
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->aQ:Landroid/os/Handler;

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->aU:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 3763
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->aQ:Landroid/os/Handler;

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->aU:Ljava/lang/Runnable;

    const-wide/16 v2, 0x4e20

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 3764
    invoke-static {}, Lo/etq;->d()Lo/etq;

    move-result-object v0

    invoke-virtual {v0}, Lo/etq;->i()Ljava/util/List;

    move-result-object v6

    .line 3765
    invoke-static {}, Lo/etq;->d()Lo/etq;

    move-result-object v0

    invoke-virtual {v0, v6}, Lo/etq;->c(Ljava/util/List;)V

    .line 3766
    goto :goto_0

    .line 3767
    :cond_0
    const-string v0, "MainUI"

    const-string v1, "WearHomeActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "connected or connecting"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 3769
    :goto_0
    goto :goto_1

    .line 3770
    :cond_1
    const-string v0, "MainUI"

    const-string v1, "WearHomeActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "no deivce info"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 3772
    :goto_1
    return-void
.end method

.method static synthetic L(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)V
    .locals 0

    .line 232
    invoke-direct {p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->K()V

    return-void
.end method

.method private M()V
    .locals 5

    .line 3777
    const-string v0, "MainUI"

    const-string v1, "WearHomeActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "enter beginBackgroundSync():"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 3780
    return-void
.end method

.method static synthetic M(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)V
    .locals 0

    .line 232
    invoke-direct {p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->ay()V

    return-void
.end method

.method private N()V
    .locals 4

    .line 3969
    const-string v0, "WearHomeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleWhenGetDetailDataSuccess() ENTER"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3970
    invoke-direct {p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->O()V

    .line 3971
    return-void
.end method

.method static synthetic N(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)Z
    .locals 1

    .line 232
    iget-boolean v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->bk:Z

    return v0
.end method

.method static synthetic O(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)Lo/egv;
    .locals 1

    .line 232
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->aa:Lo/egv;

    return-object v0
.end method

.method private O()V
    .locals 5

    .line 3983
    const-string v0, "MainUI"

    const-string v1, "WearHomeActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Enter handleWhenGetDetailDataSuccessDelayTodu!"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 3984
    invoke-static {}, Lo/etq;->d()Lo/etq;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->u:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lo/etq;->d(Landroid/content/Context;)V

    .line 3985
    return-void
.end method

.method static synthetic P(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)Lo/eog;
    .locals 1

    .line 232
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->aB:Lo/eog;

    return-object v0
.end method

.method private P()V
    .locals 9

    .line 4310
    const-string v0, "WearHomeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter showAlertDialog"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4311
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "\u2022 "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->u:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/homewear21/R$string;->IDS_device_mgr_pair_note_repair_device:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 4312
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "\u2022 "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->u:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/homewear21/R$string;->IDS_device_mgr_pair_note_open_bluetooth:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 4313
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->u:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/homewear21/R$string;->IDS_device_mgr_pair_note_avivable_ways:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v7

    .line 4314
    new-instance v8, Ljava/lang/StringBuffer;

    invoke-direct {v8}, Ljava/lang/StringBuffer;-><init>()V

    .line 4315
    invoke-virtual {v8, v7}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 4316
    invoke-virtual {v8}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->e(Ljava/lang/String;)V

    .line 4317
    return-void
.end method

.method private Q()V
    .locals 6

    .line 4204
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->V:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/eoq;

    .line 4205
    invoke-virtual {v5}, Lo/eoq;->c()I

    move-result v0

    const/16 v1, 0xd

    if-ne v0, v1, :cond_1

    invoke-virtual {v5}, Lo/eoq;->k()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 4206
    const-string v0, "WearHomeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkIsOtaEnd OTA item isEnable"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4207
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dpb;->b(Landroid/content/Context;)Lo/dpb;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->X:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/dpb;->g(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_0

    .line 4208
    invoke-static {}, Lo/dpa;->c()Lo/dpa;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->X:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/dpa;->d(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_0

    .line 4209
    const-string v0, "WearHomeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkIsOtaEnd current device is not OTAing"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4210
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Lo/eoq;->a(Z)V

    .line 4212
    invoke-direct {p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->F()V

    .line 4213
    return-void

    .line 4215
    :cond_0
    return-void

    .line 4218
    :cond_1
    goto :goto_0

    .line 4219
    :cond_2
    return-void
.end method

.method static synthetic Q(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)V
    .locals 0

    .line 232
    invoke-direct {p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->aR()V

    return-void
.end method

.method static synthetic R(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)Ljava/lang/String;
    .locals 1

    .line 232
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->H:Ljava/lang/String;

    return-object v0
.end method

.method private R()V
    .locals 11

    .line 4321
    const-string v0, "WearHomeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter showAlertDialog"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4322
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "\u2022 "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->u:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/homewear21/R$string;->IDS_device_mgr_pair_note_repair_device:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 4323
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->u:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/homewear21/R$string;->IDS_device_mgr_pair_note_press_restart1:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x5

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    .line 4324
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "\u2022 "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->u:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/homewear21/R$string;->IDS_device_mgr_pair_note_restart_device:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v6, v2, v3

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    .line 4325
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "\u2022 "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->u:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/homewear21/R$string;->IDS_device_mgr_pair_note_open_bluetooth:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    .line 4326
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->u:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/homewear21/R$string;->IDS_device_mgr_pair_note_avivable_ways:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v9

    .line 4327
    new-instance v10, Ljava/lang/StringBuffer;

    invoke-direct {v10}, Ljava/lang/StringBuffer;-><init>()V

    .line 4328
    invoke-virtual {v10, v9}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0, v8}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 4329
    invoke-virtual {v10}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->e(Ljava/lang/String;)V

    .line 4331
    return-void
.end method

.method static synthetic S(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)Lo/egv;
    .locals 1

    .line 232
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->Y:Lo/egv;

    return-object v0
.end method

.method private S()V
    .locals 4

    .line 3995
    const-string v0, "WearHomeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "dataSync 4"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3998
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->aA:Lo/eoi;

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->X:Ljava/lang/String;

    iget-object v2, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->t:Landroid/content/Context;

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Lo/eoi;->c(Ljava/lang/String;Landroid/content/Context;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 4000
    invoke-direct {p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->aq()V

    .line 4004
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->a:Lo/fhq;

    invoke-virtual {v0}, Lo/fhq;->d()V

    .line 4006
    invoke-direct {p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->ai()V

    .line 4008
    invoke-direct {p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->l()V

    .line 4009
    return-void
.end method

.method private T()V
    .locals 3

    .line 4382
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->c:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 4383
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->d:Lhuawei/widget/HwProgressBar;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lhuawei/widget/HwProgressBar;->setVisibility(I)V

    .line 4389
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->i:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->u:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homewear21/R$string;->IDS_device_connecting_21:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 4390
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->h:Landroid/widget/ImageView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 4391
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->k:Landroid/widget/TextView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 4392
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->g:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 4393
    return-void
.end method

.method static synthetic T(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)V
    .locals 0

    .line 232
    invoke-direct {p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->aF()V

    return-void
.end method

.method private U()V
    .locals 11

    .line 4333
    const-string v0, "WearHomeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter showAlertDialog"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4334
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "\u2022 "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->u:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/homewear21/R$string;->IDS_device_mgr_pair_note_repair_device:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 4335
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->u:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/homewear21/R$string;->IDS_device_mgr_pair_note_press_restart3:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x5

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    .line 4336
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "\u2022 "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->u:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/homewear21/R$string;->IDS_device_mgr_pair_note_restart_device:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v6, v2, v3

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    .line 4337
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "\u2022 "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->u:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/homewear21/R$string;->IDS_device_mgr_pair_note_open_bluetooth:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    .line 4338
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->u:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/homewear21/R$string;->IDS_device_mgr_pair_note_avivable_ways:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v9

    .line 4339
    new-instance v10, Ljava/lang/StringBuffer;

    invoke-direct {v10}, Ljava/lang/StringBuffer;-><init>()V

    .line 4340
    invoke-virtual {v10, v9}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0, v8}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 4341
    invoke-virtual {v10}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->e(Ljava/lang/String;)V

    .line 4343
    return-void
.end method

.method static synthetic U(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)Z
    .locals 1

    .line 232
    iget-boolean v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->D:Z

    return v0
.end method

.method static synthetic V(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;
    .locals 1

    .line 232
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->T:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    return-object v0
.end method

.method private V()V
    .locals 11

    .line 4357
    const-string v0, "WearHomeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter showAlertDialog"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4358
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "\u2022 "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->u:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/homewear21/R$string;->IDS_device_mgr_pair_note_repair_device:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 4359
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->u:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/homewear21/R$string;->IDS_device_mgr_pair_note_press_restart2:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v6

    .line 4360
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "\u2022 "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->u:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/homewear21/R$string;->IDS_device_mgr_pair_note_restart_device:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v6, v2, v3

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    .line 4361
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "\u2022 "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->u:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/homewear21/R$string;->IDS_device_mgr_pair_note_open_bluetooth:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    .line 4362
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->u:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/homewear21/R$string;->IDS_device_mgr_pair_note_avivable_ways:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v9

    .line 4363
    new-instance v10, Ljava/lang/StringBuffer;

    invoke-direct {v10}, Ljava/lang/StringBuffer;-><init>()V

    .line 4364
    invoke-virtual {v10, v9}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0, v8}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 4365
    invoke-virtual {v10}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->e(Ljava/lang/String;)V

    .line 4366
    return-void
.end method

.method static synthetic W(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)Landroid/widget/ImageView;
    .locals 1

    .line 232
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->c:Landroid/widget/ImageView;

    return-object v0
.end method

.method private W()V
    .locals 11

    .line 4369
    const-string v0, "WearHomeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter showAlertDialog"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4370
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "\u2022 "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->u:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/homewear21/R$string;->IDS_device_mgr_pair_note_repair_device:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 4371
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->u:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/homewear21/R$string;->IDS_device_mgr_pair_note_press_restart5:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v6

    .line 4372
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "\u2022 "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->u:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/homewear21/R$string;->IDS_device_mgr_pair_note_restart_device:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v6, v2, v3

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    .line 4373
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "\u2022 "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->u:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/homewear21/R$string;->IDS_device_mgr_pair_note_open_bluetooth:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    .line 4374
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->u:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/homewear21/R$string;->IDS_device_mgr_pair_note_avivable_ways:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v9

    .line 4375
    new-instance v10, Ljava/lang/StringBuffer;

    invoke-direct {v10}, Ljava/lang/StringBuffer;-><init>()V

    .line 4376
    invoke-virtual {v10, v9}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0, v8}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 4377
    invoke-virtual {v10}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->e(Ljava/lang/String;)V

    .line 4378
    return-void
.end method

.method private X()V
    .locals 11

    .line 4345
    const-string v0, "WearHomeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter showAlertDialog"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4346
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "\u2022 "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->u:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/homewear21/R$string;->IDS_device_mgr_pair_note_repair_device:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 4347
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->u:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/homewear21/R$string;->IDS_device_mgr_pair_note_press_restart4:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x5

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    .line 4348
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "\u2022 "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->u:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/homewear21/R$string;->IDS_device_mgr_pair_note_restart_device:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v6, v2, v3

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    .line 4349
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "\u2022 "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->u:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/homewear21/R$string;->IDS_device_mgr_pair_note_open_bluetooth:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    .line 4350
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->u:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/homewear21/R$string;->IDS_device_mgr_pair_note_avivable_ways:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v9

    .line 4351
    new-instance v10, Ljava/lang/StringBuffer;

    invoke-direct {v10}, Ljava/lang/StringBuffer;-><init>()V

    .line 4352
    invoke-virtual {v10, v9}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0, v8}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 4353
    invoke-virtual {v10}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->e(Ljava/lang/String;)V

    .line 4355
    return-void
.end method

.method static synthetic X(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)V
    .locals 0

    .line 232
    invoke-direct {p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->as()V

    return-void
.end method

.method static synthetic Y(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;
    .locals 1

    .line 232
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->I:Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;

    return-object v0
.end method

.method private Y()V
    .locals 6

    .line 4439
    const-string v0, "MainUI"

    const-string v1, "WearHomeActivity"

    const/4 v2, 0x1

    :try_start_0
    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Enter unRegisterDeviceBatteryRefreshBroadcast():"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 4440
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->u:Landroid/content/Context;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 4441
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->u:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->aR:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1

    .line 4447
    :cond_0
    goto :goto_0

    .line 4443
    :catch_0
    move-exception v5

    .line 4444
    const-string v0, "MainUI"

    const-string v1, "WearHomeActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v5}, Ljava/lang/IllegalArgumentException;->getMessage()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 4447
    goto :goto_0

    .line 4445
    :catch_1
    move-exception v5

    .line 4446
    const-string v0, "MainUI"

    const-string v1, "WearHomeActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v5}, Ljava/lang/RuntimeException;->getMessage()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 4448
    :goto_0
    return-void
.end method

.method private Z()V
    .locals 6

    .line 4426
    const-string v0, "MainUI"

    const-string v1, "WearHomeActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Enter registerDeviceBatteryRefreshBroadcast"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 4427
    new-instance v5, Landroid/content/IntentFilter;

    const-string v0, "com.huawei.bone.action.BATTERY_LEVEL"

    invoke-direct {v5, v0}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 4428
    const-string v0, "com.huawei.bone.action.BATTERY_LEVEL"

    invoke-virtual {v5, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 4429
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->u:Landroid/content/Context;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 4430
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->u:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->aR:Landroid/content/BroadcastReceiver;

    sget-object v2, Lo/dac;->a:Ljava/lang/String;

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v5, v2, v3}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Ljava/lang/String;Landroid/os/Handler;)Landroid/content/Intent;

    .line 4432
    :cond_0
    return-void
.end method

.method static synthetic Z(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)V
    .locals 0

    .line 232
    invoke-direct {p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->aQ()V

    return-void
.end method

.method private a(J)J
    .locals 11

    .line 6134
    move-wide v4, p1

    .line 6135
    new-instance v6, Ljava/util/Date;

    invoke-direct {v6, p1, p2}, Ljava/util/Date;-><init>(J)V

    .line 6136
    new-instance v7, Ljava/text/SimpleDateFormat;

    const-string v0, "yyyyMMdd"

    invoke-direct {v7, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 6137
    invoke-virtual {v7, v6}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v8

    .line 6138
    new-instance v9, Ljava/text/SimpleDateFormat;

    const-string v0, "yyyyMMddhhmm"

    invoke-direct {v9, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 6140
    :try_start_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "0000"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v10

    .line 6141
    invoke-virtual {v10}, Ljava/util/Date;->getTime()J
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-wide v0

    move-wide v4, v0

    .line 6144
    goto :goto_0

    .line 6142
    :catch_0
    move-exception v10

    .line 6143
    const-string v0, "WearHomeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getBeginOfDate enter"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 6146
    :goto_0
    return-wide v4
.end method

.method static synthetic a(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;
    .locals 1

    .line 232
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->Q:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    return-object v0
.end method

.method static synthetic a(Lcom/huawei/ui/homewear21/home/WearHomeActivity;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 232
    iput-object p1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->al:Ljava/util/List;

    return-object p1
.end method

.method static synthetic a(Lcom/huawei/ui/homewear21/home/WearHomeActivity;Lo/egv;)Lo/egv;
    .locals 0

    .line 232
    iput-object p1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->Y:Lo/egv;

    return-object p1
.end method

.method private a(I)V
    .locals 6

    .line 4401
    const-string v0, "MainUI"

    const-string v1, "WearHomeActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Enter refreshBattery value:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 4403
    iget-boolean v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->D:Z

    if-eqz v0, :cond_2

    .line 4405
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dpb;->b(Landroid/content/Context;)Lo/dpb;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->X:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/dpb;->g(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_0

    .line 4406
    invoke-static {}, Lo/dpa;->c()Lo/dpa;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->X:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/dpa;->d(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 4407
    :cond_0
    const-string v0, "MainUI"

    const-string v1, "WearHomeActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Enter refreshBattery device is OTAing"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 4408
    return-void

    .line 4410
    :cond_1
    new-instance v5, Landroid/os/Message;

    invoke-direct {v5}, Landroid/os/Message;-><init>()V

    .line 4411
    const/16 v0, 0x3eb

    iput v0, v5, Landroid/os/Message;->what:I

    .line 4412
    iput p1, v5, Landroid/os/Message;->arg1:I

    .line 4413
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->aQ:Landroid/os/Handler;

    invoke-virtual {v0, v5}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 4414
    goto :goto_0

    .line 4415
    :cond_2
    const-string v0, "MainUI"

    const-string v1, "WearHomeActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "updateBluetoothState isConnect is false"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 4417
    :goto_0
    return-void
.end method

.method private a(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;)V
    .locals 7

    .line 4714
    const-string v0, "WearHomeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter connectedChanged"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4715
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->aQ:Landroid/os/Handler;

    const/16 v1, 0x3f5

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 4716
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->aQ:Landroid/os/Handler;

    const/16 v1, 0x3f5

    const-wide/16 v2, 0x3e8

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 4717
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->aQ:Landroid/os/Handler;

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->aU:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 4718
    const/4 v0, 0x0

    if-eq v0, p1, :cond_5

    .line 4719
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceConnectState()I

    move-result v5

    .line 4720
    const-string v0, "WearHomeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "connectedChanged(): "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",state = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4721
    invoke-static {}, Lo/etq;->d()Lo/etq;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->X:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/etq;->a(Ljava/lang/String;)Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->Q:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    .line 4722
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->Q:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 4723
    const-string v0, "MainUI"

    const-string v1, "WearHomeActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "currentDeviceInfo.getProductType():"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v4, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->Q:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 4724
    const-string v0, "MainUI"

    const-string v1, "WearHomeActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "deviceInfo.getProductType():"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 4726
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->Q:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v0

    invoke-direct {p0, v0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->h(I)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v0

    invoke-direct {p0, v0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->h(I)Z

    move-result v0

    if-nez v0, :cond_1

    .line 4727
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->Q:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v0

    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v1

    if-eq v0, v1, :cond_1

    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v0

    const/4 v1, -0x1

    if-eq v1, v0, :cond_1

    .line 4728
    const/4 v0, 0x2

    if-eq v0, v5, :cond_1

    .line 4729
    const-string v0, "MainUI"

    const-string v1, "WearHomeActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "get a connect change report,but it is not belong to current device,so return"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 4730
    return-void

    .line 4735
    :cond_1
    sparse-switch v5, :sswitch_data_0

    goto/16 :goto_2

    .line 4737
    :sswitch_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->D:Z

    .line 4738
    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->e(I)V

    .line 4739
    invoke-direct {p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->S()V

    .line 4740
    iget v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->ah:I

    const/4 v1, 0x0

    if-ne v1, v0, :cond_2

    .line 4741
    const-string v0, "MainUI"

    const-string v1, "WearHomeActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "connected change view!"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 4744
    :cond_2
    const/4 v0, 0x0

    new-array v0, v0, [Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    invoke-virtual {p0, v0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->d([Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;)V

    .line 4745
    invoke-direct {p0, p1}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->d(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;)V

    .line 4746
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getSecUUID()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_3

    const-string v6, ""

    goto :goto_0

    :cond_3
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getSecUUID()Ljava/lang/String;

    move-result-object v6

    .line 4747
    :goto_0
    const-string v0, "WearHomeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "currentUUID:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "  lastDeviceUUID:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->C:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4748
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->C:Ljava/lang/String;

    invoke-virtual {v6, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 4749
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->B:Landroid/widget/ScrollView;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/widget/ScrollView;->smoothScrollTo(II)V

    .line 4750
    iput-object v6, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->C:Ljava/lang/String;

    .line 4751
    invoke-direct {p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->ak()V

    goto :goto_1

    .line 4753
    :cond_4
    const-string v0, "WearHomeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "connectedChanged() mac error or same mac"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4755
    :goto_1
    invoke-static {}, Lo/etw;->d()Lo/etw;

    move-result-object v0

    invoke-virtual {v0}, Lo/etw;->e()V

    .line 4756
    goto :goto_3

    .line 4758
    :goto_2
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->D:Z

    .line 4759
    invoke-direct {p0, v5}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->e(I)V

    .line 4762
    :goto_3
    const-string v0, "WearHomeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "connectedChanged() isConnected:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->D:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4763
    invoke-direct {p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->J()V

    .line 4764
    goto :goto_4

    .line 4765
    :cond_5
    const-string v0, "WearHomeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "deviceInfo is null!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4768
    :goto_4
    return-void

    :sswitch_data_0
    .sparse-switch
        0x2 -> :sswitch_0
    .end sparse-switch
.end method

.method static synthetic a(Lcom/huawei/ui/homewear21/home/WearHomeActivity;I)V
    .locals 0

    .line 232
    invoke-direct {p0, p1}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->e(I)V

    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/homewear21/home/WearHomeActivity;ILjava/util/ArrayList;Ljava/lang/String;)V
    .locals 0

    .line 232
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->e(ILjava/util/ArrayList;Ljava/lang/String;)V

    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/homewear21/home/WearHomeActivity;Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;)V
    .locals 0

    .line 232
    invoke-direct {p0, p1}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->f(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;)V

    return-void
.end method

.method private a(Z)V
    .locals 2

    .line 2316
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->T:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportCoreSleep()Z

    move-result v0

    if-eqz v0, :cond_0

    const/16 v0, 0x3a

    invoke-static {v0}, Lo/czd;->e(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2317
    iget v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->F:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->F:I

    .line 2319
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->T:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isActivity_reminder()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2320
    iget v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->F:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->F:I

    .line 2322
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->T:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportHeartRateEnable()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 2323
    iget v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->F:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->F:I

    .line 2325
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->T:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isAvoid_disturb()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 2326
    iget v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->F:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->F:I

    .line 2328
    :cond_3
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->T:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isWeather_push()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 2329
    iget v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->F:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->F:I

    .line 2331
    :cond_4
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->T:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isBluetooth_off_alert()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 2332
    iget v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->F:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->F:I

    .line 2334
    :cond_5
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->T:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isAuto_light_screen()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 2335
    iget v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->F:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->F:I

    .line 2337
    :cond_6
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->T:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isRotate_switch_screen()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 2338
    iget v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->F:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->F:I

    .line 2340
    :cond_7
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->T:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportLeftRightHandWearMode()Z

    move-result v0

    if-eqz v0, :cond_8

    .line 2341
    iget v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->F:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->F:I

    .line 2343
    :cond_8
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->T:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isOta_update()Z

    move-result v0

    if-eqz v0, :cond_9

    if-nez p1, :cond_9

    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->Q:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v0

    const/16 v1, 0xc

    if-eq v1, v0, :cond_9

    .line 2344
    iget v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->F:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->F:I

    .line 2351
    :cond_9
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->T:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportPressAutoMonitor()Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-nez v0, :cond_a

    .line 2352
    iget v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->F:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->F:I

    .line 2354
    :cond_a
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->T:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportContinueHeartRate()Z

    move-result v0

    if-eqz v0, :cond_b

    .line 2355
    iget v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->F:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->F:I

    .line 2357
    :cond_b
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->T:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportIntelligentHomeLinkage()Z

    move-result v0

    if-eqz v0, :cond_c

    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-nez v0, :cond_c

    .line 2358
    iget v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->F:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->F:I

    .line 2360
    :cond_c
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->T:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportGPSPostProcessing()Z

    move-result v0

    if-eqz v0, :cond_d

    invoke-static {}, Lo/dbf;->f()Z

    move-result v0

    if-eqz v0, :cond_d

    .line 2361
    iget v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->F:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->F:I

    .line 2363
    :cond_d
    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/homewear21/home/WearHomeActivity;Z)Z
    .locals 0

    .line 232
    iput-boolean p1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->bg:Z

    return p1
.end method

.method private aA()V
    .locals 5

    .line 5670
    const-string v0, "WearHomeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter registerCoreSleepDefaultSwitchBroadcast"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 5672
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->w:Lo/enz;

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->X:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/enz;->b(Ljava/lang/String;)Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->w:Lo/enz;

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->X:Ljava/lang/String;

    .line 5673
    invoke-virtual {v0, v1}, Lo/enz;->b(Ljava/lang/String;)Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportCoreSleep()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->w:Lo/enz;

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->X:Ljava/lang/String;

    .line 5674
    invoke-virtual {v0, v1}, Lo/enz;->b(Ljava/lang/String;)Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportDefaultSwitch()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 5675
    const-string v0, "WearHomeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "registerCoreSleepDefaultSwitchBroadcast, isSupport!!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 5676
    new-instance v4, Landroid/content/IntentFilter;

    const-string v0, "com.huawei.bone.action.CORE_SLEEP_DEFAULT_SWITCH"

    invoke-direct {v4, v0}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 5677
    const-string v0, "com.huawei.bone.action.CORE_SLEEP_DEFAULT_SWITCH"

    invoke-virtual {v4, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 5678
    const-string v0, "com.huawei.bone.action.CONTINUE_HEART_RATE_SWITCH"

    invoke-virtual {v4, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 5679
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->s:Landroid/support/v4/content/LocalBroadcastManager;

    if-eqz v0, :cond_0

    .line 5680
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->s:Landroid/support/v4/content/LocalBroadcastManager;

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->bd:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1, v4}, Landroid/support/v4/content/LocalBroadcastManager;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V

    .line 5682
    :cond_0
    goto :goto_0

    .line 5683
    :cond_1
    const-string v0, "WearHomeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "registerCoreSleepDefaultSwitchBroadcast, capability is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 5685
    :goto_0
    return-void
.end method

.method private aB()V
    .locals 5

    .line 5778
    const-string v0, "WearHomeActivity"

    const/4 v1, 0x1

    :try_start_0
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter unRegisterBandUpdateDialogBroadcast()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 5779
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->u:Landroid/content/Context;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 5780
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->u:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->aX:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1

    .line 5786
    :cond_0
    goto :goto_0

    .line 5782
    :catch_0
    move-exception v4

    .line 5783
    const-string v0, "WearHomeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/lang/IllegalArgumentException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 5786
    goto :goto_0

    .line 5784
    :catch_1
    move-exception v4

    .line 5785
    const-string v0, "WearHomeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/lang/RuntimeException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 5787
    :goto_0
    return-void
.end method

.method private aC()V
    .locals 7

    .line 5969
    const-string v0, "MainUI"

    const-string v1, "WearHomeActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "dialogmessage Enter showDialog: messageList.size():"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v4, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->bc:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 5970
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->bc:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_2

    .line 5971
    const-string v0, "MainUI"

    const-string v1, "WearHomeActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "dialogmessage dialog type:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v4, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->bc:Ljava/util/List;

    const/4 v5, 0x0

    invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 5972
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->bc:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/ui/homewear21/home/WearHomeActivity$b;

    .line 5973
    sget-object v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$b;->b:Lcom/huawei/ui/homewear21/home/WearHomeActivity$b;

    if-ne v0, v6, :cond_0

    .line 5974
    invoke-direct {p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->aG()V

    goto :goto_0

    .line 5975
    :cond_0
    sget-object v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$b;->c:Lcom/huawei/ui/homewear21/home/WearHomeActivity$b;

    if-ne v0, v6, :cond_1

    .line 5976
    invoke-direct {p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->m()V

    goto :goto_0

    .line 5978
    :cond_1
    const-string v0, "MainUI"

    const-string v1, "WearHomeActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "dialogmessage dialog type enter else"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 5981
    :cond_2
    :goto_0
    return-void
.end method

.method private aD()V
    .locals 4

    .line 5861
    const-string v0, "WearHomeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkGpsSwitch"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 5862
    invoke-static {}, Lcom/huawei/hwfitnessmgr/receiver/SyncFitnessDetailDataBroadcastReceiver;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 5863
    invoke-direct {p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->aF()V

    .line 5865
    :cond_0
    return-void
.end method

.method private aE()V
    .locals 2

    .line 5881
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->t:Landroid/content/Context;

    sget-object v1, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->be:[Ljava/lang/String;

    invoke-static {v0, v1}, Lo/dbe;->c(Landroid/content/Context;[Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 5882
    sget-object v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->ak:[Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->e([Ljava/lang/String;)V

    .line 5884
    :cond_0
    return-void
.end method

.method private aF()V
    .locals 4

    .line 5868
    const-string v0, "WearHomeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "need show gps switch note"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 5869
    const/4 v0, 0x0

    invoke-static {v0}, Lcom/huawei/hwfitnessmgr/receiver/SyncFitnessDetailDataBroadcastReceiver;->a(Z)V

    .line 5870
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->u:Landroid/content/Context;

    invoke-static {v0}, Lo/dgo;->c(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 5871
    sget v0, Lcom/huawei/ui/homewear21/R$string;->IDS_hw_show_sport_dialog_open_gps_content:I

    const/16 v1, 0x65

    invoke-virtual {p0, v0, v1}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->c(II)V

    goto :goto_0

    .line 5873
    :cond_0
    invoke-direct {p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->aE()V

    .line 5875
    :goto_0
    return-void
.end method

.method private aG()V
    .locals 10

    .line 5803
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->z:Lo/fcb;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/fcb;->b(Z)V

    .line 5804
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->I:Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 5805
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->I:Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;

    invoke-virtual {v0}, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 5806
    const-string v0, "WearHomeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showDialogSetlock Already show!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 5807
    sget-object v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$b;->b:Lcom/huawei/ui/homewear21/home/WearHomeActivity$b;

    invoke-direct {p0, v0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->d(Lcom/huawei/ui/homewear21/home/WearHomeActivity$b;)V

    .line 5808
    return-void

    .line 5811
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->u:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homewear21/R$layout;->fragment_set_rate_reminder_dialog:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v5

    .line 5812
    sget v0, Lcom/huawei/ui/homewear21/R$id;->fragment_set_rate_reminder_dialog_image:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Landroid/widget/ImageView;

    .line 5813
    sget v0, Lcom/huawei/ui/homewear21/R$id;->fragment_set_rate_reminder_dialog_text:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Landroid/widget/TextView;

    .line 5814
    invoke-static {}, Lo/etq;->d()Lo/etq;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->X:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/etq;->a(Ljava/lang/String;)Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v8

    .line 5815
    const/4 v0, 0x0

    if-ne v0, v8, :cond_1

    .line 5816
    const-string v0, "MainUI"

    const-string v1, "WearHomeActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "refresh dialog Support deviceInfo is null , return"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 5817
    sget-object v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$b;->b:Lcom/huawei/ui/homewear21/home/WearHomeActivity$b;

    invoke-direct {p0, v0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->d(Lcom/huawei/ui/homewear21/home/WearHomeActivity$b;)V

    .line 5818
    return-void

    .line 5821
    :cond_1
    invoke-virtual {v8}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v0

    const/4 v1, 0x3

    if-eq v1, v0, :cond_2

    .line 5822
    invoke-virtual {v8}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v0

    const/16 v1, 0xa

    if-eq v1, v0, :cond_2

    .line 5823
    invoke-virtual {v8}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v0

    const/16 v1, 0x8

    if-ne v1, v0, :cond_3

    .line 5824
    :cond_2
    sget v0, Lcom/huawei/ui/homewear21/R$drawable;->home_set_rate_watch_remider_image:I

    invoke-virtual {v6, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 5825
    sget v0, Lcom/huawei/ui/homewear21/R$string;->IDS_main_homefragment_rate_reminder_watch_text:I

    invoke-virtual {v7, v0}, Landroid/widget/TextView;->setText(I)V

    goto :goto_0

    .line 5826
    :cond_3
    invoke-virtual {v8}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v0

    const/16 v1, 0xd

    if-eq v1, v0, :cond_4

    .line 5827
    invoke-virtual {v8}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v0

    const/16 v1, 0xf

    if-eq v1, v0, :cond_4

    .line 5828
    invoke-virtual {v8}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v0

    const/16 v1, 0x10

    if-eq v1, v0, :cond_4

    .line 5829
    invoke-virtual {v8}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v0

    const/16 v1, 0xc

    if-ne v1, v0, :cond_5

    .line 5830
    :cond_4
    sget v0, Lcom/huawei/ui/homewear21/R$drawable;->home_set_rate_band_remider_image:I

    invoke-virtual {v6, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 5831
    sget v0, Lcom/huawei/ui/homewear21/R$string;->IDS_main_homefragment_rate_reminder_band_text:I

    invoke-virtual {v7, v0}, Landroid/widget/TextView;->setText(I)V

    goto :goto_0

    .line 5832
    :cond_5
    invoke-virtual {v8}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v0

    const/16 v1, 0x17

    if-eq v1, v0, :cond_6

    .line 5833
    invoke-virtual {v8}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v0

    const/16 v1, 0x18

    if-ne v1, v0, :cond_7

    .line 5834
    :cond_6
    sget v0, Lcom/huawei/ui/homewear21/R$mipmap;->pic_runing_schema:I

    invoke-virtual {v6, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 5835
    sget v0, Lcom/huawei/ui/homewear21/R$string;->IDS_aw_running_mode_describe_dialog:I

    invoke-virtual {v7, v0}, Landroid/widget/TextView;->setText(I)V

    goto :goto_0

    .line 5838
    :cond_7
    sget-object v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$b;->b:Lcom/huawei/ui/homewear21/home/WearHomeActivity$b;

    invoke-direct {p0, v0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->d(Lcom/huawei/ui/homewear21/home/WearHomeActivity$b;)V

    .line 5839
    return-void

    .line 5841
    :goto_0
    new-instance v0, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$d;

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->u:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$d;-><init>(Landroid/content/Context;)V

    sget v1, Lcom/huawei/ui/homewear21/R$string;->IDS_common_notification_know_tips:I

    new-instance v2, Lcom/huawei/ui/homewear21/home/WearHomeActivity$59;

    invoke-direct {v2, p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity$59;-><init>(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)V

    .line 5842
    invoke-virtual {v0, v1, v2}, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$d;->a(ILandroid/content/DialogInterface$OnClickListener;)Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$d;

    move-result-object v9

    .line 5852
    invoke-virtual {v9}, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$d;->e()Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->I:Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;

    .line 5853
    invoke-virtual {v9, v5}, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$d;->a(Landroid/view/View;)Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$d;

    .line 5854
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->I:Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;->setCancelable(Z)V

    .line 5855
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->I:Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;

    invoke-virtual {v0}, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;->isShowing()Z

    move-result v0

    if-nez v0, :cond_8

    invoke-virtual {p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_8

    .line 5856
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->I:Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;

    invoke-virtual {v0}, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;->show()V

    .line 5858
    :cond_8
    return-void
.end method

.method private aH()V
    .locals 14

    .line 6065
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->X:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 6067
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->t:Landroid/content/Context;

    .line 6068
    const/16 v1, 0x2718

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "KEY_TOTAL_STEPS_FROM_DEVICE_FLAG"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 6067
    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 6070
    const/16 v0, 0x2718

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "KEY_TOTAL_STEPS_FROM_DEVICE_FLAG"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v6, v0, v1}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v7

    .line 6071
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->t:Landroid/content/Context;

    .line 6072
    const/16 v1, 0x2718

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "KEY_TOTAL_CAL_FROM_DEVICE_FLAG"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 6071
    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 6074
    const/16 v0, 0x2718

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "KEY_TOTAL_CAL_FROM_DEVICE_FLAG"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v8, v0, v1}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v9

    .line 6075
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->t:Landroid/content/Context;

    .line 6076
    const/16 v1, 0x2718

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "KEY_TOTAL_DISTANCE_FROM_DEVICE_FLAG"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 6075
    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    .line 6078
    const/16 v0, 0x2718

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "KEY_TOTAL_DISTANCE_FROM_DEVICE_FLAG"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v10, v0, v1}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v11

    .line 6079
    const-string v0, "MainUI"

    const-string v1, "WearHomeActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, " totalSteps ="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, " totalCal ="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, " totalDistance ="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 6082
    int-to-double v12, v11

    .line 6083
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 6084
    const/4 v0, 0x3

    invoke-static {v12, v13, v0}, Lo/cxh;->a(DI)D

    move-result-wide v12

    .line 6085
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->at:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/homewear21/R$string;->IDS_band_data_sport_distance_unit_en:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    goto :goto_0

    .line 6087
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->at:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/homewear21/R$string;->IDS_band_data_sport_distance_unit:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 6089
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->aw:Landroid/widget/TextView;

    int-to-double v1, v7

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 6090
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->au:Landroid/widget/TextView;

    int-to-double v1, v9

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 6091
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->av:Landroid/widget/TextView;

    const-wide v1, 0x408f400000000000L    # 1000.0

    div-double v1, v12, v1

    const/4 v3, 0x1

    const/4 v4, 0x2

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 6092
    return-void
.end method

.method private aI()V
    .locals 5

    .line 6197
    new-instance v4, Landroid/content/Intent;

    const-string v0, "android.intent.action.DIAL"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "tel:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v2

    sget v3, Lcom/huawei/ui/homewear21/R$string;->IDS_main_sns_member_service_call_number_item_2:I

    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    invoke-direct {v4, v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 6198
    invoke-virtual {p0, v4}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->startActivity(Landroid/content/Intent;)V

    .line 6199
    return-void
.end method

.method private aJ()V
    .locals 6

    .line 6181
    const-string v0, "MainUI"

    const-string v1, "WearHomeActivity"

    const/4 v2, 0x1

    :try_start_0
    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Enter unRegisterUpdateHealthDataBroadcast():"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 6182
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->u:Landroid/content/Context;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 6183
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->u:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->bf:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1

    .line 6189
    :cond_0
    goto :goto_0

    .line 6185
    :catch_0
    move-exception v5

    .line 6186
    const-string v0, "MainUI"

    const-string v1, "WearHomeActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v5}, Ljava/lang/IllegalArgumentException;->getMessage()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 6189
    goto :goto_0

    .line 6187
    :catch_1
    move-exception v5

    .line 6188
    const-string v0, "MainUI"

    const-string v1, "WearHomeActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v5}, Ljava/lang/RuntimeException;->getMessage()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 6190
    :goto_0
    return-void
.end method

.method private aK()V
    .locals 10

    .line 6011
    const-string v0, "MainUI"

    const-string v1, "WearHomeActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Enter showOpenSystemBluetoothDialog!!!"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 6012
    invoke-static {}, Lo/etq;->d()Lo/etq;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 6013
    invoke-static {}, Lo/etq;->d()Lo/etq;

    move-result-object v0

    invoke-virtual {v0}, Lo/etq;->g()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 6014
    :cond_0
    const-string v0, "MainUI"

    const-string v1, "WearHomeActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "showOpenSystemBluetoothDialog 0000 !!!"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 6015
    return-void

    .line 6017
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->ao:Lo/egy;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 6018
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->ao:Lo/egy;

    invoke-virtual {v0}, Lo/egy;->isShowing()Z

    move-result v0

    if-nez v0, :cond_2

    .line 6019
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->ao:Lo/egy;

    invoke-virtual {v0}, Lo/egy;->show()V

    .line 6022
    :cond_2
    const-string v0, "MainUI"

    const-string v1, "WearHomeActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "showOpenSystemBluetoothDialog 1111 !!!"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 6023
    return-void

    .line 6025
    :cond_3
    const-string v0, "MainUI"

    const-string v1, "WearHomeActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "showOpenSystemBluetoothDialog 2222 !!!"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 6026
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->u:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homewear21/R$string;->IDS_app_name_health:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v5

    .line 6027
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->u:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homewear21/R$string;->IDS_device_bt_open_request_info:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v6

    .line 6028
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object v5, v0, v1

    invoke-static {v6, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    .line 6029
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->u:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homewear21/R$string;->IDS_device_bt_open_info_tip:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v8

    .line 6030
    new-instance v0, Lo/egy$b;

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->u:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/egy$b;-><init>(Landroid/content/Context;)V

    .line 6031
    invoke-virtual {v0, v7}, Lo/egy$b;->a(Ljava/lang/String;)Lo/egy$b;

    move-result-object v0

    .line 6032
    invoke-virtual {v0, v8}, Lo/egy$b;->d(Ljava/lang/String;)Lo/egy$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homewear21/R$string;->IDS_device_bt_left_btn_info:I

    new-instance v2, Lcom/huawei/ui/homewear21/home/WearHomeActivity$64;

    invoke-direct {v2, p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity$64;-><init>(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)V

    .line 6033
    invoke-virtual {v0, v1, v2}, Lo/egy$b;->e(ILandroid/view/View$OnClickListener;)Lo/egy$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homewear21/R$string;->IDS_device_bt_right_btn_info:I

    new-instance v2, Lcom/huawei/ui/homewear21/home/WearHomeActivity$65;

    invoke-direct {v2, p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity$65;-><init>(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)V

    .line 6047
    invoke-virtual {v0, v1, v2}, Lo/egy$b;->d(ILandroid/view/View$OnClickListener;)Lo/egy$b;

    move-result-object v9

    .line 6058
    invoke-virtual {v9}, Lo/egy$b;->a()Lo/egy;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->ao:Lo/egy;

    .line 6059
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->ao:Lo/egy;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egy;->setCancelable(Z)V

    .line 6060
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->ao:Lo/egy;

    invoke-virtual {v0}, Lo/egy;->show()V

    .line 6061
    return-void
.end method

.method private aL()V
    .locals 6

    .line 6156
    const-string v0, "MainUI"

    const-string v1, "WearHomeActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Enter registerUpdateHealthDataBroadcast"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 6157
    new-instance v5, Landroid/content/IntentFilter;

    const-string v0, "com.huawei.bone.action.FITNESS_DATA_TODAY_SYNC"

    invoke-direct {v5, v0}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 6158
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->u:Landroid/content/Context;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 6159
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->u:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->bf:Landroid/content/BroadcastReceiver;

    sget-object v2, Lo/dac;->a:Ljava/lang/String;

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v5, v2, v3}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Ljava/lang/String;Landroid/os/Handler;)Landroid/content/Intent;

    .line 6161
    :cond_0
    return-void
.end method

.method private aM()V
    .locals 2

    .line 6253
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->u:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/PluginPay;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/PluginPay;

    move-result-object v1

    .line 6254
    invoke-static {}, Lo/cvu;->d()Lo/cvu;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/huawei/nfc/PluginPay;->setAdapter(Lo/eab;)V

    .line 6255
    invoke-virtual {v1}, Lcom/huawei/nfc/PluginPay;->goToCardListActivity()V

    .line 6256
    return-void
.end method

.method private aN()V
    .locals 4

    .line 6274
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->bb:Lo/egv;

    if-nez v0, :cond_0

    .line 6275
    new-instance v0, Lo/egv$b;

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->u:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/egv$b;-><init>(Landroid/content/Context;)V

    sget v1, Lcom/huawei/ui/homewear21/R$string;->IDS_about_feedback_log_title:I

    .line 6276
    invoke-virtual {v0, v1}, Lo/egv$b;->b(I)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homewear21/R$string;->IDS_about_feedback_logupload_content:I

    .line 6277
    invoke-virtual {v0, v1}, Lo/egv$b;->e(I)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homewear21/R$string;->IDS_user_permission_ok:I

    new-instance v2, Lcom/huawei/ui/homewear21/home/WearHomeActivity$67;

    invoke-direct {v2, p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity$67;-><init>(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)V

    .line 6278
    invoke-virtual {v0, v1, v2}, Lo/egv$b;->e(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homewear21/R$string;->IDS_settings_button_cancal:I

    new-instance v2, Lcom/huawei/ui/homewear21/home/WearHomeActivity$62;

    invoke-direct {v2, p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity$62;-><init>(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)V

    .line 6291
    invoke-virtual {v0, v1, v2}, Lo/egv$b;->b(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    move-result-object v3

    .line 6297
    invoke-virtual {v3}, Lo/egv$b;->b()Lo/egv;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->bb:Lo/egv;

    .line 6298
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->bb:Lo/egv;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egv;->setCancelable(Z)V

    .line 6300
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_1

    .line 6301
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->bb:Lo/egv;

    invoke-virtual {v0}, Lo/egv;->show()V

    .line 6303
    :cond_1
    return-void
.end method

.method private aO()V
    .locals 6

    .line 6307
    const-string v0, "WearHomeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "send  startFeedBackLog"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 6308
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->t:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/hwdevicedfxmanager/UploadLogUtil;->isNoNetworkActive(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 6310
    const-string v0, "WearHomeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "FeedBackLog is NoNetworkActive"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 6312
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->u:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/homewear21/R$string;->IDS_hw_toast_log_upload_failed:I

    invoke-static {v0, v1}, Lo/emv;->c(Landroid/content/Context;I)V

    .line 6313
    return-void

    .line 6316
    :cond_0
    invoke-static {}, Lo/etq;->d()Lo/etq;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->X:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/etq;->a(Ljava/lang/String;)Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v4

    .line 6317
    const/4 v0, 0x0

    if-eq v0, v4, :cond_1

    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceConnectState()I

    move-result v0

    const/4 v1, 0x2

    if-eq v1, v0, :cond_1

    .line 6318
    const-string v0, "WearHomeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "bt is disconnected"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 6319
    sget v0, Lcom/huawei/ui/homewear21/R$string;->IDS_hw_show_log_bt_disconnect:I

    const-string v1, ""

    invoke-virtual {p0, v0, v1}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->a(ILjava/lang/String;)V

    .line 6320
    return-void

    .line 6323
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->t:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->getInstance(Landroid/content/Context;)Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->isDeviceSuport()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 6324
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->t:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/homewear21/R$string;->IDS_hw_show_log_progress:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    .line 6325
    invoke-direct {p0, v5}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->c(Ljava/lang/String;)V

    .line 6326
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->bg:Z

    .line 6327
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->t:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->getInstance(Landroid/content/Context;)Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->X:Ljava/lang/String;

    iget-object v2, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->bl:Lcom/huawei/hwdevicedfxmanager/callback/IDeviceDFXBaseResponseCallback;

    invoke-virtual {v0, v1, v2}, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->getDeviceLog(Ljava/lang/String;Lcom/huawei/hwdevicedfxmanager/callback/IDeviceDFXBaseResponseCallback;)V

    .line 6328
    goto/16 :goto_0

    .line 6329
    :cond_2
    const-string v0, "WearHomeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "device is not supported"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 6330
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->t:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/hwdevicedfxmanager/UploadLogUtil;->isNoNetworkActive(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 6331
    invoke-direct {p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->aQ()V

    .line 6332
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->bk:Z

    .line 6333
    const/4 v0, 0x0

    invoke-static {v0}, Lcom/huawei/hwdevicedfxmanager/UploadLogUtil;->setAgreeUploadUseFlow(Z)V

    .line 6334
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->u:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/homewear21/R$string;->IDS_hw_toast_log_upload_failed:I

    invoke-static {v0, v1}, Lo/emv;->c(Landroid/content/Context;I)V

    .line 6335
    return-void

    .line 6337
    :cond_3
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->t:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/hwdevicedfxmanager/UploadLogUtil;->isWifiActive(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 6338
    const-string v0, "WearHomeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "wifi is disconnected , use network"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 6339
    const/4 v0, 0x1

    invoke-static {v0}, Lcom/huawei/hwdevicedfxmanager/UploadLogUtil;->setAgreeUploadUseFlow(Z)V

    .line 6340
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->getInstance(Landroid/content/Context;)Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->startUploadLogFile(Z)V

    .line 6342
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->bo:Lcom/huawei/hwdevicedfxmanager/callback/IDeviceDFXUploadCallback;

    invoke-static {v0}, Lcom/huawei/hwdevicedfxmanager/UploadLogUtil;->setCallback(Lcom/huawei/hwdevicedfxmanager/callback/IDeviceDFXUploadCallback;)V

    goto :goto_0

    .line 6345
    :cond_4
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->bk:Z

    .line 6346
    invoke-direct {p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->aQ()V

    .line 6347
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->t:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/homewear21/R$string;->IDS_hw_toast_log_upload_background:I

    invoke-static {v0, v1}, Lo/emv;->c(Landroid/content/Context;I)V

    .line 6348
    const-string v0, "WearHomeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u6b63\u5728\u8fdb\u884clog  wifi\u4e0a\u4f20"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 6349
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->getInstance(Landroid/content/Context;)Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->startUploadLogFile(Z)V

    .line 6350
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v5

    .line 6351
    const/16 v0, 0x3fd

    iput v0, v5, Landroid/os/Message;->what:I

    .line 6352
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->aQ:Landroid/os/Handler;

    const-wide/32 v1, 0x927c0

    invoke-virtual {v0, v5, v1, v2}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 6356
    :goto_0
    return-void
.end method

.method private aP()V
    .locals 4

    .line 6205
    const-string v0, "WearHomeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter gotoWallet"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 6208
    invoke-direct {p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->aM()V

    .line 6244
    return-void
.end method

.method private aQ()V
    .locals 4

    .line 6446
    invoke-virtual {p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 6447
    return-void

    .line 6449
    :cond_0
    const-string v0, "WearHomeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter dismissLoadingDialog()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 6450
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->bi:Lo/egn;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->bi:Lo/egn;

    invoke-virtual {v0}, Lo/egn;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 6451
    const-string v0, "WearHomeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "dismissLoadingDialog()!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 6452
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->bi:Lo/egn;

    invoke-virtual {v0}, Lo/egn;->cancel()V

    .line 6453
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->bi:Lo/egn;

    .line 6455
    :cond_1
    return-void
.end method

.method private aR()V
    .locals 4

    .line 6570
    const-string v0, "WearHomeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter closeProgress"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 6571
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->E:Lo/ego;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->E:Lo/ego;

    invoke-virtual {v0}, Lo/ego;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 6572
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->E:Lo/ego;

    invoke-virtual {v0}, Lo/ego;->cancel()V

    .line 6573
    const-string v0, "WearHomeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter closeProgress cancel"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 6575
    :cond_0
    return-void
.end method

.method private aS()V
    .locals 6

    .line 6706
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dde;->d(Landroid/content/Context;)Lo/dde;

    move-result-object v0

    invoke-virtual {v0}, Lo/dde;->d()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v4

    .line 6707
    const/4 v0, 0x0

    if-eq v0, v4, :cond_1

    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v0

    invoke-static {v0}, Lo/dda;->i(I)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 6708
    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v5

    .line 6709
    const-string v0, "WearHomeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "current device support download type:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 6710
    sget-object v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->am:Ljava/util/concurrent/ExecutorService;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    sget-object v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->am:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->isShutdown()Z

    move-result v0

    if-nez v0, :cond_0

    .line 6711
    sget-object v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->am:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/huawei/ui/homewear21/home/WearHomeActivity$76;

    invoke-direct {v1, p0, v5}, Lcom/huawei/ui/homewear21/home/WearHomeActivity$76;-><init>(Lcom/huawei/ui/homewear21/home/WearHomeActivity;I)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 6728
    :cond_0
    goto :goto_0

    .line 6729
    :cond_1
    const-string v0, "WearHomeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "current device is null or not support download!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 6731
    :goto_0
    return-void
.end method

.method private aU()V
    .locals 6

    .line 6819
    new-instance v4, Landroid/content/Intent;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const-class v1, Lcom/huawei/hwservicesmgr/PhoneService;

    invoke-direct {v4, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 6820
    const-string v0, "com.huawei.health.ACTION_WEATHER_PUSH"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 6821
    new-instance v5, Landroid/os/Bundle;

    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    .line 6822
    const-string v0, "com.huawei.health.ACTION_WEATHER_PUSH_VALUE"

    const/4 v1, 0x1

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 6823
    invoke-virtual {v4, v5}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 6825
    const-string v0, "WearHomeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "start to push notification msg."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 6826
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 6828
    return-void
.end method

.method private aV()V
    .locals 5

    .line 6834
    new-instance v0, Lo/egy$b;

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->u:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/egy$b;-><init>(Landroid/content/Context;)V

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->u:Landroid/content/Context;

    .line 6835
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homewear21/R$string;->IDS_device_ota_later_note:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egy$b;->a(Ljava/lang/String;)Lo/egy$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homewear21/R$string;->IDS_user_permission_know:I

    new-instance v2, Lcom/huawei/ui/homewear21/home/WearHomeActivity$82;

    invoke-direct {v2, p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity$82;-><init>(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)V

    .line 6836
    invoke-virtual {v0, v1, v2}, Lo/egy$b;->d(ILandroid/view/View$OnClickListener;)Lo/egy$b;

    move-result-object v3

    .line 6842
    invoke-virtual {v3}, Lo/egy$b;->a()Lo/egy;

    move-result-object v4

    .line 6843
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Lo/egy;->setCancelable(Z)V

    .line 6844
    invoke-virtual {v4}, Lo/egy;->show()V

    .line 6845
    return-void
.end method

.method private aa()V
    .locals 5

    .line 4469
    const-string v0, "WearHomeActivity"

    const/4 v1, 0x1

    :try_start_0
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter unRegisterUnbindDeviceBroadcast()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4470
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->u:Landroid/content/Context;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 4471
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->u:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->aZ:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1

    .line 4477
    :cond_0
    goto :goto_0

    .line 4473
    :catch_0
    move-exception v4

    .line 4474
    const-string v0, "WearHomeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/lang/IllegalArgumentException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4477
    goto :goto_0

    .line 4475
    :catch_1
    move-exception v4

    .line 4476
    const-string v0, "WearHomeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/lang/RuntimeException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4478
    :goto_0
    return-void
.end method

.method static synthetic aa(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)V
    .locals 0

    .line 232
    invoke-direct {p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->aO()V

    return-void
.end method

.method static synthetic ab(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)Lo/egy;
    .locals 1

    .line 232
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->ao:Lo/egy;

    return-object v0
.end method

.method private ab()V
    .locals 5

    .line 4456
    const-string v0, "WearHomeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter registerUnbindDeviceBroadcast"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4457
    new-instance v4, Landroid/content/IntentFilter;

    const-string v0, "com.huawei.bone.action.UNBIND_DEVICE"

    invoke-direct {v4, v0}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 4458
    const-string v0, "com.huawei.bone.action.UNBIND_DEVICE"

    invoke-virtual {v4, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 4459
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->u:Landroid/content/Context;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 4460
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->u:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->aZ:Landroid/content/BroadcastReceiver;

    sget-object v2, Lo/dac;->a:Ljava/lang/String;

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v4, v2, v3}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Ljava/lang/String;Landroid/os/Handler;)Landroid/content/Intent;

    .line 4462
    :cond_0
    return-void
.end method

.method static synthetic ac(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)Ljava/util/List;
    .locals 1

    .line 232
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->al:Ljava/util/List;

    return-object v0
.end method

.method private ac()V
    .locals 6

    .line 4485
    :try_start_0
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->s:Landroid/support/v4/content/LocalBroadcastManager;

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->aS:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/support/v4/content/LocalBroadcastManager;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1

    .line 4490
    goto :goto_0

    .line 4486
    :catch_0
    move-exception v5

    .line 4487
    const-string v0, "MainUI"

    const-string v1, "WearHomeActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v5}, Ljava/lang/IllegalArgumentException;->getMessage()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 4490
    goto :goto_0

    .line 4488
    :catch_1
    move-exception v5

    .line 4489
    const-string v0, "MainUI"

    const-string v1, "WearHomeActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v5}, Ljava/lang/RuntimeException;->getMessage()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 4491
    :goto_0
    return-void
.end method

.method static synthetic ad(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)Lo/eoa;
    .locals 1

    .line 232
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->j:Lo/eoa;

    return-object v0
.end method

.method private ad()V
    .locals 6

    .line 4816
    const-string v0, "MainUI"

    const-string v1, "WearHomeActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "updateNoDisturb()"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 4817
    new-instance v5, Lcom/huawei/ui/homewear21/home/WearHomeActivity$44;

    invoke-direct {v5, p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity$44;-><init>(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)V

    .line 4834
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->w:Lo/enz;

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->u:Landroid/content/Context;

    invoke-virtual {v0, v1, v5}, Lo/enz;->a(Landroid/content/Context;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 4835
    return-void
.end method

.method private ae()V
    .locals 5

    .line 4590
    new-instance v4, Landroid/content/IntentFilter;

    invoke-direct {v4}, Landroid/content/IntentFilter;-><init>()V

    .line 4592
    const-string v0, "com.huawei.bone.action.CONNECTION_STATE_CHANGED"

    invoke-virtual {v4, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 4593
    const-string v0, "com.huawei.bone.action.CORE_SLEEP_DATA_SYNC_COMPLETED"

    invoke-virtual {v4, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 4594
    const-string v0, "com.huawei.bone.action.open_gps"

    invoke-virtual {v4, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 4595
    const/16 v0, 0x3e8

    invoke-virtual {v4, v0}, Landroid/content/IntentFilter;->setPriority(I)V

    .line 4597
    const-string v0, "com.huawei.bone.action.PHONE_SERVICE_BIND_SUCCESS"

    invoke-virtual {v4, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 4599
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->u:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->aT:Landroid/content/BroadcastReceiver;

    sget-object v2, Lo/dac;->a:Ljava/lang/String;

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v4, v2, v3}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Ljava/lang/String;Landroid/os/Handler;)Landroid/content/Intent;

    .line 4601
    return-void
.end method

.method static synthetic ae(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)Z
    .locals 1

    .line 232
    iget-boolean v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->bg:Z

    return v0
.end method

.method private af()V
    .locals 7

    .line 4657
    const-string v0, "WearHomeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showBandUnavailableDialog"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4658
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->u:Landroid/content/Context;

    const-string v1, "com.huawei.ui.homewear21.home.WearHomeActivity"

    invoke-static {v0, v1}, Lo/dbf;->h(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v4

    .line 4659
    const-string v0, "WearHomeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isForeground : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4660
    if-nez v4, :cond_0

    .line 4661
    return-void

    .line 4664
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->ar:Lo/egv;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 4665
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->ar:Lo/egv;

    invoke-virtual {v0}, Lo/egv;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 4666
    const-string v0, "WearHomeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showBandUnavailableDialog Already show!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4667
    return-void

    .line 4671
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->u:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/homewear21/R$string;->IDS_band_is_unavailable_tip_string_newphone:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    .line 4672
    new-instance v0, Lo/egv$b;

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->u:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/egv$b;-><init>(Landroid/content/Context;)V

    sget v1, Lcom/huawei/ui/homewear21/R$string;->IDS_service_area_notice_title:I

    .line 4673
    invoke-virtual {v0, v1}, Lo/egv$b;->b(I)Lo/egv$b;

    move-result-object v0

    .line 4674
    invoke-virtual {v0, v5}, Lo/egv$b;->b(Ljava/lang/String;)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homewear21/R$string;->IDS_common_notification_know_tips:I

    new-instance v2, Lcom/huawei/ui/homewear21/home/WearHomeActivity$41;

    invoke-direct {v2, p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity$41;-><init>(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)V

    .line 4675
    invoke-virtual {v0, v1, v2}, Lo/egv$b;->e(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    move-result-object v6

    .line 4680
    invoke-virtual {v6}, Lo/egv$b;->b()Lo/egv;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->ar:Lo/egv;

    .line 4681
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->ar:Lo/egv;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egv;->setCancelable(Z)V

    .line 4682
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->ar:Lo/egv;

    invoke-virtual {v0}, Lo/egv;->isShowing()Z

    move-result v0

    if-nez v0, :cond_2

    .line 4683
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->ar:Lo/egv;

    invoke-virtual {v0}, Lo/egv;->show()V

    .line 4685
    :cond_2
    return-void
.end method

.method static synthetic ag(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)Lo/egv;
    .locals 1

    .line 232
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->br:Lo/egv;

    return-object v0
.end method

.method private ag()V
    .locals 3

    .line 4568
    new-instance v2, Landroid/content/IntentFilter;

    invoke-direct {v2}, Landroid/content/IntentFilter;-><init>()V

    .line 4569
    const-string v0, "parieddevicesswitcher_wait_dialog_broadcast"

    invoke-virtual {v2, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 4570
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->s:Landroid/support/v4/content/LocalBroadcastManager;

    .line 4571
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->s:Landroid/support/v4/content/LocalBroadcastManager;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 4572
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->s:Landroid/support/v4/content/LocalBroadcastManager;

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->aS:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1, v2}, Landroid/support/v4/content/LocalBroadcastManager;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V

    goto :goto_0

    .line 4574
    :cond_0
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->s:Landroid/support/v4/content/LocalBroadcastManager;

    .line 4576
    :goto_0
    return-void
.end method

.method static synthetic ah(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)Lcom/huawei/hwdevicedfxmanager/callback/IDeviceDFXUploadCallback;
    .locals 1

    .line 232
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->bo:Lcom/huawei/hwdevicedfxmanager/callback/IDeviceDFXUploadCallback;

    return-object v0
.end method

.method private ah()V
    .locals 6

    .line 4605
    const-string v0, "MainUI"

    const-string v1, "WearHomeActivity"

    const/4 v2, 0x1

    :try_start_0
    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Enter unregisterNonLocalBroadcast()!"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 4606
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->u:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->aT:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 4611
    goto :goto_0

    .line 4607
    :catch_0
    move-exception v5

    .line 4608
    const-string v0, "MainUI"

    const-string v1, "WearHomeActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v5}, Ljava/lang/IllegalArgumentException;->getMessage()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 4611
    goto :goto_0

    .line 4609
    :catch_1
    move-exception v5

    .line 4610
    const-string v0, "MainUI"

    const-string v1, "WearHomeActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v5}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 4612
    :goto_0
    return-void
.end method

.method private ai()V
    .locals 0

    .line 5021
    return-void
.end method

.method private aj()V
    .locals 3

    .line 5051
    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    .line 5052
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->u:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "com.huawei.health.MainActivity"

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 5053
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 5054
    invoke-virtual {p0, v2}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->startActivity(Landroid/content/Intent;)V

    .line 5055
    invoke-virtual {p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->finish()V

    .line 5056
    return-void
.end method

.method private ak()V
    .locals 5

    .line 4978
    const-string v0, "MainUI"

    const-string v1, "WearHomeActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Enter getPermissions"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 4979
    invoke-static {}, Lo/etq;->d()Lo/etq;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->X:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/etq;->a(Ljava/lang/String;)Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->Q:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    .line 4980
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->Q:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 4981
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->w:Lo/enz;

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->X:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/enz;->b(Ljava/lang/String;)Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->T:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    .line 4982
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->T:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->T:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isWeather_push()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 4983
    const-string v0, "MainUI"

    const-string v1, "WearHomeActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "SUPPORT WEATHER PUSH"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 4984
    sget-object v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->ak:[Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->e([Ljava/lang/String;)V

    goto :goto_0

    .line 4986
    :cond_0
    const-string v0, "MainUI"

    const-string v1, "WearHomeActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "NOT SUPPORT WEATHER PUSH"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 4987
    sget-object v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->aj:[Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->e([Ljava/lang/String;)V

    .line 4990
    :cond_1
    :goto_0
    return-void
.end method

.method private al()V
    .locals 6

    .line 4994
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->z:Lo/fcb;

    invoke-virtual {v0}, Lo/fcb;->d()Z

    move-result v5

    .line 4995
    const-string v0, "MainUI"

    const-string v1, "WearHomeActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Enter onResume private void showRateRemiderDialog() = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 4996
    if-eqz v5, :cond_0

    .line 4997
    sget-object v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$b;->b:Lcom/huawei/ui/homewear21/home/WearHomeActivity$b;

    invoke-direct {p0, v0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->c(Lcom/huawei/ui/homewear21/home/WearHomeActivity$b;)V

    .line 4999
    :cond_0
    return-void
.end method

.method private am()Z
    .locals 7

    .line 4873
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->t:Landroid/content/Context;

    sget-object v1, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->bh:[Ljava/lang/String;

    invoke-static {v0, v1}, Lo/dbe;->c(Landroid/content/Context;[Ljava/lang/String;)Z

    move-result v5

    .line 4874
    const-string v0, "WearHomeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "hasPermissionNeeded ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4875
    if-nez v5, :cond_2

    .line 4876
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_2

    .line 4877
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->t:Landroid/content/Context;

    const-string v1, "android.permission.WRITE_EXTERNAL_STORAGE"

    invoke-static {v0, v1}, Lo/dbf;->l(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->u:Landroid/content/Context;

    check-cast v0, Landroid/app/Activity;

    const-string v1, "android.permission.WRITE_EXTERNAL_STORAGE"

    .line 4878
    invoke-virtual {v0, v1}, Landroid/app/Activity;->shouldShowRequestPermissionRationale(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v6, 0x1

    goto :goto_0

    :cond_1
    const/4 v6, 0x0

    .line 4879
    :goto_0
    if-nez v6, :cond_2

    .line 4880
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->u:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->t:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homewear21/R$string;->IDS_hw_feedback_permission_guide_torage:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/ene;->c(Landroid/content/Context;Ljava/lang/String;)V

    .line 4881
    const/4 v0, 0x1

    return v0

    .line 4885
    :cond_2
    if-nez v5, :cond_3

    .line 4886
    const-string v0, "WearHomeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "have no Permission"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4887
    sget-object v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->bh:[Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->e([Ljava/lang/String;)V

    .line 4888
    const/4 v4, 0x1

    goto :goto_1

    .line 4890
    :cond_3
    const-string v0, "WearHomeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "have Permission"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4891
    const/4 v4, 0x0

    .line 4893
    :goto_1
    return v4
.end method

.method private an()V
    .locals 6

    .line 5495
    const-string v0, "MainUI"

    const-string v1, "WearHomeActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Enter registerDeleteDeviceBroadcast"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 5496
    new-instance v5, Landroid/content/IntentFilter;

    const-string v0, "action_delete_debice_in_device_manager_list"

    invoke-direct {v5, v0}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 5497
    const-string v0, "com.huawei.hihealth.user_preference"

    invoke-virtual {v5, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 5498
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->s:Landroid/support/v4/content/LocalBroadcastManager;

    if-eqz v0, :cond_0

    .line 5499
    const-string v0, "MainUI"

    const-string v1, "WearHomeActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Enter registerDeleteDeviceBroadcast localBroadcastManager != null"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 5500
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->s:Landroid/support/v4/content/LocalBroadcastManager;

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->ba:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1, v5}, Landroid/support/v4/content/LocalBroadcastManager;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V

    .line 5502
    :cond_0
    return-void
.end method

.method private ao()V
    .locals 0

    .line 5492
    return-void
.end method

.method private ap()V
    .locals 5

    .line 5328
    const-string v0, "MainUI"

    const-string v1, "WearHomeActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "unRegisterWearableManager() "

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 5329
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->t:Landroid/content/Context;

    invoke-static {v0}, Lo/dde;->d(Landroid/content/Context;)Lo/dde;

    move-result-object v0

    invoke-virtual {v0}, Lo/dde;->n()V

    .line 5330
    return-void
.end method

.method private aq()V
    .locals 5

    .line 5336
    const-string v0, "MainUI"

    const-string v1, "WearHomeActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "checkLocationServiceStatus() ENTER"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 5337
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->w:Lo/enz;

    if-nez v0, :cond_0

    .line 5338
    const-string v0, "MainUI"

    const-string v1, "WearHomeActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "checkLocationServiceStatus() if (mDeviceInteractors == null)"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 5339
    return-void

    .line 5341
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->w:Lo/enz;

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->X:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/enz;->b(Ljava/lang/String;)Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->T:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    .line 5347
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->ax:Lo/dqi;

    const-string v1, "weather_switch_status"

    new-instance v2, Lcom/huawei/ui/homewear21/home/WearHomeActivity$52;

    invoke-direct {v2, p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity$52;-><init>(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)V

    invoke-virtual {v0, v1, v2}, Lo/dqi;->a(Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 5432
    return-void
.end method

.method private ar()V
    .locals 2

    .line 5305
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->t:Landroid/content/Context;

    invoke-static {v0}, Lo/dde;->d(Landroid/content/Context;)Lo/dde;

    move-result-object v0

    new-instance v1, Lcom/huawei/ui/homewear21/home/WearHomeActivity$46;

    invoke-direct {v1, p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity$46;-><init>(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)V

    invoke-virtual {v0, v1}, Lo/dde;->f(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 5319
    return-void
.end method

.method private as()V
    .locals 2

    .line 5567
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->af:Lo/etw;

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->aW:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-virtual {v0, v1}, Lo/etw;->c(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 5568
    return-void
.end method

.method private at()V
    .locals 5

    .line 5593
    new-instance v4, Landroid/content/IntentFilter;

    const-string v0, "com.huawei.bone.action.ACTION_DIALOG_DISMISS"

    invoke-direct {v4, v0}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 5594
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->u:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->aY:Landroid/content/BroadcastReceiver;

    sget-object v2, Lo/dac;->a:Ljava/lang/String;

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v4, v2, v3}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Ljava/lang/String;Landroid/os/Handler;)Landroid/content/Intent;

    .line 5595
    return-void
.end method

.method private au()V
    .locals 6

    .line 5602
    const-string v0, "MainUI"

    const-string v1, "WearHomeActivity"

    const/4 v2, 0x1

    :try_start_0
    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Enter unregisterDialogDismissBroadcast()!"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 5603
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->u:Landroid/content/Context;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 5604
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->u:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->aY:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1

    .line 5610
    :cond_0
    goto :goto_0

    .line 5606
    :catch_0
    move-exception v5

    .line 5607
    const-string v0, "MainUI"

    const-string v1, "WearHomeActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v5}, Ljava/lang/IllegalArgumentException;->getMessage()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 5610
    goto :goto_0

    .line 5608
    :catch_1
    move-exception v5

    .line 5609
    const-string v0, "MainUI"

    const-string v1, "WearHomeActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v5}, Ljava/lang/RuntimeException;->getMessage()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 5611
    :goto_0
    return-void
.end method

.method private av()V
    .locals 6

    .line 5540
    :try_start_0
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->s:Landroid/support/v4/content/LocalBroadcastManager;

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->ba:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/support/v4/content/LocalBroadcastManager;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1

    .line 5545
    goto :goto_0

    .line 5541
    :catch_0
    move-exception v5

    .line 5542
    const-string v0, "MainUI"

    const-string v1, "WearHomeActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v5}, Ljava/lang/IllegalArgumentException;->getMessage()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 5545
    goto :goto_0

    .line 5543
    :catch_1
    move-exception v5

    .line 5544
    const-string v0, "MainUI"

    const-string v1, "WearHomeActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v5}, Ljava/lang/RuntimeException;->getMessage()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 5546
    :goto_0
    return-void
.end method

.method private aw()V
    .locals 5

    .line 5552
    const-string v0, "MainUI"

    const-string v1, "WearHomeActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Enter startMessageNotificationObserver!"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 5553
    invoke-static {}, Lo/etw;->d()Lo/etw;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->af:Lo/etw;

    .line 5554
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->af:Lo/etw;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 5555
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->af:Lo/etw;

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->x:Lcom/huawei/ui/homewear21/home/WearHomeActivity$a;

    invoke-virtual {v0, v1}, Lo/etw;->a(Landroid/os/Handler;)V

    .line 5556
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->af:Lo/etw;

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->aW:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-virtual {v0, v1}, Lo/etw;->c(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 5557
    const-string v0, "MainUI"

    const-string v1, "WearHomeActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "startMessageNotificationObserver getMessageTotalList"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 5558
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->af:Lo/etw;

    invoke-virtual {v0}, Lo/etw;->b()V

    goto :goto_0

    .line 5560
    :cond_0
    const-string v0, "MainUI"

    const-string v1, "WearHomeActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "startMessageNotificationObserver enter null"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 5563
    :goto_0
    const-string v0, "MainUI"

    const-string v1, "WearHomeActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Leave startMessageNotificationObserver!"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 5564
    return-void
.end method

.method private ax()V
    .locals 5

    .line 5765
    const-string v0, "WearHomeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter registerBandUpdateDialogBroadcast"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 5766
    new-instance v4, Landroid/content/IntentFilter;

    const-string v0, "com.huawei.health.action.ACTION_BAND_UPDATE_DIALOG"

    invoke-direct {v4, v0}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 5767
    const-string v0, "com.huawei.health.action.ACTION_BAND_UPDATE_DIALOG"

    invoke-virtual {v4, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 5768
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->u:Landroid/content/Context;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 5769
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->u:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->aX:Landroid/content/BroadcastReceiver;

    sget-object v2, Lo/dac;->a:Ljava/lang/String;

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v4, v2, v3}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Ljava/lang/String;Landroid/os/Handler;)Landroid/content/Intent;

    .line 5771
    :cond_0
    return-void
.end method

.method private ay()V
    .locals 5

    .line 5790
    const-string v0, "MainUI"

    const-string v1, "WearHomeActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Enter dismissDataSynchronizingDialog():"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 5791
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->v:Lo/egv;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 5792
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->v:Lo/egv;

    invoke-virtual {v0}, Lo/egv;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 5793
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->v:Lo/egv;

    invoke-virtual {v0}, Lo/egv;->cancel()V

    .line 5796
    :cond_0
    return-void
.end method

.method private az()V
    .locals 5

    .line 5741
    const-string v0, "WearHomeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter unRegisterCoreSleepDefaultSwitchBroadcast"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 5742
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->w:Lo/enz;

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->X:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/enz;->b(Ljava/lang/String;)Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->w:Lo/enz;

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->X:Ljava/lang/String;

    .line 5743
    invoke-virtual {v0, v1}, Lo/enz;->b(Ljava/lang/String;)Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportCoreSleep()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->w:Lo/enz;

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->X:Ljava/lang/String;

    .line 5744
    invoke-virtual {v0, v1}, Lo/enz;->b(Ljava/lang/String;)Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportDefaultSwitch()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 5745
    const-string v0, "WearHomeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "unRegisterCoreSleepDefaultSwitchBroadcast, isSupport!!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 5747
    :try_start_0
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->s:Landroid/support/v4/content/LocalBroadcastManager;

    if-eqz v0, :cond_0

    .line 5748
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->s:Landroid/support/v4/content/LocalBroadcastManager;

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->bd:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/support/v4/content/LocalBroadcastManager;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 5749
    const-string v0, "WearHomeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "unRegisterCoreSleepDefaultSwitchBroadcast unregister"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 5753
    :cond_0
    goto :goto_0

    .line 5751
    :catch_0
    move-exception v4

    .line 5752
    const-string v0, "WearHomeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "unRegisterCoreSleepDefaultSwitchBroadcast  mCoreSleepDefaultSwitchReceiver unregister"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 5753
    goto :goto_0

    .line 5755
    :cond_1
    const-string v0, "WearHomeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "registerCoreSleepDefaultSwitchBroadcast, capability is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 5757
    :goto_0
    return-void
.end method

.method private b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
    .locals 14

    .line 6095
    const/4 v4, 0x0

    .line 6096
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 6097
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->t:Landroid/content/Context;

    invoke-static {v0, p1}, Lo/dbf;->e(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    return v0

    .line 6099
    :cond_0
    const-string v5, "\\|"

    .line 6100
    invoke-virtual {p1, v5}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v6

    .line 6101
    array-length v0, v6

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 6102
    const-string v0, "WearHomeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "old length."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 6104
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->t:Landroid/content/Context;

    invoke-static {v0, p1}, Lo/dbf;->e(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    return v0

    .line 6105
    :cond_1
    array-length v0, v6

    const/4 v1, 0x2

    if-ne v0, v1, :cond_4

    .line 6106
    const-string v0, "WearHomeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "new length 2."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 6108
    const/4 v0, 0x1

    aget-object v7, v6, v0

    .line 6110
    :try_start_0
    invoke-static {v7}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v8

    .line 6111
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v10

    .line 6112
    invoke-direct {p0, v10, v11}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->a(J)J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    div-long v12, v0, v2

    .line 6113
    cmp-long v0, v12, v8

    if-lez v0, :cond_2

    .line 6114
    const/4 v4, 0x0

    goto :goto_0

    .line 6116
    :cond_2
    cmp-long v0, v8, v10

    if-gez v0, :cond_3

    .line 6117
    const-string v0, "WearHomeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "get nice data."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 6118
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->t:Landroid/content/Context;

    const/4 v1, 0x0

    aget-object v1, v6, v1

    invoke-static {v0, v1}, Lo/dbf;->e(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    move v4, v0

    goto :goto_0

    .line 6120
    :cond_3
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    invoke-static {v0, v1, v2}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)I

    .line 6121
    const-string v0, "WearHomeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "future data. show zero"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 6126
    :goto_0
    goto :goto_1

    .line 6124
    :catch_0
    move-exception v8

    .line 6125
    const-string v0, "WearHomeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v8}, Ljava/lang/NumberFormatException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 6129
    :cond_4
    :goto_1
    const-string v0, "WearHomeActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "adapterStepAndCalAndTotalDistance : "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 6130
    return v4
.end method

.method static synthetic b(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)Ljava/lang/String;
    .locals 1

    .line 232
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->X:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic b(Lcom/huawei/ui/homewear21/home/WearHomeActivity;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 232
    iput-object p1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->X:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic b(Lcom/huawei/ui/homewear21/home/WearHomeActivity;Lo/egv;)Lo/egv;
    .locals 0

    .line 232
    iput-object p1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->aa:Lo/egv;

    return-object p1
.end method

.method private b(Ljava/util/ArrayList;I)Lo/eoq;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lo/eoq;>;I)Lo/eoq;"
        }
    .end annotation

    .line 2955
    new-instance v5, Lo/eoq;

    invoke-direct {v5}, Lo/eoq;-><init>()V

    .line 2956
    iget-object v6, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->aq:Ljava/lang/Object;

    monitor-enter v6

    .line 2957
    :try_start_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lo/eoq;

    .line 2958
    invoke-virtual {v8}, Lo/eoq;->c()I

    move-result v0

    if-ne v0, p2, :cond_0

    .line 2959
    move-object v5, v8

    .line 2960
    const-string v0, "MainUI"

    const-string v1, "WearHomeActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "getItem getID = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v8}, Lo/eoq;->c()I

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2962
    :cond_0
    goto :goto_0

    .line 2963
    :cond_1
    monitor-exit v6

    goto :goto_1

    :catchall_0
    move-exception v9

    monitor-exit v6

    throw v9

    .line 2965
    :goto_1
    return-object v5
.end method

.method private b(ILjava/lang/String;)V
    .locals 4

    .line 6546
    invoke-direct {p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->aQ()V

    .line 6547
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->E:Lo/ego;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->E:Lo/ego;

    invoke-virtual {v0}, Lo/ego;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 6548
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->G:Lo/ego$a;

    invoke-virtual {v0, p1}, Lo/ego$a;->a(I)Lo/ego$a;

    .line 6549
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->G:Lo/ego$a;

    invoke-virtual {v0, p1}, Lo/ego$a;->b(I)Lo/ego$a;

    .line 6550
    return-void

    .line 6552
    :cond_0
    new-instance v0, Lo/ego;

    invoke-direct {v0, p0}, Lo/ego;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->E:Lo/ego;

    .line 6553
    new-instance v0, Lo/ego$a;

    invoke-direct {v0, p0}, Lo/ego$a;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->G:Lo/ego$a;

    .line 6554
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->G:Lo/ego$a;

    invoke-virtual {v0, p2}, Lo/ego$a;->d(Ljava/lang/String;)Lo/ego$a;

    .line 6555
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->G:Lo/ego$a;

    invoke-virtual {v0}, Lo/ego$a;->d()Lo/ego;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->E:Lo/ego;

    .line 6556
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->E:Lo/ego;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/ego;->setCanceledOnTouchOutside(Z)V

    .line 6557
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->E:Lo/ego;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/ego;->setCancelable(Z)V

    .line 6558
    invoke-virtual {p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_1

    .line 6559
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->E:Lo/ego;

    invoke-virtual {v0}, Lo/ego;->show()V

    .line 6560
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->G:Lo/ego$a;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/ego$a;->a(I)Lo/ego$a;

    .line 6561
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->G:Lo/ego$a;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/ego$a;->b(I)Lo/ego$a;

    .line 6563
    :cond_1
    const-string v0, "WearHomeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mCustomProgressDialog.show()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 6564
    return-void
.end method

.method private b(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;)V
    .locals 4

    .line 4236
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 4237
    const-string v0, "WearHomeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleWorkMode set device enable"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4238
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->setDeviceActiveState(I)V

    .line 4239
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->setDeviceConnectState(I)V

    .line 4241
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 4242
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getAutoDetectSwitchStatus()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 4243
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceActiveState()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 4244
    const-string v0, "WearHomeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleWorkMode target device disable"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4245
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->setDeviceActiveState(I)V

    .line 4247
    :cond_1
    return-void
.end method

.method static synthetic b(Lcom/huawei/ui/homewear21/home/WearHomeActivity;I)V
    .locals 0

    .line 232
    invoke-direct {p0, p1}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->c(I)V

    return-void
.end method

.method static synthetic b(Lcom/huawei/ui/homewear21/home/WearHomeActivity;Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;)V
    .locals 0

    .line 232
    invoke-direct {p0, p1}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->d(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;)V

    return-void
.end method

.method static synthetic b(Lcom/huawei/ui/homewear21/home/WearHomeActivity;Lcom/huawei/ui/homewear21/home/WearHomeActivity$b;)V
    .locals 0

    .line 232
    invoke-direct {p0, p1}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->d(Lcom/huawei/ui/homewear21/home/WearHomeActivity$b;)V

    return-void
.end method

.method private b(Ljava/lang/String;)V
    .locals 7

    .line 1215
    const-string v0, "MainUI"

    const-string v1, "WearHomeActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "enter showUNbindIntelligentHomeDialog()"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1217
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->u:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/homewear21/R$string;->IDS_device_to_intelligent_home_linkage_remove_pairing:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    iget-object v2, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->u:Landroid/content/Context;

    sget v3, Lcom/huawei/ui/homewear21/R$string;->IDS_main_homefragment_health_app:I

    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->u:Landroid/content/Context;

    sget v3, Lcom/huawei/ui/homewear21/R$string;->IDS_device_intelligent_home:I

    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    .line 1218
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->Z:Lo/egv;

    if-nez v0, :cond_0

    .line 1220
    new-instance v0, Lo/egv$b;

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->u:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/egv$b;-><init>(Landroid/content/Context;)V

    sget v1, Lcom/huawei/ui/homewear21/R$string;->IDS_hw_health_wear_connect_device_unpair_button:I

    .line 1221
    invoke-virtual {v0, v1}, Lo/egv$b;->b(I)Lo/egv$b;

    move-result-object v0

    .line 1222
    invoke-virtual {v0, v5}, Lo/egv$b;->b(Ljava/lang/String;)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homewear21/R$string;->IDS_hw_health_wear_connect_device_unpair_button:I

    new-instance v2, Lcom/huawei/ui/homewear21/home/WearHomeActivity$3;

    invoke-direct {v2, p0, p1}, Lcom/huawei/ui/homewear21/home/WearHomeActivity$3;-><init>(Lcom/huawei/ui/homewear21/home/WearHomeActivity;Ljava/lang/String;)V

    .line 1223
    invoke-virtual {v0, v1, v2}, Lo/egv$b;->e(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homewear21/R$string;->IDS_settings_button_cancal:I

    new-instance v2, Lcom/huawei/ui/homewear21/home/WearHomeActivity$4;

    invoke-direct {v2, p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity$4;-><init>(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)V

    .line 1251
    invoke-virtual {v0, v1, v2}, Lo/egv$b;->b(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    move-result-object v6

    .line 1259
    invoke-virtual {v6}, Lo/egv$b;->b()Lo/egv;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->Z:Lo/egv;

    .line 1260
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->Z:Lo/egv;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egv;->setCancelable(Z)V

    .line 1261
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->Z:Lo/egv;

    invoke-virtual {v0}, Lo/egv;->show()V

    .line 1263
    :cond_0
    return-void
.end method

.method private b(Ljava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/datatype/DataDeviceAvoidDisturbInfo;>;)V"
        }
    .end annotation

    .line 3798
    const-string v0, "MainUI"

    const-string v1, "WearHomeActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "handleGetNoDisturbSuccess()"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 3799
    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 3800
    :cond_0
    const-string v0, "WearHomeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ERROR list!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3801
    return-void

    .line 3805
    :cond_1
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/datatype/DataDeviceAvoidDisturbInfo;

    .line 3806
    const-string v0, "MainUI"

    const-string v1, "WearHomeActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "handleGetNoDisturbSuccess() switch="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v5}, Lcom/huawei/datatype/DataDeviceAvoidDisturbInfo;->getDevice_avoid_disturb_switch()I

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 3807
    invoke-virtual {v5}, Lcom/huawei/datatype/DataDeviceAvoidDisturbInfo;->getDevice_avoid_disturb_switch()I

    move-result v0

    if-nez v0, :cond_2

    .line 3808
    invoke-virtual {v5}, Lcom/huawei/datatype/DataDeviceAvoidDisturbInfo;->getDevice_avoid_disturb_time_switch()I

    move-result v0

    if-nez v0, :cond_2

    .line 3810
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->V:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->t:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/homewear21/R$string;->IDS_status_disabled:I

    .line 3811
    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 3810
    const/4 v2, 0x5

    invoke-direct {p0, v2, v0, v1}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->e(ILjava/util/ArrayList;Ljava/lang/String;)V

    goto :goto_0

    .line 3812
    :cond_2
    invoke-virtual {v5}, Lcom/huawei/datatype/DataDeviceAvoidDisturbInfo;->getDevice_avoid_disturb_switch()I

    move-result v0

    if-eqz v0, :cond_3

    .line 3814
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->V:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->t:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/homewear21/R$string;->IDS_status_enabled:I

    .line 3815
    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 3814
    const/4 v2, 0x5

    invoke-direct {p0, v2, v0, v1}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->e(ILjava/util/ArrayList;Ljava/lang/String;)V

    goto :goto_0

    .line 3816
    :cond_3
    invoke-virtual {v5}, Lcom/huawei/datatype/DataDeviceAvoidDisturbInfo;->getDevice_avoid_disturb_switch()I

    move-result v0

    if-nez v0, :cond_4

    .line 3817
    invoke-virtual {v5}, Lcom/huawei/datatype/DataDeviceAvoidDisturbInfo;->getDevice_avoid_disturb_time_switch()I

    move-result v0

    if-eqz v0, :cond_4

    .line 3818
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->V:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->w:Lo/enz;

    iget-object v2, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->u:Landroid/content/Context;

    .line 3819
    invoke-virtual {v5}, Lcom/huawei/datatype/DataDeviceAvoidDisturbInfo;->getDevice_avoid_disturb_start_time()I

    move-result v3

    .line 3820
    invoke-virtual {v5}, Lcom/huawei/datatype/DataDeviceAvoidDisturbInfo;->getDevice_avoid_disturb_end_time()I

    move-result v4

    .line 3819
    invoke-virtual {v1, v2, v3, v4}, Lo/enz;->d(Landroid/content/Context;II)Ljava/lang/String;

    move-result-object v1

    .line 3818
    const/4 v2, 0x5

    invoke-direct {p0, v2, v0, v1}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->e(ILjava/util/ArrayList;Ljava/lang/String;)V

    .line 3823
    :cond_4
    :goto_0
    invoke-direct {p0, v5}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->e(Lcom/huawei/datatype/DataDeviceAvoidDisturbInfo;)V

    .line 3824
    return-void
.end method

.method public static b(Z)V
    .locals 0

    .line 6675
    sput-boolean p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->ai:Z

    .line 6676
    return-void
.end method

.method private varargs b(ZIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z[Landroid/widget/CompoundButton$OnCheckedChangeListener;)V
    .locals 4

    .line 3249
    iget-object v2, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->aq:Ljava/lang/Object;

    monitor-enter v2

    .line 3250
    :try_start_0
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->V:Ljava/util/ArrayList;

    invoke-direct/range {p0 .. p9}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->e(ZIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z[Landroid/widget/CompoundButton$OnCheckedChangeListener;)Lo/eoq;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3251
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3

    .line 3252
    :goto_0
    return-void
.end method

.method static synthetic b(Lcom/huawei/ui/homewear21/home/WearHomeActivity;Z)Z
    .locals 0

    .line 232
    iput-boolean p1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->bk:Z

    return p1
.end method

.method static synthetic c(Lcom/huawei/ui/homewear21/home/WearHomeActivity;Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;)Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;
    .locals 0

    .line 232
    iput-object p1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->Q:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    return-object p1
.end method

.method static synthetic c(Lcom/huawei/ui/homewear21/home/WearHomeActivity;Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;)Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;
    .locals 0

    .line 232
    iput-object p1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->I:Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;

    return-object p1
.end method

.method static synthetic c(Lcom/huawei/ui/homewear21/home/WearHomeActivity;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 232
    iput-object p1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->H:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic c(Lcom/huawei/ui/homewear21/home/WearHomeActivity;Lo/egv;)Lo/egv;
    .locals 0

    .line 232
    iput-object p1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->Z:Lo/egv;

    return-object p1
.end method

.method private c(I)V
    .locals 5

    .line 3339
    const-string v0, "MainUI"

    const-string v1, "WearHomeActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Enter refreshState:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 3342
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->aQ:Landroid/os/Handler;

    const/16 v1, 0x3e9

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 3343
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->aQ:Landroid/os/Handler;

    int-to-long v1, p1

    const/16 v3, 0x3e9

    invoke-virtual {v0, v3, v1, v2}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 3344
    return-void
.end method

.method private c(ILjava/util/ArrayList;Z)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ILjava/util/ArrayList<Lo/eoq;>;Z)V"
        }
    .end annotation

    .line 2918
    const-string v0, "MainUI"

    const-string v1, "WearHomeActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "setSettingItemSwitchChecked id= "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, ",isChecked ="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2919
    iget-object v5, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->aq:Ljava/lang/Object;

    monitor-enter v5

    .line 2920
    :try_start_0
    invoke-direct {p0, p2, p1}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->b(Ljava/util/ArrayList;I)Lo/eoq;

    move-result-object v0

    invoke-virtual {v0, p3}, Lo/eoq;->e(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2921
    monitor-exit v5

    goto :goto_0

    :catchall_0
    move-exception v6

    monitor-exit v5

    throw v6

    .line 2922
    :goto_0
    invoke-direct {p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->F()V

    .line 2923
    return-void
.end method

.method private c(Landroid/widget/Switch;)V
    .locals 5

    .line 2879
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    .line 2880
    invoke-virtual {p1}, Landroid/widget/Switch;->performClick()Z

    goto :goto_0

    .line 2882
    :cond_0
    const-string v0, "MainUI"

    const-string v1, "WearHomeActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "switchPerformClick mSwitch is null"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2884
    :goto_0
    return-void
.end method

.method private c(Lcom/huawei/datatype/DataDeviceInfo;)V
    .locals 8

    .line 2721
    new-instance v4, Lcom/huawei/hwcrowdtestapi/HealthFeedbackParams;

    invoke-direct {v4}, Lcom/huawei/hwcrowdtestapi/HealthFeedbackParams;-><init>()V

    .line 2722
    invoke-static {}, Lo/etq;->d()Lo/etq;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->X:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/etq;->a(Ljava/lang/String;)Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v5

    .line 2723
    const/4 v0, 0x0

    if-eq v0, v5, :cond_4

    .line 2724
    invoke-virtual {v5}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getSecUUID()Ljava/lang/String;

    move-result-object v6

    .line 2725
    const-string v0, "WearHomeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "identify: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {}, Lo/cxk;->c()Lo/cxk;

    move-result-object v3

    invoke-virtual {v3, v6}, Lo/cxk;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2729
    const-string v0, "WearHomeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "identify: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {}, Lo/cxk;->c()Lo/cxk;

    move-result-object v3

    invoke-virtual {v3, v6}, Lo/cxk;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2730
    const/4 v7, 0x0

    .line 2732
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2733
    invoke-static {v6}, Lo/ahb;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 2734
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x18

    if-lt v0, v1, :cond_2

    .line 2735
    const-string v0, "\\"

    const-string v1, "+"

    invoke-virtual {v7, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v7

    .line 2736
    const-string v0, "/"

    const-string v1, "+"

    invoke-virtual {v7, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v7

    .line 2737
    const/4 v0, 0x0

    const/16 v1, 0x18

    invoke-virtual {v7, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v7

    goto :goto_0

    .line 2739
    :cond_0
    const-string v0, ":"

    invoke-virtual {v6, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0xc

    if-le v0, v1, :cond_1

    .line 2740
    invoke-static {v6}, Lo/ahb;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 2741
    const-string v0, "\\"

    const-string v1, "+"

    invoke-virtual {v7, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v7

    .line 2742
    const-string v0, "/"

    const-string v1, "+"

    invoke-virtual {v7, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v7

    goto :goto_0

    .line 2744
    :cond_1
    const-string v0, ":"

    const-string v1, ""

    invoke-virtual {v6, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v7

    .line 2747
    :cond_2
    :goto_0
    invoke-virtual {v4, v7}, Lcom/huawei/hwcrowdtestapi/HealthFeedbackParams;->setDeviceId(Ljava/lang/String;)V

    .line 2748
    invoke-virtual {v5}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/hwcrowdtestapi/HealthFeedbackParams;->setProductName(Ljava/lang/String;)V

    .line 2749
    const/4 v0, 0x0

    if-eq v0, p1, :cond_3

    .line 2750
    const-string v0, "WearHomeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mDataDeviceInfo= != null ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Lcom/huawei/datatype/DataDeviceInfo;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2751
    invoke-virtual {p1}, Lcom/huawei/datatype/DataDeviceInfo;->getDevice_soft_version()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/hwcrowdtestapi/HealthFeedbackParams;->setProductVersion(Ljava/lang/String;)V

    .line 2753
    :cond_3
    invoke-static {}, Lcom/huawei/hwdevicedfxmanager/beta/HWCrowdApi;->getmInstance()Lcom/huawei/hwdevicedfxmanager/beta/HWCrowdApi;

    move-result-object v0

    new-instance v1, Lcom/huawei/ui/homewear21/home/WearHomeActivity$19;

    invoke-direct {v1, p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity$19;-><init>(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)V

    invoke-virtual {v0, p0, v4, v1}, Lcom/huawei/hwdevicedfxmanager/beta/HWCrowdApi;->gotoFeedBack(Landroid/content/Context;Lcom/huawei/hwcrowdtestapi/HealthFeedbackParams;Lo/dcd;)V

    .line 2840
    goto :goto_1

    .line 2841
    :cond_4
    const-string v0, "WearHomeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u6ca1\u6709\u8fde\u63a5\u8bbe\u5907"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2843
    :goto_1
    return-void
.end method

.method private c(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;)V
    .locals 5

    .line 4250
    const-string v0, "WearHomeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "startReconnect reconnectCount \uff1a"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    sget v3, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->e:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4252
    sget v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->e:I

    const/4 v1, 0x2

    if-ge v0, v1, :cond_0

    .line 4254
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->e(I)V

    .line 4255
    sget v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->e:I

    add-int/lit8 v0, v0, 0x1

    sput v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->e:I

    .line 4256
    const-string v0, "WearHomeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "startReconnect  \uff1a"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    sget v3, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->e:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_2

    .line 4260
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v4

    .line 4261
    packed-switch v4, :pswitch_data_0

    goto :goto_0

    .line 4264
    :pswitch_0
    invoke-direct {p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->R()V

    .line 4265
    goto :goto_1

    .line 4268
    :pswitch_1
    invoke-direct {p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->V()V

    .line 4269
    goto :goto_1

    .line 4271
    :pswitch_2
    invoke-direct {p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->W()V

    .line 4272
    goto :goto_1

    .line 4274
    :pswitch_3
    invoke-direct {p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->U()V

    .line 4275
    goto :goto_1

    .line 4278
    :pswitch_4
    invoke-direct {p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->X()V

    .line 4279
    goto :goto_1

    .line 4281
    :goto_0
    :pswitch_5
    invoke-direct {p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->P()V

    .line 4285
    :goto_1
    const/4 v0, 0x0

    sput v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->e:I

    .line 4287
    :goto_2
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x7
        :pswitch_4
        :pswitch_2
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_3
        :pswitch_5
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method private c(Lcom/huawei/ui/homewear21/home/WearHomeActivity$b;)V
    .locals 5

    .line 5930
    const-string v0, "MainUI"

    const-string v1, "WearHomeActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "dialogmessage Enter addNewMessage:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, " messageList.size():"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v4, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->bc:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 5931
    sget-object v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$85;->e:[I

    invoke-virtual {p1}, Lcom/huawei/ui/homewear21/home/WearHomeActivity$b;->ordinal()I

    move-result v1

    aget v0, v0, v1

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 5933
    :sswitch_0
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->bc:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 5934
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->bc:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_0

    .line 5935
    invoke-direct {p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->aG()V

    goto :goto_0

    .line 5939
    :sswitch_1
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->bc:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 5940
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->bc:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_0

    .line 5941
    invoke-direct {p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->m()V

    .line 5952
    :cond_0
    :goto_0
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
        0x2 -> :sswitch_1
    .end sparse-switch
.end method

.method static synthetic c(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)V
    .locals 0

    .line 232
    invoke-direct {p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->p()V

    return-void
.end method

.method static synthetic c(Lcom/huawei/ui/homewear21/home/WearHomeActivity;I)V
    .locals 0

    .line 232
    invoke-direct {p0, p1}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->g(I)V

    return-void
.end method

.method static synthetic c(Lcom/huawei/ui/homewear21/home/WearHomeActivity;ILjava/lang/String;)V
    .locals 0

    .line 232
    invoke-direct {p0, p1, p2}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->b(ILjava/lang/String;)V

    return-void
.end method

.method static synthetic c(Lcom/huawei/ui/homewear21/home/WearHomeActivity;Landroid/widget/Switch;)V
    .locals 0

    .line 232
    invoke-direct {p0, p1}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->c(Landroid/widget/Switch;)V

    return-void
.end method

.method private c(Ljava/lang/String;)V
    .locals 4

    .line 6426
    const-string v0, "WearHomeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showLoadingDialog()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 6427
    invoke-virtual {p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 6428
    return-void

    .line 6431
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->bi:Lo/egn;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 6432
    new-instance v0, Lo/egn;

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->u:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/homewear21/R$style;->app_update_dialogActivity:I

    invoke-direct {v0, v1, v2}, Lo/egn;-><init>(Landroid/content/Context;I)V

    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->u:Landroid/content/Context;

    invoke-static {v0}, Lo/egn;->a(Landroid/content/Context;)Lo/egn;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->bi:Lo/egn;

    .line 6433
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->bi:Lo/egn;

    invoke-virtual {v0, p1}, Lo/egn;->e(Ljava/lang/String;)V

    .line 6434
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->bi:Lo/egn;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egn;->setCancelable(Z)V

    goto :goto_0

    .line 6437
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->bi:Lo/egn;

    invoke-virtual {v0, p1}, Lo/egn;->e(Ljava/lang/String;)V

    .line 6440
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->bi:Lo/egn;

    invoke-virtual {v0}, Lo/egn;->a()V

    .line 6441
    const-string v0, "WearHomeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mLoadingUserInformationDialog.show()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 6442
    return-void
.end method

.method private c(Ljava/lang/String;Landroid/content/Context;)V
    .locals 6

    .line 896
    const-string v0, "MainUI"

    const-string v1, "WearHomeActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "setDialogCheckTime,time-----------"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 898
    new-instance v5, Lo/dcy;

    const/4 v0, 0x0

    invoke-direct {v5, v0}, Lo/dcy;-><init>(I)V

    .line 900
    const/16 v0, 0x2710

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "sp_dialog_check_time"

    invoke-static {p2, v0, v1, p1, v5}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 902
    return-void
.end method

.method static synthetic c(Lcom/huawei/ui/homewear21/home/WearHomeActivity;Z)Z
    .locals 0

    .line 232
    iput-boolean p1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->D:Z

    return p1
.end method

.method static synthetic d(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)Landroid/content/Context;
    .locals 1

    .line 232
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->u:Landroid/content/Context;

    return-object v0
.end method

.method private varargs d(ZIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Landroid/widget/CompoundButton$OnCheckedChangeListener;)Lo/eoq;
    .locals 3

    .line 3295
    new-instance v2, Lo/eoq;

    invoke-direct {v2}, Lo/eoq;-><init>()V

    .line 3296
    invoke-virtual {v2, p3}, Lo/eoq;->d(I)V

    .line 3297
    invoke-virtual {v2, p4}, Lo/eoq;->a(I)V

    .line 3298
    invoke-virtual {v2, p5}, Lo/eoq;->c(Ljava/lang/String;)V

    .line 3299
    invoke-virtual {v2, p6}, Lo/eoq;->d(Ljava/lang/String;)V

    .line 3300
    invoke-virtual {v2, p7}, Lo/eoq;->b(Ljava/lang/String;)V

    .line 3301
    invoke-virtual {v2, p2}, Lo/eoq;->e(I)V

    .line 3302
    invoke-virtual {v2, p1}, Lo/eoq;->a(Z)V

    .line 3303
    array-length v0, p8

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 3304
    const/4 v0, 0x0

    aget-object v0, p8, v0

    invoke-virtual {v2, v0}, Lo/eoq;->c(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 3306
    :cond_0
    return-object v2
.end method

.method private d(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;)V
    .locals 19

    .line 4058
    const-string v0, "MainUI"

    const-string v1, "WearHomeActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Enter updateIdImage \uff1a"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 4059
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v0

    const/16 v1, 0xa

    if-ne v0, v1, :cond_1

    .line 4060
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "PORSCHE DESIGN"

    invoke-static {v0, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceModel()Ljava/lang/String;

    move-result-object v0

    const-string v1, "PORSCHE DESIGN"

    invoke-static {v0, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 4061
    :cond_0
    const-string v0, "MainUI"

    const-string v1, "WearHomeActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Enter updateIdImage \uff1abaoshijie!!!!!"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 4062
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->r:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/homewear21/R$mipmap;->img_porsche_design_banner:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    goto/16 :goto_3

    .line 4063
    :cond_1
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v0

    const/16 v1, 0xb

    if-ne v0, v1, :cond_2

    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "HUAWEI CM-R1P"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 4064
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->r:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/homewear21/R$mipmap;->r1_pro_banner:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    goto/16 :goto_3

    .line 4066
    :cond_2
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v0

    invoke-static {v0}, Lo/dda;->i(I)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 4068
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v0

    invoke-static {v0}, Lo/dda;->d(I)Ljava/lang/String;

    move-result-object v7

    .line 4069
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_6

    invoke-static {}, Lo/eaw;->d()Lo/eaw;

    move-result-object v0

    invoke-virtual {v0, v7}, Lo/eaw;->a(Ljava/lang/String;)Lo/eav;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_6

    invoke-static {}, Lo/eaw;->d()Lo/eaw;

    move-result-object v0

    invoke-virtual {v0, v7}, Lo/eaw;->a(Ljava/lang/String;)Lo/eav;

    move-result-object v0

    invoke-virtual {v0}, Lo/eav;->d()Lo/ean;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_6

    .line 4070
    const-string v0, "WearHomeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "is plugin download uuid:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4071
    invoke-static {}, Lo/eaw;->d()Lo/eaw;

    move-result-object v0

    invoke-virtual {v0, v7}, Lo/eaw;->c(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v8

    .line 4072
    const-string v0, "WearHomeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "is plugin download pluginAvaiable:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4073
    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 4074
    invoke-static {}, Lo/eaw;->d()Lo/eaw;

    move-result-object v0

    invoke-virtual {v0, v7}, Lo/eaw;->a(Ljava/lang/String;)Lo/eav;

    move-result-object v9

    .line 4075
    invoke-static {}, Lo/eaw;->d()Lo/eaw;

    move-result-object v0

    invoke-virtual {v9}, Lo/eav;->d()Lo/ean;

    move-result-object v1

    invoke-virtual {v1}, Lo/ean;->i()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v9, v1}, Lo/eaw;->d(Lo/eav;Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v10

    .line 4076
    const-string v11, ""

    .line 4077
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lo/eax;->b()Lo/eax;

    move-result-object v1

    invoke-virtual {v9}, Lo/eav;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lo/eax;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v9}, Lo/eav;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "img"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v9}, Lo/eav;->d()Lo/ean;

    move-result-object v1

    invoke-virtual {v1}, Lo/ean;->i()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ".png"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    .line 4078
    new-instance v12, Ljava/io/File;

    invoke-direct {v12, v11}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 4079
    invoke-virtual {v12}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 4080
    invoke-virtual {v10}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v13

    .line 4081
    invoke-virtual {v10}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v14

    .line 4082
    const-string v0, "WearHomeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "width:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",height:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4083
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->r:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getWidth()I

    move-result v0

    int-to-float v0, v0

    int-to-float v1, v13

    div-float v15, v0, v1

    .line 4084
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->r:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getHeight()I

    move-result v0

    int-to-float v0, v0

    int-to-float v1, v14

    div-float v16, v0, v1

    .line 4085
    const-string v0, "WearHomeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "llywidth:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, p0

    iget-object v3, v3, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->r:Landroid/widget/ImageView;

    invoke-virtual {v3}, Landroid/widget/ImageView;->getWidth()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",llyheight:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, p0

    iget-object v3, v3, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->r:Landroid/widget/ImageView;

    invoke-virtual {v3}, Landroid/widget/ImageView;->getHeight()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4086
    new-instance v17, Landroid/graphics/Matrix;

    invoke-direct/range {v17 .. v17}, Landroid/graphics/Matrix;-><init>()V

    .line 4087
    move-object/from16 v0, v17

    move/from16 v1, v16

    invoke-virtual {v0, v15, v1}, Landroid/graphics/Matrix;->postScale(FF)Z

    .line 4088
    invoke-virtual/range {v17 .. v17}, Landroid/graphics/Matrix;->reset()V

    .line 4089
    move-object v0, v10

    move v3, v13

    move v4, v14

    move-object/from16 v5, v17

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v6, 0x1

    invoke-static/range {v0 .. v6}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;

    move-result-object v18

    .line 4090
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->m:Landroid/widget/RelativeLayout;

    sget v1, Lcom/huawei/ui/homewear21/R$mipmap;->img_home_bg:I

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setBackgroundResource(I)V

    .line 4091
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->r:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 4092
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->r:Landroid/widget/ImageView;

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 4093
    goto/16 :goto_0

    .line 4094
    :cond_3
    invoke-static {}, Lo/eaw;->d()Lo/eaw;

    move-result-object v0

    invoke-virtual {v9}, Lo/eav;->d()Lo/ean;

    move-result-object v1

    invoke-virtual {v1}, Lo/ean;->k()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v9, v1}, Lo/eaw;->d(Lo/eav;Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v10

    .line 4095
    invoke-virtual {v10}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v13

    .line 4096
    invoke-virtual {v10}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v14

    .line 4097
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->getWindowManager()Landroid/view/WindowManager;

    move-result-object v0

    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Display;->getWidth()I

    move-result v0

    int-to-float v0, v0

    int-to-float v1, v13

    div-float v15, v0, v1

    .line 4098
    new-instance v16, Landroid/graphics/Matrix;

    invoke-direct/range {v16 .. v16}, Landroid/graphics/Matrix;-><init>()V

    .line 4099
    move-object/from16 v0, v16

    invoke-virtual {v0, v15, v15}, Landroid/graphics/Matrix;->postScale(FF)Z

    .line 4100
    move-object v0, v10

    move v3, v13

    move v4, v14

    move-object/from16 v5, v16

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v6, 0x1

    invoke-static/range {v0 .. v6}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;

    move-result-object v17

    .line 4101
    new-instance v0, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual/range {p0 .. p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    move-object/from16 v2, v17

    invoke-direct {v0, v1, v2}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    move-object/from16 v18, v0

    .line 4102
    const-string v0, "WearHomeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "123456:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual/range {v18 .. v18}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4103
    const-string v0, "WearHomeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "1234567:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual/range {v18 .. v18}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4104
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->r:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 4105
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->m:Landroid/widget/RelativeLayout;

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 4107
    :goto_0
    goto :goto_1

    .line 4108
    :cond_4
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->r:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 4109
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v0

    invoke-static {v0}, Lo/dda;->f(I)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 4111
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->m:Landroid/widget/RelativeLayout;

    sget v1, Lcom/huawei/ui/homewear21/R$mipmap;->img_home_band_default:I

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setBackgroundResource(I)V

    goto :goto_1

    .line 4113
    :cond_5
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->m:Landroid/widget/RelativeLayout;

    sget v1, Lcom/huawei/ui/homewear21/R$mipmap;->img_home_watch_default:I

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setBackgroundResource(I)V

    .line 4116
    :goto_1
    goto :goto_2

    .line 4117
    :cond_6
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v0

    invoke-static {v0}, Lo/dda;->f(I)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 4119
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->m:Landroid/widget/RelativeLayout;

    sget v1, Lcom/huawei/ui/homewear21/R$mipmap;->img_home_band_default:I

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setBackgroundResource(I)V

    goto :goto_2

    .line 4121
    :cond_7
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->m:Landroid/widget/RelativeLayout;

    sget v1, Lcom/huawei/ui/homewear21/R$mipmap;->img_home_watch_default:I

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setBackgroundResource(I)V

    .line 4124
    :goto_2
    goto :goto_3

    .line 4125
    :cond_8
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->r:Landroid/widget/ImageView;

    invoke-static {}, Lo/etq;->d()Lo/etq;

    move-result-object v1

    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v2

    invoke-virtual {v1, v2}, Lo/etq;->c(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 4128
    :goto_3
    return-void
.end method

.method private d(Lcom/huawei/ui/homewear21/home/WearHomeActivity$b;)V
    .locals 7

    .line 5956
    const-string v0, "MainUI"

    const-string v1, "WearHomeActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "dialogmessage Enter removeMessage:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 5957
    const/4 v5, 0x0

    .line 5958
    const/4 v6, 0x0

    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->bc:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v6, v0, :cond_1

    .line 5959
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->bc:Ljava/util/List;

    invoke-interface {v0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    if-ne p1, v0, :cond_0

    .line 5960
    add-int/lit8 v5, v5, 0x1

    .line 5958
    :cond_0
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 5962
    :cond_1
    const/4 v6, 0x0

    :goto_1
    if-ge v6, v5, :cond_2

    .line 5963
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->bc:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 5962
    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    .line 5965
    :cond_2
    invoke-direct {p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->aC()V

    .line 5966
    return-void
.end method

.method static synthetic d(Lcom/huawei/ui/homewear21/home/WearHomeActivity;I)V
    .locals 0

    .line 232
    invoke-direct {p0, p1}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->a(I)V

    return-void
.end method

.method static synthetic d(Lcom/huawei/ui/homewear21/home/WearHomeActivity;ILjava/util/ArrayList;Z)V
    .locals 0

    .line 232
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->c(ILjava/util/ArrayList;Z)V

    return-void
.end method

.method static synthetic d(Lcom/huawei/ui/homewear21/home/WearHomeActivity;Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;)V
    .locals 0

    .line 232
    invoke-direct {p0, p1}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->a(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;)V

    return-void
.end method

.method static synthetic d(Lcom/huawei/ui/homewear21/home/WearHomeActivity;Ljava/lang/String;)V
    .locals 0

    .line 232
    invoke-direct {p0, p1}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->b(Ljava/lang/String;)V

    return-void
.end method

.method private d(Ljava/lang/String;Ljava/lang/String;)V
    .locals 5

    .line 5323
    const-string v0, "MainUI"

    const-string v1, "WearHomeActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "openApp() className = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, ",packName="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 5324
    return-void
.end method

.method static synthetic e(Lcom/huawei/ui/homewear21/home/WearHomeActivity;Lo/egv;)Lo/egv;
    .locals 0

    .line 232
    iput-object p1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->br:Lo/egv;

    return-object p1
.end method

.method static synthetic e(Lcom/huawei/ui/homewear21/home/WearHomeActivity;Lo/egy;)Lo/egy;
    .locals 0

    .line 232
    iput-object p1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->ao:Lo/egy;

    return-object p1
.end method

.method static synthetic e(Lcom/huawei/ui/homewear21/home/WearHomeActivity;Ljava/util/ArrayList;I)Lo/eoq;
    .locals 1

    .line 232
    invoke-direct {p0, p1, p2}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->b(Ljava/util/ArrayList;I)Lo/eoq;

    move-result-object v0

    return-object v0
.end method

.method private varargs e(ZIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z[Landroid/widget/CompoundButton$OnCheckedChangeListener;)Lo/eoq;
    .locals 3

    .line 3268
    new-instance v2, Lo/eoq;

    invoke-direct {v2}, Lo/eoq;-><init>()V

    .line 3269
    invoke-virtual {v2, p3}, Lo/eoq;->d(I)V

    .line 3270
    invoke-virtual {v2, p4}, Lo/eoq;->a(I)V

    .line 3271
    invoke-virtual {v2, p5}, Lo/eoq;->c(Ljava/lang/String;)V

    .line 3272
    invoke-virtual {v2, p6}, Lo/eoq;->d(Ljava/lang/String;)V

    .line 3273
    invoke-virtual {v2, p7}, Lo/eoq;->b(Ljava/lang/String;)V

    .line 3274
    invoke-virtual {v2, p8}, Lo/eoq;->c(Z)V

    .line 3275
    invoke-virtual {v2, p2}, Lo/eoq;->e(I)V

    .line 3276
    invoke-virtual {v2, p1}, Lo/eoq;->a(Z)V

    .line 3277
    array-length v0, p9

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 3278
    const/4 v0, 0x0

    aget-object v0, p9, v0

    invoke-virtual {v2, v0}, Lo/eoq;->c(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 3280
    :cond_0
    return-object v2
.end method

.method private e(I)V
    .locals 5

    .line 4136
    const-string v0, "MainUI"

    const-string v1, "WearHomeActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Enter updateBluetoothState isConnect\uff1a"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 4137
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->c:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 4138
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->d:Lhuawei/widget/HwProgressBar;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lhuawei/widget/HwProgressBar;->setVisibility(I)V

    .line 4139
    const/4 v0, 0x2

    if-ne v0, p1, :cond_3

    .line 4141
    invoke-static {}, Lo/etq;->d()Lo/etq;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->X:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/etq;->a(Ljava/lang/String;)Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->Q:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    .line 4142
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->Q:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->Q:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v0

    invoke-static {v0}, Lo/dbh;->e(I)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 4144
    invoke-static {}, Lo/dpa;->c()Lo/dpa;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->X:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/dpa;->d(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 4145
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->c:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 4146
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->d:Lhuawei/widget/HwProgressBar;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lhuawei/widget/HwProgressBar;->setVisibility(I)V

    .line 4147
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->i:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->u:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homewear21/R$string;->IDS_ota_update_state_upgrading:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 4148
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->h:Landroid/widget/ImageView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 4149
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->k:Landroid/widget/TextView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 4151
    invoke-direct {p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->B()V

    goto/16 :goto_0

    .line 4153
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->c:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/homewear21/R$mipmap;->ic_bluetooth_connected:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 4154
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->i:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->u:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homewear21/R$string;->IDS_myfitnesspal_login:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 4155
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->g:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 4157
    const/4 v0, 0x0

    sput v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->e:I

    .line 4158
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->aQ:Landroid/os/Handler;

    const/16 v1, 0x3ea

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    goto/16 :goto_0

    .line 4162
    :cond_1
    const-string v0, "MainUI"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isDeviceOTA :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v3

    invoke-static {v3}, Lo/dpb;->b(Landroid/content/Context;)Lo/dpb;

    move-result-object v3

    iget-object v4, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->X:Ljava/lang/String;

    invoke-virtual {v3, v4}, Lo/dpb;->g(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4163
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dpb;->b(Landroid/content/Context;)Lo/dpb;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->X:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/dpb;->g(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 4164
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->c:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 4165
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->d:Lhuawei/widget/HwProgressBar;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lhuawei/widget/HwProgressBar;->setVisibility(I)V

    .line 4166
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->i:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->u:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homewear21/R$string;->IDS_ota_update_state_upgrading:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 4167
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->h:Landroid/widget/ImageView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 4168
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->k:Landroid/widget/TextView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 4170
    invoke-direct {p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->B()V

    goto/16 :goto_0

    .line 4172
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->c:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/homewear21/R$mipmap;->ic_bluetooth_connected:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 4173
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->i:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->u:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homewear21/R$string;->IDS_myfitnesspal_login:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 4174
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->g:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 4176
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->aQ:Landroid/os/Handler;

    const/16 v1, 0x3ea

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    goto/16 :goto_0

    .line 4179
    :cond_3
    const/4 v0, 0x1

    if-ne v0, p1, :cond_4

    .line 4180
    invoke-direct {p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->T()V

    .line 4181
    invoke-direct {p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->Q()V

    goto/16 :goto_0

    .line 4182
    :cond_4
    const/4 v0, 0x5

    if-ne v0, p1, :cond_5

    .line 4183
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->c:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/homewear21/R$mipmap;->ic_bluetooth_disconnected:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 4184
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->i:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->u:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homewear21/R$string;->IDS_myfitnesspal_logout:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 4185
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->h:Landroid/widget/ImageView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 4186
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->k:Landroid/widget/TextView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 4187
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->g:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 4188
    invoke-direct {p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->af()V

    .line 4189
    invoke-direct {p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->Q()V

    goto :goto_0

    .line 4191
    :cond_5
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->c:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/homewear21/R$mipmap;->ic_bluetooth_disconnected:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 4192
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->i:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->u:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homewear21/R$string;->IDS_myfitnesspal_logout:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 4193
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->h:Landroid/widget/ImageView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 4194
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->k:Landroid/widget/TextView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 4195
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->g:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 4196
    invoke-direct {p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->Q()V

    .line 4198
    :goto_0
    return-void
.end method

.method private e(ILjava/util/ArrayList;Ljava/lang/String;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ILjava/util/ArrayList<Lo/eoq;>;Ljava/lang/String;)V"
        }
    .end annotation

    .line 3866
    const-string v0, "MainUI"

    const-string v1, "WearHomeActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "setSettingItemSwitchChecked id= "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, ",rightText ="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 3867
    iget-object v5, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->aq:Ljava/lang/Object;

    monitor-enter v5

    .line 3868
    :try_start_0
    invoke-direct {p0, p2, p1}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->b(Ljava/util/ArrayList;I)Lo/eoq;

    move-result-object v0

    invoke-virtual {v0, p3}, Lo/eoq;->b(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3869
    monitor-exit v5

    goto :goto_0

    :catchall_0
    move-exception v6

    monitor-exit v5

    throw v6

    .line 3870
    :goto_0
    invoke-direct {p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->F()V

    .line 3871
    return-void
.end method

.method private e(Lcom/huawei/datatype/DataDeviceAvoidDisturbInfo;)V
    .locals 7

    .line 3828
    const-string v0, "MainUI"

    const-string v1, "WearHomeActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Enter updateDeviceSettingRotate()!"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 3829
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->w:Lo/enz;

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->X:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/enz;->b(Ljava/lang/String;)Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->T:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    .line 3830
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->T:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 3831
    const-string v0, "MainUI"

    const-string v1, "WearHomeActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "updateDeviceSettingRotate() deviceCapability is null return !"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 3832
    return-void

    .line 3835
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->T:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isAuto_light_screen()Z

    move-result v0

    if-nez v0, :cond_1

    .line 3836
    const-string v0, "MainUI"

    const-string v1, "WearHomeActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "updateDeviceSettingRotate() deviceCapability not support isAuto_light_screen return !"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 3837
    return-void

    .line 3840
    :cond_1
    const/4 v5, 0x0

    .line 3841
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->t:Landroid/content/Context;

    invoke-static {v0}, Lo/env;->d(Landroid/content/Context;)Lo/env;

    move-result-object v6

    .line 3842
    const/4 v0, 0x0

    if-eq v0, v6, :cond_2

    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->T:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportQueryAllowDisturbContent()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 3843
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->X:Ljava/lang/String;

    invoke-virtual {v6, v0}, Lo/env;->a(Ljava/lang/String;)I

    move-result v5

    .line 3846
    :cond_2
    const-string v0, "MainUI"

    const-string v1, "WearHomeActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "updateDeviceSettingRotate() allowContent = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 3847
    and-int/lit8 v0, v5, 0x14

    const/16 v1, 0x14

    if-ne v1, v0, :cond_4

    .line 3848
    invoke-virtual {p1}, Lcom/huawei/datatype/DataDeviceAvoidDisturbInfo;->getDevice_avoid_disturb_type()I

    move-result v0

    and-int/lit8 v0, v0, 0x14

    const/16 v1, 0x14

    if-ne v1, v0, :cond_3

    .line 3849
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->V:Ljava/util/ArrayList;

    const/16 v1, 0xb

    invoke-direct {p0, v0, v1}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->b(Ljava/util/ArrayList;I)Lo/eoq;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/eoq;->d(Ljava/lang/String;)V

    goto :goto_0

    .line 3851
    :cond_3
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->V:Ljava/util/ArrayList;

    const/16 v1, 0xb

    invoke-direct {p0, v0, v1}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->b(Ljava/util/ArrayList;I)Lo/eoq;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->t:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/homewear21/R$string;->IDS_btsetting_auto_light_message:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/eoq;->d(Ljava/lang/String;)V

    goto :goto_0

    .line 3854
    :cond_4
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->V:Ljava/util/ArrayList;

    const/16 v1, 0xb

    invoke-direct {p0, v0, v1}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->b(Ljava/util/ArrayList;I)Lo/eoq;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->t:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/homewear21/R$string;->IDS_btsetting_auto_light_message:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/eoq;->d(Ljava/lang/String;)V

    .line 3856
    :goto_0
    return-void
.end method

.method private e(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;)V
    .locals 2

    .line 4224
    invoke-static {}, Lo/ahg;->a()Lo/ahg;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/ahg;->d(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, Lo/ahg;->a()Lo/ahg;

    move-result-object v0

    invoke-virtual {v0}, Lo/ahg;->e()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 4226
    :cond_0
    invoke-direct {p0, p1}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->c(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;)V

    goto :goto_0

    .line 4229
    :cond_1
    invoke-direct {p0, p1}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->b(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;)V

    .line 4230
    invoke-direct {p0, p1}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->c(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;)V

    .line 4233
    :goto_0
    return-void
.end method

.method static synthetic e(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)V
    .locals 0

    .line 232
    invoke-direct {p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->h()V

    return-void
.end method

.method static synthetic e(Lcom/huawei/ui/homewear21/home/WearHomeActivity;Lcom/huawei/datatype/DataDeviceInfo;)V
    .locals 0

    .line 232
    invoke-direct {p0, p1}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->c(Lcom/huawei/datatype/DataDeviceInfo;)V

    return-void
.end method

.method static synthetic e(Lcom/huawei/ui/homewear21/home/WearHomeActivity;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 232
    invoke-direct {p0, p1, p2}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method static synthetic e(Lcom/huawei/ui/homewear21/home/WearHomeActivity;Ljava/util/List;)V
    .locals 0

    .line 232
    invoke-direct {p0, p1}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->b(Ljava/util/List;)V

    return-void
.end method

.method private e(Ljava/lang/String;)V
    .locals 4

    .line 4291
    new-instance v0, Lo/egv$b;

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->u:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/egv$b;-><init>(Landroid/content/Context;)V

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->u:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/homewear21/R$string;->IDS_device_mgr_pair_note_can_not_connect:I

    .line 4292
    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egv$b;->e(Ljava/lang/String;)Lo/egv$b;

    move-result-object v0

    .line 4293
    invoke-virtual {v0, p1}, Lo/egv$b;->b(Ljava/lang/String;)Lo/egv$b;

    move-result-object v0

    .line 4294
    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egv$b;->c(Ljava/lang/Boolean;)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homewear21/R$string;->IDS_common_notification_know_tips:I

    new-instance v2, Lcom/huawei/ui/homewear21/home/WearHomeActivity$38;

    invoke-direct {v2, p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity$38;-><init>(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)V

    .line 4295
    invoke-virtual {v0, v1, v2}, Lo/egv$b;->e(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    move-result-object v3

    .line 4304
    invoke-virtual {v3}, Lo/egv$b;->b()Lo/egv;

    move-result-object v0

    sput-object v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->aV:Lo/egv;

    .line 4305
    sget-object v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->aV:Lo/egv;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/egv;->setCancelable(Z)V

    .line 4306
    sget-object v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->aV:Lo/egv;

    invoke-virtual {v0}, Lo/egv;->show()V

    .line 4307
    return-void
.end method

.method private varargs e(ZIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Landroid/widget/CompoundButton$OnCheckedChangeListener;)V
    .locals 4

    .line 3242
    iget-object v2, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->aq:Ljava/lang/Object;

    monitor-enter v2

    .line 3243
    :try_start_0
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->V:Ljava/util/ArrayList;

    invoke-direct/range {p0 .. p8}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->d(ZIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Landroid/widget/CompoundButton$OnCheckedChangeListener;)Lo/eoq;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3244
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3

    .line 3245
    :goto_0
    return-void
.end method

.method private e([Ljava/lang/String;)V
    .locals 6

    .line 4852
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->t:Landroid/content/Context;

    invoke-static {v0, p1}, Lo/dbe;->c(Landroid/content/Context;[Ljava/lang/String;)Z

    move-result v5

    .line 4853
    const-string v0, "MainUI"

    const-string v1, "WearHomeActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "requestPermissions() hasPermissionNeeded ="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 4854
    if-nez v5, :cond_0

    .line 4855
    new-instance v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$42;

    invoke-direct {v0, p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity$42;-><init>(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)V

    invoke-static {p0, p1, v0}, Lo/dbe;->a(Landroid/app/Activity;[Ljava/lang/String;Lo/dbs;)V

    goto :goto_0

    .line 4867
    :cond_0
    const-string v0, "MainUI"

    const-string v1, "WearHomeActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "requestPermissions() permission if (!hasPermissionNeeded) ELSE"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 4869
    :goto_0
    return-void
.end method

.method static synthetic f()Ljava/util/concurrent/ExecutorService;
    .locals 1

    .line 232
    sget-object v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->am:Ljava/util/concurrent/ExecutorService;

    return-object v0
.end method

.method private f(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;)V
    .locals 4

    .line 4771
    const-string v0, "MainUI"

    const-string v1, "Enter processConnectedStateChange "

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 4772
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    invoke-static {}, Landroid/bluetooth/BluetoothAdapter;->getDefaultAdapter()Landroid/bluetooth/BluetoothAdapter;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 4773
    invoke-static {}, Landroid/bluetooth/BluetoothAdapter;->getDefaultAdapter()Landroid/bluetooth/BluetoothAdapter;

    move-result-object v0

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothAdapter;->isEnabled()Z

    move-result v0

    if-nez v0, :cond_0

    .line 4774
    const-string v0, "MainUI"

    const-string v1, "processConnectedStateChange BT switch is false!"

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 4775
    invoke-direct {p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->aK()V

    goto :goto_0

    .line 4777
    :cond_0
    const-string v0, "MainUI"

    const-string v1, "processConnectedStateChange close BT Dialog!"

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 4778
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->ao:Lo/egy;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 4779
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->ao:Lo/egy;

    invoke-virtual {v0}, Lo/egy;->dismiss()V

    .line 4780
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->ao:Lo/egy;

    .line 4783
    :cond_1
    :goto_0
    return-void
.end method

.method static synthetic f(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)V
    .locals 0

    .line 232
    invoke-direct {p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->aV()V

    return-void
.end method

.method static synthetic g(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)Lo/enz;
    .locals 1

    .line 232
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->w:Lo/enz;

    return-object v0
.end method

.method private g(I)V
    .locals 5

    .line 4536
    invoke-virtual {p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_1

    .line 4537
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->ab:Lo/egn;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 4538
    new-instance v0, Lo/egn;

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->u:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/homewear21/R$style;->app_update_dialogActivity:I

    invoke-direct {v0, v1, v2}, Lo/egn;-><init>(Landroid/content/Context;I)V

    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->u:Landroid/content/Context;

    invoke-static {v0}, Lo/egn;->a(Landroid/content/Context;)Lo/egn;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->ab:Lo/egn;

    .line 4539
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->ab:Lo/egn;

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->u:Landroid/content/Context;

    invoke-virtual {v1, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egn;->e(Ljava/lang/String;)V

    .line 4540
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->ab:Lo/egn;

    invoke-virtual {v0}, Lo/egn;->a()V

    goto :goto_0

    .line 4542
    :cond_0
    const-string v0, "MainUI"

    const-string v1, "WearHomeActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "mLoadingDialog21 is not null"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 4545
    :cond_1
    const-string v0, "MainUI"

    const-string v1, "WearHomeActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "activity is finish"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 4548
    :goto_0
    return-void
.end method

.method private h()V
    .locals 5

    .line 628
    const-string v0, "MainUI"

    const-string v1, "WearHomeActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Enter weakRunnableRun"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 629
    invoke-direct {p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->y()V

    .line 631
    invoke-direct {p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->n()V

    .line 632
    return-void
.end method

.method static synthetic h(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)V
    .locals 0

    .line 232
    invoke-direct {p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->t()V

    return-void
.end method

.method private h(I)Z
    .locals 5

    .line 4700
    const/4 v4, 0x0

    .line 4701
    const/4 v0, 0x3

    if-eq v0, p1, :cond_0

    const/16 v0, 0xa

    if-ne v0, p1, :cond_1

    .line 4702
    :cond_0
    const/4 v4, 0x1

    .line 4704
    :cond_1
    const-string v0, "WearHomeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Enter isWatch type:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " res:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4705
    return v4
.end method

.method static synthetic i(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)Lo/dqi;
    .locals 1

    .line 232
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->ax:Lo/dqi;

    return-object v0
.end method

.method private j()V
    .locals 7

    .line 2691
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->u:Landroid/content/Context;

    invoke-static {v0}, Lo/eua;->d(Landroid/content/Context;)Lo/eua;

    move-result-object v0

    invoke-virtual {v0}, Lo/eua;->e()Ljava/lang/String;

    move-result-object v4

    .line 2692
    invoke-static {}, Lo/etq;->d()Lo/etq;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->X:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/etq;->a(Ljava/lang/String;)Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v5

    .line 2693
    const/4 v0, 0x0

    if-eq v0, v5, :cond_1

    .line 2694
    invoke-virtual {v5}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v6

    .line 2695
    const-string v0, "WearHomeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "openHuaFenClubActivity() productType "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2696
    invoke-static {v6}, Lo/dbh;->e(I)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2697
    const/16 v0, 0x17

    if-ne v0, v6, :cond_0

    .line 2698
    const-string v4, "https://club.huawei.com/forum-3935-1.html"

    goto :goto_0

    .line 2699
    :cond_0
    const/16 v0, 0x18

    if-ne v0, v6, :cond_1

    .line 2700
    const-string v4, "https://club.huawei.com/forum-3950-1.html"

    .line 2704
    :cond_1
    :goto_0
    const-string v0, "WearHomeActivity"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startWebViewActivity() -> url = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    const-string v2, ", jumpModeKey = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2705
    new-instance v6, Landroid/content/Intent;

    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->u:Landroid/content/Context;

    const-class v1, Lcom/huawei/operation/activity/WebViewActivity;

    invoke-direct {v6, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 2706
    const-string v0, "url"

    invoke-virtual {v6, v0, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 2707
    const-string v0, "WebViewActivity.JUMP_MODE_KEY"

    const/4 v1, 0x1

    invoke-virtual {v6, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 2708
    invoke-virtual {p0, v6}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->startActivity(Landroid/content/Intent;)V

    .line 2709
    return-void
.end method

.method static synthetic j(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)V
    .locals 0

    .line 232
    invoke-direct {p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->aN()V

    return-void
.end method

.method static synthetic k(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)Lo/egv;
    .locals 1

    .line 232
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->Z:Lo/egv;

    return-object v0
.end method

.method public static k()Z
    .locals 1

    .line 6671
    sget-boolean v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->ai:Z

    return v0
.end method

.method private l()V
    .locals 8

    .line 661
    const-string v0, "WearHomeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter notificationAlert"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 662
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->w:Lo/enz;

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->X:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/enz;->b(Ljava/lang/String;)Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->T:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    .line 663
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->T:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 664
    return-void

    .line 666
    :cond_0
    const-string v0, "MainUI"

    const-string v1, "WearHomeActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "enter notificationAlert isMessage_alert = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v4, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->T:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isMessage_alert()Z

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 667
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->j:Lo/eoa;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 668
    invoke-static {}, Lo/etq;->d()Lo/etq;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->X:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/etq;->a(Ljava/lang/String;)Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v5

    .line 669
    if-eqz v5, :cond_1

    invoke-virtual {v5}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceConnectState()I

    move-result v0

    const/4 v1, 0x2

    if-ne v1, v0, :cond_1

    .line 671
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->T:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->T:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isMessage_alert()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 673
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->j:Lo/eoa;

    invoke-virtual {v0}, Lo/eoa;->c()Z

    move-result v6

    .line 675
    invoke-direct {p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->o()Z

    move-result v7

    .line 676
    const-string v0, "MainUI"

    const-string v1, "WearHomeActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "isClosed:  "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "isAchieve: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 677
    if-nez v6, :cond_1

    if-eqz v7, :cond_1

    .line 679
    sget-object v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$b;->c:Lcom/huawei/ui/homewear21/home/WearHomeActivity$b;

    invoke-direct {p0, v0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->c(Lcom/huawei/ui/homewear21/home/WearHomeActivity$b;)V

    .line 681
    invoke-static {}, Lo/dpk;->c()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->u:Landroid/content/Context;

    invoke-direct {p0, v0, v1}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->c(Ljava/lang/String;Landroid/content/Context;)V

    .line 686
    :cond_1
    return-void
.end method

.method static synthetic l(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)Z
    .locals 1

    .line 232
    invoke-direct {p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->v()Z

    move-result v0

    return v0
.end method

.method private m()V
    .locals 7

    .line 689
    const/4 v4, 0x0

    .line 690
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->w:Lo/enz;

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->X:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/enz;->b(Ljava/lang/String;)Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 691
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->w:Lo/enz;

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->X:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/enz;->b(Ljava/lang/String;)Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportMusicControl()Z

    move-result v4

    .line 692
    const-string v0, "WearHomeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "showNotificationDialog, isSupportMusic:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 695
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->u:Landroid/content/Context;

    invoke-static {v0}, Lo/dbf;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-nez v0, :cond_3

    .line 696
    new-instance v0, Lo/egv$b;

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->u:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/egv$b;-><init>(Landroid/content/Context;)V

    sget v1, Lcom/huawei/ui/homewear21/R$string;->IDS_service_area_notice_open_title:I

    .line 697
    invoke-virtual {v0, v1}, Lo/egv$b;->b(I)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homewear21/R$string;->IDS_common_enable_button:I

    new-instance v2, Lcom/huawei/ui/homewear21/home/WearHomeActivity$23;

    invoke-direct {v2, p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity$23;-><init>(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)V

    .line 698
    invoke-virtual {v0, v1, v2}, Lo/egv$b;->e(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homewear21/R$string;->IDS_settings_button_cancal:I

    new-instance v2, Lcom/huawei/ui/homewear21/home/WearHomeActivity$11;

    invoke-direct {v2, p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity$11;-><init>(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)V

    .line 723
    invoke-virtual {v0, v1, v2}, Lo/egv$b;->b(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    move-result-object v5

    .line 733
    if-eqz v4, :cond_1

    .line 734
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->t:Landroid/content/Context;

    invoke-static {v0}, Lo/dix;->d(Landroid/content/Context;)Lo/dix;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/dix;->d(Ljava/lang/Boolean;)V

    .line 735
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->u:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/homewear21/R$string;->IDS_nottification_settings_remind_new:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lo/egv$b;->b(Ljava/lang/String;)Lo/egv$b;

    goto :goto_0

    .line 737
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->u:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/homewear21/R$string;->IDS_nottification_settings_remind_update:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lo/egv$b;->b(Ljava/lang/String;)Lo/egv$b;

    .line 739
    :goto_0
    invoke-virtual {v5}, Lo/egv$b;->b()Lo/egv;

    move-result-object v6

    .line 740
    const/4 v0, 0x0

    invoke-virtual {v6, v0}, Lo/egv;->setCancelable(Z)V

    .line 741
    invoke-virtual {v6}, Lo/egv;->isShowing()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_2

    .line 742
    invoke-virtual {v6}, Lo/egv;->show()V

    .line 744
    :cond_2
    goto/16 :goto_2

    .line 745
    :cond_3
    new-instance v0, Lo/egv$b;

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->u:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/egv$b;-><init>(Landroid/content/Context;)V

    sget v1, Lcom/huawei/ui/homewear21/R$string;->IDS_service_area_notice_title:I

    .line 746
    invoke-virtual {v0, v1}, Lo/egv$b;->b(I)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homewear21/R$string;->IDS_yes:I

    new-instance v2, Lcom/huawei/ui/homewear21/home/WearHomeActivity$43;

    invoke-direct {v2, p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity$43;-><init>(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)V

    .line 747
    invoke-virtual {v0, v1, v2}, Lo/egv$b;->e(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homewear21/R$string;->IDS_no:I

    new-instance v2, Lcom/huawei/ui/homewear21/home/WearHomeActivity$32;

    invoke-direct {v2, p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity$32;-><init>(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)V

    .line 772
    invoke-virtual {v0, v1, v2}, Lo/egv$b;->b(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    move-result-object v5

    .line 792
    if-eqz v4, :cond_4

    .line 793
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->t:Landroid/content/Context;

    invoke-static {v0}, Lo/dix;->d(Landroid/content/Context;)Lo/dix;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/dix;->d(Ljava/lang/Boolean;)V

    .line 794
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->u:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/homewear21/R$string;->IDS_nottification_settings_remind_new:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lo/egv$b;->b(Ljava/lang/String;)Lo/egv$b;

    goto :goto_1

    .line 796
    :cond_4
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->u:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/homewear21/R$string;->IDS_nottification_settings_remind:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lo/egv$b;->b(Ljava/lang/String;)Lo/egv$b;

    .line 798
    :goto_1
    invoke-virtual {v5}, Lo/egv$b;->b()Lo/egv;

    move-result-object v6

    .line 799
    const/4 v0, 0x0

    invoke-virtual {v6, v0}, Lo/egv;->setCancelable(Z)V

    .line 800
    invoke-virtual {v6}, Lo/egv;->isShowing()Z

    move-result v0

    if-nez v0, :cond_5

    invoke-virtual {p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_5

    .line 801
    invoke-virtual {v6}, Lo/egv;->show()V

    .line 804
    :cond_5
    :goto_2
    return-void
.end method

.method static synthetic m(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)V
    .locals 0

    .line 232
    invoke-direct {p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->aU()V

    return-void
.end method

.method private n()V
    .locals 5

    .line 639
    const-string v0, "MainUI"

    const-string v1, "WearHomeActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "enterHomeFragmentLoggedProcess()!"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 641
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->aA:Lo/eoi;

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->X:Ljava/lang/String;

    iget-object v2, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->t:Landroid/content/Context;

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Lo/eoi;->c(Ljava/lang/String;Landroid/content/Context;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 645
    const-string v0, "WearHomeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "dataSync 2"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 649
    invoke-direct {p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->aq()V

    .line 652
    invoke-direct {p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->l()V

    .line 654
    return-void
.end method

.method static synthetic n(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)V
    .locals 0

    .line 232
    invoke-direct {p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->F()V

    return-void
.end method

.method static synthetic o(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)Landroid/content/Context;
    .locals 1

    .line 232
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->t:Landroid/content/Context;

    return-object v0
.end method

.method private o()Z
    .locals 9

    .line 878
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->u:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "sp_dialog_check_time"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 880
    const-string v0, "MainUI"

    const-string v1, "WearHomeActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "isEnableDialog: strLastTime = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 881
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 882
    const/4 v0, 0x1

    return v0

    .line 884
    :cond_0
    invoke-static {v5}, Lo/dpk;->b(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v6

    .line 885
    const/4 v0, 0x0

    if-ne v0, v6, :cond_1

    .line 886
    const/4 v0, 0x1

    return v0

    .line 888
    :cond_1
    invoke-virtual {v6}, Ljava/util/Date;->getTime()J

    move-result-wide v7

    .line 889
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sub-long/2addr v0, v7

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(J)J

    move-result-wide v0

    const-wide/32 v2, 0x5265c00

    cmp-long v0, v0, v2

    if-lez v0, :cond_2

    const/4 v0, 0x1

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method static synthetic p(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)Ljava/util/ArrayList;
    .locals 1

    .line 232
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->V:Ljava/util/ArrayList;

    return-object v0
.end method

.method private p()V
    .locals 7

    .line 809
    const/4 v4, 0x0

    .line 810
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/enz;->b(Landroid/content/Context;)Lo/enz;

    move-result-object v0

    invoke-virtual {v0}, Lo/enz;->b()Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 811
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/enz;->b(Landroid/content/Context;)Lo/enz;

    move-result-object v0

    invoke-virtual {v0}, Lo/enz;->b()Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportMusicControl()Z

    move-result v4

    .line 812
    const-string v0, "WearHomeActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showAnotherNotificationDialog, isSupportMusic:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 814
    :cond_0
    new-instance v0, Lo/egv$b;

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->u:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/egv$b;-><init>(Landroid/content/Context;)V

    sget v1, Lcom/huawei/ui/homewear21/R$string;->IDS_service_area_notice_title:I

    .line 815
    invoke-virtual {v0, v1}, Lo/egv$b;->b(I)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homewear21/R$string;->IDS_open_later:I

    new-instance v2, Lcom/huawei/ui/homewear21/home/WearHomeActivity$69;

    invoke-direct {v2, p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity$69;-><init>(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)V

    .line 816
    const v3, 0x1060016

    invoke-virtual {v0, v1, v3, v2}, Lo/egv$b;->d(IILandroid/view/View$OnClickListener;)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homewear21/R$string;->IDS_common_enable_button:I

    new-instance v2, Lcom/huawei/ui/homewear21/home/WearHomeActivity$56;

    invoke-direct {v2, p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity$56;-><init>(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)V

    .line 835
    invoke-virtual {v0, v1, v2}, Lo/egv$b;->b(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    move-result-object v5

    .line 859
    if-eqz v4, :cond_1

    .line 860
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->u:Landroid/content/Context;

    invoke-static {v0}, Lo/dix;->d(Landroid/content/Context;)Lo/dix;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/dix;->d(Ljava/lang/Boolean;)V

    .line 861
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->u:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/homewear21/R$string;->IDS_nottification_settings_remind_new:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lo/egv$b;->b(Ljava/lang/String;)Lo/egv$b;

    goto :goto_0

    .line 863
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->u:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/homewear21/R$string;->IDS_nottification_settings_remind_twice:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lo/egv$b;->b(Ljava/lang/String;)Lo/egv$b;

    .line 865
    :goto_0
    invoke-virtual {v5}, Lo/egv$b;->b()Lo/egv;

    move-result-object v6

    .line 866
    const/4 v0, 0x0

    invoke-virtual {v6, v0}, Lo/egv;->setCancelable(Z)V

    .line 867
    invoke-virtual {v6}, Lo/egv;->isShowing()Z

    move-result v0

    if-nez v0, :cond_2

    .line 868
    invoke-virtual {v6}, Lo/egv;->show()V

    .line 870
    :cond_2
    return-void
.end method

.method private q()V
    .locals 12

    .line 944
    sget v0, Lcom/huawei/ui/homewear21/R$id;->common_auto_test_toast_layout:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->p:Landroid/widget/RelativeLayout;

    .line 945
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->u:Landroid/content/Context;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 946
    return-void

    .line 948
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->u:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homewear21/R$string;->IDS_wear_note_open_notification_switch:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v9

    .line 949
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->u:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homewear21/R$string;->IDS_device_bt_right_btn_info:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v10

    .line 950
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->u:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homewear21/R$string;->IDS_main_btn_state_ignore:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v11

    .line 951
    sget v0, Lcom/huawei/ui/homewear21/R$id;->toast_try_tv:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    iput-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->l:Lo/egb;

    .line 952
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->l:Lo/egb;

    invoke-virtual {v0, v10}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 953
    sget v0, Lcom/huawei/ui/homewear21/R$id;->toast_cancel_tv:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    iput-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->o:Lo/egb;

    .line 954
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->o:Lo/egb;

    invoke-virtual {v0, v11}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 955
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    new-instance v1, Lcom/huawei/ui/homewear21/home/WearHomeActivity$79;

    invoke-direct {v1, p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity$79;-><init>(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)V

    iget-object v2, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->p:Landroid/widget/RelativeLayout;

    move-object v3, v9

    const-string v4, "wear_activity_note_permission_no_agin_tip"

    const-string v5, "wear_activity_note_permission_dialog_time"

    const-string v6, "wear_activity_note_permission_count"

    const-string v7, "wear_activity_note_permission_is_show"

    const/4 v8, 0x4

    invoke-static/range {v0 .. v8}, Lo/egp;->c(Landroid/content/Context;Lcom/huawei/hwbasemgr/IBaseResponseCallback;Landroid/widget/RelativeLayout;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    .line 984
    return-void
.end method

.method static synthetic q(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)V
    .locals 0

    .line 232
    invoke-direct {p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->aP()V

    return-void
.end method

.method static synthetic r(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)Ljava/lang/Object;
    .locals 1

    .line 232
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->aq:Ljava/lang/Object;

    return-object v0
.end method

.method private r()V
    .locals 5

    .line 935
    invoke-virtual {p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 936
    const-string v0, "MainUI"

    const-string v1, "WearHomeActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "openHuaweiAppStore(): activity is finishing"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 937
    return-void

    .line 939
    :cond_0
    invoke-static {}, Lo/etq;->d()Lo/etq;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->u:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lo/etq;->c(Landroid/content/Context;)V

    .line 941
    return-void
.end method

.method private s()V
    .locals 6

    .line 910
    new-instance v4, Landroid/content/Intent;

    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->u:Landroid/content/Context;

    const-class v1, Lcom/huawei/operation/activity/WebViewActivity;

    invoke-direct {v4, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 911
    const/4 v5, 0x0

    .line 912
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->Q:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 913
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->Q:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v0

    const/16 v1, 0x17

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->Q:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v0

    const/16 v1, 0x18

    if-ne v1, v0, :cond_1

    .line 914
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->A:Lo/etu;

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->u:Landroid/content/Context;

    iget-object v2, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->Q:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    invoke-virtual {v0, v1, v2}, Lo/etu;->b(Landroid/content/Context;Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;)Ljava/lang/String;

    move-result-object v5

    goto :goto_0

    .line 917
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->A:Lo/etu;

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->u:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lo/etu;->e(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v5

    goto :goto_0

    .line 922
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->A:Lo/etu;

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->u:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lo/etu;->e(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v5

    .line 924
    :goto_0
    const-string v0, "WearHomeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "openAppHelpActivity url = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 925
    const-string v0, "url"

    invoke-virtual {v4, v0, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 926
    const-string v0, "WebViewActivity.JUMP_MODE_KEY"

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 927
    invoke-virtual {p0, v4}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->startActivity(Landroid/content/Intent;)V

    .line 929
    return-void
.end method

.method static synthetic s(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)V
    .locals 0

    .line 232
    invoke-direct {p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->s()V

    return-void
.end method

.method private t()V
    .locals 10

    .line 1267
    const-string v0, "MainUI"

    const-string v1, "WearHomeActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Enter unbindDevice"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1268
    invoke-static {}, Lo/etq;->d()Lo/etq;

    move-result-object v0

    invoke-virtual {v0}, Lo/etq;->i()Ljava/util/List;

    move-result-object v6

    .line 1269
    invoke-static {}, Lo/etq;->d()Lo/etq;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->X:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/etq;->a(Ljava/lang/String;)Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->Q:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    .line 1270
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->Q:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    const/4 v0, 0x0

    if-eq v0, v6, :cond_4

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_4

    .line 1271
    const-string v0, "MainUI"

    const-string v1, "WearHomeActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "delete mac = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-static {}, Lo/cxk;->c()Lo/cxk;

    move-result-object v4

    iget-object v5, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->Q:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    invoke-virtual {v5}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Lo/cxk;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1272
    const/4 v7, -0x1

    .line 1273
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    .line 1274
    const-string v0, "MainUI"

    const-string v1, "WearHomeActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "list mac = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-static {}, Lo/cxk;->c()Lo/cxk;

    move-result-object v4

    invoke-virtual {v9}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Lo/cxk;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1275
    invoke-virtual {v9}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->Q:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    invoke-virtual {v1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1276
    invoke-interface {v6, v9}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v7

    .line 1278
    :cond_0
    goto :goto_0

    .line 1279
    :cond_1
    const-string v0, "MainUI"

    const-string v1, "WearHomeActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "deleteUseDeviceList() id = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1280
    const/4 v0, -0x1

    if-eq v0, v7, :cond_2

    .line 1281
    invoke-interface {v6, v7}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 1283
    :cond_2
    invoke-static {}, Lo/etq;->d()Lo/etq;

    move-result-object v0

    invoke-virtual {v0, v6}, Lo/etq;->c(Ljava/util/List;)V

    .line 1284
    invoke-direct {p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->w()V

    .line 1286
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->Q:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v0

    invoke-static {v0}, Lo/dbh;->e(I)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 1287
    invoke-static {}, Lo/enu;->c()Lo/enu;

    move-result-object v0

    invoke-virtual {v0}, Lo/enu;->e()V

    goto :goto_1

    .line 1289
    :cond_3
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->t:Landroid/content/Context;

    invoke-static {v0}, Lo/eob;->c(Landroid/content/Context;)Lo/eob;

    move-result-object v0

    invoke-virtual {v0}, Lo/eob;->q()V

    .line 1292
    :goto_1
    new-instance v8, Ljava/util/HashMap;

    invoke-direct {v8}, Ljava/util/HashMap;-><init>()V

    .line 1293
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    sget-object v2, Lo/dae;->iA:Lo/dae;

    invoke-virtual {v2}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v8, v3}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 1295
    const-string v0, "click"

    const-string v1, "1"

    invoke-interface {v8, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1296
    const-string v0, "device_name"

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->Q:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    invoke-virtual {v1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceName()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v8, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1297
    sget-object v0, Lo/dae;->fM:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v9

    .line 1298
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v9, v8, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 1299
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/login/ui/login/LoginInit;->getUsetId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/cxf;->b(Ljava/lang/String;)V

    .line 1302
    :cond_4
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->Q:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_8

    const/4 v0, 0x0

    if-eq v0, v6, :cond_8

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_8

    .line 1303
    const/4 v7, -0x1

    .line 1304
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_2
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    .line 1305
    const-string v0, "MainUI"

    const-string v1, "WearHomeActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "list mac = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-static {}, Lo/cxk;->c()Lo/cxk;

    move-result-object v4

    invoke-virtual {v9}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Lo/cxk;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1306
    invoke-virtual {v9}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->X:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 1307
    invoke-interface {v6, v9}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v7

    .line 1309
    :cond_5
    goto :goto_2

    .line 1310
    :cond_6
    const-string v0, "MainUI"

    const-string v1, "WearHomeActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "deleteUseDeviceList() id = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1311
    const/4 v0, -0x1

    if-eq v0, v7, :cond_7

    .line 1312
    invoke-interface {v6, v7}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 1315
    :cond_7
    invoke-static {}, Lo/etq;->d()Lo/etq;

    move-result-object v0

    invoke-virtual {v0, v6}, Lo/etq;->c(Ljava/util/List;)V

    .line 1316
    invoke-direct {p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->w()V

    .line 1319
    :cond_8
    invoke-virtual {p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->finish()V

    .line 1320
    return-void
.end method

.method static synthetic t(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)V
    .locals 0

    .line 232
    invoke-direct {p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->r()V

    return-void
.end method

.method static synthetic u(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)Landroid/os/Handler;
    .locals 1

    .line 232
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->aQ:Landroid/os/Handler;

    return-object v0
.end method

.method private u()V
    .locals 6

    .line 992
    const-string v0, "MainUI"

    const-string v1, "WearHomeActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Enter initView"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 993
    sget v0, Lcom/huawei/ui/homewear21/R$id;->fragment_home_21_fitness:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->f:Landroid/widget/LinearLayout;

    .line 994
    sget v0, Lcom/huawei/ui/homewear21/R$id;->fragment_home_21_fitness_divider:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v5

    .line 995
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->Q:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->Q:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v0

    const/16 v1, 0xb

    if-ne v0, v1, :cond_0

    .line 996
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->f:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 997
    const/16 v0, 0x8

    invoke-virtual {v5, v0}, Landroid/view/View;->setVisibility(I)V

    .line 1007
    :cond_0
    sget v0, Lcom/huawei/ui/homewear21/R$id;->wear_home_title_bar:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emr;

    iput-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->ay:Lo/emr;

    .line 1010
    sget v0, Lcom/huawei/ui/homewear21/R$id;->card_heart_rate_view:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->ad:Landroid/widget/LinearLayout;

    .line 1011
    new-instance v0, Lo/ety;

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->u:Landroid/content/Context;

    iget-object v2, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->ad:Landroid/widget/LinearLayout;

    invoke-direct {v0, v1, v2}, Lo/ety;-><init>(Landroid/content/Context;Landroid/view/View;)V

    iput-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->as:Lo/ety;

    .line 1012
    sget v0, Lcom/huawei/ui/homewear21/R$id;->home_fragment_bluetooth_image:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->c:Landroid/widget/ImageView;

    .line 1013
    sget v0, Lcom/huawei/ui/homewear21/R$id;->home_fragment_bluetooth_loading:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lhuawei/widget/HwProgressBar;

    iput-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->d:Lhuawei/widget/HwProgressBar;

    .line 1015
    sget v0, Lcom/huawei/ui/homewear21/R$id;->home_fragment_bluetooth_tv:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->i:Landroid/widget/TextView;

    .line 1016
    sget v0, Lcom/huawei/ui/homewear21/R$id;->battery_image:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->h:Landroid/widget/ImageView;

    .line 1017
    sget v0, Lcom/huawei/ui/homewear21/R$id;->battery_textview:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->k:Landroid/widget/TextView;

    .line 1018
    sget v0, Lcom/huawei/ui/homewear21/R$id;->lly_reconnect:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->g:Landroid/widget/LinearLayout;

    .line 1019
    sget v0, Lcom/huawei/ui/homewear21/R$id;->card_heart_rate_view:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->an:Landroid/view/View;

    .line 1020
    sget v0, Lcom/huawei/ui/homewear21/R$id;->home_fragment_unbind:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->b:Lo/egd;

    .line 1021
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->b:Lo/egd;

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->aG:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v1}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1024
    sget v0, Lcom/huawei/ui/homewear21/R$id;->home_fragment_lly_id:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->m:Landroid/widget/RelativeLayout;

    .line 1025
    sget v0, Lcom/huawei/ui/homewear21/R$id;->home_fragment_lly_id_bcd:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->q:Landroid/widget/RelativeLayout;

    .line 1026
    sget v0, Lcom/huawei/ui/homewear21/R$id;->home_fragment_lly_id_img:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->r:Landroid/widget/ImageView;

    .line 1028
    sget v0, Lcom/huawei/ui/homewear21/R$id;->tv_fitness_three_unit:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->at:Landroid/widget/TextView;

    .line 1030
    sget v0, Lcom/huawei/ui/homewear21/R$id;->tv_fitness_one_number:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->aw:Landroid/widget/TextView;

    .line 1031
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->aw:Landroid/widget/TextView;

    const-wide/16 v1, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1033
    sget v0, Lcom/huawei/ui/homewear21/R$id;->tv_fitness_two_number:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->au:Landroid/widget/TextView;

    .line 1034
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->au:Landroid/widget/TextView;

    const-wide/16 v1, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1036
    sget v0, Lcom/huawei/ui/homewear21/R$id;->tv_fitness_three_number:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->av:Landroid/widget/TextView;

    .line 1037
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->av:Landroid/widget/TextView;

    const-wide/16 v1, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x2

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1039
    sget v0, Lcom/huawei/ui/homewear21/R$id;->lly_bluetooth:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->n:Landroid/widget/LinearLayout;

    .line 1041
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->u:Landroid/content/Context;

    invoke-static {v0}, Lo/ene;->t(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1042
    sget v0, Lcom/huawei/ui/homewear21/R$id;->panel_one_part_content:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->K:Landroid/widget/RelativeLayout;

    .line 1043
    sget v0, Lcom/huawei/ui/homewear21/R$id;->panel_two_part_content:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->N:Landroid/widget/RelativeLayout;

    .line 1044
    sget v0, Lcom/huawei/ui/homewear21/R$id;->panel_three_part_content:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->M:Landroid/widget/RelativeLayout;

    .line 1045
    sget v0, Lcom/huawei/ui/homewear21/R$id;->panel_one_part_content_bigcd:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->J:Landroid/widget/RelativeLayout;

    .line 1046
    sget v0, Lcom/huawei/ui/homewear21/R$id;->panel_two_part_content_bigcd:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->L:Landroid/widget/RelativeLayout;

    .line 1047
    sget v0, Lcom/huawei/ui/homewear21/R$id;->panel_three_part_content_bigcd:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->S:Landroid/widget/RelativeLayout;

    .line 1049
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->K:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 1050
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->N:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 1051
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->M:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 1052
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->J:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 1053
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->L:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 1054
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->S:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 1056
    sget v0, Lcom/huawei/ui/homewear21/R$id;->tv_fitness_one_number_bigcd:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->aw:Landroid/widget/TextView;

    .line 1057
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->aw:Landroid/widget/TextView;

    const-wide/16 v1, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1059
    sget v0, Lcom/huawei/ui/homewear21/R$id;->tv_fitness_two_number_bigcd:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->au:Landroid/widget/TextView;

    .line 1060
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->au:Landroid/widget/TextView;

    const-wide/16 v1, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1062
    sget v0, Lcom/huawei/ui/homewear21/R$id;->tv_fitness_three_number_bigcd:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->av:Landroid/widget/TextView;

    .line 1063
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->av:Landroid/widget/TextView;

    const-wide/16 v1, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x2

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1065
    sget v0, Lcom/huawei/ui/homewear21/R$id;->tv_fitness_three_unit_bigcd:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->at:Landroid/widget/TextView;

    .line 1067
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->m:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 1068
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->q:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 1069
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->q:Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->m:Landroid/widget/RelativeLayout;

    .line 1070
    sget v0, Lcom/huawei/ui/homewear21/R$id;->home_fragment_lly_id_img_bcd:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->r:Landroid/widget/ImageView;

    .line 1072
    sget v0, Lcom/huawei/ui/homewear21/R$id;->lly_bluetooth_bcd:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->n:Landroid/widget/LinearLayout;

    .line 1073
    sget v0, Lcom/huawei/ui/homewear21/R$id;->home_fragment_bluetooth_image_bcd:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->c:Landroid/widget/ImageView;

    .line 1074
    sget v0, Lcom/huawei/ui/homewear21/R$id;->home_fragment_bluetooth_loading_bcd:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lhuawei/widget/HwProgressBar;

    iput-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->d:Lhuawei/widget/HwProgressBar;

    .line 1075
    sget v0, Lcom/huawei/ui/homewear21/R$id;->home_fragment_bluetooth_tv_bcd:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->i:Landroid/widget/TextView;

    .line 1076
    sget v0, Lcom/huawei/ui/homewear21/R$id;->lly_reconnect_bcd:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->g:Landroid/widget/LinearLayout;

    .line 1077
    sget v0, Lcom/huawei/ui/homewear21/R$id;->battery_image_bcd:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->h:Landroid/widget/ImageView;

    .line 1078
    sget v0, Lcom/huawei/ui/homewear21/R$id;->battery_textview_bcd:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->k:Landroid/widget/TextView;

    .line 1081
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->m:Landroid/widget/RelativeLayout;

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->aN:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1084
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1085
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->at:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/homewear21/R$string;->IDS_band_data_sport_distance_unit_en:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    goto :goto_0

    .line 1087
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->at:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/homewear21/R$string;->IDS_band_data_sport_distance_unit:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 1090
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->n:Landroid/widget/LinearLayout;

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->aN:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1091
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->d:Lhuawei/widget/HwProgressBar;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lhuawei/widget/HwProgressBar;->setLayerType(ILandroid/graphics/Paint;)V

    .line 1104
    sget v0, Lcom/huawei/ui/homewear21/R$id;->sv_device_setting:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ScrollView;

    iput-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->B:Landroid/widget/ScrollView;

    .line 1137
    return-void
.end method

.method static synthetic v(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)V
    .locals 0

    .line 232
    invoke-direct {p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->A()V

    return-void
.end method

.method private v()Z
    .locals 4

    .line 2367
    iget v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->F:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->F:I

    .line 2368
    const-string v0, "WearHomeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isLastSettings() commonSettingsCount = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->F:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2369
    iget v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->F:I

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private w()V
    .locals 6

    .line 1327
    const-string v0, "MainUI"

    const-string v1, "WearHomeActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Enter sendDeviceListChangeBroadcast()"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1328
    new-instance v5, Landroid/content/Intent;

    const-string v0, "com.huawei.bone.action.DEVICE_LIST_DELETE"

    invoke-direct {v5, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 1329
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 1330
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    sget-object v1, Lo/dac;->a:Ljava/lang/String;

    invoke-virtual {v0, v5, v1}, Landroid/content/Context;->sendOrderedBroadcast(Landroid/content/Intent;Ljava/lang/String;)V

    .line 1331
    return-void
.end method

.method static synthetic w(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)V
    .locals 0

    .line 232
    invoke-direct {p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->aI()V

    return-void
.end method

.method private x()V
    .locals 19

    .line 1382
    const-string v0, "MainUI"

    const-string v1, "WearHomeActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Enter refreshSettingData() isConnected:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    move-object/from16 v4, p0

    iget-boolean v4, v4, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->D:Z

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1383
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->w:Lo/enz;

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->X:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/enz;->b(Ljava/lang/String;)Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    move-result-object v0

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->T:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    .line 1384
    move-object/from16 v0, p0

    iget-object v10, v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->aq:Ljava/lang/Object;

    monitor-enter v10

    .line 1385
    move-object/from16 v0, p0

    :try_start_0
    iget-object v0, v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->V:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1386
    monitor-exit v10

    goto :goto_0

    :catchall_0
    move-exception v11

    monitor-exit v10

    throw v11

    .line 1387
    :goto_0
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->U:Landroid/widget/ListView;

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->W:Lo/eos;

    move-object/from16 v2, p0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->c(Landroid/widget/ListView;Lo/eos;)V

    .line 1388
    invoke-direct/range {p0 .. p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->F()V

    .line 1389
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->T:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 1390
    return-void

    .line 1392
    :cond_0
    new-instance v0, Lo/eoe;

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->t:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/eoe;-><init>(Landroid/content/Context;)V

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->ac:Lo/eoe;

    .line 1395
    invoke-static {}, Lo/etq;->d()Lo/etq;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->X:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/etq;->a(Ljava/lang/String;)Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v0

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->Q:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    .line 1396
    invoke-direct/range {p0 .. p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->z()V

    .line 1397
    const/4 v11, 0x0

    .line 1398
    const/4 v12, 0x0

    .line 1399
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->Q:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 1400
    const/4 v0, 0x0

    move-object/from16 v1, p0

    iput v0, v1, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->ag:I

    .line 1401
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->Q:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v11

    .line 1402
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->Q:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v0

    const/4 v1, 0x3

    if-eq v1, v0, :cond_1

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->Q:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    .line 1403
    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v0

    const/16 v1, 0xa

    if-ne v1, v0, :cond_4

    .line 1404
    :cond_1
    const/4 v12, 0x1

    goto :goto_1

    .line 1407
    :cond_2
    move-object/from16 v0, p0

    iget v0, v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->ag:I

    add-int/lit8 v0, v0, 0x1

    move-object/from16 v1, p0

    iput v0, v1, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->ag:I

    .line 1408
    const-string v0, "WearHomeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Enter refreshSettingData(),deviceMac is null!"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, p0

    iget v3, v3, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->ag:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1409
    move-object/from16 v0, p0

    iget v0, v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->ag:I

    const/4 v1, 0x3

    if-ge v0, v1, :cond_3

    .line 1410
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->aQ:Landroid/os/Handler;

    const/16 v1, 0x3f6

    const-wide/16 v2, 0x3e8

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 1412
    :cond_3
    return-void

    .line 1415
    :cond_4
    :goto_1
    if-nez v12, :cond_5

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->T:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportSportTotal()Z

    move-result v0

    if-eqz v0, :cond_5

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->Q:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v0

    const/16 v1, 0xb

    if-eq v1, v0, :cond_5

    const/4 v13, 0x1

    goto :goto_2

    :cond_5
    const/4 v13, 0x0

    .line 1416
    :goto_2
    const-string v0, "MainUI"

    const-string v1, "WearHomeActivity"

    const/16 v2, 0x18

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, " refreshSettingData() isGold_card = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    move-object/from16 v4, p0

    iget-object v4, v4, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->T:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    .line 1417
    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isGold_card()Z

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, " isActivity_reminder = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    move-object/from16 v4, p0

    iget-object v4, v4, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->T:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    .line 1418
    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isActivity_reminder()Z

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, " isBluetooth_off_alert = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    move-object/from16 v4, p0

    iget-object v4, v4, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->T:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    .line 1419
    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isBluetooth_off_alert()Z

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x2

    aput-object v3, v2, v4

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, " isCall_mute = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    move-object/from16 v4, p0

    iget-object v4, v4, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->T:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    .line 1420
    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isCall_mute()Z

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x3

    aput-object v3, v2, v4

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, " isEvent_alarm = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    move-object/from16 v4, p0

    iget-object v4, v4, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->T:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    .line 1421
    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isEvent_alarm()Z

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x4

    aput-object v3, v2, v4

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, " isSmart_alarm = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    move-object/from16 v4, p0

    iget-object v4, v4, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->T:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    .line 1422
    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSmart_alarm()Z

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x5

    aput-object v3, v2, v4

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, " isAvoid_disturb = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    move-object/from16 v4, p0

    iget-object v4, v4, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->T:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    .line 1423
    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isAvoid_disturb()Z

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x6

    aput-object v3, v2, v4

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, " isMessage_alert = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    move-object/from16 v4, p0

    iget-object v4, v4, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->T:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    .line 1424
    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isMessage_alert()Z

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x7

    aput-object v3, v2, v4

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, " isWeather_push = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    move-object/from16 v4, p0

    iget-object v4, v4, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->T:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    .line 1425
    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isWeather_push()Z

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/16 v4, 0x8

    aput-object v3, v2, v4

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, " isAuto_light_screen = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    move-object/from16 v4, p0

    iget-object v4, v4, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->T:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    .line 1426
    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isAuto_light_screen()Z

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/16 v4, 0x9

    aput-object v3, v2, v4

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, " isContacts = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    move-object/from16 v4, p0

    iget-object v4, v4, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->T:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    .line 1427
    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isContacts()Z

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/16 v4, 0xa

    aput-object v3, v2, v4

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, " isOta_update = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    move-object/from16 v4, p0

    iget-object v4, v4, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->T:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    .line 1428
    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isOta_update()Z

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/16 v4, 0xb

    aput-object v3, v2, v4

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, " isFactory_reset = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    move-object/from16 v4, p0

    iget-object v4, v4, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->T:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    .line 1429
    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isFactory_reset()Z

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/16 v4, 0xc

    aput-object v3, v2, v4

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, " isReserveSync = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    move-object/from16 v4, p0

    iget-object v4, v4, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->T:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    .line 1430
    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isReserveSync()Z

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/16 v4, 0xd

    aput-object v3, v2, v4

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, " isSupportHelp = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    move-object/from16 v4, p0

    iget-object v4, v4, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->T:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    .line 1431
    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportHelp()Z

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/16 v4, 0xe

    aput-object v3, v2, v4

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, " isSupportPay = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    move-object/from16 v4, p0

    iget-object v4, v4, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->T:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    .line 1432
    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportPay()Z

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/16 v4, 0xf

    aput-object v3, v2, v4

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, " isSupportEsim = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    move-object/from16 v4, p0

    iget-object v4, v4, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->T:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    .line 1433
    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportEsim()Z

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/16 v4, 0x10

    aput-object v3, v2, v4

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, " isSupportCoreSleep = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    move-object/from16 v4, p0

    iget-object v4, v4, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->T:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    .line 1434
    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportCoreSleep()Z

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/16 v4, 0x11

    aput-object v3, v2, v4

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, " isSupportHeartRateEnable = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    move-object/from16 v4, p0

    iget-object v4, v4, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->T:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    .line 1435
    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportHeartRateEnable()Z

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/16 v4, 0x12

    aput-object v3, v2, v4

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, " isRotate_switch_screen = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    move-object/from16 v4, p0

    iget-object v4, v4, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->T:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    .line 1436
    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isRotate_switch_screen()Z

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/16 v4, 0x13

    aput-object v3, v2, v4

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, " isSupportLeftRightHandWearMode = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    move-object/from16 v4, p0

    iget-object v4, v4, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->T:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    .line 1437
    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportLeftRightHandWearMode()Z

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/16 v4, 0x14

    aput-object v3, v2, v4

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, " isSupportOneLevelMenu = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    move-object/from16 v4, p0

    iget-object v4, v4, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->T:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    .line 1438
    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportOneLevelMenu()Z

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/16 v4, 0x15

    aput-object v3, v2, v4

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, " isSupportHuafen = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    .line 1439
    const/16 v4, 0x1d

    invoke-static {v4}, Lo/czd;->e(I)Z

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/16 v4, 0x16

    aput-object v3, v2, v4

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "isSupportMusicControl = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    move-object/from16 v4, p0

    iget-object v4, v4, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->T:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    .line 1440
    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportMusicControl()Z

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/16 v4, 0x17

    aput-object v3, v2, v4

    .line 1416
    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1443
    const/4 v14, 0x0

    .line 1444
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->Q:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_6

    .line 1445
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->Q:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v0

    invoke-static {v0}, Lo/dbh;->e(I)Z

    move-result v14

    .line 1450
    :cond_6
    move-object/from16 v0, p0

    invoke-direct {v0, v14}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->a(Z)V

    .line 1453
    const-string v0, "WearHomeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "commonSettingsCount = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, p0

    iget v3, v3, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->F:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1455
    if-nez v12, :cond_8

    .line 1456
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->T:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportHelp()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 1457
    move-object/from16 v0, p0

    sget v2, Lcom/huawei/ui/homewear21/R$mipmap;->ic_list_help:I

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->t:Landroid/content/Context;

    sget v3, Lcom/huawei/ui/homewear21/R$string;->IDS_main_discovery_tab_service_help:I

    .line 1459
    invoke-virtual {v1, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    const-string v6, ""

    const-string v7, ""

    const/4 v1, 0x0

    new-array v8, v1, [Landroid/widget/CompoundButton$OnCheckedChangeListener;

    .line 1457
    const/4 v1, 0x1

    const/16 v3, 0x11

    const/4 v4, 0x3

    invoke-direct/range {v0 .. v8}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->e(ZIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 1462
    :cond_7
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->Q:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_8

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->Q:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getAutoDetectSwitchStatus()I

    move-result v0

    const/4 v1, 0x1

    if-eq v1, v0, :cond_8

    .line 1463
    move-object/from16 v0, p0

    const-string v5, ""

    const-string v6, ""

    const-string v7, ""

    const/4 v1, 0x0

    new-array v8, v1, [Landroid/widget/CompoundButton$OnCheckedChangeListener;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/16 v3, -0x25c4

    const/4 v4, 0x5

    invoke-direct/range {v0 .. v8}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->e(ZIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 1469
    :cond_8
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->Q:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_a

    if-eqz v12, :cond_a

    .line 1471
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->T:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportHelp()Z

    move-result v0

    if-eqz v0, :cond_9

    .line 1472
    move-object/from16 v0, p0

    sget v2, Lcom/huawei/ui/homewear21/R$mipmap;->ic_list_help:I

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->t:Landroid/content/Context;

    sget v3, Lcom/huawei/ui/homewear21/R$string;->IDS_main_discovery_tab_service_help:I

    .line 1474
    invoke-virtual {v1, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    const-string v6, ""

    const-string v7, ""

    const/4 v1, 0x0

    new-array v8, v1, [Landroid/widget/CompoundButton$OnCheckedChangeListener;

    .line 1472
    const/4 v1, 0x1

    const/16 v3, 0x11

    const/4 v4, 0x3

    invoke-direct/range {v0 .. v8}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->e(ZIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 1477
    :cond_9
    move-object/from16 v0, p0

    const-string v5, ""

    const-string v6, ""

    const-string v7, ""

    const/4 v1, 0x0

    new-array v8, v1, [Landroid/widget/CompoundButton$OnCheckedChangeListener;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/16 v3, -0x25c4

    const/4 v4, 0x5

    invoke-direct/range {v0 .. v8}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->e(ZIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 1484
    :cond_a
    const-string v0, "WearHomeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "deviceCapability.isSupportSportTotal() value "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, p0

    iget-object v3, v3, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->T:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    invoke-virtual {v3}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportSportTotal()Z

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1485
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->an:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 1486
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->as:Lo/ety;

    invoke-virtual {v0}, Lo/ety;->a()V

    .line 1491
    const-string v0, "MainUI"

    const-string v1, "WearHomeActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "-VersionConfig.isFeatureSupport(FeatureId.SUPPORT_CORE_SLEEP) :"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const/16 v4, 0x3a

    invoke-static {v4}, Lo/czd;->e(I)Z

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1493
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->T:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportCoreSleep()Z

    move-result v0

    if-eqz v0, :cond_b

    const/16 v0, 0x3a

    invoke-static {v0}, Lo/czd;->e(I)Z

    move-result v0

    if-eqz v0, :cond_b

    .line 1494
    move-object/from16 v0, p0

    move-object/from16 v1, p0

    iget-boolean v1, v1, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->D:Z

    sget v2, Lcom/huawei/ui/homewear21/R$mipmap;->home_ic_list_accuratesleep:I

    move-object/from16 v3, p0

    iget-object v3, v3, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->t:Landroid/content/Context;

    sget v4, Lcom/huawei/ui/homewear21/R$string;->IDS_fitness_core_sleep_title:I

    .line 1496
    invoke-virtual {v3, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    const-string v6, ""

    move-object/from16 v3, p0

    iget-object v3, v3, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->t:Landroid/content/Context;

    sget v4, Lcom/huawei/ui/homewear21/R$string;->IDS_status_disabled:I

    .line 1497
    invoke-virtual {v3, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v7

    const/4 v3, 0x0

    new-array v8, v3, [Landroid/widget/CompoundButton$OnCheckedChangeListener;

    .line 1494
    const/16 v3, 0x17

    const/4 v4, 0x3

    invoke-direct/range {v0 .. v8}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->e(ZIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 1498
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->ax:Lo/dqi;

    const-string v1, "core_sleep_button"

    new-instance v2, Lcom/huawei/ui/homewear21/home/WearHomeActivity$2;

    move-object/from16 v3, p0

    invoke-direct {v2, v3}, Lcom/huawei/ui/homewear21/home/WearHomeActivity$2;-><init>(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)V

    invoke-virtual {v0, v1, v2}, Lo/dqi;->a(Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 1539
    :cond_b
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-nez v0, :cond_c

    .line 1540
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->T:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportIntelligentHomeLinkage()Z

    move-result v0

    if-eqz v0, :cond_c

    .line 1541
    const-string v0, "WearHomeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isSupportIntelligentHomeLinkage----"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, p0

    iget-object v3, v3, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->T:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    invoke-virtual {v3}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportIntelligentHomeLinkage()Z

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1542
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->t:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/homewear21/R$string;->IDS_device_intelligent_home_linkage:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    move-object/from16 v2, p0

    iget-object v2, v2, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->t:Landroid/content/Context;

    sget v3, Lcom/huawei/ui/homewear21/R$string;->IDS_device_intelligent_home:I

    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v15

    .line 1543
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->t:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/homewear21/R$string;->IDS_device_to_intelligent_home_linkage_under:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    move-object/from16 v2, p0

    iget-object v2, v2, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->t:Landroid/content/Context;

    sget v3, Lcom/huawei/ui/homewear21/R$string;->IDS_device_intelligent_home:I

    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v16

    .line 1544
    move-object/from16 v0, p0

    move-object/from16 v1, p0

    iget-boolean v1, v1, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->D:Z

    sget v2, Lcom/huawei/ui/homewear21/R$mipmap;->home_ic_list_link:I

    move-object v5, v15

    move-object/from16 v6, v16

    move-object/from16 v3, p0

    iget-object v3, v3, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->t:Landroid/content/Context;

    sget v4, Lcom/huawei/ui/homewear21/R$string;->IDS_status_disabled:I

    .line 1547
    invoke-virtual {v3, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v7

    const/4 v3, 0x0

    new-array v8, v3, [Landroid/widget/CompoundButton$OnCheckedChangeListener;

    .line 1544
    const/16 v3, 0x26

    const/4 v4, 0x3

    invoke-direct/range {v0 .. v8}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->e(ZIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 1550
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->ax:Lo/dqi;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "intelligent_home_linkage"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/huawei/ui/homewear21/home/WearHomeActivity$5;

    move-object/from16 v3, p0

    invoke-direct {v2, v3}, Lcom/huawei/ui/homewear21/home/WearHomeActivity$5;-><init>(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)V

    invoke-virtual {v0, v1, v2}, Lo/dqi;->d(Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 1602
    :cond_c
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->T:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isActivity_reminder()Z

    move-result v0

    if-eqz v0, :cond_d

    .line 1603
    move-object/from16 v0, p0

    move-object/from16 v1, p0

    iget-boolean v1, v1, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->D:Z

    sget v2, Lcom/huawei/ui/homewear21/R$mipmap;->home_ic_list_idlereminders:I

    move-object/from16 v3, p0

    iget-object v3, v3, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->t:Landroid/content/Context;

    sget v4, Lcom/huawei/ui/homewear21/R$string;->IDS_settings_moving_remind:I

    .line 1605
    invoke-virtual {v3, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    move-object/from16 v3, p0

    iget-object v3, v3, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->t:Landroid/content/Context;

    sget v4, Lcom/huawei/ui/homewear21/R$string;->IDS_btsetting_stand_alert_message:I

    .line 1606
    invoke-virtual {v3, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v6

    const-string v7, ""

    const/4 v3, 0x1

    new-array v8, v3, [Landroid/widget/CompoundButton$OnCheckedChangeListener;

    move-object/from16 v3, p0

    iget-object v3, v3, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->aI:Landroid/widget/CompoundButton$OnCheckedChangeListener;

    const/4 v4, 0x0

    aput-object v3, v8, v4

    .line 1603
    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-direct/range {v0 .. v8}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->e(ZIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 1610
    const-string v0, "MainUI"

    const-string v1, "WearHomeActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "initData() getIdleRemind "

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1620
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->w:Lo/enz;

    new-instance v1, Lcom/huawei/ui/homewear21/home/WearHomeActivity$7;

    move-object/from16 v2, p0

    invoke-direct {v1, v2}, Lcom/huawei/ui/homewear21/home/WearHomeActivity$7;-><init>(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)V

    invoke-virtual {v0, v1}, Lo/enz;->c(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 1644
    :cond_d
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->T:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportHeartRateEnable()Z

    move-result v0

    if-eqz v0, :cond_e

    .line 1645
    move-object/from16 v0, p0

    move-object/from16 v1, p0

    iget-boolean v1, v1, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->D:Z

    sget v2, Lcom/huawei/ui/homewear21/R$mipmap;->home_ic_list_heartrate:I

    move-object/from16 v3, p0

    iget-object v3, v3, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->t:Landroid/content/Context;

    sget v4, Lcom/huawei/ui/homewear21/R$string;->IDS_settings_HeartRate_switch:I

    .line 1647
    invoke-virtual {v3, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    const-string v6, ""

    move-object/from16 v3, p0

    iget-object v3, v3, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->t:Landroid/content/Context;

    sget v4, Lcom/huawei/ui/homewear21/R$string;->IDS_status_disabled:I

    invoke-virtual {v3, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v7

    const/4 v3, 0x0

    new-array v8, v3, [Landroid/widget/CompoundButton$OnCheckedChangeListener;

    .line 1645
    const/16 v3, 0x18

    const/4 v4, 0x3

    invoke-direct/range {v0 .. v8}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->e(ZIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 1649
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->ax:Lo/dqi;

    const-string v1, "heart_rate_button"

    new-instance v2, Lcom/huawei/ui/homewear21/home/WearHomeActivity$8;

    move-object/from16 v3, p0

    invoke-direct {v2, v3}, Lcom/huawei/ui/homewear21/home/WearHomeActivity$8;-><init>(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)V

    invoke-virtual {v0, v1, v2}, Lo/dqi;->a(Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 1689
    :cond_e
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->T:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportContinueHeartRate()Z

    move-result v0

    if-eqz v0, :cond_f

    .line 1691
    const-string v0, "WearHomeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "prepare add press continue heart rate item"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1692
    move-object/from16 v0, p0

    move-object/from16 v1, p0

    iget-boolean v1, v1, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->D:Z

    sget v2, Lcom/huawei/ui/homewear21/R$mipmap;->home_ic_list_heartrate:I

    move-object/from16 v3, p0

    iget-object v3, v3, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->t:Landroid/content/Context;

    sget v4, Lcom/huawei/ui/homewear21/R$string;->IDS_settings_continue_HeartRate_switch:I

    .line 1694
    invoke-virtual {v3, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    const-string v6, ""

    move-object/from16 v3, p0

    iget-object v3, v3, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->t:Landroid/content/Context;

    sget v4, Lcom/huawei/ui/homewear21/R$string;->IDS_status_enabled:I

    .line 1695
    invoke-virtual {v3, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v7

    const/4 v3, 0x0

    new-array v8, v3, [Landroid/widget/CompoundButton$OnCheckedChangeListener;

    .line 1692
    const/16 v3, 0x23

    const/4 v4, 0x3

    invoke-direct/range {v0 .. v8}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->e(ZIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 1697
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->ax:Lo/dqi;

    const-string v1, "continue_heart_rate"

    new-instance v2, Lcom/huawei/ui/homewear21/home/WearHomeActivity$10;

    move-object/from16 v3, p0

    invoke-direct {v2, v3}, Lcom/huawei/ui/homewear21/home/WearHomeActivity$10;-><init>(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)V

    invoke-virtual {v0, v1, v2}, Lo/dqi;->a(Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 1737
    :cond_f
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->T:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportPressAutoMonitor()Z

    move-result v0

    if-eqz v0, :cond_10

    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-nez v0, :cond_10

    .line 1739
    const-string v0, "WearHomeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "prepare add press auto monitor item"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1740
    move-object/from16 v0, p0

    move-object/from16 v1, p0

    iget-boolean v1, v1, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->D:Z

    sget v2, Lcom/huawei/ui/homewear21/R$mipmap;->home_ic_list_press_auto_monitor:I

    move-object/from16 v3, p0

    iget-object v3, v3, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->t:Landroid/content/Context;

    sget v4, Lcom/huawei/ui/homewear21/R$string;->IDS_press_auto_monitor:I

    .line 1742
    invoke-virtual {v3, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    const-string v6, ""

    move-object/from16 v3, p0

    iget-object v3, v3, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->t:Landroid/content/Context;

    sget v4, Lcom/huawei/ui/homewear21/R$string;->IDS_status_enabled:I

    .line 1743
    invoke-virtual {v3, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v7

    const/4 v3, 0x0

    new-array v8, v3, [Landroid/widget/CompoundButton$OnCheckedChangeListener;

    .line 1740
    const/16 v3, 0x149

    const/4 v4, 0x3

    invoke-direct/range {v0 .. v8}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->e(ZIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 1745
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->ax:Lo/dqi;

    const-string v1, "press_auto_monitor_switch_status"

    new-instance v2, Lcom/huawei/ui/homewear21/home/WearHomeActivity$6;

    move-object/from16 v3, p0

    invoke-direct {v2, v3}, Lcom/huawei/ui/homewear21/home/WearHomeActivity$6;-><init>(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)V

    invoke-virtual {v0, v1, v2}, Lo/dqi;->a(Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 1779
    :cond_10
    if-eqz v13, :cond_11

    .line 1780
    move-object/from16 v0, p0

    const-string v5, ""

    const-string v6, ""

    const-string v7, ""

    const/4 v1, 0x0

    new-array v8, v1, [Landroid/widget/CompoundButton$OnCheckedChangeListener;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/16 v3, -0x25c4

    const/4 v4, 0x5

    invoke-direct/range {v0 .. v8}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->e(ZIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 1785
    :cond_11
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->T:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportPay()Z

    move-result v0

    if-eqz v0, :cond_12

    const/16 v0, 0x35

    invoke-static {v0}, Lo/czd;->e(I)Z

    move-result v0

    if-eqz v0, :cond_12

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->t:Landroid/content/Context;

    invoke-static {v0}, Lo/ene;->c(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_12

    .line 1786
    move-object/from16 v0, p0

    move-object/from16 v1, p0

    iget-boolean v1, v1, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->D:Z

    sget v2, Lcom/huawei/ui/homewear21/R$mipmap;->ic_list_wallet:I

    move-object/from16 v3, p0

    iget-object v3, v3, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->t:Landroid/content/Context;

    sget v4, Lcom/huawei/ui/homewear21/R$string;->IDS_main_homefragment_wallet:I

    .line 1788
    invoke-virtual {v3, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    const-string v6, ""

    const-string v7, ""

    const/4 v3, 0x0

    new-array v8, v3, [Landroid/widget/CompoundButton$OnCheckedChangeListener;

    .line 1786
    const/16 v3, 0x13

    const/4 v4, 0x3

    invoke-direct/range {v0 .. v8}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->e(ZIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 1801
    :cond_12
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->T:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportEsim()Z

    move-result v0

    if-eqz v0, :cond_13

    .line 1802
    move-object/from16 v0, p0

    move-object/from16 v1, p0

    iget-boolean v1, v1, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->D:Z

    sget v2, Lcom/huawei/ui/homewear21/R$mipmap;->ic_list_simcard:I

    move-object/from16 v3, p0

    iget-object v3, v3, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->t:Landroid/content/Context;

    sget v4, Lcom/huawei/ui/homewear21/R$string;->IDS_main_homefragment_simcard:I

    .line 1804
    invoke-virtual {v3, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    const-string v6, ""

    const-string v7, ""

    const/4 v3, 0x0

    new-array v8, v3, [Landroid/widget/CompoundButton$OnCheckedChangeListener;

    .line 1802
    const/16 v3, 0x15

    const/4 v4, 0x3

    invoke-direct/range {v0 .. v8}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->e(ZIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 1808
    :cond_13
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->T:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isGold_card()Z

    move-result v0

    if-eqz v0, :cond_14

    const/16 v0, 0xe

    invoke-static {v0}, Lo/czd;->e(I)Z

    move-result v0

    if-eqz v0, :cond_14

    .line 1809
    move-object/from16 v0, p0

    move-object/from16 v1, p0

    iget-boolean v1, v1, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->D:Z

    sget v2, Lcom/huawei/ui/homewear21/R$mipmap;->ic_list_huaweimenber:I

    move-object/from16 v3, p0

    iget-object v3, v3, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->t:Landroid/content/Context;

    sget v4, Lcom/huawei/ui/homewear21/R$string;->IDS_main_discovery_tab_service_huawei_member:I

    .line 1811
    invoke-virtual {v3, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    const-string v6, ""

    const-string v7, ""

    const/4 v3, 0x0

    new-array v8, v3, [Landroid/widget/CompoundButton$OnCheckedChangeListener;

    .line 1809
    const/16 v3, 0x14

    const/4 v4, 0x3

    invoke-direct/range {v0 .. v8}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->e(ZIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 1817
    :cond_14
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->T:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isEvent_alarm()Z

    move-result v0

    if-nez v0, :cond_15

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->T:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSmart_alarm()Z

    move-result v0

    if-eqz v0, :cond_16

    .line 1818
    :cond_15
    move-object/from16 v0, p0

    move-object/from16 v1, p0

    iget-boolean v1, v1, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->D:Z

    sget v2, Lcom/huawei/ui/homewear21/R$mipmap;->home_ic_list_alarm:I

    move-object/from16 v3, p0

    iget-object v3, v3, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->t:Landroid/content/Context;

    sget v4, Lcom/huawei/ui/homewear21/R$string;->IDS_settings_prompt:I

    .line 1820
    invoke-virtual {v3, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    const-string v6, ""

    const-string v7, ""

    const/4 v3, 0x0

    new-array v8, v3, [Landroid/widget/CompoundButton$OnCheckedChangeListener;

    .line 1818
    const/4 v3, 0x4

    const/4 v4, 0x3

    invoke-direct/range {v0 .. v8}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->e(ZIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 1825
    :cond_16
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->T:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isAvoid_disturb()Z

    move-result v0

    if-eqz v0, :cond_17

    .line 1826
    move-object/from16 v0, p0

    move-object/from16 v1, p0

    iget-boolean v1, v1, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->D:Z

    sget v2, Lcom/huawei/ui/homewear21/R$mipmap;->home_ic_list_donotdisturb:I

    move-object/from16 v3, p0

    iget-object v3, v3, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->t:Landroid/content/Context;

    sget v4, Lcom/huawei/ui/homewear21/R$string;->IDS_setting_disturb_title:I

    .line 1828
    invoke-virtual {v3, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    const-string v6, ""

    const-string v7, ""

    const/4 v3, 0x0

    new-array v8, v3, [Landroid/widget/CompoundButton$OnCheckedChangeListener;

    .line 1826
    const/4 v3, 0x5

    const/4 v4, 0x3

    invoke-direct/range {v0 .. v8}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->e(ZIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 1830
    invoke-direct/range {p0 .. p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->ad()V

    .line 1831
    invoke-direct/range {p0 .. p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->v()Z

    move-result v0

    if-eqz v0, :cond_17

    .line 1832
    invoke-direct/range {p0 .. p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->F()V

    .line 1833
    const-string v0, "WearHomeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isLastSettings() notifyUpdateSettingList"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1838
    :cond_17
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->T:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isMessage_alert()Z

    move-result v0

    if-eqz v0, :cond_1a

    .line 1840
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->t:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/homewear21/R$string;->IDS_status_disabled:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v15

    .line 1841
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->j:Lo/eoa;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_18

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->j:Lo/eoa;

    invoke-virtual {v0}, Lo/eoa;->c()Z

    move-result v0

    if-eqz v0, :cond_18

    .line 1842
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->t:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/homewear21/R$string;->IDS_status_enabled:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v15

    .line 1845
    :cond_18
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->aF:Lo/dip;

    invoke-virtual {v0}, Lo/dip;->e()Z

    move-result v0

    if-eqz v0, :cond_19

    .line 1846
    move-object/from16 v0, p0

    move-object/from16 v1, p0

    iget-boolean v1, v1, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->D:Z

    sget v2, Lcom/huawei/ui/homewear21/R$mipmap;->ic_massage:I

    move-object/from16 v3, p0

    iget-object v3, v3, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->t:Landroid/content/Context;

    sget v4, Lcom/huawei/ui/homewear21/R$string;->IDS_nottification_settings_b2_ex:I

    .line 1848
    invoke-virtual {v3, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    const-string v6, ""

    move-object v7, v15

    const/4 v3, 0x0

    new-array v8, v3, [Landroid/widget/CompoundButton$OnCheckedChangeListener;

    .line 1846
    const/4 v3, 0x6

    const/4 v4, 0x3

    invoke-direct/range {v0 .. v8}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->e(ZIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    goto :goto_3

    .line 1851
    :cond_19
    move-object/from16 v0, p0

    move-object/from16 v1, p0

    iget-boolean v1, v1, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->D:Z

    sget v2, Lcom/huawei/ui/homewear21/R$mipmap;->ic_massage2:I

    move-object/from16 v3, p0

    iget-object v3, v3, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->t:Landroid/content/Context;

    sget v4, Lcom/huawei/ui/homewear21/R$string;->IDS_nottification_settings_b2_ex:I

    .line 1853
    invoke-virtual {v3, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    const-string v6, ""

    move-object v7, v15

    const/4 v3, 0x0

    new-array v8, v3, [Landroid/widget/CompoundButton$OnCheckedChangeListener;

    .line 1851
    const/4 v3, 0x6

    const/4 v4, 0x3

    invoke-direct/range {v0 .. v8}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->e(ZIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 1859
    :cond_1a
    :goto_3
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->T:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportPhonesInfo()Z

    move-result v0

    if-eqz v0, :cond_1b

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->T:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportNotifyDeviceBroadCast()Z

    move-result v0

    if-eqz v0, :cond_1b

    .line 1860
    move-object/from16 v0, p0

    move-object/from16 v1, p0

    iget-boolean v1, v1, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->D:Z

    sget v2, Lcom/huawei/ui/homewear21/R$mipmap;->home_ic_list_phone_two:I

    move-object/from16 v3, p0

    iget-object v3, v3, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->t:Landroid/content/Context;

    sget v4, Lcom/huawei/ui/homewear21/R$string;->IDS_hw_health_double_phone_menu_title:I

    .line 1862
    invoke-virtual {v3, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    const-string v6, ""

    const-string v7, ""

    const/4 v3, 0x0

    new-array v8, v3, [Landroid/widget/CompoundButton$OnCheckedChangeListener;

    .line 1860
    const/16 v3, 0x25

    const/4 v4, 0x3

    invoke-direct/range {v0 .. v8}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->e(ZIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 1867
    :cond_1b
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->T:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isContacts()Z

    move-result v0

    if-eqz v0, :cond_1c

    .line 1868
    move-object/from16 v0, p0

    move-object/from16 v1, p0

    iget-boolean v1, v1, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->D:Z

    sget v2, Lcom/huawei/ui/homewear21/R$mipmap;->home_ic_list_contact:I

    move-object/from16 v3, p0

    iget-object v3, v3, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->t:Landroid/content/Context;

    sget v4, Lcom/huawei/ui/homewear21/R$string;->IDS_contact_favorite_contacts:I

    .line 1870
    invoke-virtual {v3, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    const-string v6, ""

    const-string v7, ""

    const/4 v3, 0x0

    new-array v8, v3, [Landroid/widget/CompoundButton$OnCheckedChangeListener;

    .line 1868
    const/16 v3, 0xc

    const/4 v4, 0x3

    invoke-direct/range {v0 .. v8}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->e(ZIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 1875
    :cond_1c
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->T:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isWeather_push()Z

    move-result v0

    if-eqz v0, :cond_1d

    .line 1877
    move-object/from16 v0, p0

    move-object/from16 v1, p0

    iget-boolean v1, v1, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->D:Z

    sget v2, Lcom/huawei/ui/homewear21/R$mipmap;->home_ic_list_weatherreport:I

    move-object/from16 v3, p0

    iget-object v3, v3, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->t:Landroid/content/Context;

    sget v4, Lcom/huawei/ui/homewear21/R$string;->IDS_weather_push:I

    .line 1879
    invoke-virtual {v3, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    const-string v6, ""

    move-object/from16 v3, p0

    iget-object v3, v3, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->t:Landroid/content/Context;

    sget v4, Lcom/huawei/ui/homewear21/R$string;->IDS_status_enabled:I

    .line 1880
    invoke-virtual {v3, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v7

    const/4 v3, 0x0

    new-array v8, v3, [Landroid/widget/CompoundButton$OnCheckedChangeListener;

    .line 1877
    const/4 v3, 0x7

    const/4 v4, 0x3

    invoke-direct/range {v0 .. v8}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->e(ZIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 1882
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->ax:Lo/dqi;

    const-string v1, "weather_switch_status"

    new-instance v2, Lcom/huawei/ui/homewear21/home/WearHomeActivity$9;

    move-object/from16 v3, p0

    invoke-direct {v2, v3}, Lcom/huawei/ui/homewear21/home/WearHomeActivity$9;-><init>(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)V

    invoke-virtual {v0, v1, v2}, Lo/dqi;->a(Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 1917
    :cond_1d
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->T:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportMusicControl()Z

    move-result v0

    if-eqz v0, :cond_1e

    .line 1918
    move-object/from16 v0, p0

    move-object/from16 v1, p0

    iget-boolean v1, v1, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->D:Z

    sget v2, Lcom/huawei/ui/homewear21/R$mipmap;->home_ic_list_music:I

    move-object/from16 v3, p0

    iget-object v3, v3, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->t:Landroid/content/Context;

    sget v4, Lcom/huawei/ui/homewear21/R$string;->HomeDeviceCloud_IDS_Janus_music_control:I

    .line 1920
    invoke-virtual {v3, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    const-string v6, ""

    const-string v7, ""

    const/4 v3, 0x1

    new-array v8, v3, [Landroid/widget/CompoundButton$OnCheckedChangeListener;

    move-object/from16 v3, p0

    iget-object v3, v3, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->bp:Landroid/widget/CompoundButton$OnCheckedChangeListener;

    const/4 v4, 0x0

    aput-object v3, v8, v4

    .line 1918
    const/16 v3, 0x22

    const/4 v4, 0x1

    invoke-direct/range {v0 .. v8}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->e(ZIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 1923
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->V:Ljava/util/ArrayList;

    move-object/from16 v1, p0

    const/16 v2, 0x22

    invoke-direct {v1, v0, v2}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->b(Ljava/util/ArrayList;I)Lo/eoq;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->t:Landroid/content/Context;

    invoke-static {v1}, Lo/dix;->d(Landroid/content/Context;)Lo/dix;

    move-result-object v1

    invoke-virtual {v1}, Lo/dix;->a()Z

    move-result v1

    invoke-virtual {v0, v1}, Lo/eoq;->e(Z)V

    .line 1926
    :cond_1e
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->T:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isBluetooth_off_alert()Z

    move-result v0

    if-eqz v0, :cond_1f

    .line 1927
    move-object/from16 v0, p0

    move-object/from16 v1, p0

    iget-boolean v1, v1, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->D:Z

    sget v2, Lcom/huawei/ui/homewear21/R$mipmap;->home_ic_list_bluetoothdisconnected:I

    move-object/from16 v3, p0

    iget-object v3, v3, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->t:Landroid/content/Context;

    sget v4, Lcom/huawei/ui/homewear21/R$string;->IDS_settings_anti_lost_remind:I

    .line 1929
    invoke-virtual {v3, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    const-string v6, ""

    const-string v7, ""

    const/4 v3, 0x1

    new-array v8, v3, [Landroid/widget/CompoundButton$OnCheckedChangeListener;

    move-object/from16 v3, p0

    iget-object v3, v3, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->aK:Landroid/widget/CompoundButton$OnCheckedChangeListener;

    const/4 v4, 0x0

    aput-object v3, v8, v4

    .line 1927
    const/4 v3, 0x2

    const/4 v4, 0x1

    invoke-direct/range {v0 .. v8}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->e(ZIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 1934
    const-string v0, "WearHomeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mHWCombineMigrateMgr.getWearCommonSetting"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1935
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->ax:Lo/dqi;

    const-string v1, "bt_lost_remind"

    new-instance v2, Lcom/huawei/ui/homewear21/home/WearHomeActivity$14;

    move-object/from16 v3, p0

    invoke-direct {v2, v3}, Lcom/huawei/ui/homewear21/home/WearHomeActivity$14;-><init>(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)V

    invoke-virtual {v0, v1, v2}, Lo/dqi;->a(Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 1967
    :cond_1f
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->T:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportOneLevelMenu()Z

    move-result v0

    if-eqz v0, :cond_20

    .line 1968
    move-object/from16 v0, p0

    move-object/from16 v1, p0

    iget-boolean v1, v1, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->D:Z

    sget v2, Lcom/huawei/ui/homewear21/R$mipmap;->home_ic_list_one_level_menu:I

    move-object/from16 v3, p0

    iget-object v3, v3, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->t:Landroid/content/Context;

    sget v4, Lcom/huawei/ui/homewear21/R$string;->IDS_settings_one_level_menu_settings_title:I

    .line 1970
    invoke-virtual {v3, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    const-string v6, ""

    const-string v7, ""

    const/4 v3, 0x0

    new-array v8, v3, [Landroid/widget/CompoundButton$OnCheckedChangeListener;

    .line 1968
    const/16 v3, 0x1c

    const/4 v4, 0x3

    invoke-direct/range {v0 .. v8}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->e(ZIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 1975
    :cond_20
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->T:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isAuto_light_screen()Z

    move-result v0

    if-eqz v0, :cond_21

    .line 1976
    move-object/from16 v0, p0

    move-object/from16 v1, p0

    iget-boolean v1, v1, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->D:Z

    sget v2, Lcom/huawei/ui/homewear21/R$mipmap;->home_ic_list_awakescreen:I

    move-object/from16 v3, p0

    iget-object v3, v3, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->t:Landroid/content/Context;

    sget v4, Lcom/huawei/ui/homewear21/R$string;->IDS_settings_auto_light_item:I

    .line 1978
    invoke-virtual {v3, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    move-object/from16 v3, p0

    iget-object v3, v3, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->t:Landroid/content/Context;

    sget v4, Lcom/huawei/ui/homewear21/R$string;->IDS_btsetting_auto_light_message:I

    .line 1979
    invoke-virtual {v3, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v6

    const-string v7, ""

    const/4 v3, 0x1

    new-array v8, v3, [Landroid/widget/CompoundButton$OnCheckedChangeListener;

    move-object/from16 v3, p0

    iget-object v3, v3, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->aP:Landroid/widget/CompoundButton$OnCheckedChangeListener;

    const/4 v4, 0x0

    aput-object v3, v8, v4

    .line 1976
    const/16 v3, 0xb

    const/4 v4, 0x0

    invoke-direct/range {v0 .. v8}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->e(ZIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 1983
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->ax:Lo/dqi;

    const-string v1, "auto_light_screen"

    new-instance v2, Lcom/huawei/ui/homewear21/home/WearHomeActivity$12;

    move-object/from16 v3, p0

    invoke-direct {v2, v3}, Lcom/huawei/ui/homewear21/home/WearHomeActivity$12;-><init>(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)V

    invoke-virtual {v0, v1, v2}, Lo/dqi;->a(Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 2020
    :cond_21
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->T:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isRotate_switch_screen()Z

    move-result v0

    if-eqz v0, :cond_22

    .line 2021
    move-object/from16 v0, p0

    move-object/from16 v1, p0

    iget-boolean v1, v1, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->D:Z

    sget v2, Lcom/huawei/ui/homewear21/R$mipmap;->home_ic_list_switchscreen:I

    move-object/from16 v3, p0

    iget-object v3, v3, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->t:Landroid/content/Context;

    sget v4, Lcom/huawei/ui/homewear21/R$string;->IDS_settings_screen_switch:I

    .line 2023
    invoke-virtual {v3, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    const-string v6, ""

    const-string v7, ""

    const/4 v3, 0x1

    new-array v8, v3, [Landroid/widget/CompoundButton$OnCheckedChangeListener;

    move-object/from16 v3, p0

    iget-object v3, v3, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->aO:Landroid/widget/CompoundButton$OnCheckedChangeListener;

    const/4 v4, 0x0

    aput-object v3, v8, v4

    .line 2021
    const/16 v3, 0x19

    const/4 v4, 0x1

    invoke-direct/range {v0 .. v8}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->e(ZIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 2028
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->ax:Lo/dqi;

    const-string v1, "rotate_switch_screen"

    new-instance v2, Lcom/huawei/ui/homewear21/home/WearHomeActivity$13;

    move-object/from16 v3, p0

    invoke-direct {v2, v3}, Lcom/huawei/ui/homewear21/home/WearHomeActivity$13;-><init>(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)V

    invoke-virtual {v0, v1, v2}, Lo/dqi;->a(Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 2062
    :cond_22
    const-string v0, "WearHomeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter AW70 mode select"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2063
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->T:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportFootWear()Z

    move-result v0

    if-nez v0, :cond_23

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->T:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportAutoDetectMode()Z

    move-result v0

    if-nez v0, :cond_23

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->T:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportRunPosture()Z

    move-result v0

    if-eqz v0, :cond_25

    .line 2066
    :cond_23
    const/16 v17, 0x3

    .line 2067
    new-instance v18, Lo/dcy;

    invoke-direct/range {v18 .. v18}, Lo/dcy;-><init>()V

    .line 2068
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->T:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportRunPosture()Z

    move-result v0

    if-eqz v0, :cond_24

    .line 2069
    sget v0, Lcom/huawei/ui/homewear21/R$string;->IDS_aw_running_mode:I

    move-object/from16 v1, p0

    invoke-virtual {v1, v0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->getString(I)Ljava/lang/String;

    move-result-object v15

    .line 2070
    sget v0, Lcom/huawei/ui/homewear21/R$string;->IDS_aw_entrance_mode_select_subtitle:I

    move-object/from16 v1, p0

    invoke-virtual {v1, v0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->getString(I)Ljava/lang/String;

    move-result-object v16

    .line 2071
    const/16 v17, 0x7

    .line 2072
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->t:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "KEY_AW70_WARE_MODE"

    const-string v3, "RUNNING_MODE"

    move-object/from16 v4, v18

    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    goto :goto_4

    .line 2076
    :cond_24
    sget v0, Lcom/huawei/ui/homewear21/R$string;->IDS_aw_handring_mode:I

    move-object/from16 v1, p0

    invoke-virtual {v1, v0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->getString(I)Ljava/lang/String;

    move-result-object v15

    .line 2077
    const-string v16, ""

    .line 2078
    const/16 v17, 0x3

    .line 2079
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->t:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "KEY_AW70_WARE_MODE"

    const-string v3, "HANDRING_MODE"

    move-object/from16 v4, v18

    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 2082
    :goto_4
    move-object/from16 v0, p0

    move-object/from16 v1, p0

    iget-boolean v1, v1, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->D:Z

    sget v2, Lcom/huawei/ui/homewear21/R$mipmap;->ic_device_mode:I

    move/from16 v4, v17

    sget v3, Lcom/huawei/ui/homewear21/R$string;->IDS_aw_entrance_mode_select:I

    .line 2084
    move-object/from16 v5, p0

    invoke-virtual {v5, v3}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->getString(I)Ljava/lang/String;

    move-result-object v5

    move-object/from16 v6, v16

    move-object v7, v15

    const/4 v3, 0x0

    new-array v8, v3, [Landroid/widget/CompoundButton$OnCheckedChangeListener;

    .line 2082
    const/16 v3, 0x24

    invoke-direct/range {v0 .. v8}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->e(ZIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 2087
    const-string v0, "WearHomeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "After adding AW70 mode select item"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2093
    :cond_25
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->T:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportLeftRightHandWearMode()Z

    move-result v0

    if-eqz v0, :cond_26

    .line 2095
    move-object/from16 v0, p0

    move-object/from16 v1, p0

    iget-boolean v1, v1, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->D:Z

    sget v2, Lcom/huawei/ui/homewear21/R$mipmap;->ic_home_peidaifangshi:I

    move-object/from16 v3, p0

    iget-object v3, v3, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->t:Landroid/content/Context;

    sget v4, Lcom/huawei/ui/homewear21/R$string;->IDS_settings_wear_prefence:I

    .line 2097
    invoke-virtual {v3, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    const-string v6, ""

    move-object/from16 v3, p0

    iget-object v3, v3, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->t:Landroid/content/Context;

    sget v4, Lcom/huawei/ui/homewear21/R$string;->IDS_WearPrefenc_left:I

    .line 2098
    invoke-virtual {v3, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v7

    const/4 v3, 0x0

    new-array v8, v3, [Landroid/widget/CompoundButton$OnCheckedChangeListener;

    .line 2095
    const/16 v3, 0x1a

    const/4 v4, 0x3

    invoke-direct/range {v0 .. v8}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->e(ZIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 2100
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->ax:Lo/dqi;

    const-string v1, "left_or_right_hand_wear_status"

    new-instance v2, Lcom/huawei/ui/homewear21/home/WearHomeActivity$15;

    move-object/from16 v3, p0

    invoke-direct {v2, v3}, Lcom/huawei/ui/homewear21/home/WearHomeActivity$15;-><init>(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)V

    invoke-virtual {v0, v1, v2}, Lo/dqi;->a(Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 2135
    :cond_26
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->T:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isOta_update()Z

    move-result v0

    if-eqz v0, :cond_28

    if-nez v14, :cond_28

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->Q:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v0

    const/16 v1, 0xc

    if-eq v1, v0, :cond_28

    .line 2137
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->t:Landroid/content/Context;

    invoke-static {v0}, Lo/ene;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_27

    .line 2138
    move-object/from16 v0, p0

    move-object/from16 v1, p0

    iget-boolean v1, v1, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->D:Z

    sget v2, Lcom/huawei/ui/homewear21/R$mipmap;->home_ic_list_sync:I

    move-object/from16 v3, p0

    iget-object v3, v3, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->t:Landroid/content/Context;

    sget v4, Lcom/huawei/ui/homewear21/R$string;->IDS_wlan_auto_update_device_new:I

    .line 2140
    invoke-virtual {v3, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    const-string v6, ""

    const-string v7, ""

    const/4 v3, 0x1

    new-array v8, v3, [Landroid/widget/CompoundButton$OnCheckedChangeListener;

    move-object/from16 v3, p0

    iget-object v3, v3, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->aJ:Landroid/widget/CompoundButton$OnCheckedChangeListener;

    const/4 v4, 0x0

    aput-object v3, v8, v4

    .line 2138
    const/16 v3, 0x1e

    const/4 v4, 0x1

    invoke-direct/range {v0 .. v8}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->e(ZIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    goto :goto_5

    .line 2144
    :cond_27
    move-object/from16 v0, p0

    move-object/from16 v1, p0

    iget-boolean v1, v1, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->D:Z

    sget v2, Lcom/huawei/ui/homewear21/R$mipmap;->home_ic_list_sync:I

    move-object/from16 v3, p0

    iget-object v3, v3, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->t:Landroid/content/Context;

    sget v4, Lcom/huawei/ui/homewear21/R$string;->IDS_wlan_auto_update_device:I

    .line 2146
    invoke-virtual {v3, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    const-string v6, ""

    const-string v7, ""

    const/4 v3, 0x1

    new-array v8, v3, [Landroid/widget/CompoundButton$OnCheckedChangeListener;

    move-object/from16 v3, p0

    iget-object v3, v3, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->aJ:Landroid/widget/CompoundButton$OnCheckedChangeListener;

    const/4 v4, 0x0

    aput-object v3, v8, v4

    .line 2144
    const/16 v3, 0x1e

    const/4 v4, 0x1

    invoke-direct/range {v0 .. v8}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->e(ZIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 2152
    :goto_5
    const-string v0, "MainUI"

    const-string v1, "WearHomeActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "initData() getWLANAutoUpdate "

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2154
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->t:Landroid/content/Context;

    invoke-static {v0}, Lo/eob;->c(Landroid/content/Context;)Lo/eob;

    move-result-object v0

    invoke-virtual {v0}, Lo/eob;->b()V

    .line 2156
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dqi;->b(Landroid/content/Context;)Lo/dqi;

    move-result-object v0

    const-string v1, "wlan_auto_update"

    new-instance v2, Lcom/huawei/ui/homewear21/home/WearHomeActivity$16;

    move-object/from16 v3, p0

    invoke-direct {v2, v3}, Lcom/huawei/ui/homewear21/home/WearHomeActivity$16;-><init>(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)V

    invoke-virtual {v0, v1, v2}, Lo/dqi;->a(Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 2193
    :cond_28
    if-eqz v13, :cond_29

    .line 2194
    move-object/from16 v0, p0

    const-string v5, ""

    const-string v6, ""

    const-string v7, ""

    const/4 v1, 0x0

    new-array v8, v1, [Landroid/widget/CompoundButton$OnCheckedChangeListener;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/16 v3, -0x25c4

    const/4 v4, 0x5

    invoke-direct/range {v0 .. v8}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->e(ZIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 2209
    :cond_29
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->T:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupport_atrial_operator()Z

    move-result v0

    if-eqz v0, :cond_2a

    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-nez v0, :cond_2a

    invoke-static {}, Lo/dbf;->d()Z

    move-result v0

    if-eqz v0, :cond_2a

    .line 2210
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_2a

    .line 2212
    move-object/from16 v0, p0

    move-object/from16 v1, p0

    iget-boolean v1, v1, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->D:Z

    sget v2, Lcom/huawei/ui/homewear21/R$mipmap;->ic_heart_study:I

    move-object/from16 v3, p0

    iget-object v3, v3, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->t:Landroid/content/Context;

    sget v4, Lcom/huawei/ui/homewear21/R$string;->IDS_user_profile_health_of_heart:I

    .line 2214
    invoke-virtual {v3, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    const-string v6, ""

    const-string v7, ""

    const/4 v3, 0x0

    new-array v8, v3, [Landroid/widget/CompoundButton$OnCheckedChangeListener;

    .line 2212
    const/16 v3, 0x28

    const/4 v4, 0x3

    invoke-direct/range {v0 .. v8}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->e(ZIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 2220
    :cond_2a
    const/16 v0, 0x1d

    invoke-static {v0}, Lo/czd;->e(I)Z

    move-result v0

    if-eqz v0, :cond_2b

    .line 2221
    move-object/from16 v0, p0

    sget v2, Lcom/huawei/ui/homewear21/R$mipmap;->ic_drawer_huaweiclub:I

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->t:Landroid/content/Context;

    sget v3, Lcom/huawei/ui/homewear21/R$string;->IDS_main_discovery_tab_service_huawei_club:I

    .line 2223
    invoke-virtual {v1, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    const-string v6, ""

    const-string v7, ""

    const/4 v1, 0x0

    new-array v8, v1, [Landroid/widget/CompoundButton$OnCheckedChangeListener;

    .line 2221
    const/4 v1, 0x1

    const/16 v3, 0x1f

    const/4 v4, 0x3

    invoke-direct/range {v0 .. v8}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->e(ZIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 2228
    :cond_2b
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->T:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isOta_update()Z

    move-result v0

    if-eqz v0, :cond_2c

    .line 2229
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->w:Lo/enz;

    invoke-virtual {v0, v14}, Lo/enz;->b(Z)Z

    move-result v15

    .line 2230
    const-string v0, "MainUI"

    const-string v1, "WearHomeActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "initData() isNew = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v15}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, " isAw70 = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v14}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2231
    move-object/from16 v0, p0

    move-object/from16 v1, p0

    iget-boolean v1, v1, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->D:Z

    sget v2, Lcom/huawei/ui/homewear21/R$mipmap;->home_ic_list_deviceupdate:I

    move-object/from16 v3, p0

    iget-object v3, v3, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->t:Landroid/content/Context;

    sget v4, Lcom/huawei/ui/homewear21/R$string;->IDS_ota_update_band_update:I

    .line 2232
    invoke-virtual {v3, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    const-string v6, ""

    const-string v7, ""

    move v8, v15

    const/4 v3, 0x0

    new-array v9, v3, [Landroid/widget/CompoundButton$OnCheckedChangeListener;

    .line 2231
    const/16 v3, 0xd

    const/4 v4, 0x2

    invoke-direct/range {v0 .. v9}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->b(ZIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z[Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 2237
    :cond_2c
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->T:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isFactory_reset()Z

    move-result v0

    if-eqz v0, :cond_2d

    .line 2238
    move-object/from16 v0, p0

    move-object/from16 v1, p0

    iget-boolean v1, v1, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->D:Z

    sget v2, Lcom/huawei/ui/homewear21/R$mipmap;->home_ic_list_restore:I

    move-object/from16 v3, p0

    iget-object v3, v3, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->t:Landroid/content/Context;

    sget v4, Lcom/huawei/ui/homewear21/R$string;->IDS_settings_restore_factory_settings:I

    .line 2240
    invoke-virtual {v3, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    const-string v6, ""

    move-object v7, v11

    const/4 v3, 0x0

    new-array v8, v3, [Landroid/widget/CompoundButton$OnCheckedChangeListener;

    .line 2238
    const/16 v3, 0xe

    const/4 v4, 0x3

    invoke-direct/range {v0 .. v8}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->e(ZIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 2245
    :cond_2d
    const/16 v0, 0x24

    invoke-static {v0}, Lo/czd;->e(I)Z

    move-result v0

    if-eqz v0, :cond_2e

    .line 2246
    move-object/from16 v0, p0

    sget v2, Lcom/huawei/ui/homewear21/R$mipmap;->home_ic_list_hotline:I

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->t:Landroid/content/Context;

    sget v3, Lcom/huawei/ui/homewear21/R$string;->IDS_settings_service_call_item:I

    .line 2248
    invoke-virtual {v1, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    const-string v6, ""

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->t:Landroid/content/Context;

    sget v3, Lcom/huawei/ui/homewear21/R$string;->IDS_main_sns_member_service_call_number_item_3:I

    .line 2250
    invoke-virtual {v1, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v7

    const/4 v1, 0x0

    new-array v8, v1, [Landroid/widget/CompoundButton$OnCheckedChangeListener;

    .line 2246
    const/4 v1, 0x1

    const/16 v3, 0x1d

    const/4 v4, 0x3

    invoke-direct/range {v0 .. v8}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->e(ZIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 2252
    :cond_2e
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->Q:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2f

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->Q:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getAutoDetectSwitchStatus()I

    move-result v0

    .line 2271
    :cond_2f
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->T:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportGPSPostProcessing()Z

    move-result v0

    if-eqz v0, :cond_30

    invoke-static {}, Lo/dbf;->f()Z

    move-result v0

    if-eqz v0, :cond_30

    .line 2272
    move-object/from16 v0, p0

    move-object/from16 v1, p0

    iget-boolean v1, v1, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->D:Z

    sget v2, Lcom/huawei/ui/homewear21/R$mipmap;->home_ic_list_gpsfile:I

    move-object/from16 v3, p0

    iget-object v3, v3, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->t:Landroid/content/Context;

    sget v4, Lcom/huawei/ui/homewear21/R$string;->IDS_settings_GPS_files_switch:I

    .line 2274
    invoke-virtual {v3, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    const-string v6, ""

    const-string v7, ""

    const/4 v3, 0x1

    new-array v8, v3, [Landroid/widget/CompoundButton$OnCheckedChangeListener;

    move-object/from16 v3, p0

    iget-object v3, v3, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->aM:Landroid/widget/CompoundButton$OnCheckedChangeListener;

    const/4 v4, 0x0

    aput-object v3, v8, v4

    .line 2272
    const/16 v3, 0x27

    const/4 v4, 0x1

    invoke-direct/range {v0 .. v8}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->e(ZIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 2278
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dqi;->b(Landroid/content/Context;)Lo/dqi;

    move-result-object v0

    const-string v1, "gps_files_switch_screen"

    new-instance v2, Lcom/huawei/ui/homewear21/home/WearHomeActivity$18;

    move-object/from16 v3, p0

    invoke-direct {v2, v3}, Lcom/huawei/ui/homewear21/home/WearHomeActivity$18;-><init>(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)V

    invoke-virtual {v0, v1, v2}, Lo/dqi;->a(Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 2305
    :cond_30
    return-void
.end method

.method static synthetic x(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)V
    .locals 0

    .line 232
    invoke-direct {p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->j()V

    return-void
.end method

.method private y()V
    .locals 5

    .line 1336
    const-string v0, "MainUI"

    const-string v1, "WearHomeActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Enter initData"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1339
    invoke-static {}, Lo/etw;->d()Lo/etw;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->af:Lo/etw;

    .line 1340
    new-instance v0, Lo/fip;

    invoke-direct {v0}, Lo/fip;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->O:Lo/fip;

    .line 1341
    invoke-direct {p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->Z()V

    .line 1343
    invoke-direct {p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->ag()V

    .line 1344
    invoke-direct {p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->ae()V

    .line 1345
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->c(I)V

    .line 1347
    invoke-direct {p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->ak()V

    .line 1349
    invoke-direct {p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->aL()V

    .line 1351
    invoke-direct {p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->ar()V

    .line 1353
    invoke-direct {p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->ao()V

    .line 1355
    invoke-direct {p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->an()V

    .line 1357
    invoke-direct {p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->at()V

    .line 1359
    invoke-direct {p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->ab()V

    .line 1360
    invoke-direct {p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->ax()V

    .line 1362
    invoke-direct {p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->aA()V

    .line 1373
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->u:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/fhq;->d(Landroid/content/Context;)Lo/fhq;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->a:Lo/fhq;

    .line 1374
    new-instance v0, Lo/eog;

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->u:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/eog;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->aB:Lo/eog;

    .line 1375
    invoke-direct {p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->aw()V

    .line 1376
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->aQ:Landroid/os/Handler;

    const/16 v1, 0x3f2

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 1379
    return-void
.end method

.method static synthetic y(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)V
    .locals 0

    .line 232
    invoke-direct {p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->E()V

    return-void
.end method

.method private z()V
    .locals 2

    .line 2373
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->Q:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 2374
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->Q:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->X:Ljava/lang/String;

    .line 2376
    :cond_0
    return-void
.end method

.method static synthetic z(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)V
    .locals 0

    .line 232
    invoke-direct {p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->C()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 7

    .line 3931
    const-string v0, "MainUI"

    const-string v1, "WearHomeActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "enter showRestoreFactoryDialog()"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 3933
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->u:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homewear21/R$string;->IDS_unbind_device_wear_home:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v5

    .line 3934
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->aa:Lo/egv;

    if-nez v0, :cond_0

    .line 3936
    new-instance v0, Lo/egv$b;

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->u:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/egv$b;-><init>(Landroid/content/Context;)V

    sget v1, Lcom/huawei/ui/homewear21/R$string;->IDS_hw_health_wear_connect_device_unpair_button:I

    .line 3937
    invoke-virtual {v0, v1}, Lo/egv$b;->b(I)Lo/egv$b;

    move-result-object v0

    .line 3938
    invoke-virtual {v0, v5}, Lo/egv$b;->b(Ljava/lang/String;)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homewear21/R$string;->IDS_hw_health_wear_connect_device_unpair_button:I

    new-instance v2, Lcom/huawei/ui/homewear21/home/WearHomeActivity$36;

    invoke-direct {v2, p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity$36;-><init>(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)V

    .line 3939
    invoke-virtual {v0, v1, v2}, Lo/egv$b;->e(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homewear21/R$string;->IDS_settings_button_cancal:I

    new-instance v2, Lcom/huawei/ui/homewear21/home/WearHomeActivity$39;

    invoke-direct {v2, p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity$39;-><init>(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)V

    .line 3950
    invoke-virtual {v0, v1, v2}, Lo/egv$b;->b(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    move-result-object v6

    .line 3958
    invoke-virtual {v6}, Lo/egv$b;->b()Lo/egv;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->aa:Lo/egv;

    .line 3959
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->aa:Lo/egv;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egv;->setCancelable(Z)V

    .line 3960
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->aa:Lo/egv;

    invoke-virtual {v0}, Lo/egv;->show()V

    .line 3962
    :cond_0
    return-void
.end method

.method protected a(ILjava/lang/String;)V
    .locals 5

    .line 6360
    invoke-virtual {p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 6362
    new-instance v2, Lo/egv$b;

    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->u:Landroid/content/Context;

    invoke-direct {v2, v0}, Lo/egv$b;-><init>(Landroid/content/Context;)V

    .line 6363
    sget v0, Lcom/huawei/ui/homewear21/R$string;->IDS_service_area_notice_title:I

    invoke-virtual {v2, v0}, Lo/egv$b;->b(I)Lo/egv$b;

    .line 6364
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->u:Landroid/content/Context;

    invoke-virtual {v0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    .line 6365
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lo/egv$b;->b(Ljava/lang/String;)Lo/egv$b;

    .line 6366
    sget v0, Lcom/huawei/ui/homewear21/R$string;->IDS_settings_button_ok:I

    new-instance v1, Lcom/huawei/ui/homewear21/home/WearHomeActivity$68;

    invoke-direct {v1, p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity$68;-><init>(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)V

    invoke-virtual {v2, v0, v1}, Lo/egv$b;->e(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    .line 6372
    invoke-virtual {v2}, Lo/egv$b;->b()Lo/egv;

    move-result-object v4

    .line 6373
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Lo/egv;->setCancelable(Z)V

    .line 6374
    invoke-virtual {v4}, Lo/egv;->isShowing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 6375
    invoke-virtual {v4}, Lo/egv;->show()V

    .line 6378
    :cond_0
    return-void
.end method

.method public b()V
    .locals 5

    .line 4554
    invoke-virtual {p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->ab:Lo/egn;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 4555
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->ab:Lo/egn;

    invoke-virtual {v0}, Lo/egn;->cancel()V

    .line 4556
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->ab:Lo/egn;

    .line 4557
    const-string v0, "MainUI"

    const-string v1, "WearHomeActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "destroy mLoadingDialog21"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 4559
    :cond_0
    return-void
.end method

.method public b(I)V
    .locals 5

    .line 6767
    const-string v0, "WearHomeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter showOverSeaDialog"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 6768
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->br:Lo/egv;

    if-eqz v0, :cond_0

    .line 6769
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->br:Lo/egv;

    invoke-virtual {v0}, Lo/egv;->cancel()V

    .line 6771
    :cond_0
    new-instance v4, Lo/egv$b;

    invoke-direct {v4, p0}, Lo/egv$b;-><init>(Landroid/content/Context;)V

    .line 6772
    sget v0, Lcom/huawei/ui/homewear21/R$string;->IDS_service_area_notice_title:I

    invoke-virtual {v4, v0}, Lo/egv$b;->b(I)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homewear21/R$string;->IDS_device_download_resoure_tip_content_message_new:I

    .line 6773
    invoke-virtual {v0, v1}, Lo/egv$b;->e(I)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homewear21/R$string;->IDS_hwh_open_service_pop_up_notification_agree:I

    new-instance v2, Lcom/huawei/ui/homewear21/home/WearHomeActivity$78;

    invoke-direct {v2, p0, p1}, Lcom/huawei/ui/homewear21/home/WearHomeActivity$78;-><init>(Lcom/huawei/ui/homewear21/home/WearHomeActivity;I)V

    .line 6774
    invoke-virtual {v0, v1, v2}, Lo/egv$b;->e(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homewear21/R$string;->IDS_settings_button_cancal:I

    new-instance v2, Lcom/huawei/ui/homewear21/home/WearHomeActivity$77;

    invoke-direct {v2, p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity$77;-><init>(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)V

    .line 6796
    invoke-virtual {v0, v1, v2}, Lo/egv$b;->b(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    .line 6808
    invoke-virtual {v4}, Lo/egv$b;->b()Lo/egv;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->br:Lo/egv;

    .line 6809
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->br:Lo/egv;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egv;->setCancelable(Z)V

    .line 6810
    invoke-virtual {p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_1

    .line 6811
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->br:Lo/egv;

    invoke-virtual {v0}, Lo/egv;->show()V

    .line 6813
    :cond_1
    const-string v0, "WearHomeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "end showOverSeaDialog"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 6814
    return-void
.end method

.method protected b(Ljava/lang/Class;I)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/Class<*>;I)V"
        }
    .end annotation

    .line 2905
    new-instance v2, Landroid/content/Intent;

    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->u:Landroid/content/Context;

    invoke-direct {v2, v0, p1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 2906
    const-string v0, "device_id"

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->X:Ljava/lang/String;

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 2907
    invoke-virtual {p0, v2, p2}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 2908
    return-void
.end method

.method public c()V
    .locals 5

    .line 2972
    const-string v0, "MainUI"

    const-string v1, "WearHomeActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "getGoldCard()"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2973
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->ac:Lo/eoe;

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->aQ:Landroid/os/Handler;

    iget-object v2, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->u:Landroid/content/Context;

    invoke-virtual {v0, v1, v2}, Lo/eoe;->e(Landroid/os/Handler;Landroid/content/Context;)V

    .line 2974
    return-void
.end method

.method public c(II)V
    .locals 5

    .line 5887
    new-instance v0, Lo/egv$b;

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->u:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/egv$b;-><init>(Landroid/content/Context;)V

    sget v1, Lcom/huawei/ui/homewear21/R$string;->IDS_device_replace_dialog_title_notification:I

    .line 5888
    invoke-virtual {v0, v1}, Lo/egv$b;->b(I)Lo/egv$b;

    move-result-object v0

    .line 5889
    invoke-virtual {v0, p1}, Lo/egv$b;->e(I)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homewear21/R$string;->IDS_settings_button_ok:I

    new-instance v2, Lcom/huawei/ui/homewear21/home/WearHomeActivity$61;

    invoke-direct {v2, p0, p2}, Lcom/huawei/ui/homewear21/home/WearHomeActivity$61;-><init>(Lcom/huawei/ui/homewear21/home/WearHomeActivity;I)V

    .line 5890
    invoke-virtual {v0, v1, v2}, Lo/egv$b;->e(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homewear21/R$string;->IDS_settings_button_cancal:I

    new-instance v2, Lcom/huawei/ui/homewear21/home/WearHomeActivity$60;

    invoke-direct {v2, p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity$60;-><init>(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)V

    .line 5911
    invoke-virtual {v0, v1, v2}, Lo/egv$b;->b(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    move-result-object v3

    .line 5916
    invoke-virtual {v3}, Lo/egv$b;->b()Lo/egv;

    move-result-object v4

    .line 5917
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Lo/egv;->setCancelable(Z)V

    .line 5918
    invoke-virtual {v4}, Lo/egv;->isShowing()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 5919
    invoke-virtual {v4}, Lo/egv;->show()V

    .line 5921
    :cond_0
    return-void
.end method

.method public c(Landroid/widget/ListView;Lo/eos;)V
    .locals 6

    .line 2936
    if-eqz p1, :cond_0

    if-nez p2, :cond_1

    :cond_0
    return-void

    .line 2937
    :cond_1
    const/4 v3, 0x0

    .line 2938
    const/4 v4, 0x0

    :goto_0
    invoke-virtual {p2}, Lo/eos;->getCount()I

    move-result v0

    if-ge v4, v0, :cond_2

    .line 2939
    const/4 v0, 0x0

    invoke-virtual {p2, v4, v0, p1}, Lo/eos;->getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v5

    .line 2940
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-virtual {v5, v0, v1}, Landroid/view/View;->measure(II)V

    .line 2941
    invoke-virtual {v5}, Landroid/view/View;->getMeasuredHeight()I

    move-result v0

    add-int/2addr v3, v0

    .line 2938
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 2943
    :cond_2
    invoke-virtual {p1}, Landroid/widget/ListView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v4

    .line 2944
    invoke-virtual {p1}, Landroid/widget/ListView;->getDividerHeight()I

    move-result v0

    invoke-virtual {p2}, Lo/eos;->getCount()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    mul-int/2addr v0, v1

    add-int/2addr v0, v3

    iput v0, v4, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 2945
    invoke-virtual {p1, v4}, Landroid/widget/ListView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 2946
    return-void
.end method

.method public c(Z)V
    .locals 9

    .line 3416
    const-string v0, "MainUI"

    const-string v1, "WearHomeActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "setBandRedTip isRedTip= "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 3417
    iget-object v5, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->aq:Ljava/lang/Object;

    monitor-enter v5

    .line 3418
    :try_start_0
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->V:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lo/eoq;

    .line 3419
    invoke-virtual {v7}, Lo/eoq;->c()I

    move-result v0

    const/16 v1, 0xd

    if-ne v0, v1, :cond_1

    .line 3420
    if-eqz p1, :cond_0

    .line 3421
    const/4 v0, 0x1

    invoke-virtual {v7, v0}, Lo/eoq;->c(Z)V

    goto :goto_1

    .line 3423
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {v7, v0}, Lo/eoq;->c(Z)V

    .line 3426
    :cond_1
    :goto_1
    invoke-direct {p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->F()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3427
    goto :goto_0

    .line 3428
    :cond_2
    monitor-exit v5

    goto :goto_2

    :catchall_0
    move-exception v8

    monitor-exit v5

    throw v8

    .line 3430
    :goto_2
    return-void
.end method

.method public d()V
    .locals 7

    .line 2415
    const-string v0, "MainUI"

    const-string v1, "WearHomeActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "enterUpdateActivity"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2416
    new-instance v5, Landroid/content/Intent;

    invoke-direct {v5}, Landroid/content/Intent;-><init>()V

    .line 2418
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->u:Landroid/content/Context;

    const-class v1, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 2419
    const-string v0, "device_id"

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->X:Ljava/lang/String;

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 2420
    invoke-virtual {p0, v5}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->startActivity(Landroid/content/Intent;)V

    .line 2422
    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    .line 2423
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    sget-object v2, Lo/dae;->is:Lo/dae;

    invoke-virtual {v2}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v6, v3}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 2424
    return-void
.end method

.method public d(I)V
    .locals 6

    .line 6735
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-nez v0, :cond_0

    .line 6736
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dde;->d(Landroid/content/Context;)Lo/dde;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/dde;->c(I)V

    goto/16 :goto_0

    .line 6739
    :cond_0
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0x2718

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "oversea_user_agreed"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 6741
    const-string v0, "WearHomeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "wear device plugin download is user agreed :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 6742
    const-string v0, "true"

    invoke-static {v4, v0}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 6744
    sget-object v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->am:Ljava/util/concurrent/ExecutorService;

    if-eqz v0, :cond_2

    sget-object v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->am:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->isShutdown()Z

    move-result v0

    if-nez v0, :cond_2

    .line 6745
    sget-object v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->am:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/huawei/ui/homewear21/home/WearHomeActivity$80;

    invoke-direct {v1, p0, p1}, Lcom/huawei/ui/homewear21/home/WearHomeActivity$80;-><init>(Lcom/huawei/ui/homewear21/home/WearHomeActivity;I)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    goto :goto_0

    .line 6754
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->aQ:Landroid/os/Handler;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 6755
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v5

    .line 6756
    const/16 v0, 0x401

    iput v0, v5, Landroid/os/Message;->what:I

    .line 6757
    iput p1, v5, Landroid/os/Message;->arg1:I

    .line 6758
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->aQ:Landroid/os/Handler;

    invoke-virtual {v0, v5}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 6762
    :cond_2
    :goto_0
    return-void
.end method

.method protected d(Ljava/lang/Class;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/Class<*>;)V"
        }
    .end annotation

    .line 2893
    new-instance v1, Landroid/content/Intent;

    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->u:Landroid/content/Context;

    invoke-direct {v1, v0, p1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 2894
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->u:Landroid/content/Context;

    invoke-virtual {v0, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 2895
    return-void
.end method

.method protected d(Ljava/lang/String;)V
    .locals 4

    .line 6380
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->bj:Lo/egv;

    if-eqz v0, :cond_0

    .line 6381
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->bj:Lo/egv;

    invoke-virtual {v0}, Lo/egv;->cancel()V

    .line 6383
    :cond_0
    new-instance v0, Lo/egv$b;

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->u:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/egv$b;-><init>(Landroid/content/Context;)V

    sget v1, Lcom/huawei/ui/homewear21/R$string;->IDS_hwh_open_service_pop_up_notification_note:I

    .line 6384
    invoke-virtual {v0, v1}, Lo/egv$b;->b(I)Lo/egv$b;

    move-result-object v0

    .line 6385
    invoke-virtual {v0, p1}, Lo/egv$b;->b(Ljava/lang/String;)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homewear21/R$string;->IDS_apphelp_pwindows_continue_button:I

    new-instance v2, Lcom/huawei/ui/homewear21/home/WearHomeActivity$66;

    invoke-direct {v2, p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity$66;-><init>(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)V

    .line 6386
    invoke-virtual {v0, v1, v2}, Lo/egv$b;->e(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homewear21/R$string;->IDS_settings_button_cancal:I

    new-instance v2, Lcom/huawei/ui/homewear21/home/WearHomeActivity$70;

    invoke-direct {v2, p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity$70;-><init>(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)V

    .line 6406
    invoke-virtual {v0, v1, v2}, Lo/egv$b;->b(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    move-result-object v3

    .line 6416
    invoke-virtual {v3}, Lo/egv$b;->b()Lo/egv;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->bj:Lo/egv;

    .line 6417
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->bj:Lo/egv;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egv;->setCancelable(Z)V

    .line 6418
    invoke-virtual {p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_1

    .line 6419
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->bj:Lo/egv;

    invoke-virtual {v0}, Lo/egv;->show()V

    .line 6421
    :cond_1
    return-void
.end method

.method public varargs d([Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;)V
    .locals 10

    .line 3686
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->u:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homewear21/R$string;->IDS_app_name:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 3687
    const/4 v5, 0x0

    .line 3688
    move-object v6, p1

    array-length v7, v6

    const/4 v8, 0x0

    :goto_0
    if-ge v8, v7, :cond_0

    aget-object v9, v6, v8

    .line 3689
    const-string v0, "WearHomeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter no deviceInfo"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3690
    const/4 v0, 0x0

    aget-object v5, p1, v0

    .line 3688
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    .line 3692
    :cond_0
    const/4 v0, 0x0

    if-ne v0, v5, :cond_1

    .line 3693
    invoke-static {}, Lo/etq;->d()Lo/etq;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->X:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/etq;->a(Ljava/lang/String;)Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v5

    .line 3695
    :cond_1
    const/4 v0, 0x0

    if-eq v0, v5, :cond_3

    .line 3696
    invoke-virtual {v5}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 3697
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->u:Landroid/content/Context;

    invoke-static {v0}, Lo/env;->d(Landroid/content/Context;)Lo/env;

    move-result-object v0

    invoke-virtual {v5}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v1

    invoke-virtual {v0, v1}, Lo/env;->a(I)Ljava/lang/String;

    move-result-object v4

    goto :goto_1

    .line 3699
    :cond_2
    invoke-virtual {v5}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceName()Ljava/lang/String;

    move-result-object v4

    .line 3703
    :cond_3
    :goto_1
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_4

    const-string v0, "HUAWEI CM-R1P"

    invoke-virtual {v4, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 3704
    const-string v0, "HUAWEI CM-R1P"

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    invoke-virtual {v4, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v4

    .line 3707
    :cond_4
    const-string v0, "WearHomeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "title:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3708
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->ay:Lo/emr;

    invoke-virtual {v0, v4}, Lo/emr;->setTitleText(Ljava/lang/String;)V

    .line 3709
    return-void
.end method

.method public e()V
    .locals 9

    .line 3878
    const-string v0, "MainUI"

    const-string v1, "WearHomeActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "enter showRestoreFactoryDialog()"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 3879
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->t:Landroid/content/Context;

    invoke-static {v0}, Lo/env;->d(Landroid/content/Context;)Lo/env;

    move-result-object v5

    .line 3881
    invoke-static {}, Lo/etq;->d()Lo/etq;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->X:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/etq;->a(Ljava/lang/String;)Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->Q:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    .line 3882
    invoke-direct {p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->z()V

    .line 3884
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->Q:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v6

    .line 3885
    const-string v0, "MainUI"

    const-string v1, "WearHomeActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "currentDeviceType = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 3886
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->t:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/homewear21/R$string;->IDS_settings_restore_factory_prompt:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    .line 3887
    invoke-virtual {v5, v6}, Lo/env;->a(I)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    .line 3886
    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    .line 3888
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->Q:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    const/16 v0, 0xb

    if-ne v0, v6, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->Q:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "HUAWEI CM-R1P"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3889
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->t:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/homewear21/R$string;->IDS_settings_restore_factory_prompt:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->u:Landroid/content/Context;

    sget v4, Lcom/huawei/ui/homewear21/R$string;->IDS_huawei_r1_pro_content:I

    .line 3890
    invoke-virtual {v3, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    .line 3889
    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    .line 3892
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->Y:Lo/egv;

    if-nez v0, :cond_1

    .line 3894
    new-instance v0, Lo/egv$b;

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->u:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/egv$b;-><init>(Landroid/content/Context;)V

    sget v1, Lcom/huawei/ui/homewear21/R$string;->IDS_settings_restore_factory_settings:I

    .line 3895
    invoke-virtual {v0, v1}, Lo/egv$b;->b(I)Lo/egv$b;

    move-result-object v0

    .line 3896
    invoke-virtual {v0, v7}, Lo/egv$b;->b(Ljava/lang/String;)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homewear21/R$string;->IDS_plugin_menu_reset:I

    new-instance v2, Lcom/huawei/ui/homewear21/home/WearHomeActivity$34;

    invoke-direct {v2, p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity$34;-><init>(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)V

    .line 3897
    invoke-virtual {v0, v1, v2}, Lo/egv$b;->e(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homewear21/R$string;->IDS_settings_button_cancal:I

    new-instance v2, Lcom/huawei/ui/homewear21/home/WearHomeActivity$35;

    invoke-direct {v2, p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity$35;-><init>(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)V

    .line 3912
    invoke-virtual {v0, v1, v2}, Lo/egv$b;->b(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    move-result-object v8

    .line 3920
    invoke-virtual {v8}, Lo/egv$b;->b()Lo/egv;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->Y:Lo/egv;

    .line 3921
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->Y:Lo/egv;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egv;->setCancelable(Z)V

    .line 3922
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->Y:Lo/egv;

    invoke-virtual {v0}, Lo/egv;->show()V

    .line 3924
    :cond_1
    return-void
.end method

.method public g()V
    .locals 5

    .line 4841
    invoke-virtual {p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->Y:Lo/egv;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 4842
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->Y:Lo/egv;

    invoke-virtual {v0}, Lo/egv;->cancel()V

    .line 4843
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->Y:Lo/egv;

    .line 4844
    const-string v0, "MainUI"

    const-string v1, "WearHomeActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "destroy RestoreFactoryDialog"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 4846
    :cond_0
    return-void
.end method

.method public i()V
    .locals 5

    .line 4790
    const-string v0, "MainUI"

    const-string v1, "WearHomeActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "handlePhoneServiceBindSuccess()"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 4793
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->c:Landroid/widget/ImageView;

    if-nez v0, :cond_0

    .line 4794
    const-string v0, "WearHomeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handlePhoneServiceBindSuccess if (mCurrentDeviceBand == null)"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4795
    return-void

    .line 4797
    :cond_0
    const-string v0, "WearHomeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "dataSync 3"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4799
    return-void
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 8

    .line 5094
    const-string v0, "MainUI"

    const-string v1, "WearHomeActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Enter onActivityResult requestcode:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, ";resultcode:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 5095
    invoke-super {p0, p1, p2, p3}, Lcom/huawei/ui/commonui/base/BaseActivity;->onActivityResult(IILandroid/content/Intent;)V

    .line 5096
    const-string v0, "MainUI"

    const-string v1, "WearHomeActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Enter onActivityResult"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 5097
    sparse-switch p1, :sswitch_data_0

    goto/16 :goto_0

    .line 5099
    :sswitch_0
    invoke-direct {p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->ad()V

    .line 5100
    goto/16 :goto_1

    .line 5110
    :sswitch_1
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->ax:Lo/dqi;

    const-string v1, "weather_switch_status"

    new-instance v2, Lcom/huawei/ui/homewear21/home/WearHomeActivity$50;

    invoke-direct {v2, p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity$50;-><init>(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)V

    invoke-virtual {v0, v1, v2}, Lo/dqi;->a(Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 5140
    goto/16 :goto_1

    .line 5150
    :sswitch_2
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->ax:Lo/dqi;

    const-string v1, "left_or_right_hand_wear_status"

    new-instance v2, Lcom/huawei/ui/homewear21/home/WearHomeActivity$48;

    invoke-direct {v2, p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity$48;-><init>(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)V

    invoke-virtual {v0, v1, v2}, Lo/dqi;->a(Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 5177
    goto/16 :goto_1

    .line 5179
    :sswitch_3
    const/4 v0, -0x1

    if-eq p2, v0, :cond_0

    .line 5180
    return-void

    .line 5182
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->w:Lo/enz;

    const-string v0, "status"

    invoke-virtual {p3, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 5183
    const-string v0, "MainUI"

    const-string v1, "WearHomeActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "coreSleepButton:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 5184
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->w:Lo/enz;

    const-string v0, "0"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 5185
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->V:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->t:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/homewear21/R$string;->IDS_status_disabled:I

    .line 5186
    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 5185
    const/16 v2, 0x17

    invoke-direct {p0, v2, v0, v1}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->e(ILjava/util/ArrayList;Ljava/lang/String;)V

    goto/16 :goto_1

    .line 5188
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->V:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->t:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/homewear21/R$string;->IDS_status_enabled:I

    .line 5189
    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 5188
    const/16 v2, 0x17

    invoke-direct {p0, v2, v0, v1}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->e(ILjava/util/ArrayList;Ljava/lang/String;)V

    .line 5192
    goto/16 :goto_1

    .line 5194
    :sswitch_4
    const/4 v0, -0x1

    if-eq p2, v0, :cond_2

    .line 5195
    return-void

    .line 5197
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->w:Lo/enz;

    const-string v0, "status"

    invoke-virtual {p3, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 5198
    const-string v0, "MainUI"

    const-string v1, "WearHomeActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "coreSleepButton:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 5199
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->w:Lo/enz;

    const-string v0, "0"

    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 5200
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->V:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->t:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/homewear21/R$string;->IDS_status_disabled:I

    .line 5201
    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 5200
    const/16 v2, 0x26

    invoke-direct {p0, v2, v0, v1}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->e(ILjava/util/ArrayList;Ljava/lang/String;)V

    goto/16 :goto_1

    .line 5203
    :cond_3
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->V:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->t:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/homewear21/R$string;->IDS_status_enabled:I

    .line 5204
    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 5203
    const/16 v2, 0x26

    invoke-direct {p0, v2, v0, v1}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->e(ILjava/util/ArrayList;Ljava/lang/String;)V

    .line 5206
    goto/16 :goto_1

    .line 5208
    :sswitch_5
    const-string v0, "MainUI"

    const-string v1, "WearHomeActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Enter checkGpsPermission 1"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 5209
    invoke-direct {p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->aE()V

    .line 5210
    goto/16 :goto_1

    .line 5212
    :sswitch_6
    const-string v0, "MainUI"

    const-string v1, "WearHomeActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Enter checkGpsPermission 2"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 5213
    invoke-direct {p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->aE()V

    .line 5215
    goto/16 :goto_1

    .line 5217
    :sswitch_7
    const/4 v0, -0x1

    if-eq p2, v0, :cond_4

    .line 5218
    return-void

    .line 5220
    :cond_4
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->w:Lo/enz;

    const-string v0, "status"

    invoke-virtual {p3, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 5221
    const-string v0, "MainUI"

    const-string v1, "WearHomeActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "heartRateButton:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 5222
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->w:Lo/enz;

    const-string v0, "0"

    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 5223
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->V:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->t:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/homewear21/R$string;->IDS_status_disabled:I

    .line 5224
    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 5223
    const/16 v2, 0x18

    invoke-direct {p0, v2, v0, v1}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->e(ILjava/util/ArrayList;Ljava/lang/String;)V

    goto :goto_1

    .line 5226
    :cond_5
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->V:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->t:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/homewear21/R$string;->IDS_status_enabled:I

    .line 5227
    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 5226
    const/16 v2, 0x18

    invoke-direct {p0, v2, v0, v1}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->e(ILjava/util/ArrayList;Ljava/lang/String;)V

    .line 5229
    goto :goto_1

    .line 5232
    :sswitch_8
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->ax:Lo/dqi;

    const-string v1, "press_auto_monitor_switch_status"

    new-instance v2, Lcom/huawei/ui/homewear21/home/WearHomeActivity$49;

    invoke-direct {v2, p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity$49;-><init>(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)V

    invoke-virtual {v0, v1, v2}, Lo/dqi;->a(Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 5261
    goto :goto_1

    .line 5263
    :sswitch_9
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->ax:Lo/dqi;

    const-string v1, "continue_heart_rate"

    new-instance v2, Lcom/huawei/ui/homewear21/home/WearHomeActivity$47;

    invoke-direct {v2, p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity$47;-><init>(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)V

    invoke-virtual {v0, v1, v2}, Lo/dqi;->a(Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 5290
    goto :goto_1

    .line 5292
    :sswitch_a
    const/4 v0, -0x1

    if-eq p2, v0, :cond_6

    .line 5293
    return-void

    .line 5295
    :cond_6
    const-string v0, "WearHomeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ready reconnect double phone"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 5296
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->aQ:Landroid/os/Handler;

    const/16 v1, 0x403

    const-wide/16 v2, 0x7d0

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 5297
    goto :goto_1

    .line 5299
    :goto_0
    const-string v0, "MainUI"

    const-string v1, "WearHomeActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Enter onActivityResult default"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 5302
    :goto_1
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x5 -> :sswitch_0
        0x7 -> :sswitch_1
        0x17 -> :sswitch_3
        0x18 -> :sswitch_7
        0x1a -> :sswitch_2
        0x23 -> :sswitch_9
        0x25 -> :sswitch_a
        0x26 -> :sswitch_4
        0x65 -> :sswitch_5
        0x66 -> :sswitch_6
        0x149 -> :sswitch_8
    .end sparse-switch
.end method

.method public onBackPressed()V
    .locals 5

    .line 5042
    const-string v0, "MainUI"

    const-string v1, "WearHomeActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "onBackPressed isFromWear"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-boolean v4, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->az:Z

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 5043
    const-string v0, "WearHomeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onBackPressed isFromWear"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->az:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 5044
    iget-boolean v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->az:Z

    if-eqz v0, :cond_0

    .line 5045
    invoke-direct {p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->aj()V

    .line 5047
    :cond_0
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onBackPressed()V

    .line 5048
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 9

    .line 500
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 501
    const-string v0, "MainUI"

    const-string v1, "WearHomeActivity"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Enter onCreateView time:"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 502
    sget v0, Lcom/huawei/ui/homewear21/R$layout;->fragment_main_home_21:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->setContentView(I)V

    .line 503
    const/4 v0, 0x1

    sput-boolean v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->ai:Z

    .line 504
    iput-object p0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->u:Landroid/content/Context;

    .line 505
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->t:Landroid/content/Context;

    .line 506
    new-instance v0, Lo/eoi;

    invoke-direct {v0}, Lo/eoi;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->aA:Lo/eoi;

    .line 507
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->s:Landroid/support/v4/content/LocalBroadcastManager;

    .line 508
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->t:Landroid/content/Context;

    invoke-static {v0}, Lo/enz;->b(Landroid/content/Context;)Lo/enz;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->w:Lo/enz;

    .line 509
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->t:Landroid/content/Context;

    invoke-static {v0}, Lo/dqi;->b(Landroid/content/Context;)Lo/dqi;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->ax:Lo/dqi;

    .line 510
    invoke-static {}, Lo/etu;->b()Lo/etu;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->A:Lo/etu;

    .line 511
    new-instance v0, Lo/fcb;

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->t:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/fcb;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->z:Lo/fcb;

    .line 512
    new-instance v0, Lo/eoa;

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->t:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/eoa;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->j:Lo/eoa;

    .line 513
    invoke-static {}, Lo/dip;->d()Lo/dip;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->aF:Lo/dip;

    .line 514
    new-instance v0, Lcom/huawei/lcagent/client/LogCollectManager;

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->t:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/huawei/lcagent/client/LogCollectManager;-><init>(Landroid/content/Context;)V

    sput-object v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->aC:Lcom/huawei/lcagent/client/LogCollectManager;

    .line 516
    invoke-virtual {p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->getIntent()Landroid/content/Intent;

    move-result-object v5

    .line 517
    const/4 v0, 0x0

    if-eq v0, v5, :cond_2

    .line 518
    const-string v0, "device_id"

    invoke-virtual {v5, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->X:Ljava/lang/String;

    .line 519
    invoke-static {}, Lo/etq;->d()Lo/etq;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->X:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/etq;->a(Ljava/lang/String;)Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->Q:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    .line 520
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->u:Landroid/content/Context;

    invoke-static {v0}, Lo/dde;->d(Landroid/content/Context;)Lo/dde;

    move-result-object v0

    sput-object v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->P:Lo/dde;

    .line 522
    invoke-direct {p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->u()V

    .line 523
    invoke-static {}, Lo/etq;->d()Lo/etq;

    move-result-object v0

    invoke-virtual {v0}, Lo/etq;->c()Z

    move-result v6

    .line 524
    const-string v0, "MainUI"

    const-string v1, "WearHomeActivity"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "checkEnableDevice:"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 526
    const-string v0, "MainUI"

    const-string v1, "WearHomeActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "tatatee devicemac:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v4, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->X:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 529
    const-string v0, "isFromWear"

    const/4 v1, 0x0

    :try_start_0
    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->az:Z

    .line 530
    const-string v0, "com.huawei.iconnect.action.SHOW_DEVICE"

    invoke-virtual {v5}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 531
    const-string v0, "DEVICE_NAME"

    invoke-virtual {v5, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 532
    const/4 v0, 0x0

    if-eq v0, v7, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->Q:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 533
    const-string v0, "WearHomeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "not the wanted device"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 534
    invoke-virtual {p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->finish()V

    goto :goto_0

    .line 535
    :cond_0
    const/4 v0, 0x0

    if-eq v0, v7, :cond_1

    .line 536
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "health_user_agree"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 537
    const-string v0, "1"

    invoke-virtual {v0, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 538
    const-string v0, "WearHomeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "not confirm privacy,"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 539
    invoke-direct {p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->aj()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 546
    :cond_1
    :goto_0
    goto :goto_1

    .line 543
    :catch_0
    move-exception v7

    .line 544
    const-string v0, "WearHomeActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getIntent error:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v7}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 545
    invoke-virtual {p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->finish()V

    .line 548
    :cond_2
    :goto_1
    invoke-direct {p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->z()V

    .line 550
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->Q:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    .line 551
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->Q:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getSecUUID()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->C:Ljava/lang/String;

    .line 552
    const/4 v0, 0x0

    new-array v0, v0, [Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    invoke-virtual {p0, v0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->d([Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;)V

    .line 553
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->Q:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    invoke-direct {p0, v0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->d(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;)V

    .line 554
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->Q:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceConnectState()I

    move-result v0

    const/4 v1, 0x2

    if-ne v1, v0, :cond_3

    .line 555
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->D:Z

    goto :goto_2

    .line 557
    :cond_3
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->D:Z

    .line 559
    :goto_2
    const-string v0, "MainUI"

    const-string v1, "WearHomeActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Enter onCreateView isConnected:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-boolean v4, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->D:Z

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, " state:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v4, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->Q:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceConnectState()I

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 562
    :cond_4
    invoke-static {}, Lo/dbf;->d()Z

    move-result v0

    if-nez v0, :cond_5

    iget-boolean v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->D:Z

    if-eqz v0, :cond_5

    .line 564
    invoke-static {p0}, Landroid/support/v4/app/NotificationManagerCompat;->from(Landroid/content/Context;)Landroid/support/v4/app/NotificationManagerCompat;

    move-result-object v6

    .line 565
    invoke-virtual {v6}, Landroid/support/v4/app/NotificationManagerCompat;->areNotificationsEnabled()Z

    move-result v7

    .line 566
    const-string v0, "MainUI"

    const-string v1, "WearHomeActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "notification switch status:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 567
    if-nez v7, :cond_5

    .line 568
    invoke-direct {p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->q()V

    .line 572
    :cond_5
    new-instance v0, Landroid/os/HandlerThread;

    const-string v1, "WearHomeActivity"

    invoke-direct {v0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->y:Landroid/os/HandlerThread;

    .line 573
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->y:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->start()V

    .line 574
    new-instance v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$a;

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->y:Landroid/os/HandlerThread;

    invoke-virtual {v1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1, p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity$a;-><init>(Landroid/os/Looper;Lcom/huawei/ui/homewear21/home/WearHomeActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->x:Lcom/huawei/ui/homewear21/home/WearHomeActivity$a;

    .line 575
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->x:Lcom/huawei/ui/homewear21/home/WearHomeActivity$a;

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->aD:Lcom/huawei/ui/homewear21/home/WearHomeActivity$d;

    invoke-virtual {v0, v1}, Lcom/huawei/ui/homewear21/home/WearHomeActivity$a;->post(Ljava/lang/Runnable;)Z

    .line 576
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->aQ:Landroid/os/Handler;

    const/16 v1, 0x3fa

    const-wide/16 v2, 0x5dc

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 577
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-nez v0, :cond_6

    .line 579
    invoke-static {}, Lcom/huawei/hwdevicedfxmanager/UploadLogUtil;->deviceLogExists()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 580
    const-string v0, "MainUI"

    const-string v1, "WearHomeActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "UploadLogUtil.deviceLogExists"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 581
    new-instance v6, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;

    invoke-direct {v6}, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;-><init>()V

    .line 582
    sget-object v0, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->LOG_PATH_TEMP:Ljava/lang/String;

    sget-object v1, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->LOG_PATH:Ljava/lang/String;

    invoke-virtual {v6, v0, v1}, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->cutFolder(Ljava/lang/String;Ljava/lang/String;)V

    .line 583
    invoke-static {p0}, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->getInstance(Landroid/content/Context;)Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->startUploadLogFile(Z)V

    .line 585
    :cond_6
    const-string v0, "MainUI"

    const-string v1, "WearHomeActivity"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Leave onCreateView time:"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 588
    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    .line 589
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    sget-object v2, Lo/dae;->b:Lo/dae;

    invoke-virtual {v2}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v6, v3}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 590
    return-void
.end method

.method public onDestroy()V
    .locals 6

    .line 5059
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onDestroy()V

    .line 5060
    const-string v0, "MainUI"

    const-string v1, "WearHomeActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Enter onDestroy"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 5061
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->af:Lo/etw;

    invoke-virtual {v0}, Lo/etw;->c()V

    .line 5062
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->y:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->quit()Z

    .line 5063
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->x:Lcom/huawei/ui/homewear21/home/WearHomeActivity$a;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/ui/homewear21/home/WearHomeActivity$a;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 5064
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->aQ:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 5065
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->as:Lo/ety;

    invoke-virtual {v0}, Lo/ety;->d()V

    .line 5067
    invoke-direct {p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->Y()V

    .line 5069
    invoke-direct {p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->ac()V

    .line 5070
    invoke-direct {p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->ap()V

    .line 5071
    invoke-direct {p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->ah()V

    .line 5072
    invoke-virtual {p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->g()V

    .line 5073
    invoke-direct {p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->av()V

    .line 5074
    invoke-direct {p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->au()V

    .line 5075
    invoke-direct {p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->aJ()V

    .line 5076
    invoke-direct {p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->aa()V

    .line 5077
    invoke-direct {p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->aB()V

    .line 5078
    invoke-direct {p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->az()V

    .line 5083
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->getInstance(Landroid/content/Context;)Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;

    move-result-object v5

    .line 5084
    const/4 v0, 0x0

    invoke-static {v0}, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->setIsBusy(Z)V

    .line 5085
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->s:Landroid/support/v4/content/LocalBroadcastManager;

    .line 5087
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->bk:Z

    .line 5088
    invoke-direct {p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->aQ()V

    .line 5089
    const/4 v0, 0x0

    invoke-static {v0}, Lcom/huawei/hwdevicedfxmanager/UploadLogUtil;->setAgreeUploadUseFlow(Z)V

    .line 5090
    return-void
.end method

.method public onPause()V
    .locals 5

    .line 5026
    const-string v0, "MainUI"

    const-string v1, "WearHomeActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Enter onPause"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 5027
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onPause()V

    .line 5028
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->ao:Lo/egy;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 5029
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->ao:Lo/egy;

    invoke-virtual {v0}, Lo/egy;->dismiss()V

    .line 5030
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->ao:Lo/egy;

    .line 5032
    :cond_0
    return-void
.end method

.method public onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    .locals 7

    .line 4905
    const-string v0, "MainUI"

    const-string v1, "WearHomeActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Activity-onRequestPermissionsResult(), PermissionsManager.notifyPermissionsChange()"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 4906
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->u:Landroid/content/Context;

    const-string v1, "android.permission.READ_PHONE_STATE"

    invoke-virtual {v0, v1}, Landroid/content/Context;->checkCallingPermission(Ljava/lang/String;)I

    move-result v5

    .line 4907
    const-string v0, "MainUI"

    const-string v1, "WearHomeActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Activity-onRequestPermissionsResult() READ_PHONE_STATE permissione ="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 4909
    if-nez v5, :cond_0

    .line 4910
    new-instance v6, Landroid/content/Intent;

    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->u:Landroid/content/Context;

    const-class v1, Lcom/huawei/hwservicesmgr/PhoneService;

    invoke-direct {v6, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 4911
    const-string v0, "com.huawei.bone.action.REGISTER_PHONE_LISTEN"

    invoke-virtual {v6, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 4912
    const-string v0, "MainUI"

    const-string v1, "WearHomeActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Activity-onRequestPermissionsResult(), start PhoneService first"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 4913
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->u:Landroid/content/Context;

    invoke-virtual {v0, v6}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 4915
    :cond_0
    invoke-static {}, Lo/dbn;->c()Lo/dbn;

    move-result-object v0

    invoke-virtual {v0, p2, p3}, Lo/dbn;->c([Ljava/lang/String;[I)V

    .line 4916
    return-void
.end method

.method public onResume()V
    .locals 6

    .line 4928
    const-string v0, "MainUI"

    const-string v1, "WearHomeActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Enter onResume Process.myPid():"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 4929
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onResume()V

    .line 4930
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->as:Lo/ety;

    invoke-virtual {v0}, Lo/ety;->b()V

    .line 4931
    invoke-direct {p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->aH()V

    .line 4933
    const-string v0, "MainUI"

    const-string v1, "WearHomeActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "onResume lastSyncTime = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-wide v4, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->ae:J

    invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, ",currentTime = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    .line 4934
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    .line 4933
    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 4936
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->ae:J

    sub-long/2addr v0, v2

    const-wide/32 v2, 0x1d4c0

    cmp-long v0, v0, v2

    if-ltz v0, :cond_0

    .line 4937
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->ae:J

    .line 4938
    invoke-direct {p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->ai()V

    .line 4940
    :cond_0
    const/16 v0, 0xc8

    invoke-direct {p0, v0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->c(I)V

    .line 4941
    invoke-direct {p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->I()V

    .line 4942
    invoke-direct {p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->G()V

    .line 4943
    invoke-direct {p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->H()V

    .line 4946
    invoke-static {}, Lo/etq;->d()Lo/etq;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->X:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/etq;->a(Ljava/lang/String;)Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->Q:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    .line 4947
    invoke-direct {p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->z()V

    .line 4948
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->Q:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 4949
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->Q:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    invoke-direct {p0, v0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->d(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;)V

    .line 4951
    :cond_1
    const/4 v0, 0x1

    new-array v0, v0, [Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->Q:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-virtual {p0, v0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->d([Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;)V

    .line 4952
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->Q:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    invoke-direct {p0, v0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->f(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;)V

    .line 4954
    invoke-static {}, Lo/yi;->c()Z

    move-result v0

    .line 4968
    invoke-direct {p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->al()V

    .line 4969
    invoke-direct {p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->aD()V

    .line 4970
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->X:Ljava/lang/String;

    invoke-static {v0}, Lo/dke;->b(Ljava/lang/String;)I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_2

    .line 4971
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->X:Ljava/lang/String;

    invoke-static {v0}, Lo/dke;->b(Ljava/lang/String;)I

    move-result v0

    invoke-direct {p0, v0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->a(I)V

    .line 4972
    const-string v0, "WearHomeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "DeviceBatteryInfo.battery is not -1 , battery is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->X:Ljava/lang/String;

    invoke-static {v3}, Lo/dke;->b(Ljava/lang/String;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4974
    :cond_2
    invoke-direct {p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->aS()V

    .line 4975
    return-void
.end method

.method public onStart()V
    .locals 5

    .line 4921
    const-string v0, "MainUI"

    const-string v1, "WearHomeActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Enter onStart()"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 4922
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onStart()V

    .line 4923
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->aQ:Landroid/os/Handler;

    const/16 v1, 0x3f1

    const-wide/16 v2, 0xbb8

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageAtTime(IJ)Z

    .line 4924
    return-void
.end method
