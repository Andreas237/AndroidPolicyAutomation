.class Lcom/huawei/cloudservice/c$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/cloudservice/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/cloudservice/c$a;
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

    .line 109
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 110
    iput-object p1, p0, Lcom/huawei/cloudservice/c$a$a;->a:Landroid/os/IBinder;

    .line 111
    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 166
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 167
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 169
    const-string v0, "com.huawei.cloudservice.IHwIDCallback"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 170
    invoke-virtual {v3, p1}, Landroid/os/Parcel;->writeInt(I)V

    .line 171
    iget-object v0, p0, Lcom/huawei/cloudservice/c$a$a;->a:Landroid/os/IBinder;

    const/4 v1, 0x3

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 172
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 175
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 176
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 177
    goto :goto_0

    .line 175
    :catchall_0
    move-exception v5

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 176
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    throw v5

    .line 178
    :goto_0
    return-void
.end method

.method public a(ILandroid/content/Intent;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 144
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 145
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 147
    const-string v0, "com.huawei.cloudservice.IHwIDCallback"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 148
    invoke-virtual {v3, p1}, Landroid/os/Parcel;->writeInt(I)V

    .line 149
    if-eqz p2, :cond_0

    .line 150
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 151
    const/4 v0, 0x0

    invoke-virtual {p2, v3, v0}, Landroid/content/Intent;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_0

    .line 154
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 156
    :goto_0
    iget-object v0, p0, Lcom/huawei/cloudservice/c$a$a;->a:Landroid/os/IBinder;

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 157
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 160
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 161
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 162
    goto :goto_1

    .line 160
    :catchall_0
    move-exception v5

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 161
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    throw v5

    .line 163
    :goto_1
    return-void
.end method

.method public a(ILandroid/os/Bundle;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 122
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 123
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 125
    const-string v0, "com.huawei.cloudservice.IHwIDCallback"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 126
    invoke-virtual {v3, p1}, Landroid/os/Parcel;->writeInt(I)V

    .line 127
    if-eqz p2, :cond_0

    .line 128
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 129
    const/4 v0, 0x0

    invoke-virtual {p2, v3, v0}, Landroid/os/Bundle;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_0

    .line 132
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 134
    :goto_0
    iget-object v0, p0, Lcom/huawei/cloudservice/c$a$a;->a:Landroid/os/IBinder;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 135
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 138
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 139
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 140
    goto :goto_1

    .line 138
    :catchall_0
    move-exception v5

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 139
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    throw v5

    .line 141
    :goto_1
    return-void
.end method

.method public asBinder()Landroid/os/IBinder;
    .locals 1

    .line 114
    iget-object v0, p0, Lcom/huawei/cloudservice/c$a$a;->a:Landroid/os/IBinder;

    return-object v0
.end method

.method public b(ILandroid/os/Bundle;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 181
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 182
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 184
    const-string v0, "com.huawei.cloudservice.IHwIDCallback"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 185
    invoke-virtual {v3, p1}, Landroid/os/Parcel;->writeInt(I)V

    .line 186
    if-eqz p2, :cond_0

    .line 187
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 188
    const/4 v0, 0x0

    invoke-virtual {p2, v3, v0}, Landroid/os/Bundle;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_0

    .line 191
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 193
    :goto_0
    iget-object v0, p0, Lcom/huawei/cloudservice/c$a$a;->a:Landroid/os/IBinder;

    const/4 v1, 0x4

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 194
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 197
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 198
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 199
    goto :goto_1

    .line 197
    :catchall_0
    move-exception v5

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 198
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    throw v5

    .line 200
    :goto_1
    return-void
.end method
