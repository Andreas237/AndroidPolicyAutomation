.class public abstract Lcom/ibotta/android/mvp/ui/view/notifications/row/AbstractNotificationsRow;
.super Ljava/lang/Object;
.source "AbstractNotificationsRow.java"


# instance fields
.field private final notificationsRowType:Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsRowType;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsRowType;)V
    .locals 0

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/notifications/row/AbstractNotificationsRow;->notificationsRowType:Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsRowType;

    return-void
.end method


# virtual methods
.method public getType()I
    .locals 1

    .line 17
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/notifications/row/AbstractNotificationsRow;->notificationsRowType:Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsRowType;

    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsRowType;->ordinal()I

    move-result v0

    return v0
.end method
