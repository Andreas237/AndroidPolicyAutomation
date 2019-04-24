.class public Lcom/ibotta/android/timber/IbottaReleaseTree;
.super Lcom/ibotta/android/timber/IbottaTree;
.source "IbottaReleaseTree.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 8
    invoke-direct {p0}, Lcom/ibotta/android/timber/IbottaTree;-><init>()V

    return-void
.end method


# virtual methods
.method protected isLoggable(I)Z
    .locals 1

    const/4 v0, 0x5

    if-lt p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method
