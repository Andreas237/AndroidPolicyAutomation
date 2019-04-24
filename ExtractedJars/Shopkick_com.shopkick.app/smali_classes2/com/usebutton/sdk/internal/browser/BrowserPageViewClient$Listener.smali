.class interface abstract Lcom/usebutton/sdk/internal/browser/BrowserPageViewClient$Listener;
.super Ljava/lang/Object;
.source "BrowserPageViewClient.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/usebutton/sdk/internal/browser/BrowserPageViewClient;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x608
    name = "Listener"
.end annotation


# virtual methods
.method public abstract onReceiveResult(Ljava/lang/String;Lcom/usebutton/sdk/internal/purchasepath/PageView;)V
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/usebutton/sdk/internal/purchasepath/PageView;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
.end method
