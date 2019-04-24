.class public Lcom/huawei/hwservicesmgr/PhoneService;
.super Landroid/app/Service;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/hwservicesmgr/PhoneService$b;,
        Lcom/huawei/hwservicesmgr/PhoneService$a;,
        Lcom/huawei/hwservicesmgr/PhoneService$d;
    }
.end annotation


# static fields
.field private static a:I

.field private static c:Lo/djr;

.field private static m:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/Integer;Lcom/huawei/hwservicesmgr/remote/parser/IParser;>;"
        }
    .end annotation
.end field

.field private static n:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
        }
    .end annotation
.end field


# instance fields
.field private final B:Lo/djz$d;

.field private final C:Lo/dbx$a;

.field private b:Lo/dkm;

.field private d:Lo/dks;

.field private e:Lo/dea;

.field private f:Lo/dko;

.field private g:Lo/dkn;

.field private h:Lo/dkl;

.field private i:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/hwservicesmgr/PhoneService$b;>;"
        }
    .end annotation
.end field

.field private k:Lo/dqh;

.field private l:J

.field private o:Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;

.field private p:Landroid/os/Handler;

.field private q:Landroid/content/BroadcastReceiver;

.field private r:Ljava/util/concurrent/ExecutorService;

.field private final s:J

.field private t:Landroid/content/BroadcastReceiver;

.field private u:Lo/yh;

.field private v:Lo/cmo;

.field private w:Lo/ddg;

.field private x:Landroid/content/BroadcastReceiver;

.field private y:Lo/cmj;

.field private z:Lcom/huawei/hwservicesmgr/PhoneService$a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 194
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/huawei/hwservicesmgr/PhoneService;->n:Ljava/util/Map;

    .line 195
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/huawei/hwservicesmgr/PhoneService;->m:Ljava/util/Map;

    .line 207
    sget-object v0, Lcom/huawei/hwservicesmgr/PhoneService;->n:Ljava/util/Map;

    const-string v1, "528e0a2b895739ac57fcdf053b74092c"

    const-string v2, "com.huawei.health"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 208
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 290
    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    .line 192
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/hwservicesmgr/PhoneService;->i:Ljava/util/List;

    .line 197
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/huawei/hwservicesmgr/PhoneService;->p:Landroid/os/Handler;

    .line 198
    const-wide/16 v0, 0x3e8

    iput-wide v0, p0, Lcom/huawei/hwservicesmgr/PhoneService;->l:J

    .line 199
    const-wide/32 v0, 0x927c0

    iput-wide v0, p0, Lcom/huawei/hwservicesmgr/PhoneService;->s:J

    .line 200
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hwservicesmgr/PhoneService;->r:Ljava/util/concurrent/ExecutorService;

    .line 225
    new-instance v0, Lcom/huawei/hwservicesmgr/PhoneService$5;

    invoke-direct {v0, p0}, Lcom/huawei/hwservicesmgr/PhoneService$5;-><init>(Lcom/huawei/hwservicesmgr/PhoneService;)V

    iput-object v0, p0, Lcom/huawei/hwservicesmgr/PhoneService;->w:Lo/ddg;

    .line 534
    new-instance v0, Lcom/huawei/hwservicesmgr/PhoneService$1;

    invoke-direct {v0, p0}, Lcom/huawei/hwservicesmgr/PhoneService$1;-><init>(Lcom/huawei/hwservicesmgr/PhoneService;)V

    iput-object v0, p0, Lcom/huawei/hwservicesmgr/PhoneService;->x:Landroid/content/BroadcastReceiver;

    .line 946
    new-instance v0, Lcom/huawei/hwservicesmgr/PhoneService$6;

    invoke-direct {v0, p0}, Lcom/huawei/hwservicesmgr/PhoneService$6;-><init>(Lcom/huawei/hwservicesmgr/PhoneService;)V

    iput-object v0, p0, Lcom/huawei/hwservicesmgr/PhoneService;->C:Lo/dbx$a;

    .line 971
    new-instance v0, Lcom/huawei/hwservicesmgr/PhoneService$9;

    invoke-direct {v0, p0}, Lcom/huawei/hwservicesmgr/PhoneService$9;-><init>(Lcom/huawei/hwservicesmgr/PhoneService;)V

    iput-object v0, p0, Lcom/huawei/hwservicesmgr/PhoneService;->B:Lo/djz$d;

    .line 291
    return-void
.end method

.method static synthetic a(Lcom/huawei/hwservicesmgr/PhoneService;)Lo/djz$d;
    .locals 1

    .line 103
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/PhoneService;->B:Lo/djz$d;

    return-object v0
.end method

.method private a(Landroid/content/Intent;)V
    .locals 6

    .line 1337
    const/4 v4, 0x0

    .line 1339
    const-string v0, "type"

    const/4 v1, 0x0

    :try_start_0
    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    move v4, v0

    .line 1342
    goto :goto_0

    .line 1340
    :catch_0
    move-exception v5

    .line 1341
    const-string v0, "PhoneService"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "delteMsgToDevice error;"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v5}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1343
    :goto_0
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 1344
    const/16 v0, 0x80

    if-ne v0, v4, :cond_0

    .line 1345
    const/4 v0, 0x7

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v5, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1346
    const/16 v0, 0x8

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v5, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 1348
    :cond_0
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v5, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1350
    :goto_1
    invoke-direct {p0, v5}, Lcom/huawei/hwservicesmgr/PhoneService;->b(Ljava/util/List;)V

    .line 1351
    return-void
.end method

.method static synthetic a(Lcom/huawei/hwservicesmgr/PhoneService;[B)V
    .locals 0

    .line 103
    invoke-direct {p0, p1}, Lcom/huawei/hwservicesmgr/PhoneService;->c([B)V

    return-void
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 12

    .line 1380
    const-string v0, "000002"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1381
    const/16 v4, 0x10

    .line 1382
    const/4 v5, 0x1

    goto :goto_0

    .line 1383
    :cond_0
    const-string v0, "00000A"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1384
    const/16 v4, 0x14

    .line 1385
    const/4 v5, 0x2

    goto :goto_0

    .line 1386
    :cond_1
    const-string v0, "00000B"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1387
    const/16 v4, 0x15

    .line 1388
    const/4 v5, 0x2

    goto :goto_0

    .line 1389
    :cond_2
    const-string v0, "00000C"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 1390
    const/16 v4, 0x12

    .line 1391
    const/4 v5, 0x2

    goto :goto_0

    .line 1392
    :cond_3
    const-string v0, "00000D"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 1393
    const/16 v4, 0x13

    .line 1394
    const/4 v5, 0x2

    goto :goto_0

    .line 1396
    :cond_4
    return-void

    .line 1401
    :goto_0
    invoke-static {}, Lcom/huawei/whitebox/e;->b()Lcom/huawei/whitebox/e;

    move-result-object v6

    .line 1402
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x1

    const/16 v2, 0x15

    invoke-virtual {v6, v1, v2}, Lcom/huawei/whitebox/e;->a(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/4 v1, 0x1

    const/16 v2, 0x3fd

    invoke-virtual {v6, v1, v2}, Lcom/huawei/whitebox/e;->a(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/4 v1, 0x1

    const/16 v2, 0x7e5

    invoke-virtual {v6, v1, v2}, Lcom/huawei/whitebox/e;->a(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    .line 1405
    :try_start_0
    new-instance v8, Ljava/lang/String;

    invoke-static {v7}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/whitebox/e;->b([B)[B

    move-result-object v0

    const-string v1, "utf-8"

    invoke-direct {v8, v0, v1}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    .line 1410
    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x20

    if-lt v0, v1, :cond_5

    .line 1411
    const/4 v0, 0x0

    const/16 v1, 0x20

    invoke-virtual {p3, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v9

    .line 1412
    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x20

    invoke-virtual {p3, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/czx;->e(Ljava/lang/String;)[B
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v10

    goto :goto_1

    .line 1415
    :cond_5
    return-void

    .line 1420
    :goto_1
    :try_start_1
    invoke-static {v8}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v1, v10, v0, v9}, Lo/cxt;->c(I[B[B[B)[B

    move-result-object v11

    .line 1422
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/PhoneService;->e:Lo/dea;

    new-instance v1, Ljava/lang/String;

    const-string v2, "utf-8"

    invoke-direct {v1, v11, v2}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    invoke-virtual {v0, v5, p2, v4, v1}, Lo/dea;->b(ILjava/lang/String;ILjava/lang/String;)V
    :try_end_1
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 1427
    goto :goto_2

    .line 1423
    :catch_0
    move-exception v8

    .line 1424
    const-string v0, "PhoneService"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "e1 msg:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v8}, Ljava/io/UnsupportedEncodingException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1427
    goto :goto_2

    .line 1425
    :catch_1
    move-exception v8

    .line 1426
    const-string v0, "PhoneService"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "e3 msg:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v8}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1429
    :goto_2
    return-void
.end method

.method private a()Z
    .locals 8

    .line 340
    const-string v0, "activity"

    invoke-virtual {p0, v0}, Lcom/huawei/hwservicesmgr/PhoneService;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/app/ActivityManager;

    .line 341
    const/4 v0, 0x5

    invoke-virtual {v4, v0}, Landroid/app/ActivityManager;->getRunningTasks(I)Ljava/util/List;

    move-result-object v5

    .line 342
    const/4 v0, 0x0

    if-eq v0, v5, :cond_1

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 343
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Landroid/app/ActivityManager$RunningTaskInfo;

    .line 344
    const-string v0, "PhoneService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "appProcess.getPackageName="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, v7, Landroid/app/ActivityManager$RunningTaskInfo;->topActivity:Landroid/content/ComponentName;

    invoke-virtual {v3}, Landroid/content/ComponentName;->getPackageName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 345
    const-string v0, "com.huawei.bone"

    iget-object v1, v7, Landroid/app/ActivityManager$RunningTaskInfo;->topActivity:Landroid/content/ComponentName;

    invoke-virtual {v1}, Landroid/content/ComponentName;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 346
    const/4 v0, 0x1

    return v0

    .line 348
    :cond_0
    goto :goto_0

    .line 350
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method static synthetic b()Lo/djr;
    .locals 1

    .line 103
    sget-object v0, Lcom/huawei/hwservicesmgr/PhoneService;->c:Lo/djr;

    return-object v0
.end method

.method private b(Landroid/content/Intent;)V
    .locals 10

    .line 687
    const-string v0, "PhoneService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Enter handleIntent: intent = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 688
    const/4 v4, 0x0

    .line 690
    :try_start_0
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v4, v0

    .line 693
    goto :goto_0

    .line 691
    :catch_0
    move-exception v5

    .line 692
    const-string v0, "PhoneService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "handleIntent error,"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 694
    :goto_0
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 695
    const-string v0, "PhoneService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "error, action is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 696
    return-void

    .line 698
    :cond_0
    const-string v0, "PhoneService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "handleIntent: action = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 700
    move-object v5, v4

    const/4 v6, -0x1

    invoke-virtual {v5}, Ljava/lang/String;->hashCode()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_1

    :sswitch_0
    const-string v0, "com.huawei.bone.ACTION_NOTIFICATION_PUSH"

    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v6, 0x0

    goto/16 :goto_1

    :sswitch_1
    const-string v0, "com.huawei.intelligent.action.NOTIFY_MSG"

    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v6, 0x1

    goto :goto_1

    :sswitch_2
    const-string v0, "com.huawei.iconnect.ACTION_RECONNECT_MSG"

    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v6, 0x2

    goto :goto_1

    :sswitch_3
    const-string v0, "android.intent.action.USER_PRESENT"

    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v6, 0x3

    goto :goto_1

    :sswitch_4
    const-string v0, "com.huawei.bone.action.REGISTER_PHONE_LISTEN"

    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v6, 0x4

    goto :goto_1

    :sswitch_5
    const-string v0, "com.huawei.bone.ACTION_NOTIFICATION_DELETE"

    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v6, 0x5

    goto :goto_1

    :sswitch_6
    const-string v0, "com.huawei.iconnect.ACTION_CONNECT_DEVICE"

    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v6, 0x6

    goto :goto_1

    :sswitch_7
    const-string v0, "com.huawei.health.ACTION_WEATHER_PUSH"

    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v6, 0x7

    goto :goto_1

    :sswitch_8
    const-string v0, "com.huawei.health.ACTION_WEATHER_DATA_PUSH"

    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/16 v6, 0x8

    goto :goto_1

    :sswitch_9
    const-string v0, "com.huawei.health.ACTION_LOCAL_PRESSURE_PUSH"

    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/16 v6, 0x9

    :cond_1
    :goto_1
    packed-switch v6, :pswitch_data_0

    goto/16 :goto_2

    .line 702
    :pswitch_0
    invoke-direct {p0, p1}, Lcom/huawei/hwservicesmgr/PhoneService;->d(Landroid/content/Intent;)V

    .line 703
    goto/16 :goto_2

    .line 705
    :pswitch_1
    invoke-direct {p0, p1}, Lcom/huawei/hwservicesmgr/PhoneService;->e(Landroid/content/Intent;)V

    .line 706
    goto/16 :goto_2

    .line 709
    :pswitch_2
    const-string v0, "PhoneService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "==EMUI iConnect start reconnect..."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 711
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/PhoneService;->e:Lo/dea;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 712
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/PhoneService;->e:Lo/dea;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/dea;->b(Z)V

    goto/16 :goto_2

    .line 716
    :pswitch_3
    const-string v0, "PhoneService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Receive unlock phone msg, so force connect device."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 717
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/PhoneService;->e:Lo/dea;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 718
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/PhoneService;->e:Lo/dea;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/dea;->b(Z)V

    goto/16 :goto_2

    .line 720
    :cond_2
    const-string v0, "PhoneService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mDeviceMgr is null."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 722
    goto/16 :goto_2

    .line 725
    :pswitch_4
    const-string v0, "PhoneService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "REGISTER_PHONE_LISTEN_ACTION enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 726
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/PhoneService;->d:Lo/dks;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 727
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/PhoneService;->d:Lo/dks;

    invoke-virtual {v0}, Lo/dks;->a()V

    goto :goto_2

    .line 731
    :pswitch_5
    invoke-direct {p0, p1}, Lcom/huawei/hwservicesmgr/PhoneService;->a(Landroid/content/Intent;)V

    .line 732
    const-string v0, "PhoneService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ACTION_NOTIFICATION_DELETE"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 733
    goto :goto_2

    .line 735
    :pswitch_6
    const-string v0, "PhoneService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ICONNECT_CONNECT_DEVICE_ACTION"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 736
    const-string v0, "DEVICE_NAME"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 737
    const-string v0, "DEVICE_ID"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 738
    const-string v0, "DEVICE_MODULE_ID"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 739
    invoke-direct {p0, v9, v7, v8}, Lcom/huawei/hwservicesmgr/PhoneService;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 740
    goto :goto_2

    .line 742
    :pswitch_7
    invoke-direct {p0, p1}, Lcom/huawei/hwservicesmgr/PhoneService;->c(Landroid/content/Intent;)V

    .line 743
    goto :goto_2

    .line 745
    :pswitch_8
    invoke-virtual {p0}, Lcom/huawei/hwservicesmgr/PhoneService;->c()V

    .line 746
    goto :goto_2

    .line 748
    :pswitch_9
    invoke-direct {p0}, Lcom/huawei/hwservicesmgr/PhoneService;->m()V

    .line 749
    .line 753
    :cond_3
    :goto_2
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7528ed8d -> :sswitch_8
        -0x7362f651 -> :sswitch_9
        -0x500ee59a -> :sswitch_5
        -0x372b554 -> :sswitch_4
        0xfe65101 -> :sswitch_6
        0x1d73e8b6 -> :sswitch_7
        0x311a1d6c -> :sswitch_3
        0x4dde2a03 -> :sswitch_2
        0x51743a95 -> :sswitch_0
        0x5f6f32f2 -> :sswitch_1
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_7
        :pswitch_8
        :pswitch_9
    .end packed-switch
.end method

.method static synthetic b(Lcom/huawei/hwservicesmgr/PhoneService;)V
    .locals 0

    .line 103
    invoke-direct {p0}, Lcom/huawei/hwservicesmgr/PhoneService;->e()V

    return-void
.end method

.method private b(Ljava/util/List;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/Integer;>;)V"
        }
    .end annotation

    .line 1357
    const/4 v0, 0x0

    if-eq v0, p1, :cond_1

    .line 1358
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Ljava/lang/Integer;

    .line 1359
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/PhoneService;->g:Lo/dkn;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 1360
    const-string v0, "PhoneService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "delteMsgToDevice: msgType\uff1a"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1361
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/PhoneService;->g:Lo/dkn;

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v0, v1}, Lo/dkn;->e(I)Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;

    move-result-object v6

    .line 1362
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/PhoneService;->g:Lo/dkn;

    const/4 v1, 0x2

    invoke-virtual {v0, v6, v1}, Lo/dkn;->e(Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;I)V

    .line 1364
    :cond_0
    goto :goto_0

    .line 1366
    :cond_1
    return-void
.end method

.method static synthetic c(Lcom/huawei/hwservicesmgr/PhoneService;)Lo/ddg;
    .locals 1

    .line 103
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/PhoneService;->w:Lo/ddg;

    return-object v0
.end method

.method private c(Landroid/content/Intent;)V
    .locals 6

    .line 1433
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    .line 1435
    const-string v0, "com.huawei.health.ACTION_WEATHER_PUSH_VALUE"

    const/4 v1, 0x1

    :try_start_0
    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v4, v0

    .line 1438
    goto :goto_0

    .line 1436
    :catch_0
    move-exception v5

    .line 1437
    const-string v0, "PhoneService"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "pushWertherToDevice error;"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v5}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1439
    :goto_0
    const-string v0, "PhoneService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "pushWertherToDevice value\uff1a"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1440
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/PhoneService;->h:Lo/dkl;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 1441
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/PhoneService;->h:Lo/dkl;

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-virtual {v0, v1}, Lo/dkl;->a(Z)V

    .line 1443
    :cond_0
    return-void
.end method

.method private c([B)V
    .locals 4

    .line 299
    array-length v0, p1

    const/4 v1, 0x2

    if-ge v0, v1, :cond_0

    .line 300
    const-string v0, "PhoneService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleNotify ,length < 2, return"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 301
    return-void

    .line 304
    :cond_0
    const/4 v0, 0x0

    aget-byte v0, p1, v0

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_0

    .line 306
    :pswitch_0
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/PhoneService;->b:Lo/dkm;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 307
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/PhoneService;->b:Lo/dkm;

    invoke-virtual {v0, p1}, Lo/dkm;->c([B)V

    goto :goto_0

    .line 311
    :pswitch_1
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/PhoneService;->f:Lo/dko;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 312
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/PhoneService;->f:Lo/dko;

    invoke-virtual {v0, p1}, Lo/dko;->a([B)V

    goto :goto_0

    .line 316
    :pswitch_2
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/PhoneService;->d:Lo/dks;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 317
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/PhoneService;->d:Lo/dks;

    invoke-virtual {v0, p1}, Lo/dks;->d([B)V

    .line 319
    :cond_1
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/PhoneService;->g:Lo/dkn;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 320
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/PhoneService;->g:Lo/dkn;

    invoke-virtual {v0, p1}, Lo/dkn;->b([B)V

    goto :goto_0

    .line 324
    :pswitch_3
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/PhoneService;->k:Lo/dqh;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    const/4 v0, 0x1

    aget-byte v0, p1, v0

    const/16 v1, 0x17

    if-ne v1, v0, :cond_2

    invoke-direct {p0}, Lcom/huawei/hwservicesmgr/PhoneService;->a()Z

    move-result v0

    if-nez v0, :cond_2

    .line 325
    const-string v0, "PhoneService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "null!=mHwWakeAppManager && DeviceConfigConstants.COMMAND_ID_OPEN_APP_PAGE == data[1] ,open app"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 326
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/PhoneService;->k:Lo/dqh;

    invoke-virtual {v0, p1}, Lo/dqh;->a([B)V

    goto :goto_0

    .line 330
    :pswitch_4
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/PhoneService;->h:Lo/dkl;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 331
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/PhoneService;->h:Lo/dkl;

    invoke-virtual {v0, p1}, Lo/dkl;->c([B)V

    .line 337
    :cond_2
    :goto_0
    :pswitch_5
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_2
        :pswitch_5
        :pswitch_0
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_1
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_4
    .end packed-switch
.end method

.method static synthetic d(Lcom/huawei/hwservicesmgr/PhoneService;J)J
    .locals 0

    .line 103
    iput-wide p1, p0, Lcom/huawei/hwservicesmgr/PhoneService;->l:J

    return-wide p1
.end method

.method static synthetic d()Ljava/util/Map;
    .locals 1

    .line 103
    sget-object v0, Lcom/huawei/hwservicesmgr/PhoneService;->m:Ljava/util/Map;

    return-object v0
.end method

.method static synthetic d(Lcom/huawei/hwservicesmgr/PhoneService;)Lo/dea;
    .locals 1

    .line 103
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/PhoneService;->e:Lo/dea;

    return-object v0
.end method

.method static synthetic d(Lo/djr;)Lo/djr;
    .locals 0

    .line 103
    sput-object p0, Lcom/huawei/hwservicesmgr/PhoneService;->c:Lo/djr;

    return-object p0
.end method

.method private d(Landroid/content/Intent;)V
    .locals 18

    .line 816
    const/4 v6, 0x0

    .line 818
    :try_start_0
    invoke-virtual/range {p1 .. p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v6, v0

    .line 821
    goto :goto_0

    .line 819
    :catch_0
    move-exception v7

    .line 820
    const-string v0, "PhoneService"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "pushNotificationToDevice error;"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v7}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 822
    :goto_0
    const/4 v0, 0x0

    if-ne v0, v6, :cond_0

    .line 823
    return-void

    .line 825
    :cond_0
    const/4 v7, 0x0

    .line 827
    const-string v0, "type"

    :try_start_1
    invoke-virtual {v6, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    move-result v0

    move v7, v0

    .line 830
    goto :goto_1

    .line 828
    :catch_1
    move-exception v8

    .line 829
    const-string v0, "PhoneService"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "pushNotificationToDevice msgtype error;"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v8}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 832
    :goto_1
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 838
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 839
    new-instance v10, Lcom/huawei/hwcommonmodel/datatypes/MsgText;

    invoke-direct {v10}, Lcom/huawei/hwcommonmodel/datatypes/MsgText;-><init>()V

    .line 840
    const/4 v11, 0x0

    .line 842
    const-string v0, "title_type"

    :try_start_2
    invoke-virtual {v6, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    move-result v0

    move v11, v0

    .line 845
    goto :goto_2

    .line 843
    :catch_2
    move-exception v12

    .line 844
    const-string v0, "PhoneService"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "messageTextType error;"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v12}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 846
    :goto_2
    invoke-virtual {v10, v11}, Lcom/huawei/hwcommonmodel/datatypes/MsgText;->setTextType(I)V

    .line 847
    const-string v12, ""

    .line 849
    const-string v0, "title"

    :try_start_3
    invoke-virtual {v6, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3

    move-result-object v0

    move-object v12, v0

    .line 852
    goto :goto_3

    .line 850
    :catch_3
    move-exception v13

    .line 851
    const-string v0, "PhoneService"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "messageTextType error;"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v13}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 853
    :goto_3
    invoke-virtual {v10, v12}, Lcom/huawei/hwcommonmodel/datatypes/MsgText;->setTextContent(Ljava/lang/String;)V

    .line 854
    invoke-virtual {v9, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 856
    new-instance v13, Lcom/huawei/hwcommonmodel/datatypes/MsgText;

    invoke-direct {v13}, Lcom/huawei/hwcommonmodel/datatypes/MsgText;-><init>()V

    .line 857
    const/4 v14, 0x0

    .line 859
    const-string v0, "text_type"

    :try_start_4
    invoke-virtual {v6, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_4

    move-result v0

    move v14, v0

    .line 862
    goto :goto_4

    .line 860
    :catch_4
    move-exception v15

    .line 861
    const-string v0, "PhoneService"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "messageTextType error;"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v15}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 863
    :goto_4
    invoke-virtual {v13, v14}, Lcom/huawei/hwcommonmodel/datatypes/MsgText;->setTextType(I)V

    .line 864
    const-string v15, ""

    .line 866
    const-string v0, "text"

    :try_start_5
    invoke-virtual {v6, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_5

    move-result-object v0

    move-object v15, v0

    .line 869
    goto :goto_5

    .line 867
    :catch_5
    move-exception v16

    .line 868
    const-string v0, "PhoneService"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "textContent error;"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 870
    :goto_5
    invoke-virtual {v13, v15}, Lcom/huawei/hwcommonmodel/datatypes/MsgText;->setTextContent(Ljava/lang/String;)V

    .line 871
    invoke-virtual {v9, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 873
    const-string v16, ""

    .line 875
    const-string v0, "pakagename"

    :try_start_6
    invoke-virtual {v6, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v16, v0

    .line 876
    const-string v0, "PhoneService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mskpkg name = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, v16

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_6

    .line 879
    goto :goto_6

    .line 877
    :catch_6
    move-exception v17

    .line 878
    const-string v0, "PhoneService"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "pushNotificationToDevice msgpkg error;"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual/range {v17 .. v17}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 882
    :goto_6
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hwservicesmgr/PhoneService;->g:Lo/dkn;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 883
    return-void

    .line 885
    :cond_1
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hwservicesmgr/PhoneService;->g:Lo/dkn;

    move v1, v7

    move-object v3, v8

    move-object v4, v9

    move-object/from16 v5, v16

    const/4 v2, 0x1

    invoke-virtual/range {v0 .. v5}, Lo/dkn;->a(IZLjava/util/List;Ljava/util/List;Ljava/lang/String;)Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;

    move-result-object v17

    .line 886
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hwservicesmgr/PhoneService;->g:Lo/dkn;

    move-object/from16 v1, v17

    const/4 v2, 0x2

    invoke-virtual {v0, v1, v2}, Lo/dkn;->e(Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;I)V

    .line 887
    return-void
.end method

.method static synthetic e(Lcom/huawei/hwservicesmgr/PhoneService;)Lo/cmj;
    .locals 1

    .line 103
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/PhoneService;->y:Lo/cmj;

    return-object v0
.end method

.method private e()V
    .locals 4

    .line 442
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/PhoneService;->y:Lo/cmj;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 443
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/PhoneService;->y:Lo/cmj;

    iget-object v1, p0, Lcom/huawei/hwservicesmgr/PhoneService;->z:Lcom/huawei/hwservicesmgr/PhoneService$a;

    iget-object v2, p0, Lcom/huawei/hwservicesmgr/PhoneService;->v:Lo/cmo;

    invoke-virtual {v0, v1, v2}, Lo/cmj;->e(Lo/cmq;Lo/cmo;)Z

    .line 444
    const-string v0, "PhoneService"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "register mStepCallback:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/hwservicesmgr/PhoneService;->z:Lcom/huawei/hwservicesmgr/PhoneService$a;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 445
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/PhoneService;->y:Lo/cmj;

    new-instance v1, Lcom/huawei/hwservicesmgr/PhoneService$4;

    invoke-direct {v1, p0}, Lcom/huawei/hwservicesmgr/PhoneService$4;-><init>(Lcom/huawei/hwservicesmgr/PhoneService;)V

    invoke-virtual {v0, v1}, Lo/cmj;->a(Lo/cmo;)V

    .line 487
    :cond_0
    return-void
.end method

.method public static e(I)V
    .locals 0

    .line 137
    sput p0, Lcom/huawei/hwservicesmgr/PhoneService;->a:I

    .line 138
    return-void
.end method

.method private e(Landroid/content/Intent;)V
    .locals 16

    .line 761
    const/4 v9, 0x0

    .line 762
    const/4 v10, 0x0

    .line 764
    const-string v0, "type"

    move-object/from16 v1, p1

    :try_start_0
    invoke-virtual {v1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    move-object v9, v0

    .line 765
    const-string v0, "message_short"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v10, v0

    .line 768
    goto :goto_0

    .line 766
    :catch_0
    move-exception v11

    .line 767
    const-string v0, "PhoneService"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "pushPromptToDevice error;"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v11}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 769
    :goto_0
    const-string v0, "PhoneService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "pushPromptToDevice, type = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", message_short = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 770
    const/4 v0, 0x0

    if-eq v0, v9, :cond_3

    const/4 v0, 0x0

    if-eq v0, v10, :cond_3

    .line 771
    const/4 v11, 0x1

    .line 772
    new-instance v12, Lcom/huawei/hwcommonmodel/datatypes/DataPromptData;

    invoke-direct {v12}, Lcom/huawei/hwcommonmodel/datatypes/DataPromptData;-><init>()V

    .line 773
    const/4 v0, 0x1

    invoke-virtual {v12, v0}, Lcom/huawei/hwcommonmodel/datatypes/DataPromptData;->setMotor_enable(I)V

    .line 774
    const/4 v0, 0x2

    invoke-virtual {v12, v0}, Lcom/huawei/hwcommonmodel/datatypes/DataPromptData;->setText_format(I)V

    .line 775
    invoke-virtual {v12, v10}, Lcom/huawei/hwcommonmodel/datatypes/DataPromptData;->setText_content(Ljava/lang/String;)V

    .line 776
    new-instance v0, Lo/dag;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x1

    const/4 v7, 0x1

    const/4 v8, 0x1

    invoke-direct/range {v0 .. v8}, Lo/dag;-><init>(ZZZZZZZZ)V

    move-object v13, v0

    .line 778
    move-object v14, v9

    const/4 v15, -0x1

    invoke-virtual {v14}, Ljava/lang/String;->hashCode()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto :goto_1

    :sswitch_0
    const-string v0, "flight"

    invoke-virtual {v14, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v15, 0x0

    goto :goto_1

    :sswitch_1
    const-string v0, "train"

    invoke-virtual {v14, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v15, 0x1

    goto :goto_1

    :sswitch_2
    const-string v0, "warm_remind"

    invoke-virtual {v14, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v15, 0x2

    goto :goto_1

    :sswitch_3
    const-string v0, "weather"

    invoke-virtual {v14, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v15, 0x3

    :cond_0
    :goto_1
    packed-switch v15, :pswitch_data_0

    goto :goto_2

    .line 780
    :pswitch_0
    const/4 v0, 0x7

    invoke-virtual {v12, v0}, Lcom/huawei/hwcommonmodel/datatypes/DataPromptData;->setPrompt_type(I)V

    .line 781
    goto :goto_3

    .line 783
    :pswitch_1
    const/16 v0, 0x8

    invoke-virtual {v12, v0}, Lcom/huawei/hwcommonmodel/datatypes/DataPromptData;->setPrompt_type(I)V

    .line 784
    goto :goto_3

    .line 786
    :pswitch_2
    const/16 v0, 0x9

    invoke-virtual {v12, v0}, Lcom/huawei/hwcommonmodel/datatypes/DataPromptData;->setPrompt_type(I)V

    .line 787
    goto :goto_3

    .line 789
    :pswitch_3
    const/16 v0, 0xa

    invoke-virtual {v12, v0}, Lcom/huawei/hwcommonmodel/datatypes/DataPromptData;->setPrompt_type(I)V

    .line 790
    goto :goto_3

    .line 792
    :goto_2
    const/4 v11, 0x0

    .line 795
    :goto_3
    const-string v0, "PhoneService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "pushPromptToDevice, b_choose = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 796
    if-eqz v11, :cond_2

    .line 797
    const-string v0, "PhoneService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "pushPromptToDevice start NotifySendData to send command"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 798
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hwservicesmgr/PhoneService;->g:Lo/dkn;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 799
    return-void

    .line 801
    :cond_1
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hwservicesmgr/PhoneService;->g:Lo/dkn;

    invoke-virtual {v0, v12, v13}, Lo/dkn;->e(Lcom/huawei/hwcommonmodel/datatypes/DataPromptData;Lo/dag;)Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;

    move-result-object v14

    .line 802
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hwservicesmgr/PhoneService;->g:Lo/dkn;

    const/4 v1, 0x1

    invoke-virtual {v0, v14, v1}, Lo/dkn;->e(Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;I)V

    .line 803
    goto :goto_4

    .line 804
    :cond_2
    const-string v0, "PhoneService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "postPromptMsg failure: type is not support!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 808
    :cond_3
    :goto_4
    return-void

    :sswitch_data_0
    .sparse-switch
        -0x4bce7b90 -> :sswitch_0
        0x697f208 -> :sswitch_1
        0x48ec37f4 -> :sswitch_3
        0x71375bff -> :sswitch_2
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method static synthetic f(Lcom/huawei/hwservicesmgr/PhoneService;)J
    .locals 2

    .line 103
    invoke-direct {p0}, Lcom/huawei/hwservicesmgr/PhoneService;->k()J

    move-result-wide v0

    return-wide v0
.end method

.method private f()V
    .locals 4

    .line 640
    new-instance v0, Lo/dks;

    invoke-direct {v0, p0}, Lo/dks;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/hwservicesmgr/PhoneService;->d:Lo/dks;

    .line 641
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/PhoneService;->d:Lo/dks;

    invoke-virtual {v0}, Lo/dks;->c()V

    .line 642
    invoke-static {p0}, Lo/dkm;->e(Landroid/content/Context;)Lo/dkm;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hwservicesmgr/PhoneService;->b:Lo/dkm;

    .line 643
    invoke-static {p0}, Lo/dko;->b(Landroid/content/Context;)Lo/dko;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hwservicesmgr/PhoneService;->f:Lo/dko;

    .line 644
    invoke-static {p0}, Lo/dkn;->a(Landroid/content/Context;)Lo/dkn;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hwservicesmgr/PhoneService;->g:Lo/dkn;

    .line 645
    invoke-static {p0}, Lo/dqh;->e(Landroid/content/Context;)Lo/dqh;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hwservicesmgr/PhoneService;->k:Lo/dqh;

    .line 646
    invoke-static {p0}, Lo/dkl;->e(Landroid/content/Context;)Lo/dkl;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hwservicesmgr/PhoneService;->h:Lo/dkl;

    .line 647
    const-string v0, "PhoneService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "---initManager finish---"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 648
    return-void
.end method

.method static synthetic g(Lcom/huawei/hwservicesmgr/PhoneService;)Lo/dkn;
    .locals 1

    .line 103
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/PhoneService;->g:Lo/dkn;

    return-object v0
.end method

.method private g()V
    .locals 5

    .line 559
    const-string v0, "PhoneService"

    const/4 v1, 0x1

    :try_start_0
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter unregisterReceiver()!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 560
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/PhoneService;->t:Landroid/content/BroadcastReceiver;

    invoke-virtual {p0, v0}, Lcom/huawei/hwservicesmgr/PhoneService;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 561
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/PhoneService;->q:Landroid/content/BroadcastReceiver;

    invoke-virtual {p0, v0}, Lcom/huawei/hwservicesmgr/PhoneService;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 562
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/PhoneService;->x:Landroid/content/BroadcastReceiver;

    invoke-virtual {p0, v0}, Lcom/huawei/hwservicesmgr/PhoneService;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1

    .line 567
    goto :goto_0

    .line 563
    :catch_0
    move-exception v4

    .line 564
    const-string v0, "PhoneService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/lang/IllegalArgumentException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 567
    goto :goto_0

    .line 565
    :catch_1
    move-exception v4

    .line 566
    const-string v0, "PhoneService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/lang/RuntimeException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 568
    :goto_0
    return-void
.end method

.method static synthetic h(Lcom/huawei/hwservicesmgr/PhoneService;)Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;
    .locals 1

    .line 103
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/PhoneService;->o:Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;

    return-object v0
.end method

.method private h()V
    .locals 6

    .line 517
    new-instance v0, Lcom/huawei/hwservicesmgr/receiver/NetworkConnectReceiver;

    invoke-direct {v0}, Lcom/huawei/hwservicesmgr/receiver/NetworkConnectReceiver;-><init>()V

    iput-object v0, p0, Lcom/huawei/hwservicesmgr/PhoneService;->t:Landroid/content/BroadcastReceiver;

    .line 518
    new-instance v3, Landroid/content/IntentFilter;

    invoke-direct {v3}, Landroid/content/IntentFilter;-><init>()V

    .line 519
    const-string v0, "android.net.conn.CONNECTIVITY_CHANGE"

    invoke-virtual {v3, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 520
    const-string v0, "android.net.wifi.WIFI_STATE_CHANGED"

    invoke-virtual {v3, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 521
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/PhoneService;->t:Landroid/content/BroadcastReceiver;

    invoke-virtual {p0, v0, v3}, Lcom/huawei/hwservicesmgr/PhoneService;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 522
    new-instance v0, Lcom/huawei/hwdevicefontmgr/LanguageChangedBR;

    invoke-direct {v0}, Lcom/huawei/hwdevicefontmgr/LanguageChangedBR;-><init>()V

    iput-object v0, p0, Lcom/huawei/hwservicesmgr/PhoneService;->q:Landroid/content/BroadcastReceiver;

    .line 523
    new-instance v4, Landroid/content/IntentFilter;

    invoke-direct {v4}, Landroid/content/IntentFilter;-><init>()V

    .line 524
    const-string v0, "android.intent.action.LOCALE_CHANGED"

    invoke-virtual {v4, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 525
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/PhoneService;->q:Landroid/content/BroadcastReceiver;

    invoke-virtual {p0, v0, v4}, Lcom/huawei/hwservicesmgr/PhoneService;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 526
    invoke-static {}, Lo/dbf;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 527
    return-void

    .line 529
    :cond_0
    new-instance v5, Landroid/content/IntentFilter;

    const-string v0, "com.huawei.bone.action.CONNECTION_STATE_CHANGED"

    invoke-direct {v5, v0}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 530
    const-string v0, "com.huawei.health.action.unbindNotification"

    invoke-virtual {v5, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 531
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/PhoneService;->x:Landroid/content/BroadcastReceiver;

    sget-object v1, Lo/dac;->a:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-virtual {p0, v0, v5, v1, v2}, Lcom/huawei/hwservicesmgr/PhoneService;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Ljava/lang/String;Landroid/os/Handler;)Landroid/content/Intent;

    .line 532
    return-void
.end method

.method static synthetic i(Lcom/huawei/hwservicesmgr/PhoneService;)Landroid/os/Handler;
    .locals 1

    .line 103
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/PhoneService;->p:Landroid/os/Handler;

    return-object v0
.end method

.method private i()V
    .locals 2

    .line 922
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/PhoneService;->d:Lo/dks;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 923
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/PhoneService;->d:Lo/dks;

    invoke-virtual {v0}, Lo/dks;->e()V

    .line 925
    :cond_0
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/PhoneService;->g:Lo/dkn;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 926
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/PhoneService;->g:Lo/dkn;

    invoke-virtual {v0}, Lo/dkn;->e()V

    .line 928
    :cond_1
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/PhoneService;->f:Lo/dko;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 929
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/PhoneService;->f:Lo/dko;

    invoke-virtual {v0}, Lo/dko;->a()V

    .line 931
    :cond_2
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/PhoneService;->h:Lo/dkl;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 932
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/PhoneService;->h:Lo/dkl;

    invoke-virtual {v0}, Lo/dkl;->b()V

    .line 934
    :cond_3
    return-void
.end method

.method private k()J
    .locals 4

    .line 1331
    iget-wide v0, p0, Lcom/huawei/hwservicesmgr/PhoneService;->l:J

    const-wide/16 v2, 0x2

    mul-long/2addr v0, v2

    iput-wide v0, p0, Lcom/huawei/hwservicesmgr/PhoneService;->l:J

    .line 1332
    iget-wide v0, p0, Lcom/huawei/hwservicesmgr/PhoneService;->l:J

    const-wide/32 v2, 0x927c0

    cmp-long v0, v0, v2

    if-gtz v0, :cond_0

    iget-wide v0, p0, Lcom/huawei/hwservicesmgr/PhoneService;->l:J

    goto :goto_0

    :cond_0
    const-wide/32 v0, 0x927c0

    :goto_0
    return-wide v0
.end method

.method static synthetic k(Lcom/huawei/hwservicesmgr/PhoneService;)Ljava/util/List;
    .locals 1

    .line 103
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/PhoneService;->i:Ljava/util/List;

    return-object v0
.end method

.method private m()V
    .locals 4

    .line 1449
    const-string v0, "PhoneService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "pushLocalPressure2Device"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1450
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/PhoneService;->h:Lo/dkl;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 1451
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/PhoneService;->h:Lo/dkl;

    invoke-virtual {v0}, Lo/dkl;->e()V

    goto :goto_0

    .line 1453
    :cond_0
    const-string v0, "PhoneService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "pushLocalPressure2Device mWeatherMgr == NULL"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1455
    :goto_0
    return-void
.end method

.method static synthetic o(Lcom/huawei/hwservicesmgr/PhoneService;)Ljava/util/concurrent/ExecutorService;
    .locals 1

    .line 103
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/PhoneService;->r:Ljava/util/concurrent/ExecutorService;

    return-object v0
.end method


# virtual methods
.method public c()V
    .locals 4

    .line 1460
    const-string v0, "PhoneService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "pushWeatherData2Device"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1461
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/PhoneService;->h:Lo/dkl;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 1462
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/PhoneService;->h:Lo/dkl;

    invoke-virtual {v0}, Lo/dkl;->d()V

    goto :goto_0

    .line 1464
    :cond_0
    const-string v0, "PhoneService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "pushWeatherData2Device == NULL"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1466
    :goto_0
    return-void
.end method

.method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 1

    .line 939
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/PhoneService;->C:Lo/dbx$a;

    return-object v0
.end method

.method public onCreate()V
    .locals 11

    .line 355
    invoke-static {}, Lo/dbf;->q()Z

    move-result v0

    if-nez v0, :cond_0

    .line 356
    return-void

    .line 358
    :cond_0
    invoke-super {p0}, Landroid/app/Service;->onCreate()V

    .line 359
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/PhoneService;->r:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/huawei/hwservicesmgr/PhoneService$2;

    invoke-direct {v1, p0}, Lcom/huawei/hwservicesmgr/PhoneService$2;-><init>(Lcom/huawei/hwservicesmgr/PhoneService;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 368
    invoke-static {p0}, Lo/dea;->a(Landroid/content/Context;)Lo/dea;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hwservicesmgr/PhoneService;->e:Lo/dea;

    .line 370
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->getInstance()Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hwservicesmgr/PhoneService;->o:Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;

    .line 372
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->getInstance()Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;

    move-result-object v4

    .line 373
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;->getInstance()Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;

    move-result-object v5

    .line 374
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->getInstance()Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;

    move-result-object v6

    .line 378
    invoke-static {}, Lo/dkw;->e()Lo/dkw;

    move-result-object v7

    .line 379
    invoke-static {}, Lo/dgr;->a()Lo/dgr;

    move-result-object v8

    .line 380
    invoke-static {}, Lo/dku;->a()Lo/dku;

    move-result-object v9

    .line 381
    invoke-static {}, Lo/dkp;->e()Lo/dkp;

    move-result-object v10

    .line 383
    sget-object v0, Lcom/huawei/hwservicesmgr/PhoneService;->m:Ljava/util/Map;

    const/16 v1, 0x16

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 384
    sget-object v0, Lcom/huawei/hwservicesmgr/PhoneService;->m:Ljava/util/Map;

    const/16 v1, 0x17

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 385
    sget-object v0, Lcom/huawei/hwservicesmgr/PhoneService;->m:Ljava/util/Map;

    const/16 v1, 0x19

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 389
    sget-object v0, Lcom/huawei/hwservicesmgr/PhoneService;->m:Ljava/util/Map;

    const/16 v1, 0x3f6

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 390
    sget-object v0, Lcom/huawei/hwservicesmgr/PhoneService;->m:Ljava/util/Map;

    const/16 v1, 0x18

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 392
    sget-object v0, Lcom/huawei/hwservicesmgr/PhoneService;->m:Ljava/util/Map;

    const/16 v1, 0x1f

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 393
    sget-object v0, Lcom/huawei/hwservicesmgr/PhoneService;->m:Ljava/util/Map;

    const/16 v1, 0x1c

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 398
    invoke-direct {p0}, Lcom/huawei/hwservicesmgr/PhoneService;->f()V

    .line 410
    invoke-static {}, Lo/yi;->c()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 411
    new-instance v0, Lo/yh;

    invoke-direct {v0}, Lo/yh;-><init>()V

    iput-object v0, p0, Lcom/huawei/hwservicesmgr/PhoneService;->u:Lo/yh;

    .line 412
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/PhoneService;->u:Lo/yh;

    invoke-virtual {v0, p0}, Lo/yh;->d(Landroid/content/Context;)V

    .line 414
    :cond_1
    invoke-direct {p0}, Lcom/huawei/hwservicesmgr/PhoneService;->h()V

    .line 416
    invoke-static {}, Lo/dbf;->d()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 417
    return-void

    .line 419
    :cond_2
    new-instance v0, Lcom/huawei/hwservicesmgr/PhoneService$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/huawei/hwservicesmgr/PhoneService$a;-><init>(Lcom/huawei/hwservicesmgr/PhoneService$5;)V

    iput-object v0, p0, Lcom/huawei/hwservicesmgr/PhoneService;->z:Lcom/huawei/hwservicesmgr/PhoneService$a;

    .line 420
    new-instance v0, Lcom/huawei/hwservicesmgr/PhoneService$d;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/huawei/hwservicesmgr/PhoneService$d;-><init>(Lcom/huawei/hwservicesmgr/PhoneService$5;)V

    iput-object v0, p0, Lcom/huawei/hwservicesmgr/PhoneService;->v:Lo/cmo;

    .line 421
    new-instance v0, Lo/cmj;

    invoke-direct {v0}, Lo/cmj;-><init>()V

    iput-object v0, p0, Lcom/huawei/hwservicesmgr/PhoneService;->y:Lo/cmj;

    .line 422
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/PhoneService;->y:Lo/cmj;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    new-instance v2, Lcom/huawei/hwservicesmgr/PhoneService$3;

    invoke-direct {v2, p0}, Lcom/huawei/hwservicesmgr/PhoneService$3;-><init>(Lcom/huawei/hwservicesmgr/PhoneService;)V

    const-string v3, "PhoneService"

    invoke-virtual {v0, v1, v2, v3}, Lo/cmj;->a(Landroid/content/Context;Lo/cmo;Ljava/lang/String;)I

    .line 439
    return-void
.end method

.method public onDestroy()V
    .locals 4

    .line 891
    const-string v0, "PhoneService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onDestroy"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 896
    invoke-super {p0}, Landroid/app/Service;->onDestroy()V

    .line 897
    invoke-direct {p0}, Lcom/huawei/hwservicesmgr/PhoneService;->g()V

    .line 899
    invoke-direct {p0}, Lcom/huawei/hwservicesmgr/PhoneService;->i()V

    .line 901
    invoke-static {}, Lo/dbf;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 902
    return-void

    .line 904
    :cond_0
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/PhoneService;->y:Lo/cmj;

    if-nez v0, :cond_1

    .line 905
    const-string v0, "PhoneService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onDestroy mHealthOpenSDK null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 906
    return-void

    .line 909
    :cond_1
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/PhoneService;->z:Lcom/huawei/hwservicesmgr/PhoneService$a;

    if-nez v0, :cond_2

    .line 910
    const-string v0, "PhoneService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onDestroy mStepCallback null!!!why?"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 911
    return-void

    .line 913
    :cond_2
    const-string v0, "PhoneService"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "unRegister mStepCallback:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/hwservicesmgr/PhoneService;->z:Lcom/huawei/hwservicesmgr/PhoneService$a;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 914
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/PhoneService;->y:Lo/cmj;

    iget-object v1, p0, Lcom/huawei/hwservicesmgr/PhoneService;->z:Lcom/huawei/hwservicesmgr/PhoneService$a;

    invoke-virtual {v0, v1}, Lo/cmj;->a(Lo/cmq;)V

    .line 915
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwservicesmgr/PhoneService;->stopForeground(Z)V

    .line 916
    return-void
.end method

.method public onLowMemory()V
    .locals 4

    .line 667
    const-string v0, "PhoneService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onLowMemory"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 668
    invoke-super {p0}, Landroid/app/Service;->onLowMemory()V

    .line 669
    return-void
.end method

.method public onStartCommand(Landroid/content/Intent;II)I
    .locals 4

    .line 652
    const-string v0, "PhoneService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "---onStartCommand enter---"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 653
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/PhoneService;->o:Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 654
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/PhoneService;->o:Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;

    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->reconnect()V

    .line 656
    :cond_0
    if-eqz p1, :cond_1

    .line 657
    invoke-direct {p0, p1}, Lcom/huawei/hwservicesmgr/PhoneService;->b(Landroid/content/Intent;)V

    .line 658
    invoke-super {p0, p1, p2, p3}, Landroid/app/Service;->onStartCommand(Landroid/content/Intent;II)I

    move-result v0

    return v0

    .line 660
    :cond_1
    const-string v0, "PhoneService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "error, intent is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 661
    const/4 v0, 0x1

    return v0
.end method

.method public onUnbind(Landroid/content/Intent;)Z
    .locals 5

    .line 674
    const-string v0, "PhoneService"

    const/4 v1, 0x1

    :try_start_0
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onUnbind "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 677
    goto :goto_0

    .line 675
    :catch_0
    move-exception v4

    .line 676
    const-string v0, "PhoneService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onUnbind error,"

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

    .line 678
    :goto_0
    invoke-super {p0, p1}, Landroid/app/Service;->onUnbind(Landroid/content/Intent;)Z

    move-result v0

    return v0
.end method
