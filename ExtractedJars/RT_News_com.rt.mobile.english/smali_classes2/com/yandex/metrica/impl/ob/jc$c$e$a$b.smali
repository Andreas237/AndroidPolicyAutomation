.class public final Lcom/yandex/metrica/impl/ob/jc$c$e$a$b;
.super Lcom/yandex/metrica/impl/ob/e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/yandex/metrica/impl/ob/jc$c$e$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/yandex/metrica/impl/ob/jc$c$e$a$b$a;
    }
.end annotation


# instance fields
.field public b:[Lcom/yandex/metrica/impl/ob/jc$a;

.field public c:[Lcom/yandex/metrica/impl/ob/jc$d;

.field public d:I

.field public e:Ljava/lang/String;

.field public f:Lcom/yandex/metrica/impl/ob/jc$c$e$a$b$a;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 868
    invoke-direct {p0}, Lcom/yandex/metrica/impl/ob/e;-><init>()V

    .line 869
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/jc$c$e$a$b;->d()Lcom/yandex/metrica/impl/ob/jc$c$e$a$b;

    return-void
.end method


# virtual methods
.method public synthetic a(Lcom/yandex/metrica/impl/ob/a;)Lcom/yandex/metrica/impl/ob/e;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 729
    invoke-virtual {p0, p1}, Lcom/yandex/metrica/impl/ob/jc$c$e$a$b;->b(Lcom/yandex/metrica/impl/ob/a;)Lcom/yandex/metrica/impl/ob/jc$c$e$a$b;

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

    .line 885
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/jc$c$e$a$b;->b:[Lcom/yandex/metrica/impl/ob/jc$a;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/jc$c$e$a$b;->b:[Lcom/yandex/metrica/impl/ob/jc$a;

    array-length v0, v0

    if-lez v0, :cond_1

    move v0, v1

    .line 886
    :goto_0
    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/jc$c$e$a$b;->b:[Lcom/yandex/metrica/impl/ob/jc$a;

    array-length v2, v2

    if-ge v0, v2, :cond_1

    .line 887
    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/jc$c$e$a$b;->b:[Lcom/yandex/metrica/impl/ob/jc$a;

    aget-object v2, v2, v0

    if-eqz v2, :cond_0

    const/4 v3, 0x1

    .line 889
    invoke-virtual {p1, v3, v2}, Lcom/yandex/metrica/impl/ob/b;->a(ILcom/yandex/metrica/impl/ob/e;)V

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 893
    :cond_1
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/jc$c$e$a$b;->c:[Lcom/yandex/metrica/impl/ob/jc$d;

    const/4 v2, 0x2

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/jc$c$e$a$b;->c:[Lcom/yandex/metrica/impl/ob/jc$d;

    array-length v0, v0

    if-lez v0, :cond_3

    .line 894
    :goto_1
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/jc$c$e$a$b;->c:[Lcom/yandex/metrica/impl/ob/jc$d;

    array-length v0, v0

    if-ge v1, v0, :cond_3

    .line 895
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/jc$c$e$a$b;->c:[Lcom/yandex/metrica/impl/ob/jc$d;

    aget-object v0, v0, v1

    if-eqz v0, :cond_2

    .line 897
    invoke-virtual {p1, v2, v0}, Lcom/yandex/metrica/impl/ob/b;->a(ILcom/yandex/metrica/impl/ob/e;)V

    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 901
    :cond_3
    iget v0, p0, Lcom/yandex/metrica/impl/ob/jc$c$e$a$b;->d:I

    if-eq v0, v2, :cond_4

    const/4 v0, 0x3

    .line 902
    iget v1, p0, Lcom/yandex/metrica/impl/ob/jc$c$e$a$b;->d:I

    invoke-virtual {p1, v0, v1}, Lcom/yandex/metrica/impl/ob/b;->a(II)V

    .line 904
    :cond_4
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/jc$c$e$a$b;->e:Ljava/lang/String;

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    const/4 v0, 0x4

    .line 905
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/jc$c$e$a$b;->e:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Lcom/yandex/metrica/impl/ob/b;->a(ILjava/lang/String;)V

    .line 907
    :cond_5
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/jc$c$e$a$b;->f:Lcom/yandex/metrica/impl/ob/jc$c$e$a$b$a;

    if-eqz v0, :cond_6

    const/4 v0, 0x5

    .line 908
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/jc$c$e$a$b;->f:Lcom/yandex/metrica/impl/ob/jc$c$e$a$b$a;

    invoke-virtual {p1, v0, v1}, Lcom/yandex/metrica/impl/ob/b;->a(ILcom/yandex/metrica/impl/ob/e;)V

    .line 910
    :cond_6
    invoke-super {p0, p1}, Lcom/yandex/metrica/impl/ob/e;->a(Lcom/yandex/metrica/impl/ob/b;)V

    return-void
.end method

.method public b(Lcom/yandex/metrica/impl/ob/a;)Lcom/yandex/metrica/impl/ob/jc$c$e$a$b;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 954
    :cond_0
    :goto_0
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/a;->a()I

    move-result v0

    if-eqz v0, :cond_d

    const/16 v1, 0xa

    const/4 v2, 0x0

    if-eq v0, v1, :cond_9

    const/16 v1, 0x12

    if-eq v0, v1, :cond_5

    const/16 v1, 0x18

    if-eq v0, v1, :cond_4

    const/16 v1, 0x22

    if-eq v0, v1, :cond_3

    const/16 v1, 0x2a

    if-eq v0, v1, :cond_1

    .line 959
    invoke-static {p1, v0}, Lcom/yandex/metrica/impl/ob/g;->a(Lcom/yandex/metrica/impl/ob/a;I)Z

    move-result v0

    if-nez v0, :cond_0

    return-object p0

    .line 1020
    :cond_1
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/jc$c$e$a$b;->f:Lcom/yandex/metrica/impl/ob/jc$c$e$a$b$a;

    if-nez v0, :cond_2

    .line 1021
    new-instance v0, Lcom/yandex/metrica/impl/ob/jc$c$e$a$b$a;

    invoke-direct {v0}, Lcom/yandex/metrica/impl/ob/jc$c$e$a$b$a;-><init>()V

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/jc$c$e$a$b;->f:Lcom/yandex/metrica/impl/ob/jc$c$e$a$b$a;

    .line 1023
    :cond_2
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/jc$c$e$a$b;->f:Lcom/yandex/metrica/impl/ob/jc$c$e$a$b$a;

    invoke-virtual {p1, v0}, Lcom/yandex/metrica/impl/ob/a;->a(Lcom/yandex/metrica/impl/ob/e;)V

    goto :goto_0

    .line 1016
    :cond_3
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/a;->i()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/jc$c$e$a$b;->e:Ljava/lang/String;

    goto :goto_0

    .line 1005
    :cond_4
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/a;->g()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 1010
    :pswitch_0
    iput v0, p0, Lcom/yandex/metrica/impl/ob/jc$c$e$a$b;->d:I

    goto :goto_0

    .line 986
    :cond_5
    invoke-static {p1, v1}, Lcom/yandex/metrica/impl/ob/g;->b(Lcom/yandex/metrica/impl/ob/a;I)I

    move-result v0

    .line 987
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/jc$c$e$a$b;->c:[Lcom/yandex/metrica/impl/ob/jc$d;

    if-nez v1, :cond_6

    move v1, v2

    goto :goto_1

    :cond_6
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/jc$c$e$a$b;->c:[Lcom/yandex/metrica/impl/ob/jc$d;

    array-length v1, v1

    :goto_1
    add-int/2addr v0, v1

    .line 988
    new-array v0, v0, [Lcom/yandex/metrica/impl/ob/jc$d;

    if-eqz v1, :cond_7

    .line 991
    iget-object v3, p0, Lcom/yandex/metrica/impl/ob/jc$c$e$a$b;->c:[Lcom/yandex/metrica/impl/ob/jc$d;

    invoke-static {v3, v2, v0, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 993
    :cond_7
    :goto_2
    array-length v2, v0

    add-int/lit8 v2, v2, -0x1

    if-ge v1, v2, :cond_8

    .line 994
    new-instance v2, Lcom/yandex/metrica/impl/ob/jc$d;

    invoke-direct {v2}, Lcom/yandex/metrica/impl/ob/jc$d;-><init>()V

    aput-object v2, v0, v1

    .line 995
    aget-object v2, v0, v1

    invoke-virtual {p1, v2}, Lcom/yandex/metrica/impl/ob/a;->a(Lcom/yandex/metrica/impl/ob/e;)V

    .line 996
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/a;->a()I

    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    .line 999
    :cond_8
    new-instance v2, Lcom/yandex/metrica/impl/ob/jc$d;

    invoke-direct {v2}, Lcom/yandex/metrica/impl/ob/jc$d;-><init>()V

    aput-object v2, v0, v1

    .line 1000
    aget-object v1, v0, v1

    invoke-virtual {p1, v1}, Lcom/yandex/metrica/impl/ob/a;->a(Lcom/yandex/metrica/impl/ob/e;)V

    .line 1001
    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/jc$c$e$a$b;->c:[Lcom/yandex/metrica/impl/ob/jc$d;

    goto/16 :goto_0

    .line 966
    :cond_9
    invoke-static {p1, v1}, Lcom/yandex/metrica/impl/ob/g;->b(Lcom/yandex/metrica/impl/ob/a;I)I

    move-result v0

    .line 967
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/jc$c$e$a$b;->b:[Lcom/yandex/metrica/impl/ob/jc$a;

    if-nez v1, :cond_a

    move v1, v2

    goto :goto_3

    :cond_a
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/jc$c$e$a$b;->b:[Lcom/yandex/metrica/impl/ob/jc$a;

    array-length v1, v1

    :goto_3
    add-int/2addr v0, v1

    .line 968
    new-array v0, v0, [Lcom/yandex/metrica/impl/ob/jc$a;

    if-eqz v1, :cond_b

    .line 971
    iget-object v3, p0, Lcom/yandex/metrica/impl/ob/jc$c$e$a$b;->b:[Lcom/yandex/metrica/impl/ob/jc$a;

    invoke-static {v3, v2, v0, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 973
    :cond_b
    :goto_4
    array-length v2, v0

    add-int/lit8 v2, v2, -0x1

    if-ge v1, v2, :cond_c

    .line 974
    new-instance v2, Lcom/yandex/metrica/impl/ob/jc$a;

    invoke-direct {v2}, Lcom/yandex/metrica/impl/ob/jc$a;-><init>()V

    aput-object v2, v0, v1

    .line 975
    aget-object v2, v0, v1

    invoke-virtual {p1, v2}, Lcom/yandex/metrica/impl/ob/a;->a(Lcom/yandex/metrica/impl/ob/e;)V

    .line 976
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/a;->a()I

    add-int/lit8 v1, v1, 0x1

    goto :goto_4

    .line 979
    :cond_c
    new-instance v2, Lcom/yandex/metrica/impl/ob/jc$a;

    invoke-direct {v2}, Lcom/yandex/metrica/impl/ob/jc$a;-><init>()V

    aput-object v2, v0, v1

    .line 980
    aget-object v1, v0, v1

    invoke-virtual {p1, v1}, Lcom/yandex/metrica/impl/ob/a;->a(Lcom/yandex/metrica/impl/ob/e;)V

    .line 981
    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/jc$c$e$a$b;->b:[Lcom/yandex/metrica/impl/ob/jc$a;

    goto/16 :goto_0

    :cond_d
    return-object p0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method protected c()I
    .locals 5

    .line 915
    invoke-super {p0}, Lcom/yandex/metrica/impl/ob/e;->c()I

    move-result v0

    .line 916
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/jc$c$e$a$b;->b:[Lcom/yandex/metrica/impl/ob/jc$a;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/jc$c$e$a$b;->b:[Lcom/yandex/metrica/impl/ob/jc$a;

    array-length v1, v1

    if-lez v1, :cond_2

    move v1, v0

    move v0, v2

    .line 917
    :goto_0
    iget-object v3, p0, Lcom/yandex/metrica/impl/ob/jc$c$e$a$b;->b:[Lcom/yandex/metrica/impl/ob/jc$a;

    array-length v3, v3

    if-ge v0, v3, :cond_1

    .line 918
    iget-object v3, p0, Lcom/yandex/metrica/impl/ob/jc$c$e$a$b;->b:[Lcom/yandex/metrica/impl/ob/jc$a;

    aget-object v3, v3, v0

    if-eqz v3, :cond_0

    const/4 v4, 0x1

    .line 921
    invoke-static {v4, v3}, Lcom/yandex/metrica/impl/ob/b;->b(ILcom/yandex/metrica/impl/ob/e;)I

    move-result v3

    add-int/2addr v1, v3

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    move v0, v1

    .line 925
    :cond_2
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/jc$c$e$a$b;->c:[Lcom/yandex/metrica/impl/ob/jc$d;

    const/4 v3, 0x2

    if-eqz v1, :cond_4

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/jc$c$e$a$b;->c:[Lcom/yandex/metrica/impl/ob/jc$d;

    array-length v1, v1

    if-lez v1, :cond_4

    .line 926
    :goto_1
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/jc$c$e$a$b;->c:[Lcom/yandex/metrica/impl/ob/jc$d;

    array-length v1, v1

    if-ge v2, v1, :cond_4

    .line 927
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/jc$c$e$a$b;->c:[Lcom/yandex/metrica/impl/ob/jc$d;

    aget-object v1, v1, v2

    if-eqz v1, :cond_3

    .line 930
    invoke-static {v3, v1}, Lcom/yandex/metrica/impl/ob/b;->b(ILcom/yandex/metrica/impl/ob/e;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 934
    :cond_4
    iget v1, p0, Lcom/yandex/metrica/impl/ob/jc$c$e$a$b;->d:I

    if-eq v1, v3, :cond_5

    const/4 v1, 0x3

    .line 935
    iget v2, p0, Lcom/yandex/metrica/impl/ob/jc$c$e$a$b;->d:I

    .line 936
    invoke-static {v1, v2}, Lcom/yandex/metrica/impl/ob/b;->d(II)I

    move-result v1

    add-int/2addr v0, v1

    .line 938
    :cond_5
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/jc$c$e$a$b;->e:Ljava/lang/String;

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    const/4 v1, 0x4

    .line 939
    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/jc$c$e$a$b;->e:Ljava/lang/String;

    .line 940
    invoke-static {v1, v2}, Lcom/yandex/metrica/impl/ob/b;->b(ILjava/lang/String;)I

    move-result v1

    add-int/2addr v0, v1

    .line 942
    :cond_6
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/jc$c$e$a$b;->f:Lcom/yandex/metrica/impl/ob/jc$c$e$a$b$a;

    if-eqz v1, :cond_7

    const/4 v1, 0x5

    .line 943
    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/jc$c$e$a$b;->f:Lcom/yandex/metrica/impl/ob/jc$c$e$a$b$a;

    .line 944
    invoke-static {v1, v2}, Lcom/yandex/metrica/impl/ob/b;->b(ILcom/yandex/metrica/impl/ob/e;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_7
    return v0
.end method

.method public d()Lcom/yandex/metrica/impl/ob/jc$c$e$a$b;
    .locals 1

    .line 873
    invoke-static {}, Lcom/yandex/metrica/impl/ob/jc$a;->d()[Lcom/yandex/metrica/impl/ob/jc$a;

    move-result-object v0

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/jc$c$e$a$b;->b:[Lcom/yandex/metrica/impl/ob/jc$a;

    .line 874
    invoke-static {}, Lcom/yandex/metrica/impl/ob/jc$d;->d()[Lcom/yandex/metrica/impl/ob/jc$d;

    move-result-object v0

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/jc$c$e$a$b;->c:[Lcom/yandex/metrica/impl/ob/jc$d;

    const/4 v0, 0x2

    .line 875
    iput v0, p0, Lcom/yandex/metrica/impl/ob/jc$c$e$a$b;->d:I

    const-string v0, ""

    .line 876
    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/jc$c$e$a$b;->e:Ljava/lang/String;

    const/4 v0, 0x0

    .line 877
    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/jc$c$e$a$b;->f:Lcom/yandex/metrica/impl/ob/jc$c$e$a$b$a;

    const/4 v0, -0x1

    .line 878
    iput v0, p0, Lcom/yandex/metrica/impl/ob/jc$c$e$a$b;->a:I

    return-object p0
.end method
