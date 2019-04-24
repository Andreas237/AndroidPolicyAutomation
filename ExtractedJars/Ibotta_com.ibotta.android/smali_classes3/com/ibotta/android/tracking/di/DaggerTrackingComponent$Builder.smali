.class final Lcom/ibotta/android/tracking/di/DaggerTrackingComponent$Builder;
.super Ljava/lang/Object;
.source "DaggerTrackingComponent.java"

# interfaces
.implements Lcom/ibotta/android/tracking/di/TrackingComponent$Builder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/tracking/di/DaggerTrackingComponent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "Builder"
.end annotation


# instance fields
.field private exceptionReporter:Lcom/ibotta/android/abstractions/ExceptionReporter;

.field private jsonModule:Lcom/ibotta/android/tracking/di/JsonModule;


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 48
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/ibotta/android/tracking/di/DaggerTrackingComponent$1;)V
    .locals 0

    .line 48
    invoke-direct {p0}, Lcom/ibotta/android/tracking/di/DaggerTrackingComponent$Builder;-><init>()V

    return-void
.end method

.method static synthetic access$100(Lcom/ibotta/android/tracking/di/DaggerTrackingComponent$Builder;)Lcom/ibotta/android/tracking/di/JsonModule;
    .locals 0

    .line 48
    iget-object p0, p0, Lcom/ibotta/android/tracking/di/DaggerTrackingComponent$Builder;->jsonModule:Lcom/ibotta/android/tracking/di/JsonModule;

    return-object p0
.end method

.method static synthetic access$200(Lcom/ibotta/android/tracking/di/DaggerTrackingComponent$Builder;)Lcom/ibotta/android/abstractions/ExceptionReporter;
    .locals 0

    .line 48
    iget-object p0, p0, Lcom/ibotta/android/tracking/di/DaggerTrackingComponent$Builder;->exceptionReporter:Lcom/ibotta/android/abstractions/ExceptionReporter;

    return-object p0
.end method


# virtual methods
.method public build()Lcom/ibotta/android/tracking/di/TrackingComponent;
    .locals 3

    .line 55
    iget-object v0, p0, Lcom/ibotta/android/tracking/di/DaggerTrackingComponent$Builder;->jsonModule:Lcom/ibotta/android/tracking/di/JsonModule;

    if-nez v0, :cond_0

    .line 56
    new-instance v0, Lcom/ibotta/android/tracking/di/JsonModule;

    invoke-direct {v0}, Lcom/ibotta/android/tracking/di/JsonModule;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/tracking/di/DaggerTrackingComponent$Builder;->jsonModule:Lcom/ibotta/android/tracking/di/JsonModule;

    .line 58
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/tracking/di/DaggerTrackingComponent$Builder;->exceptionReporter:Lcom/ibotta/android/abstractions/ExceptionReporter;

    if-eqz v0, :cond_1

    .line 62
    new-instance v0, Lcom/ibotta/android/tracking/di/DaggerTrackingComponent;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/ibotta/android/tracking/di/DaggerTrackingComponent;-><init>(Lcom/ibotta/android/tracking/di/DaggerTrackingComponent$Builder;Lcom/ibotta/android/tracking/di/DaggerTrackingComponent$1;)V

    return-object v0

    .line 59
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-class v2, Lcom/ibotta/android/abstractions/ExceptionReporter;

    .line 60
    invoke-virtual {v2}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " must be set"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public exceptionReporter(Lcom/ibotta/android/abstractions/ExceptionReporter;)Lcom/ibotta/android/tracking/di/DaggerTrackingComponent$Builder;
    .locals 0

    .line 67
    invoke-static {p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/abstractions/ExceptionReporter;

    iput-object p1, p0, Lcom/ibotta/android/tracking/di/DaggerTrackingComponent$Builder;->exceptionReporter:Lcom/ibotta/android/abstractions/ExceptionReporter;

    return-object p0
.end method

.method public bridge synthetic exceptionReporter(Lcom/ibotta/android/abstractions/ExceptionReporter;)Lcom/ibotta/android/tracking/di/TrackingComponent$Builder;
    .locals 0

    .line 48
    invoke-virtual {p0, p1}, Lcom/ibotta/android/tracking/di/DaggerTrackingComponent$Builder;->exceptionReporter(Lcom/ibotta/android/abstractions/ExceptionReporter;)Lcom/ibotta/android/tracking/di/DaggerTrackingComponent$Builder;

    move-result-object p1

    return-object p1
.end method

.method public jsonModule(Lcom/ibotta/android/tracking/di/JsonModule;)Lcom/ibotta/android/tracking/di/DaggerTrackingComponent$Builder;
    .locals 0

    .line 73
    invoke-static {p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/tracking/di/JsonModule;

    iput-object p1, p0, Lcom/ibotta/android/tracking/di/DaggerTrackingComponent$Builder;->jsonModule:Lcom/ibotta/android/tracking/di/JsonModule;

    return-object p0
.end method

.method public bridge synthetic jsonModule(Lcom/ibotta/android/tracking/di/JsonModule;)Lcom/ibotta/android/tracking/di/TrackingComponent$Builder;
    .locals 0

    .line 48
    invoke-virtual {p0, p1}, Lcom/ibotta/android/tracking/di/DaggerTrackingComponent$Builder;->jsonModule(Lcom/ibotta/android/tracking/di/JsonModule;)Lcom/ibotta/android/tracking/di/DaggerTrackingComponent$Builder;

    move-result-object p1

    return-object p1
.end method
