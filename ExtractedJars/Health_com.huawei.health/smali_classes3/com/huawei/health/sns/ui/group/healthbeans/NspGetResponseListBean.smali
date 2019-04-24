.class public Lcom/huawei/health/sns/ui/group/healthbeans/NspGetResponseListBean;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field private headers:Lcom/huawei/health/sns/ui/group/healthbeans/HeadersBean;

.field private id:I

.field private method:Ljava/lang/String;

.field private url:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getHeaders()Lcom/huawei/health/sns/ui/group/healthbeans/HeadersBean;
    .locals 1

    .line 17
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/healthbeans/NspGetResponseListBean;->headers:Lcom/huawei/health/sns/ui/group/healthbeans/HeadersBean;

    return-object v0
.end method

.method public getId()I
    .locals 1

    .line 25
    iget v0, p0, Lcom/huawei/health/sns/ui/group/healthbeans/NspGetResponseListBean;->id:I

    return v0
.end method

.method public getMethod()Ljava/lang/String;
    .locals 1

    .line 33
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/healthbeans/NspGetResponseListBean;->method:Ljava/lang/String;

    return-object v0
.end method

.method public getUrl()Ljava/lang/String;
    .locals 1

    .line 41
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/healthbeans/NspGetResponseListBean;->url:Ljava/lang/String;

    return-object v0
.end method

.method public setHeaders(Lcom/huawei/health/sns/ui/group/healthbeans/HeadersBean;)V
    .locals 0

    .line 21
    iput-object p1, p0, Lcom/huawei/health/sns/ui/group/healthbeans/NspGetResponseListBean;->headers:Lcom/huawei/health/sns/ui/group/healthbeans/HeadersBean;

    .line 22
    return-void
.end method

.method public setId(I)V
    .locals 0

    .line 29
    iput p1, p0, Lcom/huawei/health/sns/ui/group/healthbeans/NspGetResponseListBean;->id:I

    .line 30
    return-void
.end method

.method public setMethod(Ljava/lang/String;)V
    .locals 0

    .line 37
    iput-object p1, p0, Lcom/huawei/health/sns/ui/group/healthbeans/NspGetResponseListBean;->method:Ljava/lang/String;

    .line 38
    return-void
.end method

.method public setUrl(Ljava/lang/String;)V
    .locals 0

    .line 45
    iput-object p1, p0, Lcom/huawei/health/sns/ui/group/healthbeans/NspGetResponseListBean;->url:Ljava/lang/String;

    .line 46
    return-void
.end method
