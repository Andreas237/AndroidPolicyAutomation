.class public Lorg/apache/commons/io/FileCleaner;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Ljava/lang/Deprecated;
.end annotation


# static fields
.field static final theInstance:Lorg/apache/commons/io/FileCleaningTracker;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 42
    new-instance v0, Lorg/apache/commons/io/FileCleaningTracker;

    invoke-direct {v0}, Lorg/apache/commons/io/FileCleaningTracker;-><init>()V

    sput-object v0, Lorg/apache/commons/io/FileCleaner;->theInstance:Lorg/apache/commons/io/FileCleaningTracker;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static declared-synchronized exitWhenFinished()V
    .locals 3
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-class v1, Lorg/apache/commons/io/FileCleaner;

    monitor-enter v1

    .line 145
    :try_start_0
    sget-object v0, Lorg/apache/commons/io/FileCleaner;->theInstance:Lorg/apache/commons/io/FileCleaningTracker;

    invoke-virtual {v0}, Lorg/apache/commons/io/FileCleaningTracker;->exitWhenFinished()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 146
    monitor-exit v1

    return-void

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method

.method public static getInstance()Lorg/apache/commons/io/FileCleaningTracker;
    .locals 1

    .line 157
    sget-object v0, Lorg/apache/commons/io/FileCleaner;->theInstance:Lorg/apache/commons/io/FileCleaningTracker;

    return-object v0
.end method

.method public static getTrackCount()I
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 117
    sget-object v0, Lorg/apache/commons/io/FileCleaner;->theInstance:Lorg/apache/commons/io/FileCleaningTracker;

    invoke-virtual {v0}, Lorg/apache/commons/io/FileCleaningTracker;->getTrackCount()I

    move-result v0

    return v0
.end method

.method public static track(Ljava/io/File;Ljava/lang/Object;)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 57
    sget-object v0, Lorg/apache/commons/io/FileCleaner;->theInstance:Lorg/apache/commons/io/FileCleaningTracker;

    invoke-virtual {v0, p0, p1}, Lorg/apache/commons/io/FileCleaningTracker;->track(Ljava/io/File;Ljava/lang/Object;)V

    .line 58
    return-void
.end method

.method public static track(Ljava/io/File;Ljava/lang/Object;Lorg/apache/commons/io/FileDeleteStrategy;)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 73
    sget-object v0, Lorg/apache/commons/io/FileCleaner;->theInstance:Lorg/apache/commons/io/FileCleaningTracker;

    invoke-virtual {v0, p0, p1, p2}, Lorg/apache/commons/io/FileCleaningTracker;->track(Ljava/io/File;Ljava/lang/Object;Lorg/apache/commons/io/FileDeleteStrategy;)V

    .line 74
    return-void
.end method

.method public static track(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 88
    sget-object v0, Lorg/apache/commons/io/FileCleaner;->theInstance:Lorg/apache/commons/io/FileCleaningTracker;

    invoke-virtual {v0, p0, p1}, Lorg/apache/commons/io/FileCleaningTracker;->track(Ljava/lang/String;Ljava/lang/Object;)V

    .line 89
    return-void
.end method

.method public static track(Ljava/lang/String;Ljava/lang/Object;Lorg/apache/commons/io/FileDeleteStrategy;)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 104
    sget-object v0, Lorg/apache/commons/io/FileCleaner;->theInstance:Lorg/apache/commons/io/FileCleaningTracker;

    invoke-virtual {v0, p0, p1, p2}, Lorg/apache/commons/io/FileCleaningTracker;->track(Ljava/lang/String;Ljava/lang/Object;Lorg/apache/commons/io/FileDeleteStrategy;)V

    .line 105
    return-void
.end method
