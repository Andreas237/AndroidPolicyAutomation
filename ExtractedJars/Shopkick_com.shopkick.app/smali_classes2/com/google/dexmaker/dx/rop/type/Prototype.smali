.class public final Lcom/google/dexmaker/dx/rop/type/Prototype;
.super Ljava/lang/Object;
.source "Prototype.java"

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Comparable<",
        "Lcom/google/dexmaker/dx/rop/type/Prototype;",
        ">;"
    }
.end annotation


# static fields
.field private static final internTable:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lcom/google/dexmaker/dx/rop/type/Prototype;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final descriptor:Ljava/lang/String;

.field private parameterFrameTypes:Lcom/google/dexmaker/dx/rop/type/StdTypeList;

.field private final parameterTypes:Lcom/google/dexmaker/dx/rop/type/StdTypeList;

.field private final returnType:Lcom/google/dexmaker/dx/rop/type/Type;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 28
    new-instance v0, Ljava/util/HashMap;

    const/16 v1, 0x1f4

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    sput-object v0, Lcom/google/dexmaker/dx/rop/type/Prototype;->internTable:Ljava/util/HashMap;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;Lcom/google/dexmaker/dx/rop/type/Type;Lcom/google/dexmaker/dx/rop/type/StdTypeList;)V
    .locals 0

    .line 216
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_2

    if-eqz p2, :cond_1

    if-eqz p3, :cond_0

    .line 229
    iput-object p1, p0, Lcom/google/dexmaker/dx/rop/type/Prototype;->descriptor:Ljava/lang/String;

    .line 230
    iput-object p2, p0, Lcom/google/dexmaker/dx/rop/type/Prototype;->returnType:Lcom/google/dexmaker/dx/rop/type/Type;

    .line 231
    iput-object p3, p0, Lcom/google/dexmaker/dx/rop/type/Prototype;->parameterTypes:Lcom/google/dexmaker/dx/rop/type/StdTypeList;

    const/4 p1, 0x0

    .line 232
    iput-object p1, p0, Lcom/google/dexmaker/dx/rop/type/Prototype;->parameterFrameTypes:Lcom/google/dexmaker/dx/rop/type/StdTypeList;

    return-void

    .line 226
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "parameterTypes == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 222
    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "returnType == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 218
    :cond_2
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "descriptor == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static intern(Ljava/lang/String;)Lcom/google/dexmaker/dx/rop/type/Prototype;
    .locals 8

    if-eqz p0, :cond_6

    .line 59
    sget-object v0, Lcom/google/dexmaker/dx/rop/type/Prototype;->internTable:Ljava/util/HashMap;

    monitor-enter v0

    .line 60
    :try_start_0
    sget-object v1, Lcom/google/dexmaker/dx/rop/type/Prototype;->internTable:Ljava/util/HashMap;

    invoke-virtual {v1, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/dexmaker/dx/rop/type/Prototype;

    .line 61
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    return-object v1

    .line 66
    :cond_0
    invoke-static {p0}, Lcom/google/dexmaker/dx/rop/type/Prototype;->makeParameterArray(Ljava/lang/String;)[Lcom/google/dexmaker/dx/rop/type/Type;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    move v4, v2

    move v0, v3

    .line 72
    :goto_0
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result v5

    const/16 v6, 0x29

    if-ne v5, v6, :cond_2

    add-int/2addr v0, v3

    .line 100
    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/dexmaker/dx/rop/type/Type;->internReturnType(Ljava/lang/String;)Lcom/google/dexmaker/dx/rop/type/Type;

    move-result-object v0

    .line 101
    new-instance v3, Lcom/google/dexmaker/dx/rop/type/StdTypeList;

    invoke-direct {v3, v4}, Lcom/google/dexmaker/dx/rop/type/StdTypeList;-><init>(I)V

    :goto_1
    if-ge v2, v4, :cond_1

    .line 104
    aget-object v5, v1, v2

    invoke-virtual {v3, v2, v5}, Lcom/google/dexmaker/dx/rop/type/StdTypeList;->set(ILcom/google/dexmaker/dx/rop/type/Type;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 107
    :cond_1
    new-instance v1, Lcom/google/dexmaker/dx/rop/type/Prototype;

    invoke-direct {v1, p0, v0, v3}, Lcom/google/dexmaker/dx/rop/type/Prototype;-><init>(Ljava/lang/String;Lcom/google/dexmaker/dx/rop/type/Type;Lcom/google/dexmaker/dx/rop/type/StdTypeList;)V

    .line 108
    invoke-static {v1}, Lcom/google/dexmaker/dx/rop/type/Prototype;->putIntern(Lcom/google/dexmaker/dx/rop/type/Prototype;)Lcom/google/dexmaker/dx/rop/type/Prototype;

    move-result-object p0

    return-object p0

    :cond_2
    move v6, v0

    :goto_2
    const/16 v7, 0x5b

    if-ne v5, v7, :cond_3

    add-int/lit8 v6, v6, 0x1

    .line 81
    invoke-virtual {p0, v6}, Ljava/lang/String;->charAt(I)C

    move-result v5

    goto :goto_2

    :cond_3
    const/16 v7, 0x4c

    if-ne v5, v7, :cond_5

    const/16 v5, 0x3b

    .line 86
    invoke-virtual {p0, v5, v6}, Ljava/lang/String;->indexOf(II)I

    move-result v5

    const/4 v6, -0x1

    if-eq v5, v6, :cond_4

    add-int/lit8 v5, v5, 0x1

    goto :goto_3

    .line 88
    :cond_4
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "bad descriptor"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_5
    add-int/lit8 v6, v6, 0x1

    move v5, v6

    .line 95
    :goto_3
    invoke-virtual {p0, v0, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/dexmaker/dx/rop/type/Type;->intern(Ljava/lang/String;)Lcom/google/dexmaker/dx/rop/type/Type;

    move-result-object v0

    aput-object v0, v1, v4

    add-int/lit8 v4, v4, 0x1

    move v0, v5

    goto :goto_0

    :catchall_0
    move-exception p0

    .line 61
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0

    .line 55
    :cond_6
    new-instance p0, Ljava/lang/NullPointerException;

    const-string v0, "descriptor == null"

    invoke-direct {p0, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static intern(Ljava/lang/String;Lcom/google/dexmaker/dx/rop/type/Type;ZZ)Lcom/google/dexmaker/dx/rop/type/Prototype;
    .locals 0

    .line 170
    invoke-static {p0}, Lcom/google/dexmaker/dx/rop/type/Prototype;->intern(Ljava/lang/String;)Lcom/google/dexmaker/dx/rop/type/Prototype;

    move-result-object p0

    if-eqz p2, :cond_0

    return-object p0

    :cond_0
    if-eqz p3, :cond_1

    const p2, 0x7fffffff

    .line 177
    invoke-virtual {p1, p2}, Lcom/google/dexmaker/dx/rop/type/Type;->asUninitialized(I)Lcom/google/dexmaker/dx/rop/type/Type;

    move-result-object p1

    .line 180
    :cond_1
    invoke-virtual {p0, p1}, Lcom/google/dexmaker/dx/rop/type/Prototype;->withFirstParameter(Lcom/google/dexmaker/dx/rop/type/Type;)Lcom/google/dexmaker/dx/rop/type/Prototype;

    move-result-object p0

    return-object p0
.end method

.method public static internInts(Lcom/google/dexmaker/dx/rop/type/Type;I)Lcom/google/dexmaker/dx/rop/type/Prototype;
    .locals 3

    .line 194
    new-instance v0, Ljava/lang/StringBuffer;

    const/16 v1, 0x64

    invoke-direct {v0, v1}, Ljava/lang/StringBuffer;-><init>(I)V

    const/16 v1, 0x28

    .line 196
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p1, :cond_0

    const/16 v2, 0x49

    .line 199
    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    const/16 p1, 0x29

    .line 202
    invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 203
    invoke-virtual {p0}, Lcom/google/dexmaker/dx/rop/type/Type;->getDescriptor()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 206
    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/google/dexmaker/dx/rop/type/Prototype;->intern(Ljava/lang/String;)Lcom/google/dexmaker/dx/rop/type/Prototype;

    move-result-object p0

    return-object p0
.end method

.method private static makeParameterArray(Ljava/lang/String;)[Lcom/google/dexmaker/dx/rop/type/Type;
    .locals 7

    .line 122
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    .line 124
    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v3, 0x28

    if-ne v2, v3, :cond_5

    const/4 v2, 0x1

    move v4, v1

    move v3, v2

    :goto_0
    const/16 v5, 0x29

    if-ge v3, v0, :cond_2

    .line 135
    invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C

    move-result v6

    if-ne v6, v5, :cond_0

    move v1, v3

    goto :goto_1

    :cond_0
    const/16 v5, 0x41

    if-lt v6, v5, :cond_1

    const/16 v5, 0x5a

    if-gt v6, v5, :cond_1

    add-int/lit8 v4, v4, 0x1

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    if-eqz v1, :cond_4

    sub-int/2addr v0, v2

    if-eq v1, v0, :cond_4

    add-int/2addr v1, v2

    .line 149
    invoke-virtual {p0, v5, v1}, Ljava/lang/String;->indexOf(II)I

    move-result p0

    const/4 v0, -0x1

    if-ne p0, v0, :cond_3

    .line 153
    new-array p0, v4, [Lcom/google/dexmaker/dx/rop/type/Type;

    return-object p0

    .line 150
    :cond_3
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "bad descriptor"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 146
    :cond_4
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "bad descriptor"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 125
    :cond_5
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "bad descriptor"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private static putIntern(Lcom/google/dexmaker/dx/rop/type/Prototype;)Lcom/google/dexmaker/dx/rop/type/Prototype;
    .locals 3

    .line 390
    sget-object v0, Lcom/google/dexmaker/dx/rop/type/Prototype;->internTable:Ljava/util/HashMap;

    monitor-enter v0

    .line 391
    :try_start_0
    invoke-virtual {p0}, Lcom/google/dexmaker/dx/rop/type/Prototype;->getDescriptor()Ljava/lang/String;

    move-result-object v1

    .line 392
    sget-object v2, Lcom/google/dexmaker/dx/rop/type/Prototype;->internTable:Ljava/util/HashMap;

    invoke-virtual {v2, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/dexmaker/dx/rop/type/Prototype;

    if-eqz v2, :cond_0

    .line 394
    monitor-exit v0

    return-object v2

    .line 396
    :cond_0
    sget-object v2, Lcom/google/dexmaker/dx/rop/type/Prototype;->internTable:Ljava/util/HashMap;

    invoke-virtual {v2, v1, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 397
    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p0

    .line 398
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method


# virtual methods
.method public compareTo(Lcom/google/dexmaker/dx/rop/type/Prototype;)I
    .locals 7

    const/4 v0, 0x0

    if-ne p0, p1, :cond_0

    return v0

    .line 271
    :cond_0
    iget-object v1, p0, Lcom/google/dexmaker/dx/rop/type/Prototype;->returnType:Lcom/google/dexmaker/dx/rop/type/Type;

    iget-object v2, p1, Lcom/google/dexmaker/dx/rop/type/Prototype;->returnType:Lcom/google/dexmaker/dx/rop/type/Type;

    invoke-virtual {v1, v2}, Lcom/google/dexmaker/dx/rop/type/Type;->compareTo(Lcom/google/dexmaker/dx/rop/type/Type;)I

    move-result v1

    if-eqz v1, :cond_1

    return v1

    .line 277
    :cond_1
    iget-object v1, p0, Lcom/google/dexmaker/dx/rop/type/Prototype;->parameterTypes:Lcom/google/dexmaker/dx/rop/type/StdTypeList;

    invoke-virtual {v1}, Lcom/google/dexmaker/dx/rop/type/StdTypeList;->size()I

    move-result v1

    .line 278
    iget-object v2, p1, Lcom/google/dexmaker/dx/rop/type/Prototype;->parameterTypes:Lcom/google/dexmaker/dx/rop/type/StdTypeList;

    invoke-virtual {v2}, Lcom/google/dexmaker/dx/rop/type/StdTypeList;->size()I

    move-result v2

    .line 279
    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v3

    move v4, v0

    :goto_0
    if-ge v4, v3, :cond_3

    .line 282
    iget-object v5, p0, Lcom/google/dexmaker/dx/rop/type/Prototype;->parameterTypes:Lcom/google/dexmaker/dx/rop/type/StdTypeList;

    invoke-virtual {v5, v4}, Lcom/google/dexmaker/dx/rop/type/StdTypeList;->get(I)Lcom/google/dexmaker/dx/rop/type/Type;

    move-result-object v5

    .line 283
    iget-object v6, p1, Lcom/google/dexmaker/dx/rop/type/Prototype;->parameterTypes:Lcom/google/dexmaker/dx/rop/type/StdTypeList;

    invoke-virtual {v6, v4}, Lcom/google/dexmaker/dx/rop/type/StdTypeList;->get(I)Lcom/google/dexmaker/dx/rop/type/Type;

    move-result-object v6

    .line 285
    invoke-virtual {v5, v6}, Lcom/google/dexmaker/dx/rop/type/Type;->compareTo(Lcom/google/dexmaker/dx/rop/type/Type;)I

    move-result v5

    if-eqz v5, :cond_2

    return v5

    :cond_2
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_3
    if-ge v1, v2, :cond_4

    const/4 p1, -0x1

    return p1

    :cond_4
    if-le v1, v2, :cond_5

    const/4 p1, 0x1

    return p1

    :cond_5
    return v0
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 26
    check-cast p1, Lcom/google/dexmaker/dx/rop/type/Prototype;

    invoke-virtual {p0, p1}, Lcom/google/dexmaker/dx/rop/type/Prototype;->compareTo(Lcom/google/dexmaker/dx/rop/type/Prototype;)I

    move-result p1

    return p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    .line 246
    :cond_0
    instance-of v0, p1, Lcom/google/dexmaker/dx/rop/type/Prototype;

    if-nez v0, :cond_1

    const/4 p1, 0x0

    return p1

    .line 250
    :cond_1
    iget-object v0, p0, Lcom/google/dexmaker/dx/rop/type/Prototype;->descriptor:Ljava/lang/String;

    check-cast p1, Lcom/google/dexmaker/dx/rop/type/Prototype;

    iget-object p1, p1, Lcom/google/dexmaker/dx/rop/type/Prototype;->descriptor:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public getDescriptor()Ljava/lang/String;
    .locals 1

    .line 313
    iget-object v0, p0, Lcom/google/dexmaker/dx/rop/type/Prototype;->descriptor:Ljava/lang/String;

    return-object v0
.end method

.method public getParameterFrameTypes()Lcom/google/dexmaker/dx/rop/type/StdTypeList;
    .locals 6

    .line 343
    iget-object v0, p0, Lcom/google/dexmaker/dx/rop/type/Prototype;->parameterFrameTypes:Lcom/google/dexmaker/dx/rop/type/StdTypeList;

    if-nez v0, :cond_3

    .line 344
    iget-object v0, p0, Lcom/google/dexmaker/dx/rop/type/Prototype;->parameterTypes:Lcom/google/dexmaker/dx/rop/type/StdTypeList;

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/rop/type/StdTypeList;->size()I

    move-result v0

    .line 345
    new-instance v1, Lcom/google/dexmaker/dx/rop/type/StdTypeList;

    invoke-direct {v1, v0}, Lcom/google/dexmaker/dx/rop/type/StdTypeList;-><init>(I)V

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v2, v0, :cond_1

    .line 348
    iget-object v4, p0, Lcom/google/dexmaker/dx/rop/type/Prototype;->parameterTypes:Lcom/google/dexmaker/dx/rop/type/StdTypeList;

    invoke-virtual {v4, v2}, Lcom/google/dexmaker/dx/rop/type/StdTypeList;->get(I)Lcom/google/dexmaker/dx/rop/type/Type;

    move-result-object v4

    .line 349
    invoke-virtual {v4}, Lcom/google/dexmaker/dx/rop/type/Type;->isIntlike()Z

    move-result v5

    if-eqz v5, :cond_0

    .line 351
    sget-object v4, Lcom/google/dexmaker/dx/rop/type/Type;->INT:Lcom/google/dexmaker/dx/rop/type/Type;

    const/4 v3, 0x1

    .line 353
    :cond_0
    invoke-virtual {v1, v2, v4}, Lcom/google/dexmaker/dx/rop/type/StdTypeList;->set(ILcom/google/dexmaker/dx/rop/type/Type;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    if-eqz v3, :cond_2

    goto :goto_1

    .line 355
    :cond_2
    iget-object v1, p0, Lcom/google/dexmaker/dx/rop/type/Prototype;->parameterTypes:Lcom/google/dexmaker/dx/rop/type/StdTypeList;

    :goto_1
    iput-object v1, p0, Lcom/google/dexmaker/dx/rop/type/Prototype;->parameterFrameTypes:Lcom/google/dexmaker/dx/rop/type/StdTypeList;

    .line 358
    :cond_3
    iget-object v0, p0, Lcom/google/dexmaker/dx/rop/type/Prototype;->parameterFrameTypes:Lcom/google/dexmaker/dx/rop/type/StdTypeList;

    return-object v0
.end method

.method public getParameterTypes()Lcom/google/dexmaker/dx/rop/type/StdTypeList;
    .locals 1

    .line 331
    iget-object v0, p0, Lcom/google/dexmaker/dx/rop/type/Prototype;->parameterTypes:Lcom/google/dexmaker/dx/rop/type/StdTypeList;

    return-object v0
.end method

.method public getReturnType()Lcom/google/dexmaker/dx/rop/type/Type;
    .locals 1

    .line 322
    iget-object v0, p0, Lcom/google/dexmaker/dx/rop/type/Prototype;->returnType:Lcom/google/dexmaker/dx/rop/type/Type;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    .line 256
    iget-object v0, p0, Lcom/google/dexmaker/dx/rop/type/Prototype;->descriptor:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 304
    iget-object v0, p0, Lcom/google/dexmaker/dx/rop/type/Prototype;->descriptor:Ljava/lang/String;

    return-object v0
.end method

.method public withFirstParameter(Lcom/google/dexmaker/dx/rop/type/Type;)Lcom/google/dexmaker/dx/rop/type/Prototype;
    .locals 3

    .line 370
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/google/dexmaker/dx/rop/type/Type;->getDescriptor()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/google/dexmaker/dx/rop/type/Prototype;->descriptor:Ljava/lang/String;

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 371
    iget-object v1, p0, Lcom/google/dexmaker/dx/rop/type/Prototype;->parameterTypes:Lcom/google/dexmaker/dx/rop/type/StdTypeList;

    invoke-virtual {v1, p1}, Lcom/google/dexmaker/dx/rop/type/StdTypeList;->withFirst(Lcom/google/dexmaker/dx/rop/type/Type;)Lcom/google/dexmaker/dx/rop/type/StdTypeList;

    move-result-object p1

    .line 373
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/rop/type/StdTypeList;->setImmutable()V

    .line 375
    new-instance v1, Lcom/google/dexmaker/dx/rop/type/Prototype;

    iget-object v2, p0, Lcom/google/dexmaker/dx/rop/type/Prototype;->returnType:Lcom/google/dexmaker/dx/rop/type/Type;

    invoke-direct {v1, v0, v2, p1}, Lcom/google/dexmaker/dx/rop/type/Prototype;-><init>(Ljava/lang/String;Lcom/google/dexmaker/dx/rop/type/Type;Lcom/google/dexmaker/dx/rop/type/StdTypeList;)V

    .line 378
    invoke-static {v1}, Lcom/google/dexmaker/dx/rop/type/Prototype;->putIntern(Lcom/google/dexmaker/dx/rop/type/Prototype;)Lcom/google/dexmaker/dx/rop/type/Prototype;

    move-result-object p1

    return-object p1
.end method
