.class public Lo/cri;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/cri$d;
    }
.end annotation


# static fields
.field private static e:Landroid/content/Context;


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    return-void
.end method

.method synthetic constructor <init>(Lo/cri$2;)V
    .locals 0

    .line 18
    invoke-direct {p0}, Lo/cri;-><init>()V

    return-void
.end method

.method public static d(Landroid/content/Context;)Lo/cri;
    .locals 1
    .param p0    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 33
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    sput-object v0, Lo/cri;->e:Landroid/content/Context;

    .line 34
    sget-object v0, Lo/cri$d;->e:Lo/cri;

    return-object v0
.end method


# virtual methods
.method public b(JJ[ILjava/util/List;)Z
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JJ[ILjava/util/List<Ljava/lang/Integer;>;)Z"
        }
    .end annotation

    .line 85
    sget-object v0, Lo/cri;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/cpv;->c(Landroid/content/Context;)Lo/cpv;

    move-result-object v7

    .line 86
    move-object v0, v7

    move-wide v1, p1

    move-wide/from16 v3, p3

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    invoke-virtual/range {v0 .. v6}, Lo/cpv;->a(JJ[ILjava/util/List;)Ljava/util/List;

    move-result-object v8

    .line 87
    const-string v0, "HiH_HiHealthDataDeleteStore"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "deleteHealthSessionDatas() hiHealthDatas = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v8, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 88
    const/4 v0, 0x0

    if-eq v0, v8, :cond_0

    invoke-interface {v8}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 89
    :cond_0
    const-string v0, "HiH_HiHealthDataDeleteStore"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "deleteHealthSessionDatas() hiHealthDatas = null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 90
    const/4 v0, 0x0

    return v0

    .line 93
    :cond_1
    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_0
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lcom/huawei/hihealth/HiHealthData;

    .line 94
    invoke-virtual {v11}, Lcom/huawei/hihealth/HiHealthData;->getSyncStatus()I

    move-result v12

    .line 95
    if-nez v12, :cond_2

    .line 96
    move-object v0, v7

    invoke-virtual {v11}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v1

    invoke-virtual {v11}, Lcom/huawei/hihealth/HiHealthData;->getEndTime()J

    move-result-wide v3

    invoke-virtual {v11}, Lcom/huawei/hihealth/HiHealthData;->getClientID()I

    move-result v5

    invoke-virtual/range {v0 .. v5}, Lo/cpv;->d(JJI)I

    move-result v9

    goto :goto_1

    .line 98
    :cond_2
    invoke-virtual {v11}, Lcom/huawei/hihealth/HiHealthData;->getDataID()J

    move-result-wide v0

    const/4 v2, 0x2

    const/4 v3, 0x2

    invoke-virtual {v7, v0, v1, v2, v3}, Lo/cpv;->a(JII)I

    move-result v9

    .line 100
    :goto_1
    if-gtz v9, :cond_3

    .line 101
    const-string v0, "HiH_HiHealthDataDeleteStore"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "deleteHealthSessionDatas() change <= 0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 102
    const/4 v0, 0x0

    return v0

    .line 104
    :cond_3
    goto :goto_0

    .line 105
    :cond_4
    const/4 v0, 0x1

    return v0
.end method

.method public c(JJ[ILjava/util/List;)Z
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JJ[ILjava/util/List<Ljava/lang/Integer;>;)Z"
        }
    .end annotation

    .line 61
    sget-object v0, Lo/cri;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/cqj;->d(Landroid/content/Context;)Lo/cqj;

    move-result-object v7

    .line 62
    move-object v0, v7

    move-wide v1, p1

    move-wide/from16 v3, p3

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    invoke-virtual/range {v0 .. v6}, Lo/cqj;->c(JJ[ILjava/util/List;)Ljava/util/List;

    move-result-object v8

    .line 63
    const-string v0, "HiH_HiHealthDataDeleteStore"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "deleteHealthSessionDatas() hiHealthDatas = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v8, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 64
    const/4 v0, 0x0

    if-eq v0, v8, :cond_0

    invoke-interface {v8}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 65
    :cond_0
    const-string v0, "HiH_HiHealthDataDeleteStore"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "deleteHealthSessionDatas() hiHealthDatas = null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 66
    const/4 v0, 0x0

    return v0

    .line 69
    :cond_1
    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_0
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lcom/huawei/hihealth/HiHealthData;

    .line 70
    invoke-virtual {v11}, Lcom/huawei/hihealth/HiHealthData;->getSyncStatus()I

    move-result v12

    .line 71
    if-nez v12, :cond_2

    .line 72
    move-object v0, v7

    invoke-virtual {v11}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v1

    invoke-virtual {v11}, Lcom/huawei/hihealth/HiHealthData;->getEndTime()J

    move-result-wide v3

    invoke-virtual {v11}, Lcom/huawei/hihealth/HiHealthData;->getClientID()I

    move-result v5

    invoke-virtual/range {v0 .. v5}, Lo/cqj;->c(JJI)I

    move-result v9

    goto :goto_1

    .line 74
    :cond_2
    invoke-virtual {v11}, Lcom/huawei/hihealth/HiHealthData;->getDataID()J

    move-result-wide v0

    const/4 v2, 0x2

    const/4 v3, 0x2

    invoke-virtual {v7, v0, v1, v2, v3}, Lo/cqj;->c(JII)I

    move-result v9

    .line 76
    :goto_1
    if-gtz v9, :cond_3

    .line 77
    const-string v0, "HiH_HiHealthDataDeleteStore"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "deleteHealthSessionDatas() change <= 0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 78
    const/4 v0, 0x0

    return v0

    .line 80
    :cond_3
    goto :goto_0

    .line 81
    :cond_4
    const/4 v0, 0x1

    return v0
.end method

.method public e(JJ[ILjava/util/List;)Z
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JJ[ILjava/util/List<Ljava/lang/Integer;>;)Z"
        }
    .end annotation

    .line 37
    sget-object v0, Lo/cri;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/cqc;->e(Landroid/content/Context;)Lo/cqc;

    move-result-object v7

    .line 38
    move-object v0, v7

    move-wide v1, p1

    move-wide/from16 v3, p3

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    invoke-virtual/range {v0 .. v6}, Lo/cqc;->c(JJ[ILjava/util/List;)Ljava/util/List;

    move-result-object v8

    .line 39
    const-string v0, "HiH_HiHealthDataDeleteStore"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "deleteSessionDatas() hiHealthDatas = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v8, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 40
    const/4 v0, 0x0

    if-eq v0, v8, :cond_0

    invoke-interface {v8}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 41
    :cond_0
    const-string v0, "HiH_HiHealthDataDeleteStore"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "deleteSessionDatas() hiHealthDatas = null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 42
    const/4 v0, 0x0

    return v0

    .line 45
    :cond_1
    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_0
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lcom/huawei/hihealth/HiHealthData;

    .line 46
    invoke-virtual {v11}, Lcom/huawei/hihealth/HiHealthData;->getSyncStatus()I

    move-result v12

    .line 47
    if-nez v12, :cond_2

    .line 48
    move-object v0, v7

    invoke-virtual {v11}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v1

    invoke-virtual {v11}, Lcom/huawei/hihealth/HiHealthData;->getEndTime()J

    move-result-wide v3

    invoke-virtual {v11}, Lcom/huawei/hihealth/HiHealthData;->getClientID()I

    move-result v5

    invoke-virtual/range {v0 .. v5}, Lo/cqc;->a(JJI)I

    move-result v9

    goto :goto_1

    .line 50
    :cond_2
    invoke-virtual {v11}, Lcom/huawei/hihealth/HiHealthData;->getDataID()J

    move-result-wide v0

    const/4 v2, 0x2

    const/4 v3, 0x2

    invoke-virtual {v7, v0, v1, v2, v3}, Lo/cqc;->b(JII)I

    move-result v9

    .line 52
    :goto_1
    if-gtz v9, :cond_3

    .line 53
    const-string v0, "HiH_HiHealthDataDeleteStore"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "deleteSessionDatas() change <= 0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 54
    const/4 v0, 0x0

    return v0

    .line 56
    :cond_3
    goto :goto_0

    .line 57
    :cond_4
    const/4 v0, 0x1

    return v0
.end method
