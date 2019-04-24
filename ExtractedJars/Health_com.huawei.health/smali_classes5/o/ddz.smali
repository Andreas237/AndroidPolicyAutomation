.class public Lo/ddz;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/lang/String;)Ljava/lang/String;
    .locals 7

    .line 172
    invoke-static {p0}, Lo/ddz;->n(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 173
    const-string v0, "02"

    const-string v1, "DeviceStatusPackageMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "getBTVersion mac is invalid"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 174
    const-string v0, ""

    return-object v0

    .line 176
    :cond_0
    sget-object v5, Lo/dea;->d:Ljava/util/concurrent/ConcurrentHashMap;

    .line 177
    invoke-virtual {v5, p0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/ddm;

    .line 178
    const/4 v0, 0x0

    if-ne v0, v6, :cond_1

    .line 179
    const-string v0, "02"

    const-string v1, "DeviceStatusPackageMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "getBTVersion device not added."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 180
    const-string v0, ""

    return-object v0

    .line 182
    :cond_1
    const-string v0, "02"

    const-string v1, "DeviceStatusPackageMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "getBTVersion device added.value.getBTVersion()"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 183
    invoke-virtual {v6}, Lo/ddm;->b()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static a(Ljava/lang/String;Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;)V
    .locals 8

    .line 328
    invoke-static {p0}, Lo/ddz;->n(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 329
    const-string v0, "02"

    const-string v1, "DeviceStatusPackageMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "updateDeviceCapability mac is invalid"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 330
    return-void

    .line 332
    :cond_0
    sget-object v5, Lo/dea;->d:Ljava/util/concurrent/ConcurrentHashMap;

    .line 333
    invoke-virtual {v5, p0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/ddm;

    .line 334
    const/4 v0, 0x0

    if-ne v0, v6, :cond_1

    .line 335
    const-string v0, "02"

    const-string v1, "DeviceStatusPackageMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "updateDeviceCapability device not added."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 336
    new-instance v7, Lo/ddm;

    invoke-direct {v7}, Lo/ddm;-><init>()V

    .line 337
    invoke-virtual {v7, p1}, Lo/ddm;->e(Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;)V

    .line 338
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->resetDeviceCapability()V

    .line 339
    invoke-virtual {v5, p0, v7}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 346
    :cond_1
    return-void
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 8

    .line 39
    invoke-static {p0}, Lo/ddz;->n(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 40
    const-string v0, "02"

    const-string v1, "DeviceStatusPackageMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "updateDeviceIdentify mac is invalid"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 41
    return-void

    .line 43
    :cond_0
    sget-object v5, Lo/dea;->d:Ljava/util/concurrent/ConcurrentHashMap;

    .line 44
    invoke-virtual {v5, p0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/ddm;

    .line 45
    const/4 v0, 0x0

    if-ne v0, v6, :cond_1

    .line 46
    const-string v0, "02"

    const-string v1, "DeviceStatusPackageMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "updateDeviceIdentify device not added."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 47
    new-instance v7, Lo/ddm;

    invoke-direct {v7}, Lo/ddm;-><init>()V

    .line 48
    invoke-virtual {v7, p1}, Lo/ddm;->e(Ljava/lang/String;)V

    .line 49
    invoke-virtual {v5, p0, v7}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    goto :goto_0

    .line 51
    :cond_1
    const-string v0, "02"

    const-string v1, "DeviceStatusPackageMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "updateDeviceIdentify device added."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 52
    invoke-virtual {v6, p1}, Lo/ddm;->e(Ljava/lang/String;)V

    .line 53
    invoke-virtual {v5, p0, v6}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    :goto_0
    return-void
.end method

.method public static b(Ljava/lang/String;)I
    .locals 7

    .line 207
    invoke-static {p0}, Lo/ddz;->n(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 208
    const-string v0, "02"

    const-string v1, "DeviceStatusPackageMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "getProductType mac is invalid"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 209
    const/4 v0, -0x1

    return v0

    .line 211
    :cond_0
    sget-object v5, Lo/dea;->d:Ljava/util/concurrent/ConcurrentHashMap;

    .line 212
    invoke-virtual {v5, p0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/ddm;

    .line 213
    const/4 v0, 0x0

    if-ne v0, v6, :cond_1

    .line 214
    const-string v0, "02"

    const-string v1, "DeviceStatusPackageMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "getProductType device not added."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 215
    const/4 v0, -0x1

    return v0

    .line 217
    :cond_1
    const-string v0, "02"

    const-string v1, "DeviceStatusPackageMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "getProductType device added."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 218
    invoke-virtual {v6}, Lo/ddm;->g()I

    move-result v0

    return v0
.end method

.method public static b(Ljava/lang/String;I)V
    .locals 8

    .line 188
    invoke-static {p0}, Lo/ddz;->n(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 189
    const-string v0, "02"

    const-string v1, "DeviceStatusPackageMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "updateProductType mac is invalid"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 190
    return-void

    .line 192
    :cond_0
    sget-object v5, Lo/dea;->d:Ljava/util/concurrent/ConcurrentHashMap;

    .line 193
    invoke-virtual {v5, p0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/ddm;

    .line 194
    const/4 v0, 0x0

    if-ne v0, v6, :cond_1

    .line 195
    const-string v0, "02"

    const-string v1, "DeviceStatusPackageMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "updateProductType device not added."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 196
    new-instance v7, Lo/ddm;

    invoke-direct {v7}, Lo/ddm;-><init>()V

    .line 197
    invoke-virtual {v7, p1}, Lo/ddm;->b(I)V

    .line 198
    invoke-virtual {v5, p0, v7}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 199
    goto :goto_0

    .line 200
    :cond_1
    const-string v0, "02"

    const-string v1, "DeviceStatusPackageMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "updateProductType device added."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 201
    invoke-virtual {v6, p1}, Lo/ddm;->b(I)V

    .line 202
    invoke-virtual {v5, p0, v6}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 204
    :goto_0
    return-void
.end method

.method public static b(Ljava/lang/String;Ljava/lang/String;)V
    .locals 8

    .line 74
    invoke-static {p0}, Lo/ddz;->n(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 75
    const-string v0, "02"

    const-string v1, "DeviceStatusPackageMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "updateDeviceModel mac is invalid"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 76
    return-void

    .line 78
    :cond_0
    sget-object v5, Lo/dea;->d:Ljava/util/concurrent/ConcurrentHashMap;

    .line 79
    invoke-virtual {v5, p0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/ddm;

    .line 80
    const/4 v0, 0x0

    if-ne v0, v6, :cond_1

    .line 81
    const-string v0, "02"

    const-string v1, "DeviceStatusPackageMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "updateDeviceModel device not added."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 82
    new-instance v7, Lo/ddm;

    invoke-direct {v7}, Lo/ddm;-><init>()V

    .line 83
    invoke-virtual {v7, p1}, Lo/ddm;->b(Ljava/lang/String;)V

    .line 84
    invoke-virtual {v5, p0, v7}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    goto :goto_0

    .line 86
    :cond_1
    const-string v0, "02"

    const-string v1, "DeviceStatusPackageMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "updateDeviceModel device added."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 87
    invoke-virtual {v6, p1}, Lo/ddm;->b(Ljava/lang/String;)V

    .line 88
    invoke-virtual {v5, p0, v6}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    :goto_0
    return-void
.end method

.method public static c(Ljava/lang/String;)Ljava/lang/String;
    .locals 7

    .line 133
    invoke-static {p0}, Lo/ddz;->n(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 134
    const-string v0, "02"

    const-string v1, "DeviceStatusPackageMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "getDeviceName mac is invalid"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 135
    const-string v0, ""

    return-object v0

    .line 137
    :cond_0
    sget-object v5, Lo/dea;->d:Ljava/util/concurrent/ConcurrentHashMap;

    .line 138
    invoke-virtual {v5, p0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/ddm;

    .line 139
    const/4 v0, 0x0

    if-ne v0, v6, :cond_1

    .line 140
    const-string v0, "02"

    const-string v1, "DeviceStatusPackageMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "getDeviceName device not added."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 141
    const-string v0, ""

    return-object v0

    .line 143
    :cond_1
    const-string v0, "02"

    const-string v1, "DeviceStatusPackageMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "getDeviceName device added.value.getDeviceName()"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 144
    invoke-virtual {v6}, Lo/ddm;->a()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static c(Ljava/lang/String;Ljava/lang/String;)V
    .locals 8

    .line 93
    invoke-static {p0}, Lo/ddz;->n(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 94
    const-string v0, "02"

    const-string v1, "DeviceStatusPackageMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "updateBTVersion mac is invalid"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 95
    return-void

    .line 97
    :cond_0
    sget-object v5, Lo/dea;->d:Ljava/util/concurrent/ConcurrentHashMap;

    .line 98
    invoke-virtual {v5, p0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/ddm;

    .line 99
    const/4 v0, 0x0

    if-ne v0, v6, :cond_1

    .line 100
    const-string v0, "02"

    const-string v1, "DeviceStatusPackageMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "updateBTVersion device not added."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 101
    new-instance v7, Lo/ddm;

    invoke-direct {v7}, Lo/ddm;-><init>()V

    .line 102
    invoke-virtual {v7, p1}, Lo/ddm;->a(Ljava/lang/String;)V

    .line 103
    invoke-virtual {v5, p0, v7}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 104
    goto :goto_0

    .line 105
    :cond_1
    const-string v0, "02"

    const-string v1, "DeviceStatusPackageMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "updateBTVersion device added."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 106
    invoke-virtual {v6, p1}, Lo/ddm;->a(Ljava/lang/String;)V

    .line 107
    invoke-virtual {v5, p0, v6}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 109
    :goto_0
    return-void
.end method

.method public static c(Ljava/lang/String;Z)V
    .locals 8

    .line 293
    invoke-static {p0}, Lo/ddz;->n(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 294
    const-string v0, "02"

    const-string v1, "DeviceStatusPackageMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "updateOTAStatus mac is invalid"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 295
    return-void

    .line 297
    :cond_0
    sget-object v5, Lo/dea;->d:Ljava/util/concurrent/ConcurrentHashMap;

    .line 298
    invoke-virtual {v5, p0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/ddm;

    .line 299
    const/4 v0, 0x0

    if-ne v0, v6, :cond_1

    .line 300
    const-string v0, "02"

    const-string v1, "DeviceStatusPackageMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "updateHandshakeStatus device not added."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 301
    new-instance v7, Lo/ddm;

    invoke-direct {v7}, Lo/ddm;-><init>()V

    .line 302
    invoke-virtual {v7, p1}, Lo/ddm;->d(Z)V

    .line 303
    invoke-virtual {v5, p0, v7}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 304
    goto :goto_0

    .line 305
    :cond_1
    const-string v0, "02"

    const-string v1, "DeviceStatusPackageMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "updateHandshakeStatus device added."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 306
    invoke-virtual {v6, p1}, Lo/ddm;->d(Z)V

    .line 307
    invoke-virtual {v5, p0, v6}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 309
    :goto_0
    return-void
.end method

.method public static d(Ljava/lang/String;)I
    .locals 7

    .line 242
    invoke-static {p0}, Lo/ddz;->n(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 243
    const-string v0, "02"

    const-string v1, "DeviceStatusPackageMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "getDeviceConnectState mac is invalid"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 244
    const/4 v0, 0x3

    return v0

    .line 246
    :cond_0
    sget-object v5, Lo/dea;->d:Ljava/util/concurrent/ConcurrentHashMap;

    .line 247
    invoke-virtual {v5, p0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/ddm;

    .line 248
    const/4 v0, 0x0

    if-ne v0, v6, :cond_1

    .line 249
    const-string v0, "02"

    const-string v1, "DeviceStatusPackageMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "getDeviceConnectState device not added."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 250
    const/4 v0, 0x3

    return v0

    .line 252
    :cond_1
    const-string v0, "02"

    const-string v1, "DeviceStatusPackageMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "getDeviceConnectState device added."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 253
    invoke-virtual {v6}, Lo/ddm;->k()I

    move-result v0

    return v0
.end method

.method public static d(Ljava/lang/String;I)V
    .locals 8

    .line 223
    invoke-static {p0}, Lo/ddz;->n(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 224
    const-string v0, "02"

    const-string v1, "DeviceStatusPackageMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "updateDeviceConnectState mac is invalid"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 225
    return-void

    .line 227
    :cond_0
    sget-object v5, Lo/dea;->d:Ljava/util/concurrent/ConcurrentHashMap;

    .line 228
    invoke-virtual {v5, p0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/ddm;

    .line 229
    const/4 v0, 0x0

    if-ne v0, v6, :cond_1

    .line 230
    const-string v0, "02"

    const-string v1, "DeviceStatusPackageMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "updateDeviceConnectState device not added."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 231
    new-instance v7, Lo/ddm;

    invoke-direct {v7}, Lo/ddm;-><init>()V

    .line 232
    invoke-virtual {v7, p1}, Lo/ddm;->e(I)V

    .line 233
    invoke-virtual {v5, p0, v7}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 234
    goto :goto_0

    .line 235
    :cond_1
    const-string v0, "02"

    const-string v1, "DeviceStatusPackageMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "updateDeviceConnectState device added."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 236
    invoke-virtual {v6, p1}, Lo/ddm;->e(I)V

    .line 237
    invoke-virtual {v5, p0, v6}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 239
    :goto_0
    return-void
.end method

.method public static d(Ljava/lang/String;Ljava/lang/String;)V
    .locals 8

    .line 148
    invoke-static {p0}, Lo/ddz;->n(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 149
    const-string v0, "02"

    const-string v1, "DeviceStatusPackageMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "updateDeviceName mac is invalid"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 150
    return-void

    .line 152
    :cond_0
    sget-object v5, Lo/dea;->d:Ljava/util/concurrent/ConcurrentHashMap;

    .line 153
    invoke-virtual {v5, p0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/ddm;

    .line 154
    const/4 v0, 0x0

    if-ne v0, v6, :cond_1

    .line 155
    const-string v0, "02"

    const-string v1, "DeviceStatusPackageMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "updateDeviceName device not added."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 156
    new-instance v7, Lo/ddm;

    invoke-direct {v7}, Lo/ddm;-><init>()V

    .line 157
    invoke-virtual {v7, p1}, Lo/ddm;->d(Ljava/lang/String;)V

    .line 158
    invoke-virtual {v5, p0, v7}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 159
    goto :goto_0

    .line 160
    :cond_1
    const-string v0, "02"

    const-string v1, "DeviceStatusPackageMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "updateDeviceName device added."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 161
    invoke-virtual {v6, p1}, Lo/ddm;->d(Ljava/lang/String;)V

    .line 162
    invoke-virtual {v5, p0, v6}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 164
    :goto_0
    return-void
.end method

.method public static d(Ljava/lang/String;Z)V
    .locals 8

    .line 258
    invoke-static {p0}, Lo/ddz;->n(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 259
    const-string v0, "02"

    const-string v1, "DeviceStatusPackageMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "updateHandshakeStatus mac is invalid"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 260
    return-void

    .line 262
    :cond_0
    sget-object v5, Lo/dea;->d:Ljava/util/concurrent/ConcurrentHashMap;

    .line 263
    invoke-virtual {v5, p0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/ddm;

    .line 264
    const/4 v0, 0x0

    if-ne v0, v6, :cond_1

    .line 265
    const-string v0, "02"

    const-string v1, "DeviceStatusPackageMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "updateHandshakeStatus device not added."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 266
    new-instance v7, Lo/ddm;

    invoke-direct {v7}, Lo/ddm;-><init>()V

    .line 267
    invoke-virtual {v7, p1}, Lo/ddm;->c(Z)V

    .line 268
    invoke-virtual {v5, p0, v7}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 269
    goto :goto_0

    .line 270
    :cond_1
    const-string v0, "02"

    const-string v1, "DeviceStatusPackageMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "updateHandshakeStatus device added."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 271
    invoke-virtual {v6, p1}, Lo/ddm;->c(Z)V

    .line 272
    invoke-virtual {v5, p0, v6}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 274
    :goto_0
    return-void
.end method

.method public static e(Ljava/lang/String;)Ljava/lang/String;
    .locals 7

    .line 112
    invoke-static {p0}, Lo/ddz;->n(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 113
    const-string v0, "02"

    const-string v1, "DeviceStatusPackageMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "getDeviceModel mac is invalid"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 114
    const-string v0, ""

    return-object v0

    .line 116
    :cond_0
    sget-object v5, Lo/dea;->d:Ljava/util/concurrent/ConcurrentHashMap;

    .line 117
    invoke-virtual {v5, p0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/ddm;

    .line 118
    const/4 v0, 0x0

    if-ne v0, v6, :cond_1

    .line 119
    const-string v0, "02"

    const-string v1, "DeviceStatusPackageMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "getDeviceModel device not added."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 120
    const-string v0, ""

    return-object v0

    .line 122
    :cond_1
    const-string v0, "02"

    const-string v1, "DeviceStatusPackageMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "getDeviceModel device added."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 123
    invoke-virtual {v6}, Lo/ddm;->c()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static e()Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation

    .line 471
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 472
    sget-object v3, Lo/dea;->d:Ljava/util/concurrent/ConcurrentHashMap;

    .line 473
    invoke-virtual {v3}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/ddm;

    .line 474
    invoke-virtual {v5}, Lo/ddm;->k()I

    move-result v0

    const/4 v1, 0x2

    if-ne v1, v0, :cond_0

    .line 475
    invoke-virtual {v5}, Lo/ddm;->e()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 477
    :cond_0
    goto :goto_0

    .line 479
    :cond_1
    return-object v2
.end method

.method public static e(Ljava/lang/String;Ljava/lang/String;)V
    .locals 8

    .line 365
    invoke-static {p0}, Lo/ddz;->n(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 366
    const-string v0, "02"

    const-string v1, "DeviceStatusPackageMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "updateDeviceVersion mac is invalid"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 367
    return-void

    .line 369
    :cond_0
    sget-object v5, Lo/dea;->d:Ljava/util/concurrent/ConcurrentHashMap;

    .line 370
    invoke-virtual {v5, p0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/ddm;

    .line 371
    const/4 v0, 0x0

    if-ne v0, v6, :cond_1

    .line 372
    const-string v0, "02"

    const-string v1, "DeviceStatusPackageMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "updateDeviceVersion device not added."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 373
    new-instance v7, Lo/ddm;

    invoke-direct {v7}, Lo/ddm;-><init>()V

    .line 374
    invoke-virtual {v7, p1}, Lo/ddm;->g(Ljava/lang/String;)V

    .line 375
    invoke-virtual {v5, p0, v7}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 376
    goto :goto_0

    .line 377
    :cond_1
    const-string v0, "02"

    const-string v1, "DeviceStatusPackageMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "updateDeviceVersion device added."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 378
    invoke-virtual {v6, p1}, Lo/ddm;->g(Ljava/lang/String;)V

    .line 379
    invoke-virtual {v5, p0, v6}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 381
    :goto_0
    return-void
.end method

.method public static f(Ljava/lang/String;)Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;
    .locals 7

    .line 349
    invoke-static {p0}, Lo/ddz;->n(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 350
    const-string v0, "02"

    const-string v1, "DeviceStatusPackageMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "getDeviceCapability mac is invalid"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 351
    new-instance v0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    invoke-direct {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;-><init>()V

    return-object v0

    .line 353
    :cond_0
    sget-object v5, Lo/dea;->d:Ljava/util/concurrent/ConcurrentHashMap;

    .line 354
    invoke-virtual {v5, p0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/ddm;

    .line 355
    const/4 v0, 0x0

    if-ne v0, v6, :cond_1

    .line 356
    const-string v0, "02"

    const-string v1, "DeviceStatusPackageMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "getDeviceCapability device not added."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 357
    new-instance v0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    invoke-direct {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;-><init>()V

    return-object v0

    .line 359
    :cond_1
    const-string v0, "02"

    const-string v1, "DeviceStatusPackageMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "getDeviceCapability device added."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 360
    invoke-virtual {v6}, Lo/ddm;->i()Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    move-result-object v0

    return-object v0
.end method

.method public static g(Ljava/lang/String;)Z
    .locals 7

    .line 277
    invoke-static {p0}, Lo/ddz;->n(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 278
    const-string v0, "02"

    const-string v1, "DeviceStatusPackageMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "getHandShakeStatus mac is invalid"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 279
    const/4 v0, 0x0

    return v0

    .line 281
    :cond_0
    sget-object v5, Lo/dea;->d:Ljava/util/concurrent/ConcurrentHashMap;

    .line 282
    invoke-virtual {v5, p0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/ddm;

    .line 283
    const/4 v0, 0x0

    if-ne v0, v6, :cond_1

    .line 284
    const-string v0, "02"

    const-string v1, "DeviceStatusPackageMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "getHandShakeStatus device not added."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 285
    const/4 v0, 0x0

    return v0

    .line 287
    :cond_1
    const-string v0, "02"

    const-string v1, "DeviceStatusPackageMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "getHandShakeStatus device added."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 288
    invoke-virtual {v6}, Lo/ddm;->f()Z

    move-result v0

    return v0
.end method

.method public static h(Ljava/lang/String;)Ljava/lang/String;
    .locals 7

    .line 419
    invoke-static {p0}, Lo/ddz;->n(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 420
    const-string v0, "02"

    const-string v1, "DeviceStatusPackageMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "getUUid mac is invalid"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 421
    const-string v0, ""

    return-object v0

    .line 423
    :cond_0
    sget-object v5, Lo/dea;->d:Ljava/util/concurrent/ConcurrentHashMap;

    .line 424
    invoke-virtual {v5, p0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/ddm;

    .line 425
    const/4 v0, 0x0

    if-ne v0, v6, :cond_1

    .line 426
    const-string v0, "02"

    const-string v1, "DeviceStatusPackageMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "getUUid device not added."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 427
    const-string v0, ""

    return-object v0

    .line 429
    :cond_1
    const-string v0, "02"

    const-string v1, "DeviceStatusPackageMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "getUUid device added."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 430
    invoke-virtual {v6}, Lo/ddm;->d()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static h(Ljava/lang/String;Ljava/lang/String;)V
    .locals 8

    .line 435
    invoke-static {p0}, Lo/ddz;->n(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 436
    const-string v0, "02"

    const-string v1, "DeviceStatusPackageMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "updateDeviceSoftVersion mac is invalid"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 437
    return-void

    .line 439
    :cond_0
    sget-object v5, Lo/dea;->d:Ljava/util/concurrent/ConcurrentHashMap;

    .line 440
    invoke-virtual {v5, p0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/ddm;

    .line 441
    const/4 v0, 0x0

    if-ne v0, v6, :cond_1

    .line 442
    const-string v0, "02"

    const-string v1, "DeviceStatusPackageMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "updateDeviceSoftVersion device not added."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 443
    new-instance v7, Lo/ddm;

    invoke-direct {v7}, Lo/ddm;-><init>()V

    .line 444
    invoke-virtual {v7, p1}, Lo/ddm;->k(Ljava/lang/String;)V

    .line 445
    invoke-virtual {v5, p0, v7}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 446
    goto :goto_0

    .line 447
    :cond_1
    const-string v0, "02"

    const-string v1, "DeviceStatusPackageMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "updateDeviceSoftVersion device added."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 448
    invoke-virtual {v6, p1}, Lo/ddm;->k(Ljava/lang/String;)V

    .line 449
    invoke-virtual {v5, p0, v6}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 451
    :goto_0
    return-void
.end method

.method public static i(Ljava/lang/String;Ljava/lang/String;)V
    .locals 8

    .line 400
    invoke-static {p0}, Lo/ddz;->n(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 401
    const-string v0, "02"

    const-string v1, "DeviceStatusPackageMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "updateUUid mac is invalid"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 402
    return-void

    .line 404
    :cond_0
    sget-object v5, Lo/dea;->d:Ljava/util/concurrent/ConcurrentHashMap;

    .line 405
    invoke-virtual {v5, p0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/ddm;

    .line 406
    const/4 v0, 0x0

    if-ne v0, v6, :cond_1

    .line 407
    const-string v0, "02"

    const-string v1, "DeviceStatusPackageMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "updateUUid device not added."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 408
    new-instance v7, Lo/ddm;

    invoke-direct {v7}, Lo/ddm;-><init>()V

    .line 409
    invoke-virtual {v7, p1}, Lo/ddm;->c(Ljava/lang/String;)V

    .line 410
    invoke-virtual {v5, p0, v7}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 411
    goto :goto_0

    .line 412
    :cond_1
    const-string v0, "02"

    const-string v1, "DeviceStatusPackageMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "updateUUid device added."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 413
    invoke-virtual {v6, p1}, Lo/ddm;->c(Ljava/lang/String;)V

    .line 414
    invoke-virtual {v5, p0, v6}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 416
    :goto_0
    return-void
.end method

.method public static i(Ljava/lang/String;)Z
    .locals 7

    .line 312
    invoke-static {p0}, Lo/ddz;->n(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 313
    const-string v0, "02"

    const-string v1, "DeviceStatusPackageMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "getOTAStatus mac is invalid"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 314
    const/4 v0, 0x0

    return v0

    .line 316
    :cond_0
    sget-object v5, Lo/dea;->d:Ljava/util/concurrent/ConcurrentHashMap;

    .line 317
    invoke-virtual {v5, p0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/ddm;

    .line 318
    const/4 v0, 0x0

    if-ne v0, v6, :cond_1

    .line 319
    const-string v0, "02"

    const-string v1, "DeviceStatusPackageMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "getOTAStatus device not added."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 320
    const/4 v0, 0x0

    return v0

    .line 322
    :cond_1
    const-string v0, "02"

    const-string v1, "DeviceStatusPackageMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "getOTAStatus device added."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 323
    invoke-virtual {v6}, Lo/ddm;->h()Z

    move-result v0

    return v0
.end method

.method public static k(Ljava/lang/String;)Ljava/lang/String;
    .locals 7

    .line 384
    invoke-static {p0}, Lo/ddz;->n(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 385
    const-string v0, "02"

    const-string v1, "DeviceStatusPackageMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "getDeviceVersion mac is invalid"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 386
    const-string v0, ""

    return-object v0

    .line 388
    :cond_0
    sget-object v5, Lo/dea;->d:Ljava/util/concurrent/ConcurrentHashMap;

    .line 389
    invoke-virtual {v5, p0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/ddm;

    .line 390
    const/4 v0, 0x0

    if-ne v0, v6, :cond_1

    .line 391
    const-string v0, "02"

    const-string v1, "DeviceStatusPackageMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "getDeviceCapability device not added."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 392
    const-string v0, ""

    return-object v0

    .line 394
    :cond_1
    const-string v0, "02"

    const-string v1, "DeviceStatusPackageMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "getDeviceCapability device added."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 395
    invoke-virtual {v6}, Lo/ddm;->n()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static n(Ljava/lang/String;)Z
    .locals 1

    .line 483
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 484
    const/4 v0, 0x0

    return v0

    .line 487
    :cond_0
    const/4 v0, 0x1

    return v0
.end method

.method public static o(Ljava/lang/String;)Ljava/lang/String;
    .locals 7

    .line 454
    invoke-static {p0}, Lo/ddz;->n(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 455
    const-string v0, "02"

    const-string v1, "DeviceStatusPackageMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "getDeviceSoftVersion mac is invalid"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 456
    const-string v0, ""

    return-object v0

    .line 458
    :cond_0
    sget-object v5, Lo/dea;->d:Ljava/util/concurrent/ConcurrentHashMap;

    .line 459
    invoke-virtual {v5, p0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/ddm;

    .line 460
    const/4 v0, 0x0

    if-ne v0, v6, :cond_1

    .line 461
    const-string v0, "02"

    const-string v1, "DeviceStatusPackageMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "getDeviceSoftVersion device not added."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 462
    const-string v0, ""

    return-object v0

    .line 464
    :cond_1
    const-string v0, "02"

    const-string v1, "DeviceStatusPackageMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "getDeviceSoftVersion device added."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 465
    invoke-virtual {v6}, Lo/ddm;->l()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
