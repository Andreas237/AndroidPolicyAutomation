.class public Lcom/huawei/datatype/CommandSend;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private commandIDs:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation
.end field

.field private serviceID:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getCommandIDs()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation

    .line 23
    iget-object v0, p0, Lcom/huawei/datatype/CommandSend;->commandIDs:Ljava/util/List;

    return-object v0
.end method

.method public getServiceID()I
    .locals 1

    .line 15
    iget v0, p0, Lcom/huawei/datatype/CommandSend;->serviceID:I

    return v0
.end method

.method public setCommandIDs(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/Integer;>;)V"
        }
    .end annotation

    .line 27
    iput-object p1, p0, Lcom/huawei/datatype/CommandSend;->commandIDs:Ljava/util/List;

    .line 28
    return-void
.end method

.method public setServiceID(I)V
    .locals 0

    .line 19
    iput p1, p0, Lcom/huawei/datatype/CommandSend;->serviceID:I

    .line 20
    return-void
.end method
