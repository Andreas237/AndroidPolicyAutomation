.class public Lo/alt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/alt$c;,
        Lo/alt$a;,
        Lo/alt$e;,
        Lo/alt$b;,
        Lo/alt$d;
    }
.end annotation


# static fields
.field private static J:Lo/alt;


# instance fields
.field private A:I

.field private B:Lo/amw;

.field private C:Z

.field private D:Lcom/huawei/health/manager/receiver/DaemonDynamicBroadcastReceiver;

.field private E:I

.field private F:J

.field private G:I

.field private H:Landroid/os/Handler;

.field private I:Z

.field private K:Lo/ala;

.field private L:Lo/and;

.field private M:J

.field private N:Lo/amo;

.field private O:Z

.field private P:J

.field private Q:J

.field private R:J

.field private S:J

.field private T:J

.field private U:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private V:Lo/ame;

.field private W:Z

.field private X:Lo/anb;

.field private Y:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lo/aky;>;"
        }
    .end annotation
.end field

.field private a:Lo/anr;

.field private b:Lo/abv;

.field c:Landroid/os/HandlerThread;

.field private d:Lo/abk;

.field private e:Lo/abt;

.field private f:Lo/abm;

.field private g:Z

.field private h:Lo/alp;

.field private i:Lo/alq;

.field private j:Ljava/lang/String;

.field private k:Lo/abo;

.field private l:I

.field private m:I

.field private n:I

.field private o:I

.field private p:I

.field private q:Lo/amp;

.field private r:I

.field private s:I

.field private t:I

.field private u:I

.field private v:Lo/ana;

.field private w:D

.field private x:D

.field private y:Landroid/content/Context;

.field private z:D


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 189
    const/4 v0, 0x0

    sput-object v0, Lo/alt;->J:Lo/alt;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 211
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 125
    const/4 v0, 0x0

    iput-object v0, p0, Lo/alt;->b:Lo/abv;

    .line 126
    const/4 v0, 0x0

    iput-object v0, p0, Lo/alt;->a:Lo/anr;

    .line 127
    const/4 v0, 0x0

    iput-object v0, p0, Lo/alt;->e:Lo/abt;

    .line 129
    const/4 v0, 0x0

    iput-object v0, p0, Lo/alt;->d:Lo/abk;

    .line 130
    const/4 v0, 0x0

    iput-object v0, p0, Lo/alt;->f:Lo/abm;

    .line 131
    const/4 v0, 0x0

    iput-object v0, p0, Lo/alt;->k:Lo/abo;

    .line 132
    const/4 v0, 0x0

    iput-object v0, p0, Lo/alt;->i:Lo/alq;

    .line 133
    const/4 v0, 0x0

    iput-object v0, p0, Lo/alt;->h:Lo/alp;

    .line 135
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/alt;->g:Z

    .line 137
    const/4 v0, 0x0

    iput v0, p0, Lo/alt;->l:I

    .line 138
    const/4 v0, 0x0

    iput v0, p0, Lo/alt;->n:I

    .line 139
    const/4 v0, 0x0

    iput v0, p0, Lo/alt;->p:I

    .line 140
    const/4 v0, 0x0

    iput v0, p0, Lo/alt;->m:I

    .line 141
    const/4 v0, 0x0

    iput v0, p0, Lo/alt;->o:I

    .line 143
    const/4 v0, 0x0

    iput-object v0, p0, Lo/alt;->q:Lo/amp;

    .line 145
    const/4 v0, 0x0

    iput v0, p0, Lo/alt;->r:I

    .line 146
    const/4 v0, 0x0

    iput v0, p0, Lo/alt;->s:I

    .line 147
    const/4 v0, 0x0

    iput v0, p0, Lo/alt;->u:I

    .line 148
    const/4 v0, 0x0

    iput v0, p0, Lo/alt;->t:I

    .line 150
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/alt;->w:D

    .line 151
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/alt;->z:D

    .line 152
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/alt;->x:D

    .line 154
    const/4 v0, 0x0

    iput-object v0, p0, Lo/alt;->y:Landroid/content/Context;

    .line 155
    const/4 v0, 0x0

    iput-object v0, p0, Lo/alt;->v:Lo/ana;

    .line 160
    const-string v0, "unKnown"

    iput-object v0, p0, Lo/alt;->j:Ljava/lang/String;

    .line 169
    const/4 v0, 0x0

    iput v0, p0, Lo/alt;->A:I

    .line 170
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/alt;->C:Z

    .line 173
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/alt;->I:Z

    .line 175
    new-instance v0, Landroid/os/HandlerThread;

    const-string v1, "DaemonLogicStepCounter"

    invoke-direct {v0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lo/alt;->c:Landroid/os/HandlerThread;

    .line 177
    const/4 v0, 0x0

    iput-object v0, p0, Lo/alt;->H:Landroid/os/Handler;

    .line 179
    const/4 v0, 0x0

    iput v0, p0, Lo/alt;->G:I

    .line 180
    const/4 v0, 0x0

    iput v0, p0, Lo/alt;->E:I

    .line 181
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/alt;->F:J

    .line 183
    const/4 v0, 0x0

    iput-object v0, p0, Lo/alt;->K:Lo/ala;

    .line 185
    const/4 v0, 0x0

    iput-object v0, p0, Lo/alt;->N:Lo/amo;

    .line 187
    const/4 v0, 0x0

    iput-object v0, p0, Lo/alt;->L:Lo/and;

    .line 191
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lo/alt;->M:J

    .line 193
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/alt;->R:J

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/alt;->P:J

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/alt;->Q:J

    .line 194
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/alt;->S:J

    .line 195
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/alt;->O:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/alt;->W:Z

    .line 196
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lo/alt;->U:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 198
    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lo/alt;->T:J

    .line 1857
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/alt;->Y:Ljava/util/ArrayList;

    .line 212
    iput-object p1, p0, Lo/alt;->y:Landroid/content/Context;

    .line 213
    new-instance v0, Lo/amp;

    iget-object v1, p0, Lo/alt;->y:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/amp;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/alt;->q:Lo/amp;

    .line 214
    new-instance v0, Lo/anr;

    iget-object v1, p0, Lo/alt;->y:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/anr;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/alt;->a:Lo/anr;

    .line 215
    iget-object v0, p0, Lo/alt;->a:Lo/anr;

    invoke-virtual {v0}, Lo/anr;->e()V

    .line 217
    return-void
.end method

.method private A()V
    .locals 1

    .line 1221
    iget-object v0, p0, Lo/alt;->X:Lo/anb;

    invoke-virtual {v0}, Lo/anb;->c()V

    .line 1222
    return-void
.end method

.method private B()V
    .locals 4

    .line 1241
    const-string v0, "Step_LSC"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "startStepCounterInter mStandStepCounter = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/alt;->b:Lo/abv;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1243
    iget-object v0, p0, Lo/alt;->b:Lo/abv;

    if-eqz v0, :cond_0

    .line 1244
    iget-object v0, p0, Lo/alt;->b:Lo/abv;

    invoke-virtual {v0}, Lo/abv;->c()V

    .line 1245
    const-string v0, "Step_LSC"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startStepCounterInter stand"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1248
    :cond_0
    iget-object v0, p0, Lo/alt;->f:Lo/abm;

    if-eqz v0, :cond_1

    .line 1249
    iget-object v0, p0, Lo/alt;->f:Lo/abm;

    invoke-virtual {v0}, Lo/abm;->a()V

    .line 1250
    const-string v0, "Step_LSC"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startStepCounterInter extend"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1253
    :cond_1
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/alt;->g:Z

    .line 1254
    return-void
.end method

.method private C()V
    .locals 0

    .line 1030
    invoke-static {}, Lo/amr;->d()V

    .line 1031
    return-void
.end method

.method private D()V
    .locals 3

    .line 1035
    iget-object v0, p0, Lo/alt;->H:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 1036
    iget-object v0, p0, Lo/alt;->H:Landroid/os/Handler;

    const/16 v1, 0x3ee

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v2

    .line 1037
    const/16 v0, 0xc8

    iput v0, v2, Landroid/os/Message;->arg1:I

    .line 1038
    iget-object v0, p0, Lo/alt;->H:Landroid/os/Handler;

    invoke-virtual {v0, v2}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 1040
    :cond_0
    return-void
.end method

.method private E()V
    .locals 2

    .line 1352
    iget-object v0, p0, Lo/alt;->y:Landroid/content/Context;

    invoke-static {v0}, Lo/cne;->e(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/alt;->j:Ljava/lang/String;

    .line 1353
    iget-object v0, p0, Lo/alt;->L:Lo/and;

    iget-object v1, p0, Lo/alt;->j:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/and;->c(Ljava/lang/String;)V

    .line 1354
    iget-object v0, p0, Lo/alt;->k:Lo/abo;

    if-eqz v0, :cond_0

    .line 1356
    iget-object v0, p0, Lo/alt;->k:Lo/abo;

    iget-object v1, p0, Lo/alt;->j:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/abo;->e(Ljava/lang/String;)V

    .line 1358
    :cond_0
    return-void
.end method

.method private F()V
    .locals 2

    .line 1365
    iget-object v0, p0, Lo/alt;->y:Landroid/content/Context;

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    new-instance v1, Lo/alt$3;

    invoke-direct {v1, p0}, Lo/alt$3;-><init>(Lo/alt;)V

    invoke-interface {v0, v1}, Lo/clt;->a(Lo/clz;)V

    .line 1405
    return-void
.end method

.method private G()V
    .locals 6

    .line 1815
    const-string v0, "Step_LSC"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "compareMidWareCacheAndLocalCache enter..."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1817
    iget-object v0, p0, Lo/alt;->f:Lo/abm;

    check-cast v0, Lo/abp;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-static {v1, v2}, Lo/amz;->c(J)J

    move-result-wide v1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    new-instance v5, Lo/alt$5;

    invoke-direct {v5, p0}, Lo/alt$5;-><init>(Lo/alt;)V

    invoke-virtual/range {v0 .. v5}, Lo/abp;->d(JJLo/abp$b;)V

    .line 1840
    return-void
.end method

.method private H()V
    .locals 3

    .line 1508
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 1509
    const/4 v0, 0x4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1510
    iget-object v0, p0, Lo/alt;->y:Landroid/content/Context;

    invoke-static {v0}, Lo/clq;->e(Landroid/content/Context;)Lo/clq;

    move-result-object v0

    new-instance v1, Lo/alt$1;

    invoke-direct {v1, p0}, Lo/alt$1;-><init>(Lo/alt;)V

    invoke-virtual {v0, v2, v1}, Lo/clq;->e(Ljava/util/List;Lo/cmh;)V

    .line 1515
    return-void
.end method

.method private I()V
    .locals 4

    .line 1798
    const-string v0, "Step_LSC"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "CLASS1 change to CLASS2"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1800
    iget-object v0, p0, Lo/alt;->y:Landroid/content/Context;

    const/4 v1, 0x2

    invoke-static {v0, v1}, Lo/akz;->b(Landroid/content/Context;I)V

    .line 1801
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/alt;->I:Z

    .line 1803
    iget-object v0, p0, Lo/alt;->d:Lo/abk;

    invoke-virtual {v0}, Lo/abk;->a()V

    .line 1804
    iget-object v0, p0, Lo/alt;->f:Lo/abm;

    invoke-virtual {v0}, Lo/abm;->d()V

    .line 1805
    iget-object v0, p0, Lo/alt;->d:Lo/abk;

    invoke-virtual {v0}, Lo/abk;->d()Lo/abm;

    move-result-object v0

    iput-object v0, p0, Lo/alt;->f:Lo/abm;

    .line 1806
    iget-object v0, p0, Lo/alt;->f:Lo/abm;

    invoke-virtual {v0}, Lo/abm;->a()V

    .line 1807
    iget-object v0, p0, Lo/alt;->i:Lo/alq;

    invoke-virtual {v0}, Lo/alq;->a()V

    .line 1808
    iget-object v0, p0, Lo/alt;->h:Lo/alp;

    invoke-virtual {v0}, Lo/alp;->a()V

    .line 1812
    return-void
.end method

.method private a(I)V
    .locals 5

    .line 370
    iget-object v0, p0, Lo/alt;->y:Landroid/content/Context;

    if-eqz v0, :cond_0

    .line 372
    iget-wide v0, p0, Lo/alt;->z:D

    iget v2, p0, Lo/alt;->t:I

    sub-int v2, p1, v2

    int-to-double v2, v2

    add-double/2addr v0, v2

    iput-wide v0, p0, Lo/alt;->z:D

    .line 373
    iget-object v0, p0, Lo/alt;->y:Landroid/content/Context;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    iget-wide v3, p0, Lo/alt;->z:D

    invoke-static {v0, v1, v2, v3, v4}, Lo/amy;->d(Landroid/content/Context;JD)V

    .line 374
    const-string v0, "Step_LSC"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveDiffAltitudeToFile total db "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " mAltitudeDiff "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget-wide v2, p0, Lo/alt;->z:D

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 377
    :cond_0
    return-void
.end method

.method private a(Landroid/content/Intent;)V
    .locals 6

    .line 836
    if-eqz p1, :cond_c

    .line 838
    :try_start_0
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v4

    .line 840
    const-string v0, "Step_LSC"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "processHandleBroadcastAction action:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 843
    const-string v0, "android.intent.action.SCREEN_ON"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 845
    invoke-direct {p0}, Lo/alt;->x()V

    goto/16 :goto_0

    .line 847
    :cond_0
    const-string v0, "android.intent.action.TIME_TICK"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 848
    invoke-direct {p0}, Lo/alt;->C()V

    .line 849
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/alt;->d(Z)Z

    .line 851
    invoke-direct {p0}, Lo/alt;->A()V

    goto/16 :goto_0

    .line 853
    :cond_1
    const-string v0, "android.intent.action.ACTION_SHUTDOWN"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 854
    invoke-direct {p0}, Lo/alt;->y()V

    goto/16 :goto_0

    .line 856
    :cond_2
    const-string v0, "com.huawei.health.WIDGET_FORCE_UPDATE"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 858
    iget-object v0, p0, Lo/alt;->H:Landroid/os/Handler;

    if-eqz v0, :cond_c

    .line 859
    iget-object v0, p0, Lo/alt;->H:Landroid/os/Handler;

    const/16 v1, 0x3ee

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v5

    .line 860
    iget-object v0, p0, Lo/alt;->H:Landroid/os/Handler;

    invoke-virtual {v0, v5}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 861
    goto/16 :goto_0

    .line 862
    :cond_3
    const-string v0, "com.huawei.hihealth.action_today_sport_data_refresh"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 864
    invoke-direct {p0, p1}, Lo/alt;->d(Landroid/content/Intent;)V

    goto/16 :goto_0

    .line 866
    :cond_4
    const-string v0, "android.intent.action.TIME_SET"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 868
    invoke-direct {p0}, Lo/alt;->z()V

    goto/16 :goto_0

    .line 870
    :cond_5
    const-string v0, "com.huawei.health.action.UPLOAD_STATICS"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 871
    const-string v0, "extra_user_intent"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 872
    if-nez v5, :cond_6

    .line 873
    const-string v0, "Step_LSC"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "userIntent null,return"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 874
    return-void

    .line 877
    :cond_6
    const-string v0, "Step_LSC"

    const/4 v1, 0x2

    :try_start_1
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ACTION_RESTART_SENSOR_MSG userIntent:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v5, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 878
    iget-object v0, p0, Lo/alt;->b:Lo/abv;

    if-eqz v0, :cond_7

    .line 879
    iget-object v0, p0, Lo/alt;->b:Lo/abv;

    invoke-virtual {v0}, Lo/abv;->e()V

    .line 881
    :cond_7
    const-string v0, "extra_user_intent_pre_alarm"

    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 882
    invoke-virtual {p0}, Lo/alt;->o()V

    .line 884
    :cond_8
    goto :goto_0

    :cond_9
    const-string v0, "com.huawei.health.SERVER_TOKEN_INVALIDE"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 885
    iget-object v0, p0, Lo/alt;->y:Landroid/content/Context;

    invoke-static {v0}, Lo/amu;->c(Landroid/content/Context;)V

    goto :goto_0

    .line 886
    :cond_a
    const-string v0, "event_manual_ui"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_b

    .line 887
    iget-object v0, p0, Lo/alt;->y:Landroid/content/Context;

    invoke-static {v0}, Lo/akx;->b(Landroid/content/Context;)Lo/akx;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lo/akx;->e(I)Z

    goto :goto_0

    .line 888
    :cond_b
    const-string v0, "com.huawei.hihealth.action_data_refresh"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_c

    .line 889
    iget-object v0, p0, Lo/alt;->y:Landroid/content/Context;

    invoke-static {v0}, Lo/akx;->b(Landroid/content/Context;)Lo/akx;

    move-result-object v0

    const/4 v1, 0x5

    invoke-virtual {v0, v1}, Lo/akx;->e(I)Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 895
    :cond_c
    :goto_0
    goto :goto_1

    .line 893
    :catch_0
    move-exception v4

    .line 894
    const-string v0, "Step_LSC"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 896
    :goto_1
    return-void
.end method

.method private a(Landroid/os/Message;)V
    .locals 12

    .line 543
    const-string v0, "Step_LSC"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "user info change"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 544
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Landroid/os/Bundle;

    .line 545
    if-nez v6, :cond_0

    .line 546
    return-void

    .line 548
    :cond_0
    const-string v0, "weight"

    invoke-virtual {v6, v0}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ljava/lang/Float;

    .line 549
    if-eqz v7, :cond_1

    invoke-virtual {v7}, Ljava/lang/Float;->floatValue()F

    move-result v0

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lo/alt;->v:Lo/ana;

    invoke-virtual {v0}, Lo/ana;->b()F

    move-result v0

    :goto_0
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v7

    .line 550
    const-string v0, "height"

    invoke-virtual {v6, v0}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Ljava/lang/Float;

    .line 551
    if-eqz v8, :cond_2

    invoke-virtual {v8}, Ljava/lang/Float;->floatValue()F

    move-result v0

    goto :goto_1

    :cond_2
    iget-object v0, p0, Lo/alt;->v:Lo/ana;

    invoke-virtual {v0}, Lo/ana;->e()F

    move-result v0

    :goto_1
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v8

    .line 552
    const-string v0, "huid"

    invoke-virtual {v6, v0}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Ljava/lang/String;

    .line 553
    if-eqz v9, :cond_3

    goto :goto_2

    :cond_3
    iget-object v0, p0, Lo/alt;->v:Lo/ana;

    invoke-virtual {v0}, Lo/ana;->a()Ljava/lang/String;

    move-result-object v9

    .line 554
    :goto_2
    const-string v0, "ownerId"

    invoke-virtual {v6, v0}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Ljava/lang/Integer;

    .line 555
    if-eqz v10, :cond_4

    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    move-result v0

    goto :goto_3

    :cond_4
    iget-object v0, p0, Lo/alt;->v:Lo/ana;

    invoke-virtual {v0}, Lo/ana;->d()I

    move-result v0

    :goto_3
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    .line 556
    const-string v0, "gender"

    invoke-virtual {v6, v0}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Ljava/lang/Integer;

    .line 557
    if-eqz v11, :cond_5

    invoke-virtual {v11}, Ljava/lang/Integer;->intValue()I

    move-result v0

    goto :goto_4

    :cond_5
    iget-object v0, p0, Lo/alt;->v:Lo/ana;

    invoke-virtual {v0}, Lo/ana;->h()I

    move-result v0

    :goto_4
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    .line 558
    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lo/alt;->c(ZZ)V

    .line 559
    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-direct {p0, v0, v1, v2, v3}, Lo/alt;->b(Lo/ala;ZZZ)V

    .line 561
    const-string v0, "Step_LSC"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setUserInfo,gender:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v11, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 562
    iget-object v0, p0, Lo/alt;->v:Lo/ana;

    move-object v1, v9

    invoke-virtual {v7}, Ljava/lang/Float;->floatValue()F

    move-result v2

    invoke-virtual {v8}, Ljava/lang/Float;->floatValue()F

    move-result v3

    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    move-result v4

    invoke-virtual {v11}, Ljava/lang/Integer;->intValue()I

    move-result v5

    invoke-virtual/range {v0 .. v5}, Lo/ana;->e(Ljava/lang/String;FFII)V

    .line 563
    return-void
.end method

.method private a(Lo/ala;)V
    .locals 3

    .line 1436
    if-eqz p1, :cond_0

    .line 1437
    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 1438
    const-string v0, "result"

    const/4 v1, 0x1

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 1439
    invoke-interface {p1, v2}, Lo/ala;->b(Landroid/os/Bundle;)V

    .line 1441
    :cond_0
    return-void
.end method

.method private b(I)V
    .locals 4

    .line 1591
    iget-object v0, p0, Lo/alt;->N:Lo/amo;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/alt;->N:Lo/amo;

    invoke-virtual {v0}, Lo/amo;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1593
    iget-object v0, p0, Lo/alt;->N:Lo/amo;

    invoke-virtual {v0, p1}, Lo/amo;->d(I)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/alt;->H:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 1594
    const-string v0, "Step_LSC"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "reduce class"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1595
    iget-object v0, p0, Lo/alt;->H:Landroid/os/Handler;

    const/16 v1, 0x3f3

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 1598
    :cond_0
    return-void
.end method

.method private b(I[Ljava/lang/String;)V
    .locals 7

    .line 1088
    if-nez p2, :cond_0

    .line 1089
    return-void

    .line 1091
    :cond_0
    const-wide/16 v4, 0x0

    .line 1093
    const/4 v0, 0x0

    :try_start_0
    aget-object v0, p2, v0

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-wide v4

    .line 1097
    goto :goto_0

    .line 1094
    :catch_0
    move-exception v6

    .line 1095
    const-string v0, "Step_LSC"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "refreshCheckNewDay Exception"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1096
    return-void

    .line 1099
    :goto_0
    int-to-long v0, p1

    const-wide/32 v2, 0xea60

    mul-long/2addr v0, v2

    invoke-static {v4, v5, v0, v1}, Lo/amz;->c(JJ)Z

    move-result v0

    if-nez v0, :cond_1

    .line 1100
    const-string v0, "Step_LSC"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "refreshCheckNewDay: new day"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1101
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/alt;->d(Z)Z

    .line 1104
    :cond_1
    return-void
.end method

.method private b(Landroid/os/Message;)V
    .locals 6

    .line 301
    iget-object v0, p0, Lo/alt;->y:Landroid/content/Context;

    invoke-static {v0}, Lo/anb;->c(Landroid/content/Context;)Lo/anb;

    move-result-object v0

    iput-object v0, p0, Lo/alt;->X:Lo/anb;

    .line 302
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lo/ala;

    .line 304
    iget-object v0, p0, Lo/alt;->y:Landroid/content/Context;

    if-eqz v0, :cond_0

    .line 306
    iget-object v0, p0, Lo/alt;->y:Landroid/content/Context;

    invoke-static {v0}, Lo/amy;->p(Landroid/content/Context;)J

    move-result-wide v0

    iput-wide v0, p0, Lo/alt;->T:J

    .line 309
    iget-object v0, p0, Lo/alt;->y:Landroid/content/Context;

    invoke-static {v0}, Lo/akx;->b(Landroid/content/Context;)Lo/akx;

    move-result-object v0

    invoke-virtual {v0}, Lo/akx;->e()V

    .line 311
    iget-object v0, p0, Lo/alt;->y:Landroid/content/Context;

    invoke-static {v0}, Lo/clq;->e(Landroid/content/Context;)Lo/clq;

    move-result-object v0

    new-instance v1, Lo/alt$e;

    invoke-direct {v1, p0}, Lo/alt$e;-><init>(Lo/alt;)V

    const/4 v2, 0x4

    invoke-virtual {v0, v2, v1}, Lo/clq;->a(ILo/cmg;)V

    .line 313
    const-string v0, "Step_LSC"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "init ...."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 314
    iput-object v4, p0, Lo/alt;->K:Lo/ala;

    .line 317
    iget-object v0, p0, Lo/alt;->y:Landroid/content/Context;

    invoke-static {v0}, Lo/ana;->a(Landroid/content/Context;)V

    .line 318
    invoke-static {}, Lo/ana;->c()Lo/ana;

    move-result-object v0

    iput-object v0, p0, Lo/alt;->v:Lo/ana;

    .line 320
    new-instance v0, Lo/amw;

    iget-object v1, p0, Lo/alt;->y:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/amw;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/alt;->B:Lo/amw;

    .line 324
    :cond_0
    new-instance v0, Lo/and;

    iget-object v1, p0, Lo/alt;->y:Landroid/content/Context;

    iget-object v2, p0, Lo/alt;->j:Ljava/lang/String;

    iget-object v3, p0, Lo/alt;->H:Landroid/os/Handler;

    invoke-direct {v0, v1, v2, v3}, Lo/and;-><init>(Landroid/content/Context;Ljava/lang/String;Landroid/os/Handler;)V

    iput-object v0, p0, Lo/alt;->L:Lo/and;

    .line 326
    invoke-direct {p0}, Lo/alt;->s()V

    .line 328
    invoke-direct {p0}, Lo/alt;->q()V

    .line 330
    invoke-direct {p0}, Lo/alt;->t()Z

    move-result v5

    .line 332
    iget-object v0, p0, Lo/alt;->y:Landroid/content/Context;

    invoke-static {v0}, Lo/alq;->e(Landroid/content/Context;)Lo/alq;

    move-result-object v0

    iput-object v0, p0, Lo/alt;->i:Lo/alq;

    .line 334
    iget-object v0, p0, Lo/alt;->y:Landroid/content/Context;

    iget-object v1, p0, Lo/alt;->i:Lo/alq;

    iget-object v2, p0, Lo/alt;->k:Lo/abo;

    invoke-static {v0, v1, v2}, Lo/alp;->c(Landroid/content/Context;Lo/alq;Lo/abo;)Lo/alp;

    move-result-object v0

    iput-object v0, p0, Lo/alt;->h:Lo/alp;

    .line 338
    if-nez v5, :cond_1

    .line 339
    return-void

    .line 343
    :cond_1
    new-instance v0, Lo/ame;

    invoke-direct {v0}, Lo/ame;-><init>()V

    iput-object v0, p0, Lo/alt;->V:Lo/ame;

    .line 344
    iget-object v0, p0, Lo/alt;->V:Lo/ame;

    iget-object v1, p0, Lo/alt;->y:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lo/ame;->e(Landroid/content/Context;)V

    .line 345
    iget-object v0, p0, Lo/alt;->a:Lo/anr;

    iget-object v1, p0, Lo/alt;->V:Lo/ame;

    invoke-virtual {v0, v1}, Lo/anr;->d(Lo/alb;)V

    .line 347
    iget-object v0, p0, Lo/alt;->H:Landroid/os/Handler;

    if-eqz v0, :cond_2

    .line 348
    iget-object v0, p0, Lo/alt;->H:Landroid/os/Handler;

    const/16 v1, 0x3f0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 349
    iget-object v0, p0, Lo/alt;->H:Landroid/os/Handler;

    const/16 v1, 0x3ee

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 351
    :cond_2
    return-void
.end method

.method private b(Lo/ala;ZZZ)V
    .locals 4

    .line 1448
    iget-boolean v0, p0, Lo/alt;->I:Z

    if-nez v0, :cond_0

    .line 1449
    const-string v0, "Step_LSC"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "not support calss1,then uploadstaticdata"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1450
    invoke-virtual {p0}, Lo/alt;->o()V

    .line 1451
    invoke-direct {p0, p1}, Lo/alt;->a(Lo/ala;)V

    .line 1452
    return-void

    .line 1455
    :cond_0
    iget-object v0, p0, Lo/alt;->e:Lo/abt;

    if-eqz v0, :cond_2

    if-nez p2, :cond_2

    iget v0, p0, Lo/alt;->r:I

    iget v1, p0, Lo/alt;->m:I

    if-ne v0, v1, :cond_1

    if-eqz p3, :cond_2

    .line 1457
    :cond_1
    invoke-virtual {p0}, Lo/alt;->o()V

    .line 1458
    iget v0, p0, Lo/alt;->r:I

    iput v0, p0, Lo/alt;->m:I

    .line 1462
    :cond_2
    iget-object v0, p0, Lo/alt;->k:Lo/abo;

    new-instance v1, Lo/alt$2;

    invoke-direct {v1, p0, p1}, Lo/alt$2;-><init>(Lo/alt;Lo/ala;)V

    invoke-virtual {v0, v1}, Lo/abo;->e(Lo/amf$e;)V

    .line 1484
    return-void
.end method

.method static synthetic c(Lo/alt;)Landroid/os/Handler;
    .locals 1

    .line 86
    iget-object v0, p0, Lo/alt;->H:Landroid/os/Handler;

    return-object v0
.end method

.method public static c(Landroid/content/Context;)Lo/alt;
    .locals 3

    .line 203
    const-class v1, Lo/alt;

    monitor-enter v1

    .line 204
    :try_start_0
    sget-object v0, Lo/alt;->J:Lo/alt;

    if-nez v0, :cond_0

    .line 205
    new-instance v0, Lo/alt;

    invoke-direct {v0, p0}, Lo/alt;-><init>(Landroid/content/Context;)V

    sput-object v0, Lo/alt;->J:Lo/alt;

    .line 207
    :cond_0
    sget-object v0, Lo/alt;->J:Lo/alt;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    .line 208
    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method

.method private c(I)V
    .locals 5

    .line 1606
    iget-boolean v0, p0, Lo/alt;->C:Z

    if-eqz v0, :cond_0

    .line 1607
    iput p1, p0, Lo/alt;->A:I

    .line 1608
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/alt;->C:Z

    .line 1614
    :cond_0
    iget v0, p0, Lo/alt;->A:I

    sub-int v0, p1, v0

    const/16 v1, 0x64

    if-le v0, v1, :cond_2

    .line 1615
    const-string v0, "Step_LSC"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "standStepCounter report 100 steps,write fe"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1617
    iget-object v0, p0, Lo/alt;->H:Landroid/os/Handler;

    if-eqz v0, :cond_1

    .line 1618
    iget-object v0, p0, Lo/alt;->H:Landroid/os/Handler;

    const/16 v1, 0x3eb

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v4

    .line 1619
    iget-object v0, p0, Lo/alt;->H:Landroid/os/Handler;

    invoke-virtual {v0, v4}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 1621
    :cond_1
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/alt;->C:Z

    goto :goto_0

    .line 1622
    :cond_2
    iget v0, p0, Lo/alt;->A:I

    sub-int v0, p1, v0

    if-lez v0, :cond_3

    .line 1623
    iget-object v0, p0, Lo/alt;->H:Landroid/os/Handler;

    if-eqz v0, :cond_3

    .line 1624
    iget-object v0, p0, Lo/alt;->H:Landroid/os/Handler;

    const/16 v1, 0x3f2

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 1625
    iget-object v0, p0, Lo/alt;->H:Landroid/os/Handler;

    const/16 v1, 0x3f2

    const-wide/16 v2, 0x7530

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 1628
    :cond_3
    :goto_0
    return-void
.end method

.method private c(JIII)V
    .locals 10

    .line 1891
    iget-object v0, p0, Lo/alt;->Y:Ljava/util/ArrayList;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lo/alt;->Y:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_2

    .line 1892
    iget-object v6, p0, Lo/alt;->Y:Ljava/util/ArrayList;

    monitor-enter v6

    .line 1893
    :try_start_0
    iget-object v0, p0, Lo/alt;->Y:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lo/aky;

    .line 1894
    const/4 v0, 0x0

    if-eq v0, v8, :cond_0

    .line 1895
    move-object v0, v8

    move-wide v1, p1

    move v3, p3

    move v4, p4

    move v5, p5

    invoke-interface/range {v0 .. v5}, Lo/aky;->e(JIII)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1897
    :cond_0
    goto :goto_0

    .line 1898
    :cond_1
    monitor-exit v6

    goto :goto_1

    :catchall_0
    move-exception v9

    monitor-exit v6

    throw v9

    .line 1900
    :cond_2
    :goto_1
    return-void
.end method

.method static synthetic c(Lo/alt;Lo/ala;)V
    .locals 0

    .line 86
    invoke-direct {p0, p1}, Lo/alt;->a(Lo/ala;)V

    return-void
.end method

.method private c(ZZ)V
    .locals 12

    .line 1107
    iget-object v0, p0, Lo/alt;->e:Lo/abt;

    if-nez v0, :cond_0

    .line 1108
    const-string v0, "Step_LSC"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "refresReportData: mStandStepDataManager == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1109
    return-void

    .line 1111
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v7

    .line 1112
    invoke-static {v7, v8}, Lo/amz;->b(J)J

    move-result-wide v0

    long-to-int v9, v0

    .line 1128
    iget-object v0, p0, Lo/alt;->y:Landroid/content/Context;

    invoke-static {v0}, Lo/amy;->h(Landroid/content/Context;)[Ljava/lang/String;

    move-result-object v10

    .line 1130
    invoke-direct {p0, v9, v10}, Lo/alt;->b(I[Ljava/lang/String;)V

    .line 1131
    iget-object v0, p0, Lo/alt;->e:Lo/abt;

    invoke-virtual {v0}, Lo/abt;->b()I

    move-result v0

    iput v0, p0, Lo/alt;->r:I

    .line 1135
    iput v9, p0, Lo/alt;->G:I

    .line 1136
    iget v0, p0, Lo/alt;->G:I

    add-int/lit8 v0, v0, -0x1

    invoke-direct {p0, v0, v10}, Lo/alt;->e(I[Ljava/lang/String;)V

    .line 1138
    const-string v0, "Step_LSC"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "REPORT : "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget v2, p0, Lo/alt;->r:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget v2, p0, Lo/alt;->n:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1141
    iget-object v0, p0, Lo/alt;->i:Lo/alq;

    iget v1, p0, Lo/alt;->r:I

    invoke-virtual {v0, v7, v8, v1}, Lo/alq;->c(JI)I

    move-result v0

    iput v0, p0, Lo/alt;->u:I

    .line 1142
    iget-object v0, p0, Lo/alt;->h:Lo/alp;

    iget v1, p0, Lo/alt;->r:I

    invoke-virtual {v0, v7, v8, v1}, Lo/alp;->a(JI)I

    move-result v0

    iput v0, p0, Lo/alt;->s:I

    .line 1143
    iget-boolean v0, p0, Lo/alt;->I:Z

    if-eqz v0, :cond_1

    .line 1144
    iget-object v0, p0, Lo/alt;->k:Lo/abo;

    invoke-virtual {v0}, Lo/abo;->g()D

    move-result-wide v0

    double-to-int v0, v0

    iput v0, p0, Lo/alt;->t:I

    goto :goto_0

    .line 1146
    :cond_1
    const/4 v0, 0x0

    iput v0, p0, Lo/alt;->t:I

    .line 1148
    :goto_0
    iget v0, p0, Lo/alt;->t:I

    int-to-double v0, v0

    iget-wide v2, p0, Lo/alt;->z:D

    add-double/2addr v0, v2

    double-to-int v0, v0

    iput v0, p0, Lo/alt;->t:I

    .line 1151
    new-instance v0, Lo/ald;

    iget v1, p0, Lo/alt;->r:I

    iget-object v2, p0, Lo/alt;->e:Lo/abt;

    invoke-virtual {v2}, Lo/abt;->e()I

    move-result v2

    iget v3, p0, Lo/alt;->s:I

    iget v4, p0, Lo/alt;->u:I

    iget v5, p0, Lo/alt;->t:I

    iget-object v6, p0, Lo/alt;->q:Lo/amp;

    .line 1155
    invoke-virtual {v6}, Lo/amp;->e()I

    move-result v6

    invoke-direct/range {v0 .. v6}, Lo/ald;-><init>(IIIIII)V

    move-object v11, v0

    .line 1157
    iget-object v0, p0, Lo/alt;->L:Lo/and;

    invoke-virtual {v0, v11}, Lo/and;->b(Lo/ald;)V

    .line 1158
    iget-object v0, p0, Lo/alt;->a:Lo/anr;

    const-wide/16 v1, -0x1

    invoke-virtual {v0, v1, v2, v11}, Lo/anr;->e(JLo/ald;)V

    .line 1160
    iget-object v0, p0, Lo/alt;->a:Lo/anr;

    invoke-virtual {v0, p2}, Lo/anr;->c(Z)V

    .line 1161
    return-void
.end method

.method private c(Landroid/os/Message;)Z
    .locals 6

    .line 486
    const/4 v4, 0x1

    .line 487
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_0

    .line 489
    :pswitch_0
    invoke-direct {p0, p1}, Lo/alt;->g(Landroid/os/Message;)V

    .line 491
    goto :goto_1

    .line 494
    :pswitch_1
    invoke-direct {p0, p1}, Lo/alt;->o(Landroid/os/Message;)V

    .line 496
    goto :goto_1

    .line 499
    :pswitch_2
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Landroid/content/Intent;

    .line 500
    invoke-direct {p0, v5}, Lo/alt;->a(Landroid/content/Intent;)V

    .line 502
    goto :goto_1

    .line 505
    :pswitch_3
    invoke-direct {p0}, Lo/alt;->I()V

    .line 506
    goto :goto_1

    .line 508
    :pswitch_4
    const-string v0, "Step_LSC"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "sync with db"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 509
    new-instance v0, Lo/alt$d;

    invoke-direct {v0, p0}, Lo/alt$d;-><init>(Lo/alt;)V

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {p0, v0, v1, v2, v3}, Lo/alt;->b(Lo/ala;ZZZ)V

    .line 510
    goto :goto_1

    .line 512
    :pswitch_5
    invoke-direct {p0}, Lo/alt;->v()V

    .line 515
    goto :goto_1

    .line 518
    :pswitch_6
    invoke-direct {p0}, Lo/alt;->E()V

    .line 520
    goto :goto_1

    .line 522
    :pswitch_7
    invoke-direct {p0, p1}, Lo/alt;->i(Landroid/os/Message;)V

    .line 524
    goto :goto_1

    .line 526
    :pswitch_8
    invoke-direct {p0}, Lo/alt;->r()V

    .line 528
    goto :goto_1

    .line 530
    :goto_0
    :pswitch_9
    const/4 v4, 0x0

    .line 534
    :goto_1
    return v4

    :pswitch_data_0
    .packed-switch 0x3ed
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_6
        :pswitch_9
        :pswitch_9
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_9
        :pswitch_9
        :pswitch_9
        :pswitch_7
        :pswitch_9
        :pswitch_8
    .end packed-switch
.end method

.method static synthetic d(Lo/alt;)Lo/abm;
    .locals 1

    .line 86
    iget-object v0, p0, Lo/alt;->f:Lo/abm;

    return-object v0
.end method

.method private d(I[Ljava/lang/String;)V
    .locals 10

    .line 1762
    if-nez p2, :cond_0

    .line 1763
    return-void

    .line 1765
    :cond_0
    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    .line 1767
    const/4 v0, 0x0

    :try_start_0
    aget-object v0, p2, v0

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v4

    .line 1768
    const/4 v0, 0x2

    aget-object v0, p2, v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v6

    .line 1769
    const/4 v0, 0x3

    aget-object v0, p2, v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v7

    .line 1770
    const/4 v0, 0x4

    aget-object v0, p2, v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v8

    .line 1774
    goto :goto_0

    .line 1771
    :catch_0
    move-exception v9

    .line 1772
    const-string v0, "Step_LSC"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "stepsDetailCalculation Exception"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1773
    return-void

    .line 1776
    :goto_0
    int-to-long v0, p1

    const-wide/32 v2, 0xea60

    mul-long/2addr v0, v2

    invoke-static {v4, v5, v0, v1}, Lo/amz;->c(JJ)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1777
    iput v6, p0, Lo/alt;->l:I

    .line 1778
    iput v7, p0, Lo/alt;->n:I

    .line 1779
    iput v8, p0, Lo/alt;->p:I

    .line 1781
    :cond_1
    return-void
.end method

.method private d(Landroid/content/Intent;)V
    .locals 7

    .line 899
    const-string v0, "refresh_type"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v4

    .line 901
    const-string v0, "Step_LSC"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ACTION_SYNC_WITH_DB refreshType"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 903
    packed-switch v4, :pswitch_data_0

    goto/16 :goto_0

    .line 905
    :pswitch_0
    iget-object v0, p0, Lo/alt;->H:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 906
    iget-object v0, p0, Lo/alt;->H:Landroid/os/Handler;

    const/16 v1, 0x3f4

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v5

    .line 907
    iget-object v0, p0, Lo/alt;->H:Landroid/os/Handler;

    invoke-virtual {v0, v5}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 908
    invoke-direct {p0}, Lo/alt;->F()V

    .line 909
    goto :goto_1

    .line 914
    :pswitch_1
    invoke-direct {p0}, Lo/alt;->F()V

    .line 916
    goto :goto_1

    .line 919
    :pswitch_2
    iget-object v0, p0, Lo/alt;->H:Landroid/os/Handler;

    const/16 v1, 0x3f4

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v5

    .line 920
    iget-object v0, p0, Lo/alt;->H:Landroid/os/Handler;

    invoke-virtual {v0, v5}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 922
    goto :goto_1

    .line 925
    :pswitch_3
    new-instance v5, Landroid/content/Intent;

    const-string v0, "DaemonService_LocalBroadcast"

    invoke-direct {v5, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 926
    iget-object v0, p0, Lo/alt;->y:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 927
    const-string v0, "refresh_type"

    const/4 v1, 0x7

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 928
    iget-object v0, p0, Lo/alt;->y:Landroid/content/Context;

    invoke-static {v0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v6

    .line 929
    invoke-virtual {v6, v5}, Landroid/support/v4/content/LocalBroadcastManager;->sendBroadcast(Landroid/content/Intent;)Z

    .line 931
    goto :goto_1

    .line 934
    :goto_0
    :pswitch_4
    const-string v0, "Step_LSC"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ACTION_SYNC_WITH_DB no refreshType"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 938
    :cond_0
    :goto_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_4
        :pswitch_2
        :pswitch_4
        :pswitch_4
        :pswitch_1
        :pswitch_4
        :pswitch_3
    .end packed-switch
.end method

.method private d(Landroid/os/Message;)Z
    .locals 2

    .line 440
    const/4 v1, 0x1

    .line 441
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_0

    .line 443
    :pswitch_0
    invoke-direct {p0, p1}, Lo/alt;->b(Landroid/os/Message;)V

    .line 444
    goto :goto_1

    .line 447
    :pswitch_1
    invoke-direct {p0, p1}, Lo/alt;->f(Landroid/os/Message;)V

    .line 449
    goto :goto_1

    .line 452
    :pswitch_2
    invoke-direct {p0, p1}, Lo/alt;->k(Landroid/os/Message;)V

    .line 454
    goto :goto_1

    .line 457
    :pswitch_3
    invoke-direct {p0, p1}, Lo/alt;->h(Landroid/os/Message;)V

    .line 459
    goto :goto_1

    .line 463
    :pswitch_4
    invoke-direct {p0, p1}, Lo/alt;->a(Landroid/os/Message;)V

    .line 465
    goto :goto_1

    .line 468
    :pswitch_5
    invoke-direct {p0}, Lo/alt;->w()V

    .line 470
    goto :goto_1

    .line 473
    :pswitch_6
    invoke-direct {p0}, Lo/alt;->w()V

    .line 475
    goto :goto_1

    .line 478
    :goto_0
    :pswitch_7
    const/4 v1, 0x0

    .line 482
    :goto_1
    return v1

    :pswitch_data_0
    .packed-switch 0x3e8
        :pswitch_1
        :pswitch_3
        :pswitch_7
        :pswitch_5
        :pswitch_2
        :pswitch_7
        :pswitch_7
        :pswitch_7
        :pswitch_7
        :pswitch_7
        :pswitch_6
        :pswitch_7
        :pswitch_7
        :pswitch_7
        :pswitch_7
        :pswitch_7
        :pswitch_4
        :pswitch_7
        :pswitch_0
    .end packed-switch
.end method

.method static synthetic d(Lo/alt;Landroid/os/Message;)Z
    .locals 1

    .line 86
    invoke-direct {p0, p1}, Lo/alt;->e(Landroid/os/Message;)Z

    move-result v0

    return v0
.end method

.method static synthetic e(Lo/alt;)Lo/abo;
    .locals 1

    .line 86
    iget-object v0, p0, Lo/alt;->k:Lo/abo;

    return-object v0
.end method

.method private e(I)V
    .locals 5

    .line 1906
    iget-object v0, p0, Lo/alt;->Y:Ljava/util/ArrayList;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lo/alt;->Y:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_2

    .line 1907
    iget-object v1, p0, Lo/alt;->Y:Ljava/util/ArrayList;

    monitor-enter v1

    .line 1908
    :try_start_0
    iget-object v0, p0, Lo/alt;->Y:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/aky;

    .line 1909
    const/4 v0, 0x0

    if-eq v0, v3, :cond_0

    .line 1910
    invoke-interface {v3, p1}, Lo/aky;->e(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1912
    :cond_0
    goto :goto_0

    .line 1913
    :cond_1
    monitor-exit v1

    goto :goto_1

    :catchall_0
    move-exception v4

    monitor-exit v1

    throw v4

    .line 1915
    :cond_2
    :goto_1
    return-void
.end method

.method private e(I[Ljava/lang/String;)V
    .locals 10

    .line 1735
    invoke-direct {p0, p1, p2}, Lo/alt;->d(I[Ljava/lang/String;)V

    .line 1737
    const/4 v9, 0x0

    .line 1739
    iget-object v0, p0, Lo/alt;->k:Lo/abo;

    if-eqz v0, :cond_0

    .line 1740
    iget-object v0, p0, Lo/alt;->k:Lo/abo;

    invoke-virtual {v0, p1}, Lo/abo;->b(I)Lo/amd;

    move-result-object v9

    .line 1743
    :cond_0
    if-eqz v9, :cond_1

    .line 1744
    invoke-virtual {v9}, Lo/amd;->h()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 1746
    :sswitch_0
    iget v0, p0, Lo/alt;->p:I

    invoke-virtual {v9}, Lo/amd;->a()I

    move-result v1

    add-int/2addr v0, v1

    iput v0, p0, Lo/alt;->p:I

    .line 1747
    goto :goto_1

    .line 1749
    :sswitch_1
    iget v0, p0, Lo/alt;->n:I

    invoke-virtual {v9}, Lo/amd;->a()I

    move-result v1

    add-int/2addr v0, v1

    iput v0, p0, Lo/alt;->n:I

    .line 1750
    goto :goto_1

    .line 1752
    :goto_0
    iget v0, p0, Lo/alt;->l:I

    invoke-virtual {v9}, Lo/amd;->a()I

    move-result v1

    add-int/2addr v0, v1

    iput v0, p0, Lo/alt;->l:I

    .line 1756
    :cond_1
    :goto_1
    const-string v0, "Step_LSC"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "stepsDetailCalculation lastMin "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1757
    iget-object v0, p0, Lo/alt;->y:Landroid/content/Context;

    int-to-long v1, p1

    const-wide/32 v3, 0xea60

    mul-long/2addr v1, v3

    iget-object v3, p0, Lo/alt;->e:Lo/abt;

    .line 1758
    invoke-virtual {v3}, Lo/abt;->b()I

    move-result v3

    iget v4, p0, Lo/alt;->l:I

    iget v5, p0, Lo/alt;->n:I

    iget v6, p0, Lo/alt;->p:I

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v7

    .line 1757
    invoke-static/range {v0 .. v8}, Lo/amy;->e(Landroid/content/Context;JIIIIJ)V

    .line 1759
    return-void

    :sswitch_data_0
    .sparse-switch
        0x4e23 -> :sswitch_1
        0x4e24 -> :sswitch_0
    .end sparse-switch
.end method

.method private e(II)Z
    .locals 4

    .line 813
    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lo/alt;->c(ZZ)V

    .line 814
    iget-object v0, p0, Lo/alt;->e:Lo/abt;

    if-eqz v0, :cond_2

    .line 815
    iget-object v0, p0, Lo/alt;->e:Lo/abt;

    invoke-virtual {v0}, Lo/abt;->b()I

    move-result v0

    if-ne v0, p1, :cond_0

    .line 816
    const/4 v0, 0x0

    return v0

    .line 818
    :cond_0
    iget-object v0, p0, Lo/alt;->e:Lo/abt;

    invoke-virtual {v0, p1}, Lo/abt;->b(I)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 819
    iput p2, p0, Lo/alt;->n:I

    .line 820
    const/4 v0, 0x1

    return v0

    .line 822
    :cond_1
    const-string v0, "Step_LSC"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "syncWithHiHealth localTotalSteps > dBTotalSteps"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 823
    invoke-virtual {p0}, Lo/alt;->o()V

    .line 826
    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method private e(Landroid/os/Message;)Z
    .locals 2

    .line 428
    const/4 v1, 0x0

    .line 429
    if-eqz p1, :cond_0

    .line 430
    invoke-direct {p0, p1}, Lo/alt;->d(Landroid/os/Message;)Z

    move-result v1

    .line 431
    if-nez v1, :cond_0

    .line 432
    invoke-direct {p0, p1}, Lo/alt;->c(Landroid/os/Message;)Z

    move-result v1

    .line 436
    :cond_0
    return v1
.end method

.method private f(Landroid/os/Message;)V
    .locals 9

    .line 571
    iget-object v0, p0, Lo/alt;->U:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 572
    const-string v0, "Step_LSC"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onStandStepChanged phone shutdown, return"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 573
    return-void

    .line 576
    :cond_0
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v6

    .line 577
    iget v8, p1, Landroid/os/Message;->arg1:I

    .line 579
    iput v8, p0, Lo/alt;->o:I

    .line 581
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/alt;->d(Z)Z

    .line 583
    const-string v0, "Step_LSC"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onStandStepChanged "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 585
    invoke-direct {p0, v8}, Lo/alt;->b(I)V

    .line 587
    invoke-direct {p0, v8}, Lo/alt;->e(I)V

    .line 589
    invoke-direct {p0, v8}, Lo/alt;->c(I)V

    .line 591
    iget-object v0, p0, Lo/alt;->L:Lo/and;

    invoke-virtual {v0, v8}, Lo/and;->c(I)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 592
    const-string v0, "Step_LSC"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "flushTempCacheToDB by stand"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 593
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/alt;->b(Lo/ala;)V

    .line 596
    :cond_1
    iget-object v0, p0, Lo/alt;->e:Lo/abt;

    if-eqz v0, :cond_2

    .line 597
    iget-object v0, p0, Lo/alt;->e:Lo/abt;

    iget-object v1, p0, Lo/alt;->v:Lo/ana;

    invoke-virtual {v1}, Lo/ana;->d()I

    move-result v1

    move-wide v2, v6

    move v4, v8

    const/16 v5, 0x4e22

    invoke-virtual/range {v0 .. v5}, Lo/abt;->a(IJII)V

    .line 599
    const-string v0, "Step_LSC"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mPreDaemonSteps :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/alt;->E:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 600
    iget-object v0, p0, Lo/alt;->e:Lo/abt;

    invoke-virtual {v0}, Lo/abt;->d()I

    move-result v0

    if-lez v0, :cond_2

    .line 601
    iget-object v0, p0, Lo/alt;->e:Lo/abt;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/abt;->d(I)V

    .line 611
    :cond_2
    iget-object v0, p0, Lo/alt;->H:Landroid/os/Handler;

    if-eqz v0, :cond_3

    .line 612
    iget-object v0, p0, Lo/alt;->H:Landroid/os/Handler;

    const/16 v1, 0x3ee

    const-wide/16 v2, 0x12c

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 614
    :cond_3
    return-void
.end method

.method private g(Landroid/os/Message;)V
    .locals 2

    .line 638
    iget v0, p1, Landroid/os/Message;->arg1:I

    const/16 v1, 0x64

    if-ne v0, v1, :cond_0

    .line 639
    invoke-direct {p0}, Lo/alt;->B()V

    goto :goto_0

    .line 640
    :cond_0
    iget v0, p1, Landroid/os/Message;->arg1:I

    const/16 v1, 0x65

    if-ne v0, v1, :cond_1

    .line 641
    invoke-direct {p0}, Lo/alt;->j()V

    .line 643
    :cond_1
    :goto_0
    return-void
.end method

.method private h(Landroid/os/Message;)V
    .locals 5

    .line 649
    iget-object v0, p0, Lo/alt;->e:Lo/abt;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/alt;->e:Lo/abt;

    invoke-virtual {v0}, Lo/abt;->b()I

    move-result v0

    invoke-virtual {p0}, Lo/alt;->p()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 651
    const-string v0, "Step_LSC"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkLocalTotalequslsDetais "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/alt;->e:Lo/abt;

    invoke-virtual {v2}, Lo/abt;->b()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    .line 652
    invoke-virtual {p0}, Lo/alt;->p()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    .line 651
    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 653
    invoke-virtual {p0}, Lo/alt;->a()V

    goto :goto_0

    .line 655
    :cond_0
    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lo/alt;->c(ZZ)V

    .line 657
    :goto_0
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    if-eqz v0, :cond_1

    .line 658
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lo/alt$a;

    .line 659
    iget-object v0, v4, Lo/alt$a;->b:Lo/ala;

    iget-boolean v1, v4, Lo/alt$a;->a:Z

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {p0, v0, v2, v3, v1}, Lo/alt;->b(Lo/ala;ZZZ)V

    .line 660
    goto :goto_1

    .line 661
    :cond_1
    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {p0, v0, v1, v2, v3}, Lo/alt;->b(Lo/ala;ZZZ)V

    .line 663
    :goto_1
    return-void
.end method

.method private i(Landroid/os/Message;)V
    .locals 15

    .line 1000
    move-object/from16 v0, p1

    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Ljava/util/List;

    .line 1001
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1002
    :cond_0
    return-void

    .line 1004
    :cond_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    .line 1005
    const/4 v0, 0x0

    invoke-interface {v4, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/hihealth/HiHealthData;

    .line 1006
    invoke-virtual {v7}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v0

    invoke-static {v0, v1, v5, v6}, Lo/amz;->c(JJ)Z

    move-result v0

    if-nez v0, :cond_2

    .line 1007
    const-string v0, "Step_LSC"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "data not same day,return"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1008
    return-void

    .line 1010
    :cond_2
    const-string v0, "walk_step"

    invoke-virtual {v7, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v8

    .line 1011
    const-string v0, "run_step"

    invoke-virtual {v7, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v9

    .line 1012
    const-string v0, "climb_step"

    invoke-virtual {v7, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v10

    .line 1013
    const-string v0, "step_sum"

    invoke-virtual {v7, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v11

    .line 1014
    const-string v0, "calorie_sum"

    invoke-virtual {v7, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v12

    .line 1015
    const-string v0, "altitude_sum"

    invoke-virtual {v7, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v13

    .line 1016
    const-string v0, "distance_sum"

    invoke-virtual {v7, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v14

    .line 1017
    const-string v0, "Step_LSC"

    const/16 v1, 0xe

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ReadStaticDealCallback onResult: "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, " "

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    const-string v2, " "

    const/4 v3, 0x6

    aput-object v2, v1, v3

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x7

    aput-object v2, v1, v3

    const-string v2, " "

    const/16 v3, 0x8

    aput-object v2, v1, v3

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/16 v3, 0x9

    aput-object v2, v1, v3

    const-string v2, " "

    const/16 v3, 0xa

    aput-object v2, v1, v3

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/16 v3, 0xb

    aput-object v2, v1, v3

    const-string v2, " "

    const/16 v3, 0xc

    aput-object v2, v1, v3

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/16 v3, 0xd

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1019
    iget-object v0, p0, Lo/alt;->e:Lo/abt;

    if-eqz v0, :cond_3

    .line 1020
    const-string v0, "Step_LSC"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "SyncWithHiHealth "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1021
    invoke-direct {p0, v11, v9}, Lo/alt;->e(II)Z

    .line 1022
    iget-object v0, p0, Lo/alt;->i:Lo/alq;

    invoke-virtual {v0, v5, v6, v11, v14}, Lo/alq;->a(JII)V

    .line 1023
    iget-object v0, p0, Lo/alt;->h:Lo/alp;

    invoke-virtual {v0, v5, v6, v11, v12}, Lo/alp;->c(JII)V

    .line 1024
    invoke-direct {p0, v13}, Lo/alt;->a(I)V

    .line 1025
    invoke-direct {p0}, Lo/alt;->D()V

    .line 1027
    :cond_3
    return-void
.end method

.method private j()V
    .locals 4

    .line 1226
    iget-object v0, p0, Lo/alt;->b:Lo/abv;

    if-eqz v0, :cond_0

    .line 1227
    iget-object v0, p0, Lo/alt;->b:Lo/abv;

    invoke-virtual {v0}, Lo/abv;->b()V

    .line 1228
    const-string v0, "Step_LSC"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "stopStepCounterInter stand"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1231
    :cond_0
    iget-object v0, p0, Lo/alt;->f:Lo/abm;

    if-eqz v0, :cond_1

    .line 1232
    iget-object v0, p0, Lo/alt;->f:Lo/abm;

    invoke-virtual {v0}, Lo/abm;->d()V

    .line 1233
    const-string v0, "Step_LSC"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "stopStepCounterInter extend"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1236
    :cond_1
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/alt;->g:Z

    .line 1237
    return-void
.end method

.method private k(Landroid/os/Message;)V
    .locals 11

    .line 617
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v7, v0

    check-cast v7, Lo/alt$c;

    .line 618
    if-eqz v7, :cond_0

    iget-object v0, p0, Lo/alt;->k:Lo/abo;

    if-eqz v0, :cond_0

    .line 619
    new-instance v8, Ljava/util/Date;

    invoke-static {v7}, Lo/alt$c;->b(Lo/alt$c;)J

    move-result-wide v0

    invoke-direct {v8, v0, v1}, Ljava/util/Date;-><init>(J)V

    .line 620
    new-instance v9, Ljava/text/SimpleDateFormat;

    const-string v0, "yyyy\u5e74MM\u6708dd\u65e5 HH\u65f6mm\u5206ss\u79d2 E "

    invoke-direct {v9, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 621
    invoke-virtual {v9, v8}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v10

    .line 622
    const-string v0, "Step_LSC"

    const/16 v1, 0x8

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onExtend(after filter):"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v10, v1, v2

    const-string v2, " "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v7}, Lo/alt$c;->d(Lo/alt$c;)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, " "

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-static {v7}, Lo/alt$c;->a(Lo/alt$c;)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    const-string v2, " "

    const/4 v3, 0x6

    aput-object v2, v1, v3

    invoke-static {v7}, Lo/alt$c;->c(Lo/alt$c;)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x7

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 623
    iget-object v0, p0, Lo/alt;->k:Lo/abo;

    iget-object v1, p0, Lo/alt;->v:Lo/ana;

    invoke-virtual {v1}, Lo/ana;->d()I

    move-result v1

    invoke-static {v7}, Lo/alt$c;->b(Lo/alt$c;)J

    move-result-wide v2

    invoke-static {v7}, Lo/alt$c;->d(Lo/alt$c;)I

    move-result v4

    invoke-static {v7}, Lo/alt$c;->a(Lo/alt$c;)I

    move-result v5

    invoke-static {v7}, Lo/alt$c;->c(Lo/alt$c;)I

    move-result v6

    invoke-virtual/range {v0 .. v6}, Lo/abo;->a(IJIII)V

    .line 625
    :cond_0
    iget-object v0, p0, Lo/alt;->H:Landroid/os/Handler;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lo/alt;->H:Landroid/os/Handler;

    const/16 v1, 0x3ee

    invoke-virtual {v0, v1}, Landroid/os/Handler;->hasMessages(I)Z

    move-result v0

    if-nez v0, :cond_1

    .line 626
    iget-object v0, p0, Lo/alt;->H:Landroid/os/Handler;

    const/16 v1, 0x3ee

    const-wide/16 v2, 0x12c

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 628
    :cond_1
    return-void
.end method

.method private o(Landroid/os/Message;)V
    .locals 6

    .line 1048
    iget-object v0, p0, Lo/alt;->H:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 1049
    iget-object v0, p0, Lo/alt;->H:Landroid/os/Handler;

    const/16 v1, 0x3ee

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 1052
    :cond_0
    const/4 v4, 0x0

    .line 1053
    const/4 v5, 0x0

    .line 1054
    iget v0, p1, Landroid/os/Message;->arg1:I

    const/16 v1, 0xc8

    if-ne v0, v1, :cond_1

    .line 1055
    const/4 v4, 0x1

    .line 1058
    :cond_1
    iget v0, p1, Landroid/os/Message;->arg2:I

    const/16 v1, 0xc9

    if-ne v0, v1, :cond_2

    .line 1059
    const/4 v5, 0x1

    .line 1063
    :cond_2
    iget-object v0, p0, Lo/alt;->e:Lo/abt;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lo/alt;->e:Lo/abt;

    invoke-virtual {v0}, Lo/abt;->b()I

    move-result v0

    if-gez v0, :cond_4

    .line 1065
    :cond_3
    const-string v0, "Step_LSC"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MSG_REPORT_STEP_DATA dropreport "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1066
    const/4 v0, 0x0

    iput v0, p0, Lo/alt;->r:I

    .line 1067
    const/4 v0, 0x0

    iput v0, p0, Lo/alt;->s:I

    .line 1068
    const/4 v0, 0x0

    iput v0, p0, Lo/alt;->u:I

    .line 1069
    const/4 v0, 0x0

    iput v0, p0, Lo/alt;->t:I

    goto :goto_0

    .line 1071
    :cond_4
    invoke-direct {p0, v4, v5}, Lo/alt;->c(ZZ)V

    .line 1073
    :goto_0
    return-void
.end method

.method private q()V
    .locals 5

    .line 221
    new-instance v4, Landroid/content/IntentFilter;

    invoke-direct {v4}, Landroid/content/IntentFilter;-><init>()V

    .line 222
    const-string v0, "android.intent.action.SCREEN_ON"

    invoke-virtual {v4, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 223
    const-string v0, "android.intent.action.TIME_TICK"

    invoke-virtual {v4, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 224
    const-string v0, "android.intent.action.TIME_SET"

    invoke-virtual {v4, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 226
    const-string v0, "com.huawei.health.WIDGET_ENABLE"

    invoke-virtual {v4, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 227
    const-string v0, "com.huawei.health.WIDGET_DISABLE"

    invoke-virtual {v4, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 228
    const-string v0, "com.huawei.health.WIDGET_FORCE_UPDATE"

    invoke-virtual {v4, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 229
    const-string v0, "com.huawei.health.SERVER_TOKEN_INVALIDE"

    invoke-virtual {v4, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 230
    const-string v0, "com.huawei.hihealth.action_data_refresh"

    invoke-virtual {v4, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 232
    new-instance v0, Lcom/huawei/health/manager/receiver/DaemonDynamicBroadcastReceiver;

    invoke-direct {v0, p0}, Lcom/huawei/health/manager/receiver/DaemonDynamicBroadcastReceiver;-><init>(Lo/alt;)V

    iput-object v0, p0, Lo/alt;->D:Lcom/huawei/health/manager/receiver/DaemonDynamicBroadcastReceiver;

    .line 234
    const-string v0, "Step_LSC"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "registerDynamicBroadcastReceiver"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 236
    iget-object v0, p0, Lo/alt;->y:Landroid/content/Context;

    if-eqz v0, :cond_0

    .line 237
    iget-object v0, p0, Lo/alt;->y:Landroid/content/Context;

    iget-object v1, p0, Lo/alt;->D:Lcom/huawei/health/manager/receiver/DaemonDynamicBroadcastReceiver;

    const-string v2, "com.huawei.health.INTERNAL_PERMISSION"

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v4, v2, v3}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Ljava/lang/String;Landroid/os/Handler;)Landroid/content/Intent;

    .line 239
    :cond_0
    return-void
.end method

.method private r()V
    .locals 4

    .line 538
    const-string v0, "Step_LSC"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " processSportIndensity "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 539
    iget-object v0, p0, Lo/alt;->y:Landroid/content/Context;

    invoke-static {v0}, Lo/akx;->b(Landroid/content/Context;)Lo/akx;

    move-result-object v0

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Lo/akx;->e(I)Z

    .line 540
    return-void
.end method

.method private s()V
    .locals 6

    .line 355
    iget-object v0, p0, Lo/alt;->y:Landroid/content/Context;

    if-eqz v0, :cond_1

    .line 356
    iget-object v0, p0, Lo/alt;->y:Landroid/content/Context;

    invoke-static {v0}, Lo/amy;->m(Landroid/content/Context;)[Ljava/lang/String;

    move-result-object v4

    .line 358
    if-eqz v4, :cond_0

    :try_start_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    const/4 v2, 0x0

    aget-object v2, v4, v2

    invoke-static {v2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Lo/amz;->c(JJ)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 359
    const/4 v0, 0x1

    aget-object v0, v4, v0

    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v0

    iput-wide v0, p0, Lo/alt;->z:D

    .line 360
    const-string v0, "Step_LSC"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initDiffAltitude from File mAltitudeDiff="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-wide v2, p0, Lo/alt;->z:D

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 364
    :cond_0
    goto :goto_0

    .line 362
    :catch_0
    move-exception v5

    .line 363
    const-string v0, "Step_LSC"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initDiffAltitudefromFile "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v5}, Ljava/lang/NumberFormatException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 366
    :cond_1
    :goto_0
    return-void
.end method

.method private t()Z
    .locals 6

    .line 384
    new-instance v0, Lo/abk;

    iget-object v1, p0, Lo/alt;->y:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/abk;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/alt;->d:Lo/abk;

    .line 385
    iget-object v0, p0, Lo/alt;->y:Landroid/content/Context;

    invoke-static {v0}, Lo/aly;->a(Landroid/content/Context;)Z

    move-result v4

    .line 386
    const/4 v5, 0x0

    .line 387
    const-string v0, "Step_LSC"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initStepCounter isSupportMockStepCounter = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 388
    if-eqz v4, :cond_0

    .line 389
    new-instance v5, Lo/aly;

    iget-object v0, p0, Lo/alt;->y:Landroid/content/Context;

    invoke-direct {v5, v0}, Lo/aly;-><init>(Landroid/content/Context;)V

    .line 390
    invoke-virtual {v5}, Lo/aly;->a()Z

    .line 391
    iget-object v0, p0, Lo/alt;->d:Lo/abk;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/abk;->e(Z)Lo/abv;

    move-result-object v0

    iput-object v0, p0, Lo/alt;->b:Lo/abv;

    .line 392
    iget-object v0, p0, Lo/alt;->d:Lo/abk;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/abk;->d(Z)Lo/abm;

    move-result-object v0

    iput-object v0, p0, Lo/alt;->f:Lo/abm;

    .line 394
    iget-object v0, p0, Lo/alt;->b:Lo/abv;

    iget-object v1, p0, Lo/alt;->f:Lo/abm;

    invoke-virtual {v5, v0, v1}, Lo/aly;->b(Lo/abv;Lo/abm;)V

    goto :goto_0

    .line 396
    :cond_0
    iget-object v0, p0, Lo/alt;->d:Lo/abk;

    invoke-virtual {v0}, Lo/abk;->b()Lo/abv;

    move-result-object v0

    iput-object v0, p0, Lo/alt;->b:Lo/abv;

    .line 397
    iget-object v0, p0, Lo/alt;->d:Lo/abk;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/abk;->d(Z)Lo/abm;

    move-result-object v0

    iput-object v0, p0, Lo/alt;->f:Lo/abm;

    .line 400
    :goto_0
    iget-object v0, p0, Lo/alt;->y:Landroid/content/Context;

    invoke-static {v0}, Lo/akz;->b(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 401
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/alt;->I:Z

    .line 402
    new-instance v0, Lo/abo;

    iget-object v1, p0, Lo/alt;->y:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/abo;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/alt;->k:Lo/abo;

    .line 404
    new-instance v0, Lo/amo;

    invoke-direct {v0}, Lo/amo;-><init>()V

    iput-object v0, p0, Lo/alt;->N:Lo/amo;

    .line 406
    iget-object v0, p0, Lo/alt;->f:Lo/abm;

    iget-object v1, p0, Lo/alt;->K:Lo/ala;

    invoke-virtual {v0, v1}, Lo/abm;->a(Lo/ala;)V

    goto :goto_1

    .line 407
    :cond_1
    if-eqz v5, :cond_2

    .line 408
    invoke-virtual {v5}, Lo/aly;->c()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 409
    iget-object v0, p0, Lo/alt;->K:Lo/ala;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lo/ala;->b(Landroid/os/Bundle;)V

    goto :goto_1

    .line 411
    :cond_2
    iget-object v0, p0, Lo/alt;->y:Landroid/content/Context;

    invoke-static {v0}, Lo/akz;->e(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 412
    iget-object v0, p0, Lo/alt;->K:Lo/ala;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lo/ala;->b(Landroid/os/Bundle;)V

    .line 415
    :cond_3
    :goto_1
    new-instance v0, Lo/abt;

    iget-object v1, p0, Lo/alt;->y:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/abt;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/alt;->e:Lo/abt;

    .line 416
    iget-object v0, p0, Lo/alt;->e:Lo/abt;

    iget v1, p0, Lo/alt;->E:I

    invoke-virtual {v0, v1}, Lo/abt;->d(I)V

    .line 419
    iget-object v0, p0, Lo/alt;->b:Lo/abv;

    if-nez v0, :cond_4

    .line 420
    const/4 v0, 0x0

    return v0

    .line 423
    :cond_4
    const/4 v0, 0x1

    return v0
.end method

.method private u()V
    .locals 2

    .line 243
    iget-object v0, p0, Lo/alt;->D:Lcom/huawei/health/manager/receiver/DaemonDynamicBroadcastReceiver;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/alt;->y:Landroid/content/Context;

    if-eqz v0, :cond_0

    .line 244
    iget-object v0, p0, Lo/alt;->y:Landroid/content/Context;

    iget-object v1, p0, Lo/alt;->D:Lcom/huawei/health/manager/receiver/DaemonDynamicBroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 245
    const/4 v0, 0x0

    iput-object v0, p0, Lo/alt;->D:Lcom/huawei/health/manager/receiver/DaemonDynamicBroadcastReceiver;

    .line 247
    :cond_0
    return-void
.end method

.method private v()V
    .locals 5

    .line 730
    iget-object v0, p0, Lo/alt;->f:Lo/abm;

    instance-of v0, v0, Lo/abp;

    if-eqz v0, :cond_0

    .line 731
    iget-object v0, p0, Lo/alt;->f:Lo/abm;

    check-cast v0, Lo/abp;

    invoke-virtual {v0}, Lo/abp;->b()Z

    move-result v0

    if-nez v0, :cond_0

    .line 732
    iget-object v0, p0, Lo/alt;->H:Landroid/os/Handler;

    const/16 v1, 0x3f5

    const-wide/16 v2, 0x1f4

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 733
    return-void

    .line 737
    :cond_0
    invoke-static {}, Lo/amm;->c()Lcom/huawei/hihealth/HiAggregateOption;

    move-result-object v4

    .line 738
    iget-object v0, p0, Lo/alt;->y:Landroid/content/Context;

    invoke-static {v0}, Lo/clq;->e(Landroid/content/Context;)Lo/clq;

    move-result-object v0

    new-instance v1, Lo/alt$b;

    invoke-direct {v1, p0}, Lo/alt$b;-><init>(Lo/alt;)V

    invoke-virtual {v0, v4, v1}, Lo/clq;->b(Lcom/huawei/hihealth/HiAggregateOption;Lo/cly;)V

    .line 740
    iget-object v0, p0, Lo/alt;->q:Lo/amp;

    invoke-virtual {v0}, Lo/amp;->d()V

    .line 741
    return-void
.end method

.method private w()V
    .locals 1

    .line 632
    iget-object v0, p0, Lo/alt;->k:Lo/abo;

    if-eqz v0, :cond_0

    .line 633
    iget-object v0, p0, Lo/alt;->k:Lo/abo;

    invoke-virtual {v0}, Lo/abo;->a()V

    .line 635
    :cond_0
    return-void
.end method

.method private x()V
    .locals 5

    .line 956
    iget-object v0, p0, Lo/alt;->b:Lo/abv;

    if-eqz v0, :cond_0

    .line 957
    iget-object v0, p0, Lo/alt;->b:Lo/abv;

    invoke-virtual {v0}, Lo/abv;->d()V

    .line 960
    :cond_0
    const-string v0, "Step_LSC"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "processScreenOn :"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-wide v2, p0, Lo/alt;->T:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 961
    iget-wide v0, p0, Lo/alt;->T:J

    const-wide/16 v2, -0x1

    cmp-long v0, v0, v2

    if-eqz v0, :cond_2

    iget-wide v0, p0, Lo/alt;->T:J

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-gtz v0, :cond_2

    iget-object v0, p0, Lo/alt;->H:Landroid/os/Handler;

    if-eqz v0, :cond_2

    .line 962
    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lo/alt;->T:J

    .line 963
    iget-object v0, p0, Lo/alt;->H:Landroid/os/Handler;

    const/16 v1, 0x3f4

    invoke-virtual {v0, v1}, Landroid/os/Handler;->hasMessages(I)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 964
    iget-object v0, p0, Lo/alt;->H:Landroid/os/Handler;

    const/16 v1, 0x3f4

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 966
    :cond_1
    iget-object v0, p0, Lo/alt;->H:Landroid/os/Handler;

    const/16 v1, 0x3f4

    const-wide/16 v2, 0x3e8

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 969
    :cond_2
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/alt;->d(Z)Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lo/alt;->H:Landroid/os/Handler;

    if-eqz v0, :cond_3

    .line 970
    iget-object v0, p0, Lo/alt;->H:Landroid/os/Handler;

    const/16 v1, 0x3ee

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v4

    .line 971
    const/16 v0, 0xc8

    iput v0, v4, Landroid/os/Message;->arg1:I

    .line 972
    const/16 v0, 0xc9

    iput v0, v4, Landroid/os/Message;->arg2:I

    .line 973
    iget-object v0, p0, Lo/alt;->H:Landroid/os/Handler;

    invoke-virtual {v0, v4}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 975
    :cond_3
    return-void
.end method

.method private y()V
    .locals 4

    .line 978
    iget-object v0, p0, Lo/alt;->U:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 979
    iget-object v0, p0, Lo/alt;->H:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 980
    iget-object v0, p0, Lo/alt;->H:Landroid/os/Handler;

    const/16 v1, 0x3eb

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 981
    iget-object v0, p0, Lo/alt;->H:Landroid/os/Handler;

    const/16 v1, 0x3f4

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 984
    :cond_0
    iget-object v0, p0, Lo/alt;->e:Lo/abt;

    if-eqz v0, :cond_1

    .line 985
    iget-object v0, p0, Lo/alt;->e:Lo/abt;

    iget v1, p0, Lo/alt;->l:I

    iget v2, p0, Lo/alt;->n:I

    iget v3, p0, Lo/alt;->p:I

    invoke-virtual {v0, v1, v2, v3}, Lo/abt;->c(III)V

    .line 997
    :cond_1
    return-void
.end method

.method private z()V
    .locals 4

    .line 942
    iget-wide v0, p0, Lo/alt;->M:J

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Lo/amz;->c(JJ)Z

    move-result v0

    if-nez v0, :cond_1

    .line 943
    const/4 v0, 0x0

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {p0, v0, v1, v2, v3}, Lo/alt;->b(Lo/ala;ZZZ)V

    .line 945
    iget-object v0, p0, Lo/alt;->k:Lo/abo;

    if-eqz v0, :cond_0

    .line 946
    iget-object v0, p0, Lo/alt;->k:Lo/abo;

    invoke-virtual {v0}, Lo/abo;->d()V

    .line 949
    :cond_0
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lo/alt;->d(Z)Z

    .line 951
    invoke-virtual {p0}, Lo/alt;->a()V

    .line 953
    :cond_1
    return-void
.end method


# virtual methods
.method public a()V
    .locals 4

    .line 677
    iget-object v0, p0, Lo/alt;->H:Landroid/os/Handler;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/alt;->y:Landroid/content/Context;

    invoke-static {v0}, Lo/amx;->c(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 678
    const-string v0, "Step_LSC"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ScreenON ,MSG_SYNC_WITH_DB"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 679
    invoke-direct {p0}, Lo/alt;->D()V

    .line 680
    iget-object v0, p0, Lo/alt;->H:Landroid/os/Handler;

    const/16 v1, 0x3f5

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 681
    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lo/alt;->T:J

    .line 682
    iget-object v0, p0, Lo/alt;->y:Landroid/content/Context;

    iget-wide v1, p0, Lo/alt;->T:J

    invoke-static {v0, v1, v2}, Lo/amy;->a(Landroid/content/Context;J)V

    goto :goto_0

    .line 684
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lo/alt;->T:J

    .line 685
    iget-object v0, p0, Lo/alt;->y:Landroid/content/Context;

    iget-wide v1, p0, Lo/alt;->T:J

    invoke-static {v0, v1, v2}, Lo/amy;->a(Landroid/content/Context;J)V

    .line 686
    const-string v0, "Step_LSC"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ScreenOFF ,drop this time MSG_SYNC_WITH_DB"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 688
    :goto_0
    return-void
.end method

.method public a(JI)V
    .locals 3

    .line 1574
    iget-object v0, p0, Lo/alt;->H:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 1575
    iget-object v0, p0, Lo/alt;->H:Landroid/os/Handler;

    const/16 v1, 0x3e8

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v2

    .line 1576
    iput p3, v2, Landroid/os/Message;->arg1:I

    .line 1577
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, v2, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 1578
    iget-object v0, p0, Lo/alt;->H:Landroid/os/Handler;

    invoke-virtual {v0, v2}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 1581
    :cond_0
    return-void
.end method

.method public a(JIII)V
    .locals 9

    .line 1631
    iget-object v0, p0, Lo/alt;->U:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1632
    const-string v0, "Step_LSC"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onExtendStepChanged phone shutdown, return"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1633
    return-void

    .line 1635
    :cond_0
    iput-wide p1, p0, Lo/alt;->Q:J

    .line 1636
    iget-wide v0, p0, Lo/alt;->P:J

    iget-wide v2, p0, Lo/alt;->Q:J

    cmp-long v0, v0, v2

    if-eqz v0, :cond_1

    .line 1637
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/alt;->W:Z

    .line 1639
    iget-wide v0, p0, Lo/alt;->P:J

    iput-wide v0, p0, Lo/alt;->R:J

    .line 1640
    iput-wide p1, p0, Lo/alt;->P:J

    .line 1641
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lo/alt;->S:J

    goto :goto_0

    .line 1644
    :cond_1
    iget-boolean v0, p0, Lo/alt;->O:Z

    if-eqz v0, :cond_2

    .line 1645
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/alt;->W:Z

    goto :goto_0

    .line 1648
    :cond_2
    iget-boolean v0, p0, Lo/alt;->W:Z

    if-nez v0, :cond_3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Lo/alt;->S:J

    sub-long/2addr v0, v2

    const-wide/32 v2, 0xea60

    cmp-long v0, v0, v2

    if-ltz v0, :cond_3

    .line 1649
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/alt;->W:Z

    .line 1653
    :cond_3
    :goto_0
    iget-boolean v0, p0, Lo/alt;->W:Z

    if-eqz v0, :cond_4

    .line 1654
    const-string v0, "Step_LSC"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mCalibrateTime true,timeStamp before:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1655
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/amz;->e(J)J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    mul-long/2addr v0, v2

    const-wide/16 v2, 0x7

    add-long p1, v0, v2

    .line 1656
    const-string v0, "Step_LSC"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mCalibrateTime after,timeStamp before:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1658
    :cond_4
    const-string v0, "Step_LSC"

    const/16 v1, 0x8

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onExtend:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, " "

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    const-string v2, " "

    const/4 v3, 0x6

    aput-object v2, v1, v3

    invoke-static {p5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x7

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1660
    iget-wide v0, p0, Lo/alt;->F:J

    cmp-long v0, p1, v0

    if-gez v0, :cond_5

    .line 1661
    const-string v0, "Step_LSC"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "timeStamp back,extendReportTimeStamp="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-wide v2, p0, Lo/alt;->F:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1662
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/alt;->O:Z

    goto :goto_1

    .line 1665
    :cond_5
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/alt;->O:Z

    .line 1667
    :goto_1
    iput-wide p1, p0, Lo/alt;->F:J

    .line 1669
    iget-object v0, p0, Lo/alt;->N:Lo/amo;

    if-eqz v0, :cond_6

    .line 1670
    iget-object v0, p0, Lo/alt;->N:Lo/amo;

    invoke-virtual {v0}, Lo/amo;->c()V

    .line 1673
    :cond_6
    if-lez p4, :cond_7

    .line 1674
    const/4 p5, 0x6

    .line 1678
    :cond_7
    invoke-direct/range {p0 .. p5}, Lo/alt;->c(JIII)V

    .line 1683
    new-instance v0, Lo/alt$c;

    move-wide v1, p1

    move v3, p3

    mul-int/lit8 v4, p4, 0x1e

    move v5, p5

    const/4 v6, 0x0

    invoke-direct/range {v0 .. v6}, Lo/alt$c;-><init>(JIIILo/alt$4;)V

    move-object v7, v0

    .line 1684
    iget-object v0, p0, Lo/alt;->H:Landroid/os/Handler;

    if-eqz v0, :cond_8

    .line 1685
    iget-object v0, p0, Lo/alt;->H:Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v8

    .line 1686
    const/16 v0, 0x3ec

    iput v0, v8, Landroid/os/Message;->what:I

    .line 1687
    iput-object v7, v8, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 1688
    iget-object v0, p0, Lo/alt;->H:Landroid/os/Handler;

    invoke-virtual {v0, v8}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 1692
    :cond_8
    iget-object v0, p0, Lo/alt;->L:Lo/and;

    invoke-virtual {v0, p3}, Lo/and;->b(I)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 1693
    const-string v0, "Step_LSC"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "flushTempCacheToDB by ext"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1694
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/alt;->b(Lo/ala;)V

    .line 1697
    :cond_9
    iget-wide v0, p0, Lo/alt;->T:J

    const-wide/16 v2, -0x1

    cmp-long v0, v0, v2

    if-eqz v0, :cond_a

    iget-wide v0, p0, Lo/alt;->T:J

    cmp-long v0, v0, p1

    if-gtz v0, :cond_a

    iget-object v0, p0, Lo/alt;->H:Landroid/os/Handler;

    if-eqz v0, :cond_a

    .line 1698
    const-string v0, "Step_LSC"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "send  MSG_FLUSH_AND_SYNC_WITH_DB message"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-wide v2, p0, Lo/alt;->T:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1699
    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lo/alt;->T:J

    .line 1700
    iget-object v0, p0, Lo/alt;->H:Landroid/os/Handler;

    const/16 v1, 0x3f4

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v8

    .line 1701
    iget-object v0, p0, Lo/alt;->H:Landroid/os/Handler;

    invoke-virtual {v0, v8}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 1704
    :cond_a
    return-void
.end method

.method public a(Lo/ala;Z)V
    .locals 6

    .line 1262
    const-string v0, "Step_LSC"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "flushTempCacheToDB enter... callback:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    const-string v2, " flushByUI:"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1264
    iget-object v0, p0, Lo/alt;->H:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 1265
    iget-object v0, p0, Lo/alt;->H:Landroid/os/Handler;

    const/16 v1, 0x3e9

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v4

    .line 1266
    new-instance v5, Lo/alt$a;

    invoke-direct {v5}, Lo/alt$a;-><init>()V

    .line 1267
    iput-object p1, v5, Lo/alt$a;->b:Lo/ala;

    .line 1268
    iput-boolean p2, v5, Lo/alt$a;->a:Z

    .line 1269
    iput-object v5, v4, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 1270
    iget-object v0, p0, Lo/alt;->H:Landroid/os/Handler;

    invoke-virtual {v0, v4}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 1272
    :cond_0
    return-void
.end method

.method public b()Landroid/os/Bundle;
    .locals 4

    .line 1281
    iget-object v0, p0, Lo/alt;->a:Lo/anr;

    if-eqz v0, :cond_0

    .line 1282
    const-string v0, "Step_LSC"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getTodaySportData mStepsRecordManager="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/alt;->a:Lo/anr;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1283
    iget-object v0, p0, Lo/alt;->a:Lo/anr;

    invoke-virtual {v0}, Lo/anr;->d()Lo/ald;

    move-result-object v0

    invoke-virtual {v0}, Lo/ald;->c()Landroid/os/Bundle;

    move-result-object v0

    return-object v0

    .line 1286
    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public b(JIII)V
    .locals 4

    .line 1530
    const-string v0, "Step_LSC"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setBaseData mWorkerHandler "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/alt;->H:Landroid/os/Handler;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " steps "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1532
    return-void
.end method

.method public b(Lo/aky;)V
    .locals 3

    .line 1863
    iget-object v0, p0, Lo/alt;->Y:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    .line 1864
    iget-object v1, p0, Lo/alt;->Y:Ljava/util/ArrayList;

    monitor-enter v1

    .line 1865
    :try_start_0
    iget-object v0, p0, Lo/alt;->Y:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1866
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2

    .line 1868
    :cond_0
    :goto_0
    return-void
.end method

.method public b(Lo/ala;)V
    .locals 1

    .line 1257
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lo/alt;->a(Lo/ala;Z)V

    .line 1258
    return-void
.end method

.method public b(Lo/alb;)V
    .locals 2

    .line 1519
    invoke-virtual {p0, p1}, Lo/alt;->d(Lo/alb;)V

    .line 1521
    iget-object v0, p0, Lo/alt;->H:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 1522
    iget-object v0, p0, Lo/alt;->H:Landroid/os/Handler;

    const/16 v1, 0x3ee

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 1525
    :cond_0
    return-void
.end method

.method public c()Lo/aku;
    .locals 1

    .line 566
    iget-object v0, p0, Lo/alt;->b:Lo/abv;

    return-object v0
.end method

.method public c(Landroid/content/Intent;)V
    .locals 3

    .line 253
    iget-object v0, p0, Lo/alt;->H:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 254
    iget-object v0, p0, Lo/alt;->H:Landroid/os/Handler;

    const/16 v1, 0x3ef

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v2

    .line 255
    invoke-virtual {p1}, Landroid/content/Intent;->clone()Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v2, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 256
    iget-object v0, p0, Lo/alt;->H:Landroid/os/Handler;

    invoke-virtual {v0, v2}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 258
    :cond_0
    return-void
.end method

.method public c(Landroid/os/Bundle;)V
    .locals 4

    .line 1409
    const-string v0, "Step_LSC"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setUserInfo userSet ignore!!! from db refresh"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1418
    return-void
.end method

.method public c(Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;)V"
        }
    .end annotation

    .line 670
    iget-object v0, p0, Lo/alt;->B:Lo/amw;

    if-eqz v0, :cond_0

    .line 671
    iget-object v0, p0, Lo/alt;->B:Lo/amw;

    invoke-virtual {v0, p1}, Lo/amw;->b(Ljava/util/Map;)V

    .line 673
    :cond_0
    return-void
.end method

.method public d()Landroid/os/Bundle;
    .locals 6

    .line 1297
    iget-object v0, p0, Lo/alt;->a:Lo/anr;

    if-eqz v0, :cond_2

    .line 1299
    iget-object v0, p0, Lo/alt;->a:Lo/anr;

    invoke-virtual {v0}, Lo/anr;->d()Lo/ald;

    move-result-object v2

    .line 1301
    if-eqz v2, :cond_2

    .line 1302
    invoke-virtual {v2}, Lo/ald;->c()Landroid/os/Bundle;

    move-result-object v3

    .line 1303
    const-string v0, "cacheTotalSteps"

    invoke-virtual {p0}, Lo/alt;->p()I

    move-result v1

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 1305
    iget-object v0, p0, Lo/alt;->y:Landroid/content/Context;

    invoke-static {v0}, Lo/amy;->o(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    .line 1306
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1307
    const-string v0, "serviceRestartRecord"

    invoke-virtual {v3, v0, v4}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 1310
    :cond_0
    iget-object v0, p0, Lo/alt;->e:Lo/abt;

    invoke-virtual {v0}, Lo/abt;->h()Ljava/util/Map;

    move-result-object v5

    .line 1311
    if-eqz v5, :cond_1

    .line 1312
    const-string v0, "standardBase"

    const-string v1, "standardBase"

    invoke-interface {v5, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 1313
    const-string v0, "restartSteps"

    const-string v1, "restartSteps"

    invoke-interface {v5, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 1314
    const-string v0, "otherSteps"

    const-string v1, "otherSteps"

    invoke-interface {v5, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 1315
    const-string v0, "UIShowSteps"

    const-string v1, "UIShowSteps"

    invoke-interface {v5, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 1318
    :cond_1
    return-object v3

    .line 1321
    :cond_2
    const/4 v0, 0x0

    return-object v0
.end method

.method public d(I)V
    .locals 0

    .line 268
    iput p1, p0, Lo/alt;->E:I

    .line 269
    return-void
.end method

.method public d(Lo/ala;)V
    .locals 5

    .line 274
    :try_start_0
    iget-object v0, p0, Lo/alt;->c:Landroid/os/HandlerThread;
    :try_end_0
    .catch Ljava/lang/IllegalThreadStateException; {:try_start_0 .. :try_end_0} :catch_0

    if-nez v0, :cond_0

    .line 275
    return-void

    .line 277
    :cond_0
    :try_start_1
    iget-object v0, p0, Lo/alt;->c:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->start()V
    :try_end_1
    .catch Ljava/lang/IllegalThreadStateException; {:try_start_1 .. :try_end_1} :catch_0

    .line 281
    goto :goto_0

    .line 278
    :catch_0
    move-exception v4

    .line 279
    const-string v0, "Step_LSC"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "WorkThread.start IllegalThreadState:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Ljava/lang/IllegalThreadStateException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 280
    return-void

    .line 283
    :goto_0
    new-instance v0, Lo/alt$4;

    iget-object v1, p0, Lo/alt;->c:Landroid/os/HandlerThread;

    invoke-virtual {v1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lo/alt$4;-><init>(Lo/alt;Landroid/os/Looper;)V

    iput-object v0, p0, Lo/alt;->H:Landroid/os/Handler;

    .line 292
    iget-object v0, p0, Lo/alt;->H:Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v4

    .line 293
    const/16 v0, 0x3fa

    iput v0, v4, Landroid/os/Message;->what:I

    .line 294
    iput-object p1, v4, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 295
    iget-object v0, p0, Lo/alt;->H:Landroid/os/Handler;

    invoke-virtual {v0, v4}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 298
    return-void
.end method

.method public d(Lo/alb;)V
    .locals 1

    .line 1077
    if-eqz p1, :cond_0

    .line 1078
    iget-object v0, p0, Lo/alt;->a:Lo/anr;

    invoke-virtual {v0, p1}, Lo/anr;->d(Lo/alb;)V

    .line 1081
    :cond_0
    return-void
.end method

.method public d(Z)Z
    .locals 8

    .line 1169
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    .line 1170
    iget-object v0, p0, Lo/alt;->e:Lo/abt;

    if-eqz v0, :cond_3

    .line 1172
    iget-object v0, p0, Lo/alt;->e:Lo/abt;

    invoke-virtual {v0, v5, v6, p1}, Lo/abt;->c(JZ)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 1174
    iget-object v0, p0, Lo/alt;->L:Lo/and;

    iget-object v1, p0, Lo/alt;->e:Lo/abt;

    invoke-virtual {v1}, Lo/abt;->c()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lo/and;->e(J)V

    .line 1176
    iget-object v0, p0, Lo/alt;->b:Lo/abv;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/alt;->y:Landroid/content/Context;

    invoke-static {v0}, Lo/amy;->e(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1177
    iget-object v0, p0, Lo/alt;->b:Lo/abv;

    invoke-virtual {v0}, Lo/abv;->e()V

    .line 1180
    :cond_0
    iget-object v0, p0, Lo/alt;->k:Lo/abo;

    if-eqz v0, :cond_1

    .line 1181
    iget-object v0, p0, Lo/alt;->k:Lo/abo;

    invoke-virtual {v0}, Lo/abo;->b()V

    .line 1183
    iget-object v0, p0, Lo/alt;->k:Lo/abo;

    invoke-virtual {v0}, Lo/abo;->d()V

    .line 1186
    :cond_1
    iput-wide v5, p0, Lo/alt;->M:J

    .line 1187
    const/4 v0, 0x0

    iput v0, p0, Lo/alt;->l:I

    .line 1188
    const/4 v0, 0x0

    iput v0, p0, Lo/alt;->n:I

    .line 1189
    const/4 v0, 0x0

    iput v0, p0, Lo/alt;->p:I

    .line 1190
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/alt;->w:D

    .line 1191
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/alt;->z:D

    .line 1192
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/alt;->x:D

    .line 1193
    iget-object v0, p0, Lo/alt;->i:Lo/alq;

    invoke-virtual {v0}, Lo/alq;->c()V

    .line 1194
    iget-object v0, p0, Lo/alt;->h:Lo/alp;

    invoke-virtual {v0, v5, v6}, Lo/alp;->e(J)V

    .line 1197
    const/4 v0, 0x0

    iput v0, p0, Lo/alt;->s:I

    .line 1198
    const/4 v0, 0x0

    iput v0, p0, Lo/alt;->t:I

    .line 1199
    const/4 v0, 0x0

    iput v0, p0, Lo/alt;->u:I

    .line 1201
    iget-object v0, p0, Lo/alt;->y:Landroid/content/Context;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    const-wide/16 v3, 0x0

    invoke-static {v0, v1, v2, v3, v4}, Lo/amy;->d(Landroid/content/Context;JD)V

    .line 1202
    iget-object v0, p0, Lo/alt;->y:Landroid/content/Context;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    const-wide/16 v3, 0x0

    invoke-static {v0, v1, v2, v3, v4}, Lo/amy;->e(Landroid/content/Context;JD)V

    .line 1203
    iget-object v0, p0, Lo/alt;->y:Landroid/content/Context;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    const-wide/16 v3, 0x0

    invoke-static {v0, v1, v2, v3, v4}, Lo/amy;->b(Landroid/content/Context;JD)V

    .line 1204
    iget-object v0, p0, Lo/alt;->y:Landroid/content/Context;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/amy;->c(Landroid/content/Context;JI)V

    .line 1205
    iget-object v0, p0, Lo/alt;->H:Landroid/os/Handler;

    if-eqz v0, :cond_2

    .line 1206
    iget-object v0, p0, Lo/alt;->H:Landroid/os/Handler;

    const/16 v1, 0x3ee

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v7

    .line 1207
    const/16 v0, 0xc8

    iput v0, v7, Landroid/os/Message;->arg1:I

    .line 1208
    const/16 v0, 0xc9

    iput v0, v7, Landroid/os/Message;->arg2:I

    .line 1209
    iget-object v0, p0, Lo/alt;->H:Landroid/os/Handler;

    invoke-virtual {v0, v7}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 1211
    :cond_2
    const/4 v0, 0x1

    return v0

    .line 1214
    :cond_3
    const/4 v0, 0x0

    return v0
.end method

.method public e(Lo/aky;)V
    .locals 3

    .line 1876
    iget-object v0, p0, Lo/alt;->Y:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/alt;->Y:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1877
    iget-object v1, p0, Lo/alt;->Y:Ljava/util/ArrayList;

    monitor-enter v1

    .line 1878
    :try_start_0
    iget-object v0, p0, Lo/alt;->Y:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1879
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2

    .line 1881
    :cond_0
    :goto_0
    return-void
.end method

.method public e(Z)V
    .locals 0

    .line 1084
    iput-boolean p1, p0, Lo/alt;->I:Z

    .line 1085
    return-void
.end method

.method public e()Z
    .locals 1

    .line 264
    iget-object v0, p0, Lo/alt;->y:Landroid/content/Context;

    invoke-static {v0}, Lo/amy;->e(Landroid/content/Context;)Z

    move-result v0

    return v0
.end method

.method public f()V
    .locals 2

    .line 1490
    iget-object v0, p0, Lo/alt;->H:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 1491
    iget-object v0, p0, Lo/alt;->H:Landroid/os/Handler;

    const/16 v1, 0x3e8

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 1492
    iget-object v0, p0, Lo/alt;->H:Landroid/os/Handler;

    const/16 v1, 0x3e9

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 1493
    iget-object v0, p0, Lo/alt;->H:Landroid/os/Handler;

    const/16 v1, 0x3ee

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 1494
    iget-object v0, p0, Lo/alt;->H:Landroid/os/Handler;

    const/16 v1, 0x3eb

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 1495
    iget-object v0, p0, Lo/alt;->H:Landroid/os/Handler;

    const/16 v1, 0x3f3

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 1496
    const/4 v0, 0x0

    iput-object v0, p0, Lo/alt;->H:Landroid/os/Handler;

    .line 1499
    :cond_0
    iget-object v0, p0, Lo/alt;->c:Landroid/os/HandlerThread;

    if-eqz v0, :cond_1

    .line 1500
    iget-object v0, p0, Lo/alt;->c:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->quit()Z

    .line 1501
    const/4 v0, 0x0

    iput-object v0, p0, Lo/alt;->c:Landroid/os/HandlerThread;

    .line 1503
    :cond_1
    invoke-direct {p0}, Lo/alt;->u()V

    .line 1504
    invoke-direct {p0}, Lo/alt;->H()V

    .line 1505
    return-void
.end method

.method public g()Z
    .locals 4

    .line 1328
    iget-object v0, p0, Lo/alt;->X:Lo/anb;

    if-nez v0, :cond_0

    .line 1329
    const-string v0, "Step_LSC"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isNeedPromptKeepAlive processAliveMonitor null,return false(represents no need prompt)"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1331
    const/4 v0, 0x0

    return v0

    .line 1333
    :cond_0
    iget-object v0, p0, Lo/alt;->X:Lo/anb;

    invoke-virtual {v0}, Lo/anb;->b()Z

    move-result v0

    return v0
.end method

.method public h()V
    .locals 5

    .line 1424
    const-string v0, "Step_LSC"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setStepsTarget"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1425
    iget-object v0, p0, Lo/alt;->q:Lo/amp;

    invoke-virtual {v0}, Lo/amp;->d()V

    .line 1427
    iget-object v0, p0, Lo/alt;->H:Landroid/os/Handler;

    const/16 v1, 0x3ee

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v4

    .line 1428
    iget-object v0, p0, Lo/alt;->H:Landroid/os/Handler;

    invoke-virtual {v0, v4}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 1429
    iget-object v0, p0, Lo/alt;->y:Landroid/content/Context;

    if-eqz v0, :cond_0

    .line 1430
    iget-object v0, p0, Lo/alt;->y:Landroid/content/Context;

    iget-object v1, p0, Lo/alt;->q:Lo/amp;

    invoke-virtual {v1}, Lo/amp;->e()I

    move-result v1

    invoke-static {v0, v1}, Lo/amy;->d(Landroid/content/Context;I)V

    .line 1432
    :cond_0
    return-void
.end method

.method public i()V
    .locals 4

    .line 1340
    iget-object v0, p0, Lo/alt;->X:Lo/anb;

    if-nez v0, :cond_0

    .line 1341
    const-string v0, "Step_LSC"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "makePromptNoSense processAliveMonitor null,failed,return"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1342
    return-void

    .line 1344
    :cond_0
    iget-object v0, p0, Lo/alt;->X:Lo/anb;

    invoke-virtual {v0}, Lo/anb;->d()V

    .line 1345
    return-void
.end method

.method public k()V
    .locals 5

    .line 1536
    const-string v0, "Step_LSC"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startStepCounter enter..."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1537
    iget-object v0, p0, Lo/alt;->y:Landroid/content/Context;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/amy;->a(Landroid/content/Context;Z)V

    .line 1539
    iget-object v0, p0, Lo/alt;->H:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 1540
    iget-object v0, p0, Lo/alt;->H:Landroid/os/Handler;

    const/16 v1, 0x3ed

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v4

    .line 1541
    const/16 v0, 0x64

    iput v0, v4, Landroid/os/Message;->arg1:I

    .line 1542
    iget-object v0, p0, Lo/alt;->H:Landroid/os/Handler;

    invoke-virtual {v0, v4}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 1544
    :cond_0
    iget-object v0, p0, Lo/alt;->f:Lo/abm;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lo/alt;->f:Lo/abm;

    instance-of v0, v0, Lo/abp;

    if-eqz v0, :cond_1

    .line 1545
    const-string v0, "Step_LSC"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "start compare with midware counter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1546
    invoke-direct {p0}, Lo/alt;->G()V

    goto :goto_0

    .line 1548
    :cond_1
    iget-object v0, p0, Lo/alt;->H:Landroid/os/Handler;

    if-eqz v0, :cond_2

    .line 1549
    iget-object v0, p0, Lo/alt;->H:Landroid/os/Handler;

    const/16 v1, 0x3f5

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 1552
    :cond_2
    :goto_0
    return-void
.end method

.method public l()Z
    .locals 1

    .line 1568
    iget-boolean v0, p0, Lo/alt;->g:Z

    return v0
.end method

.method public m()V
    .locals 5

    .line 1556
    const-string v0, "Step_LSC"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "stopStepCounter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1557
    iget-object v0, p0, Lo/alt;->y:Landroid/content/Context;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/amy;->a(Landroid/content/Context;Z)V

    .line 1559
    iget-object v0, p0, Lo/alt;->H:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 1560
    iget-object v0, p0, Lo/alt;->H:Landroid/os/Handler;

    const/16 v1, 0x3ed

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v4

    .line 1561
    const/16 v0, 0x65

    iput v0, v4, Landroid/os/Message;->arg1:I

    .line 1562
    iget-object v0, p0, Lo/alt;->H:Landroid/os/Handler;

    invoke-virtual {v0, v4}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 1565
    :cond_0
    return-void
.end method

.method public n()I
    .locals 1

    .line 1584
    iget v0, p0, Lo/alt;->o:I

    return v0
.end method

.method public o()V
    .locals 6

    .line 1845
    iget-object v0, p0, Lo/alt;->e:Lo/abt;

    if-eqz v0, :cond_1

    .line 1846
    iget-object v0, p0, Lo/alt;->e:Lo/abt;

    invoke-virtual {v0}, Lo/abt;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1847
    const-string v0, "Step_LSC"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "today has no steps report"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1848
    return-void

    .line 1850
    :cond_0
    const-string v0, "Step_LSC"

    const/16 v1, 0xa

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Alarm uploadStaticsToDB totalSteps="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/alt;->e:Lo/abt;

    invoke-virtual {v2}, Lo/abt;->b()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, "deviceStep:"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/alt;->e:Lo/abt;

    invoke-virtual {v2}, Lo/abt;->e()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, "Calories:"

    const/4 v3, 0x4

    aput-object v2, v1, v3

    iget v2, p0, Lo/alt;->s:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    const-string v2, "Floor:"

    const/4 v3, 0x6

    aput-object v2, v1, v3

    iget v2, p0, Lo/alt;->t:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x7

    aput-object v2, v1, v3

    const-string v2, "Distance:"

    const/16 v3, 0x8

    aput-object v2, v1, v3

    iget v2, p0, Lo/alt;->u:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/16 v3, 0x9

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1852
    iget-object v0, p0, Lo/alt;->L:Lo/and;

    iget-object v1, p0, Lo/alt;->e:Lo/abt;

    invoke-virtual {v1}, Lo/abt;->b()I

    move-result v1

    iget-object v2, p0, Lo/alt;->e:Lo/abt;

    invoke-virtual {v2}, Lo/abt;->e()I

    move-result v2

    iget v3, p0, Lo/alt;->s:I

    iget v4, p0, Lo/alt;->t:I

    iget v5, p0, Lo/alt;->u:I

    invoke-virtual/range {v0 .. v5}, Lo/and;->d(IIIII)V

    .line 1855
    :cond_1
    return-void
.end method

.method public p()I
    .locals 2

    .line 1786
    const/4 v1, 0x0

    .line 1788
    iget-object v0, p0, Lo/alt;->k:Lo/abo;

    if-eqz v0, :cond_0

    .line 1789
    iget-object v0, p0, Lo/alt;->k:Lo/abo;

    invoke-virtual {v0}, Lo/abo;->e()I

    move-result v1

    .line 1792
    :cond_0
    return v1
.end method
