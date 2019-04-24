.class public abstract Lcom/ibotta/android/routing/area/AbstractRegexRouteArea;
.super Ljava/lang/Object;
.source "AbstractRegexRouteArea.java"

# interfaces
.implements Lcom/ibotta/android/routing/area/RouteArea;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method protected abstract getAreaRegexes()Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end method

.method protected getInt(Ljava/lang/String;)Ljava/lang/Integer;
    .locals 4

    .line 72
    :try_start_0
    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "Failed to parse int: %1$s"

    const/4 v2, 0x1

    .line 74
    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    invoke-static {v0, v1, v2}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method protected getInts(Ljava/lang/String;)Landroid/util/SparseIntArray;
    .locals 5

    .line 81
    new-instance v0, Landroid/util/SparseIntArray;

    invoke-direct {v0}, Landroid/util/SparseIntArray;-><init>()V

    .line 83
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_1

    const-string v1, ","

    invoke-virtual {p1, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    const-string v1, ","

    .line 84
    invoke-virtual {p1, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 86
    array-length v1, p1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_2

    aget-object v3, p1, v2

    .line 87
    invoke-virtual {p0, v3}, Lcom/ibotta/android/routing/area/AbstractRegexRouteArea;->getInt(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v3

    if-eqz v3, :cond_0

    .line 89
    invoke-virtual {v0}, Landroid/util/SparseIntArray;->size()I

    move-result v4

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-virtual {v0, v4, v3}, Landroid/util/SparseIntArray;->put(II)V

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 94
    :cond_1
    invoke-virtual {p0, p1}, Lcom/ibotta/android/routing/area/AbstractRegexRouteArea;->getInt(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 96
    invoke-virtual {v0}, Landroid/util/SparseIntArray;->size()I

    move-result v1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {v0, v1, p1}, Landroid/util/SparseIntArray;->put(II)V

    .line 100
    :cond_2
    invoke-virtual {v0}, Landroid/util/SparseIntArray;->size()I

    move-result p1

    if-gtz p1, :cond_3

    const/4 v0, 0x0

    :cond_3
    return-object v0
.end method

.method protected getIntsArray(Ljava/lang/String;)[I
    .locals 3

    .line 108
    invoke-virtual {p0, p1}, Lcom/ibotta/android/routing/area/AbstractRegexRouteArea;->getInts(Ljava/lang/String;)Landroid/util/SparseIntArray;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 113
    :cond_0
    invoke-virtual {p1}, Landroid/util/SparseIntArray;->size()I

    move-result v0

    new-array v0, v0, [I

    const/4 v1, 0x0

    .line 114
    :goto_0
    invoke-virtual {p1}, Landroid/util/SparseIntArray;->size()I

    move-result v2

    if-ge v1, v2, :cond_1

    .line 115
    invoke-virtual {p1, v1}, Landroid/util/SparseIntArray;->get(I)I

    move-result v2

    aput v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method protected getMatcher(Ljava/lang/String;Ljava/lang/String;)Lcom/google/code/regexp/Matcher;
    .locals 0

    .line 45
    invoke-static {p1}, Lcom/google/code/regexp/Pattern;->compile(Ljava/lang/String;)Lcom/google/code/regexp/Pattern;

    move-result-object p1

    invoke-virtual {p1, p2}, Lcom/google/code/regexp/Pattern;->matcher(Ljava/lang/CharSequence;)Lcom/google/code/regexp/Matcher;

    move-result-object p1

    return-object p1
.end method

.method protected getQueryParam(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 49
    invoke-static {p1}, Landroid/text/TextUtils;->isDigitsOnly(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    .line 54
    :cond_0
    :goto_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_1

    const-string v0, "/"

    .line 55
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    .line 56
    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    .line 63
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ibotta-app://"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 65
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    invoke-virtual {p1, p2}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_2
    :goto_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public isResponsibleFor(Ljava/lang/String;)Z
    .locals 3

    .line 23
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    .line 27
    :cond_0
    invoke-virtual {p0}, Lcom/ibotta/android/routing/area/AbstractRegexRouteArea;->getAreaRegexes()Ljava/util/Set;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 28
    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_0

    .line 34
    :cond_1
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 35
    invoke-static {v2}, Lcom/google/code/regexp/Pattern;->compile(Ljava/lang/String;)Lcom/google/code/regexp/Pattern;

    move-result-object v2

    invoke-virtual {v2, p1}, Lcom/google/code/regexp/Pattern;->matcher(Ljava/lang/CharSequence;)Lcom/google/code/regexp/Matcher;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/code/regexp/Matcher;->matches()Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v1, 0x1

    :cond_3
    return v1

    :cond_4
    :goto_0
    return v1
.end method
