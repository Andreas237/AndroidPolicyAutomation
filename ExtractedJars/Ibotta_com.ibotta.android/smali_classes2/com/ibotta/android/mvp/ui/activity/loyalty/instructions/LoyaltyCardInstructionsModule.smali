.class public Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/LoyaltyCardInstructionsModule;
.super Lcom/ibotta/android/mvp/base/AbstractMvpModule;
.source "LoyaltyCardInstructionsModule.java"


# annotations
.annotation runtime Ldagger/Module;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/AbstractMvpModule<",
        "Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/LoyaltyCardInstructionsView;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/LoyaltyCardInstructionsView;)V
    .locals 0

    .line 20
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/base/AbstractMvpModule;-><init>(Lcom/ibotta/android/mvp/base/MvpView;)V

    return-void
.end method


# virtual methods
.method public provideMvpPresenter(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/api/helper/retailer/RetailerHelper;Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;Lcom/ibotta/android/title/TitleBarReducer;)Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/LoyaltyCardInstructionsPresenter;
    .locals 1
    .annotation runtime Lcom/ibotta/android/mvp/base/PerActivity;
    .end annotation

    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 29
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/LoyaltyCardInstructionsPresenterImpl;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/LoyaltyCardInstructionsPresenterImpl;-><init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/api/helper/retailer/RetailerHelper;Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;Lcom/ibotta/android/title/TitleBarReducer;)V

    return-object v0
.end method
