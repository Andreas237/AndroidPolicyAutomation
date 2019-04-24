.class Lcom/huawei/openalliance/ad/download/app/b$5;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/openalliance/ad/download/app/b;->e(Lcom/huawei/openalliance/ad/inter/data/AppInfo;)Ljava/lang/String;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Ljava/util/concurrent/Callable<Ljava/lang/String;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/openalliance/ad/download/app/b;


# direct methods
.method constructor <init>(Lcom/huawei/openalliance/ad/download/app/b;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/download/app/b$5;->a:Lcom/huawei/openalliance/ad/download/app/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/download/app/b$5;->a:Lcom/huawei/openalliance/ad/download/app/b;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/download/app/b;->c(Lcom/huawei/openalliance/ad/download/app/b;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/openalliance/ad/download/app/b;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public synthetic call()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/download/app/b$5;->a()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
