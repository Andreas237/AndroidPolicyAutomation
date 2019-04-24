.class public Lcom/ibotta/android/mvp/ui/activity/redeem/add/row/TitleBarRow;
.super Lcom/ibotta/android/mvp/ui/activity/redeem/add/row/AbstractVerifyRebatesRow;
.source "TitleBarRow.java"


# instance fields
.field private final titleBarViewState:Lcom/ibotta/android/views/base/title/TitleBarViewState;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/views/base/title/TitleBarViewState;)V
    .locals 1

    .line 16
    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesRowType;->TITLE_BAR:Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesRowType;

    invoke-direct {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/add/row/AbstractVerifyRebatesRow;-><init>(Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesRowType;)V

    .line 17
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/row/TitleBarRow;->titleBarViewState:Lcom/ibotta/android/views/base/title/TitleBarViewState;

    return-void
.end method


# virtual methods
.method public getTitleBarViewState()Lcom/ibotta/android/views/base/title/TitleBarViewState;
    .locals 1

    .line 21
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/row/TitleBarRow;->titleBarViewState:Lcom/ibotta/android/views/base/title/TitleBarViewState;

    return-object v0
.end method
