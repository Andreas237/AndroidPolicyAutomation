.class final Lcom/huawei/login/huaweilogin/HuaweiLoginManager$8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/dcx;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/login/huaweilogin/HuaweiLoginManager;->setCloudVersion(Ljava/lang/String;Lo/dcx;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic val$callback:Lo/dcx;

.field final synthetic val$cloudVersion:Ljava/lang/String;


# direct methods
.method constructor <init>(Ljava/lang/String;Lo/dcx;)V
    .locals 0

    .line 717
    iput-object p1, p0, Lcom/huawei/login/huaweilogin/HuaweiLoginManager$8;->val$cloudVersion:Ljava/lang/String;

    iput-object p2, p0, Lcom/huawei/login/huaweilogin/HuaweiLoginManager$8;->val$callback:Lo/dcx;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onProcessed(Lo/ddb;)V
    .locals 2

    .line 720
    invoke-virtual {p1}, Lo/ddb;->d()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 721
    iget-object v0, p0, Lcom/huawei/login/huaweilogin/HuaweiLoginManager$8;->val$cloudVersion:Ljava/lang/String;

    invoke-static {v0}, Lo/cxh;->c(Ljava/lang/String;)V

    .line 722
    iget-object v0, p0, Lcom/huawei/login/huaweilogin/HuaweiLoginManager$8;->val$cloudVersion:Ljava/lang/String;

    invoke-static {v0}, Lo/dbf;->c(Ljava/lang/String;)V

    .line 724
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 725
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dhu;->c(Landroid/content/Context;)V

    .line 726
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/login/huaweilogin/HuaweiLoginManager$8;->val$cloudVersion:Ljava/lang/String;

    invoke-static {v0, v1}, Lo/dbf;->a(Landroid/content/Context;Ljava/lang/String;)V

    .line 729
    :cond_0
    iget-object v0, p0, Lcom/huawei/login/huaweilogin/HuaweiLoginManager$8;->val$callback:Lo/dcx;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 730
    iget-object v0, p0, Lcom/huawei/login/huaweilogin/HuaweiLoginManager$8;->val$callback:Lo/dcx;

    invoke-interface {v0, p1}, Lo/dcx;->onProcessed(Lo/ddb;)V

    .line 732
    :cond_1
    return-void
.end method
