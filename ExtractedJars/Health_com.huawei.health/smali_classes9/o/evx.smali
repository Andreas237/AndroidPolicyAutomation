.class public Lo/evx;
.super Lo/ezk;
.source "SourceFile"


# instance fields
.field private a:Landroid/content/Context;

.field private b:Z

.field private c:Landroid/widget/RelativeLayout;

.field private d:Landroid/widget/TextView;

.field private e:Lo/ewz;

.field private g:Landroid/widget/TextView;

.field private h:Landroid/widget/TextView;

.field private k:Landroid/widget/ImageView;

.field private m:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lo/ezh;Lo/eih$e;)V
    .locals 6

    .line 35
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v5, p3

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v0 .. v5}, Lo/ezk;-><init>(Landroid/content/Context;Lo/ezh;Ljava/lang/String;Ljava/lang/String;Lo/eih$e;)V

    .line 36
    iput-object p1, p0, Lo/evx;->a:Landroid/content/Context;

    .line 37
    return-void
.end method

.method private e(F)V
    .locals 8

    .line 64
    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    move-result v0

    mul-int/lit16 v5, v0, 0x3e8

    .line 65
    iget-object v0, p0, Lo/evx;->a:Landroid/content/Context;

    iget-object v1, p0, Lo/evx;->e:Lo/ewz;

    invoke-static {v0, v5, v1}, Lo/ewx;->e(Landroid/content/Context;ILo/ewz;)Ljava/lang/CharSequence;

    move-result-object v6

    .line 66
    const-string v0, "CalorieConvertedFoodView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " updateComment total"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "     text"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-interface {v6}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 67
    iget-boolean v0, p0, Lo/evx;->b:Z

    if-nez v0, :cond_0

    .line 68
    iget-object v0, p0, Lo/evx;->c:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 69
    iget-object v0, p0, Lo/evx;->h:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 70
    iget-object v0, p0, Lo/evx;->d:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 71
    iget-object v0, p0, Lo/evx;->d:Landroid/widget/TextView;

    invoke-virtual {v0, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_2

    .line 74
    :cond_0
    iget-object v0, p0, Lo/evx;->e:Lo/ewz;

    invoke-virtual {v0}, Lo/ewz;->b()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 76
    :pswitch_0
    sget v7, Lcom/huawei/ui/main/R$drawable;->step_day_ic_egg:I

    .line 77
    goto :goto_1

    .line 79
    :pswitch_1
    sget v7, Lcom/huawei/ui/main/R$drawable;->step_day_ic_icecream:I

    .line 80
    goto :goto_1

    .line 82
    :pswitch_2
    sget v7, Lcom/huawei/ui/main/R$drawable;->step_day_ic_hamburger:I

    .line 83
    goto :goto_1

    .line 85
    :pswitch_3
    sget v7, Lcom/huawei/ui/main/R$drawable;->step_day_drumsticks:I

    .line 86
    goto :goto_1

    .line 88
    :goto_0
    const/4 v7, -0x1

    .line 92
    :goto_1
    if-gez v7, :cond_1

    .line 93
    iget-object v0, p0, Lo/evx;->c:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 94
    iget-object v0, p0, Lo/evx;->d:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 95
    iget-object v0, p0, Lo/evx;->h:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 96
    iget-object v0, p0, Lo/evx;->h:Landroid/widget/TextView;

    invoke-virtual {v0, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_2

    .line 98
    :cond_1
    iget-object v0, p0, Lo/evx;->c:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 99
    iget-object v0, p0, Lo/evx;->d:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 100
    iget-object v0, p0, Lo/evx;->h:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 101
    iget-object v0, p0, Lo/evx;->g:Landroid/widget/TextView;

    invoke-virtual {v0, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 102
    iget-object v0, p0, Lo/evx;->k:Landroid/widget/ImageView;

    invoke-virtual {v0, v7}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 103
    iget-object v0, p0, Lo/evx;->m:Landroid/widget/TextView;

    const-string v1, "X%1d"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v3, p0, Lo/evx;->e:Lo/ewz;

    invoke-virtual {v3}, Lo/ewz;->c()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 107
    :goto_2
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method


# virtual methods
.method protected b(F)V
    .locals 0

    .line 41
    invoke-direct {p0, p1}, Lo/evx;->e(F)V

    .line 42
    return-void
.end method

.method protected b(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 46
    invoke-virtual {p0}, Lo/evx;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$layout;->calorie_converted_food_view:I

    invoke-static {v0, v1, p0}, Lo/evx;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 47
    invoke-virtual {p0}, Lo/evx;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->Q(Landroid/content/Context;)Z

    move-result v0

    iput-boolean v0, p0, Lo/evx;->b:Z

    .line 48
    sget v0, Lcom/huawei/ui/main/R$id;->fitness_detail_average_data_day_comment:I

    invoke-virtual {p0, v0}, Lo/evx;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/evx;->d:Landroid/widget/TextView;

    .line 49
    sget v0, Lcom/huawei/ui/main/R$id;->fitness_detail_day_comment_zh:I

    invoke-virtual {p0, v0}, Lo/evx;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lo/evx;->c:Landroid/widget/RelativeLayout;

    .line 50
    sget v0, Lcom/huawei/ui/main/R$id;->fitness_detail_average_data_day_comment_zh:I

    invoke-virtual {p0, v0}, Lo/evx;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/evx;->g:Landroid/widget/TextView;

    .line 51
    sget v0, Lcom/huawei/ui/main/R$id;->fitness_detail_day_food:I

    invoke-virtual {p0, v0}, Lo/evx;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/evx;->k:Landroid/widget/ImageView;

    .line 52
    sget v0, Lcom/huawei/ui/main/R$id;->fitness_detail_day_food_num:I

    invoke-virtual {p0, v0}, Lo/evx;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/evx;->m:Landroid/widget/TextView;

    .line 53
    sget v0, Lcom/huawei/ui/main/R$id;->fitness_detail_average_data_day_comment_less:I

    invoke-virtual {p0, v0}, Lo/evx;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/evx;->h:Landroid/widget/TextView;

    .line 54
    iget-object v0, p0, Lo/evx;->d:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 55
    new-instance v0, Lo/ewz;

    const/4 v1, -0x1

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lo/ewz;-><init>(IZ)V

    iput-object v0, p0, Lo/evx;->e:Lo/ewz;

    .line 59
    return-void
.end method
