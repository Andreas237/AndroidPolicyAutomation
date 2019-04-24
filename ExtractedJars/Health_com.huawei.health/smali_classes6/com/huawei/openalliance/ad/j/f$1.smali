.class Lcom/huawei/openalliance/ad/j/f$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/openalliance/ad/j/f;->a(Lcom/huawei/openalliance/ad/inter/data/VideoInfo;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/openalliance/ad/inter/data/VideoInfo;

.field final synthetic b:Lcom/huawei/openalliance/ad/j/f;


# direct methods
.method constructor <init>(Lcom/huawei/openalliance/ad/j/f;Lcom/huawei/openalliance/ad/inter/data/VideoInfo;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/j/f$1;->b:Lcom/huawei/openalliance/ad/j/f;

    iput-object p2, p0, Lcom/huawei/openalliance/ad/j/f$1;->a:Lcom/huawei/openalliance/ad/inter/data/VideoInfo;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/j/f$1;->a:Lcom/huawei/openalliance/ad/inter/data/VideoInfo;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/inter/data/VideoInfo;->checkHash()Z

    move-result v1

    new-instance v0, Lcom/huawei/openalliance/ad/j/f$1$1;

    invoke-direct {v0, p0, v1}, Lcom/huawei/openalliance/ad/j/f$1$1;-><init>(Lcom/huawei/openalliance/ad/j/f$1;Z)V

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/aj;->a(Ljava/lang/Runnable;)V

    return-void
.end method
