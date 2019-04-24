.class public abstract Lnet/sqlcipher/AbstractWindowedCursor;
.super Lnet/sqlcipher/AbstractCursor;
.source "SourceFile"


# instance fields
.field public mWindow:Lnet/sqlcipher/CursorWindow;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 24
    invoke-direct {p0}, Lnet/sqlcipher/AbstractCursor;-><init>()V

    return-void
.end method


# virtual methods
.method protected checkPosition()V
    .locals 2

    .line 222
    invoke-super {p0}, Lnet/sqlcipher/AbstractCursor;->checkPosition()V

    .line 224
    iget-object v0, p0, Lnet/sqlcipher/AbstractWindowedCursor;->mWindow:Lnet/sqlcipher/CursorWindow;

    if-nez v0, :cond_0

    .line 225
    new-instance v0, Lnet/sqlcipher/StaleDataException;

    const-string v1, "Access closed cursor"

    invoke-direct {v0, v1}, Lnet/sqlcipher/StaleDataException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 227
    :cond_0
    return-void
.end method

.method public copyStringToBuffer(ILandroid/database/CharArrayBuffer;)V
    .locals 4

    .line 57
    invoke-virtual {p0}, Lnet/sqlcipher/AbstractWindowedCursor;->checkPosition()V

    .line 59
    iget-object v2, p0, Lnet/sqlcipher/AbstractWindowedCursor;->mUpdatedRows:Ljava/util/HashMap;

    monitor-enter v2

    .line 60
    :try_start_0
    invoke-virtual {p0, p1}, Lnet/sqlcipher/AbstractWindowedCursor;->isFieldUpdated(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 61
    invoke-super {p0, p1, p2}, Lnet/sqlcipher/AbstractCursor;->copyStringToBuffer(ILandroid/database/CharArrayBuffer;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 63
    :cond_0
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3

    .line 65
    :goto_0
    iget-object v0, p0, Lnet/sqlcipher/AbstractWindowedCursor;->mWindow:Lnet/sqlcipher/CursorWindow;

    iget v1, p0, Lnet/sqlcipher/AbstractWindowedCursor;->mPos:I

    invoke-virtual {v0, v1, p1, p2}, Lnet/sqlcipher/CursorWindow;->copyStringToBuffer(IILandroid/database/CharArrayBuffer;)V

    .line 66
    return-void
.end method

.method public getBlob(I)[B
    .locals 4

    .line 29
    invoke-virtual {p0}, Lnet/sqlcipher/AbstractWindowedCursor;->checkPosition()V

    .line 31
    iget-object v2, p0, Lnet/sqlcipher/AbstractWindowedCursor;->mUpdatedRows:Ljava/util/HashMap;

    monitor-enter v2

    .line 32
    :try_start_0
    invoke-virtual {p0, p1}, Lnet/sqlcipher/AbstractWindowedCursor;->isFieldUpdated(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 33
    invoke-virtual {p0, p1}, Lnet/sqlcipher/AbstractWindowedCursor;->getUpdatedField(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    check-cast v0, [B
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    return-object v0

    .line 35
    :cond_0
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3

    .line 37
    :goto_0
    iget-object v0, p0, Lnet/sqlcipher/AbstractWindowedCursor;->mWindow:Lnet/sqlcipher/CursorWindow;

    iget v1, p0, Lnet/sqlcipher/AbstractWindowedCursor;->mPos:I

    invoke-virtual {v0, v1, p1}, Lnet/sqlcipher/CursorWindow;->getBlob(II)[B

    move-result-object v0

    return-object v0
.end method

.method public getDouble(I)D
    .locals 5

    .line 131
    invoke-virtual {p0}, Lnet/sqlcipher/AbstractWindowedCursor;->checkPosition()V

    .line 133
    iget-object v2, p0, Lnet/sqlcipher/AbstractWindowedCursor;->mUpdatedRows:Ljava/util/HashMap;

    monitor-enter v2

    .line 134
    :try_start_0
    invoke-virtual {p0, p1}, Lnet/sqlcipher/AbstractWindowedCursor;->isFieldUpdated(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 135
    invoke-virtual {p0, p1}, Lnet/sqlcipher/AbstractWindowedCursor;->getUpdatedField(I)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/lang/Number;

    .line 136
    invoke-virtual {v3}, Ljava/lang/Number;->doubleValue()D
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-wide v0

    monitor-exit v2

    return-wide v0

    .line 138
    :cond_0
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v4

    monitor-exit v2

    throw v4

    .line 140
    :goto_0
    iget-object v0, p0, Lnet/sqlcipher/AbstractWindowedCursor;->mWindow:Lnet/sqlcipher/CursorWindow;

    iget v1, p0, Lnet/sqlcipher/AbstractWindowedCursor;->mPos:I

    invoke-virtual {v0, v1, p1}, Lnet/sqlcipher/CursorWindow;->getDouble(II)D

    move-result-wide v0

    return-wide v0
.end method

.method public getFloat(I)F
    .locals 5

    .line 116
    invoke-virtual {p0}, Lnet/sqlcipher/AbstractWindowedCursor;->checkPosition()V

    .line 118
    iget-object v2, p0, Lnet/sqlcipher/AbstractWindowedCursor;->mUpdatedRows:Ljava/util/HashMap;

    monitor-enter v2

    .line 119
    :try_start_0
    invoke-virtual {p0, p1}, Lnet/sqlcipher/AbstractWindowedCursor;->isFieldUpdated(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 120
    invoke-virtual {p0, p1}, Lnet/sqlcipher/AbstractWindowedCursor;->getUpdatedField(I)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/lang/Number;

    .line 121
    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    monitor-exit v2

    return v0

    .line 123
    :cond_0
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v4

    monitor-exit v2

    throw v4

    .line 125
    :goto_0
    iget-object v0, p0, Lnet/sqlcipher/AbstractWindowedCursor;->mWindow:Lnet/sqlcipher/CursorWindow;

    iget v1, p0, Lnet/sqlcipher/AbstractWindowedCursor;->mPos:I

    invoke-virtual {v0, v1, p1}, Lnet/sqlcipher/CursorWindow;->getFloat(II)F

    move-result v0

    return v0
.end method

.method public getInt(I)I
    .locals 5

    .line 86
    invoke-virtual {p0}, Lnet/sqlcipher/AbstractWindowedCursor;->checkPosition()V

    .line 88
    iget-object v2, p0, Lnet/sqlcipher/AbstractWindowedCursor;->mUpdatedRows:Ljava/util/HashMap;

    monitor-enter v2

    .line 89
    :try_start_0
    invoke-virtual {p0, p1}, Lnet/sqlcipher/AbstractWindowedCursor;->isFieldUpdated(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 90
    invoke-virtual {p0, p1}, Lnet/sqlcipher/AbstractWindowedCursor;->getUpdatedField(I)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/lang/Number;

    .line 91
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    monitor-exit v2

    return v0

    .line 93
    :cond_0
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v4

    monitor-exit v2

    throw v4

    .line 95
    :goto_0
    iget-object v0, p0, Lnet/sqlcipher/AbstractWindowedCursor;->mWindow:Lnet/sqlcipher/CursorWindow;

    iget v1, p0, Lnet/sqlcipher/AbstractWindowedCursor;->mPos:I

    invoke-virtual {v0, v1, p1}, Lnet/sqlcipher/CursorWindow;->getInt(II)I

    move-result v0

    return v0
.end method

.method public getLong(I)J
    .locals 5

    .line 101
    invoke-virtual {p0}, Lnet/sqlcipher/AbstractWindowedCursor;->checkPosition()V

    .line 103
    iget-object v2, p0, Lnet/sqlcipher/AbstractWindowedCursor;->mUpdatedRows:Ljava/util/HashMap;

    monitor-enter v2

    .line 104
    :try_start_0
    invoke-virtual {p0, p1}, Lnet/sqlcipher/AbstractWindowedCursor;->isFieldUpdated(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 105
    invoke-virtual {p0, p1}, Lnet/sqlcipher/AbstractWindowedCursor;->getUpdatedField(I)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/lang/Number;

    .line 106
    invoke-virtual {v3}, Ljava/lang/Number;->longValue()J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-wide v0

    monitor-exit v2

    return-wide v0

    .line 108
    :cond_0
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v4

    monitor-exit v2

    throw v4

    .line 110
    :goto_0
    iget-object v0, p0, Lnet/sqlcipher/AbstractWindowedCursor;->mWindow:Lnet/sqlcipher/CursorWindow;

    iget v1, p0, Lnet/sqlcipher/AbstractWindowedCursor;->mPos:I

    invoke-virtual {v0, v1, p1}, Lnet/sqlcipher/CursorWindow;->getLong(II)J

    move-result-wide v0

    return-wide v0
.end method

.method public getShort(I)S
    .locals 5

    .line 71
    invoke-virtual {p0}, Lnet/sqlcipher/AbstractWindowedCursor;->checkPosition()V

    .line 73
    iget-object v2, p0, Lnet/sqlcipher/AbstractWindowedCursor;->mUpdatedRows:Ljava/util/HashMap;

    monitor-enter v2

    .line 74
    :try_start_0
    invoke-virtual {p0, p1}, Lnet/sqlcipher/AbstractWindowedCursor;->isFieldUpdated(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 75
    invoke-virtual {p0, p1}, Lnet/sqlcipher/AbstractWindowedCursor;->getUpdatedField(I)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/lang/Number;

    .line 76
    invoke-virtual {v3}, Ljava/lang/Number;->shortValue()S
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    monitor-exit v2

    return v0

    .line 78
    :cond_0
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v4

    monitor-exit v2

    throw v4

    .line 80
    :goto_0
    iget-object v0, p0, Lnet/sqlcipher/AbstractWindowedCursor;->mWindow:Lnet/sqlcipher/CursorWindow;

    iget v1, p0, Lnet/sqlcipher/AbstractWindowedCursor;->mPos:I

    invoke-virtual {v0, v1, p1}, Lnet/sqlcipher/CursorWindow;->getShort(II)S

    move-result v0

    return v0
.end method

.method public getString(I)Ljava/lang/String;
    .locals 4

    .line 43
    invoke-virtual {p0}, Lnet/sqlcipher/AbstractWindowedCursor;->checkPosition()V

    .line 45
    iget-object v2, p0, Lnet/sqlcipher/AbstractWindowedCursor;->mUpdatedRows:Ljava/util/HashMap;

    monitor-enter v2

    .line 46
    :try_start_0
    invoke-virtual {p0, p1}, Lnet/sqlcipher/AbstractWindowedCursor;->isFieldUpdated(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 47
    invoke-virtual {p0, p1}, Lnet/sqlcipher/AbstractWindowedCursor;->getUpdatedField(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    return-object v0

    .line 49
    :cond_0
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3

    .line 51
    :goto_0
    iget-object v0, p0, Lnet/sqlcipher/AbstractWindowedCursor;->mWindow:Lnet/sqlcipher/CursorWindow;

    iget v1, p0, Lnet/sqlcipher/AbstractWindowedCursor;->mPos:I

    invoke-virtual {v0, v1, p1}, Lnet/sqlcipher/CursorWindow;->getString(II)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getType(I)I
    .locals 2

    .line 215
    invoke-virtual {p0}, Lnet/sqlcipher/AbstractWindowedCursor;->checkPosition()V

    .line 216
    iget-object v0, p0, Lnet/sqlcipher/AbstractWindowedCursor;->mWindow:Lnet/sqlcipher/CursorWindow;

    iget v1, p0, Lnet/sqlcipher/AbstractWindowedCursor;->mPos:I

    invoke-virtual {v0, v1, p1}, Lnet/sqlcipher/CursorWindow;->getType(II)I

    move-result v0

    return v0
.end method

.method public bridge synthetic getWindow()Landroid/database/CursorWindow;
    .locals 1

    .line 24
    invoke-virtual {p0}, Lnet/sqlcipher/AbstractWindowedCursor;->getWindow()Lnet/sqlcipher/CursorWindow;

    move-result-object v0

    return-object v0
.end method

.method public getWindow()Lnet/sqlcipher/CursorWindow;
    .locals 1

    .line 231
    iget-object v0, p0, Lnet/sqlcipher/AbstractWindowedCursor;->mWindow:Lnet/sqlcipher/CursorWindow;

    return-object v0
.end method

.method public hasWindow()Z
    .locals 1

    .line 246
    iget-object v0, p0, Lnet/sqlcipher/AbstractWindowedCursor;->mWindow:Lnet/sqlcipher/CursorWindow;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public isBlob(I)Z
    .locals 5

    .line 159
    invoke-virtual {p0}, Lnet/sqlcipher/AbstractWindowedCursor;->checkPosition()V

    .line 161
    iget-object v2, p0, Lnet/sqlcipher/AbstractWindowedCursor;->mUpdatedRows:Ljava/util/HashMap;

    monitor-enter v2

    .line 162
    :try_start_0
    invoke-virtual {p0, p1}, Lnet/sqlcipher/AbstractWindowedCursor;->isFieldUpdated(I)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 163
    invoke-virtual {p0, p1}, Lnet/sqlcipher/AbstractWindowedCursor;->getUpdatedField(I)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v3

    .line 164
    if-eqz v3, :cond_0

    instance-of v0, v3, [B

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    monitor-exit v2

    return v0

    .line 166
    :cond_2
    monitor-exit v2

    goto :goto_1

    :catchall_0
    move-exception v4

    monitor-exit v2

    throw v4

    .line 168
    :goto_1
    iget-object v0, p0, Lnet/sqlcipher/AbstractWindowedCursor;->mWindow:Lnet/sqlcipher/CursorWindow;

    iget v1, p0, Lnet/sqlcipher/AbstractWindowedCursor;->mPos:I

    invoke-virtual {v0, v1, p1}, Lnet/sqlcipher/CursorWindow;->isBlob(II)Z

    move-result v0

    return v0
.end method

.method public isFloat(I)Z
    .locals 5

    .line 201
    invoke-virtual {p0}, Lnet/sqlcipher/AbstractWindowedCursor;->checkPosition()V

    .line 203
    iget-object v2, p0, Lnet/sqlcipher/AbstractWindowedCursor;->mUpdatedRows:Ljava/util/HashMap;

    monitor-enter v2

    .line 204
    :try_start_0
    invoke-virtual {p0, p1}, Lnet/sqlcipher/AbstractWindowedCursor;->isFieldUpdated(I)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 205
    invoke-virtual {p0, p1}, Lnet/sqlcipher/AbstractWindowedCursor;->getUpdatedField(I)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v3

    .line 206
    if-eqz v3, :cond_1

    instance-of v0, v3, Ljava/lang/Float;

    if-nez v0, :cond_0

    instance-of v0, v3, Ljava/lang/Double;

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    monitor-exit v2

    return v0

    .line 208
    :cond_2
    monitor-exit v2

    goto :goto_1

    :catchall_0
    move-exception v4

    monitor-exit v2

    throw v4

    .line 210
    :goto_1
    iget-object v0, p0, Lnet/sqlcipher/AbstractWindowedCursor;->mWindow:Lnet/sqlcipher/CursorWindow;

    iget v1, p0, Lnet/sqlcipher/AbstractWindowedCursor;->mPos:I

    invoke-virtual {v0, v1, p1}, Lnet/sqlcipher/CursorWindow;->isFloat(II)Z

    move-result v0

    return v0
.end method

.method public isLong(I)Z
    .locals 5

    .line 187
    invoke-virtual {p0}, Lnet/sqlcipher/AbstractWindowedCursor;->checkPosition()V

    .line 189
    iget-object v2, p0, Lnet/sqlcipher/AbstractWindowedCursor;->mUpdatedRows:Ljava/util/HashMap;

    monitor-enter v2

    .line 190
    :try_start_0
    invoke-virtual {p0, p1}, Lnet/sqlcipher/AbstractWindowedCursor;->isFieldUpdated(I)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 191
    invoke-virtual {p0, p1}, Lnet/sqlcipher/AbstractWindowedCursor;->getUpdatedField(I)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v3

    .line 192
    if-eqz v3, :cond_1

    instance-of v0, v3, Ljava/lang/Integer;

    if-nez v0, :cond_0

    instance-of v0, v3, Ljava/lang/Long;

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    monitor-exit v2

    return v0

    .line 194
    :cond_2
    monitor-exit v2

    goto :goto_1

    :catchall_0
    move-exception v4

    monitor-exit v2

    throw v4

    .line 196
    :goto_1
    iget-object v0, p0, Lnet/sqlcipher/AbstractWindowedCursor;->mWindow:Lnet/sqlcipher/CursorWindow;

    iget v1, p0, Lnet/sqlcipher/AbstractWindowedCursor;->mPos:I

    invoke-virtual {v0, v1, p1}, Lnet/sqlcipher/CursorWindow;->isLong(II)Z

    move-result v0

    return v0
.end method

.method public isNull(I)Z
    .locals 4

    .line 146
    invoke-virtual {p0}, Lnet/sqlcipher/AbstractWindowedCursor;->checkPosition()V

    .line 148
    iget-object v2, p0, Lnet/sqlcipher/AbstractWindowedCursor;->mUpdatedRows:Ljava/util/HashMap;

    monitor-enter v2

    .line 149
    :try_start_0
    invoke-virtual {p0, p1}, Lnet/sqlcipher/AbstractWindowedCursor;->isFieldUpdated(I)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 150
    invoke-virtual {p0, p1}, Lnet/sqlcipher/AbstractWindowedCursor;->getUpdatedField(I)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    monitor-exit v2

    return v0

    .line 152
    :cond_1
    monitor-exit v2

    goto :goto_1

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3

    .line 154
    :goto_1
    iget-object v0, p0, Lnet/sqlcipher/AbstractWindowedCursor;->mWindow:Lnet/sqlcipher/CursorWindow;

    iget v1, p0, Lnet/sqlcipher/AbstractWindowedCursor;->mPos:I

    invoke-virtual {v0, v1, p1}, Lnet/sqlcipher/CursorWindow;->isNull(II)Z

    move-result v0

    return v0
.end method

.method public isString(I)Z
    .locals 5

    .line 173
    invoke-virtual {p0}, Lnet/sqlcipher/AbstractWindowedCursor;->checkPosition()V

    .line 175
    iget-object v2, p0, Lnet/sqlcipher/AbstractWindowedCursor;->mUpdatedRows:Ljava/util/HashMap;

    monitor-enter v2

    .line 176
    :try_start_0
    invoke-virtual {p0, p1}, Lnet/sqlcipher/AbstractWindowedCursor;->isFieldUpdated(I)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 177
    invoke-virtual {p0, p1}, Lnet/sqlcipher/AbstractWindowedCursor;->getUpdatedField(I)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v3

    .line 178
    if-eqz v3, :cond_0

    instance-of v0, v3, Ljava/lang/String;

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    monitor-exit v2

    return v0

    .line 180
    :cond_2
    monitor-exit v2

    goto :goto_1

    :catchall_0
    move-exception v4

    monitor-exit v2

    throw v4

    .line 182
    :goto_1
    iget-object v0, p0, Lnet/sqlcipher/AbstractWindowedCursor;->mWindow:Lnet/sqlcipher/CursorWindow;

    iget v1, p0, Lnet/sqlcipher/AbstractWindowedCursor;->mPos:I

    invoke-virtual {v0, v1, p1}, Lnet/sqlcipher/CursorWindow;->isString(II)Z

    move-result v0

    return v0
.end method

.method public setWindow(Lnet/sqlcipher/CursorWindow;)V
    .locals 1

    .line 239
    iget-object v0, p0, Lnet/sqlcipher/AbstractWindowedCursor;->mWindow:Lnet/sqlcipher/CursorWindow;

    if-eqz v0, :cond_0

    .line 240
    iget-object v0, p0, Lnet/sqlcipher/AbstractWindowedCursor;->mWindow:Lnet/sqlcipher/CursorWindow;

    invoke-virtual {v0}, Lnet/sqlcipher/CursorWindow;->close()V

    .line 242
    :cond_0
    iput-object p1, p0, Lnet/sqlcipher/AbstractWindowedCursor;->mWindow:Lnet/sqlcipher/CursorWindow;

    .line 243
    return-void
.end method
