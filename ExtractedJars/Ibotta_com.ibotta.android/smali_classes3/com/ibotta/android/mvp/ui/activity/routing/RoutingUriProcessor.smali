.class public interface abstract Lcom/ibotta/android/mvp/ui/activity/routing/RoutingUriProcessor;
.super Ljava/lang/Object;
.source "RoutingUriProcessor.java"


# virtual methods
.method public abstract getPath(Landroid/net/Uri;)Ljava/lang/String;
    .param p1    # Landroid/net/Uri;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract getRouteIntent(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;
    .param p2    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method
