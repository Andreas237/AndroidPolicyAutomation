.class public final enum Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsTab;
.super Ljava/lang/Enum;
.source "NotificationsTab.java"

# interfaces
.implements Lcom/ibotta/android/view/common/TabSelectorView$TabOption;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsTab;",
        ">;",
        "Lcom/ibotta/android/view/common/TabSelectorView$TabOption;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsTab;

.field public static final enum MINE:Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsTab;

.field public static final enum TEAMMATES:Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsTab;


# instance fields
.field private final filter:Lcom/ibotta/android/notification/call/BaseNotificationsCall$NotificationFilter;

.field private final nameResId:I


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 13
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsTab;

    const-string v1, "MINE"

    sget-object v2, Lcom/ibotta/android/notification/call/BaseNotificationsCall$NotificationFilter;->ME:Lcom/ibotta/android/notification/call/BaseNotificationsCall$NotificationFilter;

    const/4 v3, 0x0

    const v4, 0x7f11048b

    invoke-direct {v0, v1, v3, v4, v2}, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsTab;-><init>(Ljava/lang/String;IILcom/ibotta/android/notification/call/BaseNotificationsCall$NotificationFilter;)V

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsTab;->MINE:Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsTab;

    .line 14
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsTab;

    const-string v1, "TEAMMATES"

    sget-object v2, Lcom/ibotta/android/notification/call/BaseNotificationsCall$NotificationFilter;->FRIEND:Lcom/ibotta/android/notification/call/BaseNotificationsCall$NotificationFilter;

    const/4 v4, 0x1

    const v5, 0x7f11048d

    invoke-direct {v0, v1, v4, v5, v2}, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsTab;-><init>(Ljava/lang/String;IILcom/ibotta/android/notification/call/BaseNotificationsCall$NotificationFilter;)V

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsTab;->TEAMMATES:Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsTab;

    const/4 v0, 0x2

    .line 12
    new-array v0, v0, [Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsTab;

    sget-object v1, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsTab;->MINE:Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsTab;

    aput-object v1, v0, v3

    sget-object v1, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsTab;->TEAMMATES:Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsTab;

    aput-object v1, v0, v4

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsTab;->$VALUES:[Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsTab;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IILcom/ibotta/android/notification/call/BaseNotificationsCall$NotificationFilter;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lcom/ibotta/android/notification/call/BaseNotificationsCall$NotificationFilter;",
            ")V"
        }
    .end annotation

    .line 19
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 20
    iput p3, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsTab;->nameResId:I

    .line 21
    iput-object p4, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsTab;->filter:Lcom/ibotta/android/notification/call/BaseNotificationsCall$NotificationFilter;

    return-void
.end method

.method public static fromFilter(Lcom/ibotta/android/notification/call/BaseNotificationsCall$NotificationFilter;)Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsTab;
    .locals 5

    .line 36
    invoke-static {}, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsTab;->values()[Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsTab;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    .line 37
    invoke-virtual {v3}, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsTab;->getFilter()Lcom/ibotta/android/notification/call/BaseNotificationsCall$NotificationFilter;

    move-result-object v4

    if-ne v4, p0, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const/4 v3, 0x0

    :goto_1
    return-object v3
.end method

.method public static fromString(Ljava/lang/String;)Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsTab;
    .locals 0

    .line 50
    :try_start_0
    invoke-static {p0}, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsTab;->valueOf(Ljava/lang/String;)Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsTab;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsTab;
    .locals 1

    .line 12
    const-class v0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsTab;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsTab;

    return-object p0
.end method

.method public static values()[Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsTab;
    .locals 1

    .line 12
    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsTab;->$VALUES:[Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsTab;

    invoke-virtual {v0}, [Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsTab;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsTab;

    return-object v0
.end method


# virtual methods
.method public getFilter()Lcom/ibotta/android/notification/call/BaseNotificationsCall$NotificationFilter;
    .locals 1

    .line 30
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsTab;->filter:Lcom/ibotta/android/notification/call/BaseNotificationsCall$NotificationFilter;

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 2

    .line 26
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object v0

    iget v1, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsTab;->nameResId:I

    invoke-virtual {v0, v1}, Lcom/ibotta/android/App;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
