.class public Lo/erw;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private a(Ljava/util/List;II)Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;II)Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;"
        }
    .end annotation

    .line 39
    const-string v0, "Track_Vo2MaxToSportLevel"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "analyzeVo2MaxData "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 40
    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 43
    :cond_0
    new-instance v0, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;

    const/4 v1, -0x1

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;-><init>(II)V

    return-object v0

    .line 48
    :cond_1
    const/4 v4, 0x0

    .line 53
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

    .line 54
    const-string v0, "key"

    invoke-virtual {v6, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v0

    int-to-float v0, v0

    cmpg-float v0, v4, v0

    if-gez v0, :cond_2

    .line 55
    const-string v0, "key"

    invoke-virtual {v6, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v0

    int-to-float v4, v0

    .line 57
    :cond_2
    goto :goto_0

    .line 60
    :cond_3
    const-string v0, "Track_Vo2MaxToSportLevel"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "analyzeVo2MaxData "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 64
    invoke-direct {p0, p2, p3}, Lo/erw;->b(II)Lo/erq;

    move-result-object v5

    .line 66
    if-nez v5, :cond_4

    .line 67
    const-string v0, "Track_Vo2MaxToSportLevel"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "analyzeVo2MaxData cal null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 69
    new-instance v0, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;

    const/4 v1, -0x1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;-><init>(II)V

    return-object v0

    .line 71
    :cond_4
    invoke-static {v4}, Ljava/lang/Math;->round(F)I

    move-result v0

    invoke-virtual {v5, v0}, Lo/erq;->c(I)Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;

    move-result-object v0

    return-object v0
.end method

.method private b(II)Lo/erq;
    .locals 4

    .line 82
    const/16 v0, 0x13

    if-gt p2, v0, :cond_0

    .line 83
    const/4 v0, 0x0

    return-object v0

    .line 84
    :cond_0
    const/16 v0, 0x18

    if-gt p2, v0, :cond_1

    .line 85
    const-string v0, "Track_Vo2MaxToSportLevel"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "SportLevelByVo2Max20s"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 86
    new-instance v0, Lo/ero;

    invoke-direct {v0, p1}, Lo/ero;-><init>(I)V

    return-object v0

    .line 87
    :cond_1
    const/16 v0, 0x1d

    if-gt p2, v0, :cond_2

    .line 88
    const-string v0, "Track_Vo2MaxToSportLevel"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "SportLevelByVo2Max25s"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 89
    new-instance v0, Lo/erm;

    invoke-direct {v0, p1}, Lo/erm;-><init>(I)V

    return-object v0

    .line 90
    :cond_2
    const/16 v0, 0x22

    if-gt p2, v0, :cond_3

    .line 91
    const-string v0, "Track_Vo2MaxToSportLevel"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "SportLevelByVo2Max30s"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 92
    new-instance v0, Lo/erp;

    invoke-direct {v0, p1}, Lo/erp;-><init>(I)V

    return-object v0

    .line 93
    :cond_3
    const/16 v0, 0x27

    if-gt p2, v0, :cond_4

    .line 94
    const-string v0, "Track_Vo2MaxToSportLevel"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "SportLevelByVo2Max35s"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 95
    new-instance v0, Lo/ern;

    invoke-direct {v0, p1}, Lo/ern;-><init>(I)V

    return-object v0

    .line 96
    :cond_4
    const/16 v0, 0x2c

    if-gt p2, v0, :cond_5

    .line 97
    const-string v0, "Track_Vo2MaxToSportLevel"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "SportLevelByVo2Max40s"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 98
    new-instance v0, Lo/ers;

    invoke-direct {v0, p1}, Lo/ers;-><init>(I)V

    return-object v0

    .line 99
    :cond_5
    const/16 v0, 0x31

    if-gt p2, v0, :cond_6

    .line 100
    const-string v0, "Track_Vo2MaxToSportLevel"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "SportLevelByVo2Max45s"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 101
    new-instance v0, Lo/erv;

    invoke-direct {v0, p1}, Lo/erv;-><init>(I)V

    return-object v0

    .line 102
    :cond_6
    const/16 v0, 0x36

    if-gt p2, v0, :cond_7

    .line 103
    const-string v0, "Track_Vo2MaxToSportLevel"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "SportLevelByVo2Max50s"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 104
    new-instance v0, Lo/ert;

    invoke-direct {v0, p1}, Lo/ert;-><init>(I)V

    return-object v0

    .line 105
    :cond_7
    const/16 v0, 0x3b

    if-gt p2, v0, :cond_8

    .line 106
    const-string v0, "Track_Vo2MaxToSportLevel"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "SportLevelByVo2Max55s"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 107
    new-instance v0, Lo/err;

    invoke-direct {v0, p1}, Lo/err;-><init>(I)V

    return-object v0

    .line 108
    :cond_8
    const/16 v0, 0x41

    if-gt p2, v0, :cond_9

    .line 109
    const-string v0, "Track_Vo2MaxToSportLevel"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "SportLevelByVo2Max60s"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 110
    new-instance v0, Lo/eru;

    invoke-direct {v0, p1}, Lo/eru;-><init>(I)V

    return-object v0

    .line 112
    :cond_9
    const/4 v0, 0x0

    return-object v0
.end method


# virtual methods
.method public b(Ljava/util/List;Lcom/huawei/up/model/UserInfomation;)Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;Lcom/huawei/up/model/UserInfomation;)Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;"
        }
    .end annotation

    .line 21
    if-nez p2, :cond_0

    .line 22
    const-string v0, "Track_Vo2MaxToSportLevel"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "calSportLevel userInfomation is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 23
    new-instance v0, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;

    const/4 v1, -0x1

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;-><init>(II)V

    return-object v0

    .line 26
    :cond_0
    invoke-virtual {p2}, Lcom/huawei/up/model/UserInfomation;->getGender()I

    move-result v4

    .line 27
    if-eqz v4, :cond_1

    const/4 v0, 0x1

    if-eq v4, v0, :cond_1

    .line 28
    const-string v0, "Track_Vo2MaxToSportLevel"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "undefined gender"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 29
    new-instance v0, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;

    const/4 v1, -0x1

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;-><init>(II)V

    return-object v0

    .line 33
    :cond_1
    invoke-virtual {p2}, Lcom/huawei/up/model/UserInfomation;->getAge()I

    move-result v0

    invoke-direct {p0, p1, v4, v0}, Lo/erw;->a(Ljava/util/List;II)Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;

    move-result-object v0

    return-object v0
.end method
