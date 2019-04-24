.class public final enum Lcom/shopkick/sdk/campaign/Message$MessageBackgroundType;
.super Ljava/lang/Enum;
.source "Message.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/sdk/campaign/Message;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "MessageBackgroundType"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/shopkick/sdk/campaign/Message$MessageBackgroundType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/shopkick/sdk/campaign/Message$MessageBackgroundType;

.field public static final enum LAUNCH_DEEP_LINK:Lcom/shopkick/sdk/campaign/Message$MessageBackgroundType;

.field public static final enum OPEN_APP:Lcom/shopkick/sdk/campaign/Message$MessageBackgroundType;

.field public static final enum SHOW_OVERLAY:Lcom/shopkick/sdk/campaign/Message$MessageBackgroundType;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 23
    new-instance v0, Lcom/shopkick/sdk/campaign/Message$MessageBackgroundType;

    const-string v1, "OPEN_APP"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/shopkick/sdk/campaign/Message$MessageBackgroundType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/sdk/campaign/Message$MessageBackgroundType;->OPEN_APP:Lcom/shopkick/sdk/campaign/Message$MessageBackgroundType;

    .line 27
    new-instance v0, Lcom/shopkick/sdk/campaign/Message$MessageBackgroundType;

    const-string v1, "SHOW_OVERLAY"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/shopkick/sdk/campaign/Message$MessageBackgroundType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/sdk/campaign/Message$MessageBackgroundType;->SHOW_OVERLAY:Lcom/shopkick/sdk/campaign/Message$MessageBackgroundType;

    .line 31
    new-instance v0, Lcom/shopkick/sdk/campaign/Message$MessageBackgroundType;

    const-string v1, "LAUNCH_DEEP_LINK"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Lcom/shopkick/sdk/campaign/Message$MessageBackgroundType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/sdk/campaign/Message$MessageBackgroundType;->LAUNCH_DEEP_LINK:Lcom/shopkick/sdk/campaign/Message$MessageBackgroundType;

    const/4 v0, 0x3

    .line 19
    new-array v0, v0, [Lcom/shopkick/sdk/campaign/Message$MessageBackgroundType;

    sget-object v1, Lcom/shopkick/sdk/campaign/Message$MessageBackgroundType;->OPEN_APP:Lcom/shopkick/sdk/campaign/Message$MessageBackgroundType;

    aput-object v1, v0, v2

    sget-object v1, Lcom/shopkick/sdk/campaign/Message$MessageBackgroundType;->SHOW_OVERLAY:Lcom/shopkick/sdk/campaign/Message$MessageBackgroundType;

    aput-object v1, v0, v3

    sget-object v1, Lcom/shopkick/sdk/campaign/Message$MessageBackgroundType;->LAUNCH_DEEP_LINK:Lcom/shopkick/sdk/campaign/Message$MessageBackgroundType;

    aput-object v1, v0, v4

    sput-object v0, Lcom/shopkick/sdk/campaign/Message$MessageBackgroundType;->$VALUES:[Lcom/shopkick/sdk/campaign/Message$MessageBackgroundType;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 19
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static translateBackgroundType(Ljava/lang/Integer;)Lcom/shopkick/sdk/campaign/Message$MessageBackgroundType;
    .locals 0

    if-nez p0, :cond_0

    .line 36
    sget-object p0, Lcom/shopkick/sdk/campaign/Message$MessageBackgroundType;->OPEN_APP:Lcom/shopkick/sdk/campaign/Message$MessageBackgroundType;

    return-object p0

    .line 38
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    packed-switch p0, :pswitch_data_0

    .line 44
    sget-object p0, Lcom/shopkick/sdk/campaign/Message$MessageBackgroundType;->OPEN_APP:Lcom/shopkick/sdk/campaign/Message$MessageBackgroundType;

    return-object p0

    .line 40
    :pswitch_0
    sget-object p0, Lcom/shopkick/sdk/campaign/Message$MessageBackgroundType;->LAUNCH_DEEP_LINK:Lcom/shopkick/sdk/campaign/Message$MessageBackgroundType;

    return-object p0

    .line 42
    :pswitch_1
    sget-object p0, Lcom/shopkick/sdk/campaign/Message$MessageBackgroundType;->SHOW_OVERLAY:Lcom/shopkick/sdk/campaign/Message$MessageBackgroundType;

    return-object p0

    nop

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/shopkick/sdk/campaign/Message$MessageBackgroundType;
    .locals 1

    .line 19
    const-class v0, Lcom/shopkick/sdk/campaign/Message$MessageBackgroundType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/shopkick/sdk/campaign/Message$MessageBackgroundType;

    return-object p0
.end method

.method public static values()[Lcom/shopkick/sdk/campaign/Message$MessageBackgroundType;
    .locals 1

    .line 19
    sget-object v0, Lcom/shopkick/sdk/campaign/Message$MessageBackgroundType;->$VALUES:[Lcom/shopkick/sdk/campaign/Message$MessageBackgroundType;

    invoke-virtual {v0}, [Lcom/shopkick/sdk/campaign/Message$MessageBackgroundType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/shopkick/sdk/campaign/Message$MessageBackgroundType;

    return-object v0
.end method
