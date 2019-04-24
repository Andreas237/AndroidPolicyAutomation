.class public Lo/fez;
.super Landroid/widget/LinearLayout;
.source "SourceFile"


# instance fields
.field private a:Lo/ffa;

.field b:I

.field private c:Lo/ffa;

.field private d:Lo/ffa;

.field private e:Landroid/widget/RelativeLayout;

.field private f:I

.field private g:I

.field private h:I

.field private i:I

.field private k:I

.field private l:I

.field private o:I

.field private p:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    .line 49
    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 34
    const/4 v0, 0x3

    iput v0, p0, Lo/fez;->b:I

    .line 36
    const/4 v0, 0x0

    iput v0, p0, Lo/fez;->f:I

    .line 37
    const/4 v0, 0x1

    iput v0, p0, Lo/fez;->i:I

    .line 38
    const/4 v0, 0x1

    iput v0, p0, Lo/fez;->g:I

    .line 40
    const/4 v0, 0x0

    iput v0, p0, Lo/fez;->h:I

    .line 41
    const/4 v0, 0x0

    iput v0, p0, Lo/fez;->k:I

    .line 42
    const/4 v0, 0x0

    iput v0, p0, Lo/fez;->p:I

    .line 44
    const/4 v0, 0x0

    iput v0, p0, Lo/fez;->o:I

    .line 45
    const/4 v0, 0x0

    iput v0, p0, Lo/fez;->l:I

    .line 50
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$layout;->health_data_time_picker_layout:I

    invoke-virtual {v0, v1, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 52
    sget v0, Lcom/huawei/ui/main/R$id;->hw_health_time_picker_mode_layout:I

    invoke-virtual {p0, v0}, Lo/fez;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lo/fez;->e:Landroid/widget/RelativeLayout;

    .line 53
    sget v0, Lcom/huawei/ui/main/R$id;->hw_health_time_picker_apm:I

    invoke-virtual {p0, v0}, Lo/fez;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/ffa;

    iput-object v0, p0, Lo/fez;->d:Lo/ffa;

    .line 54
    sget v0, Lcom/huawei/ui/main/R$id;->hw_health_time_picker_hour:I

    invoke-virtual {p0, v0}, Lo/fez;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/ffa;

    iput-object v0, p0, Lo/fez;->c:Lo/ffa;

    .line 55
    sget v0, Lcom/huawei/ui/main/R$id;->hw_health_time_picker_minute:I

    invoke-virtual {p0, v0}, Lo/fez;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/ffa;

    iput-object v0, p0, Lo/fez;->a:Lo/ffa;

    .line 57
    iget-object v0, p0, Lo/fez;->d:Lo/ffa;

    new-instance v1, Lo/fez$4;

    invoke-direct {v1, p0}, Lo/fez$4;-><init>(Lo/fez;)V

    invoke-virtual {v0, v1}, Lo/ffa;->setOnSelectedListener(Lo/ffa$a;)V

    .line 67
    iget-object v0, p0, Lo/fez;->c:Lo/ffa;

    new-instance v1, Lo/fez$5;

    invoke-direct {v1, p0}, Lo/fez$5;-><init>(Lo/fez;)V

    invoke-virtual {v0, v1}, Lo/ffa;->setOnSelectedListener(Lo/ffa$a;)V

    .line 88
    iget-object v0, p0, Lo/fez;->a:Lo/ffa;

    new-instance v1, Lo/fez$1;

    invoke-direct {v1, p0}, Lo/fez$1;-><init>(Lo/fez;)V

    invoke-virtual {v0, v1}, Lo/ffa;->setOnSelectedListener(Lo/ffa$a;)V

    .line 96
    return-void
.end method

.method static synthetic a(Lo/fez;)I
    .locals 1

    .line 18
    iget v0, p0, Lo/fez;->h:I

    return v0
.end method

.method static synthetic a(Lo/fez;I)I
    .locals 0

    .line 18
    iput p1, p0, Lo/fez;->l:I

    return p1
.end method

.method static synthetic b(Lo/fez;I)I
    .locals 0

    .line 18
    iput p1, p0, Lo/fez;->k:I

    return p1
.end method

.method static synthetic b(Lo/fez;)V
    .locals 0

    .line 18
    invoke-direct {p0}, Lo/fez;->d()V

    return-void
.end method

.method static synthetic c(Lo/fez;)I
    .locals 1

    .line 18
    iget v0, p0, Lo/fez;->o:I

    return v0
.end method

.method static synthetic c(Lo/fez;I)I
    .locals 0

    .line 18
    iput p1, p0, Lo/fez;->h:I

    return p1
.end method

.method static synthetic d(Lo/fez;)I
    .locals 1

    .line 18
    iget v0, p0, Lo/fez;->l:I

    return v0
.end method

.method static synthetic d(Lo/fez;I)I
    .locals 0

    .line 18
    iput p1, p0, Lo/fez;->f:I

    return p1
.end method

.method private d()V
    .locals 2

    .line 99
    iget v0, p0, Lo/fez;->k:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/fez;->i:I

    .line 100
    iget v0, p0, Lo/fez;->i:I

    const/16 v1, 0xc

    if-ne v0, v1, :cond_0

    .line 101
    iget v0, p0, Lo/fez;->h:I

    if-nez v0, :cond_1

    .line 102
    const/4 v0, 0x0

    iput v0, p0, Lo/fez;->i:I

    goto :goto_0

    .line 104
    :cond_0
    iget v0, p0, Lo/fez;->h:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 105
    iget v0, p0, Lo/fez;->i:I

    add-int/lit8 v0, v0, 0xc

    iput v0, p0, Lo/fez;->i:I

    .line 107
    :cond_1
    :goto_0
    return-void
.end method

.method static synthetic e(Lo/fez;I)I
    .locals 0

    .line 18
    iput p1, p0, Lo/fez;->o:I

    return p1
.end method

.method static synthetic e(Lo/fez;)Lo/ffa;
    .locals 1

    .line 18
    iget-object v0, p0, Lo/fez;->d:Lo/ffa;

    return-object v0
.end method

.method static synthetic f(Lo/fez;I)I
    .locals 0

    .line 18
    iput p1, p0, Lo/fez;->p:I

    return p1
.end method

.method static synthetic i(Lo/fez;I)I
    .locals 0

    .line 18
    iput p1, p0, Lo/fez;->i:I

    return p1
.end method

.method static synthetic k(Lo/fez;I)I
    .locals 0

    .line 18
    iput p1, p0, Lo/fez;->g:I

    return p1
.end method


# virtual methods
.method public getMillsTime()J
    .locals 5

    .line 131
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v2

    .line 132
    iget v0, p0, Lo/fez;->f:I

    const/16 v1, 0x9

    invoke-virtual {v2, v1, v0}, Ljava/util/Calendar;->set(II)V

    .line 133
    iget v0, p0, Lo/fez;->i:I

    const/16 v1, 0xa

    invoke-virtual {v2, v1, v0}, Ljava/util/Calendar;->set(II)V

    .line 134
    iget v0, p0, Lo/fez;->g:I

    const/16 v1, 0xc

    invoke-virtual {v2, v1, v0}, Ljava/util/Calendar;->set(II)V

    .line 135
    invoke-virtual {v2}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v3

    .line 136
    invoke-virtual {v2}, Ljava/util/Calendar;->clear()V

    .line 137
    return-wide v3
.end method

.method public getSelectedApm()I
    .locals 1

    .line 141
    iget v0, p0, Lo/fez;->f:I

    return v0
.end method

.method public getSelectedHour()I
    .locals 1

    .line 144
    iget v0, p0, Lo/fez;->i:I

    return v0
.end method

.method public getSelectedMinute()I
    .locals 1

    .line 147
    iget v0, p0, Lo/fez;->g:I

    return v0
.end method

.method public setSelectedApm(I)V
    .locals 2

    .line 161
    iput p1, p0, Lo/fez;->f:I

    .line 162
    iput p1, p0, Lo/fez;->h:I

    .line 163
    iget-object v0, p0, Lo/fez;->d:Lo/ffa;

    iget v1, p0, Lo/fez;->h:I

    invoke-virtual {v0, v1}, Lo/ffa;->setSelectedPosition(I)V

    .line 164
    return-void
.end method

.method public setSelectedHour(I)V
    .locals 2

    .line 167
    iput p1, p0, Lo/fez;->i:I

    .line 168
    iget v0, p0, Lo/fez;->b:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    .line 169
    iput p1, p0, Lo/fez;->k:I

    goto :goto_0

    .line 171
    :cond_0
    add-int/lit8 v0, p1, -0x1

    iput v0, p0, Lo/fez;->k:I

    .line 174
    :goto_0
    iget-object v0, p0, Lo/fez;->c:Lo/ffa;

    iget v1, p0, Lo/fez;->k:I

    invoke-virtual {v0, v1}, Lo/ffa;->setSelectedPosition(I)V

    .line 175
    return-void
.end method

.method public setSelectedMinute(I)V
    .locals 2

    .line 178
    iput p1, p0, Lo/fez;->g:I

    .line 179
    iput p1, p0, Lo/fez;->p:I

    .line 180
    iget-object v0, p0, Lo/fez;->a:Lo/ffa;

    iget v1, p0, Lo/fez;->p:I

    invoke-virtual {v0, v1}, Lo/ffa;->setSelectedPosition(I)V

    .line 181
    return-void
.end method

.method public setTimeMode(I)V
    .locals 3

    .line 151
    iput p1, p0, Lo/fez;->b:I

    .line 152
    iget v0, p0, Lo/fez;->b:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    .line 153
    iget-object v0, p0, Lo/fez;->e:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    goto :goto_0

    .line 154
    :cond_0
    iget v0, p0, Lo/fez;->b:I

    const/4 v1, 0x6

    if-ne v0, v1, :cond_1

    .line 155
    iget-object v0, p0, Lo/fez;->e:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 157
    :cond_1
    :goto_0
    iget-object v0, p0, Lo/fez;->c:Lo/ffa;

    iget v1, p0, Lo/fez;->b:I

    iget v2, p0, Lo/fez;->k:I

    invoke-virtual {v0, v1, v2}, Lo/ffa;->setContentMode(II)V

    .line 158
    return-void
.end method
