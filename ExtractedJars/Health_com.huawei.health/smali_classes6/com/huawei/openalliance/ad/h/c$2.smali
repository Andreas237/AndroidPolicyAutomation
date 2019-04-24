.class Lcom/huawei/openalliance/ad/h/c$2;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/huawei/openalliance/ad/f/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/openalliance/ad/h/c;->j()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/openalliance/ad/h/c;


# direct methods
.method constructor <init>(Lcom/huawei/openalliance/ad/h/c;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/h/c$2;->a:Lcom/huawei/openalliance/ad/h/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    const-string v0, "CacheAdMediator"

    const-string v1, "on Slogan Reach Min Show Time"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public b()V
    .locals 2

    const-string v0, "CacheAdMediator"

    const-string v1, "on Slogan Show End"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Lcom/huawei/openalliance/ad/h/c$2$1;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/h/c$2$1;-><init>(Lcom/huawei/openalliance/ad/h/c$2;)V

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/aj;->a(Ljava/lang/Runnable;)V

    return-void
.end method
