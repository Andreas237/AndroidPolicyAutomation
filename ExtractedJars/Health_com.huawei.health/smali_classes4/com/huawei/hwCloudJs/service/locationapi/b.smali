.class public Lcom/huawei/hwCloudJs/service/locationapi/b;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/baidu/location/BDLocationListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/hwCloudJs/service/locationapi/b$a;
    }
.end annotation


# static fields
.field private static final b:Ljava/lang/String; = "JsLocationListenner"


# instance fields
.field a:Lcom/huawei/hwCloudJs/service/locationapi/b$a;


# direct methods
.method public constructor <init>(Lcom/huawei/hwCloudJs/service/locationapi/b$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/huawei/hwCloudJs/service/locationapi/b;->a:Lcom/huawei/hwCloudJs/service/locationapi/b$a;

    return-void
.end method


# virtual methods
.method public onReceiveLocation(Lcom/baidu/location/BDLocation;)V
    .locals 2

    if-nez p1, :cond_0

    const-string v0, "JsLocationListenner"

    const-string v1, "location is null"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    const-string v0, "JsLocationListenner"

    const-string v1, "onReceiveLocation ok"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/huawei/hwCloudJs/service/locationapi/b;->a:Lcom/huawei/hwCloudJs/service/locationapi/b$a;

    invoke-interface {v0, p1}, Lcom/huawei/hwCloudJs/service/locationapi/b$a;->a(Lcom/baidu/location/BDLocation;)V

    return-void
.end method
