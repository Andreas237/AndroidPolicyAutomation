.class public final Lcom/yandex/metrica/impl/bi;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/yandex/metrica/impl/bi$a;
    }
.end annotation


# static fields
.field public static final a:Lcom/yandex/metrica/impl/bi$a;

.field static final b:Landroid/util/SparseArray;
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Lcom/yandex/metrica/impl/bi$a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 31
    new-instance v0, Lcom/yandex/metrica/impl/bi$a;

    .line 32
    invoke-static {}, Lcom/yandex/metrica/impl/bj;->a()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/yandex/metrica/impl/bi$a;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/yandex/metrica/impl/bi;->a:Lcom/yandex/metrica/impl/bi$a;

    .line 40
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    .line 41
    sput-object v0, Lcom/yandex/metrica/impl/bi;->b:Landroid/util/SparseArray;

    new-instance v1, Lcom/yandex/metrica/impl/bi$a;

    const-string v2, "1.00"

    invoke-direct {v1, v2}, Lcom/yandex/metrica/impl/bi$a;-><init>(Ljava/lang/String;)V

    const/4 v2, 0x1

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 42
    sget-object v0, Lcom/yandex/metrica/impl/bi;->b:Landroid/util/SparseArray;

    new-instance v1, Lcom/yandex/metrica/impl/bi$a;

    const-string v2, "1.10"

    invoke-direct {v1, v2}, Lcom/yandex/metrica/impl/bi$a;-><init>(Ljava/lang/String;)V

    const/4 v2, 0x2

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 43
    sget-object v0, Lcom/yandex/metrica/impl/bi;->b:Landroid/util/SparseArray;

    new-instance v1, Lcom/yandex/metrica/impl/bi$a;

    const-string v2, "1.11"

    invoke-direct {v1, v2}, Lcom/yandex/metrica/impl/bi$a;-><init>(Ljava/lang/String;)V

    const/4 v2, 0x3

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 44
    sget-object v0, Lcom/yandex/metrica/impl/bi;->b:Landroid/util/SparseArray;

    new-instance v1, Lcom/yandex/metrica/impl/bi$a;

    const-string v2, "1.20"

    invoke-direct {v1, v2}, Lcom/yandex/metrica/impl/bi$a;-><init>(Ljava/lang/String;)V

    const/4 v2, 0x4

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 45
    sget-object v0, Lcom/yandex/metrica/impl/bi;->b:Landroid/util/SparseArray;

    new-instance v1, Lcom/yandex/metrica/impl/bi$a;

    const-string v2, "1.21"

    invoke-direct {v1, v2}, Lcom/yandex/metrica/impl/bi$a;-><init>(Ljava/lang/String;)V

    const/4 v2, 0x5

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 46
    sget-object v0, Lcom/yandex/metrica/impl/bi;->b:Landroid/util/SparseArray;

    new-instance v1, Lcom/yandex/metrica/impl/bi$a;

    const-string v2, "1.22"

    invoke-direct {v1, v2}, Lcom/yandex/metrica/impl/bi$a;-><init>(Ljava/lang/String;)V

    const/4 v2, 0x6

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 47
    sget-object v0, Lcom/yandex/metrica/impl/bi;->b:Landroid/util/SparseArray;

    new-instance v1, Lcom/yandex/metrica/impl/bi$a;

    const-string v2, "1.23"

    invoke-direct {v1, v2}, Lcom/yandex/metrica/impl/bi$a;-><init>(Ljava/lang/String;)V

    const/4 v2, 0x7

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 48
    sget-object v0, Lcom/yandex/metrica/impl/bi;->b:Landroid/util/SparseArray;

    new-instance v1, Lcom/yandex/metrica/impl/bi$a;

    const-string v2, "1.24"

    invoke-direct {v1, v2}, Lcom/yandex/metrica/impl/bi$a;-><init>(Ljava/lang/String;)V

    const/16 v2, 0x8

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 49
    sget-object v0, Lcom/yandex/metrica/impl/bi;->b:Landroid/util/SparseArray;

    new-instance v1, Lcom/yandex/metrica/impl/bi$a;

    const-string v2, "1.26"

    invoke-direct {v1, v2}, Lcom/yandex/metrica/impl/bi$a;-><init>(Ljava/lang/String;)V

    const/16 v2, 0x9

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 50
    sget-object v0, Lcom/yandex/metrica/impl/bi;->b:Landroid/util/SparseArray;

    new-instance v1, Lcom/yandex/metrica/impl/bi$a;

    const-string v2, "1.27"

    invoke-direct {v1, v2}, Lcom/yandex/metrica/impl/bi$a;-><init>(Ljava/lang/String;)V

    const/16 v2, 0xa

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 51
    sget-object v0, Lcom/yandex/metrica/impl/bi;->b:Landroid/util/SparseArray;

    new-instance v1, Lcom/yandex/metrica/impl/bi$a;

    const-string v2, "1.40"

    invoke-direct {v1, v2}, Lcom/yandex/metrica/impl/bi$a;-><init>(Ljava/lang/String;)V

    const/16 v2, 0xb

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 52
    sget-object v0, Lcom/yandex/metrica/impl/bi;->b:Landroid/util/SparseArray;

    new-instance v1, Lcom/yandex/metrica/impl/bi$a;

    const-string v2, "1.41"

    invoke-direct {v1, v2}, Lcom/yandex/metrica/impl/bi$a;-><init>(Ljava/lang/String;)V

    const/16 v2, 0xc

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 53
    sget-object v0, Lcom/yandex/metrica/impl/bi;->b:Landroid/util/SparseArray;

    new-instance v1, Lcom/yandex/metrica/impl/bi$a;

    const-string v2, "1.42"

    invoke-direct {v1, v2}, Lcom/yandex/metrica/impl/bi$a;-><init>(Ljava/lang/String;)V

    const/16 v2, 0xd

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 54
    sget-object v0, Lcom/yandex/metrica/impl/bi;->b:Landroid/util/SparseArray;

    new-instance v1, Lcom/yandex/metrica/impl/bi$a;

    const-string v2, "1.50"

    invoke-direct {v1, v2}, Lcom/yandex/metrica/impl/bi$a;-><init>(Ljava/lang/String;)V

    const/16 v2, 0xe

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 55
    sget-object v0, Lcom/yandex/metrica/impl/bi;->b:Landroid/util/SparseArray;

    new-instance v1, Lcom/yandex/metrica/impl/bi$a;

    const-string v2, "1.51"

    invoke-direct {v1, v2}, Lcom/yandex/metrica/impl/bi$a;-><init>(Ljava/lang/String;)V

    const/16 v2, 0xf

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 56
    sget-object v0, Lcom/yandex/metrica/impl/bi;->b:Landroid/util/SparseArray;

    new-instance v1, Lcom/yandex/metrica/impl/bi$a;

    const-string v2, "1.60"

    invoke-direct {v1, v2}, Lcom/yandex/metrica/impl/bi$a;-><init>(Ljava/lang/String;)V

    const/16 v2, 0x10

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 57
    sget-object v0, Lcom/yandex/metrica/impl/bi;->b:Landroid/util/SparseArray;

    new-instance v1, Lcom/yandex/metrica/impl/bi$a;

    const-string v2, "1.61"

    invoke-direct {v1, v2}, Lcom/yandex/metrica/impl/bi$a;-><init>(Ljava/lang/String;)V

    const/16 v2, 0x11

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 58
    sget-object v0, Lcom/yandex/metrica/impl/bi;->b:Landroid/util/SparseArray;

    new-instance v1, Lcom/yandex/metrica/impl/bi$a;

    const-string v2, "1.62"

    invoke-direct {v1, v2}, Lcom/yandex/metrica/impl/bi$a;-><init>(Ljava/lang/String;)V

    const/16 v2, 0x12

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 59
    sget-object v0, Lcom/yandex/metrica/impl/bi;->b:Landroid/util/SparseArray;

    new-instance v1, Lcom/yandex/metrica/impl/bi$a;

    const-string v2, "1.63"

    invoke-direct {v1, v2}, Lcom/yandex/metrica/impl/bi$a;-><init>(Ljava/lang/String;)V

    const/16 v2, 0x13

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 60
    sget-object v0, Lcom/yandex/metrica/impl/bi;->b:Landroid/util/SparseArray;

    new-instance v1, Lcom/yandex/metrica/impl/bi$a;

    const-string v2, "1.64"

    invoke-direct {v1, v2}, Lcom/yandex/metrica/impl/bi$a;-><init>(Ljava/lang/String;)V

    const/16 v2, 0x14

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 61
    sget-object v0, Lcom/yandex/metrica/impl/bi;->b:Landroid/util/SparseArray;

    new-instance v1, Lcom/yandex/metrica/impl/bi$a;

    const-string v2, "1.65"

    invoke-direct {v1, v2}, Lcom/yandex/metrica/impl/bi$a;-><init>(Ljava/lang/String;)V

    const/16 v2, 0x15

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 62
    sget-object v0, Lcom/yandex/metrica/impl/bi;->b:Landroid/util/SparseArray;

    new-instance v1, Lcom/yandex/metrica/impl/bi$a;

    const-string v2, "1.66"

    invoke-direct {v1, v2}, Lcom/yandex/metrica/impl/bi$a;-><init>(Ljava/lang/String;)V

    const/16 v2, 0x16

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 63
    sget-object v0, Lcom/yandex/metrica/impl/bi;->b:Landroid/util/SparseArray;

    new-instance v1, Lcom/yandex/metrica/impl/bi$a;

    const-string v2, "1.67"

    invoke-direct {v1, v2}, Lcom/yandex/metrica/impl/bi$a;-><init>(Ljava/lang/String;)V

    const/16 v2, 0x17

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 64
    sget-object v0, Lcom/yandex/metrica/impl/bi;->b:Landroid/util/SparseArray;

    new-instance v1, Lcom/yandex/metrica/impl/bi$a;

    const-string v2, "1.68"

    invoke-direct {v1, v2}, Lcom/yandex/metrica/impl/bi$a;-><init>(Ljava/lang/String;)V

    const/16 v2, 0x18

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 65
    sget-object v0, Lcom/yandex/metrica/impl/bi;->b:Landroid/util/SparseArray;

    new-instance v1, Lcom/yandex/metrica/impl/bi$a;

    const-string v2, "1.69"

    invoke-direct {v1, v2}, Lcom/yandex/metrica/impl/bi$a;-><init>(Ljava/lang/String;)V

    const/16 v2, 0x19

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 66
    sget-object v0, Lcom/yandex/metrica/impl/bi;->b:Landroid/util/SparseArray;

    new-instance v1, Lcom/yandex/metrica/impl/bi$a;

    const-string v2, "1.70"

    invoke-direct {v1, v2}, Lcom/yandex/metrica/impl/bi$a;-><init>(Ljava/lang/String;)V

    const/16 v2, 0x1a

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 67
    sget-object v0, Lcom/yandex/metrica/impl/bi;->b:Landroid/util/SparseArray;

    new-instance v1, Lcom/yandex/metrica/impl/bi$a;

    const-string v2, "1.71"

    invoke-direct {v1, v2}, Lcom/yandex/metrica/impl/bi$a;-><init>(Ljava/lang/String;)V

    const/16 v2, 0x1b

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 68
    sget-object v0, Lcom/yandex/metrica/impl/bi;->b:Landroid/util/SparseArray;

    new-instance v1, Lcom/yandex/metrica/impl/bi$a;

    const-string v2, "1.72"

    invoke-direct {v1, v2}, Lcom/yandex/metrica/impl/bi$a;-><init>(Ljava/lang/String;)V

    const/16 v2, 0x1c

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 69
    sget-object v0, Lcom/yandex/metrica/impl/bi;->b:Landroid/util/SparseArray;

    new-instance v1, Lcom/yandex/metrica/impl/bi$a;

    const-string v2, "1.80"

    invoke-direct {v1, v2}, Lcom/yandex/metrica/impl/bi$a;-><init>(Ljava/lang/String;)V

    const/16 v2, 0x1d

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 70
    sget-object v0, Lcom/yandex/metrica/impl/bi;->b:Landroid/util/SparseArray;

    new-instance v1, Lcom/yandex/metrica/impl/bi$a;

    const-string v2, "1.81"

    invoke-direct {v1, v2}, Lcom/yandex/metrica/impl/bi$a;-><init>(Ljava/lang/String;)V

    const/16 v2, 0x1e

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 71
    sget-object v0, Lcom/yandex/metrica/impl/bi;->b:Landroid/util/SparseArray;

    new-instance v1, Lcom/yandex/metrica/impl/bi$a;

    const-string v2, "1.82"

    invoke-direct {v1, v2}, Lcom/yandex/metrica/impl/bi$a;-><init>(Ljava/lang/String;)V

    const/16 v2, 0x1f

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 72
    sget-object v0, Lcom/yandex/metrica/impl/bi;->b:Landroid/util/SparseArray;

    new-instance v1, Lcom/yandex/metrica/impl/bi$a;

    const-string v2, "2.00"

    invoke-direct {v1, v2}, Lcom/yandex/metrica/impl/bi$a;-><init>(Ljava/lang/String;)V

    const/16 v2, 0x20

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 73
    sget-object v0, Lcom/yandex/metrica/impl/bi;->b:Landroid/util/SparseArray;

    new-instance v1, Lcom/yandex/metrica/impl/bi$a;

    const-string v2, "2.10"

    invoke-direct {v1, v2}, Lcom/yandex/metrica/impl/bi$a;-><init>(Ljava/lang/String;)V

    const/16 v2, 0x21

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 74
    sget-object v0, Lcom/yandex/metrica/impl/bi;->b:Landroid/util/SparseArray;

    new-instance v1, Lcom/yandex/metrica/impl/bi$a;

    const-string v2, "2.11"

    invoke-direct {v1, v2}, Lcom/yandex/metrica/impl/bi$a;-><init>(Ljava/lang/String;)V

    const/16 v2, 0x22

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 75
    sget-object v0, Lcom/yandex/metrica/impl/bi;->b:Landroid/util/SparseArray;

    new-instance v1, Lcom/yandex/metrica/impl/bi$a;

    const-string v2, "2.20"

    invoke-direct {v1, v2}, Lcom/yandex/metrica/impl/bi$a;-><init>(Ljava/lang/String;)V

    const/16 v2, 0x23

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 76
    sget-object v0, Lcom/yandex/metrica/impl/bi;->b:Landroid/util/SparseArray;

    new-instance v1, Lcom/yandex/metrica/impl/bi$a;

    const-string v2, "2.21"

    invoke-direct {v1, v2}, Lcom/yandex/metrica/impl/bi$a;-><init>(Ljava/lang/String;)V

    const/16 v2, 0x24

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 77
    sget-object v0, Lcom/yandex/metrica/impl/bi;->b:Landroid/util/SparseArray;

    new-instance v1, Lcom/yandex/metrica/impl/bi$a;

    const-string v2, "2.22"

    invoke-direct {v1, v2}, Lcom/yandex/metrica/impl/bi$a;-><init>(Ljava/lang/String;)V

    const/16 v2, 0x25

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 78
    sget-object v0, Lcom/yandex/metrica/impl/bi;->b:Landroid/util/SparseArray;

    new-instance v1, Lcom/yandex/metrica/impl/bi$a;

    const-string v2, "2.23"

    invoke-direct {v1, v2}, Lcom/yandex/metrica/impl/bi$a;-><init>(Ljava/lang/String;)V

    const/16 v2, 0x26

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 79
    sget-object v0, Lcom/yandex/metrica/impl/bi;->b:Landroid/util/SparseArray;

    new-instance v1, Lcom/yandex/metrica/impl/bi$a;

    const-string v2, "2.30"

    invoke-direct {v1, v2}, Lcom/yandex/metrica/impl/bi$a;-><init>(Ljava/lang/String;)V

    const/16 v2, 0x27

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 80
    sget-object v0, Lcom/yandex/metrica/impl/bi;->b:Landroid/util/SparseArray;

    new-instance v1, Lcom/yandex/metrica/impl/bi$a;

    const-string v2, "2.31"

    invoke-direct {v1, v2}, Lcom/yandex/metrica/impl/bi$a;-><init>(Ljava/lang/String;)V

    const/16 v2, 0x28

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 81
    sget-object v0, Lcom/yandex/metrica/impl/bi;->b:Landroid/util/SparseArray;

    new-instance v1, Lcom/yandex/metrica/impl/bi$a;

    const-string v2, "2.32"

    invoke-direct {v1, v2}, Lcom/yandex/metrica/impl/bi$a;-><init>(Ljava/lang/String;)V

    const/16 v2, 0x29

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 82
    sget-object v0, Lcom/yandex/metrica/impl/bi;->b:Landroid/util/SparseArray;

    new-instance v1, Lcom/yandex/metrica/impl/bi$a;

    const-string v2, "2.33"

    invoke-direct {v1, v2}, Lcom/yandex/metrica/impl/bi$a;-><init>(Ljava/lang/String;)V

    const/16 v2, 0x2a

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 83
    sget-object v0, Lcom/yandex/metrica/impl/bi;->b:Landroid/util/SparseArray;

    new-instance v1, Lcom/yandex/metrica/impl/bi$a;

    const-string v2, "2.40"

    invoke-direct {v1, v2}, Lcom/yandex/metrica/impl/bi$a;-><init>(Ljava/lang/String;)V

    const/16 v2, 0x2b

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 84
    sget-object v0, Lcom/yandex/metrica/impl/bi;->b:Landroid/util/SparseArray;

    new-instance v1, Lcom/yandex/metrica/impl/bi$a;

    const-string v2, "2.41"

    invoke-direct {v1, v2}, Lcom/yandex/metrica/impl/bi$a;-><init>(Ljava/lang/String;)V

    const/16 v2, 0x2c

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 85
    sget-object v0, Lcom/yandex/metrica/impl/bi;->b:Landroid/util/SparseArray;

    new-instance v1, Lcom/yandex/metrica/impl/bi$a;

    const-string v2, "2.42"

    invoke-direct {v1, v2}, Lcom/yandex/metrica/impl/bi$a;-><init>(Ljava/lang/String;)V

    const/16 v2, 0x2d

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 86
    sget-object v0, Lcom/yandex/metrica/impl/bi;->b:Landroid/util/SparseArray;

    new-instance v1, Lcom/yandex/metrica/impl/bi$a;

    const-string v2, "2.43"

    invoke-direct {v1, v2}, Lcom/yandex/metrica/impl/bi$a;-><init>(Ljava/lang/String;)V

    const/16 v2, 0x2e

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 87
    sget-object v0, Lcom/yandex/metrica/impl/bi;->b:Landroid/util/SparseArray;

    new-instance v1, Lcom/yandex/metrica/impl/bi$a;

    const-string v2, "2.50"

    invoke-direct {v1, v2}, Lcom/yandex/metrica/impl/bi$a;-><init>(Ljava/lang/String;)V

    const/16 v2, 0x2f

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 88
    sget-object v0, Lcom/yandex/metrica/impl/bi;->b:Landroid/util/SparseArray;

    new-instance v1, Lcom/yandex/metrica/impl/bi$a;

    const-string v2, "2.51"

    invoke-direct {v1, v2}, Lcom/yandex/metrica/impl/bi$a;-><init>(Ljava/lang/String;)V

    const/16 v2, 0x30

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 89
    sget-object v0, Lcom/yandex/metrica/impl/bi;->b:Landroid/util/SparseArray;

    new-instance v1, Lcom/yandex/metrica/impl/bi$a;

    const-string v2, "2.52"

    invoke-direct {v1, v2}, Lcom/yandex/metrica/impl/bi$a;-><init>(Ljava/lang/String;)V

    const/16 v2, 0x31

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 90
    sget-object v0, Lcom/yandex/metrica/impl/bi;->b:Landroid/util/SparseArray;

    new-instance v1, Lcom/yandex/metrica/impl/bi$a;

    const-string v2, "2.60"

    invoke-direct {v1, v2}, Lcom/yandex/metrica/impl/bi$a;-><init>(Ljava/lang/String;)V

    const/16 v2, 0x32

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 91
    sget-object v0, Lcom/yandex/metrica/impl/bi;->b:Landroid/util/SparseArray;

    new-instance v1, Lcom/yandex/metrica/impl/bi$a;

    const-string v2, "2.61"

    invoke-direct {v1, v2}, Lcom/yandex/metrica/impl/bi$a;-><init>(Ljava/lang/String;)V

    const/16 v2, 0x33

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 92
    sget-object v0, Lcom/yandex/metrica/impl/bi;->b:Landroid/util/SparseArray;

    new-instance v1, Lcom/yandex/metrica/impl/bi$a;

    const-string v2, "2.62"

    invoke-direct {v1, v2}, Lcom/yandex/metrica/impl/bi$a;-><init>(Ljava/lang/String;)V

    const/16 v2, 0x34

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 93
    sget-object v0, Lcom/yandex/metrica/impl/bi;->b:Landroid/util/SparseArray;

    new-instance v1, Lcom/yandex/metrica/impl/bi$a;

    const-string v2, "2.63"

    invoke-direct {v1, v2}, Lcom/yandex/metrica/impl/bi$a;-><init>(Ljava/lang/String;)V

    const/16 v2, 0x35

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 94
    sget-object v0, Lcom/yandex/metrica/impl/bi;->b:Landroid/util/SparseArray;

    new-instance v1, Lcom/yandex/metrica/impl/bi$a;

    const-string v2, "2.64"

    invoke-direct {v1, v2}, Lcom/yandex/metrica/impl/bi$a;-><init>(Ljava/lang/String;)V

    const/16 v2, 0x36

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 95
    sget-object v0, Lcom/yandex/metrica/impl/bi;->b:Landroid/util/SparseArray;

    new-instance v1, Lcom/yandex/metrica/impl/bi$a;

    const-string v2, "2.70"

    invoke-direct {v1, v2}, Lcom/yandex/metrica/impl/bi$a;-><init>(Ljava/lang/String;)V

    const/16 v2, 0x37

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 96
    sget-object v0, Lcom/yandex/metrica/impl/bi;->b:Landroid/util/SparseArray;

    new-instance v1, Lcom/yandex/metrica/impl/bi$a;

    const-string v2, "2.71"

    invoke-direct {v1, v2}, Lcom/yandex/metrica/impl/bi$a;-><init>(Ljava/lang/String;)V

    const/16 v2, 0x38

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 97
    sget-object v0, Lcom/yandex/metrica/impl/bi;->b:Landroid/util/SparseArray;

    new-instance v1, Lcom/yandex/metrica/impl/bi$a;

    const-string v2, "2.72"

    invoke-direct {v1, v2}, Lcom/yandex/metrica/impl/bi$a;-><init>(Ljava/lang/String;)V

    const/16 v2, 0x39

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 98
    sget-object v0, Lcom/yandex/metrica/impl/bi;->b:Landroid/util/SparseArray;

    new-instance v1, Lcom/yandex/metrica/impl/bi$a;

    const-string v2, "2.73"

    invoke-direct {v1, v2}, Lcom/yandex/metrica/impl/bi$a;-><init>(Ljava/lang/String;)V

    const/16 v2, 0x3a

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 99
    sget-object v0, Lcom/yandex/metrica/impl/bi;->b:Landroid/util/SparseArray;

    new-instance v1, Lcom/yandex/metrica/impl/bi$a;

    const-string v2, "2.74"

    invoke-direct {v1, v2}, Lcom/yandex/metrica/impl/bi$a;-><init>(Ljava/lang/String;)V

    const/16 v2, 0x3b

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 100
    sget-object v0, Lcom/yandex/metrica/impl/bi;->b:Landroid/util/SparseArray;

    new-instance v1, Lcom/yandex/metrica/impl/bi$a;

    const-string v2, "2.75"

    invoke-direct {v1, v2}, Lcom/yandex/metrica/impl/bi$a;-><init>(Ljava/lang/String;)V

    const/16 v2, 0x3c

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 101
    sget-object v0, Lcom/yandex/metrica/impl/bi;->b:Landroid/util/SparseArray;

    new-instance v1, Lcom/yandex/metrica/impl/bi$a;

    const-string v2, "2.76"

    invoke-direct {v1, v2}, Lcom/yandex/metrica/impl/bi$a;-><init>(Ljava/lang/String;)V

    const/16 v2, 0x3d

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 102
    sget-object v0, Lcom/yandex/metrica/impl/bi;->b:Landroid/util/SparseArray;

    new-instance v1, Lcom/yandex/metrica/impl/bi$a;

    const-string v2, "2.77"

    invoke-direct {v1, v2}, Lcom/yandex/metrica/impl/bi$a;-><init>(Ljava/lang/String;)V

    const/16 v2, 0x3e

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 103
    sget-object v0, Lcom/yandex/metrica/impl/bi;->b:Landroid/util/SparseArray;

    new-instance v1, Lcom/yandex/metrica/impl/bi$a;

    const-string v2, "2.78"

    invoke-direct {v1, v2}, Lcom/yandex/metrica/impl/bi$a;-><init>(Ljava/lang/String;)V

    const/16 v2, 0x3f

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 104
    sget-object v0, Lcom/yandex/metrica/impl/bi;->b:Landroid/util/SparseArray;

    new-instance v1, Lcom/yandex/metrica/impl/bi$a;

    const-string v2, "2.80"

    invoke-direct {v1, v2}, Lcom/yandex/metrica/impl/bi$a;-><init>(Ljava/lang/String;)V

    const/16 v2, 0x40

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 105
    sget-object v0, Lcom/yandex/metrica/impl/bi;->b:Landroid/util/SparseArray;

    new-instance v1, Lcom/yandex/metrica/impl/bi$a;

    const-string v2, "2.81-RC1"

    invoke-direct {v1, v2}, Lcom/yandex/metrica/impl/bi$a;-><init>(Ljava/lang/String;)V

    const/16 v2, 0x41

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 106
    sget-object v0, Lcom/yandex/metrica/impl/bi;->b:Landroid/util/SparseArray;

    new-instance v1, Lcom/yandex/metrica/impl/bi$a;

    const-string v2, "3.0.0"

    invoke-direct {v1, v2}, Lcom/yandex/metrica/impl/bi$a;-><init>(Ljava/lang/String;)V

    const/16 v2, 0x42

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 107
    sget-object v0, Lcom/yandex/metrica/impl/bi;->b:Landroid/util/SparseArray;

    new-instance v1, Lcom/yandex/metrica/impl/bi$a;

    const-string v2, "3.1.0"

    invoke-direct {v1, v2}, Lcom/yandex/metrica/impl/bi$a;-><init>(Ljava/lang/String;)V

    const/16 v2, 0x43

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    return-void
.end method

.method static a(I)Lcom/yandex/metrica/impl/bi$a;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 112
    sget-object v0, Lcom/yandex/metrica/impl/bi;->b:Landroid/util/SparseArray;

    invoke-virtual {v0, p0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/yandex/metrica/impl/bi$a;

    return-object p0
.end method
