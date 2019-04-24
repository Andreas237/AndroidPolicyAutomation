.class public Lo/cmk;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/cmk$a;,
        Lo/cmk$b;
    }
.end annotation


# static fields
.field private static a:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<[I>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1362
    new-instance v0, Landroid/util/SparseArray;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Landroid/util/SparseArray;-><init>(I)V

    sput-object v0, Lo/cmk;->a:Landroid/util/SparseArray;

    .line 1365
    sget-object v0, Lo/cmk;->a:Landroid/util/SparseArray;

    const/16 v1, 0x8

    new-array v1, v1, [I

    fill-array-data v1, :array_0

    const/16 v2, 0x2711

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 1367
    sget-object v0, Lo/cmk;->a:Landroid/util/SparseArray;

    const/4 v1, 0x3

    new-array v1, v1, [I

    fill-array-data v1, :array_1

    const/16 v2, 0x2712

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 1368
    sget-object v0, Lo/cmk;->a:Landroid/util/SparseArray;

    const/4 v1, 0x3

    new-array v1, v1, [I

    fill-array-data v1, :array_2

    const/16 v2, 0x2713

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 1370
    sget-object v0, Lo/cmk;->a:Landroid/util/SparseArray;

    const/16 v1, 0x17

    new-array v1, v1, [I

    fill-array-data v1, :array_3

    const/16 v2, 0x2716

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 1373
    return-void

    nop

    :array_0
    .array-data 4
        0x7d8
        0x7d9
        0x7da
        0x7db
        0x7dc
        0x7dd
        0x7de
        0x7df
    .end array-data

    :array_1
    .array-data 4
        0x7d6
        0x7d7
        0x7e2
    .end array-data

    :array_2
    .array-data 4
        0x7e0
        0x7e1
        0x7d5
    .end array-data

    :array_3
    .array-data 4
        0x7d4
        0x7d1
        0x7ef
        0x7f0
        0x7e6
        0x7e7
        0x7e8
        0x7e9
        0x7f1
        0x7ea
        0x7eb
        0x7ec
        0x7ed
        0x7ee
        0x803
        0x804
        0x805
        0x806
        0x807
        0x808
        0x809
        0x80a
        0x80b
    .end array-data
.end method

.method public constructor <init>()V
    .locals 0

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(I)I
    .locals 2

    .line 1417
    const/4 v1, 0x0

    .line 1418
    sparse-switch p0, :sswitch_data_0

    goto :goto_0

    .line 1423
    :sswitch_0
    const/16 v1, 0x4e21

    .line 1424
    goto :goto_0

    .line 1433
    :sswitch_1
    move v1, p0

    .line 1434
    .line 1438
    :goto_0
    return v1

    :sswitch_data_0
    .sparse-switch
        0x2 -> :sswitch_0
        0x3 -> :sswitch_0
        0x4 -> :sswitch_0
        0x5 -> :sswitch_0
        0x7 -> :sswitch_1
        0x7d2 -> :sswitch_1
        0x7e2 -> :sswitch_1
        0x7e3 -> :sswitch_1
        0x7e4 -> :sswitch_1
        0x7e5 -> :sswitch_1
        0x7f2 -> :sswitch_1
        0x835 -> :sswitch_1
    .end sparse-switch
.end method

.method public static a()[I
    .locals 1

    .line 1461
    const/4 v0, 0x4

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    return-object v0

    nop

    :array_0
    .array-data 4
        0x2
        0x4
        0x3
        0x5
    .end array-data
.end method

.method public static b(I)Z
    .locals 1

    .line 1445
    packed-switch p0, :pswitch_data_0

    goto :goto_0

    .line 1451
    :pswitch_0
    const/4 v0, 0x1

    return v0

    .line 1453
    :goto_0
    :pswitch_1
    const/4 v0, 0x0

    return v0

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static b()[I
    .locals 1

    .line 1474
    const/16 v0, 0x13

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    return-object v0

    :array_0
    .array-data 4
        0x9c4b
        0x9c4c
        0x9c4d
        0x9c5f
        0x9c60
        0x9c61
        0x9c62
        0x9c63
        0x9c69
        0x9c6a
        0x9c6b
        0x9c6c
        0x9c6d
        0x9c55
        0x9c56
        0x9c57
        0x9c58
        0x9c59
        0x9c45
    .end array-data
.end method

.method public static c(I)Z
    .locals 1

    .line 1650
    sparse-switch p0, :sswitch_data_0

    goto/16 :goto_0

    .line 1686
    :sswitch_0
    const/4 v0, 0x1

    return v0

    .line 1688
    :goto_0
    const/4 v0, 0x0

    return v0

    nop

    :sswitch_data_0
    .sparse-switch
        0x7d1 -> :sswitch_0
        0x7d4 -> :sswitch_0
        0x7d6 -> :sswitch_0
        0x7d7 -> :sswitch_0
        0x7d8 -> :sswitch_0
        0x7d9 -> :sswitch_0
        0x7da -> :sswitch_0
        0x7db -> :sswitch_0
        0x7dc -> :sswitch_0
        0x7dd -> :sswitch_0
        0x7de -> :sswitch_0
        0x7df -> :sswitch_0
        0x7e2 -> :sswitch_0
        0x7e6 -> :sswitch_0
        0x7e7 -> :sswitch_0
        0x7e8 -> :sswitch_0
        0x7e9 -> :sswitch_0
        0x7ea -> :sswitch_0
        0x7eb -> :sswitch_0
        0x7ec -> :sswitch_0
        0x7ed -> :sswitch_0
        0x7ee -> :sswitch_0
        0x7ef -> :sswitch_0
        0x7f0 -> :sswitch_0
        0x7f1 -> :sswitch_0
        0x803 -> :sswitch_0
        0x804 -> :sswitch_0
        0x805 -> :sswitch_0
        0x806 -> :sswitch_0
        0x807 -> :sswitch_0
        0x808 -> :sswitch_0
        0x809 -> :sswitch_0
        0x80a -> :sswitch_0
        0x80b -> :sswitch_0
        0x7531 -> :sswitch_0
    .end sparse-switch
.end method

.method public static c()[I
    .locals 1

    .line 1540
    const/16 v0, 0x10

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    return-object v0

    :array_0
    .array-data 4
        0xac45
        0xac46
        0xac47
        0xac48
        0xac49
        0xac4a
        0xac4b
        0xac4c
        0xaca9
        0xacaa
        0xacab
        0xacac
        0xacad
        0xacae
        0xacaf
        0xacb0
    .end array-data
.end method

.method public static d(I)Lo/cmk$b;
    .locals 1

    .line 1387
    const/4 v0, 0x1

    if-ge p0, v0, :cond_0

    .line 1388
    sget-object v0, Lo/cmk$b;->g:Lo/cmk$b;

    return-object v0

    .line 1389
    :cond_0
    const/16 v0, 0x2710

    if-ge p0, v0, :cond_1

    .line 1390
    sget-object v0, Lo/cmk$b;->a:Lo/cmk$b;

    return-object v0

    .line 1391
    :cond_1
    const/16 v0, 0x4e20

    if-ge p0, v0, :cond_2

    .line 1392
    sget-object v0, Lo/cmk$b;->c:Lo/cmk$b;

    return-object v0

    .line 1393
    :cond_2
    const/16 v0, 0x7530

    if-ge p0, v0, :cond_3

    .line 1394
    sget-object v0, Lo/cmk$b;->d:Lo/cmk$b;

    return-object v0

    .line 1395
    :cond_3
    const v0, 0x9c40

    if-ge p0, v0, :cond_4

    .line 1396
    sget-object v0, Lo/cmk$b;->e:Lo/cmk$b;

    return-object v0

    .line 1397
    :cond_4
    const v0, 0xc350

    if-ge p0, v0, :cond_5

    .line 1398
    sget-object v0, Lo/cmk$b;->b:Lo/cmk$b;

    return-object v0

    .line 1399
    :cond_5
    const v0, 0x11170

    if-ge p0, v0, :cond_6

    .line 1400
    sget-object v0, Lo/cmk$b;->i:Lo/cmk$b;

    return-object v0

    .line 1401
    :cond_6
    const v0, 0x13880

    if-ge p0, v0, :cond_7

    .line 1402
    sget-object v0, Lo/cmk$b;->k:Lo/cmk$b;

    return-object v0

    .line 1403
    :cond_7
    const v0, 0x15f90

    if-ge p0, v0, :cond_8

    .line 1404
    sget-object v0, Lo/cmk$b;->f:Lo/cmk$b;

    return-object v0

    .line 1405
    :cond_8
    const v0, 0x186a0

    if-ge p0, v0, :cond_9

    .line 1406
    sget-object v0, Lo/cmk$b;->h:Lo/cmk$b;

    return-object v0

    .line 1409
    :cond_9
    sget-object v0, Lo/cmk$b;->g:Lo/cmk$b;

    return-object v0
.end method

.method public static e(I)[I
    .locals 1

    .line 1380
    sget-object v0, Lo/cmk;->a:Landroid/util/SparseArray;

    invoke-virtual {v0, p0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [I

    return-object v0
.end method
