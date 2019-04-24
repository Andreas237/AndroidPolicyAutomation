.class public Lcom/ibotta/android/blacklist/device/classifiers/AppVersionLessThanOrEqualClassifier;
.super Ljava/lang/Object;
.source "AppVersionLessThanOrEqualClassifier.java"

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
.field private final appHelper:Lcom/ibotta/android/util/AppHelper;

.field private final criteria:Ljava/lang/String;

.field private final factory:Lcom/ibotta/android/blacklist/BlacklistClassifierFactory;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/blacklist/BlacklistClassifierFactory;)V
    .locals 0

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    iput-object p1, p0, Lcom/ibotta/android/blacklist/device/classifiers/AppVersionLessThanOrEqualClassifier;->criteria:Ljava/lang/String;

    .line 20
    iput-object p2, p0, Lcom/ibotta/android/blacklist/device/classifiers/AppVersionLessThanOrEqualClassifier;->appHelper:Lcom/ibotta/android/util/AppHelper;

    .line 21
    iput-object p3, p0, Lcom/ibotta/android/blacklist/device/classifiers/AppVersionLessThanOrEqualClassifier;->factory:Lcom/ibotta/android/blacklist/BlacklistClassifierFactory;

    return-void
.end method


# virtual methods
.method public isClassified()Z
    .locals 5

    .line 31
    iget-object v0, p0, Lcom/ibotta/android/blacklist/device/classifiers/AppVersionLessThanOrEqualClassifier;->criteria:Ljava/lang/String;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 35
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/blacklist/device/classifiers/AppVersionLessThanOrEqualClassifier;->factory:Lcom/ibotta/android/blacklist/BlacklistClassifierFactory;

    sget-object v2, Lcom/ibotta/android/blacklist/BlacklistClassifierType;->APP_VERSION_LESS_THAN:Lcom/ibotta/android/blacklist/BlacklistClassifierType;

    iget-object v3, p0, Lcom/ibotta/android/blacklist/device/classifiers/AppVersionLessThanOrEqualClassifier;->criteria:Ljava/lang/String;

    invoke-virtual {v0, v2, v3}, Lcom/ibotta/android/blacklist/BlacklistClassifierFactory;->create(Lcom/ibotta/android/blacklist/BlacklistClassifierType;Ljava/lang/Object;)Lcom/ibotta/android/blacklist/BlacklistClassifier;

    move-result-object v0

    .line 36
    iget-object v2, p0, Lcom/ibotta/android/blacklist/device/classifiers/AppVersionLessThanOrEqualClassifier;->factory:Lcom/ibotta/android/blacklist/BlacklistClassifierFactory;

    sget-object v3, Lcom/ibotta/android/blacklist/BlacklistClassifierType;->APP_VERSION_EQUAL:Lcom/ibotta/android/blacklist/BlacklistClassifierType;

    iget-object v4, p0, Lcom/ibotta/android/blacklist/device/classifiers/AppVersionLessThanOrEqualClassifier;->criteria:Ljava/lang/String;

    invoke-virtual {v2, v3, v4}, Lcom/ibotta/android/blacklist/BlacklistClassifierFactory;->create(Lcom/ibotta/android/blacklist/BlacklistClassifierType;Ljava/lang/Object;)Lcom/ibotta/android/blacklist/BlacklistClassifier;

    move-result-object v2

    .line 38
    invoke-interface {v0}, Lcom/ibotta/android/blacklist/BlacklistClassifier;->isClassified()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-interface {v2}, Lcom/ibotta/android/blacklist/BlacklistClassifier;->isClassified()Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_1
    const/4 v1, 0x1

    :cond_2
    return v1
.end method

.method public bridge synthetic setValue(Ljava/lang/Object;)V
    .locals 0

    .line 12
    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/blacklist/device/classifiers/AppVersionLessThanOrEqualClassifier;->setValue(Ljava/lang/Void;)V

    return-void
.end method

.method public setValue(Ljava/lang/Void;)V
    .locals 0

    return-void
.end method
