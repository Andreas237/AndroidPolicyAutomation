.class Lcom/huawei/openalliance/ad/download/app/b$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/openalliance/ad/download/app/b;-><init>(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/content/Context;

.field final synthetic b:Lcom/huawei/openalliance/ad/download/app/b;


# direct methods
.method constructor <init>(Lcom/huawei/openalliance/ad/download/app/b;Landroid/content/Context;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/download/app/b$1;->b:Lcom/huawei/openalliance/ad/download/app/b;

    iput-object p2, p0, Lcom/huawei/openalliance/ad/download/app/b$1;->a:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/download/app/b$1;->b:Lcom/huawei/openalliance/ad/download/app/b;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/download/app/b$1;->a:Landroid/content/Context;

    invoke-static {v1}, Lcom/huawei/openalliance/ad/download/app/b;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/download/app/b;->a(Lcom/huawei/openalliance/ad/download/app/b;Ljava/lang/String;)Ljava/lang/String;

    return-void
.end method
