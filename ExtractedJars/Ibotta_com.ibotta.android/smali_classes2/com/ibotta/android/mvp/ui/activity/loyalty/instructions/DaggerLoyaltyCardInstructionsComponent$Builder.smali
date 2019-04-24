.class public final Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/DaggerLoyaltyCardInstructionsComponent$Builder;
.super Ljava/lang/Object;
.source "DaggerLoyaltyCardInstructionsComponent.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/DaggerLoyaltyCardInstructionsComponent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation


# instance fields
.field private loyaltyCardInstructionsModule:Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/LoyaltyCardInstructionsModule;

.field private mainComponent:Lcom/ibotta/android/di/MainComponent;


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 212
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/DaggerLoyaltyCardInstructionsComponent$1;)V
    .locals 0

    .line 207
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/DaggerLoyaltyCardInstructionsComponent$Builder;-><init>()V

    return-void
.end method

.method static synthetic access$100(Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/DaggerLoyaltyCardInstructionsComponent$Builder;)Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/LoyaltyCardInstructionsModule;
    .locals 0

    .line 207
    iget-object p0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/DaggerLoyaltyCardInstructionsComponent$Builder;->loyaltyCardInstructionsModule:Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/LoyaltyCardInstructionsModule;

    return-object p0
.end method

.method static synthetic access$200(Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/DaggerLoyaltyCardInstructionsComponent$Builder;)Lcom/ibotta/android/di/MainComponent;
    .locals 0

    .line 207
    iget-object p0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/DaggerLoyaltyCardInstructionsComponent$Builder;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    return-object p0
.end method


# virtual methods
.method public build()Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/LoyaltyCardInstructionsComponent;
    .locals 3

    .line 215
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/DaggerLoyaltyCardInstructionsComponent$Builder;->loyaltyCardInstructionsModule:Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/LoyaltyCardInstructionsModule;

    if-eqz v0, :cond_1

    .line 219
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/DaggerLoyaltyCardInstructionsComponent$Builder;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    if-eqz v0, :cond_0

    .line 222
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/DaggerLoyaltyCardInstructionsComponent;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/DaggerLoyaltyCardInstructionsComponent;-><init>(Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/DaggerLoyaltyCardInstructionsComponent$Builder;Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/DaggerLoyaltyCardInstructionsComponent$1;)V

    return-object v0

    .line 220
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

    .line 216
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-class v2, Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/LoyaltyCardInstructionsModule;

    .line 217
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

.method public loyaltyCardInstructionsModule(Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/LoyaltyCardInstructionsModule;)Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/DaggerLoyaltyCardInstructionsComponent$Builder;
    .locals 0

    .line 228
    invoke-static {p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/LoyaltyCardInstructionsModule;

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/DaggerLoyaltyCardInstructionsComponent$Builder;->loyaltyCardInstructionsModule:Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/LoyaltyCardInstructionsModule;

    return-object p0
.end method

.method public mainComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/DaggerLoyaltyCardInstructionsComponent$Builder;
    .locals 0

    .line 233
    invoke-static {p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/di/MainComponent;

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/DaggerLoyaltyCardInstructionsComponent$Builder;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    return-object p0
.end method
