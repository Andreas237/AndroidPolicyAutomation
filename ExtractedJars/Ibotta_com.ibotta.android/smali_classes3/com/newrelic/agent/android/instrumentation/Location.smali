.class public Lcom/newrelic/agent/android/instrumentation/Location;
.super Ljava/lang/Object;
.source "Location.java"


# instance fields
.field private final countryCode:Ljava/lang/String;

.field private final region:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_0

    if-eqz p2, :cond_0

    .line 11
    iput-object p1, p0, Lcom/newrelic/agent/android/instrumentation/Location;->countryCode:Ljava/lang/String;

    .line 12
    iput-object p2, p0, Lcom/newrelic/agent/android/instrumentation/Location;->region:Ljava/lang/String;

    return-void

    .line 9
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Country code and region must not be null."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public getCountryCode()Ljava/lang/String;
    .locals 1

    .line 16
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/Location;->countryCode:Ljava/lang/String;

    return-object v0
.end method

.method public getRegion()Ljava/lang/String;
    .locals 1

    .line 20
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/Location;->region:Ljava/lang/String;

    return-object v0
.end method
