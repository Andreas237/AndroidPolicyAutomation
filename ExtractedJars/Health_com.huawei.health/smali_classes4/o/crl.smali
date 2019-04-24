.class public Lo/crl;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/crl$e;
    }
.end annotation


# static fields
.field private static o:Landroid/content/Context;


# instance fields
.field private a:Lo/cqj;

.field private b:Lo/cpy;

.field private c:Lo/cpv;

.field private d:Lo/cqc;

.field private e:Lo/cqg;

.field private f:Lo/cps;

.field private g:Lo/cqh;

.field private h:Lo/cpx;

.field private i:Lo/cpz;

.field private k:Lo/cqe;


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 58
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 59
    sget-object v0, Lo/crl;->o:Landroid/content/Context;

    invoke-static {v0}, Lo/cqc;->e(Landroid/content/Context;)Lo/cqc;

    move-result-object v0

    iput-object v0, p0, Lo/crl;->d:Lo/cqc;

    .line 60
    sget-object v0, Lo/crl;->o:Landroid/content/Context;

    invoke-static {v0}, Lo/cpy;->d(Landroid/content/Context;)Lo/cpy;

    move-result-object v0

    iput-object v0, p0, Lo/crl;->b:Lo/cpy;

    .line 61
    sget-object v0, Lo/crl;->o:Landroid/content/Context;

    invoke-static {v0}, Lo/cqj;->d(Landroid/content/Context;)Lo/cqj;

    move-result-object v0

    iput-object v0, p0, Lo/crl;->a:Lo/cqj;

    .line 62
    sget-object v0, Lo/crl;->o:Landroid/content/Context;

    invoke-static {v0}, Lo/cpv;->c(Landroid/content/Context;)Lo/cpv;

    move-result-object v0

    iput-object v0, p0, Lo/crl;->c:Lo/cpv;

    .line 63
    sget-object v0, Lo/crl;->o:Landroid/content/Context;

    invoke-static {v0}, Lo/cqg;->c(Landroid/content/Context;)Lo/cqg;

    move-result-object v0

    iput-object v0, p0, Lo/crl;->e:Lo/cqg;

    .line 64
    sget-object v0, Lo/crl;->o:Landroid/content/Context;

    invoke-static {v0}, Lo/cqh;->d(Landroid/content/Context;)Lo/cqh;

    move-result-object v0

    iput-object v0, p0, Lo/crl;->g:Lo/cqh;

    .line 65
    sget-object v0, Lo/crl;->o:Landroid/content/Context;

    invoke-static {v0}, Lo/cqe;->b(Landroid/content/Context;)Lo/cqe;

    move-result-object v0

    iput-object v0, p0, Lo/crl;->k:Lo/cqe;

    .line 66
    sget-object v0, Lo/crl;->o:Landroid/content/Context;

    invoke-static {v0}, Lo/cpx;->d(Landroid/content/Context;)Lo/cpx;

    move-result-object v0

    iput-object v0, p0, Lo/crl;->h:Lo/cpx;

    .line 67
    sget-object v0, Lo/crl;->o:Landroid/content/Context;

    invoke-static {v0}, Lo/cps;->c(Landroid/content/Context;)Lo/cps;

    move-result-object v0

    iput-object v0, p0, Lo/crl;->f:Lo/cps;

    .line 68
    sget-object v0, Lo/crl;->o:Landroid/content/Context;

    invoke-static {v0}, Lo/cpz;->b(Landroid/content/Context;)Lo/cpz;

    move-result-object v0

    iput-object v0, p0, Lo/crl;->i:Lo/cpz;

    .line 69
    return-void
.end method

.method synthetic constructor <init>(Lo/crl$5;)V
    .locals 0

    .line 41
    invoke-direct {p0}, Lo/crl;-><init>()V

    return-void
.end method

.method public static c(Landroid/content/Context;)Lo/crl;
    .locals 1
    .param p0    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 79
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    sput-object v0, Lo/crl;->o:Landroid/content/Context;

    .line 80
    sget-object v0, Lo/crl$e;->e:Lo/crl;

    return-object v0
.end method


# virtual methods
.method public a(ILjava/util/List;Lcom/huawei/hihealth/HiDataReadOption;)Ljava/util/List;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ILjava/util/List<Ljava/lang/Integer;>;Lcom/huawei/hihealth/HiDataReadOption;)Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation

    .line 227
    const-string v0, "HiH_HiHealthDataReadStore"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "readSetData()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 228
    invoke-static {p1}, Lo/cmk;->e(I)[I

    move-result-object v4

    .line 229
    const/16 v0, 0x2711

    if-ne p1, v0, :cond_1

    .line 230
    invoke-virtual {p3}, Lcom/huawei/hihealth/HiDataReadOption;->getReadType()I

    move-result v0

    if-nez v0, :cond_0

    .line 231
    iget-object v0, p0, Lo/crl;->e:Lo/cqg;

    const/16 v1, 0x7d8

    const/16 v2, 0x7df

    invoke-virtual {v0, p3, v1, v2, p2}, Lo/cqg;->d(Lcom/huawei/hihealth/HiDataReadOption;IILjava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0

    .line 234
    :cond_0
    iget-object v0, p0, Lo/crl;->e:Lo/cqg;

    const/16 v1, 0x7d8

    const/16 v2, 0x7df

    invoke-virtual {v0, p3, v1, v2, p2}, Lo/cqg;->e(Lcom/huawei/hihealth/HiDataReadOption;IILjava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0

    .line 238
    :cond_1
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 239
    move-object v6, v4

    array-length v7, v6

    const/4 v8, 0x0

    :goto_0
    if-ge v8, v7, :cond_2

    aget v9, v6, v8

    .line 240
    invoke-virtual {p0, v9, p2, p3}, Lo/crl;->b(ILjava/util/List;Lcom/huawei/hihealth/HiDataReadOption;)Ljava/util/List;

    move-result-object v10

    .line 241
    invoke-interface {v5, v10}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 239
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    .line 243
    :cond_2
    const-string v0, "HiH_HiHealthDataReadStore"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "readSetData()  pointHealthDatas = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v5, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 244
    return-object v5
.end method

.method public b(IILcom/huawei/hihealth/HiDataReadOption;)Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IILcom/huawei/hihealth/HiDataReadOption;)Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation

    .line 205
    if-gtz p2, :cond_0

    .line 206
    const/4 v0, 0x0

    return-object v0

    .line 208
    :cond_0
    invoke-static {p1}, Lo/cmi;->f(I)Z

    move-result v0

    if-nez v0, :cond_1

    .line 209
    const-string v0, "HiH_HiHealthDataReadStore"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "readConfigStatData statType is not support, statType="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 210
    const/4 v0, 0x0

    return-object v0

    .line 212
    :cond_1
    invoke-static {p1}, Lo/cmi;->k(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v4

    .line 213
    const/4 v0, 0x7

    invoke-static {v4, v0}, Lo/cmi;->c(II)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Ljava/lang/Integer;

    .line 214
    const/4 v0, 0x0

    if-ne v0, v5, :cond_2

    .line 215
    const-string v0, "HiH_HiHealthDataReadStore"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "statType not set table name"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 216
    const/4 v0, 0x0

    return-object v0

    .line 218
    :cond_2
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {v0}, Lo/cva;->d(I)Ljava/lang/String;

    move-result-object v6

    .line 219
    iget-object v0, p0, Lo/crl;->i:Lo/cpz;

    invoke-virtual {v0, v6, p3, p1, p2}, Lo/cpz;->c(Ljava/lang/String;Lcom/huawei/hihealth/HiDataReadOption;II)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public b(ILjava/util/List;Lcom/huawei/hihealth/HiDataReadOption;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ILjava/util/List<Ljava/lang/Integer;>;Lcom/huawei/hihealth/HiDataReadOption;)Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation

    .line 154
    const-string v0, "HiH_HiHealthDataReadStore"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "readPointData()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 155
    invoke-virtual {p3}, Lcom/huawei/hihealth/HiDataReadOption;->getReadType()I

    move-result v0

    if-nez v0, :cond_4

    .line 156
    const/16 v0, 0x7d0

    if-ge p1, v0, :cond_0

    .line 158
    iget-object v0, p0, Lo/crl;->b:Lo/cpy;

    invoke-virtual {v0, p3, p1, p2}, Lo/cpy;->d(Lcom/huawei/hihealth/HiDataReadOption;ILjava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0

    .line 160
    :cond_0
    const/16 v0, 0x7e3

    if-lt p1, v0, :cond_2

    const/16 v0, 0x7e6

    if-gt v0, p1, :cond_1

    const/16 v0, 0x7f1

    if-ge v0, p1, :cond_2

    :cond_1
    const/16 v0, 0x802

    if-gt v0, p1, :cond_3

    .line 163
    :cond_2
    iget-object v0, p0, Lo/crl;->e:Lo/cqg;

    invoke-virtual {v0, p3, p1, p2}, Lo/cqg;->c(Lcom/huawei/hihealth/HiDataReadOption;ILjava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0

    .line 167
    :cond_3
    iget-object v0, p0, Lo/crl;->g:Lo/cqh;

    invoke-virtual {v0, p3, p1, p2}, Lo/cqh;->a(Lcom/huawei/hihealth/HiDataReadOption;ILjava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0

    .line 170
    :cond_4
    const/16 v0, 0x7d0

    if-ge p1, v0, :cond_5

    .line 172
    iget-object v0, p0, Lo/crl;->b:Lo/cpy;

    invoke-virtual {v0, p3, p1, p2}, Lo/cpy;->e(Lcom/huawei/hihealth/HiDataReadOption;ILjava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0

    .line 174
    :cond_5
    const/16 v0, 0x7e3

    if-ge p1, v0, :cond_6

    .line 176
    iget-object v0, p0, Lo/crl;->e:Lo/cqg;

    invoke-virtual {v0, p3, p1, p2}, Lo/cqg;->d(Lcom/huawei/hihealth/HiDataReadOption;ILjava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0

    .line 180
    :cond_6
    iget-object v0, p0, Lo/crl;->g:Lo/cqh;

    invoke-virtual {v0, p3, p1, p2}, Lo/cqh;->e(Lcom/huawei/hihealth/HiDataReadOption;ILjava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public b(ILjava/util/List;Ljava/lang/String;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ILjava/util/List<Ljava/lang/Integer;>;Ljava/lang/String;)Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation

    .line 248
    const-string v0, "HiH_HiHealthDataReadStore"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "readRealTimeData()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 249
    iget-object v0, p0, Lo/crl;->h:Lo/cpx;

    invoke-virtual {v0, p1, p2, p3}, Lo/cpx;->c(ILjava/util/List;Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public b(ILjava/util/List;Lcom/huawei/hihealth/HiDataReadOption;Lo/clj;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ILjava/util/List<Ljava/lang/Integer;>;Lcom/huawei/hihealth/HiDataReadOption;Lo/clj;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 223
    move v0, p1

    move-object v1, p2

    move-object v2, p3

    move-object v3, p4

    iget-object v4, p0, Lo/crl;->k:Lo/cqe;

    sget-object v5, Lo/crl;->o:Landroid/content/Context;

    invoke-static/range {v0 .. v5}, Lo/crn;->a(ILjava/util/List;Lcom/huawei/hihealth/HiDataReadOption;Lo/clj;Lo/cqe;Landroid/content/Context;)V

    .line 224
    return-void
.end method

.method public c(ILcom/huawei/hihealth/HiDataReadOption;)Ljava/util/List;
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ILcom/huawei/hihealth/HiDataReadOption;)Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation

    .line 253
    const-string v0, "HiH_HiHealthDataReadStore"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkAlreadyDownload()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 254
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 255
    new-instance v7, Lcom/huawei/hihealth/HiHealthData;

    const v0, 0x15f91

    invoke-direct {v7, v0}, Lcom/huawei/hihealth/HiHealthData;-><init>(I)V

    .line 256
    sget-object v0, Lo/crl;->o:Landroid/content/Context;

    invoke-static {v0}, Lo/cqm;->e(Landroid/content/Context;)Lo/cqm;

    move-result-object v0

    move/from16 v1, p1

    const-wide/16 v2, 0x0

    const/16 v4, 0x271f

    invoke-virtual {v0, v1, v2, v3, v4}, Lo/cqm;->c(IJI)Lo/cnz;

    move-result-object v8

    .line 257
    const/4 v9, 0x0

    .line 258
    const/4 v10, 0x0

    .line 259
    const/4 v11, 0x0

    .line 260
    invoke-virtual/range {p2 .. p2}, Lcom/huawei/hihealth/HiDataReadOption;->getType()[I

    move-result-object v12

    .line 261
    const/4 v0, 0x0

    if-ne v0, v8, :cond_0

    .line 263
    const/4 v0, 0x0

    invoke-virtual {v7, v0}, Lcom/huawei/hihealth/HiHealthData;->setValue(I)V

    .line 264
    invoke-interface {v6, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 265
    return-object v6

    .line 268
    :cond_0
    invoke-virtual {v8}, Lo/cnz;->d()I

    move-result v13

    .line 269
    invoke-virtual/range {p2 .. p2}, Lcom/huawei/hihealth/HiDataReadOption;->getStartTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/cnk;->a(J)I

    move-result v14

    .line 270
    invoke-virtual/range {p2 .. p2}, Lcom/huawei/hihealth/HiDataReadOption;->getEndTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/cnk;->a(J)I

    move-result v15

    .line 271
    if-le v13, v15, :cond_1

    .line 273
    move v10, v14

    .line 274
    move v11, v13

    .line 275
    const/4 v9, 0x1

    .line 276
    const/4 v0, -0x1

    invoke-virtual {v7, v0}, Lcom/huawei/hihealth/HiHealthData;->setValue(I)V

    goto :goto_0

    .line 277
    :cond_1
    if-gt v13, v14, :cond_2

    .line 279
    const/4 v0, 0x0

    invoke-virtual {v7, v0}, Lcom/huawei/hihealth/HiHealthData;->setValue(I)V

    goto :goto_0

    .line 282
    :cond_2
    move v10, v14

    .line 283
    move v11, v13

    .line 284
    const/4 v9, 0x1

    .line 285
    const/4 v0, -0x1

    invoke-virtual {v7, v0}, Lcom/huawei/hihealth/HiHealthData;->setValue(I)V

    .line 287
    :goto_0
    invoke-interface {v6, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 289
    if-eqz v9, :cond_3

    .line 291
    new-instance v16, Lcom/huawei/hihealth/HiSyncOption;

    invoke-direct/range {v16 .. v16}, Lcom/huawei/hihealth/HiSyncOption;-><init>()V

    .line 292
    move-object/from16 v0, v16

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/HiSyncOption;->setSyncAction(I)V

    .line 293
    move-object/from16 v0, v16

    const/16 v1, 0x2722

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/HiSyncOption;->setSyncDataType(I)V

    .line 294
    move-object/from16 v0, v16

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/HiSyncOption;->setSyncModel(I)V

    .line 295
    move-object/from16 v0, v16

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/HiSyncOption;->setSyncMethod(I)V

    .line 296
    move-object/from16 v0, v16

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/HiSyncOption;->setSyncScope(I)V

    .line 297
    sget-object v0, Lo/crl;->o:Landroid/content/Context;

    invoke-static {v0}, Lo/cpu;->b(Landroid/content/Context;)Lo/cpu;

    move-result-object v0

    sget-object v1, Lo/crl;->o:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/cpu;->a(Ljava/lang/String;)I

    move-result v17

    .line 298
    sget-object v0, Lo/crl;->o:Landroid/content/Context;

    invoke-static {v0}, Lo/csk;->a(Landroid/content/Context;)Lo/csk;

    move-result-object v0

    move-object/from16 v1, v16

    move/from16 v2, v17

    move v3, v10

    move v4, v11

    const/4 v5, 0x0

    aget v5, v12, v5

    invoke-virtual/range {v0 .. v5}, Lo/csk;->d(Lcom/huawei/hihealth/HiSyncOption;IIII)V

    .line 300
    :cond_3
    return-object v6
.end method

.method public d(IILcom/huawei/hihealth/HiDataReadOption;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IILcom/huawei/hihealth/HiDataReadOption;)Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation

    .line 143
    const-string v0, "HiH_HiHealthDataReadStore"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "readStatData()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 144
    if-gtz p2, :cond_0

    .line 145
    const/4 v0, 0x0

    return-object v0

    .line 147
    :cond_0
    const v0, 0xa417

    if-ne v0, p1, :cond_1

    .line 148
    sget-object v0, Lo/crl;->o:Landroid/content/Context;

    invoke-static {v0}, Lo/cqd;->d(Landroid/content/Context;)Lo/cqd;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lo/cqd;->e(II)Ljava/util/List;

    move-result-object v0

    return-object v0

    .line 150
    :cond_1
    sget-object v0, Lo/crl;->o:Landroid/content/Context;

    invoke-static {v0}, Lo/cqd;->d(Landroid/content/Context;)Lo/cqd;

    move-result-object v0

    invoke-virtual {v0, p3, p1, p2}, Lo/cqd;->d(Lcom/huawei/hihealth/HiDataReadOption;II)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public d(ILjava/util/List;Lcom/huawei/hihealth/HiDataReadOption;)Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ILjava/util/List<Ljava/lang/Integer;>;Lcom/huawei/hihealth/HiDataReadOption;)Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation

    .line 84
    const-string v0, "HiH_HiHealthDataReadStore"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "readSessionData()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 85
    invoke-virtual {p3}, Lcom/huawei/hihealth/HiDataReadOption;->getReadType()I

    move-result v4

    .line 87
    sparse-switch p1, :sswitch_data_0

    goto/16 :goto_0

    .line 89
    :sswitch_0
    if-nez v4, :cond_0

    .line 90
    iget-object v0, p0, Lo/crl;->d:Lo/cqc;

    const/16 v1, 0x5208

    invoke-virtual {v0, p3, p2, p1, v1}, Lo/cqc;->e(Lcom/huawei/hihealth/HiDataReadOption;Ljava/util/List;II)Ljava/util/List;

    move-result-object v5

    goto/16 :goto_1

    .line 92
    :cond_0
    iget-object v0, p0, Lo/crl;->d:Lo/cqc;

    const/16 v1, 0x5208

    invoke-virtual {v0, p3, p2, p1, v1}, Lo/cqc;->b(Lcom/huawei/hihealth/HiDataReadOption;Ljava/util/List;II)Ljava/util/List;

    move-result-object v5

    .line 94
    goto/16 :goto_1

    .line 96
    :sswitch_1
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 97
    const/16 v0, 0x55f1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v6, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 98
    const/16 v0, 0x55f2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v6, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 99
    if-nez v4, :cond_1

    .line 100
    iget-object v0, p0, Lo/crl;->a:Lo/cqj;

    invoke-virtual {v0, p3, p2, v6}, Lo/cqj;->a(Lcom/huawei/hihealth/HiDataReadOption;Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lo/cvb;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object v5

    goto/16 :goto_1

    .line 102
    :cond_1
    iget-object v0, p0, Lo/crl;->a:Lo/cqj;

    invoke-virtual {v0, p3, p2, v6}, Lo/cqj;->d(Lcom/huawei/hihealth/HiDataReadOption;Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lo/cvb;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object v5

    .line 104
    goto/16 :goto_1

    .line 106
    :sswitch_2
    if-nez v4, :cond_2

    .line 107
    iget-object v0, p0, Lo/crl;->c:Lo/cpv;

    const/16 v1, 0x5654

    const/16 v2, 0x56b7

    invoke-virtual {v0, p3, p2, v1, v2}, Lo/cpv;->e(Lcom/huawei/hihealth/HiDataReadOption;Ljava/util/List;II)Ljava/util/List;

    move-result-object v5

    goto/16 :goto_1

    .line 111
    :cond_2
    iget-object v0, p0, Lo/crl;->c:Lo/cpv;

    const/16 v1, 0x5654

    const/16 v2, 0x56b7

    invoke-virtual {v0, p3, p2, v1, v2}, Lo/cpv;->b(Lcom/huawei/hihealth/HiDataReadOption;Ljava/util/List;II)Ljava/util/List;

    move-result-object v5

    .line 115
    goto :goto_1

    .line 117
    :goto_0
    const/16 v0, 0x5208

    if-gt p1, v0, :cond_4

    .line 118
    if-nez v4, :cond_3

    .line 119
    iget-object v0, p0, Lo/crl;->d:Lo/cqc;

    invoke-virtual {v0, p3, p2, p1}, Lo/cqc;->d(Lcom/huawei/hihealth/HiDataReadOption;Ljava/util/List;I)Ljava/util/List;

    move-result-object v5

    goto :goto_1

    .line 121
    :cond_3
    iget-object v0, p0, Lo/crl;->d:Lo/cqc;

    invoke-virtual {v0, p3, p2, p1}, Lo/cqc;->e(Lcom/huawei/hihealth/HiDataReadOption;Ljava/util/List;I)Ljava/util/List;

    move-result-object v5

    goto :goto_1

    .line 123
    :cond_4
    const/16 v0, 0x5653

    if-gt p1, v0, :cond_6

    .line 124
    if-nez v4, :cond_5

    .line 125
    iget-object v0, p0, Lo/crl;->a:Lo/cqj;

    invoke-virtual {v0, p3, p2, p1}, Lo/cqj;->d(Lcom/huawei/hihealth/HiDataReadOption;Ljava/util/List;I)Ljava/util/List;

    move-result-object v5

    goto :goto_1

    .line 127
    :cond_5
    iget-object v0, p0, Lo/crl;->a:Lo/cqj;

    invoke-virtual {v0, p3, p2, p1}, Lo/cqj;->b(Lcom/huawei/hihealth/HiDataReadOption;Ljava/util/List;I)Ljava/util/List;

    move-result-object v5

    goto :goto_1

    .line 130
    :cond_6
    if-nez v4, :cond_7

    .line 131
    iget-object v0, p0, Lo/crl;->c:Lo/cpv;

    invoke-virtual {v0, p3, p2, p1}, Lo/cpv;->c(Lcom/huawei/hihealth/HiDataReadOption;Ljava/util/List;I)Ljava/util/List;

    move-result-object v5

    goto :goto_1

    .line 133
    :cond_7
    iget-object v0, p0, Lo/crl;->c:Lo/cpv;

    invoke-virtual {v0, p3, p2, p1}, Lo/cpv;->d(Lcom/huawei/hihealth/HiDataReadOption;Ljava/util/List;I)Ljava/util/List;

    move-result-object v5

    .line 139
    :goto_1
    return-object v5

    :sswitch_data_0
    .sparse-switch
        0x4e21 -> :sswitch_0
        0x55f0 -> :sswitch_1
        0x5654 -> :sswitch_2
    .end sparse-switch
.end method

.method public e(ILjava/util/List;Lcom/huawei/hihealth/HiDataReadOption;)Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ILjava/util/List<Ljava/lang/Integer;>;Lcom/huawei/hihealth/HiDataReadOption;)Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation

    .line 186
    invoke-static {p1}, Lo/cmi;->h(I)Z

    move-result v0

    if-nez v0, :cond_0

    .line 187
    const-string v0, "HiH_HiHealthDataReadStore"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "readConfigData is not support, pointType="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 188
    const/4 v0, 0x0

    return-object v0

    .line 190
    :cond_0
    invoke-static {p1}, Lo/cmi;->i(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v4

    .line 191
    const/4 v0, 0x1

    invoke-static {v4, v0}, Lo/cmi;->c(II)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Ljava/lang/Integer;

    .line 192
    const/4 v0, 0x0

    if-ne v0, v5, :cond_1

    .line 193
    const-string v0, "HiH_HiHealthDataReadStore"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "config type is not set tablename"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 194
    const/4 v0, 0x0

    return-object v0

    .line 196
    :cond_1
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {v0}, Lo/cva;->d(I)Ljava/lang/String;

    move-result-object v6

    .line 197
    invoke-virtual {p3}, Lcom/huawei/hihealth/HiDataReadOption;->getReadType()I

    move-result v0

    if-nez v0, :cond_2

    .line 198
    iget-object v0, p0, Lo/crl;->f:Lo/cps;

    invoke-virtual {v0, v6, p3, p1, p2}, Lo/cps;->a(Ljava/lang/String;Lcom/huawei/hihealth/HiDataReadOption;ILjava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0

    .line 200
    :cond_2
    iget-object v0, p0, Lo/crl;->f:Lo/cps;

    invoke-virtual {v0, v6, p3, p1, p2}, Lo/cps;->d(Ljava/lang/String;Lcom/huawei/hihealth/HiDataReadOption;ILjava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
