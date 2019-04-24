.class public interface abstract Lcom/usebutton/sdk/internal/core/ApplicationHooks$OnApplicationEvent;
.super Ljava/lang/Object;
.source "ApplicationHooks.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/usebutton/sdk/internal/core/ApplicationHooks;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "OnApplicationEvent"
.end annotation


# virtual methods
.method public abstract onForegrounded()V
.end method

.method public abstract onIntent(Landroid/content/Intent;)V
    .param p1    # Landroid/content/Intent;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
.end method
