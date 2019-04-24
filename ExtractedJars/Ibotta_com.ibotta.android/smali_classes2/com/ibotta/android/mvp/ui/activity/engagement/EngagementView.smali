.class public interface abstract Lcom/ibotta/android/mvp/ui/activity/engagement/EngagementView;
.super Ljava/lang/Object;
.source "EngagementView.java"

# interfaces
.implements Lcom/ibotta/android/mvp/base/loading/LoadingMvpView;


# virtual methods
.method public abstract dismissRetailerPickerDialog()V
.end method

.method public abstract getDefaultOfferName()Ljava/lang/String;
.end method

.method public abstract hide()V
.end method

.method public abstract promptForLocationPermissions(ILjava/lang/Integer;)V
.end method

.method public abstract share(Ljava/lang/String;Ljava/lang/String;)V
.end method

.method public abstract show()V
.end method

.method public abstract showEngagement(Lcom/ibotta/api/model/RetailerModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/ibotta/api/model/TaskModel;Z)V
    .param p1    # Lcom/ibotta/api/model/RetailerModel;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
.end method

.method public abstract showEngagementSuccess(Lcom/ibotta/android/fragment/retailer/RetailerParcel;Lcom/ibotta/api/model/TaskModel;JLjava/lang/Integer;)V
.end method

.method public abstract showOfferNotFound()V
.end method

.method public abstract showRetailerSelector(Ljava/lang/String;Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/RetailerModel;",
            ">;)V"
        }
    .end annotation
.end method
