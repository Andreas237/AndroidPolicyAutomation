.class public final Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$Builder;
.super Ljava/lang/Object;
.source "DaggerMyOffersGalleryComponent.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation


# instance fields
.field private imScreenModule:Lcom/ibotta/android/mvp/ui/activity/im/ImScreenModule;

.field private mainComponent:Lcom/ibotta/android/di/MainComponent;

.field private myOffersGalleryModule:Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryModule;


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 318
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$1;)V
    .locals 0

    .line 311
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$Builder;-><init>()V

    return-void
.end method

.method static synthetic access$100(Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryModule;
    .locals 0

    .line 311
    iget-object p0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$Builder;->myOffersGalleryModule:Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryModule;

    return-object p0
.end method

.method static synthetic access$200(Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$Builder;)Lcom/ibotta/android/di/MainComponent;
    .locals 0

    .line 311
    iget-object p0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$Builder;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    return-object p0
.end method

.method static synthetic access$300(Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/im/ImScreenModule;
    .locals 0

    .line 311
    iget-object p0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$Builder;->imScreenModule:Lcom/ibotta/android/mvp/ui/activity/im/ImScreenModule;

    return-object p0
.end method


# virtual methods
.method public build()Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryComponent;
    .locals 3

    .line 321
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$Builder;->myOffersGalleryModule:Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryModule;

    if-eqz v0, :cond_2

    .line 325
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$Builder;->imScreenModule:Lcom/ibotta/android/mvp/ui/activity/im/ImScreenModule;

    if-eqz v0, :cond_1

    .line 328
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$Builder;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    if-eqz v0, :cond_0

    .line 331
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent;-><init>(Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$Builder;Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$1;)V

    return-object v0

    .line 329
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

    .line 326
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-class v2, Lcom/ibotta/android/mvp/ui/activity/im/ImScreenModule;

    invoke-virtual {v2}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " must be set"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 322
    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-class v2, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryModule;

    .line 323
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

.method public imScreenModule(Lcom/ibotta/android/mvp/ui/activity/im/ImScreenModule;)Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$Builder;
    .locals 0

    .line 340
    invoke-static {p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/im/ImScreenModule;

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$Builder;->imScreenModule:Lcom/ibotta/android/mvp/ui/activity/im/ImScreenModule;

    return-object p0
.end method

.method public mainComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$Builder;
    .locals 0

    .line 345
    invoke-static {p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/di/MainComponent;

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$Builder;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    return-object p0
.end method

.method public myOffersGalleryModule(Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryModule;)Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$Builder;
    .locals 0

    .line 335
    invoke-static {p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryModule;

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/DaggerMyOffersGalleryComponent$Builder;->myOffersGalleryModule:Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryModule;

    return-object p0
.end method
