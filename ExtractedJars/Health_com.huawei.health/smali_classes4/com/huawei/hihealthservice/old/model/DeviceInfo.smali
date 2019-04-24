.class public Lcom/huawei/hihealthservice/old/model/DeviceInfo;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;
.implements Ljava/lang/Cloneable;


# static fields
.field public static final B0_PRODUCT_ID:I = 0x23

.field public static final B1_PRODUCT_ID:I = 0x15

.field public static final B2_PRODUCT_ID:I = 0x16

.field public static final COLORBAND_PRODUCT_ID:I = 0x17

.field public static final DNURSE_PRODUCT_ID:I = 0x1c

.field public static final JJMC_BLOOD_SUGER_PRODUCT_ID:I = 0x22

.field public static final KANGKANG_PRODUCT_ID:I = 0x18

.field public static final LEXIN_PRESSURE_PRODUCT_ID:I = 0x1d

.field public static final LEXIN_WEIGHT_PRODUCT_ID:I = 0x1f

.field public static final MANUAL_PRODUCT_ID:I = 0x1

.field public static final MINDRAY_ECG_PATCH:I = 0x25

.field public static final MIO_PRODUCT_ID:I = 0x1a

.field public static final MUMU_PRODUCT_ID:I = 0x19

.field public static final OMRON_BLOOD_PRESSURE_PRODUCT_ID:I = 0x21

.field public static final PHONE_COUNTER_PRODUCT_ID:I = 0x1e

.field public static final PHONE_GPS_PRODUCT_ID:I = 0x20

.field public static final PIOOC_PRODUCT_ID:I = 0x1b

.field public static final UNKNOWN_DEVICE_ID:I = 0x0

.field public static final UNKNOWN_DEVICE_NAME:Ljava/lang/String; = "UNKNOWN"

.field public static final W1_PRODUCT_ID:I = 0x24

.field private static final serialVersionUID:J = 0x6a49b354f543a292L


# instance fields
.field private cloudUserDeviceCode:J

.field private deviceId:Ljava/lang/String;

.field private huid:J

.field private localUserDeviceCode:I

.field private productId:I

.field private productName:Ljava/lang/String;

.field private productTypes:[I

.field private version:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getProductNameByProductId(I)Ljava/lang/String;
    .locals 1

    .line 290
    const-string v0, ""

    .line 291
    packed-switch p0, :pswitch_data_0

    goto/16 :goto_0

    .line 294
    :pswitch_0
    const-string v0, "B1\u624b\u73af"

    .line 295
    goto :goto_0

    .line 297
    :pswitch_1
    const-string v0, "B2\u624b\u73af"

    .line 298
    goto :goto_0

    .line 300
    :pswitch_2
    const-string v0, "color band"

    .line 301
    goto :goto_0

    .line 303
    :pswitch_3
    const-string v0, "\u7cd6\u62a4\u58eb\u8840\u7cd6\u4eea"

    .line 304
    goto :goto_0

    .line 306
    :pswitch_4
    const-string v0, "\u5eb7\u5eb7\u8840\u538b"

    .line 307
    goto :goto_0

    .line 309
    :pswitch_5
    const-string v0, "\u4e50\u5fc3\u8840\u538b"

    .line 310
    goto :goto_0

    .line 312
    :pswitch_6
    const-string v0, "\u4e50\u5fc3\u4f53\u91cd\u8ba1"

    .line 313
    goto :goto_0

    .line 315
    :pswitch_7
    const-string v0, "Mio"

    .line 316
    goto :goto_0

    .line 318
    :pswitch_8
    const-string v0, "\u6728\u6728\u8840\u538b"

    .line 319
    goto :goto_0

    .line 321
    :pswitch_9
    const-string v0, "\u6709\u54c1\u4f53\u91cd\u8ba1"

    .line 322
    goto :goto_0

    .line 324
    :pswitch_a
    const-string v0, "\u624b\u673a\u8bb0\u6b65"

    .line 325
    goto :goto_0

    .line 327
    :pswitch_b
    const-string v0, "\u624b\u52a8\u8f93\u5165"

    .line 328
    goto :goto_0

    .line 330
    :pswitch_c
    const-string v0, "\u6b27\u59c6\u9f99\u8840\u538b\u8ba1"

    .line 331
    goto :goto_0

    .line 333
    :pswitch_d
    const-string v0, "\u5f3a\u751f\u8840\u7cd6\u4eea"

    .line 334
    .line 338
    :goto_0
    :pswitch_e
    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_b
        :pswitch_e
        :pswitch_e
        :pswitch_e
        :pswitch_e
        :pswitch_e
        :pswitch_e
        :pswitch_e
        :pswitch_e
        :pswitch_e
        :pswitch_e
        :pswitch_e
        :pswitch_e
        :pswitch_e
        :pswitch_e
        :pswitch_e
        :pswitch_e
        :pswitch_e
        :pswitch_e
        :pswitch_e
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_4
        :pswitch_8
        :pswitch_7
        :pswitch_9
        :pswitch_3
        :pswitch_5
        :pswitch_a
        :pswitch_6
        :pswitch_e
        :pswitch_c
        :pswitch_d
    .end packed-switch
.end method


# virtual methods
.method public clone()Lcom/huawei/hihealthservice/old/model/DeviceInfo;
    .locals 2

    .line 261
    :try_start_0
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/model/DeviceInfo;
    :try_end_0
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    .line 263
    :catch_0
    move-exception v1

    .line 265
    const/4 v0, 0x0

    return-object v0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/CloneNotSupportedException;
        }
    .end annotation

    .line 25
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/model/DeviceInfo;->clone()Lcom/huawei/hihealthservice/old/model/DeviceInfo;

    move-result-object v0

    return-object v0
.end method

.method public getCloudUserDeviceCode()J
    .locals 2

    .line 183
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/model/DeviceInfo;->cloudUserDeviceCode:J

    return-wide v0
.end method

.method public getDeviceId()Ljava/lang/String;
    .locals 1

    .line 203
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/model/DeviceInfo;->deviceId:Ljava/lang/String;

    return-object v0
.end method

.method public getHuid()J
    .locals 2

    .line 193
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/model/DeviceInfo;->huid:J

    return-wide v0
.end method

.method public getLocalUserDeviceCode()I
    .locals 1

    .line 173
    iget v0, p0, Lcom/huawei/hihealthservice/old/model/DeviceInfo;->localUserDeviceCode:I

    return v0
.end method

.method public getProductId()I
    .locals 1

    .line 213
    iget v0, p0, Lcom/huawei/hihealthservice/old/model/DeviceInfo;->productId:I

    return v0
.end method

.method public getProductName()Ljava/lang/String;
    .locals 1

    .line 223
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/model/DeviceInfo;->productName:Ljava/lang/String;

    return-object v0
.end method

.method public getProductTypes()[I
    .locals 2

    .line 233
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/model/DeviceInfo;->productTypes:[I

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 234
    const/4 v0, 0x0

    return-object v0

    .line 236
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/model/DeviceInfo;->productTypes:[I

    invoke-virtual {v0}, [I->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [I

    return-object v0
.end method

.method public getVersion()Ljava/lang/String;
    .locals 1

    .line 249
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/model/DeviceInfo;->version:Ljava/lang/String;

    return-object v0
.end method

.method public initFunctionAb()V
    .locals 0

    .line 346
    return-void
.end method

.method public initFunctionBb()V
    .locals 0

    .line 350
    return-void
.end method

.method public initFunctionCb()V
    .locals 0

    .line 354
    return-void
.end method

.method public setCloudUserDeviceCode(J)V
    .locals 0

    .line 188
    iput-wide p1, p0, Lcom/huawei/hihealthservice/old/model/DeviceInfo;->cloudUserDeviceCode:J

    .line 189
    return-void
.end method

.method public setDeviceId(Ljava/lang/String;)V
    .locals 0

    .line 208
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/model/DeviceInfo;->deviceId:Ljava/lang/String;

    .line 209
    return-void
.end method

.method public setHuid(J)V
    .locals 0

    .line 198
    iput-wide p1, p0, Lcom/huawei/hihealthservice/old/model/DeviceInfo;->huid:J

    .line 199
    return-void
.end method

.method public setLocalUserDeviceCode(I)V
    .locals 0

    .line 178
    iput p1, p0, Lcom/huawei/hihealthservice/old/model/DeviceInfo;->localUserDeviceCode:I

    .line 179
    return-void
.end method

.method public setProductId(I)V
    .locals 0

    .line 218
    iput p1, p0, Lcom/huawei/hihealthservice/old/model/DeviceInfo;->productId:I

    .line 219
    return-void
.end method

.method public setProductName(Ljava/lang/String;)V
    .locals 0

    .line 228
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/model/DeviceInfo;->productName:Ljava/lang/String;

    .line 229
    return-void
.end method

.method public setProductTypes([I)V
    .locals 1

    .line 241
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 242
    return-void

    .line 244
    :cond_0
    invoke-virtual {p1}, [I->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [I

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/model/DeviceInfo;->productTypes:[I

    .line 245
    return-void
.end method

.method public setVersion(Ljava/lang/String;)V
    .locals 0

    .line 254
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/model/DeviceInfo;->version:Ljava/lang/String;

    .line 255
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 274
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 275
    const-string v0, "DeviceInfo ["

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 276
    const-string v0, ", productId="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 277
    iget v0, p0, Lcom/huawei/hihealthservice/old/model/DeviceInfo;->productId:I

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 278
    const-string v0, ", productName="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 279
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/model/DeviceInfo;->productName:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 280
    const-string v0, ", productTypes="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 281
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/model/DeviceInfo;->productTypes:[I

    invoke-static {v0}, Ljava/util/Arrays;->toString([I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 282
    const-string v0, ", version="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 283
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/model/DeviceInfo;->version:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 284
    const-string v0, "]"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 285
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
