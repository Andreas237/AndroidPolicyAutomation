.class public Lcom/ibotta/android/notification/call/BaseNotificationsResponse;
.super Lcom/ibotta/api/CacheableApiResponse;
.source "BaseNotificationsResponse.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nBaseNotificationsResponse.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseNotificationsResponse.kt\ncom/ibotta/android/notification/call/BaseNotificationsResponse\n*L\n1#1,19:1\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0008\u0016\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\n\u001a\u00020\u000b2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u0001H\u0016R \u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007\"\u0004\u0008\u0008\u0010\t\u00a8\u0006\r"
    }
    d2 = {
        "Lcom/ibotta/android/notification/call/BaseNotificationsResponse;",
        "Lcom/ibotta/api/CacheableApiResponse;",
        "()V",
        "notifications",
        "",
        "Lcom/ibotta/android/notification/model/Notification;",
        "getNotifications",
        "()Ljava/util/List;",
        "setNotifications",
        "(Ljava/util/List;)V",
        "copy",
        "",
        "response",
        "ibotta-notification_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# instance fields
.field private notifications:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/android/notification/model/Notification;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 8
    invoke-direct {p0}, Lcom/ibotta/api/CacheableApiResponse;-><init>()V

    .line 9
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    check-cast v0, Ljava/util/List;

    iput-object v0, p0, Lcom/ibotta/android/notification/call/BaseNotificationsResponse;->notifications:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public copy(Lcom/ibotta/api/CacheableApiResponse;)V
    .locals 1
    .param p1    # Lcom/ibotta/api/CacheableApiResponse;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    if-eqz p1, :cond_0

    .line 13
    invoke-super {p0, p1}, Lcom/ibotta/api/CacheableApiResponse;->copy(Lcom/ibotta/api/CacheableApiResponse;)V

    .line 14
    instance-of v0, p1, Lcom/ibotta/android/notification/call/BaseNotificationsResponse;

    if-eqz v0, :cond_0

    .line 15
    check-cast p1, Lcom/ibotta/android/notification/call/BaseNotificationsResponse;

    iget-object v0, p0, Lcom/ibotta/android/notification/call/BaseNotificationsResponse;->notifications:Ljava/util/List;

    iput-object v0, p1, Lcom/ibotta/android/notification/call/BaseNotificationsResponse;->notifications:Ljava/util/List;

    :cond_0
    return-void
.end method

.method public final getNotifications()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/android/notification/model/Notification;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 9
    iget-object v0, p0, Lcom/ibotta/android/notification/call/BaseNotificationsResponse;->notifications:Ljava/util/List;

    return-object v0
.end method

.method public final setNotifications(Ljava/util/List;)V
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/notification/model/Notification;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    iput-object p1, p0, Lcom/ibotta/android/notification/call/BaseNotificationsResponse;->notifications:Ljava/util/List;

    return-void
.end method
