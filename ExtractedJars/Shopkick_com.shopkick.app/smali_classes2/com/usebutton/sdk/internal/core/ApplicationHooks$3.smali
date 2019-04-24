.class Lcom/usebutton/sdk/internal/core/ApplicationHooks$3;
.super Ljava/lang/Object;
.source "ApplicationHooks.java"

# interfaces
.implements Lcom/usebutton/sdk/internal/util/Publisher$Action;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/usebutton/sdk/internal/core/ApplicationHooks;->handleIntent(Landroid/content/Intent;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/usebutton/sdk/internal/util/Publisher$Action<",
        "Lcom/usebutton/sdk/internal/core/ApplicationHooks$OnApplicationEvent;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/usebutton/sdk/internal/core/ApplicationHooks;

.field final synthetic val$intent:Landroid/content/Intent;


# direct methods
.method constructor <init>(Lcom/usebutton/sdk/internal/core/ApplicationHooks;Landroid/content/Intent;)V
    .locals 0

    .line 156
    iput-object p1, p0, Lcom/usebutton/sdk/internal/core/ApplicationHooks$3;->this$0:Lcom/usebutton/sdk/internal/core/ApplicationHooks;

    iput-object p2, p0, Lcom/usebutton/sdk/internal/core/ApplicationHooks$3;->val$intent:Landroid/content/Intent;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public perform(Lcom/usebutton/sdk/internal/core/ApplicationHooks$OnApplicationEvent;)V
    .locals 1

    .line 159
    iget-object v0, p0, Lcom/usebutton/sdk/internal/core/ApplicationHooks$3;->val$intent:Landroid/content/Intent;

    invoke-interface {p1, v0}, Lcom/usebutton/sdk/internal/core/ApplicationHooks$OnApplicationEvent;->onIntent(Landroid/content/Intent;)V

    return-void
.end method

.method public bridge synthetic perform(Ljava/lang/Object;)V
    .locals 0

    .line 156
    check-cast p1, Lcom/usebutton/sdk/internal/core/ApplicationHooks$OnApplicationEvent;

    invoke-virtual {p0, p1}, Lcom/usebutton/sdk/internal/core/ApplicationHooks$3;->perform(Lcom/usebutton/sdk/internal/core/ApplicationHooks$OnApplicationEvent;)V

    return-void
.end method
