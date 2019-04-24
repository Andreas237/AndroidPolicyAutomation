.class public Lcom/huawei/openalliance/ad/h/b;
.super Ljava/lang/Object;


# static fields
.field private static final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lcom/huawei/openalliance/ad/h/b;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/openalliance/ad/h/b;->a:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Lcom/huawei/openalliance/ad/constant/AdLoadMode;Lcom/huawei/openalliance/ad/views/interfaces/c;)Lcom/huawei/openalliance/ad/h/a;
    .locals 5

    sget-object v0, Lcom/huawei/openalliance/ad/h/b;->a:Ljava/lang/String;

    const-string v1, "create ad mediator: %s"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p0, v2, v3

    invoke-static {v0, v1, v2}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    sget-object v0, Lcom/huawei/openalliance/ad/constant/AdLoadMode;->REAL:Lcom/huawei/openalliance/ad/constant/AdLoadMode;

    if-ne p0, v0, :cond_0

    new-instance v4, Lcom/huawei/openalliance/ad/h/d;

    invoke-direct {v4, p1}, Lcom/huawei/openalliance/ad/h/d;-><init>(Lcom/huawei/openalliance/ad/views/interfaces/c;)V

    goto :goto_0

    :cond_0
    new-instance v4, Lcom/huawei/openalliance/ad/h/c;

    invoke-direct {v4, p1}, Lcom/huawei/openalliance/ad/h/c;-><init>(Lcom/huawei/openalliance/ad/views/interfaces/c;)V

    :goto_0
    return-object v4
.end method
