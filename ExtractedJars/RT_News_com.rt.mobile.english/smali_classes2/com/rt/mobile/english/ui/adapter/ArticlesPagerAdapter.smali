.class public Lcom/rt/mobile/english/ui/adapter/ArticlesPagerAdapter;
.super Landroid/support/v4/app/FragmentStatePagerAdapter;
.source "ArticlesPagerAdapter.java"


# instance fields
.field private listSection:Lcom/rt/mobile/english/data/Message;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/rt/mobile/english/data/Message<",
            "Ljava/util/List<",
            "Lcom/rt/mobile/english/data/articles/Section;",
            ">;>;"
        }
    .end annotation
.end field

.field private otherNews:Z


# direct methods
.method public constructor <init>(Landroid/support/v4/app/FragmentManager;Lcom/rt/mobile/english/data/Message;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/support/v4/app/FragmentManager;",
            "Lcom/rt/mobile/english/data/Message<",
            "Ljava/util/List<",
            "Lcom/rt/mobile/english/data/articles/Section;",
            ">;>;Z)V"
        }
    .end annotation

    .line 28
    invoke-direct {p0, p1}, Landroid/support/v4/app/FragmentStatePagerAdapter;-><init>(Landroid/support/v4/app/FragmentManager;)V

    const/4 p1, 0x0

    .line 25
    iput-boolean p1, p0, Lcom/rt/mobile/english/ui/adapter/ArticlesPagerAdapter;->otherNews:Z

    .line 29
    iput-object p2, p0, Lcom/rt/mobile/english/ui/adapter/ArticlesPagerAdapter;->listSection:Lcom/rt/mobile/english/data/Message;

    .line 30
    iput-boolean p3, p0, Lcom/rt/mobile/english/ui/adapter/ArticlesPagerAdapter;->otherNews:Z

    return-void
.end method


# virtual methods
.method public getCount()I
    .locals 2

    .line 64
    invoke-static {}, Lcom/rt/mobile/english/Utils;->getInstance()Lcom/rt/mobile/english/Utils;

    move-result-object v0

    invoke-virtual {v0}, Lcom/rt/mobile/english/Utils;->getLocaleVersion()Lcom/rt/mobile/english/Utils$EditionEnum;

    move-result-object v0

    sget-object v1, Lcom/rt/mobile/english/Utils$EditionEnum;->ES:Lcom/rt/mobile/english/Utils$EditionEnum;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    .line 67
    :cond_0
    iget-object v0, p0, Lcom/rt/mobile/english/ui/adapter/ArticlesPagerAdapter;->listSection:Lcom/rt/mobile/english/data/Message;

    invoke-virtual {v0}, Lcom/rt/mobile/english/data/Message;->getData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public getItem(I)Landroid/support/v4/app/Fragment;
    .locals 4

    .line 45
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 46
    invoke-static {}, Lcom/rt/mobile/english/Utils;->getInstance()Lcom/rt/mobile/english/Utils;

    move-result-object v1

    invoke-virtual {v1}, Lcom/rt/mobile/english/Utils;->getLocaleVersion()Lcom/rt/mobile/english/Utils$EditionEnum;

    move-result-object v1

    sget-object v2, Lcom/rt/mobile/english/Utils$EditionEnum;->AR:Lcom/rt/mobile/english/Utils$EditionEnum;

    if-ne v1, v2, :cond_0

    const-string v1, "section_id"

    .line 47
    iget-object v2, p0, Lcom/rt/mobile/english/ui/adapter/ArticlesPagerAdapter;->listSection:Lcom/rt/mobile/english/data/Message;

    invoke-virtual {v2}, Lcom/rt/mobile/english/data/Message;->getData()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    iget-object v3, p0, Lcom/rt/mobile/english/ui/adapter/ArticlesPagerAdapter;->listSection:Lcom/rt/mobile/english/data/Message;

    invoke-virtual {v3}, Lcom/rt/mobile/english/data/Message;->getData()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    add-int/lit8 v3, v3, -0x1

    sub-int/2addr v3, p1

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/rt/mobile/english/data/articles/Section;

    invoke-virtual {v2}, Lcom/rt/mobile/english/data/articles/Section;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "section_title"

    .line 48
    iget-object v2, p0, Lcom/rt/mobile/english/ui/adapter/ArticlesPagerAdapter;->listSection:Lcom/rt/mobile/english/data/Message;

    invoke-virtual {v2}, Lcom/rt/mobile/english/data/Message;->getData()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    iget-object v3, p0, Lcom/rt/mobile/english/ui/adapter/ArticlesPagerAdapter;->listSection:Lcom/rt/mobile/english/data/Message;

    invoke-virtual {v3}, Lcom/rt/mobile/english/data/Message;->getData()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    add-int/lit8 v3, v3, -0x1

    sub-int/2addr v3, p1

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/rt/mobile/english/data/articles/Section;

    invoke-virtual {v2}, Lcom/rt/mobile/english/data/articles/Section;->getTitle()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "section_position"

    .line 49
    iget-object v2, p0, Lcom/rt/mobile/english/ui/adapter/ArticlesPagerAdapter;->listSection:Lcom/rt/mobile/english/data/Message;

    invoke-virtual {v2}, Lcom/rt/mobile/english/data/Message;->getData()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    sub-int/2addr v2, p1

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    goto :goto_0

    :cond_0
    const-string v1, "section_id"

    .line 51
    iget-object v2, p0, Lcom/rt/mobile/english/ui/adapter/ArticlesPagerAdapter;->listSection:Lcom/rt/mobile/english/data/Message;

    invoke-virtual {v2}, Lcom/rt/mobile/english/data/Message;->getData()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    invoke-interface {v2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/rt/mobile/english/data/articles/Section;

    invoke-virtual {v2}, Lcom/rt/mobile/english/data/articles/Section;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "section_title"

    .line 52
    iget-object v2, p0, Lcom/rt/mobile/english/ui/adapter/ArticlesPagerAdapter;->listSection:Lcom/rt/mobile/english/data/Message;

    invoke-virtual {v2}, Lcom/rt/mobile/english/data/Message;->getData()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    invoke-interface {v2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/rt/mobile/english/data/articles/Section;

    invoke-virtual {v2}, Lcom/rt/mobile/english/data/articles/Section;->getTitle()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "section_position"

    .line 53
    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    :goto_0
    const-string p1, "other_news"

    .line 55
    iget-boolean v1, p0, Lcom/rt/mobile/english/ui/adapter/ArticlesPagerAdapter;->otherNews:Z

    invoke-virtual {v0, p1, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 56
    new-instance p1, Lcom/rt/mobile/english/ui/ArticlesRecyclerViewFragment;

    invoke-direct {p1}, Lcom/rt/mobile/english/ui/ArticlesRecyclerViewFragment;-><init>()V

    .line 57
    invoke-virtual {p1, v0}, Lcom/rt/mobile/english/ui/ArticlesRecyclerViewFragment;->setArguments(Landroid/os/Bundle;)V

    return-object p1
.end method

.method public getPageTitle(I)Ljava/lang/CharSequence;
    .locals 2

    .line 36
    invoke-static {}, Lcom/rt/mobile/english/Utils;->getInstance()Lcom/rt/mobile/english/Utils;

    move-result-object v0

    invoke-virtual {v0}, Lcom/rt/mobile/english/Utils;->getLocaleVersion()Lcom/rt/mobile/english/Utils$EditionEnum;

    move-result-object v0

    sget-object v1, Lcom/rt/mobile/english/Utils$EditionEnum;->AR:Lcom/rt/mobile/english/Utils$EditionEnum;

    if-ne v0, v1, :cond_0

    .line 37
    iget-object v0, p0, Lcom/rt/mobile/english/ui/adapter/ArticlesPagerAdapter;->listSection:Lcom/rt/mobile/english/data/Message;

    invoke-virtual {v0}, Lcom/rt/mobile/english/data/Message;->getData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    iget-object v1, p0, Lcom/rt/mobile/english/ui/adapter/ArticlesPagerAdapter;->listSection:Lcom/rt/mobile/english/data/Message;

    invoke-virtual {v1}, Lcom/rt/mobile/english/data/Message;->getData()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    sub-int/2addr v1, p1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/rt/mobile/english/data/articles/Section;

    invoke-virtual {p1}, Lcom/rt/mobile/english/data/articles/Section;->getTitle()Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 39
    :cond_0
    iget-object v0, p0, Lcom/rt/mobile/english/ui/adapter/ArticlesPagerAdapter;->listSection:Lcom/rt/mobile/english/data/Message;

    invoke-virtual {v0}, Lcom/rt/mobile/english/data/Message;->getData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/rt/mobile/english/data/articles/Section;

    invoke-virtual {p1}, Lcom/rt/mobile/english/data/articles/Section;->getTitle()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
