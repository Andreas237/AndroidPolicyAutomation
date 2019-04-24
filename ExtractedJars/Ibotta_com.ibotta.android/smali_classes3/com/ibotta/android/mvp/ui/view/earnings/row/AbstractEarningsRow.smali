.class public abstract Lcom/ibotta/android/mvp/ui/view/earnings/row/AbstractEarningsRow;
.super Ljava/lang/Object;
.source "AbstractEarningsRow.java"


# instance fields
.field private earning:Lcom/ibotta/api/model/earnings/Earning;

.field private final rowType:Lcom/ibotta/android/mvp/ui/view/earnings/row/EarningsRowType;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/view/earnings/row/EarningsRowType;)V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/earnings/row/AbstractEarningsRow;->rowType:Lcom/ibotta/android/mvp/ui/view/earnings/row/EarningsRowType;

    return-void
.end method


# virtual methods
.method public getEarning()Lcom/ibotta/api/model/earnings/Earning;
    .locals 1

    .line 24
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/earnings/row/AbstractEarningsRow;->earning:Lcom/ibotta/api/model/earnings/Earning;

    return-object v0
.end method

.method public getType()I
    .locals 1

    .line 20
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/earnings/row/AbstractEarningsRow;->rowType:Lcom/ibotta/android/mvp/ui/view/earnings/row/EarningsRowType;

    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/view/earnings/row/EarningsRowType;->ordinal()I

    move-result v0

    return v0
.end method

.method public setEarning(Lcom/ibotta/api/model/earnings/Earning;)V
    .locals 0

    .line 28
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/earnings/row/AbstractEarningsRow;->earning:Lcom/ibotta/api/model/earnings/Earning;

    return-void
.end method
