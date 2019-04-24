.class public Lcom/ibotta/android/blacklist/classifiers/StringNotEqualClassifier;
.super Lcom/ibotta/android/blacklist/classifiers/StringEqualClassifier;
.source "StringNotEqualClassifier.java"


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 9
    invoke-direct {p0, p1}, Lcom/ibotta/android/blacklist/classifiers/StringEqualClassifier;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public isClassified()Z
    .locals 1

    .line 14
    iget-object v0, p0, Lcom/ibotta/android/blacklist/classifiers/StringNotEqualClassifier;->criteria:Ljava/lang/String;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/ibotta/android/blacklist/classifiers/StringNotEqualClassifier;->value:Ljava/lang/String;

    if-nez v0, :cond_0

    goto :goto_0

    .line 18
    :cond_0
    invoke-super {p0}, Lcom/ibotta/android/blacklist/classifiers/StringEqualClassifier;->isClassified()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x0

    return v0
.end method
