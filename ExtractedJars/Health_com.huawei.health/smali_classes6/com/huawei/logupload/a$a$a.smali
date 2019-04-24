.class Lcom/huawei/logupload/a$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/logupload/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/logupload/a$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# instance fields
.field private a:Landroid/os/IBinder;


# direct methods
.method constructor <init>(Landroid/os/IBinder;)V
    .locals 0

    .line 140
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 142
    iput-object p1, p0, Lcom/huawei/logupload/a$a$a;->a:Landroid/os/IBinder;

    .line 143
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)Lcom/huawei/logupload/LogUpload;
    .locals 7

    .line 249
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 250
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 253
    const-string v0, "com.huawei.logupload.ExternalConnectionDatabase"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 254
    invoke-virtual {v3, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 255
    iget-object v0, p0, Lcom/huawei/logupload/a$a$a;->a:Landroid/os/IBinder;

    const/4 v1, 0x5

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 256
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V

    .line 257
    invoke-virtual {v4}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-eqz v0, :cond_0

    .line 258
    sget-object v0, Lcom/huawei/logupload/LogUpload;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, v4}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/logupload/LogUpload;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 259
    goto :goto_0

    .line 261
    :cond_0
    const/4 v5, 0x0

    .line 263
    goto :goto_0

    .line 264
    :catchall_0
    move-exception v6

    .line 265
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 266
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 267
    throw v6

    .line 265
    :goto_0
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 266
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 268
    return-object v5
.end method

.method public a()Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/logupload/LogUpload;>;"
        }
    .end annotation

    .line 181
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 182
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 185
    const-string v0, "com.huawei.logupload.ExternalConnectionDatabase"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 186
    iget-object v0, p0, Lcom/huawei/logupload/a$a$a;->a:Landroid/os/IBinder;

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 187
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V

    .line 188
    sget-object v0, Lcom/huawei/logupload/LogUpload;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-virtual {v4, v0}, Landroid/os/Parcel;->createTypedArrayList(Landroid/os/Parcelable$Creator;)Ljava/util/ArrayList;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v5

    .line 189
    goto :goto_0

    .line 190
    :catchall_0
    move-exception v6

    .line 191
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 192
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 193
    throw v6

    .line 191
    :goto_0
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 192
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 194
    return-object v5
.end method

.method public a(Lcom/huawei/logupload/LogUpload;)Z
    .locals 7

    .line 154
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 155
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 158
    const-string v0, "com.huawei.logupload.ExternalConnectionDatabase"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 159
    if-eqz p1, :cond_0

    .line 160
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 161
    const/4 v0, 0x0

    invoke-virtual {p1, v3, v0}, Lcom/huawei/logupload/LogUpload;->writeToParcel(Landroid/os/Parcel;I)V

    .line 162
    goto :goto_0

    .line 164
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 166
    :goto_0
    iget-object v0, p0, Lcom/huawei/logupload/a$a$a;->a:Landroid/os/IBinder;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 167
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V

    .line 168
    invoke-virtual {v4}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-eqz v0, :cond_1

    const/4 v5, 0x1

    goto :goto_1

    :cond_1
    const/4 v5, 0x0

    .line 169
    :goto_1
    invoke-virtual {v4}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-eqz v0, :cond_2

    .line 170
    invoke-virtual {p1, v4}, Lcom/huawei/logupload/LogUpload;->a(Landroid/os/Parcel;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 172
    goto :goto_2

    .line 173
    :catchall_0
    move-exception v6

    .line 174
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 175
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 176
    throw v6

    .line 174
    :cond_2
    :goto_2
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 175
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 177
    return v5
.end method

.method public asBinder()Landroid/os/IBinder;
    .locals 1

    .line 146
    iget-object v0, p0, Lcom/huawei/logupload/a$a$a;->a:Landroid/os/IBinder;

    return-object v0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .line 150
    const-string v0, "com.huawei.logupload.ExternalConnectionDatabase"

    return-object v0
.end method

.method public b(Lcom/huawei/logupload/LogUpload;)Ljava/lang/String;
    .locals 7

    .line 198
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 199
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 202
    const-string v0, "com.huawei.logupload.ExternalConnectionDatabase"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 203
    if-eqz p1, :cond_0

    .line 204
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 205
    const/4 v0, 0x0

    invoke-virtual {p1, v3, v0}, Lcom/huawei/logupload/LogUpload;->writeToParcel(Landroid/os/Parcel;I)V

    .line 206
    goto :goto_0

    .line 208
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 210
    :goto_0
    iget-object v0, p0, Lcom/huawei/logupload/a$a$a;->a:Landroid/os/IBinder;

    const/4 v1, 0x3

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 211
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V

    .line 212
    invoke-virtual {v4}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v5

    .line 213
    invoke-virtual {v4}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-eqz v0, :cond_1

    .line 214
    invoke-virtual {p1, v4}, Lcom/huawei/logupload/LogUpload;->a(Landroid/os/Parcel;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 216
    goto :goto_1

    .line 217
    :catchall_0
    move-exception v6

    .line 218
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 219
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 220
    throw v6

    .line 218
    :cond_1
    :goto_1
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 219
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 221
    return-object v5
.end method

.method public c(Lcom/huawei/logupload/LogUpload;)V
    .locals 6

    .line 225
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 226
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 228
    const-string v0, "com.huawei.logupload.ExternalConnectionDatabase"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 229
    if-eqz p1, :cond_0

    .line 230
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 231
    const/4 v0, 0x0

    invoke-virtual {p1, v3, v0}, Lcom/huawei/logupload/LogUpload;->writeToParcel(Landroid/os/Parcel;I)V

    .line 232
    goto :goto_0

    .line 234
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 236
    :goto_0
    iget-object v0, p0, Lcom/huawei/logupload/a$a$a;->a:Landroid/os/IBinder;

    const/4 v1, 0x4

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 237
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V

    .line 238
    invoke-virtual {v4}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-eqz v0, :cond_1

    .line 239
    invoke-virtual {p1, v4}, Lcom/huawei/logupload/LogUpload;->a(Landroid/os/Parcel;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 241
    goto :goto_1

    .line 242
    :catchall_0
    move-exception v5

    .line 243
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 244
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 245
    throw v5

    .line 243
    :cond_1
    :goto_1
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 244
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 246
    return-void
.end method
