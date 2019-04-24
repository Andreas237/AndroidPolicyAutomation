.class public Lcom/ibotta/android/buttonsdk/card/customcard/SpecialConditionsCustomCardViewModel;
.super Lcom/ibotta/android/buttonsdk/card/customcard/AbstractCustomCardViewModel;
.source "SpecialConditionsCustomCardViewModel.java"


# instance fields
.field private final specialConditions:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 8
    invoke-direct {p0, p1}, Lcom/ibotta/android/buttonsdk/card/customcard/AbstractCustomCardViewModel;-><init>(Ljava/lang/String;)V

    .line 10
    iput-object p2, p0, Lcom/ibotta/android/buttonsdk/card/customcard/SpecialConditionsCustomCardViewModel;->specialConditions:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getSpecialConditions()Ljava/lang/String;
    .locals 1

    .line 14
    iget-object v0, p0, Lcom/ibotta/android/buttonsdk/card/customcard/SpecialConditionsCustomCardViewModel;->specialConditions:Ljava/lang/String;

    return-object v0
.end method
