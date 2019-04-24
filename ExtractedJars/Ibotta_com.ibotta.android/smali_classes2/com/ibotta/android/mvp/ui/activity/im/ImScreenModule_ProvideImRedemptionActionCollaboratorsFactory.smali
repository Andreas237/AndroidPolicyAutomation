.class public final Lcom/ibotta/android/mvp/ui/activity/im/ImScreenModule_ProvideImRedemptionActionCollaboratorsFactory;
.super Ljava/lang/Object;
.source "ImScreenModule_ProvideImRedemptionActionCollaboratorsFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/mvp/ui/activity/im/ImRedemptionActionCollaborators;",
        ">;"
    }
.end annotation


# instance fields
.field private final module:Lcom/ibotta/android/mvp/ui/activity/im/ImScreenModule;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/im/ImScreenModule;)V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/im/ImScreenModule_ProvideImRedemptionActionCollaboratorsFactory;->module:Lcom/ibotta/android/mvp/ui/activity/im/ImScreenModule;

    return-void
.end method

.method public static create(Lcom/ibotta/android/mvp/ui/activity/im/ImScreenModule;)Lcom/ibotta/android/mvp/ui/activity/im/ImScreenModule_ProvideImRedemptionActionCollaboratorsFactory;
    .locals 1

    .line 30
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/im/ImScreenModule_ProvideImRedemptionActionCollaboratorsFactory;

    invoke-direct {v0, p0}, Lcom/ibotta/android/mvp/ui/activity/im/ImScreenModule_ProvideImRedemptionActionCollaboratorsFactory;-><init>(Lcom/ibotta/android/mvp/ui/activity/im/ImScreenModule;)V

    return-object v0
.end method

.method public static provideInstance(Lcom/ibotta/android/mvp/ui/activity/im/ImScreenModule;)Lcom/ibotta/android/mvp/ui/activity/im/ImRedemptionActionCollaborators;
    .locals 0

    .line 25
    invoke-static {p0}, Lcom/ibotta/android/mvp/ui/activity/im/ImScreenModule_ProvideImRedemptionActionCollaboratorsFactory;->proxyProvideImRedemptionActionCollaborators(Lcom/ibotta/android/mvp/ui/activity/im/ImScreenModule;)Lcom/ibotta/android/mvp/ui/activity/im/ImRedemptionActionCollaborators;

    move-result-object p0

    return-object p0
.end method

.method public static proxyProvideImRedemptionActionCollaborators(Lcom/ibotta/android/mvp/ui/activity/im/ImScreenModule;)Lcom/ibotta/android/mvp/ui/activity/im/ImRedemptionActionCollaborators;
    .locals 1

    .line 36
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/im/ImScreenModule;->provideImRedemptionActionCollaborators()Lcom/ibotta/android/mvp/ui/activity/im/ImRedemptionActionCollaborators;

    move-result-object p0

    const-string v0, "Cannot return null from a non-@Nullable @Provides method"

    .line 35
    invoke-static {p0, v0}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/mvp/ui/activity/im/ImRedemptionActionCollaborators;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/mvp/ui/activity/im/ImRedemptionActionCollaborators;
    .locals 1

    .line 21
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/ImScreenModule_ProvideImRedemptionActionCollaboratorsFactory;->module:Lcom/ibotta/android/mvp/ui/activity/im/ImScreenModule;

    invoke-static {v0}, Lcom/ibotta/android/mvp/ui/activity/im/ImScreenModule_ProvideImRedemptionActionCollaboratorsFactory;->provideInstance(Lcom/ibotta/android/mvp/ui/activity/im/ImScreenModule;)Lcom/ibotta/android/mvp/ui/activity/im/ImRedemptionActionCollaborators;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 7
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/im/ImScreenModule_ProvideImRedemptionActionCollaboratorsFactory;->get()Lcom/ibotta/android/mvp/ui/activity/im/ImRedemptionActionCollaborators;

    move-result-object v0

    return-object v0
.end method
