.class public Lcom/ibotta/android/mvp/ui/activity/loyalty/show/Presentation;
.super Ljava/lang/Object;
.source "Presentation.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/mvp/ui/activity/loyalty/show/Presentation$State;
    }
.end annotation


# instance fields
.field private barcode:Ljava/lang/String;

.field private canRemove:Z

.field private canUseReceipt:Z

.field private cardDescription:Ljava/lang/String;

.field private cardLinkText:Ljava/lang/String;

.field private cardName:Ljava/lang/String;

.field private cardNumberName:Ljava/lang/String;

.field private displayValue:Ljava/lang/String;

.field private format:Lcom/ibotta/android/barcode/Format;

.field private largeCardLogoUrl:Ljava/lang/String;

.field private state:Lcom/ibotta/android/mvp/ui/activity/loyalty/show/Presentation$State;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/Presentation$State;->NOT_CONNECTED:Lcom/ibotta/android/mvp/ui/activity/loyalty/show/Presentation$State;

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/Presentation;->state:Lcom/ibotta/android/mvp/ui/activity/loyalty/show/Presentation$State;

    return-void
.end method


# virtual methods
.method public getBarcode()Ljava/lang/String;
    .locals 1

    .line 101
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/Presentation;->barcode:Ljava/lang/String;

    return-object v0
.end method

.method public getCardDescription()Ljava/lang/String;
    .locals 1

    .line 61
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/Presentation;->cardDescription:Ljava/lang/String;

    return-object v0
.end method

.method public getCardLinkText()Ljava/lang/String;
    .locals 1

    .line 53
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/Presentation;->cardLinkText:Ljava/lang/String;

    return-object v0
.end method

.method public getCardName()Ljava/lang/String;
    .locals 1

    .line 37
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/Presentation;->cardName:Ljava/lang/String;

    return-object v0
.end method

.method public getCardNumberName()Ljava/lang/String;
    .locals 1

    .line 45
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/Presentation;->cardNumberName:Ljava/lang/String;

    return-object v0
.end method

.method public getDisplayValue()Ljava/lang/String;
    .locals 1

    .line 69
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/Presentation;->displayValue:Ljava/lang/String;

    return-object v0
.end method

.method public getFormat()Lcom/ibotta/android/barcode/Format;
    .locals 1

    .line 93
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/Presentation;->format:Lcom/ibotta/android/barcode/Format;

    return-object v0
.end method

.method public getLargeCardLogoUrl()Ljava/lang/String;
    .locals 1

    .line 29
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/Presentation;->largeCardLogoUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getState()Lcom/ibotta/android/mvp/ui/activity/loyalty/show/Presentation$State;
    .locals 1

    .line 109
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/Presentation;->state:Lcom/ibotta/android/mvp/ui/activity/loyalty/show/Presentation$State;

    return-object v0
.end method

.method public isCanRemove()Z
    .locals 1

    .line 85
    iget-boolean v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/Presentation;->canRemove:Z

    return v0
.end method

.method public isCanUseReceipt()Z
    .locals 1

    .line 77
    iget-boolean v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/Presentation;->canUseReceipt:Z

    return v0
.end method

.method public setBarcode(Ljava/lang/String;)V
    .locals 0

    .line 105
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/Presentation;->barcode:Ljava/lang/String;

    return-void
.end method

.method public setCanRemove(Z)V
    .locals 0

    .line 89
    iput-boolean p1, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/Presentation;->canRemove:Z

    return-void
.end method

.method public setCanUseReceipt(Z)V
    .locals 0

    .line 81
    iput-boolean p1, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/Presentation;->canUseReceipt:Z

    return-void
.end method

.method public setCardDescription(Ljava/lang/String;)V
    .locals 0

    .line 65
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/Presentation;->cardDescription:Ljava/lang/String;

    return-void
.end method

.method public setCardLinkText(Ljava/lang/String;)V
    .locals 0

    .line 57
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/Presentation;->cardLinkText:Ljava/lang/String;

    return-void
.end method

.method public setCardName(Ljava/lang/String;)V
    .locals 0

    .line 41
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/Presentation;->cardName:Ljava/lang/String;

    return-void
.end method

.method public setCardNumberName(Ljava/lang/String;)V
    .locals 0

    .line 49
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/Presentation;->cardNumberName:Ljava/lang/String;

    return-void
.end method

.method public setDisplayValue(Ljava/lang/String;)V
    .locals 0

    .line 73
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/Presentation;->displayValue:Ljava/lang/String;

    return-void
.end method

.method public setFormat(Lcom/ibotta/android/barcode/Format;)V
    .locals 0

    .line 97
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/Presentation;->format:Lcom/ibotta/android/barcode/Format;

    return-void
.end method

.method public setLargeCardLogoUrl(Ljava/lang/String;)V
    .locals 0

    .line 33
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/Presentation;->largeCardLogoUrl:Ljava/lang/String;

    return-void
.end method

.method public setState(Lcom/ibotta/android/mvp/ui/activity/loyalty/show/Presentation$State;)V
    .locals 0

    .line 113
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/Presentation;->state:Lcom/ibotta/android/mvp/ui/activity/loyalty/show/Presentation$State;

    return-void
.end method
