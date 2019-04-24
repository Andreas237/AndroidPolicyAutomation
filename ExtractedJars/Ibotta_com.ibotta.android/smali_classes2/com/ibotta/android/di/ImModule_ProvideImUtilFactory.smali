.class public final Lcom/ibotta/android/di/ImModule_ProvideImUtilFactory;
.super Ljava/lang/Object;
.source "ImModule_ProvideImUtilFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/mvp/ui/activity/im/ImUtil;",
        ">;"
    }
.end annotation


# static fields
.field private static final INSTANCE:Lcom/ibotta/android/di/ImModule_ProvideImUtilFactory;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 13
    new-instance v0, Lcom/ibotta/android/di/ImModule_ProvideImUtilFactory;

    invoke-direct {v0}, Lcom/ibotta/android/di/ImModule_ProvideImUtilFactory;-><init>()V

    sput-object v0, Lcom/ibotta/android/di/ImModule_ProvideImUtilFactory;->INSTANCE:Lcom/ibotta/android/di/ImModule_ProvideImUtilFactory;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static create()Lcom/ibotta/android/di/ImModule_ProvideImUtilFactory;
    .locals 1

    .line 25
    sget-object v0, Lcom/ibotta/android/di/ImModule_ProvideImUtilFactory;->INSTANCE:Lcom/ibotta/android/di/ImModule_ProvideImUtilFactory;

    return-object v0
.end method

.method public static provideInstance()Lcom/ibotta/android/mvp/ui/activity/im/ImUtil;
    .locals 1

    .line 21
    invoke-static {}, Lcom/ibotta/android/di/ImModule_ProvideImUtilFactory;->proxyProvideImUtil()Lcom/ibotta/android/mvp/ui/activity/im/ImUtil;

    move-result-object v0

    return-object v0
.end method

.method public static proxyProvideImUtil()Lcom/ibotta/android/mvp/ui/activity/im/ImUtil;
    .locals 2

    .line 30
    invoke-static {}, Lcom/ibotta/android/di/ImModule;->provideImUtil()Lcom/ibotta/android/mvp/ui/activity/im/ImUtil;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable @Provides method"

    .line 29
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/im/ImUtil;

    return-object v0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/mvp/ui/activity/im/ImUtil;
    .locals 1

    .line 17
    invoke-static {}, Lcom/ibotta/android/di/ImModule_ProvideImUtilFactory;->provideInstance()Lcom/ibotta/android/mvp/ui/activity/im/ImUtil;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 8
    invoke-virtual {p0}, Lcom/ibotta/android/di/ImModule_ProvideImUtilFactory;->get()Lcom/ibotta/android/mvp/ui/activity/im/ImUtil;

    move-result-object v0

    return-object v0
.end method
