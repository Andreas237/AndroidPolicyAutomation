.class public Lcom/usebutton/sdk/internal/util/DebugProxy;
.super Ljava/lang/Object;
.source "DebugProxy.java"

# interfaces
.implements Lcom/usebutton/sdk/debug/DebugInterface;


# static fields
.field private static volatile instance:Lcom/usebutton/sdk/internal/util/DebugProxy;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static declared-synchronized getInstance()Lcom/usebutton/sdk/debug/DebugInterface;
    .locals 2

    const-class v0, Lcom/usebutton/sdk/internal/util/DebugProxy;

    monitor-enter v0

    .line 10
    :try_start_0
    sget-object v1, Lcom/usebutton/sdk/internal/util/DebugProxy;->instance:Lcom/usebutton/sdk/internal/util/DebugProxy;

    if-nez v1, :cond_0

    .line 11
    new-instance v1, Lcom/usebutton/sdk/internal/util/DebugProxy;

    invoke-direct {v1}, Lcom/usebutton/sdk/internal/util/DebugProxy;-><init>()V

    sput-object v1, Lcom/usebutton/sdk/internal/util/DebugProxy;->instance:Lcom/usebutton/sdk/internal/util/DebugProxy;

    .line 13
    :cond_0
    sget-object v1, Lcom/usebutton/sdk/internal/util/DebugProxy;->instance:Lcom/usebutton/sdk/internal/util/DebugProxy;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method


# virtual methods
.method public isLoggingEnabled()Z
    .locals 1

    .line 23
    invoke-static {}, Lcom/usebutton/sdk/internal/util/ButtonLog;->isPartnerLoggingEnabled()Z

    move-result v0

    return v0
.end method

.method public setLoggingEnabled(Z)V
    .locals 0

    .line 18
    invoke-static {p1}, Lcom/usebutton/sdk/internal/util/ButtonLog;->setPartnerLoggingEnabled(Z)V

    return-void
.end method
