.class public abstract Lnet/sqlcipher/AbstractCursor;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/database/CrossProcessCursor;
.implements Lnet/sqlcipher/Cursor;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/sqlcipher/AbstractCursor$SelfContentObserver;
    }
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String; = "Cursor"


# instance fields
.field protected mClosed:Z

.field mContentObservable:Landroid/database/ContentObservable;

.field protected mContentResolver:Landroid/content/ContentResolver;

.field protected mCurrentRowID:Ljava/lang/Long;

.field mDataSetObservable:Landroid/database/DataSetObservable;

.field private mExtras:Landroid/os/Bundle;

.field private mNotifyUri:Landroid/net/Uri;

.field protected mPos:I

.field protected mRowIdColumnIndex:I

.field private mSelfObserver:Landroid/database/ContentObserver;

.field private final mSelfObserverLock:Ljava/lang/Object;

.field private mSelfObserverRegistered:Z

.field protected mUpdatedRows:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<Ljava/lang/Long;Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 165
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 42
    new-instance v0, Landroid/database/DataSetObservable;

    invoke-direct {v0}, Landroid/database/DataSetObservable;-><init>()V

    iput-object v0, p0, Lnet/sqlcipher/AbstractCursor;->mDataSetObservable:Landroid/database/DataSetObservable;

    .line 43
    new-instance v0, Landroid/database/ContentObservable;

    invoke-direct {v0}, Landroid/database/ContentObservable;-><init>()V

    iput-object v0, p0, Lnet/sqlcipher/AbstractCursor;->mContentObservable:Landroid/database/ContentObservable;

    .line 45
    sget-object v0, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    iput-object v0, p0, Lnet/sqlcipher/AbstractCursor;->mExtras:Landroid/os/Bundle;

    .line 622
    const/4 v0, 0x0

    iput-boolean v0, p0, Lnet/sqlcipher/AbstractCursor;->mClosed:Z

    .line 625
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lnet/sqlcipher/AbstractCursor;->mSelfObserverLock:Ljava/lang/Object;

    .line 166
    const/4 v0, -0x1

    iput v0, p0, Lnet/sqlcipher/AbstractCursor;->mPos:I

    .line 167
    const/4 v0, -0x1

    iput v0, p0, Lnet/sqlcipher/AbstractCursor;->mRowIdColumnIndex:I

    .line 168
    const/4 v0, 0x0

    iput-object v0, p0, Lnet/sqlcipher/AbstractCursor;->mCurrentRowID:Ljava/lang/Long;

    .line 169
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lnet/sqlcipher/AbstractCursor;->mUpdatedRows:Ljava/util/HashMap;

    .line 170
    return-void
.end method


# virtual methods
.method public abortUpdates()V
    .locals 3

    .line 407
    iget-object v1, p0, Lnet/sqlcipher/AbstractCursor;->mUpdatedRows:Ljava/util/HashMap;

    monitor-enter v1

    .line 408
    :try_start_0
    iget-object v0, p0, Lnet/sqlcipher/AbstractCursor;->mUpdatedRows:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 409
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2

    .line 410
    :goto_0
    return-void
.end method

.method protected checkPosition()V
    .locals 3

    .line 561
    iget v0, p0, Lnet/sqlcipher/AbstractCursor;->mPos:I

    const/4 v1, -0x1

    if-eq v1, v0, :cond_0

    invoke-virtual {p0}, Lnet/sqlcipher/AbstractCursor;->getCount()I

    move-result v0

    iget v1, p0, Lnet/sqlcipher/AbstractCursor;->mPos:I

    if-ne v0, v1, :cond_1

    .line 562
    :cond_0
    new-instance v0, Lnet/sqlcipher/CursorIndexOutOfBoundsException;

    iget v1, p0, Lnet/sqlcipher/AbstractCursor;->mPos:I

    invoke-virtual {p0}, Lnet/sqlcipher/AbstractCursor;->getCount()I

    move-result v2

    invoke-direct {v0, v1, v2}, Lnet/sqlcipher/CursorIndexOutOfBoundsException;-><init>(II)V

    throw v0

    .line 564
    :cond_1
    return-void
.end method

.method public close()V
    .locals 1

    .line 111
    const/4 v0, 0x1

    iput-boolean v0, p0, Lnet/sqlcipher/AbstractCursor;->mClosed:Z

    .line 112
    iget-object v0, p0, Lnet/sqlcipher/AbstractCursor;->mContentObservable:Landroid/database/ContentObservable;

    invoke-virtual {v0}, Landroid/database/ContentObservable;->unregisterAll()V

    .line 113
    invoke-virtual {p0}, Lnet/sqlcipher/AbstractCursor;->deactivateInternal()V

    .line 114
    return-void
.end method

.method public commitUpdates()Z
    .locals 1

    .line 417
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lnet/sqlcipher/AbstractCursor;->commitUpdates(Ljava/util/Map;)Z

    move-result v0

    return v0
.end method

.method public commitUpdates(Ljava/util/Map;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<+Ljava/lang/Long;+Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;>;)Z"
        }
    .end annotation

    .line 121
    const/4 v0, 0x0

    return v0
.end method

.method public copyStringToBuffer(ILandroid/database/CharArrayBuffer;)V
    .locals 5

    .line 149
    invoke-virtual {p0, p1}, Lnet/sqlcipher/AbstractCursor;->getString(I)Ljava/lang/String;

    move-result-object v3

    .line 150
    if-eqz v3, :cond_2

    .line 151
    iget-object v4, p2, Landroid/database/CharArrayBuffer;->data:[C

    .line 152
    if-eqz v4, :cond_0

    array-length v0, v4

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v1

    if-ge v0, v1, :cond_1

    .line 153
    :cond_0
    invoke-virtual {v3}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    iput-object v0, p2, Landroid/database/CharArrayBuffer;->data:[C

    goto :goto_0

    .line 155
    :cond_1
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v3, v1, v0, v4, v2}, Ljava/lang/String;->getChars(II[CI)V

    .line 157
    :goto_0
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v0

    iput v0, p2, Landroid/database/CharArrayBuffer;->sizeCopied:I

    .line 158
    goto :goto_1

    .line 159
    :cond_2
    const/4 v0, 0x0

    iput v0, p2, Landroid/database/CharArrayBuffer;->sizeCopied:I

    .line 161
    :goto_1
    return-void
.end method

.method public deactivate()V
    .locals 0

    .line 82
    invoke-virtual {p0}, Lnet/sqlcipher/AbstractCursor;->deactivateInternal()V

    .line 83
    return-void
.end method

.method public deactivateInternal()V
    .locals 2

    .line 89
    iget-object v0, p0, Lnet/sqlcipher/AbstractCursor;->mSelfObserver:Landroid/database/ContentObserver;

    if-eqz v0, :cond_0

    .line 90
    iget-object v0, p0, Lnet/sqlcipher/AbstractCursor;->mContentResolver:Landroid/content/ContentResolver;

    iget-object v1, p0, Lnet/sqlcipher/AbstractCursor;->mSelfObserver:Landroid/database/ContentObserver;

    invoke-virtual {v0, v1}, Landroid/content/ContentResolver;->unregisterContentObserver(Landroid/database/ContentObserver;)V

    .line 91
    const/4 v0, 0x0

    iput-boolean v0, p0, Lnet/sqlcipher/AbstractCursor;->mSelfObserverRegistered:Z

    .line 93
    :cond_0
    iget-object v0, p0, Lnet/sqlcipher/AbstractCursor;->mDataSetObservable:Landroid/database/DataSetObservable;

    invoke-virtual {v0}, Landroid/database/DataSetObservable;->notifyInvalidated()V

    .line 94
    return-void
.end method

.method public deleteRow()Z
    .locals 1

    .line 129
    const/4 v0, 0x0

    return v0
.end method

.method public fillWindow(ILandroid/database/CursorWindow;)V
    .locals 0

    .line 214
    invoke-static {p0, p1, p2}, Lnet/sqlcipher/DatabaseUtils;->cursorFillWindow(Lnet/sqlcipher/Cursor;ILandroid/database/CursorWindow;)V

    .line 215
    return-void
.end method

.method protected finalize()V
    .locals 2

    .line 568
    iget-object v0, p0, Lnet/sqlcipher/AbstractCursor;->mSelfObserver:Landroid/database/ContentObserver;

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lnet/sqlcipher/AbstractCursor;->mSelfObserverRegistered:Z

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 569
    iget-object v0, p0, Lnet/sqlcipher/AbstractCursor;->mContentResolver:Landroid/content/ContentResolver;

    iget-object v1, p0, Lnet/sqlcipher/AbstractCursor;->mSelfObserver:Landroid/database/ContentObserver;

    invoke-virtual {v0, v1}, Landroid/content/ContentResolver;->unregisterContentObserver(Landroid/database/ContentObserver;)V

    .line 571
    :cond_0
    return-void
.end method

.method public getBlob(I)[B
    .locals 2

    .line 65
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "getBlob is not supported"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public getColumnCount()I
    .locals 1

    .line 78
    invoke-virtual {p0}, Lnet/sqlcipher/AbstractCursor;->getColumnNames()[Ljava/lang/String;

    move-result-object v0

    array-length v0, v0

    return v0
.end method

.method public getColumnIndex(Ljava/lang/String;)I
    .locals 7

    .line 262
    const/16 v0, 0x2e

    invoke-virtual {p1, v0}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v3

    .line 263
    const/4 v0, -0x1

    if-eq v3, v0, :cond_0

    .line 264
    new-instance v4, Ljava/lang/Exception;

    invoke-direct {v4}, Ljava/lang/Exception;-><init>()V

    .line 265
    const-string v0, "Cursor"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "requesting column name with table name -- "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, v4}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 266
    add-int/lit8 v0, v3, 0x1

    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    .line 269
    :cond_0
    invoke-virtual {p0}, Lnet/sqlcipher/AbstractCursor;->getColumnNames()[Ljava/lang/String;

    move-result-object v4

    .line 270
    array-length v5, v4

    .line 271
    const/4 v6, 0x0

    :goto_0
    if-ge v6, v5, :cond_2

    .line 272
    aget-object v0, v4, v6

    invoke-virtual {v0, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 273
    return v6

    .line 271
    :cond_1
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 282
    :cond_2
    const/4 v0, -0x1

    return v0
.end method

.method public getColumnIndexOrThrow(Ljava/lang/String;)I
    .locals 4

    .line 286
    invoke-virtual {p0, p1}, Lnet/sqlcipher/AbstractCursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v3

    .line 287
    if-gez v3, :cond_0

    .line 288
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "column \'"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\' does not exist"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 290
    :cond_0
    return v3
.end method

.method public getColumnName(I)Ljava/lang/String;
    .locals 1

    .line 294
    invoke-virtual {p0}, Lnet/sqlcipher/AbstractCursor;->getColumnNames()[Ljava/lang/String;

    move-result-object v0

    aget-object v0, v0, p1

    return-object v0
.end method

.method public abstract getColumnNames()[Ljava/lang/String;
.end method

.method public abstract getCount()I
.end method

.method protected getDataSetObservable()Landroid/database/DataSetObservable;
    .locals 1

    .line 452
    iget-object v0, p0, Lnet/sqlcipher/AbstractCursor;->mDataSetObservable:Landroid/database/DataSetObservable;

    return-object v0
.end method

.method public abstract getDouble(I)D
.end method

.method public getExtras()Landroid/os/Bundle;
    .locals 1

    .line 512
    iget-object v0, p0, Lnet/sqlcipher/AbstractCursor;->mExtras:Landroid/os/Bundle;

    return-object v0
.end method

.method public abstract getFloat(I)F
.end method

.method public abstract getInt(I)I
.end method

.method public abstract getLong(I)J
.end method

.method public getNotificationUri()Landroid/net/Uri;
    .locals 1

    .line 500
    iget-object v0, p0, Lnet/sqlcipher/AbstractCursor;->mNotifyUri:Landroid/net/Uri;

    return-object v0
.end method

.method public final getPosition()I
    .locals 1

    .line 173
    iget v0, p0, Lnet/sqlcipher/AbstractCursor;->mPos:I

    return v0
.end method

.method public abstract getShort(I)S
.end method

.method public abstract getString(I)Ljava/lang/String;
.end method

.method public abstract getType(I)I
.end method

.method protected getUpdatedField(I)Ljava/lang/Object;
    .locals 3

    .line 548
    iget-object v0, p0, Lnet/sqlcipher/AbstractCursor;->mUpdatedRows:Ljava/util/HashMap;

    iget-object v1, p0, Lnet/sqlcipher/AbstractCursor;->mCurrentRowID:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/util/Map;

    .line 549
    invoke-virtual {p0}, Lnet/sqlcipher/AbstractCursor;->getColumnNames()[Ljava/lang/String;

    move-result-object v0

    aget-object v0, v0, p1

    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public getWantsAllOnMoveCalls()Z
    .locals 1

    .line 504
    const/4 v0, 0x0

    return v0
.end method

.method public bridge synthetic getWindow()Landroid/database/CursorWindow;
    .locals 1

    .line 39
    invoke-virtual {p0}, Lnet/sqlcipher/AbstractCursor;->getWindow()Lnet/sqlcipher/CursorWindow;

    move-result-object v0

    return-object v0
.end method

.method public getWindow()Lnet/sqlcipher/CursorWindow;
    .locals 1

    .line 74
    const/4 v0, 0x0

    return-object v0
.end method

.method public hasUpdates()Z
    .locals 3

    .line 397
    iget-object v1, p0, Lnet/sqlcipher/AbstractCursor;->mUpdatedRows:Ljava/util/HashMap;

    monitor-enter v1

    .line 398
    :try_start_0
    iget-object v0, p0, Lnet/sqlcipher/AbstractCursor;->mUpdatedRows:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->size()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    monitor-exit v1

    return v0

    .line 399
    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method

.method public final isAfterLast()Z
    .locals 2

    .line 254
    invoke-virtual {p0}, Lnet/sqlcipher/AbstractCursor;->getCount()I

    move-result v0

    if-nez v0, :cond_0

    .line 255
    const/4 v0, 0x1

    return v0

    .line 257
    :cond_0
    iget v0, p0, Lnet/sqlcipher/AbstractCursor;->mPos:I

    invoke-virtual {p0}, Lnet/sqlcipher/AbstractCursor;->getCount()I

    move-result v1

    if-ne v0, v1, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final isBeforeFirst()Z
    .locals 2

    .line 247
    invoke-virtual {p0}, Lnet/sqlcipher/AbstractCursor;->getCount()I

    move-result v0

    if-nez v0, :cond_0

    .line 248
    const/4 v0, 0x1

    return v0

    .line 250
    :cond_0
    iget v0, p0, Lnet/sqlcipher/AbstractCursor;->mPos:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public isClosed()Z
    .locals 1

    .line 107
    iget-boolean v0, p0, Lnet/sqlcipher/AbstractCursor;->mClosed:Z

    return v0
.end method

.method protected isFieldUpdated(I)Z
    .locals 3

    .line 530
    iget v0, p0, Lnet/sqlcipher/AbstractCursor;->mRowIdColumnIndex:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lnet/sqlcipher/AbstractCursor;->mUpdatedRows:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 531
    iget-object v0, p0, Lnet/sqlcipher/AbstractCursor;->mUpdatedRows:Ljava/util/HashMap;

    iget-object v1, p0, Lnet/sqlcipher/AbstractCursor;->mCurrentRowID:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/util/Map;

    .line 532
    if-eqz v2, :cond_0

    invoke-virtual {p0}, Lnet/sqlcipher/AbstractCursor;->getColumnNames()[Ljava/lang/String;

    move-result-object v0

    aget-object v0, v0, p1

    invoke-interface {v2, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 533
    const/4 v0, 0x1

    return v0

    .line 536
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final isFirst()Z
    .locals 1

    .line 238
    iget v0, p0, Lnet/sqlcipher/AbstractCursor;->mPos:I

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lnet/sqlcipher/AbstractCursor;->getCount()I

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final isLast()Z
    .locals 3

    .line 242
    invoke-virtual {p0}, Lnet/sqlcipher/AbstractCursor;->getCount()I

    move-result v2

    .line 243
    iget v0, p0, Lnet/sqlcipher/AbstractCursor;->mPos:I

    add-int/lit8 v1, v2, -0x1

    if-ne v0, v1, :cond_0

    if-eqz v2, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public abstract isNull(I)Z
.end method

.method public final move(I)Z
    .locals 1

    .line 218
    iget v0, p0, Lnet/sqlcipher/AbstractCursor;->mPos:I

    add-int/2addr v0, p1

    invoke-virtual {p0, v0}, Lnet/sqlcipher/AbstractCursor;->moveToPosition(I)Z

    move-result v0

    return v0
.end method

.method public final moveToFirst()Z
    .locals 1

    .line 222
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lnet/sqlcipher/AbstractCursor;->moveToPosition(I)Z

    move-result v0

    return v0
.end method

.method public final moveToLast()Z
    .locals 2

    .line 226
    invoke-virtual {p0}, Lnet/sqlcipher/AbstractCursor;->getCount()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {p0, v0}, Lnet/sqlcipher/AbstractCursor;->moveToPosition(I)Z

    move-result v0

    return v0
.end method

.method public final moveToNext()Z
    .locals 2

    .line 230
    iget v0, p0, Lnet/sqlcipher/AbstractCursor;->mPos:I

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {p0, v0}, Lnet/sqlcipher/AbstractCursor;->moveToPosition(I)Z

    move-result v0

    return v0
.end method

.method public final moveToPosition(I)Z
    .locals 4

    .line 178
    invoke-virtual {p0}, Lnet/sqlcipher/AbstractCursor;->getCount()I

    move-result v2

    .line 179
    if-lt p1, v2, :cond_0

    .line 180
    iput v2, p0, Lnet/sqlcipher/AbstractCursor;->mPos:I

    .line 181
    const/4 v0, 0x0

    return v0

    .line 185
    :cond_0
    if-gez p1, :cond_1

    .line 186
    const/4 v0, -0x1

    iput v0, p0, Lnet/sqlcipher/AbstractCursor;->mPos:I

    .line 187
    const/4 v0, 0x0

    return v0

    .line 191
    :cond_1
    iget v0, p0, Lnet/sqlcipher/AbstractCursor;->mPos:I

    if-ne p1, v0, :cond_2

    .line 192
    const/4 v0, 0x1

    return v0

    .line 195
    :cond_2
    iget v0, p0, Lnet/sqlcipher/AbstractCursor;->mPos:I

    invoke-virtual {p0, v0, p1}, Lnet/sqlcipher/AbstractCursor;->onMove(II)Z

    move-result v3

    .line 196
    if-nez v3, :cond_3

    .line 197
    const/4 v0, -0x1

    iput v0, p0, Lnet/sqlcipher/AbstractCursor;->mPos:I

    goto :goto_0

    .line 199
    :cond_3
    iput p1, p0, Lnet/sqlcipher/AbstractCursor;->mPos:I

    .line 200
    iget v0, p0, Lnet/sqlcipher/AbstractCursor;->mRowIdColumnIndex:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_4

    .line 201
    iget v0, p0, Lnet/sqlcipher/AbstractCursor;->mRowIdColumnIndex:I

    invoke-virtual {p0, v0}, Lnet/sqlcipher/AbstractCursor;->getLong(I)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p0, Lnet/sqlcipher/AbstractCursor;->mCurrentRowID:Ljava/lang/Long;

    .line 205
    :cond_4
    :goto_0
    return v3
.end method

.method public final moveToPrevious()Z
    .locals 2

    .line 234
    iget v0, p0, Lnet/sqlcipher/AbstractCursor;->mPos:I

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {p0, v0}, Lnet/sqlcipher/AbstractCursor;->moveToPosition(I)Z

    move-result v0

    return v0
.end method

.method public notifyDataSetChange()V
    .locals 1

    .line 444
    iget-object v0, p0, Lnet/sqlcipher/AbstractCursor;->mDataSetObservable:Landroid/database/DataSetObservable;

    invoke-virtual {v0}, Landroid/database/DataSetObservable;->notifyChanged()V

    .line 445
    return-void
.end method

.method protected onChange(Z)V
    .locals 5

    .line 471
    iget-object v3, p0, Lnet/sqlcipher/AbstractCursor;->mSelfObserverLock:Ljava/lang/Object;

    monitor-enter v3

    .line 472
    :try_start_0
    iget-object v0, p0, Lnet/sqlcipher/AbstractCursor;->mContentObservable:Landroid/database/ContentObservable;

    invoke-virtual {v0, p1}, Landroid/database/ContentObservable;->dispatchChange(Z)V

    .line 473
    iget-object v0, p0, Lnet/sqlcipher/AbstractCursor;->mNotifyUri:Landroid/net/Uri;

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    .line 474
    iget-object v0, p0, Lnet/sqlcipher/AbstractCursor;->mContentResolver:Landroid/content/ContentResolver;

    iget-object v1, p0, Lnet/sqlcipher/AbstractCursor;->mNotifyUri:Landroid/net/Uri;

    iget-object v2, p0, Lnet/sqlcipher/AbstractCursor;->mSelfObserver:Landroid/database/ContentObserver;

    invoke-virtual {v0, v1, v2}, Landroid/content/ContentResolver;->notifyChange(Landroid/net/Uri;Landroid/database/ContentObserver;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 476
    :cond_0
    monitor-exit v3

    goto :goto_0

    :catchall_0
    move-exception v4

    monitor-exit v3

    throw v4

    .line 477
    :goto_0
    return-void
.end method

.method public onMove(II)Z
    .locals 1

    .line 143
    const/4 v0, 0x1

    return v0
.end method

.method public registerContentObserver(Landroid/database/ContentObserver;)V
    .locals 1

    .line 429
    iget-object v0, p0, Lnet/sqlcipher/AbstractCursor;->mContentObservable:Landroid/database/ContentObservable;

    invoke-virtual {v0, p1}, Landroid/database/ContentObservable;->registerObserver(Landroid/database/ContentObserver;)V

    .line 430
    return-void
.end method

.method public registerDataSetObserver(Landroid/database/DataSetObserver;)V
    .locals 1

    .line 456
    iget-object v0, p0, Lnet/sqlcipher/AbstractCursor;->mDataSetObservable:Landroid/database/DataSetObservable;

    invoke-virtual {v0, p1}, Landroid/database/DataSetObservable;->registerObserver(Ljava/lang/Object;)V

    .line 458
    return-void
.end method

.method public requery()Z
    .locals 4

    .line 97
    iget-object v0, p0, Lnet/sqlcipher/AbstractCursor;->mSelfObserver:Landroid/database/ContentObserver;

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lnet/sqlcipher/AbstractCursor;->mSelfObserverRegistered:Z

    if-nez v0, :cond_0

    .line 99
    iget-object v0, p0, Lnet/sqlcipher/AbstractCursor;->mContentResolver:Landroid/content/ContentResolver;

    iget-object v1, p0, Lnet/sqlcipher/AbstractCursor;->mNotifyUri:Landroid/net/Uri;

    iget-object v2, p0, Lnet/sqlcipher/AbstractCursor;->mSelfObserver:Landroid/database/ContentObserver;

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v3, v2}, Landroid/content/ContentResolver;->registerContentObserver(Landroid/net/Uri;ZLandroid/database/ContentObserver;)V

    .line 100
    const/4 v0, 0x1

    iput-boolean v0, p0, Lnet/sqlcipher/AbstractCursor;->mSelfObserverRegistered:Z

    .line 102
    :cond_0
    iget-object v0, p0, Lnet/sqlcipher/AbstractCursor;->mDataSetObservable:Landroid/database/DataSetObservable;

    invoke-virtual {v0}, Landroid/database/DataSetObservable;->notifyChanged()V

    .line 103
    const/4 v0, 0x1

    return v0
.end method

.method public respond(Landroid/os/Bundle;)Landroid/os/Bundle;
    .locals 1

    .line 516
    sget-object v0, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    return-object v0
.end method

.method public setExtras(Landroid/os/Bundle;)V
    .locals 1

    .line 508
    if-nez p1, :cond_0

    sget-object v0, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    goto :goto_0

    :cond_0
    move-object v0, p1

    :goto_0
    iput-object v0, p0, Lnet/sqlcipher/AbstractCursor;->mExtras:Landroid/os/Bundle;

    .line 509
    return-void
.end method

.method public setNotificationUri(Landroid/content/ContentResolver;Landroid/net/Uri;)V
    .locals 6

    .line 487
    iget-object v4, p0, Lnet/sqlcipher/AbstractCursor;->mSelfObserverLock:Ljava/lang/Object;

    monitor-enter v4

    .line 488
    :try_start_0
    iput-object p2, p0, Lnet/sqlcipher/AbstractCursor;->mNotifyUri:Landroid/net/Uri;

    .line 489
    iput-object p1, p0, Lnet/sqlcipher/AbstractCursor;->mContentResolver:Landroid/content/ContentResolver;

    .line 490
    iget-object v0, p0, Lnet/sqlcipher/AbstractCursor;->mSelfObserver:Landroid/database/ContentObserver;

    if-eqz v0, :cond_0

    .line 491
    iget-object v0, p0, Lnet/sqlcipher/AbstractCursor;->mContentResolver:Landroid/content/ContentResolver;

    iget-object v1, p0, Lnet/sqlcipher/AbstractCursor;->mSelfObserver:Landroid/database/ContentObserver;

    invoke-virtual {v0, v1}, Landroid/content/ContentResolver;->unregisterContentObserver(Landroid/database/ContentObserver;)V

    .line 493
    :cond_0
    new-instance v0, Lnet/sqlcipher/AbstractCursor$SelfContentObserver;

    invoke-direct {v0, p0}, Lnet/sqlcipher/AbstractCursor$SelfContentObserver;-><init>(Lnet/sqlcipher/AbstractCursor;)V

    iput-object v0, p0, Lnet/sqlcipher/AbstractCursor;->mSelfObserver:Landroid/database/ContentObserver;

    .line 494
    iget-object v0, p0, Lnet/sqlcipher/AbstractCursor;->mContentResolver:Landroid/content/ContentResolver;

    iget-object v1, p0, Lnet/sqlcipher/AbstractCursor;->mNotifyUri:Landroid/net/Uri;

    iget-object v2, p0, Lnet/sqlcipher/AbstractCursor;->mSelfObserver:Landroid/database/ContentObserver;

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v3, v2}, Landroid/content/ContentResolver;->registerContentObserver(Landroid/net/Uri;ZLandroid/database/ContentObserver;)V

    .line 495
    const/4 v0, 0x1

    iput-boolean v0, p0, Lnet/sqlcipher/AbstractCursor;->mSelfObserverRegistered:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 496
    monitor-exit v4

    goto :goto_0

    :catchall_0
    move-exception v5

    monitor-exit v4

    throw v5

    .line 497
    :goto_0
    return-void
.end method

.method public supportsUpdates()Z
    .locals 2

    .line 425
    iget v0, p0, Lnet/sqlcipher/AbstractCursor;->mRowIdColumnIndex:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public unregisterContentObserver(Landroid/database/ContentObserver;)V
    .locals 1

    .line 434
    iget-boolean v0, p0, Lnet/sqlcipher/AbstractCursor;->mClosed:Z

    if-nez v0, :cond_0

    .line 435
    iget-object v0, p0, Lnet/sqlcipher/AbstractCursor;->mContentObservable:Landroid/database/ContentObservable;

    invoke-virtual {v0, p1}, Landroid/database/ContentObservable;->unregisterObserver(Ljava/lang/Object;)V

    .line 437
    :cond_0
    return-void
.end method

.method public unregisterDataSetObserver(Landroid/database/DataSetObserver;)V
    .locals 1

    .line 461
    iget-object v0, p0, Lnet/sqlcipher/AbstractCursor;->mDataSetObservable:Landroid/database/DataSetObservable;

    invoke-virtual {v0, p1}, Landroid/database/DataSetObservable;->unregisterObserver(Ljava/lang/Object;)V

    .line 462
    return-void
.end method

.method public update(ILjava/lang/Object;)Z
    .locals 7

    .line 366
    invoke-virtual {p0}, Lnet/sqlcipher/AbstractCursor;->supportsUpdates()Z

    move-result v0

    if-nez v0, :cond_0

    .line 367
    const/4 v0, 0x0

    return v0

    .line 372
    :cond_0
    iget v0, p0, Lnet/sqlcipher/AbstractCursor;->mRowIdColumnIndex:I

    invoke-virtual {p0, v0}, Lnet/sqlcipher/AbstractCursor;->getLong(I)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    .line 373
    if-nez v3, :cond_1

    .line 374
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "null rowid. mRowIdColumnIndex = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lnet/sqlcipher/AbstractCursor;->mRowIdColumnIndex:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 377
    :cond_1
    iget-object v4, p0, Lnet/sqlcipher/AbstractCursor;->mUpdatedRows:Ljava/util/HashMap;

    monitor-enter v4

    .line 378
    :try_start_0
    iget-object v0, p0, Lnet/sqlcipher/AbstractCursor;->mUpdatedRows:Ljava/util/HashMap;

    invoke-virtual {v0, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Ljava/util/Map;

    .line 379
    if-nez v5, :cond_2

    .line 380
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 381
    iget-object v0, p0, Lnet/sqlcipher/AbstractCursor;->mUpdatedRows:Ljava/util/HashMap;

    invoke-virtual {v0, v3, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 383
    :cond_2
    invoke-virtual {p0}, Lnet/sqlcipher/AbstractCursor;->getColumnNames()[Ljava/lang/String;

    move-result-object v0

    aget-object v0, v0, p1

    invoke-interface {v5, v0, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 384
    monitor-exit v4

    goto :goto_0

    :catchall_0
    move-exception v6

    monitor-exit v4

    throw v6

    .line 386
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public updateBlob(I[B)Z
    .locals 1

    .line 302
    invoke-virtual {p0, p1, p2}, Lnet/sqlcipher/AbstractCursor;->update(ILjava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public updateDouble(ID)Z
    .locals 1

    .line 350
    invoke-static {p2, p3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lnet/sqlcipher/AbstractCursor;->update(ILjava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public updateFloat(IF)Z
    .locals 1

    .line 342
    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lnet/sqlcipher/AbstractCursor;->update(ILjava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public updateInt(II)Z
    .locals 1

    .line 326
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lnet/sqlcipher/AbstractCursor;->update(ILjava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public updateLong(IJ)Z
    .locals 1

    .line 334
    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lnet/sqlcipher/AbstractCursor;->update(ILjava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public updateShort(IS)Z
    .locals 1

    .line 318
    invoke-static {p2}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lnet/sqlcipher/AbstractCursor;->update(ILjava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public updateString(ILjava/lang/String;)Z
    .locals 1

    .line 310
    invoke-virtual {p0, p1, p2}, Lnet/sqlcipher/AbstractCursor;->update(ILjava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public updateToNull(I)Z
    .locals 1

    .line 358
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lnet/sqlcipher/AbstractCursor;->update(ILjava/lang/Object;)Z

    move-result v0

    return v0
.end method
