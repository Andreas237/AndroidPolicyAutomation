.class public Lcom/ibotta/android/blacklist/classifiers/IntLessThanOrEqualClassifier;
.super Ljava/lang/Object;
.source "IntLessThanOrEqualClassifier.java"

# interfaces
.implements Lcom/ibotta/android/blacklist/BlacklistClassifier;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/ibotta/android/blacklist/BlacklistClassifier<",
        "Ljava/lang/Integer;",
        ">;"
    }
.end annotation


# instance fields
.field private final criteria:Ljava/lang/Integer;

.field private final factory:Lcom/ibotta/android/blacklist/BlacklistClassifierFactory;

.field private value:Ljava/lang/Integer;


# direct methods
.method public constructor <init>(Ljava/lang/Integer;Lcom/ibotta/android/blacklist/BlacklistClassifierFactory;)V
    .locals 0

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    iput-object p1, p0, Lcom/ibotta/android/blacklist/classifiers/IntLessThanOrEqualClassifier;->criteria:Ljava/lang/Integer;

    .line 18
    iput-object p2, p0, Lcom/ibotta/android/blacklist/classifiers/IntLessThanOrEqualClassifier;->factory:Lcom/ibotta/android/blacklist/BlacklistClassifierFactory;

    return-void
.end method


# virtual methods
.method public isClassified()Z
    .locals 5

    .line 28
    iget-object v0, p0, Lcom/ibotta/android/blacklist/classifiers/IntLessThanOrEqualClassifier;->criteria:Ljava/lang/Integer;

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/ibotta/android/blacklist/classifiers/IntLessThanOrEqualClassifier;->value:Ljava/lang/Integer;

    if-nez v0, :cond_0

    goto :goto_0

    .line 32
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/blacklist/classifiers/IntLessThanOrEqualClassifier;->factory:Lcom/ibotta/android/blacklist/BlacklistClassifierFactory;

    sget-object v2, Lcom/ibotta/android/blacklist/BlacklistClassifierType;->INT_LESS_THAN:Lcom/ibotta/android/blacklist/BlacklistClassifierType;

    iget-object v3, p0, Lcom/ibotta/android/blacklist/classifiers/IntLessThanOrEqualClassifier;->criteria:Ljava/lang/Integer;

    invoke-virtual {v0, v2, v3}, Lcom/ibotta/android/blacklist/BlacklistClassifierFactory;->create(Lcom/ibotta/android/blacklist/BlacklistClassifierType;Ljava/lang/Object;)Lcom/ibotta/android/blacklist/BlacklistClassifier;

    move-result-object v0

    .line 33
    iget-object v2, p0, Lcom/ibotta/android/blacklist/classifiers/IntLessThanOrEqualClassifier;->value:Ljava/lang/Integer;

    invoke-interface {v0, v2}, Lcom/ibotta/android/blacklist/BlacklistClassifier;->setValue(Ljava/lang/Object;)V

    .line 35
    iget-object v2, p0, Lcom/ibotta/android/blacklist/classifiers/IntLessThanOrEqualClassifier;->factory:Lcom/ibotta/android/blacklist/BlacklistClassifierFactory;

    sget-object v3, Lcom/ibotta/android/blacklist/BlacklistClassifierType;->INT_EQUAL:Lcom/ibotta/android/blacklist/BlacklistClassifierType;

    iget-object v4, p0, Lcom/ibotta/android/blacklist/classifiers/IntLessThanOrEqualClassifier;->criteria:Ljava/lang/Integer;

    invoke-virtual {v2, v3, v4}, Lcom/ibotta/android/blacklist/BlacklistClassifierFactory;->create(Lcom/ibotta/android/blacklist/BlacklistClassifierType;Ljava/lang/Object;)Lcom/ibotta/android/blacklist/BlacklistClassifier;

    move-result-object v2

    .line 36
    iget-object v3, p0, Lcom/ibotta/android/blacklist/classifiers/IntLessThanOrEqualClassifier;->value:Ljava/lang/Integer;

    invoke-interface {v2, v3}, Lcom/ibotta/android/blacklist/BlacklistClassifier;->setValue(Ljava/lang/Object;)V

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

    :cond_3
    :goto_0
    return v1
.end method

.method public setValue(Ljava/lang/Integer;)V
    .locals 0

    .line 23
    iput-object p1, p0, Lcom/ibotta/android/blacklist/classifiers/IntLessThanOrEqualClassifier;->value:Ljava/lang/Integer;

    return-void
.end method

.method public bridge synthetic setValue(Ljava/lang/Object;)V
    .locals 0

    .line 11
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/blacklist/classifiers/IntLessThanOrEqualClassifier;->setValue(Ljava/lang/Integer;)V

    return-void
.end method
