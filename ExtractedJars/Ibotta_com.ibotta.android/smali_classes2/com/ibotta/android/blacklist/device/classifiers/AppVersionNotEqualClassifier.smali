.class public Lcom/ibotta/android/blacklist/device/classifiers/AppVersionNotEqualClassifier;
.super Lcom/ibotta/android/blacklist/device/classifiers/AppVersionEqualClassifier;
.source "AppVersionNotEqualClassifier.java"


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/ibotta/android/profile/BuildProfile;Lcom/ibotta/android/blacklist/device/classifiers/AppVersionHelper;Lcom/ibotta/android/blacklist/BlacklistClassifierFactory;)V
    .locals 0

    .line 16
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/ibotta/android/blacklist/device/classifiers/AppVersionEqualClassifier;-><init>(Ljava/lang/String;Lcom/ibotta/android/profile/BuildProfile;Lcom/ibotta/android/blacklist/device/classifiers/AppVersionHelper;Lcom/ibotta/android/blacklist/BlacklistClassifierFactory;)V

    return-void
.end method


# virtual methods
.method public isClassified()Z
    .locals 1

    .line 21
    iget-object v0, p0, Lcom/ibotta/android/blacklist/device/classifiers/AppVersionNotEqualClassifier;->criteria:Ljava/lang/String;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    .line 25
    :cond_0
    invoke-super {p0}, Lcom/ibotta/android/blacklist/device/classifiers/AppVersionEqualClassifier;->isClassified()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method
