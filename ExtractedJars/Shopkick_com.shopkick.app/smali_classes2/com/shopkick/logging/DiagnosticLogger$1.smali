.class Lcom/shopkick/logging/DiagnosticLogger$1;
.super Ljava/lang/Object;
.source "DiagnosticLogger.java"

# interfaces
.implements Lcom/shopkick/logging/LoggerConfig;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/logging/DiagnosticLogger;->getLoggerConfig()Lcom/shopkick/logging/LoggerConfig;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/logging/DiagnosticLogger;


# direct methods
.method constructor <init>(Lcom/shopkick/logging/DiagnosticLogger;)V
    .locals 0

    .line 280
    iput-object p1, p0, Lcom/shopkick/logging/DiagnosticLogger$1;->this$0:Lcom/shopkick/logging/DiagnosticLogger;

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
