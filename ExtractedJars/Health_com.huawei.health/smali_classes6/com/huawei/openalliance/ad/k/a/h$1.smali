.class Lcom/huawei/openalliance/ad/k/a/h$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/openalliance/ad/k/a/h;->a(Ljava/lang/String;ILcom/huawei/openalliance/ad/beans/metadata/Content;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:I

.field final synthetic c:Lcom/huawei/openalliance/ad/beans/metadata/Content;

.field final synthetic d:Lcom/huawei/openalliance/ad/k/a/h;


# direct methods
.method constructor <init>(Lcom/huawei/openalliance/ad/k/a/h;Ljava/lang/String;ILcom/huawei/openalliance/ad/beans/metadata/Content;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/k/a/h$1;->d:Lcom/huawei/openalliance/ad/k/a/h;

    iput-object p2, p0, Lcom/huawei/openalliance/ad/k/a/h$1;->a:Ljava/lang/String;

    iput p3, p0, Lcom/huawei/openalliance/ad/k/a/h$1;->b:I

    iput-object p4, p0, Lcom/huawei/openalliance/ad/k/a/h$1;->c:Lcom/huawei/openalliance/ad/beans/metadata/Content;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    iget-object v0, p0, Lcom/huawei/openalliance/ad/k/a/h$1;->d:Lcom/huawei/openalliance/ad/k/a/h;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/k/a/h$1;->a:Ljava/lang/String;

    iget v2, p0, Lcom/huawei/openalliance/ad/k/a/h$1;->b:I

    iget-object v3, p0, Lcom/huawei/openalliance/ad/k/a/h$1;->c:Lcom/huawei/openalliance/ad/beans/metadata/Content;

    invoke-static {v0, v1, v2, v3}, Lcom/huawei/openalliance/ad/k/a/h;->a(Lcom/huawei/openalliance/ad/k/a/h;Ljava/lang/String;ILcom/huawei/openalliance/ad/beans/metadata/Content;)V

    return-void
.end method
