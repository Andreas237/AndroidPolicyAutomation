.class Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$h;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "h"
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;


# direct methods
.method private constructor <init>(Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;)V
    .locals 0

    .line 409
    iput-object p1, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$h;->e:Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$2;)V
    .locals 0

    .line 409
    invoke-direct {p0, p1}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$h;-><init>(Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;)V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 5

    .line 413
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 414
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    .line 417
    :sswitch_0
    const-string v0, "Track_SportHistoryListFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MSG_SHOW_NO_DATA_LAYOUT"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 418
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$h;->e:Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->a(Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;)Landroid/widget/LinearLayout;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 419
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$h;->e:Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->f(Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;)Landroid/widget/ExpandableListView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ExpandableListView;->setVisibility(I)V

    .line 420
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$h;->e:Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->d(Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;)V

    .line 421
    goto/16 :goto_0

    .line 423
    :sswitch_1
    const-string v0, "Track_SportHistoryListFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MSG_SHOW_DETAIL_TRACK"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 424
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lo/dgu$e;

    .line 425
    invoke-static {}, Lo/cbl;->b()Lo/cbl;

    move-result-object v0

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/cbl;->init(Landroid/content/Context;)V

    .line 426
    invoke-static {}, Lo/cbl;->b()Lo/cbl;

    move-result-object v0

    iget-object v1, v4, Lo/dgu$e;->d:Ljava/lang/String;

    iget-object v2, v4, Lo/dgu$e;->c:Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    invoke-virtual {v0, v1, v2}, Lo/cbl;->d(Ljava/lang/String;Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;)V

    .line 427
    goto/16 :goto_0

    .line 429
    :sswitch_2
    const-string v0, "Track_SportHistoryListFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MSG_REFRESH_VIEW_AFTER_INSERT"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 430
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$h;->e:Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;

    iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->c(Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;Ljava/lang/Object;)V

    .line 431
    goto/16 :goto_0

    .line 435
    :sswitch_3
    const-string v0, "Track_SportHistoryListFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MSG_COPY_SIMPLIFY_DATA_TO_UI_DATA"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 436
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$h;->e:Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;

    iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->e(Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;Ljava/lang/Object;)V

    .line 437
    goto :goto_0

    .line 440
    :sswitch_4
    const-string v0, "Track_SportHistoryListFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MSG_DELETE_TRACK"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 441
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$h;->e:Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->k(Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;)V

    .line 442
    goto :goto_0

    .line 444
    :sswitch_5
    const-string v0, "Track_SportHistoryListFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MSG_DELETE_FITNESS_RECORD"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 445
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$h;->e:Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->k(Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;)V

    .line 446
    goto :goto_0

    .line 449
    :sswitch_6
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$h;->e:Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->i(Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;)V

    .line 450
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$h;->e:Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->c(Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;Z)Z

    .line 451
    goto :goto_0

    .line 454
    :sswitch_7
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$h;->e:Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->h(Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 455
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$h;->e:Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->d(Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;)V

    .line 456
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$h;->e:Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->f(Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;)Landroid/widget/ExpandableListView;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 457
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$h;->e:Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->f(Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;)Landroid/widget/ExpandableListView;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/ExpandableListView;->setClickable(Z)V

    .line 459
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$h;->e:Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->c(Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;Z)Z

    .line 465
    :cond_1
    :goto_0
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
        0x2 -> :sswitch_1
        0x3 -> :sswitch_4
        0x4 -> :sswitch_2
        0x9 -> :sswitch_3
        0xa -> :sswitch_5
        0x6f -> :sswitch_6
        0x70 -> :sswitch_7
    .end sparse-switch
.end method
