.class public final Lio/radar/sdk/di/DaggerRadarComponent$Builder;
.super Ljava/lang/Object;
.source "DaggerRadarComponent.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/radar/sdk/di/DaggerRadarComponent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation


# instance fields
.field private coreModule:Lio/radar/sdk/di/CoreModule;


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 155
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lio/radar/sdk/di/DaggerRadarComponent$1;)V
    .locals 0

    .line 152
    invoke-direct {p0}, Lio/radar/sdk/di/DaggerRadarComponent$Builder;-><init>()V

    return-void
.end method

.method static synthetic access$100(Lio/radar/sdk/di/DaggerRadarComponent$Builder;)Lio/radar/sdk/di/CoreModule;
    .locals 0

    .line 152
    iget-object p0, p0, Lio/radar/sdk/di/DaggerRadarComponent$Builder;->coreModule:Lio/radar/sdk/di/CoreModule;

    return-object p0
.end method


# virtual methods
.method public build()Lio/radar/sdk/di/RadarComponent;
    .locals 3

    .line 158
    iget-object v0, p0, Lio/radar/sdk/di/DaggerRadarComponent$Builder;->coreModule:Lio/radar/sdk/di/CoreModule;

    if-eqz v0, :cond_0

    .line 161
    new-instance v0, Lio/radar/sdk/di/DaggerRadarComponent;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lio/radar/sdk/di/DaggerRadarComponent;-><init>(Lio/radar/sdk/di/DaggerRadarComponent$Builder;Lio/radar/sdk/di/DaggerRadarComponent$1;)V

    return-object v0

    .line 159
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-class v2, Lio/radar/sdk/di/CoreModule;

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

.method public coreModule(Lio/radar/sdk/di/CoreModule;)Lio/radar/sdk/di/DaggerRadarComponent$Builder;
    .locals 0

    .line 165
    invoke-static {p1}, Lio/radar/shadow/dagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/radar/sdk/di/CoreModule;

    iput-object p1, p0, Lio/radar/sdk/di/DaggerRadarComponent$Builder;->coreModule:Lio/radar/sdk/di/CoreModule;

    return-object p0
.end method
