.class public Lcom/ibotta/android/mvp/ui/view/bonus/picker/row/TeamworkBonusRow;
.super Lcom/ibotta/android/mvp/ui/view/bonus/picker/row/AbstractBonusPickerRow;
.source "TeamworkBonusRow.java"


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

.field private final titleBarViewState:Lcom/ibotta/android/views/base/title/TitleBarViewState;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/views/base/title/TitleBarViewState;)V
    .locals 1

    .line 20
    sget-object v0, Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerRowType;->TEAMWORK_BONUSES:Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerRowType;

    invoke-direct {p0, v0}, Lcom/ibotta/android/mvp/ui/view/bonus/picker/row/AbstractBonusPickerRow;-><init>(Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerRowType;)V

    .line 17
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/view/bonus/picker/row/TeamworkBonusRow;->bonusItems:Ljava/util/List;

    .line 21
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/bonus/picker/row/TeamworkBonusRow;->titleBarViewState:Lcom/ibotta/android/views/base/title/TitleBarViewState;

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

    .line 25
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/bonus/picker/row/TeamworkBonusRow;->bonusItems:Ljava/util/List;

    return-object v0
.end method

.method public getTitleBarViewState()Lcom/ibotta/android/views/base/title/TitleBarViewState;
    .locals 1

    .line 37
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/bonus/picker/row/TeamworkBonusRow;->titleBarViewState:Lcom/ibotta/android/views/base/title/TitleBarViewState;

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

    if-eqz p1, :cond_0

    .line 30
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/bonus/picker/row/TeamworkBonusRow;->bonusItems:Ljava/util/List;

    goto :goto_0

    .line 32
    :cond_0
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/bonus/picker/row/TeamworkBonusRow;->bonusItems:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->clear()V

    :goto_0
    return-void
.end method
