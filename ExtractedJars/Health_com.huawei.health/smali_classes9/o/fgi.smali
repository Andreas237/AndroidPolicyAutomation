.class public Lo/fgi;
.super Landroid/widget/LinearLayout;
.source "SourceFile"


# instance fields
.field a:Landroid/widget/LinearLayout;

.field b:Landroid/widget/LinearLayout;

.field c:Landroid/widget/RelativeLayout;

.field d:Landroid/widget/LinearLayout;

.field e:Landroid/widget/RelativeLayout$LayoutParams;

.field private f:Lo/fgh;

.field g:Landroid/widget/RelativeLayout$LayoutParams;

.field h:Landroid/widget/RelativeLayout$LayoutParams;

.field private i:Lo/fgh;

.field private k:Lo/fgh;

.field private l:I

.field private m:Landroid/content/Context;

.field private n:I

.field private o:I

.field private p:I

.field private r:I

.field private t:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    .line 152
    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 39
    const/16 v0, 0x76c

    iput v0, p0, Lo/fgi;->p:I

    .line 40
    const/4 v0, 0x1

    iput v0, p0, Lo/fgi;->l:I

    .line 41
    const/4 v0, 0x1

    iput v0, p0, Lo/fgi;->o:I

    .line 43
    const/4 v0, 0x0

    iput v0, p0, Lo/fgi;->n:I

    .line 44
    const/4 v0, 0x0

    iput v0, p0, Lo/fgi;->r:I

    .line 45
    const/4 v0, 0x0

    iput v0, p0, Lo/fgi;->t:I

    .line 153
    iput-object p1, p0, Lo/fgi;->m:Landroid/content/Context;

    .line 154
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$layout;->hw_health_date_picker_layout:I

    invoke-virtual {v0, v1, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 155
    sget v0, Lcom/huawei/ui/main/R$id;->layout:I

    invoke-virtual {p0, v0}, Lo/fgi;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lo/fgi;->c:Landroid/widget/RelativeLayout;

    .line 156
    sget v0, Lcom/huawei/ui/main/R$id;->hw_health_date_picker_year_layout:I

    invoke-virtual {p0, v0}, Lo/fgi;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lo/fgi;->b:Landroid/widget/LinearLayout;

    .line 157
    sget v0, Lcom/huawei/ui/main/R$id;->hw_health_date_picker_month_layout:I

    invoke-virtual {p0, v0}, Lo/fgi;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lo/fgi;->a:Landroid/widget/LinearLayout;

    .line 158
    sget v0, Lcom/huawei/ui/main/R$id;->hw_health_date_picker_day_layout:I

    invoke-virtual {p0, v0}, Lo/fgi;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lo/fgi;->d:Landroid/widget/LinearLayout;

    .line 159
    sget v0, Lcom/huawei/ui/main/R$id;->hw_health_date_picker_year:I

    invoke-virtual {p0, v0}, Lo/fgi;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/fgh;

    iput-object v0, p0, Lo/fgi;->k:Lo/fgh;

    .line 160
    sget v0, Lcom/huawei/ui/main/R$id;->hw_health_date_picker_month:I

    invoke-virtual {p0, v0}, Lo/fgi;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/fgh;

    iput-object v0, p0, Lo/fgi;->f:Lo/fgh;

    .line 161
    sget v0, Lcom/huawei/ui/main/R$id;->hw_health_date_picker_day:I

    invoke-virtual {p0, v0}, Lo/fgi;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/fgh;

    iput-object v0, p0, Lo/fgi;->i:Lo/fgh;

    .line 162
    iget-object v0, p0, Lo/fgi;->d:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout$LayoutParams;

    iput-object v0, p0, Lo/fgi;->e:Landroid/widget/RelativeLayout$LayoutParams;

    .line 163
    iget-object v0, p0, Lo/fgi;->a:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout$LayoutParams;

    iput-object v0, p0, Lo/fgi;->h:Landroid/widget/RelativeLayout$LayoutParams;

    .line 164
    iget-object v0, p0, Lo/fgi;->b:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout$LayoutParams;

    iput-object v0, p0, Lo/fgi;->g:Landroid/widget/RelativeLayout$LayoutParams;

    .line 165
    invoke-direct {p0}, Lo/fgi;->b()V

    .line 170
    iget-object v0, p0, Lo/fgi;->k:Lo/fgh;

    new-instance v1, Lo/fgi$1;

    invoke-direct {v1, p0}, Lo/fgi$1;-><init>(Lo/fgi;)V

    invoke-virtual {v0, v1}, Lo/fgh;->setOnSelectedListener(Lo/fgh$d;)V

    .line 176
    iget-object v0, p0, Lo/fgi;->f:Lo/fgh;

    new-instance v1, Lo/fgi$5;

    invoke-direct {v1, p0}, Lo/fgi$5;-><init>(Lo/fgi;)V

    invoke-virtual {v0, v1}, Lo/fgh;->setOnSelectedListener(Lo/fgh$d;)V

    .line 182
    iget-object v0, p0, Lo/fgi;->i:Lo/fgh;

    new-instance v1, Lo/fgi$3;

    invoke-direct {v1, p0}, Lo/fgi$3;-><init>(Lo/fgi;)V

    invoke-virtual {v0, v1}, Lo/fgh;->setOnSelectedListener(Lo/fgh$d;)V

    .line 191
    return-void
.end method

.method private a(IC)V
    .locals 5

    .line 99
    packed-switch p1, :pswitch_data_0

    goto/16 :goto_0

    .line 101
    :pswitch_0
    const/16 v0, 0x64

    if-ne p2, v0, :cond_0

    .line 102
    iget-object v0, p0, Lo/fgi;->e:Landroid/widget/RelativeLayout$LayoutParams;

    const/16 v1, 0x9

    const/4 v2, -0x1

    invoke-virtual {v0, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 103
    iget-object v0, p0, Lo/fgi;->d:Landroid/widget/LinearLayout;

    iget-object v1, p0, Lo/fgi;->m:Landroid/content/Context;

    const/high16 v2, 0x41800000    # 16.0f

    invoke-static {v1, v2}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/widget/LinearLayout;->setPadding(IIII)V

    .line 104
    iget-object v0, p0, Lo/fgi;->c:Landroid/widget/RelativeLayout;

    iget-object v1, p0, Lo/fgi;->d:Landroid/widget/LinearLayout;

    iget-object v2, p0, Lo/fgi;->e:Landroid/widget/RelativeLayout$LayoutParams;

    invoke-virtual {v0, v1, v2}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    goto/16 :goto_0

    .line 105
    :cond_0
    const/16 v0, 0x4d

    if-ne p2, v0, :cond_1

    .line 106
    iget-object v0, p0, Lo/fgi;->h:Landroid/widget/RelativeLayout$LayoutParams;

    const/16 v1, 0x9

    const/4 v2, -0x1

    invoke-virtual {v0, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 107
    iget-object v0, p0, Lo/fgi;->a:Landroid/widget/LinearLayout;

    iget-object v1, p0, Lo/fgi;->m:Landroid/content/Context;

    const/high16 v2, 0x41800000    # 16.0f

    invoke-static {v1, v2}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/widget/LinearLayout;->setPadding(IIII)V

    .line 108
    iget-object v0, p0, Lo/fgi;->c:Landroid/widget/RelativeLayout;

    iget-object v1, p0, Lo/fgi;->a:Landroid/widget/LinearLayout;

    iget-object v2, p0, Lo/fgi;->h:Landroid/widget/RelativeLayout$LayoutParams;

    invoke-virtual {v0, v1, v2}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    goto/16 :goto_0

    .line 109
    :cond_1
    const/16 v0, 0x79

    if-ne p2, v0, :cond_6

    .line 110
    iget-object v0, p0, Lo/fgi;->g:Landroid/widget/RelativeLayout$LayoutParams;

    const/16 v1, 0x9

    const/4 v2, -0x1

    invoke-virtual {v0, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 111
    iget-object v0, p0, Lo/fgi;->b:Landroid/widget/LinearLayout;

    iget-object v1, p0, Lo/fgi;->m:Landroid/content/Context;

    const/high16 v2, 0x41800000    # 16.0f

    invoke-static {v1, v2}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/widget/LinearLayout;->setPadding(IIII)V

    .line 112
    iget-object v0, p0, Lo/fgi;->c:Landroid/widget/RelativeLayout;

    iget-object v1, p0, Lo/fgi;->b:Landroid/widget/LinearLayout;

    iget-object v2, p0, Lo/fgi;->g:Landroid/widget/RelativeLayout$LayoutParams;

    invoke-virtual {v0, v1, v2}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    goto/16 :goto_0

    .line 117
    :pswitch_1
    const/16 v0, 0x64

    if-ne p2, v0, :cond_2

    .line 118
    iget-object v0, p0, Lo/fgi;->e:Landroid/widget/RelativeLayout$LayoutParams;

    const/16 v1, 0xe

    const/4 v2, -0x1

    invoke-virtual {v0, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 119
    iget-object v0, p0, Lo/fgi;->d:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/widget/LinearLayout;->setPadding(IIII)V

    .line 120
    iget-object v0, p0, Lo/fgi;->c:Landroid/widget/RelativeLayout;

    iget-object v1, p0, Lo/fgi;->d:Landroid/widget/LinearLayout;

    iget-object v2, p0, Lo/fgi;->e:Landroid/widget/RelativeLayout$LayoutParams;

    invoke-virtual {v0, v1, v2}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    goto/16 :goto_0

    .line 121
    :cond_2
    const/16 v0, 0x4d

    if-ne p2, v0, :cond_3

    .line 122
    iget-object v0, p0, Lo/fgi;->h:Landroid/widget/RelativeLayout$LayoutParams;

    const/16 v1, 0xe

    const/4 v2, -0x1

    invoke-virtual {v0, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 123
    iget-object v0, p0, Lo/fgi;->a:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/widget/LinearLayout;->setPadding(IIII)V

    .line 124
    iget-object v0, p0, Lo/fgi;->c:Landroid/widget/RelativeLayout;

    iget-object v1, p0, Lo/fgi;->a:Landroid/widget/LinearLayout;

    iget-object v2, p0, Lo/fgi;->h:Landroid/widget/RelativeLayout$LayoutParams;

    invoke-virtual {v0, v1, v2}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    goto/16 :goto_0

    .line 125
    :cond_3
    const/16 v0, 0x79

    if-ne p2, v0, :cond_6

    .line 126
    iget-object v0, p0, Lo/fgi;->g:Landroid/widget/RelativeLayout$LayoutParams;

    const/16 v1, 0xe

    const/4 v2, -0x1

    invoke-virtual {v0, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 127
    iget-object v0, p0, Lo/fgi;->b:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/widget/LinearLayout;->setPadding(IIII)V

    .line 128
    iget-object v0, p0, Lo/fgi;->c:Landroid/widget/RelativeLayout;

    iget-object v1, p0, Lo/fgi;->b:Landroid/widget/LinearLayout;

    iget-object v2, p0, Lo/fgi;->g:Landroid/widget/RelativeLayout$LayoutParams;

    invoke-virtual {v0, v1, v2}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    goto/16 :goto_0

    .line 132
    :pswitch_2
    const/16 v0, 0x64

    if-ne p2, v0, :cond_4

    .line 133
    iget-object v0, p0, Lo/fgi;->e:Landroid/widget/RelativeLayout$LayoutParams;

    const/16 v1, 0xb

    const/4 v2, -0x1

    invoke-virtual {v0, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 134
    iget-object v0, p0, Lo/fgi;->d:Landroid/widget/LinearLayout;

    iget-object v1, p0, Lo/fgi;->m:Landroid/content/Context;

    const/high16 v2, 0x41800000    # 16.0f

    invoke-static {v1, v2}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual {v0, v2, v3, v1, v4}, Landroid/widget/LinearLayout;->setPadding(IIII)V

    .line 135
    iget-object v0, p0, Lo/fgi;->c:Landroid/widget/RelativeLayout;

    iget-object v1, p0, Lo/fgi;->d:Landroid/widget/LinearLayout;

    iget-object v2, p0, Lo/fgi;->e:Landroid/widget/RelativeLayout$LayoutParams;

    invoke-virtual {v0, v1, v2}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_0

    .line 136
    :cond_4
    const/16 v0, 0x4d

    if-ne p2, v0, :cond_5

    .line 137
    iget-object v0, p0, Lo/fgi;->h:Landroid/widget/RelativeLayout$LayoutParams;

    const/16 v1, 0xb

    const/4 v2, -0x1

    invoke-virtual {v0, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 138
    iget-object v0, p0, Lo/fgi;->a:Landroid/widget/LinearLayout;

    iget-object v1, p0, Lo/fgi;->m:Landroid/content/Context;

    const/high16 v2, 0x41800000    # 16.0f

    invoke-static {v1, v2}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual {v0, v2, v3, v1, v4}, Landroid/widget/LinearLayout;->setPadding(IIII)V

    .line 139
    iget-object v0, p0, Lo/fgi;->c:Landroid/widget/RelativeLayout;

    iget-object v1, p0, Lo/fgi;->a:Landroid/widget/LinearLayout;

    iget-object v2, p0, Lo/fgi;->h:Landroid/widget/RelativeLayout$LayoutParams;

    invoke-virtual {v0, v1, v2}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_0

    .line 140
    :cond_5
    const/16 v0, 0x79

    if-ne p2, v0, :cond_6

    .line 141
    iget-object v0, p0, Lo/fgi;->g:Landroid/widget/RelativeLayout$LayoutParams;

    const/16 v1, 0xb

    const/4 v2, -0x1

    invoke-virtual {v0, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 142
    iget-object v0, p0, Lo/fgi;->b:Landroid/widget/LinearLayout;

    iget-object v1, p0, Lo/fgi;->m:Landroid/content/Context;

    const/high16 v2, 0x41800000    # 16.0f

    invoke-static {v1, v2}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual {v0, v2, v3, v1, v4}, Landroid/widget/LinearLayout;->setPadding(IIII)V

    .line 143
    iget-object v0, p0, Lo/fgi;->c:Landroid/widget/RelativeLayout;

    iget-object v1, p0, Lo/fgi;->b:Landroid/widget/LinearLayout;

    iget-object v2, p0, Lo/fgi;->g:Landroid/widget/RelativeLayout$LayoutParams;

    invoke-virtual {v0, v1, v2}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 149
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

.method public static b(Ljava/lang/String;)Ljava/lang/String;
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

.method private b()V
    .locals 9

    .line 75
    iget-object v0, p0, Lo/fgi;->c:Landroid/widget/RelativeLayout;

    invoke-virtual {v0}, Landroid/widget/RelativeLayout;->removeAllViews()V

    .line 76
    iget-object v0, p0, Lo/fgi;->m:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 77
    iget-object v0, p0, Lo/fgi;->g:Landroid/widget/RelativeLayout$LayoutParams;

    const/16 v1, 0x9

    const/4 v2, -0x1

    invoke-virtual {v0, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 78
    iget-object v0, p0, Lo/fgi;->b:Landroid/widget/LinearLayout;

    iget-object v1, p0, Lo/fgi;->m:Landroid/content/Context;

    const/high16 v2, 0x41800000    # 16.0f

    invoke-static {v1, v2}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual {v0, v2, v3, v1, v4}, Landroid/widget/LinearLayout;->setPadding(IIII)V

    .line 79
    iget-object v0, p0, Lo/fgi;->c:Landroid/widget/RelativeLayout;

    iget-object v1, p0, Lo/fgi;->b:Landroid/widget/LinearLayout;

    iget-object v2, p0, Lo/fgi;->g:Landroid/widget/RelativeLayout$LayoutParams;

    invoke-virtual {v0, v1, v2}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 80
    iget-object v0, p0, Lo/fgi;->h:Landroid/widget/RelativeLayout$LayoutParams;

    const/16 v1, 0xe

    const/4 v2, -0x1

    invoke-virtual {v0, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 81
    iget-object v0, p0, Lo/fgi;->a:Landroid/widget/LinearLayout;

    iget-object v1, p0, Lo/fgi;->m:Landroid/content/Context;

    const/high16 v2, 0x41800000    # 16.0f

    invoke-static {v1, v2}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual {v0, v2, v3, v1, v4}, Landroid/widget/LinearLayout;->setPadding(IIII)V

    .line 82
    iget-object v0, p0, Lo/fgi;->c:Landroid/widget/RelativeLayout;

    iget-object v1, p0, Lo/fgi;->a:Landroid/widget/LinearLayout;

    iget-object v2, p0, Lo/fgi;->h:Landroid/widget/RelativeLayout$LayoutParams;

    invoke-virtual {v0, v1, v2}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 83
    iget-object v0, p0, Lo/fgi;->e:Landroid/widget/RelativeLayout$LayoutParams;

    const/16 v1, 0xb

    const/4 v2, -0x1

    invoke-virtual {v0, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 84
    iget-object v0, p0, Lo/fgi;->d:Landroid/widget/LinearLayout;

    iget-object v1, p0, Lo/fgi;->m:Landroid/content/Context;

    const/high16 v2, 0x41800000    # 16.0f

    invoke-static {v1, v2}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual {v0, v2, v3, v1, v4}, Landroid/widget/LinearLayout;->setPadding(IIII)V

    .line 85
    iget-object v0, p0, Lo/fgi;->c:Landroid/widget/RelativeLayout;

    iget-object v1, p0, Lo/fgi;->d:Landroid/widget/LinearLayout;

    iget-object v2, p0, Lo/fgi;->e:Landroid/widget/RelativeLayout$LayoutParams;

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

    invoke-static {v0}, Lo/fgi;->b(Ljava/lang/String;)Ljava/lang/String;

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

    invoke-direct {p0, v8, v0}, Lo/fgi;->a(IC)V

    .line 90
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    .line 96
    :cond_1
    :goto_1
    return-void
.end method

.method static synthetic b(Lo/fgi;I)V
    .locals 0

    .line 24
    invoke-direct {p0, p1}, Lo/fgi;->setOnYearSelect(I)V

    return-void
.end method

.method private b(I)Z
    .locals 1

    .line 306
    rem-int/lit8 v0, p1, 0x64

    if-nez v0, :cond_0

    .line 307
    rem-int/lit16 v0, p1, 0x190

    if-nez v0, :cond_1

    .line 308
    const/4 v0, 0x1

    return v0

    .line 311
    :cond_0
    rem-int/lit8 v0, p1, 0x4

    if-nez v0, :cond_1

    .line 312
    const/4 v0, 0x1

    return v0

    .line 315
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method static synthetic c(Lo/fgi;I)I
    .locals 0

    .line 24
    iput p1, p0, Lo/fgi;->o:I

    return p1
.end method

.method private d()V
    .locals 3

    .line 225
    iget v0, p0, Lo/fgi;->r:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 226
    iget v0, p0, Lo/fgi;->p:I

    invoke-direct {p0, v0}, Lo/fgi;->b(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 228
    iget-object v0, p0, Lo/fgi;->i:Lo/fgh;

    iget v1, p0, Lo/fgi;->t:I

    const/16 v2, 0x8

    invoke-virtual {v0, v2, v1}, Lo/fgh;->setContentMode(II)V

    goto :goto_0

    .line 230
    :cond_0
    iget-object v0, p0, Lo/fgi;->i:Lo/fgh;

    iget v1, p0, Lo/fgi;->t:I

    const/4 v2, 0x7

    invoke-virtual {v0, v2, v1}, Lo/fgh;->setContentMode(II)V

    goto :goto_0

    .line 232
    :cond_1
    iget v0, p0, Lo/fgi;->r:I

    const/4 v1, 0x3

    if-eq v0, v1, :cond_2

    iget v0, p0, Lo/fgi;->r:I

    const/4 v1, 0x5

    if-eq v0, v1, :cond_2

    iget v0, p0, Lo/fgi;->r:I

    const/16 v1, 0x8

    if-eq v0, v1, :cond_2

    iget v0, p0, Lo/fgi;->r:I

    const/16 v1, 0xa

    if-ne v0, v1, :cond_3

    .line 234
    :cond_2
    iget-object v0, p0, Lo/fgi;->i:Lo/fgh;

    iget v1, p0, Lo/fgi;->t:I

    const/16 v2, 0x9

    invoke-virtual {v0, v2, v1}, Lo/fgh;->setContentMode(II)V

    goto :goto_0

    .line 236
    :cond_3
    iget-object v0, p0, Lo/fgi;->i:Lo/fgh;

    iget v1, p0, Lo/fgi;->t:I

    const/4 v2, 0x2

    invoke-virtual {v0, v2, v1}, Lo/fgh;->setContentMode(II)V

    .line 238
    :goto_0
    return-void
.end method

.method static synthetic d(Lo/fgi;I)V
    .locals 0

    .line 24
    invoke-direct {p0, p1}, Lo/fgi;->setOnMonthSelect(I)V

    return-void
.end method

.method static synthetic e(Lo/fgi;I)I
    .locals 0

    .line 24
    iput p1, p0, Lo/fgi;->t:I

    return p1
.end method

.method private setOnMonthSelect(I)V
    .locals 3

    .line 198
    add-int/lit8 v0, p1, 0x1

    iput v0, p0, Lo/fgi;->l:I

    .line 199
    iput p1, p0, Lo/fgi;->r:I

    .line 200
    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    .line 201
    iget v0, p0, Lo/fgi;->p:I

    invoke-direct {p0, v0}, Lo/fgi;->b(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 202
    iget-object v0, p0, Lo/fgi;->i:Lo/fgh;

    iget v1, p0, Lo/fgi;->t:I

    const/16 v2, 0x8

    invoke-virtual {v0, v2, v1}, Lo/fgh;->setContentMode(II)V

    goto :goto_0

    .line 204
    :cond_0
    iget-object v0, p0, Lo/fgi;->i:Lo/fgh;

    iget v1, p0, Lo/fgi;->t:I

    const/4 v2, 0x7

    invoke-virtual {v0, v2, v1}, Lo/fgh;->setContentMode(II)V

    goto :goto_0

    .line 206
    :cond_1
    const/4 v0, 0x3

    if-eq p1, v0, :cond_2

    const/4 v0, 0x5

    if-eq p1, v0, :cond_2

    const/16 v0, 0x8

    if-eq p1, v0, :cond_2

    const/16 v0, 0xa

    if-ne p1, v0, :cond_3

    .line 207
    :cond_2
    iget-object v0, p0, Lo/fgi;->i:Lo/fgh;

    iget v1, p0, Lo/fgi;->t:I

    const/16 v2, 0x9

    invoke-virtual {v0, v2, v1}, Lo/fgh;->setContentMode(II)V

    goto :goto_0

    .line 209
    :cond_3
    iget-object v0, p0, Lo/fgi;->i:Lo/fgh;

    iget v1, p0, Lo/fgi;->t:I

    const/4 v2, 0x2

    invoke-virtual {v0, v2, v1}, Lo/fgh;->setContentMode(II)V

    .line 211
    :goto_0
    return-void
.end method

.method private setOnYearSelect(I)V
    .locals 1

    .line 218
    add-int/lit16 v0, p1, 0x76c

    iput v0, p0, Lo/fgi;->p:I

    .line 219
    iput p1, p0, Lo/fgi;->n:I

    .line 220
    invoke-direct {p0}, Lo/fgi;->d()V

    .line 221
    return-void
.end method


# virtual methods
.method public getMillsTime()J
    .locals 5

    .line 262
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v2

    .line 263
    iget v0, p0, Lo/fgi;->p:I

    const/4 v1, 0x1

    invoke-virtual {v2, v1, v0}, Ljava/util/Calendar;->set(II)V

    .line 264
    iget v0, p0, Lo/fgi;->l:I

    const/4 v1, 0x2

    invoke-virtual {v2, v1, v0}, Ljava/util/Calendar;->set(II)V

    .line 265
    iget v0, p0, Lo/fgi;->o:I

    const/4 v1, 0x5

    invoke-virtual {v2, v1, v0}, Ljava/util/Calendar;->set(II)V

    .line 266
    invoke-virtual {v2}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v3

    .line 267
    invoke-virtual {v2}, Ljava/util/Calendar;->clear()V

    .line 268
    return-wide v3
.end method

.method public getSelectedDay()I
    .locals 1

    .line 279
    iget v0, p0, Lo/fgi;->o:I

    return v0
.end method

.method public getSelectedMonth()I
    .locals 1

    .line 276
    iget v0, p0, Lo/fgi;->l:I

    return v0
.end method

.method public getSelectedYear()I
    .locals 1

    .line 273
    iget v0, p0, Lo/fgi;->p:I

    return v0
.end method

.method public setSelectedDay(I)V
    .locals 2

    .line 294
    iput p1, p0, Lo/fgi;->o:I

    .line 295
    add-int/lit8 v0, p1, -0x1

    iput v0, p0, Lo/fgi;->t:I

    .line 296
    iget-object v0, p0, Lo/fgi;->i:Lo/fgh;

    iget v1, p0, Lo/fgi;->t:I

    invoke-virtual {v0, v1}, Lo/fgh;->setSelectedPosition(I)V

    .line 297
    return-void
.end method

.method public setSelectedMonth(I)V
    .locals 2

    .line 289
    iput p1, p0, Lo/fgi;->l:I

    .line 290
    add-int/lit8 v0, p1, -0x1

    iput v0, p0, Lo/fgi;->r:I

    .line 291
    iget-object v0, p0, Lo/fgi;->f:Lo/fgh;

    iget v1, p0, Lo/fgi;->r:I

    invoke-virtual {v0, v1}, Lo/fgh;->setSelectedPosition(I)V

    .line 292
    return-void
.end method

.method public setSelectedYear(I)V
    .locals 2

    .line 284
    add-int/lit16 v0, p1, -0x76c

    iput v0, p0, Lo/fgi;->n:I

    .line 285
    iput p1, p0, Lo/fgi;->p:I

    .line 286
    iget-object v0, p0, Lo/fgi;->k:Lo/fgh;

    iget v1, p0, Lo/fgi;->n:I

    invoke-virtual {v0, v1}, Lo/fgh;->setSelectedPosition(I)V

    .line 287
    return-void
.end method
