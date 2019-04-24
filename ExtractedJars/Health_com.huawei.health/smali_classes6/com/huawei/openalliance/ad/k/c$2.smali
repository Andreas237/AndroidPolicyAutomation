.class Lcom/huawei/openalliance/ad/k/c$2;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/openalliance/ad/k/c;->b(Lcom/huawei/openalliance/ad/db/bean/EventRecord;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/openalliance/ad/db/bean/EventRecord;

.field final synthetic b:Lcom/huawei/openalliance/ad/k/c;


# direct methods
.method constructor <init>(Lcom/huawei/openalliance/ad/k/c;Lcom/huawei/openalliance/ad/db/bean/EventRecord;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/k/c$2;->b:Lcom/huawei/openalliance/ad/k/c;

    iput-object p2, p0, Lcom/huawei/openalliance/ad/k/c$2;->a:Lcom/huawei/openalliance/ad/db/bean/EventRecord;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/k/c$2;->b:Lcom/huawei/openalliance/ad/k/c;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/k/c$2;->a:Lcom/huawei/openalliance/ad/db/bean/EventRecord;

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/k/c;->a(Lcom/huawei/openalliance/ad/k/c;Lcom/huawei/openalliance/ad/db/bean/EventRecord;)V

    return-void
.end method
