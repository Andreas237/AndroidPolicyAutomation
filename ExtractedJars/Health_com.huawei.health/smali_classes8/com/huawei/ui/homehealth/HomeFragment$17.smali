.class Lcom/huawei/ui/homehealth/HomeFragment$17;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/ffv;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/homehealth/HomeFragment;->p()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/ui/homehealth/HomeFragment;


# direct methods
.method constructor <init>(Lcom/huawei/ui/homehealth/HomeFragment;)V
    .locals 0

    .line 702
    iput-object p1, p0, Lcom/huawei/ui/homehealth/HomeFragment$17;->e:Lcom/huawei/ui/homehealth/HomeFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public d(Ljava/lang/String;I)V
    .locals 5

    .line 705
    const-string v0, "UIHLH_HomeFragment"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "LightCloud doRefreshBatch "

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

    .line 706
    const-string v0, "airule_v1"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 707
    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment$17;->e:Lcom/huawei/ui/homehealth/HomeFragment;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/HomeFragment;->b(Lcom/huawei/ui/homehealth/HomeFragment;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p2}, Lo/fie;->c(Landroid/content/Context;I)V

    .line 709
    :cond_0
    const-string v0, "servicefw_v1"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 710
    const/4 v0, 0x0

    if-ne v0, p2, :cond_1

    .line 711
    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment$17;->e:Lcom/huawei/ui/homehealth/HomeFragment;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/HomeFragment;->p(Lcom/huawei/ui/homehealth/HomeFragment;)V

    .line 712
    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment$17;->e:Lcom/huawei/ui/homehealth/HomeFragment;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/HomeFragment;->b(Lcom/huawei/ui/homehealth/HomeFragment;)Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "servicefw_file_v1"

    const-string v3, "1"

    new-instance v4, Lo/dcy;

    invoke-direct {v4}, Lo/dcy;-><init>()V

    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    goto :goto_0

    .line 714
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment$17;->e:Lcom/huawei/ui/homehealth/HomeFragment;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/HomeFragment;->b(Lcom/huawei/ui/homehealth/HomeFragment;)Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "servicefw_file_v1"

    const-string v3, "0"

    new-instance v4, Lo/dcy;

    invoke-direct {v4}, Lo/dcy;-><init>()V

    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 717
    :cond_2
    :goto_0
    invoke-static {}, Lo/dbf;->q()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 718
    const-string v0, "healthconfig"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 719
    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment$17;->e:Lcom/huawei/ui/homehealth/HomeFragment;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/HomeFragment;->b(Lcom/huawei/ui/homehealth/HomeFragment;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/ui/homewear21/wearjoin/JoinRuleParse;->parseResult(Landroid/content/Context;)I

    .line 723
    :cond_3
    return-void
.end method
