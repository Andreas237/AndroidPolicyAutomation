.class Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cza;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment;->i()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment;)V
    .locals 0

    .line 330
    iput-object p1, p0, Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment$4;->d:Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCallBackFail(I)V
    .locals 4

    .line 340
    const-string v0, "Opera_HealthShopFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "GRSManager onCallBackFail HEALTH_RECOMMEND i = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 341
    return-void
.end method

.method public onCallBackSuccess(Ljava/lang/String;)V
    .locals 5

    .line 333
    const-string v0, "Opera_HealthShopFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "GRSManager onCallBackSuccess HEALTH_RECOMMEND url = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 334
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/miniShop/html/homePage.html"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 335
    iget-object v0, p0, Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment$4;->d:Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment;->k(Lcom/huawei/ui/main/stories/healthshop/HealthShopFragment;)Lcom/huawei/operation/view/CustomWebView;

    move-result-object v0

    invoke-virtual {v0, v4}, Lcom/huawei/operation/view/CustomWebView;->load(Ljava/lang/String;)V

    .line 336
    return-void
.end method
