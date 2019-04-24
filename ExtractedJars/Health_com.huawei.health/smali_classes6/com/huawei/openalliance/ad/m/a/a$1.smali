.class Lcom/huawei/openalliance/ad/m/a/a$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/openalliance/ad/m/a/a;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/openalliance/ad/db/bean/UserCloseRecord;

.field final synthetic b:J

.field final synthetic c:Lcom/huawei/openalliance/ad/m/a/a;


# direct methods
.method constructor <init>(Lcom/huawei/openalliance/ad/m/a/a;Lcom/huawei/openalliance/ad/db/bean/UserCloseRecord;J)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/m/a/a$1;->c:Lcom/huawei/openalliance/ad/m/a/a;

    iput-object p2, p0, Lcom/huawei/openalliance/ad/m/a/a$1;->a:Lcom/huawei/openalliance/ad/db/bean/UserCloseRecord;

    iput-wide p3, p0, Lcom/huawei/openalliance/ad/m/a/a$1;->b:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lcom/huawei/openalliance/ad/m/a/a$1;->c:Lcom/huawei/openalliance/ad/m/a/a;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/m/a/a;->a(Lcom/huawei/openalliance/ad/m/a/a;)Lcom/huawei/openalliance/ad/e/a/f;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/openalliance/ad/m/a/a$1;->a:Lcom/huawei/openalliance/ad/db/bean/UserCloseRecord;

    invoke-interface {v0, v1}, Lcom/huawei/openalliance/ad/e/a/f;->a(Lcom/huawei/openalliance/ad/db/bean/UserCloseRecord;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/m/a/a$1;->c:Lcom/huawei/openalliance/ad/m/a/a;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/m/a/a;->a(Lcom/huawei/openalliance/ad/m/a/a;)Lcom/huawei/openalliance/ad/e/a/f;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/openalliance/ad/m/a/a$1;->b:J

    invoke-interface {v0, v1, v2}, Lcom/huawei/openalliance/ad/e/a/f;->a(J)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/m/a/a$1;->c:Lcom/huawei/openalliance/ad/m/a/a;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/m/a/a;->b(Lcom/huawei/openalliance/ad/m/a/a;)V

    return-void
.end method
