.class public Lo/dfz;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/dfz$b;
    }
.end annotation


# static fields
.field private static d:Lo/dfz;


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

.field private c:Lo/dfz$b;

.field e:Lo/dfu;

.field private g:J

.field private h:J

.field private i:J

.field private k:Lo/dfa;


# direct methods
.method private constructor <init>()V
    .locals 5

    .line 68
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 66
    const/4 v0, 0x0

    iput-object v0, p0, Lo/dfz;->c:Lo/dfz$b;

    .line 600
    new-instance v0, Lo/dfa;

    invoke-direct {v0}, Lo/dfa;-><init>()V

    iput-object v0, p0, Lo/dfz;->k:Lo/dfa;

    .line 625
    const/4 v0, 0x0

    iput-object v0, p0, Lo/dfz;->e:Lo/dfu;

    .line 859
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/dfz;->g:J

    .line 914
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/dfz;->h:J

    .line 915
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/dfz;->i:J

    .line 69
    const-string v0, "05"

    const-string v1, "FitnessMgrAW70Storage"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "FitnessMgrStorage Constructor"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 70
    new-instance v0, Lo/dfz$b;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lo/dfz$b;-><init>(Lo/dfz;Landroid/os/Looper;)V

    iput-object v0, p0, Lo/dfz;->c:Lo/dfz$b;

    .line 71
    return-void
.end method

.method static synthetic b(Lo/dfz;)Lo/dfz$b;
    .locals 1

    .line 60
    iget-object v0, p0, Lo/dfz;->c:Lo/dfz$b;

    return-object v0
.end method

.method private b(Lo/dfv;Lo/dfu;)V
    .locals 4

    .line 1051
    const-string v0, "FitnessMgrAW70Storage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "updateStatusToHiHealth :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1053
    invoke-direct {p0, p1, p2}, Lo/dfz;->e(Lo/dfv;Lo/dfu;)V

    .line 1054
    return-void
.end method

.method private b(Lo/dfv;Lo/dfw;)V
    .locals 7

    .line 1005
    invoke-virtual {p2}, Lo/dfw;->a()I

    move-result v0

    invoke-direct {p0, v0}, Lo/dfz;->e(I)I

    move-result v0

    invoke-virtual {p2}, Lo/dfw;->c()I

    move-result v1

    invoke-direct {p0, v0, v1}, Lo/dfz;->c(II)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1006
    new-instance v6, Lcom/huawei/hihealth/HiHealthData;

    invoke-virtual {p2}, Lo/dfw;->a()I

    move-result v0

    invoke-direct {p0, v0}, Lo/dfz;->e(I)I

    move-result v0

    invoke-direct {v6, v0}, Lcom/huawei/hihealth/HiHealthData;-><init>(I)V

    .line 1007
    invoke-virtual {p2}, Lo/dfw;->e()J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    mul-long/2addr v0, v2

    invoke-virtual {p2}, Lo/dfw;->e()J

    move-result-wide v2

    invoke-virtual {p2}, Lo/dfw;->b()I

    move-result v4

    int-to-long v4, v4

    add-long/2addr v2, v4

    const-wide/16 v4, 0x3e8

    mul-long/2addr v2, v4

    invoke-virtual {v6, v0, v1, v2, v3}, Lcom/huawei/hihealth/HiHealthData;->setTimeInterval(JJ)V

    .line 1008
    invoke-virtual {p2}, Lo/dfw;->c()I

    move-result v0

    invoke-virtual {v6, v0}, Lcom/huawei/hihealth/HiHealthData;->setValue(I)V

    .line 1009
    invoke-static {}, Lo/fju;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/hihealth/HiHealthData;->setDeviceUUID(Ljava/lang/String;)V

    .line 1010
    iget-object v0, p0, Lo/dfz;->b:Ljava/util/List;

    invoke-interface {v0, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1011
    goto :goto_0

    .line 1012
    :cond_0
    const-string v0, "FitnessMgrAW70Storage"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "insertSamplePoint invalid sample:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1014
    :goto_0
    return-void
.end method

.method private c(Lo/dfv;Lo/dfw;)V
    .locals 5

    .line 997
    const-string v0, "05"

    const-string v1, "FitnessMgrAW70Storage"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "updateSamplePoint sample:"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    aput-object p2, v2, v3

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1000
    invoke-direct {p0, p1, p2}, Lo/dfz;->b(Lo/dfv;Lo/dfw;)V

    .line 1001
    return-void
.end method

.method private c(II)Z
    .locals 1

    .line 406
    const/4 v0, 0x2

    if-ne p1, v0, :cond_0

    .line 407
    if-lez p2, :cond_5

    const/16 v0, 0x1f4

    if-ge p2, v0, :cond_5

    .line 408
    const/4 v0, 0x1

    return v0

    .line 410
    :cond_0
    const/4 v0, 0x4

    if-ne p1, v0, :cond_1

    .line 411
    if-lez p2, :cond_5

    const v0, 0xffff

    if-ge p2, v0, :cond_5

    .line 412
    const/4 v0, 0x1

    return v0

    .line 414
    :cond_1
    const/16 v0, 0x7e2

    if-eq p1, v0, :cond_2

    const/16 v0, 0x7d2

    if-ne p1, v0, :cond_3

    .line 416
    :cond_2
    if-lez p2, :cond_5

    const/16 v0, 0xff

    if-ge p2, v0, :cond_5

    .line 417
    const/4 v0, 0x1

    return v0

    .line 419
    :cond_3
    const/4 v0, 0x5

    if-ne p1, v0, :cond_4

    .line 420
    if-lez p2, :cond_5

    const/16 v0, 0x5dc

    if-ge p2, v0, :cond_5

    .line 421
    const/4 v0, 0x1

    return v0

    .line 424
    :cond_4
    if-lez p2, :cond_5

    .line 425
    const/4 v0, 0x1

    return v0

    .line 429
    :cond_5
    const/4 v0, 0x0

    return v0
.end method

.method private d(I)I
    .locals 5

    .line 1017
    const/4 v4, 0x0

    .line 1019
    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 1021
    :pswitch_0
    const/16 v4, 0x4e22

    .line 1022
    goto :goto_1

    .line 1024
    :pswitch_1
    const/16 v4, 0x4e23

    .line 1025
    goto :goto_1

    .line 1027
    :pswitch_2
    const/16 v4, 0x4e25

    .line 1028
    goto :goto_1

    .line 1030
    :pswitch_3
    const/16 v4, 0x4e24

    .line 1031
    goto :goto_1

    .line 1033
    :pswitch_4
    const/16 v4, 0x55f1

    .line 1034
    goto :goto_1

    .line 1036
    :pswitch_5
    const/16 v4, 0x55f2

    .line 1037
    goto :goto_1

    .line 1039
    :pswitch_6
    const/16 v4, 0x4e27

    .line 1040
    goto :goto_1

    .line 1042
    :goto_0
    :pswitch_7
    const-string v0, "FitnessMgrAW70Storage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getHiHealthSessionType unknow type :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1046
    :goto_1
    return v4

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_3
        :pswitch_2
        :pswitch_7
        :pswitch_5
        :pswitch_4
        :pswitch_7
        :pswitch_6
    .end packed-switch
.end method

.method public static d(J)J
    .locals 3

    .line 255
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v2

    .line 256
    invoke-virtual {v2, p0, p1}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 257
    const/16 v0, 0xb

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 258
    const/16 v0, 0xd

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 259
    const/16 v0, 0xc

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 260
    const/16 v0, 0xe

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 261
    invoke-virtual {v2}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v0

    return-wide v0
.end method

.method public static d()Lo/dfz;
    .locals 4

    .line 74
    const-string v0, "FitnessMgrAW70Storage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getInstance() context"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 75
    sget-object v0, Lo/dfz;->d:Lo/dfz;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 76
    new-instance v0, Lo/dfz;

    invoke-direct {v0}, Lo/dfz;-><init>()V

    sput-object v0, Lo/dfz;->d:Lo/dfz;

    .line 78
    :cond_0
    sget-object v0, Lo/dfz;->d:Lo/dfz;

    return-object v0
.end method

.method private e(I)I
    .locals 5

    .line 963
    const/4 v4, 0x0

    .line 965
    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 967
    :pswitch_0
    const/4 v4, 0x2

    .line 968
    goto :goto_1

    .line 970
    :pswitch_1
    const/4 v4, 0x4

    .line 971
    goto :goto_1

    .line 973
    :pswitch_2
    const/4 v4, 0x3

    .line 974
    goto :goto_1

    .line 976
    :pswitch_3
    const/4 v4, 0x6

    .line 977
    goto :goto_1

    .line 979
    :pswitch_4
    const/4 v4, 0x5

    .line 980
    goto :goto_1

    .line 982
    :pswitch_5
    const/16 v4, 0x7e2

    .line 983
    goto :goto_1

    .line 986
    :pswitch_6
    const/16 v4, 0x7d2

    .line 987
    goto :goto_1

    .line 989
    :goto_0
    const-string v0, "FitnessMgrAW70Storage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getHiHealthSessionType unknow type :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 993
    :goto_1
    return v4

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
    .end packed-switch
.end method

.method private e(Lo/dfv;Lo/dfu;)V
    .locals 9

    .line 1057
    const-string v0, "05"

    const-string v1, "FitnessMgrAW70Storage"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "statusPoint :"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1060
    invoke-virtual {p2}, Lo/dfu;->c()J

    move-result-wide v6

    :goto_0
    invoke-virtual {p2}, Lo/dfu;->e()J

    move-result-wide v0

    cmp-long v0, v6, v0

    if-gez v0, :cond_1

    .line 1061
    invoke-virtual {p2}, Lo/dfu;->b()I

    move-result v0

    invoke-direct {p0, v0}, Lo/dfz;->d(I)I

    move-result v0

    if-eqz v0, :cond_0

    .line 1062
    new-instance v8, Lcom/huawei/hihealth/HiHealthData;

    invoke-virtual {p2}, Lo/dfu;->b()I

    move-result v0

    invoke-direct {p0, v0}, Lo/dfz;->d(I)I

    move-result v0

    invoke-direct {v8, v0}, Lcom/huawei/hihealth/HiHealthData;-><init>(I)V

    .line 1063
    const-wide/16 v0, 0x3e8

    mul-long/2addr v0, v6

    const-wide/16 v2, 0x3c

    add-long/2addr v2, v6

    const-wide/16 v4, 0x3e8

    mul-long/2addr v2, v4

    invoke-virtual {v8, v0, v1, v2, v3}, Lcom/huawei/hihealth/HiHealthData;->setTimeInterval(JJ)V

    .line 1064
    invoke-static {}, Lo/fju;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Lcom/huawei/hihealth/HiHealthData;->setDeviceUUID(Ljava/lang/String;)V

    .line 1065
    const-string v0, "FitnessMgrAW70Storage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "saveStatusToHiHealth hiHealthData:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1066
    iget-object v0, p0, Lo/dfz;->a:Ljava/util/List;

    invoke-interface {v0, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1068
    :cond_0
    const-wide/16 v0, 0x3c

    add-long/2addr v6, v0

    goto :goto_0

    .line 1070
    :cond_1
    return-void
.end method


# virtual methods
.method a()V
    .locals 1

    .line 958
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/dfz;->b:Ljava/util/List;

    .line 959
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/dfz;->a:Ljava/util/List;

    .line 960
    return-void
.end method

.method a(Lo/dfv;)V
    .locals 6

    .line 1089
    const-string v0, "05"

    const-string v1, "FitnessMgrAW70Storage"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "saveDataToHiHealth enter dataList.size:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v4, p0, Lo/dfz;->b:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, " statusList.size:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v4, p0, Lo/dfz;->a:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1090
    new-instance v5, Lcom/huawei/hihealth/HiDataInsertOption;

    invoke-direct {v5}, Lcom/huawei/hihealth/HiDataInsertOption;-><init>()V

    .line 1091
    iget-object v0, p0, Lo/dfz;->b:Ljava/util/List;

    iget-object v1, p0, Lo/dfz;->a:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 1092
    const-string v0, "FitnessMgrAW70Storage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "saveDataToHiHealth enter dataList.size:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/dfz;->b:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1093
    iget-object v0, p0, Lo/dfz;->b:Ljava/util/List;

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/HiDataInsertOption;->setDatas(Ljava/util/List;)V

    .line 1094
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    new-instance v1, Lo/dfz$5;

    invoke-direct {v1, p0}, Lo/dfz$5;-><init>(Lo/dfz;)V

    invoke-interface {v0, v5, v1}, Lo/clt;->c(Lcom/huawei/hihealth/HiDataInsertOption;Lo/cma;)V

    .line 1106
    return-void
.end method

.method public a(Lo/dfv;Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalData;)V
    .locals 11

    .line 265
    const-string v0, "05"

    const-string v1, "FitnessMgrAW70Storage"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "saveTodayTotaltoHiHealth fitnessTotalData :"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    aput-object p2, v2, v3

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 267
    new-instance v5, Lcom/huawei/hihealth/HiDataInsertOption;

    invoke-direct {v5}, Lcom/huawei/hihealth/HiDataInsertOption;-><init>()V

    .line 268
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/dfz;->d(J)J

    move-result-wide v6

    .line 269
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 271
    invoke-virtual {p2}, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalData;->getSteps()I

    move-result v0

    if-lez v0, :cond_0

    .line 273
    new-instance v9, Lcom/huawei/hihealth/HiHealthData;

    invoke-direct {v9}, Lcom/huawei/hihealth/HiHealthData;-><init>()V

    .line 274
    const v0, 0x9c42

    invoke-virtual {v9, v0}, Lcom/huawei/hihealth/HiHealthData;->setType(I)V

    .line 275
    invoke-static {}, Lo/fju;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Lcom/huawei/hihealth/HiHealthData;->setDeviceUUID(Ljava/lang/String;)V

    .line 276
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {v9, v6, v7, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setTimeInterval(JJ)V

    .line 277
    invoke-virtual {p2}, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalData;->getSteps()I

    move-result v0

    invoke-virtual {v9, v0}, Lcom/huawei/hihealth/HiHealthData;->setValue(I)V

    .line 278
    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 281
    new-instance v10, Lcom/huawei/hihealth/HiHealthData;

    invoke-direct {v10}, Lcom/huawei/hihealth/HiHealthData;-><init>()V

    .line 282
    const/16 v0, 0x385

    invoke-virtual {v10, v0}, Lcom/huawei/hihealth/HiHealthData;->setType(I)V

    .line 283
    invoke-static {}, Lo/fju;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/huawei/hihealth/HiHealthData;->setDeviceUUID(Ljava/lang/String;)V

    .line 284
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {v10, v6, v7, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setTimeInterval(JJ)V

    .line 285
    invoke-virtual {p2}, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalData;->getSteps()I

    move-result v0

    invoke-virtual {v10, v0}, Lcom/huawei/hihealth/HiHealthData;->setValue(I)V

    .line 286
    invoke-virtual {v8, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 289
    :cond_0
    invoke-virtual {p2}, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalData;->getCalorie()I

    move-result v0

    if-lez v0, :cond_1

    .line 290
    new-instance v9, Lcom/huawei/hihealth/HiHealthData;

    invoke-direct {v9}, Lcom/huawei/hihealth/HiHealthData;-><init>()V

    .line 291
    const v0, 0x9c43

    invoke-virtual {v9, v0}, Lcom/huawei/hihealth/HiHealthData;->setType(I)V

    .line 292
    invoke-static {}, Lo/fju;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Lcom/huawei/hihealth/HiHealthData;->setDeviceUUID(Ljava/lang/String;)V

    .line 293
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {v9, v6, v7, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setTimeInterval(JJ)V

    .line 294
    invoke-virtual {p2}, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalData;->getCalorie()I

    move-result v0

    invoke-virtual {v9, v0}, Lcom/huawei/hihealth/HiHealthData;->setValue(I)V

    .line 295
    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 298
    :cond_1
    invoke-virtual {p2}, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalData;->getDistance()I

    move-result v0

    if-lez v0, :cond_2

    .line 299
    new-instance v9, Lcom/huawei/hihealth/HiHealthData;

    invoke-direct {v9}, Lcom/huawei/hihealth/HiHealthData;-><init>()V

    .line 300
    const v0, 0x9c44

    invoke-virtual {v9, v0}, Lcom/huawei/hihealth/HiHealthData;->setType(I)V

    .line 301
    invoke-static {}, Lo/fju;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Lcom/huawei/hihealth/HiHealthData;->setDeviceUUID(Ljava/lang/String;)V

    .line 302
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {v9, v6, v7, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setTimeInterval(JJ)V

    .line 303
    invoke-virtual {p2}, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalData;->getDistance()I

    move-result v0

    invoke-virtual {v9, v0}, Lcom/huawei/hihealth/HiHealthData;->setValue(I)V

    .line 304
    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 307
    :cond_2
    invoke-virtual {p2}, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalData;->getHeight()I

    move-result v0

    if-lez v0, :cond_3

    .line 308
    new-instance v9, Lcom/huawei/hihealth/HiHealthData;

    invoke-direct {v9}, Lcom/huawei/hihealth/HiHealthData;-><init>()V

    .line 309
    const v0, 0x9c45

    invoke-virtual {v9, v0}, Lcom/huawei/hihealth/HiHealthData;->setType(I)V

    .line 310
    invoke-static {}, Lo/fju;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Lcom/huawei/hihealth/HiHealthData;->setDeviceUUID(Ljava/lang/String;)V

    .line 311
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {v9, v6, v7, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setTimeInterval(JJ)V

    .line 312
    invoke-virtual {p2}, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalData;->getHeight()I

    move-result v0

    invoke-virtual {v9, v0}, Lcom/huawei/hihealth/HiHealthData;->setValue(I)V

    .line 313
    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 316
    :cond_3
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_4

    .line 317
    invoke-virtual {v5, v8}, Lcom/huawei/hihealth/HiDataInsertOption;->setDatas(Ljava/util/List;)V

    .line 318
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    new-instance v1, Lo/dfz$3;

    invoke-direct {v1, p0}, Lo/dfz$3;-><init>(Lo/dfz;)V

    invoke-interface {v0, v5, v1}, Lo/clt;->c(Lcom/huawei/hihealth/HiDataInsertOption;Lo/cma;)V

    .line 325
    :cond_4
    return-void
.end method

.method public a(Lo/dfv;Lo/dfx;)V
    .locals 9

    .line 917
    invoke-virtual {p2}, Lo/dfx;->d()Ljava/util/List;

    move-result-object v6

    .line 919
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lo/dfu;

    .line 920
    invoke-virtual {v8}, Lo/dfu;->c()J

    move-result-wide v0

    iget-wide v2, p0, Lo/dfz;->h:J

    cmp-long v0, v0, v2

    if-gtz v0, :cond_2

    .line 921
    invoke-virtual {v8}, Lo/dfu;->a()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 922
    invoke-direct {p0, p1, v8}, Lo/dfz;->b(Lo/dfv;Lo/dfu;)V

    goto :goto_1

    .line 924
    :cond_0
    invoke-virtual {v8}, Lo/dfu;->b()I

    move-result v0

    const/4 v1, 0x7

    if-eq v0, v1, :cond_1

    .line 925
    invoke-virtual {v8}, Lo/dfu;->b()I

    move-result v0

    const/4 v1, 0x6

    if-ne v0, v1, :cond_3

    .line 926
    :cond_1
    invoke-virtual {v8}, Lo/dfu;->c()J

    move-result-wide v0

    iget-wide v2, p0, Lo/dfz;->h:J

    const-wide/16 v4, 0x708

    sub-long/2addr v2, v4

    cmp-long v0, v0, v2

    if-lez v0, :cond_3

    .line 927
    invoke-direct {p0, p1, v8}, Lo/dfz;->b(Lo/dfv;Lo/dfu;)V

    goto :goto_1

    .line 930
    :cond_2
    invoke-direct {p0, p1, v8}, Lo/dfz;->e(Lo/dfv;Lo/dfu;)V

    .line 932
    :cond_3
    :goto_1
    goto :goto_0

    .line 933
    :cond_4
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_5

    .line 934
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-interface {v6, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/dfu;

    invoke-virtual {v0}, Lo/dfu;->c()J

    move-result-wide v7

    .line 935
    iget-wide v0, p0, Lo/dfz;->i:J

    cmp-long v0, v7, v0

    if-lez v0, :cond_5

    .line 937
    iput-wide v7, p0, Lo/dfz;->i:J

    .line 940
    :cond_5
    return-void
.end method

.method public b(Ljava/util/List;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/dfw;>;)V"
        }
    .end annotation

    .line 831
    const/4 v5, 0x0

    .line 832
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 833
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Total:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 834
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lo/dfw;

    .line 835
    const-string v0, "[i:"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 836
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 837
    const-string v0, "]"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 838
    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 839
    add-int/lit8 v5, v5, 0x1

    .line 840
    goto :goto_0

    .line 841
    :cond_0
    const-string v0, "05"

    const-string v1, "FitnessMgrAW70Storage"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 842
    return-void
.end method

.method public b(Lo/dfv;Ljava/util/List;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/dfv;Ljava/util/List<Lo/dfx;>;)V"
        }
    .end annotation

    .line 943
    const-string v0, "05"

    const-string v1, "FitnessMgrAW70Storage"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "saveStatusFrameList enter"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 945
    invoke-static {p1}, Lo/dgc;->e(Lo/dfv;)J

    move-result-wide v0

    iput-wide v0, p0, Lo/dfz;->h:J

    .line 946
    iget-wide v0, p0, Lo/dfz;->h:J

    iput-wide v0, p0, Lo/dfz;->i:J

    .line 947
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/dfx;

    .line 948
    invoke-virtual {p0, p1, v6}, Lo/dfz;->a(Lo/dfv;Lo/dfx;)V

    .line 949
    goto :goto_0

    .line 950
    :cond_0
    return-void
.end method

.method public b(Lo/dfv;Ljava/util/List;Ljava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/dfv;Ljava/util/List<Lo/dfq;>;Ljava/util/List<Lo/dfx;>;)V"
        }
    .end annotation

    .line 846
    const-string v0, "05"

    const-string v1, "FitnessMgrAW70Storage"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "saveFitnessData in SEPARATED type"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 849
    new-instance v5, Lo/dga;

    invoke-direct {v5}, Lo/dga;-><init>()V

    .line 850
    invoke-virtual {v5, p1}, Lo/dga;->b(Lo/dfv;)Lo/dfa;

    move-result-object v0

    iput-object v0, p0, Lo/dfz;->k:Lo/dfa;

    .line 851
    iget-object v0, p0, Lo/dfz;->k:Lo/dfa;

    invoke-virtual {v0}, Lo/dfa;->a()J

    move-result-wide v0

    iput-wide v0, p0, Lo/dfz;->g:J

    .line 852
    invoke-virtual {p0}, Lo/dfz;->a()V

    .line 853
    invoke-virtual {p0, p1, p2}, Lo/dfz;->c(Lo/dfv;Ljava/util/List;)V

    .line 854
    invoke-virtual {p0, p1, p3}, Lo/dfz;->b(Lo/dfv;Ljava/util/List;)V

    .line 856
    invoke-virtual {p0, p1}, Lo/dfz;->a(Lo/dfv;)V

    .line 857
    return-void
.end method

.method public b(Lo/dfv;Lo/dfp;)V
    .locals 18

    .line 171
    const-string v0, "05"

    const-string v1, "FitnessMgrAW70Storage"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "saveTodayTotalData get data success total cal="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual/range {p2 .. p2}, Lo/dfp;->d()I

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 173
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 174
    new-instance v9, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;

    invoke-direct {v9}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;-><init>()V

    .line 176
    invoke-interface {v8}, Ljava/util/List;->clear()V

    .line 178
    invoke-virtual/range {p2 .. p2}, Lo/dfp;->a()Ljava/util/List;

    move-result-object v10

    .line 179
    new-instance v11, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalData;

    invoke-direct {v11}, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalData;-><init>()V

    .line 180
    invoke-virtual/range {p2 .. p2}, Lo/dfp;->d()I

    move-result v0

    mul-int/lit16 v0, v0, 0x3e8

    invoke-virtual {v11, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalData;->setCalorie(I)V

    .line 181
    invoke-interface {v10}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :goto_0
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Lcom/huawei/hwcommonmodel/fitnessdatatype/DataTotalMotion;

    .line 182
    const-string v0, "FitnessMgrAW70Storage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "type"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v13}, Lcom/huawei/hwcommonmodel/fitnessdatatype/DataTotalMotion;->getMotion_type()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " step= "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v13}, Lcom/huawei/hwcommonmodel/fitnessdatatype/DataTotalMotion;->getStep()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " cal="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    .line 183
    invoke-virtual {v13}, Lcom/huawei/hwcommonmodel/fitnessdatatype/DataTotalMotion;->getCalorie()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " distance="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v13}, Lcom/huawei/hwcommonmodel/fitnessdatatype/DataTotalMotion;->getDistance()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    .line 182
    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 185
    invoke-virtual {v13}, Lcom/huawei/hwcommonmodel/fitnessdatatype/DataTotalMotion;->getMotion_type()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_2

    .line 187
    :pswitch_0
    invoke-virtual {v13}, Lcom/huawei/hwcommonmodel/fitnessdatatype/DataTotalMotion;->getStep()I

    move-result v0

    invoke-virtual {v11, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalData;->addSteps(I)V

    .line 188
    invoke-virtual {v13}, Lcom/huawei/hwcommonmodel/fitnessdatatype/DataTotalMotion;->getDistance()I

    move-result v0

    invoke-virtual {v11, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalData;->addDistance(I)V

    .line 189
    new-instance v14, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalData;

    invoke-direct {v14, v13}, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalData;-><init>(Lcom/huawei/hwcommonmodel/fitnessdatatype/DataTotalMotion;)V

    .line 190
    invoke-interface {v8, v14}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 191
    goto/16 :goto_2

    .line 193
    :pswitch_1
    invoke-virtual {v13}, Lcom/huawei/hwcommonmodel/fitnessdatatype/DataTotalMotion;->getStep()I

    move-result v0

    invoke-virtual {v11, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalData;->addSteps(I)V

    .line 194
    invoke-virtual {v13}, Lcom/huawei/hwcommonmodel/fitnessdatatype/DataTotalMotion;->getDistance()I

    move-result v0

    invoke-virtual {v11, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalData;->addDistance(I)V

    .line 195
    new-instance v15, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalData;

    invoke-direct {v15, v13}, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalData;-><init>(Lcom/huawei/hwcommonmodel/fitnessdatatype/DataTotalMotion;)V

    .line 196
    invoke-interface {v8, v15}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 197
    goto/16 :goto_2

    .line 199
    :pswitch_2
    invoke-virtual {v13}, Lcom/huawei/hwcommonmodel/fitnessdatatype/DataTotalMotion;->getStep()I

    move-result v0

    invoke-virtual {v11, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalData;->addSteps(I)V

    .line 200
    new-instance v0, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalData;

    move-object v1, v13

    invoke-direct {v0, v1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalData;-><init>(Lcom/huawei/hwcommonmodel/fitnessdatatype/DataTotalMotion;)V

    move-object/from16 v16, v0

    .line 202
    invoke-virtual/range {p1 .. p1}, Lo/dfv;->d()Z

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_0

    .line 203
    invoke-virtual {v13}, Lcom/huawei/hwcommonmodel/fitnessdatatype/DataTotalMotion;->getDistance()I

    move-result v0

    invoke-virtual {v11, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalData;->setHeight(I)V

    .line 204
    invoke-virtual/range {v16 .. v16}, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalData;->getDistance()I

    move-result v0

    move-object/from16 v1, v16

    invoke-virtual {v1, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalData;->setHeight(I)V

    .line 205
    move-object/from16 v0, v16

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalData;->setDistance(I)V

    goto :goto_1

    .line 207
    :cond_0
    invoke-virtual/range {v16 .. v16}, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalData;->getHeight()I

    move-result v0

    move-object/from16 v1, v16

    invoke-virtual {v1, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalData;->setHeight(I)V

    .line 208
    invoke-virtual/range {v16 .. v16}, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalData;->getDistance()I

    move-result v0

    move-object/from16 v1, v16

    invoke-virtual {v1, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalData;->setDistance(I)V

    .line 209
    invoke-virtual {v13}, Lcom/huawei/hwcommonmodel/fitnessdatatype/DataTotalMotion;->getHeight()I

    move-result v0

    invoke-virtual {v11, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalData;->setHeight(I)V

    .line 210
    invoke-virtual {v13}, Lcom/huawei/hwcommonmodel/fitnessdatatype/DataTotalMotion;->getDistance()I

    move-result v0

    invoke-virtual {v11, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalData;->addDistance(I)V

    .line 212
    :goto_1
    move-object/from16 v0, v16

    invoke-interface {v8, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 213
    goto :goto_2

    .line 215
    :pswitch_3
    new-instance v0, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalData;

    move-object v1, v13

    invoke-direct {v0, v1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalData;-><init>(Lcom/huawei/hwcommonmodel/fitnessdatatype/DataTotalMotion;)V

    move-object/from16 v17, v0

    .line 216
    invoke-virtual {v13}, Lcom/huawei/hwcommonmodel/fitnessdatatype/DataTotalMotion;->getDistance()I

    move-result v0

    invoke-virtual {v11, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalData;->addDistance(I)V

    .line 217
    move-object/from16 v0, v17

    invoke-interface {v8, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 218
    goto :goto_2

    .line 220
    :pswitch_4
    goto :goto_2

    .line 222
    :pswitch_5
    invoke-virtual {v13}, Lcom/huawei/hwcommonmodel/fitnessdatatype/DataTotalMotion;->getSleep_time()I

    move-result v0

    invoke-virtual {v9, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->setShallowSleepTime(I)V

    .line 223
    goto :goto_2

    .line 225
    :pswitch_6
    invoke-virtual {v13}, Lcom/huawei/hwcommonmodel/fitnessdatatype/DataTotalMotion;->getSleep_time()I

    move-result v0

    invoke-virtual {v9, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->setDeepSleepTime(I)V

    .line 226
    .line 231
    :goto_2
    goto/16 :goto_0

    .line 233
    :cond_1
    invoke-interface {v8, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 234
    const-string v0, "05"

    const-string v1, "FitnessMgrAW70Storage"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "saveTodayTotalData steps ="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v11}, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalData;->getSteps()I

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, " calorie ="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    .line 235
    invoke-virtual {v11}, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalData;->getCalorie()I

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, " distance ="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    .line 236
    invoke-virtual {v11}, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalData;->getDistance()I

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "size="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    .line 234
    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 238
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-virtual {v0, v1, v11}, Lo/dfz;->a(Lo/dfv;Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalData;)V

    .line 239
    const-string v12, ""

    .line 240
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dde;->d(Landroid/content/Context;)Lo/dde;

    move-result-object v0

    invoke-virtual {v0}, Lo/dde;->b()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v13

    .line 241
    const/4 v0, 0x0

    if-eq v0, v13, :cond_2

    .line 242
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v13}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    .line 244
    :cond_2
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0x2718

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "KEY_TOTAL_STEPS_FROM_DEVICE_FLAG"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 245
    invoke-virtual {v11}, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalData;->getSteps()I

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "|"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    const-wide/16 v6, 0x3e8

    div-long/2addr v4, v6

    invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    .line 244
    const/4 v4, 0x0

    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 246
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0x2718

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "KEY_TOTAL_CAL_FROM_DEVICE_FLAG"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 247
    invoke-virtual {v11}, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalData;->getCalorie()I

    move-result v4

    div-int/lit16 v4, v4, 0x3e8

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "|"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    const-wide/16 v6, 0x3e8

    div-long/2addr v4, v6

    invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    .line 246
    const/4 v4, 0x0

    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 248
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0x2718

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "KEY_TOTAL_DISTANCE_FROM_DEVICE_FLAG"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 249
    invoke-virtual {v11}, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalData;->getDistance()I

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "|"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    const-wide/16 v6, 0x3e8

    div-long/2addr v4, v6

    invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    .line 248
    const/4 v4, 0x0

    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 250
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
    .end packed-switch
.end method

.method public c(I)V
    .locals 6

    .line 1080
    const-string v0, "05"

    const-string v1, "FitnessMgrAW70Storage"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "procSaveDataComplete enter errCode"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1081
    if-nez p1, :cond_0

    .line 1082
    invoke-virtual {p0}, Lo/dfz;->e()V

    .line 1084
    :cond_0
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dfv;->b(Landroid/content/Context;)Lo/dfv;

    move-result-object v5

    .line 1085
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Lo/dfv;->e(I)V

    .line 1086
    return-void
.end method

.method public c(Lo/dfv;Ljava/util/List;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/dfv;Ljava/util/List<Lo/dfq;>;)V"
        }
    .end annotation

    .line 887
    const-string v0, "05"

    const-string v1, "FitnessMgrAW70Storage"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "saveSampleFrameList enter"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 890
    new-instance v0, Lo/dfz$4;

    invoke-direct {v0, p0}, Lo/dfz$4;-><init>(Lo/dfz;)V

    invoke-static {p2, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 895
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/dfq;

    .line 896
    invoke-virtual {p0, p1, v6}, Lo/dfz;->d(Lo/dfv;Lo/dfq;)V

    .line 897
    goto :goto_0

    .line 898
    :cond_0
    return-void
.end method

.method public d(Lo/dfv;)V
    .locals 4

    .line 142
    const-string v0, "FitnessMgrAW70Storage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initFitnessUserStorage."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 143
    return-void
.end method

.method public d(Lo/dfv;Lo/dfq;)V
    .locals 7

    .line 862
    invoke-virtual {p2}, Lo/dfq;->a()Ljava/util/List;

    move-result-object v4

    .line 863
    invoke-virtual {p0, v4}, Lo/dfz;->b(Ljava/util/List;)V

    .line 867
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/dfw;

    .line 868
    iget-wide v0, p0, Lo/dfz;->g:J

    invoke-virtual {v6}, Lo/dfw;->e()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-ltz v0, :cond_0

    .line 870
    invoke-virtual {v6}, Lo/dfw;->d()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 871
    invoke-direct {p0, p1, v6}, Lo/dfz;->c(Lo/dfv;Lo/dfw;)V

    goto :goto_1

    .line 875
    :cond_0
    invoke-direct {p0, p1, v6}, Lo/dfz;->b(Lo/dfv;Lo/dfw;)V

    .line 877
    :cond_1
    :goto_1
    goto :goto_0

    .line 878
    :cond_2
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_3

    .line 879
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-interface {v4, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/dfw;

    invoke-virtual {v0}, Lo/dfw;->e()J

    move-result-wide v5

    .line 880
    iget-object v0, p0, Lo/dfz;->k:Lo/dfa;

    invoke-virtual {v0}, Lo/dfa;->a()J

    move-result-wide v0

    cmp-long v0, v0, v5

    if-gez v0, :cond_3

    .line 881
    iget-object v0, p0, Lo/dfz;->k:Lo/dfa;

    invoke-virtual {v0, v5, v6}, Lo/dfa;->a(J)V

    .line 884
    :cond_3
    return-void
.end method

.method public e()V
    .locals 4

    .line 1073
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dfv;->b(Landroid/content/Context;)Lo/dfv;

    move-result-object v2

    .line 1074
    new-instance v3, Lo/dga;

    invoke-direct {v3}, Lo/dga;-><init>()V

    .line 1075
    iget-object v0, p0, Lo/dfz;->k:Lo/dfa;

    invoke-virtual {v3, v2, v0}, Lo/dga;->a(Lo/dfv;Lo/dfa;)V

    .line 1076
    iget-wide v0, p0, Lo/dfz;->i:J

    invoke-static {v2, v0, v1}, Lo/dgc;->b(Lo/dfv;J)V

    .line 1077
    return-void
.end method

.method public e(Lo/dfv;)V
    .locals 3

    .line 123
    new-instance v0, Lo/dgd;

    invoke-direct {v0}, Lo/dgd;-><init>()V

    .line 124
    invoke-virtual {v0, p1}, Lo/dgd;->e(Lo/dfv;)V

    .line 127
    new-instance v1, Lo/dfy;

    invoke-direct {v1}, Lo/dfy;-><init>()V

    .line 128
    invoke-virtual {v1, p1}, Lo/dfy;->c(Lo/dfv;)V

    .line 131
    new-instance v2, Lo/dga;

    invoke-direct {v2}, Lo/dga;-><init>()V

    .line 132
    invoke-virtual {v2, p1}, Lo/dga;->e(Lo/dfv;)V

    .line 134
    return-void
.end method
