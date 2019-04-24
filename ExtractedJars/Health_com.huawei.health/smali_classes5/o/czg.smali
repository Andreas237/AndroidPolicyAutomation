.class public Lo/czg;
.super Lo/cwz;
.source "SourceFile"


# static fields
.field private static d:Lo/czg;


# instance fields
.field private e:Lo/czn;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 179
    const/4 v0, 0x0

    sput-object v0, Lo/czg;->d:Lo/czg;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 208
    invoke-direct {p0, p1}, Lo/cwz;-><init>(Landroid/content/Context;)V

    .line 181
    const/4 v0, 0x0

    iput-object v0, p0, Lo/czg;->e:Lo/czn;

    .line 209
    iget-object v0, p0, Lo/czg;->e:Lo/czn;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 211
    invoke-static {p1}, Lo/czn;->e(Landroid/content/Context;)Lo/czn;

    move-result-object v0

    iput-object v0, p0, Lo/czg;->e:Lo/czn;

    .line 213
    :cond_0
    return-void
.end method

.method public static e(Landroid/content/Context;)Lo/czg;
    .locals 2

    .line 196
    sget-object v0, Lo/czg;->d:Lo/czg;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 198
    new-instance v0, Lo/czg;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/czg;-><init>(Landroid/content/Context;)V

    sput-object v0, Lo/czg;->d:Lo/czg;

    .line 200
    :cond_0
    sget-object v0, Lo/czg;->d:Lo/czg;

    return-object v0
.end method


# virtual methods
.method public a(Lcom/huawei/hwcloudmodel/model/unite/AddHealthStatReq;)Lcom/huawei/hwcloudmodel/model/unite/AddHealthStatRsp;
    .locals 2

    .line 409
    iget-object v0, p0, Lo/czg;->e:Lo/czn;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 411
    iget-object v0, p0, Lo/czg;->e:Lo/czn;

    invoke-virtual {v0, p1}, Lo/czn;->d(Lcom/huawei/hwcloudmodel/model/unite/AddHealthStatReq;)Lcom/huawei/hwcloudmodel/model/unite/AddHealthStatRsp;

    move-result-object v0

    return-object v0

    .line 413
    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public a(Lcom/huawei/hwcloudmodel/model/unite/DelMotionPathReq;)Lcom/huawei/hwcloudmodel/model/unite/DelMotionPathRsp;
    .locals 2

    .line 667
    iget-object v0, p0, Lo/czg;->e:Lo/czn;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 669
    iget-object v0, p0, Lo/czg;->e:Lo/czn;

    invoke-virtual {v0, p1}, Lo/czn;->d(Lcom/huawei/hwcloudmodel/model/unite/DelMotionPathReq;)Lcom/huawei/hwcloudmodel/model/unite/DelMotionPathRsp;

    move-result-object v0

    return-object v0

    .line 671
    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public a(Lcom/huawei/hwcloudmodel/model/unite/GetHealthDataByTimeReq;)Lcom/huawei/hwcloudmodel/model/unite/GetHealthDataByTimeRsp;
    .locals 2

    .line 603
    iget-object v0, p0, Lo/czg;->e:Lo/czn;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 605
    iget-object v0, p0, Lo/czg;->e:Lo/czn;

    invoke-virtual {v0, p1}, Lo/czn;->e(Lcom/huawei/hwcloudmodel/model/unite/GetHealthDataByTimeReq;)Lcom/huawei/hwcloudmodel/model/unite/GetHealthDataByTimeRsp;

    move-result-object v0

    return-object v0

    .line 607
    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public a(Lcom/huawei/hwcloudmodel/model/unite/GetSportDataByTimeReq;)Lcom/huawei/hwcloudmodel/model/unite/GetSportDataByTimeRsp;
    .locals 2

    .line 512
    iget-object v0, p0, Lo/czg;->e:Lo/czn;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 514
    iget-object v0, p0, Lo/czg;->e:Lo/czn;

    invoke-virtual {v0, p1}, Lo/czn;->e(Lcom/huawei/hwcloudmodel/model/unite/GetSportDataByTimeReq;)Lcom/huawei/hwcloudmodel/model/unite/GetSportDataByTimeRsp;

    move-result-object v0

    return-object v0

    .line 516
    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public a(Lcom/huawei/hwcloudmodel/model/unite/GetSportDataByVersionReq;)Lcom/huawei/hwcloudmodel/model/unite/GetSportDataByVersionRsp;
    .locals 2

    .line 521
    iget-object v0, p0, Lo/czg;->e:Lo/czn;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 523
    iget-object v0, p0, Lo/czg;->e:Lo/czn;

    invoke-virtual {v0, p1}, Lo/czn;->d(Lcom/huawei/hwcloudmodel/model/unite/GetSportDataByVersionReq;)Lcom/huawei/hwcloudmodel/model/unite/GetSportDataByVersionRsp;

    move-result-object v0

    return-object v0

    .line 525
    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public a(Lcom/huawei/hwcloudmodel/model/unite/GetSportStatReq;)Lcom/huawei/hwcloudmodel/model/unite/GetSportStatRsp;
    .locals 2

    .line 557
    iget-object v0, p0, Lo/czg;->e:Lo/czn;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 559
    iget-object v0, p0, Lo/czg;->e:Lo/czn;

    invoke-virtual {v0, p1}, Lo/czn;->e(Lcom/huawei/hwcloudmodel/model/unite/GetSportStatReq;)Lcom/huawei/hwcloudmodel/model/unite/GetSportStatRsp;

    move-result-object v0

    return-object v0

    .line 561
    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public a(Lcom/huawei/hwcloudmodel/model/intelligent/StartDeviceLinkageReq;Lo/cyx;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/hwcloudmodel/model/intelligent/StartDeviceLinkageReq;Lo/cyx<Lcom/huawei/hwcloudmodel/model/intelligent/StartDeviceLinkageRsq;>;)V"
        }
    .end annotation

    .line 949
    iget-object v0, p0, Lo/czg;->e:Lo/czn;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 951
    iget-object v0, p0, Lo/czg;->e:Lo/czn;

    invoke-virtual {v0, p1, p2}, Lo/czn;->d(Lcom/huawei/hwcloudmodel/model/intelligent/StartDeviceLinkageReq;Lo/cyx;)V

    .line 953
    :cond_0
    return-void
.end method

.method public a(Lcom/huawei/hwcloudmodel/model/userprofile/MergeUserAllDataReq;Lo/cyx;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/hwcloudmodel/model/userprofile/MergeUserAllDataReq;Lo/cyx<Lcom/huawei/hwcloudmodel/model/userprofile/MergeUserAllDataRsp;>;)V"
        }
    .end annotation

    .line 234
    iget-object v0, p0, Lo/czg;->e:Lo/czn;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 236
    iget-object v0, p0, Lo/czg;->e:Lo/czn;

    invoke-virtual {v0, p1, p2}, Lo/czn;->a(Lcom/huawei/hwcloudmodel/model/userprofile/MergeUserAllDataReq;Lo/cyx;)V

    .line 238
    :cond_0
    return-void
.end method

.method public a(Lo/cyx;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/cyx<Ljava/lang/Boolean;>;)V"
        }
    .end annotation

    .line 717
    iget-object v0, p0, Lo/czg;->e:Lo/czn;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 719
    iget-object v0, p0, Lo/czg;->e:Lo/czn;

    invoke-virtual {v0, p1}, Lo/czn;->a(Lo/cyx;)V

    .line 721
    :cond_0
    return-void
.end method

.method public b(Lcom/huawei/hwcloudmodel/model/unite/AddSportTotalReq;)Lcom/huawei/hwcloudmodel/model/unite/AddSportTotalRsp;
    .locals 2

    .line 547
    iget-object v0, p0, Lo/czg;->e:Lo/czn;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 549
    iget-object v0, p0, Lo/czg;->e:Lo/czn;

    invoke-virtual {v0, p1}, Lo/czn;->d(Lcom/huawei/hwcloudmodel/model/unite/AddSportTotalReq;)Lcom/huawei/hwcloudmodel/model/unite/AddSportTotalRsp;

    move-result-object v0

    return-object v0

    .line 551
    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public b(Lcom/huawei/hwcloudmodel/model/unite/GetSportDimenStatReq;)Lcom/huawei/hwcloudmodel/model/unite/GetSportDimenStatRsp;
    .locals 2

    .line 566
    iget-object v0, p0, Lo/czg;->e:Lo/czn;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 568
    iget-object v0, p0, Lo/czg;->e:Lo/czn;

    invoke-virtual {v0, p1}, Lo/czn;->e(Lcom/huawei/hwcloudmodel/model/unite/GetSportDimenStatReq;)Lcom/huawei/hwcloudmodel/model/unite/GetSportDimenStatRsp;

    move-result-object v0

    return-object v0

    .line 570
    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public b(Lcom/huawei/hwcloudmodel/model/unite/GetSyncVersionsReq;)Lcom/huawei/hwcloudmodel/model/unite/GetSyncVersionsRsp;
    .locals 2

    .line 492
    iget-object v0, p0, Lo/czg;->e:Lo/czn;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 494
    iget-object v0, p0, Lo/czg;->e:Lo/czn;

    invoke-virtual {v0, p1}, Lo/czn;->b(Lcom/huawei/hwcloudmodel/model/unite/GetSyncVersionsReq;)Lcom/huawei/hwcloudmodel/model/unite/GetSyncVersionsRsp;

    move-result-object v0

    return-object v0

    .line 496
    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public b(Lcom/huawei/hwcloudmodel/model/ThirdAuthTokenI;Lo/cyx;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/hwcloudmodel/model/ThirdAuthTokenI;Lo/cyx<Ljava/lang/Object;>;)V"
        }
    .end annotation

    .line 745
    iget-object v0, p0, Lo/czg;->e:Lo/czn;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 747
    iget-object v0, p0, Lo/czg;->e:Lo/czn;

    invoke-virtual {v0, p1, p2}, Lo/czn;->e(Lcom/huawei/hwcloudmodel/model/ThirdAuthTokenI;Lo/cyx;)V

    .line 749
    :cond_0
    return-void
.end method

.method public b(Lcom/huawei/hwcloudmodel/model/intelligent/ReleaseDeviceLinkageReq;Lo/cyx;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/hwcloudmodel/model/intelligent/ReleaseDeviceLinkageReq;Lo/cyx<Lcom/huawei/hwcloudmodel/model/intelligent/ReleaseDeviceLinkageRsq;>;)V"
        }
    .end annotation

    .line 970
    iget-object v0, p0, Lo/czg;->e:Lo/czn;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 972
    iget-object v0, p0, Lo/czg;->e:Lo/czn;

    invoke-virtual {v0, p1, p2}, Lo/czn;->c(Lcom/huawei/hwcloudmodel/model/intelligent/ReleaseDeviceLinkageReq;Lo/cyx;)V

    .line 974
    :cond_0
    return-void
.end method

.method public b(Lcom/huawei/hwcloudmodel/model/unite/AddEvaluationResultReq;Lo/cyx;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/hwcloudmodel/model/unite/AddEvaluationResultReq;Lo/cyx<Lcom/huawei/hwcloudmodel/model/CloudCommonReponse;>;)V"
        }
    .end annotation

    .line 852
    iget-object v0, p0, Lo/czg;->e:Lo/czn;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 854
    iget-object v0, p0, Lo/czg;->e:Lo/czn;

    invoke-virtual {v0, p1, p2}, Lo/czn;->a(Lcom/huawei/hwcloudmodel/model/unite/AddEvaluationResultReq;Lo/cyx;)V

    .line 856
    :cond_0
    return-void
.end method

.method public b(Lcom/huawei/hwcloudmodel/model/unite/GetEvaluationResultReq;Lo/cyx;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/hwcloudmodel/model/unite/GetEvaluationResultReq;Lo/cyx<Lcom/huawei/hwcloudmodel/utils/GetEvaluationResultRsp;>;)V"
        }
    .end annotation

    .line 865
    iget-object v0, p0, Lo/czg;->e:Lo/czn;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 867
    iget-object v0, p0, Lo/czg;->e:Lo/czn;

    invoke-virtual {v0, p1, p2}, Lo/czn;->c(Lcom/huawei/hwcloudmodel/model/unite/GetEvaluationResultReq;Lo/cyx;)V

    .line 869
    :cond_0
    return-void
.end method

.method public b(Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceGetWifiDeviceInfoReq;Lo/cyx;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceGetWifiDeviceInfoReq;Lo/cyx<Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceGetWifiDeviceInfoRsp;>;)V"
        }
    .end annotation

    .line 910
    iget-object v0, p0, Lo/czg;->e:Lo/czn;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 912
    iget-object v0, p0, Lo/czg;->e:Lo/czn;

    invoke-virtual {v0, p1, p2}, Lo/czn;->c(Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceGetWifiDeviceInfoReq;Lo/cyx;)V

    .line 914
    :cond_0
    return-void
.end method

.method public b(Lo/cyx;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/cyx<Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceGetAllDeviceRsp;>;)V"
        }
    .end annotation

    .line 933
    iget-object v0, p0, Lo/czg;->e:Lo/czn;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 935
    iget-object v0, p0, Lo/czg;->e:Lo/czn;

    invoke-virtual {v0, p1}, Lo/czn;->g(Lo/cyx;)V

    .line 937
    :cond_0
    return-void
.end method

.method public c(Lcom/huawei/hwcloudmodel/model/unite/GetMotionPathByVersionReq;)Lcom/huawei/hwcloudmodel/model/unite/GetMotionPathByVersionRsp;
    .locals 2

    .line 658
    iget-object v0, p0, Lo/czg;->e:Lo/czn;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 660
    iget-object v0, p0, Lo/czg;->e:Lo/czn;

    invoke-virtual {v0, p1}, Lo/czn;->e(Lcom/huawei/hwcloudmodel/model/unite/GetMotionPathByVersionReq;)Lcom/huawei/hwcloudmodel/model/unite/GetMotionPathByVersionRsp;

    move-result-object v0

    return-object v0

    .line 662
    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public c(Lcom/huawei/hwcloudmodel/model/userprofile/GetBindDeviceReq;)Lcom/huawei/hwcloudmodel/model/userprofile/GetBindDeviceRsp;
    .locals 2

    .line 438
    iget-object v0, p0, Lo/czg;->e:Lo/czn;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 440
    iget-object v0, p0, Lo/czg;->e:Lo/czn;

    invoke-virtual {v0, p1}, Lo/czn;->b(Lcom/huawei/hwcloudmodel/model/userprofile/GetBindDeviceReq;)Lcom/huawei/hwcloudmodel/model/userprofile/GetBindDeviceRsp;

    move-result-object v0

    return-object v0

    .line 442
    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public c(Lcom/huawei/hwcloudmodel/model/userprofile/SetUserProfileReq;)Lcom/huawei/hwcloudmodel/model/userprofile/SetUserProfileRsp;
    .locals 2

    .line 465
    iget-object v0, p0, Lo/czg;->e:Lo/czn;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 467
    iget-object v0, p0, Lo/czg;->e:Lo/czn;

    invoke-virtual {v0, p1}, Lo/czn;->b(Lcom/huawei/hwcloudmodel/model/userprofile/SetUserProfileReq;)Lcom/huawei/hwcloudmodel/model/userprofile/SetUserProfileRsp;

    move-result-object v0

    return-object v0

    .line 469
    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public c()V
    .locals 2

    .line 885
    iget-object v0, p0, Lo/czg;->e:Lo/czn;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 887
    iget-object v0, p0, Lo/czg;->e:Lo/czn;

    invoke-virtual {v0}, Lo/czn;->c()V

    .line 889
    :cond_0
    return-void
.end method

.method public c(DDLo/cyx;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(DDLo/cyx<Lo/czo;>;)V"
        }
    .end annotation

    .line 726
    iget-object v0, p0, Lo/czg;->e:Lo/czn;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 728
    iget-object v0, p0, Lo/czg;->e:Lo/czn;

    move-wide v1, p1

    move-wide v3, p3

    move-object v5, p5

    invoke-virtual/range {v0 .. v5}, Lo/czn;->b(DDLo/cyx;)V

    .line 730
    :cond_0
    return-void
.end method

.method public c(ILo/cyx;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ILo/cyx<Ljava/lang/Object;>;)V"
        }
    .end annotation

    .line 770
    iget-object v0, p0, Lo/czg;->e:Lo/czn;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 772
    iget-object v0, p0, Lo/czg;->e:Lo/czn;

    invoke-virtual {v0, p1, p2}, Lo/czn;->e(ILo/cyx;)V

    .line 774
    :cond_0
    return-void
.end method

.method public c(Landroid/os/Bundle;Landroid/content/Context;Lcom/huawei/membercenter/sdk/membersdklibrary/api/MemberServiceAPI$IQueryMemberStatusCallback;)V
    .locals 4

    .line 818
    const-string v0, "HWCloudMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter queryMemberStatus():"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 819
    invoke-static {p1, p2, p3}, Lcom/huawei/membercenter/sdk/membersdklibrary/api/MemberServiceAPI;->queryMemberStatus(Landroid/os/Bundle;Landroid/content/Context;Lcom/huawei/membercenter/sdk/membersdklibrary/api/MemberServiceAPI$IQueryMemberStatusCallback;)V

    .line 820
    return-void
.end method

.method public c(Lcom/huawei/hwcloudmodel/model/intelligent/StopDeviceLinkageReq;Lo/cyx;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/hwcloudmodel/model/intelligent/StopDeviceLinkageReq;Lo/cyx<Lcom/huawei/hwcloudmodel/model/intelligent/StopDeviceLinkageRsq;>;)V"
        }
    .end annotation

    .line 956
    iget-object v0, p0, Lo/czg;->e:Lo/czn;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 958
    iget-object v0, p0, Lo/czg;->e:Lo/czn;

    invoke-virtual {v0, p1, p2}, Lo/czn;->b(Lcom/huawei/hwcloudmodel/model/intelligent/StopDeviceLinkageReq;Lo/cyx;)V

    .line 960
    :cond_0
    return-void
.end method

.method public c(Lcom/huawei/hwcloudmodel/model/intelligent/TransDeviceDataReq;Lo/cyx;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/hwcloudmodel/model/intelligent/TransDeviceDataReq;Lo/cyx<Lcom/huawei/hwcloudmodel/model/intelligent/TransDeviceDataRsq;>;)V"
        }
    .end annotation

    .line 963
    iget-object v0, p0, Lo/czg;->e:Lo/czn;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 965
    iget-object v0, p0, Lo/czg;->e:Lo/czn;

    invoke-virtual {v0, p1, p2}, Lo/czn;->a(Lcom/huawei/hwcloudmodel/model/intelligent/TransDeviceDataReq;Lo/cyx;)V

    .line 967
    :cond_0
    return-void
.end method

.method public c(Lo/cyx;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/cyx<Ljava/lang/Boolean;>;)V"
        }
    .end annotation

    .line 692
    iget-object v0, p0, Lo/czg;->e:Lo/czn;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 694
    iget-object v0, p0, Lo/czg;->e:Lo/czn;

    invoke-virtual {v0, p1}, Lo/czn;->c(Lo/cyx;)V

    .line 696
    :cond_0
    return-void
.end method

.method public d(Lcom/huawei/hwcloudmodel/model/unite/AddHealthDataReq;)Lcom/huawei/hwcloudmodel/model/unite/AddHealthDataRsp;
    .locals 2

    .line 594
    iget-object v0, p0, Lo/czg;->e:Lo/czn;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 596
    iget-object v0, p0, Lo/czg;->e:Lo/czn;

    invoke-virtual {v0, p1}, Lo/czn;->e(Lcom/huawei/hwcloudmodel/model/unite/AddHealthDataReq;)Lcom/huawei/hwcloudmodel/model/unite/AddHealthDataRsp;

    move-result-object v0

    return-object v0

    .line 598
    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public d(Lcom/huawei/hwcloudmodel/model/unite/DelHealthDataReq;)Lcom/huawei/hwcloudmodel/model/unite/DelHealthDataRsp;
    .locals 2

    .line 623
    iget-object v0, p0, Lo/czg;->e:Lo/czn;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 625
    iget-object v0, p0, Lo/czg;->e:Lo/czn;

    invoke-virtual {v0, p1}, Lo/czn;->d(Lcom/huawei/hwcloudmodel/model/unite/DelHealthDataReq;)Lcom/huawei/hwcloudmodel/model/unite/DelHealthDataRsp;

    move-result-object v0

    return-object v0

    .line 627
    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public d(Lcom/huawei/hwcloudmodel/model/unite/GetHealthDataByVersionReq;)Lcom/huawei/hwcloudmodel/model/unite/GetHealthDataByVersionRsp;
    .locals 2

    .line 614
    iget-object v0, p0, Lo/czg;->e:Lo/czn;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 616
    iget-object v0, p0, Lo/czg;->e:Lo/czn;

    invoke-virtual {v0, p1}, Lo/czn;->b(Lcom/huawei/hwcloudmodel/model/unite/GetHealthDataByVersionReq;)Lcom/huawei/hwcloudmodel/model/unite/GetHealthDataByVersionRsp;

    move-result-object v0

    return-object v0

    .line 618
    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public d(Lcom/huawei/hwcloudmodel/model/userprofile/GetUserProfileReq;)Lcom/huawei/hwcloudmodel/model/userprofile/GetUserProfileRsp;
    .locals 2

    .line 474
    iget-object v0, p0, Lo/czg;->e:Lo/czn;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 476
    iget-object v0, p0, Lo/czg;->e:Lo/czn;

    invoke-virtual {v0, p1}, Lo/czn;->c(Lcom/huawei/hwcloudmodel/model/userprofile/GetUserProfileReq;)Lcom/huawei/hwcloudmodel/model/userprofile/GetUserProfileRsp;

    move-result-object v0

    return-object v0

    .line 478
    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public d(Lcom/huawei/hwcloudmodel/model/userprofile/UpdateBindDeviceReq;)Lcom/huawei/hwcloudmodel/model/userprofile/UpdateBindDeviceRsp;
    .locals 2

    .line 456
    iget-object v0, p0, Lo/czg;->e:Lo/czn;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 458
    iget-object v0, p0, Lo/czg;->e:Lo/czn;

    invoke-virtual {v0, p1}, Lo/czn;->a(Lcom/huawei/hwcloudmodel/model/userprofile/UpdateBindDeviceReq;)Lcom/huawei/hwcloudmodel/model/userprofile/UpdateBindDeviceRsp;

    move-result-object v0

    return-object v0

    .line 460
    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public d(Landroid/os/Bundle;Landroid/content/Context;Lcom/huawei/membercenter/sdk/membersdklibrary/api/MemberServiceAPI$IActiveMemberCallback;)V
    .locals 4

    .line 827
    const-string v0, "HWCloudMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter activeMember():"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 828
    invoke-static {p1, p2, p3}, Lcom/huawei/membercenter/sdk/membersdklibrary/api/MemberServiceAPI;->activeMember(Landroid/os/Bundle;Landroid/content/Context;Lcom/huawei/membercenter/sdk/membersdklibrary/api/MemberServiceAPI$IActiveMemberCallback;)V

    .line 829
    return-void
.end method

.method public d(Lcom/huawei/hwcloudmodel/model/ThirdUserToken;Lo/cyx;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/hwcloudmodel/model/ThirdUserToken;Lo/cyx<Ljava/lang/Boolean;>;)V"
        }
    .end annotation

    .line 705
    iget-object v0, p0, Lo/czg;->e:Lo/czn;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 707
    iget-object v0, p0, Lo/czg;->e:Lo/czn;

    invoke-virtual {v0, p1, p2}, Lo/czn;->d(Lcom/huawei/hwcloudmodel/model/ThirdUserToken;Lo/cyx;)V

    .line 709
    :cond_0
    return-void
.end method

.method public d(Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceControlDataModelReq;Lo/cyx;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceControlDataModelReq;Lo/cyx<Lcom/huawei/hwcloudmodel/model/CloudCommonReponse;>;)V"
        }
    .end annotation

    .line 893
    iget-object v0, p0, Lo/czg;->e:Lo/czn;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 895
    iget-object v0, p0, Lo/czg;->e:Lo/czn;

    invoke-virtual {v0, p1, p2}, Lo/czn;->c(Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceControlDataModelReq;Lo/cyx;)V

    .line 898
    :cond_0
    return-void
.end method

.method public d(Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceGetDeviceStatusReq;Lo/cyx;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceGetDeviceStatusReq;Lo/cyx<Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceGetDeviceStatusRsp;>;)V"
        }
    .end annotation

    .line 941
    iget-object v0, p0, Lo/czg;->e:Lo/czn;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 943
    iget-object v0, p0, Lo/czg;->e:Lo/czn;

    invoke-virtual {v0, p1, p2}, Lo/czn;->b(Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceGetDeviceStatusReq;Lo/cyx;)V

    .line 945
    :cond_0
    return-void
.end method

.method public d(Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceServiceInfoReq;Lo/cyx;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceServiceInfoReq;Lo/cyx<Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceServiceInfoRsp;>;)V"
        }
    .end annotation

    .line 926
    iget-object v0, p0, Lo/czg;->e:Lo/czn;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 928
    iget-object v0, p0, Lo/czg;->e:Lo/czn;

    invoke-virtual {v0, p1, p2}, Lo/czn;->a(Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceServiceInfoReq;Lo/cyx;)V

    .line 930
    :cond_0
    return-void
.end method

.method public d(Lo/cyx;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/cyx<Ljava/lang/Object;>;)V"
        }
    .end annotation

    .line 757
    iget-object v0, p0, Lo/czg;->e:Lo/czn;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 759
    iget-object v0, p0, Lo/czg;->e:Lo/czn;

    invoke-virtual {v0, p1}, Lo/czn;->e(Lo/cyx;)V

    .line 761
    :cond_0
    return-void
.end method

.method public e(Lcom/huawei/hwcloudmodel/model/unite/AddMotionPathReq;)Lcom/huawei/hwcloudmodel/model/unite/AddMotionPathRsp;
    .locals 2

    .line 640
    iget-object v0, p0, Lo/czg;->e:Lo/czn;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 642
    iget-object v0, p0, Lo/czg;->e:Lo/czn;

    invoke-virtual {v0, p1}, Lo/czn;->a(Lcom/huawei/hwcloudmodel/model/unite/AddMotionPathReq;)Lcom/huawei/hwcloudmodel/model/unite/AddMotionPathRsp;

    move-result-object v0

    return-object v0

    .line 644
    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public e(Lcom/huawei/hwcloudmodel/model/unite/AddSportDataReq;)Lcom/huawei/hwcloudmodel/model/unite/AddSportDataRsp;
    .locals 2

    .line 502
    iget-object v0, p0, Lo/czg;->e:Lo/czn;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 504
    iget-object v0, p0, Lo/czg;->e:Lo/czn;

    invoke-virtual {v0, p1}, Lo/czn;->a(Lcom/huawei/hwcloudmodel/model/unite/AddSportDataReq;)Lcom/huawei/hwcloudmodel/model/unite/AddSportDataRsp;

    move-result-object v0

    return-object v0

    .line 506
    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public e(Lcom/huawei/hwcloudmodel/model/unite/GetHealthStatReq;)Lcom/huawei/hwcloudmodel/model/unite/GetHealthStatRsp;
    .locals 2

    .line 417
    iget-object v0, p0, Lo/czg;->e:Lo/czn;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 419
    iget-object v0, p0, Lo/czg;->e:Lo/czn;

    invoke-virtual {v0, p1}, Lo/czn;->b(Lcom/huawei/hwcloudmodel/model/unite/GetHealthStatReq;)Lcom/huawei/hwcloudmodel/model/unite/GetHealthStatRsp;

    move-result-object v0

    return-object v0

    .line 421
    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public e(Lcom/huawei/hwcloudmodel/model/userprofile/BindDeviceReq;)Lcom/huawei/hwcloudmodel/model/userprofile/BindDeviceRsp;
    .locals 2

    .line 429
    iget-object v0, p0, Lo/czg;->e:Lo/czn;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 431
    iget-object v0, p0, Lo/czg;->e:Lo/czn;

    invoke-virtual {v0, p1}, Lo/czn;->c(Lcom/huawei/hwcloudmodel/model/userprofile/BindDeviceReq;)Lcom/huawei/hwcloudmodel/model/userprofile/BindDeviceRsp;

    move-result-object v0

    return-object v0

    .line 433
    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public e(Lcom/huawei/hwcloudmodel/model/userprofile/GetBindDeviceReq;)Lcom/huawei/hwcloudmodel/model/userprofile/GetBindDeviceRsp;
    .locals 2

    .line 447
    iget-object v0, p0, Lo/czg;->e:Lo/czn;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 449
    iget-object v0, p0, Lo/czg;->e:Lo/czn;

    invoke-virtual {v0, p1}, Lo/czn;->e(Lcom/huawei/hwcloudmodel/model/userprofile/GetBindDeviceReq;)Lcom/huawei/hwcloudmodel/model/userprofile/GetBindDeviceRsp;

    move-result-object v0

    return-object v0

    .line 451
    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public e(DDLo/cyx;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(DDLo/cyx<Lo/czm;>;)V"
        }
    .end annotation

    .line 733
    iget-object v0, p0, Lo/czg;->e:Lo/czn;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 734
    iget-object v0, p0, Lo/czg;->e:Lo/czn;

    move-wide v1, p1

    move-wide v3, p3

    move-object v5, p5

    invoke-virtual/range {v0 .. v5}, Lo/czn;->e(DDLo/cyx;)V

    .line 736
    :cond_0
    return-void
.end method

.method public e(ILjava/lang/String;Lcom/android/volley/Response$Listener;Lcom/android/volley/Response$ErrorListener;Ljava/util/Map;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ILjava/lang/String;Lcom/android/volley/Response$Listener<Ljava/lang/String;>;Lcom/android/volley/Response$ErrorListener;Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;)V"
        }
    .end annotation

    .line 841
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/hwcloudmodel/model/RequestManager;->init(Landroid/content/Context;)V

    .line 842
    new-instance v0, Lcom/huawei/hwcloudmodel/model/CustomStringRequest;

    move v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-direct/range {v0 .. v5}, Lcom/huawei/hwcloudmodel/model/CustomStringRequest;-><init>(ILjava/lang/String;Lcom/android/volley/Response$Listener;Lcom/android/volley/Response$ErrorListener;Ljava/util/Map;)V

    invoke-static {v0, p0}, Lcom/huawei/hwcloudmodel/model/RequestManager;->addRequest(Lcom/android/volley/Request;Ljava/lang/Object;)V

    .line 843
    return-void
.end method

.method public e(Lcom/huawei/hwcloudmodel/model/unite/DelEvaluationResultReq;Lo/cyx;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/hwcloudmodel/model/unite/DelEvaluationResultReq;Lo/cyx<Lcom/huawei/hwcloudmodel/model/CloudCommonReponse;>;)V"
        }
    .end annotation

    .line 878
    iget-object v0, p0, Lo/czg;->e:Lo/czn;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 880
    iget-object v0, p0, Lo/czg;->e:Lo/czn;

    invoke-virtual {v0, p1, p2}, Lo/czn;->c(Lcom/huawei/hwcloudmodel/model/unite/DelEvaluationResultReq;Lo/cyx;)V

    .line 882
    :cond_0
    return-void
.end method

.method public e(Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceUnbindReq;Lo/cyx;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceUnbindReq;Lo/cyx<Lcom/huawei/hwcloudmodel/model/CloudCommonReponse;>;)V"
        }
    .end annotation

    .line 902
    iget-object v0, p0, Lo/czg;->e:Lo/czn;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 904
    iget-object v0, p0, Lo/czg;->e:Lo/czn;

    invoke-virtual {v0, p1, p2}, Lo/czn;->e(Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceUnbindReq;Lo/cyx;)V

    .line 906
    :cond_0
    return-void
.end method

.method public e(Lcom/huawei/hwcloudmodel/model/userprofile/GetUserMergeInfoReq;Lo/cyx;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/hwcloudmodel/model/userprofile/GetUserMergeInfoReq;Lo/cyx<Lcom/huawei/hwcloudmodel/model/userprofile/GetUserMergeInfoRsp;>;)V"
        }
    .end annotation

    .line 241
    iget-object v0, p0, Lo/czg;->e:Lo/czn;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 242
    iget-object v0, p0, Lo/czg;->e:Lo/czn;

    invoke-virtual {v0, p1, p2}, Lo/czn;->e(Lcom/huawei/hwcloudmodel/model/userprofile/GetUserMergeInfoReq;Lo/cyx;)V

    .line 245
    :cond_0
    return-void
.end method

.method public e(Lo/cyx;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/cyx<Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceRegisterVerifyCodeInfoRsp;>;)V"
        }
    .end annotation

    .line 918
    iget-object v0, p0, Lo/czg;->e:Lo/czn;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 920
    iget-object v0, p0, Lo/czg;->e:Lo/czn;

    invoke-virtual {v0, p1}, Lo/czn;->d(Lo/cyx;)V

    .line 922
    :cond_0
    return-void
.end method

.method protected getModuleId()Ljava/lang/Integer;
    .locals 1

    .line 188
    const/16 v0, 0x3ea

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method
