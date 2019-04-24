.class public Lnet/sqlcipher/DatabaseUtils;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/sqlcipher/DatabaseUtils$InsertHelper;
    }
.end annotation


# static fields
.field private static final DEBUG:Z = false

.field private static final HEX_DIGITS_LOWER:[C

.field private static final LOCAL_LOGV:Z = false

.field private static final TAG:Ljava/lang/String; = "DatabaseUtils"

.field private static final countProjection:[Ljava/lang/String;

.field private static mColl:Ljava/text/Collator; = null


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 51
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "count(*)"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sput-object v0, Lnet/sqlcipher/DatabaseUtils;->countProjection:[Ljava/lang/String;

    .line 328
    const/16 v0, 0x10

    new-array v0, v0, [C

    fill-array-data v0, :array_0

    sput-object v0, Lnet/sqlcipher/DatabaseUtils;->HEX_DIGITS_LOWER:[C

    .line 358
    const/4 v0, 0x0

    sput-object v0, Lnet/sqlcipher/DatabaseUtils;->mColl:Ljava/text/Collator;

    return-void

    nop

    :array_0
    .array-data 2
        0x30s
        0x31s
        0x32s
        0x33s
        0x34s
        0x35s
        0x36s
        0x37s
        0x38s
        0x39s
        0x61s
        0x62s
        0x63s
        0x64s
        0x65s
        0x66s
    .end array-data
.end method

.method public constructor <init>()V
    .locals 0

    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 816
    return-void
.end method

.method public static appendEscapedSQLString(Ljava/lang/StringBuilder;Ljava/lang/String;)V
    .locals 5

    .line 244
    const/16 v0, 0x27

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 245
    const/16 v0, 0x27

    invoke-virtual {p1, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_2

    .line 246
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    .line 247
    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    .line 248
    invoke-virtual {p1, v3}, Ljava/lang/String;->charAt(I)C

    move-result v4

    .line 249
    const/16 v0, 0x27

    if-ne v4, v0, :cond_0

    .line 250
    const/16 v0, 0x27

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 252
    :cond_0
    invoke-virtual {p0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 247
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 254
    :cond_1
    goto :goto_1

    .line 255
    :cond_2
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 256
    :goto_1
    const/16 v0, 0x27

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 257
    return-void
.end method

.method public static final appendValueToSql(Ljava/lang/StringBuilder;Ljava/lang/Object;)V
    .locals 2

    .line 274
    if-nez p1, :cond_0

    .line 275
    const-string v0, "NULL"

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 276
    :cond_0
    instance-of v0, p1, Ljava/lang/Boolean;

    if-eqz v0, :cond_2

    .line 277
    move-object v1, p1

    check-cast v1, Ljava/lang/Boolean;

    .line 278
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 279
    const/16 v0, 0x31

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 281
    :cond_1
    const/16 v0, 0x30

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 283
    :goto_0
    goto :goto_1

    .line 284
    :cond_2
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lnet/sqlcipher/DatabaseUtils;->appendEscapedSQLString(Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 286
    :goto_1
    return-void
.end method

.method public static bindObjectToProgram(Lnet/sqlcipher/database/SQLiteProgram;ILjava/lang/Object;)V
    .locals 3

    .line 173
    if-nez p2, :cond_0

    .line 174
    invoke-virtual {p0, p1}, Lnet/sqlcipher/database/SQLiteProgram;->bindNull(I)V

    goto :goto_1

    .line 175
    :cond_0
    instance-of v0, p2, Ljava/lang/Double;

    if-nez v0, :cond_1

    instance-of v0, p2, Ljava/lang/Float;

    if-eqz v0, :cond_2

    .line 176
    :cond_1
    move-object v0, p2

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v0

    invoke-virtual {p0, p1, v0, v1}, Lnet/sqlcipher/database/SQLiteProgram;->bindDouble(ID)V

    goto :goto_1

    .line 177
    :cond_2
    instance-of v0, p2, Ljava/lang/Number;

    if-eqz v0, :cond_3

    .line 178
    move-object v0, p2

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    invoke-virtual {p0, p1, v0, v1}, Lnet/sqlcipher/database/SQLiteProgram;->bindLong(IJ)V

    goto :goto_1

    .line 179
    :cond_3
    instance-of v0, p2, Ljava/lang/Boolean;

    if-eqz v0, :cond_5

    .line 180
    move-object v2, p2

    check-cast v2, Ljava/lang/Boolean;

    .line 181
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 182
    const-wide/16 v0, 0x1

    invoke-virtual {p0, p1, v0, v1}, Lnet/sqlcipher/database/SQLiteProgram;->bindLong(IJ)V

    goto :goto_0

    .line 184
    :cond_4
    const-wide/16 v0, 0x0

    invoke-virtual {p0, p1, v0, v1}, Lnet/sqlcipher/database/SQLiteProgram;->bindLong(IJ)V

    .line 186
    :goto_0
    goto :goto_1

    :cond_5
    instance-of v0, p2, [B

    if-eqz v0, :cond_6

    .line 187
    move-object v0, p2

    check-cast v0, [B

    check-cast v0, [B

    invoke-virtual {p0, p1, v0}, Lnet/sqlcipher/database/SQLiteProgram;->bindBlob(I[B)V

    goto :goto_1

    .line 189
    :cond_6
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lnet/sqlcipher/database/SQLiteProgram;->bindString(ILjava/lang/String;)V

    .line 191
    :goto_1
    return-void
.end method

.method public static concatenateWhere(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 293
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 294
    return-object p1

    .line 296
    :cond_0
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 297
    return-object p0

    .line 300
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ") AND ("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static cursorDoubleToContentValues(Lnet/sqlcipher/Cursor;Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;)V
    .locals 3

    .line 613
    invoke-interface {p0, p1}, Lnet/sqlcipher/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v2

    .line 614
    invoke-interface {p0, v2}, Lnet/sqlcipher/Cursor;->isNull(I)Z

    move-result v0

    if-nez v0, :cond_0

    .line 615
    invoke-interface {p0, v2}, Lnet/sqlcipher/Cursor;->getDouble(I)D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-virtual {p2, p3, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Double;)V

    goto :goto_0

    .line 617
    :cond_0
    const/4 v0, 0x0

    const/4 v0, 0x0

    invoke-virtual {p2, p3, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Double;)V

    .line 619
    :goto_0
    return-void
.end method

.method public static cursorDoubleToContentValuesIfPresent(Lnet/sqlcipher/Cursor;Landroid/content/ContentValues;Ljava/lang/String;)V
    .locals 3

    .line 805
    invoke-interface {p0, p2}, Lnet/sqlcipher/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v2

    .line 806
    invoke-interface {p0, v2}, Lnet/sqlcipher/Cursor;->isNull(I)Z

    move-result v0

    if-nez v0, :cond_0

    .line 807
    invoke-interface {p0, v2}, Lnet/sqlcipher/Cursor;->getDouble(I)D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-virtual {p1, p2, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Double;)V

    .line 809
    :cond_0
    return-void
.end method

.method public static cursorDoubleToCursorValues(Lnet/sqlcipher/Cursor;Ljava/lang/String;Landroid/content/ContentValues;)V
    .locals 0

    .line 600
    invoke-static {p0, p1, p2, p1}, Lnet/sqlcipher/DatabaseUtils;->cursorDoubleToContentValues(Lnet/sqlcipher/Cursor;Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;)V

    .line 601
    return-void
.end method

.method public static cursorFillWindow(Lnet/sqlcipher/Cursor;ILandroid/database/CursorWindow;)V
    .locals 8

    .line 1151
    if-ltz p1, :cond_0

    invoke-interface {p0}, Lnet/sqlcipher/Cursor;->getCount()I

    move-result v0

    if-lt p1, v0, :cond_1

    .line 1152
    :cond_0
    return-void

    .line 1154
    :cond_1
    invoke-interface {p0}, Lnet/sqlcipher/Cursor;->getPosition()I

    move-result v2

    .line 1155
    invoke-interface {p0}, Lnet/sqlcipher/Cursor;->getColumnCount()I

    move-result v3

    .line 1156
    invoke-virtual {p2}, Landroid/database/CursorWindow;->clear()V

    .line 1157
    invoke-virtual {p2, p1}, Landroid/database/CursorWindow;->setStartPosition(I)V

    .line 1158
    invoke-virtual {p2, v3}, Landroid/database/CursorWindow;->setNumColumns(I)Z

    .line 1159
    invoke-interface {p0, p1}, Lnet/sqlcipher/Cursor;->moveToPosition(I)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 1161
    :cond_2
    invoke-virtual {p2}, Landroid/database/CursorWindow;->allocRow()Z

    move-result v0

    if-nez v0, :cond_3

    .line 1162
    goto/16 :goto_5

    .line 1164
    :cond_3
    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_7

    .line 1165
    invoke-interface {p0, v4}, Lnet/sqlcipher/Cursor;->getType(I)I

    move-result v5

    .line 1167
    packed-switch v5, :pswitch_data_0

    goto :goto_2

    .line 1169
    :pswitch_0
    invoke-virtual {p2, p1, v4}, Landroid/database/CursorWindow;->putNull(II)Z

    move-result v6

    .line 1170
    goto :goto_3

    .line 1173
    :pswitch_1
    invoke-interface {p0, v4}, Lnet/sqlcipher/Cursor;->getLong(I)J

    move-result-wide v0

    invoke-virtual {p2, v0, v1, p1, v4}, Landroid/database/CursorWindow;->putLong(JII)Z

    move-result v6

    .line 1174
    goto :goto_3

    .line 1177
    :pswitch_2
    invoke-interface {p0, v4}, Lnet/sqlcipher/Cursor;->getDouble(I)D

    move-result-wide v0

    invoke-virtual {p2, v0, v1, p1, v4}, Landroid/database/CursorWindow;->putDouble(DII)Z

    move-result v6

    .line 1178
    goto :goto_3

    .line 1181
    :pswitch_3
    invoke-interface {p0, v4}, Lnet/sqlcipher/Cursor;->getBlob(I)[B

    move-result-object v7

    .line 1182
    if-eqz v7, :cond_4

    invoke-virtual {p2, v7, p1, v4}, Landroid/database/CursorWindow;->putBlob([BII)Z

    move-result v6

    goto :goto_1

    .line 1183
    :cond_4
    invoke-virtual {p2, p1, v4}, Landroid/database/CursorWindow;->putNull(II)Z

    move-result v6

    .line 1184
    :goto_1
    goto :goto_3

    .line 1189
    :goto_2
    :pswitch_4
    invoke-interface {p0, v4}, Lnet/sqlcipher/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v7

    .line 1190
    if-eqz v7, :cond_5

    invoke-virtual {p2, v7, p1, v4}, Landroid/database/CursorWindow;->putString(Ljava/lang/String;II)Z

    move-result v6

    goto :goto_3

    .line 1191
    :cond_5
    invoke-virtual {p2, p1, v4}, Landroid/database/CursorWindow;->putNull(II)Z

    move-result v6

    .line 1192
    .line 1195
    :goto_3
    if-nez v6, :cond_6

    .line 1196
    invoke-virtual {p2}, Landroid/database/CursorWindow;->freeLastRow()V

    .line 1197
    goto :goto_4

    .line 1164
    :cond_6
    add-int/lit8 v4, v4, 0x1

    goto/16 :goto_0

    .line 1200
    :cond_7
    :goto_4
    add-int/lit8 p1, p1, 0x1

    .line 1201
    invoke-interface {p0}, Lnet/sqlcipher/Cursor;->moveToNext()Z

    move-result v0

    if-nez v0, :cond_2

    .line 1203
    :cond_8
    :goto_5
    invoke-interface {p0, v2}, Lnet/sqlcipher/Cursor;->moveToPosition(I)Z

    .line 1204
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_4
        :pswitch_3
    .end packed-switch
.end method

.method public static cursorFloatToContentValuesIfPresent(Lnet/sqlcipher/Cursor;Landroid/content/ContentValues;Ljava/lang/String;)V
    .locals 2

    .line 789
    invoke-interface {p0, p2}, Lnet/sqlcipher/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v1

    .line 790
    invoke-interface {p0, v1}, Lnet/sqlcipher/Cursor;->isNull(I)Z

    move-result v0

    if-nez v0, :cond_0

    .line 791
    invoke-interface {p0, v1}, Lnet/sqlcipher/Cursor;->getFloat(I)F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-virtual {p1, p2, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Float;)V

    .line 793
    :cond_0
    return-void
.end method

.method public static cursorIntToContentValues(Lnet/sqlcipher/Cursor;Ljava/lang/String;Landroid/content/ContentValues;)V
    .locals 0

    .line 539
    invoke-static {p0, p1, p2, p1}, Lnet/sqlcipher/DatabaseUtils;->cursorIntToContentValues(Lnet/sqlcipher/Cursor;Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;)V

    .line 540
    return-void
.end method

.method public static cursorIntToContentValues(Lnet/sqlcipher/Cursor;Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;)V
    .locals 2

    .line 552
    invoke-interface {p0, p1}, Lnet/sqlcipher/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    .line 553
    invoke-interface {p0, v1}, Lnet/sqlcipher/Cursor;->isNull(I)Z

    move-result v0

    if-nez v0, :cond_0

    .line 554
    invoke-interface {p0, v1}, Lnet/sqlcipher/Cursor;->getInt(I)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p2, p3, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    goto :goto_0

    .line 556
    :cond_0
    const/4 v0, 0x0

    const/4 v0, 0x0

    invoke-virtual {p2, p3, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 558
    :goto_0
    return-void
.end method

.method public static cursorIntToContentValuesIfPresent(Lnet/sqlcipher/Cursor;Landroid/content/ContentValues;Ljava/lang/String;)V
    .locals 2

    .line 773
    invoke-interface {p0, p2}, Lnet/sqlcipher/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v1

    .line 774
    invoke-interface {p0, v1}, Lnet/sqlcipher/Cursor;->isNull(I)Z

    move-result v0

    if-nez v0, :cond_0

    .line 775
    invoke-interface {p0, v1}, Lnet/sqlcipher/Cursor;->getInt(I)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1, p2, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 777
    :cond_0
    return-void
.end method

.method public static cursorLongToContentValues(Lnet/sqlcipher/Cursor;Ljava/lang/String;Landroid/content/ContentValues;)V
    .locals 0

    .line 569
    invoke-static {p0, p1, p2, p1}, Lnet/sqlcipher/DatabaseUtils;->cursorLongToContentValues(Lnet/sqlcipher/Cursor;Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;)V

    .line 570
    return-void
.end method

.method public static cursorLongToContentValues(Lnet/sqlcipher/Cursor;Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;)V
    .locals 4

    .line 582
    invoke-interface {p0, p1}, Lnet/sqlcipher/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v2

    .line 583
    invoke-interface {p0, v2}, Lnet/sqlcipher/Cursor;->isNull(I)Z

    move-result v0

    if-nez v0, :cond_0

    .line 584
    invoke-interface {p0, v2}, Lnet/sqlcipher/Cursor;->getLong(I)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    .line 585
    invoke-virtual {p2, p3, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 586
    goto :goto_0

    .line 587
    :cond_0
    const/4 v0, 0x0

    const/4 v0, 0x0

    invoke-virtual {p2, p3, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 589
    :goto_0
    return-void
.end method

.method public static cursorLongToContentValuesIfPresent(Lnet/sqlcipher/Cursor;Landroid/content/ContentValues;Ljava/lang/String;)V
    .locals 3

    .line 741
    invoke-interface {p0, p2}, Lnet/sqlcipher/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v2

    .line 742
    invoke-interface {p0, v2}, Lnet/sqlcipher/Cursor;->isNull(I)Z

    move-result v0

    if-nez v0, :cond_0

    .line 743
    invoke-interface {p0, v2}, Lnet/sqlcipher/Cursor;->getLong(I)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {p1, p2, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 745
    :cond_0
    return-void
.end method

.method public static cursorRowToContentValues(Lnet/sqlcipher/Cursor;Landroid/content/ContentValues;)V
    .locals 6

    .line 628
    instance-of v0, p0, Lnet/sqlcipher/AbstractWindowedCursor;

    if-eqz v0, :cond_0

    move-object v2, p0

    check-cast v2, Lnet/sqlcipher/AbstractWindowedCursor;

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .line 631
    :goto_0
    invoke-interface {p0}, Lnet/sqlcipher/Cursor;->getColumnNames()[Ljava/lang/String;

    move-result-object v3

    .line 632
    array-length v4, v3

    .line 633
    const/4 v5, 0x0

    :goto_1
    if-ge v5, v4, :cond_2

    .line 634
    if-eqz v2, :cond_1

    invoke-virtual {v2, v5}, Lnet/sqlcipher/AbstractWindowedCursor;->isBlob(I)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 635
    aget-object v0, v3, v5

    invoke-interface {p0, v5}, Lnet/sqlcipher/Cursor;->getBlob(I)[B

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;[B)V

    goto :goto_2

    .line 637
    :cond_1
    aget-object v0, v3, v5

    invoke-interface {p0, v5}, Lnet/sqlcipher/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 633
    :goto_2
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    .line 640
    :cond_2
    return-void
.end method

.method public static cursorShortToContentValuesIfPresent(Lnet/sqlcipher/Cursor;Landroid/content/ContentValues;Ljava/lang/String;)V
    .locals 2

    .line 757
    invoke-interface {p0, p2}, Lnet/sqlcipher/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v1

    .line 758
    invoke-interface {p0, v1}, Lnet/sqlcipher/Cursor;->isNull(I)Z

    move-result v0

    if-nez v0, :cond_0

    .line 759
    invoke-interface {p0, v1}, Lnet/sqlcipher/Cursor;->getShort(I)S

    move-result v0

    invoke-static {v0}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v0

    invoke-virtual {p1, p2, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Short;)V

    .line 761
    :cond_0
    return-void
.end method

.method public static cursorStringToContentValues(Lnet/sqlcipher/Cursor;Ljava/lang/String;Landroid/content/ContentValues;)V
    .locals 0

    .line 502
    invoke-static {p0, p1, p2, p1}, Lnet/sqlcipher/DatabaseUtils;->cursorStringToContentValues(Lnet/sqlcipher/Cursor;Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;)V

    .line 503
    return-void
.end method

.method public static cursorStringToContentValues(Lnet/sqlcipher/Cursor;Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;)V
    .locals 1

    .line 528
    invoke-interface {p0, p1}, Lnet/sqlcipher/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p0, v0}, Lnet/sqlcipher/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, p3, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 529
    return-void
.end method

.method public static cursorStringToContentValuesIfPresent(Lnet/sqlcipher/Cursor;Landroid/content/ContentValues;Ljava/lang/String;)V
    .locals 2

    .line 725
    invoke-interface {p0, p2}, Lnet/sqlcipher/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v1

    .line 726
    invoke-interface {p0, v1}, Lnet/sqlcipher/Cursor;->isNull(I)Z

    move-result v0

    if-nez v0, :cond_0

    .line 727
    invoke-interface {p0, v1}, Lnet/sqlcipher/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, p2, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 729
    :cond_0
    return-void
.end method

.method public static cursorStringToInsertHelper(Lnet/sqlcipher/Cursor;Ljava/lang/String;Lnet/sqlcipher/DatabaseUtils$InsertHelper;I)V
    .locals 1

    .line 515
    invoke-interface {p0, p1}, Lnet/sqlcipher/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p0, v0}, Lnet/sqlcipher/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, p3, v0}, Lnet/sqlcipher/DatabaseUtils$InsertHelper;->bind(ILjava/lang/String;)V

    .line 516
    return-void
.end method

.method public static dumpCurrentRow(Lnet/sqlcipher/Cursor;)V
    .locals 1

    .line 430
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-static {p0, v0}, Lnet/sqlcipher/DatabaseUtils;->dumpCurrentRow(Lnet/sqlcipher/Cursor;Ljava/io/PrintStream;)V

    .line 431
    return-void
.end method

.method public static dumpCurrentRow(Lnet/sqlcipher/Cursor;Ljava/io/PrintStream;)V
    .locals 7

    .line 440
    invoke-interface {p0}, Lnet/sqlcipher/Cursor;->getColumnNames()[Ljava/lang/String;

    move-result-object v2

    .line 441
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-interface {p0}, Lnet/sqlcipher/Cursor;->getPosition()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " {"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 442
    array-length v3, v2

    .line 443
    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_0

    .line 446
    :try_start_0
    invoke-interface {p0, v4}, Lnet/sqlcipher/Cursor;->getString(I)Ljava/lang/String;
    :try_end_0
    .catch Lnet/sqlcipher/database/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v5

    .line 451
    goto :goto_1

    .line 447
    :catch_0
    move-exception v6

    .line 450
    const-string v5, "<unprintable>"

    .line 452
    :goto_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "   "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    aget-object v1, v2, v4

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x3d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 443
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 454
    :cond_0
    const-string v0, "}"

    invoke-virtual {p1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 455
    return-void
.end method

.method public static dumpCurrentRow(Lnet/sqlcipher/Cursor;Ljava/lang/StringBuilder;)V
    .locals 7

    .line 464
    invoke-interface {p0}, Lnet/sqlcipher/Cursor;->getColumnNames()[Ljava/lang/String;

    move-result-object v2

    .line 465
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-interface {p0}, Lnet/sqlcipher/Cursor;->getPosition()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " {\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 466
    array-length v3, v2

    .line 467
    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_0

    .line 470
    :try_start_0
    invoke-interface {p0, v4}, Lnet/sqlcipher/Cursor;->getString(I)Ljava/lang/String;
    :try_end_0
    .catch Lnet/sqlcipher/database/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v5

    .line 475
    goto :goto_1

    .line 471
    :catch_0
    move-exception v6

    .line 474
    const-string v5, "<unprintable>"

    .line 476
    :goto_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "   "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    aget-object v1, v2, v4

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x3d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 467
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 478
    :cond_0
    const-string v0, "}\n"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 479
    return-void
.end method

.method public static dumpCurrentRowToString(Lnet/sqlcipher/Cursor;)Ljava/lang/String;
    .locals 2

    .line 488
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 489
    invoke-static {p0, v1}, Lnet/sqlcipher/DatabaseUtils;->dumpCurrentRow(Lnet/sqlcipher/Cursor;Ljava/lang/StringBuilder;)V

    .line 490
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static dumpCursor(Lnet/sqlcipher/Cursor;)V
    .locals 1

    .line 366
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-static {p0, v0}, Lnet/sqlcipher/DatabaseUtils;->dumpCursor(Lnet/sqlcipher/Cursor;Ljava/io/PrintStream;)V

    .line 367
    return-void
.end method

.method public static dumpCursor(Lnet/sqlcipher/Cursor;Ljava/io/PrintStream;)V
    .locals 3

    .line 377
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, ">>>>> Dumping cursor "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 378
    if-eqz p0, :cond_1

    .line 379
    invoke-interface {p0}, Lnet/sqlcipher/Cursor;->getPosition()I

    move-result v2

    .line 381
    const/4 v0, -0x1

    invoke-interface {p0, v0}, Lnet/sqlcipher/Cursor;->moveToPosition(I)Z

    .line 382
    :goto_0
    invoke-interface {p0}, Lnet/sqlcipher/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 383
    invoke-static {p0, p1}, Lnet/sqlcipher/DatabaseUtils;->dumpCurrentRow(Lnet/sqlcipher/Cursor;Ljava/io/PrintStream;)V

    goto :goto_0

    .line 385
    :cond_0
    invoke-interface {p0, v2}, Lnet/sqlcipher/Cursor;->moveToPosition(I)Z

    .line 387
    :cond_1
    const-string v0, "<<<<<"

    invoke-virtual {p1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 388
    return-void
.end method

.method public static dumpCursor(Lnet/sqlcipher/Cursor;Ljava/lang/StringBuilder;)V
    .locals 3

    .line 398
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, ">>>>> Dumping cursor "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 399
    if-eqz p0, :cond_1

    .line 400
    invoke-interface {p0}, Lnet/sqlcipher/Cursor;->getPosition()I

    move-result v2

    .line 402
    const/4 v0, -0x1

    invoke-interface {p0, v0}, Lnet/sqlcipher/Cursor;->moveToPosition(I)Z

    .line 403
    :goto_0
    invoke-interface {p0}, Lnet/sqlcipher/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 404
    invoke-static {p0, p1}, Lnet/sqlcipher/DatabaseUtils;->dumpCurrentRow(Lnet/sqlcipher/Cursor;Ljava/lang/StringBuilder;)V

    goto :goto_0

    .line 406
    :cond_0
    invoke-interface {p0, v2}, Lnet/sqlcipher/Cursor;->moveToPosition(I)Z

    .line 408
    :cond_1
    const-string v0, "<<<<<\n"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 409
    return-void
.end method

.method public static dumpCursorToString(Lnet/sqlcipher/Cursor;)Ljava/lang/String;
    .locals 2

    .line 419
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 420
    invoke-static {p0, v1}, Lnet/sqlcipher/DatabaseUtils;->dumpCursor(Lnet/sqlcipher/Cursor;Ljava/lang/StringBuilder;)V

    .line 421
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static encodeHex([B[C)[C
    .locals 7

    .line 331
    array-length v3, p0

    .line 332
    shl-int/lit8 v0, v3, 0x1

    new-array v4, v0, [C

    .line 334
    const/4 v5, 0x0

    const/4 v6, 0x0

    :goto_0
    if-ge v5, v3, :cond_0

    .line 335
    move v0, v6

    add-int/lit8 v6, v6, 0x1

    aget-byte v1, p0, v5

    and-int/lit16 v1, v1, 0xf0

    ushr-int/lit8 v1, v1, 0x4

    aget-char v1, p1, v1

    aput-char v1, v4, v0

    .line 336
    move v0, v6

    add-int/lit8 v6, v6, 0x1

    aget-byte v1, p0, v5

    and-int/lit8 v1, v1, 0xf

    aget-char v1, p1, v1

    aput-char v1, v4, v0

    .line 334
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 338
    :cond_0
    return-object v4
.end method

.method public static getCollationKey(Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    .line 309
    invoke-static {p0}, Lnet/sqlcipher/DatabaseUtils;->getCollationKeyInBytes(Ljava/lang/String;)[B

    move-result-object v4

    .line 311
    :try_start_0
    new-instance v0, Ljava/lang/String;

    invoke-static {v4}, Lnet/sqlcipher/DatabaseUtils;->getKeyLen([B)I

    move-result v1

    const-string v2, "ISO8859_1"

    const/4 v3, 0x0

    invoke-direct {v0, v4, v3, v1, v2}, Ljava/lang/String;-><init>([BIILjava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    .line 312
    :catch_0
    move-exception v5

    .line 313
    const-string v0, ""

    return-object v0
.end method

.method private static getCollationKeyInBytes(Ljava/lang/String;)[B
    .locals 2

    .line 351
    sget-object v0, Lnet/sqlcipher/DatabaseUtils;->mColl:Ljava/text/Collator;

    if-nez v0, :cond_0

    .line 352
    invoke-static {}, Ljava/text/Collator;->getInstance()Ljava/text/Collator;

    move-result-object v0

    sput-object v0, Lnet/sqlcipher/DatabaseUtils;->mColl:Ljava/text/Collator;

    .line 353
    sget-object v0, Lnet/sqlcipher/DatabaseUtils;->mColl:Ljava/text/Collator;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/text/Collator;->setStrength(I)V

    .line 355
    :cond_0
    sget-object v0, Lnet/sqlcipher/DatabaseUtils;->mColl:Ljava/text/Collator;

    invoke-virtual {v0, p0}, Ljava/text/Collator;->getCollationKey(Ljava/lang/String;)Ljava/text/CollationKey;

    move-result-object v0

    invoke-virtual {v0}, Ljava/text/CollationKey;->toByteArray()[B

    move-result-object v0

    return-object v0
.end method

.method public static getHexCollationKey(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 323
    invoke-static {p0}, Lnet/sqlcipher/DatabaseUtils;->getCollationKeyInBytes(Ljava/lang/String;)[B

    move-result-object v3

    .line 324
    sget-object v0, Lnet/sqlcipher/DatabaseUtils;->HEX_DIGITS_LOWER:[C

    invoke-static {v3, v0}, Lnet/sqlcipher/DatabaseUtils;->encodeHex([B[C)[C

    move-result-object v4

    .line 325
    new-instance v0, Ljava/lang/String;

    invoke-static {v3}, Lnet/sqlcipher/DatabaseUtils;->getKeyLen([B)I

    move-result v1

    mul-int/lit8 v1, v1, 0x2

    const/4 v2, 0x0

    invoke-direct {v0, v4, v2, v1}, Ljava/lang/String;-><init>([CII)V

    return-object v0
.end method

.method private static getKeyLen([B)I
    .locals 2

    .line 342
    array-length v0, p0

    add-int/lit8 v0, v0, -0x1

    aget-byte v0, p0, v0

    if-eqz v0, :cond_0

    .line 343
    array-length v0, p0

    return v0

    .line 346
    :cond_0
    array-length v0, p0

    add-int/lit8 v0, v0, -0x1

    return v0
.end method

.method public static getTypeOfObject(Ljava/lang/Object;)I
    .locals 1

    .line 211
    if-nez p0, :cond_0

    .line 212
    const/4 v0, 0x0

    return v0

    .line 213
    :cond_0
    instance-of v0, p0, [B

    if-eqz v0, :cond_1

    .line 214
    const/4 v0, 0x4

    return v0

    .line 215
    :cond_1
    instance-of v0, p0, Ljava/lang/Float;

    if-nez v0, :cond_2

    instance-of v0, p0, Ljava/lang/Double;

    if-eqz v0, :cond_3

    .line 216
    :cond_2
    const/4 v0, 0x2

    return v0

    .line 217
    :cond_3
    instance-of v0, p0, Ljava/lang/Long;

    if-nez v0, :cond_4

    instance-of v0, p0, Ljava/lang/Integer;

    if-eqz v0, :cond_5

    .line 218
    :cond_4
    const/4 v0, 0x1

    return v0

    .line 220
    :cond_5
    const/4 v0, 0x3

    return v0
.end method

.method public static longForQuery(Lnet/sqlcipher/database/SQLiteDatabase;Ljava/lang/String;[Ljava/lang/String;)J
    .locals 4

    .line 664
    invoke-virtual {p0, p1}, Lnet/sqlcipher/database/SQLiteDatabase;->compileStatement(Ljava/lang/String;)Lnet/sqlcipher/database/SQLiteStatement;

    move-result-object v0

    .line 666
    :try_start_0
    invoke-static {v0, p2}, Lnet/sqlcipher/DatabaseUtils;->longForQuery(Lnet/sqlcipher/database/SQLiteStatement;[Ljava/lang/String;)J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-wide v1

    .line 668
    invoke-virtual {v0}, Lnet/sqlcipher/database/SQLiteStatement;->close()V

    return-wide v1

    :catchall_0
    move-exception v3

    invoke-virtual {v0}, Lnet/sqlcipher/database/SQLiteStatement;->close()V

    throw v3
.end method

.method public static longForQuery(Lnet/sqlcipher/database/SQLiteStatement;[Ljava/lang/String;)J
    .locals 4

    .line 677
    if-eqz p1, :cond_0

    .line 678
    array-length v2, p1

    .line 679
    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_0

    .line 680
    add-int/lit8 v0, v3, 0x1

    aget-object v1, p1, v3

    invoke-static {p0, v0, v1}, Lnet/sqlcipher/DatabaseUtils;->bindObjectToProgram(Lnet/sqlcipher/database/SQLiteProgram;ILjava/lang/Object;)V

    .line 679
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 683
    :cond_0
    invoke-virtual {p0}, Lnet/sqlcipher/database/SQLiteStatement;->simpleQueryForLong()J

    move-result-wide v2

    .line 684
    return-wide v2
.end method

.method public static queryNumEntries(Lnet/sqlcipher/database/SQLiteDatabase;Ljava/lang/String;)J
    .locals 12

    .line 649
    move-object v0, p0

    move-object v1, p1

    sget-object v2, Lnet/sqlcipher/DatabaseUtils;->countProjection:[Ljava/lang/String;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-virtual/range {v0 .. v7}, Lnet/sqlcipher/database/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lnet/sqlcipher/Cursor;

    move-result-object v8

    .line 652
    :try_start_0
    invoke-interface {v8}, Lnet/sqlcipher/Cursor;->moveToFirst()Z

    .line 653
    const/4 v0, 0x0

    invoke-interface {v8, v0}, Lnet/sqlcipher/Cursor;->getLong(I)J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-wide v9

    .line 655
    invoke-interface {v8}, Lnet/sqlcipher/Cursor;->close()V

    return-wide v9

    :catchall_0
    move-exception v11

    invoke-interface {v8}, Lnet/sqlcipher/Cursor;->close()V

    throw v11
.end method

.method public static final readExceptionFromParcel(Landroid/os/Parcel;)V
    .locals 2

    .line 109
    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v0

    .line 110
    if-nez v0, :cond_0

    return-void

    .line 111
    :cond_0
    invoke-virtual {p0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    .line 112
    invoke-static {p0, v1, v0}, Lnet/sqlcipher/DatabaseUtils;->readExceptionFromParcel(Landroid/os/Parcel;Ljava/lang/String;I)V

    .line 113
    return-void
.end method

.method private static final readExceptionFromParcel(Landroid/os/Parcel;Ljava/lang/String;I)V
    .locals 1

    .line 140
    packed-switch p2, :pswitch_data_0

    goto :goto_0

    .line 142
    :pswitch_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 144
    :pswitch_1
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 146
    :pswitch_2
    new-instance v0, Lnet/sqlcipher/database/SQLiteAbortException;

    invoke-direct {v0, p1}, Lnet/sqlcipher/database/SQLiteAbortException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 148
    :pswitch_3
    new-instance v0, Lnet/sqlcipher/database/SQLiteConstraintException;

    invoke-direct {v0, p1}, Lnet/sqlcipher/database/SQLiteConstraintException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 150
    :pswitch_4
    new-instance v0, Lnet/sqlcipher/database/SQLiteDatabaseCorruptException;

    invoke-direct {v0, p1}, Lnet/sqlcipher/database/SQLiteDatabaseCorruptException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 152
    :pswitch_5
    new-instance v0, Lnet/sqlcipher/database/SQLiteFullException;

    invoke-direct {v0, p1}, Lnet/sqlcipher/database/SQLiteFullException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 154
    :pswitch_6
    new-instance v0, Lnet/sqlcipher/database/SQLiteDiskIOException;

    invoke-direct {v0, p1}, Lnet/sqlcipher/database/SQLiteDiskIOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 156
    :pswitch_7
    new-instance v0, Lnet/sqlcipher/database/SQLiteException;

    invoke-direct {v0, p1}, Lnet/sqlcipher/database/SQLiteException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 158
    :goto_0
    invoke-virtual {p0, p2, p1}, Landroid/os/Parcel;->readException(ILjava/lang/String;)V

    .line 160
    return-void

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_7
    .end packed-switch
.end method

.method public static readExceptionWithFileNotFoundExceptionFromParcel(Landroid/os/Parcel;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/FileNotFoundException;
        }
    .end annotation

    .line 117
    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v1

    .line 118
    if-nez v1, :cond_0

    return-void

    .line 119
    :cond_0
    invoke-virtual {p0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v2

    .line 120
    const/4 v0, 0x1

    if-ne v1, v0, :cond_1

    .line 121
    new-instance v0, Ljava/io/FileNotFoundException;

    invoke-direct {v0, v2}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 123
    :cond_1
    invoke-static {p0, v2, v1}, Lnet/sqlcipher/DatabaseUtils;->readExceptionFromParcel(Landroid/os/Parcel;Ljava/lang/String;I)V

    .line 125
    return-void
.end method

.method public static readExceptionWithOperationApplicationExceptionFromParcel(Landroid/os/Parcel;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/content/OperationApplicationException;
        }
    .end annotation

    .line 129
    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v1

    .line 130
    if-nez v1, :cond_0

    return-void

    .line 131
    :cond_0
    invoke-virtual {p0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v2

    .line 132
    const/16 v0, 0xa

    if-ne v1, v0, :cond_1

    .line 133
    new-instance v0, Landroid/content/OperationApplicationException;

    invoke-direct {v0, v2}, Landroid/content/OperationApplicationException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 135
    :cond_1
    invoke-static {p0, v2, v1}, Lnet/sqlcipher/DatabaseUtils;->readExceptionFromParcel(Landroid/os/Parcel;Ljava/lang/String;I)V

    .line 137
    return-void
.end method

.method public static sqlEscapeString(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 263
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 265
    invoke-static {v1, p0}, Lnet/sqlcipher/DatabaseUtils;->appendEscapedSQLString(Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 267
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static stringForQuery(Lnet/sqlcipher/database/SQLiteDatabase;Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 692
    invoke-virtual {p0, p1}, Lnet/sqlcipher/database/SQLiteDatabase;->compileStatement(Ljava/lang/String;)Lnet/sqlcipher/database/SQLiteStatement;

    move-result-object v0

    .line 694
    :try_start_0
    invoke-static {v0, p2}, Lnet/sqlcipher/DatabaseUtils;->stringForQuery(Lnet/sqlcipher/database/SQLiteStatement;[Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v1

    .line 696
    invoke-virtual {v0}, Lnet/sqlcipher/database/SQLiteStatement;->close()V

    return-object v1

    :catchall_0
    move-exception v2

    invoke-virtual {v0}, Lnet/sqlcipher/database/SQLiteStatement;->close()V

    throw v2
.end method

.method public static stringForQuery(Lnet/sqlcipher/database/SQLiteStatement;[Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 705
    if-eqz p1, :cond_0

    .line 706
    array-length v2, p1

    .line 707
    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_0

    .line 708
    add-int/lit8 v0, v3, 0x1

    aget-object v1, p1, v3

    invoke-static {p0, v0, v1}, Lnet/sqlcipher/DatabaseUtils;->bindObjectToProgram(Lnet/sqlcipher/database/SQLiteProgram;ILjava/lang/Object;)V

    .line 707
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 711
    :cond_0
    invoke-virtual {p0}, Lnet/sqlcipher/database/SQLiteStatement;->simpleQueryForString()Ljava/lang/String;

    move-result-object v2

    .line 712
    return-object v2
.end method

.method public static final writeExceptionToParcel(Landroid/os/Parcel;Ljava/lang/Exception;)V
    .locals 4

    .line 63
    const/4 v2, 0x0

    .line 64
    const/4 v3, 0x1

    .line 65
    instance-of v0, p1, Ljava/io/FileNotFoundException;

    if-eqz v0, :cond_0

    .line 66
    const/4 v2, 0x1

    .line 67
    const/4 v3, 0x0

    goto/16 :goto_0

    .line 68
    :cond_0
    instance-of v0, p1, Ljava/lang/IllegalArgumentException;

    if-eqz v0, :cond_1

    .line 69
    const/4 v2, 0x2

    goto :goto_0

    .line 70
    :cond_1
    instance-of v0, p1, Ljava/lang/UnsupportedOperationException;

    if-eqz v0, :cond_2

    .line 71
    const/4 v2, 0x3

    goto :goto_0

    .line 72
    :cond_2
    instance-of v0, p1, Lnet/sqlcipher/database/SQLiteAbortException;

    if-eqz v0, :cond_3

    .line 73
    const/4 v2, 0x4

    goto :goto_0

    .line 74
    :cond_3
    instance-of v0, p1, Lnet/sqlcipher/database/SQLiteConstraintException;

    if-eqz v0, :cond_4

    .line 75
    const/4 v2, 0x5

    goto :goto_0

    .line 76
    :cond_4
    instance-of v0, p1, Lnet/sqlcipher/database/SQLiteDatabaseCorruptException;

    if-eqz v0, :cond_5

    .line 77
    const/4 v2, 0x6

    goto :goto_0

    .line 78
    :cond_5
    instance-of v0, p1, Lnet/sqlcipher/database/SQLiteFullException;

    if-eqz v0, :cond_6

    .line 79
    const/4 v2, 0x7

    goto :goto_0

    .line 80
    :cond_6
    instance-of v0, p1, Lnet/sqlcipher/database/SQLiteDiskIOException;

    if-eqz v0, :cond_7

    .line 81
    const/16 v2, 0x8

    goto :goto_0

    .line 82
    :cond_7
    instance-of v0, p1, Lnet/sqlcipher/database/SQLiteException;

    if-eqz v0, :cond_8

    .line 83
    const/16 v2, 0x9

    goto :goto_0

    .line 84
    :cond_8
    instance-of v0, p1, Landroid/content/OperationApplicationException;

    if-eqz v0, :cond_9

    .line 85
    const/16 v2, 0xa

    goto :goto_0

    .line 87
    :cond_9
    invoke-virtual {p0, p1}, Landroid/os/Parcel;->writeException(Ljava/lang/Exception;)V

    .line 88
    const-string v0, "DatabaseUtils"

    const-string v1, "Writing exception to parcel"

    invoke-static {v0, v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 89
    return-void

    .line 91
    :goto_0
    invoke-virtual {p0, v2}, Landroid/os/Parcel;->writeInt(I)V

    .line 92
    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 94
    if-eqz v3, :cond_a

    .line 95
    const-string v0, "DatabaseUtils"

    const-string v1, "Writing exception to parcel"

    invoke-static {v0, v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 97
    :cond_a
    return-void
.end method
