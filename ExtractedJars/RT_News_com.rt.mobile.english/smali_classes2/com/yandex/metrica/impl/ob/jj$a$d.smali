.class public final Lcom/yandex/metrica/impl/ob/jj$a$d;
.super Lcom/yandex/metrica/impl/ob/e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/yandex/metrica/impl/ob/jj$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/yandex/metrica/impl/ob/jj$a$d$a;
    }
.end annotation


# static fields
.field private static volatile h:[Lcom/yandex/metrica/impl/ob/jj$a$d;


# instance fields
.field public b:Ljava/lang/String;

.field public c:Ljava/lang/String;

.field public d:Ljava/lang/String;

.field public e:[Lcom/yandex/metrica/impl/ob/jj$a$d$a;

.field public f:J

.field public g:[I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 778
    invoke-direct {p0}, Lcom/yandex/metrica/impl/ob/e;-><init>()V

    .line 779
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/jj$a$d;->e()Lcom/yandex/metrica/impl/ob/jj$a$d;

    return-void
.end method

.method public static d()[Lcom/yandex/metrica/impl/ob/jj$a$d;
    .locals 2

    .line 749
    sget-object v0, Lcom/yandex/metrica/impl/ob/jj$a$d;->h:[Lcom/yandex/metrica/impl/ob/jj$a$d;

    if-nez v0, :cond_1

    .line 750
    sget-object v0, Lcom/yandex/metrica/impl/ob/c;->a:Ljava/lang/Object;

    monitor-enter v0

    .line 752
    :try_start_0
    sget-object v1, Lcom/yandex/metrica/impl/ob/jj$a$d;->h:[Lcom/yandex/metrica/impl/ob/jj$a$d;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    .line 753
    new-array v1, v1, [Lcom/yandex/metrica/impl/ob/jj$a$d;

    sput-object v1, Lcom/yandex/metrica/impl/ob/jj$a$d;->h:[Lcom/yandex/metrica/impl/ob/jj$a$d;

    .line 755
    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    .line 757
    :cond_1
    :goto_0
    sget-object v0, Lcom/yandex/metrica/impl/ob/jj$a$d;->h:[Lcom/yandex/metrica/impl/ob/jj$a$d;

    return-object v0
.end method


# virtual methods
.method public synthetic a(Lcom/yandex/metrica/impl/ob/a;)Lcom/yandex/metrica/impl/ob/e;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 648
    invoke-virtual {p0, p1}, Lcom/yandex/metrica/impl/ob/jj$a$d;->b(Lcom/yandex/metrica/impl/ob/a;)Lcom/yandex/metrica/impl/ob/jj$a$d;

    move-result-object p1

    return-object p1
.end method

.method public a(Lcom/yandex/metrica/impl/ob/b;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 796
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/jj$a$d;->b:Ljava/lang/String;

    const/4 v1, 0x1

    invoke-virtual {p1, v1, v0}, Lcom/yandex/metrica/impl/ob/b;->a(ILjava/lang/String;)V

    .line 797
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/jj$a$d;->c:Ljava/lang/String;

    const/4 v1, 0x2

    invoke-virtual {p1, v1, v0}, Lcom/yandex/metrica/impl/ob/b;->a(ILjava/lang/String;)V

    .line 798
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/jj$a$d;->d:Ljava/lang/String;

    const/4 v1, 0x3

    invoke-virtual {p1, v1, v0}, Lcom/yandex/metrica/impl/ob/b;->a(ILjava/lang/String;)V

    .line 799
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/jj$a$d;->e:[Lcom/yandex/metrica/impl/ob/jj$a$d$a;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/jj$a$d;->e:[Lcom/yandex/metrica/impl/ob/jj$a$d$a;

    array-length v0, v0

    if-lez v0, :cond_1

    move v0, v1

    .line 800
    :goto_0
    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/jj$a$d;->e:[Lcom/yandex/metrica/impl/ob/jj$a$d$a;

    array-length v2, v2

    if-ge v0, v2, :cond_1

    .line 801
    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/jj$a$d;->e:[Lcom/yandex/metrica/impl/ob/jj$a$d$a;

    aget-object v2, v2, v0

    if-eqz v2, :cond_0

    const/4 v3, 0x4

    .line 803
    invoke-virtual {p1, v3, v2}, Lcom/yandex/metrica/impl/ob/b;->a(ILcom/yandex/metrica/impl/ob/e;)V

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x5

    .line 807
    iget-wide v2, p0, Lcom/yandex/metrica/impl/ob/jj$a$d;->f:J

    invoke-virtual {p1, v0, v2, v3}, Lcom/yandex/metrica/impl/ob/b;->b(IJ)V

    .line 808
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/jj$a$d;->g:[I

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/jj$a$d;->g:[I

    array-length v0, v0

    if-lez v0, :cond_2

    .line 809
    :goto_1
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/jj$a$d;->g:[I

    array-length v0, v0

    if-ge v1, v0, :cond_2

    const/4 v0, 0x6

    .line 810
    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/jj$a$d;->g:[I

    aget v2, v2, v1

    invoke-virtual {p1, v0, v2}, Lcom/yandex/metrica/impl/ob/b;->a(II)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 813
    :cond_2
    invoke-super {p0, p1}, Lcom/yandex/metrica/impl/ob/e;->a(Lcom/yandex/metrica/impl/ob/b;)V

    return-void
.end method

.method public b(Lcom/yandex/metrica/impl/ob/a;)Lcom/yandex/metrica/impl/ob/jj$a$d;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 854
    :cond_0
    :goto_0
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/a;->a()I

    move-result v0

    if-eqz v0, :cond_15

    const/16 v1, 0xa

    if-eq v0, v1, :cond_14

    const/16 v1, 0x12

    if-eq v0, v1, :cond_13

    const/16 v1, 0x1a

    if-eq v0, v1, :cond_12

    const/16 v1, 0x22

    const/4 v2, 0x0

    if-eq v0, v1, :cond_e

    const/16 v1, 0x28

    if-eq v0, v1, :cond_d

    const/16 v1, 0x30

    if-eq v0, v1, :cond_7

    const/16 v1, 0x32

    if-eq v0, v1, :cond_1

    .line 859
    invoke-static {p1, v0}, Lcom/yandex/metrica/impl/ob/g;->a(Lcom/yandex/metrica/impl/ob/a;I)Z

    move-result v0

    if-nez v0, :cond_0

    return-object p0

    .line 933
    :cond_1
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/a;->m()I

    move-result v0

    .line 934
    invoke-virtual {p1, v0}, Lcom/yandex/metrica/impl/ob/a;->c(I)I

    move-result v0

    .line 937
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/a;->s()I

    move-result v1

    move v3, v2

    .line 938
    :goto_1
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/a;->q()I

    move-result v4

    if-lez v4, :cond_2

    .line 939
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/a;->g()I

    move-result v4

    packed-switch v4, :pswitch_data_0

    goto :goto_1

    :pswitch_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_2
    if-eqz v3, :cond_6

    .line 947
    invoke-virtual {p1, v1}, Lcom/yandex/metrica/impl/ob/a;->e(I)V

    .line 948
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/jj$a$d;->g:[I

    if-nez v1, :cond_3

    move v1, v2

    goto :goto_2

    :cond_3
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/jj$a$d;->g:[I

    array-length v1, v1

    :goto_2
    add-int/2addr v3, v1

    .line 949
    new-array v3, v3, [I

    if-eqz v1, :cond_4

    .line 951
    iget-object v4, p0, Lcom/yandex/metrica/impl/ob/jj$a$d;->g:[I

    invoke-static {v4, v2, v3, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 953
    :cond_4
    :goto_3
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/a;->q()I

    move-result v2

    if-lez v2, :cond_5

    .line 954
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/a;->g()I

    move-result v2

    packed-switch v2, :pswitch_data_1

    goto :goto_3

    :pswitch_1
    add-int/lit8 v4, v1, 0x1

    .line 958
    aput v2, v3, v1

    move v1, v4

    goto :goto_3

    .line 962
    :cond_5
    iput-object v3, p0, Lcom/yandex/metrica/impl/ob/jj$a$d;->g:[I

    .line 964
    :cond_6
    invoke-virtual {p1, v0}, Lcom/yandex/metrica/impl/ob/a;->d(I)V

    goto :goto_0

    .line 902
    :cond_7
    invoke-static {p1, v1}, Lcom/yandex/metrica/impl/ob/g;->b(Lcom/yandex/metrica/impl/ob/a;I)I

    move-result v0

    .line 903
    new-array v1, v0, [I

    move v3, v2

    move v4, v3

    :goto_4
    if-ge v3, v0, :cond_9

    if-eqz v3, :cond_8

    .line 907
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/a;->a()I

    .line 909
    :cond_8
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/a;->g()I

    move-result v5

    packed-switch v5, :pswitch_data_2

    goto :goto_5

    :pswitch_2
    add-int/lit8 v6, v4, 0x1

    .line 913
    aput v5, v1, v4

    move v4, v6

    :goto_5
    add-int/lit8 v3, v3, 0x1

    goto :goto_4

    :cond_9
    if-eqz v4, :cond_0

    .line 918
    iget-object v3, p0, Lcom/yandex/metrica/impl/ob/jj$a$d;->g:[I

    if-nez v3, :cond_a

    move v3, v2

    goto :goto_6

    :cond_a
    iget-object v3, p0, Lcom/yandex/metrica/impl/ob/jj$a$d;->g:[I

    array-length v3, v3

    :goto_6
    if-nez v3, :cond_b

    if-ne v4, v0, :cond_b

    .line 920
    iput-object v1, p0, Lcom/yandex/metrica/impl/ob/jj$a$d;->g:[I

    goto/16 :goto_0

    :cond_b
    add-int v0, v3, v4

    .line 922
    new-array v0, v0, [I

    if-eqz v3, :cond_c

    .line 924
    iget-object v5, p0, Lcom/yandex/metrica/impl/ob/jj$a$d;->g:[I

    invoke-static {v5, v2, v0, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 926
    :cond_c
    invoke-static {v1, v2, v0, v3, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 927
    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/jj$a$d;->g:[I

    goto/16 :goto_0

    .line 897
    :cond_d
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/a;->f()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/yandex/metrica/impl/ob/jj$a$d;->f:J

    goto/16 :goto_0

    .line 878
    :cond_e
    invoke-static {p1, v1}, Lcom/yandex/metrica/impl/ob/g;->b(Lcom/yandex/metrica/impl/ob/a;I)I

    move-result v0

    .line 879
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/jj$a$d;->e:[Lcom/yandex/metrica/impl/ob/jj$a$d$a;

    if-nez v1, :cond_f

    move v1, v2

    goto :goto_7

    :cond_f
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/jj$a$d;->e:[Lcom/yandex/metrica/impl/ob/jj$a$d$a;

    array-length v1, v1

    :goto_7
    add-int/2addr v0, v1

    .line 880
    new-array v0, v0, [Lcom/yandex/metrica/impl/ob/jj$a$d$a;

    if-eqz v1, :cond_10

    .line 883
    iget-object v3, p0, Lcom/yandex/metrica/impl/ob/jj$a$d;->e:[Lcom/yandex/metrica/impl/ob/jj$a$d$a;

    invoke-static {v3, v2, v0, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 885
    :cond_10
    :goto_8
    array-length v2, v0

    add-int/lit8 v2, v2, -0x1

    if-ge v1, v2, :cond_11

    .line 886
    new-instance v2, Lcom/yandex/metrica/impl/ob/jj$a$d$a;

    invoke-direct {v2}, Lcom/yandex/metrica/impl/ob/jj$a$d$a;-><init>()V

    aput-object v2, v0, v1

    .line 887
    aget-object v2, v0, v1

    invoke-virtual {p1, v2}, Lcom/yandex/metrica/impl/ob/a;->a(Lcom/yandex/metrica/impl/ob/e;)V

    .line 888
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/a;->a()I

    add-int/lit8 v1, v1, 0x1

    goto :goto_8

    .line 891
    :cond_11
    new-instance v2, Lcom/yandex/metrica/impl/ob/jj$a$d$a;

    invoke-direct {v2}, Lcom/yandex/metrica/impl/ob/jj$a$d$a;-><init>()V

    aput-object v2, v0, v1

    .line 892
    aget-object v1, v0, v1

    invoke-virtual {p1, v1}, Lcom/yandex/metrica/impl/ob/a;->a(Lcom/yandex/metrica/impl/ob/e;)V

    .line 893
    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/jj$a$d;->e:[Lcom/yandex/metrica/impl/ob/jj$a$d$a;

    goto/16 :goto_0

    .line 873
    :cond_12
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/a;->i()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/jj$a$d;->d:Ljava/lang/String;

    goto/16 :goto_0

    .line 869
    :cond_13
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/a;->i()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/jj$a$d;->c:Ljava/lang/String;

    goto/16 :goto_0

    .line 865
    :cond_14
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/a;->i()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/jj$a$d;->b:Ljava/lang/String;

    goto/16 :goto_0

    :cond_15
    return-object p0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_1
        :pswitch_1
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x1
        :pswitch_2
        :pswitch_2
    .end packed-switch
.end method

.method protected c()I
    .locals 6

    .line 818
    invoke-super {p0}, Lcom/yandex/metrica/impl/ob/e;->c()I

    move-result v0

    .line 819
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/jj$a$d;->b:Ljava/lang/String;

    const/4 v2, 0x1

    .line 820
    invoke-static {v2, v1}, Lcom/yandex/metrica/impl/ob/b;->b(ILjava/lang/String;)I

    move-result v1

    add-int/2addr v0, v1

    .line 821
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/jj$a$d;->c:Ljava/lang/String;

    const/4 v3, 0x2

    .line 822
    invoke-static {v3, v1}, Lcom/yandex/metrica/impl/ob/b;->b(ILjava/lang/String;)I

    move-result v1

    add-int/2addr v0, v1

    .line 823
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/jj$a$d;->d:Ljava/lang/String;

    const/4 v3, 0x3

    .line 824
    invoke-static {v3, v1}, Lcom/yandex/metrica/impl/ob/b;->b(ILjava/lang/String;)I

    move-result v1

    add-int/2addr v0, v1

    .line 825
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/jj$a$d;->e:[Lcom/yandex/metrica/impl/ob/jj$a$d$a;

    const/4 v3, 0x0

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/jj$a$d;->e:[Lcom/yandex/metrica/impl/ob/jj$a$d$a;

    array-length v1, v1

    if-lez v1, :cond_2

    move v1, v0

    move v0, v3

    .line 826
    :goto_0
    iget-object v4, p0, Lcom/yandex/metrica/impl/ob/jj$a$d;->e:[Lcom/yandex/metrica/impl/ob/jj$a$d$a;

    array-length v4, v4

    if-ge v0, v4, :cond_1

    .line 827
    iget-object v4, p0, Lcom/yandex/metrica/impl/ob/jj$a$d;->e:[Lcom/yandex/metrica/impl/ob/jj$a$d$a;

    aget-object v4, v4, v0

    if-eqz v4, :cond_0

    const/4 v5, 0x4

    .line 830
    invoke-static {v5, v4}, Lcom/yandex/metrica/impl/ob/b;->b(ILcom/yandex/metrica/impl/ob/e;)I

    move-result v4

    add-int/2addr v1, v4

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    move v0, v1

    :cond_2
    const/4 v1, 0x5

    .line 834
    iget-wide v4, p0, Lcom/yandex/metrica/impl/ob/jj$a$d;->f:J

    .line 835
    invoke-static {v1, v4, v5}, Lcom/yandex/metrica/impl/ob/b;->d(IJ)I

    move-result v1

    add-int/2addr v0, v1

    .line 836
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/jj$a$d;->g:[I

    if-eqz v1, :cond_4

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/jj$a$d;->g:[I

    array-length v1, v1

    if-lez v1, :cond_4

    move v1, v3

    .line 838
    :goto_1
    iget-object v4, p0, Lcom/yandex/metrica/impl/ob/jj$a$d;->g:[I

    array-length v4, v4

    if-ge v3, v4, :cond_3

    .line 839
    iget-object v4, p0, Lcom/yandex/metrica/impl/ob/jj$a$d;->g:[I

    aget v4, v4, v3

    .line 841
    invoke-static {v4}, Lcom/yandex/metrica/impl/ob/b;->g(I)I

    move-result v4

    add-int/2addr v1, v4

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_3
    add-int/2addr v0, v1

    .line 844
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/jj$a$d;->g:[I

    array-length v1, v1

    mul-int/2addr v2, v1

    add-int/2addr v0, v2

    :cond_4
    return v0
.end method

.method public e()Lcom/yandex/metrica/impl/ob/jj$a$d;
    .locals 2

    const-string v0, ""

    .line 783
    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/jj$a$d;->b:Ljava/lang/String;

    const-string v0, ""

    .line 784
    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/jj$a$d;->c:Ljava/lang/String;

    const-string v0, ""

    .line 785
    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/jj$a$d;->d:Ljava/lang/String;

    .line 786
    invoke-static {}, Lcom/yandex/metrica/impl/ob/jj$a$d$a;->d()[Lcom/yandex/metrica/impl/ob/jj$a$d$a;

    move-result-object v0

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/jj$a$d;->e:[Lcom/yandex/metrica/impl/ob/jj$a$d$a;

    const-wide/16 v0, 0x0

    .line 787
    iput-wide v0, p0, Lcom/yandex/metrica/impl/ob/jj$a$d;->f:J

    .line 788
    sget-object v0, Lcom/yandex/metrica/impl/ob/g;->a:[I

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/jj$a$d;->g:[I

    const/4 v0, -0x1

    .line 789
    iput v0, p0, Lcom/yandex/metrica/impl/ob/jj$a$d;->a:I

    return-object p0
.end method
