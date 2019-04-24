.class public Lcom/huawei/openalliance/ad/i/a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<V::Lcom/huawei/openalliance/ad/i/b;>Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field private a:Lcom/huawei/openalliance/ad/i/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TV;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/huawei/openalliance/ad/i/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TV;"
        }
    .end annotation

    iget-object v0, p0, Lcom/huawei/openalliance/ad/i/a;->a:Lcom/huawei/openalliance/ad/i/b;

    return-object v0
.end method

.method public a(Lcom/huawei/openalliance/ad/i/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TV;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/huawei/openalliance/ad/i/a;->a:Lcom/huawei/openalliance/ad/i/b;

    return-void
.end method
