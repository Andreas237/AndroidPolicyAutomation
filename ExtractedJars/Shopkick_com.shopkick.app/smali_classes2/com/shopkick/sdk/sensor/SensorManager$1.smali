.class Lcom/shopkick/sdk/sensor/SensorManager$1;
.super Ljava/lang/Object;
.source "SensorManager.java"

# interfaces
.implements Lcom/shopkick/logging/ConfigurationProvider;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/sdk/sensor/SensorManager;-><init>(Landroid/content/Context;Lcom/shopkick/sdk/presence/AppStateProvider;Lcom/shopkick/sdk/core/ConfigurationProvider;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/sdk/sensor/SensorManager;


# direct methods
.method constructor <init>(Lcom/shopkick/sdk/sensor/SensorManager;)V
    .locals 0

    .line 142
    iput-object p1, p0, Lcom/shopkick/sdk/sensor/SensorManager$1;->this$0:Lcom/shopkick/sdk/sensor/SensorManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getAppenderConfig(Ljava/lang/String;)Lcom/shopkick/logging/AppenderConfig;
    .locals 0

    .line 155
    new-instance p1, Lcom/shopkick/sdk/sensor/SensorManager$1$1;

    invoke-direct {p1, p0}, Lcom/shopkick/sdk/sensor/SensorManager$1$1;-><init>(Lcom/shopkick/sdk/sensor/SensorManager$1;)V

    return-object p1
.end method

.method public getLoggerConfig(Ljava/lang/String;)Lcom/shopkick/logging/LoggerConfig;
    .locals 0

    .line 180
    new-instance p1, Lcom/shopkick/sdk/sensor/SensorManager$1$2;

    invoke-direct {p1, p0}, Lcom/shopkick/sdk/sensor/SensorManager$1$2;-><init>(Lcom/shopkick/sdk/sensor/SensorManager$1;)V

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
