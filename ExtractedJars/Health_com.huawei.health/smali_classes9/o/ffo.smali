.class public Lo/ffo;
.super Landroid/widget/LinearLayout;
.source "SourceFile"


# instance fields
.field a:Landroid/widget/RelativeLayout;

.field b:Landroid/widget/LinearLayout;

.field c:Landroid/widget/LinearLayout;

.field d:Landroid/widget/LinearLayout;

.field e:Landroid/widget/RelativeLayout$LayoutParams;

.field f:Landroid/widget/RelativeLayout$LayoutParams;

.field private g:Lo/ffa;

.field h:Landroid/widget/ImageView;

.field i:Landroid/widget/ImageView;

.field k:Landroid/widget/RelativeLayout$LayoutParams;

.field private l:I

.field private m:Landroid/content/Context;

.field private n:Lo/ffa;

.field private o:Lo/ffa;

.field private p:I

.field private q:I

.field private r:I

.field private s:I

.field private t:I

.field private u:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    .line 153
    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 31
    const/16 v0, 0x7b2

    iput v0, p0, Lo/ffo;->l:I

    .line 32
    const/4 v0, 0x1

    iput v0, p0, Lo/ffo;->p:I

    .line 33
    const/4 v0, 0x1

    iput v0, p0, Lo/ffo;->r:I

    .line 34
    const/16 v0, 0x7b2

    iput v0, p0, Lo/ffo;->t:I

    .line 35
    const/4 v0, 0x0

    iput v0, p0, Lo/ffo;->s:I

    .line 36
    const/4 v0, 0x0

    iput v0, p0, Lo/ffo;->u:I

    .line 37
    const/4 v0, 0x0

    iput v0, p0, Lo/ffo;->q:I

    .line 154
    iput-object p1, p0, Lo/ffo;->m:Landroid/content/Context;

    .line 155
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$layout;->track_data_date_picker_layout:I

    invoke-virtual {v0, v1, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 156
    sget v0, Lcom/huawei/ui/main/R$id;->layout:I

    invoke-virtual {p0, v0}, Lo/ffo;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lo/ffo;->a:Landroid/widget/RelativeLayout;

    .line 157
    sget v0, Lcom/huawei/ui/main/R$id;->track_date_picker_year_layout:I

    invoke-virtual {p0, v0}, Lo/ffo;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lo/ffo;->b:Landroid/widget/LinearLayout;

    .line 158
    sget v0, Lcom/huawei/ui/main/R$id;->track_date_picker_month_layout:I

    invoke-virtual {p0, v0}, Lo/ffo;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lo/ffo;->c:Landroid/widget/LinearLayout;

    .line 159
    sget v0, Lcom/huawei/ui/main/R$id;->track_date_picker_day_layout:I

    invoke-virtual {p0, v0}, Lo/ffo;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lo/ffo;->d:Landroid/widget/LinearLayout;

    .line 160
    sget v0, Lcom/huawei/ui/main/R$id;->track_date_picker_year:I

    invoke-virtual {p0, v0}, Lo/ffo;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/ffa;

    iput-object v0, p0, Lo/ffo;->g:Lo/ffa;

    .line 161
    sget v0, Lcom/huawei/ui/main/R$id;->track_date_picker_month:I

    invoke-virtual {p0, v0}, Lo/ffo;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/ffa;

    iput-object v0, p0, Lo/ffo;->n:Lo/ffa;

    .line 162
    sget v0, Lcom/huawei/ui/main/R$id;->track_date_picker_day:I

    invoke-virtual {p0, v0}, Lo/ffo;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/ffa;

    iput-object v0, p0, Lo/ffo;->o:Lo/ffa;

    .line 163
    sget v0, Lcom/huawei/ui/main/R$id;->track_date_picker_img_top:I

    invoke-virtual {p0, v0}, Lo/ffo;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/ffo;->i:Landroid/widget/ImageView;

    .line 164
    sget v0, Lcom/huawei/ui/main/R$id;->track_date_picker_img_bottom:I

    invoke-virtual {p0, v0}, Lo/ffo;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/ffo;->h:Landroid/widget/ImageView;

    .line 165
    iget-object v0, p0, Lo/ffo;->d:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout$LayoutParams;

    iput-object v0, p0, Lo/ffo;->e:Landroid/widget/RelativeLayout$LayoutParams;

    .line 166
    iget-object v0, p0, Lo/ffo;->c:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout$LayoutParams;

    iput-object v0, p0, Lo/ffo;->k:Landroid/widget/RelativeLayout$LayoutParams;

    .line 167
    iget-object v0, p0, Lo/ffo;->b:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout$LayoutParams;

    iput-object v0, p0, Lo/ffo;->f:Landroid/widget/RelativeLayout$LayoutParams;

    .line 168
    invoke-direct {p0}, Lo/ffo;->e()V

    .line 169
    iget-object v0, p0, Lo/ffo;->g:Lo/ffa;

    new-instance v1, Lo/ffo$5;

    invoke-direct {v1, p0}, Lo/ffo$5;-><init>(Lo/ffo;)V

    invoke-virtual {v0, v1}, Lo/ffa;->setOnSelectedListener(Lo/ffa$a;)V

    .line 175
    iget-object v0, p0, Lo/ffo;->n:Lo/ffa;

    new-instance v1, Lo/ffo$4;

    invoke-direct {v1, p0}, Lo/ffo$4;-><init>(Lo/ffo;)V

    invoke-virtual {v0, v1}, Lo/ffa;->setOnSelectedListener(Lo/ffa$a;)V

    .line 181
    iget-object v0, p0, Lo/ffo;->o:Lo/ffa;

    new-instance v1, Lo/ffo$1;

    invoke-direct {v1, p0}, Lo/ffo$1;-><init>(Lo/ffo;)V

    invoke-virtual {v0, v1}, Lo/ffa;->setOnSelectedListener(Lo/ffa$a;)V

    .line 190
    return-void
.end method

.method static synthetic a(Lo/ffo;I)V
    .locals 0

    .line 18
    invoke-direct {p0, p1}, Lo/ffo;->setOnYearSelect(I)V

    return-void
.end method

.method public static b(Ljava/lang/String;)Ljava/lang/String;
    .locals 8

    .line 45
    if-nez p0, :cond_0

    .line 46
    const/4 v0, 0x0

    return-object v0

    .line 47
    :cond_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 49
    const/4 v3, 0x0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v4

    .line 50
    :goto_0
    if-ge v3, v4, :cond_2

    .line 51
    invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C

    move-result v5

    .line 52
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 53
    add-int/lit8 v3, v3, 0x1

    .line 55
    :goto_1
    if-ge v3, v4, :cond_1

    invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C

    move-result v0

    if-ne v0, v5, :cond_1

    .line 56
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 58
    :cond_1
    goto :goto_0

    .line 59
    :cond_2
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v5

    .line 60
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 62
    const/4 v7, 0x0

    :goto_2
    array-length v0, v5

    if-ge v7, v0, :cond_5

    .line 63
    aget-char v0, v5, v7

    const/16 v1, 0x79

    if-eq v0, v1, :cond_3

    aget-char v0, v5, v7

    const/16 v1, 0x4d

    if-eq v0, v1, :cond_3

    aget-char v0, v5, v7

    const/16 v1, 0x64

    if-ne v0, v1, :cond_4

    .line 64
    :cond_3
    aget-char v0, v5, v7

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 62
    :cond_4
    add-int/lit8 v7, v7, 0x1

    goto :goto_2

    .line 68
    :cond_5
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static synthetic b(Lo/ffo;I)V
    .locals 0

    .line 18
    invoke-direct {p0, p1}, Lo/ffo;->setOnMonthSelect(I)V

    return-void
.end method

.method private b(I)Z
    .locals 1

    .line 282
    rem-int/lit8 v0, p1, 0x64

    if-nez v0, :cond_0

    .line 283
    rem-int/lit16 v0, p1, 0x190

    if-nez v0, :cond_1

    .line 285
    const/4 v0, 0x1

    return v0

    .line 288
    :cond_0
    rem-int/lit8 v0, p1, 0x4

    if-nez v0, :cond_1

    .line 290
    const/4 v0, 0x1

    return v0

    .line 293
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method static synthetic c(Lo/ffo;I)I
    .locals 0

    .line 18
    iput p1, p0, Lo/ffo;->r:I

    return p1
.end method

.method static synthetic d(Lo/ffo;I)I
    .locals 0

    .line 18
    iput p1, p0, Lo/ffo;->q:I

    return p1
.end method

.method private e()V
    .locals 6

    .line 77
    iget-object v0, p0, Lo/ffo;->a:Landroid/widget/RelativeLayout;

    invoke-virtual {v0}, Landroid/widget/RelativeLayout;->removeAllViews()V

    .line 78
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    const-string v1, "yyyyMd"

    invoke-static {v0, v1}, Landroid/text/format/DateFormat;->getBestDateTimePattern(Ljava/util/Locale;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 79
    const-string v0, " "

    const-string v1, ""

    invoke-virtual {v2, v0, v1}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/ffo;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 80
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v4

    .line 81
    const/4 v5, 0x0

    :goto_0
    if-ge v5, v4, :cond_0

    .line 82
    invoke-virtual {v3, v5}, Ljava/lang/String;->charAt(I)C

    move-result v0

    invoke-direct {p0, v5, v0}, Lo/ffo;->e(IC)V

    .line 81
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 85
    :cond_0
    iget-object v0, p0, Lo/ffo;->a:Landroid/widget/RelativeLayout;

    iget-object v1, p0, Lo/ffo;->i:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;)V

    .line 86
    iget-object v0, p0, Lo/ffo;->a:Landroid/widget/RelativeLayout;

    iget-object v1, p0, Lo/ffo;->h:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;)V

    .line 87
    return-void
.end method

.method private e(IC)V
    .locals 5

    .line 90
    packed-switch p1, :pswitch_data_0

    goto/16 :goto_0

    .line 92
    :pswitch_0
    const/16 v0, 0x64

    if-ne p2, v0, :cond_0

    .line 93
    iget-object v0, p0, Lo/ffo;->e:Landroid/widget/RelativeLayout$LayoutParams;

    const/16 v1, 0x9

    const/4 v2, -0x1

    invoke-virtual {v0, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 94
    iget-object v0, p0, Lo/ffo;->d:Landroid/widget/LinearLayout;

    iget-object v1, p0, Lo/ffo;->m:Landroid/content/Context;

    const/high16 v2, 0x41800000    # 16.0f

    invoke-static {v1, v2}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/widget/LinearLayout;->setPadding(IIII)V

    .line 95
    iget-object v0, p0, Lo/ffo;->a:Landroid/widget/RelativeLayout;

    iget-object v1, p0, Lo/ffo;->d:Landroid/widget/LinearLayout;

    iget-object v2, p0, Lo/ffo;->e:Landroid/widget/RelativeLayout$LayoutParams;

    invoke-virtual {v0, v1, v2}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    goto/16 :goto_0

    .line 97
    :cond_0
    const/16 v0, 0x4d

    if-ne p2, v0, :cond_1

    .line 98
    iget-object v0, p0, Lo/ffo;->k:Landroid/widget/RelativeLayout$LayoutParams;

    const/16 v1, 0x9

    const/4 v2, -0x1

    invoke-virtual {v0, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 99
    iget-object v0, p0, Lo/ffo;->c:Landroid/widget/LinearLayout;

    iget-object v1, p0, Lo/ffo;->m:Landroid/content/Context;

    const/high16 v2, 0x41800000    # 16.0f

    invoke-static {v1, v2}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/widget/LinearLayout;->setPadding(IIII)V

    .line 100
    iget-object v0, p0, Lo/ffo;->a:Landroid/widget/RelativeLayout;

    iget-object v1, p0, Lo/ffo;->c:Landroid/widget/LinearLayout;

    iget-object v2, p0, Lo/ffo;->k:Landroid/widget/RelativeLayout$LayoutParams;

    invoke-virtual {v0, v1, v2}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    goto/16 :goto_0

    .line 102
    :cond_1
    const/16 v0, 0x79

    if-ne p2, v0, :cond_6

    .line 103
    iget-object v0, p0, Lo/ffo;->f:Landroid/widget/RelativeLayout$LayoutParams;

    const/16 v1, 0x9

    const/4 v2, -0x1

    invoke-virtual {v0, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 104
    iget-object v0, p0, Lo/ffo;->b:Landroid/widget/LinearLayout;

    iget-object v1, p0, Lo/ffo;->m:Landroid/content/Context;

    const/high16 v2, 0x41800000    # 16.0f

    invoke-static {v1, v2}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/widget/LinearLayout;->setPadding(IIII)V

    .line 105
    iget-object v0, p0, Lo/ffo;->a:Landroid/widget/RelativeLayout;

    iget-object v1, p0, Lo/ffo;->b:Landroid/widget/LinearLayout;

    iget-object v2, p0, Lo/ffo;->f:Landroid/widget/RelativeLayout$LayoutParams;

    invoke-virtual {v0, v1, v2}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    goto/16 :goto_0

    .line 110
    :pswitch_1
    const/16 v0, 0x64

    if-ne p2, v0, :cond_2

    .line 111
    iget-object v0, p0, Lo/ffo;->e:Landroid/widget/RelativeLayout$LayoutParams;

    const/16 v1, 0xe

    const/4 v2, -0x1

    invoke-virtual {v0, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 112
    iget-object v0, p0, Lo/ffo;->d:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/widget/LinearLayout;->setPadding(IIII)V

    .line 113
    iget-object v0, p0, Lo/ffo;->a:Landroid/widget/RelativeLayout;

    iget-object v1, p0, Lo/ffo;->d:Landroid/widget/LinearLayout;

    iget-object v2, p0, Lo/ffo;->e:Landroid/widget/RelativeLayout$LayoutParams;

    invoke-virtual {v0, v1, v2}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    goto/16 :goto_0

    .line 115
    :cond_2
    const/16 v0, 0x4d

    if-ne p2, v0, :cond_3

    .line 116
    iget-object v0, p0, Lo/ffo;->k:Landroid/widget/RelativeLayout$LayoutParams;

    const/16 v1, 0xe

    const/4 v2, -0x1

    invoke-virtual {v0, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 117
    iget-object v0, p0, Lo/ffo;->c:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/widget/LinearLayout;->setPadding(IIII)V

    .line 118
    iget-object v0, p0, Lo/ffo;->a:Landroid/widget/RelativeLayout;

    iget-object v1, p0, Lo/ffo;->c:Landroid/widget/LinearLayout;

    iget-object v2, p0, Lo/ffo;->k:Landroid/widget/RelativeLayout$LayoutParams;

    invoke-virtual {v0, v1, v2}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    goto/16 :goto_0

    .line 120
    :cond_3
    const/16 v0, 0x79

    if-ne p2, v0, :cond_6

    .line 121
    iget-object v0, p0, Lo/ffo;->f:Landroid/widget/RelativeLayout$LayoutParams;

    const/16 v1, 0xe

    const/4 v2, -0x1

    invoke-virtual {v0, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 122
    iget-object v0, p0, Lo/ffo;->b:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/widget/LinearLayout;->setPadding(IIII)V

    .line 123
    iget-object v0, p0, Lo/ffo;->a:Landroid/widget/RelativeLayout;

    iget-object v1, p0, Lo/ffo;->b:Landroid/widget/LinearLayout;

    iget-object v2, p0, Lo/ffo;->f:Landroid/widget/RelativeLayout$LayoutParams;

    invoke-virtual {v0, v1, v2}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    goto/16 :goto_0

    .line 128
    :pswitch_2
    const/16 v0, 0x64

    if-ne p2, v0, :cond_4

    .line 129
    iget-object v0, p0, Lo/ffo;->e:Landroid/widget/RelativeLayout$LayoutParams;

    const/16 v1, 0xb

    const/4 v2, -0x1

    invoke-virtual {v0, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 130
    iget-object v0, p0, Lo/ffo;->d:Landroid/widget/LinearLayout;

    iget-object v1, p0, Lo/ffo;->m:Landroid/content/Context;

    const/high16 v2, 0x41800000    # 16.0f

    invoke-static {v1, v2}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual {v0, v2, v3, v1, v4}, Landroid/widget/LinearLayout;->setPadding(IIII)V

    .line 131
    iget-object v0, p0, Lo/ffo;->a:Landroid/widget/RelativeLayout;

    iget-object v1, p0, Lo/ffo;->d:Landroid/widget/LinearLayout;

    iget-object v2, p0, Lo/ffo;->e:Landroid/widget/RelativeLayout$LayoutParams;

    invoke-virtual {v0, v1, v2}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_0

    .line 133
    :cond_4
    const/16 v0, 0x4d

    if-ne p2, v0, :cond_5

    .line 134
    iget-object v0, p0, Lo/ffo;->k:Landroid/widget/RelativeLayout$LayoutParams;

    const/16 v1, 0xb

    const/4 v2, -0x1

    invoke-virtual {v0, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 135
    iget-object v0, p0, Lo/ffo;->c:Landroid/widget/LinearLayout;

    iget-object v1, p0, Lo/ffo;->m:Landroid/content/Context;

    const/high16 v2, 0x41800000    # 16.0f

    invoke-static {v1, v2}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual {v0, v2, v3, v1, v4}, Landroid/widget/LinearLayout;->setPadding(IIII)V

    .line 136
    iget-object v0, p0, Lo/ffo;->a:Landroid/widget/RelativeLayout;

    iget-object v1, p0, Lo/ffo;->c:Landroid/widget/LinearLayout;

    iget-object v2, p0, Lo/ffo;->k:Landroid/widget/RelativeLayout$LayoutParams;

    invoke-virtual {v0, v1, v2}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_0

    .line 138
    :cond_5
    const/16 v0, 0x79

    if-ne p2, v0, :cond_6

    .line 139
    iget-object v0, p0, Lo/ffo;->f:Landroid/widget/RelativeLayout$LayoutParams;

    const/16 v1, 0xb

    const/4 v2, -0x1

    invoke-virtual {v0, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 140
    iget-object v0, p0, Lo/ffo;->b:Landroid/widget/LinearLayout;

    iget-object v1, p0, Lo/ffo;->m:Landroid/content/Context;

    const/high16 v2, 0x41800000    # 16.0f

    invoke-static {v1, v2}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual {v0, v2, v3, v1, v4}, Landroid/widget/LinearLayout;->setPadding(IIII)V

    .line 141
    iget-object v0, p0, Lo/ffo;->a:Landroid/widget/RelativeLayout;

    iget-object v1, p0, Lo/ffo;->b:Landroid/widget/LinearLayout;

    iget-object v2, p0, Lo/ffo;->f:Landroid/widget/RelativeLayout$LayoutParams;

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

.method private setOnMonthSelect(I)V
    .locals 3

    .line 218
    add-int/lit8 v0, p1, 0x1

    iput v0, p0, Lo/ffo;->p:I

    .line 219
    iput p1, p0, Lo/ffo;->u:I

    .line 220
    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    .line 221
    iget v0, p0, Lo/ffo;->l:I

    invoke-direct {p0, v0}, Lo/ffo;->b(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 222
    iget-object v0, p0, Lo/ffo;->o:Lo/ffa;

    iget v1, p0, Lo/ffo;->q:I

    const/16 v2, 0x8

    invoke-virtual {v0, v2, v1}, Lo/ffa;->setContentMode(II)V

    goto :goto_0

    .line 224
    :cond_0
    iget-object v0, p0, Lo/ffo;->o:Lo/ffa;

    iget v1, p0, Lo/ffo;->q:I

    const/4 v2, 0x7

    invoke-virtual {v0, v2, v1}, Lo/ffa;->setContentMode(II)V

    goto :goto_0

    .line 226
    :cond_1
    const/4 v0, 0x3

    if-eq p1, v0, :cond_2

    const/4 v0, 0x5

    if-eq p1, v0, :cond_2

    const/16 v0, 0x8

    if-eq p1, v0, :cond_2

    const/16 v0, 0xa

    if-ne p1, v0, :cond_3

    .line 227
    :cond_2
    iget-object v0, p0, Lo/ffo;->o:Lo/ffa;

    iget v1, p0, Lo/ffo;->q:I

    const/16 v2, 0x9

    invoke-virtual {v0, v2, v1}, Lo/ffa;->setContentMode(II)V

    goto :goto_0

    .line 229
    :cond_3
    iget-object v0, p0, Lo/ffo;->o:Lo/ffa;

    iget v1, p0, Lo/ffo;->q:I

    const/4 v2, 0x2

    invoke-virtual {v0, v2, v1}, Lo/ffa;->setContentMode(II)V

    .line 231
    :goto_0
    return-void
.end method

.method private setOnYearSelect(I)V
    .locals 3

    .line 197
    iget v0, p0, Lo/ffo;->t:I

    add-int/2addr v0, p1

    iput v0, p0, Lo/ffo;->l:I

    .line 198
    iput p1, p0, Lo/ffo;->s:I

    .line 199
    iget v0, p0, Lo/ffo;->u:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 200
    iget v0, p0, Lo/ffo;->l:I

    invoke-direct {p0, v0}, Lo/ffo;->b(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 201
    iget-object v0, p0, Lo/ffo;->o:Lo/ffa;

    iget v1, p0, Lo/ffo;->q:I

    const/16 v2, 0x8

    invoke-virtual {v0, v2, v1}, Lo/ffa;->setContentMode(II)V

    goto :goto_0

    .line 203
    :cond_0
    iget-object v0, p0, Lo/ffo;->o:Lo/ffa;

    iget v1, p0, Lo/ffo;->q:I

    const/4 v2, 0x7

    invoke-virtual {v0, v2, v1}, Lo/ffa;->setContentMode(II)V

    goto :goto_0

    .line 205
    :cond_1
    iget v0, p0, Lo/ffo;->u:I

    const/4 v1, 0x3

    if-eq v0, v1, :cond_2

    iget v0, p0, Lo/ffo;->u:I

    const/4 v1, 0x5

    if-eq v0, v1, :cond_2

    iget v0, p0, Lo/ffo;->u:I

    const/16 v1, 0x8

    if-eq v0, v1, :cond_2

    iget v0, p0, Lo/ffo;->u:I

    const/16 v1, 0xa

    if-ne v0, v1, :cond_3

    .line 206
    :cond_2
    iget-object v0, p0, Lo/ffo;->o:Lo/ffa;

    iget v1, p0, Lo/ffo;->q:I

    const/16 v2, 0x9

    invoke-virtual {v0, v2, v1}, Lo/ffa;->setContentMode(II)V

    goto :goto_0

    .line 208
    :cond_3
    iget-object v0, p0, Lo/ffo;->o:Lo/ffa;

    iget v1, p0, Lo/ffo;->q:I

    const/4 v2, 0x2

    invoke-virtual {v0, v2, v1}, Lo/ffa;->setContentMode(II)V

    .line 210
    :goto_0
    return-void
.end method


# virtual methods
.method public getSelectedDay()I
    .locals 1

    .line 254
    iget v0, p0, Lo/ffo;->r:I

    return v0
.end method

.method public getSelectedMonth()I
    .locals 1

    .line 257
    iget v0, p0, Lo/ffo;->p:I

    return v0
.end method

.method public getSelectedYear()I
    .locals 1

    .line 260
    iget v0, p0, Lo/ffo;->l:I

    return v0
.end method

.method public setSelectedDay(I)V
    .locals 2

    .line 235
    iput p1, p0, Lo/ffo;->r:I

    .line 236
    add-int/lit8 v0, p1, -0x1

    iput v0, p0, Lo/ffo;->q:I

    .line 237
    iget-object v0, p0, Lo/ffo;->o:Lo/ffa;

    iget v1, p0, Lo/ffo;->q:I

    invoke-virtual {v0, v1}, Lo/ffa;->setSelectedPosition(I)V

    .line 238
    return-void
.end method

.method public setSelectedMonth(I)V
    .locals 2

    .line 240
    iput p1, p0, Lo/ffo;->p:I

    .line 241
    add-int/lit8 v0, p1, -0x1

    iput v0, p0, Lo/ffo;->u:I

    .line 242
    iget-object v0, p0, Lo/ffo;->n:Lo/ffa;

    iget v1, p0, Lo/ffo;->u:I

    invoke-virtual {v0, v1}, Lo/ffa;->setSelectedPosition(I)V

    .line 243
    return-void
.end method

.method public setSelectedYear(I)V
    .locals 2

    .line 245
    iget v0, p0, Lo/ffo;->t:I

    sub-int v0, p1, v0

    iput v0, p0, Lo/ffo;->s:I

    .line 246
    iput p1, p0, Lo/ffo;->l:I

    .line 247
    iget-object v0, p0, Lo/ffo;->g:Lo/ffa;

    iget v1, p0, Lo/ffo;->s:I

    invoke-virtual {v0, v1}, Lo/ffa;->setSelectedPosition(I)V

    .line 248
    return-void
.end method

.method public setStartYear(I)V
    .locals 3

    .line 266
    const/16 v0, 0x7b2

    if-ge p1, v0, :cond_0

    .line 267
    const/16 p1, 0x7b2

    .line 269
    :cond_0
    iput p1, p0, Lo/ffo;->l:I

    .line 270
    iput p1, p0, Lo/ffo;->t:I

    .line 271
    iget-object v0, p0, Lo/ffo;->g:Lo/ffa;

    invoke-virtual {v0, p1}, Lo/ffa;->setStartYear(I)V

    .line 272
    iget-object v0, p0, Lo/ffo;->g:Lo/ffa;

    iget v1, p0, Lo/ffo;->s:I

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Lo/ffa;->setContentMode(II)V

    .line 273
    return-void
.end method
