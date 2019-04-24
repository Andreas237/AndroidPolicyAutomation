.class public Lo/bij;
.super Landroid/support/v7/widget/RecyclerView$Adapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/bij$e;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/support/v7/widget/RecyclerView$Adapter<Lo/bij$e;>;"
    }
.end annotation


# instance fields
.field private a:Landroid/view/LayoutInflater;

.field private b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/util/Map<Ljava/lang/Long;Landroid/graphics/Bitmap;>;>;"
        }
    .end annotation
.end field

.field private c:Landroid/content/Context;

.field private d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupRank;>;"
        }
    .end annotation
.end field

.field private e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/util/Map<Ljava/lang/Long;Landroid/graphics/Bitmap;>;>;"
        }
    .end annotation
.end field

.field private f:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Ljava/util/List<Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupRank;>;)V"
        }
    .end annotation

    .line 63
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView$Adapter;-><init>()V

    .line 34
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/bij;->b:Ljava/util/List;

    .line 36
    const/4 v0, 0x1

    iput v0, p0, Lo/bij;->f:I

    .line 64
    iput-object p1, p0, Lo/bij;->c:Landroid/content/Context;

    .line 65
    iput-object p2, p0, Lo/bij;->d:Ljava/util/List;

    .line 66
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    iput-object v0, p0, Lo/bij;->a:Landroid/view/LayoutInflater;

    .line 67
    invoke-static {p1}, Lo/bht;->b(Landroid/content/Context;)Lo/bht;

    move-result-object v0

    invoke-virtual {v0}, Lo/bht;->a()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lo/bij;->e:Ljava/util/List;

    .line 68
    iget-object v0, p0, Lo/bij;->b:Ljava/util/List;

    iget-object v1, p0, Lo/bij;->e:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 69
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 70
    const-wide/16 v0, 0x0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-static {p1}, Lo/bht;->b(Landroid/content/Context;)Lo/bht;

    move-result-object v1

    const-string v2, "pic_6"

    invoke-virtual {v1, v2}, Lo/bht;->c(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    iget-object v0, p0, Lo/bij;->b:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1, v3}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 72
    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .line 60
    const/4 v0, 0x5

    iput v0, p0, Lo/bij;->f:I

    .line 61
    return-void
.end method

.method public b()V
    .locals 1

    .line 48
    const/4 v0, 0x2

    iput v0, p0, Lo/bij;->f:I

    .line 49
    return-void
.end method

.method public c(Landroid/view/ViewGroup;I)Lo/bij$e;
    .locals 4

    .line 76
    new-instance v0, Lo/bij$e;

    iget-object v1, p0, Lo/bij;->a:Landroid/view/LayoutInflater;

    sget v2, Lcom/huawei/android/sns/R$layout;->item_health_group_ranking:I

    const/4 v3, 0x0

    invoke-virtual {v1, v2, p1, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/bij$e;-><init>(Landroid/view/View;)V

    return-object v0
.end method

.method public c()V
    .locals 1

    .line 52
    const/4 v0, 0x3

    iput v0, p0, Lo/bij;->f:I

    .line 53
    return-void
.end method

.method public c(Lo/bij$e;I)V
    .locals 7

    .line 81
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lo/bij$e;->setIsRecyclable(Z)V

    .line 82
    iget-object v0, p0, Lo/bij;->d:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupRank;

    .line 83
    if-nez v6, :cond_0

    .line 84
    return-void

    .line 88
    :cond_0
    iget-object v0, p0, Lo/bij;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-ne p2, v0, :cond_1

    .line 89
    invoke-static {p1}, Lo/bij$e;->e(Lo/bij$e;)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    .line 91
    :cond_1
    invoke-static {p1}, Lo/bij$e;->e(Lo/bij$e;)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 93
    :goto_0
    const/4 v0, 0x0

    if-ne v0, p2, :cond_3

    .line 94
    invoke-static {p1}, Lo/bij$e;->e(Lo/bij$e;)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 95
    iget-object v0, p0, Lo/bij;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    .line 96
    invoke-static {p1}, Lo/bij$e;->c(Lo/bij$e;)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_1

    .line 98
    :cond_2
    invoke-static {p1}, Lo/bij$e;->c(Lo/bij$e;)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_1

    .line 101
    :cond_3
    invoke-static {p1}, Lo/bij$e;->c(Lo/bij$e;)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 104
    :goto_1
    invoke-virtual {v6}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupRank;->getRankNumb()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto :goto_2

    .line 106
    :pswitch_0
    invoke-static {p1}, Lo/bij$e;->a(Lo/bij$e;)Landroid/widget/TextView;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 107
    invoke-static {p1}, Lo/bij$e;->a(Lo/bij$e;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lo/bij;->c:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$drawable;->icon_order_1:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 108
    goto :goto_3

    .line 110
    :pswitch_1
    invoke-static {p1}, Lo/bij$e;->a(Lo/bij$e;)Landroid/widget/TextView;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 111
    invoke-static {p1}, Lo/bij$e;->a(Lo/bij$e;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lo/bij;->c:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$drawable;->icon_order_2:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 112
    goto :goto_3

    .line 114
    :pswitch_2
    invoke-static {p1}, Lo/bij$e;->a(Lo/bij$e;)Landroid/widget/TextView;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 115
    invoke-static {p1}, Lo/bij$e;->a(Lo/bij$e;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lo/bij;->c:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$drawable;->icon_order_3:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 116
    goto :goto_3

    .line 118
    :goto_2
    invoke-static {p1}, Lo/bij$e;->a(Lo/bij$e;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v6}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupRank;->getRankNumb()I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 119
    invoke-static {p1}, Lo/bij$e;->a(Lo/bij$e;)Landroid/widget/TextView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setBackgroundColor(I)V

    .line 123
    :goto_3
    invoke-virtual {v6}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupRank;->getHuid()J

    move-result-wide v0

    const-wide v2, 0x5d471fdcb4e9480L

    cmp-long v0, v0, v2

    if-nez v0, :cond_4

    .line 124
    invoke-static {p1}, Lo/bij$e;->b(Lo/bij$e;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lo/bij;->c:Landroid/content/Context;

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

    .line 126
    :cond_4
    invoke-static {p1}, Lo/bij$e;->b(Lo/bij$e;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v6}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupRank;->getNickName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 129
    :goto_4
    const/4 v0, 0x0

    if-ne v0, p2, :cond_5

    .line 130
    invoke-static {p1}, Lo/bij$e;->d(Lo/bij$e;)Landroid/widget/ImageView;

    move-result-object v0

    iget-object v1, p0, Lo/bij;->b:Ljava/util/List;

    invoke-interface {v1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map;

    const-wide/16 v2, 0x0

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/graphics/Bitmap;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    goto :goto_5

    .line 132
    :cond_5
    invoke-static {p1}, Lo/bij$e;->d(Lo/bij$e;)Landroid/widget/ImageView;

    move-result-object v0

    iget-object v1, p0, Lo/bij;->b:Ljava/util/List;

    invoke-interface {v1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map;

    invoke-virtual {v6}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupRank;->getHuid()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/graphics/Bitmap;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 135
    :goto_5
    iget v0, p0, Lo/bij;->f:I

    const/4 v1, 0x1

    if-ne v1, v0, :cond_6

    .line 136
    invoke-static {p1}, Lo/bij$e;->i(Lo/bij$e;)Landroid/widget/TextView;

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

    iget-object v2, p0, Lo/bij;->c:Landroid/content/Context;

    sget v3, Lcom/huawei/android/sns/R$string;->IDS_band_data_sport_distance_unit:I

    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_6

    .line 137
    :cond_6
    iget v0, p0, Lo/bij;->f:I

    const/4 v1, 0x2

    if-ne v1, v0, :cond_7

    .line 138
    invoke-static {p1}, Lo/bij$e;->i(Lo/bij$e;)Landroid/widget/TextView;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupRank;->getSteps()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lo/bij;->c:Landroid/content/Context;

    sget v3, Lcom/huawei/android/sns/R$string;->IDS_settings_steps_unit:I

    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_6

    .line 139
    :cond_7
    iget v0, p0, Lo/bij;->f:I

    const/4 v1, 0x3

    if-ne v1, v0, :cond_8

    .line 140
    invoke-static {p1}, Lo/bij$e;->i(Lo/bij$e;)Landroid/widget/TextView;

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

    iget-object v2, p0, Lo/bij;->c:Landroid/content/Context;

    sget v3, Lcom/huawei/android/sns/R$string;->IDS_band_data_sport_distance_unit:I

    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_6

    .line 141
    :cond_8
    iget v0, p0, Lo/bij;->f:I

    const/4 v1, 0x5

    if-ne v1, v0, :cond_9

    .line 142
    invoke-static {p1}, Lo/bij$e;->i(Lo/bij$e;)Landroid/widget/TextView;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupRank;->getDistance()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lo/bij;->c:Landroid/content/Context;

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

    goto :goto_6

    .line 143
    :cond_9
    iget v0, p0, Lo/bij;->f:I

    const/4 v1, 0x4

    if-ne v1, v0, :cond_a

    .line 144
    invoke-static {p1}, Lo/bij$e;->i(Lo/bij$e;)Landroid/widget/TextView;

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

    iget-object v2, p0, Lo/bij;->c:Landroid/content/Context;

    sget v3, Lcom/huawei/android/sns/R$string;->IDS_messagecenter_time_minute_value:I

    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 146
    :cond_a
    :goto_6
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method public d()V
    .locals 1

    .line 44
    const/4 v0, 0x1

    iput v0, p0, Lo/bij;->f:I

    .line 45
    return-void
.end method

.method public e()V
    .locals 1

    .line 56
    const/4 v0, 0x4

    iput v0, p0, Lo/bij;->f:I

    .line 57
    return-void
.end method

.method public getItemCount()I
    .locals 4

    .line 150
    const-string v0, "Group_HealthGroupRankingAdapt"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "TAG_DOUBLE"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "getItemCount healthGroupRankList size is = "

    const/4 v3, 0x1

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/bij;->d:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 151
    iget-object v0, p0, Lo/bij;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public synthetic onBindViewHolder(Landroid/support/v7/widget/RecyclerView$ViewHolder;I)V
    .locals 1

    .line 27
    move-object v0, p1

    check-cast v0, Lo/bij$e;

    invoke-virtual {p0, v0, p2}, Lo/bij;->c(Lo/bij$e;I)V

    return-void
.end method

.method public synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroid/support/v7/widget/RecyclerView$ViewHolder;
    .locals 1

    .line 27
    invoke-virtual {p0, p1, p2}, Lo/bij;->c(Landroid/view/ViewGroup;I)Lo/bij$e;

    move-result-object v0

    return-object v0
.end method
