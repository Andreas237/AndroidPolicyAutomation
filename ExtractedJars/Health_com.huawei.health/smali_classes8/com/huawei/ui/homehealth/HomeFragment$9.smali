.class final Lcom/huawei/ui/homehealth/HomeFragment$9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/clz;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/homehealth/HomeFragment;->b(Landroid/content/Context;Lo/egg;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic e:Lo/egg;


# direct methods
.method constructor <init>(Lo/egg;)V
    .locals 0

    .line 1637
    iput-object p1, p0, Lcom/huawei/ui/homehealth/HomeFragment$9;->e:Lo/egg;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFailure(ILjava/lang/Object;)V
    .locals 4

    .line 1654
    const-string v0, "UIHLH_HomeFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "fetchUserData onFailure"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1655
    return-void
.end method

.method public onSuccess(ILjava/lang/Object;)V
    .locals 6

    .line 1640
    const-string v0, "UIHLH_HomeFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "fetchUserData onSuccess,data = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1641
    if-eqz p2, :cond_0

    .line 1642
    move-object v4, p2

    check-cast v4, Ljava/util/List;

    .line 1643
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 1644
    const-string v0, "UIHLH_HomeFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "fetchUserData onSuccess"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1645
    const/4 v0, 0x0

    invoke-interface {v4, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/hihealth/HiUserInfo;

    .line 1646
    const-string v0, "UIHLH_HomeFragment"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "height=="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v5}, Lcom/huawei/hihealth/HiUserInfo;->getHeight()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, "weight=="

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-virtual {v5}, Lcom/huawei/hihealth/HiUserInfo;->getWeight()F

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1647
    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment$9;->e:Lo/egg;

    const/4 v1, 0x0

    invoke-interface {v0, v1, v5}, Lo/egg;->c(ILjava/lang/Object;)V

    .line 1650
    :cond_0
    return-void
.end method
