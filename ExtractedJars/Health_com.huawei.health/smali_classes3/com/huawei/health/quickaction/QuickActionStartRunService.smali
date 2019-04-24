.class public Lcom/huawei/health/quickaction/QuickActionStartRunService;
.super Landroid/app/Service;
.source "SourceFile"


# instance fields
.field private b:I

.field private d:Landroid/content/Context;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 36
    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    .line 40
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/health/quickaction/QuickActionStartRunService;->b:I

    return-void
.end method

.method private a()V
    .locals 11

    .line 81
    const/16 v6, 0x102

    .line 82
    const/4 v7, -0x1

    .line 83
    const/high16 v8, -0x40800000    # -1.0f

    .line 85
    invoke-static {}, Lo/cbl;->b()Lo/cbl;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/quickaction/QuickActionStartRunService;->d:Landroid/content/Context;

    invoke-static {v1}, Lo/cwc;->c(Landroid/content/Context;)Lo/cwc;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/cbl;->setAdapter(Lo/eab;)V

    .line 86
    invoke-static {}, Lo/cbl;->b()Lo/cbl;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/quickaction/QuickActionStartRunService;->d:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lo/cbl;->init(Landroid/content/Context;)V

    .line 88
    invoke-static {}, Lo/cbl;->b()Lo/cbl;

    move-result-object v0

    move v2, v6

    move v3, v7

    move v4, v8

    const/4 v1, 0x0

    const/16 v2, 0x102

    const/4 v3, -0x1

    const/high16 v4, -0x40800000    # -1.0f

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Lo/cbl;->c(IIIFLo/ceu;)I

    move-result v9

    .line 89
    const/4 v0, 0x2

    if-ne v9, v0, :cond_0

    .line 90
    invoke-virtual {p0}, Lcom/huawei/health/quickaction/QuickActionStartRunService;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/health/quickaction/QuickActionStartRunService;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/pm/PackageManager;->getApplicationLabel(Landroid/content/pm/ApplicationInfo;)Ljava/lang/CharSequence;

    move-result-object v10

    .line 91
    invoke-virtual {p0}, Lcom/huawei/health/quickaction/QuickActionStartRunService;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v10, v1, v2

    const v2, 0x7f0211be

    invoke-virtual {p0, v2, v1}, Lcom/huawei/health/quickaction/QuickActionStartRunService;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 93
    :cond_0
    const-string v0, "QuickActionStartRunService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, ""

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ":"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ":"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 94
    return-void
.end method

.method static synthetic b(Lcom/huawei/health/quickaction/QuickActionStartRunService;I)I
    .locals 0

    .line 36
    iput p1, p0, Lcom/huawei/health/quickaction/QuickActionStartRunService;->b:I

    return p1
.end method


# virtual methods
.method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 65
    const/4 v0, 0x0

    return-object v0
.end method

.method public onCreate()V
    .locals 4

    .line 44
    const-string v0, "QuickActionStartRunService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCreate()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 45
    invoke-super {p0}, Landroid/app/Service;->onCreate()V

    .line 46
    iput-object p0, p0, Lcom/huawei/health/quickaction/QuickActionStartRunService;->d:Landroid/content/Context;

    .line 47
    iget-object v0, p0, Lcom/huawei/health/quickaction/QuickActionStartRunService;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    new-instance v1, Lcom/huawei/health/quickaction/QuickActionStartRunService$5;

    invoke-direct {v1, p0}, Lcom/huawei/health/quickaction/QuickActionStartRunService$5;-><init>(Lcom/huawei/health/quickaction/QuickActionStartRunService;)V

    invoke-interface {v0, v1}, Lo/clt;->a(Lo/clz;)V

    .line 60
    return-void
.end method

.method public onDestroy()V
    .locals 0

    .line 98
    invoke-super {p0}, Landroid/app/Service;->onDestroy()V

    .line 99
    return-void
.end method

.method public onStartCommand(Landroid/content/Intent;II)I
    .locals 4

    .line 70
    const-string v0, "QuickActionStartRunService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCreate()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 71
    if-nez p1, :cond_0

    .line 72
    const-string v0, "QuickActionStartRunService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCreate() intent == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 73
    const/4 v0, 0x0

    return v0

    .line 75
    :cond_0
    invoke-direct {p0}, Lcom/huawei/health/quickaction/QuickActionStartRunService;->a()V

    .line 77
    invoke-super {p0, p1, p2, p3}, Landroid/app/Service;->onStartCommand(Landroid/content/Intent;II)I

    move-result v0

    return v0
.end method
