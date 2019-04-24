.class final Lcom/ibotta/android/di/DaggerMainComponent$Builder;
.super Ljava/lang/Object;
.source "DaggerMainComponent.java"

# interfaces
.implements Lcom/ibotta/android/di/MainComponent$Builder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/di/DaggerMainComponent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "Builder"
.end annotation


# instance fields
.field private application:Lcom/ibotta/android/App;


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 5102
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/ibotta/android/di/DaggerMainComponent$1;)V
    .locals 0

    .line 5102
    invoke-direct {p0}, Lcom/ibotta/android/di/DaggerMainComponent$Builder;-><init>()V

    return-void
.end method

.method static synthetic access$100(Lcom/ibotta/android/di/DaggerMainComponent$Builder;)Lcom/ibotta/android/App;
    .locals 0

    .line 5102
    iget-object p0, p0, Lcom/ibotta/android/di/DaggerMainComponent$Builder;->application:Lcom/ibotta/android/App;

    return-object p0
.end method


# virtual methods
.method public application(Lcom/ibotta/android/App;)Lcom/ibotta/android/di/DaggerMainComponent$Builder;
    .locals 0

    .line 5115
    invoke-static {p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/App;

    iput-object p1, p0, Lcom/ibotta/android/di/DaggerMainComponent$Builder;->application:Lcom/ibotta/android/App;

    return-object p0
.end method

.method public bridge synthetic application(Lcom/ibotta/android/App;)Lcom/ibotta/android/di/MainComponent$Builder;
    .locals 0

    .line 5102
    invoke-virtual {p0, p1}, Lcom/ibotta/android/di/DaggerMainComponent$Builder;->application(Lcom/ibotta/android/App;)Lcom/ibotta/android/di/DaggerMainComponent$Builder;

    move-result-object p1

    return-object p1
.end method

.method public build()Lcom/ibotta/android/di/MainComponent;
    .locals 3

    .line 5107
    iget-object v0, p0, Lcom/ibotta/android/di/DaggerMainComponent$Builder;->application:Lcom/ibotta/android/App;

    if-eqz v0, :cond_0

    .line 5110
    new-instance v0, Lcom/ibotta/android/di/DaggerMainComponent;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/ibotta/android/di/DaggerMainComponent;-><init>(Lcom/ibotta/android/di/DaggerMainComponent$Builder;Lcom/ibotta/android/di/DaggerMainComponent$1;)V

    return-object v0

    .line 5108
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-class v2, Lcom/ibotta/android/App;

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
