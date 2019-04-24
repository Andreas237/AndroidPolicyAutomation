.class public Lcom/ibotta/android/mvp/ui/activity/redeem/verify/row/TitleBarRow;
.super Lcom/ibotta/android/mvp/ui/activity/redeem/verify/row/AbstractVerifiedRebatesRow;
.source "TitleBarRow.java"


# instance fields
.field private titleBarViewState:Lcom/ibotta/android/views/base/title/TitleBarViewState;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/views/base/title/TitleBarViewState;)V
    .locals 1

    .line 14
    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesRowType;->TITLE_BAR:Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesRowType;

    invoke-direct {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/row/AbstractVerifiedRebatesRow;-><init>(Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesRowType;)V

    .line 15
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/row/TitleBarRow;->titleBarViewState:Lcom/ibotta/android/views/base/title/TitleBarViewState;

    return-void
.end method


# virtual methods
.method public getTitleBarViewState()Lcom/ibotta/android/views/base/title/TitleBarViewState;
    .locals 1

    .line 20
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/row/TitleBarRow;->titleBarViewState:Lcom/ibotta/android/views/base/title/TitleBarViewState;

    return-object v0
.end method
