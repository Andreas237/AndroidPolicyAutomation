.class public Lo/fem;
.super Landroid/widget/LinearLayout;
.source "SourceFile"


# instance fields
.field private a:Landroid/view/LayoutInflater;

.field private b:Landroid/content/Context;

.field private c:Landroid/widget/ImageView;

.field private d:Landroid/widget/TextView;

.field private e:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 35
    invoke-direct {p0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 36
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 4

    .line 39
    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 40
    iput-object p1, p0, Lo/fem;->b:Landroid/content/Context;

    .line 41
    iget-object v0, p0, Lo/fem;->b:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    iput-object v0, p0, Lo/fem;->a:Landroid/view/LayoutInflater;

    .line 42
    iget-object v0, p0, Lo/fem;->a:Landroid/view/LayoutInflater;

    sget v1, Lcom/huawei/ui/main/R$layout;->layout_body_type_card_info:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p0, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v3

    .line 43
    invoke-virtual {p0, v3}, Lo/fem;->addView(Landroid/view/View;)V

    .line 44
    invoke-direct {p0, v3}, Lo/fem;->e(Landroid/view/View;)V

    .line 46
    return-void
.end method

.method private e(Landroid/view/View;)V
    .locals 1

    .line 50
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_body_type_card_tv:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/fem;->e:Landroid/widget/TextView;

    .line 51
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_body_type_card_img:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/fem;->c:Landroid/widget/ImageView;

    .line 52
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_body_type_card_tv_des:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/fem;->d:Landroid/widget/TextView;

    .line 54
    return-void
.end method


# virtual methods
.method public setBodyTypeDatas(IIJJ)V
    .locals 7

    .line 65
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0, p3, p4}, Ljava/util/Date;-><init>(J)V

    const/16 v1, 0x10

    invoke-static {v0, v1}, Lo/cxh;->d(Ljava/util/Date;I)Ljava/lang/String;

    move-result-object v4

    .line 66
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0, p5, p6}, Ljava/util/Date;-><init>(J)V

    const/16 v1, 0x10

    invoke-static {v0, v1}, Lo/cxh;->d(Ljava/util/Date;I)Ljava/lang/String;

    move-result-object v5

    .line 68
    const/4 v0, 0x7

    if-eq p2, v0, :cond_0

    const/4 v0, 0x4

    if-eq p2, v0, :cond_0

    const/16 v0, 0x8

    if-ne p2, v0, :cond_1

    .line 69
    :cond_0
    iget-object v0, p0, Lo/fem;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_weight_body_type_interpretation_negative:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v6

    goto :goto_0

    .line 71
    :cond_1
    iget-object v0, p0, Lo/fem;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_weight_body_type_interpretation_positive:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v6

    .line 73
    :goto_0
    iget-object v0, p0, Lo/fem;->d:Landroid/widget/TextView;

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v4, v1, v2

    const/4 v2, 0x1

    aput-object v5, v1, v2

    iget-object v2, p0, Lo/fem;->b:Landroid/content/Context;

    invoke-static {p1, v2}, Lo/fej;->d(ILandroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/fem;->b:Landroid/content/Context;

    invoke-static {p2, v2}, Lo/fej;->d(ILandroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v6, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 75
    packed-switch p2, :pswitch_data_0

    goto/16 :goto_1

    .line 77
    :pswitch_0
    iget-object v0, p0, Lo/fem;->c:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$mipmap;->ic_body_type_img_01b:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 78
    iget-object v0, p0, Lo/fem;->e:Landroid/widget/TextView;

    iget-object v1, p0, Lo/fem;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_weight_body_type_thin:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 79
    goto/16 :goto_2

    .line 81
    :pswitch_1
    iget-object v0, p0, Lo/fem;->c:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$mipmap;->ic_body_type_img_02b:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 82
    iget-object v0, p0, Lo/fem;->e:Landroid/widget/TextView;

    iget-object v1, p0, Lo/fem;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_weight_body_type_thin_muscle:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 83
    goto/16 :goto_2

    .line 85
    :pswitch_2
    iget-object v0, p0, Lo/fem;->c:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$mipmap;->ic_body_type_img_03b:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 86
    iget-object v0, p0, Lo/fem;->e:Landroid/widget/TextView;

    iget-object v1, p0, Lo/fem;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_weight_body_type_multi_muscle:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 87
    goto/16 :goto_2

    .line 89
    :pswitch_3
    iget-object v0, p0, Lo/fem;->c:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$mipmap;->ic_body_type_img_04b:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 90
    iget-object v0, p0, Lo/fem;->e:Landroid/widget/TextView;

    iget-object v1, p0, Lo/fem;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_weight_body_type_lack_sport:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 91
    goto/16 :goto_2

    .line 93
    :pswitch_4
    iget-object v0, p0, Lo/fem;->c:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$mipmap;->ic_body_type_img_05b:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 94
    iget-object v0, p0, Lo/fem;->e:Landroid/widget/TextView;

    iget-object v1, p0, Lo/fem;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_weight_body_type_stand:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 95
    goto/16 :goto_2

    .line 97
    :pswitch_5
    iget-object v0, p0, Lo/fem;->c:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$mipmap;->ic_body_type_img_06b:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 98
    iget-object v0, p0, Lo/fem;->e:Landroid/widget/TextView;

    iget-object v1, p0, Lo/fem;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_weight_body_type_muscle:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 99
    goto :goto_2

    .line 101
    :pswitch_6
    iget-object v0, p0, Lo/fem;->c:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$mipmap;->ic_body_type_img_07b:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 102
    iget-object v0, p0, Lo/fem;->e:Landroid/widget/TextView;

    iget-object v1, p0, Lo/fem;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_weight_body_type_edema:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 103
    goto :goto_2

    .line 105
    :pswitch_7
    iget-object v0, p0, Lo/fem;->c:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$mipmap;->ic_body_type_img_08b:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 106
    iget-object v0, p0, Lo/fem;->e:Landroid/widget/TextView;

    iget-object v1, p0, Lo/fem;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_weight_body_type_obese:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 107
    goto :goto_2

    .line 109
    :pswitch_8
    iget-object v0, p0, Lo/fem;->c:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$mipmap;->ic_body_type_img_09b:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 110
    iget-object v0, p0, Lo/fem;->e:Landroid/widget/TextView;

    iget-object v1, p0, Lo/fem;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_weight_body_type_fat_and_strong:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 111
    goto :goto_2

    .line 113
    :goto_1
    const-string v0, "BodyTypeCardView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "body type get is wrong..."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 119
    :goto_2
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_7
        :pswitch_8
    .end packed-switch
.end method
