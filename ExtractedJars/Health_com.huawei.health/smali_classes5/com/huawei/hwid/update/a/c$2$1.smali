.class Lcom/huawei/hwid/update/a/c$2$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/hwid/update/a/c$2;->a(ILcom/huawei/hwid/update/a/a/c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic b:Lcom/huawei/hwid/update/a/a/c;

.field final synthetic c:Lcom/huawei/hwid/update/a/c$2;


# direct methods
.method constructor <init>(Lcom/huawei/hwid/update/a/c$2;ILcom/huawei/hwid/update/a/a/c;)V
    .locals 0

    .line 88
    iput-object p1, p0, Lcom/huawei/hwid/update/a/c$2$1;->c:Lcom/huawei/hwid/update/a/c$2;

    iput p2, p0, Lcom/huawei/hwid/update/a/c$2$1;->a:I

    iput-object p3, p0, Lcom/huawei/hwid/update/a/c$2$1;->b:Lcom/huawei/hwid/update/a/a/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 92
    iget-object v0, p0, Lcom/huawei/hwid/update/a/c$2$1;->c:Lcom/huawei/hwid/update/a/c$2;

    iget-object v0, v0, Lcom/huawei/hwid/update/a/c$2;->a:Lcom/huawei/hwid/update/a/a/b;

    iget v1, p0, Lcom/huawei/hwid/update/a/c$2$1;->a:I

    iget-object v2, p0, Lcom/huawei/hwid/update/a/c$2$1;->b:Lcom/huawei/hwid/update/a/a/c;

    invoke-interface {v0, v1, v2}, Lcom/huawei/hwid/update/a/a/b;->a(ILcom/huawei/hwid/update/a/a/c;)V

    .line 93
    return-void
.end method
