.class public Lcom/ibotta/android/mvp/ui/view/personalize/row/TitleRow;
.super Lcom/ibotta/android/mvp/ui/view/personalize/row/AbstractPersonalStoreRow;
.source "TitleRow.java"


# instance fields
.field private final prompt:Ljava/lang/String;

.field private final titleBarViewState:Lcom/ibotta/android/views/base/title/TitleBarViewState;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/views/base/title/TitleBarViewState;Ljava/lang/String;)V
    .locals 1

    .line 15
    sget-object v0, Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoreRowType;->TITLE:Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoreRowType;

    invoke-direct {p0, v0}, Lcom/ibotta/android/mvp/ui/view/personalize/row/AbstractPersonalStoreRow;-><init>(Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoreRowType;)V

    .line 16
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/personalize/row/TitleRow;->titleBarViewState:Lcom/ibotta/android/views/base/title/TitleBarViewState;

    .line 17
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/view/personalize/row/TitleRow;->prompt:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getPrompt()Ljava/lang/String;
    .locals 1

    .line 25
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/personalize/row/TitleRow;->prompt:Ljava/lang/String;

    return-object v0
.end method

.method public getTitleBarViewState()Lcom/ibotta/android/views/base/title/TitleBarViewState;
    .locals 1

    .line 21
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/personalize/row/TitleRow;->titleBarViewState:Lcom/ibotta/android/views/base/title/TitleBarViewState;

    return-object v0
.end method
