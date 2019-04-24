.class public Lcom/huawei/feedback/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/feedback/f$a;
    }
.end annotation


# static fields
.field private static final a:Ljava/lang/String; = "ReflectUtils"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final a(Landroid/content/Context;Lcom/huawei/feedback/f$a;Ljava/lang/String;)I
    .locals 7

    .line 37
    :try_start_0
    invoke-static {}, Lcom/huawei/feedback/a/b/b;->a()Lcom/huawei/feedback/a/b/b;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/huawei/feedback/a/b/b;->l(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v3

    .line 38
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 40
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v3

    .line 42
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ".R$"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/feedback/f$a;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v4

    .line 43
    invoke-virtual {v4, p2}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v5

    .line 44
    invoke-virtual {v5}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_3

    move-result v6

    .line 45
    return v6

    .line 47
    :catch_0
    move-exception v3

    .line 49
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

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 66
    goto :goto_0

    .line 52
    :catch_1
    move-exception v3

    .line 54
    const-string v0, "ReflectUtils"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "reflect NoSuchFieldException! resourceType="

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

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 66
    goto :goto_0

    .line 57
    :catch_2
    move-exception v3

    .line 59
    const-string v0, "ReflectUtils"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "reflect IllegalArgumentException! resourceType="

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

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 66
    goto :goto_0

    .line 62
    :catch_3
    move-exception v3

    .line 64
    const-string v0, "ReflectUtils"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "reflect IllegalAccessException! resourceType="

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

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 67
    :goto_0
    const/4 v0, 0x0

    return v0
.end method

.method public static final a(Landroid/content/Context;Ljava/lang/String;)I
    .locals 1

    .line 77
    sget-object v0, Lcom/huawei/feedback/f$a;->a:Lcom/huawei/feedback/f$a;

    invoke-static {p0, v0, p1}, Lcom/huawei/feedback/f;->a(Landroid/content/Context;Lcom/huawei/feedback/f$a;Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public static final b(Landroid/content/Context;Ljava/lang/String;)I
    .locals 1

    .line 87
    sget-object v0, Lcom/huawei/feedback/f$a;->c:Lcom/huawei/feedback/f$a;

    invoke-static {p0, v0, p1}, Lcom/huawei/feedback/f;->a(Landroid/content/Context;Lcom/huawei/feedback/f$a;Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public static final c(Landroid/content/Context;Ljava/lang/String;)I
    .locals 1

    .line 97
    sget-object v0, Lcom/huawei/feedback/f$a;->b:Lcom/huawei/feedback/f$a;

    invoke-static {p0, v0, p1}, Lcom/huawei/feedback/f;->a(Landroid/content/Context;Lcom/huawei/feedback/f$a;Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public static final d(Landroid/content/Context;Ljava/lang/String;)I
    .locals 1

    .line 107
    sget-object v0, Lcom/huawei/feedback/f$a;->e:Lcom/huawei/feedback/f$a;

    invoke-static {p0, v0, p1}, Lcom/huawei/feedback/f;->a(Landroid/content/Context;Lcom/huawei/feedback/f$a;Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public static final e(Landroid/content/Context;Ljava/lang/String;)I
    .locals 1

    .line 117
    sget-object v0, Lcom/huawei/feedback/f$a;->f:Lcom/huawei/feedback/f$a;

    invoke-static {p0, v0, p1}, Lcom/huawei/feedback/f;->a(Landroid/content/Context;Lcom/huawei/feedback/f$a;Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public static final f(Landroid/content/Context;Ljava/lang/String;)I
    .locals 1

    .line 127
    sget-object v0, Lcom/huawei/feedback/f$a;->d:Lcom/huawei/feedback/f$a;

    invoke-static {p0, v0, p1}, Lcom/huawei/feedback/f;->a(Landroid/content/Context;Lcom/huawei/feedback/f$a;Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public static final g(Landroid/content/Context;Ljava/lang/String;)I
    .locals 1

    .line 137
    sget-object v0, Lcom/huawei/feedback/f$a;->g:Lcom/huawei/feedback/f$a;

    invoke-static {p0, v0, p1}, Lcom/huawei/feedback/f;->a(Landroid/content/Context;Lcom/huawei/feedback/f$a;Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public static final h(Landroid/content/Context;Ljava/lang/String;)I
    .locals 1

    .line 147
    sget-object v0, Lcom/huawei/feedback/f$a;->h:Lcom/huawei/feedback/f$a;

    invoke-static {p0, v0, p1}, Lcom/huawei/feedback/f;->a(Landroid/content/Context;Lcom/huawei/feedback/f$a;Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public static final i(Landroid/content/Context;Ljava/lang/String;)I
    .locals 1

    .line 157
    sget-object v0, Lcom/huawei/feedback/f$a;->i:Lcom/huawei/feedback/f$a;

    invoke-static {p0, v0, p1}, Lcom/huawei/feedback/f;->a(Landroid/content/Context;Lcom/huawei/feedback/f$a;Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public static j(Landroid/content/Context;Ljava/lang/String;)V
    .locals 5

    .line 164
    const-string v0, "com.huawei.phoneservice.logic.hianalytics.PhoneServiceHiAnalytics"

    :try_start_0
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v3

    .line 165
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Class;

    const-class v1, Landroid/content/Context;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-virtual {v3, p1, v0}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v4

    .line 166
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p0, v0, v1

    invoke-virtual {v4, v3, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_4

    .line 181
    goto :goto_0

    .line 167
    :catch_0
    move-exception v4

    .line 168
    const-string v0, "ReflectUtils"

    const-string v1, "report ClassNotFoundException"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 181
    goto :goto_0

    .line 169
    :catch_1
    move-exception v4

    .line 171
    const-string v0, "ReflectUtils"

    const-string v1, "report NoSuchMethodException"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 181
    goto :goto_0

    .line 172
    :catch_2
    move-exception v4

    .line 173
    const-string v0, "ReflectUtils"

    const-string v1, "report IllegalArgumentException"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 181
    goto :goto_0

    .line 175
    :catch_3
    move-exception v4

    .line 176
    const-string v0, "ReflectUtils"

    const-string v1, "report IllegalAccessException"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 181
    goto :goto_0

    .line 178
    :catch_4
    move-exception v4

    .line 179
    const-string v0, "ReflectUtils"

    const-string v1, "report InvocationTargetException"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 182
    :goto_0
    return-void
.end method
