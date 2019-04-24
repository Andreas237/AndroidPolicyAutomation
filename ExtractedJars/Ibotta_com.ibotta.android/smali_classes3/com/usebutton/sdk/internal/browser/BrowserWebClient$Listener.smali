.class public interface abstract Lcom/usebutton/sdk/internal/browser/BrowserWebClient$Listener;
.super Ljava/lang/Object;
.source "BrowserWebClient.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/usebutton/sdk/internal/browser/BrowserWebClient;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "Listener"
.end annotation


# virtual methods
.method public abstract onPageCommitVisible(Ljava/lang/String;)V
.end method

.method public abstract onPageFinished()V
.end method

.method public abstract onPageStarted(Ljava/lang/String;)V
.end method

.method public abstract onStoreUrl(Ljava/lang/String;)V
.end method
