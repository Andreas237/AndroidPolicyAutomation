.class public Lcom/huawei/openalliance/ad/net/http/b/b/h$a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/openalliance/ad/net/http/b/b/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# static fields
.field private static final a:Lcom/huawei/openalliance/ad/net/http/b/b/i;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/huawei/openalliance/ad/net/http/b/b/i;

    invoke-direct {v0}, Lcom/huawei/openalliance/ad/net/http/b/b/i;-><init>()V

    sput-object v0, Lcom/huawei/openalliance/ad/net/http/b/b/h$a;->a:Lcom/huawei/openalliance/ad/net/http/b/b/i;

    return-void
.end method

.method public static a(Ljava/lang/Class;)Lcom/huawei/openalliance/ad/net/http/b/b/h;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<RD:Ljava/lang/Object;>(Ljava/lang/Class<TRD;>;)Lcom/huawei/openalliance/ad/net/http/b/b/h<TRD;>;"
        }
    .end annotation

    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    if-eq p0, v0, :cond_0

    const-class v0, Ljava/lang/Integer;

    if-ne p0, v0, :cond_1

    :cond_0
    new-instance v0, Lcom/huawei/openalliance/ad/net/http/b/b/e;

    invoke-direct {v0}, Lcom/huawei/openalliance/ad/net/http/b/b/e;-><init>()V

    return-object v0

    :cond_1
    sget-object v0, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    if-eq p0, v0, :cond_2

    const-class v0, Ljava/lang/Float;

    if-ne p0, v0, :cond_3

    :cond_2
    new-instance v0, Lcom/huawei/openalliance/ad/net/http/b/b/c;

    invoke-direct {v0}, Lcom/huawei/openalliance/ad/net/http/b/b/c;-><init>()V

    return-object v0

    :cond_3
    sget-object v0, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    if-eq p0, v0, :cond_4

    const-class v0, Ljava/lang/Double;

    if-ne p0, v0, :cond_5

    :cond_4
    new-instance v0, Lcom/huawei/openalliance/ad/net/http/b/b/b;

    invoke-direct {v0}, Lcom/huawei/openalliance/ad/net/http/b/b/b;-><init>()V

    return-object v0

    :cond_5
    sget-object v0, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    if-eq p0, v0, :cond_6

    const-class v0, Ljava/lang/Long;

    if-ne p0, v0, :cond_7

    :cond_6
    new-instance v0, Lcom/huawei/openalliance/ad/net/http/b/b/g;

    invoke-direct {v0}, Lcom/huawei/openalliance/ad/net/http/b/b/g;-><init>()V

    return-object v0

    :cond_7
    const-class v0, Ljava/lang/String;

    if-ne p0, v0, :cond_8

    sget-object v0, Lcom/huawei/openalliance/ad/net/http/b/b/h$a;->a:Lcom/huawei/openalliance/ad/net/http/b/b/i;

    return-object v0

    :cond_8
    invoke-virtual {p0}, Ljava/lang/Class;->isPrimitive()Z

    move-result v0

    if-nez v0, :cond_9

    new-instance v0, Lcom/huawei/openalliance/ad/net/http/b/b/f;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/net/http/b/b/f;-><init>(Ljava/lang/Class;)V

    return-object v0

    :cond_9
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Response type: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " not supported!"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
