.class public Lcom/huawei/openalliance/ad/annotations/a/a;
.super Ljava/lang/Object;


# direct methods
.method public static a(Ljava/lang/annotation/Annotation;)Lcom/huawei/openalliance/ad/annotations/a/b;
    .locals 1

    instance-of v0, p0, Lcom/huawei/openalliance/ad/annotations/f;

    if-eqz v0, :cond_0

    new-instance v0, Lcom/huawei/openalliance/ad/annotations/a/c;

    invoke-direct {v0}, Lcom/huawei/openalliance/ad/annotations/a/c;-><init>()V

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method
