.class public Lcom/ibotta/android/fragment/game/question/JoustGameQuestionDriver;
.super Lcom/ibotta/android/fragment/game/question/AbstractGameQuestionDriver;
.source "JoustGameQuestionDriver.java"


# direct methods
.method public constructor <init>(Lcom/ibotta/api/model/TaskModel;)V
    .locals 0

    .line 11
    invoke-direct {p0, p1}, Lcom/ibotta/android/fragment/game/question/AbstractGameQuestionDriver;-><init>(Lcom/ibotta/api/model/TaskModel;)V

    return-void
.end method


# virtual methods
.method public getSubmitButtonText()Ljava/lang/String;
    .locals 1

    const v0, 0x7f110302

    .line 26
    invoke-virtual {p0, v0}, Lcom/ibotta/android/fragment/game/question/JoustGameQuestionDriver;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getTitle()Ljava/lang/String;
    .locals 1

    const v0, 0x7f110303

    .line 16
    invoke-virtual {p0, v0}, Lcom/ibotta/android/fragment/game/question/JoustGameQuestionDriver;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getTokenImage()I
    .locals 1

    const v0, 0x7f080024

    return v0
.end method
