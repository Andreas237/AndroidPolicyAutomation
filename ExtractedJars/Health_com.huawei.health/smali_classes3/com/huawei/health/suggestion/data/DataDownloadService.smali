.class public Lcom/huawei/health/suggestion/data/DataDownloadService;
.super Landroid/app/Service;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/suggestion/data/DataDownloadService$e;
    }
.end annotation


# instance fields
.field private final a:Landroid/os/IBinder;

.field private c:Z

.field private e:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 22
    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    .line 25
    new-instance v0, Lcom/huawei/health/suggestion/data/DataDownloadService$e;

    invoke-direct {v0}, Lcom/huawei/health/suggestion/data/DataDownloadService$e;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/suggestion/data/DataDownloadService;->a:Landroid/os/IBinder;

    .line 27
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/suggestion/data/DataDownloadService;->e:Z

    .line 28
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/suggestion/data/DataDownloadService;->c:Z

    return-void
.end method

.method static synthetic a(Lcom/huawei/health/suggestion/data/DataDownloadService;)Z
    .locals 1

    .line 22
    iget-boolean v0, p0, Lcom/huawei/health/suggestion/data/DataDownloadService;->c:Z

    return v0
.end method

.method static synthetic b(Lcom/huawei/health/suggestion/data/DataDownloadService;)Z
    .locals 1

    .line 22
    iget-boolean v0, p0, Lcom/huawei/health/suggestion/data/DataDownloadService;->e:Z

    return v0
.end method

.method private c()V
    .locals 2

    .line 38
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/health/suggestion/data/DataDownloadService;->e:Z

    .line 39
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/health/suggestion/data/DataDownloadService;->c:Z

    .line 40
    invoke-static {}, Lo/bzs;->a()Lo/bzs;

    move-result-object v0

    new-instance v1, Lcom/huawei/health/suggestion/data/DataDownloadService$2;

    invoke-direct {v1, p0}, Lcom/huawei/health/suggestion/data/DataDownloadService$2;-><init>(Lcom/huawei/health/suggestion/data/DataDownloadService;)V

    invoke-virtual {v0, v1}, Lo/bzs;->c(Ljava/lang/Runnable;)V

    .line 78
    return-void
.end method

.method static synthetic d(Lcom/huawei/health/suggestion/data/DataDownloadService;Z)Z
    .locals 0

    .line 22
    iput-boolean p1, p0, Lcom/huawei/health/suggestion/data/DataDownloadService;->e:Z

    return p1
.end method

.method static synthetic e(Lcom/huawei/health/suggestion/data/DataDownloadService;Z)Z
    .locals 0

    .line 22
    iput-boolean p1, p0, Lcom/huawei/health/suggestion/data/DataDownloadService;->c:Z

    return p1
.end method


# virtual methods
.method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 1

    .line 88
    iget-object v0, p0, Lcom/huawei/health/suggestion/data/DataDownloadService;->a:Landroid/os/IBinder;

    return-object v0
.end method

.method public onCreate()V
    .locals 4

    .line 32
    invoke-super {p0}, Landroid/app/Service;->onCreate()V

    .line 33
    const-string v0, "Suggestion_DataDownloadService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCreate"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 34
    invoke-direct {p0}, Lcom/huawei/health/suggestion/data/DataDownloadService;->c()V

    .line 35
    return-void
.end method

.method public onDestroy()V
    .locals 4

    .line 97
    invoke-super {p0}, Landroid/app/Service;->onDestroy()V

    .line 98
    const-string v0, "Suggestion_DataDownloadService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onDestroy"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 99
    return-void
.end method

.method public onStartCommand(Landroid/content/Intent;II)I
    .locals 4

    .line 82
    const-string v0, "Suggestion_DataDownloadService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onStartCommand"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 83
    invoke-super {p0, p1, p2, p3}, Landroid/app/Service;->onStartCommand(Landroid/content/Intent;II)I

    move-result v0

    return v0
.end method
