.class public final Lcom/huawei/hwCloudJs/service/jsapi/JsCoreApi$ToastReq;
.super Ljava/lang/Object;


# annotations
.annotation build Lcom/huawei/hwCloudJs/support/enables/NoProguard;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hwCloudJs/service/jsapi/JsCoreApi;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "ToastReq"
.end annotation


# instance fields
.field private duration:I

.field private title:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hwCloudJs/service/jsapi/JsCoreApi$ToastReq;->duration:I

    return-void
.end method


# virtual methods
.method public getDuration()I
    .locals 1

    iget v0, p0, Lcom/huawei/hwCloudJs/service/jsapi/JsCoreApi$ToastReq;->duration:I

    return v0
.end method

.method public getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/hwCloudJs/service/jsapi/JsCoreApi$ToastReq;->title:Ljava/lang/String;

    return-object v0
.end method

.method public setDuration(I)V
    .locals 0

    iput p1, p0, Lcom/huawei/hwCloudJs/service/jsapi/JsCoreApi$ToastReq;->duration:I

    return-void
.end method

.method public setTitle(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/hwCloudJs/service/jsapi/JsCoreApi$ToastReq;->title:Ljava/lang/String;

    return-void
.end method
