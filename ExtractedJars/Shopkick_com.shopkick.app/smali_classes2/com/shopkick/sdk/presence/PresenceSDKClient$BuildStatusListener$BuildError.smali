.class public final enum Lcom/shopkick/sdk/presence/PresenceSDKClient$BuildStatusListener$BuildError;
.super Ljava/lang/Enum;
.source "PresenceSDKClient.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/sdk/presence/PresenceSDKClient$BuildStatusListener;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "BuildError"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/shopkick/sdk/presence/PresenceSDKClient$BuildStatusListener$BuildError;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/shopkick/sdk/presence/PresenceSDKClient$BuildStatusListener$BuildError;

.field public static final enum LOCATION_PERMISSION_DENIED:Lcom/shopkick/sdk/presence/PresenceSDKClient$BuildStatusListener$BuildError;

.field public static final enum PHONE_STATE_PERMISSION_DENIED:Lcom/shopkick/sdk/presence/PresenceSDKClient$BuildStatusListener$BuildError;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 154
    new-instance v0, Lcom/shopkick/sdk/presence/PresenceSDKClient$BuildStatusListener$BuildError;

    const-string v1, "PHONE_STATE_PERMISSION_DENIED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/shopkick/sdk/presence/PresenceSDKClient$BuildStatusListener$BuildError;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/sdk/presence/PresenceSDKClient$BuildStatusListener$BuildError;->PHONE_STATE_PERMISSION_DENIED:Lcom/shopkick/sdk/presence/PresenceSDKClient$BuildStatusListener$BuildError;

    .line 163
    new-instance v0, Lcom/shopkick/sdk/presence/PresenceSDKClient$BuildStatusListener$BuildError;

    const-string v1, "LOCATION_PERMISSION_DENIED"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/shopkick/sdk/presence/PresenceSDKClient$BuildStatusListener$BuildError;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/sdk/presence/PresenceSDKClient$BuildStatusListener$BuildError;->LOCATION_PERMISSION_DENIED:Lcom/shopkick/sdk/presence/PresenceSDKClient$BuildStatusListener$BuildError;

    const/4 v0, 0x2

    .line 147
    new-array v0, v0, [Lcom/shopkick/sdk/presence/PresenceSDKClient$BuildStatusListener$BuildError;

    sget-object v1, Lcom/shopkick/sdk/presence/PresenceSDKClient$BuildStatusListener$BuildError;->PHONE_STATE_PERMISSION_DENIED:Lcom/shopkick/sdk/presence/PresenceSDKClient$BuildStatusListener$BuildError;

    aput-object v1, v0, v2

    sget-object v1, Lcom/shopkick/sdk/presence/PresenceSDKClient$BuildStatusListener$BuildError;->LOCATION_PERMISSION_DENIED:Lcom/shopkick/sdk/presence/PresenceSDKClient$BuildStatusListener$BuildError;

    aput-object v1, v0, v3

    sput-object v0, Lcom/shopkick/sdk/presence/PresenceSDKClient$BuildStatusListener$BuildError;->$VALUES:[Lcom/shopkick/sdk/presence/PresenceSDKClient$BuildStatusListener$BuildError;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 147
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/shopkick/sdk/presence/PresenceSDKClient$BuildStatusListener$BuildError;
    .locals 1

    .line 147
    const-class v0, Lcom/shopkick/sdk/presence/PresenceSDKClient$BuildStatusListener$BuildError;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/shopkick/sdk/presence/PresenceSDKClient$BuildStatusListener$BuildError;

    return-object p0
.end method

.method public static values()[Lcom/shopkick/sdk/presence/PresenceSDKClient$BuildStatusListener$BuildError;
    .locals 1

    .line 147
    sget-object v0, Lcom/shopkick/sdk/presence/PresenceSDKClient$BuildStatusListener$BuildError;->$VALUES:[Lcom/shopkick/sdk/presence/PresenceSDKClient$BuildStatusListener$BuildError;

    invoke-virtual {v0}, [Lcom/shopkick/sdk/presence/PresenceSDKClient$BuildStatusListener$BuildError;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/shopkick/sdk/presence/PresenceSDKClient$BuildStatusListener$BuildError;

    return-object v0
.end method
