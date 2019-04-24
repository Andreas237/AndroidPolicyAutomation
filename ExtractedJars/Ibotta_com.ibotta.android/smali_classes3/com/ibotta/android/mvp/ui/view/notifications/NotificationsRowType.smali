.class public final enum Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsRowType;
.super Ljava/lang/Enum;
.source "NotificationsRowType.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsRowType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsRowType;

.field public static final enum EMPTY_MINE:Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsRowType;

.field public static final enum EMPTY_TEAMMATES:Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsRowType;

.field public static final enum LOADING_SPINNER:Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsRowType;

.field public static final enum NOTIFICATION:Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsRowType;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 8
    new-instance v0, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsRowType;

    const-string v1, "NOTIFICATION"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsRowType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsRowType;->NOTIFICATION:Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsRowType;

    .line 9
    new-instance v0, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsRowType;

    const-string v1, "EMPTY_MINE"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsRowType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsRowType;->EMPTY_MINE:Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsRowType;

    .line 10
    new-instance v0, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsRowType;

    const-string v1, "EMPTY_TEAMMATES"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsRowType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsRowType;->EMPTY_TEAMMATES:Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsRowType;

    .line 11
    new-instance v0, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsRowType;

    const-string v1, "LOADING_SPINNER"

    const/4 v5, 0x3

    invoke-direct {v0, v1, v5}, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsRowType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsRowType;->LOADING_SPINNER:Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsRowType;

    const/4 v0, 0x4

    .line 7
    new-array v0, v0, [Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsRowType;

    sget-object v1, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsRowType;->NOTIFICATION:Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsRowType;

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsRowType;->EMPTY_MINE:Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsRowType;

    aput-object v1, v0, v3

    sget-object v1, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsRowType;->EMPTY_TEAMMATES:Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsRowType;

    aput-object v1, v0, v4

    sget-object v1, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsRowType;->LOADING_SPINNER:Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsRowType;

    aput-object v1, v0, v5

    sput-object v0, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsRowType;->$VALUES:[Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsRowType;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 7
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsRowType;
    .locals 1

    .line 7
    const-class v0, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsRowType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsRowType;

    return-object p0
.end method

.method public static values()[Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsRowType;
    .locals 1

    .line 7
    sget-object v0, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsRowType;->$VALUES:[Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsRowType;

    invoke-virtual {v0}, [Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsRowType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsRowType;

    return-object v0
.end method
