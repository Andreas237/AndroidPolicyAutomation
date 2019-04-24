.class Lcom/huawei/ui/homehealth/HomeFragment$15;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/homehealth/HomeFragment;->i()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/ui/homehealth/HomeFragment;


# direct methods
.method constructor <init>(Lcom/huawei/ui/homehealth/HomeFragment;)V
    .locals 0

    .line 438
    iput-object p1, p0, Lcom/huawei/ui/homehealth/HomeFragment$15;->e:Lcom/huawei/ui/homehealth/HomeFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public d()V
    .locals 5

    .line 441
    const-string v0, "UIHLH_HomeFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "PullRefresh start"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 442
    invoke-static {}, Lo/brt;->c()Lo/brt;

    move-result-object v0

    invoke-virtual {v0}, Lo/brt;->m()V

    .line 444
    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment$15;->e:Lcom/huawei/ui/homehealth/HomeFragment;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/HomeFragment;->i(Lcom/huawei/ui/homehealth/HomeFragment;)V

    .line 445
    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment$15;->e:Lcom/huawei/ui/homehealth/HomeFragment;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/HomeFragment;->k(Lcom/huawei/ui/homehealth/HomeFragment;)V

    .line 446
    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment$15;->e:Lcom/huawei/ui/homehealth/HomeFragment;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/HomeFragment;->f(Lcom/huawei/ui/homehealth/HomeFragment;)V

    .line 447
    const/4 v0, 0x1

    invoke-static {v0}, Lcom/huawei/ui/homehealth/HomeFragment;->a(Z)Z

    .line 449
    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment$15;->e:Lcom/huawei/ui/homehealth/HomeFragment;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/HomeFragment;->h(Lcom/huawei/ui/homehealth/HomeFragment;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v4

    .line 450
    const/16 v0, 0x3ec

    iput v0, v4, Landroid/os/Message;->what:I

    .line 451
    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment$15;->e:Lcom/huawei/ui/homehealth/HomeFragment;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/HomeFragment;->h(Lcom/huawei/ui/homehealth/HomeFragment;)Landroid/os/Handler;

    move-result-object v0

    const-wide/32 v1, 0x1d4c0

    invoke-virtual {v0, v4, v1, v2}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 452
    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment$15;->e:Lcom/huawei/ui/homehealth/HomeFragment;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/HomeFragment;->l(Lcom/huawei/ui/homehealth/HomeFragment;)Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 453
    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment$15;->e:Lcom/huawei/ui/homehealth/HomeFragment;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/HomeFragment;->l(Lcom/huawei/ui/homehealth/HomeFragment;)Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/ui/homehealth/redpacket/RedPacketManager;->fetchRedPacketInfo()V

    .line 455
    :cond_0
    return-void
.end method
