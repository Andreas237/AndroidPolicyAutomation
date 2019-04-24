.class public Lo/csp;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final d:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<Ljava/lang/String;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 56
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    sput-object v0, Lo/csp;->d:Landroid/util/SparseArray;

    .line 59
    sget-object v0, Lo/csp;->d:Landroid/util/SparseArray;

    const-string v1, "SYNC_EX: CLOUD_NO_ANS "

    const/4 v2, 0x1

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 60
    sget-object v0, Lo/csp;->d:Landroid/util/SparseArray;

    const-string v1, "SYNC_EX:INTERFACE_NOT_AVAILABLE "

    const/16 v2, 0x63

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 61
    sget-object v0, Lo/csp;->d:Landroid/util/SparseArray;

    const-string v1, "SYNC_EX:REACH_FLOW_THRESHOLD "

    const/16 v2, 0x64

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 62
    sget-object v0, Lo/csp;->d:Landroid/util/SparseArray;

    const-string v1, "SYNC_EX:CLOUD_BUSY "

    const/16 v2, 0x65

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 63
    sget-object v0, Lo/csp;->d:Landroid/util/SparseArray;

    const-string v1, "SYNC_EX:INTERFACE_NEED_UPGRADE "

    const/16 v2, 0x3e7

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 64
    sget-object v0, Lo/csp;->d:Landroid/util/SparseArray;

    const-string v1, "SYNC_EX: ILLEGAL_PARAMETERS "

    const/16 v2, 0x3e9

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 65
    sget-object v0, Lo/csp;->d:Landroid/util/SparseArray;

    const-string v1, "SYNC_EX: AUTH_FAILED "

    const/16 v2, 0x3ea

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 66
    sget-object v0, Lo/csp;->d:Landroid/util/SparseArray;

    const-string v1, "SYNC_EX: SESSION_TIMEOUT "

    const/16 v2, 0x3eb

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 67
    sget-object v0, Lo/csp;->d:Landroid/util/SparseArray;

    const-string v1, "SYNC_EX: TOKEN_EXPIRED "

    const/16 v2, 0x3ec

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 68
    sget-object v0, Lo/csp;->d:Landroid/util/SparseArray;

    const-string v1, "SYNC_EX: AUTH_VERIFY_FAILED "

    const/16 v2, 0x3ed

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 69
    sget-object v0, Lo/csp;->d:Landroid/util/SparseArray;

    const-string v1, "SYNC_EX: NO_HUID_FOUND "

    const/16 v2, 0x7531

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 70
    sget-object v0, Lo/csp;->d:Landroid/util/SparseArray;

    const-string v1, "SYNC_EX: NO_CUSTOM_ATTRIBUTES "

    const/16 v2, 0x7532

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 71
    sget-object v0, Lo/csp;->d:Landroid/util/SparseArray;

    const-string v1, "SYNC_EX: NO_SUCH_PRODUCT_ID "

    const/16 v2, 0x7533

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 72
    sget-object v0, Lo/csp;->d:Landroid/util/SparseArray;

    const-string v1, "SYNC_EX: NO_DEVICE_FOUND "

    const/16 v2, 0x7534

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 73
    sget-object v0, Lo/csp;->d:Landroid/util/SparseArray;

    const-string v1, "SYNC_EX: ILLEGAL_DEVICE "

    const/16 v2, 0x7535

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 74
    sget-object v0, Lo/csp;->d:Landroid/util/SparseArray;

    const-string v1, "SYNC_EX: USER_ATTRIBUTES_ALL_NULL "

    const/16 v2, 0x7536

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 75
    sget-object v0, Lo/csp;->d:Landroid/util/SparseArray;

    const-string v1, "SYNC_EX: NO_USER_PROFILE "

    const/16 v2, 0x7537

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 76
    sget-object v0, Lo/csp;->d:Landroid/util/SparseArray;

    const-string v1, "SYNC_EX: NOT_LOGIN_OR_ILLEGAL_HUID "

    const v2, 0x31129

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 77
    sget-object v0, Lo/csp;->d:Landroid/util/SparseArray;

    const-string v1, "SYNC_EX: SYSTEM_ERROR "

    const/16 v2, 0x270f

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 78
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b(I)Ljava/lang/String;
    .locals 1

    .line 81
    sget-object v0, Lo/csp;->d:Landroid/util/SparseArray;

    invoke-virtual {v0, p0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method
