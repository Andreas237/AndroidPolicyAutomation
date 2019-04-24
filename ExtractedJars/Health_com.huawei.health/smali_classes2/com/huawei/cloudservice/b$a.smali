.class public abstract Lcom/huawei/cloudservice/b$a;
.super Landroid/os/Binder;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/cloudservice/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/cloudservice/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/cloudservice/b$a$a;
    }
.end annotation


# direct methods
.method public static a(Landroid/os/IBinder;)Lcom/huawei/cloudservice/b;
    .locals 2

    .line 25
    if-nez p0, :cond_0

    .line 26
    const/4 v0, 0x0

    return-object v0

    .line 28
    :cond_0
    const-string v0, "com.huawei.cloudservice.ICloudAccount"

    invoke-interface {p0, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v1

    .line 29
    if-eqz v1, :cond_1

    instance-of v0, v1, Lcom/huawei/cloudservice/b;

    if-eqz v0, :cond_1

    .line 30
    move-object v0, v1

    check-cast v0, Lcom/huawei/cloudservice/b;

    return-object v0

    .line 32
    :cond_1
    new-instance v0, Lcom/huawei/cloudservice/b$a$a;

    invoke-direct {v0, p0}, Lcom/huawei/cloudservice/b$a$a;-><init>(Landroid/os/IBinder;)V

    return-object v0
.end method


# virtual methods
.method public onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 40
    sparse-switch p1, :sswitch_data_0

    goto/16 :goto_4

    .line 44
    :sswitch_0
    const-string v0, "com.huawei.cloudservice.ICloudAccount"

    invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 45
    const/4 v0, 0x1

    return v0

    .line 49
    :sswitch_1
    const-string v0, "com.huawei.cloudservice.ICloudAccount"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 51
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v2

    .line 53
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 54
    sget-object v0, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroid/os/Bundle;

    goto :goto_0

    .line 57
    :cond_0
    const/4 v3, 0x0

    .line 60
    :goto_0
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/cloudservice/c$a;->a(Landroid/os/IBinder;)Lcom/huawei/cloudservice/c;

    move-result-object v4

    .line 61
    invoke-virtual {p0, v2, v3, v4}, Lcom/huawei/cloudservice/b$a;->a(Ljava/lang/String;Landroid/os/Bundle;Lcom/huawei/cloudservice/c;)V

    .line 62
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 63
    const/4 v0, 0x1

    return v0

    .line 67
    :sswitch_2
    const-string v0, "com.huawei.cloudservice.ICloudAccount"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 69
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 70
    sget-object v0, Landroid/content/Intent;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/content/Intent;

    goto :goto_1

    .line 73
    :cond_1
    const/4 v2, 0x0

    .line 76
    :goto_1
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v3

    .line 77
    invoke-virtual {p0, v2, v3}, Lcom/huawei/cloudservice/b$a;->a(Landroid/content/Intent;I)I

    move-result v4

    .line 78
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 79
    invoke-virtual {p3, v4}, Landroid/os/Parcel;->writeInt(I)V

    .line 80
    const/4 v0, 0x1

    return v0

    .line 84
    :sswitch_3
    const-string v0, "com.huawei.cloudservice.ICloudAccount"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 86
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v2

    .line 88
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v3

    .line 90
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v4

    .line 92
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/cloudservice/c$a;->a(Landroid/os/IBinder;)Lcom/huawei/cloudservice/c;

    move-result-object v5

    .line 93
    invoke-virtual {p0, v2, v3, v4, v5}, Lcom/huawei/cloudservice/b$a;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/huawei/cloudservice/c;)V

    .line 94
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 95
    const/4 v0, 0x1

    return v0

    .line 99
    :sswitch_4
    const-string v0, "com.huawei.cloudservice.ICloudAccount"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 101
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v2

    .line 103
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v3

    .line 105
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 106
    sget-object v0, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/os/Bundle;

    goto :goto_2

    .line 109
    :cond_2
    const/4 v4, 0x0

    .line 112
    :goto_2
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/cloudservice/c$a;->a(Landroid/os/IBinder;)Lcom/huawei/cloudservice/c;

    move-result-object v5

    .line 113
    invoke-virtual {p0, v2, v3, v4, v5}, Lcom/huawei/cloudservice/b$a;->a(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Lcom/huawei/cloudservice/c;)V

    .line 114
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 115
    const/4 v0, 0x1

    return v0

    .line 119
    :sswitch_5
    const-string v0, "com.huawei.cloudservice.ICloudAccount"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 121
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v2

    .line 123
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v3

    .line 125
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 126
    sget-object v0, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/os/Bundle;

    goto :goto_3

    .line 129
    :cond_3
    const/4 v4, 0x0

    .line 132
    :goto_3
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/cloudservice/c$a;->a(Landroid/os/IBinder;)Lcom/huawei/cloudservice/c;

    move-result-object v5

    .line 133
    invoke-virtual {p0, v2, v3, v4, v5}, Lcom/huawei/cloudservice/b$a;->b(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Lcom/huawei/cloudservice/c;)V

    .line 134
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 135
    const/4 v0, 0x1

    return v0

    .line 138
    :goto_4
    invoke-super {p0, p1, p2, p3, p4}, Landroid/os/Binder;->onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    move-result v0

    return v0

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_1
        0x2 -> :sswitch_2
        0x3 -> :sswitch_3
        0x4 -> :sswitch_4
        0x5 -> :sswitch_5
        0x5f4e5446 -> :sswitch_0
    .end sparse-switch
.end method
