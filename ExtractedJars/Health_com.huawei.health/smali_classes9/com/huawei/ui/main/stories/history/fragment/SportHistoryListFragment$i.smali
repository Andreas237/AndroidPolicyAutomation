.class Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$i;
.super Lo/dbb;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "i"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/dbb<Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;>;"
    }
.end annotation


# instance fields
.field a:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/os/Looper;Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;)V
    .locals 1

    .line 376
    invoke-direct {p0, p1, p2}, Lo/dbb;-><init>(Landroid/os/Looper;Ljava/lang/Object;)V

    .line 377
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$i;->a:Ljava/lang/ref/WeakReference;

    .line 378
    return-void
.end method


# virtual methods
.method protected c(Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;Landroid/os/Message;)V
    .locals 7

    .line 382
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$i;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;

    .line 383
    if-nez v6, :cond_0

    .line 384
    const-string v0, "Track_SportHistoryListFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "sportHistory weakReference is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 385
    return-void

    .line 387
    :cond_0
    iget v0, p2, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 389
    :pswitch_0
    invoke-static {v6, p2}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->d(Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;Landroid/os/Message;)V

    .line 390
    goto :goto_0

    .line 392
    :pswitch_1
    invoke-static {v6, p2}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->a(Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;Landroid/os/Message;)V

    .line 393
    goto :goto_0

    .line 395
    :pswitch_2
    move-object v0, v6

    iget v1, p2, Landroid/os/Message;->arg1:I

    invoke-static {v6}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->e(Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;)J

    move-result-wide v2

    invoke-static {v6}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->c(Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;)J

    move-result-wide v4

    invoke-static/range {v0 .. v5}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->c(Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;IJJ)V

    .line 396
    goto :goto_0

    .line 398
    :pswitch_3
    iget v0, p2, Landroid/os/Message;->arg1:I

    invoke-static {v6, v0}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->b(Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;I)V

    .line 399
    .line 403
    :goto_0
    :pswitch_4
    return-void

    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_2
        :pswitch_4
        :pswitch_0
        :pswitch_1
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_3
    .end packed-switch
.end method

.method public synthetic handleMessageWhenReferenceNotNull(Ljava/lang/Object;Landroid/os/Message;)V
    .locals 1

    .line 372
    move-object v0, p1

    check-cast v0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;

    invoke-virtual {p0, v0, p2}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$i;->c(Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;Landroid/os/Message;)V

    return-void
.end method
