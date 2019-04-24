.class Lcom/huawei/hwid/update/a/c$2$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/hwid/update/a/c$2;->a(IIILjava/io/File;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic b:I

.field final synthetic c:I

.field final synthetic d:Ljava/io/File;

.field final synthetic e:Lcom/huawei/hwid/update/a/c$2;


# direct methods
.method constructor <init>(Lcom/huawei/hwid/update/a/c$2;IIILjava/io/File;)V
    .locals 0

    .line 100
    iput-object p1, p0, Lcom/huawei/hwid/update/a/c$2$2;->e:Lcom/huawei/hwid/update/a/c$2;

    iput p2, p0, Lcom/huawei/hwid/update/a/c$2$2;->a:I

    iput p3, p0, Lcom/huawei/hwid/update/a/c$2$2;->b:I

    iput p4, p0, Lcom/huawei/hwid/update/a/c$2$2;->c:I

    iput-object p5, p0, Lcom/huawei/hwid/update/a/c$2$2;->d:Ljava/io/File;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 104
    iget-object v0, p0, Lcom/huawei/hwid/update/a/c$2$2;->e:Lcom/huawei/hwid/update/a/c$2;

    iget-object v0, v0, Lcom/huawei/hwid/update/a/c$2;->a:Lcom/huawei/hwid/update/a/a/b;

    iget v1, p0, Lcom/huawei/hwid/update/a/c$2$2;->a:I

    iget v2, p0, Lcom/huawei/hwid/update/a/c$2$2;->b:I

    iget v3, p0, Lcom/huawei/hwid/update/a/c$2$2;->c:I

    iget-object v4, p0, Lcom/huawei/hwid/update/a/c$2$2;->d:Ljava/io/File;

    invoke-interface {v0, v1, v2, v3, v4}, Lcom/huawei/hwid/update/a/a/b;->a(IIILjava/io/File;)V

    .line 105
    return-void
.end method
