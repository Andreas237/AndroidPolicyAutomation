.class public final Lcom/ibotta/android/di/NotificationModule_ProvideDefaultNotificationComposerFactory;
.super Ljava/lang/Object;
.source "NotificationModule_ProvideDefaultNotificationComposerFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/notification/composer/DefaultNotificationComposer;",
        ">;"
    }
.end annotation


# instance fields
.field private final channelIdProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljavax/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    iput-object p1, p0, Lcom/ibotta/android/di/NotificationModule_ProvideDefaultNotificationComposerFactory;->channelIdProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;)Lcom/ibotta/android/di/NotificationModule_ProvideDefaultNotificationComposerFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/ibotta/android/di/NotificationModule_ProvideDefaultNotificationComposerFactory;"
        }
    .end annotation

    .line 33
    new-instance v0, Lcom/ibotta/android/di/NotificationModule_ProvideDefaultNotificationComposerFactory;

    invoke-direct {v0, p0}, Lcom/ibotta/android/di/NotificationModule_ProvideDefaultNotificationComposerFactory;-><init>(Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static provideInstance(Ljavax/inject/Provider;)Lcom/ibotta/android/notification/composer/DefaultNotificationComposer;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/ibotta/android/notification/composer/DefaultNotificationComposer;"
        }
    .end annotation

    .line 28
    invoke-interface {p0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    invoke-static {p0}, Lcom/ibotta/android/di/NotificationModule_ProvideDefaultNotificationComposerFactory;->proxyProvideDefaultNotificationComposer(Ljava/lang/String;)Lcom/ibotta/android/notification/composer/DefaultNotificationComposer;

    move-result-object p0

    return-object p0
.end method

.method public static proxyProvideDefaultNotificationComposer(Ljava/lang/String;)Lcom/ibotta/android/notification/composer/DefaultNotificationComposer;
    .locals 1

    .line 39
    invoke-static {p0}, Lcom/ibotta/android/di/NotificationModule;->provideDefaultNotificationComposer(Ljava/lang/String;)Lcom/ibotta/android/notification/composer/DefaultNotificationComposer;

    move-result-object p0

    const-string v0, "Cannot return null from a non-@Nullable @Provides method"

    .line 38
    invoke-static {p0, v0}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/notification/composer/DefaultNotificationComposer;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/notification/composer/DefaultNotificationComposer;
    .locals 1

    .line 24
    iget-object v0, p0, Lcom/ibotta/android/di/NotificationModule_ProvideDefaultNotificationComposerFactory;->channelIdProvider:Ljavax/inject/Provider;

    invoke-static {v0}, Lcom/ibotta/android/di/NotificationModule_ProvideDefaultNotificationComposerFactory;->provideInstance(Ljavax/inject/Provider;)Lcom/ibotta/android/notification/composer/DefaultNotificationComposer;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 9
    invoke-virtual {p0}, Lcom/ibotta/android/di/NotificationModule_ProvideDefaultNotificationComposerFactory;->get()Lcom/ibotta/android/notification/composer/DefaultNotificationComposer;

    move-result-object v0

    return-object v0
.end method
