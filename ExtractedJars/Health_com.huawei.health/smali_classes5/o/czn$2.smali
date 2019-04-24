.class Lo/czn$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/cloudservice/CloudRequestHandler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/czn;->b(Lo/cyx;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/czn;

.field final synthetic d:Lo/cyx;


# direct methods
.method constructor <init>(Lo/czn;Lo/cyx;)V
    .locals 0

    .line 693
    iput-object p1, p0, Lo/czn$2;->b:Lo/czn;

    iput-object p2, p0, Lo/czn$2;->d:Lo/cyx;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onError(Lcom/huawei/hwid/core/helper/handler/ErrorStatus;)V
    .locals 4

    .line 750
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getUserInfoFromUP onError"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 751
    iget-object v0, p0, Lo/czn$2;->d:Lo/cyx;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 752
    iget-object v0, p0, Lo/czn$2;->d:Lo/cyx;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-interface {v0, v1, v2, v3}, Lo/cyx;->operationResult(Ljava/lang/Object;Ljava/lang/String;Z)V

    .line 754
    :cond_0
    return-void
.end method

.method public onFinish(Landroid/os/Bundle;)V
    .locals 8

    .line 696
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getUserInfoFromUP onFinish"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 698
    if-eqz p1, :cond_1

    .line 700
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getUserInfoFromUP success: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "userInfo"

    invoke-virtual {p1, v3}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 706
    const-string v0, "userInfo"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/hwid/core/datatype/UserInfo;

    .line 717
    new-instance v5, Lcom/huawei/up/model/UserInfomation;

    invoke-direct {v5}, Lcom/huawei/up/model/UserInfomation;-><init>()V

    .line 718
    const-string v0, ""

    invoke-virtual {v5, v0}, Lcom/huawei/up/model/UserInfomation;->setName(Ljava/lang/String;)V

    .line 719
    const-string v0, ""

    invoke-virtual {v5, v0}, Lcom/huawei/up/model/UserInfomation;->setPortraitUrl(Ljava/lang/String;)V

    .line 720
    const-string v0, ""

    invoke-virtual {v5, v0}, Lcom/huawei/up/model/UserInfomation;->setPicPath(Ljava/lang/String;)V

    .line 721
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    .line 723
    invoke-virtual {v4}, Lcom/huawei/hwid/core/datatype/UserInfo;->getBirthDate()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/up/model/UserInfomation;->setBirthday(Ljava/lang/String;)V

    .line 724
    const/4 v6, -0x1

    .line 726
    :try_start_0
    invoke-virtual {v4}, Lcom/huawei/hwid/core/datatype/UserInfo;->getGender()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    move v6, v0

    .line 729
    goto :goto_0

    .line 727
    :catch_0
    move-exception v7

    .line 728
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getUserInfoFromUP gender is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Lcom/huawei/hwid/core/datatype/UserInfo;->getGender()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 731
    :goto_0
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/up/model/UserInfomation;->setGender(Ljava/lang/Integer;)V

    .line 732
    invoke-virtual {v4}, Lcom/huawei/hwid/core/datatype/UserInfo;->getNickName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/up/model/UserInfomation;->setName(Ljava/lang/String;)V

    .line 733
    invoke-virtual {v4}, Lcom/huawei/hwid/core/datatype/UserInfo;->getHeadPictureURL()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/up/model/UserInfomation;->setPortraitUrl(Ljava/lang/String;)V

    .line 735
    iget-object v0, p0, Lo/czn$2;->d:Lo/cyx;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-interface {v0, v5, v1, v2}, Lo/cyx;->operationResult(Ljava/lang/Object;Ljava/lang/String;Z)V

    .line 736
    goto :goto_1

    .line 737
    :cond_0
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getUserInfoFromUP fail upUsrInfo is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 738
    iget-object v0, p0, Lo/czn$2;->d:Lo/cyx;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-interface {v0, v1, v2, v3}, Lo/cyx;->operationResult(Ljava/lang/Object;Ljava/lang/String;Z)V

    .line 740
    :goto_1
    goto :goto_2

    .line 741
    :cond_1
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getUserInfoFromUP fail"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 742
    iget-object v0, p0, Lo/czn$2;->d:Lo/cyx;

    if-eqz v0, :cond_2

    .line 743
    iget-object v0, p0, Lo/czn$2;->d:Lo/cyx;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-interface {v0, v1, v2, v3}, Lo/cyx;->operationResult(Ljava/lang/Object;Ljava/lang/String;Z)V

    .line 746
    :cond_2
    :goto_2
    return-void
.end method
