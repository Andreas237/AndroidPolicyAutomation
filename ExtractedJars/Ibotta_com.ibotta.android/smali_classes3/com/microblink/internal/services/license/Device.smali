.class public final Lcom/microblink/internal/services/license/Device;
.super Ljava/lang/Object;


# instance fields
.field private final deviceInfo:Lcom/microblink/internal/services/license/DeviceInfo;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "device_info"
    .end annotation
.end field

.field private final idfv:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "idfv"
    .end annotation
.end field

.field private final location:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "location"
    .end annotation
.end field

.field private final os:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "operating_system"
    .end annotation
.end field

.field private final sdkVersion:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "sdk_version"
    .end annotation
.end field

.field private final type:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "type"
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/microblink/internal/services/license/DeviceInfo;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/microblink/internal/services/license/Device;->type:Ljava/lang/String;

    iput-object p2, p0, Lcom/microblink/internal/services/license/Device;->location:Ljava/lang/String;

    iput-object p3, p0, Lcom/microblink/internal/services/license/Device;->idfv:Ljava/lang/String;

    iput-object p4, p0, Lcom/microblink/internal/services/license/Device;->os:Ljava/lang/String;

    iput-object p5, p0, Lcom/microblink/internal/services/license/Device;->sdkVersion:Ljava/lang/String;

    iput-object p6, p0, Lcom/microblink/internal/services/license/Device;->deviceInfo:Lcom/microblink/internal/services/license/DeviceInfo;

    return-void
.end method

.method public static create(Landroid/content/Context;)Lcom/microblink/internal/services/license/Device;
    .locals 8
    .param p0    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    new-instance v7, Lcom/microblink/internal/services/license/Device;

    sget-object v1, Landroid/os/Build;->MODEL:Ljava/lang/String;

    invoke-static {}, Lcom/microblink/ReceiptSdk;->uniqueId()Ljava/lang/String;

    move-result-object v3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "Android "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v2, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {}, Lcom/microblink/ReceiptSdk;->versionName()Ljava/lang/String;

    move-result-object v5

    invoke-static {p0}, Lcom/microblink/internal/DeviceHelper;->deviceInfo(Landroid/content/Context;)Lcom/microblink/internal/services/license/DeviceInfo;

    move-result-object v6

    const/4 v2, 0x0

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Lcom/microblink/internal/services/license/Device;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/microblink/internal/services/license/DeviceInfo;)V

    return-object v7
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_d

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto/16 :goto_5

    :cond_1
    check-cast p1, Lcom/microblink/internal/services/license/Device;

    iget-object v2, p0, Lcom/microblink/internal/services/license/Device;->type:Ljava/lang/String;

    if-eqz v2, :cond_2

    iget-object v3, p1, Lcom/microblink/internal/services/license/Device;->type:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    goto :goto_0

    :cond_2
    iget-object v2, p1, Lcom/microblink/internal/services/license/Device;->type:Ljava/lang/String;

    if-eqz v2, :cond_3

    :goto_0
    return v1

    :cond_3
    iget-object v2, p0, Lcom/microblink/internal/services/license/Device;->location:Ljava/lang/String;

    if-eqz v2, :cond_4

    iget-object v3, p1, Lcom/microblink/internal/services/license/Device;->location:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5

    goto :goto_1

    :cond_4
    iget-object v2, p1, Lcom/microblink/internal/services/license/Device;->location:Ljava/lang/String;

    if-eqz v2, :cond_5

    :goto_1
    return v1

    :cond_5
    iget-object v2, p0, Lcom/microblink/internal/services/license/Device;->idfv:Ljava/lang/String;

    if-eqz v2, :cond_6

    iget-object v3, p1, Lcom/microblink/internal/services/license/Device;->idfv:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_7

    goto :goto_2

    :cond_6
    iget-object v2, p1, Lcom/microblink/internal/services/license/Device;->idfv:Ljava/lang/String;

    if-eqz v2, :cond_7

    :goto_2
    return v1

    :cond_7
    iget-object v2, p0, Lcom/microblink/internal/services/license/Device;->os:Ljava/lang/String;

    if-eqz v2, :cond_8

    iget-object v3, p1, Lcom/microblink/internal/services/license/Device;->os:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_9

    goto :goto_3

    :cond_8
    iget-object v2, p1, Lcom/microblink/internal/services/license/Device;->os:Ljava/lang/String;

    if-eqz v2, :cond_9

    :goto_3
    return v1

    :cond_9
    iget-object v2, p0, Lcom/microblink/internal/services/license/Device;->sdkVersion:Ljava/lang/String;

    if-eqz v2, :cond_a

    iget-object v3, p1, Lcom/microblink/internal/services/license/Device;->sdkVersion:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_b

    goto :goto_4

    :cond_a
    iget-object v2, p1, Lcom/microblink/internal/services/license/Device;->sdkVersion:Ljava/lang/String;

    if-eqz v2, :cond_b

    :goto_4
    return v1

    :cond_b
    iget-object v2, p0, Lcom/microblink/internal/services/license/Device;->deviceInfo:Lcom/microblink/internal/services/license/DeviceInfo;

    if-eqz v2, :cond_c

    iget-object p1, p1, Lcom/microblink/internal/services/license/Device;->deviceInfo:Lcom/microblink/internal/services/license/DeviceInfo;

    invoke-virtual {v2, p1}, Lcom/microblink/internal/services/license/DeviceInfo;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_c
    iget-object p1, p1, Lcom/microblink/internal/services/license/Device;->deviceInfo:Lcom/microblink/internal/services/license/DeviceInfo;

    if-nez p1, :cond_d

    return v0

    :cond_d
    :goto_5
    return v1
.end method

.method public final hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/microblink/internal/services/license/Device;->type:Ljava/lang/String;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/microblink/internal/services/license/Device;->location:Ljava/lang/String;

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/microblink/internal/services/license/Device;->idfv:Ljava/lang/String;

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    goto :goto_2

    :cond_2
    const/4 v2, 0x0

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/microblink/internal/services/license/Device;->os:Ljava/lang/String;

    if-eqz v2, :cond_3

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    goto :goto_3

    :cond_3
    const/4 v2, 0x0

    :goto_3
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/microblink/internal/services/license/Device;->sdkVersion:Ljava/lang/String;

    if-eqz v2, :cond_4

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    goto :goto_4

    :cond_4
    const/4 v2, 0x0

    :goto_4
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/microblink/internal/services/license/Device;->deviceInfo:Lcom/microblink/internal/services/license/DeviceInfo;

    if-eqz v2, :cond_5

    invoke-virtual {v2}, Lcom/microblink/internal/services/license/DeviceInfo;->hashCode()I

    move-result v1

    :cond_5
    add-int/2addr v0, v1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Device{type=\'"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/microblink/internal/services/license/Device;->type:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", location=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/microblink/internal/services/license/Device;->location:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", idfv=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/microblink/internal/services/license/Device;->idfv:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", os=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/microblink/internal/services/license/Device;->os:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", sdkVersion=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/microblink/internal/services/license/Device;->sdkVersion:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v1, ", deviceInfo="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/microblink/internal/services/license/Device;->deviceInfo:Lcom/microblink/internal/services/license/DeviceInfo;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
