.class Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->c(JJ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;)V
    .locals 0

    .line 325
    iput-object p1, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$2;->a:Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 328
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$2;->a:Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_0

    .line 329
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$2;->a:Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->b(Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;)V

    .line 330
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$2;->a:Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->d(Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;)V

    .line 332
    :cond_0
    return-void
.end method
