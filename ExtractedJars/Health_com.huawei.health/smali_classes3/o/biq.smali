.class public final Lo/biq;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static varargs a(Landroid/content/Context;[Ljava/lang/String;)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;[Ljava/lang/String;)Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation

    .line 36
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 37
    move-object v2, p1

    array-length v3, v2

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_1

    aget-object v5, v2, v4

    .line 39
    invoke-static {p0, v5}, Landroid/support/v4/content/ContextCompat;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    if-eqz v0, :cond_0

    .line 41
    invoke-interface {v1, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 37
    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 44
    :cond_1
    return-object v1
.end method

.method public static c(Landroid/app/Activity;I[Ljava/lang/String;)V
    .locals 0

    .line 57
    invoke-static {p0, p2, p1}, Landroid/support/v4/app/ActivityCompat;->requestPermissions(Landroid/app/Activity;[Ljava/lang/String;I)V

    .line 58
    return-void
.end method

.method public static varargs d(Landroid/content/Context;[Ljava/lang/String;)Z
    .locals 5

    .line 83
    move-object v1, p1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, v1, v3

    .line 85
    invoke-static {p0, v4}, Landroid/support/v4/content/ContextCompat;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    if-eqz v0, :cond_0

    .line 88
    const/4 v0, 0x0

    return v0

    .line 83
    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 92
    :cond_1
    const/4 v0, 0x1

    return v0
.end method

.method public static d([I)Z
    .locals 5

    .line 65
    move-object v1, p0

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget v4, v1, v3

    .line 67
    if-eqz v4, :cond_0

    .line 69
    const/4 v0, 0x0

    return v0

    .line 65
    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 72
    :cond_1
    const/4 v0, 0x1

    return v0
.end method
