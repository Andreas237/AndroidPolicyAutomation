.class public Lcom/huawei/wallet/logic/down/AppBean;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Ljava/lang/String;

.field private c:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 0

    .line 32
    iput-object p1, p0, Lcom/huawei/wallet/logic/down/AppBean;->c:Ljava/lang/String;

    .line 33
    return-void
.end method

.method public c()Ljava/lang/String;
    .locals 1

    .line 27
    iget-object v0, p0, Lcom/huawei/wallet/logic/down/AppBean;->c:Ljava/lang/String;

    return-object v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    .line 37
    iget-object v0, p0, Lcom/huawei/wallet/logic/down/AppBean;->a:Ljava/lang/String;

    return-object v0
.end method

.method public e(Ljava/lang/String;)V
    .locals 0

    .line 42
    iput-object p1, p0, Lcom/huawei/wallet/logic/down/AppBean;->a:Ljava/lang/String;

    .line 43
    return-void
.end method
