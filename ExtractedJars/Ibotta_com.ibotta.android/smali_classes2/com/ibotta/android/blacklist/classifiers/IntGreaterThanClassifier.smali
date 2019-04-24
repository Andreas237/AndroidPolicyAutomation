.class public Lcom/ibotta/android/blacklist/classifiers/IntGreaterThanClassifier;
.super Ljava/lang/Object;
.source "IntGreaterThanClassifier.java"

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

.field private value:Ljava/lang/Integer;


# direct methods
.method public constructor <init>(Ljava/lang/Integer;)V
    .locals 0

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    iput-object p1, p0, Lcom/ibotta/android/blacklist/classifiers/IntGreaterThanClassifier;->criteria:Ljava/lang/Integer;

    return-void
.end method


# virtual methods
.method public isClassified()Z
    .locals 3

    .line 24
    iget-object v0, p0, Lcom/ibotta/android/blacklist/classifiers/IntGreaterThanClassifier;->criteria:Ljava/lang/Integer;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/ibotta/android/blacklist/classifiers/IntGreaterThanClassifier;->value:Ljava/lang/Integer;

    if-nez v0, :cond_0

    goto :goto_0

    .line 28
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iget-object v2, p0, Lcom/ibotta/android/blacklist/classifiers/IntGreaterThanClassifier;->criteria:Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    if-le v0, v2, :cond_1

    const/4 v1, 0x1

    :cond_1
    return v1

    :cond_2
    :goto_0
    return v1
.end method

.method public setValue(Ljava/lang/Integer;)V
    .locals 0

    .line 19
    iput-object p1, p0, Lcom/ibotta/android/blacklist/classifiers/IntGreaterThanClassifier;->value:Ljava/lang/Integer;

    return-void
.end method

.method public bridge synthetic setValue(Ljava/lang/Object;)V
    .locals 0

    .line 9
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/blacklist/classifiers/IntGreaterThanClassifier;->setValue(Ljava/lang/Integer;)V

    return-void
.end method
