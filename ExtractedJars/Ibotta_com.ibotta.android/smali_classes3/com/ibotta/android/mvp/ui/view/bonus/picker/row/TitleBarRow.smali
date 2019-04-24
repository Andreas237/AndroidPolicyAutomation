.class public Lcom/ibotta/android/mvp/ui/view/bonus/picker/row/TitleBarRow;
.super Lcom/ibotta/android/mvp/ui/view/bonus/picker/row/AbstractBonusPickerRow;
.source "TitleBarRow.java"


# instance fields
.field private final titleBarViewState:Lcom/ibotta/android/views/base/title/TitleBarViewState;

.field private underFeaturedBonuses:Z


# direct methods
.method public constructor <init>(Lcom/ibotta/android/views/base/title/TitleBarViewState;)V
    .locals 1

    .line 15
    sget-object v0, Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerRowType;->TITLE_BAR:Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerRowType;

    invoke-direct {p0, v0}, Lcom/ibotta/android/mvp/ui/view/bonus/picker/row/AbstractBonusPickerRow;-><init>(Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerRowType;)V

    .line 16
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/bonus/picker/row/TitleBarRow;->titleBarViewState:Lcom/ibotta/android/views/base/title/TitleBarViewState;

    return-void
.end method


# virtual methods
.method public getTitleBarViewState()Lcom/ibotta/android/views/base/title/TitleBarViewState;
    .locals 1

    .line 20
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/bonus/picker/row/TitleBarRow;->titleBarViewState:Lcom/ibotta/android/views/base/title/TitleBarViewState;

    return-object v0
.end method

.method public isUnderFeaturedBonuses()Z
    .locals 1

    .line 24
    iget-boolean v0, p0, Lcom/ibotta/android/mvp/ui/view/bonus/picker/row/TitleBarRow;->underFeaturedBonuses:Z

    return v0
.end method

.method public setUnderFeaturedBonuses(Z)V
    .locals 0

    .line 28
    iput-boolean p1, p0, Lcom/ibotta/android/mvp/ui/view/bonus/picker/row/TitleBarRow;->underFeaturedBonuses:Z

    return-void
.end method
