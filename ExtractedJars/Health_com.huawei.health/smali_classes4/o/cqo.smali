.class public Lo/cqo;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/cqo$c;
    }
.end annotation


# static fields
.field private static c:Landroid/content/Context;


# instance fields
.field private b:Lo/cpe;

.field private final d:Ljava/lang/Object;


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 52
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lo/cqo;->d:Ljava/lang/Object;

    .line 27
    sget-object v0, Lo/cqo;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/cpe;->e(Landroid/content/Context;)Lo/cpe;

    move-result-object v0

    iput-object v0, p0, Lo/cqo;->b:Lo/cpe;

    .line 28
    return-void
.end method

.method synthetic constructor <init>(Lo/cqo$5;)V
    .locals 0

    .line 18
    invoke-direct {p0}, Lo/cqo;-><init>()V

    return-void
.end method

.method public static a(Landroid/content/Context;)Lo/cqo;
    .locals 1
    .param p0    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 39
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    sput-object v0, Lo/cqo;->c:Landroid/content/Context;

    .line 40
    sget-object v0, Lo/cqo$c;->c:Lo/cqo;

    return-object v0
.end method

.method private d(Lo/cny;)J
    .locals 5

    .line 44
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 45
    const-string v0, "Debug_SyncCacheManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "insertSyncCache syncCacheTable is null!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 46
    const-wide/16 v0, 0x0

    return-wide v0

    .line 48
    :cond_0
    invoke-static {p1}, Lo/cpi;->b(Lo/cny;)Landroid/content/ContentValues;

    move-result-object v4

    .line 49
    iget-object v0, p0, Lo/cqo;->b:Lo/cpe;

    invoke-virtual {v0, v4}, Lo/cpe;->c(Landroid/content/ContentValues;)J

    move-result-wide v0

    return-wide v0
.end method


# virtual methods
.method public b(IILjava/lang/String;J)Z
    .locals 9

    .line 54
    iget-object v4, p0, Lo/cqo;->d:Ljava/lang/Object;

    monitor-enter v4

    .line 55
    :try_start_0
    new-instance v5, Lo/cny;

    invoke-direct {v5}, Lo/cny;-><init>()V

    .line 56
    invoke-virtual {v5, p1}, Lo/cny;->b(I)V

    .line 57
    invoke-virtual {v5, p2}, Lo/cny;->a(I)V

    .line 58
    invoke-virtual {v5, p3}, Lo/cny;->b(Ljava/lang/String;)V

    .line 59
    invoke-virtual {v5, p4, p5}, Lo/cny;->d(J)V

    .line 60
    invoke-direct {p0, v5}, Lo/cqo;->d(Lo/cny;)J

    move-result-wide v6

    .line 61
    const-string v0, "Debug_SyncCacheManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "insert syncCacheTable count is"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 62
    const-wide/16 v0, 0x0

    cmp-long v0, v6, v0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    monitor-exit v4

    return v0

    .line 63
    :catchall_0
    move-exception v8

    monitor-exit v4

    throw v8
.end method

.method public d(II)Landroid/database/Cursor;
    .locals 10

    .line 67
    const-string v0, "Debug_SyncCacheManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "querySyncCachebyType"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 68
    if-gez p1, :cond_0

    .line 69
    const-string v0, "Debug_SyncCacheManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "querySyncCachebyType userID is not right!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 70
    const/4 v0, 0x0

    return-object v0

    .line 72
    :cond_0
    const/4 v6, 0x0

    .line 73
    const-string v7, "userId =? and isDone =? and dataType =? "

    .line 74
    const/4 v0, 0x3

    new-array v8, v0, [Ljava/lang/String;

    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v8, v1

    invoke-static {v6}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v8, v1

    invoke-static {p2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    aput-object v0, v8, v1

    .line 75
    const-string v9, "dataTime DESC "

    .line 76
    iget-object v0, p0, Lo/cqo;->b:Lo/cpe;

    move-object v1, v7

    move-object v2, v8

    move-object v5, v9

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual/range {v0 .. v5}, Lo/cpe;->b(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    return-object v0
.end method
