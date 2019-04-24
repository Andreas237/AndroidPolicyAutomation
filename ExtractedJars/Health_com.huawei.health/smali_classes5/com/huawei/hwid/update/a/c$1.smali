.class Lcom/huawei/hwid/update/a/c$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/hwid/update/a/c;->a(Lcom/huawei/hwid/update/a/a/b;Lcom/huawei/hwid/update/a/a/c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/hwid/update/a/a/b;

.field final synthetic b:Lcom/huawei/hwid/update/a/a/c;

.field final synthetic c:Lcom/huawei/hwid/update/a/c;


# direct methods
.method constructor <init>(Lcom/huawei/hwid/update/a/c;Lcom/huawei/hwid/update/a/a/b;Lcom/huawei/hwid/update/a/a/c;)V
    .locals 0

    .line 67
    iput-object p1, p0, Lcom/huawei/hwid/update/a/c$1;->c:Lcom/huawei/hwid/update/a/c;

    iput-object p2, p0, Lcom/huawei/hwid/update/a/c$1;->a:Lcom/huawei/hwid/update/a/a/b;

    iput-object p3, p0, Lcom/huawei/hwid/update/a/c$1;->b:Lcom/huawei/hwid/update/a/a/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 71
    iget-object v0, p0, Lcom/huawei/hwid/update/a/c$1;->c:Lcom/huawei/hwid/update/a/c;

    invoke-static {v0}, Lcom/huawei/hwid/update/a/c;->a(Lcom/huawei/hwid/update/a/c;)Lcom/huawei/hwid/update/a/a/a;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwid/update/a/c$1;->a:Lcom/huawei/hwid/update/a/a/b;

    invoke-static {v1}, Lcom/huawei/hwid/update/a/c;->a(Lcom/huawei/hwid/update/a/a/b;)Lcom/huawei/hwid/update/a/a/b;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/hwid/update/a/c$1;->b:Lcom/huawei/hwid/update/a/a/c;

    invoke-interface {v0, v1, v2}, Lcom/huawei/hwid/update/a/a/a;->a(Lcom/huawei/hwid/update/a/a/b;Lcom/huawei/hwid/update/a/a/c;)V

    .line 72
    return-void
.end method
