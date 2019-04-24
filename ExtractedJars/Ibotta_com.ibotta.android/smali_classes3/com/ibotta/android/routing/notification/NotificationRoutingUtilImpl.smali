.class public Lcom/ibotta/android/routing/notification/NotificationRoutingUtilImpl;
.super Ljava/lang/Object;
.source "NotificationRoutingUtilImpl.java"

# interfaces
.implements Lcom/ibotta/android/routing/notification/NotificationRoutingUtil;


# instance fields
.field private final routePreviewer:Lcom/ibotta/android/routing/RoutePreviewer;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/routing/RoutePreviewer;)V
    .locals 0

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-object p1, p0, Lcom/ibotta/android/routing/notification/NotificationRoutingUtilImpl;->routePreviewer:Lcom/ibotta/android/routing/RoutePreviewer;

    return-void
.end method

.method private isSpecialCaseNotification(Lcom/ibotta/android/notification/model/NotificationDisplayType;Lcom/ibotta/android/notification/model/NotificationStatus;)Z
    .locals 4

    .line 34
    sget-object v0, Lcom/ibotta/android/notification/model/NotificationDisplayType;->OFFER:Lcom/ibotta/android/notification/model/NotificationDisplayType;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-ne p1, v0, :cond_0

    sget-object v0, Lcom/ibotta/android/notification/model/NotificationStatus;->LIKED:Lcom/ibotta/android/notification/model/NotificationStatus;

    if-ne p2, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 37
    :goto_0
    sget-object v3, Lcom/ibotta/android/notification/model/NotificationDisplayType;->CUSTOMER:Lcom/ibotta/android/notification/model/NotificationDisplayType;

    if-ne p1, v3, :cond_2

    sget-object p1, Lcom/ibotta/android/notification/model/NotificationStatus;->MESSAGE:Lcom/ibotta/android/notification/model/NotificationStatus;

    if-eq p2, p1, :cond_1

    sget-object p1, Lcom/ibotta/android/notification/model/NotificationStatus;->EARNED:Lcom/ibotta/android/notification/model/NotificationStatus;

    if-ne p2, p1, :cond_2

    :cond_1
    const/4 p1, 0x1

    goto :goto_1

    :cond_2
    const/4 p1, 0x0

    :goto_1
    if-nez v0, :cond_4

    if-eqz p1, :cond_3

    goto :goto_2

    :cond_3
    const/4 v1, 0x0

    :cond_4
    :goto_2
    return v1
.end method


# virtual methods
.method public isNoOp(Lcom/ibotta/android/notification/model/NotificationDisplayType;Lcom/ibotta/android/notification/model/NotificationStatus;Ljava/lang/String;)Z
    .locals 1

    .line 23
    iget-object v0, p0, Lcom/ibotta/android/routing/notification/NotificationRoutingUtilImpl;->routePreviewer:Lcom/ibotta/android/routing/RoutePreviewer;

    invoke-interface {v0, p3}, Lcom/ibotta/android/routing/RoutePreviewer;->isNoOp(Ljava/lang/String;)Z

    move-result p3

    .line 25
    invoke-direct {p0, p1, p2}, Lcom/ibotta/android/routing/notification/NotificationRoutingUtilImpl;->isSpecialCaseNotification(Lcom/ibotta/android/notification/model/NotificationDisplayType;Lcom/ibotta/android/notification/model/NotificationStatus;)Z

    move-result p2

    if-nez p2, :cond_0

    if-nez p3, :cond_1

    :cond_0
    sget-object p2, Lcom/ibotta/android/notification/model/NotificationDisplayType;->SYSTEM:Lcom/ibotta/android/notification/model/NotificationDisplayType;

    if-ne p1, p2, :cond_2

    :cond_1
    const/4 p1, 0x1

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public shouldIgnoreRouteHandler(Lcom/ibotta/android/notification/model/NotificationDisplayType;Lcom/ibotta/android/notification/model/NotificationStatus;)Z
    .locals 1

    .line 30
    sget-object v0, Lcom/ibotta/android/notification/model/NotificationDisplayType;->CUSTOMER:Lcom/ibotta/android/notification/model/NotificationDisplayType;

    if-ne p1, v0, :cond_0

    sget-object p1, Lcom/ibotta/android/notification/model/NotificationStatus;->EARNED:Lcom/ibotta/android/notification/model/NotificationStatus;

    if-ne p2, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method
