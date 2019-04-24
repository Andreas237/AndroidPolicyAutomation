.class public Lo/dbz;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static c:Lo/dbz;


# instance fields
.field a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation
.end field

.field b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 34
    const/4 v0, 0x0

    sput-object v0, Lo/dbz;->c:Lo/dbz;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 45
    return-void
.end method

.method private a(Ljava/util/List;I)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/yn;>;I)V"
        }
    .end annotation

    .line 75
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-ne p2, v0, :cond_3

    .line 76
    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/yn;

    invoke-virtual {v0}, Lo/yn;->f()F

    move-result v0

    const/high16 v1, 0x3f800000    # 1.0f

    cmpl-float v0, v0, v1

    if-nez v0, :cond_0

    .line 77
    const-string v0, "CoreSleepMgrStorage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "not validData"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_1

    .line 79
    :cond_0
    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/yn;

    invoke-virtual {v0}, Lo/yn;->e()I

    move-result v4

    .line 80
    const-string v0, "CoreSleepMgrStorage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "dailySleepScore :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 81
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    .line 82
    const-string v0, "CoreSleepMgrStorage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "current time :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 83
    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/yn;

    invoke-virtual {v0}, Lo/yn;->d()J

    move-result-wide v0

    sub-long v0, v5, v0

    const-wide/32 v2, 0x5265c00

    cmp-long v0, v0, v2

    if-lez v0, :cond_1

    const/4 v7, 0x0

    goto :goto_0

    :cond_1
    const/4 v7, 0x1

    .line 84
    :goto_0
    const-string v0, "CoreSleepMgrStorage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "is today :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 86
    if-eqz v7, :cond_2

    if-ltz v4, :cond_2

    const/16 v0, 0x64

    if-gt v4, v0, :cond_2

    .line 87
    new-instance v8, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;

    invoke-direct {v8}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;-><init>()V

    .line 88
    const/4 v0, 0x7

    invoke-virtual {v8, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setServiceID(I)V

    .line 89
    const/16 v0, 0x19

    invoke-virtual {v8, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setCommandID(I)V

    .line 90
    const-string v9, ""

    .line 91
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 92
    invoke-static {v4}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    .line 93
    invoke-static {v9}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v10

    .line 94
    array-length v0, v10

    invoke-virtual {v8, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setDataLen(I)V

    .line 95
    invoke-virtual {v8, v10}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setDataContent([B)V

    .line 96
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dde;->d(Landroid/content/Context;)Lo/dde;

    move-result-object v0

    .line 97
    invoke-virtual {v0, v8}, Lo/dde;->b(Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;)V

    .line 98
    goto :goto_1

    .line 100
    :cond_2
    const-string v0, "CoreSleepMgrStorage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "coreSleepScore is error! "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 104
    :cond_3
    :goto_1
    return-void
.end method

.method private a(Lo/dca;Lo/yn;)V
    .locals 3

    .line 153
    new-instance v2, Lcom/huawei/hihealth/HiHealthData;

    invoke-direct {v2}, Lcom/huawei/hihealth/HiHealthData;-><init>()V

    .line 154
    const v0, 0xacad

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/HiHealthData;->setType(I)V

    .line 155
    invoke-static {}, Lo/fju;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/HiHealthData;->setDeviceUUID(Ljava/lang/String;)V

    .line 156
    invoke-virtual {p2}, Lo/yn;->c()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/cnk;->h(J)J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setStartTime(J)V

    .line 157
    invoke-virtual {p2}, Lo/yn;->c()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/cnk;->h(J)J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setEndTime(J)V

    .line 158
    invoke-virtual {p2}, Lo/yn;->h()J

    move-result-wide v0

    long-to-double v0, v0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setValue(D)V

    .line 159
    iget-object v0, p0, Lo/dbz;->a:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 161
    return-void
.end method

.method public static b()Lo/dbz;
    .locals 4

    .line 37
    const-string v0, "CoreSleepMgrStorage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "get instance"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 38
    sget-object v0, Lo/dbz;->c:Lo/dbz;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 39
    new-instance v0, Lo/dbz;

    invoke-direct {v0}, Lo/dbz;-><init>()V

    sput-object v0, Lo/dbz;->c:Lo/dbz;

    .line 41
    :cond_0
    sget-object v0, Lo/dbz;->c:Lo/dbz;

    return-object v0
.end method

.method private b(Lo/dca;Ljava/util/List;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/dca;Ljava/util/List<Lo/yn;>;)V"
        }
    .end annotation

    .line 49
    const-string v0, "CoreSleepMgrStorage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveTotalSleepCalcFrame"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 50
    const/4 v0, 0x0

    if-eq v0, p2, :cond_0

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 51
    :cond_0
    const-string v0, "CoreSleepMgrStorage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "currCalcFrameList size = 0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 52
    return-void

    .line 55
    :cond_1
    const/4 v4, 0x0

    :goto_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    if-ge v4, v0, :cond_2

    .line 62
    invoke-interface {p2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/yn;

    invoke-direct {p0, p1, v0}, Lo/dbz;->c(Lo/dca;Lo/yn;)V

    .line 64
    invoke-direct {p0, p2, v4}, Lo/dbz;->a(Ljava/util/List;I)V

    .line 55
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 67
    :cond_2
    return-void
.end method

.method private b(Lo/dca;Lo/yn;)V
    .locals 3

    .line 144
    new-instance v2, Lcom/huawei/hihealth/HiHealthData;

    invoke-direct {v2}, Lcom/huawei/hihealth/HiHealthData;-><init>()V

    .line 145
    const v0, 0xaca9

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/HiHealthData;->setType(I)V

    .line 146
    invoke-static {}, Lo/fju;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/HiHealthData;->setDeviceUUID(Ljava/lang/String;)V

    .line 147
    invoke-virtual {p2}, Lo/yn;->c()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/cnk;->h(J)J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setStartTime(J)V

    .line 148
    invoke-virtual {p2}, Lo/yn;->c()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/cnk;->h(J)J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setEndTime(J)V

    .line 149
    invoke-virtual {p2}, Lo/yn;->b()J

    move-result-wide v0

    long-to-double v0, v0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setValue(D)V

    .line 150
    iget-object v0, p0, Lo/dbz;->a:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 151
    return-void
.end method

.method private c(Lo/dca;Lo/yl;)V
    .locals 10

    .line 286
    const-string v0, "CoreSleepMgrStorage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveStatusFrame"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 287
    invoke-virtual {p2}, Lo/yl;->c()Ljava/util/ArrayList;

    move-result-object v5

    .line 288
    const-string v0, "CoreSleepMgrStorage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "list size = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 289
    invoke-virtual {p2}, Lo/yl;->a()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/cnk;->h(J)J

    move-result-wide v6

    .line 290
    const-string v0, "CoreSleepMgrStorage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "start time = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "  ---end time = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p2}, Lo/yl;->e()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 291
    const/4 v8, 0x0

    :goto_0
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    if-ge v8, v0, :cond_1

    .line 292
    invoke-virtual {p2}, Lo/yl;->e()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/cnk;->h(J)J

    move-result-wide v0

    cmp-long v0, v6, v0

    if-gez v0, :cond_0

    .line 293
    new-instance v9, Lcom/huawei/hihealth/HiHealthData;

    invoke-interface {v5, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-direct {p0, v0}, Lo/dbz;->e(I)I

    move-result v0

    invoke-direct {v9, v0}, Lcom/huawei/hihealth/HiHealthData;-><init>(I)V

    .line 294
    const-wide/32 v0, 0xea60

    add-long/2addr v0, v6

    invoke-virtual {v9, v6, v7, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setTimeInterval(JJ)V

    .line 295
    invoke-static {}, Lo/fju;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Lcom/huawei/hihealth/HiHealthData;->setDeviceUUID(Ljava/lang/String;)V

    .line 296
    iget-object v0, p0, Lo/dbz;->b:Ljava/util/List;

    invoke-interface {v0, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 297
    const-wide/32 v0, 0xea60

    add-long/2addr v6, v0

    .line 291
    :cond_0
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    .line 300
    :cond_1
    return-void
.end method

.method private c(Lo/dca;Lo/yn;)V
    .locals 5

    .line 109
    const-string v0, "CoreSleepMgrStorage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveSleepCalcFrame"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 112
    invoke-virtual {p2}, Lo/yn;->f()F

    move-result v4

    .line 113
    const/high16 v0, 0x3f800000    # 1.0f

    cmpl-float v0, v4, v0

    if-nez v0, :cond_0

    .line 115
    invoke-direct {p0, p1, p2}, Lo/dbz;->b(Lo/dca;Lo/yn;)V

    .line 116
    invoke-direct {p0, p1, p2}, Lo/dbz;->i(Lo/dca;Lo/yn;)V

    .line 117
    invoke-direct {p0, p1, p2}, Lo/dbz;->g(Lo/dca;Lo/yn;)V

    .line 118
    return-void

    .line 120
    :cond_0
    invoke-direct {p0, p1, p2}, Lo/dbz;->b(Lo/dca;Lo/yn;)V

    .line 121
    invoke-direct {p0, p1, p2}, Lo/dbz;->a(Lo/dca;Lo/yn;)V

    .line 122
    invoke-direct {p0, p1, p2}, Lo/dbz;->d(Lo/dca;Lo/yn;)V

    .line 123
    invoke-direct {p0, p1, p2}, Lo/dbz;->e(Lo/dca;Lo/yn;)V

    .line 124
    invoke-direct {p0, p1, p2}, Lo/dbz;->h(Lo/dca;Lo/yn;)V

    .line 125
    invoke-direct {p0, p1, p2}, Lo/dbz;->k(Lo/dca;Lo/yn;)V

    .line 126
    invoke-direct {p0, p1, p2}, Lo/dbz;->g(Lo/dca;Lo/yn;)V

    .line 127
    invoke-direct {p0, p1, p2}, Lo/dbz;->i(Lo/dca;Lo/yn;)V

    .line 128
    invoke-direct {p0, p1, p2}, Lo/dbz;->f(Lo/dca;Lo/yn;)V

    .line 130
    return-void
.end method

.method private d(Lo/dca;)V
    .locals 5

    .line 491
    const-string v0, "CoreSleepMgrStorage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "saveCoreSleepDataToHiHealth enter statusFrameList"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/dbz;->b:Ljava/util/List;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 492
    new-instance v4, Lcom/huawei/hihealth/HiDataInsertOption;

    invoke-direct {v4}, Lcom/huawei/hihealth/HiDataInsertOption;-><init>()V

    .line 493
    iget-object v0, p0, Lo/dbz;->b:Ljava/util/List;

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiDataInsertOption;->setDatas(Ljava/util/List;)V

    .line 494
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    new-instance v1, Lo/dbz$5;

    invoke-direct {v1, p0, p1}, Lo/dbz$5;-><init>(Lo/dbz;Lo/dca;)V

    invoke-interface {v0, v4, v1}, Lo/clt;->c(Lcom/huawei/hihealth/HiDataInsertOption;Lo/cma;)V

    .line 508
    return-void
.end method

.method private d(Lo/dca;Lo/yn;)V
    .locals 3

    .line 134
    new-instance v2, Lcom/huawei/hihealth/HiHealthData;

    invoke-direct {v2}, Lcom/huawei/hihealth/HiHealthData;-><init>()V

    .line 135
    const v0, 0xacaf

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/HiHealthData;->setType(I)V

    .line 136
    invoke-static {}, Lo/fju;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/HiHealthData;->setDeviceUUID(Ljava/lang/String;)V

    .line 137
    invoke-virtual {p2}, Lo/yn;->c()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/cnk;->h(J)J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setStartTime(J)V

    .line 138
    invoke-virtual {p2}, Lo/yn;->c()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/cnk;->h(J)J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setEndTime(J)V

    .line 139
    invoke-virtual {p2}, Lo/yn;->i()I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/HiHealthData;->setValue(I)V

    .line 140
    iget-object v0, p0, Lo/dbz;->a:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 142
    return-void
.end method

.method private e(I)I
    .locals 2

    .line 303
    const/4 v1, 0x0

    .line 304
    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 306
    :pswitch_0
    const/16 v1, 0x5655

    .line 307
    goto :goto_0

    .line 309
    :pswitch_1
    const/16 v1, 0x5656

    .line 310
    goto :goto_0

    .line 312
    :pswitch_2
    const/16 v1, 0x5657

    .line 313
    goto :goto_0

    .line 315
    :pswitch_3
    const/16 v1, 0x5658

    .line 316
    goto :goto_0

    .line 318
    :pswitch_4
    const/16 v1, 0x5659

    .line 319
    .line 323
    :goto_0
    return v1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
    .end packed-switch
.end method

.method private e(Lo/dca;)V
    .locals 5

    .line 511
    const-string v0, "CoreSleepMgrStorage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "saveCoreSleepDataToHiHealth enter calcFrameList"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/dbz;->a:Ljava/util/List;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 512
    new-instance v4, Lcom/huawei/hihealth/HiDataInsertOption;

    invoke-direct {v4}, Lcom/huawei/hihealth/HiDataInsertOption;-><init>()V

    .line 513
    iget-object v0, p0, Lo/dbz;->a:Ljava/util/List;

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiDataInsertOption;->setDatas(Ljava/util/List;)V

    .line 514
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    new-instance v1, Lo/dbz$3;

    invoke-direct {v1, p0}, Lo/dbz$3;-><init>(Lo/dbz;)V

    invoke-interface {v0, v4, v1}, Lo/clt;->c(Lcom/huawei/hihealth/HiDataInsertOption;Lo/cma;)V

    .line 527
    return-void
.end method

.method private e(Lo/dca;Lo/yn;)V
    .locals 3

    .line 163
    new-instance v2, Lcom/huawei/hihealth/HiHealthData;

    invoke-direct {v2}, Lcom/huawei/hihealth/HiHealthData;-><init>()V

    .line 164
    const v0, 0xacac

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/HiHealthData;->setType(I)V

    .line 165
    invoke-static {}, Lo/fju;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/HiHealthData;->setDeviceUUID(Ljava/lang/String;)V

    .line 166
    invoke-virtual {p2}, Lo/yn;->c()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/cnk;->h(J)J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setStartTime(J)V

    .line 167
    invoke-virtual {p2}, Lo/yn;->c()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/cnk;->h(J)J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setEndTime(J)V

    .line 168
    invoke-virtual {p2}, Lo/yn;->a()I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/HiHealthData;->setValue(I)V

    .line 169
    iget-object v0, p0, Lo/dbz;->a:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 171
    return-void
.end method

.method private f(Lo/dca;Lo/yn;)V
    .locals 5

    .line 213
    const-string v0, "CoreSleepMgrStorage"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updateDeepPartCount:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p2}, Lo/yn;->k()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 214
    new-instance v4, Lcom/huawei/hihealth/HiHealthData;

    invoke-direct {v4}, Lcom/huawei/hihealth/HiHealthData;-><init>()V

    .line 215
    const v0, 0xac4a

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiHealthData;->setType(I)V

    .line 216
    invoke-static {}, Lo/fju;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiHealthData;->setDeviceUUID(Ljava/lang/String;)V

    .line 217
    invoke-virtual {p2}, Lo/yn;->c()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/cnk;->h(J)J

    move-result-wide v0

    invoke-virtual {v4, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setStartTime(J)V

    .line 218
    invoke-virtual {p2}, Lo/yn;->c()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/cnk;->h(J)J

    move-result-wide v0

    invoke-virtual {v4, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setEndTime(J)V

    .line 219
    invoke-virtual {p2}, Lo/yn;->k()I

    move-result v0

    int-to-double v0, v0

    invoke-virtual {v4, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setValue(D)V

    .line 220
    iget-object v0, p0, Lo/dbz;->a:Ljava/util/List;

    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 221
    return-void
.end method

.method private g(Lo/dca;Lo/yn;)V
    .locals 3

    .line 194
    new-instance v2, Lcom/huawei/hihealth/HiHealthData;

    invoke-direct {v2}, Lcom/huawei/hihealth/HiHealthData;-><init>()V

    .line 195
    const v0, 0xacae

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/HiHealthData;->setType(I)V

    .line 196
    invoke-static {}, Lo/fju;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/HiHealthData;->setDeviceUUID(Ljava/lang/String;)V

    .line 197
    invoke-virtual {p2}, Lo/yn;->c()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/cnk;->h(J)J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setStartTime(J)V

    .line 198
    invoke-virtual {p2}, Lo/yn;->c()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/cnk;->h(J)J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setEndTime(J)V

    .line 199
    invoke-virtual {p2}, Lo/yn;->f()F

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/HiHealthData;->setValue(F)V

    .line 200
    iget-object v0, p0, Lo/dbz;->a:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 202
    return-void
.end method

.method private h(Lo/dca;Lo/yn;)V
    .locals 5

    .line 173
    new-instance v4, Lcom/huawei/hihealth/HiHealthData;

    invoke-direct {v4}, Lcom/huawei/hihealth/HiHealthData;-><init>()V

    .line 174
    const v0, 0xacab

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiHealthData;->setType(I)V

    .line 175
    invoke-static {}, Lo/fju;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiHealthData;->setDeviceUUID(Ljava/lang/String;)V

    .line 176
    invoke-virtual {p2}, Lo/yn;->c()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/cnk;->h(J)J

    move-result-wide v0

    invoke-virtual {v4, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setStartTime(J)V

    .line 177
    invoke-virtual {p2}, Lo/yn;->c()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/cnk;->h(J)J

    move-result-wide v0

    invoke-virtual {v4, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setEndTime(J)V

    .line 178
    invoke-virtual {p2}, Lo/yn;->e()I

    move-result v0

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiHealthData;->setValue(I)V

    .line 179
    const-string v0, "CoreSleepMgrStorage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "updateSleepScore, score:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p2}, Lo/yn;->e()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 180
    iget-object v0, p0, Lo/dbz;->a:Ljava/util/List;

    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 182
    return-void
.end method

.method private i(Lo/dca;Lo/yn;)V
    .locals 3

    .line 204
    new-instance v2, Lcom/huawei/hihealth/HiHealthData;

    invoke-direct {v2}, Lcom/huawei/hihealth/HiHealthData;-><init>()V

    .line 205
    const v0, 0xacaa

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/HiHealthData;->setType(I)V

    .line 206
    invoke-static {}, Lo/fju;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/HiHealthData;->setDeviceUUID(Ljava/lang/String;)V

    .line 207
    invoke-virtual {p2}, Lo/yn;->c()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/cnk;->h(J)J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setStartTime(J)V

    .line 208
    invoke-virtual {p2}, Lo/yn;->c()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/cnk;->h(J)J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setEndTime(J)V

    .line 209
    invoke-virtual {p2}, Lo/yn;->d()J

    move-result-wide v0

    long-to-double v0, v0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setValue(D)V

    .line 210
    iget-object v0, p0, Lo/dbz;->a:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 211
    return-void
.end method

.method private k(Lo/dca;Lo/yn;)V
    .locals 3

    .line 184
    new-instance v2, Lcom/huawei/hihealth/HiHealthData;

    invoke-direct {v2}, Lcom/huawei/hihealth/HiHealthData;-><init>()V

    .line 185
    const v0, 0xacb0

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/HiHealthData;->setType(I)V

    .line 186
    invoke-static {}, Lo/fju;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/HiHealthData;->setDeviceUUID(Ljava/lang/String;)V

    .line 187
    invoke-virtual {p2}, Lo/yn;->c()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/cnk;->h(J)J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setStartTime(J)V

    .line 188
    invoke-virtual {p2}, Lo/yn;->c()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/cnk;->h(J)J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setEndTime(J)V

    .line 189
    invoke-virtual {p2}, Lo/yn;->g()I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/HiHealthData;->setValue(I)V

    .line 190
    iget-object v0, p0, Lo/dbz;->a:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 192
    return-void
.end method


# virtual methods
.method a()V
    .locals 1

    .line 475
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/dbz;->a:Ljava/util/List;

    .line 476
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/dbz;->b:Ljava/util/List;

    .line 477
    return-void
.end method

.method public a(Lo/dca;Ljava/util/List;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/dca;Ljava/util/List<Lo/yl;>;)V"
        }
    .end annotation

    .line 275
    const-string v0, "CoreSleepMgrStorage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveSleepStatusFrameList"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 276
    const/4 v0, 0x0

    if-eq v0, p2, :cond_0

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 277
    :cond_0
    const-string v0, "CoreSleepMgrStorage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "sleepStatusFrameList size = 0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 278
    return-void

    .line 280
    :cond_1
    const/4 v4, 0x0

    :goto_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    if-ge v4, v0, :cond_2

    .line 281
    invoke-interface {p2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/yl;

    invoke-direct {p0, p1, v0}, Lo/dbz;->c(Lo/dca;Lo/yl;)V

    .line 280
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 283
    :cond_2
    return-void
.end method

.method public b(Lo/dca;)V
    .locals 4

    .line 485
    const-string v0, "CoreSleepMgrStorage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "saveCoreSleepDataToHiHealth enter calcFrameList.size:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/dbz;->a:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " statusFrameList.size:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/dbz;->b:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 486
    invoke-direct {p0, p1}, Lo/dbz;->e(Lo/dca;)V

    .line 487
    invoke-direct {p0, p1}, Lo/dbz;->d(Lo/dca;)V

    .line 488
    return-void
.end method

.method public b(Ljava/util/List;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/yl;>;)Z"
        }
    .end annotation

    .line 530
    const/4 v2, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-ge v2, v0, :cond_1

    .line 531
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/yl;

    invoke-virtual {v0}, Lo/yl;->c()Ljava/util/ArrayList;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/4 v1, 0x5

    if-eq v0, v1, :cond_0

    .line 532
    const/4 v0, 0x1

    return v0

    .line 530
    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 535
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public e(Lo/dca;Ljava/util/List;Ljava/util/List;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/dca;Ljava/util/List<Lo/yn;>;Ljava/util/List<Lo/yl;>;)V"
        }
    .end annotation

    .line 414
    const/4 v0, 0x0

    if-eq v0, p3, :cond_0

    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 415
    :cond_0
    const-string v0, "CoreSleepMgrStorage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "sleepStatusFrameList.size() = 0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 416
    invoke-virtual {p1}, Lo/dca;->c()V

    .line 417
    return-void

    .line 419
    :cond_1
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 420
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 421
    const/4 v0, 0x0

    if-eq v0, p2, :cond_2

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_5

    .line 422
    :cond_2
    invoke-virtual {p0, p3}, Lo/dbz;->b(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 423
    const-string v0, "CoreSleepMgrStorage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mSleepCalcFramesList size = 0, Has Night Sleep, Can not save sleep data"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 424
    invoke-virtual {p1}, Lo/dca;->c()V

    .line 425
    return-void

    .line 427
    :cond_3
    const/4 v6, 0x0

    :goto_0
    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result v0

    if-ge v6, v0, :cond_4

    .line 428
    invoke-interface {p3, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 427
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 430
    :cond_4
    const-string v0, "CoreSleepMgrStorage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mSleepCalcFramesList size = 0, No Night Sleep, Only save  noon sleep data"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_3

    .line 433
    :cond_5
    const/4 v6, 0x0

    :goto_1
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    if-ge v6, v0, :cond_6

    .line 434
    invoke-interface {p2, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v5, v6, v0}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 433
    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    .line 436
    :cond_6
    const/4 v6, 0x0

    :goto_2
    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result v0

    if-ge v6, v0, :cond_7

    .line 437
    invoke-interface {p3, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v4, v6, v0}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 436
    add-int/lit8 v6, v6, 0x1

    goto :goto_2

    .line 439
    :cond_7
    const-string v0, "CoreSleepMgrStorage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "sleepCalcFrameList size > 0, sleepStatusFrameList size > 0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 444
    :goto_3
    invoke-virtual {p0}, Lo/dbz;->a()V

    .line 463
    invoke-virtual {p0, p1, v4}, Lo/dbz;->a(Lo/dca;Ljava/util/List;)V

    .line 464
    invoke-direct {p0, p1, v5}, Lo/dbz;->b(Lo/dca;Ljava/util/List;)V

    .line 465
    invoke-virtual {p0, p1}, Lo/dbz;->b(Lo/dca;)V

    .line 466
    return-void
.end method
