.class public Lcom/ibotta/android/mvp/ui/view/notifications/holder/LoadingSpinnerViewHolder;
.super Lcom/ibotta/android/mvp/ui/view/notifications/holder/AbstractNotificationsViewHolder;
.source "LoadingSpinnerViewHolder.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/ui/view/notifications/holder/AbstractNotificationsViewHolder<",
        "Lcom/ibotta/android/mvp/ui/view/notifications/row/LoadingSpinnerRow;",
        ">;"
    }
.end annotation


# instance fields
.field private final lsvLoadingSpinner:Lcom/ibotta/android/mvp/ui/view/notifications/LoadingSpinnerView;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/view/notifications/LoadingSpinnerView;)V
    .locals 0

    .line 15
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/view/notifications/holder/AbstractNotificationsViewHolder;-><init>(Landroid/view/View;)V

    .line 16
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/notifications/holder/LoadingSpinnerViewHolder;->lsvLoadingSpinner:Lcom/ibotta/android/mvp/ui/view/notifications/LoadingSpinnerView;

    return-void
.end method


# virtual methods
.method public bridge synthetic bind(Lcom/ibotta/android/mvp/ui/view/notifications/row/AbstractNotificationsRow;Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsRecyclerListener;)V
    .locals 0

    .line 11
    check-cast p1, Lcom/ibotta/android/mvp/ui/view/notifications/row/LoadingSpinnerRow;

    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/view/notifications/holder/LoadingSpinnerViewHolder;->bind(Lcom/ibotta/android/mvp/ui/view/notifications/row/LoadingSpinnerRow;Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsRecyclerListener;)V

    return-void
.end method

.method public bind(Lcom/ibotta/android/mvp/ui/view/notifications/row/LoadingSpinnerRow;Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsRecyclerListener;)V
    .locals 0

    return-void
.end method
