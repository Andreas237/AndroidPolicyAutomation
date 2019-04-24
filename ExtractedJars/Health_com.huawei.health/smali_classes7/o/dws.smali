.class public Lo/dws;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/dui;


# static fields
.field private static c:Ljava/util/concurrent/ExecutorService;

.field private static e:Ljava/lang/String;


# instance fields
.field private b:Landroid/content/Context;

.field private d:Lo/dwr;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 24
    const-string v0, "PLGACHIEVE_AchieveLevelInfoObserver"

    sput-object v0, Lo/dws;->e:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    iput-object p1, p0, Lo/dws;->b:Landroid/content/Context;

    .line 32
    invoke-direct {p0}, Lo/dws;->b()V

    .line 33
    return-void
.end method

.method private b()V
    .locals 2

    .line 60
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    sput-object v0, Lo/dws;->c:Ljava/util/concurrent/ExecutorService;

    .line 61
    iget-object v0, p0, Lo/dws;->d:Lo/dwr;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 62
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dwr;->b(Landroid/content/Context;)Lo/dwr;

    move-result-object v0

    iput-object v0, p0, Lo/dws;->d:Lo/dwr;

    .line 64
    :cond_0
    return-void
.end method

.method private e()V
    .locals 2

    .line 67
    iget-object v0, p0, Lo/dws;->d:Lo/dwr;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 68
    sget-object v0, Lo/dws;->e:Ljava/lang/String;

    const-string v1, "enter releaseManager"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 69
    iget-object v0, p0, Lo/dws;->d:Lo/dwr;

    invoke-virtual {v0, p0}, Lo/dwr;->d(Lo/dui;)V

    .line 70
    const/4 v0, 0x0

    iput-object v0, p0, Lo/dws;->d:Lo/dwr;

    .line 72
    :cond_0
    sget-object v0, Lo/dws;->c:Ljava/util/concurrent/ExecutorService;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 73
    sget-object v0, Lo/dws;->c:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 75
    :cond_1
    return-void
.end method


# virtual methods
.method public e(ILo/dwk;)V
    .locals 7

    .line 38
    const/4 v0, -0x1

    if-eq p1, v0, :cond_0

    if-nez p2, :cond_1

    .line 39
    :cond_0
    sget-object v0, Lo/dws;->e:Ljava/lang/String;

    const-string v1, "HttpErrCode or wrapper is error"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 40
    return-void

    .line 42
    :cond_1
    invoke-virtual {p2}, Lo/dwk;->l()I

    move-result v3

    .line 43
    sget-object v0, Lo/dws;->e:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "AchieveLevelInfoObserver|onDataChanged contentType = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 44
    const/16 v0, 0xd

    if-ne v3, v0, :cond_4

    .line 45
    invoke-virtual {p2}, Lo/dwk;->e()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/dvf;

    .line 46
    if-eqz v5, :cond_2

    .line 47
    instance-of v0, v5, Lo/dvj;

    if-eqz v0, :cond_2

    .line 48
    move-object v6, v5

    check-cast v6, Lo/dvj;

    .line 49
    iget-object v0, p0, Lo/dws;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/dwu;->e(Landroid/content/Context;)Lo/dwu;

    move-result-object v0

    invoke-virtual {v6}, Lo/dvj;->b()I

    move-result v1

    invoke-virtual {v0, v1}, Lo/dwu;->b(I)V

    .line 52
    :cond_2
    goto :goto_0

    .line 53
    :cond_3
    invoke-direct {p0}, Lo/dws;->e()V

    .line 56
    :cond_4
    return-void
.end method
