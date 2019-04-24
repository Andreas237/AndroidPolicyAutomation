.class public final synthetic Lcom/ibotta/android/di/-$$Lambda$TrackingModule$rYafmZtzBJrOaIUY70JVUkutERE;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lcom/ibotta/android/tracking/EventContextProvider;


# static fields
.field public static final synthetic INSTANCE:Lcom/ibotta/android/di/-$$Lambda$TrackingModule$rYafmZtzBJrOaIUY70JVUkutERE;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/ibotta/android/di/-$$Lambda$TrackingModule$rYafmZtzBJrOaIUY70JVUkutERE;

    invoke-direct {v0}, Lcom/ibotta/android/di/-$$Lambda$TrackingModule$rYafmZtzBJrOaIUY70JVUkutERE;-><init>()V

    sput-object v0, Lcom/ibotta/android/di/-$$Lambda$TrackingModule$rYafmZtzBJrOaIUY70JVUkutERE;->INSTANCE:Lcom/ibotta/android/di/-$$Lambda$TrackingModule$rYafmZtzBJrOaIUY70JVUkutERE;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;

    invoke-static {p1}, Lcom/ibotta/android/di/TrackingModule;->lambda$provideCategoryEventContextProvider$7(Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V

    return-void
.end method

.method public synthetic andThen(Ljava9/util/function/Consumer;)Ljava9/util/function/Consumer;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava9/util/function/Consumer<",
            "-TT;>;)",
            "Ljava9/util/function/Consumer<",
            "TT;>;"
        }
    .end annotation

    invoke-static {p0, p1}, Ljava9/util/function/Consumer$-CC;->$default$andThen(Ljava9/util/function/Consumer;Ljava9/util/function/Consumer;)Ljava9/util/function/Consumer;

    move-result-object p1

    return-object p1
.end method

.method public synthetic provideContext(Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/ibotta/android/tracking/EventContextProvider$-CC;->$default$provideContext(Lcom/ibotta/android/tracking/EventContextProvider;Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V

    return-void
.end method
