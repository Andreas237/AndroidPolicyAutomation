.class final enum Lcom/usebutton/sdk/internal/NotificationFactory$NotificationType;
.super Ljava/lang/Enum;
.source "NotificationFactory.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/usebutton/sdk/internal/NotificationFactory;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4018
    name = "NotificationType"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/usebutton/sdk/internal/NotificationFactory$NotificationType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/usebutton/sdk/internal/NotificationFactory$NotificationType;

.field public static final enum APP_TO_APP_NOTIFICATION:Lcom/usebutton/sdk/internal/NotificationFactory$NotificationType;


# instance fields
.field private final notificationId:I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 40
    new-instance v0, Lcom/usebutton/sdk/internal/NotificationFactory$NotificationType;

    const-string v1, "APP_TO_APP_NOTIFICATION"

    const/4 v2, 0x0

    const/16 v3, 0x7c2

    invoke-direct {v0, v1, v2, v3}, Lcom/usebutton/sdk/internal/NotificationFactory$NotificationType;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/usebutton/sdk/internal/NotificationFactory$NotificationType;->APP_TO_APP_NOTIFICATION:Lcom/usebutton/sdk/internal/NotificationFactory$NotificationType;

    const/4 v0, 0x1

    .line 39
    new-array v0, v0, [Lcom/usebutton/sdk/internal/NotificationFactory$NotificationType;

    sget-object v1, Lcom/usebutton/sdk/internal/NotificationFactory$NotificationType;->APP_TO_APP_NOTIFICATION:Lcom/usebutton/sdk/internal/NotificationFactory$NotificationType;

    aput-object v1, v0, v2

    sput-object v0, Lcom/usebutton/sdk/internal/NotificationFactory$NotificationType;->$VALUES:[Lcom/usebutton/sdk/internal/NotificationFactory$NotificationType;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    .line 44
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 45
    iput p3, p0, Lcom/usebutton/sdk/internal/NotificationFactory$NotificationType;->notificationId:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/usebutton/sdk/internal/NotificationFactory$NotificationType;
    .locals 1

    .line 39
    const-class v0, Lcom/usebutton/sdk/internal/NotificationFactory$NotificationType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/usebutton/sdk/internal/NotificationFactory$NotificationType;

    return-object p0
.end method

.method public static values()[Lcom/usebutton/sdk/internal/NotificationFactory$NotificationType;
    .locals 1

    .line 39
    sget-object v0, Lcom/usebutton/sdk/internal/NotificationFactory$NotificationType;->$VALUES:[Lcom/usebutton/sdk/internal/NotificationFactory$NotificationType;

    invoke-virtual {v0}, [Lcom/usebutton/sdk/internal/NotificationFactory$NotificationType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/usebutton/sdk/internal/NotificationFactory$NotificationType;

    return-object v0
.end method


# virtual methods
.method public getNotificationId()I
    .locals 1

    .line 49
    iget v0, p0, Lcom/usebutton/sdk/internal/NotificationFactory$NotificationType;->notificationId:I

    return v0
.end method
