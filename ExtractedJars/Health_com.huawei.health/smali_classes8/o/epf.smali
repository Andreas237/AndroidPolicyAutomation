.class public Lo/epf;
.super Lo/epg;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Lo/dui;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/epf$d;,
        Lo/epf$e;
    }
.end annotation


# static fields
.field private static J:Z

.field private static K:Z

.field private static s:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<Ljava/lang/Integer;Ljava/lang/Integer;>;"
        }
    .end annotation
.end field

.field private static t:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<Ljava/lang/Integer;Ljava/lang/Integer;>;"
        }
    .end annotation
.end field


# instance fields
.field private A:I

.field private B:Ljava/lang/Boolean;

.field private C:Landroid/content/BroadcastReceiver;

.field private D:Ljava/lang/String;

.field private E:Ljava/lang/String;

.field private F:Ljava/lang/Boolean;

.field private G:Ljava/lang/Boolean;

.field private H:I

.field private I:Ljava/lang/String;

.field private L:Z

.field private M:Ljava/lang/String;

.field private N:Z

.field private final P:Landroid/content/BroadcastReceiver;

.field protected a:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lo/afj;>;"
        }
    .end annotation
.end field

.field private d:Lo/epi;

.field e:Lcom/huawei/up/callback/CommonCallback;

.field private f:Landroid/os/Handler;

.field private g:Landroid/support/v4/content/LocalBroadcastManager;

.field private h:Ljava/util/concurrent/ExecutorService;

.field private j:Ljava/lang/String;

.field private k:I

.field private l:Z

.field private m:Z

.field private n:Lo/egv;

.field private o:Ljava/lang/String;

.field private p:I

.field private q:Lo/dwr;

.field private r:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field private u:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lo/afa;>;"
        }
    .end annotation
.end field

.field private final v:Landroid/content/BroadcastReceiver;

.field private w:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lo/ahh;>;"
        }
    .end annotation
.end field

.field private x:Lo/acl$a;

.field private final y:Landroid/content/BroadcastReceiver;

.field private final z:Landroid/content/BroadcastReceiver;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 169
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lo/epf;->s:Ljava/util/HashMap;

    .line 170
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lo/epf;->t:Ljava/util/HashMap;

    .line 1166
    const/4 v0, 0x0

    sput-boolean v0, Lo/epf;->K:Z

    .line 1167
    const/4 v0, 0x0

    sput-boolean v0, Lo/epf;->J:Z

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 174
    invoke-direct {p0, p1}, Lo/epg;-><init>(Landroid/content/Context;)V

    .line 151
    const/4 v0, 0x0

    iput v0, p0, Lo/epf;->k:I

    .line 152
    const/4 v0, 0x0

    iput v0, p0, Lo/epf;->p:I

    .line 153
    const/4 v0, 0x0

    iput-object v0, p0, Lo/epf;->o:Ljava/lang/String;

    .line 155
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/epf;->m:Z

    .line 156
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/epf;->l:Z

    .line 164
    const/4 v0, 0x0

    iput-object v0, p0, Lo/epf;->n:Lo/egv;

    .line 215
    new-instance v0, Lo/epf$e;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/epf$e;-><init>(Lo/epf$4;)V

    iput-object v0, p0, Lo/epf;->r:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 524
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/epf;->u:Ljava/util/ArrayList;

    .line 525
    sget-object v0, Lo/acl$a;->b:Lo/acl$a;

    iput-object v0, p0, Lo/epf;->x:Lo/acl$a;

    .line 526
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/epf;->w:Ljava/util/ArrayList;

    .line 527
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/epf;->a:Ljava/util/ArrayList;

    .line 662
    new-instance v0, Lo/epf$15;

    invoke-direct {v0, p0}, Lo/epf$15;-><init>(Lo/epf;)V

    iput-object v0, p0, Lo/epf;->y:Landroid/content/BroadcastReceiver;

    .line 732
    new-instance v0, Lo/epf$11;

    invoke-direct {v0, p0}, Lo/epf$11;-><init>(Lo/epf;)V

    iput-object v0, p0, Lo/epf;->z:Landroid/content/BroadcastReceiver;

    .line 809
    new-instance v0, Lo/epf$14;

    invoke-direct {v0, p0}, Lo/epf$14;-><init>(Lo/epf;)V

    iput-object v0, p0, Lo/epf;->v:Landroid/content/BroadcastReceiver;

    .line 1118
    new-instance v0, Lo/epf$13;

    invoke-direct {v0, p0}, Lo/epf$13;-><init>(Lo/epf;)V

    iput-object v0, p0, Lo/epf;->C:Landroid/content/BroadcastReceiver;

    .line 1130
    new-instance v0, Lo/epf$17;

    invoke-direct {v0, p0}, Lo/epf$17;-><init>(Lo/epf;)V

    iput-object v0, p0, Lo/epf;->e:Lcom/huawei/up/callback/CommonCallback;

    .line 1147
    const-string v0, ""

    iput-object v0, p0, Lo/epf;->j:Ljava/lang/String;

    .line 1148
    const/4 v0, 0x0

    iput v0, p0, Lo/epf;->A:I

    .line 1149
    const-string v0, ""

    iput-object v0, p0, Lo/epf;->D:Ljava/lang/String;

    .line 1150
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lo/epf;->B:Ljava/lang/Boolean;

    .line 1152
    const-string v0, ""

    iput-object v0, p0, Lo/epf;->I:Ljava/lang/String;

    .line 1153
    const/4 v0, 0x0

    iput v0, p0, Lo/epf;->H:I

    .line 1154
    const-string v0, ""

    iput-object v0, p0, Lo/epf;->E:Ljava/lang/String;

    .line 1155
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lo/epf;->G:Ljava/lang/Boolean;

    .line 1157
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lo/epf;->F:Ljava/lang/Boolean;

    .line 1160
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/epf;->L:Z

    .line 1162
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/epf;->N:Z

    .line 1170
    const/4 v0, 0x0

    iput-object v0, p0, Lo/epf;->M:Ljava/lang/String;

    .line 1171
    new-instance v0, Lo/epf$19;

    invoke-direct {v0, p0}, Lo/epf$19;-><init>(Lo/epf;)V

    iput-object v0, p0, Lo/epf;->P:Landroid/content/BroadcastReceiver;

    .line 176
    new-instance v0, Lo/epf$d;

    invoke-direct {v0, p0}, Lo/epf$d;-><init>(Lo/epf;)V

    iput-object v0, p0, Lo/epf;->f:Landroid/os/Handler;

    .line 177
    invoke-direct {p0}, Lo/epf;->r()V

    .line 178
    invoke-direct {p0}, Lo/epf;->z()V

    .line 180
    invoke-direct {p0}, Lo/epf;->q()V

    .line 181
    invoke-direct {p0}, Lo/epf;->A()V

    .line 182
    invoke-direct {p0}, Lo/epf;->w()V

    .line 184
    return-void
.end method

.method private A()V
    .locals 6

    .line 1089
    iget-object v0, p0, Lo/epf;->b:Landroid/content/Context;

    invoke-static {v0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v4

    .line 1090
    new-instance v5, Landroid/content/IntentFilter;

    invoke-direct {v5}, Landroid/content/IntentFilter;-><init>()V

    .line 1091
    const-string v0, "com.huawei.hihealth.action_data_refresh"

    invoke-virtual {v5, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 1092
    if-eqz v4, :cond_0

    .line 1093
    iget-object v0, p0, Lo/epf;->C:Landroid/content/BroadcastReceiver;

    invoke-virtual {v4, v0, v5}, Landroid/support/v4/content/LocalBroadcastManager;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V

    .line 1094
    const-string v0, "UIHLH_AchievementCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "registe HiBroadcasetReceiver"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 1096
    :cond_0
    const-string v0, "UIHLH_AchievementCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mLocalBroadcastManager null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1099
    :goto_0
    return-void
.end method

.method private B()V
    .locals 4

    .line 1467
    iget-object v0, p0, Lo/epf;->F:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1468
    const-string v0, "UIHLH_AchievementCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter checkIsNeedShowDialog isNeedShowDialog"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1470
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dqi;->b(Landroid/content/Context;)Lo/dqi;

    move-result-object v0

    const-string v1, "wlan_auto_update"

    new-instance v2, Lo/epf$2;

    invoke-direct {v2, p0}, Lo/epf$2;-><init>(Lo/epf;)V

    invoke-virtual {v0, v1, v2}, Lo/dqi;->a(Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 1517
    :cond_0
    return-void
.end method

.method private C()V
    .locals 5

    .line 1380
    const-string v0, "UIHLH_AchievementCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startOpenSystemMusic"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1382
    :try_start_0
    new-instance v4, Landroid/content/Intent;

    const-string v0, "android.intent.action.MUSIC_PLAYER"

    invoke-direct {v4, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 1383
    const/high16 v0, 0x10000000

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 1384
    iget-object v0, p0, Lo/epf;->b:Landroid/content/Context;

    invoke-virtual {v0, v4}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1387
    goto :goto_0

    .line 1385
    :catch_0
    move-exception v4

    .line 1386
    const-string v0, "UIHLH_AchievementCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startOpenSystemMusic error!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1388
    :goto_0
    return-void
.end method

.method private D()V
    .locals 2

    .line 898
    const-string v0, "UIHLH_AchievementCardData"

    const-string v1, "refreshUserLevelData"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 900
    iget-object v0, p0, Lo/epf;->h:Ljava/util/concurrent/ExecutorService;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 901
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lo/epf;->h:Ljava/util/concurrent/ExecutorService;

    .line 904
    :cond_0
    iget-object v0, p0, Lo/epf;->h:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lo/epf$12;

    invoke-direct {v1, p0}, Lo/epf$12;-><init>(Lo/epf;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 946
    return-void
.end method

.method private E()Z
    .locals 6

    .line 1595
    iget-object v0, p0, Lo/epf;->b:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "dialog_show_time"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 1597
    const-string v0, "UIHLH_AchievementCardData"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "countShowTimes: number = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1598
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1599
    const/4 v0, 0x0

    return v0

    .line 1601
    :cond_0
    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v5

    .line 1602
    const/4 v0, 0x2

    if-lt v5, v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private F()Z
    .locals 8

    .line 1576
    iget-object v0, p0, Lo/epf;->b:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "sp_dialog_check_time"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 1578
    const-string v0, "UIHLH_AchievementCardData"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isEnableDialog: strLastTime = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1579
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1580
    const/4 v0, 0x1

    return v0

    .line 1582
    :cond_0
    invoke-static {v4}, Lo/dpk;->b(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v5

    .line 1583
    const/4 v0, 0x0

    if-ne v0, v5, :cond_1

    .line 1584
    const/4 v0, 0x1

    return v0

    .line 1586
    :cond_1
    invoke-virtual {v5}, Ljava/util/Date;->getTime()J

    move-result-wide v6

    .line 1587
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sub-long/2addr v0, v6

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

.method private G()V
    .locals 5

    .line 1523
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/enz;->b(Landroid/content/Context;)Lo/enz;

    move-result-object v4

    .line 1524
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    invoke-virtual {v4}, Lo/enz;->b()Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 1525
    invoke-virtual {v4}, Lo/enz;->b()Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportMusicControl()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1526
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dix;->d(Landroid/content/Context;)Lo/dix;

    .line 1527
    const-string v0, "UIHLH_AchievementCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initManager----music"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1530
    :cond_0
    return-void
.end method

.method private H()V
    .locals 10

    .line 1535
    const-string v0, "UIHLH_AchievementCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter notificationAlert"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1536
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/enz;->b(Landroid/content/Context;)Lo/enz;

    move-result-object v4

    .line 1537
    invoke-virtual {v4}, Lo/enz;->b()Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    move-result-object v5

    .line 1538
    const/4 v0, 0x0

    if-ne v0, v5, :cond_0

    .line 1539
    return-void

    .line 1541
    :cond_0
    const-string v0, "UIHLH_AchievementCardData"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter notificationAlert isMessage_alert = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v5}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isMessage_alert()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1542
    iget-object v0, p0, Lo/epf;->b:Landroid/content/Context;

    const-string v1, "com.huawei.health.MainActivity"

    invoke-static {v0, v1}, Lo/dbf;->h(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v6

    .line 1543
    const-string v0, "UIHLH_AchievementCardData"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "is MainActivity on Top  "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v6, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1545
    invoke-virtual {v5}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isMessage_alert()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1547
    invoke-static {}, Lo/dip;->d()Lo/dip;

    move-result-object v0

    invoke-virtual {v0}, Lo/dip;->c()Z

    move-result v7

    .line 1549
    invoke-direct {p0}, Lo/epf;->F()Z

    move-result v8

    .line 1551
    invoke-direct {p0}, Lo/epf;->E()Z

    move-result v9

    .line 1552
    const-string v0, "UIHLH_AchievementCardData"

    const/4 v1, 0x5

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isClosed:  "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, "isAchieve: "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isShownThreeTimes: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1553
    if-nez v7, :cond_1

    if-eqz v8, :cond_1

    if-nez v9, :cond_1

    .line 1555
    invoke-direct {p0}, Lo/epf;->I()V

    .line 1557
    invoke-static {}, Lo/dpk;->c()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lo/epf;->b:Landroid/content/Context;

    invoke-direct {p0, v0, v1}, Lo/epf;->d(Ljava/lang/String;Landroid/content/Context;)V

    .line 1559
    iget-object v0, p0, Lo/epf;->b:Landroid/content/Context;

    invoke-direct {p0, v0}, Lo/epf;->d(Landroid/content/Context;)V

    goto :goto_0

    .line 1561
    :cond_1
    if-eqz v7, :cond_2

    .line 1563
    iget-object v0, p0, Lo/epf;->n:Lo/egv;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    iget-object v0, p0, Lo/epf;->n:Lo/egv;

    invoke-virtual {v0}, Lo/egv;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1564
    iget-object v0, p0, Lo/epf;->n:Lo/egv;

    invoke-virtual {v0}, Lo/egv;->dismiss()V

    .line 1565
    const-string v0, "UIHLH_AchievementCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "dismiss notification dialog"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1569
    :cond_2
    :goto_0
    return-void
.end method

.method private I()V
    .locals 6

    .line 1641
    const/4 v4, 0x0

    .line 1642
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/enz;->b(Landroid/content/Context;)Lo/enz;

    move-result-object v0

    invoke-virtual {v0}, Lo/enz;->b()Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 1643
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/enz;->b(Landroid/content/Context;)Lo/enz;

    move-result-object v0

    invoke-virtual {v0}, Lo/enz;->b()Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportMusicControl()Z

    move-result v4

    .line 1644
    const-string v0, "UIHLH_AchievementCardData"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showNotificationDialog, isSupportMusic:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1647
    :cond_0
    iget-object v0, p0, Lo/epf;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/dbf;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-nez v0, :cond_3

    .line 1648
    new-instance v0, Lo/egv$b;

    iget-object v1, p0, Lo/epf;->b:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/egv$b;-><init>(Landroid/content/Context;)V

    sget v1, Lcom/huawei/ui/homehealth/R$string;->IDS_service_area_notice_open_title:I

    .line 1649
    invoke-virtual {v0, v1}, Lo/egv$b;->b(I)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$string;->IDS_common_enable_button:I

    new-instance v2, Lo/epf$3;

    invoke-direct {v2, p0}, Lo/epf$3;-><init>(Lo/epf;)V

    .line 1650
    invoke-virtual {v0, v1, v2}, Lo/egv$b;->e(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$string;->IDS_settings_button_cancal:I

    new-instance v2, Lo/epf$5;

    invoke-direct {v2, p0}, Lo/epf$5;-><init>(Lo/epf;)V

    .line 1673
    invoke-virtual {v0, v1, v2}, Lo/egv$b;->b(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    move-result-object v5

    .line 1681
    if-eqz v4, :cond_1

    .line 1682
    iget-object v0, p0, Lo/epf;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/dix;->d(Landroid/content/Context;)Lo/dix;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/dix;->d(Ljava/lang/Boolean;)V

    .line 1683
    iget-object v0, p0, Lo/epf;->b:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/homehealth/R$string;->IDS_nottification_settings_remind_new:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lo/egv$b;->b(Ljava/lang/String;)Lo/egv$b;

    goto :goto_0

    .line 1685
    :cond_1
    iget-object v0, p0, Lo/epf;->b:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/homehealth/R$string;->IDS_nottification_settings_remind_update:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lo/egv$b;->b(Ljava/lang/String;)Lo/egv$b;

    .line 1687
    :goto_0
    invoke-virtual {v5}, Lo/egv$b;->b()Lo/egv;

    move-result-object v0

    iput-object v0, p0, Lo/epf;->n:Lo/egv;

    .line 1688
    iget-object v0, p0, Lo/epf;->n:Lo/egv;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egv;->setCancelable(Z)V

    .line 1689
    iget-object v0, p0, Lo/epf;->n:Lo/egv;

    invoke-virtual {v0}, Lo/egv;->isShowing()Z

    move-result v0

    if-nez v0, :cond_2

    .line 1690
    iget-object v0, p0, Lo/epf;->n:Lo/egv;

    invoke-virtual {v0}, Lo/egv;->show()V

    .line 1692
    :cond_2
    goto/16 :goto_2

    .line 1693
    :cond_3
    new-instance v0, Lo/egv$b;

    iget-object v1, p0, Lo/epf;->b:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/egv$b;-><init>(Landroid/content/Context;)V

    sget v1, Lcom/huawei/ui/homehealth/R$string;->IDS_service_area_notice_title:I

    .line 1694
    invoke-virtual {v0, v1}, Lo/egv$b;->b(I)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$string;->IDS_yes:I

    new-instance v2, Lo/epf$9;

    invoke-direct {v2, p0}, Lo/epf$9;-><init>(Lo/epf;)V

    .line 1695
    invoke-virtual {v0, v1, v2}, Lo/egv$b;->e(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$string;->IDS_no:I

    new-instance v2, Lo/epf$1;

    invoke-direct {v2, p0}, Lo/epf$1;-><init>(Lo/epf;)V

    .line 1718
    invoke-virtual {v0, v1, v2}, Lo/egv$b;->b(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    move-result-object v5

    .line 1736
    if-eqz v4, :cond_4

    .line 1737
    iget-object v0, p0, Lo/epf;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/dix;->d(Landroid/content/Context;)Lo/dix;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/dix;->d(Ljava/lang/Boolean;)V

    .line 1738
    iget-object v0, p0, Lo/epf;->b:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/homehealth/R$string;->IDS_nottification_settings_remind_new:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lo/egv$b;->b(Ljava/lang/String;)Lo/egv$b;

    goto :goto_1

    .line 1740
    :cond_4
    iget-object v0, p0, Lo/epf;->b:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/homehealth/R$string;->IDS_nottification_settings_remind:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lo/egv$b;->b(Ljava/lang/String;)Lo/egv$b;

    .line 1742
    :goto_1
    invoke-virtual {v5}, Lo/egv$b;->b()Lo/egv;

    move-result-object v0

    iput-object v0, p0, Lo/epf;->n:Lo/egv;

    .line 1743
    iget-object v0, p0, Lo/epf;->n:Lo/egv;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egv;->setCancelable(Z)V

    .line 1744
    iget-object v0, p0, Lo/epf;->n:Lo/egv;

    invoke-virtual {v0}, Lo/egv;->isShowing()Z

    move-result v0

    if-nez v0, :cond_5

    .line 1745
    iget-object v0, p0, Lo/epf;->n:Lo/egv;

    invoke-virtual {v0}, Lo/egv;->show()V

    .line 1749
    :cond_5
    :goto_2
    return-void
.end method

.method private J()V
    .locals 7

    .line 1921
    iget-object v0, p0, Lo/epf;->b:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "sp_update_check_time"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 1922
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, ""

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lo/dcy;

    const/4 v5, 0x0

    invoke-direct {v4, v5}, Lo/dcy;-><init>(I)V

    .line 1921
    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 1924
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dqi;->b(Landroid/content/Context;)Lo/dqi;

    move-result-object v0

    const-string v1, "1"

    invoke-virtual {v0, v1}, Lo/dqi;->h(Ljava/lang/String;)V

    .line 1925
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/eob;->c(Landroid/content/Context;)Lo/eob;

    move-result-object v0

    invoke-virtual {v0}, Lo/eob;->v()V

    .line 1926
    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    .line 1927
    const-string v0, "click"

    const-string v1, "1"

    invoke-interface {v6, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1928
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    sget-object v2, Lo/dae;->iK:Lo/dae;

    invoke-virtual {v2}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v6, v3}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 1929
    return-void
.end method

.method private K()V
    .locals 6

    .line 1826
    const-string v0, "UIHLH_AchievementCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updatelayout enter updateLayoutIsShow"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1827
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/enz;->b(Landroid/content/Context;)Lo/enz;

    move-result-object v4

    .line 1828
    invoke-virtual {v4}, Lo/enz;->b()Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    move-result-object v5

    .line 1829
    const/4 v0, 0x0

    if-ne v0, v5, :cond_0

    .line 1830
    const-string v0, "UIHLH_AchievementCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " deviceCapability is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1831
    return-void

    .line 1834
    :cond_0
    invoke-virtual {v5}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isOta_update()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, Lo/etq;->d()Lo/etq;

    move-result-object v0

    invoke-virtual {v0}, Lo/etq;->b()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v0

    invoke-static {v0}, Lo/dbh;->e(I)Z

    move-result v0

    if-nez v0, :cond_1

    .line 1835
    invoke-static {}, Lo/etq;->d()Lo/etq;

    move-result-object v0

    invoke-virtual {v0}, Lo/etq;->b()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v0

    const/16 v1, 0xc

    if-eq v1, v0, :cond_1

    .line 1837
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dqi;->b(Landroid/content/Context;)Lo/dqi;

    move-result-object v0

    const-string v1, "wlan_auto_update"

    new-instance v2, Lo/epf$8;

    invoke-direct {v2, p0}, Lo/epf$8;-><init>(Lo/epf;)V

    invoke-virtual {v0, v1, v2}, Lo/dqi;->a(Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 1860
    :cond_1
    return-void
.end method

.method private L()Z
    .locals 7

    .line 1867
    iget-object v0, p0, Lo/epf;->b:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "sp_update_check_time"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 1869
    const-string v0, "UIHLH_AchievementCardData"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updatelayout isEnableDialog: strLastTime = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1870
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1871
    const/4 v0, 0x1

    return v0

    .line 1873
    :cond_0
    invoke-static {v4}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v5

    .line 1874
    const-string v0, "UIHLH_AchievementCardData"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updatelayout isEnableDialog: strNowTime = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1875
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sub-long/2addr v0, v5

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(J)J

    move-result-wide v0

    const-wide/32 v2, 0x5265c00

    cmp-long v0, v0, v2

    if-lez v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private M()Z
    .locals 6

    .line 1883
    iget-object v0, p0, Lo/epf;->b:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "sp_update_cancel_times"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 1885
    const-string v0, "UIHLH_AchievementCardData"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updatelayout countShowTimes: number = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1886
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1887
    const/4 v0, 0x1

    return v0

    .line 1889
    :cond_0
    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v5

    .line 1890
    const/4 v0, 0x2

    if-ge v5, v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private N()V
    .locals 7

    .line 1754
    const/4 v4, 0x0

    .line 1755
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/enz;->b(Landroid/content/Context;)Lo/enz;

    move-result-object v0

    invoke-virtual {v0}, Lo/enz;->b()Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 1756
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/enz;->b(Landroid/content/Context;)Lo/enz;

    move-result-object v0

    invoke-virtual {v0}, Lo/enz;->b()Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportMusicControl()Z

    move-result v4

    .line 1757
    const-string v0, "UIHLH_AchievementCardData"

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

    .line 1759
    :cond_0
    new-instance v0, Lo/egv$b;

    iget-object v1, p0, Lo/epf;->b:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/egv$b;-><init>(Landroid/content/Context;)V

    sget v1, Lcom/huawei/ui/homehealth/R$string;->IDS_service_area_notice_title:I

    .line 1760
    invoke-virtual {v0, v1}, Lo/egv$b;->b(I)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$string;->IDS_open_later:I

    new-instance v2, Lo/epf$6;

    invoke-direct {v2, p0}, Lo/epf$6;-><init>(Lo/epf;)V

    .line 1761
    const v3, 0x1060016

    invoke-virtual {v0, v1, v3, v2}, Lo/egv$b;->d(IILandroid/view/View$OnClickListener;)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$string;->IDS_common_enable_button:I

    new-instance v2, Lo/epf$7;

    invoke-direct {v2, p0}, Lo/epf$7;-><init>(Lo/epf;)V

    .line 1781
    invoke-virtual {v0, v1, v2}, Lo/egv$b;->b(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    move-result-object v5

    .line 1807
    if-eqz v4, :cond_1

    .line 1808
    iget-object v0, p0, Lo/epf;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/dix;->d(Landroid/content/Context;)Lo/dix;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/dix;->d(Ljava/lang/Boolean;)V

    .line 1809
    iget-object v0, p0, Lo/epf;->b:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/homehealth/R$string;->IDS_nottification_settings_remind_new:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lo/egv$b;->b(Ljava/lang/String;)Lo/egv$b;

    goto :goto_0

    .line 1811
    :cond_1
    iget-object v0, p0, Lo/epf;->b:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/homehealth/R$string;->IDS_nottification_settings_remind_twice:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lo/egv$b;->b(Ljava/lang/String;)Lo/egv$b;

    .line 1813
    :goto_0
    invoke-virtual {v5}, Lo/egv$b;->b()Lo/egv;

    move-result-object v6

    .line 1814
    const/4 v0, 0x0

    invoke-virtual {v6, v0}, Lo/egv;->setCancelable(Z)V

    .line 1815
    invoke-virtual {v6}, Lo/egv;->isShowing()Z

    move-result v0

    if-nez v0, :cond_2

    .line 1816
    invoke-virtual {v6}, Lo/egv;->show()V

    .line 1818
    :cond_2
    return-void
.end method

.method static synthetic a(Lo/epf;)Landroid/os/Handler;
    .locals 1

    .line 125
    iget-object v0, p0, Lo/epf;->f:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic a(Lo/epf;Ljava/lang/Boolean;)Ljava/lang/Boolean;
    .locals 0

    .line 125
    iput-object p1, p0, Lo/epf;->F:Ljava/lang/Boolean;

    return-object p1
.end method

.method static synthetic a(Lo/epf;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 125
    iput-object p1, p0, Lo/epf;->M:Ljava/lang/String;

    return-object p1
.end method

.method private a(Landroid/content/Context;)V
    .locals 3

    .line 405
    if-nez p1, :cond_0

    .line 406
    return-void

    .line 408
    :cond_0
    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    .line 409
    const-string v0, "com.huawei.health"

    invoke-virtual {v2, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 410
    const-string v0, "com.huawei.health"

    const-string v1, "com.huawei.health.device.ui.DeviceMainActivity"

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 412
    const-string v0, "kind"

    const-string v1, "HDK_UNKNOWN"

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 413
    const-string v0, "view"

    const-string v1, "ListDevice"

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 414
    const-string v0, "root_in_me"

    const-string v1, "me"

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 415
    invoke-virtual {p1, v2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 416
    return-void
.end method

.method private a(Landroid/content/Context;Ljava/lang/String;)V
    .locals 6

    .line 477
    if-nez p1, :cond_0

    .line 478
    return-void

    .line 480
    :cond_0
    iget-object v0, p0, Lo/epf;->o:Ljava/lang/String;

    if-nez v0, :cond_1

    .line 481
    const-string v0, "UIHLH_AchievementCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mDeviceHealthProductId == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 482
    return-void

    .line 484
    :cond_1
    invoke-static {}, Lo/afq;->e()Lo/afq;

    move-result-object v0

    iget-object v1, p0, Lo/epf;->o:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/afq;->e(Ljava/lang/String;)Lo/afj;

    move-result-object v4

    .line 485
    if-eqz v4, :cond_2

    invoke-virtual {v4}, Lo/afj;->d()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-gtz v0, :cond_3

    .line 486
    :cond_2
    new-instance v5, Landroid/content/Intent;

    invoke-direct {v5}, Landroid/content/Intent;-><init>()V

    .line 487
    const-string v0, "com.huawei.health"

    invoke-virtual {v5, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 488
    const-string v0, "com.huawei.health"

    const-string v1, "com.huawei.health.device.ui.DeviceMainActivity"

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 490
    const-string v0, "kind"

    const-string v1, "HDK_UNKNOWN"

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 491
    const-string v0, "view"

    const-string v1, "ListDevice"

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 492
    const-string v0, "root_in_me"

    const-string v1, "me"

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 493
    invoke-virtual {p1, v5}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 495
    goto :goto_0

    .line 496
    :cond_3
    new-instance v5, Landroid/content/Intent;

    invoke-direct {v5}, Landroid/content/Intent;-><init>()V

    .line 497
    const-string v0, "com.huawei.health"

    invoke-virtual {v5, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 498
    const-string v0, "com.huawei.health"

    const-string v1, "com.huawei.health.device.ui.DeviceMainActivity"

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 500
    const-string v0, "SWITCH_PLUGINDEVICE"

    invoke-virtual {v5, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 501
    const-string v0, "arg1"

    const-string v1, "DeviceIntroduction"

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 502
    const-string v0, "arg2"

    invoke-virtual {v5, v0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 503
    invoke-virtual {p1, v5}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 505
    :goto_0
    return-void
.end method

.method private a(Landroid/content/Intent;)V
    .locals 9

    .line 1354
    invoke-virtual {p0}, Lo/epf;->c()V

    .line 1355
    const-string v0, "UIHLH_AchievementCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showScaleUpdateDialog ACTION_APP_AUTO_CHECK_NEW_VERSION_RESULT:AUTO_CHECK_SUCCESS BLE"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1356
    const-string v0, "name"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 1357
    const-string v0, "size"

    const/4 v1, -0x1

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v5

    .line 1358
    const-string v0, "changelog"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 1359
    const-string v0, "productId"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 1361
    iget-object v0, p0, Lo/epf;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/dbf;->B(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1362
    return-void

    .line 1365
    :cond_0
    new-instance v8, Landroid/content/Intent;

    invoke-direct {v8}, Landroid/content/Intent;-><init>()V

    .line 1366
    const-string v0, "name"

    invoke-virtual {v8, v0, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 1367
    const-string v0, "size"

    invoke-virtual {v8, v0, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 1368
    const-string v0, "message"

    invoke-virtual {v8, v0, v6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 1369
    const-string v0, "show"

    const/4 v1, 0x0

    invoke-virtual {v8, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 1370
    const-string v0, "isScale"

    const/4 v1, 0x1

    invoke-virtual {v8, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 1371
    const-string v0, "productId"

    invoke-virtual {v8, v0, v7}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 1372
    iget-object v0, p0, Lo/epf;->b:Landroid/content/Context;

    const-class v1, Lcom/huawei/ui/device/activity/update/BandUpdateDialogActivity;

    invoke-virtual {v8, v0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 1373
    iget-object v0, p0, Lo/epf;->b:Landroid/content/Context;

    invoke-virtual {v0, v8}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 1374
    return-void
.end method

.method private a(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;Ljava/lang/Boolean;)V
    .locals 3

    .line 1432
    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    .line 1433
    const-string v0, "deviceName"

    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 1434
    const-string v0, "isForced"

    const/4 v1, 0x1

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 1435
    const-string v0, "isAW70"

    invoke-virtual {v2, v0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    .line 1436
    const-string v0, "mac"

    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 1437
    iget-object v0, p0, Lo/epf;->b:Landroid/content/Context;

    const-class v1, Lcom/huawei/ui/device/activity/update/BandUpdateDialogActivity;

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 1438
    iget-object v0, p0, Lo/epf;->b:Landroid/content/Context;

    invoke-virtual {v0, v2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 1439
    return-void
.end method

.method private a(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Z)V
    .locals 5

    .line 1396
    iget-object v0, p0, Lo/epf;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/eob;->c(Landroid/content/Context;)Lo/eob;

    move-result-object v0

    invoke-virtual {v0}, Lo/eob;->t()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1397
    const-string v0, "UIHLH_AchievementCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "band is showing!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1398
    return-void

    .line 1400
    :cond_0
    iget-object v0, p0, Lo/epf;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/eob;->c(Landroid/content/Context;)Lo/eob;

    move-result-object v0

    invoke-virtual {v0}, Lo/eob;->d()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1401
    const-string v0, "UIHLH_AchievementCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "band is transfering!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1402
    return-void

    .line 1404
    :cond_1
    const-string v0, "UIHLH_AchievementCardData"

    const/16 v1, 0xa

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showBandAutoCheckDialog version:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    const-string v2, " size:"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, " changeLog:"

    const/4 v3, 0x4

    aput-object v2, v1, v3

    const/4 v2, 0x5

    aput-object p3, v1, v2

    const-string v2, " deviceName:"

    const/4 v3, 0x6

    aput-object v2, v1, v3

    const/4 v2, 0x7

    aput-object p4, v1, v2

    const-string v2, " showCheckbox:"

    const/16 v3, 0x8

    aput-object v2, v1, v3

    .line 1405
    invoke-static {p5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/16 v3, 0x9

    aput-object v2, v1, v3

    .line 1404
    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1407
    iget-object v0, p0, Lo/epf;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/dbf;->B(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1408
    iput-object p1, p0, Lo/epf;->I:Ljava/lang/String;

    .line 1409
    iput p2, p0, Lo/epf;->H:I

    .line 1410
    iput-object p3, p0, Lo/epf;->E:Ljava/lang/String;

    .line 1411
    invoke-static {p5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lo/epf;->G:Ljava/lang/Boolean;

    .line 1412
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lo/epf;->F:Ljava/lang/Boolean;

    .line 1413
    const-string v0, "UIHLH_AchievementCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showBandAutoCheckDialog isBackground!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1414
    return-void

    .line 1416
    :cond_2
    new-instance v4, Landroid/content/Intent;

    invoke-direct {v4}, Landroid/content/Intent;-><init>()V

    .line 1417
    const-string v0, "name"

    invoke-virtual {v4, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 1418
    const-string v0, "size"

    invoke-virtual {v4, v0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 1419
    const-string v0, "message"

    invoke-virtual {v4, v0, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 1420
    const-string v0, "show"

    invoke-virtual {v4, v0, p5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 1421
    const-string v0, "isAW70"

    iget-boolean v1, p0, Lo/epf;->L:Z

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 1422
    const-string v0, "mac"

    iget-object v1, p0, Lo/epf;->M:Ljava/lang/String;

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 1423
    iget-object v0, p0, Lo/epf;->b:Landroid/content/Context;

    const-class v1, Lcom/huawei/ui/device/activity/update/BandUpdateDialogActivity;

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 1424
    iget-object v0, p0, Lo/epf;->b:Landroid/content/Context;

    invoke-virtual {v0, v4}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 1425
    return-void
.end method

.method static synthetic a(Z)Z
    .locals 0

    .line 125
    sput-boolean p0, Lo/epf;->J:Z

    return p0
.end method

.method static synthetic b(Lo/epf;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 125
    iput-object p1, p0, Lo/epf;->D:Ljava/lang/String;

    return-object p1
.end method

.method private b(Landroid/content/Context;)V
    .locals 8

    .line 420
    if-nez p1, :cond_0

    .line 421
    return-void

    .line 423
    :cond_0
    const-string v0, "UIHLH_AchievementCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startDeviceWearHome"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 424
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dde;->d(Landroid/content/Context;)Lo/dde;

    move-result-object v0

    invoke-virtual {v0}, Lo/dde;->e()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v4

    .line 425
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dde;->d(Landroid/content/Context;)Lo/dde;

    move-result-object v0

    invoke-virtual {v0}, Lo/dde;->b()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v5

    .line 427
    const/4 v0, 0x0

    if-eq v0, v4, :cond_2

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dpb;->b(Landroid/content/Context;)Lo/dpb;

    move-result-object v0

    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/dpb;->g(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 428
    const-string v0, "UIHLH_AchievementCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "wear device is OTAing"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 430
    new-instance v6, Landroid/content/Intent;

    invoke-direct {v6}, Landroid/content/Intent;-><init>()V

    .line 431
    iget-object v0, p0, Lo/epf;->b:Landroid/content/Context;

    const-class v1, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;

    invoke-virtual {v6, v0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 432
    const-string v7, ""

    .line 433
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dde;->d(Landroid/content/Context;)Lo/dde;

    move-result-object v0

    invoke-virtual {v0}, Lo/dde;->e()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 434
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dde;->d(Landroid/content/Context;)Lo/dde;

    move-result-object v0

    invoke-virtual {v0}, Lo/dde;->e()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v7

    .line 436
    :cond_1
    const-string v0, "device_id"

    invoke-virtual {v6, v0, v7}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 437
    iget-object v0, p0, Lo/epf;->b:Landroid/content/Context;

    invoke-virtual {v0, v6}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 438
    return-void

    .line 439
    :cond_2
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dde;->d(Landroid/content/Context;)Lo/dde;

    move-result-object v0

    invoke-virtual {v0}, Lo/dde;->b()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 440
    invoke-static {}, Lo/dpa;->c()Lo/dpa;

    move-result-object v0

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lo/dde;->d(Landroid/content/Context;)Lo/dde;

    move-result-object v1

    invoke-virtual {v1}, Lo/dde;->b()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/dpa;->d(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 441
    const-string v0, "UIHLH_AchievementCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "aw70 is OTAing"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 443
    new-instance v6, Landroid/content/Intent;

    invoke-direct {v6}, Landroid/content/Intent;-><init>()V

    .line 444
    iget-object v0, p0, Lo/epf;->b:Landroid/content/Context;

    const-class v1, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;

    invoke-virtual {v6, v0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 445
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dde;->d(Landroid/content/Context;)Lo/dde;

    move-result-object v0

    invoke-virtual {v0}, Lo/dde;->b()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v7

    .line 446
    const-string v0, "device_id"

    invoke-virtual {v6, v0, v7}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 447
    iget-object v0, p0, Lo/epf;->b:Landroid/content/Context;

    invoke-virtual {v0, v6}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 448
    return-void

    .line 451
    :cond_3
    const/4 v0, 0x0

    if-eq v0, v4, :cond_4

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dpb;->b(Landroid/content/Context;)Lo/dpb;

    move-result-object v0

    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/dpb;->k(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 452
    const-string v0, "UIHLH_AchievementCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "wear device is Forced Update"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 454
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-direct {p0, v4, v0}, Lo/epf;->a(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;Ljava/lang/Boolean;)V

    .line 455
    return-void

    .line 458
    :cond_4
    const/4 v0, 0x0

    if-eq v0, v5, :cond_5

    invoke-static {}, Lo/dpa;->c()Lo/dpa;

    move-result-object v0

    invoke-virtual {v5}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/dpa;->h(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 459
    const-string v0, "UIHLH_AchievementCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "aw70 device is Forced Update"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 461
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-direct {p0, v5, v0}, Lo/epf;->a(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;Ljava/lang/Boolean;)V

    .line 462
    return-void

    .line 465
    :cond_5
    const-string v0, "UIHLH_AchievementCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "end startDeviceWearHome"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 466
    new-instance v6, Landroid/content/Intent;

    invoke-direct {v6}, Landroid/content/Intent;-><init>()V

    .line 467
    const-string v0, "com.huawei.ui.homewear21.home.WearHomeActivity"

    invoke-virtual {v6, p1, v0}, Landroid/content/Intent;->setClassName(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    .line 468
    iget-object v0, p0, Lo/epf;->w:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_6

    .line 469
    const-string v0, "device_id"

    iget-object v1, p0, Lo/epf;->w:Ljava/util/ArrayList;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/ahh;

    invoke-virtual {v1}, Lo/ahh;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v6, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 471
    :cond_6
    invoke-virtual {p1, v6}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 473
    return-void
.end method

.method static synthetic b(Lo/epf;)V
    .locals 0

    .line 125
    invoke-direct {p0}, Lo/epf;->m()V

    return-void
.end method

.method static synthetic b(Lo/epf;I)V
    .locals 0

    .line 125
    invoke-direct {p0, p1}, Lo/epf;->e(I)V

    return-void
.end method

.method static synthetic b(Lo/epf;Landroid/content/Intent;)V
    .locals 0

    .line 125
    invoke-direct {p0, p1}, Lo/epf;->a(Landroid/content/Intent;)V

    return-void
.end method

.method static synthetic c(Lo/epf;Ljava/lang/Boolean;)Ljava/lang/Boolean;
    .locals 0

    .line 125
    iput-object p1, p0, Lo/epf;->B:Ljava/lang/Boolean;

    return-object p1
.end method

.method static synthetic c(Lo/epf;)Lo/dwr;
    .locals 1

    .line 125
    iget-object v0, p0, Lo/epf;->q:Lo/dwr;

    return-object v0
.end method

.method private c(D)Lo/dzj;
    .locals 2

    .line 949
    .line 950
    invoke-static {p1, p2}, Lo/dyj;->c(D)Lo/dzc;

    move-result-object v1

    .line 951
    invoke-virtual {v1}, Lo/dzc;->a()Lo/dzj;

    move-result-object v0

    return-object v0
.end method

.method static synthetic c(Lo/epf;D)Lo/dzj;
    .locals 1

    .line 125
    invoke-direct {p0, p1, p2}, Lo/epf;->c(D)Lo/dzj;

    move-result-object v0

    return-object v0
.end method

.method private c(Landroid/content/Context;)V
    .locals 9

    .line 1896
    iget-object v0, p0, Lo/epf;->b:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "sp_update_check_time"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 1897
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, ""

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lo/dcy;

    const/4 v5, 0x0

    invoke-direct {v4, v5}, Lo/dcy;-><init>(I)V

    .line 1896
    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 1900
    new-instance v6, Lo/dcy;

    const/4 v0, 0x0

    invoke-direct {v6, v0}, Lo/dcy;-><init>(I)V

    .line 1901
    iget-object v0, p0, Lo/epf;->b:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "sp_update_cancel_times"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 1903
    const-string v0, "UIHLH_AchievementCardData"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updatelayout setDialogshowTime,number-----------"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v7, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1904
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1906
    const-string v0, "UIHLH_AchievementCardData"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updatelayout numberIsNull"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v7, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1907
    const/16 v0, 0x2710

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "sp_update_cancel_times"

    const-string v2, "1"

    invoke-static {p1, v0, v1, v2, v6}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    goto :goto_0

    .line 1910
    :cond_0
    invoke-static {v7}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    add-int/lit8 v8, v0, 0x1

    .line 1912
    const-string v0, "UIHLH_AchievementCardData"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updatelayout numberPlusOne "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1913
    const/16 v0, 0x2710

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "sp_update_cancel_times"

    .line 1914
    invoke-static {v8}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    .line 1913
    invoke-static {p1, v0, v1, v2, v6}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 1916
    :goto_0
    return-void
.end method

.method private c(Lo/acl$a;)V
    .locals 7

    .line 529
    const-string v0, "UIHLH_AchievementCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter initList"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 530
    iget-object v0, p0, Lo/epf;->u:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 531
    iget-object v0, p0, Lo/epf;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 532
    iget-object v0, p0, Lo/epf;->w:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 534
    sget-object v0, Lo/acl$a;->b:Lo/acl$a;

    if-ne p1, v0, :cond_2

    .line 536
    invoke-static {}, Lo/ahg;->a()Lo/ahg;

    move-result-object v0

    invoke-virtual {v0}, Lo/ahg;->c()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_0

    invoke-static {}, Lo/dbf;->q()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 537
    const-string v0, "UIHLH_AchievementCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " has wear device"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 538
    invoke-static {}, Lo/ahg;->a()Lo/ahg;

    move-result-object v0

    invoke-virtual {v0}, Lo/ahg;->c()Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lo/epf;->w:Ljava/util/ArrayList;

    .line 540
    :cond_0
    iget-object v0, p0, Lo/epf;->w:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/ahh;

    .line 541
    new-instance v6, Lo/afa;

    invoke-direct {v6}, Lo/afa;-><init>()V

    .line 542
    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Lo/afa;->e(I)V

    .line 543
    invoke-virtual {v6, v5}, Lo/afa;->a(Ljava/lang/Object;)V

    .line 544
    invoke-virtual {v5}, Lo/ahh;->e()I

    move-result v0

    const/4 v1, 0x2

    if-ne v1, v0, :cond_1

    .line 545
    iget-object v0, p0, Lo/epf;->u:Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, v6}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    goto :goto_1

    .line 547
    :cond_1
    iget-object v0, p0, Lo/epf;->u:Ljava/util/ArrayList;

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 549
    :goto_1
    const-string v0, "UIHLH_AchievementCardData"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " has wear device  name :"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v5}, Lo/ahh;->c()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " state :"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-virtual {v5}, Lo/ahh;->e()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 550
    goto :goto_0

    .line 552
    :cond_2
    iget-object v0, p0, Lo/epf;->w:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    iput v0, p0, Lo/epf;->k:I

    .line 553
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/afd;->e(Lo/acl$a;)Ljava/util/ArrayList;

    move-result-object v4

    .line 555
    const/4 v5, 0x0

    :goto_2
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v5, v0, :cond_4

    .line 556
    invoke-static {}, Lo/afq;->e()Lo/afq;

    move-result-object v0

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/afq;->e(Ljava/lang/String;)Lo/afj;

    move-result-object v6

    .line 557
    if-eqz v6, :cond_3

    invoke-virtual {v6}, Lo/afj;->n()Lo/afj$a;

    move-result-object v0

    invoke-virtual {v0}, Lo/afj$a;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    .line 558
    iget-object v0, p0, Lo/epf;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 559
    invoke-virtual {v6}, Lo/afj;->h()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/epf;->o:Ljava/lang/String;

    .line 555
    :cond_3
    add-int/lit8 v5, v5, 0x1

    goto :goto_2

    .line 562
    :cond_4
    iget-object v0, p0, Lo/epf;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    iput v0, p0, Lo/epf;->p:I

    .line 563
    iget-object v0, p0, Lo/epf;->a:Ljava/util/ArrayList;

    invoke-static {v0}, Lo/aex;->d(Ljava/util/ArrayList;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_5

    .line 564
    iget-object v0, p0, Lo/epf;->u:Ljava/util/ArrayList;

    iget-object v1, p0, Lo/epf;->a:Ljava/util/ArrayList;

    invoke-static {v1}, Lo/aex;->d(Ljava/util/ArrayList;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 566
    :cond_5
    const-string v0, "UIHLH_AchievementCardData"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MyDeviceFragment productInfos size is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/epf;->u:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 567
    return-void
.end method

.method static synthetic c(Lo/epf;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Z)V
    .locals 0

    .line 125
    invoke-direct/range {p0 .. p5}, Lo/epf;->a(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Z)V

    return-void
.end method

.method static synthetic c(Lo/epf;Z)Z
    .locals 0

    .line 125
    iput-boolean p1, p0, Lo/epf;->N:Z

    return p1
.end method

.method static synthetic c(Z)Z
    .locals 0

    .line 125
    sput-boolean p0, Lo/epf;->K:Z

    return p0
.end method

.method static synthetic d(Lo/epf;I)I
    .locals 0

    .line 125
    iput p1, p0, Lo/epf;->A:I

    return p1
.end method

.method private d(Landroid/content/Context;)V
    .locals 7

    .line 1620
    new-instance v4, Lo/dcy;

    const/4 v0, 0x0

    invoke-direct {v4, v0}, Lo/dcy;-><init>(I)V

    .line 1621
    iget-object v0, p0, Lo/epf;->b:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "dialog_show_time"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 1623
    const-string v0, "UIHLH_AchievementCardData"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setDialogshowTime,number-----------"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v5, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1624
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1626
    const-string v0, "UIHLH_AchievementCardData"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "numberIsNull"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v5, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1627
    const/16 v0, 0x2710

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "dialog_show_time"

    const-string v2, "0"

    invoke-static {p1, v0, v1, v2, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    goto :goto_0

    .line 1630
    :cond_0
    invoke-static {v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    add-int/lit8 v6, v0, 0x1

    .line 1632
    const-string v0, "UIHLH_AchievementCardData"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "numberPlusOne"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v5, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1633
    const/16 v0, 0x2710

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "dialog_show_time"

    .line 1634
    invoke-static {v6}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    .line 1633
    invoke-static {p1, v0, v1, v2, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 1636
    :goto_0
    return-void
.end method

.method private d(Ljava/lang/String;Landroid/content/Context;)V
    .locals 5

    .line 1608
    const-string v0, "UIHLH_AchievementCardData"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setDialogCheckTime,time-----------"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1610
    new-instance v4, Lo/dcy;

    const/4 v0, 0x0

    invoke-direct {v4, v0}, Lo/dcy;-><init>(I)V

    .line 1612
    const/16 v0, 0x2710

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "sp_dialog_check_time"

    invoke-static {p2, v0, v1, p1, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 1614
    return-void
.end method

.method static synthetic d(Lo/epf;)V
    .locals 0

    .line 125
    invoke-direct {p0}, Lo/epf;->y()V

    return-void
.end method

.method static synthetic d(Lo/epf;Z)Z
    .locals 0

    .line 125
    iput-boolean p1, p0, Lo/epf;->L:Z

    return p1
.end method

.method static synthetic e(Lo/epf;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 125
    iput-object p1, p0, Lo/epf;->j:Ljava/lang/String;

    return-object p1
.end method

.method private e(I)V
    .locals 9

    .line 833
    const/4 v4, 0x0

    .line 834
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dde;->d(Landroid/content/Context;)Lo/dde;

    move-result-object v0

    invoke-virtual {v0}, Lo/dde;->i()Ljava/util/List;

    move-result-object v5

    .line 835
    const/4 v0, 0x0

    if-eq v0, v5, :cond_0

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    if-eqz v0, :cond_0

    .line 836
    const/4 v0, 0x0

    invoke-interface {v5, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    .line 838
    :cond_0
    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    .line 839
    invoke-static {}, Lo/dbf;->d()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v7, 0x1

    goto :goto_0

    :cond_1
    const/4 v7, 0x0

    .line 840
    :goto_0
    const-string v0, "isEMUI"

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v6, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 841
    const/4 v0, 0x0

    if-eq v0, v4, :cond_2

    .line 842
    const-string v0, "deviceName"

    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v1

    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceName()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-static {v1, v2, v3}, Lo/dda;->c(ILjava/lang/String;Z)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v6, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 844
    :cond_2
    const-string v0, "error_type"

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v6, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 845
    sget-object v0, Lo/dae;->iZ:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v8

    .line 846
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lo/epf;->b:Landroid/content/Context;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v8, v6, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 847
    return-void
.end method

.method private e(Landroid/content/Context;)V
    .locals 3

    .line 391
    if-nez p1, :cond_0

    .line 392
    return-void

    .line 394
    :cond_0
    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    .line 395
    const-string v0, "com.huawei.health"

    invoke-virtual {v2, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 396
    const-string v0, "com.huawei.health"

    const-string v1, "com.huawei.health.device.ui.DeviceMainActivity"

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 398
    const-string v0, "SWITCH_PLUGINDEVICE"

    invoke-virtual {v2, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 399
    const-string v0, "arg1"

    const-string v1, "DeviceList"

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 400
    invoke-virtual {p1, v2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 401
    return-void
.end method

.method static synthetic e(Lo/epf;)V
    .locals 0

    .line 125
    invoke-direct {p0}, Lo/epf;->s()V

    return-void
.end method

.method static synthetic f(Lo/epf;)Ljava/lang/String;
    .locals 1

    .line 125
    iget-object v0, p0, Lo/epf;->M:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic f()Ljava/util/HashMap;
    .locals 1

    .line 125
    sget-object v0, Lo/epf;->t:Ljava/util/HashMap;

    return-object v0
.end method

.method static synthetic g(Lo/epf;)Ljava/lang/String;
    .locals 1

    .line 125
    iget-object v0, p0, Lo/epf;->j:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic g()Ljava/util/HashMap;
    .locals 1

    .line 125
    sget-object v0, Lo/epf;->s:Ljava/util/HashMap;

    return-object v0
.end method

.method static synthetic h(Lo/epf;)Z
    .locals 1

    .line 125
    invoke-direct {p0}, Lo/epf;->L()Z

    move-result v0

    return v0
.end method

.method static synthetic i(Lo/epf;)Lo/epi;
    .locals 1

    .line 125
    iget-object v0, p0, Lo/epf;->d:Lo/epi;

    return-object v0
.end method

.method static synthetic i()Z
    .locals 1

    .line 125
    sget-boolean v0, Lo/epf;->K:Z

    return v0
.end method

.method private j()V
    .locals 5

    .line 1454
    const-string v0, "UIHLH_AchievementCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "unregisterAppCheckBroadcast()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1456
    :try_start_0
    iget-object v0, p0, Lo/epf;->b:Landroid/content/Context;

    iget-object v1, p0, Lo/epf;->P:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1

    .line 1461
    goto :goto_0

    .line 1457
    :catch_0
    move-exception v4

    .line 1458
    const-string v0, "UIHLH_AchievementCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/lang/IllegalArgumentException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1461
    goto :goto_0

    .line 1459
    :catch_1
    move-exception v4

    .line 1460
    const-string v0, "UIHLH_AchievementCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/lang/RuntimeException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1462
    :goto_0
    return-void
.end method

.method static synthetic k(Lo/epf;)Z
    .locals 1

    .line 125
    invoke-direct {p0}, Lo/epf;->M()Z

    move-result v0

    return v0
.end method

.method static synthetic l(Lo/epf;)Ljava/lang/String;
    .locals 1

    .line 125
    iget-object v0, p0, Lo/epf;->D:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic m(Lo/epf;)Ljava/lang/Boolean;
    .locals 1

    .line 125
    iget-object v0, p0, Lo/epf;->B:Ljava/lang/Boolean;

    return-object v0
.end method

.method private m()V
    .locals 9

    .line 570
    iget-object v4, p0, Lo/epf;->f:Landroid/os/Handler;

    .line 571
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 572
    return-void

    .line 575
    :cond_0
    iget-object v0, p0, Lo/epf;->x:Lo/acl$a;

    invoke-direct {p0, v0}, Lo/epf;->c(Lo/acl$a;)V

    .line 576
    const-string v0, "UIHLH_AchievementCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter refreshShowDevice "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 577
    const/4 v5, 0x0

    .line 579
    iget-object v0, p0, Lo/epf;->u:Ljava/util/ArrayList;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lo/epf;->u:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_2

    .line 580
    iget-object v0, p0, Lo/epf;->u:Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/afa;

    .line 581
    const-string v0, "UIHLH_AchievementCardData"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " refreshShowDevice  size: "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/epf;->u:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 583
    invoke-virtual {v4}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v6

    .line 584
    iput-object v5, v6, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 585
    iget v0, p0, Lo/epf;->k:I

    iget v1, p0, Lo/epf;->p:I

    add-int/2addr v0, v1

    iput v0, v6, Landroid/os/Message;->arg1:I

    .line 586
    const/4 v0, 0x3

    iput v0, v6, Landroid/os/Message;->what:I

    .line 587
    invoke-virtual {v4, v6}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 589
    invoke-virtual {v5}, Lo/afa;->a()I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_1

    .line 590
    invoke-virtual {v5}, Lo/afa;->e()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lo/ahh;

    .line 592
    invoke-virtual {v4}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v8

    .line 593
    invoke-virtual {v7}, Lo/ahh;->e()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 595
    :sswitch_0
    const/4 v0, 0x4

    iput v0, v8, Landroid/os/Message;->what:I

    .line 596
    goto :goto_1

    .line 598
    :sswitch_1
    const/4 v0, 0x5

    iput v0, v8, Landroid/os/Message;->what:I

    .line 599
    goto :goto_1

    .line 601
    :goto_0
    const/4 v0, 0x6

    iput v0, v8, Landroid/os/Message;->what:I

    .line 604
    :goto_1
    invoke-virtual {v4, v8}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 606
    :cond_1
    goto :goto_2

    .line 607
    :cond_2
    const-string v0, "UIHLH_AchievementCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " refreshShowDevice  size= 0 "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 608
    invoke-virtual {v4}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v6

    .line 609
    iput-object v5, v6, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 610
    iget v0, p0, Lo/epf;->k:I

    iget v1, p0, Lo/epf;->p:I

    add-int/2addr v0, v1

    iput v0, v6, Landroid/os/Message;->arg1:I

    .line 611
    const/4 v0, 0x7

    iput v0, v6, Landroid/os/Message;->what:I

    .line 612
    invoke-virtual {v4, v6}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 614
    :goto_2
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
        0x2 -> :sswitch_1
    .end sparse-switch
.end method

.method static synthetic n(Lo/epf;)V
    .locals 0

    .line 125
    invoke-direct {p0}, Lo/epf;->C()V

    return-void
.end method

.method static synthetic n()Z
    .locals 1

    .line 125
    sget-boolean v0, Lo/epf;->J:Z

    return v0
.end method

.method static synthetic o(Lo/epf;)I
    .locals 1

    .line 125
    iget v0, p0, Lo/epf;->A:I

    return v0
.end method

.method static synthetic p(Lo/epf;)Z
    .locals 1

    .line 125
    iget-boolean v0, p0, Lo/epf;->N:Z

    return v0
.end method

.method private q()V
    .locals 5

    .line 638
    new-instance v4, Landroid/content/IntentFilter;

    invoke-direct {v4}, Landroid/content/IntentFilter;-><init>()V

    .line 640
    const-string v0, "com.huawei.bone.action.CONNECTION_STATE_CHANGED"

    invoke-virtual {v4, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 642
    const-string v0, "com.huawei.bone.action.DEVICE_LIST_DELETE"

    invoke-virtual {v4, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 644
    const-string v0, "com.huawei.bone.action.DEVICE_THIRD_DELETE"

    invoke-virtual {v4, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 645
    iget-object v0, p0, Lo/epf;->b:Landroid/content/Context;

    iget-object v1, p0, Lo/epf;->y:Landroid/content/BroadcastReceiver;

    sget-object v2, Lo/dac;->a:Ljava/lang/String;

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v4, v2, v3}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Ljava/lang/String;Landroid/os/Handler;)Landroid/content/Intent;

    .line 646
    return-void
.end method

.method static synthetic q(Lo/epf;)V
    .locals 0

    .line 125
    invoke-direct {p0}, Lo/epf;->N()V

    return-void
.end method

.method static synthetic r(Lo/epf;)Ljava/lang/Boolean;
    .locals 1

    .line 125
    iget-object v0, p0, Lo/epf;->G:Ljava/lang/Boolean;

    return-object v0
.end method

.method private r()V
    .locals 3

    .line 709
    new-instance v2, Landroid/content/IntentFilter;

    invoke-direct {v2}, Landroid/content/IntentFilter;-><init>()V

    .line 710
    const-string v0, "com.huawei.plugin.account.login"

    invoke-virtual {v2, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 711
    const-string v0, "com.huawei.bone.action.FITNESS_USERINFO_UPDATED"

    invoke-virtual {v2, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 712
    iget-object v0, p0, Lo/epf;->b:Landroid/content/Context;

    invoke-static {v0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v0

    iput-object v0, p0, Lo/epf;->g:Landroid/support/v4/content/LocalBroadcastManager;

    .line 713
    iget-object v0, p0, Lo/epf;->g:Landroid/support/v4/content/LocalBroadcastManager;

    iget-object v1, p0, Lo/epf;->z:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1, v2}, Landroid/support/v4/content/LocalBroadcastManager;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V

    .line 714
    return-void
.end method

.method static synthetic s(Lo/epf;)Ljava/lang/String;
    .locals 1

    .line 125
    iget-object v0, p0, Lo/epf;->E:Ljava/lang/String;

    return-object v0
.end method

.method private s()V
    .locals 11

    .line 746
    iget-object v4, p0, Lo/epf;->d:Lo/epi;

    .line 747
    invoke-static {}, Lo/czu;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    if-eqz v4, :cond_0

    .line 748
    iget-object v0, v4, Lo/epi;->d:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_0

    .line 750
    :cond_0
    return-void

    .line 753
    :goto_0
    iget-object v5, p0, Lo/epf;->f:Landroid/os/Handler;

    .line 754
    const/4 v0, 0x0

    if-ne v0, v5, :cond_1

    .line 755
    return-void

    .line 758
    :cond_1
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dnm;->a(Landroid/content/Context;)Lo/dnm;

    move-result-object v6

    .line 759
    invoke-virtual {v6}, Lo/dnm;->i()Lcom/huawei/up/model/UserInfomation;

    move-result-object v7

    .line 760
    const/4 v8, 0x0

    .line 761
    if-eqz v7, :cond_2

    .line 762
    invoke-virtual {v7}, Lcom/huawei/up/model/UserInfomation;->getPicPath()Ljava/lang/String;

    move-result-object v8

    goto :goto_1

    .line 764
    :cond_2
    const-string v0, "UIHLH_AchievementCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mUserInfomation is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 767
    :goto_1
    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 768
    iget-object v0, p0, Lo/epf;->b:Landroid/content/Context;

    invoke-static {v0, v8}, Lo/dbk;->d(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v9

    goto :goto_2

    .line 770
    :cond_3
    const-string v0, "UIHLH_AchievementCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "headImgPath is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 771
    iget-object v0, p0, Lo/epf;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$mipmap;->ic_personal_head:I

    invoke-static {v0, v1}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    move-result-object v9

    .line 774
    :goto_2
    const/4 v0, 0x0

    if-eq v0, v9, :cond_4

    .line 775
    invoke-virtual {v5}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v10

    .line 776
    const/4 v0, 0x0

    iput v0, v10, Landroid/os/Message;->what:I

    .line 777
    iput-object v9, v10, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 778
    invoke-virtual {v5, v10}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 779
    goto :goto_3

    .line 780
    :cond_4
    const-string v0, "UIHLH_AchievementCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "bmp is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 783
    :goto_3
    return-void
.end method

.method static synthetic t(Lo/epf;)Ljava/lang/String;
    .locals 1

    .line 125
    iget-object v0, p0, Lo/epf;->I:Ljava/lang/String;

    return-object v0
.end method

.method private t()V
    .locals 5

    .line 721
    :try_start_0
    iget-object v0, p0, Lo/epf;->g:Landroid/support/v4/content/LocalBroadcastManager;

    iget-object v1, p0, Lo/epf;->z:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/support/v4/content/LocalBroadcastManager;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1

    .line 726
    goto :goto_0

    .line 722
    :catch_0
    move-exception v4

    .line 723
    const-string v0, "UIHLH_AchievementCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/lang/IllegalArgumentException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 726
    goto :goto_0

    .line 724
    :catch_1
    move-exception v4

    .line 725
    const-string v0, "UIHLH_AchievementCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/lang/RuntimeException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 727
    :goto_0
    return-void
.end method

.method static synthetic u(Lo/epf;)I
    .locals 1

    .line 125
    iget v0, p0, Lo/epf;->H:I

    return v0
.end method

.method private u()V
    .locals 5

    .line 653
    :try_start_0
    iget-object v0, p0, Lo/epf;->b:Landroid/content/Context;

    iget-object v1, p0, Lo/epf;->y:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 654
    iget-object v0, p0, Lo/epf;->g:Landroid/support/v4/content/LocalBroadcastManager;

    iget-object v1, p0, Lo/epf;->y:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/support/v4/content/LocalBroadcastManager;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1

    .line 659
    goto :goto_0

    .line 655
    :catch_0
    move-exception v4

    .line 656
    const-string v0, "UIHLH_AchievementCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/lang/IllegalArgumentException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 659
    goto :goto_0

    .line 657
    :catch_1
    move-exception v4

    .line 658
    const-string v0, "UIHLH_AchievementCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/lang/RuntimeException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 660
    :goto_0
    return-void
.end method

.method private v()V
    .locals 5

    .line 797
    const-string v0, "UIHLH_AchievementCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "unregister weather report BI broadcast"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 799
    :try_start_0
    iget-object v0, p0, Lo/epf;->b:Landroid/content/Context;

    iget-object v1, p0, Lo/epf;->v:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1

    .line 804
    goto :goto_0

    .line 800
    :catch_0
    move-exception v4

    .line 801
    const-string v0, "UIHLH_AchievementCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/lang/IllegalArgumentException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 804
    goto :goto_0

    .line 802
    :catch_1
    move-exception v4

    .line 803
    const-string v0, "UIHLH_AchievementCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/lang/RuntimeException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 805
    :goto_0
    return-void
.end method

.method private w()V
    .locals 1

    .line 853
    sget-object v0, Lo/epf;->s:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 854
    sget-object v0, Lo/epf;->t:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 855
    sget-object v0, Lo/epf;->s:Ljava/util/HashMap;

    invoke-static {v0}, Lo/dzt;->a(Ljava/util/Map;)V

    .line 856
    sget-object v0, Lo/epf;->t:Ljava/util/HashMap;

    invoke-static {v0}, Lo/dzt;->c(Ljava/util/Map;)V

    .line 857
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dwr;->b(Landroid/content/Context;)Lo/dwr;

    move-result-object v0

    iput-object v0, p0, Lo/epf;->q:Lo/dwr;

    .line 858
    iget-object v0, p0, Lo/epf;->q:Lo/dwr;

    invoke-virtual {v0, p0}, Lo/dwr;->b(Lo/dui;)V

    .line 859
    return-void
.end method

.method private x()V
    .locals 2

    .line 865
    iget-object v0, p0, Lo/epf;->q:Lo/dwr;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 866
    iget-object v0, p0, Lo/epf;->q:Lo/dwr;

    invoke-virtual {v0}, Lo/dwr;->l()V

    .line 868
    :cond_0
    return-void
.end method

.method private y()V
    .locals 2

    .line 887
    iget-object v0, p0, Lo/epf;->q:Lo/dwr;

    if-nez v0, :cond_0

    .line 888
    const-string v0, "UIHLH_AchievementCardData"

    const-string v1, "mService is null"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 890
    :cond_0
    invoke-direct {p0}, Lo/epf;->D()V

    .line 892
    :goto_0
    return-void
.end method

.method private z()V
    .locals 5

    .line 788
    const-string v0, "UIHLH_AchievementCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "register weather report BI broadcast"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 789
    new-instance v4, Landroid/content/IntentFilter;

    invoke-direct {v4}, Landroid/content/IntentFilter;-><init>()V

    .line 790
    const-string v0, "com.huawei.health.action.ACTION_HWWEATHER_BI_CHANGE"

    invoke-virtual {v4, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 791
    iget-object v0, p0, Lo/epf;->b:Landroid/content/Context;

    iget-object v1, p0, Lo/epf;->v:Landroid/content/BroadcastReceiver;

    sget-object v2, Lo/dac;->a:Ljava/lang/String;

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v4, v2, v3}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Ljava/lang/String;Landroid/os/Handler;)Landroid/content/Intent;

    .line 792
    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 237
    invoke-super {p0}, Lo/epg;->a()V

    .line 238
    invoke-direct {p0}, Lo/epf;->x()V

    .line 240
    invoke-direct {p0}, Lo/epf;->u()V

    .line 241
    invoke-direct {p0}, Lo/epf;->t()V

    .line 242
    invoke-direct {p0}, Lo/epf;->v()V

    .line 243
    invoke-virtual {p0}, Lo/epf;->h()V

    .line 244
    invoke-static {}, Lo/dbf;->q()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 245
    invoke-direct {p0}, Lo/epf;->j()V

    .line 248
    :cond_0
    iget-object v0, p0, Lo/epf;->q:Lo/dwr;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 249
    iget-object v0, p0, Lo/epf;->q:Lo/dwr;

    invoke-virtual {v0, p0}, Lo/dwr;->d(Lo/dui;)V

    .line 250
    const/4 v0, 0x0

    iput-object v0, p0, Lo/epf;->q:Lo/dwr;

    .line 253
    :cond_1
    iget-object v0, p0, Lo/epf;->h:Ljava/util/concurrent/ExecutorService;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 254
    iget-object v0, p0, Lo/epf;->h:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 255
    const/4 v0, 0x0

    iput-object v0, p0, Lo/epf;->h:Ljava/util/concurrent/ExecutorService;

    .line 258
    :cond_2
    iget-object v0, p0, Lo/epf;->f:Landroid/os/Handler;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 259
    iget-object v0, p0, Lo/epf;->f:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 260
    const/4 v0, 0x0

    iput-object v0, p0, Lo/epf;->f:Landroid/os/Handler;

    .line 263
    :cond_3
    const/4 v0, 0x0

    iput-object v0, p0, Lo/epf;->r:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 264
    const/4 v0, 0x0

    iput-object v0, p0, Lo/epf;->d:Lo/epi;

    .line 265
    const/4 v0, 0x0

    iput-object v0, p0, Lo/epf;->g:Landroid/support/v4/content/LocalBroadcastManager;

    .line 266
    return-void
.end method

.method public b(Landroid/view/ViewGroup;Landroid/view/LayoutInflater;)Landroid/support/v7/widget/RecyclerView$ViewHolder;
    .locals 2

    .line 369
    const-string v0, "UIHLH_AchievementCardData"

    const-string v1, "-getCardViewHolder enter"

    invoke-static {v0, v1}, Lo/dbf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 370
    invoke-super {p0, p1, p2}, Lo/epg;->b(Landroid/view/ViewGroup;Landroid/view/LayoutInflater;)Landroid/support/v7/widget/RecyclerView$ViewHolder;

    move-result-object v0

    check-cast v0, Lo/epi;

    iput-object v0, p0, Lo/epf;->d:Lo/epi;

    .line 371
    iget-object v0, p0, Lo/epf;->d:Lo/epi;

    iget-object v0, v0, Lo/epi;->c:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 372
    iget-object v0, p0, Lo/epf;->d:Lo/epi;

    iget-object v0, v0, Lo/epi;->e:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 373
    iget-object v0, p0, Lo/epf;->d:Lo/epi;

    iget-object v0, v0, Lo/epi;->k:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 374
    iget-object v0, p0, Lo/epf;->d:Lo/epi;

    iget-object v0, v0, Lo/epi;->d:Landroid/widget/ImageView;

    invoke-virtual {v0, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 376
    iget-object v0, p0, Lo/epf;->d:Lo/epi;

    iget-object v0, v0, Lo/epi;->n:Lo/egb;

    invoke-virtual {v0, p0}, Lo/egb;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 377
    iget-object v0, p0, Lo/epf;->d:Lo/epi;

    iget-object v0, v0, Lo/epi;->r:Lo/egb;

    invoke-virtual {v0, p0}, Lo/egb;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 381
    iget-object v0, p0, Lo/epf;->d:Lo/epi;

    invoke-virtual {v0}, Lo/epi;->d()V

    .line 383
    invoke-virtual {p0}, Lo/epf;->b()V

    .line 385
    const-string v0, "UIHLH_AchievementCardData"

    const-string v1, "-getCardViewHolder end"

    invoke-static {v0, v1}, Lo/dbf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 386
    iget-object v0, p0, Lo/epf;->d:Lo/epi;

    return-object v0
.end method

.method public b()V
    .locals 2

    .line 619
    iget-object v0, p0, Lo/epf;->h:Ljava/util/concurrent/ExecutorService;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 620
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lo/epf;->h:Ljava/util/concurrent/ExecutorService;

    .line 622
    :cond_0
    iget-object v0, p0, Lo/epf;->h:Ljava/util/concurrent/ExecutorService;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 623
    iget-object v0, p0, Lo/epf;->h:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lo/epf$10;

    invoke-direct {v1, p0}, Lo/epf$10;-><init>(Lo/epf;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 632
    :cond_1
    return-void
.end method

.method public c()V
    .locals 2

    .line 511
    iget-object v0, p0, Lo/epf;->h:Ljava/util/concurrent/ExecutorService;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 512
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lo/epf;->h:Ljava/util/concurrent/ExecutorService;

    .line 514
    :cond_0
    iget-object v0, p0, Lo/epf;->h:Ljava/util/concurrent/ExecutorService;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 515
    iget-object v0, p0, Lo/epf;->h:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lo/epf$4;

    invoke-direct {v1, p0}, Lo/epf$4;-><init>(Lo/epf;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 522
    :cond_1
    return-void
.end method

.method public d()V
    .locals 4

    .line 188
    invoke-super {p0}, Lo/epg;->d()V

    .line 189
    const-string v0, "UIHLH_AchievementCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "====onResume===="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 190
    invoke-virtual {p0}, Lo/epf;->b()V

    .line 193
    iget-boolean v0, p0, Lo/epf;->m:Z

    if-eqz v0, :cond_0

    .line 194
    const-string v0, "UIHLH_AchievementCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "refresh headImage and name."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 195
    iget-object v0, p0, Lo/epf;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/dnm;->a(Landroid/content/Context;)Lo/dnm;

    move-result-object v0

    iget-object v1, p0, Lo/epf;->e:Lcom/huawei/up/callback/CommonCallback;

    invoke-virtual {v0, v1}, Lo/dnm;->d(Lcom/huawei/up/callback/CommonCallback;)V

    .line 196
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/epf;->m:Z

    .line 198
    :cond_0
    iget-object v0, p0, Lo/epf;->d:Lo/epi;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lo/epf;->d:Lo/epi;

    iget-object v0, v0, Lo/epi;->m:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_1

    .line 199
    iget-object v0, p0, Lo/epf;->d:Lo/epi;

    iget-object v0, v0, Lo/epi;->m:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 201
    :cond_1
    invoke-static {}, Lo/dbf;->q()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 202
    invoke-static {}, Lo/etq;->d()Lo/etq;

    move-result-object v0

    invoke-virtual {v0}, Lo/etq;->b()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 203
    invoke-static {}, Lo/etq;->d()Lo/etq;

    move-result-object v0

    invoke-virtual {v0}, Lo/etq;->b()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceConnectState()I

    move-result v0

    const/4 v1, 0x2

    if-ne v1, v0, :cond_2

    .line 204
    invoke-direct {p0}, Lo/epf;->G()V

    .line 205
    invoke-static {}, Lo/etq;->d()Lo/etq;

    move-result-object v0

    iget-object v1, p0, Lo/epf;->r:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-virtual {v0, v1}, Lo/etq;->a(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 207
    invoke-direct {p0}, Lo/epf;->H()V

    .line 209
    invoke-direct {p0}, Lo/epf;->K()V

    .line 211
    :cond_2
    invoke-direct {p0}, Lo/epf;->B()V

    .line 213
    :cond_3
    return-void
.end method

.method public d(Z)V
    .locals 4

    .line 231
    const-string v0, "UIHLH_AchievementCardData"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "visibleHint = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 232
    iput-boolean p1, p0, Lo/epf;->l:Z

    .line 233
    return-void
.end method

.method public e()V
    .locals 9

    .line 1060
    iget-object v0, p0, Lo/epf;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->e(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1061
    const-string v0, "UIHLH_AchievementCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showAchieveCardDeviceTips isChineseSimplifiedLocal false"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1062
    return-void

    .line 1064
    :cond_0
    iget-object v0, p0, Lo/epf;->b:Landroid/content/Context;

    check-cast v0, Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->isDestroyed()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lo/epf;->b:Landroid/content/Context;

    check-cast v0, Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1065
    :cond_1
    const-string v0, "UIHLH_AchievementCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Activity isDestroyed or isFinishing"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1066
    return-void

    .line 1068
    :cond_2
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "is_show_achieve_device_tips"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 1069
    const-string v0, "UIHLH_AchievementCardData"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "tips = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v5, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1070
    const-string v0, "1"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 1071
    iget-object v0, p0, Lo/epf;->b:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/homehealth/R$layout;->home_achievement_card_tips:I

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v6

    .line 1072
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-virtual {v6, v0, v1}, Landroid/view/View;->measure(II)V

    .line 1073
    new-instance v7, Landroid/widget/PopupWindow;

    const/4 v0, -0x2

    const/4 v1, -0x2

    const/4 v2, 0x1

    invoke-direct {v7, v6, v0, v1, v2}, Landroid/widget/PopupWindow;-><init>(Landroid/view/View;IIZ)V

    .line 1075
    new-instance v0, Landroid/graphics/drawable/BitmapDrawable;

    invoke-direct {v0}, Landroid/graphics/drawable/BitmapDrawable;-><init>()V

    invoke-virtual {v7, v0}, Landroid/widget/PopupWindow;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 1076
    const-string v0, "UIHLH_AchievementCardData"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isShowTips = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-boolean v2, p0, Lo/epf;->l:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1077
    iget-object v0, p0, Lo/epf;->d:Lo/epi;

    iget-object v0, v0, Lo/epi;->o:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->isShown()Z

    move-result v8

    .line 1078
    const-string v0, "UIHLH_AchievementCardData"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mAchievementCardViewHolder.mUserDeviceIconDefault.isShown() = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v8}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1079
    if-eqz v8, :cond_3

    iget-boolean v0, p0, Lo/epf;->l:Z

    if-eqz v0, :cond_3

    .line 1080
    iget-object v0, p0, Lo/epf;->d:Lo/epi;

    iget-object v0, v0, Lo/epi;->o:Landroid/widget/ImageView;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/widget/ImageView;->measure(II)V

    .line 1081
    iget-object v0, p0, Lo/epf;->d:Lo/epi;

    iget-object v0, v0, Lo/epi;->o:Landroid/widget/ImageView;

    iget-object v1, p0, Lo/epf;->d:Lo/epi;

    iget-object v1, v1, Lo/epi;->o:Landroid/widget/ImageView;

    invoke-virtual {v1}, Landroid/widget/ImageView;->getMeasuredWidth()I

    move-result v1

    iget-object v2, p0, Lo/epf;->b:Landroid/content/Context;

    const/high16 v3, 0x41200000    # 10.0f

    invoke-static {v2, v3}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v2

    add-int/2addr v1, v2

    invoke-virtual {v6}, Landroid/view/View;->getMeasuredWidth()I

    move-result v2

    sub-int/2addr v1, v2

    const/4 v2, 0x0

    invoke-virtual {v7, v0, v1, v2}, Landroid/widget/PopupWindow;->showAsDropDown(Landroid/view/View;II)V

    .line 1082
    iget-object v0, p0, Lo/epf;->b:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "is_show_achieve_device_tips"

    const-string v3, "1"

    new-instance v4, Lo/dcy;

    invoke-direct {v4}, Lo/dcy;-><init>()V

    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 1085
    :cond_3
    return-void
.end method

.method public e(ILo/dwk;)V
    .locals 2

    .line 878
    const-string v0, "UIHLH_AchievementCardData"

    const-string v1, "onDataChanged start"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 879
    invoke-virtual {p2}, Lo/dwk;->l()I

    move-result v0

    const/16 v1, 0xd

    if-ne v0, v1, :cond_0

    invoke-virtual {p2}, Lo/dwk;->a()Lo/dvj;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 880
    invoke-direct {p0}, Lo/epf;->y()V

    .line 881
    const-string v0, "UIHLH_AchievementCardData"

    const-string v1, "onDataChanged finish"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 884
    :cond_0
    return-void
.end method

.method public h()V
    .locals 5

    .line 1102
    iget-object v0, p0, Lo/epf;->C:Landroid/content/BroadcastReceiver;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 1104
    :try_start_0
    iget-object v0, p0, Lo/epf;->b:Landroid/content/Context;

    invoke-static {v0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v4

    .line 1105
    if-eqz v4, :cond_0

    .line 1106
    iget-object v0, p0, Lo/epf;->C:Landroid/content/BroadcastReceiver;

    invoke-virtual {v4, v0}, Landroid/support/v4/content/LocalBroadcastManager;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 1107
    const-string v0, "UIHLH_AchievementCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "unregister HiBroadcasetReceiver"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 1109
    :cond_0
    const-string v0, "UIHLH_AchievementCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mLocalBroadcastManager null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1114
    :goto_0
    goto :goto_1

    .line 1112
    :catch_0
    move-exception v4

    .line 1113
    const-string v0, "UIHLH_AchievementCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "IllegalArgumentException mHiBroadcasetReceiver unregister"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1116
    :cond_1
    :goto_1
    return-void
.end method

.method public k()V
    .locals 5

    .line 1444
    const-string v0, "UIHLH_AchievementCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "registUpdateState()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1445
    new-instance v4, Landroid/content/IntentFilter;

    invoke-direct {v4}, Landroid/content/IntentFilter;-><init>()V

    .line 1446
    const-string v0, "action_band_auto_check_new_version_result"

    invoke-virtual {v4, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 1447
    const-string v0, "action_music_control_start_music_app"

    invoke-virtual {v4, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 1448
    iget-object v0, p0, Lo/epf;->b:Landroid/content/Context;

    iget-object v1, p0, Lo/epf;->P:Landroid/content/BroadcastReceiver;

    sget-object v2, Lo/dac;->a:Ljava/lang/String;

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v4, v2, v3}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Ljava/lang/String;Landroid/os/Handler;)Landroid/content/Intent;

    .line 1449
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 11

    .line 270
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/huawei/ui/homehealth/R$id;->achieve_user_cumulative_kaka:I

    if-ne v0, v1, :cond_0

    .line 271
    const-string v0, "UIHLH_AchievementCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "gotoAchieveKaKa"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 272
    iget-object v0, p0, Lo/epf;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/dth;->b(Landroid/content/Context;)Lo/dth;

    move-result-object v0

    iget-object v1, p0, Lo/epf;->b:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lo/dth;->e(Landroid/content/Context;)V

    .line 273
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 274
    const-string v0, "click"

    const-string v1, "1"

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 275
    sget-object v0, Lo/dae;->bR:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v5

    .line 276
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lo/epf;->b:Landroid/content/Context;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v5, v4, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 277
    goto/16 :goto_1

    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/huawei/ui/homehealth/R$id;->achieve_user_cumulative_layout:I

    if-ne v0, v1, :cond_1

    .line 278
    const-string v0, "UIHLH_AchievementCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "gotoSportHistory"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 281
    new-instance v4, Landroid/content/Intent;

    iget-object v0, p0, Lo/epf;->b:Landroid/content/Context;

    const-class v1, Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity;

    invoke-direct {v4, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 282
    iget-object v0, p0, Lo/epf;->b:Landroid/content/Context;

    invoke-virtual {v0, v4}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 283
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 284
    const-string v0, "click"

    const-string v1, "1"

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 285
    sget-object v0, Lo/dae;->bP:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v6

    .line 286
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lo/epf;->b:Landroid/content/Context;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v6, v5, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 287
    goto/16 :goto_1

    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/huawei/ui/homehealth/R$id;->achieve_user_device_icon_default:I

    if-ne v0, v1, :cond_2

    .line 288
    iget-object v0, p0, Lo/epf;->b:Landroid/content/Context;

    invoke-direct {p0, v0}, Lo/epf;->e(Landroid/content/Context;)V

    .line 289
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 290
    const-string v0, "click"

    const-string v1, "1"

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 291
    const-string v0, "type"

    const-string v1, "0"

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 292
    sget-object v0, Lo/dae;->bY:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v5

    .line 293
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lo/epf;->b:Landroid/content/Context;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v5, v4, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 294
    goto/16 :goto_1

    :cond_2
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/huawei/ui/homehealth/R$id;->achieve_user_device:I

    if-ne v0, v1, :cond_7

    .line 295
    invoke-static {}, Lo/ene;->a()Z

    move-result v0

    if-nez v0, :cond_6

    .line 297
    const-string v0, "UIHLH_AchievementCardData"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "gotoDevicePage "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget v2, p0, Lo/epf;->k:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget v2, p0, Lo/epf;->p:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 298
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 299
    const-string v0, "click"

    const-string v1, "1"

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 300
    iget v0, p0, Lo/epf;->k:I

    iget v1, p0, Lo/epf;->p:I

    add-int/2addr v0, v1

    const/4 v1, 0x1

    if-le v0, v1, :cond_3

    .line 301
    const-string v0, "type"

    const-string v1, "1"

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 302
    iget-object v0, p0, Lo/epf;->b:Landroid/content/Context;

    invoke-direct {p0, v0}, Lo/epf;->a(Landroid/content/Context;)V

    goto :goto_0

    .line 303
    :cond_3
    iget v0, p0, Lo/epf;->k:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_4

    iget v0, p0, Lo/epf;->p:I

    if-nez v0, :cond_4

    .line 304
    const-string v0, "type"

    const-string v1, "2"

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 305
    iget-object v0, p0, Lo/epf;->b:Landroid/content/Context;

    invoke-direct {p0, v0}, Lo/epf;->b(Landroid/content/Context;)V

    goto :goto_0

    .line 306
    :cond_4
    iget v0, p0, Lo/epf;->k:I

    if-nez v0, :cond_5

    iget v0, p0, Lo/epf;->p:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_5

    .line 307
    const-string v0, "type"

    const-string v1, "3"

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 308
    iget-object v0, p0, Lo/epf;->b:Landroid/content/Context;

    iget-object v1, p0, Lo/epf;->o:Ljava/lang/String;

    invoke-direct {p0, v0, v1}, Lo/epf;->a(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_0

    .line 310
    :cond_5
    const-string v0, "type"

    const-string v1, "0"

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 311
    iget-object v0, p0, Lo/epf;->b:Landroid/content/Context;

    invoke-direct {p0, v0}, Lo/epf;->e(Landroid/content/Context;)V

    .line 313
    :goto_0
    sget-object v0, Lo/dae;->bY:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v5

    .line 314
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lo/epf;->b:Landroid/content/Context;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v5, v4, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 315
    goto/16 :goto_1

    .line 316
    :cond_6
    const-string v0, "UIHLH_AchievementCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "click too fast"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 317
    return-void

    .line 320
    :cond_7
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/huawei/ui/homehealth/R$id;->user_profile_user_head_img:I

    if-ne v0, v1, :cond_e

    .line 321
    invoke-static {}, Lo/dbf;->b()Z

    move-result v0

    if-eqz v0, :cond_8

    .line 322
    const-string v0, "UIHLH_AchievementCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "storedemo no user"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 323
    return-void

    .line 325
    :cond_8
    iget-object v0, p0, Lo/epf;->b:Landroid/content/Context;

    const/16 v1, 0x271f

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "if_need_set_account_login_entry"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 326
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_a

    const-string v0, "1"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-static {}, Lo/czu;->i()Z

    move-result v0

    if-nez v0, :cond_a

    .line 327
    const-string v0, "UIHLH_AchievementCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "send broadcast to checkLogin..."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 328
    new-instance v5, Landroid/content/Intent;

    invoke-direct {v5}, Landroid/content/Intent;-><init>()V

    .line 329
    const-string v0, "com.huawei.plugin.trigger.checklogin"

    invoke-virtual {v5, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 330
    iget-object v0, p0, Lo/epf;->b:Landroid/content/Context;

    invoke-static {v0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_9

    .line 331
    iget-object v0, p0, Lo/epf;->b:Landroid/content/Context;

    invoke-static {v0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/support/v4/content/LocalBroadcastManager;->sendBroadcast(Landroid/content/Intent;)Z

    .line 333
    :cond_9
    return-void

    .line 335
    :cond_a
    iget-object v0, p0, Lo/epf;->b:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "health_app_third_login"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 336
    iget-object v0, p0, Lo/epf;->b:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;->checkIsInstallHuaweiAccount(Landroid/content/Context;)Z

    move-result v6

    .line 337
    const-string v0, "UIHLH_AchievementCardData"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: hasHwid = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 338
    const-string v0, "1"

    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_b

    if-nez v6, :cond_c

    .line 339
    :cond_b
    const-string v0, "UIHLH_AchievementCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: isthirdlogin == 1 and return!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 340
    return-void

    .line 342
    :cond_c
    new-instance v7, Lcom/huawei/up/api/UpApi;

    iget-object v0, p0, Lo/epf;->b:Landroid/content/Context;

    invoke-direct {v7, v0}, Lcom/huawei/up/api/UpApi;-><init>(Landroid/content/Context;)V

    .line 343
    iget-object v0, p0, Lo/epf;->b:Landroid/content/Context;

    check-cast v0, Landroid/app/Activity;

    const/16 v1, 0x270f

    invoke-virtual {v7, v0, v1}, Lcom/huawei/up/api/UpApi;->jumpToHwIdAccountCenter(Landroid/app/Activity;I)I

    move-result v8

    .line 344
    const-string v0, "UIHLH_AchievementCardData"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "health, jumpToHwIdAccountCenter, errorCode = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 345
    const/4 v0, 0x0

    if-ne v0, v8, :cond_d

    .line 346
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/epf;->m:Z

    .line 348
    :cond_d
    new-instance v9, Ljava/util/HashMap;

    invoke-direct {v9}, Ljava/util/HashMap;-><init>()V

    .line 349
    sget-object v0, Lo/dae;->bT:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v10

    .line 350
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lo/epf;->b:Landroid/content/Context;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v10, v9, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 351
    goto/16 :goto_1

    :cond_e
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/huawei/ui/homehealth/R$id;->btn_update_top_open:I

    if-ne v0, v1, :cond_f

    .line 352
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 353
    const-string v0, "type"

    const-string v1, "1"

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 354
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    sget-object v2, Lo/dae;->cd:Lo/dae;

    invoke-virtual {v2}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v4, v3}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 355
    iget-object v0, p0, Lo/epf;->d:Lo/epi;

    iget-object v0, v0, Lo/epi;->m:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 356
    invoke-direct {p0}, Lo/epf;->J()V

    .line 357
    iget-object v0, p0, Lo/epf;->b:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/homehealth/R$string;->IDS_already_open_wlan_auto_download_update_tips:I

    invoke-static {v0, v1}, Lo/emv;->c(Landroid/content/Context;I)V

    .line 358
    goto :goto_1

    :cond_f
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/huawei/ui/homehealth/R$id;->btn_update_top_cancle:I

    if-ne v0, v1, :cond_10

    .line 359
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 360
    const-string v0, "type"

    const-string v1, "0"

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 361
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    sget-object v2, Lo/dae;->cd:Lo/dae;

    invoke-virtual {v2}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v4, v3}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 362
    iget-object v0, p0, Lo/epf;->d:Lo/epi;

    iget-object v0, v0, Lo/epi;->m:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 363
    iget-object v0, p0, Lo/epf;->b:Landroid/content/Context;

    invoke-direct {p0, v0}, Lo/epf;->c(Landroid/content/Context;)V

    .line 365
    :cond_10
    :goto_1
    return-void
.end method
