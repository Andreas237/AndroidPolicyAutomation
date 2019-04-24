.class public Lo/der;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static volatile a:Lo/der;


# instance fields
.field private final b:Lo/dde;

.field private c:Lo/dqi;

.field private final d:Lo/czg;

.field private e:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 46
    const/4 v0, 0x0

    sput-object v0, Lo/der;->a:Lo/der;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 4

    .line 64
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 65
    const-string v0, "UIDV_FitnessCloud"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "RecommendCloud"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 66
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lo/der;->e:Landroid/content/Context;

    .line 67
    iget-object v0, p0, Lo/der;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/dde;->d(Landroid/content/Context;)Lo/dde;

    move-result-object v0

    iput-object v0, p0, Lo/der;->b:Lo/dde;

    .line 68
    iget-object v0, p0, Lo/der;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/czg;->e(Landroid/content/Context;)Lo/czg;

    move-result-object v0

    iput-object v0, p0, Lo/der;->d:Lo/czg;

    .line 69
    iget-object v0, p0, Lo/der;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/dqi;->b(Landroid/content/Context;)Lo/dqi;

    move-result-object v0

    iput-object v0, p0, Lo/der;->c:Lo/dqi;

    .line 70
    return-void
.end method

.method static synthetic a(Lo/der;)Lo/czg;
    .locals 1

    .line 41
    iget-object v0, p0, Lo/der;->d:Lo/czg;

    return-object v0
.end method

.method private a(Lcom/huawei/hwcloudmodel/model/userprofile/BindDeviceRsp;Ljava/lang/String;Lo/dgg;)V
    .locals 2

    .line 105
    iget-object v0, p0, Lo/der;->b:Lo/dde;

    new-instance v1, Lo/der$3;

    invoke-direct {v1, p0, p1, p2, p3}, Lo/der$3;-><init>(Lo/der;Lcom/huawei/hwcloudmodel/model/userprofile/BindDeviceRsp;Ljava/lang/String;Lo/dgg;)V

    invoke-virtual {v0, v1}, Lo/dde;->d(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 154
    return-void
.end method

.method static synthetic b(Lo/der;)Lo/dde;
    .locals 1

    .line 41
    iget-object v0, p0, Lo/der;->b:Lo/dde;

    return-object v0
.end method

.method private b(Ljava/lang/String;Lo/dgg;)V
    .locals 5

    .line 253
    const-string v0, "UIDV_FitnessCloud"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "requestStopDeviceLinkage\u3000devid\u3000"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 254
    new-instance v4, Lcom/huawei/hwcloudmodel/model/intelligent/StopDeviceLinkageReq;

    invoke-direct {v4}, Lcom/huawei/hwcloudmodel/model/intelligent/StopDeviceLinkageReq;-><init>()V

    .line 255
    invoke-virtual {v4, p1}, Lcom/huawei/hwcloudmodel/model/intelligent/StopDeviceLinkageReq;->setDevId(Ljava/lang/String;)V

    .line 256
    iget-object v0, p0, Lo/der;->d:Lo/czg;

    new-instance v1, Lo/der$7;

    invoke-direct {v1, p0, p2}, Lo/der$7;-><init>(Lo/der;Lo/dgg;)V

    invoke-virtual {v0, v4, v1}, Lo/czg;->c(Lcom/huawei/hwcloudmodel/model/intelligent/StopDeviceLinkageReq;Lo/cyx;)V

    .line 262
    return-void
.end method

.method static synthetic b(Lo/der;Ljava/lang/String;Lo/dgg;)V
    .locals 0

    .line 41
    invoke-direct {p0, p1, p2}, Lo/der;->b(Ljava/lang/String;Lo/dgg;)V

    return-void
.end method

.method static synthetic d(Lo/der;)Landroid/content/Context;
    .locals 1

    .line 41
    iget-object v0, p0, Lo/der;->e:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic d(Lo/der;Lcom/huawei/hwcloudmodel/model/userprofile/BindDeviceRsp;Ljava/lang/String;Lo/dgg;)V
    .locals 0

    .line 41
    invoke-direct {p0, p1, p2, p3}, Lo/der;->a(Lcom/huawei/hwcloudmodel/model/userprofile/BindDeviceRsp;Ljava/lang/String;Lo/dgg;)V

    return-void
.end method

.method public static e(Landroid/content/Context;)Lo/der;
    .locals 6

    .line 53
    const-string v0, "UIDV_FitnessCloud"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getInstance"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 54
    sget-object v0, Lo/der;->a:Lo/der;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 55
    const-class v4, Lo/der;

    monitor-enter v4

    .line 56
    :try_start_0
    sget-object v0, Lo/der;->a:Lo/der;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 57
    new-instance v0, Lo/der;

    invoke-direct {v0, p0}, Lo/der;-><init>(Landroid/content/Context;)V

    sput-object v0, Lo/der;->a:Lo/der;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 59
    :cond_0
    monitor-exit v4

    goto :goto_0

    :catchall_0
    move-exception v5

    monitor-exit v4

    throw v5

    .line 61
    :cond_1
    :goto_0
    sget-object v0, Lo/der;->a:Lo/der;

    return-object v0
.end method


# virtual methods
.method public b(Lo/dgg;)V
    .locals 3

    .line 78
    iget-object v0, p0, Lo/der;->b:Lo/dde;

    invoke-virtual {v0}, Lo/dde;->d()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v2

    .line 79
    if-nez v2, :cond_0

    .line 80
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Lo/dgg;->d(Ljava/lang/Object;)V

    .line 81
    return-void

    .line 83
    :cond_0
    invoke-static {}, Lo/eer;->d()Lo/eer;

    move-result-object v0

    new-instance v1, Lo/der$4;

    invoke-direct {v1, p0, v2, p1}, Lo/der$4;-><init>(Lo/der;Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;Lo/dgg;)V

    invoke-virtual {v0, v1}, Lo/eer;->e(Ljava/lang/Runnable;)V

    .line 101
    return-void
.end method

.method public c(Lo/dgg;)V
    .locals 4

    .line 217
    iget-object v0, p0, Lo/der;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/dde;->d(Landroid/content/Context;)Lo/dde;

    move-result-object v0

    invoke-virtual {v0}, Lo/dde;->d()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v3

    .line 218
    if-nez v3, :cond_0

    .line 219
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Lo/dgg;->d(Ljava/lang/Object;)V

    .line 220
    return-void

    .line 223
    :cond_0
    iget-object v0, p0, Lo/der;->c:Lo/dqi;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "intelligent_home_linkage"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v3}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lo/der$5;

    invoke-direct {v2, p0, p1}, Lo/der$5;-><init>(Lo/der;Lo/dgg;)V

    invoke-virtual {v0, v1, v2}, Lo/dqi;->d(Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 250
    return-void
.end method

.method public d(Ljava/lang/String;Lo/dgg;)V
    .locals 4

    .line 195
    const-string v0, "UIDV_FitnessCloud"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "releaseDeviceLinkage enter\u3000devid\u3000"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 196
    invoke-static {}, Lo/eer;->d()Lo/eer;

    move-result-object v0

    new-instance v1, Lo/der$2;

    invoke-direct {v1, p0, p1, p2}, Lo/der$2;-><init>(Lo/der;Ljava/lang/String;Lo/dgg;)V

    invoke-virtual {v0, v1}, Lo/eer;->e(Ljava/lang/Runnable;)V

    .line 209
    return-void
.end method

.method public e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dgg;)V
    .locals 8

    .line 162
    iget-object v0, p0, Lo/der;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/dfd;->b(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 163
    invoke-static {}, Lo/dfb;->a()Lo/dfb;

    move-result-object v0

    invoke-virtual {v0}, Lo/dfb;->e()V

    .line 165
    :cond_0
    const-string v0, "UIDV_FitnessCloud"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "transDeviceData enter\u3000devid\u3000"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 166
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 167
    new-instance v5, Lcom/huawei/hwcloudmodel/model/intelligent/DeviceServiceInfo;

    invoke-direct {v5}, Lcom/huawei/hwcloudmodel/model/intelligent/DeviceServiceInfo;-><init>()V

    .line 168
    invoke-virtual {v5, p1}, Lcom/huawei/hwcloudmodel/model/intelligent/DeviceServiceInfo;->setSid(Ljava/lang/String;)V

    .line 169
    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    .line 170
    const-string v0, "state"

    invoke-interface {v6, v0, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 171
    invoke-virtual {v5, v6}, Lcom/huawei/hwcloudmodel/model/intelligent/DeviceServiceInfo;->setData(Ljava/util/Map;)V

    .line 172
    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 173
    new-instance v7, Lcom/huawei/hwcloudmodel/model/intelligent/TransDeviceDataReq;

    invoke-direct {v7}, Lcom/huawei/hwcloudmodel/model/intelligent/TransDeviceDataReq;-><init>()V

    .line 174
    invoke-virtual {v7, p3}, Lcom/huawei/hwcloudmodel/model/intelligent/TransDeviceDataReq;->setDevId(Ljava/lang/String;)V

    .line 175
    invoke-virtual {v7, v4}, Lcom/huawei/hwcloudmodel/model/intelligent/TransDeviceDataReq;->setServices(Ljava/util/List;)V

    .line 176
    iget-object v0, p0, Lo/der;->d:Lo/czg;

    new-instance v1, Lo/der$1;

    invoke-direct {v1, p0, p4}, Lo/der$1;-><init>(Lo/der;Lo/dgg;)V

    invoke-virtual {v0, v7, v1}, Lo/czg;->c(Lcom/huawei/hwcloudmodel/model/intelligent/TransDeviceDataReq;Lo/cyx;)V

    .line 187
    return-void
.end method
