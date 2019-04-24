.class Lcom/shopkick/sdk/sensor/SensorManager$1$1;
.super Ljava/lang/Object;
.source "SensorManager.java"

# interfaces
.implements Lcom/shopkick/logging/AppenderConfig;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/sdk/sensor/SensorManager$1;->getAppenderConfig(Ljava/lang/String;)Lcom/shopkick/logging/AppenderConfig;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/shopkick/sdk/sensor/SensorManager$1;


# direct methods
.method constructor <init>(Lcom/shopkick/sdk/sensor/SensorManager$1;)V
    .locals 0

    .line 155
    iput-object p1, p0, Lcom/shopkick/sdk/sensor/SensorManager$1$1;->this$1:Lcom/shopkick/sdk/sensor/SensorManager$1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public isAreaActive(J)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public isEnabled()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public isLevelActive(Lcom/shopkick/logging/Level;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public shouldLog(Lcom/shopkick/logging/Message;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method
