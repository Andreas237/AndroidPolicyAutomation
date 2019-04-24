.class public Lcom/huawei/updatesdk/service/otaupdate/b;
.super Ljava/lang/Object;


# static fields
.field private static a:Lcom/huawei/updatesdk/service/otaupdate/b;

.field private static final c:Ljava/lang/Object;


# instance fields
.field private b:Lcom/huawei/updatesdk/service/otaupdate/CheckUpdateCallBack;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    sput-object v0, Lcom/huawei/updatesdk/service/otaupdate/b;->a:Lcom/huawei/updatesdk/service/otaupdate/b;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/huawei/updatesdk/service/otaupdate/b;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lcom/huawei/updatesdk/service/otaupdate/b;
    .locals 3

    sget-object v1, Lcom/huawei/updatesdk/service/otaupdate/b;->c:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/huawei/updatesdk/service/otaupdate/b;->a:Lcom/huawei/updatesdk/service/otaupdate/b;

    if-nez v0, :cond_0

    new-instance v0, Lcom/huawei/updatesdk/service/otaupdate/b;

    invoke-direct {v0}, Lcom/huawei/updatesdk/service/otaupdate/b;-><init>()V

    sput-object v0, Lcom/huawei/updatesdk/service/otaupdate/b;->a:Lcom/huawei/updatesdk/service/otaupdate/b;

    :cond_0
    sget-object v0, Lcom/huawei/updatesdk/service/otaupdate/b;->a:Lcom/huawei/updatesdk/service/otaupdate/b;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method


# virtual methods
.method public a(I)V
    .locals 1

    iget-object v0, p0, Lcom/huawei/updatesdk/service/otaupdate/b;->b:Lcom/huawei/updatesdk/service/otaupdate/CheckUpdateCallBack;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/updatesdk/service/otaupdate/b;->b:Lcom/huawei/updatesdk/service/otaupdate/CheckUpdateCallBack;

    invoke-interface {v0, p1}, Lcom/huawei/updatesdk/service/otaupdate/CheckUpdateCallBack;->onMarketStoreError(I)V

    :cond_0
    return-void
.end method

.method public a(Landroid/content/Intent;)V
    .locals 1

    iget-object v0, p0, Lcom/huawei/updatesdk/service/otaupdate/b;->b:Lcom/huawei/updatesdk/service/otaupdate/CheckUpdateCallBack;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/updatesdk/service/otaupdate/b;->b:Lcom/huawei/updatesdk/service/otaupdate/CheckUpdateCallBack;

    invoke-interface {v0, p1}, Lcom/huawei/updatesdk/service/otaupdate/CheckUpdateCallBack;->onMarketInstallInfo(Landroid/content/Intent;)V

    :cond_0
    return-void
.end method

.method public a(Lcom/huawei/updatesdk/service/otaupdate/CheckUpdateCallBack;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/updatesdk/service/otaupdate/b;->b:Lcom/huawei/updatesdk/service/otaupdate/CheckUpdateCallBack;

    return-void
.end method

.method public b(Landroid/content/Intent;)V
    .locals 1

    iget-object v0, p0, Lcom/huawei/updatesdk/service/otaupdate/b;->b:Lcom/huawei/updatesdk/service/otaupdate/CheckUpdateCallBack;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/updatesdk/service/otaupdate/b;->b:Lcom/huawei/updatesdk/service/otaupdate/CheckUpdateCallBack;

    invoke-interface {v0, p1}, Lcom/huawei/updatesdk/service/otaupdate/CheckUpdateCallBack;->onUpdateInfo(Landroid/content/Intent;)V

    :cond_0
    return-void
.end method
