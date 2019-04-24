.class public final enum Lcom/huawei/wallet/logic/event/IEventType;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lcom/huawei/wallet/logic/event/IEventType;>;"
    }
.end annotation


# static fields
.field public static final enum a:Lcom/huawei/wallet/logic/event/IEventType;

.field public static final enum b:Lcom/huawei/wallet/logic/event/IEventType;

.field public static final enum c:Lcom/huawei/wallet/logic/event/IEventType;

.field public static final enum d:Lcom/huawei/wallet/logic/event/IEventType;

.field public static final enum e:Lcom/huawei/wallet/logic/event/IEventType;

.field public static final enum f:Lcom/huawei/wallet/logic/event/IEventType;

.field public static final enum h:Lcom/huawei/wallet/logic/event/IEventType;

.field private static final synthetic i:[Lcom/huawei/wallet/logic/event/IEventType;

.field public static final enum k:Lcom/huawei/wallet/logic/event/IEventType;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 8
    new-instance v0, Lcom/huawei/wallet/logic/event/IEventType;

    const-string v1, "TYPE_CAMERA_IDENTIFY_CARD"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/huawei/wallet/logic/event/IEventType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/huawei/wallet/logic/event/IEventType;->b:Lcom/huawei/wallet/logic/event/IEventType;

    .line 13
    new-instance v0, Lcom/huawei/wallet/logic/event/IEventType;

    const-string v1, "TYPE_CAMERA_SWITCH_INPUT"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/huawei/wallet/logic/event/IEventType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/huawei/wallet/logic/event/IEventType;->a:Lcom/huawei/wallet/logic/event/IEventType;

    .line 18
    new-instance v0, Lcom/huawei/wallet/logic/event/IEventType;

    const-string v1, "TYPE_CAMERA_BACK_PRESSED"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/huawei/wallet/logic/event/IEventType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/huawei/wallet/logic/event/IEventType;->e:Lcom/huawei/wallet/logic/event/IEventType;

    .line 24
    new-instance v0, Lcom/huawei/wallet/logic/event/IEventType;

    const-string v1, "TYPE_NFC_IDENTIFY_CARD"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lcom/huawei/wallet/logic/event/IEventType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/huawei/wallet/logic/event/IEventType;->d:Lcom/huawei/wallet/logic/event/IEventType;

    .line 29
    new-instance v0, Lcom/huawei/wallet/logic/event/IEventType;

    const-string v1, "TYPE_GESRURE_GUIDE"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lcom/huawei/wallet/logic/event/IEventType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/huawei/wallet/logic/event/IEventType;->c:Lcom/huawei/wallet/logic/event/IEventType;

    .line 34
    new-instance v0, Lcom/huawei/wallet/logic/event/IEventType;

    const-string v1, "TYPE_GESTURE_VERIFY"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lcom/huawei/wallet/logic/event/IEventType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/huawei/wallet/logic/event/IEventType;->k:Lcom/huawei/wallet/logic/event/IEventType;

    .line 39
    new-instance v0, Lcom/huawei/wallet/logic/event/IEventType;

    const-string v1, "TYPE_THIRD_INVOKE_FINISH"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lcom/huawei/wallet/logic/event/IEventType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/huawei/wallet/logic/event/IEventType;->f:Lcom/huawei/wallet/logic/event/IEventType;

    .line 44
    new-instance v0, Lcom/huawei/wallet/logic/event/IEventType;

    const-string v1, "TYPE_WEIXIN_PAY_RESULT"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Lcom/huawei/wallet/logic/event/IEventType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/huawei/wallet/logic/event/IEventType;->h:Lcom/huawei/wallet/logic/event/IEventType;

    .line 3
    const/16 v0, 0x8

    new-array v0, v0, [Lcom/huawei/wallet/logic/event/IEventType;

    sget-object v1, Lcom/huawei/wallet/logic/event/IEventType;->b:Lcom/huawei/wallet/logic/event/IEventType;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lcom/huawei/wallet/logic/event/IEventType;->a:Lcom/huawei/wallet/logic/event/IEventType;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lcom/huawei/wallet/logic/event/IEventType;->e:Lcom/huawei/wallet/logic/event/IEventType;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lcom/huawei/wallet/logic/event/IEventType;->d:Lcom/huawei/wallet/logic/event/IEventType;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Lcom/huawei/wallet/logic/event/IEventType;->c:Lcom/huawei/wallet/logic/event/IEventType;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sget-object v1, Lcom/huawei/wallet/logic/event/IEventType;->k:Lcom/huawei/wallet/logic/event/IEventType;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    sget-object v1, Lcom/huawei/wallet/logic/event/IEventType;->f:Lcom/huawei/wallet/logic/event/IEventType;

    const/4 v2, 0x6

    aput-object v1, v0, v2

    sget-object v1, Lcom/huawei/wallet/logic/event/IEventType;->h:Lcom/huawei/wallet/logic/event/IEventType;

    const/4 v2, 0x7

    aput-object v1, v0, v2

    sput-object v0, Lcom/huawei/wallet/logic/event/IEventType;->i:[Lcom/huawei/wallet/logic/event/IEventType;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 3
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/huawei/wallet/logic/event/IEventType;
    .locals 1

    .line 3
    const-class v0, Lcom/huawei/wallet/logic/event/IEventType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/huawei/wallet/logic/event/IEventType;

    return-object v0
.end method

.method public static values()[Lcom/huawei/wallet/logic/event/IEventType;
    .locals 1

    .line 3
    sget-object v0, Lcom/huawei/wallet/logic/event/IEventType;->i:[Lcom/huawei/wallet/logic/event/IEventType;

    invoke-virtual {v0}, [Lcom/huawei/wallet/logic/event/IEventType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/huawei/wallet/logic/event/IEventType;

    return-object v0
.end method
