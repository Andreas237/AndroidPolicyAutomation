.class public Lo/bii;
.super Landroid/support/v7/widget/RecyclerView$Adapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/bii$d;,
        Lo/bii$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/support/v7/widget/RecyclerView$Adapter<Landroid/support/v7/widget/RecyclerView$ViewHolder;>;"
    }
.end annotation


# instance fields
.field private a:Z

.field private b:D

.field private c:Landroid/content/Context;

.field private d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;>;"
        }
    .end annotation
.end field

.field private e:Landroid/view/LayoutInflater;

.field private f:I

.field private h:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/List;DI)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Ljava/util/List<Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;>;DI)V"
        }
    .end annotation

    .line 53
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView$Adapter;-><init>()V

    .line 43
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/bii;->a:Z

    .line 51
    const/4 v0, 0x0

    iput v0, p0, Lo/bii;->f:I

    .line 54
    iput-object p1, p0, Lo/bii;->c:Landroid/content/Context;

    .line 55
    iput-object p2, p0, Lo/bii;->d:Ljava/util/List;

    .line 56
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    iput-object v0, p0, Lo/bii;->e:Landroid/view/LayoutInflater;

    .line 57
    iput-wide p3, p0, Lo/bii;->b:D

    .line 58
    iput p5, p0, Lo/bii;->h:I

    .line 59
    return-void
.end method

.method private d(DILo/bii$a;Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;)V
    .locals 8

    .line 212
    const-wide/16 v0, 0x0

    cmpl-double v0, p1, v0

    if-lez v0, :cond_5

    .line 214
    iget v0, p0, Lo/bii;->h:I

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 216
    :sswitch_0
    invoke-virtual {p5}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->getBestValue()D

    move-result-wide v0

    const-wide/high16 v2, 0x404e000000000000L    # 60.0

    div-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->round(D)J

    move-result-wide v0

    long-to-double v4, v0

    .line 217
    goto :goto_1

    .line 219
    :sswitch_1
    invoke-virtual {p5}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->getBestValue()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Math;->round(D)J

    move-result-wide v0

    long-to-double v4, v0

    .line 220
    goto :goto_1

    .line 222
    :goto_0
    invoke-virtual {p5}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->getBestValue()D

    move-result-wide v0

    const-wide v2, 0x408f400000000000L    # 1000.0

    div-double v4, v0, v2

    .line 226
    :goto_1
    const/4 v0, 0x0

    if-ne v0, p3, :cond_1

    .line 227
    invoke-static {p4}, Lo/bii$a;->f(Lo/bii$a;)Landroid/widget/TextView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 228
    cmpl-double v0, v4, p1

    if-ltz v0, :cond_0

    .line 229
    invoke-static {p4}, Lo/bii$a;->f(Lo/bii$a;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lo/bii;->c:Landroid/content/Context;

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_group_activity_standard:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_4

    .line 231
    :cond_0
    invoke-static {p4}, Lo/bii$a;->f(Lo/bii$a;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lo/bii;->c:Landroid/content/Context;

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_group_activity_substandard:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_4

    .line 235
    :cond_1
    iget v0, p0, Lo/bii;->h:I

    sparse-switch v0, :sswitch_data_1

    goto :goto_2

    .line 237
    :sswitch_2
    iget-object v0, p0, Lo/bii;->d:Ljava/util/List;

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

    .line 238
    goto :goto_3

    .line 240
    :sswitch_3
    iget-object v0, p0, Lo/bii;->d:Ljava/util/List;

    add-int/lit8 v1, p3, -0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->getBestValue()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Math;->round(D)J

    move-result-wide v0

    long-to-double v6, v0

    .line 241
    goto :goto_3

    .line 243
    :goto_2
    iget-object v0, p0, Lo/bii;->d:Ljava/util/List;

    add-int/lit8 v1, p3, -0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->getBestValue()D

    move-result-wide v0

    const-wide v2, 0x408f400000000000L    # 1000.0

    div-double v6, v0, v2

    .line 247
    :goto_3
    cmpl-double v0, v6, p1

    if-ltz v0, :cond_3

    .line 248
    cmpl-double v0, v4, p1

    if-ltz v0, :cond_2

    .line 249
    invoke-static {p4}, Lo/bii$a;->f(Lo/bii$a;)Landroid/widget/TextView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_4

    .line 251
    :cond_2
    invoke-static {p4}, Lo/bii$a;->f(Lo/bii$a;)Landroid/widget/TextView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 252
    invoke-static {p4}, Lo/bii$a;->f(Lo/bii$a;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lo/bii;->c:Landroid/content/Context;

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_group_activity_substandard:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_4

    .line 255
    :cond_3
    cmpl-double v0, v4, p1

    if-ltz v0, :cond_4

    .line 256
    invoke-static {p4}, Lo/bii$a;->f(Lo/bii$a;)Landroid/widget/TextView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 257
    invoke-static {p4}, Lo/bii$a;->f(Lo/bii$a;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lo/bii;->c:Landroid/content/Context;

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_group_activity_standard:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_4

    .line 259
    :cond_4
    invoke-static {p4}, Lo/bii$a;->f(Lo/bii$a;)Landroid/widget/TextView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 264
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
.method public e(Ljava/util/List;)I
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;>;)I"
        }
    .end annotation

    .line 66
    const/4 v4, 0x0

    .line 67
    if-eqz p1, :cond_1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 68
    const-wide/16 v5, 0x0

    .line 69
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

    .line 70
    iget v0, p0, Lo/bii;->h:I

    packed-switch v0, :pswitch_data_0

    goto :goto_1

    .line 74
    :pswitch_0
    invoke-virtual {v8}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->getBestValue()D

    move-result-wide v0

    const-wide v2, 0x408f400000000000L    # 1000.0

    div-double v5, v0, v2

    .line 75
    goto :goto_1

    .line 77
    :pswitch_1
    invoke-virtual {v8}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->getBestValue()D

    move-result-wide v0

    const-wide/high16 v2, 0x404e000000000000L    # 60.0

    div-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->round(D)J

    move-result-wide v0

    long-to-double v5, v0

    .line 78
    goto :goto_1

    .line 80
    :pswitch_2
    invoke-virtual {v8}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->getBestValue()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Math;->round(D)J

    move-result-wide v0

    long-to-double v5, v0

    .line 81
    .line 85
    :goto_1
    iget-wide v0, p0, Lo/bii;->b:D

    cmpl-double v0, v5, v0

    if-ltz v0, :cond_0

    .line 86
    add-int/lit8 v4, v4, 0x1

    .line 88
    :cond_0
    goto :goto_0

    .line 90
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

.method public e(D)V
    .locals 0

    .line 46
    iput-wide p1, p0, Lo/bii;->b:D

    .line 47
    return-void
.end method

.method public getItemCount()I
    .locals 1

    .line 268
    iget-object v0, p0, Lo/bii;->d:Ljava/util/List;

    if-eqz v0, :cond_0

    .line 269
    iget-object v0, p0, Lo/bii;->d:Ljava/util/List;

    invoke-virtual {p0, v0}, Lo/bii;->e(Ljava/util/List;)I

    move-result v0

    iput v0, p0, Lo/bii;->f:I

    .line 270
    iget-object v0, p0, Lo/bii;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0

    .line 272
    :cond_0
    const/4 v0, 0x0

    iput v0, p0, Lo/bii;->f:I

    .line 273
    const/4 v0, 0x0

    return v0
.end method

.method public getItemViewType(I)I
    .locals 2

    .line 308
    iget-boolean v0, p0, Lo/bii;->a:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/bii;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/16 v1, 0x14

    if-lt v0, v1, :cond_0

    invoke-virtual {p0}, Lo/bii;->getItemCount()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-ne p1, v0, :cond_0

    .line 309
    const/4 v0, 0x1

    return v0

    .line 311
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public onBindViewHolder(Landroid/support/v7/widget/RecyclerView$ViewHolder;I)V
    .locals 13

    .line 103
    invoke-virtual {p0, p2}, Lo/bii;->getItemViewType(I)I

    move-result v0

    if-nez v0, :cond_7

    .line 104
    move-object v6, p1

    check-cast v6, Lo/bii$a;

    .line 105
    iget-object v0, p0, Lo/bii;->d:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;

    .line 106
    const-string v0, "Group_HealthEventMemberRankAdapter"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "====onBindViewHolder"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v7}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 107
    invoke-virtual {v7}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->getGroupRank()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 109
    :pswitch_0
    invoke-static {v6}, Lo/bii$a;->d(Lo/bii$a;)Landroid/widget/TextView;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 110
    invoke-static {v6}, Lo/bii$a;->d(Lo/bii$a;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lo/bii;->c:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$drawable;->icon_order_1:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 111
    goto :goto_1

    .line 113
    :pswitch_1
    invoke-static {v6}, Lo/bii$a;->d(Lo/bii$a;)Landroid/widget/TextView;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 114
    invoke-static {v6}, Lo/bii$a;->d(Lo/bii$a;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lo/bii;->c:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$drawable;->icon_order_2:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 115
    goto :goto_1

    .line 117
    :pswitch_2
    invoke-static {v6}, Lo/bii$a;->d(Lo/bii$a;)Landroid/widget/TextView;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 118
    invoke-static {v6}, Lo/bii$a;->d(Lo/bii$a;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lo/bii;->c:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$drawable;->icon_order_3:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 119
    goto :goto_1

    .line 121
    :goto_0
    invoke-static {v6}, Lo/bii$a;->d(Lo/bii$a;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v7}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->getGroupRank()I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 122
    invoke-static {v6}, Lo/bii$a;->d(Lo/bii$a;)Landroid/widget/TextView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setBackgroundColor(I)V

    .line 125
    :goto_1
    invoke-virtual {v7}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->getHuid()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    const-wide v2, 0x2386f26fc10008L

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    .line 127
    invoke-static {v6}, Lo/bii$a;->b(Lo/bii$a;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lo/bii;->c:Landroid/content/Context;

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

    .line 129
    :cond_0
    invoke-static {v6}, Lo/bii$a;->b(Lo/bii$a;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v7}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->getNickName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 133
    :goto_2
    iget-object v0, p0, Lo/bii;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/bht;->b(Landroid/content/Context;)Lo/bht;

    move-result-object v0

    invoke-virtual {v7}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->getBestValue()D

    move-result-wide v1

    double-to-int v1, v1

    invoke-virtual {v0, v1}, Lo/bht;->b(I)Ljava/lang/String;

    move-result-object v8

    .line 134
    invoke-static {v6}, Lo/bii$a;->e(Lo/bii$a;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 135
    const-string v9, ""

    .line 136
    const-string v0, "Group_HealthEventMemberRankAdapter"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "====activityType="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget v2, p0, Lo/bii;->h:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 137
    iget v0, p0, Lo/bii;->h:I

    const/16 v1, 0x66

    if-ne v0, v1, :cond_1

    .line 138
    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    iput-wide v0, p0, Lo/bii;->b:D

    .line 140
    :cond_1
    iget v0, p0, Lo/bii;->h:I

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_3

    .line 143
    :sswitch_0
    iget-wide v0, p0, Lo/bii;->b:D

    const-wide/16 v2, 0x0

    cmpl-double v0, v0, v2

    if-eqz v0, :cond_2

    .line 144
    invoke-virtual {v7}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->getBestValue()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Math;->round(D)J

    move-result-wide v0

    long-to-double v0, v0

    iget-wide v2, p0, Lo/bii;->b:D

    div-double/2addr v0, v2

    double-to-int v10, v0

    .line 145
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

    .line 146
    invoke-static {v6}, Lo/bii$a;->c(Lo/bii$a;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 147
    goto/16 :goto_4

    .line 148
    :cond_2
    const-string v0, "Group_HealthEventMemberRankAdapter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "refreshSelfEventRank goalValue == 0 "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 149
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

    .line 150
    invoke-static {v6}, Lo/bii$a;->c(Lo/bii$a;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 152
    goto/16 :goto_4

    .line 154
    :sswitch_1
    iget-wide v0, p0, Lo/bii;->b:D

    const-wide/16 v2, 0x0

    cmpl-double v0, v0, v2

    if-eqz v0, :cond_3

    .line 155
    iget-wide v0, p0, Lo/bii;->b:D

    invoke-virtual {v7}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->getBestValue()D

    move-result-wide v2

    const-wide v4, 0x40ac200000000000L    # 3600.0

    div-double/2addr v2, v4

    div-double/2addr v0, v2

    const/4 v2, 0x1

    const/4 v3, 0x2

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v9

    .line 156
    invoke-static {v6}, Lo/bii$a;->c(Lo/bii$a;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_4

    .line 158
    :cond_3
    const-string v0, "Group_HealthEventMemberRankAdapter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "refreshSelfEventRank goalValue == 0 "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 159
    const-string v9, "0"

    .line 160
    invoke-static {v6}, Lo/bii$a;->c(Lo/bii$a;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 162
    goto/16 :goto_4

    .line 164
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

    iget-object v1, p0, Lo/bii;->c:Landroid/content/Context;

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_messagecenter_time_minute_value:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    .line 165
    invoke-static {v6}, Lo/bii$a;->e(Lo/bii$a;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 166
    invoke-static {v6}, Lo/bii$a;->c(Lo/bii$a;)Landroid/widget/TextView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 167
    move-object v0, p0

    iget-wide v1, p0, Lo/bii;->b:D

    move v3, p2

    move-object v4, v6

    move-object v5, v7

    invoke-direct/range {v0 .. v5}, Lo/bii;->d(DILo/bii$a;Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;)V

    .line 168
    goto/16 :goto_4

    .line 170
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

    iget-object v1, p0, Lo/bii;->c:Landroid/content/Context;

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_fitness_data_list_activity_meter_unit:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    .line 171
    invoke-static {v6}, Lo/bii$a;->e(Lo/bii$a;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v11}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 172
    invoke-static {v6}, Lo/bii$a;->c(Lo/bii$a;)Landroid/widget/TextView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 173
    move-object v0, p0

    iget-wide v1, p0, Lo/bii;->b:D

    move v3, p2

    move-object v4, v6

    move-object v5, v7

    invoke-direct/range {v0 .. v5}, Lo/bii;->d(DILo/bii$a;Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;)V

    .line 174
    goto :goto_4

    .line 176
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

    iget-object v1, p0, Lo/bii;->c:Landroid/content/Context;

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_band_data_sport_distance_unit:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    .line 177
    invoke-static {v6}, Lo/bii$a;->e(Lo/bii$a;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v12}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 178
    invoke-static {v6}, Lo/bii$a;->c(Lo/bii$a;)Landroid/widget/TextView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 179
    move-object v0, p0

    iget-wide v1, p0, Lo/bii;->b:D

    move v3, p2

    move-object v4, v6

    move-object v5, v7

    invoke-direct/range {v0 .. v5}, Lo/bii;->d(DILo/bii$a;Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;)V

    .line 184
    :goto_4
    invoke-static {v6}, Lo/bii$a;->a(Lo/bii$a;)Landroid/widget/ImageView;

    move-result-object v0

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lo/bht;->b(Landroid/content/Context;)Lo/bht;

    move-result-object v1

    invoke-virtual {v7}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->getPhotoUrl()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lo/bht;->c(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 185
    iget-object v0, p0, Lo/bii;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-ne v0, p2, :cond_4

    .line 186
    invoke-static {v6}, Lo/bii$a;->h(Lo/bii$a;)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 187
    invoke-static {v6}, Lo/bii$a;->k(Lo/bii$a;)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_5

    .line 189
    :cond_4
    invoke-static {v6}, Lo/bii$a;->h(Lo/bii$a;)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 190
    iget v0, p0, Lo/bii;->f:I

    if-lez v0, :cond_6

    .line 191
    iget v0, p0, Lo/bii;->f:I

    add-int/lit8 v0, v0, -0x1

    if-ne v0, p2, :cond_5

    .line 192
    invoke-static {v6}, Lo/bii$a;->k(Lo/bii$a;)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_5

    .line 194
    :cond_5
    invoke-static {v6}, Lo/bii$a;->k(Lo/bii$a;)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_5

    .line 197
    :cond_6
    invoke-static {v6}, Lo/bii$a;->k(Lo/bii$a;)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 201
    :cond_7
    :goto_5
    return-void

    nop

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

    .line 95
    const/4 v0, 0x1

    if-ne p2, v0, :cond_0

    .line 96
    new-instance v0, Lo/bii$d;

    iget-object v1, p0, Lo/bii;->e:Landroid/view/LayoutInflater;

    sget v2, Lcom/huawei/android/sns/R$layout;->health_group_loading_more:I

    const/4 v3, 0x0

    invoke-virtual {v1, v2, p1, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/bii$d;-><init>(Landroid/view/View;)V

    return-object v0

    .line 98
    :cond_0
    new-instance v0, Lo/bii$a;

    iget-object v1, p0, Lo/bii;->e:Landroid/view/LayoutInflater;

    sget v2, Lcom/huawei/android/sns/R$layout;->item_health_event_member_rank:I

    const/4 v3, 0x0

    invoke-virtual {v1, v2, p1, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/bii$a;-><init>(Landroid/view/View;)V

    return-object v0
.end method
