.class Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment$6;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;


# direct methods
.method constructor <init>(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;)V
    .locals 0

    .line 718
    iput-object p1, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment$6;->b:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 4

    .line 721
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 722
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment$6;->b:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;

    iget v1, p1, Landroid/os/Message;->arg1:I

    invoke-static {v0, v1}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->a(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;I)I

    .line 723
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment$6;->b:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;

    iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Float;

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->b(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;F)F

    .line 724
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment$6;->b:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;

    iget-object v1, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment$6;->b:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;

    invoke-static {v1}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->g(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;)I

    move-result v1

    iget-object v2, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment$6;->b:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;

    invoke-static {v2}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->i(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;)F

    move-result v2

    const/4 v3, 0x1

    invoke-static {v0, v1, v2, v3}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->a(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;IFZ)V

    .line 725
    const-string v0, "Track_SportTargetFragment"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Custom set targetValue = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment$6;->b:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;

    invoke-static {v2}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->i(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;)F

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " targetType = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment$6;->b:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;

    invoke-static {v2}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->g(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 726
    return-void
.end method
