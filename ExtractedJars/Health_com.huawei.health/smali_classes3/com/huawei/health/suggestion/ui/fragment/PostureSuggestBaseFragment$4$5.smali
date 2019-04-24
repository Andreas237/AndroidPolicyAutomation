.class Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment$4$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment$4;->d(Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment$4;


# direct methods
.method constructor <init>(Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment$4;)V
    .locals 0

    .line 235
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment$4$5;->d:Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment$4;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 238
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment$4$5;->d:Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment$4;

    iget-object v0, v0, Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment$4;->c:Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment;

    iget-object v0, v0, Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment;->l:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 239
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment$4$5;->d:Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment$4;

    iget-object v0, v0, Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment$4;->c:Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment;->c(Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment;)Lo/buv;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment$4$5;->d:Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment$4;

    iget-object v1, v1, Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment$4;->c:Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment;

    invoke-static {v1}, Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment;->b(Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/buv;->e(Ljava/util/List;)V

    .line 240
    return-void
.end method
