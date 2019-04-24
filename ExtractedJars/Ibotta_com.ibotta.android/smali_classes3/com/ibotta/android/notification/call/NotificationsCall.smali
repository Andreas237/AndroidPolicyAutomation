.class public final Lcom/ibotta/android/notification/call/NotificationsCall;
.super Lcom/ibotta/android/notification/call/BaseNotificationsCall;
.source "NotificationsCall.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/notification/call/BaseNotificationsCall<",
        "Lcom/ibotta/android/notification/call/NotificationsResponse;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\u0008\u0016\u00a2\u0006\u0002\u0010\u0003B\'\u0008\u0016\u0012\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0008\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\u0008\u0010\u000c\u001a\u00020\rH\u0016J\u000e\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u000fH\u0016J\u0008\u0010\u0010\u001a\u00020\u0011H\u0016J\u0008\u0010\u0012\u001a\u00020\u0011H\u0016J\u0008\u0010\u0013\u001a\u00020\u0002H\u0014\u00a8\u0006\u0014"
    }
    d2 = {
        "Lcom/ibotta/android/notification/call/NotificationsCall;",
        "Lcom/ibotta/android/notification/call/BaseNotificationsCall;",
        "Lcom/ibotta/android/notification/call/NotificationsResponse;",
        "()V",
        "filters",
        "",
        "Lcom/ibotta/android/notification/call/BaseNotificationsCall$NotificationFilter;",
        "before",
        "",
        "limit",
        "",
        "(Ljava/util/Set;Ljava/lang/Long;I)V",
        "getCacheFamily",
        "",
        "getResponseType",
        "Ljava/lang/Class;",
        "isInvalidatesCacheFamily",
        "",
        "isInvalidatesCacheFamilyOnWrite",
        "newResponse",
        "ibotta-notification_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 4
    invoke-direct {p0}, Lcom/ibotta/android/notification/call/BaseNotificationsCall;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/util/Set;Ljava/lang/Long;I)V
    .locals 1
    .param p1    # Ljava/util/Set;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Long;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "+",
            "Lcom/ibotta/android/notification/call/BaseNotificationsCall$NotificationFilter;",
            ">;",
            "Ljava/lang/Long;",
            "I)V"
        }
    .end annotation

    const-string v0, "filters"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    invoke-direct {p0, p1, p2, p3}, Lcom/ibotta/android/notification/call/BaseNotificationsCall;-><init>(Ljava/util/Set;Ljava/lang/Long;I)V

    return-void
.end method


# virtual methods
.method public getCacheFamily()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "notifications"

    return-object v0
.end method

.method public getResponseType()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "Lcom/ibotta/android/notification/call/NotificationsResponse;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 11
    const-class v0, Lcom/ibotta/android/notification/call/NotificationsResponse;

    return-object v0
.end method

.method public isInvalidatesCacheFamily()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public isInvalidatesCacheFamilyOnWrite()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public bridge synthetic newResponse()Lcom/ibotta/android/notification/call/BaseNotificationsResponse;
    .locals 1

    .line 3
    invoke-virtual {p0}, Lcom/ibotta/android/notification/call/NotificationsCall;->newResponse()Lcom/ibotta/android/notification/call/NotificationsResponse;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/notification/call/BaseNotificationsResponse;

    return-object v0
.end method

.method protected newResponse()Lcom/ibotta/android/notification/call/NotificationsResponse;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 9
    new-instance v0, Lcom/ibotta/android/notification/call/NotificationsResponse;

    invoke-direct {v0}, Lcom/ibotta/android/notification/call/NotificationsResponse;-><init>()V

    return-object v0
.end method
