.class Lcom/usebutton/sdk/internal/core/CommandExecutor$HandlerMessenger;
.super Ljava/lang/Object;
.source "CommandExecutor.java"

# interfaces
.implements Lcom/usebutton/sdk/internal/core/CommandExecutor$Messenger;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/usebutton/sdk/internal/core/CommandExecutor;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "HandlerMessenger"
.end annotation


# instance fields
.field private final mHandler:Landroid/os/Handler;


# direct methods
.method public constructor <init>(Landroid/os/Handler;)V
    .locals 0

    .line 165
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 166
    iput-object p1, p0, Lcom/usebutton/sdk/internal/core/CommandExecutor$HandlerMessenger;->mHandler:Landroid/os/Handler;

    return-void
.end method


# virtual methods
.method public post(Ljava/lang/Runnable;)V
    .locals 1

    .line 171
    iget-object v0, p0, Lcom/usebutton/sdk/internal/core/CommandExecutor$HandlerMessenger;->mHandler:Landroid/os/Handler;

    invoke-virtual {v0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
