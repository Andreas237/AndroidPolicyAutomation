.class public Lcom/ibotta/android/buttonsdk/card/customcard/HowIbottaWorksCustomCardViewModel;
.super Lcom/ibotta/android/buttonsdk/card/customcard/AbstractCustomCardViewModel;
.source "HowIbottaWorksCustomCardViewModel.java"


# instance fields
.field private final makeAPurchaseMessage:Ljava/lang/String;

.field private final orderIsProcessedMessage:Ljava/lang/String;

.field private final pendingPeriodMessage:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 11
    invoke-direct {p0, p1}, Lcom/ibotta/android/buttonsdk/card/customcard/AbstractCustomCardViewModel;-><init>(Ljava/lang/String;)V

    .line 13
    iput-object p2, p0, Lcom/ibotta/android/buttonsdk/card/customcard/HowIbottaWorksCustomCardViewModel;->makeAPurchaseMessage:Ljava/lang/String;

    .line 14
    iput-object p3, p0, Lcom/ibotta/android/buttonsdk/card/customcard/HowIbottaWorksCustomCardViewModel;->orderIsProcessedMessage:Ljava/lang/String;

    .line 15
    iput-object p4, p0, Lcom/ibotta/android/buttonsdk/card/customcard/HowIbottaWorksCustomCardViewModel;->pendingPeriodMessage:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getMakeAPurchaseMessage()Ljava/lang/String;
    .locals 1

    .line 19
    iget-object v0, p0, Lcom/ibotta/android/buttonsdk/card/customcard/HowIbottaWorksCustomCardViewModel;->makeAPurchaseMessage:Ljava/lang/String;

    return-object v0
.end method

.method public getOrderIsProcessedMessage()Ljava/lang/String;
    .locals 1

    .line 23
    iget-object v0, p0, Lcom/ibotta/android/buttonsdk/card/customcard/HowIbottaWorksCustomCardViewModel;->orderIsProcessedMessage:Ljava/lang/String;

    return-object v0
.end method

.method public getPendingPeriodMessage()Ljava/lang/String;
    .locals 1

    .line 27
    iget-object v0, p0, Lcom/ibotta/android/buttonsdk/card/customcard/HowIbottaWorksCustomCardViewModel;->pendingPeriodMessage:Ljava/lang/String;

    return-object v0
.end method
