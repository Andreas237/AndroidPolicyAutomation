.class Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment$1$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment$1;->b(ILjava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment$1;


# direct methods
.method constructor <init>(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment$1;)V
    .locals 0

    .line 507
    iput-object p1, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment$1$2;->a:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment$1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 510
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment$1$2;->a:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment$1;

    iget-object v0, v0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment$1;->a:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->a(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cds;->e(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 512
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment$1$2;->a:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment$1;

    iget-object v0, v0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment$1;->a:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->h(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;)Landroid/widget/ImageView;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$drawable;->track_sport_entrance_music_selector:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 513
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/ets;->k(Landroid/content/Context;I)V

    goto :goto_0

    .line 515
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment$1$2;->a:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment$1;

    iget-object v0, v0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment$1;->a:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->h(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;)Landroid/widget/ImageView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 518
    :goto_0
    return-void
.end method
