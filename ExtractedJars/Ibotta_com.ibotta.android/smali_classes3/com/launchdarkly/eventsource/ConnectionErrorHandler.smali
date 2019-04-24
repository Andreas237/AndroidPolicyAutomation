.class public interface abstract Lcom/launchdarkly/eventsource/ConnectionErrorHandler;
.super Ljava/lang/Object;
.source "ConnectionErrorHandler.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/launchdarkly/eventsource/ConnectionErrorHandler$Action;
    }
.end annotation


# static fields
.field public static final DEFAULT:Lcom/launchdarkly/eventsource/ConnectionErrorHandler;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 31
    new-instance v0, Lcom/launchdarkly/eventsource/ConnectionErrorHandler$1;

    invoke-direct {v0}, Lcom/launchdarkly/eventsource/ConnectionErrorHandler$1;-><init>()V

    sput-object v0, Lcom/launchdarkly/eventsource/ConnectionErrorHandler;->DEFAULT:Lcom/launchdarkly/eventsource/ConnectionErrorHandler;

    return-void
.end method


# virtual methods
.method public abstract onConnectionError(Ljava/lang/Throwable;)Lcom/launchdarkly/eventsource/ConnectionErrorHandler$Action;
.end method
