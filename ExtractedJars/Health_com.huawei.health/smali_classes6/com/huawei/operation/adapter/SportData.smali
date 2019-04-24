.class public Lcom/huawei/operation/adapter/SportData;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/operation/adapter/SportData$Data;
    }
.end annotation


# instance fields
.field private data:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/operation/adapter/SportData$Data;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public configData(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/operation/adapter/SportData$Data;>;)V"
        }
    .end annotation

    .line 21
    iput-object p1, p0, Lcom/huawei/operation/adapter/SportData;->data:Ljava/util/List;

    .line 22
    return-void
.end method

.method public getData()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/operation/adapter/SportData$Data;>;"
        }
    .end annotation

    .line 17
    iget-object v0, p0, Lcom/huawei/operation/adapter/SportData;->data:Ljava/util/List;

    return-object v0
.end method
