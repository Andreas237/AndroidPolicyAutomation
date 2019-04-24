.class public Lcom/huawei/hwCloudJs/service/debugtool/SetUrl;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/hwCloudJs/service/debugtool/SetUrl$GetUrlCallBack;
    }
.end annotation


# static fields
.field private static a:Lcom/huawei/hwCloudJs/service/debugtool/SetUrl;


# instance fields
.field private b:Lcom/huawei/hwCloudJs/service/debugtool/SetUrl$GetUrlCallBack;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    sput-object v0, Lcom/huawei/hwCloudJs/service/debugtool/SetUrl;->a:Lcom/huawei/hwCloudJs/service/debugtool/SetUrl;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static declared-synchronized a()Lcom/huawei/hwCloudJs/service/debugtool/SetUrl;
    .locals 4

    const-class v2, Lcom/huawei/hwCloudJs/service/debugtool/SetUrl;

    monitor-enter v2

    :try_start_0
    sget-object v0, Lcom/huawei/hwCloudJs/service/debugtool/SetUrl;->a:Lcom/huawei/hwCloudJs/service/debugtool/SetUrl;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    new-instance v0, Lcom/huawei/hwCloudJs/service/debugtool/SetUrl;

    invoke-direct {v0}, Lcom/huawei/hwCloudJs/service/debugtool/SetUrl;-><init>()V

    sput-object v0, Lcom/huawei/hwCloudJs/service/debugtool/SetUrl;->a:Lcom/huawei/hwCloudJs/service/debugtool/SetUrl;

    :cond_0
    sget-object v0, Lcom/huawei/hwCloudJs/service/debugtool/SetUrl;->a:Lcom/huawei/hwCloudJs/service/debugtool/SetUrl;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    return-object v0

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3
.end method


# virtual methods
.method public a(Lcom/huawei/hwCloudJs/service/debugtool/SetUrl$GetUrlCallBack;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/hwCloudJs/service/debugtool/SetUrl;->b:Lcom/huawei/hwCloudJs/service/debugtool/SetUrl$GetUrlCallBack;

    return-void
.end method

.method public b()Lcom/huawei/hwCloudJs/service/debugtool/SetUrl$GetUrlCallBack;
    .locals 1

    iget-object v0, p0, Lcom/huawei/hwCloudJs/service/debugtool/SetUrl;->b:Lcom/huawei/hwCloudJs/service/debugtool/SetUrl$GetUrlCallBack;

    return-object v0
.end method
