.class public final Lcom/ibotta/android/di/NotificationModule_ProvideNotificationManagerFactory;
.super Ljava/lang/Object;
.source "NotificationModule_ProvideNotificationManagerFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Landroid/app/NotificationManager;",
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

.field private final contextProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljavax/inject/Provider;Ljavax/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Landroid/content/Context;",
            ">;",
            "Ljavax/inject/Provider<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    iput-object p1, p0, Lcom/ibotta/android/di/NotificationModule_ProvideNotificationManagerFactory;->contextProvider:Ljavax/inject/Provider;

    .line 23
    iput-object p2, p0, Lcom/ibotta/android/di/NotificationModule_ProvideNotificationManagerFactory;->channelIdProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/NotificationModule_ProvideNotificationManagerFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Landroid/content/Context;",
            ">;",
            "Ljavax/inject/Provider<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/ibotta/android/di/NotificationModule_ProvideNotificationManagerFactory;"
        }
    .end annotation

    .line 38
    new-instance v0, Lcom/ibotta/android/di/NotificationModule_ProvideNotificationManagerFactory;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/di/NotificationModule_ProvideNotificationManagerFactory;-><init>(Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;)Landroid/app/NotificationManager;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Landroid/content/Context;",
            ">;",
            "Ljavax/inject/Provider<",
            "Ljava/lang/String;",
            ">;)",
            "Landroid/app/NotificationManager;"
        }
    .end annotation

    .line 33
    invoke-interface {p0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/content/Context;

    invoke-interface {p1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-static {p0, p1}, Lcom/ibotta/android/di/NotificationModule_ProvideNotificationManagerFactory;->proxyProvideNotificationManager(Landroid/content/Context;Ljava/lang/String;)Landroid/app/NotificationManager;

    move-result-object p0

    return-object p0
.end method

.method public static proxyProvideNotificationManager(Landroid/content/Context;Ljava/lang/String;)Landroid/app/NotificationManager;
    .locals 0

    .line 45
    invoke-static {p0, p1}, Lcom/ibotta/android/di/NotificationModule;->provideNotificationManager(Landroid/content/Context;Ljava/lang/String;)Landroid/app/NotificationManager;

    move-result-object p0

    const-string p1, "Cannot return null from a non-@Nullable @Provides method"

    .line 44
    invoke-static {p0, p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/app/NotificationManager;

    return-object p0
.end method


# virtual methods
.method public get()Landroid/app/NotificationManager;
    .locals 2

    .line 28
    iget-object v0, p0, Lcom/ibotta/android/di/NotificationModule_ProvideNotificationManagerFactory;->contextProvider:Ljavax/inject/Provider;

    iget-object v1, p0, Lcom/ibotta/android/di/NotificationModule_ProvideNotificationManagerFactory;->channelIdProvider:Ljavax/inject/Provider;

    invoke-static {v0, v1}, Lcom/ibotta/android/di/NotificationModule_ProvideNotificationManagerFactory;->provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;)Landroid/app/NotificationManager;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 10
    invoke-virtual {p0}, Lcom/ibotta/android/di/NotificationModule_ProvideNotificationManagerFactory;->get()Landroid/app/NotificationManager;

    move-result-object v0

    return-object v0
.end method
