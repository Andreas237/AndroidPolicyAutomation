.class public Lcom/huawei/hihealthservice/old/model/Altitude;
.super Lcom/huawei/hihealthservice/old/model/HealthData;
.source "SourceFile"


# static fields
.field private static final serialVersionUID:J = -0x3d4c17f0b4d224ceL


# instance fields
.field private altitude:Ljava/lang/Double;

.field private pressure:Ljava/lang/Double;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 22
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/model/HealthData;-><init>()V

    return-void
.end method


# virtual methods
.method public getAltitude()Ljava/lang/Double;
    .locals 1

    .line 38
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/model/Altitude;->altitude:Ljava/lang/Double;

    return-object v0
.end method

.method public getPressure()Ljava/lang/Double;
    .locals 1

    .line 54
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/model/Altitude;->pressure:Ljava/lang/Double;

    return-object v0
.end method

.method public setAltitude(Ljava/lang/Double;)V
    .locals 0

    .line 46
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/model/Altitude;->altitude:Ljava/lang/Double;

    .line 47
    return-void
.end method

.method public setPressure(Ljava/lang/Double;)V
    .locals 0

    .line 62
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/model/Altitude;->pressure:Ljava/lang/Double;

    .line 63
    return-void
.end method
