.class public Lcom/ibotta/android/mvp/ui/view/bonus/picker/row/EmptyCompletedBonusesRow;
.super Lcom/ibotta/android/mvp/ui/view/bonus/picker/row/AbstractBonusPickerRow;
.source "EmptyCompletedBonusesRow.java"


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 12
    sget-object v0, Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerRowType;->EMPTY_COMPLETED_BONUSES:Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerRowType;

    invoke-direct {p0, v0}, Lcom/ibotta/android/mvp/ui/view/bonus/picker/row/AbstractBonusPickerRow;-><init>(Lcom/ibotta/android/mvp/ui/view/bonus/picker/BonusPickerRowType;)V

    return-void
.end method
