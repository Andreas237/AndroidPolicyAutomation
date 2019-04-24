.class final enum Lcom/shopkick/app/campaigns/MessageHistoryRecord$MessageType;
.super Ljava/lang/Enum;
.source "MessageHistoryRecord.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/campaigns/MessageHistoryRecord;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4018
    name = "MessageType"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/shopkick/app/campaigns/MessageHistoryRecord$MessageType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/shopkick/app/campaigns/MessageHistoryRecord$MessageType;

.field public static final enum Notification:Lcom/shopkick/app/campaigns/MessageHistoryRecord$MessageType;

.field public static final enum Overlay:Lcom/shopkick/app/campaigns/MessageHistoryRecord$MessageType;


# instance fields
.field private value:I


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 14
    new-instance v0, Lcom/shopkick/app/campaigns/MessageHistoryRecord$MessageType;

    const-string v1, "Overlay"

    const/4 v2, 0x0

    const/16 v3, 0xa

    invoke-direct {v0, v1, v2, v3}, Lcom/shopkick/app/campaigns/MessageHistoryRecord$MessageType;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/shopkick/app/campaigns/MessageHistoryRecord$MessageType;->Overlay:Lcom/shopkick/app/campaigns/MessageHistoryRecord$MessageType;

    .line 16
    new-instance v0, Lcom/shopkick/app/campaigns/MessageHistoryRecord$MessageType;

    const-string v1, "Notification"

    const/4 v3, 0x1

    const/16 v4, 0x14

    invoke-direct {v0, v1, v3, v4}, Lcom/shopkick/app/campaigns/MessageHistoryRecord$MessageType;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/shopkick/app/campaigns/MessageHistoryRecord$MessageType;->Notification:Lcom/shopkick/app/campaigns/MessageHistoryRecord$MessageType;

    const/4 v0, 0x2

    .line 12
    new-array v0, v0, [Lcom/shopkick/app/campaigns/MessageHistoryRecord$MessageType;

    sget-object v1, Lcom/shopkick/app/campaigns/MessageHistoryRecord$MessageType;->Overlay:Lcom/shopkick/app/campaigns/MessageHistoryRecord$MessageType;

    aput-object v1, v0, v2

    sget-object v1, Lcom/shopkick/app/campaigns/MessageHistoryRecord$MessageType;->Notification:Lcom/shopkick/app/campaigns/MessageHistoryRecord$MessageType;

    aput-object v1, v0, v3

    sput-object v0, Lcom/shopkick/app/campaigns/MessageHistoryRecord$MessageType;->$VALUES:[Lcom/shopkick/app/campaigns/MessageHistoryRecord$MessageType;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    .line 20
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lcom/shopkick/app/campaigns/MessageHistoryRecord$MessageType;->value:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/shopkick/app/campaigns/MessageHistoryRecord$MessageType;
    .locals 1

    .line 12
    const-class v0, Lcom/shopkick/app/campaigns/MessageHistoryRecord$MessageType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/shopkick/app/campaigns/MessageHistoryRecord$MessageType;

    return-object p0
.end method

.method public static values()[Lcom/shopkick/app/campaigns/MessageHistoryRecord$MessageType;
    .locals 1

    .line 12
    sget-object v0, Lcom/shopkick/app/campaigns/MessageHistoryRecord$MessageType;->$VALUES:[Lcom/shopkick/app/campaigns/MessageHistoryRecord$MessageType;

    invoke-virtual {v0}, [Lcom/shopkick/app/campaigns/MessageHistoryRecord$MessageType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/shopkick/app/campaigns/MessageHistoryRecord$MessageType;

    return-object v0
.end method


# virtual methods
.method public getValue()I
    .locals 1

    .line 23
    iget v0, p0, Lcom/shopkick/app/campaigns/MessageHistoryRecord$MessageType;->value:I

    return v0
.end method
