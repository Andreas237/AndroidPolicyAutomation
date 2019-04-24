.class public Lcom/ibotta/android/mvp/ui/view/bonus/picker/row/FeaturedBonusRow;
.super Lcom/ibotta/android/mvp/ui/view/bonus/picker/row/AbstractBonusPickerRow;
.source "FeaturedBonusRow.java"


# instance fields
.field private bonusItems:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/android/view/model/content/BonusItem;",
            ">;"
        }
    .end annotation
.end field

.field private moduleIndex:Ljava/lang/Integer;

.field private moduleName:Ljava/lang/String;

.field private final titleBarViewState:Lcom/ibotta/android/views/base/title/TitleBarViewState;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/views/base/title/TitleBarViewState;)V
    .locals 1

    .line 22
    sget-object v0, Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerRowType;->FEATURED_BONUSES:Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerRowType;

    invoke-direct {p0, v0}, Lcom/ibotta/android/mvp/ui/view/bonus/picker/row/AbstractBonusPickerRow;-><init>(Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerRowType;)V

    .line 17
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/view/bonus/picker/row/FeaturedBonusRow;->bonusItems:Ljava/util/List;

    .line 23
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/bonus/picker/row/FeaturedBonusRow;->titleBarViewState:Lcom/ibotta/android/views/base/title/TitleBarViewState;

    return-void
.end method


# virtual methods
.method public getBonusItems()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/android/view/model/content/BonusItem;",
            ">;"
        }
    .end annotation

    .line 27
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/bonus/picker/row/FeaturedBonusRow;->bonusItems:Ljava/util/List;

    return-object v0
.end method

.method public getModuleIndex()Ljava/lang/Integer;
    .locals 1

    .line 39
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/bonus/picker/row/FeaturedBonusRow;->moduleIndex:Ljava/lang/Integer;

    return-object v0
.end method

.method public getModuleName()Ljava/lang/String;
    .locals 1

    .line 47
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/bonus/picker/row/FeaturedBonusRow;->moduleName:Ljava/lang/String;

    return-object v0
.end method

.method public getTitleBarViewState()Lcom/ibotta/android/views/base/title/TitleBarViewState;
    .locals 1

    .line 55
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/bonus/picker/row/FeaturedBonusRow;->titleBarViewState:Lcom/ibotta/android/views/base/title/TitleBarViewState;

    return-object v0
.end method

.method public setBonusItems(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/view/model/content/BonusItem;",
            ">;)V"
        }
    .end annotation

    if-nez p1, :cond_0

    .line 32
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/bonus/picker/row/FeaturedBonusRow;->bonusItems:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->clear()V

    goto :goto_0

    .line 34
    :cond_0
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/bonus/picker/row/FeaturedBonusRow;->bonusItems:Ljava/util/List;

    :goto_0
    return-void
.end method

.method public setModuleIndex(Ljava/lang/Integer;)V
    .locals 0

    .line 43
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/bonus/picker/row/FeaturedBonusRow;->moduleIndex:Ljava/lang/Integer;

    return-void
.end method

.method public setModuleName(Ljava/lang/String;)V
    .locals 0

    .line 51
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/bonus/picker/row/FeaturedBonusRow;->moduleName:Ljava/lang/String;

    return-void
.end method
