.class public final Lcom/ibotta/android/di/AppModule_ProvideFirebaseInstanceIdFactory;
.super Ljava/lang/Object;
.source "AppModule_ProvideFirebaseInstanceIdFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/google/firebase/iid/FirebaseInstanceId;",
        ">;"
    }
.end annotation


# static fields
.field private static final INSTANCE:Lcom/ibotta/android/di/AppModule_ProvideFirebaseInstanceIdFactory;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 14
    new-instance v0, Lcom/ibotta/android/di/AppModule_ProvideFirebaseInstanceIdFactory;

    invoke-direct {v0}, Lcom/ibotta/android/di/AppModule_ProvideFirebaseInstanceIdFactory;-><init>()V

    sput-object v0, Lcom/ibotta/android/di/AppModule_ProvideFirebaseInstanceIdFactory;->INSTANCE:Lcom/ibotta/android/di/AppModule_ProvideFirebaseInstanceIdFactory;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static create()Lcom/ibotta/android/di/AppModule_ProvideFirebaseInstanceIdFactory;
    .locals 1

    .line 27
    sget-object v0, Lcom/ibotta/android/di/AppModule_ProvideFirebaseInstanceIdFactory;->INSTANCE:Lcom/ibotta/android/di/AppModule_ProvideFirebaseInstanceIdFactory;

    return-object v0
.end method

.method public static provideInstance()Lcom/google/firebase/iid/FirebaseInstanceId;
    .locals 1

    .line 23
    invoke-static {}, Lcom/ibotta/android/di/AppModule_ProvideFirebaseInstanceIdFactory;->proxyProvideFirebaseInstanceId()Lcom/google/firebase/iid/FirebaseInstanceId;

    move-result-object v0

    return-object v0
.end method

.method public static proxyProvideFirebaseInstanceId()Lcom/google/firebase/iid/FirebaseInstanceId;
    .locals 2

    .line 32
    invoke-static {}, Lcom/ibotta/android/di/AppModule;->provideFirebaseInstanceId()Lcom/google/firebase/iid/FirebaseInstanceId;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable @Provides method"

    .line 31
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/firebase/iid/FirebaseInstanceId;

    return-object v0
.end method


# virtual methods
.method public get()Lcom/google/firebase/iid/FirebaseInstanceId;
    .locals 1

    .line 19
    invoke-static {}, Lcom/ibotta/android/di/AppModule_ProvideFirebaseInstanceIdFactory;->provideInstance()Lcom/google/firebase/iid/FirebaseInstanceId;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 8
    invoke-virtual {p0}, Lcom/ibotta/android/di/AppModule_ProvideFirebaseInstanceIdFactory;->get()Lcom/google/firebase/iid/FirebaseInstanceId;

    move-result-object v0

    return-object v0
.end method
