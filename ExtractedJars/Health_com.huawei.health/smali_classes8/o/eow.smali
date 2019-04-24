.class public Lo/eow;
.super Landroid/widget/BaseAdapter;
.source "SourceFile"


# instance fields
.field a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/datatype/Contact;>;"
        }
    .end annotation
.end field

.field private b:I

.field private c:Z

.field private d:Landroid/content/Context;

.field private e:Ljava/lang/String;

.field private f:Z

.field private g:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/datatype/Contact;>;"
        }
    .end annotation
.end field

.field private i:I

.field private k:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Ljava/util/List<Lcom/huawei/datatype/Contact;>;)V"
        }
    .end annotation

    .line 48
    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 34
    const-string v0, "DragListAdapter"

    iput-object v0, p0, Lo/eow;->e:Ljava/lang/String;

    .line 37
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eow;->a:Ljava/util/List;

    .line 162
    const/4 v0, -0x1

    iput v0, p0, Lo/eow;->b:I

    .line 164
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/eow;->c:Z

    .line 166
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/eow;->f:Z

    .line 269
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/eow;->g:Ljava/util/List;

    .line 286
    const/4 v0, -0x1

    iput v0, p0, Lo/eow;->k:I

    .line 49
    iput-object p1, p0, Lo/eow;->d:Landroid/content/Context;

    .line 50
    iput-object p2, p0, Lo/eow;->a:Ljava/util/List;

    .line 51
    return-void
.end method

.method private a(ILandroid/view/View;)V
    .locals 0

    .line 159
    return-void
.end method

.method private e(II)Landroid/view/animation/Animation;
    .locals 10

    .line 334
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

    .line 337
    new-instance v0, Landroid/view/animation/AccelerateDecelerateInterpolator;

    invoke-direct {v0}, Landroid/view/animation/AccelerateDecelerateInterpolator;-><init>()V

    .line 338
    invoke-virtual {v9, v0}, Landroid/view/animation/TranslateAnimation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    .line 339
    const/4 v0, 0x1

    invoke-virtual {v9, v0}, Landroid/view/animation/TranslateAnimation;->setFillAfter(Z)V

    .line 340
    const-wide/16 v0, 0x64

    invoke-virtual {v9, v0, v1}, Landroid/view/animation/TranslateAnimation;->setDuration(J)V

    .line 341
    new-instance v0, Landroid/view/animation/AccelerateInterpolator;

    invoke-direct {v0}, Landroid/view/animation/AccelerateInterpolator;-><init>()V

    invoke-virtual {v9, v0}, Landroid/view/animation/TranslateAnimation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    .line 342
    return-object v9
.end method


# virtual methods
.method public a()V
    .locals 3

    .line 279
    iget-object v0, p0, Lo/eow;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 280
    iget-object v0, p0, Lo/eow;->g:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/datatype/Contact;

    .line 281
    iget-object v0, p0, Lo/eow;->a:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 282
    goto :goto_0

    .line 283
    :cond_0
    return-void
.end method

.method public a(I)V
    .locals 0

    .line 68
    iput p1, p0, Lo/eow;->b:I

    .line 69
    return-void
.end method

.method public b(I)Ljava/lang/Object;
    .locals 1

    .line 233
    iget-object v0, p0, Lo/eow;->g:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public b()V
    .locals 3

    .line 272
    iget-object v0, p0, Lo/eow;->g:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 273
    iget-object v0, p0, Lo/eow;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/datatype/Contact;

    .line 274
    iget-object v0, p0, Lo/eow;->g:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 275
    goto :goto_0

    .line 276
    :cond_0
    return-void
.end method

.method public c(I)V
    .locals 0

    .line 314
    iput p1, p0, Lo/eow;->i:I

    .line 315
    return-void
.end method

.method public c(II)V
    .locals 4

    .line 200
    invoke-virtual {p0, p1}, Lo/eow;->b(I)Ljava/lang/Object;

    move-result-object v3

    .line 202
    if-ge p1, p2, :cond_0

    .line 203
    iget-object v0, p0, Lo/eow;->g:Ljava/util/List;

    add-int/lit8 v1, p2, 0x1

    move-object v2, v3

    check-cast v2, Lcom/huawei/datatype/Contact;

    invoke-interface {v0, v1, v2}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 204
    iget-object v0, p0, Lo/eow;->g:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    goto :goto_0

    .line 206
    :cond_0
    iget-object v0, p0, Lo/eow;->g:Ljava/util/List;

    move-object v1, v3

    check-cast v1, Lcom/huawei/datatype/Contact;

    invoke-interface {v0, p2, v1}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 207
    iget-object v0, p0, Lo/eow;->g:Ljava/util/List;

    add-int/lit8 v1, p1, 0x1

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 210
    :goto_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/eow;->c:Z

    .line 211
    return-void
.end method

.method public c(Z)V
    .locals 0

    .line 59
    iput-boolean p1, p0, Lo/eow;->f:Z

    .line 60
    return-void
.end method

.method public e(I)V
    .locals 0

    .line 305
    iput p1, p0, Lo/eow;->k:I

    .line 306
    return-void
.end method

.method public getCount()I
    .locals 1

    .line 241
    iget-object v0, p0, Lo/eow;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public getItem(I)Ljava/lang/Object;
    .locals 1

    .line 249
    iget-object v0, p0, Lo/eow;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public getItemId(I)J
    .locals 2

    .line 254
    int-to-long v0, p1

    return-wide v0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 8

    .line 77
    iget-object v0, p0, Lo/eow;->d:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$layout;->activity_device_settings_contact_orderby_item_layout_black:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p2

    .line 79
    iget-object v0, p0, Lo/eow;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/datatype/Contact;

    .line 81
    invoke-direct {p0, p1, p2}, Lo/eow;->a(ILandroid/view/View;)V

    .line 82
    iget-object v0, p0, Lo/eow;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "=========test=========mContactTables="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/eow;->a:Ljava/util/List;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 84
    sget v0, Lcom/huawei/ui/device/R$id;->content:I

    invoke-static {p2, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/widget/TextView;

    .line 85
    invoke-virtual {v4}, Lcom/huawei/datatype/Contact;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 86
    sget v0, Lcom/huawei/ui/device/R$id;->summary:I

    invoke-static {p2, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Landroid/widget/TextView;

    .line 87
    invoke-virtual {v4}, Lcom/huawei/datatype/Contact;->getPhoneNumbers()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/datatype/PhoneNumber;

    invoke-virtual {v0}, Lcom/huawei/datatype/PhoneNumber;->getPhone_number()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 89
    iget-boolean v0, p0, Lo/eow;->c:Z

    if-eqz v0, :cond_2

    .line 91
    iget v0, p0, Lo/eow;->b:I

    if-ne p1, v0, :cond_0

    .line 93
    iget-boolean v0, p0, Lo/eow;->f:Z

    if-nez v0, :cond_0

    .line 96
    sget v0, Lcom/huawei/ui/device/R$id;->drag_item_layout:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 99
    const/4 v7, 0x4

    .line 100
    sget v0, Lcom/huawei/ui/device/R$id;->drag_item_image:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 101
    invoke-virtual {v0, v7}, Landroid/view/View;->setVisibility(I)V

    .line 102
    sget v0, Lcom/huawei/ui/device/R$id;->imgView_icon:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 103
    invoke-virtual {v0, v7}, Landroid/view/View;->setVisibility(I)V

    .line 104
    sget v0, Lcom/huawei/ui/device/R$id;->drag_item_divider:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 105
    invoke-virtual {v0, v7}, Landroid/view/View;->setVisibility(I)V

    .line 106
    invoke-virtual {v5, v7}, Landroid/widget/TextView;->setVisibility(I)V

    .line 107
    invoke-virtual {v6, v7}, Landroid/widget/TextView;->setVisibility(I)V

    .line 112
    :cond_0
    iget v0, p0, Lo/eow;->k:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_2

    .line 114
    iget v0, p0, Lo/eow;->k:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 116
    iget v0, p0, Lo/eow;->b:I

    if-le p1, v0, :cond_2

    .line 118
    iget v0, p0, Lo/eow;->i:I

    neg-int v0, v0

    const/4 v1, 0x0

    invoke-direct {p0, v1, v0}, Lo/eow;->e(II)Landroid/view/animation/Animation;

    move-result-object v7

    .line 119
    invoke-virtual {p2, v7}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 120
    goto :goto_0

    .line 122
    :cond_1
    iget v0, p0, Lo/eow;->k:I

    if-nez v0, :cond_2

    .line 124
    iget v0, p0, Lo/eow;->b:I

    if-ge p1, v0, :cond_2

    .line 126
    iget v0, p0, Lo/eow;->i:I

    const/4 v1, 0x0

    invoke-direct {p0, v1, v0}, Lo/eow;->e(II)Landroid/view/animation/Animation;

    move-result-object v7

    .line 127
    invoke-virtual {p2, v7}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 135
    :cond_2
    :goto_0
    return-object p2
.end method
