.class public Lo/ffq;
.super Landroid/widget/LinearLayout;
.source "SourceFile"


# instance fields
.field private a:Lo/ffa;

.field b:I

.field private c:Landroid/widget/RelativeLayout;

.field private d:Lo/ffa;

.field private e:Lo/ffa;

.field private f:I

.field private g:I

.field private h:I

.field private i:I

.field private k:I

.field private n:I

.field private o:I

.field private p:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    .line 51
    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 37
    const/4 v0, 0x3

    iput v0, p0, Lo/ffq;->b:I

    .line 40
    const/4 v0, 0x0

    iput v0, p0, Lo/ffq;->h:I

    .line 41
    const/4 v0, 0x1

    iput v0, p0, Lo/ffq;->k:I

    .line 42
    const/4 v0, 0x1

    iput v0, p0, Lo/ffq;->f:I

    .line 43
    const/4 v0, 0x0

    iput v0, p0, Lo/ffq;->i:I

    .line 44
    const/4 v0, 0x0

    iput v0, p0, Lo/ffq;->g:I

    .line 45
    const/4 v0, 0x0

    iput v0, p0, Lo/ffq;->n:I

    .line 46
    const/4 v0, 0x0

    iput v0, p0, Lo/ffq;->o:I

    .line 47
    const/4 v0, 0x0

    iput v0, p0, Lo/ffq;->p:I

    .line 52
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$layout;->track_data_time_picker_emui9:I

    invoke-virtual {v0, v1, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 53
    sget v0, Lcom/huawei/ui/main/R$id;->track_time_picker_mode_layout:I

    invoke-virtual {p0, v0}, Lo/ffq;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lo/ffq;->c:Landroid/widget/RelativeLayout;

    .line 54
    sget v0, Lcom/huawei/ui/main/R$id;->track_time_picker_apm:I

    invoke-virtual {p0, v0}, Lo/ffq;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/ffa;

    iput-object v0, p0, Lo/ffq;->d:Lo/ffa;

    .line 55
    sget v0, Lcom/huawei/ui/main/R$id;->track_time_picker_hour:I

    invoke-virtual {p0, v0}, Lo/ffq;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/ffa;

    iput-object v0, p0, Lo/ffq;->a:Lo/ffa;

    .line 56
    sget v0, Lcom/huawei/ui/main/R$id;->track_time_picker_minute:I

    invoke-virtual {p0, v0}, Lo/ffq;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/ffa;

    iput-object v0, p0, Lo/ffq;->e:Lo/ffa;

    .line 58
    iget-object v0, p0, Lo/ffq;->d:Lo/ffa;

    new-instance v1, Lo/ffq$5;

    invoke-direct {v1, p0}, Lo/ffq$5;-><init>(Lo/ffq;)V

    invoke-virtual {v0, v1}, Lo/ffa;->setOnSelectedListener(Lo/ffa$a;)V

    .line 68
    iget-object v0, p0, Lo/ffq;->a:Lo/ffa;

    new-instance v1, Lo/ffq$1;

    invoke-direct {v1, p0}, Lo/ffq$1;-><init>(Lo/ffq;)V

    invoke-virtual {v0, v1}, Lo/ffa;->setOnSelectedListener(Lo/ffa$a;)V

    .line 90
    iget-object v0, p0, Lo/ffq;->e:Lo/ffa;

    new-instance v1, Lo/ffq$3;

    invoke-direct {v1, p0}, Lo/ffq$3;-><init>(Lo/ffq;)V

    invoke-virtual {v0, v1}, Lo/ffa;->setOnSelectedListener(Lo/ffa$a;)V

    .line 98
    return-void
.end method

.method static synthetic a(Lo/ffq;)I
    .locals 1

    .line 21
    iget v0, p0, Lo/ffq;->g:I

    return v0
.end method

.method static synthetic a(Lo/ffq;I)I
    .locals 0

    .line 21
    iput p1, p0, Lo/ffq;->h:I

    return p1
.end method

.method static synthetic b(Lo/ffq;)I
    .locals 1

    .line 21
    iget v0, p0, Lo/ffq;->n:I

    return v0
.end method

.method static synthetic b(Lo/ffq;I)I
    .locals 0

    .line 21
    iput p1, p0, Lo/ffq;->n:I

    return p1
.end method

.method static synthetic c(Lo/ffq;I)I
    .locals 0

    .line 21
    iput p1, p0, Lo/ffq;->i:I

    return p1
.end method

.method static synthetic c(Lo/ffq;)V
    .locals 0

    .line 21
    invoke-direct {p0}, Lo/ffq;->e()V

    return-void
.end method

.method static synthetic d(Lo/ffq;)I
    .locals 1

    .line 21
    iget v0, p0, Lo/ffq;->i:I

    return v0
.end method

.method static synthetic d(Lo/ffq;I)I
    .locals 0

    .line 21
    iput p1, p0, Lo/ffq;->o:I

    return p1
.end method

.method static synthetic e(Lo/ffq;I)I
    .locals 0

    .line 21
    iput p1, p0, Lo/ffq;->g:I

    return p1
.end method

.method static synthetic e(Lo/ffq;)Lo/ffa;
    .locals 1

    .line 21
    iget-object v0, p0, Lo/ffq;->d:Lo/ffa;

    return-object v0
.end method

.method private e()V
    .locals 2

    .line 114
    iget v0, p0, Lo/ffq;->o:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/ffq;->k:I

    .line 115
    iget v0, p0, Lo/ffq;->k:I

    const/16 v1, 0xc

    if-ne v0, v1, :cond_0

    .line 116
    iget v0, p0, Lo/ffq;->n:I

    if-nez v0, :cond_1

    .line 117
    const/4 v0, 0x0

    iput v0, p0, Lo/ffq;->k:I

    goto :goto_0

    .line 119
    :cond_0
    iget v0, p0, Lo/ffq;->n:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 120
    iget v0, p0, Lo/ffq;->k:I

    add-int/lit8 v0, v0, 0xc

    iput v0, p0, Lo/ffq;->k:I

    .line 122
    :cond_1
    :goto_0
    return-void
.end method

.method static synthetic f(Lo/ffq;I)I
    .locals 0

    .line 21
    iput p1, p0, Lo/ffq;->p:I

    return p1
.end method

.method static synthetic i(Lo/ffq;I)I
    .locals 0

    .line 21
    iput p1, p0, Lo/ffq;->f:I

    return p1
.end method

.method static synthetic k(Lo/ffq;I)I
    .locals 0

    .line 21
    iput p1, p0, Lo/ffq;->k:I

    return p1
.end method


# virtual methods
.method public getSelectedApm()I
    .locals 1

    .line 104
    iget v0, p0, Lo/ffq;->h:I

    return v0
.end method

.method public getSelectedHour()I
    .locals 1

    .line 107
    iget v0, p0, Lo/ffq;->k:I

    return v0
.end method

.method public getSelectedMinute()I
    .locals 1

    .line 110
    iget v0, p0, Lo/ffq;->f:I

    return v0
.end method

.method public setSelectedApm(I)V
    .locals 2

    .line 136
    iput p1, p0, Lo/ffq;->h:I

    .line 137
    iput p1, p0, Lo/ffq;->n:I

    .line 138
    iget-object v0, p0, Lo/ffq;->d:Lo/ffa;

    iget v1, p0, Lo/ffq;->n:I

    invoke-virtual {v0, v1}, Lo/ffa;->setSelectedPosition(I)V

    .line 139
    return-void
.end method

.method public setSelectedHour(I)V
    .locals 2

    .line 141
    iput p1, p0, Lo/ffq;->k:I

    .line 142
    iget v0, p0, Lo/ffq;->b:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    .line 143
    iput p1, p0, Lo/ffq;->o:I

    goto :goto_0

    .line 145
    :cond_0
    add-int/lit8 v0, p1, -0x1

    iput v0, p0, Lo/ffq;->o:I

    .line 147
    :goto_0
    iget-object v0, p0, Lo/ffq;->a:Lo/ffa;

    iget v1, p0, Lo/ffq;->o:I

    invoke-virtual {v0, v1}, Lo/ffa;->setSelectedPosition(I)V

    .line 148
    return-void
.end method

.method public setSelectedMinute(I)V
    .locals 2

    .line 151
    iput p1, p0, Lo/ffq;->f:I

    .line 152
    iput p1, p0, Lo/ffq;->p:I

    .line 153
    iget-object v0, p0, Lo/ffq;->e:Lo/ffa;

    iget v1, p0, Lo/ffq;->p:I

    invoke-virtual {v0, v1}, Lo/ffa;->setSelectedPosition(I)V

    .line 154
    return-void
.end method

.method public setTimeMode(I)V
    .locals 3

    .line 125
    iput p1, p0, Lo/ffq;->b:I

    .line 126
    iget v0, p0, Lo/ffq;->b:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    .line 127
    iget-object v0, p0, Lo/ffq;->c:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    goto :goto_0

    .line 128
    :cond_0
    iget v0, p0, Lo/ffq;->b:I

    const/4 v1, 0x6

    if-ne v0, v1, :cond_1

    .line 129
    iget-object v0, p0, Lo/ffq;->c:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 131
    :cond_1
    :goto_0
    iget-object v0, p0, Lo/ffq;->a:Lo/ffa;

    iget v1, p0, Lo/ffq;->b:I

    iget v2, p0, Lo/ffq;->o:I

    invoke-virtual {v0, v1, v2}, Lo/ffa;->setContentMode(II)V

    .line 132
    return-void
.end method
