.class public final synthetic Lcom/ibotta/android/mvp/ui/activity/debug/feature/-$$Lambda$DebugFeatureFlagsPresenterImpl$vd8adtmwysDi2ZZdTUjCl_9hb18;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava/util/Comparator;


# static fields
.field public static final synthetic INSTANCE:Lcom/ibotta/android/mvp/ui/activity/debug/feature/-$$Lambda$DebugFeatureFlagsPresenterImpl$vd8adtmwysDi2ZZdTUjCl_9hb18;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/-$$Lambda$DebugFeatureFlagsPresenterImpl$vd8adtmwysDi2ZZdTUjCl_9hb18;

    invoke-direct {v0}, Lcom/ibotta/android/mvp/ui/activity/debug/feature/-$$Lambda$DebugFeatureFlagsPresenterImpl$vd8adtmwysDi2ZZdTUjCl_9hb18;-><init>()V

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/-$$Lambda$DebugFeatureFlagsPresenterImpl$vd8adtmwysDi2ZZdTUjCl_9hb18;->INSTANCE:Lcom/ibotta/android/mvp/ui/activity/debug/feature/-$$Lambda$DebugFeatureFlagsPresenterImpl$vd8adtmwysDi2ZZdTUjCl_9hb18;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lcom/ibotta/android/views/debug/DebugFeatureFlagRowViewState;

    check-cast p2, Lcom/ibotta/android/views/debug/DebugFeatureFlagRowViewState;

    invoke-static {p1, p2}, Lcom/ibotta/android/mvp/ui/activity/debug/feature/DebugFeatureFlagsPresenterImpl;->lambda$onStart$0(Lcom/ibotta/android/views/debug/DebugFeatureFlagRowViewState;Lcom/ibotta/android/views/debug/DebugFeatureFlagRowViewState;)I

    move-result p1

    return p1
.end method
