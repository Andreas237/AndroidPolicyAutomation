.class public final enum Lo/acs;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lo/acs;>;"
    }
.end annotation


# static fields
.field public static final enum c:Lo/acs;

.field private static final e:Ljava/lang/String;

.field private static final synthetic k:[Lo/acs;


# instance fields
.field private a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/String;Ljava/util/List<Lo/acn;>;>;"
        }
    .end annotation
.end field

.field private b:Ljava/lang/Object;

.field private d:Z


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 36
    new-instance v0, Lo/acs;

    const-string v1, "INSTANCE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lo/acs;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/acs;->c:Lo/acs;

    .line 34
    const/4 v0, 0x1

    new-array v0, v0, [Lo/acs;

    sget-object v1, Lo/acs;->c:Lo/acs;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sput-object v0, Lo/acs;->k:[Lo/acs;

    .line 54
    const-class v0, Lo/acs;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lo/acs;->e:Ljava/lang/String;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 49
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 46
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/acs;->d:Z

    .line 47
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lo/acs;->b:Ljava/lang/Object;

    .line 53
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-static {v0}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Lo/acs;->a:Ljava/util/Map;

    .line 50
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/acr;->d(Landroid/content/Context;)V

    .line 51
    return-void
.end method

.method private c()Ljava/util/Comparator;
    .locals 1

    .line 79
    new-instance v0, Lo/acs$2;

    invoke-direct {v0, p0}, Lo/acs$2;-><init>(Lo/acs;)V

    .line 96
    return-object v0
.end method

.method private d(III)Ljava/lang/String;
    .locals 3

    .line 259
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    mul-int/lit8 v1, p1, 0xc

    mul-int/lit8 v2, p2, 0x3

    add-int/2addr v1, v2

    add-int/2addr v1, p3

    add-int/lit8 v1, v1, 0x1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private d(Lcom/huawei/hihealth/HiHealthData;)Lo/acn;
    .locals 5

    .line 198
    const-string v0, "weight"

    invoke-virtual {p1, v0}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmpl-double v0, v0, v2

    if-lez v0, :cond_0

    .line 199
    new-instance v4, Lo/acn;

    invoke-direct {v4}, Lo/acn;-><init>()V

    .line 200
    const-string v0, "weight"

    invoke-virtual {p1, v0}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v0

    invoke-virtual {v4, v0, v1}, Lo/acn;->e(D)V

    .line 201
    const-string v0, "weight_bodyfat"

    invoke-virtual {p1, v0}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v0

    invoke-virtual {v4, v0, v1}, Lo/acn;->c(D)V

    .line 202
    const-string v0, "weight_bodyfatvalue"

    invoke-virtual {p1, v0}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v0

    invoke-virtual {v4, v0, v1}, Lo/acn;->a(D)V

    .line 203
    const-string v0, "weight_impedance"

    invoke-virtual {p1, v0}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v0

    invoke-virtual {v4, v0, v1}, Lo/acn;->b(D)V

    .line 204
    const-string v0, "weight_water"

    invoke-virtual {p1, v0}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v0

    invoke-virtual {v4, v0, v1}, Lo/acn;->d(D)V

    .line 205
    const-string v0, "weight_waterrate"

    invoke-virtual {p1, v0}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v0

    invoke-virtual {v4, v0, v1}, Lo/acn;->f(D)V

    .line 206
    const-string v0, "weight_fatlevel"

    invoke-virtual {p1, v0}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v0

    invoke-virtual {v4, v0, v1}, Lo/acn;->i(D)V

    .line 207
    const-string v0, "weight_bone_mineral"

    invoke-virtual {p1, v0}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v0

    invoke-virtual {v4, v0, v1}, Lo/acn;->g(D)V

    .line 208
    const-string v0, "weight_bmi"

    invoke-virtual {p1, v0}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v0

    invoke-virtual {v4, v0, v1}, Lo/acn;->k(D)V

    .line 209
    const-string v0, "weight_bmr"

    invoke-virtual {p1, v0}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v0

    invoke-virtual {v4, v0, v1}, Lo/acn;->h(D)V

    .line 210
    const-string v0, "weight_muscles"

    invoke-virtual {p1, v0}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v0

    invoke-virtual {v4, v0, v1}, Lo/acn;->p(D)V

    .line 211
    const-string v0, "weight_protein"

    invoke-virtual {p1, v0}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v0

    invoke-virtual {v4, v0, v1}, Lo/acn;->n(D)V

    .line 212
    const-string v0, "weight_body_score"

    invoke-virtual {p1, v0}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v0

    invoke-virtual {v4, v0, v1}, Lo/acn;->o(D)V

    .line 213
    const-string v0, "weight_body_age"

    invoke-virtual {p1, v0}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v0

    invoke-virtual {v4, v0, v1}, Lo/acn;->m(D)V

    .line 214
    const-string v0, "weight_heart_rate"

    invoke-virtual {p1, v0}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v0

    invoke-virtual {v4, v0, v1}, Lo/acn;->l(D)V

    .line 215
    const-string v0, "weight_pressure"

    invoke-virtual {p1, v0}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v0

    invoke-virtual {v4, v0, v1}, Lo/acn;->s(D)V

    .line 216
    const-string v0, "weight_skeletalmusclelmass"

    invoke-virtual {p1, v0}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v0

    invoke-virtual {v4, v0, v1}, Lo/acn;->r(D)V

    .line 217
    const-string v0, "weight_age"

    invoke-virtual {p1, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v4, v0}, Lo/acn;->b(I)V

    .line 218
    const-string v0, "weight_height"

    invoke-virtual {p1, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v4, v0}, Lo/acn;->d(I)V

    .line 219
    const-string v0, "weight_gender"

    invoke-virtual {p1, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v0

    int-to-byte v0, v0

    invoke-virtual {v4, v0}, Lo/acn;->a(B)V

    .line 221
    const-string v0, "trackdata_deviceType"

    invoke-virtual {p1, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v4, v0}, Lo/acn;->a(I)V

    .line 223
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v0

    invoke-virtual {v4, v0, v1}, Lo/acn;->a(J)V

    .line 224
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiHealthData;->getEndTime()J

    move-result-wide v0

    invoke-virtual {v4, v0, v1}, Lo/acn;->c(J)V

    .line 226
    return-object v4

    .line 228
    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lo/acs;
    .locals 1

    .line 34
    const-class v0, Lo/acs;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lo/acs;

    return-object v0
.end method

.method public static values()[Lo/acs;
    .locals 1

    .line 34
    sget-object v0, Lo/acs;->k:[Lo/acs;

    invoke-virtual {v0}, [Lo/acs;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lo/acs;

    return-object v0
.end method


# virtual methods
.method public a(III)Ljava/lang/String;
    .locals 8

    .line 233
    invoke-direct {p0, p1, p2, p3}, Lo/acs;->d(III)Ljava/lang/String;

    move-result-object v2

    .line 234
    const-string v3, ""

    .line 235
    invoke-static {}, Lo/acr;->d()Lo/acr;

    move-result-object v4

    .line 237
    const-string v0, "stand.db"

    invoke-virtual {v4, v0}, Lo/acr;->c(Ljava/lang/String;)Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v5

    .line 239
    const/4 v0, 0x0

    if-ne v0, v5, :cond_0

    .line 240
    return-object v3

    .line 243
    :cond_0
    invoke-virtual {v5}, Landroid/database/sqlite/SQLiteDatabase;->isOpen()Z

    move-result v0

    if-nez v0, :cond_1

    .line 244
    const-string v0, "stand.db"

    invoke-virtual {v4, v0}, Lo/acr;->e(Ljava/lang/String;)Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v5

    .line 246
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "select * from data_body_stand where id = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 247
    if-eqz v5, :cond_3

    .line 248
    const/4 v0, 0x0

    invoke-virtual {v5, v6, v0}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v7

    .line 249
    :goto_0
    invoke-interface {v7}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 250
    const-string v0, "trend_text"

    invoke-interface {v7, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v7, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v3

    goto :goto_0

    .line 252
    :cond_2
    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    .line 254
    :cond_3
    const-string v0, "stand.db"

    invoke-virtual {v4, v0}, Lo/acr;->a(Ljava/lang/String;)Z

    .line 255
    return-object v3
.end method

.method public a()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/Map<Ljava/lang/String;Ljava/util/List<Lo/acn;>;>;"
        }
    .end annotation

    .line 57
    iget-object v0, p0, Lo/acs;->a:Ljava/util/Map;

    return-object v0
.end method

.method public a(Lo/acn;Ljava/lang/String;)V
    .locals 2

    .line 166
    if-eqz p2, :cond_0

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "null"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "0"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 167
    :cond_0
    sget-object v0, Lo/act;->a:Lo/act;

    invoke-virtual {v0}, Lo/act;->d()Lo/acu;

    move-result-object v0

    invoke-virtual {v0}, Lo/acu;->a()Ljava/lang/String;

    move-result-object p2

    .line 169
    :cond_1
    iget-object v0, p0, Lo/acs;->a:Ljava/util/Map;

    invoke-interface {v0, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ljava/util/List;

    .line 170
    if-nez v1, :cond_2

    .line 171
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 174
    :cond_2
    invoke-interface {v1, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 175
    invoke-interface {v1, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 178
    :cond_3
    iget-object v0, p0, Lo/acs;->a:Ljava/util/Map;

    invoke-interface {v0, p2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 179
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/acs;->d:Z

    .line 180
    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 6

    .line 100
    move-object v0, p0

    move-object v1, p1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    const-wide/16 v2, 0x0

    invoke-virtual/range {v0 .. v5}, Lo/acs;->e(Ljava/lang/String;JJ)V

    .line 101
    return-void
.end method

.method public b(Ljava/util/List;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;)V"
        }
    .end annotation

    .line 140
    iget-object v4, p0, Lo/acs;->b:Ljava/lang/Object;

    monitor-enter v4

    .line 141
    :try_start_0
    iget-object v0, p0, Lo/acs;->a:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 142
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 143
    sget-object v0, Lo/acs;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "testReadWeightData return datas is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 144
    monitor-exit v4

    return-void

    .line 146
    :cond_0
    :try_start_1
    sget-object v0, Lo/acs;->e:Ljava/lang/String;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "testReadWeightData datas.size="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 148
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_3

    .line 149
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/hihealth/HiHealthData;

    .line 151
    const-string v0, "-1"

    invoke-virtual {v6}, Lcom/huawei/hihealth/HiHealthData;->getMetaData()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 152
    goto :goto_0

    .line 154
    :cond_1
    invoke-direct {p0, v6}, Lo/acs;->d(Lcom/huawei/hihealth/HiHealthData;)Lo/acn;

    move-result-object v7

    .line 155
    if-eqz v7, :cond_2

    .line 156
    invoke-virtual {v6}, Lcom/huawei/hihealth/HiHealthData;->getMetaData()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v7, v0}, Lo/acs;->a(Lo/acn;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 158
    :cond_2
    goto :goto_0

    .line 161
    :cond_3
    monitor-exit v4

    goto :goto_1

    :catchall_0
    move-exception v8

    monitor-exit v4

    throw v8

    .line 162
    :goto_1
    return-void
.end method

.method public c(Ljava/lang/String;Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/util/List<Lo/acn;>;)V"
        }
    .end annotation

    .line 189
    iget-object v0, p0, Lo/acs;->a:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ljava/util/List;

    .line 190
    const/4 v0, 0x0

    if-eq v0, v1, :cond_0

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 191
    invoke-interface {v1, p2}, Ljava/util/List;->removeAll(Ljava/util/Collection;)Z

    .line 192
    iget-object v0, p0, Lo/acs;->a:Ljava/util/Map;

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 193
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/acs;->d:Z

    .line 195
    :cond_0
    return-void
.end method

.method public d(JJLo/egg;)V
    .locals 5

    .line 114
    const/4 v2, 0x1

    new-array v2, v2, [I

    fill-array-data v2, :array_0

    .line 115
    const/4 v0, 0x1

    new-array v3, v0, [Ljava/lang/String;

    const-string v0, "test"

    const/4 v1, 0x0

    aput-object v0, v3, v1

    .line 116
    new-instance v4, Lcom/huawei/hihealth/HiAggregateOption;

    invoke-direct {v4}, Lcom/huawei/hihealth/HiAggregateOption;-><init>()V

    .line 117
    invoke-virtual {v4, p1, p2, p3, p4}, Lcom/huawei/hihealth/HiAggregateOption;->setTimeRange(JJ)V

    .line 118
    invoke-virtual {v4, v2}, Lcom/huawei/hihealth/HiAggregateOption;->setType([I)V

    .line 119
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setGroupUnitType(I)V

    .line 120
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setAggregateType(I)V

    .line 121
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setSortOrder(I)V

    .line 122
    const-string v0, ""

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setFilter(Ljava/lang/String;)V

    .line 123
    invoke-virtual {v4, v3}, Lcom/huawei/hihealth/HiAggregateOption;->setConstantsKey([Ljava/lang/String;)V

    .line 124
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    new-instance v1, Lo/acs$1;

    invoke-direct {v1, p0, p5}, Lo/acs$1;-><init>(Lo/acs;Lo/egg;)V

    invoke-interface {v0, v4, v1}, Lo/clt;->b(Lcom/huawei/hihealth/HiAggregateOption;Lo/cly;)V

    .line 137
    return-void

    :array_0
    .array-data 4
        0x2716
    .end array-data
.end method

.method public d(Z)V
    .locals 1

    .line 43
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/ahn;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lo/acs;->d:Z

    .line 44
    return-void
.end method

.method public e(Ljava/lang/String;Z)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Z)Ljava/util/List<Lo/acn;>;"
        }
    .end annotation

    .line 61
    iget-object v2, p0, Lo/acs;->b:Ljava/lang/Object;

    monitor-enter v2

    .line 62
    :try_start_0
    iget-object v0, p0, Lo/acs;->a:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/util/List;

    .line 63
    if-nez v3, :cond_0

    .line 64
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 67
    :cond_0
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 68
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 70
    if-eqz p2, :cond_1

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_1

    .line 71
    invoke-direct {p0}, Lo/acs;->c()Ljava/util/Comparator;

    move-result-object v0

    invoke-static {v4, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 74
    :cond_1
    monitor-exit v2

    return-object v4

    .line 75
    :catchall_0
    move-exception v5

    monitor-exit v2

    throw v5
.end method

.method public e(Ljava/lang/String;JJ)V
    .locals 1

    .line 104
    sget-object v0, Lo/act;->a:Lo/act;

    invoke-virtual {v0}, Lo/act;->a()V

    .line 105
    return-void
.end method

.method public e()Z
    .locals 1

    .line 39
    iget-boolean v0, p0, Lo/acs;->d:Z

    return v0
.end method
