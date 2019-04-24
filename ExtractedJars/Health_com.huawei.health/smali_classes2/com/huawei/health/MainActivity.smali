.class public Lcom/huawei/health/MainActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"

# interfaces
.implements Landroid/support/v4/app/ActivityCompat$OnRequestPermissionsResultCallback;
.implements Lo/czv;
.implements Lcom/huawei/ui/homehealth/HomeFragment$c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/MainActivity$e;,
        Lcom/huawei/health/MainActivity$f;,
        Lcom/huawei/health/MainActivity$g;,
        Lcom/huawei/health/MainActivity$i;,
        Lcom/huawei/health/MainActivity$b;,
        Lcom/huawei/health/MainActivity$a;,
        Lcom/huawei/health/MainActivity$d;,
        Lcom/huawei/health/MainActivity$h;,
        Lcom/huawei/health/MainActivity$k;,
        Lcom/huawei/health/MainActivity$c;
    }
.end annotation


# static fields
.field private static W:Z

.field private static q:Ljava/lang/String;

.field private static final r:Ljava/lang/Object;

.field private static s:Ljava/lang/String;


# instance fields
.field private A:Ljava/lang/String;

.field private B:Ljava/lang/String;

.field private C:Landroid/os/Bundle;

.field private D:I

.field private E:Landroid/net/Uri;

.field private F:Lo/alj;

.field private G:Lo/alh;

.field private H:I

.field private I:Z

.field private J:I

.field private K:Lcom/huawei/hwcommonmodel/application/BaseApplication;

.field private L:Lo/egs$b;

.field private M:J

.field private N:Lo/egs;

.field private O:Z

.field private P:Z

.field private Q:Z

.field private R:Ljava/lang/String;

.field private S:Lcom/huawei/hms/api/HuaweiApiClient;

.field private T:Lcom/huawei/health/MainActivity$g;

.field private U:J

.field private V:Z

.field private X:I

.field private Y:Z

.field private Z:Z

.field public a:J

.field private aA:I

.field private final aB:Landroid/content/BroadcastReceiver;

.field private final aD:Landroid/content/BroadcastReceiver;

.field private aG:J

.field private aa:Z

.field private ab:I

.field private ac:Z

.field private ad:Z

.field private ae:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;

.field private af:Lo/egn;

.field private ag:Z

.field private ah:Z

.field private ai:Lo/elw;

.field private aj:Lhuawei/widget/HwImmersiveMode;

.field private ak:Lo/egy;

.field private al:Z

.field private am:J

.field private an:Lo/egy;

.field private ao:Z

.field private ap:Lo/esa;

.field private aq:Lcom/huawei/health/MainActivity$e;

.field private ar:Ljava/lang/String;

.field private as:Lcom/huawei/hms/api/HuaweiApiClient$ConnectionCallbacks;

.field private at:Lcom/huawei/health/MainActivity$c;

.field private au:Lcom/huawei/health/MainActivity$k;

.field private av:Lcom/huawei/health/MainActivity$b;

.field private final aw:Landroid/content/BroadcastReceiver;

.field private ax:Lcom/huawei/health/MainActivity$f;

.field private final ay:Landroid/content/BroadcastReceiver;

.field private az:J

.field public b:J

.field c:Lcom/huawei/hwcloudmodel/agreement/AccessTokenManager;

.field public d:I

.field e:Ljava/lang/String;

.field f:Lcom/huawei/hwcloudmodel/agreement/AccessTokenManager;

.field private g:Ljava/lang/String;

.field private h:Lcom/huawei/ui/homehealth/HomeFragment;

.field private i:Ljava/lang/String;

.field private j:I

.field private k:Lcom/huawei/ui/main/stories/discover/fragment/DiscoverFragment;

.field private l:Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;

.field private m:Landroid/widget/LinearLayout;

.field private n:Landroid/content/Context;

.field private o:Lo/abc;

.field private p:Ljava/util/concurrent/ExecutorService;

.field private t:Landroid/os/Handler;

.field private u:Lo/ale;

.field private v:I

.field private w:Ljava/lang/String;

.field private x:Ljava/lang/String;

.field private y:Ljava/lang/String;

.field private z:Landroid/net/Uri;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 198
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/huawei/health/MainActivity;->r:Ljava/lang/Object;

    .line 200
    const/4 v0, 0x0

    sput-object v0, Lcom/huawei/health/MainActivity;->q:Ljava/lang/String;

    .line 202
    const/4 v0, 0x0

    sput-object v0, Lcom/huawei/health/MainActivity;->s:Ljava/lang/String;

    .line 238
    const/4 v0, 0x0

    sput-boolean v0, Lcom/huawei/health/MainActivity;->W:Z

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 179
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    .line 184
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/MainActivity;->g:Ljava/lang/String;

    .line 185
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/MainActivity;->i:Ljava/lang/String;

    .line 186
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/MainActivity;->h:Lcom/huawei/ui/homehealth/HomeFragment;

    .line 187
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/MainActivity;->k:Lcom/huawei/ui/main/stories/discover/fragment/DiscoverFragment;

    .line 189
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/MainActivity;->o:Lo/abc;

    .line 203
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/MainActivity;->w:Ljava/lang/String;

    .line 204
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/MainActivity;->z:Landroid/net/Uri;

    .line 205
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/MainActivity;->x:Ljava/lang/String;

    .line 206
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/MainActivity;->y:Ljava/lang/String;

    .line 211
    const/16 v0, 0xa

    iput v0, p0, Lcom/huawei/health/MainActivity;->D:I

    .line 214
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/MainActivity;->E:Landroid/net/Uri;

    .line 217
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/MainActivity;->I:Z

    .line 219
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/health/MainActivity;->b:J

    .line 220
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/health/MainActivity;->d:I

    .line 221
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/health/MainActivity;->a:J

    .line 222
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/health/MainActivity;->M:J

    .line 228
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/health/MainActivity;->J:I

    .line 229
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/health/MainActivity;->R:Ljava/lang/String;

    .line 230
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/MainActivity;->O:Z

    .line 232
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/MainActivity;->Q:Z

    .line 236
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/MainActivity;->P:Z

    .line 239
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/health/MainActivity;->U:J

    .line 247
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/MainActivity;->V:Z

    .line 248
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/health/MainActivity;->X:I

    .line 249
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/MainActivity;->Y:Z

    .line 250
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/health/MainActivity;->ab:I

    .line 251
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/MainActivity;->ac:Z

    .line 252
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/MainActivity;->Z:Z

    .line 253
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/MainActivity;->aa:Z

    .line 254
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/MainActivity;->ah:Z

    .line 255
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/MainActivity;->ad:Z

    .line 259
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/health/MainActivity;->ag:Z

    .line 260
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/health/MainActivity;->am:J

    .line 264
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/MainActivity;->al:Z

    .line 273
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/health/MainActivity;->ar:Ljava/lang/String;

    .line 277
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/MainActivity;->ao:Z

    .line 785
    new-instance v0, Lcom/huawei/health/MainActivity$c;

    invoke-direct {v0, p0}, Lcom/huawei/health/MainActivity$c;-><init>(Lcom/huawei/health/MainActivity;)V

    iput-object v0, p0, Lcom/huawei/health/MainActivity;->at:Lcom/huawei/health/MainActivity$c;

    .line 846
    new-instance v0, Lcom/huawei/health/MainActivity$k;

    invoke-direct {v0, p0}, Lcom/huawei/health/MainActivity$k;-><init>(Lcom/huawei/health/MainActivity;)V

    iput-object v0, p0, Lcom/huawei/health/MainActivity;->au:Lcom/huawei/health/MainActivity$k;

    .line 2124
    new-instance v0, Lcom/huawei/health/MainActivity$8;

    invoke-direct {v0, p0}, Lcom/huawei/health/MainActivity$8;-><init>(Lcom/huawei/health/MainActivity;)V

    iput-object v0, p0, Lcom/huawei/health/MainActivity;->as:Lcom/huawei/hms/api/HuaweiApiClient$ConnectionCallbacks;

    .line 2984
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/MainActivity;->av:Lcom/huawei/health/MainActivity$b;

    .line 3056
    new-instance v0, Lcom/huawei/health/MainActivity$i;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/huawei/health/MainActivity$i;-><init>(Lcom/huawei/health/MainActivity$4;)V

    iput-object v0, p0, Lcom/huawei/health/MainActivity;->aw:Landroid/content/BroadcastReceiver;

    .line 3107
    new-instance v0, Lcom/huawei/health/MainActivity$9;

    invoke-direct {v0, p0}, Lcom/huawei/health/MainActivity$9;-><init>(Lcom/huawei/health/MainActivity;)V

    iput-object v0, p0, Lcom/huawei/health/MainActivity;->ay:Landroid/content/BroadcastReceiver;

    .line 3118
    new-instance v0, Lcom/huawei/health/MainActivity$11;

    invoke-direct {v0, p0}, Lcom/huawei/health/MainActivity$11;-><init>(Lcom/huawei/health/MainActivity;)V

    iput-object v0, p0, Lcom/huawei/health/MainActivity;->aB:Landroid/content/BroadcastReceiver;

    .line 3410
    new-instance v0, Lcom/huawei/health/MainActivity$f;

    invoke-direct {v0, p0}, Lcom/huawei/health/MainActivity$f;-><init>(Lcom/huawei/health/MainActivity;)V

    iput-object v0, p0, Lcom/huawei/health/MainActivity;->ax:Lcom/huawei/health/MainActivity$f;

    .line 3535
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/health/MainActivity;->aA:I

    .line 3536
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/health/MainActivity;->az:J

    .line 3537
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/health/MainActivity;->aG:J

    .line 3654
    new-instance v0, Lcom/huawei/health/MainActivity$18;

    invoke-direct {v0, p0}, Lcom/huawei/health/MainActivity$18;-><init>(Lcom/huawei/health/MainActivity;)V

    iput-object v0, p0, Lcom/huawei/health/MainActivity;->aD:Landroid/content/BroadcastReceiver;

    return-void
.end method

.method static synthetic A(Lcom/huawei/health/MainActivity;)Ljava/lang/String;
    .locals 1

    .line 179
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->x:Ljava/lang/String;

    return-object v0
.end method

.method private A()V
    .locals 4

    .line 1309
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->af:Lo/egn;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/health/MainActivity;->h:Lcom/huawei/ui/homehealth/HomeFragment;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 1310
    :cond_0
    return-void

    .line 1314
    :cond_1
    iget-boolean v0, p0, Lcom/huawei/health/MainActivity;->ad:Z

    if-nez v0, :cond_2

    .line 1315
    return-void

    .line 1318
    :cond_2
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initShowMainPage"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1321
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->u:Lo/ale;

    invoke-virtual {v0}, Lo/ale;->i()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 1322
    invoke-direct {p0}, Lcom/huawei/health/MainActivity;->B()V

    goto :goto_0

    .line 1324
    :cond_3
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/huawei/health/MainActivity;->d(I)V

    .line 1326
    :goto_0
    return-void
.end method

.method static synthetic B(Lcom/huawei/health/MainActivity;)Ljava/lang/String;
    .locals 1

    .line 179
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->y:Ljava/lang/String;

    return-object v0
.end method

.method private B()V
    .locals 7

    .line 1349
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->af:Lo/egn;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 1350
    return-void

    .line 1353
    :cond_0
    const-string v0, "TimeEat_MainActivity"

    const-string v1, "Enter initEmptyFragmentList"

    invoke-static {v0, v1}, Lo/dbf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 1354
    invoke-direct {p0, p0}, Lcom/huawei/health/MainActivity;->d(Landroid/content/Context;)V

    .line 1356
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->n:Landroid/content/Context;

    invoke-static {v0}, Lo/ene;->b(Landroid/content/Context;)I

    move-result v4

    .line 1357
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    invoke-direct {p0, v0}, Lcom/huawei/health/MainActivity;->b(Z)V

    .line 1359
    invoke-virtual {p0}, Lcom/huawei/health/MainActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/16 v1, 0x400

    invoke-virtual {v0, v1}, Landroid/view/Window;->clearFlags(I)V

    .line 1360
    const/16 v0, 0x8

    invoke-direct {p0, v0}, Lcom/huawei/health/MainActivity;->d(I)V

    .line 1362
    invoke-direct {p0}, Lcom/huawei/health/MainActivity;->aj()V

    .line 1363
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->o:Lo/abc;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/abc;->setVisibility(I)V

    .line 1364
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->ai:Lo/elw;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/elw;->setVisibility(I)V

    .line 1366
    new-instance v5, Landroid/os/Bundle;

    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    .line 1367
    const-string v0, "statusBarHeight"

    invoke-virtual {v5, v0, v4}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 1370
    :try_start_0
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->o:Lo/abc;

    new-instance v1, Lo/abl;

    invoke-virtual {p0}, Lcom/huawei/health/MainActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v2

    invoke-static {}, Lo/czu;->e()Z

    move-result v3

    invoke-direct {p0, v3}, Lcom/huawei/health/MainActivity;->a(Z)[Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v2, v5, v3}, Lo/abl;-><init>(Landroid/support/v4/app/FragmentManager;Landroid/os/Bundle;[Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lo/abc;->setAdapter(Landroid/support/v4/view/PagerAdapter;)V

    .line 1371
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->o:Lo/abc;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lo/abc;->setCurrentItem(IZ)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 1374
    goto :goto_0

    .line 1372
    :catch_0
    move-exception v6

    .line 1373
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v6}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1376
    :goto_0
    const-string v0, "TimeEat_MainActivity"

    const-string v1, "Leave initEmptyFragmentList"

    invoke-static {v0, v1}, Lo/dbf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 1377
    return-void
.end method

.method static synthetic C(Lcom/huawei/health/MainActivity;)Landroid/os/Bundle;
    .locals 1

    .line 179
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->C:Landroid/os/Bundle;

    return-object v0
.end method

.method private C()V
    .locals 8

    .line 1254
    sget-object v4, Lcom/huawei/health/MainActivity;->r:Ljava/lang/Object;

    monitor-enter v4

    .line 1255
    :try_start_0
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1256
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showAdvDialog isNoCloudVersion"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1257
    monitor-exit v4

    return-void

    .line 1259
    :cond_0
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x2

    :try_start_1
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showAdvDialog mHadShowAd "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-boolean v2, p0, Lcom/huawei/health/MainActivity;->Z:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1260
    iget-boolean v0, p0, Lcom/huawei/health/MainActivity;->Z:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v0, :cond_1

    .line 1261
    monitor-exit v4

    return-void

    .line 1263
    :cond_1
    :try_start_2
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->u:Lo/ale;

    invoke-virtual {v0}, Lo/ale;->A()Lo/ego;

    move-result-object v5

    .line 1264
    if-eqz v5, :cond_2

    invoke-virtual {v5}, Lo/ego;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1265
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showAdvDialog progress dialog is showing"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 1266
    monitor-exit v4

    return-void

    .line 1268
    :cond_2
    :try_start_3
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->n:Landroid/content/Context;

    const/16 v1, 0x2719

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "health_is_first_in"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 1270
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showAdvDialog isFirstIn = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v6, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1271
    const-string v0, "health_is_first_in"

    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 1272
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/health/MainActivity;->Z:Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 1274
    :cond_3
    monitor-exit v4

    goto :goto_0

    :catchall_0
    move-exception v7

    monitor-exit v4

    throw v7

    .line 1276
    :goto_0
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->p:Ljava/util/concurrent/ExecutorService;

    if-eqz v0, :cond_4

    .line 1277
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->p:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/huawei/health/MainActivity$25;

    invoke-direct {v1, p0}, Lcom/huawei/health/MainActivity$25;-><init>(Lcom/huawei/health/MainActivity;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 1305
    :cond_4
    return-void
.end method

.method private D()V
    .locals 2

    .line 1189
    iget-boolean v0, p0, Lcom/huawei/health/MainActivity;->ah:Z

    if-eqz v0, :cond_0

    .line 1190
    return-void

    .line 1193
    :cond_0
    const-string v0, "TimeEat_MainActivity"

    const-string v1, "Enter initOtherLoginedData"

    invoke-static {v0, v1}, Lo/dbf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 1194
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/health/MainActivity;->ah:Z

    .line 1196
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->p:Ljava/util/concurrent/ExecutorService;

    if-eqz v0, :cond_1

    .line 1197
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->p:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/huawei/health/MainActivity$24;

    invoke-direct {v1, p0}, Lcom/huawei/health/MainActivity$24;-><init>(Lcom/huawei/health/MainActivity;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 1250
    :cond_1
    const-string v0, "TimeEat_MainActivity"

    const-string v1, "Leave initOtherLoginedData"

    invoke-static {v0, v1}, Lo/dbf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 1251
    return-void
.end method

.method static synthetic D(Lcom/huawei/health/MainActivity;)V
    .locals 0

    .line 179
    invoke-direct {p0}, Lcom/huawei/health/MainActivity;->z()V

    return-void
.end method

.method static synthetic E(Lcom/huawei/health/MainActivity;)I
    .locals 1

    .line 179
    iget v0, p0, Lcom/huawei/health/MainActivity;->H:I

    return v0
.end method

.method private E()V
    .locals 15

    .line 1380
    const-string v0, "TimeEat_MainActivity"

    const-string v1, "Enter initFragmentList"

    invoke-static {v0, v1}, Lo/dbf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 1381
    invoke-direct {p0}, Lcom/huawei/health/MainActivity;->j()V

    .line 1383
    invoke-direct {p0}, Lcom/huawei/health/MainActivity;->X()V

    .line 1384
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->n:Landroid/content/Context;

    invoke-static {v0}, Lo/ene;->b(Landroid/content/Context;)I

    move-result v5

    .line 1385
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "statusBarHeight"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1386
    invoke-static {}, Lo/czu;->i()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1387
    invoke-static {}, Lo/ahr;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1388
    invoke-static {}, Lo/ahr;->d()Lo/ahr;

    move-result-object v0

    invoke-virtual {v0}, Lo/ahr;->b()V

    .line 1390
    :cond_0
    invoke-direct {p0}, Lcom/huawei/health/MainActivity;->F()V

    .line 1392
    :cond_1
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/MainActivity;->n:Landroid/content/Context;

    invoke-static {v1}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/login/ui/login/LoginInit;->getUsetId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/cxf;->b(Ljava/lang/String;)V

    .line 1393
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "===Show User ID1"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1395
    invoke-virtual {p0}, Lcom/huawei/health/MainActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/16 v1, 0x400

    invoke-virtual {v0, v1}, Landroid/view/Window;->clearFlags(I)V

    .line 1396
    const/16 v0, 0x8

    invoke-direct {p0, v0}, Lcom/huawei/health/MainActivity;->d(I)V

    .line 1397
    invoke-direct {p0}, Lcom/huawei/health/MainActivity;->aj()V

    .line 1398
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initFragmentList() Gone startPage"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1399
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->o:Lo/abc;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/abc;->setVisibility(I)V

    .line 1400
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->ai:Lo/elw;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/elw;->setVisibility(I)V

    .line 1402
    new-instance v6, Landroid/os/Bundle;

    invoke-direct {v6}, Landroid/os/Bundle;-><init>()V

    .line 1403
    const-string v0, "statusBarHeight"

    invoke-virtual {v6, v0, v5}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 1404
    new-instance v0, Lcom/huawei/ui/homehealth/HomeFragment;

    invoke-direct {v0}, Lcom/huawei/ui/homehealth/HomeFragment;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/MainActivity;->h:Lcom/huawei/ui/homehealth/HomeFragment;

    .line 1405
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->h:Lcom/huawei/ui/homehealth/HomeFragment;

    invoke-virtual {v0, v6}, Lcom/huawei/ui/homehealth/HomeFragment;->setArguments(Landroid/os/Bundle;)V

    .line 1406
    new-instance v0, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;

    iget-object v1, p0, Lcom/huawei/health/MainActivity;->ai:Lo/elw;

    invoke-direct {v0, v1}, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;-><init>(Lhuawei/widget/HwBottomNavigationView;)V

    iput-object v0, p0, Lcom/huawei/health/MainActivity;->l:Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;

    .line 1407
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->l:Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;

    invoke-virtual {v0, v6}, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;->setArguments(Landroid/os/Bundle;)V

    .line 1408
    const-string v0, "TimeEat_MainActivity"

    const-string v1, "start to -initFragmentList HomeFragment"

    invoke-static {v0, v1}, Lo/dbf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 1410
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 1411
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->h:Lcom/huawei/ui/homehealth/HomeFragment;

    invoke-virtual {v7, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1412
    new-instance v0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;

    invoke-direct {v0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/MainActivity;->ae:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;

    .line 1413
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->ae:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;

    invoke-virtual {v7, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1415
    invoke-static {}, Lo/czu;->e()Z

    move-result v8

    .line 1416
    invoke-direct {p0, v8}, Lcom/huawei/health/MainActivity;->b(Z)V

    .line 1417
    if-nez v8, :cond_2

    .line 1418
    new-instance v0, Lcom/huawei/ui/main/stories/discover/fragment/DiscoverFragment;

    invoke-direct {v0}, Lcom/huawei/ui/main/stories/discover/fragment/DiscoverFragment;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/MainActivity;->k:Lcom/huawei/ui/main/stories/discover/fragment/DiscoverFragment;

    .line 1419
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->k:Lcom/huawei/ui/main/stories/discover/fragment/DiscoverFragment;

    invoke-virtual {v0, v6}, Lcom/huawei/ui/main/stories/discover/fragment/DiscoverFragment;->setArguments(Landroid/os/Bundle;)V

    .line 1420
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->k:Lcom/huawei/ui/main/stories/discover/fragment/DiscoverFragment;

    invoke-virtual {v7, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1423
    :cond_2
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->l:Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;

    invoke-virtual {v7, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1424
    const-string v0, "TimeEat_MainActivity"

    const-string v1, "-initFragmentList PersonalCenterFragment"

    invoke-static {v0, v1}, Lo/dbf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 1426
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->o:Lo/abc;

    new-instance v1, Lo/abh;

    invoke-virtual {p0}, Lcom/huawei/health/MainActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v2

    invoke-direct {p0, v8}, Lcom/huawei/health/MainActivity;->a(Z)[Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v2, v7, v3}, Lo/abh;-><init>(Landroid/support/v4/app/FragmentManager;Ljava/util/List;[Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lo/abc;->setAdapter(Landroid/support/v4/view/PagerAdapter;)V

    .line 1427
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->o:Lo/abc;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lo/abc;->setCurrentItem(IZ)V

    .line 1428
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->o:Lo/abc;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lo/abc;->setOffscreenPageLimit(I)V

    .line 1429
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->ai:Lo/elw;

    new-instance v1, Lcom/huawei/health/MainActivity$22;

    invoke-direct {v1, p0}, Lcom/huawei/health/MainActivity$22;-><init>(Lcom/huawei/health/MainActivity;)V

    invoke-virtual {v0, v1}, Lo/elw;->setBottomNavListener(Lhuawei/widget/HwBottomNavigationView$BottomNavListener;)V

    .line 1459
    if-nez v8, :cond_3

    .line 1460
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->n:Landroid/content/Context;

    const/16 v1, 0x2719

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "health_is_first_in_home"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 1462
    invoke-virtual {p0}, Lcom/huawei/health/MainActivity;->isFinishing()Z

    move-result v10

    .line 1463
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isFristInHome = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v9, v1, v2

    const-string v2, "isFinishing = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v10}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1464
    const-string v0, "health_is_first_in_home"

    invoke-virtual {v0, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    if-nez v10, :cond_3

    .line 1465
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->n:Landroid/content/Context;

    const/16 v1, 0x2719

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "health_is_first_in_home"

    const-string v3, "health_is_first_in_home"

    new-instance v4, Lo/dcy;

    invoke-direct {v4}, Lo/dcy;-><init>()V

    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 1470
    :cond_3
    invoke-direct {p0}, Lcom/huawei/health/MainActivity;->I()V

    .line 1471
    invoke-direct {p0}, Lcom/huawei/health/MainActivity;->H()V

    .line 1472
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->t:Landroid/os/Handler;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    .line 1473
    const-string v0, "Login_MainActivity"

    const-string v1, "Start to send MSG_HANDLE_MIGRATE_DATA"

    invoke-static {v0, v1}, Lo/dbf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 1474
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->t:Landroid/os/Handler;

    const/16 v1, 0x1f43

    const-wide/16 v2, 0x3e8

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 1475
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->t:Landroid/os/Handler;

    const/16 v1, 0x1f42

    const-wide/16 v2, 0x384

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 1476
    const-string v0, "Login_MainActivity"

    const-string v1, "Start to send MSG_TEST_HOMEFRAGMENT"

    invoke-static {v0, v1}, Lo/dbf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 1477
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->t:Landroid/os/Handler;

    const/16 v1, 0x1f41

    const-wide/16 v2, 0x3e8

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 1479
    :cond_4
    const-string v0, "TimeEat_MainActivity"

    const-string v1, "Leave initFragmentList"

    invoke-static {v0, v1}, Lo/dbf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 1481
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v9

    .line 1482
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->K:Lcom/huawei/hwcommonmodel/application/BaseApplication;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->g()J

    move-result-wide v11

    .line 1483
    const-wide/16 v0, 0x0

    cmp-long v0, v0, v11

    if-eqz v0, :cond_5

    iget-wide v0, p0, Lcom/huawei/health/MainActivity;->am:J

    const-wide/16 v2, 0x0

    cmp-long v0, v2, v0

    if-eqz v0, :cond_5

    iget-wide v0, p0, Lcom/huawei/health/MainActivity;->am:J

    sub-long v0, v9, v0

    const-wide/16 v2, 0x1f40

    cmp-long v0, v0, v2

    if-gtz v0, :cond_5

    .line 1484
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->u:Lo/ale;

    iget-wide v1, p0, Lcom/huawei/health/MainActivity;->am:J

    sub-long v1, v9, v1

    invoke-virtual {v0, v1, v2}, Lo/ale;->a(J)V

    .line 1486
    :cond_5
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->K:Lcom/huawei/hwcommonmodel/application/BaseApplication;

    const-wide/16 v1, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->e(J)V

    .line 1487
    invoke-static {}, Lo/dbf;->f()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 1488
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->u:Lo/ale;

    invoke-virtual {v0}, Lo/ale;->S()V

    .line 1490
    :cond_6
    const-string v13, "2019-01-12 06:18:25"

    .line 1491
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "BuildConfig.BUILD_TIME:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v13, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1492
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->n:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "apk_build_time"

    new-instance v3, Lo/dcy;

    invoke-direct {v3}, Lo/dcy;-><init>()V

    invoke-static {v0, v1, v2, v13, v3}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 1497
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->n:Landroid/content/Context;

    invoke-static {v0}, Lo/cbu;->c(Landroid/content/Context;)Lo/cbu;

    move-result-object v0

    invoke-virtual {v0}, Lo/cbu;->ah()Z

    move-result v0

    if-nez v0, :cond_7

    .line 1498
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->n:Landroid/content/Context;

    const/16 v1, 0x4e22

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "EXIT_APP_AT_SPORT_TAB"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    .line 1499
    if-eqz v14, :cond_7

    invoke-virtual {v14}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_7

    invoke-static {v14}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 1500
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->o:Lo/abc;

    if-eqz v0, :cond_7

    .line 1501
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->o:Lo/abc;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lo/abc;->setCurrentItem(IZ)V

    .line 1502
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->ai:Lo/elw;

    iget-object v1, p0, Lcom/huawei/health/MainActivity;->o:Lo/abc;

    invoke-virtual {v1}, Lo/abc;->getCurrentItem()I

    move-result v1

    invoke-virtual {v0, v1}, Lo/elw;->setItemChecked(I)V

    .line 1507
    :cond_7
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "initFragmentList() , mHadShowAd = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lcom/huawei/health/MainActivity;->Z:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", mHadFocus = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lcom/huawei/health/MainActivity;->aa:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1508
    iget-boolean v0, p0, Lcom/huawei/health/MainActivity;->Z:Z

    if-nez v0, :cond_8

    iget-boolean v0, p0, Lcom/huawei/health/MainActivity;->aa:Z

    if-eqz v0, :cond_8

    .line 1509
    invoke-virtual {p0}, Lcom/huawei/health/MainActivity;->a()V

    .line 1512
    :cond_8
    return-void
.end method

.method private F()V
    .locals 7

    .line 2104
    const-string v0, "TimeEat_MainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter shouldQuery()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2105
    const-wide/16 v4, 0x0

    .line 2107
    :try_start_0
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->n:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "agr_last_query_time"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-wide v0

    move-wide v4, v0

    .line 2112
    goto :goto_0

    .line 2109
    :catch_0
    move-exception v6

    .line 2111
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "parseLong Exception"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2113
    :goto_0
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->n:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "agr_if_agree_authorize"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/MainActivity;->e:Ljava/lang/String;

    .line 2115
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sub-long/2addr v0, v4

    long-to-float v0, v0

    const v1, 0x476a6000    # 60000.0f

    div-float v6, v0, v1

    .line 2116
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter shouldQuery() intervalTime "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v6}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " lastQueryTime "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2117
    const-wide/16 v0, 0x0

    cmp-long v0, v4, v0

    if-eqz v0, :cond_0

    const/high16 v0, 0x44b40000    # 1440.0f

    cmpl-float v0, v6, v0

    if-gtz v0, :cond_0

    const-string v0, "0"

    iget-object v1, p0, Lcom/huawei/health/MainActivity;->e:Ljava/lang/String;

    .line 2118
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2119
    :cond_0
    invoke-direct {p0}, Lcom/huawei/health/MainActivity;->G()V

    .line 2121
    :cond_1
    const-string v0, "TimeEat_MainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Leave shouldQuery()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2122
    return-void
.end method

.method static synthetic F(Lcom/huawei/health/MainActivity;)V
    .locals 0

    .line 179
    invoke-direct {p0}, Lcom/huawei/health/MainActivity;->S()V

    return-void
.end method

.method private G()V
    .locals 4

    .line 2142
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter_callObtainToken"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2143
    new-instance v0, Lcom/huawei/hwcloudmodel/agreement/AccessTokenManager;

    invoke-direct {v0, p0}, Lcom/huawei/hwcloudmodel/agreement/AccessTokenManager;-><init>(Landroid/app/Activity;)V

    iput-object v0, p0, Lcom/huawei/health/MainActivity;->c:Lcom/huawei/hwcloudmodel/agreement/AccessTokenManager;

    .line 2144
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->c:Lcom/huawei/hwcloudmodel/agreement/AccessTokenManager;

    iget-object v1, p0, Lcom/huawei/health/MainActivity;->t:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Lcom/huawei/hwcloudmodel/agreement/AccessTokenManager;->initHandler(Landroid/os/Handler;)V

    .line 2145
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->c:Lcom/huawei/hwcloudmodel/agreement/AccessTokenManager;

    iget-object v1, p0, Lcom/huawei/health/MainActivity;->n:Landroid/content/Context;

    iget-object v2, p0, Lcom/huawei/health/MainActivity;->as:Lcom/huawei/hms/api/HuaweiApiClient$ConnectionCallbacks;

    new-instance v3, Lcom/huawei/health/MainActivity$7;

    invoke-direct {v3, p0}, Lcom/huawei/health/MainActivity$7;-><init>(Lcom/huawei/health/MainActivity;)V

    invoke-virtual {v0, v1, v2, v3}, Lcom/huawei/hwcloudmodel/agreement/AccessTokenManager;->hmsConnect(Landroid/content/Context;Lcom/huawei/hms/api/HuaweiApiClient$ConnectionCallbacks;Lcom/huawei/hms/api/HuaweiApiClient$OnConnectionFailedListener;)V

    .line 2154
    return-void
.end method

.method static synthetic G(Lcom/huawei/health/MainActivity;)V
    .locals 0

    .line 179
    invoke-direct {p0}, Lcom/huawei/health/MainActivity;->J()V

    return-void
.end method

.method private H()V
    .locals 14

    .line 1629
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->n:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "show_product_recomment"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 1631
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1632
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->n:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "show_product_recomment"

    .line 1633
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lo/dcy;

    invoke-direct {v4}, Lo/dcy;-><init>()V

    .line 1632
    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 1634
    return-void

    .line 1636
    :cond_0
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1637
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Is Oversea version"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1638
    return-void

    .line 1640
    :cond_1
    const-wide/16 v6, 0x0

    .line 1642
    :try_start_0
    invoke-static {v5}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-wide v0

    move-wide v6, v0

    .line 1646
    goto :goto_0

    .line 1643
    :catch_0
    move-exception v8

    .line 1645
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "parseLong Exception"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v8}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1647
    :goto_0
    const-wide/16 v0, 0x0

    cmp-long v0, v6, v0

    if-eqz v0, :cond_3

    .line 1648
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sub-long/2addr v0, v6

    long-to-float v0, v0

    const v1, 0x476a6000    # 60000.0f

    div-float v8, v0, v1

    .line 1649
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showOveBiDialog minutes "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v8}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1650
    const v0, 0x461d8000    # 10080.0f

    cmpg-float v0, v8, v0

    if-gez v0, :cond_2

    .line 1651
    return-void

    .line 1653
    :cond_2
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->n:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "health_product_recommend"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 1655
    const-string v0, "1"

    invoke-virtual {v0, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 1656
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->n:Landroid/content/Context;

    invoke-static {v0}, Lo/dnm;->a(Landroid/content/Context;)Lo/dnm;

    move-result-object v10

    .line 1657
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->n:Landroid/content/Context;

    const v1, 0x7f02025a

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v11

    .line 1658
    new-instance v0, Lo/egv$b;

    invoke-direct {v0, p0}, Lo/egv$b;-><init>(Landroid/content/Context;)V

    .line 1659
    const v1, 0x7f02067c

    invoke-virtual {v0, v1}, Lo/egv$b;->b(I)Lo/egv$b;

    move-result-object v0

    .line 1660
    invoke-virtual {v0, v11}, Lo/egv$b;->b(Ljava/lang/String;)Lo/egv$b;

    move-result-object v0

    new-instance v1, Lcom/huawei/health/MainActivity$5;

    invoke-direct {v1, p0, v10}, Lcom/huawei/health/MainActivity$5;-><init>(Lcom/huawei/health/MainActivity;Lo/dnm;)V

    .line 1661
    const v2, 0x7f020201

    invoke-virtual {v0, v2, v1}, Lo/egv$b;->e(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    move-result-object v0

    new-instance v1, Lcom/huawei/health/MainActivity$2;

    invoke-direct {v1, p0, v10}, Lcom/huawei/health/MainActivity$2;-><init>(Lcom/huawei/health/MainActivity;Lo/dnm;)V

    .line 1669
    const v2, 0x7f020200

    invoke-virtual {v0, v2, v1}, Lo/egv$b;->b(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    move-result-object v12

    .line 1677
    invoke-virtual {v12}, Lo/egv$b;->b()Lo/egv;

    move-result-object v13

    .line 1678
    const/4 v0, 0x0

    invoke-virtual {v13, v0}, Lo/egv;->setCancelable(Z)V

    .line 1679
    invoke-virtual {v13}, Lo/egv;->show()V

    .line 1680
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->n:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "show_product_recomment"

    .line 1681
    const/4 v3, 0x0

    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lo/dcy;

    invoke-direct {v4}, Lo/dcy;-><init>()V

    .line 1680
    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 1684
    :cond_3
    return-void
.end method

.method static synthetic H(Lcom/huawei/health/MainActivity;)V
    .locals 0

    .line 179
    invoke-direct {p0}, Lcom/huawei/health/MainActivity;->ae()V

    return-void
.end method

.method static synthetic I(Lcom/huawei/health/MainActivity;)Lo/elw;
    .locals 1

    .line 179
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->ai:Lo/elw;

    return-object v0
.end method

.method private I()V
    .locals 12

    .line 1572
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->n:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "ove_bi_dialog_first_in"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 1574
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1575
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->n:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "ove_bi_dialog_first_in"

    .line 1576
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lo/dcy;

    invoke-direct {v4}, Lo/dcy;-><init>()V

    .line 1575
    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 1577
    return-void

    .line 1579
    :cond_0
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-nez v0, :cond_1

    .line 1580
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Is Chinese version"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1581
    return-void

    .line 1583
    :cond_1
    invoke-static {}, Lo/czu;->i()Z

    move-result v0

    if-nez v0, :cond_2

    .line 1584
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Not allowed to login version"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1585
    return-void

    .line 1588
    :cond_2
    const-wide/16 v6, 0x0

    .line 1590
    :try_start_0
    invoke-static {v5}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-wide v0

    move-wide v6, v0

    .line 1594
    goto :goto_0

    .line 1591
    :catch_0
    move-exception v8

    .line 1593
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "parseLong Exception"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v8}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1595
    :goto_0
    const-wide/16 v0, 0x0

    cmp-long v0, v6, v0

    if-eqz v0, :cond_4

    .line 1596
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sub-long/2addr v0, v6

    long-to-float v0, v0

    const v1, 0x476a6000    # 60000.0f

    div-float v8, v0, v1

    .line 1597
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showOveBiDialog minutes "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v8}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1598
    const v0, 0x461d8000    # 10080.0f

    cmpg-float v0, v8, v0

    if-gez v0, :cond_3

    .line 1599
    return-void

    .line 1601
    :cond_3
    invoke-static {}, Lo/dgk;->d()Z

    move-result v0

    if-nez v0, :cond_4

    .line 1602
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->n:Landroid/content/Context;

    const v1, 0x7f02090e

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v9

    .line 1603
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->n:Landroid/content/Context;

    const v1, 0x7f02090f

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v10

    .line 1604
    new-instance v0, Lo/egy$b;

    invoke-direct {v0, p0}, Lo/egy$b;-><init>(Landroid/content/Context;)V

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\n\n"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 1605
    invoke-virtual {v0, v1}, Lo/egy$b;->a(Ljava/lang/String;)Lo/egy$b;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/MainActivity;->n:Landroid/content/Context;

    .line 1606
    const v2, 0x7f02046d

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/huawei/health/MainActivity$1;

    invoke-direct {v2, p0}, Lcom/huawei/health/MainActivity$1;-><init>(Lcom/huawei/health/MainActivity;)V

    invoke-virtual {v0, v1, v2}, Lo/egy$b;->c(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egy$b;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/MainActivity;->n:Landroid/content/Context;

    .line 1614
    const v2, 0x7f020500

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/huawei/health/MainActivity$3;

    invoke-direct {v2, p0}, Lcom/huawei/health/MainActivity$3;-><init>(Lcom/huawei/health/MainActivity;)V

    invoke-virtual {v0, v1, v2}, Lo/egy$b;->a(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egy$b;

    move-result-object v11

    .line 1619
    invoke-virtual {v11}, Lo/egy$b;->a()Lo/egy;

    move-result-object v0

    invoke-virtual {v0}, Lo/egy;->show()V

    .line 1620
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->n:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "ove_bi_dialog_first_in"

    .line 1621
    const/4 v3, 0x0

    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lo/dcy;

    invoke-direct {v4}, Lo/dcy;-><init>()V

    .line 1620
    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 1625
    :cond_4
    return-void
.end method

.method static synthetic J(Lcom/huawei/health/MainActivity;)Lcom/huawei/ui/main/stories/discover/fragment/DiscoverFragment;
    .locals 1

    .line 179
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->k:Lcom/huawei/ui/main/stories/discover/fragment/DiscoverFragment;

    return-object v0
.end method

.method private J()V
    .locals 4

    .line 2639
    iget v0, p0, Lcom/huawei/health/MainActivity;->H:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_1

    .line 2641
    invoke-direct {p0}, Lcom/huawei/health/MainActivity;->P()Z

    move-result v0

    if-nez v0, :cond_0

    .line 2642
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "finish MainAcitivity for cause: is in motino"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2643
    invoke-virtual {p0}, Lcom/huawei/health/MainActivity;->finish()V

    .line 2644
    return-void

    .line 2646
    :cond_0
    invoke-direct {p0}, Lcom/huawei/health/MainActivity;->M()V

    .line 2648
    :cond_1
    return-void
.end method

.method static synthetic K(Lcom/huawei/health/MainActivity;)Ljava/util/concurrent/ExecutorService;
    .locals 1

    .line 179
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->p:Ljava/util/concurrent/ExecutorService;

    return-object v0
.end method

.method private K()V
    .locals 5

    .line 2678
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->ae:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/health/MainActivity;->o:Lo/abc;

    if-eqz v0, :cond_0

    .line 2679
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->ae:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;

    iget-boolean v1, p0, Lcom/huawei/health/MainActivity;->Y:Z

    iget v2, p0, Lcom/huawei/health/MainActivity;->ab:I

    iget v3, p0, Lcom/huawei/health/MainActivity;->X:I

    invoke-virtual {v0, v1, v2, v3}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->a(ZII)V

    .line 2681
    :try_start_0
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->o:Lo/abc;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lo/abc;->setCurrentItem(IZ)V
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    .line 2684
    goto :goto_0

    .line 2682
    :catch_0
    move-exception v4

    .line 2683
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/lang/IndexOutOfBoundsException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2684
    goto :goto_0

    .line 2687
    :cond_0
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "SportEntanceFragment or ViewPager is not initialed"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2689
    :goto_0
    return-void
.end method

.method static synthetic L(Lcom/huawei/health/MainActivity;)Ljava/lang/String;
    .locals 1

    .line 179
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->ar:Ljava/lang/String;

    return-object v0
.end method

.method private L()V
    .locals 4

    .line 2771
    iget v0, p0, Lcom/huawei/health/MainActivity;->v:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    iget v0, p0, Lcom/huawei/health/MainActivity;->j:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/huawei/health/MainActivity;->B:Ljava/lang/String;

    if-eqz v0, :cond_2

    .line 2773
    :cond_0
    invoke-direct {p0}, Lcom/huawei/health/MainActivity;->P()Z

    move-result v0

    if-nez v0, :cond_1

    .line 2774
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "finish MainAcitivity for cause: skip is in motino"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2775
    invoke-virtual {p0}, Lcom/huawei/health/MainActivity;->finish()V

    .line 2776
    return-void

    .line 2779
    :cond_1
    invoke-virtual {p0}, Lcom/huawei/health/MainActivity;->isTaskRoot()Z

    move-result v0

    if-nez v0, :cond_2

    .line 2780
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "is not TaskRoot, start checkSkipActivity"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2782
    invoke-direct {p0}, Lcom/huawei/health/MainActivity;->S()V

    .line 2786
    :cond_2
    return-void
.end method

.method private M()V
    .locals 3

    .line 2654
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->E:Landroid/net/Uri;

    invoke-virtual {v0}, Landroid/net/Uri;->getQuery()Ljava/lang/String;

    move-result-object v2

    .line 2655
    iget v0, p0, Lcom/huawei/health/MainActivity;->H:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 2656
    const/4 v0, 0x0

    if-ne v0, v2, :cond_0

    .line 2657
    invoke-direct {p0}, Lcom/huawei/health/MainActivity;->K()V

    goto :goto_0

    .line 2659
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->E:Landroid/net/Uri;

    invoke-direct {p0, v0}, Lcom/huawei/health/MainActivity;->a(Landroid/net/Uri;)V

    goto :goto_0

    .line 2662
    :cond_1
    iget v0, p0, Lcom/huawei/health/MainActivity;->H:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_3

    .line 2663
    const/4 v0, 0x0

    if-ne v0, v2, :cond_2

    .line 2664
    invoke-virtual {p0}, Lcom/huawei/health/MainActivity;->c()V

    goto :goto_0

    .line 2666
    :cond_2
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->E:Landroid/net/Uri;

    invoke-virtual {p0, v0}, Lcom/huawei/health/MainActivity;->b(Landroid/net/Uri;)V

    .line 2669
    :cond_3
    :goto_0
    return-void
.end method

.method static synthetic M(Lcom/huawei/health/MainActivity;)V
    .locals 0

    .line 179
    invoke-direct {p0}, Lcom/huawei/health/MainActivity;->al()V

    return-void
.end method

.method static synthetic N(Lcom/huawei/health/MainActivity;)Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;
    .locals 1

    .line 179
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->ae:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;

    return-object v0
.end method

.method private N()V
    .locals 2

    .line 2334
    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    .line 2335
    const-class v0, Lcom/huawei/health/MainActivity;

    invoke-virtual {v1, p0, v0}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 2336
    invoke-virtual {p0}, Lcom/huawei/health/MainActivity;->finish()V

    .line 2337
    invoke-virtual {p0, v1}, Lcom/huawei/health/MainActivity;->startActivity(Landroid/content/Intent;)V

    .line 2338
    return-void
.end method

.method private O()V
    .locals 6

    .line 2838
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startSportActivity"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2839
    sget-object v0, Lo/dae;->bB:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v4

    .line 2840
    const-string v5, "1"

    .line 2841
    invoke-direct {p0, v4, v5}, Lcom/huawei/health/MainActivity;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 2846
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->o:Lo/abc;

    if-eqz v0, :cond_0

    .line 2847
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->o:Lo/abc;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lo/abc;->setCurrentItem(IZ)V

    .line 2850
    :cond_0
    return-void
.end method

.method private P()Z
    .locals 6

    .line 2793
    const/4 v4, 0x0

    .line 2794
    const/4 v5, -0x1

    .line 2795
    invoke-static {}, Lo/cbl;->b()Lo/cbl;

    move-result-object v0

    invoke-virtual {v0}, Lo/cbl;->getAdapter()Lo/eab;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2796
    invoke-static {}, Lo/cbl;->b()Lo/cbl;

    move-result-object v0

    invoke-virtual {v0}, Lo/cbl;->o()I

    move-result v4

    .line 2799
    :cond_0
    invoke-static {}, Lo/brt;->c()Lo/brt;

    move-result-object v0

    invoke-virtual {v0}, Lo/brt;->getAdapter()Lo/eab;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 2800
    invoke-static {}, Lo/brt;->c()Lo/brt;

    move-result-object v0

    invoke-virtual {v0}, Lo/brt;->b()I

    move-result v5

    .line 2803
    :cond_1
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "sportState="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", fitState="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2805
    const/4 v0, 0x1

    if-eq v4, v0, :cond_2

    const/4 v0, 0x2

    if-eq v4, v0, :cond_2

    const/4 v0, 0x2

    if-ne v5, v0, :cond_3

    .line 2808
    :cond_2
    const/4 v0, 0x0

    return v0

    .line 2810
    :cond_3
    const/4 v0, 0x1

    return v0
.end method

.method private Q()V
    .locals 6

    .line 2853
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startFitnessExerciseActivity"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2854
    sget-object v0, Lo/dae;->bB:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v4

    .line 2855
    const-string v5, "2"

    .line 2856
    invoke-direct {p0, v4, v5}, Lcom/huawei/health/MainActivity;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 2857
    invoke-static {}, Lo/brt;->c()Lo/brt;

    move-result-object v0

    invoke-virtual {v0}, Lo/brt;->i()V

    .line 2858
    return-void
.end method

.method private R()V
    .locals 7

    .line 2861
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startSmartMsgSkipActivity"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2862
    sget-object v0, Lo/dae;->bJ:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v4

    .line 2863
    iget v0, p0, Lcom/huawei/health/MainActivity;->j:I

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v5

    .line 2864
    invoke-direct {p0, v4, v5}, Lcom/huawei/health/MainActivity;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 2865
    new-instance v6, Landroid/content/Intent;

    invoke-direct {v6}, Landroid/content/Intent;-><init>()V

    .line 2866
    const-string v0, "id"

    iget v1, p0, Lcom/huawei/health/MainActivity;->v:I

    invoke-virtual {v6, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 2867
    const-string v0, "msgType"

    iget v1, p0, Lcom/huawei/health/MainActivity;->j:I

    invoke-virtual {v6, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 2868
    const-string v0, "msgContent"

    iget-object v1, p0, Lcom/huawei/health/MainActivity;->B:Ljava/lang/String;

    invoke-virtual {v6, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 2869
    const-string v0, "from"

    const/4 v1, 0x1

    invoke-virtual {v6, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 2870
    const-class v0, Lcom/huawei/ui/main/stories/smartcenter/activity/SmartMsgSkipActivity;

    invoke-virtual {v6, p0, v0}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 2871
    invoke-virtual {p0, v6}, Lcom/huawei/health/MainActivity;->startActivity(Landroid/content/Intent;)V

    .line 2872
    return-void
.end method

.method private S()V
    .locals 4

    .line 2814
    iget-boolean v0, p0, Lcom/huawei/health/MainActivity;->V:Z

    if-eqz v0, :cond_0

    .line 2815
    invoke-direct {p0}, Lcom/huawei/health/MainActivity;->K()V

    goto :goto_0

    .line 2817
    :cond_0
    iget v0, p0, Lcom/huawei/health/MainActivity;->v:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_3

    .line 2818
    iget v0, p0, Lcom/huawei/health/MainActivity;->j:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 2819
    invoke-direct {p0}, Lcom/huawei/health/MainActivity;->O()V

    goto :goto_0

    .line 2820
    :cond_1
    iget v0, p0, Lcom/huawei/health/MainActivity;->j:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_2

    .line 2821
    invoke-direct {p0}, Lcom/huawei/health/MainActivity;->Q()V

    goto :goto_0

    .line 2822
    :cond_2
    iget v0, p0, Lcom/huawei/health/MainActivity;->j:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_5

    .line 2823
    invoke-direct {p0}, Lcom/huawei/health/MainActivity;->W()V

    goto :goto_0

    .line 2825
    :cond_3
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->A:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 2826
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->A:Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/huawei/health/MainActivity;->d(Ljava/lang/String;)V

    goto :goto_0

    .line 2828
    :cond_4
    invoke-direct {p0}, Lcom/huawei/health/MainActivity;->R()V

    .line 2831
    :cond_5
    :goto_0
    invoke-virtual {p0}, Lcom/huawei/health/MainActivity;->isTaskRoot()Z

    move-result v0

    if-nez v0, :cond_6

    iget-boolean v0, p0, Lcom/huawei/health/MainActivity;->V:Z

    if-nez v0, :cond_6

    iget-boolean v0, p0, Lcom/huawei/health/MainActivity;->al:Z

    if-nez v0, :cond_6

    .line 2832
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "finish MainAcitivity for cause: is task root"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2833
    invoke-virtual {p0}, Lcom/huawei/health/MainActivity;->finish()V

    .line 2835
    :cond_6
    return-void
.end method

.method private T()V
    .locals 5

    .line 2987
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "registerFeatureBroadcastReciver"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2988
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->av:Lcom/huawei/health/MainActivity$b;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 2989
    new-instance v0, Lcom/huawei/health/MainActivity$b;

    invoke-direct {v0, p0}, Lcom/huawei/health/MainActivity$b;-><init>(Lcom/huawei/health/MainActivity;)V

    iput-object v0, p0, Lcom/huawei/health/MainActivity;->av:Lcom/huawei/health/MainActivity$b;

    .line 2991
    :cond_0
    new-instance v4, Landroid/content/IntentFilter;

    invoke-direct {v4}, Landroid/content/IntentFilter;-><init>()V

    .line 2992
    const-string v0, "com.huawei.plugin.operation.action_jumt_to_fearture_page"

    invoke-virtual {v4, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 2993
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->n:Landroid/content/Context;

    invoke-static {v0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/MainActivity;->av:Lcom/huawei/health/MainActivity$b;

    invoke-virtual {v0, v1, v4}, Landroid/support/v4/content/LocalBroadcastManager;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V

    .line 2994
    return-void
.end method

.method private U()V
    .locals 4

    .line 3044
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter showNoteHwidRunBackDialog:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3045
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/MainActivity;->L:Lo/egs$b;

    .line 3046
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/MainActivity;->N:Lo/egs;

    .line 3048
    new-instance v0, Lo/egs$b;

    iget-object v1, p0, Lcom/huawei/health/MainActivity;->n:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/egs$b;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/health/MainActivity;->L:Lo/egs$b;

    .line 3049
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->L:Lo/egs$b;

    invoke-virtual {v0}, Lo/egs$b;->d()Lo/egs;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/MainActivity;->N:Lo/egs;

    .line 3050
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->N:Lo/egs;

    invoke-virtual {v0}, Lo/egs;->show()V

    .line 3051
    return-void
.end method

.method private V()V
    .locals 4

    .line 2885
    invoke-virtual {p0}, Lcom/huawei/health/MainActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 2886
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "refreshNavigationBarColor:null == getWindow()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2887
    return-void

    .line 2889
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->ai:Lo/elw;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 2890
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "refreshNavigationBarColor:null == tabs"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2891
    return-void

    .line 2893
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->ai:Lo/elw;

    invoke-virtual {v0}, Lo/elw;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_2

    .line 2894
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "null == tabs.getBackground()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2895
    return-void

    .line 2898
    :cond_2
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_3

    invoke-static {}, Lo/dbf;->d()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 2899
    invoke-virtual {p0}, Lcom/huawei/health/MainActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/MainActivity;->ai:Lo/elw;

    invoke-virtual {v1}, Lo/elw;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    check-cast v1, Landroid/graphics/drawable/ColorDrawable;

    invoke-virtual {v1}, Landroid/graphics/drawable/ColorDrawable;->getColor()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/view/Window;->setNavigationBarColor(I)V

    .line 2901
    :cond_3
    return-void
.end method

.method private W()V
    .locals 5

    .line 2904
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startPairDeviceActivity"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2906
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "smartMsgId="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/health/MainActivity;->v:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", smartMsgType="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/health/MainActivity;->j:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", smartMsgContent="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/health/MainActivity;->B:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", productName="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/health/MainActivity;->R:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", deviceType="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/health/MainActivity;->J:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2907
    new-instance v4, Landroid/content/Intent;

    invoke-direct {v4}, Landroid/content/Intent;-><init>()V

    .line 2908
    const/high16 v0, 0x10000000

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 2909
    iget v0, p0, Lcom/huawei/health/MainActivity;->J:I

    const/16 v1, 0xb

    if-ne v1, v0, :cond_0

    .line 2910
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startPairDeviceActivity is r1 "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2911
    const-string v0, "style"

    const/4 v1, 0x4

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 2912
    const-string v0, "isFromWearR1"

    const/4 v1, 0x1

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 2913
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->n:Landroid/content/Context;

    const-class v1, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    goto :goto_0

    .line 2915
    :cond_0
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startPairDeviceActivity is not r1 "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2916
    const-string v0, "device_type"

    iget v1, p0, Lcom/huawei/health/MainActivity;->J:I

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 2917
    const-string v0, "dname"

    iget-object v1, p0, Lcom/huawei/health/MainActivity;->R:Ljava/lang/String;

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 2918
    const-string v0, "isPorc"

    iget-boolean v1, p0, Lcom/huawei/health/MainActivity;->O:Z

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 2919
    const-string v0, "isFromWear"

    const/4 v1, 0x1

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 2920
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->n:Landroid/content/Context;

    const-class v1, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 2922
    :goto_0
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->n:Landroid/content/Context;

    invoke-virtual {v0, v4}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 2923
    return-void
.end method

.method private X()V
    .locals 2

    .line 2948
    const-string v0, "TimeEat_MainActivity"

    const-string v1, "Enter initWeightUserData"

    invoke-static {v0, v1}, Lo/dbf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 2949
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    new-instance v1, Lcom/huawei/health/MainActivity$6;

    invoke-direct {v1, p0}, Lcom/huawei/health/MainActivity$6;-><init>(Lcom/huawei/health/MainActivity;)V

    invoke-interface {v0, v1}, Lo/clt;->a(Lo/clz;)V

    .line 2982
    return-void
.end method

.method private Y()V
    .locals 5

    .line 3132
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter registerWifiBroadcast()!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3133
    new-instance v4, Landroid/content/IntentFilter;

    invoke-direct {v4}, Landroid/content/IntentFilter;-><init>()V

    .line 3135
    const-string v0, "android.net.wifi.STATE_CHANGE"

    invoke-virtual {v4, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 3136
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->aw:Landroid/content/BroadcastReceiver;

    invoke-virtual {p0, v0, v4}, Lcom/huawei/health/MainActivity;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 3137
    return-void
.end method

.method private Z()V
    .locals 5

    .line 3162
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter accountLogoutBroadcast()!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3163
    new-instance v4, Landroid/content/IntentFilter;

    invoke-direct {v4}, Landroid/content/IntentFilter;-><init>()V

    .line 3164
    const-string v0, "com.huawei.hwid.ACTION_REMOVE_ACCOUNT"

    invoke-virtual {v4, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 3165
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->ay:Landroid/content/BroadcastReceiver;

    invoke-virtual {p0, v0, v4}, Lcom/huawei/health/MainActivity;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 3166
    return-void
.end method

.method static synthetic a(Lcom/huawei/health/MainActivity;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 179
    iput-object p1, p0, Lcom/huawei/health/MainActivity;->x:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 179
    invoke-static {p0, p1, p2, p3}, Lcom/huawei/health/MainActivity;->d(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private a(Landroid/content/Intent;)V
    .locals 4

    .line 3460
    if-nez p1, :cond_0

    .line 3461
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initSportParams intent"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3462
    return-void

    .line 3465
    :cond_0
    const-string v0, "isToSportTab"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/health/MainActivity;->V:Z

    .line 3466
    const-string v0, "mLaunchSource"

    const/4 v1, -0x1

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/huawei/health/MainActivity;->X:I

    .line 3467
    iget-boolean v0, p0, Lcom/huawei/health/MainActivity;->V:Z

    if-nez v0, :cond_1

    .line 3469
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/MainActivity;->Y:Z

    .line 3470
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/health/MainActivity;->ab:I

    goto :goto_0

    .line 3473
    :cond_1
    const-string v0, "isSelected"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/health/MainActivity;->Y:Z

    .line 3474
    const-string v0, "sportType"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/huawei/health/MainActivity;->ab:I

    .line 3477
    :goto_0
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3478
    return-void
.end method

.method private a(Landroid/net/Uri;)V
    .locals 11

    .line 2696
    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    .line 2697
    new-instance v7, Ljava/util/HashMap;

    invoke-direct {v7}, Ljava/util/HashMap;-><init>()V

    .line 2698
    invoke-direct {p0, v6, v7}, Lcom/huawei/health/MainActivity;->d(Ljava/util/Map;Ljava/util/Map;)V

    .line 2700
    const-string v0, "sportType"

    :try_start_0
    invoke-virtual {p1, v0}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v8

    .line 2701
    const-string v0, "targetType"

    invoke-virtual {p1, v0}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 2702
    const-string v0, "targetValue"

    invoke-virtual {p1, v0}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v10

    .line 2704
    invoke-static {}, Lo/cbl;->b()Lo/cbl;

    move-result-object v0

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v6, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-interface {v7, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v3

    const/high16 v1, 0x447a0000    # 1000.0f

    div-float v4, v10, v1

    const/4 v1, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Lo/cbl;->c(IIIFLo/ceu;)I
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 2709
    goto :goto_0

    .line 2705
    :catch_0
    move-exception v8

    .line 2706
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "goToSportTrack NumberFormatException:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v8}, Ljava/lang/NumberFormatException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2709
    goto :goto_0

    .line 2707
    :catch_1
    move-exception v8

    .line 2708
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "goToSportTrack Exception:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v8}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2710
    :goto_0
    return-void
.end method

.method private static a(Landroid/os/Handler;Ljava/lang/String;Ljava/lang/String;)V
    .locals 5

    .line 2239
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MainActivty_signAgrHttp aToken"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2241
    new-instance v4, Lcom/huawei/hwcloudmodel/agreement/AgrHttp;

    invoke-direct {v4}, Lcom/huawei/hwcloudmodel/agreement/AgrHttp;-><init>()V

    .line 2243
    new-instance v0, Lcom/huawei/health/MainActivity$a;

    invoke-direct {v0, p0, p1, p2}, Lcom/huawei/health/MainActivity$a;-><init>(Landroid/os/Handler;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v4, p2, p1, v0}, Lcom/huawei/hwcloudmodel/agreement/AgrHttp;->queryHttpReq(Ljava/lang/String;Ljava/lang/String;Lo/czi;)Ljava/lang/String;

    .line 2244
    return-void
.end method

.method static synthetic a(Lcom/huawei/health/MainActivity;)V
    .locals 0

    .line 179
    invoke-direct {p0}, Lcom/huawei/health/MainActivity;->m()V

    return-void
.end method

.method static synthetic a(Lcom/huawei/health/MainActivity;Z)Z
    .locals 0

    .line 179
    iput-boolean p1, p0, Lcom/huawei/health/MainActivity;->Z:Z

    return p1
.end method

.method private a(Z)[Ljava/lang/String;
    .locals 3

    .line 1558
    if-nez p1, :cond_0

    .line 1560
    const/4 v0, 0x4

    new-array v0, v0, [Ljava/lang/String;

    iget-object v1, p0, Lcom/huawei/health/MainActivity;->n:Landroid/content/Context;

    const v2, 0x7f020042

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    iget-object v1, p0, Lcom/huawei/health/MainActivity;->n:Landroid/content/Context;

    .line 1561
    const v2, 0x7f020037

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    iget-object v1, p0, Lcom/huawei/health/MainActivity;->n:Landroid/content/Context;

    .line 1562
    const v2, 0x7f020043

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    iget-object v1, p0, Lcom/huawei/health/MainActivity;->n:Landroid/content/Context;

    .line 1563
    const v2, 0x7f020044

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x3

    aput-object v1, v0, v2

    .line 1560
    return-object v0

    .line 1565
    :cond_0
    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/String;

    iget-object v1, p0, Lcom/huawei/health/MainActivity;->n:Landroid/content/Context;

    const v2, 0x7f020042

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    iget-object v1, p0, Lcom/huawei/health/MainActivity;->n:Landroid/content/Context;

    .line 1566
    const v2, 0x7f020037

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    iget-object v1, p0, Lcom/huawei/health/MainActivity;->n:Landroid/content/Context;

    .line 1567
    const v2, 0x7f020044

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    .line 1565
    return-object v0
.end method

.method private aa()V
    .locals 5

    .line 3173
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter registerRefreshATBroadcast()!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3174
    new-instance v4, Landroid/content/IntentFilter;

    invoke-direct {v4}, Landroid/content/IntentFilter;-><init>()V

    .line 3175
    const-string v0, "com.huawei.plugin.account.refresh.accessToken"

    invoke-virtual {v4, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 3176
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->n:Landroid/content/Context;

    invoke-static {v0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/MainActivity;->aB:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1, v4}, Landroid/support/v4/content/LocalBroadcastManager;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V

    .line 3177
    return-void
.end method

.method private ab()V
    .locals 5

    .line 3143
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-nez v0, :cond_0

    .line 3144
    invoke-static {}, Lo/dbf;->q()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3146
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x1

    :try_start_0
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter unregisterWifiBroadcast()!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3147
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->aw:Landroid/content/BroadcastReceiver;

    invoke-virtual {p0, v0}, Lcom/huawei/health/MainActivity;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1

    .line 3152
    goto :goto_0

    .line 3148
    :catch_0
    move-exception v4

    .line 3149
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/lang/IllegalArgumentException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3152
    goto :goto_0

    .line 3150
    :catch_1
    move-exception v4

    .line 3151
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/lang/RuntimeException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3154
    :cond_0
    :goto_0
    return-void
.end method

.method private ac()V
    .locals 5

    .line 3186
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x1

    :try_start_0
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter unregisterAccountLogoutBroad()!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3187
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->ay:Landroid/content/BroadcastReceiver;

    invoke-virtual {p0, v0}, Lcom/huawei/health/MainActivity;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1

    .line 3192
    goto :goto_0

    .line 3188
    :catch_0
    move-exception v4

    .line 3189
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "unregisterAccountLogoutBroadcast\uff0cIllegalArgumentException e="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Ljava/lang/IllegalArgumentException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3192
    goto :goto_0

    .line 3190
    :catch_1
    move-exception v4

    .line 3191
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "unregisterAccountLogoutBroadcast\uff0cRuntimeException e="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Ljava/lang/RuntimeException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3193
    :goto_0
    return-void
.end method

.method private ad()V
    .locals 4

    .line 3344
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-nez v0, :cond_2

    .line 3345
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->S:Lcom/huawei/hms/api/HuaweiApiClient;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 3346
    invoke-direct {p0}, Lcom/huawei/health/MainActivity;->t()V

    .line 3348
    :cond_0
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "connectHuaweiApiClient:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3349
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->S:Lcom/huawei/hms/api/HuaweiApiClient;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 3350
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->S:Lcom/huawei/hms/api/HuaweiApiClient;

    invoke-virtual {v0}, Lcom/huawei/hms/api/HuaweiApiClient;->isConnecting()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/huawei/health/MainActivity;->S:Lcom/huawei/hms/api/HuaweiApiClient;

    invoke-virtual {v0}, Lcom/huawei/hms/api/HuaweiApiClient;->isConnected()Z

    move-result v0

    if-nez v0, :cond_2

    .line 3351
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->S:Lcom/huawei/hms/api/HuaweiApiClient;

    invoke-virtual {v0, p0}, Lcom/huawei/hms/api/HuaweiApiClient;->connect(Landroid/app/Activity;)V

    goto :goto_0

    .line 3354
    :cond_1
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mHuaweiApiClient is null."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3357
    :cond_2
    :goto_0
    return-void
.end method

.method private ae()V
    .locals 3

    .line 3325
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->k:Lcom/huawei/ui/main/stories/discover/fragment/DiscoverFragment;

    if-eqz v0, :cond_0

    .line 3326
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->o:Lo/abc;

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lo/abc;->setCurrentItem(IZ)V

    .line 3327
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->k:Lcom/huawei/ui/main/stories/discover/fragment/DiscoverFragment;

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/discover/fragment/DiscoverFragment;->d()V

    .line 3329
    :cond_0
    return-void
.end method

.method private af()V
    .locals 5

    .line 3201
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x1

    :try_start_0
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter unregisterRefreshATBroadcast()!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3202
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->n:Landroid/content/Context;

    invoke-static {v0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/MainActivity;->aB:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/support/v4/content/LocalBroadcastManager;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1

    .line 3207
    goto :goto_0

    .line 3203
    :catch_0
    move-exception v4

    .line 3204
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "unregisterRefreshATBroadcast\uff0cIllegalArgumentException e="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Ljava/lang/IllegalArgumentException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3207
    goto :goto_0

    .line 3205
    :catch_1
    move-exception v4

    .line 3206
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "unregisterRefreshATBroadcast\uff0cRuntimeException e="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Ljava/lang/RuntimeException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3208
    :goto_0
    return-void
.end method

.method private ag()V
    .locals 5

    .line 3365
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter registerTriggerCheckLoginBroadcast()!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3366
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->T:Lcom/huawei/health/MainActivity$g;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 3367
    new-instance v0, Lcom/huawei/health/MainActivity$g;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/huawei/health/MainActivity$g;-><init>(Lcom/huawei/health/MainActivity;Lcom/huawei/health/MainActivity$4;)V

    iput-object v0, p0, Lcom/huawei/health/MainActivity;->T:Lcom/huawei/health/MainActivity$g;

    .line 3369
    :cond_0
    new-instance v4, Landroid/content/IntentFilter;

    invoke-direct {v4}, Landroid/content/IntentFilter;-><init>()V

    .line 3370
    const-string v0, "com.huawei.plugin.trigger.checklogin"

    invoke-virtual {v4, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 3371
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->n:Landroid/content/Context;

    invoke-static {v0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/MainActivity;->T:Lcom/huawei/health/MainActivity$g;

    invoke-virtual {v0, v1, v4}, Landroid/support/v4/content/LocalBroadcastManager;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V

    .line 3373
    return-void
.end method

.method private ah()V
    .locals 4

    .line 3380
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter unregisterTriggerCheckLoginBroadcast()!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3381
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->T:Lcom/huawei/health/MainActivity$g;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 3382
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "unregisterSyncBroadcastReceiver mReceiver != null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3383
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->n:Landroid/content/Context;

    invoke-static {v0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/MainActivity;->T:Lcom/huawei/health/MainActivity$g;

    invoke-virtual {v0, v1}, Landroid/support/v4/content/LocalBroadcastManager;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 3385
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/MainActivity;->T:Lcom/huawei/health/MainActivity$g;

    .line 3387
    :cond_0
    return-void
.end method

.method private ai()V
    .locals 1

    .line 3573
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->n:Landroid/content/Context;

    invoke-static {v0}, Lo/ena;->e(Landroid/content/Context;)V

    .line 3574
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->n:Landroid/content/Context;

    invoke-static {v0}, Lo/ena;->c(Landroid/content/Context;)I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 3576
    :pswitch_0
    invoke-direct {p0}, Lcom/huawei/health/MainActivity;->al()V

    .line 3577
    goto :goto_1

    .line 3579
    :pswitch_1
    invoke-static {}, Lo/ena;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3580
    invoke-direct {p0}, Lcom/huawei/health/MainActivity;->al()V

    goto :goto_1

    .line 3582
    :cond_0
    invoke-direct {p0}, Lcom/huawei/health/MainActivity;->an()V

    .line 3583
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->an:Lo/egy;

    invoke-virtual {v0}, Lo/egy;->show()V

    .line 3585
    goto :goto_1

    .line 3587
    :pswitch_2
    invoke-static {}, Lo/ena;->d()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 3588
    invoke-direct {p0}, Lcom/huawei/health/MainActivity;->an()V

    .line 3589
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->ak:Lo/egy;

    invoke-virtual {v0}, Lo/egy;->show()V

    goto :goto_1

    .line 3591
    :cond_1
    invoke-direct {p0}, Lcom/huawei/health/MainActivity;->al()V

    .line 3593
    goto :goto_1

    .line 3595
    :goto_0
    invoke-direct {p0}, Lcom/huawei/health/MainActivity;->al()V

    .line 3597
    :goto_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method private aj()V
    .locals 6

    .line 3482
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->aj:Lhuawei/widget/HwImmersiveMode;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 3483
    return-void

    .line 3487
    :cond_0
    :try_start_0
    invoke-static {}, Lo/fkx;->c()Lo/fkx;

    move-result-object v4

    .line 3488
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initNavigationBarView  hwBlurEngine ="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3489
    const/4 v0, 0x0

    if-eq v0, v4, :cond_1

    .line 3490
    invoke-virtual {v4}, Lo/fkx;->g()Z

    move-result v5

    .line 3491
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initNavigationBarView  showHwBlur ="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3492
    invoke-virtual {v4}, Lo/fkx;->g()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 3493
    new-instance v0, Lhuawei/widget/HwImmersiveMode;

    invoke-direct {v0, p0}, Lhuawei/widget/HwImmersiveMode;-><init>(Landroid/app/Activity;)V

    iput-object v0, p0, Lcom/huawei/health/MainActivity;->aj:Lhuawei/widget/HwImmersiveMode;

    .line 3499
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->aj:Lhuawei/widget/HwImmersiveMode;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lhuawei/widget/HwImmersiveMode;->setNavigationBarBlurEnable(Z)V

    .line 3501
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->aj:Lhuawei/widget/HwImmersiveMode;

    iget-object v1, p0, Lcom/huawei/health/MainActivity;->ai:Lo/elw;

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lhuawei/widget/HwImmersiveMode;->setHwBottomNavigationViewBlurEnable(Lhuawei/widget/HwBottomNavigationView;Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 3506
    :cond_1
    goto :goto_0

    .line 3504
    :catch_0
    move-exception v4

    .line 3505
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Exception = "

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

    .line 3509
    :goto_0
    invoke-direct {p0}, Lcom/huawei/health/MainActivity;->V()V

    .line 3510
    return-void
.end method

.method private ak()V
    .locals 4

    .line 3444
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getAccessTokenByHms enter:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3445
    invoke-static {}, Lo/czu;->i()Z

    move-result v0

    if-nez v0, :cond_0

    .line 3446
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ifAllowLogin is false, don\'t getAt!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3447
    return-void

    .line 3450
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->f:Lcom/huawei/hwcloudmodel/agreement/AccessTokenManager;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 3451
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->f:Lcom/huawei/hwcloudmodel/agreement/AccessTokenManager;

    invoke-virtual {v0}, Lcom/huawei/hwcloudmodel/agreement/AccessTokenManager;->shutDownThread()V

    .line 3452
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/MainActivity;->f:Lcom/huawei/hwcloudmodel/agreement/AccessTokenManager;

    .line 3455
    :cond_1
    new-instance v0, Lcom/huawei/hwcloudmodel/agreement/AccessTokenManager;

    invoke-direct {v0, p0}, Lcom/huawei/hwcloudmodel/agreement/AccessTokenManager;-><init>(Landroid/app/Activity;)V

    iput-object v0, p0, Lcom/huawei/health/MainActivity;->f:Lcom/huawei/hwcloudmodel/agreement/AccessTokenManager;

    .line 3456
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->f:Lcom/huawei/hwcloudmodel/agreement/AccessTokenManager;

    iget-object v1, p0, Lcom/huawei/health/MainActivity;->n:Landroid/content/Context;

    iget-object v2, p0, Lcom/huawei/health/MainActivity;->ax:Lcom/huawei/health/MainActivity$f;

    iget-object v3, p0, Lcom/huawei/health/MainActivity;->au:Lcom/huawei/health/MainActivity$k;

    invoke-virtual {v0, v1, v2, v3}, Lcom/huawei/hwcloudmodel/agreement/AccessTokenManager;->hmsConnect(Landroid/content/Context;Lcom/huawei/hms/api/HuaweiApiClient$ConnectionCallbacks;Lcom/huawei/hms/api/HuaweiApiClient$OnConnectionFailedListener;)V

    .line 3457
    return-void
.end method

.method private al()V
    .locals 4

    .line 3530
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "gotoSportTab"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3531
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->o:Lo/abc;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lo/abc;->setCurrentItem(IZ)V

    .line 3532
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->ai:Lo/elw;

    iget-object v1, p0, Lcom/huawei/health/MainActivity;->o:Lo/abc;

    invoke-virtual {v1}, Lo/abc;->getCurrentItem()I

    move-result v1

    invoke-virtual {v0, v1}, Lo/elw;->setItemChecked(I)V

    .line 3533
    return-void
.end method

.method private am()V
    .locals 5

    .line 3514
    new-instance v4, Lo/egy$b;

    iget-object v0, p0, Lcom/huawei/health/MainActivity;->n:Landroid/content/Context;

    invoke-direct {v4, v0}, Lo/egy$b;-><init>(Landroid/content/Context;)V

    .line 3515
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->n:Landroid/content/Context;

    const v1, 0x7f0200cb

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lo/egy$b;->a(Ljava/lang/String;)Lo/egy$b;

    move-result-object v0

    new-instance v1, Lcom/huawei/health/MainActivity$14;

    invoke-direct {v1, p0}, Lcom/huawei/health/MainActivity$14;-><init>(Lcom/huawei/health/MainActivity;)V

    .line 3516
    const v2, 0x7f02046d

    invoke-virtual {v0, v2, v1}, Lo/egy$b;->d(ILandroid/view/View$OnClickListener;)Lo/egy$b;

    .line 3522
    invoke-virtual {v4}, Lo/egy$b;->a()Lo/egy;

    move-result-object v3

    .line 3523
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->n:Landroid/content/Context;

    invoke-static {v0}, Lo/ena;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3524
    invoke-direct {p0}, Lcom/huawei/health/MainActivity;->al()V

    goto :goto_0

    .line 3526
    :cond_0
    invoke-virtual {v3}, Lo/egy;->show()V

    .line 3528
    :goto_0
    return-void
.end method

.method private an()V
    .locals 7

    .line 3600
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->an:Lo/egy;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 3601
    return-void

    .line 3605
    :cond_0
    new-instance v4, Lo/egy$b;

    iget-object v0, p0, Lcom/huawei/health/MainActivity;->n:Landroid/content/Context;

    invoke-direct {v4, v0}, Lo/egy$b;-><init>(Landroid/content/Context;)V

    .line 3606
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->n:Landroid/content/Context;

    const v1, 0x7f0200cb

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lo/egy$b;->a(Ljava/lang/String;)Lo/egy$b;

    move-result-object v0

    new-instance v1, Lcom/huawei/health/MainActivity$15;

    invoke-direct {v1, p0}, Lcom/huawei/health/MainActivity$15;-><init>(Lcom/huawei/health/MainActivity;)V

    .line 3607
    const v2, 0x7f02046d

    invoke-virtual {v0, v2, v1}, Lo/egy$b;->d(ILandroid/view/View$OnClickListener;)Lo/egy$b;

    .line 3613
    invoke-virtual {v4}, Lo/egy$b;->a()Lo/egy;

    move-result-object v3

    .line 3614
    new-instance v5, Lo/egy$b;

    iget-object v0, p0, Lcom/huawei/health/MainActivity;->n:Landroid/content/Context;

    invoke-direct {v5, v0}, Lo/egy$b;-><init>(Landroid/content/Context;)V

    .line 3615
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->n:Landroid/content/Context;

    const v1, 0x7f0200d2

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lo/egy$b;->a(Ljava/lang/String;)Lo/egy$b;

    move-result-object v0

    new-instance v1, Lcom/huawei/health/MainActivity$20;

    invoke-direct {v1, p0, v3}, Lcom/huawei/health/MainActivity$20;-><init>(Lcom/huawei/health/MainActivity;Lo/egy;)V

    const v2, 0x7f0200d4

    invoke-virtual {v0, v2, v1}, Lo/egy$b;->d(ILandroid/view/View$OnClickListener;)Lo/egy$b;

    move-result-object v0

    new-instance v1, Lcom/huawei/health/MainActivity$13;

    invoke-direct {v1, p0}, Lcom/huawei/health/MainActivity$13;-><init>(Lcom/huawei/health/MainActivity;)V

    .line 3628
    const v2, 0x7f0200d5

    invoke-virtual {v0, v2, v1}, Lo/egy$b;->e(ILandroid/view/View$OnClickListener;)Lo/egy$b;

    .line 3634
    new-instance v6, Lo/egy$b;

    iget-object v0, p0, Lcom/huawei/health/MainActivity;->n:Landroid/content/Context;

    invoke-direct {v6, v0}, Lo/egy$b;-><init>(Landroid/content/Context;)V

    .line 3635
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->n:Landroid/content/Context;

    const v1, 0x7f0200d3

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lo/egy$b;->a(Ljava/lang/String;)Lo/egy$b;

    move-result-object v0

    new-instance v1, Lcom/huawei/health/MainActivity$16;

    invoke-direct {v1, p0}, Lcom/huawei/health/MainActivity$16;-><init>(Lcom/huawei/health/MainActivity;)V

    const v2, 0x7f0200d4

    invoke-virtual {v0, v2, v1}, Lo/egy$b;->d(ILandroid/view/View$OnClickListener;)Lo/egy$b;

    move-result-object v0

    new-instance v1, Lcom/huawei/health/MainActivity$19;

    invoke-direct {v1, p0}, Lcom/huawei/health/MainActivity$19;-><init>(Lcom/huawei/health/MainActivity;)V

    .line 3644
    const v2, 0x7f0200d5

    invoke-virtual {v0, v2, v1}, Lo/egy$b;->e(ILandroid/view/View$OnClickListener;)Lo/egy$b;

    .line 3650
    invoke-virtual {v5}, Lo/egy$b;->a()Lo/egy;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/MainActivity;->ak:Lo/egy;

    .line 3651
    invoke-virtual {v6}, Lo/egy$b;->a()Lo/egy;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/MainActivity;->an:Lo/egy;

    .line 3652
    return-void
.end method

.method private ao()V
    .locals 5

    .line 3696
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "registerPrivacyChange"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3698
    new-instance v0, Lcom/huawei/health/MainActivity$e;

    invoke-direct {v0, p0}, Lcom/huawei/health/MainActivity$e;-><init>(Lcom/huawei/health/MainActivity;)V

    iput-object v0, p0, Lcom/huawei/health/MainActivity;->aq:Lcom/huawei/health/MainActivity$e;

    .line 3699
    new-instance v4, Landroid/content/IntentFilter;

    const-string v0, "com.huawei.hihealth.action_change_to_cloud_version"

    invoke-direct {v4, v0}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 3701
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->aq:Lcom/huawei/health/MainActivity$e;

    const-string v1, "com.huawei.hihealth.DEFAULT_PERMISSION"

    const/4 v2, 0x0

    invoke-virtual {p0, v0, v4, v1, v2}, Lcom/huawei/health/MainActivity;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Ljava/lang/String;Landroid/os/Handler;)Landroid/content/Intent;

    .line 3705
    return-void
.end method

.method private ap()V
    .locals 5

    .line 3684
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x1

    :try_start_0
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter unregisterBindDeviceBroadcast()!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3685
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->aD:Landroid/content/BroadcastReceiver;

    invoke-virtual {p0, v0}, Lcom/huawei/health/MainActivity;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1

    .line 3690
    goto :goto_0

    .line 3686
    :catch_0
    move-exception v4

    .line 3687
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/lang/IllegalArgumentException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3690
    goto :goto_0

    .line 3688
    :catch_1
    move-exception v4

    .line 3689
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/lang/RuntimeException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3691
    :goto_0
    return-void
.end method

.method private aq()V
    .locals 5

    .line 3673
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter registerBindDeviceBroadcast()!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3674
    new-instance v4, Landroid/content/IntentFilter;

    invoke-direct {v4}, Landroid/content/IntentFilter;-><init>()V

    .line 3675
    const-string v0, "com.huawei.hihealth.binding_device"

    invoke-virtual {v4, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 3676
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->aD:Landroid/content/BroadcastReceiver;

    const-string v1, "com.huawei.hihealth.DEFAULT_PERMISSION"

    const/4 v2, 0x0

    invoke-virtual {p0, v0, v4, v1, v2}, Lcom/huawei/health/MainActivity;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Ljava/lang/String;Landroid/os/Handler;)Landroid/content/Intent;

    .line 3677
    return-void
.end method

.method private ar()V
    .locals 5

    .line 3710
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->aq:Lcom/huawei/health/MainActivity$e;

    if-eqz v0, :cond_0

    .line 3713
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x1

    :try_start_0
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter unRegisterPrivicyChange"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3714
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->aq:Lcom/huawei/health/MainActivity$e;

    invoke-virtual {p0, v0}, Lcom/huawei/health/MainActivity;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 3715
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/MainActivity;->aq:Lcom/huawei/health/MainActivity$e;
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1

    .line 3720
    goto :goto_0

    .line 3716
    :catch_0
    move-exception v4

    .line 3717
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/lang/IllegalArgumentException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3720
    goto :goto_0

    .line 3718
    :catch_1
    move-exception v4

    .line 3719
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/lang/RuntimeException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3725
    :cond_0
    :goto_0
    return-void
.end method

.method static synthetic b(Lcom/huawei/health/MainActivity;)Landroid/content/Context;
    .locals 1

    .line 179
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->n:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic b(Lcom/huawei/health/MainActivity;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 179
    iput-object p1, p0, Lcom/huawei/health/MainActivity;->ar:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic b(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 179
    sput-object p0, Lcom/huawei/health/MainActivity;->q:Ljava/lang/String;

    return-object p0
.end method

.method private b(I)V
    .locals 9

    .line 3540
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 3541
    const-string v0, "click"

    const-string v1, "1"

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 3542
    if-nez p1, :cond_0

    .line 3543
    sget-object v0, Lo/dae;->bn:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v5

    .line 3544
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/MainActivity;->n:Landroid/content/Context;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v5, v4, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 3545
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/health/MainActivity;->az:J

    .line 3546
    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    if-ne p1, v0, :cond_1

    .line 3547
    sget-object v0, Lo/dae;->ct:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v5

    .line 3548
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/MainActivity;->n:Landroid/content/Context;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v5, v4, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 3549
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/health/MainActivity;->az:J

    .line 3550
    goto :goto_0

    :cond_1
    const/4 v0, 0x3

    if-ne p1, v0, :cond_2

    .line 3551
    sget-object v0, Lo/dae;->dt:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v5

    .line 3552
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/MainActivity;->n:Landroid/content/Context;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v5, v4, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 3553
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/health/MainActivity;->az:J

    .line 3555
    :cond_2
    :goto_0
    iget v0, p0, Lcom/huawei/health/MainActivity;->aA:I

    if-eq p1, v0, :cond_4

    .line 3556
    iget-wide v0, p0, Lcom/huawei/health/MainActivity;->az:J

    iget-wide v2, p0, Lcom/huawei/health/MainActivity;->aG:J

    sub-long v5, v0, v2

    .line 3557
    iget-wide v0, p0, Lcom/huawei/health/MainActivity;->M:J

    sub-long/2addr v5, v0

    .line 3558
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Login_MainActivity"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget v3, p0, Lcom/huawei/health/MainActivity;->aA:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "--stayTime---"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3559
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/health/MainActivity;->M:J

    .line 3560
    new-instance v7, Ljava/util/HashMap;

    invoke-direct {v7}, Ljava/util/HashMap;-><init>()V

    .line 3561
    const-string v0, "pageType"

    iget v1, p0, Lcom/huawei/health/MainActivity;->aA:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v7, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 3562
    const-string v0, "duration"

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v7, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 3563
    const-wide/16 v0, 0x3e8

    cmp-long v0, v5, v0

    if-lez v0, :cond_3

    .line 3564
    sget-object v0, Lo/dae;->bp:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v8

    .line 3565
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/MainActivity;->n:Landroid/content/Context;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v8, v7, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 3567
    :cond_3
    iget-wide v0, p0, Lcom/huawei/health/MainActivity;->az:J

    iput-wide v0, p0, Lcom/huawei/health/MainActivity;->aG:J

    .line 3569
    :cond_4
    iput p1, p0, Lcom/huawei/health/MainActivity;->aA:I

    .line 3570
    return-void
.end method

.method private static b(Landroid/content/Context;Landroid/os/Handler;Ljava/lang/String;Ljava/lang/String;)V
    .locals 12

    .line 2157
    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2158
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MainActivty_signAgrHttp aToken is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2159
    return-void

    .line 2161
    :cond_0
    const/16 v0, 0x2710

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "agr_first_sign_country"

    invoke-static {p0, v0, v1}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 2163
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MainActivty_signAgrHttp country is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v8, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2164
    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2165
    return-void

    .line 2167
    :cond_1
    const/16 v0, 0x2710

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "agr_first_sign_language"

    invoke-static {p0, v0, v1}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 2170
    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 2171
    const/16 v0, 0x76

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v10, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2172
    const/16 v0, 0x2719

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v10, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2173
    new-instance v11, Lcom/huawei/hwcloudmodel/agreement/AgrHttp;

    invoke-direct {v11}, Lcom/huawei/hwcloudmodel/agreement/AgrHttp;-><init>()V

    .line 2174
    move-object v0, v11

    move-object v1, p3

    move-object v2, p2

    move-object v4, v10

    move-object v5, v8

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v6, "_"

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    new-instance v7, Lcom/huawei/health/MainActivity$d;

    invoke-direct {v7, p1, p2, p3}, Lcom/huawei/health/MainActivity$d;-><init>(Landroid/os/Handler;Ljava/lang/String;Ljava/lang/String;)V

    const/4 v3, 0x1

    invoke-virtual/range {v0 .. v7}, Lcom/huawei/hwcloudmodel/agreement/AgrHttp;->signHttpReq(Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;Ljava/lang/String;Ljava/lang/String;Lo/czi;)Ljava/lang/String;

    .line 2176
    return-void
.end method

.method private b(Landroid/view/View;)V
    .locals 5

    .line 765
    const v0, 0x7f1218c2

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/widget/TextView;

    .line 766
    const v0, 0x7f1218d5

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroid/widget/LinearLayout;

    .line 767
    const v0, 0x7f1218d6

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/widget/LinearLayout;

    .line 768
    const/16 v0, 0x8

    invoke-virtual {v3, v0}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 769
    const/16 v0, 0x8

    invoke-virtual {v4, v0}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 771
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->n:Landroid/content/Context;

    const v1, 0x7f02127b

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 772
    return-void
.end method

.method private b(Ljava/lang/String;Ljava/lang/String;)V
    .locals 5

    .line 2936
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 2937
    const-string v2, "1"

    .line 2938
    const-string v0, "click"

    invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2939
    const/4 v0, 0x0

    if-eq v0, p2, :cond_0

    .line 2940
    const-string v0, "type"

    invoke-interface {v1, v0, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2942
    :cond_0
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v3

    .line 2943
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v4

    .line 2944
    const/4 v0, 0x0

    invoke-virtual {v4, v3, p1, v1, v0}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 2945
    return-void
.end method

.method private b(Z)V
    .locals 4

    .line 1536
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->ai:Lo/elw;

    invoke-virtual {v0}, Lo/elw;->removeMenuItems()V

    .line 1537
    if-nez p1, :cond_0

    .line 1538
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->ai:Lo/elw;

    iget-object v1, p0, Lcom/huawei/health/MainActivity;->n:Landroid/content/Context;

    const v2, 0x7f020042

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 1539
    invoke-virtual {p0}, Lcom/huawei/health/MainActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f050778

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    .line 1538
    invoke-virtual {v0, v1, v2}, Lo/elw;->addMenu(Ljava/lang/CharSequence;Landroid/graphics/drawable/Drawable;)Z

    .line 1540
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->ai:Lo/elw;

    iget-object v1, p0, Lcom/huawei/health/MainActivity;->n:Landroid/content/Context;

    const v2, 0x7f020037

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 1541
    invoke-virtual {p0}, Lcom/huawei/health/MainActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f050777

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    .line 1540
    invoke-virtual {v0, v1, v2}, Lo/elw;->addMenu(Ljava/lang/CharSequence;Landroid/graphics/drawable/Drawable;)Z

    .line 1542
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->ai:Lo/elw;

    iget-object v1, p0, Lcom/huawei/health/MainActivity;->n:Landroid/content/Context;

    const v2, 0x7f020043

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 1543
    invoke-virtual {p0}, Lcom/huawei/health/MainActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f050776

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    .line 1542
    invoke-virtual {v0, v1, v2}, Lo/elw;->addMenu(Ljava/lang/CharSequence;Landroid/graphics/drawable/Drawable;)Z

    .line 1544
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->ai:Lo/elw;

    iget-object v1, p0, Lcom/huawei/health/MainActivity;->n:Landroid/content/Context;

    const v2, 0x7f020044

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 1545
    invoke-virtual {p0}, Lcom/huawei/health/MainActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f050779

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    .line 1544
    invoke-virtual {v0, v1, v2}, Lo/elw;->addMenu(Ljava/lang/CharSequence;Landroid/graphics/drawable/Drawable;)Z

    goto :goto_0

    .line 1547
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->ai:Lo/elw;

    iget-object v1, p0, Lcom/huawei/health/MainActivity;->n:Landroid/content/Context;

    const v2, 0x7f020042

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 1548
    invoke-virtual {p0}, Lcom/huawei/health/MainActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f050778

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    .line 1547
    invoke-virtual {v0, v1, v2}, Lo/elw;->addMenu(Ljava/lang/CharSequence;Landroid/graphics/drawable/Drawable;)Z

    .line 1549
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->ai:Lo/elw;

    iget-object v1, p0, Lcom/huawei/health/MainActivity;->n:Landroid/content/Context;

    const v2, 0x7f020037

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 1550
    invoke-virtual {p0}, Lcom/huawei/health/MainActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f050777

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    .line 1549
    invoke-virtual {v0, v1, v2}, Lo/elw;->addMenu(Ljava/lang/CharSequence;Landroid/graphics/drawable/Drawable;)Z

    .line 1551
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->ai:Lo/elw;

    iget-object v1, p0, Lcom/huawei/health/MainActivity;->n:Landroid/content/Context;

    const v2, 0x7f020044

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 1552
    invoke-virtual {p0}, Lcom/huawei/health/MainActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f050779

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    .line 1551
    invoke-virtual {v0, v1, v2}, Lo/elw;->addMenu(Ljava/lang/CharSequence;Landroid/graphics/drawable/Drawable;)Z

    .line 1554
    :goto_0
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->ai:Lo/elw;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/elw;->setItemChecked(I)V

    .line 1555
    return-void
.end method

.method static synthetic b(Lcom/huawei/health/MainActivity;Z)Z
    .locals 0

    .line 179
    iput-boolean p1, p0, Lcom/huawei/health/MainActivity;->I:Z

    return p1
.end method

.method static synthetic c(Lcom/huawei/health/MainActivity;)Ljava/lang/String;
    .locals 1

    .line 179
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->g:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic c(Landroid/os/Handler;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 179
    invoke-static {p0, p1, p2}, Lcom/huawei/health/MainActivity;->a(Landroid/os/Handler;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private c(Landroid/view/View;)V
    .locals 9

    .line 752
    const v0, 0x7f1218c2

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroid/widget/TextView;

    .line 753
    const v0, 0x7f1218c4

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/widget/TextView;

    .line 754
    const v0, 0x7f1218c6

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/widget/TextView;

    .line 756
    new-instance v6, Ljava/text/SimpleDateFormat;

    const-string v0, "yyyy/MM/dd"

    invoke-direct {v6, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 757
    new-instance v0, Ljava/util/Date;

    invoke-static {}, Lo/dbf;->k()J

    move-result-wide v1

    invoke-direct {v0, v1, v2}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v6, v0}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v7

    .line 758
    new-instance v0, Ljava/util/Date;

    invoke-static {}, Lo/dbf;->h()J

    move-result-wide v1

    invoke-direct {v0, v1, v2}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v6, v0}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v8

    .line 759
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/huawei/health/MainActivity;->n:Landroid/content/Context;

    const v2, 0x7f02127c

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "~"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 760
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->n:Landroid/content/Context;

    const v1, 0x7f02127e

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 761
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->n:Landroid/content/Context;

    const v1, 0x7f02127d

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 762
    return-void
.end method

.method static synthetic c(Lcom/huawei/health/MainActivity;I)V
    .locals 0

    .line 179
    invoke-direct {p0, p1}, Lcom/huawei/health/MainActivity;->b(I)V

    return-void
.end method

.method static synthetic d(Lcom/huawei/health/MainActivity;)Ljava/lang/String;
    .locals 1

    .line 179
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->i:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic d(Lcom/huawei/health/MainActivity;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 179
    iput-object p1, p0, Lcom/huawei/health/MainActivity;->w:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic d(Lcom/huawei/health/MainActivity;Lo/alh;)Lo/alh;
    .locals 0

    .line 179
    iput-object p1, p0, Lcom/huawei/health/MainActivity;->G:Lo/alh;

    return-object p1
.end method

.method private d(I)V
    .locals 6

    .line 462
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->m:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_2

    .line 463
    const/16 v0, 0x8

    if-ne v0, p1, :cond_0

    .line 464
    return-void

    .line 467
    :cond_0
    const v0, 0x7f12144b

    invoke-virtual {p0, v0}, Lcom/huawei/health/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/view/ViewStub;

    .line 468
    const/4 v0, 0x0

    if-ne v0, v4, :cond_1

    .line 469
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setStartPageVisibility ViewStub is loaded fail."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 470
    return-void

    .line 473
    :cond_1
    invoke-virtual {v4}, Landroid/view/ViewStub;->inflate()Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/health/MainActivity;->m:Landroid/widget/LinearLayout;

    .line 474
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "init start page ok."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 477
    invoke-static {}, Lo/dbf;->f()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/huawei/health/MainActivity;->n:Landroid/content/Context;

    invoke-static {v0}, Lo/dbf;->w(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 478
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->m:Landroid/widget/LinearLayout;

    const v1, 0x7f12144f

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/widget/ImageView;

    .line 479
    const v0, 0x7f06000a

    invoke-virtual {v5, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 480
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "init start page icon ok."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 484
    :cond_2
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->m:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 485
    return-void
.end method

.method private d(Landroid/content/Context;)V
    .locals 2

    .line 1329
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->af:Lo/egn;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 1330
    new-instance v0, Lo/egn;

    const v1, 0x7f0e028e

    invoke-direct {v0, p1, v1}, Lo/egn;-><init>(Landroid/content/Context;I)V

    invoke-static {p1}, Lo/egn;->a(Landroid/content/Context;)Lo/egn;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/MainActivity;->af:Lo/egn;

    .line 1331
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->af:Lo/egn;

    const v1, 0x7f0206c2

    invoke-virtual {p1, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egn;->e(Ljava/lang/String;)V

    .line 1332
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->af:Lo/egn;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egn;->setCancelable(Z)V

    .line 1335
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->af:Lo/egn;

    invoke-virtual {v0}, Lo/egn;->a()V

    .line 1336
    return-void
.end method

.method private static d(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 11

    .line 2247
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter_handleAgrResData"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2248
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 2249
    return-void

    .line 2253
    :cond_0
    :try_start_0
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4, p2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 2254
    const-string v0, "errorCode"

    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v5

    .line 2255
    if-eqz v5, :cond_1

    .line 2256
    return-void

    .line 2259
    :cond_1
    const/16 v0, 0x2710

    :try_start_1
    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "agr_last_query_time"

    .line 2260
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lo/dcy;

    invoke-direct {v3}, Lo/dcy;-><init>()V

    .line 2259
    invoke-static {p0, v0, v1, v2, v3}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 2261
    const-string v0, "signInfo"

    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v6

    .line 2262
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "agr_query_sign_response JSONArray "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Lorg/json/JSONArray;->length()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2263
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 2264
    invoke-virtual {v6}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-lez v0, :cond_5

    .line 2265
    const/4 v8, 0x0

    :goto_0
    invoke-virtual {v6}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-ge v8, v0, :cond_4

    .line 2266
    invoke-virtual {v6, v8}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v9

    .line 2267
    const-string v0, "needSign"

    invoke-virtual {v9, v0}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 2268
    const-string v0, "agrType"

    invoke-virtual {v9, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v10

    .line 2269
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "agr_query_sign_response agrType "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "agrType"

    invoke-virtual {v9, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2270
    const/16 v0, 0x76

    if-eq v10, v0, :cond_2

    const/16 v0, 0x2719

    if-ne v10, v0, :cond_3

    .line 2271
    :cond_2
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v7, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2265
    :cond_3
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    :cond_4
    goto :goto_1

    .line 2277
    :cond_5
    const/16 v0, 0x76

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v7, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2279
    const/16 v0, 0x2719

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v7, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2281
    :goto_1
    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v0

    if-gtz v0, :cond_6

    .line 2282
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "QueryAgrResInfo list is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    .line 2283
    return-void

    .line 2285
    :cond_6
    const/4 v0, 0x2

    :try_start_2
    new-array v8, v0, [I

    .line 2286
    const/4 v9, 0x0

    :goto_2
    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v0

    if-ge v9, v0, :cond_9

    .line 2287
    invoke-interface {v7, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/16 v1, 0x76

    if-ne v0, v1, :cond_7

    .line 2288
    const/4 v0, 0x1

    const/4 v1, 0x0

    aput v0, v8, v1

    .line 2290
    :cond_7
    invoke-interface {v7, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/16 v1, 0x2719

    if-ne v0, v1, :cond_8

    .line 2291
    const/4 v0, 0x1

    const/4 v1, 0x1

    aput v0, v8, v1

    .line 2286
    :cond_8
    add-int/lit8 v9, v9, 0x1

    goto :goto_2

    .line 2294
    :cond_9
    const/4 v0, 0x0

    aget v0, v8, v0

    const/4 v1, 0x1

    aget v1, v8, v1

    mul-int/lit8 v1, v1, 0x2

    add-int v9, v0, v1

    .line 2295
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Show Sign Dialog Type "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2296
    new-instance v10, Lo/cbo;

    invoke-direct {v10}, Lo/cbo;-><init>()V

    .line 2297
    invoke-virtual {v10, p1, p0, v9, p3}, Lo/cbo;->b(Ljava/lang/String;Landroid/content/Context;ILjava/lang/String;)V
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_0

    .line 2300
    goto :goto_3

    .line 2298
    :catch_0
    move-exception v4

    .line 2299
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Show Sign Dialog JSONException "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2301
    :goto_3
    return-void
.end method

.method private d(Ljava/lang/String;)V
    .locals 5

    .line 2927
    :try_start_0
    new-instance v4, Landroid/content/Intent;

    invoke-direct {v4}, Landroid/content/Intent;-><init>()V

    .line 2928
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->n:Landroid/content/Context;

    invoke-virtual {v4, v0, p1}, Landroid/content/Intent;->setClassName(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    .line 2929
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->n:Landroid/content/Context;

    invoke-virtual {v0, v4}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 2932
    goto :goto_0

    .line 2930
    :catch_0
    move-exception v4

    .line 2931
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startActivity catch e:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2933
    :goto_0
    return-void
.end method

.method private d(Ljava/lang/String;Ljava/lang/String;)V
    .locals 6

    .line 2304
    const-string v0, "0"

    iget-object v1, p0, Lcom/huawei/health/MainActivity;->e:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2305
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Show Sign Dialog lastTime have cancel "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2306
    const/4 v4, 0x0

    .line 2308
    :try_start_0
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->n:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "agr_cancel_or_agree_type"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    move v4, v0

    .line 2313
    goto :goto_0

    .line 2310
    :catch_0
    move-exception v5

    .line 2312
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "parseLong Exception"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v5}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2315
    :goto_0
    new-instance v5, Lo/cbo;

    invoke-direct {v5}, Lo/cbo;-><init>()V

    .line 2316
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->n:Landroid/content/Context;

    invoke-virtual {v5, p1, v0, v4, p2}, Lo/cbo;->b(Ljava/lang/String;Landroid/content/Context;ILjava/lang/String;)V

    .line 2319
    :cond_0
    return-void
.end method

.method private d(Ljava/util/Map;Ljava/util/Map;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Integer;>;Ljava/util/Map<Ljava/lang/String;Ljava/lang/Integer;>;)V"
        }
    .end annotation

    .line 2713
    const/4 v0, 0x2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/16 v1, 0x102

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2714
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/16 v1, 0x101

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2715
    const/4 v0, 0x3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/16 v1, 0x103

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2716
    const-string v0, "km"

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2717
    const-string v0, "m"

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2718
    const-string v0, "s"

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2719
    const-string v0, "cal"

    const/4 v1, 0x2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2720
    return-void
.end method

.method static synthetic d(Z)Z
    .locals 0

    .line 179
    sput-boolean p0, Lcom/huawei/health/MainActivity;->W:Z

    return p0
.end method

.method static synthetic e(Lcom/huawei/health/MainActivity;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 179
    iput-object p1, p0, Lcom/huawei/health/MainActivity;->y:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic e(Lcom/huawei/health/MainActivity;)Lo/ale;
    .locals 1

    .line 179
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->u:Lo/ale;

    return-object v0
.end method

.method private e(I)V
    .locals 4

    .line 2875
    invoke-virtual {p0}, Lcom/huawei/health/MainActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2876
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_0

    invoke-static {}, Lo/dbf;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2877
    invoke-virtual {p0}, Lcom/huawei/health/MainActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/view/Window;->setNavigationBarColor(I)V

    .line 2879
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "refreshNavigationBar() Color = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2882
    :cond_0
    return-void
.end method

.method static synthetic e(Landroid/content/Context;Landroid/os/Handler;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 179
    invoke-static {p0, p1, p2, p3}, Lcom/huawei/health/MainActivity;->b(Landroid/content/Context;Landroid/os/Handler;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method static synthetic e(Lcom/huawei/health/MainActivity;Ljava/lang/Object;)V
    .locals 0

    .line 179
    invoke-direct {p0, p1}, Lcom/huawei/health/MainActivity;->e(Ljava/lang/Object;)V

    return-void
.end method

.method static synthetic e(Lcom/huawei/health/MainActivity;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 179
    invoke-direct {p0, p1, p2}, Lcom/huawei/health/MainActivity;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private e(Ljava/lang/Object;)V
    .locals 2

    .line 3338
    move-object v1, p1

    check-cast v1, Lcom/huawei/common/GuardianAccount;

    .line 3339
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->u:Lo/ale;

    invoke-virtual {v0, v1}, Lo/ale;->a(Lcom/huawei/common/GuardianAccount;)V

    .line 3341
    return-void
.end method

.method static synthetic e(Lcom/huawei/health/MainActivity;Z)Z
    .locals 0

    .line 179
    iput-boolean p1, p0, Lcom/huawei/health/MainActivity;->P:Z

    return p1
.end method

.method static synthetic f(Lcom/huawei/health/MainActivity;)Landroid/os/Handler;
    .locals 1

    .line 179
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->t:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic f()Ljava/lang/Object;
    .locals 1

    .line 179
    sget-object v0, Lcom/huawei/health/MainActivity;->r:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic g(Lcom/huawei/health/MainActivity;)Lcom/huawei/hms/api/HuaweiApiClient;
    .locals 1

    .line 179
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->S:Lcom/huawei/hms/api/HuaweiApiClient;

    return-object v0
.end method

.method static synthetic g()Ljava/lang/String;
    .locals 1

    .line 179
    sget-object v0, Lcom/huawei/health/MainActivity;->s:Ljava/lang/String;

    return-object v0
.end method

.method private h()V
    .locals 6

    .line 365
    invoke-virtual {p0}, Lcom/huawei/health/MainActivity;->getIntent()Landroid/content/Intent;

    move-result-object v4

    .line 366
    if-eqz v4, :cond_0

    .line 368
    const-string v0, "webUrl"

    :try_start_0
    invoke-virtual {v4, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/MainActivity;->w:Ljava/lang/String;

    .line 369
    const-string v0, "weekMonthReportUri"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Landroid/net/Uri;

    iput-object v0, p0, Lcom/huawei/health/MainActivity;->z:Landroid/net/Uri;

    .line 370
    const-string v0, "schemeUrl"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/MainActivity;->x:Ljava/lang/String;

    .line 371
    const-string v0, "healthgroup"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/MainActivity;->y:Ljava/lang/String;

    .line 372
    const-string v0, "extra"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->getBundleExtra(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/MainActivity;->C:Landroid/os/Bundle;

    .line 373
    const-string v0, "health_smartmsg_id"

    const/4 v1, -0x1

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/huawei/health/MainActivity;->v:I

    .line 374
    const-string v0, "health_smartmsg_type"

    const/4 v1, -0x1

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/huawei/health/MainActivity;->j:I

    .line 375
    const-string v0, "health_smartmsg_content"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/MainActivity;->B:Ljava/lang/String;

    .line 376
    const-string v0, "schemeDataType"

    const/4 v1, -0x1

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/huawei/health/MainActivity;->H:I

    .line 377
    const-string v0, " schemeParamUri"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Landroid/net/Uri;

    iput-object v0, p0, Lcom/huawei/health/MainActivity;->E:Landroid/net/Uri;

    .line 379
    const-string v0, "device_type"

    const/4 v1, -0x1

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/huawei/health/MainActivity;->J:I

    .line 380
    const-string v0, "dname"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/MainActivity;->R:Ljava/lang/String;

    .line 381
    const-string v0, "isPorc"

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/health/MainActivity;->O:Z

    .line 383
    const-string v0, "health_activity_id"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/MainActivity;->A:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 387
    goto :goto_0

    .line 385
    :catch_0
    move-exception v5

    .line 386
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MainActivity encounteredClassNotFoundException "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v5}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 388
    :goto_0
    invoke-direct {p0, v4}, Lcom/huawei/health/MainActivity;->a(Landroid/content/Intent;)V

    .line 390
    const-string v0, "isFromTrainDetail"

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/health/MainActivity;->al:Z

    .line 391
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mIsFromTrainDetail = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-boolean v2, p0, Lcom/huawei/health/MainActivity;->al:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 393
    :cond_0
    const-string v0, "Login_MainActivity"

    const/16 v1, 0x10

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mSchemeUrl:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/health/MainActivity;->x:Ljava/lang/String;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ", smartMsgId="

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget v2, p0, Lcom/huawei/health/MainActivity;->v:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, ", smartMsgType="

    const/4 v3, 0x4

    aput-object v2, v1, v3

    iget v2, p0, Lcom/huawei/health/MainActivity;->j:I

    .line 394
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    const-string v2, ", smartMsgContent="

    const/4 v3, 0x6

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/health/MainActivity;->B:Ljava/lang/String;

    const/4 v3, 0x7

    aput-object v2, v1, v3

    const-string v2, "  deviceType:"

    const/16 v3, 0x8

    aput-object v2, v1, v3

    iget v2, p0, Lcom/huawei/health/MainActivity;->J:I

    .line 395
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/16 v3, 0x9

    aput-object v2, v1, v3

    const-string v2, "  productName:"

    const/16 v3, 0xa

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/health/MainActivity;->R:Ljava/lang/String;

    const/16 v3, 0xb

    aput-object v2, v1, v3

    const-string v2, "  isPorc:"

    const/16 v3, 0xc

    aput-object v2, v1, v3

    iget-boolean v2, p0, Lcom/huawei/health/MainActivity;->O:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/16 v3, 0xd

    aput-object v2, v1, v3

    const-string v2, ", mSchemeGroup:"

    const/16 v3, 0xe

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/health/MainActivity;->y:Ljava/lang/String;

    const/16 v3, 0xf

    aput-object v2, v1, v3

    .line 393
    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 397
    return-void
.end method

.method static synthetic h(Lcom/huawei/health/MainActivity;)Z
    .locals 1

    .line 179
    iget-boolean v0, p0, Lcom/huawei/health/MainActivity;->I:Z

    return v0
.end method

.method static synthetic i(Lcom/huawei/health/MainActivity;)Z
    .locals 1

    .line 179
    iget-boolean v0, p0, Lcom/huawei/health/MainActivity;->P:Z

    return v0
.end method

.method static synthetic j(Lcom/huawei/health/MainActivity;)Landroid/net/Uri;
    .locals 1

    .line 179
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->z:Landroid/net/Uri;

    return-object v0
.end method

.method private j()V
    .locals 2

    .line 1339
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->af:Lo/egn;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 1340
    return-void

    .line 1343
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->af:Lo/egn;

    invoke-virtual {v0}, Lo/egn;->dismiss()V

    .line 1344
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/MainActivity;->af:Lo/egn;

    .line 1345
    return-void
.end method

.method static synthetic k()Ljava/lang/String;
    .locals 1

    .line 179
    sget-object v0, Lcom/huawei/health/MainActivity;->q:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic k(Lcom/huawei/health/MainActivity;)V
    .locals 0

    .line 179
    invoke-direct {p0}, Lcom/huawei/health/MainActivity;->ad()V

    return-void
.end method

.method private l()V
    .locals 5

    .line 604
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->n:Landroid/content/Context;

    const/16 v1, 0x2715

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "show_privacy_dlg"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 607
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " forceShowPrivacyDlg : "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 608
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 610
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mOveTermsVersion : "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "1"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " mShowOveUpdateTerms : "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/health/MainActivity;->i:Ljava/lang/String;

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 613
    const-string v0, "1"

    iget-object v1, p0, Lcom/huawei/health/MainActivity;->i:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "must"

    .line 614
    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 615
    :cond_0
    new-instance v0, Lo/cbm$d;

    iget-object v1, p0, Lcom/huawei/health/MainActivity;->n:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/cbm$d;-><init>(Landroid/content/Context;)V

    iget-object v1, p0, Lcom/huawei/health/MainActivity;->u:Lo/ale;

    invoke-virtual {v0, v1}, Lo/cbm$d;->d(Lo/ale;)Lo/cbm;

    move-result-object v0

    invoke-virtual {v0}, Lo/cbm;->show()V

    .line 616
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/health/MainActivity;->ao:Z

    goto :goto_0

    .line 618
    :cond_1
    invoke-direct {p0}, Lcom/huawei/health/MainActivity;->m()V

    goto :goto_0

    .line 622
    :cond_2
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "gotoADAndMain else mTermsVersion : "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "5"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " mShowUpdateTerms : "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/health/MainActivity;->g:Ljava/lang/String;

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 625
    const-string v0, "5"

    iget-object v1, p0, Lcom/huawei/health/MainActivity;->g:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    const-string v0, "must"

    .line 626
    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 627
    :cond_3
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->u:Lo/ale;

    invoke-virtual {v0}, Lo/ale;->a()V

    .line 628
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/health/MainActivity;->ao:Z

    goto :goto_0

    .line 630
    :cond_4
    invoke-direct {p0}, Lcom/huawei/health/MainActivity;->m()V

    .line 633
    :goto_0
    return-void
.end method

.method static synthetic l(Lcom/huawei/health/MainActivity;)V
    .locals 0

    .line 179
    invoke-direct {p0}, Lcom/huawei/health/MainActivity;->ak()V

    return-void
.end method

.method static synthetic m(Lcom/huawei/health/MainActivity;)I
    .locals 1

    .line 179
    iget v0, p0, Lcom/huawei/health/MainActivity;->j:I

    return v0
.end method

.method private m()V
    .locals 8

    .line 637
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->n:Landroid/content/Context;

    const/16 v1, 0x2715

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "health_guide_page"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 639
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->n:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/LoginInit;->getIsLogined()Z

    move-result v5

    .line 640
    invoke-static {}, Lo/czu;->e()Z

    move-result v6

    .line 641
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x5

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "start enter splash ad activity."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, " isFirstIn = "

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x2

    aput-object v4, v1, v2

    const-string v2, " isLogined = "

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 643
    if-eqz v5, :cond_3

    if-nez v6, :cond_3

    const-string v0, "health_app_first_start"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 644
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->n:Landroid/content/Context;

    const/16 v1, 0x2715

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "health_ad_splash_switch"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 646
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {v7}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->n:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/health/ad/HiAdSplashActivity;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, Lcom/huawei/health/MainActivity;->ad:Z

    .line 647
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " isAvailableAds = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-boolean v2, p0, Lcom/huawei/health/MainActivity;->ad:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 648
    iget-boolean v0, p0, Lcom/huawei/health/MainActivity;->ad:Z

    if-eqz v0, :cond_2

    .line 649
    invoke-direct {p0}, Lcom/huawei/health/MainActivity;->n()V

    goto :goto_1

    .line 651
    :cond_2
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/huawei/health/MainActivity;->d(I)V

    .line 653
    :goto_1
    goto :goto_2

    .line 654
    :cond_3
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/huawei/health/MainActivity;->d(I)V

    .line 658
    :goto_2
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->u:Lo/ale;

    invoke-virtual {v0}, Lo/ale;->e()V

    .line 659
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->u:Lo/ale;

    invoke-virtual {v0}, Lo/ale;->g()V

    .line 661
    if-nez v6, :cond_4

    .line 662
    invoke-direct {p0}, Lcom/huawei/health/MainActivity;->y()V

    .line 663
    invoke-direct {p0}, Lcom/huawei/health/MainActivity;->T()V

    .line 665
    :cond_4
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->ai:Lo/elw;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/elw;->setVisibility(I)V

    .line 666
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->o:Lo/abc;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/abc;->setVisibility(I)V

    .line 667
    return-void
.end method

.method static synthetic n(Lcom/huawei/health/MainActivity;)Lo/alh;
    .locals 1

    .line 179
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->G:Lo/alh;

    return-object v0
.end method

.method private n()V
    .locals 5

    .line 671
    :try_start_0
    new-instance v4, Landroid/content/Intent;

    const-class v0, Lcom/huawei/health/ad/HiAdSplashActivity;

    invoke-direct {v4, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 672
    const/high16 v0, 0x10000

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 673
    invoke-virtual {p0, v4}, Lcom/huawei/health/MainActivity;->startActivity(Landroid/content/Intent;)V

    .line 674
    const v0, 0x7f08000a

    const v1, 0x7f08000a

    invoke-virtual {p0, v0, v1}, Lcom/huawei/health/MainActivity;->overridePendingTransition(II)V

    .line 675
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "end enter splash ad activity."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 677
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->n:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f11016c

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-direct {p0, v0}, Lcom/huawei/health/MainActivity;->e(I)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 680
    goto :goto_0

    .line 678
    :catch_0
    move-exception v4

    .line 679
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "end enter splash ad activity. IllegalArgumentException"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 681
    :goto_0
    return-void
.end method

.method static synthetic o(Lcom/huawei/health/MainActivity;)Lo/alj;
    .locals 1

    .line 179
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->F:Lo/alj;

    return-object v0
.end method

.method private o()V
    .locals 2

    .line 438
    const-string v0, "TimeEat_MainActivity"

    const-string v1, "Enter handleOtherStart"

    invoke-static {v0, v1}, Lo/dbf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 440
    new-instance v0, Lo/esa;

    invoke-direct {v0}, Lo/esa;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/MainActivity;->ap:Lo/esa;

    .line 441
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->ap:Lo/esa;

    invoke-virtual {v0}, Lo/esa;->a()V

    .line 445
    invoke-static {}, Lo/dbf;->q()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-nez v0, :cond_0

    .line 446
    invoke-direct {p0}, Lcom/huawei/health/MainActivity;->Y()V

    .line 449
    :cond_0
    invoke-direct {p0}, Lcom/huawei/health/MainActivity;->ag()V

    .line 451
    invoke-direct {p0}, Lcom/huawei/health/MainActivity;->Z()V

    .line 453
    invoke-direct {p0}, Lcom/huawei/health/MainActivity;->aa()V

    .line 455
    invoke-direct {p0}, Lcom/huawei/health/MainActivity;->aq()V

    .line 456
    invoke-static {}, Lo/ahd;->i()V

    .line 457
    invoke-static {}, Lo/ahd;->b()V

    .line 458
    const-string v0, "TimeEat_MainActivity"

    const-string v1, "Leave handleOtherStart"

    invoke-static {v0, v1}, Lo/dbf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 459
    return-void
.end method

.method private p()V
    .locals 8

    .line 400
    const-string v0, "TimeEat_MainActivity"

    const-string v1, "Enter handleADAndStart"

    invoke-static {v0, v1}, Lo/dbf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 402
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->n:Landroid/content/Context;

    const/16 v1, 0x2715

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "health_guide_page"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 404
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->n:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "hw_health_show_update_terms"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/MainActivity;->g:Ljava/lang/String;

    .line 405
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->n:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "hw_health_show_update_ove_terms"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/MainActivity;->i:Ljava/lang/String;

    .line 407
    const-string v0, "health_app_first_start"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "5"

    iget-object v1, p0, Lcom/huawei/health/MainActivity;->g:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "1"

    iget-object v1, p0, Lcom/huawei/health/MainActivity;->i:Ljava/lang/String;

    .line 408
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 409
    :cond_0
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/huawei/health/MainActivity;->d(I)V

    .line 414
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->n:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "health_user_agree"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/health/MainActivity;->s:Ljava/lang/String;

    .line 415
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "agree="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    sget-object v2, Lcom/huawei/health/MainActivity;->s:Ljava/lang/String;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " mShowUpdateTerms = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/health/MainActivity;->g:Ljava/lang/String;

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, " mTermsVersion = "

    const/4 v3, 0x4

    aput-object v2, v1, v3

    const-string v2, "5"

    const/4 v3, 0x5

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 418
    invoke-static {}, Lo/dbf;->f()Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/huawei/health/MainActivity;->n:Landroid/content/Context;

    invoke-static {v0}, Lo/dbf;->w(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 419
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    .line 420
    invoke-static {}, Lo/dbf;->k()J

    move-result-wide v0

    cmp-long v0, v0, v5

    if-gtz v0, :cond_3

    invoke-static {}, Lo/dbf;->h()J

    move-result-wide v0

    cmp-long v0, v5, v0

    if-gtz v0, :cond_3

    .line 421
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->n:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "health_beta_user_agree"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 422
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " betaAgree = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v7, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 423
    const-string v0, "1"

    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 424
    invoke-direct {p0}, Lcom/huawei/health/MainActivity;->q()V

    goto :goto_0

    .line 426
    :cond_2
    invoke-direct {p0}, Lcom/huawei/health/MainActivity;->l()V

    .line 428
    :goto_0
    goto :goto_1

    .line 429
    :cond_3
    invoke-direct {p0}, Lcom/huawei/health/MainActivity;->s()V

    .line 431
    :goto_1
    goto :goto_2

    .line 432
    :cond_4
    invoke-direct {p0}, Lcom/huawei/health/MainActivity;->l()V

    .line 434
    :goto_2
    const-string v0, "TimeEat_MainActivity"

    const-string v1, "Leave handleADAndStart"

    invoke-static {v0, v1}, Lo/dbf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 435
    return-void
.end method

.method static synthetic p(Lcom/huawei/health/MainActivity;)V
    .locals 0

    .line 179
    invoke-direct {p0}, Lcom/huawei/health/MainActivity;->am()V

    return-void
.end method

.method private q()V
    .locals 5

    .line 706
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->n:Landroid/content/Context;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/huawei/health/MainActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/huawei/health/MainActivity;->isDestroyed()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 707
    :cond_0
    return-void

    .line 709
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->n:Landroid/content/Context;

    const v1, 0x7f0703dc

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v3

    .line 710
    invoke-direct {p0, v3}, Lcom/huawei/health/MainActivity;->c(Landroid/view/View;)V

    .line 711
    new-instance v0, Lo/egw$c;

    iget-object v1, p0, Lcom/huawei/health/MainActivity;->n:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/egw$c;-><init>(Landroid/content/Context;)V

    iget-object v1, p0, Lcom/huawei/health/MainActivity;->n:Landroid/content/Context;

    .line 712
    const v2, 0x7f021420

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egw$c;->a(Ljava/lang/String;)Lo/egw$c;

    move-result-object v0

    .line 713
    invoke-virtual {v0, v3}, Lo/egw$c;->e(Landroid/view/View;)Lo/egw$c;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/MainActivity;->n:Landroid/content/Context;

    .line 714
    const v2, 0x7f020005

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/huawei/health/MainActivity$21;

    invoke-direct {v2, p0}, Lcom/huawei/health/MainActivity$21;-><init>(Lcom/huawei/health/MainActivity;)V

    invoke-virtual {v0, v1, v2}, Lo/egw$c;->c(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egw$c;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/MainActivity;->n:Landroid/content/Context;

    .line 723
    const v2, 0x7f020004

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/huawei/health/MainActivity$17;

    invoke-direct {v2, p0}, Lcom/huawei/health/MainActivity$17;-><init>(Lcom/huawei/health/MainActivity;)V

    invoke-virtual {v0, v1, v2}, Lo/egw$c;->a(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egw$c;

    move-result-object v0

    .line 746
    invoke-virtual {v0}, Lo/egw$c;->e()Lo/egw;

    move-result-object v4

    .line 747
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Lo/egw;->setCancelable(Z)V

    .line 748
    invoke-virtual {v4}, Lo/egw;->show()V

    .line 749
    return-void
.end method

.method static synthetic q(Lcom/huawei/health/MainActivity;)V
    .locals 0

    .line 179
    invoke-direct {p0}, Lcom/huawei/health/MainActivity;->U()V

    return-void
.end method

.method private r()V
    .locals 4

    .line 896
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleClick"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 897
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cbu;->c(Landroid/content/Context;)Lo/cbu;

    move-result-object v0

    invoke-virtual {v0}, Lo/cbu;->a()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 900
    invoke-static {}, Lo/cbl;->b()Lo/cbl;

    move-result-object v0

    invoke-virtual {v0, p0}, Lo/cbl;->e(Landroid/content/Context;)V

    .line 902
    :cond_0
    return-void
.end method

.method static synthetic r(Lcom/huawei/health/MainActivity;)V
    .locals 0

    .line 179
    invoke-direct {p0}, Lcom/huawei/health/MainActivity;->o()V

    return-void
.end method

.method static synthetic s(Lcom/huawei/health/MainActivity;)Lo/abc;
    .locals 1

    .line 179
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->o:Lo/abc;

    return-object v0
.end method

.method private s()V
    .locals 5

    .line 684
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->n:Landroid/content/Context;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/huawei/health/MainActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/huawei/health/MainActivity;->isDestroyed()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 685
    :cond_0
    return-void

    .line 687
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->n:Landroid/content/Context;

    const v1, 0x7f0703dc

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v3

    .line 688
    invoke-direct {p0, v3}, Lcom/huawei/health/MainActivity;->b(Landroid/view/View;)V

    .line 689
    new-instance v0, Lo/egw$c;

    iget-object v1, p0, Lcom/huawei/health/MainActivity;->n:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/egw$c;-><init>(Landroid/content/Context;)V

    iget-object v1, p0, Lcom/huawei/health/MainActivity;->n:Landroid/content/Context;

    .line 690
    const v2, 0x7f021420

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egw$c;->a(Ljava/lang/String;)Lo/egw$c;

    move-result-object v0

    .line 691
    invoke-virtual {v0, v3}, Lo/egw$c;->e(Landroid/view/View;)Lo/egw$c;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/MainActivity;->n:Landroid/content/Context;

    .line 692
    const v2, 0x7f0212d2

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/huawei/health/MainActivity$12;

    invoke-direct {v2, p0}, Lcom/huawei/health/MainActivity$12;-><init>(Lcom/huawei/health/MainActivity;)V

    invoke-virtual {v0, v1, v2}, Lo/egw$c;->a(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egw$c;

    move-result-object v0

    .line 700
    invoke-virtual {v0}, Lo/egw$c;->e()Lo/egw;

    move-result-object v4

    .line 701
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Lo/egw;->setCancelable(Z)V

    .line 702
    invoke-virtual {v4}, Lo/egw;->show()V

    .line 703
    return-void
.end method

.method private t()V
    .locals 4

    .line 775
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initHMS enter: "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 776
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->at:Lcom/huawei/health/MainActivity$c;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/health/MainActivity;->au:Lcom/huawei/health/MainActivity$k;

    if-eqz v0, :cond_0

    .line 777
    new-instance v0, Lcom/huawei/hms/api/HuaweiApiClient$Builder;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/huawei/hms/api/HuaweiApiClient$Builder;-><init>(Landroid/content/Context;)V

    sget-object v1, Lcom/huawei/hms/support/api/push/HuaweiPush;->PUSH_API:Lcom/huawei/hms/api/Api;

    .line 778
    invoke-virtual {v0, v1}, Lcom/huawei/hms/api/HuaweiApiClient$Builder;->addApi(Lcom/huawei/hms/api/Api;)Lcom/huawei/hms/api/HuaweiApiClient$Builder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/MainActivity;->at:Lcom/huawei/health/MainActivity$c;

    .line 779
    invoke-virtual {v0, v1}, Lcom/huawei/hms/api/HuaweiApiClient$Builder;->addConnectionCallbacks(Lcom/huawei/hms/api/HuaweiApiClient$ConnectionCallbacks;)Lcom/huawei/hms/api/HuaweiApiClient$Builder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/MainActivity;->au:Lcom/huawei/health/MainActivity$k;

    .line 780
    invoke-virtual {v0, v1}, Lcom/huawei/hms/api/HuaweiApiClient$Builder;->addOnConnectionFailedListener(Lcom/huawei/hms/api/HuaweiApiClient$OnConnectionFailedListener;)Lcom/huawei/hms/api/HuaweiApiClient$Builder;

    move-result-object v0

    .line 781
    invoke-virtual {v0}, Lcom/huawei/hms/api/HuaweiApiClient$Builder;->build()Lcom/huawei/hms/api/HuaweiApiClient;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/MainActivity;->S:Lcom/huawei/hms/api/HuaweiApiClient;

    .line 783
    :cond_0
    return-void
.end method

.method static synthetic t(Lcom/huawei/health/MainActivity;)V
    .locals 0

    .line 179
    invoke-direct {p0}, Lcom/huawei/health/MainActivity;->C()V

    return-void
.end method

.method static synthetic u(Lcom/huawei/health/MainActivity;)V
    .locals 0

    .line 179
    invoke-direct {p0}, Lcom/huawei/health/MainActivity;->ai()V

    return-void
.end method

.method private u()Z
    .locals 4

    .line 875
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->w:Ljava/lang/String;

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/huawei/health/MainActivity;->z:Landroid/net/Uri;

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/huawei/health/MainActivity;->x:Ljava/lang/String;

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/huawei/health/MainActivity;->y:Ljava/lang/String;

    if-nez v0, :cond_2

    iget v0, p0, Lcom/huawei/health/MainActivity;->j:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_2

    iget v0, p0, Lcom/huawei/health/MainActivity;->H:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_2

    iget-boolean v0, p0, Lcom/huawei/health/MainActivity;->V:Z

    if-nez v0, :cond_2

    iget-boolean v0, p0, Lcom/huawei/health/MainActivity;->al:Z

    if-nez v0, :cond_2

    .line 878
    invoke-virtual {p0}, Lcom/huawei/health/MainActivity;->isTaskRoot()Z

    move-result v0

    if-nez v0, :cond_2

    .line 879
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "judgeTaskRoot finish MainAcitivity for cause: is not TaskRoot"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 880
    invoke-virtual {p0}, Lcom/huawei/health/MainActivity;->finish()V

    .line 881
    iget v0, p0, Lcom/huawei/health/MainActivity;->X:I

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    .line 882
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "judgeTaskRoot don\'t continue 1"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 883
    const/4 v0, 0x1

    return v0

    .line 884
    :cond_0
    iget v0, p0, Lcom/huawei/health/MainActivity;->X:I

    const/4 v1, 0x5

    if-ne v0, v1, :cond_1

    .line 885
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "judgeTaskRoot don\'t continue 2"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 886
    invoke-direct {p0}, Lcom/huawei/health/MainActivity;->r()V

    .line 887
    const/4 v0, 0x1

    return v0

    .line 889
    :cond_1
    const/4 v0, 0x0

    return v0

    .line 892
    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method private v()V
    .locals 5

    .line 1108
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->u:Lo/ale;

    if-eqz v0, :cond_0

    .line 1109
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->u:Lo/ale;

    invoke-virtual {v0}, Lo/ale;->n()V

    .line 1111
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->n:Landroid/content/Context;

    const/16 v1, 0x271f

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "key_ui_login_exit_hms_apk"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 1112
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: checkIsInstallHMSAPK() isDownLoadHMSAPK = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1113
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto/16 :goto_0

    .line 1115
    :cond_1
    const-string v0, "1"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 1116
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->n:Landroid/content/Context;

    invoke-static {v0}, Lo/alg;->c(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1117
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: checkIsInstallHMSAPK() isDownLoadHMSAPK = 1,install HWIdAPK"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1118
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->t:Landroid/os/Handler;

    const/16 v1, 0x1398

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    goto :goto_0

    .line 1120
    :cond_2
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: checkIsInstallHMSAPK() isDownLoadHMSAPK = 1,not install HWIdAPK"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1121
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->t:Landroid/os/Handler;

    const/16 v1, 0x1395

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    goto :goto_0

    .line 1123
    :cond_3
    const-string v0, "2"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 1124
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->n:Landroid/content/Context;

    invoke-static {v0}, Lo/alg;->c(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 1125
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: checkIsInstallHMSAPK() isDownLoadHMSAPK = 2, install HWIdAPK"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1126
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->t:Landroid/os/Handler;

    const/16 v1, 0x1399

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    goto :goto_0

    .line 1128
    :cond_4
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: checkIsInstallHMSAPK() isDownLoadHMSAPK = 2,not install HWIdAPK"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1129
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->t:Landroid/os/Handler;

    const/16 v1, 0x1396

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 1132
    :cond_5
    :goto_0
    return-void
.end method

.method static synthetic v(Lcom/huawei/health/MainActivity;)Z
    .locals 1

    .line 179
    iget-boolean v0, p0, Lcom/huawei/health/MainActivity;->ao:Z

    return v0
.end method

.method static synthetic w(Lcom/huawei/health/MainActivity;)Ljava/lang/String;
    .locals 1

    .line 179
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->w:Ljava/lang/String;

    return-object v0
.end method

.method private w()V
    .locals 4

    .line 1014
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter checkAuthRelogin:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1016
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->u:Lo/ale;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 1017
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->p:Ljava/util/concurrent/ExecutorService;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/health/MainActivity;->p:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->isShutdown()Z

    move-result v0

    if-nez v0, :cond_0

    .line 1018
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->p:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/huawei/health/MainActivity$23;

    invoke-direct {v1, p0}, Lcom/huawei/health/MainActivity$23;-><init>(Lcom/huawei/health/MainActivity;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 1053
    :cond_0
    return-void
.end method

.method private x()V
    .locals 7

    .line 1135
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->n:Landroid/content/Context;

    invoke-static {v0}, Lo/dnm;->a(Landroid/content/Context;)Lo/dnm;

    move-result-object v4

    .line 1137
    const/4 v0, 0x3

    invoke-virtual {v4, v0}, Lo/dnm;->c(I)Ljava/lang/String;

    move-result-object v5

    .line 1138
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "shouldSetData sportData "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v5, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1140
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1141
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "PRIVACY_SPORT_DATA  is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1142
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0x2715

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "is_over_rride"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 1145
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1146
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isOverride and sport data is Empty"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1148
    const/4 v0, 0x3

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v4, v0, v1, v2, v3}, Lo/dnm;->e(IZLjava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 1149
    const/4 v0, 0x6

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v4, v0, v1, v2, v3}, Lo/dnm;->e(IZLjava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 1150
    const/4 v0, 0x7

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v4, v0, v1, v2, v3}, Lo/dnm;->e(IZLjava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    goto :goto_0

    .line 1152
    :cond_0
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "new install data is empty"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1154
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->n:Landroid/content/Context;

    invoke-static {v0}, Lo/fjb;->b(Landroid/content/Context;)V

    .line 1156
    :goto_0
    goto :goto_1

    .line 1158
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->n:Landroid/content/Context;

    invoke-static {v0}, Lo/fjb;->b(Landroid/content/Context;)V

    .line 1161
    :goto_1
    return-void
.end method

.method static synthetic x(Lcom/huawei/health/MainActivity;)V
    .locals 0

    .line 179
    invoke-direct {p0}, Lcom/huawei/health/MainActivity;->A()V

    return-void
.end method

.method private y()V
    .locals 13

    .line 1055
    invoke-virtual {p0}, Lcom/huawei/health/MainActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dbf;->f(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1056
    return-void

    .line 1058
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->u:Lo/ale;

    invoke-virtual {v0}, Lo/ale;->c()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1059
    return-void

    .line 1062
    :cond_1
    const-string v0, "ai-exception-002"

    const/16 v1, 0x7534

    invoke-static {v1, v0}, Lo/dmn;->a(ILjava/lang/String;)Z

    move-result v5

    .line 1063
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startOnBoarding, enable="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1064
    if-nez v5, :cond_2

    .line 1065
    return-void

    .line 1067
    :cond_2
    const-wide/16 v6, 0x0

    .line 1069
    :try_start_0
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->n:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "start_huawei_health_current_time"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-wide v0

    move-wide v6, v0

    .line 1074
    goto :goto_0

    .line 1071
    :catch_0
    move-exception v8

    .line 1073
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "parseLong Exception"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v8}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1075
    :goto_0
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mainActivity_currentTime."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1076
    const-wide/16 v0, 0x0

    cmp-long v0, v6, v0

    if-eqz v0, :cond_4

    .line 1077
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sub-long/2addr v0, v6

    long-to-float v0, v0

    const v1, 0x476a6000    # 60000.0f

    div-float v8, v0, v1

    .line 1079
    const-string v0, "ai-exception-002"

    const-string v1, "after_num_minute_generate_onboarding_prompt"

    const/16 v2, 0x7534

    invoke-static {v2, v0, v1}, Lo/dmn;->b(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 1082
    const/16 v10, 0x2760

    .line 1083
    invoke-static {v9}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 1085
    :try_start_1
    invoke-static {v9}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_1

    move-result v0

    move v10, v0

    .line 1088
    goto :goto_1

    .line 1086
    :catch_1
    move-exception v11

    .line 1087
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "NumberFormatException e = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v11}, Ljava/lang/NumberFormatException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1091
    :cond_3
    :goto_1
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->n:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "hw_health_have_concern"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    .line 1093
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "intervalMinute = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v9, v1, v2

    const-string v2, " skipMinutes = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", minutes="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, "concernValue = "

    const/4 v3, 0x4

    aput-object v2, v1, v3

    const/4 v2, 0x5

    aput-object v11, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1094
    int-to-float v0, v10

    cmpl-float v0, v8, v0

    if-lez v0, :cond_4

    const-string v0, "1"

    invoke-virtual {v0, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 1095
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->n:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "start_huawei_health_current_time"

    .line 1096
    const/4 v3, 0x0

    invoke-static {v3}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lo/dcy;

    invoke-direct {v4}, Lo/dcy;-><init>()V

    .line 1095
    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 1097
    new-instance v12, Landroid/content/Intent;

    invoke-direct {v12}, Landroid/content/Intent;-><init>()V

    .line 1098
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->n:Landroid/content/Context;

    const-class v1, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingInfoActivity;

    invoke-virtual {v12, v0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 1099
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->n:Landroid/content/Context;

    invoke-virtual {v0, v12}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 1102
    :cond_4
    return-void
.end method

.method static synthetic y(Lcom/huawei/health/MainActivity;)V
    .locals 0

    .line 179
    invoke-direct {p0}, Lcom/huawei/health/MainActivity;->N()V

    return-void
.end method

.method private z()V
    .locals 4

    .line 1165
    const-string v0, "TimeEat_MainActivity"

    const-string v1, "Enter initLoginedData"

    invoke-static {v0, v1}, Lo/dbf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 1166
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->u:Lo/ale;

    invoke-virtual {v0}, Lo/ale;->v()V

    .line 1167
    invoke-direct {p0}, Lcom/huawei/health/MainActivity;->x()V

    .line 1168
    invoke-direct {p0}, Lcom/huawei/health/MainActivity;->E()V

    .line 1169
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "processInit end onSuccess"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1171
    invoke-static {}, Lo/dbf;->n()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1172
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isRooted phone"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1173
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->u:Lo/ale;

    invoke-virtual {v0}, Lo/ale;->p()V

    .line 1177
    :cond_0
    iget-boolean v0, p0, Lcom/huawei/health/MainActivity;->ad:Z

    if-nez v0, :cond_1

    .line 1178
    invoke-direct {p0}, Lcom/huawei/health/MainActivity;->D()V

    .line 1185
    :cond_1
    const-string v0, "TimeEat_MainActivity"

    const-string v1, "Leave initLoginedData"

    invoke-static {v0, v1}, Lo/dbf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 1186
    return-void
.end method

.method static synthetic z(Lcom/huawei/health/MainActivity;)V
    .locals 0

    .line 179
    invoke-direct {p0}, Lcom/huawei/health/MainActivity;->B()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 4

    .line 1515
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->u:Lo/ale;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/health/MainActivity;->u:Lo/ale;

    invoke-virtual {v0}, Lo/ale;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1516
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initFragmentList(): checkAccountSync and showAdvDialog"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1517
    invoke-direct {p0}, Lcom/huawei/health/MainActivity;->C()V

    goto :goto_0

    .line 1520
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->n:Landroid/content/Context;

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    invoke-static {}, Lo/cmn;->c()Ljava/util/List;

    move-result-object v1

    new-instance v2, Lcom/huawei/health/MainActivity$30;

    invoke-direct {v2, p0}, Lcom/huawei/health/MainActivity$30;-><init>(Lcom/huawei/health/MainActivity;)V

    invoke-interface {v0, v1, v2}, Lo/clt;->b(Ljava/util/List;Lo/clz;)V

    .line 1533
    :goto_0
    return-void
.end method

.method public a(J)V
    .locals 6

    .line 1703
    iput-wide p1, p0, Lcom/huawei/health/MainActivity;->a:J

    .line 1704
    iget-wide v0, p0, Lcom/huawei/health/MainActivity;->a:J

    iget-wide v2, p0, Lcom/huawei/health/MainActivity;->b:J

    sub-long v4, v0, v2

    .line 1705
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "backGround duration="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1707
    iget-wide v0, p0, Lcom/huawei/health/MainActivity;->M:J

    add-long/2addr v0, v4

    iput-wide v0, p0, Lcom/huawei/health/MainActivity;->M:J

    .line 1708
    return-void
.end method

.method public b()V
    .locals 6

    .line 3007
    invoke-static {}, Lo/czu;->i()Z

    move-result v0

    if-nez v0, :cond_0

    .line 3008
    return-void

    .line 3010
    :cond_0
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "unregisterAchievementBroadcastReceiver enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3011
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->n:Landroid/content/Context;

    invoke-static {v0}, Lo/dth;->b(Landroid/content/Context;)Lo/dth;

    move-result-object v0

    invoke-virtual {v0}, Lo/dth;->b()Lcom/huawei/pluginachievement/manager/service/OnceMovementReceiver;

    move-result-object v4

    .line 3012
    if-eqz v4, :cond_1

    .line 3013
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "unregisteronceMovementReceiver != null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3014
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->n:Landroid/content/Context;

    invoke-static {v0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/support/v4/content/LocalBroadcastManager;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 3017
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->n:Landroid/content/Context;

    invoke-static {v0}, Lo/dth;->b(Landroid/content/Context;)Lo/dth;

    move-result-object v0

    invoke-virtual {v0}, Lo/dth;->e()Lcom/huawei/pluginachievement/manager/service/LanguageResReceiver;

    move-result-object v5

    .line 3018
    if-eqz v5, :cond_2

    .line 3019
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "unregisterlanguageResReceiver != null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3020
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->n:Landroid/content/Context;

    invoke-static {v0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/support/v4/content/LocalBroadcastManager;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 3023
    :cond_2
    return-void
.end method

.method public b(Landroid/net/Uri;)V
    .locals 7

    .line 2727
    const/4 v4, 0x0

    .line 2728
    const/4 v5, 0x0

    .line 2730
    const-string v0, "id"

    :try_start_0
    invoke-virtual {p1, v0}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 2731
    const-string v0, "version"

    invoke-virtual {p1, v0}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v5

    .line 2738
    goto :goto_0

    .line 2732
    :catch_0
    move-exception v6

    .line 2733
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "goFitnessPage IllegalArgumentException:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Ljava/lang/IllegalArgumentException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2734
    return-void

    .line 2735
    :catch_1
    move-exception v6

    .line 2736
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "goFitnessPage Exception:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2737
    return-void

    .line 2739
    :goto_0
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "goFitnessPage id= "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " version="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2740
    invoke-static {}, Lo/brt;->c()Lo/brt;

    move-result-object v0

    new-instance v1, Lcom/huawei/health/MainActivity$10;

    invoke-direct {v1, p0}, Lcom/huawei/health/MainActivity$10;-><init>(Lcom/huawei/health/MainActivity;)V

    invoke-virtual {v0, v4, v5, v1}, Lo/brt;->e(Ljava/lang/String;Ljava/lang/String;Lo/bui;)V

    .line 2758
    return-void
.end method

.method public c()V
    .locals 1

    .line 2764
    invoke-static {}, Lo/brt;->c()Lo/brt;

    move-result-object v0

    invoke-virtual {v0}, Lo/brt;->i()V

    .line 2765
    return-void
.end method

.method public d()V
    .locals 5

    .line 340
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveBindingDeviceToODMF enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 341
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->n:Landroid/content/Context;

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v4

    .line 342
    new-instance v0, Lcom/huawei/health/MainActivity$4;

    invoke-direct {v0, p0}, Lcom/huawei/health/MainActivity$4;-><init>(Lcom/huawei/health/MainActivity;)V

    invoke-interface {v4, v0}, Lo/clt;->c(Lo/cmb;)V

    .line 362
    return-void
.end method

.method public d(J)V
    .locals 1

    .line 1717
    sget-object v0, Lo/dbj;->d:Ljava/lang/Runnable;

    invoke-static {v0}, Lo/ahj;->d(Ljava/lang/Runnable;)V

    .line 1718
    return-void
.end method

.method public dispatchTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 5

    .line 1690
    :try_start_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    .line 1693
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    return v0

    .line 1694
    :catch_0
    move-exception v4

    .line 1695
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/lang/IllegalArgumentException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1696
    const/4 v0, 0x0

    return v0
.end method

.method public e()V
    .locals 4

    .line 2997
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "unregisterSyncBroadcastReceiver enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2998
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->av:Lcom/huawei/health/MainActivity$b;

    if-eqz v0, :cond_0

    .line 2999
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "unregisterSyncBroadcastReceiver mReceiver != null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3000
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->n:Landroid/content/Context;

    invoke-static {v0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/MainActivity;->av:Lcom/huawei/health/MainActivity$b;

    invoke-virtual {v0, v1}, Landroid/support/v4/content/LocalBroadcastManager;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 3002
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/MainActivity;->av:Lcom/huawei/health/MainActivity$b;

    .line 3004
    :cond_0
    return-void
.end method

.method public i()V
    .locals 4

    .line 3311
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->o:Lo/abc;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/health/MainActivity;->o:Lo/abc;

    invoke-virtual {v0}, Lo/abc;->getChildCount()I

    move-result v0

    if-lez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/health/MainActivity;->t:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 3313
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->t:Landroid/os/Handler;

    const/16 v1, 0x1838

    const-wide/16 v2, 0x1f4

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 3315
    :cond_0
    return-void
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 6

    .line 2469
    invoke-super {p0, p1, p2, p3}, Lcom/huawei/ui/commonui/base/BaseActivity;->onActivityResult(IILandroid/content/Intent;)V

    .line 2470
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Main_thread1"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2472
    const/16 v0, 0x3e8

    if-ne p1, v0, :cond_2

    .line 2473
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->h:Lcom/huawei/ui/homehealth/HomeFragment;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/health/MainActivity;->h:Lcom/huawei/ui/homehealth/HomeFragment;

    invoke-virtual {v0}, Lcom/huawei/ui/homehealth/HomeFragment;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2475
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onActivityResult() refresh home card"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2476
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->h:Lcom/huawei/ui/homehealth/HomeFragment;

    invoke-virtual {v0}, Lcom/huawei/ui/homehealth/HomeFragment;->b()V

    goto/16 :goto_1

    .line 2478
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->h:Lcom/huawei/ui/homehealth/HomeFragment;

    if-eqz v0, :cond_1

    .line 2479
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onActivityResult() mHomeFragment.isCardInitialized() = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/health/MainActivity;->h:Lcom/huawei/ui/homehealth/HomeFragment;

    invoke-virtual {v3}, Lcom/huawei/ui/homehealth/HomeFragment;->a()Z

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_1

    .line 2481
    :cond_1
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onActivityResult() mHomeFragment is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_1

    .line 2484
    :cond_2
    const/16 v0, 0x1773

    if-ne p1, v0, :cond_4

    .line 2486
    const/4 v0, -0x1

    if-ne v0, p2, :cond_3

    .line 2487
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Activity.RESULT_OK == resultCode "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2488
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->n:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "hw_health_show_grant_pwd"

    .line 2489
    const/4 v3, 0x1

    invoke-static {v3}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lo/dcy;

    invoke-direct {v4}, Lo/dcy;-><init>()V

    .line 2488
    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 2490
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->u:Lo/ale;

    invoke-virtual {v0}, Lo/ale;->f()V

    goto/16 :goto_1

    .line 2492
    :cond_3
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "finish MainAcitivity for cause: REQ_GETPWDVERIFYINTENT_CODE failed!! "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2493
    invoke-virtual {p0}, Lcom/huawei/health/MainActivity;->finish()V

    goto/16 :goto_1

    .line 2496
    :cond_4
    const/16 v0, 0x1774

    if-ne p1, v0, :cond_6

    .line 2497
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "REQ_SHOW_AREA_SELECT_ALERT, requestCode = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",resultCode = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2498
    const/4 v0, 0x0

    if-ne v0, p2, :cond_5

    .line 2499
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->u:Lo/ale;

    invoke-virtual {v0}, Lo/ale;->r()V

    goto/16 :goto_1

    .line 2500
    :cond_5
    const/4 v0, -0x1

    if-ne v0, p2, :cond_11

    .line 2501
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->u:Lo/ale;

    invoke-static {}, Lo/ale;->h()V

    goto/16 :goto_1

    .line 2504
    :cond_6
    const/16 v0, 0x7d0

    if-ne p1, v0, :cond_d

    .line 2505
    const/4 v0, -0x1

    if-ne p2, v0, :cond_c

    .line 2506
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/MainActivity;->P:Z

    .line 2507
    const-string v0, "intent.extra.RESULT"

    const/4 v1, 0x0

    invoke-virtual {p3, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v5

    .line 2508
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onActivityResult, REQUEST_HMS_RESOLVE_ERROR, result = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2509
    if-nez v5, :cond_8

    .line 2510
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u9519\u8bef\u6210\u529f\u89e3\u51b3"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2511
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->S:Lcom/huawei/hms/api/HuaweiApiClient;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_7

    .line 2512
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->S:Lcom/huawei/hms/api/HuaweiApiClient;

    invoke-virtual {v0}, Lcom/huawei/hms/api/HuaweiApiClient;->isConnecting()Z

    move-result v0

    if-nez v0, :cond_b

    iget-object v0, p0, Lcom/huawei/health/MainActivity;->S:Lcom/huawei/hms/api/HuaweiApiClient;

    invoke-virtual {v0}, Lcom/huawei/hms/api/HuaweiApiClient;->isConnected()Z

    move-result v0

    if-nez v0, :cond_b

    .line 2513
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->S:Lcom/huawei/hms/api/HuaweiApiClient;

    invoke-virtual {v0, p0}, Lcom/huawei/hms/api/HuaweiApiClient;->connect(Landroid/app/Activity;)V

    .line 2514
    invoke-direct {p0}, Lcom/huawei/health/MainActivity;->ak()V

    goto :goto_0

    .line 2517
    :cond_7
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mHuaweiApiClient is null."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 2519
    :cond_8
    const/16 v0, 0xd

    if-ne v5, v0, :cond_9

    .line 2520
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u89e3\u51b3\u9519\u8bef\u8fc7\u7a0b\u88ab\u7528\u6237\u53d6\u6d88"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2521
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->u:Lo/ale;

    invoke-virtual {v0}, Lo/ale;->R()V

    goto :goto_0

    .line 2522
    :cond_9
    const/16 v0, 0x8

    if-ne v5, v0, :cond_a

    .line 2523
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u53d1\u751f\u5185\u90e8\u9519\u8bef\uff0c\u91cd\u8bd5\u53ef\u4ee5\u89e3\u51b3"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 2526
    :cond_a
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u672a\u77e5\u8fd4\u56de\u7801"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2528
    :cond_b
    :goto_0
    goto :goto_1

    .line 2529
    :cond_c
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u8c03\u7528\u89e3\u51b3\u65b9\u6848\u53d1\u751f\u9519\u8bef"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1

    .line 2531
    :cond_d
    const/16 v0, 0x1388

    if-ne p1, v0, :cond_e

    .line 2532
    invoke-direct {p0}, Lcom/huawei/health/MainActivity;->O()V

    goto :goto_1

    .line 2534
    :cond_e
    const/16 v0, 0x65

    if-ne p1, v0, :cond_10

    .line 2535
    const/16 v0, 0x66

    if-ne p2, v0, :cond_f

    .line 2536
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "finish MainAcitivity for cause: guide page back"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2537
    invoke-virtual {p0}, Lcom/huawei/health/MainActivity;->finish()V

    .line 2539
    :cond_f
    const/16 v0, 0x67

    if-ne p2, v0, :cond_10

    .line 2540
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->u:Lo/ale;

    invoke-virtual {v0}, Lo/ale;->l()V

    .line 2543
    :cond_10
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->u:Lo/ale;

    invoke-virtual {v0, p1, p2, p3}, Lo/ale;->d(IILandroid/content/Intent;)V

    .line 2546
    :cond_11
    :goto_1
    return-void
.end method

.method public onBackPressed()V
    .locals 6

    .line 3212
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    .line 3213
    iget-wide v0, p0, Lcom/huawei/health/MainActivity;->U:J

    sub-long v0, v4, v0

    const-wide/16 v2, 0x7d0

    cmp-long v0, v0, v2

    if-ltz v0, :cond_0

    .line 3214
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->n:Landroid/content/Context;

    const v1, 0x7f02016d

    invoke-static {v0, v1}, Lo/emv;->e(Landroid/content/Context;I)V

    .line 3215
    iput-wide v4, p0, Lcom/huawei/health/MainActivity;->U:J

    goto :goto_0

    .line 3217
    :cond_0
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "finish MainAcitivity for cause: double click"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3218
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onBackPressed()V

    .line 3220
    :goto_0
    return-void
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 5

    .line 2323
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onConfigurationChanged"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2324
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 2325
    invoke-static {}, Lo/cbn;->c()Z

    move-result v4

    .line 2326
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isLanguageChanged = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2327
    if-eqz v4, :cond_0

    .line 2328
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "finish MainAcitivity for cause: LanguageChanged reStart"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2329
    invoke-direct {p0}, Lcom/huawei/health/MainActivity;->N()V

    .line 2331
    :cond_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 4

    .line 283
    const-string v0, "TimeEat_MainActivity"

    const-string v1, "Enter MainActivity onCreate"

    invoke-static {v0, v1}, Lo/dbf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 284
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 285
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCreate "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p0, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 287
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/health/MainActivity;->am:J

    .line 288
    iput-object p0, p0, Lcom/huawei/health/MainActivity;->n:Landroid/content/Context;

    .line 290
    invoke-static {}, Lo/cbn;->c()Z

    .line 291
    invoke-virtual {p0}, Lcom/huawei/health/MainActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/abe;->d(Landroid/content/Context;)V

    .line 292
    invoke-virtual {p0}, Lcom/huawei/health/MainActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/abe;->c(Landroid/content/Context;)V

    .line 295
    invoke-direct {p0}, Lcom/huawei/health/MainActivity;->h()V

    .line 298
    invoke-direct {p0}, Lcom/huawei/health/MainActivity;->u()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 299
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/MainActivity;->ag:Z

    .line 300
    return-void

    .line 303
    :cond_0
    invoke-direct {p0}, Lcom/huawei/health/MainActivity;->L()V

    .line 305
    invoke-virtual {p0}, Lcom/huawei/health/MainActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/high16 v1, 0x1000000

    const/high16 v2, 0x1000000

    invoke-virtual {v0, v1, v2}, Landroid/view/Window;->setFlags(II)V

    .line 307
    const v0, 0x7f08000a

    const v1, 0x7f08000a

    invoke-virtual {p0, v0, v1}, Lcom/huawei/health/MainActivity;->overridePendingTransition(II)V

    .line 308
    const v0, 0x7f0702f8

    invoke-virtual {p0, v0}, Lcom/huawei/health/MainActivity;->setContentView(I)V

    .line 309
    const v0, 0x7f121449

    invoke-virtual {p0, v0}, Lcom/huawei/health/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/abc;

    iput-object v0, p0, Lcom/huawei/health/MainActivity;->o:Lo/abc;

    .line 310
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->o:Lo/abc;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/abc;->setScroll(Z)V

    .line 311
    const v0, 0x7f12144a

    invoke-virtual {p0, v0}, Lcom/huawei/health/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/elw;

    iput-object v0, p0, Lcom/huawei/health/MainActivity;->ai:Lo/elw;

    .line 313
    const-string v0, "Login_MainActivity"

    const-string v1, "init mainInteractors"

    invoke-static {v0, v1}, Lo/dbf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 315
    new-instance v0, Lcom/huawei/health/MainActivity$h;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, p0, v1, p0}, Lcom/huawei/health/MainActivity$h;-><init>(Lcom/huawei/health/MainActivity;Landroid/os/Looper;Lcom/huawei/health/MainActivity;)V

    iput-object v0, p0, Lcom/huawei/health/MainActivity;->t:Landroid/os/Handler;

    .line 316
    new-instance v0, Lo/ale;

    iget-object v1, p0, Lcom/huawei/health/MainActivity;->n:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/ale;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/health/MainActivity;->u:Lo/ale;

    .line 317
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->u:Lo/ale;

    iget-object v1, p0, Lcom/huawei/health/MainActivity;->t:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Lo/ale;->b(Landroid/os/Handler;)V

    .line 320
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/MainActivity;->p:Ljava/util/concurrent/ExecutorService;

    .line 321
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->u:Lo/ale;

    iget-object v1, p0, Lcom/huawei/health/MainActivity;->p:Ljava/util/concurrent/ExecutorService;

    invoke-virtual {v0, v1}, Lo/ale;->d(Ljava/util/concurrent/ExecutorService;)V

    .line 322
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->u:Lo/ale;

    invoke-virtual {v0}, Lo/ale;->P()V

    .line 323
    new-instance v0, Lo/alj;

    invoke-direct {v0, p0}, Lo/alj;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/health/MainActivity;->F:Lo/alj;

    .line 325
    invoke-virtual {p0}, Lcom/huawei/health/MainActivity;->getApplication()Landroid/app/Application;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwcommonmodel/application/BaseApplication;

    iput-object v0, p0, Lcom/huawei/health/MainActivity;->K:Lcom/huawei/hwcommonmodel/application/BaseApplication;

    .line 326
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->K:Lcom/huawei/hwcommonmodel/application/BaseApplication;

    invoke-virtual {v0, p0}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->c(Lo/czv;)V

    .line 328
    invoke-direct {p0}, Lcom/huawei/health/MainActivity;->ao()V

    .line 330
    invoke-direct {p0}, Lcom/huawei/health/MainActivity;->p()V

    .line 335
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/health/MainActivity;->ac:Z

    .line 336
    const/4 v0, 0x0

    sput-boolean v0, Lcom/huawei/health/MainActivity;->W:Z

    .line 337
    const-string v0, "TimeEat_MainActivity"

    const-string v1, "Leave MainActivity onCreate"

    invoke-static {v0, v1}, Lo/dbf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 338
    return-void
.end method

.method public onDestroy()V
    .locals 6

    .line 2368
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onDestroy "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p0, v1, v2

    const-string v2, ", hasInit "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget-boolean v2, p0, Lcom/huawei/health/MainActivity;->ag:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2370
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->o:Lo/abc;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 2371
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->o:Lo/abc;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/abc;->setAdapter(Landroid/support/v4/view/PagerAdapter;)V

    .line 2372
    new-instance v0, Landroid/view/View;

    invoke-direct {v0, p0}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    invoke-virtual {p0, v0}, Lcom/huawei/health/MainActivity;->setContentView(Landroid/view/View;)V

    .line 2375
    :cond_0
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onDestroy()V

    .line 2376
    iget-boolean v0, p0, Lcom/huawei/health/MainActivity;->ag:Z

    if-nez v0, :cond_1

    .line 2377
    return-void

    .line 2379
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->n:Landroid/content/Context;

    if-nez v0, :cond_2

    .line 2380
    return-void

    .line 2382
    :cond_2
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->S:Lcom/huawei/hms/api/HuaweiApiClient;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 2383
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->S:Lcom/huawei/hms/api/HuaweiApiClient;

    invoke-virtual {v0}, Lcom/huawei/hms/api/HuaweiApiClient;->disconnect()V

    .line 2384
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/MainActivity;->S:Lcom/huawei/hms/api/HuaweiApiClient;

    .line 2386
    :cond_3
    const/4 v0, 0x0

    sput-boolean v0, Lcom/huawei/health/MainActivity;->W:Z

    .line 2387
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/MainActivity;->I:Z

    .line 2388
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 2389
    const-string v0, "click"

    const-string v1, "1"

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2390
    sget-object v0, Lo/dae;->gi:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v5

    .line 2391
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/MainActivity;->n:Landroid/content/Context;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v5, v4, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 2393
    invoke-direct {p0}, Lcom/huawei/health/MainActivity;->j()V

    .line 2394
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->K:Lcom/huawei/hwcommonmodel/application/BaseApplication;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->c()V

    .line 2395
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->u:Lo/ale;

    invoke-virtual {v0}, Lo/ale;->E()V

    .line 2396
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->u:Lo/ale;

    invoke-virtual {v0}, Lo/ale;->j()V

    .line 2397
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->u:Lo/ale;

    invoke-virtual {v0}, Lo/ale;->G()V

    .line 2398
    invoke-virtual {p0}, Lcom/huawei/health/MainActivity;->e()V

    .line 2399
    invoke-direct {p0}, Lcom/huawei/health/MainActivity;->ab()V

    .line 2400
    invoke-direct {p0}, Lcom/huawei/health/MainActivity;->ac()V

    .line 2401
    invoke-direct {p0}, Lcom/huawei/health/MainActivity;->af()V

    .line 2402
    invoke-direct {p0}, Lcom/huawei/health/MainActivity;->ah()V

    .line 2403
    invoke-virtual {p0}, Lcom/huawei/health/MainActivity;->b()V

    .line 2404
    invoke-direct {p0}, Lcom/huawei/health/MainActivity;->ap()V

    .line 2406
    invoke-direct {p0}, Lcom/huawei/health/MainActivity;->ar()V

    .line 2408
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->ap:Lo/esa;

    if-eqz v0, :cond_4

    .line 2409
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->ap:Lo/esa;

    invoke-virtual {v0}, Lo/esa;->c()V

    .line 2410
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/MainActivity;->ap:Lo/esa;

    .line 2412
    :cond_4
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->p:Ljava/util/concurrent/ExecutorService;

    if-eqz v0, :cond_5

    .line 2413
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->p:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 2414
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/MainActivity;->p:Ljava/util/concurrent/ExecutorService;

    .line 2417
    :cond_5
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->u:Lo/ale;

    invoke-virtual {v0}, Lo/ale;->K()V

    .line 2422
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/MainActivity;->n:Landroid/content/Context;

    .line 2423
    invoke-static {}, Lo/elx;->e()V

    .line 2424
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->F:Lo/alj;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_6

    .line 2425
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->F:Lo/alj;

    invoke-virtual {v0}, Lo/alj;->k()V

    .line 2426
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/MainActivity;->F:Lo/alj;

    .line 2429
    :cond_6
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->c:Lcom/huawei/hwcloudmodel/agreement/AccessTokenManager;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_7

    .line 2430
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->c:Lcom/huawei/hwcloudmodel/agreement/AccessTokenManager;

    invoke-virtual {v0}, Lcom/huawei/hwcloudmodel/agreement/AccessTokenManager;->shutDownThread()V

    .line 2431
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/MainActivity;->c:Lcom/huawei/hwcloudmodel/agreement/AccessTokenManager;

    .line 2434
    :cond_7
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->f:Lcom/huawei/hwcloudmodel/agreement/AccessTokenManager;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_8

    .line 2435
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->f:Lcom/huawei/hwcloudmodel/agreement/AccessTokenManager;

    invoke-virtual {v0}, Lcom/huawei/hwcloudmodel/agreement/AccessTokenManager;->shutDownThread()V

    .line 2436
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/MainActivity;->f:Lcom/huawei/hwcloudmodel/agreement/AccessTokenManager;

    .line 2439
    :cond_8
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->t:Landroid/os/Handler;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_9

    .line 2440
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->t:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 2443
    :cond_9
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->ai:Lo/elw;

    invoke-virtual {v0}, Lo/elw;->removeMenuItems()V

    .line 2444
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->ai:Lo/elw;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/elw;->setBottomNavListener(Lhuawei/widget/HwBottomNavigationView$BottomNavListener;)V

    .line 2446
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/MainActivity;->ax:Lcom/huawei/health/MainActivity$f;

    .line 2450
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/MainActivity;->N:Lo/egs;

    .line 2451
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/MainActivity;->L:Lo/egs$b;

    .line 2452
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/MainActivity;->ak:Lo/egy;

    .line 2453
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/MainActivity;->an:Lo/egy;

    .line 2454
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/MainActivity;->G:Lo/alh;

    .line 2456
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/MainActivity;->h:Lcom/huawei/ui/homehealth/HomeFragment;

    .line 2457
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/MainActivity;->ae:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;

    .line 2458
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/MainActivity;->k:Lcom/huawei/ui/main/stories/discover/fragment/DiscoverFragment;

    .line 2459
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/MainActivity;->l:Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;

    .line 2460
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/MainActivity;->m:Landroid/widget/LinearLayout;

    .line 2462
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/MainActivity;->ai:Lo/elw;

    .line 2463
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/MainActivity;->o:Lo/abc;

    .line 2464
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/MainActivity;->aj:Lhuawei/widget/HwImmersiveMode;

    .line 2465
    return-void
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 4

    .line 2550
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Main_activity_into_key_back1"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2551
    const/4 v0, 0x4

    if-ne p1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/health/MainActivity;->u:Lo/ale;

    invoke-virtual {v0}, Lo/ale;->A()Lo/ego;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2554
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->n:Landroid/content/Context;

    invoke-static {v0}, Lo/clq;->e(Landroid/content/Context;)Lo/clq;

    move-result-object v0

    invoke-virtual {v0}, Lo/clq;->e()V

    .line 2555
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->u:Lo/ale;

    invoke-virtual {v0}, Lo/ale;->I()V

    .line 2556
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Main_activity_into_key_back"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2558
    :cond_0
    invoke-super {p0, p1, p2}, Lcom/huawei/ui/commonui/base/BaseActivity;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result v0

    return v0
.end method

.method public onNewIntent(Landroid/content/Intent;)V
    .locals 5

    .line 906
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onNewIntent(Landroid/content/Intent;)V

    .line 907
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onNewIntent"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 909
    const-string v0, "health_smartmsg_id"

    const/4 v1, -0x1

    :try_start_0
    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/huawei/health/MainActivity;->v:I

    .line 910
    const-string v0, "health_smartmsg_type"

    const/4 v1, -0x1

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/huawei/health/MainActivity;->j:I

    .line 911
    const-string v0, "health_smartmsg_content"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/MainActivity;->B:Ljava/lang/String;

    .line 913
    const-string v0, "device_type"

    const/4 v1, -0x1

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/huawei/health/MainActivity;->J:I

    .line 914
    const-string v0, "dname"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/MainActivity;->R:Ljava/lang/String;

    .line 915
    const-string v0, "isPorc"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/health/MainActivity;->O:Z

    .line 916
    const-string v0, "from_update_version"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/health/MainActivity;->Q:Z

    .line 917
    invoke-direct {p0, p1}, Lcom/huawei/health/MainActivity;->a(Landroid/content/Intent;)V
    :try_end_0
    .catch Landroid/os/BadParcelableException; {:try_start_0 .. :try_end_0} :catch_0

    .line 920
    goto :goto_0

    .line 918
    :catch_0
    move-exception v4

    .line 919
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MainActivity BadParcelableException "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Landroid/os/BadParcelableException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 921
    :goto_0
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "smartMsgId="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/health/MainActivity;->v:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", smartMsgType="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/health/MainActivity;->j:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", smartMsgContent="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/health/MainActivity;->B:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", productName="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/health/MainActivity;->R:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", deviceType="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/health/MainActivity;->J:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 923
    invoke-direct {p0}, Lcom/huawei/health/MainActivity;->S()V

    .line 924
    invoke-static {}, Lo/czu;->b()Z

    move-result v0

    if-nez v0, :cond_0

    .line 925
    invoke-direct {p0}, Lcom/huawei/health/MainActivity;->T()V

    .line 927
    :cond_0
    return-void
.end method

.method public onPause()V
    .locals 4

    .line 987
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onPause"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 988
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onPause()V

    .line 989
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->u:Lo/ale;

    if-eqz v0, :cond_0

    .line 990
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->u:Lo/ale;

    invoke-virtual {v0}, Lo/ale;->D()V

    .line 992
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->F:Lo/alj;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 993
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->F:Lo/alj;

    invoke-virtual {v0}, Lo/alj;->b()V

    .line 995
    :cond_1
    return-void
.end method

.method public onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    .locals 6

    .line 2563
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Activity-onRequestPermissionsResult() PermissionsManager.notifyPermissionsChange()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2565
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->x:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 2566
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-nez v0, :cond_0

    .line 2567
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->n:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/operation/operation/PluginOperation;->getInstance(Landroid/content/Context;)Lcom/huawei/operation/operation/PluginOperation;

    move-result-object v4

    .line 2568
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->x:Ljava/lang/String;

    invoke-virtual {v4, v0}, Lcom/huawei/operation/operation/PluginOperation;->startOperationWebPage(Ljava/lang/String;)V

    .line 2569
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/MainActivity;->x:Ljava/lang/String;

    .line 2573
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->y:Ljava/lang/String;

    if-eqz v0, :cond_1

    .line 2574
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-nez v0, :cond_1

    .line 2576
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "jump to group"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2577
    new-instance v4, Landroid/content/Intent;

    invoke-direct {v4}, Landroid/content/Intent;-><init>()V

    .line 2578
    const-class v0, Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;

    invoke-virtual {v4, p0, v0}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 2579
    const/high16 v0, 0x10000000

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 2580
    const-string v0, "QRCode_errContent"

    iget-object v1, p0, Lcom/huawei/health/MainActivity;->y:Ljava/lang/String;

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 2581
    const-string v0, "from_account"

    const/4 v1, 0x1

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 2582
    const-string v0, "is_form_scheme"

    const/4 v1, 0x1

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 2583
    invoke-virtual {p0, v4}, Lcom/huawei/health/MainActivity;->startActivity(Landroid/content/Intent;)V

    .line 2584
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/MainActivity;->y:Ljava/lang/String;

    .line 2588
    :cond_1
    iget v0, p0, Lcom/huawei/health/MainActivity;->H:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_2

    .line 2589
    invoke-direct {p0}, Lcom/huawei/health/MainActivity;->J()V

    .line 2591
    :cond_2
    if-nez p3, :cond_3

    .line 2592
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "grantResults null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2593
    return-void

    .line 2595
    :cond_3
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->u:Lo/ale;

    invoke-virtual {v0, p1, p2, p3}, Lo/ale;->b(I[Ljava/lang/String;[I)V

    .line 2596
    iget v0, p0, Lcom/huawei/health/MainActivity;->D:I

    if-ne p1, v0, :cond_8

    .line 2597
    array-length v0, p3

    if-nez v0, :cond_4

    .line 2598
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "grantResults length 0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2599
    return-void

    .line 2601
    :cond_4
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getpermission onRequestPermissionsResult back"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2602
    const/4 v0, 0x0

    aget v0, p3, v0

    if-nez v0, :cond_7

    .line 2604
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u6210\u529f\u83b7\u53d6\u6743\u9650"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2606
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->l:Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;

    iget-object v1, p0, Lcom/huawei/health/MainActivity;->n:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;->d(Landroid/content/Context;)V

    .line 2607
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-nez v0, :cond_6

    .line 2608
    new-instance v4, Lo/cwk;

    invoke-direct {v4}, Lo/cwk;-><init>()V

    .line 2609
    invoke-virtual {v4, p0}, Lo/cwk;->c(Landroid/app/Activity;)I

    move-result v5

    .line 2610
    const/4 v0, 0x0

    if-ne v0, v5, :cond_5

    .line 2611
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Questions and Suggestions enter successful"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 2613
    :cond_5
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Questions and Suggestions errorCode : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2615
    :goto_0
    goto :goto_1

    .line 2616
    :cond_6
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getpermission isOversea"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1

    .line 2621
    :cond_7
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getpermission onRequestPermissionsResult rejected"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2625
    :cond_8
    :goto_1
    return-void
.end method

.method public onResume()V
    .locals 4

    .line 931
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onResume()V

    .line 932
    const-string v0, "TimeEat_MainActivity"

    const-string v1, "Enter MainActivity onResume"

    invoke-static {v0, v1}, Lo/dbf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 933
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/health/MainActivity;->aG:J

    .line 934
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->ai:Lo/elw;

    iget-object v1, p0, Lcom/huawei/health/MainActivity;->o:Lo/abc;

    invoke-virtual {v1}, Lo/abc;->getCurrentItem()I

    move-result v1

    invoke-virtual {v0, v1}, Lo/elw;->setItemChecked(I)V

    .line 935
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-nez v0, :cond_0

    .line 936
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->o:Lo/abc;

    invoke-virtual {v0}, Lo/abc;->getCurrentItem()I

    move-result v0

    const/4 v1, 0x2

    if-ne v1, v0, :cond_0

    .line 937
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->k:Lcom/huawei/ui/main/stories/discover/fragment/DiscoverFragment;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/huawei/ui/main/stories/discover/fragment/DiscoverFragment;->setUserVisibleHint(Z)V

    .line 940
    :cond_0
    iget-boolean v0, p0, Lcom/huawei/health/MainActivity;->ac:Z

    if-eqz v0, :cond_1

    .line 941
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->t:Landroid/os/Handler;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 942
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->t:Landroid/os/Handler;

    const/16 v1, 0xa

    const-wide/16 v2, 0x1f4

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 943
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->t:Landroid/os/Handler;

    const/16 v1, 0x189c

    const-wide/16 v2, 0xbb8

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 945
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/MainActivity;->ac:Z

    .line 947
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->F:Lo/alj;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 948
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->F:Lo/alj;

    invoke-virtual {v0}, Lo/alj;->e()V

    .line 950
    :cond_2
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->u:Lo/ale;

    if-eqz v0, :cond_3

    .line 951
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->u:Lo/ale;

    invoke-virtual {v0}, Lo/ale;->B()V

    .line 953
    :cond_3
    const-string v0, "Login_MainActivity"

    const-string v1, "-onResume enter"

    invoke-static {v0, v1}, Lo/dbf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 955
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->l:Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;

    if-eqz v0, :cond_4

    .line 956
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->l:Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;->onResume()V

    .line 958
    :cond_4
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->u:Lo/ale;

    if-eqz v0, :cond_5

    .line 959
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->u:Lo/ale;

    invoke-virtual {v0}, Lo/ale;->M()V

    .line 961
    :cond_5
    invoke-direct {p0}, Lcom/huawei/health/MainActivity;->v()V

    .line 962
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->N:Lo/egs;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_6

    iget-object v0, p0, Lcom/huawei/health/MainActivity;->L:Lo/egs$b;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_6

    .line 963
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "noteDialog is not null, dismiss dialog first...."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 964
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->L:Lo/egs$b;

    iget-object v1, p0, Lcom/huawei/health/MainActivity;->N:Lo/egs;

    invoke-virtual {v0, v1}, Lo/egs$b;->b(Lo/egs;)V

    .line 965
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/MainActivity;->L:Lo/egs$b;

    .line 966
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/MainActivity;->N:Lo/egs;

    .line 968
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "login once to check if 40...."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 969
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->u:Lo/ale;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_6

    .line 970
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->u:Lo/ale;

    invoke-virtual {v0}, Lo/ale;->r()V

    .line 973
    :cond_6
    sget-boolean v0, Lcom/huawei/health/MainActivity;->W:Z

    if-eqz v0, :cond_7

    .line 974
    const/4 v0, 0x0

    sput-boolean v0, Lcom/huawei/health/MainActivity;->W:Z

    goto :goto_0

    .line 976
    :cond_7
    invoke-direct {p0}, Lcom/huawei/health/MainActivity;->w()V

    .line 978
    :goto_0
    const-string v0, "TimeEat_MainActivity"

    const-string v1, "Leave  MainActivity onResume"

    invoke-static {v0, v1}, Lo/dbf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 980
    iget-boolean v0, p0, Lcom/huawei/health/MainActivity;->Q:Z

    if-eqz v0, :cond_8

    .line 981
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->o:Lo/abc;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lo/abc;->setCurrentItem(IZ)V

    .line 983
    :cond_8
    return-void
.end method

.method public onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 1

    .line 2629
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onSaveInstanceState(Landroid/os/Bundle;)V

    .line 2630
    const-string v0, "android:support:fragments"

    .line 2632
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 2633
    return-void
.end method

.method public onStop()V
    .locals 5

    .line 999
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onStop()V

    .line 1000
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->n:Landroid/content/Context;

    invoke-static {v0}, Lo/dbf;->q(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1001
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MainActivity_isForeground_stop"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1002
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->n:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "health_click_home"

    .line 1003
    const/4 v3, 0x1

    invoke-static {v3}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lo/dcy;

    invoke-direct {v4}, Lo/dcy;-><init>()V

    .line 1002
    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 1004
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->n:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "health_show_smartcard"

    const-string v3, "true"

    new-instance v4, Lo/dcy;

    invoke-direct {v4}, Lo/dcy;-><init>()V

    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 1006
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->n:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "health_bi_opera"

    const-string v3, "1"

    new-instance v4, Lo/dcy;

    invoke-direct {v4}, Lo/dcy;-><init>()V

    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 1008
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->n:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "health_report_click_home"

    .line 1009
    const/4 v3, 0x1

    invoke-static {v3}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lo/dcy;

    invoke-direct {v4}, Lo/dcy;-><init>()V

    .line 1008
    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 1011
    :cond_0
    return-void
.end method

.method public onTrimMemory(I)V
    .locals 4

    .line 3333
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onTrimMemory(I)V

    .line 3334
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onTrimMemory level = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3335
    return-void
.end method

.method public onWindowFocusChanged(Z)V
    .locals 4

    .line 3224
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onWindowFocusChanged(Z)V

    .line 3225
    iput-boolean p1, p0, Lcom/huawei/health/MainActivity;->aa:Z

    .line 3226
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onWindowFocusChanged:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3227
    if-eqz p1, :cond_1

    .line 3229
    iget-boolean v0, p0, Lcom/huawei/health/MainActivity;->ad:Z

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/huawei/health/ad/HiAdSplashActivity;->a()Z

    move-result v0

    if-nez v0, :cond_0

    .line 3230
    invoke-direct {p0}, Lcom/huawei/health/MainActivity;->D()V

    .line 3233
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/MainActivity;->h:Lcom/huawei/ui/homehealth/HomeFragment;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    iget-object v0, p0, Lcom/huawei/health/MainActivity;->h:Lcom/huawei/ui/homehealth/HomeFragment;

    iget-boolean v0, v0, Lcom/huawei/ui/homehealth/HomeFragment;->a:Z

    if-eqz v0, :cond_1

    .line 3237
    invoke-virtual {p0}, Lcom/huawei/health/MainActivity;->a()V

    .line 3240
    :cond_1
    return-void
.end method
