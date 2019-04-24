.class public abstract Lcom/ibotta/android/mvp/ui/misc/DebouncedViewOnClickListener;
.super Ljava/lang/Object;
.source "DebouncedViewOnClickListener.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# static fields
.field private static final DEFAULT_WAIT_TIME:Ljava/lang/Long;


# instance fields
.field private appHelper:Lcom/ibotta/android/util/AppHelper;

.field private debounceWaitTime:Ljava/lang/Long;

.field private final viewTimeMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Landroid/view/View;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 16
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x320

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    sput-object v0, Lcom/ibotta/android/mvp/ui/misc/DebouncedViewOnClickListener;->DEFAULT_WAIT_TIME:Ljava/lang/Long;

    return-void
.end method

.method public constructor <init>(Lcom/ibotta/android/util/AppHelper;)V
    .locals 1

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    new-instance v0, Ljava/util/WeakHashMap;

    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/misc/DebouncedViewOnClickListener;->viewTimeMap:Ljava/util/Map;

    .line 23
    sget-object v0, Lcom/ibotta/android/mvp/ui/misc/DebouncedViewOnClickListener;->DEFAULT_WAIT_TIME:Ljava/lang/Long;

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/misc/DebouncedViewOnClickListener;->debounceWaitTime:Ljava/lang/Long;

    .line 24
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/misc/DebouncedViewOnClickListener;->appHelper:Lcom/ibotta/android/util/AppHelper;

    return-void
.end method

.method public constructor <init>(Lcom/ibotta/android/util/AppHelper;Ljava/lang/Long;)V
    .locals 1

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    new-instance v0, Ljava/util/WeakHashMap;

    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/misc/DebouncedViewOnClickListener;->viewTimeMap:Ljava/util/Map;

    .line 28
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/misc/DebouncedViewOnClickListener;->debounceWaitTime:Ljava/lang/Long;

    .line 29
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/misc/DebouncedViewOnClickListener;->appHelper:Lcom/ibotta/android/util/AppHelper;

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 5

    .line 36
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/misc/DebouncedViewOnClickListener;->appHelper:Lcom/ibotta/android/util/AppHelper;

    invoke-interface {v0}, Lcom/ibotta/android/util/AppHelper;->getCurrentTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    .line 37
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/misc/DebouncedViewOnClickListener;->viewTimeMap:Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Long;

    .line 39
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/misc/DebouncedViewOnClickListener;->viewTimeMap:Ljava/util/Map;

    invoke-interface {v2, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz v1, :cond_0

    .line 41
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    sub-long/2addr v2, v0

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/misc/DebouncedViewOnClickListener;->debounceWaitTime:Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    cmp-long v4, v2, v0

    if-lez v4, :cond_1

    .line 42
    :cond_0
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/misc/DebouncedViewOnClickListener;->onDebouncedClick(Landroid/view/View;)V

    :cond_1
    return-void
.end method

.method public abstract onDebouncedClick(Landroid/view/View;)V
.end method
