.class public final Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent$Builder;
.super Ljava/lang/Object;
.source "DaggerImErrorComponent.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation


# instance fields
.field private imErrorModule:Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorModule;

.field private mainComponent:Lcom/ibotta/android/di/MainComponent;


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 254
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent$1;)V
    .locals 0

    .line 249
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent$Builder;-><init>()V

    return-void
.end method

.method static synthetic access$100(Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorModule;
    .locals 0

    .line 249
    iget-object p0, p0, Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent$Builder;->imErrorModule:Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorModule;

    return-object p0
.end method

.method static synthetic access$200(Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent$Builder;)Lcom/ibotta/android/di/MainComponent;
    .locals 0

    .line 249
    iget-object p0, p0, Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent$Builder;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    return-object p0
.end method


# virtual methods
.method public build()Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorComponent;
    .locals 3

    .line 257
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent$Builder;->imErrorModule:Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorModule;

    if-eqz v0, :cond_1

    .line 260
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent$Builder;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    if-eqz v0, :cond_0

    .line 263
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent;-><init>(Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent$Builder;Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent$1;)V

    return-object v0

    .line 261
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-class v2, Lcom/ibotta/android/di/MainComponent;

    invoke-virtual {v2}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " must be set"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 258
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-class v2, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorModule;

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

.method public imErrorModule(Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorModule;)Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent$Builder;
    .locals 0

    .line 267
    invoke-static {p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorModule;

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent$Builder;->imErrorModule:Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorModule;

    return-object p0
.end method

.method public mainComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent$Builder;
    .locals 0

    .line 272
    invoke-static {p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/di/MainComponent;

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/im/error/DaggerImErrorComponent$Builder;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    return-object p0
.end method
