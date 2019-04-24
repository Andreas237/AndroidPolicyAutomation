.class public Lcom/huawei/hwid/core/d/b/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/hwid/core/d/b/c$a;
    }
.end annotation


# static fields
.field private static a:Lcom/huawei/hwid/core/d/b/c$a;


# direct methods
.method private static a(Lcom/huawei/hwid/core/d/b/a/a;)V
    .locals 2

    .line 198
    invoke-static {p0}, Lcom/huawei/hwid/core/d/b/c;->b(Lcom/huawei/hwid/core/d/b/a/a;)V

    .line 199
    sget-object v0, Lcom/huawei/hwid/core/d/b/c;->a:Lcom/huawei/hwid/core/d/b/c$a;

    if-eqz v0, :cond_0

    .line 200
    sget-object v0, Lcom/huawei/hwid/core/d/b/c;->a:Lcom/huawei/hwid/core/d/b/c$a;

    invoke-virtual {p0}, Lcom/huawei/hwid/core/d/b/a/a;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/huawei/hwid/core/d/b/c$a;->a(Ljava/lang/String;)V

    .line 202
    :cond_0
    return-void
.end method

.method public static a(Lcom/huawei/hwid/core/d/b/c$a;)V
    .locals 0

    .line 35
    sput-object p0, Lcom/huawei/hwid/core/d/b/c;->a:Lcom/huawei/hwid/core/d/b/c$a;

    .line 36
    return-void
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 162
    const/4 v0, 0x4

    invoke-static {v0}, Lcom/huawei/hwid/core/d/b/c;->a(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 163
    const/4 v0, 0x4

    invoke-static {v0, p0}, Lcom/huawei/hwid/core/d/b/a/a;->a(ILjava/lang/String;)Lcom/huawei/hwid/core/d/b/a/a$a;

    move-result-object v1

    .line 164
    const/4 v0, 0x0

    invoke-virtual {v1, v0}, Lcom/huawei/hwid/core/d/b/a/a$a;->a(Ljava/lang/Throwable;)Lcom/huawei/hwid/core/d/b/a/a$a;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/huawei/hwid/core/d/b/a/a$a;->a(Ljava/lang/String;)Lcom/huawei/hwid/core/d/b/a/a$a;

    .line 166
    invoke-virtual {v1}, Lcom/huawei/hwid/core/d/b/a/a$a;->a()Lcom/huawei/hwid/core/d/b/a/a;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/hwid/core/d/b/c;->a(Lcom/huawei/hwid/core/d/b/a/a;)V

    .line 168
    :cond_0
    return-void
.end method

.method private static a(I)Z
    .locals 1

    .line 43
    const/4 v0, 0x1

    return v0
.end method

.method private static b(Lcom/huawei/hwid/core/d/b/a/a;)V
    .locals 0

    .line 225
    return-void
.end method

.method public static b(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 176
    const/4 v0, 0x6

    invoke-static {v0}, Lcom/huawei/hwid/core/d/b/c;->a(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 177
    const/4 v0, 0x6

    invoke-static {v0, p0}, Lcom/huawei/hwid/core/d/b/a/a;->a(ILjava/lang/String;)Lcom/huawei/hwid/core/d/b/a/a$a;

    move-result-object v1

    .line 178
    const/4 v0, 0x0

    invoke-virtual {v1, v0}, Lcom/huawei/hwid/core/d/b/a/a$a;->a(Ljava/lang/Throwable;)Lcom/huawei/hwid/core/d/b/a/a$a;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/huawei/hwid/core/d/b/a/a$a;->a(Ljava/lang/String;)Lcom/huawei/hwid/core/d/b/a/a$a;

    .line 180
    invoke-virtual {v1}, Lcom/huawei/hwid/core/d/b/a/a$a;->a()Lcom/huawei/hwid/core/d/b/a/a;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/hwid/core/d/b/c;->a(Lcom/huawei/hwid/core/d/b/a/a;)V

    .line 182
    :cond_0
    return-void
.end method
