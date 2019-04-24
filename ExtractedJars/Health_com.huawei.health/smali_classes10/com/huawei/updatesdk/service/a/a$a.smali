.class public Lcom/huawei/updatesdk/service/a/a$a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/updatesdk/service/a/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# static fields
.field private static a:Ljava/lang/String;

.field private static b:Z

.field private static c:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    invoke-static {}, Lcom/huawei/updatesdk/service/a/c;->a()Lcom/huawei/updatesdk/service/a/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/updatesdk/service/a/c;->c()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/updatesdk/service/a/a$a;->a:Ljava/lang/String;

    const/4 v0, 0x0

    sput-boolean v0, Lcom/huawei/updatesdk/service/a/a$a;->b:Z

    const/4 v0, 0x0

    sput-boolean v0, Lcom/huawei/updatesdk/service/a/a$a;->c:Z

    return-void
.end method

.method public static a()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/huawei/updatesdk/service/a/a$a;->a:Ljava/lang/String;

    return-object v0
.end method

.method public static a(I)V
    .locals 4

    sget-boolean v0, Lcom/huawei/updatesdk/service/a/a$a;->b:Z

    if-nez v0, :cond_0

    if-eqz p0, :cond_0

    sget-object v0, Lcom/huawei/updatesdk/service/a/a$a;->a:Ljava/lang/String;

    const-string v1, "192"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    sput-boolean v0, Lcom/huawei/updatesdk/service/a/a$a;->b:Z

    sget-object v0, Lcom/huawei/updatesdk/service/a/a$a;->a:Ljava/lang/String;

    const-string v1, "\\."

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "."

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/updatesdk/service/a/a$a;->a:Ljava/lang/String;

    :cond_0
    return-void
.end method

.method public static a(Z)V
    .locals 0

    sput-boolean p0, Lcom/huawei/updatesdk/service/a/a$a;->c:Z

    return-void
.end method

.method public static b()Ljava/lang/String;
    .locals 3

    sget-object v1, Lcom/huawei/updatesdk/service/a/a$a;->a:Ljava/lang/String;

    sget-boolean v0, Lcom/huawei/updatesdk/service/a/a$a;->c:Z

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/huawei/updatesdk/service/a/b;->a()Lcom/huawei/updatesdk/service/a/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/updatesdk/service/a/b;->n()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    move-object v1, v2

    :cond_0
    return-object v1
.end method

.method public static c()Z
    .locals 1

    sget-boolean v0, Lcom/huawei/updatesdk/service/a/a$a;->c:Z

    return v0
.end method
