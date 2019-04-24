.class public Lo/ctl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/ctj;


# instance fields
.field private a:Landroid/content/Context;

.field private b:Lo/cpw;

.field private c:Lo/cqa;

.field private d:I

.field private e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/crd;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/huawei/hihealth/HiSyncOption;II)V
    .locals 4

    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 44
    const-string v0, "HiH_HiSyncClient"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HiSyncClient create"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 45
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lo/ctl;->a:Landroid/content/Context;

    .line 46
    iput p3, p0, Lo/ctl;->d:I

    .line 47
    invoke-direct {p0}, Lo/ctl;->e()V

    .line 48
    return-void
.end method

.method private a(Lo/crd;)Lcom/huawei/hwcloudmodel/model/userprofile/BindDeviceReq;
    .locals 7

    .line 62
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 63
    :cond_0
    iget-object v0, p0, Lo/ctl;->c:Lo/cqa;

    invoke-virtual {p1}, Lo/crd;->c()I

    move-result v1

    invoke-virtual {v0, v1}, Lo/cqa;->d(I)Lcom/huawei/hihealth/HiDeviceInfo;

    move-result-object v4

    .line 64
    const/4 v0, 0x0

    if-ne v0, v4, :cond_1

    .line 65
    const-string v0, "HiH_HiSyncClient"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "createBindDeviceReq get no hiDeviceInfo from DB"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 66
    const/4 v0, 0x0

    return-object v0

    .line 68
    :cond_1
    new-instance v5, Lcom/huawei/hwcloudmodel/model/userprofile/BindDeviceReq;

    invoke-direct {v5}, Lcom/huawei/hwcloudmodel/model/userprofile/BindDeviceReq;-><init>()V

    .line 71
    invoke-virtual {v4}, Lcom/huawei/hihealth/HiDeviceInfo;->getDeviceType()I

    move-result v0

    invoke-direct {p0, v0}, Lo/ctl;->c(I)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 72
    const-string v0, "HiH_HiSyncClient"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "createBindDeviceReq device productid is error, productid="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Lcom/huawei/hihealth/HiDeviceInfo;->getDeviceType()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 73
    const/4 v0, 0x0

    return-object v0

    .line 75
    :cond_2
    invoke-virtual {v4}, Lcom/huawei/hihealth/HiDeviceInfo;->getModel()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 76
    new-instance v6, Landroid/content/ContentValues;

    invoke-direct {v6}, Landroid/content/ContentValues;-><init>()V

    .line 77
    const-string v0, "model"

    invoke-virtual {v4}, Lcom/huawei/hihealth/HiDeviceInfo;->getModel()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v6, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 78
    invoke-static {v6}, Lo/cnj;->d(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/hwcloudmodel/model/userprofile/BindDeviceReq;->setDeviceData(Ljava/lang/String;)V

    .line 80
    :cond_3
    invoke-virtual {v4}, Lcom/huawei/hihealth/HiDeviceInfo;->getDeviceType()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/hwcloudmodel/model/userprofile/BindDeviceReq;->setProductId(Ljava/lang/Integer;)V

    .line 81
    invoke-virtual {v4}, Lcom/huawei/hihealth/HiDeviceInfo;->getDeviceUniqueCode()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/hwcloudmodel/model/userprofile/BindDeviceReq;->setUniqueId(Ljava/lang/String;)V

    .line 82
    invoke-virtual {v4}, Lcom/huawei/hihealth/HiDeviceInfo;->getDeviceName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/hwcloudmodel/model/userprofile/BindDeviceReq;->setName(Ljava/lang/String;)V

    .line 83
    invoke-virtual {v4}, Lcom/huawei/hihealth/HiDeviceInfo;->getFirmwareVersion()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/hwcloudmodel/model/userprofile/BindDeviceReq;->setFirmwareVersion(Ljava/lang/String;)V

    .line 84
    invoke-virtual {v4}, Lcom/huawei/hihealth/HiDeviceInfo;->getHardwareVersion()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/hwcloudmodel/model/userprofile/BindDeviceReq;->setHardwareVersion(Ljava/lang/String;)V

    .line 85
    invoke-virtual {v4}, Lcom/huawei/hihealth/HiDeviceInfo;->getSoftwareVersion()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/hwcloudmodel/model/userprofile/BindDeviceReq;->setSoftwareVersion(Ljava/lang/String;)V

    .line 86
    invoke-virtual {v4}, Lcom/huawei/hihealth/HiDeviceInfo;->getManufacturer()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/hwcloudmodel/model/userprofile/BindDeviceReq;->setManufacturer(Ljava/lang/String;)V

    .line 88
    invoke-virtual {v4}, Lcom/huawei/hihealth/HiDeviceInfo;->getDeviceUniqueCode()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_4

    .line 89
    const-string v0, "HiH_HiSyncClient"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "binddevice deviceUUID is null !"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 91
    :cond_4
    return-object v5
.end method

.method private c(Lo/crd;Lcom/huawei/hwcloudmodel/model/userprofile/BindDeviceReq;)V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 108
    const-string v0, "HiH_HiSyncClient"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "bindDevice start bindDevice , device name is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p2}, Lcom/huawei/hwcloudmodel/model/userprofile/BindDeviceReq;->getName()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " product is "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-virtual {p2}, Lcom/huawei/hwcloudmodel/model/userprofile/BindDeviceReq;->getProductId()Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 109
    iget-object v0, p0, Lo/ctl;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/czg;->e(Landroid/content/Context;)Lo/czg;

    move-result-object v0

    invoke-virtual {v0, p2}, Lo/czg;->e(Lcom/huawei/hwcloudmodel/model/userprofile/BindDeviceReq;)Lcom/huawei/hwcloudmodel/model/userprofile/BindDeviceRsp;

    move-result-object v4

    .line 110
    const/4 v0, 0x0

    invoke-static {v4, v0}, Lo/csn;->e(Lcom/huawei/hwcloudmodel/model/CloudCommonReponse;Z)Z

    move-result v0

    if-nez v0, :cond_0

    .line 111
    const-string v0, "HiH_HiSyncClient"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "bindDevice error"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 112
    return-void

    .line 114
    :cond_0
    invoke-virtual {v4}, Lcom/huawei/hwcloudmodel/model/userprofile/BindDeviceRsp;->getDeviceCode()Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    .line 115
    const-wide/16 v0, 0x0

    cmp-long v0, v5, v0

    if-gtz v0, :cond_1

    .line 116
    const-string v0, "HiH_HiSyncClient"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "bindDevice error ans from cloud, deviceCode is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " client is "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 117
    return-void

    .line 119
    :cond_1
    invoke-virtual {p1, v5, v6}, Lo/crd;->c(J)V

    .line 120
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lo/crd;->c(I)V

    .line 121
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lo/crd;->f(I)V

    .line 122
    iget-object v0, p0, Lo/ctl;->b:Lo/cpw;

    invoke-virtual {v0, p1}, Lo/cpw;->e(Lo/crd;)J

    .line 123
    return-void
.end method

.method private c(I)Z
    .locals 1

    .line 95
    const/16 v0, 0x15

    if-le v0, p1, :cond_0

    const/4 v0, 0x1

    if-eq v0, p1, :cond_0

    .line 96
    const/4 v0, 0x1

    return v0

    .line 98
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method private e()V
    .locals 3

    .line 51
    iget-object v0, p0, Lo/ctl;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/cpw;->e(Landroid/content/Context;)Lo/cpw;

    move-result-object v0

    iput-object v0, p0, Lo/ctl;->b:Lo/cpw;

    .line 52
    iget-object v0, p0, Lo/ctl;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/cqa;->a(Landroid/content/Context;)Lo/cqa;

    move-result-object v0

    iput-object v0, p0, Lo/ctl;->c:Lo/cqa;

    .line 53
    iget-object v0, p0, Lo/ctl;->b:Lo/cpw;

    iget v1, p0, Lo/ctl;->d:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lo/cpw;->b(II)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lo/ctl;->e:Ljava/util/List;

    .line 54
    return-void
.end method


# virtual methods
.method public a()V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 132
    const-string v0, "HiH_HiSyncClient"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "pushData() begin !"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 133
    invoke-static {}, Lo/csk;->g()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 134
    const-string v0, "HiH_HiSyncClient"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "pushData() dataPrivacy switch is closed ,can not pushData right now ,push end !"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 135
    return-void

    .line 137
    :cond_0
    iget-object v0, p0, Lo/ctl;->e:Ljava/util/List;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lo/ctl;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 138
    :cond_1
    const-string v0, "HiH_HiSyncClient"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "pushData() end ! no device needed to bindDevice to cloud, stop pushData"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 139
    return-void

    .line 142
    :cond_2
    iget-object v0, p0, Lo/ctl;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/crd;

    .line 143
    invoke-direct {p0, v6}, Lo/ctl;->a(Lo/crd;)Lcom/huawei/hwcloudmodel/model/userprofile/BindDeviceReq;

    move-result-object v4

    .line 144
    const/4 v0, 0x0

    if-eq v0, v4, :cond_3

    .line 145
    invoke-direct {p0, v6, v4}, Lo/ctl;->c(Lo/crd;Lcom/huawei/hwcloudmodel/model/userprofile/BindDeviceReq;)V

    .line 147
    :cond_3
    goto :goto_0

    .line 148
    :cond_4
    const-string v0, "HiH_HiSyncClient"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "pushData() end !"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 149
    return-void
.end method

.method public d()V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 161
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 153
    new-instance v1, Ljava/lang/StringBuffer;

    const-string v0, "--HiSyncClient{"

    invoke-direct {v1, v0}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V

    .line 154
    const/16 v0, 0x7d

    invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 155
    invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
