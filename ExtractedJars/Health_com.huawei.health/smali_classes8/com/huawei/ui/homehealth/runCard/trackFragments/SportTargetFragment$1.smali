.class Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/fkk;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->k()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;


# direct methods
.method constructor <init>(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;)V
    .locals 0

    .line 477
    iput-object p1, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment$1;->a:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(ILjava/lang/String;)V
    .locals 4

    .line 506
    const-string v0, "Track_SportTargetFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "errorMsg is"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "errorCode is"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 507
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment$1;->a:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;

    invoke-virtual {v0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    new-instance v1, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment$1$2;

    invoke-direct {v1, p0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment$1$2;-><init>(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment$1;)V

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 520
    return-void
.end method

.method public b(Ljava/lang/Object;)V
    .locals 4

    .line 485
    if-eqz p1, :cond_0

    .line 486
    const-string v0, "Track_SportTargetFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "checkSuportListenBook"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 488
    :cond_0
    const-string v0, "Track_SportTargetFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkSuportListenBook  obj  is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 490
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment$1;->a:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;

    invoke-virtual {v0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    new-instance v1, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment$1$3;

    invoke-direct {v1, p0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment$1$3;-><init>(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment$1;)V

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 498
    return-void
.end method
