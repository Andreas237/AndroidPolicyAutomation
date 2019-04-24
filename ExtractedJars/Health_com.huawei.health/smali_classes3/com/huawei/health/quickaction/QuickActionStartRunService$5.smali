.class Lcom/huawei/health/quickaction/QuickActionStartRunService$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/clz;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/quickaction/QuickActionStartRunService;->onCreate()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/health/quickaction/QuickActionStartRunService;


# direct methods
.method constructor <init>(Lcom/huawei/health/quickaction/QuickActionStartRunService;)V
    .locals 0

    .line 47
    iput-object p1, p0, Lcom/huawei/health/quickaction/QuickActionStartRunService$5;->d:Lcom/huawei/health/quickaction/QuickActionStartRunService;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFailure(ILjava/lang/Object;)V
    .locals 4

    .line 57
    const-string v0, "QuickActionStartRunService"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " fetchUserData onFailure errCode:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " errMsg:"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 58
    return-void
.end method

.method public onSuccess(ILjava/lang/Object;)V
    .locals 4

    .line 50
    move-object v2, p2

    check-cast v2, Ljava/util/List;

    .line 51
    const/4 v0, 0x0

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/hihealth/HiUserInfo;

    .line 52
    iget-object v0, p0, Lcom/huawei/health/quickaction/QuickActionStartRunService$5;->d:Lcom/huawei/health/quickaction/QuickActionStartRunService;

    invoke-virtual {v3}, Lcom/huawei/hihealth/HiUserInfo;->getOwerID()I

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/health/quickaction/QuickActionStartRunService;->b(Lcom/huawei/health/quickaction/QuickActionStartRunService;I)I

    .line 53
    return-void
.end method
