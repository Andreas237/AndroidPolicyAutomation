.class public Lcom/huawei/openalliance/ad/download/app/c;
.super Lcom/huawei/openalliance/ad/download/e;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/openalliance/ad/download/app/c$a;
    }
.end annotation


# instance fields
.field private a:Lcom/huawei/openalliance/ad/inter/data/AppInfo;

.field private b:Lcom/huawei/openalliance/ad/k/b/d;

.field private c:I

.field private d:Ljava/lang/Integer;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/download/e;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/huawei/openalliance/ad/inter/data/AppInfo;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/download/app/c;->a:Lcom/huawei/openalliance/ad/inter/data/AppInfo;

    return-void
.end method

.method public a(Lcom/huawei/openalliance/ad/k/b/d;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/download/app/c;->b:Lcom/huawei/openalliance/ad/k/b/d;

    return-void
.end method

.method public a(Ljava/lang/Integer;)V
    .locals 2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/download/app/c;->d:Ljava/lang/Integer;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/download/app/c;->d:Ljava/lang/Integer;

    :cond_0
    return-void
.end method

.method public c(I)V
    .locals 0

    iput p1, p0, Lcom/huawei/openalliance/ad/download/app/c;->c:I

    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    invoke-super {p0, p1}, Lcom/huawei/openalliance/ad/download/e;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public hashCode()I
    .locals 1

    invoke-super {p0}, Lcom/huawei/openalliance/ad/download/e;->hashCode()I

    move-result v0

    return v0
.end method

.method public m()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/download/app/c;->a:Lcom/huawei/openalliance/ad/inter/data/AppInfo;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/download/app/c;->a:Lcom/huawei/openalliance/ad/inter/data/AppInfo;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/inter/data/AppInfo;->getPackageName()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public t()Lcom/huawei/openalliance/ad/inter/data/AppInfo;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/download/app/c;->a:Lcom/huawei/openalliance/ad/inter/data/AppInfo;

    return-object v0
.end method

.method public u()Lcom/huawei/openalliance/ad/k/b/d;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/download/app/c;->b:Lcom/huawei/openalliance/ad/k/b/d;

    return-object v0
.end method

.method public v()I
    .locals 1

    iget v0, p0, Lcom/huawei/openalliance/ad/download/app/c;->c:I

    return v0
.end method

.method public w()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/download/app/c;->d:Ljava/lang/Integer;

    return-object v0
.end method
