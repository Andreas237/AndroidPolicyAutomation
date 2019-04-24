.class Lcom/huawei/ui/main/stories/soical/NewSocialFragment$8$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/soical/NewSocialFragment$8;->onChange(ILcom/huawei/pluginmessagecenter/provider/data/MessageChangeEvent;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/ui/main/stories/soical/NewSocialFragment$8;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/soical/NewSocialFragment$8;)V
    .locals 0

    .line 1677
    iput-object p1, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$8$1;->b:Lcom/huawei/ui/main/stories/soical/NewSocialFragment$8;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    .line 1680
    invoke-static {}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->e()Ljava/lang/Object;

    move-result-object v2

    monitor-enter v2

    .line 1683
    :try_start_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$8$1;->b:Lcom/huawei/ui/main/stories/soical/NewSocialFragment$8;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$8;->c:Lcom/huawei/ui/main/stories/soical/NewSocialFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->b(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 1684
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$8$1;->b:Lcom/huawei/ui/main/stories/soical/NewSocialFragment$8;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$8;->c:Lcom/huawei/ui/main/stories/soical/NewSocialFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->b(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 1686
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$8$1;->b:Lcom/huawei/ui/main/stories/soical/NewSocialFragment$8;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$8;->c:Lcom/huawei/ui/main/stories/soical/NewSocialFragment;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$8$1;->b:Lcom/huawei/ui/main/stories/soical/NewSocialFragment$8;

    iget-object v1, v1, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$8;->c:Lcom/huawei/ui/main/stories/soical/NewSocialFragment;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->a(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;)Lo/eaa;

    move-result-object v1

    invoke-virtual {v1}, Lo/eaa;->b()Ljava/util/List;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->d(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;Ljava/util/List;)Ljava/util/List;

    .line 1688
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$8$1;->b:Lcom/huawei/ui/main/stories/soical/NewSocialFragment$8;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$8;->c:Lcom/huawei/ui/main/stories/soical/NewSocialFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->c(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;)Ljava/util/List;

    move-result-object v3

    .line 1689
    if-eqz v3, :cond_0

    .line 1690
    new-instance v4, Landroid/os/Message;

    invoke-direct {v4}, Landroid/os/Message;-><init>()V

    .line 1691
    const/16 v0, 0x15

    iput v0, v4, Landroid/os/Message;->what:I

    .line 1692
    iput-object v3, v4, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 1693
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$8$1;->b:Lcom/huawei/ui/main/stories/soical/NewSocialFragment$8;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$8;->c:Lcom/huawei/ui/main/stories/soical/NewSocialFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->e(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 1697
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$8$1;->b:Lcom/huawei/ui/main/stories/soical/NewSocialFragment$8;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$8;->c:Lcom/huawei/ui/main/stories/soical/NewSocialFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->b(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 1698
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$8$1;->b:Lcom/huawei/ui/main/stories/soical/NewSocialFragment$8;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$8;->c:Lcom/huawei/ui/main/stories/soical/NewSocialFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->e(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x1e

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 1702
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$8$1;->b:Lcom/huawei/ui/main/stories/soical/NewSocialFragment$8;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$8;->c:Lcom/huawei/ui/main/stories/soical/NewSocialFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->z(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1703
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v5

    monitor-exit v2

    throw v5

    .line 1704
    :goto_0
    return-void
.end method
