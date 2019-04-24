.class public abstract Lcom/ibotta/android/fragment/dialog/flyup/BaseFlyUpPageCreator;
.super Ljava/lang/Object;
.source "BaseFlyUpPageCreator.java"

# interfaces
.implements Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageCreator;


# instance fields
.field private controller:Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPagerController;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPagerController;)V
    .locals 0

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    iput-object p1, p0, Lcom/ibotta/android/fragment/dialog/flyup/BaseFlyUpPageCreator;->controller:Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPagerController;

    return-void
.end method


# virtual methods
.method protected getController()Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPagerController;
    .locals 1

    .line 20
    iget-object v0, p0, Lcom/ibotta/android/fragment/dialog/flyup/BaseFlyUpPageCreator;->controller:Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPagerController;

    return-object v0
.end method

.method public getOffscreenPageLimit()I
    .locals 1

    const/4 v0, 0x3

    return v0
.end method

.method public getPageContentView()I
    .locals 1

    const v0, 0x7f090303

    return v0
.end method

.method public getPageLayout()I
    .locals 1

    const v0, 0x7f0c015b

    return v0
.end method

.method public isUsePageIndicator()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method protected notifyPageEvent(I)V
    .locals 1

    .line 24
    iget-object v0, p0, Lcom/ibotta/android/fragment/dialog/flyup/BaseFlyUpPageCreator;->controller:Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPagerController;

    if-eqz v0, :cond_0

    .line 25
    new-instance v0, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageEvent;

    invoke-direct {v0}, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageEvent;-><init>()V

    .line 26
    invoke-virtual {v0, p1}, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageEvent;->setEventId(I)V

    .line 27
    invoke-virtual {p0, v0}, Lcom/ibotta/android/fragment/dialog/flyup/BaseFlyUpPageCreator;->notifyPageEvent(Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageEvent;)V

    :cond_0
    return-void
.end method

.method protected notifyPageEvent(Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageEvent;)V
    .locals 1

    .line 32
    iget-object v0, p0, Lcom/ibotta/android/fragment/dialog/flyup/BaseFlyUpPageCreator;->controller:Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPagerController;

    if-eqz v0, :cond_0

    .line 33
    invoke-interface {v0, p1}, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPagerController;->onPageEvent(Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageEvent;)V

    :cond_0
    return-void
.end method

.method public onLeftControlClicked(Lcom/ibotta/android/fragment/dialog/flyup/LeftControl;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public onRightControlClicked(Lcom/ibotta/android/fragment/dialog/flyup/RightControl;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public setController(Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPagerController;)V
    .locals 0

    .line 16
    iput-object p1, p0, Lcom/ibotta/android/fragment/dialog/flyup/BaseFlyUpPageCreator;->controller:Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPagerController;

    return-void
.end method
