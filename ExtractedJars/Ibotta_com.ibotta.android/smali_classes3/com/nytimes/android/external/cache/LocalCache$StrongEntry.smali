.class Lcom/nytimes/android/external/cache/LocalCache$StrongEntry;
.super Lcom/nytimes/android/external/cache/LocalCache$AbstractReferenceEntry;
.source "LocalCache.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/nytimes/android/external/cache/LocalCache;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "StrongEntry"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/nytimes/android/external/cache/LocalCache$AbstractReferenceEntry<",
        "TK;TV;>;"
    }
.end annotation


# instance fields
.field final hash:I

.field final key:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TK;"
        }
    .end annotation
.end field

.field final next:Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry<",
            "TK;TV;>;"
        }
    .end annotation
.end field

.field volatile valueReference:Lcom/nytimes/android/external/cache/LocalCache$ValueReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/nytimes/android/external/cache/LocalCache$ValueReference<",
            "TK;TV;>;"
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method constructor <init>(Ljava/lang/Object;ILcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;I",
            "Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry<",
            "TK;TV;>;)V"
        }
    .end annotation

    .line 1089
    invoke-direct {p0}, Lcom/nytimes/android/external/cache/LocalCache$AbstractReferenceEntry;-><init>()V

    .line 1105
    invoke-static {}, Lcom/nytimes/android/external/cache/LocalCache;->unset()Lcom/nytimes/android/external/cache/LocalCache$ValueReference;

    move-result-object v0

    iput-object v0, p0, Lcom/nytimes/android/external/cache/LocalCache$StrongEntry;->valueReference:Lcom/nytimes/android/external/cache/LocalCache$ValueReference;

    .line 1090
    iput-object p1, p0, Lcom/nytimes/android/external/cache/LocalCache$StrongEntry;->key:Ljava/lang/Object;

    .line 1091
    iput p2, p0, Lcom/nytimes/android/external/cache/LocalCache$StrongEntry;->hash:I

    .line 1092
    iput-object p3, p0, Lcom/nytimes/android/external/cache/LocalCache$StrongEntry;->next:Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    return-void
.end method


# virtual methods
.method public getHash()I
    .locals 1

    .line 1120
    iget v0, p0, Lcom/nytimes/android/external/cache/LocalCache$StrongEntry;->hash:I

    return v0
.end method

.method public getKey()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TK;"
        }
    .end annotation

    .line 1097
    iget-object v0, p0, Lcom/nytimes/android/external/cache/LocalCache$StrongEntry;->key:Ljava/lang/Object;

    return-object v0
.end method

.method public getNext()Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry<",
            "TK;TV;>;"
        }
    .end annotation

    .line 1125
    iget-object v0, p0, Lcom/nytimes/android/external/cache/LocalCache$StrongEntry;->next:Lcom/nytimes/android/external/cache/LocalCache$ReferenceEntry;

    return-object v0
.end method

.method public getValueReference()Lcom/nytimes/android/external/cache/LocalCache$ValueReference;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/nytimes/android/external/cache/LocalCache$ValueReference<",
            "TK;TV;>;"
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 1110
    iget-object v0, p0, Lcom/nytimes/android/external/cache/LocalCache$StrongEntry;->valueReference:Lcom/nytimes/android/external/cache/LocalCache$ValueReference;

    return-object v0
.end method

.method public setValueReference(Lcom/nytimes/android/external/cache/LocalCache$ValueReference;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/nytimes/android/external/cache/LocalCache$ValueReference<",
            "TK;TV;>;)V"
        }
    .end annotation

    .line 1115
    iput-object p1, p0, Lcom/nytimes/android/external/cache/LocalCache$StrongEntry;->valueReference:Lcom/nytimes/android/external/cache/LocalCache$ValueReference;

    return-void
.end method
