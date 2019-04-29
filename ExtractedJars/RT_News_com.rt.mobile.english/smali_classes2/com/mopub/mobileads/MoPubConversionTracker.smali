.class public Lcom/mopub/mobileads/MoPubConversionTracker;
.super Ljava/lang/Object;
.source "MoPubConversionTracker.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/mopub/mobileads/MoPubConversionTracker$ConversionUrlGenerator;
    }
.end annotation


# instance fields
.field private mContext:Landroid/content/Context;

.field private mIsTrackedKey:Ljava/lang/String;

.field private mPackageName:Ljava/lang/String;

.field private mSharedPreferences:Landroid/content/SharedPreferences;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic access$100(Lcom/mopub/mobileads/MoPubConversionTracker;)Ljava/lang/String;
    .locals 0

    .line 15
    iget-object p0, p0, Lcom/mopub/mobileads/MoPubConversionTracker;->mIsTrackedKey:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$200(Lcom/mopub/mobileads/MoPubConversionTracker;)Landroid/content/SharedPreferences;
    .locals 0

    .line 15
    iget-object p0, p0, Lcom/mopub/mobileads/MoPubConversionTracker;->mSharedPreferences:Landroid/content/SharedPreferences;

    return-object p0
.end method

.method static synthetic access$300(Lcom/mopub/mobileads/MoPubConversionTracker;)Ljava/lang/String;
    .locals 0

    .line 15
    iget-object p0, p0, Lcom/mopub/mobileads/MoPubConversionTracker;->mPackageName:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$400(Lcom/mopub/mobileads/MoPubConversionTracker;)Landroid/content/Context;
    .locals 0

    .line 15
    iget-object p0, p0, Lcom/mopub/mobileads/MoPubConversionTracker;->mContext:Landroid/content/Context;

    return-object p0
.end method

.method private isAlreadyTracked()Z
    .locals 3

    .line 51
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubConversionTracker;->mSharedPreferences:Landroid/content/SharedPreferences;

    iget-object v1, p0, Lcom/mopub/mobileads/MoPubConversionTracker;->mIsTrackedKey:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method


# virtual methods
.method public reportAppOpen(Landroid/content/Context;)V
    .locals 2

    if-nez p1, :cond_0

    return-void

    .line 26
    :cond_0
    iput-object p1, p0, Lcom/mopub/mobileads/MoPubConversionTracker;->mContext:Landroid/content/Context;

    .line 27
    iget-object p1, p0, Lcom/mopub/mobileads/MoPubConversionTracker;->mContext:Landroid/content/Context;

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/mopub/mobileads/MoPubConversionTracker;->mPackageName:Ljava/lang/String;

    .line 28
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v0, p0, Lcom/mopub/mobileads/MoPubConversionTracker;->mPackageName:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " tracked"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/mopub/mobileads/MoPubConversionTracker;->mIsTrackedKey:Ljava/lang/String;

    .line 29
    iget-object p1, p0, Lcom/mopub/mobileads/MoPubConversionTracker;->mContext:Landroid/content/Context;

    invoke-static {p1}, Lcom/mopub/common/SharedPreferencesHelper;->getSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object p1

    iput-object p1, p0, Lcom/mopub/mobileads/MoPubConversionTracker;->mSharedPreferences:Landroid/content/SharedPreferences;

    .line 31
    invoke-direct {p0}, Lcom/mopub/mobileads/MoPubConversionTracker;->isAlreadyTracked()Z

    move-result p1

    if-nez p1, :cond_1

    .line 32
    new-instance p1, Lcom/mopub/mobileads/MoPubConversionTracker$ConversionUrlGenerator;

    const/4 v0, 0x0

    invoke-direct {p1, p0, v0}, Lcom/mopub/mobileads/MoPubConversionTracker$ConversionUrlGenerator;-><init>(Lcom/mopub/mobileads/MoPubConversionTracker;Lcom/mopub/mobileads/MoPubConversionTracker$1;)V

    const-string v0, "ads.mopub.com"

    invoke-virtual {p1, v0}, Lcom/mopub/mobileads/MoPubConversionTracker$ConversionUrlGenerator;->generateUrlString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lcom/mopub/mobileads/MoPubConversionTracker;->mContext:Landroid/content/Context;

    new-instance v1, Lcom/mopub/mobileads/MoPubConversionTracker$1;

    invoke-direct {v1, p0}, Lcom/mopub/mobileads/MoPubConversionTracker$1;-><init>(Lcom/mopub/mobileads/MoPubConversionTracker;)V

    invoke-static {p1, v0, v1}, Lcom/mopub/network/TrackingRequest;->makeTrackingHttpRequest(Ljava/lang/String;Landroid/content/Context;Lcom/mopub/network/TrackingRequest$Listener;)V

    goto :goto_0

    :cond_1
    const-string p1, "Conversion already tracked"

    .line 46
    invoke-static {p1}, Lcom/mopub/common/logging/MoPubLog;->d(Ljava/lang/String;)V

    :goto_0
    return-void
.end method
