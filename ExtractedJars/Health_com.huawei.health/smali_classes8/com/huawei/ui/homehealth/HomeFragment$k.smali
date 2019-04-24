.class Lcom/huawei/ui/homehealth/HomeFragment$k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwdevicedfxmanager/callback/IDeviceDFXBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/homehealth/HomeFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "k"
.end annotation


# instance fields
.field private b:Lo/eog;


# direct methods
.method constructor <init>(Lo/eog;)V
    .locals 0

    .line 1418
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1419
    iput-object p1, p0, Lcom/huawei/ui/homehealth/HomeFragment$k;->b:Lo/eog;

    .line 1420
    return-void
.end method


# virtual methods
.method public onFailure(ILjava/lang/String;)V
    .locals 4

    .line 1430
    const-string v0, "UIHLH_HomeFragment"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getMaintenanceFile ,onFailure err_code = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ",err_msg = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1431
    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment$k;->b:Lo/eog;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/eog;->e(Z)V

    .line 1432
    return-void
.end method

.method public onProgress(ILjava/lang/String;)V
    .locals 0

    .line 1435
    return-void
.end method

.method public onSuccess(ILjava/lang/String;)V
    .locals 4

    .line 1424
    const-string v0, "UIHLH_HomeFragment"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getMaintenanceFile onSuccess ,suc_code = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ",err_msg = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1425
    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment$k;->b:Lo/eog;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/eog;->e(Z)V

    .line 1426
    return-void
.end method
