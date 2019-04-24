.class public final Lcom/ibotta/android/di/AppModule_ProvideFrontDoorActivitiesFactory;
.super Ljava/lang/Object;
.source "AppModule_ProvideFrontDoorActivitiesFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Ljava/util/Set<",
        "Ljava/lang/Class<",
        "+",
        "Landroid/app/Activity;",
        ">;>;>;"
    }
.end annotation


# static fields
.field private static final INSTANCE:Lcom/ibotta/android/di/AppModule_ProvideFrontDoorActivitiesFactory;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 15
    new-instance v0, Lcom/ibotta/android/di/AppModule_ProvideFrontDoorActivitiesFactory;

    invoke-direct {v0}, Lcom/ibotta/android/di/AppModule_ProvideFrontDoorActivitiesFactory;-><init>()V

    sput-object v0, Lcom/ibotta/android/di/AppModule_ProvideFrontDoorActivitiesFactory;->INSTANCE:Lcom/ibotta/android/di/AppModule_ProvideFrontDoorActivitiesFactory;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static create()Lcom/ibotta/android/di/AppModule_ProvideFrontDoorActivitiesFactory;
    .locals 1

    .line 28
    sget-object v0, Lcom/ibotta/android/di/AppModule_ProvideFrontDoorActivitiesFactory;->INSTANCE:Lcom/ibotta/android/di/AppModule_ProvideFrontDoorActivitiesFactory;

    return-object v0
.end method

.method public static provideInstance()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/Class<",
            "+",
            "Landroid/app/Activity;",
            ">;>;"
        }
    .end annotation

    .line 24
    invoke-static {}, Lcom/ibotta/android/di/AppModule_ProvideFrontDoorActivitiesFactory;->proxyProvideFrontDoorActivities()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public static proxyProvideFrontDoorActivities()Ljava/util/Set;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/Class<",
            "+",
            "Landroid/app/Activity;",
            ">;>;"
        }
    .end annotation

    .line 33
    invoke-static {}, Lcom/ibotta/android/di/AppModule;->provideFrontDoorActivities()Ljava/util/Set;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable @Provides method"

    .line 32
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Set;

    return-object v0
.end method


# virtual methods
.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 9
    invoke-virtual {p0}, Lcom/ibotta/android/di/AppModule_ProvideFrontDoorActivitiesFactory;->get()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public get()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/Class<",
            "+",
            "Landroid/app/Activity;",
            ">;>;"
        }
    .end annotation

    .line 20
    invoke-static {}, Lcom/ibotta/android/di/AppModule_ProvideFrontDoorActivitiesFactory;->provideInstance()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method
