.class public final Lcom/ibotta/android/notification/networking/model/NotificationsViewStateSuccess;
.super Lcom/ibotta/android/notification/networking/model/NotificationsViewState;
.source "NotificationsViewState.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nNotificationsViewState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NotificationsViewState.kt\ncom/ibotta/android/notification/networking/model/NotificationsViewStateSuccess\n*L\n1#1,13:1\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B)\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0008\u0002\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0008J\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0006H\u00c6\u0003J-\u0010\u0012\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u000e\u0008\u0002\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00052\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006H\u00c6\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001R\u0011\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\nR\u0017\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000e\u00a8\u0006\u001a"
    }
    d2 = {
        "Lcom/ibotta/android/notification/networking/model/NotificationsViewStateSuccess;",
        "Lcom/ibotta/android/notification/networking/model/NotificationsViewState;",
        "notificationsCount",
        "",
        "notifications",
        "",
        "Lcom/ibotta/android/notification/networking/model/Notification;",
        "notification",
        "(ILjava/util/List;Lcom/ibotta/android/notification/networking/model/Notification;)V",
        "getNotification",
        "()Lcom/ibotta/android/notification/networking/model/Notification;",
        "getNotifications",
        "()Ljava/util/List;",
        "getNotificationsCount",
        "()I",
        "component1",
        "component2",
        "component3",
        "copy",
        "equals",
        "",
        "other",
        "",
        "hashCode",
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
.field private final notification:Lcom/ibotta/android/notification/networking/model/Notification;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final notifications:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/android/notification/networking/model/Notification;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final notificationsCount:I


# direct methods
.method public constructor <init>()V
    .locals 6

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x7

    const/4 v5, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lcom/ibotta/android/notification/networking/model/NotificationsViewStateSuccess;-><init>(ILjava/util/List;Lcom/ibotta/android/notification/networking/model/Notification;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(ILjava/util/List;Lcom/ibotta/android/notification/networking/model/Notification;)V
    .locals 1
    .param p2    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/ibotta/android/notification/networking/model/Notification;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Lcom/ibotta/android/notification/networking/model/Notification;",
            ">;",
            "Lcom/ibotta/android/notification/networking/model/Notification;",
            ")V"
        }
    .end annotation

    const-string v0, "notifications"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "notification"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 9
    invoke-direct {p0, v0}, Lcom/ibotta/android/notification/networking/model/NotificationsViewState;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput p1, p0, Lcom/ibotta/android/notification/networking/model/NotificationsViewStateSuccess;->notificationsCount:I

    iput-object p2, p0, Lcom/ibotta/android/notification/networking/model/NotificationsViewStateSuccess;->notifications:Ljava/util/List;

    iput-object p3, p0, Lcom/ibotta/android/notification/networking/model/NotificationsViewStateSuccess;->notification:Lcom/ibotta/android/notification/networking/model/Notification;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/util/List;Lcom/ibotta/android/notification/networking/model/Notification;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 23

    and-int/lit8 v0, p4, 0x1

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    move/from16 v0, p1

    :goto_0
    and-int/lit8 v1, p4, 0x2

    if-eqz v1, :cond_1

    .line 7
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    check-cast v1, Ljava/util/List;

    goto :goto_1

    :cond_1
    move-object/from16 v1, p2

    :goto_1
    and-int/lit8 v2, p4, 0x4

    if-eqz v2, :cond_2

    .line 8
    new-instance v2, Lcom/ibotta/android/notification/networking/model/Notification;

    move-object v3, v2

    const-wide/16 v4, 0x0

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

    const/16 v19, 0x0

    const/16 v20, 0x0

    const v21, 0xffff

    const/16 v22, 0x0

    invoke-direct/range {v3 .. v22}, Lcom/ibotta/android/notification/networking/model/Notification;-><init>(JILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FLjava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v2, p0

    goto :goto_2

    :cond_2
    move-object/from16 v2, p0

    move-object/from16 v3, p3

    :goto_2
    invoke-direct {v2, v0, v1, v3}, Lcom/ibotta/android/notification/networking/model/NotificationsViewStateSuccess;-><init>(ILjava/util/List;Lcom/ibotta/android/notification/networking/model/Notification;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/ibotta/android/notification/networking/model/NotificationsViewStateSuccess;ILjava/util/List;Lcom/ibotta/android/notification/networking/model/Notification;ILjava/lang/Object;)Lcom/ibotta/android/notification/networking/model/NotificationsViewStateSuccess;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget p1, p0, Lcom/ibotta/android/notification/networking/model/NotificationsViewStateSuccess;->notificationsCount:I

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Lcom/ibotta/android/notification/networking/model/NotificationsViewStateSuccess;->notifications:Ljava/util/List;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Lcom/ibotta/android/notification/networking/model/NotificationsViewStateSuccess;->notification:Lcom/ibotta/android/notification/networking/model/Notification;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lcom/ibotta/android/notification/networking/model/NotificationsViewStateSuccess;->copy(ILjava/util/List;Lcom/ibotta/android/notification/networking/model/Notification;)Lcom/ibotta/android/notification/networking/model/NotificationsViewStateSuccess;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/ibotta/android/notification/networking/model/NotificationsViewStateSuccess;->notificationsCount:I

    return v0
.end method

.method public final component2()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/android/notification/networking/model/Notification;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/ibotta/android/notification/networking/model/NotificationsViewStateSuccess;->notifications:Ljava/util/List;

    return-object v0
.end method

.method public final component3()Lcom/ibotta/android/notification/networking/model/Notification;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/ibotta/android/notification/networking/model/NotificationsViewStateSuccess;->notification:Lcom/ibotta/android/notification/networking/model/Notification;

    return-object v0
.end method

.method public final copy(ILjava/util/List;Lcom/ibotta/android/notification/networking/model/Notification;)Lcom/ibotta/android/notification/networking/model/NotificationsViewStateSuccess;
    .locals 1
    .param p2    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/ibotta/android/notification/networking/model/Notification;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Lcom/ibotta/android/notification/networking/model/Notification;",
            ">;",
            "Lcom/ibotta/android/notification/networking/model/Notification;",
            ")",
            "Lcom/ibotta/android/notification/networking/model/NotificationsViewStateSuccess;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "notifications"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "notification"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/ibotta/android/notification/networking/model/NotificationsViewStateSuccess;

    invoke-direct {v0, p1, p2, p3}, Lcom/ibotta/android/notification/networking/model/NotificationsViewStateSuccess;-><init>(ILjava/util/List;Lcom/ibotta/android/notification/networking/model/Notification;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x1

    if-eq p0, p1, :cond_2

    instance-of v1, p1, Lcom/ibotta/android/notification/networking/model/NotificationsViewStateSuccess;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    check-cast p1, Lcom/ibotta/android/notification/networking/model/NotificationsViewStateSuccess;

    iget v1, p0, Lcom/ibotta/android/notification/networking/model/NotificationsViewStateSuccess;->notificationsCount:I

    iget v3, p1, Lcom/ibotta/android/notification/networking/model/NotificationsViewStateSuccess;->notificationsCount:I

    if-ne v1, v3, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/ibotta/android/notification/networking/model/NotificationsViewStateSuccess;->notifications:Ljava/util/List;

    iget-object v3, p1, Lcom/ibotta/android/notification/networking/model/NotificationsViewStateSuccess;->notifications:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/ibotta/android/notification/networking/model/NotificationsViewStateSuccess;->notification:Lcom/ibotta/android/notification/networking/model/Notification;

    iget-object p1, p1, Lcom/ibotta/android/notification/networking/model/NotificationsViewStateSuccess;->notification:Lcom/ibotta/android/notification/networking/model/Notification;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_1

    :cond_1
    return v2

    :cond_2
    :goto_1
    return v0
.end method

.method public final getNotification()Lcom/ibotta/android/notification/networking/model/Notification;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 8
    iget-object v0, p0, Lcom/ibotta/android/notification/networking/model/NotificationsViewStateSuccess;->notification:Lcom/ibotta/android/notification/networking/model/Notification;

    return-object v0
.end method

.method public final getNotifications()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/android/notification/networking/model/Notification;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 7
    iget-object v0, p0, Lcom/ibotta/android/notification/networking/model/NotificationsViewStateSuccess;->notifications:Ljava/util/List;

    return-object v0
.end method

.method public final getNotificationsCount()I
    .locals 1

    .line 6
    iget v0, p0, Lcom/ibotta/android/notification/networking/model/NotificationsViewStateSuccess;->notificationsCount:I

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget v0, p0, Lcom/ibotta/android/notification/networking/model/NotificationsViewStateSuccess;->notificationsCount:I

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/ibotta/android/notification/networking/model/NotificationsViewStateSuccess;->notifications:Ljava/util/List;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/ibotta/android/notification/networking/model/NotificationsViewStateSuccess;->notification:Lcom/ibotta/android/notification/networking/model/Notification;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :cond_1
    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "NotificationsViewStateSuccess(notificationsCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/ibotta/android/notification/networking/model/NotificationsViewStateSuccess;->notificationsCount:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", notifications="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/notification/networking/model/NotificationsViewStateSuccess;->notifications:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", notification="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/notification/networking/model/NotificationsViewStateSuccess;->notification:Lcom/ibotta/android/notification/networking/model/Notification;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
