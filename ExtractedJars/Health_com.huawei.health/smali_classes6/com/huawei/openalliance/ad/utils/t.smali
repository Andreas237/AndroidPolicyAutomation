.class public Lcom/huawei/openalliance/ad/utils/t;
.super Ljava/lang/Object;


# static fields
.field private static a:Lcom/huawei/openalliance/ad/utils/s$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lcom/huawei/openalliance/ad/utils/s$a;->a:Lcom/huawei/openalliance/ad/utils/s$a;

    sput-object v0, Lcom/huawei/openalliance/ad/utils/t;->a:Lcom/huawei/openalliance/ad/utils/s$a;

    return-void
.end method

.method public static a()Lcom/huawei/openalliance/ad/utils/s;
    .locals 3

    invoke-static {}, Lcom/huawei/openalliance/ad/utils/t;->b()Z

    sget-object v0, Lcom/huawei/openalliance/ad/utils/t;->a:Lcom/huawei/openalliance/ad/utils/s$a;

    sget-object v1, Lcom/huawei/openalliance/ad/utils/s$a;->d:Lcom/huawei/openalliance/ad/utils/s$a;

    if-ne v0, v1, :cond_0

    new-instance v2, Lcom/huawei/openalliance/ad/utils/v;

    invoke-direct {v2}, Lcom/huawei/openalliance/ad/utils/v;-><init>()V

    goto :goto_0

    :cond_0
    new-instance v2, Lcom/huawei/openalliance/ad/utils/u;

    invoke-direct {v2}, Lcom/huawei/openalliance/ad/utils/u;-><init>()V

    :goto_0
    return-object v2
.end method

.method public static b()Z
    .locals 3

    const/4 v2, 0x0

    sget-object v0, Lcom/huawei/openalliance/ad/utils/t;->a:Lcom/huawei/openalliance/ad/utils/s$a;

    sget-object v1, Lcom/huawei/openalliance/ad/utils/s$a;->a:Lcom/huawei/openalliance/ad/utils/s$a;

    if-eq v0, v1, :cond_1

    sget-object v0, Lcom/huawei/openalliance/ad/utils/t;->a:Lcom/huawei/openalliance/ad/utils/s$a;

    sget-object v1, Lcom/huawei/openalliance/ad/utils/s$a;->c:Lcom/huawei/openalliance/ad/utils/s$a;

    if-eq v0, v1, :cond_0

    sget-object v0, Lcom/huawei/openalliance/ad/utils/t;->a:Lcom/huawei/openalliance/ad/utils/s$a;

    sget-object v1, Lcom/huawei/openalliance/ad/utils/s$a;->d:Lcom/huawei/openalliance/ad/utils/s$a;

    if-ne v0, v1, :cond_4

    :cond_0
    const/4 v2, 0x1

    goto :goto_0

    :cond_1
    invoke-static {}, Lcom/huawei/openalliance/ad/utils/t;->d()Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object v0, Lcom/huawei/openalliance/ad/utils/s$a;->d:Lcom/huawei/openalliance/ad/utils/s$a;

    sput-object v0, Lcom/huawei/openalliance/ad/utils/t;->a:Lcom/huawei/openalliance/ad/utils/s$a;

    const/4 v2, 0x1

    goto :goto_0

    :cond_2
    invoke-static {}, Lcom/huawei/openalliance/ad/utils/t;->c()Z

    move-result v0

    if-eqz v0, :cond_3

    sget-object v0, Lcom/huawei/openalliance/ad/utils/s$a;->c:Lcom/huawei/openalliance/ad/utils/s$a;

    sput-object v0, Lcom/huawei/openalliance/ad/utils/t;->a:Lcom/huawei/openalliance/ad/utils/s$a;

    const/4 v2, 0x1

    goto :goto_0

    :cond_3
    sget-object v0, Lcom/huawei/openalliance/ad/utils/s$a;->b:Lcom/huawei/openalliance/ad/utils/s$a;

    sput-object v0, Lcom/huawei/openalliance/ad/utils/t;->a:Lcom/huawei/openalliance/ad/utils/s$a;

    :cond_4
    :goto_0
    return v2
.end method

.method public static c()Z
    .locals 8

    const/4 v5, 0x0

    invoke-static {}, Lcom/huawei/openalliance/ad/utils/u;->c()Ljava/lang/Object;

    move-result-object v6

    const/4 v0, 0x0

    if-eq v0, v6, :cond_0

    const-string v0, "isMultiSimEnabled"

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {v6, v0, v1, v2}, Lcom/huawei/openalliance/ad/utils/x;->a(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    if-eqz v7, :cond_0

    instance-of v0, v7, Ljava/lang/Boolean;

    if-eqz v0, :cond_0

    move-object v0, v7

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    :cond_0
    const-string v0, "mutiCardFactory"

    const-string v1, "isHwGeminiSupport1 %s"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v5}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v0, v1, v2}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    return v5
.end method

.method private static d()Z
    .locals 8

    const/4 v5, 0x0

    const-string v0, "com.mediatek.common.featureoption.FeatureOption"

    :try_start_0
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v6

    const-string v0, "MTK_GEMINI_SUPPORT"

    invoke-virtual {v6, v0}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v7

    const/4 v0, 0x1

    invoke-static {v7, v0}, Lcom/huawei/openalliance/ad/utils/x;->a(Ljava/lang/reflect/Field;Z)Ljava/lang/reflect/Field;

    move-result-object v7

    const/4 v0, 0x0

    invoke-virtual {v7, v0}, Ljava/lang/reflect/Field;->getBoolean(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_1

    move-result v0

    move v5, v0

    goto :goto_0

    :catch_0
    move-exception v6

    const-string v0, "mutiCardFactory"

    const-string v1, "cannot find ext mtkapi"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :catch_1
    move-exception v6

    const-string v0, "mutiCardFactory"

    const-string v1, "MTK NoClassDefFoundError"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    const-string v0, "mutiCardFactory"

    const-string v1, "isMtkGeminiSupport %s"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v5}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v0, v1, v2}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    return v5
.end method
