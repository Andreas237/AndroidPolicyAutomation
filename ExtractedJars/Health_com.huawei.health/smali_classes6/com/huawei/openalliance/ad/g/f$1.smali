.class Lcom/huawei/openalliance/ad/g/f$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/openalliance/ad/g/f;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/huawei/openalliance/ad/g/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Lcom/huawei/openalliance/ad/g/f;


# direct methods
.method constructor <init>(Lcom/huawei/openalliance/ad/g/f;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/g/f$1;->c:Lcom/huawei/openalliance/ad/g/f;

    iput-object p2, p0, Lcom/huawei/openalliance/ad/g/f$1;->a:Ljava/lang/String;

    iput-object p3, p0, Lcom/huawei/openalliance/ad/g/f$1;->b:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lcom/huawei/openalliance/ad/g/f$1;->c:Lcom/huawei/openalliance/ad/g/f;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/g/f;->a(Lcom/huawei/openalliance/ad/g/f;)Lcom/huawei/openalliance/ad/g/h;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/openalliance/ad/g/f$1;->a:Ljava/lang/String;

    iget-object v2, p0, Lcom/huawei/openalliance/ad/g/f$1;->b:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Lcom/huawei/openalliance/ad/g/h;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/huawei/openalliance/ad/g/h;

    return-void
.end method
