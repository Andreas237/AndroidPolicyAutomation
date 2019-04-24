.class Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/dhl;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;


# direct methods
.method constructor <init>(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;)V
    .locals 0

    .line 783
    iput-object p1, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$1;->c:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 2

    .line 786
    invoke-static {p1}, Lo/dhr;->c(I)I

    move-result v1

    .line 787
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$1;->c:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->h(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;)I

    move-result v0

    if-eq v0, p1, :cond_0

    .line 788
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$1;->c:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;

    invoke-virtual {v0, v1}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->b(I)V

    .line 789
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$1;->c:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;

    invoke-static {v0, p1}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->e(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;I)I

    .line 791
    :cond_0
    return-void
.end method
