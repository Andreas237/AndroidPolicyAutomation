.class public Lo/cup;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(I)I
    .locals 1

    .line 120
    packed-switch p0, :pswitch_data_0

    goto :goto_0

    .line 122
    :pswitch_0
    const/4 v0, 0x1

    return v0

    .line 127
    :pswitch_1
    const/4 v0, 0x0

    return v0

    .line 129
    :goto_0
    const/4 v0, 0x1

    return v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
    .end packed-switch
.end method

.method public static a(Landroid/content/Context;I)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;I)Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation

    .line 134
    invoke-static {p0}, Lo/cqd;->d(Landroid/content/Context;)Lo/cqd;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/cqd;->c(I)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public static b(Landroid/content/Context;ILjava/util/List;)Z
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;ILjava/util/List<Ljava/lang/Integer;>;)Z"
        }
    .end annotation

    .line 39
    const/4 v0, 0x2

    :try_start_0
    invoke-static {p0, v0, p2}, Lo/cui;->a(Landroid/content/Context;ILjava/util/List;)Ljava/util/List;
    :try_end_0
    .catch Lo/csq; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v4

    .line 43
    goto :goto_0

    .line 40
    :catch_0
    move-exception v5

    .line 41
    const-string v0, "HiH_HiSyncUtil"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkDataStatus error ,e is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v5}, Lo/csq;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 42
    const/4 v0, 0x0

    return v0

    .line 44
    :goto_0
    invoke-static {v4}, Lo/cne;->e(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 45
    const-string v0, "HiH_HiSyncUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkDataStatus ansSyncKeys == null || ansSyncKeys.isEmpty()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 46
    const/4 v0, 0x0

    return v0

    .line 49
    :cond_0
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/hwcloudmodel/model/unite/SyncKey;

    .line 50
    invoke-virtual {v7}, Lcom/huawei/hwcloudmodel/model/unite/SyncKey;->getType()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v8

    .line 51
    invoke-virtual {v7}, Lcom/huawei/hwcloudmodel/model/unite/SyncKey;->getVersion()Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v9

    .line 52
    invoke-static {p0}, Lo/cqm;->e(Landroid/content/Context;)Lo/cqm;

    move-result-object v0

    const-wide/16 v1, 0x0

    invoke-virtual {v0, p1, v1, v2, v8}, Lo/cqm;->a(IJI)Lo/cnz;

    move-result-object v5

    .line 53
    if-nez v5, :cond_1

    .line 54
    const-string v0, "HiH_HiSyncUtil"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkDataStatus no such data in db ,type is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 55
    const-wide/16 v0, 0x0

    cmp-long v0, v9, v0

    if-lez v0, :cond_2

    .line 56
    const-string v0, "HiH_HiSyncUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkDataStatus syncAnchorTable = null and version > 0 "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 57
    const/4 v0, 0x1

    return v0

    .line 60
    :cond_1
    invoke-virtual {v5}, Lo/cnz;->c()J

    move-result-wide v11

    .line 61
    cmp-long v0, v11, v9

    if-gez v0, :cond_2

    .line 62
    const-string v0, "HiH_HiSyncUtil"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkDataStatus local version is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " cloud version is "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, " type is "

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 63
    const/4 v0, 0x1

    return v0

    .line 66
    :cond_2
    goto/16 :goto_1

    .line 67
    :cond_3
    const/4 v0, 0x0

    return v0
.end method

.method public static c(Landroid/content/Context;I)Lcom/huawei/hihealth/HiHealthData;
    .locals 7

    .line 71
    invoke-static {p0}, Lo/cqy;->d(Landroid/content/Context;)Lo/cqy;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/cqy;->a(I)Ljava/util/List;

    move-result-object v4

    .line 72
    invoke-static {v4}, Lo/cne;->e(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 73
    const-string v0, "HiH_HiSyncUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getTodayNoSyncTotalValue clients = null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 74
    const/4 v0, 0x0

    return-object v0

    .line 76
    :cond_0
    invoke-static {}, Lo/cul;->a()Lcom/huawei/hihealth/HiAggregateOption;

    move-result-object v5

    .line 77
    invoke-static {p0}, Lo/cqn;->a(Landroid/content/Context;)Lo/cqn;

    move-result-object v0

    invoke-virtual {v0, v4, v5}, Lo/cqn;->i(Ljava/util/List;Lcom/huawei/hihealth/HiAggregateOption;)Ljava/util/List;

    move-result-object v6

    .line 78
    invoke-static {v6}, Lo/cne;->e(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 79
    const-string v0, "HiH_HiSyncUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getTodayNoSyncTotalValue datas is null or empty"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 80
    const/4 v0, 0x0

    return-object v0

    .line 82
    :cond_1
    const/4 v0, 0x0

    invoke-interface {v6, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/HiHealthData;

    return-object v0
.end method

.method public static d(Landroid/content/Context;I[I[Ljava/lang/String;II)Ljava/util/List;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;I[I[Ljava/lang/String;II)Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation

    .line 105
    invoke-static {p0}, Lo/cqd;->d(Landroid/content/Context;)Lo/cqd;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lo/cqd;->a(I[I)Ljava/util/List;

    move-result-object v7

    .line 106
    invoke-static {v7}, Lo/cne;->e(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 107
    const-string v0, "HiH_HiSyncUtil"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getUploadStat no syncDays get !"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, " types is "

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {p2}, Lo/cnj;->d(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 108
    const/4 v0, 0x0

    return-object v0

    .line 110
    :cond_0
    invoke-static {p0}, Lo/cqn;->a(Landroid/content/Context;)Lo/cqn;

    move-result-object v0

    move v1, p1

    move v2, p4

    move-object v3, p2

    move-object v4, p3

    move-object v5, v7

    move v6, p5

    invoke-virtual/range {v0 .. v6}, Lo/cqn;->c(II[I[Ljava/lang/String;Ljava/util/List;I)Ljava/util/List;

    move-result-object v8

    .line 111
    invoke-static {v8}, Lo/cne;->e(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 112
    const-string v0, "HiH_HiSyncUtil"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getUploadStat no stat get !"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, " types is "

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {p2}, Lo/cnj;->d(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 113
    const/4 v0, 0x0

    return-object v0

    .line 115
    :cond_1
    const-string v0, "HiH_HiSyncUtil"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getUploadStat syncDays size is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 116
    return-object v8
.end method
