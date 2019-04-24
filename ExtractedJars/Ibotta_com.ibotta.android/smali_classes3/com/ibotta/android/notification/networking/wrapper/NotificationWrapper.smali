.class public final Lcom/ibotta/android/notification/networking/wrapper/NotificationWrapper;
.super Ljava/lang/Object;
.source "NotificationWrapper.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\u000f\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\u0008\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u000c\u001a\u00020\rH\u00d6\u0001J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0010"
    }
    d2 = {
        "Lcom/ibotta/android/notification/networking/wrapper/NotificationWrapper;",
        "",
        "getShopperNotificationById",
        "Lcom/ibotta/android/notification/networking/model/Notification;",
        "(Lcom/ibotta/android/notification/networking/model/Notification;)V",
        "getGetShopperNotificationById",
        "()Lcom/ibotta/android/notification/networking/model/Notification;",
        "component1",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "",
        "toString",
        "",
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
.field private final getShopperNotificationById:Lcom/ibotta/android/notification/networking/model/Notification;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1, v0}, Lcom/ibotta/android/notification/networking/wrapper/NotificationWrapper;-><init>(Lcom/ibotta/android/notification/networking/model/Notification;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lcom/ibotta/android/notification/networking/model/Notification;)V
    .locals 1
    .param p1    # Lcom/ibotta/android/notification/networking/model/Notification;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "getShopperNotificationById"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/notification/networking/wrapper/NotificationWrapper;->getShopperNotificationById:Lcom/ibotta/android/notification/networking/model/Notification;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/ibotta/android/notification/networking/model/Notification;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 21

    and-int/lit8 v0, p2, 0x1

    if-eqz v0, :cond_0

    .line 5
    new-instance v0, Lcom/ibotta/android/notification/networking/model/Notification;

    move-object v1, v0

    const-wide/16 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const v19, 0xffff

    const/16 v20, 0x0

    invoke-direct/range {v1 .. v20}, Lcom/ibotta/android/notification/networking/model/Notification;-><init>(JILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FLjava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v0, p0

    goto :goto_0

    :cond_0
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    :goto_0
    invoke-direct {v0, v1}, Lcom/ibotta/android/notification/networking/wrapper/NotificationWrapper;-><init>(Lcom/ibotta/android/notification/networking/model/Notification;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/ibotta/android/notification/networking/wrapper/NotificationWrapper;Lcom/ibotta/android/notification/networking/model/Notification;ILjava/lang/Object;)Lcom/ibotta/android/notification/networking/wrapper/NotificationWrapper;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    iget-object p1, p0, Lcom/ibotta/android/notification/networking/wrapper/NotificationWrapper;->getShopperNotificationById:Lcom/ibotta/android/notification/networking/model/Notification;

    :cond_0
    invoke-virtual {p0, p1}, Lcom/ibotta/android/notification/networking/wrapper/NotificationWrapper;->copy(Lcom/ibotta/android/notification/networking/model/Notification;)Lcom/ibotta/android/notification/networking/wrapper/NotificationWrapper;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/ibotta/android/notification/networking/model/Notification;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/ibotta/android/notification/networking/wrapper/NotificationWrapper;->getShopperNotificationById:Lcom/ibotta/android/notification/networking/model/Notification;

    return-object v0
.end method

.method public final copy(Lcom/ibotta/android/notification/networking/model/Notification;)Lcom/ibotta/android/notification/networking/wrapper/NotificationWrapper;
    .locals 1
    .param p1    # Lcom/ibotta/android/notification/networking/model/Notification;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "getShopperNotificationById"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/ibotta/android/notification/networking/wrapper/NotificationWrapper;

    invoke-direct {v0, p1}, Lcom/ibotta/android/notification/networking/wrapper/NotificationWrapper;-><init>(Lcom/ibotta/android/notification/networking/model/Notification;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    if-eq p0, p1, :cond_1

    instance-of v0, p1, Lcom/ibotta/android/notification/networking/wrapper/NotificationWrapper;

    if-eqz v0, :cond_0

    check-cast p1, Lcom/ibotta/android/notification/networking/wrapper/NotificationWrapper;

    iget-object v0, p0, Lcom/ibotta/android/notification/networking/wrapper/NotificationWrapper;->getShopperNotificationById:Lcom/ibotta/android/notification/networking/model/Notification;

    iget-object p1, p1, Lcom/ibotta/android/notification/networking/wrapper/NotificationWrapper;->getShopperNotificationById:Lcom/ibotta/android/notification/networking/model/Notification;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public final getGetShopperNotificationById()Lcom/ibotta/android/notification/networking/model/Notification;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 5
    iget-object v0, p0, Lcom/ibotta/android/notification/networking/wrapper/NotificationWrapper;->getShopperNotificationById:Lcom/ibotta/android/notification/networking/model/Notification;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lcom/ibotta/android/notification/networking/wrapper/NotificationWrapper;->getShopperNotificationById:Lcom/ibotta/android/notification/networking/model/Notification;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "NotificationWrapper(getShopperNotificationById="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/notification/networking/wrapper/NotificationWrapper;->getShopperNotificationById:Lcom/ibotta/android/notification/networking/model/Notification;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
