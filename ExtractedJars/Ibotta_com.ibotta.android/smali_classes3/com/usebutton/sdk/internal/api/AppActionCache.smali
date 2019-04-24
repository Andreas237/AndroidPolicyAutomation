.class public interface abstract Lcom/usebutton/sdk/internal/api/AppActionCache;
.super Ljava/lang/Object;
.source "AppActionCache.java"


# virtual methods
.method public abstract contains(Ljava/lang/String;Ljava/lang/String;Lcom/usebutton/sdk/action/ActionQuery;)Z
    .param p2    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
.end method

.method public abstract get(Ljava/lang/String;Ljava/lang/String;Lcom/usebutton/sdk/action/ActionQuery;)Lcom/usebutton/sdk/internal/models/AppAction;
    .param p2    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p3    # Lcom/usebutton/sdk/action/ActionQuery;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
.end method

.method public abstract put(Ljava/lang/String;Ljava/lang/String;Lcom/usebutton/sdk/action/ActionQuery;Lcom/usebutton/sdk/internal/models/AppAction;)V
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p3    # Lcom/usebutton/sdk/action/ActionQuery;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p4    # Lcom/usebutton/sdk/internal/models/AppAction;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
.end method
