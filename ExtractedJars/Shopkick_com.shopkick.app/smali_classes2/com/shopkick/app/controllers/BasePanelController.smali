.class public abstract Lcom/shopkick/app/controllers/BasePanelController;
.super Ljava/lang/Object;
.source "BasePanelController.java"


# static fields
.field public static final PANEL_CONTROLLER_FLOW_ID:Ljava/lang/String; = "flow_id"

.field public static final PANEL_CONTROLLER_PANEL_TYPE:Ljava/lang/String; = "panel_type"


# instance fields
.field protected activity:Lcom/shopkick/app/activities/BaseActivity;

.field protected context:Landroid/content/Context;

.field protected eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

.field protected flowId:Ljava/lang/String;

.field protected panelControllerCallback:Lcom/shopkick/app/controllers/IPanelControllerCallback;

.field protected panelStorageProviderCallback:Lcom/shopkick/app/controllers/IPanelStorageProviderCallback;

.field protected panelType:I

.field protected panelView:Landroid/view/View;

.field protected params:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field protected screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/logging/UserEventLogger;Ljava/util/Map;Lcom/shopkick/app/activities/BaseActivity;Landroid/content/Context;Lcom/shopkick/app/controllers/IPanelControllerCallback;Lcom/shopkick/app/controllers/IPanelStorageProviderCallback;)V
    .locals 0
    .param p1    # Lcom/shopkick/app/application/ScreenGlobals;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/shopkick/app/logging/UserEventLogger;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Ljava/util/Map;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # Lcom/shopkick/app/activities/BaseActivity;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p5    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p6    # Lcom/shopkick/app/controllers/IPanelControllerCallback;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p7    # Lcom/shopkick/app/controllers/IPanelStorageProviderCallback;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/shopkick/app/application/ScreenGlobals;",
            "Lcom/shopkick/app/logging/UserEventLogger;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Lcom/shopkick/app/activities/BaseActivity;",
            "Landroid/content/Context;",
            "Lcom/shopkick/app/controllers/IPanelControllerCallback;",
            "Lcom/shopkick/app/controllers/IPanelStorageProviderCallback;",
            ")V"
        }
    .end annotation

    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    iput-object p1, p0, Lcom/shopkick/app/controllers/BasePanelController;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    .line 40
    iput-object p2, p0, Lcom/shopkick/app/controllers/BasePanelController;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    .line 41
    iput-object p3, p0, Lcom/shopkick/app/controllers/BasePanelController;->params:Ljava/util/Map;

    .line 42
    iput-object p4, p0, Lcom/shopkick/app/controllers/BasePanelController;->activity:Lcom/shopkick/app/activities/BaseActivity;

    .line 43
    iput-object p5, p0, Lcom/shopkick/app/controllers/BasePanelController;->context:Landroid/content/Context;

    .line 44
    iput-object p6, p0, Lcom/shopkick/app/controllers/BasePanelController;->panelControllerCallback:Lcom/shopkick/app/controllers/IPanelControllerCallback;

    .line 45
    iput-object p7, p0, Lcom/shopkick/app/controllers/BasePanelController;->panelStorageProviderCallback:Lcom/shopkick/app/controllers/IPanelStorageProviderCallback;

    const-string p1, "flow_id"

    .line 47
    invoke-interface {p3, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    const-string p1, "flow_id"

    .line 48
    invoke-interface {p3, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, Lcom/shopkick/app/controllers/BasePanelController;->flowId:Ljava/lang/String;

    :cond_0
    const-string p1, "panel_type"

    .line 53
    invoke-interface {p3, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_1

    const-string p1, "panel_type"

    .line 54
    invoke-interface {p3, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iput p1, p0, Lcom/shopkick/app/controllers/BasePanelController;->panelType:I

    :cond_1
    return-void
.end method


# virtual methods
.method public destroy()V
    .locals 1

    const/4 v0, 0x0

    .line 128
    iput-object v0, p0, Lcom/shopkick/app/controllers/BasePanelController;->context:Landroid/content/Context;

    .line 129
    iput-object v0, p0, Lcom/shopkick/app/controllers/BasePanelController;->activity:Lcom/shopkick/app/activities/BaseActivity;

    return-void
.end method

.method public getView()Landroid/view/View;
    .locals 1

    .line 100
    iget-object v0, p0, Lcom/shopkick/app/controllers/BasePanelController;->panelView:Landroid/view/View;

    return-object v0
.end method

.method public handleOnResume()V
    .locals 0

    return-void
.end method

.method protected hideKeyboard()V
    .locals 3

    .line 114
    iget-object v0, p0, Lcom/shopkick/app/controllers/BasePanelController;->context:Landroid/content/Context;

    const-string v1, "input_method"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    .line 116
    iget-object v1, p0, Lcom/shopkick/app/controllers/BasePanelController;->activity:Lcom/shopkick/app/activities/BaseActivity;

    invoke-virtual {v1}, Lcom/shopkick/app/activities/BaseActivity;->getCurrentFocus()Landroid/view/View;

    move-result-object v1

    if-nez v1, :cond_0

    .line 119
    new-instance v1, Landroid/view/View;

    iget-object v2, p0, Lcom/shopkick/app/controllers/BasePanelController;->activity:Lcom/shopkick/app/activities/BaseActivity;

    invoke-direct {v1, v2}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 121
    :cond_0
    invoke-virtual {v1}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    return-void
.end method

.method protected logEventRecordWithScreenParams(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V
    .locals 1
    .param p1    # Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 87
    iget v0, p0, Lcom/shopkick/app/controllers/BasePanelController;->panelType:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setPanel(Ljava/lang/Integer;)V

    .line 88
    iget-object v0, p0, Lcom/shopkick/app/controllers/BasePanelController;->flowId:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setFlowId(Ljava/lang/String;)V

    .line 89
    iget-object v0, p0, Lcom/shopkick/app/controllers/BasePanelController;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/logging/UserEventLogger;->logEventRecord(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    return-void
.end method

.method public onPanelDidShow()V
    .locals 2
    .annotation build Landroid/support/annotation/CallSuper;
    .end annotation

    .line 81
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>()V

    const/16 v1, 0x56

    .line 82
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setAction(Ljava/lang/Integer;)V

    .line 83
    invoke-virtual {p0, v0}, Lcom/shopkick/app/controllers/BasePanelController;->logEventRecordWithScreenParams(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    return-void
.end method

.method public abstract setUpPanel(Landroid/view/ViewGroup;)V
.end method

.method protected setupEventLogForButton(Lcom/shopkick/app/widget/SKButton;I)V
    .locals 2

    .line 93
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    const/4 v1, 0x7

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {v0, p2, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 94
    iget p2, p0, Lcom/shopkick/app/controllers/BasePanelController;->panelType:I

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {v0, p2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setPanel(Ljava/lang/Integer;)V

    .line 95
    iget-object p2, p0, Lcom/shopkick/app/controllers/BasePanelController;->flowId:Ljava/lang/String;

    invoke-virtual {v0, p2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setFlowId(Ljava/lang/String;)V

    .line 96
    iget-object p2, p0, Lcom/shopkick/app/controllers/BasePanelController;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Lcom/shopkick/app/widget/SKButton;->setupEventLog(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    return-void
.end method

.method protected showKeyboard(Landroid/view/View;)V
    .locals 2

    .line 104
    iget-object v0, p0, Lcom/shopkick/app/controllers/BasePanelController;->context:Landroid/content/Context;

    if-eqz v0, :cond_1

    const-string v1, "input_method"

    .line 105
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    if-nez p1, :cond_0

    .line 107
    invoke-virtual {p0}, Lcom/shopkick/app/controllers/BasePanelController;->getView()Landroid/view/View;

    move-result-object p1

    :cond_0
    const/4 v1, 0x0

    .line 109
    invoke-virtual {v0, p1, v1}, Landroid/view/inputmethod/InputMethodManager;->showSoftInput(Landroid/view/View;I)Z

    :cond_1
    return-void
.end method
