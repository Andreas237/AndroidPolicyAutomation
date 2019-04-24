.class Lcom/huawei/openalliance/ad/g/f$2;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/openalliance/ad/g/f;->a(Lcom/huawei/openalliance/ad/g/j;ILjava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/openalliance/ad/g/j;

.field final synthetic b:I

.field final synthetic c:Ljava/lang/String;

.field final synthetic d:Lcom/huawei/openalliance/ad/g/f;


# direct methods
.method constructor <init>(Lcom/huawei/openalliance/ad/g/f;Lcom/huawei/openalliance/ad/g/j;ILjava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/g/f$2;->d:Lcom/huawei/openalliance/ad/g/f;

    iput-object p2, p0, Lcom/huawei/openalliance/ad/g/f$2;->a:Lcom/huawei/openalliance/ad/g/j;

    iput p3, p0, Lcom/huawei/openalliance/ad/g/f$2;->b:I

    iput-object p4, p0, Lcom/huawei/openalliance/ad/g/f$2;->c:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    iget-object v0, p0, Lcom/huawei/openalliance/ad/g/f$2;->d:Lcom/huawei/openalliance/ad/g/f;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/g/f;->a(Lcom/huawei/openalliance/ad/g/f;)Lcom/huawei/openalliance/ad/g/h;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/openalliance/ad/g/f$2;->a:Lcom/huawei/openalliance/ad/g/j;

    iget v2, p0, Lcom/huawei/openalliance/ad/g/f$2;->b:I

    iget-object v3, p0, Lcom/huawei/openalliance/ad/g/f$2;->c:Ljava/lang/String;

    invoke-interface {v0, v1, v2, v3}, Lcom/huawei/openalliance/ad/g/h;->a(Lcom/huawei/openalliance/ad/g/j;ILjava/lang/String;)V

    return-void
.end method
