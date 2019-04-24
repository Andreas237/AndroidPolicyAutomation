.class public Lcom/ibotta/android/tracking/proprietary/persistence/room/TrackingBodyConverter;
.super Ljava/lang/Object;
.source "TrackingBodyConverter.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/tracking/proprietary/persistence/room/TrackingBodyConverter$TrackingBodyConverterException;
    }
.end annotation


# instance fields
.field ibottaJson:Lcom/ibotta/android/json/IbottaJson;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field


# direct methods
.method constructor <init>()V
    .locals 1

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    invoke-static {}, Lcom/ibotta/android/tracking/IbottaTracking;->getTrackingComponent()Lcom/ibotta/android/tracking/di/TrackingComponent;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/ibotta/android/tracking/di/TrackingComponent;->inject(Lcom/ibotta/android/tracking/proprietary/persistence/room/TrackingBodyConverter;)V

    return-void
.end method

.method private handleException(Ljava/lang/String;Lcom/ibotta/android/json/IbottaJsonException;)V
    .locals 3

    const/4 v0, 0x0

    .line 42
    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p2, p1, v0}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 43
    invoke-static {}, Lcom/ibotta/android/tracking/IbottaTracking;->getExceptionReporter()Lcom/ibotta/android/abstractions/ExceptionReporter;

    move-result-object v0

    new-instance v1, Lcom/ibotta/android/tracking/proprietary/persistence/room/TrackingBodyConverter$TrackingBodyConverterException;

    const/4 v2, 0x0

    invoke-direct {v1, p1, p2, v2}, Lcom/ibotta/android/tracking/proprietary/persistence/room/TrackingBodyConverter$TrackingBodyConverterException;-><init>(Ljava/lang/String;Ljava/lang/Exception;Lcom/ibotta/android/tracking/proprietary/persistence/room/TrackingBodyConverter$1;)V

    invoke-interface {v0, v1}, Lcom/ibotta/android/abstractions/ExceptionReporter;->accept(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public fromString(Ljava/lang/String;)Lcom/ibotta/tracking/generated/model/Body;
    .locals 4
    .annotation build Landroid/arch/persistence/room/TypeConverter;
    .end annotation

    .line 34
    :try_start_0
    iget-object v0, p0, Lcom/ibotta/android/tracking/proprietary/persistence/room/TrackingBodyConverter;->ibottaJson:Lcom/ibotta/android/json/IbottaJson;

    const-class v1, Lcom/ibotta/tracking/generated/model/Body;

    invoke-interface {v0, p1, v1}, Lcom/ibotta/android/json/IbottaJson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/tracking/generated/model/Body;
    :try_end_0
    .catch Lcom/ibotta/android/json/IbottaJsonException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    const-string v1, "Failed to deserialize: %s"

    const/4 v2, 0x1

    .line 36
    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/tracking/proprietary/persistence/room/TrackingBodyConverter;->handleException(Ljava/lang/String;Lcom/ibotta/android/json/IbottaJsonException;)V

    .line 37
    new-instance p1, Lcom/ibotta/tracking/generated/model/Body;

    invoke-direct {p1}, Lcom/ibotta/tracking/generated/model/Body;-><init>()V

    return-object p1
.end method

.method public toString(Lcom/ibotta/tracking/generated/model/Body;)Ljava/lang/String;
    .locals 4
    .annotation build Landroid/arch/persistence/room/TypeConverter;
    .end annotation

    .line 24
    :try_start_0
    iget-object v0, p0, Lcom/ibotta/android/tracking/proprietary/persistence/room/TrackingBodyConverter;->ibottaJson:Lcom/ibotta/android/json/IbottaJson;

    invoke-interface {v0, p1}, Lcom/ibotta/android/json/IbottaJson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catch Lcom/ibotta/android/json/IbottaJsonException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception v0

    const-string v1, "Failed to serialize: %s"

    const/4 v2, 0x1

    .line 26
    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-virtual {p1}, Lcom/ibotta/tracking/generated/model/Body;->toString()Ljava/lang/String;

    move-result-object p1

    aput-object p1, v2, v3

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/tracking/proprietary/persistence/room/TrackingBodyConverter;->handleException(Ljava/lang/String;Lcom/ibotta/android/json/IbottaJsonException;)V

    const-string p1, ""

    return-object p1
.end method
