.class public Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity$e;
    }
.end annotation


# instance fields
.field private A:I

.field private B:Ljava/lang/String;

.field private C:Landroid/os/Handler;

.field private D:Lo/egy;

.field private E:Z

.field private G:Landroid/widget/AdapterView$OnItemClickListener;

.field private H:Lo/fez;

.field private I:Lo/enh;

.field a:Z

.field private b:Lo/eoh;

.field private c:Landroid/widget/TextView;

.field private d:Lo/enz;

.field private e:Landroid/widget/TextView;

.field private f:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/datatype/SmartAlarmInfo;>;"
        }
    .end annotation
.end field

.field private g:Lo/eno;

.field private h:Landroid/widget/TextView;

.field private i:Landroid/widget/RelativeLayout;

.field private j:Lo/dqi;

.field private k:Landroid/content/Context;

.field private l:Lo/egw;

.field private m:Landroid/widget/TextView;

.field private n:[Ljava/lang/String;

.field private o:I

.field private p:Lo/eno;

.field private q:I

.field private r:Lo/emr;

.field private s:I

.field private t:I

.field private u:I

.field private v:Lo/egw;

.field private w:[Z

.field private x:I

.field private y:I

.field private z:[Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 74
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    .line 84
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->f:Ljava/util/List;

    .line 87
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->k:Landroid/content/Context;

    .line 90
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->g:Lo/eno;

    .line 91
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->p:Lo/eno;

    .line 97
    const/4 v0, 0x7

    new-array v0, v0, [Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->n:[Ljava/lang/String;

    .line 98
    const/16 v0, 0x1f

    iput v0, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->o:I

    .line 116
    const/4 v0, 0x5

    new-array v0, v0, [Z

    fill-array-data v0, :array_0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->w:[Z

    .line 117
    const/4 v0, 0x2

    iput v0, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->A:I

    .line 121
    new-instance v0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity$e;

    invoke-direct {v0, p0, p0}, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity$e;-><init>(Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->C:Landroid/os/Handler;

    .line 123
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->B:Ljava/lang/String;

    .line 124
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->a:Z

    .line 125
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->H:Lo/fez;

    .line 177
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->E:Z

    .line 604
    new-instance v0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity$4;

    invoke-direct {v0, p0}, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity$4;-><init>(Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->I:Lo/enh;

    .line 710
    new-instance v0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity$9;

    invoke-direct {v0, p0}, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity$9;-><init>(Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->G:Landroid/widget/AdapterView$OnItemClickListener;

    return-void

    :array_0
    .array-data 1
        0x0t
        0x0t
        0x1t
        0x0t
        0x0t
    .end array-data
.end method

.method static synthetic a(Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;I)I
    .locals 0

    .line 74
    iput p1, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->o:I

    return p1
.end method

.method static synthetic a(Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;)Lo/enz;
    .locals 1

    .line 74
    iget-object v0, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->d:Lo/enz;

    return-object v0
.end method

.method private a()V
    .locals 5

    .line 219
    iget-object v0, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->f:Ljava/util/List;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->f:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 220
    :cond_0
    new-instance v4, Lcom/huawei/datatype/SmartAlarmInfo;

    invoke-direct {v4}, Lcom/huawei/datatype/SmartAlarmInfo;-><init>()V

    .line 221
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->f:Ljava/util/List;

    .line 222
    iget-object v0, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->f:Ljava/util/List;

    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 224
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->f:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/datatype/SmartAlarmInfo;

    .line 225
    const-string v0, "SmartAlarmClockActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "initView mSmartAlarmList.size()"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->f:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 226
    invoke-virtual {v4}, Lcom/huawei/datatype/SmartAlarmInfo;->getSmartAlarmIndex()I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->t:I

    .line 227
    invoke-virtual {v4}, Lcom/huawei/datatype/SmartAlarmInfo;->getSmartAlarmEnable()I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->q:I

    .line 228
    invoke-virtual {v4}, Lcom/huawei/datatype/SmartAlarmInfo;->getSmartAlarmStartTime_hour()I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->s:I

    .line 229
    invoke-virtual {v4}, Lcom/huawei/datatype/SmartAlarmInfo;->getSmartAlarmStartTime_mins()I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->u:I

    .line 230
    invoke-virtual {v4}, Lcom/huawei/datatype/SmartAlarmInfo;->getSmartAlarmRepeat()I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->x:I

    .line 231
    invoke-virtual {v4}, Lcom/huawei/datatype/SmartAlarmInfo;->getSmartAlarmAheadTime()I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->y:I

    .line 232
    const-string v0, "SmartAlarmClockActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "initData smartAlarmIndex ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->t:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 233
    const-string v0, "SmartAlarmClockActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "initData smartAlarmEnable ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->q:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 234
    const-string v0, "SmartAlarmClockActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "initData smartAlarmStartHourTime = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->s:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 235
    const-string v0, "SmartAlarmClockActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "initData smartAlarmStartMinTime ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->u:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 236
    const-string v0, "SmartAlarmClockActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "initData smartAlarmRepeat ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->x:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 237
    const-string v0, "SmartAlarmClockActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "initData smartAlarmAheadTime ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->y:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 238
    iget v0, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->y:I

    invoke-direct {p0, v0}, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->a(I)V

    .line 239
    iget v0, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->x:I

    iput v0, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->o:I

    .line 240
    iget-object v0, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->C:Landroid/os/Handler;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 241
    return-void
.end method

.method private a(I)V
    .locals 4

    .line 748
    const-string v0, "SmartAlarmClockActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initAheadTime... aheadTime = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 750
    sparse-switch p1, :sswitch_data_0

    goto :goto_0

    .line 752
    :sswitch_0
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->b(I)V

    .line 753
    goto :goto_1

    .line 755
    :sswitch_1
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->b(I)V

    .line 756
    goto :goto_1

    .line 758
    :sswitch_2
    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->b(I)V

    .line 759
    goto :goto_1

    .line 761
    :sswitch_3
    const/4 v0, 0x3

    invoke-direct {p0, v0}, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->b(I)V

    .line 762
    goto :goto_1

    .line 764
    :sswitch_4
    const/4 v0, 0x4

    invoke-direct {p0, v0}, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->b(I)V

    .line 765
    goto :goto_1

    .line 767
    :goto_0
    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->b(I)V

    .line 770
    :goto_1
    return-void

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x5 -> :sswitch_1
        0xa -> :sswitch_2
        0x14 -> :sswitch_3
        0x1e -> :sswitch_4
    .end sparse-switch
.end method

.method static synthetic b(Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;I)I
    .locals 0

    .line 74
    iput p1, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->q:I

    return p1
.end method

.method private b()V
    .locals 4

    .line 244
    sget v0, Lcom/huawei/ui/device/R$id;->smart_alarm_title_bar:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emr;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->r:Lo/emr;

    .line 245
    iget-object v0, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->r:Lo/emr;

    new-instance v1, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity$7;

    invoke-direct {v1, p0}, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity$7;-><init>(Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;)V

    invoke-virtual {v0, v1}, Lo/emr;->setRightButtonOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 266
    iget-object v0, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->r:Lo/emr;

    new-instance v1, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity$8;

    invoke-direct {v1, p0}, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity$8;-><init>(Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;)V

    invoke-virtual {v0, v1}, Lo/emr;->setLeftButtonOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 277
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 278
    sget v0, Lcom/huawei/ui/device/R$id;->arrow:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/widget/ImageView;

    .line 279
    sget v0, Lcom/huawei/ui/device/R$mipmap;->ic_goal_arrow_left:I

    invoke-virtual {v2, v0}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 280
    sget v0, Lcom/huawei/ui/device/R$id;->settings_switch:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroid/widget/ImageView;

    .line 281
    sget v0, Lcom/huawei/ui/device/R$mipmap;->ic_goal_arrow_left:I

    invoke-virtual {v3, v0}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 283
    :cond_0
    sget v0, Lcom/huawei/ui/device/R$id;->smart_alarm__prompt_description:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->h:Landroid/widget/TextView;

    .line 284
    sget v0, Lcom/huawei/ui/device/R$id;->smart_alarm_ahead_time:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->c:Landroid/widget/TextView;

    .line 285
    sget v0, Lcom/huawei/ui/device/R$id;->smart_alarm_ahead_time_unit:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->e:Landroid/widget/TextView;

    .line 286
    sget v0, Lcom/huawei/ui/device/R$id;->event_alarm_repeat:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->m:Landroid/widget/TextView;

    .line 287
    sget v0, Lcom/huawei/ui/device/R$id;->smart_alarm_ahead_time_ll:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->i:Landroid/widget/RelativeLayout;

    .line 288
    iget-object v0, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->i:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 289
    sget v0, Lcom/huawei/ui/device/R$id;->smart_alarm_repeat_ll:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/widget/RelativeLayout;

    .line 290
    invoke-virtual {v2, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 291
    return-void
.end method

.method private b(I)V
    .locals 3

    .line 774
    const/4 v2, 0x0

    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->w:[Z

    array-length v0, v0

    if-ge v2, v0, :cond_0

    .line 775
    iget-object v0, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->w:[Z

    const/4 v1, 0x0

    aput-boolean v1, v0, v2

    .line 774
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 778
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->w:[Z

    const/4 v1, 0x1

    aput-boolean v1, v0, p1

    .line 779
    return-void
.end method

.method static synthetic b(Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;)V
    .locals 0

    .line 74
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->f()V

    return-void
.end method

.method static synthetic b(Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;Landroid/content/Context;)V
    .locals 0

    .line 74
    invoke-direct {p0, p1}, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->c(Landroid/content/Context;)V

    return-void
.end method

.method private c()V
    .locals 3

    .line 210
    iget-object v0, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->d:Lo/enz;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->B:Ljava/lang/String;

    new-instance v2, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity$6;

    invoke-direct {v2, p0}, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity$6;-><init>(Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;)V

    invoke-virtual {v0, v1, v2}, Lo/enz;->b(Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 217
    return-void
.end method

.method private c(II)V
    .locals 5

    .line 621
    const-string v0, "SmartAlarmClockActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "initAlarmPicker====="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "=="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 622
    sget v0, Lcom/huawei/ui/device/R$id;->hw_health_timepicker:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/fez;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->H:Lo/fez;

    .line 623
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v4

    .line 624
    iget-object v0, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->k:Landroid/content/Context;

    invoke-static {v0}, Landroid/text/format/DateFormat;->is24HourFormat(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 625
    iget-object v0, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->H:Lo/fez;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Lo/fez;->setTimeMode(I)V

    goto :goto_0

    .line 627
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->H:Lo/fez;

    const/4 v1, 0x6

    invoke-virtual {v0, v1}, Lo/fez;->setTimeMode(I)V

    .line 629
    :goto_0
    const-string v0, "SmartAlarmClockActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "zhaolisecond"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "=="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 630
    const/16 v0, 0xb

    invoke-virtual {v4, v0, p1}, Ljava/util/Calendar;->set(II)V

    .line 631
    const/16 v0, 0xc

    invoke-virtual {v4, v0, p2}, Ljava/util/Calendar;->set(II)V

    .line 632
    iget-object v0, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->k:Landroid/content/Context;

    invoke-static {v0}, Landroid/text/format/DateFormat;->is24HourFormat(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 633
    iget-object v0, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->H:Lo/fez;

    const/16 v1, 0x9

    invoke-virtual {v4, v1}, Ljava/util/Calendar;->get(I)I

    move-result v1

    invoke-virtual {v0, v1}, Lo/fez;->setSelectedApm(I)V

    .line 635
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->k:Landroid/content/Context;

    invoke-static {v0}, Landroid/text/format/DateFormat;->is24HourFormat(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_2

    const/16 v0, 0xc

    if-le p1, v0, :cond_2

    .line 636
    add-int/lit8 p1, p1, -0xc

    .line 638
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->H:Lo/fez;

    invoke-virtual {v0, p1}, Lo/fez;->setSelectedHour(I)V

    .line 639
    iget-object v0, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->H:Lo/fez;

    invoke-virtual {v0, p2}, Lo/fez;->setSelectedMinute(I)V

    .line 641
    return-void
.end method

.method private c(Landroid/content/Context;)V
    .locals 5

    .line 411
    const-string v0, "SmartAlarmClockActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showPromptSaveDialog()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 413
    new-instance v0, Lo/egy$b;

    invoke-direct {v0, p1}, Lo/egy$b;-><init>(Landroid/content/Context;)V

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_alarm_settings_save_changes:I

    .line 414
    invoke-virtual {v0, v1}, Lo/egy$b;->b(I)Lo/egy$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_save:I

    new-instance v2, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity$12;

    invoke-direct {v2, p0}, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity$12;-><init>(Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;)V

    .line 415
    invoke-virtual {v0, v1, v2}, Lo/egy$b;->d(ILandroid/view/View$OnClickListener;)Lo/egy$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_btn_discard:I

    new-instance v2, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity$14;

    invoke-direct {v2, p0}, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity$14;-><init>(Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;)V

    .line 427
    invoke-virtual {v0, v1, v2}, Lo/egy$b;->e(ILandroid/view/View$OnClickListener;)Lo/egy$b;

    move-result-object v4

    .line 435
    invoke-virtual {v4}, Lo/egy$b;->a()Lo/egy;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->D:Lo/egy;

    .line 436
    iget-object v0, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->D:Lo/egy;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egy;->setCancelable(Z)V

    .line 437
    iget-object v0, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->D:Lo/egy;

    invoke-virtual {v0}, Lo/egy;->show()V

    .line 438
    return-void
.end method

.method static synthetic c(Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;)V
    .locals 0

    .line 74
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->i()V

    return-void
.end method

.method static synthetic c(Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;I)V
    .locals 0

    .line 74
    invoke-direct {p0, p1}, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->b(I)V

    return-void
.end method

.method static synthetic d(Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;I)I
    .locals 0

    .line 74
    iput p1, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->A:I

    return p1
.end method

.method static synthetic d(Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;)V
    .locals 0

    .line 74
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->a()V

    return-void
.end method

.method static synthetic e(Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 74
    iput-object p1, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->f:Ljava/util/List;

    return-object p1
.end method

.method private e()V
    .locals 4

    .line 199
    const-string v0, "SmartAlarmClockActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getSmartAlarm()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 200
    iget-object v0, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->j:Lo/dqi;

    new-instance v1, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity$3;

    invoke-direct {v1, p0}, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity$3;-><init>(Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;)V

    invoke-virtual {v0, v1}, Lo/dqi;->a(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 208
    return-void
.end method

.method static synthetic e(Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;)Z
    .locals 1

    .line 74
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->k()Z

    move-result v0

    return v0
.end method

.method static synthetic f(Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;)Landroid/widget/TextView;
    .locals 1

    .line 74
    iget-object v0, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->m:Landroid/widget/TextView;

    return-object v0
.end method

.method private f()V
    .locals 13

    .line 441
    const-string v0, "SmartAlarmClockActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "updateSmartAlarmUI() mSmartAlarmList.size()"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->f:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 442
    iget-object v0, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->f:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 443
    return-void

    .line 445
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->f:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/datatype/SmartAlarmInfo;

    .line 447
    invoke-virtual {v5}, Lcom/huawei/datatype/SmartAlarmInfo;->getSmartAlarmStartTime_hour()I

    move-result v6

    .line 448
    invoke-virtual {v5}, Lcom/huawei/datatype/SmartAlarmInfo;->getSmartAlarmStartTime_mins()I

    move-result v7

    .line 451
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->H:Lo/fez;

    invoke-virtual {v1}, Lo/fez;->getSelectedHour()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->H:Lo/fez;

    invoke-virtual {v1}, Lo/fez;->getSelectedMinute()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    .line 453
    iget-object v0, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->k:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_settings_about_huawei_cloud_service_action_turn_off:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v9

    .line 454
    invoke-virtual {v5}, Lcom/huawei/datatype/SmartAlarmInfo;->getSmartAlarmAheadTime()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 455
    iget-object v0, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->c:Landroid/widget/TextView;

    invoke-virtual {v0, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 456
    iget-object v0, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->e:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0

    .line 458
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->c:Landroid/widget/TextView;

    iget v1, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->y:I

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 459
    iget-object v0, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->e:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 462
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->b:Lo/eoh;

    invoke-virtual {v5}, Lcom/huawei/datatype/SmartAlarmInfo;->getSmartAlarmAheadTime()I

    move-result v1

    invoke-virtual {v0, v6, v7, v1}, Lo/eoh;->e(III)I

    move-result v10

    .line 463
    iget-object v0, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->b:Lo/eoh;

    iget-object v0, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->k:Landroid/content/Context;

    invoke-static {v0, v10}, Lo/eoh;->c(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object v11

    .line 465
    iget-object v0, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->m:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->b:Lo/eoh;

    iget v2, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->o:I

    invoke-virtual {v1, v2}, Lo/eoh;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 467
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->o()I

    move-result v12

    .line 469
    if-nez v12, :cond_2

    .line 474
    iget-object v0, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->h:Landroid/widget/TextView;

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_1

    .line 476
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->h:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->k:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/device/R$string;->IDS_settings_alarm_prompt_new_health:I

    .line 477
    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x3

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v11, v2, v3

    const/4 v3, 0x1

    aput-object v8, v2, v3

    iget-object v3, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->d:Lo/enz;

    iget-object v4, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->B:Ljava/lang/String;

    .line 480
    invoke-virtual {v3, v4}, Lo/enz;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x2

    aput-object v3, v2, v4

    .line 476
    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 482
    :goto_1
    return-void
.end method

.method static synthetic g(Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;)I
    .locals 1

    .line 74
    iget v0, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->q:I

    return v0
.end method

.method private g()V
    .locals 9

    .line 364
    iget v0, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->o:I

    invoke-static {v0}, Ljava/lang/Integer;->toBinaryString(I)Ljava/lang/String;

    move-result-object v3

    .line 365
    iget-object v0, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->b:Lo/eoh;

    const/4 v1, 0x7

    invoke-virtual {v0, v3, v1}, Lo/eoh;->a(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v4

    .line 366
    const/4 v0, 0x7

    new-array v5, v0, [Z

    const/4 v0, 0x6

    invoke-virtual {v4, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v1, 0x31

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const/4 v1, 0x0

    aput-boolean v0, v5, v1

    const/4 v0, 0x5

    invoke-virtual {v4, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v1, 0x31

    if-ne v0, v1, :cond_1

    const/4 v0, 0x1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    const/4 v1, 0x1

    aput-boolean v0, v5, v1

    .line 367
    const/4 v0, 0x4

    invoke-virtual {v4, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v1, 0x31

    if-ne v0, v1, :cond_2

    const/4 v0, 0x1

    goto :goto_2

    :cond_2
    const/4 v0, 0x0

    :goto_2
    const/4 v1, 0x2

    aput-boolean v0, v5, v1

    const/4 v0, 0x3

    invoke-virtual {v4, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v1, 0x31

    if-ne v0, v1, :cond_3

    const/4 v0, 0x1

    goto :goto_3

    :cond_3
    const/4 v0, 0x0

    :goto_3
    const/4 v1, 0x3

    aput-boolean v0, v5, v1

    const/4 v0, 0x2

    invoke-virtual {v4, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v1, 0x31

    if-ne v0, v1, :cond_4

    const/4 v0, 0x1

    goto :goto_4

    :cond_4
    const/4 v0, 0x0

    :goto_4
    const/4 v1, 0x4

    aput-boolean v0, v5, v1

    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v1, 0x31

    if-ne v0, v1, :cond_5

    const/4 v0, 0x1

    goto :goto_5

    :cond_5
    const/4 v0, 0x0

    :goto_5
    const/4 v1, 0x5

    aput-boolean v0, v5, v1

    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v1, 0x31

    if-ne v0, v1, :cond_6

    const/4 v0, 0x1

    goto :goto_6

    :cond_6
    const/4 v0, 0x0

    :goto_6
    const/4 v1, 0x6

    aput-boolean v0, v5, v1

    .line 368
    const/4 v0, 0x7

    new-array v0, v0, [Ljava/lang/String;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->k:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/device/R$string;->IDS_monday:I

    .line 369
    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    iget-object v1, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->k:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/device/R$string;->IDS_tuesday:I

    .line 370
    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    iget-object v1, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->k:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/device/R$string;->IDS_wednesday:I

    .line 371
    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    iget-object v1, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->k:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/device/R$string;->IDS_thursday:I

    .line 372
    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x3

    aput-object v1, v0, v2

    iget-object v1, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->k:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/device/R$string;->IDS_friday:I

    .line 373
    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x4

    aput-object v1, v0, v2

    iget-object v1, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->k:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/device/R$string;->IDS_saturday:I

    .line 374
    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x5

    aput-object v1, v0, v2

    iget-object v1, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->k:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/device/R$string;->IDS_sunday:I

    .line 375
    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x6

    aput-object v1, v0, v2

    iput-object v0, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->n:[Ljava/lang/String;

    .line 378
    new-instance v6, Lo/egh;

    iget-object v0, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->k:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->n:[Ljava/lang/String;

    invoke-direct {v6, v0, v1, v5}, Lo/egh;-><init>(Landroid/content/Context;[Ljava/lang/String;[Z)V

    .line 379
    new-instance v7, Landroid/widget/ListView;

    iget-object v0, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->k:Landroid/content/Context;

    invoke-direct {v7, v0}, Landroid/widget/ListView;-><init>(Landroid/content/Context;)V

    .line 380
    const/4 v0, 0x0

    invoke-virtual {v7, v0}, Landroid/widget/ListView;->setDivider(Landroid/graphics/drawable/Drawable;)V

    .line 381
    invoke-virtual {v7, v6}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 382
    new-instance v0, Lo/egh$b;

    invoke-direct {v0}, Lo/egh$b;-><init>()V

    invoke-virtual {v7, v0}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 384
    new-instance v8, Lo/egw$c;

    invoke-direct {v8, p0}, Lo/egw$c;-><init>(Landroid/content/Context;)V

    .line 386
    sget v0, Lcom/huawei/ui/device/R$string;->IDS_settings_repeat:I

    invoke-virtual {v8, v0}, Lo/egw$c;->e(I)Lo/egw$c;

    move-result-object v0

    .line 387
    invoke-virtual {v0, v7}, Lo/egw$c;->e(Landroid/view/View;)Lo/egw$c;

    move-result-object v0

    .line 388
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/device/R$string;->IDS_settings_button_ok:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity$15;

    invoke-direct {v2, p0, v6}, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity$15;-><init>(Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;Lo/egh;)V

    invoke-virtual {v0, v1, v2}, Lo/egw$c;->a(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egw$c;

    move-result-object v0

    .line 396
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/device/R$string;->IDS_settings_button_cancal:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity$10;

    invoke-direct {v2, p0}, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity$10;-><init>(Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;)V

    invoke-virtual {v0, v1, v2}, Lo/egw$c;->c(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egw$c;

    move-result-object v0

    .line 401
    invoke-virtual {v0}, Lo/egw$c;->e()Lo/egw;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->l:Lo/egw;

    .line 402
    iget-object v0, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->l:Lo/egw;

    invoke-virtual {v0}, Lo/egw;->show()V

    .line 403
    return-void
.end method

.method static synthetic h(Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;)Ljava/util/List;
    .locals 1

    .line 74
    iget-object v0, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->f:Ljava/util/List;

    return-object v0
.end method

.method private h()V
    .locals 6

    .line 307
    new-instance v3, Landroid/content/Intent;

    invoke-direct {v3}, Landroid/content/Intent;-><init>()V

    .line 308
    new-instance v4, Landroid/os/Bundle;

    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    .line 309
    const-string v0, "smart_time"

    iget-object v1, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->H:Lo/fez;

    invoke-virtual {v1}, Lo/fez;->getSelectedHour()I

    move-result v1

    mul-int/lit8 v1, v1, 0x64

    iget-object v2, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->H:Lo/fez;

    invoke-virtual {v2}, Lo/fez;->getSelectedMinute()I

    move-result v2

    add-int/2addr v1, v2

    invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 310
    const-string v0, "ahead_time"

    iget-object v1, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->c:Landroid/widget/TextView;

    invoke-virtual {v1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 311
    iget v5, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->o:I

    .line 312
    const-string v0, "week_day"

    invoke-virtual {v4, v0, v5}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 313
    invoke-virtual {v3, v4}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 314
    const/16 v0, 0xa

    invoke-virtual {p0, v0, v3}, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->setResult(ILandroid/content/Intent;)V

    .line 315
    return-void
.end method

.method static synthetic i(Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;)Lo/eoh;
    .locals 1

    .line 74
    iget-object v0, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->b:Lo/eoh;

    return-object v0
.end method

.method private i()V
    .locals 4

    .line 488
    const-string v0, "SmartAlarmClockActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveUIData()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 489
    iget-object v0, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->c:Landroid/widget/TextView;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 490
    return-void

    .line 492
    :cond_0
    iget-boolean v0, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->a:Z

    if-eqz v0, :cond_1

    .line 493
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->d()V

    .line 494
    return-void

    .line 497
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->j:Lo/dqi;

    new-instance v1, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity$11;

    invoke-direct {v1, p0}, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity$11;-><init>(Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;)V

    invoke-virtual {v0, v1}, Lo/dqi;->a(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 551
    return-void
.end method

.method static synthetic k(Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;)Lo/egy;
    .locals 1

    .line 74
    iget-object v0, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->D:Lo/egy;

    return-object v0
.end method

.method private k()Z
    .locals 8

    .line 341
    iget-object v0, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->H:Lo/fez;

    invoke-virtual {v0}, Lo/fez;->getSelectedHour()I

    move-result v0

    mul-int/lit8 v0, v0, 0x64

    iget-object v1, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->H:Lo/fez;

    invoke-virtual {v1}, Lo/fez;->getSelectedMinute()I

    move-result v1

    add-int v4, v0, v1

    .line 343
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->o()I

    move-result v5

    .line 344
    const-string v0, "SmartAlarmClockActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isSmartClockChanged() aheadTime="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 345
    iget-object v0, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->f:Ljava/util/List;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->f:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 346
    :cond_0
    const/4 v0, 0x0

    return v0

    .line 348
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->f:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/datatype/SmartAlarmInfo;

    .line 350
    invoke-virtual {v6}, Lcom/huawei/datatype/SmartAlarmInfo;->getSmartAlarmStartTime_hour()I

    move-result v0

    mul-int/lit8 v0, v0, 0x64

    invoke-virtual {v6}, Lcom/huawei/datatype/SmartAlarmInfo;->getSmartAlarmStartTime_mins()I

    move-result v1

    add-int v7, v0, v1

    .line 351
    if-ne v4, v7, :cond_2

    iget v0, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->o:I

    invoke-virtual {v6}, Lcom/huawei/datatype/SmartAlarmInfo;->getSmartAlarmRepeat()I

    move-result v1

    if-ne v0, v1, :cond_2

    .line 352
    invoke-virtual {v6}, Lcom/huawei/datatype/SmartAlarmInfo;->getSmartAlarmAheadTime()I

    move-result v0

    if-ne v5, v0, :cond_2

    .line 353
    const-string v0, "SmartAlarmClockActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveUIData() return with nothing changed!!!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 354
    const/4 v0, 0x0

    return v0

    .line 356
    :cond_2
    const/4 v0, 0x1

    iput v0, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->q:I

    .line 357
    const/4 v0, 0x1

    return v0
.end method

.method static synthetic l(Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;)Ljava/lang/String;
    .locals 1

    .line 74
    iget-object v0, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->B:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic m(Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;)I
    .locals 1

    .line 74
    iget v0, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->o:I

    return v0
.end method

.method private m()V
    .locals 11

    .line 673
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 674
    return-void

    .line 677
    :cond_0
    const/4 v0, 0x5

    new-array v7, v0, [Ljava/lang/String;

    iget-object v0, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->k:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_settings_about_huawei_cloud_service_action_turn_off:I

    .line 678
    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v7, v1

    .line 679
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_hw_show_set_target_sport_time_unit:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    .line 680
    const-wide/high16 v3, 0x4014000000000000L    # 5.0

    const/4 v5, 0x1

    const/4 v6, 0x0

    invoke-static {v3, v4, v5, v6}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    .line 679
    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v7, v1

    .line 681
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_hw_show_set_target_sport_time_unit:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    .line 682
    const-wide/high16 v3, 0x4024000000000000L    # 10.0

    const/4 v5, 0x1

    const/4 v6, 0x0

    invoke-static {v3, v4, v5, v6}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    .line 681
    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    aput-object v0, v7, v1

    .line 683
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_hw_show_set_target_sport_time_unit:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    .line 684
    const-wide/high16 v3, 0x4034000000000000L    # 20.0

    const/4 v5, 0x1

    const/4 v6, 0x0

    invoke-static {v3, v4, v5, v6}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    .line 683
    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x3

    aput-object v0, v7, v1

    .line 685
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_hw_show_set_target_sport_time_unit:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    .line 686
    const-wide/high16 v3, 0x403e000000000000L    # 30.0

    const/4 v5, 0x1

    const/4 v6, 0x0

    invoke-static {v3, v4, v5, v6}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    .line 685
    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x4

    aput-object v0, v7, v1

    .line 689
    new-instance v8, Lo/egf;

    iget-object v0, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->k:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->w:[Z

    iget-object v2, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->G:Landroid/widget/AdapterView$OnItemClickListener;

    invoke-direct {v8, v0, v7, v1, v2}, Lo/egf;-><init>(Landroid/content/Context;[Ljava/lang/String;[ZLandroid/widget/AdapterView$OnItemClickListener;)V

    .line 690
    new-instance v9, Landroid/widget/ListView;

    iget-object v0, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->k:Landroid/content/Context;

    invoke-direct {v9, v0}, Landroid/widget/ListView;-><init>(Landroid/content/Context;)V

    .line 691
    const/4 v0, 0x0

    invoke-virtual {v9, v0}, Landroid/widget/ListView;->setDivider(Landroid/graphics/drawable/Drawable;)V

    .line 692
    invoke-virtual {v9, v8}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 693
    iget-object v0, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->G:Landroid/widget/AdapterView$OnItemClickListener;

    invoke-virtual {v9, v0}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 695
    new-instance v10, Lo/egw$c;

    invoke-direct {v10, p0}, Lo/egw$c;-><init>(Landroid/content/Context;)V

    .line 697
    sget v0, Lcom/huawei/ui/device/R$string;->IDS_settings_ahead_of_time:I

    invoke-virtual {v10, v0}, Lo/egw$c;->e(I)Lo/egw$c;

    move-result-object v0

    .line 698
    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v0, v9, v1, v2}, Lo/egw$c;->b(Landroid/view/View;II)Lo/egw$c;

    move-result-object v0

    .line 699
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/device/R$string;->IDS_settings_button_cancal:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity$2;

    invoke-direct {v2, p0}, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity$2;-><init>(Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;)V

    invoke-virtual {v0, v1, v2}, Lo/egw$c;->c(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egw$c;

    move-result-object v0

    .line 705
    invoke-virtual {v0}, Lo/egw$c;->e()Lo/egw;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->v:Lo/egw;

    .line 706
    iget-object v0, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->v:Lo/egw;

    invoke-virtual {v0}, Lo/egw;->show()V

    .line 707
    const-string v0, "SmartAlarmClockActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showSamrtWakeDialog()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 708
    return-void
.end method

.method static synthetic n(Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;)Landroid/content/Context;
    .locals 1

    .line 74
    iget-object v0, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->k:Landroid/content/Context;

    return-object v0
.end method

.method private n()V
    .locals 2

    .line 740
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->v:Lo/egw;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 741
    iget-object v0, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->v:Lo/egw;

    invoke-virtual {v0}, Lo/egw;->cancel()V

    .line 742
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->v:Lo/egw;

    .line 744
    :cond_0
    return-void
.end method

.method private o()I
    .locals 7

    .line 590
    iget-object v0, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->k:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_settings_about_huawei_cloud_service_action_turn_off:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 591
    iget-object v0, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->c:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v5

    .line 592
    const-string v0, "SmartAlarmClockActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getAheadTime() strAheadText="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 593
    const/4 v6, 0x0

    .line 594
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 595
    invoke-static {v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v6

    .line 597
    :cond_0
    return v6
.end method

.method static synthetic o(Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;)I
    .locals 1

    .line 74
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->o()I

    move-result v0

    return v0
.end method

.method static synthetic p(Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;)Lo/fez;
    .locals 1

    .line 74
    iget-object v0, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->H:Lo/fez;

    return-object v0
.end method

.method private p()V
    .locals 10

    .line 647
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->o()I

    move-result v5

    .line 648
    const-string v0, "SmartAlarmClockActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "modifyPrompt interval="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 651
    iget-object v0, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->H:Lo/fez;

    invoke-virtual {v0}, Lo/fez;->getSelectedHour()I

    move-result v0

    mul-int/lit8 v0, v0, 0x64

    iget-object v1, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->H:Lo/fez;

    invoke-virtual {v1}, Lo/fez;->getSelectedMinute()I

    move-result v1

    add-int v6, v0, v1

    .line 652
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->H:Lo/fez;

    invoke-virtual {v1}, Lo/fez;->getSelectedHour()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->H:Lo/fez;

    invoke-virtual {v1}, Lo/fez;->getSelectedMinute()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    .line 654
    iget-object v0, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->b:Lo/eoh;

    div-int/lit8 v1, v6, 0x64

    rem-int/lit8 v2, v6, 0x64

    invoke-virtual {v0, v1, v2, v5}, Lo/eoh;->e(III)I

    move-result v8

    .line 655
    iget-object v0, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->b:Lo/eoh;

    iget-object v0, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->k:Landroid/content/Context;

    invoke-static {v0, v8}, Lo/eoh;->c(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object v9

    .line 656
    if-nez v5, :cond_0

    .line 661
    iget-object v0, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->h:Landroid/widget/TextView;

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 663
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->h:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->k:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/device/R$string;->IDS_settings_alarm_prompt_new_health:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x3

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v9, v2, v3

    const/4 v3, 0x1

    aput-object v7, v2, v3

    iget-object v3, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->d:Lo/enz;

    iget-object v4, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->B:Ljava/lang/String;

    .line 666
    invoke-virtual {v3, v4}, Lo/enz;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x2

    aput-object v3, v2, v4

    .line 663
    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 668
    :goto_0
    return-void
.end method

.method static synthetic q(Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;)[Ljava/lang/String;
    .locals 1

    .line 74
    iget-object v0, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->z:[Ljava/lang/String;

    return-object v0
.end method

.method static synthetic r(Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;)V
    .locals 0

    .line 74
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->h()V

    return-void
.end method

.method static synthetic s(Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;)V
    .locals 0

    .line 74
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->n()V

    return-void
.end method

.method static synthetic t(Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;)V
    .locals 0

    .line 74
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->p()V

    return-void
.end method

.method static synthetic u(Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;)Z
    .locals 1

    .line 74
    iget-boolean v0, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->E:Z

    return v0
.end method

.method static synthetic w(Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;)I
    .locals 1

    .line 74
    iget v0, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->A:I

    return v0
.end method

.method static synthetic x(Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;)Landroid/widget/TextView;
    .locals 1

    .line 74
    iget-object v0, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->e:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic y(Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;)Landroid/widget/TextView;
    .locals 1

    .line 74
    iget-object v0, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->c:Landroid/widget/TextView;

    return-object v0
.end method


# virtual methods
.method public d()V
    .locals 10

    .line 553
    iget-object v0, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->k:Landroid/content/Context;

    const/16 v1, 0x2726

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "DEVICE_EVENT_ALARM_INFO"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 554
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 555
    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    new-instance v1, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity$1;

    invoke-direct {v1, p0}, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity$1;-><init>(Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;)V

    .line 556
    invoke-virtual {v1}, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity$1;->getType()Ljava/lang/reflect/Type;

    move-result-object v1

    .line 555
    invoke-virtual {v0, v4, v1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->f:Ljava/util/List;

    .line 558
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->f:Ljava/util/List;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    iget-object v0, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->f:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_2

    .line 559
    :cond_1
    new-instance v5, Lcom/huawei/datatype/SmartAlarmInfo;

    invoke-direct {v5}, Lcom/huawei/datatype/SmartAlarmInfo;-><init>()V

    .line 560
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->f:Ljava/util/List;

    .line 561
    iget-object v0, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->f:Ljava/util/List;

    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 564
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->H:Lo/fez;

    invoke-virtual {v0}, Lo/fez;->getSelectedHour()I

    move-result v0

    mul-int/lit8 v0, v0, 0x64

    iget-object v1, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->H:Lo/fez;

    invoke-virtual {v1}, Lo/fez;->getSelectedMinute()I

    move-result v1

    add-int v5, v0, v1

    .line 566
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->o()I

    move-result v6

    .line 567
    iget-object v0, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->f:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/datatype/SmartAlarmInfo;

    .line 569
    const/4 v8, 0x1

    .line 570
    div-int/lit8 v0, v5, 0x64

    invoke-virtual {v7, v0}, Lcom/huawei/datatype/SmartAlarmInfo;->setSmartAlarmStartTime_hour(I)V

    .line 571
    rem-int/lit8 v0, v5, 0x64

    invoke-virtual {v7, v0}, Lcom/huawei/datatype/SmartAlarmInfo;->setSmartAlarmStartTime_mins(I)V

    .line 572
    const-string v0, "SmartAlarmClockActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "saveUIData!"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    div-int/lit8 v3, v5, 0x64

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "------"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    rem-int/lit8 v3, v5, 0x64

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 573
    iget v0, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->o:I

    invoke-virtual {v7, v0}, Lcom/huawei/datatype/SmartAlarmInfo;->setSmartAlarmRepeat(I)V

    .line 574
    invoke-virtual {v7, v6}, Lcom/huawei/datatype/SmartAlarmInfo;->setSmartAlarmAheadTime(I)V

    .line 575
    invoke-virtual {v7, v8}, Lcom/huawei/datatype/SmartAlarmInfo;->setSmartAlarmEnable(I)V

    .line 576
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 577
    invoke-interface {v9, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 579
    iget-object v0, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->k:Landroid/content/Context;

    invoke-static {v0}, Lo/enz;->b(Landroid/content/Context;)Lo/enz;

    move-result-object v0

    invoke-virtual {v0, v9}, Lo/enz;->a(Ljava/util/List;)V

    .line 580
    iget-object v0, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->k:Landroid/content/Context;

    invoke-static {v0}, Lo/enz;->b(Landroid/content/Context;)Lo/enz;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->B:Ljava/lang/String;

    new-instance v2, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity$5;

    invoke-direct {v2, p0}, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity$5;-><init>(Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;)V

    invoke-virtual {v0, v1, v9, v2}, Lo/enz;->b(Ljava/lang/String;Ljava/util/List;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 587
    const-string v0, "SmartAlarmClockActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "saveUIData() setDBAlarmClock()="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v7}, Lcom/huawei/datatype/SmartAlarmInfo;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 588
    return-void
.end method

.method public onBackPressed()V
    .locals 0

    .line 295
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onBackPressed()V

    .line 296
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->finish()V

    .line 297
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 5

    .line 319
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v4

    .line 320
    sget v0, Lcom/huawei/ui/device/R$id;->smart_alarm_ahead_time_ll:I

    if-ne v4, v0, :cond_0

    .line 321
    const-string v0, "SmartAlarmClockActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onClick() id=ahead_time"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 322
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->m()V

    goto :goto_0

    .line 324
    :cond_0
    sget v0, Lcom/huawei/ui/device/R$id;->smart_alarm_repeat_ll:I

    if-ne v4, v0, :cond_1

    .line 325
    const-string v0, "SmartAlarmClockActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onClick() id=smart_repeat"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 326
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->g()V

    goto :goto_0

    .line 329
    :cond_1
    const-string v0, "SmartAlarmClockActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "i = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 332
    :goto_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 6

    .line 152
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 154
    sget v0, Lcom/huawei/ui/device/R$layout;->activity_alarm_smart_clock_black:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->setContentView(I)V

    .line 155
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->k:Landroid/content/Context;

    .line 156
    const-string v0, "SmartAlarmClockActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCreate()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 157
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->getIntent()Landroid/content/Intent;

    move-result-object v5

    .line 158
    const/4 v0, 0x0

    if-eq v0, v5, :cond_0

    .line 159
    const-string v0, "device_id"

    invoke-virtual {v5, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->B:Ljava/lang/String;

    .line 161
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->k:Landroid/content/Context;

    invoke-static {v0}, Lo/dqi;->b(Landroid/content/Context;)Lo/dqi;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->j:Lo/dqi;

    .line 162
    const/4 v0, 0x0

    invoke-static {v0}, Lo/enz;->b(Landroid/content/Context;)Lo/enz;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->d:Lo/enz;

    .line 163
    const/4 v0, 0x0

    invoke-static {v0}, Lo/eoh;->a(Landroid/content/Context;)Lo/eoh;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->b:Lo/eoh;

    .line 164
    const/4 v0, 0x5

    new-array v0, v0, [Ljava/lang/String;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->k:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/device/R$string;->IDS_settings_about_huawei_cloud_service_action_turn_off:I

    .line 165
    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    .line 166
    const-wide/high16 v1, 0x4014000000000000L    # 5.0

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    .line 167
    const-wide/high16 v1, 0x4024000000000000L    # 10.0

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    .line 168
    const-wide/high16 v1, 0x4034000000000000L    # 20.0

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x3

    aput-object v1, v0, v2

    .line 169
    const-wide/high16 v1, 0x403e000000000000L    # 30.0

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x4

    aput-object v1, v0, v2

    iput-object v0, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->z:[Ljava/lang/String;

    .line 171
    iget-object v0, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->B:Ljava/lang/String;

    invoke-static {v0}, Lo/czw;->e(Ljava/lang/String;)Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 172
    iget-object v0, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->B:Ljava/lang/String;

    invoke-static {v0}, Lo/czw;->e(Ljava/lang/String;)Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isChange_alarm()Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->a:Z

    .line 174
    :cond_1
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->b()V

    .line 175
    return-void
.end method

.method public onDestroy()V
    .locals 2

    .line 823
    iget-object v0, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->k:Landroid/content/Context;

    invoke-static {v0}, Lo/dbf;->x(Landroid/content/Context;)V

    .line 824
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onDestroy()V

    .line 825
    iget-object v0, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->C:Landroid/os/Handler;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 826
    iget-object v0, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->C:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 828
    :cond_0
    return-void
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 1

    .line 809
    const/4 v0, 0x4

    if-ne p1, v0, :cond_1

    .line 810
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->k()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 811
    invoke-direct {p0, p0}, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->c(Landroid/content/Context;)V

    goto :goto_0

    .line 813
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->finish()V

    .line 815
    :goto_0
    const/4 v0, 0x0

    return v0

    .line 817
    :cond_1
    invoke-super {p0, p1, p2}, Lcom/huawei/ui/commonui/base/BaseActivity;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result v0

    return v0
.end method

.method public onPause()V
    .locals 4

    .line 801
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onPause()V

    .line 802
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->E:Z

    .line 803
    const-string v0, "SmartAlarmClockActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onPause()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 804
    return-void
.end method

.method public onResume()V
    .locals 6

    .line 181
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onResume()V

    .line 182
    const-string v0, "SmartAlarmClockActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onResume()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 183
    const-string v0, "SmartAlarmClockActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "bIsSupportChangeAlarm() "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->a:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 184
    iget-boolean v0, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->a:Z

    if-eqz v0, :cond_0

    .line 185
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->c()V

    goto :goto_0

    .line 187
    :cond_0
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->e()V

    .line 190
    :goto_0
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->getIntent()Landroid/content/Intent;

    move-result-object v4

    .line 191
    const/4 v0, 0x0

    if-eq v0, v4, :cond_1

    .line 192
    const-string v0, "key_to_smart_alarm_activity"

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v5

    .line 193
    div-int/lit8 v0, v5, 0x64

    rem-int/lit8 v1, v5, 0x64

    invoke-direct {p0, v0, v1}, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->c(II)V

    .line 195
    :cond_1
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/device/activity/smartalarm/SmartAlarmClockActivity;->E:Z

    .line 196
    return-void
.end method
