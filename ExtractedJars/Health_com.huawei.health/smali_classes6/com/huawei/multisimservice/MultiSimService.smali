.class public Lcom/huawei/multisimservice/MultiSimService;
.super Landroid/app/Service;
.source "SourceFile"


# instance fields
.field a:Lo/dta;

.field private b:Ljava/lang/String;

.field private final c:Lo/dsu$d;

.field private final d:Lo/dsr$c;

.field e:Lo/dsw;

.field private final k:Lo/dst$d;


# direct methods
.method public constructor <init>()V
    .locals 4

    .line 53
    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    .line 46
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/multisimservice/MultiSimService;->b:Ljava/lang/String;

    .line 50
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/multisimservice/MultiSimService;->a:Lo/dta;

    .line 51
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/multisimservice/MultiSimService;->e:Lo/dsw;

    .line 75
    new-instance v0, Lcom/huawei/multisimservice/MultiSimService$1;

    invoke-direct {v0, p0}, Lcom/huawei/multisimservice/MultiSimService$1;-><init>(Lcom/huawei/multisimservice/MultiSimService;)V

    iput-object v0, p0, Lcom/huawei/multisimservice/MultiSimService;->c:Lo/dsu$d;

    .line 125
    new-instance v0, Lcom/huawei/multisimservice/MultiSimService$5;

    invoke-direct {v0, p0}, Lcom/huawei/multisimservice/MultiSimService$5;-><init>(Lcom/huawei/multisimservice/MultiSimService;)V

    iput-object v0, p0, Lcom/huawei/multisimservice/MultiSimService;->d:Lo/dsr$c;

    .line 189
    new-instance v0, Lcom/huawei/multisimservice/MultiSimService$3;

    invoke-direct {v0, p0}, Lcom/huawei/multisimservice/MultiSimService$3;-><init>(Lcom/huawei/multisimservice/MultiSimService;)V

    iput-object v0, p0, Lcom/huawei/multisimservice/MultiSimService;->k:Lo/dst$d;

    .line 54
    const-string v0, "MultiSimService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MultiSimService construct"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 55
    return-void
.end method

.method static synthetic b(Lcom/huawei/multisimservice/MultiSimService;)V
    .locals 0

    .line 43
    invoke-direct {p0}, Lcom/huawei/multisimservice/MultiSimService;->e()V

    return-void
.end method

.method static synthetic c(Lcom/huawei/multisimservice/MultiSimService;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 43
    iput-object p1, p0, Lcom/huawei/multisimservice/MultiSimService;->b:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic c(Lcom/huawei/multisimservice/MultiSimService;)Lo/dst$d;
    .locals 1

    .line 43
    iget-object v0, p0, Lcom/huawei/multisimservice/MultiSimService;->k:Lo/dst$d;

    return-object v0
.end method

.method static synthetic d(Lcom/huawei/multisimservice/MultiSimService;)Ljava/lang/String;
    .locals 1

    .line 43
    iget-object v0, p0, Lcom/huawei/multisimservice/MultiSimService;->b:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic e(Lcom/huawei/multisimservice/MultiSimService;)Lo/dsr$c;
    .locals 1

    .line 43
    iget-object v0, p0, Lcom/huawei/multisimservice/MultiSimService;->d:Lo/dsr$c;

    return-object v0
.end method

.method private e()V
    .locals 5

    .line 109
    const-string v0, "MultiSimService"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getDeviceInfoAndAuth with app:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/multisimservice/MultiSimService;->b:Ljava/lang/String;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 110
    invoke-static {}, Lo/div;->c()Lo/div;

    move-result-object v4

    .line 111
    if-nez v4, :cond_0

    .line 112
    const-string v0, "MultiSimService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getDeviceInfoAndAuth  get HWMultiSimMgr null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 113
    return-void

    .line 116
    :cond_0
    iget-object v0, p0, Lcom/huawei/multisimservice/MultiSimService;->b:Ljava/lang/String;

    invoke-virtual {v4, v0}, Lo/div;->e(Ljava/lang/String;)V

    .line 117
    iget-object v0, p0, Lcom/huawei/multisimservice/MultiSimService;->e:Lo/dsw;

    if-eqz v0, :cond_1

    .line 118
    iget-object v0, p0, Lcom/huawei/multisimservice/MultiSimService;->e:Lo/dsw;

    invoke-virtual {v4, v0}, Lo/div;->d(Lo/dsw;)V

    goto :goto_0

    .line 119
    :cond_1
    iget-object v0, p0, Lcom/huawei/multisimservice/MultiSimService;->a:Lo/dta;

    if-eqz v0, :cond_2

    .line 120
    iget-object v0, p0, Lcom/huawei/multisimservice/MultiSimService;->a:Lo/dta;

    invoke-virtual {v4, v0}, Lo/div;->d(Lo/dta;)V

    .line 122
    :cond_2
    :goto_0
    invoke-virtual {v4}, Lo/div;->b()V

    .line 123
    return-void
.end method


# virtual methods
.method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 4

    .line 59
    const-string v0, "MultiSimService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onBind service "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 60
    iget-object v0, p0, Lcom/huawei/multisimservice/MultiSimService;->c:Lo/dsu$d;

    return-object v0
.end method

.method public onUnbind(Landroid/content/Intent;)Z
    .locals 2

    .line 66
    invoke-super {p0, p1}, Landroid/app/Service;->onUnbind(Landroid/content/Intent;)Z

    move-result v1

    .line 67
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/multisimservice/MultiSimService;->b:Ljava/lang/String;

    .line 68
    return v1
.end method
