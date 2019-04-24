.class public Lcom/ibotta/android/mvp/ui/activity/redeem/verify/row/AddRebatesRow;
.super Lcom/ibotta/android/mvp/ui/activity/redeem/verify/row/AbstractVerifiedRebatesRow;
.source "AddRebatesRow.java"


# instance fields
.field private foundRebateCount:I

.field private state:Lcom/ibotta/android/mvp/ui/view/redeem/AddRebatesState;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 15
    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesRowType;->ADD_REBATES:Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesRowType;

    invoke-direct {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/row/AbstractVerifiedRebatesRow;-><init>(Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesRowType;)V

    return-void
.end method


# virtual methods
.method public getFoundRebateCount()I
    .locals 1

    .line 27
    iget v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/row/AddRebatesRow;->foundRebateCount:I

    return v0
.end method

.method public getState()Lcom/ibotta/android/mvp/ui/view/redeem/AddRebatesState;
    .locals 1

    .line 19
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/row/AddRebatesRow;->state:Lcom/ibotta/android/mvp/ui/view/redeem/AddRebatesState;

    return-object v0
.end method

.method public setFoundRebateCount(I)V
    .locals 0

    .line 31
    iput p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/row/AddRebatesRow;->foundRebateCount:I

    return-void
.end method

.method public setState(Lcom/ibotta/android/mvp/ui/view/redeem/AddRebatesState;)V
    .locals 0

    .line 23
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/row/AddRebatesRow;->state:Lcom/ibotta/android/mvp/ui/view/redeem/AddRebatesState;

    return-void
.end method
