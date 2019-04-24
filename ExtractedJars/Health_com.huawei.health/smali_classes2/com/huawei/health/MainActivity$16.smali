.class Lcom/huawei/health/MainActivity$16;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/MainActivity;->an()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/health/MainActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/MainActivity;)V
    .locals 0

    .line 3635
    iput-object p1, p0, Lcom/huawei/health/MainActivity$16;->e:Lcom/huawei/health/MainActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 3638
    iget-object v0, p0, Lcom/huawei/health/MainActivity$16;->e:Lcom/huawei/health/MainActivity;

    invoke-static {v0}, Lcom/huawei/health/MainActivity;->b(Lcom/huawei/health/MainActivity;)Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/ena;->c(Landroid/content/Context;I)V

    .line 3639
    iget-object v0, p0, Lcom/huawei/health/MainActivity$16;->e:Lcom/huawei/health/MainActivity;

    invoke-static {v0}, Lcom/huawei/health/MainActivity;->M(Lcom/huawei/health/MainActivity;)V

    .line 3640
    iget-object v0, p0, Lcom/huawei/health/MainActivity$16;->e:Lcom/huawei/health/MainActivity;

    invoke-static {v0}, Lcom/huawei/health/MainActivity;->N(Lcom/huawei/health/MainActivity;)Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 3641
    iget-object v0, p0, Lcom/huawei/health/MainActivity$16;->e:Lcom/huawei/health/MainActivity;

    invoke-static {v0}, Lcom/huawei/health/MainActivity;->N(Lcom/huawei/health/MainActivity;)Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->c()V

    .line 3643
    :cond_0
    return-void
.end method
