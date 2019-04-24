.class Lorg/apache/commons/lang3/time/FormatCache$MultipartKey;
.super Ljava/lang/Object;
.source "FormatCache.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/apache/commons/lang3/time/FormatCache;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "MultipartKey"
.end annotation


# instance fields
.field private hashCode:I

.field private final keys:[Ljava/lang/Object;


# direct methods
.method public varargs constructor <init>([Ljava/lang/Object;)V
    .locals 0
    .param p1, "keys"    # [Ljava/lang/Object;

    .prologue
    .line 166
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 167
    iput-object p1, p0, Lorg/apache/commons/lang3/time/FormatCache$MultipartKey;->keys:[Ljava/lang/Object;

    .line 168
    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 2
    .param p1, "obj"    # Ljava/lang/Object;

    .prologue
    .line 175
    if-ne p0, p1, :cond_0

    .line 176
    const/4 v0, 0x1

    .line 181
    .end local p1    # "obj":Ljava/lang/Object;
    :goto_0
    return v0

    .line 178
    .restart local p1    # "obj":Ljava/lang/Object;
    :cond_0
    instance-of v0, p1, Lorg/apache/commons/lang3/time/FormatCache$MultipartKey;

    if-nez v0, :cond_1

    .line 179
    const/4 v0, 0x0

    goto :goto_0

    .line 181
    :cond_1
    iget-object v0, p0, Lorg/apache/commons/lang3/time/FormatCache$MultipartKey;->keys:[Ljava/lang/Object;

    check-cast p1, Lorg/apache/commons/lang3/time/FormatCache$MultipartKey;

    .end local p1    # "obj":Ljava/lang/Object;
    iget-object v1, p1, Lorg/apache/commons/lang3/time/FormatCache$MultipartKey;->keys:[Ljava/lang/Object;

    invoke-static {v0, v1}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0
.end method

.method public hashCode()I
    .locals 7

    .prologue
    .line 189
    iget v5, p0, Lorg/apache/commons/lang3/time/FormatCache$MultipartKey;->hashCode:I

    if-nez v5, :cond_2

    .line 190
    const/4 v4, 0x0

    .line 191
    .local v4, "rc":I
    iget-object v0, p0, Lorg/apache/commons/lang3/time/FormatCache$MultipartKey;->keys:[Ljava/lang/Object;

    .local v0, "arr$":[Ljava/lang/Object;
    array-length v3, v0

    .local v3, "len$":I
    const/4 v1, 0x0

    .local v1, "i$":I
    :goto_0
    if-ge v1, v3, :cond_1

    aget-object v2, v0, v1

    .line 192
    .local v2, "key":Ljava/lang/Object;
    if-eqz v2, :cond_0

    .line 193
    mul-int/lit8 v5, v4, 0x7

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v6

    add-int v4, v5, v6

    .line 191
    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 196
    .end local v2    # "key":Ljava/lang/Object;
    :cond_1
    iput v4, p0, Lorg/apache/commons/lang3/time/FormatCache$MultipartKey;->hashCode:I

    .line 198
    .end local v0    # "arr$":[Ljava/lang/Object;
    .end local v1    # "i$":I
    .end local v3    # "len$":I
    .end local v4    # "rc":I
    :cond_2
    iget v5, p0, Lorg/apache/commons/lang3/time/FormatCache$MultipartKey;->hashCode:I

    return v5
.end method
