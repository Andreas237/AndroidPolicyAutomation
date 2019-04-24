.class public Lcom/ibotta/android/mvp/ui/view/notifications/row/EmptyTeammatesRow;
.super Lcom/ibotta/android/mvp/ui/view/notifications/row/AbstractNotificationsRow;
.source "EmptyTeammatesRow.java"


# instance fields
.field private final inviteFriendsCta:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 13
    sget-object v0, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsRowType;->EMPTY_TEAMMATES:Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsRowType;

    invoke-direct {p0, v0}, Lcom/ibotta/android/mvp/ui/view/notifications/row/AbstractNotificationsRow;-><init>(Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsRowType;)V

    .line 15
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/notifications/row/EmptyTeammatesRow;->inviteFriendsCta:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getInviteFriendsCta()Ljava/lang/String;
    .locals 1

    .line 19
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/notifications/row/EmptyTeammatesRow;->inviteFriendsCta:Ljava/lang/String;

    return-object v0
.end method
