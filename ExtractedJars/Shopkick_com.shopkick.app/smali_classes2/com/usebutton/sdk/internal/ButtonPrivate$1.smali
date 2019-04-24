.class Lcom/usebutton/sdk/internal/ButtonPrivate$1;
.super Ljava/lang/Object;
.source "ButtonPrivate.java"

# interfaces
.implements Lcom/usebutton/sdk/internal/events/ReportPolicy$Listener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/usebutton/sdk/internal/ButtonPrivate;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/usebutton/sdk/internal/ButtonPrivate;


# direct methods
.method constructor <init>(Lcom/usebutton/sdk/internal/ButtonPrivate;)V
    .locals 0

    .line 115
    iput-object p1, p0, Lcom/usebutton/sdk/internal/ButtonPrivate$1;->this$0:Lcom/usebutton/sdk/internal/ButtonPrivate;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onShouldReport()V
    .locals 1

    .line 118
    iget-object v0, p0, Lcom/usebutton/sdk/internal/ButtonPrivate$1;->this$0:Lcom/usebutton/sdk/internal/ButtonPrivate;

    invoke-static {v0}, Lcom/usebutton/sdk/internal/ButtonPrivate;->access$000(Lcom/usebutton/sdk/internal/ButtonPrivate;)Lcom/usebutton/sdk/internal/events/SyncManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/events/SyncManager;->syncEventsSoon()V

    return-void
.end method
