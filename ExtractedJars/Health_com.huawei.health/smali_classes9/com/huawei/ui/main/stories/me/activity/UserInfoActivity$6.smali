.class Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->a(II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic c:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;

.field final synthetic e:I


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;II)V
    .locals 0

    .line 908
    iput-object p1, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$6;->c:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;

    iput p2, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$6;->a:I

    iput p3, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$6;->e:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 6

    .line 911
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$6;->c:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->r(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;)V

    .line 912
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$6;->c:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->b(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x69

    const-wide/16 v2, 0x1388

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 913
    iget v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$6;->a:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 914
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$6;->c:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->a(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;)Lcom/huawei/hihealth/HiUserInfo;

    move-result-object v0

    iget v1, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$6;->e:I

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/HiUserInfo;->setWeight(F)V

    .line 915
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$6;->c:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->q(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;)Lcom/huawei/up/model/UserInfomation;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 916
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$6;->c:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->q(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;)Lcom/huawei/up/model/UserInfomation;

    move-result-object v0

    iget v1, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$6;->e:I

    int-to-float v1, v1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/up/model/UserInfomation;->setWeight(Ljava/lang/Float;)V

    .line 918
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$6;->c:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;

    sget-object v1, Lo/dae;->dz:Lo/dae;

    invoke-virtual {v1}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v1

    const-string v2, "2"

    invoke-static {v0, v1, v2}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->b(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_3

    .line 919
    :cond_1
    iget v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$6;->a:I

    if-nez v0, :cond_3

    .line 920
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$6;->c:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->a(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;)Lcom/huawei/hihealth/HiUserInfo;

    move-result-object v0

    iget v1, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$6;->e:I

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/HiUserInfo;->setHeight(I)V

    .line 921
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$6;->c:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->q(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;)Lcom/huawei/up/model/UserInfomation;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 922
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$6;->c:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->q(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;)Lcom/huawei/up/model/UserInfomation;

    move-result-object v0

    iget v1, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$6;->e:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/up/model/UserInfomation;->setHeight(Ljava/lang/Integer;)V

    .line 924
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$6;->c:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;

    sget-object v1, Lo/dae;->dz:Lo/dae;

    invoke-virtual {v1}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v1

    const-string v2, "1"

    invoke-static {v0, v1, v2}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->b(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_3

    .line 925
    :cond_3
    iget v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$6;->a:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_9

    .line 926
    const-string v0, "UIME_UserInfoActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "gender=="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget v2, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$6;->e:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 927
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$6;->c:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->a(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;)Lcom/huawei/hihealth/HiUserInfo;

    move-result-object v0

    iget v1, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$6;->e:I

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/HiUserInfo;->setGender(I)V

    .line 928
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$6;->c:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->s(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;)Lcom/huawei/hwid/core/datatype/UserInfo;

    move-result-object v0

    if-eqz v0, :cond_5

    .line 929
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$6;->c:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->s(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;)Lcom/huawei/hwid/core/datatype/UserInfo;

    move-result-object v0

    iget v1, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$6;->e:I

    if-nez v1, :cond_4

    const/4 v1, 0x1

    goto :goto_0

    :cond_4
    const/4 v1, 0x0

    :goto_0
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/hwid/core/datatype/UserInfo;->setGender(Ljava/lang/String;)V

    .line 931
    :cond_5
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$6;->c:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->q(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;)Lcom/huawei/up/model/UserInfomation;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_7

    .line 932
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$6;->c:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->q(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;)Lcom/huawei/up/model/UserInfomation;

    move-result-object v0

    iget v1, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$6;->e:I

    if-nez v1, :cond_6

    const/4 v1, 0x1

    goto :goto_1

    :cond_6
    const/4 v1, 0x0

    :goto_1
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/up/model/UserInfomation;->setGender(Ljava/lang/Integer;)V

    .line 934
    :cond_7
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$6;->c:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->a:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "hw_health_gender_value"

    iget v3, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$6;->e:I

    if-nez v3, :cond_8

    const/4 v3, 0x1

    goto :goto_2

    :cond_8
    const/4 v3, 0x0

    .line 935
    :goto_2
    invoke-static {v3}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lo/dcy;

    const/4 v5, 0x1

    invoke-direct {v4, v5}, Lo/dcy;-><init>(I)V

    .line 934
    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 936
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$6;->c:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;

    sget-object v1, Lo/dae;->dz:Lo/dae;

    invoke-virtual {v1}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v1

    const-string v2, "3"

    invoke-static {v0, v1, v2}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->b(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_3

    .line 937
    :cond_9
    iget v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$6;->a:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_c

    .line 938
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$6;->c:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->a(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;)Lcom/huawei/hihealth/HiUserInfo;

    move-result-object v0

    iget v1, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$6;->e:I

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/HiUserInfo;->setBirthday(I)V

    .line 940
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$6;->c:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->a(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;)Lcom/huawei/hihealth/HiUserInfo;

    move-result-object v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-static {v1, v2}, Lo/cnk;->a(J)I

    move-result v1

    div-int/lit16 v1, v1, 0x2710

    iget v2, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$6;->e:I

    div-int/lit16 v2, v2, 0x2710

    sub-int/2addr v1, v2

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/HiUserInfo;->setAge(I)V

    .line 941
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$6;->c:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->q(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;)Lcom/huawei/up/model/UserInfomation;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_a

    .line 942
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$6;->c:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->q(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;)Lcom/huawei/up/model/UserInfomation;

    move-result-object v0

    iget v1, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$6;->e:I

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/up/model/UserInfomation;->setBirthday(Ljava/lang/String;)V

    .line 943
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$6;->c:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->q(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;)Lcom/huawei/up/model/UserInfomation;

    move-result-object v0

    const-string v1, "SETED"

    invoke-virtual {v0, v1}, Lcom/huawei/up/model/UserInfomation;->setBirthdayStatus(Ljava/lang/String;)V

    .line 945
    :cond_a
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$6;->c:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->s(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;)Lcom/huawei/hwid/core/datatype/UserInfo;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_b

    .line 946
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$6;->c:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->s(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;)Lcom/huawei/hwid/core/datatype/UserInfo;

    move-result-object v0

    iget v1, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$6;->e:I

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/hwid/core/datatype/UserInfo;->setBirthDate(Ljava/lang/String;)V

    .line 948
    :cond_b
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$6;->c:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;

    sget-object v1, Lo/dae;->dz:Lo/dae;

    invoke-virtual {v1}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v1

    const-string v2, "4"

    invoke-static {v0, v1, v2}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->b(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;Ljava/lang/String;Ljava/lang/String;)V

    .line 950
    :cond_c
    :goto_3
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$6;->c:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->a(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;)Lcom/huawei/hihealth/HiUserInfo;

    move-result-object v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/huawei/hihealth/HiUserInfo;->setCreateTime(J)V

    .line 951
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$6;->c:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->c(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "1"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_d

    invoke-static {}, Lo/czu;->i()Z

    move-result v0

    if-nez v0, :cond_e

    .line 952
    :cond_d
    const-string v0, "UIME_UserInfoActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setUserInfomation isthirdlogin.equals(1)"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 953
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$6;->c:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$6;->c:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->a(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;)Lcom/huawei/hihealth/HiUserInfo;

    move-result-object v1

    new-instance v2, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$6$2;

    invoke-direct {v2, p0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$6$2;-><init>(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$6;)V

    invoke-interface {v0, v1, v2}, Lo/clt;->b(Lcom/huawei/hihealth/HiUserInfo;Lo/clz;)V

    goto :goto_4

    .line 983
    :cond_e
    const-string v0, "UIME_UserInfoActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setUserInfomation !isthirdlogin.equals(1)"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 984
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$6;->c:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->c()V

    .line 987
    :goto_4
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$6;->c:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/dlf;->d(Landroid/content/Context;)Lo/dlf;

    move-result-object v0

    const v1, 0xea60

    invoke-virtual {v0, v1}, Lo/dlf;->b(I)V

    .line 988
    return-void
.end method
