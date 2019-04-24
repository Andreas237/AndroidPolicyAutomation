.class Lo/bpj$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/bpj;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "d"
.end annotation


# instance fields
.field private a:Lcom/huawei/feedback/bean/MetadataBundle;


# direct methods
.method constructor <init>(I)V
    .locals 3

    .line 412
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 413
    new-instance v0, Lcom/huawei/feedback/bean/MetadataBundle;

    const-string v1, "com.huawei.health.sns"

    invoke-static {}, Lo/brg;->d()I

    move-result v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, p1, v1, v2}, Lcom/huawei/feedback/bean/MetadataBundle;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    iput-object v0, p0, Lo/bpj$d;->a:Lcom/huawei/feedback/bean/MetadataBundle;

    .line 414
    return-void
.end method


# virtual methods
.method public c(I)Lo/bpj$d;
    .locals 3

    .line 423
    iget-object v0, p0, Lo/bpj$d;->a:Lcom/huawei/feedback/bean/MetadataBundle;

    const-string v1, "error_code"

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/huawei/feedback/bean/MetadataBundle;->putData(Ljava/lang/String;Ljava/lang/String;)V

    .line 424
    return-object p0
.end method

.method public c(Ljava/lang/String;)Lo/bpj$d;
    .locals 2

    .line 434
    iget-object v0, p0, Lo/bpj$d;->a:Lcom/huawei/feedback/bean/MetadataBundle;

    const-string v1, "error_reason"

    invoke-virtual {v0, v1, p1}, Lcom/huawei/feedback/bean/MetadataBundle;->putData(Ljava/lang/String;Ljava/lang/String;)V

    .line 435
    return-object p0
.end method

.method public d()Landroid/os/Bundle;
    .locals 3

    .line 451
    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 452
    const-string v0, "MetaData"

    iget-object v1, p0, Lo/bpj$d;->a:Lcom/huawei/feedback/bean/MetadataBundle;

    invoke-virtual {v1}, Lcom/huawei/feedback/bean/MetadataBundle;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 453
    return-object v2
.end method
