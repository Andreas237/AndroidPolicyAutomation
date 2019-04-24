.class Lcom/huawei/openalliance/ad/download/app/b$3;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/openalliance/ad/download/app/b;->c(Lcom/huawei/openalliance/ad/inter/data/AppInfo;)Lcom/huawei/openalliance/ad/download/app/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Ljava/util/concurrent/Callable<Lcom/huawei/openalliance/ad/download/app/c;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/openalliance/ad/inter/data/AppInfo;

.field final synthetic b:Lcom/huawei/openalliance/ad/download/app/b;


# direct methods
.method constructor <init>(Lcom/huawei/openalliance/ad/download/app/b;Lcom/huawei/openalliance/ad/inter/data/AppInfo;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/download/app/b$3;->b:Lcom/huawei/openalliance/ad/download/app/b;

    iput-object p2, p0, Lcom/huawei/openalliance/ad/download/app/b$3;->a:Lcom/huawei/openalliance/ad/inter/data/AppInfo;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/huawei/openalliance/ad/download/app/c;
    .locals 2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/download/app/b$3;->b:Lcom/huawei/openalliance/ad/download/app/b;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/download/app/b$3;->a:Lcom/huawei/openalliance/ad/inter/data/AppInfo;

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/download/app/b;->a(Lcom/huawei/openalliance/ad/download/app/b;Lcom/huawei/openalliance/ad/inter/data/AppInfo;)Lcom/huawei/openalliance/ad/download/app/c;

    move-result-object v0

    return-object v0
.end method

.method public synthetic call()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/download/app/b$3;->a()Lcom/huawei/openalliance/ad/download/app/c;

    move-result-object v0

    return-object v0
.end method
