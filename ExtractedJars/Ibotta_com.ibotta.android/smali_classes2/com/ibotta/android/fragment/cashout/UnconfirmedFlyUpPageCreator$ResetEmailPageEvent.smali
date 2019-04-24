.class public Lcom/ibotta/android/fragment/cashout/UnconfirmedFlyUpPageCreator$ResetEmailPageEvent;
.super Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageEvent;
.source "UnconfirmedFlyUpPageCreator.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/fragment/cashout/UnconfirmedFlyUpPageCreator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ResetEmailPageEvent"
.end annotation


# instance fields
.field private newEmail:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 146
    invoke-direct {p0}, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageEvent;-><init>()V

    return-void
.end method


# virtual methods
.method public getNewEmail()Ljava/lang/String;
    .locals 1

    .line 150
    iget-object v0, p0, Lcom/ibotta/android/fragment/cashout/UnconfirmedFlyUpPageCreator$ResetEmailPageEvent;->newEmail:Ljava/lang/String;

    return-object v0
.end method

.method public setNewEmail(Ljava/lang/String;)V
    .locals 0

    .line 154
    iput-object p1, p0, Lcom/ibotta/android/fragment/cashout/UnconfirmedFlyUpPageCreator$ResetEmailPageEvent;->newEmail:Ljava/lang/String;

    return-void
.end method
