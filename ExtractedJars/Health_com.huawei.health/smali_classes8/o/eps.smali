.class public Lo/eps;
.super Landroid/widget/LinearLayout;
.source "SourceFile"


# instance fields
.field private a:Lo/fgh;

.field private b:Lo/fgh;

.field private c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field private d:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/String;Ljava/util/ArrayList<Ljava/lang/String;>;>;"
        }
    .end annotation
.end field

.field private e:I

.field private f:Z

.field private h:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 36
    invoke-direct {p0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 25
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eps;->d:Ljava/util/Map;

    .line 26
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eps;->c:Ljava/util/List;

    .line 28
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eps;->a:Lo/fgh;

    .line 29
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eps;->b:Lo/fgh;

    .line 31
    const/4 v0, 0x0

    iput v0, p0, Lo/eps;->e:I

    .line 32
    const/4 v0, 0x0

    iput v0, p0, Lo/eps;->h:I

    .line 33
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/eps;->f:Z

    .line 37
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 40
    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 25
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eps;->d:Ljava/util/Map;

    .line 26
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eps;->c:Ljava/util/List;

    .line 28
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eps;->a:Lo/fgh;

    .line 29
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eps;->b:Lo/fgh;

    .line 31
    const/4 v0, 0x0

    iput v0, p0, Lo/eps;->e:I

    .line 32
    const/4 v0, 0x0

    iput v0, p0, Lo/eps;->h:I

    .line 33
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/eps;->f:Z

    .line 42
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$layout;->health_two_picker_layout:I

    invoke-virtual {v0, v1, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 43
    sget v0, Lcom/huawei/ui/homehealth/R$id;->hw_health_first_picker:I

    invoke-virtual {p0, v0}, Lo/eps;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/fgh;

    iput-object v0, p0, Lo/eps;->a:Lo/fgh;

    .line 44
    sget v0, Lcom/huawei/ui/homehealth/R$id;->hw_health_second_picker:I

    invoke-virtual {p0, v0}, Lo/eps;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/fgh;

    iput-object v0, p0, Lo/eps;->b:Lo/fgh;

    .line 46
    invoke-direct {p0}, Lo/eps;->e()V

    .line 48
    iget-object v0, p0, Lo/eps;->a:Lo/fgh;

    new-instance v1, Lo/eps$4;

    invoke-direct {v1, p0}, Lo/eps$4;-><init>(Lo/eps;)V

    invoke-virtual {v0, v1}, Lo/fgh;->setOnSelectedListener(Lo/fgh$d;)V

    .line 60
    iget-object v0, p0, Lo/eps;->b:Lo/fgh;

    new-instance v1, Lo/eps$5;

    invoke-direct {v1, p0}, Lo/eps$5;-><init>(Lo/eps;)V

    invoke-virtual {v0, v1}, Lo/fgh;->setOnSelectedListener(Lo/fgh$d;)V

    .line 66
    return-void
.end method

.method static synthetic a(Lo/eps;)I
    .locals 1

    .line 21
    iget v0, p0, Lo/eps;->h:I

    return v0
.end method

.method private a(II)V
    .locals 4

    .line 106
    iput p1, p0, Lo/eps;->e:I

    .line 107
    const-string v0, "Track_HealthTwoWheelPickerView"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setOnFirstSelect "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " secondLocation "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 108
    iget-object v0, p0, Lo/eps;->c:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/eps;->d:Ljava/util/Map;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/eps;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge p1, v0, :cond_0

    .line 109
    iget-object v0, p0, Lo/eps;->b:Lo/fgh;

    iget-object v1, p0, Lo/eps;->d:Ljava/util/Map;

    iget-object v2, p0, Lo/eps;->c:Ljava/util/List;

    invoke-interface {v2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/ArrayList;

    invoke-virtual {v0, v1, p2}, Lo/fgh;->setContent(Ljava/util/ArrayList;I)V

    .line 111
    :cond_0
    return-void
.end method

.method static synthetic a(Lo/eps;Z)Z
    .locals 0

    .line 21
    iput-boolean p1, p0, Lo/eps;->f:Z

    return p1
.end method

.method static synthetic b(Lo/eps;)Z
    .locals 1

    .line 21
    iget-boolean v0, p0, Lo/eps;->f:Z

    return v0
.end method

.method static synthetic c(Lo/eps;I)V
    .locals 0

    .line 21
    invoke-direct {p0, p1}, Lo/eps;->setOnSecondSelect(I)V

    return-void
.end method

.method static synthetic c(Lo/eps;II)V
    .locals 0

    .line 21
    invoke-direct {p0, p1, p2}, Lo/eps;->a(II)V

    return-void
.end method

.method private e()V
    .locals 0

    .line 70
    return-void
.end method

.method private e(II)V
    .locals 5

    .line 132
    iput p1, p0, Lo/eps;->e:I

    .line 133
    iput p2, p0, Lo/eps;->h:I

    .line 134
    iget v0, p0, Lo/eps;->e:I

    if-ltz v0, :cond_0

    iget v0, p0, Lo/eps;->e:I

    iget-object v1, p0, Lo/eps;->c:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    if-le v0, v1, :cond_1

    .line 135
    :cond_0
    const/4 v0, 0x0

    iput v0, p0, Lo/eps;->e:I

    .line 138
    :cond_1
    iget-object v0, p0, Lo/eps;->a:Lo/fgh;

    iget-object v1, p0, Lo/eps;->c:Ljava/util/List;

    check-cast v1, Ljava/util/ArrayList;

    iget v2, p0, Lo/eps;->e:I

    invoke-virtual {v0, v1, v2}, Lo/fgh;->setContent(Ljava/util/ArrayList;I)V

    .line 139
    iget-object v0, p0, Lo/eps;->a:Lo/fgh;

    iget v1, p0, Lo/eps;->e:I

    invoke-virtual {v0, v1}, Lo/fgh;->setSelectedPosition(I)V

    .line 140
    iget-object v0, p0, Lo/eps;->d:Ljava/util/Map;

    iget-object v1, p0, Lo/eps;->c:Ljava/util/List;

    iget v2, p0, Lo/eps;->e:I

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 141
    iget-object v0, p0, Lo/eps;->d:Ljava/util/Map;

    iget-object v1, p0, Lo/eps;->c:Ljava/util/List;

    iget v2, p0, Lo/eps;->e:I

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/util/ArrayList;

    .line 142
    iget v0, p0, Lo/eps;->h:I

    if-ltz v0, :cond_2

    iget v0, p0, Lo/eps;->h:I

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    if-le v0, v1, :cond_3

    .line 143
    :cond_2
    const/4 v0, 0x1

    iput v0, p0, Lo/eps;->h:I

    .line 145
    :cond_3
    iget-object v0, p0, Lo/eps;->b:Lo/fgh;

    iget-object v1, p0, Lo/eps;->d:Ljava/util/Map;

    iget-object v2, p0, Lo/eps;->c:Ljava/util/List;

    iget v3, p0, Lo/eps;->e:I

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/ArrayList;

    iget v2, p0, Lo/eps;->h:I

    invoke-virtual {v0, v1, v2}, Lo/fgh;->setContent(Ljava/util/ArrayList;I)V

    .line 146
    goto :goto_0

    .line 147
    :cond_4
    const-string v0, "Track_HealthTwoWheelPickerView"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "out of index of no this object firstSelected "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget v2, p0, Lo/eps;->e:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " keySize "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/eps;->c:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 149
    :goto_0
    return-void
.end method

.method private setOnSecondSelect(I)V
    .locals 4

    .line 126
    iput p1, p0, Lo/eps;->h:I

    .line 127
    const-string v0, "Track_HealthTwoWheelPickerView"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setOnSecondSelect "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 128
    return-void
.end method


# virtual methods
.method public b()I
    .locals 1

    .line 118
    iget v0, p0, Lo/eps;->h:I

    return v0
.end method

.method public b(II)V
    .locals 4

    .line 153
    const-string v0, "Track_HealthTwoWheelPickerView"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initLocation "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 154
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/eps;->f:Z

    .line 155
    invoke-direct {p0, p1, p2}, Lo/eps;->e(II)V

    .line 162
    return-void
.end method

.method public c()I
    .locals 1

    .line 114
    iget v0, p0, Lo/eps;->e:I

    return v0
.end method

.method public setDataContent(Ljava/util/List;Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/String;>;Ljava/util/Map<Ljava/lang/String;Ljava/util/ArrayList<Ljava/lang/String;>;>;)V"
        }
    .end annotation

    .line 95
    iput-object p2, p0, Lo/eps;->d:Ljava/util/Map;

    .line 96
    iput-object p1, p0, Lo/eps;->c:Ljava/util/List;

    .line 98
    return-void
.end method
