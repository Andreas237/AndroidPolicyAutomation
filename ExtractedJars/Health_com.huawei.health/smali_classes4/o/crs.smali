.class public Lo/crs;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/crs$a;
    }
.end annotation


# instance fields
.field private a:Lo/cqc;

.field private b:Lo/cpy;

.field private c:Lo/cqn;

.field private e:Lo/cqx;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 45
    invoke-static {p1}, Lo/cpy;->d(Landroid/content/Context;)Lo/cpy;

    move-result-object v0

    iput-object v0, p0, Lo/crs;->b:Lo/cpy;

    .line 46
    invoke-static {p1}, Lo/cqx;->d(Landroid/content/Context;)Lo/cqx;

    move-result-object v0

    iput-object v0, p0, Lo/crs;->e:Lo/cqx;

    .line 47
    invoke-static {p1}, Lo/cqc;->e(Landroid/content/Context;)Lo/cqc;

    move-result-object v0

    iput-object v0, p0, Lo/crs;->a:Lo/cqc;

    .line 48
    invoke-static {p1}, Lo/cqn;->a(Landroid/content/Context;)Lo/cqn;

    move-result-object v0

    iput-object v0, p0, Lo/crs;->c:Lo/cqn;

    .line 49
    return-void
.end method

.method private b(Ljava/util/List;)I
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/Integer;>;)I"
        }
    .end annotation

    .line 98
    new-instance v0, Lo/crs$a;

    invoke-direct {v0, p0}, Lo/crs$a;-><init>(Lo/crs;)V

    invoke-static {p1, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 99
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method static synthetic c(Lo/crs;)Lo/cqx;
    .locals 1

    .line 27
    iget-object v0, p0, Lo/crs;->e:Lo/cqx;

    return-object v0
.end method


# virtual methods
.method public b(Lcom/huawei/hihealth/HiHealthData;II)Z
    .locals 10

    .line 103
    const/4 v7, 0x0

    .line 104
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/cnk;->a(J)I

    move-result v8

    .line 105
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/cnk;->a(J)I

    move-result v0

    if-ne v0, v8, :cond_0

    invoke-virtual {p1}, Lcom/huawei/hihealth/HiHealthData;->getType()I

    move-result v0

    const/16 v1, 0x385

    if-ne v1, v0, :cond_0

    .line 106
    const/4 v7, 0x1

    .line 108
    :cond_0
    iget-object v0, p0, Lo/crs;->b:Lo/cpy;

    invoke-virtual {p1}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v1

    invoke-virtual {p1}, Lcom/huawei/hihealth/HiHealthData;->getEndTime()J

    move-result-wide v3

    invoke-virtual {p1}, Lcom/huawei/hihealth/HiHealthData;->getType()I

    move-result v5

    move v6, p2

    invoke-virtual/range {v0 .. v6}, Lo/cpy;->a(JJII)Ljava/lang/Double;

    move-result-object v9

    .line 109
    const/4 v0, 0x0

    if-ne v0, v9, :cond_2

    .line 110
    if-eqz v7, :cond_1

    .line 111
    const-string v0, "HiH_HiDataPointMerge"

    const/4 v1, 0x5

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "insert device stat date="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ", new="

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-virtual {p1}, Lcom/huawei/hihealth/HiHealthData;->getValue()D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, ", old=null"

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 113
    :cond_1
    iget-object v0, p0, Lo/crs;->b:Lo/cpy;

    invoke-virtual {v0, p1, p2, p3}, Lo/cpy;->e(Lcom/huawei/hihealth/HiHealthData;II)J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/cpn;->c(J)Z

    move-result v0

    return v0

    .line 115
    :cond_2
    invoke-virtual {v9}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    invoke-virtual {p1}, Lcom/huawei/hihealth/HiHealthData;->getValue()D

    move-result-wide v2

    cmpl-double v0, v0, v2

    if-ltz v0, :cond_3

    .line 116
    const/4 v0, 0x0

    return v0

    .line 118
    :cond_3
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiHealthData;->getSyncStatus()I

    move-result v0

    if-nez v0, :cond_4

    .line 119
    iget-object v0, p0, Lo/crs;->a:Lo/cqc;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, p2, v1}, Lo/cqc;->a(Lcom/huawei/hihealth/HiHealthData;II)I

    .line 121
    :cond_4
    if-eqz v7, :cond_5

    .line 122
    const-string v0, "HiH_HiDataPointMerge"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "insert device stat date="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ", new="

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-virtual {p1}, Lcom/huawei/hihealth/HiHealthData;->getValue()D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, ", old="

    const/4 v3, 0x4

    aput-object v2, v1, v3

    const/4 v2, 0x5

    aput-object v9, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 124
    :cond_5
    iget-object v0, p0, Lo/crs;->b:Lo/cpy;

    invoke-virtual {v0, p1, p2, p3}, Lo/cpy;->d(Lcom/huawei/hihealth/HiHealthData;II)I

    move-result v0

    int-to-long v0, v0

    invoke-static {v0, v1}, Lo/cpn;->c(J)Z

    move-result v0

    return v0
.end method

.method public c(Lcom/huawei/hihealth/HiHealthData;ILjava/util/List;)Z
    .locals 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/hihealth/HiHealthData;ILjava/util/List<Ljava/lang/Integer;>;)Z"
        }
    .end annotation

    .line 53
    move-object/from16 v0, p1

    move/from16 v1, p2

    const/4 v2, 0x0

    invoke-virtual {p0, v0, v1, v2}, Lo/crs;->b(Lcom/huawei/hihealth/HiHealthData;II)Z

    move-result v8

    .line 54
    if-nez v8, :cond_0

    .line 55
    const/4 v0, 0x1

    return v0

    .line 58
    :cond_0
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v0

    const-wide/32 v2, 0x1d4c0

    sub-long v9, v0, v2

    .line 59
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v0

    const-wide/32 v2, 0x1d4c0

    add-long v11, v0, v2

    .line 60
    iget-object v0, p0, Lo/crs;->c:Lo/cqn;

    move-wide v1, v9

    move-wide v3, v11

    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hihealth/HiHealthData;->getType()I

    move-result v5

    move-object/from16 v6, p3

    invoke-virtual/range {v0 .. v6}, Lo/cqn;->b(JJILjava/util/List;)Ljava/util/List;

    move-result-object v13

    .line 61
    const/4 v0, 0x0

    if-eq v0, v13, :cond_1

    invoke-interface {v13}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x2

    if-ge v0, v1, :cond_2

    .line 62
    :cond_1
    const/4 v0, 0x1

    return v0

    .line 65
    :cond_2
    invoke-direct {p0, v13}, Lo/crs;->b(Ljava/util/List;)I

    move-result v14

    .line 66
    move/from16 v0, p2

    if-ne v14, v0, :cond_3

    .line 67
    const/4 v0, 0x0

    invoke-interface {v13, v0}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 68
    iget-object v0, p0, Lo/crs;->b:Lo/cpy;

    move-wide v1, v9

    move-wide v3, v11

    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hihealth/HiHealthData;->getType()I

    move-result v5

    move-object v6, v13

    const/4 v7, 0x1

    invoke-virtual/range {v0 .. v7}, Lo/cpy;->b(JJILjava/util/List;I)I

    goto :goto_0

    .line 70
    :cond_3
    iget-object v0, p0, Lo/crs;->b:Lo/cpy;

    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v1

    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hihealth/HiHealthData;->getEndTime()J

    move-result-wide v3

    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hihealth/HiHealthData;->getType()I

    move-result v5

    move/from16 v6, p2

    const/4 v7, 0x1

    invoke-virtual/range {v0 .. v7}, Lo/cpy;->e(JJIII)I

    .line 73
    :goto_0
    const/4 v0, 0x1

    return v0
.end method
