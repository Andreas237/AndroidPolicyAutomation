.class public Lo/cqc;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/cqc$c;
    }
.end annotation


# static fields
.field private static c:Landroid/content/Context;


# instance fields
.field private b:Lo/cot;


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    sget-object v0, Lo/cqc;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/cot;->d(Landroid/content/Context;)Lo/cot;

    move-result-object v0

    iput-object v0, p0, Lo/cqc;->b:Lo/cot;

    .line 35
    return-void
.end method

.method synthetic constructor <init>(Lo/cqc$3;)V
    .locals 0

    .line 25
    invoke-direct {p0}, Lo/cqc;-><init>()V

    return-void
.end method

.method private c(JJI)[Ljava/lang/String;
    .locals 3

    .line 221
    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/String;

    invoke-static {p1, p2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-static {p3, p4}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    invoke-static {p5}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    return-object v0
.end method

.method private d(Lcom/huawei/hihealth/HiHealthData;II)I
    .locals 9

    .line 174
    invoke-static {p1, p3}, Lo/cpi;->d(Lcom/huawei/hihealth/HiHealthData;I)Landroid/content/ContentValues;

    move-result-object v8

    .line 176
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiHealthData;->getSyncStatus()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 177
    const-string v0, "sync_status"

    invoke-virtual {v8, v0}, Landroid/content/ContentValues;->remove(Ljava/lang/String;)V

    .line 179
    :cond_0
    iget-object v0, p0, Lo/cqc;->b:Lo/cot;

    invoke-direct {p0}, Lo/cqc;->d()Ljava/lang/String;

    move-result-object v1

    move-object v2, p0

    invoke-virtual {p1}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v3

    invoke-virtual {p1}, Lcom/huawei/hihealth/HiHealthData;->getEndTime()J

    move-result-wide v5

    move v7, p2

    invoke-direct/range {v2 .. v7}, Lo/cqc;->c(JJI)[Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v8, v1, v2}, Lo/cot;->d(Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method private d()Ljava/lang/String;
    .locals 1

    .line 215
    const-string v0, "start_time =? and end_time =? and client_id =? "

    return-object v0
.end method

.method public static e(Landroid/content/Context;)Lo/cqc;
    .locals 1

    .line 46
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    sput-object v0, Lo/cqc;->c:Landroid/content/Context;

    .line 47
    sget-object v0, Lo/cqc$c;->e:Lo/cqc;

    return-object v0
.end method

.method private e(JJI)Z
    .locals 7

    .line 198
    iget-object v0, p0, Lo/cqc;->b:Lo/cot;

    invoke-direct {p0}, Lo/cqc;->d()Ljava/lang/String;

    move-result-object v1

    invoke-direct/range {p0 .. p5}, Lo/cqc;->c(JJI)[Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Lo/cot;->b(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v6

    .line 199
    invoke-static {v6}, Lo/cph;->z(Landroid/database/Cursor;)Z

    move-result v0

    return v0
.end method


# virtual methods
.method public a(JJI)I
    .locals 3

    .line 57
    iget-object v0, p0, Lo/cqc;->b:Lo/cot;

    invoke-direct {p0}, Lo/cqc;->d()Ljava/lang/String;

    move-result-object v1

    invoke-direct/range {p0 .. p5}, Lo/cqc;->c(JJI)[Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo/cot;->b(Ljava/lang/String;[Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public a(Lcom/huawei/hihealth/HiHealthData;II)I
    .locals 9

    .line 191
    new-instance v8, Landroid/content/ContentValues;

    invoke-direct {v8}, Landroid/content/ContentValues;-><init>()V

    .line 192
    const-string v0, "sync_status"

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v8, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 193
    const-string v0, "modified_time"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v8, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 194
    iget-object v0, p0, Lo/cqc;->b:Lo/cot;

    invoke-direct {p0}, Lo/cqc;->d()Ljava/lang/String;

    move-result-object v1

    move-object v2, p0

    invoke-virtual {p1}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v3

    invoke-virtual {p1}, Lcom/huawei/hihealth/HiHealthData;->getEndTime()J

    move-result-wide v5

    move v7, p2

    invoke-direct/range {v2 .. v7}, Lo/cqc;->c(JJI)[Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v8, v1, v2}, Lo/cot;->d(Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public a(JJLjava/util/List;)Ljava/util/List;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JJLjava/util/List<Ljava/lang/Integer;>;)Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation

    .line 78
    invoke-interface {p5}, Ljava/util/List;->size()I

    move-result v6

    .line 79
    new-instance v7, Ljava/lang/StringBuffer;

    invoke-direct {v7}, Ljava/lang/StringBuffer;-><init>()V

    .line 80
    add-int/lit8 v0, v6, 0x2

    new-array v8, v0, [Ljava/lang/String;

    .line 81
    const-string v0, "start_time"

    invoke-virtual {v7, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " =? and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "end_time"

    .line 82
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " =? "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 83
    invoke-static {p1, p2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v8, v1

    .line 84
    invoke-static {p3, p4}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v8, v1

    .line 85
    const-string v0, "client_id"

    move-object v1, p5

    move v2, v6

    move-object v3, v7

    move-object v4, v8

    const/4 v5, 0x2

    invoke-static/range {v0 .. v5}, Lo/cpn;->e(Ljava/lang/String;Ljava/util/List;ILjava/lang/StringBuffer;[Ljava/lang/String;I)V

    .line 86
    const-string v0, " ORDER BY "

    invoke-virtual {v7, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "start_time"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " ASC "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 87
    iget-object v0, p0, Lo/cqc;->b:Lo/cot;

    invoke-virtual {v7}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    move-object v2, v8

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Lo/cot;->b(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v9

    .line 88
    invoke-static {v9}, Lo/cph;->e(Landroid/database/Cursor;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public a(Ljava/util/List;III)Ljava/util/List;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/Integer;>;III)Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation

    .line 258
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v6

    .line 259
    new-instance v7, Ljava/lang/StringBuffer;

    invoke-direct {v7}, Ljava/lang/StringBuffer;-><init>()V

    .line 260
    new-array v8, v6, [Ljava/lang/String;

    .line 261
    const-string v0, "client_id"

    move-object v1, p1

    move v2, v6

    move-object v3, v7

    move-object v4, v8

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Lo/cpn;->e(Ljava/lang/String;Ljava/util/List;ILjava/lang/StringBuffer;[Ljava/lang/String;I)V

    .line 263
    const-string v0, "start_time"

    invoke-static {v0, p2, p3, p4}, Lo/cpn;->b(Ljava/lang/String;III)Ljava/lang/String;

    move-result-object v9

    .line 265
    iget-object v0, p0, Lo/cqc;->b:Lo/cot;

    invoke-virtual {v7}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    move-object v2, v8

    move-object v5, v9

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual/range {v0 .. v5}, Lo/cot;->b(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v10

    .line 266
    invoke-static {v10}, Lo/cph;->e(Landroid/database/Cursor;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public b(JII)I
    .locals 6

    .line 241
    invoke-static {p3, p4}, Lo/cpi;->a(II)Landroid/content/ContentValues;

    move-result-object v5

    .line 242
    iget-object v0, p0, Lo/cqc;->b:Lo/cot;

    const-string v1, "_id =? "

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/String;

    invoke-static {p1, p2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {v0, v5, v1, v2}, Lo/cot;->d(Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public b(JJI)I
    .locals 6

    .line 183
    new-instance v4, Landroid/content/ContentValues;

    invoke-direct {v4}, Landroid/content/ContentValues;-><init>()V

    .line 184
    const-string v0, "sync_status"

    invoke-static {p5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 185
    const-string v0, "modified_time"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 186
    const-string v5, "_id =? and modified_time =? "

    .line 187
    iget-object v0, p0, Lo/cqc;->b:Lo/cot;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/String;

    invoke-static {p1, p2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p3, p4}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-virtual {v0, v4, v5, v1}, Lo/cot;->d(Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public b(Lcom/huawei/hihealth/HiDataReadOption;Ljava/util/List;II)Ljava/util/List;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/hihealth/HiDataReadOption;Ljava/util/List<Ljava/lang/Integer;>;II)Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation

    .line 92
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v6

    .line 93
    new-instance v7, Ljava/lang/StringBuffer;

    invoke-direct {v7}, Ljava/lang/StringBuffer;-><init>()V

    .line 94
    add-int/lit8 v0, v6, 0x5

    new-array v8, v0, [Ljava/lang/String;

    .line 95
    const-string v0, "start_time"

    invoke-virtual {v7, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " =? and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "end_time"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " =? and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "type_id"

    .line 96
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " >=? and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "type_id"

    .line 97
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " <=? and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "merged"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " != ?"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 98
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiDataReadOption;->getStartTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v8, v1

    .line 99
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiDataReadOption;->getEndTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v8, v1

    .line 100
    invoke-static {p3}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    aput-object v0, v8, v1

    .line 101
    invoke-static {p4}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x3

    aput-object v0, v8, v1

    .line 102
    const/4 v0, 0x2

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x4

    aput-object v0, v8, v1

    .line 103
    const-string v0, "client_id"

    move-object v1, p2

    move v2, v6

    move-object v3, v7

    move-object v4, v8

    const/4 v5, 0x5

    invoke-static/range {v0 .. v5}, Lo/cpn;->e(Ljava/lang/String;Ljava/util/List;ILjava/lang/StringBuffer;[Ljava/lang/String;I)V

    .line 104
    const-string v0, "start_time"

    invoke-virtual {p1}, Lcom/huawei/hihealth/HiDataReadOption;->getSortOrder()I

    move-result v1

    invoke-virtual {p1}, Lcom/huawei/hihealth/HiDataReadOption;->getAnchor()I

    move-result v2

    invoke-virtual {p1}, Lcom/huawei/hihealth/HiDataReadOption;->getCount()I

    move-result v3

    invoke-static {v0, v1, v2, v3}, Lo/cpn;->b(Ljava/lang/String;III)Ljava/lang/String;

    move-result-object v9

    .line 106
    iget-object v0, p0, Lo/cqc;->b:Lo/cot;

    invoke-virtual {v7}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    move-object v2, v8

    move-object v5, v9

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual/range {v0 .. v5}, Lo/cot;->b(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v10

    .line 107
    invoke-static {v10}, Lo/cph;->e(Landroid/database/Cursor;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public b(Lcom/huawei/hihealth/HiHealthData;II)Z
    .locals 8

    .line 204
    move-object v0, p0

    invoke-virtual {p1}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v1

    invoke-virtual {p1}, Lcom/huawei/hihealth/HiHealthData;->getEndTime()J

    move-result-wide v3

    move v5, p2

    invoke-direct/range {v0 .. v5}, Lo/cqc;->e(JJI)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 206
    invoke-direct {p0, p1, p2, p3}, Lo/cqc;->d(Lcom/huawei/hihealth/HiHealthData;II)I

    move-result v0

    int-to-long v6, v0

    goto :goto_0

    .line 209
    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lo/cqc;->e(Lcom/huawei/hihealth/HiHealthData;II)J

    move-result-wide v6

    .line 211
    :goto_0
    invoke-static {v6, v7}, Lo/cpn;->c(J)Z

    move-result v0

    return v0
.end method

.method public c(JJIILjava/util/List;)I
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JJIILjava/util/List<Ljava/lang/Integer;>;)I"
        }
    .end annotation

    .line 61
    invoke-interface/range {p7 .. p7}, Ljava/util/List;->size()I

    move-result v6

    .line 62
    new-instance v7, Ljava/lang/StringBuffer;

    invoke-direct {v7}, Ljava/lang/StringBuffer;-><init>()V

    .line 63
    add-int/lit8 v0, v6, 0x4

    new-array v8, v0, [Ljava/lang/String;

    .line 64
    const-string v0, "start_time"

    invoke-virtual {v7, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " >=? and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "end_time"

    .line 65
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " <=? and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "type_id"

    .line 66
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " >=? and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "type_id"

    .line 67
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " <=? "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 68
    invoke-static {p1, p2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v8, v1

    .line 69
    invoke-static {p3, p4}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v8, v1

    .line 70
    int-to-long v0, p5

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    aput-object v0, v8, v1

    .line 71
    int-to-long v0, p6

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x3

    aput-object v0, v8, v1

    .line 72
    const-string v0, "client_id"

    move-object/from16 v1, p7

    move v2, v6

    move-object v3, v7

    move-object v4, v8

    const/4 v5, 0x4

    invoke-static/range {v0 .. v5}, Lo/cpn;->e(Ljava/lang/String;Ljava/util/List;ILjava/lang/StringBuffer;[Ljava/lang/String;I)V

    .line 73
    const-string v0, "Debug_DataSessionManager"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "deleteSessionDatas() sbSelector = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v7, v1, v2

    const-string v2, ",selectAgs = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v8}, Lo/cnj;->d(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 74
    iget-object v0, p0, Lo/cqc;->b:Lo/cot;

    invoke-virtual {v7}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, v8}, Lo/cot;->b(Ljava/lang/String;[Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public c(JJ[ILjava/util/List;)Ljava/util/List;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JJ[ILjava/util/List<Ljava/lang/Integer;>;)Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation

    .line 225
    move-object/from16 v0, p5

    array-length v6, v0

    .line 226
    invoke-interface/range {p6 .. p6}, Ljava/util/List;->size()I

    move-result v7

    .line 227
    add-int v0, v6, v7

    add-int/lit8 v0, v0, 0x2

    new-array v8, v0, [Ljava/lang/String;

    .line 228
    invoke-static {p1, p2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v8, v1

    .line 229
    invoke-static {p3, p4}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v8, v1

    .line 231
    new-instance v9, Ljava/lang/StringBuffer;

    invoke-direct {v9}, Ljava/lang/StringBuffer;-><init>()V

    .line 232
    const-string v0, "start_time"

    invoke-virtual {v9, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " >=? and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "start_time"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " <=? "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 233
    const-string v0, "type_id"

    move-object/from16 v1, p5

    move v2, v6

    move-object v3, v9

    move-object v4, v8

    const/4 v5, 0x2

    invoke-static/range {v0 .. v5}, Lo/cpn;->d(Ljava/lang/String;[IILjava/lang/StringBuffer;[Ljava/lang/String;I)V

    .line 234
    const-string v0, "client_id"

    move-object/from16 v1, p6

    move v2, v7

    move-object v3, v9

    move-object v4, v8

    add-int/lit8 v5, v6, 0x2

    invoke-static/range {v0 .. v5}, Lo/cpn;->e(Ljava/lang/String;Ljava/util/List;ILjava/lang/StringBuffer;[Ljava/lang/String;I)V

    .line 236
    iget-object v0, p0, Lo/cqc;->b:Lo/cot;

    invoke-virtual {v9}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    move-object v2, v8

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Lo/cot;->b(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v10

    .line 237
    invoke-static {v10}, Lo/cph;->e(Landroid/database/Cursor;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public d(Lcom/huawei/hihealth/HiDataReadOption;Ljava/util/List;I)Ljava/util/List;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/hihealth/HiDataReadOption;Ljava/util/List<Ljava/lang/Integer;>;I)Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation

    .line 155
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v6

    .line 156
    new-instance v7, Ljava/lang/StringBuffer;

    invoke-direct {v7}, Ljava/lang/StringBuffer;-><init>()V

    .line 157
    add-int/lit8 v0, v6, 0x4

    new-array v8, v0, [Ljava/lang/String;

    .line 158
    const-string v0, "start_time"

    invoke-virtual {v7, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " >=? and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "start_time"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " <=? "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " and "

    .line 159
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "type_id"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " =? and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "merged"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " =? "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 160
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiDataReadOption;->getStartTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v8, v1

    .line 161
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiDataReadOption;->getEndTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v8, v1

    .line 162
    invoke-static {p3}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    aput-object v0, v8, v1

    .line 163
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x3

    aput-object v0, v8, v1

    .line 164
    const-string v0, "client_id"

    move-object v1, p2

    move v2, v6

    move-object v3, v7

    move-object v4, v8

    const/4 v5, 0x4

    invoke-static/range {v0 .. v5}, Lo/cpn;->e(Ljava/lang/String;Ljava/util/List;ILjava/lang/StringBuffer;[Ljava/lang/String;I)V

    .line 166
    const-string v0, "start_time"

    invoke-virtual {p1}, Lcom/huawei/hihealth/HiDataReadOption;->getSortOrder()I

    move-result v1

    invoke-virtual {p1}, Lcom/huawei/hihealth/HiDataReadOption;->getAnchor()I

    move-result v2

    invoke-virtual {p1}, Lcom/huawei/hihealth/HiDataReadOption;->getCount()I

    move-result v3

    invoke-static {v0, v1, v2, v3}, Lo/cpn;->b(Ljava/lang/String;III)Ljava/lang/String;

    move-result-object v9

    .line 169
    iget-object v0, p0, Lo/cqc;->b:Lo/cot;

    invoke-virtual {v7}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    move-object v2, v8

    move-object v5, v9

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual/range {v0 .. v5}, Lo/cot;->b(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v10

    .line 170
    invoke-static {v10}, Lo/cph;->e(Landroid/database/Cursor;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public e(Lcom/huawei/hihealth/HiHealthData;II)J
    .locals 3

    .line 51
    invoke-static {p1, p2, p3}, Lo/cpi;->b(Lcom/huawei/hihealth/HiHealthData;II)Landroid/content/ContentValues;

    move-result-object v2

    .line 52
    iget-object v0, p0, Lo/cqc;->b:Lo/cot;

    invoke-virtual {v0, v2}, Lo/cot;->c(Landroid/content/ContentValues;)J

    move-result-wide v0

    return-wide v0
.end method

.method public e(JJ)Ljava/util/List;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JJ)Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation

    .line 246
    const/4 v0, 0x2

    new-array v6, v0, [Ljava/lang/String;

    .line 247
    invoke-static {p1, p2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v6, v1

    .line 248
    invoke-static {p3, p4}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v6, v1

    .line 250
    new-instance v7, Ljava/lang/StringBuffer;

    invoke-direct {v7}, Ljava/lang/StringBuffer;-><init>()V

    .line 251
    const-string v0, "start_time"

    invoke-virtual {v7, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " >=? and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "start_time"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " <=? "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 252
    const-string v0, "client_id"

    invoke-static {v7, v0}, Lo/cpn;->e(Ljava/lang/StringBuffer;Ljava/lang/String;)V

    .line 253
    iget-object v0, p0, Lo/cqc;->b:Lo/cot;

    invoke-virtual {v7}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    move-object v2, v6

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Lo/cot;->b(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v8

    .line 254
    const-string v0, "client_id"

    invoke-static {v8, v0}, Lo/cph;->p(Landroid/database/Cursor;Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public e(Lcom/huawei/hihealth/HiDataReadOption;Ljava/util/List;I)Ljava/util/List;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/hihealth/HiDataReadOption;Ljava/util/List<Ljava/lang/Integer;>;I)Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation

    .line 133
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v6

    .line 134
    new-instance v7, Ljava/lang/StringBuffer;

    invoke-direct {v7}, Ljava/lang/StringBuffer;-><init>()V

    .line 135
    add-int/lit8 v0, v6, 0x4

    new-array v8, v0, [Ljava/lang/String;

    .line 136
    const-string v0, "start_time"

    invoke-virtual {v7, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " >=? and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "start_time"

    .line 137
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " <=? "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " and "

    .line 138
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "type_id"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " =? and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "merged"

    .line 139
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " != ?"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 140
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiDataReadOption;->getStartTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v8, v1

    .line 141
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiDataReadOption;->getEndTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v8, v1

    .line 142
    invoke-static {p3}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    aput-object v0, v8, v1

    .line 143
    const/4 v0, 0x2

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x3

    aput-object v0, v8, v1

    .line 144
    const-string v0, "client_id"

    move-object v1, p2

    move v2, v6

    move-object v3, v7

    move-object v4, v8

    const/4 v5, 0x4

    invoke-static/range {v0 .. v5}, Lo/cpn;->e(Ljava/lang/String;Ljava/util/List;ILjava/lang/StringBuffer;[Ljava/lang/String;I)V

    .line 146
    const-string v0, "start_time"

    invoke-virtual {p1}, Lcom/huawei/hihealth/HiDataReadOption;->getSortOrder()I

    move-result v1

    invoke-virtual {p1}, Lcom/huawei/hihealth/HiDataReadOption;->getAnchor()I

    move-result v2

    invoke-virtual {p1}, Lcom/huawei/hihealth/HiDataReadOption;->getCount()I

    move-result v3

    invoke-static {v0, v1, v2, v3}, Lo/cpn;->b(Ljava/lang/String;III)Ljava/lang/String;

    move-result-object v9

    .line 150
    iget-object v0, p0, Lo/cqc;->b:Lo/cot;

    invoke-virtual {v7}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    move-object v2, v8

    move-object v5, v9

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual/range {v0 .. v5}, Lo/cot;->b(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v10

    .line 151
    invoke-static {v10}, Lo/cph;->e(Landroid/database/Cursor;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public e(Lcom/huawei/hihealth/HiDataReadOption;Ljava/util/List;II)Ljava/util/List;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/hihealth/HiDataReadOption;Ljava/util/List<Ljava/lang/Integer;>;II)Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation

    .line 111
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v6

    .line 112
    new-instance v7, Ljava/lang/StringBuffer;

    invoke-direct {v7}, Ljava/lang/StringBuffer;-><init>()V

    .line 113
    add-int/lit8 v0, v6, 0x5

    new-array v8, v0, [Ljava/lang/String;

    .line 114
    const-string v0, "start_time"

    invoke-virtual {v7, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " >=? and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "start_time"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " <=? and "

    .line 115
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "type_id"

    .line 116
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " >=? and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "type_id"

    .line 117
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " <=? and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "merged"

    .line 118
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " =? "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 119
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiDataReadOption;->getStartTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v8, v1

    .line 120
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiDataReadOption;->getEndTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v8, v1

    .line 121
    invoke-static {p3}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    aput-object v0, v8, v1

    .line 122
    invoke-static {p4}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x3

    aput-object v0, v8, v1

    .line 123
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x4

    aput-object v0, v8, v1

    .line 124
    const-string v0, "client_id"

    move-object v1, p2

    move v2, v6

    move-object v3, v7

    move-object v4, v8

    const/4 v5, 0x5

    invoke-static/range {v0 .. v5}, Lo/cpn;->e(Ljava/lang/String;Ljava/util/List;ILjava/lang/StringBuffer;[Ljava/lang/String;I)V

    .line 126
    const-string v0, "start_time"

    invoke-virtual {p1}, Lcom/huawei/hihealth/HiDataReadOption;->getSortOrder()I

    move-result v1

    invoke-virtual {p1}, Lcom/huawei/hihealth/HiDataReadOption;->getAnchor()I

    move-result v2

    invoke-virtual {p1}, Lcom/huawei/hihealth/HiDataReadOption;->getCount()I

    move-result v3

    invoke-static {v0, v1, v2, v3}, Lo/cpn;->b(Ljava/lang/String;III)Ljava/lang/String;

    move-result-object v9

    .line 128
    iget-object v0, p0, Lo/cqc;->b:Lo/cot;

    invoke-virtual {v7}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    move-object v2, v8

    move-object v5, v9

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual/range {v0 .. v5}, Lo/cot;->b(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v10

    .line 129
    invoke-static {v10}, Lo/cph;->e(Landroid/database/Cursor;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
