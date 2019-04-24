.class public abstract Lcom/huawei/openalliance/ad/utils/g;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/huawei/openalliance/ad/utils/s;


# static fields
.field private static final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lcom/huawei/openalliance/ad/utils/g;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/openalliance/ad/utils/g;->a:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private a(Ljava/lang/Object;[Ljava/lang/Class;[Ljava/lang/Object;)Landroid/util/Pair;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/Object;[Ljava/lang/Class<*>;[Ljava/lang/Object;)Landroid/util/Pair<Ljava/lang/String;Ljava/lang/String;>;"
        }
    .end annotation

    const-string v0, "getNetworkOperator"

    invoke-static {p1, v0, p2, p3}, Lcom/huawei/openalliance/ad/utils/x;->a(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    instance-of v0, v2, Ljava/lang/String;

    if-eqz v0, :cond_0

    move-object v3, v2

    check-cast v3, Ljava/lang/String;

    :cond_0
    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v0, 0x0

    if-eq v0, v3, :cond_1

    const-string v0, "null"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x3

    if-le v0, v1, :cond_1

    const/4 v0, 0x0

    const/4 v1, 0x3

    invoke-virtual {v3, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v4

    const/4 v0, 0x3

    invoke-virtual {v3, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v5

    :cond_1
    new-instance v0, Landroid/util/Pair;

    invoke-direct {v0, v4, v5}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method

.method static a(Ljava/lang/String;)Ljava/lang/Object;
    .locals 6

    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    const/4 v3, 0x0

    :try_start_0
    invoke-static {p0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v4

    const-string v0, "getDefault"

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Class;

    invoke-virtual {v4, v0, v1}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v5

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    invoke-virtual {v5, v4, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_5
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_6

    move-result-object v0

    move-object v3, v0

    goto :goto_0

    :catch_0
    move-exception v4

    sget-object v0, Lcom/huawei/openalliance/ad/utils/g;->a:Ljava/lang/String;

    const-string v1, "getDefaultTelephoneManager NoSuchMethodException"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :catch_1
    move-exception v4

    sget-object v0, Lcom/huawei/openalliance/ad/utils/g;->a:Ljava/lang/String;

    const-string v1, "getDefaultTelephoneManager IllegalAccessException"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :catch_2
    move-exception v4

    sget-object v0, Lcom/huawei/openalliance/ad/utils/g;->a:Ljava/lang/String;

    const-string v1, "getDefaultTelephoneManager InvocationTargetException"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :catch_3
    move-exception v4

    sget-object v0, Lcom/huawei/openalliance/ad/utils/g;->a:Ljava/lang/String;

    const-string v1, "getDefaultTelephoneManager ClassNotFoundException"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :catch_4
    move-exception v4

    sget-object v0, Lcom/huawei/openalliance/ad/utils/g;->a:Ljava/lang/String;

    const-string v1, "getDefaultTelephoneManager SecurityException"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :catch_5
    move-exception v4

    sget-object v0, Lcom/huawei/openalliance/ad/utils/g;->a:Ljava/lang/String;

    const-string v1, "getDefaultTelephoneManager IllegalArgumentException"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :catch_6
    move-exception v4

    sget-object v0, Lcom/huawei/openalliance/ad/utils/g;->a:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "getDefaultTelephoneManager error: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    return-object v3
.end method

.method private b(Ljava/lang/Object;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Integer;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/Object;[Ljava/lang/Class<*>;[Ljava/lang/Object;)Ljava/lang/Integer;"
        }
    .end annotation

    const-string v0, "getNetworkType"

    invoke-static {p1, v0, p2, p3}, Lcom/huawei/openalliance/ad/utils/x;->a(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v0, 0x0

    if-eq v0, v1, :cond_0

    instance-of v0, v1, Ljava/lang/Integer;

    if-eqz v0, :cond_0

    move-object v2, v1

    check-cast v2, Ljava/lang/Integer;

    :cond_0
    return-object v2
.end method


# virtual methods
.method public a()I
    .locals 6

    const/4 v3, 0x0

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/utils/g;->b()Ljava/lang/Object;

    move-result-object v4

    const/4 v0, 0x0

    if-eq v0, v4, :cond_1

    const-string v0, "getPreferredDataSubscription"

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {v4, v0, v1, v2}, Lcom/huawei/openalliance/ad/utils/x;->a(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    if-eqz v5, :cond_0

    instance-of v0, v5, Ljava/lang/Integer;

    if-eqz v0, :cond_0

    move-object v0, v5

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v3

    goto :goto_0

    :cond_0
    const/4 v3, -0x1

    :cond_1
    :goto_0
    return v3
.end method

.method public a(I)Ljava/lang/String;
    .locals 7

    const-string v2, ""

    const/4 v0, 0x1

    new-array v3, v0, [Ljava/lang/Class;

    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    const/4 v1, 0x0

    aput-object v0, v3, v1

    const/4 v0, 0x1

    new-array v4, v0, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v4, v1

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/utils/g;->b()Ljava/lang/Object;

    move-result-object v5

    const/4 v0, 0x0

    if-eq v0, v5, :cond_0

    const-string v0, "getDeviceId"

    invoke-static {v5, v0, v3, v4}, Lcom/huawei/openalliance/ad/utils/x;->a(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    if-eqz v6, :cond_0

    instance-of v0, v6, Ljava/lang/String;

    if-eqz v0, :cond_0

    move-object v2, v6

    check-cast v2, Ljava/lang/String;

    :cond_0
    return-object v2
.end method

.method public b(I)Landroid/util/Pair;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)Landroid/util/Pair<Ljava/lang/Integer;Landroid/util/Pair<Ljava/lang/String;Ljava/lang/String;>;>;"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/utils/g;->b()Ljava/lang/Object;

    move-result-object v2

    const/4 v0, 0x0

    if-eq v0, v2, :cond_0

    const/4 v0, 0x1

    new-array v3, v0, [Ljava/lang/Class;

    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    const/4 v1, 0x0

    aput-object v0, v3, v1

    const/4 v0, 0x1

    new-array v4, v0, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v4, v1

    invoke-direct {p0, v2, v3, v4}, Lcom/huawei/openalliance/ad/utils/g;->a(Ljava/lang/Object;[Ljava/lang/Class;[Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object v5

    invoke-direct {p0, v2, v3, v4}, Lcom/huawei/openalliance/ad/utils/g;->b(Ljava/lang/Object;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Integer;

    move-result-object v6

    new-instance v0, Landroid/util/Pair;

    invoke-direct {v0, v6, v5}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method protected abstract b()Ljava/lang/Object;
.end method
