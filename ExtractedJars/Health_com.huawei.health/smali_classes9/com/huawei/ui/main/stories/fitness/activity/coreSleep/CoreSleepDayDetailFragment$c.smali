.class Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment$c;
.super Lo/dbb;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/dbb<Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment;)V
    .locals 0

    .line 1536
    invoke-direct {p0, p1}, Lo/dbb;-><init>(Ljava/lang/Object;)V

    .line 1537
    return-void
.end method


# virtual methods
.method protected e(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment;Landroid/os/Message;)V
    .locals 9

    .line 1541
    iget v0, p2, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    .line 1543
    :sswitch_0
    const-string v0, "UIHLH_CoreSleepDayDetailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "case UPDATE_COMMON_SLEEP_DATA_UI: "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1544
    invoke-static {p1}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment;->m(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment;)V

    .line 1545
    goto/16 :goto_0

    .line 1547
    :sswitch_1
    const-string v0, "UIHLH_CoreSleepDayDetailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "case UPDATE_SUGGEST_DATA_UI: "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1548
    invoke-static {p1}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment;->m(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment;)V

    .line 1549
    invoke-static {p1}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment;->q(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment;)V

    .line 1550
    goto/16 :goto_0

    .line 1552
    :sswitch_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget v1, p2, Landroid/os/Message;->arg1:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 1553
    goto/16 :goto_0

    .line 1555
    :sswitch_3
    const-string v0, "UIHLH_CoreSleepDayDetailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "case UPDATE_SUGGEST_FIX_DATA_UI: "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1556
    invoke-static {p1}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment;->m(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment;)V

    .line 1557
    invoke-static {p1}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment;->t(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment;)V

    .line 1558
    goto/16 :goto_0

    .line 1560
    :sswitch_4
    invoke-static {p1}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment;->r(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment;)V

    .line 1561
    goto/16 :goto_0

    .line 1563
    :sswitch_5
    invoke-static {p1}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment;->s(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment;)Landroid/widget/TextView;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 1564
    iget v8, p2, Landroid/os/Message;->arg1:I

    .line 1565
    const-string v0, "UIHLH_CoreSleepDayDetailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mCustomTransDialogBuilder set rate = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1567
    invoke-static {p1}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment;->u(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment;)Landroid/widget/TextView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 1569
    invoke-static {p1}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment;->v(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment;)Landroid/widget/LinearLayout;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 1570
    invoke-static {p1}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment;->z(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment;)Landroid/widget/TextView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 1571
    invoke-static {p1}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment;->s(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment;)Landroid/widget/TextView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 1572
    invoke-static {p1}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment;->y(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment;)Landroid/widget/LinearLayout;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getVisibility()I

    move-result v0

    if-eqz v0, :cond_0

    .line 1573
    invoke-static {p1}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment;->y(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment;)Landroid/widget/LinearLayout;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 1574
    invoke-static {}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1575
    invoke-static {p1}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment;->w(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment;)V

    .line 1578
    :cond_0
    invoke-static {p1}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment;->z(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment;)Landroid/widget/TextView;

    move-result-object v0

    invoke-static {p1}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment;->c(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_show_sync_data:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1579
    invoke-static {p1}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment;->s(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment;)Landroid/widget/TextView;

    move-result-object v0

    int-to-double v1, v8

    const/4 v3, 0x2

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1580
    goto/16 :goto_0

    .line 1581
    :cond_1
    const-string v0, "UIHLH_CoreSleepDayDetailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mpt is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1583
    goto/16 :goto_0

    .line 1585
    :sswitch_6
    const-string v0, "UIHLH_CoreSleepDayDetailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "show sync end loadingAnimation.stop()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1586
    invoke-static {p1}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment;->c(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/emy;->e(Landroid/content/Context;)Lo/emy;

    move-result-object v0

    const/16 v1, 0x64

    invoke-virtual {v0, v1}, Lo/emy;->a(I)V

    .line 1587
    invoke-static {p1}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment;->v(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment;)Landroid/widget/LinearLayout;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 1589
    invoke-static {p1}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment;->s(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment;)Landroid/widget/TextView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 1590
    invoke-static {p1}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment;->s(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment;)Landroid/widget/TextView;

    move-result-object v0

    const-wide/high16 v1, 0x4059000000000000L    # 100.0

    const/4 v3, 0x2

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1592
    invoke-static {p1}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment;->v(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment;)Landroid/widget/LinearLayout;

    move-result-object v0

    new-instance v1, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment$c$1;

    invoke-direct {v1, p0, p1}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment$c$1;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment$c;Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment;)V

    const-wide/16 v2, 0x1f4

    invoke-virtual {v0, v1, v2, v3}, Landroid/widget/LinearLayout;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 1599
    invoke-virtual {p1}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment;->c()V

    goto :goto_0

    .line 1604
    :sswitch_7
    const-string v0, "UIHLH_CoreSleepDayDetailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "sync MSG_PROC_TO_REFRSH_CORE_SLEEP"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1606
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/emy;->e(Landroid/content/Context;)Lo/emy;

    move-result-object v0

    const/16 v1, 0x64

    invoke-virtual {v0, v1}, Lo/emy;->a(I)V

    .line 1607
    invoke-virtual {p1}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment;->c()V

    .line 1608
    goto :goto_0

    .line 1610
    :sswitch_8
    invoke-static {p1}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment;->c(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment;)Landroid/content/Context;

    move-result-object v0

    new-instance v1, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment$c$2;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment$c$2;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment$c;)V

    invoke-static {v0, v1}, Lo/fjb;->a(Landroid/content/Context;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 1617
    goto :goto_0

    .line 1619
    :sswitch_9
    invoke-static {p1}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment;->x(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment;)V

    .line 1620
    goto :goto_0

    .line 1622
    :sswitch_a
    invoke-static {p1}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment;->c(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment;)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_fitness_core_sleep_btn_tips:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v8

    .line 1623
    invoke-static {p1}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment;->c(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment;)Landroid/content/Context;

    move-result-object v0

    new-instance v1, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment$c$5;

    invoke-direct {v1, p0, p1}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment$c$5;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment$c;Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment;)V

    .line 1636
    invoke-static {p1}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment;->B(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment;)Landroid/widget/RelativeLayout;

    move-result-object v2

    move-object v3, v8

    const-string v4, "core_sleep_btn_tips_do_not_remind_again"

    const-string v5, "core_sleep_btn_tips_intervals"

    const-string v6, "core_sleep_btn_tips_cnt"

    const-string v7, "core_sleep_btn_tips_if_show"

    .line 1623
    invoke-static/range {v0 .. v7}, Lo/egp;->e(Landroid/content/Context;Lcom/huawei/hwbasemgr/IBaseResponseCallback;Landroid/widget/RelativeLayout;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1638
    .line 1642
    :cond_2
    :goto_0
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x14 -> :sswitch_4
        0x17 -> :sswitch_5
        0x18 -> :sswitch_6
        0x19 -> :sswitch_7
        0x1772 -> :sswitch_1
        0x1773 -> :sswitch_2
        0x1774 -> :sswitch_3
        0x1775 -> :sswitch_8
        0x1776 -> :sswitch_0
        0x1777 -> :sswitch_9
        0x1778 -> :sswitch_a
    .end sparse-switch
.end method

.method public synthetic handleMessageWhenReferenceNotNull(Ljava/lang/Object;Landroid/os/Message;)V
    .locals 1

    .line 1533
    move-object v0, p1

    check-cast v0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment;

    invoke-virtual {p0, v0, p2}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment$c;->e(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepDayDetailFragment;Landroid/os/Message;)V

    return-void
.end method
