.class Lcom/huawei/health/suggestion/ui/PlanTypeActivity$7;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/suggestion/ui/PlanTypeActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/health/suggestion/ui/PlanTypeActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/suggestion/ui/PlanTypeActivity;Landroid/os/Looper;)V
    .locals 0

    .line 526
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/PlanTypeActivity$7;->e:Lcom/huawei/health/suggestion/ui/PlanTypeActivity;

    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 2

    .line 529
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 530
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 532
    :pswitch_0
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/PlanTypeActivity$7;->e:Lcom/huawei/health/suggestion/ui/PlanTypeActivity;

    iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v1, Ljava/util/Map;

    invoke-static {v0, v1}, Lcom/huawei/health/suggestion/ui/PlanTypeActivity;->b(Lcom/huawei/health/suggestion/ui/PlanTypeActivity;Ljava/util/Map;)V

    .line 533
    goto :goto_0

    .line 535
    :pswitch_1
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/PlanTypeActivity$7;->e:Lcom/huawei/health/suggestion/ui/PlanTypeActivity;

    iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    invoke-static {v0, v1}, Lcom/huawei/health/suggestion/ui/PlanTypeActivity;->c(Lcom/huawei/health/suggestion/ui/PlanTypeActivity;Ljava/util/List;)V

    .line 536
    goto :goto_0

    .line 538
    :pswitch_2
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/PlanTypeActivity$7;->e:Lcom/huawei/health/suggestion/ui/PlanTypeActivity;

    iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    invoke-static {v0, v1}, Lcom/huawei/health/suggestion/ui/PlanTypeActivity;->b(Lcom/huawei/health/suggestion/ui/PlanTypeActivity;Ljava/util/List;)V

    .line 539
    goto :goto_0

    .line 541
    :pswitch_3
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/PlanTypeActivity$7;->e:Lcom/huawei/health/suggestion/ui/PlanTypeActivity;

    iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    invoke-static {v0, v1}, Lcom/huawei/health/suggestion/ui/PlanTypeActivity;->a(Lcom/huawei/health/suggestion/ui/PlanTypeActivity;Ljava/util/List;)V

    .line 542
    goto :goto_0

    .line 544
    :pswitch_4
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/PlanTypeActivity$7;->e:Lcom/huawei/health/suggestion/ui/PlanTypeActivity;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/ui/PlanTypeActivity;->b()V

    .line 545
    .line 549
    :goto_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
    .end packed-switch
.end method
