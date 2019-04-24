.class public Lcom/ibotta/android/blacklist/classifiers/NoOpClassifier;
.super Ljava/lang/Object;
.source "NoOpClassifier.java"

# interfaces
.implements Lcom/ibotta/android/blacklist/BlacklistClassifier;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/ibotta/android/blacklist/BlacklistClassifier<",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public isClassified()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public setValue(Ljava/lang/Object;)V
    .locals 0

    return-void
.end method
