.class public final Lcom/huawei/hwCloudJs/service/hms/b$c;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/huawei/hms/api/HuaweiApiClient$ConnectionCallbacks;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hwCloudJs/service/hms/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# instance fields
.field private a:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/hms/api/HuaweiApiClient;>;"
        }
    .end annotation
.end field

.field private b:Lcom/huawei/hwCloudJs/core/JsCallback;

.field private c:Ljava/lang/String;

.field private d:Lorg/json/JSONObject;


# direct methods
.method public constructor <init>(Ljava/lang/ref/WeakReference;Lcom/huawei/hwCloudJs/core/JsCallback;Ljava/lang/String;Lorg/json/JSONObject;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/ref/WeakReference<Lcom/huawei/hms/api/HuaweiApiClient;>;Lcom/huawei/hwCloudJs/core/JsCallback;Ljava/lang/String;Lorg/json/JSONObject;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/huawei/hwCloudJs/service/hms/b$c;->a:Ljava/lang/ref/WeakReference;

    iput-object p2, p0, Lcom/huawei/hwCloudJs/service/hms/b$c;->b:Lcom/huawei/hwCloudJs/core/JsCallback;

    iput-object p3, p0, Lcom/huawei/hwCloudJs/service/hms/b$c;->c:Ljava/lang/String;

    iput-object p4, p0, Lcom/huawei/hwCloudJs/service/hms/b$c;->d:Lorg/json/JSONObject;

    return-void
.end method


# virtual methods
.method public onConnected()V
    .locals 4

    iget-object v0, p0, Lcom/huawei/hwCloudJs/service/hms/b$c;->a:Ljava/lang/ref/WeakReference;

    iget-object v1, p0, Lcom/huawei/hwCloudJs/service/hms/b$c;->c:Ljava/lang/String;

    iget-object v2, p0, Lcom/huawei/hwCloudJs/service/hms/b$c;->d:Lorg/json/JSONObject;

    iget-object v3, p0, Lcom/huawei/hwCloudJs/service/hms/b$c;->b:Lcom/huawei/hwCloudJs/core/JsCallback;

    invoke-static {v0, v1, v2, v3}, Lcom/huawei/hwCloudJs/service/hms/b;->a(Ljava/lang/ref/WeakReference;Ljava/lang/String;Lorg/json/JSONObject;Lcom/huawei/hwCloudJs/core/JsCallback;)V

    return-void
.end method

.method public onConnectionSuspended(I)V
    .locals 0

    return-void
.end method
