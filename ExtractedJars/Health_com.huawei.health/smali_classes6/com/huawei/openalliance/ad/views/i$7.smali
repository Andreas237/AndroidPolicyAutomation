.class Lcom/huawei/openalliance/ad/views/i$7;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/openalliance/ad/views/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/openalliance/ad/views/i;


# direct methods
.method constructor <init>(Lcom/huawei/openalliance/ad/views/i;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/views/i$7;->a:Lcom/huawei/openalliance/ad/views/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/i$7;->a:Lcom/huawei/openalliance/ad/views/i;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Lcom/huawei/openalliance/ad/views/i;->a(Lcom/huawei/openalliance/ad/views/i;ZZ)V

    return-void
.end method
