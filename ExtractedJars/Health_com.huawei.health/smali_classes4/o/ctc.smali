.class public Lo/ctc;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Lcom/huawei/hwcloudmodel/model/unite/SportBasicInfo;Lo/cob;)Ljava/util/List;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/hwcloudmodel/model/unite/SportBasicInfo;Lo/cob;)Ljava/util/List<Lo/cob;>;"
        }
    .end annotation

    .line 58
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 59
    invoke-virtual {p0}, Lcom/huawei/hwcloudmodel/model/unite/SportBasicInfo;->fetchSteps()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v5

    .line 60
    invoke-virtual {p0}, Lcom/huawei/hwcloudmodel/model/unite/SportBasicInfo;->fetchDistance()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v6

    .line 61
    invoke-virtual {p0}, Lcom/huawei/hwcloudmodel/model/unite/SportBasicInfo;->fetchCalorie()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v7

    .line 62
    invoke-virtual {p0}, Lcom/huawei/hwcloudmodel/model/unite/SportBasicInfo;->fetchDuration()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v8

    .line 63
    invoke-virtual {p0}, Lcom/huawei/hwcloudmodel/model/unite/SportBasicInfo;->fetchFloor()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1e

    int-to-float v9, v0

    .line 64
    invoke-static {v5}, Lo/cno;->b(I)Z

    move-result v0

    if-eqz v0, :cond_0

    float-to-double v0, v9

    invoke-static {v0, v1}, Lo/cno;->c(D)Z

    move-result v0

    if-nez v0, :cond_1

    .line 65
    :cond_0
    const-string v0, "Debug_SportDataSwitch"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getStairStatTable STEP is out of rang sportBasicInfo = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p0}, Lo/cnj;->d(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 66
    const/4 v0, 0x0

    return-object v0

    .line 68
    :cond_1
    invoke-static {v5}, Lo/cno;->a(I)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 69
    int-to-double v0, v5

    const v2, 0x9c4d

    const/4 v3, 0x1

    invoke-virtual {p1, v2, v0, v1, v3}, Lo/cob;->a(IDI)Lo/cob;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 71
    :cond_2
    invoke-static {v6}, Lo/cno;->a(I)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 72
    int-to-double v0, v6

    const v2, 0x9c62

    const/4 v3, 0x2

    invoke-virtual {p1, v2, v0, v1, v3}, Lo/cob;->a(IDI)Lo/cob;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 74
    :cond_3
    invoke-static {v8}, Lo/cno;->a(I)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 75
    mul-int/lit8 v0, v8, 0x3c

    int-to-double v0, v0

    const v2, 0x9c6c

    const/16 v3, 0xd

    invoke-virtual {p1, v2, v0, v1, v3}, Lo/cob;->a(IDI)Lo/cob;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 77
    :cond_4
    invoke-static {v7}, Lo/cno;->a(I)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 78
    int-to-double v0, v7

    const v2, 0x9c58

    const/4 v3, 0x3

    invoke-virtual {p1, v2, v0, v1, v3}, Lo/cob;->a(IDI)Lo/cob;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 84
    :cond_5
    invoke-static {v9}, Lo/cno;->b(F)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 85
    float-to-double v0, v9

    const v2, 0x9c45

    const/4 v3, 0x4

    invoke-virtual {p1, v2, v0, v1, v3}, Lo/cob;->a(IDI)Lo/cob;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 87
    :cond_6
    return-object v4
.end method

.method public static c(Lcom/huawei/hwcloudmodel/model/unite/SportBasicInfo;Lo/cob;)Ljava/util/List;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/hwcloudmodel/model/unite/SportBasicInfo;Lo/cob;)Ljava/util/List<Lo/cob;>;"
        }
    .end annotation

    .line 24
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 25
    invoke-virtual {p0}, Lcom/huawei/hwcloudmodel/model/unite/SportBasicInfo;->fetchSteps()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v5

    .line 26
    invoke-virtual {p0}, Lcom/huawei/hwcloudmodel/model/unite/SportBasicInfo;->fetchDistance()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v6

    .line 27
    invoke-virtual {p0}, Lcom/huawei/hwcloudmodel/model/unite/SportBasicInfo;->fetchCalorie()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v7

    .line 28
    invoke-virtual {p0}, Lcom/huawei/hwcloudmodel/model/unite/SportBasicInfo;->fetchDuration()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v8

    .line 29
    invoke-virtual {p0}, Lcom/huawei/hwcloudmodel/model/unite/SportBasicInfo;->fetchAltitude()Ljava/lang/Float;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    const/high16 v1, 0x41200000    # 10.0f

    mul-float v9, v0, v1

    .line 30
    invoke-static {v5}, Lo/cno;->b(I)Z

    move-result v0

    if-eqz v0, :cond_0

    float-to-double v0, v9

    invoke-static {v0, v1}, Lo/cno;->c(D)Z

    move-result v0

    if-nez v0, :cond_1

    .line 31
    :cond_0
    const-string v0, "Debug_SportDataSwitch"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getClimbStatTable STEP is out of rang sportBasicInfo = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p0}, Lo/cnj;->d(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 32
    const/4 v0, 0x0

    return-object v0

    .line 35
    :cond_1
    invoke-static {v6}, Lo/cno;->a(I)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 36
    int-to-double v0, v6

    const v2, 0x9c62

    const/4 v3, 0x2

    invoke-virtual {p1, v2, v0, v1, v3}, Lo/cob;->a(IDI)Lo/cob;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 39
    :cond_2
    invoke-static {v8}, Lo/cno;->a(I)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 40
    mul-int/lit8 v0, v8, 0x3c

    int-to-double v0, v0

    const v2, 0x9c6c

    const/16 v3, 0xd

    invoke-virtual {p1, v2, v0, v1, v3}, Lo/cob;->a(IDI)Lo/cob;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 43
    :cond_3
    invoke-static {v5}, Lo/cno;->a(I)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 44
    int-to-double v0, v5

    const v2, 0x9c4d

    const/4 v3, 0x1

    invoke-virtual {p1, v2, v0, v1, v3}, Lo/cob;->a(IDI)Lo/cob;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 47
    :cond_4
    invoke-static {v7}, Lo/cno;->a(I)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 48
    int-to-double v0, v7

    const v2, 0x9c58

    const/4 v3, 0x3

    invoke-virtual {p1, v2, v0, v1, v3}, Lo/cob;->a(IDI)Lo/cob;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 51
    :cond_5
    invoke-static {v9}, Lo/cno;->b(F)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 52
    float-to-double v0, v9

    const v2, 0x9c45

    const/4 v3, 0x4

    invoke-virtual {p1, v2, v0, v1, v3}, Lo/cob;->a(IDI)Lo/cob;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 54
    :cond_6
    return-object v4
.end method

.method public static d(Lcom/huawei/hwcloudmodel/model/unite/SportBasicInfo;Lo/cob;I)Ljava/util/List;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/hwcloudmodel/model/unite/SportBasicInfo;Lo/cob;I)Ljava/util/List<Lo/cob;>;"
        }
    .end annotation

    .line 91
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 92
    invoke-virtual {p0}, Lcom/huawei/hwcloudmodel/model/unite/SportBasicInfo;->fetchSteps()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v5

    .line 93
    invoke-virtual {p0}, Lcom/huawei/hwcloudmodel/model/unite/SportBasicInfo;->fetchDistance()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v6

    .line 94
    invoke-virtual {p0}, Lcom/huawei/hwcloudmodel/model/unite/SportBasicInfo;->fetchCalorie()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v7

    .line 95
    invoke-virtual {p0}, Lcom/huawei/hwcloudmodel/model/unite/SportBasicInfo;->fetchDuration()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v8

    .line 97
    invoke-virtual {p0}, Lcom/huawei/hwcloudmodel/model/unite/SportBasicInfo;->fetchAltitude()Ljava/lang/Float;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    const/high16 v1, 0x41200000    # 10.0f

    mul-float/2addr v0, v1

    invoke-virtual {p0}, Lcom/huawei/hwcloudmodel/model/unite/SportBasicInfo;->fetchFloor()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    mul-int/lit8 v1, v1, 0x1e

    int-to-float v1, v1

    add-float v9, v0, v1

    .line 99
    invoke-static {v5}, Lo/cno;->b(I)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {v7}, Lo/cno;->d(I)Z

    move-result v0

    if-eqz v0, :cond_0

    float-to-double v0, v9

    invoke-static {v0, v1}, Lo/cno;->c(D)Z

    move-result v0

    if-nez v0, :cond_1

    .line 100
    :cond_0
    const-string v0, "HiH_SportDataSwitch"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getSportStatTable STEP OR CALORIE or altitude is out of rang sportBasicInfo = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p0}, Lo/cnj;->d(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 101
    const/4 v0, 0x0

    return-object v0

    .line 103
    :cond_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/cnk;->a(J)I

    move-result v0

    if-ne v0, p2, :cond_2

    .line 104
    const-string v0, "HiH_SportDataSwitch"

    const/16 v1, 0x8

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getSportStatTable date="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ": s="

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, ", d="

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    const-string v2, ", c="

    const/4 v3, 0x6

    aput-object v2, v1, v3

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x7

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 106
    :cond_2
    invoke-static {v5}, Lo/cno;->a(I)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 107
    int-to-double v0, v5

    const v2, 0x9c42

    const/4 v3, 0x1

    invoke-virtual {p1, v2, v0, v1, v3}, Lo/cob;->a(IDI)Lo/cob;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 109
    :cond_3
    invoke-static {v6}, Lo/cno;->a(I)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 110
    int-to-double v0, v6

    const v2, 0x9c44

    const/4 v3, 0x2

    invoke-virtual {p1, v2, v0, v1, v3}, Lo/cob;->a(IDI)Lo/cob;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 112
    :cond_4
    invoke-static {v8}, Lo/cno;->a(I)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 113
    mul-int/lit8 v0, v8, 0x3c

    int-to-double v0, v0

    const v2, 0x9c46

    const/16 v3, 0xd

    invoke-virtual {p1, v2, v0, v1, v3}, Lo/cob;->a(IDI)Lo/cob;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 115
    :cond_5
    invoke-static {v7}, Lo/cno;->a(I)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 116
    int-to-double v0, v7

    const v2, 0x9c43

    const/4 v3, 0x3

    invoke-virtual {p1, v2, v0, v1, v3}, Lo/cob;->a(IDI)Lo/cob;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 123
    :cond_6
    invoke-static {v9}, Lo/cno;->b(F)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 124
    float-to-double v0, v9

    const v2, 0x9c45

    const/4 v3, 0x4

    invoke-virtual {p1, v2, v0, v1, v3}, Lo/cob;->a(IDI)Lo/cob;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 126
    :cond_7
    return-object v4
.end method
