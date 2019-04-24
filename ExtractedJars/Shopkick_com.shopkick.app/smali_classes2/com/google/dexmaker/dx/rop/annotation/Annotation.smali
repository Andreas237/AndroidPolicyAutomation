.class public final Lcom/google/dexmaker/dx/rop/annotation/Annotation;
.super Lcom/google/dexmaker/dx/util/MutabilityControl;
.source "Annotation.java"

# interfaces
.implements Ljava/lang/Comparable;
.implements Lcom/google/dexmaker/dx/util/ToHuman;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/dexmaker/dx/util/MutabilityControl;",
        "Ljava/lang/Comparable<",
        "Lcom/google/dexmaker/dx/rop/annotation/Annotation;",
        ">;",
        "Lcom/google/dexmaker/dx/util/ToHuman;"
    }
.end annotation


# instance fields
.field private final elements:Ljava/util/TreeMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/TreeMap<",
            "Lcom/google/dexmaker/dx/rop/cst/CstString;",
            "Lcom/google/dexmaker/dx/rop/annotation/NameValuePair;",
            ">;"
        }
    .end annotation
.end field

.field private final type:Lcom/google/dexmaker/dx/rop/cst/CstType;

.field private final visibility:Lcom/google/dexmaker/dx/rop/annotation/AnnotationVisibility;


# direct methods
.method public constructor <init>(Lcom/google/dexmaker/dx/rop/cst/CstType;Lcom/google/dexmaker/dx/rop/annotation/AnnotationVisibility;)V
    .locals 0

    .line 51
    invoke-direct {p0}, Lcom/google/dexmaker/dx/util/MutabilityControl;-><init>()V

    if-eqz p1, :cond_1

    if-eqz p2, :cond_0

    .line 60
    iput-object p1, p0, Lcom/google/dexmaker/dx/rop/annotation/Annotation;->type:Lcom/google/dexmaker/dx/rop/cst/CstType;

    .line 61
    iput-object p2, p0, Lcom/google/dexmaker/dx/rop/annotation/Annotation;->visibility:Lcom/google/dexmaker/dx/rop/annotation/AnnotationVisibility;

    .line 62
    new-instance p1, Ljava/util/TreeMap;

    invoke-direct {p1}, Ljava/util/TreeMap;-><init>()V

    iput-object p1, p0, Lcom/google/dexmaker/dx/rop/annotation/Annotation;->elements:Ljava/util/TreeMap;

    return-void

    .line 57
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string/jumbo p2, "visibility == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 53
    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    const-string/jumbo p2, "type == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public add(Lcom/google/dexmaker/dx/rop/annotation/NameValuePair;)V
    .locals 3

    .line 200
    invoke-virtual {p0}, Lcom/google/dexmaker/dx/rop/annotation/Annotation;->throwIfImmutable()V

    if-eqz p1, :cond_1

    .line 206
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/rop/annotation/NameValuePair;->getName()Lcom/google/dexmaker/dx/rop/cst/CstString;

    move-result-object v0

    .line 208
    iget-object v1, p0, Lcom/google/dexmaker/dx/rop/annotation/Annotation;->elements:Ljava/util/TreeMap;

    invoke-virtual {v1, v0}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_0

    .line 212
    iget-object v1, p0, Lcom/google/dexmaker/dx/rop/annotation/Annotation;->elements:Ljava/util/TreeMap;

    invoke-virtual {v1, v0, p1}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 209
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "name already added: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 203
    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "pair == null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public compareTo(Lcom/google/dexmaker/dx/rop/annotation/Annotation;)I
    .locals 3

    .line 92
    iget-object v0, p0, Lcom/google/dexmaker/dx/rop/annotation/Annotation;->type:Lcom/google/dexmaker/dx/rop/cst/CstType;

    iget-object v1, p1, Lcom/google/dexmaker/dx/rop/annotation/Annotation;->type:Lcom/google/dexmaker/dx/rop/cst/CstType;

    invoke-virtual {v0, v1}, Lcom/google/dexmaker/dx/rop/cst/CstType;->compareTo(Lcom/google/dexmaker/dx/rop/cst/Constant;)I

    move-result v0

    if-eqz v0, :cond_0

    return v0

    .line 98
    :cond_0
    iget-object v0, p0, Lcom/google/dexmaker/dx/rop/annotation/Annotation;->visibility:Lcom/google/dexmaker/dx/rop/annotation/AnnotationVisibility;

    iget-object v1, p1, Lcom/google/dexmaker/dx/rop/annotation/Annotation;->visibility:Lcom/google/dexmaker/dx/rop/annotation/AnnotationVisibility;

    invoke-virtual {v0, v1}, Lcom/google/dexmaker/dx/rop/annotation/AnnotationVisibility;->compareTo(Ljava/lang/Enum;)I

    move-result v0

    if-eqz v0, :cond_1

    return v0

    .line 104
    :cond_1
    iget-object v0, p0, Lcom/google/dexmaker/dx/rop/annotation/Annotation;->elements:Ljava/util/TreeMap;

    invoke-virtual {v0}, Ljava/util/TreeMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .line 105
    iget-object p1, p1, Lcom/google/dexmaker/dx/rop/annotation/Annotation;->elements:Ljava/util/TreeMap;

    invoke-virtual {p1}, Ljava/util/TreeMap;->values()Ljava/util/Collection;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    .line 107
    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 108
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/dexmaker/dx/rop/annotation/NameValuePair;

    .line 109
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/dexmaker/dx/rop/annotation/NameValuePair;

    .line 111
    invoke-virtual {v1, v2}, Lcom/google/dexmaker/dx/rop/annotation/NameValuePair;->compareTo(Lcom/google/dexmaker/dx/rop/annotation/NameValuePair;)I

    move-result v1

    if-eqz v1, :cond_2

    return v1

    .line 117
    :cond_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    const/4 p1, 0x1

    return p1

    .line 119
    :cond_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_5

    const/4 p1, -0x1

    return p1

    :cond_5
    const/4 p1, 0x0

    return p1
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 34
    check-cast p1, Lcom/google/dexmaker/dx/rop/annotation/Annotation;

    invoke-virtual {p0, p1}, Lcom/google/dexmaker/dx/rop/annotation/Annotation;->compareTo(Lcom/google/dexmaker/dx/rop/annotation/Annotation;)I

    move-result p1

    return p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    .line 68
    instance-of v0, p1, Lcom/google/dexmaker/dx/rop/annotation/Annotation;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 72
    :cond_0
    check-cast p1, Lcom/google/dexmaker/dx/rop/annotation/Annotation;

    .line 74
    iget-object v0, p0, Lcom/google/dexmaker/dx/rop/annotation/Annotation;->type:Lcom/google/dexmaker/dx/rop/cst/CstType;

    iget-object v2, p1, Lcom/google/dexmaker/dx/rop/annotation/Annotation;->type:Lcom/google/dexmaker/dx/rop/cst/CstType;

    invoke-virtual {v0, v2}, Lcom/google/dexmaker/dx/rop/cst/CstType;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/dexmaker/dx/rop/annotation/Annotation;->visibility:Lcom/google/dexmaker/dx/rop/annotation/AnnotationVisibility;

    iget-object v2, p1, Lcom/google/dexmaker/dx/rop/annotation/Annotation;->visibility:Lcom/google/dexmaker/dx/rop/annotation/AnnotationVisibility;

    if-eq v0, v2, :cond_1

    goto :goto_0

    .line 79
    :cond_1
    iget-object v0, p0, Lcom/google/dexmaker/dx/rop/annotation/Annotation;->elements:Ljava/util/TreeMap;

    iget-object p1, p1, Lcom/google/dexmaker/dx/rop/annotation/Annotation;->elements:Ljava/util/TreeMap;

    invoke-virtual {v0, p1}, Ljava/util/TreeMap;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_2
    :goto_0
    return v1
.end method

.method public getNameValuePairs()Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "Lcom/google/dexmaker/dx/rop/annotation/NameValuePair;",
            ">;"
        }
    .end annotation

    .line 222
    iget-object v0, p0, Lcom/google/dexmaker/dx/rop/annotation/Annotation;->elements:Ljava/util/TreeMap;

    invoke-virtual {v0}, Ljava/util/TreeMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableCollection(Ljava/util/Collection;)Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method

.method public getType()Lcom/google/dexmaker/dx/rop/cst/CstType;
    .locals 1

    .line 163
    iget-object v0, p0, Lcom/google/dexmaker/dx/rop/annotation/Annotation;->type:Lcom/google/dexmaker/dx/rop/cst/CstType;

    return-object v0
.end method

.method public getVisibility()Lcom/google/dexmaker/dx/rop/annotation/AnnotationVisibility;
    .locals 1

    .line 172
    iget-object v0, p0, Lcom/google/dexmaker/dx/rop/annotation/Annotation;->visibility:Lcom/google/dexmaker/dx/rop/annotation/AnnotationVisibility;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    .line 84
    iget-object v0, p0, Lcom/google/dexmaker/dx/rop/annotation/Annotation;->type:Lcom/google/dexmaker/dx/rop/cst/CstType;

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/rop/cst/CstType;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    .line 85
    iget-object v1, p0, Lcom/google/dexmaker/dx/rop/annotation/Annotation;->elements:Ljava/util/TreeMap;

    invoke-virtual {v1}, Ljava/util/TreeMap;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 86
    iget-object v1, p0, Lcom/google/dexmaker/dx/rop/annotation/Annotation;->visibility:Lcom/google/dexmaker/dx/rop/annotation/AnnotationVisibility;

    invoke-virtual {v1}, Lcom/google/dexmaker/dx/rop/annotation/AnnotationVisibility;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public put(Lcom/google/dexmaker/dx/rop/annotation/NameValuePair;)V
    .locals 2

    .line 183
    invoke-virtual {p0}, Lcom/google/dexmaker/dx/rop/annotation/Annotation;->throwIfImmutable()V

    if-eqz p1, :cond_0

    .line 189
    iget-object v0, p0, Lcom/google/dexmaker/dx/rop/annotation/Annotation;->elements:Ljava/util/TreeMap;

    invoke-virtual {p1}, Lcom/google/dexmaker/dx/rop/annotation/NameValuePair;->getName()Lcom/google/dexmaker/dx/rop/cst/CstString;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 186
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "pair == null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public toHuman()Ljava/lang/String;
    .locals 5

    .line 134
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 136
    iget-object v1, p0, Lcom/google/dexmaker/dx/rop/annotation/Annotation;->visibility:Lcom/google/dexmaker/dx/rop/annotation/AnnotationVisibility;

    invoke-virtual {v1}, Lcom/google/dexmaker/dx/rop/annotation/AnnotationVisibility;->toHuman()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "-annotation "

    .line 137
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 138
    iget-object v1, p0, Lcom/google/dexmaker/dx/rop/annotation/Annotation;->type:Lcom/google/dexmaker/dx/rop/cst/CstType;

    invoke-virtual {v1}, Lcom/google/dexmaker/dx/rop/cst/CstType;->toHuman()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " {"

    .line 139
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 142
    iget-object v1, p0, Lcom/google/dexmaker/dx/rop/annotation/Annotation;->elements:Ljava/util/TreeMap;

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

    check-cast v3, Lcom/google/dexmaker/dx/rop/annotation/NameValuePair;

    if-eqz v2, :cond_0

    const/4 v2, 0x0

    goto :goto_1

    :cond_0
    const-string v4, ", "

    .line 146
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 148
    :goto_1
    invoke-virtual {v3}, Lcom/google/dexmaker/dx/rop/annotation/NameValuePair;->getName()Lcom/google/dexmaker/dx/rop/cst/CstString;

    move-result-object v4

    invoke-virtual {v4}, Lcom/google/dexmaker/dx/rop/cst/CstString;->toHuman()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, ": "

    .line 149
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 150
    invoke-virtual {v3}, Lcom/google/dexmaker/dx/rop/annotation/NameValuePair;->getValue()Lcom/google/dexmaker/dx/rop/cst/Constant;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/dexmaker/dx/rop/cst/Constant;->toHuman()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_1
    const-string/jumbo v1, "}"

    .line 153
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 154
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 129
    invoke-virtual {p0}, Lcom/google/dexmaker/dx/rop/annotation/Annotation;->toHuman()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
