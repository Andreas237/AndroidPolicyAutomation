.class public Lcom/huawei/ui/device/activity/alarm/AlarmActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/ui/device/activity/alarm/AlarmActivity$d;
    }
.end annotation


# static fields
.field private static B:Z

.field private static D:Ljava/lang/String;

.field private static final N:Ljava/lang/Object;

.field private static w:Ljava/lang/String;

.field private static x:J


# instance fields
.field private A:Z

.field private C:Lcom/huawei/datatype/SmartAlarmInfo;

.field private E:I

.field private F:I

.field private G:I

.field private H:I

.field private I:I

.field private J:Lo/ems;

.field private K:Ljava/lang/String;

.field private L:Landroid/os/Handler;

.field private M:I

.field private P:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/datatype/EventAlarmInfo;>;"
        }
    .end annotation
.end field

.field private R:Landroid/widget/CompoundButton$OnCheckedChangeListener;

.field private S:Ljava/lang/Runnable;

.field a:Z

.field private b:Landroid/widget/LinearLayout;

.field private c:Landroid/content/Context;

.field private d:Landroid/widget/ListView;

.field private e:Landroid/widget/ImageView;

.field private f:Landroid/widget/TextView;

.field private g:Landroid/widget/ScrollView;

.field private h:Landroid/widget/TextView;

.field private i:Landroid/widget/LinearLayout;

.field private j:Lo/enz;

.field private k:Landroid/widget/TextView;

.field private l:Landroid/widget/Switch;

.field private m:Lo/dqi;

.field private n:Landroid/widget/TextView;

.field private o:Lo/enz;

.field private p:Lo/enx;

.field private q:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/datatype/SmartAlarmInfo;>;"
        }
    .end annotation
.end field

.field private r:Lo/egv;

.field private s:Lo/emp;

.field private t:Lo/emp;

.field private u:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/datatype/EventAlarmInfo;>;"
        }
    .end annotation
.end field

.field private v:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/eoo;>;"
        }
    .end annotation
.end field

.field private y:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/datatype/EventAlarmInfo;>;"
        }
    .end annotation
.end field

.field private z:Lo/eol;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 114
    const-string v0, "7:00"

    sput-object v0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->w:Ljava/lang/String;

    .line 115
    const-string v0, "10"

    sput-object v0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->D:Ljava/lang/String;

    .line 116
    const/4 v0, 0x0

    sput-boolean v0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->B:Z

    .line 131
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->N:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 68
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    .line 71
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->c:Landroid/content/Context;

    .line 89
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->d:Landroid/widget/ListView;

    .line 90
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->b:Landroid/widget/LinearLayout;

    .line 91
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->e:Landroid/widget/ImageView;

    .line 92
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->i:Landroid/widget/LinearLayout;

    .line 93
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->k:Landroid/widget/TextView;

    .line 94
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->g:Landroid/widget/ScrollView;

    .line 95
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->h:Landroid/widget/TextView;

    .line 96
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->f:Landroid/widget/TextView;

    .line 97
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->n:Landroid/widget/TextView;

    .line 105
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->q:Ljava/util/List;

    .line 106
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->u:Ljava/util/List;

    .line 107
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->v:Ljava/util/List;

    .line 108
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->z:Lo/eol;

    .line 110
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->y:Ljava/util/List;

    .line 118
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->A:Z

    .line 120
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->a:Z

    .line 134
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->K:Ljava/lang/String;

    .line 135
    new-instance v0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$d;

    invoke-direct {v0, p0, p0}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$d;-><init>(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->L:Landroid/os/Handler;

    .line 284
    new-instance v0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$3;

    invoke-direct {v0, p0}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$3;-><init>(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->S:Ljava/lang/Runnable;

    .line 1059
    new-instance v0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$8;

    invoke-direct {v0, p0}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$8;-><init>(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->R:Landroid/widget/CompoundButton$OnCheckedChangeListener;

    return-void
.end method

.method static synthetic A(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)I
    .locals 1

    .line 68
    iget v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->M:I

    return v0
.end method

.method static synthetic B(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)I
    .locals 1

    .line 68
    iget v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->I:I

    return v0
.end method

.method static synthetic C(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)Lo/egv;
    .locals 1

    .line 68
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->r:Lo/egv;

    return-object v0
.end method

.method static synthetic D(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)Landroid/widget/Switch;
    .locals 1

    .line 68
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->l:Landroid/widget/Switch;

    return-object v0
.end method

.method static synthetic G(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)Ljava/util/List;
    .locals 1

    .line 68
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->P:Ljava/util/List;

    return-object v0
.end method

.method static synthetic I(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)Lo/enz;
    .locals 1

    .line 68
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->o:Lo/enz;

    return-object v0
.end method

.method static synthetic a(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;I)I
    .locals 0

    .line 68
    iput p1, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->G:I

    return p1
.end method

.method static synthetic a(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)Lo/eol;
    .locals 1

    .line 68
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->z:Lo/eol;

    return-object v0
.end method

.method private a()V
    .locals 6

    .line 361
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->q:Ljava/util/List;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->q:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 362
    :cond_0
    new-instance v5, Lcom/huawei/datatype/SmartAlarmInfo;

    invoke-direct {v5}, Lcom/huawei/datatype/SmartAlarmInfo;-><init>()V

    .line 363
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->q:Ljava/util/List;

    .line 364
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->q:Ljava/util/List;

    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 366
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->q:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 367
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->q:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/datatype/SmartAlarmInfo;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->C:Lcom/huawei/datatype/SmartAlarmInfo;

    .line 368
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->C:Lcom/huawei/datatype/SmartAlarmInfo;

    invoke-virtual {v0}, Lcom/huawei/datatype/SmartAlarmInfo;->getSmartAlarmIndex()I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->H:I

    .line 369
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->C:Lcom/huawei/datatype/SmartAlarmInfo;

    invoke-virtual {v0}, Lcom/huawei/datatype/SmartAlarmInfo;->getSmartAlarmEnable()I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->G:I

    .line 370
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->C:Lcom/huawei/datatype/SmartAlarmInfo;

    invoke-virtual {v0}, Lcom/huawei/datatype/SmartAlarmInfo;->getSmartAlarmStartTime_hour()I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->F:I

    .line 371
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->C:Lcom/huawei/datatype/SmartAlarmInfo;

    invoke-virtual {v0}, Lcom/huawei/datatype/SmartAlarmInfo;->getSmartAlarmStartTime_mins()I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->I:I

    .line 372
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->C:Lcom/huawei/datatype/SmartAlarmInfo;

    invoke-virtual {v0}, Lcom/huawei/datatype/SmartAlarmInfo;->getSmartAlarmRepeat()I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->E:I

    .line 373
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->C:Lcom/huawei/datatype/SmartAlarmInfo;

    invoke-virtual {v0}, Lcom/huawei/datatype/SmartAlarmInfo;->getSmartAlarmAheadTime()I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->M:I

    .line 375
    iget v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->E:I

    const/4 v1, 0x0

    if-ne v1, v0, :cond_2

    iget v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->G:I

    const/4 v1, 0x1

    if-ne v1, v0, :cond_2

    .line 376
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->C:Lcom/huawei/datatype/SmartAlarmInfo;

    invoke-direct {p0, v0}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->e(Lcom/huawei/datatype/SmartAlarmInfo;)I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->G:I

    .line 378
    :cond_2
    const-string v0, "AlarmActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "smartAlarmIndex ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->H:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 379
    const-string v0, "AlarmActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "smartAlarmEnable ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->G:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 380
    const-string v0, "AlarmActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "smartAlarmStartTime = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->F:I

    mul-int/lit8 v3, v3, 0x64

    iget v4, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->I:I

    add-int/2addr v3, v4

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 381
    const-string v0, "AlarmActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "smartAlarmRepeat ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->E:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 382
    const-string v0, "AlarmActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "smartAlarmAheadTime ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->M:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 383
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->L:Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v5

    .line 384
    const/16 v0, 0x64

    iput v0, v5, Landroid/os/Message;->what:I

    .line 385
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->L:Landroid/os/Handler;

    invoke-virtual {v0, v5}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 386
    goto :goto_0

    .line 387
    :cond_3
    const-string v0, "AlarmActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "refreshSmartAlarmUI() deviceSmartAlarmList == null or size = 0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 390
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->j:Lo/enz;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->K:Ljava/lang/String;

    new-instance v2, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$11;

    invoke-direct {v2, p0}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$11;-><init>(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)V

    invoke-virtual {v0, v1, v2}, Lo/enz;->b(Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 433
    return-void
.end method

.method private a(IZ)V
    .locals 6

    .line 457
    const-string v0, "AlarmActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updateEventAlarm()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 458
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->u:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/datatype/EventAlarmInfo;

    .line 459
    if-eqz p2, :cond_0

    .line 460
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Lcom/huawei/datatype/EventAlarmInfo;->setEventAlarmEnable(I)V

    goto :goto_0

    .line 462
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Lcom/huawei/datatype/EventAlarmInfo;->setEventAlarmEnable(I)V

    .line 464
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->u:Ljava/util/List;

    invoke-interface {v0, p1, v4}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 465
    iget-boolean v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->a:Z

    if-eqz v0, :cond_1

    .line 466
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->j:Lo/enz;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->u:Ljava/util/List;

    invoke-virtual {v0, v1}, Lo/enz;->d(Ljava/util/List;)V

    .line 467
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->j:Lo/enz;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->K:Ljava/lang/String;

    iget-object v2, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->u:Ljava/util/List;

    new-instance v3, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$14;

    invoke-direct {v3, p0}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$14;-><init>(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)V

    invoke-virtual {v0, v1, v2, v3}, Lo/enz;->a(Ljava/lang/String;Ljava/util/List;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    goto :goto_1

    .line 473
    :cond_1
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->o()V

    .line 474
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->o:Lo/enz;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->u:Ljava/util/List;

    new-instance v2, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$15;

    invoke-direct {v2, p0}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$15;-><init>(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)V

    invoke-virtual {v0, v1, v2}, Lo/enz;->b(Ljava/util/List;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 487
    :goto_1
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->L:Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v5

    .line 488
    const/16 v0, 0x68

    iput v0, v5, Landroid/os/Message;->what:I

    .line 489
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->L:Landroid/os/Handler;

    invoke-virtual {v0, v5}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 490
    return-void
.end method

.method private a(Ljava/util/List;)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/datatype/EventAlarmInfo;>;)V"
        }
    .end annotation

    .line 332
    const-string v0, "AlarmActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter refreshEventAlarmUI_spData"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 333
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 334
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->y:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 335
    const/4 v8, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-ge v8, v0, :cond_1

    .line 336
    invoke-interface {p1, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lcom/huawei/datatype/EventAlarmInfo;

    .line 337
    invoke-virtual {v9}, Lcom/huawei/datatype/EventAlarmInfo;->getEventAlarmName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 338
    sget v0, Lcom/huawei/ui/device/R$string;->IDS_settings_prompt:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Lcom/huawei/datatype/EventAlarmInfo;->setEventAlarmName(Ljava/lang/String;)V

    .line 340
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->y:Ljava/util/List;

    invoke-interface {v0, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 341
    new-instance v10, Lo/eoo;

    invoke-direct {v10}, Lo/eoo;-><init>()V

    .line 342
    move-object v0, v10

    move-object v1, v10

    move-object v2, v9

    iget-object v3, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->p:Lo/enx;

    iget-object v4, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->c:Landroid/content/Context;

    move-object v5, p1

    move v6, v8

    invoke-virtual/range {v0 .. v6}, Lo/eoo;->e(Lo/eoo;Lcom/huawei/datatype/EventAlarmInfo;Lo/enx;Landroid/content/Context;Ljava/util/List;I)Lo/eoo;

    move-result-object v10

    .line 343
    invoke-interface {v7, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 335
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    .line 345
    :cond_1
    invoke-interface {p1}, Ljava/util/List;->clear()V

    .line 346
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->y:Ljava/util/List;

    invoke-interface {p1, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 347
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->j:Lo/enz;

    invoke-virtual {v0, p1}, Lo/enz;->d(Ljava/util/List;)V

    .line 348
    const-string v0, "AlarmActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mListItem ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 349
    const-string v0, "AlarmActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mListItem ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "   mListItem=="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 350
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->L:Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v8

    .line 351
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->z:Lo/eol;

    .line 352
    const/16 v0, 0x66

    iput v0, v8, Landroid/os/Message;->what:I

    .line 353
    iput-object v7, v8, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 354
    const/4 v0, 0x0

    iput v0, v8, Landroid/os/Message;->arg1:I

    .line 355
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->L:Landroid/os/Handler;

    invoke-virtual {v0, v8}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 356
    return-void
.end method

.method static synthetic b(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;I)I
    .locals 0

    .line 68
    iput p1, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->F:I

    return p1
.end method

.method static synthetic b(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)Landroid/widget/ListView;
    .locals 1

    .line 68
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->d:Landroid/widget/ListView;

    return-object v0
.end method

.method static synthetic b(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 68
    iput-object p1, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->q:Ljava/util/List;

    return-object p1
.end method

.method static synthetic b(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;Lo/egv;)Lo/egv;
    .locals 0

    .line 68
    iput-object p1, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->r:Lo/egv;

    return-object p1
.end method

.method private b()V
    .locals 3

    .line 298
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->j:Lo/enz;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->K:Ljava/lang/String;

    new-instance v2, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$13;

    invoke-direct {v2, p0}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$13;-><init>(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)V

    invoke-virtual {v0, v1, v2}, Lo/enz;->a(Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 330
    return-void
.end method

.method private b(Landroid/content/Intent;)V
    .locals 12

    .line 957
    const-string v0, "AlarmActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updateSmartAlarmUI()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 958
    const-string v0, "smart_time"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v6

    .line 959
    const-string v0, "week_day"

    const/16 v1, 0x1f

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v7

    .line 960
    const-string v0, "ahead_time"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 961
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->c:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_settings_about_huawei_cloud_service_action_turn_off:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v9

    .line 963
    invoke-virtual {v9, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 964
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->k:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->c:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/device/R$string;->IDS_settings_smart_time_detail_close:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->p:Lo/enx;

    iget-object v3, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->c:Landroid/content/Context;

    .line 965
    invoke-static {v3, v6}, Lo/enx;->a(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    aput-object v8, v2, v3

    .line 964
    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 967
    const/4 v10, 0x0

    goto :goto_0

    .line 970
    :cond_0
    invoke-static {v8}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v10

    .line 971
    int-to-double v0, v10

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v8

    .line 972
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$plurals;->IDS_settings_smart_time_detail:I

    .line 973
    invoke-static {v8}, Lo/dbf;->b(Ljava/lang/String;)I

    move-result v2

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    iget-object v4, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->p:Lo/enx;

    iget-object v4, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->c:Landroid/content/Context;

    invoke-static {v4, v6}, Lo/enx;->a(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    aput-object v8, v3, v4

    .line 972
    invoke-virtual {v0, v1, v2, v3}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v11

    .line 974
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->k:Landroid/widget/TextView;

    invoke-virtual {v0, v11}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 977
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->h:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->p:Lo/enx;

    invoke-virtual {v1, v7}, Lo/enx;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 979
    div-int/lit8 v0, v6, 0x64

    iput v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->F:I

    .line 980
    rem-int/lit8 v0, v6, 0x64

    iput v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->I:I

    .line 983
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->C:Lcom/huawei/datatype/SmartAlarmInfo;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 984
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->C:Lcom/huawei/datatype/SmartAlarmInfo;

    invoke-virtual {v0, v10}, Lcom/huawei/datatype/SmartAlarmInfo;->setSmartAlarmAheadTime(I)V

    .line 985
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->C:Lcom/huawei/datatype/SmartAlarmInfo;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/huawei/datatype/SmartAlarmInfo;->setSmartAlarmEnable(I)V

    .line 986
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->C:Lcom/huawei/datatype/SmartAlarmInfo;

    invoke-virtual {v0, v7}, Lcom/huawei/datatype/SmartAlarmInfo;->setSmartAlarmRepeat(I)V

    .line 987
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->C:Lcom/huawei/datatype/SmartAlarmInfo;

    iget v1, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->F:I

    invoke-virtual {v0, v1}, Lcom/huawei/datatype/SmartAlarmInfo;->setSmartAlarmStartTime_hour(I)V

    .line 988
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->C:Lcom/huawei/datatype/SmartAlarmInfo;

    iget v1, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->I:I

    invoke-virtual {v0, v1}, Lcom/huawei/datatype/SmartAlarmInfo;->setSmartAlarmStartTime_mins(I)V

    .line 989
    const-string v0, "AlarmActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updateSmartAlarmUI() update mSmartAlarmInfo finish!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 992
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->l:Landroid/widget/Switch;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/Switch;->setChecked(Z)V

    .line 993
    return-void
.end method

.method static synthetic b(Z)Z
    .locals 0

    .line 68
    sput-boolean p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->B:Z

    return p0
.end method

.method static synthetic c(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;I)I
    .locals 0

    .line 68
    iput p1, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->E:I

    return p1
.end method

.method static synthetic c(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;Lcom/huawei/datatype/SmartAlarmInfo;)Lcom/huawei/datatype/SmartAlarmInfo;
    .locals 0

    .line 68
    iput-object p1, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->C:Lcom/huawei/datatype/SmartAlarmInfo;

    return-object p1
.end method

.method static synthetic c(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 68
    iput-object p1, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->u:Ljava/util/List;

    return-object p1
.end method

.method static synthetic c(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;Lo/eol;)Lo/eol;
    .locals 0

    .line 68
    iput-object p1, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->z:Lo/eol;

    return-object p1
.end method

.method static synthetic c(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)V
    .locals 0

    .line 68
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->n()V

    return-void
.end method

.method public static c(J)Z
    .locals 6

    .line 1021
    sget-object v2, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->N:Ljava/lang/Object;

    monitor-enter v2

    .line 1022
    :try_start_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    .line 1023
    sget-wide v0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->x:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    sub-long v0, v3, v0

    cmp-long v0, v0, p0

    if-gez v0, :cond_0

    .line 1024
    monitor-exit v2

    const/4 v0, 0x1

    return v0

    .line 1026
    :cond_0
    :try_start_1
    sput-wide v3, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->x:J
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1027
    monitor-exit v2

    const/4 v0, 0x0

    return v0

    .line 1028
    :catchall_0
    move-exception v5

    monitor-exit v2

    throw v5
.end method

.method static synthetic d(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;I)I
    .locals 0

    .line 68
    iput p1, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->H:I

    return p1
.end method

.method static synthetic d(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;Lcom/huawei/datatype/SmartAlarmInfo;)I
    .locals 1

    .line 68
    invoke-direct {p0, p1}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->e(Lcom/huawei/datatype/SmartAlarmInfo;)I

    move-result v0

    return v0
.end method

.method static synthetic d(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 68
    iput-object p1, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->v:Ljava/util/List;

    return-object p1
.end method

.method static synthetic d(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)Lo/dqi;
    .locals 1

    .line 68
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->m:Lo/dqi;

    return-object v0
.end method

.method private e(Lcom/huawei/datatype/SmartAlarmInfo;)I
    .locals 11

    .line 846
    invoke-virtual {p1}, Lcom/huawei/datatype/SmartAlarmInfo;->getSmartAlarmEnable()I

    move-result v4

    .line 849
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->c:Landroid/content/Context;

    const/16 v1, 0x2726

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "ONCE_SMART_ALARM_INFO"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 850
    const-string v0, "AlarmActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "==once== onceSmartAlarmIsOver json = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 851
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 852
    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    new-instance v1, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$6;

    invoke-direct {v1, p0}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$6;-><init>(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)V

    invoke-virtual {v1}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$6;->getType()Ljava/lang/reflect/Type;

    move-result-object v1

    invoke-virtual {v0, v5, v1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/util/List;

    .line 853
    const/4 v0, 0x0

    if-eq v0, v6, :cond_1

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 854
    const/4 v7, 0x0

    :goto_0
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    if-ge v7, v0, :cond_1

    .line 855
    invoke-interface {v6, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/huawei/datatype/SmartAlarmInfo;

    .line 856
    invoke-virtual {v8}, Lcom/huawei/datatype/SmartAlarmInfo;->getSmartAlarmIndex()I

    move-result v0

    invoke-virtual {p1}, Lcom/huawei/datatype/SmartAlarmInfo;->getSmartAlarmIndex()I

    move-result v1

    if-ne v0, v1, :cond_0

    .line 859
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    div-long v9, v0, v2

    .line 860
    const-string v0, "AlarmActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "==once== CurTime = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v9, v10}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 861
    invoke-virtual {v8}, Lcom/huawei/datatype/SmartAlarmInfo;->getSmartAlarmTime()J

    move-result-wide v0

    cmp-long v0, v9, v0

    if-ltz v0, :cond_0

    .line 863
    const/4 v4, 0x0

    .line 854
    :cond_0
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 868
    :cond_1
    goto :goto_1

    .line 869
    :cond_2
    const-string v0, "AlarmActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "==once== onceSmartAlarmIsOver json is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 872
    :goto_1
    const-string v0, "AlarmActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "==once== onceSmartAlarmIsOver iRet = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 873
    return v4
.end method

.method static synthetic e(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;I)I
    .locals 0

    .line 68
    iput p1, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->I:I

    return p1
.end method

.method static synthetic e(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)Ljava/util/List;
    .locals 1

    .line 68
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->v:Ljava/util/List;

    return-object v0
.end method

.method static synthetic e(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;Ljava/util/List;)V
    .locals 0

    .line 68
    invoke-direct {p0, p1}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->a(Ljava/util/List;)V

    return-void
.end method

.method static synthetic e()Z
    .locals 1

    .line 68
    sget-boolean v0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->B:Z

    return v0
.end method

.method static synthetic f(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)Ljava/util/List;
    .locals 1

    .line 68
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->u:Ljava/util/List;

    return-object v0
.end method

.method private f()V
    .locals 1

    .line 641
    iget-boolean v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->a:Z

    if-nez v0, :cond_0

    .line 642
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->g()V

    .line 644
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->i()V

    .line 646
    :cond_0
    return-void
.end method

.method static synthetic g(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)Landroid/widget/LinearLayout;
    .locals 1

    .line 68
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->b:Landroid/widget/LinearLayout;

    return-object v0
.end method

.method private g()V
    .locals 2

    .line 786
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->m:Lo/dqi;

    new-instance v1, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$5;

    invoke-direct {v1, p0}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$5;-><init>(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)V

    invoke-virtual {v0, v1}, Lo/dqi;->a(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 838
    return-void
.end method

.method private h()V
    .locals 6

    .line 493
    sget v0, Lcom/huawei/ui/device/R$id;->buttomview:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/ems;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->J:Lo/ems;

    .line 494
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->c:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/device/R$layout;->activity_alarm_black_bottomview:I

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v5

    .line 495
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->J:Lo/ems;

    invoke-virtual {v0, v5}, Lo/ems;->e(Landroid/view/View;)V

    .line 496
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->J:Lo/ems;

    invoke-virtual {v0, p0}, Lo/ems;->a(Landroid/app/Activity;)V

    .line 497
    sget v0, Lcom/huawei/ui/device/R$id;->smart_alarm_time1:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->k:Landroid/widget/TextView;

    .line 498
    sget v0, Lcom/huawei/ui/device/R$id;->smart_alarm_day:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->h:Landroid/widget/TextView;

    .line 499
    sget v0, Lcom/huawei/ui/device/R$id;->smart_alarm_text:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->i:Landroid/widget/LinearLayout;

    .line 500
    sget v0, Lcom/huawei/ui/device/R$id;->smart_alarm_switch_button:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Switch;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->l:Landroid/widget/Switch;

    .line 501
    sget v0, Lcom/huawei/ui/device/R$id;->alarm_bottom_tv:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->f:Landroid/widget/TextView;

    .line 502
    sget v0, Lcom/huawei/ui/device/R$id;->event_alarm_scrollview:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ScrollView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->g:Landroid/widget/ScrollView;

    .line 503
    sget v0, Lcom/huawei/ui/device/R$id;->tv_switch_cover_button:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->n:Landroid/widget/TextView;

    .line 504
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->k()V

    .line 506
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->g:Landroid/widget/ScrollView;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/widget/ScrollView;->smoothScrollTo(II)V

    .line 507
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->n:Landroid/widget/TextView;

    new-instance v1, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$12;

    invoke-direct {v1, p0}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$12;-><init>(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 519
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->i:Landroid/widget/LinearLayout;

    new-instance v1, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$19;

    invoke-direct {v1, p0}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$19;-><init>(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 529
    sget v0, Lcom/huawei/ui/device/R$id;->event_alarm_list:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ListView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->d:Landroid/widget/ListView;

    .line 530
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->d:Landroid/widget/ListView;

    invoke-virtual {v0, p0}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 531
    sget v0, Lcom/huawei/ui/device/R$id;->event_alarm_bottom_add_layout:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->b:Landroid/widget/LinearLayout;

    .line 532
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->b:Landroid/widget/LinearLayout;

    new-instance v1, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$16;

    invoke-direct {v1, p0}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$16;-><init>(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 539
    sget v0, Lcom/huawei/ui/device/R$id;->add_iv:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->e:Landroid/widget/ImageView;

    .line 541
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->f:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->c:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/device/R$string;->IDS_settings_mult_alarm_clock_list_msg_new:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->c:Landroid/content/Context;

    invoke-static {v3}, Lo/enz;->b(Landroid/content/Context;)Lo/enz;

    move-result-object v3

    iget-object v4, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->K:Ljava/lang/String;

    invoke-virtual {v3, v4}, Lo/enz;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x5

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 542
    return-void
.end method

.method static synthetic h(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)Z
    .locals 1

    .line 68
    iget-boolean v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->A:Z

    return v0
.end method

.method private i()V
    .locals 2

    .line 667
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->m:Lo/dqi;

    new-instance v1, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$1;

    invoke-direct {v1, p0}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$1;-><init>(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)V

    invoke-virtual {v0, v1}, Lo/dqi;->b(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 723
    return-void
.end method

.method static synthetic i(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)V
    .locals 0

    .line 68
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->o()V

    return-void
.end method

.method static synthetic j(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)V
    .locals 0

    .line 68
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->l()V

    return-void
.end method

.method static synthetic k(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;I)I
    .locals 0

    .line 68
    iput p1, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->M:I

    return p1
.end method

.method static synthetic k(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)Landroid/widget/ImageView;
    .locals 1

    .line 68
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->e:Landroid/widget/ImageView;

    return-object v0
.end method

.method private k()V
    .locals 6

    .line 545
    sget v0, Lcom/huawei/ui/device/R$id;->settings_smart_alarm_text:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emp;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->t:Lo/emp;

    .line 546
    sget v0, Lcom/huawei/ui/device/R$id;->event_alarm_title:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emp;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->s:Lo/emp;

    .line 548
    new-instance v2, Lo/enl;

    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->c:Landroid/content/Context;

    const/4 v1, 0x0

    invoke-direct {v2, v0, v1}, Lo/enl;-><init>(Landroid/content/Context;I)V

    .line 549
    new-instance v3, Lo/enl;

    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->c:Landroid/content/Context;

    const/4 v1, 0x1

    invoke-direct {v3, v0, v1}, Lo/enl;-><init>(Landroid/content/Context;I)V

    .line 551
    new-instance v4, Landroid/support/v7/widget/LinearLayoutManager;

    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->c:Landroid/content/Context;

    invoke-direct {v4, v0}, Landroid/support/v7/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    .line 552
    new-instance v5, Landroid/support/v7/widget/LinearLayoutManager;

    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->c:Landroid/content/Context;

    invoke-direct {v5, v0}, Landroid/support/v7/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    .line 554
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->t:Lo/emp;

    invoke-virtual {v0, v4}, Lo/emp;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    .line 555
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->s:Lo/emp;

    invoke-virtual {v0, v5}, Lo/emp;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    .line 557
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->t:Lo/emp;

    invoke-virtual {v0, v2}, Lo/emp;->setAdapter(Lo/flg$a;)V

    .line 558
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->s:Lo/emp;

    invoke-virtual {v0, v3}, Lo/emp;->setAdapter(Lo/flg$a;)V

    .line 559
    return-void
.end method

.method private l()V
    .locals 5

    .line 996
    const-string v0, "AlarmActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "addButtonClick()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 997
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->v:Ljava/util/List;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 998
    const-string v0, "AlarmActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "addButtonClick() mEventAlarmItemList == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 999
    return-void

    .line 1001
    :cond_0
    const-string v0, "AlarmActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "addButtonClick() mEventAlarmItemList.size() = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->v:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1002
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->v:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x5

    if-lt v0, v1, :cond_1

    .line 1003
    const-wide/16 v0, 0xbb8

    invoke-static {v0, v1}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->c(J)Z

    move-result v0

    if-nez v0, :cond_2

    .line 1004
    const-string v0, "AlarmActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "addButtonClick() Can\'t greater than 5"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 1008
    :cond_1
    new-instance v4, Landroid/content/Intent;

    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->c:Landroid/content/Context;

    const-class v1, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;

    invoke-direct {v4, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 1009
    const-string v0, "from_add_button"

    const/4 v1, 0x1

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 1010
    const-string v0, "device_id"

    iget-object v1, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->K:Ljava/lang/String;

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 1011
    const/4 v0, 0x0

    invoke-virtual {p0, v4, v0}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 1013
    :cond_2
    :goto_0
    return-void
.end method

.method static synthetic l(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)V
    .locals 0

    .line 68
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->m()V

    return-void
.end method

.method static synthetic m(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)Landroid/os/Handler;
    .locals 1

    .line 68
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->L:Landroid/os/Handler;

    return-object v0
.end method

.method private m()V
    .locals 5

    .line 930
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->v:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 931
    const/4 v2, 0x0

    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->u:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v2, v0, :cond_0

    .line 932
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->u:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/datatype/EventAlarmInfo;

    .line 933
    new-instance v4, Lo/eoo;

    invoke-direct {v4}, Lo/eoo;-><init>()V

    .line 934
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->p:Lo/enx;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->c:Landroid/content/Context;

    invoke-virtual {v4, v4, v3, v0, v1}, Lo/eoo;->b(Lo/eoo;Lcom/huawei/datatype/EventAlarmInfo;Lo/enx;Landroid/content/Context;)Lo/eoo;

    move-result-object v4

    .line 949
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->v:Ljava/util/List;

    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 931
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 951
    :cond_0
    return-void
.end method

.method private n()V
    .locals 7

    .line 880
    const-string v0, "AlarmActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "enter updateSmartAlarmUI()  ;"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->G:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ";isSmartButtonChecked="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    sget-boolean v3, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->B:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 881
    iget v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->G:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 882
    const/4 v0, 0x1

    sput-boolean v0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->B:Z

    goto :goto_0

    .line 885
    :cond_0
    const/4 v0, 0x0

    sput-boolean v0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->B:Z

    .line 887
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->l:Landroid/widget/Switch;

    sget-boolean v1, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->B:Z

    invoke-virtual {v0, v1}, Landroid/widget/Switch;->setChecked(Z)V

    .line 888
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->l:Landroid/widget/Switch;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->R:Landroid/widget/CompoundButton$OnCheckedChangeListener;

    invoke-virtual {v0, v1}, Landroid/widget/Switch;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 889
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->p:Lo/enx;

    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->c:Landroid/content/Context;

    iget v1, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->F:I

    mul-int/lit8 v1, v1, 0x64

    iget v2, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->I:I

    add-int/2addr v1, v2

    invoke-static {v0, v1}, Lo/enx;->a(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->w:Ljava/lang/String;

    .line 890
    iget v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->M:I

    int-to-double v0, v0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->D:Ljava/lang/String;

    .line 892
    const-string v0, "0"

    sget-object v1, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->D:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 893
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->k:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->c:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/device/R$string;->IDS_settings_smart_time_detail_close:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    sget-object v3, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->w:Ljava/lang/String;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    sget-object v3, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->D:Ljava/lang/String;

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_1

    .line 897
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$plurals;->IDS_settings_smart_time_detail:I

    sget-object v2, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->D:Ljava/lang/String;

    .line 898
    invoke-static {v2}, Lo/dbf;->b(Ljava/lang/String;)I

    move-result v2

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    sget-object v4, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->w:Ljava/lang/String;

    const/4 v5, 0x0

    aput-object v4, v3, v5

    sget-object v4, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->D:Ljava/lang/String;

    const/4 v5, 0x1

    aput-object v4, v3, v5

    .line 897
    invoke-virtual {v0, v1, v2, v3}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    .line 899
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->k:Landroid/widget/TextView;

    invoke-virtual {v0, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 902
    :goto_1
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->h:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->p:Lo/enx;

    iget v2, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->E:I

    invoke-virtual {v1, v2}, Lo/enx;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 903
    const-string v0, "AlarmActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mWeekDay="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->h:Landroid/widget/TextView;

    invoke-virtual {v3}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ";mSmartTimer="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->k:Landroid/widget/TextView;

    invoke-virtual {v3}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ";mSmartAlarmSwitch="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->l:Landroid/widget/Switch;

    invoke-virtual {v3}, Landroid/widget/Switch;->isChecked()Z

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 904
    return-void
.end method

.method static synthetic n(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)V
    .locals 0

    .line 68
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->g()V

    return-void
.end method

.method static synthetic o(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)Landroid/content/Context;
    .locals 1

    .line 68
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->c:Landroid/content/Context;

    return-object v0
.end method

.method private o()V
    .locals 5

    .line 1109
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/env;->d(Landroid/content/Context;)Lo/env;

    move-result-object v4

    .line 1110
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->K:Ljava/lang/String;

    invoke-virtual {v4, v0}, Lo/env;->b(Ljava/lang/String;)I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    .line 1111
    const-string v0, "AlarmActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showNoConnectedToast()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1112
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->c:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_device_not_connect:I

    invoke-static {v0, v1}, Lo/emv;->e(Landroid/content/Context;I)V

    .line 1114
    :cond_0
    return-void
.end method

.method static synthetic p(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)Lo/enz;
    .locals 1

    .line 68
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->j:Lo/enz;

    return-object v0
.end method

.method private p()V
    .locals 4

    .line 910
    const-string v0, "AlarmActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updateEventAlarmUI()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 911
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->m:Lo/dqi;

    new-instance v1, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$10;

    invoke-direct {v1, p0}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$10;-><init>(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)V

    invoke-virtual {v0, v1}, Lo/dqi;->b(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 924
    return-void
.end method

.method static synthetic q(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)Ljava/lang/String;
    .locals 1

    .line 68
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->K:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic r(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)Ljava/util/List;
    .locals 1

    .line 68
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->y:Ljava/util/List;

    return-object v0
.end method

.method static synthetic s(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)V
    .locals 0

    .line 68
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->i()V

    return-void
.end method

.method static synthetic t(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)Ljava/util/List;
    .locals 1

    .line 68
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->q:Ljava/util/List;

    return-object v0
.end method

.method static synthetic u(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)Lo/enx;
    .locals 1

    .line 68
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->p:Lo/enx;

    return-object v0
.end method

.method static synthetic v(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)I
    .locals 1

    .line 68
    iget v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->H:I

    return v0
.end method

.method static synthetic w(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)I
    .locals 1

    .line 68
    iget v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->G:I

    return v0
.end method

.method static synthetic x(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)I
    .locals 1

    .line 68
    iget v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->F:I

    return v0
.end method

.method static synthetic y(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)I
    .locals 1

    .line 68
    iget v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->E:I

    return v0
.end method

.method static synthetic z(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)Lcom/huawei/datatype/SmartAlarmInfo;
    .locals 1

    .line 68
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->C:Lcom/huawei/datatype/SmartAlarmInfo;

    return-object v0
.end method


# virtual methods
.method public c()V
    .locals 4

    .line 613
    new-instance v0, Lo/egv$b;

    invoke-direct {v0, p0}, Lo/egv$b;-><init>(Landroid/content/Context;)V

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_service_area_notice_title:I

    .line 614
    invoke-virtual {v0, v1}, Lo/egv$b;->b(I)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_device_to_intelligent_home_linkage_alarm_notice:I

    .line 615
    invoke-virtual {v0, v1}, Lo/egv$b;->e(I)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_settings_about_huawei_cloud_service_action_turn_off:I

    new-instance v2, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$2;

    invoke-direct {v2, p0}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$2;-><init>(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)V

    .line 616
    invoke-virtual {v0, v1, v2}, Lo/egv$b;->e(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_settings_button_cancal_ios_btn:I

    new-instance v2, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$4;

    invoke-direct {v2, p0}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$4;-><init>(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)V

    .line 626
    invoke-virtual {v0, v1, v2}, Lo/egv$b;->b(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    move-result-object v3

    .line 634
    invoke-virtual {v3}, Lo/egv$b;->b()Lo/egv;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->r:Lo/egv;

    .line 635
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->r:Lo/egv;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egv;->setCancelable(Z)V

    .line 636
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->r:Lo/egv;

    invoke-virtual {v0}, Lo/egv;->show()V

    .line 637
    return-void
.end method

.method public d()V
    .locals 4

    .line 565
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/dde;->d(Landroid/content/Context;)Lo/dde;

    move-result-object v0

    invoke-virtual {v0}, Lo/dde;->d()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v3

    .line 566
    if-eqz v3, :cond_0

    .line 567
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->m:Lo/dqi;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "intelligent_home_linkage"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v3}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$20;

    invoke-direct {v2, p0}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$20;-><init>(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)V

    invoke-virtual {v0, v1, v2}, Lo/dqi;->d(Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    goto :goto_0

    .line 605
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->l:Landroid/widget/Switch;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/Switch;->setChecked(Z)V

    .line 607
    :goto_0
    return-void
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 5

    .line 1118
    invoke-super {p0, p1, p2, p3}, Lcom/huawei/ui/commonui/base/BaseActivity;->onActivityResult(IILandroid/content/Intent;)V

    .line 1119
    const-string v0, "AlarmActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onActivityResult requestCode = "

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

    .line 1120
    sparse-switch p2, :sswitch_data_0

    goto/16 :goto_0

    .line 1122
    :sswitch_0
    invoke-direct {p0, p3}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->b(Landroid/content/Intent;)V

    .line 1123
    goto/16 :goto_0

    .line 1125
    :sswitch_1
    iget-boolean v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->a:Z

    if-eqz v0, :cond_1

    .line 1126
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->c:Landroid/content/Context;

    const/16 v1, 0x2726

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "DEVICE_EVENT_ALARM_INFO"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 1127
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1128
    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    new-instance v1, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$9;

    invoke-direct {v1, p0}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$9;-><init>(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)V

    .line 1129
    invoke-virtual {v1}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$9;->getType()Ljava/lang/reflect/Type;

    move-result-object v1

    .line 1128
    invoke-virtual {v0, v4, v1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->P:Ljava/util/List;

    .line 1131
    :cond_0
    const-string v0, "AlarmActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "eventAlarmDBList_change.size="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->P:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ";onActivityResult json = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1132
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->j:Lo/enz;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->K:Ljava/lang/String;

    iget-object v2, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->P:Ljava/util/List;

    new-instance v3, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$7;

    invoke-direct {v3, p0}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$7;-><init>(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)V

    invoke-virtual {v0, v1, v2, v3}, Lo/enz;->a(Ljava/lang/String;Ljava/util/List;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 1146
    goto :goto_0

    .line 1147
    :cond_1
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->p()V

    .line 1149
    .line 1153
    :goto_0
    return-void

    :sswitch_data_0
    .sparse-switch
        0xa -> :sswitch_0
        0xb -> :sswitch_1
    .end sparse-switch
.end method

.method public onClickEventAlarmSwitch(Landroid/view/View;)V
    .locals 7

    .line 440
    const/4 v4, 0x0

    .line 441
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    return-void

    .line 442
    :cond_0
    instance-of v0, p1, Landroid/widget/Switch;

    if-eqz v0, :cond_1

    .line 443
    move-object v4, p1

    check-cast v4, Landroid/widget/Switch;

    .line 445
    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v5

    .line 446
    const/4 v0, 0x0

    if-eq v0, v4, :cond_2

    .line 447
    invoke-virtual {v4}, Landroid/widget/Switch;->isChecked()Z

    move-result v6

    .line 448
    const-string v0, "AlarmActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onClickEventAlarmSwitch() position = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",isChecked = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 449
    invoke-direct {p0, v5, v6}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->a(IZ)V

    .line 451
    :cond_2
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 7

    .line 249
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 250
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->c:Landroid/content/Context;

    .line 251
    const-string v0, "AlarmActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCreate()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 252
    sget v0, Lcom/huawei/ui/device/R$layout;->activity_alarm_black:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->setContentView(I)V

    .line 253
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->getIntent()Landroid/content/Intent;

    move-result-object v4

    .line 254
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    .line 255
    const-string v0, "device_id"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->K:Ljava/lang/String;

    .line 257
    :cond_0
    const/4 v0, 0x0

    invoke-static {v0}, Lo/enz;->b(Landroid/content/Context;)Lo/enz;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->o:Lo/enz;

    .line 258
    const/4 v0, 0x0

    invoke-static {v0}, Lo/enx;->a(Landroid/content/Context;)Lo/enx;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->p:Lo/enx;

    .line 259
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/dqi;->b(Landroid/content/Context;)Lo/dqi;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->m:Lo/dqi;

    .line 261
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/enz;->b(Landroid/content/Context;)Lo/enz;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->j:Lo/enz;

    .line 263
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->h()V

    .line 265
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->K:Ljava/lang/String;

    invoke-static {v0}, Lo/czw;->e(Ljava/lang/String;)Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 266
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->K:Ljava/lang/String;

    invoke-static {v0}, Lo/czw;->e(Ljava/lang/String;)Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isChange_alarm()Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->a:Z

    .line 268
    :cond_1
    const-string v0, "AlarmActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "bIsSupportChangeAlarm ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->a:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 269
    iget-boolean v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->a:Z

    if-eqz v0, :cond_2

    .line 271
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->b()V

    .line 272
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->a()V

    goto :goto_0

    .line 275
    :cond_2
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v5

    .line 276
    const/16 v0, 0xd

    invoke-virtual {v5, v0}, Ljava/util/Calendar;->get(I)I

    move-result v6

    .line 277
    const-string v0, "AlarmActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "==once== curSecond = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 279
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->L:Landroid/os/Handler;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->S:Ljava/lang/Runnable;

    add-int/lit8 v2, v6, -0x1

    mul-int/lit16 v2, v2, 0x3e8

    const v3, 0xea60

    sub-int v2, v3, v2

    int-to-long v2, v2

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 280
    const-string v0, "AlarmActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "==once== send message alarm time"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 282
    :goto_0
    return-void
.end method

.method public onDestroy()V
    .locals 4

    .line 1166
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/dbf;->x(Landroid/content/Context;)V

    .line 1167
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onDestroy()V

    .line 1168
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->L:Landroid/os/Handler;

    const/16 v1, 0x64

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 1169
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->L:Landroid/os/Handler;

    const/16 v1, 0x66

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 1170
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->L:Landroid/os/Handler;

    const/16 v1, 0x68

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 1171
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->L:Landroid/os/Handler;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->S:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 1172
    const-string v0, "AlarmActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "==once== onDestroy"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1173
    return-void
.end method

.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/widget/AdapterView<*>;Landroid/view/View;IJ)V"
        }
    .end annotation

    .line 1034
    const-string v0, "AlarmActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onItemClick: position = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1035
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->v:Ljava/util/List;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->v:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 1036
    :cond_0
    const-string v0, "AlarmActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mEventAlarmItemList.size() == 0 or mEventAlarmItemList is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1037
    return-void

    .line 1039
    :cond_1
    const-string v0, "AlarmActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onItemClick: mEventAlarmItemList.size() = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->v:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1040
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->v:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge p3, v0, :cond_2

    .line 1041
    const-string v0, "AlarmActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mEventAlarmItemList.get(position)"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->v:Ljava/util/List;

    invoke-interface {v3, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1042
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->v:Ljava/util/List;

    invoke-interface {v0, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/eoo;

    .line 1043
    const-string v0, "AlarmActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "item =="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Lo/eoo;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "----"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Lo/eoo;->d()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "---"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Lo/eoo;->e()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1044
    new-instance v5, Landroid/content/Intent;

    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->c:Landroid/content/Context;

    const-class v1, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;

    invoke-direct {v5, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 1045
    const-string v0, "device_id"

    iget-object v1, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->K:Ljava/lang/String;

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 1046
    new-instance v6, Landroid/os/Bundle;

    invoke-direct {v6}, Landroid/os/Bundle;-><init>()V

    .line 1047
    const-string v0, "from_list_item"

    invoke-virtual {v6, v0, v4}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    .line 1048
    invoke-virtual {v5, v6}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 1049
    const/4 v0, 0x0

    invoke-virtual {p0, v5, v0}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 1050
    goto :goto_0

    .line 1052
    :cond_2
    const-string v0, "AlarmActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "position error"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1054
    :goto_0
    return-void
.end method

.method public onPause()V
    .locals 1

    .line 659
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onPause()V

    .line 660
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->A:Z

    .line 661
    return-void
.end method

.method public onResume()V
    .locals 4

    .line 650
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onResume()V

    .line 651
    const-string v0, "AlarmActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onResume()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 652
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->A:Z

    .line 654
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->f()V

    .line 655
    return-void
.end method

.method public onStop()V
    .locals 4

    .line 1157
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onStop()V

    .line 1158
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->L:Landroid/os/Handler;

    const/16 v1, 0x64

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 1159
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->L:Landroid/os/Handler;

    const/16 v1, 0x66

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 1160
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->L:Landroid/os/Handler;

    const/16 v1, 0x68

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 1161
    const-string v0, "AlarmActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "==once== onStop"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1162
    return-void
.end method
