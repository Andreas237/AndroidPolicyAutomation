.class public Lcom/huawei/updatesdk/sdk/service/a/a;
.super Ljava/lang/Object;


# static fields
.field private static b:Lcom/huawei/updatesdk/sdk/service/a/a;

.field private static final d:Ljava/lang/Object;


# instance fields
.field private a:Landroid/content/Context;

.field private c:Landroid/net/ConnectivityManager;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    sput-object v0, Lcom/huawei/updatesdk/sdk/service/a/a;->b:Lcom/huawei/updatesdk/sdk/service/a/a;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/huawei/updatesdk/sdk/service/a/a;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/updatesdk/sdk/service/a/a;->c:Landroid/net/ConnectivityManager;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/updatesdk/sdk/service/a/a;->a:Landroid/content/Context;

    return-void
.end method

.method public static a()Lcom/huawei/updatesdk/sdk/service/a/a;
    .locals 3

    sget-object v1, Lcom/huawei/updatesdk/sdk/service/a/a;->d:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/huawei/updatesdk/sdk/service/a/a;->b:Lcom/huawei/updatesdk/sdk/service/a/a;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method

.method public static a(Landroid/content/Context;)V
    .locals 3

    sget-object v1, Lcom/huawei/updatesdk/sdk/service/a/a;->d:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/huawei/updatesdk/sdk/service/a/a;->b:Lcom/huawei/updatesdk/sdk/service/a/a;

    if-nez v0, :cond_0

    new-instance v0, Lcom/huawei/updatesdk/sdk/service/a/a;

    invoke-direct {v0, p0}, Lcom/huawei/updatesdk/sdk/service/a/a;-><init>(Landroid/content/Context;)V

    sput-object v0, Lcom/huawei/updatesdk/sdk/service/a/a;->b:Lcom/huawei/updatesdk/sdk/service/a/a;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2

    :goto_0
    return-void
.end method


# virtual methods
.method public b()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/a/a;->a:Landroid/content/Context;

    return-object v0
.end method

.method public c()Landroid/net/ConnectivityManager;
    .locals 2

    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/a/a;->c:Landroid/net/ConnectivityManager;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/a/a;->a:Landroid/content/Context;

    const-string v1, "connectivity"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/ConnectivityManager;

    iput-object v0, p0, Lcom/huawei/updatesdk/sdk/service/a/a;->c:Landroid/net/ConnectivityManager;

    :cond_0
    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/a/a;->c:Landroid/net/ConnectivityManager;

    return-object v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/a/a;->a:Landroid/content/Context;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/a/a;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v0

    if-nez v0, :cond_1

    :cond_0
    const-string v0, ""

    return-object v0

    :cond_1
    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/a/a;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
