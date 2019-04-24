.class Lcom/huawei/openalliance/ad/download/g$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/openalliance/ad/download/g;->a(Lcom/huawei/openalliance/ad/download/e;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/openalliance/ad/download/g;


# direct methods
.method constructor <init>(Lcom/huawei/openalliance/ad/download/g;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/download/g$1;->a:Lcom/huawei/openalliance/ad/download/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/download/g$1;->a:Lcom/huawei/openalliance/ad/download/g;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/download/g;->a(Lcom/huawei/openalliance/ad/download/g;)Ljava/net/HttpURLConnection;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/ac;->a(Ljava/net/HttpURLConnection;)V

    return-void
.end method
