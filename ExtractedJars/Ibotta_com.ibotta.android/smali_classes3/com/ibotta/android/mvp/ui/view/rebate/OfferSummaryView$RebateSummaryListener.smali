.class public interface abstract Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView$RebateSummaryListener;
.super Ljava/lang/Object;
.source "OfferSummaryView.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/mvp/ui/view/rebate/OfferSummaryView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "RebateSummaryListener"
.end annotation


# virtual methods
.method public abstract onRebateSummaryClicked(Lcom/ibotta/api/model/OfferModel;Lcom/ibotta/api/model/RetailerModel;)V
.end method

.method public abstract onShopClicked(Lcom/ibotta/api/model/OfferModel;Lcom/ibotta/api/model/RetailerModel;)V
.end method

.method public abstract onUnlockClicked(Lcom/ibotta/api/model/OfferModel;Lcom/ibotta/api/model/RetailerModel;)V
.end method

.method public abstract onUnlockedClicked(Lcom/ibotta/api/model/OfferModel;Lcom/ibotta/api/model/RetailerModel;)V
.end method
