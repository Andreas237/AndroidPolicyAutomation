.class public Lo/crp;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/crp$c;
    }
.end annotation


# instance fields
.field private a:Lo/cqx;

.field private c:Lo/cqh;

.field private d:Lo/cqn;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    invoke-static {p1}, Lo/cqh;->d(Landroid/content/Context;)Lo/cqh;

    move-result-object v0

    iput-object v0, p0, Lo/crp;->c:Lo/cqh;

    .line 34
    invoke-static {p1}, Lo/cqn;->a(Landroid/content/Context;)Lo/cqn;

    move-result-object v0

    iput-object v0, p0, Lo/crp;->d:Lo/cqn;

    .line 35
    invoke-static {p1}, Lo/cqx;->d(Landroid/content/Context;)Lo/cqx;

    move-result-object v0

    iput-object v0, p0, Lo/crp;->a:Lo/cqx;

    .line 36
    return-void
.end method

.method private b(Ljava/util/List;)Lcom/huawei/hihealth/HiHealthData;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;)Lcom/huawei/hihealth/HiHealthData;"
        }
    .end annotation

    .line 128
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/hihealth/HiHealthData;

    .line 129
    const/4 v5, 0x0

    .line 130
    const/4 v6, 0x1

    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-ge v6, v0, :cond_2

    .line 131
    invoke-interface {p1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/hihealth/HiHealthData;

    .line 132
    invoke-virtual {v4}, Lcom/huawei/hihealth/HiHealthData;->getType()I

    move-result v0

    invoke-virtual {v7}, Lcom/huawei/hihealth/HiHealthData;->getType()I

    move-result v1

    if-ne v0, v1, :cond_0

    .line 133
    invoke-virtual {v7}, Lcom/huawei/hihealth/HiHealthData;->getValue()D

    move-result-wide v0

    invoke-virtual {v4}, Lcom/huawei/hihealth/HiHealthData;->getValue()D

    move-result-wide v2

    cmpl-double v0, v0, v2

    if-lez v0, :cond_1

    .line 134
    move-object v4, v7

    .line 135
    move v5, v6

    goto :goto_1

    .line 138
    :cond_0
    invoke-virtual {v7}, Lcom/huawei/hihealth/HiHealthData;->getType()I

    move-result v0

    const/16 v1, 0x7e3

    if-ne v1, v0, :cond_1

    .line 139
    move-object v4, v7

    .line 140
    move v5, v6

    .line 130
    :cond_1
    :goto_1
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 144
    :cond_2
    invoke-interface {p1, v5}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/HiHealthData;

    return-object v0
.end method

.method static synthetic b(Lo/crp;)Lo/cqx;
    .locals 1

    .line 24
    iget-object v0, p0, Lo/crp;->a:Lo/cqx;

    return-object v0
.end method

.method private b(ZLjava/util/List;)Z
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZLjava/util/List<Lcom/huawei/hihealth/HiHealthData;>;)Z"
        }
    .end annotation

    .line 102
    const/4 v7, 0x0

    :goto_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    if-ge v7, v0, :cond_1

    .line 103
    invoke-interface {p2, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/huawei/hihealth/HiHealthData;

    .line 104
    const-string v0, "merged"

    invoke-virtual {v8, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v0

    if-nez v0, :cond_0

    .line 105
    iget-object v0, p0, Lo/crp;->c:Lo/cqh;

    move-object v1, v8

    invoke-virtual {v8}, Lcom/huawei/hihealth/HiHealthData;->getClientID()I

    move-result v2

    const/16 v3, 0x7e3

    const/16 v4, 0x7e4

    const/4 v5, 0x1

    invoke-virtual/range {v0 .. v5}, Lo/cqh;->b(Lcom/huawei/hihealth/HiHealthData;IIII)Z

    move-result v6

    .line 106
    const-string v0, "Debug_HiHealthDataPointStressMerge"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "stress pointDataMerge() insertOrUpdatePointData unmerge change = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 107
    if-nez v6, :cond_0

    .line 108
    const/4 p1, 0x0

    .line 102
    :cond_0
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 112
    :cond_1
    return p1
.end method

.method private c(Lcom/huawei/hihealth/HiHealthData;Lcom/huawei/hihealth/HiHealthData;)Z
    .locals 4

    .line 116
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiHealthData;->getType()I

    move-result v0

    const/16 v1, 0x7e4

    if-ne v1, v0, :cond_0

    invoke-virtual {p1}, Lcom/huawei/hihealth/HiHealthData;->getValue()D

    move-result-wide v0

    invoke-virtual {p2}, Lcom/huawei/hihealth/HiHealthData;->getValue()D

    move-result-wide v2

    cmpg-double v0, v0, v2

    if-gtz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private d(I)Z
    .locals 1

    .line 148
    sparse-switch p1, :sswitch_data_0

    goto :goto_0

    .line 154
    :sswitch_0
    const/4 v0, 0x1

    return v0

    .line 156
    :goto_0
    const/4 v0, 0x0

    return v0

    :sswitch_data_0
    .sparse-switch
        0x7e5 -> :sswitch_0
        0x7f2 -> :sswitch_0
        0x7f3 -> :sswitch_0
        0x7f4 -> :sswitch_0
        0x7f5 -> :sswitch_0
    .end sparse-switch
.end method

.method private d(Lcom/huawei/hihealth/HiHealthData;)Z
    .locals 2

    .line 124
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiHealthData;->getType()I

    move-result v0

    const/16 v1, 0x7e3

    if-eq v1, v0, :cond_0

    invoke-virtual {p1}, Lcom/huawei/hihealth/HiHealthData;->getType()I

    move-result v0

    const/16 v1, 0x7e4

    if-ne v1, v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private d(Lcom/huawei/hihealth/HiHealthData;ILjava/util/List;)Z
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/hihealth/HiHealthData;ILjava/util/List<Ljava/lang/Integer;>;)Z"
        }
    .end annotation

    .line 161
    iget-object v0, p0, Lo/crp;->c:Lo/cqh;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, p2, v1}, Lo/cqh;->a(Lcom/huawei/hihealth/HiHealthData;II)Z

    move-result v8

    .line 162
    if-eqz v8, :cond_3

    .line 163
    iget-object v0, p0, Lo/crp;->d:Lo/cqn;

    invoke-virtual {p1}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v1

    invoke-virtual {p1}, Lcom/huawei/hihealth/HiHealthData;->getEndTime()J

    move-result-wide v3

    invoke-virtual {p1}, Lcom/huawei/hihealth/HiHealthData;->getType()I

    move-result v5

    move-object v6, p3

    invoke-virtual/range {v0 .. v6}, Lo/cqn;->e(JJILjava/util/List;)Ljava/util/List;

    move-result-object v9

    .line 164
    const/4 v0, 0x0

    if-eq v0, v9, :cond_0

    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x2

    if-ge v0, v1, :cond_1

    .line 165
    :cond_0
    const/4 v0, 0x1

    return v0

    .line 167
    :cond_1
    new-instance v0, Lo/crp$c;

    invoke-direct {v0, p0}, Lo/crp$c;-><init>(Lo/crp;)V

    invoke-static {v9, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 168
    const/4 v0, 0x0

    invoke-interface {v9, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-ne v0, p2, :cond_2

    .line 169
    const/4 v0, 0x0

    invoke-interface {v9, v0}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 170
    iget-object v0, p0, Lo/crp;->c:Lo/cqh;

    invoke-virtual {p1}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v1

    invoke-virtual {p1}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v3

    invoke-virtual {p1}, Lcom/huawei/hihealth/HiHealthData;->getType()I

    move-result v5

    move-object v6, v9

    const/4 v7, 0x1

    invoke-virtual/range {v0 .. v7}, Lo/cqh;->e(JJILjava/util/List;I)I

    goto :goto_0

    .line 172
    :cond_2
    iget-object v0, p0, Lo/crp;->c:Lo/cqh;

    invoke-virtual {p1}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v1

    invoke-virtual {p1}, Lcom/huawei/hihealth/HiHealthData;->getEndTime()J

    move-result-wide v3

    invoke-virtual {p1}, Lcom/huawei/hihealth/HiHealthData;->getType()I

    move-result v5

    move v6, p2

    const/4 v7, 0x1

    invoke-virtual/range {v0 .. v7}, Lo/cqh;->d(JJIII)I

    .line 175
    :cond_3
    :goto_0
    return v8
.end method

.method private d(Lcom/huawei/hihealth/HiHealthData;Lcom/huawei/hihealth/HiHealthData;)Z
    .locals 4

    .line 120
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiHealthData;->getType()I

    move-result v0

    const/16 v1, 0x7e4

    if-eq v1, v0, :cond_0

    invoke-virtual {p1}, Lcom/huawei/hihealth/HiHealthData;->getValue()D

    move-result-wide v0

    invoke-virtual {p2}, Lcom/huawei/hihealth/HiHealthData;->getValue()D

    move-result-wide v2

    cmpg-double v0, v0, v2

    if-gtz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method


# virtual methods
.method public a(Lcom/huawei/hihealth/HiHealthData;ILjava/util/List;)Z
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/hihealth/HiHealthData;ILjava/util/List<Ljava/lang/Integer;>;)Z"
        }
    .end annotation

    .line 40
    const/4 v8, 0x1

    .line 41
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiHealthData;->getType()I

    move-result v0

    invoke-direct {p0, v0}, Lo/crp;->d(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 42
    move/from16 v0, p2

    move-object/from16 v1, p3

    invoke-direct {p0, p1, v0, v1}, Lo/crp;->d(Lcom/huawei/hihealth/HiHealthData;ILjava/util/List;)Z

    move-result v0

    return v0

    .line 44
    :cond_0
    invoke-direct {p0, p1}, Lo/crp;->d(Lcom/huawei/hihealth/HiHealthData;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 46
    iget-object v0, p0, Lo/crp;->c:Lo/cqh;

    invoke-virtual {p1}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v1

    invoke-virtual {p1}, Lcom/huawei/hihealth/HiHealthData;->getEndTime()J

    move-result-wide v3

    move-object/from16 v7, p3

    const/16 v5, 0x7e3

    const/16 v6, 0x7e4

    invoke-virtual/range {v0 .. v7}, Lo/cqh;->e(JJIILjava/util/List;)Ljava/util/List;

    move-result-object v9

    .line 47
    invoke-static {v9}, Lo/cne;->e(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 49
    iget-object v0, p0, Lo/crp;->c:Lo/cqh;

    move/from16 v1, p2

    const/4 v2, 0x0

    invoke-virtual {v0, p1, v1, v2}, Lo/cqh;->b(Lcom/huawei/hihealth/HiHealthData;II)J

    move-result-wide v10

    .line 50
    const-wide/16 v0, 0x0

    cmp-long v0, v10, v0

    if-lez v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0

    .line 52
    :cond_2
    const-string v0, "Debug_HiHealthDataPointStressMerge"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "merge() get old data size = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 53
    const/4 v10, 0x1

    .line 54
    const/4 v11, 0x0

    .line 55
    invoke-interface {v9}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :goto_1
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Lcom/huawei/hihealth/HiHealthData;

    .line 57
    invoke-virtual {v13}, Lcom/huawei/hihealth/HiHealthData;->getClientID()I

    move-result v0

    move/from16 v1, p2

    if-eq v0, v1, :cond_3

    .line 58
    goto :goto_1

    .line 63
    :cond_3
    invoke-virtual {v13}, Lcom/huawei/hihealth/HiHealthData;->getType()I

    move-result v0

    const/16 v1, 0x7e3

    if-ne v0, v1, :cond_4

    .line 64
    invoke-direct {p0, p1, v13}, Lo/crp;->d(Lcom/huawei/hihealth/HiHealthData;Lcom/huawei/hihealth/HiHealthData;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 65
    const/4 v11, 0x1

    .line 66
    goto :goto_2

    .line 69
    :cond_4
    invoke-direct {p0, p1, v13}, Lo/crp;->c(Lcom/huawei/hihealth/HiHealthData;Lcom/huawei/hihealth/HiHealthData;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 70
    const/4 v11, 0x1

    .line 71
    goto :goto_2

    .line 74
    :cond_5
    const/4 v10, 0x0

    .line 75
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiHealthData;->getValue()D

    move-result-wide v0

    invoke-virtual {v13, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setValue(D)V

    .line 76
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiHealthData;->getType()I

    move-result v0

    invoke-virtual {v13, v0}, Lcom/huawei/hihealth/HiHealthData;->setType(I)V

    .line 77
    const-string v0, "merged"

    const/4 v1, 0x0

    invoke-virtual {v13, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->putInt(Ljava/lang/String;I)V

    .line 78
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiHealthData;->getSyncStatus()I

    move-result v0

    invoke-virtual {v13, v0}, Lcom/huawei/hihealth/HiHealthData;->setSyncStatus(I)V

    .line 79
    .line 82
    :cond_6
    :goto_2
    if-eqz v11, :cond_7

    .line 83
    return v8

    .line 86
    :cond_7
    if-eqz v10, :cond_8

    .line 87
    move/from16 v0, p2

    invoke-virtual {p1, v0}, Lcom/huawei/hihealth/HiHealthData;->setClientID(I)V

    .line 88
    const-string v0, "merged"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->putInt(Ljava/lang/String;I)V

    .line 89
    invoke-interface {v9, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 93
    :cond_8
    invoke-direct {p0, v9}, Lo/crp;->b(Ljava/util/List;)Lcom/huawei/hihealth/HiHealthData;

    move-result-object v12

    .line 94
    iget-object v0, p0, Lo/crp;->c:Lo/cqh;

    move-object v1, v12

    invoke-virtual {v12}, Lcom/huawei/hihealth/HiHealthData;->getClientID()I

    move-result v2

    const/16 v3, 0x7e3

    const/16 v4, 0x7e4

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Lo/cqh;->b(Lcom/huawei/hihealth/HiHealthData;IIII)Z

    move-result v8

    .line 95
    invoke-direct {p0, v8, v9}, Lo/crp;->b(ZLjava/util/List;)Z

    move-result v8

    .line 97
    :cond_9
    return v8
.end method
