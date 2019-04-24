.class public Lcom/unionpay/blepayservice/PayService;
.super Landroid/app/Service;
.source "SourceFile"


# instance fields
.field private b:I

.field private c:Landroid/content/Context;

.field private final d:Lo/fki$d;

.field private final e:Lo/fkm$e;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 23
    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    .line 70
    new-instance v0, Lcom/unionpay/blepayservice/PayService$5;

    invoke-direct {v0, p0}, Lcom/unionpay/blepayservice/PayService$5;-><init>(Lcom/unionpay/blepayservice/PayService;)V

    iput-object v0, p0, Lcom/unionpay/blepayservice/PayService;->d:Lo/fki$d;

    .line 101
    new-instance v0, Lcom/unionpay/blepayservice/PayService$1;

    invoke-direct {v0, p0}, Lcom/unionpay/blepayservice/PayService$1;-><init>(Lcom/unionpay/blepayservice/PayService;)V

    iput-object v0, p0, Lcom/unionpay/blepayservice/PayService;->e:Lo/fkm$e;

    return-void
.end method

.method static synthetic b(Lcom/unionpay/blepayservice/PayService;I)I
    .locals 0

    .line 23
    iput p1, p0, Lcom/unionpay/blepayservice/PayService;->b:I

    return p1
.end method

.method static synthetic b(Lcom/unionpay/blepayservice/PayService;)Landroid/content/Context;
    .locals 1

    .line 23
    iget-object v0, p0, Lcom/unionpay/blepayservice/PayService;->c:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic d(Lcom/unionpay/blepayservice/PayService;)Lo/fki$d;
    .locals 1

    .line 23
    iget-object v0, p0, Lcom/unionpay/blepayservice/PayService;->d:Lo/fki$d;

    return-object v0
.end method

.method static synthetic e(Lcom/unionpay/blepayservice/PayService;)I
    .locals 1

    .line 23
    iget v0, p0, Lcom/unionpay/blepayservice/PayService;->b:I

    return v0
.end method


# virtual methods
.method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 4

    .line 52
    const-string v0, "PayService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onBind..."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 53
    iget-object v0, p0, Lcom/unionpay/blepayservice/PayService;->e:Lo/fkm$e;

    return-object v0
.end method

.method public onCreate()V
    .locals 1

    .line 41
    invoke-super {p0}, Landroid/app/Service;->onCreate()V

    .line 42
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/unionpay/blepayservice/PayService;->c:Landroid/content/Context;

    .line 43
    return-void
.end method

.method public onDestroy()V
    .locals 0

    .line 47
    invoke-super {p0}, Landroid/app/Service;->onDestroy()V

    .line 48
    return-void
.end method

.method public onStartCommand(Landroid/content/Intent;II)I
    .locals 4

    .line 58
    const-string v0, "PayService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onStartCommand..."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 59
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 61
    :cond_0
    const/4 v0, 0x2

    return v0

    .line 64
    :cond_1
    invoke-super {p0, p1, p2, p3}, Landroid/app/Service;->onStartCommand(Landroid/content/Intent;II)I

    move-result v0

    return v0
.end method
