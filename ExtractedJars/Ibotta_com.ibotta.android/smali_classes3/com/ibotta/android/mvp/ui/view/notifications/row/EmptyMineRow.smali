.class public Lcom/ibotta/android/mvp/ui/view/notifications/row/EmptyMineRow;
.super Lcom/ibotta/android/mvp/ui/view/notifications/row/AbstractNotificationsRow;
.source "EmptyMineRow.java"


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 11
    sget-object v0, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsRowType;->EMPTY_MINE:Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsRowType;

    invoke-direct {p0, v0}, Lcom/ibotta/android/mvp/ui/view/notifications/row/AbstractNotificationsRow;-><init>(Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsRowType;)V

    return-void
.end method
