.class public Lo/csh;
.super Lo/csd;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/csh$b;
    }
.end annotation


# static fields
.field private static final a:[I

.field private static final b:[I

.field private static final e:[I

.field private static final f:[I

.field private static final i:[I


# instance fields
.field private g:Lo/cqz;

.field private h:Lo/cqe;

.field private k:Lo/cqy;

.field private l:I

.field private m:I

.field private n:I

.field private o:I

.field private p:I

.field private q:I

.field private final u:Lo/czy;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 97
    const/16 v0, 0xb

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    sput-object v0, Lo/csh;->e:[I

    .line 101
    const/16 v0, 0xb

    new-array v0, v0, [I

    fill-array-data v0, :array_1

    sput-object v0, Lo/csh;->a:[I

    .line 105
    const/16 v0, 0xb

    new-array v0, v0, [I

    fill-array-data v0, :array_2

    sput-object v0, Lo/csh;->b:[I

    .line 109
    const/16 v0, 0xb

    new-array v0, v0, [I

    fill-array-data v0, :array_3

    sput-object v0, Lo/csh;->f:[I

    .line 113
    const/16 v0, 0xb

    new-array v0, v0, [I

    fill-array-data v0, :array_4

    sput-object v0, Lo/csh;->i:[I

    return-void

    :array_0
    .array-data 4
        0xa41b
        0xa413
        0xa412
        0xa411
        0xa415
        0xa418
        0xa419
        0xa41a
        0xa416
        0xa41c
        0xa41d
    .end array-data

    :array_1
    .array-data 4
        0xa443
        0xa444
        0xa445
        0xa446
        0xa447
        0xa448
        0xa449
        0xa44a
        0xa44b
        0xa44c
        0xa44d
    .end array-data

    :array_2
    .array-data 4
        0xa475
        0xa476
        0xa477
        0xa478    # 5.9E-41f
        0xa479
        0xa47a
        0xa47b
        0xa47c
        0xa47d
        0xa47e
        0xa47f
    .end array-data

    :array_3
    .array-data 4
        0xa4a7
        0xa4a8
        0xa4a9
        0xa4aa
        0xa4ab
        0xa4ac
        0xa4ad
        0xa4ae
        0xa4af
        0xa4b0
        0xa4b1
    .end array-data

    :array_4
    .array-data 4
        0xa4d9
        0xa4da
        0xa4db
        0xa4dc
        0xa4dd
        0xa4de
        0xa4df
        0xa4e0
        0xa4e1
        0xa4e2
        0xa4e3
    .end array-data
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 150
    invoke-direct {p0, p1}, Lo/csd;-><init>(Landroid/content/Context;)V

    .line 126
    const/4 v0, 0x0

    iput v0, p0, Lo/csh;->p:I

    .line 130
    const/4 v0, 0x0

    iput v0, p0, Lo/csh;->m:I

    .line 134
    const/4 v0, 0x0

    iput v0, p0, Lo/csh;->l:I

    .line 138
    const/4 v0, 0x0

    iput v0, p0, Lo/csh;->n:I

    .line 142
    const/4 v0, 0x0

    iput v0, p0, Lo/csh;->o:I

    .line 146
    const/4 v0, 0x0

    iput v0, p0, Lo/csh;->q:I

    .line 151
    invoke-static {p1}, Lo/cqe;->b(Landroid/content/Context;)Lo/cqe;

    move-result-object v0

    iput-object v0, p0, Lo/csh;->h:Lo/cqe;

    .line 152
    iget-object v0, p0, Lo/csh;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/cqz;->d(Landroid/content/Context;)Lo/cqz;

    move-result-object v0

    iput-object v0, p0, Lo/csh;->g:Lo/cqz;

    .line 153
    iget-object v0, p0, Lo/csh;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/cqy;->d(Landroid/content/Context;)Lo/cqy;

    move-result-object v0

    iput-object v0, p0, Lo/csh;->k:Lo/cqy;

    .line 154
    new-instance v0, Lo/czy;

    invoke-direct {v0}, Lo/czy;-><init>()V

    iput-object v0, p0, Lo/csh;->u:Lo/czy;

    .line 155
    return-void
.end method

.method private a(Ljava/util/List;)V
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;)V"
        }
    .end annotation

    .line 227
    const-string v0, "HiH_HiTrackStat"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "metaDataDumplicateEliminate duplication"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 228
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 229
    new-instance v9, Ljava/util/LinkedHashMap;

    invoke-direct {v9}, Ljava/util/LinkedHashMap;-><init>()V

    .line 231
    const/4 v10, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-ge v10, v0, :cond_1

    .line 232
    invoke-interface {p1, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/HiHealthData;

    invoke-virtual {v0}, Lcom/huawei/hihealth/HiHealthData;->getMetaData()Ljava/lang/String;

    move-result-object v0

    const-class v1, Lcom/huawei/hihealth/data/model/HiTrackMetaData;

    invoke-static {v0, v1}, Lo/cnj;->c(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lcom/huawei/hihealth/data/model/HiTrackMetaData;

    .line 234
    invoke-virtual {v11}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getSportDataSource()I

    move-result v0

    const/4 v1, 0x2

    if-ne v1, v0, :cond_0

    .line 235
    const-string v0, "HiH_HiTrackStat"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "metaDataDumplicateEliminate user input source, distance is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v11}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getTotalDistance()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 236
    goto :goto_1

    .line 238
    :cond_0
    new-instance v0, Lo/csh$b;

    move-object v1, p0

    invoke-interface {p1, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/huawei/hihealth/HiHealthData;

    invoke-virtual {v2}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v2

    invoke-interface {p1, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/huawei/hihealth/HiHealthData;

    invoke-virtual {v4}, Lcom/huawei/hihealth/HiHealthData;->getEndTime()J

    move-result-wide v4

    invoke-virtual {v11}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getTotalDistance()I

    move-result v6

    invoke-virtual {v11}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getTrackType()I

    move-result v7

    invoke-direct/range {v0 .. v7}, Lo/csh$b;-><init>(Lo/csh;JJII)V

    move-object v12, v0

    .line 239
    invoke-interface {v8, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 240
    invoke-interface {p1, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v9, v12, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 231
    :goto_1
    add-int/lit8 v10, v10, 0x1

    goto/16 :goto_0

    .line 242
    :cond_1
    iget-object v0, p0, Lo/csh;->u:Lo/czy;

    sget-object v1, Lo/czy$d;->e:Lo/czy$d;

    invoke-virtual {v0, v8, v1}, Lo/czy;->b(Ljava/util/List;Lo/czy$d;)Ljava/util/List;

    move-result-object v10

    .line 243
    iget-object v0, p0, Lo/csh;->u:Lo/czy;

    sget-object v1, Lo/czy$d;->d:Lo/czy$d;

    invoke-virtual {v0, v8, v1}, Lo/czy;->b(Ljava/util/List;Lo/czy$d;)Ljava/util/List;

    move-result-object v11

    .line 244
    invoke-interface {p1}, Ljava/util/List;->clear()V

    .line 245
    const-string v0, "HiH_HiTrackStat"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "duplicateDatas size is  "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-interface {v10}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 246
    const-string v0, "HiH_HiTrackStat"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "noDuplicateDatas size is  "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-interface {v11}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 249
    const/4 v12, 0x0

    :goto_2
    invoke-interface {v10}, Ljava/util/List;->size()I

    move-result v0

    if-ge v12, v0, :cond_3

    .line 250
    invoke-interface {v10, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v9, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/HiHealthData;

    invoke-virtual {v0}, Lcom/huawei/hihealth/HiHealthData;->getMetaData()Ljava/lang/String;

    move-result-object v0

    const-class v1, Lcom/huawei/hihealth/data/model/HiTrackMetaData;

    invoke-static {v0, v1}, Lo/cnj;->c(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Lcom/huawei/hihealth/data/model/HiTrackMetaData;

    .line 251
    invoke-virtual {v13}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getmDuplicated()I

    move-result v0

    const/4 v1, 0x1

    if-eq v1, v0, :cond_2

    .line 252
    const/4 v0, 0x1

    invoke-virtual {v13, v0}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setmDuplicated(I)V

    .line 253
    invoke-interface {v10, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v9, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/HiHealthData;

    invoke-static {v13}, Lo/cnj;->d(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setMetaData(Ljava/lang/String;)V

    .line 254
    invoke-interface {v10, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v9, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 255
    const-string v0, "HiH_HiTrackStat"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "duplication time is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-interface {v10, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v9, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/huawei/hihealth/HiHealthData;

    invoke-virtual {v2}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v2

    invoke-static {v2, v3}, Lo/cnk;->a(J)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, "--"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-interface {v10, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v9, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/huawei/hihealth/HiHealthData;

    invoke-virtual {v2}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_3

    .line 257
    :cond_2
    const-string v0, "HiH_HiTrackStat"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "TrackSimilarityIdentifier duplication is 1"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 249
    :goto_3
    add-int/lit8 v12, v12, 0x1

    goto/16 :goto_2

    .line 262
    :cond_3
    const/4 v12, 0x0

    :goto_4
    invoke-interface {v11}, Ljava/util/List;->size()I

    move-result v0

    if-ge v12, v0, :cond_5

    .line 263
    invoke-interface {v11, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v9, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/HiHealthData;

    invoke-virtual {v0}, Lcom/huawei/hihealth/HiHealthData;->getMetaData()Ljava/lang/String;

    move-result-object v0

    const-class v1, Lcom/huawei/hihealth/data/model/HiTrackMetaData;

    invoke-static {v0, v1}, Lo/cnj;->c(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Lcom/huawei/hihealth/data/model/HiTrackMetaData;

    .line 264
    invoke-virtual {v13}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getmDuplicated()I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_4

    .line 265
    const/4 v0, 0x0

    invoke-virtual {v13, v0}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setmDuplicated(I)V

    .line 266
    invoke-interface {v11, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v9, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/HiHealthData;

    invoke-static {v13}, Lo/cnj;->d(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setMetaData(Ljava/lang/String;)V

    .line 267
    invoke-interface {v11, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v9, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 268
    const-string v0, "HiH_HiTrackStat"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "noDuplication time is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-interface {v11, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v9, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/huawei/hihealth/HiHealthData;

    invoke-virtual {v2}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v2

    invoke-static {v2, v3}, Lo/cnk;->a(J)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, "--"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-interface {v11, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v9, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/huawei/hihealth/HiHealthData;

    invoke-virtual {v2}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_5

    .line 270
    :cond_4
    const-string v0, "HiH_HiTrackStat"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "TrackSimilarityIdentifier duplication is 0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 262
    :goto_5
    add-int/lit8 v12, v12, 0x1

    goto/16 :goto_4

    .line 274
    :cond_5
    const-string v0, "HiH_HiTrackStat"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "metadata change  sequenceMetaDatas1 size  = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 275
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :goto_6
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Lcom/huawei/hihealth/HiHealthData;

    .line 276
    const-string v0, "HiH_HiTrackStat"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "TrackSimilarityIdentifier duplication data = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v13}, Lcom/huawei/hihealth/HiHealthData;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 277
    iget-object v0, p0, Lo/csh;->h:Lo/cqe;

    invoke-virtual {v13}, Lcom/huawei/hihealth/HiHealthData;->getClientID()I

    move-result v1

    invoke-virtual {v0, v13, v1}, Lo/cqe;->d(Lcom/huawei/hihealth/HiHealthData;I)I

    .line 278
    goto :goto_6

    .line 279
    :cond_6
    return-void
.end method

.method private a(Ljava/util/List;Lcom/huawei/hihealth/HiHealthData;II)V
    .locals 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/String;>;Lcom/huawei/hihealth/HiHealthData;II)V"
        }
    .end annotation

    .line 534
    if-gtz p4, :cond_0

    .line 535
    const-string v0, "HiH_HiTrackStat"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "statDayTrack userClient <= 0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 536
    return-void

    .line 538
    :cond_0
    const/4 v0, 0x0

    move-object/from16 v1, p1

    if-eq v0, v1, :cond_1

    invoke-interface/range {p1 .. p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 539
    :cond_1
    const-string v0, "HiH_HiTrackStat"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "statDayTrack sequenceMetaDatas is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 540
    return-void

    .line 542
    :cond_2
    const-string v0, "HiH_HiTrackStat"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "statDayTrack sequenceMetaDatas = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-interface/range {p1 .. p1}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ",statClient = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static/range {p4 .. p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 543
    const/4 v9, 0x0

    .line 545
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :goto_0
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Ljava/lang/String;

    .line 546
    const-class v0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;

    invoke-static {v12, v0}, Lo/cnj;->c(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lcom/huawei/hihealth/data/model/HiTrackMetaData;

    .line 547
    invoke-virtual {v10}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getWearSportData()Ljava/util/Map;

    move-result-object v13

    .line 548
    const/4 v0, 0x0

    if-eq v0, v13, :cond_3

    const-string v0, "max_met"

    invoke-interface {v13, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 549
    const-string v0, "max_met"

    invoke-interface {v13, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x40600000    # 3.5f

    mul-float/2addr v0, v1

    float-to-int v0, v0

    const/high16 v1, 0x10000

    div-int v14, v0, v1

    .line 550
    if-le v14, v9, :cond_3

    .line 551
    move v9, v14

    .line 554
    :cond_3
    goto :goto_0

    .line 555
    :cond_4
    invoke-virtual/range {p2 .. p2}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/cnk;->a(J)I

    move-result v11

    .line 556
    invoke-virtual/range {p2 .. p2}, Lcom/huawei/hihealth/HiHealthData;->getSyncStatus()I

    move-result v12

    .line 559
    const/16 v0, 0x15

    if-gt v0, v9, :cond_5

    const/16 v0, 0x58

    if-gt v9, v0, :cond_5

    .line 560
    move-object v0, p0

    move v1, v11

    move/from16 v3, p3

    move/from16 v4, p4

    move v5, v12

    int-to-double v6, v9

    const v2, 0xa416

    const/4 v8, 0x0

    invoke-direct/range {v0 .. v8}, Lo/csh;->c(IIIIIDI)Z

    .line 561
    move-object v0, p0

    move v1, v11

    move/from16 v3, p3

    move/from16 v4, p4

    move v5, v12

    int-to-double v6, v9

    const v2, 0xa417

    const/4 v8, 0x0

    invoke-direct/range {v0 .. v8}, Lo/csh;->a(IIIIIDI)Z

    .line 563
    :cond_5
    return-void
.end method

.method private a(IIIIIDI)Z
    .locals 5

    .line 502
    const-string v0, "HiH_HiTrackStat"

    const/16 v1, 0x8

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveOneTrackStat statDate = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ",statClient = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, ", statType = "

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    const-string v2, ",statValue = "

    const/4 v3, 0x6

    aput-object v2, v1, v3

    invoke-static {p6, p7}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    const/4 v3, 0x7

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 504
    invoke-direct/range {p0 .. p8}, Lo/csh;->e(IIIIIDI)Lo/cob;

    move-result-object v4

    .line 506
    iget-object v0, p0, Lo/csh;->d:Lo/cqd;

    invoke-virtual {v0, v4}, Lo/cqd;->a(Lo/cob;)Z

    move-result v0

    return v0
.end method

.method private b(Lcom/huawei/hihealth/data/model/HiTrackMetaData;)Z
    .locals 2

    .line 463
    invoke-virtual {p1}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getTrackType()I

    move-result v1

    .line 464
    const/4 v0, 0x3

    if-eq v0, v1, :cond_0

    const/4 v0, 0x4

    if-eq v0, v1, :cond_0

    const/4 v0, 0x5

    if-eq v0, v1, :cond_0

    const/4 v0, 0x6

    if-ne v0, v1, :cond_1

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private c(Ljava/util/List;)Ljava/util/Map;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/String;>;)Ljava/util/Map<Ljava/lang/String;Ljava/util/List<Ljava/lang/String;>;>;"
        }
    .end annotation

    .line 392
    new-instance v4, Landroid/util/ArrayMap;

    invoke-direct {v4}, Landroid/util/ArrayMap;-><init>()V

    .line 393
    const/4 v0, 0x0

    iput v0, p0, Lo/csh;->p:I

    .line 394
    const/4 v0, 0x0

    iput v0, p0, Lo/csh;->m:I

    .line 395
    const/4 v0, 0x0

    iput v0, p0, Lo/csh;->l:I

    .line 396
    const/4 v0, 0x0

    iput v0, p0, Lo/csh;->n:I

    .line 397
    const/4 v0, 0x0

    iput v0, p0, Lo/csh;->o:I

    .line 398
    const/4 v0, 0x0

    iput v0, p0, Lo/csh;->q:I

    .line 399
    invoke-static {p1}, Lo/cne;->e(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 400
    const-string v0, "HiH_HiTrackStat"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getSportTypeSequenceData sequenceMetaDatas is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 401
    return-object v4

    .line 404
    :cond_0
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 406
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 408
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 410
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 412
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 414
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :goto_0
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Ljava/lang/String;

    .line 415
    const-class v0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;

    invoke-static {v12, v0}, Lo/cnj;->c(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lcom/huawei/hihealth/data/model/HiTrackMetaData;

    .line 416
    invoke-direct {p0, v10}, Lo/csh;->b(Lcom/huawei/hihealth/data/model/HiTrackMetaData;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 417
    invoke-interface {v9, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 419
    :cond_1
    invoke-virtual {v10}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getSportType()I

    move-result v13

    .line 420
    packed-switch v13, :pswitch_data_0

    goto/16 :goto_1

    .line 422
    :pswitch_0
    invoke-interface {v5, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 423
    const/16 v0, 0x10

    iput v0, p0, Lo/csh;->p:I

    .line 424
    goto :goto_2

    .line 426
    :pswitch_1
    invoke-interface {v6, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 427
    const/16 v0, 0x8

    iput v0, p0, Lo/csh;->m:I

    .line 428
    goto :goto_2

    .line 430
    :pswitch_2
    invoke-interface {v7, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 431
    const/4 v0, 0x4

    iput v0, p0, Lo/csh;->l:I

    .line 432
    goto :goto_2

    .line 434
    :pswitch_3
    invoke-interface {v6, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 435
    const/4 v0, 0x2

    iput v0, p0, Lo/csh;->n:I

    .line 436
    goto :goto_2

    .line 438
    :pswitch_4
    invoke-interface {v6, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 439
    const/16 v0, 0x20

    iput v0, p0, Lo/csh;->o:I

    .line 440
    goto :goto_2

    .line 442
    :pswitch_5
    invoke-interface {v8, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 443
    const/4 v0, 0x1

    iput v0, p0, Lo/csh;->q:I

    .line 444
    goto :goto_2

    .line 446
    :pswitch_6
    invoke-interface {v8, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 447
    const/4 v0, 0x1

    iput v0, p0, Lo/csh;->q:I

    .line 448
    goto :goto_2

    .line 450
    :goto_1
    :pswitch_7
    const/4 v0, 0x1

    iput v0, p0, Lo/csh;->q:I

    .line 453
    :goto_2
    goto/16 :goto_0

    .line 454
    :cond_2
    const-string v0, "walk_type_datas"

    invoke-interface {v4, v0, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 455
    const-string v0, "run_type_datas"

    invoke-interface {v4, v0, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 456
    const-string v0, "ride_type_datas"

    invoke-interface {v4, v0, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 457
    const-string v0, "swim_type_datas"

    invoke-interface {v4, v0, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 458
    const-string v0, "wear_device_type_datas"

    invoke-interface {v4, v0, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 459
    return-object v4

    nop

    :pswitch_data_0
    .packed-switch 0x101
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_7
        :pswitch_7
        :pswitch_5
        :pswitch_7
        :pswitch_3
        :pswitch_7
        :pswitch_6
        :pswitch_7
        :pswitch_7
        :pswitch_7
        :pswitch_7
        :pswitch_7
        :pswitch_7
        :pswitch_7
        :pswitch_7
        :pswitch_7
        :pswitch_7
        :pswitch_7
        :pswitch_7
        :pswitch_7
        :pswitch_4
    .end packed-switch
.end method

.method private c(IIIIIDI)Z
    .locals 5

    .line 471
    const-string v0, "HiH_HiTrackStat"

    const/16 v1, 0x8

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveOneTrackStat statDate = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ",statClient = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, ", statType = "

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    const-string v2, ",statValue = "

    const/4 v3, 0x6

    aput-object v2, v1, v3

    invoke-static {p6, p7}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    const/4 v3, 0x7

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 473
    invoke-direct/range {p0 .. p8}, Lo/csh;->e(IIIIIDI)Lo/cob;

    move-result-object v4

    .line 476
    const-wide/16 v0, 0x0

    cmpg-double v0, p6, v0

    if-gtz v0, :cond_0

    .line 477
    const-string v0, "HiH_HiTrackStat"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveOneTrackStat delete old stat , because new stat is zero ! statDate = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ",statClient = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    .line 478
    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, ", statType = "

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    .line 477
    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 479
    iget-object v0, p0, Lo/csh;->d:Lo/cqd;

    invoke-virtual {v0, v4}, Lo/cqd;->b(Lo/cob;)Z

    move-result v0

    return v0

    .line 481
    :cond_0
    iget-object v0, p0, Lo/csh;->d:Lo/cqd;

    invoke-virtual {v0, v4}, Lo/cqd;->d(Lo/cob;)Z

    move-result v0

    return v0
.end method

.method private d(Ljava/util/List;Lcom/huawei/hihealth/HiHealthData;II[I)V
    .locals 32
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/String;>;Lcom/huawei/hihealth/HiHealthData;II[I)V"
        }
    .end annotation

    .line 286
    const/4 v9, 0x0

    .line 287
    sget-object v0, Lo/csh;->e:[I

    move-object/from16 v1, p5

    invoke-static {v0, v1}, Ljava/util/Arrays;->equals([I[I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 288
    const/4 v9, 0x1

    .line 290
    :cond_0
    if-gtz p4, :cond_1

    .line 291
    const-string v0, "HiH_HiTrackStat"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "statDayTrack userClient <= 0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 292
    return-void

    .line 294
    :cond_1
    invoke-static/range {p1 .. p1}, Lo/cne;->e(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 295
    const-string v0, "HiH_HiTrackStat"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "statDayTrack sequenceMetaDatas is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 296
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct/range {p1 .. p1}, Ljava/util/ArrayList;-><init>()V

    .line 298
    :cond_2
    const-string v0, "HiH_HiTrackStat"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "statDayTrack sequenceMetaDatas = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-interface/range {p1 .. p1}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ",statClient = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static/range {p4 .. p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 299
    const-wide/16 v10, 0x0

    .line 300
    const-wide/16 v12, 0x0

    .line 301
    const-wide/16 v14, 0x0

    .line 302
    const-wide/16 v16, 0x0

    .line 303
    const/16 v18, 0x0

    .line 305
    const-wide/16 v19, 0x0

    .line 306
    const-wide/16 v21, 0x0

    .line 307
    const/16 v23, 0x0

    .line 308
    const-wide/16 v24, 0x0

    .line 312
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v28

    :goto_0
    invoke-interface/range {v28 .. v28}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-interface/range {v28 .. v28}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v29, v0

    check-cast v29, Ljava/lang/String;

    .line 313
    const-class v0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;

    move-object/from16 v1, v29

    invoke-static {v1, v0}, Lo/cnj;->c(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v27, v0

    check-cast v27, Lcom/huawei/hihealth/data/model/HiTrackMetaData;

    .line 315
    invoke-virtual/range {v27 .. v27}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getAbnormalTrack()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_3

    invoke-virtual/range {v27 .. v27}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getmDuplicated()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    .line 316
    :cond_3
    const-string v0, "HiH_HiTrackStat"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "statDayTrack is abnormalTrack or duplicated"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 317
    add-int/lit8 v18, v18, 0x1

    .line 318
    goto :goto_0

    .line 324
    :cond_4
    invoke-virtual/range {v27 .. v27}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getTotalCalories()I

    move-result v0

    int-to-double v0, v0

    add-double/2addr v14, v0

    .line 325
    invoke-virtual/range {v27 .. v27}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getTotalSteps()I

    move-result v0

    int-to-double v0, v0

    add-double v16, v16, v0

    .line 326
    invoke-virtual/range {v27 .. v27}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getTotalDistance()I

    move-result v0

    int-to-double v0, v0

    add-double/2addr v10, v0

    .line 327
    invoke-virtual/range {v27 .. v27}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getTotalTime()J

    move-result-wide v0

    long-to-double v0, v0

    add-double/2addr v12, v0

    .line 328
    invoke-virtual/range {v27 .. v27}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getAvgPace()F

    move-result v26

    .line 329
    move/from16 v0, v26

    float-to-double v0, v0

    add-double v24, v24, v0

    .line 330
    invoke-virtual/range {v27 .. v27}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getCreepingWave()F

    move-result v0

    float-to-double v0, v0

    add-double v21, v21, v0

    .line 331
    invoke-virtual/range {v27 .. v27}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getWearSportData()Ljava/util/Map;

    move-result-object v30

    .line 332
    const/4 v0, 0x0

    move-object/from16 v1, v30

    if-eq v0, v1, :cond_5

    const-string v0, "max_met"

    move-object/from16 v1, v30

    invoke-interface {v1, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 333
    const-string v0, "max_met"

    move-object/from16 v1, v30

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x40600000    # 3.5f

    mul-float/2addr v0, v1

    float-to-int v0, v0

    const/high16 v1, 0x10000

    div-int v31, v0, v1

    .line 334
    move/from16 v0, v31

    move/from16 v1, v23

    if-le v0, v1, :cond_5

    .line 335
    move/from16 v23, v31

    .line 343
    :cond_5
    invoke-virtual/range {v27 .. v27}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getTotalDistance()I

    move-result v0

    int-to-double v0, v0

    cmpl-double v0, v0, v19

    if-lez v0, :cond_6

    invoke-virtual/range {v27 .. v27}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getTotalDistance()I

    move-result v0

    int-to-double v0, v0

    goto :goto_1

    :cond_6
    move-wide/from16 v0, v19

    :goto_1
    move-wide/from16 v19, v0

    .line 344
    goto/16 :goto_0

    .line 345
    :cond_7
    invoke-virtual/range {p2 .. p2}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/cnk;->a(J)I

    move-result v28

    .line 346
    invoke-virtual/range {p2 .. p2}, Lcom/huawei/hihealth/HiHealthData;->getSyncStatus()I

    move-result v29

    .line 349
    move-object/from16 v0, p0

    move/from16 v1, v28

    const/4 v2, 0x0

    aget v2, p5, v2

    move/from16 v3, p3

    move/from16 v4, p4

    move/from16 v5, v29

    move-wide/from16 v6, v16

    const/4 v8, 0x1

    invoke-direct/range {v0 .. v8}, Lo/csh;->c(IIIIIDI)Z

    .line 351
    move-object/from16 v0, p0

    move/from16 v1, v28

    const/4 v2, 0x1

    aget v2, p5, v2

    move/from16 v3, p3

    move/from16 v4, p4

    move/from16 v5, v29

    move-wide v6, v10

    const/4 v8, 0x2

    invoke-direct/range {v0 .. v8}, Lo/csh;->c(IIIIIDI)Z

    .line 353
    move-object/from16 v0, p0

    move/from16 v1, v28

    const/4 v2, 0x2

    aget v2, p5, v2

    move/from16 v3, p3

    move/from16 v4, p4

    move/from16 v5, v29

    move-wide v6, v14

    const/4 v8, 0x3

    invoke-direct/range {v0 .. v8}, Lo/csh;->c(IIIIIDI)Z

    .line 355
    move-object/from16 v0, p0

    move/from16 v1, v28

    const/4 v2, 0x3

    aget v2, p5, v2

    move/from16 v3, p3

    move/from16 v4, p4

    move/from16 v5, v29

    move-wide v6, v12

    const/16 v8, 0xd

    invoke-direct/range {v0 .. v8}, Lo/csh;->c(IIIIIDI)Z

    .line 357
    move-object/from16 v0, p0

    move/from16 v1, v28

    const/4 v2, 0x4

    aget v2, p5, v2

    move/from16 v3, p3

    move/from16 v4, p4

    move/from16 v5, v29

    invoke-interface/range {p1 .. p1}, Ljava/util/List;->size()I

    move-result v6

    int-to-double v6, v6

    const/16 v8, 0x10

    invoke-direct/range {v0 .. v8}, Lo/csh;->c(IIIIIDI)Z

    .line 359
    move-object/from16 v0, p0

    move/from16 v1, v28

    const/4 v2, 0x5

    aget v2, p5, v2

    move/from16 v3, p3

    move/from16 v4, p4

    move/from16 v5, v29

    move/from16 v6, v18

    int-to-double v6, v6

    const/16 v8, 0x10

    invoke-direct/range {v0 .. v8}, Lo/csh;->c(IIIIIDI)Z

    .line 363
    move-object/from16 v0, p0

    move/from16 v1, v28

    const/4 v2, 0x7

    aget v2, p5, v2

    move/from16 v3, p3

    move/from16 v4, p4

    move/from16 v5, v29

    move-wide/from16 v6, v19

    const/4 v8, 0x2

    invoke-direct/range {v0 .. v8}, Lo/csh;->c(IIIIIDI)Z

    .line 365
    const/16 v0, 0x15

    move/from16 v1, v23

    if-gt v0, v1, :cond_8

    move/from16 v0, v23

    const/16 v1, 0x58

    if-gt v0, v1, :cond_8

    .line 366
    move-object/from16 v0, p0

    move/from16 v1, v28

    const/16 v2, 0x8

    aget v2, p5, v2

    move/from16 v3, p3

    move/from16 v4, p4

    move/from16 v5, v29

    move/from16 v6, v23

    int-to-double v6, v6

    const/4 v8, 0x0

    invoke-direct/range {v0 .. v8}, Lo/csh;->c(IIIIIDI)Z

    .line 367
    if-eqz v9, :cond_8

    .line 368
    move-object/from16 v0, p0

    move/from16 v1, v28

    move/from16 v3, p3

    move/from16 v4, p4

    move/from16 v5, v29

    move/from16 v2, v23

    int-to-double v6, v2

    const v2, 0xa417

    const/4 v8, 0x0

    invoke-direct/range {v0 .. v8}, Lo/csh;->a(IIIIIDI)Z

    .line 372
    :cond_8
    move-object/from16 v0, p0

    move/from16 v1, v28

    const/16 v2, 0x9

    aget v2, p5, v2

    move/from16 v3, p3

    move/from16 v4, p4

    move/from16 v5, v29

    move-wide/from16 v6, v21

    const/4 v8, 0x4

    invoke-direct/range {v0 .. v8}, Lo/csh;->c(IIIIIDI)Z

    .line 376
    if-eqz v9, :cond_9

    .line 378
    move-object/from16 v0, p0

    move/from16 v1, v28

    move/from16 v3, p3

    move/from16 v4, p4

    move/from16 v5, v29

    move-wide/from16 v6, v24

    const v2, 0xa414

    const/16 v8, 0xe

    invoke-direct/range {v0 .. v8}, Lo/csh;->c(IIIIIDI)Z

    .line 379
    move-object/from16 v0, p0

    iget v0, v0, Lo/csh;->o:I

    move-object/from16 v1, p0

    iget v1, v1, Lo/csh;->p:I

    or-int/2addr v0, v1

    move-object/from16 v1, p0

    iget v1, v1, Lo/csh;->m:I

    or-int/2addr v0, v1

    move-object/from16 v1, p0

    iget v1, v1, Lo/csh;->l:I

    or-int/2addr v0, v1

    move-object/from16 v1, p0

    iget v1, v1, Lo/csh;->n:I

    or-int/2addr v0, v1

    move-object/from16 v1, p0

    iget v1, v1, Lo/csh;->q:I

    or-int v30, v0, v1

    .line 381
    move-object/from16 v0, p0

    move/from16 v1, v28

    move/from16 v3, p3

    move/from16 v4, p4

    move/from16 v5, v29

    move/from16 v2, v30

    int-to-double v6, v2

    const v2, 0xab18

    const/4 v8, 0x0

    invoke-direct/range {v0 .. v8}, Lo/csh;->c(IIIIIDI)Z

    .line 382
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/cnk;->a(J)I

    move-result v0

    move/from16 v1, v28

    if-ne v1, v0, :cond_9

    .line 383
    const-string v0, "HiH_HiTrackStat"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "statDayTrack today track Stat changed ! "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 384
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/csh;->c:Landroid/content/Context;

    const/4 v1, 0x2

    invoke-static {v0, v1}, Lo/cnt;->c(Landroid/content/Context;I)V

    .line 389
    :cond_9
    return-void
.end method

.method private e(IIIIIDI)Lo/cob;
    .locals 2
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 486
    new-instance v1, Lo/cob;

    invoke-direct {v1}, Lo/cob;-><init>()V

    .line 487
    invoke-virtual {v1, p1}, Lo/cob;->c(I)V

    .line 488
    const/16 v0, 0x7531

    invoke-virtual {v1, v0}, Lo/cob;->d(I)V

    .line 489
    invoke-virtual {v1, p4}, Lo/cob;->b(I)V

    .line 490
    invoke-virtual {v1, p3}, Lo/cob;->e(I)V

    .line 491
    invoke-virtual {v1, p5}, Lo/cob;->f(I)V

    .line 492
    invoke-virtual {v1, p8}, Lo/cob;->i(I)V

    .line 493
    invoke-virtual {v1, p2}, Lo/cob;->a(I)V

    .line 494
    invoke-virtual {v1, p6, p7}, Lo/cob;->e(D)V

    .line 495
    return-object v1
.end method


# virtual methods
.method public b(Lcom/huawei/hihealth/HiHealthData;)Z
    .locals 26

    .line 161
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v10

    .line 162
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hihealth/HiHealthData;->getUserID()I

    move-result v12

    .line 163
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/cnk;->d(J)J

    move-result-wide v13

    .line 164
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/cnk;->b(J)J

    move-result-wide v15

    .line 165
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/cnk;->i(J)J

    move-result-wide v17

    .line 166
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hihealth/HiHealthData;->getDay()J

    move-result-wide v19

    .line 167
    const-string v0, "HiH_HiTrackStat"

    const/16 v1, 0x8

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "stat() trackData = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static/range {v19 .. v20}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ",startTime = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v13, v14}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, ",endTime = "

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-static/range {v17 .. v18}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    const-string v2, ",startPreTime = "

    const/4 v3, 0x6

    aput-object v2, v1, v3

    invoke-static/range {v15 .. v16}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x7

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 168
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hihealth/HiHealthData;->getType()I

    move-result v21

    .line 171
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/csh;->k:Lo/cqy;

    invoke-virtual {v0, v12}, Lo/cqy;->a(I)Ljava/util/List;

    move-result-object v22

    .line 172
    const/4 v0, 0x0

    move-object/from16 v1, v22

    if-eq v0, v1, :cond_0

    invoke-interface/range {v22 .. v22}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 173
    :cond_0
    const-string v0, "HiH_HiTrackStat"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "stat() clientIds is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 174
    const/4 v0, 0x0

    return v0

    .line 177
    :cond_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/cnk;->a(J)I

    move-result v0

    int-to-long v0, v0

    cmp-long v0, v19, v0

    if-eqz v0, :cond_2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/cnk;->c(J)I

    move-result v0

    int-to-long v0, v0

    cmp-long v0, v19, v0

    if-nez v0, :cond_3

    .line 178
    :cond_2
    const-string v0, "HiH_HiTrackStat"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "metaDataDumplicateEliminate() day is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static/range {v19 .. v20}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 179
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/csh;->h:Lo/cqe;

    move-object/from16 v1, v22

    move-wide v2, v15

    move-wide/from16 v4, v17

    const/16 v6, 0x7531

    invoke-virtual/range {v0 .. v6}, Lo/cqe;->e(Ljava/util/List;JJI)Ljava/util/List;

    move-result-object v23

    .line 180
    move-object/from16 v0, p0

    move-object/from16 v1, v23

    invoke-direct {v0, v1}, Lo/csh;->a(Ljava/util/List;)V

    .line 183
    :cond_3
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/csh;->h:Lo/cqe;

    move-object/from16 v1, v22

    move-wide v2, v13

    move-wide/from16 v4, v17

    move/from16 v6, v21

    invoke-virtual/range {v0 .. v6}, Lo/cqe;->b(Ljava/util/List;JJI)Ljava/util/List;

    move-result-object v23

    .line 185
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/csh;->g:Lo/cqz;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v12, v2}, Lo/cqz;->a(III)I

    move-result v24

    .line 187
    move-object/from16 v0, p0

    move-object/from16 v1, v23

    invoke-direct {v0, v1}, Lo/csh;->c(Ljava/util/List;)Ljava/util/Map;

    move-result-object v9

    .line 188
    move-object/from16 v0, p0

    move-object/from16 v1, v23

    move-object/from16 v2, p1

    move v3, v12

    move/from16 v4, v24

    sget-object v5, Lo/csh;->e:[I

    invoke-direct/range {v0 .. v5}, Lo/csh;->d(Ljava/util/List;Lcom/huawei/hihealth/HiHealthData;II[I)V

    .line 189
    move-object/from16 v0, p0

    const-string v1, "walk_type_datas"

    invoke-interface {v9, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    move-object/from16 v2, p1

    move v3, v12

    move/from16 v4, v24

    sget-object v5, Lo/csh;->a:[I

    invoke-direct/range {v0 .. v5}, Lo/csh;->d(Ljava/util/List;Lcom/huawei/hihealth/HiHealthData;II[I)V

    .line 190
    move-object/from16 v0, p0

    const-string v1, "run_type_datas"

    invoke-interface {v9, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    move-object/from16 v2, p1

    move v3, v12

    move/from16 v4, v24

    sget-object v5, Lo/csh;->b:[I

    invoke-direct/range {v0 .. v5}, Lo/csh;->d(Ljava/util/List;Lcom/huawei/hihealth/HiHealthData;II[I)V

    .line 191
    move-object/from16 v0, p0

    const-string v1, "ride_type_datas"

    invoke-interface {v9, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    move-object/from16 v2, p1

    move v3, v12

    move/from16 v4, v24

    sget-object v5, Lo/csh;->f:[I

    invoke-direct/range {v0 .. v5}, Lo/csh;->d(Ljava/util/List;Lcom/huawei/hihealth/HiHealthData;II[I)V

    .line 192
    move-object/from16 v0, p0

    const-string v1, "swim_type_datas"

    invoke-interface {v9, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    move-object/from16 v2, p1

    move v3, v12

    move/from16 v4, v24

    sget-object v5, Lo/csh;->i:[I

    invoke-direct/range {v0 .. v5}, Lo/csh;->d(Ljava/util/List;Lcom/huawei/hihealth/HiHealthData;II[I)V

    .line 195
    const/16 v25, 0x0

    .line 196
    const-string v0, "wear_device_type_datas"

    invoke-interface {v9, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    .line 197
    const-string v0, "wear_device_type_datas"

    invoke-interface {v9, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v25

    .line 199
    :cond_4
    move-object/from16 v0, p0

    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v1

    invoke-static {v1, v2}, Lo/cnk;->a(J)I

    move-result v1

    move v3, v12

    move/from16 v4, v24

    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hihealth/HiHealthData;->getSyncStatus()I

    move-result v5

    move/from16 v2, v25

    int-to-double v6, v2

    const v2, 0xa9ec

    const/16 v8, 0x10

    invoke-direct/range {v0 .. v8}, Lo/csh;->c(IIIIIDI)Z

    .line 220
    const-string v0, "HiH_HiTrackStat"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "stat() totalTime = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    sub-long/2addr v2, v10

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 221
    const/4 v0, 0x1

    return v0
.end method

.method public d(Lcom/huawei/hihealth/HiHealthData;)Z
    .locals 18

    .line 510
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v7

    .line 511
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hihealth/HiHealthData;->getUserID()I

    move-result v9

    .line 512
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/cnk;->d(J)J

    move-result-wide v10

    .line 513
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/cnk;->i(J)J

    move-result-wide v12

    .line 514
    const-string v0, "HiH_HiTrackStat"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "statOldData() trackData = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hihealth/HiHealthData;->getDay()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ",startTime = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, ",endTime = "

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 515
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hihealth/HiHealthData;->getType()I

    move-result v14

    .line 518
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/csh;->k:Lo/cqy;

    invoke-virtual {v0, v9}, Lo/cqy;->a(I)Ljava/util/List;

    move-result-object v15

    .line 519
    const/4 v0, 0x0

    if-eq v0, v15, :cond_0

    invoke-interface {v15}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 520
    :cond_0
    const-string v0, "HiH_HiTrackStat"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "statOldData() clientIds is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 521
    const/4 v0, 0x0

    return v0

    .line 523
    :cond_1
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/csh;->h:Lo/cqe;

    move-object v1, v15

    move-wide v2, v10

    move-wide v4, v12

    move v6, v14

    invoke-virtual/range {v0 .. v6}, Lo/cqe;->b(Ljava/util/List;JJI)Ljava/util/List;

    move-result-object v16

    .line 525
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/csh;->g:Lo/cqz;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v9, v2}, Lo/cqz;->a(III)I

    move-result v17

    .line 526
    move-object/from16 v0, p0

    move-object/from16 v1, v16

    move-object/from16 v2, p1

    move/from16 v3, v17

    invoke-direct {v0, v1, v2, v9, v3}, Lo/csh;->a(Ljava/util/List;Lcom/huawei/hihealth/HiHealthData;II)V

    .line 528
    const-string v0, "HiH_HiTrackStat"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "statOldData() totalTime = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    sub-long/2addr v2, v7

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 529
    const/4 v0, 0x1

    return v0
.end method
