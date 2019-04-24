.class public Lo/exx;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/ejk;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private b(Lo/eic;)I
    .locals 2

    .line 214
    const v1, 0x9c42

    .line 215
    invoke-virtual {p1}, Lo/eic;->q()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 216
    invoke-virtual {p1}, Lo/eic;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 217
    const/4 v1, 0x1

    goto :goto_0

    .line 218
    :cond_0
    invoke-virtual {p1}, Lo/eic;->c()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 219
    const/4 v1, 0x2

    goto :goto_0

    .line 220
    :cond_1
    invoke-virtual {p1}, Lo/eic;->b()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 221
    const/4 v1, 0x3

    .line 224
    :cond_2
    :goto_0
    return v1
.end method

.method private d(JJILo/ekr;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JJILo/ekr<Ljava/util/Map<Ljava/lang/Long;Lo/ejp;>;>;)V"
        }
    .end annotation

    .line 75
    const-string v0, "UIHLH_SleepModuleChartStorageHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "startTime:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " ,endtime:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p3, p4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " ,dataType:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 76
    const/4 v4, 0x0

    .line 77
    const/4 v5, 0x1

    .line 79
    const/4 v0, 0x1

    if-ne p5, v0, :cond_0

    .line 80
    const/4 v4, 0x4

    goto :goto_0

    .line 81
    :cond_0
    const/4 v0, 0x2

    if-ne p5, v0, :cond_1

    .line 82
    const/4 v4, 0x3

    goto :goto_0

    .line 83
    :cond_1
    const/4 v0, 0x3

    if-ne p5, v0, :cond_2

    .line 84
    const/4 v4, 0x5

    .line 85
    const/4 v5, 0x3

    goto :goto_0

    .line 87
    :cond_2
    const/4 v4, 0x0

    .line 90
    :goto_0
    if-nez v4, :cond_3

    .line 91
    const/4 v0, -0x1

    const/4 v1, 0x0

    invoke-interface {p6, v0, v1}, Lo/ekr;->b(ILjava/lang/Object;)V

    .line 92
    return-void

    .line 95
    :cond_3
    const/16 v6, 0x11

    new-array v6, v6, [I

    fill-array-data v6, :array_0

    .line 114
    const/16 v0, 0x11

    new-array v7, v0, [Ljava/lang/String;

    const-string v0, "core_sleep_deep_key"

    const/4 v1, 0x0

    aput-object v0, v7, v1

    const-string v0, "core_sleep_light_key"

    const/4 v1, 0x1

    aput-object v0, v7, v1

    const-string v0, "core_sleep_wake_dream_key"

    const/4 v1, 0x2

    aput-object v0, v7, v1

    const-string v0, "core_sleep_wake_count_key"

    const/4 v1, 0x3

    aput-object v0, v7, v1

    const-string v0, "core_sleep_score_key"

    const/4 v1, 0x4

    aput-object v0, v7, v1

    const-string v0, "core_sleep_fall_key"

    const/4 v1, 0x5

    aput-object v0, v7, v1

    const-string v0, "core_sleep_wake_up_key"

    const/4 v1, 0x6

    aput-object v0, v7, v1

    const-string v0, "core_sleep_snore_freq_key"

    const/4 v1, 0x7

    aput-object v0, v7, v1

    const-string v0, "core_sleep_deep_sleep_part_key"

    const/16 v1, 0x8

    aput-object v0, v7, v1

    const-string v0, "core_sleep_total_sleep_time_key"

    const/16 v1, 0x9

    aput-object v0, v7, v1

    const-string v0, "core_sleep_day_sleep_time_key"

    const/16 v1, 0xa

    aput-object v0, v7, v1

    const-string v0, "sleep_deep_key"

    const/16 v1, 0xb

    aput-object v0, v7, v1

    const-string v0, "sleep_light_key"

    const/16 v1, 0xc

    aput-object v0, v7, v1

    const-string v0, "sleep_wake_key"

    const/16 v1, 0xd

    aput-object v0, v7, v1

    const-string v0, "core_sleep_wake_key"

    const/16 v1, 0xe

    aput-object v0, v7, v1

    const-string v0, "sleep_wake_count_key"

    const/16 v1, 0xf

    aput-object v0, v7, v1

    const-string v0, "core_sleep_valid_data_key"

    const/16 v1, 0x10

    aput-object v0, v7, v1

    .line 133
    new-instance v8, Lcom/huawei/hihealth/HiAggregateOption;

    invoke-direct {v8}, Lcom/huawei/hihealth/HiAggregateOption;-><init>()V

    .line 134
    invoke-virtual {v8, p1, p2}, Lcom/huawei/hihealth/HiAggregateOption;->setStartTime(J)V

    .line 135
    invoke-virtual {v8, p3, p4}, Lcom/huawei/hihealth/HiAggregateOption;->setEndTime(J)V

    .line 136
    invoke-virtual {v8, v5}, Lcom/huawei/hihealth/HiAggregateOption;->setAggregateType(I)V

    .line 137
    invoke-virtual {v8, v7}, Lcom/huawei/hihealth/HiAggregateOption;->setConstantsKey([Ljava/lang/String;)V

    .line 138
    invoke-virtual {v8, v6}, Lcom/huawei/hihealth/HiAggregateOption;->setType([I)V

    .line 139
    const/4 v0, 0x1

    invoke-virtual {v8, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setGroupUnitSize(I)V

    .line 140
    invoke-virtual {v8, v4}, Lcom/huawei/hihealth/HiAggregateOption;->setGroupUnitType(I)V

    .line 141
    const/4 v0, 0x0

    invoke-virtual {v8, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setReadType(I)V

    .line 145
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    new-instance v1, Lo/exx$1;

    invoke-direct {v1, p0, p6}, Lo/exx$1;-><init>(Lo/exx;Lo/ekr;)V

    invoke-interface {v0, v8, v1}, Lo/clt;->b(Lcom/huawei/hihealth/HiAggregateOption;Lo/cly;)V

    .line 206
    return-void

    :array_0
    .array-data 4
        0xac46
        0xac47
        0xac45
        0xac4b
        0xacab
        0xaca9
        0xacaa
        0xacb0
        0xac4a
        0xac49
        0xac4c
        0xabe1
        0xabe2
        0xabe3
        0xac48
        0xabe5
        0xacae
    .end array-data
.end method


# virtual methods
.method public d(Landroid/content/Context;JJLo/eic;Lo/ehe$a;Lo/ekr;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;JJLo/eic;Lo/ehe$a;Lo/ekr<Ljava/util/Map<Ljava/lang/Long;Lo/ejp;>;>;)V"
        }
    .end annotation

    .line 70
    invoke-direct {p0, p6}, Lo/exx;->b(Lo/eic;)I

    move-result v7

    .line 71
    move-object v0, p0

    move-wide v1, p2

    move-wide v3, p4

    move v5, v7

    move-object/from16 v6, p8

    invoke-direct/range {v0 .. v6}, Lo/exx;->d(JJILo/ekr;)V

    .line 72
    return-void
.end method
