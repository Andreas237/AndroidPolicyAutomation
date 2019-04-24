.class public Lo/css;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private c:Landroid/content/Context;

.field private d:Lo/crc;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    iput-object p1, p0, Lo/css;->c:Landroid/content/Context;

    .line 42
    iget-object v0, p0, Lo/css;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/crc;->b(Landroid/content/Context;)Lo/crc;

    move-result-object v0

    iput-object v0, p0, Lo/css;->d:Lo/crc;

    .line 43
    return-void
.end method

.method private a(Ljava/util/List;I)Ljava/util/List;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;I)Ljava/util/List<Lcom/huawei/hwcloudmodel/model/unite/HealthDetail;>;"
        }
    .end annotation

    .line 137
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 139
    iget-object v0, p0, Lo/css;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/cpw;->e(Landroid/content/Context;)Lo/cpw;

    move-result-object v0

    invoke-virtual {v0, p2}, Lo/cpw;->f(I)Lo/crd;

    move-result-object v4

    .line 140
    if-nez v4, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 142
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/hihealth/HiHealthData;

    .line 143
    if-nez v6, :cond_1

    goto :goto_0

    .line 144
    :cond_1
    invoke-virtual {v6}, Lcom/huawei/hihealth/HiHealthData;->getType()I

    move-result v0

    invoke-static {v0}, Lo/cue;->a(I)I

    move-result v7

    .line 145
    invoke-static {v6, v7}, Lo/cue;->b(Lcom/huawei/hihealth/HiHealthData;I)Lcom/huawei/hwcloudmodel/model/unite/HealthDetail;

    move-result-object v3

    .line 146
    if-nez v3, :cond_2

    goto :goto_0

    .line 147
    :cond_2
    invoke-virtual {v4}, Lo/crd;->i()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/hwcloudmodel/model/unite/HealthDetail;->setDeviceCode(Ljava/lang/Long;)V

    .line 148
    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 149
    goto :goto_0

    .line 150
    :cond_3
    return-object v2
.end method

.method private a(Ljava/util/List;II)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;II)Ljava/util/List<Lcom/huawei/hwcloudmodel/model/unite/HealthDetail;>;"
        }
    .end annotation

    .line 126
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 128
    iget-object v0, p0, Lo/css;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/cpw;->e(Landroid/content/Context;)Lo/cpw;

    move-result-object v0

    invoke-virtual {v0, p2}, Lo/cpw;->f(I)Lo/crd;

    move-result-object v3

    .line 129
    if-nez v3, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 131
    :cond_0
    invoke-virtual {v3}, Lo/crd;->i()J

    move-result-wide v0

    invoke-static {v2, p1, p3, v0, v1}, Lo/cue;->d(Ljava/util/List;Ljava/util/List;IJ)V

    .line 133
    return-object v2
.end method

.method private c(Ljava/util/List;I)Ljava/util/List;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;I)Ljava/util/List<Lcom/huawei/hwcloudmodel/model/unite/HealthDetail;>;"
        }
    .end annotation

    .line 106
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 108
    iget-object v0, p0, Lo/css;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/cpw;->e(Landroid/content/Context;)Lo/cpw;

    move-result-object v0

    invoke-virtual {v0, p2}, Lo/cpw;->f(I)Lo/crd;

    move-result-object v4

    .line 109
    if-nez v4, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 111
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/hihealth/HiHealthData;

    .line 112
    if-nez v6, :cond_1

    goto :goto_0

    .line 113
    :cond_1
    invoke-virtual {v6}, Lcom/huawei/hihealth/HiHealthData;->getType()I

    move-result v0

    invoke-static {v0}, Lo/cue;->a(I)I

    move-result v7

    .line 114
    invoke-static {v6, v7}, Lo/cue;->b(Lcom/huawei/hihealth/HiHealthData;I)Lcom/huawei/hwcloudmodel/model/unite/HealthDetail;

    move-result-object v3

    .line 115
    if-nez v3, :cond_2

    goto :goto_0

    .line 116
    :cond_2
    invoke-virtual {v4}, Lo/crd;->i()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/hwcloudmodel/model/unite/HealthDetail;->setDeviceCode(Ljava/lang/Long;)V

    .line 117
    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 118
    goto :goto_0

    .line 119
    :cond_3
    return-object v2
.end method


# virtual methods
.method public c(Lcom/huawei/hwcloudmodel/model/unite/HealthDetail;I)Ljava/util/List;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/hwcloudmodel/model/unite/HealthDetail;I)Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 68
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hwcloudmodel/model/unite/HealthDetail;->getSamplePoints()Ljava/util/List;

    move-result-object v5

    .line 69
    if-eqz v5, :cond_0

    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 70
    :cond_0
    const-string v0, "Debug_HealthDataSwitch"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "cloudToLocal samplePoints is null or empty"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 71
    const/4 v0, 0x0

    return-object v0

    .line 73
    :cond_1
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/css;->d:Lo/crc;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/css;->c:Landroid/content/Context;

    invoke-static {v1}, Lo/cui;->e(Landroid/content/Context;)I

    move-result v1

    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hwcloudmodel/model/unite/HealthDetail;->getDeviceCode()Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    move/from16 v4, p2

    invoke-virtual {v0, v1, v4, v2, v3}, Lo/crc;->d(IIJ)Lo/crd;

    move-result-object v6

    .line 74
    if-nez v6, :cond_2

    .line 75
    const-string v0, "Debug_HealthDataSwitch"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "cloudToLocal hiHealthContext is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 76
    const/4 v0, 0x0

    return-object v0

    .line 78
    :cond_2
    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Lo/crd;->c(I)V

    .line 79
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 80
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hwcloudmodel/model/unite/HealthDetail;->getTimeZone()Ljava/lang/String;

    move-result-object v8

    .line 81
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    int-to-long v9, v0

    .line 84
    const/4 v13, 0x0

    :goto_0
    int-to-long v0, v13

    cmp-long v0, v0, v9

    if-gez v0, :cond_7

    .line 85
    invoke-interface {v5, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;

    .line 86
    const/4 v0, 0x0

    if-ne v0, v11, :cond_3

    .line 87
    goto :goto_2

    .line 89
    :cond_3
    invoke-static {v11}, Lo/cue;->e(Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;)Ljava/util/List;

    move-result-object v12

    .line 90
    const/4 v0, 0x0

    if-eq v0, v12, :cond_6

    invoke-interface {v12}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 91
    goto :goto_2

    .line 93
    :cond_4
    invoke-interface {v12}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v14

    :goto_1
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v15, v0

    check-cast v15, Lcom/huawei/hihealth/HiHealthData;

    .line 94
    invoke-virtual {v15, v8}, Lcom/huawei/hihealth/HiHealthData;->setTimeZone(Ljava/lang/String;)V

    .line 95
    invoke-static {v15, v6}, Lo/crd;->b(Lcom/huawei/hihealth/HiHealthData;Lo/crd;)V

    .line 96
    goto :goto_1

    .line 97
    :cond_5
    invoke-interface {v7, v12}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 84
    :cond_6
    :goto_2
    add-int/lit8 v13, v13, 0x1

    goto :goto_0

    .line 99
    :cond_7
    return-object v7
.end method

.method public d(Ljava/util/List;II)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;II)Ljava/util/List<Lcom/huawei/hwcloudmodel/model/unite/HealthDetail;>;"
        }
    .end annotation

    .line 46
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 47
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 49
    :cond_1
    packed-switch p3, :pswitch_data_0

    goto :goto_0

    .line 57
    :pswitch_0
    invoke-direct {p0, p1, p2, p3}, Lo/css;->a(Ljava/util/List;II)Ljava/util/List;

    move-result-object v0

    return-object v0

    .line 59
    :pswitch_1
    invoke-direct {p0, p1, p2}, Lo/css;->c(Ljava/util/List;I)Ljava/util/List;

    move-result-object v0

    return-object v0

    .line 61
    :pswitch_2
    invoke-direct {p0, p1, p2}, Lo/css;->a(Ljava/util/List;I)Ljava/util/List;

    move-result-object v0

    return-object v0

    .line 63
    :goto_0
    :pswitch_3
    invoke-direct {p0, p1, p2}, Lo/css;->c(Ljava/util/List;I)Ljava/util/List;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_0
        :pswitch_3
        :pswitch_1
        :pswitch_2
        :pswitch_0
        :pswitch_3
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method
