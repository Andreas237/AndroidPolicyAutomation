.class public Lo/bhr;
.super Landroid/support/v7/widget/RecyclerView$Adapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/bhr$c;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/support/v7/widget/RecyclerView$Adapter<Lo/bhr$c;>;"
    }
.end annotation


# instance fields
.field private a:Landroid/content/Context;

.field private b:I

.field private d:Landroid/view/LayoutInflater;

.field private e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupRank;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Ljava/util/List<Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupRank;>;)V"
        }
    .end annotation

    .line 59
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView$Adapter;-><init>()V

    .line 32
    const/4 v0, 0x1

    iput v0, p0, Lo/bhr;->b:I

    .line 60
    iput-object p1, p0, Lo/bhr;->a:Landroid/content/Context;

    .line 61
    iput-object p2, p0, Lo/bhr;->e:Ljava/util/List;

    .line 62
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    iput-object v0, p0, Lo/bhr;->d:Landroid/view/LayoutInflater;

    .line 63
    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .line 40
    const/4 v0, 0x1

    iput v0, p0, Lo/bhr;->b:I

    .line 41
    return-void
.end method

.method public b()V
    .locals 1

    .line 44
    const/4 v0, 0x2

    iput v0, p0, Lo/bhr;->b:I

    .line 45
    return-void
.end method

.method public c()V
    .locals 1

    .line 48
    const/4 v0, 0x3

    iput v0, p0, Lo/bhr;->b:I

    .line 49
    return-void
.end method

.method public d()V
    .locals 1

    .line 52
    const/4 v0, 0x4

    iput v0, p0, Lo/bhr;->b:I

    .line 53
    return-void
.end method

.method public d(Lo/bhr$c;I)V
    .locals 7

    .line 72
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lo/bhr$c;->setIsRecyclable(Z)V

    .line 73
    iget-object v0, p0, Lo/bhr;->e:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupRank;

    .line 74
    if-nez v6, :cond_0

    .line 75
    return-void

    .line 79
    :cond_0
    iget-object v0, p0, Lo/bhr;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-ne p2, v0, :cond_1

    .line 80
    invoke-static {p1}, Lo/bhr$c;->c(Lo/bhr$c;)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    .line 82
    :cond_1
    invoke-static {p1}, Lo/bhr$c;->c(Lo/bhr$c;)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 85
    :goto_0
    const/4 v0, 0x0

    if-ne v0, p2, :cond_3

    .line 86
    invoke-static {p1}, Lo/bhr$c;->c(Lo/bhr$c;)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 87
    iget-object v0, p0, Lo/bhr;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    .line 88
    invoke-static {p1}, Lo/bhr$c;->e(Lo/bhr$c;)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_1

    .line 90
    :cond_2
    invoke-static {p1}, Lo/bhr$c;->e(Lo/bhr$c;)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_1

    .line 95
    :cond_3
    invoke-static {p1}, Lo/bhr$c;->e(Lo/bhr$c;)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 97
    :goto_1
    invoke-virtual {v6}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupRank;->getRankNumb()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto :goto_2

    .line 99
    :pswitch_0
    invoke-static {p1}, Lo/bhr$c;->a(Lo/bhr$c;)Landroid/widget/TextView;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 100
    invoke-static {p1}, Lo/bhr$c;->a(Lo/bhr$c;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lo/bhr;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$drawable;->icon_order_1:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 101
    goto :goto_3

    .line 103
    :pswitch_1
    invoke-static {p1}, Lo/bhr$c;->a(Lo/bhr$c;)Landroid/widget/TextView;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 104
    invoke-static {p1}, Lo/bhr$c;->a(Lo/bhr$c;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lo/bhr;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$drawable;->icon_order_2:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 105
    goto :goto_3

    .line 107
    :pswitch_2
    invoke-static {p1}, Lo/bhr$c;->a(Lo/bhr$c;)Landroid/widget/TextView;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 108
    invoke-static {p1}, Lo/bhr$c;->a(Lo/bhr$c;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lo/bhr;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$drawable;->icon_order_3:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 109
    goto :goto_3

    .line 111
    :goto_2
    invoke-static {p1}, Lo/bhr$c;->a(Lo/bhr$c;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v6}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupRank;->getRankNumb()I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 112
    invoke-static {p1}, Lo/bhr$c;->a(Lo/bhr$c;)Landroid/widget/TextView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setBackgroundColor(I)V

    .line 115
    :goto_3
    invoke-virtual {v6}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupRank;->getHuid()J

    move-result-wide v0

    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v2

    invoke-virtual {v2}, Lo/aoq;->a()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-nez v0, :cond_4

    .line 117
    invoke-static {p1}, Lo/bhr$c;->d(Lo/bhr$c;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lo/bhr;->a:Landroid/content/Context;

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_create_group_me:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v6}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupRank;->getNickName()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_4

    .line 119
    :cond_4
    invoke-static {p1}, Lo/bhr$c;->d(Lo/bhr$c;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v6}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupRank;->getNickName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 122
    :goto_4
    iget v0, p0, Lo/bhr;->b:I

    const/4 v1, 0x1

    if-ne v1, v0, :cond_5

    .line 123
    invoke-static {p1}, Lo/bhr$c;->b(Lo/bhr$c;)Landroid/widget/TextView;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupRank;->getDistance()J

    move-result-wide v2

    long-to-double v2, v2

    const-wide v4, 0x408f400000000000L    # 1000.0

    div-double/2addr v2, v4

    const/4 v4, 0x1

    const/4 v5, 0x2

    invoke-static {v2, v3, v4, v5}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lo/bhr;->a:Landroid/content/Context;

    sget v3, Lcom/huawei/android/sns/R$string;->IDS_band_data_sport_distance_unit:I

    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_5

    .line 125
    :cond_5
    iget v0, p0, Lo/bhr;->b:I

    const/4 v1, 0x2

    if-ne v1, v0, :cond_6

    .line 126
    invoke-static {p1}, Lo/bhr$c;->b(Lo/bhr$c;)Landroid/widget/TextView;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupRank;->getSteps()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lo/bhr;->a:Landroid/content/Context;

    sget v3, Lcom/huawei/android/sns/R$string;->IDS_settings_steps_unit:I

    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_5

    .line 127
    :cond_6
    iget v0, p0, Lo/bhr;->b:I

    const/4 v1, 0x3

    if-ne v1, v0, :cond_7

    .line 128
    invoke-static {p1}, Lo/bhr$c;->b(Lo/bhr$c;)Landroid/widget/TextView;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupRank;->getDistance()J

    move-result-wide v2

    long-to-double v2, v2

    const-wide v4, 0x408f400000000000L    # 1000.0

    div-double/2addr v2, v4

    const/4 v4, 0x1

    const/4 v5, 0x2

    invoke-static {v2, v3, v4, v5}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lo/bhr;->a:Landroid/content/Context;

    sget v3, Lcom/huawei/android/sns/R$string;->IDS_band_data_sport_distance_unit:I

    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_5

    .line 129
    :cond_7
    iget v0, p0, Lo/bhr;->b:I

    const/4 v1, 0x5

    if-ne v1, v0, :cond_8

    .line 130
    invoke-static {p1}, Lo/bhr$c;->b(Lo/bhr$c;)Landroid/widget/TextView;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupRank;->getDistance()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lo/bhr;->a:Landroid/content/Context;

    sget v3, Lcom/huawei/android/sns/R$string;->IDS_fitness_data_list_activity_meter_unit:I

    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_5

    .line 131
    :cond_8
    iget v0, p0, Lo/bhr;->b:I

    const/4 v1, 0x4

    if-ne v1, v0, :cond_9

    .line 132
    invoke-static {p1}, Lo/bhr$c;->b(Lo/bhr$c;)Landroid/widget/TextView;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupRank;->getDuration()J

    move-result-wide v2

    long-to-double v2, v2

    const-wide/high16 v4, 0x404e000000000000L    # 60.0

    div-double/2addr v2, v4

    const/4 v4, 0x1

    const/4 v5, 0x0

    invoke-static {v2, v3, v4, v5}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lo/bhr;->a:Landroid/content/Context;

    sget v3, Lcom/huawei/android/sns/R$string;->IDS_messagecenter_time_minute_value:I

    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 135
    :cond_9
    :goto_5
    invoke-virtual {v6}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupRank;->getHuid()J

    move-result-wide v0

    invoke-static {p1}, Lo/bhr$c;->g(Lo/bhr$c;)Landroid/widget/ImageView;

    move-result-object v2

    invoke-virtual {v6}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupRank;->getHeadImgUrl()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v6}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupRank;->getHeadImgUrl()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v6}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupRank;->getHeadImgUrl()Ljava/lang/String;

    move-result-object v5

    invoke-static/range {v0 .. v5}, Lo/bbk;->c(JLandroid/widget/ImageView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 137
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method public e(Landroid/view/ViewGroup;I)Lo/bhr$c;
    .locals 4

    .line 67
    new-instance v0, Lo/bhr$c;

    iget-object v1, p0, Lo/bhr;->d:Landroid/view/LayoutInflater;

    sget v2, Lcom/huawei/android/sns/R$layout;->item_health_group_ranking:I

    const/4 v3, 0x0

    invoke-virtual {v1, v2, p1, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/bhr$c;-><init>(Landroid/view/View;)V

    return-object v0
.end method

.method public e()V
    .locals 1

    .line 56
    const/4 v0, 0x5

    iput v0, p0, Lo/bhr;->b:I

    .line 57
    return-void
.end method

.method public getItemCount()I
    .locals 1

    .line 141
    iget-object v0, p0, Lo/bhr;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public synthetic onBindViewHolder(Landroid/support/v7/widget/RecyclerView$ViewHolder;I)V
    .locals 1

    .line 25
    move-object v0, p1

    check-cast v0, Lo/bhr$c;

    invoke-virtual {p0, v0, p2}, Lo/bhr;->d(Lo/bhr$c;I)V

    return-void
.end method

.method public synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroid/support/v7/widget/RecyclerView$ViewHolder;
    .locals 1

    .line 25
    invoke-virtual {p0, p1, p2}, Lo/bhr;->e(Landroid/view/ViewGroup;I)Lo/bhr$c;

    move-result-object v0

    return-object v0
.end method
