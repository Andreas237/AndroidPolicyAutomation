.class Lcom/huawei/openalliance/ad/utils/p$b;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/huawei/openalliance/ad/utils/p$h;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/openalliance/ad/utils/p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lcom/huawei/openalliance/ad/utils/p$h<Ljava/lang/Byte;Ljava/lang/Number;>;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/huawei/openalliance/ad/utils/p$1;)V
    .locals 0

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/utils/p$b;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Number;)Ljava/lang/Byte;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Number;->byteValue()B

    move-result v0

    invoke-static {v0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v0

    return-object v0
.end method

.method public synthetic b(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    move-object v0, p1

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {p0, v0}, Lcom/huawei/openalliance/ad/utils/p$b;->a(Ljava/lang/Number;)Ljava/lang/Byte;

    move-result-object v0

    return-object v0
.end method
