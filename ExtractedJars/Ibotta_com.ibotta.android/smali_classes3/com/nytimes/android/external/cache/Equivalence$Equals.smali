.class final Lcom/nytimes/android/external/cache/Equivalence$Equals;
.super Lcom/nytimes/android/external/cache/Equivalence;
.source "Equivalence.java"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/nytimes/android/external/cache/Equivalence;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "Equals"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/nytimes/android/external/cache/Equivalence<",
        "Ljava/lang/Object;",
        ">;",
        "Ljava/io/Serializable;"
    }
.end annotation


# static fields
.field static final INSTANCE:Lcom/nytimes/android/external/cache/Equivalence$Equals;

.field private static final serialVersionUID:J = 0x1L


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 144
    new-instance v0, Lcom/nytimes/android/external/cache/Equivalence$Equals;

    invoke-direct {v0}, Lcom/nytimes/android/external/cache/Equivalence$Equals;-><init>()V

    sput-object v0, Lcom/nytimes/android/external/cache/Equivalence$Equals;->INSTANCE:Lcom/nytimes/android/external/cache/Equivalence$Equals;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    .line 142
    invoke-direct {p0}, Lcom/nytimes/android/external/cache/Equivalence;-><init>()V

    return-void
.end method

.method private readResolve()Ljava/lang/Object;
    .locals 1
    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation

    .line 158
    sget-object v0, Lcom/nytimes/android/external/cache/Equivalence$Equals;->INSTANCE:Lcom/nytimes/android/external/cache/Equivalence$Equals;

    return-object v0
.end method


# virtual methods
.method protected doEquivalent(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param

    .line 148
    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method protected doHash(Ljava/lang/Object;)I
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param

    .line 153
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result p1

    return p1
.end method
