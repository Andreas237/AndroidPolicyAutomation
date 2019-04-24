.class public final enum Lcom/ibotta/android/tracking/IbottaTracking;
.super Ljava/lang/Enum;
.source "IbottaTracking.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/ibotta/android/tracking/IbottaTracking;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/ibotta/android/tracking/IbottaTracking;

.field public static final enum INSTANCE:Lcom/ibotta/android/tracking/IbottaTracking;

.field private static TRACKING_COMPONENT:Lcom/ibotta/android/tracking/di/TrackingComponent;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 10
    new-instance v0, Lcom/ibotta/android/tracking/IbottaTracking;

    const-string v1, "INSTANCE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/ibotta/android/tracking/IbottaTracking;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/tracking/IbottaTracking;->INSTANCE:Lcom/ibotta/android/tracking/IbottaTracking;

    const/4 v0, 0x1

    .line 9
    new-array v0, v0, [Lcom/ibotta/android/tracking/IbottaTracking;

    sget-object v1, Lcom/ibotta/android/tracking/IbottaTracking;->INSTANCE:Lcom/ibotta/android/tracking/IbottaTracking;

    aput-object v1, v0, v2

    sput-object v0, Lcom/ibotta/android/tracking/IbottaTracking;->$VALUES:[Lcom/ibotta/android/tracking/IbottaTracking;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 9
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static getExceptionReporter()Lcom/ibotta/android/abstractions/ExceptionReporter;
    .locals 1

    .line 27
    sget-object v0, Lcom/ibotta/android/tracking/IbottaTracking;->TRACKING_COMPONENT:Lcom/ibotta/android/tracking/di/TrackingComponent;

    invoke-interface {v0}, Lcom/ibotta/android/tracking/di/TrackingComponent;->getExceptionReporter()Lcom/ibotta/android/abstractions/ExceptionReporter;

    move-result-object v0

    return-object v0
.end method

.method public static getTrackingComponent()Lcom/ibotta/android/tracking/di/TrackingComponent;
    .locals 1

    .line 23
    sget-object v0, Lcom/ibotta/android/tracking/IbottaTracking;->TRACKING_COMPONENT:Lcom/ibotta/android/tracking/di/TrackingComponent;

    return-object v0
.end method

.method public static init(Lcom/ibotta/android/tracking/di/TrackingComponent;)V
    .locals 0

    .line 19
    sput-object p0, Lcom/ibotta/android/tracking/IbottaTracking;->TRACKING_COMPONENT:Lcom/ibotta/android/tracking/di/TrackingComponent;

    return-void
.end method

.method public static init(Ljava9/util/function/Consumer;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava9/util/function/Consumer<",
            "Ljava/lang/Exception;",
            ">;)V"
        }
    .end annotation

    .line 15
    invoke-static {}, Lcom/ibotta/android/tracking/di/DaggerTrackingComponent;->builder()Lcom/ibotta/android/tracking/di/TrackingComponent$Builder;

    move-result-object v0

    invoke-static {p0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lcom/ibotta/android/tracking/-$$Lambda$ijbHywh5WJRqjcL6WHALjH09B7I;

    invoke-direct {v1, p0}, Lcom/ibotta/android/tracking/-$$Lambda$ijbHywh5WJRqjcL6WHALjH09B7I;-><init>(Ljava9/util/function/Consumer;)V

    invoke-interface {v0, v1}, Lcom/ibotta/android/tracking/di/TrackingComponent$Builder;->exceptionReporter(Lcom/ibotta/android/abstractions/ExceptionReporter;)Lcom/ibotta/android/tracking/di/TrackingComponent$Builder;

    move-result-object p0

    invoke-interface {p0}, Lcom/ibotta/android/tracking/di/TrackingComponent$Builder;->build()Lcom/ibotta/android/tracking/di/TrackingComponent;

    move-result-object p0

    sput-object p0, Lcom/ibotta/android/tracking/IbottaTracking;->TRACKING_COMPONENT:Lcom/ibotta/android/tracking/di/TrackingComponent;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ibotta/android/tracking/IbottaTracking;
    .locals 1

    .line 9
    const-class v0, Lcom/ibotta/android/tracking/IbottaTracking;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/tracking/IbottaTracking;

    return-object p0
.end method

.method public static values()[Lcom/ibotta/android/tracking/IbottaTracking;
    .locals 1

    .line 9
    sget-object v0, Lcom/ibotta/android/tracking/IbottaTracking;->$VALUES:[Lcom/ibotta/android/tracking/IbottaTracking;

    invoke-virtual {v0}, [Lcom/ibotta/android/tracking/IbottaTracking;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ibotta/android/tracking/IbottaTracking;

    return-object v0
.end method
