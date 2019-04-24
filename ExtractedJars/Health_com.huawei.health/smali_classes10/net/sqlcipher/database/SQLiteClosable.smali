.class public abstract Lnet/sqlcipher/database/SQLiteClosable;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private mLock:Ljava/lang/Object;

.field private mReferenceCount:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    const/4 v0, 0x1

    iput v0, p0, Lnet/sqlcipher/database/SQLiteClosable;->mReferenceCount:I

    .line 26
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lnet/sqlcipher/database/SQLiteClosable;->mLock:Ljava/lang/Object;

    return-void
.end method

.method private getObjInfo()Ljava/lang/String;
    .locals 2

    .line 60
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 61
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    const-string v0, " ("

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    instance-of v0, p0, Lnet/sqlcipher/database/SQLiteDatabase;

    if-eqz v0, :cond_0

    .line 64
    const-string v0, "database = "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    move-object v0, p0

    check-cast v0, Lnet/sqlcipher/database/SQLiteDatabase;

    invoke-virtual {v0}, Lnet/sqlcipher/database/SQLiteDatabase;->getPath()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 66
    :cond_0
    instance-of v0, p0, Lnet/sqlcipher/database/SQLiteProgram;

    if-nez v0, :cond_1

    instance-of v0, p0, Lnet/sqlcipher/database/SQLiteStatement;

    if-nez v0, :cond_1

    instance-of v0, p0, Lnet/sqlcipher/database/SQLiteQuery;

    if-eqz v0, :cond_2

    .line 68
    :cond_1
    const-string v0, "mSql = "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    move-object v0, p0

    check-cast v0, Lnet/sqlcipher/database/SQLiteProgram;

    iget-object v0, v0, Lnet/sqlcipher/database/SQLiteProgram;->mSql:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    :cond_2
    :goto_0
    const-string v0, ") "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public acquireReference()V
    .locals 5

    .line 32
    iget-object v3, p0, Lnet/sqlcipher/database/SQLiteClosable;->mLock:Ljava/lang/Object;

    monitor-enter v3

    .line 33
    :try_start_0
    iget v0, p0, Lnet/sqlcipher/database/SQLiteClosable;->mReferenceCount:I

    if-gtz v0, :cond_0

    .line 34
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "attempt to re-open an already-closed object: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 35
    invoke-direct {p0}, Lnet/sqlcipher/database/SQLiteClosable;->getObjInfo()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 37
    :cond_0
    iget v0, p0, Lnet/sqlcipher/database/SQLiteClosable;->mReferenceCount:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lnet/sqlcipher/database/SQLiteClosable;->mReferenceCount:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 38
    monitor-exit v3

    goto :goto_0

    :catchall_0
    move-exception v4

    monitor-exit v3

    throw v4

    .line 39
    :goto_0
    return-void
.end method

.method protected abstract onAllReferencesReleased()V
.end method

.method protected onAllReferencesReleasedFromContainer()V
    .locals 0

    .line 29
    return-void
.end method

.method public releaseReference()V
    .locals 4

    .line 42
    iget-object v2, p0, Lnet/sqlcipher/database/SQLiteClosable;->mLock:Ljava/lang/Object;

    monitor-enter v2

    .line 43
    :try_start_0
    iget v0, p0, Lnet/sqlcipher/database/SQLiteClosable;->mReferenceCount:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lnet/sqlcipher/database/SQLiteClosable;->mReferenceCount:I

    .line 44
    iget v0, p0, Lnet/sqlcipher/database/SQLiteClosable;->mReferenceCount:I

    if-nez v0, :cond_0

    .line 45
    invoke-virtual {p0}, Lnet/sqlcipher/database/SQLiteClosable;->onAllReferencesReleased()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 47
    :cond_0
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3

    .line 48
    :goto_0
    return-void
.end method

.method public releaseReferenceFromContainer()V
    .locals 4

    .line 51
    iget-object v2, p0, Lnet/sqlcipher/database/SQLiteClosable;->mLock:Ljava/lang/Object;

    monitor-enter v2

    .line 52
    :try_start_0
    iget v0, p0, Lnet/sqlcipher/database/SQLiteClosable;->mReferenceCount:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lnet/sqlcipher/database/SQLiteClosable;->mReferenceCount:I

    .line 53
    iget v0, p0, Lnet/sqlcipher/database/SQLiteClosable;->mReferenceCount:I

    if-nez v0, :cond_0

    .line 54
    invoke-virtual {p0}, Lnet/sqlcipher/database/SQLiteClosable;->onAllReferencesReleasedFromContainer()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 56
    :cond_0
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3

    .line 57
    :goto_0
    return-void
.end method
