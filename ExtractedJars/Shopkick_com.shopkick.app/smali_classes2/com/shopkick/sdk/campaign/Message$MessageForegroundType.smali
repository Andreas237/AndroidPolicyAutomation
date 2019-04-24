.class public final enum Lcom/shopkick/sdk/campaign/Message$MessageForegroundType;
.super Ljava/lang/Enum;
.source "Message.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/sdk/campaign/Message;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "MessageForegroundType"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/shopkick/sdk/campaign/Message$MessageForegroundType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/shopkick/sdk/campaign/Message$MessageForegroundType;

.field public static final enum COPY_BACKGROUND_DEEP_LINK:Lcom/shopkick/sdk/campaign/Message$MessageForegroundType;

.field public static final enum COPY_BACKGROUND_OVERLAY:Lcom/shopkick/sdk/campaign/Message$MessageForegroundType;

.field public static final enum LAUNCH_DEEP_LINK:Lcom/shopkick/sdk/campaign/Message$MessageForegroundType;

.field public static final enum SHOW_OVERLAY:Lcom/shopkick/sdk/campaign/Message$MessageForegroundType;

.field public static final enum SKIP_FOREGROUND:Lcom/shopkick/sdk/campaign/Message$MessageForegroundType;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 52
    new-instance v0, Lcom/shopkick/sdk/campaign/Message$MessageForegroundType;

    const-string v1, "COPY_BACKGROUND_DEEP_LINK"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/shopkick/sdk/campaign/Message$MessageForegroundType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/sdk/campaign/Message$MessageForegroundType;->COPY_BACKGROUND_DEEP_LINK:Lcom/shopkick/sdk/campaign/Message$MessageForegroundType;

    .line 56
    new-instance v0, Lcom/shopkick/sdk/campaign/Message$MessageForegroundType;

    const-string v1, "COPY_BACKGROUND_OVERLAY"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/shopkick/sdk/campaign/Message$MessageForegroundType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/sdk/campaign/Message$MessageForegroundType;->COPY_BACKGROUND_OVERLAY:Lcom/shopkick/sdk/campaign/Message$MessageForegroundType;

    .line 60
    new-instance v0, Lcom/shopkick/sdk/campaign/Message$MessageForegroundType;

    const-string v1, "LAUNCH_DEEP_LINK"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Lcom/shopkick/sdk/campaign/Message$MessageForegroundType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/sdk/campaign/Message$MessageForegroundType;->LAUNCH_DEEP_LINK:Lcom/shopkick/sdk/campaign/Message$MessageForegroundType;

    .line 64
    new-instance v0, Lcom/shopkick/sdk/campaign/Message$MessageForegroundType;

    const-string v1, "SHOW_OVERLAY"

    const/4 v5, 0x3

    invoke-direct {v0, v1, v5}, Lcom/shopkick/sdk/campaign/Message$MessageForegroundType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/sdk/campaign/Message$MessageForegroundType;->SHOW_OVERLAY:Lcom/shopkick/sdk/campaign/Message$MessageForegroundType;

    .line 68
    new-instance v0, Lcom/shopkick/sdk/campaign/Message$MessageForegroundType;

    const-string v1, "SKIP_FOREGROUND"

    const/4 v6, 0x4

    invoke-direct {v0, v1, v6}, Lcom/shopkick/sdk/campaign/Message$MessageForegroundType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/sdk/campaign/Message$MessageForegroundType;->SKIP_FOREGROUND:Lcom/shopkick/sdk/campaign/Message$MessageForegroundType;

    const/4 v0, 0x5

    .line 48
    new-array v0, v0, [Lcom/shopkick/sdk/campaign/Message$MessageForegroundType;

    sget-object v1, Lcom/shopkick/sdk/campaign/Message$MessageForegroundType;->COPY_BACKGROUND_DEEP_LINK:Lcom/shopkick/sdk/campaign/Message$MessageForegroundType;

    aput-object v1, v0, v2

    sget-object v1, Lcom/shopkick/sdk/campaign/Message$MessageForegroundType;->COPY_BACKGROUND_OVERLAY:Lcom/shopkick/sdk/campaign/Message$MessageForegroundType;

    aput-object v1, v0, v3

    sget-object v1, Lcom/shopkick/sdk/campaign/Message$MessageForegroundType;->LAUNCH_DEEP_LINK:Lcom/shopkick/sdk/campaign/Message$MessageForegroundType;

    aput-object v1, v0, v4

    sget-object v1, Lcom/shopkick/sdk/campaign/Message$MessageForegroundType;->SHOW_OVERLAY:Lcom/shopkick/sdk/campaign/Message$MessageForegroundType;

    aput-object v1, v0, v5

    sget-object v1, Lcom/shopkick/sdk/campaign/Message$MessageForegroundType;->SKIP_FOREGROUND:Lcom/shopkick/sdk/campaign/Message$MessageForegroundType;

    aput-object v1, v0, v6

    sput-object v0, Lcom/shopkick/sdk/campaign/Message$MessageForegroundType;->$VALUES:[Lcom/shopkick/sdk/campaign/Message$MessageForegroundType;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 48
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static translateForegroundType(Ljava/lang/Integer;)Lcom/shopkick/sdk/campaign/Message$MessageForegroundType;
    .locals 0

    if-nez p0, :cond_0

    .line 72
    sget-object p0, Lcom/shopkick/sdk/campaign/Message$MessageForegroundType;->SKIP_FOREGROUND:Lcom/shopkick/sdk/campaign/Message$MessageForegroundType;

    return-object p0

    .line 74
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    packed-switch p0, :pswitch_data_0

    .line 84
    sget-object p0, Lcom/shopkick/sdk/campaign/Message$MessageForegroundType;->SKIP_FOREGROUND:Lcom/shopkick/sdk/campaign/Message$MessageForegroundType;

    return-object p0

    .line 82
    :pswitch_0
    sget-object p0, Lcom/shopkick/sdk/campaign/Message$MessageForegroundType;->SHOW_OVERLAY:Lcom/shopkick/sdk/campaign/Message$MessageForegroundType;

    return-object p0

    .line 80
    :pswitch_1
    sget-object p0, Lcom/shopkick/sdk/campaign/Message$MessageForegroundType;->LAUNCH_DEEP_LINK:Lcom/shopkick/sdk/campaign/Message$MessageForegroundType;

    return-object p0

    .line 78
    :pswitch_2
    sget-object p0, Lcom/shopkick/sdk/campaign/Message$MessageForegroundType;->COPY_BACKGROUND_OVERLAY:Lcom/shopkick/sdk/campaign/Message$MessageForegroundType;

    return-object p0

    .line 76
    :pswitch_3
    sget-object p0, Lcom/shopkick/sdk/campaign/Message$MessageForegroundType;->COPY_BACKGROUND_DEEP_LINK:Lcom/shopkick/sdk/campaign/Message$MessageForegroundType;

    return-object p0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/shopkick/sdk/campaign/Message$MessageForegroundType;
    .locals 1

    .line 48
    const-class v0, Lcom/shopkick/sdk/campaign/Message$MessageForegroundType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/shopkick/sdk/campaign/Message$MessageForegroundType;

    return-object p0
.end method

.method public static values()[Lcom/shopkick/sdk/campaign/Message$MessageForegroundType;
    .locals 1

    .line 48
    sget-object v0, Lcom/shopkick/sdk/campaign/Message$MessageForegroundType;->$VALUES:[Lcom/shopkick/sdk/campaign/Message$MessageForegroundType;

    invoke-virtual {v0}, [Lcom/shopkick/sdk/campaign/Message$MessageForegroundType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/shopkick/sdk/campaign/Message$MessageForegroundType;

    return-object v0
.end method
