.class public Lcom/usebutton/sdk/internal/core/LoggingHandler;
.super Ljava/lang/Object;
.source "LoggingHandler.java"

# interfaces
.implements Lcom/usebutton/sdk/internal/core/ExceptionHandler;


# static fields
.field private static final TAG:Ljava/lang/String; = "LoggingHandler"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public handle(Ljava/lang/Throwable;)Z
    .locals 2

    const-string v0, "LoggingHandler"

    const-string v1, "Exception reached LoggingHandler"

    .line 10
    invoke-static {v0, v1, p1}, Lcom/usebutton/sdk/internal/util/ButtonLog;->warn(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 p1, 0x1

    return p1
.end method
