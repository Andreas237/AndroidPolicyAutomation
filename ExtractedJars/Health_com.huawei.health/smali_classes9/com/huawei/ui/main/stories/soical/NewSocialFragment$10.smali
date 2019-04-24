.class Lcom/huawei/ui/main/stories/soical/NewSocialFragment$10;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->d()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/ui/main/stories/soical/NewSocialFragment;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;)V
    .locals 0

    .line 462
    iput-object p1, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$10;->e:Lcom/huawei/ui/main/stories/soical/NewSocialFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 465
    invoke-static {}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->e()Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1

    .line 466
    :try_start_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$10;->e:Lcom/huawei/ui/main/stories/soical/NewSocialFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->k(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/eaa;->c(Landroid/content/Context;)Lo/eaa;

    move-result-object v0

    invoke-virtual {v0}, Lo/eaa;->k()V

    .line 467
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$10;->e:Lcom/huawei/ui/main/stories/soical/NewSocialFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->i(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;)V

    .line 468
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$10;->e:Lcom/huawei/ui/main/stories/soical/NewSocialFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->m(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 469
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2

    .line 470
    :goto_0
    return-void
.end method
