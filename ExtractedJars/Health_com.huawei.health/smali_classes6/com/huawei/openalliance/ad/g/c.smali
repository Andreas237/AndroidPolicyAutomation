.class public abstract Lcom/huawei/openalliance/ad/g/c;
.super Ljava/lang/Object;


# static fields
.field private static a:Lcom/huawei/openalliance/ad/g/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/huawei/openalliance/ad/g/d;

    invoke-direct {v0}, Lcom/huawei/openalliance/ad/g/d;-><init>()V

    sput-object v0, Lcom/huawei/openalliance/ad/g/c;->a:Lcom/huawei/openalliance/ad/g/d;

    return-void
.end method

.method public static a(ILjava/lang/String;Ljava/lang/String;)V
    .locals 3

    sget-object v0, Lcom/huawei/openalliance/ad/g/c;->a:Lcom/huawei/openalliance/ad/g/d;

    invoke-virtual {v0, p0, p1, p2}, Lcom/huawei/openalliance/ad/g/d;->a(ILjava/lang/String;Ljava/lang/String;)V

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v0, 0xa

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v0, "============================================================================"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0xa

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v0, "====== "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {}, Lcom/huawei/openalliance/ad/g/c;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0xa

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v0, "====== "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "Brand: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Landroid/os/Build;->BRAND:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " Model: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Landroid/os/Build;->MODEL:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " Release: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " API: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0xa

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v0, "============================================================================"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v0, Lcom/huawei/openalliance/ad/g/c;->a:Lcom/huawei/openalliance/ad/g/d;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p2, v1}, Lcom/huawei/openalliance/ad/g/d;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static a(ILjava/lang/Throwable;)V
    .locals 2

    sget-object v0, Lcom/huawei/openalliance/ad/g/c;->a:Lcom/huawei/openalliance/ad/g/d;

    const-string v1, ""

    invoke-virtual {v0, p0, v1, p1}, Lcom/huawei/openalliance/ad/g/d;->a(ILjava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    sget-object v0, Lcom/huawei/openalliance/ad/g/c;->a:Lcom/huawei/openalliance/ad/g/d;

    const/4 v1, 0x3

    invoke-virtual {v0, v1, p0, p1}, Lcom/huawei/openalliance/ad/g/d;->b(ILjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static varargs a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 2

    invoke-static {}, Lcom/huawei/openalliance/ad/g/c;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    if-ne v0, p1, :cond_1

    :cond_0
    return-void

    :cond_1
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-static {v0, p1, p2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {p0, v1}, Lcom/huawei/openalliance/ad/g/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static a()Z
    .locals 2

    sget-object v0, Lcom/huawei/openalliance/ad/g/c;->a:Lcom/huawei/openalliance/ad/g/d;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/g/d;->a(I)Z

    move-result v0

    return v0
.end method

.method public static b(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    sget-object v0, Lcom/huawei/openalliance/ad/g/c;->a:Lcom/huawei/openalliance/ad/g/d;

    const/4 v1, 0x4

    invoke-virtual {v0, v1, p0, p1}, Lcom/huawei/openalliance/ad/g/d;->b(ILjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static varargs b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 2

    invoke-static {}, Lcom/huawei/openalliance/ad/g/c;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    if-ne v0, p1, :cond_1

    :cond_0
    return-void

    :cond_1
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-static {v0, p1, p2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {p0, v1}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static b()Z
    .locals 2

    sget-object v0, Lcom/huawei/openalliance/ad/g/c;->a:Lcom/huawei/openalliance/ad/g/d;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/g/d;->a(I)Z

    move-result v0

    return v0
.end method

.method public static c(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    sget-object v0, Lcom/huawei/openalliance/ad/g/c;->a:Lcom/huawei/openalliance/ad/g/d;

    const/4 v1, 0x5

    invoke-virtual {v0, v1, p0, p1}, Lcom/huawei/openalliance/ad/g/d;->b(ILjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static varargs c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 2

    invoke-static {}, Lcom/huawei/openalliance/ad/g/c;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    if-ne v0, p1, :cond_1

    :cond_0
    return-void

    :cond_1
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-static {v0, p1, p2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {p0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static c()Z
    .locals 2

    sget-object v0, Lcom/huawei/openalliance/ad/g/c;->a:Lcom/huawei/openalliance/ad/g/d;

    const/4 v1, 0x5

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/g/d;->a(I)Z

    move-result v0

    return v0
.end method

.method public static d(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    sget-object v0, Lcom/huawei/openalliance/ad/g/c;->a:Lcom/huawei/openalliance/ad/g/d;

    const/4 v1, 0x6

    invoke-virtual {v0, v1, p0, p1}, Lcom/huawei/openalliance/ad/g/d;->b(ILjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static varargs d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 2

    invoke-static {}, Lcom/huawei/openalliance/ad/g/c;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    if-ne v0, p1, :cond_1

    :cond_0
    return-void

    :cond_1
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-static {v0, p1, p2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {p0, v1}, Lcom/huawei/openalliance/ad/g/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static d()Z
    .locals 2

    sget-object v0, Lcom/huawei/openalliance/ad/g/c;->a:Lcom/huawei/openalliance/ad/g/d;

    const/4 v1, 0x6

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/g/d;->a(I)Z

    move-result v0

    return v0
.end method

.method private static e()Ljava/lang/String;
    .locals 1

    const-string v0, "HiAd-3.4.20.301"

    return-object v0
.end method
