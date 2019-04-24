.class Lcom/huawei/openalliance/ad/views/a/c$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/openalliance/ad/views/a/c;->b(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lcom/huawei/openalliance/ad/views/a/c;


# direct methods
.method constructor <init>(Lcom/huawei/openalliance/ad/views/a/c;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/views/a/c$1;->b:Lcom/huawei/openalliance/ad/views/a/c;

    iput-object p2, p0, Lcom/huawei/openalliance/ad/views/a/c$1;->a:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/a/c$1;->b:Lcom/huawei/openalliance/ad/views/a/c;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/views/a/c$1;->a:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/views/a/c;->a(Lcom/huawei/openalliance/ad/views/a/c;Ljava/lang/String;)V

    return-void
.end method
