.class Lo/exs$5;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/exs;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/exs;


# direct methods
.method constructor <init>(Lo/exs;)V
    .locals 0

    .line 355
    iput-object p1, p0, Lo/exs$5;->b:Lo/exs;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 4

    .line 358
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 359
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    .line 362
    :sswitch_0
    iget-object v0, p0, Lo/exs$5;->b:Lo/exs;

    invoke-static {v0}, Lo/exs;->d(Lo/exs;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 363
    const-string v0, "SCUI_FitnessStepDetailInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initStepDetailWalkInfo no message"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 364
    iget-object v0, p0, Lo/exs$5;->b:Lo/exs;

    invoke-static {v0}, Lo/exs;->h(Lo/exs;)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 365
    iget-object v0, p0, Lo/exs$5;->b:Lo/exs;

    invoke-static {v0}, Lo/exs;->k(Lo/exs;)Landroid/widget/FrameLayout;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 366
    return-void

    .line 368
    :cond_0
    iget-object v0, p0, Lo/exs$5;->b:Lo/exs;

    invoke-static {v0}, Lo/exs;->h(Lo/exs;)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 369
    iget-object v0, p0, Lo/exs$5;->b:Lo/exs;

    invoke-static {v0}, Lo/exs;->k(Lo/exs;)Landroid/widget/FrameLayout;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 370
    iget-object v0, p0, Lo/exs$5;->b:Lo/exs;

    invoke-static {v0}, Lo/exs;->i(Lo/exs;)Landroid/widget/RelativeLayout;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 371
    iget-object v0, p0, Lo/exs$5;->b:Lo/exs;

    invoke-static {v0}, Lo/exs;->g(Lo/exs;)Landroid/widget/ImageView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 373
    iget-object v0, p0, Lo/exs$5;->b:Lo/exs;

    invoke-static {v0}, Lo/exs;->o(Lo/exs;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lo/exs$5;->b:Lo/exs;

    invoke-static {v1}, Lo/exs;->d(Lo/exs;)Ljava/util/List;

    move-result-object v1

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;

    invoke-virtual {v1}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getMsgTitle()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 374
    iget-object v0, p0, Lo/exs$5;->b:Lo/exs;

    invoke-static {v0}, Lo/exs;->p(Lo/exs;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lo/exs$5;->b:Lo/exs;

    invoke-static {v1}, Lo/exs;->e(Lo/exs;)Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lo/exs$5;->b:Lo/exs;

    invoke-static {v2}, Lo/exs;->d(Lo/exs;)Ljava/util/List;

    move-result-object v2

    const/4 v3, 0x0

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;

    invoke-virtual {v2}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getCreateTime()J

    move-result-wide v2

    invoke-static {v1, v2, v3}, Lo/exj;->c(Landroid/content/Context;J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 375
    iget-object v0, p0, Lo/exs$5;->b:Lo/exs;

    iget-object v1, p0, Lo/exs$5;->b:Lo/exs;

    invoke-static {v1}, Lo/exs;->d(Lo/exs;)Ljava/util/List;

    move-result-object v1

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;

    invoke-virtual {v1}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getImgUri()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lo/exs$5;->b:Lo/exs;

    invoke-static {v2}, Lo/exs;->l(Lo/exs;)Landroid/widget/ImageView;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lo/exs;->e(Lo/exs;Ljava/lang/String;Landroid/widget/ImageView;)V

    .line 376
    iget-object v0, p0, Lo/exs$5;->b:Lo/exs;

    invoke-static {v0}, Lo/exs;->i(Lo/exs;)Landroid/widget/RelativeLayout;

    move-result-object v0

    new-instance v1, Lo/exs$5$4;

    invoke-direct {v1, p0}, Lo/exs$5$4;-><init>(Lo/exs$5;)V

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 382
    .line 386
    :goto_0
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x271a -> :sswitch_0
    .end sparse-switch
.end method
