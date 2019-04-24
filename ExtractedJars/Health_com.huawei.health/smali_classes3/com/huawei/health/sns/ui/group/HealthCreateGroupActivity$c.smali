.class Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity$c;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "c"
.end annotation


# instance fields
.field private a:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;>;"
        }
    .end annotation
.end field

.field final synthetic c:Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;


# direct methods
.method public constructor <init>(Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;)V
    .locals 1

    .line 609
    iput-object p1, p0, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity$c;->c:Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 610
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity$c;->a:Ljava/lang/ref/WeakReference;

    .line 611
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 6

    .line 615
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 616
    const-string v0, "Group_HealthCreateGroupActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "HealthGroupUIHandler handleMessage thread:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 617
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity$c;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;

    .line 618
    if-eqz v4, :cond_0

    invoke-virtual {v4}, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 619
    :cond_0
    return-void

    .line 621
    :cond_1
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    .line 623
    :sswitch_0
    const-string v0, "Group_HealthCreateGroupActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HealthGroupUIHandler handleMessage: MSG_ADD_GROUP_OK"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 626
    goto :goto_0

    .line 628
    :sswitch_1
    const-string v0, "Group_HealthCreateGroupActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HealthGroupUIHandler handleMessage: MSG_FAILED_CREATE_GROUP"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 629
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity$c;->c:Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->i(Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;)V

    .line 630
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity$c;->c:Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;

    const/16 v1, 0x70

    invoke-static {v0, v1}, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->c(Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;I)V

    .line 632
    goto :goto_0

    .line 634
    :sswitch_2
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity$c;->c:Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->i(Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;)V

    .line 636
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity$c;->c:Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->m(Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;)V

    .line 638
    goto :goto_0

    .line 640
    :sswitch_3
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity$c;->c:Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->i(Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;)V

    .line 641
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity$c;->c:Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;

    const/16 v1, 0x72

    invoke-static {v0, v1}, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->c(Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;I)V

    .line 643
    goto :goto_0

    .line 645
    :sswitch_4
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity$c;->c:Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->i(Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;)V

    .line 646
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity$c;->c:Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->b(Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;)Landroid/app/Activity;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_group_info_contain_keywords:I

    invoke-virtual {v0, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v5

    .line 647
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity$c;->c:Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;

    invoke-static {v0, v5}, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->d(Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;Ljava/lang/String;)V

    .line 649
    .line 653
    :goto_0
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x65 -> :sswitch_0
        0x70 -> :sswitch_1
        0x71 -> :sswitch_2
        0x72 -> :sswitch_3
        0x527b -> :sswitch_4
    .end sparse-switch
.end method
