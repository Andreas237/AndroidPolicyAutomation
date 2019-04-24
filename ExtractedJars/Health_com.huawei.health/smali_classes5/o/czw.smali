.class public Lo/czw;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Ljava/lang/Object;

.field private static b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/String;Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;>;"
        }
    .end annotation
.end field

.field private static c:Ljava/lang/Object;

.field private static d:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

.field private static e:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 18
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lo/czw;->c:Ljava/lang/Object;

    .line 19
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lo/czw;->a:Ljava/lang/Object;

    .line 21
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lo/czw;->b:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;)V
    .locals 3

    .line 41
    invoke-static {}, Lo/czw;->d()Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1

    .line 42
    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    .line 43
    :try_start_0
    sput-object p0, Lo/czw;->d:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 45
    :cond_0
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2

    .line 46
    :goto_0
    return-void
.end method

.method public static b()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;
    .locals 3

    .line 58
    invoke-static {}, Lo/czw;->c()Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1

    .line 59
    :try_start_0
    sget-object v0, Lo/czw;->e:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    .line 60
    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method

.method private static declared-synchronized c()Ljava/lang/Object;
    .locals 3

    const-class v1, Lo/czw;

    monitor-enter v1

    .line 75
    :try_start_0
    sget-object v0, Lo/czw;->a:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method

.method private static declared-synchronized d()Ljava/lang/Object;
    .locals 3

    const-class v1, Lo/czw;

    monitor-enter v1

    .line 72
    :try_start_0
    sget-object v0, Lo/czw;->c:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method

.method public static e()Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;
    .locals 3

    .line 35
    invoke-static {}, Lo/czw;->d()Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1

    .line 36
    :try_start_0
    sget-object v0, Lo/czw;->d:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    .line 37
    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method

.method public static e(Ljava/lang/String;)Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;
    .locals 3

    .line 26
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 27
    const/4 v0, 0x0

    return-object v0

    .line 29
    :cond_0
    invoke-static {}, Lo/czw;->d()Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1

    .line 30
    :try_start_0
    sget-object v0, Lo/czw;->b:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    .line 31
    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method

.method public static e(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;)V
    .locals 3

    .line 64
    invoke-static {}, Lo/czw;->c()Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1

    .line 65
    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    .line 66
    :try_start_0
    sput-object p0, Lo/czw;->e:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 68
    :cond_0
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2

    .line 69
    :goto_0
    return-void
.end method

.method public static e(Ljava/util/Map;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<Ljava/lang/String;Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;>;)V"
        }
    .end annotation

    .line 49
    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    invoke-interface {p0}, Ljava/util/Map;->size()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 50
    :cond_0
    return-void

    .line 52
    :cond_1
    invoke-static {}, Lo/czw;->d()Ljava/lang/Object;

    move-result-object v2

    monitor-enter v2

    .line 53
    :try_start_0
    sput-object p0, Lo/czw;->b:Ljava/util/Map;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 54
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3

    .line 55
    :goto_0
    return-void
.end method
