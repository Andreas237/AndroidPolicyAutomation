.class public Lcom/huawei/openalliance/ad/download/app/c$a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/openalliance/ad/download/app/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private a:Lcom/huawei/openalliance/ad/inter/data/AppInfo;

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:Z

.field private e:Lcom/huawei/openalliance/ad/k/b/d;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/huawei/openalliance/ad/inter/data/AppInfo;)Lcom/huawei/openalliance/ad/download/app/c$a;
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/download/app/c$a;->a:Lcom/huawei/openalliance/ad/inter/data/AppInfo;

    return-object p0
.end method

.method public a(Lcom/huawei/openalliance/ad/k/b/d;)Lcom/huawei/openalliance/ad/download/app/c$a;
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/download/app/c$a;->e:Lcom/huawei/openalliance/ad/k/b/d;

    return-object p0
.end method

.method public a(Ljava/lang/String;)Lcom/huawei/openalliance/ad/download/app/c$a;
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/download/app/c$a;->b:Ljava/lang/String;

    return-object p0
.end method

.method public a(Z)Lcom/huawei/openalliance/ad/download/app/c$a;
    .locals 0

    iput-boolean p1, p0, Lcom/huawei/openalliance/ad/download/app/c$a;->d:Z

    return-object p0
.end method

.method public a()Lcom/huawei/openalliance/ad/download/app/c;
    .locals 3

    iget-object v0, p0, Lcom/huawei/openalliance/ad/download/app/c$a;->a:Lcom/huawei/openalliance/ad/inter/data/AppInfo;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    new-instance v2, Lcom/huawei/openalliance/ad/download/app/c;

    invoke-direct {v2}, Lcom/huawei/openalliance/ad/download/app/c;-><init>()V

    iget-boolean v0, p0, Lcom/huawei/openalliance/ad/download/app/c$a;->d:Z

    invoke-virtual {v2, v0}, Lcom/huawei/openalliance/ad/download/app/c;->a(Z)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/download/app/c$a;->b:Ljava/lang/String;

    invoke-virtual {v2, v0}, Lcom/huawei/openalliance/ad/download/app/c;->d(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/download/app/c$a;->e:Lcom/huawei/openalliance/ad/k/b/d;

    invoke-virtual {v2, v0}, Lcom/huawei/openalliance/ad/download/app/c;->a(Lcom/huawei/openalliance/ad/k/b/d;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/download/app/c$a;->a:Lcom/huawei/openalliance/ad/inter/data/AppInfo;

    invoke-virtual {v2, v0}, Lcom/huawei/openalliance/ad/download/app/c;->a(Lcom/huawei/openalliance/ad/inter/data/AppInfo;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/download/app/c$a;->c:Ljava/lang/String;

    invoke-virtual {v2, v0}, Lcom/huawei/openalliance/ad/download/app/c;->e(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/download/app/c$a;->a:Lcom/huawei/openalliance/ad/inter/data/AppInfo;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/inter/data/AppInfo;->getDownloadUrl()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/openalliance/ad/download/app/c;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/download/app/c$a;->a:Lcom/huawei/openalliance/ad/inter/data/AppInfo;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/inter/data/AppInfo;->getSafeDownloadUrl()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/openalliance/ad/download/app/c;->b(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/download/app/c$a;->a:Lcom/huawei/openalliance/ad/inter/data/AppInfo;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/inter/data/AppInfo;->getSha256()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/openalliance/ad/download/app/c;->c(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/download/app/c$a;->a:Lcom/huawei/openalliance/ad/inter/data/AppInfo;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/inter/data/AppInfo;->getFileSize()J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/openalliance/ad/download/app/c;->a(J)V

    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Lcom/huawei/openalliance/ad/download/app/c;->a(I)V

    return-object v2
.end method

.method public b(Ljava/lang/String;)Lcom/huawei/openalliance/ad/download/app/c$a;
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/download/app/c$a;->c:Ljava/lang/String;

    return-object p0
.end method
