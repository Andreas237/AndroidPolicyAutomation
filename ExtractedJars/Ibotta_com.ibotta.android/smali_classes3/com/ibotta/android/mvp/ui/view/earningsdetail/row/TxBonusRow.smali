.class public Lcom/ibotta/android/mvp/ui/view/earningsdetail/row/TxBonusRow;
.super Lcom/ibotta/android/mvp/ui/view/earningsdetail/AbstractEarningsDetailRow;
.source "TxBonusRow.java"


# instance fields
.field private bonusModel:Lcom/ibotta/api/model/BonusModel;

.field private isFirstBonus:Z

.field private isLastBonus:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 17
    sget-object v0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailRowType;->BONUS:Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailRowType;

    invoke-direct {p0, v0}, Lcom/ibotta/android/mvp/ui/view/earningsdetail/AbstractEarningsDetailRow;-><init>(Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailRowType;)V

    return-void
.end method


# virtual methods
.method public getBonusModel()Lcom/ibotta/api/model/BonusModel;
    .locals 1

    .line 21
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/row/TxBonusRow;->bonusModel:Lcom/ibotta/api/model/BonusModel;

    return-object v0
.end method

.method public isFirstBonus()Z
    .locals 1

    .line 29
    iget-boolean v0, p0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/row/TxBonusRow;->isFirstBonus:Z

    return v0
.end method

.method public isLastBonus()Z
    .locals 1

    .line 37
    iget-boolean v0, p0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/row/TxBonusRow;->isLastBonus:Z

    return v0
.end method

.method public setBonusModel(Lcom/ibotta/api/model/BonusModel;)V
    .locals 0

    .line 25
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/row/TxBonusRow;->bonusModel:Lcom/ibotta/api/model/BonusModel;

    return-void
.end method

.method public setFirstBonus(Z)V
    .locals 0

    .line 33
    iput-boolean p1, p0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/row/TxBonusRow;->isFirstBonus:Z

    return-void
.end method

.method public setLastBonus(Z)V
    .locals 0

    .line 41
    iput-boolean p1, p0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/row/TxBonusRow;->isLastBonus:Z

    return-void
.end method
