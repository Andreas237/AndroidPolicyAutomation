.class Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/erj$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;->c()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;


# direct methods
.method constructor <init>(Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;)V
    .locals 0

    .line 315
    iput-object p1, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment$1;->a:Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;)V
    .locals 4

    .line 318
    const-string v0, "HS_FitnessOverseaFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "calculateSportLevel "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 319
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment$1;->a:Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;

    invoke-static {v0, p1}, Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;->e(Lcom/huawei/ui/homehealth/runCard/trackFragments/FitnessOverseaFragment;Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;)V

    .line 321
    return-void
.end method
