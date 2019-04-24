.class public Lcom/huawei/hwCloudJs/d/c;
.super Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Lcom/huawei/hwCloudJs/core/a/a;)Z
    .locals 2

    invoke-virtual {p0}, Lcom/huawei/hwCloudJs/core/a/a;->b()Ljava/lang/reflect/Method;

    move-result-object v0

    const-class v1, Lcom/huawei/hwCloudJs/annotation/JSMethod;

    invoke-virtual {v0, v1}, Ljava/lang/reflect/Method;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwCloudJs/annotation/JSMethod;

    invoke-interface {v0}, Lcom/huawei/hwCloudJs/annotation/JSMethod;->isOpen()Z

    move-result v0

    return v0
.end method

.method public static b(Lcom/huawei/hwCloudJs/core/a/a;)Z
    .locals 2

    invoke-static {p0}, Lcom/huawei/hwCloudJs/d/c;->c(Lcom/huawei/hwCloudJs/core/a/a;)Ljava/lang/String;

    move-result-object v1

    const-string v0, ""

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0
.end method

.method public static c(Lcom/huawei/hwCloudJs/core/a/a;)Ljava/lang/String;
    .locals 2

    invoke-virtual {p0}, Lcom/huawei/hwCloudJs/core/a/a;->b()Ljava/lang/reflect/Method;

    move-result-object v0

    const-class v1, Lcom/huawei/hwCloudJs/annotation/JSMethod;

    invoke-virtual {v0, v1}, Ljava/lang/reflect/Method;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwCloudJs/annotation/JSMethod;

    invoke-interface {v0}, Lcom/huawei/hwCloudJs/annotation/JSMethod;->permission()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
