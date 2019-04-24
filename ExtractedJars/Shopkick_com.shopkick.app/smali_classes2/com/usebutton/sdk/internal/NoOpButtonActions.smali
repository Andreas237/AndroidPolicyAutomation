.class public Lcom/usebutton/sdk/internal/NoOpButtonActions;
.super Ljava/lang/Object;
.source "NoOpButtonActions.java"

# interfaces
.implements Lcom/usebutton/sdk/action/ButtonActionsInterface;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public fetch(Lcom/usebutton/sdk/action/ActionRequest;Lcom/usebutton/sdk/action/ActionListener;)V
    .locals 1
    .param p1    # Lcom/usebutton/sdk/action/ActionRequest;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/usebutton/sdk/action/ActionListener;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 16
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Button.configure() must be called before using Button Actions API"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-interface {p2, v0, p1}, Lcom/usebutton/sdk/action/ActionListener;->onComplete(Lcom/usebutton/sdk/action/ButtonAction;Ljava/lang/Throwable;)V

    return-void
.end method
