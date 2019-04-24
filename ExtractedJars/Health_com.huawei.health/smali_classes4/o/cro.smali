.class public Lo/cro;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/cro$e;
    }
.end annotation


# instance fields
.field private b:Lo/cqc;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    invoke-static {p1}, Lo/cqc;->e(Landroid/content/Context;)Lo/cqc;

    move-result-object v0

    iput-object v0, p0, Lo/cro;->b:Lo/cqc;

    .line 31
    return-void
.end method


# virtual methods
.method public d(Lcom/huawei/hihealth/HiHealthData;ILjava/util/List;)Z
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/hihealth/HiHealthData;ILjava/util/List<Ljava/lang/Integer;>;)Z"
        }
    .end annotation

    .line 38
    iget-object v0, p0, Lo/cro;->b:Lo/cqc;

    invoke-virtual {p1}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v1

    invoke-virtual {p1}, Lcom/huawei/hihealth/HiHealthData;->getEndTime()J

    move-result-wide v3

    move-object/from16 v5, p3

    invoke-virtual/range {v0 .. v5}, Lo/cqc;->a(JJLjava/util/List;)Ljava/util/List;

    move-result-object v6

    .line 41
    const/4 v0, 0x0

    if-eq v0, v6, :cond_0

    invoke-interface {v6}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 42
    :cond_0
    iget-object v0, p0, Lo/cro;->b:Lo/cqc;

    move/from16 v1, p2

    const/4 v2, 0x0

    invoke-virtual {v0, p1, v1, v2}, Lo/cqc;->e(Lcom/huawei/hihealth/HiHealthData;II)J

    move-result-wide v7

    .line 44
    const-wide/16 v0, 0x0

    cmp-long v0, v7, v0

    if-lez v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0

    .line 49
    :cond_2
    const/4 v7, 0x1

    .line 51
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_1
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lcom/huawei/hihealth/HiHealthData;

    .line 53
    invoke-virtual {v10}, Lcom/huawei/hihealth/HiHealthData;->getClientID()I

    move-result v0

    move/from16 v1, p2

    if-eq v0, v1, :cond_3

    .line 54
    goto :goto_1

    .line 56
    :cond_3
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiHealthData;->getType()I

    move-result v0

    invoke-virtual {v10}, Lcom/huawei/hihealth/HiHealthData;->getType()I

    move-result v1

    invoke-static {v0, v1}, Lo/cpj;->d(II)I

    move-result v8

    .line 58
    if-gtz v8, :cond_4

    .line 59
    const-string v0, "Debug_HiDataSessionMerge"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "sessionDataMerge() insertData priority is lower oldData = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v10, v1, v2

    const-string v2, ",sesseionData = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 60
    const/4 v0, 0x1

    return v0

    .line 62
    :cond_4
    const-string v0, "Debug_HiDataSessionMerge"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "sessionDataMerge() merged has happen  type from  "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v10}, Lcom/huawei/hihealth/HiHealthData;->getType()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ",to "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    .line 63
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiHealthData;->getType()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, ",time = "

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-virtual {p1}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v2

    invoke-static {v2, v3}, Lo/cnk;->o(J)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    .line 62
    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 64
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiHealthData;->getType()I

    move-result v0

    invoke-virtual {v10, v0}, Lcom/huawei/hihealth/HiHealthData;->setType(I)V

    .line 65
    const-string v0, "merged"

    const/4 v1, 0x0

    invoke-virtual {v10, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->putInt(Ljava/lang/String;I)V

    .line 66
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiHealthData;->getSyncStatus()I

    move-result v0

    invoke-virtual {v10, v0}, Lcom/huawei/hihealth/HiHealthData;->setSyncStatus(I)V

    .line 67
    const/4 v7, 0x0

    .line 68
    .line 71
    :cond_5
    if-eqz v7, :cond_6

    .line 72
    move/from16 v0, p2

    invoke-virtual {p1, v0}, Lcom/huawei/hihealth/HiHealthData;->setClientID(I)V

    .line 73
    const-string v0, "merged"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->putInt(Ljava/lang/String;I)V

    .line 74
    invoke-interface {v6, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 79
    :cond_6
    new-instance v0, Lo/cro$e;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/cro$e;-><init>(Lo/cro$1;)V

    invoke-static {v6, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 82
    const/4 v0, 0x0

    invoke-interface {v6, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lcom/huawei/hihealth/HiHealthData;

    .line 83
    iget-object v0, p0, Lo/cro;->b:Lo/cqc;

    invoke-virtual {v9}, Lcom/huawei/hihealth/HiHealthData;->getClientID()I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v0, v9, v1, v2}, Lo/cqc;->b(Lcom/huawei/hihealth/HiHealthData;II)Z

    move-result v10

    .line 86
    const/4 v12, 0x1

    :goto_2
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    if-ge v12, v0, :cond_8

    .line 87
    invoke-interface {v6, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Lcom/huawei/hihealth/HiHealthData;

    .line 88
    const-string v0, "merged"

    invoke-virtual {v13, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v0

    if-nez v0, :cond_7

    .line 89
    iget-object v0, p0, Lo/cro;->b:Lo/cqc;

    invoke-virtual {v13}, Lcom/huawei/hihealth/HiHealthData;->getClientID()I

    move-result v1

    const/4 v2, 0x1

    invoke-virtual {v0, v13, v1, v2}, Lo/cqc;->b(Lcom/huawei/hihealth/HiHealthData;II)Z

    move-result v11

    .line 90
    if-nez v11, :cond_7

    .line 91
    const/4 v10, 0x0

    .line 86
    :cond_7
    add-int/lit8 v12, v12, 0x1

    goto :goto_2

    .line 96
    :cond_8
    return v10
.end method
