.class Lo/dfv$8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dfv;->a(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/dfv;


# direct methods
.method constructor <init>(Lo/dfv;)V
    .locals 0

    .line 874
    iput-object p1, p0, Lo/dfv$8;->b:Lo/dfv;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 10

    .line 877
    move-object v5, p2

    check-cast v5, Lcom/huawei/datatype/FitnessUserInfo;

    .line 878
    invoke-virtual {v5}, Lcom/huawei/datatype/FitnessUserInfo;->getTime()J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    mul-long v6, v0, v2

    .line 879
    iget-object v0, p0, Lo/dfv$8;->b:Lo/dfv;

    invoke-virtual {v0}, Lo/dfv;->b()Lcom/huawei/up/model/UserInfomation;

    move-result-object v8

    .line 880
    const-string v0, "HWFitnessAW70Mgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u672c\u5730\u65f6\u95f4\u6233 = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v8}, Lcom/huawei/up/model/UserInfomation;->getSetTime()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " \u624b\u8868\u65f6\u95f4\u6233 = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 881
    invoke-virtual {v8}, Lcom/huawei/up/model/UserInfomation;->getSetTime()J

    move-result-wide v0

    cmp-long v0, v0, v6

    if-lez v0, :cond_0

    .line 882
    iget-object v0, p0, Lo/dfv$8;->b:Lo/dfv;

    invoke-static {v0, v8}, Lo/dfv;->e(Lo/dfv;Lcom/huawei/up/model/UserInfomation;)V

    goto :goto_0

    .line 884
    :cond_0
    new-instance v9, Lcom/huawei/hihealth/HiUserInfo;

    invoke-direct {v9}, Lcom/huawei/hihealth/HiUserInfo;-><init>()V

    .line 885
    invoke-virtual {v5}, Lcom/huawei/datatype/FitnessUserInfo;->getWeight()I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {v9, v0}, Lcom/huawei/hihealth/HiUserInfo;->setWeight(F)V

    .line 886
    invoke-virtual {v5}, Lcom/huawei/datatype/FitnessUserInfo;->getHeight()I

    move-result v0

    invoke-virtual {v9, v0}, Lcom/huawei/hihealth/HiUserInfo;->setHeight(I)V

    .line 887
    invoke-virtual {v9, v6, v7}, Lcom/huawei/hihealth/HiUserInfo;->setCreateTime(J)V

    .line 888
    iget-object v0, p0, Lo/dfv$8;->b:Lo/dfv;

    invoke-static {v0}, Lo/dfv;->d(Lo/dfv;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/clq;->e(Landroid/content/Context;)Lo/clq;

    move-result-object v0

    new-instance v1, Lo/dfv$8$5;

    invoke-direct {v1, p0}, Lo/dfv$8$5;-><init>(Lo/dfv$8;)V

    invoke-virtual {v0, v9, v1}, Lo/clq;->b(Lcom/huawei/hihealth/HiUserInfo;Lo/clz;)V

    .line 900
    :goto_0
    return-void
.end method
