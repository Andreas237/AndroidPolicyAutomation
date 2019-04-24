.class public Lcom/huawei/feedback/component/ProgressService;
.super Landroid/app/Service;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/feedback/component/ProgressService$ProgressPauseReceiver;,
        Lcom/huawei/feedback/component/ProgressService$ProgressCancelReceiver;,
        Lcom/huawei/feedback/component/ProgressService$ProgressStartReceiver;,
        Lcom/huawei/feedback/component/ProgressService$ProgressReceiver;
    }
.end annotation


# static fields
.field private static final c:Ljava/lang/String; = "ProgressService"

.field private static final d:Ljava/lang/String; = "1"

.field private static final e:Ljava/lang/String; = "2"

.field private static final f:Ljava/lang/String; = "0"

.field private static final g:Ljava/lang/String; = "%"

.field private static final h:I = 0x0

.field private static final i:I = 0x64

.field private static final j:I = -0x1

.field private static final k:I = 0x9

.field private static s:Lcom/huawei/logupload/a; = null

.field private static t:Ljava/util/List; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/logupload/LogUpload;>;"
        }
    .end annotation
.end field

.field private static x:Ljava/lang/String; = null


# instance fields
.field a:Landroid/content/ServiceConnection;

.field b:Landroid/os/Handler;

.field private l:Landroid/app/NotificationManager;

.field private m:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/Long;Landroid/a/a/a/d$d;>;"
        }
    .end annotation
.end field

.field private n:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/Long;Lcom/huawei/logupload/LogUpload;>;"
        }
    .end annotation
.end field

.field private o:Lcom/huawei/feedback/component/ProgressService$ProgressReceiver;

.field private p:Lcom/huawei/feedback/component/ProgressService$ProgressStartReceiver;

.field private q:Lcom/huawei/feedback/component/ProgressService$ProgressCancelReceiver;

.field private r:Lcom/huawei/feedback/component/ProgressService$ProgressPauseReceiver;

.field private u:Lcom/huawei/lcagent/client/LogCollectManager;

.field private v:Landroid/app/AlertDialog;

.field private w:Z

.field private y:Lcom/huawei/logupload/LogUpload;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 98
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lcom/huawei/feedback/component/ProgressService;->t:Ljava/util/List;

    .line 114
    const-string v0, ""

    sput-object v0, Lcom/huawei/feedback/component/ProgressService;->x:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 54
    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    .line 84
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/huawei/feedback/component/ProgressService;->m:Ljava/util/Map;

    .line 85
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/huawei/feedback/component/ProgressService;->n:Ljava/util/Map;

    .line 90
    new-instance v0, Lcom/huawei/feedback/component/ProgressService$ProgressReceiver;

    invoke-direct {v0, p0}, Lcom/huawei/feedback/component/ProgressService$ProgressReceiver;-><init>(Lcom/huawei/feedback/component/ProgressService;)V

    iput-object v0, p0, Lcom/huawei/feedback/component/ProgressService;->o:Lcom/huawei/feedback/component/ProgressService$ProgressReceiver;

    .line 91
    new-instance v0, Lcom/huawei/feedback/component/ProgressService$ProgressStartReceiver;

    invoke-direct {v0, p0}, Lcom/huawei/feedback/component/ProgressService$ProgressStartReceiver;-><init>(Lcom/huawei/feedback/component/ProgressService;)V

    iput-object v0, p0, Lcom/huawei/feedback/component/ProgressService;->p:Lcom/huawei/feedback/component/ProgressService$ProgressStartReceiver;

    .line 92
    new-instance v0, Lcom/huawei/feedback/component/ProgressService$ProgressCancelReceiver;

    invoke-direct {v0, p0}, Lcom/huawei/feedback/component/ProgressService$ProgressCancelReceiver;-><init>(Lcom/huawei/feedback/component/ProgressService;)V

    iput-object v0, p0, Lcom/huawei/feedback/component/ProgressService;->q:Lcom/huawei/feedback/component/ProgressService$ProgressCancelReceiver;

    .line 93
    new-instance v0, Lcom/huawei/feedback/component/ProgressService$ProgressPauseReceiver;

    invoke-direct {v0, p0}, Lcom/huawei/feedback/component/ProgressService$ProgressPauseReceiver;-><init>(Lcom/huawei/feedback/component/ProgressService;)V

    iput-object v0, p0, Lcom/huawei/feedback/component/ProgressService;->r:Lcom/huawei/feedback/component/ProgressService$ProgressPauseReceiver;

    .line 100
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/feedback/component/ProgressService;->u:Lcom/huawei/lcagent/client/LogCollectManager;

    .line 110
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/feedback/component/ProgressService;->w:Z

    .line 128
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/feedback/component/ProgressService;->y:Lcom/huawei/logupload/LogUpload;

    .line 147
    new-instance v0, Lcom/huawei/feedback/component/d;

    invoke-direct {v0, p0}, Lcom/huawei/feedback/component/d;-><init>(Lcom/huawei/feedback/component/ProgressService;)V

    iput-object v0, p0, Lcom/huawei/feedback/component/ProgressService;->a:Landroid/content/ServiceConnection;

    .line 1224
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/huawei/feedback/component/ProgressService;->b:Landroid/os/Handler;

    return-void
.end method

.method private a(I)Landroid/app/AlertDialog$Builder;
    .locals 4

    .line 1380
    const/4 v1, 0x0

    .line 1381
    invoke-static {p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v2

    .line 1382
    const/4 v0, 0x0

    invoke-virtual {v2, p1, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v3

    .line 1383
    new-instance v1, Landroid/app/AlertDialog$Builder;

    invoke-direct {v1, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 1384
    invoke-virtual {v1, v3}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    .line 1385
    return-object v1
.end method

.method static synthetic a(Lcom/huawei/feedback/component/ProgressService;)Lcom/huawei/feedback/component/ProgressService$ProgressReceiver;
    .locals 1

    .line 54
    iget-object v0, p0, Lcom/huawei/feedback/component/ProgressService;->o:Lcom/huawei/feedback/component/ProgressService$ProgressReceiver;

    return-object v0
.end method

.method static synthetic a(Lcom/huawei/logupload/a;)Lcom/huawei/logupload/a;
    .locals 0

    .line 54
    sput-object p0, Lcom/huawei/feedback/component/ProgressService;->s:Lcom/huawei/logupload/a;

    return-object p0
.end method

.method public static a()Ljava/lang/String;
    .locals 1

    .line 116
    sget-object v0, Lcom/huawei/feedback/component/ProgressService;->x:Ljava/lang/String;

    return-object v0
.end method

.method public static a(Landroid/content/Context;)V
    .locals 6

    .line 1412
    const/4 v2, 0x0

    .line 1413
    sget-object v0, Lcom/huawei/feedback/component/ProgressService;->s:Lcom/huawei/logupload/a;

    if-eqz v0, :cond_0

    .line 1415
    :try_start_0
    sget-object v0, Lcom/huawei/feedback/component/ProgressService;->s:Lcom/huawei/logupload/a;

    invoke-interface {v0}, Lcom/huawei/logupload/a;->a()Ljava/util/List;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v2, v0

    .line 1418
    goto :goto_0

    .line 1416
    :catch_0
    move-exception v3

    .line 1417
    const-string v0, "ProgressService"

    const-string v1, "stopProgressService RemoteException"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 1421
    :cond_0
    :goto_0
    const/4 v3, 0x0

    .line 1422
    if-eqz v2, :cond_2

    .line 1423
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/logupload/LogUpload;

    .line 1424
    sget-object v0, Lcom/huawei/feedback/component/ProgressService;->x:Ljava/lang/String;

    invoke-virtual {v5}, Lcom/huawei/logupload/LogUpload;->E()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1425
    const/4 v3, 0x1

    .line 1426
    goto :goto_2

    .line 1428
    :cond_1
    goto :goto_1

    .line 1430
    :cond_2
    :goto_2
    if-nez v3, :cond_3

    .line 1431
    new-instance v4, Landroid/content/Intent;

    const-class v0, Lcom/huawei/feedback/component/ProgressService;

    invoke-direct {v4, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 1432
    invoke-virtual {p0, v4}, Landroid/content/Context;->stopService(Landroid/content/Intent;)Z

    .line 1434
    :cond_3
    return-void
.end method

.method static synthetic a(Lcom/huawei/feedback/component/ProgressService;Lcom/huawei/logupload/LogUpload;)V
    .locals 0

    .line 54
    invoke-direct {p0, p1}, Lcom/huawei/feedback/component/ProgressService;->b(Lcom/huawei/logupload/LogUpload;)V

    return-void
.end method

.method static synthetic a(Lcom/huawei/feedback/component/ProgressService;Lcom/huawei/logupload/LogUpload;J)V
    .locals 0

    .line 54
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/feedback/component/ProgressService;->a(Lcom/huawei/logupload/LogUpload;J)V

    return-void
.end method

.method static synthetic a(Lcom/huawei/feedback/component/ProgressService;Lcom/huawei/logupload/LogUpload;Landroid/content/Intent;)V
    .locals 0

    .line 54
    invoke-direct {p0, p1, p2}, Lcom/huawei/feedback/component/ProgressService;->a(Lcom/huawei/logupload/LogUpload;Landroid/content/Intent;)V

    return-void
.end method

.method static synthetic a(Lcom/huawei/feedback/component/ProgressService;Lcom/huawei/logupload/LogUpload;Z)V
    .locals 0

    .line 54
    invoke-direct {p0, p1, p2}, Lcom/huawei/feedback/component/ProgressService;->a(Lcom/huawei/logupload/LogUpload;Z)V

    return-void
.end method

.method private a(Lcom/huawei/logupload/LogUpload;)V
    .locals 8

    .line 556
    const/4 v4, 0x0

    .line 557
    sget-object v0, Lcom/huawei/feedback/component/ProgressService;->s:Lcom/huawei/logupload/a;

    if-eqz v0, :cond_0

    .line 559
    :try_start_0
    sget-object v0, Lcom/huawei/feedback/component/ProgressService;->s:Lcom/huawei/logupload/a;

    invoke-interface {v0}, Lcom/huawei/logupload/a;->a()Ljava/util/List;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v4, v0

    .line 562
    goto :goto_0

    .line 560
    :catch_0
    move-exception v5

    .line 561
    const-string v0, "ProgressService"

    const-string v1, "dealexceptionSingle(LogUpload mLogUploadInfo)\uff1aexternal queryAllRecord RemoteException"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 564
    :cond_0
    :goto_0
    if-eqz v4, :cond_4

    .line 565
    const/4 v5, 0x0

    .line 566
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/logupload/LogUpload;

    .line 567
    invoke-virtual {v7}, Lcom/huawei/logupload/LogUpload;->j()J

    move-result-wide v0

    invoke-virtual {p1}, Lcom/huawei/logupload/LogUpload;->j()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-nez v0, :cond_1

    .line 568
    const/4 v5, 0x1

    .line 569
    goto :goto_2

    .line 571
    :cond_1
    goto :goto_1

    .line 572
    :cond_2
    :goto_2
    if-nez v5, :cond_3

    .line 573
    return-void

    .line 576
    :cond_3
    goto :goto_3

    .line 577
    :cond_4
    return-void

    .line 580
    :goto_3
    sget-object v0, Lcom/huawei/feedback/component/ProgressService;->x:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/huawei/logupload/LogUpload;->E()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 582
    const-string v0, "2"

    invoke-virtual {p1, v0}, Lcom/huawei/logupload/LogUpload;->d(Ljava/lang/String;)V

    .line 585
    invoke-virtual {p1}, Lcom/huawei/logupload/LogUpload;->j()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    invoke-static {v0, v1}, Lcom/huawei/feedback/logic/f;->a(Ljava/lang/String;I)V

    .line 588
    :try_start_1
    sget-object v0, Lcom/huawei/feedback/component/ProgressService;->s:Lcom/huawei/logupload/a;

    invoke-interface {v0, p1}, Lcom/huawei/logupload/a;->a(Lcom/huawei/logupload/LogUpload;)Z

    move-result v5

    .line 589
    const-string v0, "ProgressService"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "updateStatus flag:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 590
    const-string v0, "ProgressService"

    const-string v1, "dealexceptionSingle updateNotification"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 591
    invoke-direct {p0, p1}, Lcom/huawei/feedback/component/ProgressService;->c(Lcom/huawei/logupload/LogUpload;)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_1

    .line 595
    goto :goto_4

    .line 593
    :catch_1
    move-exception v6

    .line 594
    const-string v0, "ProgressService"

    const-string v1, "dealexceptionSingle(LogUpload mLogUploadInfo)\uff1aexternal updateStatus RemoteException"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 601
    :cond_5
    :goto_4
    return-void
.end method

.method private a(Lcom/huawei/logupload/LogUpload;J)V
    .locals 4

    .line 1341
    invoke-static {}, Lcom/huawei/phoneserviceuni/common/e/a;->m()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1342
    .line 1343
    invoke-static {}, Lcom/huawei/feedback/FeedbackApi;->getApplicationcontext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "feedback_dialog_cancel_uploadlog_new"

    invoke-static {v0, v1}, Lcom/huawei/feedback/f;->c(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    .line 1342
    invoke-direct {p0, v0}, Lcom/huawei/feedback/component/ProgressService;->a(I)Landroid/app/AlertDialog$Builder;

    move-result-object v3

    goto :goto_0

    .line 1345
    .line 1346
    :cond_0
    invoke-static {}, Lcom/huawei/feedback/FeedbackApi;->getApplicationcontext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "feedback_dialog_cancel_uploadlog"

    invoke-static {v0, v1}, Lcom/huawei/feedback/f;->c(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    .line 1345
    invoke-direct {p0, v0}, Lcom/huawei/feedback/component/ProgressService;->a(I)Landroid/app/AlertDialog$Builder;

    move-result-object v3

    .line 1353
    .line 1354
    :goto_0
    invoke-virtual {p0}, Lcom/huawei/feedback/component/ProgressService;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-static {}, Lcom/huawei/feedback/FeedbackApi;->getApplicationcontext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "feedback_ok"

    invoke-static {v1, v2}, Lcom/huawei/feedback/f;->b(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lcom/huawei/feedback/component/h;

    invoke-direct {v1, p0, p1, p2, p3}, Lcom/huawei/feedback/component/h;-><init>(Lcom/huawei/feedback/component/ProgressService;Lcom/huawei/logupload/LogUpload;J)V

    .line 1353
    invoke-virtual {v3, v0, v1}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    .line 1361
    invoke-static {}, Lcom/huawei/feedback/FeedbackApi;->getApplicationcontext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "feedback_cancel"

    invoke-static {v1, v2}, Lcom/huawei/feedback/f;->b(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    new-instance v2, Lcom/huawei/feedback/component/g;

    invoke-direct {v2, p0}, Lcom/huawei/feedback/component/g;-><init>(Lcom/huawei/feedback/component/ProgressService;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 1372
    invoke-virtual {v3}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/feedback/component/ProgressService;->v:Landroid/app/AlertDialog;

    .line 1373
    iget-object v0, p0, Lcom/huawei/feedback/component/ProgressService;->v:Landroid/app/AlertDialog;

    invoke-virtual {v0}, Landroid/app/AlertDialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/16 v1, 0x7d3

    invoke-virtual {v0, v1}, Landroid/view/Window;->setType(I)V

    .line 1374
    iget-object v0, p0, Lcom/huawei/feedback/component/ProgressService;->v:Landroid/app/AlertDialog;

    invoke-virtual {v0}, Landroid/app/AlertDialog;->show()V

    .line 1375
    iget-object v0, p0, Lcom/huawei/feedback/component/ProgressService;->v:Landroid/app/AlertDialog;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog;->setCanceledOnTouchOutside(Z)V

    .line 1377
    return-void
.end method

.method private a(Lcom/huawei/logupload/LogUpload;Landroid/content/Intent;)V
    .locals 7

    .line 366
    const-string v0, "exception"

    invoke-virtual {p2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 367
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 368
    const-string v0, "1"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 369
    const-string v0, "ProgressService"

    const-string v1, "exception:1"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 370
    invoke-direct {p0}, Lcom/huawei/feedback/component/ProgressService;->g()V

    goto/16 :goto_1

    .line 372
    :cond_0
    const-string v0, "2"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    if-eqz p1, :cond_3

    .line 373
    const-string v0, "ProgressService"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "exception:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 374
    invoke-direct {p0, p1}, Lcom/huawei/feedback/component/ProgressService;->a(Lcom/huawei/logupload/LogUpload;)V

    goto/16 :goto_1

    .line 376
    :cond_1
    if-eqz p1, :cond_3

    .line 377
    const-string v0, "ProgressService"

    const-string v1, "ProgressReceiver onReceive"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 380
    const-string v0, "ProgressService"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "mLogUploadInfo.getId() :"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Lcom/huawei/logupload/LogUpload;->j()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 381
    const-string v0, "ProgressService"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "mLogUploadInfo.getTaskId() :"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Lcom/huawei/logupload/LogUpload;->g()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 382
    const-string v0, "extraValue"

    invoke-virtual {p2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 384
    sget-object v0, Lcom/huawei/feedback/component/ProgressService;->x:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/huawei/logupload/LogUpload;->E()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 385
    const-string v0, "ProgressService"

    const-string v1, "dealexceptionProgress createNotification"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 386
    invoke-direct {p0, p1}, Lcom/huawei/feedback/component/ProgressService;->b(Lcom/huawei/logupload/LogUpload;)V

    .line 387
    invoke-virtual {p1}, Lcom/huawei/logupload/LogUpload;->w()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 390
    const-string v0, "2"

    invoke-virtual {p1}, Lcom/huawei/logupload/LogUpload;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    if-nez v5, :cond_2

    .line 395
    const-string v0, "0"

    invoke-virtual {p1, v0}, Lcom/huawei/logupload/LogUpload;->d(Ljava/lang/String;)V

    .line 397
    :try_start_0
    sget-object v0, Lcom/huawei/feedback/component/ProgressService;->s:Lcom/huawei/logupload/a;

    invoke-interface {v0, p1}, Lcom/huawei/logupload/a;->a(Lcom/huawei/logupload/LogUpload;)Z
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 400
    goto :goto_0

    .line 398
    :catch_0
    move-exception v6

    .line 399
    const-string v0, "ProgressService"

    const-string v1, "external updateStatus RemoteException"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 403
    :cond_2
    :goto_0
    const-string v0, "ProgressService"

    const-string v1, "dealexceptionProgress updateNotification"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 404
    invoke-direct {p0, p1}, Lcom/huawei/feedback/component/ProgressService;->c(Lcom/huawei/logupload/LogUpload;)V

    .line 409
    :cond_3
    :goto_1
    return-void
.end method

.method private a(Lcom/huawei/logupload/LogUpload;Z)V
    .locals 13

    .line 1011
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    .line 1012
    invoke-virtual {p1}, Lcom/huawei/logupload/LogUpload;->C()I

    move-result v0

    const/16 v1, 0x8

    if-ne v0, v1, :cond_1

    .line 1013
    :cond_0
    return-void

    .line 1015
    :cond_1
    const-string v0, "ProgressService"

    const-string v1, "refresh"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 1020
    invoke-direct {p0, p1}, Lcom/huawei/feedback/component/ProgressService;->e(Lcom/huawei/logupload/LogUpload;)I

    move-result v5

    .line 1025
    const-string v0, "ProgressService"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "refresh  notificationId:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 1026
    const-string v0, "ProgressService"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "refresh  notificationId:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Lcom/huawei/logupload/LogUpload;->j()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 1061
    invoke-virtual {p1}, Lcom/huawei/logupload/LogUpload;->w()Ljava/lang/String;

    move-result-object v6

    .line 1062
    const-string v7, ""

    .line 1063
    invoke-virtual {p1}, Lcom/huawei/logupload/LogUpload;->k()J

    move-result-wide v8

    .line 1064
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 1067
    const-string v0, ","

    invoke-virtual {v6, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v10

    .line 1069
    array-length v0, v10

    const/4 v1, 0x2

    if-lt v0, v1, :cond_2

    const/4 v0, 0x1

    aget-object v0, v10, v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 1070
    const/4 v0, 0x1

    aget-object v0, v10, v0

    const/4 v1, 0x1

    aget-object v1, v10, v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v6

    .line 1073
    :cond_2
    goto :goto_0

    .line 1074
    :cond_3
    const-string v6, "0"

    .line 1077
    :goto_0
    :try_start_0
    invoke-static {v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v10

    .line 1080
    const-wide/16 v0, 0x0

    cmp-long v0, v8, v0

    if-lez v0, :cond_4

    .line 1081
    int-to-float v0, v10

    long-to-float v1, v8

    div-float v11, v0, v1

    .line 1083
    const/high16 v0, 0x42c80000    # 100.0f

    mul-float/2addr v0, v11

    float-to-int v12, v0

    .line 1088
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/feedback/component/ProgressService;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    .line 1089
    invoke-static {}, Lcom/huawei/feedback/FeedbackApi;->getApplicationcontext()Landroid/content/Context;

    move-result-object v2

    const-string v3, "feedback_advanced_loguploading"

    invoke-static {v2, v3}, Lcom/huawei/feedback/f;->b(Landroid/content/Context;Ljava/lang/String;)I

    move-result v2

    .line 1088
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "%"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v0, v1, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v7, v0

    .line 1098
    :cond_4
    goto :goto_1

    .line 1096
    :catch_0
    move-exception v10

    .line 1097
    const-string v0, "ProgressService"

    const-string v1, "NumberFormatException"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 1104
    :goto_1
    iget-object v0, p0, Lcom/huawei/feedback/component/ProgressService;->m:Ljava/util/Map;

    invoke-virtual {p1}, Lcom/huawei/logupload/LogUpload;->j()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Landroid/a/a/a/d$d;

    .line 1109
    invoke-virtual {v10, v7}, Landroid/a/a/a/d$d;->b(Ljava/lang/CharSequence;)Landroid/a/a/a/d$d;

    .line 1110
    invoke-virtual {v10}, Landroid/a/a/a/d$d;->c()Landroid/app/Notification;

    move-result-object v11

    .line 1111
    iget-object v0, p0, Lcom/huawei/feedback/component/ProgressService;->l:Landroid/app/NotificationManager;

    invoke-virtual {v0, v5, v11}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V

    .line 1114
    return-void
.end method

.method public static a(Ljava/lang/String;)V
    .locals 0

    .line 120
    sput-object p0, Lcom/huawei/feedback/component/ProgressService;->x:Ljava/lang/String;

    .line 121
    return-void
.end method

.method public static a(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/logupload/LogUpload;>;)V"
        }
    .end annotation

    .line 144
    sput-object p0, Lcom/huawei/feedback/component/ProgressService;->t:Ljava/util/List;

    .line 145
    return-void
.end method

.method static synthetic b(Lcom/huawei/feedback/component/ProgressService;)Lcom/huawei/feedback/component/ProgressService$ProgressStartReceiver;
    .locals 1

    .line 54
    iget-object v0, p0, Lcom/huawei/feedback/component/ProgressService;->p:Lcom/huawei/feedback/component/ProgressService$ProgressStartReceiver;

    return-object v0
.end method

.method public static b()Lcom/huawei/logupload/a;
    .locals 1

    .line 130
    sget-object v0, Lcom/huawei/feedback/component/ProgressService;->s:Lcom/huawei/logupload/a;

    return-object v0
.end method

.method static synthetic b(Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 54
    sput-object p0, Lcom/huawei/feedback/component/ProgressService;->t:Ljava/util/List;

    return-object p0
.end method

.method static synthetic b(Lcom/huawei/feedback/component/ProgressService;Lcom/huawei/logupload/LogUpload;)V
    .locals 0

    .line 54
    invoke-direct {p0, p1}, Lcom/huawei/feedback/component/ProgressService;->c(Lcom/huawei/logupload/LogUpload;)V

    return-void
.end method

.method static synthetic b(Lcom/huawei/feedback/component/ProgressService;Lcom/huawei/logupload/LogUpload;J)V
    .locals 0

    .line 54
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/feedback/component/ProgressService;->b(Lcom/huawei/logupload/LogUpload;J)V

    return-void
.end method

.method static synthetic b(Lcom/huawei/feedback/component/ProgressService;Lcom/huawei/logupload/LogUpload;Landroid/content/Intent;)V
    .locals 0

    .line 54
    invoke-direct {p0, p1, p2}, Lcom/huawei/feedback/component/ProgressService;->b(Lcom/huawei/logupload/LogUpload;Landroid/content/Intent;)V

    return-void
.end method

.method private b(Lcom/huawei/logupload/LogUpload;)V
    .locals 10

    .line 897
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    invoke-virtual {p1}, Lcom/huawei/logupload/LogUpload;->C()I

    move-result v0

    const/16 v1, 0x8

    if-ne v0, v1, :cond_1

    .line 898
    :cond_0
    return-void

    .line 900
    :cond_1
    const-string v0, "ProgressService"

    const-string v1, "CreateNotification"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 905
    invoke-direct {p0, p1}, Lcom/huawei/feedback/component/ProgressService;->e(Lcom/huawei/logupload/LogUpload;)I

    move-result v6

    .line 906
    const-string v0, "ProgressService"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "notificationId: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 907
    iget-object v0, p0, Lcom/huawei/feedback/component/ProgressService;->m:Ljava/util/Map;

    invoke-virtual {p1}, Lcom/huawei/logupload/LogUpload;->j()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-static {}, Lcom/huawei/feedback/FeedbackApi;->getApplicationcontext()Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_3

    .line 908
    :cond_2
    const-string v0, "ProgressService"

    const-string v1, "download.contains(notificationId)"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 909
    return-void

    .line 964
    :cond_3
    new-instance v0, Landroid/a/a/a/d$d;

    invoke-direct {v0, p0}, Landroid/a/a/a/d$d;-><init>(Landroid/content/Context;)V

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/a/a/a/d$d;->c(Z)Landroid/a/a/a/d$d;

    move-result-object v0

    .line 965
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v1

    .line 966
    invoke-virtual {p0}, Lcom/huawei/feedback/component/ProgressService;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    .line 967
    invoke-static {}, Lcom/huawei/feedback/FeedbackApi;->getApplicationcontext()Landroid/content/Context;

    move-result-object v3

    const-string v4, "feedback_advanced_loguploading"

    invoke-static {v3, v4}, Lcom/huawei/feedback/f;->b(Landroid/content/Context;Ljava/lang/String;)I

    move-result v3

    .line 966
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "0%"

    const/4 v5, 0x0

    aput-object v4, v3, v5

    .line 965
    invoke-static {v1, v2, v3}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/a/a/a/d$d;->e(Ljava/lang/CharSequence;)Landroid/a/a/a/d$d;

    move-result-object v7

    .line 969
    invoke-static {}, Lcom/huawei/phoneserviceuni/common/e/a;->t()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 970
    invoke-static {}, Lcom/huawei/feedback/FeedbackApi;->getApplicationcontext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "feedback_pushmsg_icon_new"

    invoke-static {v0, v1}, Lcom/huawei/feedback/f;->f(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v7, v0}, Landroid/a/a/a/d$d;->a(I)Landroid/a/a/a/d$d;

    goto :goto_0

    .line 973
    :cond_4
    invoke-static {}, Lcom/huawei/feedback/FeedbackApi;->getApplicationcontext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "feedback_pushmsg_icon"

    invoke-static {v0, v1}, Lcom/huawei/feedback/f;->f(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v7, v0}, Landroid/a/a/a/d$d;->a(I)Landroid/a/a/a/d$d;

    .line 975
    :goto_0
    invoke-static {}, Lcom/huawei/feedback/FeedbackApi;->getApplicationcontext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/feedback/e;->h(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Landroid/a/a/a/d$d;->a(Ljava/lang/CharSequence;)Landroid/a/a/a/d$d;

    .line 976
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    .line 977
    invoke-virtual {p0}, Lcom/huawei/feedback/component/ProgressService;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    .line 978
    invoke-static {}, Lcom/huawei/feedback/FeedbackApi;->getApplicationcontext()Landroid/content/Context;

    move-result-object v2

    const-string v3, "feedback_advanced_loguploading"

    invoke-static {v2, v3}, Lcom/huawei/feedback/f;->b(Landroid/content/Context;Ljava/lang/String;)I

    move-result v2

    .line 977
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "0%"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    .line 976
    invoke-static {v0, v1, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Landroid/a/a/a/d$d;->b(Ljava/lang/CharSequence;)Landroid/a/a/a/d$d;

    .line 980
    invoke-direct {p0}, Lcom/huawei/feedback/component/ProgressService;->i()Landroid/graphics/Bitmap;

    move-result-object v8

    .line 981
    const/4 v0, 0x0

    if-eq v0, v8, :cond_5

    .line 982
    invoke-virtual {v7, v8}, Landroid/a/a/a/d$d;->a(Landroid/graphics/Bitmap;)Landroid/a/a/a/d$d;

    .line 987
    :cond_5
    invoke-virtual {v7}, Landroid/a/a/a/d$d;->c()Landroid/app/Notification;

    move-result-object v9

    .line 994
    iget-object v0, p0, Lcom/huawei/feedback/component/ProgressService;->m:Ljava/util/Map;

    invoke-virtual {p1}, Lcom/huawei/logupload/LogUpload;->j()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v0, v1, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 995
    iget-object v0, p0, Lcom/huawei/feedback/component/ProgressService;->n:Ljava/util/Map;

    invoke-virtual {p1}, Lcom/huawei/logupload/LogUpload;->j()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1006
    iget-object v0, p0, Lcom/huawei/feedback/component/ProgressService;->l:Landroid/app/NotificationManager;

    invoke-virtual {v0, v6, v9}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V

    .line 1007
    return-void
.end method

.method private b(Lcom/huawei/logupload/LogUpload;J)V
    .locals 6

    .line 1447
    :try_start_0
    sget-object v0, Lcom/huawei/feedback/component/ProgressService;->s:Lcom/huawei/logupload/a;

    invoke-interface {v0, p1}, Lcom/huawei/logupload/a;->c(Lcom/huawei/logupload/LogUpload;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1451
    goto :goto_0

    .line 1448
    :catch_0
    move-exception v3

    .line 1450
    const-string v0, "ProgressService"

    const-string v1, "dealwithRecord RemoteException"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 1455
    :goto_0
    invoke-direct {p0, p1}, Lcom/huawei/feedback/component/ProgressService;->e(Lcom/huawei/logupload/LogUpload;)I

    move-result v3

    .line 1456
    iget-object v0, p0, Lcom/huawei/feedback/component/ProgressService;->l:Landroid/app/NotificationManager;

    invoke-virtual {v0, v3}, Landroid/app/NotificationManager;->cancel(I)V

    .line 1461
    invoke-static {p2, p3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x3

    invoke-static {v0, v1}, Lcom/huawei/feedback/logic/f;->a(Ljava/lang/String;I)V

    .line 1462
    invoke-virtual {p1}, Lcom/huawei/logupload/LogUpload;->i()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 1463
    new-instance v4, Ljava/io/File;

    invoke-virtual {p1}, Lcom/huawei/logupload/LogUpload;->i()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v4, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 1464
    const-string v0, "ProgressService"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "path:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Lcom/huawei/logupload/LogUpload;->i()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 1465
    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {v4}, Ljava/io/File;->delete()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1467
    const-string v0, "ProgressService"

    const-string v1, "file delete sccess!"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    .line 1470
    :cond_0
    const-string v0, "ProgressService"

    const-string v1, "file not exist or error! file delete fail!"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 1472
    :goto_1
    goto :goto_2

    .line 1474
    :cond_1
    const-string v0, "ProgressService"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "file path is empty or null: mLogUploadInfo.getFilepath()):"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 1475
    invoke-virtual {p1}, Lcom/huawei/logupload/LogUpload;->i()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 1474
    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 1478
    :goto_2
    invoke-virtual {p1}, Lcom/huawei/logupload/LogUpload;->y()Ljava/lang/String;

    move-result-object v4

    .line 1479
    const-string v0, "ProgressService"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "encryfilePath"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 1480
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 1481
    new-instance v5, Ljava/io/File;

    invoke-direct {v5, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 1482
    const-string v0, "ProgressService"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "encryfilePath"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v5}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 1484
    invoke-virtual {v5}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {v5}, Ljava/io/File;->delete()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1486
    const-string v0, "ProgressService"

    const-string v1, "file delete success!"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_3

    .line 1488
    :cond_2
    const-string v0, "ProgressService"

    const-string v1, "file not exist or error! file delete fail!"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 1491
    :cond_3
    :goto_3
    return-void
.end method

.method private b(Lcom/huawei/logupload/LogUpload;Landroid/content/Intent;)V
    .locals 4

    .line 412
    const-string v0, "ProgressService"

    const-string v1, "com.example.logupload.progressSmall"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 415
    sget-object v0, Lcom/huawei/feedback/component/ProgressService;->x:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/huawei/logupload/LogUpload;->E()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 421
    iget-object v0, p0, Lcom/huawei/feedback/component/ProgressService;->b:Landroid/os/Handler;

    new-instance v1, Lcom/huawei/feedback/component/e;

    invoke-direct {v1, p0, p1}, Lcom/huawei/feedback/component/e;-><init>(Lcom/huawei/feedback/component/ProgressService;Lcom/huawei/logupload/LogUpload;)V

    const-wide/16 v2, 0x1f4

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 502
    :cond_0
    return-void
.end method

.method private b(Ljava/lang/String;)V
    .locals 0

    .line 125
    invoke-static {p1}, Lcom/huawei/feedback/component/ProgressService;->a(Ljava/lang/String;)V

    .line 126
    return-void
.end method

.method static synthetic c(Lcom/huawei/feedback/component/ProgressService;)Lcom/huawei/feedback/component/ProgressService$ProgressPauseReceiver;
    .locals 1

    .line 54
    iget-object v0, p0, Lcom/huawei/feedback/component/ProgressService;->r:Lcom/huawei/feedback/component/ProgressService$ProgressPauseReceiver;

    return-object v0
.end method

.method static synthetic c(Lcom/huawei/feedback/component/ProgressService;Lcom/huawei/logupload/LogUpload;)Lcom/huawei/logupload/LogUpload;
    .locals 0

    .line 54
    iput-object p1, p0, Lcom/huawei/feedback/component/ProgressService;->y:Lcom/huawei/logupload/LogUpload;

    return-object p1
.end method

.method private c(Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    .line 1259
    const-string v3, ""

    .line 1260
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 1261
    const-string v0, ","

    invoke-virtual {p1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v4

    .line 1263
    array-length v0, v4

    const/4 v1, 0x2

    if-lt v0, v1, :cond_0

    const/4 v0, 0x1

    aget-object v0, v4, v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v5, 0x1

    goto :goto_0

    :cond_0
    const/4 v5, 0x0

    .line 1264
    :goto_0
    if-eqz v5, :cond_1

    .line 1265
    const/4 v0, 0x1

    aget-object v0, v4, v0

    const/4 v1, 0x1

    aget-object v1, v4, v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    .line 1268
    :cond_1
    goto :goto_1

    .line 1269
    :cond_2
    const-string v3, "0"

    .line 1271
    :goto_1
    return-object v3
.end method

.method public static c()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/logupload/LogUpload;>;"
        }
    .end annotation

    .line 140
    sget-object v0, Lcom/huawei/feedback/component/ProgressService;->t:Ljava/util/List;

    return-object v0
.end method

.method private c(Lcom/huawei/logupload/LogUpload;)V
    .locals 15

    .line 1118
    const/4 v0, 0x0

    move-object/from16 v1, p1

    if-eq v0, v1, :cond_0

    .line 1119
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/logupload/LogUpload;->C()I

    move-result v0

    const/16 v1, 0x8

    if-ne v0, v1, :cond_1

    .line 1120
    :cond_0
    return-void

    .line 1122
    :cond_1
    const-string v0, "ProgressService"

    const-string v1, "updateNotification"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 1127
    move-object/from16 v0, p1

    invoke-direct {p0, v0}, Lcom/huawei/feedback/component/ProgressService;->e(Lcom/huawei/logupload/LogUpload;)I

    move-result v5

    .line 1139
    move-object/from16 v0, p1

    invoke-direct {p0, v0}, Lcom/huawei/feedback/component/ProgressService;->d(Lcom/huawei/logupload/LogUpload;)Ljava/lang/String;

    move-result-object v6

    .line 1140
    const-string v0, "ProgressService"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "isPause = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 1144
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/logupload/LogUpload;->w()Ljava/lang/String;

    move-result-object v7

    .line 1145
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/logupload/LogUpload;->k()J

    move-result-wide v8

    .line 1146
    invoke-direct {p0, v7}, Lcom/huawei/feedback/component/ProgressService;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 1147
    const-string v10, ""

    .line 1149
    :try_start_0
    invoke-static {v7}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v11

    .line 1153
    const/4 v12, 0x0

    .line 1154
    const-wide/16 v0, 0x0

    cmp-long v0, v8, v0

    if-lez v0, :cond_3

    .line 1155
    int-to-float v0, v11

    long-to-float v1, v8

    div-float v13, v0, v1

    .line 1156
    const/high16 v0, 0x42c80000    # 100.0f

    mul-float/2addr v0, v13

    float-to-int v12, v0

    .line 1157
    const-string v0, "2"

    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1161
    invoke-virtual {p0}, Lcom/huawei/feedback/component/ProgressService;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-static {}, Lcom/huawei/feedback/FeedbackApi;->getApplicationcontext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "feedback_advanced_logupload_fail"

    invoke-static {v1, v2}, Lcom/huawei/feedback/f;->b(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v10

    goto :goto_0

    .line 1170
    :cond_2
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    .line 1171
    invoke-virtual {p0}, Lcom/huawei/feedback/component/ProgressService;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    .line 1172
    invoke-static {}, Lcom/huawei/feedback/FeedbackApi;->getApplicationcontext()Landroid/content/Context;

    move-result-object v2

    const-string v3, "feedback_advanced_loguploading"

    .line 1171
    invoke-static {v2, v3}, Lcom/huawei/feedback/f;->b(Landroid/content/Context;Ljava/lang/String;)I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "%"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    .line 1170
    invoke-static {v0, v1, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v10

    .line 1181
    :cond_3
    :goto_0
    iget-object v0, p0, Lcom/huawei/feedback/component/ProgressService;->m:Ljava/util/Map;

    invoke-virtual/range {p1 .. p1}, Lcom/huawei/logupload/LogUpload;->j()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Landroid/a/a/a/d$d;

    .line 1182
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    .line 1183
    invoke-virtual {p0}, Lcom/huawei/feedback/component/ProgressService;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    .line 1184
    invoke-static {}, Lcom/huawei/feedback/FeedbackApi;->getApplicationcontext()Landroid/content/Context;

    move-result-object v2

    const-string v3, "feedback_advanced_loguploading"

    invoke-static {v2, v3}, Lcom/huawei/feedback/f;->b(Landroid/content/Context;Ljava/lang/String;)I

    move-result v2

    .line 1183
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "%"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    .line 1182
    invoke-static {v0, v1, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v13, v0}, Landroid/a/a/a/d$d;->e(Ljava/lang/CharSequence;)Landroid/a/a/a/d$d;

    .line 1187
    invoke-virtual {v13, v10}, Landroid/a/a/a/d$d;->b(Ljava/lang/CharSequence;)Landroid/a/a/a/d$d;

    .line 1188
    invoke-virtual {v13}, Landroid/a/a/a/d$d;->c()Landroid/app/Notification;

    move-result-object v14

    .line 1190
    iget-object v0, p0, Lcom/huawei/feedback/component/ProgressService;->l:Landroid/app/NotificationManager;

    invoke-virtual {v0, v5, v14}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V

    .line 1192
    iget-object v0, p0, Lcom/huawei/feedback/component/ProgressService;->n:Ljava/util/Map;

    invoke-virtual/range {p1 .. p1}, Lcom/huawei/logupload/LogUpload;->j()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    move-object/from16 v2, p1

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1196
    const/16 v0, 0x64

    if-ne v12, v0, :cond_4

    .line 1198
    iget-object v0, p0, Lcom/huawei/feedback/component/ProgressService;->b:Landroid/os/Handler;

    new-instance v1, Lcom/huawei/feedback/component/f;

    move-object/from16 v2, p1

    invoke-direct {v1, p0, v5, v2}, Lcom/huawei/feedback/component/f;-><init>(Lcom/huawei/feedback/component/ProgressService;ILcom/huawei/logupload/LogUpload;)V

    const-wide/16 v2, 0x1f4

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1220
    :cond_4
    goto :goto_1

    .line 1218
    :catch_0
    move-exception v11

    .line 1219
    const-string v0, "ProgressService"

    const-string v1, "NumberFormatException"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 1222
    :goto_1
    return-void
.end method

.method static synthetic d(Lcom/huawei/feedback/component/ProgressService;Lcom/huawei/logupload/LogUpload;)I
    .locals 1

    .line 54
    invoke-direct {p0, p1}, Lcom/huawei/feedback/component/ProgressService;->e(Lcom/huawei/logupload/LogUpload;)I

    move-result v0

    return v0
.end method

.method static synthetic d(Lcom/huawei/feedback/component/ProgressService;)Lcom/huawei/feedback/component/ProgressService$ProgressCancelReceiver;
    .locals 1

    .line 54
    iget-object v0, p0, Lcom/huawei/feedback/component/ProgressService;->q:Lcom/huawei/feedback/component/ProgressService$ProgressCancelReceiver;

    return-object v0
.end method

.method static synthetic d()Lcom/huawei/logupload/a;
    .locals 1

    .line 54
    sget-object v0, Lcom/huawei/feedback/component/ProgressService;->s:Lcom/huawei/logupload/a;

    return-object v0
.end method

.method private d(Lcom/huawei/logupload/LogUpload;)Ljava/lang/String;
    .locals 4

    .line 1275
    const-string v0, "ProgressService"

    const-string v1, "findSelfInList"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 1276
    const-string v2, ""

    .line 1278
    :try_start_0
    sget-object v0, Lcom/huawei/feedback/component/ProgressService;->s:Lcom/huawei/logupload/a;

    invoke-interface {v0, p1}, Lcom/huawei/logupload/a;->b(Lcom/huawei/logupload/LogUpload;)Ljava/lang/String;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v2, v0

    .line 1282
    goto :goto_0

    .line 1279
    :catch_0
    move-exception v3

    .line 1281
    const-string v0, "ProgressService"

    const-string v1, "findSelfInList(): RemoteException"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 1283
    :goto_0
    return-object v2
.end method

.method private e(Lcom/huawei/logupload/LogUpload;)I
    .locals 8

    .line 1392
    invoke-virtual {p1}, Lcom/huawei/logupload/LogUpload;->g()J

    move-result-wide v3

    .line 1393
    const/4 v5, 0x0

    .line 1394
    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v6

    .line 1395
    const-string v0, "ProgressService"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "noticationIdTemp:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 1396
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v7

    .line 1397
    const/16 v0, 0x9

    if-le v7, v0, :cond_0

    .line 1398
    .line 1399
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, -0x9

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v1

    .line 1398
    invoke-virtual {v6, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v6

    .line 1400
    const-string v0, "ProgressService"

    invoke-static {v0, v6}, Lcom/huawei/phoneserviceuni/common/e/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 1403
    :cond_0
    invoke-static {v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v5

    .line 1404
    return v5
.end method

.method static synthetic e(Lcom/huawei/feedback/component/ProgressService;)Landroid/app/NotificationManager;
    .locals 1

    .line 54
    iget-object v0, p0, Lcom/huawei/feedback/component/ProgressService;->l:Landroid/app/NotificationManager;

    return-object v0
.end method

.method static synthetic e()Ljava/util/List;
    .locals 1

    .line 54
    sget-object v0, Lcom/huawei/feedback/component/ProgressService;->t:Ljava/util/List;

    return-object v0
.end method

.method static synthetic f(Lcom/huawei/feedback/component/ProgressService;)Lcom/huawei/logupload/LogUpload;
    .locals 1

    .line 54
    iget-object v0, p0, Lcom/huawei/feedback/component/ProgressService;->y:Lcom/huawei/logupload/LogUpload;

    return-object v0
.end method

.method static synthetic f()Ljava/lang/String;
    .locals 1

    .line 54
    sget-object v0, Lcom/huawei/feedback/component/ProgressService;->x:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic g(Lcom/huawei/feedback/component/ProgressService;)Ljava/util/Map;
    .locals 1

    .line 54
    iget-object v0, p0, Lcom/huawei/feedback/component/ProgressService;->m:Ljava/util/Map;

    return-object v0
.end method

.method private g()V
    .locals 9

    .line 505
    const/4 v3, 0x0

    .line 506
    sget-object v0, Lcom/huawei/feedback/component/ProgressService;->s:Lcom/huawei/logupload/a;

    if-eqz v0, :cond_0

    .line 508
    :try_start_0
    sget-object v0, Lcom/huawei/feedback/component/ProgressService;->s:Lcom/huawei/logupload/a;

    invoke-interface {v0}, Lcom/huawei/logupload/a;->a()Ljava/util/List;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v3, v0

    .line 511
    goto :goto_0

    .line 509
    :catch_0
    move-exception v4

    .line 510
    const-string v0, "ProgressService"

    const-string v1, "dealexceptionResume()\uff1aexternal queryAllRecord RemoteException"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 514
    :cond_0
    :goto_0
    if-eqz v3, :cond_3

    .line 515
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/logupload/LogUpload;

    .line 518
    sget-object v0, Lcom/huawei/feedback/component/ProgressService;->x:Ljava/lang/String;

    invoke-virtual {v5}, Lcom/huawei/logupload/LogUpload;->E()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 519
    const-string v0, "1"

    invoke-virtual {v5}, Lcom/huawei/logupload/LogUpload;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 521
    const-string v0, "2"

    invoke-virtual {v5, v0}, Lcom/huawei/logupload/LogUpload;->d(Ljava/lang/String;)V

    .line 523
    invoke-virtual {v5}, Lcom/huawei/logupload/LogUpload;->w()Ljava/lang/String;

    move-result-object v7

    .line 524
    invoke-virtual {v5}, Lcom/huawei/logupload/LogUpload;->j()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    invoke-static {v0, v1}, Lcom/huawei/feedback/logic/f;->a(Ljava/lang/String;I)V

    .line 527
    :try_start_1
    sget-object v0, Lcom/huawei/feedback/component/ProgressService;->s:Lcom/huawei/logupload/a;

    invoke-interface {v0, v5}, Lcom/huawei/logupload/a;->a(Lcom/huawei/logupload/LogUpload;)Z

    move-result v6

    .line 528
    const-string v0, "ProgressService"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "updateStatus flag:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 532
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 533
    const-string v0, "ProgressService"

    const-string v1, "dealexceptionResume contentRanger is notEmpty updateNotification"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 534
    invoke-direct {p0, v5}, Lcom/huawei/feedback/component/ProgressService;->c(Lcom/huawei/logupload/LogUpload;)V

    goto :goto_2

    .line 536
    :cond_1
    const-string v0, "ProgressService"

    const-string v1, "dealexceptionResume createNotification"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 537
    invoke-direct {p0, v5}, Lcom/huawei/feedback/component/ProgressService;->b(Lcom/huawei/logupload/LogUpload;)V

    .line 538
    const-string v0, "ProgressService"

    const-string v1, "dealexceptionResume updateNotification"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 539
    invoke-direct {p0, v5}, Lcom/huawei/feedback/component/ProgressService;->c(Lcom/huawei/logupload/LogUpload;)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_1

    .line 544
    :goto_2
    goto :goto_3

    .line 542
    :catch_1
    move-exception v8

    .line 543
    const-string v0, "ProgressService"

    const-string v1, "updateNotification RemoteException e"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 549
    :cond_2
    :goto_3
    goto/16 :goto_1

    .line 551
    :cond_3
    return-void
.end method

.method static synthetic h(Lcom/huawei/feedback/component/ProgressService;)Ljava/util/Map;
    .locals 1

    .line 54
    iget-object v0, p0, Lcom/huawei/feedback/component/ProgressService;->n:Ljava/util/Map;

    return-object v0
.end method

.method private h()Z
    .locals 6

    .line 798
    const/4 v2, 0x0

    .line 799
    sget-object v0, Lcom/huawei/feedback/component/ProgressService;->s:Lcom/huawei/logupload/a;

    if-eqz v0, :cond_0

    .line 801
    :try_start_0
    sget-object v0, Lcom/huawei/feedback/component/ProgressService;->s:Lcom/huawei/logupload/a;

    invoke-interface {v0}, Lcom/huawei/logupload/a;->a()Ljava/util/List;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v2, v0

    .line 805
    goto :goto_0

    .line 803
    :catch_0
    move-exception v3

    .line 804
    const-string v0, "ProgressService"

    const-string v1, "isFeedbackLogExist()\uff1aexternal queryAllRecord RemoteException"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 808
    :cond_0
    :goto_0
    const/4 v3, 0x0

    .line 809
    if-eqz v2, :cond_2

    .line 810
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/logupload/LogUpload;

    .line 811
    sget-object v0, Lcom/huawei/feedback/component/ProgressService;->x:Ljava/lang/String;

    invoke-virtual {v5}, Lcom/huawei/logupload/LogUpload;->E()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 812
    const/4 v3, 0x1

    .line 813
    goto :goto_2

    .line 815
    :cond_1
    goto :goto_1

    .line 817
    :cond_2
    :goto_2
    return v3
.end method

.method private i()Landroid/graphics/Bitmap;
    .locals 5

    .line 877
    invoke-virtual {p0}, Lcom/huawei/feedback/component/ProgressService;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v2

    .line 878
    const/4 v3, 0x0

    .line 880
    :try_start_0
    invoke-virtual {p0}, Lcom/huawei/feedback/component/ProgressService;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/content/pm/PackageManager;->getApplicationIcon(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v4

    .line 881
    move-object v0, v4

    check-cast v0, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v0

    move-object v3, v0

    .line 886
    goto :goto_0

    .line 882
    :catch_0
    move-exception v4

    .line 883
    const-string v0, "ProgressService"

    const-string v1, "getNotifyLargeIcon --OutOfMemoryError"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 886
    goto :goto_0

    .line 884
    :catch_1
    move-exception v4

    .line 885
    const-string v0, "ProgressService"

    const-string v1, "getNotifyLargeIcon Exception--"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 887
    :goto_0
    return-object v3
.end method

.method static synthetic i(Lcom/huawei/feedback/component/ProgressService;)V
    .locals 0

    .line 54
    invoke-direct {p0}, Lcom/huawei/feedback/component/ProgressService;->j()V

    return-void
.end method

.method static synthetic j(Lcom/huawei/feedback/component/ProgressService;)Landroid/app/AlertDialog;
    .locals 1

    .line 54
    iget-object v0, p0, Lcom/huawei/feedback/component/ProgressService;->v:Landroid/app/AlertDialog;

    return-object v0
.end method

.method private j()V
    .locals 5

    .line 1290
    const-string v0, "statusbar"

    invoke-virtual {p0, v0}, Lcom/huawei/feedback/component/ProgressService;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    .line 1293
    const-string v0, "android.app.StatusBarManager"

    :try_start_0
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v3

    .line 1294
    const/4 v4, 0x0

    .line 1295
    if-eqz v2, :cond_0

    .line 1302
    const-string v0, "collapsePanels"

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Class;

    invoke-virtual {v3, v0, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v4

    .line 1305
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Ljava/lang/reflect/Method;->setAccessible(Z)V

    .line 1307
    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    invoke-virtual {v4, v2, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_4

    .line 1324
    :cond_0
    goto :goto_0

    .line 1309
    :catch_0
    move-exception v4

    .line 1311
    const-string v0, "ProgressService"

    const-string v1, "ClassNotFoundException"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 1324
    goto :goto_0

    .line 1312
    :catch_1
    move-exception v4

    .line 1314
    const-string v0, "ProgressService"

    const-string v1, "NoSuchMethodException"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 1324
    goto :goto_0

    .line 1315
    :catch_2
    move-exception v4

    .line 1317
    const-string v0, "ProgressService"

    const-string v1, "IllegalAccessException"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 1324
    goto :goto_0

    .line 1318
    :catch_3
    move-exception v4

    .line 1320
    const-string v0, "ProgressService"

    const-string v1, "IllegalArgumentException"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 1324
    goto :goto_0

    .line 1321
    :catch_4
    move-exception v4

    .line 1323
    const-string v0, "ProgressService"

    const-string v1, "InvocationTargetException"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 1325
    :goto_0
    return-void
.end method

.method static synthetic k(Lcom/huawei/feedback/component/ProgressService;)Z
    .locals 1

    .line 54
    invoke-direct {p0}, Lcom/huawei/feedback/component/ProgressService;->h()Z

    move-result v0

    return v0
.end method


# virtual methods
.method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 1

    .line 136
    const/4 v0, 0x0

    return-object v0
.end method

.method public onCreate()V
    .locals 4

    .line 288
    const-string v0, "ProgressService"

    const-string v1, "onCreate"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 289
    const-string v0, "notification"

    invoke-virtual {p0, v0}, Lcom/huawei/feedback/component/ProgressService;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/NotificationManager;

    iput-object v0, p0, Lcom/huawei/feedback/component/ProgressService;->l:Landroid/app/NotificationManager;

    .line 290
    invoke-static {p0}, Lcom/huawei/phoneserviceuni/common/e/f;->h(Landroid/content/Context;)I

    move-result v0

    invoke-super {p0, v0}, Landroid/app/Service;->setTheme(I)V

    .line 294
    :try_start_0
    invoke-static {}, Lcom/huawei/feedback/FeedbackApi;->getLogCollectManager()Lcom/huawei/lcagent/client/LogCollectManager;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/feedback/component/ProgressService;->u:Lcom/huawei/lcagent/client/LogCollectManager;

    .line 295
    iget-object v0, p0, Lcom/huawei/feedback/component/ProgressService;->u:Lcom/huawei/lcagent/client/LogCollectManager;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 297
    new-instance v0, Lcom/huawei/lcagent/client/LogCollectManager;

    invoke-virtual {p0}, Lcom/huawei/feedback/component/ProgressService;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/huawei/lcagent/client/LogCollectManager;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/feedback/component/ProgressService;->u:Lcom/huawei/lcagent/client/LogCollectManager;
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 303
    :cond_0
    goto :goto_0

    .line 300
    :catch_0
    move-exception v2

    .line 302
    const-string v0, "ProgressService"

    const-string v1, "The init of the object logCollectManager is SecurityException!"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 305
    :goto_0
    invoke-virtual {p0}, Lcom/huawei/feedback/component/ProgressService;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    .line 306
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 308
    invoke-direct {p0, v2}, Lcom/huawei/feedback/component/ProgressService;->b(Ljava/lang/String;)V

    goto :goto_1

    .line 312
    :cond_1
    const-string v0, "ProgressService"

    const-string v1, "packagename null!"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 315
    :goto_1
    new-instance v3, Landroid/content/Intent;

    invoke-direct {v3}, Landroid/content/Intent;-><init>()V

    .line 316
    const-string v0, "com.huawei.logupload.ExternalOperService"

    invoke-virtual {v3, p0, v0}, Landroid/content/Intent;->setClassName(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    .line 317
    const-string v0, "com.huawei.logupload.ExternalOperService"

    invoke-virtual {v3, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 323
    iget-object v0, p0, Lcom/huawei/feedback/component/ProgressService;->a:Landroid/content/ServiceConnection;

    const/4 v1, 0x1

    invoke-virtual {p0, v3, v0, v1}, Lcom/huawei/feedback/component/ProgressService;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/feedback/component/ProgressService;->w:Z

    .line 328
    invoke-super {p0}, Landroid/app/Service;->onCreate()V

    .line 329
    return-void
.end method

.method public onDestroy()V
    .locals 3

    .line 244
    const-string v0, "ProgressService"

    const-string v1, "onDestroy"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 249
    iget-boolean v0, p0, Lcom/huawei/feedback/component/ProgressService;->w:Z

    if-eqz v0, :cond_0

    .line 250
    iget-object v0, p0, Lcom/huawei/feedback/component/ProgressService;->a:Landroid/content/ServiceConnection;

    invoke-virtual {p0, v0}, Lcom/huawei/feedback/component/ProgressService;->unbindService(Landroid/content/ServiceConnection;)V

    .line 251
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/feedback/component/ProgressService;->w:Z

    .line 261
    :cond_0
    const-string v0, "ProgressService"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "CommonConstants.getReceiverHasRegisted():"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {}, Lcom/huawei/feedback/d;->b()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 262
    invoke-static {}, Lcom/huawei/feedback/d;->b()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 263
    iget-object v0, p0, Lcom/huawei/feedback/component/ProgressService;->o:Lcom/huawei/feedback/component/ProgressService$ProgressReceiver;

    invoke-virtual {p0, v0}, Lcom/huawei/feedback/component/ProgressService;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    goto :goto_0

    .line 264
    :cond_1
    invoke-static {}, Lcom/huawei/feedback/d;->b()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_2

    .line 265
    iget-object v0, p0, Lcom/huawei/feedback/component/ProgressService;->o:Lcom/huawei/feedback/component/ProgressService$ProgressReceiver;

    invoke-virtual {p0, v0}, Lcom/huawei/feedback/component/ProgressService;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 266
    iget-object v0, p0, Lcom/huawei/feedback/component/ProgressService;->p:Lcom/huawei/feedback/component/ProgressService$ProgressStartReceiver;

    invoke-virtual {p0, v0}, Lcom/huawei/feedback/component/ProgressService;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    goto :goto_0

    .line 267
    :cond_2
    invoke-static {}, Lcom/huawei/feedback/d;->b()I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_3

    .line 268
    iget-object v0, p0, Lcom/huawei/feedback/component/ProgressService;->o:Lcom/huawei/feedback/component/ProgressService$ProgressReceiver;

    invoke-virtual {p0, v0}, Lcom/huawei/feedback/component/ProgressService;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 269
    iget-object v0, p0, Lcom/huawei/feedback/component/ProgressService;->p:Lcom/huawei/feedback/component/ProgressService$ProgressStartReceiver;

    invoke-virtual {p0, v0}, Lcom/huawei/feedback/component/ProgressService;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 270
    iget-object v0, p0, Lcom/huawei/feedback/component/ProgressService;->r:Lcom/huawei/feedback/component/ProgressService$ProgressPauseReceiver;

    invoke-virtual {p0, v0}, Lcom/huawei/feedback/component/ProgressService;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    goto :goto_0

    .line 271
    :cond_3
    invoke-static {}, Lcom/huawei/feedback/d;->b()I

    move-result v0

    const/4 v1, 0x4

    if-ne v0, v1, :cond_4

    .line 272
    iget-object v0, p0, Lcom/huawei/feedback/component/ProgressService;->o:Lcom/huawei/feedback/component/ProgressService$ProgressReceiver;

    invoke-virtual {p0, v0}, Lcom/huawei/feedback/component/ProgressService;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 273
    iget-object v0, p0, Lcom/huawei/feedback/component/ProgressService;->p:Lcom/huawei/feedback/component/ProgressService$ProgressStartReceiver;

    invoke-virtual {p0, v0}, Lcom/huawei/feedback/component/ProgressService;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 274
    iget-object v0, p0, Lcom/huawei/feedback/component/ProgressService;->r:Lcom/huawei/feedback/component/ProgressService$ProgressPauseReceiver;

    invoke-virtual {p0, v0}, Lcom/huawei/feedback/component/ProgressService;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 275
    iget-object v0, p0, Lcom/huawei/feedback/component/ProgressService;->q:Lcom/huawei/feedback/component/ProgressService$ProgressCancelReceiver;

    invoke-virtual {p0, v0}, Lcom/huawei/feedback/component/ProgressService;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 277
    :cond_4
    :goto_0
    const/4 v0, 0x0

    invoke-static {v0}, Lcom/huawei/feedback/d;->a(I)V

    .line 282
    invoke-super {p0}, Landroid/app/Service;->onDestroy()V

    .line 283
    return-void
.end method

.method public onStartCommand(Landroid/content/Intent;II)I
    .locals 2

    .line 1440
    const-string v0, "ProgressService"

    const-string v1, "onStartCommand"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 1441
    const/4 v0, 0x2

    return v0
.end method
