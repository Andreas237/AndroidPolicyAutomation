.class public Lo/eot;
.super Landroid/widget/BaseAdapter;
.source "SourceFile"


# instance fields
.field private a:Z

.field private b:I

.field private c:Landroid/content/Context;

.field d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation
.end field

.field private e:Ljava/lang/String;

.field private f:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation
.end field

.field private g:I

.field private h:Z

.field private i:I

.field private k:Lo/eoy;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/List;Lo/eoy;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Ljava/util/List<Ljava/lang/Integer;>;Lo/eoy;)V"
        }
    .end annotation

    .line 60
    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 34
    const-string v0, "MenuDragListAdapter"

    iput-object v0, p0, Lo/eot;->e:Ljava/lang/String;

    .line 36
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eot;->d:Ljava/util/List;

    .line 41
    const/4 v0, -0x1

    iput v0, p0, Lo/eot;->b:I

    .line 43
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/eot;->a:Z

    .line 45
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/eot;->h:Z

    .line 47
    const/4 v0, -0x1

    iput v0, p0, Lo/eot;->g:I

    .line 49
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eot;->k:Lo/eoy;

    .line 229
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/eot;->f:Ljava/util/List;

    .line 61
    iput-object p1, p0, Lo/eot;->c:Landroid/content/Context;

    .line 62
    iput-object p2, p0, Lo/eot;->d:Ljava/util/List;

    .line 63
    iput-object p3, p0, Lo/eot;->k:Lo/eoy;

    .line 64
    return-void
.end method

.method static synthetic d(Lo/eot;)Lo/eoy;
    .locals 1

    .line 32
    iget-object v0, p0, Lo/eot;->k:Lo/eoy;

    return-object v0
.end method

.method private e(II)Landroid/view/animation/Animation;
    .locals 10

    .line 272
    new-instance v0, Landroid/view/animation/TranslateAnimation;

    int-to-float v4, p1

    int-to-float v8, p2

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v0 .. v8}, Landroid/view/animation/TranslateAnimation;-><init>(IFIFIFIF)V

    move-object v9, v0

    .line 275
    new-instance v0, Landroid/view/animation/AccelerateDecelerateInterpolator;

    invoke-direct {v0}, Landroid/view/animation/AccelerateDecelerateInterpolator;-><init>()V

    .line 276
    invoke-virtual {v9, v0}, Landroid/view/animation/TranslateAnimation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    .line 277
    const/4 v0, 0x1

    invoke-virtual {v9, v0}, Landroid/view/animation/TranslateAnimation;->setFillAfter(Z)V

    .line 278
    const-wide/16 v0, 0x64

    invoke-virtual {v9, v0, v1}, Landroid/view/animation/TranslateAnimation;->setDuration(J)V

    .line 279
    new-instance v0, Landroid/view/animation/AccelerateInterpolator;

    invoke-direct {v0}, Landroid/view/animation/AccelerateInterpolator;-><init>()V

    invoke-virtual {v9, v0}, Landroid/view/animation/TranslateAnimation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    .line 280
    return-object v9
.end method


# virtual methods
.method public a(I)V
    .locals 0

    .line 84
    iput p1, p0, Lo/eot;->b:I

    .line 85
    return-void
.end method

.method public b(I)Ljava/lang/Object;
    .locals 1

    .line 205
    iget-object v0, p0, Lo/eot;->f:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public b(Z)V
    .locals 0

    .line 75
    iput-boolean p1, p0, Lo/eot;->h:Z

    .line 76
    return-void
.end method

.method public c(I)V
    .locals 0

    .line 251
    iput p1, p0, Lo/eot;->g:I

    .line 252
    return-void
.end method

.method public c(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/Integer;>;)V"
        }
    .end annotation

    .line 66
    iput-object p1, p0, Lo/eot;->d:Ljava/util/List;

    .line 67
    return-void
.end method

.method public d()V
    .locals 3

    .line 232
    iget-object v0, p0, Lo/eot;->f:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 233
    iget-object v0, p0, Lo/eot;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/lang/Integer;

    .line 234
    iget-object v0, p0, Lo/eot;->f:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 235
    goto :goto_0

    .line 236
    :cond_0
    return-void
.end method

.method public d(I)V
    .locals 0

    .line 260
    iput p1, p0, Lo/eot;->i:I

    .line 261
    return-void
.end method

.method public d(II)V
    .locals 4

    .line 185
    invoke-virtual {p0, p1}, Lo/eot;->b(I)Ljava/lang/Object;

    move-result-object v3

    .line 187
    if-ge p1, p2, :cond_0

    .line 188
    iget-object v0, p0, Lo/eot;->f:Ljava/util/List;

    add-int/lit8 v1, p2, 0x1

    move-object v2, v3

    check-cast v2, Ljava/lang/Integer;

    invoke-interface {v0, v1, v2}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 189
    iget-object v0, p0, Lo/eot;->f:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    goto :goto_0

    .line 191
    :cond_0
    iget-object v0, p0, Lo/eot;->f:Ljava/util/List;

    move-object v1, v3

    check-cast v1, Ljava/lang/Integer;

    invoke-interface {v0, p2, v1}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 192
    iget-object v0, p0, Lo/eot;->f:Ljava/util/List;

    add-int/lit8 v1, p1, 0x1

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 195
    :goto_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/eot;->a:Z

    .line 196
    return-void
.end method

.method public e()V
    .locals 3

    .line 239
    iget-object v0, p0, Lo/eot;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 240
    iget-object v0, p0, Lo/eot;->f:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/lang/Integer;

    .line 241
    iget-object v0, p0, Lo/eot;->d:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 242
    goto :goto_0

    .line 243
    :cond_0
    return-void
.end method

.method public getCount()I
    .locals 1

    .line 213
    iget-object v0, p0, Lo/eot;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public getItem(I)Ljava/lang/Object;
    .locals 1

    .line 221
    iget-object v0, p0, Lo/eot;->d:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public getItemId(I)J
    .locals 2

    .line 226
    int-to-long v0, p1

    return-wide v0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 9

    .line 93
    iget-object v0, p0, Lo/eot;->c:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$layout;->activity_one_level_menu_item_layout:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p2

    .line 95
    iget-object v0, p0, Lo/eot;->d:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v4

    .line 97
    iget-object v0, p0, Lo/eot;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "=========test=========mContactTables="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/eot;->d:Ljava/util/List;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 99
    sget v0, Lcom/huawei/ui/device/R$id;->itemText:I

    invoke-static {p2, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/widget/TextView;

    .line 100
    sget v0, Lcom/huawei/ui/device/R$id;->item_line:I

    invoke-static {p2, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Landroid/widget/ImageView;

    .line 101
    iget-object v0, p0, Lo/eot;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-ne p1, v0, :cond_0

    .line 102
    const/16 v0, 0x8

    invoke-virtual {v6, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_0

    .line 104
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {v6, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 106
    :goto_0
    invoke-static {}, Lo/eod;->a()Lo/eod;

    move-result-object v0

    iget-object v1, p0, Lo/eot;->c:Landroid/content/Context;

    invoke-virtual {v0, v1, v4}, Lo/eod;->c(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 107
    sget v0, Lcom/huawei/ui/device/R$id;->itemSwitch:I

    invoke-static {p2, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Landroid/widget/ImageView;

    .line 109
    new-instance v0, Lo/eot$2;

    invoke-direct {v0, p0, p1}, Lo/eot$2;-><init>(Lo/eot;I)V

    invoke-virtual {v7, v0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 119
    iget-boolean v0, p0, Lo/eot;->a:Z

    if-eqz v0, :cond_3

    .line 120
    iget v0, p0, Lo/eot;->b:I

    if-ne p1, v0, :cond_1

    .line 121
    iget-boolean v0, p0, Lo/eot;->h:Z

    if-nez v0, :cond_1

    .line 124
    sget v0, Lcom/huawei/ui/device/R$id;->activity_one_level_menu_layout:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 127
    const/4 v8, 0x4

    .line 128
    sget v0, Lcom/huawei/ui/device/R$id;->itemhandle:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v8}, Landroid/view/View;->setVisibility(I)V

    .line 129
    sget v0, Lcom/huawei/ui/device/R$id;->itemSwitch:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v8}, Landroid/view/View;->setVisibility(I)V

    .line 130
    invoke-virtual {v5, v8}, Landroid/widget/TextView;->setVisibility(I)V

    .line 133
    :cond_1
    iget v0, p0, Lo/eot;->g:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_3

    .line 134
    iget v0, p0, Lo/eot;->g:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    .line 135
    iget v0, p0, Lo/eot;->b:I

    if-le p1, v0, :cond_3

    .line 137
    iget v0, p0, Lo/eot;->i:I

    neg-int v0, v0

    const/4 v1, 0x0

    invoke-direct {p0, v1, v0}, Lo/eot;->e(II)Landroid/view/animation/Animation;

    move-result-object v8

    .line 138
    invoke-virtual {p2, v8}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 139
    goto :goto_1

    .line 140
    :cond_2
    iget v0, p0, Lo/eot;->g:I

    if-nez v0, :cond_3

    .line 141
    iget v0, p0, Lo/eot;->b:I

    if-ge p1, v0, :cond_3

    .line 143
    iget v0, p0, Lo/eot;->i:I

    const/4 v1, 0x0

    invoke-direct {p0, v1, v0}, Lo/eot;->e(II)Landroid/view/animation/Animation;

    move-result-object v8

    .line 144
    invoke-virtual {p2, v8}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 150
    :cond_3
    :goto_1
    return-object p2
.end method
