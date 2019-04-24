.class public Lo/dwp;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/dui;


# static fields
.field private static b:Ljava/util/concurrent/ExecutorService;

.field private static d:Ljava/lang/String;


# instance fields
.field private c:Lo/dwr;

.field private e:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 26
    const-string v0, "PLGACHIEVE_AchieveLevelEventObserver"

    sput-object v0, Lo/dwp;->d:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    iput-object p1, p0, Lo/dwp;->e:Landroid/content/Context;

    .line 34
    invoke-direct {p0}, Lo/dwp;->b()V

    .line 35
    return-void
.end method

.method private b()V
    .locals 2

    .line 66
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    sput-object v0, Lo/dwp;->b:Ljava/util/concurrent/ExecutorService;

    .line 67
    iget-object v0, p0, Lo/dwp;->c:Lo/dwr;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 68
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dwr;->b(Landroid/content/Context;)Lo/dwr;

    move-result-object v0

    iput-object v0, p0, Lo/dwp;->c:Lo/dwr;

    .line 70
    :cond_0
    return-void
.end method

.method private c()V
    .locals 2

    .line 73
    iget-object v0, p0, Lo/dwp;->c:Lo/dwr;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 74
    sget-object v0, Lo/dwp;->d:Ljava/lang/String;

    const-string v1, "enter releaseManager"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 75
    iget-object v0, p0, Lo/dwp;->c:Lo/dwr;

    invoke-virtual {v0, p0}, Lo/dwr;->d(Lo/dui;)V

    .line 76
    const/4 v0, 0x0

    iput-object v0, p0, Lo/dwp;->c:Lo/dwr;

    .line 78
    :cond_0
    sget-object v0, Lo/dwp;->b:Ljava/util/concurrent/ExecutorService;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 79
    sget-object v0, Lo/dwp;->b:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 81
    :cond_1
    return-void
.end method


# virtual methods
.method public e(ILo/dwk;)V
    .locals 8

    .line 40
    const/4 v0, -0x1

    if-eq p1, v0, :cond_0

    if-nez p2, :cond_1

    .line 41
    :cond_0
    sget-object v0, Lo/dwp;->d:Ljava/lang/String;

    const-string v1, "HttpErrCode or wrapper is error"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 42
    return-void

    .line 44
    :cond_1
    invoke-virtual {p2}, Lo/dwk;->l()I

    move-result v3

    .line 45
    sget-object v0, Lo/dwp;->d:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "AchieveMedalResDownloadObserver|onDataChanged contentType = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 46
    const/16 v0, 0xe

    if-ne v3, v0, :cond_5

    .line 47
    invoke-virtual {p2}, Lo/dwk;->e()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/dvf;

    .line 48
    sget-object v0, Lo/dwp;->d:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "processData data:data:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    if-nez v5, :cond_2

    const-string v2, "null"

    goto :goto_1

    :cond_2
    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    :goto_1
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 49
    if-eqz v5, :cond_3

    .line 50
    instance-of v0, v5, Lo/dvw;

    if-eqz v0, :cond_3

    .line 51
    move-object v6, v5

    check-cast v6, Lo/dvw;

    .line 52
    iget-object v0, p0, Lo/dwp;->e:Landroid/content/Context;

    const-string v1, "levelEventKey"

    invoke-static {v0, v1}, Lo/dtn;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 53
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 54
    iget-object v0, p0, Lo/dwp;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/dwu;->e(Landroid/content/Context;)Lo/dwu;

    move-result-object v0

    invoke-virtual {v6}, Lo/dvw;->b()I

    move-result v1

    invoke-virtual {v0, v7, v1}, Lo/dwu;->c(Ljava/lang/String;I)V

    .line 58
    :cond_3
    goto :goto_0

    .line 59
    :cond_4
    invoke-direct {p0}, Lo/dwp;->c()V

    .line 62
    :cond_5
    return-void
.end method
