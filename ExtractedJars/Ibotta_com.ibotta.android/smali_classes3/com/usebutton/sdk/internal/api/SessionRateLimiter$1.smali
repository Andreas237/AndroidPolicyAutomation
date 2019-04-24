.class Lcom/usebutton/sdk/internal/api/SessionRateLimiter$1;
.super Ljava/lang/Object;
.source "SessionRateLimiter.java"

# interfaces
.implements Lcom/usebutton/sdk/internal/functional/Getter;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/usebutton/sdk/internal/api/SessionRateLimiter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/usebutton/sdk/internal/functional/Getter<",
        "Ljava/lang/Long;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/usebutton/sdk/internal/api/SessionRateLimiter;


# direct methods
.method constructor <init>(Lcom/usebutton/sdk/internal/api/SessionRateLimiter;)V
    .locals 0

    .line 26
    iput-object p1, p0, Lcom/usebutton/sdk/internal/api/SessionRateLimiter$1;->this$0:Lcom/usebutton/sdk/internal/api/SessionRateLimiter;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public get()Ljava/lang/Long;
    .locals 2

    .line 29
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 26
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/api/SessionRateLimiter$1;->get()Ljava/lang/Long;

    move-result-object v0

    return-object v0
.end method
