.class public Lcom/ibotta/android/blacklist/device/classifiers/AppVersionLessThanClassifier;
.super Lcom/ibotta/android/blacklist/device/classifiers/BaseAppVersionClassifier;
.source "AppVersionLessThanClassifier.java"


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/ibotta/android/profile/BuildProfile;Lcom/ibotta/android/blacklist/device/classifiers/AppVersionHelper;Lcom/ibotta/android/blacklist/BlacklistClassifierFactory;)V
    .locals 0

    .line 17
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/ibotta/android/blacklist/device/classifiers/BaseAppVersionClassifier;-><init>(Ljava/lang/String;Lcom/ibotta/android/profile/BuildProfile;Lcom/ibotta/android/blacklist/device/classifiers/AppVersionHelper;Lcom/ibotta/android/blacklist/BlacklistClassifierFactory;)V

    return-void
.end method


# virtual methods
.method protected getBlacklistClassifierType()Lcom/ibotta/android/blacklist/BlacklistClassifierType;
    .locals 1

    .line 22
    sget-object v0, Lcom/ibotta/android/blacklist/BlacklistClassifierType;->INT_LESS_THAN:Lcom/ibotta/android/blacklist/BlacklistClassifierType;

    return-object v0
.end method
