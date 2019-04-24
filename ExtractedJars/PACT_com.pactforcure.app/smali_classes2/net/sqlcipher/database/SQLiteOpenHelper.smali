.class public abstract Lnet/sqlcipher/database/SQLiteOpenHelper;
.super Ljava/lang/Object;
.source "SQLiteOpenHelper.java"


# static fields
.field private static final TAG:Ljava/lang/String;


# instance fields
.field private final mContext:Landroid/content/Context;

.field private mDatabase:Lnet/sqlcipher/database/SQLiteDatabase;

.field private final mErrorHandler:Lnet/sqlcipher/DatabaseErrorHandler;

.field private final mFactory:Lnet/sqlcipher/database/SQLiteDatabase$CursorFactory;

.field private final mHook:Lnet/sqlcipher/database/SQLiteDatabaseHook;

.field private mIsInitializing:Z

.field private final mName:Ljava/lang/String;

.field private final mNewVersion:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 38
    const-class v0, Lnet/sqlcipher/database/SQLiteOpenHelper;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lnet/sqlcipher/database/SQLiteOpenHelper;->TAG:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Lnet/sqlcipher/database/SQLiteDatabase$CursorFactory;I)V
    .locals 7
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "name"    # Ljava/lang/String;
    .param p3, "factory"    # Lnet/sqlcipher/database/SQLiteDatabase$CursorFactory;
    .param p4, "version"    # I

    .prologue
    .line 63
    const/4 v5, 0x0

    new-instance v6, Lnet/sqlcipher/DefaultDatabaseErrorHandler;

    invoke-direct {v6}, Lnet/sqlcipher/DefaultDatabaseErrorHandler;-><init>()V

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v4, p4

    invoke-direct/range {v0 .. v6}, Lnet/sqlcipher/database/SQLiteOpenHelper;-><init>(Landroid/content/Context;Ljava/lang/String;Lnet/sqlcipher/database/SQLiteDatabase$CursorFactory;ILnet/sqlcipher/database/SQLiteDatabaseHook;Lnet/sqlcipher/DatabaseErrorHandler;)V

    .line 64
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Lnet/sqlcipher/database/SQLiteDatabase$CursorFactory;ILnet/sqlcipher/database/SQLiteDatabaseHook;)V
    .locals 7
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "name"    # Ljava/lang/String;
    .param p3, "factory"    # Lnet/sqlcipher/database/SQLiteDatabase$CursorFactory;
    .param p4, "version"    # I
    .param p5, "hook"    # Lnet/sqlcipher/database/SQLiteDatabaseHook;

    .prologue
    .line 80
    new-instance v6, Lnet/sqlcipher/DefaultDatabaseErrorHandler;

    invoke-direct {v6}, Lnet/sqlcipher/DefaultDatabaseErrorHandler;-><init>()V

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v4, p4

    move-object v5, p5

    invoke-direct/range {v0 .. v6}, Lnet/sqlcipher/database/SQLiteOpenHelper;-><init>(Landroid/content/Context;Ljava/lang/String;Lnet/sqlcipher/database/SQLiteDatabase$CursorFactory;ILnet/sqlcipher/database/SQLiteDatabaseHook;Lnet/sqlcipher/DatabaseErrorHandler;)V

    .line 81
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Lnet/sqlcipher/database/SQLiteDatabase$CursorFactory;ILnet/sqlcipher/database/SQLiteDatabaseHook;Lnet/sqlcipher/DatabaseErrorHandler;)V
    .locals 3
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "name"    # Ljava/lang/String;
    .param p3, "factory"    # Lnet/sqlcipher/database/SQLiteDatabase$CursorFactory;
    .param p4, "version"    # I
    .param p5, "hook"    # Lnet/sqlcipher/database/SQLiteDatabaseHook;
    .param p6, "errorHandler"    # Lnet/sqlcipher/DatabaseErrorHandler;

    .prologue
    .line 101
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 47
    const/4 v0, 0x0

    iput-object v0, p0, Lnet/sqlcipher/database/SQLiteOpenHelper;->mDatabase:Lnet/sqlcipher/database/SQLiteDatabase;

    .line 48
    const/4 v0, 0x0

    iput-boolean v0, p0, Lnet/sqlcipher/database/SQLiteOpenHelper;->mIsInitializing:Z

    .line 102
    const/4 v0, 0x1

    if-ge p4, v0, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Version must be >= 1, was "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 103
    :cond_0
    if-nez p6, :cond_1

    .line 104
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "DatabaseErrorHandler param value can\'t be null."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 107
    :cond_1
    iput-object p1, p0, Lnet/sqlcipher/database/SQLiteOpenHelper;->mContext:Landroid/content/Context;

    .line 108
    iput-object p2, p0, Lnet/sqlcipher/database/SQLiteOpenHelper;->mName:Ljava/lang/String;

    .line 109
    iput-object p3, p0, Lnet/sqlcipher/database/SQLiteOpenHelper;->mFactory:Lnet/sqlcipher/database/SQLiteDatabase$CursorFactory;

    .line 110
    iput p4, p0, Lnet/sqlcipher/database/SQLiteOpenHelper;->mNewVersion:I

    .line 111
    iput-object p5, p0, Lnet/sqlcipher/database/SQLiteOpenHelper;->mHook:Lnet/sqlcipher/database/SQLiteDatabaseHook;

    .line 112
    iput-object p6, p0, Lnet/sqlcipher/database/SQLiteOpenHelper;->mErrorHandler:Lnet/sqlcipher/DatabaseErrorHandler;

    .line 113
    return-void
.end method


# virtual methods
.method public declared-synchronized close()V
    .locals 2

    .prologue
    .line 269
    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lnet/sqlcipher/database/SQLiteOpenHelper;->mIsInitializing:Z

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Closed during initialization"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 271
    :cond_0
    :try_start_1
    iget-object v0, p0, Lnet/sqlcipher/database/SQLiteOpenHelper;->mDatabase:Lnet/sqlcipher/database/SQLiteDatabase;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lnet/sqlcipher/database/SQLiteOpenHelper;->mDatabase:Lnet/sqlcipher/database/SQLiteDatabase;

    invoke-virtual {v0}, Lnet/sqlcipher/database/SQLiteDatabase;->isOpen()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 272
    iget-object v0, p0, Lnet/sqlcipher/database/SQLiteOpenHelper;->mDatabase:Lnet/sqlcipher/database/SQLiteDatabase;

    invoke-virtual {v0}, Lnet/sqlcipher/database/SQLiteDatabase;->close()V

    .line 273
    const/4 v0, 0x0

    iput-object v0, p0, Lnet/sqlcipher/database/SQLiteOpenHelper;->mDatabase:Lnet/sqlcipher/database/SQLiteDatabase;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 275
    :cond_1
    monitor-exit p0

    return-void
.end method

.method public declared-synchronized getReadableDatabase(Ljava/lang/String;)Lnet/sqlcipher/database/SQLiteDatabase;
    .locals 1
    .param p1, "password"    # Ljava/lang/String;

    .prologue
    .line 214
    monitor-enter p0

    :try_start_0
    invoke-virtual {p1}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    invoke-virtual {p0, v0}, Lnet/sqlcipher/database/SQLiteOpenHelper;->getReadableDatabase([C)Lnet/sqlcipher/database/SQLiteDatabase;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized getReadableDatabase([C)Lnet/sqlcipher/database/SQLiteDatabase;
    .locals 8
    .param p1, "password"    # [C

    .prologue
    .line 218
    monitor-enter p0

    :try_start_0
    iget-object v5, p0, Lnet/sqlcipher/database/SQLiteOpenHelper;->mDatabase:Lnet/sqlcipher/database/SQLiteDatabase;

    if-eqz v5, :cond_1

    iget-object v5, p0, Lnet/sqlcipher/database/SQLiteOpenHelper;->mDatabase:Lnet/sqlcipher/database/SQLiteDatabase;

    invoke-virtual {v5}, Lnet/sqlcipher/database/SQLiteDatabase;->isOpen()Z

    move-result v5

    if-eqz v5, :cond_1

    .line 219
    iget-object v5, p0, Lnet/sqlcipher/database/SQLiteOpenHelper;->mDatabase:Lnet/sqlcipher/database/SQLiteDatabase;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 261
    :cond_0
    :goto_0
    monitor-exit p0

    return-object v5

    .line 222
    :cond_1
    :try_start_1
    iget-boolean v5, p0, Lnet/sqlcipher/database/SQLiteOpenHelper;->mIsInitializing:Z

    if-eqz v5, :cond_2

    .line 223
    new-instance v5, Ljava/lang/IllegalStateException;

    const-string v6, "getReadableDatabase called recursively"

    invoke-direct {v5, v6}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 218
    :catchall_0
    move-exception v5

    monitor-exit p0

    throw v5

    .line 227
    :cond_2
    :try_start_2
    invoke-virtual {p0, p1}, Lnet/sqlcipher/database/SQLiteOpenHelper;->getWritableDatabase([C)Lnet/sqlcipher/database/SQLiteDatabase;
    :try_end_2
    .catch Lnet/sqlcipher/database/SQLiteException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move-result-object v5

    goto :goto_0

    .line 228
    :catch_0
    move-exception v3

    .line 229
    .local v3, "e":Lnet/sqlcipher/database/SQLiteException;
    :try_start_3
    iget-object v5, p0, Lnet/sqlcipher/database/SQLiteOpenHelper;->mName:Ljava/lang/String;

    if-nez v5, :cond_3

    throw v3

    .line 230
    :cond_3
    sget-object v5, Lnet/sqlcipher/database/SQLiteOpenHelper;->TAG:Ljava/lang/String;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "Couldn\'t open "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    iget-object v7, p0, Lnet/sqlcipher/database/SQLiteOpenHelper;->mName:Ljava/lang/String;

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v7, " for writing (will try read-only):"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 233
    const/4 v2, 0x0

    .line 235
    .local v2, "db":Lnet/sqlcipher/database/SQLiteDatabase;
    const/4 v5, 0x1

    :try_start_4
    iput-boolean v5, p0, Lnet/sqlcipher/database/SQLiteOpenHelper;->mIsInitializing:Z

    .line 236
    iget-object v5, p0, Lnet/sqlcipher/database/SQLiteOpenHelper;->mContext:Landroid/content/Context;

    iget-object v6, p0, Lnet/sqlcipher/database/SQLiteOpenHelper;->mName:Ljava/lang/String;

    invoke-virtual {v5, v6}, Landroid/content/Context;->getDatabasePath(Ljava/lang/String;)Ljava/io/File;

    move-result-object v5

    invoke-virtual {v5}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v4

    .line 237
    .local v4, "path":Ljava/lang/String;
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 238
    .local v0, "databasePath":Ljava/io/File;
    new-instance v1, Ljava/io/File;

    iget-object v5, p0, Lnet/sqlcipher/database/SQLiteOpenHelper;->mContext:Landroid/content/Context;

    iget-object v6, p0, Lnet/sqlcipher/database/SQLiteOpenHelper;->mName:Ljava/lang/String;

    invoke-virtual {v5, v6}, Landroid/content/Context;->getDatabasePath(Ljava/lang/String;)Ljava/io/File;

    move-result-object v5

    invoke-virtual {v5}, Ljava/io/File;->getParent()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v1, v5}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 240
    .local v1, "databasesDirectory":Ljava/io/File;
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v5

    if-nez v5, :cond_4

    .line 241
    invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z

    .line 243
    :cond_4
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v5

    if-nez v5, :cond_5

    .line 244
    const/4 v5, 0x0

    iput-boolean v5, p0, Lnet/sqlcipher/database/SQLiteOpenHelper;->mIsInitializing:Z

    .line 245
    invoke-virtual {p0, p1}, Lnet/sqlcipher/database/SQLiteOpenHelper;->getWritableDatabase([C)Lnet/sqlcipher/database/SQLiteDatabase;

    move-result-object v2

    .line 246
    const/4 v5, 0x1

    iput-boolean v5, p0, Lnet/sqlcipher/database/SQLiteOpenHelper;->mIsInitializing:Z

    .line 247
    invoke-virtual {v2}, Lnet/sqlcipher/database/SQLiteDatabase;->close()V

    .line 249
    :cond_5
    iget-object v5, p0, Lnet/sqlcipher/database/SQLiteOpenHelper;->mFactory:Lnet/sqlcipher/database/SQLiteDatabase$CursorFactory;

    const/4 v6, 0x1

    invoke-static {v4, p1, v5, v6}, Lnet/sqlcipher/database/SQLiteDatabase;->openDatabase(Ljava/lang/String;[CLnet/sqlcipher/database/SQLiteDatabase$CursorFactory;I)Lnet/sqlcipher/database/SQLiteDatabase;

    move-result-object v2

    .line 250
    invoke-virtual {v2}, Lnet/sqlcipher/database/SQLiteDatabase;->getVersion()I

    move-result v5

    iget v6, p0, Lnet/sqlcipher/database/SQLiteOpenHelper;->mNewVersion:I

    if-eq v5, v6, :cond_7

    .line 251
    new-instance v5, Lnet/sqlcipher/database/SQLiteException;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "Can\'t upgrade read-only database from version "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v2}, Lnet/sqlcipher/database/SQLiteDatabase;->getVersion()I

    move-result v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v7, " to "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    iget v7, p0, Lnet/sqlcipher/database/SQLiteOpenHelper;->mNewVersion:I

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v7, ": "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v5, v6}, Lnet/sqlcipher/database/SQLiteException;-><init>(Ljava/lang/String;)V

    throw v5
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 260
    .end local v0    # "databasePath":Ljava/io/File;
    .end local v1    # "databasesDirectory":Ljava/io/File;
    .end local v4    # "path":Ljava/lang/String;
    :catchall_1
    move-exception v5

    const/4 v6, 0x0

    :try_start_5
    iput-boolean v6, p0, Lnet/sqlcipher/database/SQLiteOpenHelper;->mIsInitializing:Z

    .line 261
    if-eqz v2, :cond_6

    iget-object v6, p0, Lnet/sqlcipher/database/SQLiteOpenHelper;->mDatabase:Lnet/sqlcipher/database/SQLiteDatabase;

    if-eq v2, v6, :cond_6

    invoke-virtual {v2}, Lnet/sqlcipher/database/SQLiteDatabase;->close()V

    :cond_6
    throw v5
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 255
    .restart local v0    # "databasePath":Ljava/io/File;
    .restart local v1    # "databasesDirectory":Ljava/io/File;
    .restart local v4    # "path":Ljava/lang/String;
    :cond_7
    :try_start_6
    invoke-virtual {p0, v2}, Lnet/sqlcipher/database/SQLiteOpenHelper;->onOpen(Lnet/sqlcipher/database/SQLiteDatabase;)V

    .line 256
    sget-object v5, Lnet/sqlcipher/database/SQLiteOpenHelper;->TAG:Ljava/lang/String;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "Opened "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    iget-object v7, p0, Lnet/sqlcipher/database/SQLiteOpenHelper;->mName:Ljava/lang/String;

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v7, " in read-only mode"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 257
    iput-object v2, p0, Lnet/sqlcipher/database/SQLiteOpenHelper;->mDatabase:Lnet/sqlcipher/database/SQLiteDatabase;

    .line 258
    iget-object v5, p0, Lnet/sqlcipher/database/SQLiteOpenHelper;->mDatabase:Lnet/sqlcipher/database/SQLiteDatabase;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 260
    const/4 v6, 0x0

    :try_start_7
    iput-boolean v6, p0, Lnet/sqlcipher/database/SQLiteOpenHelper;->mIsInitializing:Z

    .line 261
    if-eqz v2, :cond_0

    iget-object v6, p0, Lnet/sqlcipher/database/SQLiteOpenHelper;->mDatabase:Lnet/sqlcipher/database/SQLiteDatabase;

    if-eq v2, v6, :cond_0

    invoke-virtual {v2}, Lnet/sqlcipher/database/SQLiteDatabase;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    goto/16 :goto_0
.end method

.method public declared-synchronized getWritableDatabase(Ljava/lang/String;)Lnet/sqlcipher/database/SQLiteDatabase;
    .locals 1
    .param p1, "password"    # Ljava/lang/String;

    .prologue
    .line 129
    monitor-enter p0

    :try_start_0
    invoke-virtual {p1}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    invoke-virtual {p0, v0}, Lnet/sqlcipher/database/SQLiteOpenHelper;->getWritableDatabase([C)Lnet/sqlcipher/database/SQLiteDatabase;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized getWritableDatabase([C)Lnet/sqlcipher/database/SQLiteDatabase;
    .locals 8
    .param p1, "password"    # [C

    .prologue
    .line 133
    monitor-enter p0

    :try_start_0
    iget-object v5, p0, Lnet/sqlcipher/database/SQLiteOpenHelper;->mDatabase:Lnet/sqlcipher/database/SQLiteDatabase;

    if-eqz v5, :cond_1

    iget-object v5, p0, Lnet/sqlcipher/database/SQLiteOpenHelper;->mDatabase:Lnet/sqlcipher/database/SQLiteDatabase;

    invoke-virtual {v5}, Lnet/sqlcipher/database/SQLiteDatabase;->isOpen()Z

    move-result v5

    if-eqz v5, :cond_1

    iget-object v5, p0, Lnet/sqlcipher/database/SQLiteOpenHelper;->mDatabase:Lnet/sqlcipher/database/SQLiteDatabase;

    invoke-virtual {v5}, Lnet/sqlcipher/database/SQLiteDatabase;->isReadOnly()Z

    move-result v5

    if-nez v5, :cond_1

    .line 134
    iget-object v0, p0, Lnet/sqlcipher/database/SQLiteOpenHelper;->mDatabase:Lnet/sqlcipher/database/SQLiteDatabase;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 195
    :cond_0
    :goto_0
    monitor-exit p0

    return-object v0

    .line 137
    :cond_1
    :try_start_1
    iget-boolean v5, p0, Lnet/sqlcipher/database/SQLiteOpenHelper;->mIsInitializing:Z

    if-eqz v5, :cond_2

    .line 138
    new-instance v5, Ljava/lang/IllegalStateException;

    const-string v6, "getWritableDatabase called recursively"

    invoke-direct {v5, v6}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 133
    :catchall_0
    move-exception v5

    monitor-exit p0

    throw v5

    .line 147
    :cond_2
    const/4 v3, 0x0

    .line 148
    .local v3, "success":Z
    const/4 v0, 0x0

    .line 149
    .local v0, "db":Lnet/sqlcipher/database/SQLiteDatabase;
    :try_start_2
    iget-object v5, p0, Lnet/sqlcipher/database/SQLiteOpenHelper;->mDatabase:Lnet/sqlcipher/database/SQLiteDatabase;

    if-eqz v5, :cond_3

    iget-object v5, p0, Lnet/sqlcipher/database/SQLiteOpenHelper;->mDatabase:Lnet/sqlcipher/database/SQLiteDatabase;

    invoke-virtual {v5}, Lnet/sqlcipher/database/SQLiteDatabase;->lock()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 151
    :cond_3
    const/4 v5, 0x1

    :try_start_3
    iput-boolean v5, p0, Lnet/sqlcipher/database/SQLiteOpenHelper;->mIsInitializing:Z

    .line 152
    iget-object v5, p0, Lnet/sqlcipher/database/SQLiteOpenHelper;->mName:Ljava/lang/String;

    if-nez v5, :cond_6

    .line 153
    const/4 v5, 0x0

    invoke-static {v5, p1}, Lnet/sqlcipher/database/SQLiteDatabase;->create(Lnet/sqlcipher/database/SQLiteDatabase$CursorFactory;[C)Lnet/sqlcipher/database/SQLiteDatabase;

    move-result-object v0

    .line 166
    :goto_1
    invoke-virtual {v0}, Lnet/sqlcipher/database/SQLiteDatabase;->getVersion()I

    move-result v4

    .line 167
    .local v4, "version":I
    iget v5, p0, Lnet/sqlcipher/database/SQLiteOpenHelper;->mNewVersion:I

    if-eq v4, v5, :cond_4

    .line 168
    invoke-virtual {v0}, Lnet/sqlcipher/database/SQLiteDatabase;->beginTransaction()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 170
    if-nez v4, :cond_8

    .line 171
    :try_start_4
    invoke-virtual {p0, v0}, Lnet/sqlcipher/database/SQLiteOpenHelper;->onCreate(Lnet/sqlcipher/database/SQLiteDatabase;)V

    .line 175
    :goto_2
    iget v5, p0, Lnet/sqlcipher/database/SQLiteOpenHelper;->mNewVersion:I

    invoke-virtual {v0, v5}, Lnet/sqlcipher/database/SQLiteDatabase;->setVersion(I)V

    .line 176
    invoke-virtual {v0}, Lnet/sqlcipher/database/SQLiteDatabase;->setTransactionSuccessful()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 178
    :try_start_5
    invoke-virtual {v0}, Lnet/sqlcipher/database/SQLiteDatabase;->endTransaction()V

    .line 182
    :cond_4
    invoke-virtual {p0, v0}, Lnet/sqlcipher/database/SQLiteOpenHelper;->onOpen(Lnet/sqlcipher/database/SQLiteDatabase;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 183
    const/4 v3, 0x1

    .line 186
    const/4 v5, 0x0

    :try_start_6
    iput-boolean v5, p0, Lnet/sqlcipher/database/SQLiteOpenHelper;->mIsInitializing:Z

    .line 187
    if-eqz v3, :cond_b

    .line 188
    iget-object v5, p0, Lnet/sqlcipher/database/SQLiteOpenHelper;->mDatabase:Lnet/sqlcipher/database/SQLiteDatabase;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    if-eqz v5, :cond_5

    .line 189
    :try_start_7
    iget-object v5, p0, Lnet/sqlcipher/database/SQLiteOpenHelper;->mDatabase:Lnet/sqlcipher/database/SQLiteDatabase;

    invoke-virtual {v5}, Lnet/sqlcipher/database/SQLiteDatabase;->close()V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_1
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 190
    :goto_3
    :try_start_8
    iget-object v5, p0, Lnet/sqlcipher/database/SQLiteOpenHelper;->mDatabase:Lnet/sqlcipher/database/SQLiteDatabase;

    invoke-virtual {v5}, Lnet/sqlcipher/database/SQLiteDatabase;->unlock()V

    .line 192
    :cond_5
    iput-object v0, p0, Lnet/sqlcipher/database/SQLiteOpenHelper;->mDatabase:Lnet/sqlcipher/database/SQLiteDatabase;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    goto :goto_0

    .line 156
    .end local v4    # "version":I
    :cond_6
    :try_start_9
    iget-object v5, p0, Lnet/sqlcipher/database/SQLiteOpenHelper;->mContext:Landroid/content/Context;

    iget-object v6, p0, Lnet/sqlcipher/database/SQLiteOpenHelper;->mName:Ljava/lang/String;

    invoke-virtual {v5, v6}, Landroid/content/Context;->getDatabasePath(Ljava/lang/String;)Ljava/io/File;

    move-result-object v5

    invoke-virtual {v5}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v2

    .line 158
    .local v2, "path":Ljava/lang/String;
    new-instance v1, Ljava/io/File;

    invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 159
    .local v1, "dbPathFile":Ljava/io/File;
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v5

    if-nez v5, :cond_7

    .line 160
    invoke-virtual {v1}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v5

    invoke-virtual {v5}, Ljava/io/File;->mkdirs()Z

    .line 162
    :cond_7
    iget-object v5, p0, Lnet/sqlcipher/database/SQLiteOpenHelper;->mFactory:Lnet/sqlcipher/database/SQLiteDatabase$CursorFactory;

    iget-object v6, p0, Lnet/sqlcipher/database/SQLiteOpenHelper;->mHook:Lnet/sqlcipher/database/SQLiteDatabaseHook;

    iget-object v7, p0, Lnet/sqlcipher/database/SQLiteOpenHelper;->mErrorHandler:Lnet/sqlcipher/DatabaseErrorHandler;

    invoke-static {v2, p1, v5, v6, v7}, Lnet/sqlcipher/database/SQLiteDatabase;->openOrCreateDatabase(Ljava/lang/String;[CLnet/sqlcipher/database/SQLiteDatabase$CursorFactory;Lnet/sqlcipher/database/SQLiteDatabaseHook;Lnet/sqlcipher/DatabaseErrorHandler;)Lnet/sqlcipher/database/SQLiteDatabase;
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    move-result-object v0

    goto :goto_1

    .line 173
    .end local v1    # "dbPathFile":Ljava/io/File;
    .end local v2    # "path":Ljava/lang/String;
    .restart local v4    # "version":I
    :cond_8
    :try_start_a
    iget v5, p0, Lnet/sqlcipher/database/SQLiteOpenHelper;->mNewVersion:I

    invoke-virtual {p0, v0, v4, v5}, Lnet/sqlcipher/database/SQLiteOpenHelper;->onUpgrade(Lnet/sqlcipher/database/SQLiteDatabase;II)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_1

    goto :goto_2

    .line 178
    :catchall_1
    move-exception v5

    :try_start_b
    invoke-virtual {v0}, Lnet/sqlcipher/database/SQLiteDatabase;->endTransaction()V

    throw v5
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_2

    .line 186
    .end local v4    # "version":I
    :catchall_2
    move-exception v5

    const/4 v6, 0x0

    :try_start_c
    iput-boolean v6, p0, Lnet/sqlcipher/database/SQLiteOpenHelper;->mIsInitializing:Z

    .line 187
    if-eqz v3, :cond_d

    .line 188
    iget-object v6, p0, Lnet/sqlcipher/database/SQLiteOpenHelper;->mDatabase:Lnet/sqlcipher/database/SQLiteDatabase;
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_0

    if-eqz v6, :cond_9

    .line 189
    :try_start_d
    iget-object v6, p0, Lnet/sqlcipher/database/SQLiteOpenHelper;->mDatabase:Lnet/sqlcipher/database/SQLiteDatabase;

    invoke-virtual {v6}, Lnet/sqlcipher/database/SQLiteDatabase;->close()V
    :try_end_d
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_0
    .catchall {:try_start_d .. :try_end_d} :catchall_0

    .line 190
    :goto_4
    :try_start_e
    iget-object v6, p0, Lnet/sqlcipher/database/SQLiteOpenHelper;->mDatabase:Lnet/sqlcipher/database/SQLiteDatabase;

    invoke-virtual {v6}, Lnet/sqlcipher/database/SQLiteDatabase;->unlock()V

    .line 192
    :cond_9
    iput-object v0, p0, Lnet/sqlcipher/database/SQLiteOpenHelper;->mDatabase:Lnet/sqlcipher/database/SQLiteDatabase;

    .line 195
    :cond_a
    :goto_5
    throw v5

    .line 194
    .restart local v4    # "version":I
    :cond_b
    iget-object v5, p0, Lnet/sqlcipher/database/SQLiteOpenHelper;->mDatabase:Lnet/sqlcipher/database/SQLiteDatabase;

    if-eqz v5, :cond_c

    iget-object v5, p0, Lnet/sqlcipher/database/SQLiteOpenHelper;->mDatabase:Lnet/sqlcipher/database/SQLiteDatabase;

    invoke-virtual {v5}, Lnet/sqlcipher/database/SQLiteDatabase;->unlock()V

    .line 195
    :cond_c
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lnet/sqlcipher/database/SQLiteDatabase;->close()V

    goto/16 :goto_0

    .line 194
    .end local v4    # "version":I
    :cond_d
    iget-object v6, p0, Lnet/sqlcipher/database/SQLiteOpenHelper;->mDatabase:Lnet/sqlcipher/database/SQLiteDatabase;

    if-eqz v6, :cond_e

    iget-object v6, p0, Lnet/sqlcipher/database/SQLiteOpenHelper;->mDatabase:Lnet/sqlcipher/database/SQLiteDatabase;

    invoke-virtual {v6}, Lnet/sqlcipher/database/SQLiteDatabase;->unlock()V

    .line 195
    :cond_e
    if-eqz v0, :cond_a

    invoke-virtual {v0}, Lnet/sqlcipher/database/SQLiteDatabase;->close()V
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_0

    goto :goto_5

    .line 189
    :catch_0
    move-exception v6

    goto :goto_4

    .restart local v4    # "version":I
    :catch_1
    move-exception v5

    goto :goto_3
.end method

.method public abstract onCreate(Lnet/sqlcipher/database/SQLiteDatabase;)V
.end method

.method public onOpen(Lnet/sqlcipher/database/SQLiteDatabase;)V
    .locals 0
    .param p1, "db"    # Lnet/sqlcipher/database/SQLiteDatabase;

    .prologue
    .line 309
    return-void
.end method

.method public abstract onUpgrade(Lnet/sqlcipher/database/SQLiteDatabase;II)V
.end method
