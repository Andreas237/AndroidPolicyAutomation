.class final enum Lcom/huawei/hms/support/api/push/PushReceiver$d;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hms/support/api/push/PushReceiver;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4018
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lcom/huawei/hms/support/api/push/PushReceiver$d;>;"
    }
.end annotation


# static fields
.field public static final enum a:Lcom/huawei/hms/support/api/push/PushReceiver$d;

.field public static final enum b:Lcom/huawei/hms/support/api/push/PushReceiver$d;

.field public static final enum c:Lcom/huawei/hms/support/api/push/PushReceiver$d;

.field public static final enum d:Lcom/huawei/hms/support/api/push/PushReceiver$d;

.field public static final enum e:Lcom/huawei/hms/support/api/push/PushReceiver$d;

.field public static final enum f:Lcom/huawei/hms/support/api/push/PushReceiver$d;

.field private static final synthetic g:[Lcom/huawei/hms/support/api/push/PushReceiver$d;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 60
    new-instance v0, Lcom/huawei/hms/support/api/push/PushReceiver$d;

    const-string v1, "ReceiveType_Init"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/huawei/hms/support/api/push/PushReceiver$d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/huawei/hms/support/api/push/PushReceiver$d;->a:Lcom/huawei/hms/support/api/push/PushReceiver$d;

    new-instance v0, Lcom/huawei/hms/support/api/push/PushReceiver$d;

    const-string v1, "ReceiveType_Token"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/huawei/hms/support/api/push/PushReceiver$d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/huawei/hms/support/api/push/PushReceiver$d;->b:Lcom/huawei/hms/support/api/push/PushReceiver$d;

    new-instance v0, Lcom/huawei/hms/support/api/push/PushReceiver$d;

    const-string v1, "ReceiveType_Msg"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/huawei/hms/support/api/push/PushReceiver$d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/huawei/hms/support/api/push/PushReceiver$d;->c:Lcom/huawei/hms/support/api/push/PushReceiver$d;

    new-instance v0, Lcom/huawei/hms/support/api/push/PushReceiver$d;

    const-string v1, "ReceiveType_PushState"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lcom/huawei/hms/support/api/push/PushReceiver$d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/huawei/hms/support/api/push/PushReceiver$d;->d:Lcom/huawei/hms/support/api/push/PushReceiver$d;

    new-instance v0, Lcom/huawei/hms/support/api/push/PushReceiver$d;

    const-string v1, "ReceiveType_NotifyClick"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lcom/huawei/hms/support/api/push/PushReceiver$d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/huawei/hms/support/api/push/PushReceiver$d;->e:Lcom/huawei/hms/support/api/push/PushReceiver$d;

    new-instance v0, Lcom/huawei/hms/support/api/push/PushReceiver$d;

    const-string v1, "ReceiveType_ClickBtn"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lcom/huawei/hms/support/api/push/PushReceiver$d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/huawei/hms/support/api/push/PushReceiver$d;->f:Lcom/huawei/hms/support/api/push/PushReceiver$d;

    .line 59
    const/4 v0, 0x6

    new-array v0, v0, [Lcom/huawei/hms/support/api/push/PushReceiver$d;

    sget-object v1, Lcom/huawei/hms/support/api/push/PushReceiver$d;->a:Lcom/huawei/hms/support/api/push/PushReceiver$d;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lcom/huawei/hms/support/api/push/PushReceiver$d;->b:Lcom/huawei/hms/support/api/push/PushReceiver$d;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lcom/huawei/hms/support/api/push/PushReceiver$d;->c:Lcom/huawei/hms/support/api/push/PushReceiver$d;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lcom/huawei/hms/support/api/push/PushReceiver$d;->d:Lcom/huawei/hms/support/api/push/PushReceiver$d;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Lcom/huawei/hms/support/api/push/PushReceiver$d;->e:Lcom/huawei/hms/support/api/push/PushReceiver$d;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sget-object v1, Lcom/huawei/hms/support/api/push/PushReceiver$d;->f:Lcom/huawei/hms/support/api/push/PushReceiver$d;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    sput-object v0, Lcom/huawei/hms/support/api/push/PushReceiver$d;->g:[Lcom/huawei/hms/support/api/push/PushReceiver$d;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 59
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/huawei/hms/support/api/push/PushReceiver$d;
    .locals 1

    .line 59
    const-class v0, Lcom/huawei/hms/support/api/push/PushReceiver$d;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/huawei/hms/support/api/push/PushReceiver$d;

    return-object v0
.end method

.method public static values()[Lcom/huawei/hms/support/api/push/PushReceiver$d;
    .locals 1

    .line 59
    sget-object v0, Lcom/huawei/hms/support/api/push/PushReceiver$d;->g:[Lcom/huawei/hms/support/api/push/PushReceiver$d;

    invoke-virtual {v0}, [Lcom/huawei/hms/support/api/push/PushReceiver$d;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/huawei/hms/support/api/push/PushReceiver$d;

    return-object v0
.end method
