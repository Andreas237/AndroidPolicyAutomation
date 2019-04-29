.class public final Lcom/yandex/metrica/impl/ob/eq;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/yandex/metrica/impl/ob/eq$d;,
        Lcom/yandex/metrica/impl/ob/eq$c;,
        Lcom/yandex/metrica/impl/ob/eq$h;,
        Lcom/yandex/metrica/impl/ob/eq$g;,
        Lcom/yandex/metrica/impl/ob/eq$f;,
        Lcom/yandex/metrica/impl/ob/eq$e;,
        Lcom/yandex/metrica/impl/ob/eq$ab;,
        Lcom/yandex/metrica/impl/ob/eq$aa;,
        Lcom/yandex/metrica/impl/ob/eq$z;,
        Lcom/yandex/metrica/impl/ob/eq$x;,
        Lcom/yandex/metrica/impl/ob/eq$w;,
        Lcom/yandex/metrica/impl/ob/eq$v;,
        Lcom/yandex/metrica/impl/ob/eq$u;,
        Lcom/yandex/metrica/impl/ob/eq$t;,
        Lcom/yandex/metrica/impl/ob/eq$m;,
        Lcom/yandex/metrica/impl/ob/eq$p;,
        Lcom/yandex/metrica/impl/ob/eq$o;,
        Lcom/yandex/metrica/impl/ob/eq$n;,
        Lcom/yandex/metrica/impl/ob/eq$l;,
        Lcom/yandex/metrica/impl/ob/eq$k;,
        Lcom/yandex/metrica/impl/ob/eq$j;,
        Lcom/yandex/metrica/impl/ob/eq$i;,
        Lcom/yandex/metrica/impl/ob/eq$s;,
        Lcom/yandex/metrica/impl/ob/eq$r;,
        Lcom/yandex/metrica/impl/ob/eq$ac;,
        Lcom/yandex/metrica/impl/ob/eq$y;,
        Lcom/yandex/metrica/impl/ob/eq$q;,
        Lcom/yandex/metrica/impl/ob/eq$ad;,
        Lcom/yandex/metrica/impl/ob/eq$a;,
        Lcom/yandex/metrica/impl/ob/eq$ai;,
        Lcom/yandex/metrica/impl/ob/eq$ae;,
        Lcom/yandex/metrica/impl/ob/eq$af;,
        Lcom/yandex/metrica/impl/ob/eq$b;,
        Lcom/yandex/metrica/impl/ob/eq$ah;,
        Lcom/yandex/metrica/impl/ob/eq$ag;
    }
.end annotation


# static fields
.field public static final a:Ljava/lang/Boolean;

.field public static final b:I

.field static final c:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Lcom/yandex/metrica/impl/ob/eq$q;",
            ">;"
        }
    .end annotation
.end field

.field static final d:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Lcom/yandex/metrica/impl/ob/eq$q;",
            ">;"
        }
    .end annotation
.end field

.field static final e:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "[",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 9

    const/4 v0, 0x0

    .line 50
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    sput-object v1, Lcom/yandex/metrica/impl/ob/eq;->a:Ljava/lang/Boolean;

    .line 53
    invoke-static {}, Lcom/yandex/metrica/YandexMetrica;->getLibraryApiLevel()I

    move-result v1

    sput v1, Lcom/yandex/metrica/impl/ob/eq;->b:I

    .line 584
    new-instance v1, Landroid/util/SparseArray;

    invoke-direct {v1}, Landroid/util/SparseArray;-><init>()V

    .line 585
    sput-object v1, Lcom/yandex/metrica/impl/ob/eq;->c:Landroid/util/SparseArray;

    new-instance v2, Lcom/yandex/metrica/impl/ob/eq$y;

    invoke-direct {v2, v0}, Lcom/yandex/metrica/impl/ob/eq$y;-><init>(B)V

    const/4 v3, 0x6

    invoke-virtual {v1, v3, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 586
    sget-object v1, Lcom/yandex/metrica/impl/ob/eq;->c:Landroid/util/SparseArray;

    new-instance v2, Lcom/yandex/metrica/impl/ob/eq$ac;

    invoke-direct {v2, v0}, Lcom/yandex/metrica/impl/ob/eq$ac;-><init>(B)V

    const/4 v3, 0x7

    invoke-virtual {v1, v3, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 587
    sget-object v1, Lcom/yandex/metrica/impl/ob/eq;->c:Landroid/util/SparseArray;

    new-instance v2, Lcom/yandex/metrica/impl/ob/eq$r;

    invoke-direct {v2, v0}, Lcom/yandex/metrica/impl/ob/eq$r;-><init>(B)V

    const/16 v3, 0xe

    invoke-virtual {v1, v3, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 588
    sget-object v1, Lcom/yandex/metrica/impl/ob/eq;->c:Landroid/util/SparseArray;

    new-instance v2, Lcom/yandex/metrica/impl/ob/eq$s;

    invoke-direct {v2, v0}, Lcom/yandex/metrica/impl/ob/eq$s;-><init>(B)V

    const/16 v3, 0x1d

    invoke-virtual {v1, v3, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 589
    sget-object v1, Lcom/yandex/metrica/impl/ob/eq;->c:Landroid/util/SparseArray;

    new-instance v2, Lcom/yandex/metrica/impl/ob/eq$t;

    invoke-direct {v2, v0}, Lcom/yandex/metrica/impl/ob/eq$t;-><init>(B)V

    const/16 v4, 0x25

    invoke-virtual {v1, v4, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 590
    sget-object v1, Lcom/yandex/metrica/impl/ob/eq;->c:Landroid/util/SparseArray;

    new-instance v2, Lcom/yandex/metrica/impl/ob/eq$u;

    invoke-direct {v2, v0}, Lcom/yandex/metrica/impl/ob/eq$u;-><init>(B)V

    const/16 v4, 0x27

    invoke-virtual {v1, v4, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 591
    sget-object v1, Lcom/yandex/metrica/impl/ob/eq;->c:Landroid/util/SparseArray;

    new-instance v2, Lcom/yandex/metrica/impl/ob/eq$v;

    invoke-direct {v2, v0}, Lcom/yandex/metrica/impl/ob/eq$v;-><init>(B)V

    const/16 v4, 0x2d

    invoke-virtual {v1, v4, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 592
    sget-object v1, Lcom/yandex/metrica/impl/ob/eq;->c:Landroid/util/SparseArray;

    new-instance v2, Lcom/yandex/metrica/impl/ob/eq$w;

    invoke-direct {v2, v0}, Lcom/yandex/metrica/impl/ob/eq$w;-><init>(B)V

    const/16 v4, 0x2f

    invoke-virtual {v1, v4, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 593
    sget-object v1, Lcom/yandex/metrica/impl/ob/eq;->c:Landroid/util/SparseArray;

    new-instance v2, Lcom/yandex/metrica/impl/ob/eq$x;

    invoke-direct {v2, v0}, Lcom/yandex/metrica/impl/ob/eq$x;-><init>(B)V

    const/16 v5, 0x32

    invoke-virtual {v1, v5, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 594
    sget-object v1, Lcom/yandex/metrica/impl/ob/eq;->c:Landroid/util/SparseArray;

    new-instance v2, Lcom/yandex/metrica/impl/ob/eq$z;

    invoke-direct {v2, v0}, Lcom/yandex/metrica/impl/ob/eq$z;-><init>(B)V

    const/16 v6, 0x3c

    invoke-virtual {v1, v6, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 595
    sget-object v1, Lcom/yandex/metrica/impl/ob/eq;->c:Landroid/util/SparseArray;

    new-instance v2, Lcom/yandex/metrica/impl/ob/eq$aa;

    invoke-direct {v2, v0}, Lcom/yandex/metrica/impl/ob/eq$aa;-><init>(B)V

    const/16 v7, 0x42

    invoke-virtual {v1, v7, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 597
    sget-object v1, Lcom/yandex/metrica/impl/ob/eq;->c:Landroid/util/SparseArray;

    new-instance v2, Lcom/yandex/metrica/impl/ob/eq$ab;

    invoke-direct {v2, v0}, Lcom/yandex/metrica/impl/ob/eq$ab;-><init>(B)V

    const/16 v7, 0x43

    invoke-virtual {v1, v7, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 600
    new-instance v1, Landroid/util/SparseArray;

    invoke-direct {v1}, Landroid/util/SparseArray;-><init>()V

    .line 601
    sput-object v1, Lcom/yandex/metrica/impl/ob/eq;->d:Landroid/util/SparseArray;

    new-instance v2, Lcom/yandex/metrica/impl/ob/eq$i;

    invoke-direct {v2, v0}, Lcom/yandex/metrica/impl/ob/eq$i;-><init>(B)V

    const/16 v8, 0xc

    invoke-virtual {v1, v8, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 602
    sget-object v1, Lcom/yandex/metrica/impl/ob/eq;->d:Landroid/util/SparseArray;

    new-instance v2, Lcom/yandex/metrica/impl/ob/eq$j;

    invoke-direct {v2, v0}, Lcom/yandex/metrica/impl/ob/eq$j;-><init>(B)V

    invoke-virtual {v1, v3, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 603
    sget-object v1, Lcom/yandex/metrica/impl/ob/eq;->d:Landroid/util/SparseArray;

    new-instance v2, Lcom/yandex/metrica/impl/ob/eq$k;

    invoke-direct {v2, v0}, Lcom/yandex/metrica/impl/ob/eq$k;-><init>(B)V

    invoke-virtual {v1, v4, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 604
    sget-object v1, Lcom/yandex/metrica/impl/ob/eq;->d:Landroid/util/SparseArray;

    new-instance v2, Lcom/yandex/metrica/impl/ob/eq$l;

    invoke-direct {v2, v0}, Lcom/yandex/metrica/impl/ob/eq$l;-><init>(B)V

    invoke-virtual {v1, v5, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 605
    sget-object v1, Lcom/yandex/metrica/impl/ob/eq;->d:Landroid/util/SparseArray;

    new-instance v2, Lcom/yandex/metrica/impl/ob/eq$m;

    invoke-direct {v2, v0}, Lcom/yandex/metrica/impl/ob/eq$m;-><init>(B)V

    const/16 v3, 0x37

    invoke-virtual {v1, v3, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 606
    sget-object v1, Lcom/yandex/metrica/impl/ob/eq;->d:Landroid/util/SparseArray;

    new-instance v2, Lcom/yandex/metrica/impl/ob/eq$n;

    invoke-direct {v2, v0}, Lcom/yandex/metrica/impl/ob/eq$n;-><init>(B)V

    invoke-virtual {v1, v6, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 607
    sget-object v1, Lcom/yandex/metrica/impl/ob/eq;->d:Landroid/util/SparseArray;

    new-instance v2, Lcom/yandex/metrica/impl/ob/eq$o;

    invoke-direct {v2, v0}, Lcom/yandex/metrica/impl/ob/eq$o;-><init>(B)V

    const/16 v3, 0x3f

    invoke-virtual {v1, v3, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 609
    sget-object v1, Lcom/yandex/metrica/impl/ob/eq;->d:Landroid/util/SparseArray;

    new-instance v2, Lcom/yandex/metrica/impl/ob/eq$p;

    invoke-direct {v2, v0}, Lcom/yandex/metrica/impl/ob/eq$p;-><init>(B)V

    invoke-virtual {v1, v7, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 611
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 612
    sput-object v0, Lcom/yandex/metrica/impl/ob/eq;->e:Ljava/util/HashMap;

    const-string v1, "reports"

    sget-object v2, Lcom/yandex/metrica/impl/ob/eq$ag;->a:[Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 613
    sget-object v0, Lcom/yandex/metrica/impl/ob/eq;->e:Ljava/util/HashMap;

    const-string v1, "sessions"

    sget-object v2, Lcom/yandex/metrica/impl/ob/eq$ah;->a:[Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 614
    sget-object v0, Lcom/yandex/metrica/impl/ob/eq;->e:Ljava/util/HashMap;

    const-string v1, "preferences"

    sget-object v2, Lcom/yandex/metrica/impl/ob/eq$af;->a:[Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 615
    sget-object v0, Lcom/yandex/metrica/impl/ob/eq;->e:Ljava/util/HashMap;

    const-string v1, "binary_data"

    sget-object v2, Lcom/yandex/metrica/impl/ob/eq$b;->a:[Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static a()Lcom/yandex/metrica/impl/ob/ez;
    .locals 6

    .line 619
    new-instance v0, Lcom/yandex/metrica/impl/ob/ez;

    new-instance v1, Lcom/yandex/metrica/impl/ob/eq$e;

    invoke-direct {v1}, Lcom/yandex/metrica/impl/ob/eq$e;-><init>()V

    new-instance v2, Lcom/yandex/metrica/impl/ob/eq$f;

    invoke-direct {v2}, Lcom/yandex/metrica/impl/ob/eq$f;-><init>()V

    sget-object v3, Lcom/yandex/metrica/impl/ob/eq;->c:Landroid/util/SparseArray;

    new-instance v4, Lcom/yandex/metrica/impl/ob/fb;

    sget-object v5, Lcom/yandex/metrica/impl/ob/eq;->e:Ljava/util/HashMap;

    invoke-direct {v4, v5}, Lcom/yandex/metrica/impl/ob/fb;-><init>(Ljava/util/HashMap;)V

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/yandex/metrica/impl/ob/ez;-><init>(Lcom/yandex/metrica/impl/ob/eq$q;Lcom/yandex/metrica/impl/ob/eq$q;Landroid/util/SparseArray;Lcom/yandex/metrica/impl/ob/fa;)V

    return-object v0
.end method

.method public static b()Lcom/yandex/metrica/impl/ob/ez;
    .locals 6

    .line 629
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "preferences"

    .line 630
    sget-object v2, Lcom/yandex/metrica/impl/ob/eq$af;->a:[Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "binary_data"

    .line 631
    sget-object v2, Lcom/yandex/metrica/impl/ob/eq$b;->a:[Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "startup"

    .line 632
    sget-object v2, Lcom/yandex/metrica/impl/ob/eq$ai;->a:[Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "l_dat"

    .line 633
    sget-object v2, Lcom/yandex/metrica/impl/ob/eq$a;->a:[Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "lbs_dat"

    .line 634
    sget-object v2, Lcom/yandex/metrica/impl/ob/eq$a;->a:[Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "permissions"

    .line 635
    sget-object v2, Lcom/yandex/metrica/impl/ob/eq$ae;->a:[Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 637
    new-instance v1, Lcom/yandex/metrica/impl/ob/ez;

    new-instance v2, Lcom/yandex/metrica/impl/ob/eq$g;

    invoke-direct {v2}, Lcom/yandex/metrica/impl/ob/eq$g;-><init>()V

    new-instance v3, Lcom/yandex/metrica/impl/ob/eq$h;

    invoke-direct {v3}, Lcom/yandex/metrica/impl/ob/eq$h;-><init>()V

    sget-object v4, Lcom/yandex/metrica/impl/ob/eq;->d:Landroid/util/SparseArray;

    new-instance v5, Lcom/yandex/metrica/impl/ob/fb;

    invoke-direct {v5, v0}, Lcom/yandex/metrica/impl/ob/fb;-><init>(Ljava/util/HashMap;)V

    invoke-direct {v1, v2, v3, v4, v5}, Lcom/yandex/metrica/impl/ob/ez;-><init>(Lcom/yandex/metrica/impl/ob/eq$q;Lcom/yandex/metrica/impl/ob/eq$q;Landroid/util/SparseArray;Lcom/yandex/metrica/impl/ob/fa;)V

    return-object v1
.end method

.method public static c()Lcom/yandex/metrica/impl/ob/ez;
    .locals 6

    .line 647
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "preferences"

    .line 648
    sget-object v2, Lcom/yandex/metrica/impl/ob/eq$af;->a:[Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 650
    new-instance v1, Lcom/yandex/metrica/impl/ob/ez;

    new-instance v2, Lcom/yandex/metrica/impl/ob/eq$c;

    const/4 v3, 0x0

    invoke-direct {v2, v3}, Lcom/yandex/metrica/impl/ob/eq$c;-><init>(B)V

    new-instance v4, Lcom/yandex/metrica/impl/ob/eq$d;

    invoke-direct {v4, v3}, Lcom/yandex/metrica/impl/ob/eq$d;-><init>(B)V

    new-instance v3, Landroid/util/SparseArray;

    invoke-direct {v3}, Landroid/util/SparseArray;-><init>()V

    new-instance v5, Lcom/yandex/metrica/impl/ob/fb;

    invoke-direct {v5, v0}, Lcom/yandex/metrica/impl/ob/fb;-><init>(Ljava/util/HashMap;)V

    invoke-direct {v1, v2, v4, v3, v5}, Lcom/yandex/metrica/impl/ob/ez;-><init>(Lcom/yandex/metrica/impl/ob/eq$q;Lcom/yandex/metrica/impl/ob/eq$q;Landroid/util/SparseArray;Lcom/yandex/metrica/impl/ob/fa;)V

    return-object v1
.end method
