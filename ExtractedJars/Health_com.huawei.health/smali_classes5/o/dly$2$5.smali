.class Lo/dly$2$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/clz;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dly$2;->onResponse(ILjava/lang/Object;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lo/dly$2;


# direct methods
.method constructor <init>(Lo/dly$2;)V
    .locals 0

    .line 105
    iput-object p1, p0, Lo/dly$2$5;->e:Lo/dly$2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFailure(ILjava/lang/Object;)V
    .locals 4

    .line 129
    const-string v0, "SMART_WeightSmarterHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "fetchUserData Failure "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 130
    return-void
.end method

.method public onSuccess(ILjava/lang/Object;)V
    .locals 6

    .line 108
    const-string v0, "SMART_WeightSmarterHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "fetchUserData Success "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 109
    move-object v4, p2

    check-cast v4, Ljava/util/List;

    .line 110
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-eqz v0, :cond_0

    .line 111
    const-string v0, "SMART_WeightSmarterHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "fetchUserData Success not null "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 112
    const/4 v0, 0x0

    invoke-interface {v4, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/hihealth/HiUserInfo;

    .line 113
    iget-object v0, p0, Lo/dly$2$5;->e:Lo/dly$2;

    iget v0, v0, Lo/dly$2;->e:I

    int-to-float v0, v0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/HiUserInfo;->setWeight(F)V

    .line 114
    iget-object v0, p0, Lo/dly$2$5;->e:Lo/dly$2;

    iget-object v0, v0, Lo/dly$2;->b:Lo/dly;

    iget-object v0, v0, Lo/dly;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    new-instance v1, Lo/dly$2$5$5;

    invoke-direct {v1, p0}, Lo/dly$2$5$5;-><init>(Lo/dly$2$5;)V

    invoke-interface {v0, v5, v1}, Lo/clt;->b(Lcom/huawei/hihealth/HiUserInfo;Lo/clz;)V

    .line 126
    :cond_0
    return-void
.end method
