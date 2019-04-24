.class final Lcom/huawei/login/huaweilogin/HuaweiLoginManager$6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/dcx;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/login/huaweilogin/HuaweiLoginManager;->updateAppTypeBySiteID(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic val$tmpSiteId:I


# direct methods
.method constructor <init>(I)V
    .locals 0

    .line 679
    iput p1, p0, Lcom/huawei/login/huaweilogin/HuaweiLoginManager$6;->val$tmpSiteId:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onProcessed(Lo/ddb;)V
    .locals 4

    .line 682
    invoke-virtual {p1}, Lo/ddb;->d()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 683
    iget v0, p0, Lcom/huawei/login/huaweilogin/HuaweiLoginManager$6;->val$tmpSiteId:I

    invoke-static {v0}, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;->access$602(I)I

    .line 684
    const-string v0, "PLGLOGIN_HuaweiLoginManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setCloudVersion HAVE_CLOUD, onProcessed success"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 685
    const-string v0, "PLGLOGIN_HuaweiLoginManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setCloudVersion HAVE_CLOUD, onProcessed success\uff0clastSiteid ="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {}, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;->access$600()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 687
    :cond_0
    const-string v0, "PLGLOGIN_HuaweiLoginManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setCloudVersion HAVE_CLOUD,onProcessed fail"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 689
    :goto_0
    return-void
.end method
