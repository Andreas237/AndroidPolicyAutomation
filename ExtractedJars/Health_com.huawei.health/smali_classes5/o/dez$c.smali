.class Lo/dez$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/dez;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "c"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 1830
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lo/dez$2;)V
    .locals 0

    .line 1830
    invoke-direct {p0}, Lo/dez$c;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 7

    .line 1834
    const-string v0, "05"

    const-string v1, "HWFitnessMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "setDeviceHRZoneConf enter "

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1836
    invoke-static {}, Lo/czw;->e()Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    move-result-object v5

    .line 1837
    if-nez v5, :cond_0

    .line 1838
    const-string v0, "HWFitnessMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setDeviceHRZoneConf deviceCapability is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1839
    return-void

    .line 1842
    :cond_0
    invoke-virtual {v5}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportHRZone()Z

    move-result v0

    if-nez v0, :cond_1

    .line 1843
    const-string v0, "HWFitnessMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setDeviceHRZoneConf is not support"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1844
    return-void

    .line 1846
    :cond_1
    invoke-static {}, Lo/dgu;->c()Lo/dgu;

    move-result-object v0

    invoke-virtual {v0}, Lo/dgu;->d()Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;

    move-result-object v6

    .line 1847
    const-string v0, "HWFitnessMgr"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setDeviceHRZoneConf hrZoneConf = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v6, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1848
    invoke-static {v6}, Lo/dfj;->c(Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;)V

    .line 1849
    return-void
.end method
