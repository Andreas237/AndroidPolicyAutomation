.class public Lo/bxf;
.super Landroid/widget/BaseAdapter;
.source "SourceFile"

# interfaces
.implements Lo/byy$e;


# instance fields
.field private a:Lcom/huawei/health/suggestion/model/Plan;

.field private b:Landroid/widget/ListView;

.field private c:I

.field private d:Landroid/content/Context;

.field private e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/bxt;>;"
        }
    .end annotation
.end field

.field private f:I

.field private g:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/health/suggestion/model/WorkoutRecord;>;"
        }
    .end annotation
.end field

.field private h:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Integer;>;"
        }
    .end annotation
.end field

.field private i:I

.field private k:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/widget/ListView;)V
    .locals 1

    .line 48
    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 49
    iput-object p1, p0, Lo/bxf;->d:Landroid/content/Context;

    .line 50
    iput-object p2, p0, Lo/bxf;->b:Landroid/widget/ListView;

    .line 51
    const/4 v0, -0x1

    iput v0, p0, Lo/bxf;->c:I

    .line 52
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/bxf;->e:Ljava/util/List;

    .line 54
    invoke-direct {p0, p1}, Lo/bxf;->c(Landroid/content/Context;)V

    .line 55
    invoke-static {}, Lo/bxu;->a()V

    .line 56
    return-void
.end method

.method static synthetic a(Lo/bxf;)I
    .locals 1

    .line 33
    iget v0, p0, Lo/bxf;->i:I

    return v0
.end method

.method static synthetic a(Lo/bxf;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 33
    iput-object p1, p0, Lo/bxf;->g:Ljava/util/List;

    return-object p1
.end method

.method private a()V
    .locals 3

    .line 188
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    iget-object v1, p0, Lo/bxf;->a:Lcom/huawei/health/suggestion/model/Plan;

    invoke-virtual {v1}, Lcom/huawei/health/suggestion/model/Plan;->acquireId()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lo/bxf$2;

    invoke-direct {v2, p0}, Lo/bxf$2;-><init>(Lo/bxf;)V

    invoke-interface {v0, v1, v2}, Lo/bsp;->i(Ljava/lang/String;Lo/bui;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lo/bxf;->g:Ljava/util/List;

    .line 203
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    iget-object v1, p0, Lo/bxf;->a:Lcom/huawei/health/suggestion/model/Plan;

    invoke-virtual {v1}, Lcom/huawei/health/suggestion/model/Plan;->acquireId()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lo/bsp;->c(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Lo/bxf;->h:Ljava/util/Map;

    .line 204
    iget-object v0, p0, Lo/bxf;->e:Ljava/util/List;

    iget-object v1, p0, Lo/bxf;->g:Ljava/util/List;

    iget-object v2, p0, Lo/bxf;->h:Ljava/util/Map;

    invoke-static {v0, v1, v2}, Lo/bxn;->d(Ljava/util/List;Ljava/util/List;Ljava/util/Map;)V

    .line 205
    invoke-virtual {p0}, Lo/bxf;->notifyDataSetChanged()V

    .line 206
    return-void
.end method

.method private b(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 2

    .line 150
    if-eqz p2, :cond_0

    .line 151
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lo/bxo;

    goto :goto_0

    .line 153
    :cond_0
    new-instance v1, Lo/bxo;

    iget-object v0, p0, Lo/bxf;->d:Landroid/content/Context;

    invoke-direct {v1, v0}, Lo/bxo;-><init>(Landroid/content/Context;)V

    .line 155
    :goto_0
    if-ltz p1, :cond_1

    iget-object v0, p0, Lo/bxf;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge p1, v0, :cond_1

    .line 156
    iget-object v0, p0, Lo/bxf;->e:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/bxt;

    invoke-virtual {v1, v0}, Lo/bxo;->c(Lo/bxt;)V

    .line 158
    :cond_1
    invoke-virtual {v1}, Lo/bxo;->d()Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method static synthetic b(Lo/bxf;)Ljava/util/List;
    .locals 1

    .line 33
    iget-object v0, p0, Lo/bxf;->e:Ljava/util/List;

    return-object v0
.end method

.method static synthetic b(Lo/bxf;Ljava/util/Map;)Ljava/util/Map;
    .locals 0

    .line 33
    iput-object p1, p0, Lo/bxf;->h:Ljava/util/Map;

    return-object p1
.end method

.method private c(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 4

    .line 163
    if-eqz p2, :cond_0

    .line 164
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lo/bxu;

    goto :goto_0

    .line 166
    :cond_0
    new-instance v2, Lo/bxu;

    iget-object v0, p0, Lo/bxf;->d:Landroid/content/Context;

    iget-object v1, p0, Lo/bxf;->b:Landroid/widget/ListView;

    invoke-direct {v2, v0, v1}, Lo/bxu;-><init>(Landroid/content/Context;Landroid/widget/ListView;)V

    .line 168
    invoke-virtual {v2}, Lo/bxu;->e()Lo/byr;

    move-result-object v3

    .line 169
    new-instance v0, Lo/bxf$3;

    invoke-direct {v0, p0, v2, v3}, Lo/bxf$3;-><init>(Lo/bxf;Lo/bxu;Lo/byr;)V

    invoke-virtual {v3, v0}, Lo/byr;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 181
    :goto_0
    if-ltz p1, :cond_1

    iget-object v0, p0, Lo/bxf;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge p1, v0, :cond_1

    .line 182
    iget-object v0, p0, Lo/bxf;->e:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/bxt;

    iget v1, p0, Lo/bxf;->c:I

    invoke-virtual {v2, v0, v1}, Lo/bxu;->b(Lo/bxt;I)V

    .line 184
    :cond_1
    invoke-virtual {v2}, Lo/bxu;->e()Lo/byr;

    move-result-object v0

    return-object v0
.end method

.method static synthetic c(Lo/bxf;)Lcom/huawei/health/suggestion/model/Plan;
    .locals 1

    .line 33
    iget-object v0, p0, Lo/bxf;->a:Lcom/huawei/health/suggestion/model/Plan;

    return-object v0
.end method

.method private c(Landroid/content/Context;)V
    .locals 4

    .line 236
    new-instance v2, Lo/bxo;

    invoke-direct {v2, p1}, Lo/bxo;-><init>(Landroid/content/Context;)V

    .line 237
    invoke-virtual {v2}, Lo/bxo;->d()Landroid/view/View;

    move-result-object v3

    .line 238
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-virtual {v3, v0, v1}, Landroid/view/View;->measure(II)V

    .line 239
    invoke-virtual {v3}, Landroid/view/View;->getMeasuredHeight()I

    move-result v0

    iput v0, p0, Lo/bxf;->f:I

    .line 240
    return-void
.end method

.method private d(I)I
    .locals 4

    .line 209
    const/4 v2, 0x0

    :goto_0
    iget-object v0, p0, Lo/bxf;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v2, v0, :cond_2

    .line 210
    iget-object v0, p0, Lo/bxf;->e:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/bxt;

    .line 211
    invoke-virtual {v3}, Lo/bxt;->a()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 212
    invoke-virtual {v3}, Lo/bxt;->c()Lo/bxv;

    move-result-object v0

    invoke-virtual {v0}, Lo/bxv;->a()I

    move-result v0

    if-eq v0, p1, :cond_0

    invoke-direct {p0, p1, v3}, Lo/bxf;->d(ILo/bxt;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 213
    :cond_0
    return v2

    .line 209
    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 216
    :cond_2
    const/4 v0, -0x1

    return v0
.end method

.method static synthetic d(Lo/bxf;)Ljava/util/List;
    .locals 1

    .line 33
    iget-object v0, p0, Lo/bxf;->g:Ljava/util/List;

    return-object v0
.end method

.method private d(ILo/bxt;)Z
    .locals 4

    .line 220
    invoke-virtual {p2}, Lo/bxt;->e()Ljava/util/List;

    move-result-object v1

    .line 221
    if-nez v1, :cond_0

    .line 222
    const/4 v0, 0x0

    return v0

    .line 225
    :cond_0
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/bxv;

    .line 226
    invoke-virtual {v3}, Lo/bxv;->a()I

    move-result v0

    if-ne v0, p1, :cond_1

    .line 227
    const/4 v0, 0x1

    return v0

    .line 229
    :cond_1
    goto :goto_0

    .line 231
    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method static synthetic e(Lo/bxf;)Landroid/widget/ListView;
    .locals 1

    .line 33
    iget-object v0, p0, Lo/bxf;->b:Landroid/widget/ListView;

    return-object v0
.end method

.method static synthetic f(Lo/bxf;)Ljava/util/Map;
    .locals 1

    .line 33
    iget-object v0, p0, Lo/bxf;->h:Ljava/util/Map;

    return-object v0
.end method


# virtual methods
.method public a(I)V
    .locals 3

    .line 68
    iput p1, p0, Lo/bxf;->c:I

    .line 69
    invoke-direct {p0, p1}, Lo/bxf;->d(I)I

    move-result v0

    iput v0, p0, Lo/bxf;->k:I

    .line 85
    invoke-static {}, Lo/bxu;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 86
    const/4 v0, 0x0

    invoke-static {v0}, Lo/bxu;->c(Z)V

    .line 87
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    iget-object v1, p0, Lo/bxf;->a:Lcom/huawei/health/suggestion/model/Plan;

    invoke-virtual {v1}, Lcom/huawei/health/suggestion/model/Plan;->acquireId()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lo/bsp;->g(Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lo/bxf;->g:Ljava/util/List;

    .line 88
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    iget-object v1, p0, Lo/bxf;->a:Lcom/huawei/health/suggestion/model/Plan;

    invoke-virtual {v1}, Lcom/huawei/health/suggestion/model/Plan;->acquireId()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lo/bsp;->c(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Lo/bxf;->h:Ljava/util/Map;

    .line 89
    iget-object v0, p0, Lo/bxf;->e:Ljava/util/List;

    iget-object v1, p0, Lo/bxf;->g:Ljava/util/List;

    iget-object v2, p0, Lo/bxf;->h:Ljava/util/Map;

    invoke-static {v0, v1, v2}, Lo/bxn;->d(Ljava/util/List;Ljava/util/List;Ljava/util/Map;)V

    .line 91
    :cond_0
    invoke-virtual {p0}, Lo/bxf;->notifyDataSetChanged()V

    .line 92
    return-void
.end method

.method public b()I
    .locals 1

    .line 96
    iget v0, p0, Lo/bxf;->k:I

    return v0
.end method

.method public b(I)V
    .locals 0

    .line 104
    iput p1, p0, Lo/bxf;->i:I

    .line 105
    return-void
.end method

.method public b(Lcom/huawei/health/suggestion/model/Plan;)V
    .locals 4

    .line 59
    const-string v0, "Suggestion_ShowPlanAdapter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setData"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 60
    iput-object p1, p0, Lo/bxf;->a:Lcom/huawei/health/suggestion/model/Plan;

    .line 61
    invoke-static {p1}, Lo/bxn;->e(Lcom/huawei/health/suggestion/model/Plan;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lo/bxf;->e:Ljava/util/List;

    .line 62
    iget v0, p0, Lo/bxf;->c:I

    invoke-direct {p0, v0}, Lo/bxf;->d(I)I

    move-result v0

    iput v0, p0, Lo/bxf;->k:I

    .line 63
    const-string v0, "Suggestion_ShowPlanAdapter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initRecords"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 64
    invoke-direct {p0}, Lo/bxf;->a()V

    .line 65
    return-void
.end method

.method public e()I
    .locals 1

    .line 100
    iget v0, p0, Lo/bxf;->f:I

    return v0
.end method

.method public e(I)Z
    .locals 1

    .line 109
    if-nez p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public getCount()I
    .locals 1

    .line 114
    iget-object v0, p0, Lo/bxf;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public getItem(I)Ljava/lang/Object;
    .locals 1

    .line 119
    iget-object v0, p0, Lo/bxf;->e:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public getItemId(I)J
    .locals 2

    .line 124
    int-to-long v0, p1

    return-wide v0
.end method

.method public getItemViewType(I)I
    .locals 1

    .line 129
    iget-object v0, p0, Lo/bxf;->e:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/bxt;

    invoke-virtual {v0}, Lo/bxt;->a()I

    move-result v0

    return v0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 1

    .line 139
    invoke-virtual {p0, p1}, Lo/bxf;->getItemViewType(I)I

    move-result v0

    .line 140
    if-nez v0, :cond_0

    .line 141
    invoke-direct {p0, p1, p2, p3}, Lo/bxf;->b(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p2

    goto :goto_0

    .line 143
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lo/bxf;->c(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p2

    .line 145
    :goto_0
    return-object p2
.end method

.method public getViewTypeCount()I
    .locals 1

    .line 134
    const/4 v0, 0x2

    return v0
.end method
