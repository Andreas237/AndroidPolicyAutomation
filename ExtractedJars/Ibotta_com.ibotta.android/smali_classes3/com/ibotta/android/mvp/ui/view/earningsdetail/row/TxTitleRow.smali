.class public Lcom/ibotta/android/mvp/ui/view/earningsdetail/row/TxTitleRow;
.super Lcom/ibotta/android/mvp/ui/view/earningsdetail/AbstractEarningsDetailRow;
.source "TxTitleRow.java"


# instance fields
.field private final titleBarViewState:Lcom/ibotta/android/views/base/title/TitleBarViewState;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/views/base/title/TitleBarViewState;)V
    .locals 1

    .line 15
    sget-object v0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailRowType;->TITLE:Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailRowType;

    invoke-direct {p0, v0}, Lcom/ibotta/android/mvp/ui/view/earningsdetail/AbstractEarningsDetailRow;-><init>(Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailRowType;)V

    .line 16
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/row/TxTitleRow;->titleBarViewState:Lcom/ibotta/android/views/base/title/TitleBarViewState;

    return-void
.end method


# virtual methods
.method public getTitleBarViewState()Lcom/ibotta/android/views/base/title/TitleBarViewState;
    .locals 1

    .line 20
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/row/TxTitleRow;->titleBarViewState:Lcom/ibotta/android/views/base/title/TitleBarViewState;

    return-object v0
.end method
