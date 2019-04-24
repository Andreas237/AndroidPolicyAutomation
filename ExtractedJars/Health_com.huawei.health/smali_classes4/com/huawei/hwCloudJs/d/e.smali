.class public Lcom/huawei/hwCloudJs/d/e;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/hwCloudJs/d/e$a;
    }
.end annotation


# static fields
.field private static final a:Ljava/lang/String; = "ReflectUtils"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final a(Landroid/content/Context;Lcom/huawei/hwCloudJs/d/e$a;Ljava/lang/String;)I
    .locals 6

    :try_start_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ".R$"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/hwCloudJs/d/e$a;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v3, p2}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_2

    move-result v5

    return v5

    :catch_0
    move-exception v3

    const-string v0, "ReflectUtils"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "reflect ClassNotFoundException! resourceType="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "--resourceName="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :catch_1
    move-exception v3

    const-string v0, "ReflectUtils"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "reflect ClassNotFoundException! resourceType="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "--resourceName="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :catch_2
    move-exception v3

    const-string v0, "ReflectUtils"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "reflect ClassNotFoundException! resourceType="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "--resourceName="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    const/4 v0, 0x0

    return v0
.end method

.method public static final a(Landroid/content/Context;Ljava/lang/String;)I
    .locals 1

    sget-object v0, Lcom/huawei/hwCloudJs/d/e$a;->a:Lcom/huawei/hwCloudJs/d/e$a;

    invoke-static {p0, v0, p1}, Lcom/huawei/hwCloudJs/d/e;->a(Landroid/content/Context;Lcom/huawei/hwCloudJs/d/e$a;Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public static final b(Landroid/content/Context;Ljava/lang/String;)I
    .locals 1

    sget-object v0, Lcom/huawei/hwCloudJs/d/e$a;->c:Lcom/huawei/hwCloudJs/d/e$a;

    invoke-static {p0, v0, p1}, Lcom/huawei/hwCloudJs/d/e;->a(Landroid/content/Context;Lcom/huawei/hwCloudJs/d/e$a;Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public static final c(Landroid/content/Context;Ljava/lang/String;)I
    .locals 1

    sget-object v0, Lcom/huawei/hwCloudJs/d/e$a;->b:Lcom/huawei/hwCloudJs/d/e$a;

    invoke-static {p0, v0, p1}, Lcom/huawei/hwCloudJs/d/e;->a(Landroid/content/Context;Lcom/huawei/hwCloudJs/d/e$a;Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public static final d(Landroid/content/Context;Ljava/lang/String;)I
    .locals 1

    sget-object v0, Lcom/huawei/hwCloudJs/d/e$a;->e:Lcom/huawei/hwCloudJs/d/e$a;

    invoke-static {p0, v0, p1}, Lcom/huawei/hwCloudJs/d/e;->a(Landroid/content/Context;Lcom/huawei/hwCloudJs/d/e$a;Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public static final e(Landroid/content/Context;Ljava/lang/String;)I
    .locals 1

    sget-object v0, Lcom/huawei/hwCloudJs/d/e$a;->f:Lcom/huawei/hwCloudJs/d/e$a;

    invoke-static {p0, v0, p1}, Lcom/huawei/hwCloudJs/d/e;->a(Landroid/content/Context;Lcom/huawei/hwCloudJs/d/e$a;Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public static final f(Landroid/content/Context;Ljava/lang/String;)I
    .locals 1

    sget-object v0, Lcom/huawei/hwCloudJs/d/e$a;->d:Lcom/huawei/hwCloudJs/d/e$a;

    invoke-static {p0, v0, p1}, Lcom/huawei/hwCloudJs/d/e;->a(Landroid/content/Context;Lcom/huawei/hwCloudJs/d/e$a;Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public static final g(Landroid/content/Context;Ljava/lang/String;)I
    .locals 1

    sget-object v0, Lcom/huawei/hwCloudJs/d/e$a;->g:Lcom/huawei/hwCloudJs/d/e$a;

    invoke-static {p0, v0, p1}, Lcom/huawei/hwCloudJs/d/e;->a(Landroid/content/Context;Lcom/huawei/hwCloudJs/d/e$a;Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public static final h(Landroid/content/Context;Ljava/lang/String;)I
    .locals 1

    sget-object v0, Lcom/huawei/hwCloudJs/d/e$a;->h:Lcom/huawei/hwCloudJs/d/e$a;

    invoke-static {p0, v0, p1}, Lcom/huawei/hwCloudJs/d/e;->a(Landroid/content/Context;Lcom/huawei/hwCloudJs/d/e$a;Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public static final i(Landroid/content/Context;Ljava/lang/String;)I
    .locals 1

    sget-object v0, Lcom/huawei/hwCloudJs/d/e$a;->i:Lcom/huawei/hwCloudJs/d/e$a;

    invoke-static {p0, v0, p1}, Lcom/huawei/hwCloudJs/d/e;->a(Landroid/content/Context;Lcom/huawei/hwCloudJs/d/e$a;Ljava/lang/String;)I

    move-result v0

    return v0
.end method
