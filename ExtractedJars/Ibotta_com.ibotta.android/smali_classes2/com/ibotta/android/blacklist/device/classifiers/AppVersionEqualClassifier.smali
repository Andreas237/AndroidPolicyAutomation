.class public Lcom/ibotta/android/blacklist/device/classifiers/AppVersionEqualClassifier;
.super Ljava/lang/Object;
.source "AppVersionEqualClassifier.java"

# interfaces
.implements Lcom/ibotta/android/blacklist/BlacklistClassifier;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/ibotta/android/blacklist/BlacklistClassifier<",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field private final appVersionHelper:Lcom/ibotta/android/blacklist/device/classifiers/AppVersionHelper;

.field private final buildProfile:Lcom/ibotta/android/profile/BuildProfile;

.field protected final criteria:Ljava/lang/String;

.field private final factory:Lcom/ibotta/android/blacklist/BlacklistClassifierFactory;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/ibotta/android/profile/BuildProfile;Lcom/ibotta/android/blacklist/device/classifiers/AppVersionHelper;Lcom/ibotta/android/blacklist/BlacklistClassifierFactory;)V
    .locals 0

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    iput-object p1, p0, Lcom/ibotta/android/blacklist/device/classifiers/AppVersionEqualClassifier;->criteria:Ljava/lang/String;

    .line 26
    iput-object p2, p0, Lcom/ibotta/android/blacklist/device/classifiers/AppVersionEqualClassifier;->buildProfile:Lcom/ibotta/android/profile/BuildProfile;

    .line 27
    iput-object p3, p0, Lcom/ibotta/android/blacklist/device/classifiers/AppVersionEqualClassifier;->appVersionHelper:Lcom/ibotta/android/blacklist/device/classifiers/AppVersionHelper;

    .line 28
    iput-object p4, p0, Lcom/ibotta/android/blacklist/device/classifiers/AppVersionEqualClassifier;->factory:Lcom/ibotta/android/blacklist/BlacklistClassifierFactory;

    return-void
.end method


# virtual methods
.method public isClassified()Z
    .locals 4

    .line 38
    iget-object v0, p0, Lcom/ibotta/android/blacklist/device/classifiers/AppVersionEqualClassifier;->criteria:Ljava/lang/String;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    .line 42
    :cond_0
    iget-object v1, p0, Lcom/ibotta/android/blacklist/device/classifiers/AppVersionEqualClassifier;->appVersionHelper:Lcom/ibotta/android/blacklist/device/classifiers/AppVersionHelper;

    invoke-virtual {v1, v0}, Lcom/ibotta/android/blacklist/device/classifiers/AppVersionHelper;->parse(Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    .line 43
    iget-object v1, p0, Lcom/ibotta/android/blacklist/device/classifiers/AppVersionEqualClassifier;->appVersionHelper:Lcom/ibotta/android/blacklist/device/classifiers/AppVersionHelper;

    iget-object v2, p0, Lcom/ibotta/android/blacklist/device/classifiers/AppVersionEqualClassifier;->buildProfile:Lcom/ibotta/android/profile/BuildProfile;

    invoke-interface {v2}, Lcom/ibotta/android/profile/BuildProfile;->getAppVersionName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/ibotta/android/blacklist/device/classifiers/AppVersionHelper;->parse(Ljava/lang/String;)Ljava/util/List;

    move-result-object v1

    .line 45
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v3

    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    move-result v2

    .line 47
    iget-object v3, p0, Lcom/ibotta/android/blacklist/device/classifiers/AppVersionEqualClassifier;->appVersionHelper:Lcom/ibotta/android/blacklist/device/classifiers/AppVersionHelper;

    invoke-virtual {v3, v0, v2}, Lcom/ibotta/android/blacklist/device/classifiers/AppVersionHelper;->forceToSize(Ljava/util/List;I)V

    .line 48
    iget-object v3, p0, Lcom/ibotta/android/blacklist/device/classifiers/AppVersionEqualClassifier;->appVersionHelper:Lcom/ibotta/android/blacklist/device/classifiers/AppVersionHelper;

    invoke-virtual {v3, v1, v2}, Lcom/ibotta/android/blacklist/device/classifiers/AppVersionHelper;->forceToSize(Ljava/util/List;I)V

    .line 50
    iget-object v2, p0, Lcom/ibotta/android/blacklist/device/classifiers/AppVersionEqualClassifier;->appVersionHelper:Lcom/ibotta/android/blacklist/device/classifiers/AppVersionHelper;

    invoke-virtual {v2, v0}, Lcom/ibotta/android/blacklist/device/classifiers/AppVersionHelper;->toAppVersion(Ljava/util/List;)Ljava/lang/String;

    move-result-object v0

    .line 51
    iget-object v2, p0, Lcom/ibotta/android/blacklist/device/classifiers/AppVersionEqualClassifier;->appVersionHelper:Lcom/ibotta/android/blacklist/device/classifiers/AppVersionHelper;

    invoke-virtual {v2, v1}, Lcom/ibotta/android/blacklist/device/classifiers/AppVersionHelper;->toAppVersion(Ljava/util/List;)Ljava/lang/String;

    move-result-object v1

    .line 53
    iget-object v2, p0, Lcom/ibotta/android/blacklist/device/classifiers/AppVersionEqualClassifier;->factory:Lcom/ibotta/android/blacklist/BlacklistClassifierFactory;

    sget-object v3, Lcom/ibotta/android/blacklist/BlacklistClassifierType;->STRING_EQUAL:Lcom/ibotta/android/blacklist/BlacklistClassifierType;

    invoke-virtual {v2, v3, v0}, Lcom/ibotta/android/blacklist/BlacklistClassifierFactory;->create(Lcom/ibotta/android/blacklist/BlacklistClassifierType;Ljava/lang/Object;)Lcom/ibotta/android/blacklist/BlacklistClassifier;

    move-result-object v0

    .line 54
    invoke-interface {v0, v1}, Lcom/ibotta/android/blacklist/BlacklistClassifier;->setValue(Ljava/lang/Object;)V

    .line 56
    invoke-interface {v0}, Lcom/ibotta/android/blacklist/BlacklistClassifier;->isClassified()Z

    move-result v0

    return v0
.end method

.method public bridge synthetic setValue(Ljava/lang/Object;)V
    .locals 0

    .line 14
    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/blacklist/device/classifiers/AppVersionEqualClassifier;->setValue(Ljava/lang/Void;)V

    return-void
.end method

.method public setValue(Ljava/lang/Void;)V
    .locals 0

    return-void
.end method
