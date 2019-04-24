.class public interface abstract Lcom/ibotta/android/windfall/helper/WindfallHelper;
.super Ljava/lang/Object;
.source "WindfallHelper.java"


# virtual methods
.method public abstract convertScanResults(Lcom/microblink/ScanResults;)Lcom/ibotta/android/windfall/WindfallResults;
.end method

.method public abstract createVerificationCallIfNeeded(Lcom/ibotta/android/fragment/retailer/RetailerParcel;Lcom/ibotta/android/api/windfall/WindfallResultsResponse;)Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsVerifyPostCall;
.end method

.method public abstract saveWindfallResultsForLater(Lcom/microblink/ScanResults;)Lcom/ibotta/android/api/windfall/WindfallResultsResponse;
.end method

.method public abstract sign(Ljava/lang/String;)Ljava/lang/String;
.end method

.method public abstract toJson(Lcom/ibotta/android/windfall/WindfallResults;)Ljava/lang/String;
.end method
