.class Lo/eyk$a;
.super Landroid/support/v4/view/PagerAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/eyk;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation


# instance fields
.field final synthetic c:Lo/eyk;


# direct methods
.method private constructor <init>(Lo/eyk;)V
    .locals 0

    .line 315
    iput-object p1, p0, Lo/eyk$a;->c:Lo/eyk;

    invoke-direct {p0}, Landroid/support/v4/view/PagerAdapter;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lo/eyk;Lo/eyk$3;)V
    .locals 0

    .line 315
    invoke-direct {p0, p1}, Lo/eyk$a;-><init>(Lo/eyk;)V

    return-void
.end method


# virtual methods
.method public destroyItem(Landroid/view/ViewGroup;ILjava/lang/Object;)V
    .locals 0

    .line 356
    return-void
.end method

.method public getCount()I
    .locals 1

    .line 319
    iget-object v0, p0, Lo/eyk$a;->c:Lo/eyk;

    invoke-static {v0}, Lo/eyk;->c(Lo/eyk;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public getItemPosition(Ljava/lang/Object;)I
    .locals 1

    .line 361
    iget-object v0, p0, Lo/eyk$a;->c:Lo/eyk;

    invoke-static {v0}, Lo/eyk;->c(Lo/eyk;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 362
    const/4 v0, -0x1

    return v0

    .line 364
    :cond_0
    const/4 v0, -0x2

    return v0
.end method

.method public instantiateItem(Landroid/view/ViewGroup;I)Ljava/lang/Object;
    .locals 5

    .line 329
    if-nez p1, :cond_0

    .line 330
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "instantiateItem arg:container null"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 333
    :cond_0
    iget-object v0, p0, Lo/eyk$a;->c:Lo/eyk;

    invoke-static {v0}, Lo/eyk;->c(Lo/eyk;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/eyk$e;

    invoke-interface {v0}, Lo/eyk$e;->c()Lo/ezh;

    move-result-object v2

    .line 334
    invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v3

    .line 336
    if-nez v3, :cond_1

    .line 337
    const/4 v0, -0x1

    const/4 v1, -0x2

    invoke-virtual {p1, v2, v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;II)V

    .line 338
    return-object v2

    .line 340
    :cond_1
    if-ne v3, p1, :cond_2

    .line 341
    return-object v2

    .line 347
    :cond_2
    move-object v4, v3

    check-cast v4, Landroid/view/ViewGroup;

    .line 348
    invoke-virtual {v4, v2}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 349
    const/4 v0, -0x1

    const/4 v1, -0x2

    invoke-virtual {p1, v2, v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;II)V

    .line 350
    return-object v2
.end method

.method public isViewFromObject(Landroid/view/View;Ljava/lang/Object;)Z
    .locals 1

    .line 324
    if-ne p1, p2, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
