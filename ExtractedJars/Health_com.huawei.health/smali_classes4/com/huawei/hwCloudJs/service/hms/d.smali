.class public Lcom/huawei/hwCloudJs/service/hms/d;
.super Ljava/lang/Object;


# static fields
.field private static final a:Lcom/huawei/hwCloudJs/service/hms/d;


# instance fields
.field private final b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/String;Landroid/os/Parcelable;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/huawei/hwCloudJs/service/hms/d;

    invoke-direct {v0}, Lcom/huawei/hwCloudJs/service/hms/d;-><init>()V

    sput-object v0, Lcom/huawei/hwCloudJs/service/hms/d;->a:Lcom/huawei/hwCloudJs/service/hms/d;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/huawei/hwCloudJs/service/hms/d;->b:Ljava/util/Map;

    return-void
.end method

.method public static a()Lcom/huawei/hwCloudJs/service/hms/d;
    .locals 1

    sget-object v0, Lcom/huawei/hwCloudJs/service/hms/d;->a:Lcom/huawei/hwCloudJs/service/hms/d;

    return-object v0
.end method


# virtual methods
.method public a(Ljava/lang/String;)Landroid/content/Intent;
    .locals 4

    iget-object v1, p0, Lcom/huawei/hwCloudJs/service/hms/d;->b:Ljava/util/Map;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/huawei/hwCloudJs/service/hms/d;->b:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/os/Parcelable;

    instance-of v0, v2, Landroid/content/Intent;

    if-eqz v0, :cond_0

    move-object v0, v2

    check-cast v0, Landroid/content/Intent;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    :cond_0
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v3

    monitor-exit v1

    throw v3

    :goto_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public a(Ljava/lang/String;Landroid/app/PendingIntent;)V
    .locals 3

    iget-object v1, p0, Lcom/huawei/hwCloudJs/service/hms/d;->b:Ljava/util/Map;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/huawei/hwCloudJs/service/hms/d;->b:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2

    :goto_0
    return-void
.end method

.method public a(Ljava/lang/String;Landroid/content/Intent;)V
    .locals 3

    iget-object v1, p0, Lcom/huawei/hwCloudJs/service/hms/d;->b:Ljava/util/Map;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/huawei/hwCloudJs/service/hms/d;->b:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2

    :goto_0
    return-void
.end method

.method public b(Ljava/lang/String;)Landroid/app/PendingIntent;
    .locals 4

    iget-object v1, p0, Lcom/huawei/hwCloudJs/service/hms/d;->b:Ljava/util/Map;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/huawei/hwCloudJs/service/hms/d;->b:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/os/Parcelable;

    instance-of v0, v2, Landroid/app/PendingIntent;

    if-eqz v0, :cond_0

    move-object v0, v2

    check-cast v0, Landroid/app/PendingIntent;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    :cond_0
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v3

    monitor-exit v1

    throw v3

    :goto_0
    const/4 v0, 0x0

    return-object v0
.end method
