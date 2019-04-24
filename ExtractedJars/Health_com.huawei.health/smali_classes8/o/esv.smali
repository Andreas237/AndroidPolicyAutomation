.class public Lo/esv;
.super Lo/esu;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/esv$a;,
        Lo/esv$c;,
        Lo/esv$b;,
        Lo/esv$d;,
        Lo/esv$e;,
        Lo/esv$h;
    }
.end annotation


# static fields
.field private static u:I


# instance fields
.field private A:I

.field private B:Lo/egw;

.field private C:Lo/esv$a;

.field private D:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation
.end field

.field private E:Lo/esv$d;

.field private F:Lo/egw;

.field private G:Lo/xj;

.field private H:Lo/esv$e;

.field private I:Z

.field private N:Landroid/content/BroadcastReceiver;

.field private final b:J

.field private d:Lo/esx;

.field private e:Lo/cmj;

.field private f:Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;

.field private g:Landroid/content/Context;

.field private h:I

.field private j:Lo/cmo;

.field private k:I

.field private l:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/eut;>;"
        }
    .end annotation
.end field

.field private m:I

.field private n:I

.field private o:I

.field private p:I

.field private q:Lo/esy;

.field private r:Lo/esw;

.field private s:Landroid/os/Handler;

.field private t:I

.field private v:Z

.field private w:Z

.field private x:Landroid/content/BroadcastReceiver;

.field private y:Ljava/util/concurrent/ExecutorService;

.field private z:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 168
    const/4 v0, 0x0

    sput v0, Lo/esv;->u:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 244
    invoke-direct {p0, p1}, Lo/esu;-><init>(Landroid/content/Context;)V

    .line 108
    invoke-static {}, Lo/dbu;->c()Ljava/util/Date;

    move-result-object v0

    invoke-static {v0}, Lo/dbu;->f(Ljava/util/Date;)J

    move-result-wide v0

    iput-wide v0, p0, Lo/esv;->b:J

    .line 116
    const/4 v0, 0x0

    iput-object v0, p0, Lo/esv;->e:Lo/cmj;

    .line 117
    const/4 v0, 0x0

    iput-object v0, p0, Lo/esv;->d:Lo/esx;

    .line 119
    const/16 v0, 0x2710

    iput v0, p0, Lo/esv;->h:I

    .line 120
    new-instance v0, Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;

    invoke-direct {v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;-><init>()V

    iput-object v0, p0, Lo/esv;->f:Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;

    .line 121
    const/16 v0, 0x1e

    iput v0, p0, Lo/esv;->k:I

    .line 122
    const/4 v0, 0x0

    iput v0, p0, Lo/esv;->o:I

    .line 123
    const/4 v0, 0x0

    iput v0, p0, Lo/esv;->p:I

    .line 124
    const/4 v0, 0x0

    iput v0, p0, Lo/esv;->m:I

    .line 125
    const/4 v0, 0x0

    iput v0, p0, Lo/esv;->n:I

    .line 126
    const/4 v0, 0x0

    iput-object v0, p0, Lo/esv;->l:Ljava/util/List;

    .line 127
    const/4 v0, 0x0

    iput-object v0, p0, Lo/esv;->q:Lo/esy;

    .line 128
    const/4 v0, 0x0

    iput-object v0, p0, Lo/esv;->r:Lo/esw;

    .line 169
    const/4 v0, 0x0

    iput v0, p0, Lo/esv;->t:I

    .line 173
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/esv;->w:Z

    .line 174
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/esv;->z:Z

    .line 181
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/esv;->v:Z

    .line 182
    new-instance v0, Lo/esv$h;

    invoke-direct {v0, p0}, Lo/esv$h;-><init>(Lo/esv;)V

    iput-object v0, p0, Lo/esv;->x:Landroid/content/BroadcastReceiver;

    .line 198
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/esv;->D:Ljava/util/List;

    .line 202
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/esv;->I:Z

    .line 862
    new-instance v0, Lo/esv$e;

    invoke-direct {v0, p0}, Lo/esv$e;-><init>(Lo/esv;)V

    iput-object v0, p0, Lo/esv;->H:Lo/esv$e;

    .line 921
    new-instance v0, Lo/esv$d;

    invoke-direct {v0, p0}, Lo/esv$d;-><init>(Lo/esv;)V

    iput-object v0, p0, Lo/esv;->E:Lo/esv$d;

    .line 1652
    new-instance v0, Lo/esv$10;

    invoke-direct {v0, p0}, Lo/esv$10;-><init>(Lo/esv;)V

    iput-object v0, p0, Lo/esv;->G:Lo/xj;

    .line 2090
    new-instance v0, Lo/esv$4;

    invoke-direct {v0, p0}, Lo/esv$4;-><init>(Lo/esv;)V

    iput-object v0, p0, Lo/esv;->N:Landroid/content/BroadcastReceiver;

    .line 245
    const-string v0, "TimeEat_StepsCardDataEnter StepsCardData"

    invoke-static {v0}, Lo/dbf;->d(Ljava/lang/String;)V

    .line 246
    iput-object p1, p0, Lo/esv;->g:Landroid/content/Context;

    .line 247
    new-instance v0, Lo/esv$b;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1, p0}, Lo/esv$b;-><init>(Landroid/os/Looper;Lo/esv;)V

    iput-object v0, p0, Lo/esv;->s:Landroid/os/Handler;

    .line 248
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-nez v0, :cond_0

    .line 249
    invoke-static {p1}, Lo/esy;->a(Landroid/content/Context;)Lo/esy;

    move-result-object v0

    iput-object v0, p0, Lo/esv;->q:Lo/esy;

    .line 251
    :cond_0
    invoke-static {}, Lo/esw;->a()Lo/esw;

    move-result-object v0

    iput-object v0, p0, Lo/esv;->r:Lo/esw;

    .line 252
    iget-object v0, p0, Lo/esv;->r:Lo/esw;

    iget-object v1, p0, Lo/esv;->s:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Lo/esw;->a(Landroid/os/Handler;)V

    .line 253
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lo/esv;->y:Ljava/util/concurrent/ExecutorService;

    .line 255
    invoke-direct {p0}, Lo/esv;->C()V

    .line 258
    invoke-direct {p0}, Lo/esv;->i()V

    .line 260
    const-string v0, "TimeEat_StepsCardDataLeave StepsCardData"

    invoke-static {v0}, Lo/dbf;->d(Ljava/lang/String;)V

    .line 261
    return-void
.end method

.method private A()V
    .locals 8

    .line 735
    const-string v0, "SCUI_StepsCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showFitnessDataOriginDialog()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 738
    iget-object v0, p0, Lo/esv;->a:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "data_origin_icon_red_dot"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 740
    const-string v0, ""

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 741
    iget-object v0, p0, Lo/esv;->d:Lo/esx;

    iget-object v0, v0, Lo/esx;->j:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/homehealth/R$drawable;->ic_home_data_origin:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 743
    iget-object v0, p0, Lo/esv;->a:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "data_origin_icon_red_dot"

    const-string v3, "false"

    new-instance v4, Lo/dcy;

    invoke-direct {v4}, Lo/dcy;-><init>()V

    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 746
    :cond_0
    iget-object v0, p0, Lo/esv;->B:Lo/egw;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lo/esv;->B:Lo/egw;

    invoke-virtual {v0}, Lo/egw;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 747
    iget-object v0, p0, Lo/esv;->B:Lo/egw;

    invoke-virtual {v0}, Lo/egw;->dismiss()V

    goto :goto_0

    .line 749
    :cond_1
    new-instance v6, Lo/egw$c;

    iget-object v0, p0, Lo/esv;->a:Landroid/content/Context;

    invoke-direct {v6, v0}, Lo/egw$c;-><init>(Landroid/content/Context;)V

    .line 750
    new-instance v7, Lo/ess;

    iget-object v0, p0, Lo/esv;->a:Landroid/content/Context;

    invoke-direct {v7, v0}, Lo/ess;-><init>(Landroid/content/Context;)V

    .line 751
    iget-object v0, p0, Lo/esv;->l:Ljava/util/List;

    invoke-virtual {v7, v0}, Lo/ess;->setmListdata(Ljava/util/List;)V

    .line 752
    iget-object v0, p0, Lo/esv;->a:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/homehealth/R$string;->IDS_steps_data_source:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lo/egw$c;->a(Ljava/lang/String;)Lo/egw$c;

    move-result-object v0

    .line 753
    invoke-virtual {v0, v7}, Lo/egw$c;->e(Landroid/view/View;)Lo/egw$c;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$string;->IDS_common_notification_know_tips:I

    new-instance v2, Lo/esv$7;

    invoke-direct {v2, p0}, Lo/esv$7;-><init>(Lo/esv;)V

    .line 754
    invoke-virtual {v0, v1, v2}, Lo/egw$c;->b(ILandroid/view/View$OnClickListener;)Lo/egw$c;

    .line 760
    invoke-virtual {v6}, Lo/egw$c;->e()Lo/egw;

    move-result-object v0

    iput-object v0, p0, Lo/esv;->B:Lo/egw;

    .line 761
    iget-object v0, p0, Lo/esv;->B:Lo/egw;

    invoke-virtual {v0}, Lo/egw;->show()V

    .line 763
    :goto_0
    return-void
.end method

.method static synthetic A(Lo/esv;)Z
    .locals 1

    .line 105
    iget-boolean v0, p0, Lo/esv;->z:Z

    return v0
.end method

.method private B()V
    .locals 4

    .line 1669
    iget-object v0, p0, Lo/esv;->G:Lo/xj;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 1670
    const-string v0, "SCUI_StepsCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "openMessageObserver registerMessageObserver:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/esv;->G:Lo/xj;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1671
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/vu;->a(Landroid/content/Context;)Lo/vu;

    move-result-object v0

    iget-object v1, p0, Lo/esv;->G:Lo/xj;

    invoke-virtual {v0, v1}, Lo/vu;->d(Lo/xj;)V

    .line 1673
    :cond_0
    return-void
.end method

.method static synthetic B(Lo/esv;)V
    .locals 0

    .line 105
    invoke-direct {p0}, Lo/esv;->K()V

    return-void
.end method

.method private C()V
    .locals 6

    .line 1621
    iget-object v0, p0, Lo/esv;->a:Landroid/content/Context;

    invoke-static {v0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v4

    .line 1622
    new-instance v5, Landroid/content/IntentFilter;

    invoke-direct {v5}, Landroid/content/IntentFilter;-><init>()V

    .line 1623
    const-string v0, "com.huawei.hihealth.action_data_refresh"

    invoke-virtual {v5, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 1624
    const-string v0, "com.huawei.hihealth.action_sync_total_sport_data"

    invoke-virtual {v5, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 1625
    const-string v0, "android.intent.action.SCREEN_ON"

    invoke-virtual {v5, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 1626
    if-eqz v4, :cond_0

    .line 1627
    iget-object v0, p0, Lo/esv;->x:Landroid/content/BroadcastReceiver;

    invoke-virtual {v4, v0, v5}, Landroid/support/v4/content/LocalBroadcastManager;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V

    .line 1628
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/esv;->v:Z

    .line 1629
    const-string v0, "SCUI_StepsCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "hiBroadcasetReceiver register"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 1631
    :cond_0
    const-string v0, "SCUI_StepsCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "hiBroadcasetReceiver unregister!!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1633
    :goto_0
    return-void
.end method

.method private D()V
    .locals 4

    .line 1444
    iget-object v0, p0, Lo/esv;->d:Lo/esx;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lo/esv;->d:Lo/esx;

    iget-object v0, v0, Lo/esx;->j:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getVisibility()I

    move-result v0

    const/16 v1, 0x8

    if-ne v0, v1, :cond_0

    .line 1445
    const-string v0, "SCUI_StepsCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updateFitnessDataOrigin fitnessDataOrigin is gone before."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1446
    iget-object v0, p0, Lo/esv;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/exo;->d(Landroid/content/Context;)Lo/exo;

    move-result-object v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-static {v1, v2}, Lo/cnk;->d(J)J

    move-result-wide v1

    new-instance v3, Lo/esv$9;

    invoke-direct {v3, p0}, Lo/esv$9;-><init>(Lo/esv;)V

    invoke-virtual {v0, v1, v2, v3}, Lo/exo;->c(JLo/egg;)V

    .line 1456
    :cond_0
    return-void
.end method

.method static synthetic D(Lo/esv;)V
    .locals 0

    .line 105
    invoke-direct {p0}, Lo/esv;->A()V

    return-void
.end method

.method private E()V
    .locals 6

    .line 1724
    iget-object v0, p0, Lo/esv;->a:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "auto_synchronous_flag"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 1726
    const-string v0, "SCUI_StepsCardData"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "automaticswitch=="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1727
    const-string v0, "2"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1728
    const-string v0, "SCUI_StepsCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "user not allow automatic sync!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1729
    return-void

    .line 1731
    :cond_0
    new-instance v5, Lcom/huawei/hihealth/HiSyncOption;

    invoke-direct {v5}, Lcom/huawei/hihealth/HiSyncOption;-><init>()V

    .line 1732
    const/4 v0, 0x2

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/HiSyncOption;->setSyncModel(I)V

    .line 1733
    const/4 v0, 0x4

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/HiSyncOption;->setSyncAction(I)V

    .line 1734
    const/16 v0, 0x2714

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/HiSyncOption;->setSyncDataType(I)V

    .line 1735
    const/4 v0, 0x1

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/HiSyncOption;->setSyncScope(I)V

    .line 1736
    const/4 v0, 0x2

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/HiSyncOption;->setSyncMethod(I)V

    .line 1737
    const-string v0, "SCUI_StepsCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "syncSportData !"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1738
    iget-object v0, p0, Lo/esv;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    new-instance v1, Lo/esv$13;

    invoke-direct {v1, p0}, Lo/esv$13;-><init>(Lo/esv;)V

    invoke-interface {v0, v5, v1}, Lo/clt;->c(Lcom/huawei/hihealth/HiSyncOption;Lo/clz;)V

    .line 1748
    return-void
.end method

.method private F()V
    .locals 4

    .line 1676
    iget-object v0, p0, Lo/esv;->G:Lo/xj;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 1677
    const-string v0, "SCUI_StepsCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "closeMessageObserver unRegisterSocialObserver"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1678
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/vu;->a(Landroid/content/Context;)Lo/vu;

    move-result-object v0

    iget-object v1, p0, Lo/esv;->G:Lo/xj;

    invoke-virtual {v0, v1}, Lo/vu;->a(Lo/xj;)V

    .line 1680
    :cond_0
    return-void
.end method

.method private G()V
    .locals 4

    .line 1751
    iget-object v0, p0, Lo/esv;->s:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 1752
    iget-object v0, p0, Lo/esv;->s:Landroid/os/Handler;

    const/16 v1, 0x10

    invoke-virtual {v0, v1}, Landroid/os/Handler;->hasMessages(I)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1753
    iget v0, p0, Lo/esv;->t:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/esv;->t:I

    .line 1754
    const-string v0, "SCUI_StepsCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "retryRegister  mRegisterTimes="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/esv;->t:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1755
    iget v0, p0, Lo/esv;->t:I

    const/16 v1, 0xa

    if-gt v0, v1, :cond_0

    .line 1756
    iget-object v0, p0, Lo/esv;->s:Landroid/os/Handler;

    const/16 v1, 0x10

    const-wide/16 v2, 0xc8

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 1760
    :cond_0
    return-void
.end method

.method private H()V
    .locals 3

    .line 1763
    iget-object v0, p0, Lo/esv;->e:Lo/cmj;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/esv;->C:Lo/esv$a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/esv;->j:Lo/cmo;

    if-eqz v0, :cond_0

    .line 1764
    iget-object v0, p0, Lo/esv;->e:Lo/cmj;

    iget-object v1, p0, Lo/esv;->C:Lo/esv$a;

    iget-object v2, p0, Lo/esv;->j:Lo/cmo;

    invoke-virtual {v0, v1, v2}, Lo/cmj;->e(Lo/cmq;Lo/cmo;)Z

    .line 1766
    :cond_0
    return-void
.end method

.method private I()V
    .locals 6

    .line 1958
    const-string v0, "SCUI_StepsCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "closeCurrnetTips"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1960
    iget-object v0, p0, Lo/esv;->D:Ljava/util/List;

    if-nez v0, :cond_0

    .line 1961
    const-string v0, "SCUI_StepsCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "closeCurrnetTips find tipsList null,warnning!!! logic error??? return"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1962
    return-void

    .line 1966
    :cond_0
    iget-object v4, p0, Lo/esv;->D:Ljava/util/List;

    monitor-enter v4

    .line 1967
    :try_start_0
    iget-object v0, p0, Lo/esv;->D:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 1968
    iget-object v0, p0, Lo/esv;->d:Lo/esx;

    iget-object v0, v0, Lo/esx;->q:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 1969
    iget-object v0, p0, Lo/esv;->d:Lo/esx;

    iget-object v0, v0, Lo/esx;->y:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 1970
    const-string v0, "SCUI_StepsCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "closeCurrnetTips find no tips in list,warnning!!! logic error??? return"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1971
    monitor-exit v4

    return-void

    .line 1974
    :cond_1
    :try_start_1
    iget-object v0, p0, Lo/esv;->D:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-direct {p0, v0}, Lo/esv;->g(I)V

    .line 1976
    iget-object v0, p0, Lo/esv;->D:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 1977
    iget-object v0, p0, Lo/esv;->D:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-gtz v0, :cond_2

    .line 1978
    iget-object v0, p0, Lo/esv;->d:Lo/esx;

    iget-object v0, v0, Lo/esx;->q:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 1979
    iget-object v0, p0, Lo/esv;->d:Lo/esx;

    iget-object v0, v0, Lo/esx;->y:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 1980
    const-string v0, "SCUI_StepsCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "closeCurrnetTips,not have any more,set view gone"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1981
    monitor-exit v4

    return-void

    .line 1983
    :cond_2
    const-string v0, "SCUI_StepsCardData"

    const/4 v1, 0x2

    :try_start_2
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "displayTips:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/esv;->D:Ljava/util/List;

    const/4 v3, 0x0

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1984
    iget-object v0, p0, Lo/esv;->D:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-direct {p0, v0}, Lo/esv;->k(I)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 1985
    monitor-exit v4

    goto :goto_0

    :catchall_0
    move-exception v5

    monitor-exit v4

    throw v5

    .line 1986
    :goto_0
    return-void
.end method

.method private J()V
    .locals 5

    .line 2067
    const-string v0, "SCUI_StepsCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showNoCallPermisionTips enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2068
    iget-object v0, p0, Lo/esv;->a:Landroid/content/Context;

    .line 2069
    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "no_call_permision_tips"

    .line 2068
    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 2071
    const-string v0, "SCUI_StepsCardData"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "noCallPermisionRecord = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2072
    const-string v0, "0"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2073
    const/4 v0, 0x5

    invoke-direct {p0, v0}, Lo/esv;->h(I)V

    .line 2075
    :cond_0
    return-void
.end method

.method private K()V
    .locals 6

    .line 2078
    const-string v0, "SCUI_StepsCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "processNoCallPermision enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2079
    iget-object v0, p0, Lo/esv;->a:Landroid/content/Context;

    .line 2080
    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "no_call_permision_tips"

    .line 2079
    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 2082
    const-string v0, "SCUI_StepsCardData"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "noCallPermisionRecord = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v5, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2083
    const-string v0, "1"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 2084
    iget-object v0, p0, Lo/esv;->a:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "no_call_permision_tips"

    .line 2085
    const/4 v3, 0x0

    invoke-static {v3}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lo/dcy;

    invoke-direct {v4}, Lo/dcy;-><init>()V

    .line 2084
    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 2086
    const/4 v0, 0x5

    invoke-direct {p0, v0}, Lo/esv;->h(I)V

    .line 2088
    :cond_0
    return-void
.end method

.method private L()V
    .locals 5

    .line 2054
    const-string v0, "SCUI_StepsCardData"

    const/4 v1, 0x1

    :try_start_0
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter unRegisterNewTipBroadcast register"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2055
    iget-object v0, p0, Lo/esv;->a:Landroid/content/Context;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 2056
    iget-object v0, p0, Lo/esv;->a:Landroid/content/Context;

    iget-object v1, p0, Lo/esv;->N:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1

    .line 2062
    :cond_0
    goto :goto_0

    .line 2058
    :catch_0
    move-exception v4

    .line 2059
    const-string v0, "SCUI_StepsCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/lang/IllegalArgumentException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2062
    goto :goto_0

    .line 2060
    :catch_1
    move-exception v4

    .line 2061
    const-string v0, "SCUI_StepsCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/lang/RuntimeException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2064
    :goto_0
    return-void
.end method

.method private M()V
    .locals 5

    .line 2043
    const-string v0, "SCUI_StepsCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "registerNewTipBroadcast register"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2044
    new-instance v4, Landroid/content/IntentFilter;

    invoke-direct {v4}, Landroid/content/IntentFilter;-><init>()V

    .line 2045
    const-string v0, "com.huawei.health.action.NPL_SERVICE_NOT_AVALIABLE"

    invoke-virtual {v4, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 2046
    const-string v0, "com.huawei.health.action.NO_CALL_REJECT_PERMISION"

    invoke-virtual {v4, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 2047
    iget-object v0, p0, Lo/esv;->a:Landroid/content/Context;

    iget-object v1, p0, Lo/esv;->N:Landroid/content/BroadcastReceiver;

    sget-object v2, Lo/dac;->a:Ljava/lang/String;

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v4, v2, v3}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Ljava/lang/String;Landroid/os/Handler;)Landroid/content/Intent;

    .line 2050
    return-void
.end method

.method private N()V
    .locals 5

    .line 1988
    const-string v0, "SCUI_StepsCardData"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "closeSyncOtherDeviceStepsTipsWhenDayChange tipsList="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/esv;->D:Ljava/util/List;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1989
    iget-object v0, p0, Lo/esv;->D:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/esv;->D:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 1990
    :cond_0
    return-void

    .line 1992
    :cond_1
    iget-object v0, p0, Lo/esv;->D:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/4 v1, 0x6

    if-ne v0, v1, :cond_3

    .line 1993
    iget-object v0, p0, Lo/esv;->D:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 1994
    iget-object v0, p0, Lo/esv;->D:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_2

    .line 1995
    iget-object v0, p0, Lo/esv;->D:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-direct {p0, v0}, Lo/esv;->k(I)V

    goto :goto_1

    .line 1997
    :cond_2
    iget-object v0, p0, Lo/esv;->d:Lo/esx;

    iget-object v0, v0, Lo/esx;->q:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 1998
    iget-object v0, p0, Lo/esv;->d:Lo/esx;

    iget-object v0, v0, Lo/esx;->y:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    goto :goto_1

    .line 2001
    :cond_3
    const/4 v4, 0x0

    :goto_0
    iget-object v0, p0, Lo/esv;->D:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v4, v0, :cond_5

    .line 2002
    iget-object v0, p0, Lo/esv;->D:Ljava/util/List;

    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/4 v1, 0x6

    if-ne v0, v1, :cond_4

    .line 2003
    iget-object v0, p0, Lo/esv;->D:Ljava/util/List;

    invoke-interface {v0, v4}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 2001
    :cond_4
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 2007
    :cond_5
    :goto_1
    return-void
.end method

.method static synthetic a(Lo/esv;)Lo/esx;
    .locals 1

    .line 105
    iget-object v0, p0, Lo/esv;->d:Lo/esx;

    return-object v0
.end method

.method private a(I)V
    .locals 7

    .line 1460
    const-wide/16 v5, 0x0

    .line 1461
    const-string v0, "SCUI_StepsCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "updateFloolText floors = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1462
    if-gez p1, :cond_0

    .line 1463
    const/4 p1, 0x0

    .line 1466
    :cond_0
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1467
    int-to-double v0, p1

    const-wide/high16 v2, 0x4024000000000000L    # 10.0

    div-double/2addr v0, v2

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Lo/cxh;->a(DI)D

    move-result-wide v5

    .line 1468
    iget-object v0, p0, Lo/esv;->d:Lo/esx;

    iget-object v0, v0, Lo/esx;->l:Lo/egb;

    iget-object v1, p0, Lo/esv;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homehealth/R$string;->IDS_ft:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 1470
    :cond_1
    int-to-double v0, p1

    const-wide/high16 v2, 0x4024000000000000L    # 10.0

    div-double v5, v0, v2

    .line 1471
    iget-object v0, p0, Lo/esv;->d:Lo/esx;

    iget-object v0, v0, Lo/esx;->l:Lo/egb;

    iget-object v1, p0, Lo/esv;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homehealth/R$string;->IDS_fitness_data_list_activity_meter_unit:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 1474
    :goto_0
    if-lez p1, :cond_3

    .line 1475
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1476
    iget-object v0, p0, Lo/esv;->d:Lo/esx;

    iget-object v0, v0, Lo/esx;->b:Lo/egb;

    const/4 v1, 0x1

    const/4 v2, 0x2

    invoke-static {v5, v6, v1, v2}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    goto :goto_1

    .line 1478
    :cond_2
    iget-object v0, p0, Lo/esv;->d:Lo/esx;

    iget-object v0, v0, Lo/esx;->b:Lo/egb;

    iget-object v1, p0, Lo/esv;->a:Landroid/content/Context;

    const/4 v2, 0x1

    const/4 v3, 0x1

    invoke-static {v1, v5, v6, v2, v3}, Lo/esv;->d(Landroid/content/Context;DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 1480
    :goto_1
    iget-object v0, p0, Lo/esv;->d:Lo/esx;

    iget-object v0, v0, Lo/esx;->l:Lo/egb;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egb;->setVisibility(I)V

    goto :goto_2

    .line 1482
    :cond_3
    iget-boolean v0, p0, Lo/esv;->w:Z

    if-eqz v0, :cond_4

    invoke-static {}, Lo/dbf;->d()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 1483
    iget-object v0, p0, Lo/esv;->d:Lo/esx;

    iget-object v0, v0, Lo/esx;->b:Lo/egb;

    const-wide/16 v1, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x1

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 1484
    iget-object v0, p0, Lo/esv;->d:Lo/esx;

    iget-object v0, v0, Lo/esx;->l:Lo/egb;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egb;->setVisibility(I)V

    goto :goto_2

    .line 1486
    :cond_4
    iget-object v0, p0, Lo/esv;->d:Lo/esx;

    iget-object v0, v0, Lo/esx;->b:Lo/egb;

    iget-object v1, p0, Lo/esv;->g:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/homehealth/R$string;->IDS_hw_health_show_healthdata_nodata_symbol:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 1487
    iget-object v0, p0, Lo/esv;->d:Lo/esx;

    iget-object v0, v0, Lo/esx;->l:Lo/egb;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/egb;->setVisibility(I)V

    .line 1491
    :goto_2
    return-void
.end method

.method static synthetic a(Lo/esv;I)V
    .locals 0

    .line 105
    invoke-direct {p0, p1}, Lo/esv;->a(I)V

    return-void
.end method

.method static synthetic b(Lo/esv;I)I
    .locals 0

    .line 105
    iput p1, p0, Lo/esv;->h:I

    return p1
.end method

.method public static b(Landroid/content/Context;III)Ljava/lang/String;
    .locals 3

    .line 1559
    const-string v2, ""

    .line 1560
    invoke-static {p0}, Lo/cxa;->e(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1561
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    .line 1563
    :cond_0
    int-to-double v0, p1

    invoke-static {v0, v1, p2, p3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v2

    .line 1565
    :goto_0
    return-object v2
.end method

.method static synthetic b(Lo/esv;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 105
    iput-object p1, p0, Lo/esv;->l:Ljava/util/List;

    return-object p1
.end method

.method static synthetic b(Lo/esv;Lo/egw;)Lo/egw;
    .locals 0

    .line 105
    iput-object p1, p0, Lo/esv;->F:Lo/egw;

    return-object p1
.end method

.method static synthetic b(Lo/esv;)Z
    .locals 1

    .line 105
    iget-boolean v0, p0, Lo/esv;->I:Z

    return v0
.end method

.method static synthetic c(Lo/esv;I)I
    .locals 0

    .line 105
    iput p1, p0, Lo/esv;->o:I

    return p1
.end method

.method private c(I)Ljava/lang/String;
    .locals 8

    .line 1769
    const-string v5, ""

    .line 1771
    packed-switch p1, :pswitch_data_0

    goto/16 :goto_1

    .line 1773
    :pswitch_0
    iget-object v0, p0, Lo/esv;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$string;->IDS_hwh_home_phone_not_support_step_tips:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v5

    .line 1774
    goto/16 :goto_2

    .line 1776
    :pswitch_1
    iget-object v0, p0, Lo/esv;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$string;->IDS_hwh_home_step_show_dameon_killed:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v5

    .line 1777
    goto/16 :goto_2

    .line 1779
    :pswitch_2
    iget-object v0, p0, Lo/esv;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$string;->IDS_hwh_home_notification_push_listener_not_available_tips:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v5

    .line 1780
    goto/16 :goto_2

    .line 1782
    :pswitch_3
    iget-object v0, p0, Lo/esv;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$string;->IDS_hwh_home_no_call_reject_permision_tips:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v5

    .line 1783
    goto/16 :goto_2

    .line 1785
    :pswitch_4
    iget-object v0, p0, Lo/esv;->a:Landroid/content/Context;

    if-eqz v0, :cond_2

    .line 1786
    iget-object v0, p0, Lo/esv;->l:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x2

    if-le v0, v1, :cond_1

    .line 1787
    iget-object v0, p0, Lo/esv;->l:Ljava/util/List;

    invoke-direct {p0, v0}, Lo/esv;->d(Ljava/util/List;)Lo/eut;

    move-result-object v6

    .line 1788
    if-eqz v6, :cond_0

    .line 1789
    iget-object v0, p0, Lo/esv;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$string;->IDS_hw_home_data_origin_tips2:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    .line 1790
    invoke-direct {p0, v6}, Lo/esv;->e(Lo/eut;)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    .line 1789
    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    goto :goto_0

    .line 1792
    :cond_0
    iget-object v0, p0, Lo/esv;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$string;->IDS_hw_data_origin_unknow_device:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v7

    .line 1793
    iget-object v0, p0, Lo/esv;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$string;->IDS_hw_home_data_origin_tips2:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v7, v2, v3

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    .line 1795
    :goto_0
    goto :goto_2

    :cond_1
    iget-object v0, p0, Lo/esv;->l:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_2

    .line 1796
    iget-object v0, p0, Lo/esv;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$string;->IDS_hw_home_data_origin_tips1:I

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v3, p0, Lo/esv;->l:Ljava/util/List;

    .line 1797
    const/4 v4, 0x0

    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lo/eut;

    invoke-direct {p0, v3}, Lo/esv;->e(Lo/eut;)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    iget-object v3, p0, Lo/esv;->l:Ljava/util/List;

    const/4 v4, 0x1

    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lo/eut;

    invoke-direct {p0, v3}, Lo/esv;->e(Lo/eut;)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    .line 1796
    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    goto :goto_2

    .line 1802
    :goto_1
    :pswitch_5
    const-string v0, "SCUI_StepsCardData"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getTipsString types="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " not support"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1805
    :cond_2
    :goto_2
    return-object v5

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_5
        :pswitch_2
        :pswitch_3
        :pswitch_4
    .end packed-switch
.end method

.method static synthetic c(Lo/esv;)Lo/cmj;
    .locals 1

    .line 105
    iget-object v0, p0, Lo/esv;->e:Lo/cmj;

    return-object v0
.end method

.method static synthetic d(Lo/esv;I)I
    .locals 0

    .line 105
    iput p1, p0, Lo/esv;->A:I

    return p1
.end method

.method public static d(Landroid/content/Context;DII)Ljava/lang/String;
    .locals 2

    .line 1550
    const-string v1, ""

    .line 1551
    invoke-static {p0}, Lo/cxa;->e(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1552
    invoke-static {p1, p2}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    .line 1554
    :cond_0
    invoke-static {p1, p2, p3, p4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    .line 1556
    :goto_0
    return-object v1
.end method

.method static synthetic d(Lo/esv;)Lo/egw;
    .locals 1

    .line 105
    iget-object v0, p0, Lo/esv;->F:Lo/egw;

    return-object v0
.end method

.method private d(Ljava/util/List;)Lo/eut;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/eut;>;)Lo/eut;"
        }
    .end annotation

    .line 1809
    iget-object v0, p0, Lo/esv;->a:Landroid/content/Context;

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 1810
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 1812
    :cond_1
    const/4 v2, 0x0

    .line 1814
    const/4 v3, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-ge v3, v0, :cond_3

    .line 1815
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/eut;

    .line 1816
    if-eqz v4, :cond_2

    iget-object v0, v4, Lo/eut;->e:Ljava/lang/String;

    if-eqz v0, :cond_2

    .line 1817
    iget-object v0, v4, Lo/eut;->e:Ljava/lang/String;

    iget-object v1, p0, Lo/esv;->a:Landroid/content/Context;

    invoke-static {v1}, Lo/cne;->e(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    iget v0, v4, Lo/eut;->b:I

    const/16 v1, 0x20

    if-ne v0, v1, :cond_2

    .line 1818
    move-object v2, v4

    .line 1819
    goto :goto_1

    .line 1814
    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 1824
    :cond_3
    :goto_1
    if-nez v2, :cond_5

    .line 1825
    const/4 v3, 0x0

    :goto_2
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-ge v3, v0, :cond_5

    .line 1826
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/eut;

    .line 1827
    if-eqz v4, :cond_4

    iget-object v0, v4, Lo/eut;->e:Ljava/lang/String;

    if-eqz v0, :cond_4

    .line 1828
    iget-object v0, v4, Lo/eut;->e:Ljava/lang/String;

    iget-object v1, p0, Lo/esv;->a:Landroid/content/Context;

    invoke-static {v1}, Lo/cne;->e(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 1829
    move-object v2, v4

    .line 1830
    goto :goto_3

    .line 1825
    :cond_4
    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    .line 1835
    :cond_5
    :goto_3
    return-object v2
.end method

.method private d(D)V
    .locals 5

    .line 1538
    const-string v0, "SCUI_StepsCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "updateDistanceText distance = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1, p2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1539
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1540
    const/4 v0, 0x3

    invoke-static {p1, p2, v0}, Lo/cxh;->a(DI)D

    move-result-wide p1

    .line 1541
    iget-object v0, p0, Lo/esv;->d:Lo/esx;

    iget-object v0, v0, Lo/esx;->m:Lo/egb;

    iget-object v1, p0, Lo/esv;->a:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/homehealth/R$string;->IDS_band_data_sport_distance_unit_en:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 1543
    :cond_0
    iget-object v0, p0, Lo/esv;->d:Lo/esx;

    iget-object v0, v0, Lo/esx;->m:Lo/egb;

    iget-object v1, p0, Lo/esv;->a:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/homehealth/R$string;->IDS_band_data_sport_distance_unit:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 1545
    :goto_0
    iget-object v0, p0, Lo/esv;->d:Lo/esx;

    iget-object v0, v0, Lo/esx;->a:Lo/egb;

    const/4 v1, 0x2

    invoke-static {p1, p2, v1}, Lo/dbf;->b(DI)D

    move-result-wide v1

    const/4 v3, 0x1

    const/4 v4, 0x2

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 1546
    return-void
.end method

.method static synthetic d(Lo/esv;D)V
    .locals 0

    .line 105
    invoke-direct {p0, p1, p2}, Lo/esv;->d(D)V

    return-void
.end method

.method static synthetic d(Lo/esv;Z)Z
    .locals 0

    .line 105
    iput-boolean p1, p0, Lo/esv;->I:Z

    return p1
.end method

.method private e(D)D
    .locals 8

    .line 441
    move-wide v4, p1

    .line 442
    iget-object v0, p0, Lo/esv;->a:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "first_day_run_record"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 443
    const-string v0, "SCUI_StepsCardData"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "acquireRealyOtherDeviceSteps firstRunText"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v6, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 444
    if-eqz v6, :cond_0

    const-string v0, ""

    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 445
    :cond_0
    const-wide/16 v4, 0x0

    .line 446
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "false#"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "#"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    .line 447
    iget-object v0, p0, Lo/esv;->a:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "first_day_run_record"

    new-instance v3, Lo/dcy;

    invoke-direct {v3}, Lo/dcy;-><init>()V

    invoke-static {v0, v1, v2, v7, v3}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 448
    goto :goto_0

    .line 450
    :cond_1
    const-string v0, "#"

    :try_start_0
    invoke-virtual {v6, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v7

    .line 451
    if-eqz v7, :cond_2

    array-length v0, v7

    const/4 v1, 0x3

    if-ne v0, v1, :cond_2

    .line 452
    const/4 v0, 0x0

    aget-object v0, v7, v0

    const-string v1, "false"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    const/4 v2, 0x1

    aget-object v2, v7, v2

    invoke-static {v2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Lo/fiy;->a(JJ)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 453
    const/4 v0, 0x2

    aget-object v0, v7, v0

    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-wide v0

    sub-double v0, p1, v0

    move-wide v4, v0

    .line 458
    :cond_2
    goto :goto_0

    .line 456
    :catch_0
    move-exception v7

    .line 457
    const-string v0, "SCUI_StepsCardData"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "acquireRealyOtherDeviceSteps e"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v7}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 460
    :goto_0
    const-string v0, "SCUI_StepsCardData"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "acquireRealyOtherDeviceSteps realyOtherDeviceSteps"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 461
    return-wide v4
.end method

.method private e(Lo/eut;)Ljava/lang/String;
    .locals 2

    .line 1839
    iget-object v0, p0, Lo/esv;->a:Landroid/content/Context;

    if-nez v0, :cond_0

    .line 1840
    const-string v0, ""

    return-object v0

    .line 1842
    :cond_0
    iget v0, p1, Lo/eut;->b:I

    const/16 v1, 0x20

    if-ne v0, v1, :cond_2

    .line 1843
    iget-object v0, p1, Lo/eut;->a:Ljava/lang/String;

    if-eqz v0, :cond_1

    .line 1848
    iget-object v0, p1, Lo/eut;->a:Ljava/lang/String;

    return-object v0

    .line 1851
    :cond_1
    iget-object v0, p0, Lo/esv;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$string;->IDS_origin_phone:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 1854
    :cond_2
    iget-object v0, p1, Lo/eut;->c:Ljava/lang/String;

    if-eqz v0, :cond_3

    .line 1855
    iget-object v0, p1, Lo/eut;->c:Ljava/lang/String;

    return-object v0

    .line 1857
    :cond_3
    iget-object v0, p0, Lo/esv;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$string;->IDS_hw_data_origin_unknow_device:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private e(I)V
    .locals 7

    .line 1496
    if-gez p1, :cond_0

    .line 1497
    const/4 p1, 0x0

    .line 1500
    :cond_0
    const-string v0, "SCUI_StepsCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initTimeText"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1502
    if-nez p1, :cond_2

    iget-object v0, p0, Lo/esv;->e:Lo/cmj;

    invoke-virtual {v0}, Lo/cmj;->a()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    iget-object v0, p0, Lo/esv;->d:Lo/esx;

    if-eqz v0, :cond_2

    .line 1503
    iget v0, p0, Lo/esv;->k:I

    if-lez v0, :cond_1

    iget-object v0, p0, Lo/esv;->d:Lo/esx;

    iget-object v0, v0, Lo/esx;->c:Lo/epu;

    if-eqz v0, :cond_1

    .line 1504
    iget-object v0, p0, Lo/esv;->d:Lo/esx;

    iget-object v0, v0, Lo/esx;->c:Lo/epu;

    int-to-double v1, p1

    const-wide/high16 v3, 0x3ff0000000000000L    # 1.0

    mul-double/2addr v1, v3

    iget v3, p0, Lo/esv;->k:I

    int-to-double v3, v3

    const-wide/high16 v5, 0x3ff0000000000000L    # 1.0

    mul-double/2addr v3, v5

    div-double/2addr v1, v3

    double-to-float v1, v1

    invoke-virtual {v0, v1}, Lo/epu;->setRightProgress(F)V

    .line 1506
    :cond_1
    iget-object v0, p0, Lo/esv;->d:Lo/esx;

    iget-object v0, v0, Lo/esx;->h:Lo/egb;

    iget-object v1, p0, Lo/esv;->g:Landroid/content/Context;

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/esv;->b(Landroid/content/Context;III)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 1507
    return-void

    .line 1535
    :cond_2
    return-void
.end method

.method static synthetic e(Lo/esv;)V
    .locals 0

    .line 105
    invoke-direct {p0}, Lo/esv;->r()V

    return-void
.end method

.method static synthetic e(Lo/esv;I)V
    .locals 0

    .line 105
    invoke-direct {p0, p1}, Lo/esv;->h(I)V

    return-void
.end method

.method static synthetic f(Lo/esv;)I
    .locals 1

    .line 105
    iget v0, p0, Lo/esv;->o:I

    return v0
.end method

.method static synthetic f(Lo/esv;I)I
    .locals 0

    .line 105
    iput p1, p0, Lo/esv;->p:I

    return p1
.end method

.method static synthetic g(Lo/esv;)I
    .locals 1

    .line 105
    iget v0, p0, Lo/esv;->n:I

    return v0
.end method

.method static synthetic g(Lo/esv;I)I
    .locals 0

    .line 105
    iput p1, p0, Lo/esv;->m:I

    return p1
.end method

.method private g(I)V
    .locals 6

    .line 2011
    const-string v0, "SCUI_StepsCardData"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "processTipsCloseEvent types="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2012
    packed-switch p1, :pswitch_data_0

    goto/16 :goto_0

    .line 2014
    :pswitch_0
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "if_has_tiped_do_not_support_step"

    const-string v3, "alread_tips"

    new-instance v4, Lo/dcy;

    invoke-direct {v4}, Lo/dcy;-><init>()V

    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 2016
    goto/16 :goto_1

    .line 2018
    :pswitch_1
    iget-object v0, p0, Lo/esv;->e:Lo/cmj;

    if-nez v0, :cond_0

    .line 2019
    const-string v0, "SCUI_StepsCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "processTipsCloseEvent opensdk null,return"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2020
    return-void

    .line 2022
    :cond_0
    const-string v0, "SCUI_StepsCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "close keep-alive-tips,makePromptNoSense"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2023
    iget-object v0, p0, Lo/esv;->e:Lo/cmj;

    invoke-virtual {v0}, Lo/cmj;->g()V

    .line 2024
    goto/16 :goto_1

    .line 2026
    :pswitch_2
    const-string v0, "SCUI_StepsCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "TIPS_NPL_SERVICE_NA only close tips"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2027
    goto :goto_1

    .line 2029
    :pswitch_3
    iget-object v0, p0, Lo/esv;->a:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "no_call_permision_tips"

    .line 2030
    const/4 v3, 0x1

    invoke-static {v3}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lo/dcy;

    invoke-direct {v4}, Lo/dcy;-><init>()V

    .line 2029
    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 2031
    goto :goto_1

    .line 2033
    :pswitch_4
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "#1"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 2034
    iget-object v0, p0, Lo/esv;->a:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "show_data_origin_tips_times"

    new-instance v3, Lo/dcy;

    invoke-direct {v3}, Lo/dcy;-><init>()V

    invoke-static {v0, v1, v2, v5, v3}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 2036
    goto :goto_1

    .line 2038
    :goto_0
    :pswitch_5
    const-string v0, "SCUI_StepsCardData"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getTipsString types="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " not support"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2040
    :goto_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_5
        :pswitch_2
        :pswitch_3
        :pswitch_4
    .end packed-switch
.end method

.method static synthetic h(Lo/esv;)I
    .locals 1

    .line 105
    iget v0, p0, Lo/esv;->p:I

    return v0
.end method

.method private h(I)V
    .locals 6

    .line 1947
    const-string v0, "SCUI_StepsCardData"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "addNewTips tips"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1948
    iget-object v4, p0, Lo/esv;->D:Ljava/util/List;

    monitor-enter v4

    .line 1949
    :try_start_0
    iget-object v0, p0, Lo/esv;->D:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_0

    .line 1950
    invoke-direct {p0, p1}, Lo/esv;->k(I)V

    .line 1952
    :cond_0
    iget-object v0, p0, Lo/esv;->D:Ljava/util/List;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1953
    monitor-exit v4

    goto :goto_0

    :catchall_0
    move-exception v5

    monitor-exit v4

    throw v5

    .line 1954
    :goto_0
    return-void
.end method

.method static synthetic i(Lo/esv;)I
    .locals 1

    .line 105
    iget v0, p0, Lo/esv;->m:I

    return v0
.end method

.method static synthetic i(Lo/esv;I)I
    .locals 0

    .line 105
    iput p1, p0, Lo/esv;->n:I

    return p1
.end method

.method private i()V
    .locals 2

    .line 265
    invoke-static {}, Lo/cbl;->b()Lo/cbl;

    move-result-object v1

    .line 267
    invoke-virtual {v1}, Lo/cbl;->e()V

    .line 268
    iget-object v0, p0, Lo/esv;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/cwc;->c(Landroid/content/Context;)Lo/cwc;

    move-result-object v0

    invoke-virtual {v1, v0}, Lo/cbl;->setAdapter(Lo/eab;)V

    .line 269
    iget-object v0, p0, Lo/esv;->a:Landroid/content/Context;

    invoke-virtual {v1, v0}, Lo/cbl;->a(Landroid/content/Context;)V

    .line 270
    iget-object v0, p0, Lo/esv;->a:Landroid/content/Context;

    invoke-virtual {v1, v0}, Lo/cbl;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 271
    const-string v0, "SCUI_StepsCardData-Restart sport"

    invoke-static {v0}, Lo/dbf;->d(Ljava/lang/String;)V

    .line 272
    iget-object v0, p0, Lo/esv;->a:Landroid/content/Context;

    invoke-virtual {v1, v0}, Lo/cbl;->e(Landroid/content/Context;)V

    .line 273
    const/4 v0, 0x2

    invoke-static {v0}, Lo/erd;->e(I)V

    .line 276
    :cond_0
    invoke-direct {p0}, Lo/esv;->n()V

    .line 277
    return-void
.end method

.method static synthetic j(Lo/esv;)Ljava/util/concurrent/ExecutorService;
    .locals 1

    .line 105
    iget-object v0, p0, Lo/esv;->y:Ljava/util/concurrent/ExecutorService;

    return-object v0
.end method

.method private j()V
    .locals 2

    .line 1437
    sget v0, Lo/esv;->u:I

    add-int/lit8 v0, v0, 0x1

    sput v0, Lo/esv;->u:I

    .line 1438
    sget v0, Lo/esv;->u:I

    rem-int/lit8 v0, v0, 0x64

    if-nez v0, :cond_0

    .line 1439
    invoke-virtual {p0}, Lo/esv;->g()V

    .line 1441
    :cond_0
    return-void
.end method

.method static synthetic k(Lo/esv;)Landroid/os/Handler;
    .locals 1

    .line 105
    iget-object v0, p0, Lo/esv;->s:Landroid/os/Handler;

    return-object v0
.end method

.method private k(I)V
    .locals 6

    .line 1875
    sget-object v4, Landroid/os/Build;->BRAND:Ljava/lang/String;

    .line 1876
    const-string v0, "SCUI_StepsCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "phoneBrand:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1877
    const/4 v0, 0x4

    if-ne p1, v0, :cond_1

    const-string v0, "OPPO"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "vivo"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1878
    :cond_0
    iget-object v0, p0, Lo/esv;->d:Lo/esx;

    iget-object v0, v0, Lo/esx;->q:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 1879
    iget-object v0, p0, Lo/esv;->d:Lo/esx;

    iget-object v0, v0, Lo/esx;->y:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 1880
    iget-object v0, p0, Lo/esv;->d:Lo/esx;

    iget-object v0, v0, Lo/esx;->s:Lo/egb;

    new-instance v1, Lo/esv$15;

    invoke-direct {v1, p0, v4}, Lo/esv$15;-><init>(Lo/esv;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lo/egb;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1913
    iget-object v0, p0, Lo/esv;->d:Lo/esx;

    iget-object v0, v0, Lo/esx;->t:Lo/egb;

    new-instance v1, Lo/esv$2;

    invoke-direct {v1, p0}, Lo/esv$2;-><init>(Lo/esv;)V

    invoke-virtual {v0, v1}, Lo/egb;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1919
    const-string v0, "SCUI_StepsCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "the phone is oppo or vivo :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_0

    .line 1921
    :cond_1
    invoke-direct {p0, p1}, Lo/esv;->c(I)Ljava/lang/String;

    move-result-object v5

    .line 1922
    iget-object v0, p0, Lo/esv;->d:Lo/esx;

    if-nez v0, :cond_2

    .line 1923
    const-string v0, "SCUI_StepsCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mStepsCardViewHolder is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1924
    return-void

    .line 1926
    :cond_2
    iget-object v0, p0, Lo/esv;->d:Lo/esx;

    iget-object v0, v0, Lo/esx;->i:Lo/egb;

    invoke-virtual {v0, v5}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 1927
    iget-object v0, p0, Lo/esv;->d:Lo/esx;

    iget-object v0, v0, Lo/esx;->q:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 1928
    iget-object v0, p0, Lo/esv;->d:Lo/esx;

    iget-object v0, v0, Lo/esx;->y:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 1929
    const/4 v0, 0x6

    if-ne p1, v0, :cond_3

    .line 1930
    iget-object v0, p0, Lo/esv;->d:Lo/esx;

    iget-object v0, v0, Lo/esx;->i:Lo/egb;

    new-instance v1, Lo/esv$5;

    invoke-direct {v1, p0}, Lo/esv$5;-><init>(Lo/esv;)V

    invoke-virtual {v0, v1}, Lo/egb;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1939
    iget-object v0, p0, Lo/esv;->s:Landroid/os/Handler;

    const/16 v1, 0x15

    const-wide/32 v2, 0x493e0

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 1941
    :cond_3
    const-string v0, "SCUI_StepsCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "the phone is  not oppo or vivo :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1944
    :goto_0
    return-void
.end method

.method static synthetic l(Lo/esv;)Z
    .locals 1

    .line 105
    iget-boolean v0, p0, Lo/esv;->w:Z

    return v0
.end method

.method static synthetic m(Lo/esv;)I
    .locals 1

    .line 105
    iget v0, p0, Lo/esv;->A:I

    return v0
.end method

.method private m()V
    .locals 4

    .line 310
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-nez v0, :cond_1

    .line 311
    invoke-direct {p0}, Lo/esv;->B()V

    .line 312
    iget-object v0, p0, Lo/esv;->q:Lo/esy;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 313
    iget-object v0, p0, Lo/esv;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/esy;->a(Landroid/content/Context;)Lo/esy;

    move-result-object v0

    iput-object v0, p0, Lo/esv;->q:Lo/esy;

    .line 315
    :cond_0
    iget-object v0, p0, Lo/esv;->q:Lo/esy;

    iget-object v1, p0, Lo/esv;->y:Ljava/util/concurrent/ExecutorService;

    invoke-virtual {v0, v1}, Lo/esy;->a(Ljava/util/concurrent/ExecutorService;)V

    .line 317
    :cond_1
    iget-object v0, p0, Lo/esv;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/fgb;->b(Landroid/content/Context;)Lo/fgb;

    move-result-object v0

    invoke-virtual {v0}, Lo/fgb;->c()Lo/cmj;

    move-result-object v0

    iput-object v0, p0, Lo/esv;->e:Lo/cmj;

    .line 319
    iget-object v0, p0, Lo/esv;->e:Lo/cmj;

    if-nez v0, :cond_2

    .line 320
    const-string v0, "SCUI_StepsCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mHealthOpenSDk null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 321
    return-void

    .line 323
    :cond_2
    iget-object v0, p0, Lo/esv;->C:Lo/esv$a;

    if-eqz v0, :cond_3

    .line 324
    const-string v0, "SCUI_StepsCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "init but mStepCallback not null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 325
    return-void

    .line 327
    :cond_3
    new-instance v0, Lo/esv$a;

    invoke-direct {v0, p0}, Lo/esv$a;-><init>(Lo/esv;)V

    iput-object v0, p0, Lo/esv;->C:Lo/esv$a;

    .line 328
    new-instance v0, Lo/esv$c;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lo/esv$c;-><init>(Lo/esv;Lo/esv$1;)V

    iput-object v0, p0, Lo/esv;->j:Lo/cmo;

    .line 329
    iget-object v0, p0, Lo/esv;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/fgb;->b(Landroid/content/Context;)Lo/fgb;

    move-result-object v0

    iget-object v1, p0, Lo/esv;->j:Lo/cmo;

    invoke-virtual {v0, v1}, Lo/fgb;->b(Lo/cmo;)V

    .line 330
    iget-object v0, p0, Lo/esv;->e:Lo/cmj;

    iget-object v1, p0, Lo/esv;->C:Lo/esv$a;

    iget-object v2, p0, Lo/esv;->j:Lo/cmo;

    invoke-virtual {v0, v1, v2}, Lo/cmj;->e(Lo/cmq;Lo/cmo;)Z

    .line 331
    const-string v0, "SCUI_StepsCardData"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "register mStepCallback:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/esv;->C:Lo/esv$a;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 334
    invoke-direct {p0}, Lo/esv;->M()V

    .line 336
    invoke-direct {p0}, Lo/esv;->E()V

    .line 338
    return-void
.end method

.method static synthetic n(Lo/esv;)I
    .locals 1

    .line 105
    iget v0, p0, Lo/esv;->h:I

    return v0
.end method

.method private n()V
    .locals 8

    .line 288
    iget-object v0, p0, Lo/esv;->a:Landroid/content/Context;

    if-nez v0, :cond_0

    .line 289
    return-void

    .line 291
    :cond_0
    const/16 v0, 0x4e22

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v3

    .line 292
    iget-object v0, p0, Lo/esv;->a:Landroid/content/Context;

    const-string v1, "com.huawei.auto_track_refresh_sp.track.config"

    invoke-static {v0, v3, v1}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 293
    if-eqz v4, :cond_1

    const-string v0, ""

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 294
    :cond_1
    new-instance v5, Lo/dcy;

    invoke-direct {v5}, Lo/dcy;-><init>()V

    .line 295
    iget-object v0, p0, Lo/esv;->a:Landroid/content/Context;

    const-string v1, "com.huawei.auto_track_refresh_sp.track.config"

    const-string v2, "1"

    invoke-static {v0, v3, v1, v2, v5}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 296
    new-instance v6, Lo/cbz;

    invoke-direct {v6}, Lo/cbz;-><init>()V

    .line 297
    iget-object v0, p0, Lo/esv;->a:Landroid/content/Context;

    invoke-virtual {v6, v0}, Lo/cbz;->c(Landroid/content/Context;)V

    .line 298
    new-instance v7, Landroid/content/Intent;

    const-string v0, "com.huawei.health.track.config"

    invoke-direct {v7, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 299
    const-string v0, "com.huawei.health"

    invoke-virtual {v7, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 300
    const-string v0, "com.huawei.health"

    const-string v1, "com.huawei.health.manager.DaemonService"

    invoke-virtual {v7, v0, v1}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 301
    const-string v0, "autotrack_enable"

    invoke-virtual {v6}, Lo/cbz;->c()Z

    move-result v1

    invoke-virtual {v7, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 302
    const-string v0, "stop_delay"

    invoke-virtual {v6}, Lo/cbz;->e()I

    move-result v1

    invoke-virtual {v7, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 303
    const-string v0, "start_delay"

    invoke-virtual {v6}, Lo/cbz;->d()I

    move-result v1

    invoke-virtual {v7, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 304
    iget-object v0, p0, Lo/esv;->a:Landroid/content/Context;

    invoke-virtual {v0, v7}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 306
    :cond_2
    return-void
.end method

.method static synthetic o(Lo/esv;)V
    .locals 0

    .line 105
    invoke-direct {p0}, Lo/esv;->D()V

    return-void
.end method

.method static synthetic p(Lo/esv;)Ljava/util/List;
    .locals 1

    .line 105
    iget-object v0, p0, Lo/esv;->l:Ljava/util/List;

    return-object v0
.end method

.method private q()V
    .locals 4

    .line 347
    const-string v0, "SCUI_StepsCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showDameonKilled"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 348
    iget-object v0, p0, Lo/esv;->e:Lo/cmj;

    if-nez v0, :cond_0

    .line 349
    const-string v0, "SCUI_StepsCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showDameonKilled opensdk null,return"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 350
    return-void

    .line 353
    :cond_0
    iget-object v0, p0, Lo/esv;->e:Lo/cmj;

    new-instance v1, Lo/esv$1;

    invoke-direct {v1, p0}, Lo/esv$1;-><init>(Lo/esv;)V

    invoke-virtual {v0, v1}, Lo/cmj;->h(Lo/cmo;)V

    .line 383
    return-void
.end method

.method static synthetic q(Lo/esv;)V
    .locals 0

    .line 105
    invoke-direct {p0}, Lo/esv;->H()V

    return-void
.end method

.method private r()V
    .locals 13

    .line 398
    iget-object v0, p0, Lo/esv;->a:Landroid/content/Context;

    if-nez v0, :cond_0

    .line 399
    return-void

    .line 401
    :cond_0
    const-wide/16 v4, 0x0

    .line 402
    iget-object v0, p0, Lo/esv;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/LoginInit;->getUsetId()Ljava/lang/String;

    move-result-object v6

    .line 403
    iget-object v0, p0, Lo/esv;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/dcn;->e(Landroid/content/Context;)Lo/dcn;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "step_sum_dvalue"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/dcn;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 404
    if-eqz v7, :cond_1

    const-string v0, ""

    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 406
    :try_start_0
    invoke-static {v7}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-wide v0

    move-wide v4, v0

    .line 409
    goto :goto_0

    .line 407
    :catch_0
    move-exception v8

    .line 408
    const-string v0, "SCUI_StepsCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showOtherDeviceStepsMoreThanTwentyPercentTips NumberFormatException"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 411
    :cond_1
    :goto_0
    invoke-direct {p0, v4, v5}, Lo/esv;->e(D)D

    move-result-wide v8

    .line 412
    const-string v0, "SCUI_StepsCardData"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "otherDeviceSteps="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, "  totalSteps="

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget v2, p0, Lo/esv;->o:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, "realyOtherDeviceSteps="

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-static {v8, v9}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 413
    iget v0, p0, Lo/esv;->o:I

    if-lez v0, :cond_2

    iget v0, p0, Lo/esv;->o:I

    int-to-float v0, v0

    float-to-double v0, v0

    div-double v0, v8, v0

    const-wide v2, 0x3fc999999999999aL    # 0.2

    cmpg-double v0, v0, v2

    if-ltz v0, :cond_2

    const-wide v0, 0x407f400000000000L    # 500.0

    cmpg-double v0, v8, v0

    if-gez v0, :cond_3

    .line 414
    :cond_2
    const-string v0, "SCUI_StepsCardData"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "(otherDeviceSteps/(float) steps)="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget v2, p0, Lo/esv;->o:I

    int-to-float v2, v2

    float-to-double v2, v2

    div-double v2, v4, v2

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 415
    return-void

    .line 417
    :cond_3
    iget-object v0, p0, Lo/esv;->l:Ljava/util/List;

    if-eqz v0, :cond_6

    iget-object v0, p0, Lo/esv;->l:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x2

    if-lt v0, v1, :cond_6

    .line 418
    iget-object v0, p0, Lo/esv;->a:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "show_data_origin_tips_times"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    .line 419
    const-string v0, "SCUI_StepsCardData"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showOtherDeviceStepsMoreThanTwentyPercentTips storeText="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v10, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 420
    if-eqz v10, :cond_5

    const-string v0, ""

    invoke-virtual {v0, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    .line 421
    const-string v0, "#"

    invoke-virtual {v10, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v11

    .line 423
    :try_start_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    const/4 v2, 0x0

    aget-object v2, v11, v2

    invoke-static {v2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Lo/fiy;->a(JJ)Z

    move-result v0

    if-eqz v0, :cond_4

    const-string v0, "1"

    const/4 v1, 0x1

    aget-object v1, v11, v1

    .line 424
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 425
    const-string v0, "SCUI_StepsCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showOtherDeviceStepsMoreThanTwentyPercentTips already tips twice! return."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_1

    .line 426
    return-void

    .line 428
    :cond_4
    const/4 v0, 0x6

    :try_start_2
    invoke-direct {p0, v0}, Lo/esv;->h(I)V
    :try_end_2
    .catch Ljava/lang/NumberFormatException; {:try_start_2 .. :try_end_2} :catch_1

    .line 432
    goto :goto_1

    .line 430
    :catch_1
    move-exception v12

    .line 431
    const-string v0, "SCUI_StepsCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showOtherDeviceStepsMoreThanTwentyPercentTips NumberFormatException"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 433
    :goto_1
    goto :goto_2

    .line 434
    :cond_5
    const/4 v0, 0x6

    invoke-direct {p0, v0}, Lo/esv;->h(I)V

    .line 438
    :cond_6
    :goto_2
    return-void
.end method

.method static synthetic r(Lo/esv;)V
    .locals 0

    .line 105
    invoke-direct {p0}, Lo/esv;->I()V

    return-void
.end method

.method static synthetic s(Lo/esv;)Lo/esv$a;
    .locals 1

    .line 105
    iget-object v0, p0, Lo/esv;->C:Lo/esv$a;

    return-object v0
.end method

.method private s()V
    .locals 0

    .line 341
    invoke-direct {p0}, Lo/esv;->u()V

    .line 342
    invoke-direct {p0}, Lo/esv;->q()V

    .line 343
    invoke-direct {p0}, Lo/esv;->J()V

    .line 344
    return-void
.end method

.method static synthetic t(Lo/esv;)Landroid/content/Context;
    .locals 1

    .line 105
    iget-object v0, p0, Lo/esv;->g:Landroid/content/Context;

    return-object v0
.end method

.method private t()Z
    .locals 2

    .line 545
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_0

    iget-object v0, p0, Lo/esv;->e:Lo/cmj;

    invoke-virtual {v0}, Lo/cmj;->a()I

    move-result v0

    const/4 v1, 0x3

    if-eq v0, v1, :cond_0

    .line 546
    const/4 v0, 0x1

    return v0

    .line 548
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method static synthetic u(Lo/esv;)Lo/cmo;
    .locals 1

    .line 105
    iget-object v0, p0, Lo/esv;->j:Lo/cmo;

    return-object v0
.end method

.method private u()V
    .locals 5

    .line 385
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    .line 386
    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "if_has_tiped_do_not_support_step"

    .line 385
    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 387
    const-string v0, "SCUI_StepsCardData"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mHealthOpenSDk.getDeviceOriginalClass()=="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/esv;->e:Lo/cmj;

    invoke-virtual {v2}, Lo/cmj;->a()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 388
    iget-object v0, p0, Lo/esv;->a:Landroid/content/Context;

    if-eqz v0, :cond_0

    const-string v0, "alread_tips"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lo/esv;->e:Lo/cmj;

    .line 389
    invoke-virtual {v0}, Lo/cmj;->a()I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lo/esv;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/czz;->e(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 390
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lo/esv;->h(I)V

    .line 392
    :cond_0
    return-void
.end method

.method static synthetic v(Lo/esv;)I
    .locals 1

    .line 105
    iget v0, p0, Lo/esv;->k:I

    return v0
.end method

.method private v()V
    .locals 2

    .line 553
    iget-object v0, p0, Lo/esv;->a:Landroid/content/Context;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lo/esv;->e:Lo/cmj;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lo/esv;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->Q(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lo/esv;->t()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lo/dbf;->d()Z

    move-result v0

    if-nez v0, :cond_0

    .line 554
    iget-object v0, p0, Lo/esv;->e:Lo/cmj;

    new-instance v1, Lo/esv$8;

    invoke-direct {v1, p0}, Lo/esv$8;-><init>(Lo/esv;)V

    invoke-virtual {v0, v1}, Lo/cmj;->a(Lo/cmo;)V

    .line 601
    :cond_0
    return-void
.end method

.method private w()V
    .locals 3

    .line 642
    iget-object v0, p0, Lo/esv;->s:Landroid/os/Handler;

    const/16 v1, 0x9

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v2

    .line 643
    iget-object v0, p0, Lo/esv;->s:Landroid/os/Handler;

    invoke-virtual {v0, v2}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 644
    return-void
.end method

.method static synthetic w(Lo/esv;)V
    .locals 0

    .line 105
    invoke-direct {p0}, Lo/esv;->G()V

    return-void
.end method

.method private x()V
    .locals 3

    .line 637
    iget-object v0, p0, Lo/esv;->s:Landroid/os/Handler;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v2

    .line 638
    iget-object v0, p0, Lo/esv;->s:Landroid/os/Handler;

    invoke-virtual {v0, v2}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 639
    return-void
.end method

.method static synthetic x(Lo/esv;)V
    .locals 0

    .line 105
    invoke-direct {p0}, Lo/esv;->N()V

    return-void
.end method

.method static synthetic y(Lo/esv;)Lo/esw;
    .locals 1

    .line 105
    iget-object v0, p0, Lo/esv;->r:Lo/esw;

    return-object v0
.end method

.method private y()V
    .locals 3

    .line 632
    iget-object v0, p0, Lo/esv;->s:Landroid/os/Handler;

    const/4 v1, 0x7

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v2

    .line 633
    iget-object v0, p0, Lo/esv;->s:Landroid/os/Handler;

    invoke-virtual {v0, v2}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 634
    return-void
.end method

.method private z()V
    .locals 6

    .line 620
    iget-object v0, p0, Lo/esv;->s:Landroid/os/Handler;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v4

    .line 621
    new-instance v5, Landroid/os/Bundle;

    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    .line 622
    const-string v0, "SCUI_StepsCardData"

    const/16 v1, 0x8

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onResume updateStepsAndCalories steps="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget v2, p0, Lo/esv;->o:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " floor="

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget v2, p0, Lo/esv;->n:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, " colories="

    const/4 v3, 0x4

    aput-object v2, v1, v3

    iget v2, p0, Lo/esv;->p:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    const-string v2, " distance="

    const/4 v3, 0x6

    aput-object v2, v1, v3

    iget v2, p0, Lo/esv;->m:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x7

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 623
    const-string v0, "step"

    iget v1, p0, Lo/esv;->o:I

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 624
    const-string v0, "floor"

    iget v1, p0, Lo/esv;->n:I

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 625
    const-string v0, "carior"

    iget v1, p0, Lo/esv;->p:I

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 626
    const-string v0, "distance"

    iget v1, p0, Lo/esv;->m:I

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 627
    invoke-virtual {v4, v5}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V

    .line 628
    iget-object v0, p0, Lo/esv;->s:Landroid/os/Handler;

    invoke-virtual {v0, v4}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 629
    return-void
.end method

.method static synthetic z(Lo/esv;)V
    .locals 0

    .line 105
    invoke-direct {p0}, Lo/esv;->j()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 6

    .line 1684
    const-string v0, "SCUI_StepsCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "destroy StepsCard"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1685
    iget-object v0, p0, Lo/esv;->s:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 1686
    iget-object v0, p0, Lo/esv;->s:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 1688
    :cond_0
    invoke-virtual {p0}, Lo/esv;->f()V

    .line 1689
    invoke-direct {p0}, Lo/esv;->L()V

    .line 1690
    invoke-direct {p0}, Lo/esv;->F()V

    .line 1691
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-nez v0, :cond_2

    .line 1692
    iget-object v0, p0, Lo/esv;->q:Lo/esy;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 1693
    const-string v0, "SCUI_StepsCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mNotificationInteractors is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1694
    return-void

    .line 1696
    :cond_1
    iget-object v0, p0, Lo/esv;->q:Lo/esy;

    invoke-virtual {v0}, Lo/esy;->c()V

    .line 1698
    :cond_2
    iget-object v0, p0, Lo/esv;->e:Lo/cmj;

    if-nez v0, :cond_3

    .line 1699
    const-string v0, "SCUI_StepsCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onDestroy mHealthOpenSDK null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1700
    return-void

    .line 1703
    :cond_3
    iget-object v0, p0, Lo/esv;->C:Lo/esv$a;

    if-nez v0, :cond_4

    .line 1704
    const-string v0, "SCUI_StepsCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onDestroy mStepCallback null!!!why?"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1705
    return-void

    .line 1707
    :cond_4
    const-string v0, "SCUI_StepsCardData"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "unRegister mStepCallback:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/esv;->C:Lo/esv$a;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1708
    iget-object v0, p0, Lo/esv;->e:Lo/cmj;

    iget-object v1, p0, Lo/esv;->C:Lo/esv$a;

    invoke-virtual {v0, v1}, Lo/cmj;->a(Lo/cmq;)V

    .line 1710
    iget-object v0, p0, Lo/esv;->j:Lo/cmo;

    if-eqz v0, :cond_5

    .line 1711
    iget-object v0, p0, Lo/esv;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/fgb;->b(Landroid/content/Context;)Lo/fgb;

    move-result-object v0

    iget-object v1, p0, Lo/esv;->j:Lo/cmo;

    invoke-virtual {v0, v1}, Lo/fgb;->a(Lo/cmo;)V

    .line 1715
    :cond_5
    sget-object v4, Lo/esy;->b:Ljava/lang/Object;

    monitor-enter v4

    .line 1716
    :try_start_0
    iget-object v0, p0, Lo/esv;->y:Ljava/util/concurrent/ExecutorService;

    if-eqz v0, :cond_6

    .line 1717
    iget-object v0, p0, Lo/esv;->y:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 1718
    const/4 v0, 0x0

    iput-object v0, p0, Lo/esv;->y:Ljava/util/concurrent/ExecutorService;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1720
    :cond_6
    monitor-exit v4

    goto :goto_0

    :catchall_0
    move-exception v5

    monitor-exit v4

    throw v5

    .line 1721
    :goto_0
    return-void
.end method

.method public b(Landroid/view/ViewGroup;Landroid/view/LayoutInflater;)Landroid/support/v7/widget/RecyclerView$ViewHolder;
    .locals 5

    .line 466
    invoke-direct {p0}, Lo/esv;->m()V

    .line 467
    iget-object v0, p0, Lo/esv;->d:Lo/esx;

    if-eqz v0, :cond_0

    .line 468
    iget-object v0, p0, Lo/esv;->d:Lo/esx;

    return-object v0

    .line 470
    :cond_0
    const-string v0, "SCUI_StepsCardData"

    const-string v1, "-getCardViewHolder enter"

    invoke-static {v0, v1}, Lo/dbf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 471
    invoke-super {p0, p1, p2}, Lo/esu;->b(Landroid/view/ViewGroup;Landroid/view/LayoutInflater;)Landroid/support/v7/widget/RecyclerView$ViewHolder;

    move-result-object v0

    check-cast v0, Lo/esx;

    iput-object v0, p0, Lo/esv;->d:Lo/esx;

    .line 473
    iget-object v0, p0, Lo/esv;->y:Ljava/util/concurrent/ExecutorService;

    if-eqz v0, :cond_1

    .line 474
    iget-object v0, p0, Lo/esv;->y:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lo/esv$3;

    invoke-direct {v1, p0}, Lo/esv$3;-><init>(Lo/esv;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 483
    :cond_1
    invoke-static {}, Lo/czz;->d()Z

    move-result v0

    iput-boolean v0, p0, Lo/esv;->w:Z

    .line 484
    const-string v0, "SCUI_StepsCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isSupportFloor = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lo/esv;->w:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 487
    iget v0, p0, Lo/esv;->o:I

    if-gtz v0, :cond_2

    iget-object v0, p0, Lo/esv;->e:Lo/cmj;

    invoke-virtual {v0}, Lo/cmj;->a()I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_2

    .line 488
    iget-object v0, p0, Lo/esv;->d:Lo/esx;

    iget-object v0, v0, Lo/esx;->d:Lo/egb;

    iget-object v1, p0, Lo/esv;->a:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/homehealth/R$string;->IDS_hw_health_show_healthdata_nodata_symbol:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 491
    :cond_2
    iget-object v0, p0, Lo/esv;->d:Lo/esx;

    iget-object v0, v0, Lo/esx;->d:Lo/egb;

    iget-object v1, p0, Lo/esv;->a:Landroid/content/Context;

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/esv;->b(Landroid/content/Context;III)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 493
    :goto_0
    iget-object v0, p0, Lo/esv;->d:Lo/esx;

    iget-object v0, v0, Lo/esx;->h:Lo/egb;

    iget-object v1, p0, Lo/esv;->g:Landroid/content/Context;

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/esv;->b(Landroid/content/Context;III)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 494
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lo/esv;->e(I)V

    .line 495
    iget v0, p0, Lo/esv;->n:I

    invoke-direct {p0, v0}, Lo/esv;->a(I)V

    .line 496
    iget v0, p0, Lo/esv;->m:I

    int-to-double v0, v0

    const-wide v2, 0x3f50624dd2f1a9fcL    # 0.001

    mul-double/2addr v0, v2

    invoke-direct {p0, v0, v1}, Lo/esv;->d(D)V

    .line 497
    iget-object v0, p0, Lo/esv;->d:Lo/esx;

    iget-object v0, v0, Lo/esx;->e:Lo/egb;

    iget-object v1, p0, Lo/esv;->a:Landroid/content/Context;

    iget v2, p0, Lo/esv;->p:I

    int-to-float v2, v2

    const/high16 v3, 0x447a0000    # 1000.0f

    div-float/2addr v2, v3

    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v2

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/esv;->b(Landroid/content/Context;III)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 500
    iget-object v0, p0, Lo/esv;->d:Lo/esx;

    iget-object v0, v0, Lo/esx;->G:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 501
    iget-object v0, p0, Lo/esv;->d:Lo/esx;

    iget-object v0, v0, Lo/esx;->z:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 502
    iget-object v0, p0, Lo/esv;->d:Lo/esx;

    iget-object v0, v0, Lo/esx;->x:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 503
    iget-object v0, p0, Lo/esv;->d:Lo/esx;

    iget-object v0, v0, Lo/esx;->v:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 504
    iget-object v0, p0, Lo/esv;->d:Lo/esx;

    iget-object v0, v0, Lo/esx;->w:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 505
    iget-object v0, p0, Lo/esv;->d:Lo/esx;

    iget-object v0, v0, Lo/esx;->j:Landroid/widget/ImageView;

    invoke-virtual {v0, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 506
    iget-object v0, p0, Lo/esv;->d:Lo/esx;

    iget-object v0, v0, Lo/esx;->n:Lo/egb;

    invoke-virtual {v0, p0}, Lo/egb;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 507
    iget-object v0, p0, Lo/esv;->d:Lo/esx;

    iget-object v0, v0, Lo/esx;->q:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 508
    iget-object v0, p0, Lo/esv;->d:Lo/esx;

    iget-object v0, v0, Lo/esx;->j:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 509
    iget-object v0, p0, Lo/esv;->d:Lo/esx;

    iget-object v0, v0, Lo/esx;->g:Lo/egb;

    invoke-virtual {v0, p0}, Lo/egb;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 510
    iget-object v0, p0, Lo/esv;->d:Lo/esx;

    iget-object v0, v0, Lo/esx;->E:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 511
    invoke-direct {p0}, Lo/esv;->s()V

    .line 513
    iget-boolean v0, p0, Lo/esv;->w:Z

    if-eqz v0, :cond_3

    iget-object v0, p0, Lo/esv;->e:Lo/cmj;

    invoke-virtual {v0}, Lo/cmj;->a()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_3

    .line 514
    iget-object v0, p0, Lo/esv;->d:Lo/esx;

    iget-object v0, v0, Lo/esx;->C:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 515
    iget-object v0, p0, Lo/esv;->d:Lo/esx;

    iget-object v0, v0, Lo/esx;->F:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 516
    iget-object v0, p0, Lo/esv;->d:Lo/esx;

    iget-object v0, v0, Lo/esx;->I:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 517
    iget-object v0, p0, Lo/esv;->d:Lo/esx;

    iget-object v0, v0, Lo/esx;->v:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 522
    :cond_3
    invoke-direct {p0}, Lo/esv;->w()V

    .line 524
    iget-object v0, p0, Lo/esv;->r:Lo/esw;

    invoke-virtual {v0}, Lo/esw;->b()V

    .line 526
    const-string v0, "SCUI_StepsCardData"

    const-string v1, "-getCardViewHolder end"

    invoke-static {v0, v1}, Lo/dbf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 527
    iget-object v0, p0, Lo/esv;->d:Lo/esx;

    return-object v0
.end method

.method public b()V
    .locals 4

    .line 604
    const-string v0, "SCUI_StepsCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "====onPause===="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 605
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/esv;->z:Z

    .line 606
    return-void
.end method

.method public c()V
    .locals 6

    .line 819
    iget-object v0, p0, Lo/esv;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/vu;->a(Landroid/content/Context;)Lo/vu;

    move-result-object v0

    iget-object v1, p0, Lo/esv;->a:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lo/vu;->e(Landroid/content/Context;)I

    move-result v4

    .line 820
    const-string v0, "SCUI_StepsCardData"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "acquireRankNum rankNum="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 821
    iget-object v0, p0, Lo/esv;->s:Landroid/os/Handler;

    const/4 v1, 0x6

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v4, v2}, Landroid/os/Handler;->obtainMessage(III)Landroid/os/Message;

    move-result-object v5

    .line 822
    iget-object v0, p0, Lo/esv;->s:Landroid/os/Handler;

    invoke-virtual {v0, v5}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 823
    return-void
.end method

.method public d()V
    .locals 4

    .line 535
    invoke-super {p0}, Lo/esu;->d()V

    .line 536
    const-string v0, "SCUI_StepsCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "====onResume===="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 537
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/esv;->z:Z

    .line 538
    invoke-virtual {p0}, Lo/esv;->e()V

    .line 539
    iget-object v0, p0, Lo/esv;->r:Lo/esw;

    invoke-virtual {v0}, Lo/esw;->b()V

    .line 541
    invoke-direct {p0}, Lo/esv;->v()V

    .line 542
    return-void
.end method

.method public e()V
    .locals 0

    .line 610
    invoke-virtual {p0}, Lo/esv;->h()V

    .line 611
    invoke-virtual {p0}, Lo/esv;->g()V

    .line 612
    invoke-direct {p0}, Lo/esv;->z()V

    .line 613
    invoke-direct {p0}, Lo/esv;->y()V

    .line 614
    invoke-direct {p0}, Lo/esv;->x()V

    .line 616
    invoke-direct {p0}, Lo/esv;->w()V

    .line 617
    invoke-virtual {p0}, Lo/esv;->k()V

    .line 618
    return-void
.end method

.method public f()V
    .locals 5

    .line 1636
    iget-object v0, p0, Lo/esv;->x:Landroid/content/BroadcastReceiver;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    iget-boolean v0, p0, Lo/esv;->v:Z

    if-eqz v0, :cond_1

    .line 1638
    :try_start_0
    iget-object v0, p0, Lo/esv;->a:Landroid/content/Context;

    invoke-static {v0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v4

    .line 1639
    if-eqz v4, :cond_0

    .line 1640
    iget-object v0, p0, Lo/esv;->x:Landroid/content/BroadcastReceiver;

    invoke-virtual {v4, v0}, Landroid/support/v4/content/LocalBroadcastManager;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 1641
    const-string v0, "SCUI_StepsCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "hiBroadcasetReceiver unregister"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 1643
    :cond_0
    const-string v0, "SCUI_StepsCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "hiBroadcasetReceiver unregiste fail"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1647
    :goto_0
    goto :goto_1

    .line 1645
    :catch_0
    move-exception v4

    .line 1646
    const-string v0, "SCUI_StepsCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "IllegalArgumentException  hiBroadcasetReceiver unregister"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1649
    :cond_1
    :goto_1
    return-void
.end method

.method public g()V
    .locals 5

    .line 849
    const-string v0, "SCUI_StepsCardData-acquireTimeCount enter"

    invoke-static {v0}, Lo/dbf;->d(Ljava/lang/String;)V

    .line 850
    new-instance v4, Lcom/huawei/hihealth/HiAggregateOption;

    invoke-direct {v4}, Lcom/huawei/hihealth/HiAggregateOption;-><init>()V

    .line 851
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/cnk;->d(J)J

    move-result-wide v0

    invoke-virtual {v4, v0, v1}, Lcom/huawei/hihealth/HiAggregateOption;->setStartTime(J)V

    .line 852
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/cnk;->i(J)J

    move-result-wide v0

    invoke-virtual {v4, v0, v1}, Lcom/huawei/hihealth/HiAggregateOption;->setEndTime(J)V

    .line 853
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setAggregateType(I)V

    .line 854
    const/4 v0, 0x1

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setType([I)V

    .line 855
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "TOTAL"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setConstantsKey([Ljava/lang/String;)V

    .line 856
    const/4 v0, 0x3

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setGroupUnitType(I)V

    .line 857
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setReadType(I)V

    .line 858
    const-string v0, "SCUI_StepsCardData"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getFitnessDataDetailByData aggregateOption="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Lcom/huawei/hihealth/HiAggregateOption;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 859
    iget-object v0, p0, Lo/esv;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    iget-object v1, p0, Lo/esv;->H:Lo/esv$e;

    invoke-interface {v0, v4, v1}, Lo/clt;->b(Lcom/huawei/hihealth/HiAggregateOption;Lo/cly;)V

    .line 860
    return-void

    :array_0
    .array-data 4
        0xb7fd
    .end array-data
.end method

.method public h()V
    .locals 4

    .line 826
    const-string v0, "SCUI_StepsCardData-acquireGoalSteps enter"

    invoke-static {v0}, Lo/dbf;->d(Ljava/lang/String;)V

    .line 827
    const-string v0, "SCUI_StepsCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HiHealthManager.getHealthAPI"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 828
    invoke-static {}, Lo/dgu;->c()Lo/dgu;

    move-result-object v0

    iget-object v1, p0, Lo/esv;->f:Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;

    new-instance v2, Lo/esv$6;

    invoke-direct {v2, p0}, Lo/esv$6;-><init>(Lo/esv;)V

    invoke-virtual {v0, v1, v2}, Lo/dgu;->e(Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 846
    return-void
.end method

.method public k()V
    .locals 8

    .line 910
    const-string v0, "SCUI_StepsCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "acquireIfHasHalfYearHeightData enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 911
    new-instance v4, Lcom/huawei/hihealth/HiDataReadOption;

    invoke-direct {v4}, Lcom/huawei/hihealth/HiDataReadOption;-><init>()V

    .line 912
    const/4 v0, 0x1

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiDataReadOption;->setType([I)V

    .line 913
    invoke-static {}, Lo/dbu;->b()Ljava/util/Date;

    move-result-object v5

    .line 914
    const/4 v0, -0x5

    invoke-static {v5, v0}, Lo/dbu;->a(Ljava/util/Date;I)Ljava/util/Date;

    move-result-object v6

    .line 915
    invoke-static {v6}, Lo/dbu;->g(Ljava/util/Date;)Ljava/util/Date;

    move-result-object v7

    .line 916
    invoke-virtual {v7}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    invoke-virtual {v4, v0, v1}, Lcom/huawei/hihealth/HiDataReadOption;->setStartTime(J)V

    .line 917
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/cnk;->i(J)J

    move-result-wide v0

    invoke-virtual {v4, v0, v1}, Lcom/huawei/hihealth/HiDataReadOption;->setEndTime(J)V

    .line 918
    iget-object v0, p0, Lo/esv;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    iget-object v1, p0, Lo/esv;->E:Lo/esv$d;

    invoke-interface {v0, v4, v1}, Lo/clt;->e(Lcom/huawei/hihealth/HiDataReadOption;Lo/cmd;)V

    .line 919
    return-void

    :array_0
    .array-data 4
        0x9c45
    .end array-data
.end method

.method public onClick(Landroid/view/View;)V
    .locals 10

    .line 648
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 649
    const-string v0, "click"

    const-string v1, "1"

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 650
    iget-wide v5, p0, Lo/esv;->b:J

    .line 651
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/huawei/ui/homehealth/R$id;->stepLayout:I

    if-ne v0, v1, :cond_1

    .line 652
    const-string v0, "SCUI_StepsCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "click into steps = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/esv;->o:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 653
    const-string v0, "type"

    const-string v1, "1"

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 654
    sget-object v0, Lo/dae;->aG:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v7

    .line 655
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lo/esv;->a:Landroid/content/Context;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v7, v4, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 656
    iget-object v0, p0, Lo/esv;->e:Lo/cmj;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/cmj;->b(Lo/cms;)V

    .line 658
    iget v0, p0, Lo/esv;->o:I

    if-gtz v0, :cond_0

    iget-object v0, p0, Lo/esv;->e:Lo/cmj;

    invoke-virtual {v0}, Lo/cmj;->a()I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    .line 659
    iget-object v0, p0, Lo/esv;->a:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/homehealth/R$string;->IDS_hwh_home_phone_not_support_step_no_detail_tips:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v8

    .line 660
    iget-object v0, p0, Lo/esv;->a:Landroid/content/Context;

    const/4 v1, 0x0

    invoke-static {v0, v8, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 661
    goto :goto_0

    .line 662
    :cond_0
    new-instance v8, Landroid/content/Intent;

    iget-object v0, p0, Lo/esv;->a:Landroid/content/Context;

    const-class v1, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;

    invoke-direct {v8, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 663
    const-string v0, "today_current_steps_total"

    iget v1, p0, Lo/esv;->o:I

    invoke-virtual {v8, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 664
    const-string v0, "today_current_distance_total"

    iget v1, p0, Lo/esv;->m:I

    invoke-virtual {v8, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 665
    iget-object v0, p0, Lo/esv;->a:Landroid/content/Context;

    invoke-virtual {v0, v8}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 666
    const/4 v0, 0x1

    invoke-static {v0}, Lo/erd;->e(I)V

    .line 668
    :goto_0
    goto/16 :goto_1

    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/huawei/ui/homehealth/R$id;->hw_health_steps_card_distance:I

    if-ne v0, v1, :cond_2

    .line 669
    const-string v0, "type"

    const-string v1, "2"

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 670
    sget-object v0, Lo/dae;->aG:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v7

    .line 671
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lo/esv;->a:Landroid/content/Context;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v7, v4, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 672
    iget-object v0, p0, Lo/esv;->e:Lo/cmj;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/cmj;->b(Lo/cms;)V

    .line 673
    new-instance v8, Landroid/content/Intent;

    iget-object v0, p0, Lo/esv;->a:Landroid/content/Context;

    const-class v1, Lcom/huawei/ui/main/stories/fitness/activity/distance/FitnessDistanceDetailActivity;

    invoke-direct {v8, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 674
    const-string v0, "today_current_steps_total"

    iget v1, p0, Lo/esv;->o:I

    invoke-virtual {v8, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 675
    const-string v0, "today_current_distance_total"

    iget v1, p0, Lo/esv;->m:I

    invoke-virtual {v8, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 676
    iget-object v0, p0, Lo/esv;->a:Landroid/content/Context;

    invoke-virtual {v0, v8}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 677
    const/4 v0, 0x1

    invoke-static {v0}, Lo/erd;->e(I)V

    .line 679
    goto/16 :goto_1

    :cond_2
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/huawei/ui/homehealth/R$id;->hw_health_steps_card_floors:I

    if-ne v0, v1, :cond_3

    .line 680
    const-string v0, "SCUI_StepsCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "click into climb = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/esv;->n:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 681
    sget-object v0, Lo/dae;->bv:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v7

    .line 682
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lo/esv;->a:Landroid/content/Context;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v7, v4, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 683
    iget-object v0, p0, Lo/esv;->e:Lo/cmj;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/cmj;->b(Lo/cms;)V

    .line 684
    new-instance v8, Landroid/content/Intent;

    invoke-direct {v8}, Landroid/content/Intent;-><init>()V

    .line 685
    new-instance v9, Landroid/os/Bundle;

    invoke-direct {v9}, Landroid/os/Bundle;-><init>()V

    .line 686
    const-string v0, "intent_key_query_start_time"

    invoke-virtual {v9, v0, v5, v6}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    .line 687
    iget-object v0, p0, Lo/esv;->a:Landroid/content/Context;

    const-class v1, Lcom/huawei/ui/main/stories/fitness/activity/climb/FitnessClimbDetailActivity;

    invoke-virtual {v8, v0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 688
    const-string v0, "bundle_key_data"

    invoke-virtual {v8, v0, v9}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;

    .line 689
    const-string v0, "today_current_climb_total"

    iget v1, p0, Lo/esv;->n:I

    invoke-virtual {v8, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 690
    iget-object v0, p0, Lo/esv;->a:Landroid/content/Context;

    invoke-virtual {v0, v8}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 691
    const/4 v0, 0x1

    invoke-static {v0}, Lo/erd;->e(I)V

    .line 692
    goto/16 :goto_1

    :cond_3
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/huawei/ui/homehealth/R$id;->hw_health_steps_card_calories:I

    if-ne v0, v1, :cond_4

    .line 693
    const-string v0, "SCUI_StepsCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "click into calories = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/esv;->p:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 694
    sget-object v0, Lo/dae;->aI:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v7

    .line 695
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lo/esv;->a:Landroid/content/Context;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v7, v4, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 697
    iget-object v0, p0, Lo/esv;->e:Lo/cmj;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/cmj;->b(Lo/cms;)V

    .line 698
    new-instance v8, Landroid/content/Intent;

    invoke-direct {v8}, Landroid/content/Intent;-><init>()V

    .line 699
    new-instance v9, Landroid/os/Bundle;

    invoke-direct {v9}, Landroid/os/Bundle;-><init>()V

    .line 700
    const-string v0, "intent_key_query_start_time"

    invoke-virtual {v9, v0, v5, v6}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    .line 701
    const-string v0, "testwang"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "startActivity CALORIE mQueryStartTime = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 702
    iget-object v0, p0, Lo/esv;->a:Landroid/content/Context;

    const-class v1, Lcom/huawei/ui/main/stories/fitness/activity/calorie/FitnessCalorieDetailActivity;

    invoke-virtual {v8, v0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 703
    const-string v0, "bundle_key_data"

    invoke-virtual {v8, v0, v9}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;

    .line 704
    const-string v0, "today_current_colories_total"

    iget v1, p0, Lo/esv;->p:I

    invoke-virtual {v8, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 705
    iget-object v0, p0, Lo/esv;->a:Landroid/content/Context;

    invoke-virtual {v0, v8}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 706
    const/4 v0, 0x1

    invoke-static {v0}, Lo/erd;->e(I)V

    .line 707
    goto/16 :goto_1

    :cond_4
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/huawei/ui/homehealth/R$id;->hw_health_fitness_data_origin_icon:I

    if-eq v0, v1, :cond_5

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/huawei/ui/homehealth/R$id;->hw_health_fitness_data_textview:I

    if-ne v0, v1, :cond_6

    .line 709
    :cond_5
    iget-object v0, p0, Lo/esv;->d:Lo/esx;

    if-eqz v0, :cond_9

    iget-object v0, p0, Lo/esv;->d:Lo/esx;

    iget-object v0, v0, Lo/esx;->j:Landroid/widget/ImageView;

    if-eqz v0, :cond_9

    iget-object v0, p0, Lo/esv;->d:Lo/esx;

    iget-object v0, v0, Lo/esx;->j:Landroid/widget/ImageView;

    .line 711
    invoke-virtual {v0}, Landroid/widget/ImageView;->getVisibility()I

    move-result v0

    if-nez v0, :cond_9

    .line 713
    sget-object v0, Lo/dae;->bz:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v7

    .line 714
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lo/esv;->a:Landroid/content/Context;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v7, v4, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 715
    invoke-direct {p0}, Lo/esv;->A()V

    .line 716
    goto/16 :goto_1

    .line 717
    :cond_6
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/huawei/ui/homehealth/R$id;->img_show_tips_close:I

    if-ne v0, v1, :cond_7

    .line 718
    invoke-direct {p0}, Lo/esv;->I()V

    goto :goto_1

    .line 719
    :cond_7
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/huawei/ui/homehealth/R$id;->time_strength_layout:I

    if-ne v0, v1, :cond_8

    .line 720
    const-string v0, "SCUI_StepsCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "click into mCount = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/esv;->A:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 721
    iget-object v0, p0, Lo/esv;->e:Lo/cmj;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/cmj;->b(Lo/cms;)V

    .line 722
    new-instance v7, Landroid/content/Intent;

    iget-object v0, p0, Lo/esv;->a:Landroid/content/Context;

    const-class v1, Lcom/huawei/ui/main/stories/fitness/activity/sportintensity/FitnessSportIntensityDetailActivity;

    invoke-direct {v7, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 723
    const-string v0, "today_current_middle_and_high_total"

    iget v1, p0, Lo/esv;->A:I

    invoke-virtual {v7, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 724
    iget-object v0, p0, Lo/esv;->a:Landroid/content/Context;

    invoke-virtual {v0, v7}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 725
    const/4 v0, 0x1

    invoke-static {v0}, Lo/erd;->e(I)V

    .line 726
    goto :goto_1

    :cond_8
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/huawei/ui/homehealth/R$id;->opera_msg_layout:I

    if-ne v0, v1, :cond_9

    .line 727
    iget-object v0, p0, Lo/esv;->r:Lo/esw;

    iget-object v1, p0, Lo/esv;->a:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lo/esw;->e(Landroid/content/Context;)V

    .line 729
    :cond_9
    :goto_1
    return-void
.end method
