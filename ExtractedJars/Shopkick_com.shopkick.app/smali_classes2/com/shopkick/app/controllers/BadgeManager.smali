.class public Lcom/shopkick/app/controllers/BadgeManager;
.super Ljava/lang/Object;
.source "BadgeManager.java"


# static fields
.field public static final IN_APP_BADGE_VALUES_UPDATED:Ljava/lang/String; = "InAppBadgeValuesUpdated"


# instance fields
.field private appPreferences:Lcom/shopkick/app/application/AppPreferences;

.field private badgeProvider:Lcom/shopkick/app/util/badge/IBadgeProvider;

.field public badgeValues:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private context:Landroid/content/Context;

.field private notificationCenter:Lcom/shopkick/app/util/NotificationCenter;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/application/AppPreferences;Lcom/shopkick/app/util/NotificationCenter;Lcom/shopkick/app/util/badge/IBadgeProvider;Landroid/content/Context;)V
    .locals 2

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/controllers/BadgeManager;->badgeValues:Ljava/util/HashMap;

    .line 27
    iput-object p1, p0, Lcom/shopkick/app/controllers/BadgeManager;->appPreferences:Lcom/shopkick/app/application/AppPreferences;

    .line 28
    iput-object p2, p0, Lcom/shopkick/app/controllers/BadgeManager;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    .line 29
    iput-object p3, p0, Lcom/shopkick/app/controllers/BadgeManager;->badgeProvider:Lcom/shopkick/app/util/badge/IBadgeProvider;

    .line 30
    iput-object p4, p0, Lcom/shopkick/app/controllers/BadgeManager;->context:Landroid/content/Context;

    const-string p2, "pending_invites_badge_value"

    .line 32
    invoke-virtual {p1, p2}, Lcom/shopkick/app/application/AppPreferences;->getInt(Ljava/lang/String;)I

    move-result p2

    const-string p3, "editor_books_badge_value"

    .line 33
    invoke-virtual {p1, p3}, Lcom/shopkick/app/application/AppPreferences;->getInt(Ljava/lang/String;)I

    move-result p3

    const-string/jumbo p4, "walk_in_badge_value"

    .line 34
    invoke-virtual {p1, p4}, Lcom/shopkick/app/application/AppPreferences;->getInt(Ljava/lang/String;)I

    move-result p4

    const-string v0, "invite_friends_badge_value"

    .line 35
    invoke-virtual {p1, v0}, Lcom/shopkick/app/application/AppPreferences;->getInt(Ljava/lang/String;)I

    move-result p1

    .line 37
    iget-object v0, p0, Lcom/shopkick/app/controllers/BadgeManager;->badgeValues:Ljava/util/HashMap;

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {v0, v1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    iget-object p2, p0, Lcom/shopkick/app/controllers/BadgeManager;->badgeValues:Ljava/util/HashMap;

    const/4 v0, 0x2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-virtual {p2, v0, p3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    iget-object p2, p0, Lcom/shopkick/app/controllers/BadgeManager;->badgeValues:Ljava/util/HashMap;

    const/4 p3, 0x3

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p4

    invoke-virtual {p2, p3, p4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    iget-object p2, p0, Lcom/shopkick/app/controllers/BadgeManager;->badgeValues:Ljava/util/HashMap;

    const/4 p3, 0x4

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p2, p3, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private setExternalBadgeValue()V
    .locals 3

    .line 101
    iget-object v0, p0, Lcom/shopkick/app/controllers/BadgeManager;->badgeProvider:Lcom/shopkick/app/util/badge/IBadgeProvider;

    if-nez v0, :cond_0

    return-void

    .line 104
    :cond_0
    invoke-interface {v0}, Lcom/shopkick/app/util/badge/IBadgeProvider;->supportBadgeOnDevice()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 105
    iget-object v0, p0, Lcom/shopkick/app/controllers/BadgeManager;->badgeProvider:Lcom/shopkick/app/util/badge/IBadgeProvider;

    iget-object v1, p0, Lcom/shopkick/app/controllers/BadgeManager;->badgeValues:Ljava/util/HashMap;

    const/4 v2, 0x2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-interface {v0, v1}, Lcom/shopkick/app/util/badge/IBadgeProvider;->setBadge(I)V

    :cond_1
    return-void
.end method


# virtual methods
.method public clearBadgeValue(I)V
    .locals 3

    .line 80
    iget-object v0, p0, Lcom/shopkick/app/controllers/BadgeManager;->badgeValues:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-eqz v0, :cond_4

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-ne p1, v0, :cond_0

    .line 82
    iget-object p1, p0, Lcom/shopkick/app/controllers/BadgeManager;->badgeValues:Ljava/util/HashMap;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {p1, v0, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    iget-object p1, p0, Lcom/shopkick/app/controllers/BadgeManager;->appPreferences:Lcom/shopkick/app/application/AppPreferences;

    const-string v0, "pending_invites_badge_value"

    invoke-virtual {p1, v0, v1}, Lcom/shopkick/app/application/AppPreferences;->putInt(Ljava/lang/String;I)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    if-ne p1, v0, :cond_1

    .line 85
    iget-object p1, p0, Lcom/shopkick/app/controllers/BadgeManager;->badgeValues:Ljava/util/HashMap;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {p1, v0, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    iget-object p1, p0, Lcom/shopkick/app/controllers/BadgeManager;->appPreferences:Lcom/shopkick/app/application/AppPreferences;

    const-string v0, "editor_books_badge_value"

    invoke-virtual {p1, v0, v1}, Lcom/shopkick/app/application/AppPreferences;->putInt(Ljava/lang/String;I)V

    goto :goto_0

    :cond_1
    const/4 v0, 0x3

    if-ne p1, v0, :cond_2

    .line 88
    iget-object p1, p0, Lcom/shopkick/app/controllers/BadgeManager;->badgeValues:Ljava/util/HashMap;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {p1, v0, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 89
    iget-object p1, p0, Lcom/shopkick/app/controllers/BadgeManager;->appPreferences:Lcom/shopkick/app/application/AppPreferences;

    const-string/jumbo v0, "walk_in_badge_value"

    invoke-virtual {p1, v0, v1}, Lcom/shopkick/app/application/AppPreferences;->putInt(Ljava/lang/String;I)V

    goto :goto_0

    :cond_2
    const/4 v0, 0x4

    if-ne p1, v0, :cond_3

    .line 91
    iget-object p1, p0, Lcom/shopkick/app/controllers/BadgeManager;->badgeValues:Ljava/util/HashMap;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {p1, v0, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 92
    iget-object p1, p0, Lcom/shopkick/app/controllers/BadgeManager;->appPreferences:Lcom/shopkick/app/application/AppPreferences;

    const-string v0, "invite_friends_badge_value"

    invoke-virtual {p1, v0, v1}, Lcom/shopkick/app/application/AppPreferences;->putInt(Ljava/lang/String;I)V

    .line 95
    :cond_3
    :goto_0
    invoke-direct {p0}, Lcom/shopkick/app/controllers/BadgeManager;->setExternalBadgeValue()V

    .line 96
    iget-object p1, p0, Lcom/shopkick/app/controllers/BadgeManager;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v0, "InAppBadgeValuesUpdated"

    invoke-virtual {p1, v0}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;)Ljava/util/List;

    :cond_4
    return-void
.end method

.method public clearExternalBadgeValue()V
    .locals 2

    .line 110
    iget-object v0, p0, Lcom/shopkick/app/controllers/BadgeManager;->badgeProvider:Lcom/shopkick/app/util/badge/IBadgeProvider;

    if-nez v0, :cond_0

    return-void

    .line 114
    :cond_0
    invoke-interface {v0}, Lcom/shopkick/app/util/badge/IBadgeProvider;->supportBadgeOnDevice()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 115
    iget-object v0, p0, Lcom/shopkick/app/controllers/BadgeManager;->badgeProvider:Lcom/shopkick/app/util/badge/IBadgeProvider;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/shopkick/app/util/badge/IBadgeProvider;->setBadge(I)V

    :cond_1
    return-void
.end method

.method public getBadgeValue(I)I
    .locals 1

    .line 120
    iget-object v0, p0, Lcom/shopkick/app/controllers/BadgeManager;->badgeValues:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    if-eqz p1, :cond_0

    .line 121
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public updateBadgeValues(Ljava/util/Map;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x1

    .line 44
    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    const/4 v2, 0x2

    .line 45
    invoke-static {v2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v3

    invoke-interface {p1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    const/4 v4, 0x3

    .line 46
    invoke-static {v4}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v5

    invoke-interface {p1, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Integer;

    const/4 v6, 0x4

    .line 47
    invoke-static {v6}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v7

    invoke-interface {p1, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    if-nez v1, :cond_0

    if-nez v3, :cond_0

    if-nez v5, :cond_0

    if-eqz p1, :cond_5

    :cond_0
    const/4 v7, 0x0

    if-nez v1, :cond_1

    .line 53
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    :cond_1
    if-nez v3, :cond_2

    .line 56
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    :cond_2
    if-nez v5, :cond_3

    .line 59
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    :cond_3
    if-nez p1, :cond_4

    .line 62
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    .line 64
    :cond_4
    iget-object v7, p0, Lcom/shopkick/app/controllers/BadgeManager;->badgeValues:Ljava/util/HashMap;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v7, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    iget-object v0, p0, Lcom/shopkick/app/controllers/BadgeManager;->badgeValues:Ljava/util/HashMap;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    iget-object v0, p0, Lcom/shopkick/app/controllers/BadgeManager;->badgeValues:Ljava/util/HashMap;

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v2, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    iget-object v0, p0, Lcom/shopkick/app/controllers/BadgeManager;->badgeValues:Ljava/util/HashMap;

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v2, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    iget-object v0, p0, Lcom/shopkick/app/controllers/BadgeManager;->appPreferences:Lcom/shopkick/app/application/AppPreferences;

    const-string v2, "pending_invites_badge_value"

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v0, v2, v1}, Lcom/shopkick/app/application/AppPreferences;->putInt(Ljava/lang/String;I)V

    .line 70
    iget-object v0, p0, Lcom/shopkick/app/controllers/BadgeManager;->appPreferences:Lcom/shopkick/app/application/AppPreferences;

    const-string v1, "editor_books_badge_value"

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lcom/shopkick/app/application/AppPreferences;->putInt(Ljava/lang/String;I)V

    .line 71
    iget-object v0, p0, Lcom/shopkick/app/controllers/BadgeManager;->appPreferences:Lcom/shopkick/app/application/AppPreferences;

    const-string/jumbo v1, "walk_in_badge_value"

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lcom/shopkick/app/application/AppPreferences;->putInt(Ljava/lang/String;I)V

    .line 72
    iget-object v0, p0, Lcom/shopkick/app/controllers/BadgeManager;->appPreferences:Lcom/shopkick/app/application/AppPreferences;

    const-string v1, "invite_friends_badge_value"

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {v0, v1, p1}, Lcom/shopkick/app/application/AppPreferences;->putInt(Ljava/lang/String;I)V

    .line 74
    iget-object p1, p0, Lcom/shopkick/app/controllers/BadgeManager;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v0, "InAppBadgeValuesUpdated"

    invoke-virtual {p1, v0}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;)Ljava/util/List;

    .line 76
    :cond_5
    invoke-direct {p0}, Lcom/shopkick/app/controllers/BadgeManager;->setExternalBadgeValue()V

    return-void
.end method
