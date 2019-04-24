.class public interface abstract Lcom/ibotta/android/mvp/ui/activity/im/ImUtil;
.super Ljava/lang/Object;
.source "ImUtil.java"


# virtual methods
.method public abstract getBeginIndex(Ljava/lang/String;Ljava/lang/String;)I
.end method

.method public abstract getEndIndex(Ljava/lang/String;Ljava/lang/String;)I
.end method

.method public abstract getFormattedRetailerHost(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)Ljava/lang/String;
.end method

.method public abstract getImConnectionStatusForRetailer(Lcom/ibotta/android/fragment/retailer/RetailerParcel;Ljava/util/List;)Lcom/ibotta/api/model/im/ImConnectionStatus;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/fragment/retailer/RetailerParcel;",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/im/CredentialIntegration;",
            ">;)",
            "Lcom/ibotta/api/model/im/ImConnectionStatus;"
        }
    .end annotation
.end method

.method public abstract getImConnectionStatusForRetailer(Lcom/ibotta/api/model/RetailerModel;Ljava/util/List;)Lcom/ibotta/api/model/im/ImConnectionStatus;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/api/model/RetailerModel;",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/im/CredentialIntegration;",
            ">;)",
            "Lcom/ibotta/api/model/im/ImConnectionStatus;"
        }
    .end annotation
.end method

.method public abstract shouldShowImRedeem(Lcom/ibotta/api/model/customer/Customer;Lcom/ibotta/api/model/RetailerModel;)Z
    .param p1    # Lcom/ibotta/api/model/customer/Customer;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Contract;
        value = "null, _ -> false"
    .end annotation
.end method
