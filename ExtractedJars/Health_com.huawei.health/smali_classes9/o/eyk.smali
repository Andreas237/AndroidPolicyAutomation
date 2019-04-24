.class public Lo/eyk;
.super Landroid/widget/LinearLayout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/eyk$b;,
        Lo/eyk$h;,
        Lo/eyk$d;,
        Lo/eyk$a;,
        Lo/eyk$c;,
        Lo/eyk$e;
    }
.end annotation


# instance fields
.field private a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/eyk$e;>;"
        }
    .end annotation
.end field

.field private b:Lo/eyl;

.field private c:Lo/eyk$d;

.field private d:Landroid/support/v4/view/PagerAdapter;

.field private e:Lo/faa;

.field private g:Lo/eyk$b;

.field private i:Lo/ezv;

.field private k:Lo/egl;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 93
    invoke-direct {p0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 42
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/eyk;->a:Ljava/util/List;

    .line 47
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eyk;->c:Lo/eyk$d;

    .line 48
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eyk;->k:Lo/egl;

    .line 367
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eyk;->i:Lo/ezv;

    .line 94
    invoke-direct {p0}, Lo/eyk;->b()V

    .line 95
    invoke-direct {p0}, Lo/eyk;->a()V

    .line 96
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 99
    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 42
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/eyk;->a:Ljava/util/List;

    .line 47
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eyk;->c:Lo/eyk$d;

    .line 48
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eyk;->k:Lo/egl;

    .line 367
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eyk;->i:Lo/ezv;

    .line 100
    invoke-direct {p0}, Lo/eyk;->b()V

    .line 101
    invoke-direct {p0}, Lo/eyk;->a()V

    .line 102
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 105
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 42
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/eyk;->a:Ljava/util/List;

    .line 47
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eyk;->c:Lo/eyk$d;

    .line 48
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eyk;->k:Lo/egl;

    .line 367
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eyk;->i:Lo/ezv;

    .line 106
    invoke-direct {p0}, Lo/eyk;->b()V

    .line 107
    invoke-direct {p0}, Lo/eyk;->a()V

    .line 108
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lo/eyl;Lo/faa;)V
    .locals 1

    .line 114
    invoke-direct {p0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 42
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/eyk;->a:Ljava/util/List;

    .line 47
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eyk;->c:Lo/eyk$d;

    .line 48
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eyk;->k:Lo/egl;

    .line 367
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eyk;->i:Lo/ezv;

    .line 115
    iput-object p2, p0, Lo/eyk;->b:Lo/eyl;

    .line 116
    iput-object p3, p0, Lo/eyk;->e:Lo/faa;

    .line 117
    invoke-direct {p0}, Lo/eyk;->a()V

    .line 118
    return-void
.end method

.method static synthetic a(Lo/eyk;Lo/egl$c;)I
    .locals 1

    .line 37
    invoke-direct {p0, p1}, Lo/eyk;->d(Lo/egl$c;)I

    move-result v0

    return v0
.end method

.method static synthetic a(Lo/eyk;)Lo/faa;
    .locals 1

    .line 37
    iget-object v0, p0, Lo/eyk;->e:Lo/faa;

    return-object v0
.end method

.method private a()V
    .locals 2

    .line 130
    new-instance v0, Lo/eyk$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lo/eyk$a;-><init>(Lo/eyk;Lo/eyk$3;)V

    iput-object v0, p0, Lo/eyk;->d:Landroid/support/v4/view/PagerAdapter;

    .line 131
    iget-object v0, p0, Lo/eyk;->e:Lo/faa;

    iget-object v1, p0, Lo/eyk;->d:Landroid/support/v4/view/PagerAdapter;

    invoke-virtual {v0, v1}, Lo/faa;->setAdapter(Landroid/support/v4/view/PagerAdapter;)V

    .line 133
    new-instance v0, Lo/egl;

    invoke-direct {v0}, Lo/egl;-><init>()V

    iput-object v0, p0, Lo/eyk;->k:Lo/egl;

    .line 135
    iget-object v0, p0, Lo/eyk;->k:Lo/egl;

    sget-object v1, Lo/egl$c;->a:Lo/egl$c;

    invoke-virtual {v0, v1}, Lo/egl;->b(Lo/egl$c;)V

    .line 136
    iget-object v0, p0, Lo/eyk;->k:Lo/egl;

    new-instance v1, Lo/eyk$3;

    invoke-direct {v1, p0}, Lo/eyk$3;-><init>(Lo/eyk;)V

    invoke-virtual {v0, v1}, Lo/egl;->b(Lo/egl$e;)V

    .line 148
    return-void
.end method

.method static synthetic b(Lo/eyk;)Lo/eyl;
    .locals 1

    .line 37
    iget-object v0, p0, Lo/eyk;->b:Lo/eyl;

    return-object v0
.end method

.method private b()V
    .locals 2

    .line 121
    invoke-virtual {p0}, Lo/eyk;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$layout;->view_classified_list:I

    invoke-static {v0, v1, p0}, Lo/eyk;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 122
    sget v0, Lcom/huawei/ui/main/R$id;->classified_button_list:I

    invoke-virtual {p0, v0}, Lo/eyk;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/eyl;

    iput-object v0, p0, Lo/eyk;->b:Lo/eyl;

    .line 123
    sget v0, Lcom/huawei/ui/main/R$id;->classified_view_place:I

    invoke-virtual {p0, v0}, Lo/eyk;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/faa;

    iput-object v0, p0, Lo/eyk;->e:Lo/faa;

    .line 124
    return-void
.end method

.method static synthetic c(Lo/eyk;)Ljava/util/List;
    .locals 1

    .line 37
    iget-object v0, p0, Lo/eyk;->a:Ljava/util/List;

    return-object v0
.end method

.method private d(Lo/egl$c;)I
    .locals 2

    .line 151
    const/4 v1, 0x0

    :goto_0
    iget-object v0, p0, Lo/eyk;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v1, v0, :cond_1

    .line 152
    iget-object v0, p0, Lo/eyk;->a:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/eyk$e;

    invoke-interface {v0}, Lo/eyk$e;->getStepDataType()Lo/eic;

    move-result-object v0

    invoke-static {v0}, Lo/egl$c;->c(Lo/eic;)Lo/egl$c;

    move-result-object v0

    if-ne v0, p1, :cond_0

    .line 153
    return v1

    .line 151
    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 156
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method static synthetic d(Lo/eyk;I)Lo/egl$c;
    .locals 1

    .line 37
    invoke-direct {p0, p1}, Lo/eyk;->e(I)Lo/egl$c;

    move-result-object v0

    return-object v0
.end method

.method static synthetic d(Lo/eyk;)Lo/egl;
    .locals 1

    .line 37
    iget-object v0, p0, Lo/eyk;->k:Lo/egl;

    return-object v0
.end method

.method private e(I)Lo/egl$c;
    .locals 1

    .line 160
    iget-object v0, p0, Lo/eyk;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/eyk$e;

    invoke-interface {v0}, Lo/eyk$e;->getStepDataType()Lo/eic;

    move-result-object v0

    invoke-static {v0}, Lo/egl$c;->c(Lo/eic;)Lo/egl$c;

    move-result-object v0

    return-object v0
.end method

.method static synthetic e(Lo/eyk;)Lo/eyk$b;
    .locals 1

    .line 37
    iget-object v0, p0, Lo/eyk;->g:Lo/eyk$b;

    return-object v0
.end method

.method static synthetic h(Lo/eyk;)Lo/ezv;
    .locals 1

    .line 37
    iget-object v0, p0, Lo/eyk;->i:Lo/ezv;

    return-object v0
.end method


# virtual methods
.method public a(Ljava/util/List;Lo/ejf;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/eyk$e;>;Lo/ejf;)V"
        }
    .end annotation

    .line 173
    iget-object v0, p0, Lo/eyk;->e:Lo/faa;

    invoke-virtual {v0}, Lo/faa;->b()V

    .line 174
    iget-object v0, p0, Lo/eyk;->e:Lo/faa;

    invoke-virtual {v0}, Lo/faa;->a()V

    .line 175
    iget-object v0, p0, Lo/eyk;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 176
    iget-object v0, p0, Lo/eyk;->c:Lo/eyk$d;

    if-eqz v0, :cond_0

    .line 177
    iget-object v0, p0, Lo/eyk;->c:Lo/eyk$d;

    invoke-virtual {v0}, Lo/eyk$d;->e()V

    .line 180
    :cond_0
    iget-object v0, p0, Lo/eyk;->c:Lo/eyk$d;

    if-nez v0, :cond_1

    .line 181
    new-instance v0, Lo/eyk$d;

    invoke-direct {v0, p0}, Lo/eyk$d;-><init>(Lo/eyk;)V

    iput-object v0, p0, Lo/eyk;->c:Lo/eyk$d;

    .line 183
    :cond_1
    iget-object v0, p0, Lo/eyk;->c:Lo/eyk$d;

    invoke-virtual {v0}, Lo/eyk$d;->d()V

    .line 186
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_2

    .line 187
    iget-object v0, p0, Lo/eyk;->c:Lo/eyk$d;

    const/4 v1, 0x0

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/eyk$e;

    invoke-interface {v1}, Lo/eyk$e;->getStepDataType()Lo/eic;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/eyk$d;->b(Lo/eic;)V

    .line 190
    :cond_2
    iget-object v0, p0, Lo/eyk;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 191
    iget-object v0, p0, Lo/eyk;->b:Lo/eyl;

    iget-object v1, p0, Lo/eyk;->a:Ljava/util/List;

    new-instance v2, Lo/eyk$1;

    invoke-direct {v2, p0}, Lo/eyk$1;-><init>(Lo/eyk;)V

    invoke-virtual {v0, v1, v2}, Lo/eyl;->c(Ljava/util/List;Lo/eyl$a;)V

    .line 198
    iget-object v0, p0, Lo/eyk;->e:Lo/faa;

    new-instance v1, Lo/eyk$4;

    invoke-direct {v1, p0}, Lo/eyk$4;-><init>(Lo/eyk;)V

    invoke-virtual {v0, v1}, Lo/faa;->b(Lo/faa$b;)V

    .line 218
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/eyk$e;

    .line 219
    invoke-interface {v4, p2}, Lo/eyk$e;->a(Lo/ejf;)V

    .line 223
    goto :goto_0

    .line 224
    :cond_3
    iget-object v0, p0, Lo/eyk;->d:Landroid/support/v4/view/PagerAdapter;

    invoke-virtual {v0}, Landroid/support/v4/view/PagerAdapter;->notifyDataSetChanged()V

    .line 225
    iget-object v0, p0, Lo/eyk;->e:Lo/faa;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/faa;->setCurrentItem(I)V

    .line 227
    iget-object v0, p0, Lo/eyk;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/eyk$e;

    .line 228
    iget-object v0, p0, Lo/eyk;->c:Lo/eyk$d;

    invoke-interface {v4, v0}, Lo/eyk$e;->setOnDataShowListener(Lo/ezv;)V

    .line 229
    iget-object v0, p0, Lo/eyk;->k:Lo/egl;

    invoke-interface {v4, v0}, Lo/eyk$e;->a(Lo/egl;)V

    .line 230
    goto :goto_1

    .line 231
    :cond_4
    iget-object v0, p0, Lo/eyk;->d:Landroid/support/v4/view/PagerAdapter;

    invoke-virtual {v0}, Landroid/support/v4/view/PagerAdapter;->notifyDataSetChanged()V

    .line 233
    iget-object v0, p0, Lo/eyk;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/eyk$e;

    .line 235
    invoke-interface {v4}, Lo/eyk$e;->c()Lo/ezh;

    move-result-object v0

    iget-object v1, p0, Lo/eyk;->k:Lo/egl;

    invoke-virtual {v0, v1}, Lo/ezh;->e(Lo/egl;)V

    .line 236
    goto :goto_2

    .line 237
    :cond_5
    return-void
.end method

.method public b(Ljava/util/List;Lo/ejf;Lo/eyk$e;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/eyk$e;>;Lo/ejf;Lo/eyk$e;)V"
        }
    .end annotation

    .line 164
    invoke-virtual {p0, p1, p2}, Lo/eyk;->a(Ljava/util/List;Lo/ejf;)V

    .line 166
    iget-object v0, p0, Lo/eyk;->k:Lo/egl;

    invoke-interface {p3}, Lo/eyk$e;->getStepDataType()Lo/eic;

    move-result-object v1

    invoke-static {v1}, Lo/egl$c;->c(Lo/eic;)Lo/egl$c;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egl;->b(Lo/egl$c;)V

    .line 167
    return-void
.end method

.method public c()Ljava/lang/String;
    .locals 4

    .line 471
    iget-object v0, p0, Lo/eyk;->d:Landroid/support/v4/view/PagerAdapter;

    iget-object v1, p0, Lo/eyk;->e:Lo/faa;

    iget-object v2, p0, Lo/eyk;->e:Lo/faa;

    .line 472
    invoke-virtual {v2}, Lo/faa;->getCurrentItem()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Landroid/support/v4/view/PagerAdapter;->instantiateItem(Landroid/view/ViewGroup;I)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/ezh;

    .line 473
    invoke-virtual {v3}, Lo/ezh;->k()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public c(Ljava/util/List;Lo/eyk$c;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/eyk$e;>;Lo/eyk$c;)V"
        }
    .end annotation

    .line 245
    iget-object v0, p0, Lo/eyk;->e:Lo/faa;

    invoke-virtual {v0}, Lo/faa;->b()V

    .line 246
    iget-object v0, p0, Lo/eyk;->e:Lo/faa;

    invoke-virtual {v0}, Lo/faa;->a()V

    .line 247
    iget-object v0, p0, Lo/eyk;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 248
    iget-object v0, p0, Lo/eyk;->c:Lo/eyk$d;

    if-eqz v0, :cond_0

    .line 249
    iget-object v0, p0, Lo/eyk;->c:Lo/eyk$d;

    invoke-virtual {v0}, Lo/eyk$d;->e()V

    .line 252
    :cond_0
    iget-object v0, p0, Lo/eyk;->c:Lo/eyk$d;

    if-nez v0, :cond_1

    .line 253
    new-instance v0, Lo/eyk$d;

    invoke-direct {v0, p0}, Lo/eyk$d;-><init>(Lo/eyk;)V

    iput-object v0, p0, Lo/eyk;->c:Lo/eyk$d;

    .line 255
    :cond_1
    iget-object v0, p0, Lo/eyk;->c:Lo/eyk$d;

    invoke-virtual {v0}, Lo/eyk$d;->d()V

    .line 257
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_2

    .line 258
    iget-object v0, p0, Lo/eyk;->c:Lo/eyk$d;

    const/4 v1, 0x0

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/eyk$e;

    invoke-interface {v1}, Lo/eyk$e;->getStepDataType()Lo/eic;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/eyk$d;->b(Lo/eic;)V

    .line 262
    :cond_2
    iget-object v0, p0, Lo/eyk;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 263
    iget-object v0, p0, Lo/eyk;->b:Lo/eyl;

    iget-object v1, p0, Lo/eyk;->a:Ljava/util/List;

    new-instance v2, Lo/eyk$5;

    invoke-direct {v2, p0}, Lo/eyk$5;-><init>(Lo/eyk;)V

    invoke-virtual {v0, v1, v2}, Lo/eyl;->c(Ljava/util/List;Lo/eyl$a;)V

    .line 270
    iget-object v0, p0, Lo/eyk;->e:Lo/faa;

    new-instance v1, Lo/eyk$2;

    invoke-direct {v1, p0}, Lo/eyk$2;-><init>(Lo/eyk;)V

    invoke-virtual {v0, v1}, Lo/faa;->b(Lo/faa$b;)V

    .line 290
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/eyk$e;

    .line 291
    invoke-interface {p2, v4}, Lo/eyk$c;->d(Lo/eyk$e;)Lo/ejf;

    move-result-object v5

    .line 292
    if-eqz v5, :cond_3

    .line 293
    invoke-interface {v4, v5}, Lo/eyk$e;->a(Lo/ejf;)V

    .line 298
    :cond_3
    goto :goto_0

    .line 299
    :cond_4
    iget-object v0, p0, Lo/eyk;->d:Landroid/support/v4/view/PagerAdapter;

    invoke-virtual {v0}, Landroid/support/v4/view/PagerAdapter;->notifyDataSetChanged()V

    .line 300
    iget-object v0, p0, Lo/eyk;->e:Lo/faa;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/faa;->setCurrentItem(I)V

    .line 302
    iget-object v0, p0, Lo/eyk;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/eyk$e;

    .line 303
    iget-object v0, p0, Lo/eyk;->c:Lo/eyk$d;

    invoke-interface {v4, v0}, Lo/eyk$e;->setOnDataShowListener(Lo/ezv;)V

    .line 304
    iget-object v0, p0, Lo/eyk;->k:Lo/egl;

    invoke-interface {v4, v0}, Lo/eyk$e;->a(Lo/egl;)V

    .line 305
    goto :goto_1

    .line 306
    :cond_5
    iget-object v0, p0, Lo/eyk;->d:Landroid/support/v4/view/PagerAdapter;

    invoke-virtual {v0}, Landroid/support/v4/view/PagerAdapter;->notifyDataSetChanged()V

    .line 308
    iget-object v0, p0, Lo/eyk;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/eyk$e;

    .line 310
    invoke-interface {v4}, Lo/eyk$e;->c()Lo/ezh;

    move-result-object v0

    iget-object v1, p0, Lo/eyk;->k:Lo/egl;

    invoke-virtual {v0, v1}, Lo/ezh;->e(Lo/egl;)V

    .line 311
    goto :goto_2

    .line 312
    :cond_6
    return-void
.end method

.method public d()Lo/ezt;
    .locals 7

    .line 59
    const/4 v3, 0x0

    .line 61
    iget-object v0, p0, Lo/eyk;->e:Lo/faa;

    invoke-virtual {v0}, Lo/faa;->getCurrentItem()I

    move-result v4

    .line 62
    iget-object v0, p0, Lo/eyk;->d:Landroid/support/v4/view/PagerAdapter;

    iget-object v1, p0, Lo/eyk;->e:Lo/faa;

    .line 63
    invoke-virtual {v0, v1, v4}, Landroid/support/v4/view/PagerAdapter;->instantiateItem(Landroid/view/ViewGroup;I)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/ezh;

    .line 64
    invoke-virtual {v5}, Lo/ezh;->d()Lo/ezj;

    move-result-object v6

    .line 66
    instance-of v0, v6, Lo/ezi;

    if-eqz v0, :cond_0

    .line 67
    invoke-virtual {v6}, Lo/ezj;->c()Lo/ezt;

    move-result-object v3

    .line 68
    return-object v3

    .line 71
    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "current not support "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " for focus view"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public d(Lo/ezv;)V
    .locals 2

    .line 370
    move-object v0, p0

    monitor-enter v0

    .line 371
    :try_start_0
    iput-object p1, p0, Lo/eyk;->i:Lo/ezv;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 372
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1

    .line 373
    :goto_0
    return-void
.end method

.method public e()Landroid/graphics/Bitmap;
    .locals 5

    .line 51
    iget-object v0, p0, Lo/eyk;->d:Landroid/support/v4/view/PagerAdapter;

    iget-object v1, p0, Lo/eyk;->e:Lo/faa;

    iget-object v2, p0, Lo/eyk;->e:Lo/faa;

    .line 52
    invoke-virtual {v2}, Lo/faa;->getCurrentItem()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Landroid/support/v4/view/PagerAdapter;->instantiateItem(Landroid/view/ViewGroup;I)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/ezh;

    .line 53
    invoke-virtual {v3}, Lo/ezh;->i()Landroid/graphics/Bitmap;

    move-result-object v4

    .line 54
    return-object v4
.end method

.method public setOnClassifiedViewChangeListener(Lo/eyk$b;)V
    .locals 0

    .line 481
    iput-object p1, p0, Lo/eyk;->g:Lo/eyk$b;

    .line 482
    return-void
.end method
