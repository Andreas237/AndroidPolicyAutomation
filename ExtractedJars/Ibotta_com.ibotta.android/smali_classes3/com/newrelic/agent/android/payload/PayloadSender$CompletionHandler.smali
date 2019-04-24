.class public interface abstract Lcom/newrelic/agent/android/payload/PayloadSender$CompletionHandler;
.super Ljava/lang/Object;
.source "PayloadSender.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/newrelic/agent/android/payload/PayloadSender;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "CompletionHandler"
.end annotation


# virtual methods
.method public abstract onException(Lcom/newrelic/agent/android/payload/PayloadSender;Ljava/lang/Exception;)V
.end method

.method public abstract onResponse(Lcom/newrelic/agent/android/payload/PayloadSender;)V
.end method
