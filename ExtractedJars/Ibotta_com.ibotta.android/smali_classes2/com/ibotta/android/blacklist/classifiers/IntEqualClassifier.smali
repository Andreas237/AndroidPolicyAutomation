.class public Lcom/ibotta/android/blacklist/classifiers/IntEqualClassifier;
.super Ljava/lang/Object;
.source "IntEqualClassifier.java"

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
.field protected final criteria:Ljava/lang/Integer;

.field protected value:Ljava/lang/Integer;


# direct methods
.method public constructor <init>(Ljava/lang/Integer;)V
    .locals 0

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    iput-object p1, p0, Lcom/ibotta/android/blacklist/classifiers/IntEqualClassifier;->criteria:Ljava/lang/Integer;

    return-void
.end method


# virtual methods
.method public isClassified()Z
    .locals 2

    .line 24
    iget-object v0, p0, Lcom/ibotta/android/blacklist/classifiers/IntEqualClassifier;->criteria:Ljava/lang/Integer;

    if-eqz v0, :cond_1

    iget-object v1, p0, Lcom/ibotta/android/blacklist/classifiers/IntEqualClassifier;->value:Ljava/lang/Integer;

    if-nez v1, :cond_0

    goto :goto_0

    .line 28
    :cond_0
    invoke-virtual {v0, v1}, Ljava/lang/Integer;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x0

    return v0
.end method

.method public setValue(Ljava/lang/Integer;)V
    .locals 0

    .line 19
    iput-object p1, p0, Lcom/ibotta/android/blacklist/classifiers/IntEqualClassifier;->value:Ljava/lang/Integer;

    return-void
.end method

.method public bridge synthetic setValue(Ljava/lang/Object;)V
    .locals 0

    .line 9
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/blacklist/classifiers/IntEqualClassifier;->setValue(Ljava/lang/Integer;)V

    return-void
.end method
