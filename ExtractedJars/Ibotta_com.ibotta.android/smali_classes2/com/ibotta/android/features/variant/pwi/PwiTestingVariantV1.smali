.class public Lcom/ibotta/android/features/variant/pwi/PwiTestingVariantV1;
.super Lcom/ibotta/android/features/variant/pwi/PwiBaseTestingVariant;
.source "PwiTestingVariantV1.java"


# instance fields
.field protected pwiPlayhouseVariant:Lcom/ibotta/android/features/variant/pwi/PwiPlayhouseVariant;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 15
    invoke-direct {p0}, Lcom/ibotta/android/features/variant/pwi/PwiBaseTestingVariant;-><init>()V

    .line 16
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/App;->getMainComponent()Lcom/ibotta/android/di/MainComponent;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/ibotta/android/di/MainComponent;->inject(Lcom/ibotta/android/features/variant/pwi/PwiTestingVariantV1;)V

    return-void
.end method


# virtual methods
.method public getPwiFlowClass()Ljava/lang/Class;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 21
    iget-object v0, p0, Lcom/ibotta/android/features/variant/pwi/PwiTestingVariantV1;->pwiPlayhouseVariant:Lcom/ibotta/android/features/variant/pwi/PwiPlayhouseVariant;

    invoke-interface {v0}, Lcom/ibotta/android/features/variant/pwi/PwiPlayhouseVariant;->getPwiFlowClass()Ljava/lang/Class;

    move-result-object v0

    return-object v0
.end method
