.class final Lcom/launchdarkly/eventsource/ConnectionErrorHandler$1;
.super Ljava/lang/Object;
.source "ConnectionErrorHandler.java"

# interfaces
.implements Lcom/launchdarkly/eventsource/ConnectionErrorHandler;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/launchdarkly/eventsource/ConnectionErrorHandler;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onConnectionError(Ljava/lang/Throwable;)Lcom/launchdarkly/eventsource/ConnectionErrorHandler$Action;
    .locals 0

    .line 34
    sget-object p1, Lcom/launchdarkly/eventsource/ConnectionErrorHandler$Action;->PROCEED:Lcom/launchdarkly/eventsource/ConnectionErrorHandler$Action;

    return-object p1
.end method
