.class public Lcom/usebutton/sdk/internal/views/DropinPresenter;
.super Ljava/lang/Object;
.source "DropinPresenter.java"


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String; = "DropinPresenter"


# instance fields
.field private mAppAction:Lcom/usebutton/sdk/internal/models/AppAction;

.field private final mButton:Lcom/usebutton/sdk/internal/ButtonPrivate;

.field private mContext:Landroid/content/Context;

.field private mDropin:Lcom/usebutton/sdk/DropinButton;

.field private final mEventTracker:Lcom/usebutton/sdk/internal/events/EventTracker;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/usebutton/sdk/DropinButton;)V
    .locals 1

    .line 34
    invoke-static {}, Lcom/usebutton/sdk/internal/ButtonPrivate;->getButton()Lcom/usebutton/sdk/internal/ButtonPrivate;

    move-result-object v0

    invoke-direct {p0, p1, p2, v0}, Lcom/usebutton/sdk/internal/views/DropinPresenter;-><init>(Landroid/content/Context;Lcom/usebutton/sdk/DropinButton;Lcom/usebutton/sdk/internal/ButtonPrivate;)V

    return-void
.end method

.method constructor <init>(Landroid/content/Context;Lcom/usebutton/sdk/DropinButton;Lcom/usebutton/sdk/internal/ButtonPrivate;)V
    .locals 0

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    iput-object p1, p0, Lcom/usebutton/sdk/internal/views/DropinPresenter;->mContext:Landroid/content/Context;

    .line 39
    iput-object p2, p0, Lcom/usebutton/sdk/internal/views/DropinPresenter;->mDropin:Lcom/usebutton/sdk/DropinButton;

    .line 40
    iput-object p3, p0, Lcom/usebutton/sdk/internal/views/DropinPresenter;->mButton:Lcom/usebutton/sdk/internal/ButtonPrivate;

    .line 41
    invoke-virtual {p3}, Lcom/usebutton/sdk/internal/ButtonPrivate;->getEventTracker()Lcom/usebutton/sdk/internal/events/EventTracker;

    move-result-object p1

    iput-object p1, p0, Lcom/usebutton/sdk/internal/views/DropinPresenter;->mEventTracker:Lcom/usebutton/sdk/internal/events/EventTracker;

    .line 45
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/views/DropinPresenter;->onLoading()V

    return-void
.end method

.method public static buttonWithText(Landroid/content/Context;Lcom/usebutton/sdk/internal/models/Text;Lcom/usebutton/sdk/internal/models/Text;Lcom/usebutton/sdk/internal/models/Asset;)Lcom/usebutton/sdk/internal/views/PreviewView;
    .locals 2
    .param p1    # Lcom/usebutton/sdk/internal/models/Text;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p3    # Lcom/usebutton/sdk/internal/models/Asset;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "InflateParams"
        }
    .end annotation

    const-string v0, "layout_inflater"

    .line 124
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/view/LayoutInflater;

    .line 125
    sget v0, Lcom/usebutton/sdk/R$layout;->btn_preview_two_line:I

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/usebutton/sdk/internal/views/PreviewView;

    .line 126
    invoke-virtual {p0, p1, p2, p3}, Lcom/usebutton/sdk/internal/views/PreviewView;->bind(Lcom/usebutton/sdk/internal/models/Text;Lcom/usebutton/sdk/internal/models/Text;Lcom/usebutton/sdk/internal/models/Asset;)V

    return-object p0
.end method

.method private getContext()Landroid/content/Context;
    .locals 1

    .line 139
    iget-object v0, p0, Lcom/usebutton/sdk/internal/views/DropinPresenter;->mContext:Landroid/content/Context;

    return-object v0
.end method


# virtual methods
.method onClicked(Lcom/usebutton/sdk/internal/models/AppAction;)V
    .locals 6

    .line 131
    iget-object v0, p0, Lcom/usebutton/sdk/internal/views/DropinPresenter;->mEventTracker:Lcom/usebutton/sdk/internal/events/EventTracker;

    const-string v1, "btn:button-tapped"

    const/4 v2, 0x4

    new-array v2, v2, [Ljava/lang/String;

    const-string v3, "promotion_source_token"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    .line 132
    invoke-virtual {p1}, Lcom/usebutton/sdk/internal/models/AppAction;->getMeta()Lcom/usebutton/sdk/internal/models/MetaInfo;

    move-result-object v3

    invoke-virtual {v3}, Lcom/usebutton/sdk/internal/models/MetaInfo;->getSourceToken()Ljava/lang/String;

    move-result-object v3

    const/4 v5, 0x1

    aput-object v3, v2, v5

    const-string v3, "type"

    const/4 v5, 0x2

    aput-object v3, v2, v5

    const-string v3, "button"

    const/4 v5, 0x3

    aput-object v3, v2, v5

    .line 131
    invoke-virtual {v0, v1, v2}, Lcom/usebutton/sdk/internal/events/EventTracker;->trackEventWithProperties(Ljava/lang/String;[Ljava/lang/String;)V

    .line 135
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/views/DropinPresenter;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p1, v0, v4}, Lcom/usebutton/sdk/internal/models/AppAction;->doInvokePreview(Landroid/content/Context;I)V

    return-void
.end method

.method onLoading()V
    .locals 3

    .line 82
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/views/DropinPresenter;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "layout_inflater"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/LayoutInflater;

    .line 83
    sget v1, Lcom/usebutton/sdk/R$layout;->btn_preview_two_line:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/usebutton/sdk/internal/views/PreviewView;

    const/4 v1, 0x1

    .line 84
    invoke-virtual {v0, v1}, Lcom/usebutton/sdk/internal/views/PreviewView;->setIsLoading(Z)V

    .line 85
    iget-object v1, p0, Lcom/usebutton/sdk/internal/views/DropinPresenter;->mDropin:Lcom/usebutton/sdk/DropinButton;

    invoke-virtual {v1, v0}, Lcom/usebutton/sdk/DropinButton;->addContentView(Landroid/view/ViewGroup;)V

    return-void
.end method

.method onNoPromotion()V
    .locals 1

    .line 89
    iget-object v0, p0, Lcom/usebutton/sdk/internal/views/DropinPresenter;->mDropin:Lcom/usebutton/sdk/DropinButton;

    invoke-virtual {v0}, Lcom/usebutton/sdk/DropinButton;->removeAllViews()V

    const/4 v0, 0x0

    .line 90
    iput-object v0, p0, Lcom/usebutton/sdk/internal/views/DropinPresenter;->mAppAction:Lcom/usebutton/sdk/internal/models/AppAction;

    return-void
.end method

.method onPromotion(Lcom/usebutton/sdk/internal/models/AppAction;Landroid/content/Context;)V
    .locals 2

    .line 94
    invoke-virtual {p1}, Lcom/usebutton/sdk/internal/models/AppAction;->getMeta()Lcom/usebutton/sdk/internal/models/MetaInfo;

    move-result-object v0

    .line 95
    iput-object p1, p0, Lcom/usebutton/sdk/internal/views/DropinPresenter;->mAppAction:Lcom/usebutton/sdk/internal/models/AppAction;

    .line 96
    invoke-virtual {p0, p1, p2}, Lcom/usebutton/sdk/internal/views/DropinPresenter;->updateWithPromotion(Lcom/usebutton/sdk/internal/models/AppAction;Landroid/content/Context;)V

    const-string p1, "Button visible to user (Action ID: %s)"

    const/4 p2, 0x1

    .line 97
    new-array p2, p2, [Ljava/lang/Object;

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/models/MetaInfo;->getId()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, p2, v1

    invoke-static {p1, p2}, Lcom/usebutton/sdk/internal/util/ButtonLog;->visibleFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 98
    iget-object p1, p0, Lcom/usebutton/sdk/internal/views/DropinPresenter;->mDropin:Lcom/usebutton/sdk/DropinButton;

    invoke-virtual {p1}, Lcom/usebutton/sdk/DropinButton;->onContent()V

    return-void
.end method

.method public onReportViewed()V
    .locals 3

    .line 147
    iget-object v0, p0, Lcom/usebutton/sdk/internal/views/DropinPresenter;->mAppAction:Lcom/usebutton/sdk/internal/models/AppAction;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/models/AppAction;->getMeta()Lcom/usebutton/sdk/internal/models/MetaInfo;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 150
    :cond_0
    iget-object v0, p0, Lcom/usebutton/sdk/internal/views/DropinPresenter;->mEventTracker:Lcom/usebutton/sdk/internal/events/EventTracker;

    const-string v1, "btn:button-viewed"

    iget-object v2, p0, Lcom/usebutton/sdk/internal/views/DropinPresenter;->mAppAction:Lcom/usebutton/sdk/internal/models/AppAction;

    invoke-virtual {v2}, Lcom/usebutton/sdk/internal/models/AppAction;->getMeta()Lcom/usebutton/sdk/internal/models/MetaInfo;

    move-result-object v2

    invoke-virtual {v2}, Lcom/usebutton/sdk/internal/models/MetaInfo;->getSourceToken()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/usebutton/sdk/internal/events/EventTracker;->trackEventWithPromotionSourceToken(Ljava/lang/String;Ljava/lang/String;)V

    .line 151
    iget-object v0, p0, Lcom/usebutton/sdk/internal/views/DropinPresenter;->mDropin:Lcom/usebutton/sdk/DropinButton;

    invoke-virtual {v0}, Lcom/usebutton/sdk/DropinButton;->onReportedView()V

    return-void

    :cond_1
    :goto_0
    return-void
.end method

.method public prepareWithAction(Lcom/usebutton/sdk/DropinButton;Lcom/usebutton/sdk/action/ButtonAction;)V
    .locals 0

    if-nez p2, :cond_0

    const/4 p2, 0x0

    .line 50
    check-cast p2, Lcom/usebutton/sdk/internal/models/AppAction;

    invoke-virtual {p0, p1, p2}, Lcom/usebutton/sdk/internal/views/DropinPresenter;->prepareWithAction(Lcom/usebutton/sdk/DropinButton;Lcom/usebutton/sdk/internal/models/AppAction;)V

    goto :goto_0

    .line 52
    :cond_0
    invoke-virtual {p2}, Lcom/usebutton/sdk/action/ButtonAction;->getAppAction()Lcom/usebutton/sdk/internal/models/AppAction;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lcom/usebutton/sdk/internal/views/DropinPresenter;->prepareWithAction(Lcom/usebutton/sdk/DropinButton;Lcom/usebutton/sdk/internal/models/AppAction;)V

    :goto_0
    return-void
.end method

.method prepareWithAction(Lcom/usebutton/sdk/DropinButton;Lcom/usebutton/sdk/internal/models/AppAction;)V
    .locals 1
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    .line 58
    iget-object v0, p0, Lcom/usebutton/sdk/internal/views/DropinPresenter;->mButton:Lcom/usebutton/sdk/internal/ButtonPrivate;

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/ButtonPrivate;->internalIsStarted()Z

    move-result v0

    if-nez v0, :cond_0

    const-string p1, "Button is not started, start with Button.getButton(context).start()."

    .line 59
    invoke-static {p1}, Lcom/usebutton/sdk/internal/util/ButtonLog;->visible(Ljava/lang/String;)V

    .line 60
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/views/DropinPresenter;->onNoPromotion()V

    return-void

    :cond_0
    if-nez p2, :cond_1

    .line 65
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/views/DropinPresenter;->onNoPromotion()V

    .line 66
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/views/DropinPresenter;->onLoading()V

    return-void

    .line 70
    :cond_1
    invoke-virtual {p2}, Lcom/usebutton/sdk/internal/models/AppAction;->getPreview()Lcom/usebutton/sdk/internal/models/Preview;

    move-result-object v0

    if-nez v0, :cond_2

    const-string p1, "AppAction does not contain a preview."

    .line 71
    invoke-static {p1}, Lcom/usebutton/sdk/internal/util/ButtonLog;->visible(Ljava/lang/String;)V

    .line 72
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/views/DropinPresenter;->onNoPromotion()V

    .line 73
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/views/DropinPresenter;->onLoading()V

    return-void

    .line 77
    :cond_2
    iput-object p1, p0, Lcom/usebutton/sdk/internal/views/DropinPresenter;->mDropin:Lcom/usebutton/sdk/DropinButton;

    .line 78
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/views/DropinPresenter;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p0, p2, p1}, Lcom/usebutton/sdk/internal/views/DropinPresenter;->onPromotion(Lcom/usebutton/sdk/internal/models/AppAction;Landroid/content/Context;)V

    return-void
.end method

.method public test_setContext(Landroid/content/Context;)V
    .locals 0

    .line 143
    iput-object p1, p0, Lcom/usebutton/sdk/internal/views/DropinPresenter;->mContext:Landroid/content/Context;

    return-void
.end method

.method public updateWithPromotion(Lcom/usebutton/sdk/internal/models/AppAction;Landroid/content/Context;)V
    .locals 3

    .line 102
    invoke-virtual {p1}, Lcom/usebutton/sdk/internal/models/AppAction;->getPreview()Lcom/usebutton/sdk/internal/models/Preview;

    move-result-object v0

    .line 103
    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/models/Preview;->getTitle()Lcom/usebutton/sdk/internal/models/Text;

    move-result-object v1

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/models/Preview;->getText()Lcom/usebutton/sdk/internal/models/Text;

    move-result-object v2

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/models/Preview;->getIcon()Lcom/usebutton/sdk/internal/models/Asset;

    move-result-object v0

    invoke-static {p2, v1, v2, v0}, Lcom/usebutton/sdk/internal/views/DropinPresenter;->buttonWithText(Landroid/content/Context;Lcom/usebutton/sdk/internal/models/Text;Lcom/usebutton/sdk/internal/models/Text;Lcom/usebutton/sdk/internal/models/Asset;)Lcom/usebutton/sdk/internal/views/PreviewView;

    move-result-object p2

    .line 104
    new-instance v0, Lcom/usebutton/sdk/internal/views/DropinPresenter$1;

    invoke-direct {v0, p0, p1}, Lcom/usebutton/sdk/internal/views/DropinPresenter$1;-><init>(Lcom/usebutton/sdk/internal/views/DropinPresenter;Lcom/usebutton/sdk/internal/models/AppAction;)V

    instance-of p1, p2, Landroid/view/View;

    if-nez p1, :cond_0

    invoke-virtual {p2, v0}, Lcom/usebutton/sdk/internal/views/PreviewView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    move-object p1, p2

    check-cast p1, Landroid/view/View;

    invoke-static {p1, v0}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 110
    :goto_0
    iget-object p1, p0, Lcom/usebutton/sdk/internal/views/DropinPresenter;->mDropin:Lcom/usebutton/sdk/DropinButton;

    invoke-virtual {p1, p2}, Lcom/usebutton/sdk/DropinButton;->addContentView(Landroid/view/ViewGroup;)V

    return-void
.end method
