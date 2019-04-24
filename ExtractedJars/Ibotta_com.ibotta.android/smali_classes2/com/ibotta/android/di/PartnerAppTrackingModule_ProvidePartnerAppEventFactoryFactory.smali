.class public final Lcom/ibotta/android/di/PartnerAppTrackingModule_ProvidePartnerAppEventFactoryFactory;
.super Ljava/lang/Object;
.source "PartnerAppTrackingModule_ProvidePartnerAppEventFactoryFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppEventFactory;",
        ">;"
    }
.end annotation


# static fields
.field private static final INSTANCE:Lcom/ibotta/android/di/PartnerAppTrackingModule_ProvidePartnerAppEventFactoryFactory;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 14
    new-instance v0, Lcom/ibotta/android/di/PartnerAppTrackingModule_ProvidePartnerAppEventFactoryFactory;

    invoke-direct {v0}, Lcom/ibotta/android/di/PartnerAppTrackingModule_ProvidePartnerAppEventFactoryFactory;-><init>()V

    sput-object v0, Lcom/ibotta/android/di/PartnerAppTrackingModule_ProvidePartnerAppEventFactoryFactory;->INSTANCE:Lcom/ibotta/android/di/PartnerAppTrackingModule_ProvidePartnerAppEventFactoryFactory;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static create()Lcom/ibotta/android/di/PartnerAppTrackingModule_ProvidePartnerAppEventFactoryFactory;
    .locals 1

    .line 27
    sget-object v0, Lcom/ibotta/android/di/PartnerAppTrackingModule_ProvidePartnerAppEventFactoryFactory;->INSTANCE:Lcom/ibotta/android/di/PartnerAppTrackingModule_ProvidePartnerAppEventFactoryFactory;

    return-object v0
.end method

.method public static provideInstance()Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppEventFactory;
    .locals 1

    .line 23
    invoke-static {}, Lcom/ibotta/android/di/PartnerAppTrackingModule_ProvidePartnerAppEventFactoryFactory;->proxyProvidePartnerAppEventFactory()Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppEventFactory;

    move-result-object v0

    return-object v0
.end method

.method public static proxyProvidePartnerAppEventFactory()Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppEventFactory;
    .locals 2

    .line 32
    invoke-static {}, Lcom/ibotta/android/di/PartnerAppTrackingModule;->providePartnerAppEventFactory()Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppEventFactory;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable @Provides method"

    .line 31
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppEventFactory;

    return-object v0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppEventFactory;
    .locals 1

    .line 19
    invoke-static {}, Lcom/ibotta/android/di/PartnerAppTrackingModule_ProvidePartnerAppEventFactoryFactory;->provideInstance()Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppEventFactory;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 8
    invoke-virtual {p0}, Lcom/ibotta/android/di/PartnerAppTrackingModule_ProvidePartnerAppEventFactoryFactory;->get()Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppEventFactory;

    move-result-object v0

    return-object v0
.end method
