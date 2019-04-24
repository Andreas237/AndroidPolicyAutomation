.class Lcom/usebutton/sdk/internal/web/Navigator$1;
.super Ljava/lang/Object;
.source "Navigator.java"

# interfaces
.implements Lcom/usebutton/sdk/internal/util/Publisher$Action;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/usebutton/sdk/internal/web/Navigator;->onNavigation()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/usebutton/sdk/internal/util/Publisher$Action<",
        "Lcom/usebutton/sdk/internal/Navigable$NavigationListener;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/usebutton/sdk/internal/web/Navigator;


# direct methods
.method constructor <init>(Lcom/usebutton/sdk/internal/web/Navigator;)V
    .locals 0

    .line 51
    iput-object p1, p0, Lcom/usebutton/sdk/internal/web/Navigator$1;->this$0:Lcom/usebutton/sdk/internal/web/Navigator;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public perform(Lcom/usebutton/sdk/internal/Navigable$NavigationListener;)V
    .locals 1

    .line 54
    iget-object v0, p0, Lcom/usebutton/sdk/internal/web/Navigator$1;->this$0:Lcom/usebutton/sdk/internal/web/Navigator;

    invoke-interface {p1, v0}, Lcom/usebutton/sdk/internal/Navigable$NavigationListener;->onNavigation(Lcom/usebutton/sdk/internal/Navigable;)V

    return-void
.end method

.method public bridge synthetic perform(Ljava/lang/Object;)V
    .locals 0

    .line 51
    check-cast p1, Lcom/usebutton/sdk/internal/Navigable$NavigationListener;

    invoke-virtual {p0, p1}, Lcom/usebutton/sdk/internal/web/Navigator$1;->perform(Lcom/usebutton/sdk/internal/Navigable$NavigationListener;)V

    return-void
.end method
