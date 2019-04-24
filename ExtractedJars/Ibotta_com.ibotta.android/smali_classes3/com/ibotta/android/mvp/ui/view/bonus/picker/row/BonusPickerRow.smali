.class public Lcom/ibotta/android/mvp/ui/view/bonus/picker/row/BonusPickerRow;
.super Lcom/ibotta/android/mvp/ui/view/bonus/picker/row/AbstractBonusPickerRow;
.source "BonusPickerRow.java"


# instance fields
.field private bonusModel:Lcom/ibotta/api/model/BonusModel;

.field private index:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 15
    sget-object v0, Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerRowType;->BONUS:Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerRowType;

    invoke-direct {p0, v0}, Lcom/ibotta/android/mvp/ui/view/bonus/picker/row/AbstractBonusPickerRow;-><init>(Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerRowType;)V

    return-void
.end method


# virtual methods
.method public getBonusModel()Lcom/ibotta/api/model/BonusModel;
    .locals 1

    .line 19
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/bonus/picker/row/BonusPickerRow;->bonusModel:Lcom/ibotta/api/model/BonusModel;

    return-object v0
.end method

.method public getIndex()I
    .locals 1

    .line 27
    iget v0, p0, Lcom/ibotta/android/mvp/ui/view/bonus/picker/row/BonusPickerRow;->index:I

    return v0
.end method

.method public setBonusModel(Lcom/ibotta/api/model/BonusModel;)V
    .locals 0

    .line 23
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/bonus/picker/row/BonusPickerRow;->bonusModel:Lcom/ibotta/api/model/BonusModel;

    return-void
.end method

.method public setIndex(I)V
    .locals 0

    .line 31
    iput p1, p0, Lcom/ibotta/android/mvp/ui/view/bonus/picker/row/BonusPickerRow;->index:I

    return-void
.end method
