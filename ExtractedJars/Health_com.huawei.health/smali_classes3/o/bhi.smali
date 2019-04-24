.class public Lo/bhi;
.super Landroid/support/v7/widget/RecyclerView$Adapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/bhi$d;,
        Lo/bhi$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/support/v7/widget/RecyclerView$Adapter<Landroid/support/v7/widget/RecyclerView$ViewHolder;>;"
    }
.end annotation


# instance fields
.field private a:Z

.field private b:Landroid/view/LayoutInflater;

.field private c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;>;"
        }
    .end annotation
.end field

.field private d:D

.field private e:Landroid/content/Context;

.field private g:I

.field private i:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/List;DI)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Ljava/util/List<Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;>;DI)V"
        }
    .end annotation

    .line 54
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView$Adapter;-><init>()V

    .line 44
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/bhi;->a:Z

    .line 52
    const/4 v0, 0x0

    iput v0, p0, Lo/bhi;->g:I

    .line 55
    iput-object p1, p0, Lo/bhi;->e:Landroid/content/Context;

    .line 56
    iput-object p2, p0, Lo/bhi;->c:Ljava/util/List;

    .line 57
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    iput-object v0, p0, Lo/bhi;->b:Landroid/view/LayoutInflater;

    .line 58
    iput-wide p3, p0, Lo/bhi;->d:D

    .line 59
    iput p5, p0, Lo/bhi;->i:I

    .line 60
    return-void
.end method

.method private b(DILo/bhi$b;Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;)V
    .locals 8

    .line 210
    const-wide/16 v0, 0x0

    cmpl-double v0, p1, v0

    if-lez v0, :cond_5

    .line 212
    iget v0, p0, Lo/bhi;->i:I

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 214
    :sswitch_0
    invoke-virtual {p5}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->getBestValue()D

    move-result-wide v0

    const-wide/high16 v2, 0x404e000000000000L    # 60.0

    div-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->round(D)J

    move-result-wide v0

    long-to-double v4, v0

    .line 215
    goto :goto_1

    .line 217
    :sswitch_1
    invoke-virtual {p5}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->getBestValue()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Math;->round(D)J

    move-result-wide v0

    long-to-double v4, v0

    .line 218
    goto :goto_1

    .line 220
    :goto_0
    invoke-virtual {p5}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->getBestValue()D

    move-result-wide v0

    const-wide v2, 0x408f400000000000L    # 1000.0

    div-double v4, v0, v2

    .line 224
    :goto_1
    const/4 v0, 0x0

    if-ne v0, p3, :cond_1

    .line 225
    invoke-static {p4}, Lo/bhi$b;->k(Lo/bhi$b;)Landroid/widget/TextView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 226
    cmpl-double v0, v4, p1

    if-ltz v0, :cond_0

    .line 227
    invoke-static {p4}, Lo/bhi$b;->k(Lo/bhi$b;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lo/bhi;->e:Landroid/content/Context;

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_group_activity_standard:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_4

    .line 229
    :cond_0
    invoke-static {p4}, Lo/bhi$b;->k(Lo/bhi$b;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lo/bhi;->e:Landroid/content/Context;

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_group_activity_substandard:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_4

    .line 233
    :cond_1
    iget v0, p0, Lo/bhi;->i:I

    sparse-switch v0, :sswitch_data_1

    goto :goto_2

    .line 235
    :sswitch_2
    iget-object v0, p0, Lo/bhi;->c:Ljava/util/List;

    add-int/lit8 v1, p3, -0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->getBestValue()D

    move-result-wide v0

    const-wide/high16 v2, 0x404e000000000000L    # 60.0

    div-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->round(D)J

    move-result-wide v0

    long-to-double v6, v0

    .line 236
    goto :goto_3

    .line 238
    :sswitch_3
    iget-object v0, p0, Lo/bhi;->c:Ljava/util/List;

    add-int/lit8 v1, p3, -0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->getBestValue()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Math;->round(D)J

    move-result-wide v0

    long-to-double v6, v0

    .line 239
    goto :goto_3

    .line 241
    :goto_2
    iget-object v0, p0, Lo/bhi;->c:Ljava/util/List;

    add-int/lit8 v1, p3, -0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->getBestValue()D

    move-result-wide v0

    const-wide v2, 0x408f400000000000L    # 1000.0

    div-double v6, v0, v2

    .line 245
    :goto_3
    cmpl-double v0, v6, p1

    if-ltz v0, :cond_3

    .line 246
    cmpl-double v0, v4, p1

    if-ltz v0, :cond_2

    .line 247
    invoke-static {p4}, Lo/bhi$b;->k(Lo/bhi$b;)Landroid/widget/TextView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_4

    .line 249
    :cond_2
    invoke-static {p4}, Lo/bhi$b;->k(Lo/bhi$b;)Landroid/widget/TextView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 250
    invoke-static {p4}, Lo/bhi$b;->k(Lo/bhi$b;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lo/bhi;->e:Landroid/content/Context;

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_group_activity_substandard:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_4

    .line 253
    :cond_3
    cmpl-double v0, v4, p1

    if-ltz v0, :cond_4

    .line 254
    invoke-static {p4}, Lo/bhi$b;->k(Lo/bhi$b;)Landroid/widget/TextView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 255
    invoke-static {p4}, Lo/bhi$b;->k(Lo/bhi$b;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lo/bhi;->e:Landroid/content/Context;

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_group_activity_standard:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_4

    .line 257
    :cond_4
    invoke-static {p4}, Lo/bhi$b;->k(Lo/bhi$b;)Landroid/widget/TextView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 262
    :cond_5
    :goto_4
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xcc -> :sswitch_0
        0xcd -> :sswitch_1
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0xcc -> :sswitch_2
        0xcd -> :sswitch_3
    .end sparse-switch
.end method


# virtual methods
.method public a(D)V
    .locals 0

    .line 47
    iput-wide p1, p0, Lo/bhi;->d:D

    .line 48
    return-void
.end method

.method public c(Z)V
    .locals 0

    .line 313
    iput-boolean p1, p0, Lo/bhi;->a:Z

    .line 314
    invoke-virtual {p0}, Lo/bhi;->notifyDataSetChanged()V

    .line 315
    return-void
.end method

.method public d(Ljava/util/List;)I
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;>;)I"
        }
    .end annotation

    .line 68
    const/4 v4, 0x0

    .line 69
    if-eqz p1, :cond_1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 70
    const-wide/16 v5, 0x0

    .line 71
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;

    .line 72
    iget v0, p0, Lo/bhi;->i:I

    packed-switch v0, :pswitch_data_0

    goto :goto_1

    .line 76
    :pswitch_0
    invoke-virtual {v8}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->getBestValue()D

    move-result-wide v0

    const-wide v2, 0x408f400000000000L    # 1000.0

    div-double v5, v0, v2

    .line 77
    goto :goto_1

    .line 79
    :pswitch_1
    invoke-virtual {v8}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->getBestValue()D

    move-result-wide v0

    const-wide/high16 v2, 0x404e000000000000L    # 60.0

    div-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->round(D)J

    move-result-wide v0

    long-to-double v5, v0

    .line 80
    goto :goto_1

    .line 82
    :pswitch_2
    invoke-virtual {v8}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->getBestValue()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Math;->round(D)J

    move-result-wide v0

    long-to-double v5, v0

    .line 83
    .line 87
    :goto_1
    iget-wide v0, p0, Lo/bhi;->d:D

    cmpl-double v0, v5, v0

    if-ltz v0, :cond_0

    .line 88
    add-int/lit8 v4, v4, 0x1

    .line 90
    :cond_0
    goto :goto_0

    .line 92
    :cond_1
    return v4

    :pswitch_data_0
    .packed-switch 0xc9
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method public getItemCount()I
    .locals 1

    .line 266
    iget-object v0, p0, Lo/bhi;->c:Ljava/util/List;

    if-eqz v0, :cond_0

    .line 267
    iget-object v0, p0, Lo/bhi;->c:Ljava/util/List;

    invoke-virtual {p0, v0}, Lo/bhi;->d(Ljava/util/List;)I

    move-result v0

    iput v0, p0, Lo/bhi;->g:I

    .line 268
    iget-object v0, p0, Lo/bhi;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0

    .line 270
    :cond_0
    const/4 v0, 0x0

    iput v0, p0, Lo/bhi;->g:I

    .line 271
    const/4 v0, 0x0

    return v0
.end method

.method public getItemViewType(I)I
    .locals 2

    .line 306
    iget-boolean v0, p0, Lo/bhi;->a:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/bhi;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/16 v1, 0xa

    if-lt v0, v1, :cond_0

    invoke-virtual {p0}, Lo/bhi;->getItemCount()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-ne p1, v0, :cond_0

    .line 307
    const/4 v0, 0x1

    return v0

    .line 309
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public onBindViewHolder(Landroid/support/v7/widget/RecyclerView$ViewHolder;I)V
    .locals 13

    .line 105
    invoke-virtual {p0, p2}, Lo/bhi;->getItemViewType(I)I

    move-result v0

    if-nez v0, :cond_6

    .line 106
    move-object v6, p1

    check-cast v6, Lo/bhi$b;

    .line 107
    iget-object v0, p0, Lo/bhi;->c:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;

    .line 108
    invoke-virtual {v7}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->getGroupRank()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 110
    :pswitch_0
    invoke-static {v6}, Lo/bhi$b;->a(Lo/bhi$b;)Landroid/widget/TextView;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 111
    invoke-static {v6}, Lo/bhi$b;->a(Lo/bhi$b;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lo/bhi;->e:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$drawable;->icon_order_1:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 112
    goto :goto_1

    .line 114
    :pswitch_1
    invoke-static {v6}, Lo/bhi$b;->a(Lo/bhi$b;)Landroid/widget/TextView;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 115
    invoke-static {v6}, Lo/bhi$b;->a(Lo/bhi$b;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lo/bhi;->e:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$drawable;->icon_order_2:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 116
    goto :goto_1

    .line 118
    :pswitch_2
    invoke-static {v6}, Lo/bhi$b;->a(Lo/bhi$b;)Landroid/widget/TextView;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 119
    invoke-static {v6}, Lo/bhi$b;->a(Lo/bhi$b;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lo/bhi;->e:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$drawable;->icon_order_3:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 120
    goto :goto_1

    .line 122
    :goto_0
    invoke-static {v6}, Lo/bhi$b;->a(Lo/bhi$b;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v7}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->getGroupRank()I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 123
    invoke-static {v6}, Lo/bhi$b;->a(Lo/bhi$b;)Landroid/widget/TextView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setBackgroundColor(I)V

    .line 126
    :goto_1
    invoke-virtual {v7}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->getHuid()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v2

    invoke-virtual {v2}, Lo/aoq;->a()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    .line 128
    invoke-static {v6}, Lo/bhi$b;->d(Lo/bhi$b;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lo/bhi;->e:Landroid/content/Context;

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_create_group_me:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v7}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->getNickName()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_2

    .line 130
    :cond_0
    invoke-static {v6}, Lo/bhi$b;->d(Lo/bhi$b;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v7}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->getNickName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 135
    :goto_2
    iget-object v0, p0, Lo/bhi;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/bht;->b(Landroid/content/Context;)Lo/bht;

    move-result-object v0

    invoke-virtual {v7}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->getBestValue()D

    move-result-wide v1

    double-to-int v1, v1

    invoke-virtual {v0, v1}, Lo/bht;->b(I)Ljava/lang/String;

    move-result-object v8

    .line 136
    invoke-static {v6}, Lo/bhi$b;->b(Lo/bhi$b;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 137
    const-string v9, ""

    .line 138
    const-string v0, "Group_HealthEventMemberRankAdapter"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "activityType = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget v2, p0, Lo/bhi;->i:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 139
    iget v0, p0, Lo/bhi;->i:I

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_3

    .line 142
    :sswitch_0
    iget-wide v0, p0, Lo/bhi;->d:D

    const-wide/16 v2, 0x0

    cmpl-double v0, v0, v2

    if-eqz v0, :cond_1

    .line 143
    invoke-virtual {v7}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->getBestValue()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Math;->round(D)J

    move-result-wide v0

    long-to-double v0, v0

    iget-wide v2, p0, Lo/bhi;->d:D

    div-double/2addr v0, v2

    double-to-int v10, v0

    .line 144
    const-string v0, "%02d\'%02d\""

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    div-int/lit8 v2, v10, 0x3c

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    rem-int/lit8 v2, v10, 0x3c

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    .line 145
    invoke-static {v6}, Lo/bhi$b;->c(Lo/bhi$b;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 146
    goto/16 :goto_4

    .line 147
    :cond_1
    const-string v0, "Group_HealthEventMemberRankAdapter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "refreshSelfEventRank goalValue == 0 "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 148
    const-string v0, "%02d\'%02d\""

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    .line 149
    invoke-static {v6}, Lo/bhi$b;->c(Lo/bhi$b;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 151
    goto/16 :goto_4

    .line 153
    :sswitch_1
    iget-wide v0, p0, Lo/bhi;->d:D

    const-wide/16 v2, 0x0

    cmpl-double v0, v0, v2

    if-eqz v0, :cond_2

    .line 154
    iget-wide v0, p0, Lo/bhi;->d:D

    invoke-virtual {v7}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->getBestValue()D

    move-result-wide v2

    const-wide v4, 0x40ac200000000000L    # 3600.0

    div-double/2addr v2, v4

    div-double/2addr v0, v2

    const/4 v2, 0x1

    const/4 v3, 0x2

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v9

    .line 155
    invoke-static {v6}, Lo/bhi$b;->c(Lo/bhi$b;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_4

    .line 157
    :cond_2
    const-string v0, "Group_HealthEventMemberRankAdapter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "refreshSelfEventRank goalValue == 0 "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 158
    const-string v9, "0"

    .line 159
    invoke-static {v6}, Lo/bhi$b;->c(Lo/bhi$b;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 161
    goto/16 :goto_4

    .line 163
    :sswitch_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->getBestValue()D

    move-result-wide v1

    const-wide/high16 v3, 0x404e000000000000L    # 60.0

    div-double/2addr v1, v3

    invoke-static {v1, v2}, Ljava/lang/Math;->round(D)J

    move-result-wide v1

    long-to-int v1, v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/bhi;->e:Landroid/content/Context;

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_messagecenter_time_minute_value:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    .line 164
    invoke-static {v6}, Lo/bhi$b;->b(Lo/bhi$b;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 165
    invoke-static {v6}, Lo/bhi$b;->c(Lo/bhi$b;)Landroid/widget/TextView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 166
    move-object v0, p0

    iget-wide v1, p0, Lo/bhi;->d:D

    move v3, p2

    move-object v4, v6

    move-object v5, v7

    invoke-direct/range {v0 .. v5}, Lo/bhi;->b(DILo/bhi$b;Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;)V

    .line 167
    goto/16 :goto_4

    .line 169
    :sswitch_3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->getBestValue()D

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Math;->round(D)J

    move-result-wide v1

    long-to-int v1, v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/bhi;->e:Landroid/content/Context;

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_fitness_data_list_activity_meter_unit:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    .line 170
    invoke-static {v6}, Lo/bhi$b;->b(Lo/bhi$b;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v11}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 171
    invoke-static {v6}, Lo/bhi$b;->c(Lo/bhi$b;)Landroid/widget/TextView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 172
    move-object v0, p0

    iget-wide v1, p0, Lo/bhi;->d:D

    move v3, p2

    move-object v4, v6

    move-object v5, v7

    invoke-direct/range {v0 .. v5}, Lo/bhi;->b(DILo/bhi$b;Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;)V

    .line 173
    goto :goto_4

    .line 175
    :goto_3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->getBestValue()D

    move-result-wide v1

    const-wide v3, 0x408f400000000000L    # 1000.0

    div-double/2addr v1, v3

    const/4 v3, 0x1

    const/4 v4, 0x2

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/bhi;->e:Landroid/content/Context;

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_band_data_sport_distance_unit:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    .line 176
    invoke-static {v6}, Lo/bhi$b;->b(Lo/bhi$b;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v12}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 177
    invoke-static {v6}, Lo/bhi$b;->c(Lo/bhi$b;)Landroid/widget/TextView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 178
    move-object v0, p0

    iget-wide v1, p0, Lo/bhi;->d:D

    move v3, p2

    move-object v4, v6

    move-object v5, v7

    invoke-direct/range {v0 .. v5}, Lo/bhi;->b(DILo/bhi$b;Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;)V

    .line 182
    :goto_4
    invoke-virtual {v7}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->getHuid()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-static {v6}, Lo/bhi$b;->e(Lo/bhi$b;)Landroid/widget/ImageView;

    move-result-object v2

    invoke-virtual {v7}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->getPhotoUrl()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v7}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->getPhotoUrl()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v7}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->getPhotoUrl()Ljava/lang/String;

    move-result-object v5

    invoke-static/range {v0 .. v5}, Lo/bbk;->c(JLandroid/widget/ImageView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 183
    iget-object v0, p0, Lo/bhi;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-ne v0, p2, :cond_3

    .line 184
    invoke-static {v6}, Lo/bhi$b;->g(Lo/bhi$b;)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 185
    invoke-static {v6}, Lo/bhi$b;->h(Lo/bhi$b;)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_5

    .line 187
    :cond_3
    invoke-static {v6}, Lo/bhi$b;->g(Lo/bhi$b;)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 188
    iget v0, p0, Lo/bhi;->g:I

    if-lez v0, :cond_5

    .line 189
    iget v0, p0, Lo/bhi;->g:I

    add-int/lit8 v0, v0, -0x1

    if-ne v0, p2, :cond_4

    .line 190
    invoke-static {v6}, Lo/bhi$b;->h(Lo/bhi$b;)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_5

    .line 192
    :cond_4
    invoke-static {v6}, Lo/bhi$b;->h(Lo/bhi$b;)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_5

    .line 195
    :cond_5
    invoke-static {v6}, Lo/bhi$b;->h(Lo/bhi$b;)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 199
    :cond_6
    :goto_5
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch

    :sswitch_data_0
    .sparse-switch
        0x65 -> :sswitch_0
        0x66 -> :sswitch_0
        0x67 -> :sswitch_1
        0xcc -> :sswitch_2
        0xcd -> :sswitch_3
    .end sparse-switch
.end method

.method public onCreateViewHolder(Landroid/view/ViewGroup;I)Landroid/support/v7/widget/RecyclerView$ViewHolder;
    .locals 4

    .line 97
    const/4 v0, 0x1

    if-ne p2, v0, :cond_0

    .line 98
    new-instance v0, Lo/bhi$d;

    iget-object v1, p0, Lo/bhi;->b:Landroid/view/LayoutInflater;

    sget v2, Lcom/huawei/android/sns/R$layout;->health_group_loading_more:I

    const/4 v3, 0x0

    invoke-virtual {v1, v2, p1, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/bhi$d;-><init>(Landroid/view/View;)V

    return-object v0

    .line 100
    :cond_0
    new-instance v0, Lo/bhi$b;

    iget-object v1, p0, Lo/bhi;->b:Landroid/view/LayoutInflater;

    sget v2, Lcom/huawei/android/sns/R$layout;->item_health_event_member_rank:I

    const/4 v3, 0x0

    invoke-virtual {v1, v2, p1, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/bhi$b;-><init>(Landroid/view/View;)V

    return-object v0
.end method
