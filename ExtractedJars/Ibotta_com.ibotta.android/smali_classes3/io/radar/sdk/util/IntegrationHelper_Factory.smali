.class public final Lio/radar/sdk/util/IntegrationHelper_Factory;
.super Ljava/lang/Object;
.source "IntegrationHelper_Factory.java"

# interfaces
.implements Lio/radar/shadow/dagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lio/radar/shadow/dagger/internal/Factory<",
        "Lio/radar/sdk/util/IntegrationHelper;",
        ">;"
    }
.end annotation


# static fields
.field private static final INSTANCE:Lio/radar/sdk/util/IntegrationHelper_Factory;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 7
    new-instance v0, Lio/radar/sdk/util/IntegrationHelper_Factory;

    invoke-direct {v0}, Lio/radar/sdk/util/IntegrationHelper_Factory;-><init>()V

    sput-object v0, Lio/radar/sdk/util/IntegrationHelper_Factory;->INSTANCE:Lio/radar/sdk/util/IntegrationHelper_Factory;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static create()Lio/radar/sdk/util/IntegrationHelper_Factory;
    .locals 1

    .line 19
    sget-object v0, Lio/radar/sdk/util/IntegrationHelper_Factory;->INSTANCE:Lio/radar/sdk/util/IntegrationHelper_Factory;

    return-object v0
.end method

.method public static provideInstance()Lio/radar/sdk/util/IntegrationHelper;
    .locals 1

    .line 15
    new-instance v0, Lio/radar/sdk/util/IntegrationHelper;

    invoke-direct {v0}, Lio/radar/sdk/util/IntegrationHelper;-><init>()V

    return-object v0
.end method


# virtual methods
.method public get()Lio/radar/sdk/util/IntegrationHelper;
    .locals 1

    .line 11
    invoke-static {}, Lio/radar/sdk/util/IntegrationHelper_Factory;->provideInstance()Lio/radar/sdk/util/IntegrationHelper;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 6
    invoke-virtual {p0}, Lio/radar/sdk/util/IntegrationHelper_Factory;->get()Lio/radar/sdk/util/IntegrationHelper;

    move-result-object v0

    return-object v0
.end method
