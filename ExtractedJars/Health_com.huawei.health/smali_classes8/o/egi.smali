.class public Lo/egi;
.super Landroid/widget/LinearLayout;
.source "SourceFile"


# instance fields
.field a:Landroid/widget/LinearLayout;

.field b:Landroid/widget/LinearLayout;

.field c:Landroid/widget/RelativeLayout$LayoutParams;

.field d:Landroid/widget/RelativeLayout;

.field e:Landroid/widget/LinearLayout;

.field f:Landroid/widget/ImageView;

.field g:Landroid/widget/RelativeLayout$LayoutParams;

.field private h:Lo/egm;

.field i:Landroid/widget/ImageView;

.field k:Landroid/widget/RelativeLayout$LayoutParams;

.field private l:Landroid/content/Context;

.field private m:Lo/egm;

.field private n:I

.field private o:I

.field private p:Lo/egm;

.field private q:I

.field private r:I

.field private s:I

.field private t:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    .line 153
    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 38
    const/16 v0, 0x76c

    iput v0, p0, Lo/egi;->n:I

    .line 39
    const/4 v0, 0x1

    iput v0, p0, Lo/egi;->o:I

    .line 40
    const/4 v0, 0x1

    iput v0, p0, Lo/egi;->t:I

    .line 42
    const/4 v0, 0x0

    iput v0, p0, Lo/egi;->s:I

    .line 43
    const/4 v0, 0x0

    iput v0, p0, Lo/egi;->q:I

    .line 44
    const/4 v0, 0x0

    iput v0, p0, Lo/egi;->r:I

    .line 154
    iput-object p1, p0, Lo/egi;->l:Landroid/content/Context;

    .line 155
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/ui/commonui/R$layout;->commonui_health_date_picker_layout:I

    invoke-virtual {v0, v1, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 156
    sget v0, Lcom/huawei/ui/commonui/R$id;->layout:I

    invoke-virtual {p0, v0}, Lo/egi;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lo/egi;->d:Landroid/widget/RelativeLayout;

    .line 157
    sget v0, Lcom/huawei/ui/commonui/R$id;->hw_health_date_picker_year_layout:I

    invoke-virtual {p0, v0}, Lo/egi;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lo/egi;->b:Landroid/widget/LinearLayout;

    .line 158
    sget v0, Lcom/huawei/ui/commonui/R$id;->hw_health_date_picker_month_layout:I

    invoke-virtual {p0, v0}, Lo/egi;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lo/egi;->e:Landroid/widget/LinearLayout;

    .line 159
    sget v0, Lcom/huawei/ui/commonui/R$id;->hw_health_date_picker_day_layout:I

    invoke-virtual {p0, v0}, Lo/egi;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lo/egi;->a:Landroid/widget/LinearLayout;

    .line 160
    sget v0, Lcom/huawei/ui/commonui/R$id;->hw_health_date_picker_year:I

    invoke-virtual {p0, v0}, Lo/egi;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egm;

    iput-object v0, p0, Lo/egi;->h:Lo/egm;

    .line 161
    sget v0, Lcom/huawei/ui/commonui/R$id;->hw_health_date_picker_month:I

    invoke-virtual {p0, v0}, Lo/egi;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egm;

    iput-object v0, p0, Lo/egi;->p:Lo/egm;

    .line 162
    sget v0, Lcom/huawei/ui/commonui/R$id;->hw_health_date_picker_day:I

    invoke-virtual {p0, v0}, Lo/egi;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egm;

    iput-object v0, p0, Lo/egi;->m:Lo/egm;

    .line 163
    sget v0, Lcom/huawei/ui/commonui/R$id;->hw_health_date_picker_img_top:I

    invoke-virtual {p0, v0}, Lo/egi;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/egi;->i:Landroid/widget/ImageView;

    .line 164
    sget v0, Lcom/huawei/ui/commonui/R$id;->hw_health_date_picker_img_bottom:I

    invoke-virtual {p0, v0}, Lo/egi;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/egi;->f:Landroid/widget/ImageView;

    .line 165
    iget-object v0, p0, Lo/egi;->a:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout$LayoutParams;

    iput-object v0, p0, Lo/egi;->c:Landroid/widget/RelativeLayout$LayoutParams;

    .line 166
    iget-object v0, p0, Lo/egi;->e:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout$LayoutParams;

    iput-object v0, p0, Lo/egi;->g:Landroid/widget/RelativeLayout$LayoutParams;

    .line 167
    iget-object v0, p0, Lo/egi;->b:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout$LayoutParams;

    iput-object v0, p0, Lo/egi;->k:Landroid/widget/RelativeLayout$LayoutParams;

    .line 168
    invoke-direct {p0}, Lo/egi;->d()V

    .line 173
    iget-object v0, p0, Lo/egi;->h:Lo/egm;

    new-instance v1, Lo/egi$2;

    invoke-direct {v1, p0}, Lo/egi$2;-><init>(Lo/egi;)V

    invoke-virtual {v0, v1}, Lo/egm;->setOnSelectedListener(Lo/egm$e;)V

    .line 179
    iget-object v0, p0, Lo/egi;->p:Lo/egm;

    new-instance v1, Lo/egi$4;

    invoke-direct {v1, p0}, Lo/egi$4;-><init>(Lo/egi;)V

    invoke-virtual {v0, v1}, Lo/egm;->setOnSelectedListener(Lo/egm$e;)V

    .line 185
    iget-object v0, p0, Lo/egi;->m:Lo/egm;

    new-instance v1, Lo/egi$1;

    invoke-direct {v1, p0}, Lo/egi$1;-><init>(Lo/egi;)V

    invoke-virtual {v0, v1}, Lo/egm;->setOnSelectedListener(Lo/egm$e;)V

    .line 194
    return-void
.end method

.method static synthetic b(Lo/egi;I)I
    .locals 0

    .line 23
    iput p1, p0, Lo/egi;->r:I

    return p1
.end method

.method private b()V
    .locals 3

    .line 228
    iget v0, p0, Lo/egi;->q:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 229
    iget v0, p0, Lo/egi;->n:I

    invoke-direct {p0, v0}, Lo/egi;->b(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 231
    iget-object v0, p0, Lo/egi;->m:Lo/egm;

    iget v1, p0, Lo/egi;->r:I

    const/16 v2, 0x8

    invoke-virtual {v0, v2, v1}, Lo/egm;->setContentMode(II)V

    goto :goto_0

    .line 233
    :cond_0
    iget-object v0, p0, Lo/egi;->m:Lo/egm;

    iget v1, p0, Lo/egi;->r:I

    const/4 v2, 0x7

    invoke-virtual {v0, v2, v1}, Lo/egm;->setContentMode(II)V

    goto :goto_0

    .line 235
    :cond_1
    iget v0, p0, Lo/egi;->q:I

    const/4 v1, 0x3

    if-eq v0, v1, :cond_2

    iget v0, p0, Lo/egi;->q:I

    const/4 v1, 0x5

    if-eq v0, v1, :cond_2

    iget v0, p0, Lo/egi;->q:I

    const/16 v1, 0x8

    if-eq v0, v1, :cond_2

    iget v0, p0, Lo/egi;->q:I

    const/16 v1, 0xa

    if-ne v0, v1, :cond_3

    .line 237
    :cond_2
    iget-object v0, p0, Lo/egi;->m:Lo/egm;

    iget v1, p0, Lo/egi;->r:I

    const/16 v2, 0x9

    invoke-virtual {v0, v2, v1}, Lo/egm;->setContentMode(II)V

    goto :goto_0

    .line 239
    :cond_3
    iget-object v0, p0, Lo/egi;->m:Lo/egm;

    iget v1, p0, Lo/egi;->r:I

    const/4 v2, 0x2

    invoke-virtual {v0, v2, v1}, Lo/egm;->setContentMode(II)V

    .line 241
    :goto_0
    return-void
.end method

.method private b(IC)V
    .locals 5

    .line 100
    packed-switch p1, :pswitch_data_0

    goto/16 :goto_0

    .line 102
    :pswitch_0
    const/16 v0, 0x64

    if-ne p2, v0, :cond_0

    .line 103
    iget-object v0, p0, Lo/egi;->c:Landroid/widget/RelativeLayout$LayoutParams;

    const/16 v1, 0x9

    const/4 v2, -0x1

    invoke-virtual {v0, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 104
    iget-object v0, p0, Lo/egi;->a:Landroid/widget/LinearLayout;

    iget-object v1, p0, Lo/egi;->l:Landroid/content/Context;

    const/high16 v2, 0x41800000    # 16.0f

    invoke-static {v1, v2}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/widget/LinearLayout;->setPadding(IIII)V

    .line 105
    iget-object v0, p0, Lo/egi;->d:Landroid/widget/RelativeLayout;

    iget-object v1, p0, Lo/egi;->a:Landroid/widget/LinearLayout;

    iget-object v2, p0, Lo/egi;->c:Landroid/widget/RelativeLayout$LayoutParams;

    invoke-virtual {v0, v1, v2}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    goto/16 :goto_0

    .line 106
    :cond_0
    const/16 v0, 0x4d

    if-ne p2, v0, :cond_1

    .line 107
    iget-object v0, p0, Lo/egi;->g:Landroid/widget/RelativeLayout$LayoutParams;

    const/16 v1, 0x9

    const/4 v2, -0x1

    invoke-virtual {v0, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 108
    iget-object v0, p0, Lo/egi;->e:Landroid/widget/LinearLayout;

    iget-object v1, p0, Lo/egi;->l:Landroid/content/Context;

    const/high16 v2, 0x41800000    # 16.0f

    invoke-static {v1, v2}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/widget/LinearLayout;->setPadding(IIII)V

    .line 109
    iget-object v0, p0, Lo/egi;->d:Landroid/widget/RelativeLayout;

    iget-object v1, p0, Lo/egi;->e:Landroid/widget/LinearLayout;

    iget-object v2, p0, Lo/egi;->g:Landroid/widget/RelativeLayout$LayoutParams;

    invoke-virtual {v0, v1, v2}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    goto/16 :goto_0

    .line 110
    :cond_1
    const/16 v0, 0x79

    if-ne p2, v0, :cond_6

    .line 111
    iget-object v0, p0, Lo/egi;->k:Landroid/widget/RelativeLayout$LayoutParams;

    const/16 v1, 0x9

    const/4 v2, -0x1

    invoke-virtual {v0, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 112
    iget-object v0, p0, Lo/egi;->b:Landroid/widget/LinearLayout;

    iget-object v1, p0, Lo/egi;->l:Landroid/content/Context;

    const/high16 v2, 0x41800000    # 16.0f

    invoke-static {v1, v2}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/widget/LinearLayout;->setPadding(IIII)V

    .line 113
    iget-object v0, p0, Lo/egi;->d:Landroid/widget/RelativeLayout;

    iget-object v1, p0, Lo/egi;->b:Landroid/widget/LinearLayout;

    iget-object v2, p0, Lo/egi;->k:Landroid/widget/RelativeLayout$LayoutParams;

    invoke-virtual {v0, v1, v2}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    goto/16 :goto_0

    .line 118
    :pswitch_1
    const/16 v0, 0x64

    if-ne p2, v0, :cond_2

    .line 119
    iget-object v0, p0, Lo/egi;->c:Landroid/widget/RelativeLayout$LayoutParams;

    const/16 v1, 0xe

    const/4 v2, -0x1

    invoke-virtual {v0, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 120
    iget-object v0, p0, Lo/egi;->a:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/widget/LinearLayout;->setPadding(IIII)V

    .line 121
    iget-object v0, p0, Lo/egi;->d:Landroid/widget/RelativeLayout;

    iget-object v1, p0, Lo/egi;->a:Landroid/widget/LinearLayout;

    iget-object v2, p0, Lo/egi;->c:Landroid/widget/RelativeLayout$LayoutParams;

    invoke-virtual {v0, v1, v2}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    goto/16 :goto_0

    .line 122
    :cond_2
    const/16 v0, 0x4d

    if-ne p2, v0, :cond_3

    .line 123
    iget-object v0, p0, Lo/egi;->g:Landroid/widget/RelativeLayout$LayoutParams;

    const/16 v1, 0xe

    const/4 v2, -0x1

    invoke-virtual {v0, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 124
    iget-object v0, p0, Lo/egi;->e:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/widget/LinearLayout;->setPadding(IIII)V

    .line 125
    iget-object v0, p0, Lo/egi;->d:Landroid/widget/RelativeLayout;

    iget-object v1, p0, Lo/egi;->e:Landroid/widget/LinearLayout;

    iget-object v2, p0, Lo/egi;->g:Landroid/widget/RelativeLayout$LayoutParams;

    invoke-virtual {v0, v1, v2}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    goto/16 :goto_0

    .line 126
    :cond_3
    const/16 v0, 0x79

    if-ne p2, v0, :cond_6

    .line 127
    iget-object v0, p0, Lo/egi;->k:Landroid/widget/RelativeLayout$LayoutParams;

    const/16 v1, 0xe

    const/4 v2, -0x1

    invoke-virtual {v0, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 128
    iget-object v0, p0, Lo/egi;->b:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/widget/LinearLayout;->setPadding(IIII)V

    .line 129
    iget-object v0, p0, Lo/egi;->d:Landroid/widget/RelativeLayout;

    iget-object v1, p0, Lo/egi;->b:Landroid/widget/LinearLayout;

    iget-object v2, p0, Lo/egi;->k:Landroid/widget/RelativeLayout$LayoutParams;

    invoke-virtual {v0, v1, v2}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    goto/16 :goto_0

    .line 133
    :pswitch_2
    const/16 v0, 0x64

    if-ne p2, v0, :cond_4

    .line 134
    iget-object v0, p0, Lo/egi;->c:Landroid/widget/RelativeLayout$LayoutParams;

    const/16 v1, 0xb

    const/4 v2, -0x1

    invoke-virtual {v0, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 135
    iget-object v0, p0, Lo/egi;->a:Landroid/widget/LinearLayout;

    iget-object v1, p0, Lo/egi;->l:Landroid/content/Context;

    const/high16 v2, 0x41800000    # 16.0f

    invoke-static {v1, v2}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual {v0, v2, v3, v1, v4}, Landroid/widget/LinearLayout;->setPadding(IIII)V

    .line 136
    iget-object v0, p0, Lo/egi;->d:Landroid/widget/RelativeLayout;

    iget-object v1, p0, Lo/egi;->a:Landroid/widget/LinearLayout;

    iget-object v2, p0, Lo/egi;->c:Landroid/widget/RelativeLayout$LayoutParams;

    invoke-virtual {v0, v1, v2}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_0

    .line 137
    :cond_4
    const/16 v0, 0x4d

    if-ne p2, v0, :cond_5

    .line 138
    iget-object v0, p0, Lo/egi;->g:Landroid/widget/RelativeLayout$LayoutParams;

    const/16 v1, 0xb

    const/4 v2, -0x1

    invoke-virtual {v0, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 139
    iget-object v0, p0, Lo/egi;->e:Landroid/widget/LinearLayout;

    iget-object v1, p0, Lo/egi;->l:Landroid/content/Context;

    const/high16 v2, 0x41800000    # 16.0f

    invoke-static {v1, v2}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual {v0, v2, v3, v1, v4}, Landroid/widget/LinearLayout;->setPadding(IIII)V

    .line 140
    iget-object v0, p0, Lo/egi;->d:Landroid/widget/RelativeLayout;

    iget-object v1, p0, Lo/egi;->e:Landroid/widget/LinearLayout;

    iget-object v2, p0, Lo/egi;->g:Landroid/widget/RelativeLayout$LayoutParams;

    invoke-virtual {v0, v1, v2}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_0

    .line 141
    :cond_5
    const/16 v0, 0x79

    if-ne p2, v0, :cond_6

    .line 142
    iget-object v0, p0, Lo/egi;->k:Landroid/widget/RelativeLayout$LayoutParams;

    const/16 v1, 0xb

    const/4 v2, -0x1

    invoke-virtual {v0, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 143
    iget-object v0, p0, Lo/egi;->b:Landroid/widget/LinearLayout;

    iget-object v1, p0, Lo/egi;->l:Landroid/content/Context;

    const/high16 v2, 0x41800000    # 16.0f

    invoke-static {v1, v2}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual {v0, v2, v3, v1, v4}, Landroid/widget/LinearLayout;->setPadding(IIII)V

    .line 144
    iget-object v0, p0, Lo/egi;->d:Landroid/widget/RelativeLayout;

    iget-object v1, p0, Lo/egi;->b:Landroid/widget/LinearLayout;

    iget-object v2, p0, Lo/egi;->k:Landroid/widget/RelativeLayout$LayoutParams;

    invoke-virtual {v0, v1, v2}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 150
    :cond_6
    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method private b(I)Z
    .locals 1

    .line 309
    rem-int/lit8 v0, p1, 0x64

    if-nez v0, :cond_0

    .line 310
    rem-int/lit16 v0, p1, 0x190

    if-nez v0, :cond_1

    .line 311
    const/4 v0, 0x1

    return v0

    .line 314
    :cond_0
    rem-int/lit8 v0, p1, 0x4

    if-nez v0, :cond_1

    .line 315
    const/4 v0, 0x1

    return v0

    .line 318
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method static synthetic c(Lo/egi;I)I
    .locals 0

    .line 23
    iput p1, p0, Lo/egi;->t:I

    return p1
.end method

.method public static c(Ljava/lang/String;)Ljava/lang/String;
    .locals 8

    .line 51
    if-nez p0, :cond_0

    .line 52
    const/4 v0, 0x0

    return-object v0

    .line 53
    :cond_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 54
    const/4 v3, 0x0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v4

    .line 55
    :goto_0
    if-ge v3, v4, :cond_2

    .line 56
    invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C

    move-result v5

    .line 57
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 58
    add-int/lit8 v3, v3, 0x1

    .line 59
    :goto_1
    if-ge v3, v4, :cond_1

    invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C

    move-result v0

    if-ne v0, v5, :cond_1

    .line 60
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 62
    :cond_1
    goto :goto_0

    .line 63
    :cond_2
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v5

    .line 64
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 65
    const/4 v7, 0x0

    :goto_2
    array-length v0, v5

    if-ge v7, v0, :cond_5

    .line 66
    aget-char v0, v5, v7

    const/16 v1, 0x79

    if-eq v0, v1, :cond_3

    aget-char v0, v5, v7

    const/16 v1, 0x4d

    if-eq v0, v1, :cond_3

    aget-char v0, v5, v7

    const/16 v1, 0x64

    if-ne v0, v1, :cond_4

    .line 67
    :cond_3
    aget-char v0, v5, v7

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 65
    :cond_4
    add-int/lit8 v7, v7, 0x1

    goto :goto_2

    .line 70
    :cond_5
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private d()V
    .locals 9

    .line 75
    iget-object v0, p0, Lo/egi;->d:Landroid/widget/RelativeLayout;

    invoke-virtual {v0}, Landroid/widget/RelativeLayout;->removeAllViews()V

    .line 76
    iget-object v0, p0, Lo/egi;->l:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 77
    iget-object v0, p0, Lo/egi;->k:Landroid/widget/RelativeLayout$LayoutParams;

    const/16 v1, 0x9

    const/4 v2, -0x1

    invoke-virtual {v0, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 78
    iget-object v0, p0, Lo/egi;->b:Landroid/widget/LinearLayout;

    iget-object v1, p0, Lo/egi;->l:Landroid/content/Context;

    const/high16 v2, 0x41800000    # 16.0f

    invoke-static {v1, v2}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual {v0, v2, v3, v1, v4}, Landroid/widget/LinearLayout;->setPadding(IIII)V

    .line 79
    iget-object v0, p0, Lo/egi;->d:Landroid/widget/RelativeLayout;

    iget-object v1, p0, Lo/egi;->b:Landroid/widget/LinearLayout;

    iget-object v2, p0, Lo/egi;->k:Landroid/widget/RelativeLayout$LayoutParams;

    invoke-virtual {v0, v1, v2}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 80
    iget-object v0, p0, Lo/egi;->g:Landroid/widget/RelativeLayout$LayoutParams;

    const/16 v1, 0xe

    const/4 v2, -0x1

    invoke-virtual {v0, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 81
    iget-object v0, p0, Lo/egi;->e:Landroid/widget/LinearLayout;

    iget-object v1, p0, Lo/egi;->l:Landroid/content/Context;

    const/high16 v2, 0x41800000    # 16.0f

    invoke-static {v1, v2}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual {v0, v2, v3, v1, v4}, Landroid/widget/LinearLayout;->setPadding(IIII)V

    .line 82
    iget-object v0, p0, Lo/egi;->d:Landroid/widget/RelativeLayout;

    iget-object v1, p0, Lo/egi;->e:Landroid/widget/LinearLayout;

    iget-object v2, p0, Lo/egi;->g:Landroid/widget/RelativeLayout$LayoutParams;

    invoke-virtual {v0, v1, v2}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 83
    iget-object v0, p0, Lo/egi;->c:Landroid/widget/RelativeLayout$LayoutParams;

    const/16 v1, 0xb

    const/4 v2, -0x1

    invoke-virtual {v0, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 84
    iget-object v0, p0, Lo/egi;->a:Landroid/widget/LinearLayout;

    iget-object v1, p0, Lo/egi;->l:Landroid/content/Context;

    const/high16 v2, 0x41800000    # 16.0f

    invoke-static {v1, v2}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual {v0, v2, v3, v1, v4}, Landroid/widget/LinearLayout;->setPadding(IIII)V

    .line 85
    iget-object v0, p0, Lo/egi;->d:Landroid/widget/RelativeLayout;

    iget-object v1, p0, Lo/egi;->a:Landroid/widget/LinearLayout;

    iget-object v2, p0, Lo/egi;->c:Landroid/widget/RelativeLayout$LayoutParams;

    invoke-virtual {v0, v1, v2}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_1

    .line 87
    :cond_0
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    const-string v1, "yyyyMd"

    invoke-static {v0, v1}, Landroid/text/format/DateFormat;->getBestDateTimePattern(Ljava/util/Locale;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 88
    const-string v0, " "

    const-string v1, ""

    invoke-virtual {v5, v0, v1}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/egi;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 89
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v7

    .line 90
    const/4 v8, 0x0

    :goto_0
    if-ge v8, v7, :cond_1

    .line 91
    invoke-virtual {v6, v8}, Ljava/lang/String;->charAt(I)C

    move-result v0

    invoke-direct {p0, v8, v0}, Lo/egi;->b(IC)V

    .line 90
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    .line 94
    :cond_1
    :goto_1
    iget-object v0, p0, Lo/egi;->d:Landroid/widget/RelativeLayout;

    iget-object v1, p0, Lo/egi;->i:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;)V

    .line 95
    iget-object v0, p0, Lo/egi;->d:Landroid/widget/RelativeLayout;

    iget-object v1, p0, Lo/egi;->f:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;)V

    .line 97
    return-void
.end method

.method static synthetic d(Lo/egi;I)V
    .locals 0

    .line 23
    invoke-direct {p0, p1}, Lo/egi;->setOnYearSelect(I)V

    return-void
.end method

.method static synthetic e(Lo/egi;I)V
    .locals 0

    .line 23
    invoke-direct {p0, p1}, Lo/egi;->setOnMonthSelect(I)V

    return-void
.end method

.method private setOnMonthSelect(I)V
    .locals 3

    .line 201
    add-int/lit8 v0, p1, 0x1

    iput v0, p0, Lo/egi;->o:I

    .line 202
    iput p1, p0, Lo/egi;->q:I

    .line 203
    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    .line 204
    iget v0, p0, Lo/egi;->n:I

    invoke-direct {p0, v0}, Lo/egi;->b(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 205
    iget-object v0, p0, Lo/egi;->m:Lo/egm;

    iget v1, p0, Lo/egi;->r:I

    const/16 v2, 0x8

    invoke-virtual {v0, v2, v1}, Lo/egm;->setContentMode(II)V

    goto :goto_0

    .line 207
    :cond_0
    iget-object v0, p0, Lo/egi;->m:Lo/egm;

    iget v1, p0, Lo/egi;->r:I

    const/4 v2, 0x7

    invoke-virtual {v0, v2, v1}, Lo/egm;->setContentMode(II)V

    goto :goto_0

    .line 209
    :cond_1
    const/4 v0, 0x3

    if-eq p1, v0, :cond_2

    const/4 v0, 0x5

    if-eq p1, v0, :cond_2

    const/16 v0, 0x8

    if-eq p1, v0, :cond_2

    const/16 v0, 0xa

    if-ne p1, v0, :cond_3

    .line 210
    :cond_2
    iget-object v0, p0, Lo/egi;->m:Lo/egm;

    iget v1, p0, Lo/egi;->r:I

    const/16 v2, 0x9

    invoke-virtual {v0, v2, v1}, Lo/egm;->setContentMode(II)V

    goto :goto_0

    .line 212
    :cond_3
    iget-object v0, p0, Lo/egi;->m:Lo/egm;

    iget v1, p0, Lo/egi;->r:I

    const/4 v2, 0x2

    invoke-virtual {v0, v2, v1}, Lo/egm;->setContentMode(II)V

    .line 214
    :goto_0
    return-void
.end method

.method private setOnYearSelect(I)V
    .locals 1

    .line 221
    add-int/lit16 v0, p1, 0x76c

    iput v0, p0, Lo/egi;->n:I

    .line 222
    iput p1, p0, Lo/egi;->s:I

    .line 223
    invoke-direct {p0}, Lo/egi;->b()V

    .line 224
    return-void
.end method


# virtual methods
.method public getMillsTime()J
    .locals 5

    .line 265
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v2

    .line 266
    iget v0, p0, Lo/egi;->n:I

    const/4 v1, 0x1

    invoke-virtual {v2, v1, v0}, Ljava/util/Calendar;->set(II)V

    .line 267
    iget v0, p0, Lo/egi;->o:I

    const/4 v1, 0x2

    invoke-virtual {v2, v1, v0}, Ljava/util/Calendar;->set(II)V

    .line 268
    iget v0, p0, Lo/egi;->t:I

    const/4 v1, 0x5

    invoke-virtual {v2, v1, v0}, Ljava/util/Calendar;->set(II)V

    .line 269
    invoke-virtual {v2}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v3

    .line 270
    invoke-virtual {v2}, Ljava/util/Calendar;->clear()V

    .line 271
    return-wide v3
.end method

.method public getSelectedDay()I
    .locals 1

    .line 282
    iget v0, p0, Lo/egi;->t:I

    return v0
.end method

.method public getSelectedMonth()I
    .locals 1

    .line 279
    iget v0, p0, Lo/egi;->o:I

    return v0
.end method

.method public getSelectedYear()I
    .locals 1

    .line 276
    iget v0, p0, Lo/egi;->n:I

    return v0
.end method

.method public setSelectedDay(I)V
    .locals 2

    .line 297
    iput p1, p0, Lo/egi;->t:I

    .line 298
    add-int/lit8 v0, p1, -0x1

    iput v0, p0, Lo/egi;->r:I

    .line 299
    iget-object v0, p0, Lo/egi;->m:Lo/egm;

    iget v1, p0, Lo/egi;->r:I

    invoke-virtual {v0, v1}, Lo/egm;->setSelectedPosition(I)V

    .line 300
    return-void
.end method

.method public setSelectedMonth(I)V
    .locals 2

    .line 292
    iput p1, p0, Lo/egi;->o:I

    .line 293
    add-int/lit8 v0, p1, -0x1

    iput v0, p0, Lo/egi;->q:I

    .line 294
    iget-object v0, p0, Lo/egi;->p:Lo/egm;

    iget v1, p0, Lo/egi;->q:I

    invoke-virtual {v0, v1}, Lo/egm;->setSelectedPosition(I)V

    .line 295
    return-void
.end method

.method public setSelectedYear(I)V
    .locals 2

    .line 287
    add-int/lit16 v0, p1, -0x76c

    iput v0, p0, Lo/egi;->s:I

    .line 288
    iput p1, p0, Lo/egi;->n:I

    .line 289
    iget-object v0, p0, Lo/egi;->h:Lo/egm;

    iget v1, p0, Lo/egi;->s:I

    invoke-virtual {v0, v1}, Lo/egm;->setSelectedPosition(I)V

    .line 290
    return-void
.end method
