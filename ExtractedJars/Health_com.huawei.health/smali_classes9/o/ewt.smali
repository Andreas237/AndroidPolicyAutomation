.class public Lo/ewt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final b:Ljava/lang/Object;

.field private static c:Lo/ewt;


# instance fields
.field private e:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 24
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lo/ewt;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lo/ewt;->e:Landroid/content/Context;

    .line 29
    return-void
.end method

.method public static c()Lo/ewt;
    .locals 4

    .line 33
    sget-object v2, Lo/ewt;->b:Ljava/lang/Object;

    monitor-enter v2

    .line 34
    :try_start_0
    sget-object v0, Lo/ewt;->c:Lo/ewt;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 35
    new-instance v0, Lo/ewt;

    invoke-direct {v0}, Lo/ewt;-><init>()V

    sput-object v0, Lo/ewt;->c:Lo/ewt;

    .line 37
    :cond_0
    sget-object v0, Lo/ewt;->c:Lo/ewt;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    return-object v0

    .line 38
    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3
.end method

.method static synthetic d(Lo/ewt;Ljava/util/List;Ljava/util/ArrayList;[Ljava/lang/String;)V
    .locals 0

    .line 21
    invoke-direct {p0, p1, p2, p3}, Lo/ewt;->e(Ljava/util/List;Ljava/util/ArrayList;[Ljava/lang/String;)V

    return-void
.end method

.method private e(Ljava/util/List;Ljava/util/ArrayList;[Ljava/lang/String;)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;Ljava/util/ArrayList<Lo/ews;>;[Ljava/lang/String;)V"
        }
    .end annotation

    .line 108
    new-instance v1, Lo/ews;

    invoke-direct {v1}, Lo/ews;-><init>()V

    .line 109
    const/4 v2, 0x0

    .line 110
    const/4 v3, 0x0

    .line 111
    const/4 v4, 0x0

    .line 112
    const/4 v5, 0x0

    .line 113
    const/4 v6, 0x0

    .line 114
    const/4 v7, 0x0

    .line 115
    const/4 v8, 0x0

    .line 116
    const/4 v9, 0x0

    .line 117
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_0
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lcom/huawei/hihealth/HiHealthData;

    .line 118
    const/4 v0, 0x0

    aget-object v0, p3, v0

    invoke-virtual {v11, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v0

    add-int/2addr v2, v0

    .line 119
    const/4 v0, 0x1

    aget-object v0, p3, v0

    invoke-virtual {v11, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v0

    add-int/2addr v3, v0

    .line 120
    const/4 v0, 0x2

    aget-object v0, p3, v0

    invoke-virtual {v11, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v0

    add-int/2addr v4, v0

    .line 121
    const/4 v0, 0x3

    aget-object v0, p3, v0

    invoke-virtual {v11, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v0

    add-int/2addr v5, v0

    .line 122
    const/4 v0, 0x4

    aget-object v0, p3, v0

    invoke-virtual {v11, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v0

    add-int/2addr v6, v0

    .line 123
    const/4 v0, 0x5

    aget-object v0, p3, v0

    invoke-virtual {v11, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v0

    add-int/2addr v8, v0

    .line 124
    const/4 v0, 0x6

    aget-object v0, p3, v0

    invoke-virtual {v11, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v0

    add-int/2addr v7, v0

    .line 125
    const/4 v0, 0x7

    aget-object v0, p3, v0

    invoke-virtual {v11, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v0

    add-int/2addr v9, v0

    .line 126
    goto :goto_0

    .line 127
    :cond_0
    invoke-virtual {v1, v2}, Lo/ews;->b(I)V

    .line 128
    invoke-virtual {v1, v3}, Lo/ews;->e(I)V

    .line 129
    invoke-virtual {v1, v4}, Lo/ews;->c(I)V

    .line 130
    invoke-virtual {v1, v5}, Lo/ews;->a(I)V

    .line 131
    invoke-virtual {v1, v6}, Lo/ews;->d(I)V

    .line 132
    invoke-virtual {v1, v8}, Lo/ews;->h(I)V

    .line 133
    invoke-virtual {v1, v7}, Lo/ews;->i(I)V

    .line 134
    invoke-virtual {v1, v9}, Lo/ews;->g(I)V

    .line 135
    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 136
    return-void
.end method


# virtual methods
.method public b(JJILo/ewr$c;)V
    .locals 7

    .line 47
    new-instance v4, Lcom/huawei/hihealth/HiAggregateOption;

    invoke-direct {v4}, Lcom/huawei/hihealth/HiAggregateOption;-><init>()V

    .line 48
    invoke-virtual {v4, p1, p2}, Lcom/huawei/hihealth/HiAggregateOption;->setStartTime(J)V

    .line 49
    invoke-virtual {v4, p3, p4}, Lcom/huawei/hihealth/HiAggregateOption;->setEndTime(J)V

    .line 50
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setAggregateType(I)V

    .line 51
    const/16 v5, 0x8

    new-array v5, v5, [I

    fill-array-data v5, :array_0

    .line 56
    invoke-virtual {v4, v5}, Lcom/huawei/hihealth/HiAggregateOption;->setType([I)V

    .line 58
    const/16 v0, 0x8

    new-array v6, v0, [Ljava/lang/String;

    const-string v0, "TOTAL"

    const/4 v1, 0x0

    aput-object v0, v6, v1

    const-string v0, "STEP"

    const/4 v1, 0x1

    aput-object v0, v6, v1

    const-string v0, "RUN"

    const/4 v1, 0x2

    aput-object v0, v6, v1

    const-string v0, "CYCLE"

    const/4 v1, 0x3

    aput-object v0, v6, v1

    const-string v0, "FITNESS"

    const/4 v1, 0x4

    aput-object v0, v6, v1

    const-string v0, "CLIMB"

    const/4 v1, 0x5

    aput-object v0, v6, v1

    const-string v0, "SWIM"

    const/4 v1, 0x6

    aput-object v0, v6, v1

    const-string v0, "UNKNOWHIGH"

    const/4 v1, 0x7

    aput-object v0, v6, v1

    .line 67
    invoke-virtual {v4, v6}, Lcom/huawei/hihealth/HiAggregateOption;->setConstantsKey([Ljava/lang/String;)V

    .line 69
    packed-switch p5, :pswitch_data_0

    goto :goto_0

    .line 73
    :pswitch_0
    const/4 p5, 0x3

    .line 74
    goto :goto_0

    .line 76
    :pswitch_1
    const/4 p5, 0x5

    .line 77
    .line 81
    :goto_0
    invoke-virtual {v4, p5}, Lcom/huawei/hihealth/HiAggregateOption;->setGroupUnitType(I)V

    .line 82
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setReadType(I)V

    .line 83
    const-string v0, "SCUI_FitnessSportIntensityIn"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getFitnessDataDetailByData aggregateOption="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Lcom/huawei/hihealth/HiAggregateOption;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 84
    iget-object v0, p0, Lo/ewt;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    new-instance v1, Lo/ewt$5;

    invoke-direct {v1, p0, p6, v6}, Lo/ewt$5;-><init>(Lo/ewt;Lo/ewr$c;[Ljava/lang/String;)V

    invoke-interface {v0, v4, v1}, Lo/clt;->b(Lcom/huawei/hihealth/HiAggregateOption;Lo/cly;)V

    .line 105
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_1
    .end packed-switch

    :array_0
    .array-data 4
        0xb7fd
        0xb7fe
        0xb7ff
        0xb800
        0xb801
        0xb803
        0xb804
        0xb805
    .end array-data
.end method
