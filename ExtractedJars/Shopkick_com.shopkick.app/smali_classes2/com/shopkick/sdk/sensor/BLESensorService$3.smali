.class final Lcom/shopkick/sdk/sensor/BLESensorService$3;
.super Ljava/lang/Object;
.source "BLESensorService.java"

# interfaces
.implements Lcom/shopkick/logging/ConfigurationProvider;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/sdk/sensor/BLESensorService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 131
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getAppenderConfig(Ljava/lang/String;)Lcom/shopkick/logging/AppenderConfig;
    .locals 0

    .line 144
    new-instance p1, Lcom/shopkick/sdk/sensor/BLESensorService$3$1;

    invoke-direct {p1, p0}, Lcom/shopkick/sdk/sensor/BLESensorService$3$1;-><init>(Lcom/shopkick/sdk/sensor/BLESensorService$3;)V

    return-object p1
.end method

.method public getLoggerConfig(Ljava/lang/String;)Lcom/shopkick/logging/LoggerConfig;
    .locals 0

    .line 169
    new-instance p1, Lcom/shopkick/sdk/sensor/BLESensorService$3$2;

    invoke-direct {p1, p0}, Lcom/shopkick/sdk/sensor/BLESensorService$3$2;-><init>(Lcom/shopkick/sdk/sensor/BLESensorService$3;)V

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
