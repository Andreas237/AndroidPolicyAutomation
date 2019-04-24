.class public final Lo/clw;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static c:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<Ljava/lang/Object;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 142
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    sput-object v0, Lo/clw;->c:Landroid/util/SparseArray;

    .line 144
    sget-object v0, Lo/clw;->c:Landroid/util/SparseArray;

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V

    .line 145
    sget-object v0, Lo/clw;->c:Landroid/util/SparseArray;

    const-string v1, "ERR_API_EXECEPTION "

    const/4 v2, 0x1

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V

    .line 146
    sget-object v0, Lo/clw;->c:Landroid/util/SparseArray;

    const-string v1, "ERR_BINDER_EXECEPTION "

    const/4 v2, 0x2

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V

    .line 147
    sget-object v0, Lo/clw;->c:Landroid/util/SparseArray;

    const-string v1, "ERR_DATA_VALIDATOR "

    const/4 v2, 0x3

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V

    .line 148
    sget-object v0, Lo/clw;->c:Landroid/util/SparseArray;

    const-string v1, "ERR_DATA_INSERT "

    const/4 v2, 0x4

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V

    .line 149
    sget-object v0, Lo/clw;->c:Landroid/util/SparseArray;

    const-string v1, "ERR_DATA_READ "

    const/4 v2, 0x5

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V

    .line 150
    sget-object v0, Lo/clw;->c:Landroid/util/SparseArray;

    const-string v1, "ERR_DATA_STAT "

    const/4 v2, 0x6

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V

    .line 151
    sget-object v0, Lo/clw;->c:Landroid/util/SparseArray;

    const-string v1, "ERR_AUTHORIZATION "

    const/16 v2, 0x8

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V

    .line 152
    sget-object v0, Lo/clw;->c:Landroid/util/SparseArray;

    const-string v1, "ERR_DATA_DELTE "

    const/16 v2, 0x9

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V

    .line 153
    sget-object v0, Lo/clw;->c:Landroid/util/SparseArray;

    const-string v1, "ERR_NOFIND_CLIENT "

    const/16 v2, 0xa

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V

    .line 154
    sget-object v0, Lo/clw;->c:Landroid/util/SparseArray;

    const-string v1, "ERR_SQLITE_EXECEPTION "

    const/16 v2, 0xb

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V

    .line 155
    sget-object v0, Lo/clw;->c:Landroid/util/SparseArray;

    const-string v1, "ERR_PARAMETER_ERROR "

    const/4 v2, 0x7

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V

    .line 156
    sget-object v0, Lo/clw;->c:Landroid/util/SparseArray;

    const-string v1, "ERR_LOGIN "

    const/16 v2, 0xc

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V

    .line 157
    sget-object v0, Lo/clw;->c:Landroid/util/SparseArray;

    const-string v1, "ERR_LOGOUT "

    const/16 v2, 0xd

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V

    .line 158
    sget-object v0, Lo/clw;->c:Landroid/util/SparseArray;

    const-string v1, "ERR_USERINFO "

    const/16 v2, 0xe

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V

    .line 159
    sget-object v0, Lo/clw;->c:Landroid/util/SparseArray;

    const-string v1, "ERR_ACCOUNTINFO "

    const/16 v2, 0xf

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V

    .line 160
    sget-object v0, Lo/clw;->c:Landroid/util/SparseArray;

    const-string v1, "ERR_GOALINFO "

    const/16 v2, 0x10

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V

    .line 161
    sget-object v0, Lo/clw;->c:Landroid/util/SparseArray;

    const-string v1, "ERR_VALID_APP"

    const/16 v2, 0x11

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V

    .line 162
    sget-object v0, Lo/clw;->c:Landroid/util/SparseArray;

    const-string v1, "ERR_VALID_UPDATE_OPTION"

    const/16 v2, 0x12

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V

    .line 163
    sget-object v0, Lo/clw;->c:Landroid/util/SparseArray;

    const-string v1, "ERR_IS_NO_CLOUD_VERSION"

    const/16 v2, 0x13

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V

    .line 164
    sget-object v0, Lo/clw;->c:Landroid/util/SparseArray;

    const-string v1, "ERR_HEALTH_USER_HAS_BEEN_CHANGED"

    const/16 v2, 0x14

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V

    .line 165
    sget-object v0, Lo/clw;->c:Landroid/util/SparseArray;

    const-string v1, "ERR_TIMEOUT"

    const/16 v2, 0x15

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V

    .line 166
    sget-object v0, Lo/clw;->c:Landroid/util/SparseArray;

    const-string v1, "ERR_THREAD_DISPOSE_EXCEPTION"

    const/16 v2, 0x16

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V

    .line 167
    sget-object v0, Lo/clw;->c:Landroid/util/SparseArray;

    const-string v1, "ERR_AT_INVALID"

    const/16 v2, 0x17

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V

    .line 168
    sget-object v0, Lo/clw;->c:Landroid/util/SparseArray;

    const-string v1, "ERR_HEALTH_DIDNOT_RUN"

    const/16 v2, 0x18

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V

    .line 169
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b(I)Ljava/lang/Object;
    .locals 2

    .line 175
    sget-object v0, Lo/clw;->c:Landroid/util/SparseArray;

    invoke-virtual {v0, p0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v1

    .line 176
    const/4 v0, 0x0

    if-ne v0, v1, :cond_0

    .line 177
    const-string v0, "unknown error"

    return-object v0

    .line 179
    :cond_0
    return-object v1
.end method
