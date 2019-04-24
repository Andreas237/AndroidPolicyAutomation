.class public Lo/crw;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/crw$e;
    }
.end annotation


# instance fields
.field private d:Lo/cqj;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    invoke-static {p1}, Lo/cqj;->d(Landroid/content/Context;)Lo/cqj;

    move-result-object v0

    iput-object v0, p0, Lo/crw;->d:Lo/cqj;

    .line 30
    return-void
.end method


# virtual methods
.method public a(Lcom/huawei/hihealth/HiHealthData;ILjava/util/List;)Z
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/hihealth/HiHealthData;ILjava/util/List<Ljava/lang/Integer;>;)Z"
        }
    .end annotation

    .line 34
    iget-object v0, p0, Lo/crw;->d:Lo/cqj;

    invoke-virtual {p1}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v1

    invoke-virtual {p1}, Lcom/huawei/hihealth/HiHealthData;->getEndTime()J

    move-result-wide v3

    move-object/from16 v5, p3

    invoke-virtual/range {v0 .. v5}, Lo/cqj;->e(JJLjava/util/List;)Ljava/util/List;

    move-result-object v6

    .line 37
    const/4 v0, 0x0

    if-eq v0, v6, :cond_0

    invoke-interface {v6}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 38
    :cond_0
    iget-object v0, p0, Lo/crw;->d:Lo/cqj;

    move/from16 v1, p2

    const/4 v2, 0x0

    invoke-virtual {v0, p1, v1, v2}, Lo/cqj;->b(Lcom/huawei/hihealth/HiHealthData;II)J

    move-result-wide v7

    .line 39
    const-wide/16 v0, 0x0

    cmp-long v0, v7, v0

    if-lez v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0

    .line 44
    :cond_2
    const/4 v8, 0x1

    .line 45
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_1
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lcom/huawei/hihealth/HiHealthData;

    .line 47
    invoke-virtual {v10}, Lcom/huawei/hihealth/HiHealthData;->getClientID()I

    move-result v0

    move/from16 v1, p2

    if-eq v0, v1, :cond_3

    .line 48
    goto :goto_1

    .line 50
    :cond_3
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiHealthData;->getType()I

    move-result v0

    invoke-virtual {v10, v0}, Lcom/huawei/hihealth/HiHealthData;->setType(I)V

    .line 51
    const-string v0, "merged"

    const/4 v1, 0x0

    invoke-virtual {v10, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->putInt(Ljava/lang/String;I)V

    .line 52
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiHealthData;->getSyncStatus()I

    move-result v0

    invoke-virtual {v10, v0}, Lcom/huawei/hihealth/HiHealthData;->setSyncStatus(I)V

    .line 53
    const/4 v8, 0x0

    .line 54
    .line 57
    :cond_4
    if-eqz v8, :cond_5

    .line 58
    const-string v0, "merged"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->putInt(Ljava/lang/String;I)V

    .line 59
    move/from16 v0, p2

    invoke-virtual {p1, v0}, Lcom/huawei/hihealth/HiHealthData;->setClientID(I)V

    .line 60
    invoke-interface {v6, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 63
    :cond_5
    new-instance v0, Lo/crw$e;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/crw$e;-><init>(Lo/crw$1;)V

    invoke-static {v6, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 64
    const/4 v0, 0x0

    invoke-interface {v6, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lcom/huawei/hihealth/HiHealthData;

    .line 65
    iget-object v0, p0, Lo/crw;->d:Lo/cqj;

    invoke-virtual {v9}, Lcom/huawei/hihealth/HiHealthData;->getClientID()I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v0, v9, v1, v2}, Lo/cqj;->e(Lcom/huawei/hihealth/HiHealthData;II)Z

    move-result v10

    .line 67
    const/4 v12, 0x1

    :goto_2
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    if-ge v12, v0, :cond_7

    .line 68
    invoke-interface {v6, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Lcom/huawei/hihealth/HiHealthData;

    .line 69
    const-string v0, "merged"

    invoke-virtual {v13, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v0

    if-nez v0, :cond_6

    .line 70
    iget-object v0, p0, Lo/crw;->d:Lo/cqj;

    invoke-virtual {v13}, Lcom/huawei/hihealth/HiHealthData;->getClientID()I

    move-result v1

    const/4 v2, 0x1

    invoke-virtual {v0, v13, v1, v2}, Lo/cqj;->e(Lcom/huawei/hihealth/HiHealthData;II)Z

    move-result v11

    .line 71
    const-string v0, "Debug_HiHealthDataSessionMerge"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "healthSessionDataMerge() insertOrUpdateSessionData unmerge change = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v11}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 72
    if-nez v11, :cond_6

    .line 73
    const/4 v10, 0x0

    .line 67
    :cond_6
    add-int/lit8 v12, v12, 0x1

    goto :goto_2

    .line 77
    :cond_7
    return v10
.end method
