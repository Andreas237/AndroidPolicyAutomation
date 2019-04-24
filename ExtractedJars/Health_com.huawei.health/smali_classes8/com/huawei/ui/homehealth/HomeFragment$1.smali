.class Lcom/huawei/ui/homehealth/HomeFragment$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/ui/main/stories/recommendcloud/service/RecommendCloudCallBack;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/homehealth/HomeFragment;->m()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/ui/homehealth/HomeFragment;


# direct methods
.method constructor <init>(Lcom/huawei/ui/homehealth/HomeFragment;)V
    .locals 0

    .line 759
    iput-object p1, p0, Lcom/huawei/ui/homehealth/HomeFragment$1;->b:Lcom/huawei/ui/homehealth/HomeFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponce(Ljava/lang/String;I)V
    .locals 5

    .line 762
    const-string v0, "UIHLH_HomeFragment"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "RecommendCloud doRefreshBatch "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    const-string v2, " resCode = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 763
    const-string v0, "sleepServiceConfig"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 764
    const/4 v0, 0x0

    if-ne v0, p2, :cond_0

    .line 765
    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment$1;->b:Lcom/huawei/ui/homehealth/HomeFragment;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/HomeFragment;->b(Lcom/huawei/ui/homehealth/HomeFragment;)Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "service_recommend_file"

    const-string v3, "1"

    new-instance v4, Lo/dcy;

    invoke-direct {v4}, Lo/dcy;-><init>()V

    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    goto :goto_0

    .line 767
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment$1;->b:Lcom/huawei/ui/homehealth/HomeFragment;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/HomeFragment;->b(Lcom/huawei/ui/homehealth/HomeFragment;)Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "service_recommend_file"

    const-string v3, "0"

    new-instance v4, Lo/dcy;

    invoke-direct {v4}, Lo/dcy;-><init>()V

    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 770
    :cond_1
    :goto_0
    return-void
.end method
