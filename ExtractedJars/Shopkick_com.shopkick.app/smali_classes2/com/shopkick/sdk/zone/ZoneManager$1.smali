.class Lcom/shopkick/sdk/zone/ZoneManager$1;
.super Ljava/lang/Object;
.source "ZoneManager.java"

# interfaces
.implements Lcom/shopkick/logging/ConfigurationProvider;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/sdk/zone/ZoneManager;-><init>(Landroid/content/Context;Lcom/shopkick/sdk/presence/AppStateProvider;Lcom/shopkick/sdk/core/ConfigurationProvider;Lcom/shopkick/fetchers/api/APIManager;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/sdk/zone/ZoneManager;


# direct methods
.method constructor <init>(Lcom/shopkick/sdk/zone/ZoneManager;)V
    .locals 0

    .line 154
    iput-object p1, p0, Lcom/shopkick/sdk/zone/ZoneManager$1;->this$0:Lcom/shopkick/sdk/zone/ZoneManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getAppenderConfig(Ljava/lang/String;)Lcom/shopkick/logging/AppenderConfig;
    .locals 0

    .line 167
    new-instance p1, Lcom/shopkick/sdk/zone/ZoneManager$1$1;

    invoke-direct {p1, p0}, Lcom/shopkick/sdk/zone/ZoneManager$1$1;-><init>(Lcom/shopkick/sdk/zone/ZoneManager$1;)V

    return-object p1
.end method

.method public getLoggerConfig(Ljava/lang/String;)Lcom/shopkick/logging/LoggerConfig;
    .locals 0

    .line 192
    new-instance p1, Lcom/shopkick/sdk/zone/ZoneManager$1$2;

    invoke-direct {p1, p0}, Lcom/shopkick/sdk/zone/ZoneManager$1$2;-><init>(Lcom/shopkick/sdk/zone/ZoneManager$1;)V

    return-object p1
.end method

.method public isSKLoggerDevloggingDisabled()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public isSKLoggerOnlyDevloggingDisabled()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
