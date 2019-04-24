.class public Lcom/huawei/datatype/CommandResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private flags:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Boolean;>;"
        }
    .end annotation
.end field

.field private serviceID:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getFlags()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Boolean;>;"
        }
    .end annotation

    .line 23
    iget-object v0, p0, Lcom/huawei/datatype/CommandResponse;->flags:Ljava/util/Map;

    return-object v0
.end method

.method public getServiceID()I
    .locals 1

    .line 15
    iget v0, p0, Lcom/huawei/datatype/CommandResponse;->serviceID:I

    return v0
.end method

.method public setFlags(Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Boolean;>;)V"
        }
    .end annotation

    .line 27
    iput-object p1, p0, Lcom/huawei/datatype/CommandResponse;->flags:Ljava/util/Map;

    .line 28
    return-void
.end method

.method public setServiceID(I)V
    .locals 0

    .line 19
    iput p1, p0, Lcom/huawei/datatype/CommandResponse;->serviceID:I

    .line 20
    return-void
.end method
