.class public Lo/epy;
.super Landroid/support/v7/widget/RecyclerView$Adapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/epy$b;
    }
.end annotation


# instance fields
.field private a:Landroid/support/v7/widget/CardView;

.field private b:Landroid/content/Context;

.field private c:Lo/epz;

.field private d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/epx;>;"
        }
    .end annotation
.end field

.field private e:Lo/epx;

.field private g:Z

.field private i:Z


# direct methods
.method public constructor <init>(Ljava/util/List;Landroid/content/Context;Lo/epz;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/epx;>;Landroid/content/Context;Lo/epz;)V"
        }
    .end annotation

    .line 78
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView$Adapter;-><init>()V

    .line 76
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/epy;->i:Z

    .line 79
    iput-object p1, p0, Lo/epy;->d:Ljava/util/List;

    .line 80
    iput-object p2, p0, Lo/epy;->b:Landroid/content/Context;

    .line 81
    iput-object p3, p0, Lo/epy;->c:Lo/epz;

    .line 82
    invoke-static {p2}, Lo/ene;->t(Landroid/content/Context;)Z

    move-result v0

    iput-boolean v0, p0, Lo/epy;->g:Z

    .line 83
    invoke-virtual {p0}, Lo/epy;->c()V

    .line 84
    return-void
.end method

.method static synthetic a(Lo/epy;)Landroid/content/Context;
    .locals 1

    .line 68
    iget-object v0, p0, Lo/epy;->b:Landroid/content/Context;

    return-object v0
.end method

.method private b(Landroid/support/v7/widget/CardView;Lo/epx;)V
    .locals 4

    .line 602
    iput-object p1, p0, Lo/epy;->a:Landroid/support/v7/widget/CardView;

    .line 603
    iput-object p2, p0, Lo/epy;->e:Lo/epx;

    .line 605
    iget-object v0, p0, Lo/epy;->b:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "has_slip_home_cards"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 608
    const/4 v0, 0x0

    if-eq v0, v3, :cond_0

    const-string v0, ""

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 609
    iget-object v0, p0, Lo/epy;->a:Landroid/support/v7/widget/CardView;

    iget-object v1, p0, Lo/epy;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homehealth/R$drawable;->ic_home_card_else:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/CardView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 611
    :cond_0
    return-void
.end method

.method static synthetic b(Lo/epy;)Z
    .locals 1

    .line 68
    iget-boolean v0, p0, Lo/epy;->i:Z

    return v0
.end method

.method static synthetic c(Lo/epy;Ljava/lang/String;)V
    .locals 0

    .line 68
    invoke-direct {p0, p1}, Lo/epy;->e(Ljava/lang/String;)V

    return-void
.end method

.method private e(Ljava/lang/String;)V
    .locals 4

    .line 731
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 732
    const-string v0, "click"

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 733
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lo/epy;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, v3, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 734
    return-void
.end method

.method static synthetic e(Lo/epy;Z)Z
    .locals 0

    .line 68
    iput-boolean p1, p0, Lo/epy;->i:Z

    return p1
.end method


# virtual methods
.method public a()V
    .locals 5

    .line 614
    const-string v0, "UIHLH_FunctionSetViewAdapter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "refreshBackgroundForTips"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 616
    iget-object v0, p0, Lo/epy;->e:Lo/epx;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 617
    const-string v0, "UIHLH_FunctionSetViewAdapter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mFunctionSetBean is null!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 618
    return-void

    .line 621
    :cond_0
    sget-object v0, Lo/epy$7;->e:[I

    iget-object v1, p0, Lo/epy;->e:Lo/epx;

    invoke-virtual {v1}, Lo/epx;->g()Lo/eqa;

    move-result-object v1

    invoke-virtual {v1}, Lo/eqa;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_0

    .line 623
    :pswitch_0
    iget-object v0, p0, Lo/epy;->a:Landroid/support/v7/widget/CardView;

    iget-object v1, p0, Lo/epy;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homehealth/R$drawable;->home_sleep_card_background:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/CardView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 624
    goto/16 :goto_1

    .line 626
    :pswitch_1
    iget-object v0, p0, Lo/epy;->a:Landroid/support/v7/widget/CardView;

    iget-object v1, p0, Lo/epy;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homehealth/R$drawable;->home_weight_card_background:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/CardView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 627
    goto/16 :goto_1

    .line 629
    :pswitch_2
    iget-object v0, p0, Lo/epy;->a:Landroid/support/v7/widget/CardView;

    iget-object v1, p0, Lo/epy;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homehealth/R$drawable;->home_pressure_card_background:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/CardView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 630
    goto :goto_1

    .line 632
    :pswitch_3
    iget-object v0, p0, Lo/epy;->a:Landroid/support/v7/widget/CardView;

    iget-object v1, p0, Lo/epy;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homehealth/R$drawable;->home_rate_card_background:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/CardView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 633
    goto :goto_1

    .line 635
    :pswitch_4
    iget-object v0, p0, Lo/epy;->a:Landroid/support/v7/widget/CardView;

    iget-object v1, p0, Lo/epy;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homehealth/R$drawable;->home_bloodpressure_card_background:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/CardView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 636
    goto :goto_1

    .line 638
    :pswitch_5
    iget-object v0, p0, Lo/epy;->a:Landroid/support/v7/widget/CardView;

    iget-object v1, p0, Lo/epy;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homehealth/R$drawable;->home_bloodsugar_card_background:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/CardView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 639
    goto :goto_1

    .line 641
    :pswitch_6
    iget-object v0, p0, Lo/epy;->a:Landroid/support/v7/widget/CardView;

    iget-object v1, p0, Lo/epy;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homehealth/R$drawable;->home_manger_card_background:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/CardView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 642
    goto :goto_1

    .line 644
    :goto_0
    const-string v0, "UIHLH_FunctionSetViewAdapter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "error card"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 647
    :goto_1
    iget-object v0, p0, Lo/epy;->b:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "has_slip_home_cards"

    const-string v3, "1"

    new-instance v4, Lo/dcy;

    invoke-direct {v4}, Lo/dcy;-><init>()V

    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 649
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
    .end packed-switch
.end method

.method public b(II)Z
    .locals 4

    .line 672
    const-string v0, "UIHLH_FunctionSetViewAdapter"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "fromPosition="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, "toPosition="

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 673
    if-ltz p1, :cond_0

    iget-object v0, p0, Lo/epy;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge p1, v0, :cond_0

    if-ltz p2, :cond_0

    iget-object v0, p0, Lo/epy;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lt p2, v0, :cond_1

    .line 674
    :cond_0
    const/4 v0, 0x0

    return v0

    .line 676
    :cond_1
    iget-object v0, p0, Lo/epy;->d:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/epx;

    invoke-virtual {v0, p2}, Lo/epx;->e(I)V

    .line 677
    iget-object v0, p0, Lo/epy;->d:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/epx;

    invoke-virtual {v0, p1}, Lo/epx;->e(I)V

    .line 679
    const/4 v0, 0x7

    if-ge p2, v0, :cond_2

    .line 680
    iget-object v0, p0, Lo/epy;->d:Ljava/util/List;

    invoke-static {v0, p1, p2}, Ljava/util/Collections;->swap(Ljava/util/List;II)V

    .line 681
    invoke-virtual {p0, p1, p2}, Lo/epy;->notifyItemMoved(II)V

    .line 683
    :cond_2
    const/4 v0, 0x1

    return v0
.end method

.method public final c()V
    .locals 4

    .line 87
    new-instance v2, Lcom/huawei/hihealth/HiDataReadOption;

    invoke-direct {v2}, Lcom/huawei/hihealth/HiDataReadOption;-><init>()V

    .line 88
    const-wide/16 v0, 0x0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/hihealth/HiDataReadOption;->setStartTime(J)V

    .line 89
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/hihealth/HiDataReadOption;->setEndTime(J)V

    .line 90
    const/4 v0, 0x1

    new-array v3, v0, [I

    .line 91
    const v0, 0xad12

    const/4 v1, 0x0

    aput v0, v3, v1

    .line 92
    invoke-virtual {v2, v3}, Lcom/huawei/hihealth/HiDataReadOption;->setType([I)V

    .line 94
    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/HiDataReadOption;->setSortOrder(I)V

    .line 96
    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/HiDataReadOption;->setCount(I)V

    .line 97
    iget-object v0, p0, Lo/epy;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/clq;->e(Landroid/content/Context;)Lo/clq;

    move-result-object v0

    new-instance v1, Lo/epy$1;

    invoke-direct {v1, p0}, Lo/epy$1;-><init>(Lo/epy;)V

    invoke-virtual {v0, v2, v1}, Lo/clq;->e(Lcom/huawei/hihealth/HiDataReadOption;Lo/cmd;)V

    .line 125
    return-void
.end method

.method public d(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/epx;>;)V"
        }
    .end annotation

    .line 656
    const-string v0, "UIHLH_FunctionSetViewAdapter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setLists:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 657
    iput-object p1, p0, Lo/epy;->d:Ljava/util/List;

    .line 658
    iget-object v0, p0, Lo/epy;->c:Lo/epz;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 659
    const-string v0, "UIHLH_FunctionSetViewAdapter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "null != mRecyclerVie"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 660
    const-string v0, "UIHLH_FunctionSetViewAdapter"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mRecyclerView.getScrollState(): "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/epy;->c:Lo/epz;

    invoke-virtual {v2}, Lo/epz;->getScrollState()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, "     mRecyclerView.isComputingLayout(): "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/epy;->c:Lo/epz;

    .line 661
    invoke-virtual {v2}, Lo/epz;->isComputingLayout()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    .line 660
    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 662
    iget-object v0, p0, Lo/epy;->c:Lo/epz;

    invoke-virtual {v0}, Lo/epz;->getScrollState()I

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lo/epy;->c:Lo/epz;

    .line 663
    invoke-virtual {v0}, Lo/epz;->isComputingLayout()Z

    move-result v0

    if-nez v0, :cond_0

    .line 664
    const-string v0, "UIHLH_FunctionSetViewAdapter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "notifyDataSetChanged : refreshTimes"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 665
    iget-object v0, p0, Lo/epy;->c:Lo/epz;

    invoke-virtual {v0}, Lo/epz;->getRecycledViewPool()Landroid/support/v7/widget/RecyclerView$RecycledViewPool;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView$RecycledViewPool;->clear()V

    .line 666
    invoke-virtual {p0}, Lo/epy;->notifyDataSetChanged()V

    .line 669
    :cond_0
    return-void
.end method

.method public getItemCount()I
    .locals 4

    .line 597
    const-string v0, "UIHLH_FunctionSetViewAdapter"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "lists.size(): "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/epy;->d:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 598
    iget-object v0, p0, Lo/epy;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public onBindViewHolder(Landroid/support/v7/widget/RecyclerView$ViewHolder;I)V
    .locals 19

    .line 135
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/epy;->d:Ljava/util/List;

    move/from16 v1, p2

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/epx;

    .line 136
    move-object/from16 v0, p1

    check-cast v0, Lo/epy$b;

    iget-object v0, v0, Lo/epy$b;->itemView:Landroid/view/View;

    sget v1, Lcom/huawei/ui/homehealth/R$id;->function_set_empty_layout:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Landroid/widget/LinearLayout;

    .line 137
    move-object/from16 v0, p1

    check-cast v0, Lo/epy$b;

    iget-object v0, v0, Lo/epy$b;->itemView:Landroid/view/View;

    sget v1, Lcom/huawei/ui/homehealth/R$id;->function_set_data_layout:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Landroid/widget/LinearLayout;

    .line 138
    move-object/from16 v0, p1

    check-cast v0, Lo/epy$b;

    iget-object v0, v0, Lo/epy$b;->itemView:Landroid/view/View;

    sget v1, Lcom/huawei/ui/homehealth/R$id;->function_set_data_blood_layout:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Landroid/widget/LinearLayout;

    .line 139
    move-object/from16 v0, p1

    check-cast v0, Lo/epy$b;

    iget-object v0, v0, Lo/epy$b;->itemView:Landroid/view/View;

    sget v1, Lcom/huawei/ui/homehealth/R$id;->function_set_management_layout:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Landroid/widget/LinearLayout;

    .line 140
    move-object/from16 v0, p1

    check-cast v0, Lo/epy$b;

    iget-object v0, v0, Lo/epy$b;->itemView:Landroid/view/View;

    sget v1, Lcom/huawei/ui/homehealth/R$id;->recyclerview_item:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Landroid/widget/LinearLayout;

    .line 142
    move-object/from16 v0, p1

    check-cast v0, Lo/epy$b;

    iget-object v0, v0, Lo/epy$b;->itemView:Landroid/view/View;

    sget v1, Lcom/huawei/ui/homehealth/R$id;->function_set_card_view:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Landroid/support/v7/widget/CardView;

    .line 143
    const-string v0, "UIHLH_FunctionSetViewAdapter"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onBindViewHolder()  functionSetBean.getType():  "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Lo/epx;->g()Lo/eqa;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 145
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/epy;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v13, v0, Landroid/util/DisplayMetrics;->density:F

    .line 146
    const/16 v14, 0x68

    .line 148
    move-object/from16 v0, p0

    iget-boolean v0, v0, Lo/epy;->g:Z

    if-eqz v0, :cond_0

    .line 149
    const/16 v14, 0x6c

    .line 152
    :cond_0
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/epy;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    move/from16 v1, p2

    if-ne v0, v1, :cond_1

    .line 153
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    int-to-float v1, v14

    mul-float/2addr v1, v13

    float-to-double v1, v1

    const-wide/high16 v3, 0x3fe0000000000000L    # 0.5

    add-double/2addr v1, v3

    double-to-int v1, v1

    int-to-float v2, v14

    mul-float/2addr v2, v13

    float-to-double v2, v2

    const-wide/high16 v4, 0x3fe0000000000000L    # 0.5

    add-double/2addr v2, v4

    double-to-int v2, v2

    invoke-direct {v0, v1, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    move-object v15, v0

    .line 154
    const/high16 v0, 0x40800000    # 4.0f

    mul-float/2addr v0, v13

    float-to-double v0, v0

    const-wide/high16 v2, 0x3fe0000000000000L    # 0.5

    add-double/2addr v0, v2

    double-to-int v0, v0

    invoke-virtual {v15, v0}, Landroid/widget/LinearLayout$LayoutParams;->setMarginStart(I)V

    .line 155
    const/high16 v0, 0x41800000    # 16.0f

    mul-float/2addr v0, v13

    float-to-double v0, v0

    const-wide/high16 v2, 0x3fe0000000000000L    # 0.5

    add-double/2addr v0, v2

    double-to-int v0, v0

    invoke-virtual {v15, v0}, Landroid/widget/LinearLayout$LayoutParams;->setMarginEnd(I)V

    .line 156
    invoke-virtual {v11, v15}, Landroid/widget/LinearLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 157
    goto/16 :goto_0

    .line 158
    :cond_1
    const/4 v0, 0x0

    move/from16 v1, p2

    if-ne v0, v1, :cond_2

    .line 159
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    int-to-float v1, v14

    mul-float/2addr v1, v13

    float-to-double v1, v1

    const-wide/high16 v3, 0x3fe0000000000000L    # 0.5

    add-double/2addr v1, v3

    double-to-int v1, v1

    int-to-float v2, v14

    mul-float/2addr v2, v13

    float-to-double v2, v2

    const-wide/high16 v4, 0x3fe0000000000000L    # 0.5

    add-double/2addr v2, v4

    double-to-int v2, v2

    invoke-direct {v0, v1, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    move-object v15, v0

    .line 160
    const/high16 v0, 0x41800000    # 16.0f

    mul-float/2addr v0, v13

    float-to-double v0, v0

    const-wide/high16 v2, 0x3fe0000000000000L    # 0.5

    add-double/2addr v0, v2

    double-to-int v0, v0

    invoke-virtual {v15, v0}, Landroid/widget/LinearLayout$LayoutParams;->setMarginStart(I)V

    .line 161
    const/high16 v0, 0x40800000    # 4.0f

    mul-float/2addr v0, v13

    float-to-double v0, v0

    const-wide/high16 v2, 0x3fe0000000000000L    # 0.5

    add-double/2addr v0, v2

    double-to-int v0, v0

    invoke-virtual {v15, v0}, Landroid/widget/LinearLayout$LayoutParams;->setMarginEnd(I)V

    .line 162
    invoke-virtual {v11, v15}, Landroid/widget/LinearLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 163
    goto :goto_0

    .line 165
    :cond_2
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    int-to-float v1, v14

    mul-float/2addr v1, v13

    float-to-double v1, v1

    const-wide/high16 v3, 0x3fe0000000000000L    # 0.5

    add-double/2addr v1, v3

    double-to-int v1, v1

    int-to-float v2, v14

    mul-float/2addr v2, v13

    float-to-double v2, v2

    const-wide/high16 v4, 0x3fe0000000000000L    # 0.5

    add-double/2addr v2, v4

    double-to-int v2, v2

    invoke-direct {v0, v1, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    move-object v15, v0

    .line 166
    const/high16 v0, 0x40800000    # 4.0f

    mul-float/2addr v0, v13

    float-to-double v0, v0

    const-wide/high16 v2, 0x3fe0000000000000L    # 0.5

    add-double/2addr v0, v2

    double-to-int v0, v0

    invoke-virtual {v15, v0}, Landroid/widget/LinearLayout$LayoutParams;->setMarginStart(I)V

    .line 167
    const/high16 v0, 0x40800000    # 4.0f

    mul-float/2addr v0, v13

    float-to-double v0, v0

    const-wide/high16 v2, 0x3fe0000000000000L    # 0.5

    add-double/2addr v0, v2

    double-to-int v0, v0

    invoke-virtual {v15, v0}, Landroid/widget/LinearLayout$LayoutParams;->setMarginEnd(I)V

    .line 168
    invoke-virtual {v11, v15}, Landroid/widget/LinearLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 172
    :goto_0
    sget-object v0, Lo/epx$c;->b:Lo/epx$c;

    invoke-virtual {v6}, Lo/epx;->h()Lo/epx$c;

    move-result-object v1

    if-ne v0, v1, :cond_6

    .line 173
    const/4 v0, 0x0

    invoke-virtual {v7, v0}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 174
    const/16 v0, 0x8

    invoke-virtual {v8, v0}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 175
    const/16 v0, 0x8

    invoke-virtual {v9, v0}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 176
    const/16 v0, 0x8

    invoke-virtual {v10, v0}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 177
    move-object/from16 v0, p1

    check-cast v0, Lo/epy$b;

    invoke-static {v0}, Lo/epy$b;->a(Lo/epy$b;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v6}, Lo/epx;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 178
    move-object/from16 v0, p1

    check-cast v0, Lo/epy$b;

    invoke-static {v0}, Lo/epy$b;->b(Lo/epy$b;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v6}, Lo/epx;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 180
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget-object v0, v0, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    invoke-virtual {v0}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v15

    .line 183
    const-string v0, "zh"

    invoke-virtual {v0, v15}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 184
    move-object/from16 v0, p1

    check-cast v0, Lo/epy$b;

    invoke-static {v0}, Lo/epy$b;->b(Lo/epy$b;)Landroid/widget/TextView;

    move-result-object v0

    const/4 v1, 0x1

    const/high16 v2, 0x41000000    # 8.0f

    invoke-virtual {v0, v1, v2}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 187
    :cond_3
    const/high16 v16, 0x41700000    # 15.0f

    .line 188
    const/16 v17, 0x0

    .line 190
    sget-object v0, Lo/epy$7;->e:[I

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/epy;->d:Ljava/util/List;

    move/from16 v2, p2

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/epx;

    invoke-virtual {v1}, Lo/epx;->g()Lo/eqa;

    move-result-object v1

    invoke-virtual {v1}, Lo/eqa;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_2

    .line 193
    :pswitch_0
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/epy;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$drawable;->home_sleep_card_background:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v12, v0}, Landroid/support/v7/widget/CardView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 195
    move-object/from16 v0, p1

    check-cast v0, Lo/epy$b;

    invoke-static {v0}, Lo/epy$b;->a(Lo/epy$b;)Landroid/widget/TextView;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/epy;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homehealth/R$color;->function_set_view_empty_title:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 197
    move-object/from16 v0, p1

    check-cast v0, Lo/epy$b;

    invoke-static {v0}, Lo/epy$b;->b(Lo/epy$b;)Landroid/widget/TextView;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/epy;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homehealth/R$color;->function_set_view_empty_description:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 198
    new-instance v0, Lo/epy$11;

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    invoke-direct {v0, v1, v2, v6}, Lo/epy$11;-><init>(Lo/epy;Landroid/support/v7/widget/RecyclerView$ViewHolder;Lo/epx;)V

    invoke-virtual {v12, v0}, Landroid/support/v7/widget/CardView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 225
    goto/16 :goto_2

    .line 228
    :pswitch_1
    invoke-virtual {v6}, Lo/epx;->i()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 229
    move-object/from16 v0, p1

    check-cast v0, Lo/epy$b;

    invoke-static {v0}, Lo/epy$b;->d(Lo/epy$b;)Landroid/widget/ImageView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_1

    .line 232
    :cond_4
    move-object/from16 v0, p1

    check-cast v0, Lo/epy$b;

    invoke-static {v0}, Lo/epy$b;->d(Lo/epy$b;)Landroid/widget/ImageView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 234
    :goto_1
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/epy;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$drawable;->home_weight_card_background:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v12, v0}, Landroid/support/v7/widget/CardView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 235
    move-object/from16 v0, p1

    check-cast v0, Lo/epy$b;

    invoke-static {v0}, Lo/epy$b;->a(Lo/epy$b;)Landroid/widget/TextView;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/epy;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homehealth/R$color;->function_set_view_empty_title:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 236
    move-object/from16 v0, p1

    check-cast v0, Lo/epy$b;

    invoke-static {v0}, Lo/epy$b;->b(Lo/epy$b;)Landroid/widget/TextView;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/epy;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homehealth/R$color;->function_set_view_empty_description:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 237
    new-instance v0, Lo/epy$12;

    move-object/from16 v1, p0

    invoke-direct {v0, v1}, Lo/epy$12;-><init>(Lo/epy;)V

    invoke-virtual {v12, v0}, Landroid/support/v7/widget/CardView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 247
    goto/16 :goto_2

    .line 249
    :pswitch_2
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/epy;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$drawable;->home_pressure_card_background:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v12, v0}, Landroid/support/v7/widget/CardView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 250
    move-object/from16 v0, p1

    check-cast v0, Lo/epy$b;

    invoke-static {v0}, Lo/epy$b;->a(Lo/epy$b;)Landroid/widget/TextView;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/epy;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homehealth/R$color;->function_set_view_empty_title:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 251
    move-object/from16 v0, p1

    check-cast v0, Lo/epy$b;

    invoke-static {v0}, Lo/epy$b;->b(Lo/epy$b;)Landroid/widget/TextView;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/epy;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homehealth/R$color;->function_set_view_empty_description:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 252
    new-instance v0, Lo/epy$13;

    move-object/from16 v1, p0

    invoke-direct {v0, v1}, Lo/epy$13;-><init>(Lo/epy;)V

    invoke-virtual {v12, v0}, Landroid/support/v7/widget/CardView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 280
    goto/16 :goto_2

    .line 282
    :pswitch_3
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/epy;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$drawable;->home_rate_card_background:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v12, v0}, Landroid/support/v7/widget/CardView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 283
    move-object/from16 v0, p1

    check-cast v0, Lo/epy$b;

    invoke-static {v0}, Lo/epy$b;->a(Lo/epy$b;)Landroid/widget/TextView;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/epy;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homehealth/R$color;->function_set_view_empty_title:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 284
    move-object/from16 v0, p1

    check-cast v0, Lo/epy$b;

    invoke-static {v0}, Lo/epy$b;->b(Lo/epy$b;)Landroid/widget/TextView;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/epy;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homehealth/R$color;->function_set_view_empty_description:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 285
    new-instance v0, Lo/epy$14;

    move-object/from16 v1, p0

    invoke-direct {v0, v1}, Lo/epy$14;-><init>(Lo/epy;)V

    invoke-virtual {v12, v0}, Landroid/support/v7/widget/CardView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 294
    goto/16 :goto_2

    .line 296
    :pswitch_4
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/epy;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$drawable;->home_bloodpressure_card_background:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v12, v0}, Landroid/support/v7/widget/CardView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 297
    move-object/from16 v0, p1

    check-cast v0, Lo/epy$b;

    invoke-static {v0}, Lo/epy$b;->a(Lo/epy$b;)Landroid/widget/TextView;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/epy;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homehealth/R$color;->function_set_view_empty_title:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 298
    move-object/from16 v0, p1

    check-cast v0, Lo/epy$b;

    invoke-static {v0}, Lo/epy$b;->b(Lo/epy$b;)Landroid/widget/TextView;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/epy;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homehealth/R$color;->function_set_view_empty_description:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 301
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget-object v0, v0, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    invoke-virtual {v0}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v18

    .line 302
    const-string v0, "en"

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 303
    const/high16 v16, 0x41500000    # 13.0f

    .line 304
    const/16 v17, 0x2

    .line 307
    :cond_5
    new-instance v0, Lo/epy$15;

    move-object/from16 v1, p0

    invoke-direct {v0, v1}, Lo/epy$15;-><init>(Lo/epy;)V

    invoke-virtual {v12, v0}, Landroid/support/v7/widget/CardView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 316
    goto :goto_2

    .line 318
    :pswitch_5
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/epy;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$drawable;->home_bloodsugar_card_background:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v12, v0}, Landroid/support/v7/widget/CardView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 319
    move-object/from16 v0, p1

    check-cast v0, Lo/epy$b;

    invoke-static {v0}, Lo/epy$b;->a(Lo/epy$b;)Landroid/widget/TextView;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/epy;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homehealth/R$color;->function_set_view_empty_title:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 320
    move-object/from16 v0, p1

    check-cast v0, Lo/epy$b;

    invoke-static {v0}, Lo/epy$b;->b(Lo/epy$b;)Landroid/widget/TextView;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/epy;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homehealth/R$color;->function_set_view_empty_description:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 322
    new-instance v0, Lo/epy$19;

    move-object/from16 v1, p0

    invoke-direct {v0, v1}, Lo/epy$19;-><init>(Lo/epy;)V

    invoke-virtual {v12, v0}, Landroid/support/v7/widget/CardView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 331
    .line 336
    :goto_2
    move-object/from16 v0, p1

    check-cast v0, Lo/epy$b;

    invoke-static {v0}, Lo/epy$b;->a(Lo/epy$b;)Landroid/widget/TextView;

    move-result-object v0

    const/4 v1, 0x1

    move/from16 v2, v16

    invoke-virtual {v0, v1, v2}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 337
    move-object/from16 v0, p1

    check-cast v0, Lo/epy$b;

    invoke-static {v0}, Lo/epy$b;->a(Lo/epy$b;)Landroid/widget/TextView;

    move-result-object v0

    const/4 v1, 0x0

    move/from16 v2, v17

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 338
    goto/16 :goto_7

    .line 340
    :cond_6
    sget-object v0, Lo/epx$c;->a:Lo/epx$c;

    invoke-virtual {v6}, Lo/epx;->h()Lo/epx$c;

    move-result-object v1

    if-ne v0, v1, :cond_9

    .line 341
    const/16 v0, 0x8

    invoke-virtual {v7, v0}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 342
    const/4 v0, 0x0

    invoke-virtual {v8, v0}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 343
    const/16 v0, 0x8

    invoke-virtual {v9, v0}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 344
    const/16 v0, 0x8

    invoke-virtual {v10, v0}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 345
    move-object/from16 v0, p1

    check-cast v0, Lo/epy$b;

    invoke-static {v0}, Lo/epy$b;->c(Lo/epy$b;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v6}, Lo/epx;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 346
    move-object/from16 v0, p1

    check-cast v0, Lo/epy$b;

    invoke-static {v0}, Lo/epy$b;->e(Lo/epy$b;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v6}, Lo/epx;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 347
    move-object/from16 v0, p1

    check-cast v0, Lo/epy$b;

    invoke-static {v0}, Lo/epy$b;->i(Lo/epy$b;)Landroid/widget/TextView;

    move-result-object v15

    .line 348
    invoke-virtual {v6}, Lo/epx;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v15, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 349
    move-object/from16 v0, p1

    check-cast v0, Lo/epy$b;

    invoke-static {v0}, Lo/epy$b;->f(Lo/epy$b;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v6}, Lo/epx;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 352
    invoke-virtual {v6}, Lo/epx;->i()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 353
    move-object/from16 v0, p1

    check-cast v0, Lo/epy$b;

    invoke-static {v0}, Lo/epy$b;->g(Lo/epy$b;)Landroid/widget/ImageView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_3

    .line 356
    :cond_7
    move-object/from16 v0, p1

    check-cast v0, Lo/epy$b;

    invoke-static {v0}, Lo/epy$b;->g(Lo/epy$b;)Landroid/widget/ImageView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 359
    :goto_3
    sget-object v0, Lo/epy$7;->e:[I

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/epy;->d:Ljava/util/List;

    move/from16 v2, p2

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/epx;

    invoke-virtual {v1}, Lo/epx;->g()Lo/eqa;

    move-result-object v1

    invoke-virtual {v1}, Lo/eqa;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_1

    goto/16 :goto_4

    .line 362
    :pswitch_6
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/epy;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$drawable;->home_sleep_card_background:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v12, v0}, Landroid/support/v7/widget/CardView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 364
    sget v0, Lcom/huawei/ui/homehealth/R$id;->function_set_items_unit:I

    invoke-virtual {v12, v0}, Landroid/support/v7/widget/CardView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/epy;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homehealth/R$color;->function_set_view_sleep:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 365
    sget v0, Lcom/huawei/ui/homehealth/R$id;->function_set_items_data:I

    invoke-virtual {v12, v0}, Landroid/support/v7/widget/CardView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/epy;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homehealth/R$color;->function_set_view_sleep:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 368
    const-string v0, "UIHLH_FunctionSetViewAdapter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "functionSetBean.getTime() = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Lo/epx;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 369
    invoke-static {}, Lo/evy;->d()Lo/evy;

    move-result-object v16

    .line 370
    invoke-virtual/range {v16 .. v16}, Lo/evy;->e()V

    .line 373
    const/16 v17, 0x0

    .line 374
    invoke-virtual {v6}, Lo/epx;->b()Ljava/lang/String;

    move-result-object v0

    const-string v1, "has_core_sleep"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 375
    const/16 v17, 0x1

    .line 377
    :cond_8
    move/from16 v18, v17

    .line 378
    new-instance v0, Lo/epy$16;

    move-object/from16 v1, p0

    move/from16 v2, v18

    invoke-direct {v0, v1, v2}, Lo/epy$16;-><init>(Lo/epy;Z)V

    invoke-virtual {v12, v0}, Landroid/support/v7/widget/CardView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 392
    goto/16 :goto_4

    .line 394
    :pswitch_7
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/epy;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$drawable;->home_weight_card_background:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v12, v0}, Landroid/support/v7/widget/CardView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 395
    sget v0, Lcom/huawei/ui/homehealth/R$id;->function_set_items_unit:I

    invoke-virtual {v12, v0}, Landroid/support/v7/widget/CardView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/epy;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homehealth/R$color;->function_set_view_weight:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 396
    sget v0, Lcom/huawei/ui/homehealth/R$id;->function_set_items_data:I

    invoke-virtual {v12, v0}, Landroid/support/v7/widget/CardView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/epy;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homehealth/R$color;->function_set_view_weight:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 397
    new-instance v0, Lo/epy$20;

    move-object/from16 v1, p0

    invoke-direct {v0, v1}, Lo/epy$20;-><init>(Lo/epy;)V

    invoke-virtual {v12, v0}, Landroid/support/v7/widget/CardView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 407
    goto/16 :goto_4

    .line 409
    :pswitch_8
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/epy;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$drawable;->home_pressure_card_background:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v12, v0}, Landroid/support/v7/widget/CardView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 410
    sget v0, Lcom/huawei/ui/homehealth/R$id;->function_set_items_unit:I

    invoke-virtual {v12, v0}, Landroid/support/v7/widget/CardView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/epy;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homehealth/R$color;->function_set_view_stress:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 411
    sget v0, Lcom/huawei/ui/homehealth/R$id;->function_set_items_data:I

    invoke-virtual {v12, v0}, Landroid/support/v7/widget/CardView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/epy;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homehealth/R$color;->function_set_view_stress:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 412
    new-instance v0, Lo/epy$5;

    move-object/from16 v1, p0

    invoke-direct {v0, v1}, Lo/epy$5;-><init>(Lo/epy;)V

    invoke-virtual {v12, v0}, Landroid/support/v7/widget/CardView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 437
    goto :goto_4

    .line 439
    :pswitch_9
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/epy;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$drawable;->home_rate_card_background:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v12, v0}, Landroid/support/v7/widget/CardView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 440
    sget v0, Lcom/huawei/ui/homehealth/R$id;->function_set_items_unit:I

    invoke-virtual {v12, v0}, Landroid/support/v7/widget/CardView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/epy;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homehealth/R$color;->function_set_view_rate:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 441
    sget v0, Lcom/huawei/ui/homehealth/R$id;->function_set_items_data:I

    invoke-virtual {v12, v0}, Landroid/support/v7/widget/CardView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/epy;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homehealth/R$color;->function_set_view_rate:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 442
    new-instance v0, Lo/epy$3;

    move-object/from16 v1, p0

    invoke-direct {v0, v1}, Lo/epy$3;-><init>(Lo/epy;)V

    invoke-virtual {v12, v0}, Landroid/support/v7/widget/CardView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 451
    .line 455
    :goto_4
    goto/16 :goto_7

    .line 456
    :cond_9
    sget-object v0, Lo/epx$c;->e:Lo/epx$c;

    invoke-virtual {v6}, Lo/epx;->h()Lo/epx$c;

    move-result-object v1

    if-ne v0, v1, :cond_c

    .line 457
    const/16 v0, 0x8

    invoke-virtual {v7, v0}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 458
    const/16 v0, 0x8

    invoke-virtual {v8, v0}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 459
    const/4 v0, 0x0

    invoke-virtual {v9, v0}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 460
    const/16 v0, 0x8

    invoke-virtual {v10, v0}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 461
    move-object/from16 v0, p1

    check-cast v0, Lo/epy$b;

    invoke-static {v0}, Lo/epy$b;->k(Lo/epy$b;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v6}, Lo/epx;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 462
    move-object/from16 v0, p1

    check-cast v0, Lo/epy$b;

    invoke-static {v0}, Lo/epy$b;->h(Lo/epy$b;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v6}, Lo/epx;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 463
    move-object/from16 v0, p1

    check-cast v0, Lo/epy$b;

    invoke-static {v0}, Lo/epy$b;->m(Lo/epy$b;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v6}, Lo/epx;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 464
    move-object/from16 v0, p1

    check-cast v0, Lo/epy$b;

    invoke-static {v0}, Lo/epy$b;->o(Lo/epy$b;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v6}, Lo/epx;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 466
    const/high16 v15, 0x41700000    # 15.0f

    .line 467
    const/16 v16, 0x0

    .line 470
    invoke-virtual {v6}, Lo/epx;->i()Z

    move-result v0

    if-eqz v0, :cond_a

    .line 471
    move-object/from16 v0, p1

    check-cast v0, Lo/epy$b;

    invoke-static {v0}, Lo/epy$b;->n(Lo/epy$b;)Landroid/widget/ImageView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_5

    .line 474
    :cond_a
    move-object/from16 v0, p1

    check-cast v0, Lo/epy$b;

    invoke-static {v0}, Lo/epy$b;->n(Lo/epy$b;)Landroid/widget/ImageView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 477
    :goto_5
    sget-object v0, Lo/epy$7;->e:[I

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/epy;->d:Ljava/util/List;

    move/from16 v2, p2

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/epx;

    invoke-virtual {v1}, Lo/epx;->g()Lo/eqa;

    move-result-object v1

    invoke-virtual {v1}, Lo/eqa;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_2

    goto/16 :goto_6

    .line 479
    :pswitch_a
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/epy;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$drawable;->home_weight_card_background:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v12, v0}, Landroid/support/v7/widget/CardView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 480
    sget v0, Lcom/huawei/ui/homehealth/R$id;->function_set_items_blood_unit:I

    invoke-virtual {v12, v0}, Landroid/support/v7/widget/CardView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/epy;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homehealth/R$color;->function_set_view_weight:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 481
    sget v0, Lcom/huawei/ui/homehealth/R$id;->function_set_items_blood_data:I

    invoke-virtual {v12, v0}, Landroid/support/v7/widget/CardView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/epy;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homehealth/R$color;->function_set_view_weight:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 482
    new-instance v0, Lo/epy$2;

    move-object/from16 v1, p0

    invoke-direct {v0, v1}, Lo/epy$2;-><init>(Lo/epy;)V

    invoke-virtual {v12, v0}, Landroid/support/v7/widget/CardView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 492
    goto/16 :goto_6

    .line 494
    :pswitch_b
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/epy;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$drawable;->home_pressure_card_background:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v12, v0}, Landroid/support/v7/widget/CardView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 495
    sget v0, Lcom/huawei/ui/homehealth/R$id;->function_set_items_blood_unit:I

    invoke-virtual {v12, v0}, Landroid/support/v7/widget/CardView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/epy;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homehealth/R$color;->function_set_view_stress:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 496
    sget v0, Lcom/huawei/ui/homehealth/R$id;->function_set_items_blood_data:I

    invoke-virtual {v12, v0}, Landroid/support/v7/widget/CardView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/epy;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homehealth/R$color;->function_set_view_stress:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 497
    new-instance v0, Lo/epy$4;

    move-object/from16 v1, p0

    invoke-direct {v0, v1}, Lo/epy$4;-><init>(Lo/epy;)V

    invoke-virtual {v12, v0}, Landroid/support/v7/widget/CardView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 506
    goto/16 :goto_6

    .line 508
    :pswitch_c
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/epy;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$drawable;->home_rate_card_background:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v12, v0}, Landroid/support/v7/widget/CardView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 509
    sget v0, Lcom/huawei/ui/homehealth/R$id;->function_set_items_blood_unit:I

    invoke-virtual {v12, v0}, Landroid/support/v7/widget/CardView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/epy;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homehealth/R$color;->function_set_view_rate:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 510
    sget v0, Lcom/huawei/ui/homehealth/R$id;->function_set_items_blood_data:I

    invoke-virtual {v12, v0}, Landroid/support/v7/widget/CardView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/epy;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homehealth/R$color;->function_set_view_rate:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 511
    new-instance v0, Lo/epy$6;

    move-object/from16 v1, p0

    invoke-direct {v0, v1}, Lo/epy$6;-><init>(Lo/epy;)V

    invoke-virtual {v12, v0}, Landroid/support/v7/widget/CardView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 520
    goto/16 :goto_6

    .line 522
    :pswitch_d
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/epy;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$drawable;->home_bloodpressure_card_background:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v12, v0}, Landroid/support/v7/widget/CardView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 523
    sget v0, Lcom/huawei/ui/homehealth/R$id;->function_set_items_blood_unit:I

    invoke-virtual {v12, v0}, Landroid/support/v7/widget/CardView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/epy;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homehealth/R$color;->function_set_blood_pressure:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 524
    sget v0, Lcom/huawei/ui/homehealth/R$id;->function_set_items_blood_data:I

    invoke-virtual {v12, v0}, Landroid/support/v7/widget/CardView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/epy;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homehealth/R$color;->function_set_blood_pressure:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 527
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget-object v0, v0, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    invoke-virtual {v0}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v17

    .line 528
    const-string v0, "en"

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_b

    .line 529
    const/high16 v15, 0x41500000    # 13.0f

    .line 530
    const/16 v16, 0x2

    .line 532
    :cond_b
    new-instance v0, Lo/epy$8;

    move-object/from16 v1, p0

    invoke-direct {v0, v1}, Lo/epy$8;-><init>(Lo/epy;)V

    invoke-virtual {v12, v0}, Landroid/support/v7/widget/CardView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 541
    goto :goto_6

    .line 543
    :pswitch_e
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/epy;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$drawable;->home_bloodsugar_card_background:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v12, v0}, Landroid/support/v7/widget/CardView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 544
    sget v0, Lcom/huawei/ui/homehealth/R$id;->function_set_items_blood_unit:I

    invoke-virtual {v12, v0}, Landroid/support/v7/widget/CardView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/epy;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homehealth/R$color;->function_set_blood_sugar:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 545
    sget v0, Lcom/huawei/ui/homehealth/R$id;->function_set_items_blood_data:I

    invoke-virtual {v12, v0}, Landroid/support/v7/widget/CardView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/epy;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homehealth/R$color;->function_set_blood_sugar:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 546
    new-instance v0, Lo/epy$9;

    move-object/from16 v1, p0

    invoke-direct {v0, v1}, Lo/epy$9;-><init>(Lo/epy;)V

    invoke-virtual {v12, v0}, Landroid/support/v7/widget/CardView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 555
    .line 560
    :goto_6
    move-object/from16 v0, p1

    check-cast v0, Lo/epy$b;

    invoke-static {v0}, Lo/epy$b;->k(Lo/epy$b;)Landroid/widget/TextView;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1, v15}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 561
    move-object/from16 v0, p1

    check-cast v0, Lo/epy$b;

    invoke-static {v0}, Lo/epy$b;->k(Lo/epy$b;)Landroid/widget/TextView;

    move-result-object v0

    const/4 v1, 0x0

    move/from16 v2, v16

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 562
    goto/16 :goto_7

    .line 563
    :cond_c
    sget-object v0, Lo/epx$c;->c:Lo/epx$c;

    invoke-virtual {v6}, Lo/epx;->h()Lo/epx$c;

    move-result-object v1

    if-ne v0, v1, :cond_d

    .line 564
    const/16 v0, 0x8

    invoke-virtual {v7, v0}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 565
    const/16 v0, 0x8

    invoke-virtual {v8, v0}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 566
    const/16 v0, 0x8

    invoke-virtual {v9, v0}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 567
    const/4 v0, 0x0

    invoke-virtual {v10, v0}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 569
    move-object/from16 v0, p1

    check-cast v0, Lo/epy$b;

    invoke-static {v0}, Lo/epy$b;->l(Lo/epy$b;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v6}, Lo/epx;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 571
    sget-object v0, Lo/epy$7;->e:[I

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/epy;->d:Ljava/util/List;

    move/from16 v2, p2

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/epx;

    invoke-virtual {v1}, Lo/epx;->g()Lo/eqa;

    move-result-object v1

    invoke-virtual {v1}, Lo/eqa;->ordinal()I

    move-result v1

    aget v0, v0, v1

    sparse-switch v0, :sswitch_data_0

    goto :goto_7

    .line 573
    :sswitch_0
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/epy;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$drawable;->home_manger_card_background:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v12, v0}, Landroid/support/v7/widget/CardView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 574
    new-instance v0, Lo/epy$10;

    move-object/from16 v1, p0

    invoke-direct {v0, v1}, Lo/epy$10;-><init>(Lo/epy;)V

    invoke-virtual {v12, v0}, Landroid/support/v7/widget/CardView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 583
    .line 590
    :cond_d
    :goto_7
    move-object/from16 v0, p0

    iget-boolean v0, v0, Lo/epy;->g:Z

    if-nez v0, :cond_e

    const/4 v0, 0x3

    move/from16 v1, p2

    if-ne v0, v1, :cond_e

    .line 591
    move-object/from16 v0, p0

    invoke-direct {v0, v12, v6}, Lo/epy;->b(Landroid/support/v7/widget/CardView;Lo/epx;)V

    .line 593
    :cond_e
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_6
        :pswitch_7
        :pswitch_8
        :pswitch_9
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x2
        :pswitch_a
        :pswitch_b
        :pswitch_c
        :pswitch_d
        :pswitch_e
    .end packed-switch

    :sswitch_data_0
    .sparse-switch
        0x7 -> :sswitch_0
    .end sparse-switch
.end method

.method public onCreateViewHolder(Landroid/view/ViewGroup;I)Landroid/support/v7/widget/RecyclerView$ViewHolder;
    .locals 4

    .line 129
    const-string v0, "UIHLH_FunctionSetViewAdapter"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "viewType"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 130
    new-instance v0, Lo/epy$b;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homehealth/R$layout;->function_set_items:I

    const/4 v3, 0x0

    invoke-virtual {v1, v2, p1, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/epy$b;-><init>(Landroid/view/View;)V

    return-object v0
.end method
