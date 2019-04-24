.class public Lo/ctp;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/ctp$c;
    }
.end annotation


# static fields
.field private static e:Landroid/content/Context;


# instance fields
.field private a:Lo/cqg;

.field private b:Lo/cqj;

.field private c:I

.field private d:Lo/czg;


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    const/4 v0, 0x0

    iput v0, p0, Lo/ctp;->c:I

    .line 41
    sget-object v0, Lo/ctp;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/cqg;->c(Landroid/content/Context;)Lo/cqg;

    move-result-object v0

    iput-object v0, p0, Lo/ctp;->a:Lo/cqg;

    .line 42
    sget-object v0, Lo/ctp;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/cqj;->d(Landroid/content/Context;)Lo/cqj;

    move-result-object v0

    iput-object v0, p0, Lo/ctp;->b:Lo/cqj;

    .line 43
    sget-object v0, Lo/ctp;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/czg;->e(Landroid/content/Context;)Lo/czg;

    move-result-object v0

    iput-object v0, p0, Lo/ctp;->d:Lo/czg;

    .line 44
    return-void
.end method

.method synthetic constructor <init>(Lo/ctp$3;)V
    .locals 0

    .line 29
    invoke-direct {p0}, Lo/ctp;-><init>()V

    return-void
.end method

.method private b(I)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation

    .line 115
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 116
    const/16 v0, 0x55f1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 117
    const/16 v0, 0x55f2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 118
    const/16 v0, 0x55f3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 119
    iget-object v0, p0, Lo/ctp;->b:Lo/cqj;

    const/16 v1, 0x32

    invoke-virtual {v0, p1, v2, v1}, Lo/cqj;->e(ILjava/util/List;I)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public static b(Landroid/content/Context;)Lo/ctp;
    .locals 1
    .param p0    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 54
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    sput-object v0, Lo/ctp;->e:Landroid/content/Context;

    .line 55
    sget-object v0, Lo/ctp$c;->c:Lo/ctp;

    return-object v0
.end method

.method private c(I)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation

    .line 123
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 124
    const/16 v0, 0x7d1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 125
    const/16 v0, 0x7d2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 126
    const/16 v0, 0x7d4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 134
    iget-object v0, p0, Lo/ctp;->a:Lo/cqg;

    const/16 v1, 0x32

    invoke-virtual {v0, p1, v2, v1}, Lo/cqg;->d(ILjava/util/List;I)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method private c(Ljava/util/List;)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;)V"
        }
    .end annotation

    .line 138
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 139
    :cond_0
    return-void

    .line 143
    :cond_1
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_0
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lcom/huawei/hihealth/HiHealthData;

    .line 144
    invoke-virtual {v11}, Lcom/huawei/hihealth/HiHealthData;->getDataID()J

    move-result-wide v8

    .line 145
    const-string v0, "modified_time"

    invoke-virtual {v11, v0}, Lcom/huawei/hihealth/HiHealthData;->getLong(Ljava/lang/String;)J

    move-result-wide v6

    .line 147
    iget-object v0, p0, Lo/ctp;->b:Lo/cqj;

    move-wide v1, v8

    move-wide v3, v6

    const/4 v5, 0x1

    invoke-virtual/range {v0 .. v5}, Lo/cqj;->e(JJI)I

    .line 148
    goto :goto_0

    .line 149
    :cond_2
    return-void
.end method

.method private c(Ljava/util/List;ILo/css;)Z
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;ILo/css;)Z"
        }
    .end annotation

    .line 166
    const/4 v0, 0x0

    invoke-virtual {p3, p1, p2, v0}, Lo/css;->d(Ljava/util/List;II)Ljava/util/List;

    move-result-object v4

    .line 167
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 168
    :cond_0
    const-string v0, "Debug_HiSyncHealthData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "addHealthData sportDetails is null or empty"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 169
    const/4 v0, 0x0

    return v0

    .line 171
    :cond_1
    new-instance v5, Lcom/huawei/hwcloudmodel/model/unite/AddHealthDataReq;

    invoke-direct {v5}, Lcom/huawei/hwcloudmodel/model/unite/AddHealthDataReq;-><init>()V

    .line 172
    invoke-virtual {v5, v4}, Lcom/huawei/hwcloudmodel/model/unite/AddHealthDataReq;->setDetailInfo(Ljava/util/List;)V

    .line 173
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/HiHealthData;

    invoke-virtual {v0}, Lcom/huawei/hihealth/HiHealthData;->getTimeZone()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/hwcloudmodel/model/unite/AddHealthDataReq;->setTimeZone(Ljava/lang/String;)V

    .line 175
    :goto_0
    iget v0, p0, Lo/ctp;->c:I

    const/4 v1, 0x2

    if-ge v0, v1, :cond_4

    .line 176
    iget-object v0, p0, Lo/ctp;->d:Lo/czg;

    invoke-virtual {v0, v5}, Lo/czg;->d(Lcom/huawei/hwcloudmodel/model/unite/AddHealthDataReq;)Lcom/huawei/hwcloudmodel/model/unite/AddHealthDataRsp;

    move-result-object v6

    .line 178
    const/4 v0, 0x0

    if-ne v0, v6, :cond_2

    .line 179
    const-string v0, "Debug_HiSyncHealthData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "addHealthData addHealthDataRsp is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 180
    const-string v0, "Debug_HiSyncHealthData"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "addHealthData pushData healthData failed , upLoadFailCount = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget v2, p0, Lo/ctp;->c:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 181
    iget v0, p0, Lo/ctp;->c:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/ctp;->c:I

    .line 182
    goto :goto_0

    .line 185
    :cond_2
    invoke-virtual {v6}, Lcom/huawei/hwcloudmodel/model/unite/AddHealthDataRsp;->getResultCode()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-eqz v0, :cond_3

    .line 186
    iget v0, p0, Lo/ctp;->c:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/ctp;->c:I

    .line 187
    const-string v0, "Debug_HiSyncHealthData"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "addHealthData addHealthDataRsp resultCode is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Lcom/huawei/hwcloudmodel/model/unite/AddHealthDataRsp;->getResultCode()Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 188
    const-string v0, "Debug_HiSyncHealthData"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "addHealthData pushData healthData failed , upLoadFailCount = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget v2, p0, Lo/ctp;->c:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 189
    goto/16 :goto_0

    .line 192
    :cond_3
    const/4 v0, 0x1

    return v0

    .line 194
    :cond_4
    const/4 v0, 0x0

    return v0
.end method

.method private d(ILo/css;)V
    .locals 5

    .line 100
    :goto_0
    iget v0, p0, Lo/ctp;->c:I

    const/4 v1, 0x2

    if-ge v0, v1, :cond_2

    .line 101
    invoke-direct {p0, p1}, Lo/ctp;->b(I)Ljava/util/List;

    move-result-object v4

    .line 102
    const/4 v0, 0x0

    if-eq v0, v4, :cond_2

    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 103
    goto :goto_1

    .line 105
    :cond_0
    invoke-direct {p0, v4, p1, p2}, Lo/ctp;->c(Ljava/util/List;ILo/css;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 106
    goto :goto_1

    .line 108
    :cond_1
    invoke-direct {p0, v4}, Lo/ctp;->c(Ljava/util/List;)V

    .line 109
    goto :goto_0

    .line 110
    :cond_2
    :goto_1
    const/4 v0, 0x0

    iput v0, p0, Lo/ctp;->c:I

    .line 111
    const-string v0, "Debug_HiSyncHealthData"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "uploadSportData upLoadFailCount = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget v2, p0, Lo/ctp;->c:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 112
    return-void
.end method

.method private d(Ljava/util/List;)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;)V"
        }
    .end annotation

    .line 152
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 153
    :cond_0
    return-void

    .line 157
    :cond_1
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_0
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lcom/huawei/hihealth/HiHealthData;

    .line 158
    invoke-virtual {v11}, Lcom/huawei/hihealth/HiHealthData;->getDataID()J

    move-result-wide v8

    .line 159
    const-string v0, "modified_time"

    invoke-virtual {v11, v0}, Lcom/huawei/hihealth/HiHealthData;->getLong(Ljava/lang/String;)J

    move-result-wide v6

    .line 161
    iget-object v0, p0, Lo/ctp;->a:Lo/cqg;

    move-wide v1, v8

    move-wide v3, v6

    const/4 v5, 0x1

    invoke-virtual/range {v0 .. v5}, Lo/cqg;->a(JJI)I

    .line 162
    goto :goto_0

    .line 163
    :cond_2
    return-void
.end method

.method private e(ILo/css;)V
    .locals 5

    .line 84
    :goto_0
    iget v0, p0, Lo/ctp;->c:I

    const/4 v1, 0x2

    if-ge v0, v1, :cond_2

    .line 85
    invoke-direct {p0, p1}, Lo/ctp;->c(I)Ljava/util/List;

    move-result-object v4

    .line 86
    const/4 v0, 0x0

    if-eq v0, v4, :cond_2

    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 87
    goto :goto_1

    .line 89
    :cond_0
    invoke-direct {p0, v4, p1, p2}, Lo/ctp;->c(Ljava/util/List;ILo/css;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 90
    goto :goto_1

    .line 92
    :cond_1
    invoke-direct {p0, v4}, Lo/ctp;->d(Ljava/util/List;)V

    .line 93
    goto :goto_0

    .line 94
    :cond_2
    :goto_1
    const/4 v0, 0x0

    iput v0, p0, Lo/ctp;->c:I

    .line 95
    const-string v0, "Debug_HiSyncHealthData"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "uploadSportData upLoadFailCount = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget v2, p0, Lo/ctp;->c:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 96
    return-void
.end method


# virtual methods
.method public a(ILo/css;)V
    .locals 11

    .line 59
    const-string v0, "HiH_HiSyncHealthData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "pushData() begin !"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 60
    const/4 v0, 0x0

    iput v0, p0, Lo/ctp;->c:I

    .line 61
    invoke-static {}, Lo/csk;->e()Z

    move-result v0

    if-nez v0, :cond_0

    .line 62
    const-string v0, "Debug_HiSyncHealthData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "pushData() dataPrivacy switch is closed ,can not pushData right now ,push end !"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 63
    return-void

    .line 65
    :cond_0
    const-string v0, "SYNC_HEALTH_DATA_UPLOAD_PERCENT_MAX"

    const-wide/high16 v1, 0x4014000000000000L    # 5.0

    invoke-static {v1, v2, v0}, Lo/cuh;->a(DLjava/lang/String;)V

    .line 66
    sget-object v0, Lo/ctp;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/cpw;->e(Landroid/content/Context;)Lo/cpw;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/cpw;->a(I)Ljava/util/List;

    move-result-object v7

    .line 67
    const/4 v0, 0x0

    if-eq v0, v7, :cond_1

    invoke-interface {v7}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 68
    :cond_1
    const-string v0, "Debug_HiSyncHealthData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "pushData() end ! no client get, maybe no data need to pushData"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 69
    return-void

    .line 71
    :cond_2
    const-string v0, "HiH_HiSyncHealthData"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "clientid list size ="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 72
    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v8

    .line 73
    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_0
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Ljava/lang/Integer;

    .line 74
    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-direct {p0, v0, p2}, Lo/ctp;->e(ILo/css;)V

    .line 75
    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-direct {p0, v0, p2}, Lo/ctp;->d(ILo/css;)V

    .line 76
    goto :goto_0

    .line 77
    :cond_3
    sget-object v0, Lo/ctp;->e:Landroid/content/Context;

    int-to-double v1, v8

    const-wide/high16 v3, 0x3ff0000000000000L    # 1.0

    div-double/2addr v3, v1

    const-wide/high16 v1, 0x3ff0000000000000L    # 1.0

    const-wide/high16 v5, 0x4014000000000000L    # 5.0

    invoke-static/range {v0 .. v6}, Lo/cuh;->a(Landroid/content/Context;DDD)V

    .line 78
    sget-object v0, Lo/ctp;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/cuh;->b(Landroid/content/Context;)V

    .line 79
    const-string v0, "HiH_HiSyncHealthData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "pushData() end !"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 80
    return-void
.end method
