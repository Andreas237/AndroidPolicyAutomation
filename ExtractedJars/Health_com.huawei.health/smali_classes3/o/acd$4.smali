.class Lo/acd$4;
.super Lcom/huawei/hihealth/device/open/HealthDevice;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/acd;->a(Ljava/lang/String;)Lcom/huawei/hihealth/device/open/HealthDevice;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Ljava/lang/String;

.field final synthetic d:Lo/acd;

.field final synthetic e:Ljava/lang/String;


# direct methods
.method constructor <init>(Lo/acd;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 198
    iput-object p1, p0, Lo/acd$4;->d:Lo/acd;

    iput-object p2, p0, Lo/acd$4;->e:Ljava/lang/String;

    iput-object p3, p0, Lo/acd$4;->b:Ljava/lang/String;

    invoke-direct {p0}, Lcom/huawei/hihealth/device/open/HealthDevice;-><init>()V

    return-void
.end method


# virtual methods
.method public doCreatePair(Lcom/huawei/hihealth/device/open/IDeviceEventHandler;)Z
    .locals 1

    .line 216
    const/4 v0, 0x0

    return v0
.end method

.method public doRemovePair()Z
    .locals 1

    .line 221
    const/4 v0, 0x0

    return v0
.end method

.method public getAddress()Ljava/lang/String;
    .locals 1

    .line 206
    iget-object v0, p0, Lo/acd$4;->b:Ljava/lang/String;

    return-object v0
.end method

.method public getDeviceName()Ljava/lang/String;
    .locals 1

    .line 201
    iget-object v0, p0, Lo/acd$4;->e:Ljava/lang/String;

    return-object v0
.end method

.method public getUniqueId()Ljava/lang/String;
    .locals 1

    .line 211
    iget-object v0, p0, Lo/acd$4;->b:Ljava/lang/String;

    return-object v0
.end method
