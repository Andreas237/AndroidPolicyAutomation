.class Lcom/shopkick/app/controllers/RegistrationPickerPanelController$1;
.super Ljava/lang/Object;
.source "RegistrationPickerPanelController.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/controllers/RegistrationPickerPanelController;->handleAuthenticatorSuccess(Ljava/util/HashMap;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/controllers/RegistrationPickerPanelController;


# direct methods
.method constructor <init>(Lcom/shopkick/app/controllers/RegistrationPickerPanelController;)V
    .locals 0

    .line 213
    iput-object p1, p0, Lcom/shopkick/app/controllers/RegistrationPickerPanelController$1;->this$0:Lcom/shopkick/app/controllers/RegistrationPickerPanelController;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 216
    iget-object v0, p0, Lcom/shopkick/app/controllers/RegistrationPickerPanelController$1;->this$0:Lcom/shopkick/app/controllers/RegistrationPickerPanelController;

    iget-object v0, v0, Lcom/shopkick/app/controllers/RegistrationPickerPanelController;->panelControllerCallback:Lcom/shopkick/app/controllers/IPanelControllerCallback;

    invoke-interface {v0}, Lcom/shopkick/app/controllers/IPanelControllerCallback;->triggerFlowFinished()V

    return-void
.end method
