.class public Lcom/huawei/wallet/commonbase/router/WalletActionRequest;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;)V"
        }
    .end annotation

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-object p1, p0, Lcom/huawei/wallet/commonbase/router/WalletActionRequest;->a:Ljava/lang/String;

    .line 20
    return-void
.end method


# virtual methods
.method public c()Ljava/lang/String;
    .locals 1

    .line 12
    iget-object v0, p0, Lcom/huawei/wallet/commonbase/router/WalletActionRequest;->a:Ljava/lang/String;

    return-object v0
.end method
