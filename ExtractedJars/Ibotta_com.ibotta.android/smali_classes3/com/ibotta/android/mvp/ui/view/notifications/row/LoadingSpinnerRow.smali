.class public Lcom/ibotta/android/mvp/ui/view/notifications/row/LoadingSpinnerRow;
.super Lcom/ibotta/android/mvp/ui/view/notifications/row/AbstractNotificationsRow;
.source "LoadingSpinnerRow.java"


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 11
    sget-object v0, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsRowType;->LOADING_SPINNER:Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsRowType;

    invoke-direct {p0, v0}, Lcom/ibotta/android/mvp/ui/view/notifications/row/AbstractNotificationsRow;-><init>(Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsRowType;)V

    return-void
.end method
