.class public Lo/cte;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Lcom/huawei/hwcloudmodel/model/unite/SportBasicInfo;Lo/cob;)Ljava/util/List;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/hwcloudmodel/model/unite/SportBasicInfo;Lo/cob;)Ljava/util/List<Lo/cob;>;"
        }
    .end annotation

    .line 22
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 23
    invoke-virtual {p0}, Lcom/huawei/hwcloudmodel/model/unite/SportBasicInfo;->fetchSteps()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v5

    .line 24
    invoke-virtual {p0}, Lcom/huawei/hwcloudmodel/model/unite/SportBasicInfo;->fetchDistance()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v6

    .line 25
    invoke-virtual {p0}, Lcom/huawei/hwcloudmodel/model/unite/SportBasicInfo;->fetchCalorie()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v7

    .line 26
    invoke-virtual {p0}, Lcom/huawei/hwcloudmodel/model/unite/SportBasicInfo;->fetchDuration()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v8

    .line 27
    invoke-static {v5}, Lo/cno;->b(I)Z

    move-result v0

    if-nez v0, :cond_0

    .line 28
    const-string v0, "Debug_SportDataSwitch"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getSwimStatTable STEP is out of rang sportBasicInfo = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p0}, Lo/cnj;->d(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 29
    const/4 v0, 0x0

    return-object v0

    .line 31
    :cond_0
    invoke-static {v6}, Lo/cno;->a(I)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 32
    int-to-double v0, v6

    const v2, 0x9c63

    const/4 v3, 0x2

    invoke-virtual {p1, v2, v0, v1, v3}, Lo/cob;->a(IDI)Lo/cob;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 34
    :cond_1
    invoke-static {v8}, Lo/cno;->a(I)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 35
    mul-int/lit8 v0, v8, 0x3c

    int-to-double v0, v0

    const v2, 0x9c6d

    const/16 v3, 0xd

    invoke-virtual {p1, v2, v0, v1, v3}, Lo/cob;->a(IDI)Lo/cob;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 37
    :cond_2
    invoke-static {v7}, Lo/cno;->a(I)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 38
    int-to-double v0, v7

    const v2, 0x9c59

    const/4 v3, 0x3

    invoke-virtual {p1, v2, v0, v1, v3}, Lo/cob;->a(IDI)Lo/cob;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 40
    :cond_3
    return-object v4
.end method

.method public static b(Lcom/huawei/hwcloudmodel/model/unite/SportBasicInfo;Lo/cob;)Ljava/util/List;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/hwcloudmodel/model/unite/SportBasicInfo;Lo/cob;)Ljava/util/List<Lo/cob;>;"
        }
    .end annotation

    .line 95
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 96
    invoke-virtual {p0}, Lcom/huawei/hwcloudmodel/model/unite/SportBasicInfo;->fetchDistance()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v5

    .line 97
    invoke-virtual {p0}, Lcom/huawei/hwcloudmodel/model/unite/SportBasicInfo;->fetchCalorie()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v6

    .line 98
    invoke-virtual {p0}, Lcom/huawei/hwcloudmodel/model/unite/SportBasicInfo;->fetchDuration()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v7

    .line 99
    invoke-static {v6}, Lo/cno;->d(I)Z

    move-result v0

    if-nez v0, :cond_0

    .line 100
    const-string v0, "Debug_SportDataSwitch"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getRideStatTable calorie is out of rang sportBasicInfo = "

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
    :cond_0
    invoke-static {v5}, Lo/cno;->a(I)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 104
    int-to-double v0, v5

    const v2, 0x9c61

    const/4 v3, 0x2

    invoke-virtual {p1, v2, v0, v1, v3}, Lo/cob;->a(IDI)Lo/cob;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 106
    :cond_1
    invoke-static {v7}, Lo/cno;->a(I)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 107
    mul-int/lit8 v0, v7, 0x3c

    int-to-double v0, v0

    const v2, 0x9c6b

    const/16 v3, 0xd

    invoke-virtual {p1, v2, v0, v1, v3}, Lo/cob;->a(IDI)Lo/cob;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 109
    :cond_2
    invoke-static {v6}, Lo/cno;->a(I)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 110
    int-to-double v0, v6

    const v2, 0x9c57

    const/4 v3, 0x3

    invoke-virtual {p1, v2, v0, v1, v3}, Lo/cob;->a(IDI)Lo/cob;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 112
    :cond_3
    return-object v4
.end method

.method public static c(Lcom/huawei/hwcloudmodel/model/unite/SportBasicInfo;Lo/cob;)Ljava/util/List;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/hwcloudmodel/model/unite/SportBasicInfo;Lo/cob;)Ljava/util/List<Lo/cob;>;"
        }
    .end annotation

    .line 44
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 45
    invoke-virtual {p0}, Lcom/huawei/hwcloudmodel/model/unite/SportBasicInfo;->fetchSteps()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v5

    .line 46
    invoke-virtual {p0}, Lcom/huawei/hwcloudmodel/model/unite/SportBasicInfo;->fetchDistance()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v6

    .line 47
    invoke-virtual {p0}, Lcom/huawei/hwcloudmodel/model/unite/SportBasicInfo;->fetchCalorie()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v7

    .line 48
    invoke-virtual {p0}, Lcom/huawei/hwcloudmodel/model/unite/SportBasicInfo;->fetchDuration()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v8

    .line 49
    invoke-static {v5}, Lo/cno;->b(I)Z

    move-result v0

    if-nez v0, :cond_0

    .line 50
    const-string v0, "Debug_SportDataSwitch"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getWalkStatTable STEP is out of rang sportBasicInfo = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p0}, Lo/cnj;->d(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 51
    const/4 v0, 0x0

    return-object v0

    .line 53
    :cond_0
    invoke-static {v5}, Lo/cno;->a(I)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 54
    int-to-double v0, v5

    const v2, 0x9c4b

    const/4 v3, 0x1

    invoke-virtual {p1, v2, v0, v1, v3}, Lo/cob;->a(IDI)Lo/cob;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 56
    :cond_1
    invoke-static {v6}, Lo/cno;->a(I)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 57
    int-to-double v0, v6

    const v2, 0x9c5f

    const/4 v3, 0x2

    invoke-virtual {p1, v2, v0, v1, v3}, Lo/cob;->a(IDI)Lo/cob;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 59
    :cond_2
    invoke-static {v8}, Lo/cno;->a(I)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 60
    mul-int/lit8 v0, v8, 0x3c

    int-to-double v0, v0

    const v2, 0x9c69

    const/16 v3, 0xd

    invoke-virtual {p1, v2, v0, v1, v3}, Lo/cob;->a(IDI)Lo/cob;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 62
    :cond_3
    invoke-static {v7}, Lo/cno;->a(I)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 63
    int-to-double v0, v7

    const v2, 0x9c55

    const/4 v3, 0x3

    invoke-virtual {p1, v2, v0, v1, v3}, Lo/cob;->a(IDI)Lo/cob;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 65
    :cond_4
    return-object v4
.end method

.method public static e(Lcom/huawei/hwcloudmodel/model/unite/SportBasicInfo;Lo/cob;)Ljava/util/List;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/hwcloudmodel/model/unite/SportBasicInfo;Lo/cob;)Ljava/util/List<Lo/cob;>;"
        }
    .end annotation

    .line 69
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 70
    invoke-virtual {p0}, Lcom/huawei/hwcloudmodel/model/unite/SportBasicInfo;->fetchSteps()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v5

    .line 71
    invoke-virtual {p0}, Lcom/huawei/hwcloudmodel/model/unite/SportBasicInfo;->fetchDistance()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v6

    .line 72
    invoke-virtual {p0}, Lcom/huawei/hwcloudmodel/model/unite/SportBasicInfo;->fetchCalorie()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v7

    .line 73
    invoke-virtual {p0}, Lcom/huawei/hwcloudmodel/model/unite/SportBasicInfo;->fetchDuration()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v8

    .line 75
    invoke-static {v5}, Lo/cno;->b(I)Z

    move-result v0

    if-nez v0, :cond_0

    .line 76
    const-string v0, "Debug_SportDataSwitch"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getRunStatTable STEP is out of rang sportBasicInfo = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p0}, Lo/cnj;->d(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 77
    const/4 v0, 0x0

    return-object v0

    .line 79
    :cond_0
    invoke-static {v5}, Lo/cno;->a(I)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 80
    int-to-double v0, v5

    const v2, 0x9c4c

    const/4 v3, 0x1

    invoke-virtual {p1, v2, v0, v1, v3}, Lo/cob;->a(IDI)Lo/cob;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 82
    :cond_1
    invoke-static {v6}, Lo/cno;->a(I)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 83
    int-to-double v0, v6

    const v2, 0x9c60

    const/4 v3, 0x2

    invoke-virtual {p1, v2, v0, v1, v3}, Lo/cob;->a(IDI)Lo/cob;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 85
    :cond_2
    invoke-static {v8}, Lo/cno;->a(I)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 86
    mul-int/lit8 v0, v8, 0x3c

    int-to-double v0, v0

    const v2, 0x9c6a

    const/16 v3, 0xd

    invoke-virtual {p1, v2, v0, v1, v3}, Lo/cob;->a(IDI)Lo/cob;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 88
    :cond_3
    invoke-static {v7}, Lo/cno;->a(I)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 89
    int-to-double v0, v7

    const v2, 0x9c56

    const/4 v3, 0x3

    invoke-virtual {p1, v2, v0, v1, v3}, Lo/cob;->a(IDI)Lo/cob;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 91
    :cond_4
    return-object v4
.end method
