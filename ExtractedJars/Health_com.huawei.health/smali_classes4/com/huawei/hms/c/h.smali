.class public abstract Lcom/huawei/hms/c/h;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Landroid/content/Context;

.field private static b:Ljava/lang/String;


# direct methods
.method public static a(Ljava/lang/String;)I
    .locals 3

    .line 38
    sget-object v0, Lcom/huawei/hms/c/h;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const-string v1, "layout"

    sget-object v2, Lcom/huawei/hms/c/h;->b:Ljava/lang/String;

    invoke-virtual {v0, p0, v1, v2}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public static a()Landroid/content/Context;
    .locals 1

    .line 28
    sget-object v0, Lcom/huawei/hms/c/h;->a:Landroid/content/Context;

    return-object v0
.end method

.method public static varargs a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    .locals 3

    .line 80
    sget-object v0, Lcom/huawei/hms/c/h;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-static {p0}, Lcom/huawei/hms/c/h;->d(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1, p1}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    .line 81
    if-nez v2, :cond_0

    const-string v0, ""

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    move-object v2, v0

    .line 82
    return-object v2
.end method

.method public static a(Landroid/content/Context;)V
    .locals 1

    .line 32
    sput-object p0, Lcom/huawei/hms/c/h;->a:Landroid/content/Context;

    .line 33
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/hms/c/h;->b:Ljava/lang/String;

    .line 34
    return-void
.end method

.method public static b(Ljava/lang/String;)I
    .locals 3

    .line 43
    sget-object v0, Lcom/huawei/hms/c/h;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const-string v1, "id"

    sget-object v2, Lcom/huawei/hms/c/h;->b:Ljava/lang/String;

    invoke-virtual {v0, p0, v1, v2}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public static c(Ljava/lang/String;)I
    .locals 3

    .line 48
    sget-object v0, Lcom/huawei/hms/c/h;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const-string v1, "drawable"

    sget-object v2, Lcom/huawei/hms/c/h;->b:Ljava/lang/String;

    invoke-virtual {v0, p0, v1, v2}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public static d(Ljava/lang/String;)I
    .locals 3

    .line 58
    sget-object v0, Lcom/huawei/hms/c/h;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const-string v1, "string"

    sget-object v2, Lcom/huawei/hms/c/h;->b:Ljava/lang/String;

    invoke-virtual {v0, p0, v1, v2}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public static e(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 73
    sget-object v0, Lcom/huawei/hms/c/h;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-static {p0}, Lcom/huawei/hms/c/h;->d(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 74
    if-nez v2, :cond_0

    const-string v0, ""

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    move-object v2, v0

    .line 75
    return-object v2
.end method

.method public static f(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;
    .locals 2

    .line 87
    sget-object v0, Lcom/huawei/hms/c/h;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-static {p0}, Lcom/huawei/hms/c/h;->c(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    return-object v0
.end method
