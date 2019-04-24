.class public Lcom/ibotta/android/view/common/TabSelectorView;
.super Landroid/support/design/widget/TabLayout;
.source "TabSelectorView.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/view/common/TabSelectorView$TabOption;
    }
.end annotation


# instance fields
.field protected tabOptions:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "+",
            "Lcom/ibotta/android/view/common/TabSelectorView$TabOption;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 23
    invoke-direct {p0, p1}, Landroid/support/design/widget/TabLayout;-><init>(Landroid/content/Context;)V

    .line 16
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/view/common/TabSelectorView;->tabOptions:Ljava/util/List;

    .line 24
    invoke-direct {p0}, Lcom/ibotta/android/view/common/TabSelectorView;->init()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 28
    invoke-direct {p0, p1, p2}, Landroid/support/design/widget/TabLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 16
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/view/common/TabSelectorView;->tabOptions:Ljava/util/List;

    .line 29
    invoke-direct {p0}, Lcom/ibotta/android/view/common/TabSelectorView;->init()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 33
    invoke-direct {p0, p1, p2, p3}, Landroid/support/design/widget/TabLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 16
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/view/common/TabSelectorView;->tabOptions:Ljava/util/List;

    .line 34
    invoke-direct {p0}, Lcom/ibotta/android/view/common/TabSelectorView;->init()V

    return-void
.end method

.method private init()V
    .locals 4

    .line 38
    invoke-virtual {p0}, Lcom/ibotta/android/view/common/TabSelectorView;->isInEditMode()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 39
    sget-object v0, Lcom/ibotta/android/view/common/-$$Lambda$TabSelectorView$8kgJbdjcm1X0qr-0IBZsWwv0CZk;->INSTANCE:Lcom/ibotta/android/view/common/-$$Lambda$TabSelectorView$8kgJbdjcm1X0qr-0IBZsWwv0CZk;

    .line 40
    sget-object v1, Lcom/ibotta/android/view/common/-$$Lambda$TabSelectorView$pbjeI1Auzs7SmU4Ea7add1kUcjs;->INSTANCE:Lcom/ibotta/android/view/common/-$$Lambda$TabSelectorView$pbjeI1Auzs7SmU4Ea7add1kUcjs;

    .line 42
    new-instance v2, Ljava/util/ArrayList;

    const/4 v3, 0x2

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 43
    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 44
    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 46
    invoke-virtual {p0, v2}, Lcom/ibotta/android/view/common/TabSelectorView;->setOptions(Ljava/util/List;)V

    :cond_0
    return-void
.end method

.method static synthetic lambda$init$0()Ljava/lang/String;
    .locals 1

    const-string v0, "Tab 1"

    return-object v0
.end method

.method static synthetic lambda$init$1()Ljava/lang/String;
    .locals 1

    const-string v0, "Tab 2"

    return-object v0
.end method


# virtual methods
.method public getPosition(Lcom/ibotta/android/view/common/TabSelectorView$TabOption;)I
    .locals 1

    .line 51
    iget-object v0, p0, Lcom/ibotta/android/view/common/TabSelectorView;->tabOptions:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method protected initChildren()V
    .locals 3

    const/4 v0, 0x0

    .line 63
    :goto_0
    iget-object v1, p0, Lcom/ibotta/android/view/common/TabSelectorView;->tabOptions:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_1

    .line 65
    invoke-virtual {p0}, Lcom/ibotta/android/view/common/TabSelectorView;->getTabCount()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 66
    invoke-virtual {p0, v0}, Lcom/ibotta/android/view/common/TabSelectorView;->getTabAt(I)Landroid/support/design/widget/TabLayout$Tab;

    move-result-object v1

    goto :goto_1

    .line 68
    :cond_0
    invoke-virtual {p0}, Lcom/ibotta/android/view/common/TabSelectorView;->newTab()Landroid/support/design/widget/TabLayout$Tab;

    move-result-object v1

    .line 69
    invoke-virtual {p0, v1}, Lcom/ibotta/android/view/common/TabSelectorView;->addTab(Landroid/support/design/widget/TabLayout$Tab;)V

    .line 72
    :goto_1
    iget-object v2, p0, Lcom/ibotta/android/view/common/TabSelectorView;->tabOptions:Ljava/util/List;

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ibotta/android/view/common/TabSelectorView$TabOption;

    .line 73
    invoke-virtual {v1, v2}, Landroid/support/design/widget/TabLayout$Tab;->setTag(Ljava/lang/Object;)Landroid/support/design/widget/TabLayout$Tab;

    .line 74
    invoke-interface {v2}, Lcom/ibotta/android/view/common/TabSelectorView$TabOption;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/support/design/widget/TabLayout$Tab;->setText(Ljava/lang/CharSequence;)Landroid/support/design/widget/TabLayout$Tab;

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 77
    :cond_1
    iget-object v0, p0, Lcom/ibotta/android/view/common/TabSelectorView;->tabOptions:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    invoke-virtual {p0}, Lcom/ibotta/android/view/common/TabSelectorView;->getTabCount()I

    move-result v1

    if-ge v0, v1, :cond_2

    .line 78
    iget-object v0, p0, Lcom/ibotta/android/view/common/TabSelectorView;->tabOptions:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    :goto_2
    invoke-virtual {p0}, Lcom/ibotta/android/view/common/TabSelectorView;->getTabCount()I

    move-result v1

    if-ge v0, v1, :cond_2

    .line 79
    invoke-virtual {p0, v0}, Lcom/ibotta/android/view/common/TabSelectorView;->removeTabAt(I)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_2
    return-void
.end method

.method public setOptions(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/ibotta/android/view/common/TabSelectorView$TabOption;",
            ">;)V"
        }
    .end annotation

    if-nez p1, :cond_0

    .line 56
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object p1

    .line 58
    :cond_0
    iput-object p1, p0, Lcom/ibotta/android/view/common/TabSelectorView;->tabOptions:Ljava/util/List;

    .line 59
    invoke-virtual {p0}, Lcom/ibotta/android/view/common/TabSelectorView;->initChildren()V

    return-void
.end method
