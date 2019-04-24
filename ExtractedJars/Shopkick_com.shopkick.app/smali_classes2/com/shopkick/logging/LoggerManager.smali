.class public Lcom/shopkick/logging/LoggerManager;
.super Ljava/lang/Object;
.source "LoggerManager.java"


# static fields
.field private static volatile Instance:Lcom/shopkick/logging/LoggerManager;

.field private static final InstanceLock:Ljava/lang/Object;


# instance fields
.field private final eventLogger:Lcom/shopkick/logging/EventLogger;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 14
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/shopkick/logging/LoggerManager;->InstanceLock:Ljava/lang/Object;

    return-void
.end method

.method private constructor <init>(Lcom/shopkick/logging/ConfigurationProvider;Landroid/content/Context;Ljava/lang/String;)V
    .locals 1

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    invoke-static {p1, p2, p3}, Lcom/shopkick/logging/DiagnosticLogger;->initialize(Lcom/shopkick/logging/ConfigurationProvider;Landroid/content/Context;Ljava/lang/String;)V

    .line 20
    new-instance v0, Lcom/shopkick/logging/EventLogger;

    invoke-direct {v0, p1, p2, p3}, Lcom/shopkick/logging/EventLogger;-><init>(Lcom/shopkick/logging/ConfigurationProvider;Landroid/content/Context;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/shopkick/logging/LoggerManager;->eventLogger:Lcom/shopkick/logging/EventLogger;

    return-void
.end method

.method public static getInstance()Lcom/shopkick/logging/LoggerManager;
    .locals 2

    .line 63
    sget-object v0, Lcom/shopkick/logging/LoggerManager;->Instance:Lcom/shopkick/logging/LoggerManager;

    if-eqz v0, :cond_0

    .line 66
    sget-object v0, Lcom/shopkick/logging/LoggerManager;->Instance:Lcom/shopkick/logging/LoggerManager;

    return-object v0

    .line 64
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "LoggerManager.initialize() must be called before using the LoggerManager."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static initialize(Lcom/shopkick/logging/ConfigurationProvider;Landroid/content/Context;Ljava/lang/String;)V
    .locals 2

    .line 32
    sget-object v0, Lcom/shopkick/logging/LoggerManager;->Instance:Lcom/shopkick/logging/LoggerManager;

    if-nez v0, :cond_4

    if-eqz p0, :cond_3

    if-eqz p1, :cond_2

    .line 45
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    .line 47
    sget-object v0, Lcom/shopkick/logging/LoggerManager;->Instance:Lcom/shopkick/logging/LoggerManager;

    if-nez v0, :cond_1

    .line 48
    sget-object v0, Lcom/shopkick/logging/LoggerManager;->InstanceLock:Ljava/lang/Object;

    monitor-enter v0

    .line 49
    :try_start_0
    sget-object v1, Lcom/shopkick/logging/LoggerManager;->Instance:Lcom/shopkick/logging/LoggerManager;

    if-nez v1, :cond_0

    .line 50
    new-instance v1, Lcom/shopkick/logging/LoggerManager;

    invoke-direct {v1, p0, p1, p2}, Lcom/shopkick/logging/LoggerManager;-><init>(Lcom/shopkick/logging/ConfigurationProvider;Landroid/content/Context;Ljava/lang/String;)V

    sput-object v1, Lcom/shopkick/logging/LoggerManager;->Instance:Lcom/shopkick/logging/LoggerManager;

    .line 52
    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0

    :cond_1
    :goto_0
    return-void

    .line 41
    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "\'context\' should not be null"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 37
    :cond_3
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "\'configurationProvider\' should not be null"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 33
    :cond_4
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "\'LoggerManager\' has already been initialized."

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static isInitialized()Z
    .locals 2

    .line 74
    sget-object v0, Lcom/shopkick/logging/LoggerManager;->InstanceLock:Ljava/lang/Object;

    monitor-enter v0

    .line 75
    :try_start_0
    sget-object v1, Lcom/shopkick/logging/LoggerManager;->Instance:Lcom/shopkick/logging/LoggerManager;

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    .line 76
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method


# virtual methods
.method public getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;
    .locals 1

    .line 80
    invoke-static {}, Lcom/shopkick/logging/DiagnosticLogger;->getInstance()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v0

    return-object v0
.end method

.method public getEventLogger()Lcom/shopkick/logging/EventLogger;
    .locals 1

    .line 84
    iget-object v0, p0, Lcom/shopkick/logging/LoggerManager;->eventLogger:Lcom/shopkick/logging/EventLogger;

    return-object v0
.end method
