.class public Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity;
.super Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/BaseFragmentActivity;
.source "SourceFile"

# interfaces
.implements Landroid/support/v4/app/ActivityCompat$OnRequestPermissionsResultCallback;
.implements Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/BaseFragmentActivity$d;
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity$a;,
        Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity$d;
    }
.end annotation


# instance fields
.field private a:Landroid/content/BroadcastReceiver;

.field private b:Landroid/content/Context;

.field c:[Ljava/lang/String;

.field private e:Z

.field private f:Landroid/widget/RadioButton;

.field private g:Landroid/widget/RadioButton;

.field private h:Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity$d;

.field private i:Lo/cgd;

.field private k:Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment;

.field private n:Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineDownManagerFragment;

.field private o:Landroid/widget/ImageButton;

.field private p:Lo/emr;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 50
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/BaseFragmentActivity;-><init>()V

    .line 59
    new-instance v0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity$a;

    invoke-direct {v0, p0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity$a;-><init>(Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity;)V

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity;->a:Landroid/content/BroadcastReceiver;

    .line 62
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity;->e:Z

    .line 83
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity;->k:Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment;

    .line 86
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity;->n:Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineDownManagerFragment;

    .line 88
    const/4 v0, 0x6

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "android.permission.WRITE_EXTERNAL_STORAGE"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "android.permission.READ_EXTERNAL_STORAGE"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, "android.permission.ACCESS_COARSE_LOCATION"

    const/4 v2, 0x2

    aput-object v1, v0, v2

    const-string v1, "android.permission.ACCESS_FINE_LOCATION"

    const/4 v2, 0x3

    aput-object v1, v0, v2

    const-string v1, "android.permission.ACCESS_NETWORK_STATE"

    const/4 v2, 0x4

    aput-object v1, v0, v2

    const-string v1, "android.permission.ACCESS_WIFI_STATE"

    const/4 v2, 0x5

    aput-object v1, v0, v2

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity;->c:[Ljava/lang/String;

    return-void
.end method

.method static synthetic a(Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity;)V
    .locals 0

    .line 50
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity;->g()V

    return-void
.end method

.method static synthetic b(Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity;)Z
    .locals 1

    .line 50
    iget-boolean v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity;->e:Z

    return v0
.end method

.method static synthetic b(Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity;Z)Z
    .locals 0

    .line 50
    iput-boolean p1, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity;->e:Z

    return p1
.end method

.method static synthetic c(Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity;)V
    .locals 0

    .line 50
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity;->k()V

    return-void
.end method

.method static synthetic c(Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity;Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineMapCityList;)V
    .locals 0

    .line 50
    invoke-direct {p0, p1}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity;->e(Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineMapCityList;)V

    return-void
.end method

.method static synthetic e(Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity;)Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity$d;
    .locals 1

    .line 50
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity;->h:Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity$d;

    return-object v0
.end method

.method private e(Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineMapCityList;)V
    .locals 7

    .line 415
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 417
    const-string v0, "OfflineMapTabActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updataFragment() mList null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 418
    return-void

    .line 420
    :cond_0
    const-string v0, "OfflineMapTabActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updataFragment()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 421
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity;->n:Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineDownManagerFragment;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity;->k:Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 423
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity;->n:Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineDownManagerFragment;

    invoke-virtual {p1}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineMapCityList;->getmLoadingCityList()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {p1}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineMapCityList;->getmDownCityList()Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineDownManagerFragment;->b(Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    .line 424
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity;->k:Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment;

    invoke-virtual {p1}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineMapCityList;->getmProvinceList()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {p1}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineMapCityList;->getmCityMap()Ljava/util/HashMap;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment;->e(Ljava/util/ArrayList;Ljava/util/HashMap;)V

    .line 425
    const-string v0, "OfflineMapTabActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updataFragment() fragment not null finish"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 426
    return-void

    .line 429
    :cond_1
    invoke-virtual {p0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity;->d()Ljava/util/List;

    move-result-object v4

    .line 430
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_2

    .line 432
    const-string v0, "OfflineMapTabActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updataFragment list.size() == 0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 433
    return-void

    .line 435
    :cond_2
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Landroid/support/v4/app/Fragment;

    .line 437
    instance-of v0, v6, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment;

    if-eqz v0, :cond_3

    .line 439
    move-object v0, v6

    check-cast v0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment;

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity;->k:Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment;

    .line 440
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity;->k:Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment;

    invoke-virtual {p1}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineMapCityList;->getmProvinceList()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {p1}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineMapCityList;->getmCityMap()Ljava/util/HashMap;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment;->e(Ljava/util/ArrayList;Ljava/util/HashMap;)V

    goto :goto_1

    .line 442
    :cond_3
    instance-of v0, v6, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineDownManagerFragment;

    if-eqz v0, :cond_4

    .line 444
    move-object v0, v6

    check-cast v0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineDownManagerFragment;

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity;->n:Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineDownManagerFragment;

    .line 445
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity;->n:Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineDownManagerFragment;

    invoke-virtual {p1}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineMapCityList;->getmLoadingCityList()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {p1}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineMapCityList;->getmDownCityList()Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineDownManagerFragment;->b(Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    .line 447
    :cond_4
    :goto_1
    goto :goto_0

    .line 448
    :cond_5
    return-void
.end method

.method private f()V
    .locals 4

    .line 353
    const-string v0, "OfflineMapTabActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startOfflineMapService"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 354
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity;->h:Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity$d;

    new-instance v1, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity$4;

    invoke-direct {v1, p0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity$4;-><init>(Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity;)V

    const-wide/16 v2, 0xc8

    invoke-virtual {v0, v1, v2, v3}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity$d;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 366
    return-void
.end method

.method private g()V
    .locals 1

    .line 143
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity;->i:Lo/cgd;

    invoke-virtual {v0}, Lo/cgd;->a()V

    .line 144
    return-void
.end method

.method private h()V
    .locals 5

    .line 371
    const-string v0, "OfflineMapTabActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "registerBroadcastReceiver"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 372
    new-instance v4, Landroid/content/IntentFilter;

    invoke-direct {v4}, Landroid/content/IntentFilter;-><init>()V

    .line 373
    const-string v0, "ACTION_MAP_ONDOWNLOAD_SA"

    invoke-virtual {v4, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 374
    const-string v0, "ACTION_REFRESH_ACTIVITY_SA"

    invoke-virtual {v4, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 375
    const-string v0, "ACTION_INIT_ACTIVITY_SA"

    invoke-virtual {v4, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 376
    const-string v0, "ACTION_MAP_ONREMOVE_SA"

    invoke-virtual {v4, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 377
    const-string v0, "ACTION_MAP_LOAD_WAIT_SUCCESS_SA"

    invoke-virtual {v4, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 378
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity;->a:Landroid/content/BroadcastReceiver;

    invoke-static {p0, v0, v4}, Lo/ccd;->d(Landroid/content/Context;Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V

    .line 379
    return-void
.end method

.method private i()V
    .locals 1

    .line 217
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity;->i:Lo/cgd;

    invoke-virtual {v0}, Lo/cgd;->b()V

    .line 218
    return-void
.end method

.method private k()V
    .locals 0

    .line 283
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity;->h()V

    .line 284
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity;->m()V

    .line 286
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity;->f()V

    .line 287
    return-void
.end method

.method private m()V
    .locals 4

    .line 557
    const-string v0, "OfflineMapTabActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updateViewWhenRTLLanguage() enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 558
    invoke-static {p0}, Lo/ene;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 559
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity;->f:Landroid/widget/RadioButton;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$drawable;->track_offlinemap_tab_right:I

    invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setBackgroundResource(I)V

    .line 560
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity;->g:Landroid/widget/RadioButton;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$drawable;->track_offlinemap_tab_left:I

    invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setBackgroundResource(I)V

    .line 562
    :cond_0
    return-void
.end method

.method private p()V
    .locals 5

    .line 406
    const-string v0, "OfflineMapTabActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "stopService()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 407
    new-instance v4, Landroid/content/Intent;

    const-string v0, "ACTION_ACITITY_DESTROY_AS"

    invoke-direct {v4, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 408
    invoke-virtual {p0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, v4}, Lo/ccd;->b(Landroid/content/Context;Landroid/content/Intent;)V

    .line 409
    return-void
.end method


# virtual methods
.method public synthetic a()Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/BaseFragmentActivity$b;
    .locals 1

    .line 50
    invoke-virtual {p0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity;->b()Lo/cfs;

    move-result-object v0

    return-object v0
.end method

.method public b()Lo/cfs;
    .locals 9

    .line 292
    const-string v0, "OfflineMapTabActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getFragmentStructure() start"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 293
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 294
    invoke-virtual {p0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentManager;->getFragments()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 296
    const-string v0, "OfflineMapTabActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initTabFragment getSupportFragmentManager().getFragments() : "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    .line 298
    invoke-virtual {p0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v2

    invoke-virtual {v2}, Landroid/support/v4/app/FragmentManager;->getFragments()Ljava/util/List;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    .line 296
    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 299
    invoke-virtual {p0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentManager;->getFragments()Ljava/util/List;

    move-result-object v6

    .line 300
    const/4 v7, 0x0

    :goto_0
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    if-ge v7, v0, :cond_2

    .line 302
    invoke-interface {v6, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Landroid/support/v4/app/Fragment;

    .line 303
    instance-of v0, v8, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineDownManagerFragment;

    if-eqz v0, :cond_0

    .line 305
    move-object v0, v8

    check-cast v0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineDownManagerFragment;

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity;->n:Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineDownManagerFragment;

    goto :goto_1

    .line 307
    :cond_0
    instance-of v0, v8, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment;

    if-eqz v0, :cond_1

    .line 309
    move-object v0, v8

    check-cast v0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment;

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity;->k:Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment;

    .line 300
    :cond_1
    :goto_1
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 313
    :cond_2
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity;->n:Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineDownManagerFragment;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_3

    .line 315
    new-instance v0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineDownManagerFragment;

    invoke-direct {v0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineDownManagerFragment;-><init>()V

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity;->n:Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineDownManagerFragment;

    .line 317
    :cond_3
    new-instance v0, Lo/cfx;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->tab_1:I

    iget-object v2, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity;->n:Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineDownManagerFragment;

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct {v0, v1, v3, v4, v2}, Lo/cfx;-><init>(IIILandroid/support/v4/app/Fragment;)V

    invoke-interface {v5, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 319
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity;->k:Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_4

    .line 321
    new-instance v0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment;

    invoke-direct {v0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment;-><init>()V

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity;->k:Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment;

    .line 324
    :cond_4
    new-instance v0, Lo/cfx;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->tab_2:I

    iget-object v2, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity;->k:Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment;

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct {v0, v1, v3, v4, v2}, Lo/cfx;-><init>(IIILandroid/support/v4/app/Fragment;)V

    invoke-interface {v5, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 325
    new-instance v0, Lo/cfs;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->viewPager:I

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3, v5}, Lo/cfs;-><init>(IILandroid/support/v4/app/Fragment;Ljava/util/List;)V

    return-object v0
.end method

.method public b(I)V
    .locals 6

    .line 518
    const-string v0, "OfflineMapTabActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onPageChange: position :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 519
    if-nez p1, :cond_2

    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity;->f:Landroid/widget/RadioButton;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 521
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity;->k:Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 523
    const-string v0, "OfflineMapTabActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onPageChange citysFragment not null "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 524
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity;->k:Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment;

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment;->d()V

    goto :goto_0

    .line 528
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity;->d()Ljava/util/List;

    move-result-object v4

    .line 529
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x2

    if-lt v0, v1, :cond_1

    .line 531
    const/4 v0, 0x1

    invoke-interface {v4, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/support/v4/app/Fragment;

    .line 532
    instance-of v0, v5, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment;

    if-eqz v0, :cond_1

    .line 534
    move-object v0, v5

    check-cast v0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment;

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity;->k:Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment;

    .line 535
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity;->k:Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment;

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment;->d()V

    .line 539
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity;->f:Landroid/widget/RadioButton;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setChecked(Z)V

    .line 540
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity;->f:Landroid/widget/RadioButton;

    const-string v1, "HwChinese-medium"

    const/4 v2, 0x0

    invoke-static {v1, v2}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setTypeface(Landroid/graphics/Typeface;)V

    .line 541
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity;->g:Landroid/widget/RadioButton;

    const-string v1, "regular"

    const/4 v2, 0x0

    invoke-static {v1, v2}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setTypeface(Landroid/graphics/Typeface;)V

    goto :goto_1

    .line 543
    :cond_2
    const/4 v0, 0x1

    if-ne p1, v0, :cond_3

    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity;->g:Landroid/widget/RadioButton;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 545
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity;->g:Landroid/widget/RadioButton;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setChecked(Z)V

    .line 546
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity;->f:Landroid/widget/RadioButton;

    const-string v1, "regular"

    const/4 v2, 0x0

    invoke-static {v1, v2}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setTypeface(Landroid/graphics/Typeface;)V

    .line 547
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity;->g:Landroid/widget/RadioButton;

    const-string v1, "HwChinese-medium"

    const/4 v2, 0x0

    invoke-static {v1, v2}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setTypeface(Landroid/graphics/Typeface;)V

    .line 549
    :cond_3
    :goto_1
    return-void
.end method

.method protected c()I
    .locals 1

    .line 164
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$layout;->track_offlinemap_main_tab_layout:I

    return v0
.end method

.method public d(IFI)V
    .locals 0

    .line 554
    return-void
.end method

.method public e()V
    .locals 2

    .line 245
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity;->b:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity;->c:[Ljava/lang/String;

    invoke-static {v0, v1}, Lo/dbe;->c(Landroid/content/Context;[Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 246
    const-string v0, "android.permission.WRITE_EXTERNAL_STORAGE"

    invoke-static {p0, v0}, Lo/dbf;->m(Landroid/content/Context;Ljava/lang/String;)V

    .line 247
    const-string v0, "android.permission.ACCESS_COARSE_LOCATION"

    invoke-static {p0, v0}, Lo/dbf;->m(Landroid/content/Context;Ljava/lang/String;)V

    .line 248
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity;->c:[Ljava/lang/String;

    new-instance v1, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity$3;

    invoke-direct {v1, p0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity$3;-><init>(Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity;)V

    invoke-static {p0, v0, v1}, Lo/dbe;->a(Landroid/app/Activity;[Ljava/lang/String;Lo/dbs;)V

    goto :goto_0

    .line 261
    :cond_0
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity;->h:Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity$d;

    const/16 v1, 0xca

    invoke-virtual {v0, v1}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity$d;->sendEmptyMessage(I)Z

    .line 265
    :goto_0
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 148
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity;->o:Landroid/widget/ImageButton;

    if-ne p1, v0, :cond_0

    .line 149
    invoke-virtual {p0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity;->finish()V

    .line 151
    :cond_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 4

    .line 176
    invoke-super {p0, p1}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/BaseFragmentActivity;->onCreate(Landroid/os/Bundle;)V

    .line 177
    const-string v0, "OfflineMapTabActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCreate()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 178
    iput-object p0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity;->b:Landroid/content/Context;

    .line 181
    invoke-static {p0}, Lo/cgd;->b(Landroid/content/Context;)Lo/cgd;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity;->i:Lo/cgd;

    .line 182
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity;->i()V

    .line 198
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->offline_titlebar:I

    invoke-virtual {p0, v0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emr;

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity;->p:Lo/emr;

    .line 199
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity;->p:Lo/emr;

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity;->b:Landroid/content/Context;

    sget v2, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_offlinemap_title:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setTitleText(Ljava/lang/String;)V

    .line 200
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->tab_1:I

    invoke-virtual {p0, v0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RadioButton;

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity;->f:Landroid/widget/RadioButton;

    .line 201
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->tab_2:I

    invoke-virtual {p0, v0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RadioButton;

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity;->g:Landroid/widget/RadioButton;

    .line 202
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity;->f:Landroid/widget/RadioButton;

    const-string v1, "HwChinese-medium"

    const/4 v2, 0x0

    invoke-static {v1, v2}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setTypeface(Landroid/graphics/Typeface;)V

    .line 203
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity;->g:Landroid/widget/RadioButton;

    const-string v1, "regular"

    const/4 v2, 0x0

    invoke-static {v1, v2}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setTypeface(Landroid/graphics/Typeface;)V

    .line 204
    invoke-virtual {p0, p0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity;->b(Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/BaseFragmentActivity$d;)V

    .line 205
    new-instance v0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity$d;

    invoke-direct {v0, p0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity$d;-><init>(Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity;)V

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity;->h:Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity$d;

    .line 207
    invoke-virtual {p0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity;->e()V

    .line 209
    return-void
.end method

.method public onDestroy()V
    .locals 4

    .line 395
    const-string v0, "OfflineMapTabActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onDestroy()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 396
    invoke-super {p0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/BaseFragmentActivity;->onDestroy()V

    .line 397
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity;->p()V

    .line 398
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity;->g()V

    .line 399
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity;->i:Lo/cgd;

    invoke-virtual {v0}, Lo/cgd;->c()V

    .line 400
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity;->a:Landroid/content/BroadcastReceiver;

    invoke-static {p0, v0}, Lo/ccd;->a(Landroid/content/Context;Landroid/content/BroadcastReceiver;)V

    .line 401
    return-void
.end method

.method public onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    .locals 4

    .line 269
    const-string v0, "OfflineMapTabActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Activity-onRequestPermissionsResult() PermissionsManager.notifyPermissionsChange()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 270
    invoke-static {}, Lo/dbn;->c()Lo/dbn;

    move-result-object v0

    invoke-virtual {v0, p2, p3}, Lo/dbn;->c([Ljava/lang/String;[I)V

    .line 271
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity;->b:Landroid/content/Context;

    invoke-static {v0, p2}, Lo/dbe;->c(Landroid/content/Context;[Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 272
    const-string v0, "OfflineMapTabActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onRequestPermissionsResult :enter if"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 274
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity;->h:Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity$d;

    const/16 v1, 0xca

    invoke-virtual {v0, v1}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity$d;->sendEmptyMessage(I)Z

    goto :goto_0

    .line 276
    :cond_0
    const-string v0, "OfflineMapTabActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onRequestPermissionsResult :enter else"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 277
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity;->h:Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity$d;

    const/16 v1, 0xc9

    invoke-virtual {v0, v1}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity$d;->sendEmptyMessage(I)Z

    .line 279
    :goto_0
    return-void
.end method

.method protected onRestart()V
    .locals 4

    .line 345
    const-string v0, "OfflineMapTabActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onRestart"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 346
    invoke-super {p0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/BaseFragmentActivity;->onRestart()V

    .line 347
    return-void
.end method

.method public onResume()V
    .locals 0

    .line 338
    invoke-super {p0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/BaseFragmentActivity;->onResume()V

    .line 340
    invoke-virtual {p0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity;->initSystemBar()V

    .line 341
    return-void
.end method

.method public onStart()V
    .locals 4

    .line 333
    const-string v0, "OfflineMapTabActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onStart()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 334
    invoke-super {p0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/BaseFragmentActivity;->onStart()V

    .line 335
    return-void
.end method
