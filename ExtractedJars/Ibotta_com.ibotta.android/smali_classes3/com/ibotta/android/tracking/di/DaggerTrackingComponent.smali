.class public final Lcom/ibotta/android/tracking/di/DaggerTrackingComponent;
.super Ljava/lang/Object;
.source "DaggerTrackingComponent.java"

# interfaces
.implements Lcom/ibotta/android/tracking/di/TrackingComponent;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/tracking/di/DaggerTrackingComponent$Builder;
    }
.end annotation


# instance fields
.field private exceptionReporter:Lcom/ibotta/android/abstractions/ExceptionReporter;

.field private provideIbottaJsonProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/json/IbottaJson;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Lcom/ibotta/android/tracking/di/DaggerTrackingComponent$Builder;)V
    .locals 0

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    invoke-direct {p0, p1}, Lcom/ibotta/android/tracking/di/DaggerTrackingComponent;->initialize(Lcom/ibotta/android/tracking/di/DaggerTrackingComponent$Builder;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/ibotta/android/tracking/di/DaggerTrackingComponent$Builder;Lcom/ibotta/android/tracking/di/DaggerTrackingComponent$1;)V
    .locals 0

    .line 12
    invoke-direct {p0, p1}, Lcom/ibotta/android/tracking/di/DaggerTrackingComponent;-><init>(Lcom/ibotta/android/tracking/di/DaggerTrackingComponent$Builder;)V

    return-void
.end method

.method public static builder()Lcom/ibotta/android/tracking/di/TrackingComponent$Builder;
    .locals 2

    .line 22
    new-instance v0, Lcom/ibotta/android/tracking/di/DaggerTrackingComponent$Builder;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/ibotta/android/tracking/di/DaggerTrackingComponent$Builder;-><init>(Lcom/ibotta/android/tracking/di/DaggerTrackingComponent$1;)V

    return-object v0
.end method

.method private initialize(Lcom/ibotta/android/tracking/di/DaggerTrackingComponent$Builder;)V
    .locals 1

    .line 28
    invoke-static {p1}, Lcom/ibotta/android/tracking/di/DaggerTrackingComponent$Builder;->access$100(Lcom/ibotta/android/tracking/di/DaggerTrackingComponent$Builder;)Lcom/ibotta/android/tracking/di/JsonModule;

    move-result-object v0

    invoke-static {v0}, Lcom/ibotta/android/tracking/di/JsonModule_ProvideIbottaJsonFactory;->create(Lcom/ibotta/android/tracking/di/JsonModule;)Lcom/ibotta/android/tracking/di/JsonModule_ProvideIbottaJsonFactory;

    move-result-object v0

    invoke-static {v0}, Ldagger/internal/SingleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/tracking/di/DaggerTrackingComponent;->provideIbottaJsonProvider:Ljavax/inject/Provider;

    .line 29
    invoke-static {p1}, Lcom/ibotta/android/tracking/di/DaggerTrackingComponent$Builder;->access$200(Lcom/ibotta/android/tracking/di/DaggerTrackingComponent$Builder;)Lcom/ibotta/android/abstractions/ExceptionReporter;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/tracking/di/DaggerTrackingComponent;->exceptionReporter:Lcom/ibotta/android/abstractions/ExceptionReporter;

    return-void
.end method

.method private injectTrackingBodyConverter(Lcom/ibotta/android/tracking/proprietary/persistence/room/TrackingBodyConverter;)Lcom/ibotta/android/tracking/proprietary/persistence/room/TrackingBodyConverter;
    .locals 1

    .line 43
    iget-object v0, p0, Lcom/ibotta/android/tracking/di/DaggerTrackingComponent;->provideIbottaJsonProvider:Ljavax/inject/Provider;

    .line 44
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/json/IbottaJson;

    .line 43
    invoke-static {p1, v0}, Lcom/ibotta/android/tracking/proprietary/persistence/room/TrackingBodyConverter_MembersInjector;->injectIbottaJson(Lcom/ibotta/android/tracking/proprietary/persistence/room/TrackingBodyConverter;Lcom/ibotta/android/json/IbottaJson;)V

    return-object p1
.end method


# virtual methods
.method public getExceptionReporter()Lcom/ibotta/android/abstractions/ExceptionReporter;
    .locals 1

    .line 39
    iget-object v0, p0, Lcom/ibotta/android/tracking/di/DaggerTrackingComponent;->exceptionReporter:Lcom/ibotta/android/abstractions/ExceptionReporter;

    return-object v0
.end method

.method public inject(Lcom/ibotta/android/tracking/proprietary/persistence/room/TrackingBodyConverter;)V
    .locals 0

    .line 34
    invoke-direct {p0, p1}, Lcom/ibotta/android/tracking/di/DaggerTrackingComponent;->injectTrackingBodyConverter(Lcom/ibotta/android/tracking/proprietary/persistence/room/TrackingBodyConverter;)Lcom/ibotta/android/tracking/proprietary/persistence/room/TrackingBodyConverter;

    return-void
.end method
