.class Lcom/usebutton/sdk/internal/views/DropinPresenter$1;
.super Ljava/lang/Object;
.source "DropinPresenter.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/usebutton/sdk/internal/views/DropinPresenter;->updateWithPromotion(Lcom/usebutton/sdk/internal/models/AppAction;Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/usebutton/sdk/internal/views/DropinPresenter;

.field final synthetic val$appAction:Lcom/usebutton/sdk/internal/models/AppAction;


# direct methods
.method constructor <init>(Lcom/usebutton/sdk/internal/views/DropinPresenter;Lcom/usebutton/sdk/internal/models/AppAction;)V
    .locals 0

    .line 104
    iput-object p1, p0, Lcom/usebutton/sdk/internal/views/DropinPresenter$1;->this$0:Lcom/usebutton/sdk/internal/views/DropinPresenter;

    iput-object p2, p0, Lcom/usebutton/sdk/internal/views/DropinPresenter$1;->val$appAction:Lcom/usebutton/sdk/internal/models/AppAction;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 107
    iget-object p1, p0, Lcom/usebutton/sdk/internal/views/DropinPresenter$1;->this$0:Lcom/usebutton/sdk/internal/views/DropinPresenter;

    iget-object v0, p0, Lcom/usebutton/sdk/internal/views/DropinPresenter$1;->val$appAction:Lcom/usebutton/sdk/internal/models/AppAction;

    invoke-virtual {p1, v0}, Lcom/usebutton/sdk/internal/views/DropinPresenter;->onClicked(Lcom/usebutton/sdk/internal/models/AppAction;)V

    return-void
.end method
