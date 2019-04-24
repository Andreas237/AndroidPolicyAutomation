.class public Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;
.super Landroid/app/Service;
.source "SourceFile"

# interfaces
.implements Lcom/amap/api/maps/offlinemap/OfflineMapManager$OfflineMapDownloadListener;
.implements Lcom/amap/api/location/AMapLocationListener;
.implements Lcom/amap/api/maps/offlinemap/OfflineMapManager$OfflineLoadedListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$d;,
        Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$e;,
        Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$c;,
        Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$b;,
        Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$h;,
        Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$a;
    }
.end annotation


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/lang/String;

.field private c:Lcom/amap/api/location/LocationManagerProxy;

.field private d:Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$d;

.field private e:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field private f:Lcom/amap/api/maps/offlinemap/OfflineMapManager;

.field private g:Landroid/content/BroadcastReceiver;

.field private h:Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$c;

.field private i:Landroid/content/Context;

.field private final k:Landroid/os/IBinder;

.field private l:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lcom/amap/api/maps/offlinemap/OfflineMapCity;>;"
        }
    .end annotation
.end field

.field private m:Z

.field private n:Z

.field private o:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field private p:Z

.field private q:Z

.field private r:Ljava/util/concurrent/ExecutorService;

.field private s:Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$a;

.field private t:Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$b;

.field private u:Landroid/content/SharedPreferences;

.field private v:Landroid/app/Notification$Builder;

.field private w:Landroid/app/PendingIntent;

.field private x:Z

.field private y:Z

.field private z:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 63
    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    .line 183
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->d:Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$d;

    .line 192
    const-string v0, "\u5317\u4eac"

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->b:Ljava/lang/String;

    .line 195
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->e:Ljava/util/ArrayList;

    .line 198
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->a:Ljava/lang/String;

    .line 201
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->c:Lcom/amap/api/location/LocationManagerProxy;

    .line 204
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->f:Lcom/amap/api/maps/offlinemap/OfflineMapManager;

    .line 207
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->i:Landroid/content/Context;

    .line 210
    new-instance v0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$h;

    invoke-direct {v0, p0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$h;-><init>(Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;)V

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->k:Landroid/os/IBinder;

    .line 213
    new-instance v0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$e;

    invoke-direct {v0, p0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$e;-><init>(Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;)V

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->g:Landroid/content/BroadcastReceiver;

    .line 216
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->h:Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$c;

    .line 219
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->l:Ljava/util/ArrayList;

    .line 222
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-static {v0}, Ljava/util/Collections;->synchronizedList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->o:Ljava/util/List;

    .line 225
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->m:Z

    .line 228
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->p:Z

    .line 231
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->n:Z

    .line 234
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->q:Z

    .line 237
    sget-object v0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$a;->e:Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$a;

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->s:Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$a;

    .line 258
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->x:Z

    .line 260
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->y:Z

    .line 262
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->z:Z

    return-void
.end method

.method private a()V
    .locals 2

    .line 802
    iget-boolean v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->n:Z

    if-nez v0, :cond_0

    .line 804
    new-instance v1, Landroid/content/IntentFilter;

    invoke-direct {v1}, Landroid/content/IntentFilter;-><init>()V

    .line 805
    new-instance v0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$c;

    invoke-direct {v0, p0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$c;-><init>(Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;)V

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->h:Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$c;

    .line 806
    const-string v0, "android.net.conn.CONNECTIVITY_CHANGE"

    invoke-virtual {v1, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 807
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->h:Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$c;

    invoke-virtual {p0, v0, v1}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 808
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->n:Z

    .line 810
    :cond_0
    return-void
.end method

.method private a(Landroid/content/Intent;)V
    .locals 5

    .line 457
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->p:Z

    .line 458
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->u:Landroid/content/SharedPreferences;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 460
    const-string v0, "TAG_SAVE_LOCAL_CITY_CODE"

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->u:Landroid/content/SharedPreferences;

    .line 462
    :cond_0
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->u:Landroid/content/SharedPreferences;

    const-string v1, "TAG_SAVE_LOCAL_CITY_CODE"

    const-string v2, ""

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 463
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->u:Landroid/content/SharedPreferences;

    const-string v1, "TAG_SAVE_LOADING_ERROR_CITY"

    const-string v2, ""

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->k(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->e:Ljava/util/ArrayList;

    .line 464
    const-string v0, "OfflineMapService"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onStartCommand city"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->e:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 465
    invoke-virtual {v4}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "null"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 467
    const-string v0, "OfflineMapService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onStartCommand() mLocalCode = code"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 468
    iput-object v4, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->b:Ljava/lang/String;

    .line 470
    :cond_1
    invoke-direct {p0, p1}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->e(Landroid/content/Intent;)V

    .line 471
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->a()V

    .line 472
    return-void
.end method

.method static synthetic a(Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;)V
    .locals 0

    .line 63
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->b()V

    return-void
.end method

.method static synthetic a(Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;Ljava/lang/String;)V
    .locals 0

    .line 63
    invoke-direct {p0, p1}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->b(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic a(Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;Ljava/lang/String;Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineMapCityList;)V
    .locals 0

    .line 63
    invoke-direct {p0, p1, p2}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->e(Ljava/lang/String;Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineMapCityList;)V

    return-void
.end method

.method static synthetic a(Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;Ljava/util/List;Ljava/lang/String;)V
    .locals 0

    .line 63
    invoke-direct {p0, p1, p2}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->e(Ljava/util/List;Ljava/lang/String;)V

    return-void
.end method

.method private a(Ljava/lang/String;)V
    .locals 7

    .line 1260
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    const-string v0, "null"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1262
    :cond_0
    const-string v0, "OfflineMapService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "loadCity() city is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1263
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->l:Ljava/util/ArrayList;

    invoke-direct {p0, v0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->b(Ljava/util/ArrayList;)V

    .line 1264
    return-void

    .line 1266
    :cond_1
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->f:Lcom/amap/api/maps/offlinemap/OfflineMapManager;

    invoke-virtual {v0, p1}, Lcom/amap/api/maps/offlinemap/OfflineMapManager;->getItemByCityName(Ljava/lang/String;)Lcom/amap/api/maps/offlinemap/OfflineMapCity;

    move-result-object v4

    .line 1267
    if-nez v4, :cond_2

    .line 1268
    const-string v0, "OfflineMapService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "City : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "not exist"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1269
    return-void

    .line 1271
    :cond_2
    invoke-virtual {v4}, Lcom/amap/api/maps/offlinemap/OfflineMapCity;->getState()I

    move-result v0

    if-nez v0, :cond_3

    .line 1273
    const-string v0, "OfflineMapService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "loadCity() city is loading"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1274
    return-void

    .line 1278
    :cond_3
    :try_start_0
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 1279
    const-string v0, "click"

    const-string v1, "1"

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1280
    const-string v0, "city"

    invoke-interface {v5, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1281
    sget-object v0, Lo/dae;->dK:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v6

    .line 1282
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->i:Landroid/content/Context;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v6, v5, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 1283
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->f:Lcom/amap/api/maps/offlinemap/OfflineMapManager;

    invoke-virtual {v0, p1}, Lcom/amap/api/maps/offlinemap/OfflineMapManager;->downloadByCityName(Ljava/lang/String;)V

    .line 1284
    const-string v0, "OfflineMapService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "loadCity() finish"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Lcom/amap/api/maps/AMapException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1292
    goto :goto_0

    .line 1286
    :catch_0
    move-exception v5

    .line 1288
    invoke-virtual {v5}, Lcom/amap/api/maps/AMapException;->getErrorMessage()Ljava/lang/String;

    move-result-object v6

    .line 1290
    const-string v0, "OfflineMapService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v6, v1, v2

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1291
    invoke-direct {p0, v6}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->h(Ljava/lang/String;)V

    .line 1293
    :goto_0
    return-void
.end method

.method private a(Ljava/lang/String;Z)V
    .locals 4

    .line 515
    const-string v0, "OfflineMapService"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getAllData() intent:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    const-string v2, ",isCheckUpdate:"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 516
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->r:Ljava/util/concurrent/ExecutorService;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 518
    const/4 v0, 0x3

    invoke-static {v0}, Ljava/util/concurrent/Executors;->newFixedThreadPool(I)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->r:Ljava/util/concurrent/ExecutorService;

    .line 520
    :cond_0
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->r:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$2;

    invoke-direct {v1, p0, p2, p1}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$2;-><init>(Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;ZLjava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 538
    return-void
.end method

.method static synthetic a(Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;Z)Z
    .locals 0

    .line 63
    iput-boolean p1, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->q:Z

    return p1
.end method

.method private a(Ljava/util/ArrayList;)Z
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lcom/amap/api/maps/offlinemap/OfflineMapCity;>;)Z"
        }
    .end annotation

    .line 1582
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v4

    .line 1583
    const-string v0, "OfflineMapService"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isLoading() size:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1584
    if-gtz v4, :cond_1

    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->e:Ljava/util/ArrayList;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->e:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1586
    :cond_0
    const-string v0, "OfflineMapService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mLoadingCityList.size()=0 and null=mLoadOrErrorCity"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1587
    const/4 v0, 0x0

    return v0

    .line 1591
    :cond_1
    const/4 v0, 0x1

    return v0
.end method

.method static synthetic b(Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;Ljava/util/ArrayList;ZLjava/util/List;)Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineMapCityList;
    .locals 1

    .line 63
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->e(Ljava/util/ArrayList;ZLjava/util/List;)Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineMapCityList;

    move-result-object v0

    return-object v0
.end method

.method static synthetic b(Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;)Ljava/util/ArrayList;
    .locals 1

    .line 63
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->l:Ljava/util/ArrayList;

    return-object v0
.end method

.method private b(Ljava/util/List;)Ljava/util/List;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/amap/api/maps/offlinemap/OfflineMapCity;>;)Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation

    .line 1349
    const-string v0, "OfflineMapService"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getWaitCityList() list:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1350
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 1351
    const/4 v5, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-ge v5, v0, :cond_2

    .line 1353
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/amap/api/maps/offlinemap/OfflineMapCity;

    .line 1354
    invoke-virtual {v6}, Lcom/amap/api/maps/offlinemap/OfflineMapCity;->getCity()Ljava/lang/String;

    move-result-object v7

    .line 1355
    invoke-virtual {v6}, Lcom/amap/api/maps/offlinemap/OfflineMapCity;->getState()I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    invoke-virtual {v6}, Lcom/amap/api/maps/offlinemap/OfflineMapCity;->getState()I

    move-result v0

    if-nez v0, :cond_1

    .line 1357
    :cond_0
    invoke-interface {v4, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1351
    :cond_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 1360
    :cond_2
    const-string v0, "OfflineMapService"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getWaitCityList() waitList:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1361
    return-object v4
.end method

.method private b()V
    .locals 2

    .line 766
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->r:Ljava/util/concurrent/ExecutorService;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 768
    const/4 v0, 0x3

    invoke-static {v0}, Ljava/util/concurrent/Executors;->newFixedThreadPool(I)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->r:Ljava/util/concurrent/ExecutorService;

    .line 770
    :cond_0
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->r:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$1;

    invoke-direct {v1, p0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$1;-><init>(Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 797
    return-void
.end method

.method static synthetic b(Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;Ljava/lang/String;)V
    .locals 0

    .line 63
    invoke-direct {p0, p1}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->e(Ljava/lang/String;)V

    return-void
.end method

.method private b(Ljava/lang/String;)V
    .locals 4

    .line 1187
    const-string v0, "OfflineMapService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "loadWaitThread()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1188
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->r:Ljava/util/concurrent/ExecutorService;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 1190
    const/4 v0, 0x3

    invoke-static {v0}, Ljava/util/concurrent/Executors;->newFixedThreadPool(I)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->r:Ljava/util/concurrent/ExecutorService;

    .line 1192
    :cond_0
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->r:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$3;

    invoke-direct {v1, p0, p1}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$3;-><init>(Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 1203
    return-void
.end method

.method private b(Ljava/util/ArrayList;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lcom/amap/api/maps/offlinemap/OfflineMapCity;>;)V"
        }
    .end annotation

    .line 1311
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v4

    .line 1312
    const-string v0, "OfflineMapService"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "loadWaitCity() loadingCityList:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1313
    if-gtz v4, :cond_0

    .line 1315
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->f:Lcom/amap/api/maps/offlinemap/OfflineMapManager;

    invoke-virtual {v0}, Lcom/amap/api/maps/offlinemap/OfflineMapManager;->restart()V

    .line 1316
    return-void

    .line 1318
    :cond_0
    const/4 v5, 0x0

    :goto_0
    if-ge v5, v4, :cond_2

    .line 1320
    invoke-virtual {p1, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/amap/api/maps/offlinemap/OfflineMapCity;

    .line 1321
    if-eqz v6, :cond_1

    .line 1322
    invoke-virtual {v6}, Lcom/amap/api/maps/offlinemap/OfflineMapCity;->getState()I

    move-result v7

    .line 1323
    invoke-virtual {v6}, Lcom/amap/api/maps/offlinemap/OfflineMapCity;->getCity()Ljava/lang/String;

    move-result-object v8

    .line 1324
    const/4 v0, 0x2

    if-ne v7, v0, :cond_1

    .line 1325
    invoke-direct {p0, v8}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->a(Ljava/lang/String;)V

    .line 1326
    return-void

    .line 1318
    :cond_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 1330
    :cond_2
    return-void
.end method

.method private c(Ljava/util/ArrayList;)Ljava/util/ArrayList;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lcom/amap/api/maps/offlinemap/OfflineMapProvince;>;)Ljava/util/ArrayList<Lcom/amap/api/maps/offlinemap/OfflineMapCity;>;"
        }
    .end annotation

    .line 543
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 544
    const/4 v5, 0x0

    :goto_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v5, v0, :cond_2

    .line 546
    invoke-virtual {p1, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/amap/api/maps/offlinemap/OfflineMapProvince;

    .line 548
    invoke-virtual {v6}, Lcom/amap/api/maps/offlinemap/OfflineMapProvince;->getCityList()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_1
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/amap/api/maps/offlinemap/OfflineMapCity;

    .line 550
    if-eqz v8, :cond_0

    .line 551
    invoke-virtual {v8}, Lcom/amap/api/maps/offlinemap/OfflineMapCity;->getState()I

    move-result v9

    .line 552
    sparse-switch v9, :sswitch_data_0

    goto :goto_2

    .line 558
    :sswitch_0
    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 559
    .line 564
    :cond_0
    :goto_2
    goto :goto_1

    .line 544
    :cond_1
    add-int/lit8 v5, v5, 0x1

    goto/16 :goto_0

    .line 567
    :cond_2
    const-string v0, "OfflineMapService"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getDownloadingCityList() finish loadingCityList:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 568
    iput-object v4, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->l:Ljava/util/ArrayList;

    .line 569
    return-object v4

    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x1 -> :sswitch_0
        0x2 -> :sswitch_0
        0x3 -> :sswitch_0
        0x65 -> :sswitch_0
    .end sparse-switch
.end method

.method private c()V
    .locals 3

    .line 815
    new-instance v2, Landroid/content/IntentFilter;

    invoke-direct {v2}, Landroid/content/IntentFilter;-><init>()V

    .line 816
    const-string v0, "ACITON_ACTIVITY_LOAD_CITY_AS"

    invoke-virtual {v2, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 817
    const-string v0, "ACITON_ACTIVITY_DELETE_CITY_AS"

    invoke-virtual {v2, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 818
    const-string v0, "ACITON_ACTIVITY_WAIT_CITY_AS"

    invoke-virtual {v2, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 819
    const-string v0, "ACTION_ACTIVITY_PAUSE_CITY_AS"

    invoke-virtual {v2, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 820
    const-string v0, "ACTION_ACITITY_DESTROY_AS"

    invoke-virtual {v2, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 821
    const-string v0, "ACTION_SPORT_START_DESTROY_SERVICE_AS"

    invoke-virtual {v2, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 822
    const-string v0, "ACTION_MAP_ONCHRCKUPDATE_AS"

    invoke-virtual {v2, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 823
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->i:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->g:Landroid/content/BroadcastReceiver;

    invoke-static {v0, v1, v2}, Lo/ccd;->d(Landroid/content/Context;Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V

    .line 824
    return-void
.end method

.method static synthetic c(Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;)V
    .locals 0

    .line 63
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->l()V

    return-void
.end method

.method static synthetic c(Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;Ljava/lang/String;)V
    .locals 0

    .line 63
    invoke-direct {p0, p1}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->f(Ljava/lang/String;)V

    return-void
.end method

.method private c(Ljava/lang/String;)V
    .locals 4

    .line 1298
    const-string v0, "OfflineMapService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "pauseLoading()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1299
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->f:Lcom/amap/api/maps/offlinemap/OfflineMapManager;

    invoke-virtual {v0}, Lcom/amap/api/maps/offlinemap/OfflineMapManager;->pause()V

    .line 1300
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->l:Ljava/util/ArrayList;

    invoke-direct {p0, v0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->b(Ljava/util/ArrayList;)V

    .line 1301
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->e:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1303
    const-string v0, "OfflineMapService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "pauseLoading() mLoadOrErrorCity =null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1306
    :cond_0
    return-void
.end method

.method static synthetic c(Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;Ljava/util/ArrayList;)Z
    .locals 1

    .line 63
    invoke-direct {p0, p1}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->a(Ljava/util/ArrayList;)Z

    move-result v0

    return v0
.end method

.method static synthetic c(Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;Z)Z
    .locals 0

    .line 63
    iput-boolean p1, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->p:Z

    return p1
.end method

.method private d()Ljava/util/ArrayList;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/ArrayList<Lcom/amap/api/maps/offlinemap/OfflineMapProvince;>;"
        }
    .end annotation

    .line 575
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->f:Lcom/amap/api/maps/offlinemap/OfflineMapManager;

    invoke-virtual {v0}, Lcom/amap/api/maps/offlinemap/OfflineMapManager;->getOfflineMapProvinceList()Ljava/util/ArrayList;

    move-result-object v1

    .line 576
    return-object v1
.end method

.method static synthetic d(Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;)Ljava/util/ArrayList;
    .locals 1

    .line 63
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->d()Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method

.method static synthetic d(Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;Ljava/util/ArrayList;)Ljava/util/ArrayList;
    .locals 1

    .line 63
    invoke-direct {p0, p1}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->c(Ljava/util/ArrayList;)Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method

.method static synthetic d(Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;Ljava/util/List;)Ljava/util/List;
    .locals 1

    .line 63
    invoke-direct {p0, p1}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->b(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method private d(I)V
    .locals 4

    .line 1492
    const-string v0, "OfflineMapService"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "toastMessage() message"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1493
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->t:Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$b;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 1495
    const-string v0, "OfflineMapService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "toastMessage() mHandler null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1496
    return-void

    .line 1498
    :cond_0
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->t:Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$b;

    new-instance v1, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$9;

    invoke-direct {v1, p0, p1}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$9;-><init>(Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;I)V

    invoke-virtual {v0, v1}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$b;->post(Ljava/lang/Runnable;)Z

    .line 1506
    return-void
.end method

.method static synthetic d(Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;Ljava/lang/String;)V
    .locals 0

    .line 63
    invoke-direct {p0, p1}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->c(Ljava/lang/String;)V

    return-void
.end method

.method private d(Ljava/lang/String;)V
    .locals 5

    .line 1149
    const-string v0, "OfflineMapService"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "removeUpdateListCity city:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1150
    const/4 v4, 0x0

    :goto_0
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->o:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v4, v0, :cond_1

    .line 1152
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->o:Ljava/util/List;

    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1154
    const-string v0, "OfflineMapService"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "removeUpdateListCity equals remove : "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1155
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->o:Ljava/util/List;

    invoke-interface {v0, v4}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 1156
    goto :goto_1

    .line 1150
    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 1159
    :cond_1
    :goto_1
    return-void
.end method

.method static synthetic e(Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$a;)Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$a;
    .locals 0

    .line 63
    iput-object p1, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->s:Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$a;

    return-object p1
.end method

.method private e(Ljava/util/ArrayList;ZLjava/util/List;)Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineMapCityList;
    .locals 20
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lcom/amap/api/maps/offlinemap/OfflineMapProvince;>;ZLjava/util/List<Ljava/lang/String;>;)Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineMapCityList;"
        }
    .end annotation

    .line 583
    const-string v0, "OfflineMapService"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getOfflineMapCityList() enter provinceList:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual/range {p1 .. p1}, Ljava/util/ArrayList;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 584
    new-instance v4, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineMapCityList;

    invoke-direct {v4}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineMapCityList;-><init>()V

    .line 588
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 592
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 595
    new-instance v7, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CityListBean;

    invoke-direct {v7}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CityListBean;-><init>()V

    .line 598
    new-instance v8, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CityListBean;

    invoke-direct {v8}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CityListBean;-><init>()V

    .line 601
    new-instance v9, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CityListBean;

    invoke-direct {v9}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CityListBean;-><init>()V

    .line 604
    new-instance v10, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CityListBean;

    invoke-direct {v10}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CityListBean;-><init>()V

    .line 606
    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 608
    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 609
    const/4 v13, 0x0

    :goto_0
    invoke-virtual/range {p1 .. p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v13, v0, :cond_a

    .line 611
    move-object/from16 v0, p1

    invoke-virtual {v0, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v14, v0

    check-cast v14, Lcom/amap/api/maps/offlinemap/OfflineMapProvince;

    .line 613
    new-instance v15, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CityListBean;

    invoke-direct {v15}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CityListBean;-><init>()V

    .line 614
    invoke-virtual {v14}, Lcom/amap/api/maps/offlinemap/OfflineMapProvince;->getCityList()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v16

    :goto_1
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v17, v0

    check-cast v17, Lcom/amap/api/maps/offlinemap/OfflineMapCity;

    .line 616
    if-eqz v17, :cond_7

    .line 617
    invoke-virtual/range {v17 .. v17}, Lcom/amap/api/maps/offlinemap/OfflineMapCity;->getState()I

    move-result v18

    .line 619
    invoke-virtual/range {v17 .. v17}, Lcom/amap/api/maps/offlinemap/OfflineMapCity;->getCity()Ljava/lang/String;

    move-result-object v19

    .line 620
    sparse-switch v18, :sswitch_data_0

    goto/16 :goto_2

    .line 632
    :sswitch_0
    move-object/from16 v0, v17

    invoke-virtual {v12, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 633
    const-string v0, "OfflineMapService"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "offlineMapCity11=="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual/range {v17 .. v17}, Lcom/amap/api/maps/offlinemap/OfflineMapCity;->getState()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 634
    goto :goto_2

    .line 636
    :sswitch_1
    move-object/from16 v0, v17

    invoke-virtual {v12, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 637
    move-object/from16 v0, p0

    iget-boolean v0, v0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->y:Z

    if-eqz v0, :cond_0

    .line 638
    move-object/from16 v0, p0

    move-object/from16 v1, v19

    invoke-direct {v0, v1}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->a(Ljava/lang/String;)V

    .line 640
    :cond_0
    const-string v0, "OfflineMapService"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "offlineMapCity11=="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual/range {v17 .. v17}, Lcom/amap/api/maps/offlinemap/OfflineMapCity;->getState()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 641
    goto :goto_2

    .line 651
    :sswitch_2
    move-object/from16 v0, v17

    invoke-virtual {v11, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 652
    goto :goto_2

    .line 654
    :sswitch_3
    move-object/from16 v0, p3

    move-object/from16 v1, v19

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 655
    goto :goto_2

    .line 657
    :sswitch_4
    move-object/from16 v0, v17

    invoke-virtual {v11, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 658
    .line 663
    :goto_2
    invoke-virtual {v14}, Lcom/amap/api/maps/offlinemap/OfflineMapProvince;->getCityList()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    .line 665
    move-object/from16 v0, v17

    invoke-virtual {v15, v0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CityListBean;->add(Ljava/lang/Object;)Z

    .line 668
    :cond_1
    const-string v0, "\u9999\u6e2f"

    move-object/from16 v1, v19

    invoke-virtual {v1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "\u6fb3\u95e8"

    move-object/from16 v1, v19

    invoke-virtual {v1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 669
    :cond_2
    move-object/from16 v0, v17

    invoke-virtual {v8, v0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CityListBean;->add(Ljava/lang/Object;)Z

    .line 671
    :cond_3
    const-string v0, "\u5168\u56fd\u6982\u8981\u56fe"

    move-object/from16 v1, v19

    invoke-virtual {v1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 672
    move-object/from16 v0, v17

    invoke-virtual {v9, v0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CityListBean;->add(Ljava/lang/Object;)Z

    .line 674
    :cond_4
    const-string v0, "\u5317\u4eac"

    move-object/from16 v1, v19

    invoke-virtual {v1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_5

    const-string v0, "\u4e0a\u6d77"

    move-object/from16 v1, v19

    invoke-virtual {v1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_5

    const-string v0, "\u5929\u6d25"

    move-object/from16 v1, v19

    invoke-virtual {v1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_5

    const-string v0, "\u91cd\u5e86"

    .line 675
    move-object/from16 v1, v19

    invoke-virtual {v1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 676
    :cond_5
    move-object/from16 v0, v17

    invoke-virtual {v7, v0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CityListBean;->add(Ljava/lang/Object;)Z

    .line 678
    :cond_6
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->b:Ljava/lang/String;

    move-object/from16 v1, v19

    invoke-virtual {v1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 679
    const-string v0, "OfflineMapService"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getOfflineMapCityList currentList CITY = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual/range {v17 .. v17}, Lcom/amap/api/maps/offlinemap/OfflineMapCity;->getCity()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ",state = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-virtual/range {v17 .. v17}, Lcom/amap/api/maps/offlinemap/OfflineMapCity;->getState()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, ",complete = "

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-virtual/range {v17 .. v17}, Lcom/amap/api/maps/offlinemap/OfflineMapCity;->getcompleteCode()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 680
    move-object/from16 v0, v17

    invoke-virtual {v10, v0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CityListBean;->add(Ljava/lang/Object;)Z

    .line 684
    :cond_7
    goto/16 :goto_1

    .line 685
    :cond_8
    invoke-virtual {v14}, Lcom/amap/api/maps/offlinemap/OfflineMapProvince;->getCityList()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_9

    .line 688
    invoke-virtual {v6, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 690
    :cond_9
    add-int/lit8 v0, v13, 0x4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v5, v0, v15}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 609
    add-int/lit8 v13, v13, 0x1

    goto/16 :goto_0

    .line 692
    :cond_a
    const/4 v0, 0x0

    move-object/from16 v1, p0

    iput-boolean v0, v1, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->y:Z

    .line 695
    new-instance v13, Lcom/amap/api/maps/offlinemap/OfflineMapProvince;

    invoke-direct {v13}, Lcom/amap/api/maps/offlinemap/OfflineMapProvince;-><init>()V

    .line 696
    const-string v0, "\u5f53\u524d\u57ce\u5e02"

    invoke-virtual {v13, v0}, Lcom/amap/api/maps/offlinemap/OfflineMapProvince;->setProvinceName(Ljava/lang/String;)V

    .line 697
    move-object/from16 v0, p1

    const/4 v1, 0x0

    invoke-virtual {v0, v1, v13}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 700
    new-instance v13, Lcom/amap/api/maps/offlinemap/OfflineMapProvince;

    invoke-direct {v13}, Lcom/amap/api/maps/offlinemap/OfflineMapProvince;-><init>()V

    .line 701
    const-string v0, "\u6982\u8981\u56fe"

    invoke-virtual {v13, v0}, Lcom/amap/api/maps/offlinemap/OfflineMapProvince;->setProvinceName(Ljava/lang/String;)V

    .line 702
    move-object/from16 v0, p1

    const/4 v1, 0x1

    invoke-virtual {v0, v1, v13}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 705
    new-instance v13, Lcom/amap/api/maps/offlinemap/OfflineMapProvince;

    invoke-direct {v13}, Lcom/amap/api/maps/offlinemap/OfflineMapProvince;-><init>()V

    .line 706
    const-string v0, "\u76f4\u8f96\u5e02"

    invoke-virtual {v13, v0}, Lcom/amap/api/maps/offlinemap/OfflineMapProvince;->setProvinceName(Ljava/lang/String;)V

    .line 707
    move-object/from16 v0, p1

    const/4 v1, 0x2

    invoke-virtual {v0, v1, v13}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 710
    new-instance v13, Lcom/amap/api/maps/offlinemap/OfflineMapProvince;

    invoke-direct {v13}, Lcom/amap/api/maps/offlinemap/OfflineMapProvince;-><init>()V

    .line 711
    const-string v0, "\u6e2f\u6fb3"

    invoke-virtual {v13, v0}, Lcom/amap/api/maps/offlinemap/OfflineMapProvince;->setProvinceName(Ljava/lang/String;)V

    .line 712
    move-object/from16 v0, p1

    const/4 v1, 0x3

    invoke-virtual {v0, v1, v13}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 715
    move-object/from16 v0, p1

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->removeAll(Ljava/util/Collection;)Z

    .line 716
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v5, v0, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 717
    const/4 v0, 0x1

    move-object/from16 v1, p0

    iput-boolean v0, v1, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->m:Z

    .line 718
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v5, v0, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 719
    const/4 v0, 0x2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v5, v0, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 720
    const/4 v0, 0x3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v5, v0, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 721
    move-object/from16 v0, p0

    iput-object v12, v0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->l:Ljava/util/ArrayList;

    .line 722
    invoke-virtual {v4, v5}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineMapCityList;->setmCityMap(Ljava/util/HashMap;)V

    .line 723
    invoke-virtual {v4, v12}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineMapCityList;->setmLoadingCityList(Ljava/util/ArrayList;)V

    .line 724
    invoke-virtual {v4, v11}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineMapCityList;->setmDownCityList(Ljava/util/ArrayList;)V

    .line 725
    move-object/from16 v0, p1

    invoke-virtual {v4, v0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineMapCityList;->setmProvinceList(Ljava/util/ArrayList;)V

    .line 726
    const-string v0, "OfflineMapService"

    const/4 v1, 0x5

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getOfflineMapCityList() finish provinceList:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    .line 728
    invoke-virtual/range {p1 .. p1}, Ljava/util/ArrayList;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, ",cityMap:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    .line 729
    invoke-virtual {v5}, Ljava/util/HashMap;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, ",loadingCityList:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    .line 730
    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, ",downCityList:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    .line 731
    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x4

    aput-object v2, v1, v3

    .line 726
    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 732
    return-object v4

    :sswitch_data_0
    .sparse-switch
        -0x1 -> :sswitch_1
        0x0 -> :sswitch_0
        0x1 -> :sswitch_0
        0x2 -> :sswitch_0
        0x3 -> :sswitch_0
        0x4 -> :sswitch_2
        0x5 -> :sswitch_0
        0x7 -> :sswitch_3
        0xa -> :sswitch_4
        0x65 -> :sswitch_0
        0x66 -> :sswitch_0
        0x67 -> :sswitch_0
    .end sparse-switch
.end method

.method private e()V
    .locals 4

    .line 428
    new-instance v0, Lcom/amap/api/maps/offlinemap/OfflineMapManager;

    invoke-direct {v0, p0, p0}, Lcom/amap/api/maps/offlinemap/OfflineMapManager;-><init>(Landroid/content/Context;Lcom/amap/api/maps/offlinemap/OfflineMapManager$OfflineMapDownloadListener;)V

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->f:Lcom/amap/api/maps/offlinemap/OfflineMapManager;

    .line 429
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->f:Lcom/amap/api/maps/offlinemap/OfflineMapManager;

    invoke-virtual {v0, p0}, Lcom/amap/api/maps/offlinemap/OfflineMapManager;->setOnOfflineLoadedListener(Lcom/amap/api/maps/offlinemap/OfflineMapManager$OfflineLoadedListener;)V

    .line 430
    const-string v0, "TAG_SAVE_LOCAL_CITY_CODE"

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->u:Landroid/content/SharedPreferences;

    .line 432
    new-instance v3, Landroid/content/Intent;

    invoke-direct {v3}, Landroid/content/Intent;-><init>()V

    .line 433
    new-instance v0, Landroid/content/ComponentName;

    const-class v1, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v3, v0}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 434
    const/high16 v0, 0x10200000

    invoke-virtual {v3, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 435
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->i:Landroid/content/Context;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {v0, v1, v3, v2}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->w:Landroid/app/PendingIntent;

    .line 436
    new-instance v0, Landroid/app/Notification$Builder;

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->i:Landroid/content/Context;

    invoke-direct {v0, v1}, Landroid/app/Notification$Builder;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->v:Landroid/app/Notification$Builder;

    .line 437
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->c()V

    .line 438
    return-void
.end method

.method private e(Landroid/content/Intent;)V
    .locals 5

    .line 478
    if-nez p1, :cond_0

    .line 480
    const-string v0, "OfflineMapService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleIntent() intent null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 481
    return-void

    .line 483
    :cond_0
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v4

    .line 484
    const-string v0, "OfflineMapService"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleIntent() action: "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 485
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->i:Landroid/content/Context;

    invoke-static {v0}, Lo/cfu;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 487
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->y:Z

    .line 498
    :cond_1
    if-eqz v4, :cond_2

    const-string v0, "ACTION_OFFLINE_MAP_ACTIVTY_START_AS"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 500
    sget-object v0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$a;->a:Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$a;

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->s:Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$a;

    .line 501
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->i()V

    goto :goto_0

    .line 503
    :cond_2
    if-eqz v4, :cond_3

    const-string v0, "ACTION_MAIN_ACTIVITY_START_AS"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 505
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->q:Z

    .line 506
    sget-object v0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$a;->c:Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$a;

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->s:Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$a;

    .line 507
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->b()V

    .line 510
    :cond_3
    :goto_0
    return-void
.end method

.method static synthetic e(Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;)V
    .locals 0

    .line 63
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->k()V

    return-void
.end method

.method static synthetic e(Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;I)V
    .locals 0

    .line 63
    invoke-direct {p0, p1}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->d(I)V

    return-void
.end method

.method static synthetic e(Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;Ljava/lang/String;)V
    .locals 0

    .line 63
    invoke-direct {p0, p1}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->a(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic e(Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;Ljava/util/ArrayList;)V
    .locals 0

    .line 63
    invoke-direct {p0, p1}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->b(Ljava/util/ArrayList;)V

    return-void
.end method

.method private e(Ljava/lang/String;)V
    .locals 4

    .line 1164
    invoke-direct {p0, p1}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->i(Ljava/lang/String;)V

    .line 1165
    const-string v0, "OfflineMapService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "deleteCity()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1166
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    const-string v0, "null"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1168
    :cond_0
    const-string v0, "OfflineMapService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "deleteCity() city is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1169
    return-void

    .line 1171
    :cond_1
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->r:Ljava/util/concurrent/ExecutorService;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_2

    .line 1173
    const/4 v0, 0x3

    invoke-static {v0}, Ljava/util/concurrent/Executors;->newFixedThreadPool(I)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->r:Ljava/util/concurrent/ExecutorService;

    .line 1175
    :cond_2
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->r:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$5;

    invoke-direct {v1, p0, p1}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$5;-><init>(Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 1182
    return-void
.end method

.method private e(Ljava/lang/String;Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineMapCityList;)V
    .locals 6

    .line 1566
    const-string v0, "OfflineMapService"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "sendDataToActivity() intent:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1567
    new-instance v4, Landroid/content/Intent;

    invoke-direct {v4, p1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 1568
    new-instance v5, Landroid/os/Bundle;

    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    .line 1569
    const-string v0, "TAG_ALL_CITY_LIST_SA"

    invoke-virtual {v5, v0, p2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 1570
    invoke-virtual {v4, v5}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 1571
    const-string v0, "ACTION_MAP_LOAD_WAIT_SUCCESS_SA"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1573
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->q:Z

    .line 1575
    :cond_0
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->i:Landroid/content/Context;

    invoke-static {v0, v4}, Lo/ccd;->b(Landroid/content/Context;Landroid/content/Intent;)V

    .line 1576
    return-void
.end method

.method private e(Ljava/util/List;Ljava/lang/String;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/String;>;Ljava/lang/String;)V"
        }
    .end annotation

    .line 1335
    const-string v0, "OfflineMapService"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "loadWaitingCity() list:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1336
    const/4 v4, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-ge v4, v0, :cond_1

    .line 1338
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Ljava/lang/String;

    .line 1339
    invoke-virtual {v5, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1341
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->a(Ljava/lang/String;)V

    .line 1336
    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 1344
    :cond_1
    return-void
.end method

.method static synthetic f(Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;)Ljava/util/List;
    .locals 1

    .line 63
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->o:Ljava/util/List;

    return-object v0
.end method

.method private f()V
    .locals 2

    .line 1208
    const-string v0, "ACTION_MAP_ONDOWNLOAD_SA"

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->a(Ljava/lang/String;Z)V

    .line 1209
    return-void
.end method

.method private f(Ljava/lang/String;)V
    .locals 0

    .line 1374
    invoke-direct {p0, p1}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->d(Ljava/lang/String;)V

    .line 1375
    invoke-direct {p0, p1}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->a(Ljava/lang/String;)V

    .line 1377
    return-void
.end method

.method static synthetic g(Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;)Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$a;
    .locals 1

    .line 63
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->s:Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$a;

    return-object v0
.end method

.method private g()V
    .locals 8

    .line 1238
    const-string v0, "OfflineMapService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updateWait()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1239
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->d()Ljava/util/ArrayList;

    move-result-object v4

    .line 1240
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->o:Ljava/util/List;

    const/4 v1, 0x0

    invoke-direct {p0, v4, v1, v0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->e(Ljava/util/ArrayList;ZLjava/util/List;)Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineMapCityList;

    move-result-object v5

    .line 1241
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->t:Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$b;

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$b;->obtainMessage()Landroid/os/Message;

    move-result-object v6

    .line 1242
    const/16 v0, 0x65

    iput v0, v6, Landroid/os/Message;->what:I

    .line 1243
    new-instance v7, Landroid/os/Bundle;

    invoke-direct {v7}, Landroid/os/Bundle;-><init>()V

    .line 1244
    const-string v0, "TAG_MSG_SEND_INTENT"

    const-string v1, "ACTION_MAP_LOAD_WAIT_SUCCESS_SA"

    invoke-virtual {v7, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 1245
    const-string v0, "TAG_MSG_SEND_LIST"

    invoke-virtual {v7, v0, v5}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 1246
    invoke-virtual {v6, v7}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V

    .line 1247
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->t:Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$b;

    invoke-virtual {v0, v6}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$b;->sendMessage(Landroid/os/Message;)Z

    .line 1248
    return-void
.end method

.method private g(Ljava/lang/String;)V
    .locals 4

    .line 1511
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 1513
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->e:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1514
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->e:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1516
    :cond_0
    const/4 v3, 0x0

    :goto_0
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->e:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v3, v0, :cond_1

    .line 1517
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->e:Ljava/util/ArrayList;

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1518
    const-string v0, "|"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1516
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 1521
    :cond_1
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1523
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->u:Landroid/content/SharedPreferences;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_2

    .line 1525
    const-string v0, "TAG_SAVE_LOCAL_CITY_CODE"

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->u:Landroid/content/SharedPreferences;

    .line 1528
    :cond_2
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->u:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v3

    .line 1529
    const-string v0, "TAG_SAVE_LOADING_ERROR_CITY"

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v3, v0, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 1530
    invoke-interface {v3}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 1531
    return-void
.end method

.method static synthetic h(Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;)Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$b;
    .locals 1

    .line 63
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->t:Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$b;

    return-object v0
.end method

.method private h()V
    .locals 4

    .line 1253
    const-string v0, "OfflineMapService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updateDelete()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1254
    const-string v0, "ACTION_MAP_ONREMOVE_SA"

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->a(Ljava/lang/String;Z)V

    .line 1255
    return-void
.end method

.method private h(Ljava/lang/String;)V
    .locals 4

    .line 1475
    const-string v0, "OfflineMapService"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "toastMessage() message"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1476
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->t:Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$b;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 1478
    const-string v0, "OfflineMapService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "toastMessage() mHandler null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1479
    return-void

    .line 1481
    :cond_0
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->t:Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$b;

    new-instance v1, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$4;

    invoke-direct {v1, p0, p1}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$4;-><init>(Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$b;->post(Ljava/lang/Runnable;)Z

    .line 1487
    return-void
.end method

.method static synthetic i(Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;)Lcom/amap/api/maps/offlinemap/OfflineMapManager;
    .locals 1

    .line 63
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->f:Lcom/amap/api/maps/offlinemap/OfflineMapManager;

    return-object v0
.end method

.method private i()V
    .locals 5

    .line 1214
    const-string v0, "OfflineMapService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initActivity()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1216
    invoke-static {p0}, Lo/dhm;->c(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1217
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->p()V

    .line 1220
    :cond_0
    new-instance v0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$d;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$d;-><init>(Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$2;)V

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->d:Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$d;

    .line 1221
    new-instance v4, Landroid/content/IntentFilter;

    invoke-direct {v4}, Landroid/content/IntentFilter;-><init>()V

    .line 1222
    const-string v0, "android.location.PROVIDERS_CHANGED"

    invoke-virtual {v4, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 1223
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->d:Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$d;

    invoke-virtual {p0, v0, v4}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 1225
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->o:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 1226
    const-string v0, "ACTION_INIT_ACTIVITY_SA"

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->a(Ljava/lang/String;Z)V

    .line 1227
    return-void
.end method

.method private i(Ljava/lang/String;)V
    .locals 4

    .line 1540
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 1542
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 1543
    return-void

    .line 1545
    :cond_0
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->e:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1546
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->e:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 1548
    :cond_1
    const/4 v3, 0x0

    :goto_0
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->e:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v3, v0, :cond_2

    .line 1549
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->e:Ljava/util/ArrayList;

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1550
    const-string v0, "|"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1548
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 1553
    :cond_2
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->u:Landroid/content/SharedPreferences;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_3

    .line 1555
    const-string v0, "TAG_SAVE_LOCAL_CITY_CODE"

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->u:Landroid/content/SharedPreferences;

    .line 1558
    :cond_3
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->u:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v3

    .line 1559
    const-string v0, "TAG_SAVE_LOADING_ERROR_CITY"

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v3, v0, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 1560
    invoke-interface {v3}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 1561
    return-void
.end method

.method static synthetic k(Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;)Landroid/content/Context;
    .locals 1

    .line 63
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->i:Landroid/content/Context;

    return-object v0
.end method

.method private k(Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;)Ljava/util/ArrayList<Ljava/lang/String;>;"
        }
    .end annotation

    .line 1614
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 1615
    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    .line 1617
    :cond_0
    const-string v0, "\\|"

    invoke-virtual {p1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    .line 1618
    const/4 v3, 0x0

    :goto_0
    array-length v0, v2

    if-ge v3, v0, :cond_1

    .line 1619
    aget-object v0, v2, v3

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1618
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 1622
    :cond_1
    :goto_1
    return-object v1
.end method

.method private k()V
    .locals 2

    .line 1232
    const-string v0, "ACTION_REFRESH_ACTIVITY_SA"

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->a(Ljava/lang/String;Z)V

    .line 1233
    return-void
.end method

.method private l()V
    .locals 0

    .line 1609
    return-void
.end method

.method static synthetic l(Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;)V
    .locals 0

    .line 63
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->m()V

    return-void
.end method

.method private m()V
    .locals 4

    .line 1367
    const-string v0, "OfflineMapService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "stopLoadingCity()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1368
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->f:Lcom/amap/api/maps/offlinemap/OfflineMapManager;

    invoke-virtual {v0}, Lcom/amap/api/maps/offlinemap/OfflineMapManager;->stop()V

    .line 1369
    return-void
.end method

.method static synthetic m(Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;)V
    .locals 0

    .line 63
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->p()V

    return-void
.end method

.method private o()V
    .locals 4

    .line 1408
    const-string v0, "OfflineMapService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "stopLocation()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1409
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->c:Lcom/amap/api/location/LocationManagerProxy;

    if-eqz v0, :cond_0

    .line 1411
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->c:Lcom/amap/api/location/LocationManagerProxy;

    invoke-virtual {v0, p0}, Lcom/amap/api/location/LocationManagerProxy;->removeUpdates(Lcom/amap/api/location/AMapLocationListener;)V

    .line 1412
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->c:Lcom/amap/api/location/LocationManagerProxy;

    invoke-virtual {v0}, Lcom/amap/api/location/LocationManagerProxy;->destroy()V

    .line 1414
    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->c:Lcom/amap/api/location/LocationManagerProxy;

    .line 1415
    return-void
.end method

.method static synthetic o(Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;)V
    .locals 0

    .line 63
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->g()V

    return-void
.end method

.method private p()V
    .locals 6

    .line 1384
    const-string v0, "OfflineMapService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initLocation()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1385
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->c:Lcom/amap/api/location/LocationManagerProxy;

    if-nez v0, :cond_0

    .line 1387
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->i:Landroid/content/Context;

    invoke-static {v0}, Lcom/amap/api/location/LocationManagerProxy;->getInstance(Landroid/content/Context;)Lcom/amap/api/location/LocationManagerProxy;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->c:Lcom/amap/api/location/LocationManagerProxy;

    .line 1389
    :cond_0
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->c:Lcom/amap/api/location/LocationManagerProxy;

    if-nez v0, :cond_1

    .line 1391
    const-string v0, "OfflineMapService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initLocation() Gaode mLocationManagerProxy return null not relative to health"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1392
    return-void

    .line 1398
    :cond_1
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->c:Lcom/amap/api/location/LocationManagerProxy;

    const-string v1, "lbs"

    move-object v5, p0

    const-wide/16 v2, 0x7530

    const/high16 v4, 0x41700000    # 15.0f

    invoke-virtual/range {v0 .. v5}, Lcom/amap/api/location/LocationManagerProxy;->requestLocationData(Ljava/lang/String;JFLcom/amap/api/location/AMapLocationListener;)V

    .line 1402
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->c:Lcom/amap/api/location/LocationManagerProxy;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/amap/api/location/LocationManagerProxy;->setGpsEnable(Z)V

    .line 1403
    return-void
.end method

.method static synthetic p(Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;)V
    .locals 0

    .line 63
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->o()V

    return-void
.end method


# virtual methods
.method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 4

    .line 270
    const-string v0, "OfflineMapService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onBind()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 271
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->k:Landroid/os/IBinder;

    return-object v0
.end method

.method public onCheckUpdate(ZLjava/lang/String;)V
    .locals 4

    .line 1068
    const-string v0, "OfflineMapService"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCheckUpdate() isNew:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1083
    return-void
.end method

.method public onCreate()V
    .locals 4

    .line 419
    const-string v0, "OfflineMapService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCreate()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 420
    invoke-super {p0}, Landroid/app/Service;->onCreate()V

    .line 421
    invoke-virtual {p0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->i:Landroid/content/Context;

    .line 422
    new-instance v0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$b;

    invoke-direct {v0, p0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$b;-><init>(Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;)V

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->t:Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$b;

    .line 423
    const/4 v0, 0x4

    invoke-static {v0}, Ljava/util/concurrent/Executors;->newFixedThreadPool(I)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->r:Ljava/util/concurrent/ExecutorService;

    .line 424
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->e()V

    .line 425
    return-void
.end method

.method public onDestroy()V
    .locals 4

    .line 739
    const-string v0, "OfflineMapService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onDestroy()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 740
    invoke-super {p0}, Landroid/app/Service;->onDestroy()V

    .line 741
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->o()V

    .line 742
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->f:Lcom/amap/api/maps/offlinemap/OfflineMapManager;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 744
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->f:Lcom/amap/api/maps/offlinemap/OfflineMapManager;

    invoke-virtual {v0}, Lcom/amap/api/maps/offlinemap/OfflineMapManager;->destroy()V

    .line 746
    :cond_0
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->i:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->g:Landroid/content/BroadcastReceiver;

    invoke-static {v0, v1}, Lo/ccd;->a(Landroid/content/Context;Landroid/content/BroadcastReceiver;)V

    .line 747
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->d:Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$d;

    if-eqz v0, :cond_1

    .line 748
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->d:Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$d;

    invoke-virtual {p0, v0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 749
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->d:Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$d;

    .line 751
    :cond_1
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->h:Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$c;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 752
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->h:Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$c;

    invoke-virtual {p0, v0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 754
    :cond_2
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->r:Ljava/util/concurrent/ExecutorService;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 756
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->r:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 757
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->r:Ljava/util/concurrent/ExecutorService;

    .line 759
    :cond_3
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->x:Z

    .line 760
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->l()V

    .line 761
    return-void
.end method

.method public onDownload(IILjava/lang/String;)V
    .locals 10

    .line 956
    const-string v0, "OfflineMapService"

    const/4 v1, 0x5

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onDownload() "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "state:"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const-string v2, ", complete:"

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 957
    iget-boolean v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->x:Z

    if-eqz v0, :cond_0

    .line 959
    const-string v0, "OfflineMapService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onDownload() Service is destroy"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 960
    return-void

    .line 962
    :cond_0
    sparse-switch p1, :sswitch_data_0

    goto/16 :goto_2

    .line 966
    :sswitch_0
    invoke-direct {p0, p3}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->g(Ljava/lang/String;)V

    .line 967
    goto/16 :goto_2

    .line 972
    :sswitch_1
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->e:Ljava/util/ArrayList;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_6

    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->e:Ljava/util/ArrayList;

    invoke-virtual {v0, p3}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    goto/16 :goto_2

    .line 979
    :sswitch_2
    goto/16 :goto_2

    .line 981
    :sswitch_3
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->e:Ljava/util/ArrayList;

    invoke-virtual {v0, p3}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 983
    const-string v0, "OfflineMapService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onRemove loadErrorCity=null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 985
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->l:Ljava/util/ArrayList;

    invoke-direct {p0, v0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->b(Ljava/util/ArrayList;)V

    .line 987
    :cond_1
    invoke-direct {p0, p3}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->d(Ljava/lang/String;)V

    .line 988
    goto/16 :goto_2

    .line 990
    :sswitch_4
    invoke-direct {p0, p3}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->g(Ljava/lang/String;)V

    .line 991
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_offlinemap_download_network_error:I

    invoke-direct {p0, v0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->d(I)V

    .line 993
    goto/16 :goto_2

    .line 995
    :sswitch_5
    const-wide/16 v4, -0x1

    .line 998
    :try_start_0
    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->getUsableSpace()J
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-wide v0

    move-wide v4, v0

    .line 1001
    goto :goto_0

    .line 999
    :catch_0
    move-exception v6

    .line 1000
    const-string v0, "OfflineMapService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getUsableSpace error"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1002
    :goto_0
    const-wide/16 v0, 0x0

    cmp-long v0, v4, v0

    if-ltz v0, :cond_2

    long-to-double v0, v4

    const-wide/high16 v2, 0x4090000000000000L    # 1024.0

    div-double/2addr v0, v2

    const-wide/high16 v2, 0x4090000000000000L    # 1024.0

    div-double/2addr v0, v2

    const-wide/high16 v2, 0x4024000000000000L    # 10.0

    cmpl-double v0, v0, v2

    if-lez v0, :cond_3

    .line 1003
    :cond_2
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_hwh_motiontrack_offlinemap_error_toast:I

    invoke-direct {p0, v0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->d(I)V

    goto :goto_1

    .line 1005
    :cond_3
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_offlinemap_download_storage_error:I

    invoke-direct {p0, v0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->d(I)V

    .line 1007
    :goto_1
    invoke-direct {p0, p3}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->g(Ljava/lang/String;)V

    .line 1008
    goto/16 :goto_2

    .line 1010
    :sswitch_6
    const-string v0, "OfflineMapService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onDownload START_DOWNLOAD_FAILD"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1011
    goto/16 :goto_2

    .line 1013
    :sswitch_7
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_offlinemap_service_download_error:I

    invoke-virtual {p0, v0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->getString(I)Ljava/lang/String;

    move-result-object v6

    .line 1014
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p3, v0, v1

    invoke-static {v6, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    .line 1015
    invoke-direct {p0, v7}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->h(Ljava/lang/String;)V

    .line 1017
    invoke-direct {p0, p3}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->g(Ljava/lang/String;)V

    .line 1018
    goto/16 :goto_2

    .line 1020
    :sswitch_8
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_offlinemap_service_show_amap_error:I

    invoke-virtual {p0, v0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->getString(I)Ljava/lang/String;

    move-result-object v8

    .line 1021
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p3, v0, v1

    invoke-static {v8, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    .line 1023
    invoke-direct {p0, v9}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->h(Ljava/lang/String;)V

    .line 1024
    goto :goto_2

    .line 1026
    :sswitch_9
    goto :goto_2

    .line 1028
    :sswitch_a
    const-string v0, "OfflineMapService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onDownload SUCCESS"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1036
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->e:Ljava/util/ArrayList;

    invoke-virtual {v0, p3}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 1038
    invoke-direct {p0, p3}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->i(Ljava/lang/String;)V

    .line 1040
    :cond_4
    invoke-direct {p0, p3}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->d(Ljava/lang/String;)V

    .line 1041
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->i:Landroid/content/Context;

    invoke-static {v0}, Lo/cfu;->d(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_5

    .line 1043
    const-string v0, "OfflineMapService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onDownload SUCCESS is no wifi manager pause"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1044
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->f:Lcom/amap/api/maps/offlinemap/OfflineMapManager;

    invoke-virtual {v0}, Lcom/amap/api/maps/offlinemap/OfflineMapManager;->pause()V

    .line 1046
    :cond_5
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->l()V

    .line 1047
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->i:Landroid/content/Context;

    const-class v1, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/cfv;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_6

    .line 1049
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->b()V

    nop

    .line 1054
    .line 1058
    :cond_6
    :goto_2
    :sswitch_b
    iget-boolean v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->p:Z

    if-eqz v0, :cond_7

    iget-boolean v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->q:Z

    if-eqz v0, :cond_7

    .line 1060
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->f()V

    .line 1062
    :cond_7
    return-void

    :sswitch_data_0
    .sparse-switch
        -0x1 -> :sswitch_7
        0x0 -> :sswitch_0
        0x1 -> :sswitch_b
        0x3 -> :sswitch_1
        0x4 -> :sswitch_a
        0x5 -> :sswitch_2
        0x6 -> :sswitch_3
        0xa -> :sswitch_9
        0x65 -> :sswitch_4
        0x66 -> :sswitch_8
        0x67 -> :sswitch_5
        0x3ea -> :sswitch_6
    .end sparse-switch
.end method

.method public onLocationChanged(Landroid/location/Location;)V
    .locals 0

    .line 1422
    return-void
.end method

.method public onLocationChanged(Lcom/amap/api/location/AMapLocation;)V
    .locals 6

    .line 1446
    const-string v0, "OfflineMapService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onLocationChanged()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1447
    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lcom/amap/api/location/AMapLocation;->getAMapException()Lcom/amap/api/location/core/AMapLocException;

    move-result-object v0

    invoke-virtual {v0}, Lcom/amap/api/location/core/AMapLocException;->getErrorCode()I

    move-result v0

    if-nez v0, :cond_1

    .line 1450
    invoke-virtual {p1}, Lcom/amap/api/location/AMapLocation;->getCity()Ljava/lang/String;

    move-result-object v4

    .line 1451
    const-string v0, "OfflineMapService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onLocationChanged() Local success"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1452
    const/4 v0, 0x0

    if-eq v0, v4, :cond_1

    const-string v0, "null"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {v4}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 1454
    iput-object v4, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->b:Ljava/lang/String;

    .line 1455
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->u:Landroid/content/SharedPreferences;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 1457
    const-string v0, "TAG_SAVE_LOCAL_CITY_CODE"

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->u:Landroid/content/SharedPreferences;

    .line 1460
    :cond_0
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->u:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v5

    .line 1461
    const-string v0, "TAG_SAVE_LOCAL_CITY_CODE"

    invoke-interface {v5, v0, v4}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 1462
    invoke-interface {v5}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 1463
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->o()V

    .line 1464
    iget-boolean v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->m:Z

    if-eqz v0, :cond_1

    .line 1466
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->k()V

    .line 1470
    :cond_1
    return-void
.end method

.method public onProviderDisabled(Ljava/lang/String;)V
    .locals 0

    .line 1440
    return-void
.end method

.method public onProviderEnabled(Ljava/lang/String;)V
    .locals 0

    .line 1434
    return-void
.end method

.method public onRemove(ZLjava/lang/String;Ljava/lang/String;)V
    .locals 6

    .line 1089
    const-string v0, "OfflineMapService"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onRemove() sucess:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " arg2:"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aput-object p3, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1090
    iget-boolean v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->x:Z

    if-eqz v0, :cond_0

    .line 1092
    const-string v0, "OfflineMapService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onDownload() Service is destroy"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1093
    return-void

    .line 1095
    :cond_0
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->a:Ljava/lang/String;

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1097
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->l()V

    .line 1099
    :cond_1
    if-eqz p1, :cond_3

    .line 1101
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_offlinemap_service_delete_ok:I

    invoke-virtual {p0, v0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 1102
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p2, v0, v1

    invoke-static {v4, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    .line 1103
    invoke-direct {p0, v5}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->h(Ljava/lang/String;)V

    .line 1104
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->e:Ljava/util/ArrayList;

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1106
    const-string v0, "OfflineMapService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onRemove loadErrorCity=null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1107
    invoke-direct {p0, p2}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->i(Ljava/lang/String;)V

    .line 1108
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->l:Ljava/util/ArrayList;

    invoke-direct {p0, v0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->b(Ljava/util/ArrayList;)V

    .line 1110
    :cond_2
    invoke-direct {p0, p2}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->d(Ljava/lang/String;)V

    .line 1111
    goto :goto_0

    .line 1114
    :cond_3
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_offlinemap_service_delete_fail:I

    invoke-virtual {p0, v0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 1115
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p2, v0, v1

    invoke-static {v4, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    .line 1116
    invoke-direct {p0, v5}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->h(Ljava/lang/String;)V

    .line 1118
    :goto_0
    iget-boolean v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->p:Z

    if-eqz v0, :cond_4

    iget-boolean v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->q:Z

    if-eqz v0, :cond_4

    .line 1120
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->h()V

    .line 1122
    :cond_4
    return-void
.end method

.method public onStartCommand(Landroid/content/Intent;II)I
    .locals 4

    .line 444
    const-string v0, "OfflineMapService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onStartCommand()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 445
    if-nez p1, :cond_0

    .line 447
    const-string v0, "OfflineMapService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleIntent() intent null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 448
    const/4 v0, 0x0

    return v0

    .line 450
    :cond_0
    iget-boolean v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->z:Z

    if-nez v0, :cond_1

    .line 451
    invoke-direct {p0, p1}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->a(Landroid/content/Intent;)V

    .line 453
    :cond_1
    invoke-super {p0, p1, p2, p3}, Landroid/app/Service;->onStartCommand(Landroid/content/Intent;II)I

    move-result v0

    return v0
.end method

.method public onStatusChanged(Ljava/lang/String;ILandroid/os/Bundle;)V
    .locals 0

    .line 1428
    return-void
.end method

.method public onVerifyComplete()V
    .locals 2

    .line 1628
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->z:Z

    .line 1629
    new-instance v0, Landroid/content/Intent;

    const-string v1, "ACTION_OFFLINE_MAP_ACTIVTY_START_AS"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, v0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->a(Landroid/content/Intent;)V

    .line 1630
    return-void
.end method
