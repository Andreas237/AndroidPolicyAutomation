.class public Lcom/huawei/datatype/DBObject;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private iResponseCallback:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field private object:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getObject()Ljava/lang/Object;
    .locals 1

    .line 21
    iget-object v0, p0, Lcom/huawei/datatype/DBObject;->object:Ljava/lang/Object;

    return-object v0
.end method

.method public getiBaseResponseCallback()Lcom/huawei/hwbasemgr/IBaseResponseCallback;
    .locals 1

    .line 13
    iget-object v0, p0, Lcom/huawei/datatype/DBObject;->iResponseCallback:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    return-object v0
.end method

.method public setObject(Ljava/lang/Object;)V
    .locals 0

    .line 25
    iput-object p1, p0, Lcom/huawei/datatype/DBObject;->object:Ljava/lang/Object;

    .line 26
    return-void
.end method

.method public setiBaseResponseCallback(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 0

    .line 17
    iput-object p1, p0, Lcom/huawei/datatype/DBObject;->iResponseCallback:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 18
    return-void
.end method
