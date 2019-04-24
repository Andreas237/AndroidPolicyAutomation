.class public Lo/byz;
.super Lo/bze;
.source "SourceFile"


# instance fields
.field private i:Z

.field private l:Ljava/lang/String;

.field private m:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 27
    invoke-direct {p0, p1}, Lo/bze;-><init>(Landroid/content/Context;)V

    .line 28
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 31
    invoke-direct {p0, p1, p2}, Lo/bze;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 32
    return-void
.end method

.method static synthetic a(Lo/byz;)Ljava/lang/String;
    .locals 1

    .line 12
    iget-object v0, p0, Lo/byz;->m:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic b(Lo/byz;)Ljava/lang/String;
    .locals 1

    .line 12
    iget-object v0, p0, Lo/byz;->l:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic c(Lo/byz;)Z
    .locals 1

    .line 12
    iget-boolean v0, p0, Lo/byz;->i:Z

    return v0
.end method


# virtual methods
.method protected a()V
    .locals 2

    .line 41
    invoke-super {p0}, Lo/bze;->a()V

    .line 42
    invoke-virtual {p0}, Lo/byz;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/text/format/DateFormat;->is24HourFormat(Landroid/content/Context;)Z

    move-result v0

    iput-boolean v0, p0, Lo/byz;->i:Z

    .line 43
    invoke-virtual {p0}, Lo/byz;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$string;->IDS_settings_alarm_am:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/byz;->l:Ljava/lang/String;

    .line 44
    invoke-virtual {p0}, Lo/byz;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$string;->IDS_settings_alarm_pm:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/byz;->m:Ljava/lang/String;

    .line 46
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/byz;->setTime(I)V

    .line 47
    return-void
.end method

.method protected b(Lo/bze$c;I)V
    .locals 3

    .line 154
    if-gez p2, :cond_0

    .line 155
    const/4 v0, 0x0

    iput v0, p1, Lo/bze$c;->c:I

    .line 156
    const/4 v0, 0x0

    iput v0, p1, Lo/bze$c;->e:I

    .line 157
    const/4 v0, 0x0

    iput v0, p1, Lo/bze$c;->d:I

    .line 158
    return-void

    .line 161
    :cond_0
    invoke-virtual {p0, p2}, Lo/byz;->a(I)I

    move-result v1

    .line 162
    invoke-virtual {p0, p2}, Lo/byz;->c(I)I

    move-result v2

    .line 164
    const/16 v0, 0xc

    if-lt v1, v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    iput v0, p1, Lo/bze$c;->c:I

    .line 165
    add-int/lit16 v0, v1, 0x2ee0

    iput v0, p1, Lo/bze$c;->e:I

    .line 166
    add-int/lit16 v0, v2, 0x7530

    iput v0, p1, Lo/bze$c;->d:I

    .line 167
    return-void
.end method

.method protected c()V
    .locals 2

    .line 51
    invoke-super {p0}, Lo/bze;->c()V

    .line 52
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/byz;->d(Z)V

    .line 53
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/byz;->e(Z)V

    .line 54
    iget-object v0, p0, Lo/byz;->a:Lo/bzc;

    iget-boolean v1, p0, Lo/byz;->i:Z

    if-eqz v1, :cond_0

    const/16 v1, 0x8

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v0, v1}, Lo/bzc;->setVisibility(I)V

    .line 55
    return-void
.end method

.method protected d()V
    .locals 2

    .line 105
    iget-object v0, p0, Lo/byz;->a:Lo/bzc;

    new-instance v1, Lo/byz$3;

    invoke-direct {v1, p0}, Lo/byz$3;-><init>(Lo/byz;)V

    invoke-virtual {v0, v1}, Lo/bzc;->setOnWheelViewListener(Lo/bzc$c;)V

    .line 119
    iget-object v0, p0, Lo/byz;->c:Lo/bzc;

    new-instance v1, Lo/byz$1;

    invoke-direct {v1, p0}, Lo/byz$1;-><init>(Lo/byz;)V

    invoke-virtual {v0, v1}, Lo/bzc;->setOnWheelViewListener(Lo/bzc$c;)V

    .line 131
    iget-object v0, p0, Lo/byz;->e:Lo/bzc;

    new-instance v1, Lo/byz$6;

    invoke-direct {v1, p0}, Lo/byz$6;-><init>(Lo/byz;)V

    invoke-virtual {v0, v1}, Lo/bzc;->setOnWheelViewListener(Lo/bzc$c;)V

    .line 142
    return-void
.end method

.method protected d(Landroid/content/Context;)V
    .locals 0

    .line 36
    invoke-super {p0, p1}, Lo/bze;->d(Landroid/content/Context;)V

    .line 37
    return-void
.end method

.method protected e(I)I
    .locals 1

    .line 146
    const v0, 0x15144

    invoke-static {p1, v0}, Ljava/lang/Math;->min(II)I

    move-result p1

    .line 147
    const/4 v0, 0x0

    invoke-static {p1, v0}, Ljava/lang/Math;->max(II)I

    move-result p1

    .line 148
    return p1
.end method

.method protected e()V
    .locals 2

    .line 60
    iget-object v0, p0, Lo/byz;->a:Lo/bzc;

    new-instance v1, Lo/byz$4;

    invoke-direct {v1, p0}, Lo/byz$4;-><init>(Lo/byz;)V

    invoke-virtual {v0, v1}, Lo/bzc;->setWheelViewAdapter(Lo/bzc$b;)V

    .line 72
    iget-object v0, p0, Lo/byz;->c:Lo/bzc;

    new-instance v1, Lo/byz$2;

    invoke-direct {v1, p0}, Lo/byz$2;-><init>(Lo/byz;)V

    invoke-virtual {v0, v1}, Lo/bzc;->setWheelViewAdapter(Lo/bzc$b;)V

    .line 89
    iget-object v0, p0, Lo/byz;->e:Lo/bzc;

    new-instance v1, Lo/byz$5;

    invoke-direct {v1, p0}, Lo/byz$5;-><init>(Lo/byz;)V

    invoke-virtual {v0, v1}, Lo/bzc;->setWheelViewAdapter(Lo/bzc$b;)V

    .line 100
    return-void
.end method
