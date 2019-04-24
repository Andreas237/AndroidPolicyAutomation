.class Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/bur$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment;


# direct methods
.method constructor <init>(Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment;)V
    .locals 0

    .line 62
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment$2;->a:Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 4

    .line 65
    const-string v0, "Suggestion_FitnessFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "loadMore()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 66
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment$2;->a:Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment;

    iget-object v0, v0, Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment;->e:Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment$a;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment$2;->a:Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment;

    invoke-static {v1}, Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment;->e(Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment$a;->a(I)V

    .line 67
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment$2;->a:Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment$2;->a:Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment;

    iget-object v1, v1, Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment;->e:Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment$a;

    invoke-static {v0, v1}, Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment;->b(Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment;Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment$a;)V

    .line 68
    return-void
.end method
