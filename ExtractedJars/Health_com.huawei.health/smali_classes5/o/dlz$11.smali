.class Lo/dlz$11;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/egg;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dlz;->c(DDLcom/huawei/hwbasemgr/IBaseResponseCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/dlz;

.field final synthetic b:D

.field final synthetic c:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field final synthetic e:D


# direct methods
.method constructor <init>(Lo/dlz;DDLcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 0

    .line 146
    iput-object p1, p0, Lo/dlz$11;->a:Lo/dlz;

    iput-wide p2, p0, Lo/dlz$11;->e:D

    iput-wide p4, p0, Lo/dlz$11;->b:D

    iput-object p6, p0, Lo/dlz$11;->c:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(ILjava/lang/Object;)V
    .locals 6

    .line 149
    const-string v0, "SMART_WeightSmarter"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "jugdeRightWeightGoal getUserInfo err_code = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 150
    const-string v0, "SMART_WeightSmarter"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "jugdeRightWeightGoal getUserInfo objData = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 151
    const/4 v0, 0x0

    if-ne v0, p1, :cond_1

    .line 152
    move-object v4, p2

    check-cast v4, Lcom/huawei/hihealth/HiUserInfo;

    .line 153
    invoke-virtual {v4}, Lcom/huawei/hihealth/HiUserInfo;->getWeight()F

    move-result v5

    .line 154
    const-string v0, "SMART_WeightSmarter"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "jugdeRightWeightGoal getUserInfo userWeight = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 155
    float-to-double v0, v5

    const-wide/high16 v2, 0x3fe0000000000000L    # 0.5

    cmpl-double v0, v0, v2

    if-lez v0, :cond_0

    float-to-double v0, v5

    iget-wide v2, p0, Lo/dlz$11;->e:D

    sub-double/2addr v0, v2

    iget-wide v2, p0, Lo/dlz$11;->b:D

    cmpl-double v0, v0, v2

    if-lez v0, :cond_0

    .line 156
    iget-object v0, p0, Lo/dlz$11;->c:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    goto :goto_0

    .line 158
    :cond_0
    iget-object v0, p0, Lo/dlz$11;->c:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const v1, 0x186a1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 160
    :goto_0
    goto :goto_1

    .line 161
    :cond_1
    iget-object v0, p0, Lo/dlz$11;->c:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const v1, 0x186a1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 163
    :goto_1
    return-void
.end method
