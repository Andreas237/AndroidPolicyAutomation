.class public Lcom/shopkick/app/widget/SKSignalViewFactory;
.super Ljava/lang/Object;
.source "SKSignalViewFactory.java"


# instance fields
.field audioThreadController:Lcom/shopkick/app/presence/AudioThreadController;

.field buttonFactory:Lcom/shopkick/app/graphics/ButtonDrawableFactory;

.field clientFlagsMgr:Lcom/shopkick/app/application/ClientFlagsManager;

.field notifCenter:Lcom/shopkick/app/util/NotificationCenter;

.field presenceController:Lcom/shopkick/app/presence/PresenceController;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/util/NotificationCenter;Lcom/shopkick/app/graphics/ButtonDrawableFactory;Lcom/shopkick/app/presence/PresenceController;Lcom/shopkick/app/application/ClientFlagsManager;Lcom/shopkick/app/presence/AudioThreadController;)V
    .locals 0

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    iput-object p2, p0, Lcom/shopkick/app/widget/SKSignalViewFactory;->buttonFactory:Lcom/shopkick/app/graphics/ButtonDrawableFactory;

    .line 24
    iput-object p1, p0, Lcom/shopkick/app/widget/SKSignalViewFactory;->notifCenter:Lcom/shopkick/app/util/NotificationCenter;

    .line 25
    iput-object p3, p0, Lcom/shopkick/app/widget/SKSignalViewFactory;->presenceController:Lcom/shopkick/app/presence/PresenceController;

    .line 26
    iput-object p5, p0, Lcom/shopkick/app/widget/SKSignalViewFactory;->audioThreadController:Lcom/shopkick/app/presence/AudioThreadController;

    .line 27
    iput-object p4, p0, Lcom/shopkick/app/widget/SKSignalViewFactory;->clientFlagsMgr:Lcom/shopkick/app/application/ClientFlagsManager;

    return-void
.end method


# virtual methods
.method public createSignalView(Landroid/content/Context;)Lcom/shopkick/app/widget/SKSignalView;
    .locals 7

    .line 31
    new-instance v6, Lcom/shopkick/app/widget/SKSignalView;

    iget-object v2, p0, Lcom/shopkick/app/widget/SKSignalViewFactory;->buttonFactory:Lcom/shopkick/app/graphics/ButtonDrawableFactory;

    iget-object v3, p0, Lcom/shopkick/app/widget/SKSignalViewFactory;->clientFlagsMgr:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v0, p0, Lcom/shopkick/app/widget/SKSignalViewFactory;->presenceController:Lcom/shopkick/app/presence/PresenceController;

    .line 34
    invoke-virtual {v0}, Lcom/shopkick/app/presence/PresenceController;->getLastPresenceEvent()Ljava/lang/String;

    move-result-object v4

    iget-object v5, p0, Lcom/shopkick/app/widget/SKSignalViewFactory;->audioThreadController:Lcom/shopkick/app/presence/AudioThreadController;

    move-object v0, v6

    move-object v1, p1

    invoke-direct/range {v0 .. v5}, Lcom/shopkick/app/widget/SKSignalView;-><init>(Landroid/content/Context;Lcom/shopkick/app/graphics/ButtonDrawableFactory;Lcom/shopkick/app/application/ClientFlagsManager;Ljava/lang/String;Lcom/shopkick/app/presence/AudioThreadController;)V

    .line 36
    iget-object p1, p0, Lcom/shopkick/app/widget/SKSignalViewFactory;->notifCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v0, "PresenceControllerDetectedSignal"

    invoke-virtual {p1, v6, v0}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 37
    iget-object p1, p0, Lcom/shopkick/app/widget/SKSignalViewFactory;->notifCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v0, "PresenceControllerDetectedSignalLost"

    invoke-virtual {p1, v6, v0}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 38
    iget-object p1, p0, Lcom/shopkick/app/widget/SKSignalViewFactory;->notifCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v0, "PresenceControllerDetectedCode"

    invoke-virtual {p1, v6, v0}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    return-object v6
.end method

.method public destroySignalView(Lcom/shopkick/app/widget/SKSignalView;)V
    .locals 1

    .line 43
    iget-object v0, p0, Lcom/shopkick/app/widget/SKSignalViewFactory;->notifCenter:Lcom/shopkick/app/util/NotificationCenter;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;)V

    return-void
.end method
