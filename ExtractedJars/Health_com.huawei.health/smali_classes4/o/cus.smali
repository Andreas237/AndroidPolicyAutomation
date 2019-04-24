.class public Lo/cus;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final e:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<Lo/cuu;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 17
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    sput-object v0, Lo/cus;->e:Landroid/util/SparseArray;

    .line 20
    sget-object v0, Lo/cus;->e:Landroid/util/SparseArray;

    new-instance v1, Lo/cut;

    invoke-direct {v1}, Lo/cut;-><init>()V

    const/16 v2, 0x64

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 21
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b(I)Lo/cuu;
    .locals 1

    .line 24
    sget-object v0, Lo/cus;->e:Landroid/util/SparseArray;

    invoke-virtual {v0, p0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/cuu;

    return-object v0
.end method
