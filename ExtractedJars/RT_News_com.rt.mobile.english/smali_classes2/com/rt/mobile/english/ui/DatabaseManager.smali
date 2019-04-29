.class public Lcom/rt/mobile/english/ui/DatabaseManager;
.super Ljava/lang/Object;
.source "DatabaseManager.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/rt/mobile/english/ui/DatabaseManager$DBHelper;
    }
.end annotation


# static fields
.field private static instance:Lcom/rt/mobile/english/ui/DatabaseManager;

.field private static mDatabaseHelper:Landroid/database/sqlite/SQLiteOpenHelper;


# instance fields
.field private mDatabase:Landroid/database/sqlite/SQLiteDatabase;

.field private mOpenCounter:Ljava/util/concurrent/atomic/AtomicInteger;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object v0, p0, Lcom/rt/mobile/english/ui/DatabaseManager;->mOpenCounter:Ljava/util/concurrent/atomic/AtomicInteger;

    return-void
.end method

.method public static declared-synchronized getInstance()Lcom/rt/mobile/english/ui/DatabaseManager;
    .locals 2

    const-class v0, Lcom/rt/mobile/english/ui/DatabaseManager;

    monitor-enter v0

    .line 31
    :try_start_0
    sget-object v1, Lcom/rt/mobile/english/ui/DatabaseManager;->instance:Lcom/rt/mobile/english/ui/DatabaseManager;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method public static declared-synchronized initializeInstance(Landroid/database/sqlite/SQLiteOpenHelper;)V
    .locals 2

    const-class v0, Lcom/rt/mobile/english/ui/DatabaseManager;

    monitor-enter v0

    .line 24
    :try_start_0
    sget-object v1, Lcom/rt/mobile/english/ui/DatabaseManager;->instance:Lcom/rt/mobile/english/ui/DatabaseManager;

    if-nez v1, :cond_0

    .line 25
    new-instance v1, Lcom/rt/mobile/english/ui/DatabaseManager;

    invoke-direct {v1}, Lcom/rt/mobile/english/ui/DatabaseManager;-><init>()V

    sput-object v1, Lcom/rt/mobile/english/ui/DatabaseManager;->instance:Lcom/rt/mobile/english/ui/DatabaseManager;

    .line 26
    sput-object p0, Lcom/rt/mobile/english/ui/DatabaseManager;->mDatabaseHelper:Landroid/database/sqlite/SQLiteOpenHelper;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    .line 23
    monitor-exit v0

    throw p0
.end method

.method public static setNulInstance()V
    .locals 1

    .line 35
    sget-object v0, Lcom/rt/mobile/english/ui/DatabaseManager;->instance:Lcom/rt/mobile/english/ui/DatabaseManager;

    if-eqz v0, :cond_0

    .line 36
    sget-object v0, Lcom/rt/mobile/english/ui/DatabaseManager;->instance:Lcom/rt/mobile/english/ui/DatabaseManager;

    invoke-virtual {v0}, Lcom/rt/mobile/english/ui/DatabaseManager;->closeDatabase()V

    const/4 v0, 0x0

    .line 37
    sput-object v0, Lcom/rt/mobile/english/ui/DatabaseManager;->instance:Lcom/rt/mobile/english/ui/DatabaseManager;

    :cond_0
    return-void
.end method


# virtual methods
.method public declared-synchronized closeDatabase()V
    .locals 1

    monitor-enter p0

    .line 49
    :try_start_0
    iget-object v0, p0, Lcom/rt/mobile/english/ui/DatabaseManager;->mOpenCounter:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    move-result v0

    if-nez v0, :cond_0

    .line 50
    iget-object v0, p0, Lcom/rt/mobile/english/ui/DatabaseManager;->mDatabase:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 52
    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    .line 48
    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized openDatabase()Landroid/database/sqlite/SQLiteDatabase;
    .locals 2

    monitor-enter p0

    .line 42
    :try_start_0
    iget-object v0, p0, Lcom/rt/mobile/english/ui/DatabaseManager;->mOpenCounter:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 43
    sget-object v0, Lcom/rt/mobile/english/ui/DatabaseManager;->mDatabaseHelper:Landroid/database/sqlite/SQLiteOpenHelper;

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteOpenHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    iput-object v0, p0, Lcom/rt/mobile/english/ui/DatabaseManager;->mDatabase:Landroid/database/sqlite/SQLiteDatabase;

    .line 45
    :cond_0
    iget-object v0, p0, Lcom/rt/mobile/english/ui/DatabaseManager;->mDatabase:Landroid/database/sqlite/SQLiteDatabase;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    .line 41
    monitor-exit p0

    throw v0
.end method
