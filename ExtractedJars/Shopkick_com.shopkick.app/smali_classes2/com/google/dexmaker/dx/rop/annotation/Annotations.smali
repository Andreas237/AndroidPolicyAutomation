.class public final Lcom/google/dexmaker/dx/rop/annotation/Annotations;
.super Lcom/google/dexmaker/dx/util/MutabilityControl;
.source "Annotations.java"

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/dexmaker/dx/util/MutabilityControl;",
        "Ljava/lang/Comparable<",
        "Lcom/google/dexmaker/dx/rop/annotation/Annotations;",
        ">;"
    }
.end annotation


# static fields
.field public static final EMPTY:Lcom/google/dexmaker/dx/rop/annotation/Annotations;


# instance fields
.field private final annotations:Ljava/util/TreeMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/TreeMap<",
            "Lcom/google/dexmaker/dx/rop/cst/CstType;",
            "Lcom/google/dexmaker/dx/rop/annotation/Annotation;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 33
    new-instance v0, Lcom/google/dexmaker/dx/rop/annotation/Annotations;

    invoke-direct {v0}, Lcom/google/dexmaker/dx/rop/annotation/Annotations;-><init>()V

    sput-object v0, Lcom/google/dexmaker/dx/rop/annotation/Annotations;->EMPTY:Lcom/google/dexmaker/dx/rop/annotation/Annotations;

    .line 36
    sget-object v0, Lcom/google/dexmaker/dx/rop/annotation/Annotations;->EMPTY:Lcom/google/dexmaker/dx/rop/annotation/Annotations;

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/rop/annotation/Annotations;->setImmutable()V

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 86
    invoke-direct {p0}, Lcom/google/dexmaker/dx/util/MutabilityControl;-><init>()V

    .line 87
    new-instance v0, Ljava/util/TreeMap;

    invoke-direct {v0}, Ljava/util/TreeMap;-><init>()V

    iput-object v0, p0, Lcom/google/dexmaker/dx/rop/annotation/Annotations;->annotations:Ljava/util/TreeMap;

    return-void
.end method

.method public static combine(Lcom/google/dexmaker/dx/rop/annotation/Annotations;Lcom/google/dexmaker/dx/rop/annotation/Annotation;)Lcom/google/dexmaker/dx/rop/annotation/Annotations;
    .locals 1

    .line 74
    new-instance v0, Lcom/google/dexmaker/dx/rop/annotation/Annotations;

    invoke-direct {v0}, Lcom/google/dexmaker/dx/rop/annotation/Annotations;-><init>()V

    .line 76
    invoke-virtual {v0, p0}, Lcom/google/dexmaker/dx/rop/annotation/Annotations;->addAll(Lcom/google/dexmaker/dx/rop/annotation/Annotations;)V

    .line 77
    invoke-virtual {v0, p1}, Lcom/google/dexmaker/dx/rop/annotation/Annotations;->add(Lcom/google/dexmaker/dx/rop/annotation/Annotation;)V

    .line 78
    invoke-virtual {v0}, Lcom/google/dexmaker/dx/rop/annotation/Annotations;->setImmutable()V

    return-object v0
.end method

.method public static combine(Lcom/google/dexmaker/dx/rop/annotation/Annotations;Lcom/google/dexmaker/dx/rop/annotation/Annotations;)Lcom/google/dexmaker/dx/rop/annotation/Annotations;
    .locals 1

    .line 53
    new-instance v0, Lcom/google/dexmaker/dx/rop/annotation/Annotations;

    invoke-direct {v0}, Lcom/google/dexmaker/dx/rop/annotation/Annotations;-><init>()V

    .line 55
    invoke-virtual {v0, p0}, Lcom/google/dexmaker/dx/rop/annotation/Annotations;->addAll(Lcom/google/dexmaker/dx/rop/annotation/Annotations;)V

    .line 56
    invoke-virtual {v0, p1}, Lcom/google/dexmaker/dx/rop/annotation/Annotations;->addAll(Lcom/google/dexmaker/dx/rop/annotation/Annotations;)V

    .line 57
    invoke-virtual {v0}, Lcom/google/dexmaker/dx/rop/annotation/Annotations;->setImmutable()V

    return-object v0
.end method


# virtual methods
.method public add(Lcom/google/dexmaker/dx/rop/annotation/Annotation;)V
    .locals 3

    .line 169
    invoke-virtual {p0}, Lcom/google/dexmaker/dx/rop/annotation/Annotations;->throwIfImmutable()V

    if-eqz p1, :cond_1

    .line 175
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/rop/annotation/Annotation;->getType()Lcom/google/dexmaker/dx/rop/cst/CstType;

    move-result-object v0

    .line 177
    iget-object v1, p0, Lcom/google/dexmaker/dx/rop/annotation/Annotations;->annotations:Ljava/util/TreeMap;

    invoke-virtual {v1, v0}, Ljava/util/TreeMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 182
    iget-object v1, p0, Lcom/google/dexmaker/dx/rop/annotation/Annotations;->annotations:Ljava/util/TreeMap;

    invoke-virtual {v1, v0, p1}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 178
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "duplicate type: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/rop/cst/CstType;->toHuman()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 172
    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "annotation == null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public addAll(Lcom/google/dexmaker/dx/rop/annotation/Annotations;)V
    .locals 1

    .line 193
    invoke-virtual {p0}, Lcom/google/dexmaker/dx/rop/annotation/Annotations;->throwIfImmutable()V

    if-eqz p1, :cond_1

    .line 199
    iget-object p1, p1, Lcom/google/dexmaker/dx/rop/annotation/Annotations;->annotations:Ljava/util/TreeMap;

    invoke-virtual {p1}, Ljava/util/TreeMap;->values()Ljava/util/Collection;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/dexmaker/dx/rop/annotation/Annotation;

    .line 200
    invoke-virtual {p0, v0}, Lcom/google/dexmaker/dx/rop/annotation/Annotations;->add(Lcom/google/dexmaker/dx/rop/annotation/Annotation;)V

    goto :goto_0

    :cond_0
    return-void

    .line 196
    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    const-string/jumbo v0, "toAdd == null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public compareTo(Lcom/google/dexmaker/dx/rop/annotation/Annotations;)I
    .locals 3

    .line 110
    iget-object v0, p0, Lcom/google/dexmaker/dx/rop/annotation/Annotations;->annotations:Ljava/util/TreeMap;

    invoke-virtual {v0}, Ljava/util/TreeMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .line 111
    iget-object p1, p1, Lcom/google/dexmaker/dx/rop/annotation/Annotations;->annotations:Ljava/util/TreeMap;

    invoke-virtual {p1}, Ljava/util/TreeMap;->values()Ljava/util/Collection;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    .line 113
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 114
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/dexmaker/dx/rop/annotation/Annotation;

    .line 115
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/dexmaker/dx/rop/annotation/Annotation;

    .line 117
    invoke-virtual {v1, v2}, Lcom/google/dexmaker/dx/rop/annotation/Annotation;->compareTo(Lcom/google/dexmaker/dx/rop/annotation/Annotation;)I

    move-result v1

    if-eqz v1, :cond_0

    return v1

    .line 123
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 p1, 0x1

    return p1

    .line 125
    :cond_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_3

    const/4 p1, -0x1

    return p1

    :cond_3
    const/4 p1, 0x0

    return p1
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 30
    check-cast p1, Lcom/google/dexmaker/dx/rop/annotation/Annotations;

    invoke-virtual {p0, p1}, Lcom/google/dexmaker/dx/rop/annotation/Annotations;->compareTo(Lcom/google/dexmaker/dx/rop/annotation/Annotations;)I

    move-result p1

    return p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    .line 99
    instance-of v0, p1, Lcom/google/dexmaker/dx/rop/annotation/Annotations;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 103
    :cond_0
    check-cast p1, Lcom/google/dexmaker/dx/rop/annotation/Annotations;

    .line 105
    iget-object v0, p0, Lcom/google/dexmaker/dx/rop/annotation/Annotations;->annotations:Ljava/util/TreeMap;

    iget-object p1, p1, Lcom/google/dexmaker/dx/rop/annotation/Annotations;->annotations:Ljava/util/TreeMap;

    invoke-virtual {v0, p1}, Ljava/util/TreeMap;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public getAnnotations()Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "Lcom/google/dexmaker/dx/rop/annotation/Annotation;",
            ">;"
        }
    .end annotation

    .line 211
    iget-object v0, p0, Lcom/google/dexmaker/dx/rop/annotation/Annotations;->annotations:Ljava/util/TreeMap;

    invoke-virtual {v0}, Ljava/util/TreeMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableCollection(Ljava/util/Collection;)Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    .line 93
    iget-object v0, p0, Lcom/google/dexmaker/dx/rop/annotation/Annotations;->annotations:Ljava/util/TreeMap;

    invoke-virtual {v0}, Ljava/util/TreeMap;->hashCode()I

    move-result v0

    return v0
.end method

.method public size()I
    .locals 1

    .line 158
    iget-object v0, p0, Lcom/google/dexmaker/dx/rop/annotation/Annotations;->annotations:Ljava/util/TreeMap;

    invoke-virtual {v0}, Ljava/util/TreeMap;->size()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    .line 134
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "annotations{"

    .line 137
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 139
    iget-object v1, p0, Lcom/google/dexmaker/dx/rop/annotation/Annotations;->annotations:Ljava/util/TreeMap;

    invoke-virtual {v1}, Ljava/util/TreeMap;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v2, 0x1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/dexmaker/dx/rop/annotation/Annotation;

    if-eqz v2, :cond_0

    const/4 v2, 0x0

    goto :goto_1

    :cond_0
    const-string v4, ", "

    .line 143
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 145
    :goto_1
    invoke-virtual {v3}, Lcom/google/dexmaker/dx/rop/annotation/Annotation;->toHuman()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_1
    const-string/jumbo v1, "}"

    .line 148
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 149
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
