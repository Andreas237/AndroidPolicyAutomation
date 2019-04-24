.class Lcom/shopkick/app/controllers/PasswordPanelController$1;
.super Ljava/lang/Object;
.source "PasswordPanelController.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/controllers/PasswordPanelController;->handleAuthenticatorSuccess(Ljava/util/HashMap;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/controllers/PasswordPanelController;


# direct methods
.method constructor <init>(Lcom/shopkick/app/controllers/PasswordPanelController;)V
    .locals 0

    .line 216
    iput-object p1, p0, Lcom/shopkick/app/controllers/PasswordPanelController$1;->this$0:Lcom/shopkick/app/controllers/PasswordPanelController;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 219
    iget-object v0, p0, Lcom/shopkick/app/controllers/PasswordPanelController$1;->this$0:Lcom/shopkick/app/controllers/PasswordPanelController;

    iget-object v0, v0, Lcom/shopkick/app/controllers/PasswordPanelController;->panelControllerCallback:Lcom/shopkick/app/controllers/IPanelControllerCallback;

    invoke-interface {v0}, Lcom/shopkick/app/controllers/IPanelControllerCallback;->triggerFlowFinished()V

    return-void
.end method
