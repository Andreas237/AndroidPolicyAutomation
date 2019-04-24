.class public Lo/ffn;
.super Landroid/widget/LinearLayout;
.source "SourceFile"


# instance fields
.field private a:Lo/ffa;

.field private b:I

.field private c:Lo/ffa;

.field private d:I

.field private e:Lo/ffa;

.field private g:I

.field private h:I

.field private i:I

.field private k:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    .line 43
    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 32
    const/4 v0, 0x0

    iput v0, p0, Lo/ffn;->b:I

    .line 33
    const/4 v0, 0x0

    iput v0, p0, Lo/ffn;->d:I

    .line 34
    const/4 v0, 0x0

    iput v0, p0, Lo/ffn;->h:I

    .line 36
    const/4 v0, 0x0

    iput v0, p0, Lo/ffn;->k:I

    .line 37
    const/4 v0, 0x0

    iput v0, p0, Lo/ffn;->i:I

    .line 38
    const/4 v0, 0x0

    iput v0, p0, Lo/ffn;->g:I

    .line 45
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$layout;->layout_input_data_sport_time_duration_picker_emui9:I

    invoke-virtual {v0, v1, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 48
    sget v0, Lcom/huawei/ui/main/R$id;->hw_health_time_picker_hour:I

    invoke-virtual {p0, v0}, Lo/ffn;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/ffa;

    iput-object v0, p0, Lo/ffn;->a:Lo/ffa;

    .line 49
    sget v0, Lcom/huawei/ui/main/R$id;->hw_health_time_picker_minute:I

    invoke-virtual {p0, v0}, Lo/ffn;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/ffa;

    iput-object v0, p0, Lo/ffn;->e:Lo/ffa;

    .line 50
    sget v0, Lcom/huawei/ui/main/R$id;->hw_health_time_picker_second:I

    invoke-virtual {p0, v0}, Lo/ffn;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/ffa;

    iput-object v0, p0, Lo/ffn;->c:Lo/ffa;

    .line 52
    iget-object v0, p0, Lo/ffn;->a:Lo/ffa;

    new-instance v1, Lo/ffn$5;

    invoke-direct {v1, p0}, Lo/ffn$5;-><init>(Lo/ffn;)V

    invoke-virtual {v0, v1}, Lo/ffa;->setOnSelectedListener(Lo/ffa$a;)V

    .line 60
    iget-object v0, p0, Lo/ffn;->e:Lo/ffa;

    new-instance v1, Lo/ffn$3;

    invoke-direct {v1, p0}, Lo/ffn$3;-><init>(Lo/ffn;)V

    invoke-virtual {v0, v1}, Lo/ffa;->setOnSelectedListener(Lo/ffa$a;)V

    .line 68
    iget-object v0, p0, Lo/ffn;->c:Lo/ffa;

    new-instance v1, Lo/ffn$4;

    invoke-direct {v1, p0}, Lo/ffn$4;-><init>(Lo/ffn;)V

    invoke-virtual {v0, v1}, Lo/ffa;->setOnSelectedListener(Lo/ffa$a;)V

    .line 75
    return-void
.end method

.method static synthetic a(Lo/ffn;I)I
    .locals 0

    .line 22
    iput p1, p0, Lo/ffn;->i:I

    return p1
.end method

.method static synthetic b(Lo/ffn;I)I
    .locals 0

    .line 22
    iput p1, p0, Lo/ffn;->b:I

    return p1
.end method

.method static synthetic c(Lo/ffn;I)I
    .locals 0

    .line 22
    iput p1, p0, Lo/ffn;->d:I

    return p1
.end method

.method static synthetic d(Lo/ffn;I)I
    .locals 0

    .line 22
    iput p1, p0, Lo/ffn;->h:I

    return p1
.end method

.method static synthetic e(Lo/ffn;I)I
    .locals 0

    .line 22
    iput p1, p0, Lo/ffn;->k:I

    return p1
.end method

.method static synthetic k(Lo/ffn;I)I
    .locals 0

    .line 22
    iput p1, p0, Lo/ffn;->g:I

    return p1
.end method


# virtual methods
.method public getSelectedHour()I
    .locals 1

    .line 80
    iget v0, p0, Lo/ffn;->b:I

    return v0
.end method

.method public getSelectedMinute()I
    .locals 1

    .line 83
    iget v0, p0, Lo/ffn;->d:I

    return v0
.end method

.method public getSelectedSecond()I
    .locals 1

    .line 87
    iget v0, p0, Lo/ffn;->h:I

    return v0
.end method

.method public setSelectedHour(I)V
    .locals 2

    .line 94
    iput p1, p0, Lo/ffn;->b:I

    .line 95
    iput p1, p0, Lo/ffn;->k:I

    .line 96
    iget-object v0, p0, Lo/ffn;->a:Lo/ffa;

    iget v1, p0, Lo/ffn;->k:I

    invoke-virtual {v0, v1}, Lo/ffa;->setSelectedPosition(I)V

    .line 97
    return-void
.end method

.method public setSelectedMinute(I)V
    .locals 2

    .line 100
    iput p1, p0, Lo/ffn;->d:I

    .line 101
    iput p1, p0, Lo/ffn;->i:I

    .line 102
    iget-object v0, p0, Lo/ffn;->e:Lo/ffa;

    iget v1, p0, Lo/ffn;->i:I

    invoke-virtual {v0, v1}, Lo/ffa;->setSelectedPosition(I)V

    .line 103
    return-void
.end method

.method public setSelectedsecond(I)V
    .locals 2

    .line 106
    iput p1, p0, Lo/ffn;->h:I

    .line 107
    iput p1, p0, Lo/ffn;->g:I

    .line 108
    iget-object v0, p0, Lo/ffn;->c:Lo/ffa;

    iget v1, p0, Lo/ffn;->g:I

    invoke-virtual {v0, v1}, Lo/ffa;->setSelectedPosition(I)V

    .line 109
    return-void
.end method
