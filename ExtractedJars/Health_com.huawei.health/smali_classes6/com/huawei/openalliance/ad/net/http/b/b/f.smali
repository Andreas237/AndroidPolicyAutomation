.class public Lcom/huawei/openalliance/ad/net/http/b/b/f;
.super Lcom/huawei/openalliance/ad/net/http/b/b/a;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<R:Ljava/lang/Object;>Lcom/huawei/openalliance/ad/net/http/b/b/a<TR;>;"
    }
.end annotation


# instance fields
.field private a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<TR;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/Class;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/Class<TR;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/net/http/b/b/a;-><init>()V

    iput-object p1, p0, Lcom/huawei/openalliance/ad/net/http/b/b/f;->a:Ljava/lang/Class;

    return-void
.end method


# virtual methods
.method protected a(Ljava/lang/String;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;)TR;"
        }
    .end annotation

    :try_start_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/net/http/b/b/f;->a:Ljava/lang/Class;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Class;

    invoke-static {p1, v0, v1}, Lcom/huawei/openalliance/ad/utils/p;->a(Ljava/lang/String;Ljava/lang/Class;[Ljava/lang/Class;)Ljava/lang/Object;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    :catch_0
    move-exception v2

    const-string v0, "JsonObjDataConverter"

    const-string v1, "convertStringToData json JSONException"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    throw v2
.end method
