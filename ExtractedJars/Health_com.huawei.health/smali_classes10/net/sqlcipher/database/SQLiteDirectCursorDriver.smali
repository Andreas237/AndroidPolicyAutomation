.class public Lnet/sqlcipher/database/SQLiteDirectCursorDriver;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lnet/sqlcipher/database/SQLiteCursorDriver;


# instance fields
.field private mCursor:Lnet/sqlcipher/Cursor;

.field private mDatabase:Lnet/sqlcipher/database/SQLiteDatabase;

.field private mEditTable:Ljava/lang/String;

.field private mQuery:Lnet/sqlcipher/database/SQLiteQuery;

.field private mSql:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lnet/sqlcipher/database/SQLiteDatabase;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    iput-object p1, p0, Lnet/sqlcipher/database/SQLiteDirectCursorDriver;->mDatabase:Lnet/sqlcipher/database/SQLiteDatabase;

    .line 36
    iput-object p3, p0, Lnet/sqlcipher/database/SQLiteDirectCursorDriver;->mEditTable:Ljava/lang/String;

    .line 37
    iput-object p2, p0, Lnet/sqlcipher/database/SQLiteDirectCursorDriver;->mSql:Ljava/lang/String;

    .line 38
    return-void
.end method


# virtual methods
.method public cursorClosed()V
    .locals 1

    .line 87
    const/4 v0, 0x0

    iput-object v0, p0, Lnet/sqlcipher/database/SQLiteDirectCursorDriver;->mCursor:Lnet/sqlcipher/Cursor;

    .line 88
    return-void
.end method

.method public cursorDeactivated()V
    .locals 0

    .line 100
    return-void
.end method

.method public cursorRequeried(Landroid/database/Cursor;)V
    .locals 0

    .line 105
    return-void
.end method

.method public query(Lnet/sqlcipher/database/SQLiteDatabase$CursorFactory;[Ljava/lang/Object;)Lnet/sqlcipher/Cursor;
    .locals 6

    .line 41
    new-instance v3, Lnet/sqlcipher/database/SQLiteQuery;

    iget-object v0, p0, Lnet/sqlcipher/database/SQLiteDirectCursorDriver;->mDatabase:Lnet/sqlcipher/database/SQLiteDatabase;

    iget-object v1, p0, Lnet/sqlcipher/database/SQLiteDirectCursorDriver;->mSql:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-direct {v3, v0, v1, v2, p2}, Lnet/sqlcipher/database/SQLiteQuery;-><init>(Lnet/sqlcipher/database/SQLiteDatabase;Ljava/lang/String;I[Ljava/lang/Object;)V

    .line 43
    :try_start_0
    invoke-virtual {v3, p2}, Lnet/sqlcipher/database/SQLiteQuery;->bindArguments([Ljava/lang/Object;)V

    .line 44
    if-nez p1, :cond_0

    .line 45
    new-instance v0, Lnet/sqlcipher/database/SQLiteCursor;

    iget-object v1, p0, Lnet/sqlcipher/database/SQLiteDirectCursorDriver;->mDatabase:Lnet/sqlcipher/database/SQLiteDatabase;

    iget-object v2, p0, Lnet/sqlcipher/database/SQLiteDirectCursorDriver;->mEditTable:Ljava/lang/String;

    invoke-direct {v0, v1, p0, v2, v3}, Lnet/sqlcipher/database/SQLiteCursor;-><init>(Lnet/sqlcipher/database/SQLiteDatabase;Lnet/sqlcipher/database/SQLiteCursorDriver;Ljava/lang/String;Lnet/sqlcipher/database/SQLiteQuery;)V

    iput-object v0, p0, Lnet/sqlcipher/database/SQLiteDirectCursorDriver;->mCursor:Lnet/sqlcipher/Cursor;

    goto :goto_0

    .line 47
    :cond_0
    iget-object v0, p0, Lnet/sqlcipher/database/SQLiteDirectCursorDriver;->mDatabase:Lnet/sqlcipher/database/SQLiteDatabase;

    iget-object v1, p0, Lnet/sqlcipher/database/SQLiteDirectCursorDriver;->mEditTable:Ljava/lang/String;

    invoke-interface {p1, v0, p0, v1, v3}, Lnet/sqlcipher/database/SQLiteDatabase$CursorFactory;->newCursor(Lnet/sqlcipher/database/SQLiteDatabase;Lnet/sqlcipher/database/SQLiteCursorDriver;Ljava/lang/String;Lnet/sqlcipher/database/SQLiteQuery;)Lnet/sqlcipher/Cursor;

    move-result-object v0

    iput-object v0, p0, Lnet/sqlcipher/database/SQLiteDirectCursorDriver;->mCursor:Lnet/sqlcipher/Cursor;

    .line 49
    :goto_0
    iput-object v3, p0, Lnet/sqlcipher/database/SQLiteDirectCursorDriver;->mQuery:Lnet/sqlcipher/database/SQLiteQuery;

    .line 50
    const/4 v3, 0x0

    .line 51
    iget-object v4, p0, Lnet/sqlcipher/database/SQLiteDirectCursorDriver;->mCursor:Lnet/sqlcipher/Cursor;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 54
    nop

    return-object v4

    :catchall_0
    move-exception v5

    if-eqz v3, :cond_1

    invoke-virtual {v3}, Lnet/sqlcipher/database/SQLiteQuery;->close()V

    :cond_1
    throw v5
.end method

.method public query(Lnet/sqlcipher/database/SQLiteDatabase$CursorFactory;[Ljava/lang/String;)Lnet/sqlcipher/Cursor;
    .locals 7

    .line 60
    new-instance v3, Lnet/sqlcipher/database/SQLiteQuery;

    iget-object v0, p0, Lnet/sqlcipher/database/SQLiteDirectCursorDriver;->mDatabase:Lnet/sqlcipher/database/SQLiteDatabase;

    iget-object v1, p0, Lnet/sqlcipher/database/SQLiteDirectCursorDriver;->mSql:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-direct {v3, v0, v1, v2, p2}, Lnet/sqlcipher/database/SQLiteQuery;-><init>(Lnet/sqlcipher/database/SQLiteDatabase;Ljava/lang/String;I[Ljava/lang/String;)V

    .line 64
    if-nez p2, :cond_0

    const/4 v4, 0x0

    goto :goto_0

    :cond_0
    :try_start_0
    array-length v4, p2

    .line 65
    :goto_0
    const/4 v5, 0x0

    :goto_1
    if-ge v5, v4, :cond_1

    .line 66
    add-int/lit8 v0, v5, 0x1

    aget-object v1, p2, v5

    invoke-virtual {v3, v0, v1}, Lnet/sqlcipher/database/SQLiteQuery;->bindString(ILjava/lang/String;)V

    .line 65
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    .line 70
    :cond_1
    if-nez p1, :cond_2

    .line 71
    new-instance v0, Lnet/sqlcipher/database/SQLiteCursor;

    iget-object v1, p0, Lnet/sqlcipher/database/SQLiteDirectCursorDriver;->mDatabase:Lnet/sqlcipher/database/SQLiteDatabase;

    iget-object v2, p0, Lnet/sqlcipher/database/SQLiteDirectCursorDriver;->mEditTable:Ljava/lang/String;

    invoke-direct {v0, v1, p0, v2, v3}, Lnet/sqlcipher/database/SQLiteCursor;-><init>(Lnet/sqlcipher/database/SQLiteDatabase;Lnet/sqlcipher/database/SQLiteCursorDriver;Ljava/lang/String;Lnet/sqlcipher/database/SQLiteQuery;)V

    iput-object v0, p0, Lnet/sqlcipher/database/SQLiteDirectCursorDriver;->mCursor:Lnet/sqlcipher/Cursor;

    goto :goto_2

    .line 74
    :cond_2
    iget-object v0, p0, Lnet/sqlcipher/database/SQLiteDirectCursorDriver;->mDatabase:Lnet/sqlcipher/database/SQLiteDatabase;

    iget-object v1, p0, Lnet/sqlcipher/database/SQLiteDirectCursorDriver;->mEditTable:Ljava/lang/String;

    invoke-interface {p1, v0, p0, v1, v3}, Lnet/sqlcipher/database/SQLiteDatabase$CursorFactory;->newCursor(Lnet/sqlcipher/database/SQLiteDatabase;Lnet/sqlcipher/database/SQLiteCursorDriver;Ljava/lang/String;Lnet/sqlcipher/database/SQLiteQuery;)Lnet/sqlcipher/Cursor;

    move-result-object v0

    iput-object v0, p0, Lnet/sqlcipher/database/SQLiteDirectCursorDriver;->mCursor:Lnet/sqlcipher/Cursor;

    .line 77
    :goto_2
    iput-object v3, p0, Lnet/sqlcipher/database/SQLiteDirectCursorDriver;->mQuery:Lnet/sqlcipher/database/SQLiteQuery;

    .line 78
    const/4 v3, 0x0

    .line 79
    iget-object v5, p0, Lnet/sqlcipher/database/SQLiteDirectCursorDriver;->mCursor:Lnet/sqlcipher/Cursor;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 82
    nop

    return-object v5

    :catchall_0
    move-exception v6

    if-eqz v3, :cond_3

    invoke-virtual {v3}, Lnet/sqlcipher/database/SQLiteQuery;->close()V

    :cond_3
    throw v6
.end method

.method public setBindArguments([Ljava/lang/String;)V
    .locals 5

    .line 91
    array-length v3, p1

    .line 92
    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_0

    .line 93
    iget-object v0, p0, Lnet/sqlcipher/database/SQLiteDirectCursorDriver;->mQuery:Lnet/sqlcipher/database/SQLiteQuery;

    add-int/lit8 v1, v4, 0x1

    aget-object v2, p1, v4

    invoke-virtual {v0, v1, v2}, Lnet/sqlcipher/database/SQLiteQuery;->bindString(ILjava/lang/String;)V

    .line 92
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 95
    :cond_0
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 109
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "SQLiteDirectCursorDriver: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lnet/sqlcipher/database/SQLiteDirectCursorDriver;->mSql:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
