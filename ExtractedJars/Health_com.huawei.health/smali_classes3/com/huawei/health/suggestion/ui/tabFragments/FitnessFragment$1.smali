.class Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment;


# direct methods
.method constructor <init>(Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment;)V
    .locals 0

    .line 78
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment$1;->c:Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 81
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment$1;->c:Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment$1;->c:Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment;

    invoke-static {v1}, Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment;->b(Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment;)Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment$b;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment;->d(Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment;Lo/bui;)V

    .line 82
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment$1;->c:Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment$1;->c:Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment;

    iget-object v1, v1, Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment;->e:Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment$a;

    invoke-static {v0, v1}, Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment;->b(Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment;Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment$a;)V

    .line 83
    return-void
.end method
