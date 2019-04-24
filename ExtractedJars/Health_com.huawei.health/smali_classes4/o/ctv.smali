.class public Lo/ctv;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/ctv$a;
    }
.end annotation


# static fields
.field private static h:Landroid/content/Context;


# instance fields
.field private a:Z

.field private b:I

.field private c:Lo/cpw;

.field private d:Lo/czg;

.field private e:I

.field private final g:[Ljava/lang/String;

.field private final i:[I


# direct methods
.method private constructor <init>()V
    .locals 3

    .line 59
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    const/4 v0, 0x0

    iput v0, p0, Lo/ctv;->b:I

    .line 42
    const/4 v0, 0x0

    iput v0, p0, Lo/ctv;->e:I

    .line 45
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/ctv;->a:Z

    .line 47
    const/4 v0, 0x7

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    iput-object v0, p0, Lo/ctv;->i:[I

    .line 52
    const/4 v0, 0x7

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "stat_sleep_deep_duration"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "stat_sleep_shallow_duration"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, "stat_sleep_wake_duration"

    const/4 v2, 0x2

    aput-object v1, v0, v2

    const-string v1, "stat_sleep_wake_count"

    const/4 v2, 0x3

    aput-object v1, v0, v2

    const-string v1, "stat_sleep_duration_sum"

    const/4 v2, 0x4

    aput-object v1, v0, v2

    const-string v1, "stat_sleep_start_time"

    const/4 v2, 0x5

    aput-object v1, v0, v2

    const-string v1, "stat_sleep_end_time"

    const/4 v2, 0x6

    aput-object v1, v0, v2

    iput-object v0, p0, Lo/ctv;->g:[Ljava/lang/String;

    .line 60
    sget-object v0, Lo/ctv;->h:Landroid/content/Context;

    invoke-static {v0}, Lo/cpw;->e(Landroid/content/Context;)Lo/cpw;

    move-result-object v0

    iput-object v0, p0, Lo/ctv;->c:Lo/cpw;

    .line 61
    sget-object v0, Lo/ctv;->h:Landroid/content/Context;

    invoke-static {v0}, Lo/czg;->e(Landroid/content/Context;)Lo/czg;

    move-result-object v0

    iput-object v0, p0, Lo/ctv;->d:Lo/czg;

    .line 62
    return-void

    nop

    :array_0
    .array-data 4
        0xabe1
        0xabe2
        0xabe3
        0xabe5
        0xabe4
        0xabe6
        0xabe7
    .end array-data
.end method

.method synthetic constructor <init>(Lo/ctv$2;)V
    .locals 0

    .line 38
    invoke-direct {p0}, Lo/ctv;-><init>()V

    return-void
.end method

.method private a(ILcom/huawei/hihealth/HiSyncOption;)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ILcom/huawei/hihealth/HiSyncOption;)Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation

    .line 138
    iget-boolean v0, p0, Lo/ctv;->a:Z

    if-nez v0, :cond_0

    .line 139
    sget-object v0, Lo/ctv;->h:Landroid/content/Context;

    move v1, p1

    invoke-static {}, Lo/cmk;->c()[I

    move-result-object v2

    .line 140
    invoke-static {}, Lo/clv;->a()[Ljava/lang/String;

    move-result-object v3

    .line 139
    const/16 v4, 0x32

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Lo/cui;->c(Landroid/content/Context;I[I[Ljava/lang/String;II)Ljava/util/List;

    move-result-object v0

    return-object v0

    .line 142
    :cond_0
    sget-object v0, Lo/ctv;->h:Landroid/content/Context;

    move v1, p1

    invoke-static {}, Lo/cmk;->c()[I

    move-result-object v2

    .line 143
    invoke-static {}, Lo/clv;->a()[Ljava/lang/String;

    move-result-object v3

    .line 142
    const/16 v4, 0x32

    const/4 v5, 0x1

    invoke-static/range {v0 .. v5}, Lo/cui;->c(Landroid/content/Context;I[I[Ljava/lang/String;II)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public static a(Landroid/content/Context;)Lo/ctv;
    .locals 1
    .param p0    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 72
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    sput-object v0, Lo/ctv;->h:Landroid/content/Context;

    .line 73
    sget-object v0, Lo/ctv$a;->a:Lo/ctv;

    return-object v0
.end method

.method private a(ILcom/huawei/hihealth/HiSyncOption;Lo/csr;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 125
    :goto_0
    iget v0, p0, Lo/ctv;->b:I

    const/4 v1, 0x2

    if-ge v0, v1, :cond_2

    .line 126
    invoke-direct {p0, p1, p2}, Lo/ctv;->a(ILcom/huawei/hihealth/HiSyncOption;)Ljava/util/List;

    move-result-object v2

    .line 127
    const/4 v0, 0x0

    if-eq v0, v2, :cond_2

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 128
    goto :goto_1

    .line 130
    :cond_0
    invoke-direct {p0, v2, p2, p3}, Lo/ctv;->d(Ljava/util/List;Lcom/huawei/hihealth/HiSyncOption;Lo/csr;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 131
    sget-object v0, Lo/ctv;->h:Landroid/content/Context;

    invoke-static {}, Lo/cmk;->c()[I

    move-result-object v1

    invoke-static {v0, v2, v1, p1}, Lo/cui;->d(Landroid/content/Context;Ljava/util/List;[II)V

    .line 133
    :cond_1
    goto :goto_0

    .line 134
    :cond_2
    :goto_1
    const/4 v0, 0x0

    iput v0, p0, Lo/ctv;->b:I

    .line 135
    return-void
.end method

.method private d(Ljava/util/List;Lcom/huawei/hihealth/HiSyncOption;Lo/csr;)Z
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;Lcom/huawei/hihealth/HiSyncOption;Lo/csr;)Z"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 181
    iget-boolean v0, p0, Lo/ctv;->a:Z

    if-nez v0, :cond_0

    .line 182
    iget v0, p0, Lo/ctv;->e:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/ctv;->e:I

    invoke-virtual {p2}, Lcom/huawei/hihealth/HiSyncOption;->getSyncAction()I

    move-result v1

    invoke-static {v0, v1}, Lo/cui;->a(II)V

    goto :goto_0

    .line 184
    :cond_0
    iget v0, p0, Lo/ctv;->e:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/ctv;->e:I

    const/4 v1, 0x3

    if-ge v1, v0, :cond_1

    .line 185
    iget v0, p0, Lo/ctv;->b:I

    add-int/lit8 v0, v0, 0x2

    iput v0, p0, Lo/ctv;->b:I

    .line 186
    const/4 v0, 0x0

    return v0

    .line 189
    :cond_1
    :goto_0
    invoke-virtual {p3, p1}, Lo/csr;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object v4

    .line 190
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 191
    iget v0, p0, Lo/ctv;->b:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/ctv;->b:I

    .line 192
    const/4 v0, 0x0

    return v0

    .line 194
    :cond_2
    new-instance v5, Lcom/huawei/hwcloudmodel/model/unite/AddHealthStatReq;

    invoke-direct {v5}, Lcom/huawei/hwcloudmodel/model/unite/AddHealthStatReq;-><init>()V

    .line 195
    invoke-virtual {v5, v4}, Lcom/huawei/hwcloudmodel/model/unite/AddHealthStatReq;->setProfessionalSleepTotal(Ljava/util/List;)V

    .line 196
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/HiHealthData;

    invoke-virtual {v0}, Lcom/huawei/hihealth/HiHealthData;->getTimeZone()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/hwcloudmodel/model/unite/AddHealthStatReq;->setTimeZone(Ljava/lang/String;)V

    .line 197
    :goto_1
    iget v0, p0, Lo/ctv;->b:I

    const/4 v1, 0x2

    if-ge v0, v1, :cond_4

    .line 198
    iget-object v0, p0, Lo/ctv;->d:Lo/czg;

    invoke-virtual {v0, v5}, Lo/czg;->a(Lcom/huawei/hwcloudmodel/model/unite/AddHealthStatReq;)Lcom/huawei/hwcloudmodel/model/unite/AddHealthStatRsp;

    move-result-object v6

    .line 200
    const/4 v0, 0x0

    invoke-static {v6, v0}, Lo/csn;->e(Lcom/huawei/hwcloudmodel/model/CloudCommonReponse;Z)Z

    move-result v0

    if-nez v0, :cond_3

    .line 201
    iget v0, p0, Lo/ctv;->b:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/ctv;->b:I

    .line 202
    goto :goto_1

    .line 204
    :cond_3
    const-string v0, "Debug_HiSyncSleepStat"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "addCoreSleepStat success ! uploadCount is ,"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget v2, p0, Lo/ctv;->e:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ",stat is "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v4}, Lo/cnj;->d(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 205
    const/4 v0, 0x1

    return v0

    .line 207
    :cond_4
    const-string v0, "Debug_HiSyncSleepStat"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "addCoreSleepStat failed ! uploadCount is ,"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget v2, p0, Lo/ctv;->e:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ",stat is "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v4}, Lo/cnj;->d(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 208
    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method public a(I)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation

    .line 212
    iget-object v0, p0, Lo/ctv;->c:Lo/cpw;

    invoke-virtual {v0, p1}, Lo/cpw;->b(I)I

    move-result v1

    .line 213
    sget-object v0, Lo/ctv;->h:Landroid/content/Context;

    invoke-static {v0, v1}, Lo/cui;->d(Landroid/content/Context;I)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public d(ILcom/huawei/hihealth/HiSyncOption;Lo/csx;Lo/csr;)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 78
    const-string v0, "Debug_HiSyncSleepStat"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "pushData() begin!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 79
    const/4 v0, 0x0

    iput v0, p0, Lo/ctv;->b:I

    .line 80
    const/4 v0, 0x0

    iput v0, p0, Lo/ctv;->e:I

    .line 81
    invoke-static {}, Lo/cui;->d()Z

    move-result v0

    iput-boolean v0, p0, Lo/ctv;->a:Z

    .line 82
    invoke-static {}, Lo/csk;->e()Z

    move-result v0

    if-nez v0, :cond_0

    .line 83
    const-string v0, "Debug_HiSyncSleepStat"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "pushData() healthDataPrivacy switch is closed ,can not pushData right now ,push end!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 84
    return-void

    .line 86
    :cond_0
    iget-object v0, p0, Lo/ctv;->c:Lo/cpw;

    invoke-virtual {v0, p1}, Lo/cpw;->b(I)I

    move-result v4

    .line 87
    if-gtz v4, :cond_1

    .line 88
    const-string v0, "Debug_HiSyncSleepStat"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "pushData() no statClient get, maybe no data need to push ,push end !"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 91
    :cond_1
    iget-boolean v0, p0, Lo/ctv;->a:Z

    if-eqz v0, :cond_2

    .line 92
    const/4 v0, 0x0

    iput v0, p0, Lo/ctv;->e:I

    .line 94
    :cond_2
    invoke-direct {p0, v4, p2, p4}, Lo/ctv;->a(ILcom/huawei/hihealth/HiSyncOption;Lo/csr;)V

    .line 96
    :goto_0
    const-string v0, "Debug_HiSyncSleepStat"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "pushData() end !"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 97
    return-void
.end method
