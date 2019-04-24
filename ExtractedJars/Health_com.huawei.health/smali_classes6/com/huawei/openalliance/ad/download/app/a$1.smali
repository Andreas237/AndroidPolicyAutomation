.class Lcom/huawei/openalliance/ad/download/app/a$1;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/huawei/openalliance/ad/k/d$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/openalliance/ad/download/app/a;->d(Lcom/huawei/openalliance/ad/download/app/c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/openalliance/ad/download/app/c;

.field final synthetic b:Lcom/huawei/openalliance/ad/download/app/a;


# direct methods
.method constructor <init>(Lcom/huawei/openalliance/ad/download/app/a;Lcom/huawei/openalliance/ad/download/app/c;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/download/app/a$1;->b:Lcom/huawei/openalliance/ad/download/app/a;

    iput-object p2, p0, Lcom/huawei/openalliance/ad/download/app/a$1;->a:Lcom/huawei/openalliance/ad/download/app/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    const-string v0, "AppDownloadDelegate"

    const-string v1, "onSilentInstallStart"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/download/app/a$1;->a:Lcom/huawei/openalliance/ad/download/app/c;

    sget-object v1, Lcom/huawei/openalliance/ad/download/d;->f:Lcom/huawei/openalliance/ad/download/d;

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/download/app/c;->a(Lcom/huawei/openalliance/ad/download/d;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/download/app/a$1;->b:Lcom/huawei/openalliance/ad/download/app/a;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/download/app/a$1;->a:Lcom/huawei/openalliance/ad/download/app/c;

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/download/app/a;->a(Lcom/huawei/openalliance/ad/download/app/a;Lcom/huawei/openalliance/ad/download/app/c;)V

    return-void
.end method

.method public b()V
    .locals 2

    const-string v0, "AppDownloadDelegate"

    const-string v1, "onSystemInstallStart"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/download/app/a$1;->a:Lcom/huawei/openalliance/ad/download/app/c;

    sget-object v1, Lcom/huawei/openalliance/ad/download/d;->d:Lcom/huawei/openalliance/ad/download/d;

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/download/app/c;->a(Lcom/huawei/openalliance/ad/download/d;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/download/app/a$1;->b:Lcom/huawei/openalliance/ad/download/app/a;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/download/app/a$1;->a:Lcom/huawei/openalliance/ad/download/app/c;

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/download/app/a;->a(Lcom/huawei/openalliance/ad/download/app/a;Lcom/huawei/openalliance/ad/download/app/c;)V

    return-void
.end method

.method public c()V
    .locals 2

    const-string v0, "AppDownloadDelegate"

    const-string v1, "install apk failed"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/download/app/a$1;->a:Lcom/huawei/openalliance/ad/download/app/c;

    sget-object v1, Lcom/huawei/openalliance/ad/download/d;->d:Lcom/huawei/openalliance/ad/download/d;

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/download/app/c;->a(Lcom/huawei/openalliance/ad/download/d;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/download/app/a$1;->b:Lcom/huawei/openalliance/ad/download/app/a;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/download/app/a$1;->a:Lcom/huawei/openalliance/ad/download/app/c;

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/download/app/a;->a(Lcom/huawei/openalliance/ad/download/app/a;Lcom/huawei/openalliance/ad/download/app/c;)V

    return-void
.end method
