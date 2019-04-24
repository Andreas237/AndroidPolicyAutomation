.class public Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity$e;,
        Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity$b;,
        Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity$a;
    }
.end annotation


# static fields
.field private static final e:Ljava/lang/String;


# instance fields
.field private a:Lo/cmj;

.field private b:I

.field private c:Z

.field private d:Landroid/hardware/SensorManager;

.field private f:I

.field private g:I

.field private h:I

.field private i:I

.field private k:I

.field private l:Landroid/os/Handler;

.field private m:Landroid/widget/TextView;

.field private n:Landroid/widget/TextView;

.field private o:Ljava/lang/String;

.field private p:Landroid/widget/TextView;

.field private q:Landroid/widget/TextView;

.field private r:Landroid/widget/TextView;

.field private s:Landroid/widget/TextView;

.field private t:Landroid/widget/TextView;

.field private u:Landroid/widget/TextView;

.field private v:Landroid/hardware/SensorEventListener;

.field private w:Landroid/widget/LinearLayout;

.field private x:Lo/cmo;

.field private z:Landroid/widget/TextView;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 34
    const-class v0, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;->e:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 33
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    .line 42
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;->a:Lo/cmj;

    .line 44
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;->c:Z

    .line 46
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;->b:I

    .line 47
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;->f:I

    .line 48
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;->i:I

    .line 49
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;->g:I

    .line 50
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;->h:I

    .line 51
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;->k:I

    .line 52
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;->o:Ljava/lang/String;

    .line 207
    new-instance v0, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity$a;

    invoke-direct {v0, p0, p0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity$a;-><init>(Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;->v:Landroid/hardware/SensorEventListener;

    .line 235
    new-instance v0, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity$4;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity$4;-><init>(Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;->x:Lo/cmo;

    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;I)I
    .locals 0

    .line 33
    iput p1, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;->g:I

    return p1
.end method

.method private a()V
    .locals 4

    .line 182
    sget-object v0, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initStandardSensor()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 183
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "sensor"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/hardware/SensorManager;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;->d:Landroid/hardware/SensorManager;

    .line 184
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;->f()V

    .line 185
    return-void
.end method

.method private a(ILjava/lang/Object;)V
    .locals 5

    .line 262
    sget-object v0, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "sendHandlerMsg msgwhat:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 263
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;->l:Landroid/os/Handler;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 264
    sget-object v0, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "sendHandlerMsg null == mHandler"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 265
    return-void

    .line 267
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;->l:Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v4

    .line 268
    iput p1, v4, Landroid/os/Message;->what:I

    .line 269
    const/4 v0, 0x0

    if-eq v0, p2, :cond_1

    .line 270
    iput-object p2, v4, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 272
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;->l:Landroid/os/Handler;

    invoke-virtual {v0, v4}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 273
    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;)V
    .locals 0

    .line 33
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;->i()V

    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;ILjava/lang/Object;)V
    .locals 0

    .line 33
    invoke-direct {p0, p1, p2}, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;->a(ILjava/lang/Object;)V

    return-void
.end method

.method static synthetic b(Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;I)I
    .locals 0

    .line 33
    iput p1, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;->f:I

    return p1
.end method

.method static synthetic b(Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;)Lo/cmj;
    .locals 1

    .line 33
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;->a:Lo/cmj;

    return-object v0
.end method

.method private b()V
    .locals 1

    .line 96
    sget v0, Lcom/huawei/ui/main/R$id;->tv_support_content:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;->m:Landroid/widget/TextView;

    .line 97
    sget v0, Lcom/huawei/ui/main/R$id;->tv_decive_class_content:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;->n:Landroid/widget/TextView;

    .line 98
    sget v0, Lcom/huawei/ui/main/R$id;->tv_standard_base_content:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;->p:Landroid/widget/TextView;

    .line 99
    sget v0, Lcom/huawei/ui/main/R$id;->tv_restart_steps_content:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;->u:Landroid/widget/TextView;

    .line 100
    sget v0, Lcom/huawei/ui/main/R$id;->tv_other_steps_content:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;->q:Landroid/widget/TextView;

    .line 101
    sget v0, Lcom/huawei/ui/main/R$id;->tv_sensor_report_steps_content:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;->s:Landroid/widget/TextView;

    .line 102
    sget v0, Lcom/huawei/ui/main/R$id;->tv_ui_total_steps_content:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;->t:Landroid/widget/TextView;

    .line 103
    sget v0, Lcom/huawei/ui/main/R$id;->tv_db_steps_content:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;->r:Landroid/widget/TextView;

    .line 104
    sget v0, Lcom/huawei/ui/main/R$id;->tv_cache_steps_content:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;->z:Landroid/widget/TextView;

    .line 105
    sget v0, Lcom/huawei/ui/main/R$id;->ll_service_restart_record_content:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;->w:Landroid/widget/LinearLayout;

    .line 106
    return-void
.end method

.method static synthetic b(Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;Z)Z
    .locals 0

    .line 33
    iput-boolean p1, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;->c:Z

    return p1
.end method

.method static synthetic c(Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;I)I
    .locals 0

    .line 33
    iput p1, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;->b:I

    return p1
.end method

.method private c()V
    .locals 4

    .line 109
    new-instance v0, Lo/cmj;

    invoke-direct {v0}, Lo/cmj;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;->a:Lo/cmj;

    .line 110
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;->a:Lo/cmj;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    new-instance v2, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity$3;

    invoke-direct {v2, p0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity$3;-><init>(Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;)V

    const-string v3, "HuaweiHealth"

    invoke-virtual {v0, v1, v2, v3}, Lo/cmj;->a(Landroid/content/Context;Lo/cmo;Ljava/lang/String;)I

    .line 179
    return-void
.end method

.method static synthetic c(Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;)Z
    .locals 1

    .line 33
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;->g()Z

    move-result v0

    return v0
.end method

.method static synthetic d(Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;I)I
    .locals 0

    .line 33
    iput p1, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;->i:I

    return p1
.end method

.method static synthetic d(Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 33
    iput-object p1, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;->o:Ljava/lang/String;

    return-object p1
.end method

.method private d()V
    .locals 4

    .line 188
    sget-object v0, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "destoryStandardSensor()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 189
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;->k()V

    .line 190
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;->d:Landroid/hardware/SensorManager;

    .line 191
    return-void
.end method

.method static synthetic d(Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;)Z
    .locals 1

    .line 33
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;->c:Z

    return v0
.end method

.method static synthetic e(Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;I)I
    .locals 0

    .line 33
    iput p1, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;->k:I

    return p1
.end method

.method static synthetic e(Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;)Landroid/widget/TextView;
    .locals 1

    .line 33
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;->m:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic e()Ljava/lang/String;
    .locals 1

    .line 33
    sget-object v0, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;->e:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic f(Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;)Landroid/widget/TextView;
    .locals 1

    .line 33
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;->n:Landroid/widget/TextView;

    return-object v0
.end method

.method private f()V
    .locals 5

    .line 195
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;->d:Landroid/hardware/SensorManager;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;->v:Landroid/hardware/SensorEventListener;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;->d:Landroid/hardware/SensorManager;

    .line 196
    const/16 v3, 0x13

    invoke-virtual {v2, v3}, Landroid/hardware/SensorManager;->getDefaultSensor(I)Landroid/hardware/Sensor;

    move-result-object v2

    .line 195
    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Landroid/hardware/SensorManager;->registerListener(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;I)Z

    move-result v4

    .line 197
    sget-object v0, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " doRegisterSensors registerListener"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 198
    return-void
.end method

.method static synthetic g(Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;)Lo/cmo;
    .locals 1

    .line 33
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;->x:Lo/cmo;

    return-object v0
.end method

.method private g()Z
    .locals 6

    .line 336
    sget-object v0, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isSupportFloor()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 337
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "sensor"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/hardware/SensorManager;

    .line 338
    const/4 v0, 0x6

    invoke-virtual {v4, v0}, Landroid/hardware/SensorManager;->getDefaultSensor(I)Landroid/hardware/Sensor;

    move-result-object v5

    .line 339
    const/4 v0, 0x0

    if-ne v0, v5, :cond_0

    .line 340
    const/4 v0, 0x0

    return v0

    .line 342
    :cond_0
    const/4 v0, 0x1

    return v0
.end method

.method static synthetic h(Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;)I
    .locals 1

    .line 33
    iget v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;->g:I

    return v0
.end method

.method static synthetic i(Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;)I
    .locals 1

    .line 33
    iget v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;->b:I

    return v0
.end method

.method private i()V
    .locals 7

    .line 350
    sget-object v0, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "readDataFromDB() enter..."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 351
    new-instance v4, Lcom/huawei/hihealth/HiAggregateOption;

    invoke-direct {v4}, Lcom/huawei/hihealth/HiAggregateOption;-><init>()V

    .line 352
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/cnk;->d(J)J

    move-result-wide v5

    .line 353
    invoke-virtual {v4, v5, v6}, Lcom/huawei/hihealth/HiAggregateOption;->setStartTime(J)V

    .line 354
    const-wide/32 v0, 0x5265c00

    add-long/2addr v0, v5

    const-wide/16 v2, 0x1

    sub-long/2addr v0, v2

    invoke-virtual {v4, v0, v1}, Lcom/huawei/hihealth/HiAggregateOption;->setEndTime(J)V

    .line 355
    const/4 v0, 0x6

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setType([I)V

    .line 361
    const/4 v0, 0x6

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "walk_step"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "run_step"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, "climb_step"

    const/4 v2, 0x2

    aput-object v1, v0, v2

    const-string v1, "step_sum"

    const/4 v2, 0x3

    aput-object v1, v0, v2

    const-string v1, "calorie_sum"

    const/4 v2, 0x4

    aput-object v1, v0, v2

    const-string v1, "altitude_sum"

    const/4 v2, 0x5

    aput-object v1, v0, v2

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setConstantsKey([Ljava/lang/String;)V

    .line 362
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setAggregateType(I)V

    .line 363
    const/4 v0, 0x3

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setGroupUnitType(I)V

    .line 364
    sget-object v0, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "readDataFromDB..."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 365
    invoke-static {p0}, Lo/clq;->e(Landroid/content/Context;)Lo/clq;

    move-result-object v0

    new-instance v1, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity$e;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity$e;-><init>(Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity$3;)V

    invoke-virtual {v0, v4, v1}, Lo/clq;->b(Lcom/huawei/hihealth/HiAggregateOption;Lo/cly;)V

    .line 367
    return-void

    nop

    :array_0
    .array-data 4
        0x9c4b
        0x9c4c
        0x9c4d
        0x9c42
        0x9c43
        0x9c45
    .end array-data
.end method

.method static synthetic k(Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;I)I
    .locals 0

    .line 33
    iput p1, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;->h:I

    return p1
.end method

.method static synthetic k(Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;)Landroid/widget/TextView;
    .locals 1

    .line 33
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;->s:Landroid/widget/TextView;

    return-object v0
.end method

.method private k()V
    .locals 4

    .line 201
    sget-object v0, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "unRegisterSensor()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 202
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;->d:Landroid/hardware/SensorManager;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 203
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;->d:Landroid/hardware/SensorManager;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;->v:Landroid/hardware/SensorEventListener;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;->d:Landroid/hardware/SensorManager;

    const/16 v3, 0x13

    invoke-virtual {v2, v3}, Landroid/hardware/SensorManager;->getDefaultSensor(I)Landroid/hardware/Sensor;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/hardware/SensorManager;->unregisterListener(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;)V

    .line 205
    :cond_0
    return-void
.end method

.method static synthetic l(Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;)Landroid/widget/TextView;
    .locals 1

    .line 33
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;->u:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic m(Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;)I
    .locals 1

    .line 33
    iget v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;->f:I

    return v0
.end method

.method static synthetic n(Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;)Landroid/widget/TextView;
    .locals 1

    .line 33
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;->t:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic o(Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;)I
    .locals 1

    .line 33
    iget v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;->i:I

    return v0
.end method

.method static synthetic p(Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;)Landroid/widget/TextView;
    .locals 1

    .line 33
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;->p:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic q(Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;)Landroid/widget/TextView;
    .locals 1

    .line 33
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;->z:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic r(Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;)Landroid/widget/TextView;
    .locals 1

    .line 33
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;->q:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic s(Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;)Landroid/widget/LinearLayout;
    .locals 1

    .line 33
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;->w:Landroid/widget/LinearLayout;

    return-object v0
.end method

.method static synthetic t(Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;)Ljava/lang/String;
    .locals 1

    .line 33
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;->o:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic u(Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;)I
    .locals 1

    .line 33
    iget v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;->k:I

    return v0
.end method

.method static synthetic x(Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;)I
    .locals 1

    .line 33
    iget v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;->h:I

    return v0
.end method

.method static synthetic z(Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;)Landroid/widget/TextView;
    .locals 1

    .line 33
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;->r:Landroid/widget/TextView;

    return-object v0
.end method


# virtual methods
.method public a(J)Ljava/lang/String;
    .locals 2

    .line 331
    new-instance v1, Ljava/text/SimpleDateFormat;

    const-string v0, "yyyy-MM-dd HH:mm:ss"

    invoke-direct {v1, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 332
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0, p1, p2}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v1, v0}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 79
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 80
    sget v0, Lcom/huawei/ui/main/R$layout;->hw_show_developer_stepcounter:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;->setContentView(I)V

    .line 81
    new-instance v0, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity$b;

    invoke-direct {v0, p0, p0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity$b;-><init>(Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;->l:Landroid/os/Handler;

    .line 82
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;->b()V

    .line 83
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;->c()V

    .line 84
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;->a()V

    .line 85
    return-void
.end method

.method public onDestroy()V
    .locals 1

    .line 89
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;->a:Lo/cmj;

    invoke-virtual {v0}, Lo/cmj;->d()V

    .line 90
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;->a:Lo/cmj;

    .line 91
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;->d()V

    .line 92
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onDestroy()V

    .line 93
    return-void
.end method
