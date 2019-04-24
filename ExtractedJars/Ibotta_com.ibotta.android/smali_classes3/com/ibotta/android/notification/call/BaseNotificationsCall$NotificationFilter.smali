.class public final enum Lcom/ibotta/android/notification/call/BaseNotificationsCall$NotificationFilter;
.super Ljava/lang/Enum;
.source "BaseNotificationsCall.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/notification/call/BaseNotificationsCall;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "NotificationFilter"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/ibotta/android/notification/call/BaseNotificationsCall$NotificationFilter;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nBaseNotificationsCall.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseNotificationsCall.kt\ncom/ibotta/android/notification/call/BaseNotificationsCall$NotificationFilter\n*L\n1#1,101:1\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0004\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lcom/ibotta/android/notification/call/BaseNotificationsCall$NotificationFilter;",
        "",
        "(Ljava/lang/String;I)V",
        "toApiName",
        "",
        "All",
        "ME",
        "FRIEND",
        "ibotta-notification_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/ibotta/android/notification/call/BaseNotificationsCall$NotificationFilter;

.field public static final enum All:Lcom/ibotta/android/notification/call/BaseNotificationsCall$NotificationFilter;

.field public static final enum FRIEND:Lcom/ibotta/android/notification/call/BaseNotificationsCall$NotificationFilter;

.field public static final enum ME:Lcom/ibotta/android/notification/call/BaseNotificationsCall$NotificationFilter;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const/4 v0, 0x3

    new-array v0, v0, [Lcom/ibotta/android/notification/call/BaseNotificationsCall$NotificationFilter;

    new-instance v1, Lcom/ibotta/android/notification/call/BaseNotificationsCall$NotificationFilter;

    const-string v2, "All"

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3}, Lcom/ibotta/android/notification/call/BaseNotificationsCall$NotificationFilter;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/ibotta/android/notification/call/BaseNotificationsCall$NotificationFilter;->All:Lcom/ibotta/android/notification/call/BaseNotificationsCall$NotificationFilter;

    aput-object v1, v0, v3

    new-instance v1, Lcom/ibotta/android/notification/call/BaseNotificationsCall$NotificationFilter;

    const-string v2, "ME"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Lcom/ibotta/android/notification/call/BaseNotificationsCall$NotificationFilter;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/ibotta/android/notification/call/BaseNotificationsCall$NotificationFilter;->ME:Lcom/ibotta/android/notification/call/BaseNotificationsCall$NotificationFilter;

    aput-object v1, v0, v3

    new-instance v1, Lcom/ibotta/android/notification/call/BaseNotificationsCall$NotificationFilter;

    const-string v2, "FRIEND"

    const/4 v3, 0x2

    invoke-direct {v1, v2, v3}, Lcom/ibotta/android/notification/call/BaseNotificationsCall$NotificationFilter;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/ibotta/android/notification/call/BaseNotificationsCall$NotificationFilter;->FRIEND:Lcom/ibotta/android/notification/call/BaseNotificationsCall$NotificationFilter;

    aput-object v1, v0, v3

    sput-object v0, Lcom/ibotta/android/notification/call/BaseNotificationsCall$NotificationFilter;->$VALUES:[Lcom/ibotta/android/notification/call/BaseNotificationsCall$NotificationFilter;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 16
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ibotta/android/notification/call/BaseNotificationsCall$NotificationFilter;
    .locals 1

    const-class v0, Lcom/ibotta/android/notification/call/BaseNotificationsCall$NotificationFilter;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/notification/call/BaseNotificationsCall$NotificationFilter;

    return-object p0
.end method

.method public static values()[Lcom/ibotta/android/notification/call/BaseNotificationsCall$NotificationFilter;
    .locals 1

    sget-object v0, Lcom/ibotta/android/notification/call/BaseNotificationsCall$NotificationFilter;->$VALUES:[Lcom/ibotta/android/notification/call/BaseNotificationsCall$NotificationFilter;

    invoke-virtual {v0}, [Lcom/ibotta/android/notification/call/BaseNotificationsCall$NotificationFilter;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ibotta/android/notification/call/BaseNotificationsCall$NotificationFilter;

    return-object v0
.end method


# virtual methods
.method public final toApiName()Ljava/lang/String;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 19
    invoke-virtual {p0}, Lcom/ibotta/android/notification/call/BaseNotificationsCall$NotificationFilter;->toString()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    const-string v1, "(this as java.lang.String).toLowerCase()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0

    :cond_0
    new-instance v0, Lkotlin/TypeCastException;

    const-string v1, "null cannot be cast to non-null type java.lang.String"

    invoke-direct {v0, v1}, Lkotlin/TypeCastException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
