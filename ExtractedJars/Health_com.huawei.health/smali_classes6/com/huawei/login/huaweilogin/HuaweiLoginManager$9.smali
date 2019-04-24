.class final Lcom/huawei/login/huaweilogin/HuaweiLoginManager$9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/dcx;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/login/huaweilogin/HuaweiLoginManager;->setIsAllowedLoginValueToDB(Landroid/content/Context;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic val$ifAllowLogin:Ljava/lang/String;


# direct methods
.method constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 738
    iput-object p1, p0, Lcom/huawei/login/huaweilogin/HuaweiLoginManager$9;->val$ifAllowLogin:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onProcessed(Lo/ddb;)V
    .locals 5

    .line 741
    invoke-virtual {p1}, Lo/ddb;->d()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 742
    iget-object v0, p0, Lcom/huawei/login/huaweilogin/HuaweiLoginManager$9;->val$ifAllowLogin:Ljava/lang/String;

    invoke-static {v0}, Lo/dbf;->e(Ljava/lang/String;)V

    .line 743
    const-string v0, "0"

    iget-object v1, p0, Lcom/huawei/login/huaweilogin/HuaweiLoginManager$9;->val$ifAllowLogin:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 744
    new-instance v4, Lcom/huawei/hihealth/HiDataUpdateOption;

    invoke-direct {v4}, Lcom/huawei/hihealth/HiDataUpdateOption;-><init>()V

    .line 745
    const/16 v0, 0x65

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiDataUpdateOption;->setType(I)V

    .line 746
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    new-instance v1, Lcom/huawei/login/huaweilogin/HuaweiLoginManager$9$1;

    invoke-direct {v1, p0}, Lcom/huawei/login/huaweilogin/HuaweiLoginManager$9$1;-><init>(Lcom/huawei/login/huaweilogin/HuaweiLoginManager$9;)V

    invoke-interface {v0, v4, v1}, Lo/clt;->e(Lcom/huawei/hihealth/HiDataUpdateOption;Lo/cma;)V

    .line 753
    :cond_0
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 754
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/login/huaweilogin/HuaweiLoginManager$9;->val$ifAllowLogin:Ljava/lang/String;

    invoke-static {v0, v1}, Lo/dbf;->d(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_0

    .line 757
    :cond_1
    const-string v0, "PLGLOGIN_HuaweiLoginManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setValue KEY_UI_ID_IS_ALLOW_LOGIN_OR_NOT faied!! "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p1}, Lo/ddb;->d()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 759
    :cond_2
    :goto_0
    return-void
.end method
