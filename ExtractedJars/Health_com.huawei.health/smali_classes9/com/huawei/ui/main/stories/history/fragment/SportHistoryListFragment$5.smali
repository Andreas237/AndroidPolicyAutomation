.class Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->m()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;)V
    .locals 0

    .line 1234
    iput-object p1, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$5;->c:Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 6

    .line 1237
    const-string v0, "Track_SportHistoryListFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "it is positive"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1239
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$5;->c:Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->v(Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1240
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$5;->c:Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->p(Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;)Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$5;->c:Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->s(Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;)I

    move-result v1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/ffh;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$5;->c:Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->r(Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;)I

    move-result v1

    invoke-virtual {v0, v1}, Lo/ffh;->c(I)Lo/fff;

    move-result-object v4

    .line 1241
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$5;->c:Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;

    invoke-virtual {v4}, Lo/fff;->k()J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->d(Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;J)J

    .line 1242
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$5;->c:Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;

    invoke-virtual {v4}, Lo/fff;->m()J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->a(Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;J)J

    .line 1243
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$5;->c:Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->z(Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;)Landroid/os/Handler;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 1244
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$5;->c:Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->z(Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v5

    .line 1245
    invoke-virtual {v4}, Lo/fff;->g()I

    move-result v0

    iput v0, v5, Landroid/os/Message;->arg1:I

    .line 1246
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$5;->c:Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->z(Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 1249
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$5;->c:Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->o(Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;)Landroid/os/Handler;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 1250
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$5;->c:Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->o(Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v5

    .line 1251
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$5;->c:Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->o(Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 1255
    :cond_1
    return-void
.end method
