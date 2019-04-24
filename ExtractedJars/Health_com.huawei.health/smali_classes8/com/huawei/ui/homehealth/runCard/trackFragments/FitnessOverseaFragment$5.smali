.class Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment$5;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;


# direct methods
.method constructor <init>(Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;)V
    .locals 0

    .line 615
    iput-object p1, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment$5;->d:Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 2

    .line 618
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 619
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 621
    :pswitch_0
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment$5;->d:Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;

    iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    invoke-static {v0, v1}, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;->d(Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;Ljava/util/List;)V

    .line 622
    goto :goto_0

    .line 627
    :pswitch_1
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment$5;->d:Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;->k(Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;)Landroid/widget/LinearLayout;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 628
    goto :goto_0

    .line 630
    :pswitch_2
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment$5;->d:Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;->i(Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;)Landroid/widget/LinearLayout;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 631
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment$5;->d:Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;->g(Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;)V

    .line 632
    goto :goto_0

    .line 634
    :pswitch_3
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment$5;->d:Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;->i(Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;)Landroid/widget/LinearLayout;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 635
    .line 639
    :goto_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1e
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method
