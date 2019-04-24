.class public Lcom/huawei/hwid/core/d/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Z

.field private static b:Z

.field private static c:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 10
    const/4 v0, 0x0

    sput-boolean v0, Lcom/huawei/hwid/core/d/d;->a:Z

    .line 11
    const/4 v0, 0x0

    sput-boolean v0, Lcom/huawei/hwid/core/d/d;->b:Z

    .line 13
    const-string v0, ""

    sput-object v0, Lcom/huawei/hwid/core/d/d;->c:Ljava/lang/String;

    return-void
.end method

.method public static a(Ljava/lang/String;)V
    .locals 0

    .line 27
    sput-object p0, Lcom/huawei/hwid/core/d/d;->c:Ljava/lang/String;

    .line 28
    return-void
.end method

.method public static a()Z
    .locals 1

    .line 18
    sget-boolean v0, Lcom/huawei/hwid/core/d/d;->b:Z

    return v0
.end method

.method public static declared-synchronized b()Z
    .locals 3

    const-class v1, Lcom/huawei/hwid/core/d/d;

    monitor-enter v1

    .line 22
    :try_start_0
    sget-boolean v0, Lcom/huawei/hwid/core/d/d;->a:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return v0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method

.method public static c()Ljava/lang/String;
    .locals 1

    .line 31
    sget-object v0, Lcom/huawei/hwid/core/d/d;->c:Ljava/lang/String;

    return-object v0
.end method
