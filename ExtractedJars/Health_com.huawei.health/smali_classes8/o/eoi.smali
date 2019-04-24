.class public Lo/eoi;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static b:Lo/cxd;

.field private static c:Lo/dde;

.field private static e:Lo/cxf;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 30
    const/4 v0, 0x0

    sput-object v0, Lo/eoi;->c:Lo/dde;

    .line 34
    const/4 v0, 0x0

    sput-object v0, Lo/eoi;->b:Lo/cxd;

    .line 35
    const/4 v0, 0x0

    sput-object v0, Lo/eoi;->e:Lo/cxf;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 53
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 54
    return-void
.end method

.method static synthetic a()Lo/cxd;
    .locals 1

    .line 25
    sget-object v0, Lo/eoi;->b:Lo/cxd;

    return-object v0
.end method

.method private static c()Lo/dde;
    .locals 1

    .line 38
    sget-object v0, Lo/eoi;->c:Lo/dde;

    return-object v0
.end method

.method static synthetic d()Lo/cxf;
    .locals 1

    .line 25
    invoke-static {}, Lo/eoi;->e()Lo/cxf;

    move-result-object v0

    return-object v0
.end method

.method private static d(Lo/cxf;)V
    .locals 0

    .line 50
    sput-object p0, Lo/eoi;->e:Lo/cxf;

    .line 51
    return-void
.end method

.method private static e()Lo/cxf;
    .locals 1

    .line 46
    sget-object v0, Lo/eoi;->e:Lo/cxf;

    return-object v0
.end method

.method private static e(Lo/dde;)V
    .locals 0

    .line 42
    sput-object p0, Lo/eoi;->c:Lo/dde;

    .line 43
    return-void
.end method


# virtual methods
.method public c(Ljava/lang/String;Landroid/content/Context;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 6

    .line 61
    invoke-static {}, Lo/eoi;->e()Lo/cxf;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 62
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    invoke-static {v0}, Lo/eoi;->d(Lo/cxf;)V

    .line 66
    :cond_0
    invoke-static {}, Lo/eoi;->c()Lo/dde;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 67
    invoke-static {p2}, Lo/dde;->d(Landroid/content/Context;)Lo/dde;

    move-result-object v0

    invoke-static {v0}, Lo/eoi;->e(Lo/dde;)V

    .line 70
    :cond_1
    sget-object v0, Lo/eoi;->b:Lo/cxd;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_2

    .line 71
    new-instance v0, Lo/cxd;

    invoke-direct {v0}, Lo/cxd;-><init>()V

    sput-object v0, Lo/eoi;->b:Lo/cxd;

    .line 76
    :cond_2
    const-string v0, "WearBIUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "huid = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {p2}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v3

    invoke-virtual {v3}, Lcom/huawei/login/ui/login/LoginInit;->getUsetId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 78
    invoke-static {}, Lo/eoi;->c()Lo/dde;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/dde;->b(Ljava/lang/String;)Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v4

    .line 79
    const/4 v0, 0x0

    if-eq v0, v4, :cond_9

    .line 81
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 83
    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getSecDeviceID()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/ddy;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 84
    const-string v0, "\\"

    const-string v1, "+"

    invoke-virtual {v5, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v5

    .line 85
    const-string v0, "/"

    const-string v1, "+"

    invoke-virtual {v5, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v5

    .line 86
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x18

    if-lt v0, v1, :cond_3

    .line 87
    const/4 v0, 0x0

    const/16 v1, 0x18

    invoke-virtual {v5, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v5

    .line 89
    :cond_3
    sget-object v0, Lo/eoi;->b:Lo/cxd;

    invoke-virtual {v0, v5}, Lo/cxd;->d(Ljava/lang/String;)V

    .line 90
    goto :goto_0

    :cond_4
    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDevIdType()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_5

    .line 92
    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getSecDeviceID()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/ddy;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 93
    const-string v0, "\\"

    const-string v1, "+"

    invoke-virtual {v5, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v5

    .line 94
    const-string v0, "/"

    const-string v1, "+"

    invoke-virtual {v5, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v5

    .line 95
    sget-object v0, Lo/eoi;->b:Lo/cxd;

    invoke-virtual {v0, v5}, Lo/cxd;->d(Ljava/lang/String;)V

    .line 96
    goto :goto_0

    .line 97
    :cond_5
    sget-object v0, Lo/eoi;->b:Lo/cxd;

    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/cxd;->d(Ljava/lang/String;)V

    .line 99
    :goto_0
    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v0

    const/16 v1, 0xb

    if-ne v1, v0, :cond_6

    const-string v0, "HUAWEI CM-R1P"

    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 101
    sget-object v0, Lo/eoi;->b:Lo/cxd;

    const-string v1, "R1-PRO"

    invoke-virtual {v0, v1}, Lo/cxd;->c(Ljava/lang/String;)V

    goto :goto_1

    .line 102
    :cond_6
    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v0

    const/16 v1, 0xa

    if-ne v0, v1, :cond_8

    .line 103
    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "PORSCHE DESIGN"

    invoke-static {v0, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_7

    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceModel()Ljava/lang/String;

    move-result-object v0

    const-string v1, "PORSCHE DESIGN"

    invoke-static {v0, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 105
    :cond_7
    sget-object v0, Lo/eoi;->b:Lo/cxd;

    const-string v1, "PORSCHE DESIGN"

    invoke-virtual {v0, v1}, Lo/cxd;->c(Ljava/lang/String;)V

    goto :goto_1

    .line 107
    :cond_8
    sget-object v0, Lo/eoi;->b:Lo/cxd;

    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v1

    invoke-static {v1}, Lo/eny;->c(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/cxd;->c(Ljava/lang/String;)V

    .line 110
    :goto_1
    const-string v0, "WearBIUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "setBIAnalyticsData.getUUID = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getUUID()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 111
    const-string v0, "WearBIUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "setBIAnalyticsData.getUUID = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    sget-object v3, Lo/eoi;->b:Lo/cxd;

    invoke-virtual {v3}, Lo/cxd;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 115
    :cond_9
    invoke-static {}, Lo/eoi;->c()Lo/dde;

    move-result-object v0

    new-instance v1, Lo/eoi$5;

    invoke-direct {v1, p0, v4, p3}, Lo/eoi$5;-><init>(Lo/eoi;Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    invoke-virtual {v0, p1, v1}, Lo/dde;->e(Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 145
    return-void
.end method
