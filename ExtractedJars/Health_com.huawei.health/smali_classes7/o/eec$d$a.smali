.class Lo/eec$d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/eec;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/eec$d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# instance fields
.field private d:Landroid/os/IBinder;


# direct methods
.method constructor <init>(Landroid/os/IBinder;)V
    .locals 0

    .line 66
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 67
    iput-object p1, p0, Lo/eec$d$a;->d:Landroid/os/IBinder;

    .line 68
    return-void
.end method


# virtual methods
.method public asBinder()Landroid/os/IBinder;
    .locals 1

    .line 71
    iget-object v0, p0, Lo/eec$d$a;->d:Landroid/os/IBinder;

    return-object v0
.end method

.method public d(Lcom/huawei/sns/sdk/modelmsg/GroupMemListResp;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 79
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 80
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 82
    const-string v0, "com.huawei.sns.sdk.openapi.ICallBackGroupMemEventHandler"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 83
    if-eqz p1, :cond_0

    .line 84
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 85
    const/4 v0, 0x0

    invoke-virtual {p1, v3, v0}, Lcom/huawei/sns/sdk/modelmsg/GroupMemListResp;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_0

    .line 88
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 90
    :goto_0
    iget-object v0, p0, Lo/eec$d$a;->d:Landroid/os/IBinder;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 91
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 94
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 95
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 96
    goto :goto_1

    .line 94
    :catchall_0
    move-exception v5

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 95
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    throw v5

    .line 97
    :goto_1
    return-void
.end method
