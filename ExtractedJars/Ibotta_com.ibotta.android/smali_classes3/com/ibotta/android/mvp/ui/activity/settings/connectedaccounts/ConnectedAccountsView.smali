.class public interface abstract Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsView;
.super Ljava/lang/Object;
.source "ConnectedAccountsView.java"

# interfaces
.implements Lcom/ibotta/android/mvp/base/loading/LoadingMvpView;


# virtual methods
.method public abstract connectToGoogle()V
.end method

.method public abstract setRows(Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/row/ConnectedAccountsRow;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract showGoogleAuthFailure(Lcom/google/android/gms/common/api/ApiException;)V
.end method
