.class public Lcom/huawei/ui/openservice/db/model/AuthTypeList;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private types:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/openservice/db/model/AuthTypeList;->types:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public getTypes()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation

    .line 16
    iget-object v0, p0, Lcom/huawei/ui/openservice/db/model/AuthTypeList;->types:Ljava/util/List;

    return-object v0
.end method

.method public setTypes(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/String;>;)V"
        }
    .end annotation

    .line 20
    iput-object p1, p0, Lcom/huawei/ui/openservice/db/model/AuthTypeList;->types:Ljava/util/List;

    .line 21
    return-void
.end method
