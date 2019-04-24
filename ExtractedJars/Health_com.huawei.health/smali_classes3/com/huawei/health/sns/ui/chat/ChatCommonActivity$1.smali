.class Lcom/huawei/health/sns/ui/chat/ChatCommonActivity$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AbsListView$OnScrollListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;)V
    .locals 0

    .line 1358
    iput-object p1, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity$1;->a:Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onScroll(Landroid/widget/AbsListView;III)V
    .locals 5

    .line 1362
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity$1;->a:Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;

    iget-object v0, v0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->g:Lo/arn;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity$1;->a:Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;

    iget-object v0, v0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->g:Lo/arn;

    invoke-virtual {v0}, Lo/arn;->a()J

    move-result-wide v0

    const-wide/32 v2, 0x7fffffff

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity$1;->a:Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;

    iget v0, v0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->H:I

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity$1;->a:Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;

    iget v1, v1, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->G:I

    if-lt v0, v1, :cond_0

    .line 1365
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity$1;->a:Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;

    iget-object v0, v0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->s:Lo/bdj;

    invoke-virtual {v0, p2}, Lo/bdj;->a(I)Lcom/huawei/health/sns/model/chat/MessageItem;

    move-result-object v4

    .line 1366
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity$1;->a:Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;

    iget-object v0, v0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->g:Lo/arn;

    invoke-virtual {v0}, Lo/arn;->a()J

    move-result-wide v0

    invoke-virtual {v4}, Lcom/huawei/health/sns/model/chat/MessageItem;->getId()I

    move-result v2

    int-to-long v2, v2

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    .line 1369
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity$1;->a:Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;

    iget-object v0, v0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->x:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 1370
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity$1;->a:Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;

    const/4 v1, 0x0

    iput v1, v0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->H:I

    .line 1373
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity$1;->a:Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;

    iget-object v0, v0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->y:Lo/bdx;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/bdx;->c(I)V

    .line 1374
    return-void
.end method

.method public onScrollStateChanged(Landroid/widget/AbsListView;I)V
    .locals 4

    .line 1379
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity$1;->a:Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;

    iget-object v0, v0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->s:Lo/bdj;

    if-nez v0, :cond_0

    .line 1381
    return-void

    .line 1383
    :cond_0
    packed-switch p2, :pswitch_data_0

    goto/16 :goto_0

    .line 1388
    :pswitch_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity$1;->a:Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;

    const/4 v1, 0x0

    iput-boolean v1, v0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->A:Z

    .line 1389
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity$1;->a:Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;

    iget-object v0, v0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->z:Lo/bfb;

    invoke-virtual {v0}, Lo/bfb;->d()V

    .line 1390
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity$1;->a:Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;

    iget-object v0, v0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->z:Lo/bfb;

    invoke-virtual {v0}, Lo/bfb;->k()V

    .line 1391
    goto :goto_0

    .line 1395
    :pswitch_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity$1;->a:Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;

    iget-object v0, v0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->s:Lo/bdj;

    invoke-virtual {v0}, Lo/bdj;->getCount()I

    move-result v2

    .line 1397
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity$1;->a:Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;

    iget-object v0, v0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->j:Lo/bdu;

    invoke-virtual {v0}, Lo/bdu;->getLastVisiblePosition()I

    move-result v3

    .line 1398
    add-int/lit8 v0, v2, -0x1

    if-lt v3, v0, :cond_1

    .line 1400
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity$1;->a:Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;

    const/4 v1, 0x1

    iput-boolean v1, v0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->A:Z

    .line 1402
    :cond_1
    if-lez v2, :cond_2

    .line 1405
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity$1;->a:Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;

    iget-object v0, v0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->j:Lo/bdu;

    invoke-virtual {v0}, Lo/bdu;->getFirstVisiblePosition()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_2

    .line 1408
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity$1;->a:Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;

    iget-object v0, v0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->O:Landroid/os/Handler;

    const/16 v1, 0x64

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 1410
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity$1;->a:Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->G()V

    .line 1418
    :cond_2
    :goto_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method
