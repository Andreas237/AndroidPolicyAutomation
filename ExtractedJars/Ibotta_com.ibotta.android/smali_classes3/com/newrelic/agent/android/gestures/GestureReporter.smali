.class public Lcom/newrelic/agent/android/gestures/GestureReporter;
.super Landroid/view/GestureDetector$SimpleOnGestureListener;
.source "GestureReporter.java"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0xb
.end annotation


# static fields
.field private static final currentGestureReporter:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "Lcom/newrelic/agent/android/gestures/GestureReporter;",
            ">;"
        }
    .end annotation
.end field

.field private static final gestureReporterMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Lcom/newrelic/agent/android/gestures/GestureReporter;",
            ">;"
        }
    .end annotation
.end field

.field private static final log:Lcom/newrelic/agent/android/logging/AgentLog;

.field private static supportedClasses:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Class;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field final controlCache:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/Integer;",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field

.field final detector:Landroid/support/v4/view/GestureDetectorCompat;

.field final executor:Ljava/util/concurrent/ExecutorService;

.field private gestureId:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 46
    invoke-static {}, Lcom/newrelic/agent/android/logging/AgentLogManager;->getAgentLog()Lcom/newrelic/agent/android/logging/AgentLog;

    move-result-object v0

    sput-object v0, Lcom/newrelic/agent/android/gestures/GestureReporter;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    .line 54
    new-instance v0, Ljava/util/HashSet;

    const/4 v1, 0x5

    new-array v1, v1, [Ljava/lang/Class;

    const-class v2, Landroid/widget/TextView;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-class v2, Landroid/widget/ImageView;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-class v2, Landroid/app/ActionBar;

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const-class v2, Landroid/widget/AdapterView;

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-class v2, Landroid/view/ViewStub;

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    sput-object v0, Lcom/newrelic/agent/android/gestures/GestureReporter;->supportedClasses:Ljava/util/Set;

    .line 385
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/newrelic/agent/android/gestures/GestureReporter;->gestureReporterMap:Ljava/util/Map;

    .line 386
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    sput-object v0, Lcom/newrelic/agent/android/gestures/GestureReporter;->currentGestureReporter:Ljava/util/concurrent/atomic/AtomicReference;

    return-void
.end method

.method public constructor <init>(Landroid/app/Activity;Landroid/view/View;)V
    .locals 2

    .line 63
    invoke-direct {p0}, Landroid/view/GestureDetector$SimpleOnGestureListener;-><init>()V

    .line 64
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/newrelic/agent/android/gestures/GestureReporter;->controlCache:Ljava/util/HashMap;

    .line 65
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/newrelic/agent/android/gestures/GestureReporter;->executor:Ljava/util/concurrent/ExecutorService;

    .line 66
    new-instance v0, Landroid/support/v4/view/GestureDetectorCompat;

    invoke-direct {v0, p1, p0}, Landroid/support/v4/view/GestureDetectorCompat;-><init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;)V

    iput-object v0, p0, Lcom/newrelic/agent/android/gestures/GestureReporter;->detector:Landroid/support/v4/view/GestureDetectorCompat;

    .line 67
    invoke-virtual {p0, p2}, Lcom/newrelic/agent/android/gestures/GestureReporter;->generateGestureId(Landroid/view/View;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/newrelic/agent/android/gestures/GestureReporter;->gestureId:Ljava/lang/String;

    .line 69
    invoke-virtual {p0, p2}, Lcom/newrelic/agent/android/gestures/GestureReporter;->addView(Landroid/view/View;)Ljava/util/Set;

    .line 71
    sget-object p2, Lcom/newrelic/agent/android/gestures/GestureReporter;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "[Gesture] Attached to activity ["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Landroid/app/Activity;->getLocalClassName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "]"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2, p1}, Lcom/newrelic/agent/android/logging/AgentLog;->info(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic access$000()Lcom/newrelic/agent/android/logging/AgentLog;
    .locals 1

    .line 43
    sget-object v0, Lcom/newrelic/agent/android/gestures/GestureReporter;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    return-object v0
.end method

.method private attachChildTouchListeners(Ljava/util/Set;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Landroid/view/View;",
            ">;)V"
        }
    .end annotation

    .line 274
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 278
    invoke-virtual {p0, v0}, Lcom/newrelic/agent/android/gestures/GestureReporter;->shouldTrackControl(Landroid/view/View;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 279
    iget-object v1, p0, Lcom/newrelic/agent/android/gestures/GestureReporter;->controlCache:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 282
    invoke-static {v0, p0}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnTouchListener(Landroid/view/View;Landroid/view/View$OnTouchListener;)V

    .line 284
    sget-object v1, Lcom/newrelic/agent/android/gestures/GestureReporter;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "[Gesture] Will monitor touch events on view ["

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Landroid/view/View;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "]"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v0}, Lcom/newrelic/agent/android/logging/AgentLog;->debug(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method protected static gatherChildViews(Landroid/view/View;)Ljava/util/Set;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            ")",
            "Ljava/util/Set<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation

    .line 290
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 292
    const-class v1, Landroid/view/ViewGroup;

    invoke-static {p0, v1}, Lcom/newrelic/agent/android/gestures/GestureObserver;->isSubClassOf(Ljava/lang/Object;Ljava/lang/Class;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 293
    invoke-interface {v0, p0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-object v0

    .line 297
    :cond_0
    move-object v1, p0

    check-cast v1, Landroid/view/ViewGroup;

    const/16 v2, 0x40

    .line 298
    invoke-virtual {v1}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v3

    invoke-static {v2, v3}, Ljava/lang/Math;->min(II)I

    move-result v2

    if-nez v2, :cond_1

    .line 301
    invoke-interface {v0, p0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    const/4 p0, 0x0

    :goto_0
    if-ge p0, v2, :cond_2

    .line 303
    invoke-virtual {v1, p0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    .line 304
    invoke-static {v3}, Lcom/newrelic/agent/android/gestures/GestureReporter;->gatherChildViews(Landroid/view/View;)Ljava/util/Set;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    add-int/lit8 p0, p0, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    return-object v0
.end method

.method public static getGestureReporter()Lcom/newrelic/agent/android/gestures/GestureReporter;
    .locals 1

    .line 397
    sget-object v0, Lcom/newrelic/agent/android/gestures/GestureReporter;->currentGestureReporter:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/newrelic/agent/android/gestures/GestureReporter;

    return-object v0
.end method

.method static getGestureReporter(Landroid/app/Activity;)Lcom/newrelic/agent/android/gestures/GestureReporter;
    .locals 1

    .line 401
    sget-object v0, Lcom/newrelic/agent/android/gestures/GestureReporter;->gestureReporterMap:Ljava/util/Map;

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/newrelic/agent/android/gestures/GestureReporter;

    return-object p0
.end method

.method static invalidate(Landroid/app/Activity;)Lcom/newrelic/agent/android/gestures/GestureReporter;
    .locals 2

    .line 405
    sget-object v0, Lcom/newrelic/agent/android/gestures/GestureReporter;->gestureReporterMap:Ljava/util/Map;

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-interface {v0, p0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/newrelic/agent/android/gestures/GestureReporter;

    if-eqz p0, :cond_0

    .line 408
    invoke-virtual {p0}, Lcom/newrelic/agent/android/gestures/GestureReporter;->shutdown()V

    .line 411
    :cond_0
    sget-object v0, Lcom/newrelic/agent/android/gestures/GestureReporter;->currentGestureReporter:Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v1, 0x0

    invoke-virtual {v0, p0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    return-object p0
.end method

.method static provideGestureReporter(Landroid/app/Activity;Landroid/view/View;)Lcom/newrelic/agent/android/gestures/GestureReporter;
    .locals 2

    .line 389
    sget-object v0, Lcom/newrelic/agent/android/gestures/GestureReporter;->gestureReporterMap:Ljava/util/Map;

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 390
    sget-object v0, Lcom/newrelic/agent/android/gestures/GestureReporter;->currentGestureReporter:Ljava/util/concurrent/atomic/AtomicReference;

    new-instance v1, Lcom/newrelic/agent/android/gestures/GestureReporter;

    invoke-direct {v1, p0, p1}, Lcom/newrelic/agent/android/gestures/GestureReporter;-><init>(Landroid/app/Activity;Landroid/view/View;)V

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 391
    sget-object p1, Lcom/newrelic/agent/android/gestures/GestureReporter;->gestureReporterMap:Ljava/util/Map;

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    sget-object v1, Lcom/newrelic/agent/android/gestures/GestureReporter;->currentGestureReporter:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 393
    :cond_0
    sget-object p1, Lcom/newrelic/agent/android/gestures/GestureReporter;->gestureReporterMap:Ljava/util/Map;

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-interface {p1, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/newrelic/agent/android/gestures/GestureReporter;

    return-object p0
.end method

.method public static recordOnClick(Landroid/view/View;Ljava/util/Map;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 421
    invoke-static {}, Lcom/newrelic/agent/android/gestures/GestureReporter;->getGestureReporter()Lcom/newrelic/agent/android/gestures/GestureReporter;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 423
    new-instance v1, Lcom/newrelic/agent/android/gestures/GestureReporter$4;

    invoke-direct {v1, p0, v0, p1}, Lcom/newrelic/agent/android/gestures/GestureReporter$4;-><init>(Landroid/view/View;Lcom/newrelic/agent/android/gestures/GestureReporter;Ljava/util/Map;)V

    invoke-virtual {v0, v1}, Lcom/newrelic/agent/android/gestures/GestureReporter;->bg(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method public static recordOnLongClick(Landroid/view/View;Ljava/util/Map;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 438
    invoke-static {}, Lcom/newrelic/agent/android/gestures/GestureReporter;->getGestureReporter()Lcom/newrelic/agent/android/gestures/GestureReporter;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 440
    new-instance v1, Lcom/newrelic/agent/android/gestures/GestureReporter$5;

    invoke-direct {v1, p0, v0, p1}, Lcom/newrelic/agent/android/gestures/GestureReporter$5;-><init>(Landroid/view/View;Lcom/newrelic/agent/android/gestures/GestureReporter;Ljava/util/Map;)V

    invoke-virtual {v0, v1}, Lcom/newrelic/agent/android/gestures/GestureReporter;->bg(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method public static recordOnTouch(Landroid/view/View;Landroid/view/MotionEvent;Ljava/util/Map;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            "Landroid/view/MotionEvent;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 417
    sget-object p2, Lcom/newrelic/agent/android/gestures/GestureReporter;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "[Gesture] onTouch ["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "] MotionEvent["

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Landroid/view/MotionEvent;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "]"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-interface {p2, p0}, Lcom/newrelic/agent/android/logging/AgentLog;->audit(Ljava/lang/String;)V

    return-void
.end method

.method private resourceHasPackage(I)Z
    .locals 0

    ushr-int/lit8 p1, p1, 0x18

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method


# virtual methods
.method public addView(Landroid/view/View;)Ljava/util/Set;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            ")",
            "Ljava/util/Set<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation

    .line 83
    invoke-static {p1}, Lcom/newrelic/agent/android/gestures/GestureReporter;->gatherChildViews(Landroid/view/View;)Ljava/util/Set;

    move-result-object v0

    .line 85
    invoke-direct {p0, v0}, Lcom/newrelic/agent/android/gestures/GestureReporter;->attachChildTouchListeners(Ljava/util/Set;)V

    .line 86
    invoke-static {p1, p0}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnTouchListener(Landroid/view/View;Landroid/view/View$OnTouchListener;)V

    .line 88
    sget-object v1, Lcom/newrelic/agent/android/gestures/GestureReporter;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "[Gesture] Attached to view ["

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Landroid/view/View;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "]"

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v1, p1}, Lcom/newrelic/agent/android/logging/AgentLog;->debug(Ljava/lang/String;)V

    return-object v0
.end method

.method bg(Ljava/lang/Runnable;)V
    .locals 3

    .line 377
    :try_start_0
    iget-object v0, p0, Lcom/newrelic/agent/android/gestures/GestureReporter;->executor:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0, p1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 379
    sget-object v0, Lcom/newrelic/agent/android/gestures/GestureReporter;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "GestureReporter: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/newrelic/agent/android/logging/AgentLog;->warning(Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method protected createGestureControlAttributes(Lcom/newrelic/agent/android/instrumentation/ViewListeners$ListenerElement;)Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/newrelic/agent/android/instrumentation/ViewListeners$ListenerElement;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 251
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    if-eqz p1, :cond_0

    const-string v1, "targetObject"

    .line 254
    iget-object v2, p1, Lcom/newrelic/agent/android/instrumentation/ViewListeners$ListenerElement;->targetObject:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "methodExecuted"

    .line 255
    iget-object p1, p1, Lcom/newrelic/agent/android/instrumentation/ViewListeners$ListenerElement;->methodExecuted:Ljava/lang/String;

    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-object v0
.end method

.method protected createGestureMotionEventAttributes(Landroid/view/MotionEvent;)Ljava/util/Map;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/MotionEvent;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 196
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "touchCoordinates"

    const-string v2, "{%d,%d}"

    const/4 v3, 0x2

    .line 198
    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawX()F

    move-result v4

    float-to-int v4, v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawY()F

    move-result v4

    float-to-int v4, v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/4 v5, 0x1

    aput-object v4, v3, v5

    invoke-static {v2, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 200
    invoke-virtual {p0, p1}, Lcom/newrelic/agent/android/gestures/GestureReporter;->findViewByMotionEvent(Landroid/view/MotionEvent;)Landroid/view/View;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 202
    invoke-virtual {p0, p1}, Lcom/newrelic/agent/android/gestures/GestureReporter;->createGestureViewAttributes(Landroid/view/View;)Ljava/util/Map;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->putAll(Ljava/util/Map;)V

    :cond_0
    return-object v0
.end method

.method protected createGestureViewAttributes(Landroid/view/View;)Ljava/util/Map;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 209
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 211
    invoke-static {}, Lcom/newrelic/agent/android/Agent;->getImpl()Lcom/newrelic/agent/android/AgentImpl;

    move-result-object v1

    invoke-interface {v1}, Lcom/newrelic/agent/android/AgentImpl;->getEnvironmentInformation()Lcom/newrelic/agent/android/harvest/EnvironmentInformation;

    move-result-object v1

    invoke-virtual {v1}, Lcom/newrelic/agent/android/harvest/EnvironmentInformation;->getOrientation()I

    move-result v1

    const-string v2, "orientation"

    const/4 v3, 0x1

    if-ne v1, v3, :cond_0

    const-string v1, "Portrait"

    goto :goto_0

    :cond_0
    const-string v1, "Landscape"

    .line 212
    :goto_0
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz p1, :cond_3

    .line 215
    new-instance v1, Landroid/graphics/Rect;

    invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V

    .line 217
    invoke-virtual {p0, p1}, Lcom/newrelic/agent/android/gestures/GestureReporter;->generateGestureId(Landroid/view/View;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lcom/newrelic/agent/android/gestures/GestureReporter;->gestureId:Ljava/lang/String;

    .line 219
    invoke-virtual {p1, v1}, Landroid/view/View;->getGlobalVisibleRect(Landroid/graphics/Rect;)Z

    const-string v2, "controlId"

    .line 221
    iget-object v4, p0, Lcom/newrelic/agent/android/gestures/GestureReporter;->gestureId:Ljava/lang/String;

    invoke-virtual {v0, v2, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "controlClass"

    .line 222
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v2, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "controlRect"

    .line 223
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v4

    const-string v5, "{{%d,%d},{%d,%d}}"

    const/4 v6, 0x4

    new-array v6, v6, [Ljava/lang/Object;

    const/4 v7, 0x0

    iget v8, v1, Landroid/graphics/Rect;->left:I

    .line 224
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    aput-object v8, v6, v7

    iget v7, v1, Landroid/graphics/Rect;->top:I

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    aput-object v7, v6, v3

    const/4 v3, 0x2

    iget v7, v1, Landroid/graphics/Rect;->left:I

    invoke-virtual {v1}, Landroid/graphics/Rect;->width()I

    move-result v8

    add-int/2addr v7, v8

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    aput-object v7, v6, v3

    const/4 v3, 0x3

    iget v7, v1, Landroid/graphics/Rect;->top:I

    invoke-virtual {v1}, Landroid/graphics/Rect;->height()I

    move-result v1

    add-int/2addr v7, v1

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v6, v3

    .line 223
    invoke-static {v4, v5, v6}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 226
    invoke-virtual {p1}, Landroid/view/View;->getContentDescription()Ljava/lang/CharSequence;

    move-result-object v1

    if-eqz v1, :cond_1

    const-string v1, "contentDescription"

    .line 227
    invoke-virtual {p1}, Landroid/view/View;->getContentDescription()Ljava/lang/CharSequence;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 230
    :cond_1
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    invoke-static {v1}, Lcom/newrelic/agent/android/instrumentation/ViewListeners;->getListenerElement(I)Lcom/newrelic/agent/android/instrumentation/ViewListeners$ListenerElement;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 232
    invoke-virtual {p0, v1}, Lcom/newrelic/agent/android/gestures/GestureReporter;->createGestureControlAttributes(Lcom/newrelic/agent/android/instrumentation/ViewListeners$ListenerElement;)Ljava/util/Map;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->putAll(Ljava/util/Map;)V

    .line 235
    :cond_2
    const-class v1, Landroid/widget/TextView;

    invoke-static {p1, v1}, Lcom/newrelic/agent/android/gestures/GestureObserver;->isSubClassOf(Ljava/lang/Object;Ljava/lang/Class;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 237
    :try_start_0
    check-cast p1, Landroid/widget/TextView;

    .line 238
    invoke-virtual {p1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p1

    .line 239
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_3

    const-string v1, "label"

    .line 240
    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_3
    return-object v0
.end method

.method protected findViewByMotionEvent(Landroid/view/MotionEvent;)Landroid/view/View;
    .locals 5

    .line 361
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 362
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawX()F

    move-result v1

    float-to-int v1, v1

    .line 363
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawY()F

    move-result p1

    float-to-int p1, p1

    .line 364
    iget-object v2, p0, Lcom/newrelic/agent/android/gestures/GestureReporter;->controlCache:Ljava/util/HashMap;

    invoke-virtual {v2}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/view/View;

    .line 365
    invoke-virtual {v3, v0}, Landroid/view/View;->getGlobalVisibleRect(Landroid/graphics/Rect;)Z

    .line 366
    invoke-virtual {v0, v1, p1}, Landroid/graphics/Rect;->contains(II)Z

    move-result v4

    if-eqz v4, :cond_0

    goto :goto_0

    :cond_1
    const/4 v3, 0x0

    :goto_0
    return-object v3
.end method

.method protected generateGestureId(Landroid/view/View;)Ljava/lang/String;
    .locals 4

    .line 315
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->toString()Ljava/lang/String;

    .line 317
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_3

    .line 319
    new-instance v1, Ljava/lang/StringBuilder;

    const/16 v2, 0x400

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 320
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0x7b

    .line 321
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 322
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    .line 323
    invoke-direct {p0, v0}, Lcom/newrelic/agent/android/gestures/GestureReporter;->resourceHasPackage(I)Z

    move-result v2

    if-eqz v2, :cond_2

    if-eqz p1, :cond_2

    const/high16 v2, -0x1000000

    and-int/2addr v2, v0

    const/high16 v3, 0x1000000

    if-eq v2, v3, :cond_1

    const/high16 v3, 0x7f000000

    if-eq v2, v3, :cond_0

    .line 334
    :try_start_0
    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getResourcePackageName(I)Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_0
    const-string v2, "app"

    goto :goto_0

    :cond_1
    const-string v2, "android"

    .line 337
    :goto_0
    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getResourceTypeName(I)Ljava/lang/String;

    move-result-object v3

    .line 338
    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getResourceEntryName(I)Ljava/lang/String;

    move-result-object p1

    .line 339
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ":"

    .line 340
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 341
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "/"

    .line 342
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 343
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_2
    const-string p1, "}"

    .line 347
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 349
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_1

    .line 352
    :cond_3
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object p1

    :goto_1
    return-object p1
.end method

.method public onDoubleTap(Landroid/view/MotionEvent;)Z
    .locals 1

    .line 134
    new-instance v0, Lcom/newrelic/agent/android/gestures/GestureReporter$3;

    invoke-direct {v0, p0, p1}, Lcom/newrelic/agent/android/gestures/GestureReporter$3;-><init>(Lcom/newrelic/agent/android/gestures/GestureReporter;Landroid/view/MotionEvent;)V

    invoke-virtual {p0, v0}, Lcom/newrelic/agent/android/gestures/GestureReporter;->bg(Ljava/lang/Runnable;)V

    const/4 p1, 0x0

    return p1
.end method

.method public onDown(Landroid/view/MotionEvent;)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

.method public onFling(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z
    .locals 7

    .line 106
    new-instance v6, Lcom/newrelic/agent/android/gestures/GestureReporter$1;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    move v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/newrelic/agent/android/gestures/GestureReporter$1;-><init>(Lcom/newrelic/agent/android/gestures/GestureReporter;Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)V

    invoke-virtual {p0, v6}, Lcom/newrelic/agent/android/gestures/GestureReporter;->bg(Ljava/lang/Runnable;)V

    const/4 p1, 0x0

    return p1
.end method

.method public onSingleTapConfirmed(Landroid/view/MotionEvent;)Z
    .locals 1

    .line 120
    new-instance v0, Lcom/newrelic/agent/android/gestures/GestureReporter$2;

    invoke-direct {v0, p0, p1}, Lcom/newrelic/agent/android/gestures/GestureReporter$2;-><init>(Lcom/newrelic/agent/android/gestures/GestureReporter;Landroid/view/MotionEvent;)V

    invoke-virtual {p0, v0}, Lcom/newrelic/agent/android/gestures/GestureReporter;->bg(Ljava/lang/Runnable;)V

    const/4 p1, 0x0

    return p1
.end method

.method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 0

    .line 100
    iget-object p1, p0, Lcom/newrelic/agent/android/gestures/GestureReporter;->detector:Landroid/support/v4/view/GestureDetectorCompat;

    invoke-virtual {p1, p2}, Landroid/support/v4/view/GestureDetectorCompat;->onTouchEvent(Landroid/view/MotionEvent;)Z

    const/4 p1, 0x0

    return p1
.end method

.method protected shouldTrackControl(Landroid/view/View;)Z
    .locals 2

    .line 263
    :try_start_0
    sget-object v0, Lcom/newrelic/agent/android/gestures/GestureReporter;->supportedClasses:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Class;

    .line 264
    invoke-static {p1, v1}, Lcom/newrelic/agent/android/gestures/GestureObserver;->isSubClassOf(Ljava/lang/Object;Ljava/lang/Class;)Z

    move-result v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v1, :cond_0

    const/4 p1, 0x1

    return p1

    :catch_0
    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public shutdown()V
    .locals 1

    .line 76
    :try_start_0
    iget-object v0, p0, Lcom/newrelic/agent/android/gestures/GestureReporter;->executor:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 77
    iget-object v0, p0, Lcom/newrelic/agent/android/gestures/GestureReporter;->controlCache:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method
