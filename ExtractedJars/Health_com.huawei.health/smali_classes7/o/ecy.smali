.class public Lo/ecy;
.super Lo/eac;
.source "SourceFile"


# static fields
.field private static e:Lo/ecy;


# instance fields
.field private b:Z

.field private c:Landroid/content/Context;


# direct methods
.method private constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 20
    invoke-direct {p0}, Lo/eac;-><init>()V

    .line 18
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/ecy;->b:Z

    .line 21
    iput-object p1, p0, Lo/ecy;->c:Landroid/content/Context;

    .line 22
    return-void
.end method

.method public static c(Landroid/content/Context;)Lo/ecy;
    .locals 4

    .line 24
    const-class v2, Lo/ecy;

    monitor-enter v2

    .line 25
    :try_start_0
    sget-object v0, Lo/ecy;->e:Lo/ecy;

    if-nez v0, :cond_0

    .line 26
    new-instance v0, Lo/ecy;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/ecy;-><init>(Landroid/content/Context;)V

    sput-object v0, Lo/ecy;->e:Lo/ecy;

    .line 28
    :cond_0
    sget-object v0, Lo/ecy;->e:Lo/ecy;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    return-object v0

    .line 29
    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3
.end method


# virtual methods
.method public a()Z
    .locals 1

    .line 48
    iget-boolean v0, p0, Lo/ecy;->b:Z

    return v0
.end method

.method public e(Landroid/content/Context;)V
    .locals 2

    .line 34
    new-instance v1, Landroid/content/Intent;

    const-class v0, Lcom/huawei/sim/esim/view/WirelessManagerAcitivity;

    invoke-direct {v1, p1, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 35
    invoke-virtual {p1, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 36
    return-void
.end method

.method public e(Z)V
    .locals 0

    .line 44
    iput-boolean p1, p0, Lo/ecy;->b:Z

    .line 45
    return-void
.end method
