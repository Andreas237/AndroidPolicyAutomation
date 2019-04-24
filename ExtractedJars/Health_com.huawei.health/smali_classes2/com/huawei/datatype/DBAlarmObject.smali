.class public Lcom/huawei/datatype/DBAlarmObject;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private iBaseResponseCallback:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field private object:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getObject()Ljava/lang/Object;
    .locals 1

    .line 22
    iget-object v0, p0, Lcom/huawei/datatype/DBAlarmObject;->object:Ljava/lang/Object;

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public getiBaseResponseCallback()Lcom/huawei/hwbasemgr/IBaseResponseCallback;
    .locals 1

    .line 14
    iget-object v0, p0, Lcom/huawei/datatype/DBAlarmObject;->iBaseResponseCallback:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    return-object v0
.end method

.method public setObject(Ljava/lang/Object;)V
    .locals 1

    .line 26
    invoke-static {p1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/datatype/DBAlarmObject;->object:Ljava/lang/Object;

    .line 27
    return-void
.end method

.method public setiBaseResponseCallback(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 1

    .line 18
    invoke-static {p1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    iput-object v0, p0, Lcom/huawei/datatype/DBAlarmObject;->iBaseResponseCallback:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 19
    return-void
.end method
