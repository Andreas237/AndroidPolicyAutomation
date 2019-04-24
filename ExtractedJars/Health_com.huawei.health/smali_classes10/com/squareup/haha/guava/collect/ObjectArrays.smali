.class public final Lcom/squareup/haha/guava/collect/ObjectArrays;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field static final EMPTY_ARRAY:[Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 37
    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    sput-object v0, Lcom/squareup/haha/guava/collect/ObjectArrays;->EMPTY_ARRAY:[Ljava/lang/Object;

    return-void
.end method

.method static arraysCopyOf([Ljava/lang/Object;I)[Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:Ljava/lang/Object;>([TT;I)[TT;"
        }
    .end annotation

    .line 112
    invoke-static {p0, p1}, Lcom/squareup/haha/guava/collect/ObjectArrays;->newArray([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v3

    .line 113
    array-length v0, p0

    invoke-static {v0, p1}, Ljava/lang/Math;->min(II)I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p0, v1, v3, v2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 115
    return-object v3
.end method

.method static varargs checkElementsNotNull([Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 8

    .line 226
    array-length v4, p0

    move-object v3, p0

    .line 1230
    const/4 v5, 0x0

    :goto_0
    if-ge v5, v4, :cond_1

    .line 1231
    aget-object v6, v3, v5

    move v7, v5

    .line 1239
    if-nez v6, :cond_0

    .line 1240
    new-instance v0, Ljava/lang/NullPointerException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "at index "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1230
    :cond_0
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 226
    .line 1233
    :cond_1
    return-object v3
.end method

.method public static newArray([Ljava/lang/Object;I)[Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:Ljava/lang/Object;>([TT;I)[TT;"
        }
    .end annotation

    .line 61
    move v2, p1

    .line 1048
    move-object v1, p0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object v3

    .line 1053
    invoke-static {v3, v2}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, [Ljava/lang/Object;

    .line 61
    .line 1054
    return-object v4
.end method
