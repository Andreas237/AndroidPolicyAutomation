.class public abstract Lcom/usebutton/sdk/internal/BaseCardActivity;
.super Landroid/app/Activity;
.source "BaseCardActivity.java"

# interfaces
.implements Lcom/newrelic/agent/android/api/v2/TraceFieldInterface;


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation


# static fields
.field protected static final EXTRA_FOOTER:Ljava/lang/String; = "footer"

.field public static final EXTRA_INTENT_FLAGS:Ljava/lang/String; = "flags"

.field public static final EXTRA_META_INFO:Ljava/lang/String; = "meta_info"

.field public static final REQUEST_INSTALL:I = 0x5

.field private static final STATE_KEY_DID_TRACK_VIEWED:Ljava/lang/String;

.field private static final TAG:Ljava/lang/String;


# instance fields
.field public _nr_trace:Lcom/newrelic/agent/android/tracing/Trace;

.field mDidDismiss:Z

.field mDidTrackViewed:Z

.field private mMetaInfo:Lcom/usebutton/sdk/internal/models/MetaInfo;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 37
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-class v1, Lcom/usebutton/sdk/internal/BaseCardActivity;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ".did_track_viewed"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/usebutton/sdk/internal/BaseCardActivity;->STATE_KEY_DID_TRACK_VIEWED:Ljava/lang/String;

    .line 39
    const-class v0, Lcom/usebutton/sdk/internal/BaseCardActivity;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/usebutton/sdk/internal/BaseCardActivity;->TAG:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 33
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    const/4 v0, 0x0

    .line 40
    iput-boolean v0, p0, Lcom/usebutton/sdk/internal/BaseCardActivity;->mDidTrackViewed:Z

    .line 41
    iput-boolean v0, p0, Lcom/usebutton/sdk/internal/BaseCardActivity;->mDidDismiss:Z

    return-void
.end method

.method static eventPropertiesSourceTokenAndAppId(Lcom/usebutton/sdk/internal/models/MetaInfo;)Lorg/json/JSONObject;
    .locals 3

    const/4 v0, 0x4

    .line 215
    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "promotion_source_token"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    .line 216
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/models/MetaInfo;->getSourceToken()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, "app_id"

    const/4 v2, 0x2

    aput-object v1, v0, v2

    .line 217
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/models/MetaInfo;->getStoreId()Ljava/lang/String;

    move-result-object p0

    const/4 v1, 0x3

    aput-object p0, v0, v1

    .line 215
    invoke-static {v0}, Lcom/usebutton/sdk/internal/util/JsonBuilder;->toJson([Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object p0

    return-object p0
.end method

.method private isOutOfBounds(Landroid/view/MotionEvent;Landroid/view/View;)Z
    .locals 3

    .line 112
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    float-to-int v0, v0

    .line 113
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    float-to-int p1, p1

    .line 114
    invoke-static {p0}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/ViewConfiguration;->getScaledWindowTouchSlop()I

    move-result v1

    neg-int v2, v1

    if-lt v0, v2, :cond_1

    if-lt p1, v2, :cond_1

    .line 116
    invoke-virtual {p2}, Landroid/view/View;->getWidth()I

    move-result v2

    add-int/2addr v2, v1

    if-gt v0, v2, :cond_1

    .line 117
    invoke-virtual {p2}, Landroid/view/View;->getHeight()I

    move-result p2

    add-int/2addr p2, v1

    if-le p1, p2, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method private loadAssets()V
    .locals 4

    .line 64
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/BaseCardActivity;->collectAssets()Ljava/util/List;

    move-result-object v0

    .line 65
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 66
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/BaseCardActivity;->onAssetsReady()V

    return-void

    .line 69
    :cond_0
    new-instance v1, Lcom/usebutton/sdk/internal/commands/LoadAssetsCommand;

    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/BaseCardActivity;->getButton()Lcom/usebutton/sdk/internal/ButtonPrivate;

    move-result-object v2

    invoke-virtual {v2}, Lcom/usebutton/sdk/internal/ButtonPrivate;->getImageLoader()Lcom/usebutton/sdk/internal/ImageLoader;

    move-result-object v2

    new-instance v3, Lcom/usebutton/sdk/internal/BaseCardActivity$1;

    invoke-direct {v3, p0}, Lcom/usebutton/sdk/internal/BaseCardActivity$1;-><init>(Lcom/usebutton/sdk/internal/BaseCardActivity;)V

    invoke-direct {v1, v2, v0, v3}, Lcom/usebutton/sdk/internal/commands/LoadAssetsCommand;-><init>(Lcom/usebutton/sdk/internal/ImageLoader;Ljava/util/List;Lcom/usebutton/sdk/internal/core/FailableReceiver;)V

    .line 80
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/BaseCardActivity;->getButton()Lcom/usebutton/sdk/internal/ButtonPrivate;

    move-result-object v0

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/ButtonPrivate;->getCommandExecutor()Lcom/usebutton/sdk/internal/core/CommandExecutor;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/usebutton/sdk/internal/core/CommandExecutor;->dispatchFirst(Lcom/usebutton/sdk/internal/core/Command;)V

    return-void
.end method


# virtual methods
.method public _nr_setTrace(Lcom/newrelic/agent/android/tracing/Trace;)V
    .locals 0

    :try_start_0
    iput-object p1, p0, Lcom/usebutton/sdk/internal/BaseCardActivity;->_nr_trace:Lcom/newrelic/agent/android/tracing/Trace;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method public abstract bind(Lcom/usebutton/sdk/internal/models/MetaInfo;)V
.end method

.method public collectAssets()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/usebutton/sdk/internal/models/Asset;",
            ">;"
        }
    .end annotation

    .line 250
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    return-object v0
.end method

.method public getButton()Lcom/usebutton/sdk/internal/ButtonPrivate;
    .locals 1

    .line 186
    invoke-static {}, Lcom/usebutton/sdk/internal/ButtonPrivate;->getButton()Lcom/usebutton/sdk/internal/ButtonPrivate;

    move-result-object v0

    return-object v0
.end method

.method protected abstract getCardDismissedEvent()Ljava/lang/String;
.end method

.method protected abstract getCardSpecificEventProperties()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/usebutton/sdk/internal/functional/Pair<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end method

.method protected abstract getCardViewedEvent()Ljava/lang/String;
.end method

.method public abstract getContentLayoutId()I
.end method

.method public getEventTracker()Lcom/usebutton/sdk/internal/events/EventTracker;
    .locals 1

    .line 194
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/BaseCardActivity;->getButton()Lcom/usebutton/sdk/internal/ButtonPrivate;

    move-result-object v0

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/ButtonPrivate;->getEventTracker()Lcom/usebutton/sdk/internal/events/EventTracker;

    move-result-object v0

    return-object v0
.end method

.method public getMetaInfo()Lcom/usebutton/sdk/internal/models/MetaInfo;
    .locals 1

    .line 202
    iget-object v0, p0, Lcom/usebutton/sdk/internal/BaseCardActivity;->mMetaInfo:Lcom/usebutton/sdk/internal/models/MetaInfo;

    return-object v0
.end method

.method public getPackageObserver()Lcom/usebutton/sdk/internal/util/PackageObserver;
    .locals 1

    .line 190
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/BaseCardActivity;->getButton()Lcom/usebutton/sdk/internal/ButtonPrivate;

    move-result-object v0

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/ButtonPrivate;->getPackageObserver()Lcom/usebutton/sdk/internal/util/PackageObserver;

    move-result-object v0

    return-object v0
.end method

.method public getPromotionId()Ljava/lang/String;
    .locals 1

    .line 198
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/BaseCardActivity;->getMetaInfo()Lcom/usebutton/sdk/internal/models/MetaInfo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/models/MetaInfo;->getId()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getSourceToken()Ljava/lang/String;
    .locals 1

    .line 206
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/BaseCardActivity;->getMetaInfo()Lcom/usebutton/sdk/internal/models/MetaInfo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/models/MetaInfo;->getSourceToken()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method initHeader(Lcom/usebutton/sdk/internal/models/Header;)V
    .locals 2

    if-nez p1, :cond_0

    .line 85
    sget p1, Lcom/usebutton/sdk/R$id;->promo_banner:I

    invoke-virtual {p0, p1}, Lcom/usebutton/sdk/internal/BaseCardActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    return-void

    .line 88
    :cond_0
    sget v0, Lcom/usebutton/sdk/R$id;->promo_banner:I

    invoke-virtual {p0, v0}, Lcom/usebutton/sdk/internal/BaseCardActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 89
    sget v0, Lcom/usebutton/sdk/R$id;->promo_title:I

    invoke-virtual {p1}, Lcom/usebutton/sdk/internal/models/Header;->getText()Lcom/usebutton/sdk/internal/models/Text;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/usebutton/sdk/internal/BaseCardActivity;->setText(ILcom/usebutton/sdk/internal/models/Text;)V

    .line 90
    sget v0, Lcom/usebutton/sdk/R$id;->promo_subtitle:I

    invoke-virtual {p1}, Lcom/usebutton/sdk/internal/models/Header;->getSubtitle()Lcom/usebutton/sdk/internal/models/Text;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/usebutton/sdk/internal/BaseCardActivity;->setText(ILcom/usebutton/sdk/internal/models/Text;)V

    .line 92
    sget v0, Lcom/usebutton/sdk/R$id;->promo_card:I

    invoke-virtual {p0, v0}, Lcom/usebutton/sdk/internal/BaseCardActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/CardView;

    .line 93
    invoke-virtual {p1}, Lcom/usebutton/sdk/internal/models/Header;->getBackgroundColor()I

    move-result p1

    invoke-virtual {v0, p1}, Landroid/support/v7/widget/CardView;->setCardBackgroundColor(I)V

    return-void
.end method

.method public onAssetsFailed()V
    .locals 0

    return-void
.end method

.method public onAssetsReady()V
    .locals 0

    return-void
.end method

.method public onBackPressed()V
    .locals 1

    const/4 v0, 0x1

    .line 122
    iput-boolean v0, p0, Lcom/usebutton/sdk/internal/BaseCardActivity;->mDidDismiss:Z

    .line 123
    invoke-super {p0}, Landroid/app/Activity;->onBackPressed()V

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 3

    const-string v0, "BaseCardActivity"

    invoke-static {v0}, Lcom/newrelic/agent/android/tracing/TraceMachine;->startTracing(Ljava/lang/String;)V

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lcom/usebutton/sdk/internal/BaseCardActivity;->_nr_trace:Lcom/newrelic/agent/android/tracing/Trace;

    const-string v2, "BaseCardActivity#onCreate"

    invoke-static {v1, v2, v0}, Lcom/newrelic/agent/android/tracing/TraceMachine;->enterMethod(Lcom/newrelic/agent/android/tracing/Trace;Ljava/lang/String;Ljava/util/ArrayList;)V

    goto :goto_0

    :catch_0
    const-string v1, "BaseCardActivity#onCreate"

    invoke-static {v0, v1, v0}, Lcom/newrelic/agent/android/tracing/TraceMachine;->enterMethod(Lcom/newrelic/agent/android/tracing/Trace;Ljava/lang/String;Ljava/util/ArrayList;)V
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_0

    .line 46
    :goto_0
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 47
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/BaseCardActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "meta_info"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/usebutton/sdk/internal/models/MetaInfo;

    iput-object v0, p0, Lcom/usebutton/sdk/internal/BaseCardActivity;->mMetaInfo:Lcom/usebutton/sdk/internal/models/MetaInfo;

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    .line 48
    sget-object v1, Lcom/usebutton/sdk/internal/BaseCardActivity;->STATE_KEY_DID_TRACK_VIEWED:Ljava/lang/String;

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    :cond_0
    iput-boolean v0, p0, Lcom/usebutton/sdk/internal/BaseCardActivity;->mDidTrackViewed:Z

    .line 49
    iget-object p1, p0, Lcom/usebutton/sdk/internal/BaseCardActivity;->mMetaInfo:Lcom/usebutton/sdk/internal/models/MetaInfo;

    if-nez p1, :cond_1

    .line 50
    sget-object p1, Lcom/usebutton/sdk/internal/BaseCardActivity;->TAG:Ljava/lang/String;

    const-string v0, "Could not find valid MetaInfo extra, make sure you use this class\'s factory method."

    invoke-static {p1, v0}, Lcom/usebutton/sdk/internal/util/ButtonLog;->warn(Ljava/lang/String;Ljava/lang/String;)V

    .line 51
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/BaseCardActivity;->finish()V

    .line 54
    :cond_1
    iget-object p1, p0, Lcom/usebutton/sdk/internal/BaseCardActivity;->mMetaInfo:Lcom/usebutton/sdk/internal/models/MetaInfo;

    invoke-virtual {p0, p1}, Lcom/usebutton/sdk/internal/BaseCardActivity;->shouldBindAndShowContent(Lcom/usebutton/sdk/internal/models/MetaInfo;)Z

    move-result p1

    if-nez p1, :cond_2

    .line 55
    invoke-static {}, Lcom/newrelic/agent/android/tracing/TraceMachine;->exitMethod()V

    return-void

    .line 58
    :cond_2
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/BaseCardActivity;->getContentLayoutId()I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/usebutton/sdk/internal/BaseCardActivity;->setContentView(I)V

    .line 59
    iget-object p1, p0, Lcom/usebutton/sdk/internal/BaseCardActivity;->mMetaInfo:Lcom/usebutton/sdk/internal/models/MetaInfo;

    invoke-virtual {p0, p1}, Lcom/usebutton/sdk/internal/BaseCardActivity;->bind(Lcom/usebutton/sdk/internal/models/MetaInfo;)V

    .line 60
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/BaseCardActivity;->loadAssets()V

    .line 61
    invoke-static {}, Lcom/newrelic/agent/android/tracing/TraceMachine;->exitMethod()V

    return-void
.end method

.method protected onPause()V
    .locals 3

    .line 143
    iget-boolean v0, p0, Lcom/usebutton/sdk/internal/BaseCardActivity;->mDidDismiss:Z

    if-eqz v0, :cond_0

    .line 144
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/BaseCardActivity;->getCardDismissedEvent()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/String;

    invoke-virtual {p0, v0, v2}, Lcom/usebutton/sdk/internal/BaseCardActivity;->trackCardEvent(Ljava/lang/String;[Ljava/lang/String;)V

    .line 145
    iput-boolean v1, p0, Lcom/usebutton/sdk/internal/BaseCardActivity;->mDidDismiss:Z

    .line 147
    :cond_0
    invoke-super {p0}, Landroid/app/Activity;->onPause()V

    return-void
.end method

.method protected onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2

    .line 128
    invoke-super {p0, p1}, Landroid/app/Activity;->onSaveInstanceState(Landroid/os/Bundle;)V

    .line 129
    sget-object v0, Lcom/usebutton/sdk/internal/BaseCardActivity;->STATE_KEY_DID_TRACK_VIEWED:Ljava/lang/String;

    iget-boolean v1, p0, Lcom/usebutton/sdk/internal/BaseCardActivity;->mDidTrackViewed:Z

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    return-void
.end method

.method protected onStart()V
    .locals 2

    invoke-static {}, Lcom/newrelic/agent/android/background/ApplicationStateMonitor;->getInstance()Lcom/newrelic/agent/android/background/ApplicationStateMonitor;

    move-result-object v0

    invoke-virtual {v0}, Lcom/newrelic/agent/android/background/ApplicationStateMonitor;->activityStarted()V

    .line 134
    invoke-super {p0}, Landroid/app/Activity;->onStart()V

    .line 135
    iget-boolean v0, p0, Lcom/usebutton/sdk/internal/BaseCardActivity;->mDidTrackViewed:Z

    if-nez v0, :cond_0

    .line 136
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/BaseCardActivity;->getCardViewedEvent()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/String;

    invoke-virtual {p0, v0, v1}, Lcom/usebutton/sdk/internal/BaseCardActivity;->trackCardEvent(Ljava/lang/String;[Ljava/lang/String;)V

    const/4 v0, 0x1

    .line 137
    iput-boolean v0, p0, Lcom/usebutton/sdk/internal/BaseCardActivity;->mDidTrackViewed:Z

    :cond_0
    return-void
.end method

.method protected onStop()V
    .locals 1

    invoke-super {p0}, Landroid/app/Activity;->onStop()V

    invoke-static {}, Lcom/newrelic/agent/android/background/ApplicationStateMonitor;->getInstance()Lcom/newrelic/agent/android/background/ApplicationStateMonitor;

    move-result-object v0

    invoke-virtual {v0}, Lcom/newrelic/agent/android/background/ApplicationStateMonitor;->activityStopped()V

    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    .line 98
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/BaseCardActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lcom/usebutton/sdk/internal/BaseCardActivity;->willCloseOnTouch(Landroid/view/MotionEvent;Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    .line 99
    iput-boolean v0, p0, Lcom/usebutton/sdk/internal/BaseCardActivity;->mDidDismiss:Z

    .line 101
    :cond_0
    invoke-super {p0, p1}, Landroid/app/Activity;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method

.method public setText(ILcom/usebutton/sdk/internal/models/Text;)V
    .locals 1

    .line 169
    invoke-virtual {p0, p1}, Lcom/usebutton/sdk/internal/BaseCardActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    if-eqz p2, :cond_0

    .line 171
    invoke-virtual {p2}, Lcom/usebutton/sdk/internal/models/Text;->getCopy()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 172
    invoke-virtual {p2}, Lcom/usebutton/sdk/internal/models/Text;->getColor()I

    move-result p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setTextColor(I)V

    const/4 p2, 0x0

    .line 173
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0

    :cond_0
    const/16 p2, 0x8

    .line 175
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setVisibility(I)V

    :goto_0
    return-void
.end method

.method public setText(ILjava/lang/String;)V
    .locals 1

    .line 180
    invoke-virtual {p0, p1}, Lcom/usebutton/sdk/internal/BaseCardActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    .line 181
    move-object v0, p1

    check-cast v0, Landroid/widget/TextView;

    invoke-virtual {v0, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 182
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-eqz p2, :cond_0

    const/16 p2, 0x8

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public varargs setTextColor(I[I)V
    .locals 3

    .line 163
    array-length v0, p2

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    aget v2, p2, v1

    .line 164
    invoke-virtual {p0, v2}, Lcom/usebutton/sdk/internal/BaseCardActivity;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    invoke-virtual {v2, p1}, Landroid/widget/TextView;->setTextColor(I)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public varargs setVisibility(I[I)V
    .locals 3

    .line 262
    array-length v0, p2

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    aget v2, p2, v1

    .line 263
    invoke-virtual {p0, v2}, Lcom/usebutton/sdk/internal/BaseCardActivity;->findViewById(I)Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2, p1}, Landroid/view/View;->setVisibility(I)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public abstract shouldBindAndShowContent(Lcom/usebutton/sdk/internal/models/MetaInfo;)Z
.end method

.method public toString(Landroid/content/Intent;)Ljava/lang/String;
    .locals 0

    if-nez p1, :cond_0

    const-string p1, "null"

    return-object p1

    .line 211
    :cond_0
    invoke-virtual {p1}, Landroid/content/Intent;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public varargs trackCardEvent(Ljava/lang/String;[Ljava/lang/String;)V
    .locals 4

    if-nez p1, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x2

    .line 226
    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "promotion_source_token"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/BaseCardActivity;->getMetaInfo()Lcom/usebutton/sdk/internal/models/MetaInfo;

    move-result-object v1

    invoke-virtual {v1}, Lcom/usebutton/sdk/internal/models/MetaInfo;->getSourceToken()Ljava/lang/String;

    move-result-object v1

    const/4 v3, 0x1

    aput-object v1, v0, v3

    invoke-static {v0}, Lcom/usebutton/sdk/internal/util/JsonBuilder;->toJson([Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v0

    .line 228
    :goto_0
    :try_start_0
    array-length v1, p2

    if-ge v2, v1, :cond_1

    .line 229
    aget-object v1, p2, v2

    add-int/lit8 v3, v2, 0x1

    aget-object v3, p2, v3

    invoke-virtual {v0, v1, v3}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    add-int/lit8 v2, v2, 0x2

    goto :goto_0

    .line 231
    :cond_1
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/BaseCardActivity;->getCardSpecificEventProperties()Ljava/util/List;

    move-result-object v1

    .line 232
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/usebutton/sdk/internal/functional/Pair;

    .line 233
    invoke-virtual {v2}, Lcom/usebutton/sdk/internal/functional/Pair;->first()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v2}, Lcom/usebutton/sdk/internal/functional/Pair;->second()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0, v3, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    .line 236
    :catch_0
    sget-object v1, Lcom/usebutton/sdk/internal/BaseCardActivity;->TAG:Ljava/lang/String;

    const-string v2, "Couldn\'t add key/value to property set: %s"

    invoke-static {v1, v2, p2}, Lcom/usebutton/sdk/internal/util/ButtonLog;->warnFormat(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 238
    :cond_2
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/BaseCardActivity;->getEventTracker()Lcom/usebutton/sdk/internal/events/EventTracker;

    move-result-object p2

    invoke-virtual {p2, p1, v0}, Lcom/usebutton/sdk/internal/events/EventTracker;->trackEventWithProperties(Ljava/lang/String;Lorg/json/JSONObject;)V

    return-void
.end method

.method public willCloseOnTouch(Landroid/view/MotionEvent;Landroid/view/View;)Z
    .locals 1

    .line 105
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0, p1, p2}, Lcom/usebutton/sdk/internal/BaseCardActivity;->isOutOfBounds(Landroid/view/MotionEvent;Landroid/view/View;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
