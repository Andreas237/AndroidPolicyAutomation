.class public final Lcom/ibotta/android/notification/call/PendingNotificationsCall;
.super Lcom/ibotta/android/notification/call/BaseNotificationsCall;
.source "PendingNotificationsCall.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/notification/call/BaseNotificationsCall<",
        "Lcom/ibotta/android/notification/call/PendingNotificationsResponse;",
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
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0008\u0010\u0004\u001a\u00020\u0005H\u0016J\u000e\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0007H\u0016J\u0008\u0010\u0008\u001a\u00020\tH\u0016J\u0008\u0010\n\u001a\u00020\tH\u0016J\u0008\u0010\u000b\u001a\u00020\u0002H\u0014\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/ibotta/android/notification/call/PendingNotificationsCall;",
        "Lcom/ibotta/android/notification/call/BaseNotificationsCall;",
        "Lcom/ibotta/android/notification/call/PendingNotificationsResponse;",
        "()V",
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

    .line 3
    invoke-direct {p0}, Lcom/ibotta/android/notification/call/BaseNotificationsCall;-><init>()V

    return-void
.end method


# virtual methods
.method public getCacheFamily()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "pending_notifications"

    return-object v0
.end method

.method public getResponseType()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "Lcom/ibotta/android/notification/call/PendingNotificationsResponse;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 7
    const-class v0, Lcom/ibotta/android/notification/call/PendingNotificationsResponse;

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
    invoke-virtual {p0}, Lcom/ibotta/android/notification/call/PendingNotificationsCall;->newResponse()Lcom/ibotta/android/notification/call/PendingNotificationsResponse;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/notification/call/BaseNotificationsResponse;

    return-object v0
.end method

.method protected newResponse()Lcom/ibotta/android/notification/call/PendingNotificationsResponse;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 5
    new-instance v0, Lcom/ibotta/android/notification/call/PendingNotificationsResponse;

    invoke-direct {v0}, Lcom/ibotta/android/notification/call/PendingNotificationsResponse;-><init>()V

    return-object v0
.end method
