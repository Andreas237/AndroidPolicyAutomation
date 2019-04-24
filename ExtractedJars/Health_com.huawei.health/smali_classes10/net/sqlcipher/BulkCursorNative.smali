.class public abstract Lnet/sqlcipher/BulkCursorNative;
.super Landroid/os/Binder;
.source "SourceFile"

# interfaces
.implements Lnet/sqlcipher/IBulkCursor;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 37
    invoke-direct {p0}, Landroid/os/Binder;-><init>()V

    .line 38
    const-string v0, "android.content.IBulkCursor"

    invoke-virtual {p0, p0, v0}, Lnet/sqlcipher/BulkCursorNative;->attachInterface(Landroid/os/IInterface;Ljava/lang/String;)V

    .line 39
    return-void
.end method

.method public static asInterface(Landroid/os/IBinder;)Lnet/sqlcipher/IBulkCursor;
    .locals 2

    .line 47
    if-nez p0, :cond_0

    .line 48
    const/4 v0, 0x0

    return-object v0

    .line 50
    :cond_0
    const-string v0, "android.content.IBulkCursor"

    invoke-interface {p0, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lnet/sqlcipher/IBulkCursor;

    .line 51
    if-eqz v1, :cond_1

    .line 52
    return-object v1

    .line 55
    :cond_1
    new-instance v0, Lnet/sqlcipher/BulkCursorProxy;

    invoke-direct {v0, p0}, Lnet/sqlcipher/BulkCursorProxy;-><init>(Landroid/os/IBinder;)V

    return-object v0
.end method


# virtual methods
.method public asBinder()Landroid/os/IBinder;
    .locals 0

    .line 186
    return-object p0
.end method

.method public onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 62
    packed-switch p1, :pswitch_data_0

    goto/16 :goto_4

    .line 64
    :pswitch_0
    const-string v0, "android.content.IBulkCursor"

    :try_start_0
    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 65
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v1

    .line 66
    invoke-virtual {p0, v1}, Lnet/sqlcipher/BulkCursorNative;->getWindow(I)Lnet/sqlcipher/CursorWindow;

    move-result-object v2

    .line 67
    if-nez v2, :cond_0

    .line 68
    const/4 v0, 0x0

    invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeInt(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 69
    const/4 v0, 0x1

    return v0

    .line 71
    :cond_0
    :try_start_1
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 72
    const/4 v0, 0x1

    invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 73
    const/4 v0, 0x0

    invoke-virtual {v2, p3, v0}, Lnet/sqlcipher/CursorWindow;->writeToParcel(Landroid/os/Parcel;I)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 74
    const/4 v0, 0x1

    return v0

    .line 78
    :pswitch_1
    const-string v0, "android.content.IBulkCursor"

    :try_start_2
    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 79
    invoke-virtual {p0}, Lnet/sqlcipher/BulkCursorNative;->count()I

    move-result v1

    .line 80
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 81
    invoke-virtual {p3, v1}, Landroid/os/Parcel;->writeInt(I)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 82
    const/4 v0, 0x1

    return v0

    .line 86
    :pswitch_2
    const-string v0, "android.content.IBulkCursor"

    :try_start_3
    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 87
    invoke-virtual {p0}, Lnet/sqlcipher/BulkCursorNative;->getColumnNames()[Ljava/lang/String;

    move-result-object v1

    .line 88
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 89
    array-length v0, v1

    invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 90
    array-length v2, v1

    .line 91
    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    .line 92
    aget-object v0, v1, v3

    invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    .line 91
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 94
    :cond_1
    const/4 v0, 0x1

    return v0

    .line 98
    :pswitch_3
    const-string v0, "android.content.IBulkCursor"

    :try_start_4
    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 99
    invoke-virtual {p0}, Lnet/sqlcipher/BulkCursorNative;->deactivate()V

    .line 100
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    .line 101
    const/4 v0, 0x1

    return v0

    .line 105
    :pswitch_4
    const-string v0, "android.content.IBulkCursor"

    :try_start_5
    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 106
    invoke-virtual {p0}, Lnet/sqlcipher/BulkCursorNative;->close()V

    .line 107
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0

    .line 108
    const/4 v0, 0x1

    return v0

    .line 112
    :pswitch_5
    const-string v0, "android.content.IBulkCursor"

    :try_start_6
    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 113
    .line 114
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lnet/sqlcipher/IContentObserver$Stub;->asInterface(Landroid/os/IBinder;)Lnet/sqlcipher/IContentObserver;

    move-result-object v1

    .line 115
    sget-object v0, Lnet/sqlcipher/CursorWindow;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lnet/sqlcipher/CursorWindow;

    .line 116
    invoke-virtual {p0, v1, v2}, Lnet/sqlcipher/BulkCursorNative;->requery(Lnet/sqlcipher/IContentObserver;Lnet/sqlcipher/CursorWindow;)I

    move-result v3

    .line 117
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 118
    invoke-virtual {p3, v3}, Landroid/os/Parcel;->writeInt(I)V

    .line 119
    invoke-virtual {p0}, Lnet/sqlcipher/BulkCursorNative;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeBundle(Landroid/os/Bundle;)V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_0

    .line 120
    const/4 v0, 0x1

    return v0

    .line 124
    :pswitch_6
    const-string v0, "android.content.IBulkCursor"

    :try_start_7
    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 127
    const/4 v0, 0x0

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->readHashMap(Ljava/lang/ClassLoader;)Ljava/util/HashMap;

    move-result-object v1

    .line 128
    invoke-virtual {p0, v1}, Lnet/sqlcipher/BulkCursorNative;->updateRows(Ljava/util/Map;)Z

    move-result v2

    .line 129
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 130
    const/4 v0, 0x1

    if-ne v2, v0, :cond_2

    const/4 v0, 0x1

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    :goto_1
    invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeInt(I)V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_0

    .line 131
    const/4 v0, 0x1

    return v0

    .line 135
    :pswitch_7
    const-string v0, "android.content.IBulkCursor"

    :try_start_8
    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 136
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v1

    .line 137
    invoke-virtual {p0, v1}, Lnet/sqlcipher/BulkCursorNative;->deleteRow(I)Z

    move-result v2

    .line 138
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 139
    const/4 v0, 0x1

    if-ne v2, v0, :cond_3

    const/4 v0, 0x1

    goto :goto_2

    :cond_3
    const/4 v0, 0x0

    :goto_2
    invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeInt(I)V
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_0

    .line 140
    const/4 v0, 0x1

    return v0

    .line 144
    :pswitch_8
    const-string v0, "android.content.IBulkCursor"

    :try_start_9
    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 145
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v1

    .line 146
    invoke-virtual {p0, v1}, Lnet/sqlcipher/BulkCursorNative;->onMove(I)V

    .line 147
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_0

    .line 148
    const/4 v0, 0x1

    return v0

    .line 152
    :pswitch_9
    const-string v0, "android.content.IBulkCursor"

    :try_start_a
    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 153
    invoke-virtual {p0}, Lnet/sqlcipher/BulkCursorNative;->getWantsAllOnMoveCalls()Z

    move-result v1

    .line 154
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 155
    if-eqz v1, :cond_4

    const/4 v0, 0x1

    goto :goto_3

    :cond_4
    const/4 v0, 0x0

    :goto_3
    invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeInt(I)V
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_0

    .line 156
    const/4 v0, 0x1

    return v0

    .line 160
    :pswitch_a
    const-string v0, "android.content.IBulkCursor"

    :try_start_b
    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 161
    invoke-virtual {p0}, Lnet/sqlcipher/BulkCursorNative;->getExtras()Landroid/os/Bundle;

    move-result-object v1

    .line 162
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 163
    invoke-virtual {p3, v1}, Landroid/os/Parcel;->writeBundle(Landroid/os/Bundle;)V
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_0

    .line 164
    const/4 v0, 0x1

    return v0

    .line 168
    :pswitch_b
    const-string v0, "android.content.IBulkCursor"

    :try_start_c
    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 169
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->readBundle(Ljava/lang/ClassLoader;)Landroid/os/Bundle;

    move-result-object v1

    .line 170
    invoke-virtual {p0, v1}, Lnet/sqlcipher/BulkCursorNative;->respond(Landroid/os/Bundle;)Landroid/os/Bundle;

    move-result-object v2

    .line 171
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 172
    invoke-virtual {p3, v2}, Landroid/os/Parcel;->writeBundle(Landroid/os/Bundle;)V
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_0

    .line 173
    const/4 v0, 0x1

    return v0

    .line 179
    :goto_4
    goto :goto_5

    .line 176
    :catch_0
    move-exception v1

    .line 177
    invoke-static {p3, v1}, Lnet/sqlcipher/DatabaseUtils;->writeExceptionToParcel(Landroid/os/Parcel;Ljava/lang/Exception;)V

    .line 178
    const/4 v0, 0x1

    return v0

    .line 181
    :goto_5
    invoke-super {p0, p1, p2, p3, p4}, Landroid/os/Binder;->onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    move-result v0

    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_6
        :pswitch_7
        :pswitch_3
        :pswitch_5
        :pswitch_8
        :pswitch_9
        :pswitch_a
        :pswitch_b
        :pswitch_4
    .end packed-switch
.end method
