.class public abstract Lcom/google/c/b/x;
.super Ljava/lang/Object;
.source "IMASDK"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/util/Comparator<",
        "TT;>;"
    }
.end annotation


# direct methods
.method protected constructor <init>()V
    .locals 0

    .line 390
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/util/Comparator;)Lcom/google/c/b/x;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Comparator<",
            "TT;>;)",
            "Lcom/google/c/b/x<",
            "TT;>;"
        }
    .end annotation

    .line 181
    instance-of v0, p0, Lcom/google/c/b/x;

    if-eqz v0, :cond_0

    .line 182
    check-cast p0, Lcom/google/c/b/x;

    goto :goto_0

    .line 183
    :cond_0
    new-instance v0, Lcom/google/c/b/g;

    invoke-direct {v0, p0}, Lcom/google/c/b/g;-><init>(Ljava/util/Comparator;)V

    move-object p0, v0

    :goto_0
    return-object p0
.end method


# virtual methods
.method public a(Lcom/google/c/a/c;)Lcom/google/c/b/x;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<F:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/c/a/c<",
            "TF;+TT;>;)",
            "Lcom/google/c/b/x<",
            "TF;>;"
        }
    .end annotation

    .line 448
    new-instance v0, Lcom/google/c/b/d;

    invoke-direct {v0, p1, p0}, Lcom/google/c/b/d;-><init>(Lcom/google/c/a/c;Lcom/google/c/b/x;)V

    return-object v0
.end method

.method public abstract compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;TT;)I"
        }
    .end annotation
.end method
