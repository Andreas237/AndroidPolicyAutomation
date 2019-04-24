.class public Lo/ffc;
.super Landroid/widget/LinearLayout;
.source "SourceFile"


# instance fields
.field a:Landroid/widget/LinearLayout;

.field b:Landroid/widget/RelativeLayout$LayoutParams;

.field c:Landroid/widget/RelativeLayout;

.field d:Landroid/widget/LinearLayout;

.field e:Landroid/widget/LinearLayout;

.field f:Landroid/widget/ImageView;

.field g:Landroid/widget/ImageView;

.field h:Landroid/widget/RelativeLayout$LayoutParams;

.field i:Landroid/widget/RelativeLayout$LayoutParams;

.field private k:Lo/ffa;

.field private l:I

.field private m:Lo/ffa;

.field private n:Lo/ffa;

.field private o:I

.field private p:Landroid/content/Context;

.field private q:I

.field private r:I

.field private s:I

.field private t:I

.field private u:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    .line 155
    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 43
    const/16 v0, 0x7b2

    iput v0, p0, Lo/ffc;->l:I

    .line 44
    const/4 v0, 0x1

    iput v0, p0, Lo/ffc;->o:I

    .line 45
    const/4 v0, 0x1

    iput v0, p0, Lo/ffc;->q:I

    .line 47
    const/16 v0, 0x7b2

    iput v0, p0, Lo/ffc;->t:I

    .line 49
    const/4 v0, 0x0

    iput v0, p0, Lo/ffc;->r:I

    .line 50
    const/4 v0, 0x0

    iput v0, p0, Lo/ffc;->s:I

    .line 51
    const/4 v0, 0x0

    iput v0, p0, Lo/ffc;->u:I

    .line 156
    iput-object p1, p0, Lo/ffc;->p:Landroid/content/Context;

    .line 157
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$layout;->health_data_date_picker_layout:I

    invoke-virtual {v0, v1, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 158
    sget v0, Lcom/huawei/ui/main/R$id;->layout:I

    invoke-virtual {p0, v0}, Lo/ffc;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lo/ffc;->c:Landroid/widget/RelativeLayout;

    .line 159
    sget v0, Lcom/huawei/ui/main/R$id;->hw_health_date_picker_year_layout:I

    invoke-virtual {p0, v0}, Lo/ffc;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lo/ffc;->e:Landroid/widget/LinearLayout;

    .line 160
    sget v0, Lcom/huawei/ui/main/R$id;->hw_health_date_picker_month_layout:I

    invoke-virtual {p0, v0}, Lo/ffc;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lo/ffc;->a:Landroid/widget/LinearLayout;

    .line 161
    sget v0, Lcom/huawei/ui/main/R$id;->hw_health_date_picker_day_layout:I

    invoke-virtual {p0, v0}, Lo/ffc;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lo/ffc;->d:Landroid/widget/LinearLayout;

    .line 162
    sget v0, Lcom/huawei/ui/main/R$id;->hw_health_date_picker_year:I

    invoke-virtual {p0, v0}, Lo/ffc;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/ffa;

    iput-object v0, p0, Lo/ffc;->k:Lo/ffa;

    .line 163
    sget v0, Lcom/huawei/ui/main/R$id;->hw_health_date_picker_month:I

    invoke-virtual {p0, v0}, Lo/ffc;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/ffa;

    iput-object v0, p0, Lo/ffc;->m:Lo/ffa;

    .line 164
    sget v0, Lcom/huawei/ui/main/R$id;->hw_health_date_picker_day:I

    invoke-virtual {p0, v0}, Lo/ffc;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/ffa;

    iput-object v0, p0, Lo/ffc;->n:Lo/ffa;

    .line 165
    sget v0, Lcom/huawei/ui/main/R$id;->hw_health_date_picker_img_top:I

    invoke-virtual {p0, v0}, Lo/ffc;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/ffc;->f:Landroid/widget/ImageView;

    .line 166
    sget v0, Lcom/huawei/ui/main/R$id;->hw_health_date_picker_img_bottom:I

    invoke-virtual {p0, v0}, Lo/ffc;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/ffc;->g:Landroid/widget/ImageView;

    .line 167
    iget-object v0, p0, Lo/ffc;->d:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout$LayoutParams;

    iput-object v0, p0, Lo/ffc;->b:Landroid/widget/RelativeLayout$LayoutParams;

    .line 168
    iget-object v0, p0, Lo/ffc;->a:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout$LayoutParams;

    iput-object v0, p0, Lo/ffc;->i:Landroid/widget/RelativeLayout$LayoutParams;

    .line 169
    iget-object v0, p0, Lo/ffc;->e:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout$LayoutParams;

    iput-object v0, p0, Lo/ffc;->h:Landroid/widget/RelativeLayout$LayoutParams;

    .line 170
    invoke-direct {p0}, Lo/ffc;->c()V

    .line 175
    iget-object v0, p0, Lo/ffc;->k:Lo/ffa;

    new-instance v1, Lo/ffc$3;

    invoke-direct {v1, p0}, Lo/ffc$3;-><init>(Lo/ffc;)V

    invoke-virtual {v0, v1}, Lo/ffa;->setOnSelectedListener(Lo/ffa$a;)V

    .line 181
    iget-object v0, p0, Lo/ffc;->m:Lo/ffa;

    new-instance v1, Lo/ffc$5;

    invoke-direct {v1, p0}, Lo/ffc$5;-><init>(Lo/ffc;)V

    invoke-virtual {v0, v1}, Lo/ffa;->setOnSelectedListener(Lo/ffa$a;)V

    .line 187
    iget-object v0, p0, Lo/ffc;->n:Lo/ffa;

    new-instance v1, Lo/ffc$2;

    invoke-direct {v1, p0}, Lo/ffc$2;-><init>(Lo/ffc;)V

    invoke-virtual {v0, v1}, Lo/ffa;->setOnSelectedListener(Lo/ffa$a;)V

    .line 196
    return-void
.end method

.method static synthetic b(Lo/ffc;I)I
    .locals 0

    .line 23
    iput p1, p0, Lo/ffc;->q:I

    return p1
.end method

.method private b(IC)V
    .locals 5

    .line 99
    packed-switch p1, :pswitch_data_0

    goto/16 :goto_0

    .line 101
    :pswitch_0
    const/16 v0, 0x64

    if-ne p2, v0, :cond_0

    .line 102
    iget-object v0, p0, Lo/ffc;->b:Landroid/widget/RelativeLayout$LayoutParams;

    const/16 v1, 0x9

    const/4 v2, -0x1

    invoke-virtual {v0, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 103
    iget-object v0, p0, Lo/ffc;->d:Landroid/widget/LinearLayout;

    iget-object v1, p0, Lo/ffc;->p:Landroid/content/Context;

    const/high16 v2, 0x41800000    # 16.0f

    invoke-static {v1, v2}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/widget/LinearLayout;->setPadding(IIII)V

    .line 104
    iget-object v0, p0, Lo/ffc;->c:Landroid/widget/RelativeLayout;

    iget-object v1, p0, Lo/ffc;->d:Landroid/widget/LinearLayout;

    iget-object v2, p0, Lo/ffc;->b:Landroid/widget/RelativeLayout$LayoutParams;

    invoke-virtual {v0, v1, v2}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    goto/16 :goto_0

    .line 105
    :cond_0
    const/16 v0, 0x4d

    if-ne p2, v0, :cond_1

    .line 106
    iget-object v0, p0, Lo/ffc;->i:Landroid/widget/RelativeLayout$LayoutParams;

    const/16 v1, 0x9

    const/4 v2, -0x1

    invoke-virtual {v0, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 107
    iget-object v0, p0, Lo/ffc;->a:Landroid/widget/LinearLayout;

    iget-object v1, p0, Lo/ffc;->p:Landroid/content/Context;

    const/high16 v2, 0x41800000    # 16.0f

    invoke-static {v1, v2}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/widget/LinearLayout;->setPadding(IIII)V

    .line 108
    iget-object v0, p0, Lo/ffc;->c:Landroid/widget/RelativeLayout;

    iget-object v1, p0, Lo/ffc;->a:Landroid/widget/LinearLayout;

    iget-object v2, p0, Lo/ffc;->i:Landroid/widget/RelativeLayout$LayoutParams;

    invoke-virtual {v0, v1, v2}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    goto/16 :goto_0

    .line 109
    :cond_1
    const/16 v0, 0x79

    if-ne p2, v0, :cond_6

    .line 110
    iget-object v0, p0, Lo/ffc;->h:Landroid/widget/RelativeLayout$LayoutParams;

    const/16 v1, 0x9

    const/4 v2, -0x1

    invoke-virtual {v0, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 111
    iget-object v0, p0, Lo/ffc;->e:Landroid/widget/LinearLayout;

    iget-object v1, p0, Lo/ffc;->p:Landroid/content/Context;

    const/high16 v2, 0x41800000    # 16.0f

    invoke-static {v1, v2}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/widget/LinearLayout;->setPadding(IIII)V

    .line 112
    iget-object v0, p0, Lo/ffc;->c:Landroid/widget/RelativeLayout;

    iget-object v1, p0, Lo/ffc;->e:Landroid/widget/LinearLayout;

    iget-object v2, p0, Lo/ffc;->h:Landroid/widget/RelativeLayout$LayoutParams;

    invoke-virtual {v0, v1, v2}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    goto/16 :goto_0

    .line 116
    :pswitch_1
    const/16 v0, 0x64

    if-ne p2, v0, :cond_2

    .line 117
    iget-object v0, p0, Lo/ffc;->b:Landroid/widget/RelativeLayout$LayoutParams;

    const/16 v1, 0xe

    const/4 v2, -0x1

    invoke-virtual {v0, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 118
    iget-object v0, p0, Lo/ffc;->d:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/widget/LinearLayout;->setPadding(IIII)V

    .line 119
    iget-object v0, p0, Lo/ffc;->c:Landroid/widget/RelativeLayout;

    iget-object v1, p0, Lo/ffc;->d:Landroid/widget/LinearLayout;

    iget-object v2, p0, Lo/ffc;->b:Landroid/widget/RelativeLayout$LayoutParams;

    invoke-virtual {v0, v1, v2}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    goto/16 :goto_0

    .line 120
    :cond_2
    const/16 v0, 0x4d

    if-ne p2, v0, :cond_3

    .line 121
    iget-object v0, p0, Lo/ffc;->i:Landroid/widget/RelativeLayout$LayoutParams;

    const/16 v1, 0xe

    const/4 v2, -0x1

    invoke-virtual {v0, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 122
    iget-object v0, p0, Lo/ffc;->a:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/widget/LinearLayout;->setPadding(IIII)V

    .line 123
    iget-object v0, p0, Lo/ffc;->c:Landroid/widget/RelativeLayout;

    iget-object v1, p0, Lo/ffc;->a:Landroid/widget/LinearLayout;

    iget-object v2, p0, Lo/ffc;->i:Landroid/widget/RelativeLayout$LayoutParams;

    invoke-virtual {v0, v1, v2}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    goto/16 :goto_0

    .line 124
    :cond_3
    const/16 v0, 0x79

    if-ne p2, v0, :cond_6

    .line 125
    iget-object v0, p0, Lo/ffc;->h:Landroid/widget/RelativeLayout$LayoutParams;

    const/16 v1, 0xe

    const/4 v2, -0x1

    invoke-virtual {v0, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 126
    iget-object v0, p0, Lo/ffc;->e:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/widget/LinearLayout;->setPadding(IIII)V

    .line 127
    iget-object v0, p0, Lo/ffc;->c:Landroid/widget/RelativeLayout;

    iget-object v1, p0, Lo/ffc;->e:Landroid/widget/LinearLayout;

    iget-object v2, p0, Lo/ffc;->h:Landroid/widget/RelativeLayout$LayoutParams;

    invoke-virtual {v0, v1, v2}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    goto/16 :goto_0

    .line 131
    :pswitch_2
    const/16 v0, 0x64

    if-ne p2, v0, :cond_4

    .line 132
    iget-object v0, p0, Lo/ffc;->b:Landroid/widget/RelativeLayout$LayoutParams;

    const/16 v1, 0xb

    const/4 v2, -0x1

    invoke-virtual {v0, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 133
    iget-object v0, p0, Lo/ffc;->d:Landroid/widget/LinearLayout;

    iget-object v1, p0, Lo/ffc;->p:Landroid/content/Context;

    const/high16 v2, 0x41800000    # 16.0f

    invoke-static {v1, v2}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual {v0, v2, v3, v1, v4}, Landroid/widget/LinearLayout;->setPadding(IIII)V

    .line 134
    iget-object v0, p0, Lo/ffc;->c:Landroid/widget/RelativeLayout;

    iget-object v1, p0, Lo/ffc;->d:Landroid/widget/LinearLayout;

    iget-object v2, p0, Lo/ffc;->b:Landroid/widget/RelativeLayout$LayoutParams;

    invoke-virtual {v0, v1, v2}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_0

    .line 135
    :cond_4
    const/16 v0, 0x4d

    if-ne p2, v0, :cond_5

    .line 136
    iget-object v0, p0, Lo/ffc;->i:Landroid/widget/RelativeLayout$LayoutParams;

    const/16 v1, 0xb

    const/4 v2, -0x1

    invoke-virtual {v0, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 137
    iget-object v0, p0, Lo/ffc;->a:Landroid/widget/LinearLayout;

    iget-object v1, p0, Lo/ffc;->p:Landroid/content/Context;

    const/high16 v2, 0x41800000    # 16.0f

    invoke-static {v1, v2}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual {v0, v2, v3, v1, v4}, Landroid/widget/LinearLayout;->setPadding(IIII)V

    .line 138
    iget-object v0, p0, Lo/ffc;->c:Landroid/widget/RelativeLayout;

    iget-object v1, p0, Lo/ffc;->a:Landroid/widget/LinearLayout;

    iget-object v2, p0, Lo/ffc;->i:Landroid/widget/RelativeLayout$LayoutParams;

    invoke-virtual {v0, v1, v2}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_0

    .line 139
    :cond_5
    const/16 v0, 0x79

    if-ne p2, v0, :cond_6

    .line 140
    iget-object v0, p0, Lo/ffc;->h:Landroid/widget/RelativeLayout$LayoutParams;

    const/16 v1, 0xb

    const/4 v2, -0x1

    invoke-virtual {v0, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 141
    iget-object v0, p0, Lo/ffc;->e:Landroid/widget/LinearLayout;

    iget-object v1, p0, Lo/ffc;->p:Landroid/content/Context;

    const/high16 v2, 0x41800000    # 16.0f

    invoke-static {v1, v2}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual {v0, v2, v3, v1, v4}, Landroid/widget/LinearLayout;->setPadding(IIII)V

    .line 142
    iget-object v0, p0, Lo/ffc;->c:Landroid/widget/RelativeLayout;

    iget-object v1, p0, Lo/ffc;->e:Landroid/widget/LinearLayout;

    iget-object v2, p0, Lo/ffc;->h:Landroid/widget/RelativeLayout$LayoutParams;

    invoke-virtual {v0, v1, v2}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 148
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

    .line 314
    rem-int/lit8 v0, p1, 0x64

    if-nez v0, :cond_0

    .line 315
    rem-int/lit16 v0, p1, 0x190

    if-nez v0, :cond_1

    .line 316
    const/4 v0, 0x1

    return v0

    .line 319
    :cond_0
    rem-int/lit8 v0, p1, 0x4

    if-nez v0, :cond_1

    .line 320
    const/4 v0, 0x1

    return v0

    .line 323
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method static synthetic c(Lo/ffc;I)I
    .locals 0

    .line 23
    iput p1, p0, Lo/ffc;->u:I

    return p1
.end method

.method private c()V
    .locals 6

    .line 87
    iget-object v0, p0, Lo/ffc;->c:Landroid/widget/RelativeLayout;

    invoke-virtual {v0}, Landroid/widget/RelativeLayout;->removeAllViews()V

    .line 88
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    const-string v1, "yyyyMd"

    invoke-static {v0, v1}, Landroid/text/format/DateFormat;->getBestDateTimePattern(Ljava/util/Locale;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 89
    const-string v0, " "

    const-string v1, ""

    invoke-virtual {v2, v0, v1}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/ffc;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 90
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v4

    .line 91
    const/4 v5, 0x0

    :goto_0
    if-ge v5, v4, :cond_0

    .line 92
    invoke-virtual {v3, v5}, Ljava/lang/String;->charAt(I)C

    move-result v0

    invoke-direct {p0, v5, v0}, Lo/ffc;->b(IC)V

    .line 91
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 94
    :cond_0
    iget-object v0, p0, Lo/ffc;->c:Landroid/widget/RelativeLayout;

    iget-object v1, p0, Lo/ffc;->f:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;)V

    .line 95
    iget-object v0, p0, Lo/ffc;->c:Landroid/widget/RelativeLayout;

    iget-object v1, p0, Lo/ffc;->g:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;)V

    .line 96
    return-void
.end method

.method static synthetic d(Lo/ffc;I)V
    .locals 0

    .line 23
    invoke-direct {p0, p1}, Lo/ffc;->setOnYearSelect(I)V

    return-void
.end method

.method public static e(Ljava/lang/String;)Ljava/lang/String;
    .locals 8

    .line 60
    if-nez p0, :cond_0

    .line 61
    const/4 v0, 0x0

    return-object v0

    .line 62
    :cond_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 63
    const/4 v3, 0x0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v4

    .line 64
    :goto_0
    if-ge v3, v4, :cond_2

    .line 65
    invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C

    move-result v5

    .line 66
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 67
    add-int/lit8 v3, v3, 0x1

    .line 68
    :goto_1
    if-ge v3, v4, :cond_1

    invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C

    move-result v0

    if-ne v0, v5, :cond_1

    .line 69
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 71
    :cond_1
    goto :goto_0

    .line 72
    :cond_2
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v5

    .line 73
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 74
    const/4 v7, 0x0

    :goto_2
    array-length v0, v5

    if-ge v7, v0, :cond_5

    .line 75
    aget-char v0, v5, v7

    const/16 v1, 0x79

    if-eq v0, v1, :cond_3

    aget-char v0, v5, v7

    const/16 v1, 0x4d

    if-eq v0, v1, :cond_3

    aget-char v0, v5, v7

    const/16 v1, 0x64

    if-ne v0, v1, :cond_4

    .line 76
    :cond_3
    aget-char v0, v5, v7

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 74
    :cond_4
    add-int/lit8 v7, v7, 0x1

    goto :goto_2

    .line 79
    :cond_5
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static synthetic e(Lo/ffc;I)V
    .locals 0

    .line 23
    invoke-direct {p0, p1}, Lo/ffc;->setOnMonthSelect(I)V

    return-void
.end method

.method private setOnMonthSelect(I)V
    .locals 3

    .line 203
    add-int/lit8 v0, p1, 0x1

    iput v0, p0, Lo/ffc;->o:I

    .line 204
    iput p1, p0, Lo/ffc;->s:I

    .line 205
    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    .line 206
    iget v0, p0, Lo/ffc;->l:I

    invoke-direct {p0, v0}, Lo/ffc;->b(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 207
    iget-object v0, p0, Lo/ffc;->n:Lo/ffa;

    iget v1, p0, Lo/ffc;->u:I

    const/16 v2, 0x8

    invoke-virtual {v0, v2, v1}, Lo/ffa;->setContentMode(II)V

    goto :goto_0

    .line 209
    :cond_0
    iget-object v0, p0, Lo/ffc;->n:Lo/ffa;

    iget v1, p0, Lo/ffc;->u:I

    const/4 v2, 0x7

    invoke-virtual {v0, v2, v1}, Lo/ffa;->setContentMode(II)V

    goto :goto_0

    .line 211
    :cond_1
    const/4 v0, 0x3

    if-eq p1, v0, :cond_2

    const/4 v0, 0x5

    if-eq p1, v0, :cond_2

    const/16 v0, 0x8

    if-eq p1, v0, :cond_2

    const/16 v0, 0xa

    if-ne p1, v0, :cond_3

    .line 212
    :cond_2
    iget-object v0, p0, Lo/ffc;->n:Lo/ffa;

    iget v1, p0, Lo/ffc;->u:I

    const/16 v2, 0x9

    invoke-virtual {v0, v2, v1}, Lo/ffa;->setContentMode(II)V

    goto :goto_0

    .line 214
    :cond_3
    iget-object v0, p0, Lo/ffc;->n:Lo/ffa;

    iget v1, p0, Lo/ffc;->u:I

    const/4 v2, 0x2

    invoke-virtual {v0, v2, v1}, Lo/ffa;->setContentMode(II)V

    .line 216
    :goto_0
    return-void
.end method

.method private setOnYearSelect(I)V
    .locals 3

    .line 223
    iget v0, p0, Lo/ffc;->t:I

    add-int/2addr v0, p1

    iput v0, p0, Lo/ffc;->l:I

    .line 224
    iput p1, p0, Lo/ffc;->r:I

    .line 225
    iget v0, p0, Lo/ffc;->s:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 226
    iget v0, p0, Lo/ffc;->l:I

    invoke-direct {p0, v0}, Lo/ffc;->b(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 227
    iget-object v0, p0, Lo/ffc;->n:Lo/ffa;

    iget v1, p0, Lo/ffc;->u:I

    const/16 v2, 0x8

    invoke-virtual {v0, v2, v1}, Lo/ffa;->setContentMode(II)V

    goto :goto_0

    .line 229
    :cond_0
    iget-object v0, p0, Lo/ffc;->n:Lo/ffa;

    iget v1, p0, Lo/ffc;->u:I

    const/4 v2, 0x7

    invoke-virtual {v0, v2, v1}, Lo/ffa;->setContentMode(II)V

    goto :goto_0

    .line 231
    :cond_1
    iget v0, p0, Lo/ffc;->s:I

    const/4 v1, 0x3

    if-eq v0, v1, :cond_2

    iget v0, p0, Lo/ffc;->s:I

    const/4 v1, 0x5

    if-eq v0, v1, :cond_2

    iget v0, p0, Lo/ffc;->s:I

    const/16 v1, 0x8

    if-eq v0, v1, :cond_2

    iget v0, p0, Lo/ffc;->s:I

    const/16 v1, 0xa

    if-ne v0, v1, :cond_3

    .line 232
    :cond_2
    iget-object v0, p0, Lo/ffc;->n:Lo/ffa;

    iget v1, p0, Lo/ffc;->u:I

    const/16 v2, 0x9

    invoke-virtual {v0, v2, v1}, Lo/ffa;->setContentMode(II)V

    goto :goto_0

    .line 234
    :cond_3
    iget-object v0, p0, Lo/ffc;->n:Lo/ffa;

    iget v1, p0, Lo/ffc;->u:I

    const/4 v2, 0x2

    invoke-virtual {v0, v2, v1}, Lo/ffa;->setContentMode(II)V

    .line 236
    :goto_0
    return-void
.end method


# virtual methods
.method public getMillsTime()J
    .locals 5

    .line 270
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v2

    .line 271
    iget v0, p0, Lo/ffc;->l:I

    const/4 v1, 0x1

    invoke-virtual {v2, v1, v0}, Ljava/util/Calendar;->set(II)V

    .line 272
    iget v0, p0, Lo/ffc;->o:I

    const/4 v1, 0x2

    invoke-virtual {v2, v1, v0}, Ljava/util/Calendar;->set(II)V

    .line 273
    iget v0, p0, Lo/ffc;->q:I

    const/4 v1, 0x5

    invoke-virtual {v2, v1, v0}, Ljava/util/Calendar;->set(II)V

    .line 274
    invoke-virtual {v2}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v3

    .line 275
    invoke-virtual {v2}, Ljava/util/Calendar;->clear()V

    .line 276
    return-wide v3
.end method

.method public getSelectedDay()I
    .locals 1

    .line 287
    iget v0, p0, Lo/ffc;->q:I

    return v0
.end method

.method public getSelectedMonth()I
    .locals 1

    .line 284
    iget v0, p0, Lo/ffc;->o:I

    return v0
.end method

.method public getSelectedYear()I
    .locals 1

    .line 281
    iget v0, p0, Lo/ffc;->l:I

    return v0
.end method

.method public setSelectedDay(I)V
    .locals 2

    .line 302
    iput p1, p0, Lo/ffc;->q:I

    .line 303
    add-int/lit8 v0, p1, -0x1

    iput v0, p0, Lo/ffc;->u:I

    .line 304
    iget-object v0, p0, Lo/ffc;->n:Lo/ffa;

    iget v1, p0, Lo/ffc;->u:I

    invoke-virtual {v0, v1}, Lo/ffa;->setSelectedPosition(I)V

    .line 305
    return-void
.end method

.method public setSelectedMonth(I)V
    .locals 2

    .line 297
    iput p1, p0, Lo/ffc;->o:I

    .line 298
    add-int/lit8 v0, p1, -0x1

    iput v0, p0, Lo/ffc;->s:I

    .line 299
    iget-object v0, p0, Lo/ffc;->m:Lo/ffa;

    iget v1, p0, Lo/ffc;->s:I

    invoke-virtual {v0, v1}, Lo/ffa;->setSelectedPosition(I)V

    .line 300
    return-void
.end method

.method public setSelectedYear(I)V
    .locals 2

    .line 292
    iget v0, p0, Lo/ffc;->t:I

    sub-int v0, p1, v0

    iput v0, p0, Lo/ffc;->r:I

    .line 293
    iput p1, p0, Lo/ffc;->l:I

    .line 294
    iget-object v0, p0, Lo/ffc;->k:Lo/ffa;

    iget v1, p0, Lo/ffc;->r:I

    invoke-virtual {v0, v1}, Lo/ffa;->setSelectedPosition(I)V

    .line 295
    return-void
.end method

.method public setStartYear(I)V
    .locals 3

    .line 327
    const/16 v0, 0x7b2

    if-ge p1, v0, :cond_0

    .line 328
    const/16 p1, 0x7b2

    .line 330
    :cond_0
    iput p1, p0, Lo/ffc;->l:I

    .line 331
    iput p1, p0, Lo/ffc;->t:I

    .line 332
    iget-object v0, p0, Lo/ffc;->k:Lo/ffa;

    invoke-virtual {v0, p1}, Lo/ffa;->setStartYear(I)V

    .line 333
    iget-object v0, p0, Lo/ffc;->k:Lo/ffa;

    iget v1, p0, Lo/ffc;->r:I

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Lo/ffa;->setContentMode(II)V

    .line 334
    return-void
.end method
