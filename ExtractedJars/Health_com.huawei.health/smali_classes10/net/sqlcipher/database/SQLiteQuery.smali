.class public Lnet/sqlcipher/database/SQLiteQuery;
.super Lnet/sqlcipher/database/SQLiteProgram;
.source "SourceFile"


# static fields
.field private static final TAG:Ljava/lang/String; = "Cursor"


# instance fields
.field private mBindArgs:[Ljava/lang/String;

.field private mObjectBindArgs:[Ljava/lang/Object;

.field private mOffsetIndex:I


# direct methods
.method constructor <init>(Lnet/sqlcipher/database/SQLiteDatabase;Ljava/lang/String;I[Ljava/lang/Object;)V
    .locals 2

    .line 55
    invoke-direct {p0, p1, p2}, Lnet/sqlcipher/database/SQLiteProgram;-><init>(Lnet/sqlcipher/database/SQLiteDatabase;Ljava/lang/String;)V

    .line 56
    iput p3, p0, Lnet/sqlcipher/database/SQLiteQuery;->mOffsetIndex:I

    .line 57
    iput-object p4, p0, Lnet/sqlcipher/database/SQLiteQuery;->mObjectBindArgs:[Ljava/lang/Object;

    .line 58
    iget-object v0, p0, Lnet/sqlcipher/database/SQLiteQuery;->mObjectBindArgs:[Ljava/lang/Object;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lnet/sqlcipher/database/SQLiteQuery;->mObjectBindArgs:[Ljava/lang/Object;

    array-length v1, v0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 59
    :goto_0
    new-array v0, v1, [Ljava/lang/String;

    iput-object v0, p0, Lnet/sqlcipher/database/SQLiteQuery;->mBindArgs:[Ljava/lang/String;

    .line 60
    return-void
.end method

.method constructor <init>(Lnet/sqlcipher/database/SQLiteDatabase;Ljava/lang/String;I[Ljava/lang/String;)V
    .locals 0

    .line 48
    invoke-direct {p0, p1, p2}, Lnet/sqlcipher/database/SQLiteProgram;-><init>(Lnet/sqlcipher/database/SQLiteDatabase;Ljava/lang/String;)V

    .line 50
    iput p3, p0, Lnet/sqlcipher/database/SQLiteQuery;->mOffsetIndex:I

    .line 51
    iput-object p4, p0, Lnet/sqlcipher/database/SQLiteQuery;->mBindArgs:[Ljava/lang/String;

    .line 52
    return-void
.end method

.method private final native native_column_count()I
.end method

.method private final native native_column_name(I)Ljava/lang/String;
.end method

.method private final native native_fill_window(Lnet/sqlcipher/CursorWindow;IIII)I
.end method


# virtual methods
.method public bindArguments([Ljava/lang/Object;)V
    .locals 6

    .line 192
    if-eqz p1, :cond_8

    array-length v0, p1

    if-lez v0, :cond_8

    .line 193
    const/4 v3, 0x0

    :goto_0
    array-length v0, p1

    if-ge v3, v0, :cond_8

    .line 194
    aget-object v4, p1, v3

    .line 195
    if-nez v4, :cond_0

    .line 196
    add-int/lit8 v0, v3, 0x1

    invoke-virtual {p0, v0}, Lnet/sqlcipher/database/SQLiteQuery;->bindNull(I)V

    goto/16 :goto_2

    .line 197
    :cond_0
    instance-of v0, v4, Ljava/lang/Double;

    if-eqz v0, :cond_1

    .line 198
    add-int/lit8 v0, v3, 0x1

    move-object v1, v4

    check-cast v1, Ljava/lang/Double;

    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v1

    invoke-virtual {p0, v0, v1, v2}, Lnet/sqlcipher/database/SQLiteQuery;->bindDouble(ID)V

    goto/16 :goto_2

    .line 199
    :cond_1
    instance-of v0, v4, Ljava/lang/Float;

    if-eqz v0, :cond_2

    .line 200
    move-object v0, v4

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v5

    .line 201
    add-int/lit8 v0, v3, 0x1

    float-to-double v1, v5

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v1

    invoke-virtual {p0, v0, v1, v2}, Lnet/sqlcipher/database/SQLiteQuery;->bindDouble(ID)V

    .line 202
    goto/16 :goto_2

    :cond_2
    instance-of v0, v4, Ljava/lang/Long;

    if-eqz v0, :cond_3

    .line 203
    add-int/lit8 v0, v3, 0x1

    move-object v1, v4

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-virtual {p0, v0, v1, v2}, Lnet/sqlcipher/database/SQLiteQuery;->bindLong(IJ)V

    goto :goto_2

    .line 204
    :cond_3
    instance-of v0, v4, Ljava/lang/Integer;

    if-eqz v0, :cond_4

    .line 205
    move-object v0, v4

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v5

    .line 206
    add-int/lit8 v0, v3, 0x1

    int-to-long v1, v5

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-virtual {p0, v0, v1, v2}, Lnet/sqlcipher/database/SQLiteQuery;->bindLong(IJ)V

    .line 207
    goto :goto_2

    :cond_4
    instance-of v0, v4, Ljava/lang/Boolean;

    if-eqz v0, :cond_6

    .line 208
    add-int/lit8 v0, v3, 0x1

    move-object v1, v4

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_5

    const-wide/16 v1, 0x1

    goto :goto_1

    :cond_5
    const-wide/16 v1, 0x0

    :goto_1
    invoke-virtual {p0, v0, v1, v2}, Lnet/sqlcipher/database/SQLiteQuery;->bindLong(IJ)V

    goto :goto_2

    .line 209
    :cond_6
    instance-of v0, v4, [B

    if-eqz v0, :cond_7

    .line 210
    add-int/lit8 v0, v3, 0x1

    move-object v1, v4

    check-cast v1, [B

    check-cast v1, [B

    invoke-virtual {p0, v0, v1}, Lnet/sqlcipher/database/SQLiteQuery;->bindBlob(I[B)V

    goto :goto_2

    .line 212
    :cond_7
    add-int/lit8 v0, v3, 0x1

    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lnet/sqlcipher/database/SQLiteQuery;->bindString(ILjava/lang/String;)V

    .line 193
    :goto_2
    add-int/lit8 v3, v3, 0x1

    goto/16 :goto_0

    .line 216
    :cond_8
    return-void
.end method

.method public bindDouble(ID)V
    .locals 3

    .line 181
    iget-object v0, p0, Lnet/sqlcipher/database/SQLiteQuery;->mBindArgs:[Ljava/lang/String;

    add-int/lit8 v1, p1, -0x1

    invoke-static {p2, p3}, Ljava/lang/Double;->toString(D)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    .line 182
    iget-boolean v0, p0, Lnet/sqlcipher/database/SQLiteQuery;->mClosed:Z

    if-nez v0, :cond_0

    invoke-super {p0, p1, p2, p3}, Lnet/sqlcipher/database/SQLiteProgram;->bindDouble(ID)V

    .line 183
    :cond_0
    return-void
.end method

.method public bindLong(IJ)V
    .locals 3

    .line 175
    iget-object v0, p0, Lnet/sqlcipher/database/SQLiteQuery;->mBindArgs:[Ljava/lang/String;

    add-int/lit8 v1, p1, -0x1

    invoke-static {p2, p3}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    .line 176
    iget-boolean v0, p0, Lnet/sqlcipher/database/SQLiteQuery;->mClosed:Z

    if-nez v0, :cond_0

    invoke-super {p0, p1, p2, p3}, Lnet/sqlcipher/database/SQLiteProgram;->bindLong(IJ)V

    .line 177
    :cond_0
    return-void
.end method

.method public bindNull(I)V
    .locals 3

    .line 169
    iget-object v0, p0, Lnet/sqlcipher/database/SQLiteQuery;->mBindArgs:[Ljava/lang/String;

    add-int/lit8 v1, p1, -0x1

    const/4 v2, 0x0

    aput-object v2, v0, v1

    .line 170
    iget-boolean v0, p0, Lnet/sqlcipher/database/SQLiteQuery;->mClosed:Z

    if-nez v0, :cond_0

    invoke-super {p0, p1}, Lnet/sqlcipher/database/SQLiteProgram;->bindNull(I)V

    .line 171
    :cond_0
    return-void
.end method

.method public bindString(ILjava/lang/String;)V
    .locals 2

    .line 187
    iget-object v0, p0, Lnet/sqlcipher/database/SQLiteQuery;->mBindArgs:[Ljava/lang/String;

    add-int/lit8 v1, p1, -0x1

    aput-object p2, v0, v1

    .line 188
    iget-boolean v0, p0, Lnet/sqlcipher/database/SQLiteQuery;->mClosed:Z

    if-nez v0, :cond_0

    invoke-super {p0, p1, p2}, Lnet/sqlcipher/database/SQLiteProgram;->bindString(ILjava/lang/String;)V

    .line 189
    :cond_0
    return-void
.end method

.method columnCountLocked()I
    .locals 2

    .line 110
    invoke-virtual {p0}, Lnet/sqlcipher/database/SQLiteQuery;->acquireReference()V

    .line 112
    :try_start_0
    invoke-direct {p0}, Lnet/sqlcipher/database/SQLiteQuery;->native_column_count()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    .line 114
    invoke-virtual {p0}, Lnet/sqlcipher/database/SQLiteQuery;->releaseReference()V

    return v0

    :catchall_0
    move-exception v1

    invoke-virtual {p0}, Lnet/sqlcipher/database/SQLiteQuery;->releaseReference()V

    throw v1
.end method

.method columnNameLocked(I)Ljava/lang/String;
    .locals 2

    .line 126
    invoke-virtual {p0}, Lnet/sqlcipher/database/SQLiteQuery;->acquireReference()V

    .line 128
    :try_start_0
    invoke-direct {p0, p1}, Lnet/sqlcipher/database/SQLiteQuery;->native_column_name(I)Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    .line 130
    invoke-virtual {p0}, Lnet/sqlcipher/database/SQLiteQuery;->releaseReference()V

    return-object v0

    :catchall_0
    move-exception v1

    invoke-virtual {p0}, Lnet/sqlcipher/database/SQLiteQuery;->releaseReference()V

    throw v1
.end method

.method fillWindow(Lnet/sqlcipher/CursorWindow;II)I
    .locals 12

    .line 70
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v6

    .line 71
    iget-object v0, p0, Lnet/sqlcipher/database/SQLiteQuery;->mDatabase:Lnet/sqlcipher/database/SQLiteDatabase;

    invoke-virtual {v0}, Lnet/sqlcipher/database/SQLiteDatabase;->lock()V

    .line 73
    :try_start_0
    invoke-virtual {p0}, Lnet/sqlcipher/database/SQLiteQuery;->acquireReference()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 75
    :try_start_1
    invoke-virtual {p1}, Lnet/sqlcipher/CursorWindow;->acquireReference()V

    .line 79
    move-object v0, p0

    move-object v1, p1

    invoke-virtual {p1}, Lnet/sqlcipher/CursorWindow;->getStartPosition()I

    move-result v2

    iget v3, p0, Lnet/sqlcipher/database/SQLiteQuery;->mOffsetIndex:I

    move v4, p2

    move v5, p3

    invoke-direct/range {v0 .. v5}, Lnet/sqlcipher/database/SQLiteQuery;->native_fill_window(Lnet/sqlcipher/CursorWindow;IIII)I

    move-result v8

    .line 83
    sget-boolean v0, Lnet/sqlcipher/database/SQLiteDebug;->DEBUG_SQL_STATEMENTS:Z

    if-eqz v0, :cond_0

    .line 84
    const-string v0, "Cursor"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "fillWindow(): "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lnet/sqlcipher/database/SQLiteQuery;->mSql:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_1
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Lnet/sqlcipher/database/SQLiteDatabaseCorruptException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 86
    :cond_0
    move v9, v8

    .line 94
    :try_start_2
    invoke-virtual {p1}, Lnet/sqlcipher/CursorWindow;->releaseReference()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 97
    invoke-virtual {p0}, Lnet/sqlcipher/database/SQLiteQuery;->releaseReference()V

    .line 98
    iget-object v0, p0, Lnet/sqlcipher/database/SQLiteQuery;->mDatabase:Lnet/sqlcipher/database/SQLiteDatabase;

    invoke-virtual {v0}, Lnet/sqlcipher/database/SQLiteDatabase;->unlock()V

    return v9

    .line 87
    :catch_0
    move-exception v8

    .line 89
    const/4 v9, 0x0

    .line 94
    :try_start_3
    invoke-virtual {p1}, Lnet/sqlcipher/CursorWindow;->releaseReference()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 97
    invoke-virtual {p0}, Lnet/sqlcipher/database/SQLiteQuery;->releaseReference()V

    .line 98
    iget-object v0, p0, Lnet/sqlcipher/database/SQLiteQuery;->mDatabase:Lnet/sqlcipher/database/SQLiteDatabase;

    invoke-virtual {v0}, Lnet/sqlcipher/database/SQLiteDatabase;->unlock()V

    return v9

    .line 90
    :catch_1
    move-exception v8

    .line 91
    :try_start_4
    iget-object v0, p0, Lnet/sqlcipher/database/SQLiteQuery;->mDatabase:Lnet/sqlcipher/database/SQLiteDatabase;

    invoke-virtual {v0}, Lnet/sqlcipher/database/SQLiteDatabase;->onCorruption()V

    .line 92
    throw v8
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 94
    :catchall_0
    move-exception v10

    :try_start_5
    invoke-virtual {p1}, Lnet/sqlcipher/CursorWindow;->releaseReference()V

    throw v10
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 97
    :catchall_1
    move-exception v11

    invoke-virtual {p0}, Lnet/sqlcipher/database/SQLiteQuery;->releaseReference()V

    .line 98
    iget-object v0, p0, Lnet/sqlcipher/database/SQLiteQuery;->mDatabase:Lnet/sqlcipher/database/SQLiteDatabase;

    invoke-virtual {v0}, Lnet/sqlcipher/database/SQLiteDatabase;->unlock()V

    throw v11
.end method

.method requery()V
    .locals 6

    .line 143
    iget-object v0, p0, Lnet/sqlcipher/database/SQLiteQuery;->mBindArgs:[Ljava/lang/String;

    if-eqz v0, :cond_3

    .line 144
    iget-object v0, p0, Lnet/sqlcipher/database/SQLiteQuery;->mBindArgs:[Ljava/lang/String;

    array-length v2, v0

    .line 146
    :try_start_0
    iget-object v0, p0, Lnet/sqlcipher/database/SQLiteQuery;->mObjectBindArgs:[Ljava/lang/Object;

    if-eqz v0, :cond_0

    .line 147
    iget-object v0, p0, Lnet/sqlcipher/database/SQLiteQuery;->mObjectBindArgs:[Ljava/lang/Object;

    invoke-virtual {p0, v0}, Lnet/sqlcipher/database/SQLiteQuery;->bindArguments([Ljava/lang/Object;)V

    goto :goto_1

    .line 149
    :cond_0
    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    .line 150
    add-int/lit8 v0, v3, 0x1

    iget-object v1, p0, Lnet/sqlcipher/database/SQLiteQuery;->mBindArgs:[Ljava/lang/String;

    aget-object v1, v1, v3

    invoke-super {p0, v0, v1}, Lnet/sqlcipher/database/SQLiteProgram;->bindString(ILjava/lang/String;)V
    :try_end_0
    .catch Lnet/sqlcipher/database/SQLiteMisuseException; {:try_start_0 .. :try_end_0} :catch_0

    .line 149
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 163
    :cond_1
    :goto_1
    goto :goto_3

    .line 153
    :catch_0
    move-exception v3

    .line 154
    new-instance v4, Ljava/lang/StringBuilder;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "mSql "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lnet/sqlcipher/database/SQLiteQuery;->mSql:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v4, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 155
    const/4 v5, 0x0

    :goto_2
    if-ge v5, v2, :cond_2

    .line 156
    const-string v0, " "

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 157
    iget-object v0, p0, Lnet/sqlcipher/database/SQLiteQuery;->mBindArgs:[Ljava/lang/String;

    aget-object v0, v0, v5

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 155
    add-int/lit8 v5, v5, 0x1

    goto :goto_2

    .line 159
    :cond_2
    const-string v0, " "

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 160
    new-instance v5, Ljava/lang/IllegalStateException;

    .line 161
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v5, v0, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 162
    throw v5

    .line 165
    :cond_3
    :goto_3
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 136
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "SQLiteQuery: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lnet/sqlcipher/database/SQLiteQuery;->mSql:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
