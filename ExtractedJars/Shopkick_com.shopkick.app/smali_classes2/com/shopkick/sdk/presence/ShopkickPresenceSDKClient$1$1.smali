.class Lcom/shopkick/sdk/presence/ShopkickPresenceSDKClient$1$1;
.super Ljava/lang/Object;
.source "ShopkickPresenceSDKClient.java"

# interfaces
.implements Lcom/shopkick/logging/AppenderConfig;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/sdk/presence/ShopkickPresenceSDKClient$1;->getAppenderConfig(Ljava/lang/String;)Lcom/shopkick/logging/AppenderConfig;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/sdk/presence/ShopkickPresenceSDKClient$1;


# direct methods
.method constructor <init>(Lcom/shopkick/sdk/presence/ShopkickPresenceSDKClient$1;)V
    .locals 0

    .line 96
    iput-object p1, p0, Lcom/shopkick/sdk/presence/ShopkickPresenceSDKClient$1$1;->this$0:Lcom/shopkick/sdk/presence/ShopkickPresenceSDKClient$1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public isAreaActive(J)Z
    .locals 2

    .line 106
    sget-object v0, Lcom/shopkick/logging/Area;->ALL:Lcom/shopkick/logging/Area;

    invoke-virtual {v0}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v0

    invoke-static {p1, p2, v0, v1}, Lcom/shopkick/logging/Area;->areasOverlap(JJ)Z

    move-result p1

    return p1
.end method

.method public isEnabled()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public isLevelActive(Lcom/shopkick/logging/Level;)Z
    .locals 1

    .line 111
    invoke-virtual {p1}, Lcom/shopkick/logging/Level;->getValue()I

    move-result p1

    sget-object v0, Lcom/shopkick/logging/Level;->VERBOSE:Lcom/shopkick/logging/Level;

    invoke-virtual {v0}, Lcom/shopkick/logging/Level;->getValue()I

    move-result v0

    if-ge p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public shouldLog(Lcom/shopkick/logging/Message;)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method
