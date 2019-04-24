.class public Lcom/ibotta/android/blacklist/classifiers/StringRegexClassifier;
.super Ljava/lang/Object;
.source "StringRegexClassifier.java"

# interfaces
.implements Lcom/ibotta/android/blacklist/BlacklistClassifier;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/ibotta/android/blacklist/BlacklistClassifier<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field private final criteria:Ljava/lang/String;

.field private value:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    iput-object p1, p0, Lcom/ibotta/android/blacklist/classifiers/StringRegexClassifier;->criteria:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public isClassified()Z
    .locals 2

    .line 25
    iget-object v0, p0, Lcom/ibotta/android/blacklist/classifiers/StringRegexClassifier;->criteria:Ljava/lang/String;

    if-eqz v0, :cond_1

    iget-object v1, p0, Lcom/ibotta/android/blacklist/classifiers/StringRegexClassifier;->value:Ljava/lang/String;

    if-nez v1, :cond_0

    goto :goto_0

    .line 29
    :cond_0
    invoke-static {v0}, Lcom/google/code/regexp/Pattern;->compile(Ljava/lang/String;)Lcom/google/code/regexp/Pattern;

    move-result-object v0

    .line 30
    iget-object v1, p0, Lcom/ibotta/android/blacklist/classifiers/StringRegexClassifier;->value:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/google/code/regexp/Pattern;->matcher(Ljava/lang/CharSequence;)Lcom/google/code/regexp/Matcher;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/code/regexp/Matcher;->matches()Z

    move-result v0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x0

    return v0
.end method

.method public bridge synthetic setValue(Ljava/lang/Object;)V
    .locals 0

    .line 10
    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/blacklist/classifiers/StringRegexClassifier;->setValue(Ljava/lang/String;)V

    return-void
.end method

.method public setValue(Ljava/lang/String;)V
    .locals 0

    .line 20
    iput-object p1, p0, Lcom/ibotta/android/blacklist/classifiers/StringRegexClassifier;->value:Ljava/lang/String;

    return-void
.end method
