.class Lcom/shopkick/logging/EventLogger$2;
.super Ljava/lang/Object;
.source "EventLogger.java"

# interfaces
.implements Lcom/shopkick/logging/LoggerConfig;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/logging/EventLogger;->getLoggerConfig()Lcom/shopkick/logging/LoggerConfig;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/logging/EventLogger;


# direct methods
.method constructor <init>(Lcom/shopkick/logging/EventLogger;)V
    .locals 0

    .line 120
    iput-object p1, p0, Lcom/shopkick/logging/EventLogger$2;->this$0:Lcom/shopkick/logging/EventLogger;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public isAreaActive(J)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public isLevelActive(Lcom/shopkick/logging/Level;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public isLoggingEnabled()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
