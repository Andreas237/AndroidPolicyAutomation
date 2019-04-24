.class public abstract Lcom/ibotta/android/blacklist/device/classifiers/BaseAppVersionClassifier;
.super Ljava/lang/Object;
.source "BaseAppVersionClassifier.java"

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

.field private final criteria:Ljava/lang/String;

.field private final factory:Lcom/ibotta/android/blacklist/BlacklistClassifierFactory;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/ibotta/android/profile/BuildProfile;Lcom/ibotta/android/blacklist/device/classifiers/AppVersionHelper;Lcom/ibotta/android/blacklist/BlacklistClassifierFactory;)V
    .locals 0

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    iput-object p1, p0, Lcom/ibotta/android/blacklist/device/classifiers/BaseAppVersionClassifier;->criteria:Ljava/lang/String;

    .line 28
    iput-object p2, p0, Lcom/ibotta/android/blacklist/device/classifiers/BaseAppVersionClassifier;->buildProfile:Lcom/ibotta/android/profile/BuildProfile;

    .line 29
    iput-object p3, p0, Lcom/ibotta/android/blacklist/device/classifiers/BaseAppVersionClassifier;->appVersionHelper:Lcom/ibotta/android/blacklist/device/classifiers/AppVersionHelper;

    .line 30
    iput-object p4, p0, Lcom/ibotta/android/blacklist/device/classifiers/BaseAppVersionClassifier;->factory:Lcom/ibotta/android/blacklist/BlacklistClassifierFactory;

    return-void
.end method


# virtual methods
.method protected abstract getBlacklistClassifierType()Lcom/ibotta/android/blacklist/BlacklistClassifierType;
.end method

.method public isClassified()Z
    .locals 8

    .line 40
    iget-object v0, p0, Lcom/ibotta/android/blacklist/device/classifiers/BaseAppVersionClassifier;->criteria:Ljava/lang/String;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 44
    :cond_0
    iget-object v2, p0, Lcom/ibotta/android/blacklist/device/classifiers/BaseAppVersionClassifier;->appVersionHelper:Lcom/ibotta/android/blacklist/device/classifiers/AppVersionHelper;

    invoke-virtual {v2, v0}, Lcom/ibotta/android/blacklist/device/classifiers/AppVersionHelper;->parse(Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    .line 45
    iget-object v2, p0, Lcom/ibotta/android/blacklist/device/classifiers/BaseAppVersionClassifier;->appVersionHelper:Lcom/ibotta/android/blacklist/device/classifiers/AppVersionHelper;

    iget-object v3, p0, Lcom/ibotta/android/blacklist/device/classifiers/BaseAppVersionClassifier;->buildProfile:Lcom/ibotta/android/profile/BuildProfile;

    invoke-interface {v3}, Lcom/ibotta/android/profile/BuildProfile;->getAppVersionName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/ibotta/android/blacklist/device/classifiers/AppVersionHelper;->parse(Ljava/lang/String;)Ljava/util/List;

    move-result-object v2

    .line 47
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v4

    invoke-static {v3, v4}, Ljava/lang/Math;->max(II)I

    move-result v3

    .line 49
    iget-object v4, p0, Lcom/ibotta/android/blacklist/device/classifiers/BaseAppVersionClassifier;->appVersionHelper:Lcom/ibotta/android/blacklist/device/classifiers/AppVersionHelper;

    invoke-virtual {v4, v0, v3}, Lcom/ibotta/android/blacklist/device/classifiers/AppVersionHelper;->forceToSize(Ljava/util/List;I)V

    .line 50
    iget-object v4, p0, Lcom/ibotta/android/blacklist/device/classifiers/BaseAppVersionClassifier;->appVersionHelper:Lcom/ibotta/android/blacklist/device/classifiers/AppVersionHelper;

    invoke-virtual {v4, v2, v3}, Lcom/ibotta/android/blacklist/device/classifiers/AppVersionHelper;->forceToSize(Ljava/util/List;I)V

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_2

    .line 55
    iget-object v5, p0, Lcom/ibotta/android/blacklist/device/classifiers/BaseAppVersionClassifier;->factory:Lcom/ibotta/android/blacklist/BlacklistClassifierFactory;

    .line 56
    invoke-virtual {p0}, Lcom/ibotta/android/blacklist/device/classifiers/BaseAppVersionClassifier;->getBlacklistClassifierType()Lcom/ibotta/android/blacklist/BlacklistClassifierType;

    move-result-object v6

    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    .line 55
    invoke-virtual {v5, v6, v7}, Lcom/ibotta/android/blacklist/BlacklistClassifierFactory;->create(Lcom/ibotta/android/blacklist/BlacklistClassifierType;Ljava/lang/Object;)Lcom/ibotta/android/blacklist/BlacklistClassifier;

    move-result-object v5

    .line 57
    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    invoke-interface {v5, v6}, Lcom/ibotta/android/blacklist/BlacklistClassifier;->setValue(Ljava/lang/Object;)V

    .line 59
    invoke-interface {v5}, Lcom/ibotta/android/blacklist/BlacklistClassifier;->isClassified()Z

    move-result v5

    if-eqz v5, :cond_1

    const/4 v1, 0x1

    goto :goto_1

    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    return v1
.end method

.method public bridge synthetic setValue(Ljava/lang/Object;)V
    .locals 0

    .line 14
    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/blacklist/device/classifiers/BaseAppVersionClassifier;->setValue(Ljava/lang/Void;)V

    return-void
.end method

.method public setValue(Ljava/lang/Void;)V
    .locals 0

    return-void
.end method
