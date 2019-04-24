.class Lcom/huawei/ui/main/stories/soical/NewSocialFragment$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/ui/main/stories/soical/NewSocialFragment;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;)V
    .locals 0

    .line 275
    iput-object p1, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$3;->d:Lcom/huawei/ui/main/stories/soical/NewSocialFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    .line 278
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$3;->d:Lcom/huawei/ui/main/stories/soical/NewSocialFragment;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$3;->d:Lcom/huawei/ui/main/stories/soical/NewSocialFragment;

    invoke-virtual {v1}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-static {v1}, Lo/eaa;->c(Landroid/content/Context;)Lo/eaa;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->d(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;Lo/eaa;)Lo/eaa;

    .line 279
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$3;->d:Lcom/huawei/ui/main/stories/soical/NewSocialFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->d(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;)V

    .line 280
    invoke-static {}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->e()Ljava/lang/Object;

    move-result-object v2

    monitor-enter v2

    .line 281
    :try_start_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$3;->d:Lcom/huawei/ui/main/stories/soical/NewSocialFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->b(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 282
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$3;->d:Lcom/huawei/ui/main/stories/soical/NewSocialFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->b(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 284
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$3;->d:Lcom/huawei/ui/main/stories/soical/NewSocialFragment;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$3;->d:Lcom/huawei/ui/main/stories/soical/NewSocialFragment;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->a(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;)Lo/eaa;

    move-result-object v1

    invoke-virtual {v1}, Lo/eaa;->b()Ljava/util/List;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->d(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;Ljava/util/List;)Ljava/util/List;

    .line 285
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$3;->d:Lcom/huawei/ui/main/stories/soical/NewSocialFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->c(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;)Ljava/util/List;

    move-result-object v3

    .line 286
    if-eqz v3, :cond_0

    .line 287
    new-instance v4, Landroid/os/Message;

    invoke-direct {v4}, Landroid/os/Message;-><init>()V

    .line 288
    const/16 v0, 0x15

    iput v0, v4, Landroid/os/Message;->what:I

    .line 289
    iput-object v3, v4, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 290
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$3;->d:Lcom/huawei/ui/main/stories/soical/NewSocialFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->e(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 292
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$3;->d:Lcom/huawei/ui/main/stories/soical/NewSocialFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->b(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 293
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$3;->d:Lcom/huawei/ui/main/stories/soical/NewSocialFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->e(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x1e

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 296
    :cond_1
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v5

    monitor-exit v2

    throw v5

    .line 297
    :goto_0
    return-void
.end method
