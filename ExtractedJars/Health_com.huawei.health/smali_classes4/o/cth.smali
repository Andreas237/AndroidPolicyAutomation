.class public Lo/cth;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/cth$e;
    }
.end annotation


# instance fields
.field private a:I

.field private b:I

.field private c:Landroid/content/Context;

.field private d:I

.field private e:Lo/crf;


# direct methods
.method public constructor <init>(Landroid/content/Context;II)V
    .locals 2

    .line 48
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 45
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/cnk;->a(J)I

    move-result v0

    iput v0, p0, Lo/cth;->a:I

    .line 49
    iput-object p1, p0, Lo/cth;->c:Landroid/content/Context;

    .line 50
    iput p2, p0, Lo/cth;->d:I

    .line 51
    iput p3, p0, Lo/cth;->b:I

    .line 52
    return-void
.end method

.method private a(Ljava/util/List;I)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;I)V"
        }
    .end annotation

    .line 195
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/HiHealthData;

    invoke-virtual {v0}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/cnk;->a(J)I

    move-result v4

    .line 196
    iget-object v0, p0, Lo/cth;->e:Lo/crf;

    iget v1, p0, Lo/cth;->d:I

    invoke-virtual {v0, p1, v1}, Lo/crf;->d(Ljava/util/List;I)I

    move-result v5

    .line 197
    const-string v0, "Debug_HiSyncBackgroud"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "insert size="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ", Record day="

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, " ,errorCode="

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 198
    const/4 v0, 0x1

    if-ne v0, p2, :cond_0

    .line 199
    iget v0, p0, Lo/cth;->a:I

    if-le v0, v4, :cond_0

    .line 200
    iput v4, p0, Lo/cth;->a:I

    .line 203
    :cond_0
    iget-object v0, p0, Lo/cth;->e:Lo/crf;

    invoke-virtual {v0, p1}, Lo/crf;->c(Ljava/util/List;)V

    .line 204
    iget-object v0, p0, Lo/cth;->e:Lo/crf;

    invoke-virtual {v0}, Lo/crf;->e()V

    .line 205
    return-void
.end method

.method private a(IJ)Z
    .locals 4

    .line 191
    const/4 v0, 0x1

    if-ne v0, p1, :cond_0

    iget v0, p0, Lo/cth;->b:I

    int-to-long v0, v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    sub-long/2addr v2, p2

    cmp-long v0, v0, v2

    if-gez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static b(Landroid/content/Context;Ljava/util/List;II)V
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;II)V"
        }
    .end annotation

    .line 208
    invoke-static/range {p0 .. p0}, Lo/cqo;->a(Landroid/content/Context;)Lo/cqo;

    move-result-object v6

    .line 209
    move-object/from16 v0, p1

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/HiHealthData;

    invoke-virtual {v0}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v7

    .line 210
    const/16 v9, 0x3e8

    .line 211
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->size()I

    move-result v10

    .line 212
    const/4 v11, 0x0

    .line 213
    const-string v0, "Debug_HiSyncBackgroud"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "hiHealthDatas size is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 214
    const/4 v0, 0x1

    if-le v10, v0, :cond_0

    .line 215
    new-instance v0, Lo/cth$e;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/cth$e;-><init>(Lo/cth$3;)V

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 216
    const-string v0, "Debug_HiSyncBackgroud"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Collections.sort finish"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 218
    :cond_0
    if-gt v10, v9, :cond_1

    .line 219
    invoke-static/range {p1 .. p1}, Lo/cnj;->d(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v11

    .line 220
    move-object v0, v6

    move/from16 v1, p3

    move/from16 v2, p2

    move-object v3, v11

    move-wide v4, v7

    invoke-virtual/range {v0 .. v5}, Lo/cqo;->b(IILjava/lang/String;J)Z

    move-result v0

    if-nez v0, :cond_7

    .line 221
    const-string v0, "Debug_HiSyncBackgroud"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "performDownloadByVersion saveVersionToDB failed "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_3

    .line 225
    :cond_1
    div-int/lit16 v12, v10, 0x3e8

    .line 226
    rem-int/lit16 v0, v10, 0x3e8

    if-eqz v0, :cond_2

    .line 227
    add-int/lit8 v12, v12, 0x1

    .line 229
    :cond_2
    const/4 v13, 0x0

    .line 230
    const/4 v14, 0x0

    .line 231
    const/4 v15, 0x0

    :goto_0
    if-ge v15, v12, :cond_7

    .line 232
    const-string v0, "Debug_HiSyncBackgroud"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "subhiHealthDatas begin page = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 233
    mul-int/lit16 v13, v15, 0x3e8

    .line 234
    add-int/lit8 v0, v15, 0x1

    mul-int/lit16 v0, v0, 0x3e8

    if-le v0, v10, :cond_3

    move v14, v10

    goto :goto_1

    :cond_3
    add-int/lit8 v0, v15, 0x1

    mul-int/lit16 v0, v0, 0x3e8

    add-int/lit8 v14, v0, -0x1

    .line 235
    :goto_1
    move-object/from16 v0, p1

    invoke-interface {v0, v13, v14}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v16

    .line 236
    const/4 v0, 0x0

    move-object/from16 v1, v16

    if-eq v0, v1, :cond_4

    invoke-interface/range {v16 .. v16}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 237
    :cond_4
    const-string v0, "Debug_HiSyncBackgroud"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "subhiHealthDatas is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 238
    goto :goto_2

    .line 240
    :cond_5
    invoke-static/range {v16 .. v16}, Lo/cnj;->d(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v11

    .line 241
    move-object v0, v6

    move/from16 v1, p3

    move/from16 v2, p2

    move-object v3, v11

    move-wide v4, v7

    invoke-virtual/range {v0 .. v5}, Lo/cqo;->b(IILjava/lang/String;J)Z

    move-result v0

    if-nez v0, :cond_6

    .line 242
    const-string v0, "Debug_HiSyncBackgroud"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "performDownloadByVersion saveVersionToDB failed "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 244
    :cond_6
    const-string v0, "Debug_HiSyncBackgroud"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "subhiHealthDatas over"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 231
    :goto_2
    add-int/lit8 v15, v15, 0x1

    goto/16 :goto_0

    .line 247
    :cond_7
    :goto_3
    return-void
.end method

.method private c(IILnet/sqlcipher/database/SQLiteDatabase;J)I
    .locals 16

    .line 109
    const/4 v4, 0x0

    .line 110
    const/4 v5, 0x1

    .line 111
    const/4 v6, 0x0

    .line 112
    const/4 v7, 0x0

    .line 113
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 114
    const/4 v9, 0x0

    .line 115
    const/4 v10, 0x0

    .line 116
    invoke-static/range {p1 .. p1}, Lo/cpn;->e(I)Ljava/lang/String;

    move-result-object v9

    .line 117
    invoke-static/range {p1 .. p1}, Lo/cpn;->d(I)Ljava/lang/String;

    move-result-object v10

    .line 119
    move-object/from16 v0, p3

    :try_start_0
    invoke-virtual {v0, v9}, Lnet/sqlcipher/database/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 120
    move-object/from16 v0, p3

    invoke-virtual {v0, v10}, Lnet/sqlcipher/database/SQLiteDatabase;->execSQL(Ljava/lang/String;)V
    :try_end_0
    .catch Lnet/sqlcipher/database/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 125
    goto :goto_0

    .line 121
    :catch_0
    move-exception v11

    .line 122
    const-string v0, "Debug_HiSyncBackgroud"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ClearAllInfo SQLiteException!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 125
    goto :goto_0

    .line 123
    :catch_1
    move-exception v11

    .line 124
    const-string v0, "Debug_HiSyncBackgroud"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ClearAllInfo Exception!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 128
    :goto_0
    move-object/from16 v0, p0

    :try_start_1
    iget-object v0, v0, Lo/cth;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/cqo;->a(Landroid/content/Context;)Lo/cqo;

    move-result-object v0

    move-object/from16 v1, p0

    iget v1, v1, Lo/cth;->d:I

    move/from16 v2, p2

    invoke-virtual {v0, v1, v2}, Lo/cqo;->d(II)Landroid/database/Cursor;

    move-result-object v0

    move-object v7, v0

    .line 129
    const/4 v0, 0x0

    if-ne v0, v7, :cond_1

    .line 130
    const-string v0, "Debug_HiSyncBackgroud"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "query = null "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catch Lnet/sqlcipher/database/SQLiteException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_3
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 131
    const/4 v11, -0x1

    .line 183
    if-eqz v7, :cond_0

    .line 184
    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    .line 131
    :cond_0
    return v11

    .line 134
    :cond_1
    :try_start_2
    invoke-interface {v7}, Landroid/database/Cursor;->getCount()I

    move-result v6

    .line 135
    const-string v0, "Debug_HiSyncBackgroud"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "type="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static/range {p2 .. p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " ,query count "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 137
    :goto_1
    invoke-interface {v7}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 138
    move-object/from16 v0, p0

    move/from16 v1, p2

    move-wide/from16 v2, p4

    invoke-direct {v0, v1, v2, v3}, Lo/cth;->a(IJ)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 140
    const-string v0, "HiH_HiSyncBackgroud"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "backgroud insert large "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    move-object/from16 v2, p0

    iget v2, v2, Lo/cth;->b:I

    div-int/lit16 v2, v2, 0x3e8

    div-int/lit8 v2, v2, 0x3c

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " min braek! insert data size="

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 141
    const/4 v5, 0x0

    .line 142
    goto/16 :goto_3

    .line 144
    :cond_2
    const-string v0, "data"

    invoke-interface {v7, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v7, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v11

    .line 145
    const/4 v0, 0x0

    if-ne v0, v11, :cond_3

    .line 146
    const-string v0, "Debug_HiSyncBackgroud"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "data  = nul"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_2

    .line 149
    :cond_3
    const-string v0, "_id"

    invoke-interface {v7, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v7, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v12

    .line 150
    new-instance v0, Lo/cth$3;

    move-object/from16 v1, p0

    invoke-direct {v0, v1}, Lo/cth$3;-><init>(Lo/cth;)V

    invoke-virtual {v0}, Lo/cth$3;->getType()Ljava/lang/reflect/Type;

    move-result-object v0

    invoke-static {v11, v0}, Lo/cnj;->d(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Ljava/util/List;

    .line 151
    invoke-static {v13}, Lo/cne;->e(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 152
    goto/16 :goto_1

    .line 155
    :cond_4
    invoke-interface {v8, v13}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 156
    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v0

    const/16 v1, 0xc8

    if-le v0, v1, :cond_5

    .line 157
    move-object/from16 v0, p0

    move/from16 v1, p2

    invoke-direct {v0, v8, v1}, Lo/cth;->a(Ljava/util/List;I)V

    .line 158
    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v0

    add-int/2addr v4, v0

    .line 159
    invoke-interface {v8}, Ljava/util/List;->clear()V

    .line 160
    invoke-static {}, Lo/csk;->a()V

    .line 162
    :cond_5
    move/from16 v0, p1

    invoke-static {v0, v12}, Lo/cpn;->b(II)Ljava/lang/String;

    move-result-object v14

    .line 163
    move-object/from16 v0, p3

    invoke-virtual {v0, v14}, Lnet/sqlcipher/database/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 166
    :goto_2
    goto/16 :goto_1

    .line 167
    :cond_6
    :goto_3
    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_7

    .line 168
    move-object/from16 v0, p0

    move/from16 v1, p2

    invoke-direct {v0, v8, v1}, Lo/cth;->a(Ljava/util/List;I)V

    .line 169
    invoke-interface {v8}, Ljava/util/List;->size()I
    :try_end_2
    .catch Lnet/sqlcipher/database/SQLiteException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_3
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move-result v0

    add-int/2addr v4, v0

    .line 172
    :cond_7
    if-nez v5, :cond_9

    .line 173
    const/4 v11, -0x2

    .line 183
    if-eqz v7, :cond_8

    .line 184
    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    .line 173
    :cond_8
    return v11

    .line 175
    :cond_9
    const-string v0, "HiH_HiSyncBackgroud"

    const/4 v1, 0x6

    :try_start_3
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "insert "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static/range {p2 .. p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " over datasize= "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, ", total time="

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    sub-long v2, v2, p4

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_3
    .catch Lnet/sqlcipher/database/SQLiteException; {:try_start_3 .. :try_end_3} :catch_2
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 183
    if-eqz v7, :cond_d

    .line 184
    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    goto :goto_4

    .line 176
    :catch_2
    move-exception v11

    .line 177
    const-string v0, "Debug_HiSyncBackgroud"

    const/4 v1, 0x1

    :try_start_4
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ClearAllInfo SQLiteException!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 178
    const/4 v12, -0x2

    .line 183
    if-eqz v7, :cond_a

    .line 184
    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    .line 178
    :cond_a
    return v12

    .line 179
    :catch_3
    move-exception v11

    .line 180
    const-string v0, "Debug_HiSyncBackgroud"

    const/4 v1, 0x2

    :try_start_5
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ClearAllInfo Exception! e="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v11}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 181
    const/4 v12, -0x2

    .line 183
    if-eqz v7, :cond_b

    .line 184
    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    .line 181
    :cond_b
    return v12

    .line 183
    :catchall_0
    move-exception v15

    if-eqz v7, :cond_c

    .line 184
    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    .line 186
    :cond_c
    throw v15

    .line 187
    :cond_d
    :goto_4
    const/4 v0, 0x0

    return v0
.end method

.method private e()V
    .locals 1

    .line 55
    iget-object v0, p0, Lo/cth;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/crf;->b(Landroid/content/Context;)Lo/crf;

    move-result-object v0

    iput-object v0, p0, Lo/cth;->e:Lo/crf;

    .line 56
    return-void
.end method


# virtual methods
.method public run()V
    .locals 15

    .line 61
    invoke-direct {p0}, Lo/cth;->e()V

    .line 62
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    .line 63
    const-string v0, "HiH_HiSyncBackgroud"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "insert time "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 64
    iget-object v0, p0, Lo/cth;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/cnu;->b(Landroid/content/Context;)Lo/cnu;

    move-result-object v0

    invoke-virtual {v0}, Lo/cnu;->d()Lnet/sqlcipher/database/SQLiteDatabase;

    move-result-object v8

    .line 65
    const/4 v9, 0x0

    .line 66
    const/4 v10, 0x0

    .line 67
    const/4 v11, 0x1

    .line 68
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/cnk;->a(J)I

    move-result v0

    iput v0, p0, Lo/cth;->a:I

    .line 69
    const/4 v12, 0x1

    .line 71
    const/4 v0, 0x0

    if-ne v0, v8, :cond_0

    .line 72
    const-string v0, "HiH_HiSyncBackgroud"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "error: db is not open!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 73
    return-void

    .line 76
    :cond_0
    move-object v0, p0

    move v1, v11

    move-object v3, v8

    move-wide v4, v6

    const/4 v1, 0x1

    const/16 v2, 0x2711

    invoke-direct/range {v0 .. v5}, Lo/cth;->c(IILnet/sqlcipher/database/SQLiteDatabase;J)I

    .line 78
    move-object v0, p0

    move v1, v11

    move-object v3, v8

    move-wide v4, v6

    const/4 v1, 0x1

    const/4 v2, 0x1

    invoke-direct/range {v0 .. v5}, Lo/cth;->c(IILnet/sqlcipher/database/SQLiteDatabase;J)I

    move-result v13

    .line 79
    const/4 v0, -0x2

    if-ne v0, v13, :cond_1

    .line 80
    const/4 v12, 0x0

    .line 83
    :cond_1
    iget-object v0, p0, Lo/cth;->c:Landroid/content/Context;

    iget v1, p0, Lo/cth;->d:I

    iget v2, p0, Lo/cth;->a:I

    invoke-static {v0, v1, v2}, Lo/cui;->a(Landroid/content/Context;II)V

    .line 84
    if-eqz v12, :cond_2

    .line 85
    iget-object v0, p0, Lo/cth;->c:Landroid/content/Context;

    iget v1, p0, Lo/cth;->d:I

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lo/cui;->c(Landroid/content/Context;II)V

    goto :goto_0

    .line 87
    :cond_2
    iget-object v0, p0, Lo/cth;->c:Landroid/content/Context;

    iget v1, p0, Lo/cth;->d:I

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Lo/cui;->c(Landroid/content/Context;II)V

    .line 88
    iget-object v0, p0, Lo/cth;->c:Landroid/content/Context;

    iget v1, p0, Lo/cth;->d:I

    invoke-static {v0, v1, v6, v7}, Lo/cui;->e(Landroid/content/Context;IJ)V

    .line 90
    :goto_0
    const/4 v0, 0x0

    invoke-static {v0}, Lo/csk;->e(Z)V

    .line 93
    invoke-static {v11}, Lo/cpn;->e(I)Ljava/lang/String;

    move-result-object v9

    .line 94
    invoke-static {v11}, Lo/cpn;->d(I)Ljava/lang/String;

    move-result-object v10

    .line 96
    :try_start_0
    invoke-virtual {v8, v9}, Lnet/sqlcipher/database/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 97
    invoke-virtual {v8, v10}, Lnet/sqlcipher/database/SQLiteDatabase;->execSQL(Ljava/lang/String;)V
    :try_end_0
    .catch Lnet/sqlcipher/database/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 102
    goto :goto_1

    .line 98
    :catch_0
    move-exception v14

    .line 99
    const-string v0, "Debug_HiSyncBackgroud"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ClearAllInfo SQLiteException!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 102
    goto :goto_1

    .line 100
    :catch_1
    move-exception v14

    .line 101
    const-string v0, "Debug_HiSyncBackgroud"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ClearAllInfo Exception!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 104
    :goto_1
    const-string v0, "HiH_HiSyncBackgroud"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "insert over !Background task is down! totalTime = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    sub-long/2addr v2, v6

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 105
    return-void
.end method
