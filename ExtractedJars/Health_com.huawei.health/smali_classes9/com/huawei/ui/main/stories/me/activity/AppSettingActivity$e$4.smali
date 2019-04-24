.class Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$e$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$e;->d(Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;Landroid/os/Message;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;

.field final synthetic d:Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$e;

.field final synthetic e:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$e;Ljava/lang/String;Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;)V
    .locals 0

    .line 1704
    iput-object p1, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$e$4;->d:Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$e;

    iput-object p2, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$e$4;->e:Ljava/lang/String;

    iput-object p3, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$e$4;->a:Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 8

    .line 1707
    const/4 v4, 0x0

    .line 1708
    const/4 v0, 0x0

    if-ne v0, p1, :cond_1

    instance-of v0, p2, Ljava/util/List;

    if-eqz v0, :cond_1

    .line 1709
    move-object v5, p2

    check-cast v5, Ljava/util/List;

    .line 1710
    const/4 v6, 0x0

    :goto_0
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    if-ge v6, v0, :cond_1

    .line 1711
    invoke-interface {v5, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalData;

    .line 1712
    invoke-virtual {v7}, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalData;->getSportType()I

    move-result v0

    const/16 v1, 0xdd

    if-ne v1, v0, :cond_0

    .line 1713
    invoke-virtual {v7}, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalData;->getSteps()I

    move-result v4

    .line 1714
    goto :goto_1

    .line 1710
    :cond_0
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 1718
    :cond_1
    :goto_1
    const-string v0, "UIME_AppSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "wechat_total_step = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1719
    const-string v5, ""

    .line 1720
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$e$4;->e:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "#"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "#"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 1722
    const-string v0, "UIME_AppSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "MESSAGE_ID_GETQRCODETICKET jumpToHwPublic trdTicket = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1723
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$e$4;->a:Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->y(Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;)Lo/fit;

    move-result-object v0

    invoke-virtual {v0, v5}, Lo/fit;->a(Ljava/lang/String;)V

    .line 1725
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$e$4;->a:Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->y(Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;)Lo/fit;

    move-result-object v0

    invoke-virtual {v0}, Lo/fit;->a()V

    .line 1726
    return-void
.end method
