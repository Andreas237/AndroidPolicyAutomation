.class Lcom/huawei/openalliance/ad/h/a$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/openalliance/ad/h/a;->a(Lcom/huawei/openalliance/ad/db/bean/ContentRecord;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/openalliance/ad/db/bean/ContentRecord;

.field final synthetic b:Lcom/huawei/openalliance/ad/h/a;


# direct methods
.method constructor <init>(Lcom/huawei/openalliance/ad/h/a;Lcom/huawei/openalliance/ad/db/bean/ContentRecord;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/h/a$1;->b:Lcom/huawei/openalliance/ad/h/a;

    iput-object p2, p0, Lcom/huawei/openalliance/ad/h/a$1;->a:Lcom/huawei/openalliance/ad/db/bean/ContentRecord;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/h/a$1;->b:Lcom/huawei/openalliance/ad/h/a;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/h/a$1;->a:Lcom/huawei/openalliance/ad/db/bean/ContentRecord;

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/h/a;->a(Lcom/huawei/openalliance/ad/h/a;Lcom/huawei/openalliance/ad/db/bean/ContentRecord;)V

    return-void
.end method
